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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchGetJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of job names, which may be the names returned from the <code>ListJobs</code> operation.
     * </p>
     */
    private java.util.List<String> jobNames;

    /**
     * <p>
     * A list of job names, which may be the names returned from the <code>ListJobs</code> operation.
     * </p>
     * 
     * @return A list of job names, which may be the names returned from the <code>ListJobs</code> operation.
     */

    public java.util.List<String> getJobNames() {
        return jobNames;
    }

    /**
     * <p>
     * A list of job names, which may be the names returned from the <code>ListJobs</code> operation.
     * </p>
     * 
     * @param jobNames
     *        A list of job names, which may be the names returned from the <code>ListJobs</code> operation.
     */

    public void setJobNames(java.util.Collection<String> jobNames) {
        if (jobNames == null) {
            this.jobNames = null;
            return;
        }

        this.jobNames = new java.util.ArrayList<String>(jobNames);
    }

    /**
     * <p>
     * A list of job names, which may be the names returned from the <code>ListJobs</code> operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobNames(java.util.Collection)} or {@link #withJobNames(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param jobNames
     *        A list of job names, which may be the names returned from the <code>ListJobs</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetJobsRequest withJobNames(String... jobNames) {
        if (this.jobNames == null) {
            setJobNames(new java.util.ArrayList<String>(jobNames.length));
        }
        for (String ele : jobNames) {
            this.jobNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of job names, which may be the names returned from the <code>ListJobs</code> operation.
     * </p>
     * 
     * @param jobNames
     *        A list of job names, which may be the names returned from the <code>ListJobs</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetJobsRequest withJobNames(java.util.Collection<String> jobNames) {
        setJobNames(jobNames);
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
        if (getJobNames() != null)
            sb.append("JobNames: ").append(getJobNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetJobsRequest == false)
            return false;
        BatchGetJobsRequest other = (BatchGetJobsRequest) obj;
        if (other.getJobNames() == null ^ this.getJobNames() == null)
            return false;
        if (other.getJobNames() != null && other.getJobNames().equals(this.getJobNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobNames() == null) ? 0 : getJobNames().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetJobsRequest clone() {
        return (BatchGetJobsRequest) super.clone();
    }

}
