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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the VPC options.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/VpcOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether IPv6 is supported.
     * </p>
     */
    private Boolean ipv6Support;
    /**
     * <p>
     * Indicates whether appliance mode is supported. If enabled, traffic flow between a source and destination use the
     * same Availability Zone for the VPC attachment for the lifetime of that flow. The default value is
     * <code>false</code>.
     * </p>
     */
    private Boolean applianceModeSupport;

    /**
     * <p>
     * Indicates whether IPv6 is supported.
     * </p>
     * 
     * @param ipv6Support
     *        Indicates whether IPv6 is supported.
     */

    public void setIpv6Support(Boolean ipv6Support) {
        this.ipv6Support = ipv6Support;
    }

    /**
     * <p>
     * Indicates whether IPv6 is supported.
     * </p>
     * 
     * @return Indicates whether IPv6 is supported.
     */

    public Boolean getIpv6Support() {
        return this.ipv6Support;
    }

    /**
     * <p>
     * Indicates whether IPv6 is supported.
     * </p>
     * 
     * @param ipv6Support
     *        Indicates whether IPv6 is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcOptions withIpv6Support(Boolean ipv6Support) {
        setIpv6Support(ipv6Support);
        return this;
    }

    /**
     * <p>
     * Indicates whether IPv6 is supported.
     * </p>
     * 
     * @return Indicates whether IPv6 is supported.
     */

    public Boolean isIpv6Support() {
        return this.ipv6Support;
    }

    /**
     * <p>
     * Indicates whether appliance mode is supported. If enabled, traffic flow between a source and destination use the
     * same Availability Zone for the VPC attachment for the lifetime of that flow. The default value is
     * <code>false</code>.
     * </p>
     * 
     * @param applianceModeSupport
     *        Indicates whether appliance mode is supported. If enabled, traffic flow between a source and destination
     *        use the same Availability Zone for the VPC attachment for the lifetime of that flow. The default value is
     *        <code>false</code>.
     */

    public void setApplianceModeSupport(Boolean applianceModeSupport) {
        this.applianceModeSupport = applianceModeSupport;
    }

    /**
     * <p>
     * Indicates whether appliance mode is supported. If enabled, traffic flow between a source and destination use the
     * same Availability Zone for the VPC attachment for the lifetime of that flow. The default value is
     * <code>false</code>.
     * </p>
     * 
     * @return Indicates whether appliance mode is supported. If enabled, traffic flow between a source and destination
     *         use the same Availability Zone for the VPC attachment for the lifetime of that flow. The default value is
     *         <code>false</code>.
     */

    public Boolean getApplianceModeSupport() {
        return this.applianceModeSupport;
    }

    /**
     * <p>
     * Indicates whether appliance mode is supported. If enabled, traffic flow between a source and destination use the
     * same Availability Zone for the VPC attachment for the lifetime of that flow. The default value is
     * <code>false</code>.
     * </p>
     * 
     * @param applianceModeSupport
     *        Indicates whether appliance mode is supported. If enabled, traffic flow between a source and destination
     *        use the same Availability Zone for the VPC attachment for the lifetime of that flow. The default value is
     *        <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcOptions withApplianceModeSupport(Boolean applianceModeSupport) {
        setApplianceModeSupport(applianceModeSupport);
        return this;
    }

    /**
     * <p>
     * Indicates whether appliance mode is supported. If enabled, traffic flow between a source and destination use the
     * same Availability Zone for the VPC attachment for the lifetime of that flow. The default value is
     * <code>false</code>.
     * </p>
     * 
     * @return Indicates whether appliance mode is supported. If enabled, traffic flow between a source and destination
     *         use the same Availability Zone for the VPC attachment for the lifetime of that flow. The default value is
     *         <code>false</code>.
     */

    public Boolean isApplianceModeSupport() {
        return this.applianceModeSupport;
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
        if (getIpv6Support() != null)
            sb.append("Ipv6Support: ").append(getIpv6Support()).append(",");
        if (getApplianceModeSupport() != null)
            sb.append("ApplianceModeSupport: ").append(getApplianceModeSupport());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcOptions == false)
            return false;
        VpcOptions other = (VpcOptions) obj;
        if (other.getIpv6Support() == null ^ this.getIpv6Support() == null)
            return false;
        if (other.getIpv6Support() != null && other.getIpv6Support().equals(this.getIpv6Support()) == false)
            return false;
        if (other.getApplianceModeSupport() == null ^ this.getApplianceModeSupport() == null)
            return false;
        if (other.getApplianceModeSupport() != null && other.getApplianceModeSupport().equals(this.getApplianceModeSupport()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpv6Support() == null) ? 0 : getIpv6Support().hashCode());
        hashCode = prime * hashCode + ((getApplianceModeSupport() == null) ? 0 : getApplianceModeSupport().hashCode());
        return hashCode;
    }

    @Override
    public VpcOptions clone() {
        try {
            return (VpcOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.VpcOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
