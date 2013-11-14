/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The PasswordPolicy data type contains information about the account password policy.
 * </p>
 * <p>
 * This data type is used as a response element in the action GetAccountPasswordPolicy.
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
     * Specifies whether to allow IAM users to change their own password.
     */
    private Boolean allowUsersToChangePassword;

    private Boolean expirePasswords;

    private Integer maxPasswordAge;

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
     * Specifies whether to allow IAM users to change their own password.
     *
     * @return Specifies whether to allow IAM users to change their own password.
     */
    public Boolean isAllowUsersToChangePassword() {
        return allowUsersToChangePassword;
    }
    
    /**
     * Specifies whether to allow IAM users to change their own password.
     *
     * @param allowUsersToChangePassword Specifies whether to allow IAM users to change their own password.
     */
    public void setAllowUsersToChangePassword(Boolean allowUsersToChangePassword) {
        this.allowUsersToChangePassword = allowUsersToChangePassword;
    }
    
    /**
     * Specifies whether to allow IAM users to change their own password.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allowUsersToChangePassword Specifies whether to allow IAM users to change their own password.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PasswordPolicy withAllowUsersToChangePassword(Boolean allowUsersToChangePassword) {
        this.allowUsersToChangePassword = allowUsersToChangePassword;
        return this;
    }

    /**
     * Specifies whether to allow IAM users to change their own password.
     *
     * @return Specifies whether to allow IAM users to change their own password.
     */
    public Boolean getAllowUsersToChangePassword() {
        return allowUsersToChangePassword;
    }

    /**
     * Returns the value of the ExpirePasswords property for this object.
     *
     * @return The value of the ExpirePasswords property for this object.
     */
    public Boolean isExpirePasswords() {
        return expirePasswords;
    }
    
    /**
     * Sets the value of the ExpirePasswords property for this object.
     *
     * @param expirePasswords The new value for the ExpirePasswords property for this object.
     */
    public void setExpirePasswords(Boolean expirePasswords) {
        this.expirePasswords = expirePasswords;
    }
    
    /**
     * Sets the value of the ExpirePasswords property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param expirePasswords The new value for the ExpirePasswords property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PasswordPolicy withExpirePasswords(Boolean expirePasswords) {
        this.expirePasswords = expirePasswords;
        return this;
    }

    /**
     * Returns the value of the ExpirePasswords property for this object.
     *
     * @return The value of the ExpirePasswords property for this object.
     */
    public Boolean getExpirePasswords() {
        return expirePasswords;
    }

    /**
     * Returns the value of the MaxPasswordAge property for this object.
     *
     * @return The value of the MaxPasswordAge property for this object.
     */
    public Integer getMaxPasswordAge() {
        return maxPasswordAge;
    }
    
    /**
     * Sets the value of the MaxPasswordAge property for this object.
     *
     * @param maxPasswordAge The new value for the MaxPasswordAge property for this object.
     */
    public void setMaxPasswordAge(Integer maxPasswordAge) {
        this.maxPasswordAge = maxPasswordAge;
    }
    
    /**
     * Sets the value of the MaxPasswordAge property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxPasswordAge The new value for the MaxPasswordAge property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PasswordPolicy withMaxPasswordAge(Integer maxPasswordAge) {
        this.maxPasswordAge = maxPasswordAge;
        return this;
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
        if (getMaxPasswordAge() != null) sb.append("MaxPasswordAge: " + getMaxPasswordAge() );
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
        return true;
    }
    
}
    