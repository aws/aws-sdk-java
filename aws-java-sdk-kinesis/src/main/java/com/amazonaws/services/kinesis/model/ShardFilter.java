/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The request parameter used to filter out the response of the <code>ListShards</code> API.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/ShardFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ShardFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The shard type specified in the <code>ShardFilter</code> parameter. This is a required property of the
     * <code>ShardFilter</code> parameter.
     * </p>
     * <p>
     * You can specify the following valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AFTER_SHARD_ID</code> - the response includes all the shards, starting with the shard whose ID immediately
     * follows the <code>ShardId</code> that you provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AT_TRIM_HORIZON</code> - the response includes all the shards that were open at <code>TRIM_HORIZON</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FROM_TRIM_HORIZON</code> - (default), the response includes all the shards within the retention period of
     * the data stream (trim to tip).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AT_LATEST</code> - the response includes only the currently open shards of the data stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AT_TIMESTAMP</code> - the response includes all shards whose start timestamp is less than or equal to the
     * given timestamp and end timestamp is greater than or equal to the given timestamp or still open.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FROM_TIMESTAMP</code> - the response incldues all closed shards whose end timestamp is greater than or
     * equal to the given timestamp and also all open shards. Corrected to <code>TRIM_HORIZON</code> of the data stream
     * if <code>FROM_TIMESTAMP</code> is less than the <code>TRIM_HORIZON</code> value.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * The exclusive start <code>shardID</code> speified in the <code>ShardFilter</code> parameter. This property can
     * only be used if the <code>AFTER_SHARD_ID</code> shard type is specified.
     * </p>
     */
    private String shardId;
    /**
     * <p>
     * The timestamps specified in the <code>ShardFilter</code> parameter. A timestamp is a Unix epoch date with
     * precision in milliseconds. For example, 2016-04-04T19:58:46.480-00:00 or 1459799926.480. This property can only
     * be used if <code>FROM_TIMESTAMP</code> or <code>AT_TIMESTAMP</code> shard types are specified.
     * </p>
     */
    private java.util.Date timestamp;

    /**
     * <p>
     * The shard type specified in the <code>ShardFilter</code> parameter. This is a required property of the
     * <code>ShardFilter</code> parameter.
     * </p>
     * <p>
     * You can specify the following valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AFTER_SHARD_ID</code> - the response includes all the shards, starting with the shard whose ID immediately
     * follows the <code>ShardId</code> that you provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AT_TRIM_HORIZON</code> - the response includes all the shards that were open at <code>TRIM_HORIZON</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FROM_TRIM_HORIZON</code> - (default), the response includes all the shards within the retention period of
     * the data stream (trim to tip).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AT_LATEST</code> - the response includes only the currently open shards of the data stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AT_TIMESTAMP</code> - the response includes all shards whose start timestamp is less than or equal to the
     * given timestamp and end timestamp is greater than or equal to the given timestamp or still open.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FROM_TIMESTAMP</code> - the response incldues all closed shards whose end timestamp is greater than or
     * equal to the given timestamp and also all open shards. Corrected to <code>TRIM_HORIZON</code> of the data stream
     * if <code>FROM_TIMESTAMP</code> is less than the <code>TRIM_HORIZON</code> value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The shard type specified in the <code>ShardFilter</code> parameter. This is a required property of the
     *        <code>ShardFilter</code> parameter.</p>
     *        <p>
     *        You can specify the following valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AFTER_SHARD_ID</code> - the response includes all the shards, starting with the shard whose ID
     *        immediately follows the <code>ShardId</code> that you provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AT_TRIM_HORIZON</code> - the response includes all the shards that were open at
     *        <code>TRIM_HORIZON</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FROM_TRIM_HORIZON</code> - (default), the response includes all the shards within the retention
     *        period of the data stream (trim to tip).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AT_LATEST</code> - the response includes only the currently open shards of the data stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AT_TIMESTAMP</code> - the response includes all shards whose start timestamp is less than or equal
     *        to the given timestamp and end timestamp is greater than or equal to the given timestamp or still open.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FROM_TIMESTAMP</code> - the response incldues all closed shards whose end timestamp is greater than
     *        or equal to the given timestamp and also all open shards. Corrected to <code>TRIM_HORIZON</code> of the
     *        data stream if <code>FROM_TIMESTAMP</code> is less than the <code>TRIM_HORIZON</code> value.
     *        </p>
     *        </li>
     * @see ShardFilterType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The shard type specified in the <code>ShardFilter</code> parameter. This is a required property of the
     * <code>ShardFilter</code> parameter.
     * </p>
     * <p>
     * You can specify the following valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AFTER_SHARD_ID</code> - the response includes all the shards, starting with the shard whose ID immediately
     * follows the <code>ShardId</code> that you provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AT_TRIM_HORIZON</code> - the response includes all the shards that were open at <code>TRIM_HORIZON</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FROM_TRIM_HORIZON</code> - (default), the response includes all the shards within the retention period of
     * the data stream (trim to tip).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AT_LATEST</code> - the response includes only the currently open shards of the data stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AT_TIMESTAMP</code> - the response includes all shards whose start timestamp is less than or equal to the
     * given timestamp and end timestamp is greater than or equal to the given timestamp or still open.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FROM_TIMESTAMP</code> - the response incldues all closed shards whose end timestamp is greater than or
     * equal to the given timestamp and also all open shards. Corrected to <code>TRIM_HORIZON</code> of the data stream
     * if <code>FROM_TIMESTAMP</code> is less than the <code>TRIM_HORIZON</code> value.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The shard type specified in the <code>ShardFilter</code> parameter. This is a required property of the
     *         <code>ShardFilter</code> parameter.</p>
     *         <p>
     *         You can specify the following valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AFTER_SHARD_ID</code> - the response includes all the shards, starting with the shard whose ID
     *         immediately follows the <code>ShardId</code> that you provided.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AT_TRIM_HORIZON</code> - the response includes all the shards that were open at
     *         <code>TRIM_HORIZON</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FROM_TRIM_HORIZON</code> - (default), the response includes all the shards within the retention
     *         period of the data stream (trim to tip).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AT_LATEST</code> - the response includes only the currently open shards of the data stream.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AT_TIMESTAMP</code> - the response includes all shards whose start timestamp is less than or equal
     *         to the given timestamp and end timestamp is greater than or equal to the given timestamp or still open.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FROM_TIMESTAMP</code> - the response incldues all closed shards whose end timestamp is greater than
     *         or equal to the given timestamp and also all open shards. Corrected to <code>TRIM_HORIZON</code> of the
     *         data stream if <code>FROM_TIMESTAMP</code> is less than the <code>TRIM_HORIZON</code> value.
     *         </p>
     *         </li>
     * @see ShardFilterType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The shard type specified in the <code>ShardFilter</code> parameter. This is a required property of the
     * <code>ShardFilter</code> parameter.
     * </p>
     * <p>
     * You can specify the following valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AFTER_SHARD_ID</code> - the response includes all the shards, starting with the shard whose ID immediately
     * follows the <code>ShardId</code> that you provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AT_TRIM_HORIZON</code> - the response includes all the shards that were open at <code>TRIM_HORIZON</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FROM_TRIM_HORIZON</code> - (default), the response includes all the shards within the retention period of
     * the data stream (trim to tip).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AT_LATEST</code> - the response includes only the currently open shards of the data stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AT_TIMESTAMP</code> - the response includes all shards whose start timestamp is less than or equal to the
     * given timestamp and end timestamp is greater than or equal to the given timestamp or still open.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FROM_TIMESTAMP</code> - the response incldues all closed shards whose end timestamp is greater than or
     * equal to the given timestamp and also all open shards. Corrected to <code>TRIM_HORIZON</code> of the data stream
     * if <code>FROM_TIMESTAMP</code> is less than the <code>TRIM_HORIZON</code> value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The shard type specified in the <code>ShardFilter</code> parameter. This is a required property of the
     *        <code>ShardFilter</code> parameter.</p>
     *        <p>
     *        You can specify the following valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AFTER_SHARD_ID</code> - the response includes all the shards, starting with the shard whose ID
     *        immediately follows the <code>ShardId</code> that you provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AT_TRIM_HORIZON</code> - the response includes all the shards that were open at
     *        <code>TRIM_HORIZON</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FROM_TRIM_HORIZON</code> - (default), the response includes all the shards within the retention
     *        period of the data stream (trim to tip).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AT_LATEST</code> - the response includes only the currently open shards of the data stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AT_TIMESTAMP</code> - the response includes all shards whose start timestamp is less than or equal
     *        to the given timestamp and end timestamp is greater than or equal to the given timestamp or still open.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FROM_TIMESTAMP</code> - the response incldues all closed shards whose end timestamp is greater than
     *        or equal to the given timestamp and also all open shards. Corrected to <code>TRIM_HORIZON</code> of the
     *        data stream if <code>FROM_TIMESTAMP</code> is less than the <code>TRIM_HORIZON</code> value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShardFilterType
     */

    public ShardFilter withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The shard type specified in the <code>ShardFilter</code> parameter. This is a required property of the
     * <code>ShardFilter</code> parameter.
     * </p>
     * <p>
     * You can specify the following valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AFTER_SHARD_ID</code> - the response includes all the shards, starting with the shard whose ID immediately
     * follows the <code>ShardId</code> that you provided.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AT_TRIM_HORIZON</code> - the response includes all the shards that were open at <code>TRIM_HORIZON</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FROM_TRIM_HORIZON</code> - (default), the response includes all the shards within the retention period of
     * the data stream (trim to tip).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AT_LATEST</code> - the response includes only the currently open shards of the data stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AT_TIMESTAMP</code> - the response includes all shards whose start timestamp is less than or equal to the
     * given timestamp and end timestamp is greater than or equal to the given timestamp or still open.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FROM_TIMESTAMP</code> - the response incldues all closed shards whose end timestamp is greater than or
     * equal to the given timestamp and also all open shards. Corrected to <code>TRIM_HORIZON</code> of the data stream
     * if <code>FROM_TIMESTAMP</code> is less than the <code>TRIM_HORIZON</code> value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The shard type specified in the <code>ShardFilter</code> parameter. This is a required property of the
     *        <code>ShardFilter</code> parameter.</p>
     *        <p>
     *        You can specify the following valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AFTER_SHARD_ID</code> - the response includes all the shards, starting with the shard whose ID
     *        immediately follows the <code>ShardId</code> that you provided.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AT_TRIM_HORIZON</code> - the response includes all the shards that were open at
     *        <code>TRIM_HORIZON</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FROM_TRIM_HORIZON</code> - (default), the response includes all the shards within the retention
     *        period of the data stream (trim to tip).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AT_LATEST</code> - the response includes only the currently open shards of the data stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AT_TIMESTAMP</code> - the response includes all shards whose start timestamp is less than or equal
     *        to the given timestamp and end timestamp is greater than or equal to the given timestamp or still open.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FROM_TIMESTAMP</code> - the response incldues all closed shards whose end timestamp is greater than
     *        or equal to the given timestamp and also all open shards. Corrected to <code>TRIM_HORIZON</code> of the
     *        data stream if <code>FROM_TIMESTAMP</code> is less than the <code>TRIM_HORIZON</code> value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShardFilterType
     */

    public ShardFilter withType(ShardFilterType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The exclusive start <code>shardID</code> speified in the <code>ShardFilter</code> parameter. This property can
     * only be used if the <code>AFTER_SHARD_ID</code> shard type is specified.
     * </p>
     * 
     * @param shardId
     *        The exclusive start <code>shardID</code> speified in the <code>ShardFilter</code> parameter. This property
     *        can only be used if the <code>AFTER_SHARD_ID</code> shard type is specified.
     */

    public void setShardId(String shardId) {
        this.shardId = shardId;
    }

    /**
     * <p>
     * The exclusive start <code>shardID</code> speified in the <code>ShardFilter</code> parameter. This property can
     * only be used if the <code>AFTER_SHARD_ID</code> shard type is specified.
     * </p>
     * 
     * @return The exclusive start <code>shardID</code> speified in the <code>ShardFilter</code> parameter. This
     *         property can only be used if the <code>AFTER_SHARD_ID</code> shard type is specified.
     */

    public String getShardId() {
        return this.shardId;
    }

    /**
     * <p>
     * The exclusive start <code>shardID</code> speified in the <code>ShardFilter</code> parameter. This property can
     * only be used if the <code>AFTER_SHARD_ID</code> shard type is specified.
     * </p>
     * 
     * @param shardId
     *        The exclusive start <code>shardID</code> speified in the <code>ShardFilter</code> parameter. This property
     *        can only be used if the <code>AFTER_SHARD_ID</code> shard type is specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShardFilter withShardId(String shardId) {
        setShardId(shardId);
        return this;
    }

    /**
     * <p>
     * The timestamps specified in the <code>ShardFilter</code> parameter. A timestamp is a Unix epoch date with
     * precision in milliseconds. For example, 2016-04-04T19:58:46.480-00:00 or 1459799926.480. This property can only
     * be used if <code>FROM_TIMESTAMP</code> or <code>AT_TIMESTAMP</code> shard types are specified.
     * </p>
     * 
     * @param timestamp
     *        The timestamps specified in the <code>ShardFilter</code> parameter. A timestamp is a Unix epoch date with
     *        precision in milliseconds. For example, 2016-04-04T19:58:46.480-00:00 or 1459799926.480. This property can
     *        only be used if <code>FROM_TIMESTAMP</code> or <code>AT_TIMESTAMP</code> shard types are specified.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The timestamps specified in the <code>ShardFilter</code> parameter. A timestamp is a Unix epoch date with
     * precision in milliseconds. For example, 2016-04-04T19:58:46.480-00:00 or 1459799926.480. This property can only
     * be used if <code>FROM_TIMESTAMP</code> or <code>AT_TIMESTAMP</code> shard types are specified.
     * </p>
     * 
     * @return The timestamps specified in the <code>ShardFilter</code> parameter. A timestamp is a Unix epoch date with
     *         precision in milliseconds. For example, 2016-04-04T19:58:46.480-00:00 or 1459799926.480. This property
     *         can only be used if <code>FROM_TIMESTAMP</code> or <code>AT_TIMESTAMP</code> shard types are specified.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The timestamps specified in the <code>ShardFilter</code> parameter. A timestamp is a Unix epoch date with
     * precision in milliseconds. For example, 2016-04-04T19:58:46.480-00:00 or 1459799926.480. This property can only
     * be used if <code>FROM_TIMESTAMP</code> or <code>AT_TIMESTAMP</code> shard types are specified.
     * </p>
     * 
     * @param timestamp
     *        The timestamps specified in the <code>ShardFilter</code> parameter. A timestamp is a Unix epoch date with
     *        precision in milliseconds. For example, 2016-04-04T19:58:46.480-00:00 or 1459799926.480. This property can
     *        only be used if <code>FROM_TIMESTAMP</code> or <code>AT_TIMESTAMP</code> shard types are specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShardFilter withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getShardId() != null)
            sb.append("ShardId: ").append(getShardId()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ShardFilter == false)
            return false;
        ShardFilter other = (ShardFilter) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getShardId() == null ^ this.getShardId() == null)
            return false;
        if (other.getShardId() != null && other.getShardId().equals(this.getShardId()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getShardId() == null) ? 0 : getShardId().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public ShardFilter clone() {
        try {
            return (ShardFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesis.model.transform.ShardFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
