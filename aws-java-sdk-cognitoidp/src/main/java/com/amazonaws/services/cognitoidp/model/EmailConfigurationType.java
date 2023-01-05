/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The email configuration of your user pool. The email configuration type sets your preferred sending method, Amazon
 * Web Services Region, and sender for messages from your user pool.
 * </p>
 * <note>
 * <p>
 * Amazon Cognito can send email messages with Amazon Simple Email Service resources in the Amazon Web Services Region
 * where you created your user pool, and in alternate Regions in some cases. For more information on the supported
 * Regions, see <a href="https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-email.html">Email settings
 * for Amazon Cognito user pools</a>.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/EmailConfigurationType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EmailConfigurationType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of a verified email address in Amazon SES. Amazon Cognito uses this email address in one of the following
     * ways, depending on the value that you specify for the <code>EmailSendingAccount</code> parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify <code>COGNITO_DEFAULT</code>, Amazon Cognito uses this address as the custom FROM address when it
     * emails your users using its built-in email account.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify <code>DEVELOPER</code>, Amazon Cognito emails your users with this address by calling Amazon SES
     * on your behalf.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The Region value of the <code>SourceArn</code> parameter must indicate a supported Amazon Web Services Region of
     * your user pool. Typically, the Region in the <code>SourceArn</code> and the user pool Region are the same. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-email.html#user-pool-email-developer-region-mapping"
     * >Amazon SES email configuration regions</a> in the <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">Amazon Cognito
     * Developer Guide</a>.
     * </p>
     */
    private String sourceArn;
    /**
     * <p>
     * The destination to which the receiver of the email should reply.
     * </p>
     */
    private String replyToEmailAddress;
    /**
     * <p>
     * Specifies whether Amazon Cognito uses its built-in functionality to send your users email messages, or uses your
     * Amazon Simple Email Service email configuration. Specify one of the following values:
     * </p>
     * <dl>
     * <dt>COGNITO_DEFAULT</dt>
     * <dd>
     * <p>
     * When Amazon Cognito emails your users, it uses its built-in email functionality. When you use the default option,
     * Amazon Cognito allows only a limited number of emails each day for your user pool. For typical production
     * environments, the default email limit is less than the required delivery volume. To achieve a higher delivery
     * volume, specify DEVELOPER to use your Amazon SES email configuration.
     * </p>
     * <p>
     * To look up the email delivery limit for the default option, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/limits.html">Limits</a> in the <i>Amazon Cognito
     * Developer Guide</i>.
     * </p>
     * <p>
     * The default FROM address is <code>no-reply@verificationemail.com</code>. To customize the FROM address, provide
     * the Amazon Resource Name (ARN) of an Amazon SES verified email address for the <code>SourceArn</code> parameter.
     * </p>
     * </dd>
     * <dt>DEVELOPER</dt>
     * <dd>
     * <p>
     * When Amazon Cognito emails your users, it uses your Amazon SES configuration. Amazon Cognito calls Amazon SES on
     * your behalf to send email from your verified email address. When you use this option, the email delivery limits
     * are the same limits that apply to your Amazon SES verified email address in your Amazon Web Services account.
     * </p>
     * <p>
     * If you use this option, provide the ARN of an Amazon SES verified email address for the <code>SourceArn</code>
     * parameter.
     * </p>
     * <p>
     * Before Amazon Cognito can email your users, it requires additional permissions to call Amazon SES on your behalf.
     * When you update your user pool with this option, Amazon Cognito creates a <i>service-linked role</i>, which is a
     * type of role in your Amazon Web Services account. This role contains the permissions that allow you to access
     * Amazon SES and send email messages from your email address. For more information about the service-linked role
     * that Amazon Cognito creates, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/using-service-linked-roles.html">Using
     * Service-Linked Roles for Amazon Cognito</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * </dd>
     * </dl>
     */
    private String emailSendingAccount;
    /**
     * <p>
     * Either the sender’s email address or the sender’s name with their email address. For example,
     * <code>testuser@example.com</code> or <code>Test User &lt;testuser@example.com&gt;</code>. This address appears
     * before the body of the email.
     * </p>
     */
    private String from;
    /**
     * <p>
     * The set of configuration rules that can be applied to emails sent using Amazon Simple Email Service. A
     * configuration set is applied to an email by including a reference to the configuration set in the headers of the
     * email. Once applied, all of the rules in that configuration set are applied to the email. Configuration sets can
     * be used to apply the following types of rules to emails:
     * </p>
     * <dl>
     * <dt>Event publishing</dt>
     * <dd>
     * <p>
     * Amazon Simple Email Service can track the number of send, delivery, open, click, bounce, and complaint events for
     * each email sent. Use event publishing to send information about these events to other Amazon Web Services
     * services such as and Amazon CloudWatch
     * </p>
     * </dd>
     * <dt>IP pool management</dt>
     * <dd>
     * <p>
     * When leasing dedicated IP addresses with Amazon Simple Email Service, you can create groups of IP addresses,
     * called dedicated IP pools. You can then associate the dedicated IP pools with configuration sets.
     * </p>
     * </dd>
     * </dl>
     */
    private String configurationSet;

    /**
     * <p>
     * The ARN of a verified email address in Amazon SES. Amazon Cognito uses this email address in one of the following
     * ways, depending on the value that you specify for the <code>EmailSendingAccount</code> parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify <code>COGNITO_DEFAULT</code>, Amazon Cognito uses this address as the custom FROM address when it
     * emails your users using its built-in email account.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify <code>DEVELOPER</code>, Amazon Cognito emails your users with this address by calling Amazon SES
     * on your behalf.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The Region value of the <code>SourceArn</code> parameter must indicate a supported Amazon Web Services Region of
     * your user pool. Typically, the Region in the <code>SourceArn</code> and the user pool Region are the same. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-email.html#user-pool-email-developer-region-mapping"
     * >Amazon SES email configuration regions</a> in the <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">Amazon Cognito
     * Developer Guide</a>.
     * </p>
     * 
     * @param sourceArn
     *        The ARN of a verified email address in Amazon SES. Amazon Cognito uses this email address in one of the
     *        following ways, depending on the value that you specify for the <code>EmailSendingAccount</code>
     *        parameter:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you specify <code>COGNITO_DEFAULT</code>, Amazon Cognito uses this address as the custom FROM address
     *        when it emails your users using its built-in email account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify <code>DEVELOPER</code>, Amazon Cognito emails your users with this address by calling
     *        Amazon SES on your behalf.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The Region value of the <code>SourceArn</code> parameter must indicate a supported Amazon Web Services
     *        Region of your user pool. Typically, the Region in the <code>SourceArn</code> and the user pool Region are
     *        the same. For more information, see <a href=
     *        "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-email.html#user-pool-email-developer-region-mapping"
     *        >Amazon SES email configuration regions</a> in the <a
     *        href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">Amazon
     *        Cognito Developer Guide</a>.
     */

    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * The ARN of a verified email address in Amazon SES. Amazon Cognito uses this email address in one of the following
     * ways, depending on the value that you specify for the <code>EmailSendingAccount</code> parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify <code>COGNITO_DEFAULT</code>, Amazon Cognito uses this address as the custom FROM address when it
     * emails your users using its built-in email account.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify <code>DEVELOPER</code>, Amazon Cognito emails your users with this address by calling Amazon SES
     * on your behalf.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The Region value of the <code>SourceArn</code> parameter must indicate a supported Amazon Web Services Region of
     * your user pool. Typically, the Region in the <code>SourceArn</code> and the user pool Region are the same. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-email.html#user-pool-email-developer-region-mapping"
     * >Amazon SES email configuration regions</a> in the <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">Amazon Cognito
     * Developer Guide</a>.
     * </p>
     * 
     * @return The ARN of a verified email address in Amazon SES. Amazon Cognito uses this email address in one of the
     *         following ways, depending on the value that you specify for the <code>EmailSendingAccount</code>
     *         parameter:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you specify <code>COGNITO_DEFAULT</code>, Amazon Cognito uses this address as the custom FROM address
     *         when it emails your users using its built-in email account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify <code>DEVELOPER</code>, Amazon Cognito emails your users with this address by calling
     *         Amazon SES on your behalf.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The Region value of the <code>SourceArn</code> parameter must indicate a supported Amazon Web Services
     *         Region of your user pool. Typically, the Region in the <code>SourceArn</code> and the user pool Region
     *         are the same. For more information, see <a href=
     *         "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-email.html#user-pool-email-developer-region-mapping"
     *         >Amazon SES email configuration regions</a> in the <a
     *         href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">Amazon
     *         Cognito Developer Guide</a>.
     */

    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * <p>
     * The ARN of a verified email address in Amazon SES. Amazon Cognito uses this email address in one of the following
     * ways, depending on the value that you specify for the <code>EmailSendingAccount</code> parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify <code>COGNITO_DEFAULT</code>, Amazon Cognito uses this address as the custom FROM address when it
     * emails your users using its built-in email account.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify <code>DEVELOPER</code>, Amazon Cognito emails your users with this address by calling Amazon SES
     * on your behalf.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The Region value of the <code>SourceArn</code> parameter must indicate a supported Amazon Web Services Region of
     * your user pool. Typically, the Region in the <code>SourceArn</code> and the user pool Region are the same. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-email.html#user-pool-email-developer-region-mapping"
     * >Amazon SES email configuration regions</a> in the <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">Amazon Cognito
     * Developer Guide</a>.
     * </p>
     * 
     * @param sourceArn
     *        The ARN of a verified email address in Amazon SES. Amazon Cognito uses this email address in one of the
     *        following ways, depending on the value that you specify for the <code>EmailSendingAccount</code>
     *        parameter:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you specify <code>COGNITO_DEFAULT</code>, Amazon Cognito uses this address as the custom FROM address
     *        when it emails your users using its built-in email account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify <code>DEVELOPER</code>, Amazon Cognito emails your users with this address by calling
     *        Amazon SES on your behalf.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The Region value of the <code>SourceArn</code> parameter must indicate a supported Amazon Web Services
     *        Region of your user pool. Typically, the Region in the <code>SourceArn</code> and the user pool Region are
     *        the same. For more information, see <a href=
     *        "https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-email.html#user-pool-email-developer-region-mapping"
     *        >Amazon SES email configuration regions</a> in the <a
     *        href="https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html">Amazon
     *        Cognito Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailConfigurationType withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
        return this;
    }

    /**
     * <p>
     * The destination to which the receiver of the email should reply.
     * </p>
     * 
     * @param replyToEmailAddress
     *        The destination to which the receiver of the email should reply.
     */

    public void setReplyToEmailAddress(String replyToEmailAddress) {
        this.replyToEmailAddress = replyToEmailAddress;
    }

    /**
     * <p>
     * The destination to which the receiver of the email should reply.
     * </p>
     * 
     * @return The destination to which the receiver of the email should reply.
     */

    public String getReplyToEmailAddress() {
        return this.replyToEmailAddress;
    }

    /**
     * <p>
     * The destination to which the receiver of the email should reply.
     * </p>
     * 
     * @param replyToEmailAddress
     *        The destination to which the receiver of the email should reply.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailConfigurationType withReplyToEmailAddress(String replyToEmailAddress) {
        setReplyToEmailAddress(replyToEmailAddress);
        return this;
    }

    /**
     * <p>
     * Specifies whether Amazon Cognito uses its built-in functionality to send your users email messages, or uses your
     * Amazon Simple Email Service email configuration. Specify one of the following values:
     * </p>
     * <dl>
     * <dt>COGNITO_DEFAULT</dt>
     * <dd>
     * <p>
     * When Amazon Cognito emails your users, it uses its built-in email functionality. When you use the default option,
     * Amazon Cognito allows only a limited number of emails each day for your user pool. For typical production
     * environments, the default email limit is less than the required delivery volume. To achieve a higher delivery
     * volume, specify DEVELOPER to use your Amazon SES email configuration.
     * </p>
     * <p>
     * To look up the email delivery limit for the default option, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/limits.html">Limits</a> in the <i>Amazon Cognito
     * Developer Guide</i>.
     * </p>
     * <p>
     * The default FROM address is <code>no-reply@verificationemail.com</code>. To customize the FROM address, provide
     * the Amazon Resource Name (ARN) of an Amazon SES verified email address for the <code>SourceArn</code> parameter.
     * </p>
     * </dd>
     * <dt>DEVELOPER</dt>
     * <dd>
     * <p>
     * When Amazon Cognito emails your users, it uses your Amazon SES configuration. Amazon Cognito calls Amazon SES on
     * your behalf to send email from your verified email address. When you use this option, the email delivery limits
     * are the same limits that apply to your Amazon SES verified email address in your Amazon Web Services account.
     * </p>
     * <p>
     * If you use this option, provide the ARN of an Amazon SES verified email address for the <code>SourceArn</code>
     * parameter.
     * </p>
     * <p>
     * Before Amazon Cognito can email your users, it requires additional permissions to call Amazon SES on your behalf.
     * When you update your user pool with this option, Amazon Cognito creates a <i>service-linked role</i>, which is a
     * type of role in your Amazon Web Services account. This role contains the permissions that allow you to access
     * Amazon SES and send email messages from your email address. For more information about the service-linked role
     * that Amazon Cognito creates, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/using-service-linked-roles.html">Using
     * Service-Linked Roles for Amazon Cognito</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param emailSendingAccount
     *        Specifies whether Amazon Cognito uses its built-in functionality to send your users email messages, or
     *        uses your Amazon Simple Email Service email configuration. Specify one of the following values:</p>
     *        <dl>
     *        <dt>COGNITO_DEFAULT</dt>
     *        <dd>
     *        <p>
     *        When Amazon Cognito emails your users, it uses its built-in email functionality. When you use the default
     *        option, Amazon Cognito allows only a limited number of emails each day for your user pool. For typical
     *        production environments, the default email limit is less than the required delivery volume. To achieve a
     *        higher delivery volume, specify DEVELOPER to use your Amazon SES email configuration.
     *        </p>
     *        <p>
     *        To look up the email delivery limit for the default option, see <a
     *        href="https://docs.aws.amazon.com/cognito/latest/developerguide/limits.html">Limits</a> in the <i>Amazon
     *        Cognito Developer Guide</i>.
     *        </p>
     *        <p>
     *        The default FROM address is <code>no-reply@verificationemail.com</code>. To customize the FROM address,
     *        provide the Amazon Resource Name (ARN) of an Amazon SES verified email address for the
     *        <code>SourceArn</code> parameter.
     *        </p>
     *        </dd>
     *        <dt>DEVELOPER</dt>
     *        <dd>
     *        <p>
     *        When Amazon Cognito emails your users, it uses your Amazon SES configuration. Amazon Cognito calls Amazon
     *        SES on your behalf to send email from your verified email address. When you use this option, the email
     *        delivery limits are the same limits that apply to your Amazon SES verified email address in your Amazon
     *        Web Services account.
     *        </p>
     *        <p>
     *        If you use this option, provide the ARN of an Amazon SES verified email address for the
     *        <code>SourceArn</code> parameter.
     *        </p>
     *        <p>
     *        Before Amazon Cognito can email your users, it requires additional permissions to call Amazon SES on your
     *        behalf. When you update your user pool with this option, Amazon Cognito creates a <i>service-linked
     *        role</i>, which is a type of role in your Amazon Web Services account. This role contains the permissions
     *        that allow you to access Amazon SES and send email messages from your email address. For more information
     *        about the service-linked role that Amazon Cognito creates, see <a
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
     * Specifies whether Amazon Cognito uses its built-in functionality to send your users email messages, or uses your
     * Amazon Simple Email Service email configuration. Specify one of the following values:
     * </p>
     * <dl>
     * <dt>COGNITO_DEFAULT</dt>
     * <dd>
     * <p>
     * When Amazon Cognito emails your users, it uses its built-in email functionality. When you use the default option,
     * Amazon Cognito allows only a limited number of emails each day for your user pool. For typical production
     * environments, the default email limit is less than the required delivery volume. To achieve a higher delivery
     * volume, specify DEVELOPER to use your Amazon SES email configuration.
     * </p>
     * <p>
     * To look up the email delivery limit for the default option, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/limits.html">Limits</a> in the <i>Amazon Cognito
     * Developer Guide</i>.
     * </p>
     * <p>
     * The default FROM address is <code>no-reply@verificationemail.com</code>. To customize the FROM address, provide
     * the Amazon Resource Name (ARN) of an Amazon SES verified email address for the <code>SourceArn</code> parameter.
     * </p>
     * </dd>
     * <dt>DEVELOPER</dt>
     * <dd>
     * <p>
     * When Amazon Cognito emails your users, it uses your Amazon SES configuration. Amazon Cognito calls Amazon SES on
     * your behalf to send email from your verified email address. When you use this option, the email delivery limits
     * are the same limits that apply to your Amazon SES verified email address in your Amazon Web Services account.
     * </p>
     * <p>
     * If you use this option, provide the ARN of an Amazon SES verified email address for the <code>SourceArn</code>
     * parameter.
     * </p>
     * <p>
     * Before Amazon Cognito can email your users, it requires additional permissions to call Amazon SES on your behalf.
     * When you update your user pool with this option, Amazon Cognito creates a <i>service-linked role</i>, which is a
     * type of role in your Amazon Web Services account. This role contains the permissions that allow you to access
     * Amazon SES and send email messages from your email address. For more information about the service-linked role
     * that Amazon Cognito creates, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/using-service-linked-roles.html">Using
     * Service-Linked Roles for Amazon Cognito</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return Specifies whether Amazon Cognito uses its built-in functionality to send your users email messages, or
     *         uses your Amazon Simple Email Service email configuration. Specify one of the following values:</p>
     *         <dl>
     *         <dt>COGNITO_DEFAULT</dt>
     *         <dd>
     *         <p>
     *         When Amazon Cognito emails your users, it uses its built-in email functionality. When you use the default
     *         option, Amazon Cognito allows only a limited number of emails each day for your user pool. For typical
     *         production environments, the default email limit is less than the required delivery volume. To achieve a
     *         higher delivery volume, specify DEVELOPER to use your Amazon SES email configuration.
     *         </p>
     *         <p>
     *         To look up the email delivery limit for the default option, see <a
     *         href="https://docs.aws.amazon.com/cognito/latest/developerguide/limits.html">Limits</a> in the <i>Amazon
     *         Cognito Developer Guide</i>.
     *         </p>
     *         <p>
     *         The default FROM address is <code>no-reply@verificationemail.com</code>. To customize the FROM address,
     *         provide the Amazon Resource Name (ARN) of an Amazon SES verified email address for the
     *         <code>SourceArn</code> parameter.
     *         </p>
     *         </dd>
     *         <dt>DEVELOPER</dt>
     *         <dd>
     *         <p>
     *         When Amazon Cognito emails your users, it uses your Amazon SES configuration. Amazon Cognito calls Amazon
     *         SES on your behalf to send email from your verified email address. When you use this option, the email
     *         delivery limits are the same limits that apply to your Amazon SES verified email address in your Amazon
     *         Web Services account.
     *         </p>
     *         <p>
     *         If you use this option, provide the ARN of an Amazon SES verified email address for the
     *         <code>SourceArn</code> parameter.
     *         </p>
     *         <p>
     *         Before Amazon Cognito can email your users, it requires additional permissions to call Amazon SES on your
     *         behalf. When you update your user pool with this option, Amazon Cognito creates a <i>service-linked
     *         role</i>, which is a type of role in your Amazon Web Services account. This role contains the permissions
     *         that allow you to access Amazon SES and send email messages from your email address. For more information
     *         about the service-linked role that Amazon Cognito creates, see <a
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
     * Specifies whether Amazon Cognito uses its built-in functionality to send your users email messages, or uses your
     * Amazon Simple Email Service email configuration. Specify one of the following values:
     * </p>
     * <dl>
     * <dt>COGNITO_DEFAULT</dt>
     * <dd>
     * <p>
     * When Amazon Cognito emails your users, it uses its built-in email functionality. When you use the default option,
     * Amazon Cognito allows only a limited number of emails each day for your user pool. For typical production
     * environments, the default email limit is less than the required delivery volume. To achieve a higher delivery
     * volume, specify DEVELOPER to use your Amazon SES email configuration.
     * </p>
     * <p>
     * To look up the email delivery limit for the default option, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/limits.html">Limits</a> in the <i>Amazon Cognito
     * Developer Guide</i>.
     * </p>
     * <p>
     * The default FROM address is <code>no-reply@verificationemail.com</code>. To customize the FROM address, provide
     * the Amazon Resource Name (ARN) of an Amazon SES verified email address for the <code>SourceArn</code> parameter.
     * </p>
     * </dd>
     * <dt>DEVELOPER</dt>
     * <dd>
     * <p>
     * When Amazon Cognito emails your users, it uses your Amazon SES configuration. Amazon Cognito calls Amazon SES on
     * your behalf to send email from your verified email address. When you use this option, the email delivery limits
     * are the same limits that apply to your Amazon SES verified email address in your Amazon Web Services account.
     * </p>
     * <p>
     * If you use this option, provide the ARN of an Amazon SES verified email address for the <code>SourceArn</code>
     * parameter.
     * </p>
     * <p>
     * Before Amazon Cognito can email your users, it requires additional permissions to call Amazon SES on your behalf.
     * When you update your user pool with this option, Amazon Cognito creates a <i>service-linked role</i>, which is a
     * type of role in your Amazon Web Services account. This role contains the permissions that allow you to access
     * Amazon SES and send email messages from your email address. For more information about the service-linked role
     * that Amazon Cognito creates, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/using-service-linked-roles.html">Using
     * Service-Linked Roles for Amazon Cognito</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param emailSendingAccount
     *        Specifies whether Amazon Cognito uses its built-in functionality to send your users email messages, or
     *        uses your Amazon Simple Email Service email configuration. Specify one of the following values:</p>
     *        <dl>
     *        <dt>COGNITO_DEFAULT</dt>
     *        <dd>
     *        <p>
     *        When Amazon Cognito emails your users, it uses its built-in email functionality. When you use the default
     *        option, Amazon Cognito allows only a limited number of emails each day for your user pool. For typical
     *        production environments, the default email limit is less than the required delivery volume. To achieve a
     *        higher delivery volume, specify DEVELOPER to use your Amazon SES email configuration.
     *        </p>
     *        <p>
     *        To look up the email delivery limit for the default option, see <a
     *        href="https://docs.aws.amazon.com/cognito/latest/developerguide/limits.html">Limits</a> in the <i>Amazon
     *        Cognito Developer Guide</i>.
     *        </p>
     *        <p>
     *        The default FROM address is <code>no-reply@verificationemail.com</code>. To customize the FROM address,
     *        provide the Amazon Resource Name (ARN) of an Amazon SES verified email address for the
     *        <code>SourceArn</code> parameter.
     *        </p>
     *        </dd>
     *        <dt>DEVELOPER</dt>
     *        <dd>
     *        <p>
     *        When Amazon Cognito emails your users, it uses your Amazon SES configuration. Amazon Cognito calls Amazon
     *        SES on your behalf to send email from your verified email address. When you use this option, the email
     *        delivery limits are the same limits that apply to your Amazon SES verified email address in your Amazon
     *        Web Services account.
     *        </p>
     *        <p>
     *        If you use this option, provide the ARN of an Amazon SES verified email address for the
     *        <code>SourceArn</code> parameter.
     *        </p>
     *        <p>
     *        Before Amazon Cognito can email your users, it requires additional permissions to call Amazon SES on your
     *        behalf. When you update your user pool with this option, Amazon Cognito creates a <i>service-linked
     *        role</i>, which is a type of role in your Amazon Web Services account. This role contains the permissions
     *        that allow you to access Amazon SES and send email messages from your email address. For more information
     *        about the service-linked role that Amazon Cognito creates, see <a
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
     * Specifies whether Amazon Cognito uses its built-in functionality to send your users email messages, or uses your
     * Amazon Simple Email Service email configuration. Specify one of the following values:
     * </p>
     * <dl>
     * <dt>COGNITO_DEFAULT</dt>
     * <dd>
     * <p>
     * When Amazon Cognito emails your users, it uses its built-in email functionality. When you use the default option,
     * Amazon Cognito allows only a limited number of emails each day for your user pool. For typical production
     * environments, the default email limit is less than the required delivery volume. To achieve a higher delivery
     * volume, specify DEVELOPER to use your Amazon SES email configuration.
     * </p>
     * <p>
     * To look up the email delivery limit for the default option, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/limits.html">Limits</a> in the <i>Amazon Cognito
     * Developer Guide</i>.
     * </p>
     * <p>
     * The default FROM address is <code>no-reply@verificationemail.com</code>. To customize the FROM address, provide
     * the Amazon Resource Name (ARN) of an Amazon SES verified email address for the <code>SourceArn</code> parameter.
     * </p>
     * </dd>
     * <dt>DEVELOPER</dt>
     * <dd>
     * <p>
     * When Amazon Cognito emails your users, it uses your Amazon SES configuration. Amazon Cognito calls Amazon SES on
     * your behalf to send email from your verified email address. When you use this option, the email delivery limits
     * are the same limits that apply to your Amazon SES verified email address in your Amazon Web Services account.
     * </p>
     * <p>
     * If you use this option, provide the ARN of an Amazon SES verified email address for the <code>SourceArn</code>
     * parameter.
     * </p>
     * <p>
     * Before Amazon Cognito can email your users, it requires additional permissions to call Amazon SES on your behalf.
     * When you update your user pool with this option, Amazon Cognito creates a <i>service-linked role</i>, which is a
     * type of role in your Amazon Web Services account. This role contains the permissions that allow you to access
     * Amazon SES and send email messages from your email address. For more information about the service-linked role
     * that Amazon Cognito creates, see <a
     * href="https://docs.aws.amazon.com/cognito/latest/developerguide/using-service-linked-roles.html">Using
     * Service-Linked Roles for Amazon Cognito</a> in the <i>Amazon Cognito Developer Guide</i>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param emailSendingAccount
     *        Specifies whether Amazon Cognito uses its built-in functionality to send your users email messages, or
     *        uses your Amazon Simple Email Service email configuration. Specify one of the following values:</p>
     *        <dl>
     *        <dt>COGNITO_DEFAULT</dt>
     *        <dd>
     *        <p>
     *        When Amazon Cognito emails your users, it uses its built-in email functionality. When you use the default
     *        option, Amazon Cognito allows only a limited number of emails each day for your user pool. For typical
     *        production environments, the default email limit is less than the required delivery volume. To achieve a
     *        higher delivery volume, specify DEVELOPER to use your Amazon SES email configuration.
     *        </p>
     *        <p>
     *        To look up the email delivery limit for the default option, see <a
     *        href="https://docs.aws.amazon.com/cognito/latest/developerguide/limits.html">Limits</a> in the <i>Amazon
     *        Cognito Developer Guide</i>.
     *        </p>
     *        <p>
     *        The default FROM address is <code>no-reply@verificationemail.com</code>. To customize the FROM address,
     *        provide the Amazon Resource Name (ARN) of an Amazon SES verified email address for the
     *        <code>SourceArn</code> parameter.
     *        </p>
     *        </dd>
     *        <dt>DEVELOPER</dt>
     *        <dd>
     *        <p>
     *        When Amazon Cognito emails your users, it uses your Amazon SES configuration. Amazon Cognito calls Amazon
     *        SES on your behalf to send email from your verified email address. When you use this option, the email
     *        delivery limits are the same limits that apply to your Amazon SES verified email address in your Amazon
     *        Web Services account.
     *        </p>
     *        <p>
     *        If you use this option, provide the ARN of an Amazon SES verified email address for the
     *        <code>SourceArn</code> parameter.
     *        </p>
     *        <p>
     *        Before Amazon Cognito can email your users, it requires additional permissions to call Amazon SES on your
     *        behalf. When you update your user pool with this option, Amazon Cognito creates a <i>service-linked
     *        role</i>, which is a type of role in your Amazon Web Services account. This role contains the permissions
     *        that allow you to access Amazon SES and send email messages from your email address. For more information
     *        about the service-linked role that Amazon Cognito creates, see <a
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
     * <p>
     * Either the sender’s email address or the sender’s name with their email address. For example,
     * <code>testuser@example.com</code> or <code>Test User &lt;testuser@example.com&gt;</code>. This address appears
     * before the body of the email.
     * </p>
     * 
     * @param from
     *        Either the sender’s email address or the sender’s name with their email address. For example,
     *        <code>testuser@example.com</code> or <code>Test User &lt;testuser@example.com&gt;</code>. This address
     *        appears before the body of the email.
     */

    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * <p>
     * Either the sender’s email address or the sender’s name with their email address. For example,
     * <code>testuser@example.com</code> or <code>Test User &lt;testuser@example.com&gt;</code>. This address appears
     * before the body of the email.
     * </p>
     * 
     * @return Either the sender’s email address or the sender’s name with their email address. For example,
     *         <code>testuser@example.com</code> or <code>Test User &lt;testuser@example.com&gt;</code>. This address
     *         appears before the body of the email.
     */

    public String getFrom() {
        return this.from;
    }

    /**
     * <p>
     * Either the sender’s email address or the sender’s name with their email address. For example,
     * <code>testuser@example.com</code> or <code>Test User &lt;testuser@example.com&gt;</code>. This address appears
     * before the body of the email.
     * </p>
     * 
     * @param from
     *        Either the sender’s email address or the sender’s name with their email address. For example,
     *        <code>testuser@example.com</code> or <code>Test User &lt;testuser@example.com&gt;</code>. This address
     *        appears before the body of the email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailConfigurationType withFrom(String from) {
        setFrom(from);
        return this;
    }

    /**
     * <p>
     * The set of configuration rules that can be applied to emails sent using Amazon Simple Email Service. A
     * configuration set is applied to an email by including a reference to the configuration set in the headers of the
     * email. Once applied, all of the rules in that configuration set are applied to the email. Configuration sets can
     * be used to apply the following types of rules to emails:
     * </p>
     * <dl>
     * <dt>Event publishing</dt>
     * <dd>
     * <p>
     * Amazon Simple Email Service can track the number of send, delivery, open, click, bounce, and complaint events for
     * each email sent. Use event publishing to send information about these events to other Amazon Web Services
     * services such as and Amazon CloudWatch
     * </p>
     * </dd>
     * <dt>IP pool management</dt>
     * <dd>
     * <p>
     * When leasing dedicated IP addresses with Amazon Simple Email Service, you can create groups of IP addresses,
     * called dedicated IP pools. You can then associate the dedicated IP pools with configuration sets.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param configurationSet
     *        The set of configuration rules that can be applied to emails sent using Amazon Simple Email Service. A
     *        configuration set is applied to an email by including a reference to the configuration set in the headers
     *        of the email. Once applied, all of the rules in that configuration set are applied to the email.
     *        Configuration sets can be used to apply the following types of rules to emails: </p>
     *        <dl>
     *        <dt>Event publishing</dt>
     *        <dd>
     *        <p>
     *        Amazon Simple Email Service can track the number of send, delivery, open, click, bounce, and complaint
     *        events for each email sent. Use event publishing to send information about these events to other Amazon
     *        Web Services services such as and Amazon CloudWatch
     *        </p>
     *        </dd>
     *        <dt>IP pool management</dt>
     *        <dd>
     *        <p>
     *        When leasing dedicated IP addresses with Amazon Simple Email Service, you can create groups of IP
     *        addresses, called dedicated IP pools. You can then associate the dedicated IP pools with configuration
     *        sets.
     *        </p>
     *        </dd>
     */

    public void setConfigurationSet(String configurationSet) {
        this.configurationSet = configurationSet;
    }

    /**
     * <p>
     * The set of configuration rules that can be applied to emails sent using Amazon Simple Email Service. A
     * configuration set is applied to an email by including a reference to the configuration set in the headers of the
     * email. Once applied, all of the rules in that configuration set are applied to the email. Configuration sets can
     * be used to apply the following types of rules to emails:
     * </p>
     * <dl>
     * <dt>Event publishing</dt>
     * <dd>
     * <p>
     * Amazon Simple Email Service can track the number of send, delivery, open, click, bounce, and complaint events for
     * each email sent. Use event publishing to send information about these events to other Amazon Web Services
     * services such as and Amazon CloudWatch
     * </p>
     * </dd>
     * <dt>IP pool management</dt>
     * <dd>
     * <p>
     * When leasing dedicated IP addresses with Amazon Simple Email Service, you can create groups of IP addresses,
     * called dedicated IP pools. You can then associate the dedicated IP pools with configuration sets.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The set of configuration rules that can be applied to emails sent using Amazon Simple Email Service. A
     *         configuration set is applied to an email by including a reference to the configuration set in the headers
     *         of the email. Once applied, all of the rules in that configuration set are applied to the email.
     *         Configuration sets can be used to apply the following types of rules to emails: </p>
     *         <dl>
     *         <dt>Event publishing</dt>
     *         <dd>
     *         <p>
     *         Amazon Simple Email Service can track the number of send, delivery, open, click, bounce, and complaint
     *         events for each email sent. Use event publishing to send information about these events to other Amazon
     *         Web Services services such as and Amazon CloudWatch
     *         </p>
     *         </dd>
     *         <dt>IP pool management</dt>
     *         <dd>
     *         <p>
     *         When leasing dedicated IP addresses with Amazon Simple Email Service, you can create groups of IP
     *         addresses, called dedicated IP pools. You can then associate the dedicated IP pools with configuration
     *         sets.
     *         </p>
     *         </dd>
     */

    public String getConfigurationSet() {
        return this.configurationSet;
    }

    /**
     * <p>
     * The set of configuration rules that can be applied to emails sent using Amazon Simple Email Service. A
     * configuration set is applied to an email by including a reference to the configuration set in the headers of the
     * email. Once applied, all of the rules in that configuration set are applied to the email. Configuration sets can
     * be used to apply the following types of rules to emails:
     * </p>
     * <dl>
     * <dt>Event publishing</dt>
     * <dd>
     * <p>
     * Amazon Simple Email Service can track the number of send, delivery, open, click, bounce, and complaint events for
     * each email sent. Use event publishing to send information about these events to other Amazon Web Services
     * services such as and Amazon CloudWatch
     * </p>
     * </dd>
     * <dt>IP pool management</dt>
     * <dd>
     * <p>
     * When leasing dedicated IP addresses with Amazon Simple Email Service, you can create groups of IP addresses,
     * called dedicated IP pools. You can then associate the dedicated IP pools with configuration sets.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param configurationSet
     *        The set of configuration rules that can be applied to emails sent using Amazon Simple Email Service. A
     *        configuration set is applied to an email by including a reference to the configuration set in the headers
     *        of the email. Once applied, all of the rules in that configuration set are applied to the email.
     *        Configuration sets can be used to apply the following types of rules to emails: </p>
     *        <dl>
     *        <dt>Event publishing</dt>
     *        <dd>
     *        <p>
     *        Amazon Simple Email Service can track the number of send, delivery, open, click, bounce, and complaint
     *        events for each email sent. Use event publishing to send information about these events to other Amazon
     *        Web Services services such as and Amazon CloudWatch
     *        </p>
     *        </dd>
     *        <dt>IP pool management</dt>
     *        <dd>
     *        <p>
     *        When leasing dedicated IP addresses with Amazon Simple Email Service, you can create groups of IP
     *        addresses, called dedicated IP pools. You can then associate the dedicated IP pools with configuration
     *        sets.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailConfigurationType withConfigurationSet(String configurationSet) {
        setConfigurationSet(configurationSet);
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
            sb.append("EmailSendingAccount: ").append(getEmailSendingAccount()).append(",");
        if (getFrom() != null)
            sb.append("From: ").append(getFrom()).append(",");
        if (getConfigurationSet() != null)
            sb.append("ConfigurationSet: ").append(getConfigurationSet());
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
        if (other.getFrom() == null ^ this.getFrom() == null)
            return false;
        if (other.getFrom() != null && other.getFrom().equals(this.getFrom()) == false)
            return false;
        if (other.getConfigurationSet() == null ^ this.getConfigurationSet() == null)
            return false;
        if (other.getConfigurationSet() != null && other.getConfigurationSet().equals(this.getConfigurationSet()) == false)
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
        hashCode = prime * hashCode + ((getFrom() == null) ? 0 : getFrom().hashCode());
        hashCode = prime * hashCode + ((getConfigurationSet() == null) ? 0 : getConfigurationSet().hashCode());
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
