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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about a reactive anomaly. This object is returned by <code>ListAnomalies</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ReactiveAnomaly" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReactiveAnomaly implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the reactive anomaly.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The severity of the anomaly. The severity of anomalies that generate an insight determine that insight's
     * severity. For more information, see <a href=
     * "https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities"
     * >Understanding insight severities</a> in the <i>Amazon DevOps Guru User Guide</i>.
     * </p>
     */
    private String severity;
    /**
     * <p>
     * The status of the anomaly.
     * </p>
     */
    private String status;

    private AnomalyTimeRange anomalyTimeRange;
    /**
     * <p>
     * An <code>AnomalyReportedTimeRange</code> object that specifies the time range between when the anomaly is opened
     * and the time when it is closed.
     * </p>
     */
    private AnomalyReportedTimeRange anomalyReportedTimeRange;
    /**
     * <p>
     * Details about the source of the analyzed operational data that triggered the anomaly. The one supported source is
     * Amazon CloudWatch metrics.
     * </p>
     */
    private AnomalySourceDetails sourceDetails;
    /**
     * <p>
     * The ID of the insight that contains this anomaly. An insight is composed of related anomalies.
     * </p>
     */
    private String associatedInsightId;

    private ResourceCollection resourceCollection;
    /**
     * <p>
     * The type of the reactive anomaly. It can be one of the following types.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAUSAL</code> - the anomaly can cause a new insight.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONTEXTUAL</code> - the anomaly contains additional information about an insight or its causal anomaly.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * The name of the reactive anomaly.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the reactive anomaly.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of the causal anomaly that is associated with this reactive anomaly. The ID of a `CAUSAL` anomaly is
     * always `NULL`.
     * </p>
     */
    private String causalAnomalyId;
    /**
     * <p>
     * The Amazon Web Services resources in which anomalous behavior was detected by DevOps Guru.
     * </p>
     */
    private java.util.List<AnomalyResource> anomalyResources;

    /**
     * <p>
     * The ID of the reactive anomaly.
     * </p>
     * 
     * @param id
     *        The ID of the reactive anomaly.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the reactive anomaly.
     * </p>
     * 
     * @return The ID of the reactive anomaly.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the reactive anomaly.
     * </p>
     * 
     * @param id
     *        The ID of the reactive anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReactiveAnomaly withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The severity of the anomaly. The severity of anomalies that generate an insight determine that insight's
     * severity. For more information, see <a href=
     * "https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities"
     * >Understanding insight severities</a> in the <i>Amazon DevOps Guru User Guide</i>.
     * </p>
     * 
     * @param severity
     *        The severity of the anomaly. The severity of anomalies that generate an insight determine that insight's
     *        severity. For more information, see <a href=
     *        "https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities"
     *        >Understanding insight severities</a> in the <i>Amazon DevOps Guru User Guide</i>.
     * @see AnomalySeverity
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * The severity of the anomaly. The severity of anomalies that generate an insight determine that insight's
     * severity. For more information, see <a href=
     * "https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities"
     * >Understanding insight severities</a> in the <i>Amazon DevOps Guru User Guide</i>.
     * </p>
     * 
     * @return The severity of the anomaly. The severity of anomalies that generate an insight determine that insight's
     *         severity. For more information, see <a href=
     *         "https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities"
     *         >Understanding insight severities</a> in the <i>Amazon DevOps Guru User Guide</i>.
     * @see AnomalySeverity
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * The severity of the anomaly. The severity of anomalies that generate an insight determine that insight's
     * severity. For more information, see <a href=
     * "https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities"
     * >Understanding insight severities</a> in the <i>Amazon DevOps Guru User Guide</i>.
     * </p>
     * 
     * @param severity
     *        The severity of the anomaly. The severity of anomalies that generate an insight determine that insight's
     *        severity. For more information, see <a href=
     *        "https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities"
     *        >Understanding insight severities</a> in the <i>Amazon DevOps Guru User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnomalySeverity
     */

    public ReactiveAnomaly withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * The severity of the anomaly. The severity of anomalies that generate an insight determine that insight's
     * severity. For more information, see <a href=
     * "https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities"
     * >Understanding insight severities</a> in the <i>Amazon DevOps Guru User Guide</i>.
     * </p>
     * 
     * @param severity
     *        The severity of the anomaly. The severity of anomalies that generate an insight determine that insight's
     *        severity. For more information, see <a href=
     *        "https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities"
     *        >Understanding insight severities</a> in the <i>Amazon DevOps Guru User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnomalySeverity
     */

    public ReactiveAnomaly withSeverity(AnomalySeverity severity) {
        this.severity = severity.toString();
        return this;
    }

    /**
     * <p>
     * The status of the anomaly.
     * </p>
     * 
     * @param status
     *        The status of the anomaly.
     * @see AnomalyStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the anomaly.
     * </p>
     * 
     * @return The status of the anomaly.
     * @see AnomalyStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the anomaly.
     * </p>
     * 
     * @param status
     *        The status of the anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnomalyStatus
     */

    public ReactiveAnomaly withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the anomaly.
     * </p>
     * 
     * @param status
     *        The status of the anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnomalyStatus
     */

    public ReactiveAnomaly withStatus(AnomalyStatus status) {
        this.status = status.toString();
        return this;
    }

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

    public ReactiveAnomaly withAnomalyTimeRange(AnomalyTimeRange anomalyTimeRange) {
        setAnomalyTimeRange(anomalyTimeRange);
        return this;
    }

    /**
     * <p>
     * An <code>AnomalyReportedTimeRange</code> object that specifies the time range between when the anomaly is opened
     * and the time when it is closed.
     * </p>
     * 
     * @param anomalyReportedTimeRange
     *        An <code>AnomalyReportedTimeRange</code> object that specifies the time range between when the anomaly is
     *        opened and the time when it is closed.
     */

    public void setAnomalyReportedTimeRange(AnomalyReportedTimeRange anomalyReportedTimeRange) {
        this.anomalyReportedTimeRange = anomalyReportedTimeRange;
    }

    /**
     * <p>
     * An <code>AnomalyReportedTimeRange</code> object that specifies the time range between when the anomaly is opened
     * and the time when it is closed.
     * </p>
     * 
     * @return An <code>AnomalyReportedTimeRange</code> object that specifies the time range between when the anomaly is
     *         opened and the time when it is closed.
     */

    public AnomalyReportedTimeRange getAnomalyReportedTimeRange() {
        return this.anomalyReportedTimeRange;
    }

    /**
     * <p>
     * An <code>AnomalyReportedTimeRange</code> object that specifies the time range between when the anomaly is opened
     * and the time when it is closed.
     * </p>
     * 
     * @param anomalyReportedTimeRange
     *        An <code>AnomalyReportedTimeRange</code> object that specifies the time range between when the anomaly is
     *        opened and the time when it is closed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReactiveAnomaly withAnomalyReportedTimeRange(AnomalyReportedTimeRange anomalyReportedTimeRange) {
        setAnomalyReportedTimeRange(anomalyReportedTimeRange);
        return this;
    }

    /**
     * <p>
     * Details about the source of the analyzed operational data that triggered the anomaly. The one supported source is
     * Amazon CloudWatch metrics.
     * </p>
     * 
     * @param sourceDetails
     *        Details about the source of the analyzed operational data that triggered the anomaly. The one supported
     *        source is Amazon CloudWatch metrics.
     */

    public void setSourceDetails(AnomalySourceDetails sourceDetails) {
        this.sourceDetails = sourceDetails;
    }

    /**
     * <p>
     * Details about the source of the analyzed operational data that triggered the anomaly. The one supported source is
     * Amazon CloudWatch metrics.
     * </p>
     * 
     * @return Details about the source of the analyzed operational data that triggered the anomaly. The one supported
     *         source is Amazon CloudWatch metrics.
     */

    public AnomalySourceDetails getSourceDetails() {
        return this.sourceDetails;
    }

    /**
     * <p>
     * Details about the source of the analyzed operational data that triggered the anomaly. The one supported source is
     * Amazon CloudWatch metrics.
     * </p>
     * 
     * @param sourceDetails
     *        Details about the source of the analyzed operational data that triggered the anomaly. The one supported
     *        source is Amazon CloudWatch metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReactiveAnomaly withSourceDetails(AnomalySourceDetails sourceDetails) {
        setSourceDetails(sourceDetails);
        return this;
    }

    /**
     * <p>
     * The ID of the insight that contains this anomaly. An insight is composed of related anomalies.
     * </p>
     * 
     * @param associatedInsightId
     *        The ID of the insight that contains this anomaly. An insight is composed of related anomalies.
     */

    public void setAssociatedInsightId(String associatedInsightId) {
        this.associatedInsightId = associatedInsightId;
    }

    /**
     * <p>
     * The ID of the insight that contains this anomaly. An insight is composed of related anomalies.
     * </p>
     * 
     * @return The ID of the insight that contains this anomaly. An insight is composed of related anomalies.
     */

    public String getAssociatedInsightId() {
        return this.associatedInsightId;
    }

    /**
     * <p>
     * The ID of the insight that contains this anomaly. An insight is composed of related anomalies.
     * </p>
     * 
     * @param associatedInsightId
     *        The ID of the insight that contains this anomaly. An insight is composed of related anomalies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReactiveAnomaly withAssociatedInsightId(String associatedInsightId) {
        setAssociatedInsightId(associatedInsightId);
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

    public ReactiveAnomaly withResourceCollection(ResourceCollection resourceCollection) {
        setResourceCollection(resourceCollection);
        return this;
    }

    /**
     * <p>
     * The type of the reactive anomaly. It can be one of the following types.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAUSAL</code> - the anomaly can cause a new insight.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONTEXTUAL</code> - the anomaly contains additional information about an insight or its causal anomaly.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of the reactive anomaly. It can be one of the following types.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CAUSAL</code> - the anomaly can cause a new insight.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONTEXTUAL</code> - the anomaly contains additional information about an insight or its causal
     *        anomaly.
     *        </p>
     *        </li>
     * @see AnomalyType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the reactive anomaly. It can be one of the following types.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAUSAL</code> - the anomaly can cause a new insight.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONTEXTUAL</code> - the anomaly contains additional information about an insight or its causal anomaly.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of the reactive anomaly. It can be one of the following types.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CAUSAL</code> - the anomaly can cause a new insight.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CONTEXTUAL</code> - the anomaly contains additional information about an insight or its causal
     *         anomaly.
     *         </p>
     *         </li>
     * @see AnomalyType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the reactive anomaly. It can be one of the following types.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAUSAL</code> - the anomaly can cause a new insight.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONTEXTUAL</code> - the anomaly contains additional information about an insight or its causal anomaly.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of the reactive anomaly. It can be one of the following types.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CAUSAL</code> - the anomaly can cause a new insight.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONTEXTUAL</code> - the anomaly contains additional information about an insight or its causal
     *        anomaly.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnomalyType
     */

    public ReactiveAnomaly withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the reactive anomaly. It can be one of the following types.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CAUSAL</code> - the anomaly can cause a new insight.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONTEXTUAL</code> - the anomaly contains additional information about an insight or its causal anomaly.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of the reactive anomaly. It can be one of the following types.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CAUSAL</code> - the anomaly can cause a new insight.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONTEXTUAL</code> - the anomaly contains additional information about an insight or its causal
     *        anomaly.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnomalyType
     */

    public ReactiveAnomaly withType(AnomalyType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the reactive anomaly.
     * </p>
     * 
     * @param name
     *        The name of the reactive anomaly.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the reactive anomaly.
     * </p>
     * 
     * @return The name of the reactive anomaly.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the reactive anomaly.
     * </p>
     * 
     * @param name
     *        The name of the reactive anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReactiveAnomaly withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the reactive anomaly.
     * </p>
     * 
     * @param description
     *        A description of the reactive anomaly.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the reactive anomaly.
     * </p>
     * 
     * @return A description of the reactive anomaly.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the reactive anomaly.
     * </p>
     * 
     * @param description
     *        A description of the reactive anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReactiveAnomaly withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of the causal anomaly that is associated with this reactive anomaly. The ID of a `CAUSAL` anomaly is
     * always `NULL`.
     * </p>
     * 
     * @param causalAnomalyId
     *        The ID of the causal anomaly that is associated with this reactive anomaly. The ID of a `CAUSAL` anomaly
     *        is always `NULL`.
     */

    public void setCausalAnomalyId(String causalAnomalyId) {
        this.causalAnomalyId = causalAnomalyId;
    }

    /**
     * <p>
     * The ID of the causal anomaly that is associated with this reactive anomaly. The ID of a `CAUSAL` anomaly is
     * always `NULL`.
     * </p>
     * 
     * @return The ID of the causal anomaly that is associated with this reactive anomaly. The ID of a `CAUSAL` anomaly
     *         is always `NULL`.
     */

    public String getCausalAnomalyId() {
        return this.causalAnomalyId;
    }

    /**
     * <p>
     * The ID of the causal anomaly that is associated with this reactive anomaly. The ID of a `CAUSAL` anomaly is
     * always `NULL`.
     * </p>
     * 
     * @param causalAnomalyId
     *        The ID of the causal anomaly that is associated with this reactive anomaly. The ID of a `CAUSAL` anomaly
     *        is always `NULL`.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReactiveAnomaly withCausalAnomalyId(String causalAnomalyId) {
        setCausalAnomalyId(causalAnomalyId);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services resources in which anomalous behavior was detected by DevOps Guru.
     * </p>
     * 
     * @return The Amazon Web Services resources in which anomalous behavior was detected by DevOps Guru.
     */

    public java.util.List<AnomalyResource> getAnomalyResources() {
        return anomalyResources;
    }

    /**
     * <p>
     * The Amazon Web Services resources in which anomalous behavior was detected by DevOps Guru.
     * </p>
     * 
     * @param anomalyResources
     *        The Amazon Web Services resources in which anomalous behavior was detected by DevOps Guru.
     */

    public void setAnomalyResources(java.util.Collection<AnomalyResource> anomalyResources) {
        if (anomalyResources == null) {
            this.anomalyResources = null;
            return;
        }

        this.anomalyResources = new java.util.ArrayList<AnomalyResource>(anomalyResources);
    }

    /**
     * <p>
     * The Amazon Web Services resources in which anomalous behavior was detected by DevOps Guru.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnomalyResources(java.util.Collection)} or {@link #withAnomalyResources(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param anomalyResources
     *        The Amazon Web Services resources in which anomalous behavior was detected by DevOps Guru.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReactiveAnomaly withAnomalyResources(AnomalyResource... anomalyResources) {
        if (this.anomalyResources == null) {
            setAnomalyResources(new java.util.ArrayList<AnomalyResource>(anomalyResources.length));
        }
        for (AnomalyResource ele : anomalyResources) {
            this.anomalyResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services resources in which anomalous behavior was detected by DevOps Guru.
     * </p>
     * 
     * @param anomalyResources
     *        The Amazon Web Services resources in which anomalous behavior was detected by DevOps Guru.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReactiveAnomaly withAnomalyResources(java.util.Collection<AnomalyResource> anomalyResources) {
        setAnomalyResources(anomalyResources);
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
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getAnomalyTimeRange() != null)
            sb.append("AnomalyTimeRange: ").append(getAnomalyTimeRange()).append(",");
        if (getAnomalyReportedTimeRange() != null)
            sb.append("AnomalyReportedTimeRange: ").append(getAnomalyReportedTimeRange()).append(",");
        if (getSourceDetails() != null)
            sb.append("SourceDetails: ").append(getSourceDetails()).append(",");
        if (getAssociatedInsightId() != null)
            sb.append("AssociatedInsightId: ").append(getAssociatedInsightId()).append(",");
        if (getResourceCollection() != null)
            sb.append("ResourceCollection: ").append(getResourceCollection()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCausalAnomalyId() != null)
            sb.append("CausalAnomalyId: ").append(getCausalAnomalyId()).append(",");
        if (getAnomalyResources() != null)
            sb.append("AnomalyResources: ").append(getAnomalyResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReactiveAnomaly == false)
            return false;
        ReactiveAnomaly other = (ReactiveAnomaly) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getAnomalyTimeRange() == null ^ this.getAnomalyTimeRange() == null)
            return false;
        if (other.getAnomalyTimeRange() != null && other.getAnomalyTimeRange().equals(this.getAnomalyTimeRange()) == false)
            return false;
        if (other.getAnomalyReportedTimeRange() == null ^ this.getAnomalyReportedTimeRange() == null)
            return false;
        if (other.getAnomalyReportedTimeRange() != null && other.getAnomalyReportedTimeRange().equals(this.getAnomalyReportedTimeRange()) == false)
            return false;
        if (other.getSourceDetails() == null ^ this.getSourceDetails() == null)
            return false;
        if (other.getSourceDetails() != null && other.getSourceDetails().equals(this.getSourceDetails()) == false)
            return false;
        if (other.getAssociatedInsightId() == null ^ this.getAssociatedInsightId() == null)
            return false;
        if (other.getAssociatedInsightId() != null && other.getAssociatedInsightId().equals(this.getAssociatedInsightId()) == false)
            return false;
        if (other.getResourceCollection() == null ^ this.getResourceCollection() == null)
            return false;
        if (other.getResourceCollection() != null && other.getResourceCollection().equals(this.getResourceCollection()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCausalAnomalyId() == null ^ this.getCausalAnomalyId() == null)
            return false;
        if (other.getCausalAnomalyId() != null && other.getCausalAnomalyId().equals(this.getCausalAnomalyId()) == false)
            return false;
        if (other.getAnomalyResources() == null ^ this.getAnomalyResources() == null)
            return false;
        if (other.getAnomalyResources() != null && other.getAnomalyResources().equals(this.getAnomalyResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getAnomalyTimeRange() == null) ? 0 : getAnomalyTimeRange().hashCode());
        hashCode = prime * hashCode + ((getAnomalyReportedTimeRange() == null) ? 0 : getAnomalyReportedTimeRange().hashCode());
        hashCode = prime * hashCode + ((getSourceDetails() == null) ? 0 : getSourceDetails().hashCode());
        hashCode = prime * hashCode + ((getAssociatedInsightId() == null) ? 0 : getAssociatedInsightId().hashCode());
        hashCode = prime * hashCode + ((getResourceCollection() == null) ? 0 : getResourceCollection().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCausalAnomalyId() == null) ? 0 : getCausalAnomalyId().hashCode());
        hashCode = prime * hashCode + ((getAnomalyResources() == null) ? 0 : getAnomalyResources().hashCode());
        return hashCode;
    }

    @Override
    public ReactiveAnomaly clone() {
        try {
            return (ReactiveAnomaly) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.ReactiveAnomalyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
