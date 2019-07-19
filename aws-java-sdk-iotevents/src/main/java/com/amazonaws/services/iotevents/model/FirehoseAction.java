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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Sends information about the detector model instance and the event which triggered the action to a Kinesis Data
 * Firehose stream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/FirehoseAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FirehoseAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Kinesis Data Firehose stream where the data is written.
     * </p>
     */
    private String deliveryStreamName;
    /**
     * <p>
     * A character separator that is used to separate records written to the Kinesis Data Firehose stream. Valid values
     * are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
     * </p>
     */
    private String separator;

    /**
     * <p>
     * The name of the Kinesis Data Firehose stream where the data is written.
     * </p>
     * 
     * @param deliveryStreamName
     *        The name of the Kinesis Data Firehose stream where the data is written.
     */

    public void setDeliveryStreamName(String deliveryStreamName) {
        this.deliveryStreamName = deliveryStreamName;
    }

    /**
     * <p>
     * The name of the Kinesis Data Firehose stream where the data is written.
     * </p>
     * 
     * @return The name of the Kinesis Data Firehose stream where the data is written.
     */

    public String getDeliveryStreamName() {
        return this.deliveryStreamName;
    }

    /**
     * <p>
     * The name of the Kinesis Data Firehose stream where the data is written.
     * </p>
     * 
     * @param deliveryStreamName
     *        The name of the Kinesis Data Firehose stream where the data is written.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirehoseAction withDeliveryStreamName(String deliveryStreamName) {
        setDeliveryStreamName(deliveryStreamName);
        return this;
    }

    /**
     * <p>
     * A character separator that is used to separate records written to the Kinesis Data Firehose stream. Valid values
     * are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
     * </p>
     * 
     * @param separator
     *        A character separator that is used to separate records written to the Kinesis Data Firehose stream. Valid
     *        values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
     */

    public void setSeparator(String separator) {
        this.separator = separator;
    }

    /**
     * <p>
     * A character separator that is used to separate records written to the Kinesis Data Firehose stream. Valid values
     * are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
     * </p>
     * 
     * @return A character separator that is used to separate records written to the Kinesis Data Firehose stream. Valid
     *         values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
     */

    public String getSeparator() {
        return this.separator;
    }

    /**
     * <p>
     * A character separator that is used to separate records written to the Kinesis Data Firehose stream. Valid values
     * are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
     * </p>
     * 
     * @param separator
     *        A character separator that is used to separate records written to the Kinesis Data Firehose stream. Valid
     *        values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline), ',' (comma).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirehoseAction withSeparator(String separator) {
        setSeparator(separator);
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
        if (getDeliveryStreamName() != null)
            sb.append("DeliveryStreamName: ").append(getDeliveryStreamName()).append(",");
        if (getSeparator() != null)
            sb.append("Separator: ").append(getSeparator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FirehoseAction == false)
            return false;
        FirehoseAction other = (FirehoseAction) obj;
        if (other.getDeliveryStreamName() == null ^ this.getDeliveryStreamName() == null)
            return false;
        if (other.getDeliveryStreamName() != null && other.getDeliveryStreamName().equals(this.getDeliveryStreamName()) == false)
            return false;
        if (other.getSeparator() == null ^ this.getSeparator() == null)
            return false;
        if (other.getSeparator() != null && other.getSeparator().equals(this.getSeparator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeliveryStreamName() == null) ? 0 : getDeliveryStreamName().hashCode());
        hashCode = prime * hashCode + ((getSeparator() == null) ? 0 : getSeparator().hashCode());
        return hashCode;
    }

    @Override
    public FirehoseAction clone() {
        try {
            return (FirehoseAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.FirehoseActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
