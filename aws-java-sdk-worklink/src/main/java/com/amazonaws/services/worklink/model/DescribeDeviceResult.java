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
package com.amazonaws.services.worklink.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/DescribeDevice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDeviceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The current state of the device.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The model of the device.
     * </p>
     */
    private String model;
    /**
     * <p>
     * The manufacturer of the device.
     * </p>
     */
    private String manufacturer;
    /**
     * <p>
     * The operating system of the device.
     * </p>
     */
    private String operatingSystem;
    /**
     * <p>
     * The operating system version of the device.
     * </p>
     */
    private String operatingSystemVersion;
    /**
     * <p>
     * The operating system patch level of the device.
     * </p>
     */
    private String patchLevel;
    /**
     * <p>
     * The date that the device first signed in to Amazon WorkLink.
     * </p>
     */
    private java.util.Date firstAccessedTime;
    /**
     * <p>
     * The date that the device last accessed Amazon WorkLink.
     * </p>
     */
    private java.util.Date lastAccessedTime;
    /**
     * <p>
     * The user name associated with the device.
     * </p>
     */
    private String username;

    /**
     * <p>
     * The current state of the device.
     * </p>
     * 
     * @param status
     *        The current state of the device.
     * @see DeviceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the device.
     * </p>
     * 
     * @return The current state of the device.
     * @see DeviceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current state of the device.
     * </p>
     * 
     * @param status
     *        The current state of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceStatus
     */

    public DescribeDeviceResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current state of the device.
     * </p>
     * 
     * @param status
     *        The current state of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceStatus
     */

    public DescribeDeviceResult withStatus(DeviceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The model of the device.
     * </p>
     * 
     * @param model
     *        The model of the device.
     */

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * <p>
     * The model of the device.
     * </p>
     * 
     * @return The model of the device.
     */

    public String getModel() {
        return this.model;
    }

    /**
     * <p>
     * The model of the device.
     * </p>
     * 
     * @param model
     *        The model of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withModel(String model) {
        setModel(model);
        return this;
    }

    /**
     * <p>
     * The manufacturer of the device.
     * </p>
     * 
     * @param manufacturer
     *        The manufacturer of the device.
     */

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * <p>
     * The manufacturer of the device.
     * </p>
     * 
     * @return The manufacturer of the device.
     */

    public String getManufacturer() {
        return this.manufacturer;
    }

    /**
     * <p>
     * The manufacturer of the device.
     * </p>
     * 
     * @param manufacturer
     *        The manufacturer of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withManufacturer(String manufacturer) {
        setManufacturer(manufacturer);
        return this;
    }

    /**
     * <p>
     * The operating system of the device.
     * </p>
     * 
     * @param operatingSystem
     *        The operating system of the device.
     */

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * <p>
     * The operating system of the device.
     * </p>
     * 
     * @return The operating system of the device.
     */

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * <p>
     * The operating system of the device.
     * </p>
     * 
     * @param operatingSystem
     *        The operating system of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withOperatingSystem(String operatingSystem) {
        setOperatingSystem(operatingSystem);
        return this;
    }

    /**
     * <p>
     * The operating system version of the device.
     * </p>
     * 
     * @param operatingSystemVersion
     *        The operating system version of the device.
     */

    public void setOperatingSystemVersion(String operatingSystemVersion) {
        this.operatingSystemVersion = operatingSystemVersion;
    }

    /**
     * <p>
     * The operating system version of the device.
     * </p>
     * 
     * @return The operating system version of the device.
     */

    public String getOperatingSystemVersion() {
        return this.operatingSystemVersion;
    }

    /**
     * <p>
     * The operating system version of the device.
     * </p>
     * 
     * @param operatingSystemVersion
     *        The operating system version of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withOperatingSystemVersion(String operatingSystemVersion) {
        setOperatingSystemVersion(operatingSystemVersion);
        return this;
    }

    /**
     * <p>
     * The operating system patch level of the device.
     * </p>
     * 
     * @param patchLevel
     *        The operating system patch level of the device.
     */

    public void setPatchLevel(String patchLevel) {
        this.patchLevel = patchLevel;
    }

    /**
     * <p>
     * The operating system patch level of the device.
     * </p>
     * 
     * @return The operating system patch level of the device.
     */

    public String getPatchLevel() {
        return this.patchLevel;
    }

    /**
     * <p>
     * The operating system patch level of the device.
     * </p>
     * 
     * @param patchLevel
     *        The operating system patch level of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withPatchLevel(String patchLevel) {
        setPatchLevel(patchLevel);
        return this;
    }

    /**
     * <p>
     * The date that the device first signed in to Amazon WorkLink.
     * </p>
     * 
     * @param firstAccessedTime
     *        The date that the device first signed in to Amazon WorkLink.
     */

    public void setFirstAccessedTime(java.util.Date firstAccessedTime) {
        this.firstAccessedTime = firstAccessedTime;
    }

    /**
     * <p>
     * The date that the device first signed in to Amazon WorkLink.
     * </p>
     * 
     * @return The date that the device first signed in to Amazon WorkLink.
     */

    public java.util.Date getFirstAccessedTime() {
        return this.firstAccessedTime;
    }

    /**
     * <p>
     * The date that the device first signed in to Amazon WorkLink.
     * </p>
     * 
     * @param firstAccessedTime
     *        The date that the device first signed in to Amazon WorkLink.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withFirstAccessedTime(java.util.Date firstAccessedTime) {
        setFirstAccessedTime(firstAccessedTime);
        return this;
    }

    /**
     * <p>
     * The date that the device last accessed Amazon WorkLink.
     * </p>
     * 
     * @param lastAccessedTime
     *        The date that the device last accessed Amazon WorkLink.
     */

    public void setLastAccessedTime(java.util.Date lastAccessedTime) {
        this.lastAccessedTime = lastAccessedTime;
    }

    /**
     * <p>
     * The date that the device last accessed Amazon WorkLink.
     * </p>
     * 
     * @return The date that the device last accessed Amazon WorkLink.
     */

    public java.util.Date getLastAccessedTime() {
        return this.lastAccessedTime;
    }

    /**
     * <p>
     * The date that the device last accessed Amazon WorkLink.
     * </p>
     * 
     * @param lastAccessedTime
     *        The date that the device last accessed Amazon WorkLink.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withLastAccessedTime(java.util.Date lastAccessedTime) {
        setLastAccessedTime(lastAccessedTime);
        return this;
    }

    /**
     * <p>
     * The user name associated with the device.
     * </p>
     * 
     * @param username
     *        The user name associated with the device.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name associated with the device.
     * </p>
     * 
     * @return The user name associated with the device.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The user name associated with the device.
     * </p>
     * 
     * @param username
     *        The user name associated with the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withUsername(String username) {
        setUsername(username);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getModel() != null)
            sb.append("Model: ").append(getModel()).append(",");
        if (getManufacturer() != null)
            sb.append("Manufacturer: ").append(getManufacturer()).append(",");
        if (getOperatingSystem() != null)
            sb.append("OperatingSystem: ").append(getOperatingSystem()).append(",");
        if (getOperatingSystemVersion() != null)
            sb.append("OperatingSystemVersion: ").append(getOperatingSystemVersion()).append(",");
        if (getPatchLevel() != null)
            sb.append("PatchLevel: ").append(getPatchLevel()).append(",");
        if (getFirstAccessedTime() != null)
            sb.append("FirstAccessedTime: ").append(getFirstAccessedTime()).append(",");
        if (getLastAccessedTime() != null)
            sb.append("LastAccessedTime: ").append(getLastAccessedTime()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDeviceResult == false)
            return false;
        DescribeDeviceResult other = (DescribeDeviceResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getModel() == null ^ this.getModel() == null)
            return false;
        if (other.getModel() != null && other.getModel().equals(this.getModel()) == false)
            return false;
        if (other.getManufacturer() == null ^ this.getManufacturer() == null)
            return false;
        if (other.getManufacturer() != null && other.getManufacturer().equals(this.getManufacturer()) == false)
            return false;
        if (other.getOperatingSystem() == null ^ this.getOperatingSystem() == null)
            return false;
        if (other.getOperatingSystem() != null && other.getOperatingSystem().equals(this.getOperatingSystem()) == false)
            return false;
        if (other.getOperatingSystemVersion() == null ^ this.getOperatingSystemVersion() == null)
            return false;
        if (other.getOperatingSystemVersion() != null && other.getOperatingSystemVersion().equals(this.getOperatingSystemVersion()) == false)
            return false;
        if (other.getPatchLevel() == null ^ this.getPatchLevel() == null)
            return false;
        if (other.getPatchLevel() != null && other.getPatchLevel().equals(this.getPatchLevel()) == false)
            return false;
        if (other.getFirstAccessedTime() == null ^ this.getFirstAccessedTime() == null)
            return false;
        if (other.getFirstAccessedTime() != null && other.getFirstAccessedTime().equals(this.getFirstAccessedTime()) == false)
            return false;
        if (other.getLastAccessedTime() == null ^ this.getLastAccessedTime() == null)
            return false;
        if (other.getLastAccessedTime() != null && other.getLastAccessedTime().equals(this.getLastAccessedTime()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getModel() == null) ? 0 : getModel().hashCode());
        hashCode = prime * hashCode + ((getManufacturer() == null) ? 0 : getManufacturer().hashCode());
        hashCode = prime * hashCode + ((getOperatingSystem() == null) ? 0 : getOperatingSystem().hashCode());
        hashCode = prime * hashCode + ((getOperatingSystemVersion() == null) ? 0 : getOperatingSystemVersion().hashCode());
        hashCode = prime * hashCode + ((getPatchLevel() == null) ? 0 : getPatchLevel().hashCode());
        hashCode = prime * hashCode + ((getFirstAccessedTime() == null) ? 0 : getFirstAccessedTime().hashCode());
        hashCode = prime * hashCode + ((getLastAccessedTime() == null) ? 0 : getLastAccessedTime().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDeviceResult clone() {
        try {
            return (DescribeDeviceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
