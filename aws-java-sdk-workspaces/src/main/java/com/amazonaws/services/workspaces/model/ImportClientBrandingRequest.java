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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ImportClientBranding" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportClientBrandingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The directory identifier of the WorkSpace for which you want to import client branding.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The branding information to import for Windows devices.
     * </p>
     */
    private DefaultImportClientBrandingAttributes deviceTypeWindows;
    /**
     * <p>
     * The branding information to import for macOS devices.
     * </p>
     */
    private DefaultImportClientBrandingAttributes deviceTypeOsx;
    /**
     * <p>
     * The branding information to import for Android devices.
     * </p>
     */
    private DefaultImportClientBrandingAttributes deviceTypeAndroid;
    /**
     * <p>
     * The branding information to import for iOS devices.
     * </p>
     */
    private IosImportClientBrandingAttributes deviceTypeIos;
    /**
     * <p>
     * The branding information to import for Linux devices.
     * </p>
     */
    private DefaultImportClientBrandingAttributes deviceTypeLinux;
    /**
     * <p>
     * The branding information to import for web access.
     * </p>
     */
    private DefaultImportClientBrandingAttributes deviceTypeWeb;

    /**
     * <p>
     * The directory identifier of the WorkSpace for which you want to import client branding.
     * </p>
     * 
     * @param resourceId
     *        The directory identifier of the WorkSpace for which you want to import client branding.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The directory identifier of the WorkSpace for which you want to import client branding.
     * </p>
     * 
     * @return The directory identifier of the WorkSpace for which you want to import client branding.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The directory identifier of the WorkSpace for which you want to import client branding.
     * </p>
     * 
     * @param resourceId
     *        The directory identifier of the WorkSpace for which you want to import client branding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportClientBrandingRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The branding information to import for Windows devices.
     * </p>
     * 
     * @param deviceTypeWindows
     *        The branding information to import for Windows devices.
     */

    public void setDeviceTypeWindows(DefaultImportClientBrandingAttributes deviceTypeWindows) {
        this.deviceTypeWindows = deviceTypeWindows;
    }

    /**
     * <p>
     * The branding information to import for Windows devices.
     * </p>
     * 
     * @return The branding information to import for Windows devices.
     */

    public DefaultImportClientBrandingAttributes getDeviceTypeWindows() {
        return this.deviceTypeWindows;
    }

    /**
     * <p>
     * The branding information to import for Windows devices.
     * </p>
     * 
     * @param deviceTypeWindows
     *        The branding information to import for Windows devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportClientBrandingRequest withDeviceTypeWindows(DefaultImportClientBrandingAttributes deviceTypeWindows) {
        setDeviceTypeWindows(deviceTypeWindows);
        return this;
    }

    /**
     * <p>
     * The branding information to import for macOS devices.
     * </p>
     * 
     * @param deviceTypeOsx
     *        The branding information to import for macOS devices.
     */

    public void setDeviceTypeOsx(DefaultImportClientBrandingAttributes deviceTypeOsx) {
        this.deviceTypeOsx = deviceTypeOsx;
    }

    /**
     * <p>
     * The branding information to import for macOS devices.
     * </p>
     * 
     * @return The branding information to import for macOS devices.
     */

    public DefaultImportClientBrandingAttributes getDeviceTypeOsx() {
        return this.deviceTypeOsx;
    }

    /**
     * <p>
     * The branding information to import for macOS devices.
     * </p>
     * 
     * @param deviceTypeOsx
     *        The branding information to import for macOS devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportClientBrandingRequest withDeviceTypeOsx(DefaultImportClientBrandingAttributes deviceTypeOsx) {
        setDeviceTypeOsx(deviceTypeOsx);
        return this;
    }

    /**
     * <p>
     * The branding information to import for Android devices.
     * </p>
     * 
     * @param deviceTypeAndroid
     *        The branding information to import for Android devices.
     */

    public void setDeviceTypeAndroid(DefaultImportClientBrandingAttributes deviceTypeAndroid) {
        this.deviceTypeAndroid = deviceTypeAndroid;
    }

    /**
     * <p>
     * The branding information to import for Android devices.
     * </p>
     * 
     * @return The branding information to import for Android devices.
     */

    public DefaultImportClientBrandingAttributes getDeviceTypeAndroid() {
        return this.deviceTypeAndroid;
    }

    /**
     * <p>
     * The branding information to import for Android devices.
     * </p>
     * 
     * @param deviceTypeAndroid
     *        The branding information to import for Android devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportClientBrandingRequest withDeviceTypeAndroid(DefaultImportClientBrandingAttributes deviceTypeAndroid) {
        setDeviceTypeAndroid(deviceTypeAndroid);
        return this;
    }

    /**
     * <p>
     * The branding information to import for iOS devices.
     * </p>
     * 
     * @param deviceTypeIos
     *        The branding information to import for iOS devices.
     */

    public void setDeviceTypeIos(IosImportClientBrandingAttributes deviceTypeIos) {
        this.deviceTypeIos = deviceTypeIos;
    }

    /**
     * <p>
     * The branding information to import for iOS devices.
     * </p>
     * 
     * @return The branding information to import for iOS devices.
     */

    public IosImportClientBrandingAttributes getDeviceTypeIos() {
        return this.deviceTypeIos;
    }

    /**
     * <p>
     * The branding information to import for iOS devices.
     * </p>
     * 
     * @param deviceTypeIos
     *        The branding information to import for iOS devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportClientBrandingRequest withDeviceTypeIos(IosImportClientBrandingAttributes deviceTypeIos) {
        setDeviceTypeIos(deviceTypeIos);
        return this;
    }

    /**
     * <p>
     * The branding information to import for Linux devices.
     * </p>
     * 
     * @param deviceTypeLinux
     *        The branding information to import for Linux devices.
     */

    public void setDeviceTypeLinux(DefaultImportClientBrandingAttributes deviceTypeLinux) {
        this.deviceTypeLinux = deviceTypeLinux;
    }

    /**
     * <p>
     * The branding information to import for Linux devices.
     * </p>
     * 
     * @return The branding information to import for Linux devices.
     */

    public DefaultImportClientBrandingAttributes getDeviceTypeLinux() {
        return this.deviceTypeLinux;
    }

    /**
     * <p>
     * The branding information to import for Linux devices.
     * </p>
     * 
     * @param deviceTypeLinux
     *        The branding information to import for Linux devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportClientBrandingRequest withDeviceTypeLinux(DefaultImportClientBrandingAttributes deviceTypeLinux) {
        setDeviceTypeLinux(deviceTypeLinux);
        return this;
    }

    /**
     * <p>
     * The branding information to import for web access.
     * </p>
     * 
     * @param deviceTypeWeb
     *        The branding information to import for web access.
     */

    public void setDeviceTypeWeb(DefaultImportClientBrandingAttributes deviceTypeWeb) {
        this.deviceTypeWeb = deviceTypeWeb;
    }

    /**
     * <p>
     * The branding information to import for web access.
     * </p>
     * 
     * @return The branding information to import for web access.
     */

    public DefaultImportClientBrandingAttributes getDeviceTypeWeb() {
        return this.deviceTypeWeb;
    }

    /**
     * <p>
     * The branding information to import for web access.
     * </p>
     * 
     * @param deviceTypeWeb
     *        The branding information to import for web access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportClientBrandingRequest withDeviceTypeWeb(DefaultImportClientBrandingAttributes deviceTypeWeb) {
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
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

        if (obj instanceof ImportClientBrandingRequest == false)
            return false;
        ImportClientBrandingRequest other = (ImportClientBrandingRequest) obj;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getDeviceTypeWindows() == null) ? 0 : getDeviceTypeWindows().hashCode());
        hashCode = prime * hashCode + ((getDeviceTypeOsx() == null) ? 0 : getDeviceTypeOsx().hashCode());
        hashCode = prime * hashCode + ((getDeviceTypeAndroid() == null) ? 0 : getDeviceTypeAndroid().hashCode());
        hashCode = prime * hashCode + ((getDeviceTypeIos() == null) ? 0 : getDeviceTypeIos().hashCode());
        hashCode = prime * hashCode + ((getDeviceTypeLinux() == null) ? 0 : getDeviceTypeLinux().hashCode());
        hashCode = prime * hashCode + ((getDeviceTypeWeb() == null) ? 0 : getDeviceTypeWeb().hashCode());
        return hashCode;
    }

    @Override
    public ImportClientBrandingRequest clone() {
        return (ImportClientBrandingRequest) super.clone();
    }

}
