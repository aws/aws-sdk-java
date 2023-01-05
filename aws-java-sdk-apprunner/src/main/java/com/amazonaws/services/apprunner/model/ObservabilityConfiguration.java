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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an App Runner observability configuration resource. Multiple revisions of a configuration have the same
 * <code>ObservabilityConfigurationName</code> and different <code>ObservabilityConfigurationRevision</code> values.
 * </p>
 * <p>
 * The resource is designed to configure multiple features (currently one feature, tracing). This type contains optional
 * members that describe the configuration of these features (currently one member, <code>TraceConfiguration</code>). If
 * a feature member isn't specified, the feature isn't enabled.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/ObservabilityConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ObservabilityConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this observability configuration.
     * </p>
     */
    private String observabilityConfigurationArn;
    /**
     * <p>
     * The customer-provided observability configuration name. It can be used in multiple revisions of a configuration.
     * </p>
     */
    private String observabilityConfigurationName;
    /**
     * <p>
     * The configuration of the tracing feature within this observability configuration. If not specified, tracing isn't
     * enabled.
     * </p>
     */
    private TraceConfiguration traceConfiguration;
    /**
     * <p>
     * The revision of this observability configuration. It's unique among all the active configurations (
     * <code>"Status": "ACTIVE"</code>) that share the same <code>ObservabilityConfigurationName</code>.
     * </p>
     */
    private Integer observabilityConfigurationRevision;
    /**
     * <p>
     * It's set to <code>true</code> for the configuration with the highest <code>Revision</code> among all
     * configurations that share the same <code>ObservabilityConfigurationName</code>. It's set to <code>false</code>
     * otherwise.
     * </p>
     */
    private Boolean latest;
    /**
     * <p>
     * The current state of the observability configuration. If the status of a configuration revision is
     * <code>INACTIVE</code>, it was deleted and can't be used. Inactive configuration revisions are permanently removed
     * some time after they are deleted.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The time when the observability configuration was created. It's in Unix time stamp format.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The time when the observability configuration was deleted. It's in Unix time stamp format.
     * </p>
     */
    private java.util.Date deletedAt;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this observability configuration.
     * </p>
     * 
     * @param observabilityConfigurationArn
     *        The Amazon Resource Name (ARN) of this observability configuration.
     */

    public void setObservabilityConfigurationArn(String observabilityConfigurationArn) {
        this.observabilityConfigurationArn = observabilityConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this observability configuration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of this observability configuration.
     */

    public String getObservabilityConfigurationArn() {
        return this.observabilityConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this observability configuration.
     * </p>
     * 
     * @param observabilityConfigurationArn
     *        The Amazon Resource Name (ARN) of this observability configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObservabilityConfiguration withObservabilityConfigurationArn(String observabilityConfigurationArn) {
        setObservabilityConfigurationArn(observabilityConfigurationArn);
        return this;
    }

    /**
     * <p>
     * The customer-provided observability configuration name. It can be used in multiple revisions of a configuration.
     * </p>
     * 
     * @param observabilityConfigurationName
     *        The customer-provided observability configuration name. It can be used in multiple revisions of a
     *        configuration.
     */

    public void setObservabilityConfigurationName(String observabilityConfigurationName) {
        this.observabilityConfigurationName = observabilityConfigurationName;
    }

    /**
     * <p>
     * The customer-provided observability configuration name. It can be used in multiple revisions of a configuration.
     * </p>
     * 
     * @return The customer-provided observability configuration name. It can be used in multiple revisions of a
     *         configuration.
     */

    public String getObservabilityConfigurationName() {
        return this.observabilityConfigurationName;
    }

    /**
     * <p>
     * The customer-provided observability configuration name. It can be used in multiple revisions of a configuration.
     * </p>
     * 
     * @param observabilityConfigurationName
     *        The customer-provided observability configuration name. It can be used in multiple revisions of a
     *        configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObservabilityConfiguration withObservabilityConfigurationName(String observabilityConfigurationName) {
        setObservabilityConfigurationName(observabilityConfigurationName);
        return this;
    }

    /**
     * <p>
     * The configuration of the tracing feature within this observability configuration. If not specified, tracing isn't
     * enabled.
     * </p>
     * 
     * @param traceConfiguration
     *        The configuration of the tracing feature within this observability configuration. If not specified,
     *        tracing isn't enabled.
     */

    public void setTraceConfiguration(TraceConfiguration traceConfiguration) {
        this.traceConfiguration = traceConfiguration;
    }

    /**
     * <p>
     * The configuration of the tracing feature within this observability configuration. If not specified, tracing isn't
     * enabled.
     * </p>
     * 
     * @return The configuration of the tracing feature within this observability configuration. If not specified,
     *         tracing isn't enabled.
     */

    public TraceConfiguration getTraceConfiguration() {
        return this.traceConfiguration;
    }

    /**
     * <p>
     * The configuration of the tracing feature within this observability configuration. If not specified, tracing isn't
     * enabled.
     * </p>
     * 
     * @param traceConfiguration
     *        The configuration of the tracing feature within this observability configuration. If not specified,
     *        tracing isn't enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObservabilityConfiguration withTraceConfiguration(TraceConfiguration traceConfiguration) {
        setTraceConfiguration(traceConfiguration);
        return this;
    }

    /**
     * <p>
     * The revision of this observability configuration. It's unique among all the active configurations (
     * <code>"Status": "ACTIVE"</code>) that share the same <code>ObservabilityConfigurationName</code>.
     * </p>
     * 
     * @param observabilityConfigurationRevision
     *        The revision of this observability configuration. It's unique among all the active configurations (
     *        <code>"Status": "ACTIVE"</code>) that share the same <code>ObservabilityConfigurationName</code>.
     */

    public void setObservabilityConfigurationRevision(Integer observabilityConfigurationRevision) {
        this.observabilityConfigurationRevision = observabilityConfigurationRevision;
    }

    /**
     * <p>
     * The revision of this observability configuration. It's unique among all the active configurations (
     * <code>"Status": "ACTIVE"</code>) that share the same <code>ObservabilityConfigurationName</code>.
     * </p>
     * 
     * @return The revision of this observability configuration. It's unique among all the active configurations (
     *         <code>"Status": "ACTIVE"</code>) that share the same <code>ObservabilityConfigurationName</code>.
     */

    public Integer getObservabilityConfigurationRevision() {
        return this.observabilityConfigurationRevision;
    }

    /**
     * <p>
     * The revision of this observability configuration. It's unique among all the active configurations (
     * <code>"Status": "ACTIVE"</code>) that share the same <code>ObservabilityConfigurationName</code>.
     * </p>
     * 
     * @param observabilityConfigurationRevision
     *        The revision of this observability configuration. It's unique among all the active configurations (
     *        <code>"Status": "ACTIVE"</code>) that share the same <code>ObservabilityConfigurationName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObservabilityConfiguration withObservabilityConfigurationRevision(Integer observabilityConfigurationRevision) {
        setObservabilityConfigurationRevision(observabilityConfigurationRevision);
        return this;
    }

    /**
     * <p>
     * It's set to <code>true</code> for the configuration with the highest <code>Revision</code> among all
     * configurations that share the same <code>ObservabilityConfigurationName</code>. It's set to <code>false</code>
     * otherwise.
     * </p>
     * 
     * @param latest
     *        It's set to <code>true</code> for the configuration with the highest <code>Revision</code> among all
     *        configurations that share the same <code>ObservabilityConfigurationName</code>. It's set to
     *        <code>false</code> otherwise.
     */

    public void setLatest(Boolean latest) {
        this.latest = latest;
    }

    /**
     * <p>
     * It's set to <code>true</code> for the configuration with the highest <code>Revision</code> among all
     * configurations that share the same <code>ObservabilityConfigurationName</code>. It's set to <code>false</code>
     * otherwise.
     * </p>
     * 
     * @return It's set to <code>true</code> for the configuration with the highest <code>Revision</code> among all
     *         configurations that share the same <code>ObservabilityConfigurationName</code>. It's set to
     *         <code>false</code> otherwise.
     */

    public Boolean getLatest() {
        return this.latest;
    }

    /**
     * <p>
     * It's set to <code>true</code> for the configuration with the highest <code>Revision</code> among all
     * configurations that share the same <code>ObservabilityConfigurationName</code>. It's set to <code>false</code>
     * otherwise.
     * </p>
     * 
     * @param latest
     *        It's set to <code>true</code> for the configuration with the highest <code>Revision</code> among all
     *        configurations that share the same <code>ObservabilityConfigurationName</code>. It's set to
     *        <code>false</code> otherwise.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObservabilityConfiguration withLatest(Boolean latest) {
        setLatest(latest);
        return this;
    }

    /**
     * <p>
     * It's set to <code>true</code> for the configuration with the highest <code>Revision</code> among all
     * configurations that share the same <code>ObservabilityConfigurationName</code>. It's set to <code>false</code>
     * otherwise.
     * </p>
     * 
     * @return It's set to <code>true</code> for the configuration with the highest <code>Revision</code> among all
     *         configurations that share the same <code>ObservabilityConfigurationName</code>. It's set to
     *         <code>false</code> otherwise.
     */

    public Boolean isLatest() {
        return this.latest;
    }

    /**
     * <p>
     * The current state of the observability configuration. If the status of a configuration revision is
     * <code>INACTIVE</code>, it was deleted and can't be used. Inactive configuration revisions are permanently removed
     * some time after they are deleted.
     * </p>
     * 
     * @param status
     *        The current state of the observability configuration. If the status of a configuration revision is
     *        <code>INACTIVE</code>, it was deleted and can't be used. Inactive configuration revisions are permanently
     *        removed some time after they are deleted.
     * @see ObservabilityConfigurationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the observability configuration. If the status of a configuration revision is
     * <code>INACTIVE</code>, it was deleted and can't be used. Inactive configuration revisions are permanently removed
     * some time after they are deleted.
     * </p>
     * 
     * @return The current state of the observability configuration. If the status of a configuration revision is
     *         <code>INACTIVE</code>, it was deleted and can't be used. Inactive configuration revisions are permanently
     *         removed some time after they are deleted.
     * @see ObservabilityConfigurationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current state of the observability configuration. If the status of a configuration revision is
     * <code>INACTIVE</code>, it was deleted and can't be used. Inactive configuration revisions are permanently removed
     * some time after they are deleted.
     * </p>
     * 
     * @param status
     *        The current state of the observability configuration. If the status of a configuration revision is
     *        <code>INACTIVE</code>, it was deleted and can't be used. Inactive configuration revisions are permanently
     *        removed some time after they are deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObservabilityConfigurationStatus
     */

    public ObservabilityConfiguration withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current state of the observability configuration. If the status of a configuration revision is
     * <code>INACTIVE</code>, it was deleted and can't be used. Inactive configuration revisions are permanently removed
     * some time after they are deleted.
     * </p>
     * 
     * @param status
     *        The current state of the observability configuration. If the status of a configuration revision is
     *        <code>INACTIVE</code>, it was deleted and can't be used. Inactive configuration revisions are permanently
     *        removed some time after they are deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObservabilityConfigurationStatus
     */

    public ObservabilityConfiguration withStatus(ObservabilityConfigurationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time when the observability configuration was created. It's in Unix time stamp format.
     * </p>
     * 
     * @param createdAt
     *        The time when the observability configuration was created. It's in Unix time stamp format.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time when the observability configuration was created. It's in Unix time stamp format.
     * </p>
     * 
     * @return The time when the observability configuration was created. It's in Unix time stamp format.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time when the observability configuration was created. It's in Unix time stamp format.
     * </p>
     * 
     * @param createdAt
     *        The time when the observability configuration was created. It's in Unix time stamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObservabilityConfiguration withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The time when the observability configuration was deleted. It's in Unix time stamp format.
     * </p>
     * 
     * @param deletedAt
     *        The time when the observability configuration was deleted. It's in Unix time stamp format.
     */

    public void setDeletedAt(java.util.Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    /**
     * <p>
     * The time when the observability configuration was deleted. It's in Unix time stamp format.
     * </p>
     * 
     * @return The time when the observability configuration was deleted. It's in Unix time stamp format.
     */

    public java.util.Date getDeletedAt() {
        return this.deletedAt;
    }

    /**
     * <p>
     * The time when the observability configuration was deleted. It's in Unix time stamp format.
     * </p>
     * 
     * @param deletedAt
     *        The time when the observability configuration was deleted. It's in Unix time stamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObservabilityConfiguration withDeletedAt(java.util.Date deletedAt) {
        setDeletedAt(deletedAt);
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
        if (getObservabilityConfigurationArn() != null)
            sb.append("ObservabilityConfigurationArn: ").append(getObservabilityConfigurationArn()).append(",");
        if (getObservabilityConfigurationName() != null)
            sb.append("ObservabilityConfigurationName: ").append(getObservabilityConfigurationName()).append(",");
        if (getTraceConfiguration() != null)
            sb.append("TraceConfiguration: ").append(getTraceConfiguration()).append(",");
        if (getObservabilityConfigurationRevision() != null)
            sb.append("ObservabilityConfigurationRevision: ").append(getObservabilityConfigurationRevision()).append(",");
        if (getLatest() != null)
            sb.append("Latest: ").append(getLatest()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDeletedAt() != null)
            sb.append("DeletedAt: ").append(getDeletedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ObservabilityConfiguration == false)
            return false;
        ObservabilityConfiguration other = (ObservabilityConfiguration) obj;
        if (other.getObservabilityConfigurationArn() == null ^ this.getObservabilityConfigurationArn() == null)
            return false;
        if (other.getObservabilityConfigurationArn() != null
                && other.getObservabilityConfigurationArn().equals(this.getObservabilityConfigurationArn()) == false)
            return false;
        if (other.getObservabilityConfigurationName() == null ^ this.getObservabilityConfigurationName() == null)
            return false;
        if (other.getObservabilityConfigurationName() != null
                && other.getObservabilityConfigurationName().equals(this.getObservabilityConfigurationName()) == false)
            return false;
        if (other.getTraceConfiguration() == null ^ this.getTraceConfiguration() == null)
            return false;
        if (other.getTraceConfiguration() != null && other.getTraceConfiguration().equals(this.getTraceConfiguration()) == false)
            return false;
        if (other.getObservabilityConfigurationRevision() == null ^ this.getObservabilityConfigurationRevision() == null)
            return false;
        if (other.getObservabilityConfigurationRevision() != null
                && other.getObservabilityConfigurationRevision().equals(this.getObservabilityConfigurationRevision()) == false)
            return false;
        if (other.getLatest() == null ^ this.getLatest() == null)
            return false;
        if (other.getLatest() != null && other.getLatest().equals(this.getLatest()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDeletedAt() == null ^ this.getDeletedAt() == null)
            return false;
        if (other.getDeletedAt() != null && other.getDeletedAt().equals(this.getDeletedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getObservabilityConfigurationArn() == null) ? 0 : getObservabilityConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getObservabilityConfigurationName() == null) ? 0 : getObservabilityConfigurationName().hashCode());
        hashCode = prime * hashCode + ((getTraceConfiguration() == null) ? 0 : getTraceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getObservabilityConfigurationRevision() == null) ? 0 : getObservabilityConfigurationRevision().hashCode());
        hashCode = prime * hashCode + ((getLatest() == null) ? 0 : getLatest().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDeletedAt() == null) ? 0 : getDeletedAt().hashCode());
        return hashCode;
    }

    @Override
    public ObservabilityConfiguration clone() {
        try {
            return (ObservabilityConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apprunner.model.transform.ObservabilityConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
