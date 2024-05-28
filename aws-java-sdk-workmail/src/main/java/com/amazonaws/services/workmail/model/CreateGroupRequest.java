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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The organization under which the group is to be created.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The name of the group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * If this parameter is enabled, the group will be hidden from the address book.
     * </p>
     */
    private Boolean hiddenFromGlobalAddressList;

    /**
     * <p>
     * The organization under which the group is to be created.
     * </p>
     * 
     * @param organizationId
     *        The organization under which the group is to be created.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The organization under which the group is to be created.
     * </p>
     * 
     * @return The organization under which the group is to be created.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The organization under which the group is to be created.
     * </p>
     * 
     * @param organizationId
     *        The organization under which the group is to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @param name
     *        The name of the group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @return The name of the group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @param name
     *        The name of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * If this parameter is enabled, the group will be hidden from the address book.
     * </p>
     * 
     * @param hiddenFromGlobalAddressList
     *        If this parameter is enabled, the group will be hidden from the address book.
     */

    public void setHiddenFromGlobalAddressList(Boolean hiddenFromGlobalAddressList) {
        this.hiddenFromGlobalAddressList = hiddenFromGlobalAddressList;
    }

    /**
     * <p>
     * If this parameter is enabled, the group will be hidden from the address book.
     * </p>
     * 
     * @return If this parameter is enabled, the group will be hidden from the address book.
     */

    public Boolean getHiddenFromGlobalAddressList() {
        return this.hiddenFromGlobalAddressList;
    }

    /**
     * <p>
     * If this parameter is enabled, the group will be hidden from the address book.
     * </p>
     * 
     * @param hiddenFromGlobalAddressList
     *        If this parameter is enabled, the group will be hidden from the address book.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGroupRequest withHiddenFromGlobalAddressList(Boolean hiddenFromGlobalAddressList) {
        setHiddenFromGlobalAddressList(hiddenFromGlobalAddressList);
        return this;
    }

    /**
     * <p>
     * If this parameter is enabled, the group will be hidden from the address book.
     * </p>
     * 
     * @return If this parameter is enabled, the group will be hidden from the address book.
     */

    public Boolean isHiddenFromGlobalAddressList() {
        return this.hiddenFromGlobalAddressList;
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
        if (getHiddenFromGlobalAddressList() != null)
            sb.append("HiddenFromGlobalAddressList: ").append(getHiddenFromGlobalAddressList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGroupRequest == false)
            return false;
        CreateGroupRequest other = (CreateGroupRequest) obj;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getHiddenFromGlobalAddressList() == null ^ this.getHiddenFromGlobalAddressList() == null)
            return false;
        if (other.getHiddenFromGlobalAddressList() != null && other.getHiddenFromGlobalAddressList().equals(this.getHiddenFromGlobalAddressList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getHiddenFromGlobalAddressList() == null) ? 0 : getHiddenFromGlobalAddressList().hashCode());
        return hashCode;
    }

    @Override
    public CreateGroupRequest clone() {
        return (CreateGroupRequest) super.clone();
    }

}
