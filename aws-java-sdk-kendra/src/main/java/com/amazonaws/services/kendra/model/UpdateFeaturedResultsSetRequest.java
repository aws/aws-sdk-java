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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UpdateFeaturedResultsSet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFeaturedResultsSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the index used for featuring results.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The identifier of the set of featured results that you want to update.
     * </p>
     */
    private String featuredResultsSetId;
    /**
     * <p>
     * A new name for the set of featured results.
     * </p>
     */
    private String featuredResultsSetName;
    /**
     * <p>
     * A new description for the set of featured results.
     * </p>
     */
    private String description;
    /**
     * <p>
     * You can set the status to <code>ACTIVE</code> or <code>INACTIVE</code>. When the value is <code>ACTIVE</code>,
     * featured results are ready for use. You can still configure your settings before setting the status to
     * <code>ACTIVE</code>. The queries you specify for featured results must be unique per featured results set for
     * each index, whether the status is <code>ACTIVE</code> or <code>INACTIVE</code>.
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
     * information on the list of featured documents, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     * </p>
     */
    private java.util.List<FeaturedDocument> featuredDocuments;

    /**
     * <p>
     * The identifier of the index used for featuring results.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index used for featuring results.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index used for featuring results.
     * </p>
     * 
     * @return The identifier of the index used for featuring results.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index used for featuring results.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index used for featuring results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFeaturedResultsSetRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The identifier of the set of featured results that you want to update.
     * </p>
     * 
     * @param featuredResultsSetId
     *        The identifier of the set of featured results that you want to update.
     */

    public void setFeaturedResultsSetId(String featuredResultsSetId) {
        this.featuredResultsSetId = featuredResultsSetId;
    }

    /**
     * <p>
     * The identifier of the set of featured results that you want to update.
     * </p>
     * 
     * @return The identifier of the set of featured results that you want to update.
     */

    public String getFeaturedResultsSetId() {
        return this.featuredResultsSetId;
    }

    /**
     * <p>
     * The identifier of the set of featured results that you want to update.
     * </p>
     * 
     * @param featuredResultsSetId
     *        The identifier of the set of featured results that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFeaturedResultsSetRequest withFeaturedResultsSetId(String featuredResultsSetId) {
        setFeaturedResultsSetId(featuredResultsSetId);
        return this;
    }

    /**
     * <p>
     * A new name for the set of featured results.
     * </p>
     * 
     * @param featuredResultsSetName
     *        A new name for the set of featured results.
     */

    public void setFeaturedResultsSetName(String featuredResultsSetName) {
        this.featuredResultsSetName = featuredResultsSetName;
    }

    /**
     * <p>
     * A new name for the set of featured results.
     * </p>
     * 
     * @return A new name for the set of featured results.
     */

    public String getFeaturedResultsSetName() {
        return this.featuredResultsSetName;
    }

    /**
     * <p>
     * A new name for the set of featured results.
     * </p>
     * 
     * @param featuredResultsSetName
     *        A new name for the set of featured results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFeaturedResultsSetRequest withFeaturedResultsSetName(String featuredResultsSetName) {
        setFeaturedResultsSetName(featuredResultsSetName);
        return this;
    }

    /**
     * <p>
     * A new description for the set of featured results.
     * </p>
     * 
     * @param description
     *        A new description for the set of featured results.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A new description for the set of featured results.
     * </p>
     * 
     * @return A new description for the set of featured results.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A new description for the set of featured results.
     * </p>
     * 
     * @param description
     *        A new description for the set of featured results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFeaturedResultsSetRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * You can set the status to <code>ACTIVE</code> or <code>INACTIVE</code>. When the value is <code>ACTIVE</code>,
     * featured results are ready for use. You can still configure your settings before setting the status to
     * <code>ACTIVE</code>. The queries you specify for featured results must be unique per featured results set for
     * each index, whether the status is <code>ACTIVE</code> or <code>INACTIVE</code>.
     * </p>
     * 
     * @param status
     *        You can set the status to <code>ACTIVE</code> or <code>INACTIVE</code>. When the value is
     *        <code>ACTIVE</code>, featured results are ready for use. You can still configure your settings before
     *        setting the status to <code>ACTIVE</code>. The queries you specify for featured results must be unique per
     *        featured results set for each index, whether the status is <code>ACTIVE</code> or <code>INACTIVE</code>.
     * @see FeaturedResultsSetStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * You can set the status to <code>ACTIVE</code> or <code>INACTIVE</code>. When the value is <code>ACTIVE</code>,
     * featured results are ready for use. You can still configure your settings before setting the status to
     * <code>ACTIVE</code>. The queries you specify for featured results must be unique per featured results set for
     * each index, whether the status is <code>ACTIVE</code> or <code>INACTIVE</code>.
     * </p>
     * 
     * @return You can set the status to <code>ACTIVE</code> or <code>INACTIVE</code>. When the value is
     *         <code>ACTIVE</code>, featured results are ready for use. You can still configure your settings before
     *         setting the status to <code>ACTIVE</code>. The queries you specify for featured results must be unique
     *         per featured results set for each index, whether the status is <code>ACTIVE</code> or
     *         <code>INACTIVE</code>.
     * @see FeaturedResultsSetStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * You can set the status to <code>ACTIVE</code> or <code>INACTIVE</code>. When the value is <code>ACTIVE</code>,
     * featured results are ready for use. You can still configure your settings before setting the status to
     * <code>ACTIVE</code>. The queries you specify for featured results must be unique per featured results set for
     * each index, whether the status is <code>ACTIVE</code> or <code>INACTIVE</code>.
     * </p>
     * 
     * @param status
     *        You can set the status to <code>ACTIVE</code> or <code>INACTIVE</code>. When the value is
     *        <code>ACTIVE</code>, featured results are ready for use. You can still configure your settings before
     *        setting the status to <code>ACTIVE</code>. The queries you specify for featured results must be unique per
     *        featured results set for each index, whether the status is <code>ACTIVE</code> or <code>INACTIVE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeaturedResultsSetStatus
     */

    public UpdateFeaturedResultsSetRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * You can set the status to <code>ACTIVE</code> or <code>INACTIVE</code>. When the value is <code>ACTIVE</code>,
     * featured results are ready for use. You can still configure your settings before setting the status to
     * <code>ACTIVE</code>. The queries you specify for featured results must be unique per featured results set for
     * each index, whether the status is <code>ACTIVE</code> or <code>INACTIVE</code>.
     * </p>
     * 
     * @param status
     *        You can set the status to <code>ACTIVE</code> or <code>INACTIVE</code>. When the value is
     *        <code>ACTIVE</code>, featured results are ready for use. You can still configure your settings before
     *        setting the status to <code>ACTIVE</code>. The queries you specify for featured results must be unique per
     *        featured results set for each index, whether the status is <code>ACTIVE</code> or <code>INACTIVE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeaturedResultsSetStatus
     */

    public UpdateFeaturedResultsSetRequest withStatus(FeaturedResultsSetStatus status) {
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

    public UpdateFeaturedResultsSetRequest withQueryTexts(String... queryTexts) {
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

    public UpdateFeaturedResultsSetRequest withQueryTexts(java.util.Collection<String> queryTexts) {
        setQueryTexts(queryTexts);
        return this;
    }

    /**
     * <p>
     * A list of document IDs for the documents you want to feature at the top of the search results page. For more
     * information on the list of featured documents, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     * </p>
     * 
     * @return A list of document IDs for the documents you want to feature at the top of the search results page. For
     *         more information on the list of featured documents, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     */

    public java.util.List<FeaturedDocument> getFeaturedDocuments() {
        return featuredDocuments;
    }

    /**
     * <p>
     * A list of document IDs for the documents you want to feature at the top of the search results page. For more
     * information on the list of featured documents, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     * </p>
     * 
     * @param featuredDocuments
     *        A list of document IDs for the documents you want to feature at the top of the search results page. For
     *        more information on the list of featured documents, see <a
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
     * information on the list of featured documents, see <a
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
     *        more information on the list of featured documents, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFeaturedResultsSetRequest withFeaturedDocuments(FeaturedDocument... featuredDocuments) {
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
     * information on the list of featured documents, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     * </p>
     * 
     * @param featuredDocuments
     *        A list of document IDs for the documents you want to feature at the top of the search results page. For
     *        more information on the list of featured documents, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/API_FeaturedResultsSet.html">FeaturedResultsSet</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFeaturedResultsSetRequest withFeaturedDocuments(java.util.Collection<FeaturedDocument> featuredDocuments) {
        setFeaturedDocuments(featuredDocuments);
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
            sb.append("FeaturedDocuments: ").append(getFeaturedDocuments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFeaturedResultsSetRequest == false)
            return false;
        UpdateFeaturedResultsSetRequest other = (UpdateFeaturedResultsSetRequest) obj;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getFeaturedResultsSetId() == null) ? 0 : getFeaturedResultsSetId().hashCode());
        hashCode = prime * hashCode + ((getFeaturedResultsSetName() == null) ? 0 : getFeaturedResultsSetName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getQueryTexts() == null) ? 0 : getQueryTexts().hashCode());
        hashCode = prime * hashCode + ((getFeaturedDocuments() == null) ? 0 : getFeaturedDocuments().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFeaturedResultsSetRequest clone() {
        return (UpdateFeaturedResultsSetRequest) super.clone();
    }

}
