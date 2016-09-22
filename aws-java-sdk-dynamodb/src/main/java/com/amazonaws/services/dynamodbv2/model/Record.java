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
 * A description of a unique event within a stream.
 * </p>
 */
public class Record implements Serializable, Cloneable {

    /**
     * <p>
     * A globally unique identifier for the event that was recorded in this stream record.
     * </p>
     */
    private String eventID;
    /**
     * <p>
     * The type of data modification that was performed on the DynamoDB table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INSERT</code> - a new item was added to the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFY</code> - one or more of an existing item's attributes were modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVE</code> - the item was deleted from the table
     * </p>
     * </li>
     * </ul>
     */
    private String eventName;
    /**
     * <p>
     * The version number of the stream record format. This number is updated whenever the structure of <i>Record</i> is
     * modified.
     * </p>
     * <p>
     * Client applications must not assume that <i>eventVersion</i> will remain at a particular value, as this number is
     * subject to change at any time. In general, <i>eventVersion</i> will only increase as the low-level DynamoDB
     * Streams API evolves.
     * </p>
     */
    private String eventVersion;
    /**
     * <p>
     * The AWS service from which the stream record originated. For DynamoDB Streams, this is <i>aws:dynamodb</i>.
     * </p>
     */
    private String eventSource;
    /**
     * <p>
     * The region in which the <i>GetRecords</i> request was received.
     * </p>
     */
    private String awsRegion;
    /**
     * <p>
     * The main body of the stream record, containing all of the DynamoDB-specific fields.
     * </p>
     */
    private StreamRecord dynamodb;

    /**
     * <p>
     * A globally unique identifier for the event that was recorded in this stream record.
     * </p>
     * 
     * @param eventID
     *        A globally unique identifier for the event that was recorded in this stream record.
     */

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    /**
     * <p>
     * A globally unique identifier for the event that was recorded in this stream record.
     * </p>
     * 
     * @return A globally unique identifier for the event that was recorded in this stream record.
     */

    public String getEventID() {
        return this.eventID;
    }

    /**
     * <p>
     * A globally unique identifier for the event that was recorded in this stream record.
     * </p>
     * 
     * @param eventID
     *        A globally unique identifier for the event that was recorded in this stream record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Record withEventID(String eventID) {
        setEventID(eventID);
        return this;
    }

    /**
     * <p>
     * The type of data modification that was performed on the DynamoDB table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INSERT</code> - a new item was added to the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFY</code> - one or more of an existing item's attributes were modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVE</code> - the item was deleted from the table
     * </p>
     * </li>
     * </ul>
     * 
     * @param eventName
     *        The type of data modification that was performed on the DynamoDB table:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INSERT</code> - a new item was added to the table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MODIFY</code> - one or more of an existing item's attributes were modified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REMOVE</code> - the item was deleted from the table
     *        </p>
     *        </li>
     * @see OperationType
     */

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /**
     * <p>
     * The type of data modification that was performed on the DynamoDB table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INSERT</code> - a new item was added to the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFY</code> - one or more of an existing item's attributes were modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVE</code> - the item was deleted from the table
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of data modification that was performed on the DynamoDB table:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>INSERT</code> - a new item was added to the table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MODIFY</code> - one or more of an existing item's attributes were modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>REMOVE</code> - the item was deleted from the table
     *         </p>
     *         </li>
     * @see OperationType
     */

    public String getEventName() {
        return this.eventName;
    }

    /**
     * <p>
     * The type of data modification that was performed on the DynamoDB table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INSERT</code> - a new item was added to the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFY</code> - one or more of an existing item's attributes were modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVE</code> - the item was deleted from the table
     * </p>
     * </li>
     * </ul>
     * 
     * @param eventName
     *        The type of data modification that was performed on the DynamoDB table:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INSERT</code> - a new item was added to the table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MODIFY</code> - one or more of an existing item's attributes were modified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REMOVE</code> - the item was deleted from the table
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationType
     */

    public Record withEventName(String eventName) {
        setEventName(eventName);
        return this;
    }

    /**
     * <p>
     * The type of data modification that was performed on the DynamoDB table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INSERT</code> - a new item was added to the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFY</code> - one or more of an existing item's attributes were modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVE</code> - the item was deleted from the table
     * </p>
     * </li>
     * </ul>
     * 
     * @param eventName
     *        The type of data modification that was performed on the DynamoDB table:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INSERT</code> - a new item was added to the table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MODIFY</code> - one or more of an existing item's attributes were modified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REMOVE</code> - the item was deleted from the table
     *        </p>
     *        </li>
     * @see OperationType
     */

