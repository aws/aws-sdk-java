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
 * The input argument to the <a>CancelSteps</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/CancelSteps" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelStepsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>ClusterID</code> for which specified steps will be canceled. Use <a>RunJobFlow</a> and
     * <a>ListClusters</a> to get ClusterIDs.
     * </p>
     */
    private String clusterId;
    /**
     * <p>
     * The list of <code>StepIDs</code> to cancel. Use <a>ListSteps</a> to get steps and their states for the specified
     * cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> stepIds;

    /**
     * <p>
     * The <code>ClusterID</code> for which specified steps will be canceled. Use <a>RunJobFlow</a> and
     * <a>ListClusters</a> to get ClusterIDs.
     * </p>
     * 
     * @param clusterId
     *        The <code>ClusterID</code> for which specified steps will be canceled. Use <a>RunJobFlow</a> and
     *        <a>ListClusters</a> to get ClusterIDs.
     */

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * The <code>ClusterID</code> for which specified steps will be canceled. Use <a>RunJobFlow</a> and
     * <a>ListClusters</a> to get ClusterIDs.
     * </p>
     * 
     * @return The <code>ClusterID</code> for which specified steps will be canceled. Use <a>RunJobFlow</a> and
     *         <a>ListClusters</a> to get ClusterIDs.
     */

    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * <p>
     * The <code>ClusterID</code> for which specified steps will be canceled. Use <a>RunJobFlow</a> and
     * <a>ListClusters</a> to get ClusterIDs.
     * </p>
     * 
     * @param clusterId
     *        The <code>ClusterID</code> for which specified steps will be canceled. Use <a>RunJobFlow</a> and
     *        <a>ListClusters</a> to get ClusterIDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelStepsRequest withClusterId(String clusterId) {
        setClusterId(clusterId);
        return this;
    }

    /**
     * <p>
     * The list of <code>StepIDs</code> to cancel. Use <a>ListSteps</a> to get steps and their states for the specified
     * cluster.
     * </p>
     * 
     * @return The list of <code>StepIDs</code> to cancel. Use <a>ListSteps</a> to get steps and their states for the
     *         specified cluster.
     */

    public java.util.List<String> getStepIds() {
        if (stepIds == null) {
            stepIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return stepIds;
    }

    /**
     * <p>
     * The list of <code>StepIDs</code> to cancel. Use <a>ListSteps</a> to get steps and their states for the specified
     * cluster.
     * </p>
     * 
     * @param stepIds
     *        The list of <code>StepIDs</code> to cancel. Use <a>ListSteps</a> to get steps and their states for the
     *        specified cluster.
     */

    public void setStepIds(java.util.Collection<String> stepIds) {
        if (stepIds == null) {
            this.stepIds = null;
            return;
        }

        this.stepIds = new com.amazonaws.internal.SdkInternalList<String>(stepIds);
    }

    /**
     * <p>
     * The list of <code>StepIDs</code> to cancel. Use <a>ListSteps</a> to get steps and their states for the specified
     * cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStepIds(java.util.Collection)} or {@link #withStepIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param stepIds
     *        The list of <code>StepIDs</code> to cancel. Use <a>ListSteps</a> to get steps and their states for the
     *        specified cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelStepsRequest withStepIds(String... stepIds) {
        if (this.stepIds == null) {
            setStepIds(new com.amazonaws.internal.SdkInternalList<String>(stepIds.length));
        }
        for (String ele : stepIds) {
            this.stepIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of <code>StepIDs</code> to cancel. Use <a>ListSteps</a> to get steps and their states for the specified
     * cluster.
     * </p>
     * 
     * @param stepIds
     *        The list of <code>StepIDs</code> to cancel. Use <a>ListSteps</a> to get steps and their states for the
     *        specified cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelStepsRequest withStepIds(java.util.Collection<String> stepIds) {
        setStepIds(stepIds);
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
        if (getClusterId() != null)
            sb.append("ClusterId: ").append(getClusterId()).append(",");
        if (getStepIds() != null)
            sb.append("StepIds: ").append(getStepIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelStepsRequest == false)
            return false;
        CancelStepsRequest other = (CancelStepsRequest) obj;
        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getStepIds() == null ^ this.getStepIds() == null)
            return false;
        if (other.getStepIds() != null && other.getStepIds().equals(this.getStepIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode + ((getStepIds() == null) ? 0 : getStepIds().hashCode());
        return hashCode;
    }

    @Override
    public CancelStepsRequest clone() {
        return (CancelStepsRequest) super.clone();
    }

}
