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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the DynamoDB Streams configuration for a table in DynamoDB.
 * </p>
 */
public class StreamSpecification implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether DynamoDB Streams is enabled (true) or disabled (false) on the table.
     * </p>
     */
    private Boolean streamEnabled;
    /**
     * <p>
     * The DynamoDB Streams settings for the table. These settings consist of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>StreamEnabled</i> - Indicates whether DynamoDB Streams is enabled (true) or disabled (false) on the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>StreamViewType</i> - When an item in the table is modified, <i>StreamViewType</i> determines what information
     * is written to the stream for this table. Valid values for <i>StreamViewType</i> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>KEYS_ONLY</i> - Only the key attributes of the modified item are written to the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>NEW_IMAGE</i> - The entire item, as it appears after it was modified, is written to the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>OLD_IMAGE</i> - The entire item, as it appeared before it was modified, is written to the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>NEW_AND_OLD_IMAGES</i> - Both the new and the old item images of the item are written to the stream.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private String streamViewType;

    /**
     * <p>
     * Indicates whether DynamoDB Streams is enabled (true) or disabled (false) on the table.
     * </p>
     * 
     * @param streamEnabled
     *        Indicates whether DynamoDB Streams is enabled (true) or disabled (false) on the table.
     */

    public void setStreamEnabled(Boolean streamEnabled) {
        this.streamEnabled = streamEnabled;
    }

    /**
     * <p>
     * Indicates whether DynamoDB Streams is enabled (true) or disabled (false) on the table.
     * </p>
     * 
     * @return Indicates whether DynamoDB Streams is enabled (true) or disabled (false) on the table.
     */

    public Boolean getStreamEnabled() {
        return this.streamEnabled;
    }

    /**
     * <p>
     * Indicates whether DynamoDB Streams is enabled (true) or disabled (false) on the table.
     * </p>
     * 
     * @param streamEnabled
     *        Indicates whether DynamoDB Streams is enabled (true) or disabled (false) on the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamSpecification withStreamEnabled(Boolean streamEnabled) {
        setStreamEnabled(streamEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether DynamoDB Streams is enabled (true) or disabled (false) on the table.
     * </p>
     * 
     * @return Indicates whether DynamoDB Streams is enabled (true) or disabled (false) on the table.
     */

    public Boolean isStreamEnabled() {
        return this.streamEnabled;
    }

    /**
     * <p>
     * The DynamoDB Streams settings for the table. These settings consist of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>StreamEnabled</i> - Indicates whether DynamoDB Streams is enabled (true) or disabled (false) on the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>StreamViewType</i> - When an item in the table is modified, <i>StreamViewType</i> determines what information
     * is written to the stream for this table. Valid values for <i>StreamViewType</i> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>KEYS_ONLY</i> - Only the key attributes of the modified item are written to the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>NEW_IMAGE</i> - The entire item, as it appears after it was modified, is written to the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>OLD_IMAGE</i> - The entire item, as it appeared before it was modified, is written to the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>NEW_AND_OLD_IMAGES</i> - Both the new and the old item images of the item are written to the stream.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param streamViewType
     *        The DynamoDB Streams settings for the table. These settings consist of:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>StreamEnabled</i> - Indicates whether DynamoDB Streams is enabled (true) or disabled (false) on the
     *        table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>StreamViewType</i> - When an item in the table is modified, <i>StreamViewType</i> determines what
     *        information is written to the stream for this table. Valid values for <i>StreamViewType</i> are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>KEYS_ONLY</i> - Only the key attributes of the modified item are written to the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>NEW_IMAGE</i> - The entire item, as it appears after it was modified, is written to the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>OLD_IMAGE</i> - The entire item, as it appeared before it was modified, is written to the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>NEW_AND_OLD_IMAGES</i> - Both the new and the old item images of the item are written to the stream.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @see StreamViewType
     */

    public void setStreamViewType(String streamViewType) {
        this.streamViewType = streamViewType;
    }

    /**
     * <p>
     * The DynamoDB Streams settings for the table. These settings consist of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>StreamEnabled</i> - Indicates whether DynamoDB Streams is enabled (true) or disabled (false) on the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>StreamViewType</i> - When an item in the table is modified, <i>StreamViewType</i> determines what information
     * is written to the stream for this table. Valid values for <i>StreamViewType</i> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>KEYS_ONLY</i> - Only the key attributes of the modified item are written to the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>NEW_IMAGE</i> - The entire item, as it appears after it was modified, is written to the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>OLD_IMAGE</i> - The entire item, as it appeared before it was modified, is written to the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>NEW_AND_OLD_IMAGES</i> - Both the new and the old item images of the item are written to the stream.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return The DynamoDB Streams settings for the table. These settings consist of:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>StreamEnabled</i> - Indicates whether DynamoDB Streams is enabled (true) or disabled (false) on the
     *         table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>StreamViewType</i> - When an item in the table is modified, <i>StreamViewType</i> determines what
     *         information is written to the stream for this table. Valid values for <i>StreamViewType</i> are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>KEYS_ONLY</i> - Only the key attributes of the modified item are written to the stream.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>NEW_IMAGE</i> - The entire item, as it appears after it was modified, is written to the stream.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>OLD_IMAGE</i> - The entire item, as it appeared before it was modified, is written to the stream.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>NEW_AND_OLD_IMAGES</i> - Both the new and the old item images of the item are written to the stream.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     * @see StreamViewType
     */

    public String getStreamViewType() {
        return this.streamViewType;
    }

    /**
     * <p>
     * The DynamoDB Streams settings for the table. These settings consist of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>StreamEnabled</i> - Indicates whether DynamoDB Streams is enabled (true) or disabled (false) on the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>StreamViewType</i> - When an item in the table is modified, <i>StreamViewType</i> determines what information
     * is written to the stream for this table. Valid values for <i>StreamViewType</i> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>KEYS_ONLY</i> - Only the key attributes of the modified item are written to the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>NEW_IMAGE</i> - The entire item, as it appears after it was modified, is written to the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>OLD_IMAGE</i> - The entire item, as it appeared before it was modified, is written to the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>NEW_AND_OLD_IMAGES</i> - Both the new and the old item images of the item are written to the stream.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param streamViewType
     *        The DynamoDB Streams settings for the table. These settings consist of:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>StreamEnabled</i> - Indicates whether DynamoDB Streams is enabled (true) or disabled (false) on the
     *        table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>StreamViewType</i> - When an item in the table is modified, <i>StreamViewType</i> determines what
     *        information is written to the stream for this table. Valid values for <i>StreamViewType</i> are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>KEYS_ONLY</i> - Only the key attributes of the modified item are written to the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>NEW_IMAGE</i> - The entire item, as it appears after it was modified, is written to the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>OLD_IMAGE</i> - The entire item, as it appeared before it was modified, is written to the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>NEW_AND_OLD_IMAGES</i> - Both the new and the old item images of the item are written to the stream.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamViewType
     */

    public StreamSpecification withStreamViewType(String streamViewType) {
        setStreamViewType(streamViewType);
        return this;
    }

    /**
     * <p>
     * The DynamoDB Streams settings for the table. These settings consist of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>StreamEnabled</i> - Indicates whether DynamoDB Streams is enabled (true) or disabled (false) on the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>StreamViewType</i> - When an item in the table is modified, <i>StreamViewType</i> determines what information
     * is written to the stream for this table. Valid values for <i>StreamViewType</i> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>KEYS_ONLY</i> - Only the key attributes of the modified item are written to the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>NEW_IMAGE</i> - The entire item, as it appears after it was modified, is written to the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>OLD_IMAGE</i> - The entire item, as it appeared before it was modified, is written to the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>NEW_AND_OLD_IMAGES</i> - Both the new and the old item images of the item are written to the stream.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param streamViewType
     *        The DynamoDB Streams settings for the table. These settings consist of:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>StreamEnabled</i> - Indicates whether DynamoDB Streams is enabled (true) or disabled (false) on the
     *        table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>StreamViewType</i> - When an item in the table is modified, <i>StreamViewType</i> determines what
     *        information is written to the stream for this table. Valid values for <i>StreamViewType</i> are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>KEYS_ONLY</i> - Only the key attributes of the modified item are written to the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>NEW_IMAGE</i> - The entire item, as it appears after it was modified, is written to the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>OLD_IMAGE</i> - The entire item, as it appeared before it was modified, is written to the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>NEW_AND_OLD_IMAGES</i> - Both the new and the old item images of the item are written to the stream.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @see StreamViewType
     */

    public void setStreamViewType(StreamViewType streamViewType) {
        this.streamViewType = streamViewType.toString();
    }

    /**
     * <p>
     * The DynamoDB Streams settings for the table. These settings consist of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>StreamEnabled</i> - Indicates whether DynamoDB Streams is enabled (true) or disabled (false) on the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>StreamViewType</i> - When an item in the table is modified, <i>StreamViewType</i> determines what information
     * is written to the stream for this table. Valid values for <i>StreamViewType</i> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>KEYS_ONLY</i> - Only the key attributes of the modified item are written to the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>NEW_IMAGE</i> - The entire item, as it appears after it was modified, is written to the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>OLD_IMAGE</i> - The entire item, as it appeared before it was modified, is written to the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>NEW_AND_OLD_IMAGES</i> - Both the new and the old item images of the item are written to the stream.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param streamViewType
     *        The DynamoDB Streams settings for the table. These settings consist of:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>StreamEnabled</i> - Indicates whether DynamoDB Streams is enabled (true) or disabled (false) on the
     *        table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>StreamViewType</i> - When an item in the table is modified, <i>StreamViewType</i> determines what
     *        information is written to the stream for this table. Valid values for <i>StreamViewType</i> are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>KEYS_ONLY</i> - Only the key attributes of the modified item are written to the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>NEW_IMAGE</i> - The entire item, as it appears after it was modified, is written to the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>OLD_IMAGE</i> - The entire item, as it appeared before it was modified, is written to the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>NEW_AND_OLD_IMAGES</i> - Both the new and the old item images of the item are written to the stream.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamViewType
     */

    public StreamSpecification withStreamViewType(StreamViewType streamViewType) {
        setStreamViewType(streamViewType);
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
        if (getStreamEnabled() != null)
            sb.append("StreamEnabled: " + getStreamEnabled() + ",");
        if (getStreamViewType() != null)
            sb.append("StreamViewType: " + getStreamViewType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamSpecification == false)
            return false;
        StreamSpecification other = (StreamSpecification) obj;
        if (other.getStreamEnabled() == null ^ this.getStreamEnabled() == null)
            return false;
        if (other.getStreamEnabled() != null && other.getStreamEnabled().equals(this.getStreamEnabled()) == false)
            return false;
        if (other.getStreamViewType() == null ^ this.getStreamViewType() == null)
            return false;
        if (other.getStreamViewType() != null && other.getStreamViewType().equals(this.getStreamViewType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamEnabled() == null) ? 0 : getStreamEnabled().hashCode());
        hashCode = prime * hashCode + ((getStreamViewType() == null) ? 0 : getStreamViewType().hashCode());
        return hashCode;
    }

    @Override
    public StreamSpecification clone() {
        try {
            return (StreamSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
