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
package com.amazonaws.services.route53recoveryreadiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Recommendations that are provided to make an application more recovery resilient.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/Recommendation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Recommendation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Text of the recommendations that are provided to make an application more recovery resilient.
     * </p>
     */
    private String recommendationText;

    /**
     * <p>
     * Text of the recommendations that are provided to make an application more recovery resilient.
     * </p>
     * 
     * @param recommendationText
     *        Text of the recommendations that are provided to make an application more recovery resilient.
     */

    public void setRecommendationText(String recommendationText) {
        this.recommendationText = recommendationText;
    }

    /**
     * <p>
     * Text of the recommendations that are provided to make an application more recovery resilient.
     * </p>
     * 
     * @return Text of the recommendations that are provided to make an application more recovery resilient.
     */

    public String getRecommendationText() {
        return this.recommendationText;
    }

    /**
     * <p>
     * Text of the recommendations that are provided to make an application more recovery resilient.
     * </p>
     * 
     * @param recommendationText
     *        Text of the recommendations that are provided to make an application more recovery resilient.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withRecommendationText(String recommendationText) {
        setRecommendationText(recommendationText);
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
        if (getRecommendationText() != null)
            sb.append("RecommendationText: ").append(getRecommendationText());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Recommendation == false)
            return false;
        Recommendation other = (Recommendation) obj;
        if (other.getRecommendationText() == null ^ this.getRecommendationText() == null)
            return false;
        if (other.getRecommendationText() != null && other.getRecommendationText().equals(this.getRecommendationText()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecommendationText() == null) ? 0 : getRecommendationText().hashCode());
        return hashCode;
    }

    @Override
    public Recommendation clone() {
        try {
            return (Recommendation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53recoveryreadiness.model.transform.RecommendationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
