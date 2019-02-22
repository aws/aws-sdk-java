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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/CreateNotificationSubscription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateNotificationSubscriptionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the organization.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The endpoint to receive the notifications. If the protocol is HTTPS, the endpoint is a URL that begins with
     * <code>https</code>.
     * </p>
     */
    private String endpoint;
    /**
     * <p>
     * The protocol to use. The supported value is https, which delivers JSON-encoded messages using HTTPS POST.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The notification type.
     * </p>
     */
    private String subscriptionType;

    /**
     * <p>
     * The ID of the organization.
     * </p>
     * 
     * @param organizationId
     *        The ID of the organization.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The ID of the organization.
     * </p>
     * 
     * @return The ID of the organization.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The ID of the organization.
     * </p>
     * 
     * @param organizationId
     *        The ID of the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotificationSubscriptionRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The endpoint to receive the notifications. If the protocol is HTTPS, the endpoint is a URL that begins with
     * <code>https</code>.
     * </p>
     * 
     * @param endpoint
     *        The endpoint to receive the notifications. If the protocol is HTTPS, the endpoint is a URL that begins
     *        with <code>https</code>.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The endpoint to receive the notifications. If the protocol is HTTPS, the endpoint is a URL that begins with
     * <code>https</code>.
     * </p>
     * 
     * @return The endpoint to receive the notifications. If the protocol is HTTPS, the endpoint is a URL that begins
     *         with <code>https</code>.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The endpoint to receive the notifications. If the protocol is HTTPS, the endpoint is a URL that begins with
     * <code>https</code>.
     * </p>
     * 
     * @param endpoint
     *        The endpoint to receive the notifications. If the protocol is HTTPS, the endpoint is a URL that begins
     *        with <code>https</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotificationSubscriptionRequest withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * The protocol to use. The supported value is https, which delivers JSON-encoded messages using HTTPS POST.
     * </p>
     * 
     * @param protocol
     *        The protocol to use. The supported value is https, which delivers JSON-encoded messages using HTTPS POST.
     * @see SubscriptionProtocolType
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol to use. The supported value is https, which delivers JSON-encoded messages using HTTPS POST.
     * </p>
     * 
     * @return The protocol to use. The supported value is https, which delivers JSON-encoded messages using HTTPS POST.
     * @see SubscriptionProtocolType
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol to use. The supported value is https, which delivers JSON-encoded messages using HTTPS POST.
     * </p>
     * 
     * @param protocol
     *        The protocol to use. The supported value is https, which delivers JSON-encoded messages using HTTPS POST.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionProtocolType
     */

    public CreateNotificationSubscriptionRequest withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocol to use. The supported value is https, which delivers JSON-encoded messages using HTTPS POST.
     * </p>
     * 
     * @param protocol
     *        The protocol to use. The supported value is https, which delivers JSON-encoded messages using HTTPS POST.
     * @see SubscriptionProtocolType
     */

    public void setProtocol(SubscriptionProtocolType protocol) {
        withProtocol(protocol);
    }

    /**
     * <p>
     * The protocol to use. The supported value is https, which delivers JSON-encoded messages using HTTPS POST.
     * </p>
     * 
     * @param protocol
     *        The protocol to use. The supported value is https, which delivers JSON-encoded messages using HTTPS POST.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionProtocolType
     */

    public CreateNotificationSubscriptionRequest withProtocol(SubscriptionProtocolType protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * The notification type.
     * </p>
     * 
     * @param subscriptionType
     *        The notification type.
     * @see SubscriptionType
     */

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    /**
     * <p>
     * The notification type.
     * </p>
     * 
     * @return The notification type.
     * @see SubscriptionType
     */

    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    /**
     * <p>
     * The notification type.
     * </p>
     * 
     * @param subscriptionType
     *        The notification type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionType
     */

    public CreateNotificationSubscriptionRequest withSubscriptionType(String subscriptionType) {
        setSubscriptionType(subscriptionType);
        return this;
    }

    /**
     * <p>
     * The notification type.
     * </p>
     * 
     * @param subscriptionType
     *        The notification type.
     * @see SubscriptionType
     */

    public void setSubscriptionType(SubscriptionType subscriptionType) {
        withSubscriptionType(subscriptionType);
    }

    /**
     * <p>
     * The notification type.
     * </p>
     * 
     * @param subscriptionType
     *        The notification type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionType
     */

    public CreateNotificationSubscriptionRequest withSubscriptionType(SubscriptionType subscriptionType) {
        this.subscriptionType = subscriptionType.toString();
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
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getSubscriptionType() != null)
            sb.append("SubscriptionType: ").append(getSubscriptionType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateNotificationSubscriptionRequest == false)
            return false;
        CreateNotificationSubscriptionRequest other = (CreateNotificationSubscriptionRequest) obj;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getSubscriptionType() == null ^ this.getSubscriptionType() == null)
            return false;
        if (other.getSubscriptionType() != null && other.getSubscriptionType().equals(this.getSubscriptionType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionType() == null) ? 0 : getSubscriptionType().hashCode());
        return hashCode;
    }

    @Override
    public CreateNotificationSubscriptionRequest clone() {
        return (CreateNotificationSubscriptionRequest) super.clone();
    }

}
