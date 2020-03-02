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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTrials" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTrialsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A filter that returns only trials that are part of the specified experiment.
     * </p>
     */
    private String experimentName;
    /**
     * <p>
     * A filter that returns only trials that are associated with the specified trial component.
     * </p>
     */
    private String trialComponentName;
    /**
     * <p>
     * A filter that returns only trials created after the specified time.
     * </p>
     */
    private java.util.Date createdAfter;
    /**
     * <p>
     * A filter that returns only trials created before the specified time.
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
     * The maximum number of trials to return in the response. The default value is 10.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If the previous call to <code>ListTrials</code> didn't return the full set of trials, the call returns a token
     * for getting the next set of trials.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A filter that returns only trials that are part of the specified experiment.
     * </p>
     * 
     * @param experimentName
     *        A filter that returns only trials that are part of the specified experiment.
     */

    public void setExperimentName(String experimentName) {
        this.experimentName = experimentName;
    }

    /**
     * <p>
     * A filter that returns only trials that are part of the specified experiment.
     * </p>
     * 
     * @return A filter that returns only trials that are part of the specified experiment.
     */

    public String getExperimentName() {
        return this.experimentName;
    }

    /**
     * <p>
     * A filter that returns only trials that are part of the specified experiment.
     * </p>
     * 
     * @param experimentName
     *        A filter that returns only trials that are part of the specified experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrialsRequest withExperimentName(String experimentName) {
        setExperimentName(experimentName);
        return this;
    }

    /**
     * <p>
     * A filter that returns only trials that are associated with the specified trial component.
     * </p>
     * 
     * @param trialComponentName
     *        A filter that returns only trials that are associated with the specified trial component.
     */

    public void setTrialComponentName(String trialComponentName) {
        this.trialComponentName = trialComponentName;
    }

    /**
     * <p>
     * A filter that returns only trials that are associated with the specified trial component.
     * </p>
     * 
     * @return A filter that returns only trials that are associated with the specified trial component.
     */

    public String getTrialComponentName() {
        return this.trialComponentName;
    }

    /**
     * <p>
     * A filter that returns only trials that are associated with the specified trial component.
     * </p>
     * 
     * @param trialComponentName
     *        A filter that returns only trials that are associated with the specified trial component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrialsRequest withTrialComponentName(String trialComponentName) {
        setTrialComponentName(trialComponentName);
        return this;
    }

    /**
     * <p>
     * A filter that returns only trials created after the specified time.
     * </p>
     * 
     * @param createdAfter
     *        A filter that returns only trials created after the specified time.
     */

    public void setCreatedAfter(java.util.Date createdAfter) {
        this.createdAfter = createdAfter;
    }

    /**
     * <p>
     * A filter that returns only trials created after the specified time.
     * </p>
     * 
     * @return A filter that returns only trials created after the specified time.
     */

    public java.util.Date getCreatedAfter() {
        return this.createdAfter;
    }

    /**
     * <p>
     * A filter that returns only trials created after the specified time.
     * </p>
     * 
     * @param createdAfter
     *        A filter that returns only trials created after the specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrialsRequest withCreatedAfter(java.util.Date createdAfter) {
        setCreatedAfter(createdAfter);
        return this;
    }

    /**
     * <p>
     * A filter that returns only trials created before the specified time.
     * </p>
     * 
     * @param createdBefore
     *        A filter that returns only trials created before the specified time.
     */

    public void setCreatedBefore(java.util.Date createdBefore) {
        this.createdBefore = createdBefore;
    }

    /**
     * <p>
     * A filter that returns only trials created before the specified time.
     * </p>
     * 
     * @return A filter that returns only trials created before the specified time.
     */

    public java.util.Date getCreatedBefore() {
        return this.createdBefore;
    }

    /**
     * <p>
     * A filter that returns only trials created before the specified time.
     * </p>
     * 
     * @param createdBefore
     *        A filter that returns only trials created before the specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrialsRequest withCreatedBefore(java.util.Date createdBefore) {
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
     * @see SortTrialsBy
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
     * @see SortTrialsBy
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
     * @see SortTrialsBy
     */

    public ListTrialsRequest withSortBy(String sortBy) {
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
     * @see SortTrialsBy
     */

    public ListTrialsRequest withSortBy(SortTrialsBy sortBy) {
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

    public ListTrialsRequest withSortOrder(String sortOrder) {
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

    public ListTrialsRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of trials to return in the response. The default value is 10.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of trials to return in the response. The default value is 10.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of trials to return in the response. The default value is 10.
     * </p>
     * 
     * @return The maximum number of trials to return in the response. The default value is 10.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of trials to return in the response. The default value is 10.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of trials to return in the response. The default value is 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrialsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If the previous call to <code>ListTrials</code> didn't return the full set of trials, the call returns a token
     * for getting the next set of trials.
     * </p>
     * 
     * @param nextToken
     *        If the previous call to <code>ListTrials</code> didn't return the full set of trials, the call returns a
     *        token for getting the next set of trials.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous call to <code>ListTrials</code> didn't return the full set of trials, the call returns a token
     * for getting the next set of trials.
     * </p>
     * 
     * @return If the previous call to <code>ListTrials</code> didn't return the full set of trials, the call returns a
     *         token for getting the next set of trials.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous call to <code>ListTrials</code> didn't return the full set of trials, the call returns a token
     * for getting the next set of trials.
     * </p>
     * 
     * @param nextToken
     *        If the previous call to <code>ListTrials</code> didn't return the full set of trials, the call returns a
     *        token for getting the next set of trials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrialsRequest withNextToken(String nextToken) {
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
        if (getTrialComponentName() != null)
            sb.append("TrialComponentName: ").append(getTrialComponentName()).append(",");
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

        if (obj instanceof ListTrialsRequest == false)
            return false;
        ListTrialsRequest other = (ListTrialsRequest) obj;
        if (other.getExperimentName() == null ^ this.getExperimentName() == null)
            return false;
        if (other.getExperimentName() != null && other.getExperimentName().equals(this.getExperimentName()) == false)
            return false;
        if (other.getTrialComponentName() == null ^ this.getTrialComponentName() == null)
            return false;
        if (other.getTrialComponentName() != null && other.getTrialComponentName().equals(this.getTrialComponentName()) == false)
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
        hashCode = prime * hashCode + ((getTrialComponentName() == null) ? 0 : getTrialComponentName().hashCode());
        hashCode = prime * hashCode + ((getCreatedAfter() == null) ? 0 : getCreatedAfter().hashCode());
        hashCode = prime * hashCode + ((getCreatedBefore() == null) ? 0 : getCreatedBefore().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTrialsRequest clone() {
        return (ListTrialsRequest) super.clone();
    }

}
