/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for resource targets to receive notifications when Amazon Chime SDK meeting and attendee events
 * occur.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/MeetingNotificationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MeetingNotificationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The SNS topic ARN.
     * </p>
     */
    private String snsTopicArn;
    /**
     * <p>
     * The SQS queue ARN.
     * </p>
     */
    private String sqsQueueArn;

    /**
     * <p>
     * The SNS topic ARN.
     * </p>
     * 
     * @param snsTopicArn
     *        The SNS topic ARN.
     */

    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    /**
     * <p>
     * The SNS topic ARN.
     * </p>
     * 
     * @return The SNS topic ARN.
     */

    public String getSnsTopicArn() {
        return this.snsTopicArn;
    }

    /**
     * <p>
     * The SNS topic ARN.
     * </p>
     * 
     * @param snsTopicArn
     *        The SNS topic ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MeetingNotificationConfiguration withSnsTopicArn(String snsTopicArn) {
        setSnsTopicArn(snsTopicArn);
        return this;
    }

    /**
     * <p>
     * The SQS queue ARN.
     * </p>
     * 
     * @param sqsQueueArn
     *        The SQS queue ARN.
     */

    public void setSqsQueueArn(String sqsQueueArn) {
        this.sqsQueueArn = sqsQueueArn;
    }

    /**
     * <p>
     * The SQS queue ARN.
     * </p>
     * 
     * @return The SQS queue ARN.
     */

    public String getSqsQueueArn() {
        return this.sqsQueueArn;
    }

    /**
     * <p>
     * The SQS queue ARN.
     * </p>
     * 
     * @param sqsQueueArn
     *        The SQS queue ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MeetingNotificationConfiguration withSqsQueueArn(String sqsQueueArn) {
        setSqsQueueArn(sqsQueueArn);
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
        if (getSnsTopicArn() != null)
            sb.append("SnsTopicArn: ").append("***Sensitive Data Redacted***").append(",");
        if (getSqsQueueArn() != null)
            sb.append("SqsQueueArn: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MeetingNotificationConfiguration == false)
            return false;
        MeetingNotificationConfiguration other = (MeetingNotificationConfiguration) obj;
        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null)
            return false;
        if (other.getSnsTopicArn() != null && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false)
            return false;
        if (other.getSqsQueueArn() == null ^ this.getSqsQueueArn() == null)
            return false;
        if (other.getSqsQueueArn() != null && other.getSqsQueueArn().equals(this.getSqsQueueArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnsTopicArn() == null) ? 0 : getSnsTopicArn().hashCode());
        hashCode = prime * hashCode + ((getSqsQueueArn() == null) ? 0 : getSqsQueueArn().hashCode());
        return hashCode;
    }

    @Override
    public MeetingNotificationConfiguration clone() {
        try {
            return (MeetingNotificationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.MeetingNotificationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
