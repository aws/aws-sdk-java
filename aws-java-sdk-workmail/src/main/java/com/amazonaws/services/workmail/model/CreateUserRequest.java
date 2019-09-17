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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUserRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the organization for which the user is created.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The name for the new user. Simple AD or AD Connector user names have a maximum length of 20. All others have a
     * maximum length of 64.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The display name for the new user.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The password for the new user.
     * </p>
     */
    private String password;

    /**
     * <p>
     * The identifier of the organization for which the user is created.
     * </p>
     * 
     * @param organizationId
     *        The identifier of the organization for which the user is created.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The identifier of the organization for which the user is created.
     * </p>
     * 
     * @return The identifier of the organization for which the user is created.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The identifier of the organization for which the user is created.
     * </p>
     * 
     * @param organizationId
     *        The identifier of the organization for which the user is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The name for the new user. Simple AD or AD Connector user names have a maximum length of 20. All others have a
     * maximum length of 64.
     * </p>
     * 
     * @param name
     *        The name for the new user. Simple AD or AD Connector user names have a maximum length of 20. All others
     *        have a maximum length of 64.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the new user. Simple AD or AD Connector user names have a maximum length of 20. All others have a
     * maximum length of 64.
     * </p>
     * 
     * @return The name for the new user. Simple AD or AD Connector user names have a maximum length of 20. All others
     *         have a maximum length of 64.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the new user. Simple AD or AD Connector user names have a maximum length of 20. All others have a
     * maximum length of 64.
     * </p>
     * 
     * @param name
     *        The name for the new user. Simple AD or AD Connector user names have a maximum length of 20. All others
     *        have a maximum length of 64.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The display name for the new user.
     * </p>
     * 
     * @param displayName
     *        The display name for the new user.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name for the new user.
     * </p>
     * 
     * @return The display name for the new user.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name for the new user.
     * </p>
     * 
     * @param displayName
     *        The display name for the new user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The password for the new user.
     * </p>
     * 
     * @param password
     *        The password for the new user.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password for the new user.
     * </p>
     * 
     * @return The password for the new user.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The password for the new user.
     * </p>
     * 
     * @param password
     *        The password for the new user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withPassword(String password) {
        setPassword(password);
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
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUserRequest == false)
            return false;
        CreateUserRequest other = (CreateUserRequest) obj;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        return hashCode;
    }

    @Override
    public CreateUserRequest clone() {
        return (CreateUserRequest) super.clone();
    }

}
