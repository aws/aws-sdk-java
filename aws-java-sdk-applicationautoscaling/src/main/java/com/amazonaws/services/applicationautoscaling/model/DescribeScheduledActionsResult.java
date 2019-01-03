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
package com.amazonaws.services.applicationautoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-autoscaling-2016-02-06/DescribeScheduledActions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeScheduledActionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the scheduled actions.
     * </p>
     */
    private java.util.List<ScheduledAction> scheduledActions;
    /**
     * <p>
     * The token required to get the next set of results. This value is <code>null</code> if there are no more results
     * to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the scheduled actions.
     * </p>
     * 
     * @return Information about the scheduled actions.
     */

    public java.util.List<ScheduledAction> getScheduledActions() {
        return scheduledActions;
    }

    /**
     * <p>
     * Information about the scheduled actions.
     * </p>
     * 
     * @param scheduledActions
     *        Information about the scheduled actions.
     */

    public void setScheduledActions(java.util.Collection<ScheduledAction> scheduledActions) {
        if (scheduledActions == null) {
            this.scheduledActions = null;
            return;
        }

        this.scheduledActions = new java.util.ArrayList<ScheduledAction>(scheduledActions);
    }

    /**
     * <p>
     * Information about the scheduled actions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScheduledActions(java.util.Collection)} or {@link #withScheduledActions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param scheduledActions
     *        Information about the scheduled actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduledActionsResult withScheduledActions(ScheduledAction... scheduledActions) {
        if (this.scheduledActions == null) {
            setScheduledActions(new java.util.ArrayList<ScheduledAction>(scheduledActions.length));
        }
        for (ScheduledAction ele : scheduledActions) {
            this.scheduledActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the scheduled actions.
     * </p>
     * 
     * @param scheduledActions
     *        Information about the scheduled actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduledActionsResult withScheduledActions(java.util.Collection<ScheduledAction> scheduledActions) {
        setScheduledActions(scheduledActions);
        return this;
    }

    /**
     * <p>
     * The token required to get the next set of results. This value is <code>null</code> if there are no more results
     * to return.
     * </p>
     * 
     * @param nextToken
     *        The token required to get the next set of results. This value is <code>null</code> if there are no more
     *        results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token required to get the next set of results. This value is <code>null</code> if there are no more results
     * to return.
     * </p>
     * 
     * @return The token required to get the next set of results. This value is <code>null</code> if there are no more
     *         results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token required to get the next set of results. This value is <code>null</code> if there are no more results
     * to return.
     * </p>
     * 
     * @param nextToken
     *        The token required to get the next set of results. This value is <code>null</code> if there are no more
     *        results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduledActionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getScheduledActions() != null)
            sb.append("ScheduledActions: ").append(getScheduledActions()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeScheduledActionsResult == false)
            return false;
        DescribeScheduledActionsResult other = (DescribeScheduledActionsResult) obj;
        if (other.getScheduledActions() == null ^ this.getScheduledActions() == null)
            return false;
        if (other.getScheduledActions() != null && other.getScheduledActions().equals(this.getScheduledActions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScheduledActions() == null) ? 0 : getScheduledActions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeScheduledActionsResult clone() {
        try {
            return (DescribeScheduledActionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
