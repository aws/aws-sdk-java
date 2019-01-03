/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * Placeholder documentation for DescribeScheduleResponse
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeSchedule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeScheduleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** The next token; for use in pagination. */
    private String nextToken;
    /** The list of actions in the schedule. */
    private java.util.List<ScheduleAction> scheduleActions;

    /**
     * The next token; for use in pagination.
     * 
     * @param nextToken
     *        The next token; for use in pagination.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * The next token; for use in pagination.
     * 
     * @return The next token; for use in pagination.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * The next token; for use in pagination.
     * 
     * @param nextToken
     *        The next token; for use in pagination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduleResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * The list of actions in the schedule.
     * 
     * @return The list of actions in the schedule.
     */

    public java.util.List<ScheduleAction> getScheduleActions() {
        return scheduleActions;
    }

    /**
     * The list of actions in the schedule.
     * 
     * @param scheduleActions
     *        The list of actions in the schedule.
     */

    public void setScheduleActions(java.util.Collection<ScheduleAction> scheduleActions) {
        if (scheduleActions == null) {
            this.scheduleActions = null;
            return;
        }

        this.scheduleActions = new java.util.ArrayList<ScheduleAction>(scheduleActions);
    }

    /**
     * The list of actions in the schedule.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScheduleActions(java.util.Collection)} or {@link #withScheduleActions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param scheduleActions
     *        The list of actions in the schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduleResult withScheduleActions(ScheduleAction... scheduleActions) {
        if (this.scheduleActions == null) {
            setScheduleActions(new java.util.ArrayList<ScheduleAction>(scheduleActions.length));
        }
        for (ScheduleAction ele : scheduleActions) {
            this.scheduleActions.add(ele);
        }
        return this;
    }

    /**
     * The list of actions in the schedule.
     * 
     * @param scheduleActions
     *        The list of actions in the schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduleResult withScheduleActions(java.util.Collection<ScheduleAction> scheduleActions) {
        setScheduleActions(scheduleActions);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getScheduleActions() != null)
            sb.append("ScheduleActions: ").append(getScheduleActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeScheduleResult == false)
            return false;
        DescribeScheduleResult other = (DescribeScheduleResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getScheduleActions() == null ^ this.getScheduleActions() == null)
            return false;
        if (other.getScheduleActions() != null && other.getScheduleActions().equals(this.getScheduleActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getScheduleActions() == null) ? 0 : getScheduleActions().hashCode());
        return hashCode;
    }

    @Override
    public DescribeScheduleResult clone() {
        try {
            return (DescribeScheduleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
