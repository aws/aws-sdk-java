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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationFsxLustre" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLocationFsxLustreRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the FSx for Lustre file system.
     * </p>
     */
    private String fsxFilesystemArn;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the security groups that are used to configure the FSx for Lustre file
     * system.
     * </p>
     */
    private java.util.List<String> securityGroupArns;
    /**
     * <p>
     * A subdirectory in the location's path. This subdirectory in the FSx for Lustre file system is used to read data
     * from the FSx for Lustre source location or write data to the FSx for Lustre destination.
     * </p>
     */
    private String subdirectory;
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
     * The Amazon Resource Name (ARN) for the FSx for Lustre file system.
     * </p>
     * 
     * @param fsxFilesystemArn
     *        The Amazon Resource Name (ARN) for the FSx for Lustre file system.
     */

    public void setFsxFilesystemArn(String fsxFilesystemArn) {
        this.fsxFilesystemArn = fsxFilesystemArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the FSx for Lustre file system.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the FSx for Lustre file system.
     */

    public String getFsxFilesystemArn() {
        return this.fsxFilesystemArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the FSx for Lustre file system.
     * </p>
     * 
     * @param fsxFilesystemArn
     *        The Amazon Resource Name (ARN) for the FSx for Lustre file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationFsxLustreRequest withFsxFilesystemArn(String fsxFilesystemArn) {
        setFsxFilesystemArn(fsxFilesystemArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the security groups that are used to configure the FSx for Lustre file
     * system.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of the security groups that are used to configure the FSx for Lustre
     *         file system.
     */

    public java.util.List<String> getSecurityGroupArns() {
        return securityGroupArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the security groups that are used to configure the FSx for Lustre file
     * system.
     * </p>
     * 
     * @param securityGroupArns
     *        The Amazon Resource Names (ARNs) of the security groups that are used to configure the FSx for Lustre file
     *        system.
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
     * The Amazon Resource Names (ARNs) of the security groups that are used to configure the FSx for Lustre file
     * system.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupArns(java.util.Collection)} or {@link #withSecurityGroupArns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param securityGroupArns
     *        The Amazon Resource Names (ARNs) of the security groups that are used to configure the FSx for Lustre file
     *        system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationFsxLustreRequest withSecurityGroupArns(String... securityGroupArns) {
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
     * The Amazon Resource Names (ARNs) of the security groups that are used to configure the FSx for Lustre file
     * system.
     * </p>
     * 
     * @param securityGroupArns
     *        The Amazon Resource Names (ARNs) of the security groups that are used to configure the FSx for Lustre file
     *        system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationFsxLustreRequest withSecurityGroupArns(java.util.Collection<String> securityGroupArns) {
        setSecurityGroupArns(securityGroupArns);
        return this;
    }

    /**
     * <p>
     * A subdirectory in the location's path. This subdirectory in the FSx for Lustre file system is used to read data
     * from the FSx for Lustre source location or write data to the FSx for Lustre destination.
     * </p>
     * 
     * @param subdirectory
     *        A subdirectory in the location's path. This subdirectory in the FSx for Lustre file system is used to read
     *        data from the FSx for Lustre source location or write data to the FSx for Lustre destination.
     */

    public void setSubdirectory(String subdirectory) {
        this.subdirectory = subdirectory;
    }

    /**
     * <p>
     * A subdirectory in the location's path. This subdirectory in the FSx for Lustre file system is used to read data
     * from the FSx for Lustre source location or write data to the FSx for Lustre destination.
     * </p>
     * 
     * @return A subdirectory in the location's path. This subdirectory in the FSx for Lustre file system is used to
     *         read data from the FSx for Lustre source location or write data to the FSx for Lustre destination.
     */

    public String getSubdirectory() {
        return this.subdirectory;
    }

    /**
     * <p>
     * A subdirectory in the location's path. This subdirectory in the FSx for Lustre file system is used to read data
     * from the FSx for Lustre source location or write data to the FSx for Lustre destination.
     * </p>
     * 
     * @param subdirectory
     *        A subdirectory in the location's path. This subdirectory in the FSx for Lustre file system is used to read
     *        data from the FSx for Lustre source location or write data to the FSx for Lustre destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationFsxLustreRequest withSubdirectory(String subdirectory) {
        setSubdirectory(subdirectory);
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

    public CreateLocationFsxLustreRequest withTags(TagListEntry... tags) {
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

    public CreateLocationFsxLustreRequest withTags(java.util.Collection<TagListEntry> tags) {
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
        if (getFsxFilesystemArn() != null)
            sb.append("FsxFilesystemArn: ").append(getFsxFilesystemArn()).append(",");
        if (getSecurityGroupArns() != null)
            sb.append("SecurityGroupArns: ").append(getSecurityGroupArns()).append(",");
        if (getSubdirectory() != null)
            sb.append("Subdirectory: ").append(getSubdirectory()).append(",");
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

        if (obj instanceof CreateLocationFsxLustreRequest == false)
            return false;
        CreateLocationFsxLustreRequest other = (CreateLocationFsxLustreRequest) obj;
        if (other.getFsxFilesystemArn() == null ^ this.getFsxFilesystemArn() == null)
            return false;
        if (other.getFsxFilesystemArn() != null && other.getFsxFilesystemArn().equals(this.getFsxFilesystemArn()) == false)
            return false;
        if (other.getSecurityGroupArns() == null ^ this.getSecurityGroupArns() == null)
            return false;
        if (other.getSecurityGroupArns() != null && other.getSecurityGroupArns().equals(this.getSecurityGroupArns()) == false)
            return false;
        if (other.getSubdirectory() == null ^ this.getSubdirectory() == null)
            return false;
        if (other.getSubdirectory() != null && other.getSubdirectory().equals(this.getSubdirectory()) == false)
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

        hashCode = prime * hashCode + ((getFsxFilesystemArn() == null) ? 0 : getFsxFilesystemArn().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupArns() == null) ? 0 : getSecurityGroupArns().hashCode());
        hashCode = prime * hashCode + ((getSubdirectory() == null) ? 0 : getSubdirectory().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateLocationFsxLustreRequest clone() {
        return (CreateLocationFsxLustreRequest) super.clone();
    }

}
