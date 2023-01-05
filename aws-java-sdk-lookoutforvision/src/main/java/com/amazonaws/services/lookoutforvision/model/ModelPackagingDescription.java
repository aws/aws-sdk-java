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
package com.amazonaws.services.lookoutforvision.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a model packaging job. For more information, see <a>DescribeModelPackagingJob</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/ModelPackagingDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelPackagingDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the model packaging job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The name of the project that's associated with a model that's in the model package.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * The version of the model used in the model packaging job.
     * </p>
     */
    private String modelVersion;
    /**
     * <p>
     * The configuration information used in the model packaging job.
     * </p>
     */
    private ModelPackagingConfiguration modelPackagingConfiguration;
    /**
     * <p>
     * The description for the model packaging job.
     * </p>
     */
    private String modelPackagingJobDescription;
    /**
     * <p>
     * The AWS service used to package the job. Currently Lookout for Vision can package jobs with AWS IoT Greengrass.
     * </p>
     */
    private String modelPackagingMethod;
    /**
     * <p>
     * Information about the output of the model packaging job. For more information, see
     * <a>DescribeModelPackagingJob</a>.
     * </p>
     */
    private ModelPackagingOutputDetails modelPackagingOutputDetails;
    /**
     * <p>
     * The status of the model packaging job.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status message for the model packaging job.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The Unix timestamp for the time and date that the model packaging job was created.
     * </p>
     */
    private java.util.Date creationTimestamp;
    /**
     * <p>
     * The Unix timestamp for the time and date that the model packaging job was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTimestamp;

    /**
     * <p>
     * The name of the model packaging job.
     * </p>
     * 
     * @param jobName
     *        The name of the model packaging job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the model packaging job.
     * </p>
     * 
     * @return The name of the model packaging job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the model packaging job.
     * </p>
     * 
     * @param jobName
     *        The name of the model packaging job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackagingDescription withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The name of the project that's associated with a model that's in the model package.
     * </p>
     * 
     * @param projectName
     *        The name of the project that's associated with a model that's in the model package.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name of the project that's associated with a model that's in the model package.
     * </p>
     * 
     * @return The name of the project that's associated with a model that's in the model package.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * The name of the project that's associated with a model that's in the model package.
     * </p>
     * 
     * @param projectName
     *        The name of the project that's associated with a model that's in the model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackagingDescription withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * The version of the model used in the model packaging job.
     * </p>
     * 
     * @param modelVersion
     *        The version of the model used in the model packaging job.
     */

    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    /**
     * <p>
     * The version of the model used in the model packaging job.
     * </p>
     * 
     * @return The version of the model used in the model packaging job.
     */

    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * <p>
     * The version of the model used in the model packaging job.
     * </p>
     * 
     * @param modelVersion
     *        The version of the model used in the model packaging job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackagingDescription withModelVersion(String modelVersion) {
        setModelVersion(modelVersion);
        return this;
    }

    /**
     * <p>
     * The configuration information used in the model packaging job.
     * </p>
     * 
     * @param modelPackagingConfiguration
     *        The configuration information used in the model packaging job.
     */

    public void setModelPackagingConfiguration(ModelPackagingConfiguration modelPackagingConfiguration) {
        this.modelPackagingConfiguration = modelPackagingConfiguration;
    }

    /**
     * <p>
     * The configuration information used in the model packaging job.
     * </p>
     * 
     * @return The configuration information used in the model packaging job.
     */

    public ModelPackagingConfiguration getModelPackagingConfiguration() {
        return this.modelPackagingConfiguration;
    }

    /**
     * <p>
     * The configuration information used in the model packaging job.
     * </p>
     * 
     * @param modelPackagingConfiguration
     *        The configuration information used in the model packaging job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackagingDescription withModelPackagingConfiguration(ModelPackagingConfiguration modelPackagingConfiguration) {
        setModelPackagingConfiguration(modelPackagingConfiguration);
        return this;
    }

    /**
     * <p>
     * The description for the model packaging job.
     * </p>
     * 
     * @param modelPackagingJobDescription
     *        The description for the model packaging job.
     */

    public void setModelPackagingJobDescription(String modelPackagingJobDescription) {
        this.modelPackagingJobDescription = modelPackagingJobDescription;
    }

    /**
     * <p>
     * The description for the model packaging job.
     * </p>
     * 
     * @return The description for the model packaging job.
     */

    public String getModelPackagingJobDescription() {
        return this.modelPackagingJobDescription;
    }

    /**
     * <p>
     * The description for the model packaging job.
     * </p>
     * 
     * @param modelPackagingJobDescription
     *        The description for the model packaging job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackagingDescription withModelPackagingJobDescription(String modelPackagingJobDescription) {
        setModelPackagingJobDescription(modelPackagingJobDescription);
        return this;
    }

    /**
     * <p>
     * The AWS service used to package the job. Currently Lookout for Vision can package jobs with AWS IoT Greengrass.
     * </p>
     * 
     * @param modelPackagingMethod
     *        The AWS service used to package the job. Currently Lookout for Vision can package jobs with AWS IoT
     *        Greengrass.
     */

    public void setModelPackagingMethod(String modelPackagingMethod) {
        this.modelPackagingMethod = modelPackagingMethod;
    }

    /**
     * <p>
     * The AWS service used to package the job. Currently Lookout for Vision can package jobs with AWS IoT Greengrass.
     * </p>
     * 
     * @return The AWS service used to package the job. Currently Lookout for Vision can package jobs with AWS IoT
     *         Greengrass.
     */

    public String getModelPackagingMethod() {
        return this.modelPackagingMethod;
    }

    /**
     * <p>
     * The AWS service used to package the job. Currently Lookout for Vision can package jobs with AWS IoT Greengrass.
     * </p>
     * 
     * @param modelPackagingMethod
     *        The AWS service used to package the job. Currently Lookout for Vision can package jobs with AWS IoT
     *        Greengrass.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackagingDescription withModelPackagingMethod(String modelPackagingMethod) {
        setModelPackagingMethod(modelPackagingMethod);
        return this;
    }

    /**
     * <p>
     * Information about the output of the model packaging job. For more information, see
     * <a>DescribeModelPackagingJob</a>.
     * </p>
     * 
     * @param modelPackagingOutputDetails
     *        Information about the output of the model packaging job. For more information, see
     *        <a>DescribeModelPackagingJob</a>.
     */

    public void setModelPackagingOutputDetails(ModelPackagingOutputDetails modelPackagingOutputDetails) {
        this.modelPackagingOutputDetails = modelPackagingOutputDetails;
    }

    /**
     * <p>
     * Information about the output of the model packaging job. For more information, see
     * <a>DescribeModelPackagingJob</a>.
     * </p>
     * 
     * @return Information about the output of the model packaging job. For more information, see
     *         <a>DescribeModelPackagingJob</a>.
     */

    public ModelPackagingOutputDetails getModelPackagingOutputDetails() {
        return this.modelPackagingOutputDetails;
    }

    /**
     * <p>
     * Information about the output of the model packaging job. For more information, see
     * <a>DescribeModelPackagingJob</a>.
     * </p>
     * 
     * @param modelPackagingOutputDetails
     *        Information about the output of the model packaging job. For more information, see
     *        <a>DescribeModelPackagingJob</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackagingDescription withModelPackagingOutputDetails(ModelPackagingOutputDetails modelPackagingOutputDetails) {
        setModelPackagingOutputDetails(modelPackagingOutputDetails);
        return this;
    }

    /**
     * <p>
     * The status of the model packaging job.
     * </p>
     * 
     * @param status
     *        The status of the model packaging job.
     * @see ModelPackagingJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the model packaging job.
     * </p>
     * 
     * @return The status of the model packaging job.
     * @see ModelPackagingJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the model packaging job.
     * </p>
     * 
     * @param status
     *        The status of the model packaging job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelPackagingJobStatus
     */

    public ModelPackagingDescription withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the model packaging job.
     * </p>
     * 
     * @param status
     *        The status of the model packaging job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelPackagingJobStatus
     */

    public ModelPackagingDescription withStatus(ModelPackagingJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status message for the model packaging job.
     * </p>
     * 
     * @param statusMessage
     *        The status message for the model packaging job.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message for the model packaging job.
     * </p>
     * 
     * @return The status message for the model packaging job.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message for the model packaging job.
     * </p>
     * 
     * @param statusMessage
     *        The status message for the model packaging job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackagingDescription withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for the time and date that the model packaging job was created.
     * </p>
     * 
     * @param creationTimestamp
     *        The Unix timestamp for the time and date that the model packaging job was created.
     */

    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * The Unix timestamp for the time and date that the model packaging job was created.
     * </p>
     * 
     * @return The Unix timestamp for the time and date that the model packaging job was created.
     */

    public java.util.Date getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * <p>
     * The Unix timestamp for the time and date that the model packaging job was created.
     * </p>
     * 
     * @param creationTimestamp
     *        The Unix timestamp for the time and date that the model packaging job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackagingDescription withCreationTimestamp(java.util.Date creationTimestamp) {
        setCreationTimestamp(creationTimestamp);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for the time and date that the model packaging job was last updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The Unix timestamp for the time and date that the model packaging job was last updated.
     */

    public void setLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The Unix timestamp for the time and date that the model packaging job was last updated.
     * </p>
     * 
     * @return The Unix timestamp for the time and date that the model packaging job was last updated.
     */

    public java.util.Date getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The Unix timestamp for the time and date that the model packaging job was last updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The Unix timestamp for the time and date that the model packaging job was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackagingDescription withLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        setLastUpdatedTimestamp(lastUpdatedTimestamp);
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
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getProjectName() != null)
            sb.append("ProjectName: ").append(getProjectName()).append(",");
        if (getModelVersion() != null)
            sb.append("ModelVersion: ").append(getModelVersion()).append(",");
        if (getModelPackagingConfiguration() != null)
            sb.append("ModelPackagingConfiguration: ").append(getModelPackagingConfiguration()).append(",");
        if (getModelPackagingJobDescription() != null)
            sb.append("ModelPackagingJobDescription: ").append(getModelPackagingJobDescription()).append(",");
        if (getModelPackagingMethod() != null)
            sb.append("ModelPackagingMethod: ").append(getModelPackagingMethod()).append(",");
        if (getModelPackagingOutputDetails() != null)
            sb.append("ModelPackagingOutputDetails: ").append(getModelPackagingOutputDetails()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: ").append(getCreationTimestamp()).append(",");
        if (getLastUpdatedTimestamp() != null)
            sb.append("LastUpdatedTimestamp: ").append(getLastUpdatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelPackagingDescription == false)
            return false;
        ModelPackagingDescription other = (ModelPackagingDescription) obj;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        if (other.getModelVersion() == null ^ this.getModelVersion() == null)
            return false;
        if (other.getModelVersion() != null && other.getModelVersion().equals(this.getModelVersion()) == false)
            return false;
        if (other.getModelPackagingConfiguration() == null ^ this.getModelPackagingConfiguration() == null)
            return false;
        if (other.getModelPackagingConfiguration() != null && other.getModelPackagingConfiguration().equals(this.getModelPackagingConfiguration()) == false)
            return false;
        if (other.getModelPackagingJobDescription() == null ^ this.getModelPackagingJobDescription() == null)
            return false;
        if (other.getModelPackagingJobDescription() != null && other.getModelPackagingJobDescription().equals(this.getModelPackagingJobDescription()) == false)
            return false;
        if (other.getModelPackagingMethod() == null ^ this.getModelPackagingMethod() == null)
            return false;
        if (other.getModelPackagingMethod() != null && other.getModelPackagingMethod().equals(this.getModelPackagingMethod()) == false)
            return false;
        if (other.getModelPackagingOutputDetails() == null ^ this.getModelPackagingOutputDetails() == null)
            return false;
        if (other.getModelPackagingOutputDetails() != null && other.getModelPackagingOutputDetails().equals(this.getModelPackagingOutputDetails()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getLastUpdatedTimestamp() == null ^ this.getLastUpdatedTimestamp() == null)
            return false;
        if (other.getLastUpdatedTimestamp() != null && other.getLastUpdatedTimestamp().equals(this.getLastUpdatedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getModelVersion() == null) ? 0 : getModelVersion().hashCode());
        hashCode = prime * hashCode + ((getModelPackagingConfiguration() == null) ? 0 : getModelPackagingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getModelPackagingJobDescription() == null) ? 0 : getModelPackagingJobDescription().hashCode());
        hashCode = prime * hashCode + ((getModelPackagingMethod() == null) ? 0 : getModelPackagingMethod().hashCode());
        hashCode = prime * hashCode + ((getModelPackagingOutputDetails() == null) ? 0 : getModelPackagingOutputDetails().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTimestamp() == null) ? 0 : getLastUpdatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public ModelPackagingDescription clone() {
        try {
            return (ModelPackagingDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutforvision.model.transform.ModelPackagingDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
