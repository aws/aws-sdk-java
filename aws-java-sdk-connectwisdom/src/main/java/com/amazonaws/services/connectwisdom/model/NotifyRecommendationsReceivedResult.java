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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/NotifyRecommendationsReceived"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotifyRecommendationsReceivedResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The identifiers of recommendations that are causing errors.
     * </p>
     */
    private java.util.List<NotifyRecommendationsReceivedError> errors;
    /**
     * <p>
     * The identifiers of the recommendations.
     * </p>
     */
    private java.util.List<String> recommendationIds;

    /**
     * <p>
     * The identifiers of recommendations that are causing errors.
     * </p>
     * 
     * @return The identifiers of recommendations that are causing errors.
     */

    public java.util.List<NotifyRecommendationsReceivedError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * The identifiers of recommendations that are causing errors.
     * </p>
     * 
     * @param errors
     *        The identifiers of recommendations that are causing errors.
     */

    public void setErrors(java.util.Collection<NotifyRecommendationsReceivedError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<NotifyRecommendationsReceivedError>(errors);
    }

    /**
     * <p>
     * The identifiers of recommendations that are causing errors.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        The identifiers of recommendations that are causing errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyRecommendationsReceivedResult withErrors(NotifyRecommendationsReceivedError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<NotifyRecommendationsReceivedError>(errors.length));
        }
        for (NotifyRecommendationsReceivedError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers of recommendations that are causing errors.
     * </p>
     * 
     * @param errors
     *        The identifiers of recommendations that are causing errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyRecommendationsReceivedResult withErrors(java.util.Collection<NotifyRecommendationsReceivedError> errors) {
        setErrors(errors);
        return this;
    }

    /**
     * <p>
     * The identifiers of the recommendations.
     * </p>
     * 
     * @return The identifiers of the recommendations.
     */

    public java.util.List<String> getRecommendationIds() {
        return recommendationIds;
    }

    /**
     * <p>
     * The identifiers of the recommendations.
     * </p>
     * 
     * @param recommendationIds
     *        The identifiers of the recommendations.
     */

    public void setRecommendationIds(java.util.Collection<String> recommendationIds) {
        if (recommendationIds == null) {
            this.recommendationIds = null;
            return;
        }

        this.recommendationIds = new java.util.ArrayList<String>(recommendationIds);
    }

    /**
     * <p>
     * The identifiers of the recommendations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendationIds(java.util.Collection)} or {@link #withRecommendationIds(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param recommendationIds
     *        The identifiers of the recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyRecommendationsReceivedResult withRecommendationIds(String... recommendationIds) {
        if (this.recommendationIds == null) {
            setRecommendationIds(new java.util.ArrayList<String>(recommendationIds.length));
        }
        for (String ele : recommendationIds) {
            this.recommendationIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers of the recommendations.
     * </p>
     * 
     * @param recommendationIds
     *        The identifiers of the recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyRecommendationsReceivedResult withRecommendationIds(java.util.Collection<String> recommendationIds) {
        setRecommendationIds(recommendationIds);
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
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors()).append(",");
        if (getRecommendationIds() != null)
            sb.append("RecommendationIds: ").append(getRecommendationIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotifyRecommendationsReceivedResult == false)
            return false;
        NotifyRecommendationsReceivedResult other = (NotifyRecommendationsReceivedResult) obj;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        if (other.getRecommendationIds() == null ^ this.getRecommendationIds() == null)
            return false;
        if (other.getRecommendationIds() != null && other.getRecommendationIds().equals(this.getRecommendationIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        hashCode = prime * hashCode + ((getRecommendationIds() == null) ? 0 : getRecommendationIds().hashCode());
        return hashCode;
    }

    @Override
    public NotifyRecommendationsReceivedResult clone() {
        try {
            return (NotifyRecommendationsReceivedResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
