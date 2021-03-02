/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateLocationObjectStorage"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLocationObjectStorageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the self-managed object storage server location to be updated.
     * </p>
     */
    private String locationArn;
    /**
     * <p>
     * The port that your self-managed object storage server accepts inbound network traffic on. The server port is set
     * by default to TCP 80 (HTTP) or TCP 443 (HTTPS). You can specify a custom port if your self-managed object storage
     * server requires one.
     * </p>
     */
    private Integer serverPort;
    /**
     * <p>
     * The protocol that the object storage server uses to communicate. Valid values are <code>HTTP</code> or
     * <code>HTTPS</code>.
     * </p>
     */
    private String serverProtocol;
    /**
     * <p>
     * The subdirectory in the self-managed object storage server that is used to read data from.
     * </p>
     */
    private String subdirectory;
    /**
     * <p>
     * Optional. The access key is used if credentials are required to access the self-managed object storage server. If
     * your object storage requires a user name and password to authenticate, use <code>AccessKey</code> and
     * <code>SecretKey</code> to provide the user name and password, respectively.
     * </p>
     */
    private String accessKey;
    /**
     * <p>
     * Optional. The secret key is used if credentials are required to access the self-managed object storage server. If
     * your object storage requires a user name and password to authenticate, use <code>AccessKey</code> and
     * <code>SecretKey</code> to provide the user name and password, respectively.
     * </p>
     */
    private String secretKey;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agents associated with the self-managed object storage server location.
     * </p>
     */
    private java.util.List<String> agentArns;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the self-managed object storage server location to be updated.
     * </p>
     * 
     * @param locationArn
     *        The Amazon Resource Name (ARN) of the self-managed object storage server location to be updated.
     */

    public void setLocationArn(String locationArn) {
        this.locationArn = locationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the self-managed object storage server location to be updated.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the self-managed object storage server location to be updated.
     */

    public String getLocationArn() {
        return this.locationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the self-managed object storage server location to be updated.
     * </p>
     * 
     * @param locationArn
     *        The Amazon Resource Name (ARN) of the self-managed object storage server location to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLocationObjectStorageRequest withLocationArn(String locationArn) {
        setLocationArn(locationArn);
        return this;
    }

    /**
     * <p>
     * The port that your self-managed object storage server accepts inbound network traffic on. The server port is set
     * by default to TCP 80 (HTTP) or TCP 443 (HTTPS). You can specify a custom port if your self-managed object storage
     * server requires one.
     * </p>
     * 
     * @param serverPort
     *        The port that your self-managed object storage server accepts inbound network traffic on. The server port
     *        is set by default to TCP 80 (HTTP) or TCP 443 (HTTPS). You can specify a custom port if your self-managed
     *        object storage server requires one.
     */

    public void setServerPort(Integer serverPort) {
        this.serverPort = serverPort;
    }

    /**
     * <p>
     * The port that your self-managed object storage server accepts inbound network traffic on. The server port is set
     * by default to TCP 80 (HTTP) or TCP 443 (HTTPS). You can specify a custom port if your self-managed object storage
     * server requires one.
     * </p>
     * 
     * @return The port that your self-managed object storage server accepts inbound network traffic on. The server port
     *         is set by default to TCP 80 (HTTP) or TCP 443 (HTTPS). You can specify a custom port if your self-managed
     *         object storage server requires one.
     */

    public Integer getServerPort() {
        return this.serverPort;
    }

    /**
     * <p>
     * The port that your self-managed object storage server accepts inbound network traffic on. The server port is set
     * by default to TCP 80 (HTTP) or TCP 443 (HTTPS). You can specify a custom port if your self-managed object storage
     * server requires one.
     * </p>
     * 
     * @param serverPort
     *        The port that your self-managed object storage server accepts inbound network traffic on. The server port
     *        is set by default to TCP 80 (HTTP) or TCP 443 (HTTPS). You can specify a custom port if your self-managed
     *        object storage server requires one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLocationObjectStorageRequest withServerPort(Integer serverPort) {
        setServerPort(serverPort);
        return this;
    }

    /**
     * <p>
     * The protocol that the object storage server uses to communicate. Valid values are <code>HTTP</code> or
     * <code>HTTPS</code>.
     * </p>
     * 
     * @param serverProtocol
     *        The protocol that the object storage server uses to communicate. Valid values are <code>HTTP</code> or
     *        <code>HTTPS</code>.
     * @see ObjectStorageServerProtocol
     */

    public void setServerProtocol(String serverProtocol) {
        this.serverProtocol = serverProtocol;
    }

    /**
     * <p>
     * The protocol that the object storage server uses to communicate. Valid values are <code>HTTP</code> or
     * <code>HTTPS</code>.
     * </p>
     * 
     * @return The protocol that the object storage server uses to communicate. Valid values are <code>HTTP</code> or
     *         <code>HTTPS</code>.
     * @see ObjectStorageServerProtocol
     */

    public String getServerProtocol() {
        return this.serverProtocol;
    }

    /**
     * <p>
     * The protocol that the object storage server uses to communicate. Valid values are <code>HTTP</code> or
     * <code>HTTPS</code>.
     * </p>
     * 
     * @param serverProtocol
     *        The protocol that the object storage server uses to communicate. Valid values are <code>HTTP</code> or
     *        <code>HTTPS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectStorageServerProtocol
     */

    public UpdateLocationObjectStorageRequest withServerProtocol(String serverProtocol) {
        setServerProtocol(serverProtocol);
        return this;
    }

    /**
     * <p>
     * The protocol that the object storage server uses to communicate. Valid values are <code>HTTP</code> or
     * <code>HTTPS</code>.
     * </p>
     * 
     * @param serverProtocol
     *        The protocol that the object storage server uses to communicate. Valid values are <code>HTTP</code> or
     *        <code>HTTPS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectStorageServerProtocol
     */

    public UpdateLocationObjectStorageRequest withServerProtocol(ObjectStorageServerProtocol serverProtocol) {
        this.serverProtocol = serverProtocol.toString();
        return this;
    }

    /**
     * <p>
     * The subdirectory in the self-managed object storage server that is used to read data from.
     * </p>
     * 
     * @param subdirectory
     *        The subdirectory in the self-managed object storage server that is used to read data from.
     */

    public void setSubdirectory(String subdirectory) {
        this.subdirectory = subdirectory;
    }

    /**
     * <p>
     * The subdirectory in the self-managed object storage server that is used to read data from.
     * </p>
     * 
     * @return The subdirectory in the self-managed object storage server that is used to read data from.
     */

    public String getSubdirectory() {
        return this.subdirectory;
    }

    /**
     * <p>
     * The subdirectory in the self-managed object storage server that is used to read data from.
     * </p>
     * 
     * @param subdirectory
     *        The subdirectory in the self-managed object storage server that is used to read data from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLocationObjectStorageRequest withSubdirectory(String subdirectory) {
        setSubdirectory(subdirectory);
        return this;
    }

    /**
     * <p>
     * Optional. The access key is used if credentials are required to access the self-managed object storage server. If
     * your object storage requires a user name and password to authenticate, use <code>AccessKey</code> and
     * <code>SecretKey</code> to provide the user name and password, respectively.
     * </p>
     * 
     * @param accessKey
     *        Optional. The access key is used if credentials are required to access the self-managed object storage
     *        server. If your object storage requires a user name and password to authenticate, use
     *        <code>AccessKey</code> and <code>SecretKey</code> to provide the user name and password, respectively.
     */

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    /**
     * <p>
     * Optional. The access key is used if credentials are required to access the self-managed object storage server. If
     * your object storage requires a user name and password to authenticate, use <code>AccessKey</code> and
     * <code>SecretKey</code> to provide the user name and password, respectively.
     * </p>
     * 
     * @return Optional. The access key is used if credentials are required to access the self-managed object storage
     *         server. If your object storage requires a user name and password to authenticate, use
     *         <code>AccessKey</code> and <code>SecretKey</code> to provide the user name and password, respectively.
     */

    public String getAccessKey() {
        return this.accessKey;
    }

    /**
     * <p>
     * Optional. The access key is used if credentials are required to access the self-managed object storage server. If
     * your object storage requires a user name and password to authenticate, use <code>AccessKey</code> and
     * <code>SecretKey</code> to provide the user name and password, respectively.
     * </p>
     * 
     * @param accessKey
     *        Optional. The access key is used if credentials are required to access the self-managed object storage
     *        server. If your object storage requires a user name and password to authenticate, use
     *        <code>AccessKey</code> and <code>SecretKey</code> to provide the user name and password, respectively.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLocationObjectStorageRequest withAccessKey(String accessKey) {
        setAccessKey(accessKey);
        return this;
    }

    /**
     * <p>
     * Optional. The secret key is used if credentials are required to access the self-managed object storage server. If
     * your object storage requires a user name and password to authenticate, use <code>AccessKey</code> and
     * <code>SecretKey</code> to provide the user name and password, respectively.
     * </p>
     * 
     * @param secretKey
     *        Optional. The secret key is used if credentials are required to access the self-managed object storage
     *        server. If your object storage requires a user name and password to authenticate, use
     *        <code>AccessKey</code> and <code>SecretKey</code> to provide the user name and password, respectively.
     */

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    /**
     * <p>
     * Optional. The secret key is used if credentials are required to access the self-managed object storage server. If
     * your object storage requires a user name and password to authenticate, use <code>AccessKey</code> and
     * <code>SecretKey</code> to provide the user name and password, respectively.
     * </p>
     * 
     * @return Optional. The secret key is used if credentials are required to access the self-managed object storage
     *         server. If your object storage requires a user name and password to authenticate, use
     *         <code>AccessKey</code> and <code>SecretKey</code> to provide the user name and password, respectively.
     */

    public String getSecretKey() {
        return this.secretKey;
    }

    /**
     * <p>
     * Optional. The secret key is used if credentials are required to access the self-managed object storage server. If
     * your object storage requires a user name and password to authenticate, use <code>AccessKey</code> and
     * <code>SecretKey</code> to provide the user name and password, respectively.
     * </p>
     * 
     * @param secretKey
     *        Optional. The secret key is used if credentials are required to access the self-managed object storage
     *        server. If your object storage requires a user name and password to authenticate, use
     *        <code>AccessKey</code> and <code>SecretKey</code> to provide the user name and password, respectively.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLocationObjectStorageRequest withSecretKey(String secretKey) {
        setSecretKey(secretKey);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agents associated with the self-managed object storage server location.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the agents associated with the self-managed object storage server
     *         location.
     */

    public java.util.List<String> getAgentArns() {
        return agentArns;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agents associated with the self-managed object storage server location.
     * </p>
     * 
     * @param agentArns
     *        The Amazon Resource Name (ARN) of the agents associated with the self-managed object storage server
     *        location.
     */

    public void setAgentArns(java.util.Collection<String> agentArns) {
        if (agentArns == null) {
            this.agentArns = null;
            return;
        }

        this.agentArns = new java.util.ArrayList<String>(agentArns);
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agents associated with the self-managed object storage server location.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgentArns(java.util.Collection)} or {@link #withAgentArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param agentArns
     *        The Amazon Resource Name (ARN) of the agents associated with the self-managed object storage server
     *        location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLocationObjectStorageRequest withAgentArns(String... agentArns) {
        if (this.agentArns == null) {
            setAgentArns(new java.util.ArrayList<String>(agentArns.length));
        }
        for (String ele : agentArns) {
            this.agentArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the agents associated with the self-managed object storage server location.
     * </p>
     * 
     * @param agentArns
     *        The Amazon Resource Name (ARN) of the agents associated with the self-managed object storage server
     *        location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLocationObjectStorageRequest withAgentArns(java.util.Collection<String> agentArns) {
        setAgentArns(agentArns);
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
        if (getLocationArn() != null)
            sb.append("LocationArn: ").append(getLocationArn()).append(",");
        if (getServerPort() != null)
            sb.append("ServerPort: ").append(getServerPort()).append(",");
        if (getServerProtocol() != null)
            sb.append("ServerProtocol: ").append(getServerProtocol()).append(",");
        if (getSubdirectory() != null)
            sb.append("Subdirectory: ").append(getSubdirectory()).append(",");
        if (getAccessKey() != null)
            sb.append("AccessKey: ").append(getAccessKey()).append(",");
        if (getSecretKey() != null)
            sb.append("SecretKey: ").append("***Sensitive Data Redacted***").append(",");
        if (getAgentArns() != null)
            sb.append("AgentArns: ").append(getAgentArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateLocationObjectStorageRequest == false)
            return false;
        UpdateLocationObjectStorageRequest other = (UpdateLocationObjectStorageRequest) obj;
        if (other.getLocationArn() == null ^ this.getLocationArn() == null)
            return false;
        if (other.getLocationArn() != null && other.getLocationArn().equals(this.getLocationArn()) == false)
            return false;
        if (other.getServerPort() == null ^ this.getServerPort() == null)
            return false;
        if (other.getServerPort() != null && other.getServerPort().equals(this.getServerPort()) == false)
            return false;
        if (other.getServerProtocol() == null ^ this.getServerProtocol() == null)
            return false;
        if (other.getServerProtocol() != null && other.getServerProtocol().equals(this.getServerProtocol()) == false)
            return false;
        if (other.getSubdirectory() == null ^ this.getSubdirectory() == null)
            return false;
        if (other.getSubdirectory() != null && other.getSubdirectory().equals(this.getSubdirectory()) == false)
            return false;
        if (other.getAccessKey() == null ^ this.getAccessKey() == null)
            return false;
        if (other.getAccessKey() != null && other.getAccessKey().equals(this.getAccessKey()) == false)
            return false;
        if (other.getSecretKey() == null ^ this.getSecretKey() == null)
            return false;
        if (other.getSecretKey() != null && other.getSecretKey().equals(this.getSecretKey()) == false)
            return false;
        if (other.getAgentArns() == null ^ this.getAgentArns() == null)
            return false;
        if (other.getAgentArns() != null && other.getAgentArns().equals(this.getAgentArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocationArn() == null) ? 0 : getLocationArn().hashCode());
        hashCode = prime * hashCode + ((getServerPort() == null) ? 0 : getServerPort().hashCode());
        hashCode = prime * hashCode + ((getServerProtocol() == null) ? 0 : getServerProtocol().hashCode());
        hashCode = prime * hashCode + ((getSubdirectory() == null) ? 0 : getSubdirectory().hashCode());
        hashCode = prime * hashCode + ((getAccessKey() == null) ? 0 : getAccessKey().hashCode());
        hashCode = prime * hashCode + ((getSecretKey() == null) ? 0 : getSecretKey().hashCode());
        hashCode = prime * hashCode + ((getAgentArns() == null) ? 0 : getAgentArns().hashCode());
        return hashCode;
    }

    @Override
    public UpdateLocationObjectStorageRequest clone() {
        return (UpdateLocationObjectStorageRequest) super.clone();
    }

}
