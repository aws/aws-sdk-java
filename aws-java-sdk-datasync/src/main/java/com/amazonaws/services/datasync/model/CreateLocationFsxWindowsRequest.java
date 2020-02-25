/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationFsxWindows" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLocationFsxWindowsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A subdirectory in the location’s path. This subdirectory in the Amazon FSx for Windows file system is used to
     * read data from the Amazon FSx for Windows source location or write data to the FSx for Windows destination.
     * </p>
     */
    private String subdirectory;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the FSx for Windows file system.
     * </p>
     */
    private String fsxFilesystemArn;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows file
     * system.
     * </p>
     */
    private java.util.List<String> securityGroupArns;
    /**
     * <p>
     * The key-value pair that represents a tag that you want to add to the resource. The value can be an empty string.
     * This value helps you manage, filter, and search for your resources. We recommend that you create a name tag for
     * your location.
     * </p>
     */
    private java.util.List<TagListEntry> tags;
    /**
     * <p>
     * The user who has the permissions to access files and folders in the FSx for Windows file system.
     * </p>
     */
    private String user;
    /**
     * <p>
     * The name of the Windows domain that the FSx for Windows server belongs to.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The password of the user who has the permissions to access files and folders in the FSx for Windows file system.
     * </p>
     */
    private String password;

    /**
     * <p>
     * A subdirectory in the location’s path. This subdirectory in the Amazon FSx for Windows file system is used to
     * read data from the Amazon FSx for Windows source location or write data to the FSx for Windows destination.
     * </p>
     * 
     * @param subdirectory
     *        A subdirectory in the location’s path. This subdirectory in the Amazon FSx for Windows file system is used
     *        to read data from the Amazon FSx for Windows source location or write data to the FSx for Windows
     *        destination.
     */

    public void setSubdirectory(String subdirectory) {
        this.subdirectory = subdirectory;
    }

    /**
     * <p>
     * A subdirectory in the location’s path. This subdirectory in the Amazon FSx for Windows file system is used to
     * read data from the Amazon FSx for Windows source location or write data to the FSx for Windows destination.
     * </p>
     * 
     * @return A subdirectory in the location’s path. This subdirectory in the Amazon FSx for Windows file system is
     *         used to read data from the Amazon FSx for Windows source location or write data to the FSx for Windows
     *         destination.
     */

    public String getSubdirectory() {
        return this.subdirectory;
    }

    /**
     * <p>
     * A subdirectory in the location’s path. This subdirectory in the Amazon FSx for Windows file system is used to
     * read data from the Amazon FSx for Windows source location or write data to the FSx for Windows destination.
     * </p>
     * 
     * @param subdirectory
     *        A subdirectory in the location’s path. This subdirectory in the Amazon FSx for Windows file system is used
     *        to read data from the Amazon FSx for Windows source location or write data to the FSx for Windows
     *        destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationFsxWindowsRequest withSubdirectory(String subdirectory) {
        setSubdirectory(subdirectory);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the FSx for Windows file system.
     * </p>
     * 
     * @param fsxFilesystemArn
     *        The Amazon Resource Name (ARN) for the FSx for Windows file system.
     */

    public void setFsxFilesystemArn(String fsxFilesystemArn) {
        this.fsxFilesystemArn = fsxFilesystemArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the FSx for Windows file system.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the FSx for Windows file system.
     */

    public String getFsxFilesystemArn() {
        return this.fsxFilesystemArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the FSx for Windows file system.
     * </p>
     * 
     * @param fsxFilesystemArn
     *        The Amazon Resource Name (ARN) for the FSx for Windows file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationFsxWindowsRequest withFsxFilesystemArn(String fsxFilesystemArn) {
        setFsxFilesystemArn(fsxFilesystemArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows file
     * system.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows
     *         file system.
     */

    public java.util.List<String> getSecurityGroupArns() {
        return securityGroupArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows file
     * system.
     * </p>
     * 
     * @param securityGroupArns
     *        The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows
     *        file system.
     */

    public void setSecurityGroupArns(java.util.Collection<String> securityGroupArns) {
        if (securityGroupArns == null) {
            this.securityGroupArns = null;
            return;
        }

        this.securityGroupArns = new java.util.ArrayList<String>(securityGroupArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows file
     * system.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupArns(java.util.Collection)} or {@link #withSecurityGroupArns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param securityGroupArns
     *        The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows
     *        file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationFsxWindowsRequest withSecurityGroupArns(String... securityGroupArns) {
        if (this.securityGroupArns == null) {
            setSecurityGroupArns(new java.util.ArrayList<String>(securityGroupArns.length));
        }
        for (String ele : securityGroupArns) {
            this.securityGroupArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows file
     * system.
     * </p>
     * 
     * @param securityGroupArns
     *        The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows
     *        file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationFsxWindowsRequest withSecurityGroupArns(java.util.Collection<String> securityGroupArns) {
        setSecurityGroupArns(securityGroupArns);
        return this;
    }

    /**
     * <p>
     * The key-value pair that represents a tag that you want to add to the resource. The value can be an empty string.
     * This value helps you manage, filter, and search for your resources. We recommend that you create a name tag for
     * your location.
     * </p>
     * 
     * @return The key-value pair that represents a tag that you want to add to the resource. The value can be an empty
     *         string. This value helps you manage, filter, and search for your resources. We recommend that you create
     *         a name tag for your location.
     */

    public java.util.List<TagListEntry> getTags() {
        return tags;
    }

    /**
     * <p>
     * The key-value pair that represents a tag that you want to add to the resource. The value can be an empty string.
     * This value helps you manage, filter, and search for your resources. We recommend that you create a name tag for
     * your location.
     * </p>
     * 
     * @param tags
     *        The key-value pair that represents a tag that you want to add to the resource. The value can be an empty
     *        string. This value helps you manage, filter, and search for your resources. We recommend that you create a
     *        name tag for your location.
     */

    public void setTags(java.util.Collection<TagListEntry> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<TagListEntry>(tags);
    }

    /**
     * <p>
     * The key-value pair that represents a tag that you want to add to the resource. The value can be an empty string.
     * This value helps you manage, filter, and search for your resources. We recommend that you create a name tag for
     * your location.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The key-value pair that represents a tag that you want to add to the resource. The value can be an empty
     *        string. This value helps you manage, filter, and search for your resources. We recommend that you create a
     *        name tag for your location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationFsxWindowsRequest withTags(TagListEntry... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<TagListEntry>(tags.length));
        }
        for (TagListEntry ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The key-value pair that represents a tag that you want to add to the resource. The value can be an empty string.
     * This value helps you manage, filter, and search for your resources. We recommend that you create a name tag for
     * your location.
     * </p>
     * 
     * @param tags
     *        The key-value pair that represents a tag that you want to add to the resource. The value can be an empty
     *        string. This value helps you manage, filter, and search for your resources. We recommend that you create a
     *        name tag for your location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationFsxWindowsRequest withTags(java.util.Collection<TagListEntry> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The user who has the permissions to access files and folders in the FSx for Windows file system.
     * </p>
     * 
     * @param user
     *        The user who has the permissions to access files and folders in the FSx for Windows file system.
     */

    public void setUser(String user) {
        this.user = user;
    }

    /**
     * <p>
     * The user who has the permissions to access files and folders in the FSx for Windows file system.
     * </p>
     * 
     * @return The user who has the permissions to access files and folders in the FSx for Windows file system.
     */

    public String getUser() {
        return this.user;
    }

    /**
     * <p>
     * The user who has the permissions to access files and folders in the FSx for Windows file system.
     * </p>
     * 
     * @param user
     *        The user who has the permissions to access files and folders in the FSx for Windows file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationFsxWindowsRequest withUser(String user) {
        setUser(user);
        return this;
    }

    /**
     * <p>
     * The name of the Windows domain that the FSx for Windows server belongs to.
     * </p>
     * 
     * @param domain
     *        The name of the Windows domain that the FSx for Windows server belongs to.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the Windows domain that the FSx for Windows server belongs to.
     * </p>
     * 
     * @return The name of the Windows domain that the FSx for Windows server belongs to.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The name of the Windows domain that the FSx for Windows server belongs to.
     * </p>
     * 
     * @param domain
     *        The name of the Windows domain that the FSx for Windows server belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationFsxWindowsRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The password of the user who has the permissions to access files and folders in the FSx for Windows file system.
     * </p>
     * 
     * @param password
     *        The password of the user who has the permissions to access files and folders in the FSx for Windows file
     *        system.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password of the user who has the permissions to access files and folders in the FSx for Windows file system.
     * </p>
     * 
     * @return The password of the user who has the permissions to access files and folders in the FSx for Windows file
     *         system.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The password of the user who has the permissions to access files and folders in the FSx for Windows file system.
     * </p>
     * 
     * @param password
     *        The password of the user who has the permissions to access files and folders in the FSx for Windows file
     *        system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationFsxWindowsRequest withPassword(String password) {
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
        if (getSubdirectory() != null)
            sb.append("Subdirectory: ").append(getSubdirectory()).append(",");
        if (getFsxFilesystemArn() != null)
            sb.append("FsxFilesystemArn: ").append(getFsxFilesystemArn()).append(",");
        if (getSecurityGroupArns() != null)
            sb.append("SecurityGroupArns: ").append(getSecurityGroupArns()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getUser() != null)
            sb.append("User: ").append(getUser()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
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

        if (obj instanceof CreateLocationFsxWindowsRequest == false)
            return false;
        CreateLocationFsxWindowsRequest other = (CreateLocationFsxWindowsRequest) obj;
        if (other.getSubdirectory() == null ^ this.getSubdirectory() == null)
            return false;
        if (other.getSubdirectory() != null && other.getSubdirectory().equals(this.getSubdirectory()) == false)
            return false;
        if (other.getFsxFilesystemArn() == null ^ this.getFsxFilesystemArn() == null)
            return false;
        if (other.getFsxFilesystemArn() != null && other.getFsxFilesystemArn().equals(this.getFsxFilesystemArn()) == false)
            return false;
        if (other.getSecurityGroupArns() == null ^ this.getSecurityGroupArns() == null)
            return false;
        if (other.getSecurityGroupArns() != null && other.getSecurityGroupArns().equals(this.getSecurityGroupArns()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
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

        hashCode = prime * hashCode + ((getSubdirectory() == null) ? 0 : getSubdirectory().hashCode());
        hashCode = prime * hashCode + ((getFsxFilesystemArn() == null) ? 0 : getFsxFilesystemArn().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupArns() == null) ? 0 : getSecurityGroupArns().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        return hashCode;
    }

    @Override
    public CreateLocationFsxWindowsRequest clone() {
        return (CreateLocationFsxWindowsRequest) super.clone();
    }

}
