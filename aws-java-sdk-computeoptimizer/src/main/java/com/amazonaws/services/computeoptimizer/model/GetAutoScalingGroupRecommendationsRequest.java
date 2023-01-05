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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetAutoScalingGroupRecommendations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAutoScalingGroupRecommendationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services account for which to return Auto Scaling group recommendations.
     * </p>
     * <p>
     * If your account is the management account of an organization, use this parameter to specify the member account
     * for which you want to return Auto Scaling group recommendations.
     * </p>
     * <p>
     * Only one account ID can be specified per request.
     * </p>
     */
    private java.util.List<String> accountIds;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Auto Scaling groups for which to return recommendations.
     * </p>
     */
    private java.util.List<String> autoScalingGroupArns;
    /**
     * <p>
     * The token to advance to the next page of Auto Scaling group recommendations.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of Auto Scaling group recommendations to return with a single request.
     * </p>
     * <p>
     * To retrieve the remaining results, make another request with the returned <code>nextToken</code> value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * An array of objects to specify a filter that returns a more specific list of Auto Scaling group recommendations.
     * </p>
     */
    private java.util.List<Filter> filters;
    /**
     * <p>
     * An object to specify the preferences for the Auto Scaling group recommendations to return in the response.
     * </p>
     */
    private RecommendationPreferences recommendationPreferences;

    /**
     * <p>
     * The ID of the Amazon Web Services account for which to return Auto Scaling group recommendations.
     * </p>
     * <p>
     * If your account is the management account of an organization, use this parameter to specify the member account
     * for which you want to return Auto Scaling group recommendations.
     * </p>
     * <p>
     * Only one account ID can be specified per request.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account for which to return Auto Scaling group recommendations.</p>
     *         <p>
     *         If your account is the management account of an organization, use this parameter to specify the member
     *         account for which you want to return Auto Scaling group recommendations.
     *         </p>
     *         <p>
     *         Only one account ID can be specified per request.
     */

    public java.util.List<String> getAccountIds() {
        return accountIds;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account for which to return Auto Scaling group recommendations.
     * </p>
     * <p>
     * If your account is the management account of an organization, use this parameter to specify the member account
     * for which you want to return Auto Scaling group recommendations.
     * </p>
     * <p>
     * Only one account ID can be specified per request.
     * </p>
     * 
     * @param accountIds
     *        The ID of the Amazon Web Services account for which to return Auto Scaling group recommendations.</p>
     *        <p>
     *        If your account is the management account of an organization, use this parameter to specify the member
     *        account for which you want to return Auto Scaling group recommendations.
     *        </p>
     *        <p>
     *        Only one account ID can be specified per request.
     */

    public void setAccountIds(java.util.Collection<String> accountIds) {
        if (accountIds == null) {
            this.accountIds = null;
            return;
        }

        this.accountIds = new java.util.ArrayList<String>(accountIds);
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account for which to return Auto Scaling group recommendations.
     * </p>
     * <p>
     * If your account is the management account of an organization, use this parameter to specify the member account
     * for which you want to return Auto Scaling group recommendations.
     * </p>
     * <p>
     * Only one account ID can be specified per request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountIds(java.util.Collection)} or {@link #withAccountIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accountIds
     *        The ID of the Amazon Web Services account for which to return Auto Scaling group recommendations.</p>
     *        <p>
     *        If your account is the management account of an organization, use this parameter to specify the member
     *        account for which you want to return Auto Scaling group recommendations.
     *        </p>
     *        <p>
     *        Only one account ID can be specified per request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAutoScalingGroupRecommendationsRequest withAccountIds(String... accountIds) {
        if (this.accountIds == null) {
            setAccountIds(new java.util.ArrayList<String>(accountIds.length));
        }
        for (String ele : accountIds) {
            this.accountIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account for which to return Auto Scaling group recommendations.
     * </p>
     * <p>
     * If your account is the management account of an organization, use this parameter to specify the member account
     * for which you want to return Auto Scaling group recommendations.
     * </p>
     * <p>
     * Only one account ID can be specified per request.
     * </p>
     * 
     * @param accountIds
     *        The ID of the Amazon Web Services account for which to return Auto Scaling group recommendations.</p>
     *        <p>
     *        If your account is the management account of an organization, use this parameter to specify the member
     *        account for which you want to return Auto Scaling group recommendations.
     *        </p>
     *        <p>
     *        Only one account ID can be specified per request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAutoScalingGroupRecommendationsRequest withAccountIds(java.util.Collection<String> accountIds) {
        setAccountIds(accountIds);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Auto Scaling groups for which to return recommendations.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Auto Scaling groups for which to return recommendations.
     */

    public java.util.List<String> getAutoScalingGroupArns() {
        return autoScalingGroupArns;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Auto Scaling groups for which to return recommendations.
     * </p>
     * 
     * @param autoScalingGroupArns
     *        The Amazon Resource Name (ARN) of the Auto Scaling groups for which to return recommendations.
     */

    public void setAutoScalingGroupArns(java.util.Collection<String> autoScalingGroupArns) {
        if (autoScalingGroupArns == null) {
            this.autoScalingGroupArns = null;
            return;
        }

        this.autoScalingGroupArns = new java.util.ArrayList<String>(autoScalingGroupArns);
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Auto Scaling groups for which to return recommendations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAutoScalingGroupArns(java.util.Collection)} or {@link #withAutoScalingGroupArns(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param autoScalingGroupArns
     *        The Amazon Resource Name (ARN) of the Auto Scaling groups for which to return recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAutoScalingGroupRecommendationsRequest withAutoScalingGroupArns(String... autoScalingGroupArns) {
        if (this.autoScalingGroupArns == null) {
            setAutoScalingGroupArns(new java.util.ArrayList<String>(autoScalingGroupArns.length));
        }
        for (String ele : autoScalingGroupArns) {
            this.autoScalingGroupArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Auto Scaling groups for which to return recommendations.
     * </p>
     * 
     * @param autoScalingGroupArns
     *        The Amazon Resource Name (ARN) of the Auto Scaling groups for which to return recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAutoScalingGroupRecommendationsRequest withAutoScalingGroupArns(java.util.Collection<String> autoScalingGroupArns) {
        setAutoScalingGroupArns(autoScalingGroupArns);
        return this;
    }

    /**
     * <p>
     * The token to advance to the next page of Auto Scaling group recommendations.
     * </p>
     * 
     * @param nextToken
     *        The token to advance to the next page of Auto Scaling group recommendations.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to advance to the next page of Auto Scaling group recommendations.
     * </p>
     * 
     * @return The token to advance to the next page of Auto Scaling group recommendations.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to advance to the next page of Auto Scaling group recommendations.
     * </p>
     * 
     * @param nextToken
     *        The token to advance to the next page of Auto Scaling group recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAutoScalingGroupRecommendationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of Auto Scaling group recommendations to return with a single request.
     * </p>
     * <p>
     * To retrieve the remaining results, make another request with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of Auto Scaling group recommendations to return with a single request.</p>
     *        <p>
     *        To retrieve the remaining results, make another request with the returned <code>nextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of Auto Scaling group recommendations to return with a single request.
     * </p>
     * <p>
     * To retrieve the remaining results, make another request with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @return The maximum number of Auto Scaling group recommendations to return with a single request.</p>
     *         <p>
     *         To retrieve the remaining results, make another request with the returned <code>nextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of Auto Scaling group recommendations to return with a single request.
     * </p>
     * <p>
     * To retrieve the remaining results, make another request with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of Auto Scaling group recommendations to return with a single request.</p>
     *        <p>
     *        To retrieve the remaining results, make another request with the returned <code>nextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAutoScalingGroupRecommendationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * An array of objects to specify a filter that returns a more specific list of Auto Scaling group recommendations.
     * </p>
     * 
     * @return An array of objects to specify a filter that returns a more specific list of Auto Scaling group
     *         recommendations.
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * An array of objects to specify a filter that returns a more specific list of Auto Scaling group recommendations.
     * </p>
     * 
     * @param filters
     *        An array of objects to specify a filter that returns a more specific list of Auto Scaling group
     *        recommendations.
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * An array of objects to specify a filter that returns a more specific list of Auto Scaling group recommendations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        An array of objects to specify a filter that returns a more specific list of Auto Scaling group
     *        recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAutoScalingGroupRecommendationsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects to specify a filter that returns a more specific list of Auto Scaling group recommendations.
     * </p>
     * 
     * @param filters
     *        An array of objects to specify a filter that returns a more specific list of Auto Scaling group
     *        recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAutoScalingGroupRecommendationsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * An object to specify the preferences for the Auto Scaling group recommendations to return in the response.
     * </p>
     * 
     * @param recommendationPreferences
     *        An object to specify the preferences for the Auto Scaling group recommendations to return in the response.
     */

    public void setRecommendationPreferences(RecommendationPreferences recommendationPreferences) {
        this.recommendationPreferences = recommendationPreferences;
    }

    /**
     * <p>
     * An object to specify the preferences for the Auto Scaling group recommendations to return in the response.
     * </p>
     * 
     * @return An object to specify the preferences for the Auto Scaling group recommendations to return in the
     *         response.
     */

    public RecommendationPreferences getRecommendationPreferences() {
        return this.recommendationPreferences;
    }

    /**
     * <p>
     * An object to specify the preferences for the Auto Scaling group recommendations to return in the response.
     * </p>
     * 
     * @param recommendationPreferences
     *        An object to specify the preferences for the Auto Scaling group recommendations to return in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAutoScalingGroupRecommendationsRequest withRecommendationPreferences(RecommendationPreferences recommendationPreferences) {
        setRecommendationPreferences(recommendationPreferences);
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
        if (getAccountIds() != null)
            sb.append("AccountIds: ").append(getAccountIds()).append(",");
        if (getAutoScalingGroupArns() != null)
            sb.append("AutoScalingGroupArns: ").append(getAutoScalingGroupArns()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getRecommendationPreferences() != null)
            sb.append("RecommendationPreferences: ").append(getRecommendationPreferences());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAutoScalingGroupRecommendationsRequest == false)
            return false;
        GetAutoScalingGroupRecommendationsRequest other = (GetAutoScalingGroupRecommendationsRequest) obj;
        if (other.getAccountIds() == null ^ this.getAccountIds() == null)
            return false;
        if (other.getAccountIds() != null && other.getAccountIds().equals(this.getAccountIds()) == false)
            return false;
        if (other.getAutoScalingGroupArns() == null ^ this.getAutoScalingGroupArns() == null)
            return false;
        if (other.getAutoScalingGroupArns() != null && other.getAutoScalingGroupArns().equals(this.getAutoScalingGroupArns()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getRecommendationPreferences() == null ^ this.getRecommendationPreferences() == null)
            return false;
        if (other.getRecommendationPreferences() != null && other.getRecommendationPreferences().equals(this.getRecommendationPreferences()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountIds() == null) ? 0 : getAccountIds().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingGroupArns() == null) ? 0 : getAutoScalingGroupArns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getRecommendationPreferences() == null) ? 0 : getRecommendationPreferences().hashCode());
        return hashCode;
    }

    @Override
    public GetAutoScalingGroupRecommendationsRequest clone() {
        return (GetAutoScalingGroupRecommendationsRequest) super.clone();
    }

}
