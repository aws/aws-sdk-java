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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/UpdateApplication"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the application to update.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The current application version ID. You can retrieve the application version ID using <a>DescribeApplication</a>.
     * </p>
     */
    private Long currentApplicationVersionId;
    /**
     * <p>
     * Describes application configuration updates.
     * </p>
     */
    private ApplicationConfigurationUpdate applicationConfigurationUpdate;
    /**
     * <p>
     * Describes updates to the service execution role.
     * </p>
     */
    private String serviceExecutionRoleUpdate;
    /**
     * <p>
     * Describes updates to the application's starting parameters.
     * </p>
     */
    private RunConfigurationUpdate runConfigurationUpdate;
    /**
     * <p>
     * Describes application Amazon CloudWatch logging option updates. You can only update existing CloudWatch logging
     * options with this action. To add a new CloudWatch logging option, use
     * <a>AddApplicationCloudWatchLoggingOption</a>.
     * </p>
     */
    private java.util.List<CloudWatchLoggingOptionUpdate> cloudWatchLoggingOptionUpdates;

    /**
     * <p>
     * The name of the application to update.
     * </p>
     * 
     * @param applicationName
     *        The name of the application to update.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application to update.
     * </p>
     * 
     * @return The name of the application to update.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the application to update.
     * </p>
     * 
     * @param applicationName
     *        The name of the application to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The current application version ID. You can retrieve the application version ID using <a>DescribeApplication</a>.
     * </p>
     * 
     * @param currentApplicationVersionId
     *        The current application version ID. You can retrieve the application version ID using
     *        <a>DescribeApplication</a>.
     */

    public void setCurrentApplicationVersionId(Long currentApplicationVersionId) {
        this.currentApplicationVersionId = currentApplicationVersionId;
    }

    /**
     * <p>
     * The current application version ID. You can retrieve the application version ID using <a>DescribeApplication</a>.
     * </p>
     * 
     * @return The current application version ID. You can retrieve the application version ID using
     *         <a>DescribeApplication</a>.
     */

    public Long getCurrentApplicationVersionId() {
        return this.currentApplicationVersionId;
    }

    /**
     * <p>
     * The current application version ID. You can retrieve the application version ID using <a>DescribeApplication</a>.
     * </p>
     * 
     * @param currentApplicationVersionId
     *        The current application version ID. You can retrieve the application version ID using
     *        <a>DescribeApplication</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withCurrentApplicationVersionId(Long currentApplicationVersionId) {
        setCurrentApplicationVersionId(currentApplicationVersionId);
        return this;
    }

    /**
     * <p>
     * Describes application configuration updates.
     * </p>
     * 
     * @param applicationConfigurationUpdate
     *        Describes application configuration updates.
     */

    public void setApplicationConfigurationUpdate(ApplicationConfigurationUpdate applicationConfigurationUpdate) {
        this.applicationConfigurationUpdate = applicationConfigurationUpdate;
    }

    /**
     * <p>
     * Describes application configuration updates.
     * </p>
     * 
     * @return Describes application configuration updates.
     */

    public ApplicationConfigurationUpdate getApplicationConfigurationUpdate() {
        return this.applicationConfigurationUpdate;
    }

    /**
     * <p>
     * Describes application configuration updates.
     * </p>
     * 
     * @param applicationConfigurationUpdate
     *        Describes application configuration updates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withApplicationConfigurationUpdate(ApplicationConfigurationUpdate applicationConfigurationUpdate) {
        setApplicationConfigurationUpdate(applicationConfigurationUpdate);
        return this;
    }

    /**
     * <p>
     * Describes updates to the service execution role.
     * </p>
     * 
     * @param serviceExecutionRoleUpdate
     *        Describes updates to the service execution role.
     */

    public void setServiceExecutionRoleUpdate(String serviceExecutionRoleUpdate) {
        this.serviceExecutionRoleUpdate = serviceExecutionRoleUpdate;
    }

    /**
     * <p>
     * Describes updates to the service execution role.
     * </p>
     * 
     * @return Describes updates to the service execution role.
     */

    public String getServiceExecutionRoleUpdate() {
        return this.serviceExecutionRoleUpdate;
    }

    /**
     * <p>
     * Describes updates to the service execution role.
     * </p>
     * 
     * @param serviceExecutionRoleUpdate
     *        Describes updates to the service execution role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withServiceExecutionRoleUpdate(String serviceExecutionRoleUpdate) {
        setServiceExecutionRoleUpdate(serviceExecutionRoleUpdate);
        return this;
    }

    /**
     * <p>
     * Describes updates to the application's starting parameters.
     * </p>
     * 
     * @param runConfigurationUpdate
     *        Describes updates to the application's starting parameters.
     */

    public void setRunConfigurationUpdate(RunConfigurationUpdate runConfigurationUpdate) {
        this.runConfigurationUpdate = runConfigurationUpdate;
    }

    /**
     * <p>
     * Describes updates to the application's starting parameters.
     * </p>
     * 
     * @return Describes updates to the application's starting parameters.
     */

    public RunConfigurationUpdate getRunConfigurationUpdate() {
        return this.runConfigurationUpdate;
    }

    /**
     * <p>
     * Describes updates to the application's starting parameters.
     * </p>
     * 
     * @param runConfigurationUpdate
     *        Describes updates to the application's starting parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withRunConfigurationUpdate(RunConfigurationUpdate runConfigurationUpdate) {
        setRunConfigurationUpdate(runConfigurationUpdate);
        return this;
    }

    /**
     * <p>
     * Describes application Amazon CloudWatch logging option updates. You can only update existing CloudWatch logging
     * options with this action. To add a new CloudWatch logging option, use
     * <a>AddApplicationCloudWatchLoggingOption</a>.
     * </p>
     * 
     * @return Describes application Amazon CloudWatch logging option updates. You can only update existing CloudWatch
     *         logging options with this action. To add a new CloudWatch logging option, use
     *         <a>AddApplicationCloudWatchLoggingOption</a>.
     */

    public java.util.List<CloudWatchLoggingOptionUpdate> getCloudWatchLoggingOptionUpdates() {
        return cloudWatchLoggingOptionUpdates;
    }

    /**
     * <p>
     * Describes application Amazon CloudWatch logging option updates. You can only update existing CloudWatch logging
     * options with this action. To add a new CloudWatch logging option, use
     * <a>AddApplicationCloudWatchLoggingOption</a>.
     * </p>
     * 
     * @param cloudWatchLoggingOptionUpdates
     *        Describes application Amazon CloudWatch logging option updates. You can only update existing CloudWatch
     *        logging options with this action. To add a new CloudWatch logging option, use
     *        <a>AddApplicationCloudWatchLoggingOption</a>.
     */

    public void setCloudWatchLoggingOptionUpdates(java.util.Collection<CloudWatchLoggingOptionUpdate> cloudWatchLoggingOptionUpdates) {
        if (cloudWatchLoggingOptionUpdates == null) {
            this.cloudWatchLoggingOptionUpdates = null;
            return;
        }

        this.cloudWatchLoggingOptionUpdates = new java.util.ArrayList<CloudWatchLoggingOptionUpdate>(cloudWatchLoggingOptionUpdates);
    }

    /**
     * <p>
     * Describes application Amazon CloudWatch logging option updates. You can only update existing CloudWatch logging
     * options with this action. To add a new CloudWatch logging option, use
     * <a>AddApplicationCloudWatchLoggingOption</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCloudWatchLoggingOptionUpdates(java.util.Collection)} or
     * {@link #withCloudWatchLoggingOptionUpdates(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param cloudWatchLoggingOptionUpdates
     *        Describes application Amazon CloudWatch logging option updates. You can only update existing CloudWatch
     *        logging options with this action. To add a new CloudWatch logging option, use
     *        <a>AddApplicationCloudWatchLoggingOption</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withCloudWatchLoggingOptionUpdates(CloudWatchLoggingOptionUpdate... cloudWatchLoggingOptionUpdates) {
        if (this.cloudWatchLoggingOptionUpdates == null) {
            setCloudWatchLoggingOptionUpdates(new java.util.ArrayList<CloudWatchLoggingOptionUpdate>(cloudWatchLoggingOptionUpdates.length));
        }
        for (CloudWatchLoggingOptionUpdate ele : cloudWatchLoggingOptionUpdates) {
            this.cloudWatchLoggingOptionUpdates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes application Amazon CloudWatch logging option updates. You can only update existing CloudWatch logging
     * options with this action. To add a new CloudWatch logging option, use
     * <a>AddApplicationCloudWatchLoggingOption</a>.
     * </p>
     * 
     * @param cloudWatchLoggingOptionUpdates
     *        Describes application Amazon CloudWatch logging option updates. You can only update existing CloudWatch
     *        logging options with this action. To add a new CloudWatch logging option, use
     *        <a>AddApplicationCloudWatchLoggingOption</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withCloudWatchLoggingOptionUpdates(java.util.Collection<CloudWatchLoggingOptionUpdate> cloudWatchLoggingOptionUpdates) {
        setCloudWatchLoggingOptionUpdates(cloudWatchLoggingOptionUpdates);
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getCurrentApplicationVersionId() != null)
            sb.append("CurrentApplicationVersionId: ").append(getCurrentApplicationVersionId()).append(",");
        if (getApplicationConfigurationUpdate() != null)
            sb.append("ApplicationConfigurationUpdate: ").append(getApplicationConfigurationUpdate()).append(",");
        if (getServiceExecutionRoleUpdate() != null)
            sb.append("ServiceExecutionRoleUpdate: ").append(getServiceExecutionRoleUpdate()).append(",");
        if (getRunConfigurationUpdate() != null)
            sb.append("RunConfigurationUpdate: ").append(getRunConfigurationUpdate()).append(",");
        if (getCloudWatchLoggingOptionUpdates() != null)
            sb.append("CloudWatchLoggingOptionUpdates: ").append(getCloudWatchLoggingOptionUpdates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApplicationRequest == false)
            return false;
        UpdateApplicationRequest other = (UpdateApplicationRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getCurrentApplicationVersionId() == null ^ this.getCurrentApplicationVersionId() == null)
            return false;
        if (other.getCurrentApplicationVersionId() != null && other.getCurrentApplicationVersionId().equals(this.getCurrentApplicationVersionId()) == false)
            return false;
        if (other.getApplicationConfigurationUpdate() == null ^ this.getApplicationConfigurationUpdate() == null)
            return false;
        if (other.getApplicationConfigurationUpdate() != null
                && other.getApplicationConfigurationUpdate().equals(this.getApplicationConfigurationUpdate()) == false)
            return false;
        if (other.getServiceExecutionRoleUpdate() == null ^ this.getServiceExecutionRoleUpdate() == null)
            return false;
        if (other.getServiceExecutionRoleUpdate() != null && other.getServiceExecutionRoleUpdate().equals(this.getServiceExecutionRoleUpdate()) == false)
            return false;
        if (other.getRunConfigurationUpdate() == null ^ this.getRunConfigurationUpdate() == null)
            return false;
        if (other.getRunConfigurationUpdate() != null && other.getRunConfigurationUpdate().equals(this.getRunConfigurationUpdate()) == false)
            return false;
        if (other.getCloudWatchLoggingOptionUpdates() == null ^ this.getCloudWatchLoggingOptionUpdates() == null)
            return false;
        if (other.getCloudWatchLoggingOptionUpdates() != null
                && other.getCloudWatchLoggingOptionUpdates().equals(this.getCloudWatchLoggingOptionUpdates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getCurrentApplicationVersionId() == null) ? 0 : getCurrentApplicationVersionId().hashCode());
        hashCode = prime * hashCode + ((getApplicationConfigurationUpdate() == null) ? 0 : getApplicationConfigurationUpdate().hashCode());
        hashCode = prime * hashCode + ((getServiceExecutionRoleUpdate() == null) ? 0 : getServiceExecutionRoleUpdate().hashCode());
        hashCode = prime * hashCode + ((getRunConfigurationUpdate() == null) ? 0 : getRunConfigurationUpdate().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLoggingOptionUpdates() == null) ? 0 : getCloudWatchLoggingOptionUpdates().hashCode());
        return hashCode;
    }

    @Override
    public UpdateApplicationRequest clone() {
        return (UpdateApplicationRequest) super.clone();
    }

}
