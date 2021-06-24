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
 * Returns properties of a file transfer protocol-enabled server that was specified.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListedServer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListedServer implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) for a server to be listed.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Specifies the domain of the storage system that is used for file transfers.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * Specifies the mode of authentication for a server. The default value is <code>SERVICE_MANAGED</code>, which
     * allows you to store and access user credentials within the Amazon Web Services Transfer Family service.
     * </p>
     * <p>
     * Use <code>AWS_DIRECTORY_SERVICE</code> to provide access to Active Directory groups in Amazon Web Services
     * Managed Active Directory or Microsoft Active Directory in your on-premises environment or in Amazon Web Services
     * using AD Connectors. This option also requires you to provide a Directory ID using the
     * <code>IdentityProviderDetails</code> parameter.
     * </p>
     * <p>
     * Use the <code>API_GATEWAY</code> value to integrate with an identity provider of your choosing. The
     * <code>API_GATEWAY</code> setting requires you to provide an API Gateway endpoint URL to call for authentication
     * using the <code>IdentityProviderDetails</code> parameter.
     * </p>
     */
    private String identityProviderType;
    /**
     * <p>
     * Specifies the type of VPC endpoint that your server is connected to. If your server is connected to a VPC
     * endpoint, your server isn't accessible over the public internet.
     * </p>
     */
    private String endpointType;
    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the Amazon Web Services Identity and Access Management (IAM) role
     * that allows a server to turn on Amazon CloudWatch logging for Amazon S3 or Amazon EFS events. When set, user
     * activity can be viewed in your CloudWatch logs.
     * </p>
     */
    private String loggingRole;
    /**
     * <p>
     * Specifies the unique system assigned identifier for the servers that were listed.
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
     * Specifies the number of users that are assigned to a server you specified with the <code>ServerId</code>.
     * </p>
     */
    private Integer userCount;

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) for a server to be listed.
     * </p>
     * 
     * @param arn
     *        Specifies the unique Amazon Resource Name (ARN) for a server to be listed.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) for a server to be listed.
     * </p>
     * 
     * @return Specifies the unique Amazon Resource Name (ARN) for a server to be listed.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) for a server to be listed.
     * </p>
     * 
     * @param arn
     *        Specifies the unique Amazon Resource Name (ARN) for a server to be listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedServer withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Specifies the domain of the storage system that is used for file transfers.
     * </p>
     * 
     * @param domain
     *        Specifies the domain of the storage system that is used for file transfers.
     * @see Domain
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * Specifies the domain of the storage system that is used for file transfers.
     * </p>
     * 
     * @return Specifies the domain of the storage system that is used for file transfers.
     * @see Domain
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * Specifies the domain of the storage system that is used for file transfers.
     * </p>
     * 
     * @param domain
     *        Specifies the domain of the storage system that is used for file transfers.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Domain
     */

    public ListedServer withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * Specifies the domain of the storage system that is used for file transfers.
     * </p>
     * 
     * @param domain
     *        Specifies the domain of the storage system that is used for file transfers.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Domain
     */

    public ListedServer withDomain(Domain domain) {
        this.domain = domain.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the mode of authentication for a server. The default value is <code>SERVICE_MANAGED</code>, which
     * allows you to store and access user credentials within the Amazon Web Services Transfer Family service.
     * </p>
     * <p>
     * Use <code>AWS_DIRECTORY_SERVICE</code> to provide access to Active Directory groups in Amazon Web Services
     * Managed Active Directory or Microsoft Active Directory in your on-premises environment or in Amazon Web Services
     * using AD Connectors. This option also requires you to provide a Directory ID using the
     * <code>IdentityProviderDetails</code> parameter.
     * </p>
     * <p>
     * Use the <code>API_GATEWAY</code> value to integrate with an identity provider of your choosing. The
     * <code>API_GATEWAY</code> setting requires you to provide an API Gateway endpoint URL to call for authentication
     * using the <code>IdentityProviderDetails</code> parameter.
     * </p>
     * 
     * @param identityProviderType
     *        Specifies the mode of authentication for a server. The default value is <code>SERVICE_MANAGED</code>,
     *        which allows you to store and access user credentials within the Amazon Web Services Transfer Family
     *        service.</p>
     *        <p>
     *        Use <code>AWS_DIRECTORY_SERVICE</code> to provide access to Active Directory groups in Amazon Web Services
     *        Managed Active Directory or Microsoft Active Directory in your on-premises environment or in Amazon Web
     *        Services using AD Connectors. This option also requires you to provide a Directory ID using the
     *        <code>IdentityProviderDetails</code> parameter.
     *        </p>
     *        <p>
     *        Use the <code>API_GATEWAY</code> value to integrate with an identity provider of your choosing. The
     *        <code>API_GATEWAY</code> setting requires you to provide an API Gateway endpoint URL to call for
     *        authentication using the <code>IdentityProviderDetails</code> parameter.
     * @see IdentityProviderType
     */

    public void setIdentityProviderType(String identityProviderType) {
        this.identityProviderType = identityProviderType;
    }

    /**
     * <p>
     * Specifies the mode of authentication for a server. The default value is <code>SERVICE_MANAGED</code>, which
     * allows you to store and access user credentials within the Amazon Web Services Transfer Family service.
     * </p>
     * <p>
     * Use <code>AWS_DIRECTORY_SERVICE</code> to provide access to Active Directory groups in Amazon Web Services
     * Managed Active Directory or Microsoft Active Directory in your on-premises environment or in Amazon Web Services
     * using AD Connectors. This option also requires you to provide a Directory ID using the
     * <code>IdentityProviderDetails</code> parameter.
     * </p>
     * <p>
     * Use the <code>API_GATEWAY</code> value to integrate with an identity provider of your choosing. The
     * <code>API_GATEWAY</code> setting requires you to provide an API Gateway endpoint URL to call for authentication
     * using the <code>IdentityProviderDetails</code> parameter.
     * </p>
     * 
     * @return Specifies the mode of authentication for a server. The default value is <code>SERVICE_MANAGED</code>,
     *         which allows you to store and access user credentials within the Amazon Web Services Transfer Family
     *         service.</p>
     *         <p>
     *         Use <code>AWS_DIRECTORY_SERVICE</code> to provide access to Active Directory groups in Amazon Web
     *         Services Managed Active Directory or Microsoft Active Directory in your on-premises environment or in
     *         Amazon Web Services using AD Connectors. This option also requires you to provide a Directory ID using
     *         the <code>IdentityProviderDetails</code> parameter.
     *         </p>
     *         <p>
     *         Use the <code>API_GATEWAY</code> value to integrate with an identity provider of your choosing. The
     *         <code>API_GATEWAY</code> setting requires you to provide an API Gateway endpoint URL to call for
     *         authentication using the <code>IdentityProviderDetails</code> parameter.
     * @see IdentityProviderType
     */

    public String getIdentityProviderType() {
        return this.identityProviderType;
    }

    /**
     * <p>
     * Specifies the mode of authentication for a server. The default value is <code>SERVICE_MANAGED</code>, which
     * allows you to store and access user credentials within the Amazon Web Services Transfer Family service.
     * </p>
     * <p>
     * Use <code>AWS_DIRECTORY_SERVICE</code> to provide access to Active Directory groups in Amazon Web Services
     * Managed Active Directory or Microsoft Active Directory in your on-premises environment or in Amazon Web Services
     * using AD Connectors. This option also requires you to provide a Directory ID using the
     * <code>IdentityProviderDetails</code> parameter.
     * </p>
     * <p>
     * Use the <code>API_GATEWAY</code> value to integrate with an identity provider of your choosing. The
     * <code>API_GATEWAY</code> setting requires you to provide an API Gateway endpoint URL to call for authentication
     * using the <code>IdentityProviderDetails</code> parameter.
     * </p>
     * 
     * @param identityProviderType
     *        Specifies the mode of authentication for a server. The default value is <code>SERVICE_MANAGED</code>,
     *        which allows you to store and access user credentials within the Amazon Web Services Transfer Family
     *        service.</p>
     *        <p>
     *        Use <code>AWS_DIRECTORY_SERVICE</code> to provide access to Active Directory groups in Amazon Web Services
     *        Managed Active Directory or Microsoft Active Directory in your on-premises environment or in Amazon Web
     *        Services using AD Connectors. This option also requires you to provide a Directory ID using the
     *        <code>IdentityProviderDetails</code> parameter.
     *        </p>
     *        <p>
     *        Use the <code>API_GATEWAY</code> value to integrate with an identity provider of your choosing. The
     *        <code>API_GATEWAY</code> setting requires you to provide an API Gateway endpoint URL to call for
     *        authentication using the <code>IdentityProviderDetails</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityProviderType
     */

    public ListedServer withIdentityProviderType(String identityProviderType) {
        setIdentityProviderType(identityProviderType);
        return this;
    }

    /**
     * <p>
     * Specifies the mode of authentication for a server. The default value is <code>SERVICE_MANAGED</code>, which
     * allows you to store and access user credentials within the Amazon Web Services Transfer Family service.
     * </p>
     * <p>
     * Use <code>AWS_DIRECTORY_SERVICE</code> to provide access to Active Directory groups in Amazon Web Services
     * Managed Active Directory or Microsoft Active Directory in your on-premises environment or in Amazon Web Services
     * using AD Connectors. This option also requires you to provide a Directory ID using the
     * <code>IdentityProviderDetails</code> parameter.
     * </p>
     * <p>
     * Use the <code>API_GATEWAY</code> value to integrate with an identity provider of your choosing. The
     * <code>API_GATEWAY</code> setting requires you to provide an API Gateway endpoint URL to call for authentication
     * using the <code>IdentityProviderDetails</code> parameter.
     * </p>
     * 
     * @param identityProviderType
     *        Specifies the mode of authentication for a server. The default value is <code>SERVICE_MANAGED</code>,
     *        which allows you to store and access user credentials within the Amazon Web Services Transfer Family
     *        service.</p>
     *        <p>
     *        Use <code>AWS_DIRECTORY_SERVICE</code> to provide access to Active Directory groups in Amazon Web Services
     *        Managed Active Directory or Microsoft Active Directory in your on-premises environment or in Amazon Web
     *        Services using AD Connectors. This option also requires you to provide a Directory ID using the
     *        <code>IdentityProviderDetails</code> parameter.
     *        </p>
     *        <p>
     *        Use the <code>API_GATEWAY</code> value to integrate with an identity provider of your choosing. The
     *        <code>API_GATEWAY</code> setting requires you to provide an API Gateway endpoint URL to call for
     *        authentication using the <code>IdentityProviderDetails</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityProviderType
     */

    public ListedServer withIdentityProviderType(IdentityProviderType identityProviderType) {
        this.identityProviderType = identityProviderType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the type of VPC endpoint that your server is connected to. If your server is connected to a VPC
     * endpoint, your server isn't accessible over the public internet.
     * </p>
     * 
     * @param endpointType
     *        Specifies the type of VPC endpoint that your server is connected to. If your server is connected to a VPC
     *        endpoint, your server isn't accessible over the public internet.
     * @see EndpointType
     */

    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    /**
     * <p>
     * Specifies the type of VPC endpoint that your server is connected to. If your server is connected to a VPC
     * endpoint, your server isn't accessible over the public internet.
     * </p>
     * 
     * @return Specifies the type of VPC endpoint that your server is connected to. If your server is connected to a VPC
     *         endpoint, your server isn't accessible over the public internet.
     * @see EndpointType
     */

    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * <p>
     * Specifies the type of VPC endpoint that your server is connected to. If your server is connected to a VPC
     * endpoint, your server isn't accessible over the public internet.
     * </p>
     * 
     * @param endpointType
     *        Specifies the type of VPC endpoint that your server is connected to. If your server is connected to a VPC
     *        endpoint, your server isn't accessible over the public internet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointType
     */

    public ListedServer withEndpointType(String endpointType) {
        setEndpointType(endpointType);
        return this;
    }

    /**
     * <p>
     * Specifies the type of VPC endpoint that your server is connected to. If your server is connected to a VPC
     * endpoint, your server isn't accessible over the public internet.
     * </p>
     * 
     * @param endpointType
     *        Specifies the type of VPC endpoint that your server is connected to. If your server is connected to a VPC
     *        endpoint, your server isn't accessible over the public internet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointType
     */

    public ListedServer withEndpointType(EndpointType endpointType) {
        this.endpointType = endpointType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the Amazon Web Services Identity and Access Management (IAM) role
     * that allows a server to turn on Amazon CloudWatch logging for Amazon S3 or Amazon EFS events. When set, user
     * activity can be viewed in your CloudWatch logs.
     * </p>
     * 
     * @param loggingRole
     *        Specifies the Amazon Resource Name (ARN) of the Amazon Web Services Identity and Access Management (IAM)
     *        role that allows a server to turn on Amazon CloudWatch logging for Amazon S3 or Amazon EFS events. When
     *        set, user activity can be viewed in your CloudWatch logs.
     */

    public void setLoggingRole(String loggingRole) {
        this.loggingRole = loggingRole;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the Amazon Web Services Identity and Access Management (IAM) role
     * that allows a server to turn on Amazon CloudWatch logging for Amazon S3 or Amazon EFS events. When set, user
     * activity can be viewed in your CloudWatch logs.
     * </p>
     * 
     * @return Specifies the Amazon Resource Name (ARN) of the Amazon Web Services Identity and Access Management (IAM)
     *         role that allows a server to turn on Amazon CloudWatch logging for Amazon S3 or Amazon EFS events. When
     *         set, user activity can be viewed in your CloudWatch logs.
     */

    public String getLoggingRole() {
        return this.loggingRole;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the Amazon Web Services Identity and Access Management (IAM) role
     * that allows a server to turn on Amazon CloudWatch logging for Amazon S3 or Amazon EFS events. When set, user
     * activity can be viewed in your CloudWatch logs.
     * </p>
     * 
     * @param loggingRole
     *        Specifies the Amazon Resource Name (ARN) of the Amazon Web Services Identity and Access Management (IAM)
     *        role that allows a server to turn on Amazon CloudWatch logging for Amazon S3 or Amazon EFS events. When
     *        set, user activity can be viewed in your CloudWatch logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedServer withLoggingRole(String loggingRole) {
        setLoggingRole(loggingRole);
        return this;
    }

    /**
     * <p>
     * Specifies the unique system assigned identifier for the servers that were listed.
     * </p>
     * 
     * @param serverId
     *        Specifies the unique system assigned identifier for the servers that were listed.
     */

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * Specifies the unique system assigned identifier for the servers that were listed.
     * </p>
     * 
     * @return Specifies the unique system assigned identifier for the servers that were listed.
     */

    public String getServerId() {
        return this.serverId;
    }

    /**
     * <p>
     * Specifies the unique system assigned identifier for the servers that were listed.
     * </p>
     * 
     * @param serverId
     *        Specifies the unique system assigned identifier for the servers that were listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedServer withServerId(String serverId) {
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

    public ListedServer withState(String state) {
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

    public ListedServer withState(State state) {
        this.state = state.toString();
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

    public ListedServer withUserCount(Integer userCount) {
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
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getIdentityProviderType() != null)
            sb.append("IdentityProviderType: ").append(getIdentityProviderType()).append(",");
        if (getEndpointType() != null)
            sb.append("EndpointType: ").append(getEndpointType()).append(",");
        if (getLoggingRole() != null)
            sb.append("LoggingRole: ").append(getLoggingRole()).append(",");
        if (getServerId() != null)
            sb.append("ServerId: ").append(getServerId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
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

        if (obj instanceof ListedServer == false)
            return false;
        ListedServer other = (ListedServer) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getIdentityProviderType() == null ^ this.getIdentityProviderType() == null)
            return false;
        if (other.getIdentityProviderType() != null && other.getIdentityProviderType().equals(this.getIdentityProviderType()) == false)
            return false;
        if (other.getEndpointType() == null ^ this.getEndpointType() == null)
            return false;
        if (other.getEndpointType() != null && other.getEndpointType().equals(this.getEndpointType()) == false)
            return false;
        if (other.getLoggingRole() == null ^ this.getLoggingRole() == null)
            return false;
        if (other.getLoggingRole() != null && other.getLoggingRole().equals(this.getLoggingRole()) == false)
            return false;
        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
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
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getIdentityProviderType() == null) ? 0 : getIdentityProviderType().hashCode());
        hashCode = prime * hashCode + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        hashCode = prime * hashCode + ((getLoggingRole() == null) ? 0 : getLoggingRole().hashCode());
        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getUserCount() == null) ? 0 : getUserCount().hashCode());
        return hashCode;
    }

    @Override
    public ListedServer clone() {
        try {
            return (ListedServer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.ListedServerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
