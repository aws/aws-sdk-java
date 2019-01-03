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
 * Represents all of the data describing a particular stream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/streams-dynamodb-2012-08-10/StreamDescription" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the stream.
     * </p>
     */
    private String streamArn;
    /**
     * <p>
     * A timestamp, in ISO 8601 format, for this stream.
     * </p>
     * <p>
     * Note that <code>LatestStreamLabel</code> is not a unique identifier for the stream, because it is possible that a
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
     * the <code>StreamLabel</code>
     * </p>
     * </li>
     * </ul>
     */
    private String streamLabel;
    /**
     * <p>
     * Indicates the current status of the stream:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLING</code> - Streams is currently being enabled on the DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - the stream is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLING</code> - Streams is currently being disabled on the DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - the stream is disabled.
     * </p>
     * </li>
     * </ul>
     */
    private String streamStatus;
    /**
     * <p>
     * Indicates the format of the records within this stream:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - only the key attributes of items that were modified in the DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_IMAGE</code> - entire items from the table, as they appeared after they were modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OLD_IMAGE</code> - entire items from the table, as they appeared before they were modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_AND_OLD_IMAGES</code> - both the new and the old images of the items from the table.
     * </p>
     * </li>
     * </ul>
     */
    private String streamViewType;
    /**
     * <p>
     * The date and time when the request to create this stream was issued.
     * </p>
     */
    private java.util.Date creationRequestDateTime;
    /**
     * <p>
     * The DynamoDB table with which the stream is associated.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The key attribute(s) of the stream's DynamoDB table.
     * </p>
     */
    private java.util.List<KeySchemaElement> keySchema;
    /**
     * <p>
     * The shards that comprise the stream.
     * </p>
     */
    private java.util.List<Shard> shards;
    /**
     * <p>
     * The shard ID of the item where the operation stopped, inclusive of the previous result set. Use this value to
     * start a new operation, excluding this value in the new request.
     * </p>
     * <p>
     * If <code>LastEvaluatedShardId</code> is empty, then the "last page" of results has been processed and there is
     * currently no more data to be retrieved.
     * </p>
     * <p>
     * If <code>LastEvaluatedShardId</code> is not empty, it does not necessarily mean that there is more data in the
     * result set. The only way to know when you have reached the end of the result set is when
     * <code>LastEvaluatedShardId</code> is empty.
     * </p>
     */
    private String lastEvaluatedShardId;

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

    public StreamDescription withStreamArn(String streamArn) {
        setStreamArn(streamArn);
        return this;
    }

    /**
     * <p>
     * A timestamp, in ISO 8601 format, for this stream.
     * </p>
     * <p>
     * Note that <code>LatestStreamLabel</code> is not a unique identifier for the stream, because it is possible that a
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
     * the <code>StreamLabel</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param streamLabel
     *        A timestamp, in ISO 8601 format, for this stream.</p>
     *        <p>
     *        Note that <code>LatestStreamLabel</code> is not a unique identifier for the stream, because it is possible
     *        that a stream from another table might have the same timestamp. However, the combination of the following
     *        three elements is guaranteed to be unique:
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
     *        the <code>StreamLabel</code>
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
     * Note that <code>LatestStreamLabel</code> is not a unique identifier for the stream, because it is possible that a
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
     * the <code>StreamLabel</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return A timestamp, in ISO 8601 format, for this stream.</p>
     *         <p>
     *         Note that <code>LatestStreamLabel</code> is not a unique identifier for the stream, because it is
     *         possible that a stream from another table might have the same timestamp. However, the combination of the
     *         following three elements is guaranteed to be unique:
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
     *         the <code>StreamLabel</code>
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
     * Note that <code>LatestStreamLabel</code> is not a unique identifier for the stream, because it is possible that a
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
     * the <code>StreamLabel</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param streamLabel
     *        A timestamp, in ISO 8601 format, for this stream.</p>
     *        <p>
     *        Note that <code>LatestStreamLabel</code> is not a unique identifier for the stream, because it is possible
     *        that a stream from another table might have the same timestamp. However, the combination of the following
     *        three elements is guaranteed to be unique:
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
     *        the <code>StreamLabel</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamDescription withStreamLabel(String streamLabel) {
        setStreamLabel(streamLabel);
        return this;
    }

    /**
     * <p>
     * Indicates the current status of the stream:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLING</code> - Streams is currently being enabled on the DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - the stream is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLING</code> - Streams is currently being disabled on the DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - the stream is disabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param streamStatus
     *        Indicates the current status of the stream:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLING</code> - Streams is currently being enabled on the DynamoDB table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> - the stream is enabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLING</code> - Streams is currently being disabled on the DynamoDB table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> - the stream is disabled.
     *        </p>
     *        </li>
     * @see StreamStatus
     */

    public void setStreamStatus(String streamStatus) {
        this.streamStatus = streamStatus;
    }

    /**
     * <p>
     * Indicates the current status of the stream:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLING</code> - Streams is currently being enabled on the DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - the stream is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLING</code> - Streams is currently being disabled on the DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - the stream is disabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates the current status of the stream:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ENABLING</code> - Streams is currently being enabled on the DynamoDB table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ENABLED</code> - the stream is enabled.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISABLING</code> - Streams is currently being disabled on the DynamoDB table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISABLED</code> - the stream is disabled.
     *         </p>
     *         </li>
     * @see StreamStatus
     */

    public String getStreamStatus() {
        return this.streamStatus;
    }

    /**
     * <p>
     * Indicates the current status of the stream:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLING</code> - Streams is currently being enabled on the DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - the stream is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLING</code> - Streams is currently being disabled on the DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - the stream is disabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param streamStatus
     *        Indicates the current status of the stream:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLING</code> - Streams is currently being enabled on the DynamoDB table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> - the stream is enabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLING</code> - Streams is currently being disabled on the DynamoDB table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> - the stream is disabled.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamStatus
     */

    public StreamDescription withStreamStatus(String streamStatus) {
        setStreamStatus(streamStatus);
        return this;
    }

    /**
     * <p>
     * Indicates the current status of the stream:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLING</code> - Streams is currently being enabled on the DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - the stream is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLING</code> - Streams is currently being disabled on the DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - the stream is disabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param streamStatus
     *        Indicates the current status of the stream:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLING</code> - Streams is currently being enabled on the DynamoDB table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> - the stream is enabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLING</code> - Streams is currently being disabled on the DynamoDB table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> - the stream is disabled.
     *        </p>
     *        </li>
     * @see StreamStatus
     */

    public void setStreamStatus(StreamStatus streamStatus) {
        withStreamStatus(streamStatus);
    }

    /**
     * <p>
     * Indicates the current status of the stream:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLING</code> - Streams is currently being enabled on the DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - the stream is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLING</code> - Streams is currently being disabled on the DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - the stream is disabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param streamStatus
     *        Indicates the current status of the stream:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLING</code> - Streams is currently being enabled on the DynamoDB table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> - the stream is enabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLING</code> - Streams is currently being disabled on the DynamoDB table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> - the stream is disabled.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamStatus
     */

    public StreamDescription withStreamStatus(StreamStatus streamStatus) {
        this.streamStatus = streamStatus.toString();
        return this;
    }

    /**
     * <p>
     * Indicates the format of the records within this stream:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - only the key attributes of items that were modified in the DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_IMAGE</code> - entire items from the table, as they appeared after they were modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OLD_IMAGE</code> - entire items from the table, as they appeared before they were modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_AND_OLD_IMAGES</code> - both the new and the old images of the items from the table.
     * </p>
     * </li>
     * </ul>
     * 
     * @param streamViewType
     *        Indicates the format of the records within this stream:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>KEYS_ONLY</code> - only the key attributes of items that were modified in the DynamoDB table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_IMAGE</code> - entire items from the table, as they appeared after they were modified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OLD_IMAGE</code> - entire items from the table, as they appeared before they were modified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_AND_OLD_IMAGES</code> - both the new and the old images of the items from the table.
     *        </p>
     *        </li>
     * @see StreamViewType
     */

    public void setStreamViewType(String streamViewType) {
        this.streamViewType = streamViewType;
    }

    /**
     * <p>
     * Indicates the format of the records within this stream:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - only the key attributes of items that were modified in the DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_IMAGE</code> - entire items from the table, as they appeared after they were modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OLD_IMAGE</code> - entire items from the table, as they appeared before they were modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_AND_OLD_IMAGES</code> - both the new and the old images of the items from the table.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates the format of the records within this stream:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>KEYS_ONLY</code> - only the key attributes of items that were modified in the DynamoDB table.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NEW_IMAGE</code> - entire items from the table, as they appeared after they were modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OLD_IMAGE</code> - entire items from the table, as they appeared before they were modified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NEW_AND_OLD_IMAGES</code> - both the new and the old images of the items from the table.
     *         </p>
     *         </li>
     * @see StreamViewType
     */

    public String getStreamViewType() {
        return this.streamViewType;
    }

    /**
     * <p>
     * Indicates the format of the records within this stream:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - only the key attributes of items that were modified in the DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_IMAGE</code> - entire items from the table, as they appeared after they were modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OLD_IMAGE</code> - entire items from the table, as they appeared before they were modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_AND_OLD_IMAGES</code> - both the new and the old images of the items from the table.
     * </p>
     * </li>
     * </ul>
     * 
     * @param streamViewType
     *        Indicates the format of the records within this stream:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>KEYS_ONLY</code> - only the key attributes of items that were modified in the DynamoDB table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_IMAGE</code> - entire items from the table, as they appeared after they were modified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OLD_IMAGE</code> - entire items from the table, as they appeared before they were modified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_AND_OLD_IMAGES</code> - both the new and the old images of the items from the table.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamViewType
     */

    public StreamDescription withStreamViewType(String streamViewType) {
        setStreamViewType(streamViewType);
        return this;
    }

    /**
     * <p>
     * Indicates the format of the records within this stream:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - only the key attributes of items that were modified in the DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_IMAGE</code> - entire items from the table, as they appeared after they were modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OLD_IMAGE</code> - entire items from the table, as they appeared before they were modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_AND_OLD_IMAGES</code> - both the new and the old images of the items from the table.
     * </p>
     * </li>
     * </ul>
     * 
     * @param streamViewType
     *        Indicates the format of the records within this stream:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>KEYS_ONLY</code> - only the key attributes of items that were modified in the DynamoDB table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_IMAGE</code> - entire items from the table, as they appeared after they were modified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OLD_IMAGE</code> - entire items from the table, as they appeared before they were modified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_AND_OLD_IMAGES</code> - both the new and the old images of the items from the table.
     *        </p>
     *        </li>
     * @see StreamViewType
     */

    public void setStreamViewType(StreamViewType streamViewType) {
        withStreamViewType(streamViewType);
    }

    /**
     * <p>
     * Indicates the format of the records within this stream:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KEYS_ONLY</code> - only the key attributes of items that were modified in the DynamoDB table.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_IMAGE</code> - entire items from the table, as they appeared after they were modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OLD_IMAGE</code> - entire items from the table, as they appeared before they were modified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEW_AND_OLD_IMAGES</code> - both the new and the old images of the items from the table.
     * </p>
     * </li>
     * </ul>
     * 
     * @param streamViewType
     *        Indicates the format of the records within this stream:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>KEYS_ONLY</code> - only the key attributes of items that were modified in the DynamoDB table.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_IMAGE</code> - entire items from the table, as they appeared after they were modified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OLD_IMAGE</code> - entire items from the table, as they appeared before they were modified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEW_AND_OLD_IMAGES</code> - both the new and the old images of the items from the table.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamViewType
     */

    public StreamDescription withStreamViewType(StreamViewType streamViewType) {
        this.streamViewType = streamViewType.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when the request to create this stream was issued.
     * </p>
     * 
     * @param creationRequestDateTime
     *        The date and time when the request to create this stream was issued.
     */

    public void setCreationRequestDateTime(java.util.Date creationRequestDateTime) {
        this.creationRequestDateTime = creationRequestDateTime;
    }

    /**
     * <p>
     * The date and time when the request to create this stream was issued.
     * </p>
     * 
     * @return The date and time when the request to create this stream was issued.
     */

    public java.util.Date getCreationRequestDateTime() {
        return this.creationRequestDateTime;
    }

    /**
     * <p>
     * The date and time when the request to create this stream was issued.
     * </p>
     * 
     * @param creationRequestDateTime
     *        The date and time when the request to create this stream was issued.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamDescription withCreationRequestDateTime(java.util.Date creationRequestDateTime) {
        setCreationRequestDateTime(creationRequestDateTime);
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

    public StreamDescription withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The key attribute(s) of the stream's DynamoDB table.
     * </p>
     * 
     * @return The key attribute(s) of the stream's DynamoDB table.
     */

    public java.util.List<KeySchemaElement> getKeySchema() {
        return keySchema;
    }

    /**
     * <p>
     * The key attribute(s) of the stream's DynamoDB table.
     * </p>
     * 
     * @param keySchema
     *        The key attribute(s) of the stream's DynamoDB table.
     */

    public void setKeySchema(java.util.Collection<KeySchemaElement> keySchema) {
        if (keySchema == null) {
            this.keySchema = null;
            return;
        }

        this.keySchema = new java.util.ArrayList<KeySchemaElement>(keySchema);
    }

    /**
     * <p>
     * The key attribute(s) of the stream's DynamoDB table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeySchema(java.util.Collection)} or {@link #withKeySchema(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param keySchema
     *        The key attribute(s) of the stream's DynamoDB table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamDescription withKeySchema(KeySchemaElement... keySchema) {
        if (this.keySchema == null) {
            setKeySchema(new java.util.ArrayList<KeySchemaElement>(keySchema.length));
        }
        for (KeySchemaElement ele : keySchema) {
            this.keySchema.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The key attribute(s) of the stream's DynamoDB table.
     * </p>
     * 
     * @param keySchema
     *        The key attribute(s) of the stream's DynamoDB table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamDescription withKeySchema(java.util.Collection<KeySchemaElement> keySchema) {
        setKeySchema(keySchema);
        return this;
    }

    /**
     * <p>
     * The shards that comprise the stream.
     * </p>
     * 
     * @return The shards that comprise the stream.
     */

    public java.util.List<Shard> getShards() {
        return shards;
    }

    /**
     * <p>
     * The shards that comprise the stream.
     * </p>
     * 
     * @param shards
     *        The shards that comprise the stream.
     */

    public void setShards(java.util.Collection<Shard> shards) {
        if (shards == null) {
            this.shards = null;
            return;
        }

        this.shards = new java.util.ArrayList<Shard>(shards);
    }

    /**
     * <p>
     * The shards that comprise the stream.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setShards(java.util.Collection)} or {@link #withShards(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param shards
     *        The shards that comprise the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamDescription withShards(Shard... shards) {
        if (this.shards == null) {
            setShards(new java.util.ArrayList<Shard>(shards.length));
        }
        for (Shard ele : shards) {
            this.shards.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The shards that comprise the stream.
     * </p>
     * 
     * @param shards
     *        The shards that comprise the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamDescription withShards(java.util.Collection<Shard> shards) {
        setShards(shards);
        return this;
    }

    /**
     * <p>
     * The shard ID of the item where the operation stopped, inclusive of the previous result set. Use this value to
     * start a new operation, excluding this value in the new request.
     * </p>
     * <p>
     * If <code>LastEvaluatedShardId</code> is empty, then the "last page" of results has been processed and there is
     * currently no more data to be retrieved.
     * </p>
     * <p>
     * If <code>LastEvaluatedShardId</code> is not empty, it does not necessarily mean that there is more data in the
     * result set. The only way to know when you have reached the end of the result set is when
     * <code>LastEvaluatedShardId</code> is empty.
     * </p>
     * 
     * @param lastEvaluatedShardId
     *        The shard ID of the item where the operation stopped, inclusive of the previous result set. Use this value
     *        to start a new operation, excluding this value in the new request.</p>
     *        <p>
     *        If <code>LastEvaluatedShardId</code> is empty, then the "last page" of results has been processed and
     *        there is currently no more data to be retrieved.
     *        </p>
     *        <p>
     *        If <code>LastEvaluatedShardId</code> is not empty, it does not necessarily mean that there is more data in
     *        the result set. The only way to know when you have reached the end of the result set is when
     *        <code>LastEvaluatedShardId</code> is empty.
     */

    public void setLastEvaluatedShardId(String lastEvaluatedShardId) {
        this.lastEvaluatedShardId = lastEvaluatedShardId;
    }

    /**
     * <p>
     * The shard ID of the item where the operation stopped, inclusive of the previous result set. Use this value to
     * start a new operation, excluding this value in the new request.
     * </p>
     * <p>
     * If <code>LastEvaluatedShardId</code> is empty, then the "last page" of results has been processed and there is
     * currently no more data to be retrieved.
     * </p>
     * <p>
     * If <code>LastEvaluatedShardId</code> is not empty, it does not necessarily mean that there is more data in the
     * result set. The only way to know when you have reached the end of the result set is when
     * <code>LastEvaluatedShardId</code> is empty.
     * </p>
     * 
     * @return The shard ID of the item where the operation stopped, inclusive of the previous result set. Use this
     *         value to start a new operation, excluding this value in the new request.</p>
     *         <p>
     *         If <code>LastEvaluatedShardId</code> is empty, then the "last page" of results has been processed and
     *         there is currently no more data to be retrieved.
     *         </p>
     *         <p>
     *         If <code>LastEvaluatedShardId</code> is not empty, it does not necessarily mean that there is more data
     *         in the result set. The only way to know when you have reached the end of the result set is when
     *         <code>LastEvaluatedShardId</code> is empty.
     */

    public String getLastEvaluatedShardId() {
        return this.lastEvaluatedShardId;
    }

    /**
     * <p>
     * The shard ID of the item where the operation stopped, inclusive of the previous result set. Use this value to
     * start a new operation, excluding this value in the new request.
     * </p>
     * <p>
     * If <code>LastEvaluatedShardId</code> is empty, then the "last page" of results has been processed and there is
     * currently no more data to be retrieved.
     * </p>
     * <p>
     * If <code>LastEvaluatedShardId</code> is not empty, it does not necessarily mean that there is more data in the
     * result set. The only way to know when you have reached the end of the result set is when
     * <code>LastEvaluatedShardId</code> is empty.
     * </p>
     * 
     * @param lastEvaluatedShardId
     *        The shard ID of the item where the operation stopped, inclusive of the previous result set. Use this value
     *        to start a new operation, excluding this value in the new request.</p>
     *        <p>
     *        If <code>LastEvaluatedShardId</code> is empty, then the "last page" of results has been processed and
     *        there is currently no more data to be retrieved.
     *        </p>
     *        <p>
     *        If <code>LastEvaluatedShardId</code> is not empty, it does not necessarily mean that there is more data in
     *        the result set. The only way to know when you have reached the end of the result set is when
     *        <code>LastEvaluatedShardId</code> is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamDescription withLastEvaluatedShardId(String lastEvaluatedShardId) {
        setLastEvaluatedShardId(lastEvaluatedShardId);
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
        if (getStreamArn() != null)
            sb.append("StreamArn: ").append(getStreamArn()).append(",");
        if (getStreamLabel() != null)
            sb.append("StreamLabel: ").append(getStreamLabel()).append(",");
        if (getStreamStatus() != null)
            sb.append("StreamStatus: ").append(getStreamStatus()).append(",");
        if (getStreamViewType() != null)
            sb.append("StreamViewType: ").append(getStreamViewType()).append(",");
        if (getCreationRequestDateTime() != null)
            sb.append("CreationRequestDateTime: ").append(getCreationRequestDateTime()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getKeySchema() != null)
            sb.append("KeySchema: ").append(getKeySchema()).append(",");
        if (getShards() != null)
            sb.append("Shards: ").append(getShards()).append(",");
        if (getLastEvaluatedShardId() != null)
            sb.append("LastEvaluatedShardId: ").append(getLastEvaluatedShardId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamDescription == false)
            return false;
        StreamDescription other = (StreamDescription) obj;
        if (other.getStreamArn() == null ^ this.getStreamArn() == null)
            return false;
        if (other.getStreamArn() != null && other.getStreamArn().equals(this.getStreamArn()) == false)
            return false;
        if (other.getStreamLabel() == null ^ this.getStreamLabel() == null)
            return false;
        if (other.getStreamLabel() != null && other.getStreamLabel().equals(this.getStreamLabel()) == false)
            return false;
        if (other.getStreamStatus() == null ^ this.getStreamStatus() == null)
            return false;
        if (other.getStreamStatus() != null && other.getStreamStatus().equals(this.getStreamStatus()) == false)
            return false;
        if (other.getStreamViewType() == null ^ this.getStreamViewType() == null)
            return false;
        if (other.getStreamViewType() != null && other.getStreamViewType().equals(this.getStreamViewType()) == false)
            return false;
        if (other.getCreationRequestDateTime() == null ^ this.getCreationRequestDateTime() == null)
            return false;
        if (other.getCreationRequestDateTime() != null && other.getCreationRequestDateTime().equals(this.getCreationRequestDateTime()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getKeySchema() == null ^ this.getKeySchema() == null)
            return false;
        if (other.getKeySchema() != null && other.getKeySchema().equals(this.getKeySchema()) == false)
            return false;
        if (other.getShards() == null ^ this.getShards() == null)
            return false;
        if (other.getShards() != null && other.getShards().equals(this.getShards()) == false)
            return false;
        if (other.getLastEvaluatedShardId() == null ^ this.getLastEvaluatedShardId() == null)
            return false;
        if (other.getLastEvaluatedShardId() != null && other.getLastEvaluatedShardId().equals(this.getLastEvaluatedShardId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamArn() == null) ? 0 : getStreamArn().hashCode());
        hashCode = prime * hashCode + ((getStreamLabel() == null) ? 0 : getStreamLabel().hashCode());
        hashCode = prime * hashCode + ((getStreamStatus() == null) ? 0 : getStreamStatus().hashCode());
        hashCode = prime * hashCode + ((getStreamViewType() == null) ? 0 : getStreamViewType().hashCode());
        hashCode = prime * hashCode + ((getCreationRequestDateTime() == null) ? 0 : getCreationRequestDateTime().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getKeySchema() == null) ? 0 : getKeySchema().hashCode());
        hashCode = prime * hashCode + ((getShards() == null) ? 0 : getShards().hashCode());
        hashCode = prime * hashCode + ((getLastEvaluatedShardId() == null) ? 0 : getLastEvaluatedShardId().hashCode());
        return hashCode;
    }

    @Override
    public StreamDescription clone() {
        try {
            return (StreamDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.StreamDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
