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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about an Amazon Elastic Container Registry repository.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcrRepositoryDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcrRepositoryDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the repository.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The image scanning configuration for a repository.
     * </p>
     */
    private AwsEcrRepositoryImageScanningConfigurationDetails imageScanningConfiguration;
    /**
     * <p>
     * The tag mutability setting for the repository. Valid values are <code>IMMUTABLE</code> or <code>MUTABLE</code>.
     * </p>
     */
    private String imageTagMutability;
    /**
     * <p>
     * Information about the lifecycle policy for the repository.
     * </p>
     */
    private AwsEcrRepositoryLifecyclePolicyDetails lifecyclePolicy;
    /**
     * <p>
     * The name of the repository.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The text of the repository policy.
     * </p>
     */
    private String repositoryPolicyText;

    /**
     * <p>
     * The ARN of the repository.
     * </p>
     * 
     * @param arn
     *        The ARN of the repository.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the repository.
     * </p>
     * 
     * @return The ARN of the repository.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the repository.
     * </p>
     * 
     * @param arn
     *        The ARN of the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrRepositoryDetails withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The image scanning configuration for a repository.
     * </p>
     * 
     * @param imageScanningConfiguration
     *        The image scanning configuration for a repository.
     */

    public void setImageScanningConfiguration(AwsEcrRepositoryImageScanningConfigurationDetails imageScanningConfiguration) {
        this.imageScanningConfiguration = imageScanningConfiguration;
    }

    /**
     * <p>
     * The image scanning configuration for a repository.
     * </p>
     * 
     * @return The image scanning configuration for a repository.
     */

    public AwsEcrRepositoryImageScanningConfigurationDetails getImageScanningConfiguration() {
        return this.imageScanningConfiguration;
    }

    /**
     * <p>
     * The image scanning configuration for a repository.
     * </p>
     * 
     * @param imageScanningConfiguration
     *        The image scanning configuration for a repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrRepositoryDetails withImageScanningConfiguration(AwsEcrRepositoryImageScanningConfigurationDetails imageScanningConfiguration) {
        setImageScanningConfiguration(imageScanningConfiguration);
        return this;
    }

    /**
     * <p>
     * The tag mutability setting for the repository. Valid values are <code>IMMUTABLE</code> or <code>MUTABLE</code>.
     * </p>
     * 
     * @param imageTagMutability
     *        The tag mutability setting for the repository. Valid values are <code>IMMUTABLE</code> or
     *        <code>MUTABLE</code>.
     */

    public void setImageTagMutability(String imageTagMutability) {
        this.imageTagMutability = imageTagMutability;
    }

    /**
     * <p>
     * The tag mutability setting for the repository. Valid values are <code>IMMUTABLE</code> or <code>MUTABLE</code>.
     * </p>
     * 
     * @return The tag mutability setting for the repository. Valid values are <code>IMMUTABLE</code> or
     *         <code>MUTABLE</code>.
     */

    public String getImageTagMutability() {
        return this.imageTagMutability;
    }

    /**
     * <p>
     * The tag mutability setting for the repository. Valid values are <code>IMMUTABLE</code> or <code>MUTABLE</code>.
     * </p>
     * 
     * @param imageTagMutability
     *        The tag mutability setting for the repository. Valid values are <code>IMMUTABLE</code> or
     *        <code>MUTABLE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrRepositoryDetails withImageTagMutability(String imageTagMutability) {
        setImageTagMutability(imageTagMutability);
        return this;
    }

    /**
     * <p>
     * Information about the lifecycle policy for the repository.
     * </p>
     * 
     * @param lifecyclePolicy
     *        Information about the lifecycle policy for the repository.
     */

    public void setLifecyclePolicy(AwsEcrRepositoryLifecyclePolicyDetails lifecyclePolicy) {
        this.lifecyclePolicy = lifecyclePolicy;
    }

    /**
     * <p>
     * Information about the lifecycle policy for the repository.
     * </p>
     * 
     * @return Information about the lifecycle policy for the repository.
     */

    public AwsEcrRepositoryLifecyclePolicyDetails getLifecyclePolicy() {
        return this.lifecyclePolicy;
    }

    /**
     * <p>
     * Information about the lifecycle policy for the repository.
     * </p>
     * 
     * @param lifecyclePolicy
     *        Information about the lifecycle policy for the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrRepositoryDetails withLifecyclePolicy(AwsEcrRepositoryLifecyclePolicyDetails lifecyclePolicy) {
        setLifecyclePolicy(lifecyclePolicy);
        return this;
    }

    /**
     * <p>
     * The name of the repository.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository.
     * </p>
     * 
     * @return The name of the repository.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrRepositoryDetails withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The text of the repository policy.
     * </p>
     * 
     * @param repositoryPolicyText
     *        The text of the repository policy.
     */

    public void setRepositoryPolicyText(String repositoryPolicyText) {
        this.repositoryPolicyText = repositoryPolicyText;
    }

    /**
     * <p>
     * The text of the repository policy.
     * </p>
     * 
     * @return The text of the repository policy.
     */

    public String getRepositoryPolicyText() {
        return this.repositoryPolicyText;
    }

    /**
     * <p>
     * The text of the repository policy.
     * </p>
     * 
     * @param repositoryPolicyText
     *        The text of the repository policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcrRepositoryDetails withRepositoryPolicyText(String repositoryPolicyText) {
        setRepositoryPolicyText(repositoryPolicyText);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getImageScanningConfiguration() != null)
            sb.append("ImageScanningConfiguration: ").append(getImageScanningConfiguration()).append(",");
        if (getImageTagMutability() != null)
            sb.append("ImageTagMutability: ").append(getImageTagMutability()).append(",");
        if (getLifecyclePolicy() != null)
            sb.append("LifecyclePolicy: ").append(getLifecyclePolicy()).append(",");
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getRepositoryPolicyText() != null)
            sb.append("RepositoryPolicyText: ").append(getRepositoryPolicyText());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEcrRepositoryDetails == false)
            return false;
        AwsEcrRepositoryDetails other = (AwsEcrRepositoryDetails) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getImageScanningConfiguration() == null ^ this.getImageScanningConfiguration() == null)
            return false;
        if (other.getImageScanningConfiguration() != null && other.getImageScanningConfiguration().equals(this.getImageScanningConfiguration()) == false)
            return false;
        if (other.getImageTagMutability() == null ^ this.getImageTagMutability() == null)
            return false;
        if (other.getImageTagMutability() != null && other.getImageTagMutability().equals(this.getImageTagMutability()) == false)
            return false;
        if (other.getLifecyclePolicy() == null ^ this.getLifecyclePolicy() == null)
            return false;
        if (other.getLifecyclePolicy() != null && other.getLifecyclePolicy().equals(this.getLifecyclePolicy()) == false)
            return false;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getRepositoryPolicyText() == null ^ this.getRepositoryPolicyText() == null)
            return false;
        if (other.getRepositoryPolicyText() != null && other.getRepositoryPolicyText().equals(this.getRepositoryPolicyText()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getImageScanningConfiguration() == null) ? 0 : getImageScanningConfiguration().hashCode());
        hashCode = prime * hashCode + ((getImageTagMutability() == null) ? 0 : getImageTagMutability().hashCode());
        hashCode = prime * hashCode + ((getLifecyclePolicy() == null) ? 0 : getLifecyclePolicy().hashCode());
        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getRepositoryPolicyText() == null) ? 0 : getRepositoryPolicyText().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcrRepositoryDetails clone() {
        try {
            return (AwsEcrRepositoryDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEcrRepositoryDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
