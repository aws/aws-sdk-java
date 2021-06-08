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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details describing an incident record.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/IncidentRecordSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IncidentRecordSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The time the incident was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Defines the impact to customers and applications.
     * </p>
     */
    private Integer impact;
    /**
     * <p>
     * What caused Incident Manager to create the incident.
     * </p>
     */
    private IncidentRecordSource incidentRecordSource;
    /**
     * <p>
     * The time the incident was resolved.
     * </p>
     */
    private java.util.Date resolvedTime;
    /**
     * <p>
     * The current status of the incident.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The title of the incident. This value is either provided by the response plan or overwritten on creation.
     * </p>
     */
    private String title;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the incident.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the incident.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the incident.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncidentRecordSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The time the incident was created.
     * </p>
     * 
     * @param creationTime
     *        The time the incident was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the incident was created.
     * </p>
     * 
     * @return The time the incident was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time the incident was created.
     * </p>
     * 
     * @param creationTime
     *        The time the incident was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncidentRecordSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Defines the impact to customers and applications.
     * </p>
     * 
     * @param impact
     *        Defines the impact to customers and applications.
     */

    public void setImpact(Integer impact) {
        this.impact = impact;
    }

    /**
     * <p>
     * Defines the impact to customers and applications.
     * </p>
     * 
     * @return Defines the impact to customers and applications.
     */

    public Integer getImpact() {
        return this.impact;
    }

    /**
     * <p>
     * Defines the impact to customers and applications.
     * </p>
     * 
     * @param impact
     *        Defines the impact to customers and applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncidentRecordSummary withImpact(Integer impact) {
        setImpact(impact);
        return this;
    }

    /**
     * <p>
     * What caused Incident Manager to create the incident.
     * </p>
     * 
     * @param incidentRecordSource
     *        What caused Incident Manager to create the incident.
     */

    public void setIncidentRecordSource(IncidentRecordSource incidentRecordSource) {
        this.incidentRecordSource = incidentRecordSource;
    }

    /**
     * <p>
     * What caused Incident Manager to create the incident.
     * </p>
     * 
     * @return What caused Incident Manager to create the incident.
     */

    public IncidentRecordSource getIncidentRecordSource() {
        return this.incidentRecordSource;
    }

    /**
     * <p>
     * What caused Incident Manager to create the incident.
     * </p>
     * 
     * @param incidentRecordSource
     *        What caused Incident Manager to create the incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncidentRecordSummary withIncidentRecordSource(IncidentRecordSource incidentRecordSource) {
        setIncidentRecordSource(incidentRecordSource);
        return this;
    }

    /**
     * <p>
     * The time the incident was resolved.
     * </p>
     * 
     * @param resolvedTime
     *        The time the incident was resolved.
     */

    public void setResolvedTime(java.util.Date resolvedTime) {
        this.resolvedTime = resolvedTime;
    }

    /**
     * <p>
     * The time the incident was resolved.
     * </p>
     * 
     * @return The time the incident was resolved.
     */

    public java.util.Date getResolvedTime() {
        return this.resolvedTime;
    }

    /**
     * <p>
     * The time the incident was resolved.
     * </p>
     * 
     * @param resolvedTime
     *        The time the incident was resolved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncidentRecordSummary withResolvedTime(java.util.Date resolvedTime) {
        setResolvedTime(resolvedTime);
        return this;
    }

    /**
     * <p>
     * The current status of the incident.
     * </p>
     * 
     * @param status
     *        The current status of the incident.
     * @see IncidentRecordStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the incident.
     * </p>
     * 
     * @return The current status of the incident.
     * @see IncidentRecordStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the incident.
     * </p>
     * 
     * @param status
     *        The current status of the incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IncidentRecordStatus
     */

    public IncidentRecordSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the incident.
     * </p>
     * 
     * @param status
     *        The current status of the incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IncidentRecordStatus
     */

    public IncidentRecordSummary withStatus(IncidentRecordStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The title of the incident. This value is either provided by the response plan or overwritten on creation.
     * </p>
     * 
     * @param title
     *        The title of the incident. This value is either provided by the response plan or overwritten on creation.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the incident. This value is either provided by the response plan or overwritten on creation.
     * </p>
     * 
     * @return The title of the incident. This value is either provided by the response plan or overwritten on creation.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the incident. This value is either provided by the response plan or overwritten on creation.
     * </p>
     * 
     * @param title
     *        The title of the incident. This value is either provided by the response plan or overwritten on creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncidentRecordSummary withTitle(String title) {
        setTitle(title);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getImpact() != null)
            sb.append("Impact: ").append(getImpact()).append(",");
        if (getIncidentRecordSource() != null)
            sb.append("IncidentRecordSource: ").append(getIncidentRecordSource()).append(",");
        if (getResolvedTime() != null)
            sb.append("ResolvedTime: ").append(getResolvedTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IncidentRecordSummary == false)
            return false;
        IncidentRecordSummary other = (IncidentRecordSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getImpact() == null ^ this.getImpact() == null)
            return false;
        if (other.getImpact() != null && other.getImpact().equals(this.getImpact()) == false)
            return false;
        if (other.getIncidentRecordSource() == null ^ this.getIncidentRecordSource() == null)
            return false;
        if (other.getIncidentRecordSource() != null && other.getIncidentRecordSource().equals(this.getIncidentRecordSource()) == false)
            return false;
        if (other.getResolvedTime() == null ^ this.getResolvedTime() == null)
            return false;
        if (other.getResolvedTime() != null && other.getResolvedTime().equals(this.getResolvedTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getImpact() == null) ? 0 : getImpact().hashCode());
        hashCode = prime * hashCode + ((getIncidentRecordSource() == null) ? 0 : getIncidentRecordSource().hashCode());
        hashCode = prime * hashCode + ((getResolvedTime() == null) ? 0 : getResolvedTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        return hashCode;
    }

    @Override
    public IncidentRecordSummary clone() {
        try {
            return (IncidentRecordSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmincidents.model.transform.IncidentRecordSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
