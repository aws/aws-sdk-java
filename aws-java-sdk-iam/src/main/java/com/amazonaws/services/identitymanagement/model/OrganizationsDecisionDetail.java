/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains information about AWS Organizations's effect on a policy simulation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/OrganizationsDecisionDetail" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationsDecisionDetail implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies whether the simulated operation is allowed by the AWS Organizations service control policies that
     * impact the simulated user's account.
     * </p>
     */
    private Boolean allowedByOrganizations;

    /**
     * <p>
     * Specifies whether the simulated operation is allowed by the AWS Organizations service control policies that
     * impact the simulated user's account.
     * </p>
     * 
     * @param allowedByOrganizations
     *        Specifies whether the simulated operation is allowed by the AWS Organizations service control policies
     *        that impact the simulated user's account.
     */

    public void setAllowedByOrganizations(Boolean allowedByOrganizations) {
        this.allowedByOrganizations = allowedByOrganizations;
    }

    /**
     * <p>
     * Specifies whether the simulated operation is allowed by the AWS Organizations service control policies that
     * impact the simulated user's account.
     * </p>
     * 
     * @return Specifies whether the simulated operation is allowed by the AWS Organizations service control policies
     *         that impact the simulated user's account.
     */

    public Boolean getAllowedByOrganizations() {
        return this.allowedByOrganizations;
    }

    /**
     * <p>
     * Specifies whether the simulated operation is allowed by the AWS Organizations service control policies that
     * impact the simulated user's account.
     * </p>
     * 
     * @param allowedByOrganizations
     *        Specifies whether the simulated operation is allowed by the AWS Organizations service control policies
     *        that impact the simulated user's account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationsDecisionDetail withAllowedByOrganizations(Boolean allowedByOrganizations) {
        setAllowedByOrganizations(allowedByOrganizations);
        return this;
    }

    /**
     * <p>
     * Specifies whether the simulated operation is allowed by the AWS Organizations service control policies that
     * impact the simulated user's account.
     * </p>
     * 
     * @return Specifies whether the simulated operation is allowed by the AWS Organizations service control policies
     *         that impact the simulated user's account.
     */

    public Boolean isAllowedByOrganizations() {
        return this.allowedByOrganizations;
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
        if (getAllowedByOrganizations() != null)
            sb.append("AllowedByOrganizations: ").append(getAllowedByOrganizations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrganizationsDecisionDetail == false)
            return false;
        OrganizationsDecisionDetail other = (OrganizationsDecisionDetail) obj;
        if (other.getAllowedByOrganizations() == null ^ this.getAllowedByOrganizations() == null)
            return false;
        if (other.getAllowedByOrganizations() != null && other.getAllowedByOrganizations().equals(this.getAllowedByOrganizations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowedByOrganizations() == null) ? 0 : getAllowedByOrganizations().hashCode());
        return hashCode;
    }

    @Override
    public OrganizationsDecisionDetail clone() {
        try {
            return (OrganizationsDecisionDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
