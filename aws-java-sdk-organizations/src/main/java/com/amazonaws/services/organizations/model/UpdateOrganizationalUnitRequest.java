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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/UpdateOrganizationalUnit"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateOrganizationalUnitRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier (ID) of the OU that you want to rename. You can get the ID from the
     * <a>ListOrganizationalUnitsForParent</a> operation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an organizational unit ID string requires
     * "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that contains the OU) followed by
     * a second "-" dash and from 8 to 32 additional lower-case letters or digits.
     * </p>
     */
    private String organizationalUnitId;
    /**
     * <p>
     * The new name that you want to assign to the OU.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is a
     * string of any of the characters in the ASCII character range.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The unique identifier (ID) of the OU that you want to rename. You can get the ID from the
     * <a>ListOrganizationalUnitsForParent</a> operation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an organizational unit ID string requires
     * "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that contains the OU) followed by
     * a second "-" dash and from 8 to 32 additional lower-case letters or digits.
     * </p>
     * 
     * @param organizationalUnitId
     *        The unique identifier (ID) of the OU that you want to rename. You can get the ID from the
     *        <a>ListOrganizationalUnitsForParent</a> operation.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an organizational unit ID string
     *        requires "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that contains the
     *        OU) followed by a second "-" dash and from 8 to 32 additional lower-case letters or digits.
     */

    public void setOrganizationalUnitId(String organizationalUnitId) {
        this.organizationalUnitId = organizationalUnitId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the OU that you want to rename. You can get the ID from the
     * <a>ListOrganizationalUnitsForParent</a> operation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an organizational unit ID string requires
     * "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that contains the OU) followed by
     * a second "-" dash and from 8 to 32 additional lower-case letters or digits.
     * </p>
     * 
     * @return The unique identifier (ID) of the OU that you want to rename. You can get the ID from the
     *         <a>ListOrganizationalUnitsForParent</a> operation.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an organizational unit ID string
     *         requires "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that contains
     *         the OU) followed by a second "-" dash and from 8 to 32 additional lower-case letters or digits.
     */

    public String getOrganizationalUnitId() {
        return this.organizationalUnitId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the OU that you want to rename. You can get the ID from the
     * <a>ListOrganizationalUnitsForParent</a> operation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an organizational unit ID string requires
     * "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that contains the OU) followed by
     * a second "-" dash and from 8 to 32 additional lower-case letters or digits.
     * </p>
     * 
     * @param organizationalUnitId
     *        The unique identifier (ID) of the OU that you want to rename. You can get the ID from the
     *        <a>ListOrganizationalUnitsForParent</a> operation.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an organizational unit ID string
     *        requires "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that contains the
     *        OU) followed by a second "-" dash and from 8 to 32 additional lower-case letters or digits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOrganizationalUnitRequest withOrganizationalUnitId(String organizationalUnitId) {
        setOrganizationalUnitId(organizationalUnitId);
        return this;
    }

    /**
     * <p>
     * The new name that you want to assign to the OU.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is a
     * string of any of the characters in the ASCII character range.
     * </p>
     * 
     * @param name
     *        The new name that you want to assign to the OU.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is
     *        a string of any of the characters in the ASCII character range.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The new name that you want to assign to the OU.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is a
     * string of any of the characters in the ASCII character range.
     * </p>
     * 
     * @return The new name that you want to assign to the OU.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter
     *         is a string of any of the characters in the ASCII character range.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The new name that you want to assign to the OU.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is a
     * string of any of the characters in the ASCII character range.
     * </p>
     * 
     * @param name
     *        The new name that you want to assign to the OU.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is
     *        a string of any of the characters in the ASCII character range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOrganizationalUnitRequest withName(String name) {
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
        if (getOrganizationalUnitId() != null)
            sb.append("OrganizationalUnitId: ").append(getOrganizationalUnitId()).append(",");
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

        if (obj instanceof UpdateOrganizationalUnitRequest == false)
            return false;
        UpdateOrganizationalUnitRequest other = (UpdateOrganizationalUnitRequest) obj;
        if (other.getOrganizationalUnitId() == null ^ this.getOrganizationalUnitId() == null)
            return false;
        if (other.getOrganizationalUnitId() != null && other.getOrganizationalUnitId().equals(this.getOrganizationalUnitId()) == false)
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

        hashCode = prime * hashCode + ((getOrganizationalUnitId() == null) ? 0 : getOrganizationalUnitId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateOrganizationalUnitRequest clone() {
        return (UpdateOrganizationalUnitRequest) super.clone();
    }

}
