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
package com.amazonaws.services.servermigration.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains validation parameters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/SSMValidationParameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SSMValidationParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The location of the validation script.
     * </p>
     */
    private Source source;
    /**
     * <p>
     * The ID of the instance. The instance must have the following tag: UserForSMSApplicationValidation=true.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The type of validation script.
     * </p>
     */
    private String scriptType;
    /**
     * <p>
     * The command to run the validation script
     * </p>
     */
    private String command;
    /**
     * <p>
     * The timeout interval, in seconds.
     * </p>
     */
    private Integer executionTimeoutSeconds;
    /**
     * <p>
     * The name of the S3 bucket for output.
     * </p>
     */
    private String outputS3BucketName;

    /**
     * <p>
     * The location of the validation script.
     * </p>
     * 
     * @param source
     *        The location of the validation script.
     */

    public void setSource(Source source) {
        this.source = source;
    }

    /**
     * <p>
     * The location of the validation script.
     * </p>
     * 
     * @return The location of the validation script.
     */

    public Source getSource() {
        return this.source;
    }

    /**
     * <p>
     * The location of the validation script.
     * </p>
     * 
     * @param source
     *        The location of the validation script.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SSMValidationParameters withSource(Source source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The ID of the instance. The instance must have the following tag: UserForSMSApplicationValidation=true.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance. The instance must have the following tag: UserForSMSApplicationValidation=true.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance. The instance must have the following tag: UserForSMSApplicationValidation=true.
     * </p>
     * 
     * @return The ID of the instance. The instance must have the following tag: UserForSMSApplicationValidation=true.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance. The instance must have the following tag: UserForSMSApplicationValidation=true.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance. The instance must have the following tag: UserForSMSApplicationValidation=true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SSMValidationParameters withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The type of validation script.
     * </p>
     * 
     * @param scriptType
     *        The type of validation script.
     * @see ScriptType
     */

    public void setScriptType(String scriptType) {
        this.scriptType = scriptType;
    }

    /**
     * <p>
     * The type of validation script.
     * </p>
     * 
     * @return The type of validation script.
     * @see ScriptType
     */

    public String getScriptType() {
        return this.scriptType;
    }

    /**
     * <p>
     * The type of validation script.
     * </p>
     * 
     * @param scriptType
     *        The type of validation script.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScriptType
     */

    public SSMValidationParameters withScriptType(String scriptType) {
        setScriptType(scriptType);
        return this;
    }

    /**
     * <p>
     * The type of validation script.
     * </p>
     * 
     * @param scriptType
     *        The type of validation script.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScriptType
     */

    public SSMValidationParameters withScriptType(ScriptType scriptType) {
        this.scriptType = scriptType.toString();
        return this;
    }

    /**
     * <p>
     * The command to run the validation script
     * </p>
     * 
     * @param command
     *        The command to run the validation script
     */

    public void setCommand(String command) {
        this.command = command;
    }

    /**
     * <p>
     * The command to run the validation script
     * </p>
     * 
     * @return The command to run the validation script
     */

    public String getCommand() {
        return this.command;
    }

    /**
     * <p>
     * The command to run the validation script
     * </p>
     * 
     * @param command
     *        The command to run the validation script
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SSMValidationParameters withCommand(String command) {
        setCommand(command);
        return this;
    }

    /**
     * <p>
     * The timeout interval, in seconds.
     * </p>
     * 
     * @param executionTimeoutSeconds
     *        The timeout interval, in seconds.
     */

    public void setExecutionTimeoutSeconds(Integer executionTimeoutSeconds) {
        this.executionTimeoutSeconds = executionTimeoutSeconds;
    }

    /**
     * <p>
     * The timeout interval, in seconds.
     * </p>
     * 
     * @return The timeout interval, in seconds.
     */

    public Integer getExecutionTimeoutSeconds() {
        return this.executionTimeoutSeconds;
    }

    /**
     * <p>
     * The timeout interval, in seconds.
     * </p>
     * 
     * @param executionTimeoutSeconds
     *        The timeout interval, in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SSMValidationParameters withExecutionTimeoutSeconds(Integer executionTimeoutSeconds) {
        setExecutionTimeoutSeconds(executionTimeoutSeconds);
        return this;
    }

    /**
     * <p>
     * The name of the S3 bucket for output.
     * </p>
     * 
     * @param outputS3BucketName
     *        The name of the S3 bucket for output.
     */

    public void setOutputS3BucketName(String outputS3BucketName) {
        this.outputS3BucketName = outputS3BucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket for output.
     * </p>
     * 
     * @return The name of the S3 bucket for output.
     */

    public String getOutputS3BucketName() {
        return this.outputS3BucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket for output.
     * </p>
     * 
     * @param outputS3BucketName
     *        The name of the S3 bucket for output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SSMValidationParameters withOutputS3BucketName(String outputS3BucketName) {
        setOutputS3BucketName(outputS3BucketName);
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
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getScriptType() != null)
            sb.append("ScriptType: ").append(getScriptType()).append(",");
        if (getCommand() != null)
            sb.append("Command: ").append(getCommand()).append(",");
        if (getExecutionTimeoutSeconds() != null)
            sb.append("ExecutionTimeoutSeconds: ").append(getExecutionTimeoutSeconds()).append(",");
        if (getOutputS3BucketName() != null)
            sb.append("OutputS3BucketName: ").append(getOutputS3BucketName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SSMValidationParameters == false)
            return false;
        SSMValidationParameters other = (SSMValidationParameters) obj;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getScriptType() == null ^ this.getScriptType() == null)
            return false;
        if (other.getScriptType() != null && other.getScriptType().equals(this.getScriptType()) == false)
            return false;
        if (other.getCommand() == null ^ this.getCommand() == null)
            return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false)
            return false;
        if (other.getExecutionTimeoutSeconds() == null ^ this.getExecutionTimeoutSeconds() == null)
            return false;
        if (other.getExecutionTimeoutSeconds() != null && other.getExecutionTimeoutSeconds().equals(this.getExecutionTimeoutSeconds()) == false)
            return false;
        if (other.getOutputS3BucketName() == null ^ this.getOutputS3BucketName() == null)
            return false;
        if (other.getOutputS3BucketName() != null && other.getOutputS3BucketName().equals(this.getOutputS3BucketName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getScriptType() == null) ? 0 : getScriptType().hashCode());
        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode());
        hashCode = prime * hashCode + ((getExecutionTimeoutSeconds() == null) ? 0 : getExecutionTimeoutSeconds().hashCode());
        hashCode = prime * hashCode + ((getOutputS3BucketName() == null) ? 0 : getOutputS3BucketName().hashCode());
        return hashCode;
    }

    @Override
    public SSMValidationParameters clone() {
        try {
            return (SSMValidationParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servermigration.model.transform.SSMValidationParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
