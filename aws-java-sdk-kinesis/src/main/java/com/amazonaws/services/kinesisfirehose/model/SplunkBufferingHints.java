/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The buffering options. If no value is specified, the default values for Splunk are used.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/SplunkBufferingHints" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SplunkBufferingHints implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The
     * default value is 60 (1 minute).
     * </p>
     */
    private Integer intervalInSeconds;
    /**
     * <p>
     * Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default value is
     * 5.
     * </p>
     */
    private Integer sizeInMBs;

    /**
     * <p>
     * Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The
     * default value is 60 (1 minute).
     * </p>
     * 
     * @param intervalInSeconds
     *        Buffer incoming data for the specified period of time, in seconds, before delivering it to the
     *        destination. The default value is 60 (1 minute).
     */

    public void setIntervalInSeconds(Integer intervalInSeconds) {
        this.intervalInSeconds = intervalInSeconds;
    }

    /**
     * <p>
     * Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The
     * default value is 60 (1 minute).
     * </p>
     * 
     * @return Buffer incoming data for the specified period of time, in seconds, before delivering it to the
     *         destination. The default value is 60 (1 minute).
     */

    public Integer getIntervalInSeconds() {
        return this.intervalInSeconds;
    }

    /**
     * <p>
     * Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The
     * default value is 60 (1 minute).
     * </p>
     * 
     * @param intervalInSeconds
     *        Buffer incoming data for the specified period of time, in seconds, before delivering it to the
     *        destination. The default value is 60 (1 minute).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SplunkBufferingHints withIntervalInSeconds(Integer intervalInSeconds) {
        setIntervalInSeconds(intervalInSeconds);
        return this;
    }

    /**
     * <p>
     * Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default value is
     * 5.
     * </p>
     * 
     * @param sizeInMBs
     *        Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default
     *        value is 5.
     */

    public void setSizeInMBs(Integer sizeInMBs) {
        this.sizeInMBs = sizeInMBs;
    }

    /**
     * <p>
     * Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default value is
     * 5.
     * </p>
     * 
     * @return Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default
     *         value is 5.
     */

    public Integer getSizeInMBs() {
        return this.sizeInMBs;
    }

    /**
     * <p>
     * Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default value is
     * 5.
     * </p>
     * 
     * @param sizeInMBs
     *        Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default
     *        value is 5.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SplunkBufferingHints withSizeInMBs(Integer sizeInMBs) {
        setSizeInMBs(sizeInMBs);
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
        if (getIntervalInSeconds() != null)
            sb.append("IntervalInSeconds: ").append(getIntervalInSeconds()).append(",");
        if (getSizeInMBs() != null)
            sb.append("SizeInMBs: ").append(getSizeInMBs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SplunkBufferingHints == false)
            return false;
        SplunkBufferingHints other = (SplunkBufferingHints) obj;
        if (other.getIntervalInSeconds() == null ^ this.getIntervalInSeconds() == null)
            return false;
        if (other.getIntervalInSeconds() != null && other.getIntervalInSeconds().equals(this.getIntervalInSeconds()) == false)
            return false;
        if (other.getSizeInMBs() == null ^ this.getSizeInMBs() == null)
            return false;
        if (other.getSizeInMBs() != null && other.getSizeInMBs().equals(this.getSizeInMBs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntervalInSeconds() == null) ? 0 : getIntervalInSeconds().hashCode());
        hashCode = prime * hashCode + ((getSizeInMBs() == null) ? 0 : getSizeInMBs().hashCode());
        return hashCode;
    }

    @Override
    public SplunkBufferingHints clone() {
        try {
            return (SplunkBufferingHints) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.SplunkBufferingHintsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
