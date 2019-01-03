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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/UpdateOrganizationalUnit"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateOrganizationalUnitResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A structure that contains the details about the specified OU, including its new name.
     * </p>
     */
    private OrganizationalUnit organizationalUnit;

    /**
     * <p>
     * A structure that contains the details about the specified OU, including its new name.
     * </p>
     * 
     * @param organizationalUnit
     *        A structure that contains the details about the specified OU, including its new name.
     */

    public void setOrganizationalUnit(OrganizationalUnit organizationalUnit) {
        this.organizationalUnit = organizationalUnit;
    }

    /**
     * <p>
     * A structure that contains the details about the specified OU, including its new name.
     * </p>
     * 
     * @return A structure that contains the details about the specified OU, including its new name.
     */

    public OrganizationalUnit getOrganizationalUnit() {
        return this.organizationalUnit;
    }

    /**
     * <p>
     * A structure that contains the details about the specified OU, including its new name.
     * </p>
     * 
     * @param organizationalUnit
     *        A structure that contains the details about the specified OU, including its new name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOrganizationalUnitResult withOrganizationalUnit(OrganizationalUnit organizationalUnit) {
        setOrganizationalUnit(organizationalUnit);
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
        if (getOrganizationalUnit() != null)
            sb.append("OrganizationalUnit: ").append(getOrganizationalUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateOrganizationalUnitResult == false)
            return false;
        UpdateOrganizationalUnitResult other = (UpdateOrganizationalUnitResult) obj;
        if (other.getOrganizationalUnit() == null ^ this.getOrganizationalUnit() == null)
            return false;
        if (other.getOrganizationalUnit() != null && other.getOrganizationalUnit().equals(this.getOrganizationalUnit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationalUnit() == null) ? 0 : getOrganizationalUnit().hashCode());
        return hashCode;
    }

    @Override
    public UpdateOrganizationalUnitResult clone() {
        try {
            return (UpdateOrganizationalUnitResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
