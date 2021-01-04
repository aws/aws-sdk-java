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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateImage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateImageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of properties to delete. Only the <code>Description</code> and <code>DisplayName</code> properties can be
     * deleted.
     * </p>
     */
    private java.util.List<String> deleteProperties;
    /**
     * <p>
     * The new description for the image.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The new display name for the image.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The name of the image to update.
     * </p>
     */
    private String imageName;
    /**
     * <p>
     * The new Amazon Resource Name (ARN) for the IAM role that enables Amazon SageMaker to perform tasks on your
     * behalf.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * A list of properties to delete. Only the <code>Description</code> and <code>DisplayName</code> properties can be
     * deleted.
     * </p>
     * 
     * @return A list of properties to delete. Only the <code>Description</code> and <code>DisplayName</code> properties
     *         can be deleted.
     */

    public java.util.List<String> getDeleteProperties() {
        return deleteProperties;
    }

    /**
     * <p>
     * A list of properties to delete. Only the <code>Description</code> and <code>DisplayName</code> properties can be
     * deleted.
     * </p>
     * 
     * @param deleteProperties
     *        A list of properties to delete. Only the <code>Description</code> and <code>DisplayName</code> properties
     *        can be deleted.
     */

    public void setDeleteProperties(java.util.Collection<String> deleteProperties) {
        if (deleteProperties == null) {
            this.deleteProperties = null;
            return;
        }

        this.deleteProperties = new java.util.ArrayList<String>(deleteProperties);
    }

    /**
     * <p>
     * A list of properties to delete. Only the <code>Description</code> and <code>DisplayName</code> properties can be
     * deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeleteProperties(java.util.Collection)} or {@link #withDeleteProperties(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param deleteProperties
     *        A list of properties to delete. Only the <code>Description</code> and <code>DisplayName</code> properties
     *        can be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateImageRequest withDeleteProperties(String... deleteProperties) {
        if (this.deleteProperties == null) {
            setDeleteProperties(new java.util.ArrayList<String>(deleteProperties.length));
        }
        for (String ele : deleteProperties) {
            this.deleteProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of properties to delete. Only the <code>Description</code> and <code>DisplayName</code> properties can be
     * deleted.
     * </p>
     * 
     * @param deleteProperties
     *        A list of properties to delete. Only the <code>Description</code> and <code>DisplayName</code> properties
     *        can be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateImageRequest withDeleteProperties(java.util.Collection<String> deleteProperties) {
        setDeleteProperties(deleteProperties);
        return this;
    }

    /**
     * <p>
     * The new description for the image.
     * </p>
     * 
     * @param description
     *        The new description for the image.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The new description for the image.
     * </p>
     * 
     * @return The new description for the image.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The new description for the image.
     * </p>
     * 
     * @param description
     *        The new description for the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateImageRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The new display name for the image.
     * </p>
     * 
     * @param displayName
     *        The new display name for the image.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The new display name for the image.
     * </p>
     * 
     * @return The new display name for the image.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The new display name for the image.
     * </p>
     * 
     * @param displayName
     *        The new display name for the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateImageRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The name of the image to update.
     * </p>
     * 
     * @param imageName
     *        The name of the image to update.
     */

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    /**
     * <p>
     * The name of the image to update.
     * </p>
     * 
     * @return The name of the image to update.
     */

    public String getImageName() {
        return this.imageName;
    }

    /**
     * <p>
     * The name of the image to update.
     * </p>
     * 
     * @param imageName
     *        The name of the image to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateImageRequest withImageName(String imageName) {
        setImageName(imageName);
        return this;
    }

    /**
     * <p>
     * The new Amazon Resource Name (ARN) for the IAM role that enables Amazon SageMaker to perform tasks on your
     * behalf.
     * </p>
     * 
     * @param roleArn
     *        The new Amazon Resource Name (ARN) for the IAM role that enables Amazon SageMaker to perform tasks on your
     *        behalf.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The new Amazon Resource Name (ARN) for the IAM role that enables Amazon SageMaker to perform tasks on your
     * behalf.
     * </p>
     * 
     * @return The new Amazon Resource Name (ARN) for the IAM role that enables Amazon SageMaker to perform tasks on
     *         your behalf.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The new Amazon Resource Name (ARN) for the IAM role that enables Amazon SageMaker to perform tasks on your
     * behalf.
     * </p>
     * 
     * @param roleArn
     *        The new Amazon Resource Name (ARN) for the IAM role that enables Amazon SageMaker to perform tasks on your
     *        behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateImageRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getDeleteProperties() != null)
            sb.append("DeleteProperties: ").append(getDeleteProperties()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getImageName() != null)
            sb.append("ImageName: ").append(getImageName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateImageRequest == false)
            return false;
        UpdateImageRequest other = (UpdateImageRequest) obj;
        if (other.getDeleteProperties() == null ^ this.getDeleteProperties() == null)
            return false;
        if (other.getDeleteProperties() != null && other.getDeleteProperties().equals(this.getDeleteProperties()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getImageName() == null ^ this.getImageName() == null)
            return false;
        if (other.getImageName() != null && other.getImageName().equals(this.getImageName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeleteProperties() == null) ? 0 : getDeleteProperties().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getImageName() == null) ? 0 : getImageName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateImageRequest clone() {
        return (UpdateImageRequest) super.clone();
    }

}
