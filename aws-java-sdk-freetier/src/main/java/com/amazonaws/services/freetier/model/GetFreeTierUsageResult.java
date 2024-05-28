/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.freetier.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/freetier-2023-09-07/GetFreeTierUsage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFreeTierUsageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of Free Tier usage objects that meet your filter expression.
     * </p>
     */
    private java.util.List<FreeTierUsage> freeTierUsages;
    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of Free Tier usage objects that meet your filter expression.
     * </p>
     * 
     * @return The list of Free Tier usage objects that meet your filter expression.
     */

    public java.util.List<FreeTierUsage> getFreeTierUsages() {
        return freeTierUsages;
    }

    /**
     * <p>
     * The list of Free Tier usage objects that meet your filter expression.
     * </p>
     * 
     * @param freeTierUsages
     *        The list of Free Tier usage objects that meet your filter expression.
     */

    public void setFreeTierUsages(java.util.Collection<FreeTierUsage> freeTierUsages) {
        if (freeTierUsages == null) {
            this.freeTierUsages = null;
            return;
        }

        this.freeTierUsages = new java.util.ArrayList<FreeTierUsage>(freeTierUsages);
    }

    /**
     * <p>
     * The list of Free Tier usage objects that meet your filter expression.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFreeTierUsages(java.util.Collection)} or {@link #withFreeTierUsages(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param freeTierUsages
     *        The list of Free Tier usage objects that meet your filter expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFreeTierUsageResult withFreeTierUsages(FreeTierUsage... freeTierUsages) {
        if (this.freeTierUsages == null) {
            setFreeTierUsages(new java.util.ArrayList<FreeTierUsage>(freeTierUsages.length));
        }
        for (FreeTierUsage ele : freeTierUsages) {
            this.freeTierUsages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of Free Tier usage objects that meet your filter expression.
     * </p>
     * 
     * @param freeTierUsages
     *        The list of Free Tier usage objects that meet your filter expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFreeTierUsageResult withFreeTierUsages(java.util.Collection<FreeTierUsage> freeTierUsages) {
        setFreeTierUsages(freeTierUsages);
        return this;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that indicates the next set of results to retrieve.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @return The pagination token that indicates the next set of results to retrieve.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that indicates the next set of results to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFreeTierUsageResult withNextToken(String nextToken) {
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
        if (getFreeTierUsages() != null)
            sb.append("FreeTierUsages: ").append(getFreeTierUsages()).append(",");
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

        if (obj instanceof GetFreeTierUsageResult == false)
            return false;
        GetFreeTierUsageResult other = (GetFreeTierUsageResult) obj;
        if (other.getFreeTierUsages() == null ^ this.getFreeTierUsages() == null)
            return false;
        if (other.getFreeTierUsages() != null && other.getFreeTierUsages().equals(this.getFreeTierUsages()) == false)
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

        hashCode = prime * hashCode + ((getFreeTierUsages() == null) ? 0 : getFreeTierUsages().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetFreeTierUsageResult clone() {
        try {
            return (GetFreeTierUsageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
