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
 * Defines an instance group for heterogeneous cluster training. When requesting a training job using the <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_CreateTrainingJob.html">CreateTrainingJob</a>
 * API, you can configure multiple instance groups .
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/InstanceGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the instance type of the instance group.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * Specifies the number of instances of the instance group.
     * </p>
     */
    private Integer instanceCount;
    /**
     * <p>
     * Specifies the name of the instance group.
     * </p>
     */
    private String instanceGroupName;

    /**
     * <p>
     * Specifies the instance type of the instance group.
     * </p>
     * 
     * @param instanceType
     *        Specifies the instance type of the instance group.
     * @see TrainingInstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * Specifies the instance type of the instance group.
     * </p>
     * 
     * @return Specifies the instance type of the instance group.
     * @see TrainingInstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * Specifies the instance type of the instance group.
     * </p>
     * 
     * @param instanceType
     *        Specifies the instance type of the instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingInstanceType
     */

    public InstanceGroup withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * Specifies the instance type of the instance group.
     * </p>
     * 
     * @param instanceType
     *        Specifies the instance type of the instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingInstanceType
     */

    public InstanceGroup withInstanceType(TrainingInstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the number of instances of the instance group.
     * </p>
     * 
     * @param instanceCount
     *        Specifies the number of instances of the instance group.
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * Specifies the number of instances of the instance group.
     * </p>
     * 
     * @return Specifies the number of instances of the instance group.
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * Specifies the number of instances of the instance group.
     * </p>
     * 
     * @param instanceCount
     *        Specifies the number of instances of the instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroup withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the instance group.
     * </p>
     * 
     * @param instanceGroupName
     *        Specifies the name of the instance group.
     */

    public void setInstanceGroupName(String instanceGroupName) {
        this.instanceGroupName = instanceGroupName;
    }

    /**
     * <p>
     * Specifies the name of the instance group.
     * </p>
     * 
     * @return Specifies the name of the instance group.
     */

    public String getInstanceGroupName() {
        return this.instanceGroupName;
    }

    /**
     * <p>
     * Specifies the name of the instance group.
     * </p>
     * 
     * @param instanceGroupName
     *        Specifies the name of the instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroup withInstanceGroupName(String instanceGroupName) {
        setInstanceGroupName(instanceGroupName);
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
            sb.append("InstanceCount: ").append(getInstanceCount()).append(",");
        if (getInstanceGroupName() != null)
            sb.append("InstanceGroupName: ").append(getInstanceGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceGroup == false)
            return false;
        InstanceGroup other = (InstanceGroup) obj;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getInstanceGroupName() == null ^ this.getInstanceGroupName() == null)
            return false;
        if (other.getInstanceGroupName() != null && other.getInstanceGroupName().equals(this.getInstanceGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getInstanceGroupName() == null) ? 0 : getInstanceGroupName().hashCode());
        return hashCode;
    }

    @Override
    public InstanceGroup clone() {
        try {
            return (InstanceGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.InstanceGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
