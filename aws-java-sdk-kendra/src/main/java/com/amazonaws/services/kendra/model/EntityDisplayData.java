/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the user entity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/EntityDisplayData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityDisplayData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the user.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The name of the group.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The user name of the user.
     * </p>
     */
    private String identifiedUserName;
    /**
     * <p>
     * The first name of the user.
     * </p>
     */
    private String firstName;
    /**
     * <p>
     * The last name of the user.
     * </p>
     */
    private String lastName;

    /**
     * <p>
     * The name of the user.
     * </p>
     * 
     * @param userName
     *        The name of the user.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the user.
     * </p>
     * 
     * @return The name of the user.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The name of the user.
     * </p>
     * 
     * @param userName
     *        The name of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityDisplayData withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @param groupName
     *        The name of the group.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @return The name of the group.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @param groupName
     *        The name of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityDisplayData withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The user name of the user.
     * </p>
     * 
     * @param identifiedUserName
     *        The user name of the user.
     */

    public void setIdentifiedUserName(String identifiedUserName) {
        this.identifiedUserName = identifiedUserName;
    }

    /**
     * <p>
     * The user name of the user.
     * </p>
     * 
     * @return The user name of the user.
     */

    public String getIdentifiedUserName() {
        return this.identifiedUserName;
    }

    /**
     * <p>
     * The user name of the user.
     * </p>
     * 
     * @param identifiedUserName
     *        The user name of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityDisplayData withIdentifiedUserName(String identifiedUserName) {
        setIdentifiedUserName(identifiedUserName);
        return this;
    }

    /**
     * <p>
     * The first name of the user.
     * </p>
     * 
     * @param firstName
     *        The first name of the user.
     */

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * <p>
     * The first name of the user.
     * </p>
     * 
     * @return The first name of the user.
     */

    public String getFirstName() {
        return this.firstName;
    }

    /**
     * <p>
     * The first name of the user.
     * </p>
     * 
     * @param firstName
     *        The first name of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityDisplayData withFirstName(String firstName) {
        setFirstName(firstName);
        return this;
    }

    /**
     * <p>
     * The last name of the user.
     * </p>
     * 
     * @param lastName
     *        The last name of the user.
     */

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * <p>
     * The last name of the user.
     * </p>
     * 
     * @return The last name of the user.
     */

    public String getLastName() {
        return this.lastName;
    }

    /**
     * <p>
     * The last name of the user.
     * </p>
     * 
     * @param lastName
     *        The last name of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityDisplayData withLastName(String lastName) {
        setLastName(lastName);
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
        if (getUserName() != null)
            sb.append("UserName: ").append("***Sensitive Data Redacted***").append(",");
        if (getGroupName() != null)
            sb.append("GroupName: ").append("***Sensitive Data Redacted***").append(",");
        if (getIdentifiedUserName() != null)
            sb.append("IdentifiedUserName: ").append("***Sensitive Data Redacted***").append(",");
        if (getFirstName() != null)
            sb.append("FirstName: ").append("***Sensitive Data Redacted***").append(",");
        if (getLastName() != null)
            sb.append("LastName: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityDisplayData == false)
            return false;
        EntityDisplayData other = (EntityDisplayData) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getIdentifiedUserName() == null ^ this.getIdentifiedUserName() == null)
            return false;
        if (other.getIdentifiedUserName() != null && other.getIdentifiedUserName().equals(this.getIdentifiedUserName()) == false)
            return false;
        if (other.getFirstName() == null ^ this.getFirstName() == null)
            return false;
        if (other.getFirstName() != null && other.getFirstName().equals(this.getFirstName()) == false)
            return false;
        if (other.getLastName() == null ^ this.getLastName() == null)
            return false;
        if (other.getLastName() != null && other.getLastName().equals(this.getLastName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getIdentifiedUserName() == null) ? 0 : getIdentifiedUserName().hashCode());
        hashCode = prime * hashCode + ((getFirstName() == null) ? 0 : getFirstName().hashCode());
        hashCode = prime * hashCode + ((getLastName() == null) ? 0 : getLastName().hashCode());
        return hashCode;
    }

    @Override
    public EntityDisplayData clone() {
        try {
            return (EntityDisplayData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.EntityDisplayDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
