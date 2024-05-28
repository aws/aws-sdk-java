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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The metric for a scaling policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ScalingPolicyMetric" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScalingPolicyMetric implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of invocations sent to a model, normalized by <code>InstanceCount</code> in each ProductionVariant.
     * <code>1/numberOfInstances</code> is sent as the value on each request, where <code>numberOfInstances</code> is
     * the number of active instances for the ProductionVariant behind the endpoint at the time of the request.
     * </p>
     */
    private Integer invocationsPerInstance;
    /**
     * <p>
     * The interval of time taken by a model to respond as viewed from SageMaker. This interval includes the local
     * communication times taken to send the request and to fetch the response from the container of a model and the
     * time taken to complete the inference in the container.
     * </p>
     */
    private Integer modelLatency;

    /**
     * <p>
     * The number of invocations sent to a model, normalized by <code>InstanceCount</code> in each ProductionVariant.
     * <code>1/numberOfInstances</code> is sent as the value on each request, where <code>numberOfInstances</code> is
     * the number of active instances for the ProductionVariant behind the endpoint at the time of the request.
     * </p>
     * 
     * @param invocationsPerInstance
     *        The number of invocations sent to a model, normalized by <code>InstanceCount</code> in each
     *        ProductionVariant. <code>1/numberOfInstances</code> is sent as the value on each request, where
     *        <code>numberOfInstances</code> is the number of active instances for the ProductionVariant behind the
     *        endpoint at the time of the request.
     */

    public void setInvocationsPerInstance(Integer invocationsPerInstance) {
        this.invocationsPerInstance = invocationsPerInstance;
    }

    /**
     * <p>
     * The number of invocations sent to a model, normalized by <code>InstanceCount</code> in each ProductionVariant.
     * <code>1/numberOfInstances</code> is sent as the value on each request, where <code>numberOfInstances</code> is
     * the number of active instances for the ProductionVariant behind the endpoint at the time of the request.
     * </p>
     * 
     * @return The number of invocations sent to a model, normalized by <code>InstanceCount</code> in each
     *         ProductionVariant. <code>1/numberOfInstances</code> is sent as the value on each request, where
     *         <code>numberOfInstances</code> is the number of active instances for the ProductionVariant behind the
     *         endpoint at the time of the request.
     */

    public Integer getInvocationsPerInstance() {
        return this.invocationsPerInstance;
    }

    /**
     * <p>
     * The number of invocations sent to a model, normalized by <code>InstanceCount</code> in each ProductionVariant.
     * <code>1/numberOfInstances</code> is sent as the value on each request, where <code>numberOfInstances</code> is
     * the number of active instances for the ProductionVariant behind the endpoint at the time of the request.
     * </p>
     * 
     * @param invocationsPerInstance
     *        The number of invocations sent to a model, normalized by <code>InstanceCount</code> in each
     *        ProductionVariant. <code>1/numberOfInstances</code> is sent as the value on each request, where
     *        <code>numberOfInstances</code> is the number of active instances for the ProductionVariant behind the
     *        endpoint at the time of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicyMetric withInvocationsPerInstance(Integer invocationsPerInstance) {
        setInvocationsPerInstance(invocationsPerInstance);
        return this;
    }

    /**
     * <p>
     * The interval of time taken by a model to respond as viewed from SageMaker. This interval includes the local
     * communication times taken to send the request and to fetch the response from the container of a model and the
     * time taken to complete the inference in the container.
     * </p>
     * 
     * @param modelLatency
     *        The interval of time taken by a model to respond as viewed from SageMaker. This interval includes the
     *        local communication times taken to send the request and to fetch the response from the container of a
     *        model and the time taken to complete the inference in the container.
     */

    public void setModelLatency(Integer modelLatency) {
        this.modelLatency = modelLatency;
    }

    /**
     * <p>
     * The interval of time taken by a model to respond as viewed from SageMaker. This interval includes the local
     * communication times taken to send the request and to fetch the response from the container of a model and the
     * time taken to complete the inference in the container.
     * </p>
     * 
     * @return The interval of time taken by a model to respond as viewed from SageMaker. This interval includes the
     *         local communication times taken to send the request and to fetch the response from the container of a
     *         model and the time taken to complete the inference in the container.
     */

    public Integer getModelLatency() {
        return this.modelLatency;
    }

    /**
     * <p>
     * The interval of time taken by a model to respond as viewed from SageMaker. This interval includes the local
     * communication times taken to send the request and to fetch the response from the container of a model and the
     * time taken to complete the inference in the container.
     * </p>
     * 
     * @param modelLatency
     *        The interval of time taken by a model to respond as viewed from SageMaker. This interval includes the
     *        local communication times taken to send the request and to fetch the response from the container of a
     *        model and the time taken to complete the inference in the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicyMetric withModelLatency(Integer modelLatency) {
        setModelLatency(modelLatency);
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
        if (getInvocationsPerInstance() != null)
            sb.append("InvocationsPerInstance: ").append(getInvocationsPerInstance()).append(",");
        if (getModelLatency() != null)
            sb.append("ModelLatency: ").append(getModelLatency());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScalingPolicyMetric == false)
            return false;
        ScalingPolicyMetric other = (ScalingPolicyMetric) obj;
        if (other.getInvocationsPerInstance() == null ^ this.getInvocationsPerInstance() == null)
            return false;
        if (other.getInvocationsPerInstance() != null && other.getInvocationsPerInstance().equals(this.getInvocationsPerInstance()) == false)
            return false;
        if (other.getModelLatency() == null ^ this.getModelLatency() == null)
            return false;
        if (other.getModelLatency() != null && other.getModelLatency().equals(this.getModelLatency()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInvocationsPerInstance() == null) ? 0 : getInvocationsPerInstance().hashCode());
        hashCode = prime * hashCode + ((getModelLatency() == null) ? 0 : getModelLatency().hashCode());
        return hashCode;
    }

    @Override
    public ScalingPolicyMetric clone() {
        try {
            return (ScalingPolicyMetric) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ScalingPolicyMetricMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
