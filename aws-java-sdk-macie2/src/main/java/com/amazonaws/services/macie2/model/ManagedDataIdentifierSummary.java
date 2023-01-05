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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about a managed data identifier. For additional information, see <a
 * href="https://docs.aws.amazon.com/macie/latest/user/managed-data-identifiers.html">Using managed data identifiers</a>
 * in the <i>Amazon Macie User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ManagedDataIdentifierSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManagedDataIdentifierSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The category of sensitive data that the managed data identifier detects: CREDENTIALS, for credentials data such
     * as private keys or Amazon Web Services secret access keys; FINANCIAL_INFORMATION, for financial data such as
     * credit card numbers; or, PERSONAL_INFORMATION, for personal health information, such as health insurance
     * identification numbers, or personally identifiable information, such as passport numbers.
     * </p>
     */
    private String category;
    /**
     * <p>
     * The unique identifier for the managed data identifier. This is a string that describes the type of sensitive data
     * that the managed data identifier detects. For example: OPENSSH_PRIVATE_KEY for OpenSSH private keys,
     * CREDIT_CARD_NUMBER for credit card numbers, or USA_PASSPORT_NUMBER for US passport numbers.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The category of sensitive data that the managed data identifier detects: CREDENTIALS, for credentials data such
     * as private keys or Amazon Web Services secret access keys; FINANCIAL_INFORMATION, for financial data such as
     * credit card numbers; or, PERSONAL_INFORMATION, for personal health information, such as health insurance
     * identification numbers, or personally identifiable information, such as passport numbers.
     * </p>
     * 
     * @param category
     *        The category of sensitive data that the managed data identifier detects: CREDENTIALS, for credentials data
     *        such as private keys or Amazon Web Services secret access keys; FINANCIAL_INFORMATION, for financial data
     *        such as credit card numbers; or, PERSONAL_INFORMATION, for personal health information, such as health
     *        insurance identification numbers, or personally identifiable information, such as passport numbers.
     * @see SensitiveDataItemCategory
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * The category of sensitive data that the managed data identifier detects: CREDENTIALS, for credentials data such
     * as private keys or Amazon Web Services secret access keys; FINANCIAL_INFORMATION, for financial data such as
     * credit card numbers; or, PERSONAL_INFORMATION, for personal health information, such as health insurance
     * identification numbers, or personally identifiable information, such as passport numbers.
     * </p>
     * 
     * @return The category of sensitive data that the managed data identifier detects: CREDENTIALS, for credentials
     *         data such as private keys or Amazon Web Services secret access keys; FINANCIAL_INFORMATION, for financial
     *         data such as credit card numbers; or, PERSONAL_INFORMATION, for personal health information, such as
     *         health insurance identification numbers, or personally identifiable information, such as passport
     *         numbers.
     * @see SensitiveDataItemCategory
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * <p>
     * The category of sensitive data that the managed data identifier detects: CREDENTIALS, for credentials data such
     * as private keys or Amazon Web Services secret access keys; FINANCIAL_INFORMATION, for financial data such as
     * credit card numbers; or, PERSONAL_INFORMATION, for personal health information, such as health insurance
     * identification numbers, or personally identifiable information, such as passport numbers.
     * </p>
     * 
     * @param category
     *        The category of sensitive data that the managed data identifier detects: CREDENTIALS, for credentials data
     *        such as private keys or Amazon Web Services secret access keys; FINANCIAL_INFORMATION, for financial data
     *        such as credit card numbers; or, PERSONAL_INFORMATION, for personal health information, such as health
     *        insurance identification numbers, or personally identifiable information, such as passport numbers.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SensitiveDataItemCategory
     */

    public ManagedDataIdentifierSummary withCategory(String category) {
        setCategory(category);
        return this;
    }

    /**
     * <p>
     * The category of sensitive data that the managed data identifier detects: CREDENTIALS, for credentials data such
     * as private keys or Amazon Web Services secret access keys; FINANCIAL_INFORMATION, for financial data such as
     * credit card numbers; or, PERSONAL_INFORMATION, for personal health information, such as health insurance
     * identification numbers, or personally identifiable information, such as passport numbers.
     * </p>
     * 
     * @param category
     *        The category of sensitive data that the managed data identifier detects: CREDENTIALS, for credentials data
     *        such as private keys or Amazon Web Services secret access keys; FINANCIAL_INFORMATION, for financial data
     *        such as credit card numbers; or, PERSONAL_INFORMATION, for personal health information, such as health
     *        insurance identification numbers, or personally identifiable information, such as passport numbers.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SensitiveDataItemCategory
     */

    public ManagedDataIdentifierSummary withCategory(SensitiveDataItemCategory category) {
        this.category = category.toString();
        return this;
    }

    /**
     * <p>
     * The unique identifier for the managed data identifier. This is a string that describes the type of sensitive data
     * that the managed data identifier detects. For example: OPENSSH_PRIVATE_KEY for OpenSSH private keys,
     * CREDIT_CARD_NUMBER for credit card numbers, or USA_PASSPORT_NUMBER for US passport numbers.
     * </p>
     * 
     * @param id
     *        The unique identifier for the managed data identifier. This is a string that describes the type of
     *        sensitive data that the managed data identifier detects. For example: OPENSSH_PRIVATE_KEY for OpenSSH
     *        private keys, CREDIT_CARD_NUMBER for credit card numbers, or USA_PASSPORT_NUMBER for US passport numbers.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the managed data identifier. This is a string that describes the type of sensitive data
     * that the managed data identifier detects. For example: OPENSSH_PRIVATE_KEY for OpenSSH private keys,
     * CREDIT_CARD_NUMBER for credit card numbers, or USA_PASSPORT_NUMBER for US passport numbers.
     * </p>
     * 
     * @return The unique identifier for the managed data identifier. This is a string that describes the type of
     *         sensitive data that the managed data identifier detects. For example: OPENSSH_PRIVATE_KEY for OpenSSH
     *         private keys, CREDIT_CARD_NUMBER for credit card numbers, or USA_PASSPORT_NUMBER for US passport numbers.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the managed data identifier. This is a string that describes the type of sensitive data
     * that the managed data identifier detects. For example: OPENSSH_PRIVATE_KEY for OpenSSH private keys,
     * CREDIT_CARD_NUMBER for credit card numbers, or USA_PASSPORT_NUMBER for US passport numbers.
     * </p>
     * 
     * @param id
     *        The unique identifier for the managed data identifier. This is a string that describes the type of
     *        sensitive data that the managed data identifier detects. For example: OPENSSH_PRIVATE_KEY for OpenSSH
     *        private keys, CREDIT_CARD_NUMBER for credit card numbers, or USA_PASSPORT_NUMBER for US passport numbers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagedDataIdentifierSummary withId(String id) {
        setId(id);
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
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ManagedDataIdentifierSummary == false)
            return false;
        ManagedDataIdentifierSummary other = (ManagedDataIdentifierSummary) obj;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public ManagedDataIdentifierSummary clone() {
        try {
            return (ManagedDataIdentifierSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.ManagedDataIdentifierSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
