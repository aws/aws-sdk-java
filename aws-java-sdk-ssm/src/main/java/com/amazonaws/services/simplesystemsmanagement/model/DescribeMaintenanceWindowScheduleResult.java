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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindowSchedule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMaintenanceWindowScheduleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about Maintenance Window executions scheduled for the specified time range.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ScheduledWindowExecution> scheduledWindowExecutions;
    /**
     * <p>
     * The token for the next set of items to return. (You use this token in the next call.)
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about Maintenance Window executions scheduled for the specified time range.
     * </p>
     * 
     * @return Information about Maintenance Window executions scheduled for the specified time range.
     */

    public java.util.List<ScheduledWindowExecution> getScheduledWindowExecutions() {
        if (scheduledWindowExecutions == null) {
            scheduledWindowExecutions = new com.amazonaws.internal.SdkInternalList<ScheduledWindowExecution>();
        }
        return scheduledWindowExecutions;
    }

    /**
     * <p>
     * Information about Maintenance Window executions scheduled for the specified time range.
     * </p>
     * 
     * @param scheduledWindowExecutions
     *        Information about Maintenance Window executions scheduled for the specified time range.
     */

    public void setScheduledWindowExecutions(java.util.Collection<ScheduledWindowExecution> scheduledWindowExecutions) {
        if (scheduledWindowExecutions == null) {
            this.scheduledWindowExecutions = null;
            return;
        }

        this.scheduledWindowExecutions = new com.amazonaws.internal.SdkInternalList<ScheduledWindowExecution>(scheduledWindowExecutions);
    }

    /**
     * <p>
     * Information about Maintenance Window executions scheduled for the specified time range.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScheduledWindowExecutions(java.util.Collection)} or
     * {@link #withScheduledWindowExecutions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param scheduledWindowExecutions
     *        Information about Maintenance Window executions scheduled for the specified time range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMaintenanceWindowScheduleResult withScheduledWindowExecutions(ScheduledWindowExecution... scheduledWindowExecutions) {
        if (this.scheduledWindowExecutions == null) {
            setScheduledWindowExecutions(new com.amazonaws.internal.SdkInternalList<ScheduledWindowExecution>(scheduledWindowExecutions.length));
        }
        for (ScheduledWindowExecution ele : scheduledWindowExecutions) {
            this.scheduledWindowExecutions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about Maintenance Window executions scheduled for the specified time range.
     * </p>
     * 
     * @param scheduledWindowExecutions
     *        Information about Maintenance Window executions scheduled for the specified time range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMaintenanceWindowScheduleResult withScheduledWindowExecutions(java.util.Collection<ScheduledWindowExecution> scheduledWindowExecutions) {
        setScheduledWindowExecutions(scheduledWindowExecutions);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You use this token in the next call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You use this token in the next call.)
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You use this token in the next call.)
     * </p>
     * 
     * @return The token for the next set of items to return. (You use this token in the next call.)
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You use this token in the next call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You use this token in the next call.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMaintenanceWindowScheduleResult withNextToken(String nextToken) {
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
        if (getScheduledWindowExecutions() != null)
            sb.append("ScheduledWindowExecutions: ").append(getScheduledWindowExecutions()).append(",");
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

        if (obj instanceof DescribeMaintenanceWindowScheduleResult == false)
            return false;
        DescribeMaintenanceWindowScheduleResult other = (DescribeMaintenanceWindowScheduleResult) obj;
        if (other.getScheduledWindowExecutions() == null ^ this.getScheduledWindowExecutions() == null)
            return false;
        if (other.getScheduledWindowExecutions() != null && other.getScheduledWindowExecutions().equals(this.getScheduledWindowExecutions()) == false)
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

        hashCode = prime * hashCode + ((getScheduledWindowExecutions() == null) ? 0 : getScheduledWindowExecutions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMaintenanceWindowScheduleResult clone() {
        try {
            return (DescribeMaintenanceWindowScheduleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
