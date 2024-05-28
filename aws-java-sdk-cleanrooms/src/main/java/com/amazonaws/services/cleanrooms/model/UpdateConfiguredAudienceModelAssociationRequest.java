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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateConfiguredAudienceModelAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConfiguredAudienceModelAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the configured audience model association that you want to update.
     * </p>
     */
    private String configuredAudienceModelAssociationIdentifier;
    /**
     * <p>
     * A unique identifier of the membership that contains the configured audience model association that you want to
     * update.
     * </p>
     */
    private String membershipIdentifier;
    /**
     * <p>
     * A new description for the configured audience model association.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A new name for the configured audience model association.
     * </p>
     */
    private String name;

    /**
     * <p>
     * A unique identifier for the configured audience model association that you want to update.
     * </p>
     * 
     * @param configuredAudienceModelAssociationIdentifier
     *        A unique identifier for the configured audience model association that you want to update.
     */

    public void setConfiguredAudienceModelAssociationIdentifier(String configuredAudienceModelAssociationIdentifier) {
        this.configuredAudienceModelAssociationIdentifier = configuredAudienceModelAssociationIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the configured audience model association that you want to update.
     * </p>
     * 
     * @return A unique identifier for the configured audience model association that you want to update.
     */

    public String getConfiguredAudienceModelAssociationIdentifier() {
        return this.configuredAudienceModelAssociationIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the configured audience model association that you want to update.
     * </p>
     * 
     * @param configuredAudienceModelAssociationIdentifier
     *        A unique identifier for the configured audience model association that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfiguredAudienceModelAssociationRequest withConfiguredAudienceModelAssociationIdentifier(String configuredAudienceModelAssociationIdentifier) {
        setConfiguredAudienceModelAssociationIdentifier(configuredAudienceModelAssociationIdentifier);
        return this;
    }

    /**
     * <p>
     * A unique identifier of the membership that contains the configured audience model association that you want to
     * update.
     * </p>
     * 
     * @param membershipIdentifier
     *        A unique identifier of the membership that contains the configured audience model association that you
     *        want to update.
     */

    public void setMembershipIdentifier(String membershipIdentifier) {
        this.membershipIdentifier = membershipIdentifier;
    }

    /**
     * <p>
     * A unique identifier of the membership that contains the configured audience model association that you want to
     * update.
     * </p>
     * 
     * @return A unique identifier of the membership that contains the configured audience model association that you
     *         want to update.
     */

    public String getMembershipIdentifier() {
        return this.membershipIdentifier;
    }

    /**
     * <p>
     * A unique identifier of the membership that contains the configured audience model association that you want to
     * update.
     * </p>
     * 
     * @param membershipIdentifier
     *        A unique identifier of the membership that contains the configured audience model association that you
     *        want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfiguredAudienceModelAssociationRequest withMembershipIdentifier(String membershipIdentifier) {
        setMembershipIdentifier(membershipIdentifier);
        return this;
    }

    /**
     * <p>
     * A new description for the configured audience model association.
     * </p>
     * 
     * @param description
     *        A new description for the configured audience model association.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A new description for the configured audience model association.
     * </p>
     * 
     * @return A new description for the configured audience model association.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A new description for the configured audience model association.
     * </p>
     * 
     * @param description
     *        A new description for the configured audience model association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfiguredAudienceModelAssociationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A new name for the configured audience model association.
     * </p>
     * 
     * @param name
     *        A new name for the configured audience model association.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A new name for the configured audience model association.
     * </p>
     * 
     * @return A new name for the configured audience model association.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A new name for the configured audience model association.
     * </p>
     * 
     * @param name
     *        A new name for the configured audience model association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfiguredAudienceModelAssociationRequest withName(String name) {
        setName(name);
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
        if (getConfiguredAudienceModelAssociationIdentifier() != null)
            sb.append("ConfiguredAudienceModelAssociationIdentifier: ").append(getConfiguredAudienceModelAssociationIdentifier()).append(",");
        if (getMembershipIdentifier() != null)
            sb.append("MembershipIdentifier: ").append(getMembershipIdentifier()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConfiguredAudienceModelAssociationRequest == false)
            return false;
        UpdateConfiguredAudienceModelAssociationRequest other = (UpdateConfiguredAudienceModelAssociationRequest) obj;
        if (other.getConfiguredAudienceModelAssociationIdentifier() == null ^ this.getConfiguredAudienceModelAssociationIdentifier() == null)
            return false;
        if (other.getConfiguredAudienceModelAssociationIdentifier() != null
                && other.getConfiguredAudienceModelAssociationIdentifier().equals(this.getConfiguredAudienceModelAssociationIdentifier()) == false)
            return false;
        if (other.getMembershipIdentifier() == null ^ this.getMembershipIdentifier() == null)
            return false;
        if (other.getMembershipIdentifier() != null && other.getMembershipIdentifier().equals(this.getMembershipIdentifier()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConfiguredAudienceModelAssociationIdentifier() == null) ? 0 : getConfiguredAudienceModelAssociationIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMembershipIdentifier() == null) ? 0 : getMembershipIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateConfiguredAudienceModelAssociationRequest clone() {
        return (UpdateConfiguredAudienceModelAssociationRequest) super.clone();
    }

}
