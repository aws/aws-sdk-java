/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates and submits a request to start a remote access session.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateRemoteAccessSession"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRemoteAccessSessionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project for which you want to create a remote access session.
     * </p>
     */
    private String projectArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device for which you want to create a remote access session.
     * </p>
     */
    private String deviceArn;
    /**
     * <p>
     * The public key of the <code>ssh</code> key pair you want to use for connecting to remote devices in your remote
     * debugging session. This is only required if <code>remoteDebugEnabled</code> is set to <code>true</code>.
     * </p>
     */
    private String sshPublicKey;
    /**
     * <p>
     * Set to <code>true</code> if you want to access devices remotely for debugging in your remote access session.
     * </p>
     */
    private Boolean remoteDebugEnabled;
    /**
     * <p>
     * The name of the remote access session that you wish to create.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Unique identifier for the client. If you want access to multiple devices on the same client, you should pass the
     * same <code>clientId</code> value in each call to <code>CreateRemoteAccessSession</code>. This is required only if
     * <code>remoteDebugEnabled</code> is set to true <code>true</code>.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * The configuration information for the remote access session request.
     * </p>
     */
    private CreateRemoteAccessSessionConfiguration configuration;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project for which you want to create a remote access session.
     * </p>
     * 
     * @param projectArn
     *        The Amazon Resource Name (ARN) of the project for which you want to create a remote access session.
     */

    public void setProjectArn(String projectArn) {
        this.projectArn = projectArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project for which you want to create a remote access session.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the project for which you want to create a remote access session.
     */

    public String getProjectArn() {
        return this.projectArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project for which you want to create a remote access session.
     * </p>
     * 
     * @param projectArn
     *        The Amazon Resource Name (ARN) of the project for which you want to create a remote access session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRemoteAccessSessionRequest withProjectArn(String projectArn) {
        setProjectArn(projectArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device for which you want to create a remote access session.
     * </p>
     * 
     * @param deviceArn
     *        The Amazon Resource Name (ARN) of the device for which you want to create a remote access session.
     */

    public void setDeviceArn(String deviceArn) {
        this.deviceArn = deviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device for which you want to create a remote access session.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the device for which you want to create a remote access session.
     */

    public String getDeviceArn() {
        return this.deviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device for which you want to create a remote access session.
     * </p>
     * 
     * @param deviceArn
     *        The Amazon Resource Name (ARN) of the device for which you want to create a remote access session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRemoteAccessSessionRequest withDeviceArn(String deviceArn) {
        setDeviceArn(deviceArn);
        return this;
    }

    /**
     * <p>
     * The public key of the <code>ssh</code> key pair you want to use for connecting to remote devices in your remote
     * debugging session. This is only required if <code>remoteDebugEnabled</code> is set to <code>true</code>.
     * </p>
     * 
     * @param sshPublicKey
     *        The public key of the <code>ssh</code> key pair you want to use for connecting to remote devices in your
     *        remote debugging session. This is only required if <code>remoteDebugEnabled</code> is set to
     *        <code>true</code>.
     */

    public void setSshPublicKey(String sshPublicKey) {
        this.sshPublicKey = sshPublicKey;
    }

    /**
     * <p>
     * The public key of the <code>ssh</code> key pair you want to use for connecting to remote devices in your remote
     * debugging session. This is only required if <code>remoteDebugEnabled</code> is set to <code>true</code>.
     * </p>
     * 
     * @return The public key of the <code>ssh</code> key pair you want to use for connecting to remote devices in your
     *         remote debugging session. This is only required if <code>remoteDebugEnabled</code> is set to
     *         <code>true</code>.
     */

    public String getSshPublicKey() {
        return this.sshPublicKey;
    }

    /**
     * <p>
     * The public key of the <code>ssh</code> key pair you want to use for connecting to remote devices in your remote
     * debugging session. This is only required if <code>remoteDebugEnabled</code> is set to <code>true</code>.
     * </p>
     * 
     * @param sshPublicKey
     *        The public key of the <code>ssh</code> key pair you want to use for connecting to remote devices in your
     *        remote debugging session. This is only required if <code>remoteDebugEnabled</code> is set to
     *        <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRemoteAccessSessionRequest withSshPublicKey(String sshPublicKey) {
        setSshPublicKey(sshPublicKey);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> if you want to access devices remotely for debugging in your remote access session.
     * </p>
     * 
     * @param remoteDebugEnabled
     *        Set to <code>true</code> if you want to access devices remotely for debugging in your remote access
     *        session.
     */

    public void setRemoteDebugEnabled(Boolean remoteDebugEnabled) {
        this.remoteDebugEnabled = remoteDebugEnabled;
    }

    /**
     * <p>
     * Set to <code>true</code> if you want to access devices remotely for debugging in your remote access session.
     * </p>
     * 
     * @return Set to <code>true</code> if you want to access devices remotely for debugging in your remote access
     *         session.
     */

    public Boolean getRemoteDebugEnabled() {
        return this.remoteDebugEnabled;
    }

    /**
     * <p>
     * Set to <code>true</code> if you want to access devices remotely for debugging in your remote access session.
     * </p>
     * 
     * @param remoteDebugEnabled
     *        Set to <code>true</code> if you want to access devices remotely for debugging in your remote access
     *        session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRemoteAccessSessionRequest withRemoteDebugEnabled(Boolean remoteDebugEnabled) {
        setRemoteDebugEnabled(remoteDebugEnabled);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> if you want to access devices remotely for debugging in your remote access session.
     * </p>
     * 
     * @return Set to <code>true</code> if you want to access devices remotely for debugging in your remote access
     *         session.
     */

    public Boolean isRemoteDebugEnabled() {
        return this.remoteDebugEnabled;
    }

    /**
     * <p>
     * The name of the remote access session that you wish to create.
     * </p>
     * 
     * @param name
     *        The name of the remote access session that you wish to create.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the remote access session that you wish to create.
     * </p>
     * 
     * @return The name of the remote access session that you wish to create.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the remote access session that you wish to create.
     * </p>
     * 
     * @param name
     *        The name of the remote access session that you wish to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRemoteAccessSessionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Unique identifier for the client. If you want access to multiple devices on the same client, you should pass the
     * same <code>clientId</code> value in each call to <code>CreateRemoteAccessSession</code>. This is required only if
     * <code>remoteDebugEnabled</code> is set to true <code>true</code>.
     * </p>
     * 
     * @param clientId
     *        Unique identifier for the client. If you want access to multiple devices on the same client, you should
     *        pass the same <code>clientId</code> value in each call to <code>CreateRemoteAccessSession</code>. This is
     *        required only if <code>remoteDebugEnabled</code> is set to true <code>true</code>.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * Unique identifier for the client. If you want access to multiple devices on the same client, you should pass the
     * same <code>clientId</code> value in each call to <code>CreateRemoteAccessSession</code>. This is required only if
     * <code>remoteDebugEnabled</code> is set to true <code>true</code>.
     * </p>
     * 
     * @return Unique identifier for the client. If you want access to multiple devices on the same client, you should
     *         pass the same <code>clientId</code> value in each call to <code>CreateRemoteAccessSession</code>. This is
     *         required only if <code>remoteDebugEnabled</code> is set to true <code>true</code>.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * Unique identifier for the client. If you want access to multiple devices on the same client, you should pass the
     * same <code>clientId</code> value in each call to <code>CreateRemoteAccessSession</code>. This is required only if
     * <code>remoteDebugEnabled</code> is set to true <code>true</code>.
     * </p>
     * 
     * @param clientId
     *        Unique identifier for the client. If you want access to multiple devices on the same client, you should
     *        pass the same <code>clientId</code> value in each call to <code>CreateRemoteAccessSession</code>. This is
     *        required only if <code>remoteDebugEnabled</code> is set to true <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRemoteAccessSessionRequest withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * The configuration information for the remote access session request.
     * </p>
     * 
     * @param configuration
     *        The configuration information for the remote access session request.
     */

    public void setConfiguration(CreateRemoteAccessSessionConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The configuration information for the remote access session request.
     * </p>
     * 
     * @return The configuration information for the remote access session request.
     */

    public CreateRemoteAccessSessionConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The configuration information for the remote access session request.
     * </p>
     * 
     * @param configuration
     *        The configuration information for the remote access session request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRemoteAccessSessionRequest withConfiguration(CreateRemoteAccessSessionConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getProjectArn() != null)
            sb.append("ProjectArn: ").append(getProjectArn()).append(",");
        if (getDeviceArn() != null)
            sb.append("DeviceArn: ").append(getDeviceArn()).append(",");
        if (getSshPublicKey() != null)
            sb.append("SshPublicKey: ").append(getSshPublicKey()).append(",");
        if (getRemoteDebugEnabled() != null)
            sb.append("RemoteDebugEnabled: ").append(getRemoteDebugEnabled()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getClientId() != null)
            sb.append("ClientId: ").append(getClientId()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRemoteAccessSessionRequest == false)
            return false;
        CreateRemoteAccessSessionRequest other = (CreateRemoteAccessSessionRequest) obj;
        if (other.getProjectArn() == null ^ this.getProjectArn() == null)
            return false;
        if (other.getProjectArn() != null && other.getProjectArn().equals(this.getProjectArn()) == false)
            return false;
        if (other.getDeviceArn() == null ^ this.getDeviceArn() == null)
            return false;
        if (other.getDeviceArn() != null && other.getDeviceArn().equals(this.getDeviceArn()) == false)
            return false;
        if (other.getSshPublicKey() == null ^ this.getSshPublicKey() == null)
            return false;
        if (other.getSshPublicKey() != null && other.getSshPublicKey().equals(this.getSshPublicKey()) == false)
            return false;
        if (other.getRemoteDebugEnabled() == null ^ this.getRemoteDebugEnabled() == null)
            return false;
        if (other.getRemoteDebugEnabled() != null && other.getRemoteDebugEnabled().equals(this.getRemoteDebugEnabled()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectArn() == null) ? 0 : getProjectArn().hashCode());
        hashCode = prime * hashCode + ((getDeviceArn() == null) ? 0 : getDeviceArn().hashCode());
        hashCode = prime * hashCode + ((getSshPublicKey() == null) ? 0 : getSshPublicKey().hashCode());
        hashCode = prime * hashCode + ((getRemoteDebugEnabled() == null) ? 0 : getRemoteDebugEnabled().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateRemoteAccessSessionRequest clone() {
        return (CreateRemoteAccessSessionRequest) super.clone();
    }

}
