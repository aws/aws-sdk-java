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
     * A list of items (itemId's) to rank. If an item was not included in the training dataset, the item is appended to
     * the end of the reranked list. The maximum is 500.
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
     * device type. For more information, see Contextual Metadata.
     * </p>
     */
    private java.util.Map<String, String> context;

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
     * A list of items (itemId's) to rank. If an item was not included in the training dataset, the item is appended to
     * the end of the reranked list. The maximum is 500.
     * </p>
     * 
     * @return A list of items (itemId's) to rank. If an item was not included in the training dataset, the item is
     *         appended to the end of the reranked list. The maximum is 500.
     */

    public java.util.List<String> getInputList() {
        return inputList;
    }

    /**
     * <p>
     * A list of items (itemId's) to rank. If an item was not included in the training dataset, the item is appended to
     * the end of the reranked list. The maximum is 500.
     * </p>
     * 
     * @param inputList
     *        A list of items (itemId's) to rank. If an item was not included in the training dataset, the item is
     *        appended to the end of the reranked list. The maximum is 500.
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
     * A list of items (itemId's) to rank. If an item was not included in the training dataset, the item is appended to
     * the end of the reranked list. The maximum is 500.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputList(java.util.Collection)} or {@link #withInputList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param inputList
     *        A list of items (itemId's) to rank. If an item was not included in the training dataset, the item is
     *        appended to the end of the reranked list. The maximum is 500.
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
     * A list of items (itemId's) to rank. If an item was not included in the training dataset, the item is appended to
     * the end of the reranked list. The maximum is 500.
     * </p>
     * 
     * @param inputList
     *        A list of items (itemId's) to rank. If an item was not included in the training dataset, the item is
     *        appended to the end of the reranked list. The maximum is 500.
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
     * device type. For more information, see Contextual Metadata.
     * </p>
     * 
     * @return The contextual metadata to use when getting recommendations. Contextual metadata includes any interaction
     *         information that might be relevant when getting a user's recommendations, such as the user's current
     *         location or device type. For more information, see Contextual Metadata.
     */

    public java.util.Map<String, String> getContext() {
        return context;
    }

    /**
     * <p>
     * The contextual metadata to use when getting recommendations. Contextual metadata includes any interaction
     * information that might be relevant when getting a user's recommendations, such as the user's current location or
     * device type. For more information, see Contextual Metadata.
     * </p>
     * 
     * @param context
     *        The contextual metadata to use when getting recommendations. Contextual metadata includes any interaction
     *        information that might be relevant when getting a user's recommendations, such as the user's current
     *        location or device type. For more information, see Contextual Metadata.
     */

    public void setContext(java.util.Map<String, String> context) {
        this.context = context;
    }

    /**
     * <p>
     * The contextual metadata to use when getting recommendations. Contextual metadata includes any interaction
     * information that might be relevant when getting a user's recommendations, such as the user's current location or
     * device type. For more information, see Contextual Metadata.
     * </p>
     * 
     * @param context
     *        The contextual metadata to use when getting recommendations. Contextual metadata includes any interaction
     *        information that might be relevant when getting a user's recommendations, such as the user's current
     *        location or device type. For more information, see Contextual Metadata.
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
            sb.append("Context: ").append("***Sensitive Data Redacted***");
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
        return hashCode;
    }

    @Override
    public GetPersonalizedRankingRequest clone() {
        return (GetPersonalizedRankingRequest) super.clone();
    }

}
