/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains details about the action of a contact list.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ContactListDestination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContactListDestination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the contact list.
     * </p>
     */
    private String contactListName;
    /**
     * <p>
     * &gt;The type of action that you want to perform on the addresses. Acceptable values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PUT: add the addresses to the contact list. If the record already exists, it will override it with the new value.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE: remove the addresses from the contact list.
     * </p>
     * </li>
     * </ul>
     */
    private String contactListImportAction;

    /**
     * <p>
     * The name of the contact list.
     * </p>
     * 
     * @param contactListName
     *        The name of the contact list.
     */

    public void setContactListName(String contactListName) {
        this.contactListName = contactListName;
    }

    /**
     * <p>
     * The name of the contact list.
     * </p>
     * 
     * @return The name of the contact list.
     */

    public String getContactListName() {
        return this.contactListName;
    }

    /**
     * <p>
     * The name of the contact list.
     * </p>
     * 
     * @param contactListName
     *        The name of the contact list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactListDestination withContactListName(String contactListName) {
        setContactListName(contactListName);
        return this;
    }

    /**
     * <p>
     * &gt;The type of action that you want to perform on the addresses. Acceptable values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PUT: add the addresses to the contact list. If the record already exists, it will override it with the new value.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE: remove the addresses from the contact list.
     * </p>
     * </li>
     * </ul>
     * 
     * @param contactListImportAction
     *        &gt;The type of action that you want to perform on the addresses. Acceptable values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PUT: add the addresses to the contact list. If the record already exists, it will override it with the new
     *        value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE: remove the addresses from the contact list.
     *        </p>
     *        </li>
     * @see ContactListImportAction
     */

    public void setContactListImportAction(String contactListImportAction) {
        this.contactListImportAction = contactListImportAction;
    }

    /**
     * <p>
     * &gt;The type of action that you want to perform on the addresses. Acceptable values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PUT: add the addresses to the contact list. If the record already exists, it will override it with the new value.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE: remove the addresses from the contact list.
     * </p>
     * </li>
     * </ul>
     * 
     * @return &gt;The type of action that you want to perform on the addresses. Acceptable values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         PUT: add the addresses to the contact list. If the record already exists, it will override it with the
     *         new value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELETE: remove the addresses from the contact list.
     *         </p>
     *         </li>
     * @see ContactListImportAction
     */

    public String getContactListImportAction() {
        return this.contactListImportAction;
    }

    /**
     * <p>
     * &gt;The type of action that you want to perform on the addresses. Acceptable values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PUT: add the addresses to the contact list. If the record already exists, it will override it with the new value.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE: remove the addresses from the contact list.
     * </p>
     * </li>
     * </ul>
     * 
     * @param contactListImportAction
     *        &gt;The type of action that you want to perform on the addresses. Acceptable values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PUT: add the addresses to the contact list. If the record already exists, it will override it with the new
     *        value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE: remove the addresses from the contact list.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactListImportAction
     */

    public ContactListDestination withContactListImportAction(String contactListImportAction) {
        setContactListImportAction(contactListImportAction);
        return this;
    }

    /**
     * <p>
     * &gt;The type of action that you want to perform on the addresses. Acceptable values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PUT: add the addresses to the contact list. If the record already exists, it will override it with the new value.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE: remove the addresses from the contact list.
     * </p>
     * </li>
     * </ul>
     * 
     * @param contactListImportAction
     *        &gt;The type of action that you want to perform on the addresses. Acceptable values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PUT: add the addresses to the contact list. If the record already exists, it will override it with the new
     *        value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE: remove the addresses from the contact list.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactListImportAction
     */

    public ContactListDestination withContactListImportAction(ContactListImportAction contactListImportAction) {
        this.contactListImportAction = contactListImportAction.toString();
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
        if (getContactListName() != null)
            sb.append("ContactListName: ").append(getContactListName()).append(",");
        if (getContactListImportAction() != null)
            sb.append("ContactListImportAction: ").append(getContactListImportAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContactListDestination == false)
            return false;
        ContactListDestination other = (ContactListDestination) obj;
        if (other.getContactListName() == null ^ this.getContactListName() == null)
            return false;
        if (other.getContactListName() != null && other.getContactListName().equals(this.getContactListName()) == false)
            return false;
        if (other.getContactListImportAction() == null ^ this.getContactListImportAction() == null)
            return false;
        if (other.getContactListImportAction() != null && other.getContactListImportAction().equals(this.getContactListImportAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContactListName() == null) ? 0 : getContactListName().hashCode());
        hashCode = prime * hashCode + ((getContactListImportAction() == null) ? 0 : getContactListImportAction().hashCode());
        return hashCode;
    }

    @Override
    public ContactListDestination clone() {
        try {
            return (ContactListDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.ContactListDestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
