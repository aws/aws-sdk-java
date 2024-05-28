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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetConfigurationPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetConfigurationPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the configuration policy.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The UUID of the configuration policy.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the configuration policy.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the configuration policy.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The date and time, in UTC and ISO 8601 format, that the configuration policy was last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The date and time, in UTC and ISO 8601 format, that the configuration policy was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * An object that defines how Security Hub is configured. It includes whether Security Hub is enabled or disabled, a
     * list of enabled security standards, a list of enabled or disabled security controls, and a list of custom
     * parameter values for specified controls. If the policy includes a list of security controls that are enabled,
     * Security Hub disables all other controls (including newly released controls). If the policy includes a list of
     * security controls that are disabled, Security Hub enables all other controls (including newly released controls).
     * </p>
     */
    private Policy configurationPolicy;

    /**
     * <p>
     * The ARN of the configuration policy.
     * </p>
     * 
     * @param arn
     *        The ARN of the configuration policy.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the configuration policy.
     * </p>
     * 
     * @return The ARN of the configuration policy.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the configuration policy.
     * </p>
     * 
     * @param arn
     *        The ARN of the configuration policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigurationPolicyResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The UUID of the configuration policy.
     * </p>
     * 
     * @param id
     *        The UUID of the configuration policy.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The UUID of the configuration policy.
     * </p>
     * 
     * @return The UUID of the configuration policy.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The UUID of the configuration policy.
     * </p>
     * 
     * @param id
     *        The UUID of the configuration policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigurationPolicyResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the configuration policy.
     * </p>
     * 
     * @param name
     *        The name of the configuration policy.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the configuration policy.
     * </p>
     * 
     * @return The name of the configuration policy.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the configuration policy.
     * </p>
     * 
     * @param name
     *        The name of the configuration policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigurationPolicyResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the configuration policy.
     * </p>
     * 
     * @param description
     *        The description of the configuration policy.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the configuration policy.
     * </p>
     * 
     * @return The description of the configuration policy.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the configuration policy.
     * </p>
     * 
     * @param description
     *        The description of the configuration policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigurationPolicyResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and ISO 8601 format, that the configuration policy was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time, in UTC and ISO 8601 format, that the configuration policy was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and ISO 8601 format, that the configuration policy was last updated.
     * </p>
     * 
     * @return The date and time, in UTC and ISO 8601 format, that the configuration policy was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and ISO 8601 format, that the configuration policy was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time, in UTC and ISO 8601 format, that the configuration policy was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigurationPolicyResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and ISO 8601 format, that the configuration policy was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time, in UTC and ISO 8601 format, that the configuration policy was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time, in UTC and ISO 8601 format, that the configuration policy was created.
     * </p>
     * 
     * @return The date and time, in UTC and ISO 8601 format, that the configuration policy was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time, in UTC and ISO 8601 format, that the configuration policy was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time, in UTC and ISO 8601 format, that the configuration policy was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigurationPolicyResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * An object that defines how Security Hub is configured. It includes whether Security Hub is enabled or disabled, a
     * list of enabled security standards, a list of enabled or disabled security controls, and a list of custom
     * parameter values for specified controls. If the policy includes a list of security controls that are enabled,
     * Security Hub disables all other controls (including newly released controls). If the policy includes a list of
     * security controls that are disabled, Security Hub enables all other controls (including newly released controls).
     * </p>
     * 
     * @param configurationPolicy
     *        An object that defines how Security Hub is configured. It includes whether Security Hub is enabled or
     *        disabled, a list of enabled security standards, a list of enabled or disabled security controls, and a
     *        list of custom parameter values for specified controls. If the policy includes a list of security controls
     *        that are enabled, Security Hub disables all other controls (including newly released controls). If the
     *        policy includes a list of security controls that are disabled, Security Hub enables all other controls
     *        (including newly released controls).
     */

    public void setConfigurationPolicy(Policy configurationPolicy) {
        this.configurationPolicy = configurationPolicy;
    }

    /**
     * <p>
     * An object that defines how Security Hub is configured. It includes whether Security Hub is enabled or disabled, a
     * list of enabled security standards, a list of enabled or disabled security controls, and a list of custom
     * parameter values for specified controls. If the policy includes a list of security controls that are enabled,
     * Security Hub disables all other controls (including newly released controls). If the policy includes a list of
     * security controls that are disabled, Security Hub enables all other controls (including newly released controls).
     * </p>
     * 
     * @return An object that defines how Security Hub is configured. It includes whether Security Hub is enabled or
     *         disabled, a list of enabled security standards, a list of enabled or disabled security controls, and a
     *         list of custom parameter values for specified controls. If the policy includes a list of security
     *         controls that are enabled, Security Hub disables all other controls (including newly released controls).
     *         If the policy includes a list of security controls that are disabled, Security Hub enables all other
     *         controls (including newly released controls).
     */

    public Policy getConfigurationPolicy() {
        return this.configurationPolicy;
    }

    /**
     * <p>
     * An object that defines how Security Hub is configured. It includes whether Security Hub is enabled or disabled, a
     * list of enabled security standards, a list of enabled or disabled security controls, and a list of custom
     * parameter values for specified controls. If the policy includes a list of security controls that are enabled,
     * Security Hub disables all other controls (including newly released controls). If the policy includes a list of
     * security controls that are disabled, Security Hub enables all other controls (including newly released controls).
     * </p>
     * 
     * @param configurationPolicy
     *        An object that defines how Security Hub is configured. It includes whether Security Hub is enabled or
     *        disabled, a list of enabled security standards, a list of enabled or disabled security controls, and a
     *        list of custom parameter values for specified controls. If the policy includes a list of security controls
     *        that are enabled, Security Hub disables all other controls (including newly released controls). If the
     *        policy includes a list of security controls that are disabled, Security Hub enables all other controls
     *        (including newly released controls).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigurationPolicyResult withConfigurationPolicy(Policy configurationPolicy) {
        setConfigurationPolicy(configurationPolicy);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getConfigurationPolicy() != null)
            sb.append("ConfigurationPolicy: ").append(getConfigurationPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetConfigurationPolicyResult == false)
            return false;
        GetConfigurationPolicyResult other = (GetConfigurationPolicyResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getConfigurationPolicy() == null ^ this.getConfigurationPolicy() == null)
            return false;
        if (other.getConfigurationPolicy() != null && other.getConfigurationPolicy().equals(this.getConfigurationPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getConfigurationPolicy() == null) ? 0 : getConfigurationPolicy().hashCode());
        return hashCode;
    }

    @Override
    public GetConfigurationPolicyResult clone() {
        try {
            return (GetConfigurationPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
