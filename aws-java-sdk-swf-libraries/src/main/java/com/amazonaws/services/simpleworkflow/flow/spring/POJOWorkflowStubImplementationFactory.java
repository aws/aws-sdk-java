package com.amazonaws.services.simpleworkflow.flow.spring;

import com.amazonaws.services.simpleworkflow.flow.DecisionContext;
import com.amazonaws.services.simpleworkflow.flow.pojo.POJOWorkflowImplementationFactory;
import com.amazonaws.services.simpleworkflow.flow.spring.WorkflowScope;

/**
 * A stub implementation of the @see{POJOWorkflowImplementationFactory}
 * Used for Spring injection proxying
 *
 * @author nicholasterry
 */
public class POJOWorkflowStubImplementationFactory implements POJOWorkflowImplementationFactory {

    private Object instanceProxy;

    public POJOWorkflowStubImplementationFactory(Object instanceProxy) {
        this.instanceProxy = instanceProxy;
    }

    @Override
    public Object newInstance(DecisionContext decisionContext) throws Exception {
        return newInstance(decisionContext, null);
    }

    @Override
    public Object newInstance(DecisionContext decisionContext, Object[] constructorArgs) throws Exception {
        WorkflowScope.setDecisionContext(decisionContext);
        return instanceProxy;
    }

    @Override
    public void deleteInstance(Object instance) {
        WorkflowScope.removeDecisionContext();
    }
}
