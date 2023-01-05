/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.scheduler.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/ListSchedules" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSchedulesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether there are additional results to retrieve. If the value is null, there are no more results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The schedules that match the specified criteria.
     * </p>
     */
    private java.util.List<ScheduleSummary> schedules;

    /**
     * <p>
     * Indicates whether there are additional results to retrieve. If the value is null, there are no more results.
     * </p>
     * 
     * @param nextToken
     *        Indicates whether there are additional results to retrieve. If the value is null, there are no more
     *        results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Indicates whether there are additional results to retrieve. If the value is null, there are no more results.
     * </p>
     * 
     * @return Indicates whether there are additional results to retrieve. If the value is null, there are no more
     *         results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Indicates whether there are additional results to retrieve. If the value is null, there are no more results.
     * </p>
     * 
     * @param nextToken
     *        Indicates whether there are additional results to retrieve. If the value is null, there are no more
     *        results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSchedulesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The schedules that match the specified criteria.
     * </p>
     * 
     * @return The schedules that match the specified criteria.
     */

    public java.util.List<ScheduleSummary> getSchedules() {
        return schedules;
    }

    /**
     * <p>
     * The schedules that match the specified criteria.
     * </p>
     * 
     * @param schedules
     *        The schedules that match the specified criteria.
     */

    public void setSchedules(java.util.Collection<ScheduleSummary> schedules) {
        if (schedules == null) {
            this.schedules = null;
            return;
        }

        this.schedules = new java.util.ArrayList<ScheduleSummary>(schedules);
    }

    /**
     * <p>
     * The schedules that match the specified criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSchedules(java.util.Collection)} or {@link #withSchedules(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param schedules
     *        The schedules that match the specified criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSchedulesResult withSchedules(ScheduleSummary... schedules) {
        if (this.schedules == null) {
            setSchedules(new java.util.ArrayList<ScheduleSummary>(schedules.length));
        }
        for (ScheduleSummary ele : schedules) {
            this.schedules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The schedules that match the specified criteria.
     * </p>
     * 
     * @param schedules
     *        The schedules that match the specified criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSchedulesResult withSchedules(java.util.Collection<ScheduleSummary> schedules) {
        setSchedules(schedules);
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
        if (getSchedules() != null)
            sb.append("Schedules: ").append(getSchedules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSchedulesResult == false)
            return false;
        ListSchedulesResult other = (ListSchedulesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSchedules() == null ^ this.getSchedules() == null)
            return false;
        if (other.getSchedules() != null && other.getSchedules().equals(this.getSchedules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSchedules() == null) ? 0 : getSchedules().hashCode());
        return hashCode;
    }

    @Override
    public ListSchedulesResult clone() {
        try {
            return (ListSchedulesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
