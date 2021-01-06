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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the properties of a file transfer protocol-enabled server that was specified.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribedServer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribedServer implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) of the server.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Specifies the ARN of the AWS Certificate Manager (ACM) certificate. Required when <code>Protocols</code> is set
     * to <code>FTPS</code>.
     * </p>
     */
    private String certificate;

    private String domain;
    /**
     * <p>
     * Specifies the virtual private cloud (VPC) endpoint settings that you configured for your server.
     * </p>
     */
    private EndpointDetails endpointDetails;
    /**
     * <p>
     * Defines the type of endpoint that your server is connected to. If your server is connected to a VPC endpoint,
     * your server isn't accessible over the public internet.
     * </p>
     */
    private String endpointType;
    /**
     * <p>
     * Specifies the Base64-encoded SHA256 fingerprint of the server's host key. This value is equivalent to the output
     * of the <code>ssh-keygen -l -f my-new-server-key</code> command.
     * </p>
     */
    private String hostKeyFingerprint;
    /**
     * <p>
     * Specifies information to call a customer-supplied authentication API. This field is not populated when the
     * <code>IdentityProviderType</code> of a server is <code>SERVICE_MANAGED</code>.
     * </p>
     */
    private IdentityProviderDetails identityProviderDetails;
    /**
     * <p>
     * Specifies the mode of authentication method enabled for this service. A value of <code>SERVICE_MANAGED</code>
     * means that you are using this server to store and access user credentials within the service. A value of
     * <code>API_GATEWAY</code> indicates that you have integrated an API Gateway endpoint that will be invoked for
     * authenticating your user into the service.
     * </p>
     */
    private String identityProviderType;
    /**
     * <p>
     * Specifies the AWS Identity and Access Management (IAM) role that allows a server to turn on Amazon CloudWatch
     * logging for Amazon S3 events. When set, user activity can be viewed in your CloudWatch logs.
     * </p>
     */
    private String loggingRole;
    /**
     * <p>
     * Specifies the file transfer protocol or protocols over which your file transfer protocol client can connect to
     * your server's endpoint. The available protocols are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SFTP</code> (Secure Shell (SSH) File Transfer Protocol): File transfer over SSH
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FTPS</code> (File Transfer Protocol Secure): File transfer with TLS encryption
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FTP</code> (File Transfer Protocol): Unencrypted file transfer
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> protocols;
    /**
     * <p>
     * Specifies the name of the security policy that is attached to the server.
     * </p>
     */
    private String securityPolicyName;
    /**
     * <p>
     * Specifies the unique system-assigned identifier for a server that you instantiate.
     * </p>
     */
    private String serverId;
    /**
     * <p>
     * Specifies the condition of a server for the server that was described. A value of <code>ONLINE</code> indicates
     * that the server can accept jobs and transfer files. A <code>State</code> value of <code>OFFLINE</code> means that
     * the server cannot perform file transfer operations.
     * </p>
     * <p>
     * The states of <code>STARTING</code> and <code>STOPPING</code> indicate that the server is in an intermediate
     * state, either not fully able to respond, or not fully offline. The values of <code>START_FAILED</code> or
     * <code>STOP_FAILED</code> can indicate an error condition.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Specifies the key-value pairs that you can use to search for and group servers that were assigned to the server
     * that was described.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * Specifies the number of users that are assigned to a server you specified with the <code>ServerId</code>.
     * </p>
     */
    private Integer userCount;

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) of the server.
     * </p>
     * 
     * @param arn
     *        Specifies the unique Amazon Resource Name (ARN) of the server.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) of the server.
     * </p>
     * 
     * @return Specifies the unique Amazon Resource Name (ARN) of the server.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) of the server.
     * </p>
     * 
     * @param arn
     *        Specifies the unique Amazon Resource Name (ARN) of the server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedServer withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Specifies the ARN of the AWS Certificate Manager (ACM) certificate. Required when <code>Protocols</code> is set
     * to <code>FTPS</code>.
     * </p>
     * 
     * @param certificate
     *        Specifies the ARN of the AWS Certificate Manager (ACM) certificate. Required when <code>Protocols</code>
     *        is set to <code>FTPS</code>.
     */

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * <p>
     * Specifies the ARN of the AWS Certificate Manager (ACM) certificate. Required when <code>Protocols</code> is set
     * to <code>FTPS</code>.
     * </p>
     * 
     * @return Specifies the ARN of the AWS Certificate Manager (ACM) certificate. Required when <code>Protocols</code>
     *         is set to <code>FTPS</code>.
     */

    public String getCertificate() {
        return this.certificate;
    }

    /**
     * <p>
     * Specifies the ARN of the AWS Certificate Manager (ACM) certificate. Required when <code>Protocols</code> is set
     * to <code>FTPS</code>.
     * </p>
     * 
     * @param certificate
     *        Specifies the ARN of the AWS Certificate Manager (ACM) certificate. Required when <code>Protocols</code>
     *        is set to <code>FTPS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedServer withCertificate(String certificate) {
        setCertificate(certificate);
        return this;
    }

    /**
     * @param domain
     * @see Domain
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * @return
     * @see Domain
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * @param domain
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Domain
     */

    public DescribedServer withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * @param domain
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Domain
     */

    public DescribedServer withDomain(Domain domain) {
        this.domain = domain.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the virtual private cloud (VPC) endpoint settings that you configured for your server.
     * </p>
     * 
     * @param endpointDetails
     *        Specifies the virtual private cloud (VPC) endpoint settings that you configured for your server.
     */

    public void setEndpointDetails(EndpointDetails endpointDetails) {
        this.endpointDetails = endpointDetails;
    }

    /**
     * <p>
     * Specifies the virtual private cloud (VPC) endpoint settings that you configured for your server.
     * </p>
     * 
     * @return Specifies the virtual private cloud (VPC) endpoint settings that you configured for your server.
     */

    public EndpointDetails getEndpointDetails() {
        return this.endpointDetails;
    }

    /**
     * <p>
     * Specifies the virtual private cloud (VPC) endpoint settings that you configured for your server.
     * </p>
     * 
     * @param endpointDetails
     *        Specifies the virtual private cloud (VPC) endpoint settings that you configured for your server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedServer withEndpointDetails(EndpointDetails endpointDetails) {
        setEndpointDetails(endpointDetails);
        return this;
    }

    /**
     * <p>
     * Defines the type of endpoint that your server is connected to. If your server is connected to a VPC endpoint,
     * your server isn't accessible over the public internet.
     * </p>
     * 
     * @param endpointType
     *        Defines the type of endpoint that your server is connected to. If your server is connected to a VPC
     *        endpoint, your server isn't accessible over the public internet.
     * @see EndpointType
     */

    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    /**
     * <p>
     * Defines the type of endpoint that your server is connected to. If your server is connected to a VPC endpoint,
     * your server isn't accessible over the public internet.
     * </p>
     * 
     * @return Defines the type of endpoint that your server is connected to. If your server is connected to a VPC
     *         endpoint, your server isn't accessible over the public internet.
     * @see EndpointType
     */

    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * <p>
     * Defines the type of endpoint that your server is connected to. If your server is connected to a VPC endpoint,
     * your server isn't accessible over the public internet.
     * </p>
     * 
     * @param endpointType
     *        Defines the type of endpoint that your server is connected to. If your server is connected to a VPC
     *        endpoint, your server isn't accessible over the public internet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointType
     */

    public DescribedServer withEndpointType(String endpointType) {
        setEndpointType(endpointType);
        return this;
    }

    /**
     * <p>
     * Defines the type of endpoint that your server is connected to. If your server is connected to a VPC endpoint,
     * your server isn't accessible over the public internet.
     * </p>
     * 
     * @param endpointType
     *        Defines the type of endpoint that your server is connected to. If your server is connected to a VPC
     *        endpoint, your server isn't accessible over the public internet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointType
     */

    public DescribedServer withEndpointType(EndpointType endpointType) {
        this.endpointType = endpointType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the Base64-encoded SHA256 fingerprint of the server's host key. This value is equivalent to the output
     * of the <code>ssh-keygen -l -f my-new-server-key</code> command.
     * </p>
     * 
     * @param hostKeyFingerprint
     *        Specifies the Base64-encoded SHA256 fingerprint of the server's host key. This value is equivalent to the
     *        output of the <code>ssh-keygen -l -f my-new-server-key</code> command.
     */

    public void setHostKeyFingerprint(String hostKeyFingerprint) {
        this.hostKeyFingerprint = hostKeyFingerprint;
    }

    /**
     * <p>
     * Specifies the Base64-encoded SHA256 fingerprint of the server's host key. This value is equivalent to the output
     * of the <code>ssh-keygen -l -f my-new-server-key</code> command.
     * </p>
     * 
     * @return Specifies the Base64-encoded SHA256 fingerprint of the server's host key. This value is equivalent to the
     *         output of the <code>ssh-keygen -l -f my-new-server-key</code> command.
     */

    public String getHostKeyFingerprint() {
        return this.hostKeyFingerprint;
    }

    /**
     * <p>
     * Specifies the Base64-encoded SHA256 fingerprint of the server's host key. This value is equivalent to the output
     * of the <code>ssh-keygen -l -f my-new-server-key</code> command.
     * </p>
     * 
     * @param hostKeyFingerprint
     *        Specifies the Base64-encoded SHA256 fingerprint of the server's host key. This value is equivalent to the
     *        output of the <code>ssh-keygen -l -f my-new-server-key</code> command.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedServer withHostKeyFingerprint(String hostKeyFingerprint) {
        setHostKeyFingerprint(hostKeyFingerprint);
        return this;
    }

    /**
     * <p>
     * Specifies information to call a customer-supplied authentication API. This field is not populated when the
     * <code>IdentityProviderType</code> of a server is <code>SERVICE_MANAGED</code>.
     * </p>
     * 
     * @param identityProviderDetails
     *        Specifies information to call a customer-supplied authentication API. This field is not populated when the
     *        <code>IdentityProviderType</code> of a server is <code>SERVICE_MANAGED</code>.
     */

    public void setIdentityProviderDetails(IdentityProviderDetails identityProviderDetails) {
        this.identityProviderDetails = identityProviderDetails;
    }

    /**
     * <p>
     * Specifies information to call a customer-supplied authentication API. This field is not populated when the
     * <code>IdentityProviderType</code> of a server is <code>SERVICE_MANAGED</code>.
     * </p>
     * 
     * @return Specifies information to call a customer-supplied authentication API. This field is not populated when
     *         the <code>IdentityProviderType</code> of a server is <code>SERVICE_MANAGED</code>.
     */

    public IdentityProviderDetails getIdentityProviderDetails() {
        return this.identityProviderDetails;
    }

    /**
     * <p>
     * Specifies information to call a customer-supplied authentication API. This field is not populated when the
     * <code>IdentityProviderType</code> of a server is <code>SERVICE_MANAGED</code>.
     * </p>
     * 
     * @param identityProviderDetails
     *        Specifies information to call a customer-supplied authentication API. This field is not populated when the
     *        <code>IdentityProviderType</code> of a server is <code>SERVICE_MANAGED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedServer withIdentityProviderDetails(IdentityProviderDetails identityProviderDetails) {
        setIdentityProviderDetails(identityProviderDetails);
        return this;
    }

    /**
     * <p>
     * Specifies the mode of authentication method enabled for this service. A value of <code>SERVICE_MANAGED</code>
     * means that you are using this server to store and access user credentials within the service. A value of
     * <code>API_GATEWAY</code> indicates that you have integrated an API Gateway endpoint that will be invoked for
     * authenticating your user into the service.
     * </p>
     * 
     * @param identityProviderType
     *        Specifies the mode of authentication method enabled for this service. A value of
     *        <code>SERVICE_MANAGED</code> means that you are using this server to store and access user credentials
     *        within the service. A value of <code>API_GATEWAY</code> indicates that you have integrated an API Gateway
     *        endpoint that will be invoked for authenticating your user into the service.
     * @see IdentityProviderType
     */

    public void setIdentityProviderType(String identityProviderType) {
        this.identityProviderType = identityProviderType;
    }

    /**
     * <p>
     * Specifies the mode of authentication method enabled for this service. A value of <code>SERVICE_MANAGED</code>
     * means that you are using this server to store and access user credentials within the service. A value of
     * <code>API_GATEWAY</code> indicates that you have integrated an API Gateway endpoint that will be invoked for
     * authenticating your user into the service.
     * </p>
     * 
     * @return Specifies the mode of authentication method enabled for this service. A value of
     *         <code>SERVICE_MANAGED</code> means that you are using this server to store and access user credentials
     *         within the service. A value of <code>API_GATEWAY</code> indicates that you have integrated an API Gateway
     *         endpoint that will be invoked for authenticating your user into the service.
     * @see IdentityProviderType
     */

    public String getIdentityProviderType() {
        return this.identityProviderType;
    }

    /**
     * <p>
     * Specifies the mode of authentication method enabled for this service. A value of <code>SERVICE_MANAGED</code>
     * means that you are using this server to store and access user credentials within the service. A value of
     * <code>API_GATEWAY</code> indicates that you have integrated an API Gateway endpoint that will be invoked for
     * authenticating your user into the service.
     * </p>
     * 
     * @param identityProviderType
     *        Specifies the mode of authentication method enabled for this service. A value of
     *        <code>SERVICE_MANAGED</code> means that you are using this server to store and access user credentials
     *        within the service. A value of <code>API_GATEWAY</code> indicates that you have integrated an API Gateway
     *        endpoint that will be invoked for authenticating your user into the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityProviderType
     */

    public DescribedServer withIdentityProviderType(String identityProviderType) {
        setIdentityProviderType(identityProviderType);
        return this;
    }

    /**
     * <p>
     * Specifies the mode of authentication method enabled for this service. A value of <code>SERVICE_MANAGED</code>
     * means that you are using this server to store and access user credentials within the service. A value of
     * <code>API_GATEWAY</code> indicates that you have integrated an API Gateway endpoint that will be invoked for
     * authenticating your user into the service.
     * </p>
     * 
     * @param identityProviderType
     *        Specifies the mode of authentication method enabled for this service. A value of
     *        <code>SERVICE_MANAGED</code> means that you are using this server to store and access user credentials
     *        within the service. A value of <code>API_GATEWAY</code> indicates that you have integrated an API Gateway
     *        endpoint that will be invoked for authenticating your user into the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityProviderType
     */

    public DescribedServer withIdentityProviderType(IdentityProviderType identityProviderType) {
        this.identityProviderType = identityProviderType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the AWS Identity and Access Management (IAM) role that allows a server to turn on Amazon CloudWatch
     * logging for Amazon S3 events. When set, user activity can be viewed in your CloudWatch logs.
     * </p>
     * 
     * @param loggingRole
     *        Specifies the AWS Identity and Access Management (IAM) role that allows a server to turn on Amazon
     *        CloudWatch logging for Amazon S3 events. When set, user activity can be viewed in your CloudWatch logs.
     */

    public void setLoggingRole(String loggingRole) {
        this.loggingRole = loggingRole;
    }

    /**
     * <p>
     * Specifies the AWS Identity and Access Management (IAM) role that allows a server to turn on Amazon CloudWatch
     * logging for Amazon S3 events. When set, user activity can be viewed in your CloudWatch logs.
     * </p>
     * 
     * @return Specifies the AWS Identity and Access Management (IAM) role that allows a server to turn on Amazon
     *         CloudWatch logging for Amazon S3 events. When set, user activity can be viewed in your CloudWatch logs.
     */

    public String getLoggingRole() {
        return this.loggingRole;
    }

    /**
     * <p>
     * Specifies the AWS Identity and Access Management (IAM) role that allows a server to turn on Amazon CloudWatch
     * logging for Amazon S3 events. When set, user activity can be viewed in your CloudWatch logs.
     * </p>
     * 
     * @param loggingRole
     *        Specifies the AWS Identity and Access Management (IAM) role that allows a server to turn on Amazon
     *        CloudWatch logging for Amazon S3 events. When set, user activity can be viewed in your CloudWatch logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedServer withLoggingRole(String loggingRole) {
        setLoggingRole(loggingRole);
        return this;
    }

    /**
     * <p>
     * Specifies the file transfer protocol or protocols over which your file transfer protocol client can connect to
     * your server's endpoint. The available protocols are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SFTP</code> (Secure Shell (SSH) File Transfer Protocol): File transfer over SSH
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FTPS</code> (File Transfer Protocol Secure): File transfer with TLS encryption
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FTP</code> (File Transfer Protocol): Unencrypted file transfer
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the file transfer protocol or protocols over which your file transfer protocol client can
     *         connect to your server's endpoint. The available protocols are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SFTP</code> (Secure Shell (SSH) File Transfer Protocol): File transfer over SSH
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FTPS</code> (File Transfer Protocol Secure): File transfer with TLS encryption
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FTP</code> (File Transfer Protocol): Unencrypted file transfer
     *         </p>
     *         </li>
     * @see Protocol
     */

    public java.util.List<String> getProtocols() {
        return protocols;
    }

    /**
     * <p>
     * Specifies the file transfer protocol or protocols over which your file transfer protocol client can connect to
     * your server's endpoint. The available protocols are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SFTP</code> (Secure Shell (SSH) File Transfer Protocol): File transfer over SSH
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FTPS</code> (File Transfer Protocol Secure): File transfer with TLS encryption
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FTP</code> (File Transfer Protocol): Unencrypted file transfer
     * </p>
     * </li>
     * </ul>
     * 
     * @param protocols
     *        Specifies the file transfer protocol or protocols over which your file transfer protocol client can
     *        connect to your server's endpoint. The available protocols are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SFTP</code> (Secure Shell (SSH) File Transfer Protocol): File transfer over SSH
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FTPS</code> (File Transfer Protocol Secure): File transfer with TLS encryption
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FTP</code> (File Transfer Protocol): Unencrypted file transfer
     *        </p>
     *        </li>
     * @see Protocol
     */

    public void setProtocols(java.util.Collection<String> protocols) {
        if (protocols == null) {
            this.protocols = null;
            return;
        }

        this.protocols = new java.util.ArrayList<String>(protocols);
    }

    /**
     * <p>
     * Specifies the file transfer protocol or protocols over which your file transfer protocol client can connect to
     * your server's endpoint. The available protocols are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SFTP</code> (Secure Shell (SSH) File Transfer Protocol): File transfer over SSH
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FTPS</code> (File Transfer Protocol Secure): File transfer with TLS encryption
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FTP</code> (File Transfer Protocol): Unencrypted file transfer
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProtocols(java.util.Collection)} or {@link #withProtocols(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param protocols
     *        Specifies the file transfer protocol or protocols over which your file transfer protocol client can
     *        connect to your server's endpoint. The available protocols are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SFTP</code> (Secure Shell (SSH) File Transfer Protocol): File transfer over SSH
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FTPS</code> (File Transfer Protocol Secure): File transfer with TLS encryption
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FTP</code> (File Transfer Protocol): Unencrypted file transfer
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public DescribedServer withProtocols(String... protocols) {
        if (this.protocols == null) {
            setProtocols(new java.util.ArrayList<String>(protocols.length));
        }
        for (String ele : protocols) {
            this.protocols.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the file transfer protocol or protocols over which your file transfer protocol client can connect to
     * your server's endpoint. The available protocols are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SFTP</code> (Secure Shell (SSH) File Transfer Protocol): File transfer over SSH
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FTPS</code> (File Transfer Protocol Secure): File transfer with TLS encryption
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FTP</code> (File Transfer Protocol): Unencrypted file transfer
     * </p>
     * </li>
     * </ul>
     * 
     * @param protocols
     *        Specifies the file transfer protocol or protocols over which your file transfer protocol client can
     *        connect to your server's endpoint. The available protocols are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SFTP</code> (Secure Shell (SSH) File Transfer Protocol): File transfer over SSH
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FTPS</code> (File Transfer Protocol Secure): File transfer with TLS encryption
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FTP</code> (File Transfer Protocol): Unencrypted file transfer
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public DescribedServer withProtocols(java.util.Collection<String> protocols) {
        setProtocols(protocols);
        return this;
    }

    /**
     * <p>
     * Specifies the file transfer protocol or protocols over which your file transfer protocol client can connect to
     * your server's endpoint. The available protocols are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SFTP</code> (Secure Shell (SSH) File Transfer Protocol): File transfer over SSH
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FTPS</code> (File Transfer Protocol Secure): File transfer with TLS encryption
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FTP</code> (File Transfer Protocol): Unencrypted file transfer
     * </p>
     * </li>
     * </ul>
     * 
     * @param protocols
     *        Specifies the file transfer protocol or protocols over which your file transfer protocol client can
     *        connect to your server's endpoint. The available protocols are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SFTP</code> (Secure Shell (SSH) File Transfer Protocol): File transfer over SSH
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FTPS</code> (File Transfer Protocol Secure): File transfer with TLS encryption
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FTP</code> (File Transfer Protocol): Unencrypted file transfer
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Protocol
     */

    public DescribedServer withProtocols(Protocol... protocols) {
        java.util.ArrayList<String> protocolsCopy = new java.util.ArrayList<String>(protocols.length);
        for (Protocol value : protocols) {
            protocolsCopy.add(value.toString());
        }
        if (getProtocols() == null) {
            setProtocols(protocolsCopy);
        } else {
            getProtocols().addAll(protocolsCopy);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the name of the security policy that is attached to the server.
     * </p>
     * 
     * @param securityPolicyName
     *        Specifies the name of the security policy that is attached to the server.
     */

    public void setSecurityPolicyName(String securityPolicyName) {
        this.securityPolicyName = securityPolicyName;
    }

    /**
     * <p>
     * Specifies the name of the security policy that is attached to the server.
     * </p>
     * 
     * @return Specifies the name of the security policy that is attached to the server.
     */

    public String getSecurityPolicyName() {
        return this.securityPolicyName;
    }

    /**
     * <p>
     * Specifies the name of the security policy that is attached to the server.
     * </p>
     * 
     * @param securityPolicyName
     *        Specifies the name of the security policy that is attached to the server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedServer withSecurityPolicyName(String securityPolicyName) {
        setSecurityPolicyName(securityPolicyName);
        return this;
    }

    /**
     * <p>
     * Specifies the unique system-assigned identifier for a server that you instantiate.
     * </p>
     * 
     * @param serverId
     *        Specifies the unique system-assigned identifier for a server that you instantiate.
     */

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * Specifies the unique system-assigned identifier for a server that you instantiate.
     * </p>
     * 
     * @return Specifies the unique system-assigned identifier for a server that you instantiate.
     */

    public String getServerId() {
        return this.serverId;
    }

    /**
     * <p>
     * Specifies the unique system-assigned identifier for a server that you instantiate.
     * </p>
     * 
     * @param serverId
     *        Specifies the unique system-assigned identifier for a server that you instantiate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedServer withServerId(String serverId) {
        setServerId(serverId);
        return this;
    }

    /**
     * <p>
     * Specifies the condition of a server for the server that was described. A value of <code>ONLINE</code> indicates
     * that the server can accept jobs and transfer files. A <code>State</code> value of <code>OFFLINE</code> means that
     * the server cannot perform file transfer operations.
     * </p>
     * <p>
     * The states of <code>STARTING</code> and <code>STOPPING</code> indicate that the server is in an intermediate
     * state, either not fully able to respond, or not fully offline. The values of <code>START_FAILED</code> or
     * <code>STOP_FAILED</code> can indicate an error condition.
     * </p>
     * 
     * @param state
     *        Specifies the condition of a server for the server that was described. A value of <code>ONLINE</code>
     *        indicates that the server can accept jobs and transfer files. A <code>State</code> value of
     *        <code>OFFLINE</code> means that the server cannot perform file transfer operations.</p>
     *        <p>
     *        The states of <code>STARTING</code> and <code>STOPPING</code> indicate that the server is in an
     *        intermediate state, either not fully able to respond, or not fully offline. The values of
     *        <code>START_FAILED</code> or <code>STOP_FAILED</code> can indicate an error condition.
     * @see State
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Specifies the condition of a server for the server that was described. A value of <code>ONLINE</code> indicates
     * that the server can accept jobs and transfer files. A <code>State</code> value of <code>OFFLINE</code> means that
     * the server cannot perform file transfer operations.
     * </p>
     * <p>
     * The states of <code>STARTING</code> and <code>STOPPING</code> indicate that the server is in an intermediate
     * state, either not fully able to respond, or not fully offline. The values of <code>START_FAILED</code> or
     * <code>STOP_FAILED</code> can indicate an error condition.
     * </p>
     * 
     * @return Specifies the condition of a server for the server that was described. A value of <code>ONLINE</code>
     *         indicates that the server can accept jobs and transfer files. A <code>State</code> value of
     *         <code>OFFLINE</code> means that the server cannot perform file transfer operations.</p>
     *         <p>
     *         The states of <code>STARTING</code> and <code>STOPPING</code> indicate that the server is in an
     *         intermediate state, either not fully able to respond, or not fully offline. The values of
     *         <code>START_FAILED</code> or <code>STOP_FAILED</code> can indicate an error condition.
     * @see State
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Specifies the condition of a server for the server that was described. A value of <code>ONLINE</code> indicates
     * that the server can accept jobs and transfer files. A <code>State</code> value of <code>OFFLINE</code> means that
     * the server cannot perform file transfer operations.
     * </p>
     * <p>
     * The states of <code>STARTING</code> and <code>STOPPING</code> indicate that the server is in an intermediate
     * state, either not fully able to respond, or not fully offline. The values of <code>START_FAILED</code> or
     * <code>STOP_FAILED</code> can indicate an error condition.
     * </p>
     * 
     * @param state
     *        Specifies the condition of a server for the server that was described. A value of <code>ONLINE</code>
     *        indicates that the server can accept jobs and transfer files. A <code>State</code> value of
     *        <code>OFFLINE</code> means that the server cannot perform file transfer operations.</p>
     *        <p>
     *        The states of <code>STARTING</code> and <code>STOPPING</code> indicate that the server is in an
     *        intermediate state, either not fully able to respond, or not fully offline. The values of
     *        <code>START_FAILED</code> or <code>STOP_FAILED</code> can indicate an error condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public DescribedServer withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Specifies the condition of a server for the server that was described. A value of <code>ONLINE</code> indicates
     * that the server can accept jobs and transfer files. A <code>State</code> value of <code>OFFLINE</code> means that
     * the server cannot perform file transfer operations.
     * </p>
     * <p>
     * The states of <code>STARTING</code> and <code>STOPPING</code> indicate that the server is in an intermediate
     * state, either not fully able to respond, or not fully offline. The values of <code>START_FAILED</code> or
     * <code>STOP_FAILED</code> can indicate an error condition.
     * </p>
     * 
     * @param state
     *        Specifies the condition of a server for the server that was described. A value of <code>ONLINE</code>
     *        indicates that the server can accept jobs and transfer files. A <code>State</code> value of
     *        <code>OFFLINE</code> means that the server cannot perform file transfer operations.</p>
     *        <p>
     *        The states of <code>STARTING</code> and <code>STOPPING</code> indicate that the server is in an
     *        intermediate state, either not fully able to respond, or not fully offline. The values of
     *        <code>START_FAILED</code> or <code>STOP_FAILED</code> can indicate an error condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public DescribedServer withState(State state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the key-value pairs that you can use to search for and group servers that were assigned to the server
     * that was described.
     * </p>
     * 
     * @return Specifies the key-value pairs that you can use to search for and group servers that were assigned to the
     *         server that was described.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Specifies the key-value pairs that you can use to search for and group servers that were assigned to the server
     * that was described.
     * </p>
     * 
     * @param tags
     *        Specifies the key-value pairs that you can use to search for and group servers that were assigned to the
     *        server that was described.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Specifies the key-value pairs that you can use to search for and group servers that were assigned to the server
     * that was described.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Specifies the key-value pairs that you can use to search for and group servers that were assigned to the
     *        server that was described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedServer withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the key-value pairs that you can use to search for and group servers that were assigned to the server
     * that was described.
     * </p>
     * 
     * @param tags
     *        Specifies the key-value pairs that you can use to search for and group servers that were assigned to the
     *        server that was described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedServer withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Specifies the number of users that are assigned to a server you specified with the <code>ServerId</code>.
     * </p>
     * 
     * @param userCount
     *        Specifies the number of users that are assigned to a server you specified with the <code>ServerId</code>.
     */

    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
    }

    /**
     * <p>
     * Specifies the number of users that are assigned to a server you specified with the <code>ServerId</code>.
     * </p>
     * 
     * @return Specifies the number of users that are assigned to a server you specified with the <code>ServerId</code>.
     */

    public Integer getUserCount() {
        return this.userCount;
    }

    /**
     * <p>
     * Specifies the number of users that are assigned to a server you specified with the <code>ServerId</code>.
     * </p>
     * 
     * @param userCount
     *        Specifies the number of users that are assigned to a server you specified with the <code>ServerId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedServer withUserCount(Integer userCount) {
        setUserCount(userCount);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCertificate() != null)
            sb.append("Certificate: ").append(getCertificate()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getEndpointDetails() != null)
            sb.append("EndpointDetails: ").append(getEndpointDetails()).append(",");
        if (getEndpointType() != null)
            sb.append("EndpointType: ").append(getEndpointType()).append(",");
        if (getHostKeyFingerprint() != null)
            sb.append("HostKeyFingerprint: ").append(getHostKeyFingerprint()).append(",");
        if (getIdentityProviderDetails() != null)
            sb.append("IdentityProviderDetails: ").append(getIdentityProviderDetails()).append(",");
        if (getIdentityProviderType() != null)
            sb.append("IdentityProviderType: ").append(getIdentityProviderType()).append(",");
        if (getLoggingRole() != null)
            sb.append("LoggingRole: ").append(getLoggingRole()).append(",");
        if (getProtocols() != null)
            sb.append("Protocols: ").append(getProtocols()).append(",");
        if (getSecurityPolicyName() != null)
            sb.append("SecurityPolicyName: ").append(getSecurityPolicyName()).append(",");
        if (getServerId() != null)
            sb.append("ServerId: ").append(getServerId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getUserCount() != null)
            sb.append("UserCount: ").append(getUserCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribedServer == false)
            return false;
        DescribedServer other = (DescribedServer) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCertificate() == null ^ this.getCertificate() == null)
            return false;
        if (other.getCertificate() != null && other.getCertificate().equals(this.getCertificate()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getEndpointDetails() == null ^ this.getEndpointDetails() == null)
            return false;
        if (other.getEndpointDetails() != null && other.getEndpointDetails().equals(this.getEndpointDetails()) == false)
            return false;
        if (other.getEndpointType() == null ^ this.getEndpointType() == null)
            return false;
        if (other.getEndpointType() != null && other.getEndpointType().equals(this.getEndpointType()) == false)
            return false;
        if (other.getHostKeyFingerprint() == null ^ this.getHostKeyFingerprint() == null)
            return false;
        if (other.getHostKeyFingerprint() != null && other.getHostKeyFingerprint().equals(this.getHostKeyFingerprint()) == false)
            return false;
        if (other.getIdentityProviderDetails() == null ^ this.getIdentityProviderDetails() == null)
            return false;
        if (other.getIdentityProviderDetails() != null && other.getIdentityProviderDetails().equals(this.getIdentityProviderDetails()) == false)
            return false;
        if (other.getIdentityProviderType() == null ^ this.getIdentityProviderType() == null)
            return false;
        if (other.getIdentityProviderType() != null && other.getIdentityProviderType().equals(this.getIdentityProviderType()) == false)
            return false;
        if (other.getLoggingRole() == null ^ this.getLoggingRole() == null)
            return false;
        if (other.getLoggingRole() != null && other.getLoggingRole().equals(this.getLoggingRole()) == false)
            return false;
        if (other.getProtocols() == null ^ this.getProtocols() == null)
            return false;
        if (other.getProtocols() != null && other.getProtocols().equals(this.getProtocols()) == false)
            return false;
        if (other.getSecurityPolicyName() == null ^ this.getSecurityPolicyName() == null)
            return false;
        if (other.getSecurityPolicyName() != null && other.getSecurityPolicyName().equals(this.getSecurityPolicyName()) == false)
            return false;
        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getUserCount() == null ^ this.getUserCount() == null)
            return false;
        if (other.getUserCount() != null && other.getUserCount().equals(this.getUserCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCertificate() == null) ? 0 : getCertificate().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getEndpointDetails() == null) ? 0 : getEndpointDetails().hashCode());
        hashCode = prime * hashCode + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        hashCode = prime * hashCode + ((getHostKeyFingerprint() == null) ? 0 : getHostKeyFingerprint().hashCode());
        hashCode = prime * hashCode + ((getIdentityProviderDetails() == null) ? 0 : getIdentityProviderDetails().hashCode());
        hashCode = prime * hashCode + ((getIdentityProviderType() == null) ? 0 : getIdentityProviderType().hashCode());
        hashCode = prime * hashCode + ((getLoggingRole() == null) ? 0 : getLoggingRole().hashCode());
        hashCode = prime * hashCode + ((getProtocols() == null) ? 0 : getProtocols().hashCode());
        hashCode = prime * hashCode + ((getSecurityPolicyName() == null) ? 0 : getSecurityPolicyName().hashCode());
        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUserCount() == null) ? 0 : getUserCount().hashCode());
        return hashCode;
    }

    @Override
    public DescribedServer clone() {
        try {
            return (DescribedServer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.DescribedServerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
