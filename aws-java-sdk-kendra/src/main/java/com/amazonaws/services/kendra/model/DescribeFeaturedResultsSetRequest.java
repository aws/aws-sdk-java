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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeFeaturedResultsSet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFeaturedResultsSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the index used for featuring results.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The identifier of the set of featured results that you want to get information on.
     * </p>
     */
    private String featuredResultsSetId;

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

    public DescribeFeaturedResultsSetRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The identifier of the set of featured results that you want to get information on.
     * </p>
     * 
     * @param featuredResultsSetId
     *        The identifier of the set of featured results that you want to get information on.
     */

    public void setFeaturedResultsSetId(String featuredResultsSetId) {
        this.featuredResultsSetId = featuredResultsSetId;
    }

    /**
     * <p>
     * The identifier of the set of featured results that you want to get information on.
     * </p>
     * 
     * @return The identifier of the set of featured results that you want to get information on.
     */

    public String getFeaturedResultsSetId() {
        return this.featuredResultsSetId;
    }

    /**
     * <p>
     * The identifier of the set of featured results that you want to get information on.
     * </p>
     * 
     * @param featuredResultsSetId
     *        The identifier of the set of featured results that you want to get information on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFeaturedResultsSetRequest withFeaturedResultsSetId(String featuredResultsSetId) {
        setFeaturedResultsSetId(featuredResultsSetId);
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
            sb.append("FeaturedResultsSetId: ").append(getFeaturedResultsSetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFeaturedResultsSetRequest == false)
            return false;
        DescribeFeaturedResultsSetRequest other = (DescribeFeaturedResultsSetRequest) obj;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getFeaturedResultsSetId() == null ^ this.getFeaturedResultsSetId() == null)
            return false;
        if (other.getFeaturedResultsSetId() != null && other.getFeaturedResultsSetId().equals(this.getFeaturedResultsSetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getFeaturedResultsSetId() == null) ? 0 : getFeaturedResultsSetId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFeaturedResultsSetRequest clone() {
        return (DescribeFeaturedResultsSetRequest) super.clone();
    }

}
