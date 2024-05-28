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
package com.amazonaws.services.trustedadvisor.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/GetRecommendation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRecommendationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Recommendation identifier
     * </p>
     */
    private String recommendationIdentifier;

    /**
     * <p>
     * The Recommendation identifier
     * </p>
     * 
     * @param recommendationIdentifier
     *        The Recommendation identifier
     */

    public void setRecommendationIdentifier(String recommendationIdentifier) {
        this.recommendationIdentifier = recommendationIdentifier;
    }

    /**
     * <p>
     * The Recommendation identifier
     * </p>
     * 
     * @return The Recommendation identifier
     */

    public String getRecommendationIdentifier() {
        return this.recommendationIdentifier;
    }

    /**
     * <p>
     * The Recommendation identifier
     * </p>
     * 
     * @param recommendationIdentifier
     *        The Recommendation identifier
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationRequest withRecommendationIdentifier(String recommendationIdentifier) {
        setRecommendationIdentifier(recommendationIdentifier);
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
        if (getRecommendationIdentifier() != null)
            sb.append("RecommendationIdentifier: ").append(getRecommendationIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRecommendationRequest == false)
            return false;
        GetRecommendationRequest other = (GetRecommendationRequest) obj;
        if (other.getRecommendationIdentifier() == null ^ this.getRecommendationIdentifier() == null)
            return false;
        if (other.getRecommendationIdentifier() != null && other.getRecommendationIdentifier().equals(this.getRecommendationIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecommendationIdentifier() == null) ? 0 : getRecommendationIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public GetRecommendationRequest clone() {
        return (GetRecommendationRequest) super.clone();
    }

}
