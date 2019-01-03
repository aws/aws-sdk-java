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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The parameters for an AUTOMATION task type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/MaintenanceWindowAutomationParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MaintenanceWindowAutomationParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The version of an Automation document to use during task execution.
     * </p>
     */
    private String documentVersion;
    /**
     * <p>
     * The parameters for the AUTOMATION task.
     * </p>
     * <p>
     * For information about specifying and updating task parameters, see <a>RegisterTaskWithMaintenanceWindow</a> and
     * <a>UpdateMaintenanceWindowTask</a>.
     * </p>
     * <note>
     * <p>
     * <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the
     * <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the
     * <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options
     * for the supported Maintenance Window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * <p>
     * <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs, instead
     * use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For information
     * about how Systems Manager handles these options for the supported Maintenance Window task types, see
     * <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * <p>
     * For AUTOMATION task types, Systems Manager ignores any values specified for these parameters.
     * </p>
     * </note>
     */
    private java.util.Map<String, java.util.List<String>> parameters;

    /**
     * <p>
     * The version of an Automation document to use during task execution.
     * </p>
     * 
     * @param documentVersion
     *        The version of an Automation document to use during task execution.
     */

    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The version of an Automation document to use during task execution.
     * </p>
     * 
     * @return The version of an Automation document to use during task execution.
     */

    public String getDocumentVersion() {
        return this.documentVersion;
    }

    /**
     * <p>
     * The version of an Automation document to use during task execution.
     * </p>
     * 
     * @param documentVersion
     *        The version of an Automation document to use during task execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowAutomationParameters withDocumentVersion(String documentVersion) {
        setDocumentVersion(documentVersion);
        return this;
    }

    /**
     * <p>
     * The parameters for the AUTOMATION task.
     * </p>
     * <p>
     * For information about specifying and updating task parameters, see <a>RegisterTaskWithMaintenanceWindow</a> and
     * <a>UpdateMaintenanceWindowTask</a>.
     * </p>
     * <note>
     * <p>
     * <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the
     * <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the
     * <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options
     * for the supported Maintenance Window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * <p>
     * <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs, instead
     * use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For information
     * about how Systems Manager handles these options for the supported Maintenance Window task types, see
     * <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * <p>
     * For AUTOMATION task types, Systems Manager ignores any values specified for these parameters.
     * </p>
     * </note>
     * 
     * @return The parameters for the AUTOMATION task.</p>
     *         <p>
     *         For information about specifying and updating task parameters, see
     *         <a>RegisterTaskWithMaintenanceWindow</a> and <a>UpdateMaintenanceWindowTask</a>.
     *         </p>
     *         <note>
     *         <p>
     *         <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the
     *         <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the
     *         <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these
     *         options for the supported Maintenance Window task types, see
     *         <a>MaintenanceWindowTaskInvocationParameters</a>.
     *         </p>
     *         <p>
     *         <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs,
     *         instead use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure.
     *         For information about how Systems Manager handles these options for the supported Maintenance Window task
     *         types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
     *         </p>
     *         <p>
     *         For AUTOMATION task types, Systems Manager ignores any values specified for these parameters.
     *         </p>
     */

    public java.util.Map<String, java.util.List<String>> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The parameters for the AUTOMATION task.
     * </p>
     * <p>
     * For information about specifying and updating task parameters, see <a>RegisterTaskWithMaintenanceWindow</a> and
     * <a>UpdateMaintenanceWindowTask</a>.
     * </p>
     * <note>
     * <p>
     * <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the
     * <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the
     * <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options
     * for the supported Maintenance Window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * <p>
     * <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs, instead
     * use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For information
     * about how Systems Manager handles these options for the supported Maintenance Window task types, see
     * <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * <p>
     * For AUTOMATION task types, Systems Manager ignores any values specified for these parameters.
     * </p>
     * </note>
     * 
     * @param parameters
     *        The parameters for the AUTOMATION task.</p>
     *        <p>
     *        For information about specifying and updating task parameters, see
     *        <a>RegisterTaskWithMaintenanceWindow</a> and <a>UpdateMaintenanceWindowTask</a>.
     *        </p>
     *        <note>
     *        <p>
     *        <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the
     *        <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the
     *        <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these
     *        options for the supported Maintenance Window task types, see
     *        <a>MaintenanceWindowTaskInvocationParameters</a>.
     *        </p>
     *        <p>
     *        <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs,
     *        instead use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For
     *        information about how Systems Manager handles these options for the supported Maintenance Window task
     *        types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
     *        </p>
     *        <p>
     *        For AUTOMATION task types, Systems Manager ignores any values specified for these parameters.
     *        </p>
     */

    public void setParameters(java.util.Map<String, java.util.List<String>> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The parameters for the AUTOMATION task.
     * </p>
     * <p>
     * For information about specifying and updating task parameters, see <a>RegisterTaskWithMaintenanceWindow</a> and
     * <a>UpdateMaintenanceWindowTask</a>.
     * </p>
     * <note>
     * <p>
     * <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the
     * <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the
     * <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options
     * for the supported Maintenance Window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * <p>
     * <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs, instead
     * use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For information
     * about how Systems Manager handles these options for the supported Maintenance Window task types, see
     * <a>MaintenanceWindowTaskInvocationParameters</a>.
     * </p>
     * <p>
     * For AUTOMATION task types, Systems Manager ignores any values specified for these parameters.
     * </p>
     * </note>
     * 
     * @param parameters
     *        The parameters for the AUTOMATION task.</p>
     *        <p>
     *        For information about specifying and updating task parameters, see
     *        <a>RegisterTaskWithMaintenanceWindow</a> and <a>UpdateMaintenanceWindowTask</a>.
     *        </p>
     *        <note>
     *        <p>
     *        <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the
     *        <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the
     *        <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these
     *        options for the supported Maintenance Window task types, see
     *        <a>MaintenanceWindowTaskInvocationParameters</a>.
     *        </p>
     *        <p>
     *        <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs,
     *        instead use the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For
     *        information about how Systems Manager handles these options for the supported Maintenance Window task
     *        types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
     *        </p>
     *        <p>
     *        For AUTOMATION task types, Systems Manager ignores any values specified for these parameters.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowAutomationParameters withParameters(java.util.Map<String, java.util.List<String>> parameters) {
        setParameters(parameters);
        return this;
    }

    public MaintenanceWindowAutomationParameters addParametersEntry(String key, java.util.List<String> value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowAutomationParameters clearParametersEntries() {
        this.parameters = null;
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
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: ").append(getDocumentVersion()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MaintenanceWindowAutomationParameters == false)
            return false;
        MaintenanceWindowAutomationParameters other = (MaintenanceWindowAutomationParameters) obj;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public MaintenanceWindowAutomationParameters clone() {
        try {
            return (MaintenanceWindowAutomationParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.MaintenanceWindowAutomationParametersMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
