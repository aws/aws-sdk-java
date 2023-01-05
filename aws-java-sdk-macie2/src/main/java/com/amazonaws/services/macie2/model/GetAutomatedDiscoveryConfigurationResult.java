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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetAutomatedDiscoveryConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAutomatedDiscoveryConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The unique identifier for the classification scope that's used when performing automated sensitive data discovery
     * for the account. The classification scope specifies S3 buckets to exclude from automated sensitive data
     * discovery.
     * </p>
     */
    private String classificationScopeId;
    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when automated sensitive data discovery was most recently
     * disabled for the account. This value is null if automated sensitive data discovery wasn't enabled and
     * subsequently disabled for the account.
     * </p>
     */
    private java.util.Date disabledAt;
    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when automated sensitive data discovery was initially
     * enabled for the account. This value is null if automated sensitive data discovery has never been enabled for the
     * account.
     * </p>
     */
    private java.util.Date firstEnabledAt;
    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when automated sensitive data discovery was most recently
     * enabled or disabled for the account.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The unique identifier for the sensitivity inspection template that's used when performing automated sensitive
     * data discovery for the account. The template specifies which allow lists, custom data identifiers, and managed
     * data identifiers to use when analyzing data.
     * </p>
     */
    private String sensitivityInspectionTemplateId;
    /**
     * <p>
     * The current status of the automated sensitive data discovery configuration for the account. Possible values are:
     * ENABLED, use the specified settings to perform automated sensitive data discovery activities for the account;
     * and, DISABLED, don't perform automated sensitive data discovery activities for the account.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The unique identifier for the classification scope that's used when performing automated sensitive data discovery
     * for the account. The classification scope specifies S3 buckets to exclude from automated sensitive data
     * discovery.
     * </p>
     * 
     * @param classificationScopeId
     *        The unique identifier for the classification scope that's used when performing automated sensitive data
     *        discovery for the account. The classification scope specifies S3 buckets to exclude from automated
     *        sensitive data discovery.
     */

    public void setClassificationScopeId(String classificationScopeId) {
        this.classificationScopeId = classificationScopeId;
    }

    /**
     * <p>
     * The unique identifier for the classification scope that's used when performing automated sensitive data discovery
     * for the account. The classification scope specifies S3 buckets to exclude from automated sensitive data
     * discovery.
     * </p>
     * 
     * @return The unique identifier for the classification scope that's used when performing automated sensitive data
     *         discovery for the account. The classification scope specifies S3 buckets to exclude from automated
     *         sensitive data discovery.
     */

    public String getClassificationScopeId() {
        return this.classificationScopeId;
    }

    /**
     * <p>
     * The unique identifier for the classification scope that's used when performing automated sensitive data discovery
     * for the account. The classification scope specifies S3 buckets to exclude from automated sensitive data
     * discovery.
     * </p>
     * 
     * @param classificationScopeId
     *        The unique identifier for the classification scope that's used when performing automated sensitive data
     *        discovery for the account. The classification scope specifies S3 buckets to exclude from automated
     *        sensitive data discovery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAutomatedDiscoveryConfigurationResult withClassificationScopeId(String classificationScopeId) {
        setClassificationScopeId(classificationScopeId);
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when automated sensitive data discovery was most recently
     * disabled for the account. This value is null if automated sensitive data discovery wasn't enabled and
     * subsequently disabled for the account.
     * </p>
     * 
     * @param disabledAt
     *        The date and time, in UTC and extended ISO 8601 format, when automated sensitive data discovery was most
     *        recently disabled for the account. This value is null if automated sensitive data discovery wasn't enabled
     *        and subsequently disabled for the account.
     */

    public void setDisabledAt(java.util.Date disabledAt) {
        this.disabledAt = disabledAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when automated sensitive data discovery was most recently
     * disabled for the account. This value is null if automated sensitive data discovery wasn't enabled and
     * subsequently disabled for the account.
     * </p>
     * 
     * @return The date and time, in UTC and extended ISO 8601 format, when automated sensitive data discovery was most
     *         recently disabled for the account. This value is null if automated sensitive data discovery wasn't
     *         enabled and subsequently disabled for the account.
     */

    public java.util.Date getDisabledAt() {
        return this.disabledAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when automated sensitive data discovery was most recently
     * disabled for the account. This value is null if automated sensitive data discovery wasn't enabled and
     * subsequently disabled for the account.
     * </p>
     * 
     * @param disabledAt
     *        The date and time, in UTC and extended ISO 8601 format, when automated sensitive data discovery was most
     *        recently disabled for the account. This value is null if automated sensitive data discovery wasn't enabled
     *        and subsequently disabled for the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAutomatedDiscoveryConfigurationResult withDisabledAt(java.util.Date disabledAt) {
        setDisabledAt(disabledAt);
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when automated sensitive data discovery was initially
     * enabled for the account. This value is null if automated sensitive data discovery has never been enabled for the
     * account.
     * </p>
     * 
     * @param firstEnabledAt
     *        The date and time, in UTC and extended ISO 8601 format, when automated sensitive data discovery was
     *        initially enabled for the account. This value is null if automated sensitive data discovery has never been
     *        enabled for the account.
     */

    public void setFirstEnabledAt(java.util.Date firstEnabledAt) {
        this.firstEnabledAt = firstEnabledAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when automated sensitive data discovery was initially
     * enabled for the account. This value is null if automated sensitive data discovery has never been enabled for the
     * account.
     * </p>
     * 
     * @return The date and time, in UTC and extended ISO 8601 format, when automated sensitive data discovery was
     *         initially enabled for the account. This value is null if automated sensitive data discovery has never
     *         been enabled for the account.
     */

    public java.util.Date getFirstEnabledAt() {
        return this.firstEnabledAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when automated sensitive data discovery was initially
     * enabled for the account. This value is null if automated sensitive data discovery has never been enabled for the
     * account.
     * </p>
     * 
     * @param firstEnabledAt
     *        The date and time, in UTC and extended ISO 8601 format, when automated sensitive data discovery was
     *        initially enabled for the account. This value is null if automated sensitive data discovery has never been
     *        enabled for the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAutomatedDiscoveryConfigurationResult withFirstEnabledAt(java.util.Date firstEnabledAt) {
        setFirstEnabledAt(firstEnabledAt);
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when automated sensitive data discovery was most recently
     * enabled or disabled for the account.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date and time, in UTC and extended ISO 8601 format, when automated sensitive data discovery was most
     *        recently enabled or disabled for the account.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when automated sensitive data discovery was most recently
     * enabled or disabled for the account.
     * </p>
     * 
     * @return The date and time, in UTC and extended ISO 8601 format, when automated sensitive data discovery was most
     *         recently enabled or disabled for the account.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when automated sensitive data discovery was most recently
     * enabled or disabled for the account.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date and time, in UTC and extended ISO 8601 format, when automated sensitive data discovery was most
     *        recently enabled or disabled for the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAutomatedDiscoveryConfigurationResult withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the sensitivity inspection template that's used when performing automated sensitive
     * data discovery for the account. The template specifies which allow lists, custom data identifiers, and managed
     * data identifiers to use when analyzing data.
     * </p>
     * 
     * @param sensitivityInspectionTemplateId
     *        The unique identifier for the sensitivity inspection template that's used when performing automated
     *        sensitive data discovery for the account. The template specifies which allow lists, custom data
     *        identifiers, and managed data identifiers to use when analyzing data.
     */

    public void setSensitivityInspectionTemplateId(String sensitivityInspectionTemplateId) {
        this.sensitivityInspectionTemplateId = sensitivityInspectionTemplateId;
    }

    /**
     * <p>
     * The unique identifier for the sensitivity inspection template that's used when performing automated sensitive
     * data discovery for the account. The template specifies which allow lists, custom data identifiers, and managed
     * data identifiers to use when analyzing data.
     * </p>
     * 
     * @return The unique identifier for the sensitivity inspection template that's used when performing automated
     *         sensitive data discovery for the account. The template specifies which allow lists, custom data
     *         identifiers, and managed data identifiers to use when analyzing data.
     */

    public String getSensitivityInspectionTemplateId() {
        return this.sensitivityInspectionTemplateId;
    }

    /**
     * <p>
     * The unique identifier for the sensitivity inspection template that's used when performing automated sensitive
     * data discovery for the account. The template specifies which allow lists, custom data identifiers, and managed
     * data identifiers to use when analyzing data.
     * </p>
     * 
     * @param sensitivityInspectionTemplateId
     *        The unique identifier for the sensitivity inspection template that's used when performing automated
     *        sensitive data discovery for the account. The template specifies which allow lists, custom data
     *        identifiers, and managed data identifiers to use when analyzing data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAutomatedDiscoveryConfigurationResult withSensitivityInspectionTemplateId(String sensitivityInspectionTemplateId) {
        setSensitivityInspectionTemplateId(sensitivityInspectionTemplateId);
        return this;
    }

    /**
     * <p>
     * The current status of the automated sensitive data discovery configuration for the account. Possible values are:
     * ENABLED, use the specified settings to perform automated sensitive data discovery activities for the account;
     * and, DISABLED, don't perform automated sensitive data discovery activities for the account.
     * </p>
     * 
     * @param status
     *        The current status of the automated sensitive data discovery configuration for the account. Possible
     *        values are: ENABLED, use the specified settings to perform automated sensitive data discovery activities
     *        for the account; and, DISABLED, don't perform automated sensitive data discovery activities for the
     *        account.
     * @see AutomatedDiscoveryStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the automated sensitive data discovery configuration for the account. Possible values are:
     * ENABLED, use the specified settings to perform automated sensitive data discovery activities for the account;
     * and, DISABLED, don't perform automated sensitive data discovery activities for the account.
     * </p>
     * 
     * @return The current status of the automated sensitive data discovery configuration for the account. Possible
     *         values are: ENABLED, use the specified settings to perform automated sensitive data discovery activities
     *         for the account; and, DISABLED, don't perform automated sensitive data discovery activities for the
     *         account.
     * @see AutomatedDiscoveryStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the automated sensitive data discovery configuration for the account. Possible values are:
     * ENABLED, use the specified settings to perform automated sensitive data discovery activities for the account;
     * and, DISABLED, don't perform automated sensitive data discovery activities for the account.
     * </p>
     * 
     * @param status
     *        The current status of the automated sensitive data discovery configuration for the account. Possible
     *        values are: ENABLED, use the specified settings to perform automated sensitive data discovery activities
     *        for the account; and, DISABLED, don't perform automated sensitive data discovery activities for the
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutomatedDiscoveryStatus
     */

    public GetAutomatedDiscoveryConfigurationResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the automated sensitive data discovery configuration for the account. Possible values are:
     * ENABLED, use the specified settings to perform automated sensitive data discovery activities for the account;
     * and, DISABLED, don't perform automated sensitive data discovery activities for the account.
     * </p>
     * 
     * @param status
     *        The current status of the automated sensitive data discovery configuration for the account. Possible
     *        values are: ENABLED, use the specified settings to perform automated sensitive data discovery activities
     *        for the account; and, DISABLED, don't perform automated sensitive data discovery activities for the
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutomatedDiscoveryStatus
     */

    public GetAutomatedDiscoveryConfigurationResult withStatus(AutomatedDiscoveryStatus status) {
        this.status = status.toString();
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
        if (getClassificationScopeId() != null)
            sb.append("ClassificationScopeId: ").append(getClassificationScopeId()).append(",");
        if (getDisabledAt() != null)
            sb.append("DisabledAt: ").append(getDisabledAt()).append(",");
        if (getFirstEnabledAt() != null)
            sb.append("FirstEnabledAt: ").append(getFirstEnabledAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getSensitivityInspectionTemplateId() != null)
            sb.append("SensitivityInspectionTemplateId: ").append(getSensitivityInspectionTemplateId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAutomatedDiscoveryConfigurationResult == false)
            return false;
        GetAutomatedDiscoveryConfigurationResult other = (GetAutomatedDiscoveryConfigurationResult) obj;
        if (other.getClassificationScopeId() == null ^ this.getClassificationScopeId() == null)
            return false;
        if (other.getClassificationScopeId() != null && other.getClassificationScopeId().equals(this.getClassificationScopeId()) == false)
            return false;
        if (other.getDisabledAt() == null ^ this.getDisabledAt() == null)
            return false;
        if (other.getDisabledAt() != null && other.getDisabledAt().equals(this.getDisabledAt()) == false)
            return false;
        if (other.getFirstEnabledAt() == null ^ this.getFirstEnabledAt() == null)
            return false;
        if (other.getFirstEnabledAt() != null && other.getFirstEnabledAt().equals(this.getFirstEnabledAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getSensitivityInspectionTemplateId() == null ^ this.getSensitivityInspectionTemplateId() == null)
            return false;
        if (other.getSensitivityInspectionTemplateId() != null
                && other.getSensitivityInspectionTemplateId().equals(this.getSensitivityInspectionTemplateId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClassificationScopeId() == null) ? 0 : getClassificationScopeId().hashCode());
        hashCode = prime * hashCode + ((getDisabledAt() == null) ? 0 : getDisabledAt().hashCode());
        hashCode = prime * hashCode + ((getFirstEnabledAt() == null) ? 0 : getFirstEnabledAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getSensitivityInspectionTemplateId() == null) ? 0 : getSensitivityInspectionTemplateId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public GetAutomatedDiscoveryConfigurationResult clone() {
        try {
            return (GetAutomatedDiscoveryConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
