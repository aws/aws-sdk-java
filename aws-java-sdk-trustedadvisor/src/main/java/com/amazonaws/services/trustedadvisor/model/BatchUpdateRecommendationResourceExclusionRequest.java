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
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/trustedadvisor-2022-09-15/BatchUpdateRecommendationResourceExclusion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchUpdateRecommendationResourceExclusionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of recommendation resource ARNs and exclusion status to update
     * </p>
     */
    private java.util.List<RecommendationResourceExclusion> recommendationResourceExclusions;

    /**
     * <p>
     * A list of recommendation resource ARNs and exclusion status to update
     * </p>
     * 
     * @return A list of recommendation resource ARNs and exclusion status to update
     */

    public java.util.List<RecommendationResourceExclusion> getRecommendationResourceExclusions() {
        return recommendationResourceExclusions;
    }

    /**
     * <p>
     * A list of recommendation resource ARNs and exclusion status to update
     * </p>
     * 
     * @param recommendationResourceExclusions
     *        A list of recommendation resource ARNs and exclusion status to update
     */

    public void setRecommendationResourceExclusions(java.util.Collection<RecommendationResourceExclusion> recommendationResourceExclusions) {
        if (recommendationResourceExclusions == null) {
            this.recommendationResourceExclusions = null;
            return;
        }

        this.recommendationResourceExclusions = new java.util.ArrayList<RecommendationResourceExclusion>(recommendationResourceExclusions);
    }

    /**
     * <p>
     * A list of recommendation resource ARNs and exclusion status to update
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendationResourceExclusions(java.util.Collection)} or
     * {@link #withRecommendationResourceExclusions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param recommendationResourceExclusions
     *        A list of recommendation resource ARNs and exclusion status to update
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateRecommendationResourceExclusionRequest withRecommendationResourceExclusions(
            RecommendationResourceExclusion... recommendationResourceExclusions) {
        if (this.recommendationResourceExclusions == null) {
            setRecommendationResourceExclusions(new java.util.ArrayList<RecommendationResourceExclusion>(recommendationResourceExclusions.length));
        }
        for (RecommendationResourceExclusion ele : recommendationResourceExclusions) {
            this.recommendationResourceExclusions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of recommendation resource ARNs and exclusion status to update
     * </p>
     * 
     * @param recommendationResourceExclusions
     *        A list of recommendation resource ARNs and exclusion status to update
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateRecommendationResourceExclusionRequest withRecommendationResourceExclusions(
            java.util.Collection<RecommendationResourceExclusion> recommendationResourceExclusions) {
        setRecommendationResourceExclusions(recommendationResourceExclusions);
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
        if (getRecommendationResourceExclusions() != null)
            sb.append("RecommendationResourceExclusions: ").append(getRecommendationResourceExclusions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpdateRecommendationResourceExclusionRequest == false)
            return false;
        BatchUpdateRecommendationResourceExclusionRequest other = (BatchUpdateRecommendationResourceExclusionRequest) obj;
        if (other.getRecommendationResourceExclusions() == null ^ this.getRecommendationResourceExclusions() == null)
            return false;
        if (other.getRecommendationResourceExclusions() != null
                && other.getRecommendationResourceExclusions().equals(this.getRecommendationResourceExclusions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecommendationResourceExclusions() == null) ? 0 : getRecommendationResourceExclusions().hashCode());
        return hashCode;
    }

    @Override
    public BatchUpdateRecommendationResourceExclusionRequest clone() {
        return (BatchUpdateRecommendationResourceExclusionRequest) super.clone();
    }

}
