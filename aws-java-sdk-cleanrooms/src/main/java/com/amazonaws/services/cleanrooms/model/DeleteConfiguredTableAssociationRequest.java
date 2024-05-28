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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeleteConfiguredTableAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteConfiguredTableAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID for the configured table association to be deleted. Currently accepts the configured table ID.
     * </p>
     */
    private String configuredTableAssociationIdentifier;
    /**
     * <p>
     * A unique identifier for the membership that the configured table association belongs to. Currently accepts the
     * membership ID.
     * </p>
     */
    private String membershipIdentifier;

    /**
     * <p>
     * The unique ID for the configured table association to be deleted. Currently accepts the configured table ID.
     * </p>
     * 
     * @param configuredTableAssociationIdentifier
     *        The unique ID for the configured table association to be deleted. Currently accepts the configured table
     *        ID.
     */

    public void setConfiguredTableAssociationIdentifier(String configuredTableAssociationIdentifier) {
        this.configuredTableAssociationIdentifier = configuredTableAssociationIdentifier;
    }

    /**
     * <p>
     * The unique ID for the configured table association to be deleted. Currently accepts the configured table ID.
     * </p>
     * 
     * @return The unique ID for the configured table association to be deleted. Currently accepts the configured table
     *         ID.
     */

    public String getConfiguredTableAssociationIdentifier() {
        return this.configuredTableAssociationIdentifier;
    }

    /**
     * <p>
     * The unique ID for the configured table association to be deleted. Currently accepts the configured table ID.
     * </p>
     * 
     * @param configuredTableAssociationIdentifier
     *        The unique ID for the configured table association to be deleted. Currently accepts the configured table
     *        ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConfiguredTableAssociationRequest withConfiguredTableAssociationIdentifier(String configuredTableAssociationIdentifier) {
        setConfiguredTableAssociationIdentifier(configuredTableAssociationIdentifier);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the membership that the configured table association belongs to. Currently accepts the
     * membership ID.
     * </p>
     * 
     * @param membershipIdentifier
     *        A unique identifier for the membership that the configured table association belongs to. Currently accepts
     *        the membership ID.
     */

    public void setMembershipIdentifier(String membershipIdentifier) {
        this.membershipIdentifier = membershipIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the membership that the configured table association belongs to. Currently accepts the
     * membership ID.
     * </p>
     * 
     * @return A unique identifier for the membership that the configured table association belongs to. Currently
     *         accepts the membership ID.
     */

    public String getMembershipIdentifier() {
        return this.membershipIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the membership that the configured table association belongs to. Currently accepts the
     * membership ID.
     * </p>
     * 
     * @param membershipIdentifier
     *        A unique identifier for the membership that the configured table association belongs to. Currently accepts
     *        the membership ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConfiguredTableAssociationRequest withMembershipIdentifier(String membershipIdentifier) {
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
        if (getConfiguredTableAssociationIdentifier() != null)
            sb.append("ConfiguredTableAssociationIdentifier: ").append(getConfiguredTableAssociationIdentifier()).append(",");
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

        if (obj instanceof DeleteConfiguredTableAssociationRequest == false)
            return false;
        DeleteConfiguredTableAssociationRequest other = (DeleteConfiguredTableAssociationRequest) obj;
        if (other.getConfiguredTableAssociationIdentifier() == null ^ this.getConfiguredTableAssociationIdentifier() == null)
            return false;
        if (other.getConfiguredTableAssociationIdentifier() != null
                && other.getConfiguredTableAssociationIdentifier().equals(this.getConfiguredTableAssociationIdentifier()) == false)
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

        hashCode = prime * hashCode + ((getConfiguredTableAssociationIdentifier() == null) ? 0 : getConfiguredTableAssociationIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMembershipIdentifier() == null) ? 0 : getMembershipIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public DeleteConfiguredTableAssociationRequest clone() {
        return (DeleteConfiguredTableAssociationRequest) super.clone();
    }

}
