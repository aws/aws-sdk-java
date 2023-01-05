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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The image details of the Amazon ECR container image.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/AwsEcrContainerImageDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcrContainerImageDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The architecture of the Amazon ECR container image.
     * </p>
     */
    private String architecture;
    /**
     * <p>
     * The image author of the Amazon ECR container image.
     * </p>
     */
    private String author;
    /**
     * <p>
     * The image hash of the Amazon ECR container image.
     * </p>
     */
    private String imageHash;
    /**
     * <p>
     * The image tags attached to the Amazon ECR container image.
     * </p>
     */
    private java.util.List<String> imageTags;
    /**
     * <p>
     * The platform of the Amazon ECR container image.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The date and time the Amazon ECR container image was pushed.
     * </p>
     */
    private java.util.Date pushedAt;
    /**
     * <p>
     * The registry for the Amazon ECR container image.
     * </p>
     */
    private String registry;
    /**
     * <p>
     * The name of the repository the Amazon ECR container image resides in.
     * </p>
     */
    private String repositoryName;

    /**
     * <p>
     * The architecture of the Amazon ECR container image.
     * </p>
     * 
     * @param architecture
     *        The architecture of the Amazon ECR container image.
     */

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     * <p>
     * The architecture of the Amazon ECR container image.
     * </p>
     * 
     * @return The architecture of the Amazon ECR container image.
     */

    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * <p>
     * The architecture of the Amazon ECR container image.
     * </p>
     * 
     * @param architecture
     *        The architecture of the Amazon ECR container image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrContainerImageDetails withArchitecture(String architecture) {
        setArchitecture(architecture);
        return this;
    }

    /**
     * <p>
     * The image author of the Amazon ECR container image.
     * </p>
     * 
     * @param author
     *        The image author of the Amazon ECR container image.
     */

    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * <p>
     * The image author of the Amazon ECR container image.
     * </p>
     * 
     * @return The image author of the Amazon ECR container image.
     */

    public String getAuthor() {
        return this.author;
    }

    /**
     * <p>
     * The image author of the Amazon ECR container image.
     * </p>
     * 
     * @param author
     *        The image author of the Amazon ECR container image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrContainerImageDetails withAuthor(String author) {
        setAuthor(author);
        return this;
    }

    /**
     * <p>
     * The image hash of the Amazon ECR container image.
     * </p>
     * 
     * @param imageHash
     *        The image hash of the Amazon ECR container image.
     */

    public void setImageHash(String imageHash) {
        this.imageHash = imageHash;
    }

    /**
     * <p>
     * The image hash of the Amazon ECR container image.
     * </p>
     * 
     * @return The image hash of the Amazon ECR container image.
     */

    public String getImageHash() {
        return this.imageHash;
    }

    /**
     * <p>
     * The image hash of the Amazon ECR container image.
     * </p>
     * 
     * @param imageHash
     *        The image hash of the Amazon ECR container image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrContainerImageDetails withImageHash(String imageHash) {
        setImageHash(imageHash);
        return this;
    }

    /**
     * <p>
     * The image tags attached to the Amazon ECR container image.
     * </p>
     * 
     * @return The image tags attached to the Amazon ECR container image.
     */

    public java.util.List<String> getImageTags() {
        return imageTags;
    }

    /**
     * <p>
     * The image tags attached to the Amazon ECR container image.
     * </p>
     * 
     * @param imageTags
     *        The image tags attached to the Amazon ECR container image.
     */

    public void setImageTags(java.util.Collection<String> imageTags) {
        if (imageTags == null) {
            this.imageTags = null;
            return;
        }

        this.imageTags = new java.util.ArrayList<String>(imageTags);
    }

    /**
     * <p>
     * The image tags attached to the Amazon ECR container image.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImageTags(java.util.Collection)} or {@link #withImageTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param imageTags
     *        The image tags attached to the Amazon ECR container image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrContainerImageDetails withImageTags(String... imageTags) {
        if (this.imageTags == null) {
            setImageTags(new java.util.ArrayList<String>(imageTags.length));
        }
        for (String ele : imageTags) {
            this.imageTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The image tags attached to the Amazon ECR container image.
     * </p>
     * 
     * @param imageTags
     *        The image tags attached to the Amazon ECR container image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrContainerImageDetails withImageTags(java.util.Collection<String> imageTags) {
        setImageTags(imageTags);
        return this;
    }

    /**
     * <p>
     * The platform of the Amazon ECR container image.
     * </p>
     * 
     * @param platform
     *        The platform of the Amazon ECR container image.
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The platform of the Amazon ECR container image.
     * </p>
     * 
     * @return The platform of the Amazon ECR container image.
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The platform of the Amazon ECR container image.
     * </p>
     * 
     * @param platform
     *        The platform of the Amazon ECR container image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrContainerImageDetails withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The date and time the Amazon ECR container image was pushed.
     * </p>
     * 
     * @param pushedAt
     *        The date and time the Amazon ECR container image was pushed.
     */

    public void setPushedAt(java.util.Date pushedAt) {
        this.pushedAt = pushedAt;
    }

    /**
     * <p>
     * The date and time the Amazon ECR container image was pushed.
     * </p>
     * 
     * @return The date and time the Amazon ECR container image was pushed.
     */

    public java.util.Date getPushedAt() {
        return this.pushedAt;
    }

    /**
     * <p>
     * The date and time the Amazon ECR container image was pushed.
     * </p>
     * 
     * @param pushedAt
     *        The date and time the Amazon ECR container image was pushed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrContainerImageDetails withPushedAt(java.util.Date pushedAt) {
        setPushedAt(pushedAt);
        return this;
    }

    /**
     * <p>
     * The registry for the Amazon ECR container image.
     * </p>
     * 
     * @param registry
     *        The registry for the Amazon ECR container image.
     */

    public void setRegistry(String registry) {
        this.registry = registry;
    }

    /**
     * <p>
     * The registry for the Amazon ECR container image.
     * </p>
     * 
     * @return The registry for the Amazon ECR container image.
     */

    public String getRegistry() {
        return this.registry;
    }

    /**
     * <p>
     * The registry for the Amazon ECR container image.
     * </p>
     * 
     * @param registry
     *        The registry for the Amazon ECR container image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrContainerImageDetails withRegistry(String registry) {
        setRegistry(registry);
        return this;
    }

    /**
     * <p>
     * The name of the repository the Amazon ECR container image resides in.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository the Amazon ECR container image resides in.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository the Amazon ECR container image resides in.
     * </p>
     * 
     * @return The name of the repository the Amazon ECR container image resides in.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository the Amazon ECR container image resides in.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository the Amazon ECR container image resides in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrContainerImageDetails withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
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
        if (getArchitecture() != null)
            sb.append("Architecture: ").append(getArchitecture()).append(",");
        if (getAuthor() != null)
            sb.append("Author: ").append(getAuthor()).append(",");
        if (getImageHash() != null)
            sb.append("ImageHash: ").append(getImageHash()).append(",");
        if (getImageTags() != null)
            sb.append("ImageTags: ").append(getImageTags()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getPushedAt() != null)
            sb.append("PushedAt: ").append(getPushedAt()).append(",");
        if (getRegistry() != null)
            sb.append("Registry: ").append(getRegistry()).append(",");
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEcrContainerImageDetails == false)
            return false;
        AwsEcrContainerImageDetails other = (AwsEcrContainerImageDetails) obj;
        if (other.getArchitecture() == null ^ this.getArchitecture() == null)
            return false;
        if (other.getArchitecture() != null && other.getArchitecture().equals(this.getArchitecture()) == false)
            return false;
        if (other.getAuthor() == null ^ this.getAuthor() == null)
            return false;
        if (other.getAuthor() != null && other.getAuthor().equals(this.getAuthor()) == false)
            return false;
        if (other.getImageHash() == null ^ this.getImageHash() == null)
            return false;
        if (other.getImageHash() != null && other.getImageHash().equals(this.getImageHash()) == false)
            return false;
        if (other.getImageTags() == null ^ this.getImageTags() == null)
            return false;
        if (other.getImageTags() != null && other.getImageTags().equals(this.getImageTags()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getPushedAt() == null ^ this.getPushedAt() == null)
            return false;
        if (other.getPushedAt() != null && other.getPushedAt().equals(this.getPushedAt()) == false)
            return false;
        if (other.getRegistry() == null ^ this.getRegistry() == null)
            return false;
        if (other.getRegistry() != null && other.getRegistry().equals(this.getRegistry()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode());
        hashCode = prime * hashCode + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        hashCode = prime * hashCode + ((getImageHash() == null) ? 0 : getImageHash().hashCode());
        hashCode = prime * hashCode + ((getImageTags() == null) ? 0 : getImageTags().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getPushedAt() == null) ? 0 : getPushedAt().hashCode());
        hashCode = prime * hashCode + ((getRegistry() == null) ? 0 : getRegistry().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcrContainerImageDetails clone() {
        try {
            return (AwsEcrContainerImageDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.AwsEcrContainerImageDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
