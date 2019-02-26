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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a segment of video or other time-delimited data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-archived-media-2017-09-30/Fragment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Fragment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The index value of the fragment.
     * </p>
     */
    private String fragmentNumber;
    /**
     * <p>
     * The total fragment size, including information about the fragment and contained media data.
     * </p>
     */
    private Long fragmentSizeInBytes;
    /**
     * <p>
     * The timestamp from the producer corresponding to the fragment.
     * </p>
     */
    private java.util.Date producerTimestamp;
    /**
     * <p>
     * The timestamp from the AWS server corresponding to the fragment.
     * </p>
     */
    private java.util.Date serverTimestamp;
    /**
     * <p>
     * The playback duration or other time value associated with the fragment.
     * </p>
     */
    private Long fragmentLengthInMilliseconds;

    /**
     * <p>
     * The index value of the fragment.
     * </p>
     * 
     * @param fragmentNumber
     *        The index value of the fragment.
     */

    public void setFragmentNumber(String fragmentNumber) {
        this.fragmentNumber = fragmentNumber;
    }

    /**
     * <p>
     * The index value of the fragment.
     * </p>
     * 
     * @return The index value of the fragment.
     */

    public String getFragmentNumber() {
        return this.fragmentNumber;
    }

    /**
     * <p>
     * The index value of the fragment.
     * </p>
     * 
     * @param fragmentNumber
     *        The index value of the fragment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fragment withFragmentNumber(String fragmentNumber) {
        setFragmentNumber(fragmentNumber);
        return this;
    }

    /**
     * <p>
     * The total fragment size, including information about the fragment and contained media data.
     * </p>
     * 
     * @param fragmentSizeInBytes
     *        The total fragment size, including information about the fragment and contained media data.
     */

    public void setFragmentSizeInBytes(Long fragmentSizeInBytes) {
        this.fragmentSizeInBytes = fragmentSizeInBytes;
    }

    /**
     * <p>
     * The total fragment size, including information about the fragment and contained media data.
     * </p>
     * 
     * @return The total fragment size, including information about the fragment and contained media data.
     */

    public Long getFragmentSizeInBytes() {
        return this.fragmentSizeInBytes;
    }

    /**
     * <p>
     * The total fragment size, including information about the fragment and contained media data.
     * </p>
     * 
     * @param fragmentSizeInBytes
     *        The total fragment size, including information about the fragment and contained media data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fragment withFragmentSizeInBytes(Long fragmentSizeInBytes) {
        setFragmentSizeInBytes(fragmentSizeInBytes);
        return this;
    }

    /**
     * <p>
     * The timestamp from the producer corresponding to the fragment.
     * </p>
     * 
     * @param producerTimestamp
     *        The timestamp from the producer corresponding to the fragment.
     */

    public void setProducerTimestamp(java.util.Date producerTimestamp) {
        this.producerTimestamp = producerTimestamp;
    }

    /**
     * <p>
     * The timestamp from the producer corresponding to the fragment.
     * </p>
     * 
     * @return The timestamp from the producer corresponding to the fragment.
     */

    public java.util.Date getProducerTimestamp() {
        return this.producerTimestamp;
    }

    /**
     * <p>
     * The timestamp from the producer corresponding to the fragment.
     * </p>
     * 
     * @param producerTimestamp
     *        The timestamp from the producer corresponding to the fragment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fragment withProducerTimestamp(java.util.Date producerTimestamp) {
        setProducerTimestamp(producerTimestamp);
        return this;
    }

    /**
     * <p>
     * The timestamp from the AWS server corresponding to the fragment.
     * </p>
     * 
     * @param serverTimestamp
     *        The timestamp from the AWS server corresponding to the fragment.
     */

    public void setServerTimestamp(java.util.Date serverTimestamp) {
        this.serverTimestamp = serverTimestamp;
    }

    /**
     * <p>
     * The timestamp from the AWS server corresponding to the fragment.
     * </p>
     * 
     * @return The timestamp from the AWS server corresponding to the fragment.
     */

    public java.util.Date getServerTimestamp() {
        return this.serverTimestamp;
    }

    /**
     * <p>
     * The timestamp from the AWS server corresponding to the fragment.
     * </p>
     * 
     * @param serverTimestamp
     *        The timestamp from the AWS server corresponding to the fragment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fragment withServerTimestamp(java.util.Date serverTimestamp) {
        setServerTimestamp(serverTimestamp);
        return this;
    }

    /**
     * <p>
     * The playback duration or other time value associated with the fragment.
     * </p>
     * 
     * @param fragmentLengthInMilliseconds
     *        The playback duration or other time value associated with the fragment.
     */

    public void setFragmentLengthInMilliseconds(Long fragmentLengthInMilliseconds) {
        this.fragmentLengthInMilliseconds = fragmentLengthInMilliseconds;
    }

    /**
     * <p>
     * The playback duration or other time value associated with the fragment.
     * </p>
     * 
     * @return The playback duration or other time value associated with the fragment.
     */

    public Long getFragmentLengthInMilliseconds() {
        return this.fragmentLengthInMilliseconds;
    }

    /**
     * <p>
     * The playback duration or other time value associated with the fragment.
     * </p>
     * 
     * @param fragmentLengthInMilliseconds
     *        The playback duration or other time value associated with the fragment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fragment withFragmentLengthInMilliseconds(Long fragmentLengthInMilliseconds) {
        setFragmentLengthInMilliseconds(fragmentLengthInMilliseconds);
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
        if (getFragmentNumber() != null)
            sb.append("FragmentNumber: ").append(getFragmentNumber()).append(",");
        if (getFragmentSizeInBytes() != null)
            sb.append("FragmentSizeInBytes: ").append(getFragmentSizeInBytes()).append(",");
        if (getProducerTimestamp() != null)
            sb.append("ProducerTimestamp: ").append(getProducerTimestamp()).append(",");
        if (getServerTimestamp() != null)
            sb.append("ServerTimestamp: ").append(getServerTimestamp()).append(",");
        if (getFragmentLengthInMilliseconds() != null)
            sb.append("FragmentLengthInMilliseconds: ").append(getFragmentLengthInMilliseconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Fragment == false)
            return false;
        Fragment other = (Fragment) obj;
        if (other.getFragmentNumber() == null ^ this.getFragmentNumber() == null)
            return false;
        if (other.getFragmentNumber() != null && other.getFragmentNumber().equals(this.getFragmentNumber()) == false)
            return false;
        if (other.getFragmentSizeInBytes() == null ^ this.getFragmentSizeInBytes() == null)
            return false;
        if (other.getFragmentSizeInBytes() != null && other.getFragmentSizeInBytes().equals(this.getFragmentSizeInBytes()) == false)
            return false;
        if (other.getProducerTimestamp() == null ^ this.getProducerTimestamp() == null)
            return false;
        if (other.getProducerTimestamp() != null && other.getProducerTimestamp().equals(this.getProducerTimestamp()) == false)
            return false;
        if (other.getServerTimestamp() == null ^ this.getServerTimestamp() == null)
            return false;
        if (other.getServerTimestamp() != null && other.getServerTimestamp().equals(this.getServerTimestamp()) == false)
            return false;
        if (other.getFragmentLengthInMilliseconds() == null ^ this.getFragmentLengthInMilliseconds() == null)
            return false;
        if (other.getFragmentLengthInMilliseconds() != null && other.getFragmentLengthInMilliseconds().equals(this.getFragmentLengthInMilliseconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFragmentNumber() == null) ? 0 : getFragmentNumber().hashCode());
        hashCode = prime * hashCode + ((getFragmentSizeInBytes() == null) ? 0 : getFragmentSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getProducerTimestamp() == null) ? 0 : getProducerTimestamp().hashCode());
        hashCode = prime * hashCode + ((getServerTimestamp() == null) ? 0 : getServerTimestamp().hashCode());
        hashCode = prime * hashCode + ((getFragmentLengthInMilliseconds() == null) ? 0 : getFragmentLengthInMilliseconds().hashCode());
        return hashCode;
    }

    @Override
    public Fragment clone() {
        try {
            return (Fragment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisvideo.model.transform.FragmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
