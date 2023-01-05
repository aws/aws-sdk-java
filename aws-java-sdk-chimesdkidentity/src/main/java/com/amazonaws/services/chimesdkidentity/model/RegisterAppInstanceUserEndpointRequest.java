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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/RegisterAppInstanceUserEndpoint"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterAppInstanceUserEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code>.
     * </p>
     */
    private String appInstanceUserArn;
    /**
     * <p>
     * The name of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of the <code>AppInstanceUserEndpoint</code>. Supported types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>APNS</code>: The mobile notification service for an Apple device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APNS_SANDBOX</code>: The sandbox environment of the mobile notification service for an Apple device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GCM</code>: The mobile notification service for an Android device.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Populate the <code>ResourceArn</code> value of each type as <code>PinpointAppArn</code>.
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
     * The idempotency token for each client request.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * Boolean that controls whether the AppInstanceUserEndpoint is opted in to receive messages. <code>ALL</code>
     * indicates the endpoint receives all messages. <code>NONE</code> indicates the endpoint receives no messages.
     * </p>
     */
    private String allowMessages;

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

    public RegisterAppInstanceUserEndpointRequest withAppInstanceUserArn(String appInstanceUserArn) {
        setAppInstanceUserArn(appInstanceUserArn);
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

    public RegisterAppInstanceUserEndpointRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of the <code>AppInstanceUserEndpoint</code>. Supported types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>APNS</code>: The mobile notification service for an Apple device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APNS_SANDBOX</code>: The sandbox environment of the mobile notification service for an Apple device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GCM</code>: The mobile notification service for an Android device.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Populate the <code>ResourceArn</code> value of each type as <code>PinpointAppArn</code>.
     * </p>
     * 
     * @param type
     *        The type of the <code>AppInstanceUserEndpoint</code>. Supported types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>APNS</code>: The mobile notification service for an Apple device.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>APNS_SANDBOX</code>: The sandbox environment of the mobile notification service for an Apple device.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GCM</code>: The mobile notification service for an Android device.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Populate the <code>ResourceArn</code> value of each type as <code>PinpointAppArn</code>.
     * @see AppInstanceUserEndpointType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the <code>AppInstanceUserEndpoint</code>. Supported types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>APNS</code>: The mobile notification service for an Apple device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APNS_SANDBOX</code>: The sandbox environment of the mobile notification service for an Apple device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GCM</code>: The mobile notification service for an Android device.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Populate the <code>ResourceArn</code> value of each type as <code>PinpointAppArn</code>.
     * </p>
     * 
     * @return The type of the <code>AppInstanceUserEndpoint</code>. Supported types:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>APNS</code>: The mobile notification service for an Apple device.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>APNS_SANDBOX</code>: The sandbox environment of the mobile notification service for an Apple
     *         device.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GCM</code>: The mobile notification service for an Android device.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Populate the <code>ResourceArn</code> value of each type as <code>PinpointAppArn</code>.
     * @see AppInstanceUserEndpointType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the <code>AppInstanceUserEndpoint</code>. Supported types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>APNS</code>: The mobile notification service for an Apple device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APNS_SANDBOX</code>: The sandbox environment of the mobile notification service for an Apple device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GCM</code>: The mobile notification service for an Android device.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Populate the <code>ResourceArn</code> value of each type as <code>PinpointAppArn</code>.
     * </p>
     * 
     * @param type
     *        The type of the <code>AppInstanceUserEndpoint</code>. Supported types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>APNS</code>: The mobile notification service for an Apple device.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>APNS_SANDBOX</code>: The sandbox environment of the mobile notification service for an Apple device.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GCM</code>: The mobile notification service for an Android device.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Populate the <code>ResourceArn</code> value of each type as <code>PinpointAppArn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppInstanceUserEndpointType
     */

    public RegisterAppInstanceUserEndpointRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the <code>AppInstanceUserEndpoint</code>. Supported types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>APNS</code>: The mobile notification service for an Apple device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APNS_SANDBOX</code>: The sandbox environment of the mobile notification service for an Apple device.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GCM</code>: The mobile notification service for an Android device.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Populate the <code>ResourceArn</code> value of each type as <code>PinpointAppArn</code>.
     * </p>
     * 
     * @param type
     *        The type of the <code>AppInstanceUserEndpoint</code>. Supported types:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>APNS</code>: The mobile notification service for an Apple device.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>APNS_SANDBOX</code>: The sandbox environment of the mobile notification service for an Apple device.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GCM</code>: The mobile notification service for an Android device.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Populate the <code>ResourceArn</code> value of each type as <code>PinpointAppArn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppInstanceUserEndpointType
     */

    public RegisterAppInstanceUserEndpointRequest withType(AppInstanceUserEndpointType type) {
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

    public RegisterAppInstanceUserEndpointRequest withResourceArn(String resourceArn) {
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

    public RegisterAppInstanceUserEndpointRequest withEndpointAttributes(EndpointAttributes endpointAttributes) {
        setEndpointAttributes(endpointAttributes);
        return this;
    }

    /**
     * <p>
     * The idempotency token for each client request.
     * </p>
     * 
     * @param clientRequestToken
     *        The idempotency token for each client request.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The idempotency token for each client request.
     * </p>
     * 
     * @return The idempotency token for each client request.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * The idempotency token for each client request.
     * </p>
     * 
     * @param clientRequestToken
     *        The idempotency token for each client request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterAppInstanceUserEndpointRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * Boolean that controls whether the AppInstanceUserEndpoint is opted in to receive messages. <code>ALL</code>
     * indicates the endpoint receives all messages. <code>NONE</code> indicates the endpoint receives no messages.
     * </p>
     * 
     * @param allowMessages
     *        Boolean that controls whether the AppInstanceUserEndpoint is opted in to receive messages.
     *        <code>ALL</code> indicates the endpoint receives all messages. <code>NONE</code> indicates the endpoint
     *        receives no messages.
     * @see AllowMessages
     */

    public void setAllowMessages(String allowMessages) {
        this.allowMessages = allowMessages;
    }

    /**
     * <p>
     * Boolean that controls whether the AppInstanceUserEndpoint is opted in to receive messages. <code>ALL</code>
     * indicates the endpoint receives all messages. <code>NONE</code> indicates the endpoint receives no messages.
     * </p>
     * 
     * @return Boolean that controls whether the AppInstanceUserEndpoint is opted in to receive messages.
     *         <code>ALL</code> indicates the endpoint receives all messages. <code>NONE</code> indicates the endpoint
     *         receives no messages.
     * @see AllowMessages
     */

    public String getAllowMessages() {
        return this.allowMessages;
    }

    /**
     * <p>
     * Boolean that controls whether the AppInstanceUserEndpoint is opted in to receive messages. <code>ALL</code>
     * indicates the endpoint receives all messages. <code>NONE</code> indicates the endpoint receives no messages.
     * </p>
     * 
     * @param allowMessages
     *        Boolean that controls whether the AppInstanceUserEndpoint is opted in to receive messages.
     *        <code>ALL</code> indicates the endpoint receives all messages. <code>NONE</code> indicates the endpoint
     *        receives no messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllowMessages
     */

    public RegisterAppInstanceUserEndpointRequest withAllowMessages(String allowMessages) {
        setAllowMessages(allowMessages);
        return this;
    }

    /**
     * <p>
     * Boolean that controls whether the AppInstanceUserEndpoint is opted in to receive messages. <code>ALL</code>
     * indicates the endpoint receives all messages. <code>NONE</code> indicates the endpoint receives no messages.
     * </p>
     * 
     * @param allowMessages
     *        Boolean that controls whether the AppInstanceUserEndpoint is opted in to receive messages.
     *        <code>ALL</code> indicates the endpoint receives all messages. <code>NONE</code> indicates the endpoint
     *        receives no messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AllowMessages
     */

    public RegisterAppInstanceUserEndpointRequest withAllowMessages(AllowMessages allowMessages) {
        this.allowMessages = allowMessages.toString();
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
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append("***Sensitive Data Redacted***").append(",");
        if (getEndpointAttributes() != null)
            sb.append("EndpointAttributes: ").append(getEndpointAttributes()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getAllowMessages() != null)
            sb.append("AllowMessages: ").append(getAllowMessages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterAppInstanceUserEndpointRequest == false)
            return false;
        RegisterAppInstanceUserEndpointRequest other = (RegisterAppInstanceUserEndpointRequest) obj;
        if (other.getAppInstanceUserArn() == null ^ this.getAppInstanceUserArn() == null)
            return false;
        if (other.getAppInstanceUserArn() != null && other.getAppInstanceUserArn().equals(this.getAppInstanceUserArn()) == false)
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
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getAllowMessages() == null ^ this.getAllowMessages() == null)
            return false;
        if (other.getAllowMessages() != null && other.getAllowMessages().equals(this.getAllowMessages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppInstanceUserArn() == null) ? 0 : getAppInstanceUserArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getEndpointAttributes() == null) ? 0 : getEndpointAttributes().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getAllowMessages() == null) ? 0 : getAllowMessages().hashCode());
        return hashCode;
    }

    @Override
    public RegisterAppInstanceUserEndpointRequest clone() {
        return (RegisterAppInstanceUserEndpointRequest) super.clone();
    }

}
