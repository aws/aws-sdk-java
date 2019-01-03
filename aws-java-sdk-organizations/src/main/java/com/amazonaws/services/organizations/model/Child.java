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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains a list of child entities, either OUs or accounts.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/Child" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Child implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier (ID) of this child entity.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a child ID string requires one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Account: a string that consists of exactly 12 digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits
     * (the ID of the root that contains the OU) followed by a second "-" dash and from 8 to 32 additional lower-case
     * letters or digits.
     * </p>
     * </li>
     * </ul>
     */
    private String id;
    /**
     * <p>
     * The type of this child entity.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The unique identifier (ID) of this child entity.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a child ID string requires one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Account: a string that consists of exactly 12 digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits
     * (the ID of the root that contains the OU) followed by a second "-" dash and from 8 to 32 additional lower-case
     * letters or digits.
     * </p>
     * </li>
     * </ul>
     * 
     * @param id
     *        The unique identifier (ID) of this child entity.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a child ID string requires one of the
     *        following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Account: a string that consists of exactly 12 digits.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or
     *        digits (the ID of the root that contains the OU) followed by a second "-" dash and from 8 to 32 additional
     *        lower-case letters or digits.
     *        </p>
     *        </li>
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier (ID) of this child entity.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a child ID string requires one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Account: a string that consists of exactly 12 digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits
     * (the ID of the root that contains the OU) followed by a second "-" dash and from 8 to 32 additional lower-case
     * letters or digits.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The unique identifier (ID) of this child entity.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a child ID string requires one of the
     *         following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Account: a string that consists of exactly 12 digits.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or
     *         digits (the ID of the root that contains the OU) followed by a second "-" dash and from 8 to 32
     *         additional lower-case letters or digits.
     *         </p>
     *         </li>
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier (ID) of this child entity.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a child ID string requires one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Account: a string that consists of exactly 12 digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits
     * (the ID of the root that contains the OU) followed by a second "-" dash and from 8 to 32 additional lower-case
     * letters or digits.
     * </p>
     * </li>
     * </ul>
     * 
     * @param id
     *        The unique identifier (ID) of this child entity.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a child ID string requires one of the
     *        following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Account: a string that consists of exactly 12 digits.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or
     *        digits (the ID of the root that contains the OU) followed by a second "-" dash and from 8 to 32 additional
     *        lower-case letters or digits.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Child withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The type of this child entity.
     * </p>
     * 
     * @param type
     *        The type of this child entity.
     * @see ChildType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of this child entity.
     * </p>
     * 
     * @return The type of this child entity.
     * @see ChildType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of this child entity.
     * </p>
     * 
     * @param type
     *        The type of this child entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChildType
     */

    public Child withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of this child entity.
     * </p>
     * 
     * @param type
     *        The type of this child entity.
     * @see ChildType
     */

    public void setType(ChildType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of this child entity.
     * </p>
     * 
     * @param type
     *        The type of this child entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChildType
     */

    public Child withType(ChildType type) {
        this.type = type.toString();
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Child == false)
            return false;
        Child other = (Child) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public Child clone() {
        try {
            return (Child) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.organizations.model.transform.ChildMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
