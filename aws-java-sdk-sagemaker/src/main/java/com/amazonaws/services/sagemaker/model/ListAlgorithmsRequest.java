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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListAlgorithms" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAlgorithmsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A filter that returns only algorithms created after the specified time (timestamp).
     * </p>
     */
    private java.util.Date creationTimeAfter;
    /**
     * <p>
     * A filter that returns only algorithms created before the specified time (timestamp).
     * </p>
     */
    private java.util.Date creationTimeBefore;
    /**
     * <p>
     * The maximum number of algorithms to return in the response.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A string in the algorithm name. This filter returns only algorithms whose name contains the specified string.
     * </p>
     */
    private String nameContains;
    /**
     * <p>
     * If the response to a previous <code>ListAlgorithms</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of algorithms, use the token in the next request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The parameter by which to sort the results. The default is <code>CreationTime</code>.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * The sort order for the results. The default is <code>Ascending</code>.
     * </p>
     */
    private String sortOrder;

    /**
     * <p>
     * A filter that returns only algorithms created after the specified time (timestamp).
     * </p>
     * 
     * @param creationTimeAfter
     *        A filter that returns only algorithms created after the specified time (timestamp).
     */

    public void setCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
    }

    /**
     * <p>
     * A filter that returns only algorithms created after the specified time (timestamp).
     * </p>
     * 
     * @return A filter that returns only algorithms created after the specified time (timestamp).
     */

    public java.util.Date getCreationTimeAfter() {
        return this.creationTimeAfter;
    }

    /**
     * <p>
     * A filter that returns only algorithms created after the specified time (timestamp).
     * </p>
     * 
     * @param creationTimeAfter
     *        A filter that returns only algorithms created after the specified time (timestamp).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAlgorithmsRequest withCreationTimeAfter(java.util.Date creationTimeAfter) {
        setCreationTimeAfter(creationTimeAfter);
        return this;
    }

    /**
     * <p>
     * A filter that returns only algorithms created before the specified time (timestamp).
     * </p>
     * 
     * @param creationTimeBefore
     *        A filter that returns only algorithms created before the specified time (timestamp).
     */

    public void setCreationTimeBefore(java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
    }

    /**
     * <p>
     * A filter that returns only algorithms created before the specified time (timestamp).
     * </p>
     * 
     * @return A filter that returns only algorithms created before the specified time (timestamp).
     */

    public java.util.Date getCreationTimeBefore() {
        return this.creationTimeBefore;
    }

    /**
     * <p>
     * A filter that returns only algorithms created before the specified time (timestamp).
     * </p>
     * 
     * @param creationTimeBefore
     *        A filter that returns only algorithms created before the specified time (timestamp).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAlgorithmsRequest withCreationTimeBefore(java.util.Date creationTimeBefore) {
        setCreationTimeBefore(creationTimeBefore);
        return this;
    }

    /**
     * <p>
     * The maximum number of algorithms to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of algorithms to return in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of algorithms to return in the response.
     * </p>
     * 
     * @return The maximum number of algorithms to return in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of algorithms to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of algorithms to return in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAlgorithmsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A string in the algorithm name. This filter returns only algorithms whose name contains the specified string.
     * </p>
     * 
     * @param nameContains
     *        A string in the algorithm name. This filter returns only algorithms whose name contains the specified
     *        string.
     */

    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    /**
     * <p>
     * A string in the algorithm name. This filter returns only algorithms whose name contains the specified string.
     * </p>
     * 
     * @return A string in the algorithm name. This filter returns only algorithms whose name contains the specified
     *         string.
     */

    public String getNameContains() {
        return this.nameContains;
    }

    /**
     * <p>
     * A string in the algorithm name. This filter returns only algorithms whose name contains the specified string.
     * </p>
     * 
     * @param nameContains
     *        A string in the algorithm name. This filter returns only algorithms whose name contains the specified
     *        string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAlgorithmsRequest withNameContains(String nameContains) {
        setNameContains(nameContains);
        return this;
    }

    /**
     * <p>
     * If the response to a previous <code>ListAlgorithms</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of algorithms, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the response to a previous <code>ListAlgorithms</code> request was truncated, the response includes a
     *        <code>NextToken</code>. To retrieve the next set of algorithms, use the token in the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response to a previous <code>ListAlgorithms</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of algorithms, use the token in the next request.
     * </p>
     * 
     * @return If the response to a previous <code>ListAlgorithms</code> request was truncated, the response includes a
     *         <code>NextToken</code>. To retrieve the next set of algorithms, use the token in the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response to a previous <code>ListAlgorithms</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of algorithms, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the response to a previous <code>ListAlgorithms</code> request was truncated, the response includes a
     *        <code>NextToken</code>. To retrieve the next set of algorithms, use the token in the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAlgorithmsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is <code>CreationTime</code>.
     * </p>
     * 
     * @param sortBy
     *        The parameter by which to sort the results. The default is <code>CreationTime</code>.
     * @see AlgorithmSortBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is <code>CreationTime</code>.
     * </p>
     * 
     * @return The parameter by which to sort the results. The default is <code>CreationTime</code>.
     * @see AlgorithmSortBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is <code>CreationTime</code>.
     * </p>
     * 
     * @param sortBy
     *        The parameter by which to sort the results. The default is <code>CreationTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlgorithmSortBy
     */

    public ListAlgorithmsRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is <code>CreationTime</code>.
     * </p>
     * 
     * @param sortBy
     *        The parameter by which to sort the results. The default is <code>CreationTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlgorithmSortBy
     */

    public ListAlgorithmsRequest withSortBy(AlgorithmSortBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The sort order for the results. The default is <code>Ascending</code>.
     * </p>
     * 
     * @param sortOrder
     *        The sort order for the results. The default is <code>Ascending</code>.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The sort order for the results. The default is <code>Ascending</code>.
     * </p>
     * 
     * @return The sort order for the results. The default is <code>Ascending</code>.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The sort order for the results. The default is <code>Ascending</code>.
     * </p>
     * 
     * @param sortOrder
     *        The sort order for the results. The default is <code>Ascending</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListAlgorithmsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The sort order for the results. The default is <code>Ascending</code>.
     * </p>
     * 
     * @param sortOrder
     *        The sort order for the results. The default is <code>Ascending</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListAlgorithmsRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
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
        if (getCreationTimeAfter() != null)
            sb.append("CreationTimeAfter: ").append(getCreationTimeAfter()).append(",");
        if (getCreationTimeBefore() != null)
            sb.append("CreationTimeBefore: ").append(getCreationTimeBefore()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNameContains() != null)
            sb.append("NameContains: ").append(getNameContains()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAlgorithmsRequest == false)
            return false;
        ListAlgorithmsRequest other = (ListAlgorithmsRequest) obj;
        if (other.getCreationTimeAfter() == null ^ this.getCreationTimeAfter() == null)
            return false;
        if (other.getCreationTimeAfter() != null && other.getCreationTimeAfter().equals(this.getCreationTimeAfter()) == false)
            return false;
        if (other.getCreationTimeBefore() == null ^ this.getCreationTimeBefore() == null)
            return false;
        if (other.getCreationTimeBefore() != null && other.getCreationTimeBefore().equals(this.getCreationTimeBefore()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNameContains() == null ^ this.getNameContains() == null)
            return false;
        if (other.getNameContains() != null && other.getNameContains().equals(this.getNameContains()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationTimeAfter() == null) ? 0 : getCreationTimeAfter().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeBefore() == null) ? 0 : getCreationTimeBefore().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNameContains() == null) ? 0 : getNameContains().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public ListAlgorithmsRequest clone() {
        return (ListAlgorithmsRequest) super.clone();
    }

}
