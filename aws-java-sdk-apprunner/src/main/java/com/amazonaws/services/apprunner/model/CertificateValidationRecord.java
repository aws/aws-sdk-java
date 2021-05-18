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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a certificate CNAME record to add to your DNS. For more information, see <a
 * href="https://docs.aws.amazon.com/apprunner/latest/api/API_AssociateCustomDomain.html">AssociateCustomDomain</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/CertificateValidationRecord"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CertificateValidationRecord implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The certificate CNAME record name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The record type, always <code>CNAME</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The certificate CNAME record value.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The current state of the certificate CNAME record validation. It should change to <code>SUCCESS</code> after App
     * Runner completes validation with your DNS.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The certificate CNAME record name.
     * </p>
     * 
     * @param name
     *        The certificate CNAME record name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The certificate CNAME record name.
     * </p>
     * 
     * @return The certificate CNAME record name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The certificate CNAME record name.
     * </p>
     * 
     * @param name
     *        The certificate CNAME record name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateValidationRecord withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The record type, always <code>CNAME</code>.
     * </p>
     * 
     * @param type
     *        The record type, always <code>CNAME</code>.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The record type, always <code>CNAME</code>.
     * </p>
     * 
     * @return The record type, always <code>CNAME</code>.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The record type, always <code>CNAME</code>.
     * </p>
     * 
     * @param type
     *        The record type, always <code>CNAME</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateValidationRecord withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The certificate CNAME record value.
     * </p>
     * 
     * @param value
     *        The certificate CNAME record value.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The certificate CNAME record value.
     * </p>
     * 
     * @return The certificate CNAME record value.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The certificate CNAME record value.
     * </p>
     * 
     * @param value
     *        The certificate CNAME record value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateValidationRecord withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The current state of the certificate CNAME record validation. It should change to <code>SUCCESS</code> after App
     * Runner completes validation with your DNS.
     * </p>
     * 
     * @param status
     *        The current state of the certificate CNAME record validation. It should change to <code>SUCCESS</code>
     *        after App Runner completes validation with your DNS.
     * @see CertificateValidationRecordStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the certificate CNAME record validation. It should change to <code>SUCCESS</code> after App
     * Runner completes validation with your DNS.
     * </p>
     * 
     * @return The current state of the certificate CNAME record validation. It should change to <code>SUCCESS</code>
     *         after App Runner completes validation with your DNS.
     * @see CertificateValidationRecordStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current state of the certificate CNAME record validation. It should change to <code>SUCCESS</code> after App
     * Runner completes validation with your DNS.
     * </p>
     * 
     * @param status
     *        The current state of the certificate CNAME record validation. It should change to <code>SUCCESS</code>
     *        after App Runner completes validation with your DNS.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateValidationRecordStatus
     */

    public CertificateValidationRecord withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current state of the certificate CNAME record validation. It should change to <code>SUCCESS</code> after App
     * Runner completes validation with your DNS.
     * </p>
     * 
     * @param status
     *        The current state of the certificate CNAME record validation. It should change to <code>SUCCESS</code>
     *        after App Runner completes validation with your DNS.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateValidationRecordStatus
     */

    public CertificateValidationRecord withStatus(CertificateValidationRecordStatus status) {
        this.status = status.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CertificateValidationRecord == false)
            return false;
        CertificateValidationRecord other = (CertificateValidationRecord) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public CertificateValidationRecord clone() {
        try {
            return (CertificateValidationRecord) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apprunner.model.transform.CertificateValidationRecordMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
