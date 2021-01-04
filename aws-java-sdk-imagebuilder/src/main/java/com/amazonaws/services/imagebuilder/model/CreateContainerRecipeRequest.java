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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateContainerRecipe" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateContainerRecipeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of container to create.
     * </p>
     */
    private String containerType;
    /**
     * <p>
     * The name of the container recipe.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the container recipe.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The semantic version of the container recipe (&lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;).
     * </p>
     */
    private String semanticVersion;
    /**
     * <p>
     * Components for build and test that are included in the container recipe.
     * </p>
     */
    private java.util.List<ComponentConfiguration> components;
    /**
     * <p>
     * The Dockerfile template used to build your image as an inline data blob.
     * </p>
     */
    private String dockerfileTemplateData;
    /**
     * <p>
     * The S3 URI for the Dockerfile that will be used to build your container image.
     * </p>
     */
    private String dockerfileTemplateUri;
    /**
     * <p>
     * Specifies the operating system platform when you use a custom source image.
     * </p>
     */
    private String platformOverride;
    /**
     * <p>
     * Specifies the operating system version for the source image.
     * </p>
     */
    private String imageOsVersionOverride;
    /**
     * <p>
     * The source image for the container recipe.
     * </p>
     */
    private String parentImage;
    /**
     * <p>
     * Tags that are attached to the container recipe.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The working directory for use during build and test workflows.
     * </p>
     */
    private String workingDirectory;
    /**
     * <p>
     * The destination repository for the container image.
     * </p>
     */
    private TargetContainerRepository targetRepository;
    /**
     * <p>
     * Identifies which KMS key is used to encrypt the container image.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The client token used to make this request idempotent.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The type of container to create.
     * </p>
     * 
     * @param containerType
     *        The type of container to create.
     * @see ContainerType
     */

    public void setContainerType(String containerType) {
        this.containerType = containerType;
    }

    /**
     * <p>
     * The type of container to create.
     * </p>
     * 
     * @return The type of container to create.
     * @see ContainerType
     */

    public String getContainerType() {
        return this.containerType;
    }

    /**
     * <p>
     * The type of container to create.
     * </p>
     * 
     * @param containerType
     *        The type of container to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerType
     */

    public CreateContainerRecipeRequest withContainerType(String containerType) {
        setContainerType(containerType);
        return this;
    }

    /**
     * <p>
     * The type of container to create.
     * </p>
     * 
     * @param containerType
     *        The type of container to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerType
     */

    public CreateContainerRecipeRequest withContainerType(ContainerType containerType) {
        this.containerType = containerType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the container recipe.
     * </p>
     * 
     * @param name
     *        The name of the container recipe.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the container recipe.
     * </p>
     * 
     * @return The name of the container recipe.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the container recipe.
     * </p>
     * 
     * @param name
     *        The name of the container recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerRecipeRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the container recipe.
     * </p>
     * 
     * @param description
     *        The description of the container recipe.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the container recipe.
     * </p>
     * 
     * @return The description of the container recipe.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the container recipe.
     * </p>
     * 
     * @param description
     *        The description of the container recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerRecipeRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The semantic version of the container recipe (&lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;).
     * </p>
     * 
     * @param semanticVersion
     *        The semantic version of the container recipe (&lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;).
     */

    public void setSemanticVersion(String semanticVersion) {
        this.semanticVersion = semanticVersion;
    }

    /**
     * <p>
     * The semantic version of the container recipe (&lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;).
     * </p>
     * 
     * @return The semantic version of the container recipe (&lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;).
     */

    public String getSemanticVersion() {
        return this.semanticVersion;
    }

    /**
     * <p>
     * The semantic version of the container recipe (&lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;).
     * </p>
     * 
     * @param semanticVersion
     *        The semantic version of the container recipe (&lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerRecipeRequest withSemanticVersion(String semanticVersion) {
        setSemanticVersion(semanticVersion);
        return this;
    }

    /**
     * <p>
     * Components for build and test that are included in the container recipe.
     * </p>
     * 
     * @return Components for build and test that are included in the container recipe.
     */

    public java.util.List<ComponentConfiguration> getComponents() {
        return components;
    }

    /**
     * <p>
     * Components for build and test that are included in the container recipe.
     * </p>
     * 
     * @param components
     *        Components for build and test that are included in the container recipe.
     */

    public void setComponents(java.util.Collection<ComponentConfiguration> components) {
        if (components == null) {
            this.components = null;
            return;
        }

        this.components = new java.util.ArrayList<ComponentConfiguration>(components);
    }

    /**
     * <p>
     * Components for build and test that are included in the container recipe.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComponents(java.util.Collection)} or {@link #withComponents(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param components
     *        Components for build and test that are included in the container recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerRecipeRequest withComponents(ComponentConfiguration... components) {
        if (this.components == null) {
            setComponents(new java.util.ArrayList<ComponentConfiguration>(components.length));
        }
        for (ComponentConfiguration ele : components) {
            this.components.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Components for build and test that are included in the container recipe.
     * </p>
     * 
     * @param components
     *        Components for build and test that are included in the container recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerRecipeRequest withComponents(java.util.Collection<ComponentConfiguration> components) {
        setComponents(components);
        return this;
    }

    /**
     * <p>
     * The Dockerfile template used to build your image as an inline data blob.
     * </p>
     * 
     * @param dockerfileTemplateData
     *        The Dockerfile template used to build your image as an inline data blob.
     */

    public void setDockerfileTemplateData(String dockerfileTemplateData) {
        this.dockerfileTemplateData = dockerfileTemplateData;
    }

    /**
     * <p>
     * The Dockerfile template used to build your image as an inline data blob.
     * </p>
     * 
     * @return The Dockerfile template used to build your image as an inline data blob.
     */

    public String getDockerfileTemplateData() {
        return this.dockerfileTemplateData;
    }

    /**
     * <p>
     * The Dockerfile template used to build your image as an inline data blob.
     * </p>
     * 
     * @param dockerfileTemplateData
     *        The Dockerfile template used to build your image as an inline data blob.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerRecipeRequest withDockerfileTemplateData(String dockerfileTemplateData) {
        setDockerfileTemplateData(dockerfileTemplateData);
        return this;
    }

    /**
     * <p>
     * The S3 URI for the Dockerfile that will be used to build your container image.
     * </p>
     * 
     * @param dockerfileTemplateUri
     *        The S3 URI for the Dockerfile that will be used to build your container image.
     */

    public void setDockerfileTemplateUri(String dockerfileTemplateUri) {
        this.dockerfileTemplateUri = dockerfileTemplateUri;
    }

    /**
     * <p>
     * The S3 URI for the Dockerfile that will be used to build your container image.
     * </p>
     * 
     * @return The S3 URI for the Dockerfile that will be used to build your container image.
     */

    public String getDockerfileTemplateUri() {
        return this.dockerfileTemplateUri;
    }

    /**
     * <p>
     * The S3 URI for the Dockerfile that will be used to build your container image.
     * </p>
     * 
     * @param dockerfileTemplateUri
     *        The S3 URI for the Dockerfile that will be used to build your container image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerRecipeRequest withDockerfileTemplateUri(String dockerfileTemplateUri) {
        setDockerfileTemplateUri(dockerfileTemplateUri);
        return this;
    }

    /**
     * <p>
     * Specifies the operating system platform when you use a custom source image.
     * </p>
     * 
     * @param platformOverride
     *        Specifies the operating system platform when you use a custom source image.
     * @see Platform
     */

    public void setPlatformOverride(String platformOverride) {
        this.platformOverride = platformOverride;
    }

    /**
     * <p>
     * Specifies the operating system platform when you use a custom source image.
     * </p>
     * 
     * @return Specifies the operating system platform when you use a custom source image.
     * @see Platform
     */

    public String getPlatformOverride() {
        return this.platformOverride;
    }

    /**
     * <p>
     * Specifies the operating system platform when you use a custom source image.
     * </p>
     * 
     * @param platformOverride
     *        Specifies the operating system platform when you use a custom source image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public CreateContainerRecipeRequest withPlatformOverride(String platformOverride) {
        setPlatformOverride(platformOverride);
        return this;
    }

    /**
     * <p>
     * Specifies the operating system platform when you use a custom source image.
     * </p>
     * 
     * @param platformOverride
     *        Specifies the operating system platform when you use a custom source image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public CreateContainerRecipeRequest withPlatformOverride(Platform platformOverride) {
        this.platformOverride = platformOverride.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the operating system version for the source image.
     * </p>
     * 
     * @param imageOsVersionOverride
     *        Specifies the operating system version for the source image.
     */

    public void setImageOsVersionOverride(String imageOsVersionOverride) {
        this.imageOsVersionOverride = imageOsVersionOverride;
    }

    /**
     * <p>
     * Specifies the operating system version for the source image.
     * </p>
     * 
     * @return Specifies the operating system version for the source image.
     */

    public String getImageOsVersionOverride() {
        return this.imageOsVersionOverride;
    }

    /**
     * <p>
     * Specifies the operating system version for the source image.
     * </p>
     * 
     * @param imageOsVersionOverride
     *        Specifies the operating system version for the source image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerRecipeRequest withImageOsVersionOverride(String imageOsVersionOverride) {
        setImageOsVersionOverride(imageOsVersionOverride);
        return this;
    }

    /**
     * <p>
     * The source image for the container recipe.
     * </p>
     * 
     * @param parentImage
     *        The source image for the container recipe.
     */

    public void setParentImage(String parentImage) {
        this.parentImage = parentImage;
    }

    /**
     * <p>
     * The source image for the container recipe.
     * </p>
     * 
     * @return The source image for the container recipe.
     */

    public String getParentImage() {
        return this.parentImage;
    }

    /**
     * <p>
     * The source image for the container recipe.
     * </p>
     * 
     * @param parentImage
     *        The source image for the container recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerRecipeRequest withParentImage(String parentImage) {
        setParentImage(parentImage);
        return this;
    }

    /**
     * <p>
     * Tags that are attached to the container recipe.
     * </p>
     * 
     * @return Tags that are attached to the container recipe.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags that are attached to the container recipe.
     * </p>
     * 
     * @param tags
     *        Tags that are attached to the container recipe.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags that are attached to the container recipe.
     * </p>
     * 
     * @param tags
     *        Tags that are attached to the container recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerRecipeRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateContainerRecipeRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerRecipeRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerRecipeRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The working directory for use during build and test workflows.
     * </p>
     * 
     * @param workingDirectory
     *        The working directory for use during build and test workflows.
     */

    public void setWorkingDirectory(String workingDirectory) {
        this.workingDirectory = workingDirectory;
    }

    /**
     * <p>
     * The working directory for use during build and test workflows.
     * </p>
     * 
     * @return The working directory for use during build and test workflows.
     */

    public String getWorkingDirectory() {
        return this.workingDirectory;
    }

    /**
     * <p>
     * The working directory for use during build and test workflows.
     * </p>
     * 
     * @param workingDirectory
     *        The working directory for use during build and test workflows.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerRecipeRequest withWorkingDirectory(String workingDirectory) {
        setWorkingDirectory(workingDirectory);
        return this;
    }

    /**
     * <p>
     * The destination repository for the container image.
     * </p>
     * 
     * @param targetRepository
     *        The destination repository for the container image.
     */

    public void setTargetRepository(TargetContainerRepository targetRepository) {
        this.targetRepository = targetRepository;
    }

    /**
     * <p>
     * The destination repository for the container image.
     * </p>
     * 
     * @return The destination repository for the container image.
     */

    public TargetContainerRepository getTargetRepository() {
        return this.targetRepository;
    }

    /**
     * <p>
     * The destination repository for the container image.
     * </p>
     * 
     * @param targetRepository
     *        The destination repository for the container image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerRecipeRequest withTargetRepository(TargetContainerRepository targetRepository) {
        setTargetRepository(targetRepository);
        return this;
    }

    /**
     * <p>
     * Identifies which KMS key is used to encrypt the container image.
     * </p>
     * 
     * @param kmsKeyId
     *        Identifies which KMS key is used to encrypt the container image.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * Identifies which KMS key is used to encrypt the container image.
     * </p>
     * 
     * @return Identifies which KMS key is used to encrypt the container image.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * Identifies which KMS key is used to encrypt the container image.
     * </p>
     * 
     * @param kmsKeyId
     *        Identifies which KMS key is used to encrypt the container image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerRecipeRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The client token used to make this request idempotent.
     * </p>
     * 
     * @param clientToken
     *        The client token used to make this request idempotent.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The client token used to make this request idempotent.
     * </p>
     * 
     * @return The client token used to make this request idempotent.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The client token used to make this request idempotent.
     * </p>
     * 
     * @param clientToken
     *        The client token used to make this request idempotent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerRecipeRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getContainerType() != null)
            sb.append("ContainerType: ").append(getContainerType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSemanticVersion() != null)
            sb.append("SemanticVersion: ").append(getSemanticVersion()).append(",");
        if (getComponents() != null)
            sb.append("Components: ").append(getComponents()).append(",");
        if (getDockerfileTemplateData() != null)
            sb.append("DockerfileTemplateData: ").append(getDockerfileTemplateData()).append(",");
        if (getDockerfileTemplateUri() != null)
            sb.append("DockerfileTemplateUri: ").append(getDockerfileTemplateUri()).append(",");
        if (getPlatformOverride() != null)
            sb.append("PlatformOverride: ").append(getPlatformOverride()).append(",");
        if (getImageOsVersionOverride() != null)
            sb.append("ImageOsVersionOverride: ").append(getImageOsVersionOverride()).append(",");
        if (getParentImage() != null)
            sb.append("ParentImage: ").append(getParentImage()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getWorkingDirectory() != null)
            sb.append("WorkingDirectory: ").append(getWorkingDirectory()).append(",");
        if (getTargetRepository() != null)
            sb.append("TargetRepository: ").append(getTargetRepository()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateContainerRecipeRequest == false)
            return false;
        CreateContainerRecipeRequest other = (CreateContainerRecipeRequest) obj;
        if (other.getContainerType() == null ^ this.getContainerType() == null)
            return false;
        if (other.getContainerType() != null && other.getContainerType().equals(this.getContainerType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSemanticVersion() == null ^ this.getSemanticVersion() == null)
            return false;
        if (other.getSemanticVersion() != null && other.getSemanticVersion().equals(this.getSemanticVersion()) == false)
            return false;
        if (other.getComponents() == null ^ this.getComponents() == null)
            return false;
        if (other.getComponents() != null && other.getComponents().equals(this.getComponents()) == false)
            return false;
        if (other.getDockerfileTemplateData() == null ^ this.getDockerfileTemplateData() == null)
            return false;
        if (other.getDockerfileTemplateData() != null && other.getDockerfileTemplateData().equals(this.getDockerfileTemplateData()) == false)
            return false;
        if (other.getDockerfileTemplateUri() == null ^ this.getDockerfileTemplateUri() == null)
            return false;
        if (other.getDockerfileTemplateUri() != null && other.getDockerfileTemplateUri().equals(this.getDockerfileTemplateUri()) == false)
            return false;
        if (other.getPlatformOverride() == null ^ this.getPlatformOverride() == null)
            return false;
        if (other.getPlatformOverride() != null && other.getPlatformOverride().equals(this.getPlatformOverride()) == false)
            return false;
        if (other.getImageOsVersionOverride() == null ^ this.getImageOsVersionOverride() == null)
            return false;
        if (other.getImageOsVersionOverride() != null && other.getImageOsVersionOverride().equals(this.getImageOsVersionOverride()) == false)
            return false;
        if (other.getParentImage() == null ^ this.getParentImage() == null)
            return false;
        if (other.getParentImage() != null && other.getParentImage().equals(this.getParentImage()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getWorkingDirectory() == null ^ this.getWorkingDirectory() == null)
            return false;
        if (other.getWorkingDirectory() != null && other.getWorkingDirectory().equals(this.getWorkingDirectory()) == false)
            return false;
        if (other.getTargetRepository() == null ^ this.getTargetRepository() == null)
            return false;
        if (other.getTargetRepository() != null && other.getTargetRepository().equals(this.getTargetRepository()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerType() == null) ? 0 : getContainerType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSemanticVersion() == null) ? 0 : getSemanticVersion().hashCode());
        hashCode = prime * hashCode + ((getComponents() == null) ? 0 : getComponents().hashCode());
        hashCode = prime * hashCode + ((getDockerfileTemplateData() == null) ? 0 : getDockerfileTemplateData().hashCode());
        hashCode = prime * hashCode + ((getDockerfileTemplateUri() == null) ? 0 : getDockerfileTemplateUri().hashCode());
        hashCode = prime * hashCode + ((getPlatformOverride() == null) ? 0 : getPlatformOverride().hashCode());
        hashCode = prime * hashCode + ((getImageOsVersionOverride() == null) ? 0 : getImageOsVersionOverride().hashCode());
        hashCode = prime * hashCode + ((getParentImage() == null) ? 0 : getParentImage().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getWorkingDirectory() == null) ? 0 : getWorkingDirectory().hashCode());
        hashCode = prime * hashCode + ((getTargetRepository() == null) ? 0 : getTargetRepository().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateContainerRecipeRequest clone() {
        return (CreateContainerRecipeRequest) super.clone();
    }

}
