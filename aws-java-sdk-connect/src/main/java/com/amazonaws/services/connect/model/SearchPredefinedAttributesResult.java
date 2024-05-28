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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SearchPredefinedAttributes" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchPredefinedAttributesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Predefined attributes matched by the search criteria.
     * </p>
     */
    private java.util.List<PredefinedAttribute> predefinedAttributes;
    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The approximate number of predefined attributes which matched your search query.
     * </p>
     */
    private Long approximateTotalCount;

    /**
     * <p>
     * Predefined attributes matched by the search criteria.
     * </p>
     * 
     * @return Predefined attributes matched by the search criteria.
     */

    public java.util.List<PredefinedAttribute> getPredefinedAttributes() {
        return predefinedAttributes;
    }

    /**
     * <p>
     * Predefined attributes matched by the search criteria.
     * </p>
     * 
     * @param predefinedAttributes
     *        Predefined attributes matched by the search criteria.
     */

    public void setPredefinedAttributes(java.util.Collection<PredefinedAttribute> predefinedAttributes) {
        if (predefinedAttributes == null) {
            this.predefinedAttributes = null;
            return;
        }

        this.predefinedAttributes = new java.util.ArrayList<PredefinedAttribute>(predefinedAttributes);
    }

    /**
     * <p>
     * Predefined attributes matched by the search criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPredefinedAttributes(java.util.Collection)} or {@link #withPredefinedAttributes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param predefinedAttributes
     *        Predefined attributes matched by the search criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPredefinedAttributesResult withPredefinedAttributes(PredefinedAttribute... predefinedAttributes) {
        if (this.predefinedAttributes == null) {
            setPredefinedAttributes(new java.util.ArrayList<PredefinedAttribute>(predefinedAttributes.length));
        }
        for (PredefinedAttribute ele : predefinedAttributes) {
            this.predefinedAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Predefined attributes matched by the search criteria.
     * </p>
     * 
     * @param predefinedAttributes
     *        Predefined attributes matched by the search criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPredefinedAttributesResult withPredefinedAttributes(java.util.Collection<PredefinedAttribute> predefinedAttributes) {
        setPredefinedAttributes(predefinedAttributes);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @return The token for the next set of results. Use the value returned in the previous response in the next
     *         request to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. Use the value returned in the previous response in the next request to
     * retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. Use the value returned in the previous response in the next request
     *        to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPredefinedAttributesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The approximate number of predefined attributes which matched your search query.
     * </p>
     * 
     * @param approximateTotalCount
     *        The approximate number of predefined attributes which matched your search query.
     */

    public void setApproximateTotalCount(Long approximateTotalCount) {
        this.approximateTotalCount = approximateTotalCount;
    }

    /**
     * <p>
     * The approximate number of predefined attributes which matched your search query.
     * </p>
     * 
     * @return The approximate number of predefined attributes which matched your search query.
     */

    public Long getApproximateTotalCount() {
        return this.approximateTotalCount;
    }

    /**
     * <p>
     * The approximate number of predefined attributes which matched your search query.
     * </p>
     * 
     * @param approximateTotalCount
     *        The approximate number of predefined attributes which matched your search query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPredefinedAttributesResult withApproximateTotalCount(Long approximateTotalCount) {
        setApproximateTotalCount(approximateTotalCount);
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
        if (getPredefinedAttributes() != null)
            sb.append("PredefinedAttributes: ").append(getPredefinedAttributes()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getApproximateTotalCount() != null)
            sb.append("ApproximateTotalCount: ").append(getApproximateTotalCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchPredefinedAttributesResult == false)
            return false;
        SearchPredefinedAttributesResult other = (SearchPredefinedAttributesResult) obj;
        if (other.getPredefinedAttributes() == null ^ this.getPredefinedAttributes() == null)
            return false;
        if (other.getPredefinedAttributes() != null && other.getPredefinedAttributes().equals(this.getPredefinedAttributes()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getApproximateTotalCount() == null ^ this.getApproximateTotalCount() == null)
            return false;
        if (other.getApproximateTotalCount() != null && other.getApproximateTotalCount().equals(this.getApproximateTotalCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPredefinedAttributes() == null) ? 0 : getPredefinedAttributes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getApproximateTotalCount() == null) ? 0 : getApproximateTotalCount().hashCode());
        return hashCode;
    }

    @Override
    public SearchPredefinedAttributesResult clone() {
        try {
            return (SearchPredefinedAttributesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
