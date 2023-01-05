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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/ListPoolOriginationIdentities"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPoolOriginationIdentitiesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the pool.
     * </p>
     */
    private String poolArn;
    /**
     * <p>
     * The unique PoolId of the pool.
     * </p>
     */
    private String poolId;
    /**
     * <p>
     * An array of any OriginationIdentityMetadata objects.
     * </p>
     */
    private java.util.List<OriginationIdentityMetadata> originationIdentities;
    /**
     * <p>
     * The token to be used for the next set of paginated results. If this field is empty then there are no more
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the pool.
     * </p>
     * 
     * @param poolArn
     *        The Amazon Resource Name (ARN) for the pool.
     */

    public void setPoolArn(String poolArn) {
        this.poolArn = poolArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the pool.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the pool.
     */

    public String getPoolArn() {
        return this.poolArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the pool.
     * </p>
     * 
     * @param poolArn
     *        The Amazon Resource Name (ARN) for the pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPoolOriginationIdentitiesResult withPoolArn(String poolArn) {
        setPoolArn(poolArn);
        return this;
    }

    /**
     * <p>
     * The unique PoolId of the pool.
     * </p>
     * 
     * @param poolId
     *        The unique PoolId of the pool.
     */

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    /**
     * <p>
     * The unique PoolId of the pool.
     * </p>
     * 
     * @return The unique PoolId of the pool.
     */

    public String getPoolId() {
        return this.poolId;
    }

    /**
     * <p>
     * The unique PoolId of the pool.
     * </p>
     * 
     * @param poolId
     *        The unique PoolId of the pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPoolOriginationIdentitiesResult withPoolId(String poolId) {
        setPoolId(poolId);
        return this;
    }

    /**
     * <p>
     * An array of any OriginationIdentityMetadata objects.
     * </p>
     * 
     * @return An array of any OriginationIdentityMetadata objects.
     */

    public java.util.List<OriginationIdentityMetadata> getOriginationIdentities() {
        return originationIdentities;
    }

    /**
     * <p>
     * An array of any OriginationIdentityMetadata objects.
     * </p>
     * 
     * @param originationIdentities
     *        An array of any OriginationIdentityMetadata objects.
     */

    public void setOriginationIdentities(java.util.Collection<OriginationIdentityMetadata> originationIdentities) {
        if (originationIdentities == null) {
            this.originationIdentities = null;
            return;
        }

        this.originationIdentities = new java.util.ArrayList<OriginationIdentityMetadata>(originationIdentities);
    }

    /**
     * <p>
     * An array of any OriginationIdentityMetadata objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOriginationIdentities(java.util.Collection)} or
     * {@link #withOriginationIdentities(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param originationIdentities
     *        An array of any OriginationIdentityMetadata objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPoolOriginationIdentitiesResult withOriginationIdentities(OriginationIdentityMetadata... originationIdentities) {
        if (this.originationIdentities == null) {
            setOriginationIdentities(new java.util.ArrayList<OriginationIdentityMetadata>(originationIdentities.length));
        }
        for (OriginationIdentityMetadata ele : originationIdentities) {
            this.originationIdentities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of any OriginationIdentityMetadata objects.
     * </p>
     * 
     * @param originationIdentities
     *        An array of any OriginationIdentityMetadata objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPoolOriginationIdentitiesResult withOriginationIdentities(java.util.Collection<OriginationIdentityMetadata> originationIdentities) {
        setOriginationIdentities(originationIdentities);
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

    public ListPoolOriginationIdentitiesResult withNextToken(String nextToken) {
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
        if (getPoolArn() != null)
            sb.append("PoolArn: ").append(getPoolArn()).append(",");
        if (getPoolId() != null)
            sb.append("PoolId: ").append(getPoolId()).append(",");
        if (getOriginationIdentities() != null)
            sb.append("OriginationIdentities: ").append(getOriginationIdentities()).append(",");
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

        if (obj instanceof ListPoolOriginationIdentitiesResult == false)
            return false;
        ListPoolOriginationIdentitiesResult other = (ListPoolOriginationIdentitiesResult) obj;
        if (other.getPoolArn() == null ^ this.getPoolArn() == null)
            return false;
        if (other.getPoolArn() != null && other.getPoolArn().equals(this.getPoolArn()) == false)
            return false;
        if (other.getPoolId() == null ^ this.getPoolId() == null)
            return false;
        if (other.getPoolId() != null && other.getPoolId().equals(this.getPoolId()) == false)
            return false;
        if (other.getOriginationIdentities() == null ^ this.getOriginationIdentities() == null)
            return false;
        if (other.getOriginationIdentities() != null && other.getOriginationIdentities().equals(this.getOriginationIdentities()) == false)
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

        hashCode = prime * hashCode + ((getPoolArn() == null) ? 0 : getPoolArn().hashCode());
        hashCode = prime * hashCode + ((getPoolId() == null) ? 0 : getPoolId().hashCode());
        hashCode = prime * hashCode + ((getOriginationIdentities() == null) ? 0 : getOriginationIdentities().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPoolOriginationIdentitiesResult clone() {
        try {
            return (ListPoolOriginationIdentitiesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
