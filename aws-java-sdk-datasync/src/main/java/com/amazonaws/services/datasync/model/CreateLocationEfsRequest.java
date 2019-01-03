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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * CreateLocationEfsRequest
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationEfs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLocationEfsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A subdirectory in the location’s path. This subdirectory in the EFS file system is used to read data from the EFS
     * source location or write data to the EFS destination. By default, AWS DataSync uses the root directory.
     * </p>
     */
    private String subdirectory;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Amazon EFS file system.
     * </p>
     */
    private String efsFilesystemArn;
    /**
     * <p>
     * The subnet and security group that the Amazon EFS file system uses.
     * </p>
     */
    private Ec2Config ec2Config;
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
     * A subdirectory in the location’s path. This subdirectory in the EFS file system is used to read data from the EFS
     * source location or write data to the EFS destination. By default, AWS DataSync uses the root directory.
     * </p>
     * 
     * @param subdirectory
     *        A subdirectory in the location’s path. This subdirectory in the EFS file system is used to read data from
     *        the EFS source location or write data to the EFS destination. By default, AWS DataSync uses the root
     *        directory.
     */

    public void setSubdirectory(String subdirectory) {
        this.subdirectory = subdirectory;
    }

    /**
     * <p>
     * A subdirectory in the location’s path. This subdirectory in the EFS file system is used to read data from the EFS
     * source location or write data to the EFS destination. By default, AWS DataSync uses the root directory.
     * </p>
     * 
     * @return A subdirectory in the location’s path. This subdirectory in the EFS file system is used to read data from
     *         the EFS source location or write data to the EFS destination. By default, AWS DataSync uses the root
     *         directory.
     */

    public String getSubdirectory() {
        return this.subdirectory;
    }

    /**
     * <p>
     * A subdirectory in the location’s path. This subdirectory in the EFS file system is used to read data from the EFS
     * source location or write data to the EFS destination. By default, AWS DataSync uses the root directory.
     * </p>
     * 
     * @param subdirectory
     *        A subdirectory in the location’s path. This subdirectory in the EFS file system is used to read data from
     *        the EFS source location or write data to the EFS destination. By default, AWS DataSync uses the root
     *        directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationEfsRequest withSubdirectory(String subdirectory) {
        setSubdirectory(subdirectory);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Amazon EFS file system.
     * </p>
     * 
     * @param efsFilesystemArn
     *        The Amazon Resource Name (ARN) for the Amazon EFS file system.
     */

    public void setEfsFilesystemArn(String efsFilesystemArn) {
        this.efsFilesystemArn = efsFilesystemArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Amazon EFS file system.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the Amazon EFS file system.
     */

    public String getEfsFilesystemArn() {
        return this.efsFilesystemArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Amazon EFS file system.
     * </p>
     * 
     * @param efsFilesystemArn
     *        The Amazon Resource Name (ARN) for the Amazon EFS file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationEfsRequest withEfsFilesystemArn(String efsFilesystemArn) {
        setEfsFilesystemArn(efsFilesystemArn);
        return this;
    }

    /**
     * <p>
     * The subnet and security group that the Amazon EFS file system uses.
     * </p>
     * 
     * @param ec2Config
     *        The subnet and security group that the Amazon EFS file system uses.
     */

    public void setEc2Config(Ec2Config ec2Config) {
        this.ec2Config = ec2Config;
    }

    /**
     * <p>
     * The subnet and security group that the Amazon EFS file system uses.
     * </p>
     * 
     * @return The subnet and security group that the Amazon EFS file system uses.
     */

    public Ec2Config getEc2Config() {
        return this.ec2Config;
    }

    /**
     * <p>
     * The subnet and security group that the Amazon EFS file system uses.
     * </p>
     * 
     * @param ec2Config
     *        The subnet and security group that the Amazon EFS file system uses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationEfsRequest withEc2Config(Ec2Config ec2Config) {
        setEc2Config(ec2Config);
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

    public CreateLocationEfsRequest withTags(TagListEntry... tags) {
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

    public CreateLocationEfsRequest withTags(java.util.Collection<TagListEntry> tags) {
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
        if (getSubdirectory() != null)
            sb.append("Subdirectory: ").append(getSubdirectory()).append(",");
        if (getEfsFilesystemArn() != null)
            sb.append("EfsFilesystemArn: ").append(getEfsFilesystemArn()).append(",");
        if (getEc2Config() != null)
            sb.append("Ec2Config: ").append(getEc2Config()).append(",");
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

        if (obj instanceof CreateLocationEfsRequest == false)
            return false;
        CreateLocationEfsRequest other = (CreateLocationEfsRequest) obj;
        if (other.getSubdirectory() == null ^ this.getSubdirectory() == null)
            return false;
        if (other.getSubdirectory() != null && other.getSubdirectory().equals(this.getSubdirectory()) == false)
            return false;
        if (other.getEfsFilesystemArn() == null ^ this.getEfsFilesystemArn() == null)
            return false;
        if (other.getEfsFilesystemArn() != null && other.getEfsFilesystemArn().equals(this.getEfsFilesystemArn()) == false)
            return false;
        if (other.getEc2Config() == null ^ this.getEc2Config() == null)
            return false;
        if (other.getEc2Config() != null && other.getEc2Config().equals(this.getEc2Config()) == false)
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

        hashCode = prime * hashCode + ((getSubdirectory() == null) ? 0 : getSubdirectory().hashCode());
        hashCode = prime * hashCode + ((getEfsFilesystemArn() == null) ? 0 : getEfsFilesystemArn().hashCode());
        hashCode = prime * hashCode + ((getEc2Config() == null) ? 0 : getEc2Config().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateLocationEfsRequest clone() {
        return (CreateLocationEfsRequest) super.clone();
    }

}
