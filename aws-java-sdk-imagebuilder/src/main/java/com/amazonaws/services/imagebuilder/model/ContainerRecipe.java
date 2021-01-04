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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A container recipe.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ContainerRecipe" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerRecipe implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container recipe.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Specifies the type of container, such as Docker.
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
     * The system platform for the container, such as Windows or Linux.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The owner of the container recipe.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * The semantic version of the container recipe (&lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;).
     * </p>
     */
    private String version;
    /**
     * <p>
     * Components for build and test that are included in the container recipe.
     * </p>
     */
    private java.util.List<ComponentConfiguration> components;
    /**
     * <p>
     * Dockerfiles are text documents that are used to build Docker containers, and ensure that they contain all of the
     * elements required by the application running inside. The template data consists of contextual variables where
     * Image Builder places build information or scripts, based on your container image recipe.
     * </p>
     */
    private String dockerfileTemplateData;
    /**
     * <p>
     * Identifies which KMS key is used to encrypt the container image for distribution to the target Region.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * A flag that indicates if the target container is encrypted.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p>
     * The source image for the container recipe.
     * </p>
     */
    private String parentImage;
    /**
     * <p>
     * The date when this container recipe was created.
     * </p>
     */
    private String dateCreated;
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
     * The Amazon Resource Name (ARN) of the container recipe.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the container recipe.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container recipe.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the container recipe.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container recipe.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the container recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerRecipe withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Specifies the type of container, such as Docker.
     * </p>
     * 
     * @param containerType
     *        Specifies the type of container, such as Docker.
     * @see ContainerType
     */

    public void setContainerType(String containerType) {
        this.containerType = containerType;
    }

    /**
     * <p>
     * Specifies the type of container, such as Docker.
     * </p>
     * 
     * @return Specifies the type of container, such as Docker.
     * @see ContainerType
     */

    public String getContainerType() {
        return this.containerType;
    }

    /**
     * <p>
     * Specifies the type of container, such as Docker.
     * </p>
     * 
     * @param containerType
     *        Specifies the type of container, such as Docker.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerType
     */

    public ContainerRecipe withContainerType(String containerType) {
        setContainerType(containerType);
        return this;
    }

    /**
     * <p>
     * Specifies the type of container, such as Docker.
     * </p>
     * 
     * @param containerType
     *        Specifies the type of container, such as Docker.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerType
     */

    public ContainerRecipe withContainerType(ContainerType containerType) {
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

    public ContainerRecipe withName(String name) {
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

    public ContainerRecipe withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The system platform for the container, such as Windows or Linux.
     * </p>
     * 
     * @param platform
     *        The system platform for the container, such as Windows or Linux.
     * @see Platform
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The system platform for the container, such as Windows or Linux.
     * </p>
     * 
     * @return The system platform for the container, such as Windows or Linux.
     * @see Platform
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The system platform for the container, such as Windows or Linux.
     * </p>
     * 
     * @param platform
     *        The system platform for the container, such as Windows or Linux.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public ContainerRecipe withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The system platform for the container, such as Windows or Linux.
     * </p>
     * 
     * @param platform
     *        The system platform for the container, such as Windows or Linux.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public ContainerRecipe withPlatform(Platform platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * <p>
     * The owner of the container recipe.
     * </p>
     * 
     * @param owner
     *        The owner of the container recipe.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the container recipe.
     * </p>
     * 
     * @return The owner of the container recipe.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The owner of the container recipe.
     * </p>
     * 
     * @param owner
     *        The owner of the container recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerRecipe withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The semantic version of the container recipe (&lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;).
     * </p>
     * 
     * @param version
     *        The semantic version of the container recipe (&lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;).
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The semantic version of the container recipe (&lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;).
     * </p>
     * 
     * @return The semantic version of the container recipe (&lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;).
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The semantic version of the container recipe (&lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;).
     * </p>
     * 
     * @param version
     *        The semantic version of the container recipe (&lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerRecipe withVersion(String version) {
        setVersion(version);
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

    public ContainerRecipe withComponents(ComponentConfiguration... components) {
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

    public ContainerRecipe withComponents(java.util.Collection<ComponentConfiguration> components) {
        setComponents(components);
        return this;
    }

    /**
     * <p>
     * Dockerfiles are text documents that are used to build Docker containers, and ensure that they contain all of the
     * elements required by the application running inside. The template data consists of contextual variables where
     * Image Builder places build information or scripts, based on your container image recipe.
     * </p>
     * 
     * @param dockerfileTemplateData
     *        Dockerfiles are text documents that are used to build Docker containers, and ensure that they contain all
     *        of the elements required by the application running inside. The template data consists of contextual
     *        variables where Image Builder places build information or scripts, based on your container image recipe.
     */

    public void setDockerfileTemplateData(String dockerfileTemplateData) {
        this.dockerfileTemplateData = dockerfileTemplateData;
    }

    /**
     * <p>
     * Dockerfiles are text documents that are used to build Docker containers, and ensure that they contain all of the
     * elements required by the application running inside. The template data consists of contextual variables where
     * Image Builder places build information or scripts, based on your container image recipe.
     * </p>
     * 
     * @return Dockerfiles are text documents that are used to build Docker containers, and ensure that they contain all
     *         of the elements required by the application running inside. The template data consists of contextual
     *         variables where Image Builder places build information or scripts, based on your container image recipe.
     */

    public String getDockerfileTemplateData() {
        return this.dockerfileTemplateData;
    }

    /**
     * <p>
     * Dockerfiles are text documents that are used to build Docker containers, and ensure that they contain all of the
     * elements required by the application running inside. The template data consists of contextual variables where
     * Image Builder places build information or scripts, based on your container image recipe.
     * </p>
     * 
     * @param dockerfileTemplateData
     *        Dockerfiles are text documents that are used to build Docker containers, and ensure that they contain all
     *        of the elements required by the application running inside. The template data consists of contextual
     *        variables where Image Builder places build information or scripts, based on your container image recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerRecipe withDockerfileTemplateData(String dockerfileTemplateData) {
        setDockerfileTemplateData(dockerfileTemplateData);
        return this;
    }

    /**
     * <p>
     * Identifies which KMS key is used to encrypt the container image for distribution to the target Region.
     * </p>
     * 
     * @param kmsKeyId
     *        Identifies which KMS key is used to encrypt the container image for distribution to the target Region.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * Identifies which KMS key is used to encrypt the container image for distribution to the target Region.
     * </p>
     * 
     * @return Identifies which KMS key is used to encrypt the container image for distribution to the target Region.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * Identifies which KMS key is used to encrypt the container image for distribution to the target Region.
     * </p>
     * 
     * @param kmsKeyId
     *        Identifies which KMS key is used to encrypt the container image for distribution to the target Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerRecipe withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * A flag that indicates if the target container is encrypted.
     * </p>
     * 
     * @param encrypted
     *        A flag that indicates if the target container is encrypted.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * A flag that indicates if the target container is encrypted.
     * </p>
     * 
     * @return A flag that indicates if the target container is encrypted.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * A flag that indicates if the target container is encrypted.
     * </p>
     * 
     * @param encrypted
     *        A flag that indicates if the target container is encrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerRecipe withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * A flag that indicates if the target container is encrypted.
     * </p>
     * 
     * @return A flag that indicates if the target container is encrypted.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
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

    public ContainerRecipe withParentImage(String parentImage) {
        setParentImage(parentImage);
        return this;
    }

    /**
     * <p>
     * The date when this container recipe was created.
     * </p>
     * 
     * @param dateCreated
     *        The date when this container recipe was created.
     */

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * <p>
     * The date when this container recipe was created.
     * </p>
     * 
     * @return The date when this container recipe was created.
     */

    public String getDateCreated() {
        return this.dateCreated;
    }

    /**
     * <p>
     * The date when this container recipe was created.
     * </p>
     * 
     * @param dateCreated
     *        The date when this container recipe was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerRecipe withDateCreated(String dateCreated) {
        setDateCreated(dateCreated);
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

    public ContainerRecipe withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see ContainerRecipe#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ContainerRecipe addTagsEntry(String key, String value) {
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

    public ContainerRecipe clearTagsEntries() {
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

    public ContainerRecipe withWorkingDirectory(String workingDirectory) {
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

    public ContainerRecipe withTargetRepository(TargetContainerRepository targetRepository) {
        setTargetRepository(targetRepository);
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
        if (getContainerType() != null)
            sb.append("ContainerType: ").append(getContainerType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getComponents() != null)
            sb.append("Components: ").append(getComponents()).append(",");
        if (getDockerfileTemplateData() != null)
            sb.append("DockerfileTemplateData: ").append(getDockerfileTemplateData()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getEncrypted() != null)
            sb.append("Encrypted: ").append(getEncrypted()).append(",");
        if (getParentImage() != null)
            sb.append("ParentImage: ").append(getParentImage()).append(",");
        if (getDateCreated() != null)
            sb.append("DateCreated: ").append(getDateCreated()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getWorkingDirectory() != null)
            sb.append("WorkingDirectory: ").append(getWorkingDirectory()).append(",");
        if (getTargetRepository() != null)
            sb.append("TargetRepository: ").append(getTargetRepository());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerRecipe == false)
            return false;
        ContainerRecipe other = (ContainerRecipe) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
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
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getComponents() == null ^ this.getComponents() == null)
            return false;
        if (other.getComponents() != null && other.getComponents().equals(this.getComponents()) == false)
            return false;
        if (other.getDockerfileTemplateData() == null ^ this.getDockerfileTemplateData() == null)
            return false;
        if (other.getDockerfileTemplateData() != null && other.getDockerfileTemplateData().equals(this.getDockerfileTemplateData()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getParentImage() == null ^ this.getParentImage() == null)
            return false;
        if (other.getParentImage() != null && other.getParentImage().equals(this.getParentImage()) == false)
            return false;
        if (other.getDateCreated() == null ^ this.getDateCreated() == null)
            return false;
        if (other.getDateCreated() != null && other.getDateCreated().equals(this.getDateCreated()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getContainerType() == null) ? 0 : getContainerType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getComponents() == null) ? 0 : getComponents().hashCode());
        hashCode = prime * hashCode + ((getDockerfileTemplateData() == null) ? 0 : getDockerfileTemplateData().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getParentImage() == null) ? 0 : getParentImage().hashCode());
        hashCode = prime * hashCode + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getWorkingDirectory() == null) ? 0 : getWorkingDirectory().hashCode());
        hashCode = prime * hashCode + ((getTargetRepository() == null) ? 0 : getTargetRepository().hashCode());
        return hashCode;
    }

    @Override
    public ContainerRecipe clone() {
        try {
            return (ContainerRecipe) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.ContainerRecipeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
