/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an Amazon ECR image.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcrContainerImageDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcrContainerImageDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services account identifier that is associated with the registry that the image belongs to.
     * </p>
     */
    private String registryId;
    /**
     * <p>
     * The name of the repository that the image belongs to.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The architecture of the image. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arm64</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>i386</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x86_64</code>
     * </p>
     * </li>
     * </ul>
     */
    private String architecture;
    /**
     * <p>
     * The sha256 digest of the image manifest.
     * </p>
     */
    private String imageDigest;
    /**
     * <p>
     * The list of tags that are associated with the image.
     * </p>
     */
    private java.util.List<String> imageTags;
    /**
     * <p>
     * The date and time when the image was pushed to the repository.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     */
    private String imagePublishedAt;

    /**
     * <p>
     * The Amazon Web Services account identifier that is associated with the registry that the image belongs to.
     * </p>
     * 
     * @param registryId
     *        The Amazon Web Services account identifier that is associated with the registry that the image belongs to.
     */

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>
     * The Amazon Web Services account identifier that is associated with the registry that the image belongs to.
     * </p>
     * 
     * @return The Amazon Web Services account identifier that is associated with the registry that the image belongs
     *         to.
     */

    public String getRegistryId() {
        return this.registryId;
    }

    /**
     * <p>
     * The Amazon Web Services account identifier that is associated with the registry that the image belongs to.
     * </p>
     * 
     * @param registryId
     *        The Amazon Web Services account identifier that is associated with the registry that the image belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrContainerImageDetails withRegistryId(String registryId) {
        setRegistryId(registryId);
        return this;
    }

    /**
     * <p>
     * The name of the repository that the image belongs to.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository that the image belongs to.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository that the image belongs to.
     * </p>
     * 
     * @return The name of the repository that the image belongs to.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository that the image belongs to.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository that the image belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrContainerImageDetails withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The architecture of the image. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arm64</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>i386</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x86_64</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param architecture
     *        The architecture of the image. Valid values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arm64</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>i386</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>x86_64</code>
     *        </p>
     *        </li>
     */

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     * <p>
     * The architecture of the image. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arm64</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>i386</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x86_64</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The architecture of the image. Valid values are as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arm64</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>i386</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>x86_64</code>
     *         </p>
     *         </li>
     */

    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * <p>
     * The architecture of the image. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arm64</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>i386</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x86_64</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param architecture
     *        The architecture of the image. Valid values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arm64</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>i386</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>x86_64</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrContainerImageDetails withArchitecture(String architecture) {
        setArchitecture(architecture);
        return this;
    }

    /**
     * <p>
     * The sha256 digest of the image manifest.
     * </p>
     * 
     * @param imageDigest
     *        The sha256 digest of the image manifest.
     */

    public void setImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
    }

    /**
     * <p>
     * The sha256 digest of the image manifest.
     * </p>
     * 
     * @return The sha256 digest of the image manifest.
     */

    public String getImageDigest() {
        return this.imageDigest;
    }

    /**
     * <p>
     * The sha256 digest of the image manifest.
     * </p>
     * 
     * @param imageDigest
     *        The sha256 digest of the image manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrContainerImageDetails withImageDigest(String imageDigest) {
        setImageDigest(imageDigest);
        return this;
    }

    /**
     * <p>
     * The list of tags that are associated with the image.
     * </p>
     * 
     * @return The list of tags that are associated with the image.
     */

    public java.util.List<String> getImageTags() {
        return imageTags;
    }

    /**
     * <p>
     * The list of tags that are associated with the image.
     * </p>
     * 
     * @param imageTags
     *        The list of tags that are associated with the image.
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
     * The list of tags that are associated with the image.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImageTags(java.util.Collection)} or {@link #withImageTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param imageTags
     *        The list of tags that are associated with the image.
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
     * The list of tags that are associated with the image.
     * </p>
     * 
     * @param imageTags
     *        The list of tags that are associated with the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrContainerImageDetails withImageTags(java.util.Collection<String> imageTags) {
        setImageTags(imageTags);
        return this;
    }

    /**
     * <p>
     * The date and time when the image was pushed to the repository.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @param imagePublishedAt
     *        The date and time when the image was pushed to the repository.</p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     */

    public void setImagePublishedAt(String imagePublishedAt) {
        this.imagePublishedAt = imagePublishedAt;
    }

    /**
     * <p>
     * The date and time when the image was pushed to the repository.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @return The date and time when the image was pushed to the repository.</p>
     *         <p>
     *         This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *         <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *         maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *         <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *         </p>
     *         </li>
     */

    public String getImagePublishedAt() {
        return this.imagePublishedAt;
    }

    /**
     * <p>
     * The date and time when the image was pushed to the repository.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @param imagePublishedAt
     *        The date and time when the image was pushed to the repository.</p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrContainerImageDetails withImagePublishedAt(String imagePublishedAt) {
        setImagePublishedAt(imagePublishedAt);
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
        if (getRegistryId() != null)
            sb.append("RegistryId: ").append(getRegistryId()).append(",");
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getArchitecture() != null)
            sb.append("Architecture: ").append(getArchitecture()).append(",");
        if (getImageDigest() != null)
            sb.append("ImageDigest: ").append(getImageDigest()).append(",");
        if (getImageTags() != null)
            sb.append("ImageTags: ").append(getImageTags()).append(",");
        if (getImagePublishedAt() != null)
            sb.append("ImagePublishedAt: ").append(getImagePublishedAt());
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
        if (other.getRegistryId() == null ^ this.getRegistryId() == null)
            return false;
        if (other.getRegistryId() != null && other.getRegistryId().equals(this.getRegistryId()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getArchitecture() == null ^ this.getArchitecture() == null)
            return false;
        if (other.getArchitecture() != null && other.getArchitecture().equals(this.getArchitecture()) == false)
            return false;
        if (other.getImageDigest() == null ^ this.getImageDigest() == null)
            return false;
        if (other.getImageDigest() != null && other.getImageDigest().equals(this.getImageDigest()) == false)
            return false;
        if (other.getImageTags() == null ^ this.getImageTags() == null)
            return false;
        if (other.getImageTags() != null && other.getImageTags().equals(this.getImageTags()) == false)
            return false;
        if (other.getImagePublishedAt() == null ^ this.getImagePublishedAt() == null)
            return false;
        if (other.getImagePublishedAt() != null && other.getImagePublishedAt().equals(this.getImagePublishedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistryId() == null) ? 0 : getRegistryId().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode());
        hashCode = prime * hashCode + ((getImageDigest() == null) ? 0 : getImageDigest().hashCode());
        hashCode = prime * hashCode + ((getImageTags() == null) ? 0 : getImageTags().hashCode());
        hashCode = prime * hashCode + ((getImagePublishedAt() == null) ? 0 : getImagePublishedAt().hashCode());
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
        com.amazonaws.services.securityhub.model.transform.AwsEcrContainerImageDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
