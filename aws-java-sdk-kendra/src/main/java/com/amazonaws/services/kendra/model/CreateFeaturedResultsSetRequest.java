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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CreateFeaturedResultsSet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFeaturedResultsSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the index that you want to use for featuring results.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * A name for the set of featured results.
     * </p>
     */
    private String featuredResultsSetName;
    /**
     * <p>
     * A description for the set of featured results.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A token that you provide to identify the request to create a set of featured results. Multiple calls to the
     * <code>CreateFeaturedResultsSet</code> API with the same client token will create only one featured results set.
     * </p>
     */
    private String clientToken;
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
     * A list of queries for featuring results. For more information on the list of queries, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     * </p>
     */
    private java.util.List<String> queryTexts;
    /**
     * <p>
     * A list of document IDs for the documents you want to feature at the top of the search results page. For more
     * information on the list of documents, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     * </p>
     */
    private java.util.List<FeaturedDocument> featuredDocuments;
    /**
     * <p>
     * A list of key-value pairs that identify or categorize the featured results set. You can also use tags to help
     * control access to the featured results set. Tag keys and values can consist of Unicode letters, digits, white
     * space, and any of the following symbols:_ . : / = + - @.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The identifier of the index that you want to use for featuring results.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index that you want to use for featuring results.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index that you want to use for featuring results.
     * </p>
     * 
     * @return The identifier of the index that you want to use for featuring results.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index that you want to use for featuring results.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index that you want to use for featuring results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFeaturedResultsSetRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * A name for the set of featured results.
     * </p>
     * 
     * @param featuredResultsSetName
     *        A name for the set of featured results.
     */

    public void setFeaturedResultsSetName(String featuredResultsSetName) {
        this.featuredResultsSetName = featuredResultsSetName;
    }

    /**
     * <p>
     * A name for the set of featured results.
     * </p>
     * 
     * @return A name for the set of featured results.
     */

    public String getFeaturedResultsSetName() {
        return this.featuredResultsSetName;
    }

    /**
     * <p>
     * A name for the set of featured results.
     * </p>
     * 
     * @param featuredResultsSetName
     *        A name for the set of featured results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFeaturedResultsSetRequest withFeaturedResultsSetName(String featuredResultsSetName) {
        setFeaturedResultsSetName(featuredResultsSetName);
        return this;
    }

    /**
     * <p>
     * A description for the set of featured results.
     * </p>
     * 
     * @param description
     *        A description for the set of featured results.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the set of featured results.
     * </p>
     * 
     * @return A description for the set of featured results.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the set of featured results.
     * </p>
     * 
     * @param description
     *        A description for the set of featured results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFeaturedResultsSetRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create a set of featured results. Multiple calls to the
     * <code>CreateFeaturedResultsSet</code> API with the same client token will create only one featured results set.
     * </p>
     * 
     * @param clientToken
     *        A token that you provide to identify the request to create a set of featured results. Multiple calls to
     *        the <code>CreateFeaturedResultsSet</code> API with the same client token will create only one featured
     *        results set.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create a set of featured results. Multiple calls to the
     * <code>CreateFeaturedResultsSet</code> API with the same client token will create only one featured results set.
     * </p>
     * 
     * @return A token that you provide to identify the request to create a set of featured results. Multiple calls to
     *         the <code>CreateFeaturedResultsSet</code> API with the same client token will create only one featured
     *         results set.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token that you provide to identify the request to create a set of featured results. Multiple calls to the
     * <code>CreateFeaturedResultsSet</code> API with the same client token will create only one featured results set.
     * </p>
     * 
     * @param clientToken
     *        A token that you provide to identify the request to create a set of featured results. Multiple calls to
     *        the <code>CreateFeaturedResultsSet</code> API with the same client token will create only one featured
     *        results set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFeaturedResultsSetRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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

    public CreateFeaturedResultsSetRequest withStatus(String status) {
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

    public CreateFeaturedResultsSetRequest withStatus(FeaturedResultsSetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A list of queries for featuring results. For more information on the list of queries, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     * </p>
     * 
     * @return A list of queries for featuring results. For more information on the list of queries, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     */

    public java.util.List<String> getQueryTexts() {
        return queryTexts;
    }

    /**
     * <p>
     * A list of queries for featuring results. For more information on the list of queries, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     * </p>
     * 
     * @param queryTexts
     *        A list of queries for featuring results. For more information on the list of queries, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
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
     * A list of queries for featuring results. For more information on the list of queries, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQueryTexts(java.util.Collection)} or {@link #withQueryTexts(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param queryTexts
     *        A list of queries for featuring results. For more information on the list of queries, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFeaturedResultsSetRequest withQueryTexts(String... queryTexts) {
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
     * A list of queries for featuring results. For more information on the list of queries, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     * </p>
     * 
     * @param queryTexts
     *        A list of queries for featuring results. For more information on the list of queries, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFeaturedResultsSetRequest withQueryTexts(java.util.Collection<String> queryTexts) {
        setQueryTexts(queryTexts);
        return this;
    }

    /**
     * <p>
     * A list of document IDs for the documents you want to feature at the top of the search results page. For more
     * information on the list of documents, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     * </p>
     * 
     * @return A list of document IDs for the documents you want to feature at the top of the search results page. For
     *         more information on the list of documents, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     */

    public java.util.List<FeaturedDocument> getFeaturedDocuments() {
        return featuredDocuments;
    }

    /**
     * <p>
     * A list of document IDs for the documents you want to feature at the top of the search results page. For more
     * information on the list of documents, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     * </p>
     * 
     * @param featuredDocuments
     *        A list of document IDs for the documents you want to feature at the top of the search results page. For
     *        more information on the list of documents, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
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
     * A list of document IDs for the documents you want to feature at the top of the search results page. For more
     * information on the list of documents, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFeaturedDocuments(java.util.Collection)} or {@link #withFeaturedDocuments(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param featuredDocuments
     *        A list of document IDs for the documents you want to feature at the top of the search results page. For
     *        more information on the list of documents, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFeaturedResultsSetRequest withFeaturedDocuments(FeaturedDocument... featuredDocuments) {
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
     * A list of document IDs for the documents you want to feature at the top of the search results page. For more
     * information on the list of documents, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     * </p>
     * 
     * @param featuredDocuments
     *        A list of document IDs for the documents you want to feature at the top of the search results page. For
     *        more information on the list of documents, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFeaturedResultsSetRequest withFeaturedDocuments(java.util.Collection<FeaturedDocument> featuredDocuments) {
        setFeaturedDocuments(featuredDocuments);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that identify or categorize the featured results set. You can also use tags to help
     * control access to the featured results set. Tag keys and values can consist of Unicode letters, digits, white
     * space, and any of the following symbols:_ . : / = + - @.
     * </p>
     * 
     * @return A list of key-value pairs that identify or categorize the featured results set. You can also use tags to
     *         help control access to the featured results set. Tag keys and values can consist of Unicode letters,
     *         digits, white space, and any of the following symbols:_ . : / = + - @.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs that identify or categorize the featured results set. You can also use tags to help
     * control access to the featured results set. Tag keys and values can consist of Unicode letters, digits, white
     * space, and any of the following symbols:_ . : / = + - @.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that identify or categorize the featured results set. You can also use tags to
     *        help control access to the featured results set. Tag keys and values can consist of Unicode letters,
     *        digits, white space, and any of the following symbols:_ . : / = + - @.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of key-value pairs that identify or categorize the featured results set. You can also use tags to help
     * control access to the featured results set. Tag keys and values can consist of Unicode letters, digits, white
     * space, and any of the following symbols:_ . : / = + - @.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that identify or categorize the featured results set. You can also use tags to
     *        help control access to the featured results set. Tag keys and values can consist of Unicode letters,
     *        digits, white space, and any of the following symbols:_ . : / = + - @.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFeaturedResultsSetRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that identify or categorize the featured results set. You can also use tags to help
     * control access to the featured results set. Tag keys and values can consist of Unicode letters, digits, white
     * space, and any of the following symbols:_ . : / = + - @.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that identify or categorize the featured results set. You can also use tags to
     *        help control access to the featured results set. Tag keys and values can consist of Unicode letters,
     *        digits, white space, and any of the following symbols:_ . : / = + - @.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFeaturedResultsSetRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getFeaturedResultsSetName() != null)
            sb.append("FeaturedResultsSetName: ").append(getFeaturedResultsSetName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getQueryTexts() != null)
            sb.append("QueryTexts: ").append(getQueryTexts()).append(",");
        if (getFeaturedDocuments() != null)
            sb.append("FeaturedDocuments: ").append(getFeaturedDocuments()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFeaturedResultsSetRequest == false)
            return false;
        CreateFeaturedResultsSetRequest other = (CreateFeaturedResultsSetRequest) obj;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getFeaturedResultsSetName() == null ^ this.getFeaturedResultsSetName() == null)
            return false;
        if (other.getFeaturedResultsSetName() != null && other.getFeaturedResultsSetName().equals(this.getFeaturedResultsSetName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getFeaturedResultsSetName() == null) ? 0 : getFeaturedResultsSetName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getQueryTexts() == null) ? 0 : getQueryTexts().hashCode());
        hashCode = prime * hashCode + ((getFeaturedDocuments() == null) ? 0 : getFeaturedDocuments().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateFeaturedResultsSetRequest clone() {
        return (CreateFeaturedResultsSetRequest) super.clone();
    }

}
