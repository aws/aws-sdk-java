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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about the broker usernames for the specified broker. Doesn't apply to RabbitMQ brokers.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsAmazonMqBrokerUsersDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsAmazonMqBrokerUsersDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of change pending for the broker user.
     * </p>
     */
    private String pendingChange;
    /**
     * <p>
     * The username of the broker user.
     * </p>
     */
    private String username;

    /**
     * <p>
     * The type of change pending for the broker user.
     * </p>
     * 
     * @param pendingChange
     *        The type of change pending for the broker user.
     */

    public void setPendingChange(String pendingChange) {
        this.pendingChange = pendingChange;
    }

    /**
     * <p>
     * The type of change pending for the broker user.
     * </p>
     * 
     * @return The type of change pending for the broker user.
     */

    public String getPendingChange() {
        return this.pendingChange;
    }

    /**
     * <p>
     * The type of change pending for the broker user.
     * </p>
     * 
     * @param pendingChange
     *        The type of change pending for the broker user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerUsersDetails withPendingChange(String pendingChange) {
        setPendingChange(pendingChange);
        return this;
    }

    /**
     * <p>
     * The username of the broker user.
     * </p>
     * 
     * @param username
     *        The username of the broker user.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The username of the broker user.
     * </p>
     * 
     * @return The username of the broker user.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The username of the broker user.
     * </p>
     * 
     * @param username
     *        The username of the broker user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerUsersDetails withUsername(String username) {
        setUsername(username);
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
        if (getPendingChange() != null)
            sb.append("PendingChange: ").append(getPendingChange()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsAmazonMqBrokerUsersDetails == false)
            return false;
        AwsAmazonMqBrokerUsersDetails other = (AwsAmazonMqBrokerUsersDetails) obj;
        if (other.getPendingChange() == null ^ this.getPendingChange() == null)
            return false;
        if (other.getPendingChange() != null && other.getPendingChange().equals(this.getPendingChange()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPendingChange() == null) ? 0 : getPendingChange().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        return hashCode;
    }

    @Override
    public AwsAmazonMqBrokerUsersDetails clone() {
        try {
            return (AwsAmazonMqBrokerUsersDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsAmazonMqBrokerUsersDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
