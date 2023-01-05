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
package com.amazonaws.services.kafkaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A description of the settings for delivering logs to Amazon Kinesis Data Firehose.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/FirehoseLogDeliveryDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FirehoseLogDeliveryDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Kinesis Data Firehose delivery stream that is the destination for log delivery.
     * </p>
     */
    private String deliveryStream;
    /**
     * <p>
     * Specifies whether connector logs get delivered to Amazon Kinesis Data Firehose.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The name of the Kinesis Data Firehose delivery stream that is the destination for log delivery.
     * </p>
     * 
     * @param deliveryStream
     *        The name of the Kinesis Data Firehose delivery stream that is the destination for log delivery.
     */

    public void setDeliveryStream(String deliveryStream) {
        this.deliveryStream = deliveryStream;
    }

    /**
     * <p>
     * The name of the Kinesis Data Firehose delivery stream that is the destination for log delivery.
     * </p>
     * 
     * @return The name of the Kinesis Data Firehose delivery stream that is the destination for log delivery.
     */

    public String getDeliveryStream() {
        return this.deliveryStream;
    }

    /**
     * <p>
     * The name of the Kinesis Data Firehose delivery stream that is the destination for log delivery.
     * </p>
     * 
     * @param deliveryStream
     *        The name of the Kinesis Data Firehose delivery stream that is the destination for log delivery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirehoseLogDeliveryDescription withDeliveryStream(String deliveryStream) {
        setDeliveryStream(deliveryStream);
        return this;
    }

    /**
     * <p>
     * Specifies whether connector logs get delivered to Amazon Kinesis Data Firehose.
     * </p>
     * 
     * @param enabled
     *        Specifies whether connector logs get delivered to Amazon Kinesis Data Firehose.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether connector logs get delivered to Amazon Kinesis Data Firehose.
     * </p>
     * 
     * @return Specifies whether connector logs get delivered to Amazon Kinesis Data Firehose.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether connector logs get delivered to Amazon Kinesis Data Firehose.
     * </p>
     * 
     * @param enabled
     *        Specifies whether connector logs get delivered to Amazon Kinesis Data Firehose.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirehoseLogDeliveryDescription withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether connector logs get delivered to Amazon Kinesis Data Firehose.
     * </p>
     * 
     * @return Specifies whether connector logs get delivered to Amazon Kinesis Data Firehose.
     */

    public Boolean isEnabled() {
        return this.enabled;
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
        if (getDeliveryStream() != null)
            sb.append("DeliveryStream: ").append(getDeliveryStream()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FirehoseLogDeliveryDescription == false)
            return false;
        FirehoseLogDeliveryDescription other = (FirehoseLogDeliveryDescription) obj;
        if (other.getDeliveryStream() == null ^ this.getDeliveryStream() == null)
            return false;
        if (other.getDeliveryStream() != null && other.getDeliveryStream().equals(this.getDeliveryStream()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeliveryStream() == null) ? 0 : getDeliveryStream().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public FirehoseLogDeliveryDescription clone() {
        try {
            return (FirehoseLogDeliveryDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafkaconnect.model.transform.FirehoseLogDeliveryDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
