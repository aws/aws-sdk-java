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
package com.amazonaws.services.launchwizard.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a workload.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/WorkloadData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkloadData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The description of a workload.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The display name of a workload.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The URL of a workload document.
     * </p>
     */
    private String documentationUrl;
    /**
     * <p>
     * The URL of a workload icon.
     * </p>
     */
    private String iconUrl;
    /**
     * <p>
     * The status of a workload.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The message about a workload's status.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The name of the workload.
     * </p>
     */
    private String workloadName;

    /**
     * <p>
     * The description of a workload.
     * </p>
     * 
     * @param description
     *        The description of a workload.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of a workload.
     * </p>
     * 
     * @return The description of a workload.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of a workload.
     * </p>
     * 
     * @param description
     *        The description of a workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkloadData withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The display name of a workload.
     * </p>
     * 
     * @param displayName
     *        The display name of a workload.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of a workload.
     * </p>
     * 
     * @return The display name of a workload.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of a workload.
     * </p>
     * 
     * @param displayName
     *        The display name of a workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkloadData withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The URL of a workload document.
     * </p>
     * 
     * @param documentationUrl
     *        The URL of a workload document.
     */

    public void setDocumentationUrl(String documentationUrl) {
        this.documentationUrl = documentationUrl;
    }

    /**
     * <p>
     * The URL of a workload document.
     * </p>
     * 
     * @return The URL of a workload document.
     */

    public String getDocumentationUrl() {
        return this.documentationUrl;
    }

    /**
     * <p>
     * The URL of a workload document.
     * </p>
     * 
     * @param documentationUrl
     *        The URL of a workload document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkloadData withDocumentationUrl(String documentationUrl) {
        setDocumentationUrl(documentationUrl);
        return this;
    }

    /**
     * <p>
     * The URL of a workload icon.
     * </p>
     * 
     * @param iconUrl
     *        The URL of a workload icon.
     */

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    /**
     * <p>
     * The URL of a workload icon.
     * </p>
     * 
     * @return The URL of a workload icon.
     */

    public String getIconUrl() {
        return this.iconUrl;
    }

    /**
     * <p>
     * The URL of a workload icon.
     * </p>
     * 
     * @param iconUrl
     *        The URL of a workload icon.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkloadData withIconUrl(String iconUrl) {
        setIconUrl(iconUrl);
        return this;
    }

    /**
     * <p>
     * The status of a workload.
     * </p>
     * 
     * @param status
     *        The status of a workload.
     * @see WorkloadStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a workload.
     * </p>
     * 
     * @return The status of a workload.
     * @see WorkloadStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a workload.
     * </p>
     * 
     * @param status
     *        The status of a workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkloadStatus
     */

    public WorkloadData withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of a workload.
     * </p>
     * 
     * @param status
     *        The status of a workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkloadStatus
     */

    public WorkloadData withStatus(WorkloadStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The message about a workload's status.
     * </p>
     * 
     * @param statusMessage
     *        The message about a workload's status.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The message about a workload's status.
     * </p>
     * 
     * @return The message about a workload's status.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The message about a workload's status.
     * </p>
     * 
     * @param statusMessage
     *        The message about a workload's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkloadData withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The name of the workload.
     * </p>
     * 
     * @param workloadName
     *        The name of the workload.
     */

    public void setWorkloadName(String workloadName) {
        this.workloadName = workloadName;
    }

    /**
     * <p>
     * The name of the workload.
     * </p>
     * 
     * @return The name of the workload.
     */

    public String getWorkloadName() {
        return this.workloadName;
    }

    /**
     * <p>
     * The name of the workload.
     * </p>
     * 
     * @param workloadName
     *        The name of the workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkloadData withWorkloadName(String workloadName) {
        setWorkloadName(workloadName);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getDocumentationUrl() != null)
            sb.append("DocumentationUrl: ").append(getDocumentationUrl()).append(",");
        if (getIconUrl() != null)
            sb.append("IconUrl: ").append(getIconUrl()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getWorkloadName() != null)
            sb.append("WorkloadName: ").append(getWorkloadName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkloadData == false)
            return false;
        WorkloadData other = (WorkloadData) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getDocumentationUrl() == null ^ this.getDocumentationUrl() == null)
            return false;
        if (other.getDocumentationUrl() != null && other.getDocumentationUrl().equals(this.getDocumentationUrl()) == false)
            return false;
        if (other.getIconUrl() == null ^ this.getIconUrl() == null)
            return false;
        if (other.getIconUrl() != null && other.getIconUrl().equals(this.getIconUrl()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getWorkloadName() == null ^ this.getWorkloadName() == null)
            return false;
        if (other.getWorkloadName() != null && other.getWorkloadName().equals(this.getWorkloadName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getDocumentationUrl() == null) ? 0 : getDocumentationUrl().hashCode());
        hashCode = prime * hashCode + ((getIconUrl() == null) ? 0 : getIconUrl().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getWorkloadName() == null) ? 0 : getWorkloadName().hashCode());
        return hashCode;
    }

    @Override
    public WorkloadData clone() {
        try {
            return (WorkloadData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.launchwizard.model.transform.WorkloadDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