    public void setEventName(OperationType eventName) {
        this.eventName = eventName.toString();
    }

    /**
     * <p>
     * The type of data modification that was performed on the DynamoDB table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INSERT</code> - a new item was added to the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFY</code> - one or more of an existing item's attributes were modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVE</code> - the item was deleted from the table
     * </p>
     * </li>
     * </ul>
     * 
     * @param eventName
     *        The type of data modification that was performed on the DynamoDB table:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INSERT</code> - a new item was added to the table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MODIFY</code> - one or more of an existing item's attributes were modified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REMOVE</code> - the item was deleted from the table
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationType
     */

    public Record withEventName(OperationType eventName) {
        setEventName(eventName);
        return this;
    }

    /**
     * <p>
     * The version number of the stream record format. This number is updated whenever the structure of <i>Record</i> is
     * modified.
     * </p>
     * <p>
     * Client applications must not assume that <i>eventVersion</i> will remain at a particular value, as this number is
     * subject to change at any time. In general, <i>eventVersion</i> will only increase as the low-level DynamoDB
     * Streams API evolves.
     * </p>
     * 
     * @param eventVersion
     *        The version number of the stream record format. This number is updated whenever the structure of
     *        <i>Record</i> is modified.</p>
     *        <p>
     *        Client applications must not assume that <i>eventVersion</i> will remain at a particular value, as this
     *        number is subject to change at any time. In general, <i>eventVersion</i> will only increase as the
     *        low-level DynamoDB Streams API evolves.
     */

    public void setEventVersion(String eventVersion) {
        this.eventVersion = eventVersion;
    }

    /**
     * <p>
     * The version number of the stream record format. This number is updated whenever the structure of <i>Record</i> is
     * modified.
     * </p>
     * <p>
     * Client applications must not assume that <i>eventVersion</i> will remain at a particular value, as this number is
     * subject to change at any time. In general, <i>eventVersion</i> will only increase as the low-level DynamoDB
     * Streams API evolves.
     * </p>
     * 
     * @return The version number of the stream record format. This number is updated whenever the structure of
     *         <i>Record</i> is modified.</p>
     *         <p>
     *         Client applications must not assume that <i>eventVersion</i> will remain at a particular value, as this
     *         number is subject to change at any time. In general, <i>eventVersion</i> will only increase as the
     *         low-level DynamoDB Streams API evolves.
     */

    public String getEventVersion() {
        return this.eventVersion;
    }

    /**
     * <p>
     * The version number of the stream record format. This number is updated whenever the structure of <i>Record</i> is
     * modified.
     * </p>
     * <p>
     * Client applications must not assume that <i>eventVersion</i> will remain at a particular value, as this number is
     * subject to change at any time. In general, <i>eventVersion</i> will only increase as the low-level DynamoDB
     * Streams API evolves.
     * </p>
     * 
     * @param eventVersion
     *        The version number of the stream record format. This number is updated whenever the structure of
     *        <i>Record</i> is modified.</p>
     *        <p>
     *        Client applications must not assume that <i>eventVersion</i> will remain at a particular value, as this
     *        number is subject to change at any time. In general, <i>eventVersion</i> will only increase as the
     *        low-level DynamoDB Streams API evolves.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Record withEventVersion(String eventVersion) {
        setEventVersion(eventVersion);
        return this;
    }

    /**
     * <p>
     * The AWS service from which the stream record originated. For DynamoDB Streams, this is <i>aws:dynamodb</i>.
     * </p>
     * 
     * @param eventSource
     *        The AWS service from which the stream record originated. For DynamoDB Streams, this is
     *        <i>aws:dynamodb</i>.
     */

    public void setEventSource(String eventSource) {
        this.eventSource = eventSource;
    }

    /**
     * <p>
     * The AWS service from which the stream record originated. For DynamoDB Streams, this is <i>aws:dynamodb</i>.
     * </p>
     * 
     * @return The AWS service from which the stream record originated. For DynamoDB Streams, this is
     *         <i>aws:dynamodb</i>.
     */

    public String getEventSource() {
        return this.eventSource;
    }

