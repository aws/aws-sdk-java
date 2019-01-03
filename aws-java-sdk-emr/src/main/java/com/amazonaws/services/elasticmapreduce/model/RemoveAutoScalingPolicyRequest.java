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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/RemoveAutoScalingPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveAutoScalingPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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

    public RemoveAutoScalingPolicyRequest withClusterId(String clusterId) {
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

    public RemoveAutoScalingPolicyRequest withInstanceGroupId(String instanceGroupId) {
        setInstanceGroupId(instanceGroupId);
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
            sb.append("InstanceGroupId: ").append(getInstanceGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveAutoScalingPolicyRequest == false)
            return false;
        RemoveAutoScalingPolicyRequest other = (RemoveAutoScalingPolicyRequest) obj;
        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getInstanceGroupId() == null ^ this.getInstanceGroupId() == null)
            return false;
        if (other.getInstanceGroupId() != null && other.getInstanceGroupId().equals(this.getInstanceGroupId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode + ((getInstanceGroupId() == null) ? 0 : getInstanceGroupId().hashCode());
        return hashCode;
    }

    @Override
    public RemoveAutoScalingPolicyRequest clone() {
        return (RemoveAutoScalingPolicyRequest) super.clone();
    }

}
