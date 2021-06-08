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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateUpdatedImage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUpdatedImageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the image to update.
     * </p>
     */
    private String existingImageName;
    /**
     * <p>
     * The name of the new image. The name must be unique within the AWS account and Region.
     * </p>
     */
    private String newImageName;
    /**
     * <p>
     * The description to display for the new image.
     * </p>
     */
    private String newImageDescription;
    /**
     * <p>
     * The name to display for the new image.
     * </p>
     */
    private String newImageDisplayName;
    /**
     * <p>
     * The tags to associate with the new image. A tag is a key-value pair, and the value is optional. For example,
     * Environment=Test. If you do not specify a value, Environment=.
     * </p>
     * <p>
     * Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following special
     * characters:
     * </p>
     * <p>
     * _ . : / = + \ - @
     * </p>
     * <p>
     * If you do not specify a value, the value is set to an empty string.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="https://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic.html">Tagging Your Resources</a>
     * in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> newImageTags;
    /**
     * <p>
     * Indicates whether to display the status of image update availability before AppStream 2.0 initiates the process
     * of creating a new updated image. If this value is set to <code>true</code>, AppStream 2.0 displays whether image
     * updates are available. If this value is set to <code>false</code>, AppStream 2.0 initiates the process of
     * creating a new updated image without displaying whether image updates are available.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The name of the image to update.
     * </p>
     * 
     * @param existingImageName
     *        The name of the image to update.
     */

    public void setExistingImageName(String existingImageName) {
        this.existingImageName = existingImageName;
    }

    /**
     * <p>
     * The name of the image to update.
     * </p>
     * 
     * @return The name of the image to update.
     */

    public String getExistingImageName() {
        return this.existingImageName;
    }

    /**
     * <p>
     * The name of the image to update.
     * </p>
     * 
     * @param existingImageName
     *        The name of the image to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUpdatedImageRequest withExistingImageName(String existingImageName) {
        setExistingImageName(existingImageName);
        return this;
    }

    /**
     * <p>
     * The name of the new image. The name must be unique within the AWS account and Region.
     * </p>
     * 
     * @param newImageName
     *        The name of the new image. The name must be unique within the AWS account and Region.
     */

    public void setNewImageName(String newImageName) {
        this.newImageName = newImageName;
    }

    /**
     * <p>
     * The name of the new image. The name must be unique within the AWS account and Region.
     * </p>
     * 
     * @return The name of the new image. The name must be unique within the AWS account and Region.
     */

    public String getNewImageName() {
        return this.newImageName;
    }

    /**
     * <p>
     * The name of the new image. The name must be unique within the AWS account and Region.
     * </p>
     * 
     * @param newImageName
     *        The name of the new image. The name must be unique within the AWS account and Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUpdatedImageRequest withNewImageName(String newImageName) {
        setNewImageName(newImageName);
        return this;
    }

    /**
     * <p>
     * The description to display for the new image.
     * </p>
     * 
     * @param newImageDescription
     *        The description to display for the new image.
     */

    public void setNewImageDescription(String newImageDescription) {
        this.newImageDescription = newImageDescription;
    }

    /**
     * <p>
     * The description to display for the new image.
     * </p>
     * 
     * @return The description to display for the new image.
     */

    public String getNewImageDescription() {
        return this.newImageDescription;
    }

    /**
     * <p>
     * The description to display for the new image.
     * </p>
     * 
     * @param newImageDescription
     *        The description to display for the new image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUpdatedImageRequest withNewImageDescription(String newImageDescription) {
        setNewImageDescription(newImageDescription);
        return this;
    }

    /**
     * <p>
     * The name to display for the new image.
     * </p>
     * 
     * @param newImageDisplayName
     *        The name to display for the new image.
     */

    public void setNewImageDisplayName(String newImageDisplayName) {
        this.newImageDisplayName = newImageDisplayName;
    }

    /**
     * <p>
     * The name to display for the new image.
     * </p>
     * 
     * @return The name to display for the new image.
     */

    public String getNewImageDisplayName() {
        return this.newImageDisplayName;
    }

    /**
     * <p>
     * The name to display for the new image.
     * </p>
     * 
     * @param newImageDisplayName
     *        The name to display for the new image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUpdatedImageRequest withNewImageDisplayName(String newImageDisplayName) {
        setNewImageDisplayName(newImageDisplayName);
        return this;
    }

    /**
     * <p>
     * The tags to associate with the new image. A tag is a key-value pair, and the value is optional. For example,
     * Environment=Test. If you do not specify a value, Environment=.
     * </p>
     * <p>
     * Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following special
     * characters:
     * </p>
     * <p>
     * _ . : / = + \ - @
     * </p>
     * <p>
     * If you do not specify a value, the value is set to an empty string.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="https://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic.html">Tagging Your Resources</a>
     * in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     * </p>
     * 
     * @return The tags to associate with the new image. A tag is a key-value pair, and the value is optional. For
     *         example, Environment=Test. If you do not specify a value, Environment=. </p>
     *         <p>
     *         Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following
     *         special characters:
     *         </p>
     *         <p>
     *         _ . : / = + \ - @
     *         </p>
     *         <p>
     *         If you do not specify a value, the value is set to an empty string.
     *         </p>
     *         <p>
     *         For more information about tags, see <a
     *         href="https://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic.html">Tagging Your
     *         Resources</a> in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     */

    public java.util.Map<String, String> getNewImageTags() {
        return newImageTags;
    }

    /**
     * <p>
     * The tags to associate with the new image. A tag is a key-value pair, and the value is optional. For example,
     * Environment=Test. If you do not specify a value, Environment=.
     * </p>
     * <p>
     * Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following special
     * characters:
     * </p>
     * <p>
     * _ . : / = + \ - @
     * </p>
     * <p>
     * If you do not specify a value, the value is set to an empty string.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="https://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic.html">Tagging Your Resources</a>
     * in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     * </p>
     * 
     * @param newImageTags
     *        The tags to associate with the new image. A tag is a key-value pair, and the value is optional. For
     *        example, Environment=Test. If you do not specify a value, Environment=. </p>
     *        <p>
     *        Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following
     *        special characters:
     *        </p>
     *        <p>
     *        _ . : / = + \ - @
     *        </p>
     *        <p>
     *        If you do not specify a value, the value is set to an empty string.
     *        </p>
     *        <p>
     *        For more information about tags, see <a
     *        href="https://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic.html">Tagging Your
     *        Resources</a> in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     */

    public void setNewImageTags(java.util.Map<String, String> newImageTags) {
        this.newImageTags = newImageTags;
    }

    /**
     * <p>
     * The tags to associate with the new image. A tag is a key-value pair, and the value is optional. For example,
     * Environment=Test. If you do not specify a value, Environment=.
     * </p>
     * <p>
     * Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following special
     * characters:
     * </p>
     * <p>
     * _ . : / = + \ - @
     * </p>
     * <p>
     * If you do not specify a value, the value is set to an empty string.
     * </p>
     * <p>
     * For more information about tags, see <a
     * href="https://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic.html">Tagging Your Resources</a>
     * in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     * </p>
     * 
     * @param newImageTags
     *        The tags to associate with the new image. A tag is a key-value pair, and the value is optional. For
     *        example, Environment=Test. If you do not specify a value, Environment=. </p>
     *        <p>
     *        Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following
     *        special characters:
     *        </p>
     *        <p>
     *        _ . : / = + \ - @
     *        </p>
     *        <p>
     *        If you do not specify a value, the value is set to an empty string.
     *        </p>
     *        <p>
     *        For more information about tags, see <a
     *        href="https://docs.aws.amazon.com/appstream2/latest/developerguide/tagging-basic.html">Tagging Your
     *        Resources</a> in the <i>Amazon AppStream 2.0 Administration Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUpdatedImageRequest withNewImageTags(java.util.Map<String, String> newImageTags) {
        setNewImageTags(newImageTags);
        return this;
    }

    /**
     * Add a single NewImageTags entry
     *
     * @see CreateUpdatedImageRequest#withNewImageTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateUpdatedImageRequest addNewImageTagsEntry(String key, String value) {
        if (null == this.newImageTags) {
            this.newImageTags = new java.util.HashMap<String, String>();
        }
        if (this.newImageTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.newImageTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into NewImageTags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUpdatedImageRequest clearNewImageTagsEntries() {
        this.newImageTags = null;
        return this;
    }

    /**
     * <p>
     * Indicates whether to display the status of image update availability before AppStream 2.0 initiates the process
     * of creating a new updated image. If this value is set to <code>true</code>, AppStream 2.0 displays whether image
     * updates are available. If this value is set to <code>false</code>, AppStream 2.0 initiates the process of
     * creating a new updated image without displaying whether image updates are available.
     * </p>
     * 
     * @param dryRun
     *        Indicates whether to display the status of image update availability before AppStream 2.0 initiates the
     *        process of creating a new updated image. If this value is set to <code>true</code>, AppStream 2.0 displays
     *        whether image updates are available. If this value is set to <code>false</code>, AppStream 2.0 initiates
     *        the process of creating a new updated image without displaying whether image updates are available.
     */

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Indicates whether to display the status of image update availability before AppStream 2.0 initiates the process
     * of creating a new updated image. If this value is set to <code>true</code>, AppStream 2.0 displays whether image
     * updates are available. If this value is set to <code>false</code>, AppStream 2.0 initiates the process of
     * creating a new updated image without displaying whether image updates are available.
     * </p>
     * 
     * @return Indicates whether to display the status of image update availability before AppStream 2.0 initiates the
     *         process of creating a new updated image. If this value is set to <code>true</code>, AppStream 2.0
     *         displays whether image updates are available. If this value is set to <code>false</code>, AppStream 2.0
     *         initiates the process of creating a new updated image without displaying whether image updates are
     *         available.
     */

    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * <p>
     * Indicates whether to display the status of image update availability before AppStream 2.0 initiates the process
     * of creating a new updated image. If this value is set to <code>true</code>, AppStream 2.0 displays whether image
     * updates are available. If this value is set to <code>false</code>, AppStream 2.0 initiates the process of
     * creating a new updated image without displaying whether image updates are available.
     * </p>
     * 
     * @param dryRun
     *        Indicates whether to display the status of image update availability before AppStream 2.0 initiates the
     *        process of creating a new updated image. If this value is set to <code>true</code>, AppStream 2.0 displays
     *        whether image updates are available. If this value is set to <code>false</code>, AppStream 2.0 initiates
     *        the process of creating a new updated image without displaying whether image updates are available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUpdatedImageRequest withDryRun(Boolean dryRun) {
        setDryRun(dryRun);
        return this;
    }

    /**
     * <p>
     * Indicates whether to display the status of image update availability before AppStream 2.0 initiates the process
     * of creating a new updated image. If this value is set to <code>true</code>, AppStream 2.0 displays whether image
     * updates are available. If this value is set to <code>false</code>, AppStream 2.0 initiates the process of
     * creating a new updated image without displaying whether image updates are available.
     * </p>
     * 
     * @return Indicates whether to display the status of image update availability before AppStream 2.0 initiates the
     *         process of creating a new updated image. If this value is set to <code>true</code>, AppStream 2.0
     *         displays whether image updates are available. If this value is set to <code>false</code>, AppStream 2.0
     *         initiates the process of creating a new updated image without displaying whether image updates are
     *         available.
     */

    public Boolean isDryRun() {
        return this.dryRun;
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
        if (getExistingImageName() != null)
            sb.append("ExistingImageName: ").append(getExistingImageName()).append(",");
        if (getNewImageName() != null)
            sb.append("NewImageName: ").append(getNewImageName()).append(",");
        if (getNewImageDescription() != null)
            sb.append("NewImageDescription: ").append(getNewImageDescription()).append(",");
        if (getNewImageDisplayName() != null)
            sb.append("NewImageDisplayName: ").append(getNewImageDisplayName()).append(",");
        if (getNewImageTags() != null)
            sb.append("NewImageTags: ").append(getNewImageTags()).append(",");
        if (getDryRun() != null)
            sb.append("DryRun: ").append(getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUpdatedImageRequest == false)
            return false;
        CreateUpdatedImageRequest other = (CreateUpdatedImageRequest) obj;
        if (other.getExistingImageName() == null ^ this.getExistingImageName() == null)
            return false;
        if (other.getExistingImageName() != null && other.getExistingImageName().equals(this.getExistingImageName()) == false)
            return false;
        if (other.getNewImageName() == null ^ this.getNewImageName() == null)
            return false;
        if (other.getNewImageName() != null && other.getNewImageName().equals(this.getNewImageName()) == false)
            return false;
        if (other.getNewImageDescription() == null ^ this.getNewImageDescription() == null)
            return false;
        if (other.getNewImageDescription() != null && other.getNewImageDescription().equals(this.getNewImageDescription()) == false)
            return false;
        if (other.getNewImageDisplayName() == null ^ this.getNewImageDisplayName() == null)
            return false;
        if (other.getNewImageDisplayName() != null && other.getNewImageDisplayName().equals(this.getNewImageDisplayName()) == false)
            return false;
        if (other.getNewImageTags() == null ^ this.getNewImageTags() == null)
            return false;
        if (other.getNewImageTags() != null && other.getNewImageTags().equals(this.getNewImageTags()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExistingImageName() == null) ? 0 : getExistingImageName().hashCode());
        hashCode = prime * hashCode + ((getNewImageName() == null) ? 0 : getNewImageName().hashCode());
        hashCode = prime * hashCode + ((getNewImageDescription() == null) ? 0 : getNewImageDescription().hashCode());
        hashCode = prime * hashCode + ((getNewImageDisplayName() == null) ? 0 : getNewImageDisplayName().hashCode());
        hashCode = prime * hashCode + ((getNewImageTags() == null) ? 0 : getNewImageTags().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public CreateUpdatedImageRequest clone() {
        return (CreateUpdatedImageRequest) super.clone();
    }

}
