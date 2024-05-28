/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateAccountSubscription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAccountSubscriptionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The edition of Amazon QuickSight that you want your account to have. Currently, you can choose from
     * <code>ENTERPRISE</code> or <code>ENTERPRISE_AND_Q</code>.
     * </p>
     * <p>
     * If you choose <code>ENTERPRISE_AND_Q</code>, the following parameters are required:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FirstName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EmailAddress</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContactNumber</code>
     * </p>
     * </li>
     * </ul>
     */
    private String edition;
    /**
     * <p>
     * The method that you want to use to authenticate your Amazon QuickSight account.
     * </p>
     * <p>
     * If you choose <code>ACTIVE_DIRECTORY</code>, provide an <code>ActiveDirectoryName</code> and an
     * <code>AdminGroup</code> associated with your Active Directory.
     * </p>
     * <p>
     * If you choose <code>IAM_IDENTITY_CENTER</code>, provide an <code>AdminGroup</code> associated with your IAM
     * Identity Center account.
     * </p>
     */
    private String authenticationMethod;
    /**
     * <p>
     * The Amazon Web Services account ID of the account that you're using to create your Amazon QuickSight account.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The name of your Amazon QuickSight account. This name is unique over all of Amazon Web Services, and it appears
     * only when users sign in. You can't change <code>AccountName</code> value after the Amazon QuickSight account is
     * created.
     * </p>
     */
    private String accountName;
    /**
     * <p>
     * The email address that you want Amazon QuickSight to send notifications to regarding your Amazon QuickSight
     * account or Amazon QuickSight subscription.
     * </p>
     */
    private String notificationEmail;
    /**
     * <p>
     * The name of your Active Directory. This field is required if <code>ACTIVE_DIRECTORY</code> is the selected
     * authentication method of the new Amazon QuickSight account.
     * </p>
     */
    private String activeDirectoryName;
    /**
     * <p>
     * The realm of the Active Directory that is associated with your Amazon QuickSight account. This field is required
     * if <code>ACTIVE_DIRECTORY</code> is the selected authentication method of the new Amazon QuickSight account.
     * </p>
     */
    private String realm;
    /**
     * <p>
     * The ID of the Active Directory that is associated with your Amazon QuickSight account.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The admin group associated with your Active Directory or IAM Identity Center account. Either this field or the
     * <code>AdminProGroup</code> field is required if <code>ACTIVE_DIRECTORY</code> or <code>IAM_IDENTITY_CENTER</code>
     * is the selected authentication method of the new Amazon QuickSight account.
     * </p>
     * <p>
     * For more information about using IAM Identity Center in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html">Using IAM
     * Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide. For more
     * information about using Active Directory in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active Directory with
     * Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * </p>
     */
    private java.util.List<String> adminGroup;
    /**
     * <p>
     * The author group associated with your Active Directory or IAM Identity Center account.
     * </p>
     * <p>
     * For more information about using IAM Identity Center in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html">Using IAM
     * Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide. For more
     * information about using Active Directory in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active Directory with
     * Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * </p>
     */
    private java.util.List<String> authorGroup;
    /**
     * <p>
     * The reader group associated with your Active Directory or IAM Identity Center account.
     * </p>
     * <p>
     * For more information about using IAM Identity Center in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html">Using IAM
     * Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide. For more
     * information about using Active Directory in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active Directory with
     * Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * </p>
     */
    private java.util.List<String> readerGroup;
    /**
     * <p>
     * The admin pro group associated with your Active Directory or IAM Identity Center account. Either this field or
     * the <code>AdminGroup</code> field is required if <code>ACTIVE_DIRECTORY</code> or
     * <code>IAM_IDENTITY_CENTER</code> is the selected authentication method of the new Amazon QuickSight account.
     * </p>
     * <p>
     * For more information about using IAM Identity Center in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html">Using IAM
     * Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide. For more
     * information about using Active Directory in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active Directory with
     * Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * </p>
     */
    private java.util.List<String> adminProGroup;
    /**
     * <p>
     * The author pro group associated with your Active Directory or IAM Identity Center account.
     * </p>
     * <p>
     * For more information about using IAM Identity Center in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html">Using IAM
     * Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide. For more
     * information about using Active Directory in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active Directory with
     * Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * </p>
     */
    private java.util.List<String> authorProGroup;
    /**
     * <p>
     * The reader pro group associated with your Active Directory or IAM Identity Center account.
     * </p>
     * <p>
     * For more information about using IAM Identity Center in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html">Using IAM
     * Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide. For more
     * information about using Active Directory in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active Directory with
     * Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * </p>
     */
    private java.util.List<String> readerProGroup;
    /**
     * <p>
     * The first name of the author of the Amazon QuickSight account to use for future communications. This field is
     * required if <code>ENTERPPRISE_AND_Q</code> is the selected edition of the new Amazon QuickSight account.
     * </p>
     */
    private String firstName;
    /**
     * <p>
     * The last name of the author of the Amazon QuickSight account to use for future communications. This field is
     * required if <code>ENTERPPRISE_AND_Q</code> is the selected edition of the new Amazon QuickSight account.
     * </p>
     */
    private String lastName;
    /**
     * <p>
     * The email address of the author of the Amazon QuickSight account to use for future communications. This field is
     * required if <code>ENTERPPRISE_AND_Q</code> is the selected edition of the new Amazon QuickSight account.
     * </p>
     */
    private String emailAddress;
    /**
     * <p>
     * A 10-digit phone number for the author of the Amazon QuickSight account to use for future communications. This
     * field is required if <code>ENTERPPRISE_AND_Q</code> is the selected edition of the new Amazon QuickSight account.
     * </p>
     */
    private String contactNumber;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the IAM Identity Center instance.
     * </p>
     */
    private String iAMIdentityCenterInstanceArn;

    /**
     * <p>
     * The edition of Amazon QuickSight that you want your account to have. Currently, you can choose from
     * <code>ENTERPRISE</code> or <code>ENTERPRISE_AND_Q</code>.
     * </p>
     * <p>
     * If you choose <code>ENTERPRISE_AND_Q</code>, the following parameters are required:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FirstName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EmailAddress</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContactNumber</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param edition
     *        The edition of Amazon QuickSight that you want your account to have. Currently, you can choose from
     *        <code>ENTERPRISE</code> or <code>ENTERPRISE_AND_Q</code>.</p>
     *        <p>
     *        If you choose <code>ENTERPRISE_AND_Q</code>, the following parameters are required:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FirstName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LastName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EmailAddress</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ContactNumber</code>
     *        </p>
     *        </li>
     * @see Edition
     */

    public void setEdition(String edition) {
        this.edition = edition;
    }

    /**
     * <p>
     * The edition of Amazon QuickSight that you want your account to have. Currently, you can choose from
     * <code>ENTERPRISE</code> or <code>ENTERPRISE_AND_Q</code>.
     * </p>
     * <p>
     * If you choose <code>ENTERPRISE_AND_Q</code>, the following parameters are required:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FirstName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EmailAddress</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContactNumber</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The edition of Amazon QuickSight that you want your account to have. Currently, you can choose from
     *         <code>ENTERPRISE</code> or <code>ENTERPRISE_AND_Q</code>.</p>
     *         <p>
     *         If you choose <code>ENTERPRISE_AND_Q</code>, the following parameters are required:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>FirstName</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LastName</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EmailAddress</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ContactNumber</code>
     *         </p>
     *         </li>
     * @see Edition
     */

    public String getEdition() {
        return this.edition;
    }

    /**
     * <p>
     * The edition of Amazon QuickSight that you want your account to have. Currently, you can choose from
     * <code>ENTERPRISE</code> or <code>ENTERPRISE_AND_Q</code>.
     * </p>
     * <p>
     * If you choose <code>ENTERPRISE_AND_Q</code>, the following parameters are required:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FirstName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EmailAddress</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContactNumber</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param edition
     *        The edition of Amazon QuickSight that you want your account to have. Currently, you can choose from
     *        <code>ENTERPRISE</code> or <code>ENTERPRISE_AND_Q</code>.</p>
     *        <p>
     *        If you choose <code>ENTERPRISE_AND_Q</code>, the following parameters are required:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FirstName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LastName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EmailAddress</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ContactNumber</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Edition
     */

    public CreateAccountSubscriptionRequest withEdition(String edition) {
        setEdition(edition);
        return this;
    }

    /**
     * <p>
     * The edition of Amazon QuickSight that you want your account to have. Currently, you can choose from
     * <code>ENTERPRISE</code> or <code>ENTERPRISE_AND_Q</code>.
     * </p>
     * <p>
     * If you choose <code>ENTERPRISE_AND_Q</code>, the following parameters are required:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FirstName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EmailAddress</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContactNumber</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param edition
     *        The edition of Amazon QuickSight that you want your account to have. Currently, you can choose from
     *        <code>ENTERPRISE</code> or <code>ENTERPRISE_AND_Q</code>.</p>
     *        <p>
     *        If you choose <code>ENTERPRISE_AND_Q</code>, the following parameters are required:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FirstName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LastName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EmailAddress</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ContactNumber</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Edition
     */

    public CreateAccountSubscriptionRequest withEdition(Edition edition) {
        this.edition = edition.toString();
        return this;
    }

    /**
     * <p>
     * The method that you want to use to authenticate your Amazon QuickSight account.
     * </p>
     * <p>
     * If you choose <code>ACTIVE_DIRECTORY</code>, provide an <code>ActiveDirectoryName</code> and an
     * <code>AdminGroup</code> associated with your Active Directory.
     * </p>
     * <p>
     * If you choose <code>IAM_IDENTITY_CENTER</code>, provide an <code>AdminGroup</code> associated with your IAM
     * Identity Center account.
     * </p>
     * 
     * @param authenticationMethod
     *        The method that you want to use to authenticate your Amazon QuickSight account.</p>
     *        <p>
     *        If you choose <code>ACTIVE_DIRECTORY</code>, provide an <code>ActiveDirectoryName</code> and an
     *        <code>AdminGroup</code> associated with your Active Directory.
     *        </p>
     *        <p>
     *        If you choose <code>IAM_IDENTITY_CENTER</code>, provide an <code>AdminGroup</code> associated with your
     *        IAM Identity Center account.
     * @see AuthenticationMethodOption
     */

    public void setAuthenticationMethod(String authenticationMethod) {
        this.authenticationMethod = authenticationMethod;
    }

    /**
     * <p>
     * The method that you want to use to authenticate your Amazon QuickSight account.
     * </p>
     * <p>
     * If you choose <code>ACTIVE_DIRECTORY</code>, provide an <code>ActiveDirectoryName</code> and an
     * <code>AdminGroup</code> associated with your Active Directory.
     * </p>
     * <p>
     * If you choose <code>IAM_IDENTITY_CENTER</code>, provide an <code>AdminGroup</code> associated with your IAM
     * Identity Center account.
     * </p>
     * 
     * @return The method that you want to use to authenticate your Amazon QuickSight account.</p>
     *         <p>
     *         If you choose <code>ACTIVE_DIRECTORY</code>, provide an <code>ActiveDirectoryName</code> and an
     *         <code>AdminGroup</code> associated with your Active Directory.
     *         </p>
     *         <p>
     *         If you choose <code>IAM_IDENTITY_CENTER</code>, provide an <code>AdminGroup</code> associated with your
     *         IAM Identity Center account.
     * @see AuthenticationMethodOption
     */

    public String getAuthenticationMethod() {
        return this.authenticationMethod;
    }

    /**
     * <p>
     * The method that you want to use to authenticate your Amazon QuickSight account.
     * </p>
     * <p>
     * If you choose <code>ACTIVE_DIRECTORY</code>, provide an <code>ActiveDirectoryName</code> and an
     * <code>AdminGroup</code> associated with your Active Directory.
     * </p>
     * <p>
     * If you choose <code>IAM_IDENTITY_CENTER</code>, provide an <code>AdminGroup</code> associated with your IAM
     * Identity Center account.
     * </p>
     * 
     * @param authenticationMethod
     *        The method that you want to use to authenticate your Amazon QuickSight account.</p>
     *        <p>
     *        If you choose <code>ACTIVE_DIRECTORY</code>, provide an <code>ActiveDirectoryName</code> and an
     *        <code>AdminGroup</code> associated with your Active Directory.
     *        </p>
     *        <p>
     *        If you choose <code>IAM_IDENTITY_CENTER</code>, provide an <code>AdminGroup</code> associated with your
     *        IAM Identity Center account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationMethodOption
     */

    public CreateAccountSubscriptionRequest withAuthenticationMethod(String authenticationMethod) {
        setAuthenticationMethod(authenticationMethod);
        return this;
    }

    /**
     * <p>
     * The method that you want to use to authenticate your Amazon QuickSight account.
     * </p>
     * <p>
     * If you choose <code>ACTIVE_DIRECTORY</code>, provide an <code>ActiveDirectoryName</code> and an
     * <code>AdminGroup</code> associated with your Active Directory.
     * </p>
     * <p>
     * If you choose <code>IAM_IDENTITY_CENTER</code>, provide an <code>AdminGroup</code> associated with your IAM
     * Identity Center account.
     * </p>
     * 
     * @param authenticationMethod
     *        The method that you want to use to authenticate your Amazon QuickSight account.</p>
     *        <p>
     *        If you choose <code>ACTIVE_DIRECTORY</code>, provide an <code>ActiveDirectoryName</code> and an
     *        <code>AdminGroup</code> associated with your Active Directory.
     *        </p>
     *        <p>
     *        If you choose <code>IAM_IDENTITY_CENTER</code>, provide an <code>AdminGroup</code> associated with your
     *        IAM Identity Center account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticationMethodOption
     */

    public CreateAccountSubscriptionRequest withAuthenticationMethod(AuthenticationMethodOption authenticationMethod) {
        this.authenticationMethod = authenticationMethod.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the account that you're using to create your Amazon QuickSight account.
     * </p>
     * 
     * @param awsAccountId
     *        The Amazon Web Services account ID of the account that you're using to create your Amazon QuickSight
     *        account.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the account that you're using to create your Amazon QuickSight account.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the account that you're using to create your Amazon QuickSight
     *         account.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the account that you're using to create your Amazon QuickSight account.
     * </p>
     * 
     * @param awsAccountId
     *        The Amazon Web Services account ID of the account that you're using to create your Amazon QuickSight
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountSubscriptionRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The name of your Amazon QuickSight account. This name is unique over all of Amazon Web Services, and it appears
     * only when users sign in. You can't change <code>AccountName</code> value after the Amazon QuickSight account is
     * created.
     * </p>
     * 
     * @param accountName
     *        The name of your Amazon QuickSight account. This name is unique over all of Amazon Web Services, and it
     *        appears only when users sign in. You can't change <code>AccountName</code> value after the Amazon
     *        QuickSight account is created.
     */

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * <p>
     * The name of your Amazon QuickSight account. This name is unique over all of Amazon Web Services, and it appears
     * only when users sign in. You can't change <code>AccountName</code> value after the Amazon QuickSight account is
     * created.
     * </p>
     * 
     * @return The name of your Amazon QuickSight account. This name is unique over all of Amazon Web Services, and it
     *         appears only when users sign in. You can't change <code>AccountName</code> value after the Amazon
     *         QuickSight account is created.
     */

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * <p>
     * The name of your Amazon QuickSight account. This name is unique over all of Amazon Web Services, and it appears
     * only when users sign in. You can't change <code>AccountName</code> value after the Amazon QuickSight account is
     * created.
     * </p>
     * 
     * @param accountName
     *        The name of your Amazon QuickSight account. This name is unique over all of Amazon Web Services, and it
     *        appears only when users sign in. You can't change <code>AccountName</code> value after the Amazon
     *        QuickSight account is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountSubscriptionRequest withAccountName(String accountName) {
        setAccountName(accountName);
        return this;
    }

    /**
     * <p>
     * The email address that you want Amazon QuickSight to send notifications to regarding your Amazon QuickSight
     * account or Amazon QuickSight subscription.
     * </p>
     * 
     * @param notificationEmail
     *        The email address that you want Amazon QuickSight to send notifications to regarding your Amazon
     *        QuickSight account or Amazon QuickSight subscription.
     */

    public void setNotificationEmail(String notificationEmail) {
        this.notificationEmail = notificationEmail;
    }

    /**
     * <p>
     * The email address that you want Amazon QuickSight to send notifications to regarding your Amazon QuickSight
     * account or Amazon QuickSight subscription.
     * </p>
     * 
     * @return The email address that you want Amazon QuickSight to send notifications to regarding your Amazon
     *         QuickSight account or Amazon QuickSight subscription.
     */

    public String getNotificationEmail() {
        return this.notificationEmail;
    }

    /**
     * <p>
     * The email address that you want Amazon QuickSight to send notifications to regarding your Amazon QuickSight
     * account or Amazon QuickSight subscription.
     * </p>
     * 
     * @param notificationEmail
     *        The email address that you want Amazon QuickSight to send notifications to regarding your Amazon
     *        QuickSight account or Amazon QuickSight subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountSubscriptionRequest withNotificationEmail(String notificationEmail) {
        setNotificationEmail(notificationEmail);
        return this;
    }

    /**
     * <p>
     * The name of your Active Directory. This field is required if <code>ACTIVE_DIRECTORY</code> is the selected
     * authentication method of the new Amazon QuickSight account.
     * </p>
     * 
     * @param activeDirectoryName
     *        The name of your Active Directory. This field is required if <code>ACTIVE_DIRECTORY</code> is the selected
     *        authentication method of the new Amazon QuickSight account.
     */

    public void setActiveDirectoryName(String activeDirectoryName) {
        this.activeDirectoryName = activeDirectoryName;
    }

    /**
     * <p>
     * The name of your Active Directory. This field is required if <code>ACTIVE_DIRECTORY</code> is the selected
     * authentication method of the new Amazon QuickSight account.
     * </p>
     * 
     * @return The name of your Active Directory. This field is required if <code>ACTIVE_DIRECTORY</code> is the
     *         selected authentication method of the new Amazon QuickSight account.
     */

    public String getActiveDirectoryName() {
        return this.activeDirectoryName;
    }

    /**
     * <p>
     * The name of your Active Directory. This field is required if <code>ACTIVE_DIRECTORY</code> is the selected
     * authentication method of the new Amazon QuickSight account.
     * </p>
     * 
     * @param activeDirectoryName
     *        The name of your Active Directory. This field is required if <code>ACTIVE_DIRECTORY</code> is the selected
     *        authentication method of the new Amazon QuickSight account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountSubscriptionRequest withActiveDirectoryName(String activeDirectoryName) {
        setActiveDirectoryName(activeDirectoryName);
        return this;
    }

    /**
     * <p>
     * The realm of the Active Directory that is associated with your Amazon QuickSight account. This field is required
     * if <code>ACTIVE_DIRECTORY</code> is the selected authentication method of the new Amazon QuickSight account.
     * </p>
     * 
     * @param realm
     *        The realm of the Active Directory that is associated with your Amazon QuickSight account. This field is
     *        required if <code>ACTIVE_DIRECTORY</code> is the selected authentication method of the new Amazon
     *        QuickSight account.
     */

    public void setRealm(String realm) {
        this.realm = realm;
    }

    /**
     * <p>
     * The realm of the Active Directory that is associated with your Amazon QuickSight account. This field is required
     * if <code>ACTIVE_DIRECTORY</code> is the selected authentication method of the new Amazon QuickSight account.
     * </p>
     * 
     * @return The realm of the Active Directory that is associated with your Amazon QuickSight account. This field is
     *         required if <code>ACTIVE_DIRECTORY</code> is the selected authentication method of the new Amazon
     *         QuickSight account.
     */

    public String getRealm() {
        return this.realm;
    }

    /**
     * <p>
     * The realm of the Active Directory that is associated with your Amazon QuickSight account. This field is required
     * if <code>ACTIVE_DIRECTORY</code> is the selected authentication method of the new Amazon QuickSight account.
     * </p>
     * 
     * @param realm
     *        The realm of the Active Directory that is associated with your Amazon QuickSight account. This field is
     *        required if <code>ACTIVE_DIRECTORY</code> is the selected authentication method of the new Amazon
     *        QuickSight account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountSubscriptionRequest withRealm(String realm) {
        setRealm(realm);
        return this;
    }

    /**
     * <p>
     * The ID of the Active Directory that is associated with your Amazon QuickSight account.
     * </p>
     * 
     * @param directoryId
     *        The ID of the Active Directory that is associated with your Amazon QuickSight account.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The ID of the Active Directory that is associated with your Amazon QuickSight account.
     * </p>
     * 
     * @return The ID of the Active Directory that is associated with your Amazon QuickSight account.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The ID of the Active Directory that is associated with your Amazon QuickSight account.
     * </p>
     * 
     * @param directoryId
     *        The ID of the Active Directory that is associated with your Amazon QuickSight account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountSubscriptionRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The admin group associated with your Active Directory or IAM Identity Center account. Either this field or the
     * <code>AdminProGroup</code> field is required if <code>ACTIVE_DIRECTORY</code> or <code>IAM_IDENTITY_CENTER</code>
     * is the selected authentication method of the new Amazon QuickSight account.
     * </p>
     * <p>
     * For more information about using IAM Identity Center in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html">Using IAM
     * Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide. For more
     * information about using Active Directory in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active Directory with
     * Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * </p>
     * 
     * @return The admin group associated with your Active Directory or IAM Identity Center account. Either this field
     *         or the <code>AdminProGroup</code> field is required if <code>ACTIVE_DIRECTORY</code> or
     *         <code>IAM_IDENTITY_CENTER</code> is the selected authentication method of the new Amazon QuickSight
     *         account.</p>
     *         <p>
     *         For more information about using IAM Identity Center in Amazon QuickSight, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html"
     *         >Using IAM Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User
     *         Guide. For more information about using Active Directory in Amazon QuickSight, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active
     *         Directory with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     */

    public java.util.List<String> getAdminGroup() {
        return adminGroup;
    }

    /**
     * <p>
     * The admin group associated with your Active Directory or IAM Identity Center account. Either this field or the
     * <code>AdminProGroup</code> field is required if <code>ACTIVE_DIRECTORY</code> or <code>IAM_IDENTITY_CENTER</code>
     * is the selected authentication method of the new Amazon QuickSight account.
     * </p>
     * <p>
     * For more information about using IAM Identity Center in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html">Using IAM
     * Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide. For more
     * information about using Active Directory in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active Directory with
     * Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * </p>
     * 
     * @param adminGroup
     *        The admin group associated with your Active Directory or IAM Identity Center account. Either this field or
     *        the <code>AdminProGroup</code> field is required if <code>ACTIVE_DIRECTORY</code> or
     *        <code>IAM_IDENTITY_CENTER</code> is the selected authentication method of the new Amazon QuickSight
     *        account.</p>
     *        <p>
     *        For more information about using IAM Identity Center in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html"
     *        >Using IAM Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User
     *        Guide. For more information about using Active Directory in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active
     *        Directory with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     */

    public void setAdminGroup(java.util.Collection<String> adminGroup) {
        if (adminGroup == null) {
            this.adminGroup = null;
            return;
        }

        this.adminGroup = new java.util.ArrayList<String>(adminGroup);
    }

    /**
     * <p>
     * The admin group associated with your Active Directory or IAM Identity Center account. Either this field or the
     * <code>AdminProGroup</code> field is required if <code>ACTIVE_DIRECTORY</code> or <code>IAM_IDENTITY_CENTER</code>
     * is the selected authentication method of the new Amazon QuickSight account.
     * </p>
     * <p>
     * For more information about using IAM Identity Center in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html">Using IAM
     * Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide. For more
     * information about using Active Directory in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active Directory with
     * Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdminGroup(java.util.Collection)} or {@link #withAdminGroup(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param adminGroup
     *        The admin group associated with your Active Directory or IAM Identity Center account. Either this field or
     *        the <code>AdminProGroup</code> field is required if <code>ACTIVE_DIRECTORY</code> or
     *        <code>IAM_IDENTITY_CENTER</code> is the selected authentication method of the new Amazon QuickSight
     *        account.</p>
     *        <p>
     *        For more information about using IAM Identity Center in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html"
     *        >Using IAM Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User
     *        Guide. For more information about using Active Directory in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active
     *        Directory with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountSubscriptionRequest withAdminGroup(String... adminGroup) {
        if (this.adminGroup == null) {
            setAdminGroup(new java.util.ArrayList<String>(adminGroup.length));
        }
        for (String ele : adminGroup) {
            this.adminGroup.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The admin group associated with your Active Directory or IAM Identity Center account. Either this field or the
     * <code>AdminProGroup</code> field is required if <code>ACTIVE_DIRECTORY</code> or <code>IAM_IDENTITY_CENTER</code>
     * is the selected authentication method of the new Amazon QuickSight account.
     * </p>
     * <p>
     * For more information about using IAM Identity Center in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html">Using IAM
     * Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide. For more
     * information about using Active Directory in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active Directory with
     * Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * </p>
     * 
     * @param adminGroup
     *        The admin group associated with your Active Directory or IAM Identity Center account. Either this field or
     *        the <code>AdminProGroup</code> field is required if <code>ACTIVE_DIRECTORY</code> or
     *        <code>IAM_IDENTITY_CENTER</code> is the selected authentication method of the new Amazon QuickSight
     *        account.</p>
     *        <p>
     *        For more information about using IAM Identity Center in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html"
     *        >Using IAM Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User
     *        Guide. For more information about using Active Directory in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active
     *        Directory with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountSubscriptionRequest withAdminGroup(java.util.Collection<String> adminGroup) {
        setAdminGroup(adminGroup);
        return this;
    }

    /**
     * <p>
     * The author group associated with your Active Directory or IAM Identity Center account.
     * </p>
     * <p>
     * For more information about using IAM Identity Center in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html">Using IAM
     * Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide. For more
     * information about using Active Directory in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active Directory with
     * Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * </p>
     * 
     * @return The author group associated with your Active Directory or IAM Identity Center account.</p>
     *         <p>
     *         For more information about using IAM Identity Center in Amazon QuickSight, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html"
     *         >Using IAM Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User
     *         Guide. For more information about using Active Directory in Amazon QuickSight, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active
     *         Directory with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     */

    public java.util.List<String> getAuthorGroup() {
        return authorGroup;
    }

    /**
     * <p>
     * The author group associated with your Active Directory or IAM Identity Center account.
     * </p>
     * <p>
     * For more information about using IAM Identity Center in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html">Using IAM
     * Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide. For more
     * information about using Active Directory in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active Directory with
     * Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * </p>
     * 
     * @param authorGroup
     *        The author group associated with your Active Directory or IAM Identity Center account.</p>
     *        <p>
     *        For more information about using IAM Identity Center in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html"
     *        >Using IAM Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User
     *        Guide. For more information about using Active Directory in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active
     *        Directory with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     */

    public void setAuthorGroup(java.util.Collection<String> authorGroup) {
        if (authorGroup == null) {
            this.authorGroup = null;
            return;
        }

        this.authorGroup = new java.util.ArrayList<String>(authorGroup);
    }

    /**
     * <p>
     * The author group associated with your Active Directory or IAM Identity Center account.
     * </p>
     * <p>
     * For more information about using IAM Identity Center in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html">Using IAM
     * Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide. For more
     * information about using Active Directory in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active Directory with
     * Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuthorGroup(java.util.Collection)} or {@link #withAuthorGroup(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param authorGroup
     *        The author group associated with your Active Directory or IAM Identity Center account.</p>
     *        <p>
     *        For more information about using IAM Identity Center in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html"
     *        >Using IAM Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User
     *        Guide. For more information about using Active Directory in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active
     *        Directory with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountSubscriptionRequest withAuthorGroup(String... authorGroup) {
        if (this.authorGroup == null) {
            setAuthorGroup(new java.util.ArrayList<String>(authorGroup.length));
        }
        for (String ele : authorGroup) {
            this.authorGroup.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The author group associated with your Active Directory or IAM Identity Center account.
     * </p>
     * <p>
     * For more information about using IAM Identity Center in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html">Using IAM
     * Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide. For more
     * information about using Active Directory in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active Directory with
     * Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * </p>
     * 
     * @param authorGroup
     *        The author group associated with your Active Directory or IAM Identity Center account.</p>
     *        <p>
     *        For more information about using IAM Identity Center in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html"
     *        >Using IAM Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User
     *        Guide. For more information about using Active Directory in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active
     *        Directory with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountSubscriptionRequest withAuthorGroup(java.util.Collection<String> authorGroup) {
        setAuthorGroup(authorGroup);
        return this;
    }

    /**
     * <p>
     * The reader group associated with your Active Directory or IAM Identity Center account.
     * </p>
     * <p>
     * For more information about using IAM Identity Center in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html">Using IAM
     * Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide. For more
     * information about using Active Directory in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active Directory with
     * Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * </p>
     * 
     * @return The reader group associated with your Active Directory or IAM Identity Center account.</p>
     *         <p>
     *         For more information about using IAM Identity Center in Amazon QuickSight, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html"
     *         >Using IAM Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User
     *         Guide. For more information about using Active Directory in Amazon QuickSight, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active
     *         Directory with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     */

    public java.util.List<String> getReaderGroup() {
        return readerGroup;
    }

    /**
     * <p>
     * The reader group associated with your Active Directory or IAM Identity Center account.
     * </p>
     * <p>
     * For more information about using IAM Identity Center in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html">Using IAM
     * Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide. For more
     * information about using Active Directory in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active Directory with
     * Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * </p>
     * 
     * @param readerGroup
     *        The reader group associated with your Active Directory or IAM Identity Center account.</p>
     *        <p>
     *        For more information about using IAM Identity Center in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html"
     *        >Using IAM Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User
     *        Guide. For more information about using Active Directory in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active
     *        Directory with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     */

    public void setReaderGroup(java.util.Collection<String> readerGroup) {
        if (readerGroup == null) {
            this.readerGroup = null;
            return;
        }

        this.readerGroup = new java.util.ArrayList<String>(readerGroup);
    }

    /**
     * <p>
     * The reader group associated with your Active Directory or IAM Identity Center account.
     * </p>
     * <p>
     * For more information about using IAM Identity Center in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html">Using IAM
     * Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide. For more
     * information about using Active Directory in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active Directory with
     * Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReaderGroup(java.util.Collection)} or {@link #withReaderGroup(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param readerGroup
     *        The reader group associated with your Active Directory or IAM Identity Center account.</p>
     *        <p>
     *        For more information about using IAM Identity Center in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html"
     *        >Using IAM Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User
     *        Guide. For more information about using Active Directory in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active
     *        Directory with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountSubscriptionRequest withReaderGroup(String... readerGroup) {
        if (this.readerGroup == null) {
            setReaderGroup(new java.util.ArrayList<String>(readerGroup.length));
        }
        for (String ele : readerGroup) {
            this.readerGroup.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The reader group associated with your Active Directory or IAM Identity Center account.
     * </p>
     * <p>
     * For more information about using IAM Identity Center in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html">Using IAM
     * Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide. For more
     * information about using Active Directory in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active Directory with
     * Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * </p>
     * 
     * @param readerGroup
     *        The reader group associated with your Active Directory or IAM Identity Center account.</p>
     *        <p>
     *        For more information about using IAM Identity Center in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html"
     *        >Using IAM Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User
     *        Guide. For more information about using Active Directory in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active
     *        Directory with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountSubscriptionRequest withReaderGroup(java.util.Collection<String> readerGroup) {
        setReaderGroup(readerGroup);
        return this;
    }

    /**
     * <p>
     * The admin pro group associated with your Active Directory or IAM Identity Center account. Either this field or
     * the <code>AdminGroup</code> field is required if <code>ACTIVE_DIRECTORY</code> or
     * <code>IAM_IDENTITY_CENTER</code> is the selected authentication method of the new Amazon QuickSight account.
     * </p>
     * <p>
     * For more information about using IAM Identity Center in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html">Using IAM
     * Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide. For more
     * information about using Active Directory in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active Directory with
     * Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * </p>
     * 
     * @return The admin pro group associated with your Active Directory or IAM Identity Center account. Either this
     *         field or the <code>AdminGroup</code> field is required if <code>ACTIVE_DIRECTORY</code> or
     *         <code>IAM_IDENTITY_CENTER</code> is the selected authentication method of the new Amazon QuickSight
     *         account.</p>
     *         <p>
     *         For more information about using IAM Identity Center in Amazon QuickSight, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html"
     *         >Using IAM Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User
     *         Guide. For more information about using Active Directory in Amazon QuickSight, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active
     *         Directory with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     */

    public java.util.List<String> getAdminProGroup() {
        return adminProGroup;
    }

    /**
     * <p>
     * The admin pro group associated with your Active Directory or IAM Identity Center account. Either this field or
     * the <code>AdminGroup</code> field is required if <code>ACTIVE_DIRECTORY</code> or
     * <code>IAM_IDENTITY_CENTER</code> is the selected authentication method of the new Amazon QuickSight account.
     * </p>
     * <p>
     * For more information about using IAM Identity Center in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html">Using IAM
     * Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide. For more
     * information about using Active Directory in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active Directory with
     * Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * </p>
     * 
     * @param adminProGroup
     *        The admin pro group associated with your Active Directory or IAM Identity Center account. Either this
     *        field or the <code>AdminGroup</code> field is required if <code>ACTIVE_DIRECTORY</code> or
     *        <code>IAM_IDENTITY_CENTER</code> is the selected authentication method of the new Amazon QuickSight
     *        account.</p>
     *        <p>
     *        For more information about using IAM Identity Center in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html"
     *        >Using IAM Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User
     *        Guide. For more information about using Active Directory in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active
     *        Directory with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     */

    public void setAdminProGroup(java.util.Collection<String> adminProGroup) {
        if (adminProGroup == null) {
            this.adminProGroup = null;
            return;
        }

        this.adminProGroup = new java.util.ArrayList<String>(adminProGroup);
    }

    /**
     * <p>
     * The admin pro group associated with your Active Directory or IAM Identity Center account. Either this field or
     * the <code>AdminGroup</code> field is required if <code>ACTIVE_DIRECTORY</code> or
     * <code>IAM_IDENTITY_CENTER</code> is the selected authentication method of the new Amazon QuickSight account.
     * </p>
     * <p>
     * For more information about using IAM Identity Center in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html">Using IAM
     * Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide. For more
     * information about using Active Directory in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active Directory with
     * Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdminProGroup(java.util.Collection)} or {@link #withAdminProGroup(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param adminProGroup
     *        The admin pro group associated with your Active Directory or IAM Identity Center account. Either this
     *        field or the <code>AdminGroup</code> field is required if <code>ACTIVE_DIRECTORY</code> or
     *        <code>IAM_IDENTITY_CENTER</code> is the selected authentication method of the new Amazon QuickSight
     *        account.</p>
     *        <p>
     *        For more information about using IAM Identity Center in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html"
     *        >Using IAM Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User
     *        Guide. For more information about using Active Directory in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active
     *        Directory with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountSubscriptionRequest withAdminProGroup(String... adminProGroup) {
        if (this.adminProGroup == null) {
            setAdminProGroup(new java.util.ArrayList<String>(adminProGroup.length));
        }
        for (String ele : adminProGroup) {
            this.adminProGroup.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The admin pro group associated with your Active Directory or IAM Identity Center account. Either this field or
     * the <code>AdminGroup</code> field is required if <code>ACTIVE_DIRECTORY</code> or
     * <code>IAM_IDENTITY_CENTER</code> is the selected authentication method of the new Amazon QuickSight account.
     * </p>
     * <p>
     * For more information about using IAM Identity Center in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html">Using IAM
     * Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide. For more
     * information about using Active Directory in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active Directory with
     * Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * </p>
     * 
     * @param adminProGroup
     *        The admin pro group associated with your Active Directory or IAM Identity Center account. Either this
     *        field or the <code>AdminGroup</code> field is required if <code>ACTIVE_DIRECTORY</code> or
     *        <code>IAM_IDENTITY_CENTER</code> is the selected authentication method of the new Amazon QuickSight
     *        account.</p>
     *        <p>
     *        For more information about using IAM Identity Center in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html"
     *        >Using IAM Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User
     *        Guide. For more information about using Active Directory in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active
     *        Directory with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountSubscriptionRequest withAdminProGroup(java.util.Collection<String> adminProGroup) {
        setAdminProGroup(adminProGroup);
        return this;
    }

    /**
     * <p>
     * The author pro group associated with your Active Directory or IAM Identity Center account.
     * </p>
     * <p>
     * For more information about using IAM Identity Center in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html">Using IAM
     * Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide. For more
     * information about using Active Directory in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active Directory with
     * Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * </p>
     * 
     * @return The author pro group associated with your Active Directory or IAM Identity Center account.</p>
     *         <p>
     *         For more information about using IAM Identity Center in Amazon QuickSight, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html"
     *         >Using IAM Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User
     *         Guide. For more information about using Active Directory in Amazon QuickSight, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active
     *         Directory with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     */

    public java.util.List<String> getAuthorProGroup() {
        return authorProGroup;
    }

    /**
     * <p>
     * The author pro group associated with your Active Directory or IAM Identity Center account.
     * </p>
     * <p>
     * For more information about using IAM Identity Center in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html">Using IAM
     * Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide. For more
     * information about using Active Directory in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active Directory with
     * Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * </p>
     * 
     * @param authorProGroup
     *        The author pro group associated with your Active Directory or IAM Identity Center account.</p>
     *        <p>
     *        For more information about using IAM Identity Center in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html"
     *        >Using IAM Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User
     *        Guide. For more information about using Active Directory in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active
     *        Directory with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     */

    public void setAuthorProGroup(java.util.Collection<String> authorProGroup) {
        if (authorProGroup == null) {
            this.authorProGroup = null;
            return;
        }

        this.authorProGroup = new java.util.ArrayList<String>(authorProGroup);
    }

    /**
     * <p>
     * The author pro group associated with your Active Directory or IAM Identity Center account.
     * </p>
     * <p>
     * For more information about using IAM Identity Center in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html">Using IAM
     * Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide. For more
     * information about using Active Directory in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active Directory with
     * Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuthorProGroup(java.util.Collection)} or {@link #withAuthorProGroup(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param authorProGroup
     *        The author pro group associated with your Active Directory or IAM Identity Center account.</p>
     *        <p>
     *        For more information about using IAM Identity Center in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html"
     *        >Using IAM Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User
     *        Guide. For more information about using Active Directory in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active
     *        Directory with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountSubscriptionRequest withAuthorProGroup(String... authorProGroup) {
        if (this.authorProGroup == null) {
            setAuthorProGroup(new java.util.ArrayList<String>(authorProGroup.length));
        }
        for (String ele : authorProGroup) {
            this.authorProGroup.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The author pro group associated with your Active Directory or IAM Identity Center account.
     * </p>
     * <p>
     * For more information about using IAM Identity Center in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html">Using IAM
     * Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide. For more
     * information about using Active Directory in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active Directory with
     * Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * </p>
     * 
     * @param authorProGroup
     *        The author pro group associated with your Active Directory or IAM Identity Center account.</p>
     *        <p>
     *        For more information about using IAM Identity Center in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html"
     *        >Using IAM Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User
     *        Guide. For more information about using Active Directory in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active
     *        Directory with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountSubscriptionRequest withAuthorProGroup(java.util.Collection<String> authorProGroup) {
        setAuthorProGroup(authorProGroup);
        return this;
    }

    /**
     * <p>
     * The reader pro group associated with your Active Directory or IAM Identity Center account.
     * </p>
     * <p>
     * For more information about using IAM Identity Center in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html">Using IAM
     * Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide. For more
     * information about using Active Directory in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active Directory with
     * Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * </p>
     * 
     * @return The reader pro group associated with your Active Directory or IAM Identity Center account.</p>
     *         <p>
     *         For more information about using IAM Identity Center in Amazon QuickSight, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html"
     *         >Using IAM Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User
     *         Guide. For more information about using Active Directory in Amazon QuickSight, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active
     *         Directory with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     */

    public java.util.List<String> getReaderProGroup() {
        return readerProGroup;
    }

    /**
     * <p>
     * The reader pro group associated with your Active Directory or IAM Identity Center account.
     * </p>
     * <p>
     * For more information about using IAM Identity Center in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html">Using IAM
     * Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide. For more
     * information about using Active Directory in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active Directory with
     * Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * </p>
     * 
     * @param readerProGroup
     *        The reader pro group associated with your Active Directory or IAM Identity Center account.</p>
     *        <p>
     *        For more information about using IAM Identity Center in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html"
     *        >Using IAM Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User
     *        Guide. For more information about using Active Directory in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active
     *        Directory with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     */

    public void setReaderProGroup(java.util.Collection<String> readerProGroup) {
        if (readerProGroup == null) {
            this.readerProGroup = null;
            return;
        }

        this.readerProGroup = new java.util.ArrayList<String>(readerProGroup);
    }

    /**
     * <p>
     * The reader pro group associated with your Active Directory or IAM Identity Center account.
     * </p>
     * <p>
     * For more information about using IAM Identity Center in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html">Using IAM
     * Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide. For more
     * information about using Active Directory in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active Directory with
     * Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReaderProGroup(java.util.Collection)} or {@link #withReaderProGroup(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param readerProGroup
     *        The reader pro group associated with your Active Directory or IAM Identity Center account.</p>
     *        <p>
     *        For more information about using IAM Identity Center in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html"
     *        >Using IAM Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User
     *        Guide. For more information about using Active Directory in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active
     *        Directory with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountSubscriptionRequest withReaderProGroup(String... readerProGroup) {
        if (this.readerProGroup == null) {
            setReaderProGroup(new java.util.ArrayList<String>(readerProGroup.length));
        }
        for (String ele : readerProGroup) {
            this.readerProGroup.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The reader pro group associated with your Active Directory or IAM Identity Center account.
     * </p>
     * <p>
     * For more information about using IAM Identity Center in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html">Using IAM
     * Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide. For more
     * information about using Active Directory in Amazon QuickSight, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active Directory with
     * Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * </p>
     * 
     * @param readerProGroup
     *        The reader pro group associated with your Active Directory or IAM Identity Center account.</p>
     *        <p>
     *        For more information about using IAM Identity Center in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/sec-identity-management-identity-center.html"
     *        >Using IAM Identity Center with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User
     *        Guide. For more information about using Active Directory in Amazon QuickSight, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/aws-directory-service.html">Using Active
     *        Directory with Amazon QuickSight Enterprise Edition</a> in the Amazon QuickSight User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountSubscriptionRequest withReaderProGroup(java.util.Collection<String> readerProGroup) {
        setReaderProGroup(readerProGroup);
        return this;
    }

    /**
     * <p>
     * The first name of the author of the Amazon QuickSight account to use for future communications. This field is
     * required if <code>ENTERPPRISE_AND_Q</code> is the selected edition of the new Amazon QuickSight account.
     * </p>
     * 
     * @param firstName
     *        The first name of the author of the Amazon QuickSight account to use for future communications. This field
     *        is required if <code>ENTERPPRISE_AND_Q</code> is the selected edition of the new Amazon QuickSight
     *        account.
     */

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * <p>
     * The first name of the author of the Amazon QuickSight account to use for future communications. This field is
     * required if <code>ENTERPPRISE_AND_Q</code> is the selected edition of the new Amazon QuickSight account.
     * </p>
     * 
     * @return The first name of the author of the Amazon QuickSight account to use for future communications. This
     *         field is required if <code>ENTERPPRISE_AND_Q</code> is the selected edition of the new Amazon QuickSight
     *         account.
     */

    public String getFirstName() {
        return this.firstName;
    }

    /**
     * <p>
     * The first name of the author of the Amazon QuickSight account to use for future communications. This field is
     * required if <code>ENTERPPRISE_AND_Q</code> is the selected edition of the new Amazon QuickSight account.
     * </p>
     * 
     * @param firstName
     *        The first name of the author of the Amazon QuickSight account to use for future communications. This field
     *        is required if <code>ENTERPPRISE_AND_Q</code> is the selected edition of the new Amazon QuickSight
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountSubscriptionRequest withFirstName(String firstName) {
        setFirstName(firstName);
        return this;
    }

    /**
     * <p>
     * The last name of the author of the Amazon QuickSight account to use for future communications. This field is
     * required if <code>ENTERPPRISE_AND_Q</code> is the selected edition of the new Amazon QuickSight account.
     * </p>
     * 
     * @param lastName
     *        The last name of the author of the Amazon QuickSight account to use for future communications. This field
     *        is required if <code>ENTERPPRISE_AND_Q</code> is the selected edition of the new Amazon QuickSight
     *        account.
     */

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * <p>
     * The last name of the author of the Amazon QuickSight account to use for future communications. This field is
     * required if <code>ENTERPPRISE_AND_Q</code> is the selected edition of the new Amazon QuickSight account.
     * </p>
     * 
     * @return The last name of the author of the Amazon QuickSight account to use for future communications. This field
     *         is required if <code>ENTERPPRISE_AND_Q</code> is the selected edition of the new Amazon QuickSight
     *         account.
     */

    public String getLastName() {
        return this.lastName;
    }

    /**
     * <p>
     * The last name of the author of the Amazon QuickSight account to use for future communications. This field is
     * required if <code>ENTERPPRISE_AND_Q</code> is the selected edition of the new Amazon QuickSight account.
     * </p>
     * 
     * @param lastName
     *        The last name of the author of the Amazon QuickSight account to use for future communications. This field
     *        is required if <code>ENTERPPRISE_AND_Q</code> is the selected edition of the new Amazon QuickSight
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountSubscriptionRequest withLastName(String lastName) {
        setLastName(lastName);
        return this;
    }

    /**
     * <p>
     * The email address of the author of the Amazon QuickSight account to use for future communications. This field is
     * required if <code>ENTERPPRISE_AND_Q</code> is the selected edition of the new Amazon QuickSight account.
     * </p>
     * 
     * @param emailAddress
     *        The email address of the author of the Amazon QuickSight account to use for future communications. This
     *        field is required if <code>ENTERPPRISE_AND_Q</code> is the selected edition of the new Amazon QuickSight
     *        account.
     */

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * <p>
     * The email address of the author of the Amazon QuickSight account to use for future communications. This field is
     * required if <code>ENTERPPRISE_AND_Q</code> is the selected edition of the new Amazon QuickSight account.
     * </p>
     * 
     * @return The email address of the author of the Amazon QuickSight account to use for future communications. This
     *         field is required if <code>ENTERPPRISE_AND_Q</code> is the selected edition of the new Amazon QuickSight
     *         account.
     */

    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * <p>
     * The email address of the author of the Amazon QuickSight account to use for future communications. This field is
     * required if <code>ENTERPPRISE_AND_Q</code> is the selected edition of the new Amazon QuickSight account.
     * </p>
     * 
     * @param emailAddress
     *        The email address of the author of the Amazon QuickSight account to use for future communications. This
     *        field is required if <code>ENTERPPRISE_AND_Q</code> is the selected edition of the new Amazon QuickSight
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountSubscriptionRequest withEmailAddress(String emailAddress) {
        setEmailAddress(emailAddress);
        return this;
    }

    /**
     * <p>
     * A 10-digit phone number for the author of the Amazon QuickSight account to use for future communications. This
     * field is required if <code>ENTERPPRISE_AND_Q</code> is the selected edition of the new Amazon QuickSight account.
     * </p>
     * 
     * @param contactNumber
     *        A 10-digit phone number for the author of the Amazon QuickSight account to use for future communications.
     *        This field is required if <code>ENTERPPRISE_AND_Q</code> is the selected edition of the new Amazon
     *        QuickSight account.
     */

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    /**
     * <p>
     * A 10-digit phone number for the author of the Amazon QuickSight account to use for future communications. This
     * field is required if <code>ENTERPPRISE_AND_Q</code> is the selected edition of the new Amazon QuickSight account.
     * </p>
     * 
     * @return A 10-digit phone number for the author of the Amazon QuickSight account to use for future communications.
     *         This field is required if <code>ENTERPPRISE_AND_Q</code> is the selected edition of the new Amazon
     *         QuickSight account.
     */

    public String getContactNumber() {
        return this.contactNumber;
    }

    /**
     * <p>
     * A 10-digit phone number for the author of the Amazon QuickSight account to use for future communications. This
     * field is required if <code>ENTERPPRISE_AND_Q</code> is the selected edition of the new Amazon QuickSight account.
     * </p>
     * 
     * @param contactNumber
     *        A 10-digit phone number for the author of the Amazon QuickSight account to use for future communications.
     *        This field is required if <code>ENTERPPRISE_AND_Q</code> is the selected edition of the new Amazon
     *        QuickSight account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountSubscriptionRequest withContactNumber(String contactNumber) {
        setContactNumber(contactNumber);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the IAM Identity Center instance.
     * </p>
     * 
     * @param iAMIdentityCenterInstanceArn
     *        The Amazon Resource Name (ARN) for the IAM Identity Center instance.
     */

    public void setIAMIdentityCenterInstanceArn(String iAMIdentityCenterInstanceArn) {
        this.iAMIdentityCenterInstanceArn = iAMIdentityCenterInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the IAM Identity Center instance.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the IAM Identity Center instance.
     */

    public String getIAMIdentityCenterInstanceArn() {
        return this.iAMIdentityCenterInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the IAM Identity Center instance.
     * </p>
     * 
     * @param iAMIdentityCenterInstanceArn
     *        The Amazon Resource Name (ARN) for the IAM Identity Center instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAccountSubscriptionRequest withIAMIdentityCenterInstanceArn(String iAMIdentityCenterInstanceArn) {
        setIAMIdentityCenterInstanceArn(iAMIdentityCenterInstanceArn);
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
        if (getEdition() != null)
            sb.append("Edition: ").append(getEdition()).append(",");
        if (getAuthenticationMethod() != null)
            sb.append("AuthenticationMethod: ").append(getAuthenticationMethod()).append(",");
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getAccountName() != null)
            sb.append("AccountName: ").append(getAccountName()).append(",");
        if (getNotificationEmail() != null)
            sb.append("NotificationEmail: ").append(getNotificationEmail()).append(",");
        if (getActiveDirectoryName() != null)
            sb.append("ActiveDirectoryName: ").append(getActiveDirectoryName()).append(",");
        if (getRealm() != null)
            sb.append("Realm: ").append(getRealm()).append(",");
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getAdminGroup() != null)
            sb.append("AdminGroup: ").append(getAdminGroup()).append(",");
        if (getAuthorGroup() != null)
            sb.append("AuthorGroup: ").append(getAuthorGroup()).append(",");
        if (getReaderGroup() != null)
            sb.append("ReaderGroup: ").append(getReaderGroup()).append(",");
        if (getAdminProGroup() != null)
            sb.append("AdminProGroup: ").append(getAdminProGroup()).append(",");
        if (getAuthorProGroup() != null)
            sb.append("AuthorProGroup: ").append(getAuthorProGroup()).append(",");
        if (getReaderProGroup() != null)
            sb.append("ReaderProGroup: ").append(getReaderProGroup()).append(",");
        if (getFirstName() != null)
            sb.append("FirstName: ").append(getFirstName()).append(",");
        if (getLastName() != null)
            sb.append("LastName: ").append(getLastName()).append(",");
        if (getEmailAddress() != null)
            sb.append("EmailAddress: ").append(getEmailAddress()).append(",");
        if (getContactNumber() != null)
            sb.append("ContactNumber: ").append(getContactNumber()).append(",");
        if (getIAMIdentityCenterInstanceArn() != null)
            sb.append("IAMIdentityCenterInstanceArn: ").append(getIAMIdentityCenterInstanceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAccountSubscriptionRequest == false)
            return false;
        CreateAccountSubscriptionRequest other = (CreateAccountSubscriptionRequest) obj;
        if (other.getEdition() == null ^ this.getEdition() == null)
            return false;
        if (other.getEdition() != null && other.getEdition().equals(this.getEdition()) == false)
            return false;
        if (other.getAuthenticationMethod() == null ^ this.getAuthenticationMethod() == null)
            return false;
        if (other.getAuthenticationMethod() != null && other.getAuthenticationMethod().equals(this.getAuthenticationMethod()) == false)
            return false;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getAccountName() == null ^ this.getAccountName() == null)
            return false;
        if (other.getAccountName() != null && other.getAccountName().equals(this.getAccountName()) == false)
            return false;
        if (other.getNotificationEmail() == null ^ this.getNotificationEmail() == null)
            return false;
        if (other.getNotificationEmail() != null && other.getNotificationEmail().equals(this.getNotificationEmail()) == false)
            return false;
        if (other.getActiveDirectoryName() == null ^ this.getActiveDirectoryName() == null)
            return false;
        if (other.getActiveDirectoryName() != null && other.getActiveDirectoryName().equals(this.getActiveDirectoryName()) == false)
            return false;
        if (other.getRealm() == null ^ this.getRealm() == null)
            return false;
        if (other.getRealm() != null && other.getRealm().equals(this.getRealm()) == false)
            return false;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getAdminGroup() == null ^ this.getAdminGroup() == null)
            return false;
        if (other.getAdminGroup() != null && other.getAdminGroup().equals(this.getAdminGroup()) == false)
            return false;
        if (other.getAuthorGroup() == null ^ this.getAuthorGroup() == null)
            return false;
        if (other.getAuthorGroup() != null && other.getAuthorGroup().equals(this.getAuthorGroup()) == false)
            return false;
        if (other.getReaderGroup() == null ^ this.getReaderGroup() == null)
            return false;
        if (other.getReaderGroup() != null && other.getReaderGroup().equals(this.getReaderGroup()) == false)
            return false;
        if (other.getAdminProGroup() == null ^ this.getAdminProGroup() == null)
            return false;
        if (other.getAdminProGroup() != null && other.getAdminProGroup().equals(this.getAdminProGroup()) == false)
            return false;
        if (other.getAuthorProGroup() == null ^ this.getAuthorProGroup() == null)
            return false;
        if (other.getAuthorProGroup() != null && other.getAuthorProGroup().equals(this.getAuthorProGroup()) == false)
            return false;
        if (other.getReaderProGroup() == null ^ this.getReaderProGroup() == null)
            return false;
        if (other.getReaderProGroup() != null && other.getReaderProGroup().equals(this.getReaderProGroup()) == false)
            return false;
        if (other.getFirstName() == null ^ this.getFirstName() == null)
            return false;
        if (other.getFirstName() != null && other.getFirstName().equals(this.getFirstName()) == false)
            return false;
        if (other.getLastName() == null ^ this.getLastName() == null)
            return false;
        if (other.getLastName() != null && other.getLastName().equals(this.getLastName()) == false)
            return false;
        if (other.getEmailAddress() == null ^ this.getEmailAddress() == null)
            return false;
        if (other.getEmailAddress() != null && other.getEmailAddress().equals(this.getEmailAddress()) == false)
            return false;
        if (other.getContactNumber() == null ^ this.getContactNumber() == null)
            return false;
        if (other.getContactNumber() != null && other.getContactNumber().equals(this.getContactNumber()) == false)
            return false;
        if (other.getIAMIdentityCenterInstanceArn() == null ^ this.getIAMIdentityCenterInstanceArn() == null)
            return false;
        if (other.getIAMIdentityCenterInstanceArn() != null && other.getIAMIdentityCenterInstanceArn().equals(this.getIAMIdentityCenterInstanceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEdition() == null) ? 0 : getEdition().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationMethod() == null) ? 0 : getAuthenticationMethod().hashCode());
        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getAccountName() == null) ? 0 : getAccountName().hashCode());
        hashCode = prime * hashCode + ((getNotificationEmail() == null) ? 0 : getNotificationEmail().hashCode());
        hashCode = prime * hashCode + ((getActiveDirectoryName() == null) ? 0 : getActiveDirectoryName().hashCode());
        hashCode = prime * hashCode + ((getRealm() == null) ? 0 : getRealm().hashCode());
        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getAdminGroup() == null) ? 0 : getAdminGroup().hashCode());
        hashCode = prime * hashCode + ((getAuthorGroup() == null) ? 0 : getAuthorGroup().hashCode());
        hashCode = prime * hashCode + ((getReaderGroup() == null) ? 0 : getReaderGroup().hashCode());
        hashCode = prime * hashCode + ((getAdminProGroup() == null) ? 0 : getAdminProGroup().hashCode());
        hashCode = prime * hashCode + ((getAuthorProGroup() == null) ? 0 : getAuthorProGroup().hashCode());
        hashCode = prime * hashCode + ((getReaderProGroup() == null) ? 0 : getReaderProGroup().hashCode());
        hashCode = prime * hashCode + ((getFirstName() == null) ? 0 : getFirstName().hashCode());
        hashCode = prime * hashCode + ((getLastName() == null) ? 0 : getLastName().hashCode());
        hashCode = prime * hashCode + ((getEmailAddress() == null) ? 0 : getEmailAddress().hashCode());
        hashCode = prime * hashCode + ((getContactNumber() == null) ? 0 : getContactNumber().hashCode());
        hashCode = prime * hashCode + ((getIAMIdentityCenterInstanceArn() == null) ? 0 : getIAMIdentityCenterInstanceArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateAccountSubscriptionRequest clone() {
        return (CreateAccountSubscriptionRequest) super.clone();
    }

}
