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
package com.amazonaws.services.pi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/DescribeDimensionKeys" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDimensionKeysResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The start time for the returned dimension keys, after alignment to a granular boundary (as specified by
     * <code>PeriodInSeconds</code>). <code>AlignedStartTime</code> will be less than or equal to the value of the
     * user-specified <code>StartTime</code>.
     * </p>
     */
    private java.util.Date alignedStartTime;
    /**
     * <p>
     * The end time for the returned dimension keys, after alignment to a granular boundary (as specified by
     * <code>PeriodInSeconds</code>). <code>AlignedEndTime</code> will be greater than or equal to the value of the
     * user-specified <code>Endtime</code>.
     * </p>
     */
    private java.util.Date alignedEndTime;
    /**
     * <p>
     * If <code>PartitionBy</code> was present in the request, <code>PartitionKeys</code> contains the breakdown of
     * dimension keys by the specified partitions.
     * </p>
     */
    private java.util.List<ResponsePartitionKey> partitionKeys;
    /**
     * <p>
     * The dimension keys that were requested.
     * </p>
     */
    private java.util.List<DimensionKeyDescription> keys;
    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the token, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The start time for the returned dimension keys, after alignment to a granular boundary (as specified by
     * <code>PeriodInSeconds</code>). <code>AlignedStartTime</code> will be less than or equal to the value of the
     * user-specified <code>StartTime</code>.
     * </p>
     * 
     * @param alignedStartTime
     *        The start time for the returned dimension keys, after alignment to a granular boundary (as specified by
     *        <code>PeriodInSeconds</code>). <code>AlignedStartTime</code> will be less than or equal to the value of
     *        the user-specified <code>StartTime</code>.
     */

    public void setAlignedStartTime(java.util.Date alignedStartTime) {
        this.alignedStartTime = alignedStartTime;
    }

    /**
     * <p>
     * The start time for the returned dimension keys, after alignment to a granular boundary (as specified by
     * <code>PeriodInSeconds</code>). <code>AlignedStartTime</code> will be less than or equal to the value of the
     * user-specified <code>StartTime</code>.
     * </p>
     * 
     * @return The start time for the returned dimension keys, after alignment to a granular boundary (as specified by
     *         <code>PeriodInSeconds</code>). <code>AlignedStartTime</code> will be less than or equal to the value of
     *         the user-specified <code>StartTime</code>.
     */

    public java.util.Date getAlignedStartTime() {
        return this.alignedStartTime;
    }

    /**
     * <p>
     * The start time for the returned dimension keys, after alignment to a granular boundary (as specified by
     * <code>PeriodInSeconds</code>). <code>AlignedStartTime</code> will be less than or equal to the value of the
     * user-specified <code>StartTime</code>.
     * </p>
     * 
     * @param alignedStartTime
     *        The start time for the returned dimension keys, after alignment to a granular boundary (as specified by
     *        <code>PeriodInSeconds</code>). <code>AlignedStartTime</code> will be less than or equal to the value of
     *        the user-specified <code>StartTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDimensionKeysResult withAlignedStartTime(java.util.Date alignedStartTime) {
        setAlignedStartTime(alignedStartTime);
        return this;
    }

    /**
     * <p>
     * The end time for the returned dimension keys, after alignment to a granular boundary (as specified by
     * <code>PeriodInSeconds</code>). <code>AlignedEndTime</code> will be greater than or equal to the value of the
     * user-specified <code>Endtime</code>.
     * </p>
     * 
     * @param alignedEndTime
     *        The end time for the returned dimension keys, after alignment to a granular boundary (as specified by
     *        <code>PeriodInSeconds</code>). <code>AlignedEndTime</code> will be greater than or equal to the value of
     *        the user-specified <code>Endtime</code>.
     */

    public void setAlignedEndTime(java.util.Date alignedEndTime) {
        this.alignedEndTime = alignedEndTime;
    }

    /**
     * <p>
     * The end time for the returned dimension keys, after alignment to a granular boundary (as specified by
     * <code>PeriodInSeconds</code>). <code>AlignedEndTime</code> will be greater than or equal to the value of the
     * user-specified <code>Endtime</code>.
     * </p>
     * 
     * @return The end time for the returned dimension keys, after alignment to a granular boundary (as specified by
     *         <code>PeriodInSeconds</code>). <code>AlignedEndTime</code> will be greater than or equal to the value of
     *         the user-specified <code>Endtime</code>.
     */

    public java.util.Date getAlignedEndTime() {
        return this.alignedEndTime;
    }

    /**
     * <p>
     * The end time for the returned dimension keys, after alignment to a granular boundary (as specified by
     * <code>PeriodInSeconds</code>). <code>AlignedEndTime</code> will be greater than or equal to the value of the
     * user-specified <code>Endtime</code>.
     * </p>
     * 
     * @param alignedEndTime
     *        The end time for the returned dimension keys, after alignment to a granular boundary (as specified by
     *        <code>PeriodInSeconds</code>). <code>AlignedEndTime</code> will be greater than or equal to the value of
     *        the user-specified <code>Endtime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDimensionKeysResult withAlignedEndTime(java.util.Date alignedEndTime) {
        setAlignedEndTime(alignedEndTime);
        return this;
    }

    /**
     * <p>
     * If <code>PartitionBy</code> was present in the request, <code>PartitionKeys</code> contains the breakdown of
     * dimension keys by the specified partitions.
     * </p>
     * 
     * @return If <code>PartitionBy</code> was present in the request, <code>PartitionKeys</code> contains the breakdown
     *         of dimension keys by the specified partitions.
     */

    public java.util.List<ResponsePartitionKey> getPartitionKeys() {
        return partitionKeys;
    }

    /**
     * <p>
     * If <code>PartitionBy</code> was present in the request, <code>PartitionKeys</code> contains the breakdown of
     * dimension keys by the specified partitions.
     * </p>
     * 
     * @param partitionKeys
     *        If <code>PartitionBy</code> was present in the request, <code>PartitionKeys</code> contains the breakdown
     *        of dimension keys by the specified partitions.
     */

    public void setPartitionKeys(java.util.Collection<ResponsePartitionKey> partitionKeys) {
        if (partitionKeys == null) {
            this.partitionKeys = null;
            return;
        }

        this.partitionKeys = new java.util.ArrayList<ResponsePartitionKey>(partitionKeys);
    }

    /**
     * <p>
     * If <code>PartitionBy</code> was present in the request, <code>PartitionKeys</code> contains the breakdown of
     * dimension keys by the specified partitions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPartitionKeys(java.util.Collection)} or {@link #withPartitionKeys(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param partitionKeys
     *        If <code>PartitionBy</code> was present in the request, <code>PartitionKeys</code> contains the breakdown
     *        of dimension keys by the specified partitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDimensionKeysResult withPartitionKeys(ResponsePartitionKey... partitionKeys) {
        if (this.partitionKeys == null) {
            setPartitionKeys(new java.util.ArrayList<ResponsePartitionKey>(partitionKeys.length));
        }
        for (ResponsePartitionKey ele : partitionKeys) {
            this.partitionKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If <code>PartitionBy</code> was present in the request, <code>PartitionKeys</code> contains the breakdown of
     * dimension keys by the specified partitions.
     * </p>
     * 
     * @param partitionKeys
     *        If <code>PartitionBy</code> was present in the request, <code>PartitionKeys</code> contains the breakdown
     *        of dimension keys by the specified partitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDimensionKeysResult withPartitionKeys(java.util.Collection<ResponsePartitionKey> partitionKeys) {
        setPartitionKeys(partitionKeys);
        return this;
    }

    /**
     * <p>
     * The dimension keys that were requested.
     * </p>
     * 
     * @return The dimension keys that were requested.
     */

    public java.util.List<DimensionKeyDescription> getKeys() {
        return keys;
    }

    /**
     * <p>
     * The dimension keys that were requested.
     * </p>
     * 
     * @param keys
     *        The dimension keys that were requested.
     */

    public void setKeys(java.util.Collection<DimensionKeyDescription> keys) {
        if (keys == null) {
            this.keys = null;
            return;
        }

        this.keys = new java.util.ArrayList<DimensionKeyDescription>(keys);
    }

    /**
     * <p>
     * The dimension keys that were requested.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeys(java.util.Collection)} or {@link #withKeys(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param keys
     *        The dimension keys that were requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDimensionKeysResult withKeys(DimensionKeyDescription... keys) {
        if (this.keys == null) {
            setKeys(new java.util.ArrayList<DimensionKeyDescription>(keys.length));
        }
        for (DimensionKeyDescription ele : keys) {
            this.keys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The dimension keys that were requested.
     * </p>
     * 
     * @param keys
     *        The dimension keys that were requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDimensionKeysResult withKeys(java.util.Collection<DimensionKeyDescription> keys) {
        setKeys(keys);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the token, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param nextToken
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the token, up to the value specified by <code>MaxRecords</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the token, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous request. If this parameter is specified, the response
     *         includes only records beyond the token, up to the value specified by <code>MaxRecords</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the token, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param nextToken
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the token, up to the value specified by <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDimensionKeysResult withNextToken(String nextToken) {
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
        if (getAlignedStartTime() != null)
            sb.append("AlignedStartTime: ").append(getAlignedStartTime()).append(",");
        if (getAlignedEndTime() != null)
            sb.append("AlignedEndTime: ").append(getAlignedEndTime()).append(",");
        if (getPartitionKeys() != null)
            sb.append("PartitionKeys: ").append(getPartitionKeys()).append(",");
        if (getKeys() != null)
            sb.append("Keys: ").append(getKeys()).append(",");
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

        if (obj instanceof DescribeDimensionKeysResult == false)
            return false;
        DescribeDimensionKeysResult other = (DescribeDimensionKeysResult) obj;
        if (other.getAlignedStartTime() == null ^ this.getAlignedStartTime() == null)
            return false;
        if (other.getAlignedStartTime() != null && other.getAlignedStartTime().equals(this.getAlignedStartTime()) == false)
            return false;
        if (other.getAlignedEndTime() == null ^ this.getAlignedEndTime() == null)
            return false;
        if (other.getAlignedEndTime() != null && other.getAlignedEndTime().equals(this.getAlignedEndTime()) == false)
            return false;
        if (other.getPartitionKeys() == null ^ this.getPartitionKeys() == null)
            return false;
        if (other.getPartitionKeys() != null && other.getPartitionKeys().equals(this.getPartitionKeys()) == false)
            return false;
        if (other.getKeys() == null ^ this.getKeys() == null)
            return false;
        if (other.getKeys() != null && other.getKeys().equals(this.getKeys()) == false)
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

        hashCode = prime * hashCode + ((getAlignedStartTime() == null) ? 0 : getAlignedStartTime().hashCode());
        hashCode = prime * hashCode + ((getAlignedEndTime() == null) ? 0 : getAlignedEndTime().hashCode());
        hashCode = prime * hashCode + ((getPartitionKeys() == null) ? 0 : getPartitionKeys().hashCode());
        hashCode = prime * hashCode + ((getKeys() == null) ? 0 : getKeys().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDimensionKeysResult clone() {
        try {
            return (DescribeDimensionKeysResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
