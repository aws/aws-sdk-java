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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the virtual router.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/RouterType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RouterType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The vendor for the virtual interface's router.
     * </p>
     */
    private String vendor;
    /**
     * <p>
     * The virtual interface router platform.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The router software.
     * </p>
     */
    private String software;
    /**
     * <p>
     * The template for the virtual interface's router.
     * </p>
     */
    private String xsltTemplateName;
    /**
     * <p>
     * The MAC Security (MACsec) template for the virtual interface's router.
     * </p>
     */
    private String xsltTemplateNameForMacSec;
    /**
     * <p>
     * Identifies the router by a combination of vendor, platform, and software version. For example,
     * <code>CiscoSystemsInc-2900SeriesRouters-IOS124</code>.
     * </p>
     */
    private String routerTypeIdentifier;

    /**
     * <p>
     * The vendor for the virtual interface's router.
     * </p>
     * 
     * @param vendor
     *        The vendor for the virtual interface's router.
     */

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    /**
     * <p>
     * The vendor for the virtual interface's router.
     * </p>
     * 
     * @return The vendor for the virtual interface's router.
     */

    public String getVendor() {
        return this.vendor;
    }

    /**
     * <p>
     * The vendor for the virtual interface's router.
     * </p>
     * 
     * @param vendor
     *        The vendor for the virtual interface's router.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouterType withVendor(String vendor) {
        setVendor(vendor);
        return this;
    }

    /**
     * <p>
     * The virtual interface router platform.
     * </p>
     * 
     * @param platform
     *        The virtual interface router platform.
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The virtual interface router platform.
     * </p>
     * 
     * @return The virtual interface router platform.
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The virtual interface router platform.
     * </p>
     * 
     * @param platform
     *        The virtual interface router platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouterType withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The router software.
     * </p>
     * 
     * @param software
     *        The router software.
     */

    public void setSoftware(String software) {
        this.software = software;
    }

    /**
     * <p>
     * The router software.
     * </p>
     * 
     * @return The router software.
     */

    public String getSoftware() {
        return this.software;
    }

    /**
     * <p>
     * The router software.
     * </p>
     * 
     * @param software
     *        The router software.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouterType withSoftware(String software) {
        setSoftware(software);
        return this;
    }

    /**
     * <p>
     * The template for the virtual interface's router.
     * </p>
     * 
     * @param xsltTemplateName
     *        The template for the virtual interface's router.
     */

    public void setXsltTemplateName(String xsltTemplateName) {
        this.xsltTemplateName = xsltTemplateName;
    }

    /**
     * <p>
     * The template for the virtual interface's router.
     * </p>
     * 
     * @return The template for the virtual interface's router.
     */

    public String getXsltTemplateName() {
        return this.xsltTemplateName;
    }

    /**
     * <p>
     * The template for the virtual interface's router.
     * </p>
     * 
     * @param xsltTemplateName
     *        The template for the virtual interface's router.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouterType withXsltTemplateName(String xsltTemplateName) {
        setXsltTemplateName(xsltTemplateName);
        return this;
    }

    /**
     * <p>
     * The MAC Security (MACsec) template for the virtual interface's router.
     * </p>
     * 
     * @param xsltTemplateNameForMacSec
     *        The MAC Security (MACsec) template for the virtual interface's router.
     */

    public void setXsltTemplateNameForMacSec(String xsltTemplateNameForMacSec) {
        this.xsltTemplateNameForMacSec = xsltTemplateNameForMacSec;
    }

    /**
     * <p>
     * The MAC Security (MACsec) template for the virtual interface's router.
     * </p>
     * 
     * @return The MAC Security (MACsec) template for the virtual interface's router.
     */

    public String getXsltTemplateNameForMacSec() {
        return this.xsltTemplateNameForMacSec;
    }

    /**
     * <p>
     * The MAC Security (MACsec) template for the virtual interface's router.
     * </p>
     * 
     * @param xsltTemplateNameForMacSec
     *        The MAC Security (MACsec) template for the virtual interface's router.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouterType withXsltTemplateNameForMacSec(String xsltTemplateNameForMacSec) {
        setXsltTemplateNameForMacSec(xsltTemplateNameForMacSec);
        return this;
    }

    /**
     * <p>
     * Identifies the router by a combination of vendor, platform, and software version. For example,
     * <code>CiscoSystemsInc-2900SeriesRouters-IOS124</code>.
     * </p>
     * 
     * @param routerTypeIdentifier
     *        Identifies the router by a combination of vendor, platform, and software version. For example,
     *        <code>CiscoSystemsInc-2900SeriesRouters-IOS124</code>.
     */

    public void setRouterTypeIdentifier(String routerTypeIdentifier) {
        this.routerTypeIdentifier = routerTypeIdentifier;
    }

    /**
     * <p>
     * Identifies the router by a combination of vendor, platform, and software version. For example,
     * <code>CiscoSystemsInc-2900SeriesRouters-IOS124</code>.
     * </p>
     * 
     * @return Identifies the router by a combination of vendor, platform, and software version. For example,
     *         <code>CiscoSystemsInc-2900SeriesRouters-IOS124</code>.
     */

    public String getRouterTypeIdentifier() {
        return this.routerTypeIdentifier;
    }

    /**
     * <p>
     * Identifies the router by a combination of vendor, platform, and software version. For example,
     * <code>CiscoSystemsInc-2900SeriesRouters-IOS124</code>.
     * </p>
     * 
     * @param routerTypeIdentifier
     *        Identifies the router by a combination of vendor, platform, and software version. For example,
     *        <code>CiscoSystemsInc-2900SeriesRouters-IOS124</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouterType withRouterTypeIdentifier(String routerTypeIdentifier) {
        setRouterTypeIdentifier(routerTypeIdentifier);
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
        if (getVendor() != null)
            sb.append("Vendor: ").append(getVendor()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getSoftware() != null)
            sb.append("Software: ").append(getSoftware()).append(",");
        if (getXsltTemplateName() != null)
            sb.append("XsltTemplateName: ").append(getXsltTemplateName()).append(",");
        if (getXsltTemplateNameForMacSec() != null)
            sb.append("XsltTemplateNameForMacSec: ").append(getXsltTemplateNameForMacSec()).append(",");
        if (getRouterTypeIdentifier() != null)
            sb.append("RouterTypeIdentifier: ").append(getRouterTypeIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RouterType == false)
            return false;
        RouterType other = (RouterType) obj;
        if (other.getVendor() == null ^ this.getVendor() == null)
            return false;
        if (other.getVendor() != null && other.getVendor().equals(this.getVendor()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getSoftware() == null ^ this.getSoftware() == null)
            return false;
        if (other.getSoftware() != null && other.getSoftware().equals(this.getSoftware()) == false)
            return false;
        if (other.getXsltTemplateName() == null ^ this.getXsltTemplateName() == null)
            return false;
        if (other.getXsltTemplateName() != null && other.getXsltTemplateName().equals(this.getXsltTemplateName()) == false)
            return false;
        if (other.getXsltTemplateNameForMacSec() == null ^ this.getXsltTemplateNameForMacSec() == null)
            return false;
        if (other.getXsltTemplateNameForMacSec() != null && other.getXsltTemplateNameForMacSec().equals(this.getXsltTemplateNameForMacSec()) == false)
            return false;
        if (other.getRouterTypeIdentifier() == null ^ this.getRouterTypeIdentifier() == null)
            return false;
        if (other.getRouterTypeIdentifier() != null && other.getRouterTypeIdentifier().equals(this.getRouterTypeIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVendor() == null) ? 0 : getVendor().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getSoftware() == null) ? 0 : getSoftware().hashCode());
        hashCode = prime * hashCode + ((getXsltTemplateName() == null) ? 0 : getXsltTemplateName().hashCode());
        hashCode = prime * hashCode + ((getXsltTemplateNameForMacSec() == null) ? 0 : getXsltTemplateNameForMacSec().hashCode());
        hashCode = prime * hashCode + ((getRouterTypeIdentifier() == null) ? 0 : getRouterTypeIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public RouterType clone() {
        try {
            return (RouterType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directconnect.model.transform.RouterTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
