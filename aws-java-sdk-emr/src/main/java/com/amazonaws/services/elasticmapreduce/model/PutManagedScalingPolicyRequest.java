/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/PutManagedScalingPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutManagedScalingPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the ID of an EMR cluster where the managed scaling policy is attached.
     * </p>
     */
    private String clusterId;
    /**
     * <p>
     * Specifies the constraints for the managed scaling policy.
     * </p>
     */
    private ManagedScalingPolicy managedScalingPolicy;

    /**
     * <p>
     * Specifies the ID of an EMR cluster where the managed scaling policy is attached.
     * </p>
     * 
     * @param clusterId
     *        Specifies the ID of an EMR cluster where the managed scaling policy is attached.
     */

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * Specifies the ID of an EMR cluster where the managed scaling policy is attached.
     * </p>
     * 
     * @return Specifies the ID of an EMR cluster where the managed scaling policy is attached.
     */

    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * <p>
     * Specifies the ID of an EMR cluster where the managed scaling policy is attached.
     * </p>
     * 
     * @param clusterId
     *        Specifies the ID of an EMR cluster where the managed scaling policy is attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutManagedScalingPolicyRequest withClusterId(String clusterId) {
        setClusterId(clusterId);
        return this;
    }

    /**
     * <p>
     * Specifies the constraints for the managed scaling policy.
     * </p>
     * 
     * @param managedScalingPolicy
     *        Specifies the constraints for the managed scaling policy.
     */

    public void setManagedScalingPolicy(ManagedScalingPolicy managedScalingPolicy) {
        this.managedScalingPolicy = managedScalingPolicy;
    }

    /**
     * <p>
     * Specifies the constraints for the managed scaling policy.
     * </p>
     * 
     * @return Specifies the constraints for the managed scaling policy.
     */

    public ManagedScalingPolicy getManagedScalingPolicy() {
        return this.managedScalingPolicy;
    }

    /**
     * <p>
     * Specifies the constraints for the managed scaling policy.
     * </p>
     * 
     * @param managedScalingPolicy
     *        Specifies the constraints for the managed scaling policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutManagedScalingPolicyRequest withManagedScalingPolicy(ManagedScalingPolicy managedScalingPolicy) {
        setManagedScalingPolicy(managedScalingPolicy);
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
        if (getManagedScalingPolicy() != null)
            sb.append("ManagedScalingPolicy: ").append(getManagedScalingPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutManagedScalingPolicyRequest == false)
            return false;
        PutManagedScalingPolicyRequest other = (PutManagedScalingPolicyRequest) obj;
        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getManagedScalingPolicy() == null ^ this.getManagedScalingPolicy() == null)
            return false;
        if (other.getManagedScalingPolicy() != null && other.getManagedScalingPolicy().equals(this.getManagedScalingPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode + ((getManagedScalingPolicy() == null) ? 0 : getManagedScalingPolicy().hashCode());
        return hashCode;
    }

    @Override
    public PutManagedScalingPolicyRequest clone() {
        return (PutManagedScalingPolicyRequest) super.clone();
    }

}
