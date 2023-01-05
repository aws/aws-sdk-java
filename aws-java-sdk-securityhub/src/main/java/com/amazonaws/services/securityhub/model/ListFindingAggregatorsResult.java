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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListFindingAggregators" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListFindingAggregatorsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of finding aggregators. This operation currently only returns a single result.
     * </p>
     */
    private java.util.List<FindingAggregator> findingAggregators;
    /**
     * <p>
     * If there are more results, this is the token to provide in the next call to <code>ListFindingAggregators</code>.
     * </p>
     * <p>
     * This operation currently only returns a single result.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of finding aggregators. This operation currently only returns a single result.
     * </p>
     * 
     * @return The list of finding aggregators. This operation currently only returns a single result.
     */

    public java.util.List<FindingAggregator> getFindingAggregators() {
        return findingAggregators;
    }

    /**
     * <p>
     * The list of finding aggregators. This operation currently only returns a single result.
     * </p>
     * 
     * @param findingAggregators
     *        The list of finding aggregators. This operation currently only returns a single result.
     */

    public void setFindingAggregators(java.util.Collection<FindingAggregator> findingAggregators) {
        if (findingAggregators == null) {
            this.findingAggregators = null;
            return;
        }

        this.findingAggregators = new java.util.ArrayList<FindingAggregator>(findingAggregators);
    }

    /**
     * <p>
     * The list of finding aggregators. This operation currently only returns a single result.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFindingAggregators(java.util.Collection)} or {@link #withFindingAggregators(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param findingAggregators
     *        The list of finding aggregators. This operation currently only returns a single result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFindingAggregatorsResult withFindingAggregators(FindingAggregator... findingAggregators) {
        if (this.findingAggregators == null) {
            setFindingAggregators(new java.util.ArrayList<FindingAggregator>(findingAggregators.length));
        }
        for (FindingAggregator ele : findingAggregators) {
            this.findingAggregators.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of finding aggregators. This operation currently only returns a single result.
     * </p>
     * 
     * @param findingAggregators
     *        The list of finding aggregators. This operation currently only returns a single result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFindingAggregatorsResult withFindingAggregators(java.util.Collection<FindingAggregator> findingAggregators) {
        setFindingAggregators(findingAggregators);
        return this;
    }

    /**
     * <p>
     * If there are more results, this is the token to provide in the next call to <code>ListFindingAggregators</code>.
     * </p>
     * <p>
     * This operation currently only returns a single result.
     * </p>
     * 
     * @param nextToken
     *        If there are more results, this is the token to provide in the next call to
     *        <code>ListFindingAggregators</code>.</p>
     *        <p>
     *        This operation currently only returns a single result.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more results, this is the token to provide in the next call to <code>ListFindingAggregators</code>.
     * </p>
     * <p>
     * This operation currently only returns a single result.
     * </p>
     * 
     * @return If there are more results, this is the token to provide in the next call to
     *         <code>ListFindingAggregators</code>.</p>
     *         <p>
     *         This operation currently only returns a single result.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are more results, this is the token to provide in the next call to <code>ListFindingAggregators</code>.
     * </p>
     * <p>
     * This operation currently only returns a single result.
     * </p>
     * 
     * @param nextToken
     *        If there are more results, this is the token to provide in the next call to
     *        <code>ListFindingAggregators</code>.</p>
     *        <p>
     *        This operation currently only returns a single result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListFindingAggregatorsResult withNextToken(String nextToken) {
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
        if (getFindingAggregators() != null)
            sb.append("FindingAggregators: ").append(getFindingAggregators()).append(",");
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

        if (obj instanceof ListFindingAggregatorsResult == false)
            return false;
        ListFindingAggregatorsResult other = (ListFindingAggregatorsResult) obj;
        if (other.getFindingAggregators() == null ^ this.getFindingAggregators() == null)
            return false;
        if (other.getFindingAggregators() != null && other.getFindingAggregators().equals(this.getFindingAggregators()) == false)
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

        hashCode = prime * hashCode + ((getFindingAggregators() == null) ? 0 : getFindingAggregators().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListFindingAggregatorsResult clone() {
        try {
            return (ListFindingAggregatorsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
