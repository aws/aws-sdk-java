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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the inputs for the <a>CreateDirectory</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/CreateDirectory" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDirectoryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The fully qualified name for the directory, such as <code>corp.example.com</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The short name of the directory, such as <code>CORP</code>.
     * </p>
     */
    private String shortName;
    /**
     * <p>
     * The password for the directory administrator. The directory creation process creates a directory administrator
     * account with the user name <code>Administrator</code> and this password.
     * </p>
     */
    private String password;
    /**
     * <p>
     * A textual description for the directory.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The size of the directory.
     * </p>
     */
    private String size;
    /**
     * <p>
     * A <a>DirectoryVpcSettings</a> object that contains additional information for the operation.
     * </p>
     */
    private DirectoryVpcSettings vpcSettings;
    /**
     * <p>
     * The tags to be assigned to the Simple AD directory.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The fully qualified name for the directory, such as <code>corp.example.com</code>.
     * </p>
     * 
     * @param name
     *        The fully qualified name for the directory, such as <code>corp.example.com</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The fully qualified name for the directory, such as <code>corp.example.com</code>.
     * </p>
     * 
     * @return The fully qualified name for the directory, such as <code>corp.example.com</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The fully qualified name for the directory, such as <code>corp.example.com</code>.
     * </p>
     * 
     * @param name
     *        The fully qualified name for the directory, such as <code>corp.example.com</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDirectoryRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The short name of the directory, such as <code>CORP</code>.
     * </p>
     * 
     * @param shortName
     *        The short name of the directory, such as <code>CORP</code>.
     */

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    /**
     * <p>
     * The short name of the directory, such as <code>CORP</code>.
     * </p>
     * 
     * @return The short name of the directory, such as <code>CORP</code>.
     */

    public String getShortName() {
        return this.shortName;
    }

    /**
     * <p>
     * The short name of the directory, such as <code>CORP</code>.
     * </p>
     * 
     * @param shortName
     *        The short name of the directory, such as <code>CORP</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDirectoryRequest withShortName(String shortName) {
        setShortName(shortName);
        return this;
    }

    /**
     * <p>
     * The password for the directory administrator. The directory creation process creates a directory administrator
     * account with the user name <code>Administrator</code> and this password.
     * </p>
     * 
     * @param password
     *        The password for the directory administrator. The directory creation process creates a directory
     *        administrator account with the user name <code>Administrator</code> and this password.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password for the directory administrator. The directory creation process creates a directory administrator
     * account with the user name <code>Administrator</code> and this password.
     * </p>
     * 
     * @return The password for the directory administrator. The directory creation process creates a directory
     *         administrator account with the user name <code>Administrator</code> and this password.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The password for the directory administrator. The directory creation process creates a directory administrator
     * account with the user name <code>Administrator</code> and this password.
     * </p>
     * 
     * @param password
     *        The password for the directory administrator. The directory creation process creates a directory
     *        administrator account with the user name <code>Administrator</code> and this password.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDirectoryRequest withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * A textual description for the directory.
     * </p>
     * 
     * @param description
     *        A textual description for the directory.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A textual description for the directory.
     * </p>
     * 
     * @return A textual description for the directory.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A textual description for the directory.
     * </p>
     * 
     * @param description
     *        A textual description for the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDirectoryRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The size of the directory.
     * </p>
     * 
     * @param size
     *        The size of the directory.
     * @see DirectorySize
     */

    public void setSize(String size) {
        this.size = size;
    }

    /**
     * <p>
     * The size of the directory.
     * </p>
     * 
     * @return The size of the directory.
     * @see DirectorySize
     */

    public String getSize() {
        return this.size;
    }

    /**
     * <p>
     * The size of the directory.
     * </p>
     * 
     * @param size
     *        The size of the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectorySize
     */

    public CreateDirectoryRequest withSize(String size) {
        setSize(size);
        return this;
    }

    /**
     * <p>
     * The size of the directory.
     * </p>
     * 
     * @param size
     *        The size of the directory.
     * @see DirectorySize
     */

    public void setSize(DirectorySize size) {
        withSize(size);
    }

    /**
     * <p>
     * The size of the directory.
     * </p>
     * 
     * @param size
     *        The size of the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectorySize
     */

    public CreateDirectoryRequest withSize(DirectorySize size) {
        this.size = size.toString();
        return this;
    }

    /**
     * <p>
     * A <a>DirectoryVpcSettings</a> object that contains additional information for the operation.
     * </p>
     * 
     * @param vpcSettings
     *        A <a>DirectoryVpcSettings</a> object that contains additional information for the operation.
     */

    public void setVpcSettings(DirectoryVpcSettings vpcSettings) {
        this.vpcSettings = vpcSettings;
    }

    /**
     * <p>
     * A <a>DirectoryVpcSettings</a> object that contains additional information for the operation.
     * </p>
     * 
     * @return A <a>DirectoryVpcSettings</a> object that contains additional information for the operation.
     */

    public DirectoryVpcSettings getVpcSettings() {
        return this.vpcSettings;
    }

    /**
     * <p>
     * A <a>DirectoryVpcSettings</a> object that contains additional information for the operation.
     * </p>
     * 
     * @param vpcSettings
     *        A <a>DirectoryVpcSettings</a> object that contains additional information for the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDirectoryRequest withVpcSettings(DirectoryVpcSettings vpcSettings) {
        setVpcSettings(vpcSettings);
        return this;
    }

    /**
     * <p>
     * The tags to be assigned to the Simple AD directory.
     * </p>
     * 
     * @return The tags to be assigned to the Simple AD directory.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags to be assigned to the Simple AD directory.
     * </p>
     * 
     * @param tags
     *        The tags to be assigned to the Simple AD directory.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tags to be assigned to the Simple AD directory.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to be assigned to the Simple AD directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDirectoryRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to be assigned to the Simple AD directory.
     * </p>
     * 
     * @param tags
     *        The tags to be assigned to the Simple AD directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDirectoryRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getShortName() != null)
            sb.append("ShortName: ").append(getShortName()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append("***Sensitive Data Redacted***").append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSize() != null)
            sb.append("Size: ").append(getSize()).append(",");
        if (getVpcSettings() != null)
            sb.append("VpcSettings: ").append(getVpcSettings()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDirectoryRequest == false)
            return false;
        CreateDirectoryRequest other = (CreateDirectoryRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getShortName() == null ^ this.getShortName() == null)
            return false;
        if (other.getShortName() != null && other.getShortName().equals(this.getShortName()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        if (other.getVpcSettings() == null ^ this.getVpcSettings() == null)
            return false;
        if (other.getVpcSettings() != null && other.getVpcSettings().equals(this.getVpcSettings()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getShortName() == null) ? 0 : getShortName().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode + ((getVpcSettings() == null) ? 0 : getVpcSettings().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDirectoryRequest clone() {
        return (CreateDirectoryRequest) super.clone();
    }

}
