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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that defines an Amazon Kinesis Data Firehose destination for email events. You can use Amazon Kinesis Data
 * Firehose to stream data to other services, such as Amazon S3 and Amazon Redshift.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/KinesisFirehoseDestination"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KinesisFirehoseDestination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Amazon Pinpoint uses when sending email events to the Amazon
     * Kinesis Data Firehose stream.
     * </p>
     */
    private String iamRoleArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Kinesis Data Firehose stream that Amazon Pinpoint sends email events
     * to.
     * </p>
     */
    private String deliveryStreamArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Amazon Pinpoint uses when sending email events to the Amazon
     * Kinesis Data Firehose stream.
     * </p>
     * 
     * @param iamRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that Amazon Pinpoint uses when sending email events to the
     *        Amazon Kinesis Data Firehose stream.
     */

    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Amazon Pinpoint uses when sending email events to the Amazon
     * Kinesis Data Firehose stream.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that Amazon Pinpoint uses when sending email events to the
     *         Amazon Kinesis Data Firehose stream.
     */

    public String getIamRoleArn() {
        return this.iamRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that Amazon Pinpoint uses when sending email events to the Amazon
     * Kinesis Data Firehose stream.
     * </p>
     * 
     * @param iamRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that Amazon Pinpoint uses when sending email events to the
     *        Amazon Kinesis Data Firehose stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisFirehoseDestination withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Kinesis Data Firehose stream that Amazon Pinpoint sends email events
     * to.
     * </p>
     * 
     * @param deliveryStreamArn
     *        The Amazon Resource Name (ARN) of the Amazon Kinesis Data Firehose stream that Amazon Pinpoint sends email
     *        events to.
     */

    public void setDeliveryStreamArn(String deliveryStreamArn) {
        this.deliveryStreamArn = deliveryStreamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Kinesis Data Firehose stream that Amazon Pinpoint sends email events
     * to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon Kinesis Data Firehose stream that Amazon Pinpoint sends
     *         email events to.
     */

    public String getDeliveryStreamArn() {
        return this.deliveryStreamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Kinesis Data Firehose stream that Amazon Pinpoint sends email events
     * to.
     * </p>
     * 
     * @param deliveryStreamArn
     *        The Amazon Resource Name (ARN) of the Amazon Kinesis Data Firehose stream that Amazon Pinpoint sends email
     *        events to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisFirehoseDestination withDeliveryStreamArn(String deliveryStreamArn) {
        setDeliveryStreamArn(deliveryStreamArn);
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
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
        if (getDeliveryStreamArn() != null)
            sb.append("DeliveryStreamArn: ").append(getDeliveryStreamArn());
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
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getDeliveryStreamArn() == null ^ this.getDeliveryStreamArn() == null)
            return false;
        if (other.getDeliveryStreamArn() != null && other.getDeliveryStreamArn().equals(this.getDeliveryStreamArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDeliveryStreamArn() == null) ? 0 : getDeliveryStreamArn().hashCode());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointemail.model.transform.KinesisFirehoseDestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
