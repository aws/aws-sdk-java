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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The entitlements that you want to grant on a flow.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/GrantEntitlementRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GrantEntitlementRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * A description of the entitlement. This description appears only on the AWS Elemental MediaConnect console and
     * will not be seen by the subscriber or end user.
     */
    private String description;
    /** The type of encryption that will be used on the output that is associated with this entitlement. */
    private Encryption encryption;
    /** The name of the entitlement. This value must be unique within the current flow. */
    private String name;
    /**
     * The AWS account IDs that you want to share your content with. The receiving accounts (subscribers) will be
     * allowed to create their own flows using your content as the source.
     */
    private java.util.List<String> subscribers;

    /**
     * A description of the entitlement. This description appears only on the AWS Elemental MediaConnect console and
     * will not be seen by the subscriber or end user.
     * 
     * @param description
     *        A description of the entitlement. This description appears only on the AWS Elemental MediaConnect console
     *        and will not be seen by the subscriber or end user.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * A description of the entitlement. This description appears only on the AWS Elemental MediaConnect console and
     * will not be seen by the subscriber or end user.
     * 
     * @return A description of the entitlement. This description appears only on the AWS Elemental MediaConnect console
     *         and will not be seen by the subscriber or end user.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * A description of the entitlement. This description appears only on the AWS Elemental MediaConnect console and
     * will not be seen by the subscriber or end user.
     * 
     * @param description
     *        A description of the entitlement. This description appears only on the AWS Elemental MediaConnect console
     *        and will not be seen by the subscriber or end user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantEntitlementRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * The type of encryption that will be used on the output that is associated with this entitlement.
     * 
     * @param encryption
     *        The type of encryption that will be used on the output that is associated with this entitlement.
     */

    public void setEncryption(Encryption encryption) {
        this.encryption = encryption;
    }

    /**
     * The type of encryption that will be used on the output that is associated with this entitlement.
     * 
     * @return The type of encryption that will be used on the output that is associated with this entitlement.
     */

    public Encryption getEncryption() {
        return this.encryption;
    }

    /**
     * The type of encryption that will be used on the output that is associated with this entitlement.
     * 
     * @param encryption
     *        The type of encryption that will be used on the output that is associated with this entitlement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantEntitlementRequest withEncryption(Encryption encryption) {
        setEncryption(encryption);
        return this;
    }

    /**
     * The name of the entitlement. This value must be unique within the current flow.
     * 
     * @param name
     *        The name of the entitlement. This value must be unique within the current flow.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the entitlement. This value must be unique within the current flow.
     * 
     * @return The name of the entitlement. This value must be unique within the current flow.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of the entitlement. This value must be unique within the current flow.
     * 
     * @param name
     *        The name of the entitlement. This value must be unique within the current flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantEntitlementRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * The AWS account IDs that you want to share your content with. The receiving accounts (subscribers) will be
     * allowed to create their own flows using your content as the source.
     * 
     * @return The AWS account IDs that you want to share your content with. The receiving accounts (subscribers) will
     *         be allowed to create their own flows using your content as the source.
     */

    public java.util.List<String> getSubscribers() {
        return subscribers;
    }

    /**
     * The AWS account IDs that you want to share your content with. The receiving accounts (subscribers) will be
     * allowed to create their own flows using your content as the source.
     * 
     * @param subscribers
     *        The AWS account IDs that you want to share your content with. The receiving accounts (subscribers) will be
     *        allowed to create their own flows using your content as the source.
     */

    public void setSubscribers(java.util.Collection<String> subscribers) {
        if (subscribers == null) {
            this.subscribers = null;
            return;
        }

        this.subscribers = new java.util.ArrayList<String>(subscribers);
    }

    /**
     * The AWS account IDs that you want to share your content with. The receiving accounts (subscribers) will be
     * allowed to create their own flows using your content as the source.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubscribers(java.util.Collection)} or {@link #withSubscribers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subscribers
     *        The AWS account IDs that you want to share your content with. The receiving accounts (subscribers) will be
     *        allowed to create their own flows using your content as the source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantEntitlementRequest withSubscribers(String... subscribers) {
        if (this.subscribers == null) {
            setSubscribers(new java.util.ArrayList<String>(subscribers.length));
        }
        for (String ele : subscribers) {
            this.subscribers.add(ele);
        }
        return this;
    }

    /**
     * The AWS account IDs that you want to share your content with. The receiving accounts (subscribers) will be
     * allowed to create their own flows using your content as the source.
     * 
     * @param subscribers
     *        The AWS account IDs that you want to share your content with. The receiving accounts (subscribers) will be
     *        allowed to create their own flows using your content as the source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantEntitlementRequest withSubscribers(java.util.Collection<String> subscribers) {
        setSubscribers(subscribers);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEncryption() != null)
            sb.append("Encryption: ").append(getEncryption()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSubscribers() != null)
            sb.append("Subscribers: ").append(getSubscribers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GrantEntitlementRequest == false)
            return false;
        GrantEntitlementRequest other = (GrantEntitlementRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEncryption() == null ^ this.getEncryption() == null)
            return false;
        if (other.getEncryption() != null && other.getEncryption().equals(this.getEncryption()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSubscribers() == null ^ this.getSubscribers() == null)
            return false;
        if (other.getSubscribers() != null && other.getSubscribers().equals(this.getSubscribers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSubscribers() == null) ? 0 : getSubscribers().hashCode());
        return hashCode;
    }

    @Override
    public GrantEntitlementRequest clone() {
        try {
            return (GrantEntitlementRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.GrantEntitlementRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
