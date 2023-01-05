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
package com.amazonaws.services.identitystore.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The full name of the user.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/Name" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Name implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A string containing a formatted version of the name for display.
     * </p>
     */
    private String formatted;
    /**
     * <p>
     * The family name of the user.
     * </p>
     */
    private String familyName;
    /**
     * <p>
     * The given name of the user.
     * </p>
     */
    private String givenName;
    /**
     * <p>
     * The middle name of the user.
     * </p>
     */
    private String middleName;
    /**
     * <p>
     * The honorific prefix of the user. For example, "Dr."
     * </p>
     */
    private String honorificPrefix;
    /**
     * <p>
     * The honorific suffix of the user. For example, "M.D."
     * </p>
     */
    private String honorificSuffix;

    /**
     * <p>
     * A string containing a formatted version of the name for display.
     * </p>
     * 
     * @param formatted
     *        A string containing a formatted version of the name for display.
     */

    public void setFormatted(String formatted) {
        this.formatted = formatted;
    }

    /**
     * <p>
     * A string containing a formatted version of the name for display.
     * </p>
     * 
     * @return A string containing a formatted version of the name for display.
     */

    public String getFormatted() {
        return this.formatted;
    }

    /**
     * <p>
     * A string containing a formatted version of the name for display.
     * </p>
     * 
     * @param formatted
     *        A string containing a formatted version of the name for display.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Name withFormatted(String formatted) {
        setFormatted(formatted);
        return this;
    }

    /**
     * <p>
     * The family name of the user.
     * </p>
     * 
     * @param familyName
     *        The family name of the user.
     */

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    /**
     * <p>
     * The family name of the user.
     * </p>
     * 
     * @return The family name of the user.
     */

    public String getFamilyName() {
        return this.familyName;
    }

    /**
     * <p>
     * The family name of the user.
     * </p>
     * 
     * @param familyName
     *        The family name of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Name withFamilyName(String familyName) {
        setFamilyName(familyName);
        return this;
    }

    /**
     * <p>
     * The given name of the user.
     * </p>
     * 
     * @param givenName
     *        The given name of the user.
     */

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    /**
     * <p>
     * The given name of the user.
     * </p>
     * 
     * @return The given name of the user.
     */

    public String getGivenName() {
        return this.givenName;
    }

    /**
     * <p>
     * The given name of the user.
     * </p>
     * 
     * @param givenName
     *        The given name of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Name withGivenName(String givenName) {
        setGivenName(givenName);
        return this;
    }

    /**
     * <p>
     * The middle name of the user.
     * </p>
     * 
     * @param middleName
     *        The middle name of the user.
     */

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * <p>
     * The middle name of the user.
     * </p>
     * 
     * @return The middle name of the user.
     */

    public String getMiddleName() {
        return this.middleName;
    }

    /**
     * <p>
     * The middle name of the user.
     * </p>
     * 
     * @param middleName
     *        The middle name of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Name withMiddleName(String middleName) {
        setMiddleName(middleName);
        return this;
    }

    /**
     * <p>
     * The honorific prefix of the user. For example, "Dr."
     * </p>
     * 
     * @param honorificPrefix
     *        The honorific prefix of the user. For example, "Dr."
     */

    public void setHonorificPrefix(String honorificPrefix) {
        this.honorificPrefix = honorificPrefix;
    }

    /**
     * <p>
     * The honorific prefix of the user. For example, "Dr."
     * </p>
     * 
     * @return The honorific prefix of the user. For example, "Dr."
     */

    public String getHonorificPrefix() {
        return this.honorificPrefix;
    }

    /**
     * <p>
     * The honorific prefix of the user. For example, "Dr."
     * </p>
     * 
     * @param honorificPrefix
     *        The honorific prefix of the user. For example, "Dr."
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Name withHonorificPrefix(String honorificPrefix) {
        setHonorificPrefix(honorificPrefix);
        return this;
    }

    /**
     * <p>
     * The honorific suffix of the user. For example, "M.D."
     * </p>
     * 
     * @param honorificSuffix
     *        The honorific suffix of the user. For example, "M.D."
     */

    public void setHonorificSuffix(String honorificSuffix) {
        this.honorificSuffix = honorificSuffix;
    }

    /**
     * <p>
     * The honorific suffix of the user. For example, "M.D."
     * </p>
     * 
     * @return The honorific suffix of the user. For example, "M.D."
     */

    public String getHonorificSuffix() {
        return this.honorificSuffix;
    }

    /**
     * <p>
     * The honorific suffix of the user. For example, "M.D."
     * </p>
     * 
     * @param honorificSuffix
     *        The honorific suffix of the user. For example, "M.D."
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Name withHonorificSuffix(String honorificSuffix) {
        setHonorificSuffix(honorificSuffix);
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
        if (getFormatted() != null)
            sb.append("Formatted: ").append("***Sensitive Data Redacted***").append(",");
        if (getFamilyName() != null)
            sb.append("FamilyName: ").append("***Sensitive Data Redacted***").append(",");
        if (getGivenName() != null)
            sb.append("GivenName: ").append("***Sensitive Data Redacted***").append(",");
        if (getMiddleName() != null)
            sb.append("MiddleName: ").append("***Sensitive Data Redacted***").append(",");
        if (getHonorificPrefix() != null)
            sb.append("HonorificPrefix: ").append("***Sensitive Data Redacted***").append(",");
        if (getHonorificSuffix() != null)
            sb.append("HonorificSuffix: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Name == false)
            return false;
        Name other = (Name) obj;
        if (other.getFormatted() == null ^ this.getFormatted() == null)
            return false;
        if (other.getFormatted() != null && other.getFormatted().equals(this.getFormatted()) == false)
            return false;
        if (other.getFamilyName() == null ^ this.getFamilyName() == null)
            return false;
        if (other.getFamilyName() != null && other.getFamilyName().equals(this.getFamilyName()) == false)
            return false;
        if (other.getGivenName() == null ^ this.getGivenName() == null)
            return false;
        if (other.getGivenName() != null && other.getGivenName().equals(this.getGivenName()) == false)
            return false;
        if (other.getMiddleName() == null ^ this.getMiddleName() == null)
            return false;
        if (other.getMiddleName() != null && other.getMiddleName().equals(this.getMiddleName()) == false)
            return false;
        if (other.getHonorificPrefix() == null ^ this.getHonorificPrefix() == null)
            return false;
        if (other.getHonorificPrefix() != null && other.getHonorificPrefix().equals(this.getHonorificPrefix()) == false)
            return false;
        if (other.getHonorificSuffix() == null ^ this.getHonorificSuffix() == null)
            return false;
        if (other.getHonorificSuffix() != null && other.getHonorificSuffix().equals(this.getHonorificSuffix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormatted() == null) ? 0 : getFormatted().hashCode());
        hashCode = prime * hashCode + ((getFamilyName() == null) ? 0 : getFamilyName().hashCode());
        hashCode = prime * hashCode + ((getGivenName() == null) ? 0 : getGivenName().hashCode());
        hashCode = prime * hashCode + ((getMiddleName() == null) ? 0 : getMiddleName().hashCode());
        hashCode = prime * hashCode + ((getHonorificPrefix() == null) ? 0 : getHonorificPrefix().hashCode());
        hashCode = prime * hashCode + ((getHonorificSuffix() == null) ? 0 : getHonorificSuffix().hashCode());
        return hashCode;
    }

    @Override
    public Name clone() {
        try {
            return (Name) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.identitystore.model.transform.NameMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
