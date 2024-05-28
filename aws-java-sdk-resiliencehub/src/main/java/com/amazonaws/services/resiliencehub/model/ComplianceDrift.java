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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Indicates the compliance drifts (recovery time objective (RTO) and recovery point objective (RPO)) that were detected
 * for an assessed entity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ComplianceDrift" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComplianceDrift implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Assessment identifier that is associated with this drift item.
     * </p>
     */
    private String actualReferenceId;
    /**
     * <p>
     * Actual compliance value of the entity.
     * </p>
     */
    private java.util.Map<String, DisruptionCompliance> actualValue;
    /**
     * <p>
     * Identifier of your application.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * Published version of your application on which drift was detected.
     * </p>
     */
    private String appVersion;
    /**
     * <p>
     * Difference type between actual and expected recovery point objective (RPO) and recovery time objective (RTO)
     * values. Currently, Resilience Hub supports only <b>NotEqual</b> difference type.
     * </p>
     */
    private String diffType;
    /**
     * <p>
     * The type of drift detected. Currently, Resilience Hub supports only <b>ApplicationCompliance</b> drift type.
     * </p>
     */
    private String driftType;
    /**
     * <p>
     * Identifier of an entity in which drift was detected. For compliance drift, the entity ID can be either
     * application ID or the AppComponent ID.
     * </p>
     */
    private String entityId;
    /**
     * <p>
     * The type of entity in which drift was detected. For compliance drifts, Resilience Hub supports
     * <code>AWS::ResilienceHub::AppComponent</code> and <code>AWS::ResilienceHub::Application</code>.
     * </p>
     */
    private String entityType;
    /**
     * <p>
     * Assessment identifier of a previous assessment of the same application version. Resilience Hub uses the previous
     * assessment (associated with the reference identifier) to compare the compliance with the current assessment to
     * identify drifts.
     * </p>
     */
    private String expectedReferenceId;
    /**
     * <p>
     * The expected compliance value of an entity.
     * </p>
     */
    private java.util.Map<String, DisruptionCompliance> expectedValue;

    /**
     * <p>
     * Assessment identifier that is associated with this drift item.
     * </p>
     * 
     * @param actualReferenceId
     *        Assessment identifier that is associated with this drift item.
     */

    public void setActualReferenceId(String actualReferenceId) {
        this.actualReferenceId = actualReferenceId;
    }

    /**
     * <p>
     * Assessment identifier that is associated with this drift item.
     * </p>
     * 
     * @return Assessment identifier that is associated with this drift item.
     */

    public String getActualReferenceId() {
        return this.actualReferenceId;
    }

    /**
     * <p>
     * Assessment identifier that is associated with this drift item.
     * </p>
     * 
     * @param actualReferenceId
     *        Assessment identifier that is associated with this drift item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceDrift withActualReferenceId(String actualReferenceId) {
        setActualReferenceId(actualReferenceId);
        return this;
    }

    /**
     * <p>
     * Actual compliance value of the entity.
     * </p>
     * 
     * @return Actual compliance value of the entity.
     */

    public java.util.Map<String, DisruptionCompliance> getActualValue() {
        return actualValue;
    }

    /**
     * <p>
     * Actual compliance value of the entity.
     * </p>
     * 
     * @param actualValue
     *        Actual compliance value of the entity.
     */

    public void setActualValue(java.util.Map<String, DisruptionCompliance> actualValue) {
        this.actualValue = actualValue;
    }

    /**
     * <p>
     * Actual compliance value of the entity.
     * </p>
     * 
     * @param actualValue
     *        Actual compliance value of the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceDrift withActualValue(java.util.Map<String, DisruptionCompliance> actualValue) {
        setActualValue(actualValue);
        return this;
    }

    /**
     * Add a single ActualValue entry
     *
     * @see ComplianceDrift#withActualValue
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceDrift addActualValueEntry(String key, DisruptionCompliance value) {
        if (null == this.actualValue) {
            this.actualValue = new java.util.HashMap<String, DisruptionCompliance>();
        }
        if (this.actualValue.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.actualValue.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ActualValue.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceDrift clearActualValueEntries() {
        this.actualValue = null;
        return this;
    }

    /**
     * <p>
     * Identifier of your application.
     * </p>
     * 
     * @param appId
     *        Identifier of your application.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * Identifier of your application.
     * </p>
     * 
     * @return Identifier of your application.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * Identifier of your application.
     * </p>
     * 
     * @param appId
     *        Identifier of your application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceDrift withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * Published version of your application on which drift was detected.
     * </p>
     * 
     * @param appVersion
     *        Published version of your application on which drift was detected.
     */

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    /**
     * <p>
     * Published version of your application on which drift was detected.
     * </p>
     * 
     * @return Published version of your application on which drift was detected.
     */

    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * <p>
     * Published version of your application on which drift was detected.
     * </p>
     * 
     * @param appVersion
     *        Published version of your application on which drift was detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceDrift withAppVersion(String appVersion) {
        setAppVersion(appVersion);
        return this;
    }

    /**
     * <p>
     * Difference type between actual and expected recovery point objective (RPO) and recovery time objective (RTO)
     * values. Currently, Resilience Hub supports only <b>NotEqual</b> difference type.
     * </p>
     * 
     * @param diffType
     *        Difference type between actual and expected recovery point objective (RPO) and recovery time objective
     *        (RTO) values. Currently, Resilience Hub supports only <b>NotEqual</b> difference type.
     * @see DifferenceType
     */

    public void setDiffType(String diffType) {
        this.diffType = diffType;
    }

    /**
     * <p>
     * Difference type between actual and expected recovery point objective (RPO) and recovery time objective (RTO)
     * values. Currently, Resilience Hub supports only <b>NotEqual</b> difference type.
     * </p>
     * 
     * @return Difference type between actual and expected recovery point objective (RPO) and recovery time objective
     *         (RTO) values. Currently, Resilience Hub supports only <b>NotEqual</b> difference type.
     * @see DifferenceType
     */

    public String getDiffType() {
        return this.diffType;
    }

    /**
     * <p>
     * Difference type between actual and expected recovery point objective (RPO) and recovery time objective (RTO)
     * values. Currently, Resilience Hub supports only <b>NotEqual</b> difference type.
     * </p>
     * 
     * @param diffType
     *        Difference type between actual and expected recovery point objective (RPO) and recovery time objective
     *        (RTO) values. Currently, Resilience Hub supports only <b>NotEqual</b> difference type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DifferenceType
     */

    public ComplianceDrift withDiffType(String diffType) {
        setDiffType(diffType);
        return this;
    }

    /**
     * <p>
     * Difference type between actual and expected recovery point objective (RPO) and recovery time objective (RTO)
     * values. Currently, Resilience Hub supports only <b>NotEqual</b> difference type.
     * </p>
     * 
     * @param diffType
     *        Difference type between actual and expected recovery point objective (RPO) and recovery time objective
     *        (RTO) values. Currently, Resilience Hub supports only <b>NotEqual</b> difference type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DifferenceType
     */

    public ComplianceDrift withDiffType(DifferenceType diffType) {
        this.diffType = diffType.toString();
        return this;
    }

    /**
     * <p>
     * The type of drift detected. Currently, Resilience Hub supports only <b>ApplicationCompliance</b> drift type.
     * </p>
     * 
     * @param driftType
     *        The type of drift detected. Currently, Resilience Hub supports only <b>ApplicationCompliance</b> drift
     *        type.
     * @see DriftType
     */

    public void setDriftType(String driftType) {
        this.driftType = driftType;
    }

    /**
     * <p>
     * The type of drift detected. Currently, Resilience Hub supports only <b>ApplicationCompliance</b> drift type.
     * </p>
     * 
     * @return The type of drift detected. Currently, Resilience Hub supports only <b>ApplicationCompliance</b> drift
     *         type.
     * @see DriftType
     */

    public String getDriftType() {
        return this.driftType;
    }

    /**
     * <p>
     * The type of drift detected. Currently, Resilience Hub supports only <b>ApplicationCompliance</b> drift type.
     * </p>
     * 
     * @param driftType
     *        The type of drift detected. Currently, Resilience Hub supports only <b>ApplicationCompliance</b> drift
     *        type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DriftType
     */

    public ComplianceDrift withDriftType(String driftType) {
        setDriftType(driftType);
        return this;
    }

    /**
     * <p>
     * The type of drift detected. Currently, Resilience Hub supports only <b>ApplicationCompliance</b> drift type.
     * </p>
     * 
     * @param driftType
     *        The type of drift detected. Currently, Resilience Hub supports only <b>ApplicationCompliance</b> drift
     *        type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DriftType
     */

    public ComplianceDrift withDriftType(DriftType driftType) {
        this.driftType = driftType.toString();
        return this;
    }

    /**
     * <p>
     * Identifier of an entity in which drift was detected. For compliance drift, the entity ID can be either
     * application ID or the AppComponent ID.
     * </p>
     * 
     * @param entityId
     *        Identifier of an entity in which drift was detected. For compliance drift, the entity ID can be either
     *        application ID or the AppComponent ID.
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * Identifier of an entity in which drift was detected. For compliance drift, the entity ID can be either
     * application ID or the AppComponent ID.
     * </p>
     * 
     * @return Identifier of an entity in which drift was detected. For compliance drift, the entity ID can be either
     *         application ID or the AppComponent ID.
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * Identifier of an entity in which drift was detected. For compliance drift, the entity ID can be either
     * application ID or the AppComponent ID.
     * </p>
     * 
     * @param entityId
     *        Identifier of an entity in which drift was detected. For compliance drift, the entity ID can be either
     *        application ID or the AppComponent ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceDrift withEntityId(String entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * The type of entity in which drift was detected. For compliance drifts, Resilience Hub supports
     * <code>AWS::ResilienceHub::AppComponent</code> and <code>AWS::ResilienceHub::Application</code>.
     * </p>
     * 
     * @param entityType
     *        The type of entity in which drift was detected. For compliance drifts, Resilience Hub supports
     *        <code>AWS::ResilienceHub::AppComponent</code> and <code>AWS::ResilienceHub::Application</code>.
     */

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    /**
     * <p>
     * The type of entity in which drift was detected. For compliance drifts, Resilience Hub supports
     * <code>AWS::ResilienceHub::AppComponent</code> and <code>AWS::ResilienceHub::Application</code>.
     * </p>
     * 
     * @return The type of entity in which drift was detected. For compliance drifts, Resilience Hub supports
     *         <code>AWS::ResilienceHub::AppComponent</code> and <code>AWS::ResilienceHub::Application</code>.
     */

    public String getEntityType() {
        return this.entityType;
    }

    /**
     * <p>
     * The type of entity in which drift was detected. For compliance drifts, Resilience Hub supports
     * <code>AWS::ResilienceHub::AppComponent</code> and <code>AWS::ResilienceHub::Application</code>.
     * </p>
     * 
     * @param entityType
     *        The type of entity in which drift was detected. For compliance drifts, Resilience Hub supports
     *        <code>AWS::ResilienceHub::AppComponent</code> and <code>AWS::ResilienceHub::Application</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceDrift withEntityType(String entityType) {
        setEntityType(entityType);
        return this;
    }

    /**
     * <p>
     * Assessment identifier of a previous assessment of the same application version. Resilience Hub uses the previous
     * assessment (associated with the reference identifier) to compare the compliance with the current assessment to
     * identify drifts.
     * </p>
     * 
     * @param expectedReferenceId
     *        Assessment identifier of a previous assessment of the same application version. Resilience Hub uses the
     *        previous assessment (associated with the reference identifier) to compare the compliance with the current
     *        assessment to identify drifts.
     */

    public void setExpectedReferenceId(String expectedReferenceId) {
        this.expectedReferenceId = expectedReferenceId;
    }

    /**
     * <p>
     * Assessment identifier of a previous assessment of the same application version. Resilience Hub uses the previous
     * assessment (associated with the reference identifier) to compare the compliance with the current assessment to
     * identify drifts.
     * </p>
     * 
     * @return Assessment identifier of a previous assessment of the same application version. Resilience Hub uses the
     *         previous assessment (associated with the reference identifier) to compare the compliance with the current
     *         assessment to identify drifts.
     */

    public String getExpectedReferenceId() {
        return this.expectedReferenceId;
    }

    /**
     * <p>
     * Assessment identifier of a previous assessment of the same application version. Resilience Hub uses the previous
     * assessment (associated with the reference identifier) to compare the compliance with the current assessment to
     * identify drifts.
     * </p>
     * 
     * @param expectedReferenceId
     *        Assessment identifier of a previous assessment of the same application version. Resilience Hub uses the
     *        previous assessment (associated with the reference identifier) to compare the compliance with the current
     *        assessment to identify drifts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceDrift withExpectedReferenceId(String expectedReferenceId) {
        setExpectedReferenceId(expectedReferenceId);
        return this;
    }

    /**
     * <p>
     * The expected compliance value of an entity.
     * </p>
     * 
     * @return The expected compliance value of an entity.
     */

    public java.util.Map<String, DisruptionCompliance> getExpectedValue() {
        return expectedValue;
    }

    /**
     * <p>
     * The expected compliance value of an entity.
     * </p>
     * 
     * @param expectedValue
     *        The expected compliance value of an entity.
     */

    public void setExpectedValue(java.util.Map<String, DisruptionCompliance> expectedValue) {
        this.expectedValue = expectedValue;
    }

    /**
     * <p>
     * The expected compliance value of an entity.
     * </p>
     * 
     * @param expectedValue
     *        The expected compliance value of an entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceDrift withExpectedValue(java.util.Map<String, DisruptionCompliance> expectedValue) {
        setExpectedValue(expectedValue);
        return this;
    }

    /**
     * Add a single ExpectedValue entry
     *
     * @see ComplianceDrift#withExpectedValue
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceDrift addExpectedValueEntry(String key, DisruptionCompliance value) {
        if (null == this.expectedValue) {
            this.expectedValue = new java.util.HashMap<String, DisruptionCompliance>();
        }
        if (this.expectedValue.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.expectedValue.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ExpectedValue.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceDrift clearExpectedValueEntries() {
        this.expectedValue = null;
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
        if (getActualReferenceId() != null)
            sb.append("ActualReferenceId: ").append(getActualReferenceId()).append(",");
        if (getActualValue() != null)
            sb.append("ActualValue: ").append(getActualValue()).append(",");
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getAppVersion() != null)
            sb.append("AppVersion: ").append(getAppVersion()).append(",");
        if (getDiffType() != null)
            sb.append("DiffType: ").append(getDiffType()).append(",");
        if (getDriftType() != null)
            sb.append("DriftType: ").append(getDriftType()).append(",");
        if (getEntityId() != null)
            sb.append("EntityId: ").append(getEntityId()).append(",");
        if (getEntityType() != null)
            sb.append("EntityType: ").append(getEntityType()).append(",");
        if (getExpectedReferenceId() != null)
            sb.append("ExpectedReferenceId: ").append(getExpectedReferenceId()).append(",");
        if (getExpectedValue() != null)
            sb.append("ExpectedValue: ").append(getExpectedValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComplianceDrift == false)
            return false;
        ComplianceDrift other = (ComplianceDrift) obj;
        if (other.getActualReferenceId() == null ^ this.getActualReferenceId() == null)
            return false;
        if (other.getActualReferenceId() != null && other.getActualReferenceId().equals(this.getActualReferenceId()) == false)
            return false;
        if (other.getActualValue() == null ^ this.getActualValue() == null)
            return false;
        if (other.getActualValue() != null && other.getActualValue().equals(this.getActualValue()) == false)
            return false;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getAppVersion() == null ^ this.getAppVersion() == null)
            return false;
        if (other.getAppVersion() != null && other.getAppVersion().equals(this.getAppVersion()) == false)
            return false;
        if (other.getDiffType() == null ^ this.getDiffType() == null)
            return false;
        if (other.getDiffType() != null && other.getDiffType().equals(this.getDiffType()) == false)
            return false;
        if (other.getDriftType() == null ^ this.getDriftType() == null)
            return false;
        if (other.getDriftType() != null && other.getDriftType().equals(this.getDriftType()) == false)
            return false;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        if (other.getEntityType() == null ^ this.getEntityType() == null)
            return false;
        if (other.getEntityType() != null && other.getEntityType().equals(this.getEntityType()) == false)
            return false;
        if (other.getExpectedReferenceId() == null ^ this.getExpectedReferenceId() == null)
            return false;
        if (other.getExpectedReferenceId() != null && other.getExpectedReferenceId().equals(this.getExpectedReferenceId()) == false)
            return false;
        if (other.getExpectedValue() == null ^ this.getExpectedValue() == null)
            return false;
        if (other.getExpectedValue() != null && other.getExpectedValue().equals(this.getExpectedValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActualReferenceId() == null) ? 0 : getActualReferenceId().hashCode());
        hashCode = prime * hashCode + ((getActualValue() == null) ? 0 : getActualValue().hashCode());
        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getAppVersion() == null) ? 0 : getAppVersion().hashCode());
        hashCode = prime * hashCode + ((getDiffType() == null) ? 0 : getDiffType().hashCode());
        hashCode = prime * hashCode + ((getDriftType() == null) ? 0 : getDriftType().hashCode());
        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        hashCode = prime * hashCode + ((getEntityType() == null) ? 0 : getEntityType().hashCode());
        hashCode = prime * hashCode + ((getExpectedReferenceId() == null) ? 0 : getExpectedReferenceId().hashCode());
        hashCode = prime * hashCode + ((getExpectedValue() == null) ? 0 : getExpectedValue().hashCode());
        return hashCode;
    }

    @Override
    public ComplianceDrift clone() {
        try {
            return (ComplianceDrift) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.ComplianceDriftMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
