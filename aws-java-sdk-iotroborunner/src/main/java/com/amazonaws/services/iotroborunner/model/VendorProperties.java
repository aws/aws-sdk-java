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
package com.amazonaws.services.iotroborunner.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Properties of the worker that are provided by the vendor FMS.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/VendorProperties" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VendorProperties implements Serializable, Cloneable, StructuredPojo {

    private String vendorWorkerId;

    private String vendorWorkerIpAddress;

    private String vendorAdditionalTransientProperties;

    private String vendorAdditionalFixedProperties;

    /**
     * @param vendorWorkerId
     */

    public void setVendorWorkerId(String vendorWorkerId) {
        this.vendorWorkerId = vendorWorkerId;
    }

    /**
     * @return
     */

    public String getVendorWorkerId() {
        return this.vendorWorkerId;
    }

    /**
     * @param vendorWorkerId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VendorProperties withVendorWorkerId(String vendorWorkerId) {
        setVendorWorkerId(vendorWorkerId);
        return this;
    }

    /**
     * @param vendorWorkerIpAddress
     */

    public void setVendorWorkerIpAddress(String vendorWorkerIpAddress) {
        this.vendorWorkerIpAddress = vendorWorkerIpAddress;
    }

    /**
     * @return
     */

    public String getVendorWorkerIpAddress() {
        return this.vendorWorkerIpAddress;
    }

    /**
     * @param vendorWorkerIpAddress
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VendorProperties withVendorWorkerIpAddress(String vendorWorkerIpAddress) {
        setVendorWorkerIpAddress(vendorWorkerIpAddress);
        return this;
    }

    /**
     * @param vendorAdditionalTransientProperties
     */

    public void setVendorAdditionalTransientProperties(String vendorAdditionalTransientProperties) {
        this.vendorAdditionalTransientProperties = vendorAdditionalTransientProperties;
    }

    /**
     * @return
     */

    public String getVendorAdditionalTransientProperties() {
        return this.vendorAdditionalTransientProperties;
    }

    /**
     * @param vendorAdditionalTransientProperties
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VendorProperties withVendorAdditionalTransientProperties(String vendorAdditionalTransientProperties) {
        setVendorAdditionalTransientProperties(vendorAdditionalTransientProperties);
        return this;
    }

    /**
     * @param vendorAdditionalFixedProperties
     */

    public void setVendorAdditionalFixedProperties(String vendorAdditionalFixedProperties) {
        this.vendorAdditionalFixedProperties = vendorAdditionalFixedProperties;
    }

    /**
     * @return
     */

    public String getVendorAdditionalFixedProperties() {
        return this.vendorAdditionalFixedProperties;
    }

    /**
     * @param vendorAdditionalFixedProperties
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VendorProperties withVendorAdditionalFixedProperties(String vendorAdditionalFixedProperties) {
        setVendorAdditionalFixedProperties(vendorAdditionalFixedProperties);
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
        if (getVendorWorkerId() != null)
            sb.append("VendorWorkerId: ").append(getVendorWorkerId()).append(",");
        if (getVendorWorkerIpAddress() != null)
            sb.append("VendorWorkerIpAddress: ").append(getVendorWorkerIpAddress()).append(",");
        if (getVendorAdditionalTransientProperties() != null)
            sb.append("VendorAdditionalTransientProperties: ").append(getVendorAdditionalTransientProperties()).append(",");
        if (getVendorAdditionalFixedProperties() != null)
            sb.append("VendorAdditionalFixedProperties: ").append(getVendorAdditionalFixedProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VendorProperties == false)
            return false;
        VendorProperties other = (VendorProperties) obj;
        if (other.getVendorWorkerId() == null ^ this.getVendorWorkerId() == null)
            return false;
        if (other.getVendorWorkerId() != null && other.getVendorWorkerId().equals(this.getVendorWorkerId()) == false)
            return false;
        if (other.getVendorWorkerIpAddress() == null ^ this.getVendorWorkerIpAddress() == null)
            return false;
        if (other.getVendorWorkerIpAddress() != null && other.getVendorWorkerIpAddress().equals(this.getVendorWorkerIpAddress()) == false)
            return false;
        if (other.getVendorAdditionalTransientProperties() == null ^ this.getVendorAdditionalTransientProperties() == null)
            return false;
        if (other.getVendorAdditionalTransientProperties() != null
                && other.getVendorAdditionalTransientProperties().equals(this.getVendorAdditionalTransientProperties()) == false)
            return false;
        if (other.getVendorAdditionalFixedProperties() == null ^ this.getVendorAdditionalFixedProperties() == null)
            return false;
        if (other.getVendorAdditionalFixedProperties() != null
                && other.getVendorAdditionalFixedProperties().equals(this.getVendorAdditionalFixedProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVendorWorkerId() == null) ? 0 : getVendorWorkerId().hashCode());
        hashCode = prime * hashCode + ((getVendorWorkerIpAddress() == null) ? 0 : getVendorWorkerIpAddress().hashCode());
        hashCode = prime * hashCode + ((getVendorAdditionalTransientProperties() == null) ? 0 : getVendorAdditionalTransientProperties().hashCode());
        hashCode = prime * hashCode + ((getVendorAdditionalFixedProperties() == null) ? 0 : getVendorAdditionalFixedProperties().hashCode());
        return hashCode;
    }

    @Override
    public VendorProperties clone() {
        try {
            return (VendorProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotroborunner.model.transform.VendorPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
