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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Amazon S3 compatible storage on Snow family devices configuration items.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/S3OnDeviceServiceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3OnDeviceServiceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If the specified storage limit value matches storage limit of one of the defined configurations, that
     * configuration will be used. If the specified storage limit value does not match any defined configuration, the
     * request will fail. If more than one configuration has the same storage limit as specified, the other input need
     * to be provided.
     * </p>
     */
    private Double storageLimit;
    /**
     * <p>
     * Storage unit. Currently the only supported unit is TB.
     * </p>
     */
    private String storageUnit;
    /**
     * <p>
     * Applicable when creating a cluster. Specifies how many nodes are needed for Amazon S3 compatible storage on Snow
     * family devices. If specified, the other input can be omitted.
     * </p>
     */
    private Integer serviceSize;
    /**
     * <p>
     * &gt;Fault tolerance level of the cluster. This indicates the number of nodes that can go down without degrading
     * the performance of the cluster. This additional input helps when the specified <code>StorageLimit</code> matches
     * more than one Amazon S3 compatible storage on Snow family devices service configuration.
     * </p>
     */
    private Integer faultTolerance;

    /**
     * <p>
     * If the specified storage limit value matches storage limit of one of the defined configurations, that
     * configuration will be used. If the specified storage limit value does not match any defined configuration, the
     * request will fail. If more than one configuration has the same storage limit as specified, the other input need
     * to be provided.
     * </p>
     * 
     * @param storageLimit
     *        If the specified storage limit value matches storage limit of one of the defined configurations, that
     *        configuration will be used. If the specified storage limit value does not match any defined configuration,
     *        the request will fail. If more than one configuration has the same storage limit as specified, the other
     *        input need to be provided.
     */

    public void setStorageLimit(Double storageLimit) {
        this.storageLimit = storageLimit;
    }

    /**
     * <p>
     * If the specified storage limit value matches storage limit of one of the defined configurations, that
     * configuration will be used. If the specified storage limit value does not match any defined configuration, the
     * request will fail. If more than one configuration has the same storage limit as specified, the other input need
     * to be provided.
     * </p>
     * 
     * @return If the specified storage limit value matches storage limit of one of the defined configurations, that
     *         configuration will be used. If the specified storage limit value does not match any defined
     *         configuration, the request will fail. If more than one configuration has the same storage limit as
     *         specified, the other input need to be provided.
     */

    public Double getStorageLimit() {
        return this.storageLimit;
    }

    /**
     * <p>
     * If the specified storage limit value matches storage limit of one of the defined configurations, that
     * configuration will be used. If the specified storage limit value does not match any defined configuration, the
     * request will fail. If more than one configuration has the same storage limit as specified, the other input need
     * to be provided.
     * </p>
     * 
     * @param storageLimit
     *        If the specified storage limit value matches storage limit of one of the defined configurations, that
     *        configuration will be used. If the specified storage limit value does not match any defined configuration,
     *        the request will fail. If more than one configuration has the same storage limit as specified, the other
     *        input need to be provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3OnDeviceServiceConfiguration withStorageLimit(Double storageLimit) {
        setStorageLimit(storageLimit);
        return this;
    }

    /**
     * <p>
     * Storage unit. Currently the only supported unit is TB.
     * </p>
     * 
     * @param storageUnit
     *        Storage unit. Currently the only supported unit is TB.
     * @see StorageUnit
     */

    public void setStorageUnit(String storageUnit) {
        this.storageUnit = storageUnit;
    }

    /**
     * <p>
     * Storage unit. Currently the only supported unit is TB.
     * </p>
     * 
     * @return Storage unit. Currently the only supported unit is TB.
     * @see StorageUnit
     */

    public String getStorageUnit() {
        return this.storageUnit;
    }

    /**
     * <p>
     * Storage unit. Currently the only supported unit is TB.
     * </p>
     * 
     * @param storageUnit
     *        Storage unit. Currently the only supported unit is TB.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageUnit
     */

    public S3OnDeviceServiceConfiguration withStorageUnit(String storageUnit) {
        setStorageUnit(storageUnit);
        return this;
    }

    /**
     * <p>
     * Storage unit. Currently the only supported unit is TB.
     * </p>
     * 
     * @param storageUnit
     *        Storage unit. Currently the only supported unit is TB.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageUnit
     */

    public S3OnDeviceServiceConfiguration withStorageUnit(StorageUnit storageUnit) {
        this.storageUnit = storageUnit.toString();
        return this;
    }

    /**
     * <p>
     * Applicable when creating a cluster. Specifies how many nodes are needed for Amazon S3 compatible storage on Snow
     * family devices. If specified, the other input can be omitted.
     * </p>
     * 
     * @param serviceSize
     *        Applicable when creating a cluster. Specifies how many nodes are needed for Amazon S3 compatible storage
     *        on Snow family devices. If specified, the other input can be omitted.
     */

    public void setServiceSize(Integer serviceSize) {
        this.serviceSize = serviceSize;
    }

    /**
     * <p>
     * Applicable when creating a cluster. Specifies how many nodes are needed for Amazon S3 compatible storage on Snow
     * family devices. If specified, the other input can be omitted.
     * </p>
     * 
     * @return Applicable when creating a cluster. Specifies how many nodes are needed for Amazon S3 compatible storage
     *         on Snow family devices. If specified, the other input can be omitted.
     */

    public Integer getServiceSize() {
        return this.serviceSize;
    }

    /**
     * <p>
     * Applicable when creating a cluster. Specifies how many nodes are needed for Amazon S3 compatible storage on Snow
     * family devices. If specified, the other input can be omitted.
     * </p>
     * 
     * @param serviceSize
     *        Applicable when creating a cluster. Specifies how many nodes are needed for Amazon S3 compatible storage
     *        on Snow family devices. If specified, the other input can be omitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3OnDeviceServiceConfiguration withServiceSize(Integer serviceSize) {
        setServiceSize(serviceSize);
        return this;
    }

    /**
     * <p>
     * &gt;Fault tolerance level of the cluster. This indicates the number of nodes that can go down without degrading
     * the performance of the cluster. This additional input helps when the specified <code>StorageLimit</code> matches
     * more than one Amazon S3 compatible storage on Snow family devices service configuration.
     * </p>
     * 
     * @param faultTolerance
     *        &gt;Fault tolerance level of the cluster. This indicates the number of nodes that can go down without
     *        degrading the performance of the cluster. This additional input helps when the specified
     *        <code>StorageLimit</code> matches more than one Amazon S3 compatible storage on Snow family devices
     *        service configuration.
     */

    public void setFaultTolerance(Integer faultTolerance) {
        this.faultTolerance = faultTolerance;
    }

    /**
     * <p>
     * &gt;Fault tolerance level of the cluster. This indicates the number of nodes that can go down without degrading
     * the performance of the cluster. This additional input helps when the specified <code>StorageLimit</code> matches
     * more than one Amazon S3 compatible storage on Snow family devices service configuration.
     * </p>
     * 
     * @return &gt;Fault tolerance level of the cluster. This indicates the number of nodes that can go down without
     *         degrading the performance of the cluster. This additional input helps when the specified
     *         <code>StorageLimit</code> matches more than one Amazon S3 compatible storage on Snow family devices
     *         service configuration.
     */

    public Integer getFaultTolerance() {
        return this.faultTolerance;
    }

    /**
     * <p>
     * &gt;Fault tolerance level of the cluster. This indicates the number of nodes that can go down without degrading
     * the performance of the cluster. This additional input helps when the specified <code>StorageLimit</code> matches
     * more than one Amazon S3 compatible storage on Snow family devices service configuration.
     * </p>
     * 
     * @param faultTolerance
     *        &gt;Fault tolerance level of the cluster. This indicates the number of nodes that can go down without
     *        degrading the performance of the cluster. This additional input helps when the specified
     *        <code>StorageLimit</code> matches more than one Amazon S3 compatible storage on Snow family devices
     *        service configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3OnDeviceServiceConfiguration withFaultTolerance(Integer faultTolerance) {
        setFaultTolerance(faultTolerance);
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
        if (getStorageLimit() != null)
            sb.append("StorageLimit: ").append(getStorageLimit()).append(",");
        if (getStorageUnit() != null)
            sb.append("StorageUnit: ").append(getStorageUnit()).append(",");
        if (getServiceSize() != null)
            sb.append("ServiceSize: ").append(getServiceSize()).append(",");
        if (getFaultTolerance() != null)
            sb.append("FaultTolerance: ").append(getFaultTolerance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3OnDeviceServiceConfiguration == false)
            return false;
        S3OnDeviceServiceConfiguration other = (S3OnDeviceServiceConfiguration) obj;
        if (other.getStorageLimit() == null ^ this.getStorageLimit() == null)
            return false;
        if (other.getStorageLimit() != null && other.getStorageLimit().equals(this.getStorageLimit()) == false)
            return false;
        if (other.getStorageUnit() == null ^ this.getStorageUnit() == null)
            return false;
        if (other.getStorageUnit() != null && other.getStorageUnit().equals(this.getStorageUnit()) == false)
            return false;
        if (other.getServiceSize() == null ^ this.getServiceSize() == null)
            return false;
        if (other.getServiceSize() != null && other.getServiceSize().equals(this.getServiceSize()) == false)
            return false;
        if (other.getFaultTolerance() == null ^ this.getFaultTolerance() == null)
            return false;
        if (other.getFaultTolerance() != null && other.getFaultTolerance().equals(this.getFaultTolerance()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStorageLimit() == null) ? 0 : getStorageLimit().hashCode());
        hashCode = prime * hashCode + ((getStorageUnit() == null) ? 0 : getStorageUnit().hashCode());
        hashCode = prime * hashCode + ((getServiceSize() == null) ? 0 : getServiceSize().hashCode());
        hashCode = prime * hashCode + ((getFaultTolerance() == null) ? 0 : getFaultTolerance().hashCode());
        return hashCode;
    }

    @Override
    public S3OnDeviceServiceConfiguration clone() {
        try {
            return (S3OnDeviceServiceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.snowball.model.transform.S3OnDeviceServiceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
