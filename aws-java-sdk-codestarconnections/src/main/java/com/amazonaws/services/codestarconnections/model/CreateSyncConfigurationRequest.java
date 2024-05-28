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
package com.amazonaws.services.codestarconnections.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/CreateSyncConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSyncConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The branch in the repository from which changes will be synced.
     * </p>
     */
    private String branch;
    /**
     * <p>
     * The file name of the configuration file that manages syncing between the connection and the repository. This
     * configuration file is stored in the repository.
     * </p>
     */
    private String configFile;
    /**
     * <p>
     * The ID of the repository link created for the connection. A repository link allows Git sync to monitor and sync
     * changes to files in a specified Git repository.
     * </p>
     */
    private String repositoryLinkId;
    /**
     * <p>
     * The name of the Amazon Web Services resource (for example, a CloudFormation stack in the case of CFN_STACK_SYNC)
     * that will be synchronized from the linked repository.
     * </p>
     */
    private String resourceName;
    /**
     * <p>
     * The ARN of the IAM role that grants permission for Amazon Web Services to use Git sync to update a given Amazon
     * Web Services resource on your behalf.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The type of sync configuration.
     * </p>
     */
    private String syncType;
    /**
     * <p>
     * Whether to enable or disable publishing of deployment status to source providers.
     * </p>
     */
    private String publishDeploymentStatus;
    /**
     * <p>
     * When to trigger Git sync to begin the stack update.
     * </p>
     */
    private String triggerResourceUpdateOn;

    /**
     * <p>
     * The branch in the repository from which changes will be synced.
     * </p>
     * 
     * @param branch
     *        The branch in the repository from which changes will be synced.
     */

    public void setBranch(String branch) {
        this.branch = branch;
    }

    /**
     * <p>
     * The branch in the repository from which changes will be synced.
     * </p>
     * 
     * @return The branch in the repository from which changes will be synced.
     */

    public String getBranch() {
        return this.branch;
    }

    /**
     * <p>
     * The branch in the repository from which changes will be synced.
     * </p>
     * 
     * @param branch
     *        The branch in the repository from which changes will be synced.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSyncConfigurationRequest withBranch(String branch) {
        setBranch(branch);
        return this;
    }

    /**
     * <p>
     * The file name of the configuration file that manages syncing between the connection and the repository. This
     * configuration file is stored in the repository.
     * </p>
     * 
     * @param configFile
     *        The file name of the configuration file that manages syncing between the connection and the repository.
     *        This configuration file is stored in the repository.
     */

    public void setConfigFile(String configFile) {
        this.configFile = configFile;
    }

    /**
     * <p>
     * The file name of the configuration file that manages syncing between the connection and the repository. This
     * configuration file is stored in the repository.
     * </p>
     * 
     * @return The file name of the configuration file that manages syncing between the connection and the repository.
     *         This configuration file is stored in the repository.
     */

    public String getConfigFile() {
        return this.configFile;
    }

    /**
     * <p>
     * The file name of the configuration file that manages syncing between the connection and the repository. This
     * configuration file is stored in the repository.
     * </p>
     * 
     * @param configFile
     *        The file name of the configuration file that manages syncing between the connection and the repository.
     *        This configuration file is stored in the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSyncConfigurationRequest withConfigFile(String configFile) {
        setConfigFile(configFile);
        return this;
    }

    /**
     * <p>
     * The ID of the repository link created for the connection. A repository link allows Git sync to monitor and sync
     * changes to files in a specified Git repository.
     * </p>
     * 
     * @param repositoryLinkId
     *        The ID of the repository link created for the connection. A repository link allows Git sync to monitor and
     *        sync changes to files in a specified Git repository.
     */

    public void setRepositoryLinkId(String repositoryLinkId) {
        this.repositoryLinkId = repositoryLinkId;
    }

    /**
     * <p>
     * The ID of the repository link created for the connection. A repository link allows Git sync to monitor and sync
     * changes to files in a specified Git repository.
     * </p>
     * 
     * @return The ID of the repository link created for the connection. A repository link allows Git sync to monitor
     *         and sync changes to files in a specified Git repository.
     */

    public String getRepositoryLinkId() {
        return this.repositoryLinkId;
    }

    /**
     * <p>
     * The ID of the repository link created for the connection. A repository link allows Git sync to monitor and sync
     * changes to files in a specified Git repository.
     * </p>
     * 
     * @param repositoryLinkId
     *        The ID of the repository link created for the connection. A repository link allows Git sync to monitor and
     *        sync changes to files in a specified Git repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSyncConfigurationRequest withRepositoryLinkId(String repositoryLinkId) {
        setRepositoryLinkId(repositoryLinkId);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Web Services resource (for example, a CloudFormation stack in the case of CFN_STACK_SYNC)
     * that will be synchronized from the linked repository.
     * </p>
     * 
     * @param resourceName
     *        The name of the Amazon Web Services resource (for example, a CloudFormation stack in the case of
     *        CFN_STACK_SYNC) that will be synchronized from the linked repository.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The name of the Amazon Web Services resource (for example, a CloudFormation stack in the case of CFN_STACK_SYNC)
     * that will be synchronized from the linked repository.
     * </p>
     * 
     * @return The name of the Amazon Web Services resource (for example, a CloudFormation stack in the case of
     *         CFN_STACK_SYNC) that will be synchronized from the linked repository.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The name of the Amazon Web Services resource (for example, a CloudFormation stack in the case of CFN_STACK_SYNC)
     * that will be synchronized from the linked repository.
     * </p>
     * 
     * @param resourceName
     *        The name of the Amazon Web Services resource (for example, a CloudFormation stack in the case of
     *        CFN_STACK_SYNC) that will be synchronized from the linked repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSyncConfigurationRequest withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that grants permission for Amazon Web Services to use Git sync to update a given Amazon
     * Web Services resource on your behalf.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that grants permission for Amazon Web Services to use Git sync to update a given
     *        Amazon Web Services resource on your behalf.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that grants permission for Amazon Web Services to use Git sync to update a given Amazon
     * Web Services resource on your behalf.
     * </p>
     * 
     * @return The ARN of the IAM role that grants permission for Amazon Web Services to use Git sync to update a given
     *         Amazon Web Services resource on your behalf.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that grants permission for Amazon Web Services to use Git sync to update a given Amazon
     * Web Services resource on your behalf.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that grants permission for Amazon Web Services to use Git sync to update a given
     *        Amazon Web Services resource on your behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSyncConfigurationRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The type of sync configuration.
     * </p>
     * 
     * @param syncType
     *        The type of sync configuration.
     * @see SyncConfigurationType
     */

    public void setSyncType(String syncType) {
        this.syncType = syncType;
    }

    /**
     * <p>
     * The type of sync configuration.
     * </p>
     * 
     * @return The type of sync configuration.
     * @see SyncConfigurationType
     */

    public String getSyncType() {
        return this.syncType;
    }

    /**
     * <p>
     * The type of sync configuration.
     * </p>
     * 
     * @param syncType
     *        The type of sync configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SyncConfigurationType
     */

    public CreateSyncConfigurationRequest withSyncType(String syncType) {
        setSyncType(syncType);
        return this;
    }

    /**
     * <p>
     * The type of sync configuration.
     * </p>
     * 
     * @param syncType
     *        The type of sync configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SyncConfigurationType
     */

    public CreateSyncConfigurationRequest withSyncType(SyncConfigurationType syncType) {
        this.syncType = syncType.toString();
        return this;
    }

    /**
     * <p>
     * Whether to enable or disable publishing of deployment status to source providers.
     * </p>
     * 
     * @param publishDeploymentStatus
     *        Whether to enable or disable publishing of deployment status to source providers.
     * @see PublishDeploymentStatus
     */

    public void setPublishDeploymentStatus(String publishDeploymentStatus) {
        this.publishDeploymentStatus = publishDeploymentStatus;
    }

    /**
     * <p>
     * Whether to enable or disable publishing of deployment status to source providers.
     * </p>
     * 
     * @return Whether to enable or disable publishing of deployment status to source providers.
     * @see PublishDeploymentStatus
     */

    public String getPublishDeploymentStatus() {
        return this.publishDeploymentStatus;
    }

    /**
     * <p>
     * Whether to enable or disable publishing of deployment status to source providers.
     * </p>
     * 
     * @param publishDeploymentStatus
     *        Whether to enable or disable publishing of deployment status to source providers.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PublishDeploymentStatus
     */

    public CreateSyncConfigurationRequest withPublishDeploymentStatus(String publishDeploymentStatus) {
        setPublishDeploymentStatus(publishDeploymentStatus);
        return this;
    }

    /**
     * <p>
     * Whether to enable or disable publishing of deployment status to source providers.
     * </p>
     * 
     * @param publishDeploymentStatus
     *        Whether to enable or disable publishing of deployment status to source providers.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PublishDeploymentStatus
     */

    public CreateSyncConfigurationRequest withPublishDeploymentStatus(PublishDeploymentStatus publishDeploymentStatus) {
        this.publishDeploymentStatus = publishDeploymentStatus.toString();
        return this;
    }

    /**
     * <p>
     * When to trigger Git sync to begin the stack update.
     * </p>
     * 
     * @param triggerResourceUpdateOn
     *        When to trigger Git sync to begin the stack update.
     * @see TriggerResourceUpdateOn
     */

    public void setTriggerResourceUpdateOn(String triggerResourceUpdateOn) {
        this.triggerResourceUpdateOn = triggerResourceUpdateOn;
    }

    /**
     * <p>
     * When to trigger Git sync to begin the stack update.
     * </p>
     * 
     * @return When to trigger Git sync to begin the stack update.
     * @see TriggerResourceUpdateOn
     */

    public String getTriggerResourceUpdateOn() {
        return this.triggerResourceUpdateOn;
    }

    /**
     * <p>
     * When to trigger Git sync to begin the stack update.
     * </p>
     * 
     * @param triggerResourceUpdateOn
     *        When to trigger Git sync to begin the stack update.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TriggerResourceUpdateOn
     */

    public CreateSyncConfigurationRequest withTriggerResourceUpdateOn(String triggerResourceUpdateOn) {
        setTriggerResourceUpdateOn(triggerResourceUpdateOn);
        return this;
    }

    /**
     * <p>
     * When to trigger Git sync to begin the stack update.
     * </p>
     * 
     * @param triggerResourceUpdateOn
     *        When to trigger Git sync to begin the stack update.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TriggerResourceUpdateOn
     */

    public CreateSyncConfigurationRequest withTriggerResourceUpdateOn(TriggerResourceUpdateOn triggerResourceUpdateOn) {
        this.triggerResourceUpdateOn = triggerResourceUpdateOn.toString();
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
        if (getBranch() != null)
            sb.append("Branch: ").append(getBranch()).append(",");
        if (getConfigFile() != null)
            sb.append("ConfigFile: ").append(getConfigFile()).append(",");
        if (getRepositoryLinkId() != null)
            sb.append("RepositoryLinkId: ").append(getRepositoryLinkId()).append(",");
        if (getResourceName() != null)
            sb.append("ResourceName: ").append(getResourceName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getSyncType() != null)
            sb.append("SyncType: ").append(getSyncType()).append(",");
        if (getPublishDeploymentStatus() != null)
            sb.append("PublishDeploymentStatus: ").append(getPublishDeploymentStatus()).append(",");
        if (getTriggerResourceUpdateOn() != null)
            sb.append("TriggerResourceUpdateOn: ").append(getTriggerResourceUpdateOn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSyncConfigurationRequest == false)
            return false;
        CreateSyncConfigurationRequest other = (CreateSyncConfigurationRequest) obj;
        if (other.getBranch() == null ^ this.getBranch() == null)
            return false;
        if (other.getBranch() != null && other.getBranch().equals(this.getBranch()) == false)
            return false;
        if (other.getConfigFile() == null ^ this.getConfigFile() == null)
            return false;
        if (other.getConfigFile() != null && other.getConfigFile().equals(this.getConfigFile()) == false)
            return false;
        if (other.getRepositoryLinkId() == null ^ this.getRepositoryLinkId() == null)
            return false;
        if (other.getRepositoryLinkId() != null && other.getRepositoryLinkId().equals(this.getRepositoryLinkId()) == false)
            return false;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSyncType() == null ^ this.getSyncType() == null)
            return false;
        if (other.getSyncType() != null && other.getSyncType().equals(this.getSyncType()) == false)
            return false;
        if (other.getPublishDeploymentStatus() == null ^ this.getPublishDeploymentStatus() == null)
            return false;
        if (other.getPublishDeploymentStatus() != null && other.getPublishDeploymentStatus().equals(this.getPublishDeploymentStatus()) == false)
            return false;
        if (other.getTriggerResourceUpdateOn() == null ^ this.getTriggerResourceUpdateOn() == null)
            return false;
        if (other.getTriggerResourceUpdateOn() != null && other.getTriggerResourceUpdateOn().equals(this.getTriggerResourceUpdateOn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBranch() == null) ? 0 : getBranch().hashCode());
        hashCode = prime * hashCode + ((getConfigFile() == null) ? 0 : getConfigFile().hashCode());
        hashCode = prime * hashCode + ((getRepositoryLinkId() == null) ? 0 : getRepositoryLinkId().hashCode());
        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSyncType() == null) ? 0 : getSyncType().hashCode());
        hashCode = prime * hashCode + ((getPublishDeploymentStatus() == null) ? 0 : getPublishDeploymentStatus().hashCode());
        hashCode = prime * hashCode + ((getTriggerResourceUpdateOn() == null) ? 0 : getTriggerResourceUpdateOn().hashCode());
        return hashCode;
    }

    @Override
    public CreateSyncConfigurationRequest clone() {
        return (CreateSyncConfigurationRequest) super.clone();
    }

}
