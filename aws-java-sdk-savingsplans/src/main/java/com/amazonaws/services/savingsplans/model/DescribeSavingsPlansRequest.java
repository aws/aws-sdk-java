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
package com.amazonaws.services.savingsplans.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/savingsplans-2019-06-28/DescribeSavingsPlans" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSavingsPlansRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the Savings Plans.
     * </p>
     */
    private java.util.List<String> savingsPlanArns;
    /**
     * <p>
     * The IDs of the Savings Plans.
     * </p>
     */
    private java.util.List<String> savingsPlanIds;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve additional results, make another call
     * with the returned token value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The states.
     * </p>
     */
    private java.util.List<String> states;
    /**
     * <p>
     * The filters.
     * </p>
     */
    private java.util.List<SavingsPlanFilter> filters;

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the Savings Plans.
     * </p>
     * 
     * @return The Amazon Resource Names (ARN) of the Savings Plans.
     */

    public java.util.List<String> getSavingsPlanArns() {
        return savingsPlanArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the Savings Plans.
     * </p>
     * 
     * @param savingsPlanArns
     *        The Amazon Resource Names (ARN) of the Savings Plans.
     */

    public void setSavingsPlanArns(java.util.Collection<String> savingsPlanArns) {
        if (savingsPlanArns == null) {
            this.savingsPlanArns = null;
            return;
        }

        this.savingsPlanArns = new java.util.ArrayList<String>(savingsPlanArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the Savings Plans.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSavingsPlanArns(java.util.Collection)} or {@link #withSavingsPlanArns(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param savingsPlanArns
     *        The Amazon Resource Names (ARN) of the Savings Plans.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSavingsPlansRequest withSavingsPlanArns(String... savingsPlanArns) {
        if (this.savingsPlanArns == null) {
            setSavingsPlanArns(new java.util.ArrayList<String>(savingsPlanArns.length));
        }
        for (String ele : savingsPlanArns) {
            this.savingsPlanArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the Savings Plans.
     * </p>
     * 
     * @param savingsPlanArns
     *        The Amazon Resource Names (ARN) of the Savings Plans.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSavingsPlansRequest withSavingsPlanArns(java.util.Collection<String> savingsPlanArns) {
        setSavingsPlanArns(savingsPlanArns);
        return this;
    }

    /**
     * <p>
     * The IDs of the Savings Plans.
     * </p>
     * 
     * @return The IDs of the Savings Plans.
     */

    public java.util.List<String> getSavingsPlanIds() {
        return savingsPlanIds;
    }

    /**
     * <p>
     * The IDs of the Savings Plans.
     * </p>
     * 
     * @param savingsPlanIds
     *        The IDs of the Savings Plans.
     */

    public void setSavingsPlanIds(java.util.Collection<String> savingsPlanIds) {
        if (savingsPlanIds == null) {
            this.savingsPlanIds = null;
            return;
        }

        this.savingsPlanIds = new java.util.ArrayList<String>(savingsPlanIds);
    }

    /**
     * <p>
     * The IDs of the Savings Plans.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSavingsPlanIds(java.util.Collection)} or {@link #withSavingsPlanIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param savingsPlanIds
     *        The IDs of the Savings Plans.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSavingsPlansRequest withSavingsPlanIds(String... savingsPlanIds) {
        if (this.savingsPlanIds == null) {
            setSavingsPlanIds(new java.util.ArrayList<String>(savingsPlanIds.length));
        }
        for (String ele : savingsPlanIds) {
            this.savingsPlanIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Savings Plans.
     * </p>
     * 
     * @param savingsPlanIds
     *        The IDs of the Savings Plans.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSavingsPlansRequest withSavingsPlanIds(java.util.Collection<String> savingsPlanIds) {
        setSavingsPlanIds(savingsPlanIds);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSavingsPlansRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve additional results, make another call
     * with the returned token value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve additional results, make another
     *        call with the returned token value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve additional results, make another call
     * with the returned token value.
     * </p>
     * 
     * @return The maximum number of results to return with a single call. To retrieve additional results, make another
     *         call with the returned token value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve additional results, make another call
     * with the returned token value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve additional results, make another
     *        call with the returned token value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSavingsPlansRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The states.
     * </p>
     * 
     * @return The states.
     * @see SavingsPlanState
     */

    public java.util.List<String> getStates() {
        return states;
    }

    /**
     * <p>
     * The states.
     * </p>
     * 
     * @param states
     *        The states.
     * @see SavingsPlanState
     */

    public void setStates(java.util.Collection<String> states) {
        if (states == null) {
            this.states = null;
            return;
        }

        this.states = new java.util.ArrayList<String>(states);
    }

    /**
     * <p>
     * The states.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStates(java.util.Collection)} or {@link #withStates(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param states
     *        The states.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanState
     */

    public DescribeSavingsPlansRequest withStates(String... states) {
        if (this.states == null) {
            setStates(new java.util.ArrayList<String>(states.length));
        }
        for (String ele : states) {
            this.states.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The states.
     * </p>
     * 
     * @param states
     *        The states.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanState
     */

    public DescribeSavingsPlansRequest withStates(java.util.Collection<String> states) {
        setStates(states);
        return this;
    }

    /**
     * <p>
     * The states.
     * </p>
     * 
     * @param states
     *        The states.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanState
     */

    public DescribeSavingsPlansRequest withStates(SavingsPlanState... states) {
        java.util.ArrayList<String> statesCopy = new java.util.ArrayList<String>(states.length);
        for (SavingsPlanState value : states) {
            statesCopy.add(value.toString());
        }
        if (getStates() == null) {
            setStates(statesCopy);
        } else {
            getStates().addAll(statesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * 
     * @return The filters.
     */

    public java.util.List<SavingsPlanFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * 
     * @param filters
     *        The filters.
     */

    public void setFilters(java.util.Collection<SavingsPlanFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<SavingsPlanFilter>(filters);
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        The filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSavingsPlansRequest withFilters(SavingsPlanFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<SavingsPlanFilter>(filters.length));
        }
        for (SavingsPlanFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * 
     * @param filters
     *        The filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSavingsPlansRequest withFilters(java.util.Collection<SavingsPlanFilter> filters) {
        setFilters(filters);
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
        if (getSavingsPlanArns() != null)
            sb.append("SavingsPlanArns: ").append(getSavingsPlanArns()).append(",");
        if (getSavingsPlanIds() != null)
            sb.append("SavingsPlanIds: ").append(getSavingsPlanIds()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getStates() != null)
            sb.append("States: ").append(getStates()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSavingsPlansRequest == false)
            return false;
        DescribeSavingsPlansRequest other = (DescribeSavingsPlansRequest) obj;
        if (other.getSavingsPlanArns() == null ^ this.getSavingsPlanArns() == null)
            return false;
        if (other.getSavingsPlanArns() != null && other.getSavingsPlanArns().equals(this.getSavingsPlanArns()) == false)
            return false;
        if (other.getSavingsPlanIds() == null ^ this.getSavingsPlanIds() == null)
            return false;
        if (other.getSavingsPlanIds() != null && other.getSavingsPlanIds().equals(this.getSavingsPlanIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getStates() == null ^ this.getStates() == null)
            return false;
        if (other.getStates() != null && other.getStates().equals(this.getStates()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSavingsPlanArns() == null) ? 0 : getSavingsPlanArns().hashCode());
        hashCode = prime * hashCode + ((getSavingsPlanIds() == null) ? 0 : getSavingsPlanIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getStates() == null) ? 0 : getStates().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSavingsPlansRequest clone() {
        return (DescribeSavingsPlansRequest) super.clone();
    }

}
