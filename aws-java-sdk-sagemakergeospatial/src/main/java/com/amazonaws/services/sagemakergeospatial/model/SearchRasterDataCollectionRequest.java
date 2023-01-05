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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/SearchRasterDataCollection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchRasterDataCollectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the raster data collection.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * If the previous response was truncated, you receive this token. Use it in your next request to receive the next
     * set of results.
     * </p>
     */
    private String nextToken;
    /** <p/> */
    private RasterDataCollectionQueryWithBandFilterInput rasterDataCollectionQuery;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the raster data collection.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the raster data collection.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the raster data collection.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the raster data collection.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the raster data collection.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the raster data collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchRasterDataCollectionRequest withArn(String arn) {
        setArn(arn);
        return this;
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

    public SearchRasterDataCollectionRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p/>
     * 
     * @param rasterDataCollectionQuery
     */

    public void setRasterDataCollectionQuery(RasterDataCollectionQueryWithBandFilterInput rasterDataCollectionQuery) {
        this.rasterDataCollectionQuery = rasterDataCollectionQuery;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public RasterDataCollectionQueryWithBandFilterInput getRasterDataCollectionQuery() {
        return this.rasterDataCollectionQuery;
    }

    /**
     * <p/>
     * 
     * @param rasterDataCollectionQuery
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchRasterDataCollectionRequest withRasterDataCollectionQuery(RasterDataCollectionQueryWithBandFilterInput rasterDataCollectionQuery) {
        setRasterDataCollectionQuery(rasterDataCollectionQuery);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getRasterDataCollectionQuery() != null)
            sb.append("RasterDataCollectionQuery: ").append(getRasterDataCollectionQuery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchRasterDataCollectionRequest == false)
            return false;
        SearchRasterDataCollectionRequest other = (SearchRasterDataCollectionRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRasterDataCollectionQuery() == null ^ this.getRasterDataCollectionQuery() == null)
            return false;
        if (other.getRasterDataCollectionQuery() != null && other.getRasterDataCollectionQuery().equals(this.getRasterDataCollectionQuery()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRasterDataCollectionQuery() == null) ? 0 : getRasterDataCollectionQuery().hashCode());
        return hashCode;
    }

    @Override
    public SearchRasterDataCollectionRequest clone() {
        return (SearchRasterDataCollectionRequest) super.clone();
    }

}
