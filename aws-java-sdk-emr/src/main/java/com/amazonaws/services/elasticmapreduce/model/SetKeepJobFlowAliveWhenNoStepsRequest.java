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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/SetKeepJobFlowAliveWhenNoSteps"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetKeepJobFlowAliveWhenNoStepsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of strings that uniquely identify the clusters to protect. This identifier is returned by <a
     * href="https://docs.aws.amazon.com/emr/latest/APIReference/API_RunJobFlow.html">RunJobFlow</a> and can also be
     * obtained from <a
     * href="https://docs.aws.amazon.com/emr/latest/APIReference/API_DescribeJobFlows.html">DescribeJobFlows</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> jobFlowIds;
    /**
     * <p>
     * A Boolean that indicates whether to terminate the cluster after all steps are executed.
     * </p>
     */
    private Boolean keepJobFlowAliveWhenNoSteps;

    /**
     * <p>
     * A list of strings that uniquely identify the clusters to protect. This identifier is returned by <a
     * href="https://docs.aws.amazon.com/emr/latest/APIReference/API_RunJobFlow.html">RunJobFlow</a> and can also be
     * obtained from <a
     * href="https://docs.aws.amazon.com/emr/latest/APIReference/API_DescribeJobFlows.html">DescribeJobFlows</a>.
     * </p>
     * 
     * @return A list of strings that uniquely identify the clusters to protect. This identifier is returned by <a
     *         href="https://docs.aws.amazon.com/emr/latest/APIReference/API_RunJobFlow.html">RunJobFlow</a> and can
     *         also be obtained from <a
     *         href="https://docs.aws.amazon.com/emr/latest/APIReference/API_DescribeJobFlows.html"
     *         >DescribeJobFlows</a>.
     */

    public java.util.List<String> getJobFlowIds() {
        if (jobFlowIds == null) {
            jobFlowIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return jobFlowIds;
    }

    /**
     * <p>
     * A list of strings that uniquely identify the clusters to protect. This identifier is returned by <a
     * href="https://docs.aws.amazon.com/emr/latest/APIReference/API_RunJobFlow.html">RunJobFlow</a> and can also be
     * obtained from <a
     * href="https://docs.aws.amazon.com/emr/latest/APIReference/API_DescribeJobFlows.html">DescribeJobFlows</a>.
     * </p>
     * 
     * @param jobFlowIds
     *        A list of strings that uniquely identify the clusters to protect. This identifier is returned by <a
     *        href="https://docs.aws.amazon.com/emr/latest/APIReference/API_RunJobFlow.html">RunJobFlow</a> and can also
     *        be obtained from <a
     *        href="https://docs.aws.amazon.com/emr/latest/APIReference/API_DescribeJobFlows.html">DescribeJobFlows</a>.
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
     * A list of strings that uniquely identify the clusters to protect. This identifier is returned by <a
     * href="https://docs.aws.amazon.com/emr/latest/APIReference/API_RunJobFlow.html">RunJobFlow</a> and can also be
     * obtained from <a
     * href="https://docs.aws.amazon.com/emr/latest/APIReference/API_DescribeJobFlows.html">DescribeJobFlows</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobFlowIds(java.util.Collection)} or {@link #withJobFlowIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param jobFlowIds
     *        A list of strings that uniquely identify the clusters to protect. This identifier is returned by <a
     *        href="https://docs.aws.amazon.com/emr/latest/APIReference/API_RunJobFlow.html">RunJobFlow</a> and can also
     *        be obtained from <a
     *        href="https://docs.aws.amazon.com/emr/latest/APIReference/API_DescribeJobFlows.html">DescribeJobFlows</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetKeepJobFlowAliveWhenNoStepsRequest withJobFlowIds(String... jobFlowIds) {
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
     * A list of strings that uniquely identify the clusters to protect. This identifier is returned by <a
     * href="https://docs.aws.amazon.com/emr/latest/APIReference/API_RunJobFlow.html">RunJobFlow</a> and can also be
     * obtained from <a
     * href="https://docs.aws.amazon.com/emr/latest/APIReference/API_DescribeJobFlows.html">DescribeJobFlows</a>.
     * </p>
     * 
     * @param jobFlowIds
     *        A list of strings that uniquely identify the clusters to protect. This identifier is returned by <a
     *        href="https://docs.aws.amazon.com/emr/latest/APIReference/API_RunJobFlow.html">RunJobFlow</a> and can also
     *        be obtained from <a
     *        href="https://docs.aws.amazon.com/emr/latest/APIReference/API_DescribeJobFlows.html">DescribeJobFlows</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetKeepJobFlowAliveWhenNoStepsRequest withJobFlowIds(java.util.Collection<String> jobFlowIds) {
        setJobFlowIds(jobFlowIds);
        return this;
    }

    /**
     * <p>
     * A Boolean that indicates whether to terminate the cluster after all steps are executed.
     * </p>
     * 
     * @param keepJobFlowAliveWhenNoSteps
     *        A Boolean that indicates whether to terminate the cluster after all steps are executed.
     */

    public void setKeepJobFlowAliveWhenNoSteps(Boolean keepJobFlowAliveWhenNoSteps) {
        this.keepJobFlowAliveWhenNoSteps = keepJobFlowAliveWhenNoSteps;
    }

    /**
     * <p>
     * A Boolean that indicates whether to terminate the cluster after all steps are executed.
     * </p>
     * 
     * @return A Boolean that indicates whether to terminate the cluster after all steps are executed.
     */

    public Boolean getKeepJobFlowAliveWhenNoSteps() {
        return this.keepJobFlowAliveWhenNoSteps;
    }

    /**
     * <p>
     * A Boolean that indicates whether to terminate the cluster after all steps are executed.
     * </p>
     * 
     * @param keepJobFlowAliveWhenNoSteps
     *        A Boolean that indicates whether to terminate the cluster after all steps are executed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetKeepJobFlowAliveWhenNoStepsRequest withKeepJobFlowAliveWhenNoSteps(Boolean keepJobFlowAliveWhenNoSteps) {
        setKeepJobFlowAliveWhenNoSteps(keepJobFlowAliveWhenNoSteps);
        return this;
    }

    /**
     * <p>
     * A Boolean that indicates whether to terminate the cluster after all steps are executed.
     * </p>
     * 
     * @return A Boolean that indicates whether to terminate the cluster after all steps are executed.
     */

    public Boolean isKeepJobFlowAliveWhenNoSteps() {
        return this.keepJobFlowAliveWhenNoSteps;
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
        if (getKeepJobFlowAliveWhenNoSteps() != null)
            sb.append("KeepJobFlowAliveWhenNoSteps: ").append(getKeepJobFlowAliveWhenNoSteps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetKeepJobFlowAliveWhenNoStepsRequest == false)
            return false;
        SetKeepJobFlowAliveWhenNoStepsRequest other = (SetKeepJobFlowAliveWhenNoStepsRequest) obj;
        if (other.getJobFlowIds() == null ^ this.getJobFlowIds() == null)
            return false;
        if (other.getJobFlowIds() != null && other.getJobFlowIds().equals(this.getJobFlowIds()) == false)
            return false;
        if (other.getKeepJobFlowAliveWhenNoSteps() == null ^ this.getKeepJobFlowAliveWhenNoSteps() == null)
            return false;
        if (other.getKeepJobFlowAliveWhenNoSteps() != null && other.getKeepJobFlowAliveWhenNoSteps().equals(this.getKeepJobFlowAliveWhenNoSteps()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobFlowIds() == null) ? 0 : getJobFlowIds().hashCode());
        hashCode = prime * hashCode + ((getKeepJobFlowAliveWhenNoSteps() == null) ? 0 : getKeepJobFlowAliveWhenNoSteps().hashCode());
        return hashCode;
    }

    @Override
    public SetKeepJobFlowAliveWhenNoStepsRequest clone() {
        return (SetKeepJobFlowAliveWhenNoStepsRequest) super.clone();
    }

}
