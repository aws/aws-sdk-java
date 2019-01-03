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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ListIndex" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIndexRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the directory that the index exists in.
     * </p>
     */
    private String directoryArn;
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
     * The maximum number of objects in a single page to retrieve from the index during a request. For more information,
     * see <a href="http://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Amazon Cloud Directory
     * Limits</a>.
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
     * The consistency level to execute the request at.
     * </p>
     */
    private String consistencyLevel;

    /**
     * <p>
     * The ARN of the directory that the index exists in.
     * </p>
     * 
     * @param directoryArn
     *        The ARN of the directory that the index exists in.
     */

    public void setDirectoryArn(String directoryArn) {
        this.directoryArn = directoryArn;
    }

    /**
     * <p>
     * The ARN of the directory that the index exists in.
     * </p>
     * 
     * @return The ARN of the directory that the index exists in.
     */

    public String getDirectoryArn() {
        return this.directoryArn;
    }

    /**
     * <p>
     * The ARN of the directory that the index exists in.
     * </p>
     * 
     * @param directoryArn
     *        The ARN of the directory that the index exists in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIndexRequest withDirectoryArn(String directoryArn) {
        setDirectoryArn(directoryArn);
        return this;
    }

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

    public ListIndexRequest withRangesOnIndexedValues(ObjectAttributeRange... rangesOnIndexedValues) {
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

    public ListIndexRequest withRangesOnIndexedValues(java.util.Collection<ObjectAttributeRange> rangesOnIndexedValues) {
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

    public ListIndexRequest withIndexReference(ObjectReference indexReference) {
        setIndexReference(indexReference);
        return this;
    }

    /**
     * <p>
     * The maximum number of objects in a single page to retrieve from the index during a request. For more information,
     * see <a href="http://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Amazon Cloud Directory
     * Limits</a>.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of objects in a single page to retrieve from the index during a request. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Amazon Cloud Directory
     *        Limits</a>.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of objects in a single page to retrieve from the index during a request. For more information,
     * see <a href="http://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Amazon Cloud Directory
     * Limits</a>.
     * </p>
     * 
     * @return The maximum number of objects in a single page to retrieve from the index during a request. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Amazon Cloud Directory
     *         Limits</a>.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of objects in a single page to retrieve from the index during a request. For more information,
     * see <a href="http://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Amazon Cloud Directory
     * Limits</a>.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of objects in a single page to retrieve from the index during a request. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html">Amazon Cloud Directory
     *        Limits</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIndexRequest withMaxResults(Integer maxResults) {
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

    public ListIndexRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The consistency level to execute the request at.
     * </p>
     * 
     * @param consistencyLevel
     *        The consistency level to execute the request at.
     * @see ConsistencyLevel
     */

    public void setConsistencyLevel(String consistencyLevel) {
        this.consistencyLevel = consistencyLevel;
    }

    /**
     * <p>
     * The consistency level to execute the request at.
     * </p>
     * 
     * @return The consistency level to execute the request at.
     * @see ConsistencyLevel
     */

    public String getConsistencyLevel() {
        return this.consistencyLevel;
    }

    /**
     * <p>
     * The consistency level to execute the request at.
     * </p>
     * 
     * @param consistencyLevel
     *        The consistency level to execute the request at.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConsistencyLevel
     */

    public ListIndexRequest withConsistencyLevel(String consistencyLevel) {
        setConsistencyLevel(consistencyLevel);
        return this;
    }

    /**
     * <p>
     * The consistency level to execute the request at.
     * </p>
     * 
     * @param consistencyLevel
     *        The consistency level to execute the request at.
     * @see ConsistencyLevel
     */

    public void setConsistencyLevel(ConsistencyLevel consistencyLevel) {
        withConsistencyLevel(consistencyLevel);
    }

    /**
     * <p>
     * The consistency level to execute the request at.
     * </p>
     * 
     * @param consistencyLevel
     *        The consistency level to execute the request at.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConsistencyLevel
     */

    public ListIndexRequest withConsistencyLevel(ConsistencyLevel consistencyLevel) {
        this.consistencyLevel = consistencyLevel.toString();
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
        if (getDirectoryArn() != null)
            sb.append("DirectoryArn: ").append(getDirectoryArn()).append(",");
        if (getRangesOnIndexedValues() != null)
            sb.append("RangesOnIndexedValues: ").append(getRangesOnIndexedValues()).append(",");
        if (getIndexReference() != null)
            sb.append("IndexReference: ").append(getIndexReference()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getConsistencyLevel() != null)
            sb.append("ConsistencyLevel: ").append(getConsistencyLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListIndexRequest == false)
            return false;
        ListIndexRequest other = (ListIndexRequest) obj;
        if (other.getDirectoryArn() == null ^ this.getDirectoryArn() == null)
            return false;
        if (other.getDirectoryArn() != null && other.getDirectoryArn().equals(this.getDirectoryArn()) == false)
            return false;
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
        if (other.getConsistencyLevel() == null ^ this.getConsistencyLevel() == null)
            return false;
        if (other.getConsistencyLevel() != null && other.getConsistencyLevel().equals(this.getConsistencyLevel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryArn() == null) ? 0 : getDirectoryArn().hashCode());
        hashCode = prime * hashCode + ((getRangesOnIndexedValues() == null) ? 0 : getRangesOnIndexedValues().hashCode());
        hashCode = prime * hashCode + ((getIndexReference() == null) ? 0 : getIndexReference().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getConsistencyLevel() == null) ? 0 : getConsistencyLevel().hashCode());
        return hashCode;
    }

    @Override
    public ListIndexRequest clone() {
        return (ListIndexRequest) super.clone();
    }

}
