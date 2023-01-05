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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/DescribeLimits" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLimitsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of shards.
     * </p>
     */
    private Integer shardLimit;
    /**
     * <p>
     * The number of open shards.
     * </p>
     */
    private Integer openShardCount;
    /**
     * <p>
     * Indicates the number of data streams with the on-demand capacity mode.
     * </p>
     */
    private Integer onDemandStreamCount;
    /**
     * <p>
     * The maximum number of data streams with the on-demand capacity mode.
     * </p>
     */
    private Integer onDemandStreamCountLimit;

    /**
     * <p>
     * The maximum number of shards.
     * </p>
     * 
     * @param shardLimit
     *        The maximum number of shards.
     */

    public void setShardLimit(Integer shardLimit) {
        this.shardLimit = shardLimit;
    }

    /**
     * <p>
     * The maximum number of shards.
     * </p>
     * 
     * @return The maximum number of shards.
     */

    public Integer getShardLimit() {
        return this.shardLimit;
    }

    /**
     * <p>
     * The maximum number of shards.
     * </p>
     * 
     * @param shardLimit
     *        The maximum number of shards.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLimitsResult withShardLimit(Integer shardLimit) {
        setShardLimit(shardLimit);
        return this;
    }

    /**
     * <p>
     * The number of open shards.
     * </p>
     * 
     * @param openShardCount
     *        The number of open shards.
     */

    public void setOpenShardCount(Integer openShardCount) {
        this.openShardCount = openShardCount;
    }

    /**
     * <p>
     * The number of open shards.
     * </p>
     * 
     * @return The number of open shards.
     */

    public Integer getOpenShardCount() {
        return this.openShardCount;
    }

    /**
     * <p>
     * The number of open shards.
     * </p>
     * 
     * @param openShardCount
     *        The number of open shards.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLimitsResult withOpenShardCount(Integer openShardCount) {
        setOpenShardCount(openShardCount);
        return this;
    }

    /**
     * <p>
     * Indicates the number of data streams with the on-demand capacity mode.
     * </p>
     * 
     * @param onDemandStreamCount
     *        Indicates the number of data streams with the on-demand capacity mode.
     */

    public void setOnDemandStreamCount(Integer onDemandStreamCount) {
        this.onDemandStreamCount = onDemandStreamCount;
    }

    /**
     * <p>
     * Indicates the number of data streams with the on-demand capacity mode.
     * </p>
     * 
     * @return Indicates the number of data streams with the on-demand capacity mode.
     */

    public Integer getOnDemandStreamCount() {
        return this.onDemandStreamCount;
    }

    /**
     * <p>
     * Indicates the number of data streams with the on-demand capacity mode.
     * </p>
     * 
     * @param onDemandStreamCount
     *        Indicates the number of data streams with the on-demand capacity mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLimitsResult withOnDemandStreamCount(Integer onDemandStreamCount) {
        setOnDemandStreamCount(onDemandStreamCount);
        return this;
    }

    /**
     * <p>
     * The maximum number of data streams with the on-demand capacity mode.
     * </p>
     * 
     * @param onDemandStreamCountLimit
     *        The maximum number of data streams with the on-demand capacity mode.
     */

    public void setOnDemandStreamCountLimit(Integer onDemandStreamCountLimit) {
        this.onDemandStreamCountLimit = onDemandStreamCountLimit;
    }

    /**
     * <p>
     * The maximum number of data streams with the on-demand capacity mode.
     * </p>
     * 
     * @return The maximum number of data streams with the on-demand capacity mode.
     */

    public Integer getOnDemandStreamCountLimit() {
        return this.onDemandStreamCountLimit;
    }

    /**
     * <p>
     * The maximum number of data streams with the on-demand capacity mode.
     * </p>
     * 
     * @param onDemandStreamCountLimit
     *        The maximum number of data streams with the on-demand capacity mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLimitsResult withOnDemandStreamCountLimit(Integer onDemandStreamCountLimit) {
        setOnDemandStreamCountLimit(onDemandStreamCountLimit);
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
        if (getShardLimit() != null)
            sb.append("ShardLimit: ").append(getShardLimit()).append(",");
        if (getOpenShardCount() != null)
            sb.append("OpenShardCount: ").append(getOpenShardCount()).append(",");
        if (getOnDemandStreamCount() != null)
            sb.append("OnDemandStreamCount: ").append(getOnDemandStreamCount()).append(",");
        if (getOnDemandStreamCountLimit() != null)
            sb.append("OnDemandStreamCountLimit: ").append(getOnDemandStreamCountLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLimitsResult == false)
            return false;
        DescribeLimitsResult other = (DescribeLimitsResult) obj;
        if (other.getShardLimit() == null ^ this.getShardLimit() == null)
            return false;
        if (other.getShardLimit() != null && other.getShardLimit().equals(this.getShardLimit()) == false)
            return false;
        if (other.getOpenShardCount() == null ^ this.getOpenShardCount() == null)
            return false;
        if (other.getOpenShardCount() != null && other.getOpenShardCount().equals(this.getOpenShardCount()) == false)
            return false;
        if (other.getOnDemandStreamCount() == null ^ this.getOnDemandStreamCount() == null)
            return false;
        if (other.getOnDemandStreamCount() != null && other.getOnDemandStreamCount().equals(this.getOnDemandStreamCount()) == false)
            return false;
        if (other.getOnDemandStreamCountLimit() == null ^ this.getOnDemandStreamCountLimit() == null)
            return false;
        if (other.getOnDemandStreamCountLimit() != null && other.getOnDemandStreamCountLimit().equals(this.getOnDemandStreamCountLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getShardLimit() == null) ? 0 : getShardLimit().hashCode());
        hashCode = prime * hashCode + ((getOpenShardCount() == null) ? 0 : getOpenShardCount().hashCode());
        hashCode = prime * hashCode + ((getOnDemandStreamCount() == null) ? 0 : getOnDemandStreamCount().hashCode());
        hashCode = prime * hashCode + ((getOnDemandStreamCountLimit() == null) ? 0 : getOnDemandStreamCountLimit().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLimitsResult clone() {
        try {
            return (DescribeLimitsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
