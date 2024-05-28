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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains the details of an Security Hub configuration policy that’s returned in a
 * <code>ListConfigurationPolicies</code> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ConfigurationPolicySummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigurationPolicySummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configuration policy.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The universally unique identifier (UUID) of the configuration policy.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the configuration policy. Alphanumeric characters and the following ASCII characters are permitted:
     * <code>-, ., !, *, /</code>.
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
     * Indicates whether the service that the configuration policy applies to is enabled in the policy.
     * </p>
     */
    private Boolean serviceEnabled;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configuration policy.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the configuration policy.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configuration policy.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the configuration policy.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configuration policy.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the configuration policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationPolicySummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The universally unique identifier (UUID) of the configuration policy.
     * </p>
     * 
     * @param id
     *        The universally unique identifier (UUID) of the configuration policy.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The universally unique identifier (UUID) of the configuration policy.
     * </p>
     * 
     * @return The universally unique identifier (UUID) of the configuration policy.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The universally unique identifier (UUID) of the configuration policy.
     * </p>
     * 
     * @param id
     *        The universally unique identifier (UUID) of the configuration policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationPolicySummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the configuration policy. Alphanumeric characters and the following ASCII characters are permitted:
     * <code>-, ., !, *, /</code>.
     * </p>
     * 
     * @param name
     *        The name of the configuration policy. Alphanumeric characters and the following ASCII characters are
     *        permitted: <code>-, ., !, *, /</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the configuration policy. Alphanumeric characters and the following ASCII characters are permitted:
     * <code>-, ., !, *, /</code>.
     * </p>
     * 
     * @return The name of the configuration policy. Alphanumeric characters and the following ASCII characters are
     *         permitted: <code>-, ., !, *, /</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the configuration policy. Alphanumeric characters and the following ASCII characters are permitted:
     * <code>-, ., !, *, /</code>.
     * </p>
     * 
     * @param name
     *        The name of the configuration policy. Alphanumeric characters and the following ASCII characters are
     *        permitted: <code>-, ., !, *, /</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationPolicySummary withName(String name) {
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

    public ConfigurationPolicySummary withDescription(String description) {
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

    public ConfigurationPolicySummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * Indicates whether the service that the configuration policy applies to is enabled in the policy.
     * </p>
     * 
     * @param serviceEnabled
     *        Indicates whether the service that the configuration policy applies to is enabled in the policy.
     */

    public void setServiceEnabled(Boolean serviceEnabled) {
        this.serviceEnabled = serviceEnabled;
    }

    /**
     * <p>
     * Indicates whether the service that the configuration policy applies to is enabled in the policy.
     * </p>
     * 
     * @return Indicates whether the service that the configuration policy applies to is enabled in the policy.
     */

    public Boolean getServiceEnabled() {
        return this.serviceEnabled;
    }

    /**
     * <p>
     * Indicates whether the service that the configuration policy applies to is enabled in the policy.
     * </p>
     * 
     * @param serviceEnabled
     *        Indicates whether the service that the configuration policy applies to is enabled in the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationPolicySummary withServiceEnabled(Boolean serviceEnabled) {
        setServiceEnabled(serviceEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether the service that the configuration policy applies to is enabled in the policy.
     * </p>
     * 
     * @return Indicates whether the service that the configuration policy applies to is enabled in the policy.
     */

    public Boolean isServiceEnabled() {
        return this.serviceEnabled;
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
        if (getServiceEnabled() != null)
            sb.append("ServiceEnabled: ").append(getServiceEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigurationPolicySummary == false)
            return false;
        ConfigurationPolicySummary other = (ConfigurationPolicySummary) obj;
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
        if (other.getServiceEnabled() == null ^ this.getServiceEnabled() == null)
            return false;
        if (other.getServiceEnabled() != null && other.getServiceEnabled().equals(this.getServiceEnabled()) == false)
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
        hashCode = prime * hashCode + ((getServiceEnabled() == null) ? 0 : getServiceEnabled().hashCode());
        return hashCode;
    }

    @Override
    public ConfigurationPolicySummary clone() {
        try {
            return (ConfigurationPolicySummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.ConfigurationPolicySummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
