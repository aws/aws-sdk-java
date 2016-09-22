/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Describes hints for the buffering to perform before delivering data to the destination. Please note that these
 * options are treated as hints, and therefore Firehose may choose to use different values when it is optimal.
 * </p>
 */
public class BufferingHints implements Serializable, Cloneable {

    /**
     * <p>
     * Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default value is
     * 5.
     * </p>
     * <p>
     * We recommend setting SizeInMBs to a value greater than the amount of data you typically ingest into the delivery
     * stream in 10 seconds. For example, if you typically ingest data at 1 MB/sec set SizeInMBs to be 10 MB or higher.
     * </p>
     */
    private Integer sizeInMBs;
    /**
     * <p>
     * Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The
     * default value is 300.
     * </p>
     */
    private Integer intervalInSeconds;

    /**
     * <p>
     * Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default value is
     * 5.
     * </p>
     * <p>
     * We recommend setting SizeInMBs to a value greater than the amount of data you typically ingest into the delivery
     * stream in 10 seconds. For example, if you typically ingest data at 1 MB/sec set SizeInMBs to be 10 MB or higher.
     * </p>
     * 
     * @param sizeInMBs
     *        Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default
     *        value is 5.</p>
     *        <p>
     *        We recommend setting SizeInMBs to a value greater than the amount of data you typically ingest into the
     *        delivery stream in 10 seconds. For example, if you typically ingest data at 1 MB/sec set SizeInMBs to be
     *        10 MB or higher.
     */

    public void setSizeInMBs(Integer sizeInMBs) {
        this.sizeInMBs = sizeInMBs;
    }

    /**
     * <p>
     * Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default value is
     * 5.
     * </p>
     * <p>
     * We recommend setting SizeInMBs to a value greater than the amount of data you typically ingest into the delivery
     * stream in 10 seconds. For example, if you typically ingest data at 1 MB/sec set SizeInMBs to be 10 MB or higher.
     * </p>
     * 
     * @return Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default
     *         value is 5.</p>
     *         <p>
     *         We recommend setting SizeInMBs to a value greater than the amount of data you typically ingest into the
     *         delivery stream in 10 seconds. For example, if you typically ingest data at 1 MB/sec set SizeInMBs to be
     *         10 MB or higher.
     */

    public Integer getSizeInMBs() {
        return this.sizeInMBs;
    }

    /**
     * <p>
     * Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default value is
     * 5.
     * </p>
     * <p>
     * We recommend setting SizeInMBs to a value greater than the amount of data you typically ingest into the delivery
     * stream in 10 seconds. For example, if you typically ingest data at 1 MB/sec set SizeInMBs to be 10 MB or higher.
     * </p>
     * 
     * @param sizeInMBs
     *        Buffer incoming data to the specified size, in MBs, before delivering it to the destination. The default
     *        value is 5.</p>
     *        <p>
     *        We recommend setting SizeInMBs to a value greater than the amount of data you typically ingest into the
     *        delivery stream in 10 seconds. For example, if you typically ingest data at 1 MB/sec set SizeInMBs to be
     *        10 MB or higher.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BufferingHints withSizeInMBs(Integer sizeInMBs) {
        setSizeInMBs(sizeInMBs);
        return this;
    }

    /**
     * <p>
     * Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The
     * default value is 300.
     * </p>
     * 
     * @param intervalInSeconds
     *        Buffer incoming data for the specified period of time, in seconds, before delivering it to the
     *        destination. The default value is 300.
     */

    public void setIntervalInSeconds(Integer intervalInSeconds) {
        this.intervalInSeconds = intervalInSeconds;
    }

    /**
     * <p>
     * Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The
     * default value is 300.
     * </p>
     * 
     * @return Buffer incoming data for the specified period of time, in seconds, before delivering it to the
     *         destination. The default value is 300.
     */

    public Integer getIntervalInSeconds() {
        return this.intervalInSeconds;
    }

    /**
     * <p>
     * Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The
     * default value is 300.
     * </p>
     * 
     * @param intervalInSeconds
     *        Buffer incoming data for the specified period of time, in seconds, before delivering it to the
     *        destination. The default value is 300.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BufferingHints withIntervalInSeconds(Integer intervalInSeconds) {
        setIntervalInSeconds(intervalInSeconds);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSizeInMBs() != null)
            sb.append("SizeInMBs: " + getSizeInMBs() + ",");
        if (getIntervalInSeconds() != null)
            sb.append("IntervalInSeconds: " + getIntervalInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BufferingHints == false)
            return false;
        BufferingHints other = (BufferingHints) obj;
        if (other.getSizeInMBs() == null ^ this.getSizeInMBs() == null)
            return false;
        if (other.getSizeInMBs() != null && other.getSizeInMBs().equals(this.getSizeInMBs()) == false)
            return false;
        if (other.getIntervalInSeconds() == null ^ this.getIntervalInSeconds() == null)
            return false;
        if (other.getIntervalInSeconds() != null && other.getIntervalInSeconds().equals(this.getIntervalInSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSizeInMBs() == null) ? 0 : getSizeInMBs().hashCode());
        hashCode = prime * hashCode + ((getIntervalInSeconds() == null) ? 0 : getIntervalInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public BufferingHints clone() {
        try {
            return (BufferingHints) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
