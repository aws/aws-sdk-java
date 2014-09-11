package com.amazonaws.services.simpleworkflow.flow.junit.spring;

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
        List<MethodRule> result = super.rules(test);
        for (MethodRule methodRule : result) {
            if (WorkflowTestBase.class.isAssignableFrom(methodRule.getClass())) {
                workflowTestRule = (WorkflowTestBase) methodRule;
                workflowTestRule.setFlowTestRunner(true);
                if (timeout > 0) {
                    workflowTestRule.setTestTimeoutActualTimeMilliseconds(timeout);
                }
                if (expectedException != null) {
                    workflowTestRule.setExpectedException(expectedException);
                }
            }
        }
        return result;
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
