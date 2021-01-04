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
package com.amazonaws.services.elasticinference.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of an Elastic Inference Accelerator.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elastic-inference-2017-07-25/ElasticInferenceAccelerator"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ElasticInferenceAccelerator implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The health of the Elastic Inference Accelerator.
     * </p>
     */
    private ElasticInferenceAcceleratorHealth acceleratorHealth;
    /**
     * <p>
     * The type of the Elastic Inference Accelerator.
     * </p>
     */
    private String acceleratorType;
    /**
     * <p>
     * The ID of the Elastic Inference Accelerator.
     * </p>
     */
    private String acceleratorId;
    /**
     * <p>
     * The availability zone where the Elastic Inference Accelerator is present.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The ARN of the resource that the Elastic Inference Accelerator is attached to.
     * </p>
     */
    private String attachedResource;

    /**
     * <p>
     * The health of the Elastic Inference Accelerator.
     * </p>
     * 
     * @param acceleratorHealth
     *        The health of the Elastic Inference Accelerator.
     */

    public void setAcceleratorHealth(ElasticInferenceAcceleratorHealth acceleratorHealth) {
        this.acceleratorHealth = acceleratorHealth;
    }

    /**
     * <p>
     * The health of the Elastic Inference Accelerator.
     * </p>
     * 
     * @return The health of the Elastic Inference Accelerator.
     */

    public ElasticInferenceAcceleratorHealth getAcceleratorHealth() {
        return this.acceleratorHealth;
    }

    /**
     * <p>
     * The health of the Elastic Inference Accelerator.
     * </p>
     * 
     * @param acceleratorHealth
     *        The health of the Elastic Inference Accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticInferenceAccelerator withAcceleratorHealth(ElasticInferenceAcceleratorHealth acceleratorHealth) {
        setAcceleratorHealth(acceleratorHealth);
        return this;
    }

    /**
     * <p>
     * The type of the Elastic Inference Accelerator.
     * </p>
     * 
     * @param acceleratorType
     *        The type of the Elastic Inference Accelerator.
     */

    public void setAcceleratorType(String acceleratorType) {
        this.acceleratorType = acceleratorType;
    }

    /**
     * <p>
     * The type of the Elastic Inference Accelerator.
     * </p>
     * 
     * @return The type of the Elastic Inference Accelerator.
     */

    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    /**
     * <p>
     * The type of the Elastic Inference Accelerator.
     * </p>
     * 
     * @param acceleratorType
     *        The type of the Elastic Inference Accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticInferenceAccelerator withAcceleratorType(String acceleratorType) {
        setAcceleratorType(acceleratorType);
        return this;
    }

    /**
     * <p>
     * The ID of the Elastic Inference Accelerator.
     * </p>
     * 
     * @param acceleratorId
     *        The ID of the Elastic Inference Accelerator.
     */

    public void setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
    }

    /**
     * <p>
     * The ID of the Elastic Inference Accelerator.
     * </p>
     * 
     * @return The ID of the Elastic Inference Accelerator.
     */

    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * <p>
     * The ID of the Elastic Inference Accelerator.
     * </p>
     * 
     * @param acceleratorId
     *        The ID of the Elastic Inference Accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticInferenceAccelerator withAcceleratorId(String acceleratorId) {
        setAcceleratorId(acceleratorId);
        return this;
    }

    /**
     * <p>
     * The availability zone where the Elastic Inference Accelerator is present.
     * </p>
     * 
     * @param availabilityZone
     *        The availability zone where the Elastic Inference Accelerator is present.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The availability zone where the Elastic Inference Accelerator is present.
     * </p>
     * 
     * @return The availability zone where the Elastic Inference Accelerator is present.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The availability zone where the Elastic Inference Accelerator is present.
     * </p>
     * 
     * @param availabilityZone
     *        The availability zone where the Elastic Inference Accelerator is present.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticInferenceAccelerator withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The ARN of the resource that the Elastic Inference Accelerator is attached to.
     * </p>
     * 
     * @param attachedResource
     *        The ARN of the resource that the Elastic Inference Accelerator is attached to.
     */

    public void setAttachedResource(String attachedResource) {
        this.attachedResource = attachedResource;
    }

    /**
     * <p>
     * The ARN of the resource that the Elastic Inference Accelerator is attached to.
     * </p>
     * 
     * @return The ARN of the resource that the Elastic Inference Accelerator is attached to.
     */

    public String getAttachedResource() {
        return this.attachedResource;
    }

    /**
     * <p>
     * The ARN of the resource that the Elastic Inference Accelerator is attached to.
     * </p>
     * 
     * @param attachedResource
     *        The ARN of the resource that the Elastic Inference Accelerator is attached to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticInferenceAccelerator withAttachedResource(String attachedResource) {
        setAttachedResource(attachedResource);
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
        if (getAcceleratorHealth() != null)
            sb.append("AcceleratorHealth: ").append(getAcceleratorHealth()).append(",");
        if (getAcceleratorType() != null)
            sb.append("AcceleratorType: ").append(getAcceleratorType()).append(",");
        if (getAcceleratorId() != null)
            sb.append("AcceleratorId: ").append(getAcceleratorId()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getAttachedResource() != null)
            sb.append("AttachedResource: ").append(getAttachedResource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ElasticInferenceAccelerator == false)
            return false;
        ElasticInferenceAccelerator other = (ElasticInferenceAccelerator) obj;
        if (other.getAcceleratorHealth() == null ^ this.getAcceleratorHealth() == null)
            return false;
        if (other.getAcceleratorHealth() != null && other.getAcceleratorHealth().equals(this.getAcceleratorHealth()) == false)
            return false;
        if (other.getAcceleratorType() == null ^ this.getAcceleratorType() == null)
            return false;
        if (other.getAcceleratorType() != null && other.getAcceleratorType().equals(this.getAcceleratorType()) == false)
            return false;
        if (other.getAcceleratorId() == null ^ this.getAcceleratorId() == null)
            return false;
        if (other.getAcceleratorId() != null && other.getAcceleratorId().equals(this.getAcceleratorId()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getAttachedResource() == null ^ this.getAttachedResource() == null)
            return false;
        if (other.getAttachedResource() != null && other.getAttachedResource().equals(this.getAttachedResource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceleratorHealth() == null) ? 0 : getAcceleratorHealth().hashCode());
        hashCode = prime * hashCode + ((getAcceleratorType() == null) ? 0 : getAcceleratorType().hashCode());
        hashCode = prime * hashCode + ((getAcceleratorId() == null) ? 0 : getAcceleratorId().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getAttachedResource() == null) ? 0 : getAttachedResource().hashCode());
        return hashCode;
    }

    @Override
    public ElasticInferenceAccelerator clone() {
        try {
            return (ElasticInferenceAccelerator) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticinference.model.transform.ElasticInferenceAcceleratorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
