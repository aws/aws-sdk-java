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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DescribeOrganizationalUnit"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeOrganizationalUnitRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier (ID) of the organizational unit that you want details about. You can get the ID from the
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
     * The unique identifier (ID) of the organizational unit that you want details about. You can get the ID from the
     * <a>ListOrganizationalUnitsForParent</a> operation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an organizational unit ID string requires
     * "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that contains the OU) followed by
     * a second "-" dash and from 8 to 32 additional lower-case letters or digits.
     * </p>
     * 
     * @param organizationalUnitId
     *        The unique identifier (ID) of the organizational unit that you want details about. You can get the ID from
     *        the <a>ListOrganizationalUnitsForParent</a> operation.</p>
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
     * The unique identifier (ID) of the organizational unit that you want details about. You can get the ID from the
     * <a>ListOrganizationalUnitsForParent</a> operation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an organizational unit ID string requires
     * "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that contains the OU) followed by
     * a second "-" dash and from 8 to 32 additional lower-case letters or digits.
     * </p>
     * 
     * @return The unique identifier (ID) of the organizational unit that you want details about. You can get the ID
     *         from the <a>ListOrganizationalUnitsForParent</a> operation.</p>
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
     * The unique identifier (ID) of the organizational unit that you want details about. You can get the ID from the
     * <a>ListOrganizationalUnitsForParent</a> operation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an organizational unit ID string requires
     * "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that contains the OU) followed by
     * a second "-" dash and from 8 to 32 additional lower-case letters or digits.
     * </p>
     * 
     * @param organizationalUnitId
     *        The unique identifier (ID) of the organizational unit that you want details about. You can get the ID from
     *        the <a>ListOrganizationalUnitsForParent</a> operation.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an organizational unit ID string
     *        requires "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that contains the
     *        OU) followed by a second "-" dash and from 8 to 32 additional lower-case letters or digits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationalUnitRequest withOrganizationalUnitId(String organizationalUnitId) {
        setOrganizationalUnitId(organizationalUnitId);
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
            sb.append("OrganizationalUnitId: ").append(getOrganizationalUnitId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeOrganizationalUnitRequest == false)
            return false;
        DescribeOrganizationalUnitRequest other = (DescribeOrganizationalUnitRequest) obj;
        if (other.getOrganizationalUnitId() == null ^ this.getOrganizationalUnitId() == null)
            return false;
        if (other.getOrganizationalUnitId() != null && other.getOrganizationalUnitId().equals(this.getOrganizationalUnitId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationalUnitId() == null) ? 0 : getOrganizationalUnitId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeOrganizationalUnitRequest clone() {
        return (DescribeOrganizationalUnitRequest) super.clone();
    }

}
