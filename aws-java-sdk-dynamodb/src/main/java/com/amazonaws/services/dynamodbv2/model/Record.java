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
 * A description of a unique event within a stream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/streams-dynamodb-2012-08-10/Record" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Record implements Serializable, Cloneable, StructuredPojo {

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
     * The version number of the stream record format. This number is updated whenever the structure of
     * <code>Record</code> is modified.
     * </p>
     * <p>
     * Client applications must not assume that <code>eventVersion</code> will remain at a particular value, as this
     * number is subject to change at any time. In general, <code>eventVersion</code> will only increase as the
     * low-level DynamoDB Streams API evolves.
     * </p>
     */
    private String eventVersion;
    /**
     * <p>
     * The AWS service from which the stream record originated. For DynamoDB Streams, this is <code>aws:dynamodb</code>.
     * </p>
     */
    private String eventSource;
    /**
     * <p>
     * The region in which the <code>GetRecords</code> request was received.
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
     * Items that are deleted by the Time to Live process after expiration have the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Records[].userIdentity.type
     * </p>
     * <p>
     * "Service"
     * </p>
     * </li>
     * <li>
     * <p>
     * Records[].userIdentity.principalId
     * </p>
     * <p>
     * "dynamodb.amazonaws.com"
     * </p>
     * </li>
     * </ul>
     */
    private Identity userIdentity;

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
        withEventName(eventName);
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
        this.eventName = eventName.toString();
        return this;
    }

    /**
     * <p>
     * The version number of the stream record format. This number is updated whenever the structure of
     * <code>Record</code> is modified.
     * </p>
     * <p>
     * Client applications must not assume that <code>eventVersion</code> will remain at a particular value, as this
     * number is subject to change at any time. In general, <code>eventVersion</code> will only increase as the
     * low-level DynamoDB Streams API evolves.
     * </p>
     * 
     * @param eventVersion
     *        The version number of the stream record format. This number is updated whenever the structure of
     *        <code>Record</code> is modified.</p>
     *        <p>
     *        Client applications must not assume that <code>eventVersion</code> will remain at a particular value, as
     *        this number is subject to change at any time. In general, <code>eventVersion</code> will only increase as
     *        the low-level DynamoDB Streams API evolves.
     */

    public void setEventVersion(String eventVersion) {
        this.eventVersion = eventVersion;
    }

    /**
     * <p>
     * The version number of the stream record format. This number is updated whenever the structure of
     * <code>Record</code> is modified.
     * </p>
     * <p>
     * Client applications must not assume that <code>eventVersion</code> will remain at a particular value, as this
     * number is subject to change at any time. In general, <code>eventVersion</code> will only increase as the
     * low-level DynamoDB Streams API evolves.
     * </p>
     * 
     * @return The version number of the stream record format. This number is updated whenever the structure of
     *         <code>Record</code> is modified.</p>
     *         <p>
     *         Client applications must not assume that <code>eventVersion</code> will remain at a particular value, as
     *         this number is subject to change at any time. In general, <code>eventVersion</code> will only increase as
     *         the low-level DynamoDB Streams API evolves.
     */

    public String getEventVersion() {
        return this.eventVersion;
    }

    /**
     * <p>
     * The version number of the stream record format. This number is updated whenever the structure of
     * <code>Record</code> is modified.
     * </p>
     * <p>
     * Client applications must not assume that <code>eventVersion</code> will remain at a particular value, as this
     * number is subject to change at any time. In general, <code>eventVersion</code> will only increase as the
     * low-level DynamoDB Streams API evolves.
     * </p>
     * 
     * @param eventVersion
     *        The version number of the stream record format. This number is updated whenever the structure of
     *        <code>Record</code> is modified.</p>
     *        <p>
     *        Client applications must not assume that <code>eventVersion</code> will remain at a particular value, as
     *        this number is subject to change at any time. In general, <code>eventVersion</code> will only increase as
     *        the low-level DynamoDB Streams API evolves.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Record withEventVersion(String eventVersion) {
        setEventVersion(eventVersion);
        return this;
    }

    /**
     * <p>
     * The AWS service from which the stream record originated. For DynamoDB Streams, this is <code>aws:dynamodb</code>.
     * </p>
     * 
     * @param eventSource
     *        The AWS service from which the stream record originated. For DynamoDB Streams, this is
     *        <code>aws:dynamodb</code>.
     */

    public void setEventSource(String eventSource) {
        this.eventSource = eventSource;
    }

    /**
     * <p>
     * The AWS service from which the stream record originated. For DynamoDB Streams, this is <code>aws:dynamodb</code>.
     * </p>
     * 
     * @return The AWS service from which the stream record originated. For DynamoDB Streams, this is
     *         <code>aws:dynamodb</code>.
     */

    public String getEventSource() {
        return this.eventSource;
    }

    /**
     * <p>
     * The AWS service from which the stream record originated. For DynamoDB Streams, this is <code>aws:dynamodb</code>.
     * </p>
     * 
     * @param eventSource
     *        The AWS service from which the stream record originated. For DynamoDB Streams, this is
     *        <code>aws:dynamodb</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Record withEventSource(String eventSource) {
        setEventSource(eventSource);
        return this;
    }

    /**
     * <p>
     * The region in which the <code>GetRecords</code> request was received.
     * </p>
     * 
     * @param awsRegion
     *        The region in which the <code>GetRecords</code> request was received.
     */

    public void setAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
    }

    /**
     * <p>
     * The region in which the <code>GetRecords</code> request was received.
     * </p>
     * 
     * @return The region in which the <code>GetRecords</code> request was received.
     */

    public String getAwsRegion() {
        return this.awsRegion;
    }

    /**
     * <p>
     * The region in which the <code>GetRecords</code> request was received.
     * </p>
     * 
     * @param awsRegion
     *        The region in which the <code>GetRecords</code> request was received.
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
     * <p>
     * Items that are deleted by the Time to Live process after expiration have the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Records[].userIdentity.type
     * </p>
     * <p>
     * "Service"
     * </p>
     * </li>
     * <li>
     * <p>
     * Records[].userIdentity.principalId
     * </p>
     * <p>
     * "dynamodb.amazonaws.com"
     * </p>
     * </li>
     * </ul>
     * 
     * @param userIdentity
     *        Items that are deleted by the Time to Live process after expiration have the following fields: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Records[].userIdentity.type
     *        </p>
     *        <p>
     *        "Service"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Records[].userIdentity.principalId
     *        </p>
     *        <p>
     *        "dynamodb.amazonaws.com"
     *        </p>
     *        </li>
     */

    public void setUserIdentity(Identity userIdentity) {
        this.userIdentity = userIdentity;
    }

    /**
     * <p>
     * Items that are deleted by the Time to Live process after expiration have the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Records[].userIdentity.type
     * </p>
     * <p>
     * "Service"
     * </p>
     * </li>
     * <li>
     * <p>
     * Records[].userIdentity.principalId
     * </p>
     * <p>
     * "dynamodb.amazonaws.com"
     * </p>
     * </li>
     * </ul>
     * 
     * @return Items that are deleted by the Time to Live process after expiration have the following fields: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Records[].userIdentity.type
     *         </p>
     *         <p>
     *         "Service"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Records[].userIdentity.principalId
     *         </p>
     *         <p>
     *         "dynamodb.amazonaws.com"
     *         </p>
     *         </li>
     */

    public Identity getUserIdentity() {
        return this.userIdentity;
    }

    /**
     * <p>
     * Items that are deleted by the Time to Live process after expiration have the following fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Records[].userIdentity.type
     * </p>
     * <p>
     * "Service"
     * </p>
     * </li>
     * <li>
     * <p>
     * Records[].userIdentity.principalId
     * </p>
     * <p>
     * "dynamodb.amazonaws.com"
     * </p>
     * </li>
     * </ul>
     * 
     * @param userIdentity
     *        Items that are deleted by the Time to Live process after expiration have the following fields: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Records[].userIdentity.type
     *        </p>
     *        <p>
     *        "Service"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Records[].userIdentity.principalId
     *        </p>
     *        <p>
     *        "dynamodb.amazonaws.com"
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Record withUserIdentity(Identity userIdentity) {
        setUserIdentity(userIdentity);
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
        if (getEventID() != null)
            sb.append("EventID: ").append(getEventID()).append(",");
        if (getEventName() != null)
            sb.append("EventName: ").append(getEventName()).append(",");
        if (getEventVersion() != null)
            sb.append("EventVersion: ").append(getEventVersion()).append(",");
        if (getEventSource() != null)
            sb.append("EventSource: ").append(getEventSource()).append(",");
        if (getAwsRegion() != null)
            sb.append("AwsRegion: ").append(getAwsRegion()).append(",");
        if (getDynamodb() != null)
            sb.append("Dynamodb: ").append(getDynamodb()).append(",");
        if (getUserIdentity() != null)
            sb.append("UserIdentity: ").append(getUserIdentity());
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
        if (other.getUserIdentity() == null ^ this.getUserIdentity() == null)
            return false;
        if (other.getUserIdentity() != null && other.getUserIdentity().equals(this.getUserIdentity()) == false)
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
        hashCode = prime * hashCode + ((getUserIdentity() == null) ? 0 : getUserIdentity().hashCode());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.RecordMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
