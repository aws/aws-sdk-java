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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/ListJobTemplates" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListJobTemplatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** List of Job templates. */
    private java.util.List<JobTemplate> jobTemplates;
    /** Use this string to request the next batch of job templates. */
    private String nextToken;

    /**
     * List of Job templates.
     * 
     * @return List of Job templates.
     */

    public java.util.List<JobTemplate> getJobTemplates() {
        return jobTemplates;
    }

    /**
     * List of Job templates.
     * 
     * @param jobTemplates
     *        List of Job templates.
     */

    public void setJobTemplates(java.util.Collection<JobTemplate> jobTemplates) {
        if (jobTemplates == null) {
            this.jobTemplates = null;
            return;
        }

        this.jobTemplates = new java.util.ArrayList<JobTemplate>(jobTemplates);
    }

    /**
     * List of Job templates.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobTemplates(java.util.Collection)} or {@link #withJobTemplates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param jobTemplates
     *        List of Job templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobTemplatesResult withJobTemplates(JobTemplate... jobTemplates) {
        if (this.jobTemplates == null) {
            setJobTemplates(new java.util.ArrayList<JobTemplate>(jobTemplates.length));
        }
        for (JobTemplate ele : jobTemplates) {
            this.jobTemplates.add(ele);
        }
        return this;
    }

    /**
     * List of Job templates.
     * 
     * @param jobTemplates
     *        List of Job templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobTemplatesResult withJobTemplates(java.util.Collection<JobTemplate> jobTemplates) {
        setJobTemplates(jobTemplates);
        return this;
    }

    /**
     * Use this string to request the next batch of job templates.
     * 
     * @param nextToken
     *        Use this string to request the next batch of job templates.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Use this string to request the next batch of job templates.
     * 
     * @return Use this string to request the next batch of job templates.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * Use this string to request the next batch of job templates.
     * 
     * @param nextToken
     *        Use this string to request the next batch of job templates.
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
