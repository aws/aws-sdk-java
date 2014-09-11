/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

/**
 * <p>
 * The PasswordPolicy data type contains information about the account
 * password policy.
 * </p>
 * <p>
 * This data type is used as a response element in the action
 * GetAccountPasswordPolicy.
 * </p>
 */
public class PasswordPolicy implements Serializable {

    /**
     * Minimum length to require for IAM user passwords.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>6 - 128<br/>
     */
    private Integer minimumPasswordLength;

    /**
     * Specifies whether to require symbols for IAM user passwords.
     */
    private Boolean requireSymbols;

    /**
     * Specifies whether to require numbers for IAM user passwords.
     */
    private Boolean requireNumbers;

    /**
     * Specifies whether to require uppercase characters for IAM user
     * passwords.
     */
    private Boolean requireUppercaseCharacters;

    /**
     * Specifies whether to require lowercase characters for IAM user
     * passwords.
     */
    private Boolean requireLowercaseCharacters;

    /**
     * Specifies whether IAM users are allowed to change their own password.
     */
    private Boolean allowUsersToChangePassword;

    /**
     * Specifies whether IAM users are required to change their password
     * after a specified number of days.
     */
    private Boolean expirePasswords;

    /**
     * The number of days that an IAM user password is valid.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1095<br/>
     */
    private Integer maxPasswordAge;

    /**
     * Specifies the number of previous passwords that IAM users are
     * prevented from reusing.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     */
    private Integer passwordReusePrevention;

    /**
     * Specifies whether IAM users are prevented from setting a new password
     * after their password has expired.
     */
    private Boolean hardExpiry;

    /**
     * Minimum length to require for IAM user passwords.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>6 - 128<br/>
     *
     * @return Minimum length to require for IAM user passwords.
     */
    public Integer getMinimumPasswordLength() {
        return minimumPasswordLength;
    }
    
    /**
     * Minimum length to require for IAM user passwords.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>6 - 128<br/>
     *
     * @param minimumPasswordLength Minimum length to require for IAM user passwords.
     */
    public void setMinimumPasswordLength(Integer minimumPasswordLength) {
        this.minimumPasswordLength = minimumPasswordLength;
    }
    
    /**
     * Minimum length to require for IAM user passwords.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>6 - 128<br/>
     *
     * @param minimumPasswordLength Minimum length to require for IAM user passwords.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PasswordPolicy withMinimumPasswordLength(Integer minimumPasswordLength) {
        this.minimumPasswordLength = minimumPasswordLength;
        return this;
    }

    /**
     * Specifies whether to require symbols for IAM user passwords.
     *
     * @return Specifies whether to require symbols for IAM user passwords.
     */
    public Boolean isRequireSymbols() {
        return requireSymbols;
    }
    
    /**
     * Specifies whether to require symbols for IAM user passwords.
     *
     * @param requireSymbols Specifies whether to require symbols for IAM user passwords.
     */
    public void setRequireSymbols(Boolean requireSymbols) {
        this.requireSymbols = requireSymbols;
    }
    
    /**
     * Specifies whether to require symbols for IAM user passwords.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requireSymbols Specifies whether to require symbols for IAM user passwords.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PasswordPolicy withRequireSymbols(Boolean requireSymbols) {
        this.requireSymbols = requireSymbols;
        return this;
    }

    /**
     * Specifies whether to require symbols for IAM user passwords.
     *
     * @return Specifies whether to require symbols for IAM user passwords.
     */
    public Boolean getRequireSymbols() {
        return requireSymbols;
    }

    /**
     * Specifies whether to require numbers for IAM user passwords.
     *
     * @return Specifies whether to require numbers for IAM user passwords.
     */
    public Boolean isRequireNumbers() {
        return requireNumbers;
    }
    
    /**
     * Specifies whether to require numbers for IAM user passwords.
     *
     * @param requireNumbers Specifies whether to require numbers for IAM user passwords.
     */
    public void setRequireNumbers(Boolean requireNumbers) {
        this.requireNumbers = requireNumbers;
    }
    
    /**
     * Specifies whether to require numbers for IAM user passwords.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requireNumbers Specifies whether to require numbers for IAM user passwords.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PasswordPolicy withRequireNumbers(Boolean requireNumbers) {
        this.requireNumbers = requireNumbers;
        return this;
    }

    /**
     * Specifies whether to require numbers for IAM user passwords.
     *
     * @return Specifies whether to require numbers for IAM user passwords.
     */
    public Boolean getRequireNumbers() {
        return requireNumbers;
    }

