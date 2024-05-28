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
package com.amazonaws.services.emrserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The resource utilization for memory, storage, and vCPU for jobs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/ResourceUtilization" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceUtilization implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The aggregated vCPU used per hour from the time the job starts executing until the job is terminated.
     * </p>
     */
    private Double vCPUHour;
    /**
     * <p>
     * The aggregated memory used per hour from the time the job starts executing until the job is terminated.
     * </p>
     */
    private Double memoryGBHour;
    /**
     * <p>
     * The aggregated storage used per hour from the time the job starts executing until the job is terminated.
     * </p>
     */
    private Double storageGBHour;

    /**
     * <p>
     * The aggregated vCPU used per hour from the time the job starts executing until the job is terminated.
     * </p>
     * 
     * @param vCPUHour
     *        The aggregated vCPU used per hour from the time the job starts executing until the job is terminated.
     */

    public void setVCPUHour(Double vCPUHour) {
        this.vCPUHour = vCPUHour;
    }

    /**
     * <p>
     * The aggregated vCPU used per hour from the time the job starts executing until the job is terminated.
     * </p>
     * 
     * @return The aggregated vCPU used per hour from the time the job starts executing until the job is terminated.
     */

    public Double getVCPUHour() {
        return this.vCPUHour;
    }

    /**
     * <p>
     * The aggregated vCPU used per hour from the time the job starts executing until the job is terminated.
     * </p>
     * 
     * @param vCPUHour
     *        The aggregated vCPU used per hour from the time the job starts executing until the job is terminated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceUtilization withVCPUHour(Double vCPUHour) {
        setVCPUHour(vCPUHour);
        return this;
    }

    /**
     * <p>
     * The aggregated memory used per hour from the time the job starts executing until the job is terminated.
     * </p>
     * 
     * @param memoryGBHour
     *        The aggregated memory used per hour from the time the job starts executing until the job is terminated.
     */

    public void setMemoryGBHour(Double memoryGBHour) {
        this.memoryGBHour = memoryGBHour;
    }

    /**
     * <p>
     * The aggregated memory used per hour from the time the job starts executing until the job is terminated.
     * </p>
     * 
     * @return The aggregated memory used per hour from the time the job starts executing until the job is terminated.
     */

    public Double getMemoryGBHour() {
        return this.memoryGBHour;
    }

    /**
     * <p>
     * The aggregated memory used per hour from the time the job starts executing until the job is terminated.
     * </p>
     * 
     * @param memoryGBHour
     *        The aggregated memory used per hour from the time the job starts executing until the job is terminated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceUtilization withMemoryGBHour(Double memoryGBHour) {
        setMemoryGBHour(memoryGBHour);
        return this;
    }

    /**
     * <p>
     * The aggregated storage used per hour from the time the job starts executing until the job is terminated.
     * </p>
     * 
     * @param storageGBHour
     *        The aggregated storage used per hour from the time the job starts executing until the job is terminated.
     */

    public void setStorageGBHour(Double storageGBHour) {
        this.storageGBHour = storageGBHour;
    }

    /**
     * <p>
     * The aggregated storage used per hour from the time the job starts executing until the job is terminated.
     * </p>
     * 
     * @return The aggregated storage used per hour from the time the job starts executing until the job is terminated.
     */

    public Double getStorageGBHour() {
        return this.storageGBHour;
    }

    /**
     * <p>
     * The aggregated storage used per hour from the time the job starts executing until the job is terminated.
     * </p>
     * 
     * @param storageGBHour
     *        The aggregated storage used per hour from the time the job starts executing until the job is terminated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceUtilization withStorageGBHour(Double storageGBHour) {
        setStorageGBHour(storageGBHour);
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
        if (getVCPUHour() != null)
            sb.append("VCPUHour: ").append(getVCPUHour()).append(",");
        if (getMemoryGBHour() != null)
            sb.append("MemoryGBHour: ").append(getMemoryGBHour()).append(",");
        if (getStorageGBHour() != null)
            sb.append("StorageGBHour: ").append(getStorageGBHour());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceUtilization == false)
            return false;
        ResourceUtilization other = (ResourceUtilization) obj;
        if (other.getVCPUHour() == null ^ this.getVCPUHour() == null)
            return false;
        if (other.getVCPUHour() != null && other.getVCPUHour().equals(this.getVCPUHour()) == false)
            return false;
        if (other.getMemoryGBHour() == null ^ this.getMemoryGBHour() == null)
            return false;
        if (other.getMemoryGBHour() != null && other.getMemoryGBHour().equals(this.getMemoryGBHour()) == false)
            return false;
        if (other.getStorageGBHour() == null ^ this.getStorageGBHour() == null)
            return false;
        if (other.getStorageGBHour() != null && other.getStorageGBHour().equals(this.getStorageGBHour()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVCPUHour() == null) ? 0 : getVCPUHour().hashCode());
        hashCode = prime * hashCode + ((getMemoryGBHour() == null) ? 0 : getMemoryGBHour().hashCode());
        hashCode = prime * hashCode + ((getStorageGBHour() == null) ? 0 : getStorageGBHour().hashCode());
        return hashCode;
    }

    @Override
    public ResourceUtilization clone() {
        try {
            return (ResourceUtilization) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrserverless.model.transform.ResourceUtilizationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
