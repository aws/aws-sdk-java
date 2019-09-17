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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/UpdateAccountPasswordPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAccountPasswordPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The minimum number of characters allowed in an IAM user password.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>6</code>.
     * </p>
     */
    private Integer minimumPasswordLength;
    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one of the following non-alphanumeric characters:
     * </p>
     * <p>
     * ! @ # $ % ^ &amp; * ( ) _ + - = [ ] { } | '
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>false</code>
     * . The result is that passwords do not require at least one symbol character.
     * </p>
     */
    private Boolean requireSymbols;
    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one numeric character (0 to 9).
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>false</code>
     * . The result is that passwords do not require at least one numeric character.
     * </p>
     */
    private Boolean requireNumbers;
    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one uppercase character from the ISO basic Latin
     * alphabet (A to Z).
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>false</code>
     * . The result is that passwords do not require at least one uppercase character.
     * </p>
     */
    private Boolean requireUppercaseCharacters;
    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one lowercase character from the ISO basic Latin
     * alphabet (a to z).
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>false</code>
     * . The result is that passwords do not require at least one lowercase character.
     * </p>
     */
    private Boolean requireLowercaseCharacters;
    /**
     * <p>
     * Allows all IAM users in your account to use the AWS Management Console to change their own passwords. For more
     * information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html">Letting IAM
     * Users Change Their Own Passwords</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>false</code>
     * . The result is that IAM users in the account do not automatically have permissions to change their own password.
     * </p>
     */
    private Boolean allowUsersToChangePassword;
    /**
     * <p>
     * The number of days that an IAM user password is valid.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>0</code>.
     * The result is that IAM user passwords never expire.
     * </p>
     */
    private Integer maxPasswordAge;
    /**
     * <p>
     * Specifies the number of previous passwords that IAM users are prevented from reusing.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>0</code>.
     * The result is that IAM users are not prevented from reusing previous passwords.
     * </p>
     */
    private Integer passwordReusePrevention;
    /**
     * <p>
     * Prevents IAM users from setting a new password after their password has expired. The IAM user cannot be accessed
     * until an administrator resets the password.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>false</code>
     * . The result is that IAM users can change their passwords after they expire and continue to sign in as the user.
     * </p>
     */
    private Boolean hardExpiry;

    /**
     * <p>
     * The minimum number of characters allowed in an IAM user password.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>6</code>.
     * </p>
     * 
     * @param minimumPasswordLength
     *        The minimum number of characters allowed in an IAM user password.</p>
     *        <p>
     *        If you do not specify a value for this parameter, then the operation uses the default value of
     *        <code>6</code>.
     */

    public void setMinimumPasswordLength(Integer minimumPasswordLength) {
        this.minimumPasswordLength = minimumPasswordLength;
    }

    /**
     * <p>
     * The minimum number of characters allowed in an IAM user password.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>6</code>.
     * </p>
     * 
     * @return The minimum number of characters allowed in an IAM user password.</p>
     *         <p>
     *         If you do not specify a value for this parameter, then the operation uses the default value of
     *         <code>6</code>.
     */

    public Integer getMinimumPasswordLength() {
        return this.minimumPasswordLength;
    }

    /**
     * <p>
     * The minimum number of characters allowed in an IAM user password.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>6</code>.
     * </p>
     * 
     * @param minimumPasswordLength
     *        The minimum number of characters allowed in an IAM user password.</p>
     *        <p>
     *        If you do not specify a value for this parameter, then the operation uses the default value of
     *        <code>6</code>.
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
     * ! @ # $ % ^ &amp; * ( ) _ + - = [ ] { } | '
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>false</code>
     * . The result is that passwords do not require at least one symbol character.
     * </p>
     * 
     * @param requireSymbols
     *        Specifies whether IAM user passwords must contain at least one of the following non-alphanumeric
     *        characters:</p>
     *        <p>
     *        ! @ # $ % ^ &amp; * ( ) _ + - = [ ] { } | '
     *        </p>
     *        <p>
     *        If you do not specify a value for this parameter, then the operation uses the default value of
     *        <code>false</code>. The result is that passwords do not require at least one symbol character.
     */

    public void setRequireSymbols(Boolean requireSymbols) {
        this.requireSymbols = requireSymbols;
    }

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one of the following non-alphanumeric characters:
     * </p>
     * <p>
     * ! @ # $ % ^ &amp; * ( ) _ + - = [ ] { } | '
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>false</code>
     * . The result is that passwords do not require at least one symbol character.
     * </p>
     * 
     * @return Specifies whether IAM user passwords must contain at least one of the following non-alphanumeric
     *         characters:</p>
     *         <p>
     *         ! @ # $ % ^ &amp; * ( ) _ + - = [ ] { } | '
     *         </p>
     *         <p>
     *         If you do not specify a value for this parameter, then the operation uses the default value of
     *         <code>false</code>. The result is that passwords do not require at least one symbol character.
     */

    public Boolean getRequireSymbols() {
        return this.requireSymbols;
    }

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one of the following non-alphanumeric characters:
     * </p>
     * <p>
     * ! @ # $ % ^ &amp; * ( ) _ + - = [ ] { } | '
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>false</code>
     * . The result is that passwords do not require at least one symbol character.
     * </p>
     * 
     * @param requireSymbols
     *        Specifies whether IAM user passwords must contain at least one of the following non-alphanumeric
     *        characters:</p>
     *        <p>
     *        ! @ # $ % ^ &amp; * ( ) _ + - = [ ] { } | '
     *        </p>
     *        <p>
     *        If you do not specify a value for this parameter, then the operation uses the default value of
     *        <code>false</code>. The result is that passwords do not require at least one symbol character.
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
     * ! @ # $ % ^ &amp; * ( ) _ + - = [ ] { } | '
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>false</code>
     * . The result is that passwords do not require at least one symbol character.
     * </p>
     * 
     * @return Specifies whether IAM user passwords must contain at least one of the following non-alphanumeric
     *         characters:</p>
     *         <p>
     *         ! @ # $ % ^ &amp; * ( ) _ + - = [ ] { } | '
     *         </p>
     *         <p>
     *         If you do not specify a value for this parameter, then the operation uses the default value of
     *         <code>false</code>. The result is that passwords do not require at least one symbol character.
     */

    public Boolean isRequireSymbols() {
        return this.requireSymbols;
    }

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one numeric character (0 to 9).
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>false</code>
     * . The result is that passwords do not require at least one numeric character.
     * </p>
     * 
     * @param requireNumbers
     *        Specifies whether IAM user passwords must contain at least one numeric character (0 to 9).</p>
     *        <p>
     *        If you do not specify a value for this parameter, then the operation uses the default value of
     *        <code>false</code>. The result is that passwords do not require at least one numeric character.
     */

    public void setRequireNumbers(Boolean requireNumbers) {
        this.requireNumbers = requireNumbers;
    }

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one numeric character (0 to 9).
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>false</code>
     * . The result is that passwords do not require at least one numeric character.
     * </p>
     * 
     * @return Specifies whether IAM user passwords must contain at least one numeric character (0 to 9).</p>
     *         <p>
     *         If you do not specify a value for this parameter, then the operation uses the default value of
     *         <code>false</code>. The result is that passwords do not require at least one numeric character.
     */

    public Boolean getRequireNumbers() {
        return this.requireNumbers;
    }

    /**
     * <p>
     * Specifies whether IAM user passwords must contain at least one numeric character (0 to 9).
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>false</code>
     * . The result is that passwords do not require at least one numeric character.
     * </p>
     * 
     * @param requireNumbers
     *        Specifies whether IAM user passwords must contain at least one numeric character (0 to 9).</p>
     *        <p>
     *        If you do not specify a value for this parameter, then the operation uses the default value of
     *        <code>false</code>. The result is that passwords do not require at least one numeric character.
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
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>false</code>
     * . The result is that passwords do not require at least one numeric character.
     * </p>
     * 
     * @return Specifies whether IAM user passwords must contain at least one numeric character (0 to 9).</p>
     *         <p>
     *         If you do not specify a value for this parameter, then the operation uses the default value of
     *         <code>false</code>. The result is that passwords do not require at least one numeric character.
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
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>false</code>
     * . The result is that passwords do not require at least one uppercase character.
     * </p>
     * 
     * @param requireUppercaseCharacters
     *        Specifies whether IAM user passwords must contain at least one uppercase character from the ISO basic
     *        Latin alphabet (A to Z).</p>
     *        <p>
     *        If you do not specify a value for this parameter, then the operation uses the default value of
     *        <code>false</code>. The result is that passwords do not require at least one uppercase character.
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
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>false</code>
     * . The result is that passwords do not require at least one uppercase character.
     * </p>
     * 
     * @return Specifies whether IAM user passwords must contain at least one uppercase character from the ISO basic
     *         Latin alphabet (A to Z).</p>
     *         <p>
     *         If you do not specify a value for this parameter, then the operation uses the default value of
     *         <code>false</code>. The result is that passwords do not require at least one uppercase character.
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
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>false</code>
     * . The result is that passwords do not require at least one uppercase character.
     * </p>
     * 
     * @param requireUppercaseCharacters
     *        Specifies whether IAM user passwords must contain at least one uppercase character from the ISO basic
     *        Latin alphabet (A to Z).</p>
     *        <p>
     *        If you do not specify a value for this parameter, then the operation uses the default value of
     *        <code>false</code>. The result is that passwords do not require at least one uppercase character.
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
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>false</code>
     * . The result is that passwords do not require at least one uppercase character.
     * </p>
     * 
     * @return Specifies whether IAM user passwords must contain at least one uppercase character from the ISO basic
     *         Latin alphabet (A to Z).</p>
     *         <p>
     *         If you do not specify a value for this parameter, then the operation uses the default value of
     *         <code>false</code>. The result is that passwords do not require at least one uppercase character.
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
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>false</code>
     * . The result is that passwords do not require at least one lowercase character.
     * </p>
     * 
     * @param requireLowercaseCharacters
     *        Specifies whether IAM user passwords must contain at least one lowercase character from the ISO basic
     *        Latin alphabet (a to z).</p>
     *        <p>
     *        If you do not specify a value for this parameter, then the operation uses the default value of
     *        <code>false</code>. The result is that passwords do not require at least one lowercase character.
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
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>false</code>
     * . The result is that passwords do not require at least one lowercase character.
     * </p>
     * 
     * @return Specifies whether IAM user passwords must contain at least one lowercase character from the ISO basic
     *         Latin alphabet (a to z).</p>
     *         <p>
     *         If you do not specify a value for this parameter, then the operation uses the default value of
     *         <code>false</code>. The result is that passwords do not require at least one lowercase character.
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
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>false</code>
     * . The result is that passwords do not require at least one lowercase character.
     * </p>
     * 
     * @param requireLowercaseCharacters
     *        Specifies whether IAM user passwords must contain at least one lowercase character from the ISO basic
     *        Latin alphabet (a to z).</p>
     *        <p>
     *        If you do not specify a value for this parameter, then the operation uses the default value of
     *        <code>false</code>. The result is that passwords do not require at least one lowercase character.
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
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>false</code>
     * . The result is that passwords do not require at least one lowercase character.
     * </p>
     * 
     * @return Specifies whether IAM user passwords must contain at least one lowercase character from the ISO basic
     *         Latin alphabet (a to z).</p>
     *         <p>
     *         If you do not specify a value for this parameter, then the operation uses the default value of
     *         <code>false</code>. The result is that passwords do not require at least one lowercase character.
     */

    public Boolean isRequireLowercaseCharacters() {
        return this.requireLowercaseCharacters;
    }

    /**
     * <p>
     * Allows all IAM users in your account to use the AWS Management Console to change their own passwords. For more
     * information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html">Letting IAM
     * Users Change Their Own Passwords</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>false</code>
     * . The result is that IAM users in the account do not automatically have permissions to change their own password.
     * </p>
     * 
     * @param allowUsersToChangePassword
     *        Allows all IAM users in your account to use the AWS Management Console to change their own passwords. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html">Letting IAM Users Change
     *        Their Own Passwords</a> in the <i>IAM User Guide</i>.</p>
     *        <p>
     *        If you do not specify a value for this parameter, then the operation uses the default value of
     *        <code>false</code>. The result is that IAM users in the account do not automatically have permissions to
     *        change their own password.
     */

    public void setAllowUsersToChangePassword(Boolean allowUsersToChangePassword) {
        this.allowUsersToChangePassword = allowUsersToChangePassword;
    }

    /**
     * <p>
     * Allows all IAM users in your account to use the AWS Management Console to change their own passwords. For more
     * information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html">Letting IAM
     * Users Change Their Own Passwords</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>false</code>
     * . The result is that IAM users in the account do not automatically have permissions to change their own password.
     * </p>
     * 
     * @return Allows all IAM users in your account to use the AWS Management Console to change their own passwords. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html">Letting IAM Users Change
     *         Their Own Passwords</a> in the <i>IAM User Guide</i>.</p>
     *         <p>
     *         If you do not specify a value for this parameter, then the operation uses the default value of
     *         <code>false</code>. The result is that IAM users in the account do not automatically have permissions to
     *         change their own password.
     */

    public Boolean getAllowUsersToChangePassword() {
        return this.allowUsersToChangePassword;
    }

    /**
     * <p>
     * Allows all IAM users in your account to use the AWS Management Console to change their own passwords. For more
     * information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html">Letting IAM
     * Users Change Their Own Passwords</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>false</code>
     * . The result is that IAM users in the account do not automatically have permissions to change their own password.
     * </p>
     * 
     * @param allowUsersToChangePassword
     *        Allows all IAM users in your account to use the AWS Management Console to change their own passwords. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html">Letting IAM Users Change
     *        Their Own Passwords</a> in the <i>IAM User Guide</i>.</p>
     *        <p>
     *        If you do not specify a value for this parameter, then the operation uses the default value of
     *        <code>false</code>. The result is that IAM users in the account do not automatically have permissions to
     *        change their own password.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountPasswordPolicyRequest withAllowUsersToChangePassword(Boolean allowUsersToChangePassword) {
        setAllowUsersToChangePassword(allowUsersToChangePassword);
        return this;
    }

    /**
     * <p>
     * Allows all IAM users in your account to use the AWS Management Console to change their own passwords. For more
     * information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html">Letting IAM
     * Users Change Their Own Passwords</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>false</code>
     * . The result is that IAM users in the account do not automatically have permissions to change their own password.
     * </p>
     * 
     * @return Allows all IAM users in your account to use the AWS Management Console to change their own passwords. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/HowToPwdIAMUser.html">Letting IAM Users Change
     *         Their Own Passwords</a> in the <i>IAM User Guide</i>.</p>
     *         <p>
     *         If you do not specify a value for this parameter, then the operation uses the default value of
     *         <code>false</code>. The result is that IAM users in the account do not automatically have permissions to
     *         change their own password.
     */

    public Boolean isAllowUsersToChangePassword() {
        return this.allowUsersToChangePassword;
    }

    /**
     * <p>
     * The number of days that an IAM user password is valid.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>0</code>.
     * The result is that IAM user passwords never expire.
     * </p>
     * 
     * @param maxPasswordAge
     *        The number of days that an IAM user password is valid.</p>
     *        <p>
     *        If you do not specify a value for this parameter, then the operation uses the default value of
     *        <code>0</code>. The result is that IAM user passwords never expire.
     */

    public void setMaxPasswordAge(Integer maxPasswordAge) {
        this.maxPasswordAge = maxPasswordAge;
    }

    /**
     * <p>
     * The number of days that an IAM user password is valid.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>0</code>.
     * The result is that IAM user passwords never expire.
     * </p>
     * 
     * @return The number of days that an IAM user password is valid.</p>
     *         <p>
     *         If you do not specify a value for this parameter, then the operation uses the default value of
     *         <code>0</code>. The result is that IAM user passwords never expire.
     */

    public Integer getMaxPasswordAge() {
        return this.maxPasswordAge;
    }

    /**
     * <p>
     * The number of days that an IAM user password is valid.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>0</code>.
     * The result is that IAM user passwords never expire.
     * </p>
     * 
     * @param maxPasswordAge
     *        The number of days that an IAM user password is valid.</p>
     *        <p>
     *        If you do not specify a value for this parameter, then the operation uses the default value of
     *        <code>0</code>. The result is that IAM user passwords never expire.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountPasswordPolicyRequest withMaxPasswordAge(Integer maxPasswordAge) {
        setMaxPasswordAge(maxPasswordAge);
        return this;
    }

    /**
     * <p>
     * Specifies the number of previous passwords that IAM users are prevented from reusing.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>0</code>.
     * The result is that IAM users are not prevented from reusing previous passwords.
     * </p>
     * 
     * @param passwordReusePrevention
     *        Specifies the number of previous passwords that IAM users are prevented from reusing.</p>
     *        <p>
     *        If you do not specify a value for this parameter, then the operation uses the default value of
     *        <code>0</code>. The result is that IAM users are not prevented from reusing previous passwords.
     */

    public void setPasswordReusePrevention(Integer passwordReusePrevention) {
        this.passwordReusePrevention = passwordReusePrevention;
    }

    /**
     * <p>
     * Specifies the number of previous passwords that IAM users are prevented from reusing.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>0</code>.
     * The result is that IAM users are not prevented from reusing previous passwords.
     * </p>
     * 
     * @return Specifies the number of previous passwords that IAM users are prevented from reusing.</p>
     *         <p>
     *         If you do not specify a value for this parameter, then the operation uses the default value of
     *         <code>0</code>. The result is that IAM users are not prevented from reusing previous passwords.
     */

    public Integer getPasswordReusePrevention() {
        return this.passwordReusePrevention;
    }

    /**
     * <p>
     * Specifies the number of previous passwords that IAM users are prevented from reusing.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>0</code>.
     * The result is that IAM users are not prevented from reusing previous passwords.
     * </p>
     * 
     * @param passwordReusePrevention
     *        Specifies the number of previous passwords that IAM users are prevented from reusing.</p>
     *        <p>
     *        If you do not specify a value for this parameter, then the operation uses the default value of
     *        <code>0</code>. The result is that IAM users are not prevented from reusing previous passwords.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountPasswordPolicyRequest withPasswordReusePrevention(Integer passwordReusePrevention) {
        setPasswordReusePrevention(passwordReusePrevention);
        return this;
    }

    /**
     * <p>
     * Prevents IAM users from setting a new password after their password has expired. The IAM user cannot be accessed
     * until an administrator resets the password.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>false</code>
     * . The result is that IAM users can change their passwords after they expire and continue to sign in as the user.
     * </p>
     * 
     * @param hardExpiry
     *        Prevents IAM users from setting a new password after their password has expired. The IAM user cannot be
     *        accessed until an administrator resets the password.</p>
     *        <p>
     *        If you do not specify a value for this parameter, then the operation uses the default value of
     *        <code>false</code>. The result is that IAM users can change their passwords after they expire and continue
     *        to sign in as the user.
     */

    public void setHardExpiry(Boolean hardExpiry) {
        this.hardExpiry = hardExpiry;
    }

    /**
     * <p>
     * Prevents IAM users from setting a new password after their password has expired. The IAM user cannot be accessed
     * until an administrator resets the password.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>false</code>
     * . The result is that IAM users can change their passwords after they expire and continue to sign in as the user.
     * </p>
     * 
     * @return Prevents IAM users from setting a new password after their password has expired. The IAM user cannot be
     *         accessed until an administrator resets the password.</p>
     *         <p>
     *         If you do not specify a value for this parameter, then the operation uses the default value of
     *         <code>false</code>. The result is that IAM users can change their passwords after they expire and
     *         continue to sign in as the user.
     */

    public Boolean getHardExpiry() {
        return this.hardExpiry;
    }

    /**
     * <p>
     * Prevents IAM users from setting a new password after their password has expired. The IAM user cannot be accessed
     * until an administrator resets the password.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>false</code>
     * . The result is that IAM users can change their passwords after they expire and continue to sign in as the user.
     * </p>
     * 
     * @param hardExpiry
     *        Prevents IAM users from setting a new password after their password has expired. The IAM user cannot be
     *        accessed until an administrator resets the password.</p>
     *        <p>
     *        If you do not specify a value for this parameter, then the operation uses the default value of
     *        <code>false</code>. The result is that IAM users can change their passwords after they expire and continue
     *        to sign in as the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountPasswordPolicyRequest withHardExpiry(Boolean hardExpiry) {
        setHardExpiry(hardExpiry);
        return this;
    }

    /**
     * <p>
     * Prevents IAM users from setting a new password after their password has expired. The IAM user cannot be accessed
     * until an administrator resets the password.
     * </p>
     * <p>
     * If you do not specify a value for this parameter, then the operation uses the default value of <code>false</code>
     * . The result is that IAM users can change their passwords after they expire and continue to sign in as the user.
     * </p>
     * 
     * @return Prevents IAM users from setting a new password after their password has expired. The IAM user cannot be
     *         accessed until an administrator resets the password.</p>
     *         <p>
     *         If you do not specify a value for this parameter, then the operation uses the default value of
     *         <code>false</code>. The result is that IAM users can change their passwords after they expire and
     *         continue to sign in as the user.
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
