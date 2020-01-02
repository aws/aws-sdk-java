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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateBuild" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBuildRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A descriptive label that is associated with a build. Build names do not need to be unique. You can use
     * <a>UpdateBuild</a> to change this value later.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Version information that is associated with a build or script. Version strings do not need to be unique. You can
     * use <a>UpdateBuild</a> to change this value later.
     * </p>
     */
    private String version;
    /**
     * <p>
     * Information indicating where your game build files are stored. Use this parameter only when creating a build with
     * files stored in an Amazon S3 bucket that you own. The storage location must specify an Amazon S3 bucket name and
     * key. The location must also specify a role ARN that you set up to allow Amazon GameLift to access your Amazon S3
     * bucket. The S3 bucket and your new build must be in the same Region.
     * </p>
     */
    private S3Location storageLocation;
    /**
     * <p>
     * The operating system that the game server binaries are built to run on. This value determines the type of fleet
     * resources that you can use for this build. If your game build contains multiple executables, they all must run on
     * the same operating system. If an operating system is not specified when creating a build, Amazon GameLift uses
     * the default value (WINDOWS_2012). This value cannot be changed later.
     * </p>
     */
    private String operatingSystem;
    /**
     * <p>
     * A list of labels to assign to the new build resource. Tags are developer-defined key-value pairs. Tagging AWS
     * resources are useful for resource management, access management and cost allocation. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS Resources</a> in the <i>AWS
     * General Reference</i>. Once the resource is created, you can use <a>TagResource</a>, <a>UntagResource</a>, and
     * <a>ListTagsForResource</a> to add, remove, and view tags. The maximum tag limit may be lower than stated. See the
     * AWS General Reference for actual tagging limits.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A descriptive label that is associated with a build. Build names do not need to be unique. You can use
     * <a>UpdateBuild</a> to change this value later.
     * </p>
     * 
     * @param name
     *        A descriptive label that is associated with a build. Build names do not need to be unique. You can use
     *        <a>UpdateBuild</a> to change this value later.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A descriptive label that is associated with a build. Build names do not need to be unique. You can use
     * <a>UpdateBuild</a> to change this value later.
     * </p>
     * 
     * @return A descriptive label that is associated with a build. Build names do not need to be unique. You can use
     *         <a>UpdateBuild</a> to change this value later.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A descriptive label that is associated with a build. Build names do not need to be unique. You can use
     * <a>UpdateBuild</a> to change this value later.
     * </p>
     * 
     * @param name
     *        A descriptive label that is associated with a build. Build names do not need to be unique. You can use
     *        <a>UpdateBuild</a> to change this value later.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBuildRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Version information that is associated with a build or script. Version strings do not need to be unique. You can
     * use <a>UpdateBuild</a> to change this value later.
     * </p>
     * 
     * @param version
     *        Version information that is associated with a build or script. Version strings do not need to be unique.
     *        You can use <a>UpdateBuild</a> to change this value later.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * Version information that is associated with a build or script. Version strings do not need to be unique. You can
     * use <a>UpdateBuild</a> to change this value later.
     * </p>
     * 
     * @return Version information that is associated with a build or script. Version strings do not need to be unique.
     *         You can use <a>UpdateBuild</a> to change this value later.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * Version information that is associated with a build or script. Version strings do not need to be unique. You can
     * use <a>UpdateBuild</a> to change this value later.
     * </p>
     * 
     * @param version
     *        Version information that is associated with a build or script. Version strings do not need to be unique.
     *        You can use <a>UpdateBuild</a> to change this value later.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBuildRequest withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * Information indicating where your game build files are stored. Use this parameter only when creating a build with
     * files stored in an Amazon S3 bucket that you own. The storage location must specify an Amazon S3 bucket name and
     * key. The location must also specify a role ARN that you set up to allow Amazon GameLift to access your Amazon S3
     * bucket. The S3 bucket and your new build must be in the same Region.
     * </p>
     * 
     * @param storageLocation
     *        Information indicating where your game build files are stored. Use this parameter only when creating a
     *        build with files stored in an Amazon S3 bucket that you own. The storage location must specify an Amazon
     *        S3 bucket name and key. The location must also specify a role ARN that you set up to allow Amazon GameLift
     *        to access your Amazon S3 bucket. The S3 bucket and your new build must be in the same Region.
     */

    public void setStorageLocation(S3Location storageLocation) {
        this.storageLocation = storageLocation;
    }

    /**
     * <p>
     * Information indicating where your game build files are stored. Use this parameter only when creating a build with
     * files stored in an Amazon S3 bucket that you own. The storage location must specify an Amazon S3 bucket name and
     * key. The location must also specify a role ARN that you set up to allow Amazon GameLift to access your Amazon S3
     * bucket. The S3 bucket and your new build must be in the same Region.
     * </p>
     * 
     * @return Information indicating where your game build files are stored. Use this parameter only when creating a
     *         build with files stored in an Amazon S3 bucket that you own. The storage location must specify an Amazon
     *         S3 bucket name and key. The location must also specify a role ARN that you set up to allow Amazon
     *         GameLift to access your Amazon S3 bucket. The S3 bucket and your new build must be in the same Region.
     */

    public S3Location getStorageLocation() {
        return this.storageLocation;
    }

    /**
     * <p>
     * Information indicating where your game build files are stored. Use this parameter only when creating a build with
     * files stored in an Amazon S3 bucket that you own. The storage location must specify an Amazon S3 bucket name and
     * key. The location must also specify a role ARN that you set up to allow Amazon GameLift to access your Amazon S3
     * bucket. The S3 bucket and your new build must be in the same Region.
     * </p>
     * 
     * @param storageLocation
     *        Information indicating where your game build files are stored. Use this parameter only when creating a
     *        build with files stored in an Amazon S3 bucket that you own. The storage location must specify an Amazon
     *        S3 bucket name and key. The location must also specify a role ARN that you set up to allow Amazon GameLift
     *        to access your Amazon S3 bucket. The S3 bucket and your new build must be in the same Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBuildRequest withStorageLocation(S3Location storageLocation) {
        setStorageLocation(storageLocation);
        return this;
    }

    /**
     * <p>
     * The operating system that the game server binaries are built to run on. This value determines the type of fleet
     * resources that you can use for this build. If your game build contains multiple executables, they all must run on
     * the same operating system. If an operating system is not specified when creating a build, Amazon GameLift uses
     * the default value (WINDOWS_2012). This value cannot be changed later.
     * </p>
     * 
     * @param operatingSystem
     *        The operating system that the game server binaries are built to run on. This value determines the type of
     *        fleet resources that you can use for this build. If your game build contains multiple executables, they
     *        all must run on the same operating system. If an operating system is not specified when creating a build,
     *        Amazon GameLift uses the default value (WINDOWS_2012). This value cannot be changed later.
     * @see OperatingSystem
     */

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * <p>
     * The operating system that the game server binaries are built to run on. This value determines the type of fleet
     * resources that you can use for this build. If your game build contains multiple executables, they all must run on
     * the same operating system. If an operating system is not specified when creating a build, Amazon GameLift uses
     * the default value (WINDOWS_2012). This value cannot be changed later.
     * </p>
     * 
     * @return The operating system that the game server binaries are built to run on. This value determines the type of
     *         fleet resources that you can use for this build. If your game build contains multiple executables, they
     *         all must run on the same operating system. If an operating system is not specified when creating a build,
     *         Amazon GameLift uses the default value (WINDOWS_2012). This value cannot be changed later.
     * @see OperatingSystem
     */

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * <p>
     * The operating system that the game server binaries are built to run on. This value determines the type of fleet
     * resources that you can use for this build. If your game build contains multiple executables, they all must run on
     * the same operating system. If an operating system is not specified when creating a build, Amazon GameLift uses
     * the default value (WINDOWS_2012). This value cannot be changed later.
     * </p>
     * 
     * @param operatingSystem
     *        The operating system that the game server binaries are built to run on. This value determines the type of
     *        fleet resources that you can use for this build. If your game build contains multiple executables, they
     *        all must run on the same operating system. If an operating system is not specified when creating a build,
     *        Amazon GameLift uses the default value (WINDOWS_2012). This value cannot be changed later.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystem
     */

    public CreateBuildRequest withOperatingSystem(String operatingSystem) {
        setOperatingSystem(operatingSystem);
        return this;
    }

    /**
     * <p>
     * The operating system that the game server binaries are built to run on. This value determines the type of fleet
     * resources that you can use for this build. If your game build contains multiple executables, they all must run on
     * the same operating system. If an operating system is not specified when creating a build, Amazon GameLift uses
     * the default value (WINDOWS_2012). This value cannot be changed later.
     * </p>
     * 
     * @param operatingSystem
     *        The operating system that the game server binaries are built to run on. This value determines the type of
     *        fleet resources that you can use for this build. If your game build contains multiple executables, they
     *        all must run on the same operating system. If an operating system is not specified when creating a build,
     *        Amazon GameLift uses the default value (WINDOWS_2012). This value cannot be changed later.
     * @see OperatingSystem
     */

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        withOperatingSystem(operatingSystem);
    }

    /**
     * <p>
     * The operating system that the game server binaries are built to run on. This value determines the type of fleet
     * resources that you can use for this build. If your game build contains multiple executables, they all must run on
     * the same operating system. If an operating system is not specified when creating a build, Amazon GameLift uses
     * the default value (WINDOWS_2012). This value cannot be changed later.
     * </p>
     * 
     * @param operatingSystem
     *        The operating system that the game server binaries are built to run on. This value determines the type of
     *        fleet resources that you can use for this build. If your game build contains multiple executables, they
     *        all must run on the same operating system. If an operating system is not specified when creating a build,
     *        Amazon GameLift uses the default value (WINDOWS_2012). This value cannot be changed later.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystem
     */

    public CreateBuildRequest withOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem.toString();
        return this;
    }

    /**
     * <p>
     * A list of labels to assign to the new build resource. Tags are developer-defined key-value pairs. Tagging AWS
     * resources are useful for resource management, access management and cost allocation. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS Resources</a> in the <i>AWS
     * General Reference</i>. Once the resource is created, you can use <a>TagResource</a>, <a>UntagResource</a>, and
     * <a>ListTagsForResource</a> to add, remove, and view tags. The maximum tag limit may be lower than stated. See the
     * AWS General Reference for actual tagging limits.
     * </p>
     * 
     * @return A list of labels to assign to the new build resource. Tags are developer-defined key-value pairs. Tagging
     *         AWS resources are useful for resource management, access management and cost allocation. For more
     *         information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS
     *         Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use
     *         <a>TagResource</a>, <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags.
     *         The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of labels to assign to the new build resource. Tags are developer-defined key-value pairs. Tagging AWS
     * resources are useful for resource management, access management and cost allocation. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS Resources</a> in the <i>AWS
     * General Reference</i>. Once the resource is created, you can use <a>TagResource</a>, <a>UntagResource</a>, and
     * <a>ListTagsForResource</a> to add, remove, and view tags. The maximum tag limit may be lower than stated. See the
     * AWS General Reference for actual tagging limits.
     * </p>
     * 
     * @param tags
     *        A list of labels to assign to the new build resource. Tags are developer-defined key-value pairs. Tagging
     *        AWS resources are useful for resource management, access management and cost allocation. For more
     *        information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS
     *        Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use
     *        <a>TagResource</a>, <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags.
     *        The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of labels to assign to the new build resource. Tags are developer-defined key-value pairs. Tagging AWS
     * resources are useful for resource management, access management and cost allocation. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS Resources</a> in the <i>AWS
     * General Reference</i>. Once the resource is created, you can use <a>TagResource</a>, <a>UntagResource</a>, and
     * <a>ListTagsForResource</a> to add, remove, and view tags. The maximum tag limit may be lower than stated. See the
     * AWS General Reference for actual tagging limits.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of labels to assign to the new build resource. Tags are developer-defined key-value pairs. Tagging
     *        AWS resources are useful for resource management, access management and cost allocation. For more
     *        information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS
     *        Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use
     *        <a>TagResource</a>, <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags.
     *        The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBuildRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of labels to assign to the new build resource. Tags are developer-defined key-value pairs. Tagging AWS
     * resources are useful for resource management, access management and cost allocation. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS Resources</a> in the <i>AWS
     * General Reference</i>. Once the resource is created, you can use <a>TagResource</a>, <a>UntagResource</a>, and
     * <a>ListTagsForResource</a> to add, remove, and view tags. The maximum tag limit may be lower than stated. See the
     * AWS General Reference for actual tagging limits.
     * </p>
     * 
     * @param tags
     *        A list of labels to assign to the new build resource. Tags are developer-defined key-value pairs. Tagging
     *        AWS resources are useful for resource management, access management and cost allocation. For more
     *        information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS
     *        Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use
     *        <a>TagResource</a>, <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags.
     *        The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBuildRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getStorageLocation() != null)
            sb.append("StorageLocation: ").append(getStorageLocation()).append(",");
        if (getOperatingSystem() != null)
            sb.append("OperatingSystem: ").append(getOperatingSystem()).append(",");
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

        if (obj instanceof CreateBuildRequest == false)
            return false;
        CreateBuildRequest other = (CreateBuildRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getStorageLocation() == null ^ this.getStorageLocation() == null)
            return false;
        if (other.getStorageLocation() != null && other.getStorageLocation().equals(this.getStorageLocation()) == false)
            return false;
        if (other.getOperatingSystem() == null ^ this.getOperatingSystem() == null)
            return false;
        if (other.getOperatingSystem() != null && other.getOperatingSystem().equals(this.getOperatingSystem()) == false)
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
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getStorageLocation() == null) ? 0 : getStorageLocation().hashCode());
        hashCode = prime * hashCode + ((getOperatingSystem() == null) ? 0 : getOperatingSystem().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateBuildRequest clone() {
        return (CreateBuildRequest) super.clone();
    }

}
