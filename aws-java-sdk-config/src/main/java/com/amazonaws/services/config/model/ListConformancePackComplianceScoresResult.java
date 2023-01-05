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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ListConformancePackComplianceScores"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListConformancePackComplianceScoresResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The <code>nextToken</code> string that you can use to get the next page of results in a paginated response.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of <code>ConformancePackComplianceScore</code> objects.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ConformancePackComplianceScore> conformancePackComplianceScores;

    /**
     * <p>
     * The <code>nextToken</code> string that you can use to get the next page of results in a paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string that you can use to get the next page of results in a paginated
     *        response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string that you can use to get the next page of results in a paginated response.
     * </p>
     * 
     * @return The <code>nextToken</code> string that you can use to get the next page of results in a paginated
     *         response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string that you can use to get the next page of results in a paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string that you can use to get the next page of results in a paginated
     *        response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConformancePackComplianceScoresResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of <code>ConformancePackComplianceScore</code> objects.
     * </p>
     * 
     * @return A list of <code>ConformancePackComplianceScore</code> objects.
     */

    public java.util.List<ConformancePackComplianceScore> getConformancePackComplianceScores() {
        if (conformancePackComplianceScores == null) {
            conformancePackComplianceScores = new com.amazonaws.internal.SdkInternalList<ConformancePackComplianceScore>();
        }
        return conformancePackComplianceScores;
    }

    /**
     * <p>
     * A list of <code>ConformancePackComplianceScore</code> objects.
     * </p>
     * 
     * @param conformancePackComplianceScores
     *        A list of <code>ConformancePackComplianceScore</code> objects.
     */

    public void setConformancePackComplianceScores(java.util.Collection<ConformancePackComplianceScore> conformancePackComplianceScores) {
        if (conformancePackComplianceScores == null) {
            this.conformancePackComplianceScores = null;
            return;
        }

        this.conformancePackComplianceScores = new com.amazonaws.internal.SdkInternalList<ConformancePackComplianceScore>(conformancePackComplianceScores);
    }

    /**
     * <p>
     * A list of <code>ConformancePackComplianceScore</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConformancePackComplianceScores(java.util.Collection)} or
     * {@link #withConformancePackComplianceScores(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param conformancePackComplianceScores
     *        A list of <code>ConformancePackComplianceScore</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConformancePackComplianceScoresResult withConformancePackComplianceScores(ConformancePackComplianceScore... conformancePackComplianceScores) {
        if (this.conformancePackComplianceScores == null) {
            setConformancePackComplianceScores(new com.amazonaws.internal.SdkInternalList<ConformancePackComplianceScore>(
                    conformancePackComplianceScores.length));
        }
        for (ConformancePackComplianceScore ele : conformancePackComplianceScores) {
            this.conformancePackComplianceScores.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>ConformancePackComplianceScore</code> objects.
     * </p>
     * 
     * @param conformancePackComplianceScores
     *        A list of <code>ConformancePackComplianceScore</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConformancePackComplianceScoresResult withConformancePackComplianceScores(
            java.util.Collection<ConformancePackComplianceScore> conformancePackComplianceScores) {
        setConformancePackComplianceScores(conformancePackComplianceScores);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getConformancePackComplianceScores() != null)
            sb.append("ConformancePackComplianceScores: ").append(getConformancePackComplianceScores());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListConformancePackComplianceScoresResult == false)
            return false;
        ListConformancePackComplianceScoresResult other = (ListConformancePackComplianceScoresResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getConformancePackComplianceScores() == null ^ this.getConformancePackComplianceScores() == null)
            return false;
        if (other.getConformancePackComplianceScores() != null
                && other.getConformancePackComplianceScores().equals(this.getConformancePackComplianceScores()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getConformancePackComplianceScores() == null) ? 0 : getConformancePackComplianceScores().hashCode());
        return hashCode;
    }

    @Override
    public ListConformancePackComplianceScoresResult clone() {
        try {
            return (ListConformancePackComplianceScoresResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
