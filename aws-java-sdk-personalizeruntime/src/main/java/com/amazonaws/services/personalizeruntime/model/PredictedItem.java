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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that identifies an item.
 * </p>
 * <p>
 * The and APIs return a list of <code>PredictedItem</code>s.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-runtime-2018-05-22/PredictedItem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PredictedItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The recommended item ID.
     * </p>
     */
    private String itemId;
    /**
     * <p>
     * A numeric representation of the model's certainty that the item will be the next user selection. For more
     * information on scoring logic, see <a>how-scores-work</a>.
     * </p>
     */
    private Double score;
    /**
     * <p>
     * The name of the promotion that included the predicted item.
     * </p>
     */
    private String promotionName;
    /**
     * <p>
     * Metadata about the item from your Items dataset.
     * </p>
     */
    private java.util.Map<String, String> metadata;
    /**
     * <p>
     * If you use User-Personalization-v2, a list of reasons for why the item was included in recommendations. Possible
     * reasons include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Promoted item - Indicates the item was included as part of a promotion that you applied in your recommendation
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Exploration - Indicates the item was included with exploration. With exploration, recommendations include items
     * with less interactions data or relevance for the user. For more information about exploration, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/use-case-recipe-features.html#about-exploration"
     * >Exploration</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Popular item - Indicates the item was included as a placeholder popular item. If you use a filter, depending on
     * how many recommendations the filter removes, Amazon Personalize might add placeholder items to meet the
     * <code>numResults</code> for your recommendation request. These items are popular items, based on interactions
     * data, that satisfy your filter criteria. They don't have a relevance score for the user.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> reason;

    /**
     * <p>
     * The recommended item ID.
     * </p>
     * 
     * @param itemId
     *        The recommended item ID.
     */

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * <p>
     * The recommended item ID.
     * </p>
     * 
     * @return The recommended item ID.
     */

    public String getItemId() {
        return this.itemId;
    }

    /**
     * <p>
     * The recommended item ID.
     * </p>
     * 
     * @param itemId
     *        The recommended item ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictedItem withItemId(String itemId) {
        setItemId(itemId);
        return this;
    }

    /**
     * <p>
     * A numeric representation of the model's certainty that the item will be the next user selection. For more
     * information on scoring logic, see <a>how-scores-work</a>.
     * </p>
     * 
     * @param score
     *        A numeric representation of the model's certainty that the item will be the next user selection. For more
     *        information on scoring logic, see <a>how-scores-work</a>.
     */

    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * <p>
     * A numeric representation of the model's certainty that the item will be the next user selection. For more
     * information on scoring logic, see <a>how-scores-work</a>.
     * </p>
     * 
     * @return A numeric representation of the model's certainty that the item will be the next user selection. For more
     *         information on scoring logic, see <a>how-scores-work</a>.
     */

    public Double getScore() {
        return this.score;
    }

    /**
     * <p>
     * A numeric representation of the model's certainty that the item will be the next user selection. For more
     * information on scoring logic, see <a>how-scores-work</a>.
     * </p>
     * 
     * @param score
     *        A numeric representation of the model's certainty that the item will be the next user selection. For more
     *        information on scoring logic, see <a>how-scores-work</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictedItem withScore(Double score) {
        setScore(score);
        return this;
    }

    /**
     * <p>
     * The name of the promotion that included the predicted item.
     * </p>
     * 
     * @param promotionName
     *        The name of the promotion that included the predicted item.
     */

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    /**
     * <p>
     * The name of the promotion that included the predicted item.
     * </p>
     * 
     * @return The name of the promotion that included the predicted item.
     */

    public String getPromotionName() {
        return this.promotionName;
    }

    /**
     * <p>
     * The name of the promotion that included the predicted item.
     * </p>
     * 
     * @param promotionName
     *        The name of the promotion that included the predicted item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictedItem withPromotionName(String promotionName) {
        setPromotionName(promotionName);
        return this;
    }

    /**
     * <p>
     * Metadata about the item from your Items dataset.
     * </p>
     * 
     * @return Metadata about the item from your Items dataset.
     */

    public java.util.Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * Metadata about the item from your Items dataset.
     * </p>
     * 
     * @param metadata
     *        Metadata about the item from your Items dataset.
     */

    public void setMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * Metadata about the item from your Items dataset.
     * </p>
     * 
     * @param metadata
     *        Metadata about the item from your Items dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictedItem withMetadata(java.util.Map<String, String> metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * Add a single Metadata entry
     *
     * @see PredictedItem#withMetadata
     * @returns a reference to this object so that method calls can be chained together.
     */

    public PredictedItem addMetadataEntry(String key, String value) {
        if (null == this.metadata) {
            this.metadata = new java.util.HashMap<String, String>();
        }
        if (this.metadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.metadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Metadata.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictedItem clearMetadataEntries() {
        this.metadata = null;
        return this;
    }

    /**
     * <p>
     * If you use User-Personalization-v2, a list of reasons for why the item was included in recommendations. Possible
     * reasons include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Promoted item - Indicates the item was included as part of a promotion that you applied in your recommendation
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Exploration - Indicates the item was included with exploration. With exploration, recommendations include items
     * with less interactions data or relevance for the user. For more information about exploration, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/use-case-recipe-features.html#about-exploration"
     * >Exploration</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Popular item - Indicates the item was included as a placeholder popular item. If you use a filter, depending on
     * how many recommendations the filter removes, Amazon Personalize might add placeholder items to meet the
     * <code>numResults</code> for your recommendation request. These items are popular items, based on interactions
     * data, that satisfy your filter criteria. They don't have a relevance score for the user.
     * </p>
     * </li>
     * </ul>
     * 
     * @return If you use User-Personalization-v2, a list of reasons for why the item was included in recommendations.
     *         Possible reasons include the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Promoted item - Indicates the item was included as part of a promotion that you applied in your
     *         recommendation request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Exploration - Indicates the item was included with exploration. With exploration, recommendations include
     *         items with less interactions data or relevance for the user. For more information about exploration, see
     *         <a href=
     *         "https://docs.aws.amazon.com/personalize/latest/dg/use-case-recipe-features.html#about-exploration"
     *         >Exploration</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Popular item - Indicates the item was included as a placeholder popular item. If you use a filter,
     *         depending on how many recommendations the filter removes, Amazon Personalize might add placeholder items
     *         to meet the <code>numResults</code> for your recommendation request. These items are popular items, based
     *         on interactions data, that satisfy your filter criteria. They don't have a relevance score for the user.
     *         </p>
     *         </li>
     */

    public java.util.List<String> getReason() {
        return reason;
    }

    /**
     * <p>
     * If you use User-Personalization-v2, a list of reasons for why the item was included in recommendations. Possible
     * reasons include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Promoted item - Indicates the item was included as part of a promotion that you applied in your recommendation
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Exploration - Indicates the item was included with exploration. With exploration, recommendations include items
     * with less interactions data or relevance for the user. For more information about exploration, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/use-case-recipe-features.html#about-exploration"
     * >Exploration</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Popular item - Indicates the item was included as a placeholder popular item. If you use a filter, depending on
     * how many recommendations the filter removes, Amazon Personalize might add placeholder items to meet the
     * <code>numResults</code> for your recommendation request. These items are popular items, based on interactions
     * data, that satisfy your filter criteria. They don't have a relevance score for the user.
     * </p>
     * </li>
     * </ul>
     * 
     * @param reason
     *        If you use User-Personalization-v2, a list of reasons for why the item was included in recommendations.
     *        Possible reasons include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Promoted item - Indicates the item was included as part of a promotion that you applied in your
     *        recommendation request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Exploration - Indicates the item was included with exploration. With exploration, recommendations include
     *        items with less interactions data or relevance for the user. For more information about exploration, see
     *        <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/use-case-recipe-features.html#about-exploration"
     *        >Exploration</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Popular item - Indicates the item was included as a placeholder popular item. If you use a filter,
     *        depending on how many recommendations the filter removes, Amazon Personalize might add placeholder items
     *        to meet the <code>numResults</code> for your recommendation request. These items are popular items, based
     *        on interactions data, that satisfy your filter criteria. They don't have a relevance score for the user.
     *        </p>
     *        </li>
     */

    public void setReason(java.util.Collection<String> reason) {
        if (reason == null) {
            this.reason = null;
            return;
        }

        this.reason = new java.util.ArrayList<String>(reason);
    }

    /**
     * <p>
     * If you use User-Personalization-v2, a list of reasons for why the item was included in recommendations. Possible
     * reasons include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Promoted item - Indicates the item was included as part of a promotion that you applied in your recommendation
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Exploration - Indicates the item was included with exploration. With exploration, recommendations include items
     * with less interactions data or relevance for the user. For more information about exploration, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/use-case-recipe-features.html#about-exploration"
     * >Exploration</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Popular item - Indicates the item was included as a placeholder popular item. If you use a filter, depending on
     * how many recommendations the filter removes, Amazon Personalize might add placeholder items to meet the
     * <code>numResults</code> for your recommendation request. These items are popular items, based on interactions
     * data, that satisfy your filter criteria. They don't have a relevance score for the user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReason(java.util.Collection)} or {@link #withReason(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param reason
     *        If you use User-Personalization-v2, a list of reasons for why the item was included in recommendations.
     *        Possible reasons include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Promoted item - Indicates the item was included as part of a promotion that you applied in your
     *        recommendation request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Exploration - Indicates the item was included with exploration. With exploration, recommendations include
     *        items with less interactions data or relevance for the user. For more information about exploration, see
     *        <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/use-case-recipe-features.html#about-exploration"
     *        >Exploration</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Popular item - Indicates the item was included as a placeholder popular item. If you use a filter,
     *        depending on how many recommendations the filter removes, Amazon Personalize might add placeholder items
     *        to meet the <code>numResults</code> for your recommendation request. These items are popular items, based
     *        on interactions data, that satisfy your filter criteria. They don't have a relevance score for the user.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictedItem withReason(String... reason) {
        if (this.reason == null) {
            setReason(new java.util.ArrayList<String>(reason.length));
        }
        for (String ele : reason) {
            this.reason.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If you use User-Personalization-v2, a list of reasons for why the item was included in recommendations. Possible
     * reasons include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Promoted item - Indicates the item was included as part of a promotion that you applied in your recommendation
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Exploration - Indicates the item was included with exploration. With exploration, recommendations include items
     * with less interactions data or relevance for the user. For more information about exploration, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/use-case-recipe-features.html#about-exploration"
     * >Exploration</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Popular item - Indicates the item was included as a placeholder popular item. If you use a filter, depending on
     * how many recommendations the filter removes, Amazon Personalize might add placeholder items to meet the
     * <code>numResults</code> for your recommendation request. These items are popular items, based on interactions
     * data, that satisfy your filter criteria. They don't have a relevance score for the user.
     * </p>
     * </li>
     * </ul>
     * 
     * @param reason
     *        If you use User-Personalization-v2, a list of reasons for why the item was included in recommendations.
     *        Possible reasons include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Promoted item - Indicates the item was included as part of a promotion that you applied in your
     *        recommendation request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Exploration - Indicates the item was included with exploration. With exploration, recommendations include
     *        items with less interactions data or relevance for the user. For more information about exploration, see
     *        <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/use-case-recipe-features.html#about-exploration"
     *        >Exploration</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Popular item - Indicates the item was included as a placeholder popular item. If you use a filter,
     *        depending on how many recommendations the filter removes, Amazon Personalize might add placeholder items
     *        to meet the <code>numResults</code> for your recommendation request. These items are popular items, based
     *        on interactions data, that satisfy your filter criteria. They don't have a relevance score for the user.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictedItem withReason(java.util.Collection<String> reason) {
        setReason(reason);
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
        if (getItemId() != null)
            sb.append("ItemId: ").append(getItemId()).append(",");
        if (getScore() != null)
            sb.append("Score: ").append(getScore()).append(",");
        if (getPromotionName() != null)
            sb.append("PromotionName: ").append(getPromotionName()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append("***Sensitive Data Redacted***").append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PredictedItem == false)
            return false;
        PredictedItem other = (PredictedItem) obj;
        if (other.getItemId() == null ^ this.getItemId() == null)
            return false;
        if (other.getItemId() != null && other.getItemId().equals(this.getItemId()) == false)
            return false;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        if (other.getPromotionName() == null ^ this.getPromotionName() == null)
            return false;
        if (other.getPromotionName() != null && other.getPromotionName().equals(this.getPromotionName()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItemId() == null) ? 0 : getItemId().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        hashCode = prime * hashCode + ((getPromotionName() == null) ? 0 : getPromotionName().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public PredictedItem clone() {
        try {
            return (PredictedItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalizeruntime.model.transform.PredictedItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
