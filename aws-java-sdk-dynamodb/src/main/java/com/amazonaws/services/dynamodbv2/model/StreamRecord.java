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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A description of a single data modification that was performed on an item in a DynamoDB table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/streams-dynamodb-2012-08-10/StreamRecord" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamRecord implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The approximate date and time when the stream record was created, in <a
     * href="http://www.epochconverter.com/">UNIX epoch time</a> format.
     * </p>
     */
    private java.util.Date approximateCreationDateTime;
    /**
     * <p>
     * The primary key attribute(s) for the DynamoDB item that was modified.
     * </p>
     */
    private java.util.Map<String, AttributeValue> keys;
    /**
     * <p>
     * The item in the DynamoDB table as it appeared after it was modified.
     * </p>
     */
    private java.util.Map<String, AttributeValue> newImage;
    /**
     * <p>
     * The item in the DynamoDB table as it appeared before it was modified.
     * </p>
     */
    private java.util.Map<String, AttributeValue> oldImage;
    /**
     * <p>
     * The sequence number of the stream record.
     * </p>
     */
    private String sequenceNumber;
    /**
     * <p>
     * The size of the stream record, in bytes.
     * </p>
     */
    private Long sizeBytes;
    /**
     * <p>
     * The type of data from the modified DynamoDB item that was captured in this stream record:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - only the key attributes of the modified item.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_IMAGE</code> - the entire item, as it appeared after it was modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OLD_IMAGE</code> - the entire item, as it appeared before it was modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_AND_OLD_IMAGES</code> - both the new and the old item images of the item.
     * </p>
     * </li>
     * </ul>
     */
    private String streamViewType;

    /**
     * <p>
     * The approximate date and time when the stream record was created, in <a
     * href="http://www.epochconverter.com/">UNIX epoch time</a> format.
     * </p>
     * 
     * @param approximateCreationDateTime
     *        The approximate date and time when the stream record was created, in <a
     *        href="http://www.epochconverter.com/">UNIX epoch time</a> format.
     */

    public void setApproximateCreationDateTime(java.util.Date approximateCreationDateTime) {
        this.approximateCreationDateTime = approximateCreationDateTime;
    }

    /**
     * <p>
     * The approximate date and time when the stream record was created, in <a
     * href="http://www.epochconverter.com/">UNIX epoch time</a> format.
     * </p>
     * 
     * @return The approximate date and time when the stream record was created, in <a
     *         href="http://www.epochconverter.com/">UNIX epoch time</a> format.
     */

    public java.util.Date getApproximateCreationDateTime() {
        return this.approximateCreationDateTime;
    }

    /**
     * <p>
     * The approximate date and time when the stream record was created, in <a
     * href="http://www.epochconverter.com/">UNIX epoch time</a> format.
     * </p>
     * 
     * @param approximateCreationDateTime
     *        The approximate date and time when the stream record was created, in <a
     *        href="http://www.epochconverter.com/">UNIX epoch time</a> format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamRecord withApproximateCreationDateTime(java.util.Date approximateCreationDateTime) {
        setApproximateCreationDateTime(approximateCreationDateTime);
        return this;
    }

    /**
     * <p>
     * The primary key attribute(s) for the DynamoDB item that was modified.
     * </p>
     * 
     * @return The primary key attribute(s) for the DynamoDB item that was modified.
     */

    public java.util.Map<String, AttributeValue> getKeys() {
        return keys;
    }

    /**
     * <p>
     * The primary key attribute(s) for the DynamoDB item that was modified.
     * </p>
     * 
     * @param keys
     *        The primary key attribute(s) for the DynamoDB item that was modified.
     */

    public void setKeys(java.util.Map<String, AttributeValue> keys) {
        this.keys = keys;
    }

    /**
     * <p>
     * The primary key attribute(s) for the DynamoDB item that was modified.
     * </p>
     * 
     * @param keys
     *        The primary key attribute(s) for the DynamoDB item that was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamRecord withKeys(java.util.Map<String, AttributeValue> keys) {
        setKeys(keys);
        return this;
    }

    public StreamRecord addKeysEntry(String key, AttributeValue value) {
        if (null == this.keys) {
            this.keys = new java.util.HashMap<String, AttributeValue>();
        }
        if (this.keys.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.keys.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Keys.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamRecord clearKeysEntries() {
        this.keys = null;
        return this;
    }

    /**
     * <p>
     * The item in the DynamoDB table as it appeared after it was modified.
     * </p>
     * 
     * @return The item in the DynamoDB table as it appeared after it was modified.
     */

    public java.util.Map<String, AttributeValue> getNewImage() {
        return newImage;
    }

    /**
     * <p>
     * The item in the DynamoDB table as it appeared after it was modified.
     * </p>
     * 
     * @param newImage
     *        The item in the DynamoDB table as it appeared after it was modified.
     */

    public void setNewImage(java.util.Map<String, AttributeValue> newImage) {
        this.newImage = newImage;
    }

    /**
     * <p>
     * The item in the DynamoDB table as it appeared after it was modified.
     * </p>
     * 
     * @param newImage
     *        The item in the DynamoDB table as it appeared after it was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamRecord withNewImage(java.util.Map<String, AttributeValue> newImage) {
        setNewImage(newImage);
        return this;
    }

    public StreamRecord addNewImageEntry(String key, AttributeValue value) {
        if (null == this.newImage) {
            this.newImage = new java.util.HashMap<String, AttributeValue>();
        }
        if (this.newImage.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.newImage.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into NewImage.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamRecord clearNewImageEntries() {
        this.newImage = null;
        return this;
    }

    /**
     * <p>
     * The item in the DynamoDB table as it appeared before it was modified.
     * </p>
     * 
     * @return The item in the DynamoDB table as it appeared before it was modified.
     */

    public java.util.Map<String, AttributeValue> getOldImage() {
        return oldImage;
    }

    /**
     * <p>
     * The item in the DynamoDB table as it appeared before it was modified.
     * </p>
     * 
     * @param oldImage
     *        The item in the DynamoDB table as it appeared before it was modified.
     */

    public void setOldImage(java.util.Map<String, AttributeValue> oldImage) {
        this.oldImage = oldImage;
    }

    /**
     * <p>
     * The item in the DynamoDB table as it appeared before it was modified.
     * </p>
     * 
     * @param oldImage
     *        The item in the DynamoDB table as it appeared before it was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamRecord withOldImage(java.util.Map<String, AttributeValue> oldImage) {
        setOldImage(oldImage);
        return this;
    }

    public StreamRecord addOldImageEntry(String key, AttributeValue value) {
        if (null == this.oldImage) {
            this.oldImage = new java.util.HashMap<String, AttributeValue>();
        }
        if (this.oldImage.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.oldImage.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into OldImage.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamRecord clearOldImageEntries() {
        this.oldImage = null;
        return this;
    }

    /**
     * <p>
     * The sequence number of the stream record.
     * </p>
     * 
     * @param sequenceNumber
     *        The sequence number of the stream record.
     */

    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    /**
     * <p>
     * The sequence number of the stream record.
     * </p>
     * 
     * @return The sequence number of the stream record.
     */

    public String getSequenceNumber() {
        return this.sequenceNumber;
    }

    /**
     * <p>
     * The sequence number of the stream record.
     * </p>
     * 
     * @param sequenceNumber
     *        The sequence number of the stream record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamRecord withSequenceNumber(String sequenceNumber) {
        setSequenceNumber(sequenceNumber);
        return this;
    }

    /**
     * <p>
     * The size of the stream record, in bytes.
     * </p>
     * 
     * @param sizeBytes
     *        The size of the stream record, in bytes.
     */

    public void setSizeBytes(Long sizeBytes) {
        this.sizeBytes = sizeBytes;
    }

    /**
     * <p>
     * The size of the stream record, in bytes.
     * </p>
     * 
     * @return The size of the stream record, in bytes.
     */

    public Long getSizeBytes() {
        return this.sizeBytes;
    }

    /**
     * <p>
     * The size of the stream record, in bytes.
     * </p>
     * 
     * @param sizeBytes
     *        The size of the stream record, in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamRecord withSizeBytes(Long sizeBytes) {
        setSizeBytes(sizeBytes);
        return this;
    }

    /**
     * <p>
     * The type of data from the modified DynamoDB item that was captured in this stream record:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - only the key attributes of the modified item.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_IMAGE</code> - the entire item, as it appeared after it was modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OLD_IMAGE</code> - the entire item, as it appeared before it was modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_AND_OLD_IMAGES</code> - both the new and the old item images of the item.
     * </p>
     * </li>
     * </ul>
     * 
     * @param streamViewType
     *        The type of data from the modified DynamoDB item that was captured in this stream record:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>KEYS_ONLY</code> - only the key attributes of the modified item.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_IMAGE</code> - the entire item, as it appeared after it was modified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OLD_IMAGE</code> - the entire item, as it appeared before it was modified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_AND_OLD_IMAGES</code> - both the new and the old item images of the item.
     *        </p>
     *        </li>
     * @see StreamViewType
     */

    public void setStreamViewType(String streamViewType) {
        this.streamViewType = streamViewType;
    }

    /**
     * <p>
     * The type of data from the modified DynamoDB item that was captured in this stream record:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - only the key attributes of the modified item.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_IMAGE</code> - the entire item, as it appeared after it was modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OLD_IMAGE</code> - the entire item, as it appeared before it was modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_AND_OLD_IMAGES</code> - both the new and the old item images of the item.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of data from the modified DynamoDB item that was captured in this stream record:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>KEYS_ONLY</code> - only the key attributes of the modified item.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NEW_IMAGE</code> - the entire item, as it appeared after it was modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OLD_IMAGE</code> - the entire item, as it appeared before it was modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NEW_AND_OLD_IMAGES</code> - both the new and the old item images of the item.
     *         </p>
     *         </li>
     * @see StreamViewType
     */

    public String getStreamViewType() {
        return this.streamViewType;
    }

    /**
     * <p>
     * The type of data from the modified DynamoDB item that was captured in this stream record:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - only the key attributes of the modified item.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_IMAGE</code> - the entire item, as it appeared after it was modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OLD_IMAGE</code> - the entire item, as it appeared before it was modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_AND_OLD_IMAGES</code> - both the new and the old item images of the item.
     * </p>
     * </li>
     * </ul>
     * 
     * @param streamViewType
     *        The type of data from the modified DynamoDB item that was captured in this stream record:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>KEYS_ONLY</code> - only the key attributes of the modified item.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_IMAGE</code> - the entire item, as it appeared after it was modified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OLD_IMAGE</code> - the entire item, as it appeared before it was modified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_AND_OLD_IMAGES</code> - both the new and the old item images of the item.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamViewType
     */

    public StreamRecord withStreamViewType(String streamViewType) {
        setStreamViewType(streamViewType);
        return this;
    }

    /**
     * <p>
     * The type of data from the modified DynamoDB item that was captured in this stream record:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - only the key attributes of the modified item.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_IMAGE</code> - the entire item, as it appeared after it was modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OLD_IMAGE</code> - the entire item, as it appeared before it was modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_AND_OLD_IMAGES</code> - both the new and the old item images of the item.
     * </p>
     * </li>
     * </ul>
     * 
     * @param streamViewType
     *        The type of data from the modified DynamoDB item that was captured in this stream record:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>KEYS_ONLY</code> - only the key attributes of the modified item.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_IMAGE</code> - the entire item, as it appeared after it was modified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OLD_IMAGE</code> - the entire item, as it appeared before it was modified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_AND_OLD_IMAGES</code> - both the new and the old item images of the item.
     *        </p>
     *        </li>
     * @see StreamViewType
     */

    public void setStreamViewType(StreamViewType streamViewType) {
        withStreamViewType(streamViewType);
    }

    /**
     * <p>
     * The type of data from the modified DynamoDB item that was captured in this stream record:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - only the key attributes of the modified item.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_IMAGE</code> - the entire item, as it appeared after it was modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OLD_IMAGE</code> - the entire item, as it appeared before it was modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_AND_OLD_IMAGES</code> - both the new and the old item images of the item.
     * </p>
     * </li>
     * </ul>
     * 
     * @param streamViewType
     *        The type of data from the modified DynamoDB item that was captured in this stream record:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>KEYS_ONLY</code> - only the key attributes of the modified item.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_IMAGE</code> - the entire item, as it appeared after it was modified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OLD_IMAGE</code> - the entire item, as it appeared before it was modified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_AND_OLD_IMAGES</code> - both the new and the old item images of the item.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamViewType
     */

    public StreamRecord withStreamViewType(StreamViewType streamViewType) {
        this.streamViewType = streamViewType.toString();
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
        if (getApproximateCreationDateTime() != null)
            sb.append("ApproximateCreationDateTime: ").append(getApproximateCreationDateTime()).append(",");
        if (getKeys() != null)
            sb.append("Keys: ").append(getKeys()).append(",");
        if (getNewImage() != null)
            sb.append("NewImage: ").append(getNewImage()).append(",");
        if (getOldImage() != null)
            sb.append("OldImage: ").append(getOldImage()).append(",");
        if (getSequenceNumber() != null)
            sb.append("SequenceNumber: ").append(getSequenceNumber()).append(",");
        if (getSizeBytes() != null)
            sb.append("SizeBytes: ").append(getSizeBytes()).append(",");
        if (getStreamViewType() != null)
            sb.append("StreamViewType: ").append(getStreamViewType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamRecord == false)
            return false;
        StreamRecord other = (StreamRecord) obj;
        if (other.getApproximateCreationDateTime() == null ^ this.getApproximateCreationDateTime() == null)
            return false;
        if (other.getApproximateCreationDateTime() != null && other.getApproximateCreationDateTime().equals(this.getApproximateCreationDateTime()) == false)
            return false;
        if (other.getKeys() == null ^ this.getKeys() == null)
            return false;
        if (other.getKeys() != null && other.getKeys().equals(this.getKeys()) == false)
            return false;
        if (other.getNewImage() == null ^ this.getNewImage() == null)
            return false;
        if (other.getNewImage() != null && other.getNewImage().equals(this.getNewImage()) == false)
            return false;
        if (other.getOldImage() == null ^ this.getOldImage() == null)
            return false;
        if (other.getOldImage() != null && other.getOldImage().equals(this.getOldImage()) == false)
            return false;
        if (other.getSequenceNumber() == null ^ this.getSequenceNumber() == null)
            return false;
        if (other.getSequenceNumber() != null && other.getSequenceNumber().equals(this.getSequenceNumber()) == false)
            return false;
        if (other.getSizeBytes() == null ^ this.getSizeBytes() == null)
            return false;
        if (other.getSizeBytes() != null && other.getSizeBytes().equals(this.getSizeBytes()) == false)
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

        hashCode = prime * hashCode + ((getApproximateCreationDateTime() == null) ? 0 : getApproximateCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getKeys() == null) ? 0 : getKeys().hashCode());
        hashCode = prime * hashCode + ((getNewImage() == null) ? 0 : getNewImage().hashCode());
        hashCode = prime * hashCode + ((getOldImage() == null) ? 0 : getOldImage().hashCode());
        hashCode = prime * hashCode + ((getSequenceNumber() == null) ? 0 : getSequenceNumber().hashCode());
        hashCode = prime * hashCode + ((getSizeBytes() == null) ? 0 : getSizeBytes().hashCode());
        hashCode = prime * hashCode + ((getStreamViewType() == null) ? 0 : getStreamViewType().hashCode());
        return hashCode;
    }

    @Override
    public StreamRecord clone() {
        try {
            return (StreamRecord) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.StreamRecordMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
