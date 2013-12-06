package com.zophr.bugs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:META-INF/context.xml" })
public class BugTest {

    @Autowired
    private Bean bean;

    @Test
    public void test() {
        assertEquals("test-project", bean.getName());
    }

}
