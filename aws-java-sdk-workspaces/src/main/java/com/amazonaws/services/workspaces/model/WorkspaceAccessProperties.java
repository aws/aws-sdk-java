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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The device types and operating systems that can be used to access a WorkSpace. For more information, see <a
 * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/workspaces-network-requirements.html">Amazon
 * WorkSpaces Client Network Requirements</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/WorkspaceAccessProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkspaceAccessProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether users can use Windows clients to access their WorkSpaces. To restrict WorkSpaces access to
     * trusted devices (also known as managed devices) with valid certificates, specify a value of <code>TRUST</code>.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/trusted-devices.html">Restrict WorkSpaces Access
     * to Trusted Devices</a>.
     * </p>
     */
    private String deviceTypeWindows;
    /**
     * <p>
     * Indicates whether users can use macOS clients to access their WorkSpaces. To restrict WorkSpaces access to
     * trusted devices (also known as managed devices) with valid certificates, specify a value of <code>TRUST</code>.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/trusted-devices.html">Restrict WorkSpaces Access
     * to Trusted Devices</a>.
     * </p>
     */
    private String deviceTypeOsx;
    /**
     * <p>
     * Indicates whether users can access their WorkSpaces through a web browser.
     * </p>
     */
    private String deviceTypeWeb;
    /**
     * <p>
     * Indicates whether users can use iOS devices to access their WorkSpaces.
     * </p>
     */
    private String deviceTypeIos;
    /**
     * <p>
     * Indicates whether users can use Android devices to access their WorkSpaces.
     * </p>
     */
    private String deviceTypeAndroid;
    /**
     * <p>
     * Indicates whether users can use Chromebooks to access their WorkSpaces.
     * </p>
     */
    private String deviceTypeChromeOs;
    /**
     * <p>
     * Indicates whether users can use zero client devices to access their WorkSpaces.
     * </p>
     */
    private String deviceTypeZeroClient;

    /**
     * <p>
     * Indicates whether users can use Windows clients to access their WorkSpaces. To restrict WorkSpaces access to
     * trusted devices (also known as managed devices) with valid certificates, specify a value of <code>TRUST</code>.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/trusted-devices.html">Restrict WorkSpaces Access
     * to Trusted Devices</a>.
     * </p>
     * 
     * @param deviceTypeWindows
     *        Indicates whether users can use Windows clients to access their WorkSpaces. To restrict WorkSpaces access
     *        to trusted devices (also known as managed devices) with valid certificates, specify a value of
     *        <code>TRUST</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/workspaces/latest/adminguide/trusted-devices.html">Restrict WorkSpaces
     *        Access to Trusted Devices</a>.
     * @see AccessPropertyValue
     */

    public void setDeviceTypeWindows(String deviceTypeWindows) {
        this.deviceTypeWindows = deviceTypeWindows;
    }

    /**
     * <p>
     * Indicates whether users can use Windows clients to access their WorkSpaces. To restrict WorkSpaces access to
     * trusted devices (also known as managed devices) with valid certificates, specify a value of <code>TRUST</code>.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/trusted-devices.html">Restrict WorkSpaces Access
     * to Trusted Devices</a>.
     * </p>
     * 
     * @return Indicates whether users can use Windows clients to access their WorkSpaces. To restrict WorkSpaces access
     *         to trusted devices (also known as managed devices) with valid certificates, specify a value of
     *         <code>TRUST</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/workspaces/latest/adminguide/trusted-devices.html">Restrict WorkSpaces
     *         Access to Trusted Devices</a>.
     * @see AccessPropertyValue
     */

    public String getDeviceTypeWindows() {
        return this.deviceTypeWindows;
    }

    /**
     * <p>
     * Indicates whether users can use Windows clients to access their WorkSpaces. To restrict WorkSpaces access to
     * trusted devices (also known as managed devices) with valid certificates, specify a value of <code>TRUST</code>.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/trusted-devices.html">Restrict WorkSpaces Access
     * to Trusted Devices</a>.
     * </p>
     * 
     * @param deviceTypeWindows
     *        Indicates whether users can use Windows clients to access their WorkSpaces. To restrict WorkSpaces access
     *        to trusted devices (also known as managed devices) with valid certificates, specify a value of
     *        <code>TRUST</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/workspaces/latest/adminguide/trusted-devices.html">Restrict WorkSpaces
     *        Access to Trusted Devices</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessPropertyValue
     */

    public WorkspaceAccessProperties withDeviceTypeWindows(String deviceTypeWindows) {
        setDeviceTypeWindows(deviceTypeWindows);
        return this;
    }

    /**
     * <p>
     * Indicates whether users can use Windows clients to access their WorkSpaces. To restrict WorkSpaces access to
     * trusted devices (also known as managed devices) with valid certificates, specify a value of <code>TRUST</code>.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/trusted-devices.html">Restrict WorkSpaces Access
     * to Trusted Devices</a>.
     * </p>
     * 
     * @param deviceTypeWindows
     *        Indicates whether users can use Windows clients to access their WorkSpaces. To restrict WorkSpaces access
     *        to trusted devices (also known as managed devices) with valid certificates, specify a value of
     *        <code>TRUST</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/workspaces/latest/adminguide/trusted-devices.html">Restrict WorkSpaces
     *        Access to Trusted Devices</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessPropertyValue
     */

    public WorkspaceAccessProperties withDeviceTypeWindows(AccessPropertyValue deviceTypeWindows) {
        this.deviceTypeWindows = deviceTypeWindows.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether users can use macOS clients to access their WorkSpaces. To restrict WorkSpaces access to
     * trusted devices (also known as managed devices) with valid certificates, specify a value of <code>TRUST</code>.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/trusted-devices.html">Restrict WorkSpaces Access
     * to Trusted Devices</a>.
     * </p>
     * 
     * @param deviceTypeOsx
     *        Indicates whether users can use macOS clients to access their WorkSpaces. To restrict WorkSpaces access to
     *        trusted devices (also known as managed devices) with valid certificates, specify a value of
     *        <code>TRUST</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/workspaces/latest/adminguide/trusted-devices.html">Restrict WorkSpaces
     *        Access to Trusted Devices</a>.
     * @see AccessPropertyValue
     */

    public void setDeviceTypeOsx(String deviceTypeOsx) {
        this.deviceTypeOsx = deviceTypeOsx;
    }

    /**
     * <p>
     * Indicates whether users can use macOS clients to access their WorkSpaces. To restrict WorkSpaces access to
     * trusted devices (also known as managed devices) with valid certificates, specify a value of <code>TRUST</code>.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/trusted-devices.html">Restrict WorkSpaces Access
     * to Trusted Devices</a>.
     * </p>
     * 
     * @return Indicates whether users can use macOS clients to access their WorkSpaces. To restrict WorkSpaces access
     *         to trusted devices (also known as managed devices) with valid certificates, specify a value of
     *         <code>TRUST</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/workspaces/latest/adminguide/trusted-devices.html">Restrict WorkSpaces
     *         Access to Trusted Devices</a>.
     * @see AccessPropertyValue
     */

    public String getDeviceTypeOsx() {
        return this.deviceTypeOsx;
    }

    /**
     * <p>
     * Indicates whether users can use macOS clients to access their WorkSpaces. To restrict WorkSpaces access to
     * trusted devices (also known as managed devices) with valid certificates, specify a value of <code>TRUST</code>.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/trusted-devices.html">Restrict WorkSpaces Access
     * to Trusted Devices</a>.
     * </p>
     * 
     * @param deviceTypeOsx
     *        Indicates whether users can use macOS clients to access their WorkSpaces. To restrict WorkSpaces access to
     *        trusted devices (also known as managed devices) with valid certificates, specify a value of
     *        <code>TRUST</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/workspaces/latest/adminguide/trusted-devices.html">Restrict WorkSpaces
     *        Access to Trusted Devices</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessPropertyValue
     */

    public WorkspaceAccessProperties withDeviceTypeOsx(String deviceTypeOsx) {
        setDeviceTypeOsx(deviceTypeOsx);
        return this;
    }

    /**
     * <p>
     * Indicates whether users can use macOS clients to access their WorkSpaces. To restrict WorkSpaces access to
     * trusted devices (also known as managed devices) with valid certificates, specify a value of <code>TRUST</code>.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/workspaces/latest/adminguide/trusted-devices.html">Restrict WorkSpaces Access
     * to Trusted Devices</a>.
     * </p>
     * 
     * @param deviceTypeOsx
     *        Indicates whether users can use macOS clients to access their WorkSpaces. To restrict WorkSpaces access to
     *        trusted devices (also known as managed devices) with valid certificates, specify a value of
     *        <code>TRUST</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/workspaces/latest/adminguide/trusted-devices.html">Restrict WorkSpaces
     *        Access to Trusted Devices</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessPropertyValue
     */

    public WorkspaceAccessProperties withDeviceTypeOsx(AccessPropertyValue deviceTypeOsx) {
        this.deviceTypeOsx = deviceTypeOsx.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether users can access their WorkSpaces through a web browser.
     * </p>
     * 
     * @param deviceTypeWeb
     *        Indicates whether users can access their WorkSpaces through a web browser.
     * @see AccessPropertyValue
     */

    public void setDeviceTypeWeb(String deviceTypeWeb) {
        this.deviceTypeWeb = deviceTypeWeb;
    }

    /**
     * <p>
     * Indicates whether users can access their WorkSpaces through a web browser.
     * </p>
     * 
     * @return Indicates whether users can access their WorkSpaces through a web browser.
     * @see AccessPropertyValue
     */

    public String getDeviceTypeWeb() {
        return this.deviceTypeWeb;
    }

    /**
     * <p>
     * Indicates whether users can access their WorkSpaces through a web browser.
     * </p>
     * 
     * @param deviceTypeWeb
     *        Indicates whether users can access their WorkSpaces through a web browser.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessPropertyValue
     */

    public WorkspaceAccessProperties withDeviceTypeWeb(String deviceTypeWeb) {
        setDeviceTypeWeb(deviceTypeWeb);
        return this;
    }

    /**
     * <p>
     * Indicates whether users can access their WorkSpaces through a web browser.
     * </p>
     * 
     * @param deviceTypeWeb
     *        Indicates whether users can access their WorkSpaces through a web browser.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessPropertyValue
     */

    public WorkspaceAccessProperties withDeviceTypeWeb(AccessPropertyValue deviceTypeWeb) {
        this.deviceTypeWeb = deviceTypeWeb.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether users can use iOS devices to access their WorkSpaces.
     * </p>
     * 
     * @param deviceTypeIos
     *        Indicates whether users can use iOS devices to access their WorkSpaces.
     * @see AccessPropertyValue
     */

    public void setDeviceTypeIos(String deviceTypeIos) {
        this.deviceTypeIos = deviceTypeIos;
    }

    /**
     * <p>
     * Indicates whether users can use iOS devices to access their WorkSpaces.
     * </p>
     * 
     * @return Indicates whether users can use iOS devices to access their WorkSpaces.
     * @see AccessPropertyValue
     */

    public String getDeviceTypeIos() {
        return this.deviceTypeIos;
    }

    /**
     * <p>
     * Indicates whether users can use iOS devices to access their WorkSpaces.
     * </p>
     * 
     * @param deviceTypeIos
     *        Indicates whether users can use iOS devices to access their WorkSpaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessPropertyValue
     */

    public WorkspaceAccessProperties withDeviceTypeIos(String deviceTypeIos) {
        setDeviceTypeIos(deviceTypeIos);
        return this;
    }

    /**
     * <p>
     * Indicates whether users can use iOS devices to access their WorkSpaces.
     * </p>
     * 
     * @param deviceTypeIos
     *        Indicates whether users can use iOS devices to access their WorkSpaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessPropertyValue
     */

    public WorkspaceAccessProperties withDeviceTypeIos(AccessPropertyValue deviceTypeIos) {
        this.deviceTypeIos = deviceTypeIos.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether users can use Android devices to access their WorkSpaces.
     * </p>
     * 
     * @param deviceTypeAndroid
     *        Indicates whether users can use Android devices to access their WorkSpaces.
     * @see AccessPropertyValue
     */

    public void setDeviceTypeAndroid(String deviceTypeAndroid) {
        this.deviceTypeAndroid = deviceTypeAndroid;
    }

    /**
     * <p>
     * Indicates whether users can use Android devices to access their WorkSpaces.
     * </p>
     * 
     * @return Indicates whether users can use Android devices to access their WorkSpaces.
     * @see AccessPropertyValue
     */

    public String getDeviceTypeAndroid() {
        return this.deviceTypeAndroid;
    }

    /**
     * <p>
     * Indicates whether users can use Android devices to access their WorkSpaces.
     * </p>
     * 
     * @param deviceTypeAndroid
     *        Indicates whether users can use Android devices to access their WorkSpaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessPropertyValue
     */

    public WorkspaceAccessProperties withDeviceTypeAndroid(String deviceTypeAndroid) {
        setDeviceTypeAndroid(deviceTypeAndroid);
        return this;
    }

    /**
     * <p>
     * Indicates whether users can use Android devices to access their WorkSpaces.
     * </p>
     * 
     * @param deviceTypeAndroid
     *        Indicates whether users can use Android devices to access their WorkSpaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessPropertyValue
     */

    public WorkspaceAccessProperties withDeviceTypeAndroid(AccessPropertyValue deviceTypeAndroid) {
        this.deviceTypeAndroid = deviceTypeAndroid.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether users can use Chromebooks to access their WorkSpaces.
     * </p>
     * 
     * @param deviceTypeChromeOs
     *        Indicates whether users can use Chromebooks to access their WorkSpaces.
     * @see AccessPropertyValue
     */

    public void setDeviceTypeChromeOs(String deviceTypeChromeOs) {
        this.deviceTypeChromeOs = deviceTypeChromeOs;
    }

    /**
     * <p>
     * Indicates whether users can use Chromebooks to access their WorkSpaces.
     * </p>
     * 
     * @return Indicates whether users can use Chromebooks to access their WorkSpaces.
     * @see AccessPropertyValue
     */

    public String getDeviceTypeChromeOs() {
        return this.deviceTypeChromeOs;
    }

    /**
     * <p>
     * Indicates whether users can use Chromebooks to access their WorkSpaces.
     * </p>
     * 
     * @param deviceTypeChromeOs
     *        Indicates whether users can use Chromebooks to access their WorkSpaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessPropertyValue
     */

    public WorkspaceAccessProperties withDeviceTypeChromeOs(String deviceTypeChromeOs) {
        setDeviceTypeChromeOs(deviceTypeChromeOs);
        return this;
    }

    /**
     * <p>
     * Indicates whether users can use Chromebooks to access their WorkSpaces.
     * </p>
     * 
     * @param deviceTypeChromeOs
     *        Indicates whether users can use Chromebooks to access their WorkSpaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessPropertyValue
     */

    public WorkspaceAccessProperties withDeviceTypeChromeOs(AccessPropertyValue deviceTypeChromeOs) {
        this.deviceTypeChromeOs = deviceTypeChromeOs.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether users can use zero client devices to access their WorkSpaces.
     * </p>
     * 
     * @param deviceTypeZeroClient
     *        Indicates whether users can use zero client devices to access their WorkSpaces.
     * @see AccessPropertyValue
     */

    public void setDeviceTypeZeroClient(String deviceTypeZeroClient) {
        this.deviceTypeZeroClient = deviceTypeZeroClient;
    }

    /**
     * <p>
     * Indicates whether users can use zero client devices to access their WorkSpaces.
     * </p>
     * 
     * @return Indicates whether users can use zero client devices to access their WorkSpaces.
     * @see AccessPropertyValue
     */

    public String getDeviceTypeZeroClient() {
        return this.deviceTypeZeroClient;
    }

    /**
     * <p>
     * Indicates whether users can use zero client devices to access their WorkSpaces.
     * </p>
     * 
     * @param deviceTypeZeroClient
     *        Indicates whether users can use zero client devices to access their WorkSpaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessPropertyValue
     */

    public WorkspaceAccessProperties withDeviceTypeZeroClient(String deviceTypeZeroClient) {
        setDeviceTypeZeroClient(deviceTypeZeroClient);
        return this;
    }

    /**
     * <p>
     * Indicates whether users can use zero client devices to access their WorkSpaces.
     * </p>
     * 
     * @param deviceTypeZeroClient
     *        Indicates whether users can use zero client devices to access their WorkSpaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessPropertyValue
     */

    public WorkspaceAccessProperties withDeviceTypeZeroClient(AccessPropertyValue deviceTypeZeroClient) {
        this.deviceTypeZeroClient = deviceTypeZeroClient.toString();
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
        if (getDeviceTypeWeb() != null)
            sb.append("DeviceTypeWeb: ").append(getDeviceTypeWeb()).append(",");
        if (getDeviceTypeIos() != null)
            sb.append("DeviceTypeIos: ").append(getDeviceTypeIos()).append(",");
        if (getDeviceTypeAndroid() != null)
            sb.append("DeviceTypeAndroid: ").append(getDeviceTypeAndroid()).append(",");
        if (getDeviceTypeChromeOs() != null)
            sb.append("DeviceTypeChromeOs: ").append(getDeviceTypeChromeOs()).append(",");
        if (getDeviceTypeZeroClient() != null)
            sb.append("DeviceTypeZeroClient: ").append(getDeviceTypeZeroClient());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkspaceAccessProperties == false)
            return false;
        WorkspaceAccessProperties other = (WorkspaceAccessProperties) obj;
        if (other.getDeviceTypeWindows() == null ^ this.getDeviceTypeWindows() == null)
            return false;
        if (other.getDeviceTypeWindows() != null && other.getDeviceTypeWindows().equals(this.getDeviceTypeWindows()) == false)
            return false;
        if (other.getDeviceTypeOsx() == null ^ this.getDeviceTypeOsx() == null)
            return false;
        if (other.getDeviceTypeOsx() != null && other.getDeviceTypeOsx().equals(this.getDeviceTypeOsx()) == false)
            return false;
        if (other.getDeviceTypeWeb() == null ^ this.getDeviceTypeWeb() == null)
            return false;
        if (other.getDeviceTypeWeb() != null && other.getDeviceTypeWeb().equals(this.getDeviceTypeWeb()) == false)
            return false;
        if (other.getDeviceTypeIos() == null ^ this.getDeviceTypeIos() == null)
            return false;
        if (other.getDeviceTypeIos() != null && other.getDeviceTypeIos().equals(this.getDeviceTypeIos()) == false)
            return false;
        if (other.getDeviceTypeAndroid() == null ^ this.getDeviceTypeAndroid() == null)
            return false;
        if (other.getDeviceTypeAndroid() != null && other.getDeviceTypeAndroid().equals(this.getDeviceTypeAndroid()) == false)
            return false;
        if (other.getDeviceTypeChromeOs() == null ^ this.getDeviceTypeChromeOs() == null)
            return false;
        if (other.getDeviceTypeChromeOs() != null && other.getDeviceTypeChromeOs().equals(this.getDeviceTypeChromeOs()) == false)
            return false;
        if (other.getDeviceTypeZeroClient() == null ^ this.getDeviceTypeZeroClient() == null)
            return false;
        if (other.getDeviceTypeZeroClient() != null && other.getDeviceTypeZeroClient().equals(this.getDeviceTypeZeroClient()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceTypeWindows() == null) ? 0 : getDeviceTypeWindows().hashCode());
        hashCode = prime * hashCode + ((getDeviceTypeOsx() == null) ? 0 : getDeviceTypeOsx().hashCode());
        hashCode = prime * hashCode + ((getDeviceTypeWeb() == null) ? 0 : getDeviceTypeWeb().hashCode());
        hashCode = prime * hashCode + ((getDeviceTypeIos() == null) ? 0 : getDeviceTypeIos().hashCode());
        hashCode = prime * hashCode + ((getDeviceTypeAndroid() == null) ? 0 : getDeviceTypeAndroid().hashCode());
        hashCode = prime * hashCode + ((getDeviceTypeChromeOs() == null) ? 0 : getDeviceTypeChromeOs().hashCode());
        hashCode = prime * hashCode + ((getDeviceTypeZeroClient() == null) ? 0 : getDeviceTypeZeroClient().hashCode());
        return hashCode;
    }

    @Override
    public WorkspaceAccessProperties clone() {
        try {
            return (WorkspaceAccessProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspaces.model.transform.WorkspaceAccessPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
