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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchGetConfigurationPolicyAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetConfigurationPolicyAssociationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies one or more target account IDs, organizational unit (OU) IDs, or the root ID to retrieve associations
     * for.
     * </p>
     */
    private java.util.List<ConfigurationPolicyAssociation> configurationPolicyAssociationIdentifiers;

    /**
     * <p>
     * Specifies one or more target account IDs, organizational unit (OU) IDs, or the root ID to retrieve associations
     * for.
     * </p>
     * 
     * @return Specifies one or more target account IDs, organizational unit (OU) IDs, or the root ID to retrieve
     *         associations for.
     */

    public java.util.List<ConfigurationPolicyAssociation> getConfigurationPolicyAssociationIdentifiers() {
        return configurationPolicyAssociationIdentifiers;
    }

    /**
     * <p>
     * Specifies one or more target account IDs, organizational unit (OU) IDs, or the root ID to retrieve associations
     * for.
     * </p>
     * 
     * @param configurationPolicyAssociationIdentifiers
     *        Specifies one or more target account IDs, organizational unit (OU) IDs, or the root ID to retrieve
     *        associations for.
     */

    public void setConfigurationPolicyAssociationIdentifiers(java.util.Collection<ConfigurationPolicyAssociation> configurationPolicyAssociationIdentifiers) {
        if (configurationPolicyAssociationIdentifiers == null) {
            this.configurationPolicyAssociationIdentifiers = null;
            return;
        }

        this.configurationPolicyAssociationIdentifiers = new java.util.ArrayList<ConfigurationPolicyAssociation>(configurationPolicyAssociationIdentifiers);
    }

    /**
     * <p>
     * Specifies one or more target account IDs, organizational unit (OU) IDs, or the root ID to retrieve associations
     * for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigurationPolicyAssociationIdentifiers(java.util.Collection)} or
     * {@link #withConfigurationPolicyAssociationIdentifiers(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param configurationPolicyAssociationIdentifiers
     *        Specifies one or more target account IDs, organizational unit (OU) IDs, or the root ID to retrieve
     *        associations for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetConfigurationPolicyAssociationsRequest withConfigurationPolicyAssociationIdentifiers(
            ConfigurationPolicyAssociation... configurationPolicyAssociationIdentifiers) {
        if (this.configurationPolicyAssociationIdentifiers == null) {
            setConfigurationPolicyAssociationIdentifiers(new java.util.ArrayList<ConfigurationPolicyAssociation>(
                    configurationPolicyAssociationIdentifiers.length));
        }
        for (ConfigurationPolicyAssociation ele : configurationPolicyAssociationIdentifiers) {
            this.configurationPolicyAssociationIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies one or more target account IDs, organizational unit (OU) IDs, or the root ID to retrieve associations
     * for.
     * </p>
     * 
     * @param configurationPolicyAssociationIdentifiers
     *        Specifies one or more target account IDs, organizational unit (OU) IDs, or the root ID to retrieve
     *        associations for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetConfigurationPolicyAssociationsRequest withConfigurationPolicyAssociationIdentifiers(
            java.util.Collection<ConfigurationPolicyAssociation> configurationPolicyAssociationIdentifiers) {
        setConfigurationPolicyAssociationIdentifiers(configurationPolicyAssociationIdentifiers);
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
        if (getConfigurationPolicyAssociationIdentifiers() != null)
            sb.append("ConfigurationPolicyAssociationIdentifiers: ").append(getConfigurationPolicyAssociationIdentifiers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetConfigurationPolicyAssociationsRequest == false)
            return false;
        BatchGetConfigurationPolicyAssociationsRequest other = (BatchGetConfigurationPolicyAssociationsRequest) obj;
        if (other.getConfigurationPolicyAssociationIdentifiers() == null ^ this.getConfigurationPolicyAssociationIdentifiers() == null)
            return false;
        if (other.getConfigurationPolicyAssociationIdentifiers() != null
                && other.getConfigurationPolicyAssociationIdentifiers().equals(this.getConfigurationPolicyAssociationIdentifiers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConfigurationPolicyAssociationIdentifiers() == null) ? 0 : getConfigurationPolicyAssociationIdentifiers().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetConfigurationPolicyAssociationsRequest clone() {
        return (BatchGetConfigurationPolicyAssociationsRequest) super.clone();
    }

}
