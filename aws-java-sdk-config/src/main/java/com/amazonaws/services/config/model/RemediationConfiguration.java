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
            sb.append("ResourceType: ").append(getResourceType());
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
