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
 * An aggregation of information about Amazon ECR containers.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/AwsEcrContainerAggregationResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcrContainerAggregationResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services account ID of the account that owns the container.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The architecture of the container.
     * </p>
     */
    private String architecture;
    /**
     * <p>
     * The SHA value of the container image.
     * </p>
     */
    private String imageSha;
    /**
     * <p>
     * The container image stags.
     * </p>
     */
    private java.util.List<String> imageTags;
    /**
     * <p>
     * The container repository.
     * </p>
     */
    private String repository;
    /**
     * <p>
     * The resource ID of the container.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The number of finding by severity.
     * </p>
     */
    private SeverityCounts severityCounts;

    /**
     * <p>
     * The Amazon Web Services account ID of the account that owns the container.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID of the account that owns the container.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the account that owns the container.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the account that owns the container.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the account that owns the container.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID of the account that owns the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrContainerAggregationResponse withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The architecture of the container.
     * </p>
     * 
     * @param architecture
     *        The architecture of the container.
     */

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     * <p>
     * The architecture of the container.
     * </p>
     * 
     * @return The architecture of the container.
     */

    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * <p>
     * The architecture of the container.
     * </p>
     * 
     * @param architecture
     *        The architecture of the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrContainerAggregationResponse withArchitecture(String architecture) {
        setArchitecture(architecture);
        return this;
    }

    /**
     * <p>
     * The SHA value of the container image.
     * </p>
     * 
     * @param imageSha
     *        The SHA value of the container image.
     */

    public void setImageSha(String imageSha) {
        this.imageSha = imageSha;
    }

    /**
     * <p>
     * The SHA value of the container image.
     * </p>
     * 
     * @return The SHA value of the container image.
     */

    public String getImageSha() {
        return this.imageSha;
    }

    /**
     * <p>
     * The SHA value of the container image.
     * </p>
     * 
     * @param imageSha
     *        The SHA value of the container image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrContainerAggregationResponse withImageSha(String imageSha) {
        setImageSha(imageSha);
        return this;
    }

    /**
     * <p>
     * The container image stags.
     * </p>
     * 
     * @return The container image stags.
     */

    public java.util.List<String> getImageTags() {
        return imageTags;
    }

    /**
     * <p>
     * The container image stags.
     * </p>
     * 
     * @param imageTags
     *        The container image stags.
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
     * The container image stags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImageTags(java.util.Collection)} or {@link #withImageTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param imageTags
     *        The container image stags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrContainerAggregationResponse withImageTags(String... imageTags) {
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
     * The container image stags.
     * </p>
     * 
     * @param imageTags
     *        The container image stags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrContainerAggregationResponse withImageTags(java.util.Collection<String> imageTags) {
        setImageTags(imageTags);
        return this;
    }

    /**
     * <p>
     * The container repository.
     * </p>
     * 
     * @param repository
     *        The container repository.
     */

    public void setRepository(String repository) {
        this.repository = repository;
    }

    /**
     * <p>
     * The container repository.
     * </p>
     * 
     * @return The container repository.
     */

    public String getRepository() {
        return this.repository;
    }

    /**
     * <p>
     * The container repository.
     * </p>
     * 
     * @param repository
     *        The container repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrContainerAggregationResponse withRepository(String repository) {
        setRepository(repository);
        return this;
    }

    /**
     * <p>
     * The resource ID of the container.
     * </p>
     * 
     * @param resourceId
     *        The resource ID of the container.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The resource ID of the container.
     * </p>
     * 
     * @return The resource ID of the container.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The resource ID of the container.
     * </p>
     * 
     * @param resourceId
     *        The resource ID of the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrContainerAggregationResponse withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The number of finding by severity.
     * </p>
     * 
     * @param severityCounts
     *        The number of finding by severity.
     */

    public void setSeverityCounts(SeverityCounts severityCounts) {
        this.severityCounts = severityCounts;
    }

    /**
     * <p>
     * The number of finding by severity.
     * </p>
     * 
     * @return The number of finding by severity.
     */

    public SeverityCounts getSeverityCounts() {
        return this.severityCounts;
    }

    /**
     * <p>
     * The number of finding by severity.
     * </p>
     * 
     * @param severityCounts
     *        The number of finding by severity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrContainerAggregationResponse withSeverityCounts(SeverityCounts severityCounts) {
        setSeverityCounts(severityCounts);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getArchitecture() != null)
            sb.append("Architecture: ").append(getArchitecture()).append(",");
        if (getImageSha() != null)
            sb.append("ImageSha: ").append(getImageSha()).append(",");
        if (getImageTags() != null)
            sb.append("ImageTags: ").append(getImageTags()).append(",");
        if (getRepository() != null)
            sb.append("Repository: ").append(getRepository()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getSeverityCounts() != null)
            sb.append("SeverityCounts: ").append(getSeverityCounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEcrContainerAggregationResponse == false)
            return false;
        AwsEcrContainerAggregationResponse other = (AwsEcrContainerAggregationResponse) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getArchitecture() == null ^ this.getArchitecture() == null)
            return false;
        if (other.getArchitecture() != null && other.getArchitecture().equals(this.getArchitecture()) == false)
            return false;
        if (other.getImageSha() == null ^ this.getImageSha() == null)
            return false;
        if (other.getImageSha() != null && other.getImageSha().equals(this.getImageSha()) == false)
            return false;
        if (other.getImageTags() == null ^ this.getImageTags() == null)
            return false;
        if (other.getImageTags() != null && other.getImageTags().equals(this.getImageTags()) == false)
            return false;
        if (other.getRepository() == null ^ this.getRepository() == null)
            return false;
        if (other.getRepository() != null && other.getRepository().equals(this.getRepository()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getSeverityCounts() == null ^ this.getSeverityCounts() == null)
            return false;
        if (other.getSeverityCounts() != null && other.getSeverityCounts().equals(this.getSeverityCounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode());
        hashCode = prime * hashCode + ((getImageSha() == null) ? 0 : getImageSha().hashCode());
        hashCode = prime * hashCode + ((getImageTags() == null) ? 0 : getImageTags().hashCode());
        hashCode = prime * hashCode + ((getRepository() == null) ? 0 : getRepository().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getSeverityCounts() == null) ? 0 : getSeverityCounts().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcrContainerAggregationResponse clone() {
        try {
            return (AwsEcrContainerAggregationResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.AwsEcrContainerAggregationResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
