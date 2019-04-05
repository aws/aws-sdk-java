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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/ListShards" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListShardsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of JSON objects. Each object represents one shard and specifies the IDs of the shard, the shard's
     * parent, and the shard that's adjacent to the shard's parent. Each object also contains the starting and ending
     * hash keys and the starting and ending sequence numbers for the shard.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Shard> shards;
    /**
     * <p>
     * When the number of shards in the data stream is greater than the default value for the <code>MaxResults</code>
     * parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number of
     * shards in the data stream, the response includes a pagination token named <code>NextToken</code>. You can specify
     * this <code>NextToken</code> value in a subsequent call to <code>ListShards</code> to list the next set of shards.
     * For more information about the use of this pagination token when calling the <code>ListShards</code> operation,
     * see <a>ListShardsInput$NextToken</a>.
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
     * An array of JSON objects. Each object represents one shard and specifies the IDs of the shard, the shard's
     * parent, and the shard that's adjacent to the shard's parent. Each object also contains the starting and ending
     * hash keys and the starting and ending sequence numbers for the shard.
     * </p>
     * 
     * @return An array of JSON objects. Each object represents one shard and specifies the IDs of the shard, the
     *         shard's parent, and the shard that's adjacent to the shard's parent. Each object also contains the
     *         starting and ending hash keys and the starting and ending sequence numbers for the shard.
     */

    public java.util.List<Shard> getShards() {
        if (shards == null) {
            shards = new com.amazonaws.internal.SdkInternalList<Shard>();
        }
        return shards;
    }

    /**
     * <p>
     * An array of JSON objects. Each object represents one shard and specifies the IDs of the shard, the shard's
     * parent, and the shard that's adjacent to the shard's parent. Each object also contains the starting and ending
     * hash keys and the starting and ending sequence numbers for the shard.
     * </p>
     * 
     * @param shards
     *        An array of JSON objects. Each object represents one shard and specifies the IDs of the shard, the shard's
     *        parent, and the shard that's adjacent to the shard's parent. Each object also contains the starting and
     *        ending hash keys and the starting and ending sequence numbers for the shard.
     */

    public void setShards(java.util.Collection<Shard> shards) {
        if (shards == null) {
            this.shards = null;
            return;
        }

        this.shards = new com.amazonaws.internal.SdkInternalList<Shard>(shards);
    }

    /**
     * <p>
     * An array of JSON objects. Each object represents one shard and specifies the IDs of the shard, the shard's
     * parent, and the shard that's adjacent to the shard's parent. Each object also contains the starting and ending
     * hash keys and the starting and ending sequence numbers for the shard.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setShards(java.util.Collection)} or {@link #withShards(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param shards
     *        An array of JSON objects. Each object represents one shard and specifies the IDs of the shard, the shard's
     *        parent, and the shard that's adjacent to the shard's parent. Each object also contains the starting and
     *        ending hash keys and the starting and ending sequence numbers for the shard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListShardsResult withShards(Shard... shards) {
        if (this.shards == null) {
            setShards(new com.amazonaws.internal.SdkInternalList<Shard>(shards.length));
        }
        for (Shard ele : shards) {
            this.shards.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of JSON objects. Each object represents one shard and specifies the IDs of the shard, the shard's
     * parent, and the shard that's adjacent to the shard's parent. Each object also contains the starting and ending
     * hash keys and the starting and ending sequence numbers for the shard.
     * </p>
     * 
     * @param shards
     *        An array of JSON objects. Each object represents one shard and specifies the IDs of the shard, the shard's
     *        parent, and the shard that's adjacent to the shard's parent. Each object also contains the starting and
     *        ending hash keys and the starting and ending sequence numbers for the shard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListShardsResult withShards(java.util.Collection<Shard> shards) {
        setShards(shards);
        return this;
    }

    /**
     * <p>
     * When the number of shards in the data stream is greater than the default value for the <code>MaxResults</code>
     * parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number of
     * shards in the data stream, the response includes a pagination token named <code>NextToken</code>. You can specify
     * this <code>NextToken</code> value in a subsequent call to <code>ListShards</code> to list the next set of shards.
     * For more information about the use of this pagination token when calling the <code>ListShards</code> operation,
     * see <a>ListShardsInput$NextToken</a>.
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
     *        <code>ListShards</code> to list the next set of shards. For more information about the use of this
     *        pagination token when calling the <code>ListShards</code> operation, see
     *        <a>ListShardsInput$NextToken</a>.</p> <important>
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
     * For more information about the use of this pagination token when calling the <code>ListShards</code> operation,
     * see <a>ListShardsInput$NextToken</a>.
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
     *         <code>ListShards</code> to list the next set of shards. For more information about the use of this
     *         pagination token when calling the <code>ListShards</code> operation, see
     *         <a>ListShardsInput$NextToken</a>.</p> <important>
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
     * For more information about the use of this pagination token when calling the <code>ListShards</code> operation,
     * see <a>ListShardsInput$NextToken</a>.
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
     *        <code>ListShards</code> to list the next set of shards. For more information about the use of this
     *        pagination token when calling the <code>ListShards</code> operation, see
     *        <a>ListShardsInput$NextToken</a>.</p> <important>
     *        <p>
     *        Tokens expire after 300 seconds. When you obtain a value for <code>NextToken</code> in the response to a
     *        call to <code>ListShards</code>, you have 300 seconds to use that value. If you specify an expired token
     *        in a call to <code>ListShards</code>, you get <code>ExpiredNextTokenException</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListShardsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getShards() != null)
            sb.append("Shards: ").append(getShards()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListShardsResult == false)
            return false;
        ListShardsResult other = (ListShardsResult) obj;
        if (other.getShards() == null ^ this.getShards() == null)
            return false;
        if (other.getShards() != null && other.getShards().equals(this.getShards()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getShards() == null) ? 0 : getShards().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListShardsResult clone() {
        try {
            return (ListShardsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
