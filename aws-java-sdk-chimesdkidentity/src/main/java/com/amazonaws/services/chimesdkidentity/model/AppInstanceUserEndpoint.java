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
package com.amazonaws.services.chimesdkidentity.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An endpoint under an Amazon Chime <code>AppInstanceUser</code> that receives messages for a user. For push
 * notifications, the endpoint is a mobile device used to receive mobile push notifications for a user.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/AppInstanceUserEndpoint"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppInstanceUserEndpoint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code>.
     * </p>
     */
    private String appInstanceUserArn;
    /**
     * <p>
     * The unique identifier of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     */
    private String endpointId;
    /**
     * <p>
     * The name of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The ARN of the resource to which the endpoint belongs.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The attributes of an <code>Endpoint</code>.
     * </p>
     */
    private EndpointAttributes endpointAttributes;
    /**
     * <p>
     * The time at which an <code>AppInstanceUserEndpoint</code> was created.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The time at which an <code>AppInstanceUserEndpoint</code> was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTimestamp;
    /**
     * <p>
     * Boolean that controls whether the <code>AppInstanceUserEndpoint</code> is opted in to receive messages.
     * <code>ALL</code> indicates the endpoint will receive all messages. <code>NONE</code> indicates the endpoint will
     * receive no messages.
     * </p>
     */
    private String allowMessages;
    /**
     * <p>
     * A read-only field that represents the state of an <code>AppInstanceUserEndpoint</code>. Supported values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>: The <code>AppInstanceUserEndpoint</code> is active and able to receive messages. When
     * <code>ACTIVE</code>, the <code>EndpointStatusReason</code> remains empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVE</code>: The <code>AppInstanceUserEndpoint</code> is inactive and can't receive message. When
     * <code>INACTIVE</code>, the corresponding reason will be conveyed through <code>EndpointStatusReason</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_DEVICE_TOKEN</code> indicates that an <code>AppInstanceUserEndpoint</code> is <code>INACTIVE</code>
     * due to invalid device token
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_PINPOINT_ARN</code> indicates that an <code>AppInstanceUserEndpoint</code> is <code>INACTIVE</code>
     * due to an invalid pinpoint ARN that was input through the <code>ResourceArn</code> field.
     * </p>
     * </li>
     * </ul>
     */
    private EndpointState endpointState;

    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code>.
     * </p>
     * 
     * @param appInstanceUserArn
     *        The ARN of the <code>AppInstanceUser</code>.
     */

    public void setAppInstanceUserArn(String appInstanceUserArn) {
        this.appInstanceUserArn = appInstanceUserArn;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code>.
     * </p>
     * 
     * @return The ARN of the <code>AppInstanceUser</code>.
     */

    public String getAppInstanceUserArn() {
        return this.appInstanceUserArn;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code>.
     * </p>
     * 
     * @param appInstanceUserArn
     *        The ARN of the <code>AppInstanceUser</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppInstanceUserEndpoint withAppInstanceUserArn(String appInstanceUserArn) {
        setAppInstanceUserArn(appInstanceUserArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * 
     * @param endpointId
     *        The unique identifier of the <code>AppInstanceUserEndpoint</code>.
     */

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    /**
     * <p>
     * The unique identifier of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * 
     * @return The unique identifier of the <code>AppInstanceUserEndpoint</code>.
     */

    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * <p>
     * The unique identifier of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * 
     * @param endpointId
     *        The unique identifier of the <code>AppInstanceUserEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppInstanceUserEndpoint withEndpointId(String endpointId) {
        setEndpointId(endpointId);
        return this;
    }

    /**
     * <p>
     * The name of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * 
     * @param name
     *        The name of the <code>AppInstanceUserEndpoint</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * 
     * @return The name of the <code>AppInstanceUserEndpoint</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * 
     * @param name
     *        The name of the <code>AppInstanceUserEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppInstanceUserEndpoint withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * 
     * @param type
     *        The type of the <code>AppInstanceUserEndpoint</code>.
     * @see AppInstanceUserEndpointType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * 
     * @return The type of the <code>AppInstanceUserEndpoint</code>.
     * @see AppInstanceUserEndpointType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * 
     * @param type
     *        The type of the <code>AppInstanceUserEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppInstanceUserEndpointType
     */

    public AppInstanceUserEndpoint withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * 
     * @param type
     *        The type of the <code>AppInstanceUserEndpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppInstanceUserEndpointType
     */

    public AppInstanceUserEndpoint withType(AppInstanceUserEndpointType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the resource to which the endpoint belongs.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the resource to which the endpoint belongs.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of the resource to which the endpoint belongs.
     * </p>
     * 
     * @return The ARN of the resource to which the endpoint belongs.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARN of the resource to which the endpoint belongs.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the resource to which the endpoint belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppInstanceUserEndpoint withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The attributes of an <code>Endpoint</code>.
     * </p>
     * 
     * @param endpointAttributes
     *        The attributes of an <code>Endpoint</code>.
     */

    public void setEndpointAttributes(EndpointAttributes endpointAttributes) {
        this.endpointAttributes = endpointAttributes;
    }

    /**
     * <p>
     * The attributes of an <code>Endpoint</code>.
     * </p>
     * 
     * @return The attributes of an <code>Endpoint</code>.
     */

    public EndpointAttributes getEndpointAttributes() {
        return this.endpointAttributes;
    }

    /**
     * <p>
     * The attributes of an <code>Endpoint</code>.
     * </p>
     * 
     * @param endpointAttributes
     *        The attributes of an <code>Endpoint</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppInstanceUserEndpoint withEndpointAttributes(EndpointAttributes endpointAttributes) {
        setEndpointAttributes(endpointAttributes);
        return this;
    }

    /**
     * <p>
     * The time at which an <code>AppInstanceUserEndpoint</code> was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which an <code>AppInstanceUserEndpoint</code> was created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The time at which an <code>AppInstanceUserEndpoint</code> was created.
     * </p>
     * 
     * @return The time at which an <code>AppInstanceUserEndpoint</code> was created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The time at which an <code>AppInstanceUserEndpoint</code> was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which an <code>AppInstanceUserEndpoint</code> was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppInstanceUserEndpoint withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The time at which an <code>AppInstanceUserEndpoint</code> was last updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The time at which an <code>AppInstanceUserEndpoint</code> was last updated.
     */

    public void setLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The time at which an <code>AppInstanceUserEndpoint</code> was last updated.
     * </p>
     * 
     * @return The time at which an <code>AppInstanceUserEndpoint</code> was last updated.
     */

    public java.util.Date getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The time at which an <code>AppInstanceUserEndpoint</code> was last updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The time at which an <code>AppInstanceUserEndpoint</code> was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppInstanceUserEndpoint withLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        setLastUpdatedTimestamp(lastUpdatedTimestamp);
        return this;
    }

    /**
     * <p>
     * Boolean that controls whether the <code>AppInstanceUserEndpoint</code> is opted in to receive messages.
     * <code>ALL</code> indicates the endpoint will receive all messages. <code>NONE</code> indicates the endpoint will
     * receive no messages.
     * </p>
     * 
     * @param allowMessages
     *        Boolean that controls whether the <code>AppInstanceUserEndpoint</code> is opted in to receive messages.
     *        <code>ALL</code> indicates the endpoint will receive all messages. <code>NONE</code> indicates the
     *        endpoint will receive no messages.
     * @see AllowMessages
     */

    public void setAllowMessages(String allowMessages) {
        this.allowMessages = allowMessages;
    }

    /**
     * <p>
     * Boolean that controls whether the <code>AppInstanceUserEndpoint</code> is opted in to receive messages.
     * <code>ALL</code> indicates the endpoint will receive all messages. <code>NONE</code> indicates the endpoint will
     * receive no messages.
     * </p>
     * 
     * @return Boolean that controls whether the <code>AppInstanceUserEndpoint</code> is opted in to receive messages.
     *         <code>ALL</code> indicates the endpoint will receive all messages. <code>NONE</code> indicates the
     *         endpoint will receive no messages.
     * @see AllowMessages
     */

    public String getAllowMessages() {
        return this.allowMessages;
    }

    /**
     * <p>
     * Boolean that controls whether the <code>AppInstanceUserEndpoint</code> is opted in to receive messages.
     * <code>ALL</code> indicates the endpoint will receive all messages. <code>NONE</code> indicates the endpoint will
     * receive no messages.
     * </p>
     * 
     * @param allowMessages
     *        Boolean that controls whether the <code>AppInstanceUserEndpoint</code> is opted in to receive messages.
     *        <code>ALL</code> indicates the endpoint will receive all messages. <code>NONE</code> indicates the
     *        endpoint will receive no messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllowMessages
     */

    public AppInstanceUserEndpoint withAllowMessages(String allowMessages) {
        setAllowMessages(allowMessages);
        return this;
    }

    /**
     * <p>
     * Boolean that controls whether the <code>AppInstanceUserEndpoint</code> is opted in to receive messages.
     * <code>ALL</code> indicates the endpoint will receive all messages. <code>NONE</code> indicates the endpoint will
     * receive no messages.
     * </p>
     * 
     * @param allowMessages
     *        Boolean that controls whether the <code>AppInstanceUserEndpoint</code> is opted in to receive messages.
     *        <code>ALL</code> indicates the endpoint will receive all messages. <code>NONE</code> indicates the
     *        endpoint will receive no messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllowMessages
     */

    public AppInstanceUserEndpoint withAllowMessages(AllowMessages allowMessages) {
        this.allowMessages = allowMessages.toString();
        return this;
    }

    /**
     * <p>
     * A read-only field that represents the state of an <code>AppInstanceUserEndpoint</code>. Supported values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>: The <code>AppInstanceUserEndpoint</code> is active and able to receive messages. When
     * <code>ACTIVE</code>, the <code>EndpointStatusReason</code> remains empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVE</code>: The <code>AppInstanceUserEndpoint</code> is inactive and can't receive message. When
     * <code>INACTIVE</code>, the corresponding reason will be conveyed through <code>EndpointStatusReason</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_DEVICE_TOKEN</code> indicates that an <code>AppInstanceUserEndpoint</code> is <code>INACTIVE</code>
     * due to invalid device token
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_PINPOINT_ARN</code> indicates that an <code>AppInstanceUserEndpoint</code> is <code>INACTIVE</code>
     * due to an invalid pinpoint ARN that was input through the <code>ResourceArn</code> field.
     * </p>
     * </li>
     * </ul>
     * 
     * @param endpointState
     *        A read-only field that represents the state of an <code>AppInstanceUserEndpoint</code>. Supported
     *        values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>: The <code>AppInstanceUserEndpoint</code> is active and able to receive messages. When
     *        <code>ACTIVE</code>, the <code>EndpointStatusReason</code> remains empty.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INACTIVE</code>: The <code>AppInstanceUserEndpoint</code> is inactive and can't receive message.
     *        When <code>INACTIVE</code>, the corresponding reason will be conveyed through
     *        <code>EndpointStatusReason</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INVALID_DEVICE_TOKEN</code> indicates that an <code>AppInstanceUserEndpoint</code> is
     *        <code>INACTIVE</code> due to invalid device token
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INVALID_PINPOINT_ARN</code> indicates that an <code>AppInstanceUserEndpoint</code> is
     *        <code>INACTIVE</code> due to an invalid pinpoint ARN that was input through the <code>ResourceArn</code>
     *        field.
     *        </p>
     *        </li>
     */

    public void setEndpointState(EndpointState endpointState) {
        this.endpointState = endpointState;
    }

    /**
     * <p>
     * A read-only field that represents the state of an <code>AppInstanceUserEndpoint</code>. Supported values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>: The <code>AppInstanceUserEndpoint</code> is active and able to receive messages. When
     * <code>ACTIVE</code>, the <code>EndpointStatusReason</code> remains empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVE</code>: The <code>AppInstanceUserEndpoint</code> is inactive and can't receive message. When
     * <code>INACTIVE</code>, the corresponding reason will be conveyed through <code>EndpointStatusReason</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_DEVICE_TOKEN</code> indicates that an <code>AppInstanceUserEndpoint</code> is <code>INACTIVE</code>
     * due to invalid device token
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_PINPOINT_ARN</code> indicates that an <code>AppInstanceUserEndpoint</code> is <code>INACTIVE</code>
     * due to an invalid pinpoint ARN that was input through the <code>ResourceArn</code> field.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A read-only field that represents the state of an <code>AppInstanceUserEndpoint</code>. Supported
     *         values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code>: The <code>AppInstanceUserEndpoint</code> is active and able to receive messages.
     *         When <code>ACTIVE</code>, the <code>EndpointStatusReason</code> remains empty.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INACTIVE</code>: The <code>AppInstanceUserEndpoint</code> is inactive and can't receive message.
     *         When <code>INACTIVE</code>, the corresponding reason will be conveyed through
     *         <code>EndpointStatusReason</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INVALID_DEVICE_TOKEN</code> indicates that an <code>AppInstanceUserEndpoint</code> is
     *         <code>INACTIVE</code> due to invalid device token
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INVALID_PINPOINT_ARN</code> indicates that an <code>AppInstanceUserEndpoint</code> is
     *         <code>INACTIVE</code> due to an invalid pinpoint ARN that was input through the <code>ResourceArn</code>
     *         field.
     *         </p>
     *         </li>
     */

    public EndpointState getEndpointState() {
        return this.endpointState;
    }

    /**
     * <p>
     * A read-only field that represents the state of an <code>AppInstanceUserEndpoint</code>. Supported values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>: The <code>AppInstanceUserEndpoint</code> is active and able to receive messages. When
     * <code>ACTIVE</code>, the <code>EndpointStatusReason</code> remains empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INACTIVE</code>: The <code>AppInstanceUserEndpoint</code> is inactive and can't receive message. When
     * <code>INACTIVE</code>, the corresponding reason will be conveyed through <code>EndpointStatusReason</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_DEVICE_TOKEN</code> indicates that an <code>AppInstanceUserEndpoint</code> is <code>INACTIVE</code>
     * due to invalid device token
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_PINPOINT_ARN</code> indicates that an <code>AppInstanceUserEndpoint</code> is <code>INACTIVE</code>
     * due to an invalid pinpoint ARN that was input through the <code>ResourceArn</code> field.
     * </p>
     * </li>
     * </ul>
     * 
     * @param endpointState
     *        A read-only field that represents the state of an <code>AppInstanceUserEndpoint</code>. Supported
     *        values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>: The <code>AppInstanceUserEndpoint</code> is active and able to receive messages. When
     *        <code>ACTIVE</code>, the <code>EndpointStatusReason</code> remains empty.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INACTIVE</code>: The <code>AppInstanceUserEndpoint</code> is inactive and can't receive message.
     *        When <code>INACTIVE</code>, the corresponding reason will be conveyed through
     *        <code>EndpointStatusReason</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INVALID_DEVICE_TOKEN</code> indicates that an <code>AppInstanceUserEndpoint</code> is
     *        <code>INACTIVE</code> due to invalid device token
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INVALID_PINPOINT_ARN</code> indicates that an <code>AppInstanceUserEndpoint</code> is
     *        <code>INACTIVE</code> due to an invalid pinpoint ARN that was input through the <code>ResourceArn</code>
     *        field.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppInstanceUserEndpoint withEndpointState(EndpointState endpointState) {
        setEndpointState(endpointState);
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
        if (getAppInstanceUserArn() != null)
            sb.append("AppInstanceUserArn: ").append("***Sensitive Data Redacted***").append(",");
        if (getEndpointId() != null)
            sb.append("EndpointId: ").append("***Sensitive Data Redacted***").append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append("***Sensitive Data Redacted***").append(",");
        if (getEndpointAttributes() != null)
            sb.append("EndpointAttributes: ").append(getEndpointAttributes()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getLastUpdatedTimestamp() != null)
            sb.append("LastUpdatedTimestamp: ").append(getLastUpdatedTimestamp()).append(",");
        if (getAllowMessages() != null)
            sb.append("AllowMessages: ").append(getAllowMessages()).append(",");
        if (getEndpointState() != null)
            sb.append("EndpointState: ").append(getEndpointState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppInstanceUserEndpoint == false)
            return false;
        AppInstanceUserEndpoint other = (AppInstanceUserEndpoint) obj;
        if (other.getAppInstanceUserArn() == null ^ this.getAppInstanceUserArn() == null)
            return false;
        if (other.getAppInstanceUserArn() != null && other.getAppInstanceUserArn().equals(this.getAppInstanceUserArn()) == false)
            return false;
        if (other.getEndpointId() == null ^ this.getEndpointId() == null)
            return false;
        if (other.getEndpointId() != null && other.getEndpointId().equals(this.getEndpointId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getEndpointAttributes() == null ^ this.getEndpointAttributes() == null)
            return false;
        if (other.getEndpointAttributes() != null && other.getEndpointAttributes().equals(this.getEndpointAttributes()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getLastUpdatedTimestamp() == null ^ this.getLastUpdatedTimestamp() == null)
            return false;
        if (other.getLastUpdatedTimestamp() != null && other.getLastUpdatedTimestamp().equals(this.getLastUpdatedTimestamp()) == false)
            return false;
        if (other.getAllowMessages() == null ^ this.getAllowMessages() == null)
            return false;
        if (other.getAllowMessages() != null && other.getAllowMessages().equals(this.getAllowMessages()) == false)
            return false;
        if (other.getEndpointState() == null ^ this.getEndpointState() == null)
            return false;
        if (other.getEndpointState() != null && other.getEndpointState().equals(this.getEndpointState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppInstanceUserArn() == null) ? 0 : getAppInstanceUserArn().hashCode());
        hashCode = prime * hashCode + ((getEndpointId() == null) ? 0 : getEndpointId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getEndpointAttributes() == null) ? 0 : getEndpointAttributes().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTimestamp() == null) ? 0 : getLastUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getAllowMessages() == null) ? 0 : getAllowMessages().hashCode());
        hashCode = prime * hashCode + ((getEndpointState() == null) ? 0 : getEndpointState().hashCode());
        return hashCode;
    }

    @Override
    public AppInstanceUserEndpoint clone() {
        try {
            return (AppInstanceUserEndpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkidentity.model.transform.AppInstanceUserEndpointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
