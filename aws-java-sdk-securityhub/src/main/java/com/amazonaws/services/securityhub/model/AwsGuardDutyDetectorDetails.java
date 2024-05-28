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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about an Amazon GuardDuty detector. A detector is an object that represents the GuardDuty service. A
 * detector is required for GuardDuty to become operational.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsGuardDutyDetectorDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsGuardDutyDetectorDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes which data sources are activated for the detector.
     * </p>
     */
    private AwsGuardDutyDetectorDataSourcesDetails dataSources;
    /**
     * <p>
     * Describes which features are activated for the detector.
     * </p>
     */
    private java.util.List<AwsGuardDutyDetectorFeaturesDetails> features;
    /**
     * <p>
     * The publishing frequency of the finding.
     * </p>
     */
    private String findingPublishingFrequency;
    /**
     * <p>
     * The GuardDuty service role.
     * </p>
     */
    private String serviceRole;
    /**
     * <p>
     * The activation status of the detector.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Describes which data sources are activated for the detector.
     * </p>
     * 
     * @param dataSources
     *        Describes which data sources are activated for the detector.
     */

    public void setDataSources(AwsGuardDutyDetectorDataSourcesDetails dataSources) {
        this.dataSources = dataSources;
    }

    /**
     * <p>
     * Describes which data sources are activated for the detector.
     * </p>
     * 
     * @return Describes which data sources are activated for the detector.
     */

    public AwsGuardDutyDetectorDataSourcesDetails getDataSources() {
        return this.dataSources;
    }

    /**
     * <p>
     * Describes which data sources are activated for the detector.
     * </p>
     * 
     * @param dataSources
     *        Describes which data sources are activated for the detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsGuardDutyDetectorDetails withDataSources(AwsGuardDutyDetectorDataSourcesDetails dataSources) {
        setDataSources(dataSources);
        return this;
    }

    /**
     * <p>
     * Describes which features are activated for the detector.
     * </p>
     * 
     * @return Describes which features are activated for the detector.
     */

    public java.util.List<AwsGuardDutyDetectorFeaturesDetails> getFeatures() {
        return features;
    }

    /**
     * <p>
     * Describes which features are activated for the detector.
     * </p>
     * 
     * @param features
     *        Describes which features are activated for the detector.
     */

    public void setFeatures(java.util.Collection<AwsGuardDutyDetectorFeaturesDetails> features) {
        if (features == null) {
            this.features = null;
            return;
        }

        this.features = new java.util.ArrayList<AwsGuardDutyDetectorFeaturesDetails>(features);
    }

    /**
     * <p>
     * Describes which features are activated for the detector.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFeatures(java.util.Collection)} or {@link #withFeatures(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param features
     *        Describes which features are activated for the detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsGuardDutyDetectorDetails withFeatures(AwsGuardDutyDetectorFeaturesDetails... features) {
        if (this.features == null) {
            setFeatures(new java.util.ArrayList<AwsGuardDutyDetectorFeaturesDetails>(features.length));
        }
        for (AwsGuardDutyDetectorFeaturesDetails ele : features) {
            this.features.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes which features are activated for the detector.
     * </p>
     * 
     * @param features
     *        Describes which features are activated for the detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsGuardDutyDetectorDetails withFeatures(java.util.Collection<AwsGuardDutyDetectorFeaturesDetails> features) {
        setFeatures(features);
        return this;
    }

    /**
     * <p>
     * The publishing frequency of the finding.
     * </p>
     * 
     * @param findingPublishingFrequency
     *        The publishing frequency of the finding.
     */

    public void setFindingPublishingFrequency(String findingPublishingFrequency) {
        this.findingPublishingFrequency = findingPublishingFrequency;
    }

    /**
     * <p>
     * The publishing frequency of the finding.
     * </p>
     * 
     * @return The publishing frequency of the finding.
     */

    public String getFindingPublishingFrequency() {
        return this.findingPublishingFrequency;
    }

    /**
     * <p>
     * The publishing frequency of the finding.
     * </p>
     * 
     * @param findingPublishingFrequency
     *        The publishing frequency of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsGuardDutyDetectorDetails withFindingPublishingFrequency(String findingPublishingFrequency) {
        setFindingPublishingFrequency(findingPublishingFrequency);
        return this;
    }

    /**
     * <p>
     * The GuardDuty service role.
     * </p>
     * 
     * @param serviceRole
     *        The GuardDuty service role.
     */

    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    /**
     * <p>
     * The GuardDuty service role.
     * </p>
     * 
     * @return The GuardDuty service role.
     */

    public String getServiceRole() {
        return this.serviceRole;
    }

    /**
     * <p>
     * The GuardDuty service role.
     * </p>
     * 
     * @param serviceRole
     *        The GuardDuty service role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsGuardDutyDetectorDetails withServiceRole(String serviceRole) {
        setServiceRole(serviceRole);
        return this;
    }

    /**
     * <p>
     * The activation status of the detector.
     * </p>
     * 
     * @param status
     *        The activation status of the detector.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The activation status of the detector.
     * </p>
     * 
     * @return The activation status of the detector.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The activation status of the detector.
     * </p>
     * 
     * @param status
     *        The activation status of the detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsGuardDutyDetectorDetails withStatus(String status) {
        setStatus(status);
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
        if (getDataSources() != null)
            sb.append("DataSources: ").append(getDataSources()).append(",");
        if (getFeatures() != null)
            sb.append("Features: ").append(getFeatures()).append(",");
        if (getFindingPublishingFrequency() != null)
            sb.append("FindingPublishingFrequency: ").append(getFindingPublishingFrequency()).append(",");
        if (getServiceRole() != null)
            sb.append("ServiceRole: ").append(getServiceRole()).append(",");
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

        if (obj instanceof AwsGuardDutyDetectorDetails == false)
            return false;
        AwsGuardDutyDetectorDetails other = (AwsGuardDutyDetectorDetails) obj;
        if (other.getDataSources() == null ^ this.getDataSources() == null)
            return false;
        if (other.getDataSources() != null && other.getDataSources().equals(this.getDataSources()) == false)
            return false;
        if (other.getFeatures() == null ^ this.getFeatures() == null)
            return false;
        if (other.getFeatures() != null && other.getFeatures().equals(this.getFeatures()) == false)
            return false;
        if (other.getFindingPublishingFrequency() == null ^ this.getFindingPublishingFrequency() == null)
            return false;
        if (other.getFindingPublishingFrequency() != null && other.getFindingPublishingFrequency().equals(this.getFindingPublishingFrequency()) == false)
            return false;
        if (other.getServiceRole() == null ^ this.getServiceRole() == null)
            return false;
        if (other.getServiceRole() != null && other.getServiceRole().equals(this.getServiceRole()) == false)
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

        hashCode = prime * hashCode + ((getDataSources() == null) ? 0 : getDataSources().hashCode());
        hashCode = prime * hashCode + ((getFeatures() == null) ? 0 : getFeatures().hashCode());
        hashCode = prime * hashCode + ((getFindingPublishingFrequency() == null) ? 0 : getFindingPublishingFrequency().hashCode());
        hashCode = prime * hashCode + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public AwsGuardDutyDetectorDetails clone() {
        try {
            return (AwsGuardDutyDetectorDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsGuardDutyDetectorDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
