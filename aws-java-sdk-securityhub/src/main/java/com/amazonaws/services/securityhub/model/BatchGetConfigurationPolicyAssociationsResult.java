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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchGetConfigurationPolicyAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetConfigurationPolicyAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Describes associations for the target accounts, OUs, or the root.
     * </p>
     */
    private java.util.List<ConfigurationPolicyAssociationSummary> configurationPolicyAssociations;
    /**
     * <p>
     * An array of configuration policy associations, one for each configuration policy association identifier, that was
     * specified in the request but couldn’t be processed due to an error.
     * </p>
     */
    private java.util.List<UnprocessedConfigurationPolicyAssociation> unprocessedConfigurationPolicyAssociations;

    /**
     * <p>
     * Describes associations for the target accounts, OUs, or the root.
     * </p>
     * 
     * @return Describes associations for the target accounts, OUs, or the root.
     */

    public java.util.List<ConfigurationPolicyAssociationSummary> getConfigurationPolicyAssociations() {
        return configurationPolicyAssociations;
    }

    /**
     * <p>
     * Describes associations for the target accounts, OUs, or the root.
     * </p>
     * 
     * @param configurationPolicyAssociations
     *        Describes associations for the target accounts, OUs, or the root.
     */

    public void setConfigurationPolicyAssociations(java.util.Collection<ConfigurationPolicyAssociationSummary> configurationPolicyAssociations) {
        if (configurationPolicyAssociations == null) {
            this.configurationPolicyAssociations = null;
            return;
        }

        this.configurationPolicyAssociations = new java.util.ArrayList<ConfigurationPolicyAssociationSummary>(configurationPolicyAssociations);
    }

    /**
     * <p>
     * Describes associations for the target accounts, OUs, or the root.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigurationPolicyAssociations(java.util.Collection)} or
     * {@link #withConfigurationPolicyAssociations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param configurationPolicyAssociations
     *        Describes associations for the target accounts, OUs, or the root.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetConfigurationPolicyAssociationsResult withConfigurationPolicyAssociations(
            ConfigurationPolicyAssociationSummary... configurationPolicyAssociations) {
        if (this.configurationPolicyAssociations == null) {
            setConfigurationPolicyAssociations(new java.util.ArrayList<ConfigurationPolicyAssociationSummary>(configurationPolicyAssociations.length));
        }
        for (ConfigurationPolicyAssociationSummary ele : configurationPolicyAssociations) {
            this.configurationPolicyAssociations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes associations for the target accounts, OUs, or the root.
     * </p>
     * 
     * @param configurationPolicyAssociations
     *        Describes associations for the target accounts, OUs, or the root.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetConfigurationPolicyAssociationsResult withConfigurationPolicyAssociations(
            java.util.Collection<ConfigurationPolicyAssociationSummary> configurationPolicyAssociations) {
        setConfigurationPolicyAssociations(configurationPolicyAssociations);
        return this;
    }

    /**
     * <p>
     * An array of configuration policy associations, one for each configuration policy association identifier, that was
     * specified in the request but couldn’t be processed due to an error.
     * </p>
     * 
     * @return An array of configuration policy associations, one for each configuration policy association identifier,
     *         that was specified in the request but couldn’t be processed due to an error.
     */

    public java.util.List<UnprocessedConfigurationPolicyAssociation> getUnprocessedConfigurationPolicyAssociations() {
        return unprocessedConfigurationPolicyAssociations;
    }

    /**
     * <p>
     * An array of configuration policy associations, one for each configuration policy association identifier, that was
     * specified in the request but couldn’t be processed due to an error.
     * </p>
     * 
     * @param unprocessedConfigurationPolicyAssociations
     *        An array of configuration policy associations, one for each configuration policy association identifier,
     *        that was specified in the request but couldn’t be processed due to an error.
     */

    public void setUnprocessedConfigurationPolicyAssociations(
            java.util.Collection<UnprocessedConfigurationPolicyAssociation> unprocessedConfigurationPolicyAssociations) {
        if (unprocessedConfigurationPolicyAssociations == null) {
            this.unprocessedConfigurationPolicyAssociations = null;
            return;
        }

        this.unprocessedConfigurationPolicyAssociations = new java.util.ArrayList<UnprocessedConfigurationPolicyAssociation>(
                unprocessedConfigurationPolicyAssociations);
    }

    /**
     * <p>
     * An array of configuration policy associations, one for each configuration policy association identifier, that was
     * specified in the request but couldn’t be processed due to an error.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnprocessedConfigurationPolicyAssociations(java.util.Collection)} or
     * {@link #withUnprocessedConfigurationPolicyAssociations(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param unprocessedConfigurationPolicyAssociations
     *        An array of configuration policy associations, one for each configuration policy association identifier,
     *        that was specified in the request but couldn’t be processed due to an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetConfigurationPolicyAssociationsResult withUnprocessedConfigurationPolicyAssociations(
            UnprocessedConfigurationPolicyAssociation... unprocessedConfigurationPolicyAssociations) {
        if (this.unprocessedConfigurationPolicyAssociations == null) {
            setUnprocessedConfigurationPolicyAssociations(new java.util.ArrayList<UnprocessedConfigurationPolicyAssociation>(
                    unprocessedConfigurationPolicyAssociations.length));
        }
        for (UnprocessedConfigurationPolicyAssociation ele : unprocessedConfigurationPolicyAssociations) {
            this.unprocessedConfigurationPolicyAssociations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of configuration policy associations, one for each configuration policy association identifier, that was
     * specified in the request but couldn’t be processed due to an error.
     * </p>
     * 
     * @param unprocessedConfigurationPolicyAssociations
     *        An array of configuration policy associations, one for each configuration policy association identifier,
     *        that was specified in the request but couldn’t be processed due to an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetConfigurationPolicyAssociationsResult withUnprocessedConfigurationPolicyAssociations(
            java.util.Collection<UnprocessedConfigurationPolicyAssociation> unprocessedConfigurationPolicyAssociations) {
        setUnprocessedConfigurationPolicyAssociations(unprocessedConfigurationPolicyAssociations);
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
        if (getConfigurationPolicyAssociations() != null)
            sb.append("ConfigurationPolicyAssociations: ").append(getConfigurationPolicyAssociations()).append(",");
        if (getUnprocessedConfigurationPolicyAssociations() != null)
            sb.append("UnprocessedConfigurationPolicyAssociations: ").append(getUnprocessedConfigurationPolicyAssociations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetConfigurationPolicyAssociationsResult == false)
            return false;
        BatchGetConfigurationPolicyAssociationsResult other = (BatchGetConfigurationPolicyAssociationsResult) obj;
        if (other.getConfigurationPolicyAssociations() == null ^ this.getConfigurationPolicyAssociations() == null)
            return false;
        if (other.getConfigurationPolicyAssociations() != null
                && other.getConfigurationPolicyAssociations().equals(this.getConfigurationPolicyAssociations()) == false)
            return false;
        if (other.getUnprocessedConfigurationPolicyAssociations() == null ^ this.getUnprocessedConfigurationPolicyAssociations() == null)
            return false;
        if (other.getUnprocessedConfigurationPolicyAssociations() != null
                && other.getUnprocessedConfigurationPolicyAssociations().equals(this.getUnprocessedConfigurationPolicyAssociations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationPolicyAssociations() == null) ? 0 : getConfigurationPolicyAssociations().hashCode());
        hashCode = prime * hashCode
                + ((getUnprocessedConfigurationPolicyAssociations() == null) ? 0 : getUnprocessedConfigurationPolicyAssociations().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetConfigurationPolicyAssociationsResult clone() {
        try {
            return (BatchGetConfigurationPolicyAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
