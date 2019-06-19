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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/CreateGovCloudAccount"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGovCloudAccountRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The email address of the owner to assign to the new member account in the commercial Region. This email address
     * must not already be associated with another AWS account. You must use a valid email address to complete account
     * creation. You can't access the root user of the account or remove an account that was created with an invalid
     * email address. Like all request parameters for <code>CreateGovCloudAccount</code>, the request for the email
     * address for the AWS GovCloud (US) account originates from the commercial Region, not from the AWS GovCloud (US)
     * Region.
     * </p>
     */
    private String email;
    /**
     * <p>
     * The friendly name of the member account.
     * </p>
     */
    private String accountName;
    /**
     * <p>
     * (Optional)
     * </p>
     * <p>
     * The name of an IAM role that AWS Organizations automatically preconfigures in the new member accounts in both the
     * AWS GovCloud (US) Region and in the commercial Region. This role trusts the master account, allowing users in the
     * master account to assume the role, as permitted by the master account administrator. The role has administrator
     * permissions in the new member account.
     * </p>
     * <p>
     * If you don't specify this parameter, the role name defaults to <code>OrganizationAccountAccessRole</code>.
     * </p>
     * <p>
     * For more information about how to use this role to access the member account, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_access.html#orgs_manage_accounts_create-cross-account-role"
     * >Accessing and Administering the Member Accounts in Your Organization</a> in the <i>AWS Organizations User
     * Guide</i> and steps 2 and 3 in <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_cross-account-with-roles.html">Tutorial: Delegate
     * Access Across AWS Accounts Using IAM Roles</a> in the <i>IAM User Guide.</i>
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is a
     * string of characters that can consist of uppercase letters, lowercase letters, digits with no spaces, and any of
     * the following characters: =,.@-
     * </p>
     */
    private String roleName;
    /**
     * <p>
     * If set to <code>ALLOW</code>, the new linked account in the commercial Region enables IAM users to access account
     * billing information <i>if</i> they have the required permissions. If set to <code>DENY</code>, only the root user
     * of the new account can access account billing information. For more information, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html#ControllingAccessWebsite-Activate"
     * >Activating Access to the Billing and Cost Management Console</a> in the <i>AWS Billing and Cost Management User
     * Guide.</i>
     * </p>
     * <p>
     * If you don't specify this parameter, the value defaults to <code>ALLOW</code>, and IAM users and roles with the
     * required permissions can access billing information for the new account.
     * </p>
     */
    private String iamUserAccessToBilling;

    /**
     * <p>
     * The email address of the owner to assign to the new member account in the commercial Region. This email address
     * must not already be associated with another AWS account. You must use a valid email address to complete account
     * creation. You can't access the root user of the account or remove an account that was created with an invalid
     * email address. Like all request parameters for <code>CreateGovCloudAccount</code>, the request for the email
     * address for the AWS GovCloud (US) account originates from the commercial Region, not from the AWS GovCloud (US)
     * Region.
     * </p>
     * 
     * @param email
     *        The email address of the owner to assign to the new member account in the commercial Region. This email
     *        address must not already be associated with another AWS account. You must use a valid email address to
     *        complete account creation. You can't access the root user of the account or remove an account that was
     *        created with an invalid email address. Like all request parameters for <code>CreateGovCloudAccount</code>,
     *        the request for the email address for the AWS GovCloud (US) account originates from the commercial Region,
     *        not from the AWS GovCloud (US) Region.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email address of the owner to assign to the new member account in the commercial Region. This email address
     * must not already be associated with another AWS account. You must use a valid email address to complete account
     * creation. You can't access the root user of the account or remove an account that was created with an invalid
     * email address. Like all request parameters for <code>CreateGovCloudAccount</code>, the request for the email
     * address for the AWS GovCloud (US) account originates from the commercial Region, not from the AWS GovCloud (US)
     * Region.
     * </p>
     * 
     * @return The email address of the owner to assign to the new member account in the commercial Region. This email
     *         address must not already be associated with another AWS account. You must use a valid email address to
     *         complete account creation. You can't access the root user of the account or remove an account that was
     *         created with an invalid email address. Like all request parameters for <code>CreateGovCloudAccount</code>
     *         , the request for the email address for the AWS GovCloud (US) account originates from the commercial
     *         Region, not from the AWS GovCloud (US) Region.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * The email address of the owner to assign to the new member account in the commercial Region. This email address
     * must not already be associated with another AWS account. You must use a valid email address to complete account
     * creation. You can't access the root user of the account or remove an account that was created with an invalid
     * email address. Like all request parameters for <code>CreateGovCloudAccount</code>, the request for the email
     * address for the AWS GovCloud (US) account originates from the commercial Region, not from the AWS GovCloud (US)
     * Region.
     * </p>
     * 
     * @param email
     *        The email address of the owner to assign to the new member account in the commercial Region. This email
     *        address must not already be associated with another AWS account. You must use a valid email address to
     *        complete account creation. You can't access the root user of the account or remove an account that was
     *        created with an invalid email address. Like all request parameters for <code>CreateGovCloudAccount</code>,
     *        the request for the email address for the AWS GovCloud (US) account originates from the commercial Region,
     *        not from the AWS GovCloud (US) Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGovCloudAccountRequest withEmail(String email) {
        setEmail(email);
        return this;
    }

    /**
     * <p>
     * The friendly name of the member account.
     * </p>
     * 
     * @param accountName
     *        The friendly name of the member account.
     */

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * <p>
     * The friendly name of the member account.
     * </p>
     * 
     * @return The friendly name of the member account.
     */

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * <p>
     * The friendly name of the member account.
     * </p>
     * 
     * @param accountName
     *        The friendly name of the member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGovCloudAccountRequest withAccountName(String accountName) {
        setAccountName(accountName);
        return this;
    }

    /**
     * <p>
     * (Optional)
     * </p>
     * <p>
     * The name of an IAM role that AWS Organizations automatically preconfigures in the new member accounts in both the
     * AWS GovCloud (US) Region and in the commercial Region. This role trusts the master account, allowing users in the
     * master account to assume the role, as permitted by the master account administrator. The role has administrator
     * permissions in the new member account.
     * </p>
     * <p>
     * If you don't specify this parameter, the role name defaults to <code>OrganizationAccountAccessRole</code>.
     * </p>
     * <p>
     * For more information about how to use this role to access the member account, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_access.html#orgs_manage_accounts_create-cross-account-role"
     * >Accessing and Administering the Member Accounts in Your Organization</a> in the <i>AWS Organizations User
     * Guide</i> and steps 2 and 3 in <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_cross-account-with-roles.html">Tutorial: Delegate
     * Access Across AWS Accounts Using IAM Roles</a> in the <i>IAM User Guide.</i>
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is a
     * string of characters that can consist of uppercase letters, lowercase letters, digits with no spaces, and any of
     * the following characters: =,.@-
     * </p>
     * 
     * @param roleName
     *        (Optional)</p>
     *        <p>
     *        The name of an IAM role that AWS Organizations automatically preconfigures in the new member accounts in
     *        both the AWS GovCloud (US) Region and in the commercial Region. This role trusts the master account,
     *        allowing users in the master account to assume the role, as permitted by the master account administrator.
     *        The role has administrator permissions in the new member account.
     *        </p>
     *        <p>
     *        If you don't specify this parameter, the role name defaults to <code>OrganizationAccountAccessRole</code>.
     *        </p>
     *        <p>
     *        For more information about how to use this role to access the member account, see <a href=
     *        "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_access.html#orgs_manage_accounts_create-cross-account-role"
     *        >Accessing and Administering the Member Accounts in Your Organization</a> in the <i>AWS Organizations User
     *        Guide</i> and steps 2 and 3 in <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_cross-account-with-roles.html">Tutorial:
     *        Delegate Access Across AWS Accounts Using IAM Roles</a> in the <i>IAM User Guide.</i>
     *        </p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is
     *        a string of characters that can consist of uppercase letters, lowercase letters, digits with no spaces,
     *        and any of the following characters: =,.@-
     */

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * (Optional)
     * </p>
     * <p>
     * The name of an IAM role that AWS Organizations automatically preconfigures in the new member accounts in both the
     * AWS GovCloud (US) Region and in the commercial Region. This role trusts the master account, allowing users in the
     * master account to assume the role, as permitted by the master account administrator. The role has administrator
     * permissions in the new member account.
     * </p>
     * <p>
     * If you don't specify this parameter, the role name defaults to <code>OrganizationAccountAccessRole</code>.
     * </p>
     * <p>
     * For more information about how to use this role to access the member account, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_access.html#orgs_manage_accounts_create-cross-account-role"
     * >Accessing and Administering the Member Accounts in Your Organization</a> in the <i>AWS Organizations User
     * Guide</i> and steps 2 and 3 in <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_cross-account-with-roles.html">Tutorial: Delegate
     * Access Across AWS Accounts Using IAM Roles</a> in the <i>IAM User Guide.</i>
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is a
     * string of characters that can consist of uppercase letters, lowercase letters, digits with no spaces, and any of
     * the following characters: =,.@-
     * </p>
     * 
     * @return (Optional)</p>
     *         <p>
     *         The name of an IAM role that AWS Organizations automatically preconfigures in the new member accounts in
     *         both the AWS GovCloud (US) Region and in the commercial Region. This role trusts the master account,
     *         allowing users in the master account to assume the role, as permitted by the master account
     *         administrator. The role has administrator permissions in the new member account.
     *         </p>
     *         <p>
     *         If you don't specify this parameter, the role name defaults to <code>OrganizationAccountAccessRole</code>
     *         .
     *         </p>
     *         <p>
     *         For more information about how to use this role to access the member account, see <a href=
     *         "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_access.html#orgs_manage_accounts_create-cross-account-role"
     *         >Accessing and Administering the Member Accounts in Your Organization</a> in the <i>AWS Organizations
     *         User Guide</i> and steps 2 and 3 in <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_cross-account-with-roles.html">Tutorial:
     *         Delegate Access Across AWS Accounts Using IAM Roles</a> in the <i>IAM User Guide.</i>
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter
     *         is a string of characters that can consist of uppercase letters, lowercase letters, digits with no
     *         spaces, and any of the following characters: =,.@-
     */

    public String getRoleName() {
        return this.roleName;
    }

    /**
     * <p>
     * (Optional)
     * </p>
     * <p>
     * The name of an IAM role that AWS Organizations automatically preconfigures in the new member accounts in both the
     * AWS GovCloud (US) Region and in the commercial Region. This role trusts the master account, allowing users in the
     * master account to assume the role, as permitted by the master account administrator. The role has administrator
     * permissions in the new member account.
     * </p>
     * <p>
     * If you don't specify this parameter, the role name defaults to <code>OrganizationAccountAccessRole</code>.
     * </p>
     * <p>
     * For more information about how to use this role to access the member account, see <a href=
     * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_access.html#orgs_manage_accounts_create-cross-account-role"
     * >Accessing and Administering the Member Accounts in Your Organization</a> in the <i>AWS Organizations User
     * Guide</i> and steps 2 and 3 in <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_cross-account-with-roles.html">Tutorial: Delegate
     * Access Across AWS Accounts Using IAM Roles</a> in the <i>IAM User Guide.</i>
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is a
     * string of characters that can consist of uppercase letters, lowercase letters, digits with no spaces, and any of
     * the following characters: =,.@-
     * </p>
     * 
     * @param roleName
     *        (Optional)</p>
     *        <p>
     *        The name of an IAM role that AWS Organizations automatically preconfigures in the new member accounts in
     *        both the AWS GovCloud (US) Region and in the commercial Region. This role trusts the master account,
     *        allowing users in the master account to assume the role, as permitted by the master account administrator.
     *        The role has administrator permissions in the new member account.
     *        </p>
     *        <p>
     *        If you don't specify this parameter, the role name defaults to <code>OrganizationAccountAccessRole</code>.
     *        </p>
     *        <p>
     *        For more information about how to use this role to access the member account, see <a href=
     *        "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_access.html#orgs_manage_accounts_create-cross-account-role"
     *        >Accessing and Administering the Member Accounts in Your Organization</a> in the <i>AWS Organizations User
     *        Guide</i> and steps 2 and 3 in <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_cross-account-with-roles.html">Tutorial:
     *        Delegate Access Across AWS Accounts Using IAM Roles</a> in the <i>IAM User Guide.</i>
     *        </p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is
     *        a string of characters that can consist of uppercase letters, lowercase letters, digits with no spaces,
     *        and any of the following characters: =,.@-
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGovCloudAccountRequest withRoleName(String roleName) {
        setRoleName(roleName);
        return this;
    }

    /**
     * <p>
     * If set to <code>ALLOW</code>, the new linked account in the commercial Region enables IAM users to access account
     * billing information <i>if</i> they have the required permissions. If set to <code>DENY</code>, only the root user
     * of the new account can access account billing information. For more information, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html#ControllingAccessWebsite-Activate"
     * >Activating Access to the Billing and Cost Management Console</a> in the <i>AWS Billing and Cost Management User
     * Guide.</i>
     * </p>
     * <p>
     * If you don't specify this parameter, the value defaults to <code>ALLOW</code>, and IAM users and roles with the
     * required permissions can access billing information for the new account.
     * </p>
     * 
     * @param iamUserAccessToBilling
     *        If set to <code>ALLOW</code>, the new linked account in the commercial Region enables IAM users to access
     *        account billing information <i>if</i> they have the required permissions. If set to <code>DENY</code>,
     *        only the root user of the new account can access account billing information. For more information, see <a
     *        href=
     *        "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html#ControllingAccessWebsite-Activate"
     *        >Activating Access to the Billing and Cost Management Console</a> in the <i>AWS Billing and Cost
     *        Management User Guide.</i> </p>
     *        <p>
     *        If you don't specify this parameter, the value defaults to <code>ALLOW</code>, and IAM users and roles
     *        with the required permissions can access billing information for the new account.
     * @see IAMUserAccessToBilling
     */

    public void setIamUserAccessToBilling(String iamUserAccessToBilling) {
        this.iamUserAccessToBilling = iamUserAccessToBilling;
    }

    /**
     * <p>
     * If set to <code>ALLOW</code>, the new linked account in the commercial Region enables IAM users to access account
     * billing information <i>if</i> they have the required permissions. If set to <code>DENY</code>, only the root user
     * of the new account can access account billing information. For more information, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html#ControllingAccessWebsite-Activate"
     * >Activating Access to the Billing and Cost Management Console</a> in the <i>AWS Billing and Cost Management User
     * Guide.</i>
     * </p>
     * <p>
     * If you don't specify this parameter, the value defaults to <code>ALLOW</code>, and IAM users and roles with the
     * required permissions can access billing information for the new account.
     * </p>
     * 
     * @return If set to <code>ALLOW</code>, the new linked account in the commercial Region enables IAM users to access
     *         account billing information <i>if</i> they have the required permissions. If set to <code>DENY</code>,
     *         only the root user of the new account can access account billing information. For more information, see
     *         <a href=
     *         "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html#ControllingAccessWebsite-Activate"
     *         >Activating Access to the Billing and Cost Management Console</a> in the <i>AWS Billing and Cost
     *         Management User Guide.</i> </p>
     *         <p>
     *         If you don't specify this parameter, the value defaults to <code>ALLOW</code>, and IAM users and roles
     *         with the required permissions can access billing information for the new account.
     * @see IAMUserAccessToBilling
     */

    public String getIamUserAccessToBilling() {
        return this.iamUserAccessToBilling;
    }

    /**
     * <p>
     * If set to <code>ALLOW</code>, the new linked account in the commercial Region enables IAM users to access account
     * billing information <i>if</i> they have the required permissions. If set to <code>DENY</code>, only the root user
     * of the new account can access account billing information. For more information, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html#ControllingAccessWebsite-Activate"
     * >Activating Access to the Billing and Cost Management Console</a> in the <i>AWS Billing and Cost Management User
     * Guide.</i>
     * </p>
     * <p>
     * If you don't specify this parameter, the value defaults to <code>ALLOW</code>, and IAM users and roles with the
     * required permissions can access billing information for the new account.
     * </p>
     * 
     * @param iamUserAccessToBilling
     *        If set to <code>ALLOW</code>, the new linked account in the commercial Region enables IAM users to access
     *        account billing information <i>if</i> they have the required permissions. If set to <code>DENY</code>,
     *        only the root user of the new account can access account billing information. For more information, see <a
     *        href=
     *        "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html#ControllingAccessWebsite-Activate"
     *        >Activating Access to the Billing and Cost Management Console</a> in the <i>AWS Billing and Cost
     *        Management User Guide.</i> </p>
     *        <p>
     *        If you don't specify this parameter, the value defaults to <code>ALLOW</code>, and IAM users and roles
     *        with the required permissions can access billing information for the new account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IAMUserAccessToBilling
     */

    public CreateGovCloudAccountRequest withIamUserAccessToBilling(String iamUserAccessToBilling) {
        setIamUserAccessToBilling(iamUserAccessToBilling);
        return this;
    }

    /**
     * <p>
     * If set to <code>ALLOW</code>, the new linked account in the commercial Region enables IAM users to access account
     * billing information <i>if</i> they have the required permissions. If set to <code>DENY</code>, only the root user
     * of the new account can access account billing information. For more information, see <a href=
     * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html#ControllingAccessWebsite-Activate"
     * >Activating Access to the Billing and Cost Management Console</a> in the <i>AWS Billing and Cost Management User
     * Guide.</i>
     * </p>
     * <p>
     * If you don't specify this parameter, the value defaults to <code>ALLOW</code>, and IAM users and roles with the
     * required permissions can access billing information for the new account.
     * </p>
     * 
     * @param iamUserAccessToBilling
     *        If set to <code>ALLOW</code>, the new linked account in the commercial Region enables IAM users to access
     *        account billing information <i>if</i> they have the required permissions. If set to <code>DENY</code>,
     *        only the root user of the new account can access account billing information. For more information, see <a
     *        href=
     *        "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/grantaccess.html#ControllingAccessWebsite-Activate"
     *        >Activating Access to the Billing and Cost Management Console</a> in the <i>AWS Billing and Cost
     *        Management User Guide.</i> </p>
     *        <p>
     *        If you don't specify this parameter, the value defaults to <code>ALLOW</code>, and IAM users and roles
     *        with the required permissions can access billing information for the new account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IAMUserAccessToBilling
     */

    public CreateGovCloudAccountRequest withIamUserAccessToBilling(IAMUserAccessToBilling iamUserAccessToBilling) {
        this.iamUserAccessToBilling = iamUserAccessToBilling.toString();
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
        if (getEmail() != null)
            sb.append("Email: ").append("***Sensitive Data Redacted***").append(",");
        if (getAccountName() != null)
            sb.append("AccountName: ").append("***Sensitive Data Redacted***").append(",");
        if (getRoleName() != null)
            sb.append("RoleName: ").append(getRoleName()).append(",");
        if (getIamUserAccessToBilling() != null)
            sb.append("IamUserAccessToBilling: ").append(getIamUserAccessToBilling());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGovCloudAccountRequest == false)
            return false;
        CreateGovCloudAccountRequest other = (CreateGovCloudAccountRequest) obj;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getAccountName() == null ^ this.getAccountName() == null)
            return false;
        if (other.getAccountName() != null && other.getAccountName().equals(this.getAccountName()) == false)
            return false;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        if (other.getIamUserAccessToBilling() == null ^ this.getIamUserAccessToBilling() == null)
            return false;
        if (other.getIamUserAccessToBilling() != null && other.getIamUserAccessToBilling().equals(this.getIamUserAccessToBilling()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getAccountName() == null) ? 0 : getAccountName().hashCode());
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        hashCode = prime * hashCode + ((getIamUserAccessToBilling() == null) ? 0 : getIamUserAccessToBilling().hashCode());
        return hashCode;
    }

    @Override
    public CreateGovCloudAccountRequest clone() {
        return (CreateGovCloudAccountRequest) super.clone();
    }

}
