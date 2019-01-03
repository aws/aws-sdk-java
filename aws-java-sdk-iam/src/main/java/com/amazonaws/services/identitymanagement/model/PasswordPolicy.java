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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains information about the account password policy.
 * </p>
 * <p>
 * This data type is used as a response element in the <a>GetAccountPasswordPolicy</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/PasswordPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PasswordPolicy implements Serializable, Cloneable {

    /**
     * <p>
     * Minimum length to require for IAM user passwords.
     * </p>
     */
    private Integer minimumPasswordLength;
    /**
     * <p>
     * Specifies whether to require symbols for IAM user passwords.
     * </p>
     */
    private Boolean requireSymbols;
    /**
     * <p>
     * Specifies whether to require numbers for IAM user passwords.
     * </p>
     */
    private Boolean requireNumbers;
    /**
     * <p>
     * Specifies whether to require uppercase characters for IAM user passwords.
     * </p>
     */
    private Boolean requireUppercaseCharacters;
    /**
     * <p>
     * Specifies whether to require lowercase characters for IAM user passwords.
     * </p>
     */
    private Boolean requireLowercaseCharacters;
    /**
     * <p>
     * Specifies whether IAM users are allowed to change their own password.
     * </p>
     */
    private Boolean allowUsersToChangePassword;
    /**
     * <p>
     * Indicates whether passwords in the account expire. Returns true if <code>MaxPasswordAge</code> contains a value
     * greater than 0. Returns false if MaxPasswordAge is 0 or not present.
     * </p>
     */
    private Boolean expirePasswords;
    /**
     * <p>
     * The number of days that an IAM user password is valid.
     * </p>
     */
    private Integer maxPasswordAge;
    /**
     * <p>
     * Specifies the number of previous passwords that IAM users are prevented from reusing.
     * </p>
     */
    private Integer passwordReusePrevention;
    /**
     * <p>
     * Specifies whether IAM users are prevented from setting a new password after their password has expired.
     * </p>
     */
    private Boolean hardExpiry;

    /**
     * <p>
     * Minimum length to require for IAM user passwords.
     * </p>
     * 
     * @param minimumPasswordLength
     *        Minimum length to require for IAM user passwords.
     */

    public void setMinimumPasswordLength(Integer minimumPasswordLength) {
        this.minimumPasswordLength = minimumPasswordLength;
    }

    /**
     * <p>
     * Minimum length to require for IAM user passwords.
     * </p>
     * 
     * @return Minimum length to require for IAM user passwords.
     */

    public Integer getMinimumPasswordLength() {
        return this.minimumPasswordLength;
    }

    /**
     * <p>
     * Minimum length to require for IAM user passwords.
     * </p>
     * 
     * @param minimumPasswordLength
     *        Minimum length to require for IAM user passwords.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PasswordPolicy withMinimumPasswordLength(Integer minimumPasswordLength) {
        setMinimumPasswordLength(minimumPasswordLength);
        return this;
    }

    /**
     * <p>
     * Specifies whether to require symbols for IAM user passwords.
     * </p>
     * 
     * @param requireSymbols
     *        Specifies whether to require symbols for IAM user passwords.
     */

    public void setRequireSymbols(Boolean requireSymbols) {
        this.requireSymbols = requireSymbols;
    }

    /**
     * <p>
     * Specifies whether to require symbols for IAM user passwords.
     * </p>
     * 
     * @return Specifies whether to require symbols for IAM user passwords.
     */

    public Boolean getRequireSymbols() {
        return this.requireSymbols;
    }

    /**
     * <p>
     * Specifies whether to require symbols for IAM user passwords.
     * </p>
     * 
     * @param requireSymbols
     *        Specifies whether to require symbols for IAM user passwords.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PasswordPolicy withRequireSymbols(Boolean requireSymbols) {
        setRequireSymbols(requireSymbols);
        return this;
    }

    /**
     * <p>
     * Specifies whether to require symbols for IAM user passwords.
     * </p>
     * 
     * @return Specifies whether to require symbols for IAM user passwords.
     */

    public Boolean isRequireSymbols() {
        return this.requireSymbols;
    }

    /**
     * <p>
     * Specifies whether to require numbers for IAM user passwords.
     * </p>
     * 
     * @param requireNumbers
     *        Specifies whether to require numbers for IAM user passwords.
     */

    public void setRequireNumbers(Boolean requireNumbers) {
        this.requireNumbers = requireNumbers;
    }

    /**
     * <p>
     * Specifies whether to require numbers for IAM user passwords.
     * </p>
     * 
     * @return Specifies whether to require numbers for IAM user passwords.
     */

    public Boolean getRequireNumbers() {
        return this.requireNumbers;
    }

    /**
     * <p>
     * Specifies whether to require numbers for IAM user passwords.
     * </p>
     * 
     * @param requireNumbers
     *        Specifies whether to require numbers for IAM user passwords.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PasswordPolicy withRequireNumbers(Boolean requireNumbers) {
        setRequireNumbers(requireNumbers);
        return this;
    }

    /**
     * <p>
     * Specifies whether to require numbers for IAM user passwords.
     * </p>
     * 
     * @return Specifies whether to require numbers for IAM user passwords.
     */

    public Boolean isRequireNumbers() {
        return this.requireNumbers;
    }

    /**
     * <p>
     * Specifies whether to require uppercase characters for IAM user passwords.
     * </p>
     * 
     * @param requireUppercaseCharacters
     *        Specifies whether to require uppercase characters for IAM user passwords.
     */

    public void setRequireUppercaseCharacters(Boolean requireUppercaseCharacters) {
        this.requireUppercaseCharacters = requireUppercaseCharacters;
    }

    /**
     * <p>
     * Specifies whether to require uppercase characters for IAM user passwords.
     * </p>
     * 
     * @return Specifies whether to require uppercase characters for IAM user passwords.
     */

    public Boolean getRequireUppercaseCharacters() {
        return this.requireUppercaseCharacters;
    }

    /**
     * <p>
     * Specifies whether to require uppercase characters for IAM user passwords.
     * </p>
     * 
     * @param requireUppercaseCharacters
     *        Specifies whether to require uppercase characters for IAM user passwords.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PasswordPolicy withRequireUppercaseCharacters(Boolean requireUppercaseCharacters) {
        setRequireUppercaseCharacters(requireUppercaseCharacters);
        return this;
    }

    /**
     * <p>
     * Specifies whether to require uppercase characters for IAM user passwords.
     * </p>
     * 
     * @return Specifies whether to require uppercase characters for IAM user passwords.
     */

    public Boolean isRequireUppercaseCharacters() {
        return this.requireUppercaseCharacters;
    }

    /**
     * <p>
     * Specifies whether to require lowercase characters for IAM user passwords.
     * </p>
     * 
     * @param requireLowercaseCharacters
     *        Specifies whether to require lowercase characters for IAM user passwords.
     */

    public void setRequireLowercaseCharacters(Boolean requireLowercaseCharacters) {
        this.requireLowercaseCharacters = requireLowercaseCharacters;
    }

    /**
     * <p>
     * Specifies whether to require lowercase characters for IAM user passwords.
     * </p>
     * 
     * @return Specifies whether to require lowercase characters for IAM user passwords.
     */

    public Boolean getRequireLowercaseCharacters() {
        return this.requireLowercaseCharacters;
    }

    /**
     * <p>
     * Specifies whether to require lowercase characters for IAM user passwords.
     * </p>
     * 
     * @param requireLowercaseCharacters
     *        Specifies whether to require lowercase characters for IAM user passwords.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PasswordPolicy withRequireLowercaseCharacters(Boolean requireLowercaseCharacters) {
        setRequireLowercaseCharacters(requireLowercaseCharacters);
        return this;
    }

    /**
     * <p>
     * Specifies whether to require lowercase characters for IAM user passwords.
     * </p>
     * 
     * @return Specifies whether to require lowercase characters for IAM user passwords.
     */

    public Boolean isRequireLowercaseCharacters() {
        return this.requireLowercaseCharacters;
    }

    /**
     * <p>
     * Specifies whether IAM users are allowed to change their own password.
     * </p>
     * 
     * @param allowUsersToChangePassword
     *        Specifies whether IAM users are allowed to change their own password.
     */

    public void setAllowUsersToChangePassword(Boolean allowUsersToChangePassword) {
        this.allowUsersToChangePassword = allowUsersToChangePassword;
    }

    /**
     * <p>
     * Specifies whether IAM users are allowed to change their own password.
     * </p>
     * 
     * @return Specifies whether IAM users are allowed to change their own password.
     */

    public Boolean getAllowUsersToChangePassword() {
        return this.allowUsersToChangePassword;
    }

    /**
     * <p>
     * Specifies whether IAM users are allowed to change their own password.
     * </p>
     * 
     * @param allowUsersToChangePassword
     *        Specifies whether IAM users are allowed to change their own password.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PasswordPolicy withAllowUsersToChangePassword(Boolean allowUsersToChangePassword) {
        setAllowUsersToChangePassword(allowUsersToChangePassword);
        return this;
    }

    /**
     * <p>
     * Specifies whether IAM users are allowed to change their own password.
     * </p>
     * 
     * @return Specifies whether IAM users are allowed to change their own password.
     */

    public Boolean isAllowUsersToChangePassword() {
        return this.allowUsersToChangePassword;
    }

    /**
     * <p>
     * Indicates whether passwords in the account expire. Returns true if <code>MaxPasswordAge</code> contains a value
     * greater than 0. Returns false if MaxPasswordAge is 0 or not present.
     * </p>
     * 
     * @param expirePasswords
     *        Indicates whether passwords in the account expire. Returns true if <code>MaxPasswordAge</code> contains a
     *        value greater than 0. Returns false if MaxPasswordAge is 0 or not present.
     */

    public void setExpirePasswords(Boolean expirePasswords) {
        this.expirePasswords = expirePasswords;
    }

    /**
     * <p>
     * Indicates whether passwords in the account expire. Returns true if <code>MaxPasswordAge</code> contains a value
     * greater than 0. Returns false if MaxPasswordAge is 0 or not present.
     * </p>
     * 
     * @return Indicates whether passwords in the account expire. Returns true if <code>MaxPasswordAge</code> contains a
     *         value greater than 0. Returns false if MaxPasswordAge is 0 or not present.
     */

    public Boolean getExpirePasswords() {
        return this.expirePasswords;
    }

    /**
     * <p>
     * Indicates whether passwords in the account expire. Returns true if <code>MaxPasswordAge</code> contains a value
     * greater than 0. Returns false if MaxPasswordAge is 0 or not present.
     * </p>
     * 
     * @param expirePasswords
     *        Indicates whether passwords in the account expire. Returns true if <code>MaxPasswordAge</code> contains a
     *        value greater than 0. Returns false if MaxPasswordAge is 0 or not present.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PasswordPolicy withExpirePasswords(Boolean expirePasswords) {
        setExpirePasswords(expirePasswords);
        return this;
    }

    /**
     * <p>
     * Indicates whether passwords in the account expire. Returns true if <code>MaxPasswordAge</code> contains a value
     * greater than 0. Returns false if MaxPasswordAge is 0 or not present.
     * </p>
     * 
     * @return Indicates whether passwords in the account expire. Returns true if <code>MaxPasswordAge</code> contains a
     *         value greater than 0. Returns false if MaxPasswordAge is 0 or not present.
     */

    public Boolean isExpirePasswords() {
        return this.expirePasswords;
    }

    /**
     * <p>
     * The number of days that an IAM user password is valid.
     * </p>
     * 
     * @param maxPasswordAge
     *        The number of days that an IAM user password is valid.
     */

    public void setMaxPasswordAge(Integer maxPasswordAge) {
        this.maxPasswordAge = maxPasswordAge;
    }

    /**
     * <p>
     * The number of days that an IAM user password is valid.
     * </p>
     * 
     * @return The number of days that an IAM user password is valid.
     */

    public Integer getMaxPasswordAge() {
        return this.maxPasswordAge;
    }

    /**
     * <p>
     * The number of days that an IAM user password is valid.
     * </p>
     * 
     * @param maxPasswordAge
     *        The number of days that an IAM user password is valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PasswordPolicy withMaxPasswordAge(Integer maxPasswordAge) {
        setMaxPasswordAge(maxPasswordAge);
        return this;
    }

    /**
     * <p>
     * Specifies the number of previous passwords that IAM users are prevented from reusing.
     * </p>
     * 
     * @param passwordReusePrevention
     *        Specifies the number of previous passwords that IAM users are prevented from reusing.
     */

    public void setPasswordReusePrevention(Integer passwordReusePrevention) {
        this.passwordReusePrevention = passwordReusePrevention;
    }

    /**
     * <p>
     * Specifies the number of previous passwords that IAM users are prevented from reusing.
     * </p>
     * 
     * @return Specifies the number of previous passwords that IAM users are prevented from reusing.
     */

    public Integer getPasswordReusePrevention() {
        return this.passwordReusePrevention;
    }

    /**
     * <p>
     * Specifies the number of previous passwords that IAM users are prevented from reusing.
     * </p>
     * 
     * @param passwordReusePrevention
     *        Specifies the number of previous passwords that IAM users are prevented from reusing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PasswordPolicy withPasswordReusePrevention(Integer passwordReusePrevention) {
        setPasswordReusePrevention(passwordReusePrevention);
        return this;
    }

    /**
     * <p>
     * Specifies whether IAM users are prevented from setting a new password after their password has expired.
     * </p>
     * 
     * @param hardExpiry
     *        Specifies whether IAM users are prevented from setting a new password after their password has expired.
     */

    public void setHardExpiry(Boolean hardExpiry) {
        this.hardExpiry = hardExpiry;
    }

    /**
     * <p>
     * Specifies whether IAM users are prevented from setting a new password after their password has expired.
     * </p>
     * 
     * @return Specifies whether IAM users are prevented from setting a new password after their password has expired.
     */

    public Boolean getHardExpiry() {
        return this.hardExpiry;
    }

    /**
     * <p>
     * Specifies whether IAM users are prevented from setting a new password after their password has expired.
     * </p>
     * 
     * @param hardExpiry
     *        Specifies whether IAM users are prevented from setting a new password after their password has expired.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PasswordPolicy withHardExpiry(Boolean hardExpiry) {
        setHardExpiry(hardExpiry);
        return this;
    }

    /**
     * <p>
     * Specifies whether IAM users are prevented from setting a new password after their password has expired.
     * </p>
     * 
     * @return Specifies whether IAM users are prevented from setting a new password after their password has expired.
     */

    public Boolean isHardExpiry() {
        return this.hardExpiry;
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
        if (getMinimumPasswordLength() != null)
            sb.append("MinimumPasswordLength: ").append(getMinimumPasswordLength()).append(",");
        if (getRequireSymbols() != null)
            sb.append("RequireSymbols: ").append(getRequireSymbols()).append(",");
        if (getRequireNumbers() != null)
            sb.append("RequireNumbers: ").append(getRequireNumbers()).append(",");
        if (getRequireUppercaseCharacters() != null)
            sb.append("RequireUppercaseCharacters: ").append(getRequireUppercaseCharacters()).append(",");
        if (getRequireLowercaseCharacters() != null)
            sb.append("RequireLowercaseCharacters: ").append(getRequireLowercaseCharacters()).append(",");
        if (getAllowUsersToChangePassword() != null)
            sb.append("AllowUsersToChangePassword: ").append(getAllowUsersToChangePassword()).append(",");
        if (getExpirePasswords() != null)
            sb.append("ExpirePasswords: ").append(getExpirePasswords()).append(",");
        if (getMaxPasswordAge() != null)
            sb.append("MaxPasswordAge: ").append(getMaxPasswordAge()).append(",");
        if (getPasswordReusePrevention() != null)
            sb.append("PasswordReusePrevention: ").append(getPasswordReusePrevention()).append(",");
        if (getHardExpiry() != null)
            sb.append("HardExpiry: ").append(getHardExpiry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PasswordPolicy == false)
            return false;
        PasswordPolicy other = (PasswordPolicy) obj;
        if (other.getMinimumPasswordLength() == null ^ this.getMinimumPasswordLength() == null)
            return false;
        if (other.getMinimumPasswordLength() != null && other.getMinimumPasswordLength().equals(this.getMinimumPasswordLength()) == false)
            return false;
        if (other.getRequireSymbols() == null ^ this.getRequireSymbols() == null)
            return false;
        if (other.getRequireSymbols() != null && other.getRequireSymbols().equals(this.getRequireSymbols()) == false)
            return false;
        if (other.getRequireNumbers() == null ^ this.getRequireNumbers() == null)
            return false;
        if (other.getRequireNumbers() != null && other.getRequireNumbers().equals(this.getRequireNumbers()) == false)
            return false;
        if (other.getRequireUppercaseCharacters() == null ^ this.getRequireUppercaseCharacters() == null)
            return false;
        if (other.getRequireUppercaseCharacters() != null && other.getRequireUppercaseCharacters().equals(this.getRequireUppercaseCharacters()) == false)
            return false;
        if (other.getRequireLowercaseCharacters() == null ^ this.getRequireLowercaseCharacters() == null)
            return false;
        if (other.getRequireLowercaseCharacters() != null && other.getRequireLowercaseCharacters().equals(this.getRequireLowercaseCharacters()) == false)
            return false;
        if (other.getAllowUsersToChangePassword() == null ^ this.getAllowUsersToChangePassword() == null)
            return false;
        if (other.getAllowUsersToChangePassword() != null && other.getAllowUsersToChangePassword().equals(this.getAllowUsersToChangePassword()) == false)
            return false;
        if (other.getExpirePasswords() == null ^ this.getExpirePasswords() == null)
            return false;
        if (other.getExpirePasswords() != null && other.getExpirePasswords().equals(this.getExpirePasswords()) == false)
            return false;
        if (other.getMaxPasswordAge() == null ^ this.getMaxPasswordAge() == null)
            return false;
        if (other.getMaxPasswordAge() != null && other.getMaxPasswordAge().equals(this.getMaxPasswordAge()) == false)
            return false;
        if (other.getPasswordReusePrevention() == null ^ this.getPasswordReusePrevention() == null)
            return false;
        if (other.getPasswordReusePrevention() != null && other.getPasswordReusePrevention().equals(this.getPasswordReusePrevention()) == false)
            return false;
        if (other.getHardExpiry() == null ^ this.getHardExpiry() == null)
            return false;
        if (other.getHardExpiry() != null && other.getHardExpiry().equals(this.getHardExpiry()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinimumPasswordLength() == null) ? 0 : getMinimumPasswordLength().hashCode());
        hashCode = prime * hashCode + ((getRequireSymbols() == null) ? 0 : getRequireSymbols().hashCode());
        hashCode = prime * hashCode + ((getRequireNumbers() == null) ? 0 : getRequireNumbers().hashCode());
        hashCode = prime * hashCode + ((getRequireUppercaseCharacters() == null) ? 0 : getRequireUppercaseCharacters().hashCode());
        hashCode = prime * hashCode + ((getRequireLowercaseCharacters() == null) ? 0 : getRequireLowercaseCharacters().hashCode());
        hashCode = prime * hashCode + ((getAllowUsersToChangePassword() == null) ? 0 : getAllowUsersToChangePassword().hashCode());
        hashCode = prime * hashCode + ((getExpirePasswords() == null) ? 0 : getExpirePasswords().hashCode());
        hashCode = prime * hashCode + ((getMaxPasswordAge() == null) ? 0 : getMaxPasswordAge().hashCode());
        hashCode = prime * hashCode + ((getPasswordReusePrevention() == null) ? 0 : getPasswordReusePrevention().hashCode());
        hashCode = prime * hashCode + ((getHardExpiry() == null) ? 0 : getHardExpiry().hashCode());
        return hashCode;
    }

    @Override
    public PasswordPolicy clone() {
        try {
            return (PasswordPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
