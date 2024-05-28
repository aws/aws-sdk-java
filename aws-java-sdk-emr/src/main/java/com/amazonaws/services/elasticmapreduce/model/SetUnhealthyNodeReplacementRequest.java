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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/SetUnhealthyNodeReplacement"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetUnhealthyNodeReplacementRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The list of strings that uniquely identify the clusters for which to turn on unhealthy node replacement. You can
     * get these identifiers by running the <a>RunJobFlow</a> or the <a>DescribeJobFlows</a> operations.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> jobFlowIds;
    /**
     * <p>
     * Indicates whether to turn on or turn off graceful unhealthy node replacement.
     * </p>
     */
    private Boolean unhealthyNodeReplacement;

    /**
     * <p>
     * The list of strings that uniquely identify the clusters for which to turn on unhealthy node replacement. You can
     * get these identifiers by running the <a>RunJobFlow</a> or the <a>DescribeJobFlows</a> operations.
     * </p>
     * 
     * @return The list of strings that uniquely identify the clusters for which to turn on unhealthy node replacement.
     *         You can get these identifiers by running the <a>RunJobFlow</a> or the <a>DescribeJobFlows</a> operations.
     */

    public java.util.List<String> getJobFlowIds() {
        if (jobFlowIds == null) {
            jobFlowIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return jobFlowIds;
    }

    /**
     * <p>
     * The list of strings that uniquely identify the clusters for which to turn on unhealthy node replacement. You can
     * get these identifiers by running the <a>RunJobFlow</a> or the <a>DescribeJobFlows</a> operations.
     * </p>
     * 
     * @param jobFlowIds
     *        The list of strings that uniquely identify the clusters for which to turn on unhealthy node replacement.
     *        You can get these identifiers by running the <a>RunJobFlow</a> or the <a>DescribeJobFlows</a> operations.
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
     * The list of strings that uniquely identify the clusters for which to turn on unhealthy node replacement. You can
     * get these identifiers by running the <a>RunJobFlow</a> or the <a>DescribeJobFlows</a> operations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobFlowIds(java.util.Collection)} or {@link #withJobFlowIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param jobFlowIds
     *        The list of strings that uniquely identify the clusters for which to turn on unhealthy node replacement.
     *        You can get these identifiers by running the <a>RunJobFlow</a> or the <a>DescribeJobFlows</a> operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetUnhealthyNodeReplacementRequest withJobFlowIds(String... jobFlowIds) {
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
     * The list of strings that uniquely identify the clusters for which to turn on unhealthy node replacement. You can
     * get these identifiers by running the <a>RunJobFlow</a> or the <a>DescribeJobFlows</a> operations.
     * </p>
     * 
     * @param jobFlowIds
     *        The list of strings that uniquely identify the clusters for which to turn on unhealthy node replacement.
     *        You can get these identifiers by running the <a>RunJobFlow</a> or the <a>DescribeJobFlows</a> operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetUnhealthyNodeReplacementRequest withJobFlowIds(java.util.Collection<String> jobFlowIds) {
        setJobFlowIds(jobFlowIds);
        return this;
    }

    /**
     * <p>
     * Indicates whether to turn on or turn off graceful unhealthy node replacement.
     * </p>
     * 
     * @param unhealthyNodeReplacement
     *        Indicates whether to turn on or turn off graceful unhealthy node replacement.
     */

    public void setUnhealthyNodeReplacement(Boolean unhealthyNodeReplacement) {
        this.unhealthyNodeReplacement = unhealthyNodeReplacement;
    }

    /**
     * <p>
     * Indicates whether to turn on or turn off graceful unhealthy node replacement.
     * </p>
     * 
     * @return Indicates whether to turn on or turn off graceful unhealthy node replacement.
     */

    public Boolean getUnhealthyNodeReplacement() {
        return this.unhealthyNodeReplacement;
    }

    /**
     * <p>
     * Indicates whether to turn on or turn off graceful unhealthy node replacement.
     * </p>
     * 
     * @param unhealthyNodeReplacement
     *        Indicates whether to turn on or turn off graceful unhealthy node replacement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetUnhealthyNodeReplacementRequest withUnhealthyNodeReplacement(Boolean unhealthyNodeReplacement) {
        setUnhealthyNodeReplacement(unhealthyNodeReplacement);
        return this;
    }

    /**
     * <p>
     * Indicates whether to turn on or turn off graceful unhealthy node replacement.
     * </p>
     * 
     * @return Indicates whether to turn on or turn off graceful unhealthy node replacement.
     */

    public Boolean isUnhealthyNodeReplacement() {
        return this.unhealthyNodeReplacement;
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
        if (getUnhealthyNodeReplacement() != null)
            sb.append("UnhealthyNodeReplacement: ").append(getUnhealthyNodeReplacement());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetUnhealthyNodeReplacementRequest == false)
            return false;
        SetUnhealthyNodeReplacementRequest other = (SetUnhealthyNodeReplacementRequest) obj;
        if (other.getJobFlowIds() == null ^ this.getJobFlowIds() == null)
            return false;
        if (other.getJobFlowIds() != null && other.getJobFlowIds().equals(this.getJobFlowIds()) == false)
            return false;
        if (other.getUnhealthyNodeReplacement() == null ^ this.getUnhealthyNodeReplacement() == null)
            return false;
        if (other.getUnhealthyNodeReplacement() != null && other.getUnhealthyNodeReplacement().equals(this.getUnhealthyNodeReplacement()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobFlowIds() == null) ? 0 : getJobFlowIds().hashCode());
        hashCode = prime * hashCode + ((getUnhealthyNodeReplacement() == null) ? 0 : getUnhealthyNodeReplacement().hashCode());
        return hashCode;
    }

    @Override
    public SetUnhealthyNodeReplacementRequest clone() {
        return (SetUnhealthyNodeReplacementRequest) super.clone();
    }

}
