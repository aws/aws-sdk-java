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
 * Details about a proactive insight. This object is returned by <code>DescribeInsight</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ProactiveOrganizationInsightSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProactiveOrganizationInsightSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the insight summary.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ID of the Amazon Web Services account.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The ID of the organizational unit.
     * </p>
     */
    private String organizationalUnitId;
    /**
     * <p>
     * The name of the insight summary.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An array of severity values used to search for insights. For more information, see <a href=
     * "https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities"
     * >Understanding insight severities</a> in the <i>Amazon DevOps Guru User Guide</i>.
     * </p>
     */
    private String severity;
    /**
     * <p>
     * An array of status values used to search for insights.
     * </p>
     */
    private String status;

    private InsightTimeRange insightTimeRange;

    private PredictionTimeRange predictionTimeRange;

    private ResourceCollection resourceCollection;

    private ServiceCollection serviceCollection;

    /**
     * <p>
     * The ID of the insight summary.
     * </p>
     * 
     * @param id
     *        The ID of the insight summary.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the insight summary.
     * </p>
     * 
     * @return The ID of the insight summary.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the insight summary.
     * </p>
     * 
     * @param id
     *        The ID of the insight summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProactiveOrganizationInsightSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account.
     * </p>
     * 
     * @param accountId
     *        The ID of the Amazon Web Services account.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account.
     * </p>
     * 
     * @param accountId
     *        The ID of the Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProactiveOrganizationInsightSummary withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The ID of the organizational unit.
     * </p>
     * 
     * @param organizationalUnitId
     *        The ID of the organizational unit.
     */

    public void setOrganizationalUnitId(String organizationalUnitId) {
        this.organizationalUnitId = organizationalUnitId;
    }

    /**
     * <p>
     * The ID of the organizational unit.
     * </p>
     * 
     * @return The ID of the organizational unit.
     */

    public String getOrganizationalUnitId() {
        return this.organizationalUnitId;
    }

    /**
     * <p>
     * The ID of the organizational unit.
     * </p>
     * 
     * @param organizationalUnitId
     *        The ID of the organizational unit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProactiveOrganizationInsightSummary withOrganizationalUnitId(String organizationalUnitId) {
        setOrganizationalUnitId(organizationalUnitId);
        return this;
    }

    /**
     * <p>
     * The name of the insight summary.
     * </p>
     * 
     * @param name
     *        The name of the insight summary.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the insight summary.
     * </p>
     * 
     * @return The name of the insight summary.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the insight summary.
     * </p>
     * 
     * @param name
     *        The name of the insight summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProactiveOrganizationInsightSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An array of severity values used to search for insights. For more information, see <a href=
     * "https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities"
     * >Understanding insight severities</a> in the <i>Amazon DevOps Guru User Guide</i>.
     * </p>
     * 
     * @param severity
     *        An array of severity values used to search for insights. For more information, see <a href=
     *        "https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities"
     *        >Understanding insight severities</a> in the <i>Amazon DevOps Guru User Guide</i>.
     * @see InsightSeverity
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * An array of severity values used to search for insights. For more information, see <a href=
     * "https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities"
     * >Understanding insight severities</a> in the <i>Amazon DevOps Guru User Guide</i>.
     * </p>
     * 
     * @return An array of severity values used to search for insights. For more information, see <a href=
     *         "https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities"
     *         >Understanding insight severities</a> in the <i>Amazon DevOps Guru User Guide</i>.
     * @see InsightSeverity
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * An array of severity values used to search for insights. For more information, see <a href=
     * "https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities"
     * >Understanding insight severities</a> in the <i>Amazon DevOps Guru User Guide</i>.
     * </p>
     * 
     * @param severity
     *        An array of severity values used to search for insights. For more information, see <a href=
     *        "https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities"
     *        >Understanding insight severities</a> in the <i>Amazon DevOps Guru User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightSeverity
     */

    public ProactiveOrganizationInsightSummary withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * An array of severity values used to search for insights. For more information, see <a href=
     * "https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities"
     * >Understanding insight severities</a> in the <i>Amazon DevOps Guru User Guide</i>.
     * </p>
     * 
     * @param severity
     *        An array of severity values used to search for insights. For more information, see <a href=
     *        "https://docs.aws.amazon.com/devops-guru/latest/userguide/working-with-insights.html#understanding-insights-severities"
     *        >Understanding insight severities</a> in the <i>Amazon DevOps Guru User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightSeverity
     */

    public ProactiveOrganizationInsightSummary withSeverity(InsightSeverity severity) {
        this.severity = severity.toString();
        return this;
    }

    /**
     * <p>
     * An array of status values used to search for insights.
     * </p>
     * 
     * @param status
     *        An array of status values used to search for insights.
     * @see InsightStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * An array of status values used to search for insights.
     * </p>
     * 
     * @return An array of status values used to search for insights.
     * @see InsightStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * An array of status values used to search for insights.
     * </p>
     * 
     * @param status
     *        An array of status values used to search for insights.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightStatus
     */

    public ProactiveOrganizationInsightSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * An array of status values used to search for insights.
     * </p>
     * 
     * @param status
     *        An array of status values used to search for insights.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightStatus
     */

    public ProactiveOrganizationInsightSummary withStatus(InsightStatus status) {
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

    public ProactiveOrganizationInsightSummary withInsightTimeRange(InsightTimeRange insightTimeRange) {
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

    public ProactiveOrganizationInsightSummary withPredictionTimeRange(PredictionTimeRange predictionTimeRange) {
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

    public ProactiveOrganizationInsightSummary withResourceCollection(ResourceCollection resourceCollection) {
        setResourceCollection(resourceCollection);
        return this;
    }

    /**
     * @param serviceCollection
     */

    public void setServiceCollection(ServiceCollection serviceCollection) {
        this.serviceCollection = serviceCollection;
    }

    /**
     * @return
     */

    public ServiceCollection getServiceCollection() {
        return this.serviceCollection;
    }

    /**
     * @param serviceCollection
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProactiveOrganizationInsightSummary withServiceCollection(ServiceCollection serviceCollection) {
        setServiceCollection(serviceCollection);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getOrganizationalUnitId() != null)
            sb.append("OrganizationalUnitId: ").append(getOrganizationalUnitId()).append(",");
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
        if (getServiceCollection() != null)
            sb.append("ServiceCollection: ").append(getServiceCollection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProactiveOrganizationInsightSummary == false)
            return false;
        ProactiveOrganizationInsightSummary other = (ProactiveOrganizationInsightSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getOrganizationalUnitId() == null ^ this.getOrganizationalUnitId() == null)
            return false;
        if (other.getOrganizationalUnitId() != null && other.getOrganizationalUnitId().equals(this.getOrganizationalUnitId()) == false)
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
        if (other.getServiceCollection() == null ^ this.getServiceCollection() == null)
            return false;
        if (other.getServiceCollection() != null && other.getServiceCollection().equals(this.getServiceCollection()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getOrganizationalUnitId() == null) ? 0 : getOrganizationalUnitId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getInsightTimeRange() == null) ? 0 : getInsightTimeRange().hashCode());
        hashCode = prime * hashCode + ((getPredictionTimeRange() == null) ? 0 : getPredictionTimeRange().hashCode());
        hashCode = prime * hashCode + ((getResourceCollection() == null) ? 0 : getResourceCollection().hashCode());
        hashCode = prime * hashCode + ((getServiceCollection() == null) ? 0 : getServiceCollection().hashCode());
        return hashCode;
    }

    @Override
    public ProactiveOrganizationInsightSummary clone() {
        try {
            return (ProactiveOrganizationInsightSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.ProactiveOrganizationInsightSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
