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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateScript" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateScriptRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A descriptive label that is associated with a script. Script names do not need to be unique. You can use
     * <a>UpdateScript</a> to change this value later.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The version that is associated with a build or script. Version strings do not need to be unique. You can use
     * <a>UpdateScript</a> to change this value later.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The location of the Amazon S3 bucket where a zipped file containing your Realtime scripts is stored. The storage
     * location must specify the Amazon S3 bucket name, the zip file name (the "key"), and a role ARN that allows Amazon
     * GameLift to access the Amazon S3 storage location. The S3 bucket must be in the same Region where you want to
     * create a new script. By default, Amazon GameLift uploads the latest version of the zip file; if you have S3
     * object versioning turned on, you can use the <code>ObjectVersion</code> parameter to specify an earlier version.
     * </p>
     */
    private S3Location storageLocation;
    /**
     * <p>
     * A data object containing your Realtime scripts and dependencies as a zip file. The zip file can have one or
     * multiple files. Maximum size of a zip file is 5 MB.
     * </p>
     * <p>
     * When using the AWS CLI tool to create a script, this parameter is set to the zip file name. It must be prepended
     * with the string "fileb://" to indicate that the file data is a binary object. For example:
     * <code>--zip-file fileb://myRealtimeScript.zip</code>.
     * </p>
     */
    private java.nio.ByteBuffer zipFile;
    /**
     * <p>
     * A list of labels to assign to the new script resource. Tags are developer-defined key-value pairs. Tagging AWS
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
     * A descriptive label that is associated with a script. Script names do not need to be unique. You can use
     * <a>UpdateScript</a> to change this value later.
     * </p>
     * 
     * @param name
     *        A descriptive label that is associated with a script. Script names do not need to be unique. You can use
     *        <a>UpdateScript</a> to change this value later.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A descriptive label that is associated with a script. Script names do not need to be unique. You can use
     * <a>UpdateScript</a> to change this value later.
     * </p>
     * 
     * @return A descriptive label that is associated with a script. Script names do not need to be unique. You can use
     *         <a>UpdateScript</a> to change this value later.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A descriptive label that is associated with a script. Script names do not need to be unique. You can use
     * <a>UpdateScript</a> to change this value later.
     * </p>
     * 
     * @param name
     *        A descriptive label that is associated with a script. Script names do not need to be unique. You can use
     *        <a>UpdateScript</a> to change this value later.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScriptRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The version that is associated with a build or script. Version strings do not need to be unique. You can use
     * <a>UpdateScript</a> to change this value later.
     * </p>
     * 
     * @param version
     *        The version that is associated with a build or script. Version strings do not need to be unique. You can
     *        use <a>UpdateScript</a> to change this value later.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version that is associated with a build or script. Version strings do not need to be unique. You can use
     * <a>UpdateScript</a> to change this value later.
     * </p>
     * 
     * @return The version that is associated with a build or script. Version strings do not need to be unique. You can
     *         use <a>UpdateScript</a> to change this value later.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version that is associated with a build or script. Version strings do not need to be unique. You can use
     * <a>UpdateScript</a> to change this value later.
     * </p>
     * 
     * @param version
     *        The version that is associated with a build or script. Version strings do not need to be unique. You can
     *        use <a>UpdateScript</a> to change this value later.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScriptRequest withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The location of the Amazon S3 bucket where a zipped file containing your Realtime scripts is stored. The storage
     * location must specify the Amazon S3 bucket name, the zip file name (the "key"), and a role ARN that allows Amazon
     * GameLift to access the Amazon S3 storage location. The S3 bucket must be in the same Region where you want to
     * create a new script. By default, Amazon GameLift uploads the latest version of the zip file; if you have S3
     * object versioning turned on, you can use the <code>ObjectVersion</code> parameter to specify an earlier version.
     * </p>
     * 
     * @param storageLocation
     *        The location of the Amazon S3 bucket where a zipped file containing your Realtime scripts is stored. The
     *        storage location must specify the Amazon S3 bucket name, the zip file name (the "key"), and a role ARN
     *        that allows Amazon GameLift to access the Amazon S3 storage location. The S3 bucket must be in the same
     *        Region where you want to create a new script. By default, Amazon GameLift uploads the latest version of
     *        the zip file; if you have S3 object versioning turned on, you can use the <code>ObjectVersion</code>
     *        parameter to specify an earlier version.
     */

    public void setStorageLocation(S3Location storageLocation) {
        this.storageLocation = storageLocation;
    }

    /**
     * <p>
     * The location of the Amazon S3 bucket where a zipped file containing your Realtime scripts is stored. The storage
     * location must specify the Amazon S3 bucket name, the zip file name (the "key"), and a role ARN that allows Amazon
     * GameLift to access the Amazon S3 storage location. The S3 bucket must be in the same Region where you want to
     * create a new script. By default, Amazon GameLift uploads the latest version of the zip file; if you have S3
     * object versioning turned on, you can use the <code>ObjectVersion</code> parameter to specify an earlier version.
     * </p>
     * 
     * @return The location of the Amazon S3 bucket where a zipped file containing your Realtime scripts is stored. The
     *         storage location must specify the Amazon S3 bucket name, the zip file name (the "key"), and a role ARN
     *         that allows Amazon GameLift to access the Amazon S3 storage location. The S3 bucket must be in the same
     *         Region where you want to create a new script. By default, Amazon GameLift uploads the latest version of
     *         the zip file; if you have S3 object versioning turned on, you can use the <code>ObjectVersion</code>
     *         parameter to specify an earlier version.
     */

    public S3Location getStorageLocation() {
        return this.storageLocation;
    }

    /**
     * <p>
     * The location of the Amazon S3 bucket where a zipped file containing your Realtime scripts is stored. The storage
     * location must specify the Amazon S3 bucket name, the zip file name (the "key"), and a role ARN that allows Amazon
     * GameLift to access the Amazon S3 storage location. The S3 bucket must be in the same Region where you want to
     * create a new script. By default, Amazon GameLift uploads the latest version of the zip file; if you have S3
     * object versioning turned on, you can use the <code>ObjectVersion</code> parameter to specify an earlier version.
     * </p>
     * 
     * @param storageLocation
     *        The location of the Amazon S3 bucket where a zipped file containing your Realtime scripts is stored. The
     *        storage location must specify the Amazon S3 bucket name, the zip file name (the "key"), and a role ARN
     *        that allows Amazon GameLift to access the Amazon S3 storage location. The S3 bucket must be in the same
     *        Region where you want to create a new script. By default, Amazon GameLift uploads the latest version of
     *        the zip file; if you have S3 object versioning turned on, you can use the <code>ObjectVersion</code>
     *        parameter to specify an earlier version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScriptRequest withStorageLocation(S3Location storageLocation) {
        setStorageLocation(storageLocation);
        return this;
    }

    /**
     * <p>
     * A data object containing your Realtime scripts and dependencies as a zip file. The zip file can have one or
     * multiple files. Maximum size of a zip file is 5 MB.
     * </p>
     * <p>
     * When using the AWS CLI tool to create a script, this parameter is set to the zip file name. It must be prepended
     * with the string "fileb://" to indicate that the file data is a binary object. For example:
     * <code>--zip-file fileb://myRealtimeScript.zip</code>.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param zipFile
     *        A data object containing your Realtime scripts and dependencies as a zip file. The zip file can have one
     *        or multiple files. Maximum size of a zip file is 5 MB.</p>
     *        <p>
     *        When using the AWS CLI tool to create a script, this parameter is set to the zip file name. It must be
     *        prepended with the string "fileb://" to indicate that the file data is a binary object. For example:
     *        <code>--zip-file fileb://myRealtimeScript.zip</code>.
     */

    public void setZipFile(java.nio.ByteBuffer zipFile) {
        this.zipFile = zipFile;
    }

    /**
     * <p>
     * A data object containing your Realtime scripts and dependencies as a zip file. The zip file can have one or
     * multiple files. Maximum size of a zip file is 5 MB.
     * </p>
     * <p>
     * When using the AWS CLI tool to create a script, this parameter is set to the zip file name. It must be prepended
     * with the string "fileb://" to indicate that the file data is a binary object. For example:
     * <code>--zip-file fileb://myRealtimeScript.zip</code>.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return A data object containing your Realtime scripts and dependencies as a zip file. The zip file can have one
     *         or multiple files. Maximum size of a zip file is 5 MB.</p>
     *         <p>
     *         When using the AWS CLI tool to create a script, this parameter is set to the zip file name. It must be
     *         prepended with the string "fileb://" to indicate that the file data is a binary object. For example:
     *         <code>--zip-file fileb://myRealtimeScript.zip</code>.
     */

    public java.nio.ByteBuffer getZipFile() {
        return this.zipFile;
    }

    /**
     * <p>
     * A data object containing your Realtime scripts and dependencies as a zip file. The zip file can have one or
     * multiple files. Maximum size of a zip file is 5 MB.
     * </p>
     * <p>
     * When using the AWS CLI tool to create a script, this parameter is set to the zip file name. It must be prepended
     * with the string "fileb://" to indicate that the file data is a binary object. For example:
     * <code>--zip-file fileb://myRealtimeScript.zip</code>.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param zipFile
     *        A data object containing your Realtime scripts and dependencies as a zip file. The zip file can have one
     *        or multiple files. Maximum size of a zip file is 5 MB.</p>
     *        <p>
     *        When using the AWS CLI tool to create a script, this parameter is set to the zip file name. It must be
     *        prepended with the string "fileb://" to indicate that the file data is a binary object. For example:
     *        <code>--zip-file fileb://myRealtimeScript.zip</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScriptRequest withZipFile(java.nio.ByteBuffer zipFile) {
        setZipFile(zipFile);
        return this;
    }

    /**
     * <p>
     * A list of labels to assign to the new script resource. Tags are developer-defined key-value pairs. Tagging AWS
     * resources are useful for resource management, access management and cost allocation. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS Resources</a> in the <i>AWS
     * General Reference</i>. Once the resource is created, you can use <a>TagResource</a>, <a>UntagResource</a>, and
     * <a>ListTagsForResource</a> to add, remove, and view tags. The maximum tag limit may be lower than stated. See the
     * AWS General Reference for actual tagging limits.
     * </p>
     * 
     * @return A list of labels to assign to the new script resource. Tags are developer-defined key-value pairs.
     *         Tagging AWS resources are useful for resource management, access management and cost allocation. For more
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
     * A list of labels to assign to the new script resource. Tags are developer-defined key-value pairs. Tagging AWS
     * resources are useful for resource management, access management and cost allocation. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS Resources</a> in the <i>AWS
     * General Reference</i>. Once the resource is created, you can use <a>TagResource</a>, <a>UntagResource</a>, and
     * <a>ListTagsForResource</a> to add, remove, and view tags. The maximum tag limit may be lower than stated. See the
     * AWS General Reference for actual tagging limits.
     * </p>
     * 
     * @param tags
     *        A list of labels to assign to the new script resource. Tags are developer-defined key-value pairs. Tagging
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
     * A list of labels to assign to the new script resource. Tags are developer-defined key-value pairs. Tagging AWS
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
     *        A list of labels to assign to the new script resource. Tags are developer-defined key-value pairs. Tagging
     *        AWS resources are useful for resource management, access management and cost allocation. For more
     *        information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS
     *        Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use
     *        <a>TagResource</a>, <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags.
     *        The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScriptRequest withTags(Tag... tags) {
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
     * A list of labels to assign to the new script resource. Tags are developer-defined key-value pairs. Tagging AWS
     * resources are useful for resource management, access management and cost allocation. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS Resources</a> in the <i>AWS
     * General Reference</i>. Once the resource is created, you can use <a>TagResource</a>, <a>UntagResource</a>, and
     * <a>ListTagsForResource</a> to add, remove, and view tags. The maximum tag limit may be lower than stated. See the
     * AWS General Reference for actual tagging limits.
     * </p>
     * 
     * @param tags
     *        A list of labels to assign to the new script resource. Tags are developer-defined key-value pairs. Tagging
     *        AWS resources are useful for resource management, access management and cost allocation. For more
     *        information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS
     *        Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use
     *        <a>TagResource</a>, <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags.
     *        The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateScriptRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getZipFile() != null)
            sb.append("ZipFile: ").append(getZipFile()).append(",");
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

        if (obj instanceof CreateScriptRequest == false)
            return false;
        CreateScriptRequest other = (CreateScriptRequest) obj;
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
        if (other.getZipFile() == null ^ this.getZipFile() == null)
            return false;
        if (other.getZipFile() != null && other.getZipFile().equals(this.getZipFile()) == false)
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
        hashCode = prime * hashCode + ((getZipFile() == null) ? 0 : getZipFile().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateScriptRequest clone() {
        return (CreateScriptRequest) super.clone();
    }

}
