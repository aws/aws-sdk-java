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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeleteConfiguredAudienceModelAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteConfiguredAudienceModelAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier of the configured audience model association that you want to delete.
     * </p>
     */
    private String configuredAudienceModelAssociationIdentifier;
    /**
     * <p>
     * A unique identifier of the membership that contains the audience model association that you want to delete.
     * </p>
     */
    private String membershipIdentifier;

    /**
     * <p>
     * A unique identifier of the configured audience model association that you want to delete.
     * </p>
     * 
     * @param configuredAudienceModelAssociationIdentifier
     *        A unique identifier of the configured audience model association that you want to delete.
     */

    public void setConfiguredAudienceModelAssociationIdentifier(String configuredAudienceModelAssociationIdentifier) {
        this.configuredAudienceModelAssociationIdentifier = configuredAudienceModelAssociationIdentifier;
    }

    /**
     * <p>
     * A unique identifier of the configured audience model association that you want to delete.
     * </p>
     * 
     * @return A unique identifier of the configured audience model association that you want to delete.
     */

    public String getConfiguredAudienceModelAssociationIdentifier() {
        return this.configuredAudienceModelAssociationIdentifier;
    }

    /**
     * <p>
     * A unique identifier of the configured audience model association that you want to delete.
     * </p>
     * 
     * @param configuredAudienceModelAssociationIdentifier
     *        A unique identifier of the configured audience model association that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConfiguredAudienceModelAssociationRequest withConfiguredAudienceModelAssociationIdentifier(String configuredAudienceModelAssociationIdentifier) {
        setConfiguredAudienceModelAssociationIdentifier(configuredAudienceModelAssociationIdentifier);
        return this;
    }

    /**
     * <p>
     * A unique identifier of the membership that contains the audience model association that you want to delete.
     * </p>
     * 
     * @param membershipIdentifier
     *        A unique identifier of the membership that contains the audience model association that you want to
     *        delete.
     */

    public void setMembershipIdentifier(String membershipIdentifier) {
        this.membershipIdentifier = membershipIdentifier;
    }

    /**
     * <p>
     * A unique identifier of the membership that contains the audience model association that you want to delete.
     * </p>
     * 
     * @return A unique identifier of the membership that contains the audience model association that you want to
     *         delete.
     */

    public String getMembershipIdentifier() {
        return this.membershipIdentifier;
    }

    /**
     * <p>
     * A unique identifier of the membership that contains the audience model association that you want to delete.
     * </p>
     * 
     * @param membershipIdentifier
     *        A unique identifier of the membership that contains the audience model association that you want to
     *        delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConfiguredAudienceModelAssociationRequest withMembershipIdentifier(String membershipIdentifier) {
        setMembershipIdentifier(membershipIdentifier);
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
            sb.append("MembershipIdentifier: ").append(getMembershipIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteConfiguredAudienceModelAssociationRequest == false)
            return false;
        DeleteConfiguredAudienceModelAssociationRequest other = (DeleteConfiguredAudienceModelAssociationRequest) obj;
        if (other.getConfiguredAudienceModelAssociationIdentifier() == null ^ this.getConfiguredAudienceModelAssociationIdentifier() == null)
            return false;
        if (other.getConfiguredAudienceModelAssociationIdentifier() != null
                && other.getConfiguredAudienceModelAssociationIdentifier().equals(this.getConfiguredAudienceModelAssociationIdentifier()) == false)
            return false;
        if (other.getMembershipIdentifier() == null ^ this.getMembershipIdentifier() == null)
            return false;
        if (other.getMembershipIdentifier() != null && other.getMembershipIdentifier().equals(this.getMembershipIdentifier()) == false)
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
        return hashCode;
    }

    @Override
    public DeleteConfiguredAudienceModelAssociationRequest clone() {
        return (DeleteConfiguredAudienceModelAssociationRequest) super.clone();
    }

}
