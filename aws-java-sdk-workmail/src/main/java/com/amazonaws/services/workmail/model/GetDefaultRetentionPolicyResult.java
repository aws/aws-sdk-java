/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/GetDefaultRetentionPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDefaultRetentionPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The retention policy ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The retention policy name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The retention policy description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The retention policy folder configurations.
     * </p>
     */
    private java.util.List<FolderConfiguration> folderConfigurations;

    /**
     * <p>
     * The retention policy ID.
     * </p>
     * 
     * @param id
     *        The retention policy ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The retention policy ID.
     * </p>
     * 
     * @return The retention policy ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The retention policy ID.
     * </p>
     * 
     * @param id
     *        The retention policy ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDefaultRetentionPolicyResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The retention policy name.
     * </p>
     * 
     * @param name
     *        The retention policy name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The retention policy name.
     * </p>
     * 
     * @return The retention policy name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The retention policy name.
     * </p>
     * 
     * @param name
     *        The retention policy name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDefaultRetentionPolicyResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The retention policy description.
     * </p>
     * 
     * @param description
     *        The retention policy description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The retention policy description.
     * </p>
     * 
     * @return The retention policy description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The retention policy description.
     * </p>
     * 
     * @param description
     *        The retention policy description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDefaultRetentionPolicyResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The retention policy folder configurations.
     * </p>
     * 
     * @return The retention policy folder configurations.
     */

    public java.util.List<FolderConfiguration> getFolderConfigurations() {
        return folderConfigurations;
    }

    /**
     * <p>
     * The retention policy folder configurations.
     * </p>
     * 
     * @param folderConfigurations
     *        The retention policy folder configurations.
     */

    public void setFolderConfigurations(java.util.Collection<FolderConfiguration> folderConfigurations) {
        if (folderConfigurations == null) {
            this.folderConfigurations = null;
            return;
        }

        this.folderConfigurations = new java.util.ArrayList<FolderConfiguration>(folderConfigurations);
    }

    /**
     * <p>
     * The retention policy folder configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFolderConfigurations(java.util.Collection)} or {@link #withFolderConfigurations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param folderConfigurations
     *        The retention policy folder configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDefaultRetentionPolicyResult withFolderConfigurations(FolderConfiguration... folderConfigurations) {
        if (this.folderConfigurations == null) {
            setFolderConfigurations(new java.util.ArrayList<FolderConfiguration>(folderConfigurations.length));
        }
        for (FolderConfiguration ele : folderConfigurations) {
            this.folderConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The retention policy folder configurations.
     * </p>
     * 
     * @param folderConfigurations
     *        The retention policy folder configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDefaultRetentionPolicyResult withFolderConfigurations(java.util.Collection<FolderConfiguration> folderConfigurations) {
        setFolderConfigurations(folderConfigurations);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getFolderConfigurations() != null)
            sb.append("FolderConfigurations: ").append(getFolderConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDefaultRetentionPolicyResult == false)
            return false;
        GetDefaultRetentionPolicyResult other = (GetDefaultRetentionPolicyResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFolderConfigurations() == null ^ this.getFolderConfigurations() == null)
            return false;
        if (other.getFolderConfigurations() != null && other.getFolderConfigurations().equals(this.getFolderConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFolderConfigurations() == null) ? 0 : getFolderConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public GetDefaultRetentionPolicyResult clone() {
        try {
            return (GetDefaultRetentionPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
