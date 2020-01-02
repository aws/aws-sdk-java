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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/CreateRepository" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRepositoryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name to use for the repository. The repository name may be specified on its own (such as
     * <code>nginx-web-app</code>) or it can be prepended with a namespace to group the repository into a category (such
     * as <code>project-a/nginx-web-app</code>).
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The metadata that you apply to the repository to help you categorize and organize them. Each tag consists of a
     * key and an optional value, both of which you define. Tag keys can have a maximum character length of 128
     * characters, and tag values can have a maximum length of 256 characters.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The tag mutability setting for the repository. If this parameter is omitted, the default setting of
     * <code>MUTABLE</code> will be used which will allow image tags to be overwritten. If <code>IMMUTABLE</code> is
     * specified, all image tags within the repository will be immutable which will prevent them from being overwritten.
     * </p>
     */
    private String imageTagMutability;
    /**
     * <p>
     * The image scanning configuration for the repository. This setting determines whether images are scanned for known
     * vulnerabilities after being pushed to the repository.
     * </p>
     */
    private ImageScanningConfiguration imageScanningConfiguration;

    /**
     * <p>
     * The name to use for the repository. The repository name may be specified on its own (such as
     * <code>nginx-web-app</code>) or it can be prepended with a namespace to group the repository into a category (such
     * as <code>project-a/nginx-web-app</code>).
     * </p>
     * 
     * @param repositoryName
     *        The name to use for the repository. The repository name may be specified on its own (such as
     *        <code>nginx-web-app</code>) or it can be prepended with a namespace to group the repository into a
     *        category (such as <code>project-a/nginx-web-app</code>).
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name to use for the repository. The repository name may be specified on its own (such as
     * <code>nginx-web-app</code>) or it can be prepended with a namespace to group the repository into a category (such
     * as <code>project-a/nginx-web-app</code>).
     * </p>
     * 
     * @return The name to use for the repository. The repository name may be specified on its own (such as
     *         <code>nginx-web-app</code>) or it can be prepended with a namespace to group the repository into a
     *         category (such as <code>project-a/nginx-web-app</code>).
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name to use for the repository. The repository name may be specified on its own (such as
     * <code>nginx-web-app</code>) or it can be prepended with a namespace to group the repository into a category (such
     * as <code>project-a/nginx-web-app</code>).
     * </p>
     * 
     * @param repositoryName
     *        The name to use for the repository. The repository name may be specified on its own (such as
     *        <code>nginx-web-app</code>) or it can be prepended with a namespace to group the repository into a
     *        category (such as <code>project-a/nginx-web-app</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRepositoryRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The metadata that you apply to the repository to help you categorize and organize them. Each tag consists of a
     * key and an optional value, both of which you define. Tag keys can have a maximum character length of 128
     * characters, and tag values can have a maximum length of 256 characters.
     * </p>
     * 
     * @return The metadata that you apply to the repository to help you categorize and organize them. Each tag consists
     *         of a key and an optional value, both of which you define. Tag keys can have a maximum character length of
     *         128 characters, and tag values can have a maximum length of 256 characters.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The metadata that you apply to the repository to help you categorize and organize them. Each tag consists of a
     * key and an optional value, both of which you define. Tag keys can have a maximum character length of 128
     * characters, and tag values can have a maximum length of 256 characters.
     * </p>
     * 
     * @param tags
     *        The metadata that you apply to the repository to help you categorize and organize them. Each tag consists
     *        of a key and an optional value, both of which you define. Tag keys can have a maximum character length of
     *        128 characters, and tag values can have a maximum length of 256 characters.
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
     * The metadata that you apply to the repository to help you categorize and organize them. Each tag consists of a
     * key and an optional value, both of which you define. Tag keys can have a maximum character length of 128
     * characters, and tag values can have a maximum length of 256 characters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The metadata that you apply to the repository to help you categorize and organize them. Each tag consists
     *        of a key and an optional value, both of which you define. Tag keys can have a maximum character length of
     *        128 characters, and tag values can have a maximum length of 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRepositoryRequest withTags(Tag... tags) {
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
     * The metadata that you apply to the repository to help you categorize and organize them. Each tag consists of a
     * key and an optional value, both of which you define. Tag keys can have a maximum character length of 128
     * characters, and tag values can have a maximum length of 256 characters.
     * </p>
     * 
     * @param tags
     *        The metadata that you apply to the repository to help you categorize and organize them. Each tag consists
     *        of a key and an optional value, both of which you define. Tag keys can have a maximum character length of
     *        128 characters, and tag values can have a maximum length of 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRepositoryRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The tag mutability setting for the repository. If this parameter is omitted, the default setting of
     * <code>MUTABLE</code> will be used which will allow image tags to be overwritten. If <code>IMMUTABLE</code> is
     * specified, all image tags within the repository will be immutable which will prevent them from being overwritten.
     * </p>
     * 
     * @param imageTagMutability
     *        The tag mutability setting for the repository. If this parameter is omitted, the default setting of
     *        <code>MUTABLE</code> will be used which will allow image tags to be overwritten. If <code>IMMUTABLE</code>
     *        is specified, all image tags within the repository will be immutable which will prevent them from being
     *        overwritten.
     * @see ImageTagMutability
     */

    public void setImageTagMutability(String imageTagMutability) {
        this.imageTagMutability = imageTagMutability;
    }

    /**
     * <p>
     * The tag mutability setting for the repository. If this parameter is omitted, the default setting of
     * <code>MUTABLE</code> will be used which will allow image tags to be overwritten. If <code>IMMUTABLE</code> is
     * specified, all image tags within the repository will be immutable which will prevent them from being overwritten.
     * </p>
     * 
     * @return The tag mutability setting for the repository. If this parameter is omitted, the default setting of
     *         <code>MUTABLE</code> will be used which will allow image tags to be overwritten. If
     *         <code>IMMUTABLE</code> is specified, all image tags within the repository will be immutable which will
     *         prevent them from being overwritten.
     * @see ImageTagMutability
     */

    public String getImageTagMutability() {
        return this.imageTagMutability;
    }

    /**
     * <p>
     * The tag mutability setting for the repository. If this parameter is omitted, the default setting of
     * <code>MUTABLE</code> will be used which will allow image tags to be overwritten. If <code>IMMUTABLE</code> is
     * specified, all image tags within the repository will be immutable which will prevent them from being overwritten.
     * </p>
     * 
     * @param imageTagMutability
     *        The tag mutability setting for the repository. If this parameter is omitted, the default setting of
     *        <code>MUTABLE</code> will be used which will allow image tags to be overwritten. If <code>IMMUTABLE</code>
     *        is specified, all image tags within the repository will be immutable which will prevent them from being
     *        overwritten.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageTagMutability
     */

    public CreateRepositoryRequest withImageTagMutability(String imageTagMutability) {
        setImageTagMutability(imageTagMutability);
        return this;
    }

    /**
     * <p>
     * The tag mutability setting for the repository. If this parameter is omitted, the default setting of
     * <code>MUTABLE</code> will be used which will allow image tags to be overwritten. If <code>IMMUTABLE</code> is
     * specified, all image tags within the repository will be immutable which will prevent them from being overwritten.
     * </p>
     * 
     * @param imageTagMutability
     *        The tag mutability setting for the repository. If this parameter is omitted, the default setting of
     *        <code>MUTABLE</code> will be used which will allow image tags to be overwritten. If <code>IMMUTABLE</code>
     *        is specified, all image tags within the repository will be immutable which will prevent them from being
     *        overwritten.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageTagMutability
     */

    public CreateRepositoryRequest withImageTagMutability(ImageTagMutability imageTagMutability) {
        this.imageTagMutability = imageTagMutability.toString();
        return this;
    }

    /**
     * <p>
     * The image scanning configuration for the repository. This setting determines whether images are scanned for known
     * vulnerabilities after being pushed to the repository.
     * </p>
     * 
     * @param imageScanningConfiguration
     *        The image scanning configuration for the repository. This setting determines whether images are scanned
     *        for known vulnerabilities after being pushed to the repository.
     */

    public void setImageScanningConfiguration(ImageScanningConfiguration imageScanningConfiguration) {
        this.imageScanningConfiguration = imageScanningConfiguration;
    }

    /**
     * <p>
     * The image scanning configuration for the repository. This setting determines whether images are scanned for known
     * vulnerabilities after being pushed to the repository.
     * </p>
     * 
     * @return The image scanning configuration for the repository. This setting determines whether images are scanned
     *         for known vulnerabilities after being pushed to the repository.
     */

    public ImageScanningConfiguration getImageScanningConfiguration() {
        return this.imageScanningConfiguration;
    }

    /**
     * <p>
     * The image scanning configuration for the repository. This setting determines whether images are scanned for known
     * vulnerabilities after being pushed to the repository.
     * </p>
     * 
     * @param imageScanningConfiguration
     *        The image scanning configuration for the repository. This setting determines whether images are scanned
     *        for known vulnerabilities after being pushed to the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRepositoryRequest withImageScanningConfiguration(ImageScanningConfiguration imageScanningConfiguration) {
        setImageScanningConfiguration(imageScanningConfiguration);
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
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getImageTagMutability() != null)
            sb.append("ImageTagMutability: ").append(getImageTagMutability()).append(",");
        if (getImageScanningConfiguration() != null)
            sb.append("ImageScanningConfiguration: ").append(getImageScanningConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRepositoryRequest == false)
            return false;
        CreateRepositoryRequest other = (CreateRepositoryRequest) obj;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getImageTagMutability() == null ^ this.getImageTagMutability() == null)
            return false;
        if (other.getImageTagMutability() != null && other.getImageTagMutability().equals(this.getImageTagMutability()) == false)
            return false;
        if (other.getImageScanningConfiguration() == null ^ this.getImageScanningConfiguration() == null)
            return false;
        if (other.getImageScanningConfiguration() != null && other.getImageScanningConfiguration().equals(this.getImageScanningConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getImageTagMutability() == null) ? 0 : getImageTagMutability().hashCode());
        hashCode = prime * hashCode + ((getImageScanningConfiguration() == null) ? 0 : getImageScanningConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateRepositoryRequest clone() {
        return (CreateRepositoryRequest) super.clone();
    }

}
