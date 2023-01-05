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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Aggregated details about the measures contributing to the anomaly group, and the measures potentially impacted by the
 * anomaly group.
 * </p>
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/InterMetricImpactDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InterMetricImpactDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the measure.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The ID of the anomaly group.
     * </p>
     */
    private String anomalyGroupId;
    /**
     * <p>
     * Whether a measure is a potential cause of the anomaly group (<code>CAUSE_OF_INPUT_ANOMALY_GROUP</code>), or
     * whether the measure is impacted by the anomaly group (<code>EFFECT_OF_INPUT_ANOMALY_GROUP</code>).
     * </p>
     */
    private String relationshipType;
    /**
     * <p>
     * For potential causes (<code>CAUSE_OF_INPUT_ANOMALY_GROUP</code>), the percentage contribution the measure has in
     * causing the anomalies.
     * </p>
     */
    private Double contributionPercentage;

    /**
     * <p>
     * The name of the measure.
     * </p>
     * 
     * @param metricName
     *        The name of the measure.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the measure.
     * </p>
     * 
     * @return The name of the measure.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the measure.
     * </p>
     * 
     * @param metricName
     *        The name of the measure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InterMetricImpactDetails withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The ID of the anomaly group.
     * </p>
     * 
     * @param anomalyGroupId
     *        The ID of the anomaly group.
     */

    public void setAnomalyGroupId(String anomalyGroupId) {
        this.anomalyGroupId = anomalyGroupId;
    }

    /**
     * <p>
     * The ID of the anomaly group.
     * </p>
     * 
     * @return The ID of the anomaly group.
     */

    public String getAnomalyGroupId() {
        return this.anomalyGroupId;
    }

    /**
     * <p>
     * The ID of the anomaly group.
     * </p>
     * 
     * @param anomalyGroupId
     *        The ID of the anomaly group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InterMetricImpactDetails withAnomalyGroupId(String anomalyGroupId) {
        setAnomalyGroupId(anomalyGroupId);
        return this;
    }

    /**
     * <p>
     * Whether a measure is a potential cause of the anomaly group (<code>CAUSE_OF_INPUT_ANOMALY_GROUP</code>), or
     * whether the measure is impacted by the anomaly group (<code>EFFECT_OF_INPUT_ANOMALY_GROUP</code>).
     * </p>
     * 
     * @param relationshipType
     *        Whether a measure is a potential cause of the anomaly group (<code>CAUSE_OF_INPUT_ANOMALY_GROUP</code>),
     *        or whether the measure is impacted by the anomaly group (<code>EFFECT_OF_INPUT_ANOMALY_GROUP</code>).
     * @see RelationshipType
     */

    public void setRelationshipType(String relationshipType) {
        this.relationshipType = relationshipType;
    }

    /**
     * <p>
     * Whether a measure is a potential cause of the anomaly group (<code>CAUSE_OF_INPUT_ANOMALY_GROUP</code>), or
     * whether the measure is impacted by the anomaly group (<code>EFFECT_OF_INPUT_ANOMALY_GROUP</code>).
     * </p>
     * 
     * @return Whether a measure is a potential cause of the anomaly group (<code>CAUSE_OF_INPUT_ANOMALY_GROUP</code>),
     *         or whether the measure is impacted by the anomaly group (<code>EFFECT_OF_INPUT_ANOMALY_GROUP</code>).
     * @see RelationshipType
     */

    public String getRelationshipType() {
        return this.relationshipType;
    }

    /**
     * <p>
     * Whether a measure is a potential cause of the anomaly group (<code>CAUSE_OF_INPUT_ANOMALY_GROUP</code>), or
     * whether the measure is impacted by the anomaly group (<code>EFFECT_OF_INPUT_ANOMALY_GROUP</code>).
     * </p>
     * 
     * @param relationshipType
     *        Whether a measure is a potential cause of the anomaly group (<code>CAUSE_OF_INPUT_ANOMALY_GROUP</code>),
     *        or whether the measure is impacted by the anomaly group (<code>EFFECT_OF_INPUT_ANOMALY_GROUP</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelationshipType
     */

    public InterMetricImpactDetails withRelationshipType(String relationshipType) {
        setRelationshipType(relationshipType);
        return this;
    }

    /**
     * <p>
     * Whether a measure is a potential cause of the anomaly group (<code>CAUSE_OF_INPUT_ANOMALY_GROUP</code>), or
     * whether the measure is impacted by the anomaly group (<code>EFFECT_OF_INPUT_ANOMALY_GROUP</code>).
     * </p>
     * 
     * @param relationshipType
     *        Whether a measure is a potential cause of the anomaly group (<code>CAUSE_OF_INPUT_ANOMALY_GROUP</code>),
     *        or whether the measure is impacted by the anomaly group (<code>EFFECT_OF_INPUT_ANOMALY_GROUP</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelationshipType
     */

    public InterMetricImpactDetails withRelationshipType(RelationshipType relationshipType) {
        this.relationshipType = relationshipType.toString();
        return this;
    }

    /**
     * <p>
     * For potential causes (<code>CAUSE_OF_INPUT_ANOMALY_GROUP</code>), the percentage contribution the measure has in
     * causing the anomalies.
     * </p>
     * 
     * @param contributionPercentage
     *        For potential causes (<code>CAUSE_OF_INPUT_ANOMALY_GROUP</code>), the percentage contribution the measure
     *        has in causing the anomalies.
     */

    public void setContributionPercentage(Double contributionPercentage) {
        this.contributionPercentage = contributionPercentage;
    }

    /**
     * <p>
     * For potential causes (<code>CAUSE_OF_INPUT_ANOMALY_GROUP</code>), the percentage contribution the measure has in
     * causing the anomalies.
     * </p>
     * 
     * @return For potential causes (<code>CAUSE_OF_INPUT_ANOMALY_GROUP</code>), the percentage contribution the measure
     *         has in causing the anomalies.
     */

    public Double getContributionPercentage() {
        return this.contributionPercentage;
    }

    /**
     * <p>
     * For potential causes (<code>CAUSE_OF_INPUT_ANOMALY_GROUP</code>), the percentage contribution the measure has in
     * causing the anomalies.
     * </p>
     * 
     * @param contributionPercentage
     *        For potential causes (<code>CAUSE_OF_INPUT_ANOMALY_GROUP</code>), the percentage contribution the measure
     *        has in causing the anomalies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InterMetricImpactDetails withContributionPercentage(Double contributionPercentage) {
        setContributionPercentage(contributionPercentage);
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
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getAnomalyGroupId() != null)
            sb.append("AnomalyGroupId: ").append(getAnomalyGroupId()).append(",");
        if (getRelationshipType() != null)
            sb.append("RelationshipType: ").append(getRelationshipType()).append(",");
        if (getContributionPercentage() != null)
            sb.append("ContributionPercentage: ").append(getContributionPercentage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InterMetricImpactDetails == false)
            return false;
        InterMetricImpactDetails other = (InterMetricImpactDetails) obj;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getAnomalyGroupId() == null ^ this.getAnomalyGroupId() == null)
            return false;
        if (other.getAnomalyGroupId() != null && other.getAnomalyGroupId().equals(this.getAnomalyGroupId()) == false)
            return false;
        if (other.getRelationshipType() == null ^ this.getRelationshipType() == null)
            return false;
        if (other.getRelationshipType() != null && other.getRelationshipType().equals(this.getRelationshipType()) == false)
            return false;
        if (other.getContributionPercentage() == null ^ this.getContributionPercentage() == null)
            return false;
        if (other.getContributionPercentage() != null && other.getContributionPercentage().equals(this.getContributionPercentage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getAnomalyGroupId() == null) ? 0 : getAnomalyGroupId().hashCode());
        hashCode = prime * hashCode + ((getRelationshipType() == null) ? 0 : getRelationshipType().hashCode());
        hashCode = prime * hashCode + ((getContributionPercentage() == null) ? 0 : getContributionPercentage().hashCode());
        return hashCode;
    }

    @Override
    public InterMetricImpactDetails clone() {
        try {
            return (InterMetricImpactDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.InterMetricImpactDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
