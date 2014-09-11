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

import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.services.simpleworkflow.flow.common.WorkflowExecutionUtils;
import com.amazonaws.services.simpleworkflow.model.DecisionTask;
import com.amazonaws.services.simpleworkflow.model.EventType;
import com.amazonaws.services.simpleworkflow.model.HistoryEvent;

class HistoryHelper {

    private static final Log historyLog = LogFactory.getLog(HistoryHelper.class.getName() + ".history");

    class EventsIterator implements Iterator<HistoryEvent> {

        private final Iterator<DecisionTask> decisionTasks;

        private DecisionTask decisionTask;

        private List<HistoryEvent> events;

        private int index;

        public EventsIterator(Iterator<DecisionTask> decisionTasks) {
            this.decisionTasks = decisionTasks;
            if (decisionTasks.hasNext()) {
                decisionTask = decisionTasks.next();
                events = decisionTask.getEvents();
                if (historyLog.isTraceEnabled()) {
                    historyLog.trace(WorkflowExecutionUtils.prettyPrintHistory(events, true));
                }
            }
            else {
                decisionTask = null;
            }
        }

        @Override
        public boolean hasNext() {
            return decisionTask != null && (index < events.size() || decisionTasks.hasNext());
        }

        @Override
        public HistoryEvent next() {
            if (index == events.size()) {
                decisionTask = decisionTasks.next();
                events = decisionTask.getEvents();
                if (historyLog.isTraceEnabled()) {
                    historyLog.trace(WorkflowExecutionUtils.prettyPrintHistory(events, true));
                }
                index = 0;
            }
            return events.get(index++);
        }

        public DecisionTask getDecisionTask() {
            return decisionTask;
        }

        public List<HistoryEvent> getEvents() {
            return events;
        }

        public boolean isNextDecisionTimedOut() {
            int i = index;
            while (true) {
                for (; i < events.size(); i++) {
                    HistoryEvent event = events.get(i);
                    EventType eventType = EventType.fromValue(event.getEventType());
                    if (eventType.equals(EventType.DecisionTaskTimedOut)) {
                        return true;
                    }
                    else if (eventType.equals(EventType.DecisionTaskCompleted)) {
                        return false;
                    }
                }
                if (!decisionTasks.hasNext()) {
                    return false;
                }
                decisionTask = decisionTasks.next();
                List<HistoryEvent> nextPageEvents = decisionTask.getEvents();
                if (historyLog.isTraceEnabled()) {
                    historyLog.trace(WorkflowExecutionUtils.prettyPrintHistory(nextPageEvents, true));
                }
                events.addAll(nextPageEvents);
            }
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

    }

    private final EventsIterator events;

    public HistoryHelper(Iterator<DecisionTask> decisionTasks) {
        this.events = new EventsIterator(decisionTasks);
    }

    public EventsIterator getEvents() {
        return events;
    }

    public String toString() {
        return WorkflowExecutionUtils.prettyPrintHistory(events.getEvents(), true);
    }

    public DecisionTask getDecisionTask() {
        return events.getDecisionTask();
    }

    public long getLastNonReplayEventId() {
        Long result = getDecisionTask().getPreviousStartedEventId();
        if (result == null) {
            return 0;
        }
        return result;
    }
}
