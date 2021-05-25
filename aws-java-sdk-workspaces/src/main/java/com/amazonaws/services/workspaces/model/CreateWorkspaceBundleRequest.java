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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateWorkspaceBundle" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorkspaceBundleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the bundle.
     * </p>
     */
    private String bundleName;
    /**
     * <p>
     * The description of the bundle.
     * </p>
     */
    private String bundleDescription;
    /**
     * <p>
     * The identifier of the image that is used to create the bundle.
     * </p>
     */
    private String imageId;

    private ComputeType computeType;

    private UserStorage userStorage;

    private RootStorage rootStorage;
    /**
     * <p>
     * The tags associated with the bundle.
     * </p>
     * <note>
     * <p>
     * To add tags at the same time when you're creating the bundle, you must create an IAM policy that grants your IAM
     * user permissions to use <code>workspaces:CreateTags</code>.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The name of the bundle.
     * </p>
     * 
     * @param bundleName
     *        The name of the bundle.
     */

    public void setBundleName(String bundleName) {
        this.bundleName = bundleName;
    }

    /**
     * <p>
     * The name of the bundle.
     * </p>
     * 
     * @return The name of the bundle.
     */

    public String getBundleName() {
        return this.bundleName;
    }

    /**
     * <p>
     * The name of the bundle.
     * </p>
     * 
     * @param bundleName
     *        The name of the bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceBundleRequest withBundleName(String bundleName) {
        setBundleName(bundleName);
        return this;
    }

    /**
     * <p>
     * The description of the bundle.
     * </p>
     * 
     * @param bundleDescription
     *        The description of the bundle.
     */

    public void setBundleDescription(String bundleDescription) {
        this.bundleDescription = bundleDescription;
    }

    /**
     * <p>
     * The description of the bundle.
     * </p>
     * 
     * @return The description of the bundle.
     */

    public String getBundleDescription() {
        return this.bundleDescription;
    }

    /**
     * <p>
     * The description of the bundle.
     * </p>
     * 
     * @param bundleDescription
     *        The description of the bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceBundleRequest withBundleDescription(String bundleDescription) {
        setBundleDescription(bundleDescription);
        return this;
    }

    /**
     * <p>
     * The identifier of the image that is used to create the bundle.
     * </p>
     * 
     * @param imageId
     *        The identifier of the image that is used to create the bundle.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The identifier of the image that is used to create the bundle.
     * </p>
     * 
     * @return The identifier of the image that is used to create the bundle.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The identifier of the image that is used to create the bundle.
     * </p>
     * 
     * @param imageId
     *        The identifier of the image that is used to create the bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceBundleRequest withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * @param computeType
     */

    public void setComputeType(ComputeType computeType) {
        this.computeType = computeType;
    }

    /**
     * @return
     */

    public ComputeType getComputeType() {
        return this.computeType;
    }

    /**
     * @param computeType
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceBundleRequest withComputeType(ComputeType computeType) {
        setComputeType(computeType);
        return this;
    }

    /**
     * @param userStorage
     */

    public void setUserStorage(UserStorage userStorage) {
        this.userStorage = userStorage;
    }

    /**
     * @return
     */

    public UserStorage getUserStorage() {
        return this.userStorage;
    }

    /**
     * @param userStorage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceBundleRequest withUserStorage(UserStorage userStorage) {
        setUserStorage(userStorage);
        return this;
    }

    /**
     * @param rootStorage
     */

    public void setRootStorage(RootStorage rootStorage) {
        this.rootStorage = rootStorage;
    }

    /**
     * @return
     */

    public RootStorage getRootStorage() {
        return this.rootStorage;
    }

    /**
     * @param rootStorage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceBundleRequest withRootStorage(RootStorage rootStorage) {
        setRootStorage(rootStorage);
        return this;
    }

    /**
     * <p>
     * The tags associated with the bundle.
     * </p>
     * <note>
     * <p>
     * To add tags at the same time when you're creating the bundle, you must create an IAM policy that grants your IAM
     * user permissions to use <code>workspaces:CreateTags</code>.
     * </p>
     * </note>
     * 
     * @return The tags associated with the bundle.</p> <note>
     *         <p>
     *         To add tags at the same time when you're creating the bundle, you must create an IAM policy that grants
     *         your IAM user permissions to use <code>workspaces:CreateTags</code>.
     *         </p>
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags associated with the bundle.
     * </p>
     * <note>
     * <p>
     * To add tags at the same time when you're creating the bundle, you must create an IAM policy that grants your IAM
     * user permissions to use <code>workspaces:CreateTags</code>.
     * </p>
     * </note>
     * 
     * @param tags
     *        The tags associated with the bundle.</p> <note>
     *        <p>
     *        To add tags at the same time when you're creating the bundle, you must create an IAM policy that grants
     *        your IAM user permissions to use <code>workspaces:CreateTags</code>.
     *        </p>
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
     * The tags associated with the bundle.
     * </p>
     * <note>
     * <p>
     * To add tags at the same time when you're creating the bundle, you must create an IAM policy that grants your IAM
     * user permissions to use <code>workspaces:CreateTags</code>.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags associated with the bundle.</p> <note>
     *        <p>
     *        To add tags at the same time when you're creating the bundle, you must create an IAM policy that grants
     *        your IAM user permissions to use <code>workspaces:CreateTags</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceBundleRequest withTags(Tag... tags) {
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
     * The tags associated with the bundle.
     * </p>
     * <note>
     * <p>
     * To add tags at the same time when you're creating the bundle, you must create an IAM policy that grants your IAM
     * user permissions to use <code>workspaces:CreateTags</code>.
     * </p>
     * </note>
     * 
     * @param tags
     *        The tags associated with the bundle.</p> <note>
     *        <p>
     *        To add tags at the same time when you're creating the bundle, you must create an IAM policy that grants
     *        your IAM user permissions to use <code>workspaces:CreateTags</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceBundleRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getBundleName() != null)
            sb.append("BundleName: ").append(getBundleName()).append(",");
        if (getBundleDescription() != null)
            sb.append("BundleDescription: ").append(getBundleDescription()).append(",");
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getComputeType() != null)
            sb.append("ComputeType: ").append(getComputeType()).append(",");
        if (getUserStorage() != null)
            sb.append("UserStorage: ").append(getUserStorage()).append(",");
        if (getRootStorage() != null)
            sb.append("RootStorage: ").append(getRootStorage()).append(",");
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

        if (obj instanceof CreateWorkspaceBundleRequest == false)
            return false;
        CreateWorkspaceBundleRequest other = (CreateWorkspaceBundleRequest) obj;
        if (other.getBundleName() == null ^ this.getBundleName() == null)
            return false;
        if (other.getBundleName() != null && other.getBundleName().equals(this.getBundleName()) == false)
            return false;
        if (other.getBundleDescription() == null ^ this.getBundleDescription() == null)
            return false;
        if (other.getBundleDescription() != null && other.getBundleDescription().equals(this.getBundleDescription()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getComputeType() == null ^ this.getComputeType() == null)
            return false;
        if (other.getComputeType() != null && other.getComputeType().equals(this.getComputeType()) == false)
            return false;
        if (other.getUserStorage() == null ^ this.getUserStorage() == null)
            return false;
        if (other.getUserStorage() != null && other.getUserStorage().equals(this.getUserStorage()) == false)
            return false;
        if (other.getRootStorage() == null ^ this.getRootStorage() == null)
            return false;
        if (other.getRootStorage() != null && other.getRootStorage().equals(this.getRootStorage()) == false)
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

        hashCode = prime * hashCode + ((getBundleName() == null) ? 0 : getBundleName().hashCode());
        hashCode = prime * hashCode + ((getBundleDescription() == null) ? 0 : getBundleDescription().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getComputeType() == null) ? 0 : getComputeType().hashCode());
        hashCode = prime * hashCode + ((getUserStorage() == null) ? 0 : getUserStorage().hashCode());
        hashCode = prime * hashCode + ((getRootStorage() == null) ? 0 : getRootStorage().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateWorkspaceBundleRequest clone() {
        return (CreateWorkspaceBundleRequest) super.clone();
    }

}