    /**
     * <p>
     * The AWS service from which the stream record originated. For DynamoDB Streams, this is <i>aws:dynamodb</i>.
     * </p>
     * 
     * @param eventSource
     *        The AWS service from which the stream record originated. For DynamoDB Streams, this is
     *        <i>aws:dynamodb</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Record withEventSource(String eventSource) {
        setEventSource(eventSource);
        return this;
    }

    /**
     * <p>
     * The region in which the <i>GetRecords</i> request was received.
     * </p>
     * 
     * @param awsRegion
     *        The region in which the <i>GetRecords</i> request was received.
     */

    public void setAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
    }

    /**
     * <p>
     * The region in which the <i>GetRecords</i> request was received.
     * </p>
     * 
     * @return The region in which the <i>GetRecords</i> request was received.
     */

    public String getAwsRegion() {
        return this.awsRegion;
    }

    /**
     * <p>
     * The region in which the <i>GetRecords</i> request was received.
     * </p>
     * 
     * @param awsRegion
     *        The region in which the <i>GetRecords</i> request was received.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Record withAwsRegion(String awsRegion) {
        setAwsRegion(awsRegion);
        return this;
    }

    /**
     * <p>
     * The main body of the stream record, containing all of the DynamoDB-specific fields.
     * </p>
     * 
     * @param dynamodb
     *        The main body of the stream record, containing all of the DynamoDB-specific fields.
     */

    public void setDynamodb(StreamRecord dynamodb) {
        this.dynamodb = dynamodb;
    }

    /**
     * <p>
     * The main body of the stream record, containing all of the DynamoDB-specific fields.
     * </p>
     * 
     * @return The main body of the stream record, containing all of the DynamoDB-specific fields.
     */

    public StreamRecord getDynamodb() {
        return this.dynamodb;
    }

    /**
     * <p>
     * The main body of the stream record, containing all of the DynamoDB-specific fields.
     * </p>
     * 
     * @param dynamodb
     *        The main body of the stream record, containing all of the DynamoDB-specific fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Record withDynamodb(StreamRecord dynamodb) {
        setDynamodb(dynamodb);
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
        if (getEventID() != null)
            sb.append("EventID: " + getEventID() + ",");
        if (getEventName() != null)
            sb.append("EventName: " + getEventName() + ",");
        if (getEventVersion() != null)
            sb.append("EventVersion: " + getEventVersion() + ",");
        if (getEventSource() != null)
            sb.append("EventSource: " + getEventSource() + ",");
        if (getAwsRegion() != null)
            sb.append("AwsRegion: " + getAwsRegion() + ",");
        if (getDynamodb() != null)
            sb.append("Dynamodb: " + getDynamodb());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Record == false)
            return false;
        Record other = (Record) obj;
        if (other.getEventID() == null ^ this.getEventID() == null)
            return false;
        if (other.getEventID() != null && other.getEventID().equals(this.getEventID()) == false)
            return false;
        if (other.getEventName() == null ^ this.getEventName() == null)
            return false;
        if (other.getEventName() != null && other.getEventName().equals(this.getEventName()) == false)
            return false;
        if (other.getEventVersion() == null ^ this.getEventVersion() == null)
            return false;
        if (other.getEventVersion() != null && other.getEventVersion().equals(this.getEventVersion()) == false)
            return false;
        if (other.getEventSource() == null ^ this.getEventSource() == null)
            return false;
        if (other.getEventSource() != null && other.getEventSource().equals(this.getEventSource()) == false)
            return false;
        if (other.getAwsRegion() == null ^ this.getAwsRegion() == null)
            return false;
        if (other.getAwsRegion() != null && other.getAwsRegion().equals(this.getAwsRegion()) == false)
            return false;
        if (other.getDynamodb() == null ^ this.getDynamodb() == null)
            return false;
        if (other.getDynamodb() != null && other.getDynamodb().equals(this.getDynamodb()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventID() == null) ? 0 : getEventID().hashCode());
        hashCode = prime * hashCode + ((getEventName() == null) ? 0 : getEventName().hashCode());
        hashCode = prime * hashCode + ((getEventVersion() == null) ? 0 : getEventVersion().hashCode());
        hashCode = prime * hashCode + ((getEventSource() == null) ? 0 : getEventSource().hashCode());
        hashCode = prime * hashCode + ((getAwsRegion() == null) ? 0 : getAwsRegion().hashCode());
        hashCode = prime * hashCode + ((getDynamodb() == null) ? 0 : getDynamodb().hashCode());
        return hashCode;
    }

    @Override
    public Record clone() {
        try {
            return (Record) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
