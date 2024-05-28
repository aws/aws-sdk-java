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
package com.amazonaws.services.resourcegroups.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Resource Groups settings for this Amazon Web Services account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/AccountSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The desired target status of the group lifecycle events feature. If
     * </p>
     */
    private String groupLifecycleEventsDesiredStatus;
    /**
     * <p>
     * The current status of the group lifecycle events feature.
     * </p>
     */
    private String groupLifecycleEventsStatus;
    /**
     * <p>
     * The text of any error message occurs during an attempt to turn group lifecycle events on or off.
     * </p>
     */
    private String groupLifecycleEventsStatusMessage;

    /**
     * <p>
     * The desired target status of the group lifecycle events feature. If
     * </p>
     * 
     * @param groupLifecycleEventsDesiredStatus
     *        The desired target status of the group lifecycle events feature. If
     * @see GroupLifecycleEventsDesiredStatus
     */

    public void setGroupLifecycleEventsDesiredStatus(String groupLifecycleEventsDesiredStatus) {
        this.groupLifecycleEventsDesiredStatus = groupLifecycleEventsDesiredStatus;
    }

    /**
     * <p>
     * The desired target status of the group lifecycle events feature. If
     * </p>
     * 
     * @return The desired target status of the group lifecycle events feature. If
     * @see GroupLifecycleEventsDesiredStatus
     */

    public String getGroupLifecycleEventsDesiredStatus() {
        return this.groupLifecycleEventsDesiredStatus;
    }

    /**
     * <p>
     * The desired target status of the group lifecycle events feature. If
     * </p>
     * 
     * @param groupLifecycleEventsDesiredStatus
     *        The desired target status of the group lifecycle events feature. If
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GroupLifecycleEventsDesiredStatus
     */

    public AccountSettings withGroupLifecycleEventsDesiredStatus(String groupLifecycleEventsDesiredStatus) {
        setGroupLifecycleEventsDesiredStatus(groupLifecycleEventsDesiredStatus);
        return this;
    }

    /**
     * <p>
     * The desired target status of the group lifecycle events feature. If
     * </p>
     * 
     * @param groupLifecycleEventsDesiredStatus
     *        The desired target status of the group lifecycle events feature. If
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GroupLifecycleEventsDesiredStatus
     */

    public AccountSettings withGroupLifecycleEventsDesiredStatus(GroupLifecycleEventsDesiredStatus groupLifecycleEventsDesiredStatus) {
        this.groupLifecycleEventsDesiredStatus = groupLifecycleEventsDesiredStatus.toString();
        return this;
    }

    /**
     * <p>
     * The current status of the group lifecycle events feature.
     * </p>
     * 
     * @param groupLifecycleEventsStatus
     *        The current status of the group lifecycle events feature.
     * @see GroupLifecycleEventsStatus
     */

    public void setGroupLifecycleEventsStatus(String groupLifecycleEventsStatus) {
        this.groupLifecycleEventsStatus = groupLifecycleEventsStatus;
    }

    /**
     * <p>
     * The current status of the group lifecycle events feature.
     * </p>
     * 
     * @return The current status of the group lifecycle events feature.
     * @see GroupLifecycleEventsStatus
     */

    public String getGroupLifecycleEventsStatus() {
        return this.groupLifecycleEventsStatus;
    }

    /**
     * <p>
     * The current status of the group lifecycle events feature.
     * </p>
     * 
     * @param groupLifecycleEventsStatus
     *        The current status of the group lifecycle events feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GroupLifecycleEventsStatus
     */

    public AccountSettings withGroupLifecycleEventsStatus(String groupLifecycleEventsStatus) {
        setGroupLifecycleEventsStatus(groupLifecycleEventsStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the group lifecycle events feature.
     * </p>
     * 
     * @param groupLifecycleEventsStatus
     *        The current status of the group lifecycle events feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GroupLifecycleEventsStatus
     */

    public AccountSettings withGroupLifecycleEventsStatus(GroupLifecycleEventsStatus groupLifecycleEventsStatus) {
        this.groupLifecycleEventsStatus = groupLifecycleEventsStatus.toString();
        return this;
    }

    /**
     * <p>
     * The text of any error message occurs during an attempt to turn group lifecycle events on or off.
     * </p>
     * 
     * @param groupLifecycleEventsStatusMessage
     *        The text of any error message occurs during an attempt to turn group lifecycle events on or off.
     */

    public void setGroupLifecycleEventsStatusMessage(String groupLifecycleEventsStatusMessage) {
        this.groupLifecycleEventsStatusMessage = groupLifecycleEventsStatusMessage;
    }

    /**
     * <p>
     * The text of any error message occurs during an attempt to turn group lifecycle events on or off.
     * </p>
     * 
     * @return The text of any error message occurs during an attempt to turn group lifecycle events on or off.
     */

    public String getGroupLifecycleEventsStatusMessage() {
        return this.groupLifecycleEventsStatusMessage;
    }

    /**
     * <p>
     * The text of any error message occurs during an attempt to turn group lifecycle events on or off.
     * </p>
     * 
     * @param groupLifecycleEventsStatusMessage
     *        The text of any error message occurs during an attempt to turn group lifecycle events on or off.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountSettings withGroupLifecycleEventsStatusMessage(String groupLifecycleEventsStatusMessage) {
        setGroupLifecycleEventsStatusMessage(groupLifecycleEventsStatusMessage);
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
        if (getGroupLifecycleEventsDesiredStatus() != null)
            sb.append("GroupLifecycleEventsDesiredStatus: ").append(getGroupLifecycleEventsDesiredStatus()).append(",");
        if (getGroupLifecycleEventsStatus() != null)
            sb.append("GroupLifecycleEventsStatus: ").append(getGroupLifecycleEventsStatus()).append(",");
        if (getGroupLifecycleEventsStatusMessage() != null)
            sb.append("GroupLifecycleEventsStatusMessage: ").append(getGroupLifecycleEventsStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountSettings == false)
            return false;
        AccountSettings other = (AccountSettings) obj;
        if (other.getGroupLifecycleEventsDesiredStatus() == null ^ this.getGroupLifecycleEventsDesiredStatus() == null)
            return false;
        if (other.getGroupLifecycleEventsDesiredStatus() != null
                && other.getGroupLifecycleEventsDesiredStatus().equals(this.getGroupLifecycleEventsDesiredStatus()) == false)
            return false;
        if (other.getGroupLifecycleEventsStatus() == null ^ this.getGroupLifecycleEventsStatus() == null)
            return false;
        if (other.getGroupLifecycleEventsStatus() != null && other.getGroupLifecycleEventsStatus().equals(this.getGroupLifecycleEventsStatus()) == false)
            return false;
        if (other.getGroupLifecycleEventsStatusMessage() == null ^ this.getGroupLifecycleEventsStatusMessage() == null)
            return false;
        if (other.getGroupLifecycleEventsStatusMessage() != null
                && other.getGroupLifecycleEventsStatusMessage().equals(this.getGroupLifecycleEventsStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupLifecycleEventsDesiredStatus() == null) ? 0 : getGroupLifecycleEventsDesiredStatus().hashCode());
        hashCode = prime * hashCode + ((getGroupLifecycleEventsStatus() == null) ? 0 : getGroupLifecycleEventsStatus().hashCode());
        hashCode = prime * hashCode + ((getGroupLifecycleEventsStatusMessage() == null) ? 0 : getGroupLifecycleEventsStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public AccountSettings clone() {
        try {
            return (AccountSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resourcegroups.model.transform.AccountSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
