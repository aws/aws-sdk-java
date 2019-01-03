/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ListReviewPolicyResultsForHIT"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListReviewPolicyResultsForHITRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the HIT to retrieve review results for.
     * </p>
     */
    private String hITId;
    /**
     * <p>
     * The Policy Level(s) to retrieve review results for - HIT or Assignment. If omitted, the default behavior is to
     * retrieve all data for both policy levels. For a list of all the described policies, see Review Policies.
     * </p>
     */
    private java.util.List<String> policyLevels;
    /**
     * <p>
     * Specify if the operation should retrieve a list of the actions taken executing the Review Policies and their
     * outcomes.
     * </p>
     */
    private Boolean retrieveActions;
    /**
     * <p>
     * Specify if the operation should retrieve a list of the results computed by the Review Policies.
     * </p>
     */
    private Boolean retrieveResults;
    /**
     * <p>
     * Pagination token
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Limit the number of results returned.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The unique identifier of the HIT to retrieve review results for.
     * </p>
     * 
     * @param hITId
     *        The unique identifier of the HIT to retrieve review results for.
     */

    public void setHITId(String hITId) {
        this.hITId = hITId;
    }

    /**
     * <p>
     * The unique identifier of the HIT to retrieve review results for.
     * </p>
     * 
     * @return The unique identifier of the HIT to retrieve review results for.
     */

    public String getHITId() {
        return this.hITId;
    }

    /**
     * <p>
     * The unique identifier of the HIT to retrieve review results for.
     * </p>
     * 
     * @param hITId
     *        The unique identifier of the HIT to retrieve review results for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReviewPolicyResultsForHITRequest withHITId(String hITId) {
        setHITId(hITId);
        return this;
    }

    /**
     * <p>
     * The Policy Level(s) to retrieve review results for - HIT or Assignment. If omitted, the default behavior is to
     * retrieve all data for both policy levels. For a list of all the described policies, see Review Policies.
     * </p>
     * 
     * @return The Policy Level(s) to retrieve review results for - HIT or Assignment. If omitted, the default behavior
     *         is to retrieve all data for both policy levels. For a list of all the described policies, see Review
     *         Policies.
     * @see ReviewPolicyLevel
     */

    public java.util.List<String> getPolicyLevels() {
        return policyLevels;
    }

    /**
     * <p>
     * The Policy Level(s) to retrieve review results for - HIT or Assignment. If omitted, the default behavior is to
     * retrieve all data for both policy levels. For a list of all the described policies, see Review Policies.
     * </p>
     * 
     * @param policyLevels
     *        The Policy Level(s) to retrieve review results for - HIT or Assignment. If omitted, the default behavior
     *        is to retrieve all data for both policy levels. For a list of all the described policies, see Review
     *        Policies.
     * @see ReviewPolicyLevel
     */

    public void setPolicyLevels(java.util.Collection<String> policyLevels) {
        if (policyLevels == null) {
            this.policyLevels = null;
            return;
        }

        this.policyLevels = new java.util.ArrayList<String>(policyLevels);
    }

    /**
     * <p>
     * The Policy Level(s) to retrieve review results for - HIT or Assignment. If omitted, the default behavior is to
     * retrieve all data for both policy levels. For a list of all the described policies, see Review Policies.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyLevels(java.util.Collection)} or {@link #withPolicyLevels(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param policyLevels
     *        The Policy Level(s) to retrieve review results for - HIT or Assignment. If omitted, the default behavior
     *        is to retrieve all data for both policy levels. For a list of all the described policies, see Review
     *        Policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReviewPolicyLevel
     */

    public ListReviewPolicyResultsForHITRequest withPolicyLevels(String... policyLevels) {
        if (this.policyLevels == null) {
            setPolicyLevels(new java.util.ArrayList<String>(policyLevels.length));
        }
        for (String ele : policyLevels) {
            this.policyLevels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Policy Level(s) to retrieve review results for - HIT or Assignment. If omitted, the default behavior is to
     * retrieve all data for both policy levels. For a list of all the described policies, see Review Policies.
     * </p>
     * 
     * @param policyLevels
     *        The Policy Level(s) to retrieve review results for - HIT or Assignment. If omitted, the default behavior
     *        is to retrieve all data for both policy levels. For a list of all the described policies, see Review
     *        Policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReviewPolicyLevel
     */

    public ListReviewPolicyResultsForHITRequest withPolicyLevels(java.util.Collection<String> policyLevels) {
        setPolicyLevels(policyLevels);
        return this;
    }

    /**
     * <p>
     * The Policy Level(s) to retrieve review results for - HIT or Assignment. If omitted, the default behavior is to
     * retrieve all data for both policy levels. For a list of all the described policies, see Review Policies.
     * </p>
     * 
     * @param policyLevels
     *        The Policy Level(s) to retrieve review results for - HIT or Assignment. If omitted, the default behavior
     *        is to retrieve all data for both policy levels. For a list of all the described policies, see Review
     *        Policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReviewPolicyLevel
     */

    public ListReviewPolicyResultsForHITRequest withPolicyLevels(ReviewPolicyLevel... policyLevels) {
        java.util.ArrayList<String> policyLevelsCopy = new java.util.ArrayList<String>(policyLevels.length);
        for (ReviewPolicyLevel value : policyLevels) {
            policyLevelsCopy.add(value.toString());
        }
        if (getPolicyLevels() == null) {
            setPolicyLevels(policyLevelsCopy);
        } else {
            getPolicyLevels().addAll(policyLevelsCopy);
        }
        return this;
    }

    /**
     * <p>
     * Specify if the operation should retrieve a list of the actions taken executing the Review Policies and their
     * outcomes.
     * </p>
     * 
     * @param retrieveActions
     *        Specify if the operation should retrieve a list of the actions taken executing the Review Policies and
     *        their outcomes.
     */

    public void setRetrieveActions(Boolean retrieveActions) {
        this.retrieveActions = retrieveActions;
    }

    /**
     * <p>
     * Specify if the operation should retrieve a list of the actions taken executing the Review Policies and their
     * outcomes.
     * </p>
     * 
     * @return Specify if the operation should retrieve a list of the actions taken executing the Review Policies and
     *         their outcomes.
     */

    public Boolean getRetrieveActions() {
        return this.retrieveActions;
    }

    /**
     * <p>
     * Specify if the operation should retrieve a list of the actions taken executing the Review Policies and their
     * outcomes.
     * </p>
     * 
     * @param retrieveActions
     *        Specify if the operation should retrieve a list of the actions taken executing the Review Policies and
     *        their outcomes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReviewPolicyResultsForHITRequest withRetrieveActions(Boolean retrieveActions) {
        setRetrieveActions(retrieveActions);
        return this;
    }

    /**
     * <p>
     * Specify if the operation should retrieve a list of the actions taken executing the Review Policies and their
     * outcomes.
     * </p>
     * 
     * @return Specify if the operation should retrieve a list of the actions taken executing the Review Policies and
     *         their outcomes.
     */

    public Boolean isRetrieveActions() {
        return this.retrieveActions;
    }

    /**
     * <p>
     * Specify if the operation should retrieve a list of the results computed by the Review Policies.
     * </p>
     * 
     * @param retrieveResults
     *        Specify if the operation should retrieve a list of the results computed by the Review Policies.
     */

    public void setRetrieveResults(Boolean retrieveResults) {
        this.retrieveResults = retrieveResults;
    }

    /**
     * <p>
     * Specify if the operation should retrieve a list of the results computed by the Review Policies.
     * </p>
     * 
     * @return Specify if the operation should retrieve a list of the results computed by the Review Policies.
     */

    public Boolean getRetrieveResults() {
        return this.retrieveResults;
    }

    /**
     * <p>
     * Specify if the operation should retrieve a list of the results computed by the Review Policies.
     * </p>
     * 
     * @param retrieveResults
     *        Specify if the operation should retrieve a list of the results computed by the Review Policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReviewPolicyResultsForHITRequest withRetrieveResults(Boolean retrieveResults) {
        setRetrieveResults(retrieveResults);
        return this;
    }

    /**
     * <p>
     * Specify if the operation should retrieve a list of the results computed by the Review Policies.
     * </p>
     * 
     * @return Specify if the operation should retrieve a list of the results computed by the Review Policies.
     */

    public Boolean isRetrieveResults() {
        return this.retrieveResults;
    }

    /**
     * <p>
     * Pagination token
     * </p>
     * 
     * @param nextToken
     *        Pagination token
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token
     * </p>
     * 
     * @return Pagination token
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token
     * </p>
     * 
     * @param nextToken
     *        Pagination token
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReviewPolicyResultsForHITRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Limit the number of results returned.
     * </p>
     * 
     * @param maxResults
     *        Limit the number of results returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Limit the number of results returned.
     * </p>
     * 
     * @return Limit the number of results returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Limit the number of results returned.
     * </p>
     * 
     * @param maxResults
     *        Limit the number of results returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReviewPolicyResultsForHITRequest withMaxResults(Integer maxResults) {
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
        if (getHITId() != null)
            sb.append("HITId: ").append(getHITId()).append(",");
        if (getPolicyLevels() != null)
            sb.append("PolicyLevels: ").append(getPolicyLevels()).append(",");
        if (getRetrieveActions() != null)
            sb.append("RetrieveActions: ").append(getRetrieveActions()).append(",");
        if (getRetrieveResults() != null)
            sb.append("RetrieveResults: ").append(getRetrieveResults()).append(",");
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

        if (obj instanceof ListReviewPolicyResultsForHITRequest == false)
            return false;
        ListReviewPolicyResultsForHITRequest other = (ListReviewPolicyResultsForHITRequest) obj;
        if (other.getHITId() == null ^ this.getHITId() == null)
            return false;
        if (other.getHITId() != null && other.getHITId().equals(this.getHITId()) == false)
            return false;
        if (other.getPolicyLevels() == null ^ this.getPolicyLevels() == null)
            return false;
        if (other.getPolicyLevels() != null && other.getPolicyLevels().equals(this.getPolicyLevels()) == false)
            return false;
        if (other.getRetrieveActions() == null ^ this.getRetrieveActions() == null)
            return false;
        if (other.getRetrieveActions() != null && other.getRetrieveActions().equals(this.getRetrieveActions()) == false)
            return false;
        if (other.getRetrieveResults() == null ^ this.getRetrieveResults() == null)
            return false;
        if (other.getRetrieveResults() != null && other.getRetrieveResults().equals(this.getRetrieveResults()) == false)
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

        hashCode = prime * hashCode + ((getHITId() == null) ? 0 : getHITId().hashCode());
        hashCode = prime * hashCode + ((getPolicyLevels() == null) ? 0 : getPolicyLevels().hashCode());
        hashCode = prime * hashCode + ((getRetrieveActions() == null) ? 0 : getRetrieveActions().hashCode());
        hashCode = prime * hashCode + ((getRetrieveResults() == null) ? 0 : getRetrieveResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListReviewPolicyResultsForHITRequest clone() {
        return (ListReviewPolicyResultsForHITRequest) super.clone();
    }

}
