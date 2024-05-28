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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A description of an Amazon Rekognition Custom Labels project. For more information, see <a>DescribeProjects</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProjectDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project.
     * </p>
     */
    private String projectArn;
    /**
     * <p>
     * The Unix timestamp for the date and time that the project was created.
     * </p>
     */
    private java.util.Date creationTimestamp;
    /**
     * <p>
     * The current status of the project.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Information about the training and test datasets in the project.
     * </p>
     */
    private java.util.List<DatasetMetadata> datasets;
    /**
     * <p>
     * Specifies the project that is being customized.
     * </p>
     */
    private String feature;
    /**
     * <p>
     * Indicates whether automatic retraining will be attempted for the versions of the project. Applies only to
     * adapters.
     * </p>
     */
    private String autoUpdate;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project.
     * </p>
     * 
     * @param projectArn
     *        The Amazon Resource Name (ARN) of the project.
     */

    public void setProjectArn(String projectArn) {
        this.projectArn = projectArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the project.
     */

    public String getProjectArn() {
        return this.projectArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project.
     * </p>
     * 
     * @param projectArn
     *        The Amazon Resource Name (ARN) of the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectDescription withProjectArn(String projectArn) {
        setProjectArn(projectArn);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for the date and time that the project was created.
     * </p>
     * 
     * @param creationTimestamp
     *        The Unix timestamp for the date and time that the project was created.
     */

    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * The Unix timestamp for the date and time that the project was created.
     * </p>
     * 
     * @return The Unix timestamp for the date and time that the project was created.
     */

    public java.util.Date getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * <p>
     * The Unix timestamp for the date and time that the project was created.
     * </p>
     * 
     * @param creationTimestamp
     *        The Unix timestamp for the date and time that the project was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectDescription withCreationTimestamp(java.util.Date creationTimestamp) {
        setCreationTimestamp(creationTimestamp);
        return this;
    }

    /**
     * <p>
     * The current status of the project.
     * </p>
     * 
     * @param status
     *        The current status of the project.
     * @see ProjectStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the project.
     * </p>
     * 
     * @return The current status of the project.
     * @see ProjectStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the project.
     * </p>
     * 
     * @param status
     *        The current status of the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProjectStatus
     */

    public ProjectDescription withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the project.
     * </p>
     * 
     * @param status
     *        The current status of the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProjectStatus
     */

    public ProjectDescription withStatus(ProjectStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Information about the training and test datasets in the project.
     * </p>
     * 
     * @return Information about the training and test datasets in the project.
     */

    public java.util.List<DatasetMetadata> getDatasets() {
        return datasets;
    }

    /**
     * <p>
     * Information about the training and test datasets in the project.
     * </p>
     * 
     * @param datasets
     *        Information about the training and test datasets in the project.
     */

    public void setDatasets(java.util.Collection<DatasetMetadata> datasets) {
        if (datasets == null) {
            this.datasets = null;
            return;
        }

        this.datasets = new java.util.ArrayList<DatasetMetadata>(datasets);
    }

    /**
     * <p>
     * Information about the training and test datasets in the project.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatasets(java.util.Collection)} or {@link #withDatasets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param datasets
     *        Information about the training and test datasets in the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectDescription withDatasets(DatasetMetadata... datasets) {
        if (this.datasets == null) {
            setDatasets(new java.util.ArrayList<DatasetMetadata>(datasets.length));
        }
        for (DatasetMetadata ele : datasets) {
            this.datasets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the training and test datasets in the project.
     * </p>
     * 
     * @param datasets
     *        Information about the training and test datasets in the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectDescription withDatasets(java.util.Collection<DatasetMetadata> datasets) {
        setDatasets(datasets);
        return this;
    }

    /**
     * <p>
     * Specifies the project that is being customized.
     * </p>
     * 
     * @param feature
     *        Specifies the project that is being customized.
     * @see CustomizationFeature
     */

    public void setFeature(String feature) {
        this.feature = feature;
    }

    /**
     * <p>
     * Specifies the project that is being customized.
     * </p>
     * 
     * @return Specifies the project that is being customized.
     * @see CustomizationFeature
     */

    public String getFeature() {
        return this.feature;
    }

    /**
     * <p>
     * Specifies the project that is being customized.
     * </p>
     * 
     * @param feature
     *        Specifies the project that is being customized.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomizationFeature
     */

    public ProjectDescription withFeature(String feature) {
        setFeature(feature);
        return this;
    }

    /**
     * <p>
     * Specifies the project that is being customized.
     * </p>
     * 
     * @param feature
     *        Specifies the project that is being customized.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomizationFeature
     */

    public ProjectDescription withFeature(CustomizationFeature feature) {
        this.feature = feature.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether automatic retraining will be attempted for the versions of the project. Applies only to
     * adapters.
     * </p>
     * 
     * @param autoUpdate
     *        Indicates whether automatic retraining will be attempted for the versions of the project. Applies only to
     *        adapters.
     * @see ProjectAutoUpdate
     */

    public void setAutoUpdate(String autoUpdate) {
        this.autoUpdate = autoUpdate;
    }

    /**
     * <p>
     * Indicates whether automatic retraining will be attempted for the versions of the project. Applies only to
     * adapters.
     * </p>
     * 
     * @return Indicates whether automatic retraining will be attempted for the versions of the project. Applies only to
     *         adapters.
     * @see ProjectAutoUpdate
     */

    public String getAutoUpdate() {
        return this.autoUpdate;
    }

    /**
     * <p>
     * Indicates whether automatic retraining will be attempted for the versions of the project. Applies only to
     * adapters.
     * </p>
     * 
     * @param autoUpdate
     *        Indicates whether automatic retraining will be attempted for the versions of the project. Applies only to
     *        adapters.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProjectAutoUpdate
     */

    public ProjectDescription withAutoUpdate(String autoUpdate) {
        setAutoUpdate(autoUpdate);
        return this;
    }

    /**
     * <p>
     * Indicates whether automatic retraining will be attempted for the versions of the project. Applies only to
     * adapters.
     * </p>
     * 
     * @param autoUpdate
     *        Indicates whether automatic retraining will be attempted for the versions of the project. Applies only to
     *        adapters.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProjectAutoUpdate
     */

    public ProjectDescription withAutoUpdate(ProjectAutoUpdate autoUpdate) {
        this.autoUpdate = autoUpdate.toString();
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
        if (getProjectArn() != null)
            sb.append("ProjectArn: ").append(getProjectArn()).append(",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: ").append(getCreationTimestamp()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDatasets() != null)
            sb.append("Datasets: ").append(getDatasets()).append(",");
        if (getFeature() != null)
            sb.append("Feature: ").append(getFeature()).append(",");
        if (getAutoUpdate() != null)
            sb.append("AutoUpdate: ").append(getAutoUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProjectDescription == false)
            return false;
        ProjectDescription other = (ProjectDescription) obj;
        if (other.getProjectArn() == null ^ this.getProjectArn() == null)
            return false;
        if (other.getProjectArn() != null && other.getProjectArn().equals(this.getProjectArn()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDatasets() == null ^ this.getDatasets() == null)
            return false;
        if (other.getDatasets() != null && other.getDatasets().equals(this.getDatasets()) == false)
            return false;
        if (other.getFeature() == null ^ this.getFeature() == null)
            return false;
        if (other.getFeature() != null && other.getFeature().equals(this.getFeature()) == false)
            return false;
        if (other.getAutoUpdate() == null ^ this.getAutoUpdate() == null)
            return false;
        if (other.getAutoUpdate() != null && other.getAutoUpdate().equals(this.getAutoUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectArn() == null) ? 0 : getProjectArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDatasets() == null) ? 0 : getDatasets().hashCode());
        hashCode = prime * hashCode + ((getFeature() == null) ? 0 : getFeature().hashCode());
        hashCode = prime * hashCode + ((getAutoUpdate() == null) ? 0 : getAutoUpdate().hashCode());
        return hashCode;
    }

    @Override
    public ProjectDescription clone() {
        try {
            return (ProjectDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.ProjectDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
