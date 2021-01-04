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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Attributes of the session that the key was used for.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsIamAccessKeySessionContextAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsIamAccessKeySessionContextAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether the session used multi-factor authentication (MFA).
     * </p>
     */
    private Boolean mfaAuthenticated;
    /**
     * <p>
     * Indicates when the session was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String creationDate;

    /**
     * <p>
     * Indicates whether the session used multi-factor authentication (MFA).
     * </p>
     * 
     * @param mfaAuthenticated
     *        Indicates whether the session used multi-factor authentication (MFA).
     */

    public void setMfaAuthenticated(Boolean mfaAuthenticated) {
        this.mfaAuthenticated = mfaAuthenticated;
    }

    /**
     * <p>
     * Indicates whether the session used multi-factor authentication (MFA).
     * </p>
     * 
     * @return Indicates whether the session used multi-factor authentication (MFA).
     */

    public Boolean getMfaAuthenticated() {
        return this.mfaAuthenticated;
    }

    /**
     * <p>
     * Indicates whether the session used multi-factor authentication (MFA).
     * </p>
     * 
     * @param mfaAuthenticated
     *        Indicates whether the session used multi-factor authentication (MFA).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamAccessKeySessionContextAttributes withMfaAuthenticated(Boolean mfaAuthenticated) {
        setMfaAuthenticated(mfaAuthenticated);
        return this;
    }

    /**
     * <p>
     * Indicates whether the session used multi-factor authentication (MFA).
     * </p>
     * 
     * @return Indicates whether the session used multi-factor authentication (MFA).
     */

    public Boolean isMfaAuthenticated() {
        return this.mfaAuthenticated;
    }

    /**
     * <p>
     * Indicates when the session was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param creationDate
     *        Indicates when the session was created.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * Indicates when the session was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return Indicates when the session was created.</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * Indicates when the session was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param creationDate
     *        Indicates when the session was created.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamAccessKeySessionContextAttributes withCreationDate(String creationDate) {
        setCreationDate(creationDate);
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
        if (getMfaAuthenticated() != null)
            sb.append("MfaAuthenticated: ").append(getMfaAuthenticated()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsIamAccessKeySessionContextAttributes == false)
            return false;
        AwsIamAccessKeySessionContextAttributes other = (AwsIamAccessKeySessionContextAttributes) obj;
        if (other.getMfaAuthenticated() == null ^ this.getMfaAuthenticated() == null)
            return false;
        if (other.getMfaAuthenticated() != null && other.getMfaAuthenticated().equals(this.getMfaAuthenticated()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMfaAuthenticated() == null) ? 0 : getMfaAuthenticated().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        return hashCode;
    }

    @Override
    public AwsIamAccessKeySessionContextAttributes clone() {
        try {
            return (AwsIamAccessKeySessionContextAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsIamAccessKeySessionContextAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
