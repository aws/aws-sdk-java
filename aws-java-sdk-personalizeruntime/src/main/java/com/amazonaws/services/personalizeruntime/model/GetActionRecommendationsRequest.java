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
package com.amazonaws.services.personalizeruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-runtime-2018-05-22/GetActionRecommendations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetActionRecommendationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the campaign to use for getting action recommendations. This campaign must
     * deploy a solution version trained with a PERSONALIZED_ACTIONS recipe.
     * </p>
     */
    private String campaignArn;
    /**
     * <p>
     * The user ID of the user to provide action recommendations for.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The number of results to return. The default is 5. The maximum is 100.
     * </p>
     */
    private Integer numResults;
    /**
     * <p>
     * The ARN of the filter to apply to the returned recommendations. For more information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering Recommendations</a>.
     * </p>
     * <p>
     * When using this parameter, be sure the filter resource is <code>ACTIVE</code>.
     * </p>
     */
    private String filterArn;
    /**
     * <p>
     * The values to use when filtering recommendations. For each placeholder parameter in your filter expression,
     * provide the parameter name (in matching case) as a key and the filter value(s) as the corresponding value.
     * Separate multiple values for one parameter with a comma.
     * </p>
     * <p>
     * For filter expressions that use an <code>INCLUDE</code> element to include actions, you must provide values for
     * all parameters that are defined in the expression. For filters with expressions that use an <code>EXCLUDE</code>
     * element to exclude actions, you can omit the <code>filter-values</code>. In this case, Amazon Personalize doesn't
     * use that portion of the expression to filter recommendations.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering
     * recommendations and user segments</a>.
     * </p>
     */
    private java.util.Map<String, String> filterValues;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the campaign to use for getting action recommendations. This campaign must
     * deploy a solution version trained with a PERSONALIZED_ACTIONS recipe.
     * </p>
     * 
     * @param campaignArn
     *        The Amazon Resource Name (ARN) of the campaign to use for getting action recommendations. This campaign
     *        must deploy a solution version trained with a PERSONALIZED_ACTIONS recipe.
     */

    public void setCampaignArn(String campaignArn) {
        this.campaignArn = campaignArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the campaign to use for getting action recommendations. This campaign must
     * deploy a solution version trained with a PERSONALIZED_ACTIONS recipe.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the campaign to use for getting action recommendations. This campaign
     *         must deploy a solution version trained with a PERSONALIZED_ACTIONS recipe.
     */

    public String getCampaignArn() {
        return this.campaignArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the campaign to use for getting action recommendations. This campaign must
     * deploy a solution version trained with a PERSONALIZED_ACTIONS recipe.
     * </p>
     * 
     * @param campaignArn
     *        The Amazon Resource Name (ARN) of the campaign to use for getting action recommendations. This campaign
     *        must deploy a solution version trained with a PERSONALIZED_ACTIONS recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetActionRecommendationsRequest withCampaignArn(String campaignArn) {
        setCampaignArn(campaignArn);
        return this;
    }

    /**
     * <p>
     * The user ID of the user to provide action recommendations for.
     * </p>
     * 
     * @param userId
     *        The user ID of the user to provide action recommendations for.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The user ID of the user to provide action recommendations for.
     * </p>
     * 
     * @return The user ID of the user to provide action recommendations for.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The user ID of the user to provide action recommendations for.
     * </p>
     * 
     * @param userId
     *        The user ID of the user to provide action recommendations for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetActionRecommendationsRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The number of results to return. The default is 5. The maximum is 100.
     * </p>
     * 
     * @param numResults
     *        The number of results to return. The default is 5. The maximum is 100.
     */

    public void setNumResults(Integer numResults) {
        this.numResults = numResults;
    }

    /**
     * <p>
     * The number of results to return. The default is 5. The maximum is 100.
     * </p>
     * 
     * @return The number of results to return. The default is 5. The maximum is 100.
     */

    public Integer getNumResults() {
        return this.numResults;
    }

    /**
     * <p>
     * The number of results to return. The default is 5. The maximum is 100.
     * </p>
     * 
     * @param numResults
     *        The number of results to return. The default is 5. The maximum is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetActionRecommendationsRequest withNumResults(Integer numResults) {
        setNumResults(numResults);
        return this;
    }

    /**
     * <p>
     * The ARN of the filter to apply to the returned recommendations. For more information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering Recommendations</a>.
     * </p>
     * <p>
     * When using this parameter, be sure the filter resource is <code>ACTIVE</code>.
     * </p>
     * 
     * @param filterArn
     *        The ARN of the filter to apply to the returned recommendations. For more information, see <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering Recommendations</a>.</p>
     *        <p>
     *        When using this parameter, be sure the filter resource is <code>ACTIVE</code>.
     */

    public void setFilterArn(String filterArn) {
        this.filterArn = filterArn;
    }

    /**
     * <p>
     * The ARN of the filter to apply to the returned recommendations. For more information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering Recommendations</a>.
     * </p>
     * <p>
     * When using this parameter, be sure the filter resource is <code>ACTIVE</code>.
     * </p>
     * 
     * @return The ARN of the filter to apply to the returned recommendations. For more information, see <a
     *         href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering Recommendations</a>.</p>
     *         <p>
     *         When using this parameter, be sure the filter resource is <code>ACTIVE</code>.
     */

    public String getFilterArn() {
        return this.filterArn;
    }

    /**
     * <p>
     * The ARN of the filter to apply to the returned recommendations. For more information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering Recommendations</a>.
     * </p>
     * <p>
     * When using this parameter, be sure the filter resource is <code>ACTIVE</code>.
     * </p>
     * 
     * @param filterArn
     *        The ARN of the filter to apply to the returned recommendations. For more information, see <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering Recommendations</a>.</p>
     *        <p>
     *        When using this parameter, be sure the filter resource is <code>ACTIVE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetActionRecommendationsRequest withFilterArn(String filterArn) {
        setFilterArn(filterArn);
        return this;
    }

    /**
     * <p>
     * The values to use when filtering recommendations. For each placeholder parameter in your filter expression,
     * provide the parameter name (in matching case) as a key and the filter value(s) as the corresponding value.
     * Separate multiple values for one parameter with a comma.
     * </p>
     * <p>
     * For filter expressions that use an <code>INCLUDE</code> element to include actions, you must provide values for
     * all parameters that are defined in the expression. For filters with expressions that use an <code>EXCLUDE</code>
     * element to exclude actions, you can omit the <code>filter-values</code>. In this case, Amazon Personalize doesn't
     * use that portion of the expression to filter recommendations.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering
     * recommendations and user segments</a>.
     * </p>
     * 
     * @return The values to use when filtering recommendations. For each placeholder parameter in your filter
     *         expression, provide the parameter name (in matching case) as a key and the filter value(s) as the
     *         corresponding value. Separate multiple values for one parameter with a comma. </p>
     *         <p>
     *         For filter expressions that use an <code>INCLUDE</code> element to include actions, you must provide
     *         values for all parameters that are defined in the expression. For filters with expressions that use an
     *         <code>EXCLUDE</code> element to exclude actions, you can omit the <code>filter-values</code>. In this
     *         case, Amazon Personalize doesn't use that portion of the expression to filter recommendations.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering recommendations and user
     *         segments</a>.
     */

    public java.util.Map<String, String> getFilterValues() {
        return filterValues;
    }

    /**
     * <p>
     * The values to use when filtering recommendations. For each placeholder parameter in your filter expression,
     * provide the parameter name (in matching case) as a key and the filter value(s) as the corresponding value.
     * Separate multiple values for one parameter with a comma.
     * </p>
     * <p>
     * For filter expressions that use an <code>INCLUDE</code> element to include actions, you must provide values for
     * all parameters that are defined in the expression. For filters with expressions that use an <code>EXCLUDE</code>
     * element to exclude actions, you can omit the <code>filter-values</code>. In this case, Amazon Personalize doesn't
     * use that portion of the expression to filter recommendations.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering
     * recommendations and user segments</a>.
     * </p>
     * 
     * @param filterValues
     *        The values to use when filtering recommendations. For each placeholder parameter in your filter
     *        expression, provide the parameter name (in matching case) as a key and the filter value(s) as the
     *        corresponding value. Separate multiple values for one parameter with a comma. </p>
     *        <p>
     *        For filter expressions that use an <code>INCLUDE</code> element to include actions, you must provide
     *        values for all parameters that are defined in the expression. For filters with expressions that use an
     *        <code>EXCLUDE</code> element to exclude actions, you can omit the <code>filter-values</code>. In this
     *        case, Amazon Personalize doesn't use that portion of the expression to filter recommendations.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering recommendations and user
     *        segments</a>.
     */

    public void setFilterValues(java.util.Map<String, String> filterValues) {
        this.filterValues = filterValues;
    }

    /**
     * <p>
     * The values to use when filtering recommendations. For each placeholder parameter in your filter expression,
     * provide the parameter name (in matching case) as a key and the filter value(s) as the corresponding value.
     * Separate multiple values for one parameter with a comma.
     * </p>
     * <p>
     * For filter expressions that use an <code>INCLUDE</code> element to include actions, you must provide values for
     * all parameters that are defined in the expression. For filters with expressions that use an <code>EXCLUDE</code>
     * element to exclude actions, you can omit the <code>filter-values</code>. In this case, Amazon Personalize doesn't
     * use that portion of the expression to filter recommendations.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering
     * recommendations and user segments</a>.
     * </p>
     * 
     * @param filterValues
     *        The values to use when filtering recommendations. For each placeholder parameter in your filter
     *        expression, provide the parameter name (in matching case) as a key and the filter value(s) as the
     *        corresponding value. Separate multiple values for one parameter with a comma. </p>
     *        <p>
     *        For filter expressions that use an <code>INCLUDE</code> element to include actions, you must provide
     *        values for all parameters that are defined in the expression. For filters with expressions that use an
     *        <code>EXCLUDE</code> element to exclude actions, you can omit the <code>filter-values</code>. In this
     *        case, Amazon Personalize doesn't use that portion of the expression to filter recommendations.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering recommendations and user
     *        segments</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetActionRecommendationsRequest withFilterValues(java.util.Map<String, String> filterValues) {
        setFilterValues(filterValues);
        return this;
    }

    /**
     * Add a single FilterValues entry
     *
     * @see GetActionRecommendationsRequest#withFilterValues
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetActionRecommendationsRequest addFilterValuesEntry(String key, String value) {
        if (null == this.filterValues) {
            this.filterValues = new java.util.HashMap<String, String>();
        }
        if (this.filterValues.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.filterValues.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into FilterValues.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetActionRecommendationsRequest clearFilterValuesEntries() {
        this.filterValues = null;
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
        if (getCampaignArn() != null)
            sb.append("CampaignArn: ").append(getCampaignArn()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getNumResults() != null)
            sb.append("NumResults: ").append(getNumResults()).append(",");
        if (getFilterArn() != null)
            sb.append("FilterArn: ").append(getFilterArn()).append(",");
        if (getFilterValues() != null)
            sb.append("FilterValues: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetActionRecommendationsRequest == false)
            return false;
        GetActionRecommendationsRequest other = (GetActionRecommendationsRequest) obj;
        if (other.getCampaignArn() == null ^ this.getCampaignArn() == null)
            return false;
        if (other.getCampaignArn() != null && other.getCampaignArn().equals(this.getCampaignArn()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getNumResults() == null ^ this.getNumResults() == null)
            return false;
        if (other.getNumResults() != null && other.getNumResults().equals(this.getNumResults()) == false)
            return false;
        if (other.getFilterArn() == null ^ this.getFilterArn() == null)
            return false;
        if (other.getFilterArn() != null && other.getFilterArn().equals(this.getFilterArn()) == false)
            return false;
        if (other.getFilterValues() == null ^ this.getFilterValues() == null)
            return false;
        if (other.getFilterValues() != null && other.getFilterValues().equals(this.getFilterValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCampaignArn() == null) ? 0 : getCampaignArn().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getNumResults() == null) ? 0 : getNumResults().hashCode());
        hashCode = prime * hashCode + ((getFilterArn() == null) ? 0 : getFilterArn().hashCode());
        hashCode = prime * hashCode + ((getFilterValues() == null) ? 0 : getFilterValues().hashCode());
        return hashCode;
    }

    @Override
    public GetActionRecommendationsRequest clone() {
        return (GetActionRecommendationsRequest) super.clone();
    }

}
