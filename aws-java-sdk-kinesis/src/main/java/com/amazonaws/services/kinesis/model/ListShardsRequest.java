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
package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/ListShards" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListShardsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the data stream whose shards you want to list.
     * </p>
     * <p>
     * You cannot specify this parameter if you specify the <code>NextToken</code> parameter.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * When the number of shards in the data stream is greater than the default value for the <code>MaxResults</code>
     * parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number of
     * shards in the data stream, the response includes a pagination token named <code>NextToken</code>. You can specify
     * this <code>NextToken</code> value in a subsequent call to <code>ListShards</code> to list the next set of shards.
     * </p>
     * <p>
     * Don't specify <code>StreamName</code> or <code>StreamCreationTimestamp</code> if you specify
     * <code>NextToken</code> because the latter unambiguously identifies the stream.
     * </p>
     * <p>
     * You can optionally specify a value for the <code>MaxResults</code> parameter when you specify
     * <code>NextToken</code>. If you specify a <code>MaxResults</code> value that is less than the number of shards
     * that the operation returns if you don't specify <code>MaxResults</code>, the response will contain a new
     * <code>NextToken</code> value. You can use the new <code>NextToken</code> value in a subsequent call to the
     * <code>ListShards</code> operation.
     * </p>
     * <important>
     * <p>
     * Tokens expire after 300 seconds. When you obtain a value for <code>NextToken</code> in the response to a call to
     * <code>ListShards</code>, you have 300 seconds to use that value. If you specify an expired token in a call to
     * <code>ListShards</code>, you get <code>ExpiredNextTokenException</code>.
     * </p>
     * </important>
     */
    private String nextToken;
    /**
     * <p>
     * Specify this parameter to indicate that you want to list the shards starting with the shard whose ID immediately
     * follows <code>ExclusiveStartShardId</code>.
     * </p>
     * <p>
     * If you don't specify this parameter, the default behavior is for <code>ListShards</code> to list the shards
     * starting with the first one in the stream.
     * </p>
     * <p>
     * You cannot specify this parameter if you specify <code>NextToken</code>.
     * </p>
     */
    private String exclusiveStartShardId;
    /**
     * <p>
     * The maximum number of shards to return in a single call to <code>ListShards</code>. The minimum value you can
     * specify for this parameter is 1, and the maximum is 1,000, which is also the default.
     * </p>
     * <p>
     * When the number of shards to be listed is greater than the value of <code>MaxResults</code>, the response
     * contains a <code>NextToken</code> value that you can use in a subsequent call to <code>ListShards</code> to list
     * the next set of shards.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Specify this input parameter to distinguish data streams that have the same name. For example, if you create a
     * data stream and then delete it, and you later create another data stream with the same name, you can use this
     * input parameter to specify which of the two streams you want to list the shards for.
     * </p>
     * <p>
     * You cannot specify this parameter if you specify the <code>NextToken</code> parameter.
     * </p>
     */
    private java.util.Date streamCreationTimestamp;

    /**
     * <p>
     * The name of the data stream whose shards you want to list.
     * </p>
     * <p>
     * You cannot specify this parameter if you specify the <code>NextToken</code> parameter.
     * </p>
     * 
     * @param streamName
     *        The name of the data stream whose shards you want to list. </p>
     *        <p>
     *        You cannot specify this parameter if you specify the <code>NextToken</code> parameter.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the data stream whose shards you want to list.
     * </p>
     * <p>
     * You cannot specify this parameter if you specify the <code>NextToken</code> parameter.
     * </p>
     * 
     * @return The name of the data stream whose shards you want to list. </p>
     *         <p>
     *         You cannot specify this parameter if you specify the <code>NextToken</code> parameter.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name of the data stream whose shards you want to list.
     * </p>
     * <p>
     * You cannot specify this parameter if you specify the <code>NextToken</code> parameter.
     * </p>
     * 
     * @param streamName
     *        The name of the data stream whose shards you want to list. </p>
     *        <p>
     *        You cannot specify this parameter if you specify the <code>NextToken</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListShardsRequest withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * When the number of shards in the data stream is greater than the default value for the <code>MaxResults</code>
     * parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number of
     * shards in the data stream, the response includes a pagination token named <code>NextToken</code>. You can specify
     * this <code>NextToken</code> value in a subsequent call to <code>ListShards</code> to list the next set of shards.
     * </p>
     * <p>
     * Don't specify <code>StreamName</code> or <code>StreamCreationTimestamp</code> if you specify
     * <code>NextToken</code> because the latter unambiguously identifies the stream.
     * </p>
     * <p>
     * You can optionally specify a value for the <code>MaxResults</code> parameter when you specify
     * <code>NextToken</code>. If you specify a <code>MaxResults</code> value that is less than the number of shards
     * that the operation returns if you don't specify <code>MaxResults</code>, the response will contain a new
     * <code>NextToken</code> value. You can use the new <code>NextToken</code> value in a subsequent call to the
     * <code>ListShards</code> operation.
     * </p>
     * <important>
     * <p>
     * Tokens expire after 300 seconds. When you obtain a value for <code>NextToken</code> in the response to a call to
     * <code>ListShards</code>, you have 300 seconds to use that value. If you specify an expired token in a call to
     * <code>ListShards</code>, you get <code>ExpiredNextTokenException</code>.
     * </p>
     * </important>
     * 
     * @param nextToken
     *        When the number of shards in the data stream is greater than the default value for the
     *        <code>MaxResults</code> parameter, or if you explicitly specify a value for <code>MaxResults</code> that
     *        is less than the number of shards in the data stream, the response includes a pagination token named
     *        <code>NextToken</code>. You can specify this <code>NextToken</code> value in a subsequent call to
     *        <code>ListShards</code> to list the next set of shards.</p>
     *        <p>
     *        Don't specify <code>StreamName</code> or <code>StreamCreationTimestamp</code> if you specify
     *        <code>NextToken</code> because the latter unambiguously identifies the stream.
     *        </p>
     *        <p>
     *        You can optionally specify a value for the <code>MaxResults</code> parameter when you specify
     *        <code>NextToken</code>. If you specify a <code>MaxResults</code> value that is less than the number of
     *        shards that the operation returns if you don't specify <code>MaxResults</code>, the response will contain
     *        a new <code>NextToken</code> value. You can use the new <code>NextToken</code> value in a subsequent call
     *        to the <code>ListShards</code> operation.
     *        </p>
     *        <important>
     *        <p>
     *        Tokens expire after 300 seconds. When you obtain a value for <code>NextToken</code> in the response to a
     *        call to <code>ListShards</code>, you have 300 seconds to use that value. If you specify an expired token
     *        in a call to <code>ListShards</code>, you get <code>ExpiredNextTokenException</code>.
     *        </p>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When the number of shards in the data stream is greater than the default value for the <code>MaxResults</code>
     * parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number of
     * shards in the data stream, the response includes a pagination token named <code>NextToken</code>. You can specify
     * this <code>NextToken</code> value in a subsequent call to <code>ListShards</code> to list the next set of shards.
     * </p>
     * <p>
     * Don't specify <code>StreamName</code> or <code>StreamCreationTimestamp</code> if you specify
     * <code>NextToken</code> because the latter unambiguously identifies the stream.
     * </p>
     * <p>
     * You can optionally specify a value for the <code>MaxResults</code> parameter when you specify
     * <code>NextToken</code>. If you specify a <code>MaxResults</code> value that is less than the number of shards
     * that the operation returns if you don't specify <code>MaxResults</code>, the response will contain a new
     * <code>NextToken</code> value. You can use the new <code>NextToken</code> value in a subsequent call to the
     * <code>ListShards</code> operation.
     * </p>
     * <important>
     * <p>
     * Tokens expire after 300 seconds. When you obtain a value for <code>NextToken</code> in the response to a call to
     * <code>ListShards</code>, you have 300 seconds to use that value. If you specify an expired token in a call to
     * <code>ListShards</code>, you get <code>ExpiredNextTokenException</code>.
     * </p>
     * </important>
     * 
     * @return When the number of shards in the data stream is greater than the default value for the
     *         <code>MaxResults</code> parameter, or if you explicitly specify a value for <code>MaxResults</code> that
     *         is less than the number of shards in the data stream, the response includes a pagination token named
     *         <code>NextToken</code>. You can specify this <code>NextToken</code> value in a subsequent call to
     *         <code>ListShards</code> to list the next set of shards.</p>
     *         <p>
     *         Don't specify <code>StreamName</code> or <code>StreamCreationTimestamp</code> if you specify
     *         <code>NextToken</code> because the latter unambiguously identifies the stream.
     *         </p>
     *         <p>
     *         You can optionally specify a value for the <code>MaxResults</code> parameter when you specify
     *         <code>NextToken</code>. If you specify a <code>MaxResults</code> value that is less than the number of
     *         shards that the operation returns if you don't specify <code>MaxResults</code>, the response will contain
     *         a new <code>NextToken</code> value. You can use the new <code>NextToken</code> value in a subsequent call
     *         to the <code>ListShards</code> operation.
     *         </p>
     *         <important>
     *         <p>
     *         Tokens expire after 300 seconds. When you obtain a value for <code>NextToken</code> in the response to a
     *         call to <code>ListShards</code>, you have 300 seconds to use that value. If you specify an expired token
     *         in a call to <code>ListShards</code>, you get <code>ExpiredNextTokenException</code>.
     *         </p>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When the number of shards in the data stream is greater than the default value for the <code>MaxResults</code>
     * parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number of
     * shards in the data stream, the response includes a pagination token named <code>NextToken</code>. You can specify
     * this <code>NextToken</code> value in a subsequent call to <code>ListShards</code> to list the next set of shards.
     * </p>
     * <p>
     * Don't specify <code>StreamName</code> or <code>StreamCreationTimestamp</code> if you specify
     * <code>NextToken</code> because the latter unambiguously identifies the stream.
     * </p>
     * <p>
     * You can optionally specify a value for the <code>MaxResults</code> parameter when you specify
     * <code>NextToken</code>. If you specify a <code>MaxResults</code> value that is less than the number of shards
     * that the operation returns if you don't specify <code>MaxResults</code>, the response will contain a new
     * <code>NextToken</code> value. You can use the new <code>NextToken</code> value in a subsequent call to the
     * <code>ListShards</code> operation.
     * </p>
     * <important>
     * <p>
     * Tokens expire after 300 seconds. When you obtain a value for <code>NextToken</code> in the response to a call to
     * <code>ListShards</code>, you have 300 seconds to use that value. If you specify an expired token in a call to
     * <code>ListShards</code>, you get <code>ExpiredNextTokenException</code>.
     * </p>
     * </important>
     * 
     * @param nextToken
     *        When the number of shards in the data stream is greater than the default value for the
     *        <code>MaxResults</code> parameter, or if you explicitly specify a value for <code>MaxResults</code> that
     *        is less than the number of shards in the data stream, the response includes a pagination token named
     *        <code>NextToken</code>. You can specify this <code>NextToken</code> value in a subsequent call to
     *        <code>ListShards</code> to list the next set of shards.</p>
     *        <p>
     *        Don't specify <code>StreamName</code> or <code>StreamCreationTimestamp</code> if you specify
     *        <code>NextToken</code> because the latter unambiguously identifies the stream.
     *        </p>
     *        <p>
     *        You can optionally specify a value for the <code>MaxResults</code> parameter when you specify
     *        <code>NextToken</code>. If you specify a <code>MaxResults</code> value that is less than the number of
     *        shards that the operation returns if you don't specify <code>MaxResults</code>, the response will contain
     *        a new <code>NextToken</code> value. You can use the new <code>NextToken</code> value in a subsequent call
     *        to the <code>ListShards</code> operation.
     *        </p>
     *        <important>
     *        <p>
     *        Tokens expire after 300 seconds. When you obtain a value for <code>NextToken</code> in the response to a
     *        call to <code>ListShards</code>, you have 300 seconds to use that value. If you specify an expired token
     *        in a call to <code>ListShards</code>, you get <code>ExpiredNextTokenException</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListShardsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Specify this parameter to indicate that you want to list the shards starting with the shard whose ID immediately
     * follows <code>ExclusiveStartShardId</code>.
     * </p>
     * <p>
     * If you don't specify this parameter, the default behavior is for <code>ListShards</code> to list the shards
     * starting with the first one in the stream.
     * </p>
     * <p>
     * You cannot specify this parameter if you specify <code>NextToken</code>.
     * </p>
     * 
     * @param exclusiveStartShardId
     *        Specify this parameter to indicate that you want to list the shards starting with the shard whose ID
     *        immediately follows <code>ExclusiveStartShardId</code>.</p>
     *        <p>
     *        If you don't specify this parameter, the default behavior is for <code>ListShards</code> to list the
     *        shards starting with the first one in the stream.
     *        </p>
     *        <p>
     *        You cannot specify this parameter if you specify <code>NextToken</code>.
     */

    public void setExclusiveStartShardId(String exclusiveStartShardId) {
        this.exclusiveStartShardId = exclusiveStartShardId;
    }

    /**
     * <p>
     * Specify this parameter to indicate that you want to list the shards starting with the shard whose ID immediately
     * follows <code>ExclusiveStartShardId</code>.
     * </p>
     * <p>
     * If you don't specify this parameter, the default behavior is for <code>ListShards</code> to list the shards
     * starting with the first one in the stream.
     * </p>
     * <p>
     * You cannot specify this parameter if you specify <code>NextToken</code>.
     * </p>
     * 
     * @return Specify this parameter to indicate that you want to list the shards starting with the shard whose ID
     *         immediately follows <code>ExclusiveStartShardId</code>.</p>
     *         <p>
     *         If you don't specify this parameter, the default behavior is for <code>ListShards</code> to list the
     *         shards starting with the first one in the stream.
     *         </p>
     *         <p>
     *         You cannot specify this parameter if you specify <code>NextToken</code>.
     */

    public String getExclusiveStartShardId() {
        return this.exclusiveStartShardId;
    }

    /**
     * <p>
     * Specify this parameter to indicate that you want to list the shards starting with the shard whose ID immediately
     * follows <code>ExclusiveStartShardId</code>.
     * </p>
     * <p>
     * If you don't specify this parameter, the default behavior is for <code>ListShards</code> to list the shards
     * starting with the first one in the stream.
     * </p>
     * <p>
     * You cannot specify this parameter if you specify <code>NextToken</code>.
     * </p>
     * 
     * @param exclusiveStartShardId
     *        Specify this parameter to indicate that you want to list the shards starting with the shard whose ID
     *        immediately follows <code>ExclusiveStartShardId</code>.</p>
     *        <p>
     *        If you don't specify this parameter, the default behavior is for <code>ListShards</code> to list the
     *        shards starting with the first one in the stream.
     *        </p>
     *        <p>
     *        You cannot specify this parameter if you specify <code>NextToken</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListShardsRequest withExclusiveStartShardId(String exclusiveStartShardId) {
        setExclusiveStartShardId(exclusiveStartShardId);
        return this;
    }

    /**
     * <p>
     * The maximum number of shards to return in a single call to <code>ListShards</code>. The minimum value you can
     * specify for this parameter is 1, and the maximum is 1,000, which is also the default.
     * </p>
     * <p>
     * When the number of shards to be listed is greater than the value of <code>MaxResults</code>, the response
     * contains a <code>NextToken</code> value that you can use in a subsequent call to <code>ListShards</code> to list
     * the next set of shards.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of shards to return in a single call to <code>ListShards</code>. The minimum value you
     *        can specify for this parameter is 1, and the maximum is 1,000, which is also the default.</p>
     *        <p>
     *        When the number of shards to be listed is greater than the value of <code>MaxResults</code>, the response
     *        contains a <code>NextToken</code> value that you can use in a subsequent call to <code>ListShards</code>
     *        to list the next set of shards.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of shards to return in a single call to <code>ListShards</code>. The minimum value you can
     * specify for this parameter is 1, and the maximum is 1,000, which is also the default.
     * </p>
     * <p>
     * When the number of shards to be listed is greater than the value of <code>MaxResults</code>, the response
     * contains a <code>NextToken</code> value that you can use in a subsequent call to <code>ListShards</code> to list
     * the next set of shards.
     * </p>
     * 
     * @return The maximum number of shards to return in a single call to <code>ListShards</code>. The minimum value you
     *         can specify for this parameter is 1, and the maximum is 1,000, which is also the default.</p>
     *         <p>
     *         When the number of shards to be listed is greater than the value of <code>MaxResults</code>, the response
     *         contains a <code>NextToken</code> value that you can use in a subsequent call to <code>ListShards</code>
     *         to list the next set of shards.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of shards to return in a single call to <code>ListShards</code>. The minimum value you can
     * specify for this parameter is 1, and the maximum is 1,000, which is also the default.
     * </p>
     * <p>
     * When the number of shards to be listed is greater than the value of <code>MaxResults</code>, the response
     * contains a <code>NextToken</code> value that you can use in a subsequent call to <code>ListShards</code> to list
     * the next set of shards.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of shards to return in a single call to <code>ListShards</code>. The minimum value you
     *        can specify for this parameter is 1, and the maximum is 1,000, which is also the default.</p>
     *        <p>
     *        When the number of shards to be listed is greater than the value of <code>MaxResults</code>, the response
     *        contains a <code>NextToken</code> value that you can use in a subsequent call to <code>ListShards</code>
     *        to list the next set of shards.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListShardsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Specify this input parameter to distinguish data streams that have the same name. For example, if you create a
     * data stream and then delete it, and you later create another data stream with the same name, you can use this
     * input parameter to specify which of the two streams you want to list the shards for.
     * </p>
     * <p>
     * You cannot specify this parameter if you specify the <code>NextToken</code> parameter.
     * </p>
     * 
     * @param streamCreationTimestamp
     *        Specify this input parameter to distinguish data streams that have the same name. For example, if you
     *        create a data stream and then delete it, and you later create another data stream with the same name, you
     *        can use this input parameter to specify which of the two streams you want to list the shards for.</p>
     *        <p>
     *        You cannot specify this parameter if you specify the <code>NextToken</code> parameter.
     */

    public void setStreamCreationTimestamp(java.util.Date streamCreationTimestamp) {
        this.streamCreationTimestamp = streamCreationTimestamp;
    }

    /**
     * <p>
     * Specify this input parameter to distinguish data streams that have the same name. For example, if you create a
     * data stream and then delete it, and you later create another data stream with the same name, you can use this
     * input parameter to specify which of the two streams you want to list the shards for.
     * </p>
     * <p>
     * You cannot specify this parameter if you specify the <code>NextToken</code> parameter.
     * </p>
     * 
     * @return Specify this input parameter to distinguish data streams that have the same name. For example, if you
     *         create a data stream and then delete it, and you later create another data stream with the same name, you
     *         can use this input parameter to specify which of the two streams you want to list the shards for.</p>
     *         <p>
     *         You cannot specify this parameter if you specify the <code>NextToken</code> parameter.
     */

    public java.util.Date getStreamCreationTimestamp() {
        return this.streamCreationTimestamp;
    }

    /**
     * <p>
     * Specify this input parameter to distinguish data streams that have the same name. For example, if you create a
     * data stream and then delete it, and you later create another data stream with the same name, you can use this
     * input parameter to specify which of the two streams you want to list the shards for.
     * </p>
     * <p>
     * You cannot specify this parameter if you specify the <code>NextToken</code> parameter.
     * </p>
     * 
     * @param streamCreationTimestamp
     *        Specify this input parameter to distinguish data streams that have the same name. For example, if you
     *        create a data stream and then delete it, and you later create another data stream with the same name, you
     *        can use this input parameter to specify which of the two streams you want to list the shards for.</p>
     *        <p>
     *        You cannot specify this parameter if you specify the <code>NextToken</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListShardsRequest withStreamCreationTimestamp(java.util.Date streamCreationTimestamp) {
        setStreamCreationTimestamp(streamCreationTimestamp);
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
        if (getStreamName() != null)
            sb.append("StreamName: ").append(getStreamName()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getExclusiveStartShardId() != null)
            sb.append("ExclusiveStartShardId: ").append(getExclusiveStartShardId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getStreamCreationTimestamp() != null)
            sb.append("StreamCreationTimestamp: ").append(getStreamCreationTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListShardsRequest == false)
            return false;
        ListShardsRequest other = (ListShardsRequest) obj;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getExclusiveStartShardId() == null ^ this.getExclusiveStartShardId() == null)
            return false;
        if (other.getExclusiveStartShardId() != null && other.getExclusiveStartShardId().equals(this.getExclusiveStartShardId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getStreamCreationTimestamp() == null ^ this.getStreamCreationTimestamp() == null)
            return false;
        if (other.getStreamCreationTimestamp() != null && other.getStreamCreationTimestamp().equals(this.getStreamCreationTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getExclusiveStartShardId() == null) ? 0 : getExclusiveStartShardId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getStreamCreationTimestamp() == null) ? 0 : getStreamCreationTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public ListShardsRequest clone() {
        return (ListShardsRequest) super.clone();
    }

}
