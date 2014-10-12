package com.amazonaws.services.simpleworkflow.flow.junit.spring;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.rules.MethodRule;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.amazonaws.services.simpleworkflow.flow.junit.WorkflowTestBase;

/**
 * To be used instead of {@link SpringJUnit4ClassRunner} when testing
 * asynchronous code. Requires {@link SpringWorkflowTest} rule (annotated with
 * @Rule) to be present in the tested class.
 * 
 * @author fateev
 */
public class FlowSpringJUnit4ClassRunner extends SpringJUnit4ClassRunner {

    private WorkflowTestBase workflowTestRule;

    private long timeout;

    private Class<? extends Throwable> expectedException;

    public FlowSpringJUnit4ClassRunner(Class<?> clazz) throws InitializationError {
        super(clazz);
    }

    @Override
    protected Object createTest() throws Exception {
        Object testInstance = super.createTest();
        workflowTestRule = null;
        timeout = 0;
        expectedException = null;
        return testInstance;
    }

    @Override
    protected Statement withPotentialTimeout(final FrameworkMethod method, final Object test, Statement next) {
        Test annotation = method.getAnnotation(Test.class);
        long timeout = annotation.timeout();
        if (timeout > 0) {
            long springTimeout = getSpringTimeout(method);
            if (workflowTestRule != null && springTimeout == 0) {
                workflowTestRule.setTestTimeoutActualTimeMilliseconds(timeout);
            }
        }
        return next;
    }

    @Override
    protected List<MethodRule> rules(Object test) {
        List<MethodRule> allRules = super.rules(test);
        List<MethodRule> result = new ArrayList<MethodRule>();
        for (MethodRule methodRule : allRules) {
            // Filter out the SWF rules so that they can be applied separately
            if (!WorkflowTestBase.class.isAssignableFrom(methodRule.getClass())) {
                result.add(methodRule);
            }
        }
        return result;
    }

    @Override
    protected Statement methodInvoker(FrameworkMethod method, Object test) {
        Statement invoker = super.methodInvoker(method, test);

        // Apply the workflow test rule here so that it only wraps the method
        // under test, not @Before/@After
        List<MethodRule> rules = super.rules(test);
        for (MethodRule methodRule : rules) {
            if (WorkflowTestBase.class.isAssignableFrom(methodRule.getClass())) {
                workflowTestRule = (WorkflowTestBase) methodRule;
                workflowTestRule.setFlowTestRunner(true);
                if (timeout > 0) {
                    workflowTestRule.setTestTimeoutActualTimeMilliseconds(timeout);
                }
                if (expectedException != null) {
                    workflowTestRule.setExpectedException(expectedException);
                }
                return workflowTestRule.apply(invoker, method, test);
            }
        }
        return invoker;
    }

    @Override
    protected Statement possiblyExpectingExceptions(FrameworkMethod method, Object test, Statement next) {
        Test annotation = method.getAnnotation(Test.class);
        Class<? extends Throwable> expected = annotation.expected();
        if (expected != Test.None.class) {
            expectedException = expected;
            if (workflowTestRule != null) {
                workflowTestRule.setExpectedException(expectedException);
            }
        }
        return next;
    }
}
