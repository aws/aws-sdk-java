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
package com.amazonaws.services.cleanroomsml.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Metrics that describe the quality of the generated audience.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/AudienceQualityMetrics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudienceQualityMetrics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The recall score of the generated audience. Recall is the percentage of the most similar users (by default, the
     * most similar 20%) from a sample of the training data that are included in the seed audience by the audience
     * generation job. Values range from 0-1, larger values indicate a better audience. A recall value approximately
     * equal to the maximum bin size indicates that the audience model is equivalent to random selection.
     * </p>
     */
    private Double recallMetric;
    /**
     * <p>
     * The relevance scores of the generated audience.
     * </p>
     */
    private java.util.List<RelevanceMetric> relevanceMetrics;

    /**
     * <p>
     * The recall score of the generated audience. Recall is the percentage of the most similar users (by default, the
     * most similar 20%) from a sample of the training data that are included in the seed audience by the audience
     * generation job. Values range from 0-1, larger values indicate a better audience. A recall value approximately
     * equal to the maximum bin size indicates that the audience model is equivalent to random selection.
     * </p>
     * 
     * @param recallMetric
     *        The recall score of the generated audience. Recall is the percentage of the most similar users (by
     *        default, the most similar 20%) from a sample of the training data that are included in the seed audience
     *        by the audience generation job. Values range from 0-1, larger values indicate a better audience. A recall
     *        value approximately equal to the maximum bin size indicates that the audience model is equivalent to
     *        random selection.
     */

    public void setRecallMetric(Double recallMetric) {
        this.recallMetric = recallMetric;
    }

    /**
     * <p>
     * The recall score of the generated audience. Recall is the percentage of the most similar users (by default, the
     * most similar 20%) from a sample of the training data that are included in the seed audience by the audience
     * generation job. Values range from 0-1, larger values indicate a better audience. A recall value approximately
     * equal to the maximum bin size indicates that the audience model is equivalent to random selection.
     * </p>
     * 
     * @return The recall score of the generated audience. Recall is the percentage of the most similar users (by
     *         default, the most similar 20%) from a sample of the training data that are included in the seed audience
     *         by the audience generation job. Values range from 0-1, larger values indicate a better audience. A recall
     *         value approximately equal to the maximum bin size indicates that the audience model is equivalent to
     *         random selection.
     */

    public Double getRecallMetric() {
        return this.recallMetric;
    }

    /**
     * <p>
     * The recall score of the generated audience. Recall is the percentage of the most similar users (by default, the
     * most similar 20%) from a sample of the training data that are included in the seed audience by the audience
     * generation job. Values range from 0-1, larger values indicate a better audience. A recall value approximately
     * equal to the maximum bin size indicates that the audience model is equivalent to random selection.
     * </p>
     * 
     * @param recallMetric
     *        The recall score of the generated audience. Recall is the percentage of the most similar users (by
     *        default, the most similar 20%) from a sample of the training data that are included in the seed audience
     *        by the audience generation job. Values range from 0-1, larger values indicate a better audience. A recall
     *        value approximately equal to the maximum bin size indicates that the audience model is equivalent to
     *        random selection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudienceQualityMetrics withRecallMetric(Double recallMetric) {
        setRecallMetric(recallMetric);
        return this;
    }

    /**
     * <p>
     * The relevance scores of the generated audience.
     * </p>
     * 
     * @return The relevance scores of the generated audience.
     */

    public java.util.List<RelevanceMetric> getRelevanceMetrics() {
        return relevanceMetrics;
    }

    /**
     * <p>
     * The relevance scores of the generated audience.
     * </p>
     * 
     * @param relevanceMetrics
     *        The relevance scores of the generated audience.
     */

    public void setRelevanceMetrics(java.util.Collection<RelevanceMetric> relevanceMetrics) {
        if (relevanceMetrics == null) {
            this.relevanceMetrics = null;
            return;
        }

        this.relevanceMetrics = new java.util.ArrayList<RelevanceMetric>(relevanceMetrics);
    }

    /**
     * <p>
     * The relevance scores of the generated audience.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRelevanceMetrics(java.util.Collection)} or {@link #withRelevanceMetrics(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param relevanceMetrics
     *        The relevance scores of the generated audience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudienceQualityMetrics withRelevanceMetrics(RelevanceMetric... relevanceMetrics) {
        if (this.relevanceMetrics == null) {
            setRelevanceMetrics(new java.util.ArrayList<RelevanceMetric>(relevanceMetrics.length));
        }
        for (RelevanceMetric ele : relevanceMetrics) {
            this.relevanceMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The relevance scores of the generated audience.
     * </p>
     * 
     * @param relevanceMetrics
     *        The relevance scores of the generated audience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudienceQualityMetrics withRelevanceMetrics(java.util.Collection<RelevanceMetric> relevanceMetrics) {
        setRelevanceMetrics(relevanceMetrics);
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
        if (getRecallMetric() != null)
            sb.append("RecallMetric: ").append(getRecallMetric()).append(",");
        if (getRelevanceMetrics() != null)
            sb.append("RelevanceMetrics: ").append(getRelevanceMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudienceQualityMetrics == false)
            return false;
        AudienceQualityMetrics other = (AudienceQualityMetrics) obj;
        if (other.getRecallMetric() == null ^ this.getRecallMetric() == null)
            return false;
        if (other.getRecallMetric() != null && other.getRecallMetric().equals(this.getRecallMetric()) == false)
            return false;
        if (other.getRelevanceMetrics() == null ^ this.getRelevanceMetrics() == null)
            return false;
        if (other.getRelevanceMetrics() != null && other.getRelevanceMetrics().equals(this.getRelevanceMetrics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecallMetric() == null) ? 0 : getRecallMetric().hashCode());
        hashCode = prime * hashCode + ((getRelevanceMetrics() == null) ? 0 : getRelevanceMetrics().hashCode());
        return hashCode;
    }

    @Override
    public AudienceQualityMetrics clone() {
        try {
            return (AudienceQualityMetrics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanroomsml.model.transform.AudienceQualityMetricsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
