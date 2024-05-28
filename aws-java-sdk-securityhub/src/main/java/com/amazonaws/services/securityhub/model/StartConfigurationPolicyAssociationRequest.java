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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/StartConfigurationPolicyAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartConfigurationPolicyAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a configuration policy, the universally unique identifier (UUID) of a
     * configuration policy, or a value of <code>SELF_MANAGED_SECURITY_HUB</code> for a self-managed configuration.
     * </p>
     */
    private String configurationPolicyIdentifier;
    /**
     * <p>
     * The identifier of the target account, organizational unit, or the root to associate with the specified
     * configuration.
     * </p>
     */
    private Target target;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a configuration policy, the universally unique identifier (UUID) of a
     * configuration policy, or a value of <code>SELF_MANAGED_SECURITY_HUB</code> for a self-managed configuration.
     * </p>
     * 
     * @param configurationPolicyIdentifier
     *        The Amazon Resource Name (ARN) of a configuration policy, the universally unique identifier (UUID) of a
     *        configuration policy, or a value of <code>SELF_MANAGED_SECURITY_HUB</code> for a self-managed
     *        configuration.
     */

    public void setConfigurationPolicyIdentifier(String configurationPolicyIdentifier) {
        this.configurationPolicyIdentifier = configurationPolicyIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a configuration policy, the universally unique identifier (UUID) of a
     * configuration policy, or a value of <code>SELF_MANAGED_SECURITY_HUB</code> for a self-managed configuration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a configuration policy, the universally unique identifier (UUID) of a
     *         configuration policy, or a value of <code>SELF_MANAGED_SECURITY_HUB</code> for a self-managed
     *         configuration.
     */

    public String getConfigurationPolicyIdentifier() {
        return this.configurationPolicyIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a configuration policy, the universally unique identifier (UUID) of a
     * configuration policy, or a value of <code>SELF_MANAGED_SECURITY_HUB</code> for a self-managed configuration.
     * </p>
     * 
     * @param configurationPolicyIdentifier
     *        The Amazon Resource Name (ARN) of a configuration policy, the universally unique identifier (UUID) of a
     *        configuration policy, or a value of <code>SELF_MANAGED_SECURITY_HUB</code> for a self-managed
     *        configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartConfigurationPolicyAssociationRequest withConfigurationPolicyIdentifier(String configurationPolicyIdentifier) {
        setConfigurationPolicyIdentifier(configurationPolicyIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the target account, organizational unit, or the root to associate with the specified
     * configuration.
     * </p>
     * 
     * @param target
     *        The identifier of the target account, organizational unit, or the root to associate with the specified
     *        configuration.
     */

    public void setTarget(Target target) {
        this.target = target;
    }

    /**
     * <p>
     * The identifier of the target account, organizational unit, or the root to associate with the specified
     * configuration.
     * </p>
     * 
     * @return The identifier of the target account, organizational unit, or the root to associate with the specified
     *         configuration.
     */

    public Target getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The identifier of the target account, organizational unit, or the root to associate with the specified
     * configuration.
     * </p>
     * 
     * @param target
     *        The identifier of the target account, organizational unit, or the root to associate with the specified
     *        configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartConfigurationPolicyAssociationRequest withTarget(Target target) {
        setTarget(target);
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
        if (getConfigurationPolicyIdentifier() != null)
            sb.append("ConfigurationPolicyIdentifier: ").append(getConfigurationPolicyIdentifier()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartConfigurationPolicyAssociationRequest == false)
            return false;
        StartConfigurationPolicyAssociationRequest other = (StartConfigurationPolicyAssociationRequest) obj;
        if (other.getConfigurationPolicyIdentifier() == null ^ this.getConfigurationPolicyIdentifier() == null)
            return false;
        if (other.getConfigurationPolicyIdentifier() != null
                && other.getConfigurationPolicyIdentifier().equals(this.getConfigurationPolicyIdentifier()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationPolicyIdentifier() == null) ? 0 : getConfigurationPolicyIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        return hashCode;
    }

    @Override
    public StartConfigurationPolicyAssociationRequest clone() {
        return (StartConfigurationPolicyAssociationRequest) super.clone();
    }

}
