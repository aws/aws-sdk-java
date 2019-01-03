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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DescribeOrganization" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeOrganizationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A structure that contains information about the organization.
     * </p>
     */
    private Organization organization;

    /**
     * <p>
     * A structure that contains information about the organization.
     * </p>
     * 
     * @param organization
     *        A structure that contains information about the organization.
     */

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    /**
     * <p>
     * A structure that contains information about the organization.
     * </p>
     * 
     * @return A structure that contains information about the organization.
     */

    public Organization getOrganization() {
        return this.organization;
    }

    /**
     * <p>
     * A structure that contains information about the organization.
     * </p>
     * 
     * @param organization
     *        A structure that contains information about the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationResult withOrganization(Organization organization) {
        setOrganization(organization);
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
        if (getOrganization() != null)
            sb.append("Organization: ").append(getOrganization());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeOrganizationResult == false)
            return false;
        DescribeOrganizationResult other = (DescribeOrganizationResult) obj;
        if (other.getOrganization() == null ^ this.getOrganization() == null)
            return false;
        if (other.getOrganization() != null && other.getOrganization().equals(this.getOrganization()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganization() == null) ? 0 : getOrganization().hashCode());
        return hashCode;
    }

    @Override
    public DescribeOrganizationResult clone() {
        try {
            return (DescribeOrganizationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
