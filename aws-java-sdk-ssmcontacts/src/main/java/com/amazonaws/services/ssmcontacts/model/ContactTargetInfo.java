/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmcontacts.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The contact that Incident Manager is engaging during an incident.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/ContactTargetInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContactTargetInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact.
     * </p>
     */
    private String contactId;
    /**
     * <p>
     * A Boolean value determining if the contact's acknowledgement stops the progress of stages in the plan.
     * </p>
     */
    private Boolean isEssential;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact.
     * </p>
     * 
     * @param contactId
     *        The Amazon Resource Name (ARN) of the contact.
     */

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the contact.
     */

    public String getContactId() {
        return this.contactId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact.
     * </p>
     * 
     * @param contactId
     *        The Amazon Resource Name (ARN) of the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactTargetInfo withContactId(String contactId) {
        setContactId(contactId);
        return this;
    }

    /**
     * <p>
     * A Boolean value determining if the contact's acknowledgement stops the progress of stages in the plan.
     * </p>
     * 
     * @param isEssential
     *        A Boolean value determining if the contact's acknowledgement stops the progress of stages in the plan.
     */

    public void setIsEssential(Boolean isEssential) {
        this.isEssential = isEssential;
    }

    /**
     * <p>
     * A Boolean value determining if the contact's acknowledgement stops the progress of stages in the plan.
     * </p>
     * 
     * @return A Boolean value determining if the contact's acknowledgement stops the progress of stages in the plan.
     */

    public Boolean getIsEssential() {
        return this.isEssential;
    }

    /**
     * <p>
     * A Boolean value determining if the contact's acknowledgement stops the progress of stages in the plan.
     * </p>
     * 
     * @param isEssential
     *        A Boolean value determining if the contact's acknowledgement stops the progress of stages in the plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactTargetInfo withIsEssential(Boolean isEssential) {
        setIsEssential(isEssential);
        return this;
    }

    /**
     * <p>
     * A Boolean value determining if the contact's acknowledgement stops the progress of stages in the plan.
     * </p>
     * 
     * @return A Boolean value determining if the contact's acknowledgement stops the progress of stages in the plan.
     */

    public Boolean isEssential() {
        return this.isEssential;
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
        if (getContactId() != null)
            sb.append("ContactId: ").append(getContactId()).append(",");
        if (getIsEssential() != null)
            sb.append("IsEssential: ").append(getIsEssential());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContactTargetInfo == false)
            return false;
        ContactTargetInfo other = (ContactTargetInfo) obj;
        if (other.getContactId() == null ^ this.getContactId() == null)
            return false;
        if (other.getContactId() != null && other.getContactId().equals(this.getContactId()) == false)
            return false;
        if (other.getIsEssential() == null ^ this.getIsEssential() == null)
            return false;
        if (other.getIsEssential() != null && other.getIsEssential().equals(this.getIsEssential()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContactId() == null) ? 0 : getContactId().hashCode());
        hashCode = prime * hashCode + ((getIsEssential() == null) ? 0 : getIsEssential().hashCode());
        return hashCode;
    }

    @Override
    public ContactTargetInfo clone() {
        try {
            return (ContactTargetInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmcontacts.model.transform.ContactTargetInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
