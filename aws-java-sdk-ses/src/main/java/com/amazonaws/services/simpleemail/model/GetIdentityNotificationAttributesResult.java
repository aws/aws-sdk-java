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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the notification attributes for a list of identities.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/GetIdentityNotificationAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIdentityNotificationAttributesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A map of Identity to IdentityNotificationAttributes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, IdentityNotificationAttributes> notificationAttributes;

    /**
     * <p>
     * A map of Identity to IdentityNotificationAttributes.
     * </p>
     * 
     * @return A map of Identity to IdentityNotificationAttributes.
     */

    public java.util.Map<String, IdentityNotificationAttributes> getNotificationAttributes() {
        if (notificationAttributes == null) {
            notificationAttributes = new com.amazonaws.internal.SdkInternalMap<String, IdentityNotificationAttributes>();
        }
        return notificationAttributes;
    }

    /**
     * <p>
     * A map of Identity to IdentityNotificationAttributes.
     * </p>
     * 
     * @param notificationAttributes
     *        A map of Identity to IdentityNotificationAttributes.
     */

    public void setNotificationAttributes(java.util.Map<String, IdentityNotificationAttributes> notificationAttributes) {
        this.notificationAttributes = notificationAttributes == null ? null
                : new com.amazonaws.internal.SdkInternalMap<String, IdentityNotificationAttributes>(notificationAttributes);
    }

    /**
     * <p>
     * A map of Identity to IdentityNotificationAttributes.
     * </p>
     * 
     * @param notificationAttributes
     *        A map of Identity to IdentityNotificationAttributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIdentityNotificationAttributesResult withNotificationAttributes(java.util.Map<String, IdentityNotificationAttributes> notificationAttributes) {
        setNotificationAttributes(notificationAttributes);
        return this;
    }

    public GetIdentityNotificationAttributesResult addNotificationAttributesEntry(String key, IdentityNotificationAttributes value) {
        if (null == this.notificationAttributes) {
            this.notificationAttributes = new com.amazonaws.internal.SdkInternalMap<String, IdentityNotificationAttributes>();
        }
        if (this.notificationAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.notificationAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into NotificationAttributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIdentityNotificationAttributesResult clearNotificationAttributesEntries() {
        this.notificationAttributes = null;
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
        if (getNotificationAttributes() != null)
            sb.append("NotificationAttributes: ").append(getNotificationAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIdentityNotificationAttributesResult == false)
            return false;
        GetIdentityNotificationAttributesResult other = (GetIdentityNotificationAttributesResult) obj;
        if (other.getNotificationAttributes() == null ^ this.getNotificationAttributes() == null)
            return false;
        if (other.getNotificationAttributes() != null && other.getNotificationAttributes().equals(this.getNotificationAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNotificationAttributes() == null) ? 0 : getNotificationAttributes().hashCode());
        return hashCode;
    }

    @Override
    public GetIdentityNotificationAttributesResult clone() {
        try {
            return (GetIdentityNotificationAttributesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
