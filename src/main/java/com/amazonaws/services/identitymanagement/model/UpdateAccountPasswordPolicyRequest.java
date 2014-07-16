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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#updateAccountPasswordPolicy(UpdateAccountPasswordPolicyRequest) UpdateAccountPasswordPolicy operation}.
 * <p>
 * Updates the password policy settings for the account. For more
 * information about using a password policy, see
 * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingPasswordPolicies.html"> Managing an IAM Password Policy </a>
 * in the <i>Using IAM</i> guide.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#updateAccountPasswordPolicy(UpdateAccountPasswordPolicyRequest)
 */
public class UpdateAccountPasswordPolicyRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The minimum number of characters allowed in an IAM user password.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>6 - 128<br/>
     */
    private Integer minimumPasswordLength;

    /**
     * Specifies whether IAM user passwords must contain at least one of the
     * following non-alphanumeric characters: ! @ # $ % ^ & * ( ) _ + - = [ ]
     * { } | '
     */
    private Boolean requireSymbols;

    /**
     * Specifies whether IAM user passwords must contain at least one numeric
     * character (0 to 9).
     */
    private Boolean requireNumbers;

    /**
     * Specifies whether IAM user passwords must contain at least one
     * uppercase character from the ISO basic Latin alphabet (A to Z).
     */
    private Boolean requireUppercaseCharacters;

    /**
     * Specifies whether IAM user passwords must contain at least one
     * lowercase character from the ISO basic Latin alphabet (a to z).
     */
    private Boolean requireLowercaseCharacters;

    /**
     * Allows all IAM users in your account to use the AWS Management Console
     * to change their own passwords. For more information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html">Letting
     * IAM Users Change Their Own Passwords</a> in the <i>Using IAM</i>
     * guide.
     */
    private Boolean allowUsersToChangePassword;

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
     * Prevents IAM users from setting a new password after their password
     * has expired.
     */
    private Boolean hardExpiry;

    /**
     * The minimum number of characters allowed in an IAM user password.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>6 - 128<br/>
     *
     * @return The minimum number of characters allowed in an IAM user password.
     */
    public Integer getMinimumPasswordLength() {
        return minimumPasswordLength;
    }
    
    /**
     * The minimum number of characters allowed in an IAM user password.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>6 - 128<br/>
     *
     * @param minimumPasswordLength The minimum number of characters allowed in an IAM user password.
     */
    public void setMinimumPasswordLength(Integer minimumPasswordLength) {
        this.minimumPasswordLength = minimumPasswordLength;
    }
    
    /**
     * The minimum number of characters allowed in an IAM user password.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>6 - 128<br/>
     *
     * @param minimumPasswordLength The minimum number of characters allowed in an IAM user password.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateAccountPasswordPolicyRequest withMinimumPasswordLength(Integer minimumPasswordLength) {
        this.minimumPasswordLength = minimumPasswordLength;
        return this;
    }

    /**
     * Specifies whether IAM user passwords must contain at least one of the
     * following non-alphanumeric characters: ! @ # $ % ^ & * ( ) _ + - = [ ]
     * { } | '
     *
     * @return Specifies whether IAM user passwords must contain at least one of the
     *         following non-alphanumeric characters: ! @ # $ % ^ & * ( ) _ + - = [ ]
     *         { } | '
     */
    public Boolean isRequireSymbols() {
        return requireSymbols;
    }
    
    /**
     * Specifies whether IAM user passwords must contain at least one of the
     * following non-alphanumeric characters: ! @ # $ % ^ & * ( ) _ + - = [ ]
     * { } | '
     *
     * @param requireSymbols Specifies whether IAM user passwords must contain at least one of the
     *         following non-alphanumeric characters: ! @ # $ % ^ & * ( ) _ + - = [ ]
     *         { } | '
     */
    public void setRequireSymbols(Boolean requireSymbols) {
        this.requireSymbols = requireSymbols;
    }
    
    /**
     * Specifies whether IAM user passwords must contain at least one of the
     * following non-alphanumeric characters: ! @ # $ % ^ & * ( ) _ + - = [ ]
     * { } | '
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requireSymbols Specifies whether IAM user passwords must contain at least one of the
     *         following non-alphanumeric characters: ! @ # $ % ^ & * ( ) _ + - = [ ]
     *         { } | '
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateAccountPasswordPolicyRequest withRequireSymbols(Boolean requireSymbols) {
        this.requireSymbols = requireSymbols;
        return this;
    }

    /**
     * Specifies whether IAM user passwords must contain at least one of the
     * following non-alphanumeric characters: ! @ # $ % ^ & * ( ) _ + - = [ ]
     * { } | '
     *
     * @return Specifies whether IAM user passwords must contain at least one of the
     *         following non-alphanumeric characters: ! @ # $ % ^ & * ( ) _ + - = [ ]
     *         { } | '
     */
    public Boolean getRequireSymbols() {
        return requireSymbols;
    }

    /**
     * Specifies whether IAM user passwords must contain at least one numeric
     * character (0 to 9).
     *
     * @return Specifies whether IAM user passwords must contain at least one numeric
     *         character (0 to 9).
     */
    public Boolean isRequireNumbers() {
        return requireNumbers;
    }
    
    /**
     * Specifies whether IAM user passwords must contain at least one numeric
     * character (0 to 9).
     *
     * @param requireNumbers Specifies whether IAM user passwords must contain at least one numeric
     *         character (0 to 9).
     */
    public void setRequireNumbers(Boolean requireNumbers) {
        this.requireNumbers = requireNumbers;
    }
    
    /**
     * Specifies whether IAM user passwords must contain at least one numeric
     * character (0 to 9).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requireNumbers Specifies whether IAM user passwords must contain at least one numeric
     *         character (0 to 9).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateAccountPasswordPolicyRequest withRequireNumbers(Boolean requireNumbers) {
        this.requireNumbers = requireNumbers;
        return this;
    }

    /**
     * Specifies whether IAM user passwords must contain at least one numeric
     * character (0 to 9).
     *
     * @return Specifies whether IAM user passwords must contain at least one numeric
     *         character (0 to 9).
     */
    public Boolean getRequireNumbers() {
        return requireNumbers;
    }

    /**
     * Specifies whether IAM user passwords must contain at least one
     * uppercase character from the ISO basic Latin alphabet (A to Z).
     *
     * @return Specifies whether IAM user passwords must contain at least one
     *         uppercase character from the ISO basic Latin alphabet (A to Z).
     */
    public Boolean isRequireUppercaseCharacters() {
        return requireUppercaseCharacters;
    }
    
    /**
     * Specifies whether IAM user passwords must contain at least one
     * uppercase character from the ISO basic Latin alphabet (A to Z).
     *
     * @param requireUppercaseCharacters Specifies whether IAM user passwords must contain at least one
     *         uppercase character from the ISO basic Latin alphabet (A to Z).
     */
    public void setRequireUppercaseCharacters(Boolean requireUppercaseCharacters) {
        this.requireUppercaseCharacters = requireUppercaseCharacters;
    }
    
    /**
     * Specifies whether IAM user passwords must contain at least one
     * uppercase character from the ISO basic Latin alphabet (A to Z).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requireUppercaseCharacters Specifies whether IAM user passwords must contain at least one
     *         uppercase character from the ISO basic Latin alphabet (A to Z).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateAccountPasswordPolicyRequest withRequireUppercaseCharacters(Boolean requireUppercaseCharacters) {
        this.requireUppercaseCharacters = requireUppercaseCharacters;
        return this;
    }

    /**
     * Specifies whether IAM user passwords must contain at least one
     * uppercase character from the ISO basic Latin alphabet (A to Z).
     *
     * @return Specifies whether IAM user passwords must contain at least one
     *         uppercase character from the ISO basic Latin alphabet (A to Z).
     */
    public Boolean getRequireUppercaseCharacters() {
        return requireUppercaseCharacters;
    }

    /**
     * Specifies whether IAM user passwords must contain at least one
     * lowercase character from the ISO basic Latin alphabet (a to z).
     *
     * @return Specifies whether IAM user passwords must contain at least one
     *         lowercase character from the ISO basic Latin alphabet (a to z).
     */
    public Boolean isRequireLowercaseCharacters() {
        return requireLowercaseCharacters;
    }
    
    /**
     * Specifies whether IAM user passwords must contain at least one
     * lowercase character from the ISO basic Latin alphabet (a to z).
     *
     * @param requireLowercaseCharacters Specifies whether IAM user passwords must contain at least one
     *         lowercase character from the ISO basic Latin alphabet (a to z).
     */
    public void setRequireLowercaseCharacters(Boolean requireLowercaseCharacters) {
        this.requireLowercaseCharacters = requireLowercaseCharacters;
    }
    
    /**
     * Specifies whether IAM user passwords must contain at least one
     * lowercase character from the ISO basic Latin alphabet (a to z).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requireLowercaseCharacters Specifies whether IAM user passwords must contain at least one
     *         lowercase character from the ISO basic Latin alphabet (a to z).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateAccountPasswordPolicyRequest withRequireLowercaseCharacters(Boolean requireLowercaseCharacters) {
        this.requireLowercaseCharacters = requireLowercaseCharacters;
        return this;
    }

    /**
     * Specifies whether IAM user passwords must contain at least one
     * lowercase character from the ISO basic Latin alphabet (a to z).
     *
     * @return Specifies whether IAM user passwords must contain at least one
     *         lowercase character from the ISO basic Latin alphabet (a to z).
     */
    public Boolean getRequireLowercaseCharacters() {
        return requireLowercaseCharacters;
    }

    /**
     * Allows all IAM users in your account to use the AWS Management Console
     * to change their own passwords. For more information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html">Letting
     * IAM Users Change Their Own Passwords</a> in the <i>Using IAM</i>
     * guide.
     *
     * @return Allows all IAM users in your account to use the AWS Management Console
     *         to change their own passwords. For more information, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html">Letting
     *         IAM Users Change Their Own Passwords</a> in the <i>Using IAM</i>
     *         guide.
     */
    public Boolean isAllowUsersToChangePassword() {
        return allowUsersToChangePassword;
    }
    
    /**
     * Allows all IAM users in your account to use the AWS Management Console
     * to change their own passwords. For more information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html">Letting
     * IAM Users Change Their Own Passwords</a> in the <i>Using IAM</i>
     * guide.
     *
     * @param allowUsersToChangePassword Allows all IAM users in your account to use the AWS Management Console
     *         to change their own passwords. For more information, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html">Letting
     *         IAM Users Change Their Own Passwords</a> in the <i>Using IAM</i>
     *         guide.
     */
    public void setAllowUsersToChangePassword(Boolean allowUsersToChangePassword) {
        this.allowUsersToChangePassword = allowUsersToChangePassword;
    }
    
    /**
     * Allows all IAM users in your account to use the AWS Management Console
     * to change their own passwords. For more information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html">Letting
     * IAM Users Change Their Own Passwords</a> in the <i>Using IAM</i>
     * guide.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allowUsersToChangePassword Allows all IAM users in your account to use the AWS Management Console
     *         to change their own passwords. For more information, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html">Letting
     *         IAM Users Change Their Own Passwords</a> in the <i>Using IAM</i>
     *         guide.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateAccountPasswordPolicyRequest withAllowUsersToChangePassword(Boolean allowUsersToChangePassword) {
        this.allowUsersToChangePassword = allowUsersToChangePassword;
        return this;
    }

    /**
     * Allows all IAM users in your account to use the AWS Management Console
     * to change their own passwords. For more information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html">Letting
     * IAM Users Change Their Own Passwords</a> in the <i>Using IAM</i>
     * guide.
     *
     * @return Allows all IAM users in your account to use the AWS Management Console
     *         to change their own passwords. For more information, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html">Letting
     *         IAM Users Change Their Own Passwords</a> in the <i>Using IAM</i>
     *         guide.
     */
    public Boolean getAllowUsersToChangePassword() {
        return allowUsersToChangePassword;
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
    public UpdateAccountPasswordPolicyRequest withMaxPasswordAge(Integer maxPasswordAge) {
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
    public UpdateAccountPasswordPolicyRequest withPasswordReusePrevention(Integer passwordReusePrevention) {
        this.passwordReusePrevention = passwordReusePrevention;
        return this;
    }

    /**
     * Prevents IAM users from setting a new password after their password
     * has expired.
     *
     * @return Prevents IAM users from setting a new password after their password
     *         has expired.
     */
    public Boolean isHardExpiry() {
        return hardExpiry;
    }
    
    /**
     * Prevents IAM users from setting a new password after their password
     * has expired.
     *
     * @param hardExpiry Prevents IAM users from setting a new password after their password
     *         has expired.
     */
    public void setHardExpiry(Boolean hardExpiry) {
        this.hardExpiry = hardExpiry;
    }
    
    /**
     * Prevents IAM users from setting a new password after their password
     * has expired.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hardExpiry Prevents IAM users from setting a new password after their password
     *         has expired.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateAccountPasswordPolicyRequest withHardExpiry(Boolean hardExpiry) {
        this.hardExpiry = hardExpiry;
        return this;
    }

    /**
     * Prevents IAM users from setting a new password after their password
     * has expired.
     *
     * @return Prevents IAM users from setting a new password after their password
     *         has expired.
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
        hashCode = prime * hashCode + ((getMaxPasswordAge() == null) ? 0 : getMaxPasswordAge().hashCode()); 
        hashCode = prime * hashCode + ((getPasswordReusePrevention() == null) ? 0 : getPasswordReusePrevention().hashCode()); 
        hashCode = prime * hashCode + ((isHardExpiry() == null) ? 0 : isHardExpiry().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateAccountPasswordPolicyRequest == false) return false;
        UpdateAccountPasswordPolicyRequest other = (UpdateAccountPasswordPolicyRequest)obj;
        
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
        if (other.getMaxPasswordAge() == null ^ this.getMaxPasswordAge() == null) return false;
        if (other.getMaxPasswordAge() != null && other.getMaxPasswordAge().equals(this.getMaxPasswordAge()) == false) return false; 
        if (other.getPasswordReusePrevention() == null ^ this.getPasswordReusePrevention() == null) return false;
        if (other.getPasswordReusePrevention() != null && other.getPasswordReusePrevention().equals(this.getPasswordReusePrevention()) == false) return false; 
        if (other.isHardExpiry() == null ^ this.isHardExpiry() == null) return false;
        if (other.isHardExpiry() != null && other.isHardExpiry().equals(this.isHardExpiry()) == false) return false; 
        return true;
    }
    
}
    