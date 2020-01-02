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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the source of a recommendation, such as an Amazon EC2 instance or Auto Scaling group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/RecommendationSource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recommendation source.
     * </p>
     */
    private String recommendationSourceArn;
    /**
     * <p>
     * The resource type of the recommendation source.
     * </p>
     */
    private String recommendationSourceType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recommendation source.
     * </p>
     * 
     * @param recommendationSourceArn
     *        The Amazon Resource Name (ARN) of the recommendation source.
     */

    public void setRecommendationSourceArn(String recommendationSourceArn) {
        this.recommendationSourceArn = recommendationSourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recommendation source.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the recommendation source.
     */

    public String getRecommendationSourceArn() {
        return this.recommendationSourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recommendation source.
     * </p>
     * 
     * @param recommendationSourceArn
     *        The Amazon Resource Name (ARN) of the recommendation source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationSource withRecommendationSourceArn(String recommendationSourceArn) {
        setRecommendationSourceArn(recommendationSourceArn);
        return this;
    }

    /**
     * <p>
     * The resource type of the recommendation source.
     * </p>
     * 
     * @param recommendationSourceType
     *        The resource type of the recommendation source.
     * @see RecommendationSourceType
     */

    public void setRecommendationSourceType(String recommendationSourceType) {
        this.recommendationSourceType = recommendationSourceType;
    }

    /**
     * <p>
     * The resource type of the recommendation source.
     * </p>
     * 
     * @return The resource type of the recommendation source.
     * @see RecommendationSourceType
     */

    public String getRecommendationSourceType() {
        return this.recommendationSourceType;
    }

    /**
     * <p>
     * The resource type of the recommendation source.
     * </p>
     * 
     * @param recommendationSourceType
     *        The resource type of the recommendation source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationSourceType
     */

    public RecommendationSource withRecommendationSourceType(String recommendationSourceType) {
        setRecommendationSourceType(recommendationSourceType);
        return this;
    }

    /**
     * <p>
     * The resource type of the recommendation source.
     * </p>
     * 
     * @param recommendationSourceType
     *        The resource type of the recommendation source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecommendationSourceType
     */

    public RecommendationSource withRecommendationSourceType(RecommendationSourceType recommendationSourceType) {
        this.recommendationSourceType = recommendationSourceType.toString();
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
        if (getRecommendationSourceArn() != null)
            sb.append("RecommendationSourceArn: ").append(getRecommendationSourceArn()).append(",");
        if (getRecommendationSourceType() != null)
            sb.append("RecommendationSourceType: ").append(getRecommendationSourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendationSource == false)
            return false;
        RecommendationSource other = (RecommendationSource) obj;
        if (other.getRecommendationSourceArn() == null ^ this.getRecommendationSourceArn() == null)
            return false;
        if (other.getRecommendationSourceArn() != null && other.getRecommendationSourceArn().equals(this.getRecommendationSourceArn()) == false)
            return false;
        if (other.getRecommendationSourceType() == null ^ this.getRecommendationSourceType() == null)
            return false;
        if (other.getRecommendationSourceType() != null && other.getRecommendationSourceType().equals(this.getRecommendationSourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecommendationSourceArn() == null) ? 0 : getRecommendationSourceArn().hashCode());
        hashCode = prime * hashCode + ((getRecommendationSourceType() == null) ? 0 : getRecommendationSourceType().hashCode());
        return hashCode;
    }

    @Override
    public RecommendationSource clone() {
        try {
            return (RecommendationSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.RecommendationSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
