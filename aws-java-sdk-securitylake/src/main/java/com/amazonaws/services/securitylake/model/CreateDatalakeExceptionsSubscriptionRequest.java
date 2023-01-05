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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateDatalakeExceptionsSubscription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDatalakeExceptionsSubscriptionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services account where you want to receive exception notifications.
     * </p>
     */
    private String notificationEndpoint;
    /**
     * <p>
     * The subscription protocol to which exception notifications are posted.
     * </p>
     */
    private String subscriptionProtocol;

    /**
     * <p>
     * The Amazon Web Services account where you want to receive exception notifications.
     * </p>
     * 
     * @param notificationEndpoint
     *        The Amazon Web Services account where you want to receive exception notifications.
     */

    public void setNotificationEndpoint(String notificationEndpoint) {
        this.notificationEndpoint = notificationEndpoint;
    }

    /**
     * <p>
     * The Amazon Web Services account where you want to receive exception notifications.
     * </p>
     * 
     * @return The Amazon Web Services account where you want to receive exception notifications.
     */

    public String getNotificationEndpoint() {
        return this.notificationEndpoint;
    }

    /**
     * <p>
     * The Amazon Web Services account where you want to receive exception notifications.
     * </p>
     * 
     * @param notificationEndpoint
     *        The Amazon Web Services account where you want to receive exception notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatalakeExceptionsSubscriptionRequest withNotificationEndpoint(String notificationEndpoint) {
        setNotificationEndpoint(notificationEndpoint);
        return this;
    }

    /**
     * <p>
     * The subscription protocol to which exception notifications are posted.
     * </p>
     * 
     * @param subscriptionProtocol
     *        The subscription protocol to which exception notifications are posted.
     * @see SubscriptionProtocolType
     */

    public void setSubscriptionProtocol(String subscriptionProtocol) {
        this.subscriptionProtocol = subscriptionProtocol;
    }

    /**
     * <p>
     * The subscription protocol to which exception notifications are posted.
     * </p>
     * 
     * @return The subscription protocol to which exception notifications are posted.
     * @see SubscriptionProtocolType
     */

    public String getSubscriptionProtocol() {
        return this.subscriptionProtocol;
    }

    /**
     * <p>
     * The subscription protocol to which exception notifications are posted.
     * </p>
     * 
     * @param subscriptionProtocol
     *        The subscription protocol to which exception notifications are posted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionProtocolType
     */

    public CreateDatalakeExceptionsSubscriptionRequest withSubscriptionProtocol(String subscriptionProtocol) {
        setSubscriptionProtocol(subscriptionProtocol);
        return this;
    }

    /**
     * <p>
     * The subscription protocol to which exception notifications are posted.
     * </p>
     * 
     * @param subscriptionProtocol
     *        The subscription protocol to which exception notifications are posted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionProtocolType
     */

    public CreateDatalakeExceptionsSubscriptionRequest withSubscriptionProtocol(SubscriptionProtocolType subscriptionProtocol) {
        this.subscriptionProtocol = subscriptionProtocol.toString();
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
        if (getNotificationEndpoint() != null)
            sb.append("NotificationEndpoint: ").append(getNotificationEndpoint()).append(",");
        if (getSubscriptionProtocol() != null)
            sb.append("SubscriptionProtocol: ").append(getSubscriptionProtocol());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDatalakeExceptionsSubscriptionRequest == false)
            return false;
        CreateDatalakeExceptionsSubscriptionRequest other = (CreateDatalakeExceptionsSubscriptionRequest) obj;
        if (other.getNotificationEndpoint() == null ^ this.getNotificationEndpoint() == null)
            return false;
        if (other.getNotificationEndpoint() != null && other.getNotificationEndpoint().equals(this.getNotificationEndpoint()) == false)
            return false;
        if (other.getSubscriptionProtocol() == null ^ this.getSubscriptionProtocol() == null)
            return false;
        if (other.getSubscriptionProtocol() != null && other.getSubscriptionProtocol().equals(this.getSubscriptionProtocol()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNotificationEndpoint() == null) ? 0 : getNotificationEndpoint().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionProtocol() == null) ? 0 : getSubscriptionProtocol().hashCode());
        return hashCode;
    }

    @Override
    public CreateDatalakeExceptionsSubscriptionRequest clone() {
        return (CreateDatalakeExceptionsSubscriptionRequest) super.clone();
    }

}
