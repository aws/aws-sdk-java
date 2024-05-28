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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/CreateConfiguredAudienceModelAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConfiguredAudienceModelAssociationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Information about the configured audience model association.
     * </p>
     */
    private ConfiguredAudienceModelAssociation configuredAudienceModelAssociation;

    /**
     * <p>
     * Information about the configured audience model association.
     * </p>
     * 
     * @param configuredAudienceModelAssociation
     *        Information about the configured audience model association.
     */

    public void setConfiguredAudienceModelAssociation(ConfiguredAudienceModelAssociation configuredAudienceModelAssociation) {
        this.configuredAudienceModelAssociation = configuredAudienceModelAssociation;
    }

    /**
     * <p>
     * Information about the configured audience model association.
     * </p>
     * 
     * @return Information about the configured audience model association.
     */

    public ConfiguredAudienceModelAssociation getConfiguredAudienceModelAssociation() {
        return this.configuredAudienceModelAssociation;
    }

    /**
     * <p>
     * Information about the configured audience model association.
     * </p>
     * 
     * @param configuredAudienceModelAssociation
     *        Information about the configured audience model association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfiguredAudienceModelAssociationResult withConfiguredAudienceModelAssociation(
            ConfiguredAudienceModelAssociation configuredAudienceModelAssociation) {
        setConfiguredAudienceModelAssociation(configuredAudienceModelAssociation);
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
        if (getConfiguredAudienceModelAssociation() != null)
            sb.append("ConfiguredAudienceModelAssociation: ").append(getConfiguredAudienceModelAssociation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateConfiguredAudienceModelAssociationResult == false)
            return false;
        CreateConfiguredAudienceModelAssociationResult other = (CreateConfiguredAudienceModelAssociationResult) obj;
        if (other.getConfiguredAudienceModelAssociation() == null ^ this.getConfiguredAudienceModelAssociation() == null)
            return false;
        if (other.getConfiguredAudienceModelAssociation() != null
                && other.getConfiguredAudienceModelAssociation().equals(this.getConfiguredAudienceModelAssociation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfiguredAudienceModelAssociation() == null) ? 0 : getConfiguredAudienceModelAssociation().hashCode());
        return hashCode;
    }

    @Override
    public CreateConfiguredAudienceModelAssociationResult clone() {
        try {
            return (CreateConfiguredAudienceModelAssociationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
