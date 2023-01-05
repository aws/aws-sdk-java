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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetECSServiceRecommendations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetECSServiceRecommendationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN that identifies the ECS service.
     * </p>
     * <p>
     * The following is the format of the ARN:
     * </p>
     * <p>
     * <code>arn:aws:ecs:region:aws_account_id:service/cluster-name/service-name</code>
     * </p>
     */
    private java.util.List<String> serviceArns;
    /**
     * <p>
     * The token to advance to the next page of ECS service recommendations.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of ECS service recommendations to return with a single request.
     * </p>
     * <p>
     * To retrieve the remaining results, make another request with the returned <code>nextToken</code> value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * An array of objects to specify a filter that returns a more specific list of ECS service recommendations.
     * </p>
     */
    private java.util.List<ECSServiceRecommendationFilter> filters;
    /**
     * <p>
     * Return the ECS service recommendations to the specified Amazon Web Services account IDs.
     * </p>
     * <p>
     * If your account is the management account or the delegated administrator of an organization, use this parameter
     * to return the ECS service recommendations to specific member accounts.
     * </p>
     * <p>
     * You can only specify one account ID per request.
     * </p>
     */
    private java.util.List<String> accountIds;

    /**
     * <p>
     * The ARN that identifies the ECS service.
     * </p>
     * <p>
     * The following is the format of the ARN:
     * </p>
     * <p>
     * <code>arn:aws:ecs:region:aws_account_id:service/cluster-name/service-name</code>
     * </p>
     * 
     * @return The ARN that identifies the ECS service. </p>
     *         <p>
     *         The following is the format of the ARN:
     *         </p>
     *         <p>
     *         <code>arn:aws:ecs:region:aws_account_id:service/cluster-name/service-name</code>
     */

    public java.util.List<String> getServiceArns() {
        return serviceArns;
    }

    /**
     * <p>
     * The ARN that identifies the ECS service.
     * </p>
     * <p>
     * The following is the format of the ARN:
     * </p>
     * <p>
     * <code>arn:aws:ecs:region:aws_account_id:service/cluster-name/service-name</code>
     * </p>
     * 
     * @param serviceArns
     *        The ARN that identifies the ECS service. </p>
     *        <p>
     *        The following is the format of the ARN:
     *        </p>
     *        <p>
     *        <code>arn:aws:ecs:region:aws_account_id:service/cluster-name/service-name</code>
     */

    public void setServiceArns(java.util.Collection<String> serviceArns) {
        if (serviceArns == null) {
            this.serviceArns = null;
            return;
        }

        this.serviceArns = new java.util.ArrayList<String>(serviceArns);
    }

    /**
     * <p>
     * The ARN that identifies the ECS service.
     * </p>
     * <p>
     * The following is the format of the ARN:
     * </p>
     * <p>
     * <code>arn:aws:ecs:region:aws_account_id:service/cluster-name/service-name</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceArns(java.util.Collection)} or {@link #withServiceArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param serviceArns
     *        The ARN that identifies the ECS service. </p>
     *        <p>
     *        The following is the format of the ARN:
     *        </p>
     *        <p>
     *        <code>arn:aws:ecs:region:aws_account_id:service/cluster-name/service-name</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetECSServiceRecommendationsRequest withServiceArns(String... serviceArns) {
        if (this.serviceArns == null) {
            setServiceArns(new java.util.ArrayList<String>(serviceArns.length));
        }
        for (String ele : serviceArns) {
            this.serviceArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARN that identifies the ECS service.
     * </p>
     * <p>
     * The following is the format of the ARN:
     * </p>
     * <p>
     * <code>arn:aws:ecs:region:aws_account_id:service/cluster-name/service-name</code>
     * </p>
     * 
     * @param serviceArns
     *        The ARN that identifies the ECS service. </p>
     *        <p>
     *        The following is the format of the ARN:
     *        </p>
     *        <p>
     *        <code>arn:aws:ecs:region:aws_account_id:service/cluster-name/service-name</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetECSServiceRecommendationsRequest withServiceArns(java.util.Collection<String> serviceArns) {
        setServiceArns(serviceArns);
        return this;
    }

    /**
     * <p>
     * The token to advance to the next page of ECS service recommendations.
     * </p>
     * 
     * @param nextToken
     *        The token to advance to the next page of ECS service recommendations.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to advance to the next page of ECS service recommendations.
     * </p>
     * 
     * @return The token to advance to the next page of ECS service recommendations.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to advance to the next page of ECS service recommendations.
     * </p>
     * 
     * @param nextToken
     *        The token to advance to the next page of ECS service recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetECSServiceRecommendationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of ECS service recommendations to return with a single request.
     * </p>
     * <p>
     * To retrieve the remaining results, make another request with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of ECS service recommendations to return with a single request. </p>
     *        <p>
     *        To retrieve the remaining results, make another request with the returned <code>nextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of ECS service recommendations to return with a single request.
     * </p>
     * <p>
     * To retrieve the remaining results, make another request with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @return The maximum number of ECS service recommendations to return with a single request. </p>
     *         <p>
     *         To retrieve the remaining results, make another request with the returned <code>nextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of ECS service recommendations to return with a single request.
     * </p>
     * <p>
     * To retrieve the remaining results, make another request with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of ECS service recommendations to return with a single request. </p>
     *        <p>
     *        To retrieve the remaining results, make another request with the returned <code>nextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetECSServiceRecommendationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * An array of objects to specify a filter that returns a more specific list of ECS service recommendations.
     * </p>
     * 
     * @return An array of objects to specify a filter that returns a more specific list of ECS service recommendations.
     */

    public java.util.List<ECSServiceRecommendationFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * An array of objects to specify a filter that returns a more specific list of ECS service recommendations.
     * </p>
     * 
     * @param filters
     *        An array of objects to specify a filter that returns a more specific list of ECS service recommendations.
     */

    public void setFilters(java.util.Collection<ECSServiceRecommendationFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<ECSServiceRecommendationFilter>(filters);
    }

    /**
     * <p>
     * An array of objects to specify a filter that returns a more specific list of ECS service recommendations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        An array of objects to specify a filter that returns a more specific list of ECS service recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetECSServiceRecommendationsRequest withFilters(ECSServiceRecommendationFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<ECSServiceRecommendationFilter>(filters.length));
        }
        for (ECSServiceRecommendationFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects to specify a filter that returns a more specific list of ECS service recommendations.
     * </p>
     * 
     * @param filters
     *        An array of objects to specify a filter that returns a more specific list of ECS service recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetECSServiceRecommendationsRequest withFilters(java.util.Collection<ECSServiceRecommendationFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Return the ECS service recommendations to the specified Amazon Web Services account IDs.
     * </p>
     * <p>
     * If your account is the management account or the delegated administrator of an organization, use this parameter
     * to return the ECS service recommendations to specific member accounts.
     * </p>
     * <p>
     * You can only specify one account ID per request.
     * </p>
     * 
     * @return Return the ECS service recommendations to the specified Amazon Web Services account IDs. </p>
     *         <p>
     *         If your account is the management account or the delegated administrator of an organization, use this
     *         parameter to return the ECS service recommendations to specific member accounts.
     *         </p>
     *         <p>
     *         You can only specify one account ID per request.
     */

    public java.util.List<String> getAccountIds() {
        return accountIds;
    }

    /**
     * <p>
     * Return the ECS service recommendations to the specified Amazon Web Services account IDs.
     * </p>
     * <p>
     * If your account is the management account or the delegated administrator of an organization, use this parameter
     * to return the ECS service recommendations to specific member accounts.
     * </p>
     * <p>
     * You can only specify one account ID per request.
     * </p>
     * 
     * @param accountIds
     *        Return the ECS service recommendations to the specified Amazon Web Services account IDs. </p>
     *        <p>
     *        If your account is the management account or the delegated administrator of an organization, use this
     *        parameter to return the ECS service recommendations to specific member accounts.
     *        </p>
     *        <p>
     *        You can only specify one account ID per request.
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
     * Return the ECS service recommendations to the specified Amazon Web Services account IDs.
     * </p>
     * <p>
     * If your account is the management account or the delegated administrator of an organization, use this parameter
     * to return the ECS service recommendations to specific member accounts.
     * </p>
     * <p>
     * You can only specify one account ID per request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountIds(java.util.Collection)} or {@link #withAccountIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accountIds
     *        Return the ECS service recommendations to the specified Amazon Web Services account IDs. </p>
     *        <p>
     *        If your account is the management account or the delegated administrator of an organization, use this
     *        parameter to return the ECS service recommendations to specific member accounts.
     *        </p>
     *        <p>
     *        You can only specify one account ID per request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetECSServiceRecommendationsRequest withAccountIds(String... accountIds) {
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
     * Return the ECS service recommendations to the specified Amazon Web Services account IDs.
     * </p>
     * <p>
     * If your account is the management account or the delegated administrator of an organization, use this parameter
     * to return the ECS service recommendations to specific member accounts.
     * </p>
     * <p>
     * You can only specify one account ID per request.
     * </p>
     * 
     * @param accountIds
     *        Return the ECS service recommendations to the specified Amazon Web Services account IDs. </p>
     *        <p>
     *        If your account is the management account or the delegated administrator of an organization, use this
     *        parameter to return the ECS service recommendations to specific member accounts.
     *        </p>
     *        <p>
     *        You can only specify one account ID per request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetECSServiceRecommendationsRequest withAccountIds(java.util.Collection<String> accountIds) {
        setAccountIds(accountIds);
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
        if (getServiceArns() != null)
            sb.append("ServiceArns: ").append(getServiceArns()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getAccountIds() != null)
            sb.append("AccountIds: ").append(getAccountIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetECSServiceRecommendationsRequest == false)
            return false;
        GetECSServiceRecommendationsRequest other = (GetECSServiceRecommendationsRequest) obj;
        if (other.getServiceArns() == null ^ this.getServiceArns() == null)
            return false;
        if (other.getServiceArns() != null && other.getServiceArns().equals(this.getServiceArns()) == false)
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
        if (other.getAccountIds() == null ^ this.getAccountIds() == null)
            return false;
        if (other.getAccountIds() != null && other.getAccountIds().equals(this.getAccountIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceArns() == null) ? 0 : getServiceArns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getAccountIds() == null) ? 0 : getAccountIds().hashCode());
        return hashCode;
    }

    @Override
    public GetECSServiceRecommendationsRequest clone() {
        return (GetECSServiceRecommendationsRequest) super.clone();
    }

}
