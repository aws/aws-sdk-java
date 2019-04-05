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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describe the properties of the server that was specified. Information returned includes: the server Amazon Resource
 * Name (ARN), the authentication configuration and type, the logging role, server Id and state, and assigned tags or
 * metadata.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DescribedServer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribedServer implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) for the server to be described.
     * </p>
     */
    private String arn;

    private EndpointDetails endpointDetails;

    private String endpointType;
    /**
     * <p>
     * Specifies information to call a customer-supplied authentication API. This field is not populated when the
     * <code>IdentityProviderType</code> of the server is <code>SERVICE_MANAGED</code>&gt;.
     * </p>
     */
    private IdentityProviderDetails identityProviderDetails;
    /**
     * <p>
     * This property defines the mode of authentication method enabled for this service. A value of
     * <code>SERVICE_MANAGED</code>, means that you are using this Server to store and access SFTP user credentials
     * within the service. A value of <code>API_GATEWAY</code> indicates that you have integrated an API Gateway
     * endpoint that will be invoked for authenticating your user into the service.
     * </p>
     */
    private String identityProviderType;
    /**
     * <p>
     * This property is an AWS Identity and Access Management (IAM) entity that allows the server to turn on Amazon
     * CloudWatch logging for Amazon S3 events. When set, user activity can be view in your CloudWatch logs.
     * </p>
     */
    private String loggingRole;
    /**
     * <p>
     * This property is a unique system assigned identifier for the SFTP server that you instantiate.
     * </p>
     */
    private String serverId;
    /**
     * <p>
     * The condition of the SFTP server for the server that was described. A value of <code>ONLINE</code> indicates that
     * the server can accept jobs and transfer files. A <code>State</code> value of <code>OFFLINE</code> means that the
     * server cannot perform file transfer operations.
     * </p>
     * <p>
     * The states of <code>STARTING</code> and <code>STOPPING</code> indicated that the server is in an intermediate
     * state, either not fully able to respond, or not fully offline. The values of <code>START_FAILED</code> or
     * <code>STOP_FAILED</code> can indicate an error condition.
     * </p>
     */
    private String state;
    /**
     * <p>
     * This property contains the key-value pairs that you can use to search for and group servers that were assigned to
     * the server that was described.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The number of users that are assigned to the SFTP server you specified with the <code>ServerId</code>.
     * </p>
     */
    private Integer userCount;

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) for the server to be described.
     * </p>
     * 
     * @param arn
     *        Specifies the unique Amazon Resource Name (ARN) for the server to be described.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) for the server to be described.
     * </p>
     * 
     * @return Specifies the unique Amazon Resource Name (ARN) for the server to be described.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) for the server to be described.
     * </p>
     * 
     * @param arn
     *        Specifies the unique Amazon Resource Name (ARN) for the server to be described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedServer withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * @param endpointDetails
     */

    public void setEndpointDetails(EndpointDetails endpointDetails) {
        this.endpointDetails = endpointDetails;
    }

    /**
     * @return
     */

    public EndpointDetails getEndpointDetails() {
        return this.endpointDetails;
    }

    /**
     * @param endpointDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedServer withEndpointDetails(EndpointDetails endpointDetails) {
        setEndpointDetails(endpointDetails);
        return this;
    }

    /**
     * @param endpointType
     * @see EndpointType
     */

    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    /**
     * @return
     * @see EndpointType
     */

    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * @param endpointType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointType
     */

    public DescribedServer withEndpointType(String endpointType) {
        setEndpointType(endpointType);
        return this;
    }

    /**
     * @param endpointType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointType
     */

    public DescribedServer withEndpointType(EndpointType endpointType) {
        this.endpointType = endpointType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies information to call a customer-supplied authentication API. This field is not populated when the
     * <code>IdentityProviderType</code> of the server is <code>SERVICE_MANAGED</code>&gt;.
     * </p>
     * 
     * @param identityProviderDetails
     *        Specifies information to call a customer-supplied authentication API. This field is not populated when the
     *        <code>IdentityProviderType</code> of the server is <code>SERVICE_MANAGED</code>&gt;.
     */

    public void setIdentityProviderDetails(IdentityProviderDetails identityProviderDetails) {
        this.identityProviderDetails = identityProviderDetails;
    }

    /**
     * <p>
     * Specifies information to call a customer-supplied authentication API. This field is not populated when the
     * <code>IdentityProviderType</code> of the server is <code>SERVICE_MANAGED</code>&gt;.
     * </p>
     * 
     * @return Specifies information to call a customer-supplied authentication API. This field is not populated when
     *         the <code>IdentityProviderType</code> of the server is <code>SERVICE_MANAGED</code>&gt;.
     */

    public IdentityProviderDetails getIdentityProviderDetails() {
        return this.identityProviderDetails;
    }

    /**
     * <p>
     * Specifies information to call a customer-supplied authentication API. This field is not populated when the
     * <code>IdentityProviderType</code> of the server is <code>SERVICE_MANAGED</code>&gt;.
     * </p>
     * 
     * @param identityProviderDetails
     *        Specifies information to call a customer-supplied authentication API. This field is not populated when the
     *        <code>IdentityProviderType</code> of the server is <code>SERVICE_MANAGED</code>&gt;.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedServer withIdentityProviderDetails(IdentityProviderDetails identityProviderDetails) {
        setIdentityProviderDetails(identityProviderDetails);
        return this;
    }

    /**
     * <p>
     * This property defines the mode of authentication method enabled for this service. A value of
     * <code>SERVICE_MANAGED</code>, means that you are using this Server to store and access SFTP user credentials
     * within the service. A value of <code>API_GATEWAY</code> indicates that you have integrated an API Gateway
     * endpoint that will be invoked for authenticating your user into the service.
     * </p>
     * 
     * @param identityProviderType
     *        This property defines the mode of authentication method enabled for this service. A value of
     *        <code>SERVICE_MANAGED</code>, means that you are using this Server to store and access SFTP user
     *        credentials within the service. A value of <code>API_GATEWAY</code> indicates that you have integrated an
     *        API Gateway endpoint that will be invoked for authenticating your user into the service.
     * @see IdentityProviderType
     */

    public void setIdentityProviderType(String identityProviderType) {
        this.identityProviderType = identityProviderType;
    }

    /**
     * <p>
     * This property defines the mode of authentication method enabled for this service. A value of
     * <code>SERVICE_MANAGED</code>, means that you are using this Server to store and access SFTP user credentials
     * within the service. A value of <code>API_GATEWAY</code> indicates that you have integrated an API Gateway
     * endpoint that will be invoked for authenticating your user into the service.
     * </p>
     * 
     * @return This property defines the mode of authentication method enabled for this service. A value of
     *         <code>SERVICE_MANAGED</code>, means that you are using this Server to store and access SFTP user
     *         credentials within the service. A value of <code>API_GATEWAY</code> indicates that you have integrated an
     *         API Gateway endpoint that will be invoked for authenticating your user into the service.
     * @see IdentityProviderType
     */

    public String getIdentityProviderType() {
        return this.identityProviderType;
    }

    /**
     * <p>
     * This property defines the mode of authentication method enabled for this service. A value of
     * <code>SERVICE_MANAGED</code>, means that you are using this Server to store and access SFTP user credentials
     * within the service. A value of <code>API_GATEWAY</code> indicates that you have integrated an API Gateway
     * endpoint that will be invoked for authenticating your user into the service.
     * </p>
     * 
     * @param identityProviderType
     *        This property defines the mode of authentication method enabled for this service. A value of
     *        <code>SERVICE_MANAGED</code>, means that you are using this Server to store and access SFTP user
     *        credentials within the service. A value of <code>API_GATEWAY</code> indicates that you have integrated an
     *        API Gateway endpoint that will be invoked for authenticating your user into the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityProviderType
     */

    public DescribedServer withIdentityProviderType(String identityProviderType) {
        setIdentityProviderType(identityProviderType);
        return this;
    }

    /**
     * <p>
     * This property defines the mode of authentication method enabled for this service. A value of
     * <code>SERVICE_MANAGED</code>, means that you are using this Server to store and access SFTP user credentials
     * within the service. A value of <code>API_GATEWAY</code> indicates that you have integrated an API Gateway
     * endpoint that will be invoked for authenticating your user into the service.
     * </p>
     * 
     * @param identityProviderType
     *        This property defines the mode of authentication method enabled for this service. A value of
     *        <code>SERVICE_MANAGED</code>, means that you are using this Server to store and access SFTP user
     *        credentials within the service. A value of <code>API_GATEWAY</code> indicates that you have integrated an
     *        API Gateway endpoint that will be invoked for authenticating your user into the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityProviderType
     */

    public DescribedServer withIdentityProviderType(IdentityProviderType identityProviderType) {
        this.identityProviderType = identityProviderType.toString();
        return this;
    }

    /**
     * <p>
     * This property is an AWS Identity and Access Management (IAM) entity that allows the server to turn on Amazon
     * CloudWatch logging for Amazon S3 events. When set, user activity can be view in your CloudWatch logs.
     * </p>
     * 
     * @param loggingRole
     *        This property is an AWS Identity and Access Management (IAM) entity that allows the server to turn on
     *        Amazon CloudWatch logging for Amazon S3 events. When set, user activity can be view in your CloudWatch
     *        logs.
     */

    public void setLoggingRole(String loggingRole) {
        this.loggingRole = loggingRole;
    }

    /**
     * <p>
     * This property is an AWS Identity and Access Management (IAM) entity that allows the server to turn on Amazon
     * CloudWatch logging for Amazon S3 events. When set, user activity can be view in your CloudWatch logs.
     * </p>
     * 
     * @return This property is an AWS Identity and Access Management (IAM) entity that allows the server to turn on
     *         Amazon CloudWatch logging for Amazon S3 events. When set, user activity can be view in your CloudWatch
     *         logs.
     */

    public String getLoggingRole() {
        return this.loggingRole;
    }

    /**
     * <p>
     * This property is an AWS Identity and Access Management (IAM) entity that allows the server to turn on Amazon
     * CloudWatch logging for Amazon S3 events. When set, user activity can be view in your CloudWatch logs.
     * </p>
     * 
     * @param loggingRole
     *        This property is an AWS Identity and Access Management (IAM) entity that allows the server to turn on
     *        Amazon CloudWatch logging for Amazon S3 events. When set, user activity can be view in your CloudWatch
     *        logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedServer withLoggingRole(String loggingRole) {
        setLoggingRole(loggingRole);
        return this;
    }

    /**
     * <p>
     * This property is a unique system assigned identifier for the SFTP server that you instantiate.
     * </p>
     * 
     * @param serverId
     *        This property is a unique system assigned identifier for the SFTP server that you instantiate.
     */

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * This property is a unique system assigned identifier for the SFTP server that you instantiate.
     * </p>
     * 
     * @return This property is a unique system assigned identifier for the SFTP server that you instantiate.
     */

    public String getServerId() {
        return this.serverId;
    }

    /**
     * <p>
     * This property is a unique system assigned identifier for the SFTP server that you instantiate.
     * </p>
     * 
     * @param serverId
     *        This property is a unique system assigned identifier for the SFTP server that you instantiate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedServer withServerId(String serverId) {
        setServerId(serverId);
        return this;
    }

    /**
     * <p>
     * The condition of the SFTP server for the server that was described. A value of <code>ONLINE</code> indicates that
     * the server can accept jobs and transfer files. A <code>State</code> value of <code>OFFLINE</code> means that the
     * server cannot perform file transfer operations.
     * </p>
     * <p>
     * The states of <code>STARTING</code> and <code>STOPPING</code> indicated that the server is in an intermediate
     * state, either not fully able to respond, or not fully offline. The values of <code>START_FAILED</code> or
     * <code>STOP_FAILED</code> can indicate an error condition.
     * </p>
     * 
     * @param state
     *        The condition of the SFTP server for the server that was described. A value of <code>ONLINE</code>
     *        indicates that the server can accept jobs and transfer files. A <code>State</code> value of
     *        <code>OFFLINE</code> means that the server cannot perform file transfer operations.</p>
     *        <p>
     *        The states of <code>STARTING</code> and <code>STOPPING</code> indicated that the server is in an
     *        intermediate state, either not fully able to respond, or not fully offline. The values of
     *        <code>START_FAILED</code> or <code>STOP_FAILED</code> can indicate an error condition.
     * @see State
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The condition of the SFTP server for the server that was described. A value of <code>ONLINE</code> indicates that
     * the server can accept jobs and transfer files. A <code>State</code> value of <code>OFFLINE</code> means that the
     * server cannot perform file transfer operations.
     * </p>
     * <p>
     * The states of <code>STARTING</code> and <code>STOPPING</code> indicated that the server is in an intermediate
     * state, either not fully able to respond, or not fully offline. The values of <code>START_FAILED</code> or
     * <code>STOP_FAILED</code> can indicate an error condition.
     * </p>
     * 
     * @return The condition of the SFTP server for the server that was described. A value of <code>ONLINE</code>
     *         indicates that the server can accept jobs and transfer files. A <code>State</code> value of
     *         <code>OFFLINE</code> means that the server cannot perform file transfer operations.</p>
     *         <p>
     *         The states of <code>STARTING</code> and <code>STOPPING</code> indicated that the server is in an
     *         intermediate state, either not fully able to respond, or not fully offline. The values of
     *         <code>START_FAILED</code> or <code>STOP_FAILED</code> can indicate an error condition.
     * @see State
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The condition of the SFTP server for the server that was described. A value of <code>ONLINE</code> indicates that
     * the server can accept jobs and transfer files. A <code>State</code> value of <code>OFFLINE</code> means that the
     * server cannot perform file transfer operations.
     * </p>
     * <p>
     * The states of <code>STARTING</code> and <code>STOPPING</code> indicated that the server is in an intermediate
     * state, either not fully able to respond, or not fully offline. The values of <code>START_FAILED</code> or
     * <code>STOP_FAILED</code> can indicate an error condition.
     * </p>
     * 
     * @param state
     *        The condition of the SFTP server for the server that was described. A value of <code>ONLINE</code>
     *        indicates that the server can accept jobs and transfer files. A <code>State</code> value of
     *        <code>OFFLINE</code> means that the server cannot perform file transfer operations.</p>
     *        <p>
     *        The states of <code>STARTING</code> and <code>STOPPING</code> indicated that the server is in an
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
     * The condition of the SFTP server for the server that was described. A value of <code>ONLINE</code> indicates that
     * the server can accept jobs and transfer files. A <code>State</code> value of <code>OFFLINE</code> means that the
     * server cannot perform file transfer operations.
     * </p>
     * <p>
     * The states of <code>STARTING</code> and <code>STOPPING</code> indicated that the server is in an intermediate
     * state, either not fully able to respond, or not fully offline. The values of <code>START_FAILED</code> or
     * <code>STOP_FAILED</code> can indicate an error condition.
     * </p>
     * 
     * @param state
     *        The condition of the SFTP server for the server that was described. A value of <code>ONLINE</code>
     *        indicates that the server can accept jobs and transfer files. A <code>State</code> value of
     *        <code>OFFLINE</code> means that the server cannot perform file transfer operations.</p>
     *        <p>
     *        The states of <code>STARTING</code> and <code>STOPPING</code> indicated that the server is in an
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
     * This property contains the key-value pairs that you can use to search for and group servers that were assigned to
     * the server that was described.
     * </p>
     * 
     * @return This property contains the key-value pairs that you can use to search for and group servers that were
     *         assigned to the server that was described.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * This property contains the key-value pairs that you can use to search for and group servers that were assigned to
     * the server that was described.
     * </p>
     * 
     * @param tags
     *        This property contains the key-value pairs that you can use to search for and group servers that were
     *        assigned to the server that was described.
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
     * This property contains the key-value pairs that you can use to search for and group servers that were assigned to
     * the server that was described.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        This property contains the key-value pairs that you can use to search for and group servers that were
     *        assigned to the server that was described.
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
     * This property contains the key-value pairs that you can use to search for and group servers that were assigned to
     * the server that was described.
     * </p>
     * 
     * @param tags
     *        This property contains the key-value pairs that you can use to search for and group servers that were
     *        assigned to the server that was described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribedServer withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The number of users that are assigned to the SFTP server you specified with the <code>ServerId</code>.
     * </p>
     * 
     * @param userCount
     *        The number of users that are assigned to the SFTP server you specified with the <code>ServerId</code>.
     */

    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
    }

    /**
     * <p>
     * The number of users that are assigned to the SFTP server you specified with the <code>ServerId</code>.
     * </p>
     * 
     * @return The number of users that are assigned to the SFTP server you specified with the <code>ServerId</code>.
     */

    public Integer getUserCount() {
        return this.userCount;
    }

    /**
     * <p>
     * The number of users that are assigned to the SFTP server you specified with the <code>ServerId</code>.
     * </p>
     * 
     * @param userCount
     *        The number of users that are assigned to the SFTP server you specified with the <code>ServerId</code>.
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
        if (getEndpointDetails() != null)
            sb.append("EndpointDetails: ").append(getEndpointDetails()).append(",");
        if (getEndpointType() != null)
            sb.append("EndpointType: ").append(getEndpointType()).append(",");
        if (getIdentityProviderDetails() != null)
            sb.append("IdentityProviderDetails: ").append(getIdentityProviderDetails()).append(",");
        if (getIdentityProviderType() != null)
            sb.append("IdentityProviderType: ").append(getIdentityProviderType()).append(",");
        if (getLoggingRole() != null)
            sb.append("LoggingRole: ").append(getLoggingRole()).append(",");
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
        if (other.getEndpointDetails() == null ^ this.getEndpointDetails() == null)
            return false;
        if (other.getEndpointDetails() != null && other.getEndpointDetails().equals(this.getEndpointDetails()) == false)
            return false;
        if (other.getEndpointType() == null ^ this.getEndpointType() == null)
            return false;
        if (other.getEndpointType() != null && other.getEndpointType().equals(this.getEndpointType()) == false)
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
        hashCode = prime * hashCode + ((getEndpointDetails() == null) ? 0 : getEndpointDetails().hashCode());
        hashCode = prime * hashCode + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        hashCode = prime * hashCode + ((getIdentityProviderDetails() == null) ? 0 : getIdentityProviderDetails().hashCode());
        hashCode = prime * hashCode + ((getIdentityProviderType() == null) ? 0 : getIdentityProviderType().hashCode());
        hashCode = prime * hashCode + ((getLoggingRole() == null) ? 0 : getLoggingRole().hashCode());
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
