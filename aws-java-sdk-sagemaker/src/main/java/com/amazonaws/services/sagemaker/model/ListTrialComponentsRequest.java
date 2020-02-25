/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTrialComponents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTrialComponentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A filter that returns only components that are part of the specified experiment. If you specify
     * <code>ExperimentName</code>, you can't filter by <code>SourceArn</code> or <code>TrialName</code>.
     * </p>
     */
    private String experimentName;
    /**
     * <p>
     * A filter that returns only components that are part of the specified trial. If you specify <code>TrialName</code>
     * , you can't filter by <code>ExperimentName</code> or <code>SourceArn</code>.
     * </p>
     */
    private String trialName;
    /**
     * <p>
     * A filter that returns only components that have the specified source Amazon Resource Name (ARN). If you specify
     * <code>SourceArn</code>, you can't filter by <code>ExperimentName</code> or <code>TrialName</code>.
     * </p>
     */
    private String sourceArn;
    /**
     * <p>
     * A filter that returns only components created after the specified time.
     * </p>
     */
    private java.util.Date createdAfter;
    /**
     * <p>
     * A filter that returns only components created before the specified time.
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
     * The maximum number of components to return in the response. The default value is 10.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If the previous call to <code>ListTrialComponents</code> didn't return the full set of components, the call
     * returns a token for getting the next set of components.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A filter that returns only components that are part of the specified experiment. If you specify
     * <code>ExperimentName</code>, you can't filter by <code>SourceArn</code> or <code>TrialName</code>.
     * </p>
     * 
     * @param experimentName
     *        A filter that returns only components that are part of the specified experiment. If you specify
     *        <code>ExperimentName</code>, you can't filter by <code>SourceArn</code> or <code>TrialName</code>.
     */

    public void setExperimentName(String experimentName) {
        this.experimentName = experimentName;
    }

    /**
     * <p>
     * A filter that returns only components that are part of the specified experiment. If you specify
     * <code>ExperimentName</code>, you can't filter by <code>SourceArn</code> or <code>TrialName</code>.
     * </p>
     * 
     * @return A filter that returns only components that are part of the specified experiment. If you specify
     *         <code>ExperimentName</code>, you can't filter by <code>SourceArn</code> or <code>TrialName</code>.
     */

    public String getExperimentName() {
        return this.experimentName;
    }

    /**
     * <p>
     * A filter that returns only components that are part of the specified experiment. If you specify
     * <code>ExperimentName</code>, you can't filter by <code>SourceArn</code> or <code>TrialName</code>.
     * </p>
     * 
     * @param experimentName
     *        A filter that returns only components that are part of the specified experiment. If you specify
     *        <code>ExperimentName</code>, you can't filter by <code>SourceArn</code> or <code>TrialName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrialComponentsRequest withExperimentName(String experimentName) {
        setExperimentName(experimentName);
        return this;
    }

    /**
     * <p>
     * A filter that returns only components that are part of the specified trial. If you specify <code>TrialName</code>
     * , you can't filter by <code>ExperimentName</code> or <code>SourceArn</code>.
     * </p>
     * 
     * @param trialName
     *        A filter that returns only components that are part of the specified trial. If you specify
     *        <code>TrialName</code>, you can't filter by <code>ExperimentName</code> or <code>SourceArn</code>.
     */

    public void setTrialName(String trialName) {
        this.trialName = trialName;
    }

    /**
     * <p>
     * A filter that returns only components that are part of the specified trial. If you specify <code>TrialName</code>
     * , you can't filter by <code>ExperimentName</code> or <code>SourceArn</code>.
     * </p>
     * 
     * @return A filter that returns only components that are part of the specified trial. If you specify
     *         <code>TrialName</code>, you can't filter by <code>ExperimentName</code> or <code>SourceArn</code>.
     */

    public String getTrialName() {
        return this.trialName;
    }

    /**
     * <p>
     * A filter that returns only components that are part of the specified trial. If you specify <code>TrialName</code>
     * , you can't filter by <code>ExperimentName</code> or <code>SourceArn</code>.
     * </p>
     * 
     * @param trialName
     *        A filter that returns only components that are part of the specified trial. If you specify
     *        <code>TrialName</code>, you can't filter by <code>ExperimentName</code> or <code>SourceArn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrialComponentsRequest withTrialName(String trialName) {
        setTrialName(trialName);
        return this;
    }

    /**
     * <p>
     * A filter that returns only components that have the specified source Amazon Resource Name (ARN). If you specify
     * <code>SourceArn</code>, you can't filter by <code>ExperimentName</code> or <code>TrialName</code>.
     * </p>
     * 
     * @param sourceArn
     *        A filter that returns only components that have the specified source Amazon Resource Name (ARN). If you
     *        specify <code>SourceArn</code>, you can't filter by <code>ExperimentName</code> or <code>TrialName</code>.
     */

    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * A filter that returns only components that have the specified source Amazon Resource Name (ARN). If you specify
     * <code>SourceArn</code>, you can't filter by <code>ExperimentName</code> or <code>TrialName</code>.
     * </p>
     * 
     * @return A filter that returns only components that have the specified source Amazon Resource Name (ARN). If you
     *         specify <code>SourceArn</code>, you can't filter by <code>ExperimentName</code> or <code>TrialName</code>
     *         .
     */

    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * <p>
     * A filter that returns only components that have the specified source Amazon Resource Name (ARN). If you specify
     * <code>SourceArn</code>, you can't filter by <code>ExperimentName</code> or <code>TrialName</code>.
     * </p>
     * 
     * @param sourceArn
     *        A filter that returns only components that have the specified source Amazon Resource Name (ARN). If you
     *        specify <code>SourceArn</code>, you can't filter by <code>ExperimentName</code> or <code>TrialName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrialComponentsRequest withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
        return this;
    }

    /**
     * <p>
     * A filter that returns only components created after the specified time.
     * </p>
     * 
     * @param createdAfter
     *        A filter that returns only components created after the specified time.
     */

    public void setCreatedAfter(java.util.Date createdAfter) {
        this.createdAfter = createdAfter;
    }

    /**
     * <p>
     * A filter that returns only components created after the specified time.
     * </p>
     * 
     * @return A filter that returns only components created after the specified time.
     */

    public java.util.Date getCreatedAfter() {
        return this.createdAfter;
    }

    /**
     * <p>
     * A filter that returns only components created after the specified time.
     * </p>
     * 
     * @param createdAfter
     *        A filter that returns only components created after the specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrialComponentsRequest withCreatedAfter(java.util.Date createdAfter) {
        setCreatedAfter(createdAfter);
        return this;
    }

    /**
     * <p>
     * A filter that returns only components created before the specified time.
     * </p>
     * 
     * @param createdBefore
     *        A filter that returns only components created before the specified time.
     */

    public void setCreatedBefore(java.util.Date createdBefore) {
        this.createdBefore = createdBefore;
    }

    /**
     * <p>
     * A filter that returns only components created before the specified time.
     * </p>
     * 
     * @return A filter that returns only components created before the specified time.
     */

    public java.util.Date getCreatedBefore() {
        return this.createdBefore;
    }

    /**
     * <p>
     * A filter that returns only components created before the specified time.
     * </p>
     * 
     * @param createdBefore
     *        A filter that returns only components created before the specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrialComponentsRequest withCreatedBefore(java.util.Date createdBefore) {
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
     * @see SortTrialComponentsBy
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
     * @see SortTrialComponentsBy
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
     * @see SortTrialComponentsBy
     */

    public ListTrialComponentsRequest withSortBy(String sortBy) {
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
     * @see SortTrialComponentsBy
     */

    public ListTrialComponentsRequest withSortBy(SortTrialComponentsBy sortBy) {
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

    public ListTrialComponentsRequest withSortOrder(String sortOrder) {
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

    public ListTrialComponentsRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of components to return in the response. The default value is 10.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of components to return in the response. The default value is 10.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of components to return in the response. The default value is 10.
     * </p>
     * 
     * @return The maximum number of components to return in the response. The default value is 10.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of components to return in the response. The default value is 10.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of components to return in the response. The default value is 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrialComponentsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If the previous call to <code>ListTrialComponents</code> didn't return the full set of components, the call
     * returns a token for getting the next set of components.
     * </p>
     * 
     * @param nextToken
     *        If the previous call to <code>ListTrialComponents</code> didn't return the full set of components, the
     *        call returns a token for getting the next set of components.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous call to <code>ListTrialComponents</code> didn't return the full set of components, the call
     * returns a token for getting the next set of components.
     * </p>
     * 
     * @return If the previous call to <code>ListTrialComponents</code> didn't return the full set of components, the
     *         call returns a token for getting the next set of components.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous call to <code>ListTrialComponents</code> didn't return the full set of components, the call
     * returns a token for getting the next set of components.
     * </p>
     * 
     * @param nextToken
     *        If the previous call to <code>ListTrialComponents</code> didn't return the full set of components, the
     *        call returns a token for getting the next set of components.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrialComponentsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getExperimentName() != null)
            sb.append("ExperimentName: ").append(getExperimentName()).append(",");
        if (getTrialName() != null)
            sb.append("TrialName: ").append(getTrialName()).append(",");
        if (getSourceArn() != null)
            sb.append("SourceArn: ").append(getSourceArn()).append(",");
        if (getCreatedAfter() != null)
            sb.append("CreatedAfter: ").append(getCreatedAfter()).append(",");
        if (getCreatedBefore() != null)
            sb.append("CreatedBefore: ").append(getCreatedBefore()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTrialComponentsRequest == false)
            return false;
        ListTrialComponentsRequest other = (ListTrialComponentsRequest) obj;
        if (other.getExperimentName() == null ^ this.getExperimentName() == null)
            return false;
        if (other.getExperimentName() != null && other.getExperimentName().equals(this.getExperimentName()) == false)
            return false;
        if (other.getTrialName() == null ^ this.getTrialName() == null)
            return false;
        if (other.getTrialName() != null && other.getTrialName().equals(this.getTrialName()) == false)
            return false;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null && other.getSourceArn().equals(this.getSourceArn()) == false)
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
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExperimentName() == null) ? 0 : getExperimentName().hashCode());
        hashCode = prime * hashCode + ((getTrialName() == null) ? 0 : getTrialName().hashCode());
        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAfter() == null) ? 0 : getCreatedAfter().hashCode());
        hashCode = prime * hashCode + ((getCreatedBefore() == null) ? 0 : getCreatedBefore().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTrialComponentsRequest clone() {
        return (ListTrialComponentsRequest) super.clone();
    }

}
