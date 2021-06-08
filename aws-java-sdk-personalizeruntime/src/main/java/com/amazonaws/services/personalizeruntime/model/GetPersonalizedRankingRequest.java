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
package com.amazonaws.services.personalizeruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-runtime-2018-05-22/GetPersonalizedRanking"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPersonalizedRankingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the campaign to use for generating the personalized ranking.
     * </p>
     */
    private String campaignArn;
    /**
     * <p>
     * A list of items (by <code>itemId</code>) to rank. If an item was not included in the training dataset, the item
     * is appended to the end of the reranked list. The maximum is 500.
     * </p>
     */
    private java.util.List<String> inputList;
    /**
     * <p>
     * The user for which you want the campaign to provide a personalized ranking.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The contextual metadata to use when getting recommendations. Contextual metadata includes any interaction
     * information that might be relevant when getting a user's recommendations, such as the user's current location or
     * device type.
     * </p>
     */
    private java.util.Map<String, String> context;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a filter you created to include items or exclude items from recommendations for
     * a given user. For more information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering Recommendations</a>.
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
     * For filter expressions that use an <code>INCLUDE</code> element to include items, you must provide values for all
     * parameters that are defined in the expression. For filters with expressions that use an <code>EXCLUDE</code>
     * element to exclude items, you can omit the <code>filter-values</code>.In this case, Amazon Personalize doesn't
     * use that portion of the expression to filter recommendations.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering
     * Recommendations</a>.
     * </p>
     */
    private java.util.Map<String, String> filterValues;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the campaign to use for generating the personalized ranking.
     * </p>
     * 
     * @param campaignArn
     *        The Amazon Resource Name (ARN) of the campaign to use for generating the personalized ranking.
     */

    public void setCampaignArn(String campaignArn) {
        this.campaignArn = campaignArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the campaign to use for generating the personalized ranking.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the campaign to use for generating the personalized ranking.
     */

    public String getCampaignArn() {
        return this.campaignArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the campaign to use for generating the personalized ranking.
     * </p>
     * 
     * @param campaignArn
     *        The Amazon Resource Name (ARN) of the campaign to use for generating the personalized ranking.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPersonalizedRankingRequest withCampaignArn(String campaignArn) {
        setCampaignArn(campaignArn);
        return this;
    }

    /**
     * <p>
     * A list of items (by <code>itemId</code>) to rank. If an item was not included in the training dataset, the item
     * is appended to the end of the reranked list. The maximum is 500.
     * </p>
     * 
     * @return A list of items (by <code>itemId</code>) to rank. If an item was not included in the training dataset,
     *         the item is appended to the end of the reranked list. The maximum is 500.
     */

    public java.util.List<String> getInputList() {
        return inputList;
    }

    /**
     * <p>
     * A list of items (by <code>itemId</code>) to rank. If an item was not included in the training dataset, the item
     * is appended to the end of the reranked list. The maximum is 500.
     * </p>
     * 
     * @param inputList
     *        A list of items (by <code>itemId</code>) to rank. If an item was not included in the training dataset, the
     *        item is appended to the end of the reranked list. The maximum is 500.
     */

    public void setInputList(java.util.Collection<String> inputList) {
        if (inputList == null) {
            this.inputList = null;
            return;
        }

        this.inputList = new java.util.ArrayList<String>(inputList);
    }

    /**
     * <p>
     * A list of items (by <code>itemId</code>) to rank. If an item was not included in the training dataset, the item
     * is appended to the end of the reranked list. The maximum is 500.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputList(java.util.Collection)} or {@link #withInputList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param inputList
     *        A list of items (by <code>itemId</code>) to rank. If an item was not included in the training dataset, the
     *        item is appended to the end of the reranked list. The maximum is 500.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPersonalizedRankingRequest withInputList(String... inputList) {
        if (this.inputList == null) {
            setInputList(new java.util.ArrayList<String>(inputList.length));
        }
        for (String ele : inputList) {
            this.inputList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of items (by <code>itemId</code>) to rank. If an item was not included in the training dataset, the item
     * is appended to the end of the reranked list. The maximum is 500.
     * </p>
     * 
     * @param inputList
     *        A list of items (by <code>itemId</code>) to rank. If an item was not included in the training dataset, the
     *        item is appended to the end of the reranked list. The maximum is 500.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPersonalizedRankingRequest withInputList(java.util.Collection<String> inputList) {
        setInputList(inputList);
        return this;
    }

    /**
     * <p>
     * The user for which you want the campaign to provide a personalized ranking.
     * </p>
     * 
     * @param userId
     *        The user for which you want the campaign to provide a personalized ranking.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The user for which you want the campaign to provide a personalized ranking.
     * </p>
     * 
     * @return The user for which you want the campaign to provide a personalized ranking.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The user for which you want the campaign to provide a personalized ranking.
     * </p>
     * 
     * @param userId
     *        The user for which you want the campaign to provide a personalized ranking.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPersonalizedRankingRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The contextual metadata to use when getting recommendations. Contextual metadata includes any interaction
     * information that might be relevant when getting a user's recommendations, such as the user's current location or
     * device type.
     * </p>
     * 
     * @return The contextual metadata to use when getting recommendations. Contextual metadata includes any interaction
     *         information that might be relevant when getting a user's recommendations, such as the user's current
     *         location or device type.
     */

    public java.util.Map<String, String> getContext() {
        return context;
    }

    /**
     * <p>
     * The contextual metadata to use when getting recommendations. Contextual metadata includes any interaction
     * information that might be relevant when getting a user's recommendations, such as the user's current location or
     * device type.
     * </p>
     * 
     * @param context
     *        The contextual metadata to use when getting recommendations. Contextual metadata includes any interaction
     *        information that might be relevant when getting a user's recommendations, such as the user's current
     *        location or device type.
     */

    public void setContext(java.util.Map<String, String> context) {
        this.context = context;
    }

    /**
     * <p>
     * The contextual metadata to use when getting recommendations. Contextual metadata includes any interaction
     * information that might be relevant when getting a user's recommendations, such as the user's current location or
     * device type.
     * </p>
     * 
     * @param context
     *        The contextual metadata to use when getting recommendations. Contextual metadata includes any interaction
     *        information that might be relevant when getting a user's recommendations, such as the user's current
     *        location or device type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPersonalizedRankingRequest withContext(java.util.Map<String, String> context) {
        setContext(context);
        return this;
    }

    /**
     * Add a single Context entry
     *
     * @see GetPersonalizedRankingRequest#withContext
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetPersonalizedRankingRequest addContextEntry(String key, String value) {
        if (null == this.context) {
            this.context = new java.util.HashMap<String, String>();
        }
        if (this.context.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.context.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Context.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPersonalizedRankingRequest clearContextEntries() {
        this.context = null;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a filter you created to include items or exclude items from recommendations for
     * a given user. For more information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering Recommendations</a>.
     * </p>
     * 
     * @param filterArn
     *        The Amazon Resource Name (ARN) of a filter you created to include items or exclude items from
     *        recommendations for a given user. For more information, see <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering Recommendations</a>.
     */

    public void setFilterArn(String filterArn) {
        this.filterArn = filterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a filter you created to include items or exclude items from recommendations for
     * a given user. For more information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering Recommendations</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a filter you created to include items or exclude items from
     *         recommendations for a given user. For more information, see <a
     *         href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering Recommendations</a>.
     */

    public String getFilterArn() {
        return this.filterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a filter you created to include items or exclude items from recommendations for
     * a given user. For more information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering Recommendations</a>.
     * </p>
     * 
     * @param filterArn
     *        The Amazon Resource Name (ARN) of a filter you created to include items or exclude items from
     *        recommendations for a given user. For more information, see <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering Recommendations</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPersonalizedRankingRequest withFilterArn(String filterArn) {
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
     * For filter expressions that use an <code>INCLUDE</code> element to include items, you must provide values for all
     * parameters that are defined in the expression. For filters with expressions that use an <code>EXCLUDE</code>
     * element to exclude items, you can omit the <code>filter-values</code>.In this case, Amazon Personalize doesn't
     * use that portion of the expression to filter recommendations.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering
     * Recommendations</a>.
     * </p>
     * 
     * @return The values to use when filtering recommendations. For each placeholder parameter in your filter
     *         expression, provide the parameter name (in matching case) as a key and the filter value(s) as the
     *         corresponding value. Separate multiple values for one parameter with a comma. </p>
     *         <p>
     *         For filter expressions that use an <code>INCLUDE</code> element to include items, you must provide values
     *         for all parameters that are defined in the expression. For filters with expressions that use an
     *         <code>EXCLUDE</code> element to exclude items, you can omit the <code>filter-values</code>.In this case,
     *         Amazon Personalize doesn't use that portion of the expression to filter recommendations.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering Recommendations</a>.
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
     * For filter expressions that use an <code>INCLUDE</code> element to include items, you must provide values for all
     * parameters that are defined in the expression. For filters with expressions that use an <code>EXCLUDE</code>
     * element to exclude items, you can omit the <code>filter-values</code>.In this case, Amazon Personalize doesn't
     * use that portion of the expression to filter recommendations.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering
     * Recommendations</a>.
     * </p>
     * 
     * @param filterValues
     *        The values to use when filtering recommendations. For each placeholder parameter in your filter
     *        expression, provide the parameter name (in matching case) as a key and the filter value(s) as the
     *        corresponding value. Separate multiple values for one parameter with a comma. </p>
     *        <p>
     *        For filter expressions that use an <code>INCLUDE</code> element to include items, you must provide values
     *        for all parameters that are defined in the expression. For filters with expressions that use an
     *        <code>EXCLUDE</code> element to exclude items, you can omit the <code>filter-values</code>.In this case,
     *        Amazon Personalize doesn't use that portion of the expression to filter recommendations.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering Recommendations</a>.
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
     * For filter expressions that use an <code>INCLUDE</code> element to include items, you must provide values for all
     * parameters that are defined in the expression. For filters with expressions that use an <code>EXCLUDE</code>
     * element to exclude items, you can omit the <code>filter-values</code>.In this case, Amazon Personalize doesn't
     * use that portion of the expression to filter recommendations.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering
     * Recommendations</a>.
     * </p>
     * 
     * @param filterValues
     *        The values to use when filtering recommendations. For each placeholder parameter in your filter
     *        expression, provide the parameter name (in matching case) as a key and the filter value(s) as the
     *        corresponding value. Separate multiple values for one parameter with a comma. </p>
     *        <p>
     *        For filter expressions that use an <code>INCLUDE</code> element to include items, you must provide values
     *        for all parameters that are defined in the expression. For filters with expressions that use an
     *        <code>EXCLUDE</code> element to exclude items, you can omit the <code>filter-values</code>.In this case,
     *        Amazon Personalize doesn't use that portion of the expression to filter recommendations.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/filter.html">Filtering Recommendations</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPersonalizedRankingRequest withFilterValues(java.util.Map<String, String> filterValues) {
        setFilterValues(filterValues);
        return this;
    }

    /**
     * Add a single FilterValues entry
     *
     * @see GetPersonalizedRankingRequest#withFilterValues
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetPersonalizedRankingRequest addFilterValuesEntry(String key, String value) {
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

    public GetPersonalizedRankingRequest clearFilterValuesEntries() {
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
        if (getInputList() != null)
            sb.append("InputList: ").append(getInputList()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getContext() != null)
            sb.append("Context: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof GetPersonalizedRankingRequest == false)
            return false;
        GetPersonalizedRankingRequest other = (GetPersonalizedRankingRequest) obj;
        if (other.getCampaignArn() == null ^ this.getCampaignArn() == null)
            return false;
        if (other.getCampaignArn() != null && other.getCampaignArn().equals(this.getCampaignArn()) == false)
            return false;
        if (other.getInputList() == null ^ this.getInputList() == null)
            return false;
        if (other.getInputList() != null && other.getInputList().equals(this.getInputList()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getContext() == null ^ this.getContext() == null)
            return false;
        if (other.getContext() != null && other.getContext().equals(this.getContext()) == false)
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
        hashCode = prime * hashCode + ((getInputList() == null) ? 0 : getInputList().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getContext() == null) ? 0 : getContext().hashCode());
        hashCode = prime * hashCode + ((getFilterArn() == null) ? 0 : getFilterArn().hashCode());
        hashCode = prime * hashCode + ((getFilterValues() == null) ? 0 : getFilterValues().hashCode());
        return hashCode;
    }

    @Override
    public GetPersonalizedRankingRequest clone() {
        return (GetPersonalizedRankingRequest) super.clone();
    }

}
