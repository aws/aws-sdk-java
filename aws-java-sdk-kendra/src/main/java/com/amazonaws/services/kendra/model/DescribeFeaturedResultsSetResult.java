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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeFeaturedResultsSet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFeaturedResultsSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
     * The list of queries for featuring results. For more information on the list of queries, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     * </p>
     */
    private java.util.List<String> queryTexts;
    /**
     * <p>
     * The list of document IDs for the documents you want to feature with their metadata information. For more
     * information on the list of featured documents, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     * </p>
     */
    private java.util.List<FeaturedDocumentWithMetadata> featuredDocumentsWithMetadata;
    /**
     * <p>
     * The list of document IDs that don't exist but you have specified as featured documents. Amazon Kendra cannot
     * feature these documents if they don't exist in the index. You can check the status of a document and its ID or
     * check for documents with status errors using the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_BatchGetDocumentStatus.html">BatchGetDocumentStatus</a>
     * API.
     * </p>
     */
    private java.util.List<FeaturedDocumentMissing> featuredDocumentsMissing;
    /**
     * <p>
     * The timestamp when the set of featured results was last updated.
     * </p>
     */
    private Long lastUpdatedTimestamp;
    /**
     * <p>
     * The Unix timestamp when the set of the featured results was created.
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

    public DescribeFeaturedResultsSetResult withFeaturedResultsSetId(String featuredResultsSetId) {
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

    public DescribeFeaturedResultsSetResult withFeaturedResultsSetName(String featuredResultsSetName) {
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

    public DescribeFeaturedResultsSetResult withDescription(String description) {
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

    public DescribeFeaturedResultsSetResult withStatus(String status) {
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

    public DescribeFeaturedResultsSetResult withStatus(FeaturedResultsSetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The list of queries for featuring results. For more information on the list of queries, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     * </p>
     * 
     * @return The list of queries for featuring results. For more information on the list of queries, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     */

    public java.util.List<String> getQueryTexts() {
        return queryTexts;
    }

    /**
     * <p>
     * The list of queries for featuring results. For more information on the list of queries, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     * </p>
     * 
     * @param queryTexts
     *        The list of queries for featuring results. For more information on the list of queries, see <a
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
     * The list of queries for featuring results. For more information on the list of queries, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQueryTexts(java.util.Collection)} or {@link #withQueryTexts(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param queryTexts
     *        The list of queries for featuring results. For more information on the list of queries, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFeaturedResultsSetResult withQueryTexts(String... queryTexts) {
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
     * The list of queries for featuring results. For more information on the list of queries, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     * </p>
     * 
     * @param queryTexts
     *        The list of queries for featuring results. For more information on the list of queries, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFeaturedResultsSetResult withQueryTexts(java.util.Collection<String> queryTexts) {
        setQueryTexts(queryTexts);
        return this;
    }

    /**
     * <p>
     * The list of document IDs for the documents you want to feature with their metadata information. For more
     * information on the list of featured documents, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     * </p>
     * 
     * @return The list of document IDs for the documents you want to feature with their metadata information. For more
     *         information on the list of featured documents, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     */

    public java.util.List<FeaturedDocumentWithMetadata> getFeaturedDocumentsWithMetadata() {
        return featuredDocumentsWithMetadata;
    }

    /**
     * <p>
     * The list of document IDs for the documents you want to feature with their metadata information. For more
     * information on the list of featured documents, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     * </p>
     * 
     * @param featuredDocumentsWithMetadata
     *        The list of document IDs for the documents you want to feature with their metadata information. For more
     *        information on the list of featured documents, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     */

    public void setFeaturedDocumentsWithMetadata(java.util.Collection<FeaturedDocumentWithMetadata> featuredDocumentsWithMetadata) {
        if (featuredDocumentsWithMetadata == null) {
            this.featuredDocumentsWithMetadata = null;
            return;
        }

        this.featuredDocumentsWithMetadata = new java.util.ArrayList<FeaturedDocumentWithMetadata>(featuredDocumentsWithMetadata);
    }

    /**
     * <p>
     * The list of document IDs for the documents you want to feature with their metadata information. For more
     * information on the list of featured documents, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFeaturedDocumentsWithMetadata(java.util.Collection)} or
     * {@link #withFeaturedDocumentsWithMetadata(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param featuredDocumentsWithMetadata
     *        The list of document IDs for the documents you want to feature with their metadata information. For more
     *        information on the list of featured documents, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFeaturedResultsSetResult withFeaturedDocumentsWithMetadata(FeaturedDocumentWithMetadata... featuredDocumentsWithMetadata) {
        if (this.featuredDocumentsWithMetadata == null) {
            setFeaturedDocumentsWithMetadata(new java.util.ArrayList<FeaturedDocumentWithMetadata>(featuredDocumentsWithMetadata.length));
        }
        for (FeaturedDocumentWithMetadata ele : featuredDocumentsWithMetadata) {
            this.featuredDocumentsWithMetadata.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of document IDs for the documents you want to feature with their metadata information. For more
     * information on the list of featured documents, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     * </p>
     * 
     * @param featuredDocumentsWithMetadata
     *        The list of document IDs for the documents you want to feature with their metadata information. For more
     *        information on the list of featured documents, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFeaturedResultsSetResult withFeaturedDocumentsWithMetadata(java.util.Collection<FeaturedDocumentWithMetadata> featuredDocumentsWithMetadata) {
        setFeaturedDocumentsWithMetadata(featuredDocumentsWithMetadata);
        return this;
    }

    /**
     * <p>
     * The list of document IDs that don't exist but you have specified as featured documents. Amazon Kendra cannot
     * feature these documents if they don't exist in the index. You can check the status of a document and its ID or
     * check for documents with status errors using the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_BatchGetDocumentStatus.html">BatchGetDocumentStatus</a>
     * API.
     * </p>
     * 
     * @return The list of document IDs that don't exist but you have specified as featured documents. Amazon Kendra
     *         cannot feature these documents if they don't exist in the index. You can check the status of a document
     *         and its ID or check for documents with status errors using the <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/API_BatchGetDocumentStatus.html"
     *         >BatchGetDocumentStatus</a> API.
     */

    public java.util.List<FeaturedDocumentMissing> getFeaturedDocumentsMissing() {
        return featuredDocumentsMissing;
    }

    /**
     * <p>
     * The list of document IDs that don't exist but you have specified as featured documents. Amazon Kendra cannot
     * feature these documents if they don't exist in the index. You can check the status of a document and its ID or
     * check for documents with status errors using the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_BatchGetDocumentStatus.html">BatchGetDocumentStatus</a>
     * API.
     * </p>
     * 
     * @param featuredDocumentsMissing
     *        The list of document IDs that don't exist but you have specified as featured documents. Amazon Kendra
     *        cannot feature these documents if they don't exist in the index. You can check the status of a document
     *        and its ID or check for documents with status errors using the <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_BatchGetDocumentStatus.html"
     *        >BatchGetDocumentStatus</a> API.
     */

    public void setFeaturedDocumentsMissing(java.util.Collection<FeaturedDocumentMissing> featuredDocumentsMissing) {
        if (featuredDocumentsMissing == null) {
            this.featuredDocumentsMissing = null;
            return;
        }

        this.featuredDocumentsMissing = new java.util.ArrayList<FeaturedDocumentMissing>(featuredDocumentsMissing);
    }

    /**
     * <p>
     * The list of document IDs that don't exist but you have specified as featured documents. Amazon Kendra cannot
     * feature these documents if they don't exist in the index. You can check the status of a document and its ID or
     * check for documents with status errors using the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_BatchGetDocumentStatus.html">BatchGetDocumentStatus</a>
     * API.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFeaturedDocumentsMissing(java.util.Collection)} or
     * {@link #withFeaturedDocumentsMissing(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param featuredDocumentsMissing
     *        The list of document IDs that don't exist but you have specified as featured documents. Amazon Kendra
     *        cannot feature these documents if they don't exist in the index. You can check the status of a document
     *        and its ID or check for documents with status errors using the <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_BatchGetDocumentStatus.html"
     *        >BatchGetDocumentStatus</a> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFeaturedResultsSetResult withFeaturedDocumentsMissing(FeaturedDocumentMissing... featuredDocumentsMissing) {
        if (this.featuredDocumentsMissing == null) {
            setFeaturedDocumentsMissing(new java.util.ArrayList<FeaturedDocumentMissing>(featuredDocumentsMissing.length));
        }
        for (FeaturedDocumentMissing ele : featuredDocumentsMissing) {
            this.featuredDocumentsMissing.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of document IDs that don't exist but you have specified as featured documents. Amazon Kendra cannot
     * feature these documents if they don't exist in the index. You can check the status of a document and its ID or
     * check for documents with status errors using the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_BatchGetDocumentStatus.html">BatchGetDocumentStatus</a>
     * API.
     * </p>
     * 
     * @param featuredDocumentsMissing
     *        The list of document IDs that don't exist but you have specified as featured documents. Amazon Kendra
     *        cannot feature these documents if they don't exist in the index. You can check the status of a document
     *        and its ID or check for documents with status errors using the <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_BatchGetDocumentStatus.html"
     *        >BatchGetDocumentStatus</a> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFeaturedResultsSetResult withFeaturedDocumentsMissing(java.util.Collection<FeaturedDocumentMissing> featuredDocumentsMissing) {
        setFeaturedDocumentsMissing(featuredDocumentsMissing);
        return this;
    }

    /**
     * <p>
     * The timestamp when the set of featured results was last updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The timestamp when the set of featured results was last updated.
     */

    public void setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The timestamp when the set of featured results was last updated.
     * </p>
     * 
     * @return The timestamp when the set of featured results was last updated.
     */

    public Long getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The timestamp when the set of featured results was last updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The timestamp when the set of featured results was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFeaturedResultsSetResult withLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
        setLastUpdatedTimestamp(lastUpdatedTimestamp);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp when the set of the featured results was created.
     * </p>
     * 
     * @param creationTimestamp
     *        The Unix timestamp when the set of the featured results was created.
     */

    public void setCreationTimestamp(Long creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * The Unix timestamp when the set of the featured results was created.
     * </p>
     * 
     * @return The Unix timestamp when the set of the featured results was created.
     */

    public Long getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * <p>
     * The Unix timestamp when the set of the featured results was created.
     * </p>
     * 
     * @param creationTimestamp
     *        The Unix timestamp when the set of the featured results was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFeaturedResultsSetResult withCreationTimestamp(Long creationTimestamp) {
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
        if (getFeaturedDocumentsWithMetadata() != null)
            sb.append("FeaturedDocumentsWithMetadata: ").append(getFeaturedDocumentsWithMetadata()).append(",");
        if (getFeaturedDocumentsMissing() != null)
            sb.append("FeaturedDocumentsMissing: ").append(getFeaturedDocumentsMissing()).append(",");
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

        if (obj instanceof DescribeFeaturedResultsSetResult == false)
            return false;
        DescribeFeaturedResultsSetResult other = (DescribeFeaturedResultsSetResult) obj;
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
        if (other.getFeaturedDocumentsWithMetadata() == null ^ this.getFeaturedDocumentsWithMetadata() == null)
            return false;
        if (other.getFeaturedDocumentsWithMetadata() != null
                && other.getFeaturedDocumentsWithMetadata().equals(this.getFeaturedDocumentsWithMetadata()) == false)
            return false;
        if (other.getFeaturedDocumentsMissing() == null ^ this.getFeaturedDocumentsMissing() == null)
            return false;
        if (other.getFeaturedDocumentsMissing() != null && other.getFeaturedDocumentsMissing().equals(this.getFeaturedDocumentsMissing()) == false)
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
        hashCode = prime * hashCode + ((getFeaturedDocumentsWithMetadata() == null) ? 0 : getFeaturedDocumentsWithMetadata().hashCode());
        hashCode = prime * hashCode + ((getFeaturedDocumentsMissing() == null) ? 0 : getFeaturedDocumentsMissing().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTimestamp() == null) ? 0 : getLastUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFeaturedResultsSetResult clone() {
        try {
            return (DescribeFeaturedResultsSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
