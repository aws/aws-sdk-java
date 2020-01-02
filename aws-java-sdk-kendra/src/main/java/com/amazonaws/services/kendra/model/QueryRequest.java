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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/Query" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the index to search. The identifier is returned in the response from the operation.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The text to search for.
     * </p>
     */
    private String queryText;
    /**
     * <p>
     * Enables filtered searches based on document attributes. You can only provide one attribute filter; however, the
     * <code>AndAllFilters</code>, <code>NotFilter</code>, and <code>OrAllFilters</code> parameters contain a list of
     * other filters.
     * </p>
     * <p>
     * The <code>AttributeFilter</code> parameter enables you to create a set of filtering rules that a document must
     * satisfy to be included in the query results.
     * </p>
     */
    private AttributeFilter attributeFilter;
    /**
     * <p>
     * An array of documents attributes. Amazon Kendra returns a count for each attribute key specified. You can use
     * this information to help narrow the search for your user.
     * </p>
     */
    private java.util.List<Facet> facets;
    /**
     * <p>
     * An array of document attributes to include in the response. No other document attributes are included in the
     * response. By default all document attributes are included in the response.
     * </p>
     */
    private java.util.List<String> requestedDocumentAttributes;
    /**
     * <p>
     * Sets the type of query. Only results for the specified query type are returned.
     * </p>
     */
    private String queryResultTypeFilter;
    /**
     * <p>
     * Query results are returned in pages the size of the <code>PageSize</code> parameter. By default, Amazon Kendra
     * returns the first page of results. Use this parameter to get result pages after the first one.
     * </p>
     */
    private Integer pageNumber;
    /**
     * <p>
     * Sets the number of results that are returned in each page of results. The default page size is 100.
     * </p>
     */
    private Integer pageSize;

    /**
     * <p>
     * The unique identifier of the index to search. The identifier is returned in the response from the operation.
     * </p>
     * 
     * @param indexId
     *        The unique identifier of the index to search. The identifier is returned in the response from the
     *        operation.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The unique identifier of the index to search. The identifier is returned in the response from the operation.
     * </p>
     * 
     * @return The unique identifier of the index to search. The identifier is returned in the response from the
     *         operation.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The unique identifier of the index to search. The identifier is returned in the response from the operation.
     * </p>
     * 
     * @param indexId
     *        The unique identifier of the index to search. The identifier is returned in the response from the
     *        operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The text to search for.
     * </p>
     * 
     * @param queryText
     *        The text to search for.
     */

    public void setQueryText(String queryText) {
        this.queryText = queryText;
    }

    /**
     * <p>
     * The text to search for.
     * </p>
     * 
     * @return The text to search for.
     */

    public String getQueryText() {
        return this.queryText;
    }

    /**
     * <p>
     * The text to search for.
     * </p>
     * 
     * @param queryText
     *        The text to search for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withQueryText(String queryText) {
        setQueryText(queryText);
        return this;
    }

    /**
     * <p>
     * Enables filtered searches based on document attributes. You can only provide one attribute filter; however, the
     * <code>AndAllFilters</code>, <code>NotFilter</code>, and <code>OrAllFilters</code> parameters contain a list of
     * other filters.
     * </p>
     * <p>
     * The <code>AttributeFilter</code> parameter enables you to create a set of filtering rules that a document must
     * satisfy to be included in the query results.
     * </p>
     * 
     * @param attributeFilter
     *        Enables filtered searches based on document attributes. You can only provide one attribute filter;
     *        however, the <code>AndAllFilters</code>, <code>NotFilter</code>, and <code>OrAllFilters</code> parameters
     *        contain a list of other filters.</p>
     *        <p>
     *        The <code>AttributeFilter</code> parameter enables you to create a set of filtering rules that a document
     *        must satisfy to be included in the query results.
     */

    public void setAttributeFilter(AttributeFilter attributeFilter) {
        this.attributeFilter = attributeFilter;
    }

    /**
     * <p>
     * Enables filtered searches based on document attributes. You can only provide one attribute filter; however, the
     * <code>AndAllFilters</code>, <code>NotFilter</code>, and <code>OrAllFilters</code> parameters contain a list of
     * other filters.
     * </p>
     * <p>
     * The <code>AttributeFilter</code> parameter enables you to create a set of filtering rules that a document must
     * satisfy to be included in the query results.
     * </p>
     * 
     * @return Enables filtered searches based on document attributes. You can only provide one attribute filter;
     *         however, the <code>AndAllFilters</code>, <code>NotFilter</code>, and <code>OrAllFilters</code> parameters
     *         contain a list of other filters.</p>
     *         <p>
     *         The <code>AttributeFilter</code> parameter enables you to create a set of filtering rules that a document
     *         must satisfy to be included in the query results.
     */

    public AttributeFilter getAttributeFilter() {
        return this.attributeFilter;
    }

    /**
     * <p>
     * Enables filtered searches based on document attributes. You can only provide one attribute filter; however, the
     * <code>AndAllFilters</code>, <code>NotFilter</code>, and <code>OrAllFilters</code> parameters contain a list of
     * other filters.
     * </p>
     * <p>
     * The <code>AttributeFilter</code> parameter enables you to create a set of filtering rules that a document must
     * satisfy to be included in the query results.
     * </p>
     * 
     * @param attributeFilter
     *        Enables filtered searches based on document attributes. You can only provide one attribute filter;
     *        however, the <code>AndAllFilters</code>, <code>NotFilter</code>, and <code>OrAllFilters</code> parameters
     *        contain a list of other filters.</p>
     *        <p>
     *        The <code>AttributeFilter</code> parameter enables you to create a set of filtering rules that a document
     *        must satisfy to be included in the query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withAttributeFilter(AttributeFilter attributeFilter) {
        setAttributeFilter(attributeFilter);
        return this;
    }

    /**
     * <p>
     * An array of documents attributes. Amazon Kendra returns a count for each attribute key specified. You can use
     * this information to help narrow the search for your user.
     * </p>
     * 
     * @return An array of documents attributes. Amazon Kendra returns a count for each attribute key specified. You can
     *         use this information to help narrow the search for your user.
     */

    public java.util.List<Facet> getFacets() {
        return facets;
    }

    /**
     * <p>
     * An array of documents attributes. Amazon Kendra returns a count for each attribute key specified. You can use
     * this information to help narrow the search for your user.
     * </p>
     * 
     * @param facets
     *        An array of documents attributes. Amazon Kendra returns a count for each attribute key specified. You can
     *        use this information to help narrow the search for your user.
     */

    public void setFacets(java.util.Collection<Facet> facets) {
        if (facets == null) {
            this.facets = null;
            return;
        }

        this.facets = new java.util.ArrayList<Facet>(facets);
    }

    /**
     * <p>
     * An array of documents attributes. Amazon Kendra returns a count for each attribute key specified. You can use
     * this information to help narrow the search for your user.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFacets(java.util.Collection)} or {@link #withFacets(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param facets
     *        An array of documents attributes. Amazon Kendra returns a count for each attribute key specified. You can
     *        use this information to help narrow the search for your user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withFacets(Facet... facets) {
        if (this.facets == null) {
            setFacets(new java.util.ArrayList<Facet>(facets.length));
        }
        for (Facet ele : facets) {
            this.facets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of documents attributes. Amazon Kendra returns a count for each attribute key specified. You can use
     * this information to help narrow the search for your user.
     * </p>
     * 
     * @param facets
     *        An array of documents attributes. Amazon Kendra returns a count for each attribute key specified. You can
     *        use this information to help narrow the search for your user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withFacets(java.util.Collection<Facet> facets) {
        setFacets(facets);
        return this;
    }

    /**
     * <p>
     * An array of document attributes to include in the response. No other document attributes are included in the
     * response. By default all document attributes are included in the response.
     * </p>
     * 
     * @return An array of document attributes to include in the response. No other document attributes are included in
     *         the response. By default all document attributes are included in the response.
     */

    public java.util.List<String> getRequestedDocumentAttributes() {
        return requestedDocumentAttributes;
    }

    /**
     * <p>
     * An array of document attributes to include in the response. No other document attributes are included in the
     * response. By default all document attributes are included in the response.
     * </p>
     * 
     * @param requestedDocumentAttributes
     *        An array of document attributes to include in the response. No other document attributes are included in
     *        the response. By default all document attributes are included in the response.
     */

    public void setRequestedDocumentAttributes(java.util.Collection<String> requestedDocumentAttributes) {
        if (requestedDocumentAttributes == null) {
            this.requestedDocumentAttributes = null;
            return;
        }

        this.requestedDocumentAttributes = new java.util.ArrayList<String>(requestedDocumentAttributes);
    }

    /**
     * <p>
     * An array of document attributes to include in the response. No other document attributes are included in the
     * response. By default all document attributes are included in the response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRequestedDocumentAttributes(java.util.Collection)} or
     * {@link #withRequestedDocumentAttributes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param requestedDocumentAttributes
     *        An array of document attributes to include in the response. No other document attributes are included in
     *        the response. By default all document attributes are included in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withRequestedDocumentAttributes(String... requestedDocumentAttributes) {
        if (this.requestedDocumentAttributes == null) {
            setRequestedDocumentAttributes(new java.util.ArrayList<String>(requestedDocumentAttributes.length));
        }
        for (String ele : requestedDocumentAttributes) {
            this.requestedDocumentAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of document attributes to include in the response. No other document attributes are included in the
     * response. By default all document attributes are included in the response.
     * </p>
     * 
     * @param requestedDocumentAttributes
     *        An array of document attributes to include in the response. No other document attributes are included in
     *        the response. By default all document attributes are included in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withRequestedDocumentAttributes(java.util.Collection<String> requestedDocumentAttributes) {
        setRequestedDocumentAttributes(requestedDocumentAttributes);
        return this;
    }

    /**
     * <p>
     * Sets the type of query. Only results for the specified query type are returned.
     * </p>
     * 
     * @param queryResultTypeFilter
     *        Sets the type of query. Only results for the specified query type are returned.
     * @see QueryResultType
     */

    public void setQueryResultTypeFilter(String queryResultTypeFilter) {
        this.queryResultTypeFilter = queryResultTypeFilter;
    }

    /**
     * <p>
     * Sets the type of query. Only results for the specified query type are returned.
     * </p>
     * 
     * @return Sets the type of query. Only results for the specified query type are returned.
     * @see QueryResultType
     */

    public String getQueryResultTypeFilter() {
        return this.queryResultTypeFilter;
    }

    /**
     * <p>
     * Sets the type of query. Only results for the specified query type are returned.
     * </p>
     * 
     * @param queryResultTypeFilter
     *        Sets the type of query. Only results for the specified query type are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryResultType
     */

    public QueryRequest withQueryResultTypeFilter(String queryResultTypeFilter) {
        setQueryResultTypeFilter(queryResultTypeFilter);
        return this;
    }

    /**
     * <p>
     * Sets the type of query. Only results for the specified query type are returned.
     * </p>
     * 
     * @param queryResultTypeFilter
     *        Sets the type of query. Only results for the specified query type are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryResultType
     */

    public QueryRequest withQueryResultTypeFilter(QueryResultType queryResultTypeFilter) {
        this.queryResultTypeFilter = queryResultTypeFilter.toString();
        return this;
    }

    /**
     * <p>
     * Query results are returned in pages the size of the <code>PageSize</code> parameter. By default, Amazon Kendra
     * returns the first page of results. Use this parameter to get result pages after the first one.
     * </p>
     * 
     * @param pageNumber
     *        Query results are returned in pages the size of the <code>PageSize</code> parameter. By default, Amazon
     *        Kendra returns the first page of results. Use this parameter to get result pages after the first one.
     */

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * <p>
     * Query results are returned in pages the size of the <code>PageSize</code> parameter. By default, Amazon Kendra
     * returns the first page of results. Use this parameter to get result pages after the first one.
     * </p>
     * 
     * @return Query results are returned in pages the size of the <code>PageSize</code> parameter. By default, Amazon
     *         Kendra returns the first page of results. Use this parameter to get result pages after the first one.
     */

    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * <p>
     * Query results are returned in pages the size of the <code>PageSize</code> parameter. By default, Amazon Kendra
     * returns the first page of results. Use this parameter to get result pages after the first one.
     * </p>
     * 
     * @param pageNumber
     *        Query results are returned in pages the size of the <code>PageSize</code> parameter. By default, Amazon
     *        Kendra returns the first page of results. Use this parameter to get result pages after the first one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withPageNumber(Integer pageNumber) {
        setPageNumber(pageNumber);
        return this;
    }

    /**
     * <p>
     * Sets the number of results that are returned in each page of results. The default page size is 100.
     * </p>
     * 
     * @param pageSize
     *        Sets the number of results that are returned in each page of results. The default page size is 100.
     */

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * Sets the number of results that are returned in each page of results. The default page size is 100.
     * </p>
     * 
     * @return Sets the number of results that are returned in each page of results. The default page size is 100.
     */

    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * <p>
     * Sets the number of results that are returned in each page of results. The default page size is 100.
     * </p>
     * 
     * @param pageSize
     *        Sets the number of results that are returned in each page of results. The default page size is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryRequest withPageSize(Integer pageSize) {
        setPageSize(pageSize);
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
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
        if (getQueryText() != null)
            sb.append("QueryText: ").append(getQueryText()).append(",");
        if (getAttributeFilter() != null)
            sb.append("AttributeFilter: ").append(getAttributeFilter()).append(",");
        if (getFacets() != null)
            sb.append("Facets: ").append(getFacets()).append(",");
        if (getRequestedDocumentAttributes() != null)
            sb.append("RequestedDocumentAttributes: ").append(getRequestedDocumentAttributes()).append(",");
        if (getQueryResultTypeFilter() != null)
            sb.append("QueryResultTypeFilter: ").append(getQueryResultTypeFilter()).append(",");
        if (getPageNumber() != null)
            sb.append("PageNumber: ").append(getPageNumber()).append(",");
        if (getPageSize() != null)
            sb.append("PageSize: ").append(getPageSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryRequest == false)
            return false;
        QueryRequest other = (QueryRequest) obj;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getQueryText() == null ^ this.getQueryText() == null)
            return false;
        if (other.getQueryText() != null && other.getQueryText().equals(this.getQueryText()) == false)
            return false;
        if (other.getAttributeFilter() == null ^ this.getAttributeFilter() == null)
            return false;
        if (other.getAttributeFilter() != null && other.getAttributeFilter().equals(this.getAttributeFilter()) == false)
            return false;
        if (other.getFacets() == null ^ this.getFacets() == null)
            return false;
        if (other.getFacets() != null && other.getFacets().equals(this.getFacets()) == false)
            return false;
        if (other.getRequestedDocumentAttributes() == null ^ this.getRequestedDocumentAttributes() == null)
            return false;
        if (other.getRequestedDocumentAttributes() != null && other.getRequestedDocumentAttributes().equals(this.getRequestedDocumentAttributes()) == false)
            return false;
        if (other.getQueryResultTypeFilter() == null ^ this.getQueryResultTypeFilter() == null)
            return false;
        if (other.getQueryResultTypeFilter() != null && other.getQueryResultTypeFilter().equals(this.getQueryResultTypeFilter()) == false)
            return false;
        if (other.getPageNumber() == null ^ this.getPageNumber() == null)
            return false;
        if (other.getPageNumber() != null && other.getPageNumber().equals(this.getPageNumber()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getQueryText() == null) ? 0 : getQueryText().hashCode());
        hashCode = prime * hashCode + ((getAttributeFilter() == null) ? 0 : getAttributeFilter().hashCode());
        hashCode = prime * hashCode + ((getFacets() == null) ? 0 : getFacets().hashCode());
        hashCode = prime * hashCode + ((getRequestedDocumentAttributes() == null) ? 0 : getRequestedDocumentAttributes().hashCode());
        hashCode = prime * hashCode + ((getQueryResultTypeFilter() == null) ? 0 : getQueryResultTypeFilter().hashCode());
        hashCode = prime * hashCode + ((getPageNumber() == null) ? 0 : getPageNumber().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        return hashCode;
    }

    @Override
    public QueryRequest clone() {
        return (QueryRequest) super.clone();
    }

}
