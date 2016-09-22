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
package com.amazonaws.services.kinesisanalytics.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the point at which the application reads from the streaming source.
 * </p>
 */
public class InputStartingPositionConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * The starting position on the stream.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LATEST</code> - Start reading just after the most recent record in the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRIM_HORIZON</code> - Start reading at the last untrimmed record in the stream, which is the oldest record
     * available in the stream. This option is not available for an Amazon Kinesis Firehose delivery stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAST_STOPPED_POINT</code> - Resume reading from where the application last stopped reading.
     * </p>
     * </li>
     * </ul>
     */
    private String inputStartingPosition;

    /**
     * <p>
     * The starting position on the stream.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LATEST</code> - Start reading just after the most recent record in the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRIM_HORIZON</code> - Start reading at the last untrimmed record in the stream, which is the oldest record
     * available in the stream. This option is not available for an Amazon Kinesis Firehose delivery stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAST_STOPPED_POINT</code> - Resume reading from where the application last stopped reading.
     * </p>
     * </li>
     * </ul>
     * 
     * @param inputStartingPosition
     *        The starting position on the stream.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LATEST</code> - Start reading just after the most recent record in the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRIM_HORIZON</code> - Start reading at the last untrimmed record in the stream, which is the oldest
     *        record available in the stream. This option is not available for an Amazon Kinesis Firehose delivery
     *        stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LAST_STOPPED_POINT</code> - Resume reading from where the application last stopped reading.
     *        </p>
     *        </li>
     * @see InputStartingPosition
     */

    public void setInputStartingPosition(String inputStartingPosition) {
        this.inputStartingPosition = inputStartingPosition;
    }

    /**
     * <p>
     * The starting position on the stream.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LATEST</code> - Start reading just after the most recent record in the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRIM_HORIZON</code> - Start reading at the last untrimmed record in the stream, which is the oldest record
     * available in the stream. This option is not available for an Amazon Kinesis Firehose delivery stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAST_STOPPED_POINT</code> - Resume reading from where the application last stopped reading.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The starting position on the stream.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>LATEST</code> - Start reading just after the most recent record in the stream.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TRIM_HORIZON</code> - Start reading at the last untrimmed record in the stream, which is the oldest
     *         record available in the stream. This option is not available for an Amazon Kinesis Firehose delivery
     *         stream.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LAST_STOPPED_POINT</code> - Resume reading from where the application last stopped reading.
     *         </p>
     *         </li>
     * @see InputStartingPosition
     */

    public String getInputStartingPosition() {
        return this.inputStartingPosition;
    }

    /**
     * <p>
     * The starting position on the stream.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LATEST</code> - Start reading just after the most recent record in the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRIM_HORIZON</code> - Start reading at the last untrimmed record in the stream, which is the oldest record
     * available in the stream. This option is not available for an Amazon Kinesis Firehose delivery stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAST_STOPPED_POINT</code> - Resume reading from where the application last stopped reading.
     * </p>
     * </li>
     * </ul>
     * 
     * @param inputStartingPosition
     *        The starting position on the stream.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LATEST</code> - Start reading just after the most recent record in the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRIM_HORIZON</code> - Start reading at the last untrimmed record in the stream, which is the oldest
     *        record available in the stream. This option is not available for an Amazon Kinesis Firehose delivery
     *        stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LAST_STOPPED_POINT</code> - Resume reading from where the application last stopped reading.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputStartingPosition
     */

    public InputStartingPositionConfiguration withInputStartingPosition(String inputStartingPosition) {
        setInputStartingPosition(inputStartingPosition);
        return this;
    }

    /**
     * <p>
     * The starting position on the stream.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LATEST</code> - Start reading just after the most recent record in the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRIM_HORIZON</code> - Start reading at the last untrimmed record in the stream, which is the oldest record
     * available in the stream. This option is not available for an Amazon Kinesis Firehose delivery stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAST_STOPPED_POINT</code> - Resume reading from where the application last stopped reading.
     * </p>
     * </li>
     * </ul>
     * 
     * @param inputStartingPosition
     *        The starting position on the stream.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LATEST</code> - Start reading just after the most recent record in the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRIM_HORIZON</code> - Start reading at the last untrimmed record in the stream, which is the oldest
     *        record available in the stream. This option is not available for an Amazon Kinesis Firehose delivery
     *        stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LAST_STOPPED_POINT</code> - Resume reading from where the application last stopped reading.
     *        </p>
     *        </li>
     * @see InputStartingPosition
     */

    public void setInputStartingPosition(InputStartingPosition inputStartingPosition) {
        this.inputStartingPosition = inputStartingPosition.toString();
    }

    /**
     * <p>
     * The starting position on the stream.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LATEST</code> - Start reading just after the most recent record in the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRIM_HORIZON</code> - Start reading at the last untrimmed record in the stream, which is the oldest record
     * available in the stream. This option is not available for an Amazon Kinesis Firehose delivery stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAST_STOPPED_POINT</code> - Resume reading from where the application last stopped reading.
     * </p>
     * </li>
     * </ul>
     * 
     * @param inputStartingPosition
     *        The starting position on the stream.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LATEST</code> - Start reading just after the most recent record in the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRIM_HORIZON</code> - Start reading at the last untrimmed record in the stream, which is the oldest
     *        record available in the stream. This option is not available for an Amazon Kinesis Firehose delivery
     *        stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LAST_STOPPED_POINT</code> - Resume reading from where the application last stopped reading.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputStartingPosition
     */

    public InputStartingPositionConfiguration withInputStartingPosition(InputStartingPosition inputStartingPosition) {
        setInputStartingPosition(inputStartingPosition);
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
        if (getInputStartingPosition() != null)
            sb.append("InputStartingPosition: " + getInputStartingPosition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputStartingPositionConfiguration == false)
            return false;
        InputStartingPositionConfiguration other = (InputStartingPositionConfiguration) obj;
        if (other.getInputStartingPosition() == null ^ this.getInputStartingPosition() == null)
            return false;
        if (other.getInputStartingPosition() != null && other.getInputStartingPosition().equals(this.getInputStartingPosition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputStartingPosition() == null) ? 0 : getInputStartingPosition().hashCode());
        return hashCode;
    }

    @Override
    public InputStartingPositionConfiguration clone() {
        try {
            return (InputStartingPositionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
