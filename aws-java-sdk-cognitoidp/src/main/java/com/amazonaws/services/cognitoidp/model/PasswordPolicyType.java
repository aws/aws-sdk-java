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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The password policy type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/PasswordPolicyType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PasswordPolicyType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The minimum length of the password policy that you have set. Cannot be less than 6.
     * </p>
     */
    private Integer minimumLength;
    /**
     * <p>
     * In the password policy that you have set, refers to whether you have required users to use at least one uppercase
     * letter in their password.
     * </p>
     */
    private Boolean requireUppercase;
    /**
     * <p>
     * In the password policy that you have set, refers to whether you have required users to use at least one lowercase
     * letter in their password.
     * </p>
     */
    private Boolean requireLowercase;
    /**
     * <p>
     * In the password policy that you have set, refers to whether you have required users to use at least one number in
     * their password.
     * </p>
     */
    private Boolean requireNumbers;
    /**
     * <p>
     * In the password policy that you have set, refers to whether you have required users to use at least one symbol in
     * their password.
     * </p>
     */
    private Boolean requireSymbols;

    /**
     * <p>
     * The minimum length of the password policy that you have set. Cannot be less than 6.
     * </p>
     * 
     * @param minimumLength
     *        The minimum length of the password policy that you have set. Cannot be less than 6.
     */

    public void setMinimumLength(Integer minimumLength) {
        this.minimumLength = minimumLength;
    }

    /**
     * <p>
     * The minimum length of the password policy that you have set. Cannot be less than 6.
     * </p>
     * 
     * @return The minimum length of the password policy that you have set. Cannot be less than 6.
     */

    public Integer getMinimumLength() {
        return this.minimumLength;
    }

    /**
     * <p>
     * The minimum length of the password policy that you have set. Cannot be less than 6.
     * </p>
     * 
     * @param minimumLength
     *        The minimum length of the password policy that you have set. Cannot be less than 6.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PasswordPolicyType withMinimumLength(Integer minimumLength) {
        setMinimumLength(minimumLength);
        return this;
    }

    /**
     * <p>
     * In the password policy that you have set, refers to whether you have required users to use at least one uppercase
     * letter in their password.
     * </p>
     * 
     * @param requireUppercase
     *        In the password policy that you have set, refers to whether you have required users to use at least one
     *        uppercase letter in their password.
     */

    public void setRequireUppercase(Boolean requireUppercase) {
        this.requireUppercase = requireUppercase;
    }

    /**
     * <p>
     * In the password policy that you have set, refers to whether you have required users to use at least one uppercase
     * letter in their password.
     * </p>
     * 
     * @return In the password policy that you have set, refers to whether you have required users to use at least one
     *         uppercase letter in their password.
     */

    public Boolean getRequireUppercase() {
        return this.requireUppercase;
    }

    /**
     * <p>
     * In the password policy that you have set, refers to whether you have required users to use at least one uppercase
     * letter in their password.
     * </p>
     * 
     * @param requireUppercase
     *        In the password policy that you have set, refers to whether you have required users to use at least one
     *        uppercase letter in their password.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PasswordPolicyType withRequireUppercase(Boolean requireUppercase) {
        setRequireUppercase(requireUppercase);
        return this;
    }

    /**
     * <p>
     * In the password policy that you have set, refers to whether you have required users to use at least one uppercase
     * letter in their password.
     * </p>
     * 
     * @return In the password policy that you have set, refers to whether you have required users to use at least one
     *         uppercase letter in their password.
     */

    public Boolean isRequireUppercase() {
        return this.requireUppercase;
    }

    /**
     * <p>
     * In the password policy that you have set, refers to whether you have required users to use at least one lowercase
     * letter in their password.
     * </p>
     * 
     * @param requireLowercase
     *        In the password policy that you have set, refers to whether you have required users to use at least one
     *        lowercase letter in their password.
     */

    public void setRequireLowercase(Boolean requireLowercase) {
        this.requireLowercase = requireLowercase;
    }

    /**
     * <p>
     * In the password policy that you have set, refers to whether you have required users to use at least one lowercase
     * letter in their password.
     * </p>
     * 
     * @return In the password policy that you have set, refers to whether you have required users to use at least one
     *         lowercase letter in their password.
     */

    public Boolean getRequireLowercase() {
        return this.requireLowercase;
    }

    /**
     * <p>
     * In the password policy that you have set, refers to whether you have required users to use at least one lowercase
     * letter in their password.
     * </p>
     * 
     * @param requireLowercase
     *        In the password policy that you have set, refers to whether you have required users to use at least one
     *        lowercase letter in their password.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PasswordPolicyType withRequireLowercase(Boolean requireLowercase) {
        setRequireLowercase(requireLowercase);
        return this;
    }

    /**
     * <p>
     * In the password policy that you have set, refers to whether you have required users to use at least one lowercase
     * letter in their password.
     * </p>
     * 
     * @return In the password policy that you have set, refers to whether you have required users to use at least one
     *         lowercase letter in their password.
     */

    public Boolean isRequireLowercase() {
        return this.requireLowercase;
    }

    /**
     * <p>
     * In the password policy that you have set, refers to whether you have required users to use at least one number in
     * their password.
     * </p>
     * 
     * @param requireNumbers
     *        In the password policy that you have set, refers to whether you have required users to use at least one
     *        number in their password.
     */

    public void setRequireNumbers(Boolean requireNumbers) {
        this.requireNumbers = requireNumbers;
    }

    /**
     * <p>
     * In the password policy that you have set, refers to whether you have required users to use at least one number in
     * their password.
     * </p>
     * 
     * @return In the password policy that you have set, refers to whether you have required users to use at least one
     *         number in their password.
     */

    public Boolean getRequireNumbers() {
        return this.requireNumbers;
    }

    /**
     * <p>
     * In the password policy that you have set, refers to whether you have required users to use at least one number in
     * their password.
     * </p>
     * 
     * @param requireNumbers
     *        In the password policy that you have set, refers to whether you have required users to use at least one
     *        number in their password.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PasswordPolicyType withRequireNumbers(Boolean requireNumbers) {
        setRequireNumbers(requireNumbers);
        return this;
    }

    /**
     * <p>
     * In the password policy that you have set, refers to whether you have required users to use at least one number in
     * their password.
     * </p>
     * 
     * @return In the password policy that you have set, refers to whether you have required users to use at least one
     *         number in their password.
     */

    public Boolean isRequireNumbers() {
        return this.requireNumbers;
    }

    /**
     * <p>
     * In the password policy that you have set, refers to whether you have required users to use at least one symbol in
     * their password.
     * </p>
     * 
     * @param requireSymbols
     *        In the password policy that you have set, refers to whether you have required users to use at least one
     *        symbol in their password.
     */

    public void setRequireSymbols(Boolean requireSymbols) {
        this.requireSymbols = requireSymbols;
    }

    /**
     * <p>
     * In the password policy that you have set, refers to whether you have required users to use at least one symbol in
     * their password.
     * </p>
     * 
     * @return In the password policy that you have set, refers to whether you have required users to use at least one
     *         symbol in their password.
     */

    public Boolean getRequireSymbols() {
        return this.requireSymbols;
    }

    /**
     * <p>
     * In the password policy that you have set, refers to whether you have required users to use at least one symbol in
     * their password.
     * </p>
     * 
     * @param requireSymbols
     *        In the password policy that you have set, refers to whether you have required users to use at least one
     *        symbol in their password.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PasswordPolicyType withRequireSymbols(Boolean requireSymbols) {
        setRequireSymbols(requireSymbols);
        return this;
    }

    /**
     * <p>
     * In the password policy that you have set, refers to whether you have required users to use at least one symbol in
     * their password.
     * </p>
     * 
     * @return In the password policy that you have set, refers to whether you have required users to use at least one
     *         symbol in their password.
     */

    public Boolean isRequireSymbols() {
        return this.requireSymbols;
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
        if (getMinimumLength() != null)
            sb.append("MinimumLength: ").append(getMinimumLength()).append(",");
        if (getRequireUppercase() != null)
            sb.append("RequireUppercase: ").append(getRequireUppercase()).append(",");
        if (getRequireLowercase() != null)
            sb.append("RequireLowercase: ").append(getRequireLowercase()).append(",");
        if (getRequireNumbers() != null)
            sb.append("RequireNumbers: ").append(getRequireNumbers()).append(",");
        if (getRequireSymbols() != null)
            sb.append("RequireSymbols: ").append(getRequireSymbols());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PasswordPolicyType == false)
            return false;
        PasswordPolicyType other = (PasswordPolicyType) obj;
        if (other.getMinimumLength() == null ^ this.getMinimumLength() == null)
            return false;
        if (other.getMinimumLength() != null && other.getMinimumLength().equals(this.getMinimumLength()) == false)
            return false;
        if (other.getRequireUppercase() == null ^ this.getRequireUppercase() == null)
            return false;
        if (other.getRequireUppercase() != null && other.getRequireUppercase().equals(this.getRequireUppercase()) == false)
            return false;
        if (other.getRequireLowercase() == null ^ this.getRequireLowercase() == null)
            return false;
        if (other.getRequireLowercase() != null && other.getRequireLowercase().equals(this.getRequireLowercase()) == false)
            return false;
        if (other.getRequireNumbers() == null ^ this.getRequireNumbers() == null)
            return false;
        if (other.getRequireNumbers() != null && other.getRequireNumbers().equals(this.getRequireNumbers()) == false)
            return false;
        if (other.getRequireSymbols() == null ^ this.getRequireSymbols() == null)
            return false;
        if (other.getRequireSymbols() != null && other.getRequireSymbols().equals(this.getRequireSymbols()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinimumLength() == null) ? 0 : getMinimumLength().hashCode());
        hashCode = prime * hashCode + ((getRequireUppercase() == null) ? 0 : getRequireUppercase().hashCode());
        hashCode = prime * hashCode + ((getRequireLowercase() == null) ? 0 : getRequireLowercase().hashCode());
        hashCode = prime * hashCode + ((getRequireNumbers() == null) ? 0 : getRequireNumbers().hashCode());
        hashCode = prime * hashCode + ((getRequireSymbols() == null) ? 0 : getRequireSymbols().hashCode());
        return hashCode;
    }

    @Override
    public PasswordPolicyType clone() {
        try {
            return (PasswordPolicyType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.PasswordPolicyTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
