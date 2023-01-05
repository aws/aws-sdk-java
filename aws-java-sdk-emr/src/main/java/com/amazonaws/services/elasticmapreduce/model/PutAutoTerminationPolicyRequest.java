/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/PutAutoTerminationPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutAutoTerminationPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the ID of the Amazon EMR cluster to which the auto-termination policy will be attached.
     * </p>
     */
    private String clusterId;
    /**
     * <p>
     * Specifies the auto-termination policy to attach to the cluster.
     * </p>
     */
    private AutoTerminationPolicy autoTerminationPolicy;

    /**
     * <p>
     * Specifies the ID of the Amazon EMR cluster to which the auto-termination policy will be attached.
     * </p>
     * 
     * @param clusterId
     *        Specifies the ID of the Amazon EMR cluster to which the auto-termination policy will be attached.
     */

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * Specifies the ID of the Amazon EMR cluster to which the auto-termination policy will be attached.
     * </p>
     * 
     * @return Specifies the ID of the Amazon EMR cluster to which the auto-termination policy will be attached.
     */

    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * <p>
     * Specifies the ID of the Amazon EMR cluster to which the auto-termination policy will be attached.
     * </p>
     * 
     * @param clusterId
     *        Specifies the ID of the Amazon EMR cluster to which the auto-termination policy will be attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAutoTerminationPolicyRequest withClusterId(String clusterId) {
        setClusterId(clusterId);
        return this;
    }

    /**
     * <p>
     * Specifies the auto-termination policy to attach to the cluster.
     * </p>
     * 
     * @param autoTerminationPolicy
     *        Specifies the auto-termination policy to attach to the cluster.
     */

    public void setAutoTerminationPolicy(AutoTerminationPolicy autoTerminationPolicy) {
        this.autoTerminationPolicy = autoTerminationPolicy;
    }

    /**
     * <p>
     * Specifies the auto-termination policy to attach to the cluster.
     * </p>
     * 
     * @return Specifies the auto-termination policy to attach to the cluster.
     */

    public AutoTerminationPolicy getAutoTerminationPolicy() {
        return this.autoTerminationPolicy;
    }

    /**
     * <p>
     * Specifies the auto-termination policy to attach to the cluster.
     * </p>
     * 
     * @param autoTerminationPolicy
     *        Specifies the auto-termination policy to attach to the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAutoTerminationPolicyRequest withAutoTerminationPolicy(AutoTerminationPolicy autoTerminationPolicy) {
        setAutoTerminationPolicy(autoTerminationPolicy);
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
        if (getAutoTerminationPolicy() != null)
            sb.append("AutoTerminationPolicy: ").append(getAutoTerminationPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutAutoTerminationPolicyRequest == false)
            return false;
        PutAutoTerminationPolicyRequest other = (PutAutoTerminationPolicyRequest) obj;
        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getAutoTerminationPolicy() == null ^ this.getAutoTerminationPolicy() == null)
            return false;
        if (other.getAutoTerminationPolicy() != null && other.getAutoTerminationPolicy().equals(this.getAutoTerminationPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode + ((getAutoTerminationPolicy() == null) ? 0 : getAutoTerminationPolicy().hashCode());
        return hashCode;
    }

    @Override
    public PutAutoTerminationPolicyRequest clone() {
        return (PutAutoTerminationPolicyRequest) super.clone();
    }

}
