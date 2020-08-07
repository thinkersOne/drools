package com.li.drools.example.personDslr;

import com.li.drools.model.Person;
import org.kie.api.io.Resource;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieSession;
import org.kie.internal.io.ResourceFactory;
import org.kie.internal.utils.KieHelper;

public class PersonDslrTest {

    public static void main(String[] args) {
        Resource dsl = ResourceFactory.newClassPathResource("com.li.drools/example/PersonDSL.dsl");
        Resource dslr = ResourceFactory.newClassPathResource("com.li.drools/example/PersonDslr.dslr");
        KieHelper helper = new KieHelper();
        helper.addResource(dsl, ResourceType.DSL);
        helper.addResource(dslr,ResourceType.DSLR);
        KieSession session = helper.build().newKieSession();
        Person person = new Person();
        person.setAge(30);
        person.setName("stilton");
        session.insert(person);
        int count = session.fireAllRules();
        System.out.println("共执行了："+count+"条规则。");
        System.out.println(person.getPost()+","+person.getName()+","+person.getAge());
        session.dispose();
    }

}
