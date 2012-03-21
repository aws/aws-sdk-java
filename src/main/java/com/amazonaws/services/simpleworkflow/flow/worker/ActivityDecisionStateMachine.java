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
import com.amazonaws.services.simpleworkflow.model.RequestCancelActivityTaskDecisionAttributes;
import com.amazonaws.services.simpleworkflow.model.ScheduleActivityTaskDecisionAttributes;

class ActivityDecisionStateMachine extends DecisionStateMachineBase {

    private ScheduleActivityTaskDecisionAttributes scheduleAttributes;

    public ActivityDecisionStateMachine(DecisionId id, ScheduleActivityTaskDecisionAttributes scheduleAttributes) {
        super(id);
        this.scheduleAttributes = scheduleAttributes;
    }

    /**
     * Used for unit testing
     */
    ActivityDecisionStateMachine(DecisionId id, ScheduleActivityTaskDecisionAttributes scheduleAttributes, DecisionState state) {
        super(id, state);
        this.scheduleAttributes = scheduleAttributes;
    }

    @Override
    public Decision getDecision() {
        switch (state) {
        case CREATED:
            return createScheduleActivityTaskDecision();
        case CANCELED_AFTER_INITIATED:
            return createRequestCancelActivityTaskDecision();
        default:
            return null;
        }
    }

    @Override
    public void handleDecisionTaskStartedEvent() {
        switch (state) {
        case CANCELED_AFTER_INITIATED:
            stateHistory.add("handleDecisionTaskStartedEvent");
            state = DecisionState.CANCELLATION_DECISION_SENT;
            stateHistory.add(state.toString());
            break;
        default:
            super.handleDecisionTaskStartedEvent();
        }
    }

    @Override
    public void handleCancellationFailureEvent(HistoryEvent event) {
        switch (state) {
        case CANCELLATION_DECISION_SENT:
            stateHistory.add("handleCancellationFailureEvent");
            state = DecisionState.INITIATED;
            stateHistory.add(state.toString());
            break;
        default:
            super.handleCancellationFailureEvent(event);
        }
    }

    private Decision createRequestCancelActivityTaskDecision() {
        RequestCancelActivityTaskDecisionAttributes tryCancel = new RequestCancelActivityTaskDecisionAttributes();
        tryCancel.setActivityId(scheduleAttributes.getActivityId());
        Decision decision = new Decision();
        decision.setRequestCancelActivityTaskDecisionAttributes(tryCancel);
        decision.setDecisionType(DecisionType.RequestCancelActivityTask.toString());
        return decision;
    }

    private Decision createScheduleActivityTaskDecision() {
        Decision decision = new Decision();
        decision.setScheduleActivityTaskDecisionAttributes(scheduleAttributes);
        decision.setDecisionType(DecisionType.ScheduleActivityTask.toString());
        return decision;
    }

}
