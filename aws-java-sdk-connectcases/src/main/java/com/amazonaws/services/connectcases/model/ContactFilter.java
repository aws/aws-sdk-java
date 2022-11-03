/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A filter for related items of type <code>Contact</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/ContactFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContactFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of channels to filter on for related items of type <code>Contact</code>.
     * </p>
     */
    private java.util.List<String> channel;
    /**
     * <p>
     * A unique identifier of a contact in Amazon Connect.
     * </p>
     */
    private String contactArn;

    /**
     * <p>
     * A list of channels to filter on for related items of type <code>Contact</code>.
     * </p>
     * 
     * @return A list of channels to filter on for related items of type <code>Contact</code>.
     */

    public java.util.List<String> getChannel() {
        return channel;
    }

    /**
     * <p>
     * A list of channels to filter on for related items of type <code>Contact</code>.
     * </p>
     * 
     * @param channel
     *        A list of channels to filter on for related items of type <code>Contact</code>.
     */

    public void setChannel(java.util.Collection<String> channel) {
        if (channel == null) {
            this.channel = null;
            return;
        }

        this.channel = new java.util.ArrayList<String>(channel);
    }

    /**
     * <p>
     * A list of channels to filter on for related items of type <code>Contact</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChannel(java.util.Collection)} or {@link #withChannel(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param channel
     *        A list of channels to filter on for related items of type <code>Contact</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactFilter withChannel(String... channel) {
        if (this.channel == null) {
            setChannel(new java.util.ArrayList<String>(channel.length));
        }
        for (String ele : channel) {
            this.channel.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of channels to filter on for related items of type <code>Contact</code>.
     * </p>
     * 
     * @param channel
     *        A list of channels to filter on for related items of type <code>Contact</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactFilter withChannel(java.util.Collection<String> channel) {
        setChannel(channel);
        return this;
    }

    /**
     * <p>
     * A unique identifier of a contact in Amazon Connect.
     * </p>
     * 
     * @param contactArn
     *        A unique identifier of a contact in Amazon Connect.
     */

    public void setContactArn(String contactArn) {
        this.contactArn = contactArn;
    }

    /**
     * <p>
     * A unique identifier of a contact in Amazon Connect.
     * </p>
     * 
     * @return A unique identifier of a contact in Amazon Connect.
     */

    public String getContactArn() {
        return this.contactArn;
    }

    /**
     * <p>
     * A unique identifier of a contact in Amazon Connect.
     * </p>
     * 
     * @param contactArn
     *        A unique identifier of a contact in Amazon Connect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactFilter withContactArn(String contactArn) {
        setContactArn(contactArn);
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
        if (getChannel() != null)
            sb.append("Channel: ").append(getChannel()).append(",");
        if (getContactArn() != null)
            sb.append("ContactArn: ").append(getContactArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContactFilter == false)
            return false;
        ContactFilter other = (ContactFilter) obj;
        if (other.getChannel() == null ^ this.getChannel() == null)
            return false;
        if (other.getChannel() != null && other.getChannel().equals(this.getChannel()) == false)
            return false;
        if (other.getContactArn() == null ^ this.getContactArn() == null)
            return false;
        if (other.getContactArn() != null && other.getContactArn().equals(this.getContactArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannel() == null) ? 0 : getChannel().hashCode());
        hashCode = prime * hashCode + ((getContactArn() == null) ? 0 : getContactArn().hashCode());
        return hashCode;
    }

    @Override
    public ContactFilter clone() {
        try {
            return (ContactFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcases.model.transform.ContactFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
