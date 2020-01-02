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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateDevice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDeviceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the global network.
     * </p>
     */
    private String globalNetworkId;
    /**
     * <p>
     * The ID of the device.
     * </p>
     */
    private String deviceId;
    /**
     * <p>
     * A description of the device.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 256 characters.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The type of the device.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The vendor of the device.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 128 characters.
     * </p>
     */
    private String vendor;
    /**
     * <p>
     * The model of the device.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 128 characters.
     * </p>
     */
    private String model;
    /**
     * <p>
     * The serial number of the device.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 128 characters.
     * </p>
     */
    private String serialNumber;

    private Location location;
    /**
     * <p>
     * The ID of the site.
     * </p>
     */
    private String siteId;

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @param globalNetworkId
     *        The ID of the global network.
     */

    public void setGlobalNetworkId(String globalNetworkId) {
        this.globalNetworkId = globalNetworkId;
    }

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @return The ID of the global network.
     */

    public String getGlobalNetworkId() {
        return this.globalNetworkId;
    }

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @param globalNetworkId
     *        The ID of the global network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeviceRequest withGlobalNetworkId(String globalNetworkId) {
        setGlobalNetworkId(globalNetworkId);
        return this;
    }

    /**
     * <p>
     * The ID of the device.
     * </p>
     * 
     * @param deviceId
     *        The ID of the device.
     */

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * <p>
     * The ID of the device.
     * </p>
     * 
     * @return The ID of the device.
     */

    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * <p>
     * The ID of the device.
     * </p>
     * 
     * @param deviceId
     *        The ID of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeviceRequest withDeviceId(String deviceId) {
        setDeviceId(deviceId);
        return this;
    }

    /**
     * <p>
     * A description of the device.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 256 characters.
     * </p>
     * 
     * @param description
     *        A description of the device.</p>
     *        <p>
     *        Length Constraints: Maximum length of 256 characters.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the device.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 256 characters.
     * </p>
     * 
     * @return A description of the device.</p>
     *         <p>
     *         Length Constraints: Maximum length of 256 characters.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the device.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 256 characters.
     * </p>
     * 
     * @param description
     *        A description of the device.</p>
     *        <p>
     *        Length Constraints: Maximum length of 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeviceRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The type of the device.
     * </p>
     * 
     * @param type
     *        The type of the device.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the device.
     * </p>
     * 
     * @return The type of the device.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the device.
     * </p>
     * 
     * @param type
     *        The type of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeviceRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The vendor of the device.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 128 characters.
     * </p>
     * 
     * @param vendor
     *        The vendor of the device.</p>
     *        <p>
     *        Length Constraints: Maximum length of 128 characters.
     */

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    /**
     * <p>
     * The vendor of the device.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 128 characters.
     * </p>
     * 
     * @return The vendor of the device.</p>
     *         <p>
     *         Length Constraints: Maximum length of 128 characters.
     */

    public String getVendor() {
        return this.vendor;
    }

    /**
     * <p>
     * The vendor of the device.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 128 characters.
     * </p>
     * 
     * @param vendor
     *        The vendor of the device.</p>
     *        <p>
     *        Length Constraints: Maximum length of 128 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeviceRequest withVendor(String vendor) {
        setVendor(vendor);
        return this;
    }

    /**
     * <p>
     * The model of the device.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 128 characters.
     * </p>
     * 
     * @param model
     *        The model of the device.</p>
     *        <p>
     *        Length Constraints: Maximum length of 128 characters.
     */

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * <p>
     * The model of the device.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 128 characters.
     * </p>
     * 
     * @return The model of the device.</p>
     *         <p>
     *         Length Constraints: Maximum length of 128 characters.
     */

    public String getModel() {
        return this.model;
    }

    /**
     * <p>
     * The model of the device.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 128 characters.
     * </p>
     * 
     * @param model
     *        The model of the device.</p>
     *        <p>
     *        Length Constraints: Maximum length of 128 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeviceRequest withModel(String model) {
        setModel(model);
        return this;
    }

    /**
     * <p>
     * The serial number of the device.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 128 characters.
     * </p>
     * 
     * @param serialNumber
     *        The serial number of the device.</p>
     *        <p>
     *        Length Constraints: Maximum length of 128 characters.
     */

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * <p>
     * The serial number of the device.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 128 characters.
     * </p>
     * 
     * @return The serial number of the device.</p>
     *         <p>
     *         Length Constraints: Maximum length of 128 characters.
     */

    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * <p>
     * The serial number of the device.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 128 characters.
     * </p>
     * 
     * @param serialNumber
     *        The serial number of the device.</p>
     *        <p>
     *        Length Constraints: Maximum length of 128 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeviceRequest withSerialNumber(String serialNumber) {
        setSerialNumber(serialNumber);
        return this;
    }

    /**
     * @param location
     */

    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * @return
     */

    public Location getLocation() {
        return this.location;
    }

    /**
     * @param location
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeviceRequest withLocation(Location location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The ID of the site.
     * </p>
     * 
     * @param siteId
     *        The ID of the site.
     */

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    /**
     * <p>
     * The ID of the site.
     * </p>
     * 
     * @return The ID of the site.
     */

    public String getSiteId() {
        return this.siteId;
    }

    /**
     * <p>
     * The ID of the site.
     * </p>
     * 
     * @param siteId
     *        The ID of the site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeviceRequest withSiteId(String siteId) {
        setSiteId(siteId);
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
        if (getGlobalNetworkId() != null)
            sb.append("GlobalNetworkId: ").append(getGlobalNetworkId()).append(",");
        if (getDeviceId() != null)
            sb.append("DeviceId: ").append(getDeviceId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getVendor() != null)
            sb.append("Vendor: ").append(getVendor()).append(",");
        if (getModel() != null)
            sb.append("Model: ").append(getModel()).append(",");
        if (getSerialNumber() != null)
            sb.append("SerialNumber: ").append(getSerialNumber()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getSiteId() != null)
            sb.append("SiteId: ").append(getSiteId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDeviceRequest == false)
            return false;
        UpdateDeviceRequest other = (UpdateDeviceRequest) obj;
        if (other.getGlobalNetworkId() == null ^ this.getGlobalNetworkId() == null)
            return false;
        if (other.getGlobalNetworkId() != null && other.getGlobalNetworkId().equals(this.getGlobalNetworkId()) == false)
            return false;
        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getVendor() == null ^ this.getVendor() == null)
            return false;
        if (other.getVendor() != null && other.getVendor().equals(this.getVendor()) == false)
            return false;
        if (other.getModel() == null ^ this.getModel() == null)
            return false;
        if (other.getModel() != null && other.getModel().equals(this.getModel()) == false)
            return false;
        if (other.getSerialNumber() == null ^ this.getSerialNumber() == null)
            return false;
        if (other.getSerialNumber() != null && other.getSerialNumber().equals(this.getSerialNumber()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getSiteId() == null ^ this.getSiteId() == null)
            return false;
        if (other.getSiteId() != null && other.getSiteId().equals(this.getSiteId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalNetworkId() == null) ? 0 : getGlobalNetworkId().hashCode());
        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getVendor() == null) ? 0 : getVendor().hashCode());
        hashCode = prime * hashCode + ((getModel() == null) ? 0 : getModel().hashCode());
        hashCode = prime * hashCode + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getSiteId() == null) ? 0 : getSiteId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDeviceRequest clone() {
        return (UpdateDeviceRequest) super.clone();
    }

}
