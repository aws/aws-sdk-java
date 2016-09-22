/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class UpdateAccountPasswordPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The minimum number of characters allowed in an IAM user password.
     * </p>
     * <p>
     * Default value: 6
     * </p>
     */
    private Integer minimumPasswordLength;
    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one of the following non-alphanumeric characters:
     * </p>
     * <p>
     * ! @ # $ % ^ &amp;amp; * ( ) _ + - = [ ] { } | '
     * </p>
     * <p>
     * Default value: false
     * </p>
     */
    private Boolean requireSymbols;
    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one numeric character (0 to 9).
     * </p>
     * <p>
     * Default value: false
     * </p>
     */
    private Boolean requireNumbers;
    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one uppercase character from the ISO basic Latin
     * alphabet (A to Z).
     * </p>
     * <p>
     * Default value: false
     * </p>
     */
    private Boolean requireUppercaseCharacters;
    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one lowercase character from the ISO basic Latin
     * alphabet (a to z).
     * </p>
     * <p>
     * Default value: false
     * </p>
     */
    private Boolean requireLowercaseCharacters;
    /**
     * <p>
     * Allows all IAM users in your account to use the AWS Management Console to change their own passwords. For more
     * information, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html">Letting IAM Users
     * Change Their Own Passwords</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Default value: false
     * </p>
     */
    private Boolean allowUsersToChangePassword;
    /**
     * <p>
     * The number of days that an IAM user password is valid. The default value of 0 means IAM user passwords never
     * expire.
     * </p>
     * <p>
     * Default value: 0
     * </p>
     */
    private Integer maxPasswordAge;
    /**
     * <p>
     * Specifies the number of previous passwords that IAM users are prevented from reusing. The default value of 0
     * means IAM users are not prevented from reusing previous passwords.
     * </p>
     * <p>
     * Default value: 0
     * </p>
     */
    private Integer passwordReusePrevention;
    /**
     * <p>
     * Prevents IAM users from setting a new password after their password has expired.
     * </p>
     * <p>
     * Default value: false
     * </p>
     */
    private Boolean hardExpiry;

    /**
     * <p>
     * The minimum number of characters allowed in an IAM user password.
     * </p>
     * <p>
     * Default value: 6
     * </p>
     * 
     * @param minimumPasswordLength
     *        The minimum number of characters allowed in an IAM user password.</p>
     *        <p>
     *        Default value: 6
     */

    public void setMinimumPasswordLength(Integer minimumPasswordLength) {
        this.minimumPasswordLength = minimumPasswordLength;
    }

    /**
     * <p>
     * The minimum number of characters allowed in an IAM user password.
     * </p>
     * <p>
     * Default value: 6
     * </p>
     * 
     * @return The minimum number of characters allowed in an IAM user password.</p>
     *         <p>
     *         Default value: 6
     */

    public Integer getMinimumPasswordLength() {
        return this.minimumPasswordLength;
    }

    /**
     * <p>
     * The minimum number of characters allowed in an IAM user password.
     * </p>
     * <p>
     * Default value: 6
     * </p>
     * 
     * @param minimumPasswordLength
     *        The minimum number of characters allowed in an IAM user password.</p>
     *        <p>
     *        Default value: 6
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountPasswordPolicyRequest withMinimumPasswordLength(Integer minimumPasswordLength) {
        setMinimumPasswordLength(minimumPasswordLength);
        return this;
    }

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one of the following non-alphanumeric characters:
     * </p>
     * <p>
     * ! @ # $ % ^ &amp;amp; * ( ) _ + - = [ ] { } | '
     * </p>
     * <p>
     * Default value: false
     * </p>
     * 
     * @param requireSymbols
     *        Specifies whether IAM user passwords must contain at least one of the following non-alphanumeric
     *        characters:</p>
     *        <p>
     *        ! @ # $ % ^ &amp;amp; * ( ) _ + - = [ ] { } | '
     *        </p>
     *        <p>
     *        Default value: false
     */

    public void setRequireSymbols(Boolean requireSymbols) {
        this.requireSymbols = requireSymbols;
    }

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one of the following non-alphanumeric characters:
     * </p>
     * <p>
     * ! @ # $ % ^ &amp;amp; * ( ) _ + - = [ ] { } | '
     * </p>
     * <p>
     * Default value: false
     * </p>
     * 
     * @return Specifies whether IAM user passwords must contain at least one of the following non-alphanumeric
     *         characters:</p>
     *         <p>
     *         ! @ # $ % ^ &amp;amp; * ( ) _ + - = [ ] { } | '
     *         </p>
     *         <p>
     *         Default value: false
     */

    public Boolean getRequireSymbols() {
        return this.requireSymbols;
    }

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one of the following non-alphanumeric characters:
     * </p>
     * <p>
     * ! @ # $ % ^ &amp;amp; * ( ) _ + - = [ ] { } | '
     * </p>
     * <p>
     * Default value: false
     * </p>
     * 
     * @param requireSymbols
     *        Specifies whether IAM user passwords must contain at least one of the following non-alphanumeric
     *        characters:</p>
     *        <p>
     *        ! @ # $ % ^ &amp;amp; * ( ) _ + - = [ ] { } | '
     *        </p>
     *        <p>
     *        Default value: false
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountPasswordPolicyRequest withRequireSymbols(Boolean requireSymbols) {
        setRequireSymbols(requireSymbols);
        return this;
    }

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one of the following non-alphanumeric characters:
     * </p>
     * <p>
     * ! @ # $ % ^ &amp;amp; * ( ) _ + - = [ ] { } | '
     * </p>
     * <p>
     * Default value: false
     * </p>
     * 
     * @return Specifies whether IAM user passwords must contain at least one of the following non-alphanumeric
     *         characters:</p>
     *         <p>
     *         ! @ # $ % ^ &amp;amp; * ( ) _ + - = [ ] { } | '
     *         </p>
     *         <p>
     *         Default value: false
     */

    public Boolean isRequireSymbols() {
        return this.requireSymbols;
    }

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one numeric character (0 to 9).
     * </p>
     * <p>
     * Default value: false
     * </p>
     * 
     * @param requireNumbers
     *        Specifies whether IAM user passwords must contain at least one numeric character (0 to 9).</p>
     *        <p>
     *        Default value: false
     */

    public void setRequireNumbers(Boolean requireNumbers) {
        this.requireNumbers = requireNumbers;
    }

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one numeric character (0 to 9).
     * </p>
     * <p>
     * Default value: false
     * </p>
     * 
     * @return Specifies whether IAM user passwords must contain at least one numeric character (0 to 9).</p>
     *         <p>
     *         Default value: false
     */

    public Boolean getRequireNumbers() {
        return this.requireNumbers;
    }

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one numeric character (0 to 9).
     * </p>
     * <p>
     * Default value: false
     * </p>
     * 
     * @param requireNumbers
     *        Specifies whether IAM user passwords must contain at least one numeric character (0 to 9).</p>
     *        <p>
     *        Default value: false
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountPasswordPolicyRequest withRequireNumbers(Boolean requireNumbers) {
        setRequireNumbers(requireNumbers);
        return this;
    }

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one numeric character (0 to 9).
     * </p>
     * <p>
     * Default value: false
     * </p>
     * 
     * @return Specifies whether IAM user passwords must contain at least one numeric character (0 to 9).</p>
     *         <p>
     *         Default value: false
     */

    public Boolean isRequireNumbers() {
        return this.requireNumbers;
    }

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one uppercase character from the ISO basic Latin
     * alphabet (A to Z).
     * </p>
     * <p>
     * Default value: false
     * </p>
     * 
     * @param requireUppercaseCharacters
     *        Specifies whether IAM user passwords must contain at least one uppercase character from the ISO basic
     *        Latin alphabet (A to Z).</p>
     *        <p>
     *        Default value: false
     */

    public void setRequireUppercaseCharacters(Boolean requireUppercaseCharacters) {
        this.requireUppercaseCharacters = requireUppercaseCharacters;
    }

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one uppercase character from the ISO basic Latin
     * alphabet (A to Z).
     * </p>
     * <p>
     * Default value: false
     * </p>
     * 
     * @return Specifies whether IAM user passwords must contain at least one uppercase character from the ISO basic
     *         Latin alphabet (A to Z).</p>
     *         <p>
     *         Default value: false
     */

    public Boolean getRequireUppercaseCharacters() {
        return this.requireUppercaseCharacters;
    }

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one uppercase character from the ISO basic Latin
     * alphabet (A to Z).
     * </p>
     * <p>
     * Default value: false
     * </p>
     * 
     * @param requireUppercaseCharacters
     *        Specifies whether IAM user passwords must contain at least one uppercase character from the ISO basic
     *        Latin alphabet (A to Z).</p>
     *        <p>
     *        Default value: false
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountPasswordPolicyRequest withRequireUppercaseCharacters(Boolean requireUppercaseCharacters) {
        setRequireUppercaseCharacters(requireUppercaseCharacters);
        return this;
    }

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one uppercase character from the ISO basic Latin
     * alphabet (A to Z).
     * </p>
     * <p>
     * Default value: false
     * </p>
     * 
     * @return Specifies whether IAM user passwords must contain at least one uppercase character from the ISO basic
     *         Latin alphabet (A to Z).</p>
     *         <p>
     *         Default value: false
     */

    public Boolean isRequireUppercaseCharacters() {
        return this.requireUppercaseCharacters;
    }

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one lowercase character from the ISO basic Latin
     * alphabet (a to z).
     * </p>
     * <p>
     * Default value: false
     * </p>
     * 
     * @param requireLowercaseCharacters
     *        Specifies whether IAM user passwords must contain at least one lowercase character from the ISO basic
     *        Latin alphabet (a to z).</p>
     *        <p>
     *        Default value: false
     */

    public void setRequireLowercaseCharacters(Boolean requireLowercaseCharacters) {
        this.requireLowercaseCharacters = requireLowercaseCharacters;
    }

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one lowercase character from the ISO basic Latin
     * alphabet (a to z).
     * </p>
     * <p>
     * Default value: false
     * </p>
     * 
     * @return Specifies whether IAM user passwords must contain at least one lowercase character from the ISO basic
     *         Latin alphabet (a to z).</p>
     *         <p>
     *         Default value: false
     */

    public Boolean getRequireLowercaseCharacters() {
        return this.requireLowercaseCharacters;
    }

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one lowercase character from the ISO basic Latin
     * alphabet (a to z).
     * </p>
     * <p>
     * Default value: false
     * </p>
     * 
     * @param requireLowercaseCharacters
     *        Specifies whether IAM user passwords must contain at least one lowercase character from the ISO basic
     *        Latin alphabet (a to z).</p>
     *        <p>
     *        Default value: false
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountPasswordPolicyRequest withRequireLowercaseCharacters(Boolean requireLowercaseCharacters) {
        setRequireLowercaseCharacters(requireLowercaseCharacters);
        return this;
    }

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one lowercase character from the ISO basic Latin
     * alphabet (a to z).
     * </p>
     * <p>
     * Default value: false
     * </p>
     * 
     * @return Specifies whether IAM user passwords must contain at least one lowercase character from the ISO basic
     *         Latin alphabet (a to z).</p>
     *         <p>
     *         Default value: false
     */

    public Boolean isRequireLowercaseCharacters() {
        return this.requireLowercaseCharacters;
    }

    /**
     * <p>
     * Allows all IAM users in your account to use the AWS Management Console to change their own passwords. For more
     * information, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html">Letting IAM Users
     * Change Their Own Passwords</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Default value: false
     * </p>
     * 
     * @param allowUsersToChangePassword
     *        Allows all IAM users in your account to use the AWS Management Console to change their own passwords. For
     *        more information, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html">Letting IAM Users Change Their
     *        Own Passwords</a> in the <i>IAM User Guide</i>.</p>
     *        <p>
     *        Default value: false
     */

    public void setAllowUsersToChangePassword(Boolean allowUsersToChangePassword) {
        this.allowUsersToChangePassword = allowUsersToChangePassword;
    }

    /**
     * <p>
     * Allows all IAM users in your account to use the AWS Management Console to change their own passwords. For more
     * information, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html">Letting IAM Users
     * Change Their Own Passwords</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Default value: false
     * </p>
     * 
     * @return Allows all IAM users in your account to use the AWS Management Console to change their own passwords. For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html">Letting IAM Users Change
     *         Their Own Passwords</a> in the <i>IAM User Guide</i>.</p>
     *         <p>
     *         Default value: false
     */

    public Boolean getAllowUsersToChangePassword() {
        return this.allowUsersToChangePassword;
    }

    /**
     * <p>
     * Allows all IAM users in your account to use the AWS Management Console to change their own passwords. For more
     * information, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html">Letting IAM Users
     * Change Their Own Passwords</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Default value: false
     * </p>
     * 
     * @param allowUsersToChangePassword
     *        Allows all IAM users in your account to use the AWS Management Console to change their own passwords. For
     *        more information, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html">Letting IAM Users Change Their
     *        Own Passwords</a> in the <i>IAM User Guide</i>.</p>
     *        <p>
     *        Default value: false
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountPasswordPolicyRequest withAllowUsersToChangePassword(Boolean allowUsersToChangePassword) {
        setAllowUsersToChangePassword(allowUsersToChangePassword);
        return this;
    }

    /**
     * <p>
     * Allows all IAM users in your account to use the AWS Management Console to change their own passwords. For more
     * information, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html">Letting IAM Users
     * Change Their Own Passwords</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Default value: false
     * </p>
     * 
     * @return Allows all IAM users in your account to use the AWS Management Console to change their own passwords. For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html">Letting IAM Users Change
     *         Their Own Passwords</a> in the <i>IAM User Guide</i>.</p>
     *         <p>
     *         Default value: false
     */

    public Boolean isAllowUsersToChangePassword() {
        return this.allowUsersToChangePassword;
    }

    /**
     * <p>
     * The number of days that an IAM user password is valid. The default value of 0 means IAM user passwords never
     * expire.
     * </p>
     * <p>
     * Default value: 0
     * </p>
     * 
     * @param maxPasswordAge
     *        The number of days that an IAM user password is valid. The default value of 0 means IAM user passwords
     *        never expire.</p>
     *        <p>
     *        Default value: 0
     */

    public void setMaxPasswordAge(Integer maxPasswordAge) {
        this.maxPasswordAge = maxPasswordAge;
    }

    /**
     * <p>
     * The number of days that an IAM user password is valid. The default value of 0 means IAM user passwords never
     * expire.
     * </p>
     * <p>
     * Default value: 0
     * </p>
     * 
     * @return The number of days that an IAM user password is valid. The default value of 0 means IAM user passwords
     *         never expire.</p>
     *         <p>
     *         Default value: 0
     */

    public Integer getMaxPasswordAge() {
        return this.maxPasswordAge;
    }

    /**
     * <p>
     * The number of days that an IAM user password is valid. The default value of 0 means IAM user passwords never
     * expire.
     * </p>
     * <p>
     * Default value: 0
     * </p>
     * 
     * @param maxPasswordAge
     *        The number of days that an IAM user password is valid. The default value of 0 means IAM user passwords
     *        never expire.</p>
     *        <p>
     *        Default value: 0
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountPasswordPolicyRequest withMaxPasswordAge(Integer maxPasswordAge) {
        setMaxPasswordAge(maxPasswordAge);
        return this;
    }

    /**
     * <p>
     * Specifies the number of previous passwords that IAM users are prevented from reusing. The default value of 0
     * means IAM users are not prevented from reusing previous passwords.
     * </p>
     * <p>
     * Default value: 0
     * </p>
     * 
     * @param passwordReusePrevention
     *        Specifies the number of previous passwords that IAM users are prevented from reusing. The default value of
     *        0 means IAM users are not prevented from reusing previous passwords.</p>
     *        <p>
     *        Default value: 0
     */

    public void setPasswordReusePrevention(Integer passwordReusePrevention) {
        this.passwordReusePrevention = passwordReusePrevention;
    }

    /**
     * <p>
     * Specifies the number of previous passwords that IAM users are prevented from reusing. The default value of 0
     * means IAM users are not prevented from reusing previous passwords.
     * </p>
     * <p>
     * Default value: 0
     * </p>
     * 
     * @return Specifies the number of previous passwords that IAM users are prevented from reusing. The default value
     *         of 0 means IAM users are not prevented from reusing previous passwords.</p>
     *         <p>
     *         Default value: 0
     */

    public Integer getPasswordReusePrevention() {
        return this.passwordReusePrevention;
    }

    /**
     * <p>
     * Specifies the number of previous passwords that IAM users are prevented from reusing. The default value of 0
     * means IAM users are not prevented from reusing previous passwords.
     * </p>
     * <p>
     * Default value: 0
     * </p>
     * 
     * @param passwordReusePrevention
     *        Specifies the number of previous passwords that IAM users are prevented from reusing. The default value of
     *        0 means IAM users are not prevented from reusing previous passwords.</p>
     *        <p>
     *        Default value: 0
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountPasswordPolicyRequest withPasswordReusePrevention(Integer passwordReusePrevention) {
        setPasswordReusePrevention(passwordReusePrevention);
        return this;
    }

    /**
     * <p>
     * Prevents IAM users from setting a new password after their password has expired.
     * </p>
     * <p>
     * Default value: false
     * </p>
     * 
     * @param hardExpiry
     *        Prevents IAM users from setting a new password after their password has expired.</p>
     *        <p>
     *        Default value: false
     */

    public void setHardExpiry(Boolean hardExpiry) {
        this.hardExpiry = hardExpiry;
    }

    /**
     * <p>
     * Prevents IAM users from setting a new password after their password has expired.
     * </p>
     * <p>
     * Default value: false
     * </p>
     * 
     * @return Prevents IAM users from setting a new password after their password has expired.</p>
     *         <p>
     *         Default value: false
     */

    public Boolean getHardExpiry() {
        return this.hardExpiry;
    }

    /**
     * <p>
     * Prevents IAM users from setting a new password after their password has expired.
     * </p>
     * <p>
     * Default value: false
     * </p>
     * 
     * @param hardExpiry
     *        Prevents IAM users from setting a new password after their password has expired.</p>
     *        <p>
     *        Default value: false
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountPasswordPolicyRequest withHardExpiry(Boolean hardExpiry) {
        setHardExpiry(hardExpiry);
        return this;
    }

    /**
     * <p>
     * Prevents IAM users from setting a new password after their password has expired.
     * </p>
     * <p>
     * Default value: false
     * </p>
     * 
     * @return Prevents IAM users from setting a new password after their password has expired.</p>
     *         <p>
     *         Default value: false
     */

    public Boolean isHardExpiry() {
        return this.hardExpiry;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("MinimumPasswordLength: " + getMinimumPasswordLength() + ",");
        if (getRequireSymbols() != null)
            sb.append("RequireSymbols: " + getRequireSymbols() + ",");
        if (getRequireNumbers() != null)
            sb.append("RequireNumbers: " + getRequireNumbers() + ",");
        if (getRequireUppercaseCharacters() != null)
            sb.append("RequireUppercaseCharacters: " + getRequireUppercaseCharacters() + ",");
        if (getRequireLowercaseCharacters() != null)
            sb.append("RequireLowercaseCharacters: " + getRequireLowercaseCharacters() + ",");
        if (getAllowUsersToChangePassword() != null)
            sb.append("AllowUsersToChangePassword: " + getAllowUsersToChangePassword() + ",");
        if (getMaxPasswordAge() != null)
            sb.append("MaxPasswordAge: " + getMaxPasswordAge() + ",");
        if (getPasswordReusePrevention() != null)
            sb.append("PasswordReusePrevention: " + getPasswordReusePrevention() + ",");
        if (getHardExpiry() != null)
            sb.append("HardExpiry: " + getHardExpiry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAccountPasswordPolicyRequest == false)
            return false;
        UpdateAccountPasswordPolicyRequest other = (UpdateAccountPasswordPolicyRequest) obj;
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
        hashCode = prime * hashCode + ((getMaxPasswordAge() == null) ? 0 : getMaxPasswordAge().hashCode());
        hashCode = prime * hashCode + ((getPasswordReusePrevention() == null) ? 0 : getPasswordReusePrevention().hashCode());
        hashCode = prime * hashCode + ((getHardExpiry() == null) ? 0 : getHardExpiry().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAccountPasswordPolicyRequest clone() {
        return (UpdateAccountPasswordPolicyRequest) super.clone();
    }
}
