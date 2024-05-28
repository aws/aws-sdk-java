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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateConfigurationPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConfigurationPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) or universally unique identifier (UUID) of the configuration policy.
     * </p>
     */
    private String identifier;
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
     * The reason for updating the configuration policy.
     * </p>
     */
    private String updatedReason;
    /**
     * <p>
     * An object that defines how Security Hub is configured. It includes whether Security Hub is enabled or disabled, a
     * list of enabled security standards, a list of enabled or disabled security controls, and a list of custom
     * parameter values for specified controls. If you provide a list of security controls that are enabled in the
     * configuration policy, Security Hub disables all other controls (including newly released controls). If you
     * provide a list of security controls that are disabled in the configuration policy, Security Hub enables all other
     * controls (including newly released controls).
     * </p>
     * <p>
     * When updating a configuration policy, provide a complete list of standards that you want to enable and a complete
     * list of controls that you want to enable or disable. The updated configuration replaces the current
     * configuration.
     * </p>
     */
    private Policy configurationPolicy;

    /**
     * <p>
     * The Amazon Resource Name (ARN) or universally unique identifier (UUID) of the configuration policy.
     * </p>
     * 
     * @param identifier
     *        The Amazon Resource Name (ARN) or universally unique identifier (UUID) of the configuration policy.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or universally unique identifier (UUID) of the configuration policy.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) or universally unique identifier (UUID) of the configuration policy.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or universally unique identifier (UUID) of the configuration policy.
     * </p>
     * 
     * @param identifier
     *        The Amazon Resource Name (ARN) or universally unique identifier (UUID) of the configuration policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfigurationPolicyRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
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

    public UpdateConfigurationPolicyRequest withName(String name) {
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

    public UpdateConfigurationPolicyRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The reason for updating the configuration policy.
     * </p>
     * 
     * @param updatedReason
     *        The reason for updating the configuration policy.
     */

    public void setUpdatedReason(String updatedReason) {
        this.updatedReason = updatedReason;
    }

    /**
     * <p>
     * The reason for updating the configuration policy.
     * </p>
     * 
     * @return The reason for updating the configuration policy.
     */

    public String getUpdatedReason() {
        return this.updatedReason;
    }

    /**
     * <p>
     * The reason for updating the configuration policy.
     * </p>
     * 
     * @param updatedReason
     *        The reason for updating the configuration policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfigurationPolicyRequest withUpdatedReason(String updatedReason) {
        setUpdatedReason(updatedReason);
        return this;
    }

    /**
     * <p>
     * An object that defines how Security Hub is configured. It includes whether Security Hub is enabled or disabled, a
     * list of enabled security standards, a list of enabled or disabled security controls, and a list of custom
     * parameter values for specified controls. If you provide a list of security controls that are enabled in the
     * configuration policy, Security Hub disables all other controls (including newly released controls). If you
     * provide a list of security controls that are disabled in the configuration policy, Security Hub enables all other
     * controls (including newly released controls).
     * </p>
     * <p>
     * When updating a configuration policy, provide a complete list of standards that you want to enable and a complete
     * list of controls that you want to enable or disable. The updated configuration replaces the current
     * configuration.
     * </p>
     * 
     * @param configurationPolicy
     *        An object that defines how Security Hub is configured. It includes whether Security Hub is enabled or
     *        disabled, a list of enabled security standards, a list of enabled or disabled security controls, and a
     *        list of custom parameter values for specified controls. If you provide a list of security controls that
     *        are enabled in the configuration policy, Security Hub disables all other controls (including newly
     *        released controls). If you provide a list of security controls that are disabled in the configuration
     *        policy, Security Hub enables all other controls (including newly released controls). </p>
     *        <p>
     *        When updating a configuration policy, provide a complete list of standards that you want to enable and a
     *        complete list of controls that you want to enable or disable. The updated configuration replaces the
     *        current configuration.
     */

    public void setConfigurationPolicy(Policy configurationPolicy) {
        this.configurationPolicy = configurationPolicy;
    }

    /**
     * <p>
     * An object that defines how Security Hub is configured. It includes whether Security Hub is enabled or disabled, a
     * list of enabled security standards, a list of enabled or disabled security controls, and a list of custom
     * parameter values for specified controls. If you provide a list of security controls that are enabled in the
     * configuration policy, Security Hub disables all other controls (including newly released controls). If you
     * provide a list of security controls that are disabled in the configuration policy, Security Hub enables all other
     * controls (including newly released controls).
     * </p>
     * <p>
     * When updating a configuration policy, provide a complete list of standards that you want to enable and a complete
     * list of controls that you want to enable or disable. The updated configuration replaces the current
     * configuration.
     * </p>
     * 
     * @return An object that defines how Security Hub is configured. It includes whether Security Hub is enabled or
     *         disabled, a list of enabled security standards, a list of enabled or disabled security controls, and a
     *         list of custom parameter values for specified controls. If you provide a list of security controls that
     *         are enabled in the configuration policy, Security Hub disables all other controls (including newly
     *         released controls). If you provide a list of security controls that are disabled in the configuration
     *         policy, Security Hub enables all other controls (including newly released controls). </p>
     *         <p>
     *         When updating a configuration policy, provide a complete list of standards that you want to enable and a
     *         complete list of controls that you want to enable or disable. The updated configuration replaces the
     *         current configuration.
     */

    public Policy getConfigurationPolicy() {
        return this.configurationPolicy;
    }

    /**
     * <p>
     * An object that defines how Security Hub is configured. It includes whether Security Hub is enabled or disabled, a
     * list of enabled security standards, a list of enabled or disabled security controls, and a list of custom
     * parameter values for specified controls. If you provide a list of security controls that are enabled in the
     * configuration policy, Security Hub disables all other controls (including newly released controls). If you
     * provide a list of security controls that are disabled in the configuration policy, Security Hub enables all other
     * controls (including newly released controls).
     * </p>
     * <p>
     * When updating a configuration policy, provide a complete list of standards that you want to enable and a complete
     * list of controls that you want to enable or disable. The updated configuration replaces the current
     * configuration.
     * </p>
     * 
     * @param configurationPolicy
     *        An object that defines how Security Hub is configured. It includes whether Security Hub is enabled or
     *        disabled, a list of enabled security standards, a list of enabled or disabled security controls, and a
     *        list of custom parameter values for specified controls. If you provide a list of security controls that
     *        are enabled in the configuration policy, Security Hub disables all other controls (including newly
     *        released controls). If you provide a list of security controls that are disabled in the configuration
     *        policy, Security Hub enables all other controls (including newly released controls). </p>
     *        <p>
     *        When updating a configuration policy, provide a complete list of standards that you want to enable and a
     *        complete list of controls that you want to enable or disable. The updated configuration replaces the
     *        current configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfigurationPolicyRequest withConfigurationPolicy(Policy configurationPolicy) {
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
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getUpdatedReason() != null)
            sb.append("UpdatedReason: ").append(getUpdatedReason()).append(",");
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

        if (obj instanceof UpdateConfigurationPolicyRequest == false)
            return false;
        UpdateConfigurationPolicyRequest other = (UpdateConfigurationPolicyRequest) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getUpdatedReason() == null ^ this.getUpdatedReason() == null)
            return false;
        if (other.getUpdatedReason() != null && other.getUpdatedReason().equals(this.getUpdatedReason()) == false)
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

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getUpdatedReason() == null) ? 0 : getUpdatedReason().hashCode());
        hashCode = prime * hashCode + ((getConfigurationPolicy() == null) ? 0 : getConfigurationPolicy().hashCode());
        return hashCode;
    }

    @Override
    public UpdateConfigurationPolicyRequest clone() {
        return (UpdateConfigurationPolicyRequest) super.clone();
    }

}
