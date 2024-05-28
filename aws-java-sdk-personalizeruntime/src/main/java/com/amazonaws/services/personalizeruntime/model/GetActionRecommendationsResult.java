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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-runtime-2018-05-22/GetActionRecommendations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetActionRecommendationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of action recommendations sorted in descending order by prediction score. There can be a maximum of 100
     * actions in the list. For information about action scores, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/how-action-recommendation-scoring-works.html">How action
     * recommendation scoring works</a>.
     * </p>
     */
    private java.util.List<PredictedAction> actionList;
    /**
     * <p>
     * The ID of the recommendation.
     * </p>
     */
    private String recommendationId;

    /**
     * <p>
     * A list of action recommendations sorted in descending order by prediction score. There can be a maximum of 100
     * actions in the list. For information about action scores, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/how-action-recommendation-scoring-works.html">How action
     * recommendation scoring works</a>.
     * </p>
     * 
     * @return A list of action recommendations sorted in descending order by prediction score. There can be a maximum
     *         of 100 actions in the list. For information about action scores, see <a
     *         href="https://docs.aws.amazon.com/personalize/latest/dg/how-action-recommendation-scoring-works.html">How
     *         action recommendation scoring works</a>.
     */

    public java.util.List<PredictedAction> getActionList() {
        return actionList;
    }

    /**
     * <p>
     * A list of action recommendations sorted in descending order by prediction score. There can be a maximum of 100
     * actions in the list. For information about action scores, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/how-action-recommendation-scoring-works.html">How action
     * recommendation scoring works</a>.
     * </p>
     * 
     * @param actionList
     *        A list of action recommendations sorted in descending order by prediction score. There can be a maximum of
     *        100 actions in the list. For information about action scores, see <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/how-action-recommendation-scoring-works.html">How
     *        action recommendation scoring works</a>.
     */

    public void setActionList(java.util.Collection<PredictedAction> actionList) {
        if (actionList == null) {
            this.actionList = null;
            return;
        }

        this.actionList = new java.util.ArrayList<PredictedAction>(actionList);
    }

    /**
     * <p>
     * A list of action recommendations sorted in descending order by prediction score. There can be a maximum of 100
     * actions in the list. For information about action scores, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/how-action-recommendation-scoring-works.html">How action
     * recommendation scoring works</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActionList(java.util.Collection)} or {@link #withActionList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param actionList
     *        A list of action recommendations sorted in descending order by prediction score. There can be a maximum of
     *        100 actions in the list. For information about action scores, see <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/how-action-recommendation-scoring-works.html">How
     *        action recommendation scoring works</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetActionRecommendationsResult withActionList(PredictedAction... actionList) {
        if (this.actionList == null) {
            setActionList(new java.util.ArrayList<PredictedAction>(actionList.length));
        }
        for (PredictedAction ele : actionList) {
            this.actionList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of action recommendations sorted in descending order by prediction score. There can be a maximum of 100
     * actions in the list. For information about action scores, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/how-action-recommendation-scoring-works.html">How action
     * recommendation scoring works</a>.
     * </p>
     * 
     * @param actionList
     *        A list of action recommendations sorted in descending order by prediction score. There can be a maximum of
     *        100 actions in the list. For information about action scores, see <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/how-action-recommendation-scoring-works.html">How
     *        action recommendation scoring works</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetActionRecommendationsResult withActionList(java.util.Collection<PredictedAction> actionList) {
        setActionList(actionList);
        return this;
    }

    /**
     * <p>
     * The ID of the recommendation.
     * </p>
     * 
     * @param recommendationId
     *        The ID of the recommendation.
     */

    public void setRecommendationId(String recommendationId) {
        this.recommendationId = recommendationId;
    }

    /**
     * <p>
     * The ID of the recommendation.
     * </p>
     * 
     * @return The ID of the recommendation.
     */

    public String getRecommendationId() {
        return this.recommendationId;
    }

    /**
     * <p>
     * The ID of the recommendation.
     * </p>
     * 
     * @param recommendationId
     *        The ID of the recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetActionRecommendationsResult withRecommendationId(String recommendationId) {
        setRecommendationId(recommendationId);
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
        if (getActionList() != null)
            sb.append("ActionList: ").append(getActionList()).append(",");
        if (getRecommendationId() != null)
            sb.append("RecommendationId: ").append(getRecommendationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetActionRecommendationsResult == false)
            return false;
        GetActionRecommendationsResult other = (GetActionRecommendationsResult) obj;
        if (other.getActionList() == null ^ this.getActionList() == null)
            return false;
        if (other.getActionList() != null && other.getActionList().equals(this.getActionList()) == false)
            return false;
        if (other.getRecommendationId() == null ^ this.getRecommendationId() == null)
            return false;
        if (other.getRecommendationId() != null && other.getRecommendationId().equals(this.getRecommendationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionList() == null) ? 0 : getActionList().hashCode());
        hashCode = prime * hashCode + ((getRecommendationId() == null) ? 0 : getRecommendationId().hashCode());
        return hashCode;
    }

    @Override
    public GetActionRecommendationsResult clone() {
        try {
            return (GetActionRecommendationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
