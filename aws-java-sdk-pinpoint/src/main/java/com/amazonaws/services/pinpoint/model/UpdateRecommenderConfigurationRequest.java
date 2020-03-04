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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateRecommenderConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRecommenderConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the recommender model configuration. This identifier is displayed as the <b>Recommender
     * ID</b> on the Amazon Pinpoint console.
     * </p>
     */
    private String recommenderId;

    private UpdateRecommenderConfiguration updateRecommenderConfiguration;

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

    public UpdateRecommenderConfigurationRequest withRecommenderId(String recommenderId) {
        setRecommenderId(recommenderId);
        return this;
    }

    /**
     * @param updateRecommenderConfiguration
     */

    public void setUpdateRecommenderConfiguration(UpdateRecommenderConfiguration updateRecommenderConfiguration) {
        this.updateRecommenderConfiguration = updateRecommenderConfiguration;
    }

    /**
     * @return
     */

    public UpdateRecommenderConfiguration getUpdateRecommenderConfiguration() {
        return this.updateRecommenderConfiguration;
    }

    /**
     * @param updateRecommenderConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecommenderConfigurationRequest withUpdateRecommenderConfiguration(UpdateRecommenderConfiguration updateRecommenderConfiguration) {
        setUpdateRecommenderConfiguration(updateRecommenderConfiguration);
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
            sb.append("RecommenderId: ").append(getRecommenderId()).append(",");
        if (getUpdateRecommenderConfiguration() != null)
            sb.append("UpdateRecommenderConfiguration: ").append(getUpdateRecommenderConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRecommenderConfigurationRequest == false)
            return false;
        UpdateRecommenderConfigurationRequest other = (UpdateRecommenderConfigurationRequest) obj;
        if (other.getRecommenderId() == null ^ this.getRecommenderId() == null)
            return false;
        if (other.getRecommenderId() != null && other.getRecommenderId().equals(this.getRecommenderId()) == false)
            return false;
        if (other.getUpdateRecommenderConfiguration() == null ^ this.getUpdateRecommenderConfiguration() == null)
            return false;
        if (other.getUpdateRecommenderConfiguration() != null
                && other.getUpdateRecommenderConfiguration().equals(this.getUpdateRecommenderConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecommenderId() == null) ? 0 : getRecommenderId().hashCode());
        hashCode = prime * hashCode + ((getUpdateRecommenderConfiguration() == null) ? 0 : getUpdateRecommenderConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRecommenderConfigurationRequest clone() {
        return (UpdateRecommenderConfigurationRequest) super.clone();
    }

}
