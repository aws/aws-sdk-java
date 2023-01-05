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
package com.amazonaws.services.connectwisdom.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/GetRecommendations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRecommendationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The recommendations.
     * </p>
     */
    private java.util.List<RecommendationData> recommendations;
    /**
     * <p>
     * The triggers corresponding to recommendations.
     * </p>
     */
    private java.util.List<RecommendationTrigger> triggers;

    /**
     * <p>
     * The recommendations.
     * </p>
     * 
     * @return The recommendations.
     */

    public java.util.List<RecommendationData> getRecommendations() {
        return recommendations;
    }

    /**
     * <p>
     * The recommendations.
     * </p>
     * 
     * @param recommendations
     *        The recommendations.
     */

    public void setRecommendations(java.util.Collection<RecommendationData> recommendations) {
        if (recommendations == null) {
            this.recommendations = null;
            return;
        }

        this.recommendations = new java.util.ArrayList<RecommendationData>(recommendations);
    }

    /**
     * <p>
     * The recommendations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendations(java.util.Collection)} or {@link #withRecommendations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param recommendations
     *        The recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationsResult withRecommendations(RecommendationData... recommendations) {
        if (this.recommendations == null) {
            setRecommendations(new java.util.ArrayList<RecommendationData>(recommendations.length));
        }
        for (RecommendationData ele : recommendations) {
            this.recommendations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The recommendations.
     * </p>
     * 
     * @param recommendations
     *        The recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationsResult withRecommendations(java.util.Collection<RecommendationData> recommendations) {
        setRecommendations(recommendations);
        return this;
    }

    /**
     * <p>
     * The triggers corresponding to recommendations.
     * </p>
     * 
     * @return The triggers corresponding to recommendations.
     */

    public java.util.List<RecommendationTrigger> getTriggers() {
        return triggers;
    }

    /**
     * <p>
     * The triggers corresponding to recommendations.
     * </p>
     * 
     * @param triggers
     *        The triggers corresponding to recommendations.
     */

    public void setTriggers(java.util.Collection<RecommendationTrigger> triggers) {
        if (triggers == null) {
            this.triggers = null;
            return;
        }

        this.triggers = new java.util.ArrayList<RecommendationTrigger>(triggers);
    }

    /**
     * <p>
     * The triggers corresponding to recommendations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTriggers(java.util.Collection)} or {@link #withTriggers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param triggers
     *        The triggers corresponding to recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationsResult withTriggers(RecommendationTrigger... triggers) {
        if (this.triggers == null) {
            setTriggers(new java.util.ArrayList<RecommendationTrigger>(triggers.length));
        }
        for (RecommendationTrigger ele : triggers) {
            this.triggers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The triggers corresponding to recommendations.
     * </p>
     * 
     * @param triggers
     *        The triggers corresponding to recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationsResult withTriggers(java.util.Collection<RecommendationTrigger> triggers) {
        setTriggers(triggers);
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
        if (getRecommendations() != null)
            sb.append("Recommendations: ").append(getRecommendations()).append(",");
        if (getTriggers() != null)
            sb.append("Triggers: ").append(getTriggers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRecommendationsResult == false)
            return false;
        GetRecommendationsResult other = (GetRecommendationsResult) obj;
        if (other.getRecommendations() == null ^ this.getRecommendations() == null)
            return false;
        if (other.getRecommendations() != null && other.getRecommendations().equals(this.getRecommendations()) == false)
            return false;
        if (other.getTriggers() == null ^ this.getTriggers() == null)
            return false;
        if (other.getTriggers() != null && other.getTriggers().equals(this.getTriggers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecommendations() == null) ? 0 : getRecommendations().hashCode());
        hashCode = prime * hashCode + ((getTriggers() == null) ? 0 : getTriggers().hashCode());
        return hashCode;
    }

    @Override
    public GetRecommendationsResult clone() {
        try {
            return (GetRecommendationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
