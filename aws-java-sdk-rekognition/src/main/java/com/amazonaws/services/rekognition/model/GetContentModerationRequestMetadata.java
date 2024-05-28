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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains metadata about a content moderation request, including the SortBy and AggregateBy options.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetContentModerationRequestMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The sorting method chosen for a GetContentModeration request.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * The aggregation method chosen for a GetContentModeration request.
     * </p>
     */
    private String aggregateBy;

    /**
     * <p>
     * The sorting method chosen for a GetContentModeration request.
     * </p>
     * 
     * @param sortBy
     *        The sorting method chosen for a GetContentModeration request.
     * @see ContentModerationSortBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The sorting method chosen for a GetContentModeration request.
     * </p>
     * 
     * @return The sorting method chosen for a GetContentModeration request.
     * @see ContentModerationSortBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The sorting method chosen for a GetContentModeration request.
     * </p>
     * 
     * @param sortBy
     *        The sorting method chosen for a GetContentModeration request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentModerationSortBy
     */

    public GetContentModerationRequestMetadata withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The sorting method chosen for a GetContentModeration request.
     * </p>
     * 
     * @param sortBy
     *        The sorting method chosen for a GetContentModeration request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentModerationSortBy
     */

    public GetContentModerationRequestMetadata withSortBy(ContentModerationSortBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The aggregation method chosen for a GetContentModeration request.
     * </p>
     * 
     * @param aggregateBy
     *        The aggregation method chosen for a GetContentModeration request.
     * @see ContentModerationAggregateBy
     */

    public void setAggregateBy(String aggregateBy) {
        this.aggregateBy = aggregateBy;
    }

    /**
     * <p>
     * The aggregation method chosen for a GetContentModeration request.
     * </p>
     * 
     * @return The aggregation method chosen for a GetContentModeration request.
     * @see ContentModerationAggregateBy
     */

    public String getAggregateBy() {
        return this.aggregateBy;
    }

    /**
     * <p>
     * The aggregation method chosen for a GetContentModeration request.
     * </p>
     * 
     * @param aggregateBy
     *        The aggregation method chosen for a GetContentModeration request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentModerationAggregateBy
     */

    public GetContentModerationRequestMetadata withAggregateBy(String aggregateBy) {
        setAggregateBy(aggregateBy);
        return this;
    }

    /**
     * <p>
     * The aggregation method chosen for a GetContentModeration request.
     * </p>
     * 
     * @param aggregateBy
     *        The aggregation method chosen for a GetContentModeration request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentModerationAggregateBy
     */

    public GetContentModerationRequestMetadata withAggregateBy(ContentModerationAggregateBy aggregateBy) {
        this.aggregateBy = aggregateBy.toString();
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
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getAggregateBy() != null)
            sb.append("AggregateBy: ").append(getAggregateBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetContentModerationRequestMetadata == false)
            return false;
        GetContentModerationRequestMetadata other = (GetContentModerationRequestMetadata) obj;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getAggregateBy() == null ^ this.getAggregateBy() == null)
            return false;
        if (other.getAggregateBy() != null && other.getAggregateBy().equals(this.getAggregateBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getAggregateBy() == null) ? 0 : getAggregateBy().hashCode());
        return hashCode;
    }

    @Override
    public GetContentModerationRequestMetadata clone() {
        try {
            return (GetContentModerationRequestMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.GetContentModerationRequestMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
