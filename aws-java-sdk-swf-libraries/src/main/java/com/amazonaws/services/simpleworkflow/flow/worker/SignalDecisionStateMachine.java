/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.flow.worker;

import com.amazonaws.services.simpleworkflow.model.Decision;
import com.amazonaws.services.simpleworkflow.model.DecisionType;
import com.amazonaws.services.simpleworkflow.model.HistoryEvent;
import com.amazonaws.services.simpleworkflow.model.SignalExternalWorkflowExecutionDecisionAttributes;

class SignalDecisionStateMachine extends DecisionStateMachineBase {

    private SignalExternalWorkflowExecutionDecisionAttributes attributes;
    
    private boolean canceled;

    public SignalDecisionStateMachine(DecisionId id, SignalExternalWorkflowExecutionDecisionAttributes attributes) {
        super(id);
        this.attributes = attributes;
    }

    /**
     * Used for unit testing
     */
    SignalDecisionStateMachine(DecisionId id, SignalExternalWorkflowExecutionDecisionAttributes attributes, DecisionState state) {
        super(id, state);
        this.attributes = attributes;
    }
    
    @Override
    public Decision getDecision() {
        switch (state) {
        case CREATED:
            return createSignalExternalWorkflowExecutionDecision();
        default:
            return null;
        }
    }

    @Override
    public boolean isDone() {
        return state == DecisionState.COMPLETED || canceled;
    }

    @Override
    public void handleDecisionTaskStartedEvent() {
        switch (state) {
        case CREATED:
            stateHistory.add("handleDecisionTaskStartedEvent");
            state = DecisionState.DECISION_SENT;
            stateHistory.add(state.toString());
            break;
        }
    }

    @Override
    public void cancel(Runnable immediateCancellationCallback) {
        stateHistory.add("cancel");
        switch (state) {
        case CREATED:
        case INITIATED:
            state = DecisionState.COMPLETED;
            if (immediateCancellationCallback != null) {
                immediateCancellationCallback.run();
            }
            break;
        case DECISION_SENT:
            state = DecisionState.CANCELED_BEFORE_INITIATED;
            if (immediateCancellationCallback != null) {
                immediateCancellationCallback.run();
            }
            break;
        default:
            failStateTransition();
        }
        canceled = true;
        stateHistory.add(state.toString());
    }

    @Override
    public void handleInitiatedEvent(HistoryEvent event) {
        stateHistory.add("handleInitiatedEvent");
        switch (state) {
        case DECISION_SENT:
            state = DecisionState.INITIATED;
            break;
        case CANCELED_BEFORE_INITIATED:
            // No state change
            break;
        default:
            failStateTransition();
        }
        stateHistory.add(state.toString());

    }

    @Override
    public void handleInitiationFailedEvent(HistoryEvent event) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void handleStartedEvent(HistoryEvent event) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void handleCompletionEvent() {
        stateHistory.add("handleCompletionEvent");
        switch (state) {
        case DECISION_SENT:
        case INITIATED:
        case CANCELED_BEFORE_INITIATED:
            state = DecisionState.COMPLETED;
            break;
        case COMPLETED:
            // No state change
            break;
        default:
            failStateTransition();
        }
        stateHistory.add(state.toString());
    }

    @Override
    public void handleCancellationInitiatedEvent() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void handleCancellationFailureEvent(HistoryEvent event) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void handleCancellationEvent() {
        throw new UnsupportedOperationException();
    }

    private Decision createSignalExternalWorkflowExecutionDecision() {
        Decision decision = new Decision();
        decision.setSignalExternalWorkflowExecutionDecisionAttributes(attributes);
        decision.setDecisionType(DecisionType.SignalExternalWorkflowExecution.toString());
        return decision;
    }

}
