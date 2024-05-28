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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateConfiguredTableAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConfiguredTableAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the configured table association to update. Currently accepts the configured table
     * association ID.
     * </p>
     */
    private String configuredTableAssociationIdentifier;
    /**
     * <p>
     * The unique ID for the membership that the configured table association belongs to.
     * </p>
     */
    private String membershipIdentifier;
    /**
     * <p>
     * A new description for the configured table association.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The service will assume this role to access catalog metadata and query the table.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The unique identifier for the configured table association to update. Currently accepts the configured table
     * association ID.
     * </p>
     * 
     * @param configuredTableAssociationIdentifier
     *        The unique identifier for the configured table association to update. Currently accepts the configured
     *        table association ID.
     */

    public void setConfiguredTableAssociationIdentifier(String configuredTableAssociationIdentifier) {
        this.configuredTableAssociationIdentifier = configuredTableAssociationIdentifier;
    }

    /**
     * <p>
     * The unique identifier for the configured table association to update. Currently accepts the configured table
     * association ID.
     * </p>
     * 
     * @return The unique identifier for the configured table association to update. Currently accepts the configured
     *         table association ID.
     */

    public String getConfiguredTableAssociationIdentifier() {
        return this.configuredTableAssociationIdentifier;
    }

    /**
     * <p>
     * The unique identifier for the configured table association to update. Currently accepts the configured table
     * association ID.
     * </p>
     * 
     * @param configuredTableAssociationIdentifier
     *        The unique identifier for the configured table association to update. Currently accepts the configured
     *        table association ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfiguredTableAssociationRequest withConfiguredTableAssociationIdentifier(String configuredTableAssociationIdentifier) {
        setConfiguredTableAssociationIdentifier(configuredTableAssociationIdentifier);
        return this;
    }

    /**
     * <p>
     * The unique ID for the membership that the configured table association belongs to.
     * </p>
     * 
     * @param membershipIdentifier
     *        The unique ID for the membership that the configured table association belongs to.
     */

    public void setMembershipIdentifier(String membershipIdentifier) {
        this.membershipIdentifier = membershipIdentifier;
    }

    /**
     * <p>
     * The unique ID for the membership that the configured table association belongs to.
     * </p>
     * 
     * @return The unique ID for the membership that the configured table association belongs to.
     */

    public String getMembershipIdentifier() {
        return this.membershipIdentifier;
    }

    /**
     * <p>
     * The unique ID for the membership that the configured table association belongs to.
     * </p>
     * 
     * @param membershipIdentifier
     *        The unique ID for the membership that the configured table association belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfiguredTableAssociationRequest withMembershipIdentifier(String membershipIdentifier) {
        setMembershipIdentifier(membershipIdentifier);
        return this;
    }

    /**
     * <p>
     * A new description for the configured table association.
     * </p>
     * 
     * @param description
     *        A new description for the configured table association.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A new description for the configured table association.
     * </p>
     * 
     * @return A new description for the configured table association.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A new description for the configured table association.
     * </p>
     * 
     * @param description
     *        A new description for the configured table association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfiguredTableAssociationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The service will assume this role to access catalog metadata and query the table.
     * </p>
     * 
     * @param roleArn
     *        The service will assume this role to access catalog metadata and query the table.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The service will assume this role to access catalog metadata and query the table.
     * </p>
     * 
     * @return The service will assume this role to access catalog metadata and query the table.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The service will assume this role to access catalog metadata and query the table.
     * </p>
     * 
     * @param roleArn
     *        The service will assume this role to access catalog metadata and query the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfiguredTableAssociationRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
            sb.append("MembershipIdentifier: ").append(getMembershipIdentifier()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConfiguredTableAssociationRequest == false)
            return false;
        UpdateConfiguredTableAssociationRequest other = (UpdateConfiguredTableAssociationRequest) obj;
        if (other.getConfiguredTableAssociationIdentifier() == null ^ this.getConfiguredTableAssociationIdentifier() == null)
            return false;
        if (other.getConfiguredTableAssociationIdentifier() != null
                && other.getConfiguredTableAssociationIdentifier().equals(this.getConfiguredTableAssociationIdentifier()) == false)
            return false;
        if (other.getMembershipIdentifier() == null ^ this.getMembershipIdentifier() == null)
            return false;
        if (other.getMembershipIdentifier() != null && other.getMembershipIdentifier().equals(this.getMembershipIdentifier()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfiguredTableAssociationIdentifier() == null) ? 0 : getConfiguredTableAssociationIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMembershipIdentifier() == null) ? 0 : getMembershipIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateConfiguredTableAssociationRequest clone() {
        return (UpdateConfiguredTableAssociationRequest) super.clone();
    }

}
