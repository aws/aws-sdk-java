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
 * Represents all of the data describing a particular stream.
 * </p>
 */
public class Stream implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the stream.
     * </p>
     */
    private String streamArn;
    /**
     * <p>
     * The DynamoDB table with which the stream is associated.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * A timestamp, in ISO 8601 format, for this stream.
     * </p>
     * <p>
     * Note that <i>LatestStreamLabel</i> is not a unique identifier for the stream, because it is possible that a
     * stream from another table might have the same timestamp. However, the combination of the following three elements
     * is guaranteed to be unique:
     * </p>
     * <ul>
     * <li>
     * <p>
     * the AWS customer ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * the table name
     * </p>
     * </li>
     * <li>
     * <p>
     * the <i>StreamLabel</i>
     * </p>
     * </li>
     * </ul>
     */
    private String streamLabel;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the stream.
     * </p>
     * 
     * @param streamArn
     *        The Amazon Resource Name (ARN) for the stream.
     */

    public void setStreamArn(String streamArn) {
        this.streamArn = streamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the stream.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the stream.
     */

    public String getStreamArn() {
        return this.streamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the stream.
     * </p>
     * 
     * @param streamArn
     *        The Amazon Resource Name (ARN) for the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stream withStreamArn(String streamArn) {
        setStreamArn(streamArn);
        return this;
    }

    /**
     * <p>
     * The DynamoDB table with which the stream is associated.
     * </p>
     * 
     * @param tableName
     *        The DynamoDB table with which the stream is associated.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The DynamoDB table with which the stream is associated.
     * </p>
     * 
     * @return The DynamoDB table with which the stream is associated.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The DynamoDB table with which the stream is associated.
     * </p>
     * 
     * @param tableName
     *        The DynamoDB table with which the stream is associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stream withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * A timestamp, in ISO 8601 format, for this stream.
     * </p>
     * <p>
     * Note that <i>LatestStreamLabel</i> is not a unique identifier for the stream, because it is possible that a
     * stream from another table might have the same timestamp. However, the combination of the following three elements
     * is guaranteed to be unique:
     * </p>
     * <ul>
     * <li>
     * <p>
     * the AWS customer ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * the table name
     * </p>
     * </li>
     * <li>
     * <p>
     * the <i>StreamLabel</i>
     * </p>
     * </li>
     * </ul>
     * 
     * @param streamLabel
     *        A timestamp, in ISO 8601 format, for this stream.</p>
     *        <p>
     *        Note that <i>LatestStreamLabel</i> is not a unique identifier for the stream, because it is possible that
     *        a stream from another table might have the same timestamp. However, the combination of the following three
     *        elements is guaranteed to be unique:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        the AWS customer ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        the table name
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        the <i>StreamLabel</i>
     *        </p>
     *        </li>
     */

    public void setStreamLabel(String streamLabel) {
        this.streamLabel = streamLabel;
    }

    /**
     * <p>
     * A timestamp, in ISO 8601 format, for this stream.
     * </p>
     * <p>
     * Note that <i>LatestStreamLabel</i> is not a unique identifier for the stream, because it is possible that a
     * stream from another table might have the same timestamp. However, the combination of the following three elements
     * is guaranteed to be unique:
     * </p>
     * <ul>
     * <li>
     * <p>
     * the AWS customer ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * the table name
     * </p>
     * </li>
     * <li>
     * <p>
     * the <i>StreamLabel</i>
     * </p>
     * </li>
     * </ul>
     * 
     * @return A timestamp, in ISO 8601 format, for this stream.</p>
     *         <p>
     *         Note that <i>LatestStreamLabel</i> is not a unique identifier for the stream, because it is possible that
     *         a stream from another table might have the same timestamp. However, the combination of the following
     *         three elements is guaranteed to be unique:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         the AWS customer ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         the table name
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         the <i>StreamLabel</i>
     *         </p>
     *         </li>
     */

    public String getStreamLabel() {
        return this.streamLabel;
    }

    /**
     * <p>
     * A timestamp, in ISO 8601 format, for this stream.
     * </p>
     * <p>
     * Note that <i>LatestStreamLabel</i> is not a unique identifier for the stream, because it is possible that a
     * stream from another table might have the same timestamp. However, the combination of the following three elements
     * is guaranteed to be unique:
     * </p>
     * <ul>
     * <li>
     * <p>
     * the AWS customer ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * the table name
     * </p>
     * </li>
     * <li>
     * <p>
     * the <i>StreamLabel</i>
     * </p>
     * </li>
     * </ul>
     * 
     * @param streamLabel
     *        A timestamp, in ISO 8601 format, for this stream.</p>
     *        <p>
     *        Note that <i>LatestStreamLabel</i> is not a unique identifier for the stream, because it is possible that
     *        a stream from another table might have the same timestamp. However, the combination of the following three
     *        elements is guaranteed to be unique:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        the AWS customer ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        the table name
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        the <i>StreamLabel</i>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stream withStreamLabel(String streamLabel) {
        setStreamLabel(streamLabel);
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
        if (getStreamArn() != null)
            sb.append("StreamArn: " + getStreamArn() + ",");
        if (getTableName() != null)
            sb.append("TableName: " + getTableName() + ",");
        if (getStreamLabel() != null)
            sb.append("StreamLabel: " + getStreamLabel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Stream == false)
            return false;
        Stream other = (Stream) obj;
        if (other.getStreamArn() == null ^ this.getStreamArn() == null)
            return false;
        if (other.getStreamArn() != null && other.getStreamArn().equals(this.getStreamArn()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getStreamLabel() == null ^ this.getStreamLabel() == null)
            return false;
        if (other.getStreamLabel() != null && other.getStreamLabel().equals(this.getStreamLabel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamArn() == null) ? 0 : getStreamArn().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getStreamLabel() == null) ? 0 : getStreamLabel().hashCode());
        return hashCode;
    }

    @Override
    public Stream clone() {
        try {
            return (Stream) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
