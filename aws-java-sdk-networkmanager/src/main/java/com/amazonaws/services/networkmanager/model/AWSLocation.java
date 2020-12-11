/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a location in AWS.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/AWSLocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Zone the device is located in. This can be the ID of an Availability Zone, Local Zone, Wavelength Zone, or an
     * Outpost.
     * </p>
     */
    private String zone;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the subnet the device is located in.
     * </p>
     */
    private String subnetArn;

    /**
     * <p>
     * The Zone the device is located in. This can be the ID of an Availability Zone, Local Zone, Wavelength Zone, or an
     * Outpost.
     * </p>
     * 
     * @param zone
     *        The Zone the device is located in. This can be the ID of an Availability Zone, Local Zone, Wavelength
     *        Zone, or an Outpost.
     */

    public void setZone(String zone) {
        this.zone = zone;
    }

    /**
     * <p>
     * The Zone the device is located in. This can be the ID of an Availability Zone, Local Zone, Wavelength Zone, or an
     * Outpost.
     * </p>
     * 
     * @return The Zone the device is located in. This can be the ID of an Availability Zone, Local Zone, Wavelength
     *         Zone, or an Outpost.
     */

    public String getZone() {
        return this.zone;
    }

    /**
     * <p>
     * The Zone the device is located in. This can be the ID of an Availability Zone, Local Zone, Wavelength Zone, or an
     * Outpost.
     * </p>
     * 
     * @param zone
     *        The Zone the device is located in. This can be the ID of an Availability Zone, Local Zone, Wavelength
     *        Zone, or an Outpost.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AWSLocation withZone(String zone) {
        setZone(zone);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the subnet the device is located in.
     * </p>
     * 
     * @param subnetArn
     *        The Amazon Resource Name (ARN) of the subnet the device is located in.
     */

    public void setSubnetArn(String subnetArn) {
        this.subnetArn = subnetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the subnet the device is located in.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the subnet the device is located in.
     */

    public String getSubnetArn() {
        return this.subnetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the subnet the device is located in.
     * </p>
     * 
     * @param subnetArn
     *        The Amazon Resource Name (ARN) of the subnet the device is located in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AWSLocation withSubnetArn(String subnetArn) {
        setSubnetArn(subnetArn);
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
        if (getZone() != null)
            sb.append("Zone: ").append(getZone()).append(",");
        if (getSubnetArn() != null)
            sb.append("SubnetArn: ").append(getSubnetArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AWSLocation == false)
            return false;
        AWSLocation other = (AWSLocation) obj;
        if (other.getZone() == null ^ this.getZone() == null)
            return false;
        if (other.getZone() != null && other.getZone().equals(this.getZone()) == false)
            return false;
        if (other.getSubnetArn() == null ^ this.getSubnetArn() == null)
            return false;
        if (other.getSubnetArn() != null && other.getSubnetArn().equals(this.getSubnetArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getZone() == null) ? 0 : getZone().hashCode());
        hashCode = prime * hashCode + ((getSubnetArn() == null) ? 0 : getSubnetArn().hashCode());
        return hashCode;
    }

    @Override
    public AWSLocation clone() {
        try {
            return (AWSLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.AWSLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
