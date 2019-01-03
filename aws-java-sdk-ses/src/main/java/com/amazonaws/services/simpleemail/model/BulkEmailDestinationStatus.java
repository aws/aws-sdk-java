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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * An object that contains the response from the <code>SendBulkTemplatedEmail</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/BulkEmailDestinationStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BulkEmailDestinationStatus implements Serializable, Cloneable {

    /**
     * <p>
     * The status of a message sent using the <code>SendBulkTemplatedEmail</code> operation.
     * </p>
     * <p>
     * Possible values for this parameter include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Success</code>: Amazon SES accepted the message, and will attempt to deliver it to the recipients.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRejected</code>: The message was rejected because it contained a virus.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MailFromDomainNotVerified</code>: The sender's email address or domain was not verified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfigurationSetDoesNotExist</code>: The configuration set you specified does not exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TemplateDoesNotExist</code>: The template you specified does not exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccountSuspended</code>: Your account has been shut down because of issues related to your email sending
     * practices.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccountThrottled</code>: The number of emails you can send has been reduced because your account has
     * exceeded its allocated sending limit.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccountDailyQuotaExceeded</code>: You have reached or exceeded the maximum number of emails you can send
     * from your account in a 24-hour period.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InvalidSendingPoolName</code>: The configuration set you specified refers to an IP pool that does not
     * exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccountSendingPaused</code>: Email sending for the Amazon SES account was disabled using the
     * <a>UpdateAccountSendingEnabled</a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfigurationSetSendingPaused</code>: Email sending for this configuration set was disabled using the
     * <a>UpdateConfigurationSetSendingEnabled</a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InvalidParameterValue</code>: One or more of the parameters you specified when calling this operation was
     * invalid. See the error message for additional information.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TransientFailure</code>: Amazon SES was unable to process your request because of a temporary issue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: Amazon SES was unable to process your request. See the error message for additional
     * information.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * A description of an error that prevented a message being sent using the <code>SendBulkTemplatedEmail</code>
     * operation.
     * </p>
     */
    private String error;
    /**
     * <p>
     * The unique message identifier returned from the <code>SendBulkTemplatedEmail</code> operation.
     * </p>
     */
    private String messageId;

    /**
     * <p>
     * The status of a message sent using the <code>SendBulkTemplatedEmail</code> operation.
     * </p>
     * <p>
     * Possible values for this parameter include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Success</code>: Amazon SES accepted the message, and will attempt to deliver it to the recipients.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRejected</code>: The message was rejected because it contained a virus.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MailFromDomainNotVerified</code>: The sender's email address or domain was not verified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfigurationSetDoesNotExist</code>: The configuration set you specified does not exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TemplateDoesNotExist</code>: The template you specified does not exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccountSuspended</code>: Your account has been shut down because of issues related to your email sending
     * practices.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccountThrottled</code>: The number of emails you can send has been reduced because your account has
     * exceeded its allocated sending limit.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccountDailyQuotaExceeded</code>: You have reached or exceeded the maximum number of emails you can send
     * from your account in a 24-hour period.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InvalidSendingPoolName</code>: The configuration set you specified refers to an IP pool that does not
     * exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccountSendingPaused</code>: Email sending for the Amazon SES account was disabled using the
     * <a>UpdateAccountSendingEnabled</a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfigurationSetSendingPaused</code>: Email sending for this configuration set was disabled using the
     * <a>UpdateConfigurationSetSendingEnabled</a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InvalidParameterValue</code>: One or more of the parameters you specified when calling this operation was
     * invalid. See the error message for additional information.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TransientFailure</code>: Amazon SES was unable to process your request because of a temporary issue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: Amazon SES was unable to process your request. See the error message for additional
     * information.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of a message sent using the <code>SendBulkTemplatedEmail</code> operation.</p>
     *        <p>
     *        Possible values for this parameter include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Success</code>: Amazon SES accepted the message, and will attempt to deliver it to the recipients.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MessageRejected</code>: The message was rejected because it contained a virus.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MailFromDomainNotVerified</code>: The sender's email address or domain was not verified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ConfigurationSetDoesNotExist</code>: The configuration set you specified does not exist.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TemplateDoesNotExist</code>: The template you specified does not exist.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AccountSuspended</code>: Your account has been shut down because of issues related to your email
     *        sending practices.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AccountThrottled</code>: The number of emails you can send has been reduced because your account has
     *        exceeded its allocated sending limit.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AccountDailyQuotaExceeded</code>: You have reached or exceeded the maximum number of emails you can
     *        send from your account in a 24-hour period.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InvalidSendingPoolName</code>: The configuration set you specified refers to an IP pool that does
     *        not exist.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AccountSendingPaused</code>: Email sending for the Amazon SES account was disabled using the
     *        <a>UpdateAccountSendingEnabled</a> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ConfigurationSetSendingPaused</code>: Email sending for this configuration set was disabled using
     *        the <a>UpdateConfigurationSetSendingEnabled</a> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InvalidParameterValue</code>: One or more of the parameters you specified when calling this
     *        operation was invalid. See the error message for additional information.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TransientFailure</code>: Amazon SES was unable to process your request because of a temporary issue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code>: Amazon SES was unable to process your request. See the error message for additional
     *        information.
     *        </p>
     *        </li>
     * @see BulkEmailStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a message sent using the <code>SendBulkTemplatedEmail</code> operation.
     * </p>
     * <p>
     * Possible values for this parameter include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Success</code>: Amazon SES accepted the message, and will attempt to deliver it to the recipients.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRejected</code>: The message was rejected because it contained a virus.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MailFromDomainNotVerified</code>: The sender's email address or domain was not verified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfigurationSetDoesNotExist</code>: The configuration set you specified does not exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TemplateDoesNotExist</code>: The template you specified does not exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccountSuspended</code>: Your account has been shut down because of issues related to your email sending
     * practices.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccountThrottled</code>: The number of emails you can send has been reduced because your account has
     * exceeded its allocated sending limit.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccountDailyQuotaExceeded</code>: You have reached or exceeded the maximum number of emails you can send
     * from your account in a 24-hour period.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InvalidSendingPoolName</code>: The configuration set you specified refers to an IP pool that does not
     * exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccountSendingPaused</code>: Email sending for the Amazon SES account was disabled using the
     * <a>UpdateAccountSendingEnabled</a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfigurationSetSendingPaused</code>: Email sending for this configuration set was disabled using the
     * <a>UpdateConfigurationSetSendingEnabled</a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InvalidParameterValue</code>: One or more of the parameters you specified when calling this operation was
     * invalid. See the error message for additional information.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TransientFailure</code>: Amazon SES was unable to process your request because of a temporary issue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: Amazon SES was unable to process your request. See the error message for additional
     * information.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of a message sent using the <code>SendBulkTemplatedEmail</code> operation.</p>
     *         <p>
     *         Possible values for this parameter include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Success</code>: Amazon SES accepted the message, and will attempt to deliver it to the recipients.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MessageRejected</code>: The message was rejected because it contained a virus.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MailFromDomainNotVerified</code>: The sender's email address or domain was not verified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ConfigurationSetDoesNotExist</code>: The configuration set you specified does not exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TemplateDoesNotExist</code>: The template you specified does not exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AccountSuspended</code>: Your account has been shut down because of issues related to your email
     *         sending practices.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AccountThrottled</code>: The number of emails you can send has been reduced because your account
     *         has exceeded its allocated sending limit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AccountDailyQuotaExceeded</code>: You have reached or exceeded the maximum number of emails you can
     *         send from your account in a 24-hour period.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>InvalidSendingPoolName</code>: The configuration set you specified refers to an IP pool that does
     *         not exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AccountSendingPaused</code>: Email sending for the Amazon SES account was disabled using the
     *         <a>UpdateAccountSendingEnabled</a> operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ConfigurationSetSendingPaused</code>: Email sending for this configuration set was disabled using
     *         the <a>UpdateConfigurationSetSendingEnabled</a> operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>InvalidParameterValue</code>: One or more of the parameters you specified when calling this
     *         operation was invalid. See the error message for additional information.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TransientFailure</code>: Amazon SES was unable to process your request because of a temporary
     *         issue.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Failed</code>: Amazon SES was unable to process your request. See the error message for additional
     *         information.
     *         </p>
     *         </li>
     * @see BulkEmailStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a message sent using the <code>SendBulkTemplatedEmail</code> operation.
     * </p>
     * <p>
     * Possible values for this parameter include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Success</code>: Amazon SES accepted the message, and will attempt to deliver it to the recipients.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRejected</code>: The message was rejected because it contained a virus.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MailFromDomainNotVerified</code>: The sender's email address or domain was not verified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfigurationSetDoesNotExist</code>: The configuration set you specified does not exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TemplateDoesNotExist</code>: The template you specified does not exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccountSuspended</code>: Your account has been shut down because of issues related to your email sending
     * practices.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccountThrottled</code>: The number of emails you can send has been reduced because your account has
     * exceeded its allocated sending limit.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccountDailyQuotaExceeded</code>: You have reached or exceeded the maximum number of emails you can send
     * from your account in a 24-hour period.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InvalidSendingPoolName</code>: The configuration set you specified refers to an IP pool that does not
     * exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccountSendingPaused</code>: Email sending for the Amazon SES account was disabled using the
     * <a>UpdateAccountSendingEnabled</a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfigurationSetSendingPaused</code>: Email sending for this configuration set was disabled using the
     * <a>UpdateConfigurationSetSendingEnabled</a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InvalidParameterValue</code>: One or more of the parameters you specified when calling this operation was
     * invalid. See the error message for additional information.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TransientFailure</code>: Amazon SES was unable to process your request because of a temporary issue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: Amazon SES was unable to process your request. See the error message for additional
     * information.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of a message sent using the <code>SendBulkTemplatedEmail</code> operation.</p>
     *        <p>
     *        Possible values for this parameter include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Success</code>: Amazon SES accepted the message, and will attempt to deliver it to the recipients.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MessageRejected</code>: The message was rejected because it contained a virus.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MailFromDomainNotVerified</code>: The sender's email address or domain was not verified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ConfigurationSetDoesNotExist</code>: The configuration set you specified does not exist.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TemplateDoesNotExist</code>: The template you specified does not exist.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AccountSuspended</code>: Your account has been shut down because of issues related to your email
     *        sending practices.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AccountThrottled</code>: The number of emails you can send has been reduced because your account has
     *        exceeded its allocated sending limit.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AccountDailyQuotaExceeded</code>: You have reached or exceeded the maximum number of emails you can
     *        send from your account in a 24-hour period.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InvalidSendingPoolName</code>: The configuration set you specified refers to an IP pool that does
     *        not exist.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AccountSendingPaused</code>: Email sending for the Amazon SES account was disabled using the
     *        <a>UpdateAccountSendingEnabled</a> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ConfigurationSetSendingPaused</code>: Email sending for this configuration set was disabled using
     *        the <a>UpdateConfigurationSetSendingEnabled</a> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InvalidParameterValue</code>: One or more of the parameters you specified when calling this
     *        operation was invalid. See the error message for additional information.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TransientFailure</code>: Amazon SES was unable to process your request because of a temporary issue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code>: Amazon SES was unable to process your request. See the error message for additional
     *        information.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BulkEmailStatus
     */

    public BulkEmailDestinationStatus withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of a message sent using the <code>SendBulkTemplatedEmail</code> operation.
     * </p>
     * <p>
     * Possible values for this parameter include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Success</code>: Amazon SES accepted the message, and will attempt to deliver it to the recipients.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MessageRejected</code>: The message was rejected because it contained a virus.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MailFromDomainNotVerified</code>: The sender's email address or domain was not verified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfigurationSetDoesNotExist</code>: The configuration set you specified does not exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TemplateDoesNotExist</code>: The template you specified does not exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccountSuspended</code>: Your account has been shut down because of issues related to your email sending
     * practices.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccountThrottled</code>: The number of emails you can send has been reduced because your account has
     * exceeded its allocated sending limit.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccountDailyQuotaExceeded</code>: You have reached or exceeded the maximum number of emails you can send
     * from your account in a 24-hour period.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InvalidSendingPoolName</code>: The configuration set you specified refers to an IP pool that does not
     * exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccountSendingPaused</code>: Email sending for the Amazon SES account was disabled using the
     * <a>UpdateAccountSendingEnabled</a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfigurationSetSendingPaused</code>: Email sending for this configuration set was disabled using the
     * <a>UpdateConfigurationSetSendingEnabled</a> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InvalidParameterValue</code>: One or more of the parameters you specified when calling this operation was
     * invalid. See the error message for additional information.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TransientFailure</code>: Amazon SES was unable to process your request because of a temporary issue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code>: Amazon SES was unable to process your request. See the error message for additional
     * information.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of a message sent using the <code>SendBulkTemplatedEmail</code> operation.</p>
     *        <p>
     *        Possible values for this parameter include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Success</code>: Amazon SES accepted the message, and will attempt to deliver it to the recipients.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MessageRejected</code>: The message was rejected because it contained a virus.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MailFromDomainNotVerified</code>: The sender's email address or domain was not verified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ConfigurationSetDoesNotExist</code>: The configuration set you specified does not exist.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TemplateDoesNotExist</code>: The template you specified does not exist.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AccountSuspended</code>: Your account has been shut down because of issues related to your email
     *        sending practices.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AccountThrottled</code>: The number of emails you can send has been reduced because your account has
     *        exceeded its allocated sending limit.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AccountDailyQuotaExceeded</code>: You have reached or exceeded the maximum number of emails you can
     *        send from your account in a 24-hour period.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InvalidSendingPoolName</code>: The configuration set you specified refers to an IP pool that does
     *        not exist.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AccountSendingPaused</code>: Email sending for the Amazon SES account was disabled using the
     *        <a>UpdateAccountSendingEnabled</a> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ConfigurationSetSendingPaused</code>: Email sending for this configuration set was disabled using
     *        the <a>UpdateConfigurationSetSendingEnabled</a> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InvalidParameterValue</code>: One or more of the parameters you specified when calling this
     *        operation was invalid. See the error message for additional information.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TransientFailure</code>: Amazon SES was unable to process your request because of a temporary issue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code>: Amazon SES was unable to process your request. See the error message for additional
     *        information.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BulkEmailStatus
     */

    public BulkEmailDestinationStatus withStatus(BulkEmailStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A description of an error that prevented a message being sent using the <code>SendBulkTemplatedEmail</code>
     * operation.
     * </p>
     * 
     * @param error
     *        A description of an error that prevented a message being sent using the
     *        <code>SendBulkTemplatedEmail</code> operation.
     */

    public void setError(String error) {
        this.error = error;
    }

    /**
     * <p>
     * A description of an error that prevented a message being sent using the <code>SendBulkTemplatedEmail</code>
     * operation.
     * </p>
     * 
     * @return A description of an error that prevented a message being sent using the
     *         <code>SendBulkTemplatedEmail</code> operation.
     */

    public String getError() {
        return this.error;
    }

    /**
     * <p>
     * A description of an error that prevented a message being sent using the <code>SendBulkTemplatedEmail</code>
     * operation.
     * </p>
     * 
     * @param error
     *        A description of an error that prevented a message being sent using the
     *        <code>SendBulkTemplatedEmail</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BulkEmailDestinationStatus withError(String error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * The unique message identifier returned from the <code>SendBulkTemplatedEmail</code> operation.
     * </p>
     * 
     * @param messageId
     *        The unique message identifier returned from the <code>SendBulkTemplatedEmail</code> operation.
     */

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * <p>
     * The unique message identifier returned from the <code>SendBulkTemplatedEmail</code> operation.
     * </p>
     * 
     * @return The unique message identifier returned from the <code>SendBulkTemplatedEmail</code> operation.
     */

    public String getMessageId() {
        return this.messageId;
    }

    /**
     * <p>
     * The unique message identifier returned from the <code>SendBulkTemplatedEmail</code> operation.
     * </p>
     * 
     * @param messageId
     *        The unique message identifier returned from the <code>SendBulkTemplatedEmail</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BulkEmailDestinationStatus withMessageId(String messageId) {
        setMessageId(messageId);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getMessageId() != null)
            sb.append("MessageId: ").append(getMessageId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BulkEmailDestinationStatus == false)
            return false;
        BulkEmailDestinationStatus other = (BulkEmailDestinationStatus) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getMessageId() == null ^ this.getMessageId() == null)
            return false;
        if (other.getMessageId() != null && other.getMessageId().equals(this.getMessageId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getMessageId() == null) ? 0 : getMessageId().hashCode());
        return hashCode;
    }

    @Override
    public BulkEmailDestinationStatus clone() {
        try {
            return (BulkEmailDestinationStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
