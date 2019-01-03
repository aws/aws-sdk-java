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
 * When included in a receipt rule, this action publishes a notification to Amazon Simple Notification Service (Amazon
 * SNS). This action includes a complete copy of the email content in the Amazon SNS notifications. Amazon SNS
 * notifications for all other actions simply provide information about the email. They do not include the email content
 * itself.
 * </p>
 * <p>
 * If you own the Amazon SNS topic, you don't need to do anything to give Amazon SES permission to publish emails to it.
 * However, if you don't own the Amazon SNS topic, you need to attach a policy to the topic to give Amazon SES
 * permissions to access it. For information about giving permissions, see the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-permissions.html">Amazon SES Developer
 * Guide</a>.
 * </p>
 * <important>
 * <p>
 * You can only publish emails that are 150 KB or less (including the header) to Amazon SNS. Larger emails will bounce.
 * If you anticipate emails larger than 150 KB, use the S3 action instead.
 * </p>
 * </important>
 * <p>
 * For information about using a receipt rule to publish an Amazon SNS notification, see the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-action-sns.html">Amazon SES Developer
 * Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SNSAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SNSAction implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify. An example of an Amazon SNS topic ARN is
     * <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more information about Amazon SNS topics, see the <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon SNS Developer Guide</a>.
     * </p>
     */
    private String topicArn;
    /**
     * <p>
     * The encoding to use for the email within the Amazon SNS notification. UTF-8 is easier to use, but may not
     * preserve all special characters when a message was encoded with a different encoding format. Base64 preserves all
     * special characters. The default value is UTF-8.
     * </p>
     */
    private String encoding;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify. An example of an Amazon SNS topic ARN is
     * <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more information about Amazon SNS topics, see the <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon SNS Developer Guide</a>.
     * </p>
     * 
     * @param topicArn
     *        The Amazon Resource Name (ARN) of the Amazon SNS topic to notify. An example of an Amazon SNS topic ARN is
     *        <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more information about Amazon SNS topics, see
     *        the <a href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon SNS Developer Guide</a>.
     */

    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify. An example of an Amazon SNS topic ARN is
     * <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more information about Amazon SNS topics, see the <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon SNS Developer Guide</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon SNS topic to notify. An example of an Amazon SNS topic ARN
     *         is <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more information about Amazon SNS topics,
     *         see the <a href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon SNS Developer
     *         Guide</a>.
     */

    public String getTopicArn() {
        return this.topicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify. An example of an Amazon SNS topic ARN is
     * <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more information about Amazon SNS topics, see the <a
     * href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon SNS Developer Guide</a>.
     * </p>
     * 
     * @param topicArn
     *        The Amazon Resource Name (ARN) of the Amazon SNS topic to notify. An example of an Amazon SNS topic ARN is
     *        <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more information about Amazon SNS topics, see
     *        the <a href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon SNS Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SNSAction withTopicArn(String topicArn) {
        setTopicArn(topicArn);
        return this;
    }

    /**
     * <p>
     * The encoding to use for the email within the Amazon SNS notification. UTF-8 is easier to use, but may not
     * preserve all special characters when a message was encoded with a different encoding format. Base64 preserves all
     * special characters. The default value is UTF-8.
     * </p>
     * 
     * @param encoding
     *        The encoding to use for the email within the Amazon SNS notification. UTF-8 is easier to use, but may not
     *        preserve all special characters when a message was encoded with a different encoding format. Base64
     *        preserves all special characters. The default value is UTF-8.
     * @see SNSActionEncoding
     */

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    /**
     * <p>
     * The encoding to use for the email within the Amazon SNS notification. UTF-8 is easier to use, but may not
     * preserve all special characters when a message was encoded with a different encoding format. Base64 preserves all
     * special characters. The default value is UTF-8.
     * </p>
     * 
     * @return The encoding to use for the email within the Amazon SNS notification. UTF-8 is easier to use, but may not
     *         preserve all special characters when a message was encoded with a different encoding format. Base64
     *         preserves all special characters. The default value is UTF-8.
     * @see SNSActionEncoding
     */

    public String getEncoding() {
        return this.encoding;
    }

    /**
     * <p>
     * The encoding to use for the email within the Amazon SNS notification. UTF-8 is easier to use, but may not
     * preserve all special characters when a message was encoded with a different encoding format. Base64 preserves all
     * special characters. The default value is UTF-8.
     * </p>
     * 
     * @param encoding
     *        The encoding to use for the email within the Amazon SNS notification. UTF-8 is easier to use, but may not
     *        preserve all special characters when a message was encoded with a different encoding format. Base64
     *        preserves all special characters. The default value is UTF-8.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SNSActionEncoding
     */

    public SNSAction withEncoding(String encoding) {
        setEncoding(encoding);
        return this;
    }

    /**
     * <p>
     * The encoding to use for the email within the Amazon SNS notification. UTF-8 is easier to use, but may not
     * preserve all special characters when a message was encoded with a different encoding format. Base64 preserves all
     * special characters. The default value is UTF-8.
     * </p>
     * 
     * @param encoding
     *        The encoding to use for the email within the Amazon SNS notification. UTF-8 is easier to use, but may not
     *        preserve all special characters when a message was encoded with a different encoding format. Base64
     *        preserves all special characters. The default value is UTF-8.
     * @see SNSActionEncoding
     */

    public void setEncoding(SNSActionEncoding encoding) {
        withEncoding(encoding);
    }

    /**
     * <p>
     * The encoding to use for the email within the Amazon SNS notification. UTF-8 is easier to use, but may not
     * preserve all special characters when a message was encoded with a different encoding format. Base64 preserves all
     * special characters. The default value is UTF-8.
     * </p>
     * 
     * @param encoding
     *        The encoding to use for the email within the Amazon SNS notification. UTF-8 is easier to use, but may not
     *        preserve all special characters when a message was encoded with a different encoding format. Base64
     *        preserves all special characters. The default value is UTF-8.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SNSActionEncoding
     */

    public SNSAction withEncoding(SNSActionEncoding encoding) {
        this.encoding = encoding.toString();
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
        if (getTopicArn() != null)
            sb.append("TopicArn: ").append(getTopicArn()).append(",");
        if (getEncoding() != null)
            sb.append("Encoding: ").append(getEncoding());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SNSAction == false)
            return false;
        SNSAction other = (SNSAction) obj;
        if (other.getTopicArn() == null ^ this.getTopicArn() == null)
            return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false)
            return false;
        if (other.getEncoding() == null ^ this.getEncoding() == null)
            return false;
        if (other.getEncoding() != null && other.getEncoding().equals(this.getEncoding()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode());
        hashCode = prime * hashCode + ((getEncoding() == null) ? 0 : getEncoding().hashCode());
        return hashCode;
    }

    @Override
    public SNSAction clone() {
        try {
            return (SNSAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
