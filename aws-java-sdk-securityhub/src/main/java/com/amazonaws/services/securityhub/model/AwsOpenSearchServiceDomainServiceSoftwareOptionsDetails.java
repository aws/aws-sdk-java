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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the state of the domain relative to the latest service software.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsOpenSearchServiceDomainServiceSoftwareOptionsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsOpenSearchServiceDomainServiceSoftwareOptionsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The epoch time when the deployment window closes for required updates. After this time, OpenSearch Service
     * schedules the software upgrade automatically.
     * </p>
     */
    private String automatedUpdateDate;
    /**
     * <p>
     * Whether a request to update the domain can be canceled.
     * </p>
     */
    private Boolean cancellable;
    /**
     * <p>
     * The version of the service software that is currently installed on the domain.
     * </p>
     */
    private String currentVersion;
    /**
     * <p>
     * A more detailed description of the service software status.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The most recent version of the service software.
     * </p>
     */
    private String newVersion;
    /**
     * <p>
     * Whether a service software update is available for the domain.
     * </p>
     */
    private Boolean updateAvailable;
    /**
     * <p>
     * The status of the service software update. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLETED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ELIGIBLE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_ELIGIBLE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_UPDATE</code>
     * </p>
     * </li>
     * </ul>
     */
    private String updateStatus;
    /**
     * <p>
     * Whether the service software update is optional.
     * </p>
     */
    private Boolean optionalDeployment;

    /**
     * <p>
     * The epoch time when the deployment window closes for required updates. After this time, OpenSearch Service
     * schedules the software upgrade automatically.
     * </p>
     * 
     * @param automatedUpdateDate
     *        The epoch time when the deployment window closes for required updates. After this time, OpenSearch Service
     *        schedules the software upgrade automatically.
     */

    public void setAutomatedUpdateDate(String automatedUpdateDate) {
        this.automatedUpdateDate = automatedUpdateDate;
    }

    /**
     * <p>
     * The epoch time when the deployment window closes for required updates. After this time, OpenSearch Service
     * schedules the software upgrade automatically.
     * </p>
     * 
     * @return The epoch time when the deployment window closes for required updates. After this time, OpenSearch
     *         Service schedules the software upgrade automatically.
     */

    public String getAutomatedUpdateDate() {
        return this.automatedUpdateDate;
    }

    /**
     * <p>
     * The epoch time when the deployment window closes for required updates. After this time, OpenSearch Service
     * schedules the software upgrade automatically.
     * </p>
     * 
     * @param automatedUpdateDate
     *        The epoch time when the deployment window closes for required updates. After this time, OpenSearch Service
     *        schedules the software upgrade automatically.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainServiceSoftwareOptionsDetails withAutomatedUpdateDate(String automatedUpdateDate) {
        setAutomatedUpdateDate(automatedUpdateDate);
        return this;
    }

    /**
     * <p>
     * Whether a request to update the domain can be canceled.
     * </p>
     * 
     * @param cancellable
     *        Whether a request to update the domain can be canceled.
     */

    public void setCancellable(Boolean cancellable) {
        this.cancellable = cancellable;
    }

    /**
     * <p>
     * Whether a request to update the domain can be canceled.
     * </p>
     * 
     * @return Whether a request to update the domain can be canceled.
     */

    public Boolean getCancellable() {
        return this.cancellable;
    }

    /**
     * <p>
     * Whether a request to update the domain can be canceled.
     * </p>
     * 
     * @param cancellable
     *        Whether a request to update the domain can be canceled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainServiceSoftwareOptionsDetails withCancellable(Boolean cancellable) {
        setCancellable(cancellable);
        return this;
    }

    /**
     * <p>
     * Whether a request to update the domain can be canceled.
     * </p>
     * 
     * @return Whether a request to update the domain can be canceled.
     */

    public Boolean isCancellable() {
        return this.cancellable;
    }

    /**
     * <p>
     * The version of the service software that is currently installed on the domain.
     * </p>
     * 
     * @param currentVersion
     *        The version of the service software that is currently installed on the domain.
     */

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * <p>
     * The version of the service software that is currently installed on the domain.
     * </p>
     * 
     * @return The version of the service software that is currently installed on the domain.
     */

    public String getCurrentVersion() {
        return this.currentVersion;
    }

    /**
     * <p>
     * The version of the service software that is currently installed on the domain.
     * </p>
     * 
     * @param currentVersion
     *        The version of the service software that is currently installed on the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainServiceSoftwareOptionsDetails withCurrentVersion(String currentVersion) {
        setCurrentVersion(currentVersion);
        return this;
    }

    /**
     * <p>
     * A more detailed description of the service software status.
     * </p>
     * 
     * @param description
     *        A more detailed description of the service software status.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A more detailed description of the service software status.
     * </p>
     * 
     * @return A more detailed description of the service software status.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A more detailed description of the service software status.
     * </p>
     * 
     * @param description
     *        A more detailed description of the service software status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainServiceSoftwareOptionsDetails withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The most recent version of the service software.
     * </p>
     * 
     * @param newVersion
     *        The most recent version of the service software.
     */

    public void setNewVersion(String newVersion) {
        this.newVersion = newVersion;
    }

    /**
     * <p>
     * The most recent version of the service software.
     * </p>
     * 
     * @return The most recent version of the service software.
     */

    public String getNewVersion() {
        return this.newVersion;
    }

    /**
     * <p>
     * The most recent version of the service software.
     * </p>
     * 
     * @param newVersion
     *        The most recent version of the service software.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainServiceSoftwareOptionsDetails withNewVersion(String newVersion) {
        setNewVersion(newVersion);
        return this;
    }

    /**
     * <p>
     * Whether a service software update is available for the domain.
     * </p>
     * 
     * @param updateAvailable
     *        Whether a service software update is available for the domain.
     */

    public void setUpdateAvailable(Boolean updateAvailable) {
        this.updateAvailable = updateAvailable;
    }

    /**
     * <p>
     * Whether a service software update is available for the domain.
     * </p>
     * 
     * @return Whether a service software update is available for the domain.
     */

    public Boolean getUpdateAvailable() {
        return this.updateAvailable;
    }

    /**
     * <p>
     * Whether a service software update is available for the domain.
     * </p>
     * 
     * @param updateAvailable
     *        Whether a service software update is available for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainServiceSoftwareOptionsDetails withUpdateAvailable(Boolean updateAvailable) {
        setUpdateAvailable(updateAvailable);
        return this;
    }

    /**
     * <p>
     * Whether a service software update is available for the domain.
     * </p>
     * 
     * @return Whether a service software update is available for the domain.
     */

    public Boolean isUpdateAvailable() {
        return this.updateAvailable;
    }

    /**
     * <p>
     * The status of the service software update. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLETED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ELIGIBLE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_ELIGIBLE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_UPDATE</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateStatus
     *        The status of the service software update. Valid values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ELIGIBLE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_ELIGIBLE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING_UPDATE</code>
     *        </p>
     *        </li>
     */

    public void setUpdateStatus(String updateStatus) {
        this.updateStatus = updateStatus;
    }

    /**
     * <p>
     * The status of the service software update. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLETED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ELIGIBLE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_ELIGIBLE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_UPDATE</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the service software update. Valid values are as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>COMPLETED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ELIGIBLE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_PROGRESS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOT_ELIGIBLE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PENDING_UPDATE</code>
     *         </p>
     *         </li>
     */

    public String getUpdateStatus() {
        return this.updateStatus;
    }

    /**
     * <p>
     * The status of the service software update. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLETED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ELIGIBLE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_ELIGIBLE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_UPDATE</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateStatus
     *        The status of the service software update. Valid values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ELIGIBLE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_ELIGIBLE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING_UPDATE</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainServiceSoftwareOptionsDetails withUpdateStatus(String updateStatus) {
        setUpdateStatus(updateStatus);
        return this;
    }

    /**
     * <p>
     * Whether the service software update is optional.
     * </p>
     * 
     * @param optionalDeployment
     *        Whether the service software update is optional.
     */

    public void setOptionalDeployment(Boolean optionalDeployment) {
        this.optionalDeployment = optionalDeployment;
    }

    /**
     * <p>
     * Whether the service software update is optional.
     * </p>
     * 
     * @return Whether the service software update is optional.
     */

    public Boolean getOptionalDeployment() {
        return this.optionalDeployment;
    }

    /**
     * <p>
     * Whether the service software update is optional.
     * </p>
     * 
     * @param optionalDeployment
     *        Whether the service software update is optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainServiceSoftwareOptionsDetails withOptionalDeployment(Boolean optionalDeployment) {
        setOptionalDeployment(optionalDeployment);
        return this;
    }

    /**
     * <p>
     * Whether the service software update is optional.
     * </p>
     * 
     * @return Whether the service software update is optional.
     */

    public Boolean isOptionalDeployment() {
        return this.optionalDeployment;
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
        if (getAutomatedUpdateDate() != null)
            sb.append("AutomatedUpdateDate: ").append(getAutomatedUpdateDate()).append(",");
        if (getCancellable() != null)
            sb.append("Cancellable: ").append(getCancellable()).append(",");
        if (getCurrentVersion() != null)
            sb.append("CurrentVersion: ").append(getCurrentVersion()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getNewVersion() != null)
            sb.append("NewVersion: ").append(getNewVersion()).append(",");
        if (getUpdateAvailable() != null)
            sb.append("UpdateAvailable: ").append(getUpdateAvailable()).append(",");
        if (getUpdateStatus() != null)
            sb.append("UpdateStatus: ").append(getUpdateStatus()).append(",");
        if (getOptionalDeployment() != null)
            sb.append("OptionalDeployment: ").append(getOptionalDeployment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsOpenSearchServiceDomainServiceSoftwareOptionsDetails == false)
            return false;
        AwsOpenSearchServiceDomainServiceSoftwareOptionsDetails other = (AwsOpenSearchServiceDomainServiceSoftwareOptionsDetails) obj;
        if (other.getAutomatedUpdateDate() == null ^ this.getAutomatedUpdateDate() == null)
            return false;
        if (other.getAutomatedUpdateDate() != null && other.getAutomatedUpdateDate().equals(this.getAutomatedUpdateDate()) == false)
            return false;
        if (other.getCancellable() == null ^ this.getCancellable() == null)
            return false;
        if (other.getCancellable() != null && other.getCancellable().equals(this.getCancellable()) == false)
            return false;
        if (other.getCurrentVersion() == null ^ this.getCurrentVersion() == null)
            return false;
        if (other.getCurrentVersion() != null && other.getCurrentVersion().equals(this.getCurrentVersion()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getNewVersion() == null ^ this.getNewVersion() == null)
            return false;
        if (other.getNewVersion() != null && other.getNewVersion().equals(this.getNewVersion()) == false)
            return false;
        if (other.getUpdateAvailable() == null ^ this.getUpdateAvailable() == null)
            return false;
        if (other.getUpdateAvailable() != null && other.getUpdateAvailable().equals(this.getUpdateAvailable()) == false)
            return false;
        if (other.getUpdateStatus() == null ^ this.getUpdateStatus() == null)
            return false;
        if (other.getUpdateStatus() != null && other.getUpdateStatus().equals(this.getUpdateStatus()) == false)
            return false;
        if (other.getOptionalDeployment() == null ^ this.getOptionalDeployment() == null)
            return false;
        if (other.getOptionalDeployment() != null && other.getOptionalDeployment().equals(this.getOptionalDeployment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutomatedUpdateDate() == null) ? 0 : getAutomatedUpdateDate().hashCode());
        hashCode = prime * hashCode + ((getCancellable() == null) ? 0 : getCancellable().hashCode());
        hashCode = prime * hashCode + ((getCurrentVersion() == null) ? 0 : getCurrentVersion().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getNewVersion() == null) ? 0 : getNewVersion().hashCode());
        hashCode = prime * hashCode + ((getUpdateAvailable() == null) ? 0 : getUpdateAvailable().hashCode());
        hashCode = prime * hashCode + ((getUpdateStatus() == null) ? 0 : getUpdateStatus().hashCode());
        hashCode = prime * hashCode + ((getOptionalDeployment() == null) ? 0 : getOptionalDeployment().hashCode());
        return hashCode;
    }

    @Override
    public AwsOpenSearchServiceDomainServiceSoftwareOptionsDetails clone() {
        try {
            return (AwsOpenSearchServiceDomainServiceSoftwareOptionsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsOpenSearchServiceDomainServiceSoftwareOptionsDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
