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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/PutAutoScalingPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutAutoScalingPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the ID of a cluster. The instance group to which the automatic scaling policy is applied is within this
     * cluster.
     * </p>
     */
    private String clusterId;
    /**
     * <p>
     * Specifies the ID of the instance group to which the scaling policy is applied.
     * </p>
     */
    private String instanceGroupId;
    /**
     * <p>
     * The automatic scaling policy definition.
     * </p>
     */
    private AutoScalingPolicyDescription autoScalingPolicy;

    /**
     * <p>
     * Specifies the ID of a cluster. The instance group to which the automatic scaling policy is applied is within this
     * cluster.
     * </p>
     * 
     * @param clusterId
     *        Specifies the ID of a cluster. The instance group to which the automatic scaling policy is applied is
     *        within this cluster.
     */

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * Specifies the ID of a cluster. The instance group to which the automatic scaling policy is applied is within this
     * cluster.
     * </p>
     * 
     * @return Specifies the ID of a cluster. The instance group to which the automatic scaling policy is applied is
     *         within this cluster.
     */

    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * <p>
     * Specifies the ID of a cluster. The instance group to which the automatic scaling policy is applied is within this
     * cluster.
     * </p>
     * 
     * @param clusterId
     *        Specifies the ID of a cluster. The instance group to which the automatic scaling policy is applied is
     *        within this cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAutoScalingPolicyResult withClusterId(String clusterId) {
        setClusterId(clusterId);
        return this;
    }

    /**
     * <p>
     * Specifies the ID of the instance group to which the scaling policy is applied.
     * </p>
     * 
     * @param instanceGroupId
     *        Specifies the ID of the instance group to which the scaling policy is applied.
     */

    public void setInstanceGroupId(String instanceGroupId) {
        this.instanceGroupId = instanceGroupId;
    }

    /**
     * <p>
     * Specifies the ID of the instance group to which the scaling policy is applied.
     * </p>
     * 
     * @return Specifies the ID of the instance group to which the scaling policy is applied.
     */

    public String getInstanceGroupId() {
        return this.instanceGroupId;
    }

    /**
     * <p>
     * Specifies the ID of the instance group to which the scaling policy is applied.
     * </p>
     * 
     * @param instanceGroupId
     *        Specifies the ID of the instance group to which the scaling policy is applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAutoScalingPolicyResult withInstanceGroupId(String instanceGroupId) {
        setInstanceGroupId(instanceGroupId);
        return this;
    }

    /**
     * <p>
     * The automatic scaling policy definition.
     * </p>
     * 
     * @param autoScalingPolicy
     *        The automatic scaling policy definition.
     */

    public void setAutoScalingPolicy(AutoScalingPolicyDescription autoScalingPolicy) {
        this.autoScalingPolicy = autoScalingPolicy;
    }

    /**
     * <p>
     * The automatic scaling policy definition.
     * </p>
     * 
     * @return The automatic scaling policy definition.
     */

    public AutoScalingPolicyDescription getAutoScalingPolicy() {
        return this.autoScalingPolicy;
    }

    /**
     * <p>
     * The automatic scaling policy definition.
     * </p>
     * 
     * @param autoScalingPolicy
     *        The automatic scaling policy definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAutoScalingPolicyResult withAutoScalingPolicy(AutoScalingPolicyDescription autoScalingPolicy) {
        setAutoScalingPolicy(autoScalingPolicy);
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
        if (getInstanceGroupId() != null)
            sb.append("InstanceGroupId: ").append(getInstanceGroupId()).append(",");
        if (getAutoScalingPolicy() != null)
            sb.append("AutoScalingPolicy: ").append(getAutoScalingPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutAutoScalingPolicyResult == false)
            return false;
        PutAutoScalingPolicyResult other = (PutAutoScalingPolicyResult) obj;
        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getInstanceGroupId() == null ^ this.getInstanceGroupId() == null)
            return false;
        if (other.getInstanceGroupId() != null && other.getInstanceGroupId().equals(this.getInstanceGroupId()) == false)
            return false;
        if (other.getAutoScalingPolicy() == null ^ this.getAutoScalingPolicy() == null)
            return false;
        if (other.getAutoScalingPolicy() != null && other.getAutoScalingPolicy().equals(this.getAutoScalingPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode + ((getInstanceGroupId() == null) ? 0 : getInstanceGroupId().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingPolicy() == null) ? 0 : getAutoScalingPolicy().hashCode());
        return hashCode;
    }

    @Override
    public PutAutoScalingPolicyResult clone() {
        try {
            return (PutAutoScalingPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
