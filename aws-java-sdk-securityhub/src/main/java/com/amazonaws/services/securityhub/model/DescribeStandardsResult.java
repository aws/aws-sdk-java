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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeStandards" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStandardsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of available standards.
     * </p>
     */
    private java.util.List<Standard> standards;
    /**
     * <p>
     * The pagination token to use to request the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of available standards.
     * </p>
     * 
     * @return A list of available standards.
     */

    public java.util.List<Standard> getStandards() {
        return standards;
    }

    /**
     * <p>
     * A list of available standards.
     * </p>
     * 
     * @param standards
     *        A list of available standards.
     */

    public void setStandards(java.util.Collection<Standard> standards) {
        if (standards == null) {
            this.standards = null;
            return;
        }

        this.standards = new java.util.ArrayList<Standard>(standards);
    }

    /**
     * <p>
     * A list of available standards.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStandards(java.util.Collection)} or {@link #withStandards(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param standards
     *        A list of available standards.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStandardsResult withStandards(Standard... standards) {
        if (this.standards == null) {
            setStandards(new java.util.ArrayList<Standard>(standards.length));
        }
        for (Standard ele : standards) {
            this.standards.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of available standards.
     * </p>
     * 
     * @param standards
     *        A list of available standards.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStandardsResult withStandards(java.util.Collection<Standard> standards) {
        setStandards(standards);
        return this;
    }

    /**
     * <p>
     * The pagination token to use to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to request the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to use to request the next page of results.
     * </p>
     * 
     * @return The pagination token to use to request the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to use to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to use to request the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStandardsResult withNextToken(String nextToken) {
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
        if (getStandards() != null)
            sb.append("Standards: ").append(getStandards()).append(",");
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

        if (obj instanceof DescribeStandardsResult == false)
            return false;
        DescribeStandardsResult other = (DescribeStandardsResult) obj;
        if (other.getStandards() == null ^ this.getStandards() == null)
            return false;
        if (other.getStandards() != null && other.getStandards().equals(this.getStandards()) == false)
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

        hashCode = prime * hashCode + ((getStandards() == null) ? 0 : getStandards().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStandardsResult clone() {
        try {
            return (DescribeStandardsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
