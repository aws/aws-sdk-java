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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/Retrieve" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetrieveRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the index to retrieve relevant passages for the search.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The input query text to retrieve relevant passages for the search. Amazon Kendra truncates queries at 30 token
     * words, which excludes punctuation and stop words. Truncation still applies if you use Boolean or more advanced,
     * complex queries. For example, <code>Timeoff AND October AND Category:HR</code> is counted as 3 tokens:
     * <code>timeoff</code>, <code>october</code>, <code>hr</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/searching-example.html#searching-index-query-syntax">Searching
     * with advanced query syntax</a> in the Amazon Kendra Developer Guide.
     * </p>
     */
    private String queryText;
    /**
     * <p>
     * Filters search results by document fields/attributes. You can only provide one attribute filter; however, the
     * <code>AndAllFilters</code>, <code>NotFilter</code>, and <code>OrAllFilters</code> parameters contain a list of
     * other filters.
     * </p>
     * <p>
     * The <code>AttributeFilter</code> parameter means you can create a set of filtering rules that a document must
     * satisfy to be included in the query results.
     * </p>
     */
    private AttributeFilter attributeFilter;
    /**
     * <p>
     * A list of document fields/attributes to include in the response. You can limit the response to include certain
     * document fields. By default, all document fields are included in the response.
     * </p>
     */
    private java.util.List<String> requestedDocumentAttributes;
    /**
     * <p>
     * Overrides relevance tuning configurations of fields/attributes set at the index level.
     * </p>
     * <p>
     * If you use this API to override the relevance tuning configured at the index level, but there is no relevance
     * tuning configured at the index level, then Amazon Kendra does not apply any relevance tuning.
     * </p>
     * <p>
     * If there is relevance tuning configured for fields at the index level, and you use this API to override only some
     * of these fields, then for the fields you did not override, the importance is set to 1.
     * </p>
     */
    private java.util.List<DocumentRelevanceConfiguration> documentRelevanceOverrideConfigurations;
    /**
     * <p>
     * Retrieved relevant passages are returned in pages the size of the <code>PageSize</code> parameter. By default,
     * Amazon Kendra returns the first page of results. Use this parameter to get result pages after the first one.
     * </p>
     */
    private Integer pageNumber;
    /**
     * <p>
     * Sets the number of retrieved relevant passages that are returned in each page of results. The default page size
     * is 10. The maximum number of results returned is 100. If you ask for more than 100 results, only 100 are
     * returned.
     * </p>
     */
    private Integer pageSize;
    /**
     * <p>
     * The user context token or user and group information.
     * </p>
     */
    private UserContext userContext;

    /**
     * <p>
     * The identifier of the index to retrieve relevant passages for the search.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index to retrieve relevant passages for the search.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index to retrieve relevant passages for the search.
     * </p>
     * 
     * @return The identifier of the index to retrieve relevant passages for the search.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index to retrieve relevant passages for the search.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index to retrieve relevant passages for the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The input query text to retrieve relevant passages for the search. Amazon Kendra truncates queries at 30 token
     * words, which excludes punctuation and stop words. Truncation still applies if you use Boolean or more advanced,
     * complex queries. For example, <code>Timeoff AND October AND Category:HR</code> is counted as 3 tokens:
     * <code>timeoff</code>, <code>october</code>, <code>hr</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/searching-example.html#searching-index-query-syntax">Searching
     * with advanced query syntax</a> in the Amazon Kendra Developer Guide.
     * </p>
     * 
     * @param queryText
     *        The input query text to retrieve relevant passages for the search. Amazon Kendra truncates queries at 30
     *        token words, which excludes punctuation and stop words. Truncation still applies if you use Boolean or
     *        more advanced, complex queries. For example, <code>Timeoff AND October AND Category:HR</code> is counted
     *        as 3 tokens: <code>timeoff</code>, <code>october</code>, <code>hr</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/searching-example.html#searching-index-query-syntax">
     *        Searching with advanced query syntax</a> in the Amazon Kendra Developer Guide.
     */

    public void setQueryText(String queryText) {
        this.queryText = queryText;
    }

    /**
     * <p>
     * The input query text to retrieve relevant passages for the search. Amazon Kendra truncates queries at 30 token
     * words, which excludes punctuation and stop words. Truncation still applies if you use Boolean or more advanced,
     * complex queries. For example, <code>Timeoff AND October AND Category:HR</code> is counted as 3 tokens:
     * <code>timeoff</code>, <code>october</code>, <code>hr</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/searching-example.html#searching-index-query-syntax">Searching
     * with advanced query syntax</a> in the Amazon Kendra Developer Guide.
     * </p>
     * 
     * @return The input query text to retrieve relevant passages for the search. Amazon Kendra truncates queries at 30
     *         token words, which excludes punctuation and stop words. Truncation still applies if you use Boolean or
     *         more advanced, complex queries. For example, <code>Timeoff AND October AND Category:HR</code> is counted
     *         as 3 tokens: <code>timeoff</code>, <code>october</code>, <code>hr</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/searching-example.html#searching-index-query-syntax">
     *         Searching with advanced query syntax</a> in the Amazon Kendra Developer Guide.
     */

    public String getQueryText() {
        return this.queryText;
    }

    /**
     * <p>
     * The input query text to retrieve relevant passages for the search. Amazon Kendra truncates queries at 30 token
     * words, which excludes punctuation and stop words. Truncation still applies if you use Boolean or more advanced,
     * complex queries. For example, <code>Timeoff AND October AND Category:HR</code> is counted as 3 tokens:
     * <code>timeoff</code>, <code>october</code>, <code>hr</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/searching-example.html#searching-index-query-syntax">Searching
     * with advanced query syntax</a> in the Amazon Kendra Developer Guide.
     * </p>
     * 
     * @param queryText
     *        The input query text to retrieve relevant passages for the search. Amazon Kendra truncates queries at 30
     *        token words, which excludes punctuation and stop words. Truncation still applies if you use Boolean or
     *        more advanced, complex queries. For example, <code>Timeoff AND October AND Category:HR</code> is counted
     *        as 3 tokens: <code>timeoff</code>, <code>october</code>, <code>hr</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/searching-example.html#searching-index-query-syntax">
     *        Searching with advanced query syntax</a> in the Amazon Kendra Developer Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveRequest withQueryText(String queryText) {
        setQueryText(queryText);
        return this;
    }

    /**
     * <p>
     * Filters search results by document fields/attributes. You can only provide one attribute filter; however, the
     * <code>AndAllFilters</code>, <code>NotFilter</code>, and <code>OrAllFilters</code> parameters contain a list of
     * other filters.
     * </p>
     * <p>
     * The <code>AttributeFilter</code> parameter means you can create a set of filtering rules that a document must
     * satisfy to be included in the query results.
     * </p>
     * 
     * @param attributeFilter
     *        Filters search results by document fields/attributes. You can only provide one attribute filter; however,
     *        the <code>AndAllFilters</code>, <code>NotFilter</code>, and <code>OrAllFilters</code> parameters contain a
     *        list of other filters.</p>
     *        <p>
     *        The <code>AttributeFilter</code> parameter means you can create a set of filtering rules that a document
     *        must satisfy to be included in the query results.
     */

    public void setAttributeFilter(AttributeFilter attributeFilter) {
        this.attributeFilter = attributeFilter;
    }

    /**
     * <p>
     * Filters search results by document fields/attributes. You can only provide one attribute filter; however, the
     * <code>AndAllFilters</code>, <code>NotFilter</code>, and <code>OrAllFilters</code> parameters contain a list of
     * other filters.
     * </p>
     * <p>
     * The <code>AttributeFilter</code> parameter means you can create a set of filtering rules that a document must
     * satisfy to be included in the query results.
     * </p>
     * 
     * @return Filters search results by document fields/attributes. You can only provide one attribute filter; however,
     *         the <code>AndAllFilters</code>, <code>NotFilter</code>, and <code>OrAllFilters</code> parameters contain
     *         a list of other filters.</p>
     *         <p>
     *         The <code>AttributeFilter</code> parameter means you can create a set of filtering rules that a document
     *         must satisfy to be included in the query results.
     */

    public AttributeFilter getAttributeFilter() {
        return this.attributeFilter;
    }

    /**
     * <p>
     * Filters search results by document fields/attributes. You can only provide one attribute filter; however, the
     * <code>AndAllFilters</code>, <code>NotFilter</code>, and <code>OrAllFilters</code> parameters contain a list of
     * other filters.
     * </p>
     * <p>
     * The <code>AttributeFilter</code> parameter means you can create a set of filtering rules that a document must
     * satisfy to be included in the query results.
     * </p>
     * 
     * @param attributeFilter
     *        Filters search results by document fields/attributes. You can only provide one attribute filter; however,
     *        the <code>AndAllFilters</code>, <code>NotFilter</code>, and <code>OrAllFilters</code> parameters contain a
     *        list of other filters.</p>
     *        <p>
     *        The <code>AttributeFilter</code> parameter means you can create a set of filtering rules that a document
     *        must satisfy to be included in the query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveRequest withAttributeFilter(AttributeFilter attributeFilter) {
        setAttributeFilter(attributeFilter);
        return this;
    }

    /**
     * <p>
     * A list of document fields/attributes to include in the response. You can limit the response to include certain
     * document fields. By default, all document fields are included in the response.
     * </p>
     * 
     * @return A list of document fields/attributes to include in the response. You can limit the response to include
     *         certain document fields. By default, all document fields are included in the response.
     */

    public java.util.List<String> getRequestedDocumentAttributes() {
        return requestedDocumentAttributes;
    }

    /**
     * <p>
     * A list of document fields/attributes to include in the response. You can limit the response to include certain
     * document fields. By default, all document fields are included in the response.
     * </p>
     * 
     * @param requestedDocumentAttributes
     *        A list of document fields/attributes to include in the response. You can limit the response to include
     *        certain document fields. By default, all document fields are included in the response.
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
     * A list of document fields/attributes to include in the response. You can limit the response to include certain
     * document fields. By default, all document fields are included in the response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRequestedDocumentAttributes(java.util.Collection)} or
     * {@link #withRequestedDocumentAttributes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param requestedDocumentAttributes
     *        A list of document fields/attributes to include in the response. You can limit the response to include
     *        certain document fields. By default, all document fields are included in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveRequest withRequestedDocumentAttributes(String... requestedDocumentAttributes) {
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
     * A list of document fields/attributes to include in the response. You can limit the response to include certain
     * document fields. By default, all document fields are included in the response.
     * </p>
     * 
     * @param requestedDocumentAttributes
     *        A list of document fields/attributes to include in the response. You can limit the response to include
     *        certain document fields. By default, all document fields are included in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveRequest withRequestedDocumentAttributes(java.util.Collection<String> requestedDocumentAttributes) {
        setRequestedDocumentAttributes(requestedDocumentAttributes);
        return this;
    }

    /**
     * <p>
     * Overrides relevance tuning configurations of fields/attributes set at the index level.
     * </p>
     * <p>
     * If you use this API to override the relevance tuning configured at the index level, but there is no relevance
     * tuning configured at the index level, then Amazon Kendra does not apply any relevance tuning.
     * </p>
     * <p>
     * If there is relevance tuning configured for fields at the index level, and you use this API to override only some
     * of these fields, then for the fields you did not override, the importance is set to 1.
     * </p>
     * 
     * @return Overrides relevance tuning configurations of fields/attributes set at the index level.</p>
     *         <p>
     *         If you use this API to override the relevance tuning configured at the index level, but there is no
     *         relevance tuning configured at the index level, then Amazon Kendra does not apply any relevance tuning.
     *         </p>
     *         <p>
     *         If there is relevance tuning configured for fields at the index level, and you use this API to override
     *         only some of these fields, then for the fields you did not override, the importance is set to 1.
     */

    public java.util.List<DocumentRelevanceConfiguration> getDocumentRelevanceOverrideConfigurations() {
        return documentRelevanceOverrideConfigurations;
    }

    /**
     * <p>
     * Overrides relevance tuning configurations of fields/attributes set at the index level.
     * </p>
     * <p>
     * If you use this API to override the relevance tuning configured at the index level, but there is no relevance
     * tuning configured at the index level, then Amazon Kendra does not apply any relevance tuning.
     * </p>
     * <p>
     * If there is relevance tuning configured for fields at the index level, and you use this API to override only some
     * of these fields, then for the fields you did not override, the importance is set to 1.
     * </p>
     * 
     * @param documentRelevanceOverrideConfigurations
     *        Overrides relevance tuning configurations of fields/attributes set at the index level.</p>
     *        <p>
     *        If you use this API to override the relevance tuning configured at the index level, but there is no
     *        relevance tuning configured at the index level, then Amazon Kendra does not apply any relevance tuning.
     *        </p>
     *        <p>
     *        If there is relevance tuning configured for fields at the index level, and you use this API to override
     *        only some of these fields, then for the fields you did not override, the importance is set to 1.
     */

    public void setDocumentRelevanceOverrideConfigurations(java.util.Collection<DocumentRelevanceConfiguration> documentRelevanceOverrideConfigurations) {
        if (documentRelevanceOverrideConfigurations == null) {
            this.documentRelevanceOverrideConfigurations = null;
            return;
        }

        this.documentRelevanceOverrideConfigurations = new java.util.ArrayList<DocumentRelevanceConfiguration>(documentRelevanceOverrideConfigurations);
    }

    /**
     * <p>
     * Overrides relevance tuning configurations of fields/attributes set at the index level.
     * </p>
     * <p>
     * If you use this API to override the relevance tuning configured at the index level, but there is no relevance
     * tuning configured at the index level, then Amazon Kendra does not apply any relevance tuning.
     * </p>
     * <p>
     * If there is relevance tuning configured for fields at the index level, and you use this API to override only some
     * of these fields, then for the fields you did not override, the importance is set to 1.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDocumentRelevanceOverrideConfigurations(java.util.Collection)} or
     * {@link #withDocumentRelevanceOverrideConfigurations(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param documentRelevanceOverrideConfigurations
     *        Overrides relevance tuning configurations of fields/attributes set at the index level.</p>
     *        <p>
     *        If you use this API to override the relevance tuning configured at the index level, but there is no
     *        relevance tuning configured at the index level, then Amazon Kendra does not apply any relevance tuning.
     *        </p>
     *        <p>
     *        If there is relevance tuning configured for fields at the index level, and you use this API to override
     *        only some of these fields, then for the fields you did not override, the importance is set to 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveRequest withDocumentRelevanceOverrideConfigurations(DocumentRelevanceConfiguration... documentRelevanceOverrideConfigurations) {
        if (this.documentRelevanceOverrideConfigurations == null) {
            setDocumentRelevanceOverrideConfigurations(new java.util.ArrayList<DocumentRelevanceConfiguration>(documentRelevanceOverrideConfigurations.length));
        }
        for (DocumentRelevanceConfiguration ele : documentRelevanceOverrideConfigurations) {
            this.documentRelevanceOverrideConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Overrides relevance tuning configurations of fields/attributes set at the index level.
     * </p>
     * <p>
     * If you use this API to override the relevance tuning configured at the index level, but there is no relevance
     * tuning configured at the index level, then Amazon Kendra does not apply any relevance tuning.
     * </p>
     * <p>
     * If there is relevance tuning configured for fields at the index level, and you use this API to override only some
     * of these fields, then for the fields you did not override, the importance is set to 1.
     * </p>
     * 
     * @param documentRelevanceOverrideConfigurations
     *        Overrides relevance tuning configurations of fields/attributes set at the index level.</p>
     *        <p>
     *        If you use this API to override the relevance tuning configured at the index level, but there is no
     *        relevance tuning configured at the index level, then Amazon Kendra does not apply any relevance tuning.
     *        </p>
     *        <p>
     *        If there is relevance tuning configured for fields at the index level, and you use this API to override
     *        only some of these fields, then for the fields you did not override, the importance is set to 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveRequest withDocumentRelevanceOverrideConfigurations(
            java.util.Collection<DocumentRelevanceConfiguration> documentRelevanceOverrideConfigurations) {
        setDocumentRelevanceOverrideConfigurations(documentRelevanceOverrideConfigurations);
        return this;
    }

    /**
     * <p>
     * Retrieved relevant passages are returned in pages the size of the <code>PageSize</code> parameter. By default,
     * Amazon Kendra returns the first page of results. Use this parameter to get result pages after the first one.
     * </p>
     * 
     * @param pageNumber
     *        Retrieved relevant passages are returned in pages the size of the <code>PageSize</code> parameter. By
     *        default, Amazon Kendra returns the first page of results. Use this parameter to get result pages after the
     *        first one.
     */

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * <p>
     * Retrieved relevant passages are returned in pages the size of the <code>PageSize</code> parameter. By default,
     * Amazon Kendra returns the first page of results. Use this parameter to get result pages after the first one.
     * </p>
     * 
     * @return Retrieved relevant passages are returned in pages the size of the <code>PageSize</code> parameter. By
     *         default, Amazon Kendra returns the first page of results. Use this parameter to get result pages after
     *         the first one.
     */

    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * <p>
     * Retrieved relevant passages are returned in pages the size of the <code>PageSize</code> parameter. By default,
     * Amazon Kendra returns the first page of results. Use this parameter to get result pages after the first one.
     * </p>
     * 
     * @param pageNumber
     *        Retrieved relevant passages are returned in pages the size of the <code>PageSize</code> parameter. By
     *        default, Amazon Kendra returns the first page of results. Use this parameter to get result pages after the
     *        first one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveRequest withPageNumber(Integer pageNumber) {
        setPageNumber(pageNumber);
        return this;
    }

    /**
     * <p>
     * Sets the number of retrieved relevant passages that are returned in each page of results. The default page size
     * is 10. The maximum number of results returned is 100. If you ask for more than 100 results, only 100 are
     * returned.
     * </p>
     * 
     * @param pageSize
     *        Sets the number of retrieved relevant passages that are returned in each page of results. The default page
     *        size is 10. The maximum number of results returned is 100. If you ask for more than 100 results, only 100
     *        are returned.
     */

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * Sets the number of retrieved relevant passages that are returned in each page of results. The default page size
     * is 10. The maximum number of results returned is 100. If you ask for more than 100 results, only 100 are
     * returned.
     * </p>
     * 
     * @return Sets the number of retrieved relevant passages that are returned in each page of results. The default
     *         page size is 10. The maximum number of results returned is 100. If you ask for more than 100 results,
     *         only 100 are returned.
     */

    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * <p>
     * Sets the number of retrieved relevant passages that are returned in each page of results. The default page size
     * is 10. The maximum number of results returned is 100. If you ask for more than 100 results, only 100 are
     * returned.
     * </p>
     * 
     * @param pageSize
     *        Sets the number of retrieved relevant passages that are returned in each page of results. The default page
     *        size is 10. The maximum number of results returned is 100. If you ask for more than 100 results, only 100
     *        are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveRequest withPageSize(Integer pageSize) {
        setPageSize(pageSize);
        return this;
    }

    /**
     * <p>
     * The user context token or user and group information.
     * </p>
     * 
     * @param userContext
     *        The user context token or user and group information.
     */

    public void setUserContext(UserContext userContext) {
        this.userContext = userContext;
    }

    /**
     * <p>
     * The user context token or user and group information.
     * </p>
     * 
     * @return The user context token or user and group information.
     */

    public UserContext getUserContext() {
        return this.userContext;
    }

    /**
     * <p>
     * The user context token or user and group information.
     * </p>
     * 
     * @param userContext
     *        The user context token or user and group information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveRequest withUserContext(UserContext userContext) {
        setUserContext(userContext);
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
        if (getRequestedDocumentAttributes() != null)
            sb.append("RequestedDocumentAttributes: ").append(getRequestedDocumentAttributes()).append(",");
        if (getDocumentRelevanceOverrideConfigurations() != null)
            sb.append("DocumentRelevanceOverrideConfigurations: ").append(getDocumentRelevanceOverrideConfigurations()).append(",");
        if (getPageNumber() != null)
            sb.append("PageNumber: ").append(getPageNumber()).append(",");
        if (getPageSize() != null)
            sb.append("PageSize: ").append(getPageSize()).append(",");
        if (getUserContext() != null)
            sb.append("UserContext: ").append(getUserContext());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetrieveRequest == false)
            return false;
        RetrieveRequest other = (RetrieveRequest) obj;
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
        if (other.getRequestedDocumentAttributes() == null ^ this.getRequestedDocumentAttributes() == null)
            return false;
        if (other.getRequestedDocumentAttributes() != null && other.getRequestedDocumentAttributes().equals(this.getRequestedDocumentAttributes()) == false)
            return false;
        if (other.getDocumentRelevanceOverrideConfigurations() == null ^ this.getDocumentRelevanceOverrideConfigurations() == null)
            return false;
        if (other.getDocumentRelevanceOverrideConfigurations() != null
                && other.getDocumentRelevanceOverrideConfigurations().equals(this.getDocumentRelevanceOverrideConfigurations()) == false)
            return false;
        if (other.getPageNumber() == null ^ this.getPageNumber() == null)
            return false;
        if (other.getPageNumber() != null && other.getPageNumber().equals(this.getPageNumber()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        if (other.getUserContext() == null ^ this.getUserContext() == null)
            return false;
        if (other.getUserContext() != null && other.getUserContext().equals(this.getUserContext()) == false)
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
        hashCode = prime * hashCode + ((getRequestedDocumentAttributes() == null) ? 0 : getRequestedDocumentAttributes().hashCode());
        hashCode = prime * hashCode + ((getDocumentRelevanceOverrideConfigurations() == null) ? 0 : getDocumentRelevanceOverrideConfigurations().hashCode());
        hashCode = prime * hashCode + ((getPageNumber() == null) ? 0 : getPageNumber().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        hashCode = prime * hashCode + ((getUserContext() == null) ? 0 : getUserContext().hashCode());
        return hashCode;
    }

    @Override
    public RetrieveRequest clone() {
        return (RetrieveRequest) super.clone();
    }

}
