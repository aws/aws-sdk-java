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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The infrastructure configuration for deploying the model to a real-time inference endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/RealTimeInferenceConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RealTimeInferenceConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The instance type the model is deployed to.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The number of instances of the type specified by <code>InstanceType</code>.
     * </p>
     */
    private Integer instanceCount;

    /**
     * <p>
     * The instance type the model is deployed to.
     * </p>
     * 
     * @param instanceType
     *        The instance type the model is deployed to.
     * @see InstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type the model is deployed to.
     * </p>
     * 
     * @return The instance type the model is deployed to.
     * @see InstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type the model is deployed to.
     * </p>
     * 
     * @param instanceType
     *        The instance type the model is deployed to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public RealTimeInferenceConfig withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The instance type the model is deployed to.
     * </p>
     * 
     * @param instanceType
     *        The instance type the model is deployed to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public RealTimeInferenceConfig withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The number of instances of the type specified by <code>InstanceType</code>.
     * </p>
     * 
     * @param instanceCount
     *        The number of instances of the type specified by <code>InstanceType</code>.
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of instances of the type specified by <code>InstanceType</code>.
     * </p>
     * 
     * @return The number of instances of the type specified by <code>InstanceType</code>.
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * The number of instances of the type specified by <code>InstanceType</code>.
     * </p>
     * 
     * @param instanceCount
     *        The number of instances of the type specified by <code>InstanceType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeInferenceConfig withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
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
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: ").append(getInstanceCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RealTimeInferenceConfig == false)
            return false;
        RealTimeInferenceConfig other = (RealTimeInferenceConfig) obj;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        return hashCode;
    }

    @Override
    public RealTimeInferenceConfig clone() {
        try {
            return (RealTimeInferenceConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.RealTimeInferenceConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
