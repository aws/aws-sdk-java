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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A phone number used for Amazon Chime Business Calling or an Amazon Chime Voice Connector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PhoneNumber" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PhoneNumber implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The phone number ID.
     * </p>
     */
    private String phoneNumberId;
    /**
     * <p>
     * The phone number, in E.164 format.
     * </p>
     */
    private String e164PhoneNumber;
    /**
     * <p>
     * The phone number product type.
     * </p>
     */
    private String productType;
    /**
     * <p>
     * The phone number status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The phone number capabilities.
     * </p>
     */
    private PhoneNumberCapabilities capabilities;
    /**
     * <p>
     * The phone number associations.
     * </p>
     */
    private java.util.List<PhoneNumberAssociation> associations;
    /**
     * <p>
     * The phone number creation timestamp, in ISO 8601 format.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The updated phone number timestamp, in ISO 8601 format.
     * </p>
     */
    private java.util.Date updatedTimestamp;
    /**
     * <p>
     * The deleted phone number timestamp, in ISO 8601 format.
     * </p>
     */
    private java.util.Date deletionTimestamp;

    /**
     * <p>
     * The phone number ID.
     * </p>
     * 
     * @param phoneNumberId
     *        The phone number ID.
     */

    public void setPhoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
    }

    /**
     * <p>
     * The phone number ID.
     * </p>
     * 
     * @return The phone number ID.
     */

    public String getPhoneNumberId() {
        return this.phoneNumberId;
    }

    /**
     * <p>
     * The phone number ID.
     * </p>
     * 
     * @param phoneNumberId
     *        The phone number ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhoneNumber withPhoneNumberId(String phoneNumberId) {
        setPhoneNumberId(phoneNumberId);
        return this;
    }

    /**
     * <p>
     * The phone number, in E.164 format.
     * </p>
     * 
     * @param e164PhoneNumber
     *        The phone number, in E.164 format.
     */

    public void setE164PhoneNumber(String e164PhoneNumber) {
        this.e164PhoneNumber = e164PhoneNumber;
    }

    /**
     * <p>
     * The phone number, in E.164 format.
     * </p>
     * 
     * @return The phone number, in E.164 format.
     */

    public String getE164PhoneNumber() {
        return this.e164PhoneNumber;
    }

    /**
     * <p>
     * The phone number, in E.164 format.
     * </p>
     * 
     * @param e164PhoneNumber
     *        The phone number, in E.164 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhoneNumber withE164PhoneNumber(String e164PhoneNumber) {
        setE164PhoneNumber(e164PhoneNumber);
        return this;
    }

    /**
     * <p>
     * The phone number product type.
     * </p>
     * 
     * @param productType
     *        The phone number product type.
     * @see PhoneNumberProductType
     */

    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * <p>
     * The phone number product type.
     * </p>
     * 
     * @return The phone number product type.
     * @see PhoneNumberProductType
     */

    public String getProductType() {
        return this.productType;
    }

    /**
     * <p>
     * The phone number product type.
     * </p>
     * 
     * @param productType
     *        The phone number product type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberProductType
     */

    public PhoneNumber withProductType(String productType) {
        setProductType(productType);
        return this;
    }

    /**
     * <p>
     * The phone number product type.
     * </p>
     * 
     * @param productType
     *        The phone number product type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberProductType
     */

    public PhoneNumber withProductType(PhoneNumberProductType productType) {
        this.productType = productType.toString();
        return this;
    }

    /**
     * <p>
     * The phone number status.
     * </p>
     * 
     * @param status
     *        The phone number status.
     * @see PhoneNumberStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The phone number status.
     * </p>
     * 
     * @return The phone number status.
     * @see PhoneNumberStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The phone number status.
     * </p>
     * 
     * @param status
     *        The phone number status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberStatus
     */

    public PhoneNumber withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The phone number status.
     * </p>
     * 
     * @param status
     *        The phone number status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberStatus
     */

    public PhoneNumber withStatus(PhoneNumberStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The phone number capabilities.
     * </p>
     * 
     * @param capabilities
     *        The phone number capabilities.
     */

    public void setCapabilities(PhoneNumberCapabilities capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * <p>
     * The phone number capabilities.
     * </p>
     * 
     * @return The phone number capabilities.
     */

    public PhoneNumberCapabilities getCapabilities() {
        return this.capabilities;
    }

    /**
     * <p>
     * The phone number capabilities.
     * </p>
     * 
     * @param capabilities
     *        The phone number capabilities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhoneNumber withCapabilities(PhoneNumberCapabilities capabilities) {
        setCapabilities(capabilities);
        return this;
    }

    /**
     * <p>
     * The phone number associations.
     * </p>
     * 
     * @return The phone number associations.
     */

    public java.util.List<PhoneNumberAssociation> getAssociations() {
        return associations;
    }

    /**
     * <p>
     * The phone number associations.
     * </p>
     * 
     * @param associations
     *        The phone number associations.
     */

    public void setAssociations(java.util.Collection<PhoneNumberAssociation> associations) {
        if (associations == null) {
            this.associations = null;
            return;
        }

        this.associations = new java.util.ArrayList<PhoneNumberAssociation>(associations);
    }

    /**
     * <p>
     * The phone number associations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociations(java.util.Collection)} or {@link #withAssociations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param associations
     *        The phone number associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhoneNumber withAssociations(PhoneNumberAssociation... associations) {
        if (this.associations == null) {
            setAssociations(new java.util.ArrayList<PhoneNumberAssociation>(associations.length));
        }
        for (PhoneNumberAssociation ele : associations) {
            this.associations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The phone number associations.
     * </p>
     * 
     * @param associations
     *        The phone number associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhoneNumber withAssociations(java.util.Collection<PhoneNumberAssociation> associations) {
        setAssociations(associations);
        return this;
    }

    /**
     * <p>
     * The phone number creation timestamp, in ISO 8601 format.
     * </p>
     * 
     * @param createdTimestamp
     *        The phone number creation timestamp, in ISO 8601 format.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The phone number creation timestamp, in ISO 8601 format.
     * </p>
     * 
     * @return The phone number creation timestamp, in ISO 8601 format.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The phone number creation timestamp, in ISO 8601 format.
     * </p>
     * 
     * @param createdTimestamp
     *        The phone number creation timestamp, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhoneNumber withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The updated phone number timestamp, in ISO 8601 format.
     * </p>
     * 
     * @param updatedTimestamp
     *        The updated phone number timestamp, in ISO 8601 format.
     */

    public void setUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
     * <p>
     * The updated phone number timestamp, in ISO 8601 format.
     * </p>
     * 
     * @return The updated phone number timestamp, in ISO 8601 format.
     */

    public java.util.Date getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    /**
     * <p>
     * The updated phone number timestamp, in ISO 8601 format.
     * </p>
     * 
     * @param updatedTimestamp
     *        The updated phone number timestamp, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhoneNumber withUpdatedTimestamp(java.util.Date updatedTimestamp) {
        setUpdatedTimestamp(updatedTimestamp);
        return this;
    }

    /**
     * <p>
     * The deleted phone number timestamp, in ISO 8601 format.
     * </p>
     * 
     * @param deletionTimestamp
     *        The deleted phone number timestamp, in ISO 8601 format.
     */

    public void setDeletionTimestamp(java.util.Date deletionTimestamp) {
        this.deletionTimestamp = deletionTimestamp;
    }

    /**
     * <p>
     * The deleted phone number timestamp, in ISO 8601 format.
     * </p>
     * 
     * @return The deleted phone number timestamp, in ISO 8601 format.
     */

    public java.util.Date getDeletionTimestamp() {
        return this.deletionTimestamp;
    }

    /**
     * <p>
     * The deleted phone number timestamp, in ISO 8601 format.
     * </p>
     * 
     * @param deletionTimestamp
     *        The deleted phone number timestamp, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhoneNumber withDeletionTimestamp(java.util.Date deletionTimestamp) {
        setDeletionTimestamp(deletionTimestamp);
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
        if (getPhoneNumberId() != null)
            sb.append("PhoneNumberId: ").append(getPhoneNumberId()).append(",");
        if (getE164PhoneNumber() != null)
            sb.append("E164PhoneNumber: ").append("***Sensitive Data Redacted***").append(",");
        if (getProductType() != null)
            sb.append("ProductType: ").append(getProductType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCapabilities() != null)
            sb.append("Capabilities: ").append(getCapabilities()).append(",");
        if (getAssociations() != null)
            sb.append("Associations: ").append(getAssociations()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getUpdatedTimestamp() != null)
            sb.append("UpdatedTimestamp: ").append(getUpdatedTimestamp()).append(",");
        if (getDeletionTimestamp() != null)
            sb.append("DeletionTimestamp: ").append(getDeletionTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PhoneNumber == false)
            return false;
        PhoneNumber other = (PhoneNumber) obj;
        if (other.getPhoneNumberId() == null ^ this.getPhoneNumberId() == null)
            return false;
        if (other.getPhoneNumberId() != null && other.getPhoneNumberId().equals(this.getPhoneNumberId()) == false)
            return false;
        if (other.getE164PhoneNumber() == null ^ this.getE164PhoneNumber() == null)
            return false;
        if (other.getE164PhoneNumber() != null && other.getE164PhoneNumber().equals(this.getE164PhoneNumber()) == false)
            return false;
        if (other.getProductType() == null ^ this.getProductType() == null)
            return false;
        if (other.getProductType() != null && other.getProductType().equals(this.getProductType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCapabilities() == null ^ this.getCapabilities() == null)
            return false;
        if (other.getCapabilities() != null && other.getCapabilities().equals(this.getCapabilities()) == false)
            return false;
        if (other.getAssociations() == null ^ this.getAssociations() == null)
            return false;
        if (other.getAssociations() != null && other.getAssociations().equals(this.getAssociations()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getUpdatedTimestamp() == null ^ this.getUpdatedTimestamp() == null)
            return false;
        if (other.getUpdatedTimestamp() != null && other.getUpdatedTimestamp().equals(this.getUpdatedTimestamp()) == false)
            return false;
        if (other.getDeletionTimestamp() == null ^ this.getDeletionTimestamp() == null)
            return false;
        if (other.getDeletionTimestamp() != null && other.getDeletionTimestamp().equals(this.getDeletionTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPhoneNumberId() == null) ? 0 : getPhoneNumberId().hashCode());
        hashCode = prime * hashCode + ((getE164PhoneNumber() == null) ? 0 : getE164PhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getProductType() == null) ? 0 : getProductType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        hashCode = prime * hashCode + ((getAssociations() == null) ? 0 : getAssociations().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTimestamp() == null) ? 0 : getUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getDeletionTimestamp() == null) ? 0 : getDeletionTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public PhoneNumber clone() {
        try {
            return (PhoneNumber) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.PhoneNumberMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
