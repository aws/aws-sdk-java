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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeSpendLimits"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSpendLimitsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of SpendLimit objects that contain the details for the requested spend limits.
     * </p>
     */
    private java.util.List<SpendLimit> spendLimits;
    /**
     * <p>
     * The token to be used for the next set of paginated results. If this field is empty then there are no more
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of SpendLimit objects that contain the details for the requested spend limits.
     * </p>
     * 
     * @return An array of SpendLimit objects that contain the details for the requested spend limits.
     */

    public java.util.List<SpendLimit> getSpendLimits() {
        return spendLimits;
    }

    /**
     * <p>
     * An array of SpendLimit objects that contain the details for the requested spend limits.
     * </p>
     * 
     * @param spendLimits
     *        An array of SpendLimit objects that contain the details for the requested spend limits.
     */

    public void setSpendLimits(java.util.Collection<SpendLimit> spendLimits) {
        if (spendLimits == null) {
            this.spendLimits = null;
            return;
        }

        this.spendLimits = new java.util.ArrayList<SpendLimit>(spendLimits);
    }

    /**
     * <p>
     * An array of SpendLimit objects that contain the details for the requested spend limits.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSpendLimits(java.util.Collection)} or {@link #withSpendLimits(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param spendLimits
     *        An array of SpendLimit objects that contain the details for the requested spend limits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpendLimitsResult withSpendLimits(SpendLimit... spendLimits) {
        if (this.spendLimits == null) {
            setSpendLimits(new java.util.ArrayList<SpendLimit>(spendLimits.length));
        }
        for (SpendLimit ele : spendLimits) {
            this.spendLimits.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of SpendLimit objects that contain the details for the requested spend limits.
     * </p>
     * 
     * @param spendLimits
     *        An array of SpendLimit objects that contain the details for the requested spend limits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpendLimitsResult withSpendLimits(java.util.Collection<SpendLimit> spendLimits) {
        setSpendLimits(spendLimits);
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

    public DescribeSpendLimitsResult withNextToken(String nextToken) {
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
        if (getSpendLimits() != null)
            sb.append("SpendLimits: ").append(getSpendLimits()).append(",");
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

        if (obj instanceof DescribeSpendLimitsResult == false)
            return false;
        DescribeSpendLimitsResult other = (DescribeSpendLimitsResult) obj;
        if (other.getSpendLimits() == null ^ this.getSpendLimits() == null)
            return false;
        if (other.getSpendLimits() != null && other.getSpendLimits().equals(this.getSpendLimits()) == false)
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

        hashCode = prime * hashCode + ((getSpendLimits() == null) ? 0 : getSpendLimits().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSpendLimitsResult clone() {
        try {
            return (DescribeSpendLimitsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
