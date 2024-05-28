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
package com.amazonaws.services.marketplaceagreement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the conditions that will keep an agreement created from this offer valid.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-agreement-2020-03-01/ValidityTerm" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidityTerm implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the duration that the agreement remains active. If <code>AgreementStartDate</code> isn’t provided, the
     * agreement duration is relative to the agreement signature time. The duration is represented in the ISO_8601
     * format.
     * </p>
     */
    private String agreementDuration;
    /**
     * <p>
     * Defines the date when the agreement ends. The agreement ends at 23:59:59.999 UTC on the date provided. If
     * <code>AgreementEndDate</code> isn’t provided, the agreement end date is determined by the validity of individual
     * terms.
     * </p>
     */
    private java.util.Date agreementEndDate;
    /**
     * <p>
     * Defines the date when agreement starts. The agreement starts at 00:00:00.000 UTC on the date provided. If
     * <code>AgreementStartDate</code> isn’t provided, the agreement start date is determined based on agreement
     * signature time.
     * </p>
     */
    private java.util.Date agreementStartDate;
    /**
     * <p>
     * Category of the term being updated.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Defines the duration that the agreement remains active. If <code>AgreementStartDate</code> isn’t provided, the
     * agreement duration is relative to the agreement signature time. The duration is represented in the ISO_8601
     * format.
     * </p>
     * 
     * @param agreementDuration
     *        Defines the duration that the agreement remains active. If <code>AgreementStartDate</code> isn’t provided,
     *        the agreement duration is relative to the agreement signature time. The duration is represented in the
     *        ISO_8601 format.
     */

    public void setAgreementDuration(String agreementDuration) {
        this.agreementDuration = agreementDuration;
    }

    /**
     * <p>
     * Defines the duration that the agreement remains active. If <code>AgreementStartDate</code> isn’t provided, the
     * agreement duration is relative to the agreement signature time. The duration is represented in the ISO_8601
     * format.
     * </p>
     * 
     * @return Defines the duration that the agreement remains active. If <code>AgreementStartDate</code> isn’t
     *         provided, the agreement duration is relative to the agreement signature time. The duration is represented
     *         in the ISO_8601 format.
     */

    public String getAgreementDuration() {
        return this.agreementDuration;
    }

    /**
     * <p>
     * Defines the duration that the agreement remains active. If <code>AgreementStartDate</code> isn’t provided, the
     * agreement duration is relative to the agreement signature time. The duration is represented in the ISO_8601
     * format.
     * </p>
     * 
     * @param agreementDuration
     *        Defines the duration that the agreement remains active. If <code>AgreementStartDate</code> isn’t provided,
     *        the agreement duration is relative to the agreement signature time. The duration is represented in the
     *        ISO_8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidityTerm withAgreementDuration(String agreementDuration) {
        setAgreementDuration(agreementDuration);
        return this;
    }

    /**
     * <p>
     * Defines the date when the agreement ends. The agreement ends at 23:59:59.999 UTC on the date provided. If
     * <code>AgreementEndDate</code> isn’t provided, the agreement end date is determined by the validity of individual
     * terms.
     * </p>
     * 
     * @param agreementEndDate
     *        Defines the date when the agreement ends. The agreement ends at 23:59:59.999 UTC on the date provided. If
     *        <code>AgreementEndDate</code> isn’t provided, the agreement end date is determined by the validity of
     *        individual terms.
     */

    public void setAgreementEndDate(java.util.Date agreementEndDate) {
        this.agreementEndDate = agreementEndDate;
    }

    /**
     * <p>
     * Defines the date when the agreement ends. The agreement ends at 23:59:59.999 UTC on the date provided. If
     * <code>AgreementEndDate</code> isn’t provided, the agreement end date is determined by the validity of individual
     * terms.
     * </p>
     * 
     * @return Defines the date when the agreement ends. The agreement ends at 23:59:59.999 UTC on the date provided. If
     *         <code>AgreementEndDate</code> isn’t provided, the agreement end date is determined by the validity of
     *         individual terms.
     */

    public java.util.Date getAgreementEndDate() {
        return this.agreementEndDate;
    }

    /**
     * <p>
     * Defines the date when the agreement ends. The agreement ends at 23:59:59.999 UTC on the date provided. If
     * <code>AgreementEndDate</code> isn’t provided, the agreement end date is determined by the validity of individual
     * terms.
     * </p>
     * 
     * @param agreementEndDate
     *        Defines the date when the agreement ends. The agreement ends at 23:59:59.999 UTC on the date provided. If
     *        <code>AgreementEndDate</code> isn’t provided, the agreement end date is determined by the validity of
     *        individual terms.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidityTerm withAgreementEndDate(java.util.Date agreementEndDate) {
        setAgreementEndDate(agreementEndDate);
        return this;
    }

    /**
     * <p>
     * Defines the date when agreement starts. The agreement starts at 00:00:00.000 UTC on the date provided. If
     * <code>AgreementStartDate</code> isn’t provided, the agreement start date is determined based on agreement
     * signature time.
     * </p>
     * 
     * @param agreementStartDate
     *        Defines the date when agreement starts. The agreement starts at 00:00:00.000 UTC on the date provided. If
     *        <code>AgreementStartDate</code> isn’t provided, the agreement start date is determined based on agreement
     *        signature time.
     */

    public void setAgreementStartDate(java.util.Date agreementStartDate) {
        this.agreementStartDate = agreementStartDate;
    }

    /**
     * <p>
     * Defines the date when agreement starts. The agreement starts at 00:00:00.000 UTC on the date provided. If
     * <code>AgreementStartDate</code> isn’t provided, the agreement start date is determined based on agreement
     * signature time.
     * </p>
     * 
     * @return Defines the date when agreement starts. The agreement starts at 00:00:00.000 UTC on the date provided. If
     *         <code>AgreementStartDate</code> isn’t provided, the agreement start date is determined based on agreement
     *         signature time.
     */

    public java.util.Date getAgreementStartDate() {
        return this.agreementStartDate;
    }

    /**
     * <p>
     * Defines the date when agreement starts. The agreement starts at 00:00:00.000 UTC on the date provided. If
     * <code>AgreementStartDate</code> isn’t provided, the agreement start date is determined based on agreement
     * signature time.
     * </p>
     * 
     * @param agreementStartDate
     *        Defines the date when agreement starts. The agreement starts at 00:00:00.000 UTC on the date provided. If
     *        <code>AgreementStartDate</code> isn’t provided, the agreement start date is determined based on agreement
     *        signature time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidityTerm withAgreementStartDate(java.util.Date agreementStartDate) {
        setAgreementStartDate(agreementStartDate);
        return this;
    }

    /**
     * <p>
     * Category of the term being updated.
     * </p>
     * 
     * @param type
     *        Category of the term being updated.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Category of the term being updated.
     * </p>
     * 
     * @return Category of the term being updated.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Category of the term being updated.
     * </p>
     * 
     * @param type
     *        Category of the term being updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidityTerm withType(String type) {
        setType(type);
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
        if (getAgreementDuration() != null)
            sb.append("AgreementDuration: ").append(getAgreementDuration()).append(",");
        if (getAgreementEndDate() != null)
            sb.append("AgreementEndDate: ").append(getAgreementEndDate()).append(",");
        if (getAgreementStartDate() != null)
            sb.append("AgreementStartDate: ").append(getAgreementStartDate()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidityTerm == false)
            return false;
        ValidityTerm other = (ValidityTerm) obj;
        if (other.getAgreementDuration() == null ^ this.getAgreementDuration() == null)
            return false;
        if (other.getAgreementDuration() != null && other.getAgreementDuration().equals(this.getAgreementDuration()) == false)
            return false;
        if (other.getAgreementEndDate() == null ^ this.getAgreementEndDate() == null)
            return false;
        if (other.getAgreementEndDate() != null && other.getAgreementEndDate().equals(this.getAgreementEndDate()) == false)
            return false;
        if (other.getAgreementStartDate() == null ^ this.getAgreementStartDate() == null)
            return false;
        if (other.getAgreementStartDate() != null && other.getAgreementStartDate().equals(this.getAgreementStartDate()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgreementDuration() == null) ? 0 : getAgreementDuration().hashCode());
        hashCode = prime * hashCode + ((getAgreementEndDate() == null) ? 0 : getAgreementEndDate().hashCode());
        hashCode = prime * hashCode + ((getAgreementStartDate() == null) ? 0 : getAgreementStartDate().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public ValidityTerm clone() {
        try {
            return (ValidityTerm) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplaceagreement.model.transform.ValidityTermMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
