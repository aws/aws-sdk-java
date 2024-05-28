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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a GuardDuty feature.
 * </p>
 * <p>
 * Specifying both EKS Runtime Monitoring (<code>EKS_RUNTIME_MONITORING</code>) and Runtime Monitoring (
 * <code>RUNTIME_MONITORING</code>) will cause an error. You can add only one of these two features because Runtime
 * Monitoring already includes the threat detection for Amazon EKS resources. For more information, see <a
 * href="https://docs.aws.amazon.com/guardduty/latest/ug/runtime-monitoring.html">Runtime Monitoring</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DetectorFeatureConfigurationResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectorFeatureConfigurationResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates the name of the feature that can be enabled for the detector.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Indicates the status of the feature that is enabled for the detector.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The timestamp at which the feature object was updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * Additional configuration for a resource.
     * </p>
     */
    private java.util.List<DetectorAdditionalConfigurationResult> additionalConfiguration;

    /**
     * <p>
     * Indicates the name of the feature that can be enabled for the detector.
     * </p>
     * 
     * @param name
     *        Indicates the name of the feature that can be enabled for the detector.
     * @see DetectorFeatureResult
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Indicates the name of the feature that can be enabled for the detector.
     * </p>
     * 
     * @return Indicates the name of the feature that can be enabled for the detector.
     * @see DetectorFeatureResult
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Indicates the name of the feature that can be enabled for the detector.
     * </p>
     * 
     * @param name
     *        Indicates the name of the feature that can be enabled for the detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DetectorFeatureResult
     */

    public DetectorFeatureConfigurationResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Indicates the name of the feature that can be enabled for the detector.
     * </p>
     * 
     * @param name
     *        Indicates the name of the feature that can be enabled for the detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DetectorFeatureResult
     */

    public DetectorFeatureConfigurationResult withName(DetectorFeatureResult name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * Indicates the status of the feature that is enabled for the detector.
     * </p>
     * 
     * @param status
     *        Indicates the status of the feature that is enabled for the detector.
     * @see FeatureStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates the status of the feature that is enabled for the detector.
     * </p>
     * 
     * @return Indicates the status of the feature that is enabled for the detector.
     * @see FeatureStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates the status of the feature that is enabled for the detector.
     * </p>
     * 
     * @param status
     *        Indicates the status of the feature that is enabled for the detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureStatus
     */

    public DetectorFeatureConfigurationResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the feature that is enabled for the detector.
     * </p>
     * 
     * @param status
     *        Indicates the status of the feature that is enabled for the detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureStatus
     */

    public DetectorFeatureConfigurationResult withStatus(FeatureStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp at which the feature object was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp at which the feature object was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp at which the feature object was updated.
     * </p>
     * 
     * @return The timestamp at which the feature object was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp at which the feature object was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp at which the feature object was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectorFeatureConfigurationResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * Additional configuration for a resource.
     * </p>
     * 
     * @return Additional configuration for a resource.
     */

    public java.util.List<DetectorAdditionalConfigurationResult> getAdditionalConfiguration() {
        return additionalConfiguration;
    }

    /**
     * <p>
     * Additional configuration for a resource.
     * </p>
     * 
     * @param additionalConfiguration
     *        Additional configuration for a resource.
     */

    public void setAdditionalConfiguration(java.util.Collection<DetectorAdditionalConfigurationResult> additionalConfiguration) {
        if (additionalConfiguration == null) {
            this.additionalConfiguration = null;
            return;
        }

        this.additionalConfiguration = new java.util.ArrayList<DetectorAdditionalConfigurationResult>(additionalConfiguration);
    }

    /**
     * <p>
     * Additional configuration for a resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalConfiguration(java.util.Collection)} or
     * {@link #withAdditionalConfiguration(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param additionalConfiguration
     *        Additional configuration for a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectorFeatureConfigurationResult withAdditionalConfiguration(DetectorAdditionalConfigurationResult... additionalConfiguration) {
        if (this.additionalConfiguration == null) {
            setAdditionalConfiguration(new java.util.ArrayList<DetectorAdditionalConfigurationResult>(additionalConfiguration.length));
        }
        for (DetectorAdditionalConfigurationResult ele : additionalConfiguration) {
            this.additionalConfiguration.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Additional configuration for a resource.
     * </p>
     * 
     * @param additionalConfiguration
     *        Additional configuration for a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectorFeatureConfigurationResult withAdditionalConfiguration(java.util.Collection<DetectorAdditionalConfigurationResult> additionalConfiguration) {
        setAdditionalConfiguration(additionalConfiguration);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getAdditionalConfiguration() != null)
            sb.append("AdditionalConfiguration: ").append(getAdditionalConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectorFeatureConfigurationResult == false)
            return false;
        DetectorFeatureConfigurationResult other = (DetectorFeatureConfigurationResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getAdditionalConfiguration() == null ^ this.getAdditionalConfiguration() == null)
            return false;
        if (other.getAdditionalConfiguration() != null && other.getAdditionalConfiguration().equals(this.getAdditionalConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getAdditionalConfiguration() == null) ? 0 : getAdditionalConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public DetectorFeatureConfigurationResult clone() {
        try {
            return (DetectorFeatureConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.DetectorFeatureConfigurationResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
