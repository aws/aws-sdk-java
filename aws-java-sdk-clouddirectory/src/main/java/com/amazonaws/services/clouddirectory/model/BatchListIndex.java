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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Lists objects attached to the specified index inside a <a>BatchRead</a> operation. For more information, see
 * <a>ListIndex</a> and <a>BatchReadRequest$Operations</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchListIndex" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchListIndex implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the ranges of indexed values that you want to query.
     * </p>
     */
    private java.util.List<ObjectAttributeRange> rangesOnIndexedValues;
    /**
     * <p>
     * The reference to the index to list.
     * </p>
     */
    private ObjectReference indexReference;
    /**
     * <p>
     * The maximum number of results to retrieve.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The pagination token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Specifies the ranges of indexed values that you want to query.
     * </p>
     * 
     * @return Specifies the ranges of indexed values that you want to query.
     */

    public java.util.List<ObjectAttributeRange> getRangesOnIndexedValues() {
        return rangesOnIndexedValues;
    }

    /**
     * <p>
     * Specifies the ranges of indexed values that you want to query.
     * </p>
     * 
     * @param rangesOnIndexedValues
     *        Specifies the ranges of indexed values that you want to query.
     */

    public void setRangesOnIndexedValues(java.util.Collection<ObjectAttributeRange> rangesOnIndexedValues) {
        if (rangesOnIndexedValues == null) {
            this.rangesOnIndexedValues = null;
            return;
        }

        this.rangesOnIndexedValues = new java.util.ArrayList<ObjectAttributeRange>(rangesOnIndexedValues);
    }

    /**
     * <p>
     * Specifies the ranges of indexed values that you want to query.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRangesOnIndexedValues(java.util.Collection)} or
     * {@link #withRangesOnIndexedValues(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param rangesOnIndexedValues
     *        Specifies the ranges of indexed values that you want to query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchListIndex withRangesOnIndexedValues(ObjectAttributeRange... rangesOnIndexedValues) {
        if (this.rangesOnIndexedValues == null) {
            setRangesOnIndexedValues(new java.util.ArrayList<ObjectAttributeRange>(rangesOnIndexedValues.length));
        }
        for (ObjectAttributeRange ele : rangesOnIndexedValues) {
            this.rangesOnIndexedValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the ranges of indexed values that you want to query.
     * </p>
     * 
     * @param rangesOnIndexedValues
     *        Specifies the ranges of indexed values that you want to query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchListIndex withRangesOnIndexedValues(java.util.Collection<ObjectAttributeRange> rangesOnIndexedValues) {
        setRangesOnIndexedValues(rangesOnIndexedValues);
        return this;
    }

    /**
     * <p>
     * The reference to the index to list.
     * </p>
     * 
     * @param indexReference
     *        The reference to the index to list.
     */

    public void setIndexReference(ObjectReference indexReference) {
        this.indexReference = indexReference;
    }

    /**
     * <p>
     * The reference to the index to list.
     * </p>
     * 
     * @return The reference to the index to list.
     */

    public ObjectReference getIndexReference() {
        return this.indexReference;
    }

    /**
     * <p>
     * The reference to the index to list.
     * </p>
     * 
     * @param indexReference
     *        The reference to the index to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchListIndex withIndexReference(ObjectReference indexReference) {
        setIndexReference(indexReference);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to retrieve.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to retrieve.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to retrieve.
     * </p>
     * 
     * @return The maximum number of results to retrieve.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to retrieve.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchListIndex withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @return The pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchListIndex withNextToken(String nextToken) {
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
        if (getRangesOnIndexedValues() != null)
            sb.append("RangesOnIndexedValues: ").append(getRangesOnIndexedValues()).append(",");
        if (getIndexReference() != null)
            sb.append("IndexReference: ").append(getIndexReference()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof BatchListIndex == false)
            return false;
        BatchListIndex other = (BatchListIndex) obj;
        if (other.getRangesOnIndexedValues() == null ^ this.getRangesOnIndexedValues() == null)
            return false;
        if (other.getRangesOnIndexedValues() != null && other.getRangesOnIndexedValues().equals(this.getRangesOnIndexedValues()) == false)
            return false;
        if (other.getIndexReference() == null ^ this.getIndexReference() == null)
            return false;
        if (other.getIndexReference() != null && other.getIndexReference().equals(this.getIndexReference()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getRangesOnIndexedValues() == null) ? 0 : getRangesOnIndexedValues().hashCode());
        hashCode = prime * hashCode + ((getIndexReference() == null) ? 0 : getIndexReference().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public BatchListIndex clone() {
        try {
            return (BatchListIndex) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.BatchListIndexMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
