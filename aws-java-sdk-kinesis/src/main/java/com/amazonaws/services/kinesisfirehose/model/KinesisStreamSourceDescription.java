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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about a Kinesis data stream used as the source for a Kinesis Data Firehose delivery stream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/KinesisStreamSourceDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KinesisStreamSourceDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source Kinesis data stream. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kinesis-streams"
     * >Amazon Kinesis Data Streams ARN Format</a>.
     * </p>
     */
    private String kinesisStreamARN;
    /**
     * <p>
     * The ARN of the role used by the source Kinesis data stream. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam">AWS Identity and
     * Access Management (IAM) ARN Format</a>.
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * Kinesis Data Firehose starts retrieving records from the Kinesis data stream starting with this timestamp.
     * </p>
     */
    private java.util.Date deliveryStartTimestamp;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source Kinesis data stream. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kinesis-streams"
     * >Amazon Kinesis Data Streams ARN Format</a>.
     * </p>
     * 
     * @param kinesisStreamARN
     *        The Amazon Resource Name (ARN) of the source Kinesis data stream. For more information, see <a href=
     *        "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kinesis-streams"
     *        >Amazon Kinesis Data Streams ARN Format</a>.
     */

    public void setKinesisStreamARN(String kinesisStreamARN) {
        this.kinesisStreamARN = kinesisStreamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source Kinesis data stream. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kinesis-streams"
     * >Amazon Kinesis Data Streams ARN Format</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the source Kinesis data stream. For more information, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kinesis-streams"
     *         >Amazon Kinesis Data Streams ARN Format</a>.
     */

    public String getKinesisStreamARN() {
        return this.kinesisStreamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source Kinesis data stream. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kinesis-streams"
     * >Amazon Kinesis Data Streams ARN Format</a>.
     * </p>
     * 
     * @param kinesisStreamARN
     *        The Amazon Resource Name (ARN) of the source Kinesis data stream. For more information, see <a href=
     *        "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kinesis-streams"
     *        >Amazon Kinesis Data Streams ARN Format</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisStreamSourceDescription withKinesisStreamARN(String kinesisStreamARN) {
        setKinesisStreamARN(kinesisStreamARN);
        return this;
    }

    /**
     * <p>
     * The ARN of the role used by the source Kinesis data stream. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam">AWS Identity and
     * Access Management (IAM) ARN Format</a>.
     * </p>
     * 
     * @param roleARN
     *        The ARN of the role used by the source Kinesis data stream. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam">AWS
     *        Identity and Access Management (IAM) ARN Format</a>.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The ARN of the role used by the source Kinesis data stream. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam">AWS Identity and
     * Access Management (IAM) ARN Format</a>.
     * </p>
     * 
     * @return The ARN of the role used by the source Kinesis data stream. For more information, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam">AWS
     *         Identity and Access Management (IAM) ARN Format</a>.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The ARN of the role used by the source Kinesis data stream. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam">AWS Identity and
     * Access Management (IAM) ARN Format</a>.
     * </p>
     * 
     * @param roleARN
     *        The ARN of the role used by the source Kinesis data stream. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam">AWS
     *        Identity and Access Management (IAM) ARN Format</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisStreamSourceDescription withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * Kinesis Data Firehose starts retrieving records from the Kinesis data stream starting with this timestamp.
     * </p>
     * 
     * @param deliveryStartTimestamp
     *        Kinesis Data Firehose starts retrieving records from the Kinesis data stream starting with this timestamp.
     */

    public void setDeliveryStartTimestamp(java.util.Date deliveryStartTimestamp) {
        this.deliveryStartTimestamp = deliveryStartTimestamp;
    }

    /**
     * <p>
     * Kinesis Data Firehose starts retrieving records from the Kinesis data stream starting with this timestamp.
     * </p>
     * 
     * @return Kinesis Data Firehose starts retrieving records from the Kinesis data stream starting with this
     *         timestamp.
     */

    public java.util.Date getDeliveryStartTimestamp() {
        return this.deliveryStartTimestamp;
    }

    /**
     * <p>
     * Kinesis Data Firehose starts retrieving records from the Kinesis data stream starting with this timestamp.
     * </p>
     * 
     * @param deliveryStartTimestamp
     *        Kinesis Data Firehose starts retrieving records from the Kinesis data stream starting with this timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisStreamSourceDescription withDeliveryStartTimestamp(java.util.Date deliveryStartTimestamp) {
        setDeliveryStartTimestamp(deliveryStartTimestamp);
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
        if (getKinesisStreamARN() != null)
            sb.append("KinesisStreamARN: ").append(getKinesisStreamARN()).append(",");
        if (getRoleARN() != null)
            sb.append("RoleARN: ").append(getRoleARN()).append(",");
        if (getDeliveryStartTimestamp() != null)
            sb.append("DeliveryStartTimestamp: ").append(getDeliveryStartTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KinesisStreamSourceDescription == false)
            return false;
        KinesisStreamSourceDescription other = (KinesisStreamSourceDescription) obj;
        if (other.getKinesisStreamARN() == null ^ this.getKinesisStreamARN() == null)
            return false;
        if (other.getKinesisStreamARN() != null && other.getKinesisStreamARN().equals(this.getKinesisStreamARN()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getDeliveryStartTimestamp() == null ^ this.getDeliveryStartTimestamp() == null)
            return false;
        if (other.getDeliveryStartTimestamp() != null && other.getDeliveryStartTimestamp().equals(this.getDeliveryStartTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKinesisStreamARN() == null) ? 0 : getKinesisStreamARN().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getDeliveryStartTimestamp() == null) ? 0 : getDeliveryStartTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public KinesisStreamSourceDescription clone() {
        try {
            return (KinesisStreamSourceDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.KinesisStreamSourceDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
