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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeScheduledActions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeScheduledActionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The scheduled actions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ScheduledUpdateGroupAction> scheduledUpdateGroupActions;
    /**
     * <p>
     * A string that indicates that the response contains more items than can be returned in a single response. To
     * receive additional items, specify this string for the <code>NextToken</code> value when requesting the next set
     * of items. This value is null when there are no more items to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The scheduled actions.
     * </p>
     * 
     * @return The scheduled actions.
     */

    public java.util.List<ScheduledUpdateGroupAction> getScheduledUpdateGroupActions() {
        if (scheduledUpdateGroupActions == null) {
            scheduledUpdateGroupActions = new com.amazonaws.internal.SdkInternalList<ScheduledUpdateGroupAction>();
        }
        return scheduledUpdateGroupActions;
    }

    /**
     * <p>
     * The scheduled actions.
     * </p>
     * 
     * @param scheduledUpdateGroupActions
     *        The scheduled actions.
     */

    public void setScheduledUpdateGroupActions(java.util.Collection<ScheduledUpdateGroupAction> scheduledUpdateGroupActions) {
        if (scheduledUpdateGroupActions == null) {
            this.scheduledUpdateGroupActions = null;
            return;
        }

        this.scheduledUpdateGroupActions = new com.amazonaws.internal.SdkInternalList<ScheduledUpdateGroupAction>(scheduledUpdateGroupActions);
    }

    /**
     * <p>
     * The scheduled actions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScheduledUpdateGroupActions(java.util.Collection)} or
     * {@link #withScheduledUpdateGroupActions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param scheduledUpdateGroupActions
     *        The scheduled actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduledActionsResult withScheduledUpdateGroupActions(ScheduledUpdateGroupAction... scheduledUpdateGroupActions) {
        if (this.scheduledUpdateGroupActions == null) {
            setScheduledUpdateGroupActions(new com.amazonaws.internal.SdkInternalList<ScheduledUpdateGroupAction>(scheduledUpdateGroupActions.length));
        }
        for (ScheduledUpdateGroupAction ele : scheduledUpdateGroupActions) {
            this.scheduledUpdateGroupActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The scheduled actions.
     * </p>
     * 
     * @param scheduledUpdateGroupActions
     *        The scheduled actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeScheduledActionsResult withScheduledUpdateGroupActions(java.util.Collection<ScheduledUpdateGroupAction> scheduledUpdateGroupActions) {
        setScheduledUpdateGroupActions(scheduledUpdateGroupActions);
        return this;
    }

    /**
     * <p>
     * A string that indicates that the response contains more items than can be returned in a single response. To
     * receive additional items, specify this string for the <code>NextToken</code> value when requesting the next set
     * of items. This value is null when there are no more items to return.
     * </p>
     * 
     * @param nextToken
     *        A string that indicates that the response contains more items than can be returned in a single response.
     *        To receive additional items, specify this string for the <code>NextToken</code> value when requesting the
     *        next set of items. This value is null when there are no more items to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string that indicates that the response contains more items than can be returned in a single response. To
     * receive additional items, specify this string for the <code>NextToken</code> value when requesting the next set
     * of items. This value is null when there are no more items to return.
     * </p>
     * 
     * @return A string that indicates that the response contains more items than can be returned in a single response.
     *         To receive additional items, specify this string for the <code>NextToken</code> value when requesting the
     *         next set of items. This value is null when there are no more items to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A string that indicates that the response contains more items than can be returned in a single response. To
     * receive additional items, specify this string for the <code>NextToken</code> value when requesting the next set
     * of items. This value is null when there are no more items to return.
     * </p>
     * 
     * @param nextToken
     *        A string that indicates that the response contains more items than can be returned in a single response.
     *        To receive additional items, specify this string for the <code>NextToken</code> value when requesting the
     *        next set of items. This value is null when there are no more items to return.
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
        if (getScheduledUpdateGroupActions() != null)
            sb.append("ScheduledUpdateGroupActions: ").append(getScheduledUpdateGroupActions()).append(",");
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
        if (other.getScheduledUpdateGroupActions() == null ^ this.getScheduledUpdateGroupActions() == null)
            return false;
        if (other.getScheduledUpdateGroupActions() != null && other.getScheduledUpdateGroupActions().equals(this.getScheduledUpdateGroupActions()) == false)
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

        hashCode = prime * hashCode + ((getScheduledUpdateGroupActions() == null) ? 0 : getScheduledUpdateGroupActions().hashCode());
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
