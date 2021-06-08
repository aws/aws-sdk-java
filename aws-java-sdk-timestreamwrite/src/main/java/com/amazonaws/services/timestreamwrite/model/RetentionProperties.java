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
package com.amazonaws.services.timestreamwrite.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Retention properties contain the duration for which your time series data must be stored in the magnetic store and
 * the memory store.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/RetentionProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetentionProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The duration for which data must be stored in the memory store.
     * </p>
     */
    private Long memoryStoreRetentionPeriodInHours;
    /**
     * <p>
     * The duration for which data must be stored in the magnetic store.
     * </p>
     */
    private Long magneticStoreRetentionPeriodInDays;

    /**
     * <p>
     * The duration for which data must be stored in the memory store.
     * </p>
     * 
     * @param memoryStoreRetentionPeriodInHours
     *        The duration for which data must be stored in the memory store.
     */

    public void setMemoryStoreRetentionPeriodInHours(Long memoryStoreRetentionPeriodInHours) {
        this.memoryStoreRetentionPeriodInHours = memoryStoreRetentionPeriodInHours;
    }

    /**
     * <p>
     * The duration for which data must be stored in the memory store.
     * </p>
     * 
     * @return The duration for which data must be stored in the memory store.
     */

    public Long getMemoryStoreRetentionPeriodInHours() {
        return this.memoryStoreRetentionPeriodInHours;
    }

    /**
     * <p>
     * The duration for which data must be stored in the memory store.
     * </p>
     * 
     * @param memoryStoreRetentionPeriodInHours
     *        The duration for which data must be stored in the memory store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetentionProperties withMemoryStoreRetentionPeriodInHours(Long memoryStoreRetentionPeriodInHours) {
        setMemoryStoreRetentionPeriodInHours(memoryStoreRetentionPeriodInHours);
        return this;
    }

    /**
     * <p>
     * The duration for which data must be stored in the magnetic store.
     * </p>
     * 
     * @param magneticStoreRetentionPeriodInDays
     *        The duration for which data must be stored in the magnetic store.
     */

    public void setMagneticStoreRetentionPeriodInDays(Long magneticStoreRetentionPeriodInDays) {
        this.magneticStoreRetentionPeriodInDays = magneticStoreRetentionPeriodInDays;
    }

    /**
     * <p>
     * The duration for which data must be stored in the magnetic store.
     * </p>
     * 
     * @return The duration for which data must be stored in the magnetic store.
     */

    public Long getMagneticStoreRetentionPeriodInDays() {
        return this.magneticStoreRetentionPeriodInDays;
    }

    /**
     * <p>
     * The duration for which data must be stored in the magnetic store.
     * </p>
     * 
     * @param magneticStoreRetentionPeriodInDays
     *        The duration for which data must be stored in the magnetic store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetentionProperties withMagneticStoreRetentionPeriodInDays(Long magneticStoreRetentionPeriodInDays) {
        setMagneticStoreRetentionPeriodInDays(magneticStoreRetentionPeriodInDays);
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
        if (getMemoryStoreRetentionPeriodInHours() != null)
            sb.append("MemoryStoreRetentionPeriodInHours: ").append(getMemoryStoreRetentionPeriodInHours()).append(",");
        if (getMagneticStoreRetentionPeriodInDays() != null)
            sb.append("MagneticStoreRetentionPeriodInDays: ").append(getMagneticStoreRetentionPeriodInDays());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetentionProperties == false)
            return false;
        RetentionProperties other = (RetentionProperties) obj;
        if (other.getMemoryStoreRetentionPeriodInHours() == null ^ this.getMemoryStoreRetentionPeriodInHours() == null)
            return false;
        if (other.getMemoryStoreRetentionPeriodInHours() != null
                && other.getMemoryStoreRetentionPeriodInHours().equals(this.getMemoryStoreRetentionPeriodInHours()) == false)
            return false;
        if (other.getMagneticStoreRetentionPeriodInDays() == null ^ this.getMagneticStoreRetentionPeriodInDays() == null)
            return false;
        if (other.getMagneticStoreRetentionPeriodInDays() != null
                && other.getMagneticStoreRetentionPeriodInDays().equals(this.getMagneticStoreRetentionPeriodInDays()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMemoryStoreRetentionPeriodInHours() == null) ? 0 : getMemoryStoreRetentionPeriodInHours().hashCode());
        hashCode = prime * hashCode + ((getMagneticStoreRetentionPeriodInDays() == null) ? 0 : getMagneticStoreRetentionPeriodInDays().hashCode());
        return hashCode;
    }

    @Override
    public RetentionProperties clone() {
        try {
            return (RetentionProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamwrite.model.transform.RetentionPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