    /**
     * Specifies whether to require uppercase characters for IAM user
     * passwords.
     *
     * @return Specifies whether to require uppercase characters for IAM user
     *         passwords.
     */
    public Boolean isRequireUppercaseCharacters() {
        return requireUppercaseCharacters;
    }
    
    /**
     * Specifies whether to require uppercase characters for IAM user
     * passwords.
     *
     * @param requireUppercaseCharacters Specifies whether to require uppercase characters for IAM user
     *         passwords.
     */
    public void setRequireUppercaseCharacters(Boolean requireUppercaseCharacters) {
        this.requireUppercaseCharacters = requireUppercaseCharacters;
    }
    
    /**
     * Specifies whether to require uppercase characters for IAM user
     * passwords.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requireUppercaseCharacters Specifies whether to require uppercase characters for IAM user
     *         passwords.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PasswordPolicy withRequireUppercaseCharacters(Boolean requireUppercaseCharacters) {
        this.requireUppercaseCharacters = requireUppercaseCharacters;
        return this;
    }

    /**
     * Specifies whether to require uppercase characters for IAM user
     * passwords.
     *
     * @return Specifies whether to require uppercase characters for IAM user
     *         passwords.
     */
    public Boolean getRequireUppercaseCharacters() {
        return requireUppercaseCharacters;
    }

    /**
     * Specifies whether to require lowercase characters for IAM user
     * passwords.
     *
     * @return Specifies whether to require lowercase characters for IAM user
     *         passwords.
     */
    public Boolean isRequireLowercaseCharacters() {
        return requireLowercaseCharacters;
    }
    
    /**
     * Specifies whether to require lowercase characters for IAM user
     * passwords.
     *
     * @param requireLowercaseCharacters Specifies whether to require lowercase characters for IAM user
     *         passwords.
     */
    public void setRequireLowercaseCharacters(Boolean requireLowercaseCharacters) {
        this.requireLowercaseCharacters = requireLowercaseCharacters;
    }
    
    /**
     * Specifies whether to require lowercase characters for IAM user
     * passwords.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requireLowercaseCharacters Specifies whether to require lowercase characters for IAM user
     *         passwords.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PasswordPolicy withRequireLowercaseCharacters(Boolean requireLowercaseCharacters) {
        this.requireLowercaseCharacters = requireLowercaseCharacters;
        return this;
    }

    /**
     * Specifies whether to require lowercase characters for IAM user
     * passwords.
     *
     * @return Specifies whether to require lowercase characters for IAM user
     *         passwords.
     */
    public Boolean getRequireLowercaseCharacters() {
        return requireLowercaseCharacters;
    }

    /**
     * Specifies whether IAM users are allowed to change their own password.
     *
     * @return Specifies whether IAM users are allowed to change their own password.
     */
    public Boolean isAllowUsersToChangePassword() {
        return allowUsersToChangePassword;
    }
    
    /**
     * Specifies whether IAM users are allowed to change their own password.
     *
     * @param allowUsersToChangePassword Specifies whether IAM users are allowed to change their own password.
     */
    public void setAllowUsersToChangePassword(Boolean allowUsersToChangePassword) {
        this.allowUsersToChangePassword = allowUsersToChangePassword;
    }
    
    /**
     * Specifies whether IAM users are allowed to change their own password.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allowUsersToChangePassword Specifies whether IAM users are allowed to change their own password.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PasswordPolicy withAllowUsersToChangePassword(Boolean allowUsersToChangePassword) {
        this.allowUsersToChangePassword = allowUsersToChangePassword;
        return this;
    }

    /**
     * Specifies whether IAM users are allowed to change their own password.
     *
     * @return Specifies whether IAM users are allowed to change their own password.
     */
    public Boolean getAllowUsersToChangePassword() {
        return allowUsersToChangePassword;
    }

    /**
     * Specifies whether IAM users are required to change their password
     * after a specified number of days.
     *
     * @return Specifies whether IAM users are required to change their password
     *         after a specified number of days.
     */
    public Boolean isExpirePasswords() {
        return expirePasswords;
    }
    
    /**
     * Specifies whether IAM users are required to change their password
     * after a specified number of days.
     *
     * @param expirePasswords Specifies whether IAM users are required to change their password
     *         after a specified number of days.
     */
    public void setExpirePasswords(Boolean expirePasswords) {
        this.expirePasswords = expirePasswords;
    }
    
