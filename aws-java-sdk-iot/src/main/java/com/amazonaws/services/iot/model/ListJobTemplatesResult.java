/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListJobTemplatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of objects that contain information about the job templates.
     * </p>
     */
    private java.util.List<JobTemplateSummary> jobTemplates;
    /**
     * <p>
     * The token for the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of objects that contain information about the job templates.
     * </p>
     * 
     * @return A list of objects that contain information about the job templates.
     */

    public java.util.List<JobTemplateSummary> getJobTemplates() {
        return jobTemplates;
    }

    /**
     * <p>
     * A list of objects that contain information about the job templates.
     * </p>
     * 
     * @param jobTemplates
     *        A list of objects that contain information about the job templates.
     */

    public void setJobTemplates(java.util.Collection<JobTemplateSummary> jobTemplates) {
        if (jobTemplates == null) {
            this.jobTemplates = null;
            return;
        }

        this.jobTemplates = new java.util.ArrayList<JobTemplateSummary>(jobTemplates);
    }

    /**
     * <p>
     * A list of objects that contain information about the job templates.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobTemplates(java.util.Collection)} or {@link #withJobTemplates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param jobTemplates
     *        A list of objects that contain information about the job templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobTemplatesResult withJobTemplates(JobTemplateSummary... jobTemplates) {
        if (this.jobTemplates == null) {
            setJobTemplates(new java.util.ArrayList<JobTemplateSummary>(jobTemplates.length));
        }
        for (JobTemplateSummary ele : jobTemplates) {
            this.jobTemplates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects that contain information about the job templates.
     * </p>
     * 
     * @param jobTemplates
     *        A list of objects that contain information about the job templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobTemplatesResult withJobTemplates(java.util.Collection<JobTemplateSummary> jobTemplates) {
        setJobTemplates(jobTemplates);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or <b>null</b> if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     * 
     * @return The token for the next set of results, or <b>null</b> if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or <b>null</b> if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobTemplatesResult withNextToken(String nextToken) {
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
        if (getJobTemplates() != null)
            sb.append("JobTemplates: ").append(getJobTemplates()).append(",");
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

        if (obj instanceof ListJobTemplatesResult == false)
            return false;
        ListJobTemplatesResult other = (ListJobTemplatesResult) obj;
        if (other.getJobTemplates() == null ^ this.getJobTemplates() == null)
            return false;
        if (other.getJobTemplates() != null && other.getJobTemplates().equals(this.getJobTemplates()) == false)
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

        hashCode = prime * hashCode + ((getJobTemplates() == null) ? 0 : getJobTemplates().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListJobTemplatesResult clone() {
        try {
            return (ListJobTemplatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
