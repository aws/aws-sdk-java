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
package com.amazonaws.services.sns.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the SetSMSAttributes action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/SetSMSAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetSMSAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The default settings for sending SMS messages from your account. You can set values for the following attribute
     * names:
     * </p>
     * <p>
     * <code>MonthlySpendLimit</code> – The maximum amount in USD that you are willing to spend each month to send SMS
     * messages. When Amazon SNS determines that sending an SMS message would incur a cost that exceeds this limit, it
     * stops sending SMS messages within minutes.
     * </p>
     * <important>
     * <p>
     * Amazon SNS stops sending SMS messages within minutes of the limit being crossed. During that interval, if you
     * continue to send SMS messages, you will incur costs that exceed your limit.
     * </p>
     * </important>
     * <p>
     * By default, the spend limit is set to the maximum allowed by Amazon SNS. If you want to raise the limit, submit
     * an <a href=
     * "https://console.aws.amazon.com/support/home#/case/create?issueType=service-limit-increase&amp;limitType=service-code-sns"
     * >SNS Limit Increase case</a>. For <b>New limit value</b>, enter your desired monthly spend limit. In the <b>Use
     * Case Description</b> field, explain that you are requesting an SMS monthly spend limit increase.
     * </p>
     * <p>
     * <code>DeliveryStatusIAMRole</code> – The ARN of the IAM role that allows Amazon SNS to write logs about SMS
     * deliveries in CloudWatch Logs. For each SMS message that you send, Amazon SNS writes a log that includes the
     * message price, the success or failure status, the reason for failure (if the message failed), the message dwell
     * time, and other information.
     * </p>
     * <p>
     * <code>DeliveryStatusSuccessSamplingRate</code> – The percentage of successful SMS deliveries for which Amazon SNS
     * will write logs in CloudWatch Logs. The value can be an integer from 0 - 100. For example, to write logs only for
     * failed deliveries, set this value to <code>0</code>. To write logs for 10% of your successful deliveries, set it
     * to <code>10</code>.
     * </p>
     * <p>
     * <code>DefaultSenderID</code> – A string, such as your business brand, that is displayed as the sender on the
     * receiving device. Support for sender IDs varies by country. The sender ID can be 1 - 11 alphanumeric characters,
     * and it must contain at least one letter.
     * </p>
     * <p>
     * <code>DefaultSMSType</code> – The type of SMS message that you will send by default. You can assign the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Promotional</code> – (Default) Noncritical messages, such as marketing messages. Amazon SNS optimizes the
     * message delivery to incur the lowest cost.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Transactional</code> – Critical messages that support customer transactions, such as one-time passcodes for
     * multi-factor authentication. Amazon SNS optimizes the message delivery to achieve the highest reliability.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>UsageReportS3Bucket</code> – The name of the Amazon S3 bucket to receive daily SMS usage reports from
     * Amazon SNS. Each day, Amazon SNS will deliver a usage report as a CSV file to the bucket. The report includes the
     * following information for each SMS message that was successfully delivered by your account:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Time that the message was published (in UTC)
     * </p>
     * </li>
     * <li>
     * <p>
     * Message ID
     * </p>
     * </li>
     * <li>
     * <p>
     * Destination phone number
     * </p>
     * </li>
     * <li>
     * <p>
     * Message type
     * </p>
     * </li>
     * <li>
     * <p>
     * Delivery status
     * </p>
     * </li>
     * <li>
     * <p>
     * Message price (in USD)
     * </p>
     * </li>
     * <li>
     * <p>
     * Part number (a message is split into multiple parts if it is too long for a single message)
     * </p>
     * </li>
     * <li>
     * <p>
     * Total number of parts
     * </p>
     * </li>
     * </ul>
     * <p>
     * To receive the report, the bucket must have a policy that allows the Amazon SNS service principle to perform the
     * <code>s3:PutObject</code> and <code>s3:GetBucketLocation</code> actions.
     * </p>
     * <p>
     * For an example bucket policy and usage report, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/sms_stats.html">Monitoring SMS Activity</a> in the <i>Amazon SNS
     * Developer Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> attributes;

    /**
     * <p>
     * The default settings for sending SMS messages from your account. You can set values for the following attribute
     * names:
     * </p>
     * <p>
     * <code>MonthlySpendLimit</code> – The maximum amount in USD that you are willing to spend each month to send SMS
     * messages. When Amazon SNS determines that sending an SMS message would incur a cost that exceeds this limit, it
     * stops sending SMS messages within minutes.
     * </p>
     * <important>
     * <p>
     * Amazon SNS stops sending SMS messages within minutes of the limit being crossed. During that interval, if you
     * continue to send SMS messages, you will incur costs that exceed your limit.
     * </p>
     * </important>
     * <p>
     * By default, the spend limit is set to the maximum allowed by Amazon SNS. If you want to raise the limit, submit
     * an <a href=
     * "https://console.aws.amazon.com/support/home#/case/create?issueType=service-limit-increase&amp;limitType=service-code-sns"
     * >SNS Limit Increase case</a>. For <b>New limit value</b>, enter your desired monthly spend limit. In the <b>Use
     * Case Description</b> field, explain that you are requesting an SMS monthly spend limit increase.
     * </p>
     * <p>
     * <code>DeliveryStatusIAMRole</code> – The ARN of the IAM role that allows Amazon SNS to write logs about SMS
     * deliveries in CloudWatch Logs. For each SMS message that you send, Amazon SNS writes a log that includes the
     * message price, the success or failure status, the reason for failure (if the message failed), the message dwell
     * time, and other information.
     * </p>
     * <p>
     * <code>DeliveryStatusSuccessSamplingRate</code> – The percentage of successful SMS deliveries for which Amazon SNS
     * will write logs in CloudWatch Logs. The value can be an integer from 0 - 100. For example, to write logs only for
     * failed deliveries, set this value to <code>0</code>. To write logs for 10% of your successful deliveries, set it
     * to <code>10</code>.
     * </p>
     * <p>
     * <code>DefaultSenderID</code> – A string, such as your business brand, that is displayed as the sender on the
     * receiving device. Support for sender IDs varies by country. The sender ID can be 1 - 11 alphanumeric characters,
     * and it must contain at least one letter.
     * </p>
     * <p>
     * <code>DefaultSMSType</code> – The type of SMS message that you will send by default. You can assign the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Promotional</code> – (Default) Noncritical messages, such as marketing messages. Amazon SNS optimizes the
     * message delivery to incur the lowest cost.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Transactional</code> – Critical messages that support customer transactions, such as one-time passcodes for
     * multi-factor authentication. Amazon SNS optimizes the message delivery to achieve the highest reliability.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>UsageReportS3Bucket</code> – The name of the Amazon S3 bucket to receive daily SMS usage reports from
     * Amazon SNS. Each day, Amazon SNS will deliver a usage report as a CSV file to the bucket. The report includes the
     * following information for each SMS message that was successfully delivered by your account:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Time that the message was published (in UTC)
     * </p>
     * </li>
     * <li>
     * <p>
     * Message ID
     * </p>
     * </li>
     * <li>
     * <p>
     * Destination phone number
     * </p>
     * </li>
     * <li>
     * <p>
     * Message type
     * </p>
     * </li>
     * <li>
     * <p>
     * Delivery status
     * </p>
     * </li>
     * <li>
     * <p>
     * Message price (in USD)
     * </p>
     * </li>
     * <li>
     * <p>
     * Part number (a message is split into multiple parts if it is too long for a single message)
     * </p>
     * </li>
     * <li>
     * <p>
     * Total number of parts
     * </p>
     * </li>
     * </ul>
     * <p>
     * To receive the report, the bucket must have a policy that allows the Amazon SNS service principle to perform the
     * <code>s3:PutObject</code> and <code>s3:GetBucketLocation</code> actions.
     * </p>
     * <p>
     * For an example bucket policy and usage report, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/sms_stats.html">Monitoring SMS Activity</a> in the <i>Amazon SNS
     * Developer Guide</i>.
     * </p>
     * 
     * @return The default settings for sending SMS messages from your account. You can set values for the following
     *         attribute names:</p>
     *         <p>
     *         <code>MonthlySpendLimit</code> – The maximum amount in USD that you are willing to spend each month to
     *         send SMS messages. When Amazon SNS determines that sending an SMS message would incur a cost that exceeds
     *         this limit, it stops sending SMS messages within minutes.
     *         </p>
     *         <important>
     *         <p>
     *         Amazon SNS stops sending SMS messages within minutes of the limit being crossed. During that interval, if
     *         you continue to send SMS messages, you will incur costs that exceed your limit.
     *         </p>
     *         </important>
     *         <p>
     *         By default, the spend limit is set to the maximum allowed by Amazon SNS. If you want to raise the limit,
     *         submit an <a href=
     *         "https://console.aws.amazon.com/support/home#/case/create?issueType=service-limit-increase&amp;limitType=service-code-sns"
     *         >SNS Limit Increase case</a>. For <b>New limit value</b>, enter your desired monthly spend limit. In the
     *         <b>Use Case Description</b> field, explain that you are requesting an SMS monthly spend limit increase.
     *         </p>
     *         <p>
     *         <code>DeliveryStatusIAMRole</code> – The ARN of the IAM role that allows Amazon SNS to write logs about
     *         SMS deliveries in CloudWatch Logs. For each SMS message that you send, Amazon SNS writes a log that
     *         includes the message price, the success or failure status, the reason for failure (if the message
     *         failed), the message dwell time, and other information.
     *         </p>
     *         <p>
     *         <code>DeliveryStatusSuccessSamplingRate</code> – The percentage of successful SMS deliveries for which
     *         Amazon SNS will write logs in CloudWatch Logs. The value can be an integer from 0 - 100. For example, to
     *         write logs only for failed deliveries, set this value to <code>0</code>. To write logs for 10% of your
     *         successful deliveries, set it to <code>10</code>.
     *         </p>
     *         <p>
     *         <code>DefaultSenderID</code> – A string, such as your business brand, that is displayed as the sender on
     *         the receiving device. Support for sender IDs varies by country. The sender ID can be 1 - 11 alphanumeric
     *         characters, and it must contain at least one letter.
     *         </p>
     *         <p>
     *         <code>DefaultSMSType</code> – The type of SMS message that you will send by default. You can assign the
     *         following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Promotional</code> – (Default) Noncritical messages, such as marketing messages. Amazon SNS
     *         optimizes the message delivery to incur the lowest cost.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Transactional</code> – Critical messages that support customer transactions, such as one-time
     *         passcodes for multi-factor authentication. Amazon SNS optimizes the message delivery to achieve the
     *         highest reliability.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <code>UsageReportS3Bucket</code> – The name of the Amazon S3 bucket to receive daily SMS usage reports
     *         from Amazon SNS. Each day, Amazon SNS will deliver a usage report as a CSV file to the bucket. The report
     *         includes the following information for each SMS message that was successfully delivered by your account:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Time that the message was published (in UTC)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Message ID
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Destination phone number
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Message type
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Delivery status
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Message price (in USD)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Part number (a message is split into multiple parts if it is too long for a single message)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Total number of parts
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To receive the report, the bucket must have a policy that allows the Amazon SNS service principle to
     *         perform the <code>s3:PutObject</code> and <code>s3:GetBucketLocation</code> actions.
     *         </p>
     *         <p>
     *         For an example bucket policy and usage report, see <a
     *         href="http://docs.aws.amazon.com/sns/latest/dg/sms_stats.html">Monitoring SMS Activity</a> in the
     *         <i>Amazon SNS Developer Guide</i>.
     */

    public java.util.Map<String, String> getAttributes() {
        if (attributes == null) {
            attributes = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return attributes;
    }

    /**
     * <p>
     * The default settings for sending SMS messages from your account. You can set values for the following attribute
     * names:
     * </p>
     * <p>
     * <code>MonthlySpendLimit</code> – The maximum amount in USD that you are willing to spend each month to send SMS
     * messages. When Amazon SNS determines that sending an SMS message would incur a cost that exceeds this limit, it
     * stops sending SMS messages within minutes.
     * </p>
     * <important>
     * <p>
     * Amazon SNS stops sending SMS messages within minutes of the limit being crossed. During that interval, if you
     * continue to send SMS messages, you will incur costs that exceed your limit.
     * </p>
     * </important>
     * <p>
     * By default, the spend limit is set to the maximum allowed by Amazon SNS. If you want to raise the limit, submit
     * an <a href=
     * "https://console.aws.amazon.com/support/home#/case/create?issueType=service-limit-increase&amp;limitType=service-code-sns"
     * >SNS Limit Increase case</a>. For <b>New limit value</b>, enter your desired monthly spend limit. In the <b>Use
     * Case Description</b> field, explain that you are requesting an SMS monthly spend limit increase.
     * </p>
     * <p>
     * <code>DeliveryStatusIAMRole</code> – The ARN of the IAM role that allows Amazon SNS to write logs about SMS
     * deliveries in CloudWatch Logs. For each SMS message that you send, Amazon SNS writes a log that includes the
     * message price, the success or failure status, the reason for failure (if the message failed), the message dwell
     * time, and other information.
     * </p>
     * <p>
     * <code>DeliveryStatusSuccessSamplingRate</code> – The percentage of successful SMS deliveries for which Amazon SNS
     * will write logs in CloudWatch Logs. The value can be an integer from 0 - 100. For example, to write logs only for
     * failed deliveries, set this value to <code>0</code>. To write logs for 10% of your successful deliveries, set it
     * to <code>10</code>.
     * </p>
     * <p>
     * <code>DefaultSenderID</code> – A string, such as your business brand, that is displayed as the sender on the
     * receiving device. Support for sender IDs varies by country. The sender ID can be 1 - 11 alphanumeric characters,
     * and it must contain at least one letter.
     * </p>
     * <p>
     * <code>DefaultSMSType</code> – The type of SMS message that you will send by default. You can assign the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Promotional</code> – (Default) Noncritical messages, such as marketing messages. Amazon SNS optimizes the
     * message delivery to incur the lowest cost.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Transactional</code> – Critical messages that support customer transactions, such as one-time passcodes for
     * multi-factor authentication. Amazon SNS optimizes the message delivery to achieve the highest reliability.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>UsageReportS3Bucket</code> – The name of the Amazon S3 bucket to receive daily SMS usage reports from
     * Amazon SNS. Each day, Amazon SNS will deliver a usage report as a CSV file to the bucket. The report includes the
     * following information for each SMS message that was successfully delivered by your account:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Time that the message was published (in UTC)
     * </p>
     * </li>
     * <li>
     * <p>
     * Message ID
     * </p>
     * </li>
     * <li>
     * <p>
     * Destination phone number
     * </p>
     * </li>
     * <li>
     * <p>
     * Message type
     * </p>
     * </li>
     * <li>
     * <p>
     * Delivery status
     * </p>
     * </li>
     * <li>
     * <p>
     * Message price (in USD)
     * </p>
     * </li>
     * <li>
     * <p>
     * Part number (a message is split into multiple parts if it is too long for a single message)
     * </p>
     * </li>
     * <li>
     * <p>
     * Total number of parts
     * </p>
     * </li>
     * </ul>
     * <p>
     * To receive the report, the bucket must have a policy that allows the Amazon SNS service principle to perform the
     * <code>s3:PutObject</code> and <code>s3:GetBucketLocation</code> actions.
     * </p>
     * <p>
     * For an example bucket policy and usage report, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/sms_stats.html">Monitoring SMS Activity</a> in the <i>Amazon SNS
     * Developer Guide</i>.
     * </p>
     * 
     * @param attributes
     *        The default settings for sending SMS messages from your account. You can set values for the following
     *        attribute names:</p>
     *        <p>
     *        <code>MonthlySpendLimit</code> – The maximum amount in USD that you are willing to spend each month to
     *        send SMS messages. When Amazon SNS determines that sending an SMS message would incur a cost that exceeds
     *        this limit, it stops sending SMS messages within minutes.
     *        </p>
     *        <important>
     *        <p>
     *        Amazon SNS stops sending SMS messages within minutes of the limit being crossed. During that interval, if
     *        you continue to send SMS messages, you will incur costs that exceed your limit.
     *        </p>
     *        </important>
     *        <p>
     *        By default, the spend limit is set to the maximum allowed by Amazon SNS. If you want to raise the limit,
     *        submit an <a href=
     *        "https://console.aws.amazon.com/support/home#/case/create?issueType=service-limit-increase&amp;limitType=service-code-sns"
     *        >SNS Limit Increase case</a>. For <b>New limit value</b>, enter your desired monthly spend limit. In the
     *        <b>Use Case Description</b> field, explain that you are requesting an SMS monthly spend limit increase.
     *        </p>
     *        <p>
     *        <code>DeliveryStatusIAMRole</code> – The ARN of the IAM role that allows Amazon SNS to write logs about
     *        SMS deliveries in CloudWatch Logs. For each SMS message that you send, Amazon SNS writes a log that
     *        includes the message price, the success or failure status, the reason for failure (if the message failed),
     *        the message dwell time, and other information.
     *        </p>
     *        <p>
     *        <code>DeliveryStatusSuccessSamplingRate</code> – The percentage of successful SMS deliveries for which
     *        Amazon SNS will write logs in CloudWatch Logs. The value can be an integer from 0 - 100. For example, to
     *        write logs only for failed deliveries, set this value to <code>0</code>. To write logs for 10% of your
     *        successful deliveries, set it to <code>10</code>.
     *        </p>
     *        <p>
     *        <code>DefaultSenderID</code> – A string, such as your business brand, that is displayed as the sender on
     *        the receiving device. Support for sender IDs varies by country. The sender ID can be 1 - 11 alphanumeric
     *        characters, and it must contain at least one letter.
     *        </p>
     *        <p>
     *        <code>DefaultSMSType</code> – The type of SMS message that you will send by default. You can assign the
     *        following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Promotional</code> – (Default) Noncritical messages, such as marketing messages. Amazon SNS
     *        optimizes the message delivery to incur the lowest cost.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Transactional</code> – Critical messages that support customer transactions, such as one-time
     *        passcodes for multi-factor authentication. Amazon SNS optimizes the message delivery to achieve the
     *        highest reliability.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>UsageReportS3Bucket</code> – The name of the Amazon S3 bucket to receive daily SMS usage reports
     *        from Amazon SNS. Each day, Amazon SNS will deliver a usage report as a CSV file to the bucket. The report
     *        includes the following information for each SMS message that was successfully delivered by your account:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Time that the message was published (in UTC)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Message ID
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Destination phone number
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Message type
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Delivery status
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Message price (in USD)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Part number (a message is split into multiple parts if it is too long for a single message)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Total number of parts
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To receive the report, the bucket must have a policy that allows the Amazon SNS service principle to
     *        perform the <code>s3:PutObject</code> and <code>s3:GetBucketLocation</code> actions.
     *        </p>
     *        <p>
     *        For an example bucket policy and usage report, see <a
     *        href="http://docs.aws.amazon.com/sns/latest/dg/sms_stats.html">Monitoring SMS Activity</a> in the
     *        <i>Amazon SNS Developer Guide</i>.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(attributes);
    }

    /**
     * <p>
     * The default settings for sending SMS messages from your account. You can set values for the following attribute
     * names:
     * </p>
     * <p>
     * <code>MonthlySpendLimit</code> – The maximum amount in USD that you are willing to spend each month to send SMS
     * messages. When Amazon SNS determines that sending an SMS message would incur a cost that exceeds this limit, it
     * stops sending SMS messages within minutes.
     * </p>
     * <important>
     * <p>
     * Amazon SNS stops sending SMS messages within minutes of the limit being crossed. During that interval, if you
     * continue to send SMS messages, you will incur costs that exceed your limit.
     * </p>
     * </important>
     * <p>
     * By default, the spend limit is set to the maximum allowed by Amazon SNS. If you want to raise the limit, submit
     * an <a href=
     * "https://console.aws.amazon.com/support/home#/case/create?issueType=service-limit-increase&amp;limitType=service-code-sns"
     * >SNS Limit Increase case</a>. For <b>New limit value</b>, enter your desired monthly spend limit. In the <b>Use
     * Case Description</b> field, explain that you are requesting an SMS monthly spend limit increase.
     * </p>
     * <p>
     * <code>DeliveryStatusIAMRole</code> – The ARN of the IAM role that allows Amazon SNS to write logs about SMS
     * deliveries in CloudWatch Logs. For each SMS message that you send, Amazon SNS writes a log that includes the
     * message price, the success or failure status, the reason for failure (if the message failed), the message dwell
     * time, and other information.
     * </p>
     * <p>
     * <code>DeliveryStatusSuccessSamplingRate</code> – The percentage of successful SMS deliveries for which Amazon SNS
     * will write logs in CloudWatch Logs. The value can be an integer from 0 - 100. For example, to write logs only for
     * failed deliveries, set this value to <code>0</code>. To write logs for 10% of your successful deliveries, set it
     * to <code>10</code>.
     * </p>
     * <p>
     * <code>DefaultSenderID</code> – A string, such as your business brand, that is displayed as the sender on the
     * receiving device. Support for sender IDs varies by country. The sender ID can be 1 - 11 alphanumeric characters,
     * and it must contain at least one letter.
     * </p>
     * <p>
     * <code>DefaultSMSType</code> – The type of SMS message that you will send by default. You can assign the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Promotional</code> – (Default) Noncritical messages, such as marketing messages. Amazon SNS optimizes the
     * message delivery to incur the lowest cost.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Transactional</code> – Critical messages that support customer transactions, such as one-time passcodes for
     * multi-factor authentication. Amazon SNS optimizes the message delivery to achieve the highest reliability.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>UsageReportS3Bucket</code> – The name of the Amazon S3 bucket to receive daily SMS usage reports from
     * Amazon SNS. Each day, Amazon SNS will deliver a usage report as a CSV file to the bucket. The report includes the
     * following information for each SMS message that was successfully delivered by your account:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Time that the message was published (in UTC)
     * </p>
     * </li>
     * <li>
     * <p>
     * Message ID
     * </p>
     * </li>
     * <li>
     * <p>
     * Destination phone number
     * </p>
     * </li>
     * <li>
     * <p>
     * Message type
     * </p>
     * </li>
     * <li>
     * <p>
     * Delivery status
     * </p>
     * </li>
     * <li>
     * <p>
     * Message price (in USD)
     * </p>
     * </li>
     * <li>
     * <p>
     * Part number (a message is split into multiple parts if it is too long for a single message)
     * </p>
     * </li>
     * <li>
     * <p>
     * Total number of parts
     * </p>
     * </li>
     * </ul>
     * <p>
     * To receive the report, the bucket must have a policy that allows the Amazon SNS service principle to perform the
     * <code>s3:PutObject</code> and <code>s3:GetBucketLocation</code> actions.
     * </p>
     * <p>
     * For an example bucket policy and usage report, see <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/sms_stats.html">Monitoring SMS Activity</a> in the <i>Amazon SNS
     * Developer Guide</i>.
     * </p>
     * 
     * @param attributes
     *        The default settings for sending SMS messages from your account. You can set values for the following
     *        attribute names:</p>
     *        <p>
     *        <code>MonthlySpendLimit</code> – The maximum amount in USD that you are willing to spend each month to
     *        send SMS messages. When Amazon SNS determines that sending an SMS message would incur a cost that exceeds
     *        this limit, it stops sending SMS messages within minutes.
     *        </p>
     *        <important>
     *        <p>
     *        Amazon SNS stops sending SMS messages within minutes of the limit being crossed. During that interval, if
     *        you continue to send SMS messages, you will incur costs that exceed your limit.
     *        </p>
     *        </important>
     *        <p>
     *        By default, the spend limit is set to the maximum allowed by Amazon SNS. If you want to raise the limit,
     *        submit an <a href=
     *        "https://console.aws.amazon.com/support/home#/case/create?issueType=service-limit-increase&amp;limitType=service-code-sns"
     *        >SNS Limit Increase case</a>. For <b>New limit value</b>, enter your desired monthly spend limit. In the
     *        <b>Use Case Description</b> field, explain that you are requesting an SMS monthly spend limit increase.
     *        </p>
     *        <p>
     *        <code>DeliveryStatusIAMRole</code> – The ARN of the IAM role that allows Amazon SNS to write logs about
     *        SMS deliveries in CloudWatch Logs. For each SMS message that you send, Amazon SNS writes a log that
     *        includes the message price, the success or failure status, the reason for failure (if the message failed),
     *        the message dwell time, and other information.
     *        </p>
     *        <p>
     *        <code>DeliveryStatusSuccessSamplingRate</code> – The percentage of successful SMS deliveries for which
     *        Amazon SNS will write logs in CloudWatch Logs. The value can be an integer from 0 - 100. For example, to
     *        write logs only for failed deliveries, set this value to <code>0</code>. To write logs for 10% of your
     *        successful deliveries, set it to <code>10</code>.
     *        </p>
     *        <p>
     *        <code>DefaultSenderID</code> – A string, such as your business brand, that is displayed as the sender on
     *        the receiving device. Support for sender IDs varies by country. The sender ID can be 1 - 11 alphanumeric
     *        characters, and it must contain at least one letter.
     *        </p>
     *        <p>
     *        <code>DefaultSMSType</code> – The type of SMS message that you will send by default. You can assign the
     *        following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Promotional</code> – (Default) Noncritical messages, such as marketing messages. Amazon SNS
     *        optimizes the message delivery to incur the lowest cost.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Transactional</code> – Critical messages that support customer transactions, such as one-time
     *        passcodes for multi-factor authentication. Amazon SNS optimizes the message delivery to achieve the
     *        highest reliability.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>UsageReportS3Bucket</code> – The name of the Amazon S3 bucket to receive daily SMS usage reports
     *        from Amazon SNS. Each day, Amazon SNS will deliver a usage report as a CSV file to the bucket. The report
     *        includes the following information for each SMS message that was successfully delivered by your account:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Time that the message was published (in UTC)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Message ID
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Destination phone number
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Message type
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Delivery status
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Message price (in USD)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Part number (a message is split into multiple parts if it is too long for a single message)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Total number of parts
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To receive the report, the bucket must have a policy that allows the Amazon SNS service principle to
     *        perform the <code>s3:PutObject</code> and <code>s3:GetBucketLocation</code> actions.
     *        </p>
     *        <p>
     *        For an example bucket policy and usage report, see <a
     *        href="http://docs.aws.amazon.com/sns/latest/dg/sms_stats.html">Monitoring SMS Activity</a> in the
     *        <i>Amazon SNS Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetSMSAttributesRequest withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    public SetSMSAttributesRequest addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetSMSAttributesRequest clearAttributesEntries() {
        this.attributes = null;
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
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetSMSAttributesRequest == false)
            return false;
        SetSMSAttributesRequest other = (SetSMSAttributesRequest) obj;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public SetSMSAttributesRequest clone() {
        return (SetSMSAttributesRequest) super.clone();
    }

}