    /**
     * Specifies whether IAM users are required to change their password
     * after a specified number of days.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param expirePasswords Specifies whether IAM users are required to change their password
     *         after a specified number of days.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PasswordPolicy withExpirePasswords(Boolean expirePasswords) {
        this.expirePasswords = expirePasswords;
        return this;
    }

    /**
     * Specifies whether IAM users are required to change their password
     * after a specified number of days.
     *
     * @return Specifies whether IAM users are required to change their password
     *         after a specified number of days.
     */
    public Boolean getExpirePasswords() {
        return expirePasswords;
    }

    /**
     * The number of days that an IAM user password is valid.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1095<br/>
     *
     * @return The number of days that an IAM user password is valid.
     */
    public Integer getMaxPasswordAge() {
        return maxPasswordAge;
    }
    
    /**
     * The number of days that an IAM user password is valid.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1095<br/>
     *
     * @param maxPasswordAge The number of days that an IAM user password is valid.
     */
    public void setMaxPasswordAge(Integer maxPasswordAge) {
        this.maxPasswordAge = maxPasswordAge;
    }
    
    /**
     * The number of days that an IAM user password is valid.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1095<br/>
     *
     * @param maxPasswordAge The number of days that an IAM user password is valid.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PasswordPolicy withMaxPasswordAge(Integer maxPasswordAge) {
        this.maxPasswordAge = maxPasswordAge;
        return this;
    }

    /**
     * Specifies the number of previous passwords that IAM users are
     * prevented from reusing.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     *
     * @return Specifies the number of previous passwords that IAM users are
     *         prevented from reusing.
     */
    public Integer getPasswordReusePrevention() {
        return passwordReusePrevention;
    }
    
    /**
     * Specifies the number of previous passwords that IAM users are
     * prevented from reusing.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     *
     * @param passwordReusePrevention Specifies the number of previous passwords that IAM users are
     *         prevented from reusing.
     */
    public void setPasswordReusePrevention(Integer passwordReusePrevention) {
        this.passwordReusePrevention = passwordReusePrevention;
    }
    
    /**
     * Specifies the number of previous passwords that IAM users are
     * prevented from reusing.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 24<br/>
     *
     * @param passwordReusePrevention Specifies the number of previous passwords that IAM users are
     *         prevented from reusing.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PasswordPolicy withPasswordReusePrevention(Integer passwordReusePrevention) {
        this.passwordReusePrevention = passwordReusePrevention;
        return this;
    }

    /**
     * Specifies whether IAM users are prevented from setting a new password
     * after their password has expired.
     *
     * @return Specifies whether IAM users are prevented from setting a new password
     *         after their password has expired.
     */
    public Boolean isHardExpiry() {
        return hardExpiry;
    }
    
    /**
     * Specifies whether IAM users are prevented from setting a new password
     * after their password has expired.
     *
     * @param hardExpiry Specifies whether IAM users are prevented from setting a new password
     *         after their password has expired.
     */
    public void setHardExpiry(Boolean hardExpiry) {
        this.hardExpiry = hardExpiry;
    }
    
