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
package com.amazonaws.services.emrserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The aggregate vCPU, memory, and storage resources used from the time job start executing till the time job is
 * terminated, rounded up to the nearest second.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/TotalResourceUtilization"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TotalResourceUtilization implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The aggregated vCPU used per hour from the time job start executing till the time job is terminated.
     * </p>
     */
    private Double vCPUHour;
    /**
     * <p>
     * The aggregated memory used per hour from the time job start executing till the time job is terminated.
     * </p>
     */
    private Double memoryGBHour;
    /**
     * <p>
     * The aggregated storage used per hour from the time job start executing till the time job is terminated.
     * </p>
     */
    private Double storageGBHour;

    /**
     * <p>
     * The aggregated vCPU used per hour from the time job start executing till the time job is terminated.
     * </p>
     * 
     * @param vCPUHour
     *        The aggregated vCPU used per hour from the time job start executing till the time job is terminated.
     */

    public void setVCPUHour(Double vCPUHour) {
        this.vCPUHour = vCPUHour;
    }

    /**
     * <p>
     * The aggregated vCPU used per hour from the time job start executing till the time job is terminated.
     * </p>
     * 
     * @return The aggregated vCPU used per hour from the time job start executing till the time job is terminated.
     */

    public Double getVCPUHour() {
        return this.vCPUHour;
    }

    /**
     * <p>
     * The aggregated vCPU used per hour from the time job start executing till the time job is terminated.
     * </p>
     * 
     * @param vCPUHour
     *        The aggregated vCPU used per hour from the time job start executing till the time job is terminated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TotalResourceUtilization withVCPUHour(Double vCPUHour) {
        setVCPUHour(vCPUHour);
        return this;
    }

    /**
     * <p>
     * The aggregated memory used per hour from the time job start executing till the time job is terminated.
     * </p>
     * 
     * @param memoryGBHour
     *        The aggregated memory used per hour from the time job start executing till the time job is terminated.
     */

    public void setMemoryGBHour(Double memoryGBHour) {
        this.memoryGBHour = memoryGBHour;
    }

    /**
     * <p>
     * The aggregated memory used per hour from the time job start executing till the time job is terminated.
     * </p>
     * 
     * @return The aggregated memory used per hour from the time job start executing till the time job is terminated.
     */

    public Double getMemoryGBHour() {
        return this.memoryGBHour;
    }

    /**
     * <p>
     * The aggregated memory used per hour from the time job start executing till the time job is terminated.
     * </p>
     * 
     * @param memoryGBHour
     *        The aggregated memory used per hour from the time job start executing till the time job is terminated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TotalResourceUtilization withMemoryGBHour(Double memoryGBHour) {
        setMemoryGBHour(memoryGBHour);
        return this;
    }

    /**
     * <p>
     * The aggregated storage used per hour from the time job start executing till the time job is terminated.
     * </p>
     * 
     * @param storageGBHour
     *        The aggregated storage used per hour from the time job start executing till the time job is terminated.
     */

    public void setStorageGBHour(Double storageGBHour) {
        this.storageGBHour = storageGBHour;
    }

    /**
     * <p>
     * The aggregated storage used per hour from the time job start executing till the time job is terminated.
     * </p>
     * 
     * @return The aggregated storage used per hour from the time job start executing till the time job is terminated.
     */

    public Double getStorageGBHour() {
        return this.storageGBHour;
    }

    /**
     * <p>
     * The aggregated storage used per hour from the time job start executing till the time job is terminated.
     * </p>
     * 
     * @param storageGBHour
     *        The aggregated storage used per hour from the time job start executing till the time job is terminated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TotalResourceUtilization withStorageGBHour(Double storageGBHour) {
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

        if (obj instanceof TotalResourceUtilization == false)
            return false;
        TotalResourceUtilization other = (TotalResourceUtilization) obj;
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
    public TotalResourceUtilization clone() {
        try {
            return (TotalResourceUtilization) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrserverless.model.transform.TotalResourceUtilizationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
