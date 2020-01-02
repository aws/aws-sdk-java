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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * An update that you can apply to your Redis clusters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/ServiceUpdate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceUpdate implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     */
    private String serviceUpdateName;
    /**
     * <p>
     * The date when the service update is initially available
     * </p>
     */
    private java.util.Date serviceUpdateReleaseDate;
    /**
     * <p>
     * The date after which the service update is no longer available
     * </p>
     */
    private java.util.Date serviceUpdateEndDate;
    /**
     * <p>
     * The severity of the service update
     * </p>
     */
    private String serviceUpdateSeverity;
    /**
     * <p>
     * The recommendend date to apply the service update in order to ensure compliance. For information on compliance,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/elasticache-compliance.html#elasticache-compliance-self-service"
     * >Self-Service Security Updates for Compliance</a>.
     * </p>
     */
    private java.util.Date serviceUpdateRecommendedApplyByDate;
    /**
     * <p>
     * The status of the service update
     * </p>
     */
    private String serviceUpdateStatus;
    /**
     * <p>
     * Provides details of the service update
     * </p>
     */
    private String serviceUpdateDescription;
    /**
     * <p>
     * Reflects the nature of the service update
     * </p>
     */
    private String serviceUpdateType;
    /**
     * <p>
     * The Elasticache engine to which the update applies. Either Redis or Memcached
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The Elasticache engine version to which the update applies. Either Redis or Memcached engine version
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * Indicates whether the service update will be automatically applied once the recommended apply-by date has
     * expired.
     * </p>
     */
    private Boolean autoUpdateAfterRecommendedApplyByDate;
    /**
     * <p>
     * The estimated length of time the service update will take
     * </p>
     */
    private String estimatedUpdateTime;

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     * 
     * @param serviceUpdateName
     *        The unique ID of the service update
     */

    public void setServiceUpdateName(String serviceUpdateName) {
        this.serviceUpdateName = serviceUpdateName;
    }

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     * 
     * @return The unique ID of the service update
     */

    public String getServiceUpdateName() {
        return this.serviceUpdateName;
    }

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     * 
     * @param serviceUpdateName
     *        The unique ID of the service update
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceUpdate withServiceUpdateName(String serviceUpdateName) {
        setServiceUpdateName(serviceUpdateName);
        return this;
    }

    /**
     * <p>
     * The date when the service update is initially available
     * </p>
     * 
     * @param serviceUpdateReleaseDate
     *        The date when the service update is initially available
     */

    public void setServiceUpdateReleaseDate(java.util.Date serviceUpdateReleaseDate) {
        this.serviceUpdateReleaseDate = serviceUpdateReleaseDate;
    }

    /**
     * <p>
     * The date when the service update is initially available
     * </p>
     * 
     * @return The date when the service update is initially available
     */

    public java.util.Date getServiceUpdateReleaseDate() {
        return this.serviceUpdateReleaseDate;
    }

    /**
     * <p>
     * The date when the service update is initially available
     * </p>
     * 
     * @param serviceUpdateReleaseDate
     *        The date when the service update is initially available
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceUpdate withServiceUpdateReleaseDate(java.util.Date serviceUpdateReleaseDate) {
        setServiceUpdateReleaseDate(serviceUpdateReleaseDate);
        return this;
    }

    /**
     * <p>
     * The date after which the service update is no longer available
     * </p>
     * 
     * @param serviceUpdateEndDate
     *        The date after which the service update is no longer available
     */

    public void setServiceUpdateEndDate(java.util.Date serviceUpdateEndDate) {
        this.serviceUpdateEndDate = serviceUpdateEndDate;
    }

    /**
     * <p>
     * The date after which the service update is no longer available
     * </p>
     * 
     * @return The date after which the service update is no longer available
     */

    public java.util.Date getServiceUpdateEndDate() {
        return this.serviceUpdateEndDate;
    }

    /**
     * <p>
     * The date after which the service update is no longer available
     * </p>
     * 
     * @param serviceUpdateEndDate
     *        The date after which the service update is no longer available
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceUpdate withServiceUpdateEndDate(java.util.Date serviceUpdateEndDate) {
        setServiceUpdateEndDate(serviceUpdateEndDate);
        return this;
    }

    /**
     * <p>
     * The severity of the service update
     * </p>
     * 
     * @param serviceUpdateSeverity
     *        The severity of the service update
     * @see ServiceUpdateSeverity
     */

    public void setServiceUpdateSeverity(String serviceUpdateSeverity) {
        this.serviceUpdateSeverity = serviceUpdateSeverity;
    }

    /**
     * <p>
     * The severity of the service update
     * </p>
     * 
     * @return The severity of the service update
     * @see ServiceUpdateSeverity
     */

    public String getServiceUpdateSeverity() {
        return this.serviceUpdateSeverity;
    }

    /**
     * <p>
     * The severity of the service update
     * </p>
     * 
     * @param serviceUpdateSeverity
     *        The severity of the service update
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceUpdateSeverity
     */

    public ServiceUpdate withServiceUpdateSeverity(String serviceUpdateSeverity) {
        setServiceUpdateSeverity(serviceUpdateSeverity);
        return this;
    }

    /**
     * <p>
     * The severity of the service update
     * </p>
     * 
     * @param serviceUpdateSeverity
     *        The severity of the service update
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceUpdateSeverity
     */

    public ServiceUpdate withServiceUpdateSeverity(ServiceUpdateSeverity serviceUpdateSeverity) {
        this.serviceUpdateSeverity = serviceUpdateSeverity.toString();
        return this;
    }

    /**
     * <p>
     * The recommendend date to apply the service update in order to ensure compliance. For information on compliance,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/elasticache-compliance.html#elasticache-compliance-self-service"
     * >Self-Service Security Updates for Compliance</a>.
     * </p>
     * 
     * @param serviceUpdateRecommendedApplyByDate
     *        The recommendend date to apply the service update in order to ensure compliance. For information on
     *        compliance, see <a href=
     *        "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/elasticache-compliance.html#elasticache-compliance-self-service"
     *        >Self-Service Security Updates for Compliance</a>.
     */

    public void setServiceUpdateRecommendedApplyByDate(java.util.Date serviceUpdateRecommendedApplyByDate) {
        this.serviceUpdateRecommendedApplyByDate = serviceUpdateRecommendedApplyByDate;
    }

    /**
     * <p>
     * The recommendend date to apply the service update in order to ensure compliance. For information on compliance,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/elasticache-compliance.html#elasticache-compliance-self-service"
     * >Self-Service Security Updates for Compliance</a>.
     * </p>
     * 
     * @return The recommendend date to apply the service update in order to ensure compliance. For information on
     *         compliance, see <a href=
     *         "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/elasticache-compliance.html#elasticache-compliance-self-service"
     *         >Self-Service Security Updates for Compliance</a>.
     */

    public java.util.Date getServiceUpdateRecommendedApplyByDate() {
        return this.serviceUpdateRecommendedApplyByDate;
    }

    /**
     * <p>
     * The recommendend date to apply the service update in order to ensure compliance. For information on compliance,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/elasticache-compliance.html#elasticache-compliance-self-service"
     * >Self-Service Security Updates for Compliance</a>.
     * </p>
     * 
     * @param serviceUpdateRecommendedApplyByDate
     *        The recommendend date to apply the service update in order to ensure compliance. For information on
     *        compliance, see <a href=
     *        "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/elasticache-compliance.html#elasticache-compliance-self-service"
     *        >Self-Service Security Updates for Compliance</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceUpdate withServiceUpdateRecommendedApplyByDate(java.util.Date serviceUpdateRecommendedApplyByDate) {
        setServiceUpdateRecommendedApplyByDate(serviceUpdateRecommendedApplyByDate);
        return this;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * 
     * @param serviceUpdateStatus
     *        The status of the service update
     * @see ServiceUpdateStatus
     */

    public void setServiceUpdateStatus(String serviceUpdateStatus) {
        this.serviceUpdateStatus = serviceUpdateStatus;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * 
     * @return The status of the service update
     * @see ServiceUpdateStatus
     */

    public String getServiceUpdateStatus() {
        return this.serviceUpdateStatus;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * 
     * @param serviceUpdateStatus
     *        The status of the service update
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceUpdateStatus
     */

    public ServiceUpdate withServiceUpdateStatus(String serviceUpdateStatus) {
        setServiceUpdateStatus(serviceUpdateStatus);
        return this;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * 
     * @param serviceUpdateStatus
     *        The status of the service update
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceUpdateStatus
     */

    public ServiceUpdate withServiceUpdateStatus(ServiceUpdateStatus serviceUpdateStatus) {
        this.serviceUpdateStatus = serviceUpdateStatus.toString();
        return this;
    }

    /**
     * <p>
     * Provides details of the service update
     * </p>
     * 
     * @param serviceUpdateDescription
     *        Provides details of the service update
     */

    public void setServiceUpdateDescription(String serviceUpdateDescription) {
        this.serviceUpdateDescription = serviceUpdateDescription;
    }

    /**
     * <p>
     * Provides details of the service update
     * </p>
     * 
     * @return Provides details of the service update
     */

    public String getServiceUpdateDescription() {
        return this.serviceUpdateDescription;
    }

    /**
     * <p>
     * Provides details of the service update
     * </p>
     * 
     * @param serviceUpdateDescription
     *        Provides details of the service update
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceUpdate withServiceUpdateDescription(String serviceUpdateDescription) {
        setServiceUpdateDescription(serviceUpdateDescription);
        return this;
    }

    /**
     * <p>
     * Reflects the nature of the service update
     * </p>
     * 
     * @param serviceUpdateType
     *        Reflects the nature of the service update
     * @see ServiceUpdateType
     */

    public void setServiceUpdateType(String serviceUpdateType) {
        this.serviceUpdateType = serviceUpdateType;
    }

    /**
     * <p>
     * Reflects the nature of the service update
     * </p>
     * 
     * @return Reflects the nature of the service update
     * @see ServiceUpdateType
     */

    public String getServiceUpdateType() {
        return this.serviceUpdateType;
    }

    /**
     * <p>
     * Reflects the nature of the service update
     * </p>
     * 
     * @param serviceUpdateType
     *        Reflects the nature of the service update
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceUpdateType
     */

    public ServiceUpdate withServiceUpdateType(String serviceUpdateType) {
        setServiceUpdateType(serviceUpdateType);
        return this;
    }

    /**
     * <p>
     * Reflects the nature of the service update
     * </p>
     * 
     * @param serviceUpdateType
     *        Reflects the nature of the service update
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceUpdateType
     */

    public ServiceUpdate withServiceUpdateType(ServiceUpdateType serviceUpdateType) {
        this.serviceUpdateType = serviceUpdateType.toString();
        return this;
    }

    /**
     * <p>
     * The Elasticache engine to which the update applies. Either Redis or Memcached
     * </p>
     * 
     * @param engine
     *        The Elasticache engine to which the update applies. Either Redis or Memcached
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The Elasticache engine to which the update applies. Either Redis or Memcached
     * </p>
     * 
     * @return The Elasticache engine to which the update applies. Either Redis or Memcached
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The Elasticache engine to which the update applies. Either Redis or Memcached
     * </p>
     * 
     * @param engine
     *        The Elasticache engine to which the update applies. Either Redis or Memcached
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceUpdate withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The Elasticache engine version to which the update applies. Either Redis or Memcached engine version
     * </p>
     * 
     * @param engineVersion
     *        The Elasticache engine version to which the update applies. Either Redis or Memcached engine version
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The Elasticache engine version to which the update applies. Either Redis or Memcached engine version
     * </p>
     * 
     * @return The Elasticache engine version to which the update applies. Either Redis or Memcached engine version
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The Elasticache engine version to which the update applies. Either Redis or Memcached engine version
     * </p>
     * 
     * @param engineVersion
     *        The Elasticache engine version to which the update applies. Either Redis or Memcached engine version
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceUpdate withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * Indicates whether the service update will be automatically applied once the recommended apply-by date has
     * expired.
     * </p>
     * 
     * @param autoUpdateAfterRecommendedApplyByDate
     *        Indicates whether the service update will be automatically applied once the recommended apply-by date has
     *        expired.
     */

    public void setAutoUpdateAfterRecommendedApplyByDate(Boolean autoUpdateAfterRecommendedApplyByDate) {
        this.autoUpdateAfterRecommendedApplyByDate = autoUpdateAfterRecommendedApplyByDate;
    }

    /**
     * <p>
     * Indicates whether the service update will be automatically applied once the recommended apply-by date has
     * expired.
     * </p>
     * 
     * @return Indicates whether the service update will be automatically applied once the recommended apply-by date has
     *         expired.
     */

    public Boolean getAutoUpdateAfterRecommendedApplyByDate() {
        return this.autoUpdateAfterRecommendedApplyByDate;
    }

    /**
     * <p>
     * Indicates whether the service update will be automatically applied once the recommended apply-by date has
     * expired.
     * </p>
     * 
     * @param autoUpdateAfterRecommendedApplyByDate
     *        Indicates whether the service update will be automatically applied once the recommended apply-by date has
     *        expired.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceUpdate withAutoUpdateAfterRecommendedApplyByDate(Boolean autoUpdateAfterRecommendedApplyByDate) {
        setAutoUpdateAfterRecommendedApplyByDate(autoUpdateAfterRecommendedApplyByDate);
        return this;
    }

    /**
     * <p>
     * Indicates whether the service update will be automatically applied once the recommended apply-by date has
     * expired.
     * </p>
     * 
     * @return Indicates whether the service update will be automatically applied once the recommended apply-by date has
     *         expired.
     */

    public Boolean isAutoUpdateAfterRecommendedApplyByDate() {
        return this.autoUpdateAfterRecommendedApplyByDate;
    }

    /**
     * <p>
     * The estimated length of time the service update will take
     * </p>
     * 
     * @param estimatedUpdateTime
     *        The estimated length of time the service update will take
     */

    public void setEstimatedUpdateTime(String estimatedUpdateTime) {
        this.estimatedUpdateTime = estimatedUpdateTime;
    }

    /**
     * <p>
     * The estimated length of time the service update will take
     * </p>
     * 
     * @return The estimated length of time the service update will take
     */

    public String getEstimatedUpdateTime() {
        return this.estimatedUpdateTime;
    }

    /**
     * <p>
     * The estimated length of time the service update will take
     * </p>
     * 
     * @param estimatedUpdateTime
     *        The estimated length of time the service update will take
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceUpdate withEstimatedUpdateTime(String estimatedUpdateTime) {
        setEstimatedUpdateTime(estimatedUpdateTime);
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
        if (getServiceUpdateName() != null)
            sb.append("ServiceUpdateName: ").append(getServiceUpdateName()).append(",");
        if (getServiceUpdateReleaseDate() != null)
            sb.append("ServiceUpdateReleaseDate: ").append(getServiceUpdateReleaseDate()).append(",");
        if (getServiceUpdateEndDate() != null)
            sb.append("ServiceUpdateEndDate: ").append(getServiceUpdateEndDate()).append(",");
        if (getServiceUpdateSeverity() != null)
            sb.append("ServiceUpdateSeverity: ").append(getServiceUpdateSeverity()).append(",");
        if (getServiceUpdateRecommendedApplyByDate() != null)
            sb.append("ServiceUpdateRecommendedApplyByDate: ").append(getServiceUpdateRecommendedApplyByDate()).append(",");
        if (getServiceUpdateStatus() != null)
            sb.append("ServiceUpdateStatus: ").append(getServiceUpdateStatus()).append(",");
        if (getServiceUpdateDescription() != null)
            sb.append("ServiceUpdateDescription: ").append(getServiceUpdateDescription()).append(",");
        if (getServiceUpdateType() != null)
            sb.append("ServiceUpdateType: ").append(getServiceUpdateType()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getAutoUpdateAfterRecommendedApplyByDate() != null)
            sb.append("AutoUpdateAfterRecommendedApplyByDate: ").append(getAutoUpdateAfterRecommendedApplyByDate()).append(",");
        if (getEstimatedUpdateTime() != null)
            sb.append("EstimatedUpdateTime: ").append(getEstimatedUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceUpdate == false)
            return false;
        ServiceUpdate other = (ServiceUpdate) obj;
        if (other.getServiceUpdateName() == null ^ this.getServiceUpdateName() == null)
            return false;
        if (other.getServiceUpdateName() != null && other.getServiceUpdateName().equals(this.getServiceUpdateName()) == false)
            return false;
        if (other.getServiceUpdateReleaseDate() == null ^ this.getServiceUpdateReleaseDate() == null)
            return false;
        if (other.getServiceUpdateReleaseDate() != null && other.getServiceUpdateReleaseDate().equals(this.getServiceUpdateReleaseDate()) == false)
            return false;
        if (other.getServiceUpdateEndDate() == null ^ this.getServiceUpdateEndDate() == null)
            return false;
        if (other.getServiceUpdateEndDate() != null && other.getServiceUpdateEndDate().equals(this.getServiceUpdateEndDate()) == false)
            return false;
        if (other.getServiceUpdateSeverity() == null ^ this.getServiceUpdateSeverity() == null)
            return false;
        if (other.getServiceUpdateSeverity() != null && other.getServiceUpdateSeverity().equals(this.getServiceUpdateSeverity()) == false)
            return false;
        if (other.getServiceUpdateRecommendedApplyByDate() == null ^ this.getServiceUpdateRecommendedApplyByDate() == null)
            return false;
        if (other.getServiceUpdateRecommendedApplyByDate() != null
                && other.getServiceUpdateRecommendedApplyByDate().equals(this.getServiceUpdateRecommendedApplyByDate()) == false)
            return false;
        if (other.getServiceUpdateStatus() == null ^ this.getServiceUpdateStatus() == null)
            return false;
        if (other.getServiceUpdateStatus() != null && other.getServiceUpdateStatus().equals(this.getServiceUpdateStatus()) == false)
            return false;
        if (other.getServiceUpdateDescription() == null ^ this.getServiceUpdateDescription() == null)
            return false;
        if (other.getServiceUpdateDescription() != null && other.getServiceUpdateDescription().equals(this.getServiceUpdateDescription()) == false)
            return false;
        if (other.getServiceUpdateType() == null ^ this.getServiceUpdateType() == null)
            return false;
        if (other.getServiceUpdateType() != null && other.getServiceUpdateType().equals(this.getServiceUpdateType()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getAutoUpdateAfterRecommendedApplyByDate() == null ^ this.getAutoUpdateAfterRecommendedApplyByDate() == null)
            return false;
        if (other.getAutoUpdateAfterRecommendedApplyByDate() != null
                && other.getAutoUpdateAfterRecommendedApplyByDate().equals(this.getAutoUpdateAfterRecommendedApplyByDate()) == false)
            return false;
        if (other.getEstimatedUpdateTime() == null ^ this.getEstimatedUpdateTime() == null)
            return false;
        if (other.getEstimatedUpdateTime() != null && other.getEstimatedUpdateTime().equals(this.getEstimatedUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceUpdateName() == null) ? 0 : getServiceUpdateName().hashCode());
        hashCode = prime * hashCode + ((getServiceUpdateReleaseDate() == null) ? 0 : getServiceUpdateReleaseDate().hashCode());
        hashCode = prime * hashCode + ((getServiceUpdateEndDate() == null) ? 0 : getServiceUpdateEndDate().hashCode());
        hashCode = prime * hashCode + ((getServiceUpdateSeverity() == null) ? 0 : getServiceUpdateSeverity().hashCode());
        hashCode = prime * hashCode + ((getServiceUpdateRecommendedApplyByDate() == null) ? 0 : getServiceUpdateRecommendedApplyByDate().hashCode());
        hashCode = prime * hashCode + ((getServiceUpdateStatus() == null) ? 0 : getServiceUpdateStatus().hashCode());
        hashCode = prime * hashCode + ((getServiceUpdateDescription() == null) ? 0 : getServiceUpdateDescription().hashCode());
        hashCode = prime * hashCode + ((getServiceUpdateType() == null) ? 0 : getServiceUpdateType().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getAutoUpdateAfterRecommendedApplyByDate() == null) ? 0 : getAutoUpdateAfterRecommendedApplyByDate().hashCode());
        hashCode = prime * hashCode + ((getEstimatedUpdateTime() == null) ? 0 : getEstimatedUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public ServiceUpdate clone() {
        try {
            return (ServiceUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
