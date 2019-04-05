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
 * Contains the delivery stream ARN and the IAM role ARN associated with an Amazon Kinesis Firehose event destination.
 * </p>
 * <p>
 * Event destinations, such as Amazon Kinesis Firehose, are associated with configuration sets, which enable you to
 * publish email sending events. For information about using configuration sets, see the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer
 * Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/KinesisFirehoseDestination" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KinesisFirehoseDestination implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the IAM role under which Amazon SES publishes email sending events to the Amazon Kinesis Firehose
     * stream.
     * </p>
     */
    private String iAMRoleARN;
    /**
     * <p>
     * The ARN of the Amazon Kinesis Firehose stream that email sending events should be published to.
     * </p>
     */
    private String deliveryStreamARN;

    /**
     * <p>
     * The ARN of the IAM role under which Amazon SES publishes email sending events to the Amazon Kinesis Firehose
     * stream.
     * </p>
     * 
     * @param iAMRoleARN
     *        The ARN of the IAM role under which Amazon SES publishes email sending events to the Amazon Kinesis
     *        Firehose stream.
     */

    public void setIAMRoleARN(String iAMRoleARN) {
        this.iAMRoleARN = iAMRoleARN;
    }

    /**
     * <p>
     * The ARN of the IAM role under which Amazon SES publishes email sending events to the Amazon Kinesis Firehose
     * stream.
     * </p>
     * 
     * @return The ARN of the IAM role under which Amazon SES publishes email sending events to the Amazon Kinesis
     *         Firehose stream.
     */

    public String getIAMRoleARN() {
        return this.iAMRoleARN;
    }

    /**
     * <p>
     * The ARN of the IAM role under which Amazon SES publishes email sending events to the Amazon Kinesis Firehose
     * stream.
     * </p>
     * 
     * @param iAMRoleARN
     *        The ARN of the IAM role under which Amazon SES publishes email sending events to the Amazon Kinesis
     *        Firehose stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisFirehoseDestination withIAMRoleARN(String iAMRoleARN) {
        setIAMRoleARN(iAMRoleARN);
        return this;
    }

    /**
     * <p>
     * The ARN of the Amazon Kinesis Firehose stream that email sending events should be published to.
     * </p>
     * 
     * @param deliveryStreamARN
     *        The ARN of the Amazon Kinesis Firehose stream that email sending events should be published to.
     */

    public void setDeliveryStreamARN(String deliveryStreamARN) {
        this.deliveryStreamARN = deliveryStreamARN;
    }

    /**
     * <p>
     * The ARN of the Amazon Kinesis Firehose stream that email sending events should be published to.
     * </p>
     * 
     * @return The ARN of the Amazon Kinesis Firehose stream that email sending events should be published to.
     */

    public String getDeliveryStreamARN() {
        return this.deliveryStreamARN;
    }

    /**
     * <p>
     * The ARN of the Amazon Kinesis Firehose stream that email sending events should be published to.
     * </p>
     * 
     * @param deliveryStreamARN
     *        The ARN of the Amazon Kinesis Firehose stream that email sending events should be published to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisFirehoseDestination withDeliveryStreamARN(String deliveryStreamARN) {
        setDeliveryStreamARN(deliveryStreamARN);
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
        if (getIAMRoleARN() != null)
            sb.append("IAMRoleARN: ").append(getIAMRoleARN()).append(",");
        if (getDeliveryStreamARN() != null)
            sb.append("DeliveryStreamARN: ").append(getDeliveryStreamARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KinesisFirehoseDestination == false)
            return false;
        KinesisFirehoseDestination other = (KinesisFirehoseDestination) obj;
        if (other.getIAMRoleARN() == null ^ this.getIAMRoleARN() == null)
            return false;
        if (other.getIAMRoleARN() != null && other.getIAMRoleARN().equals(this.getIAMRoleARN()) == false)
            return false;
        if (other.getDeliveryStreamARN() == null ^ this.getDeliveryStreamARN() == null)
            return false;
        if (other.getDeliveryStreamARN() != null && other.getDeliveryStreamARN().equals(this.getDeliveryStreamARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIAMRoleARN() == null) ? 0 : getIAMRoleARN().hashCode());
        hashCode = prime * hashCode + ((getDeliveryStreamARN() == null) ? 0 : getDeliveryStreamARN().hashCode());
        return hashCode;
    }

    @Override
    public KinesisFirehoseDestination clone() {
        try {
            return (KinesisFirehoseDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
