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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/ListScheduleGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListScheduleGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether there are additional results to retrieve. If the value is null, there are no more results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The schedule groups that match the specified criteria.
     * </p>
     */
    private java.util.List<ScheduleGroupSummary> scheduleGroups;

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

    public ListScheduleGroupsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The schedule groups that match the specified criteria.
     * </p>
     * 
     * @return The schedule groups that match the specified criteria.
     */

    public java.util.List<ScheduleGroupSummary> getScheduleGroups() {
        return scheduleGroups;
    }

    /**
     * <p>
     * The schedule groups that match the specified criteria.
     * </p>
     * 
     * @param scheduleGroups
     *        The schedule groups that match the specified criteria.
     */

    public void setScheduleGroups(java.util.Collection<ScheduleGroupSummary> scheduleGroups) {
        if (scheduleGroups == null) {
            this.scheduleGroups = null;
            return;
        }

        this.scheduleGroups = new java.util.ArrayList<ScheduleGroupSummary>(scheduleGroups);
    }

    /**
     * <p>
     * The schedule groups that match the specified criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScheduleGroups(java.util.Collection)} or {@link #withScheduleGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param scheduleGroups
     *        The schedule groups that match the specified criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScheduleGroupsResult withScheduleGroups(ScheduleGroupSummary... scheduleGroups) {
        if (this.scheduleGroups == null) {
            setScheduleGroups(new java.util.ArrayList<ScheduleGroupSummary>(scheduleGroups.length));
        }
        for (ScheduleGroupSummary ele : scheduleGroups) {
            this.scheduleGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The schedule groups that match the specified criteria.
     * </p>
     * 
     * @param scheduleGroups
     *        The schedule groups that match the specified criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScheduleGroupsResult withScheduleGroups(java.util.Collection<ScheduleGroupSummary> scheduleGroups) {
        setScheduleGroups(scheduleGroups);
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
        if (getScheduleGroups() != null)
            sb.append("ScheduleGroups: ").append(getScheduleGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListScheduleGroupsResult == false)
            return false;
        ListScheduleGroupsResult other = (ListScheduleGroupsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getScheduleGroups() == null ^ this.getScheduleGroups() == null)
            return false;
        if (other.getScheduleGroups() != null && other.getScheduleGroups().equals(this.getScheduleGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getScheduleGroups() == null) ? 0 : getScheduleGroups().hashCode());
        return hashCode;
    }

    @Override
    public ListScheduleGroupsResult clone() {
        try {
            return (ListScheduleGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
