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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetEBSVolumeRecommendations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEBSVolumeRecommendationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volumes for which to return recommendations.
     * </p>
     */
    private java.util.List<String> volumeArns;
    /**
     * <p>
     * The token to advance to the next page of volume recommendations.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of volume recommendations to return with a single request.
     * </p>
     * <p>
     * To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * An array of objects that describe a filter that returns a more specific list of volume recommendations.
     * </p>
     */
    private java.util.List<EBSFilter> filters;
    /**
     * <p>
     * The IDs of the AWS accounts for which to return volume recommendations.
     * </p>
     * <p>
     * If your account is the management account of an organization, use this parameter to specify the member accounts
     * for which you want to return volume recommendations.
     * </p>
     * <p>
     * Only one account ID can be specified per request.
     * </p>
     */
    private java.util.List<String> accountIds;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volumes for which to return recommendations.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the volumes for which to return recommendations.
     */

    public java.util.List<String> getVolumeArns() {
        return volumeArns;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volumes for which to return recommendations.
     * </p>
     * 
     * @param volumeArns
     *        The Amazon Resource Name (ARN) of the volumes for which to return recommendations.
     */

    public void setVolumeArns(java.util.Collection<String> volumeArns) {
        if (volumeArns == null) {
            this.volumeArns = null;
            return;
        }

        this.volumeArns = new java.util.ArrayList<String>(volumeArns);
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volumes for which to return recommendations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumeArns(java.util.Collection)} or {@link #withVolumeArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param volumeArns
     *        The Amazon Resource Name (ARN) of the volumes for which to return recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEBSVolumeRecommendationsRequest withVolumeArns(String... volumeArns) {
        if (this.volumeArns == null) {
            setVolumeArns(new java.util.ArrayList<String>(volumeArns.length));
        }
        for (String ele : volumeArns) {
            this.volumeArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volumes for which to return recommendations.
     * </p>
     * 
     * @param volumeArns
     *        The Amazon Resource Name (ARN) of the volumes for which to return recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEBSVolumeRecommendationsRequest withVolumeArns(java.util.Collection<String> volumeArns) {
        setVolumeArns(volumeArns);
        return this;
    }

    /**
     * <p>
     * The token to advance to the next page of volume recommendations.
     * </p>
     * 
     * @param nextToken
     *        The token to advance to the next page of volume recommendations.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to advance to the next page of volume recommendations.
     * </p>
     * 
     * @return The token to advance to the next page of volume recommendations.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to advance to the next page of volume recommendations.
     * </p>
     * 
     * @param nextToken
     *        The token to advance to the next page of volume recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEBSVolumeRecommendationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of volume recommendations to return with a single request.
     * </p>
     * <p>
     * To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of volume recommendations to return with a single request.</p>
     *        <p>
     *        To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of volume recommendations to return with a single request.
     * </p>
     * <p>
     * To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @return The maximum number of volume recommendations to return with a single request.</p>
     *         <p>
     *         To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of volume recommendations to return with a single request.
     * </p>
     * <p>
     * To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of volume recommendations to return with a single request.</p>
     *        <p>
     *        To retrieve the remaining results, make another request with the returned <code>NextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEBSVolumeRecommendationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * An array of objects that describe a filter that returns a more specific list of volume recommendations.
     * </p>
     * 
     * @return An array of objects that describe a filter that returns a more specific list of volume recommendations.
     */

    public java.util.List<EBSFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * An array of objects that describe a filter that returns a more specific list of volume recommendations.
     * </p>
     * 
     * @param filters
     *        An array of objects that describe a filter that returns a more specific list of volume recommendations.
     */

    public void setFilters(java.util.Collection<EBSFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<EBSFilter>(filters);
    }

    /**
     * <p>
     * An array of objects that describe a filter that returns a more specific list of volume recommendations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        An array of objects that describe a filter that returns a more specific list of volume recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEBSVolumeRecommendationsRequest withFilters(EBSFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<EBSFilter>(filters.length));
        }
        for (EBSFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe a filter that returns a more specific list of volume recommendations.
     * </p>
     * 
     * @param filters
     *        An array of objects that describe a filter that returns a more specific list of volume recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEBSVolumeRecommendationsRequest withFilters(java.util.Collection<EBSFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The IDs of the AWS accounts for which to return volume recommendations.
     * </p>
     * <p>
     * If your account is the management account of an organization, use this parameter to specify the member accounts
     * for which you want to return volume recommendations.
     * </p>
     * <p>
     * Only one account ID can be specified per request.
     * </p>
     * 
     * @return The IDs of the AWS accounts for which to return volume recommendations.</p>
     *         <p>
     *         If your account is the management account of an organization, use this parameter to specify the member
     *         accounts for which you want to return volume recommendations.
     *         </p>
     *         <p>
     *         Only one account ID can be specified per request.
     */

    public java.util.List<String> getAccountIds() {
        return accountIds;
    }

    /**
     * <p>
     * The IDs of the AWS accounts for which to return volume recommendations.
     * </p>
     * <p>
     * If your account is the management account of an organization, use this parameter to specify the member accounts
     * for which you want to return volume recommendations.
     * </p>
     * <p>
     * Only one account ID can be specified per request.
     * </p>
     * 
     * @param accountIds
     *        The IDs of the AWS accounts for which to return volume recommendations.</p>
     *        <p>
     *        If your account is the management account of an organization, use this parameter to specify the member
     *        accounts for which you want to return volume recommendations.
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
     * The IDs of the AWS accounts for which to return volume recommendations.
     * </p>
     * <p>
     * If your account is the management account of an organization, use this parameter to specify the member accounts
     * for which you want to return volume recommendations.
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
     *        The IDs of the AWS accounts for which to return volume recommendations.</p>
     *        <p>
     *        If your account is the management account of an organization, use this parameter to specify the member
     *        accounts for which you want to return volume recommendations.
     *        </p>
     *        <p>
     *        Only one account ID can be specified per request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEBSVolumeRecommendationsRequest withAccountIds(String... accountIds) {
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
     * The IDs of the AWS accounts for which to return volume recommendations.
     * </p>
     * <p>
     * If your account is the management account of an organization, use this parameter to specify the member accounts
     * for which you want to return volume recommendations.
     * </p>
     * <p>
     * Only one account ID can be specified per request.
     * </p>
     * 
     * @param accountIds
     *        The IDs of the AWS accounts for which to return volume recommendations.</p>
     *        <p>
     *        If your account is the management account of an organization, use this parameter to specify the member
     *        accounts for which you want to return volume recommendations.
     *        </p>
     *        <p>
     *        Only one account ID can be specified per request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEBSVolumeRecommendationsRequest withAccountIds(java.util.Collection<String> accountIds) {
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
        if (getVolumeArns() != null)
            sb.append("VolumeArns: ").append(getVolumeArns()).append(",");
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

        if (obj instanceof GetEBSVolumeRecommendationsRequest == false)
            return false;
        GetEBSVolumeRecommendationsRequest other = (GetEBSVolumeRecommendationsRequest) obj;
        if (other.getVolumeArns() == null ^ this.getVolumeArns() == null)
            return false;
        if (other.getVolumeArns() != null && other.getVolumeArns().equals(this.getVolumeArns()) == false)
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

        hashCode = prime * hashCode + ((getVolumeArns() == null) ? 0 : getVolumeArns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getAccountIds() == null) ? 0 : getAccountIds().hashCode());
        return hashCode;
    }

    @Override
    public GetEBSVolumeRecommendationsRequest clone() {
        return (GetEBSVolumeRecommendationsRequest) super.clone();
    }

}
