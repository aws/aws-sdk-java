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
package com.amazonaws.services.resourcegroups.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/UpdateGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the resource group for which you want to update its description.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The description of the resource group. Descriptions can have a maximum of 511 characters, including letters,
     * numbers, hyphens, underscores, punctuation, and spaces.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The name of the resource group for which you want to update its description.
     * </p>
     * 
     * @param groupName
     *        The name of the resource group for which you want to update its description.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the resource group for which you want to update its description.
     * </p>
     * 
     * @return The name of the resource group for which you want to update its description.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the resource group for which you want to update its description.
     * </p>
     * 
     * @param groupName
     *        The name of the resource group for which you want to update its description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGroupRequest withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The description of the resource group. Descriptions can have a maximum of 511 characters, including letters,
     * numbers, hyphens, underscores, punctuation, and spaces.
     * </p>
     * 
     * @param description
     *        The description of the resource group. Descriptions can have a maximum of 511 characters, including
     *        letters, numbers, hyphens, underscores, punctuation, and spaces.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the resource group. Descriptions can have a maximum of 511 characters, including letters,
     * numbers, hyphens, underscores, punctuation, and spaces.
     * </p>
     * 
     * @return The description of the resource group. Descriptions can have a maximum of 511 characters, including
     *         letters, numbers, hyphens, underscores, punctuation, and spaces.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the resource group. Descriptions can have a maximum of 511 characters, including letters,
     * numbers, hyphens, underscores, punctuation, and spaces.
     * </p>
     * 
     * @param description
     *        The description of the resource group. Descriptions can have a maximum of 511 characters, including
     *        letters, numbers, hyphens, underscores, punctuation, and spaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGroupRequest withDescription(String description) {
        setDescription(description);
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
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGroupRequest == false)
            return false;
        UpdateGroupRequest other = (UpdateGroupRequest) obj;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGroupRequest clone() {
        return (UpdateGroupRequest) super.clone();
    }

}
