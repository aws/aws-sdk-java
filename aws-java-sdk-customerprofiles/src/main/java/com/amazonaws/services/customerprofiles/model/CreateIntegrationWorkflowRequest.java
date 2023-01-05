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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/CreateIntegrationWorkflow"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIntegrationWorkflowRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The type of workflow. The only supported value is APPFLOW_INTEGRATION.
     * </p>
     */
    private String workflowType;
    /**
     * <p>
     * Configuration data for integration workflow.
     * </p>
     */
    private IntegrationConfig integrationConfig;
    /**
     * <p>
     * The name of the profile object type.
     * </p>
     */
    private String objectTypeName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role. Customer Profiles assumes this role to create resources on your
     * behalf as part of workflow execution.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @return The unique name of the domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationWorkflowRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The type of workflow. The only supported value is APPFLOW_INTEGRATION.
     * </p>
     * 
     * @param workflowType
     *        The type of workflow. The only supported value is APPFLOW_INTEGRATION.
     * @see WorkflowType
     */

    public void setWorkflowType(String workflowType) {
        this.workflowType = workflowType;
    }

    /**
     * <p>
     * The type of workflow. The only supported value is APPFLOW_INTEGRATION.
     * </p>
     * 
     * @return The type of workflow. The only supported value is APPFLOW_INTEGRATION.
     * @see WorkflowType
     */

    public String getWorkflowType() {
        return this.workflowType;
    }

    /**
     * <p>
     * The type of workflow. The only supported value is APPFLOW_INTEGRATION.
     * </p>
     * 
     * @param workflowType
     *        The type of workflow. The only supported value is APPFLOW_INTEGRATION.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowType
     */

    public CreateIntegrationWorkflowRequest withWorkflowType(String workflowType) {
        setWorkflowType(workflowType);
        return this;
    }

    /**
     * <p>
     * The type of workflow. The only supported value is APPFLOW_INTEGRATION.
     * </p>
     * 
     * @param workflowType
     *        The type of workflow. The only supported value is APPFLOW_INTEGRATION.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowType
     */

    public CreateIntegrationWorkflowRequest withWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType.toString();
        return this;
    }

    /**
     * <p>
     * Configuration data for integration workflow.
     * </p>
     * 
     * @param integrationConfig
     *        Configuration data for integration workflow.
     */

    public void setIntegrationConfig(IntegrationConfig integrationConfig) {
        this.integrationConfig = integrationConfig;
    }

    /**
     * <p>
     * Configuration data for integration workflow.
     * </p>
     * 
     * @return Configuration data for integration workflow.
     */

    public IntegrationConfig getIntegrationConfig() {
        return this.integrationConfig;
    }

    /**
     * <p>
     * Configuration data for integration workflow.
     * </p>
     * 
     * @param integrationConfig
     *        Configuration data for integration workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationWorkflowRequest withIntegrationConfig(IntegrationConfig integrationConfig) {
        setIntegrationConfig(integrationConfig);
        return this;
    }

    /**
     * <p>
     * The name of the profile object type.
     * </p>
     * 
     * @param objectTypeName
     *        The name of the profile object type.
     */

    public void setObjectTypeName(String objectTypeName) {
        this.objectTypeName = objectTypeName;
    }

    /**
     * <p>
     * The name of the profile object type.
     * </p>
     * 
     * @return The name of the profile object type.
     */

    public String getObjectTypeName() {
        return this.objectTypeName;
    }

    /**
     * <p>
     * The name of the profile object type.
     * </p>
     * 
     * @param objectTypeName
     *        The name of the profile object type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationWorkflowRequest withObjectTypeName(String objectTypeName) {
        setObjectTypeName(objectTypeName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role. Customer Profiles assumes this role to create resources on your
     * behalf as part of workflow execution.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role. Customer Profiles assumes this role to create resources on
     *        your behalf as part of workflow execution.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role. Customer Profiles assumes this role to create resources on your
     * behalf as part of workflow execution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role. Customer Profiles assumes this role to create resources
     *         on your behalf as part of workflow execution.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role. Customer Profiles assumes this role to create resources on your
     * behalf as part of workflow execution.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role. Customer Profiles assumes this role to create resources on
     *        your behalf as part of workflow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationWorkflowRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @return The tags used to organize, track, or control access for this resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationWorkflowRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateIntegrationWorkflowRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationWorkflowRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationWorkflowRequest clearTagsEntries() {
        this.tags = null;
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getWorkflowType() != null)
            sb.append("WorkflowType: ").append(getWorkflowType()).append(",");
        if (getIntegrationConfig() != null)
            sb.append("IntegrationConfig: ").append(getIntegrationConfig()).append(",");
        if (getObjectTypeName() != null)
            sb.append("ObjectTypeName: ").append(getObjectTypeName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIntegrationWorkflowRequest == false)
            return false;
        CreateIntegrationWorkflowRequest other = (CreateIntegrationWorkflowRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getWorkflowType() == null ^ this.getWorkflowType() == null)
            return false;
        if (other.getWorkflowType() != null && other.getWorkflowType().equals(this.getWorkflowType()) == false)
            return false;
        if (other.getIntegrationConfig() == null ^ this.getIntegrationConfig() == null)
            return false;
        if (other.getIntegrationConfig() != null && other.getIntegrationConfig().equals(this.getIntegrationConfig()) == false)
            return false;
        if (other.getObjectTypeName() == null ^ this.getObjectTypeName() == null)
            return false;
        if (other.getObjectTypeName() != null && other.getObjectTypeName().equals(this.getObjectTypeName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getWorkflowType() == null) ? 0 : getWorkflowType().hashCode());
        hashCode = prime * hashCode + ((getIntegrationConfig() == null) ? 0 : getIntegrationConfig().hashCode());
        hashCode = prime * hashCode + ((getObjectTypeName() == null) ? 0 : getObjectTypeName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateIntegrationWorkflowRequest clone() {
        return (CreateIntegrationWorkflowRequest) super.clone();
    }

}
