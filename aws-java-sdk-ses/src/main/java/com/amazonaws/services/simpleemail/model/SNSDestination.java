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
 * Contains the topic ARN associated with an Amazon Simple Notification Service (Amazon SNS) event destination.
 * </p>
 * <p>
 * Event destinations, such as Amazon SNS, are associated with configuration sets, which enable you to publish email
 * sending events. For information about using configuration sets, see the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer
 * Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SNSDestination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SNSDestination implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the Amazon SNS topic that email sending events will be published to. An example of an Amazon SNS topic
     * ARN is <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more information about Amazon SNS topics, see
     * the <a href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon SNS Developer Guide</a>.
     * </p>
     */
    private String topicARN;

    /**
     * <p>
     * The ARN of the Amazon SNS topic that email sending events will be published to. An example of an Amazon SNS topic
     * ARN is <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more information about Amazon SNS topics, see
     * the <a href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon SNS Developer Guide</a>.
     * </p>
     * 
     * @param topicARN
     *        The ARN of the Amazon SNS topic that email sending events will be published to. An example of an Amazon
     *        SNS topic ARN is <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more information about
     *        Amazon SNS topics, see the <a href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon SNS
     *        Developer Guide</a>.
     */

    public void setTopicARN(String topicARN) {
        this.topicARN = topicARN;
    }

    /**
     * <p>
     * The ARN of the Amazon SNS topic that email sending events will be published to. An example of an Amazon SNS topic
     * ARN is <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more information about Amazon SNS topics, see
     * the <a href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon SNS Developer Guide</a>.
     * </p>
     * 
     * @return The ARN of the Amazon SNS topic that email sending events will be published to. An example of an Amazon
     *         SNS topic ARN is <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more information about
     *         Amazon SNS topics, see the <a href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon SNS
     *         Developer Guide</a>.
     */

    public String getTopicARN() {
        return this.topicARN;
    }

    /**
     * <p>
     * The ARN of the Amazon SNS topic that email sending events will be published to. An example of an Amazon SNS topic
     * ARN is <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more information about Amazon SNS topics, see
     * the <a href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon SNS Developer Guide</a>.
     * </p>
     * 
     * @param topicARN
     *        The ARN of the Amazon SNS topic that email sending events will be published to. An example of an Amazon
     *        SNS topic ARN is <code>arn:aws:sns:us-west-2:123456789012:MyTopic</code>. For more information about
     *        Amazon SNS topics, see the <a href="http://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html">Amazon SNS
     *        Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SNSDestination withTopicARN(String topicARN) {
        setTopicARN(topicARN);
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
        if (getTopicARN() != null)
            sb.append("TopicARN: ").append(getTopicARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SNSDestination == false)
            return false;
        SNSDestination other = (SNSDestination) obj;
        if (other.getTopicARN() == null ^ this.getTopicARN() == null)
            return false;
        if (other.getTopicARN() != null && other.getTopicARN().equals(this.getTopicARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopicARN() == null) ? 0 : getTopicARN().hashCode());
        return hashCode;
    }

    @Override
    public SNSDestination clone() {
        try {
            return (SNSDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
