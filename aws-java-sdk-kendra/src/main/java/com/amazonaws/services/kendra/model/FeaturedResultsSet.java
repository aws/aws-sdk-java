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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A set of featured results that are displayed at the top of your search results. Featured results are placed above all
 * other results for certain queries. If there's an exact match of a query, then one or more specific documents are
 * featured in the search results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/FeaturedResultsSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FeaturedResultsSet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the set of featured results.
     * </p>
     */
    private String featuredResultsSetId;
    /**
     * <p>
     * The name for the set of featured results.
     * </p>
     */
    private String featuredResultsSetName;
    /**
     * <p>
     * The description for the set of featured results.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The current status of the set of featured results. When the value is <code>ACTIVE</code>, featured results are
     * ready for use. You can still configure your settings before setting the status to <code>ACTIVE</code>. You can
     * set the status to <code>ACTIVE</code> or <code>INACTIVE</code> using the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateFeaturedResultsSet.html"
     * >UpdateFeaturedResultsSet</a> API. The queries you specify for featured results must be unique per featured
     * results set for each index, whether the status is <code>ACTIVE</code> or <code>INACTIVE</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The list of queries for featuring results.
     * </p>
     * <p>
     * Specific queries are mapped to specific documents for featuring in the results. If a query contains an exact
     * match, then one or more specific documents are featured in the results. The exact match applies to the full
     * query. For example, if you only specify 'Kendra', queries such as 'How does kendra semantically rank results?'
     * will not render the featured results. Featured results are designed for specific queries, rather than queries
     * that are too broad in scope.
     * </p>
     */
    private java.util.List<String> queryTexts;
    /**
     * <p>
     * The list of document IDs for the documents you want to feature at the top of the search results page. You can use
     * the <a href="https://docs.aws.amazon.com/kendra/latest/dg/API_Query.html">Query</a> API to search for specific
     * documents with their document IDs included in the result items, or you can use the console.
     * </p>
     * <p>
     * You can add up to four featured documents. You can request to increase this limit by contacting <a
     * href="http://aws.amazon.com/contact-us/">Support</a>.
     * </p>
     * <p>
     * Specific queries are mapped to specific documents for featuring in the results. If a query contains an exact
     * match, then one or more specific documents are featured in the results. The exact match applies to the full
     * query. For example, if you only specify 'Kendra', queries such as 'How does kendra semantically rank results?'
     * will not render the featured results. Featured results are designed for specific queries, rather than queries
     * that are too broad in scope.
     * </p>
     */
    private java.util.List<FeaturedDocument> featuredDocuments;
    /**
     * <p>
     * The Unix timestamp when the set of featured results was last updated.
     * </p>
     */
    private Long lastUpdatedTimestamp;
    /**
     * <p>
     * The Unix timestamp when the set of featured results was created.
     * </p>
     */
    private Long creationTimestamp;

    /**
     * <p>
     * The identifier of the set of featured results.
     * </p>
     * 
     * @param featuredResultsSetId
     *        The identifier of the set of featured results.
     */

    public void setFeaturedResultsSetId(String featuredResultsSetId) {
        this.featuredResultsSetId = featuredResultsSetId;
    }

    /**
     * <p>
     * The identifier of the set of featured results.
     * </p>
     * 
     * @return The identifier of the set of featured results.
     */

    public String getFeaturedResultsSetId() {
        return this.featuredResultsSetId;
    }

    /**
     * <p>
     * The identifier of the set of featured results.
     * </p>
     * 
     * @param featuredResultsSetId
     *        The identifier of the set of featured results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeaturedResultsSet withFeaturedResultsSetId(String featuredResultsSetId) {
        setFeaturedResultsSetId(featuredResultsSetId);
        return this;
    }

    /**
     * <p>
     * The name for the set of featured results.
     * </p>
     * 
     * @param featuredResultsSetName
     *        The name for the set of featured results.
     */

    public void setFeaturedResultsSetName(String featuredResultsSetName) {
        this.featuredResultsSetName = featuredResultsSetName;
    }

    /**
     * <p>
     * The name for the set of featured results.
     * </p>
     * 
     * @return The name for the set of featured results.
     */

    public String getFeaturedResultsSetName() {
        return this.featuredResultsSetName;
    }

    /**
     * <p>
     * The name for the set of featured results.
     * </p>
     * 
     * @param featuredResultsSetName
     *        The name for the set of featured results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeaturedResultsSet withFeaturedResultsSetName(String featuredResultsSetName) {
        setFeaturedResultsSetName(featuredResultsSetName);
        return this;
    }

    /**
     * <p>
     * The description for the set of featured results.
     * </p>
     * 
     * @param description
     *        The description for the set of featured results.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the set of featured results.
     * </p>
     * 
     * @return The description for the set of featured results.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the set of featured results.
     * </p>
     * 
     * @param description
     *        The description for the set of featured results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeaturedResultsSet withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The current status of the set of featured results. When the value is <code>ACTIVE</code>, featured results are
     * ready for use. You can still configure your settings before setting the status to <code>ACTIVE</code>. You can
     * set the status to <code>ACTIVE</code> or <code>INACTIVE</code> using the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateFeaturedResultsSet.html"
     * >UpdateFeaturedResultsSet</a> API. The queries you specify for featured results must be unique per featured
     * results set for each index, whether the status is <code>ACTIVE</code> or <code>INACTIVE</code>.
     * </p>
     * 
     * @param status
     *        The current status of the set of featured results. When the value is <code>ACTIVE</code>, featured results
     *        are ready for use. You can still configure your settings before setting the status to <code>ACTIVE</code>.
     *        You can set the status to <code>ACTIVE</code> or <code>INACTIVE</code> using the <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateFeaturedResultsSet.html"
     *        >UpdateFeaturedResultsSet</a> API. The queries you specify for featured results must be unique per
     *        featured results set for each index, whether the status is <code>ACTIVE</code> or <code>INACTIVE</code>.
     * @see FeaturedResultsSetStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the set of featured results. When the value is <code>ACTIVE</code>, featured results are
     * ready for use. You can still configure your settings before setting the status to <code>ACTIVE</code>. You can
     * set the status to <code>ACTIVE</code> or <code>INACTIVE</code> using the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateFeaturedResultsSet.html"
     * >UpdateFeaturedResultsSet</a> API. The queries you specify for featured results must be unique per featured
     * results set for each index, whether the status is <code>ACTIVE</code> or <code>INACTIVE</code>.
     * </p>
     * 
     * @return The current status of the set of featured results. When the value is <code>ACTIVE</code>, featured
     *         results are ready for use. You can still configure your settings before setting the status to
     *         <code>ACTIVE</code>. You can set the status to <code>ACTIVE</code> or <code>INACTIVE</code> using the <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateFeaturedResultsSet.html">
     *         UpdateFeaturedResultsSet</a> API. The queries you specify for featured results must be unique per
     *         featured results set for each index, whether the status is <code>ACTIVE</code> or <code>INACTIVE</code>.
     * @see FeaturedResultsSetStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the set of featured results. When the value is <code>ACTIVE</code>, featured results are
     * ready for use. You can still configure your settings before setting the status to <code>ACTIVE</code>. You can
     * set the status to <code>ACTIVE</code> or <code>INACTIVE</code> using the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateFeaturedResultsSet.html"
     * >UpdateFeaturedResultsSet</a> API. The queries you specify for featured results must be unique per featured
     * results set for each index, whether the status is <code>ACTIVE</code> or <code>INACTIVE</code>.
     * </p>
     * 
     * @param status
     *        The current status of the set of featured results. When the value is <code>ACTIVE</code>, featured results
     *        are ready for use. You can still configure your settings before setting the status to <code>ACTIVE</code>.
     *        You can set the status to <code>ACTIVE</code> or <code>INACTIVE</code> using the <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateFeaturedResultsSet.html"
     *        >UpdateFeaturedResultsSet</a> API. The queries you specify for featured results must be unique per
     *        featured results set for each index, whether the status is <code>ACTIVE</code> or <code>INACTIVE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeaturedResultsSetStatus
     */

    public FeaturedResultsSet withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the set of featured results. When the value is <code>ACTIVE</code>, featured results are
     * ready for use. You can still configure your settings before setting the status to <code>ACTIVE</code>. You can
     * set the status to <code>ACTIVE</code> or <code>INACTIVE</code> using the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateFeaturedResultsSet.html"
     * >UpdateFeaturedResultsSet</a> API. The queries you specify for featured results must be unique per featured
     * results set for each index, whether the status is <code>ACTIVE</code> or <code>INACTIVE</code>.
     * </p>
     * 
     * @param status
     *        The current status of the set of featured results. When the value is <code>ACTIVE</code>, featured results
     *        are ready for use. You can still configure your settings before setting the status to <code>ACTIVE</code>.
     *        You can set the status to <code>ACTIVE</code> or <code>INACTIVE</code> using the <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateFeaturedResultsSet.html"
     *        >UpdateFeaturedResultsSet</a> API. The queries you specify for featured results must be unique per
     *        featured results set for each index, whether the status is <code>ACTIVE</code> or <code>INACTIVE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeaturedResultsSetStatus
     */

    public FeaturedResultsSet withStatus(FeaturedResultsSetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The list of queries for featuring results.
     * </p>
     * <p>
     * Specific queries are mapped to specific documents for featuring in the results. If a query contains an exact
     * match, then one or more specific documents are featured in the results. The exact match applies to the full
     * query. For example, if you only specify 'Kendra', queries such as 'How does kendra semantically rank results?'
     * will not render the featured results. Featured results are designed for specific queries, rather than queries
     * that are too broad in scope.
     * </p>
     * 
     * @return The list of queries for featuring results.</p>
     *         <p>
     *         Specific queries are mapped to specific documents for featuring in the results. If a query contains an
     *         exact match, then one or more specific documents are featured in the results. The exact match applies to
     *         the full query. For example, if you only specify 'Kendra', queries such as 'How does kendra semantically
     *         rank results?' will not render the featured results. Featured results are designed for specific queries,
     *         rather than queries that are too broad in scope.
     */

    public java.util.List<String> getQueryTexts() {
        return queryTexts;
    }

    /**
     * <p>
     * The list of queries for featuring results.
     * </p>
     * <p>
     * Specific queries are mapped to specific documents for featuring in the results. If a query contains an exact
     * match, then one or more specific documents are featured in the results. The exact match applies to the full
     * query. For example, if you only specify 'Kendra', queries such as 'How does kendra semantically rank results?'
     * will not render the featured results. Featured results are designed for specific queries, rather than queries
     * that are too broad in scope.
     * </p>
     * 
     * @param queryTexts
     *        The list of queries for featuring results.</p>
     *        <p>
     *        Specific queries are mapped to specific documents for featuring in the results. If a query contains an
     *        exact match, then one or more specific documents are featured in the results. The exact match applies to
     *        the full query. For example, if you only specify 'Kendra', queries such as 'How does kendra semantically
     *        rank results?' will not render the featured results. Featured results are designed for specific queries,
     *        rather than queries that are too broad in scope.
     */

    public void setQueryTexts(java.util.Collection<String> queryTexts) {
        if (queryTexts == null) {
            this.queryTexts = null;
            return;
        }

        this.queryTexts = new java.util.ArrayList<String>(queryTexts);
    }

    /**
     * <p>
     * The list of queries for featuring results.
     * </p>
     * <p>
     * Specific queries are mapped to specific documents for featuring in the results. If a query contains an exact
     * match, then one or more specific documents are featured in the results. The exact match applies to the full
     * query. For example, if you only specify 'Kendra', queries such as 'How does kendra semantically rank results?'
     * will not render the featured results. Featured results are designed for specific queries, rather than queries
     * that are too broad in scope.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQueryTexts(java.util.Collection)} or {@link #withQueryTexts(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param queryTexts
     *        The list of queries for featuring results.</p>
     *        <p>
     *        Specific queries are mapped to specific documents for featuring in the results. If a query contains an
     *        exact match, then one or more specific documents are featured in the results. The exact match applies to
     *        the full query. For example, if you only specify 'Kendra', queries such as 'How does kendra semantically
     *        rank results?' will not render the featured results. Featured results are designed for specific queries,
     *        rather than queries that are too broad in scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeaturedResultsSet withQueryTexts(String... queryTexts) {
        if (this.queryTexts == null) {
            setQueryTexts(new java.util.ArrayList<String>(queryTexts.length));
        }
        for (String ele : queryTexts) {
            this.queryTexts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of queries for featuring results.
     * </p>
     * <p>
     * Specific queries are mapped to specific documents for featuring in the results. If a query contains an exact
     * match, then one or more specific documents are featured in the results. The exact match applies to the full
     * query. For example, if you only specify 'Kendra', queries such as 'How does kendra semantically rank results?'
     * will not render the featured results. Featured results are designed for specific queries, rather than queries
     * that are too broad in scope.
     * </p>
     * 
     * @param queryTexts
     *        The list of queries for featuring results.</p>
     *        <p>
     *        Specific queries are mapped to specific documents for featuring in the results. If a query contains an
     *        exact match, then one or more specific documents are featured in the results. The exact match applies to
     *        the full query. For example, if you only specify 'Kendra', queries such as 'How does kendra semantically
     *        rank results?' will not render the featured results. Featured results are designed for specific queries,
     *        rather than queries that are too broad in scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeaturedResultsSet withQueryTexts(java.util.Collection<String> queryTexts) {
        setQueryTexts(queryTexts);
        return this;
    }

    /**
     * <p>
     * The list of document IDs for the documents you want to feature at the top of the search results page. You can use
     * the <a href="https://docs.aws.amazon.com/kendra/latest/dg/API_Query.html">Query</a> API to search for specific
     * documents with their document IDs included in the result items, or you can use the console.
     * </p>
     * <p>
     * You can add up to four featured documents. You can request to increase this limit by contacting <a
     * href="http://aws.amazon.com/contact-us/">Support</a>.
     * </p>
     * <p>
     * Specific queries are mapped to specific documents for featuring in the results. If a query contains an exact
     * match, then one or more specific documents are featured in the results. The exact match applies to the full
     * query. For example, if you only specify 'Kendra', queries such as 'How does kendra semantically rank results?'
     * will not render the featured results. Featured results are designed for specific queries, rather than queries
     * that are too broad in scope.
     * </p>
     * 
     * @return The list of document IDs for the documents you want to feature at the top of the search results page. You
     *         can use the <a href="https://docs.aws.amazon.com/kendra/latest/dg/API_Query.html">Query</a> API to search
     *         for specific documents with their document IDs included in the result items, or you can use the
     *         console.</p>
     *         <p>
     *         You can add up to four featured documents. You can request to increase this limit by contacting <a
     *         href="http://aws.amazon.com/contact-us/">Support</a>.
     *         </p>
     *         <p>
     *         Specific queries are mapped to specific documents for featuring in the results. If a query contains an
     *         exact match, then one or more specific documents are featured in the results. The exact match applies to
     *         the full query. For example, if you only specify 'Kendra', queries such as 'How does kendra semantically
     *         rank results?' will not render the featured results. Featured results are designed for specific queries,
     *         rather than queries that are too broad in scope.
     */

    public java.util.List<FeaturedDocument> getFeaturedDocuments() {
        return featuredDocuments;
    }

    /**
     * <p>
     * The list of document IDs for the documents you want to feature at the top of the search results page. You can use
     * the <a href="https://docs.aws.amazon.com/kendra/latest/dg/API_Query.html">Query</a> API to search for specific
     * documents with their document IDs included in the result items, or you can use the console.
     * </p>
     * <p>
     * You can add up to four featured documents. You can request to increase this limit by contacting <a
     * href="http://aws.amazon.com/contact-us/">Support</a>.
     * </p>
     * <p>
     * Specific queries are mapped to specific documents for featuring in the results. If a query contains an exact
     * match, then one or more specific documents are featured in the results. The exact match applies to the full
     * query. For example, if you only specify 'Kendra', queries such as 'How does kendra semantically rank results?'
     * will not render the featured results. Featured results are designed for specific queries, rather than queries
     * that are too broad in scope.
     * </p>
     * 
     * @param featuredDocuments
     *        The list of document IDs for the documents you want to feature at the top of the search results page. You
     *        can use the <a href="https://docs.aws.amazon.com/kendra/latest/dg/API_Query.html">Query</a> API to search
     *        for specific documents with their document IDs included in the result items, or you can use the
     *        console.</p>
     *        <p>
     *        You can add up to four featured documents. You can request to increase this limit by contacting <a
     *        href="http://aws.amazon.com/contact-us/">Support</a>.
     *        </p>
     *        <p>
     *        Specific queries are mapped to specific documents for featuring in the results. If a query contains an
     *        exact match, then one or more specific documents are featured in the results. The exact match applies to
     *        the full query. For example, if you only specify 'Kendra', queries such as 'How does kendra semantically
     *        rank results?' will not render the featured results. Featured results are designed for specific queries,
     *        rather than queries that are too broad in scope.
     */

    public void setFeaturedDocuments(java.util.Collection<FeaturedDocument> featuredDocuments) {
        if (featuredDocuments == null) {
            this.featuredDocuments = null;
            return;
        }

        this.featuredDocuments = new java.util.ArrayList<FeaturedDocument>(featuredDocuments);
    }

    /**
     * <p>
     * The list of document IDs for the documents you want to feature at the top of the search results page. You can use
     * the <a href="https://docs.aws.amazon.com/kendra/latest/dg/API_Query.html">Query</a> API to search for specific
     * documents with their document IDs included in the result items, or you can use the console.
     * </p>
     * <p>
     * You can add up to four featured documents. You can request to increase this limit by contacting <a
     * href="http://aws.amazon.com/contact-us/">Support</a>.
     * </p>
     * <p>
     * Specific queries are mapped to specific documents for featuring in the results. If a query contains an exact
     * match, then one or more specific documents are featured in the results. The exact match applies to the full
     * query. For example, if you only specify 'Kendra', queries such as 'How does kendra semantically rank results?'
     * will not render the featured results. Featured results are designed for specific queries, rather than queries
     * that are too broad in scope.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFeaturedDocuments(java.util.Collection)} or {@link #withFeaturedDocuments(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param featuredDocuments
     *        The list of document IDs for the documents you want to feature at the top of the search results page. You
     *        can use the <a href="https://docs.aws.amazon.com/kendra/latest/dg/API_Query.html">Query</a> API to search
     *        for specific documents with their document IDs included in the result items, or you can use the
     *        console.</p>
     *        <p>
     *        You can add up to four featured documents. You can request to increase this limit by contacting <a
     *        href="http://aws.amazon.com/contact-us/">Support</a>.
     *        </p>
     *        <p>
     *        Specific queries are mapped to specific documents for featuring in the results. If a query contains an
     *        exact match, then one or more specific documents are featured in the results. The exact match applies to
     *        the full query. For example, if you only specify 'Kendra', queries such as 'How does kendra semantically
     *        rank results?' will not render the featured results. Featured results are designed for specific queries,
     *        rather than queries that are too broad in scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeaturedResultsSet withFeaturedDocuments(FeaturedDocument... featuredDocuments) {
        if (this.featuredDocuments == null) {
            setFeaturedDocuments(new java.util.ArrayList<FeaturedDocument>(featuredDocuments.length));
        }
        for (FeaturedDocument ele : featuredDocuments) {
            this.featuredDocuments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of document IDs for the documents you want to feature at the top of the search results page. You can use
     * the <a href="https://docs.aws.amazon.com/kendra/latest/dg/API_Query.html">Query</a> API to search for specific
     * documents with their document IDs included in the result items, or you can use the console.
     * </p>
     * <p>
     * You can add up to four featured documents. You can request to increase this limit by contacting <a
     * href="http://aws.amazon.com/contact-us/">Support</a>.
     * </p>
     * <p>
     * Specific queries are mapped to specific documents for featuring in the results. If a query contains an exact
     * match, then one or more specific documents are featured in the results. The exact match applies to the full
     * query. For example, if you only specify 'Kendra', queries such as 'How does kendra semantically rank results?'
     * will not render the featured results. Featured results are designed for specific queries, rather than queries
     * that are too broad in scope.
     * </p>
     * 
     * @param featuredDocuments
     *        The list of document IDs for the documents you want to feature at the top of the search results page. You
     *        can use the <a href="https://docs.aws.amazon.com/kendra/latest/dg/API_Query.html">Query</a> API to search
     *        for specific documents with their document IDs included in the result items, or you can use the
     *        console.</p>
     *        <p>
     *        You can add up to four featured documents. You can request to increase this limit by contacting <a
     *        href="http://aws.amazon.com/contact-us/">Support</a>.
     *        </p>
     *        <p>
     *        Specific queries are mapped to specific documents for featuring in the results. If a query contains an
     *        exact match, then one or more specific documents are featured in the results. The exact match applies to
     *        the full query. For example, if you only specify 'Kendra', queries such as 'How does kendra semantically
     *        rank results?' will not render the featured results. Featured results are designed for specific queries,
     *        rather than queries that are too broad in scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeaturedResultsSet withFeaturedDocuments(java.util.Collection<FeaturedDocument> featuredDocuments) {
        setFeaturedDocuments(featuredDocuments);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp when the set of featured results was last updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The Unix timestamp when the set of featured results was last updated.
     */

    public void setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The Unix timestamp when the set of featured results was last updated.
     * </p>
     * 
     * @return The Unix timestamp when the set of featured results was last updated.
     */

    public Long getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The Unix timestamp when the set of featured results was last updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The Unix timestamp when the set of featured results was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeaturedResultsSet withLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
        setLastUpdatedTimestamp(lastUpdatedTimestamp);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp when the set of featured results was created.
     * </p>
     * 
     * @param creationTimestamp
     *        The Unix timestamp when the set of featured results was created.
     */

    public void setCreationTimestamp(Long creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * The Unix timestamp when the set of featured results was created.
     * </p>
     * 
     * @return The Unix timestamp when the set of featured results was created.
     */

    public Long getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * <p>
     * The Unix timestamp when the set of featured results was created.
     * </p>
     * 
     * @param creationTimestamp
     *        The Unix timestamp when the set of featured results was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FeaturedResultsSet withCreationTimestamp(Long creationTimestamp) {
        setCreationTimestamp(creationTimestamp);
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
        if (getFeaturedResultsSetId() != null)
            sb.append("FeaturedResultsSetId: ").append(getFeaturedResultsSetId()).append(",");
        if (getFeaturedResultsSetName() != null)
            sb.append("FeaturedResultsSetName: ").append(getFeaturedResultsSetName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getQueryTexts() != null)
            sb.append("QueryTexts: ").append(getQueryTexts()).append(",");
        if (getFeaturedDocuments() != null)
            sb.append("FeaturedDocuments: ").append(getFeaturedDocuments()).append(",");
        if (getLastUpdatedTimestamp() != null)
            sb.append("LastUpdatedTimestamp: ").append(getLastUpdatedTimestamp()).append(",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: ").append(getCreationTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FeaturedResultsSet == false)
            return false;
        FeaturedResultsSet other = (FeaturedResultsSet) obj;
        if (other.getFeaturedResultsSetId() == null ^ this.getFeaturedResultsSetId() == null)
            return false;
        if (other.getFeaturedResultsSetId() != null && other.getFeaturedResultsSetId().equals(this.getFeaturedResultsSetId()) == false)
            return false;
        if (other.getFeaturedResultsSetName() == null ^ this.getFeaturedResultsSetName() == null)
            return false;
        if (other.getFeaturedResultsSetName() != null && other.getFeaturedResultsSetName().equals(this.getFeaturedResultsSetName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getQueryTexts() == null ^ this.getQueryTexts() == null)
            return false;
        if (other.getQueryTexts() != null && other.getQueryTexts().equals(this.getQueryTexts()) == false)
            return false;
        if (other.getFeaturedDocuments() == null ^ this.getFeaturedDocuments() == null)
            return false;
        if (other.getFeaturedDocuments() != null && other.getFeaturedDocuments().equals(this.getFeaturedDocuments()) == false)
            return false;
        if (other.getLastUpdatedTimestamp() == null ^ this.getLastUpdatedTimestamp() == null)
            return false;
        if (other.getLastUpdatedTimestamp() != null && other.getLastUpdatedTimestamp().equals(this.getLastUpdatedTimestamp()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFeaturedResultsSetId() == null) ? 0 : getFeaturedResultsSetId().hashCode());
        hashCode = prime * hashCode + ((getFeaturedResultsSetName() == null) ? 0 : getFeaturedResultsSetName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getQueryTexts() == null) ? 0 : getQueryTexts().hashCode());
        hashCode = prime * hashCode + ((getFeaturedDocuments() == null) ? 0 : getFeaturedDocuments().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTimestamp() == null) ? 0 : getLastUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public FeaturedResultsSet clone() {
        try {
            return (FeaturedResultsSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.FeaturedResultsSetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
