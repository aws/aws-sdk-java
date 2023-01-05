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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An error occurred when creating a recommendation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/NotifyRecommendationsReceivedError"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotifyRecommendationsReceivedError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A recommendation is causing an error.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The identifier of the recommendation that is in error.
     * </p>
     */
    private String recommendationId;

    /**
     * <p>
     * A recommendation is causing an error.
     * </p>
     * 
     * @param message
     *        A recommendation is causing an error.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A recommendation is causing an error.
     * </p>
     * 
     * @return A recommendation is causing an error.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A recommendation is causing an error.
     * </p>
     * 
     * @param message
     *        A recommendation is causing an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyRecommendationsReceivedError withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The identifier of the recommendation that is in error.
     * </p>
     * 
     * @param recommendationId
     *        The identifier of the recommendation that is in error.
     */

    public void setRecommendationId(String recommendationId) {
        this.recommendationId = recommendationId;
    }

    /**
     * <p>
     * The identifier of the recommendation that is in error.
     * </p>
     * 
     * @return The identifier of the recommendation that is in error.
     */

    public String getRecommendationId() {
        return this.recommendationId;
    }

    /**
     * <p>
     * The identifier of the recommendation that is in error.
     * </p>
     * 
     * @param recommendationId
     *        The identifier of the recommendation that is in error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyRecommendationsReceivedError withRecommendationId(String recommendationId) {
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
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
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

        if (obj instanceof NotifyRecommendationsReceivedError == false)
            return false;
        NotifyRecommendationsReceivedError other = (NotifyRecommendationsReceivedError) obj;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
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

        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getRecommendationId() == null) ? 0 : getRecommendationId().hashCode());
        return hashCode;
    }

    @Override
    public NotifyRecommendationsReceivedError clone() {
        try {
            return (NotifyRecommendationsReceivedError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectwisdom.model.transform.NotifyRecommendationsReceivedErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
