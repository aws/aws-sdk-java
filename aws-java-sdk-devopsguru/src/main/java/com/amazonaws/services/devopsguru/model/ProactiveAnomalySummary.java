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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ProactiveAnomalySummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProactiveAnomalySummary implements Serializable, Cloneable, StructuredPojo {

    private AnomalyTimeRange anomalyTimeRange;

    private String associatedInsightId;

    private String id;

    private Double limit;

    private PredictionTimeRange predictionTimeRange;

    private ResourceCollection resourceCollection;

    private String severity;

    private AnomalySourceDetails sourceDetails;

    private String status;

    private java.util.Date updateTime;

    /**
     * @param anomalyTimeRange
     */

    public void setAnomalyTimeRange(AnomalyTimeRange anomalyTimeRange) {
        this.anomalyTimeRange = anomalyTimeRange;
    }

    /**
     * @return
     */

    public AnomalyTimeRange getAnomalyTimeRange() {
        return this.anomalyTimeRange;
    }

    /**
     * @param anomalyTimeRange
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProactiveAnomalySummary withAnomalyTimeRange(AnomalyTimeRange anomalyTimeRange) {
        setAnomalyTimeRange(anomalyTimeRange);
        return this;
    }

    /**
     * @param associatedInsightId
     */

    public void setAssociatedInsightId(String associatedInsightId) {
        this.associatedInsightId = associatedInsightId;
    }

    /**
     * @return
     */

    public String getAssociatedInsightId() {
        return this.associatedInsightId;
    }

    /**
     * @param associatedInsightId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProactiveAnomalySummary withAssociatedInsightId(String associatedInsightId) {
        setAssociatedInsightId(associatedInsightId);
        return this;
    }

    /**
     * @param id
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return
     */

    public String getId() {
        return this.id;
    }

    /**
     * @param id
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProactiveAnomalySummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * @param limit
     */

    public void setLimit(Double limit) {
        this.limit = limit;
    }

    /**
     * @return
     */

    public Double getLimit() {
        return this.limit;
    }

    /**
     * @param limit
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProactiveAnomalySummary withLimit(Double limit) {
        setLimit(limit);
        return this;
    }

    /**
     * @param predictionTimeRange
     */

    public void setPredictionTimeRange(PredictionTimeRange predictionTimeRange) {
        this.predictionTimeRange = predictionTimeRange;
    }

    /**
     * @return
     */

    public PredictionTimeRange getPredictionTimeRange() {
        return this.predictionTimeRange;
    }

    /**
     * @param predictionTimeRange
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProactiveAnomalySummary withPredictionTimeRange(PredictionTimeRange predictionTimeRange) {
        setPredictionTimeRange(predictionTimeRange);
        return this;
    }

    /**
     * @param resourceCollection
     */

    public void setResourceCollection(ResourceCollection resourceCollection) {
        this.resourceCollection = resourceCollection;
    }

    /**
     * @return
     */

    public ResourceCollection getResourceCollection() {
        return this.resourceCollection;
    }

    /**
     * @param resourceCollection
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProactiveAnomalySummary withResourceCollection(ResourceCollection resourceCollection) {
        setResourceCollection(resourceCollection);
        return this;
    }

    /**
     * @param severity
     * @see AnomalySeverity
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * @return
     * @see AnomalySeverity
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * @param severity
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnomalySeverity
     */

    public ProactiveAnomalySummary withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * @param severity
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnomalySeverity
     */

    public ProactiveAnomalySummary withSeverity(AnomalySeverity severity) {
        this.severity = severity.toString();
        return this;
    }

    /**
     * @param sourceDetails
     */

    public void setSourceDetails(AnomalySourceDetails sourceDetails) {
        this.sourceDetails = sourceDetails;
    }

    /**
     * @return
     */

    public AnomalySourceDetails getSourceDetails() {
        return this.sourceDetails;
    }

    /**
     * @param sourceDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProactiveAnomalySummary withSourceDetails(AnomalySourceDetails sourceDetails) {
        setSourceDetails(sourceDetails);
        return this;
    }

    /**
     * @param status
     * @see AnomalyStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return
     * @see AnomalyStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnomalyStatus
     */

    public ProactiveAnomalySummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnomalyStatus
     */

    public ProactiveAnomalySummary withStatus(AnomalyStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * @param updateTime
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @param updateTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProactiveAnomalySummary withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
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
        if (getAnomalyTimeRange() != null)
            sb.append("AnomalyTimeRange: ").append(getAnomalyTimeRange()).append(",");
        if (getAssociatedInsightId() != null)
            sb.append("AssociatedInsightId: ").append(getAssociatedInsightId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getPredictionTimeRange() != null)
            sb.append("PredictionTimeRange: ").append(getPredictionTimeRange()).append(",");
        if (getResourceCollection() != null)
            sb.append("ResourceCollection: ").append(getResourceCollection()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getSourceDetails() != null)
            sb.append("SourceDetails: ").append(getSourceDetails()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProactiveAnomalySummary == false)
            return false;
        ProactiveAnomalySummary other = (ProactiveAnomalySummary) obj;
        if (other.getAnomalyTimeRange() == null ^ this.getAnomalyTimeRange() == null)
            return false;
        if (other.getAnomalyTimeRange() != null && other.getAnomalyTimeRange().equals(this.getAnomalyTimeRange()) == false)
            return false;
        if (other.getAssociatedInsightId() == null ^ this.getAssociatedInsightId() == null)
            return false;
        if (other.getAssociatedInsightId() != null && other.getAssociatedInsightId().equals(this.getAssociatedInsightId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getPredictionTimeRange() == null ^ this.getPredictionTimeRange() == null)
            return false;
        if (other.getPredictionTimeRange() != null && other.getPredictionTimeRange().equals(this.getPredictionTimeRange()) == false)
            return false;
        if (other.getResourceCollection() == null ^ this.getResourceCollection() == null)
            return false;
        if (other.getResourceCollection() != null && other.getResourceCollection().equals(this.getResourceCollection()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getSourceDetails() == null ^ this.getSourceDetails() == null)
            return false;
        if (other.getSourceDetails() != null && other.getSourceDetails().equals(this.getSourceDetails()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnomalyTimeRange() == null) ? 0 : getAnomalyTimeRange().hashCode());
        hashCode = prime * hashCode + ((getAssociatedInsightId() == null) ? 0 : getAssociatedInsightId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getPredictionTimeRange() == null) ? 0 : getPredictionTimeRange().hashCode());
        hashCode = prime * hashCode + ((getResourceCollection() == null) ? 0 : getResourceCollection().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getSourceDetails() == null) ? 0 : getSourceDetails().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public ProactiveAnomalySummary clone() {
        try {
            return (ProactiveAnomalySummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.ProactiveAnomalySummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
