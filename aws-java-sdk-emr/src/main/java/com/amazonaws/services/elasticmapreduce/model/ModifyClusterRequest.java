/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ModifyCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the cluster.
     * </p>
     */
    private String clusterId;
    /**
     * <p>
     * The number of steps that can be executed concurrently. You can specify a maximum of 256 steps.
     * </p>
     */
    private Integer stepConcurrencyLevel;

    /**
     * <p>
     * The unique identifier of the cluster.
     * </p>
     * 
     * @param clusterId
     *        The unique identifier of the cluster.
     */

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * The unique identifier of the cluster.
     * </p>
     * 
     * @return The unique identifier of the cluster.
     */

    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * <p>
     * The unique identifier of the cluster.
     * </p>
     * 
     * @param clusterId
     *        The unique identifier of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterRequest withClusterId(String clusterId) {
        setClusterId(clusterId);
        return this;
    }

    /**
     * <p>
     * The number of steps that can be executed concurrently. You can specify a maximum of 256 steps.
     * </p>
     * 
     * @param stepConcurrencyLevel
     *        The number of steps that can be executed concurrently. You can specify a maximum of 256 steps.
     */

    public void setStepConcurrencyLevel(Integer stepConcurrencyLevel) {
        this.stepConcurrencyLevel = stepConcurrencyLevel;
    }

    /**
     * <p>
     * The number of steps that can be executed concurrently. You can specify a maximum of 256 steps.
     * </p>
     * 
     * @return The number of steps that can be executed concurrently. You can specify a maximum of 256 steps.
     */

    public Integer getStepConcurrencyLevel() {
        return this.stepConcurrencyLevel;
    }

    /**
     * <p>
     * The number of steps that can be executed concurrently. You can specify a maximum of 256 steps.
     * </p>
     * 
     * @param stepConcurrencyLevel
     *        The number of steps that can be executed concurrently. You can specify a maximum of 256 steps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClusterRequest withStepConcurrencyLevel(Integer stepConcurrencyLevel) {
        setStepConcurrencyLevel(stepConcurrencyLevel);
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
        if (getStepConcurrencyLevel() != null)
            sb.append("StepConcurrencyLevel: ").append(getStepConcurrencyLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyClusterRequest == false)
            return false;
        ModifyClusterRequest other = (ModifyClusterRequest) obj;
        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getStepConcurrencyLevel() == null ^ this.getStepConcurrencyLevel() == null)
            return false;
        if (other.getStepConcurrencyLevel() != null && other.getStepConcurrencyLevel().equals(this.getStepConcurrencyLevel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode + ((getStepConcurrencyLevel() == null) ? 0 : getStepConcurrencyLevel().hashCode());
        return hashCode;
    }

    @Override
    public ModifyClusterRequest clone() {
        return (ModifyClusterRequest) super.clone();
    }

}
