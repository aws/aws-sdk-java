/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * CreateLocationObjectStorageRequest
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationObjectStorage"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLocationObjectStorageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the domain name or IP address of the object storage server. A DataSync agent uses this hostname to
     * mount the object storage server in a network.
     * </p>
     */
    private String serverHostname;
    /**
     * <p>
     * Specifies the port that your object storage server accepts inbound network traffic on (for example, port 443).
     * </p>
     */
    private Integer serverPort;
    /**
     * <p>
     * Specifies the protocol that your object storage server uses to communicate.
     * </p>
     */
    private String serverProtocol;
    /**
     * <p>
     * Specifies the object prefix for your object storage server. If this is a source location, DataSync only copies
     * objects with this prefix. If this is a destination location, DataSync writes all objects with this prefix.
     * </p>
     */
    private String subdirectory;
    /**
     * <p>
     * Specifies the name of the object storage bucket involved in the transfer.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * Specifies the access key (for example, a user name) if credentials are required to authenticate with the object
     * storage server.
     * </p>
     */
    private String accessKey;
    /**
     * <p>
     * Specifies the secret key (for example, a password) if credentials are required to authenticate with the object
     * storage server.
     * </p>
     */
    private String secretKey;
    /**
     * <p>
     * Specifies the Amazon Resource Names (ARNs) of the DataSync agents that can securely connect with your location.
     * </p>
     */
    private java.util.List<String> agentArns;
    /**
     * <p>
     * Specifies the key-value pair that represents a tag that you want to add to the resource. Tags can help you
     * manage, filter, and search for your resources. We recommend creating a name tag for your location.
     * </p>
     */
    private java.util.List<TagListEntry> tags;
    /**
     * <p>
     * Specifies a certificate to authenticate with an object storage system that uses a private or self-signed
     * certificate authority (CA). You must specify a Base64-encoded <code>.pem</code> file (for example,
     * <code>file:///home/user/.ssh/storage_sys_certificate.pem</code>). The certificate can be up to 32768 bytes
     * (before Base64 encoding).
     * </p>
     * <p>
     * To use this parameter, configure <code>ServerProtocol</code> to <code>HTTPS</code>.
     * </p>
     */
    private java.nio.ByteBuffer serverCertificate;

    /**
     * <p>
     * Specifies the domain name or IP address of the object storage server. A DataSync agent uses this hostname to
     * mount the object storage server in a network.
     * </p>
     * 
     * @param serverHostname
     *        Specifies the domain name or IP address of the object storage server. A DataSync agent uses this hostname
     *        to mount the object storage server in a network.
     */

    public void setServerHostname(String serverHostname) {
        this.serverHostname = serverHostname;
    }

    /**
     * <p>
     * Specifies the domain name or IP address of the object storage server. A DataSync agent uses this hostname to
     * mount the object storage server in a network.
     * </p>
     * 
     * @return Specifies the domain name or IP address of the object storage server. A DataSync agent uses this hostname
     *         to mount the object storage server in a network.
     */

    public String getServerHostname() {
        return this.serverHostname;
    }

    /**
     * <p>
     * Specifies the domain name or IP address of the object storage server. A DataSync agent uses this hostname to
     * mount the object storage server in a network.
     * </p>
     * 
     * @param serverHostname
     *        Specifies the domain name or IP address of the object storage server. A DataSync agent uses this hostname
     *        to mount the object storage server in a network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationObjectStorageRequest withServerHostname(String serverHostname) {
        setServerHostname(serverHostname);
        return this;
    }

    /**
     * <p>
     * Specifies the port that your object storage server accepts inbound network traffic on (for example, port 443).
     * </p>
     * 
     * @param serverPort
     *        Specifies the port that your object storage server accepts inbound network traffic on (for example, port
     *        443).
     */

    public void setServerPort(Integer serverPort) {
        this.serverPort = serverPort;
    }

    /**
     * <p>
     * Specifies the port that your object storage server accepts inbound network traffic on (for example, port 443).
     * </p>
     * 
     * @return Specifies the port that your object storage server accepts inbound network traffic on (for example, port
     *         443).
     */

    public Integer getServerPort() {
        return this.serverPort;
    }

    /**
     * <p>
     * Specifies the port that your object storage server accepts inbound network traffic on (for example, port 443).
     * </p>
     * 
     * @param serverPort
     *        Specifies the port that your object storage server accepts inbound network traffic on (for example, port
     *        443).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationObjectStorageRequest withServerPort(Integer serverPort) {
        setServerPort(serverPort);
        return this;
    }

    /**
     * <p>
     * Specifies the protocol that your object storage server uses to communicate.
     * </p>
     * 
     * @param serverProtocol
     *        Specifies the protocol that your object storage server uses to communicate.
     * @see ObjectStorageServerProtocol
     */

    public void setServerProtocol(String serverProtocol) {
        this.serverProtocol = serverProtocol;
    }

    /**
     * <p>
     * Specifies the protocol that your object storage server uses to communicate.
     * </p>
     * 
     * @return Specifies the protocol that your object storage server uses to communicate.
     * @see ObjectStorageServerProtocol
     */

    public String getServerProtocol() {
        return this.serverProtocol;
    }

    /**
     * <p>
     * Specifies the protocol that your object storage server uses to communicate.
     * </p>
     * 
     * @param serverProtocol
     *        Specifies the protocol that your object storage server uses to communicate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectStorageServerProtocol
     */

    public CreateLocationObjectStorageRequest withServerProtocol(String serverProtocol) {
        setServerProtocol(serverProtocol);
        return this;
    }

    /**
     * <p>
     * Specifies the protocol that your object storage server uses to communicate.
     * </p>
     * 
     * @param serverProtocol
     *        Specifies the protocol that your object storage server uses to communicate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectStorageServerProtocol
     */

    public CreateLocationObjectStorageRequest withServerProtocol(ObjectStorageServerProtocol serverProtocol) {
        this.serverProtocol = serverProtocol.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the object prefix for your object storage server. If this is a source location, DataSync only copies
     * objects with this prefix. If this is a destination location, DataSync writes all objects with this prefix.
     * </p>
     * 
     * @param subdirectory
     *        Specifies the object prefix for your object storage server. If this is a source location, DataSync only
     *        copies objects with this prefix. If this is a destination location, DataSync writes all objects with this
     *        prefix.
     */

    public void setSubdirectory(String subdirectory) {
        this.subdirectory = subdirectory;
    }

    /**
     * <p>
     * Specifies the object prefix for your object storage server. If this is a source location, DataSync only copies
     * objects with this prefix. If this is a destination location, DataSync writes all objects with this prefix.
     * </p>
     * 
     * @return Specifies the object prefix for your object storage server. If this is a source location, DataSync only
     *         copies objects with this prefix. If this is a destination location, DataSync writes all objects with this
     *         prefix.
     */

    public String getSubdirectory() {
        return this.subdirectory;
    }

    /**
     * <p>
     * Specifies the object prefix for your object storage server. If this is a source location, DataSync only copies
     * objects with this prefix. If this is a destination location, DataSync writes all objects with this prefix.
     * </p>
     * 
     * @param subdirectory
     *        Specifies the object prefix for your object storage server. If this is a source location, DataSync only
     *        copies objects with this prefix. If this is a destination location, DataSync writes all objects with this
     *        prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationObjectStorageRequest withSubdirectory(String subdirectory) {
        setSubdirectory(subdirectory);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the object storage bucket involved in the transfer.
     * </p>
     * 
     * @param bucketName
     *        Specifies the name of the object storage bucket involved in the transfer.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * Specifies the name of the object storage bucket involved in the transfer.
     * </p>
     * 
     * @return Specifies the name of the object storage bucket involved in the transfer.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * Specifies the name of the object storage bucket involved in the transfer.
     * </p>
     * 
     * @param bucketName
     *        Specifies the name of the object storage bucket involved in the transfer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationObjectStorageRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * Specifies the access key (for example, a user name) if credentials are required to authenticate with the object
     * storage server.
     * </p>
     * 
     * @param accessKey
     *        Specifies the access key (for example, a user name) if credentials are required to authenticate with the
     *        object storage server.
     */

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    /**
     * <p>
     * Specifies the access key (for example, a user name) if credentials are required to authenticate with the object
     * storage server.
     * </p>
     * 
     * @return Specifies the access key (for example, a user name) if credentials are required to authenticate with the
     *         object storage server.
     */

    public String getAccessKey() {
        return this.accessKey;
    }

    /**
     * <p>
     * Specifies the access key (for example, a user name) if credentials are required to authenticate with the object
     * storage server.
     * </p>
     * 
     * @param accessKey
     *        Specifies the access key (for example, a user name) if credentials are required to authenticate with the
     *        object storage server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationObjectStorageRequest withAccessKey(String accessKey) {
        setAccessKey(accessKey);
        return this;
    }

    /**
     * <p>
     * Specifies the secret key (for example, a password) if credentials are required to authenticate with the object
     * storage server.
     * </p>
     * 
     * @param secretKey
     *        Specifies the secret key (for example, a password) if credentials are required to authenticate with the
     *        object storage server.
     */

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    /**
     * <p>
     * Specifies the secret key (for example, a password) if credentials are required to authenticate with the object
     * storage server.
     * </p>
     * 
     * @return Specifies the secret key (for example, a password) if credentials are required to authenticate with the
     *         object storage server.
     */

    public String getSecretKey() {
        return this.secretKey;
    }

    /**
     * <p>
     * Specifies the secret key (for example, a password) if credentials are required to authenticate with the object
     * storage server.
     * </p>
     * 
     * @param secretKey
     *        Specifies the secret key (for example, a password) if credentials are required to authenticate with the
     *        object storage server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationObjectStorageRequest withSecretKey(String secretKey) {
        setSecretKey(secretKey);
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Names (ARNs) of the DataSync agents that can securely connect with your location.
     * </p>
     * 
     * @return Specifies the Amazon Resource Names (ARNs) of the DataSync agents that can securely connect with your
     *         location.
     */

    public java.util.List<String> getAgentArns() {
        return agentArns;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Names (ARNs) of the DataSync agents that can securely connect with your location.
     * </p>
     * 
     * @param agentArns
     *        Specifies the Amazon Resource Names (ARNs) of the DataSync agents that can securely connect with your
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
     * Specifies the Amazon Resource Names (ARNs) of the DataSync agents that can securely connect with your location.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgentArns(java.util.Collection)} or {@link #withAgentArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param agentArns
     *        Specifies the Amazon Resource Names (ARNs) of the DataSync agents that can securely connect with your
     *        location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationObjectStorageRequest withAgentArns(String... agentArns) {
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
     * Specifies the Amazon Resource Names (ARNs) of the DataSync agents that can securely connect with your location.
     * </p>
     * 
     * @param agentArns
     *        Specifies the Amazon Resource Names (ARNs) of the DataSync agents that can securely connect with your
     *        location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationObjectStorageRequest withAgentArns(java.util.Collection<String> agentArns) {
        setAgentArns(agentArns);
        return this;
    }

    /**
     * <p>
     * Specifies the key-value pair that represents a tag that you want to add to the resource. Tags can help you
     * manage, filter, and search for your resources. We recommend creating a name tag for your location.
     * </p>
     * 
     * @return Specifies the key-value pair that represents a tag that you want to add to the resource. Tags can help
     *         you manage, filter, and search for your resources. We recommend creating a name tag for your location.
     */

    public java.util.List<TagListEntry> getTags() {
        return tags;
    }

    /**
     * <p>
     * Specifies the key-value pair that represents a tag that you want to add to the resource. Tags can help you
     * manage, filter, and search for your resources. We recommend creating a name tag for your location.
     * </p>
     * 
     * @param tags
     *        Specifies the key-value pair that represents a tag that you want to add to the resource. Tags can help you
     *        manage, filter, and search for your resources. We recommend creating a name tag for your location.
     */

    public void setTags(java.util.Collection<TagListEntry> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<TagListEntry>(tags);
    }

    /**
     * <p>
     * Specifies the key-value pair that represents a tag that you want to add to the resource. Tags can help you
     * manage, filter, and search for your resources. We recommend creating a name tag for your location.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Specifies the key-value pair that represents a tag that you want to add to the resource. Tags can help you
     *        manage, filter, and search for your resources. We recommend creating a name tag for your location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationObjectStorageRequest withTags(TagListEntry... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<TagListEntry>(tags.length));
        }
        for (TagListEntry ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the key-value pair that represents a tag that you want to add to the resource. Tags can help you
     * manage, filter, and search for your resources. We recommend creating a name tag for your location.
     * </p>
     * 
     * @param tags
     *        Specifies the key-value pair that represents a tag that you want to add to the resource. Tags can help you
     *        manage, filter, and search for your resources. We recommend creating a name tag for your location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationObjectStorageRequest withTags(java.util.Collection<TagListEntry> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Specifies a certificate to authenticate with an object storage system that uses a private or self-signed
     * certificate authority (CA). You must specify a Base64-encoded <code>.pem</code> file (for example,
     * <code>file:///home/user/.ssh/storage_sys_certificate.pem</code>). The certificate can be up to 32768 bytes
     * (before Base64 encoding).
     * </p>
     * <p>
     * To use this parameter, configure <code>ServerProtocol</code> to <code>HTTPS</code>.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param serverCertificate
     *        Specifies a certificate to authenticate with an object storage system that uses a private or self-signed
     *        certificate authority (CA). You must specify a Base64-encoded <code>.pem</code> file (for example,
     *        <code>file:///home/user/.ssh/storage_sys_certificate.pem</code>). The certificate can be up to 32768 bytes
     *        (before Base64 encoding).</p>
     *        <p>
     *        To use this parameter, configure <code>ServerProtocol</code> to <code>HTTPS</code>.
     */

    public void setServerCertificate(java.nio.ByteBuffer serverCertificate) {
        this.serverCertificate = serverCertificate;
    }

    /**
     * <p>
     * Specifies a certificate to authenticate with an object storage system that uses a private or self-signed
     * certificate authority (CA). You must specify a Base64-encoded <code>.pem</code> file (for example,
     * <code>file:///home/user/.ssh/storage_sys_certificate.pem</code>). The certificate can be up to 32768 bytes
     * (before Base64 encoding).
     * </p>
     * <p>
     * To use this parameter, configure <code>ServerProtocol</code> to <code>HTTPS</code>.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return Specifies a certificate to authenticate with an object storage system that uses a private or self-signed
     *         certificate authority (CA). You must specify a Base64-encoded <code>.pem</code> file (for example,
     *         <code>file:///home/user/.ssh/storage_sys_certificate.pem</code>). The certificate can be up to 32768
     *         bytes (before Base64 encoding).</p>
     *         <p>
     *         To use this parameter, configure <code>ServerProtocol</code> to <code>HTTPS</code>.
     */

    public java.nio.ByteBuffer getServerCertificate() {
        return this.serverCertificate;
    }

    /**
     * <p>
     * Specifies a certificate to authenticate with an object storage system that uses a private or self-signed
     * certificate authority (CA). You must specify a Base64-encoded <code>.pem</code> file (for example,
     * <code>file:///home/user/.ssh/storage_sys_certificate.pem</code>). The certificate can be up to 32768 bytes
     * (before Base64 encoding).
     * </p>
     * <p>
     * To use this parameter, configure <code>ServerProtocol</code> to <code>HTTPS</code>.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param serverCertificate
     *        Specifies a certificate to authenticate with an object storage system that uses a private or self-signed
     *        certificate authority (CA). You must specify a Base64-encoded <code>.pem</code> file (for example,
     *        <code>file:///home/user/.ssh/storage_sys_certificate.pem</code>). The certificate can be up to 32768 bytes
     *        (before Base64 encoding).</p>
     *        <p>
     *        To use this parameter, configure <code>ServerProtocol</code> to <code>HTTPS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationObjectStorageRequest withServerCertificate(java.nio.ByteBuffer serverCertificate) {
        setServerCertificate(serverCertificate);
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
        if (getServerHostname() != null)
            sb.append("ServerHostname: ").append(getServerHostname()).append(",");
        if (getServerPort() != null)
            sb.append("ServerPort: ").append(getServerPort()).append(",");
        if (getServerProtocol() != null)
            sb.append("ServerProtocol: ").append(getServerProtocol()).append(",");
        if (getSubdirectory() != null)
            sb.append("Subdirectory: ").append(getSubdirectory()).append(",");
        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName()).append(",");
        if (getAccessKey() != null)
            sb.append("AccessKey: ").append(getAccessKey()).append(",");
        if (getSecretKey() != null)
            sb.append("SecretKey: ").append("***Sensitive Data Redacted***").append(",");
        if (getAgentArns() != null)
            sb.append("AgentArns: ").append(getAgentArns()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getServerCertificate() != null)
            sb.append("ServerCertificate: ").append(getServerCertificate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLocationObjectStorageRequest == false)
            return false;
        CreateLocationObjectStorageRequest other = (CreateLocationObjectStorageRequest) obj;
        if (other.getServerHostname() == null ^ this.getServerHostname() == null)
            return false;
        if (other.getServerHostname() != null && other.getServerHostname().equals(this.getServerHostname()) == false)
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
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getServerCertificate() == null ^ this.getServerCertificate() == null)
            return false;
        if (other.getServerCertificate() != null && other.getServerCertificate().equals(this.getServerCertificate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerHostname() == null) ? 0 : getServerHostname().hashCode());
        hashCode = prime * hashCode + ((getServerPort() == null) ? 0 : getServerPort().hashCode());
        hashCode = prime * hashCode + ((getServerProtocol() == null) ? 0 : getServerProtocol().hashCode());
        hashCode = prime * hashCode + ((getSubdirectory() == null) ? 0 : getSubdirectory().hashCode());
        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getAccessKey() == null) ? 0 : getAccessKey().hashCode());
        hashCode = prime * hashCode + ((getSecretKey() == null) ? 0 : getSecretKey().hashCode());
        hashCode = prime * hashCode + ((getAgentArns() == null) ? 0 : getAgentArns().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getServerCertificate() == null) ? 0 : getServerCertificate().hashCode());
        return hashCode;
    }

    @Override
    public CreateLocationObjectStorageRequest clone() {
        return (CreateLocationObjectStorageRequest) super.clone();
    }

}
