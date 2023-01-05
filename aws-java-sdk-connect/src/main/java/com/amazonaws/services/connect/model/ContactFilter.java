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
 * Filters user data based on the contact information that is associated to the users. It contains a list of <a
 * href="https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html">contact states</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ContactFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContactFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of up to 9 <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html">contact states</a>.
     * </p>
     */
    private java.util.List<String> contactStates;

    /**
     * <p>
     * A list of up to 9 <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html">contact states</a>.
     * </p>
     * 
     * @return A list of up to 9 <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html">contact
     *         states</a>.
     * @see ContactState
     */

    public java.util.List<String> getContactStates() {
        return contactStates;
    }

    /**
     * <p>
     * A list of up to 9 <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html">contact states</a>.
     * </p>
     * 
     * @param contactStates
     *        A list of up to 9 <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html">contact states</a>.
     * @see ContactState
     */

    public void setContactStates(java.util.Collection<String> contactStates) {
        if (contactStates == null) {
            this.contactStates = null;
            return;
        }

        this.contactStates = new java.util.ArrayList<String>(contactStates);
    }

    /**
     * <p>
     * A list of up to 9 <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html">contact states</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContactStates(java.util.Collection)} or {@link #withContactStates(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param contactStates
     *        A list of up to 9 <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html">contact states</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactState
     */

    public ContactFilter withContactStates(String... contactStates) {
        if (this.contactStates == null) {
            setContactStates(new java.util.ArrayList<String>(contactStates.length));
        }
        for (String ele : contactStates) {
            this.contactStates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of up to 9 <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html">contact states</a>.
     * </p>
     * 
     * @param contactStates
     *        A list of up to 9 <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html">contact states</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactState
     */

    public ContactFilter withContactStates(java.util.Collection<String> contactStates) {
        setContactStates(contactStates);
        return this;
    }

    /**
     * <p>
     * A list of up to 9 <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html">contact states</a>.
     * </p>
     * 
     * @param contactStates
     *        A list of up to 9 <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/about-contact-states.html">contact states</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactState
     */

    public ContactFilter withContactStates(ContactState... contactStates) {
        java.util.ArrayList<String> contactStatesCopy = new java.util.ArrayList<String>(contactStates.length);
        for (ContactState value : contactStates) {
            contactStatesCopy.add(value.toString());
        }
        if (getContactStates() == null) {
            setContactStates(contactStatesCopy);
        } else {
            getContactStates().addAll(contactStatesCopy);
        }
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
        if (getContactStates() != null)
            sb.append("ContactStates: ").append(getContactStates());
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
        if (other.getContactStates() == null ^ this.getContactStates() == null)
            return false;
        if (other.getContactStates() != null && other.getContactStates().equals(this.getContactStates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContactStates() == null) ? 0 : getContactStates().hashCode());
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
        com.amazonaws.services.connect.model.transform.ContactFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
