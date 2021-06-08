/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListAssociations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAssociationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A filter that returns only associations with the specified source ARN.
     * </p>
     */
    private String sourceArn;
    /**
     * <p>
     * A filter that returns only associations with the specified destination Amazon Resource Name (ARN).
     * </p>
     */
    private String destinationArn;
    /**
     * <p>
     * A filter that returns only associations with the specified source type.
     * </p>
     */
    private String sourceType;
    /**
     * <p>
     * A filter that returns only associations with the specified destination type.
     * </p>
     */
    private String destinationType;
    /**
     * <p>
     * A filter that returns only associations of the specified type.
     * </p>
     */
    private String associationType;
    /**
     * <p>
     * A filter that returns only associations created on or after the specified time.
     * </p>
     */
    private java.util.Date createdAfter;
    /**
     * <p>
     * A filter that returns only associations created on or before the specified time.
     * </p>
     */
    private java.util.Date createdBefore;
    /**
     * <p>
     * The property used to sort results. The default value is <code>CreationTime</code>.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * The sort order. The default value is <code>Descending</code>.
     * </p>
     */
    private String sortOrder;
    /**
     * <p>
     * If the previous call to <code>ListAssociations</code> didn't return the full set of associations, the call
     * returns a token for getting the next set of associations.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of associations to return in the response. The default value is 10.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * A filter that returns only associations with the specified source ARN.
     * </p>
     * 
     * @param sourceArn
     *        A filter that returns only associations with the specified source ARN.
     */

    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * A filter that returns only associations with the specified source ARN.
     * </p>
     * 
     * @return A filter that returns only associations with the specified source ARN.
     */

    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * <p>
     * A filter that returns only associations with the specified source ARN.
     * </p>
     * 
     * @param sourceArn
     *        A filter that returns only associations with the specified source ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssociationsRequest withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
        return this;
    }

    /**
     * <p>
     * A filter that returns only associations with the specified destination Amazon Resource Name (ARN).
     * </p>
     * 
     * @param destinationArn
     *        A filter that returns only associations with the specified destination Amazon Resource Name (ARN).
     */

    public void setDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
    }

    /**
     * <p>
     * A filter that returns only associations with the specified destination Amazon Resource Name (ARN).
     * </p>
     * 
     * @return A filter that returns only associations with the specified destination Amazon Resource Name (ARN).
     */

    public String getDestinationArn() {
        return this.destinationArn;
    }

    /**
     * <p>
     * A filter that returns only associations with the specified destination Amazon Resource Name (ARN).
     * </p>
     * 
     * @param destinationArn
     *        A filter that returns only associations with the specified destination Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssociationsRequest withDestinationArn(String destinationArn) {
        setDestinationArn(destinationArn);
        return this;
    }

    /**
     * <p>
     * A filter that returns only associations with the specified source type.
     * </p>
     * 
     * @param sourceType
     *        A filter that returns only associations with the specified source type.
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * A filter that returns only associations with the specified source type.
     * </p>
     * 
     * @return A filter that returns only associations with the specified source type.
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * A filter that returns only associations with the specified source type.
     * </p>
     * 
     * @param sourceType
     *        A filter that returns only associations with the specified source type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssociationsRequest withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * A filter that returns only associations with the specified destination type.
     * </p>
     * 
     * @param destinationType
     *        A filter that returns only associations with the specified destination type.
     */

    public void setDestinationType(String destinationType) {
        this.destinationType = destinationType;
    }

    /**
     * <p>
     * A filter that returns only associations with the specified destination type.
     * </p>
     * 
     * @return A filter that returns only associations with the specified destination type.
     */

    public String getDestinationType() {
        return this.destinationType;
    }

    /**
     * <p>
     * A filter that returns only associations with the specified destination type.
     * </p>
     * 
     * @param destinationType
     *        A filter that returns only associations with the specified destination type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssociationsRequest withDestinationType(String destinationType) {
        setDestinationType(destinationType);
        return this;
    }

    /**
     * <p>
     * A filter that returns only associations of the specified type.
     * </p>
     * 
     * @param associationType
     *        A filter that returns only associations of the specified type.
     * @see AssociationEdgeType
     */

    public void setAssociationType(String associationType) {
        this.associationType = associationType;
    }

    /**
     * <p>
     * A filter that returns only associations of the specified type.
     * </p>
     * 
     * @return A filter that returns only associations of the specified type.
     * @see AssociationEdgeType
     */

    public String getAssociationType() {
        return this.associationType;
    }

    /**
     * <p>
     * A filter that returns only associations of the specified type.
     * </p>
     * 
     * @param associationType
     *        A filter that returns only associations of the specified type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationEdgeType
     */

    public ListAssociationsRequest withAssociationType(String associationType) {
        setAssociationType(associationType);
        return this;
    }

    /**
     * <p>
     * A filter that returns only associations of the specified type.
     * </p>
     * 
     * @param associationType
     *        A filter that returns only associations of the specified type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationEdgeType
     */

    public ListAssociationsRequest withAssociationType(AssociationEdgeType associationType) {
        this.associationType = associationType.toString();
        return this;
    }

    /**
     * <p>
     * A filter that returns only associations created on or after the specified time.
     * </p>
     * 
     * @param createdAfter
     *        A filter that returns only associations created on or after the specified time.
     */

    public void setCreatedAfter(java.util.Date createdAfter) {
        this.createdAfter = createdAfter;
    }

    /**
     * <p>
     * A filter that returns only associations created on or after the specified time.
     * </p>
     * 
     * @return A filter that returns only associations created on or after the specified time.
     */

    public java.util.Date getCreatedAfter() {
        return this.createdAfter;
    }

    /**
     * <p>
     * A filter that returns only associations created on or after the specified time.
     * </p>
     * 
     * @param createdAfter
     *        A filter that returns only associations created on or after the specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssociationsRequest withCreatedAfter(java.util.Date createdAfter) {
        setCreatedAfter(createdAfter);
        return this;
    }

    /**
     * <p>
     * A filter that returns only associations created on or before the specified time.
     * </p>
     * 
     * @param createdBefore
     *        A filter that returns only associations created on or before the specified time.
     */

    public void setCreatedBefore(java.util.Date createdBefore) {
        this.createdBefore = createdBefore;
    }

    /**
     * <p>
     * A filter that returns only associations created on or before the specified time.
     * </p>
     * 
     * @return A filter that returns only associations created on or before the specified time.
     */

    public java.util.Date getCreatedBefore() {
        return this.createdBefore;
    }

    /**
     * <p>
     * A filter that returns only associations created on or before the specified time.
     * </p>
     * 
     * @param createdBefore
     *        A filter that returns only associations created on or before the specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssociationsRequest withCreatedBefore(java.util.Date createdBefore) {
        setCreatedBefore(createdBefore);
        return this;
    }

    /**
     * <p>
     * The property used to sort results. The default value is <code>CreationTime</code>.
     * </p>
     * 
     * @param sortBy
     *        The property used to sort results. The default value is <code>CreationTime</code>.
     * @see SortAssociationsBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The property used to sort results. The default value is <code>CreationTime</code>.
     * </p>
     * 
     * @return The property used to sort results. The default value is <code>CreationTime</code>.
     * @see SortAssociationsBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The property used to sort results. The default value is <code>CreationTime</code>.
     * </p>
     * 
     * @param sortBy
     *        The property used to sort results. The default value is <code>CreationTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortAssociationsBy
     */

    public ListAssociationsRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The property used to sort results. The default value is <code>CreationTime</code>.
     * </p>
     * 
     * @param sortBy
     *        The property used to sort results. The default value is <code>CreationTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortAssociationsBy
     */

    public ListAssociationsRequest withSortBy(SortAssociationsBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The sort order. The default value is <code>Descending</code>.
     * </p>
     * 
     * @param sortOrder
     *        The sort order. The default value is <code>Descending</code>.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The sort order. The default value is <code>Descending</code>.
     * </p>
     * 
     * @return The sort order. The default value is <code>Descending</code>.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The sort order. The default value is <code>Descending</code>.
     * </p>
     * 
     * @param sortOrder
     *        The sort order. The default value is <code>Descending</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListAssociationsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The sort order. The default value is <code>Descending</code>.
     * </p>
     * 
     * @param sortOrder
     *        The sort order. The default value is <code>Descending</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListAssociationsRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * If the previous call to <code>ListAssociations</code> didn't return the full set of associations, the call
     * returns a token for getting the next set of associations.
     * </p>
     * 
     * @param nextToken
     *        If the previous call to <code>ListAssociations</code> didn't return the full set of associations, the call
     *        returns a token for getting the next set of associations.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous call to <code>ListAssociations</code> didn't return the full set of associations, the call
     * returns a token for getting the next set of associations.
     * </p>
     * 
     * @return If the previous call to <code>ListAssociations</code> didn't return the full set of associations, the
     *         call returns a token for getting the next set of associations.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous call to <code>ListAssociations</code> didn't return the full set of associations, the call
     * returns a token for getting the next set of associations.
     * </p>
     * 
     * @param nextToken
     *        If the previous call to <code>ListAssociations</code> didn't return the full set of associations, the call
     *        returns a token for getting the next set of associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssociationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of associations to return in the response. The default value is 10.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of associations to return in the response. The default value is 10.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of associations to return in the response. The default value is 10.
     * </p>
     * 
     * @return The maximum number of associations to return in the response. The default value is 10.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of associations to return in the response. The default value is 10.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of associations to return in the response. The default value is 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssociationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getSourceArn() != null)
            sb.append("SourceArn: ").append(getSourceArn()).append(",");
        if (getDestinationArn() != null)
            sb.append("DestinationArn: ").append(getDestinationArn()).append(",");
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType()).append(",");
        if (getDestinationType() != null)
            sb.append("DestinationType: ").append(getDestinationType()).append(",");
        if (getAssociationType() != null)
            sb.append("AssociationType: ").append(getAssociationType()).append(",");
        if (getCreatedAfter() != null)
            sb.append("CreatedAfter: ").append(getCreatedAfter()).append(",");
        if (getCreatedBefore() != null)
            sb.append("CreatedBefore: ").append(getCreatedBefore()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAssociationsRequest == false)
            return false;
        ListAssociationsRequest other = (ListAssociationsRequest) obj;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        if (other.getDestinationArn() == null ^ this.getDestinationArn() == null)
            return false;
        if (other.getDestinationArn() != null && other.getDestinationArn().equals(this.getDestinationArn()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getDestinationType() == null ^ this.getDestinationType() == null)
            return false;
        if (other.getDestinationType() != null && other.getDestinationType().equals(this.getDestinationType()) == false)
            return false;
        if (other.getAssociationType() == null ^ this.getAssociationType() == null)
            return false;
        if (other.getAssociationType() != null && other.getAssociationType().equals(this.getAssociationType()) == false)
            return false;
        if (other.getCreatedAfter() == null ^ this.getCreatedAfter() == null)
            return false;
        if (other.getCreatedAfter() != null && other.getCreatedAfter().equals(this.getCreatedAfter()) == false)
            return false;
        if (other.getCreatedBefore() == null ^ this.getCreatedBefore() == null)
            return false;
        if (other.getCreatedBefore() != null && other.getCreatedBefore().equals(this.getCreatedBefore()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode + ((getDestinationArn() == null) ? 0 : getDestinationArn().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getDestinationType() == null) ? 0 : getDestinationType().hashCode());
        hashCode = prime * hashCode + ((getAssociationType() == null) ? 0 : getAssociationType().hashCode());
        hashCode = prime * hashCode + ((getCreatedAfter() == null) ? 0 : getCreatedAfter().hashCode());
        hashCode = prime * hashCode + ((getCreatedBefore() == null) ? 0 : getCreatedBefore().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListAssociationsRequest clone() {
        return (ListAssociationsRequest) super.clone();
    }

}
