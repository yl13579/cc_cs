package com.cc_cs.demo.common;

import org.python.core.*;
import org.python.util.PythonInterpreter;

import java.util.Collection;
import java.util.Properties;

public class CallModule {
    static String moduleUrl;

    Collection<String> Returns;
//    int numOfReturns;
//    String query;

    public CallModule(String moduleUrl) {
        CallModule.moduleUrl = moduleUrl;
    }

    public Collection<String> call(String query, int numOfReturns) {
        Properties props = new Properties();
        props.put("python.home", "E:\\Program Files (x86)\\Anaconda"); // set python home
        props.put("python.console.encoding", "UTF-8");
        props.put("python.security.respectJavaAccessibility", "false");
        props.put("python.import.site", "false");

        PySystemState sys = Py.getSystemState();
        sys.path.add("D:\\ChenGe\\Codefiles\\srtp\\TabCS-master\\Hu_TabCS\\keras\\"); //set source code path
        sys.path.add("E:\\Program Files (x86)\\Anaconda\\Lib\\site-packages\\"); //set python path

        Properties preprops = System.getProperties();
        PythonInterpreter.initialize(preprops, props, new String[0]);

        PythonInterpreter interpreter = new PythonInterpreter();
        interpreter.execfile(moduleUrl);
        PyFunction pyFunction = interpreter.get("call_module", PyFunction.class);
        PyObject pyResults = pyFunction.__call__(new PyString(query), new PyInteger(numOfReturns));
        Returns = (Collection<String>) pyResults;
        return Returns;
    }

    public static void main(String[] args) {
        CallModule callModule = new CallModule("D:\\ChenGe\\Codefiles\\srtp\\TabCS-master\\Hu_TabCS\\keras\\module_for_calling.py"); //set source file path
        Collection<String> results = callModule.call("query", 10);
        for (String result : results) {
            System.out.println(result);
        }
    }
}

