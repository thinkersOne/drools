package com.li.drools.example;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class HelloTest {

    public static void main(String[] args) {
        //kmodule方式连接
        KieContainer kc = KieServices.Factory.get().getKieClasspathContainer();
        KieSession ks = kc.newKieSession("helloKS");
        ks.fireAllRules();
        ks.dispose();
    }


}
