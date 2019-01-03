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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetContact" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetContactResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The details of the requested contact.
     * </p>
     */
    private Contact contact;

    /**
     * <p>
     * The details of the requested contact.
     * </p>
     * 
     * @param contact
     *        The details of the requested contact.
     */

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    /**
     * <p>
     * The details of the requested contact.
     * </p>
     * 
     * @return The details of the requested contact.
     */

    public Contact getContact() {
        return this.contact;
    }

    /**
     * <p>
     * The details of the requested contact.
     * </p>
     * 
     * @param contact
     *        The details of the requested contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContactResult withContact(Contact contact) {
        setContact(contact);
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
        if (getContact() != null)
            sb.append("Contact: ").append(getContact());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetContactResult == false)
            return false;
        GetContactResult other = (GetContactResult) obj;
        if (other.getContact() == null ^ this.getContact() == null)
            return false;
        if (other.getContact() != null && other.getContact().equals(this.getContact()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContact() == null) ? 0 : getContact().hashCode());
        return hashCode;
    }

    @Override
    public GetContactResult clone() {
        try {
            return (GetContactResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
