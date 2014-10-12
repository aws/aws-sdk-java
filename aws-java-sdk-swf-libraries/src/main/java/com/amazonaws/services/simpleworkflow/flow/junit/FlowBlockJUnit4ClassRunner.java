package com.amazonaws.services.simpleworkflow.flow.junit;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.rules.MethodRule;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;

/**
 * To be used instead of {@link BlockJUnit4ClassRunner} when testing
 * asynchronous code. Requires {@link WorkflowTest} rule (annotated with @Rule)
 * to be present in the tested class.
 * 
 * @author fateev
 */
public class FlowBlockJUnit4ClassRunner extends BlockJUnit4ClassRunner {

    private WorkflowTestBase workflowTestRule;

    private long timeout;

    private Class<? extends Throwable> expectedException;

    public FlowBlockJUnit4ClassRunner(Class<?> klass) throws InitializationError {
        super(klass);
    }

    @Override
    protected Statement withPotentialTimeout(FrameworkMethod method, final Object test, Statement next) {
        Test annotation = method.getAnnotation(Test.class);
        timeout = annotation.timeout();
        if (timeout > 0 && workflowTestRule != null) {
            workflowTestRule.setTestTimeoutActualTimeMilliseconds(timeout);
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
