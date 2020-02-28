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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateComponent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateComponentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the component.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The semantic version of the component. This version follows the semantic version syntax. For example,
     * major.minor.patch. This could be versioned like software (2.0.1) or like a date (2019.12.01).
     * </p>
     */
    private String semanticVersion;
    /**
     * <p>
     * The description of the component. Describes the contents of the component.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The change description of the component. Describes what change has been made in this version, or what makes this
     * version different from other versions of this component.
     * </p>
     */
    private String changeDescription;
    /**
     * <p>
     * The platform of the component.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The data of the component. Used to specify the data inline. Either <code>data</code> or <code>uri</code> can be
     * used to specify the data within the component.
     * </p>
     */
    private String data;
    /**
     * <p>
     * The uri of the component. Must be an S3 URL and the requester must have permission to access the S3 bucket. If
     * you use S3, you can specify component content up to your service quota. Either <code>data</code> or
     * <code>uri</code> can be used to specify the data within the component.
     * </p>
     */
    private String uri;
    /**
     * <p>
     * The ID of the KMS key that should be used to encrypt this component.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The tags of the component.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The idempotency token of the component.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @param name
     *        The name of the component.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @return The name of the component.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @param name
     *        The name of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateComponentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The semantic version of the component. This version follows the semantic version syntax. For example,
     * major.minor.patch. This could be versioned like software (2.0.1) or like a date (2019.12.01).
     * </p>
     * 
     * @param semanticVersion
     *        The semantic version of the component. This version follows the semantic version syntax. For example,
     *        major.minor.patch. This could be versioned like software (2.0.1) or like a date (2019.12.01).
     */

    public void setSemanticVersion(String semanticVersion) {
        this.semanticVersion = semanticVersion;
    }

    /**
     * <p>
     * The semantic version of the component. This version follows the semantic version syntax. For example,
     * major.minor.patch. This could be versioned like software (2.0.1) or like a date (2019.12.01).
     * </p>
     * 
     * @return The semantic version of the component. This version follows the semantic version syntax. For example,
     *         major.minor.patch. This could be versioned like software (2.0.1) or like a date (2019.12.01).
     */

    public String getSemanticVersion() {
        return this.semanticVersion;
    }

    /**
     * <p>
     * The semantic version of the component. This version follows the semantic version syntax. For example,
     * major.minor.patch. This could be versioned like software (2.0.1) or like a date (2019.12.01).
     * </p>
     * 
     * @param semanticVersion
     *        The semantic version of the component. This version follows the semantic version syntax. For example,
     *        major.minor.patch. This could be versioned like software (2.0.1) or like a date (2019.12.01).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateComponentRequest withSemanticVersion(String semanticVersion) {
        setSemanticVersion(semanticVersion);
        return this;
    }

    /**
     * <p>
     * The description of the component. Describes the contents of the component.
     * </p>
     * 
     * @param description
     *        The description of the component. Describes the contents of the component.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the component. Describes the contents of the component.
     * </p>
     * 
     * @return The description of the component. Describes the contents of the component.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the component. Describes the contents of the component.
     * </p>
     * 
     * @param description
     *        The description of the component. Describes the contents of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateComponentRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The change description of the component. Describes what change has been made in this version, or what makes this
     * version different from other versions of this component.
     * </p>
     * 
     * @param changeDescription
     *        The change description of the component. Describes what change has been made in this version, or what
     *        makes this version different from other versions of this component.
     */

    public void setChangeDescription(String changeDescription) {
        this.changeDescription = changeDescription;
    }

    /**
     * <p>
     * The change description of the component. Describes what change has been made in this version, or what makes this
     * version different from other versions of this component.
     * </p>
     * 
     * @return The change description of the component. Describes what change has been made in this version, or what
     *         makes this version different from other versions of this component.
     */

    public String getChangeDescription() {
        return this.changeDescription;
    }

    /**
     * <p>
     * The change description of the component. Describes what change has been made in this version, or what makes this
     * version different from other versions of this component.
     * </p>
     * 
     * @param changeDescription
     *        The change description of the component. Describes what change has been made in this version, or what
     *        makes this version different from other versions of this component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateComponentRequest withChangeDescription(String changeDescription) {
        setChangeDescription(changeDescription);
        return this;
    }

    /**
     * <p>
     * The platform of the component.
     * </p>
     * 
     * @param platform
     *        The platform of the component.
     * @see Platform
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The platform of the component.
     * </p>
     * 
     * @return The platform of the component.
     * @see Platform
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The platform of the component.
     * </p>
     * 
     * @param platform
     *        The platform of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public CreateComponentRequest withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The platform of the component.
     * </p>
     * 
     * @param platform
     *        The platform of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public CreateComponentRequest withPlatform(Platform platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * <p>
     * The data of the component. Used to specify the data inline. Either <code>data</code> or <code>uri</code> can be
     * used to specify the data within the component.
     * </p>
     * 
     * @param data
     *        The data of the component. Used to specify the data inline. Either <code>data</code> or <code>uri</code>
     *        can be used to specify the data within the component.
     */

    public void setData(String data) {
        this.data = data;
    }

    /**
     * <p>
     * The data of the component. Used to specify the data inline. Either <code>data</code> or <code>uri</code> can be
     * used to specify the data within the component.
     * </p>
     * 
     * @return The data of the component. Used to specify the data inline. Either <code>data</code> or <code>uri</code>
     *         can be used to specify the data within the component.
     */

    public String getData() {
        return this.data;
    }

    /**
     * <p>
     * The data of the component. Used to specify the data inline. Either <code>data</code> or <code>uri</code> can be
     * used to specify the data within the component.
     * </p>
     * 
     * @param data
     *        The data of the component. Used to specify the data inline. Either <code>data</code> or <code>uri</code>
     *        can be used to specify the data within the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateComponentRequest withData(String data) {
        setData(data);
        return this;
    }

    /**
     * <p>
     * The uri of the component. Must be an S3 URL and the requester must have permission to access the S3 bucket. If
     * you use S3, you can specify component content up to your service quota. Either <code>data</code> or
     * <code>uri</code> can be used to specify the data within the component.
     * </p>
     * 
     * @param uri
     *        The uri of the component. Must be an S3 URL and the requester must have permission to access the S3
     *        bucket. If you use S3, you can specify component content up to your service quota. Either
     *        <code>data</code> or <code>uri</code> can be used to specify the data within the component.
     */

    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * <p>
     * The uri of the component. Must be an S3 URL and the requester must have permission to access the S3 bucket. If
     * you use S3, you can specify component content up to your service quota. Either <code>data</code> or
     * <code>uri</code> can be used to specify the data within the component.
     * </p>
     * 
     * @return The uri of the component. Must be an S3 URL and the requester must have permission to access the S3
     *         bucket. If you use S3, you can specify component content up to your service quota. Either
     *         <code>data</code> or <code>uri</code> can be used to specify the data within the component.
     */

    public String getUri() {
        return this.uri;
    }

    /**
     * <p>
     * The uri of the component. Must be an S3 URL and the requester must have permission to access the S3 bucket. If
     * you use S3, you can specify component content up to your service quota. Either <code>data</code> or
     * <code>uri</code> can be used to specify the data within the component.
     * </p>
     * 
     * @param uri
     *        The uri of the component. Must be an S3 URL and the requester must have permission to access the S3
     *        bucket. If you use S3, you can specify component content up to your service quota. Either
     *        <code>data</code> or <code>uri</code> can be used to specify the data within the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateComponentRequest withUri(String uri) {
        setUri(uri);
        return this;
    }

    /**
     * <p>
     * The ID of the KMS key that should be used to encrypt this component.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the KMS key that should be used to encrypt this component.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of the KMS key that should be used to encrypt this component.
     * </p>
     * 
     * @return The ID of the KMS key that should be used to encrypt this component.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The ID of the KMS key that should be used to encrypt this component.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the KMS key that should be used to encrypt this component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateComponentRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The tags of the component.
     * </p>
     * 
     * @return The tags of the component.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags of the component.
     * </p>
     * 
     * @param tags
     *        The tags of the component.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags of the component.
     * </p>
     * 
     * @param tags
     *        The tags of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateComponentRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateComponentRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateComponentRequest addTagsEntry(String key, String value) {
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

    public CreateComponentRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The idempotency token of the component.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token of the component.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency token of the component.
     * </p>
     * 
     * @return The idempotency token of the component.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The idempotency token of the component.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateComponentRequest withClientToken(String clientToken) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSemanticVersion() != null)
            sb.append("SemanticVersion: ").append(getSemanticVersion()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getChangeDescription() != null)
            sb.append("ChangeDescription: ").append(getChangeDescription()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getData() != null)
            sb.append("Data: ").append(getData()).append(",");
        if (getUri() != null)
            sb.append("Uri: ").append(getUri()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof CreateComponentRequest == false)
            return false;
        CreateComponentRequest other = (CreateComponentRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSemanticVersion() == null ^ this.getSemanticVersion() == null)
            return false;
        if (other.getSemanticVersion() != null && other.getSemanticVersion().equals(this.getSemanticVersion()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getChangeDescription() == null ^ this.getChangeDescription() == null)
            return false;
        if (other.getChangeDescription() != null && other.getChangeDescription().equals(this.getChangeDescription()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        if (other.getUri() == null ^ this.getUri() == null)
            return false;
        if (other.getUri() != null && other.getUri().equals(this.getUri()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSemanticVersion() == null) ? 0 : getSemanticVersion().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getChangeDescription() == null) ? 0 : getChangeDescription().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        hashCode = prime * hashCode + ((getUri() == null) ? 0 : getUri().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateComponentRequest clone() {
        return (CreateComponentRequest) super.clone();
    }

}
