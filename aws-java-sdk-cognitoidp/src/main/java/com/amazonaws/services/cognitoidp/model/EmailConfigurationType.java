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
 * The email configuration type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/EmailConfigurationType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EmailConfigurationType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a verified email address in Amazon SES. This email address is used in one of
     * the following ways, depending on the value that you specify for the <code>EmailSendingAccount</code> parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify <code>COGNITO_DEFAULT</code>, Amazon Cognito uses this address as the custom FROM address when it
     * emails your users by using its built-in email account.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify <code>DEVELOPER</code>, Amazon Cognito emails your users with this address by calling Amazon SES
     * on your behalf.
     * </p>
     * </li>
     * </ul>
     */
    private String sourceArn;
    /**
     * <p>
     * The destination to which the receiver of the email should reply to.
     * </p>
     */
    private String replyToEmailAddress;
    /**
     * <p>
     * Specifies whether Amazon Cognito emails your users by using its built-in email functionality or your Amazon SES
     * email configuration. Specify one of the following values:
     * </p>
     * <dl>
     * <dt>COGNITO_DEFAULT</dt>
     * <dd>
     * <p>
     * When Amazon Cognito emails your users, it uses its built-in email functionality. When you use the default option,
     * Amazon Cognito allows only a limited number of emails each day for your user pool. For typical production
     * environments, the default email limit is below the required delivery volume. To achieve a higher delivery volume,
     * specify DEVELOPER to use your Amazon SES email configuration.
     * </p>
     * <p>
     * To look up the email delivery limit for the default option, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/limits.html">Limits in Amazon Cognito</a> in the
     * <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <p>
     * The default FROM address is no-reply@verificationemail.com. To customize the FROM address, provide the ARN of an
     * Amazon SES verified email address for the <code>SourceArn</code> parameter.
     * </p>
     * </dd>
     * <dt>DEVELOPER</dt>
     * <dd>
     * <p>
     * When Amazon Cognito emails your users, it uses your Amazon SES configuration. Amazon Cognito calls Amazon SES on
     * your behalf to send email from your verified email address. When you use this option, the email delivery limits
     * are the same limits that apply to your Amazon SES verified email address in your AWS account.
     * </p>
     * <p>
     * If you use this option, you must provide the ARN of an Amazon SES verified email address for the
     * <code>SourceArn</code> parameter.
     * </p>
     * <p>
     * Before Amazon Cognito can email your users, it requires additional permissions to call Amazon SES on your behalf.
     * When you update your user pool with this option, Amazon Cognito creates a <i>service-linked role</i>, which is a
     * type of IAM role, in your AWS account. This role contains the permissions that allow Amazon Cognito to access
     * Amazon SES and send email messages with your address. For more information about the service-linked role that
     * Amazon Cognito creates, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/using-service-linked-roles.html">Using
     * Service-Linked Roles for Amazon Cognito</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * </dd>
     * </dl>
     */
    private String emailSendingAccount;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a verified email address in Amazon SES. This email address is used in one of
     * the following ways, depending on the value that you specify for the <code>EmailSendingAccount</code> parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify <code>COGNITO_DEFAULT</code>, Amazon Cognito uses this address as the custom FROM address when it
     * emails your users by using its built-in email account.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify <code>DEVELOPER</code>, Amazon Cognito emails your users with this address by calling Amazon SES
     * on your behalf.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceArn
     *        The Amazon Resource Name (ARN) of a verified email address in Amazon SES. This email address is used in
     *        one of the following ways, depending on the value that you specify for the
     *        <code>EmailSendingAccount</code> parameter:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you specify <code>COGNITO_DEFAULT</code>, Amazon Cognito uses this address as the custom FROM address
     *        when it emails your users by using its built-in email account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify <code>DEVELOPER</code>, Amazon Cognito emails your users with this address by calling
     *        Amazon SES on your behalf.
     *        </p>
     *        </li>
     */

    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a verified email address in Amazon SES. This email address is used in one of
     * the following ways, depending on the value that you specify for the <code>EmailSendingAccount</code> parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify <code>COGNITO_DEFAULT</code>, Amazon Cognito uses this address as the custom FROM address when it
     * emails your users by using its built-in email account.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify <code>DEVELOPER</code>, Amazon Cognito emails your users with this address by calling Amazon SES
     * on your behalf.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) of a verified email address in Amazon SES. This email address is used in
     *         one of the following ways, depending on the value that you specify for the
     *         <code>EmailSendingAccount</code> parameter:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you specify <code>COGNITO_DEFAULT</code>, Amazon Cognito uses this address as the custom FROM address
     *         when it emails your users by using its built-in email account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify <code>DEVELOPER</code>, Amazon Cognito emails your users with this address by calling
     *         Amazon SES on your behalf.
     *         </p>
     *         </li>
     */

    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a verified email address in Amazon SES. This email address is used in one of
     * the following ways, depending on the value that you specify for the <code>EmailSendingAccount</code> parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify <code>COGNITO_DEFAULT</code>, Amazon Cognito uses this address as the custom FROM address when it
     * emails your users by using its built-in email account.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify <code>DEVELOPER</code>, Amazon Cognito emails your users with this address by calling Amazon SES
     * on your behalf.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceArn
     *        The Amazon Resource Name (ARN) of a verified email address in Amazon SES. This email address is used in
     *        one of the following ways, depending on the value that you specify for the
     *        <code>EmailSendingAccount</code> parameter:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you specify <code>COGNITO_DEFAULT</code>, Amazon Cognito uses this address as the custom FROM address
     *        when it emails your users by using its built-in email account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify <code>DEVELOPER</code>, Amazon Cognito emails your users with this address by calling
     *        Amazon SES on your behalf.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailConfigurationType withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
        return this;
    }

    /**
     * <p>
     * The destination to which the receiver of the email should reply to.
     * </p>
     * 
     * @param replyToEmailAddress
     *        The destination to which the receiver of the email should reply to.
     */

    public void setReplyToEmailAddress(String replyToEmailAddress) {
        this.replyToEmailAddress = replyToEmailAddress;
    }

    /**
     * <p>
     * The destination to which the receiver of the email should reply to.
     * </p>
     * 
     * @return The destination to which the receiver of the email should reply to.
     */

    public String getReplyToEmailAddress() {
        return this.replyToEmailAddress;
    }

    /**
     * <p>
     * The destination to which the receiver of the email should reply to.
     * </p>
     * 
     * @param replyToEmailAddress
     *        The destination to which the receiver of the email should reply to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailConfigurationType withReplyToEmailAddress(String replyToEmailAddress) {
        setReplyToEmailAddress(replyToEmailAddress);
        return this;
    }

    /**
     * <p>
     * Specifies whether Amazon Cognito emails your users by using its built-in email functionality or your Amazon SES
     * email configuration. Specify one of the following values:
     * </p>
     * <dl>
     * <dt>COGNITO_DEFAULT</dt>
     * <dd>
     * <p>
     * When Amazon Cognito emails your users, it uses its built-in email functionality. When you use the default option,
     * Amazon Cognito allows only a limited number of emails each day for your user pool. For typical production
     * environments, the default email limit is below the required delivery volume. To achieve a higher delivery volume,
     * specify DEVELOPER to use your Amazon SES email configuration.
     * </p>
     * <p>
     * To look up the email delivery limit for the default option, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/limits.html">Limits in Amazon Cognito</a> in the
     * <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <p>
     * The default FROM address is no-reply@verificationemail.com. To customize the FROM address, provide the ARN of an
     * Amazon SES verified email address for the <code>SourceArn</code> parameter.
     * </p>
     * </dd>
     * <dt>DEVELOPER</dt>
     * <dd>
     * <p>
     * When Amazon Cognito emails your users, it uses your Amazon SES configuration. Amazon Cognito calls Amazon SES on
     * your behalf to send email from your verified email address. When you use this option, the email delivery limits
     * are the same limits that apply to your Amazon SES verified email address in your AWS account.
     * </p>
     * <p>
     * If you use this option, you must provide the ARN of an Amazon SES verified email address for the
     * <code>SourceArn</code> parameter.
     * </p>
     * <p>
     * Before Amazon Cognito can email your users, it requires additional permissions to call Amazon SES on your behalf.
     * When you update your user pool with this option, Amazon Cognito creates a <i>service-linked role</i>, which is a
     * type of IAM role, in your AWS account. This role contains the permissions that allow Amazon Cognito to access
     * Amazon SES and send email messages with your address. For more information about the service-linked role that
     * Amazon Cognito creates, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/using-service-linked-roles.html">Using
     * Service-Linked Roles for Amazon Cognito</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param emailSendingAccount
     *        Specifies whether Amazon Cognito emails your users by using its built-in email functionality or your
     *        Amazon SES email configuration. Specify one of the following values:</p>
     *        <dl>
     *        <dt>COGNITO_DEFAULT</dt>
     *        <dd>
     *        <p>
     *        When Amazon Cognito emails your users, it uses its built-in email functionality. When you use the default
     *        option, Amazon Cognito allows only a limited number of emails each day for your user pool. For typical
     *        production environments, the default email limit is below the required delivery volume. To achieve a
     *        higher delivery volume, specify DEVELOPER to use your Amazon SES email configuration.
     *        </p>
     *        <p>
     *        To look up the email delivery limit for the default option, see <a
     *        href="https://docs.aws.amazon.com/cognito/latest/developerguide/limits.html">Limits in Amazon Cognito</a>
     *        in the <i>Amazon Cognito Developer Guide</i>.
     *        </p>
     *        <p>
     *        The default FROM address is no-reply@verificationemail.com. To customize the FROM address, provide the ARN
     *        of an Amazon SES verified email address for the <code>SourceArn</code> parameter.
     *        </p>
     *        </dd>
     *        <dt>DEVELOPER</dt>
     *        <dd>
     *        <p>
     *        When Amazon Cognito emails your users, it uses your Amazon SES configuration. Amazon Cognito calls Amazon
     *        SES on your behalf to send email from your verified email address. When you use this option, the email
     *        delivery limits are the same limits that apply to your Amazon SES verified email address in your AWS
     *        account.
     *        </p>
     *        <p>
     *        If you use this option, you must provide the ARN of an Amazon SES verified email address for the
     *        <code>SourceArn</code> parameter.
     *        </p>
     *        <p>
     *        Before Amazon Cognito can email your users, it requires additional permissions to call Amazon SES on your
     *        behalf. When you update your user pool with this option, Amazon Cognito creates a <i>service-linked
     *        role</i>, which is a type of IAM role, in your AWS account. This role contains the permissions that allow
     *        Amazon Cognito to access Amazon SES and send email messages with your address. For more information about
     *        the service-linked role that Amazon Cognito creates, see <a
     *        href="https://docs.aws.amazon.com/cognito/latest/developerguide/using-service-linked-roles.html">Using
     *        Service-Linked Roles for Amazon Cognito</a> in the <i>Amazon Cognito Developer Guide</i>.
     *        </p>
     *        </dd>
     * @see EmailSendingAccountType
     */

    public void setEmailSendingAccount(String emailSendingAccount) {
        this.emailSendingAccount = emailSendingAccount;
    }

    /**
     * <p>
     * Specifies whether Amazon Cognito emails your users by using its built-in email functionality or your Amazon SES
     * email configuration. Specify one of the following values:
     * </p>
     * <dl>
     * <dt>COGNITO_DEFAULT</dt>
     * <dd>
     * <p>
     * When Amazon Cognito emails your users, it uses its built-in email functionality. When you use the default option,
     * Amazon Cognito allows only a limited number of emails each day for your user pool. For typical production
     * environments, the default email limit is below the required delivery volume. To achieve a higher delivery volume,
     * specify DEVELOPER to use your Amazon SES email configuration.
     * </p>
     * <p>
     * To look up the email delivery limit for the default option, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/limits.html">Limits in Amazon Cognito</a> in the
     * <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <p>
     * The default FROM address is no-reply@verificationemail.com. To customize the FROM address, provide the ARN of an
     * Amazon SES verified email address for the <code>SourceArn</code> parameter.
     * </p>
     * </dd>
     * <dt>DEVELOPER</dt>
     * <dd>
     * <p>
     * When Amazon Cognito emails your users, it uses your Amazon SES configuration. Amazon Cognito calls Amazon SES on
     * your behalf to send email from your verified email address. When you use this option, the email delivery limits
     * are the same limits that apply to your Amazon SES verified email address in your AWS account.
     * </p>
     * <p>
     * If you use this option, you must provide the ARN of an Amazon SES verified email address for the
     * <code>SourceArn</code> parameter.
     * </p>
     * <p>
     * Before Amazon Cognito can email your users, it requires additional permissions to call Amazon SES on your behalf.
     * When you update your user pool with this option, Amazon Cognito creates a <i>service-linked role</i>, which is a
     * type of IAM role, in your AWS account. This role contains the permissions that allow Amazon Cognito to access
     * Amazon SES and send email messages with your address. For more information about the service-linked role that
     * Amazon Cognito creates, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/using-service-linked-roles.html">Using
     * Service-Linked Roles for Amazon Cognito</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return Specifies whether Amazon Cognito emails your users by using its built-in email functionality or your
     *         Amazon SES email configuration. Specify one of the following values:</p>
     *         <dl>
     *         <dt>COGNITO_DEFAULT</dt>
     *         <dd>
     *         <p>
     *         When Amazon Cognito emails your users, it uses its built-in email functionality. When you use the default
     *         option, Amazon Cognito allows only a limited number of emails each day for your user pool. For typical
     *         production environments, the default email limit is below the required delivery volume. To achieve a
     *         higher delivery volume, specify DEVELOPER to use your Amazon SES email configuration.
     *         </p>
     *         <p>
     *         To look up the email delivery limit for the default option, see <a
     *         href="https://docs.aws.amazon.com/cognito/latest/developerguide/limits.html">Limits in Amazon Cognito</a>
     *         in the <i>Amazon Cognito Developer Guide</i>.
     *         </p>
     *         <p>
     *         The default FROM address is no-reply@verificationemail.com. To customize the FROM address, provide the
     *         ARN of an Amazon SES verified email address for the <code>SourceArn</code> parameter.
     *         </p>
     *         </dd>
     *         <dt>DEVELOPER</dt>
     *         <dd>
     *         <p>
     *         When Amazon Cognito emails your users, it uses your Amazon SES configuration. Amazon Cognito calls Amazon
     *         SES on your behalf to send email from your verified email address. When you use this option, the email
     *         delivery limits are the same limits that apply to your Amazon SES verified email address in your AWS
     *         account.
     *         </p>
     *         <p>
     *         If you use this option, you must provide the ARN of an Amazon SES verified email address for the
     *         <code>SourceArn</code> parameter.
     *         </p>
     *         <p>
     *         Before Amazon Cognito can email your users, it requires additional permissions to call Amazon SES on your
     *         behalf. When you update your user pool with this option, Amazon Cognito creates a <i>service-linked
     *         role</i>, which is a type of IAM role, in your AWS account. This role contains the permissions that allow
     *         Amazon Cognito to access Amazon SES and send email messages with your address. For more information about
     *         the service-linked role that Amazon Cognito creates, see <a
     *         href="https://docs.aws.amazon.com/cognito/latest/developerguide/using-service-linked-roles.html">Using
     *         Service-Linked Roles for Amazon Cognito</a> in the <i>Amazon Cognito Developer Guide</i>.
     *         </p>
     *         </dd>
     * @see EmailSendingAccountType
     */

    public String getEmailSendingAccount() {
        return this.emailSendingAccount;
    }

    /**
     * <p>
     * Specifies whether Amazon Cognito emails your users by using its built-in email functionality or your Amazon SES
     * email configuration. Specify one of the following values:
     * </p>
     * <dl>
     * <dt>COGNITO_DEFAULT</dt>
     * <dd>
     * <p>
     * When Amazon Cognito emails your users, it uses its built-in email functionality. When you use the default option,
     * Amazon Cognito allows only a limited number of emails each day for your user pool. For typical production
     * environments, the default email limit is below the required delivery volume. To achieve a higher delivery volume,
     * specify DEVELOPER to use your Amazon SES email configuration.
     * </p>
     * <p>
     * To look up the email delivery limit for the default option, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/limits.html">Limits in Amazon Cognito</a> in the
     * <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <p>
     * The default FROM address is no-reply@verificationemail.com. To customize the FROM address, provide the ARN of an
     * Amazon SES verified email address for the <code>SourceArn</code> parameter.
     * </p>
     * </dd>
     * <dt>DEVELOPER</dt>
     * <dd>
     * <p>
     * When Amazon Cognito emails your users, it uses your Amazon SES configuration. Amazon Cognito calls Amazon SES on
     * your behalf to send email from your verified email address. When you use this option, the email delivery limits
     * are the same limits that apply to your Amazon SES verified email address in your AWS account.
     * </p>
     * <p>
     * If you use this option, you must provide the ARN of an Amazon SES verified email address for the
     * <code>SourceArn</code> parameter.
     * </p>
     * <p>
     * Before Amazon Cognito can email your users, it requires additional permissions to call Amazon SES on your behalf.
     * When you update your user pool with this option, Amazon Cognito creates a <i>service-linked role</i>, which is a
     * type of IAM role, in your AWS account. This role contains the permissions that allow Amazon Cognito to access
     * Amazon SES and send email messages with your address. For more information about the service-linked role that
     * Amazon Cognito creates, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/using-service-linked-roles.html">Using
     * Service-Linked Roles for Amazon Cognito</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param emailSendingAccount
     *        Specifies whether Amazon Cognito emails your users by using its built-in email functionality or your
     *        Amazon SES email configuration. Specify one of the following values:</p>
     *        <dl>
     *        <dt>COGNITO_DEFAULT</dt>
     *        <dd>
     *        <p>
     *        When Amazon Cognito emails your users, it uses its built-in email functionality. When you use the default
     *        option, Amazon Cognito allows only a limited number of emails each day for your user pool. For typical
     *        production environments, the default email limit is below the required delivery volume. To achieve a
     *        higher delivery volume, specify DEVELOPER to use your Amazon SES email configuration.
     *        </p>
     *        <p>
     *        To look up the email delivery limit for the default option, see <a
     *        href="https://docs.aws.amazon.com/cognito/latest/developerguide/limits.html">Limits in Amazon Cognito</a>
     *        in the <i>Amazon Cognito Developer Guide</i>.
     *        </p>
     *        <p>
     *        The default FROM address is no-reply@verificationemail.com. To customize the FROM address, provide the ARN
     *        of an Amazon SES verified email address for the <code>SourceArn</code> parameter.
     *        </p>
     *        </dd>
     *        <dt>DEVELOPER</dt>
     *        <dd>
     *        <p>
     *        When Amazon Cognito emails your users, it uses your Amazon SES configuration. Amazon Cognito calls Amazon
     *        SES on your behalf to send email from your verified email address. When you use this option, the email
     *        delivery limits are the same limits that apply to your Amazon SES verified email address in your AWS
     *        account.
     *        </p>
     *        <p>
     *        If you use this option, you must provide the ARN of an Amazon SES verified email address for the
     *        <code>SourceArn</code> parameter.
     *        </p>
     *        <p>
     *        Before Amazon Cognito can email your users, it requires additional permissions to call Amazon SES on your
     *        behalf. When you update your user pool with this option, Amazon Cognito creates a <i>service-linked
     *        role</i>, which is a type of IAM role, in your AWS account. This role contains the permissions that allow
     *        Amazon Cognito to access Amazon SES and send email messages with your address. For more information about
     *        the service-linked role that Amazon Cognito creates, see <a
     *        href="https://docs.aws.amazon.com/cognito/latest/developerguide/using-service-linked-roles.html">Using
     *        Service-Linked Roles for Amazon Cognito</a> in the <i>Amazon Cognito Developer Guide</i>.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EmailSendingAccountType
     */

    public EmailConfigurationType withEmailSendingAccount(String emailSendingAccount) {
        setEmailSendingAccount(emailSendingAccount);
        return this;
    }

    /**
     * <p>
     * Specifies whether Amazon Cognito emails your users by using its built-in email functionality or your Amazon SES
     * email configuration. Specify one of the following values:
     * </p>
     * <dl>
     * <dt>COGNITO_DEFAULT</dt>
     * <dd>
     * <p>
     * When Amazon Cognito emails your users, it uses its built-in email functionality. When you use the default option,
     * Amazon Cognito allows only a limited number of emails each day for your user pool. For typical production
     * environments, the default email limit is below the required delivery volume. To achieve a higher delivery volume,
     * specify DEVELOPER to use your Amazon SES email configuration.
     * </p>
     * <p>
     * To look up the email delivery limit for the default option, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/limits.html">Limits in Amazon Cognito</a> in the
     * <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * <p>
     * The default FROM address is no-reply@verificationemail.com. To customize the FROM address, provide the ARN of an
     * Amazon SES verified email address for the <code>SourceArn</code> parameter.
     * </p>
     * </dd>
     * <dt>DEVELOPER</dt>
     * <dd>
     * <p>
     * When Amazon Cognito emails your users, it uses your Amazon SES configuration. Amazon Cognito calls Amazon SES on
     * your behalf to send email from your verified email address. When you use this option, the email delivery limits
     * are the same limits that apply to your Amazon SES verified email address in your AWS account.
     * </p>
     * <p>
     * If you use this option, you must provide the ARN of an Amazon SES verified email address for the
     * <code>SourceArn</code> parameter.
     * </p>
     * <p>
     * Before Amazon Cognito can email your users, it requires additional permissions to call Amazon SES on your behalf.
     * When you update your user pool with this option, Amazon Cognito creates a <i>service-linked role</i>, which is a
     * type of IAM role, in your AWS account. This role contains the permissions that allow Amazon Cognito to access
     * Amazon SES and send email messages with your address. For more information about the service-linked role that
     * Amazon Cognito creates, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/using-service-linked-roles.html">Using
     * Service-Linked Roles for Amazon Cognito</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param emailSendingAccount
     *        Specifies whether Amazon Cognito emails your users by using its built-in email functionality or your
     *        Amazon SES email configuration. Specify one of the following values:</p>
     *        <dl>
     *        <dt>COGNITO_DEFAULT</dt>
     *        <dd>
     *        <p>
     *        When Amazon Cognito emails your users, it uses its built-in email functionality. When you use the default
     *        option, Amazon Cognito allows only a limited number of emails each day for your user pool. For typical
     *        production environments, the default email limit is below the required delivery volume. To achieve a
     *        higher delivery volume, specify DEVELOPER to use your Amazon SES email configuration.
     *        </p>
     *        <p>
     *        To look up the email delivery limit for the default option, see <a
     *        href="https://docs.aws.amazon.com/cognito/latest/developerguide/limits.html">Limits in Amazon Cognito</a>
     *        in the <i>Amazon Cognito Developer Guide</i>.
     *        </p>
     *        <p>
     *        The default FROM address is no-reply@verificationemail.com. To customize the FROM address, provide the ARN
     *        of an Amazon SES verified email address for the <code>SourceArn</code> parameter.
     *        </p>
     *        </dd>
     *        <dt>DEVELOPER</dt>
     *        <dd>
     *        <p>
     *        When Amazon Cognito emails your users, it uses your Amazon SES configuration. Amazon Cognito calls Amazon
     *        SES on your behalf to send email from your verified email address. When you use this option, the email
     *        delivery limits are the same limits that apply to your Amazon SES verified email address in your AWS
     *        account.
     *        </p>
     *        <p>
     *        If you use this option, you must provide the ARN of an Amazon SES verified email address for the
     *        <code>SourceArn</code> parameter.
     *        </p>
     *        <p>
     *        Before Amazon Cognito can email your users, it requires additional permissions to call Amazon SES on your
     *        behalf. When you update your user pool with this option, Amazon Cognito creates a <i>service-linked
     *        role</i>, which is a type of IAM role, in your AWS account. This role contains the permissions that allow
     *        Amazon Cognito to access Amazon SES and send email messages with your address. For more information about
     *        the service-linked role that Amazon Cognito creates, see <a
     *        href="https://docs.aws.amazon.com/cognito/latest/developerguide/using-service-linked-roles.html">Using
     *        Service-Linked Roles for Amazon Cognito</a> in the <i>Amazon Cognito Developer Guide</i>.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EmailSendingAccountType
     */

    public EmailConfigurationType withEmailSendingAccount(EmailSendingAccountType emailSendingAccount) {
        this.emailSendingAccount = emailSendingAccount.toString();
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
        if (getSourceArn() != null)
            sb.append("SourceArn: ").append(getSourceArn()).append(",");
        if (getReplyToEmailAddress() != null)
            sb.append("ReplyToEmailAddress: ").append(getReplyToEmailAddress()).append(",");
        if (getEmailSendingAccount() != null)
            sb.append("EmailSendingAccount: ").append(getEmailSendingAccount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EmailConfigurationType == false)
            return false;
        EmailConfigurationType other = (EmailConfigurationType) obj;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        if (other.getReplyToEmailAddress() == null ^ this.getReplyToEmailAddress() == null)
            return false;
        if (other.getReplyToEmailAddress() != null && other.getReplyToEmailAddress().equals(this.getReplyToEmailAddress()) == false)
            return false;
        if (other.getEmailSendingAccount() == null ^ this.getEmailSendingAccount() == null)
            return false;
        if (other.getEmailSendingAccount() != null && other.getEmailSendingAccount().equals(this.getEmailSendingAccount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode + ((getReplyToEmailAddress() == null) ? 0 : getReplyToEmailAddress().hashCode());
        hashCode = prime * hashCode + ((getEmailSendingAccount() == null) ? 0 : getEmailSendingAccount().hashCode());
        return hashCode;
    }

    @Override
    public EmailConfigurationType clone() {
        try {
            return (EmailConfigurationType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.EmailConfigurationTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
