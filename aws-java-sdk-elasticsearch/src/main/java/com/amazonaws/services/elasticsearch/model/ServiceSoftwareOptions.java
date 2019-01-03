/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The current options of an Elasticsearch domain service software options.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceSoftwareOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The current service software version that is present on the domain.
     * </p>
     */
    private String currentVersion;
    /**
     * <p>
     * The new service software version if one is available.
     * </p>
     */
    private String newVersion;
    /**
     * <p>
     * <code>True</code> if you are able to update you service software version. <code>False</code> if you are not able
     * to update your service software version.
     * </p>
     */
    private Boolean updateAvailable;
    /**
     * <p>
     * <code>True</code> if you are able to cancel your service software version update. <code>False</code> if you are
     * not able to cancel your service software version.
     * </p>
     */
    private Boolean cancellable;
    /**
     * <p>
     * The status of your service software update. This field can take the following values: <code>ELIGIBLE</code>,
     * <code>PENDING_UPDATE</code>, <code>IN_PROGRESS</code>, <code>COMPLETED</code>, and <code>NOT_ELIGIBLE</code>.
     * </p>
     */
    private String updateStatus;
    /**
     * <p>
     * The description of the <code>UpdateStatus</code>.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Timestamp, in Epoch time, until which you can manually request a service software update. After this date, we
     * automatically update your service software.
     * </p>
     */
    private java.util.Date automatedUpdateDate;

    /**
     * <p>
     * The current service software version that is present on the domain.
     * </p>
     * 
     * @param currentVersion
     *        The current service software version that is present on the domain.
     */

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * <p>
     * The current service software version that is present on the domain.
     * </p>
     * 
     * @return The current service software version that is present on the domain.
     */

    public String getCurrentVersion() {
        return this.currentVersion;
    }

    /**
     * <p>
     * The current service software version that is present on the domain.
     * </p>
     * 
     * @param currentVersion
     *        The current service software version that is present on the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceSoftwareOptions withCurrentVersion(String currentVersion) {
        setCurrentVersion(currentVersion);
        return this;
    }

    /**
     * <p>
     * The new service software version if one is available.
     * </p>
     * 
     * @param newVersion
     *        The new service software version if one is available.
     */

    public void setNewVersion(String newVersion) {
        this.newVersion = newVersion;
    }

    /**
     * <p>
     * The new service software version if one is available.
     * </p>
     * 
     * @return The new service software version if one is available.
     */

    public String getNewVersion() {
        return this.newVersion;
    }

    /**
     * <p>
     * The new service software version if one is available.
     * </p>
     * 
     * @param newVersion
     *        The new service software version if one is available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceSoftwareOptions withNewVersion(String newVersion) {
        setNewVersion(newVersion);
        return this;
    }

    /**
     * <p>
     * <code>True</code> if you are able to update you service software version. <code>False</code> if you are not able
     * to update your service software version.
     * </p>
     * 
     * @param updateAvailable
     *        True</code> if you are able to update you service software version. <code>False
     */

    public void setUpdateAvailable(Boolean updateAvailable) {
        this.updateAvailable = updateAvailable;
    }

    /**
     * <p>
     * <code>True</code> if you are able to update you service software version. <code>False</code> if you are not able
     * to update your service software version.
     * </p>
     * 
     * @return True</code> if you are able to update you service software version. <code>False
     */

    public Boolean getUpdateAvailable() {
        return this.updateAvailable;
    }

    /**
     * <p>
     * <code>True</code> if you are able to update you service software version. <code>False</code> if you are not able
     * to update your service software version.
     * </p>
     * 
     * @param updateAvailable
     *        True</code> if you are able to update you service software version. <code>False
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceSoftwareOptions withUpdateAvailable(Boolean updateAvailable) {
        setUpdateAvailable(updateAvailable);
        return this;
    }

    /**
     * <p>
     * <code>True</code> if you are able to update you service software version. <code>False</code> if you are not able
     * to update your service software version.
     * </p>
     * 
     * @return True</code> if you are able to update you service software version. <code>False
     */

    public Boolean isUpdateAvailable() {
        return this.updateAvailable;
    }

    /**
     * <p>
     * <code>True</code> if you are able to cancel your service software version update. <code>False</code> if you are
     * not able to cancel your service software version.
     * </p>
     * 
     * @param cancellable
     *        True</code> if you are able to cancel your service software version update. <code>False
     */

    public void setCancellable(Boolean cancellable) {
        this.cancellable = cancellable;
    }

    /**
     * <p>
     * <code>True</code> if you are able to cancel your service software version update. <code>False</code> if you are
     * not able to cancel your service software version.
     * </p>
     * 
     * @return True</code> if you are able to cancel your service software version update. <code>False
     */

    public Boolean getCancellable() {
        return this.cancellable;
    }

    /**
     * <p>
     * <code>True</code> if you are able to cancel your service software version update. <code>False</code> if you are
     * not able to cancel your service software version.
     * </p>
     * 
     * @param cancellable
     *        True</code> if you are able to cancel your service software version update. <code>False
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceSoftwareOptions withCancellable(Boolean cancellable) {
        setCancellable(cancellable);
        return this;
    }

    /**
     * <p>
     * <code>True</code> if you are able to cancel your service software version update. <code>False</code> if you are
     * not able to cancel your service software version.
     * </p>
     * 
     * @return True</code> if you are able to cancel your service software version update. <code>False
     */

    public Boolean isCancellable() {
        return this.cancellable;
    }

    /**
     * <p>
     * The status of your service software update. This field can take the following values: <code>ELIGIBLE</code>,
     * <code>PENDING_UPDATE</code>, <code>IN_PROGRESS</code>, <code>COMPLETED</code>, and <code>NOT_ELIGIBLE</code>.
     * </p>
     * 
     * @param updateStatus
     *        The status of your service software update. This field can take the following values:
     *        <code>ELIGIBLE</code>, <code>PENDING_UPDATE</code>, <code>IN_PROGRESS</code>, <code>COMPLETED</code>, and
     *        <code>NOT_ELIGIBLE</code>.
     * @see DeploymentStatus
     */

    public void setUpdateStatus(String updateStatus) {
        this.updateStatus = updateStatus;
    }

    /**
     * <p>
     * The status of your service software update. This field can take the following values: <code>ELIGIBLE</code>,
     * <code>PENDING_UPDATE</code>, <code>IN_PROGRESS</code>, <code>COMPLETED</code>, and <code>NOT_ELIGIBLE</code>.
     * </p>
     * 
     * @return The status of your service software update. This field can take the following values:
     *         <code>ELIGIBLE</code>, <code>PENDING_UPDATE</code>, <code>IN_PROGRESS</code>, <code>COMPLETED</code>, and
     *         <code>NOT_ELIGIBLE</code>.
     * @see DeploymentStatus
     */

    public String getUpdateStatus() {
        return this.updateStatus;
    }

    /**
     * <p>
     * The status of your service software update. This field can take the following values: <code>ELIGIBLE</code>,
     * <code>PENDING_UPDATE</code>, <code>IN_PROGRESS</code>, <code>COMPLETED</code>, and <code>NOT_ELIGIBLE</code>.
     * </p>
     * 
     * @param updateStatus
     *        The status of your service software update. This field can take the following values:
     *        <code>ELIGIBLE</code>, <code>PENDING_UPDATE</code>, <code>IN_PROGRESS</code>, <code>COMPLETED</code>, and
     *        <code>NOT_ELIGIBLE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public ServiceSoftwareOptions withUpdateStatus(String updateStatus) {
        setUpdateStatus(updateStatus);
        return this;
    }

    /**
     * <p>
     * The status of your service software update. This field can take the following values: <code>ELIGIBLE</code>,
     * <code>PENDING_UPDATE</code>, <code>IN_PROGRESS</code>, <code>COMPLETED</code>, and <code>NOT_ELIGIBLE</code>.
     * </p>
     * 
     * @param updateStatus
     *        The status of your service software update. This field can take the following values:
     *        <code>ELIGIBLE</code>, <code>PENDING_UPDATE</code>, <code>IN_PROGRESS</code>, <code>COMPLETED</code>, and
     *        <code>NOT_ELIGIBLE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public ServiceSoftwareOptions withUpdateStatus(DeploymentStatus updateStatus) {
        this.updateStatus = updateStatus.toString();
        return this;
    }

    /**
     * <p>
     * The description of the <code>UpdateStatus</code>.
     * </p>
     * 
     * @param description
     *        The description of the <code>UpdateStatus</code>.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the <code>UpdateStatus</code>.
     * </p>
     * 
     * @return The description of the <code>UpdateStatus</code>.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the <code>UpdateStatus</code>.
     * </p>
     * 
     * @param description
     *        The description of the <code>UpdateStatus</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceSoftwareOptions withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Timestamp, in Epoch time, until which you can manually request a service software update. After this date, we
     * automatically update your service software.
     * </p>
     * 
     * @param automatedUpdateDate
     *        Timestamp, in Epoch time, until which you can manually request a service software update. After this date,
     *        we automatically update your service software.
     */

    public void setAutomatedUpdateDate(java.util.Date automatedUpdateDate) {
        this.automatedUpdateDate = automatedUpdateDate;
    }

    /**
     * <p>
     * Timestamp, in Epoch time, until which you can manually request a service software update. After this date, we
     * automatically update your service software.
     * </p>
     * 
     * @return Timestamp, in Epoch time, until which you can manually request a service software update. After this
     *         date, we automatically update your service software.
     */

    public java.util.Date getAutomatedUpdateDate() {
        return this.automatedUpdateDate;
    }

    /**
     * <p>
     * Timestamp, in Epoch time, until which you can manually request a service software update. After this date, we
     * automatically update your service software.
     * </p>
     * 
     * @param automatedUpdateDate
     *        Timestamp, in Epoch time, until which you can manually request a service software update. After this date,
     *        we automatically update your service software.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceSoftwareOptions withAutomatedUpdateDate(java.util.Date automatedUpdateDate) {
        setAutomatedUpdateDate(automatedUpdateDate);
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
        if (getCurrentVersion() != null)
            sb.append("CurrentVersion: ").append(getCurrentVersion()).append(",");
        if (getNewVersion() != null)
            sb.append("NewVersion: ").append(getNewVersion()).append(",");
        if (getUpdateAvailable() != null)
            sb.append("UpdateAvailable: ").append(getUpdateAvailable()).append(",");
        if (getCancellable() != null)
            sb.append("Cancellable: ").append(getCancellable()).append(",");
        if (getUpdateStatus() != null)
            sb.append("UpdateStatus: ").append(getUpdateStatus()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getAutomatedUpdateDate() != null)
            sb.append("AutomatedUpdateDate: ").append(getAutomatedUpdateDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceSoftwareOptions == false)
            return false;
        ServiceSoftwareOptions other = (ServiceSoftwareOptions) obj;
        if (other.getCurrentVersion() == null ^ this.getCurrentVersion() == null)
            return false;
        if (other.getCurrentVersion() != null && other.getCurrentVersion().equals(this.getCurrentVersion()) == false)
            return false;
        if (other.getNewVersion() == null ^ this.getNewVersion() == null)
            return false;
        if (other.getNewVersion() != null && other.getNewVersion().equals(this.getNewVersion()) == false)
            return false;
        if (other.getUpdateAvailable() == null ^ this.getUpdateAvailable() == null)
            return false;
        if (other.getUpdateAvailable() != null && other.getUpdateAvailable().equals(this.getUpdateAvailable()) == false)
            return false;
        if (other.getCancellable() == null ^ this.getCancellable() == null)
            return false;
        if (other.getCancellable() != null && other.getCancellable().equals(this.getCancellable()) == false)
            return false;
        if (other.getUpdateStatus() == null ^ this.getUpdateStatus() == null)
            return false;
        if (other.getUpdateStatus() != null && other.getUpdateStatus().equals(this.getUpdateStatus()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAutomatedUpdateDate() == null ^ this.getAutomatedUpdateDate() == null)
            return false;
        if (other.getAutomatedUpdateDate() != null && other.getAutomatedUpdateDate().equals(this.getAutomatedUpdateDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCurrentVersion() == null) ? 0 : getCurrentVersion().hashCode());
        hashCode = prime * hashCode + ((getNewVersion() == null) ? 0 : getNewVersion().hashCode());
        hashCode = prime * hashCode + ((getUpdateAvailable() == null) ? 0 : getUpdateAvailable().hashCode());
        hashCode = prime * hashCode + ((getCancellable() == null) ? 0 : getCancellable().hashCode());
        hashCode = prime * hashCode + ((getUpdateStatus() == null) ? 0 : getUpdateStatus().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAutomatedUpdateDate() == null) ? 0 : getAutomatedUpdateDate().hashCode());
        return hashCode;
    }

    @Override
    public ServiceSoftwareOptions clone() {
        try {
            return (ServiceSoftwareOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticsearch.model.transform.ServiceSoftwareOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
