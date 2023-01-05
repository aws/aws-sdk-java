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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the starting point in a Kinesis stream to start processing. You can use the producer timestamp or the
 * fragment number. One of either producer timestamp or fragment number is required. If you use the producer timestamp,
 * you must put the time in milliseconds. For more information about fragment numbers, see <a
 * href="https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_reader_Fragment.html">Fragment</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KinesisVideoStreamStartSelector implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timestamp from the producer corresponding to the fragment, in milliseconds, expressed in unix time format.
     * </p>
     */
    private Long producerTimestamp;
    /**
     * <p>
     * The unique identifier of the fragment. This value monotonically increases based on the ingestion order.
     * </p>
     */
    private String fragmentNumber;

    /**
     * <p>
     * The timestamp from the producer corresponding to the fragment, in milliseconds, expressed in unix time format.
     * </p>
     * 
     * @param producerTimestamp
     *        The timestamp from the producer corresponding to the fragment, in milliseconds, expressed in unix time
     *        format.
     */

    public void setProducerTimestamp(Long producerTimestamp) {
        this.producerTimestamp = producerTimestamp;
    }

    /**
     * <p>
     * The timestamp from the producer corresponding to the fragment, in milliseconds, expressed in unix time format.
     * </p>
     * 
     * @return The timestamp from the producer corresponding to the fragment, in milliseconds, expressed in unix time
     *         format.
     */

    public Long getProducerTimestamp() {
        return this.producerTimestamp;
    }

    /**
     * <p>
     * The timestamp from the producer corresponding to the fragment, in milliseconds, expressed in unix time format.
     * </p>
     * 
     * @param producerTimestamp
     *        The timestamp from the producer corresponding to the fragment, in milliseconds, expressed in unix time
     *        format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisVideoStreamStartSelector withProducerTimestamp(Long producerTimestamp) {
        setProducerTimestamp(producerTimestamp);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the fragment. This value monotonically increases based on the ingestion order.
     * </p>
     * 
     * @param fragmentNumber
     *        The unique identifier of the fragment. This value monotonically increases based on the ingestion order.
     */

    public void setFragmentNumber(String fragmentNumber) {
        this.fragmentNumber = fragmentNumber;
    }

    /**
     * <p>
     * The unique identifier of the fragment. This value monotonically increases based on the ingestion order.
     * </p>
     * 
     * @return The unique identifier of the fragment. This value monotonically increases based on the ingestion order.
     */

    public String getFragmentNumber() {
        return this.fragmentNumber;
    }

    /**
     * <p>
     * The unique identifier of the fragment. This value monotonically increases based on the ingestion order.
     * </p>
     * 
     * @param fragmentNumber
     *        The unique identifier of the fragment. This value monotonically increases based on the ingestion order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisVideoStreamStartSelector withFragmentNumber(String fragmentNumber) {
        setFragmentNumber(fragmentNumber);
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
        if (getProducerTimestamp() != null)
            sb.append("ProducerTimestamp: ").append(getProducerTimestamp()).append(",");
        if (getFragmentNumber() != null)
            sb.append("FragmentNumber: ").append(getFragmentNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KinesisVideoStreamStartSelector == false)
            return false;
        KinesisVideoStreamStartSelector other = (KinesisVideoStreamStartSelector) obj;
        if (other.getProducerTimestamp() == null ^ this.getProducerTimestamp() == null)
            return false;
        if (other.getProducerTimestamp() != null && other.getProducerTimestamp().equals(this.getProducerTimestamp()) == false)
            return false;
        if (other.getFragmentNumber() == null ^ this.getFragmentNumber() == null)
            return false;
        if (other.getFragmentNumber() != null && other.getFragmentNumber().equals(this.getFragmentNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProducerTimestamp() == null) ? 0 : getProducerTimestamp().hashCode());
        hashCode = prime * hashCode + ((getFragmentNumber() == null) ? 0 : getFragmentNumber().hashCode());
        return hashCode;
    }

    @Override
    public KinesisVideoStreamStartSelector clone() {
        try {
            return (KinesisVideoStreamStartSelector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.KinesisVideoStreamStartSelectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
