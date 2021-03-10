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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about an access preview.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/AccessPreview" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessPreview implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the analyzer used to generate the access preview.
     * </p>
     */
    private String analyzerArn;
    /**
     * <p>
     * A map of resource ARNs for the proposed resource configuration.
     * </p>
     */
    private java.util.Map<String, Configuration> configurations;
    /**
     * <p>
     * The time at which the access preview was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The unique ID for the access preview.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The status of the access preview.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Creating</code> - The access preview creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Completed</code> - The access preview is complete. You can preview findings for external access to the
     * resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The access preview creation has failed.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * Provides more details about the current status of the access preview.
     * </p>
     * <p>
     * For example, if the creation of the access preview fails, a <code>Failed</code> status is returned. This failure
     * can be due to an internal issue with the analysis or due to an invalid resource configuration.
     * </p>
     */
    private AccessPreviewStatusReason statusReason;

    /**
     * <p>
     * The ARN of the analyzer used to generate the access preview.
     * </p>
     * 
     * @param analyzerArn
     *        The ARN of the analyzer used to generate the access preview.
     */

    public void setAnalyzerArn(String analyzerArn) {
        this.analyzerArn = analyzerArn;
    }

    /**
     * <p>
     * The ARN of the analyzer used to generate the access preview.
     * </p>
     * 
     * @return The ARN of the analyzer used to generate the access preview.
     */

    public String getAnalyzerArn() {
        return this.analyzerArn;
    }

    /**
     * <p>
     * The ARN of the analyzer used to generate the access preview.
     * </p>
     * 
     * @param analyzerArn
     *        The ARN of the analyzer used to generate the access preview.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessPreview withAnalyzerArn(String analyzerArn) {
        setAnalyzerArn(analyzerArn);
        return this;
    }

    /**
     * <p>
     * A map of resource ARNs for the proposed resource configuration.
     * </p>
     * 
     * @return A map of resource ARNs for the proposed resource configuration.
     */

    public java.util.Map<String, Configuration> getConfigurations() {
        return configurations;
    }

    /**
     * <p>
     * A map of resource ARNs for the proposed resource configuration.
     * </p>
     * 
     * @param configurations
     *        A map of resource ARNs for the proposed resource configuration.
     */

    public void setConfigurations(java.util.Map<String, Configuration> configurations) {
        this.configurations = configurations;
    }

    /**
     * <p>
     * A map of resource ARNs for the proposed resource configuration.
     * </p>
     * 
     * @param configurations
     *        A map of resource ARNs for the proposed resource configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessPreview withConfigurations(java.util.Map<String, Configuration> configurations) {
        setConfigurations(configurations);
        return this;
    }

    /**
     * Add a single Configurations entry
     *
     * @see AccessPreview#withConfigurations
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AccessPreview addConfigurationsEntry(String key, Configuration value) {
        if (null == this.configurations) {
            this.configurations = new java.util.HashMap<String, Configuration>();
        }
        if (this.configurations.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.configurations.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Configurations.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessPreview clearConfigurationsEntries() {
        this.configurations = null;
        return this;
    }

    /**
     * <p>
     * The time at which the access preview was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the access preview was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the access preview was created.
     * </p>
     * 
     * @return The time at which the access preview was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time at which the access preview was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the access preview was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessPreview withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The unique ID for the access preview.
     * </p>
     * 
     * @param id
     *        The unique ID for the access preview.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique ID for the access preview.
     * </p>
     * 
     * @return The unique ID for the access preview.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique ID for the access preview.
     * </p>
     * 
     * @param id
     *        The unique ID for the access preview.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessPreview withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The status of the access preview.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Creating</code> - The access preview creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Completed</code> - The access preview is complete. You can preview findings for external access to the
     * resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The access preview creation has failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the access preview.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Creating</code> - The access preview creation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Completed</code> - The access preview is complete. You can preview findings for external access to
     *        the resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> - The access preview creation has failed.
     *        </p>
     *        </li>
     * @see AccessPreviewStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the access preview.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Creating</code> - The access preview creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Completed</code> - The access preview is complete. You can preview findings for external access to the
     * resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The access preview creation has failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the access preview.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Creating</code> - The access preview creation is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Completed</code> - The access preview is complete. You can preview findings for external access to
     *         the resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Failed</code> - The access preview creation has failed.
     *         </p>
     *         </li>
     * @see AccessPreviewStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the access preview.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Creating</code> - The access preview creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Completed</code> - The access preview is complete. You can preview findings for external access to the
     * resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The access preview creation has failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the access preview.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Creating</code> - The access preview creation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Completed</code> - The access preview is complete. You can preview findings for external access to
     *        the resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> - The access preview creation has failed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessPreviewStatus
     */

    public AccessPreview withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the access preview.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Creating</code> - The access preview creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Completed</code> - The access preview is complete. You can preview findings for external access to the
     * resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The access preview creation has failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the access preview.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Creating</code> - The access preview creation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Completed</code> - The access preview is complete. You can preview findings for external access to
     *        the resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> - The access preview creation has failed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessPreviewStatus
     */

    public AccessPreview withStatus(AccessPreviewStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Provides more details about the current status of the access preview.
     * </p>
     * <p>
     * For example, if the creation of the access preview fails, a <code>Failed</code> status is returned. This failure
     * can be due to an internal issue with the analysis or due to an invalid resource configuration.
     * </p>
     * 
     * @param statusReason
     *        Provides more details about the current status of the access preview.</p>
     *        <p>
     *        For example, if the creation of the access preview fails, a <code>Failed</code> status is returned. This
     *        failure can be due to an internal issue with the analysis or due to an invalid resource configuration.
     */

    public void setStatusReason(AccessPreviewStatusReason statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * Provides more details about the current status of the access preview.
     * </p>
     * <p>
     * For example, if the creation of the access preview fails, a <code>Failed</code> status is returned. This failure
     * can be due to an internal issue with the analysis or due to an invalid resource configuration.
     * </p>
     * 
     * @return Provides more details about the current status of the access preview.</p>
     *         <p>
     *         For example, if the creation of the access preview fails, a <code>Failed</code> status is returned. This
     *         failure can be due to an internal issue with the analysis or due to an invalid resource configuration.
     */

    public AccessPreviewStatusReason getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * Provides more details about the current status of the access preview.
     * </p>
     * <p>
     * For example, if the creation of the access preview fails, a <code>Failed</code> status is returned. This failure
     * can be due to an internal issue with the analysis or due to an invalid resource configuration.
     * </p>
     * 
     * @param statusReason
     *        Provides more details about the current status of the access preview.</p>
     *        <p>
     *        For example, if the creation of the access preview fails, a <code>Failed</code> status is returned. This
     *        failure can be due to an internal issue with the analysis or due to an invalid resource configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessPreview withStatusReason(AccessPreviewStatusReason statusReason) {
        setStatusReason(statusReason);
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
        if (getAnalyzerArn() != null)
            sb.append("AnalyzerArn: ").append(getAnalyzerArn()).append(",");
        if (getConfigurations() != null)
            sb.append("Configurations: ").append(getConfigurations()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessPreview == false)
            return false;
        AccessPreview other = (AccessPreview) obj;
        if (other.getAnalyzerArn() == null ^ this.getAnalyzerArn() == null)
            return false;
        if (other.getAnalyzerArn() != null && other.getAnalyzerArn().equals(this.getAnalyzerArn()) == false)
            return false;
        if (other.getConfigurations() == null ^ this.getConfigurations() == null)
            return false;
        if (other.getConfigurations() != null && other.getConfigurations().equals(this.getConfigurations()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnalyzerArn() == null) ? 0 : getAnalyzerArn().hashCode());
        hashCode = prime * hashCode + ((getConfigurations() == null) ? 0 : getConfigurations().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        return hashCode;
    }

    @Override
    public AccessPreview clone() {
        try {
            return (AccessPreview) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.AccessPreviewMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
