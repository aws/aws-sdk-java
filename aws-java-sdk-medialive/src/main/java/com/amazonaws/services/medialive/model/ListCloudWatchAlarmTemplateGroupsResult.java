/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Placeholder documentation for ListCloudWatchAlarmTemplateGroupsResponse
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListCloudWatchAlarmTemplateGroups"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCloudWatchAlarmTemplateGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    private java.util.List<CloudWatchAlarmTemplateGroupSummary> cloudWatchAlarmTemplateGroups;
    /** A token used to retrieve the next set of results in paginated list responses. */
    private String nextToken;

    /**
     * @return
     */

    public java.util.List<CloudWatchAlarmTemplateGroupSummary> getCloudWatchAlarmTemplateGroups() {
        return cloudWatchAlarmTemplateGroups;
    }

    /**
     * @param cloudWatchAlarmTemplateGroups
     */

    public void setCloudWatchAlarmTemplateGroups(java.util.Collection<CloudWatchAlarmTemplateGroupSummary> cloudWatchAlarmTemplateGroups) {
        if (cloudWatchAlarmTemplateGroups == null) {
            this.cloudWatchAlarmTemplateGroups = null;
            return;
        }

        this.cloudWatchAlarmTemplateGroups = new java.util.ArrayList<CloudWatchAlarmTemplateGroupSummary>(cloudWatchAlarmTemplateGroups);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCloudWatchAlarmTemplateGroups(java.util.Collection)} or
     * {@link #withCloudWatchAlarmTemplateGroups(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param cloudWatchAlarmTemplateGroups
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCloudWatchAlarmTemplateGroupsResult withCloudWatchAlarmTemplateGroups(CloudWatchAlarmTemplateGroupSummary... cloudWatchAlarmTemplateGroups) {
        if (this.cloudWatchAlarmTemplateGroups == null) {
            setCloudWatchAlarmTemplateGroups(new java.util.ArrayList<CloudWatchAlarmTemplateGroupSummary>(cloudWatchAlarmTemplateGroups.length));
        }
        for (CloudWatchAlarmTemplateGroupSummary ele : cloudWatchAlarmTemplateGroups) {
            this.cloudWatchAlarmTemplateGroups.add(ele);
        }
        return this;
    }

    /**
     * @param cloudWatchAlarmTemplateGroups
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCloudWatchAlarmTemplateGroupsResult withCloudWatchAlarmTemplateGroups(
            java.util.Collection<CloudWatchAlarmTemplateGroupSummary> cloudWatchAlarmTemplateGroups) {
        setCloudWatchAlarmTemplateGroups(cloudWatchAlarmTemplateGroups);
        return this;
    }

    /**
     * A token used to retrieve the next set of results in paginated list responses.
     * 
     * @param nextToken
     *        A token used to retrieve the next set of results in paginated list responses.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * A token used to retrieve the next set of results in paginated list responses.
     * 
     * @return A token used to retrieve the next set of results in paginated list responses.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * A token used to retrieve the next set of results in paginated list responses.
     * 
     * @param nextToken
     *        A token used to retrieve the next set of results in paginated list responses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCloudWatchAlarmTemplateGroupsResult withNextToken(String nextToken) {
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
        if (getCloudWatchAlarmTemplateGroups() != null)
            sb.append("CloudWatchAlarmTemplateGroups: ").append(getCloudWatchAlarmTemplateGroups()).append(",");
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

        if (obj instanceof ListCloudWatchAlarmTemplateGroupsResult == false)
            return false;
        ListCloudWatchAlarmTemplateGroupsResult other = (ListCloudWatchAlarmTemplateGroupsResult) obj;
        if (other.getCloudWatchAlarmTemplateGroups() == null ^ this.getCloudWatchAlarmTemplateGroups() == null)
            return false;
        if (other.getCloudWatchAlarmTemplateGroups() != null
                && other.getCloudWatchAlarmTemplateGroups().equals(this.getCloudWatchAlarmTemplateGroups()) == false)
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

        hashCode = prime * hashCode + ((getCloudWatchAlarmTemplateGroups() == null) ? 0 : getCloudWatchAlarmTemplateGroups().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCloudWatchAlarmTemplateGroupsResult clone() {
        try {
            return (ListCloudWatchAlarmTemplateGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
