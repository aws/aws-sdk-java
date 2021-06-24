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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the state of the domain relative to the latest service software.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsElasticsearchDomainServiceSoftwareOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsElasticsearchDomainServiceSoftwareOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The epoch time when the deployment window closes for required updates. After this time, Amazon Elasticsearch
     * Service schedules the software upgrade automatically.
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
     * The status of the service software update.
     * </p>
     */
    private String updateStatus;

    /**
     * <p>
     * The epoch time when the deployment window closes for required updates. After this time, Amazon Elasticsearch
     * Service schedules the software upgrade automatically.
     * </p>
     * 
     * @param automatedUpdateDate
     *        The epoch time when the deployment window closes for required updates. After this time, Amazon
     *        Elasticsearch Service schedules the software upgrade automatically.
     */

    public void setAutomatedUpdateDate(String automatedUpdateDate) {
        this.automatedUpdateDate = automatedUpdateDate;
    }

    /**
     * <p>
     * The epoch time when the deployment window closes for required updates. After this time, Amazon Elasticsearch
     * Service schedules the software upgrade automatically.
     * </p>
     * 
     * @return The epoch time when the deployment window closes for required updates. After this time, Amazon
     *         Elasticsearch Service schedules the software upgrade automatically.
     */

    public String getAutomatedUpdateDate() {
        return this.automatedUpdateDate;
    }

    /**
     * <p>
     * The epoch time when the deployment window closes for required updates. After this time, Amazon Elasticsearch
     * Service schedules the software upgrade automatically.
     * </p>
     * 
     * @param automatedUpdateDate
     *        The epoch time when the deployment window closes for required updates. After this time, Amazon
     *        Elasticsearch Service schedules the software upgrade automatically.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticsearchDomainServiceSoftwareOptions withAutomatedUpdateDate(String automatedUpdateDate) {
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

    public AwsElasticsearchDomainServiceSoftwareOptions withCancellable(Boolean cancellable) {
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

    public AwsElasticsearchDomainServiceSoftwareOptions withCurrentVersion(String currentVersion) {
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

    public AwsElasticsearchDomainServiceSoftwareOptions withDescription(String description) {
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

    public AwsElasticsearchDomainServiceSoftwareOptions withNewVersion(String newVersion) {
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

    public AwsElasticsearchDomainServiceSoftwareOptions withUpdateAvailable(Boolean updateAvailable) {
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
     * The status of the service software update.
     * </p>
     * 
     * @param updateStatus
     *        The status of the service software update.
     */

    public void setUpdateStatus(String updateStatus) {
        this.updateStatus = updateStatus;
    }

    /**
     * <p>
     * The status of the service software update.
     * </p>
     * 
     * @return The status of the service software update.
     */

    public String getUpdateStatus() {
        return this.updateStatus;
    }

    /**
     * <p>
     * The status of the service software update.
     * </p>
     * 
     * @param updateStatus
     *        The status of the service software update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticsearchDomainServiceSoftwareOptions withUpdateStatus(String updateStatus) {
        setUpdateStatus(updateStatus);
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
            sb.append("UpdateStatus: ").append(getUpdateStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsElasticsearchDomainServiceSoftwareOptions == false)
            return false;
        AwsElasticsearchDomainServiceSoftwareOptions other = (AwsElasticsearchDomainServiceSoftwareOptions) obj;
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
        return hashCode;
    }

    @Override
    public AwsElasticsearchDomainServiceSoftwareOptions clone() {
        try {
            return (AwsElasticsearchDomainServiceSoftwareOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsElasticsearchDomainServiceSoftwareOptionsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
