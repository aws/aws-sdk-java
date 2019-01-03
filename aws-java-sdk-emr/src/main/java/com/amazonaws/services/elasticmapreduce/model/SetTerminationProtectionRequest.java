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
 * The input argument to the <a>TerminationProtection</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/SetTerminationProtection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetTerminationProtectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of strings that uniquely identify the clusters to protect. This identifier is returned by
     * <a>RunJobFlow</a> and can also be obtained from <a>DescribeJobFlows</a> .
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> jobFlowIds;
    /**
     * <p>
     * A Boolean that indicates whether to protect the cluster and prevent the Amazon EC2 instances in the cluster from
     * shutting down due to API calls, user intervention, or job-flow error.
     * </p>
     */
    private Boolean terminationProtected;

    /**
     * <p>
     * A list of strings that uniquely identify the clusters to protect. This identifier is returned by
     * <a>RunJobFlow</a> and can also be obtained from <a>DescribeJobFlows</a> .
     * </p>
     * 
     * @return A list of strings that uniquely identify the clusters to protect. This identifier is returned by
     *         <a>RunJobFlow</a> and can also be obtained from <a>DescribeJobFlows</a> .
     */

    public java.util.List<String> getJobFlowIds() {
        if (jobFlowIds == null) {
            jobFlowIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return jobFlowIds;
    }

    /**
     * <p>
     * A list of strings that uniquely identify the clusters to protect. This identifier is returned by
     * <a>RunJobFlow</a> and can also be obtained from <a>DescribeJobFlows</a> .
     * </p>
     * 
     * @param jobFlowIds
     *        A list of strings that uniquely identify the clusters to protect. This identifier is returned by
     *        <a>RunJobFlow</a> and can also be obtained from <a>DescribeJobFlows</a> .
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
     * A list of strings that uniquely identify the clusters to protect. This identifier is returned by
     * <a>RunJobFlow</a> and can also be obtained from <a>DescribeJobFlows</a> .
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobFlowIds(java.util.Collection)} or {@link #withJobFlowIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param jobFlowIds
     *        A list of strings that uniquely identify the clusters to protect. This identifier is returned by
     *        <a>RunJobFlow</a> and can also be obtained from <a>DescribeJobFlows</a> .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetTerminationProtectionRequest withJobFlowIds(String... jobFlowIds) {
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
     * A list of strings that uniquely identify the clusters to protect. This identifier is returned by
     * <a>RunJobFlow</a> and can also be obtained from <a>DescribeJobFlows</a> .
     * </p>
     * 
     * @param jobFlowIds
     *        A list of strings that uniquely identify the clusters to protect. This identifier is returned by
     *        <a>RunJobFlow</a> and can also be obtained from <a>DescribeJobFlows</a> .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetTerminationProtectionRequest withJobFlowIds(java.util.Collection<String> jobFlowIds) {
        setJobFlowIds(jobFlowIds);
        return this;
    }

    /**
     * <p>
     * A Boolean that indicates whether to protect the cluster and prevent the Amazon EC2 instances in the cluster from
     * shutting down due to API calls, user intervention, or job-flow error.
     * </p>
     * 
     * @param terminationProtected
     *        A Boolean that indicates whether to protect the cluster and prevent the Amazon EC2 instances in the
     *        cluster from shutting down due to API calls, user intervention, or job-flow error.
     */

    public void setTerminationProtected(Boolean terminationProtected) {
        this.terminationProtected = terminationProtected;
    }

    /**
     * <p>
     * A Boolean that indicates whether to protect the cluster and prevent the Amazon EC2 instances in the cluster from
     * shutting down due to API calls, user intervention, or job-flow error.
     * </p>
     * 
     * @return A Boolean that indicates whether to protect the cluster and prevent the Amazon EC2 instances in the
     *         cluster from shutting down due to API calls, user intervention, or job-flow error.
     */

    public Boolean getTerminationProtected() {
        return this.terminationProtected;
    }

    /**
     * <p>
     * A Boolean that indicates whether to protect the cluster and prevent the Amazon EC2 instances in the cluster from
     * shutting down due to API calls, user intervention, or job-flow error.
     * </p>
     * 
     * @param terminationProtected
     *        A Boolean that indicates whether to protect the cluster and prevent the Amazon EC2 instances in the
     *        cluster from shutting down due to API calls, user intervention, or job-flow error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetTerminationProtectionRequest withTerminationProtected(Boolean terminationProtected) {
        setTerminationProtected(terminationProtected);
        return this;
    }

    /**
     * <p>
     * A Boolean that indicates whether to protect the cluster and prevent the Amazon EC2 instances in the cluster from
     * shutting down due to API calls, user intervention, or job-flow error.
     * </p>
     * 
     * @return A Boolean that indicates whether to protect the cluster and prevent the Amazon EC2 instances in the
     *         cluster from shutting down due to API calls, user intervention, or job-flow error.
     */

    public Boolean isTerminationProtected() {
        return this.terminationProtected;
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
            sb.append("JobFlowIds: ").append(getJobFlowIds()).append(",");
        if (getTerminationProtected() != null)
            sb.append("TerminationProtected: ").append(getTerminationProtected());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetTerminationProtectionRequest == false)
            return false;
        SetTerminationProtectionRequest other = (SetTerminationProtectionRequest) obj;
        if (other.getJobFlowIds() == null ^ this.getJobFlowIds() == null)
            return false;
        if (other.getJobFlowIds() != null && other.getJobFlowIds().equals(this.getJobFlowIds()) == false)
            return false;
        if (other.getTerminationProtected() == null ^ this.getTerminationProtected() == null)
            return false;
        if (other.getTerminationProtected() != null && other.getTerminationProtected().equals(this.getTerminationProtected()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobFlowIds() == null) ? 0 : getJobFlowIds().hashCode());
        hashCode = prime * hashCode + ((getTerminationProtected() == null) ? 0 : getTerminationProtected().hashCode());
        return hashCode;
    }

    @Override
    public SetTerminationProtectionRequest clone() {
        return (SetTerminationProtectionRequest) super.clone();
    }

}
