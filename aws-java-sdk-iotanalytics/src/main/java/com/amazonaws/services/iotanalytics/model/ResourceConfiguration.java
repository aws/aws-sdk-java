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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration of the resource used to execute the "containerAction".
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/ResourceConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the compute resource used to execute the "containerAction". Possible values are: ACU_1 (vCPU=4,
     * memory=16GiB) or ACU_2 (vCPU=8, memory=32GiB).
     * </p>
     */
    private String computeType;
    /**
     * <p>
     * The size (in GB) of the persistent storage available to the resource instance used to execute the
     * "containerAction" (min: 1, max: 50).
     * </p>
     */
    private Integer volumeSizeInGB;

    /**
     * <p>
     * The type of the compute resource used to execute the "containerAction". Possible values are: ACU_1 (vCPU=4,
     * memory=16GiB) or ACU_2 (vCPU=8, memory=32GiB).
     * </p>
     * 
     * @param computeType
     *        The type of the compute resource used to execute the "containerAction". Possible values are: ACU_1
     *        (vCPU=4, memory=16GiB) or ACU_2 (vCPU=8, memory=32GiB).
     * @see ComputeType
     */

    public void setComputeType(String computeType) {
        this.computeType = computeType;
    }

    /**
     * <p>
     * The type of the compute resource used to execute the "containerAction". Possible values are: ACU_1 (vCPU=4,
     * memory=16GiB) or ACU_2 (vCPU=8, memory=32GiB).
     * </p>
     * 
     * @return The type of the compute resource used to execute the "containerAction". Possible values are: ACU_1
     *         (vCPU=4, memory=16GiB) or ACU_2 (vCPU=8, memory=32GiB).
     * @see ComputeType
     */

    public String getComputeType() {
        return this.computeType;
    }

    /**
     * <p>
     * The type of the compute resource used to execute the "containerAction". Possible values are: ACU_1 (vCPU=4,
     * memory=16GiB) or ACU_2 (vCPU=8, memory=32GiB).
     * </p>
     * 
     * @param computeType
     *        The type of the compute resource used to execute the "containerAction". Possible values are: ACU_1
     *        (vCPU=4, memory=16GiB) or ACU_2 (vCPU=8, memory=32GiB).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputeType
     */

    public ResourceConfiguration withComputeType(String computeType) {
        setComputeType(computeType);
        return this;
    }

    /**
     * <p>
     * The type of the compute resource used to execute the "containerAction". Possible values are: ACU_1 (vCPU=4,
     * memory=16GiB) or ACU_2 (vCPU=8, memory=32GiB).
     * </p>
     * 
     * @param computeType
     *        The type of the compute resource used to execute the "containerAction". Possible values are: ACU_1
     *        (vCPU=4, memory=16GiB) or ACU_2 (vCPU=8, memory=32GiB).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputeType
     */

    public ResourceConfiguration withComputeType(ComputeType computeType) {
        this.computeType = computeType.toString();
        return this;
    }

    /**
     * <p>
     * The size (in GB) of the persistent storage available to the resource instance used to execute the
     * "containerAction" (min: 1, max: 50).
     * </p>
     * 
     * @param volumeSizeInGB
     *        The size (in GB) of the persistent storage available to the resource instance used to execute the
     *        "containerAction" (min: 1, max: 50).
     */

    public void setVolumeSizeInGB(Integer volumeSizeInGB) {
        this.volumeSizeInGB = volumeSizeInGB;
    }

    /**
     * <p>
     * The size (in GB) of the persistent storage available to the resource instance used to execute the
     * "containerAction" (min: 1, max: 50).
     * </p>
     * 
     * @return The size (in GB) of the persistent storage available to the resource instance used to execute the
     *         "containerAction" (min: 1, max: 50).
     */

    public Integer getVolumeSizeInGB() {
        return this.volumeSizeInGB;
    }

    /**
     * <p>
     * The size (in GB) of the persistent storage available to the resource instance used to execute the
     * "containerAction" (min: 1, max: 50).
     * </p>
     * 
     * @param volumeSizeInGB
     *        The size (in GB) of the persistent storage available to the resource instance used to execute the
     *        "containerAction" (min: 1, max: 50).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceConfiguration withVolumeSizeInGB(Integer volumeSizeInGB) {
        setVolumeSizeInGB(volumeSizeInGB);
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
        if (getComputeType() != null)
            sb.append("ComputeType: ").append(getComputeType()).append(",");
        if (getVolumeSizeInGB() != null)
            sb.append("VolumeSizeInGB: ").append(getVolumeSizeInGB());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceConfiguration == false)
            return false;
        ResourceConfiguration other = (ResourceConfiguration) obj;
        if (other.getComputeType() == null ^ this.getComputeType() == null)
            return false;
        if (other.getComputeType() != null && other.getComputeType().equals(this.getComputeType()) == false)
            return false;
        if (other.getVolumeSizeInGB() == null ^ this.getVolumeSizeInGB() == null)
            return false;
        if (other.getVolumeSizeInGB() != null && other.getVolumeSizeInGB().equals(this.getVolumeSizeInGB()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComputeType() == null) ? 0 : getComputeType().hashCode());
        hashCode = prime * hashCode + ((getVolumeSizeInGB() == null) ? 0 : getVolumeSizeInGB().hashCode());
        return hashCode;
    }

    @Override
    public ResourceConfiguration clone() {
        try {
            return (ResourceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.ResourceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
