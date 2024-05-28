/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateSubscriberNotification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSubscriberNotificationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The configuration for subscriber notification.
     * </p>
     */
    private NotificationConfiguration configuration;
    /**
     * <p>
     * The subscription ID for which the subscription notification is specified.
     * </p>
     */
    private String subscriberId;

    /**
     * <p>
     * The configuration for subscriber notification.
     * </p>
     * 
     * @param configuration
     *        The configuration for subscriber notification.
     */

    public void setConfiguration(NotificationConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The configuration for subscriber notification.
     * </p>
     * 
     * @return The configuration for subscriber notification.
     */

    public NotificationConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The configuration for subscriber notification.
     * </p>
     * 
     * @param configuration
     *        The configuration for subscriber notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriberNotificationRequest withConfiguration(NotificationConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * The subscription ID for which the subscription notification is specified.
     * </p>
     * 
     * @param subscriberId
     *        The subscription ID for which the subscription notification is specified.
     */

    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    /**
     * <p>
     * The subscription ID for which the subscription notification is specified.
     * </p>
     * 
     * @return The subscription ID for which the subscription notification is specified.
     */

    public String getSubscriberId() {
        return this.subscriberId;
    }

    /**
     * <p>
     * The subscription ID for which the subscription notification is specified.
     * </p>
     * 
     * @param subscriberId
     *        The subscription ID for which the subscription notification is specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriberNotificationRequest withSubscriberId(String subscriberId) {
        setSubscriberId(subscriberId);
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
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getSubscriberId() != null)
            sb.append("SubscriberId: ").append(getSubscriberId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSubscriberNotificationRequest == false)
            return false;
        UpdateSubscriberNotificationRequest other = (UpdateSubscriberNotificationRequest) obj;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getSubscriberId() == null ^ this.getSubscriberId() == null)
            return false;
        if (other.getSubscriberId() != null && other.getSubscriberId().equals(this.getSubscriberId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSubscriberId() == null) ? 0 : getSubscriberId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSubscriberNotificationRequest clone() {
        return (UpdateSubscriberNotificationRequest) super.clone();
    }

}
