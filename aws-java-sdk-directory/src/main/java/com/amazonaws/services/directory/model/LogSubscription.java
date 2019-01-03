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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a log subscription, which tracks real-time data from a chosen log group to a specified destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/LogSubscription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogSubscription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifier (ID) of the directory that you want to associate with the log subscription.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The name of the log group.
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * The date and time that the log subscription was created.
     * </p>
     */
    private java.util.Date subscriptionCreatedDateTime;

    /**
     * <p>
     * Identifier (ID) of the directory that you want to associate with the log subscription.
     * </p>
     * 
     * @param directoryId
     *        Identifier (ID) of the directory that you want to associate with the log subscription.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * Identifier (ID) of the directory that you want to associate with the log subscription.
     * </p>
     * 
     * @return Identifier (ID) of the directory that you want to associate with the log subscription.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * Identifier (ID) of the directory that you want to associate with the log subscription.
     * </p>
     * 
     * @param directoryId
     *        Identifier (ID) of the directory that you want to associate with the log subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogSubscription withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @return The name of the log group.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogSubscription withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * The date and time that the log subscription was created.
     * </p>
     * 
     * @param subscriptionCreatedDateTime
     *        The date and time that the log subscription was created.
     */

    public void setSubscriptionCreatedDateTime(java.util.Date subscriptionCreatedDateTime) {
        this.subscriptionCreatedDateTime = subscriptionCreatedDateTime;
    }

    /**
     * <p>
     * The date and time that the log subscription was created.
     * </p>
     * 
     * @return The date and time that the log subscription was created.
     */

    public java.util.Date getSubscriptionCreatedDateTime() {
        return this.subscriptionCreatedDateTime;
    }

    /**
     * <p>
     * The date and time that the log subscription was created.
     * </p>
     * 
     * @param subscriptionCreatedDateTime
     *        The date and time that the log subscription was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogSubscription withSubscriptionCreatedDateTime(java.util.Date subscriptionCreatedDateTime) {
        setSubscriptionCreatedDateTime(subscriptionCreatedDateTime);
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getLogGroupName() != null)
            sb.append("LogGroupName: ").append(getLogGroupName()).append(",");
        if (getSubscriptionCreatedDateTime() != null)
            sb.append("SubscriptionCreatedDateTime: ").append(getSubscriptionCreatedDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogSubscription == false)
            return false;
        LogSubscription other = (LogSubscription) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getSubscriptionCreatedDateTime() == null ^ this.getSubscriptionCreatedDateTime() == null)
            return false;
        if (other.getSubscriptionCreatedDateTime() != null && other.getSubscriptionCreatedDateTime().equals(this.getSubscriptionCreatedDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionCreatedDateTime() == null) ? 0 : getSubscriptionCreatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public LogSubscription clone() {
        try {
            return (LogSubscription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directory.model.transform.LogSubscriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
