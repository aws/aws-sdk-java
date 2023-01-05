/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemakergeospatial.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/ListRasterDataCollections"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRasterDataCollectionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If the previous response was truncated, you receive this token. Use it in your next request to receive the next
     * set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Contains summary information about the raster data collection.
     * </p>
     */
    private java.util.List<RasterDataCollectionMetadata> rasterDataCollectionSummaries;

    /**
     * <p>
     * If the previous response was truncated, you receive this token. Use it in your next request to receive the next
     * set of results.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was truncated, you receive this token. Use it in your next request to receive the
     *        next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was truncated, you receive this token. Use it in your next request to receive the next
     * set of results.
     * </p>
     * 
     * @return If the previous response was truncated, you receive this token. Use it in your next request to receive
     *         the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous response was truncated, you receive this token. Use it in your next request to receive the next
     * set of results.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was truncated, you receive this token. Use it in your next request to receive the
     *        next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRasterDataCollectionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Contains summary information about the raster data collection.
     * </p>
     * 
     * @return Contains summary information about the raster data collection.
     */

    public java.util.List<RasterDataCollectionMetadata> getRasterDataCollectionSummaries() {
        return rasterDataCollectionSummaries;
    }

    /**
     * <p>
     * Contains summary information about the raster data collection.
     * </p>
     * 
     * @param rasterDataCollectionSummaries
     *        Contains summary information about the raster data collection.
     */

    public void setRasterDataCollectionSummaries(java.util.Collection<RasterDataCollectionMetadata> rasterDataCollectionSummaries) {
        if (rasterDataCollectionSummaries == null) {
            this.rasterDataCollectionSummaries = null;
            return;
        }

        this.rasterDataCollectionSummaries = new java.util.ArrayList<RasterDataCollectionMetadata>(rasterDataCollectionSummaries);
    }

    /**
     * <p>
     * Contains summary information about the raster data collection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRasterDataCollectionSummaries(java.util.Collection)} or
     * {@link #withRasterDataCollectionSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param rasterDataCollectionSummaries
     *        Contains summary information about the raster data collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRasterDataCollectionsResult withRasterDataCollectionSummaries(RasterDataCollectionMetadata... rasterDataCollectionSummaries) {
        if (this.rasterDataCollectionSummaries == null) {
            setRasterDataCollectionSummaries(new java.util.ArrayList<RasterDataCollectionMetadata>(rasterDataCollectionSummaries.length));
        }
        for (RasterDataCollectionMetadata ele : rasterDataCollectionSummaries) {
            this.rasterDataCollectionSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains summary information about the raster data collection.
     * </p>
     * 
     * @param rasterDataCollectionSummaries
     *        Contains summary information about the raster data collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRasterDataCollectionsResult withRasterDataCollectionSummaries(java.util.Collection<RasterDataCollectionMetadata> rasterDataCollectionSummaries) {
        setRasterDataCollectionSummaries(rasterDataCollectionSummaries);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getRasterDataCollectionSummaries() != null)
            sb.append("RasterDataCollectionSummaries: ").append(getRasterDataCollectionSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRasterDataCollectionsResult == false)
            return false;
        ListRasterDataCollectionsResult other = (ListRasterDataCollectionsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRasterDataCollectionSummaries() == null ^ this.getRasterDataCollectionSummaries() == null)
            return false;
        if (other.getRasterDataCollectionSummaries() != null
                && other.getRasterDataCollectionSummaries().equals(this.getRasterDataCollectionSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRasterDataCollectionSummaries() == null) ? 0 : getRasterDataCollectionSummaries().hashCode());
        return hashCode;
    }

    @Override
    public ListRasterDataCollectionsResult clone() {
        try {
            return (ListRasterDataCollectionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
