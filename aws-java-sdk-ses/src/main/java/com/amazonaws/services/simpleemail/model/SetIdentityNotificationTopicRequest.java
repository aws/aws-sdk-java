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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to specify the Amazon SNS topic to which Amazon SES will publish bounce, complaint, or delivery
 * notifications for emails sent with that identity as the Source. For information about Amazon SES notifications, see
 * the <a href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/notifications-via-sns.html">Amazon SES Developer
 * Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SetIdentityNotificationTopic" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetIdentityNotificationTopicRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identity (email address or domain) that you want to set the Amazon SNS topic for.
     * </p>
     * <important>
     * <p>
     * You can only specify a verified identity for this parameter.
     * </p>
     * </important>
     * <p>
     * You can specify an identity by using its name or by using its Amazon Resource Name (ARN). The following examples
     * are all valid identities: <code>sender@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * </p>
     */
    private String identity;
    /**
     * <p>
     * The type of notifications that will be published to the specified Amazon SNS topic.
     * </p>
     */
    private String notificationType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic. If the parameter is omitted from the request or a null
     * value is passed, <code>SnsTopic</code> is cleared and publishing is disabled.
     * </p>
     */
    private String snsTopic;

    /**
     * <p>
     * The identity (email address or domain) that you want to set the Amazon SNS topic for.
     * </p>
     * <important>
     * <p>
     * You can only specify a verified identity for this parameter.
     * </p>
     * </important>
     * <p>
     * You can specify an identity by using its name or by using its Amazon Resource Name (ARN). The following examples
     * are all valid identities: <code>sender@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * </p>
     * 
     * @param identity
     *        The identity (email address or domain) that you want to set the Amazon SNS topic for.</p> <important>
     *        <p>
     *        You can only specify a verified identity for this parameter.
     *        </p>
     *        </important>
     *        <p>
     *        You can specify an identity by using its name or by using its Amazon Resource Name (ARN). The following
     *        examples are all valid identities: <code>sender@example.com</code>, <code>example.com</code>,
     *        <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     */

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     * <p>
     * The identity (email address or domain) that you want to set the Amazon SNS topic for.
     * </p>
     * <important>
     * <p>
     * You can only specify a verified identity for this parameter.
     * </p>
     * </important>
     * <p>
     * You can specify an identity by using its name or by using its Amazon Resource Name (ARN). The following examples
     * are all valid identities: <code>sender@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * </p>
     * 
     * @return The identity (email address or domain) that you want to set the Amazon SNS topic for.</p> <important>
     *         <p>
     *         You can only specify a verified identity for this parameter.
     *         </p>
     *         </important>
     *         <p>
     *         You can specify an identity by using its name or by using its Amazon Resource Name (ARN). The following
     *         examples are all valid identities: <code>sender@example.com</code>, <code>example.com</code>,
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     */

    public String getIdentity() {
        return this.identity;
    }

    /**
     * <p>
     * The identity (email address or domain) that you want to set the Amazon SNS topic for.
     * </p>
     * <important>
     * <p>
     * You can only specify a verified identity for this parameter.
     * </p>
     * </important>
     * <p>
     * You can specify an identity by using its name or by using its Amazon Resource Name (ARN). The following examples
     * are all valid identities: <code>sender@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * </p>
     * 
     * @param identity
     *        The identity (email address or domain) that you want to set the Amazon SNS topic for.</p> <important>
     *        <p>
     *        You can only specify a verified identity for this parameter.
     *        </p>
     *        </important>
     *        <p>
     *        You can specify an identity by using its name or by using its Amazon Resource Name (ARN). The following
     *        examples are all valid identities: <code>sender@example.com</code>, <code>example.com</code>,
     *        <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetIdentityNotificationTopicRequest withIdentity(String identity) {
        setIdentity(identity);
        return this;
    }

    /**
     * <p>
     * The type of notifications that will be published to the specified Amazon SNS topic.
     * </p>
     * 
     * @param notificationType
     *        The type of notifications that will be published to the specified Amazon SNS topic.
     * @see NotificationType
     */

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    /**
     * <p>
     * The type of notifications that will be published to the specified Amazon SNS topic.
     * </p>
     * 
     * @return The type of notifications that will be published to the specified Amazon SNS topic.
     * @see NotificationType
     */

    public String getNotificationType() {
        return this.notificationType;
    }

    /**
     * <p>
     * The type of notifications that will be published to the specified Amazon SNS topic.
     * </p>
     * 
     * @param notificationType
     *        The type of notifications that will be published to the specified Amazon SNS topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationType
     */

    public SetIdentityNotificationTopicRequest withNotificationType(String notificationType) {
        setNotificationType(notificationType);
        return this;
    }

    /**
     * <p>
     * The type of notifications that will be published to the specified Amazon SNS topic.
     * </p>
     * 
     * @param notificationType
     *        The type of notifications that will be published to the specified Amazon SNS topic.
     * @see NotificationType
     */

    public void setNotificationType(NotificationType notificationType) {
        withNotificationType(notificationType);
    }

    /**
     * <p>
     * The type of notifications that will be published to the specified Amazon SNS topic.
     * </p>
     * 
     * @param notificationType
     *        The type of notifications that will be published to the specified Amazon SNS topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationType
     */

    public SetIdentityNotificationTopicRequest withNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic. If the parameter is omitted from the request or a null
     * value is passed, <code>SnsTopic</code> is cleared and publishing is disabled.
     * </p>
     * 
     * @param snsTopic
     *        The Amazon Resource Name (ARN) of the Amazon SNS topic. If the parameter is omitted from the request or a
     *        null value is passed, <code>SnsTopic</code> is cleared and publishing is disabled.
     */

    public void setSnsTopic(String snsTopic) {
        this.snsTopic = snsTopic;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic. If the parameter is omitted from the request or a null
     * value is passed, <code>SnsTopic</code> is cleared and publishing is disabled.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon SNS topic. If the parameter is omitted from the request or a
     *         null value is passed, <code>SnsTopic</code> is cleared and publishing is disabled.
     */

    public String getSnsTopic() {
        return this.snsTopic;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic. If the parameter is omitted from the request or a null
     * value is passed, <code>SnsTopic</code> is cleared and publishing is disabled.
     * </p>
     * 
     * @param snsTopic
     *        The Amazon Resource Name (ARN) of the Amazon SNS topic. If the parameter is omitted from the request or a
     *        null value is passed, <code>SnsTopic</code> is cleared and publishing is disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetIdentityNotificationTopicRequest withSnsTopic(String snsTopic) {
        setSnsTopic(snsTopic);
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
        if (getIdentity() != null)
            sb.append("Identity: ").append(getIdentity()).append(",");
        if (getNotificationType() != null)
            sb.append("NotificationType: ").append(getNotificationType()).append(",");
        if (getSnsTopic() != null)
            sb.append("SnsTopic: ").append(getSnsTopic());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetIdentityNotificationTopicRequest == false)
            return false;
        SetIdentityNotificationTopicRequest other = (SetIdentityNotificationTopicRequest) obj;
        if (other.getIdentity() == null ^ this.getIdentity() == null)
            return false;
        if (other.getIdentity() != null && other.getIdentity().equals(this.getIdentity()) == false)
            return false;
        if (other.getNotificationType() == null ^ this.getNotificationType() == null)
            return false;
        if (other.getNotificationType() != null && other.getNotificationType().equals(this.getNotificationType()) == false)
            return false;
        if (other.getSnsTopic() == null ^ this.getSnsTopic() == null)
            return false;
        if (other.getSnsTopic() != null && other.getSnsTopic().equals(this.getSnsTopic()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentity() == null) ? 0 : getIdentity().hashCode());
        hashCode = prime * hashCode + ((getNotificationType() == null) ? 0 : getNotificationType().hashCode());
        hashCode = prime * hashCode + ((getSnsTopic() == null) ? 0 : getSnsTopic().hashCode());
        return hashCode;
    }

    @Override
    public SetIdentityNotificationTopicRequest clone() {
        return (SetIdentityNotificationTopicRequest) super.clone();
    }

}
