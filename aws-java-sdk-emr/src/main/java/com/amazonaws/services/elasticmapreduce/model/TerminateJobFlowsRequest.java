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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Input to the <a>TerminateJobFlows</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/TerminateJobFlows" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TerminateJobFlowsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of job flows to be shutdown.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> jobFlowIds;

    /**
     * Default constructor for TerminateJobFlowsRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public TerminateJobFlowsRequest() {
    }

    /**
     * Constructs a new TerminateJobFlowsRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param jobFlowIds
     *        A list of job flows to be shutdown.
     */
    public TerminateJobFlowsRequest(java.util.List<String> jobFlowIds) {
        setJobFlowIds(jobFlowIds);
    }

    /**
     * <p>
     * A list of job flows to be shutdown.
     * </p>
     * 
     * @return A list of job flows to be shutdown.
     */

    public java.util.List<String> getJobFlowIds() {
        if (jobFlowIds == null) {
            jobFlowIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return jobFlowIds;
    }

    /**
     * <p>
     * A list of job flows to be shutdown.
     * </p>
     * 
     * @param jobFlowIds
     *        A list of job flows to be shutdown.
     */

    public void setJobFlowIds(java.util.Collection<String> jobFlowIds) {
        if (jobFlowIds == null) {
            this.jobFlowIds = null;
            return;
        }

        this.jobFlowIds = new com.amazonaws.internal.SdkInternalList<String>(jobFlowIds);
    }

    /**
     * <p>
     * A list of job flows to be shutdown.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobFlowIds(java.util.Collection)} or {@link #withJobFlowIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param jobFlowIds
     *        A list of job flows to be shutdown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateJobFlowsRequest withJobFlowIds(String... jobFlowIds) {
        if (this.jobFlowIds == null) {
            setJobFlowIds(new com.amazonaws.internal.SdkInternalList<String>(jobFlowIds.length));
        }
        for (String ele : jobFlowIds) {
            this.jobFlowIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of job flows to be shutdown.
     * </p>
     * 
     * @param jobFlowIds
     *        A list of job flows to be shutdown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateJobFlowsRequest withJobFlowIds(java.util.Collection<String> jobFlowIds) {
        setJobFlowIds(jobFlowIds);
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
        if (getJobFlowIds() != null)
            sb.append("JobFlowIds: ").append(getJobFlowIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TerminateJobFlowsRequest == false)
            return false;
        TerminateJobFlowsRequest other = (TerminateJobFlowsRequest) obj;
        if (other.getJobFlowIds() == null ^ this.getJobFlowIds() == null)
            return false;
        if (other.getJobFlowIds() != null && other.getJobFlowIds().equals(this.getJobFlowIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobFlowIds() == null) ? 0 : getJobFlowIds().hashCode());
        return hashCode;
    }

    @Override
    public TerminateJobFlowsRequest clone() {
        return (TerminateJobFlowsRequest) super.clone();
    }

}