    /**
     * Specifies whether IAM users are prevented from setting a new password
     * after their password has expired.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hardExpiry Specifies whether IAM users are prevented from setting a new password
     *         after their password has expired.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PasswordPolicy withHardExpiry(Boolean hardExpiry) {
        this.hardExpiry = hardExpiry;
        return this;
    }

    /**
     * Specifies whether IAM users are prevented from setting a new password
     * after their password has expired.
     *
     * @return Specifies whether IAM users are prevented from setting a new password
     *         after their password has expired.
     */
    public Boolean getHardExpiry() {
        return hardExpiry;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMinimumPasswordLength() != null) sb.append("MinimumPasswordLength: " + getMinimumPasswordLength() + ",");
        if (isRequireSymbols() != null) sb.append("RequireSymbols: " + isRequireSymbols() + ",");
        if (isRequireNumbers() != null) sb.append("RequireNumbers: " + isRequireNumbers() + ",");
        if (isRequireUppercaseCharacters() != null) sb.append("RequireUppercaseCharacters: " + isRequireUppercaseCharacters() + ",");
        if (isRequireLowercaseCharacters() != null) sb.append("RequireLowercaseCharacters: " + isRequireLowercaseCharacters() + ",");
        if (isAllowUsersToChangePassword() != null) sb.append("AllowUsersToChangePassword: " + isAllowUsersToChangePassword() + ",");
        if (isExpirePasswords() != null) sb.append("ExpirePasswords: " + isExpirePasswords() + ",");
        if (getMaxPasswordAge() != null) sb.append("MaxPasswordAge: " + getMaxPasswordAge() + ",");
        if (getPasswordReusePrevention() != null) sb.append("PasswordReusePrevention: " + getPasswordReusePrevention() + ",");
        if (isHardExpiry() != null) sb.append("HardExpiry: " + isHardExpiry() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMinimumPasswordLength() == null) ? 0 : getMinimumPasswordLength().hashCode()); 
        hashCode = prime * hashCode + ((isRequireSymbols() == null) ? 0 : isRequireSymbols().hashCode()); 
        hashCode = prime * hashCode + ((isRequireNumbers() == null) ? 0 : isRequireNumbers().hashCode()); 
        hashCode = prime * hashCode + ((isRequireUppercaseCharacters() == null) ? 0 : isRequireUppercaseCharacters().hashCode()); 
        hashCode = prime * hashCode + ((isRequireLowercaseCharacters() == null) ? 0 : isRequireLowercaseCharacters().hashCode()); 
        hashCode = prime * hashCode + ((isAllowUsersToChangePassword() == null) ? 0 : isAllowUsersToChangePassword().hashCode()); 
        hashCode = prime * hashCode + ((isExpirePasswords() == null) ? 0 : isExpirePasswords().hashCode()); 
        hashCode = prime * hashCode + ((getMaxPasswordAge() == null) ? 0 : getMaxPasswordAge().hashCode()); 
        hashCode = prime * hashCode + ((getPasswordReusePrevention() == null) ? 0 : getPasswordReusePrevention().hashCode()); 
        hashCode = prime * hashCode + ((isHardExpiry() == null) ? 0 : isHardExpiry().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PasswordPolicy == false) return false;
        PasswordPolicy other = (PasswordPolicy)obj;
        
        if (other.getMinimumPasswordLength() == null ^ this.getMinimumPasswordLength() == null) return false;
        if (other.getMinimumPasswordLength() != null && other.getMinimumPasswordLength().equals(this.getMinimumPasswordLength()) == false) return false; 
        if (other.isRequireSymbols() == null ^ this.isRequireSymbols() == null) return false;
        if (other.isRequireSymbols() != null && other.isRequireSymbols().equals(this.isRequireSymbols()) == false) return false; 
        if (other.isRequireNumbers() == null ^ this.isRequireNumbers() == null) return false;
        if (other.isRequireNumbers() != null && other.isRequireNumbers().equals(this.isRequireNumbers()) == false) return false; 
        if (other.isRequireUppercaseCharacters() == null ^ this.isRequireUppercaseCharacters() == null) return false;
        if (other.isRequireUppercaseCharacters() != null && other.isRequireUppercaseCharacters().equals(this.isRequireUppercaseCharacters()) == false) return false; 
        if (other.isRequireLowercaseCharacters() == null ^ this.isRequireLowercaseCharacters() == null) return false;
        if (other.isRequireLowercaseCharacters() != null && other.isRequireLowercaseCharacters().equals(this.isRequireLowercaseCharacters()) == false) return false; 
        if (other.isAllowUsersToChangePassword() == null ^ this.isAllowUsersToChangePassword() == null) return false;
        if (other.isAllowUsersToChangePassword() != null && other.isAllowUsersToChangePassword().equals(this.isAllowUsersToChangePassword()) == false) return false; 
        if (other.isExpirePasswords() == null ^ this.isExpirePasswords() == null) return false;
        if (other.isExpirePasswords() != null && other.isExpirePasswords().equals(this.isExpirePasswords()) == false) return false; 
        if (other.getMaxPasswordAge() == null ^ this.getMaxPasswordAge() == null) return false;
        if (other.getMaxPasswordAge() != null && other.getMaxPasswordAge().equals(this.getMaxPasswordAge()) == false) return false; 
        if (other.getPasswordReusePrevention() == null ^ this.getPasswordReusePrevention() == null) return false;
        if (other.getPasswordReusePrevention() != null && other.getPasswordReusePrevention().equals(this.getPasswordReusePrevention()) == false) return false; 
        if (other.isHardExpiry() == null ^ this.isHardExpiry() == null) return false;
        if (other.isHardExpiry() != null && other.isHardExpiry().equals(this.isHardExpiry()) == false) return false; 
        return true;
    }
    
}
    