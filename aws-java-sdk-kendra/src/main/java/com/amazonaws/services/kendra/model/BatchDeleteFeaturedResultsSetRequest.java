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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/BatchDeleteFeaturedResultsSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteFeaturedResultsSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the index used for featuring results.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The identifiers of the featured results sets that you want to delete.
     * </p>
     */
    private java.util.List<String> featuredResultsSetIds;

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

    public BatchDeleteFeaturedResultsSetRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The identifiers of the featured results sets that you want to delete.
     * </p>
     * 
     * @return The identifiers of the featured results sets that you want to delete.
     */

    public java.util.List<String> getFeaturedResultsSetIds() {
        return featuredResultsSetIds;
    }

    /**
     * <p>
     * The identifiers of the featured results sets that you want to delete.
     * </p>
     * 
     * @param featuredResultsSetIds
     *        The identifiers of the featured results sets that you want to delete.
     */

    public void setFeaturedResultsSetIds(java.util.Collection<String> featuredResultsSetIds) {
        if (featuredResultsSetIds == null) {
            this.featuredResultsSetIds = null;
            return;
        }

        this.featuredResultsSetIds = new java.util.ArrayList<String>(featuredResultsSetIds);
    }

    /**
     * <p>
     * The identifiers of the featured results sets that you want to delete.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFeaturedResultsSetIds(java.util.Collection)} or
     * {@link #withFeaturedResultsSetIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param featuredResultsSetIds
     *        The identifiers of the featured results sets that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteFeaturedResultsSetRequest withFeaturedResultsSetIds(String... featuredResultsSetIds) {
        if (this.featuredResultsSetIds == null) {
            setFeaturedResultsSetIds(new java.util.ArrayList<String>(featuredResultsSetIds.length));
        }
        for (String ele : featuredResultsSetIds) {
            this.featuredResultsSetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers of the featured results sets that you want to delete.
     * </p>
     * 
     * @param featuredResultsSetIds
     *        The identifiers of the featured results sets that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteFeaturedResultsSetRequest withFeaturedResultsSetIds(java.util.Collection<String> featuredResultsSetIds) {
        setFeaturedResultsSetIds(featuredResultsSetIds);
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
        if (getFeaturedResultsSetIds() != null)
            sb.append("FeaturedResultsSetIds: ").append(getFeaturedResultsSetIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteFeaturedResultsSetRequest == false)
            return false;
        BatchDeleteFeaturedResultsSetRequest other = (BatchDeleteFeaturedResultsSetRequest) obj;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getFeaturedResultsSetIds() == null ^ this.getFeaturedResultsSetIds() == null)
            return false;
        if (other.getFeaturedResultsSetIds() != null && other.getFeaturedResultsSetIds().equals(this.getFeaturedResultsSetIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getFeaturedResultsSetIds() == null) ? 0 : getFeaturedResultsSetIds().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteFeaturedResultsSetRequest clone() {
        return (BatchDeleteFeaturedResultsSetRequest) super.clone();
    }

}
