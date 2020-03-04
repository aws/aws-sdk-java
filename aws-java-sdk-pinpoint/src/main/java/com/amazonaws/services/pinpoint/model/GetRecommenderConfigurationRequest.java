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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetRecommenderConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRecommenderConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the recommender model configuration. This identifier is displayed as the <b>Recommender
     * ID</b> on the Amazon Pinpoint console.
     * </p>
     */
    private String recommenderId;

    /**
     * <p>
     * The unique identifier for the recommender model configuration. This identifier is displayed as the <b>Recommender
     * ID</b> on the Amazon Pinpoint console.
     * </p>
     * 
     * @param recommenderId
     *        The unique identifier for the recommender model configuration. This identifier is displayed as the
     *        <b>Recommender ID</b> on the Amazon Pinpoint console.
     */

    public void setRecommenderId(String recommenderId) {
        this.recommenderId = recommenderId;
    }

    /**
     * <p>
     * The unique identifier for the recommender model configuration. This identifier is displayed as the <b>Recommender
     * ID</b> on the Amazon Pinpoint console.
     * </p>
     * 
     * @return The unique identifier for the recommender model configuration. This identifier is displayed as the
     *         <b>Recommender ID</b> on the Amazon Pinpoint console.
     */

    public String getRecommenderId() {
        return this.recommenderId;
    }

    /**
     * <p>
     * The unique identifier for the recommender model configuration. This identifier is displayed as the <b>Recommender
     * ID</b> on the Amazon Pinpoint console.
     * </p>
     * 
     * @param recommenderId
     *        The unique identifier for the recommender model configuration. This identifier is displayed as the
     *        <b>Recommender ID</b> on the Amazon Pinpoint console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommenderConfigurationRequest withRecommenderId(String recommenderId) {
        setRecommenderId(recommenderId);
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
        if (getRecommenderId() != null)
            sb.append("RecommenderId: ").append(getRecommenderId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRecommenderConfigurationRequest == false)
            return false;
        GetRecommenderConfigurationRequest other = (GetRecommenderConfigurationRequest) obj;
        if (other.getRecommenderId() == null ^ this.getRecommenderId() == null)
            return false;
        if (other.getRecommenderId() != null && other.getRecommenderId().equals(this.getRecommenderId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecommenderId() == null) ? 0 : getRecommenderId().hashCode());
        return hashCode;
    }

    @Override
    public GetRecommenderConfigurationRequest clone() {
        return (GetRecommenderConfigurationRequest) super.clone();
    }

}
