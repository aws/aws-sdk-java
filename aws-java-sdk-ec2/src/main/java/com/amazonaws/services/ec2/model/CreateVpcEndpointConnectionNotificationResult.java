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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVpcEndpointConnectionNotificationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Information about the notification.
     * </p>
     */
    private ConnectionNotification connectionNotification;
    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * Information about the notification.
     * </p>
     * 
     * @param connectionNotification
     *        Information about the notification.
     */

    public void setConnectionNotification(ConnectionNotification connectionNotification) {
        this.connectionNotification = connectionNotification;
    }

    /**
     * <p>
     * Information about the notification.
     * </p>
     * 
     * @return Information about the notification.
     */

    public ConnectionNotification getConnectionNotification() {
        return this.connectionNotification;
    }

    /**
     * <p>
     * Information about the notification.
     * </p>
     * 
     * @param connectionNotification
     *        Information about the notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcEndpointConnectionNotificationResult withConnectionNotification(ConnectionNotification connectionNotification) {
        setConnectionNotification(connectionNotification);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return Unique, case-sensitive identifier you provide to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcEndpointConnectionNotificationResult withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getConnectionNotification() != null)
            sb.append("ConnectionNotification: ").append(getConnectionNotification()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVpcEndpointConnectionNotificationResult == false)
            return false;
        CreateVpcEndpointConnectionNotificationResult other = (CreateVpcEndpointConnectionNotificationResult) obj;
        if (other.getConnectionNotification() == null ^ this.getConnectionNotification() == null)
            return false;
        if (other.getConnectionNotification() != null && other.getConnectionNotification().equals(this.getConnectionNotification()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionNotification() == null) ? 0 : getConnectionNotification().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateVpcEndpointConnectionNotificationResult clone() {
        try {
            return (CreateVpcEndpointConnectionNotificationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
