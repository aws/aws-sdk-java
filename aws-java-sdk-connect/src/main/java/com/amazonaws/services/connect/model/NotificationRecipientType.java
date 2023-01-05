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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The type of notification recipient.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/NotificationRecipientType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotificationRecipientType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }. Amazon Connect users with the specified tags will be notified.
     * </p>
     */
    private java.util.Map<String, String> userTags;
    /**
     * <p>
     * A list of user IDs.
     * </p>
     */
    private java.util.List<String> userIds;

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }. Amazon Connect users with the specified tags will be notified.
     * </p>
     * 
     * @return The tags used to organize, track, or control access for this resource. For example, { "tags":
     *         {"key1":"value1", "key2":"value2"} }. Amazon Connect users with the specified tags will be notified.
     */

    public java.util.Map<String, String> getUserTags() {
        return userTags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }. Amazon Connect users with the specified tags will be notified.
     * </p>
     * 
     * @param userTags
     *        The tags used to organize, track, or control access for this resource. For example, { "tags":
     *        {"key1":"value1", "key2":"value2"} }. Amazon Connect users with the specified tags will be notified.
     */

    public void setUserTags(java.util.Map<String, String> userTags) {
        this.userTags = userTags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }. Amazon Connect users with the specified tags will be notified.
     * </p>
     * 
     * @param userTags
     *        The tags used to organize, track, or control access for this resource. For example, { "tags":
     *        {"key1":"value1", "key2":"value2"} }. Amazon Connect users with the specified tags will be notified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationRecipientType withUserTags(java.util.Map<String, String> userTags) {
        setUserTags(userTags);
        return this;
    }

    /**
     * Add a single UserTags entry
     *
     * @see NotificationRecipientType#withUserTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public NotificationRecipientType addUserTagsEntry(String key, String value) {
        if (null == this.userTags) {
            this.userTags = new java.util.HashMap<String, String>();
        }
        if (this.userTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.userTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into UserTags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationRecipientType clearUserTagsEntries() {
        this.userTags = null;
        return this;
    }

    /**
     * <p>
     * A list of user IDs.
     * </p>
     * 
     * @return A list of user IDs.
     */

    public java.util.List<String> getUserIds() {
        return userIds;
    }

    /**
     * <p>
     * A list of user IDs.
     * </p>
     * 
     * @param userIds
     *        A list of user IDs.
     */

    public void setUserIds(java.util.Collection<String> userIds) {
        if (userIds == null) {
            this.userIds = null;
            return;
        }

        this.userIds = new java.util.ArrayList<String>(userIds);
    }

    /**
     * <p>
     * A list of user IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserIds(java.util.Collection)} or {@link #withUserIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param userIds
     *        A list of user IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationRecipientType withUserIds(String... userIds) {
        if (this.userIds == null) {
            setUserIds(new java.util.ArrayList<String>(userIds.length));
        }
        for (String ele : userIds) {
            this.userIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of user IDs.
     * </p>
     * 
     * @param userIds
     *        A list of user IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationRecipientType withUserIds(java.util.Collection<String> userIds) {
        setUserIds(userIds);
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
        if (getUserTags() != null)
            sb.append("UserTags: ").append(getUserTags()).append(",");
        if (getUserIds() != null)
            sb.append("UserIds: ").append(getUserIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotificationRecipientType == false)
            return false;
        NotificationRecipientType other = (NotificationRecipientType) obj;
        if (other.getUserTags() == null ^ this.getUserTags() == null)
            return false;
        if (other.getUserTags() != null && other.getUserTags().equals(this.getUserTags()) == false)
            return false;
        if (other.getUserIds() == null ^ this.getUserIds() == null)
            return false;
        if (other.getUserIds() != null && other.getUserIds().equals(this.getUserIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserTags() == null) ? 0 : getUserTags().hashCode());
        hashCode = prime * hashCode + ((getUserIds() == null) ? 0 : getUserIds().hashCode());
        return hashCode;
    }

    @Override
    public NotificationRecipientType clone() {
        try {
            return (NotificationRecipientType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.NotificationRecipientTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
