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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the application, including the application Amazon Resource Name (ARN), status, latest version, and input
 * and output configurations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ApplicationDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the application.
     * </p>
     */
    private String applicationARN;
    /**
     * <p>
     * The description of the application.
     * </p>
     */
    private String applicationDescription;
    /**
     * <p>
     * The name of the application.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The runtime environment for the application (<code>SQL-1.0</code> or <code>JAVA-8-FLINK-1.5</code>).
     * </p>
     */
    private String runtimeEnvironment;
    /**
     * <p>
     * Specifies the IAM role that the application uses to access external resources.
     * </p>
     */
    private String serviceExecutionRole;
    /**
     * <p>
     * The status of the application.
     * </p>
     */
    private String applicationStatus;
    /**
     * <p>
     * Provides the current application version. Kinesis Data Analytics updates the <code>ApplicationVersionId</code>
     * each time you update the application.
     * </p>
     */
    private Long applicationVersionId;
    /**
     * <p>
     * The current timestamp when the application was created.
     * </p>
     */
    private java.util.Date createTimestamp;
    /**
     * <p>
     * The current timestamp when the application was last updated.
     * </p>
     */
    private java.util.Date lastUpdateTimestamp;
    /**
     * <p>
     * Provides details about the application's SQL or Java code and starting parameters.
     * </p>
     */
    private ApplicationConfigurationDescription applicationConfigurationDescription;
    /**
     * <p>
     * Describes the application Amazon CloudWatch logging options.
     * </p>
     */
    private java.util.List<CloudWatchLoggingOptionDescription> cloudWatchLoggingOptionDescriptions;

    /**
     * <p>
     * The ARN of the application.
     * </p>
     * 
     * @param applicationARN
     *        The ARN of the application.
     */

    public void setApplicationARN(String applicationARN) {
        this.applicationARN = applicationARN;
    }

    /**
     * <p>
     * The ARN of the application.
     * </p>
     * 
     * @return The ARN of the application.
     */

    public String getApplicationARN() {
        return this.applicationARN;
    }

    /**
     * <p>
     * The ARN of the application.
     * </p>
     * 
     * @param applicationARN
     *        The ARN of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDetail withApplicationARN(String applicationARN) {
        setApplicationARN(applicationARN);
        return this;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * 
     * @param applicationDescription
     *        The description of the application.
     */

    public void setApplicationDescription(String applicationDescription) {
        this.applicationDescription = applicationDescription;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * 
     * @return The description of the application.
     */

    public String getApplicationDescription() {
        return this.applicationDescription;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * 
     * @param applicationDescription
     *        The description of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDetail withApplicationDescription(String applicationDescription) {
        setApplicationDescription(applicationDescription);
        return this;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param applicationName
     *        The name of the application.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @return The name of the application.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param applicationName
     *        The name of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDetail withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The runtime environment for the application (<code>SQL-1.0</code> or <code>JAVA-8-FLINK-1.5</code>).
     * </p>
     * 
     * @param runtimeEnvironment
     *        The runtime environment for the application (<code>SQL-1.0</code> or <code>JAVA-8-FLINK-1.5</code>).
     * @see RuntimeEnvironment
     */

    public void setRuntimeEnvironment(String runtimeEnvironment) {
        this.runtimeEnvironment = runtimeEnvironment;
    }

    /**
     * <p>
     * The runtime environment for the application (<code>SQL-1.0</code> or <code>JAVA-8-FLINK-1.5</code>).
     * </p>
     * 
     * @return The runtime environment for the application (<code>SQL-1.0</code> or <code>JAVA-8-FLINK-1.5</code>).
     * @see RuntimeEnvironment
     */

    public String getRuntimeEnvironment() {
        return this.runtimeEnvironment;
    }

    /**
     * <p>
     * The runtime environment for the application (<code>SQL-1.0</code> or <code>JAVA-8-FLINK-1.5</code>).
     * </p>
     * 
     * @param runtimeEnvironment
     *        The runtime environment for the application (<code>SQL-1.0</code> or <code>JAVA-8-FLINK-1.5</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuntimeEnvironment
     */

    public ApplicationDetail withRuntimeEnvironment(String runtimeEnvironment) {
        setRuntimeEnvironment(runtimeEnvironment);
        return this;
    }

    /**
     * <p>
     * The runtime environment for the application (<code>SQL-1.0</code> or <code>JAVA-8-FLINK-1.5</code>).
     * </p>
     * 
     * @param runtimeEnvironment
     *        The runtime environment for the application (<code>SQL-1.0</code> or <code>JAVA-8-FLINK-1.5</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuntimeEnvironment
     */

    public ApplicationDetail withRuntimeEnvironment(RuntimeEnvironment runtimeEnvironment) {
        this.runtimeEnvironment = runtimeEnvironment.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the IAM role that the application uses to access external resources.
     * </p>
     * 
     * @param serviceExecutionRole
     *        Specifies the IAM role that the application uses to access external resources.
     */

    public void setServiceExecutionRole(String serviceExecutionRole) {
        this.serviceExecutionRole = serviceExecutionRole;
    }

    /**
     * <p>
     * Specifies the IAM role that the application uses to access external resources.
     * </p>
     * 
     * @return Specifies the IAM role that the application uses to access external resources.
     */

    public String getServiceExecutionRole() {
        return this.serviceExecutionRole;
    }

    /**
     * <p>
     * Specifies the IAM role that the application uses to access external resources.
     * </p>
     * 
     * @param serviceExecutionRole
     *        Specifies the IAM role that the application uses to access external resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDetail withServiceExecutionRole(String serviceExecutionRole) {
        setServiceExecutionRole(serviceExecutionRole);
        return this;
    }

    /**
     * <p>
     * The status of the application.
     * </p>
     * 
     * @param applicationStatus
     *        The status of the application.
     * @see ApplicationStatus
     */

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    /**
     * <p>
     * The status of the application.
     * </p>
     * 
     * @return The status of the application.
     * @see ApplicationStatus
     */

    public String getApplicationStatus() {
        return this.applicationStatus;
    }

    /**
     * <p>
     * The status of the application.
     * </p>
     * 
     * @param applicationStatus
     *        The status of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationStatus
     */

    public ApplicationDetail withApplicationStatus(String applicationStatus) {
        setApplicationStatus(applicationStatus);
        return this;
    }

    /**
     * <p>
     * The status of the application.
     * </p>
     * 
     * @param applicationStatus
     *        The status of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationStatus
     */

    public ApplicationDetail withApplicationStatus(ApplicationStatus applicationStatus) {
        this.applicationStatus = applicationStatus.toString();
        return this;
    }

    /**
     * <p>
     * Provides the current application version. Kinesis Data Analytics updates the <code>ApplicationVersionId</code>
     * each time you update the application.
     * </p>
     * 
     * @param applicationVersionId
     *        Provides the current application version. Kinesis Data Analytics updates the
     *        <code>ApplicationVersionId</code> each time you update the application.
     */

    public void setApplicationVersionId(Long applicationVersionId) {
        this.applicationVersionId = applicationVersionId;
    }

    /**
     * <p>
     * Provides the current application version. Kinesis Data Analytics updates the <code>ApplicationVersionId</code>
     * each time you update the application.
     * </p>
     * 
     * @return Provides the current application version. Kinesis Data Analytics updates the
     *         <code>ApplicationVersionId</code> each time you update the application.
     */

    public Long getApplicationVersionId() {
        return this.applicationVersionId;
    }

    /**
     * <p>
     * Provides the current application version. Kinesis Data Analytics updates the <code>ApplicationVersionId</code>
     * each time you update the application.
     * </p>
     * 
     * @param applicationVersionId
     *        Provides the current application version. Kinesis Data Analytics updates the
     *        <code>ApplicationVersionId</code> each time you update the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDetail withApplicationVersionId(Long applicationVersionId) {
        setApplicationVersionId(applicationVersionId);
        return this;
    }

    /**
     * <p>
     * The current timestamp when the application was created.
     * </p>
     * 
     * @param createTimestamp
     *        The current timestamp when the application was created.
     */

    public void setCreateTimestamp(java.util.Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    /**
     * <p>
     * The current timestamp when the application was created.
     * </p>
     * 
     * @return The current timestamp when the application was created.
     */

    public java.util.Date getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * <p>
     * The current timestamp when the application was created.
     * </p>
     * 
     * @param createTimestamp
     *        The current timestamp when the application was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDetail withCreateTimestamp(java.util.Date createTimestamp) {
        setCreateTimestamp(createTimestamp);
        return this;
    }

    /**
     * <p>
     * The current timestamp when the application was last updated.
     * </p>
     * 
     * @param lastUpdateTimestamp
     *        The current timestamp when the application was last updated.
     */

    public void setLastUpdateTimestamp(java.util.Date lastUpdateTimestamp) {
        this.lastUpdateTimestamp = lastUpdateTimestamp;
    }

    /**
     * <p>
     * The current timestamp when the application was last updated.
     * </p>
     * 
     * @return The current timestamp when the application was last updated.
     */

    public java.util.Date getLastUpdateTimestamp() {
        return this.lastUpdateTimestamp;
    }

    /**
     * <p>
     * The current timestamp when the application was last updated.
     * </p>
     * 
     * @param lastUpdateTimestamp
     *        The current timestamp when the application was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDetail withLastUpdateTimestamp(java.util.Date lastUpdateTimestamp) {
        setLastUpdateTimestamp(lastUpdateTimestamp);
        return this;
    }

    /**
     * <p>
     * Provides details about the application's SQL or Java code and starting parameters.
     * </p>
     * 
     * @param applicationConfigurationDescription
     *        Provides details about the application's SQL or Java code and starting parameters.
     */

    public void setApplicationConfigurationDescription(ApplicationConfigurationDescription applicationConfigurationDescription) {
        this.applicationConfigurationDescription = applicationConfigurationDescription;
    }

    /**
     * <p>
     * Provides details about the application's SQL or Java code and starting parameters.
     * </p>
     * 
     * @return Provides details about the application's SQL or Java code and starting parameters.
     */

    public ApplicationConfigurationDescription getApplicationConfigurationDescription() {
        return this.applicationConfigurationDescription;
    }

    /**
     * <p>
     * Provides details about the application's SQL or Java code and starting parameters.
     * </p>
     * 
     * @param applicationConfigurationDescription
     *        Provides details about the application's SQL or Java code and starting parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDetail withApplicationConfigurationDescription(ApplicationConfigurationDescription applicationConfigurationDescription) {
        setApplicationConfigurationDescription(applicationConfigurationDescription);
        return this;
    }

    /**
     * <p>
     * Describes the application Amazon CloudWatch logging options.
     * </p>
     * 
     * @return Describes the application Amazon CloudWatch logging options.
     */

    public java.util.List<CloudWatchLoggingOptionDescription> getCloudWatchLoggingOptionDescriptions() {
        return cloudWatchLoggingOptionDescriptions;
    }

    /**
     * <p>
     * Describes the application Amazon CloudWatch logging options.
     * </p>
     * 
     * @param cloudWatchLoggingOptionDescriptions
     *        Describes the application Amazon CloudWatch logging options.
     */

    public void setCloudWatchLoggingOptionDescriptions(java.util.Collection<CloudWatchLoggingOptionDescription> cloudWatchLoggingOptionDescriptions) {
        if (cloudWatchLoggingOptionDescriptions == null) {
            this.cloudWatchLoggingOptionDescriptions = null;
            return;
        }

        this.cloudWatchLoggingOptionDescriptions = new java.util.ArrayList<CloudWatchLoggingOptionDescription>(cloudWatchLoggingOptionDescriptions);
    }

    /**
     * <p>
     * Describes the application Amazon CloudWatch logging options.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCloudWatchLoggingOptionDescriptions(java.util.Collection)} or
     * {@link #withCloudWatchLoggingOptionDescriptions(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param cloudWatchLoggingOptionDescriptions
     *        Describes the application Amazon CloudWatch logging options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDetail withCloudWatchLoggingOptionDescriptions(CloudWatchLoggingOptionDescription... cloudWatchLoggingOptionDescriptions) {
        if (this.cloudWatchLoggingOptionDescriptions == null) {
            setCloudWatchLoggingOptionDescriptions(new java.util.ArrayList<CloudWatchLoggingOptionDescription>(cloudWatchLoggingOptionDescriptions.length));
        }
        for (CloudWatchLoggingOptionDescription ele : cloudWatchLoggingOptionDescriptions) {
            this.cloudWatchLoggingOptionDescriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes the application Amazon CloudWatch logging options.
     * </p>
     * 
     * @param cloudWatchLoggingOptionDescriptions
     *        Describes the application Amazon CloudWatch logging options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationDetail withCloudWatchLoggingOptionDescriptions(
            java.util.Collection<CloudWatchLoggingOptionDescription> cloudWatchLoggingOptionDescriptions) {
        setCloudWatchLoggingOptionDescriptions(cloudWatchLoggingOptionDescriptions);
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
        if (getApplicationARN() != null)
            sb.append("ApplicationARN: ").append(getApplicationARN()).append(",");
        if (getApplicationDescription() != null)
            sb.append("ApplicationDescription: ").append(getApplicationDescription()).append(",");
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getRuntimeEnvironment() != null)
            sb.append("RuntimeEnvironment: ").append(getRuntimeEnvironment()).append(",");
        if (getServiceExecutionRole() != null)
            sb.append("ServiceExecutionRole: ").append(getServiceExecutionRole()).append(",");
        if (getApplicationStatus() != null)
            sb.append("ApplicationStatus: ").append(getApplicationStatus()).append(",");
        if (getApplicationVersionId() != null)
            sb.append("ApplicationVersionId: ").append(getApplicationVersionId()).append(",");
        if (getCreateTimestamp() != null)
            sb.append("CreateTimestamp: ").append(getCreateTimestamp()).append(",");
        if (getLastUpdateTimestamp() != null)
            sb.append("LastUpdateTimestamp: ").append(getLastUpdateTimestamp()).append(",");
        if (getApplicationConfigurationDescription() != null)
            sb.append("ApplicationConfigurationDescription: ").append(getApplicationConfigurationDescription()).append(",");
        if (getCloudWatchLoggingOptionDescriptions() != null)
            sb.append("CloudWatchLoggingOptionDescriptions: ").append(getCloudWatchLoggingOptionDescriptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationDetail == false)
            return false;
        ApplicationDetail other = (ApplicationDetail) obj;
        if (other.getApplicationARN() == null ^ this.getApplicationARN() == null)
            return false;
        if (other.getApplicationARN() != null && other.getApplicationARN().equals(this.getApplicationARN()) == false)
            return false;
        if (other.getApplicationDescription() == null ^ this.getApplicationDescription() == null)
            return false;
        if (other.getApplicationDescription() != null && other.getApplicationDescription().equals(this.getApplicationDescription()) == false)
            return false;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getRuntimeEnvironment() == null ^ this.getRuntimeEnvironment() == null)
            return false;
        if (other.getRuntimeEnvironment() != null && other.getRuntimeEnvironment().equals(this.getRuntimeEnvironment()) == false)
            return false;
        if (other.getServiceExecutionRole() == null ^ this.getServiceExecutionRole() == null)
            return false;
        if (other.getServiceExecutionRole() != null && other.getServiceExecutionRole().equals(this.getServiceExecutionRole()) == false)
            return false;
        if (other.getApplicationStatus() == null ^ this.getApplicationStatus() == null)
            return false;
        if (other.getApplicationStatus() != null && other.getApplicationStatus().equals(this.getApplicationStatus()) == false)
            return false;
        if (other.getApplicationVersionId() == null ^ this.getApplicationVersionId() == null)
            return false;
        if (other.getApplicationVersionId() != null && other.getApplicationVersionId().equals(this.getApplicationVersionId()) == false)
            return false;
        if (other.getCreateTimestamp() == null ^ this.getCreateTimestamp() == null)
            return false;
        if (other.getCreateTimestamp() != null && other.getCreateTimestamp().equals(this.getCreateTimestamp()) == false)
            return false;
        if (other.getLastUpdateTimestamp() == null ^ this.getLastUpdateTimestamp() == null)
            return false;
        if (other.getLastUpdateTimestamp() != null && other.getLastUpdateTimestamp().equals(this.getLastUpdateTimestamp()) == false)
            return false;
        if (other.getApplicationConfigurationDescription() == null ^ this.getApplicationConfigurationDescription() == null)
            return false;
        if (other.getApplicationConfigurationDescription() != null
                && other.getApplicationConfigurationDescription().equals(this.getApplicationConfigurationDescription()) == false)
            return false;
        if (other.getCloudWatchLoggingOptionDescriptions() == null ^ this.getCloudWatchLoggingOptionDescriptions() == null)
            return false;
        if (other.getCloudWatchLoggingOptionDescriptions() != null
                && other.getCloudWatchLoggingOptionDescriptions().equals(this.getCloudWatchLoggingOptionDescriptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationARN() == null) ? 0 : getApplicationARN().hashCode());
        hashCode = prime * hashCode + ((getApplicationDescription() == null) ? 0 : getApplicationDescription().hashCode());
        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getRuntimeEnvironment() == null) ? 0 : getRuntimeEnvironment().hashCode());
        hashCode = prime * hashCode + ((getServiceExecutionRole() == null) ? 0 : getServiceExecutionRole().hashCode());
        hashCode = prime * hashCode + ((getApplicationStatus() == null) ? 0 : getApplicationStatus().hashCode());
        hashCode = prime * hashCode + ((getApplicationVersionId() == null) ? 0 : getApplicationVersionId().hashCode());
        hashCode = prime * hashCode + ((getCreateTimestamp() == null) ? 0 : getCreateTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTimestamp() == null) ? 0 : getLastUpdateTimestamp().hashCode());
        hashCode = prime * hashCode + ((getApplicationConfigurationDescription() == null) ? 0 : getApplicationConfigurationDescription().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLoggingOptionDescriptions() == null) ? 0 : getCloudWatchLoggingOptionDescriptions().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationDetail clone() {
        try {
            return (ApplicationDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.ApplicationDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
