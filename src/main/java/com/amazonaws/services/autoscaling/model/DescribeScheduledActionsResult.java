/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;


/**
 * <p>
 * A scaling action that is scheduled for a future time and date. An action can be scheduled up to thirty days in advance.
 * </p>
 * <p>
 * Starting with API version 2011-01-01, you can use <code>recurrence</code> to specify that a scaling action occurs regularly on a schedule.
 * </p>
 */
public class DescribeScheduledActionsResult implements Serializable {

    /**
     * A list of scheduled actions designed to update an Auto Scaling group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ScheduledUpdateGroupAction> scheduledUpdateGroupActions;

    /**
     * A string that marks the start of the next batch of returned results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String nextToken;

    /**
     * A list of scheduled actions designed to update an Auto Scaling group.
     *
     * @return A list of scheduled actions designed to update an Auto Scaling group.
     */
    public java.util.List<ScheduledUpdateGroupAction> getScheduledUpdateGroupActions() {
        if (scheduledUpdateGroupActions == null) {
              scheduledUpdateGroupActions = new com.amazonaws.internal.ListWithAutoConstructFlag<ScheduledUpdateGroupAction>();
              scheduledUpdateGroupActions.setAutoConstruct(true);
        }
        return scheduledUpdateGroupActions;
    }
    
    /**
     * A list of scheduled actions designed to update an Auto Scaling group.
     *
     * @param scheduledUpdateGroupActions A list of scheduled actions designed to update an Auto Scaling group.
     */
    public void setScheduledUpdateGroupActions(java.util.Collection<ScheduledUpdateGroupAction> scheduledUpdateGroupActions) {
        if (scheduledUpdateGroupActions == null) {
            this.scheduledUpdateGroupActions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ScheduledUpdateGroupAction> scheduledUpdateGroupActionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ScheduledUpdateGroupAction>(scheduledUpdateGroupActions.size());
        scheduledUpdateGroupActionsCopy.addAll(scheduledUpdateGroupActions);
        this.scheduledUpdateGroupActions = scheduledUpdateGroupActionsCopy;
    }
    
    /**
     * A list of scheduled actions designed to update an Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scheduledUpdateGroupActions A list of scheduled actions designed to update an Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeScheduledActionsResult withScheduledUpdateGroupActions(ScheduledUpdateGroupAction... scheduledUpdateGroupActions) {
        if (getScheduledUpdateGroupActions() == null) setScheduledUpdateGroupActions(new java.util.ArrayList<ScheduledUpdateGroupAction>(scheduledUpdateGroupActions.length));
        for (ScheduledUpdateGroupAction value : scheduledUpdateGroupActions) {
            getScheduledUpdateGroupActions().add(value);
        }
        return this;
    }
    
    /**
     * A list of scheduled actions designed to update an Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scheduledUpdateGroupActions A list of scheduled actions designed to update an Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeScheduledActionsResult withScheduledUpdateGroupActions(java.util.Collection<ScheduledUpdateGroupAction> scheduledUpdateGroupActions) {
        if (scheduledUpdateGroupActions == null) {
            this.scheduledUpdateGroupActions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ScheduledUpdateGroupAction> scheduledUpdateGroupActionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ScheduledUpdateGroupAction>(scheduledUpdateGroupActions.size());
            scheduledUpdateGroupActionsCopy.addAll(scheduledUpdateGroupActions);
            this.scheduledUpdateGroupActions = scheduledUpdateGroupActionsCopy;
        }

        return this;
    }

    /**
     * A string that marks the start of the next batch of returned results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return A string that marks the start of the next batch of returned results.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * A string that marks the start of the next batch of returned results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param nextToken A string that marks the start of the next batch of returned results.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * A string that marks the start of the next batch of returned results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param nextToken A string that marks the start of the next batch of returned results.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeScheduledActionsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getScheduledUpdateGroupActions() != null) sb.append("ScheduledUpdateGroupActions: " + getScheduledUpdateGroupActions() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getScheduledUpdateGroupActions() == null) ? 0 : getScheduledUpdateGroupActions().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeScheduledActionsResult == false) return false;
        DescribeScheduledActionsResult other = (DescribeScheduledActionsResult)obj;
        
        if (other.getScheduledUpdateGroupActions() == null ^ this.getScheduledUpdateGroupActions() == null) return false;
        if (other.getScheduledUpdateGroupActions() != null && other.getScheduledUpdateGroupActions().equals(this.getScheduledUpdateGroupActions()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    