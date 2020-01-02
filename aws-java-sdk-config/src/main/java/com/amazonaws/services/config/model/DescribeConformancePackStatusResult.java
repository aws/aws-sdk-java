/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeConformancePackStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConformancePackStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list of <code>ConformancePackStatusDetail</code> objects.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ConformancePackStatusDetail> conformancePackStatusDetails;
    /**
     * <p>
     * The <code>nextToken</code> string returned in a previous request that you use to request the next page of results
     * in a paginated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>ConformancePackStatusDetail</code> objects.
     * </p>
     * 
     * @return A list of <code>ConformancePackStatusDetail</code> objects.
     */

    public java.util.List<ConformancePackStatusDetail> getConformancePackStatusDetails() {
        if (conformancePackStatusDetails == null) {
            conformancePackStatusDetails = new com.amazonaws.internal.SdkInternalList<ConformancePackStatusDetail>();
        }
        return conformancePackStatusDetails;
    }

    /**
     * <p>
     * A list of <code>ConformancePackStatusDetail</code> objects.
     * </p>
     * 
     * @param conformancePackStatusDetails
     *        A list of <code>ConformancePackStatusDetail</code> objects.
     */

    public void setConformancePackStatusDetails(java.util.Collection<ConformancePackStatusDetail> conformancePackStatusDetails) {
        if (conformancePackStatusDetails == null) {
            this.conformancePackStatusDetails = null;
            return;
        }

        this.conformancePackStatusDetails = new com.amazonaws.internal.SdkInternalList<ConformancePackStatusDetail>(conformancePackStatusDetails);
    }

    /**
     * <p>
     * A list of <code>ConformancePackStatusDetail</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConformancePackStatusDetails(java.util.Collection)} or
     * {@link #withConformancePackStatusDetails(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param conformancePackStatusDetails
     *        A list of <code>ConformancePackStatusDetail</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConformancePackStatusResult withConformancePackStatusDetails(ConformancePackStatusDetail... conformancePackStatusDetails) {
        if (this.conformancePackStatusDetails == null) {
            setConformancePackStatusDetails(new com.amazonaws.internal.SdkInternalList<ConformancePackStatusDetail>(conformancePackStatusDetails.length));
        }
        for (ConformancePackStatusDetail ele : conformancePackStatusDetails) {
            this.conformancePackStatusDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>ConformancePackStatusDetail</code> objects.
     * </p>
     * 
     * @param conformancePackStatusDetails
     *        A list of <code>ConformancePackStatusDetail</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConformancePackStatusResult withConformancePackStatusDetails(java.util.Collection<ConformancePackStatusDetail> conformancePackStatusDetails) {
        setConformancePackStatusDetails(conformancePackStatusDetails);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned in a previous request that you use to request the next page of results
     * in a paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned in a previous request that you use to request the next page of
     *        results in a paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned in a previous request that you use to request the next page of results
     * in a paginated response.
     * </p>
     * 
     * @return The <code>nextToken</code> string returned in a previous request that you use to request the next page of
     *         results in a paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned in a previous request that you use to request the next page of results
     * in a paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned in a previous request that you use to request the next page of
     *        results in a paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConformancePackStatusResult withNextToken(String nextToken) {
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
        if (getConformancePackStatusDetails() != null)
            sb.append("ConformancePackStatusDetails: ").append(getConformancePackStatusDetails()).append(",");
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

        if (obj instanceof DescribeConformancePackStatusResult == false)
            return false;
        DescribeConformancePackStatusResult other = (DescribeConformancePackStatusResult) obj;
        if (other.getConformancePackStatusDetails() == null ^ this.getConformancePackStatusDetails() == null)
            return false;
        if (other.getConformancePackStatusDetails() != null && other.getConformancePackStatusDetails().equals(this.getConformancePackStatusDetails()) == false)
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

        hashCode = prime * hashCode + ((getConformancePackStatusDetails() == null) ? 0 : getConformancePackStatusDetails().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConformancePackStatusResult clone() {
        try {
            return (DescribeConformancePackStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
