/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents the details about the remediation configuration that includes the remediation action,
 * parameters, and data to execute the action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/RemediationConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemediationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the AWS Config rule.
     * </p>
     */
    private String configRuleName;
    /**
     * <p>
     * The type of the target. Target executes remediation. For example, SSM document.
     * </p>
     */
    private String targetType;
    /**
     * <p>
     * Target ID is the name of the public document.
     * </p>
     */
    private String targetId;
    /**
     * <p>
     * Version of the target. For example, version of the SSM document.
     * </p>
     */
    private String targetVersion;
    /**
     * <p>
     * An object of the RemediationParameterValue.
     * </p>
     */
    private java.util.Map<String, RemediationParameterValue> parameters;
    /**
     * <p>
     * The type of a resource.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The remediation is triggered automatically.
     * </p>
     */
    private Boolean automatic;
    /**
     * <p>
     * An ExecutionControls object.
     * </p>
     */
    private ExecutionControls executionControls;
    /**
     * <p>
     * The maximum number of failed attempts for auto-remediation. If you do not select a number, the default is 5.
     * </p>
     * <p>
     * For example, if you specify MaximumAutomaticAttempts as 5 with RetryAttemptsSeconds as 50 seconds, AWS Config
     * throws an exception after the 5th failed attempt within 50 seconds.
     * </p>
     */
    private Integer maximumAutomaticAttempts;
    /**
     * <p>
     * Maximum time in seconds that AWS Config runs auto-remediation. If you do not select a number, the default is 60
     * seconds.
     * </p>
     * <p>
     * For example, if you specify RetryAttemptsSeconds as 50 seconds and MaximumAutomaticAttempts as 5, AWS Config will
     * run auto-remediations 5 times within 50 seconds before throwing an exception.
     * </p>
     */
    private Long retryAttemptSeconds;
    /**
     * <p>
     * Amazon Resource Name (ARN) of remediation configuration.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Name of the service that owns the service linked rule, if applicable.
     * </p>
     */
    private String createdByService;

    /**
     * <p>
     * The name of the AWS Config rule.
     * </p>
     * 
     * @param configRuleName
     *        The name of the AWS Config rule.
     */

    public void setConfigRuleName(String configRuleName) {
        this.configRuleName = configRuleName;
    }

    /**
     * <p>
     * The name of the AWS Config rule.
     * </p>
     * 
     * @return The name of the AWS Config rule.
     */

    public String getConfigRuleName() {
        return this.configRuleName;
    }

    /**
     * <p>
     * The name of the AWS Config rule.
     * </p>
     * 
     * @param configRuleName
     *        The name of the AWS Config rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemediationConfiguration withConfigRuleName(String configRuleName) {
        setConfigRuleName(configRuleName);
        return this;
    }

    /**
     * <p>
     * The type of the target. Target executes remediation. For example, SSM document.
     * </p>
     * 
     * @param targetType
     *        The type of the target. Target executes remediation. For example, SSM document.
     * @see RemediationTargetType
     */

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    /**
     * <p>
     * The type of the target. Target executes remediation. For example, SSM document.
     * </p>
     * 
     * @return The type of the target. Target executes remediation. For example, SSM document.
     * @see RemediationTargetType
     */

    public String getTargetType() {
        return this.targetType;
    }

    /**
     * <p>
     * The type of the target. Target executes remediation. For example, SSM document.
     * </p>
     * 
     * @param targetType
     *        The type of the target. Target executes remediation. For example, SSM document.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RemediationTargetType
     */

    public RemediationConfiguration withTargetType(String targetType) {
        setTargetType(targetType);
        return this;
    }

    /**
     * <p>
     * The type of the target. Target executes remediation. For example, SSM document.
     * </p>
     * 
     * @param targetType
     *        The type of the target. Target executes remediation. For example, SSM document.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RemediationTargetType
     */

    public RemediationConfiguration withTargetType(RemediationTargetType targetType) {
        this.targetType = targetType.toString();
        return this;
    }

    /**
     * <p>
     * Target ID is the name of the public document.
     * </p>
     * 
     * @param targetId
     *        Target ID is the name of the public document.
     */

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    /**
     * <p>
     * Target ID is the name of the public document.
     * </p>
     * 
     * @return Target ID is the name of the public document.
     */

    public String getTargetId() {
        return this.targetId;
    }

    /**
     * <p>
     * Target ID is the name of the public document.
     * </p>
     * 
     * @param targetId
     *        Target ID is the name of the public document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemediationConfiguration withTargetId(String targetId) {
        setTargetId(targetId);
        return this;
    }

    /**
     * <p>
     * Version of the target. For example, version of the SSM document.
     * </p>
     * 
     * @param targetVersion
     *        Version of the target. For example, version of the SSM document.
     */

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    /**
     * <p>
     * Version of the target. For example, version of the SSM document.
     * </p>
     * 
     * @return Version of the target. For example, version of the SSM document.
     */

    public String getTargetVersion() {
        return this.targetVersion;
    }

    /**
     * <p>
     * Version of the target. For example, version of the SSM document.
     * </p>
     * 
     * @param targetVersion
     *        Version of the target. For example, version of the SSM document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemediationConfiguration withTargetVersion(String targetVersion) {
        setTargetVersion(targetVersion);
        return this;
    }

    /**
     * <p>
     * An object of the RemediationParameterValue.
     * </p>
     * 
     * @return An object of the RemediationParameterValue.
     */

    public java.util.Map<String, RemediationParameterValue> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * An object of the RemediationParameterValue.
     * </p>
     * 
     * @param parameters
     *        An object of the RemediationParameterValue.
     */

    public void setParameters(java.util.Map<String, RemediationParameterValue> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * An object of the RemediationParameterValue.
     * </p>
     * 
     * @param parameters
     *        An object of the RemediationParameterValue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemediationConfiguration withParameters(java.util.Map<String, RemediationParameterValue> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see RemediationConfiguration#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public RemediationConfiguration addParametersEntry(String key, RemediationParameterValue value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, RemediationParameterValue>();
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

    public RemediationConfiguration clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The type of a resource.
     * </p>
     * 
     * @param resourceType
     *        The type of a resource.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of a resource.
     * </p>
     * 
     * @return The type of a resource.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of a resource.
     * </p>
     * 
     * @param resourceType
     *        The type of a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemediationConfiguration withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The remediation is triggered automatically.
     * </p>
     * 
     * @param automatic
     *        The remediation is triggered automatically.
     */

    public void setAutomatic(Boolean automatic) {
        this.automatic = automatic;
    }

    /**
     * <p>
     * The remediation is triggered automatically.
     * </p>
     * 
     * @return The remediation is triggered automatically.
     */

    public Boolean getAutomatic() {
        return this.automatic;
    }

    /**
     * <p>
     * The remediation is triggered automatically.
     * </p>
     * 
     * @param automatic
     *        The remediation is triggered automatically.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemediationConfiguration withAutomatic(Boolean automatic) {
        setAutomatic(automatic);
        return this;
    }

    /**
     * <p>
     * The remediation is triggered automatically.
     * </p>
     * 
     * @return The remediation is triggered automatically.
     */

    public Boolean isAutomatic() {
        return this.automatic;
    }

    /**
     * <p>
     * An ExecutionControls object.
     * </p>
     * 
     * @param executionControls
     *        An ExecutionControls object.
     */

    public void setExecutionControls(ExecutionControls executionControls) {
        this.executionControls = executionControls;
    }

    /**
     * <p>
     * An ExecutionControls object.
     * </p>
     * 
     * @return An ExecutionControls object.
     */

    public ExecutionControls getExecutionControls() {
        return this.executionControls;
    }

    /**
     * <p>
     * An ExecutionControls object.
     * </p>
     * 
     * @param executionControls
     *        An ExecutionControls object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemediationConfiguration withExecutionControls(ExecutionControls executionControls) {
        setExecutionControls(executionControls);
        return this;
    }

    /**
     * <p>
     * The maximum number of failed attempts for auto-remediation. If you do not select a number, the default is 5.
     * </p>
     * <p>
     * For example, if you specify MaximumAutomaticAttempts as 5 with RetryAttemptsSeconds as 50 seconds, AWS Config
     * throws an exception after the 5th failed attempt within 50 seconds.
     * </p>
     * 
     * @param maximumAutomaticAttempts
     *        The maximum number of failed attempts for auto-remediation. If you do not select a number, the default is
     *        5.</p>
     *        <p>
     *        For example, if you specify MaximumAutomaticAttempts as 5 with RetryAttemptsSeconds as 50 seconds, AWS
     *        Config throws an exception after the 5th failed attempt within 50 seconds.
     */

    public void setMaximumAutomaticAttempts(Integer maximumAutomaticAttempts) {
        this.maximumAutomaticAttempts = maximumAutomaticAttempts;
    }

    /**
     * <p>
     * The maximum number of failed attempts for auto-remediation. If you do not select a number, the default is 5.
     * </p>
     * <p>
     * For example, if you specify MaximumAutomaticAttempts as 5 with RetryAttemptsSeconds as 50 seconds, AWS Config
     * throws an exception after the 5th failed attempt within 50 seconds.
     * </p>
     * 
     * @return The maximum number of failed attempts for auto-remediation. If you do not select a number, the default is
     *         5.</p>
     *         <p>
     *         For example, if you specify MaximumAutomaticAttempts as 5 with RetryAttemptsSeconds as 50 seconds, AWS
     *         Config throws an exception after the 5th failed attempt within 50 seconds.
     */

    public Integer getMaximumAutomaticAttempts() {
        return this.maximumAutomaticAttempts;
    }

    /**
     * <p>
     * The maximum number of failed attempts for auto-remediation. If you do not select a number, the default is 5.
     * </p>
     * <p>
     * For example, if you specify MaximumAutomaticAttempts as 5 with RetryAttemptsSeconds as 50 seconds, AWS Config
     * throws an exception after the 5th failed attempt within 50 seconds.
     * </p>
     * 
     * @param maximumAutomaticAttempts
     *        The maximum number of failed attempts for auto-remediation. If you do not select a number, the default is
     *        5.</p>
     *        <p>
     *        For example, if you specify MaximumAutomaticAttempts as 5 with RetryAttemptsSeconds as 50 seconds, AWS
     *        Config throws an exception after the 5th failed attempt within 50 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemediationConfiguration withMaximumAutomaticAttempts(Integer maximumAutomaticAttempts) {
        setMaximumAutomaticAttempts(maximumAutomaticAttempts);
        return this;
    }

    /**
     * <p>
     * Maximum time in seconds that AWS Config runs auto-remediation. If you do not select a number, the default is 60
     * seconds.
     * </p>
     * <p>
     * For example, if you specify RetryAttemptsSeconds as 50 seconds and MaximumAutomaticAttempts as 5, AWS Config will
     * run auto-remediations 5 times within 50 seconds before throwing an exception.
     * </p>
     * 
     * @param retryAttemptSeconds
     *        Maximum time in seconds that AWS Config runs auto-remediation. If you do not select a number, the default
     *        is 60 seconds. </p>
     *        <p>
     *        For example, if you specify RetryAttemptsSeconds as 50 seconds and MaximumAutomaticAttempts as 5, AWS
     *        Config will run auto-remediations 5 times within 50 seconds before throwing an exception.
     */

    public void setRetryAttemptSeconds(Long retryAttemptSeconds) {
        this.retryAttemptSeconds = retryAttemptSeconds;
    }

    /**
     * <p>
     * Maximum time in seconds that AWS Config runs auto-remediation. If you do not select a number, the default is 60
     * seconds.
     * </p>
     * <p>
     * For example, if you specify RetryAttemptsSeconds as 50 seconds and MaximumAutomaticAttempts as 5, AWS Config will
     * run auto-remediations 5 times within 50 seconds before throwing an exception.
     * </p>
     * 
     * @return Maximum time in seconds that AWS Config runs auto-remediation. If you do not select a number, the default
     *         is 60 seconds. </p>
     *         <p>
     *         For example, if you specify RetryAttemptsSeconds as 50 seconds and MaximumAutomaticAttempts as 5, AWS
     *         Config will run auto-remediations 5 times within 50 seconds before throwing an exception.
     */

    public Long getRetryAttemptSeconds() {
        return this.retryAttemptSeconds;
    }

    /**
     * <p>
     * Maximum time in seconds that AWS Config runs auto-remediation. If you do not select a number, the default is 60
     * seconds.
     * </p>
     * <p>
     * For example, if you specify RetryAttemptsSeconds as 50 seconds and MaximumAutomaticAttempts as 5, AWS Config will
     * run auto-remediations 5 times within 50 seconds before throwing an exception.
     * </p>
     * 
     * @param retryAttemptSeconds
     *        Maximum time in seconds that AWS Config runs auto-remediation. If you do not select a number, the default
     *        is 60 seconds. </p>
     *        <p>
     *        For example, if you specify RetryAttemptsSeconds as 50 seconds and MaximumAutomaticAttempts as 5, AWS
     *        Config will run auto-remediations 5 times within 50 seconds before throwing an exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemediationConfiguration withRetryAttemptSeconds(Long retryAttemptSeconds) {
        setRetryAttemptSeconds(retryAttemptSeconds);
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of remediation configuration.
     * </p>
     * 
     * @param arn
     *        Amazon Resource Name (ARN) of remediation configuration.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of remediation configuration.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of remediation configuration.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of remediation configuration.
     * </p>
     * 
     * @param arn
     *        Amazon Resource Name (ARN) of remediation configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemediationConfiguration withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Name of the service that owns the service linked rule, if applicable.
     * </p>
     * 
     * @param createdByService
     *        Name of the service that owns the service linked rule, if applicable.
     */

    public void setCreatedByService(String createdByService) {
        this.createdByService = createdByService;
    }

    /**
     * <p>
     * Name of the service that owns the service linked rule, if applicable.
     * </p>
     * 
     * @return Name of the service that owns the service linked rule, if applicable.
     */

    public String getCreatedByService() {
        return this.createdByService;
    }

    /**
     * <p>
     * Name of the service that owns the service linked rule, if applicable.
     * </p>
     * 
     * @param createdByService
     *        Name of the service that owns the service linked rule, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemediationConfiguration withCreatedByService(String createdByService) {
        setCreatedByService(createdByService);
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
        if (getConfigRuleName() != null)
            sb.append("ConfigRuleName: ").append(getConfigRuleName()).append(",");
        if (getTargetType() != null)
            sb.append("TargetType: ").append(getTargetType()).append(",");
        if (getTargetId() != null)
            sb.append("TargetId: ").append(getTargetId()).append(",");
        if (getTargetVersion() != null)
            sb.append("TargetVersion: ").append(getTargetVersion()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getAutomatic() != null)
            sb.append("Automatic: ").append(getAutomatic()).append(",");
        if (getExecutionControls() != null)
            sb.append("ExecutionControls: ").append(getExecutionControls()).append(",");
        if (getMaximumAutomaticAttempts() != null)
            sb.append("MaximumAutomaticAttempts: ").append(getMaximumAutomaticAttempts()).append(",");
        if (getRetryAttemptSeconds() != null)
            sb.append("RetryAttemptSeconds: ").append(getRetryAttemptSeconds()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedByService() != null)
            sb.append("CreatedByService: ").append(getCreatedByService());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemediationConfiguration == false)
            return false;
        RemediationConfiguration other = (RemediationConfiguration) obj;
        if (other.getConfigRuleName() == null ^ this.getConfigRuleName() == null)
            return false;
        if (other.getConfigRuleName() != null && other.getConfigRuleName().equals(this.getConfigRuleName()) == false)
            return false;
        if (other.getTargetType() == null ^ this.getTargetType() == null)
            return false;
        if (other.getTargetType() != null && other.getTargetType().equals(this.getTargetType()) == false)
            return false;
        if (other.getTargetId() == null ^ this.getTargetId() == null)
            return false;
        if (other.getTargetId() != null && other.getTargetId().equals(this.getTargetId()) == false)
            return false;
        if (other.getTargetVersion() == null ^ this.getTargetVersion() == null)
            return false;
        if (other.getTargetVersion() != null && other.getTargetVersion().equals(this.getTargetVersion()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getAutomatic() == null ^ this.getAutomatic() == null)
            return false;
        if (other.getAutomatic() != null && other.getAutomatic().equals(this.getAutomatic()) == false)
            return false;
        if (other.getExecutionControls() == null ^ this.getExecutionControls() == null)
            return false;
        if (other.getExecutionControls() != null && other.getExecutionControls().equals(this.getExecutionControls()) == false)
            return false;
        if (other.getMaximumAutomaticAttempts() == null ^ this.getMaximumAutomaticAttempts() == null)
            return false;
        if (other.getMaximumAutomaticAttempts() != null && other.getMaximumAutomaticAttempts().equals(this.getMaximumAutomaticAttempts()) == false)
            return false;
        if (other.getRetryAttemptSeconds() == null ^ this.getRetryAttemptSeconds() == null)
            return false;
        if (other.getRetryAttemptSeconds() != null && other.getRetryAttemptSeconds().equals(this.getRetryAttemptSeconds()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedByService() == null ^ this.getCreatedByService() == null)
            return false;
        if (other.getCreatedByService() != null && other.getCreatedByService().equals(this.getCreatedByService()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigRuleName() == null) ? 0 : getConfigRuleName().hashCode());
        hashCode = prime * hashCode + ((getTargetType() == null) ? 0 : getTargetType().hashCode());
        hashCode = prime * hashCode + ((getTargetId() == null) ? 0 : getTargetId().hashCode());
        hashCode = prime * hashCode + ((getTargetVersion() == null) ? 0 : getTargetVersion().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getAutomatic() == null) ? 0 : getAutomatic().hashCode());
        hashCode = prime * hashCode + ((getExecutionControls() == null) ? 0 : getExecutionControls().hashCode());
        hashCode = prime * hashCode + ((getMaximumAutomaticAttempts() == null) ? 0 : getMaximumAutomaticAttempts().hashCode());
        hashCode = prime * hashCode + ((getRetryAttemptSeconds() == null) ? 0 : getRetryAttemptSeconds().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedByService() == null) ? 0 : getCreatedByService().hashCode());
        return hashCode;
    }

    @Override
    public RemediationConfiguration clone() {
        try {
            return (RemediationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.RemediationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
