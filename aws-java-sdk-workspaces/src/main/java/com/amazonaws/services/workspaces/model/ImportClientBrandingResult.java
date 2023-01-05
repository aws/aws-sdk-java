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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ImportClientBranding" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportClientBrandingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The branding information configured for Windows devices.
     * </p>
     */
    private DefaultClientBrandingAttributes deviceTypeWindows;
    /**
     * <p>
     * The branding information configured for macOS devices.
     * </p>
     */
    private DefaultClientBrandingAttributes deviceTypeOsx;
    /**
     * <p>
     * The branding information configured for Android devices.
     * </p>
     */
    private DefaultClientBrandingAttributes deviceTypeAndroid;
    /**
     * <p>
     * The branding information configured for iOS devices.
     * </p>
     */
    private IosClientBrandingAttributes deviceTypeIos;
    /**
     * <p>
     * The branding information configured for Linux devices.
     * </p>
     */
    private DefaultClientBrandingAttributes deviceTypeLinux;
    /**
     * <p>
     * The branding information configured for web access.
     * </p>
     */
    private DefaultClientBrandingAttributes deviceTypeWeb;

    /**
     * <p>
     * The branding information configured for Windows devices.
     * </p>
     * 
     * @param deviceTypeWindows
     *        The branding information configured for Windows devices.
     */

    public void setDeviceTypeWindows(DefaultClientBrandingAttributes deviceTypeWindows) {
        this.deviceTypeWindows = deviceTypeWindows;
    }

    /**
     * <p>
     * The branding information configured for Windows devices.
     * </p>
     * 
     * @return The branding information configured for Windows devices.
     */

    public DefaultClientBrandingAttributes getDeviceTypeWindows() {
        return this.deviceTypeWindows;
    }

    /**
     * <p>
     * The branding information configured for Windows devices.
     * </p>
     * 
     * @param deviceTypeWindows
     *        The branding information configured for Windows devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportClientBrandingResult withDeviceTypeWindows(DefaultClientBrandingAttributes deviceTypeWindows) {
        setDeviceTypeWindows(deviceTypeWindows);
        return this;
    }

    /**
     * <p>
     * The branding information configured for macOS devices.
     * </p>
     * 
     * @param deviceTypeOsx
     *        The branding information configured for macOS devices.
     */

    public void setDeviceTypeOsx(DefaultClientBrandingAttributes deviceTypeOsx) {
        this.deviceTypeOsx = deviceTypeOsx;
    }

    /**
     * <p>
     * The branding information configured for macOS devices.
     * </p>
     * 
     * @return The branding information configured for macOS devices.
     */

    public DefaultClientBrandingAttributes getDeviceTypeOsx() {
        return this.deviceTypeOsx;
    }

    /**
     * <p>
     * The branding information configured for macOS devices.
     * </p>
     * 
     * @param deviceTypeOsx
     *        The branding information configured for macOS devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportClientBrandingResult withDeviceTypeOsx(DefaultClientBrandingAttributes deviceTypeOsx) {
        setDeviceTypeOsx(deviceTypeOsx);
        return this;
    }

    /**
     * <p>
     * The branding information configured for Android devices.
     * </p>
     * 
     * @param deviceTypeAndroid
     *        The branding information configured for Android devices.
     */

    public void setDeviceTypeAndroid(DefaultClientBrandingAttributes deviceTypeAndroid) {
        this.deviceTypeAndroid = deviceTypeAndroid;
    }

    /**
     * <p>
     * The branding information configured for Android devices.
     * </p>
     * 
     * @return The branding information configured for Android devices.
     */

    public DefaultClientBrandingAttributes getDeviceTypeAndroid() {
        return this.deviceTypeAndroid;
    }

    /**
     * <p>
     * The branding information configured for Android devices.
     * </p>
     * 
     * @param deviceTypeAndroid
     *        The branding information configured for Android devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportClientBrandingResult withDeviceTypeAndroid(DefaultClientBrandingAttributes deviceTypeAndroid) {
        setDeviceTypeAndroid(deviceTypeAndroid);
        return this;
    }

    /**
     * <p>
     * The branding information configured for iOS devices.
     * </p>
     * 
     * @param deviceTypeIos
     *        The branding information configured for iOS devices.
     */

    public void setDeviceTypeIos(IosClientBrandingAttributes deviceTypeIos) {
        this.deviceTypeIos = deviceTypeIos;
    }

    /**
     * <p>
     * The branding information configured for iOS devices.
     * </p>
     * 
     * @return The branding information configured for iOS devices.
     */

    public IosClientBrandingAttributes getDeviceTypeIos() {
        return this.deviceTypeIos;
    }

    /**
     * <p>
     * The branding information configured for iOS devices.
     * </p>
     * 
     * @param deviceTypeIos
     *        The branding information configured for iOS devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportClientBrandingResult withDeviceTypeIos(IosClientBrandingAttributes deviceTypeIos) {
        setDeviceTypeIos(deviceTypeIos);
        return this;
    }

    /**
     * <p>
     * The branding information configured for Linux devices.
     * </p>
     * 
     * @param deviceTypeLinux
     *        The branding information configured for Linux devices.
     */

    public void setDeviceTypeLinux(DefaultClientBrandingAttributes deviceTypeLinux) {
        this.deviceTypeLinux = deviceTypeLinux;
    }

    /**
     * <p>
     * The branding information configured for Linux devices.
     * </p>
     * 
     * @return The branding information configured for Linux devices.
     */

    public DefaultClientBrandingAttributes getDeviceTypeLinux() {
        return this.deviceTypeLinux;
    }

    /**
     * <p>
     * The branding information configured for Linux devices.
     * </p>
     * 
     * @param deviceTypeLinux
     *        The branding information configured for Linux devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportClientBrandingResult withDeviceTypeLinux(DefaultClientBrandingAttributes deviceTypeLinux) {
        setDeviceTypeLinux(deviceTypeLinux);
        return this;
    }

    /**
     * <p>
     * The branding information configured for web access.
     * </p>
     * 
     * @param deviceTypeWeb
     *        The branding information configured for web access.
     */

    public void setDeviceTypeWeb(DefaultClientBrandingAttributes deviceTypeWeb) {
        this.deviceTypeWeb = deviceTypeWeb;
    }

    /**
     * <p>
     * The branding information configured for web access.
     * </p>
     * 
     * @return The branding information configured for web access.
     */

    public DefaultClientBrandingAttributes getDeviceTypeWeb() {
        return this.deviceTypeWeb;
    }

    /**
     * <p>
     * The branding information configured for web access.
     * </p>
     * 
     * @param deviceTypeWeb
     *        The branding information configured for web access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportClientBrandingResult withDeviceTypeWeb(DefaultClientBrandingAttributes deviceTypeWeb) {
        setDeviceTypeWeb(deviceTypeWeb);
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
        if (getDeviceTypeWindows() != null)
            sb.append("DeviceTypeWindows: ").append(getDeviceTypeWindows()).append(",");
        if (getDeviceTypeOsx() != null)
            sb.append("DeviceTypeOsx: ").append(getDeviceTypeOsx()).append(",");
        if (getDeviceTypeAndroid() != null)
            sb.append("DeviceTypeAndroid: ").append(getDeviceTypeAndroid()).append(",");
        if (getDeviceTypeIos() != null)
            sb.append("DeviceTypeIos: ").append(getDeviceTypeIos()).append(",");
        if (getDeviceTypeLinux() != null)
            sb.append("DeviceTypeLinux: ").append(getDeviceTypeLinux()).append(",");
        if (getDeviceTypeWeb() != null)
            sb.append("DeviceTypeWeb: ").append(getDeviceTypeWeb());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportClientBrandingResult == false)
            return false;
        ImportClientBrandingResult other = (ImportClientBrandingResult) obj;
        if (other.getDeviceTypeWindows() == null ^ this.getDeviceTypeWindows() == null)
            return false;
        if (other.getDeviceTypeWindows() != null && other.getDeviceTypeWindows().equals(this.getDeviceTypeWindows()) == false)
            return false;
        if (other.getDeviceTypeOsx() == null ^ this.getDeviceTypeOsx() == null)
            return false;
        if (other.getDeviceTypeOsx() != null && other.getDeviceTypeOsx().equals(this.getDeviceTypeOsx()) == false)
            return false;
        if (other.getDeviceTypeAndroid() == null ^ this.getDeviceTypeAndroid() == null)
            return false;
        if (other.getDeviceTypeAndroid() != null && other.getDeviceTypeAndroid().equals(this.getDeviceTypeAndroid()) == false)
            return false;
        if (other.getDeviceTypeIos() == null ^ this.getDeviceTypeIos() == null)
            return false;
        if (other.getDeviceTypeIos() != null && other.getDeviceTypeIos().equals(this.getDeviceTypeIos()) == false)
            return false;
        if (other.getDeviceTypeLinux() == null ^ this.getDeviceTypeLinux() == null)
            return false;
        if (other.getDeviceTypeLinux() != null && other.getDeviceTypeLinux().equals(this.getDeviceTypeLinux()) == false)
            return false;
        if (other.getDeviceTypeWeb() == null ^ this.getDeviceTypeWeb() == null)
            return false;
        if (other.getDeviceTypeWeb() != null && other.getDeviceTypeWeb().equals(this.getDeviceTypeWeb()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceTypeWindows() == null) ? 0 : getDeviceTypeWindows().hashCode());
        hashCode = prime * hashCode + ((getDeviceTypeOsx() == null) ? 0 : getDeviceTypeOsx().hashCode());
        hashCode = prime * hashCode + ((getDeviceTypeAndroid() == null) ? 0 : getDeviceTypeAndroid().hashCode());
        hashCode = prime * hashCode + ((getDeviceTypeIos() == null) ? 0 : getDeviceTypeIos().hashCode());
        hashCode = prime * hashCode + ((getDeviceTypeLinux() == null) ? 0 : getDeviceTypeLinux().hashCode());
        hashCode = prime * hashCode + ((getDeviceTypeWeb() == null) ? 0 : getDeviceTypeWeb().hashCode());
        return hashCode;
    }

    @Override
    public ImportClientBrandingResult clone() {
        try {
            return (ImportClientBrandingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
