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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribePools"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePoolsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of PoolInformation objects that contain the details for the requested pools.
     * </p>
     */
    private java.util.List<PoolInformation> pools;
    /**
     * <p>
     * The token to be used for the next set of paginated results. If this field is empty then there are no more
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of PoolInformation objects that contain the details for the requested pools.
     * </p>
     * 
     * @return An array of PoolInformation objects that contain the details for the requested pools.
     */

    public java.util.List<PoolInformation> getPools() {
        return pools;
    }

    /**
     * <p>
     * An array of PoolInformation objects that contain the details for the requested pools.
     * </p>
     * 
     * @param pools
     *        An array of PoolInformation objects that contain the details for the requested pools.
     */

    public void setPools(java.util.Collection<PoolInformation> pools) {
        if (pools == null) {
            this.pools = null;
            return;
        }

        this.pools = new java.util.ArrayList<PoolInformation>(pools);
    }

    /**
     * <p>
     * An array of PoolInformation objects that contain the details for the requested pools.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPools(java.util.Collection)} or {@link #withPools(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param pools
     *        An array of PoolInformation objects that contain the details for the requested pools.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePoolsResult withPools(PoolInformation... pools) {
        if (this.pools == null) {
            setPools(new java.util.ArrayList<PoolInformation>(pools.length));
        }
        for (PoolInformation ele : pools) {
            this.pools.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of PoolInformation objects that contain the details for the requested pools.
     * </p>
     * 
     * @param pools
     *        An array of PoolInformation objects that contain the details for the requested pools.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePoolsResult withPools(java.util.Collection<PoolInformation> pools) {
        setPools(pools);
        return this;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results. If this field is empty then there are no more
     * results.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results. If this field is empty then there are no more
     *        results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results. If this field is empty then there are no more
     * results.
     * </p>
     * 
     * @return The token to be used for the next set of paginated results. If this field is empty then there are no more
     *         results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results. If this field is empty then there are no more
     * results.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results. If this field is empty then there are no more
     *        results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePoolsResult withNextToken(String nextToken) {
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
        if (getPools() != null)
            sb.append("Pools: ").append(getPools()).append(",");
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

        if (obj instanceof DescribePoolsResult == false)
            return false;
        DescribePoolsResult other = (DescribePoolsResult) obj;
        if (other.getPools() == null ^ this.getPools() == null)
            return false;
        if (other.getPools() != null && other.getPools().equals(this.getPools()) == false)
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

        hashCode = prime * hashCode + ((getPools() == null) ? 0 : getPools().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribePoolsResult clone() {
        try {
            return (DescribePoolsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
