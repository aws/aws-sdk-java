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
package com.amazonaws.services.cleanroomsml.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/StartAudienceGenerationJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartAudienceGenerationJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the collaboration that contains the audience generation job.
     * </p>
     */
    private String collaborationId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model that is used for this audience generation job.
     * </p>
     */
    private String configuredAudienceModelArn;
    /**
     * <p>
     * The description of the audience generation job.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Whether the seed audience is included in the audience generation output.
     * </p>
     */
    private Boolean includeSeedInOutput;
    /**
     * <p>
     * The name of the audience generation job.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The seed audience that is used to generate the audience.
     * </p>
     */
    private AudienceGenerationJobDataSource seedAudience;
    /**
     * <p>
     * The optional metadata that you apply to the resource to help you categorize and organize them. Each tag consists
     * of a key and an optional value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources, remember that other services may have
     * restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable
     * in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for keys as it is reserved for
     * AWS use. You cannot edit or delete tag keys with this prefix. Values can have this prefix. If a tag value has aws
     * as its prefix but the key does not, then Clean Rooms ML considers it to be a user tag and will count against the
     * limit of 50 tags. Tags with only the key prefix of aws do not count against your tags per resource limit.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The identifier of the collaboration that contains the audience generation job.
     * </p>
     * 
     * @param collaborationId
     *        The identifier of the collaboration that contains the audience generation job.
     */

    public void setCollaborationId(String collaborationId) {
        this.collaborationId = collaborationId;
    }

    /**
     * <p>
     * The identifier of the collaboration that contains the audience generation job.
     * </p>
     * 
     * @return The identifier of the collaboration that contains the audience generation job.
     */

    public String getCollaborationId() {
        return this.collaborationId;
    }

    /**
     * <p>
     * The identifier of the collaboration that contains the audience generation job.
     * </p>
     * 
     * @param collaborationId
     *        The identifier of the collaboration that contains the audience generation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAudienceGenerationJobRequest withCollaborationId(String collaborationId) {
        setCollaborationId(collaborationId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model that is used for this audience generation job.
     * </p>
     * 
     * @param configuredAudienceModelArn
     *        The Amazon Resource Name (ARN) of the configured audience model that is used for this audience generation
     *        job.
     */

    public void setConfiguredAudienceModelArn(String configuredAudienceModelArn) {
        this.configuredAudienceModelArn = configuredAudienceModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model that is used for this audience generation job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the configured audience model that is used for this audience generation
     *         job.
     */

    public String getConfiguredAudienceModelArn() {
        return this.configuredAudienceModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configured audience model that is used for this audience generation job.
     * </p>
     * 
     * @param configuredAudienceModelArn
     *        The Amazon Resource Name (ARN) of the configured audience model that is used for this audience generation
     *        job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAudienceGenerationJobRequest withConfiguredAudienceModelArn(String configuredAudienceModelArn) {
        setConfiguredAudienceModelArn(configuredAudienceModelArn);
        return this;
    }

    /**
     * <p>
     * The description of the audience generation job.
     * </p>
     * 
     * @param description
     *        The description of the audience generation job.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the audience generation job.
     * </p>
     * 
     * @return The description of the audience generation job.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the audience generation job.
     * </p>
     * 
     * @param description
     *        The description of the audience generation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAudienceGenerationJobRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Whether the seed audience is included in the audience generation output.
     * </p>
     * 
     * @param includeSeedInOutput
     *        Whether the seed audience is included in the audience generation output.
     */

    public void setIncludeSeedInOutput(Boolean includeSeedInOutput) {
        this.includeSeedInOutput = includeSeedInOutput;
    }

    /**
     * <p>
     * Whether the seed audience is included in the audience generation output.
     * </p>
     * 
     * @return Whether the seed audience is included in the audience generation output.
     */

    public Boolean getIncludeSeedInOutput() {
        return this.includeSeedInOutput;
    }

    /**
     * <p>
     * Whether the seed audience is included in the audience generation output.
     * </p>
     * 
     * @param includeSeedInOutput
     *        Whether the seed audience is included in the audience generation output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAudienceGenerationJobRequest withIncludeSeedInOutput(Boolean includeSeedInOutput) {
        setIncludeSeedInOutput(includeSeedInOutput);
        return this;
    }

    /**
     * <p>
     * Whether the seed audience is included in the audience generation output.
     * </p>
     * 
     * @return Whether the seed audience is included in the audience generation output.
     */

    public Boolean isIncludeSeedInOutput() {
        return this.includeSeedInOutput;
    }

    /**
     * <p>
     * The name of the audience generation job.
     * </p>
     * 
     * @param name
     *        The name of the audience generation job.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the audience generation job.
     * </p>
     * 
     * @return The name of the audience generation job.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the audience generation job.
     * </p>
     * 
     * @param name
     *        The name of the audience generation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAudienceGenerationJobRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The seed audience that is used to generate the audience.
     * </p>
     * 
     * @param seedAudience
     *        The seed audience that is used to generate the audience.
     */

    public void setSeedAudience(AudienceGenerationJobDataSource seedAudience) {
        this.seedAudience = seedAudience;
    }

    /**
     * <p>
     * The seed audience that is used to generate the audience.
     * </p>
     * 
     * @return The seed audience that is used to generate the audience.
     */

    public AudienceGenerationJobDataSource getSeedAudience() {
        return this.seedAudience;
    }

    /**
     * <p>
     * The seed audience that is used to generate the audience.
     * </p>
     * 
     * @param seedAudience
     *        The seed audience that is used to generate the audience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAudienceGenerationJobRequest withSeedAudience(AudienceGenerationJobDataSource seedAudience) {
        setSeedAudience(seedAudience);
        return this;
    }

    /**
     * <p>
     * The optional metadata that you apply to the resource to help you categorize and organize them. Each tag consists
     * of a key and an optional value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources, remember that other services may have
     * restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable
     * in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for keys as it is reserved for
     * AWS use. You cannot edit or delete tag keys with this prefix. Values can have this prefix. If a tag value has aws
     * as its prefix but the key does not, then Clean Rooms ML considers it to be a user tag and will count against the
     * limit of 50 tags. Tags with only the key prefix of aws do not count against your tags per resource limit.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The optional metadata that you apply to the resource to help you categorize and organize them. Each tag
     *         consists of a key and an optional value, both of which you define.</p>
     *         <p>
     *         The following basic restrictions apply to tags:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Maximum number of tags per resource - 50.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For each resource, each tag key must be unique, and each tag key can have only one value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum key length - 128 Unicode characters in UTF-8.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum value length - 256 Unicode characters in UTF-8.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If your tagging schema is used across multiple services and resources, remember that other services may
     *         have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces
     *         representable in UTF-8, and the following characters: + - = . _ : / @.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Tag keys and values are case sensitive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for keys as it is
     *         reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can have this prefix.
     *         If a tag value has aws as its prefix but the key does not, then Clean Rooms ML considers it to be a user
     *         tag and will count against the limit of 50 tags. Tags with only the key prefix of aws do not count
     *         against your tags per resource limit.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The optional metadata that you apply to the resource to help you categorize and organize them. Each tag consists
     * of a key and an optional value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources, remember that other services may have
     * restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable
     * in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for keys as it is reserved for
     * AWS use. You cannot edit or delete tag keys with this prefix. Values can have this prefix. If a tag value has aws
     * as its prefix but the key does not, then Clean Rooms ML considers it to be a user tag and will count against the
     * limit of 50 tags. Tags with only the key prefix of aws do not count against your tags per resource limit.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        The optional metadata that you apply to the resource to help you categorize and organize them. Each tag
     *        consists of a key and an optional value, both of which you define.</p>
     *        <p>
     *        The following basic restrictions apply to tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Maximum number of tags per resource - 50.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For each resource, each tag key must be unique, and each tag key can have only one value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length - 128 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length - 256 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If your tagging schema is used across multiple services and resources, remember that other services may
     *        have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces
     *        representable in UTF-8, and the following characters: + - = . _ : / @.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tag keys and values are case sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for keys as it is
     *        reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can have this prefix. If
     *        a tag value has aws as its prefix but the key does not, then Clean Rooms ML considers it to be a user tag
     *        and will count against the limit of 50 tags. Tags with only the key prefix of aws do not count against
     *        your tags per resource limit.
     *        </p>
     *        </li>
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The optional metadata that you apply to the resource to help you categorize and organize them. Each tag consists
     * of a key and an optional value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources, remember that other services may have
     * restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable
     * in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for keys as it is reserved for
     * AWS use. You cannot edit or delete tag keys with this prefix. Values can have this prefix. If a tag value has aws
     * as its prefix but the key does not, then Clean Rooms ML considers it to be a user tag and will count against the
     * limit of 50 tags. Tags with only the key prefix of aws do not count against your tags per resource limit.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        The optional metadata that you apply to the resource to help you categorize and organize them. Each tag
     *        consists of a key and an optional value, both of which you define.</p>
     *        <p>
     *        The following basic restrictions apply to tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Maximum number of tags per resource - 50.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For each resource, each tag key must be unique, and each tag key can have only one value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length - 128 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length - 256 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If your tagging schema is used across multiple services and resources, remember that other services may
     *        have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces
     *        representable in UTF-8, and the following characters: + - = . _ : / @.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tag keys and values are case sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for keys as it is
     *        reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can have this prefix. If
     *        a tag value has aws as its prefix but the key does not, then Clean Rooms ML considers it to be a user tag
     *        and will count against the limit of 50 tags. Tags with only the key prefix of aws do not count against
     *        your tags per resource limit.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAudienceGenerationJobRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see StartAudienceGenerationJobRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartAudienceGenerationJobRequest addTagsEntry(String key, String value) {
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

    public StartAudienceGenerationJobRequest clearTagsEntries() {
        this.tags = null;
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
        if (getCollaborationId() != null)
            sb.append("CollaborationId: ").append(getCollaborationId()).append(",");
        if (getConfiguredAudienceModelArn() != null)
            sb.append("ConfiguredAudienceModelArn: ").append(getConfiguredAudienceModelArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getIncludeSeedInOutput() != null)
            sb.append("IncludeSeedInOutput: ").append(getIncludeSeedInOutput()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSeedAudience() != null)
            sb.append("SeedAudience: ").append(getSeedAudience()).append(",");
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

        if (obj instanceof StartAudienceGenerationJobRequest == false)
            return false;
        StartAudienceGenerationJobRequest other = (StartAudienceGenerationJobRequest) obj;
        if (other.getCollaborationId() == null ^ this.getCollaborationId() == null)
            return false;
        if (other.getCollaborationId() != null && other.getCollaborationId().equals(this.getCollaborationId()) == false)
            return false;
        if (other.getConfiguredAudienceModelArn() == null ^ this.getConfiguredAudienceModelArn() == null)
            return false;
        if (other.getConfiguredAudienceModelArn() != null && other.getConfiguredAudienceModelArn().equals(this.getConfiguredAudienceModelArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIncludeSeedInOutput() == null ^ this.getIncludeSeedInOutput() == null)
            return false;
        if (other.getIncludeSeedInOutput() != null && other.getIncludeSeedInOutput().equals(this.getIncludeSeedInOutput()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSeedAudience() == null ^ this.getSeedAudience() == null)
            return false;
        if (other.getSeedAudience() != null && other.getSeedAudience().equals(this.getSeedAudience()) == false)
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

        hashCode = prime * hashCode + ((getCollaborationId() == null) ? 0 : getCollaborationId().hashCode());
        hashCode = prime * hashCode + ((getConfiguredAudienceModelArn() == null) ? 0 : getConfiguredAudienceModelArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIncludeSeedInOutput() == null) ? 0 : getIncludeSeedInOutput().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSeedAudience() == null) ? 0 : getSeedAudience().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public StartAudienceGenerationJobRequest clone() {
        return (StartAudienceGenerationJobRequest) super.clone();
    }

}
