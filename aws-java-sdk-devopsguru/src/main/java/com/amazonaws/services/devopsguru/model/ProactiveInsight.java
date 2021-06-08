/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * Details about a proactive insight. This object is returned by <code>ListInsights</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ProactiveInsight" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProactiveInsight implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the proactive insight.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the proactive insight.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The severity of the proactive insight.
     * </p>
     */
    private String severity;
    /**
     * <p>
     * The status of the proactive insight.
     * </p>
     */
    private String status;

    private InsightTimeRange insightTimeRange;

    private PredictionTimeRange predictionTimeRange;

    private ResourceCollection resourceCollection;
    /**
     * <p>
     * The ID of the AWS System Manager OpsItem created for this insight. You must enable the creation of OpstItems
     * insights before they are created for each insight.
     * </p>
     */
    private String ssmOpsItemId;

    /**
     * <p>
     * The ID of the proactive insight.
     * </p>
     * 
     * @param id
     *        The ID of the proactive insight.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the proactive insight.
     * </p>
     * 
     * @return The ID of the proactive insight.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the proactive insight.
     * </p>
     * 
     * @param id
     *        The ID of the proactive insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProactiveInsight withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the proactive insight.
     * </p>
     * 
     * @param name
     *        The name of the proactive insight.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the proactive insight.
     * </p>
     * 
     * @return The name of the proactive insight.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the proactive insight.
     * </p>
     * 
     * @param name
     *        The name of the proactive insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProactiveInsight withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The severity of the proactive insight.
     * </p>
     * 
     * @param severity
     *        The severity of the proactive insight.
     * @see InsightSeverity
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * The severity of the proactive insight.
     * </p>
     * 
     * @return The severity of the proactive insight.
     * @see InsightSeverity
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * The severity of the proactive insight.
     * </p>
     * 
     * @param severity
     *        The severity of the proactive insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightSeverity
     */

    public ProactiveInsight withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * The severity of the proactive insight.
     * </p>
     * 
     * @param severity
     *        The severity of the proactive insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightSeverity
     */

    public ProactiveInsight withSeverity(InsightSeverity severity) {
        this.severity = severity.toString();
        return this;
    }

    /**
     * <p>
     * The status of the proactive insight.
     * </p>
     * 
     * @param status
     *        The status of the proactive insight.
     * @see InsightStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the proactive insight.
     * </p>
     * 
     * @return The status of the proactive insight.
     * @see InsightStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the proactive insight.
     * </p>
     * 
     * @param status
     *        The status of the proactive insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightStatus
     */

    public ProactiveInsight withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the proactive insight.
     * </p>
     * 
     * @param status
     *        The status of the proactive insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightStatus
     */

    public ProactiveInsight withStatus(InsightStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * @param insightTimeRange
     */

    public void setInsightTimeRange(InsightTimeRange insightTimeRange) {
        this.insightTimeRange = insightTimeRange;
    }

    /**
     * @return
     */

    public InsightTimeRange getInsightTimeRange() {
        return this.insightTimeRange;
    }

    /**
     * @param insightTimeRange
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProactiveInsight withInsightTimeRange(InsightTimeRange insightTimeRange) {
        setInsightTimeRange(insightTimeRange);
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

    public ProactiveInsight withPredictionTimeRange(PredictionTimeRange predictionTimeRange) {
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

    public ProactiveInsight withResourceCollection(ResourceCollection resourceCollection) {
        setResourceCollection(resourceCollection);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS System Manager OpsItem created for this insight. You must enable the creation of OpstItems
     * insights before they are created for each insight.
     * </p>
     * 
     * @param ssmOpsItemId
     *        The ID of the AWS System Manager OpsItem created for this insight. You must enable the creation of
     *        OpstItems insights before they are created for each insight.
     */

    public void setSsmOpsItemId(String ssmOpsItemId) {
        this.ssmOpsItemId = ssmOpsItemId;
    }

    /**
     * <p>
     * The ID of the AWS System Manager OpsItem created for this insight. You must enable the creation of OpstItems
     * insights before they are created for each insight.
     * </p>
     * 
     * @return The ID of the AWS System Manager OpsItem created for this insight. You must enable the creation of
     *         OpstItems insights before they are created for each insight.
     */

    public String getSsmOpsItemId() {
        return this.ssmOpsItemId;
    }

    /**
     * <p>
     * The ID of the AWS System Manager OpsItem created for this insight. You must enable the creation of OpstItems
     * insights before they are created for each insight.
     * </p>
     * 
     * @param ssmOpsItemId
     *        The ID of the AWS System Manager OpsItem created for this insight. You must enable the creation of
     *        OpstItems insights before they are created for each insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProactiveInsight withSsmOpsItemId(String ssmOpsItemId) {
        setSsmOpsItemId(ssmOpsItemId);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getInsightTimeRange() != null)
            sb.append("InsightTimeRange: ").append(getInsightTimeRange()).append(",");
        if (getPredictionTimeRange() != null)
            sb.append("PredictionTimeRange: ").append(getPredictionTimeRange()).append(",");
        if (getResourceCollection() != null)
            sb.append("ResourceCollection: ").append(getResourceCollection()).append(",");
        if (getSsmOpsItemId() != null)
            sb.append("SsmOpsItemId: ").append(getSsmOpsItemId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProactiveInsight == false)
            return false;
        ProactiveInsight other = (ProactiveInsight) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getInsightTimeRange() == null ^ this.getInsightTimeRange() == null)
            return false;
        if (other.getInsightTimeRange() != null && other.getInsightTimeRange().equals(this.getInsightTimeRange()) == false)
            return false;
        if (other.getPredictionTimeRange() == null ^ this.getPredictionTimeRange() == null)
            return false;
        if (other.getPredictionTimeRange() != null && other.getPredictionTimeRange().equals(this.getPredictionTimeRange()) == false)
            return false;
        if (other.getResourceCollection() == null ^ this.getResourceCollection() == null)
            return false;
        if (other.getResourceCollection() != null && other.getResourceCollection().equals(this.getResourceCollection()) == false)
            return false;
        if (other.getSsmOpsItemId() == null ^ this.getSsmOpsItemId() == null)
            return false;
        if (other.getSsmOpsItemId() != null && other.getSsmOpsItemId().equals(this.getSsmOpsItemId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getInsightTimeRange() == null) ? 0 : getInsightTimeRange().hashCode());
        hashCode = prime * hashCode + ((getPredictionTimeRange() == null) ? 0 : getPredictionTimeRange().hashCode());
        hashCode = prime * hashCode + ((getResourceCollection() == null) ? 0 : getResourceCollection().hashCode());
        hashCode = prime * hashCode + ((getSsmOpsItemId() == null) ? 0 : getSsmOpsItemId().hashCode());
        return hashCode;
    }

    @Override
    public ProactiveInsight clone() {
        try {
            return (ProactiveInsight) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.ProactiveInsightMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
