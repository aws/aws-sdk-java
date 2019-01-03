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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/CreateOrganizationalUnit"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateOrganizationalUnitRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier (ID) of the parent root or OU in which you want to create the new OU.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a parent ID string requires one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits
     * (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional lower-case
     * letters or digits.
     * </p>
     * </li>
     * </ul>
     */
    private String parentId;
    /**
     * <p>
     * The friendly name to assign to the new OU.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The unique identifier (ID) of the parent root or OU in which you want to create the new OU.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a parent ID string requires one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits
     * (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional lower-case
     * letters or digits.
     * </p>
     * </li>
     * </ul>
     * 
     * @param parentId
     *        The unique identifier (ID) of the parent root or OU in which you want to create the new OU.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a parent ID string requires one of the
     *        following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or
     *        digits (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional
     *        lower-case letters or digits.
     *        </p>
     *        </li>
     */

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the parent root or OU in which you want to create the new OU.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a parent ID string requires one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits
     * (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional lower-case
     * letters or digits.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The unique identifier (ID) of the parent root or OU in which you want to create the new OU.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a parent ID string requires one of
     *         the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or
     *         digits (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional
     *         lower-case letters or digits.
     *         </p>
     *         </li>
     */

    public String getParentId() {
        return this.parentId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the parent root or OU in which you want to create the new OU.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a parent ID string requires one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits
     * (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional lower-case
     * letters or digits.
     * </p>
     * </li>
     * </ul>
     * 
     * @param parentId
     *        The unique identifier (ID) of the parent root or OU in which you want to create the new OU.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a parent ID string requires one of the
     *        following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or
     *        digits (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional
     *        lower-case letters or digits.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOrganizationalUnitRequest withParentId(String parentId) {
        setParentId(parentId);
        return this;
    }

    /**
     * <p>
     * The friendly name to assign to the new OU.
     * </p>
     * 
     * @param name
     *        The friendly name to assign to the new OU.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The friendly name to assign to the new OU.
     * </p>
     * 
     * @return The friendly name to assign to the new OU.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The friendly name to assign to the new OU.
     * </p>
     * 
     * @param name
     *        The friendly name to assign to the new OU.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOrganizationalUnitRequest withName(String name) {
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
        if (getParentId() != null)
            sb.append("ParentId: ").append(getParentId()).append(",");
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

        if (obj instanceof CreateOrganizationalUnitRequest == false)
            return false;
        CreateOrganizationalUnitRequest other = (CreateOrganizationalUnitRequest) obj;
        if (other.getParentId() == null ^ this.getParentId() == null)
            return false;
        if (other.getParentId() != null && other.getParentId().equals(this.getParentId()) == false)
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

        hashCode = prime * hashCode + ((getParentId() == null) ? 0 : getParentId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public CreateOrganizationalUnitRequest clone() {
        return (CreateOrganizationalUnitRequest) super.clone();
    }

}
