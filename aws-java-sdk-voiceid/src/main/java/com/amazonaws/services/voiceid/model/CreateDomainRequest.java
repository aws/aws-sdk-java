/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.voiceid.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/CreateDomain" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The idempotency token for creating a new domain. If not provided, Amazon Web Services SDK populates this field.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * A brief description of the domain.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the domain.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The configuration, containing the KMS key identifier, to be used by Voice ID for the server-side encryption of
     * your data. Refer to <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/encryption-at-rest.html#encryption-at-rest-voiceid">
     * Amazon Connect Voice ID encryption at rest</a> for more details on how the KMS key is used.
     * </p>
     */
    private ServerSideEncryptionConfiguration serverSideEncryptionConfiguration;
    /**
     * <p>
     * A list of tags you want added to the domain.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The idempotency token for creating a new domain. If not provided, Amazon Web Services SDK populates this field.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token for creating a new domain. If not provided, Amazon Web Services SDK populates this
     *        field.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency token for creating a new domain. If not provided, Amazon Web Services SDK populates this field.
     * </p>
     * 
     * @return The idempotency token for creating a new domain. If not provided, Amazon Web Services SDK populates this
     *         field.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The idempotency token for creating a new domain. If not provided, Amazon Web Services SDK populates this field.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token for creating a new domain. If not provided, Amazon Web Services SDK populates this
     *        field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * A brief description of the domain.
     * </p>
     * 
     * @param description
     *        A brief description of the domain.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A brief description of the domain.
     * </p>
     * 
     * @return A brief description of the domain.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A brief description of the domain.
     * </p>
     * 
     * @param description
     *        A brief description of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @param name
     *        The name of the domain.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @return The name of the domain.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @param name
     *        The name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The configuration, containing the KMS key identifier, to be used by Voice ID for the server-side encryption of
     * your data. Refer to <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/encryption-at-rest.html#encryption-at-rest-voiceid">
     * Amazon Connect Voice ID encryption at rest</a> for more details on how the KMS key is used.
     * </p>
     * 
     * @param serverSideEncryptionConfiguration
     *        The configuration, containing the KMS key identifier, to be used by Voice ID for the server-side
     *        encryption of your data. Refer to <a href=
     *        "https://docs.aws.amazon.com/connect/latest/adminguide/encryption-at-rest.html#encryption-at-rest-voiceid"
     *        > Amazon Connect Voice ID encryption at rest</a> for more details on how the KMS key is used.
     */

    public void setServerSideEncryptionConfiguration(ServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * The configuration, containing the KMS key identifier, to be used by Voice ID for the server-side encryption of
     * your data. Refer to <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/encryption-at-rest.html#encryption-at-rest-voiceid">
     * Amazon Connect Voice ID encryption at rest</a> for more details on how the KMS key is used.
     * </p>
     * 
     * @return The configuration, containing the KMS key identifier, to be used by Voice ID for the server-side
     *         encryption of your data. Refer to <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/encryption-at-rest.html#encryption-at-rest-voiceid"
     *         > Amazon Connect Voice ID encryption at rest</a> for more details on how the KMS key is used.
     */

    public ServerSideEncryptionConfiguration getServerSideEncryptionConfiguration() {
        return this.serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * The configuration, containing the KMS key identifier, to be used by Voice ID for the server-side encryption of
     * your data. Refer to <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/encryption-at-rest.html#encryption-at-rest-voiceid">
     * Amazon Connect Voice ID encryption at rest</a> for more details on how the KMS key is used.
     * </p>
     * 
     * @param serverSideEncryptionConfiguration
     *        The configuration, containing the KMS key identifier, to be used by Voice ID for the server-side
     *        encryption of your data. Refer to <a href=
     *        "https://docs.aws.amazon.com/connect/latest/adminguide/encryption-at-rest.html#encryption-at-rest-voiceid"
     *        > Amazon Connect Voice ID encryption at rest</a> for more details on how the KMS key is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withServerSideEncryptionConfiguration(ServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        setServerSideEncryptionConfiguration(serverSideEncryptionConfiguration);
        return this;
    }

    /**
     * <p>
     * A list of tags you want added to the domain.
     * </p>
     * 
     * @return A list of tags you want added to the domain.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags you want added to the domain.
     * </p>
     * 
     * @param tags
     *        A list of tags you want added to the domain.
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
     * A list of tags you want added to the domain.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags you want added to the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withTags(Tag... tags) {
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
     * A list of tags you want added to the domain.
     * </p>
     * 
     * @param tags
     *        A list of tags you want added to the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getServerSideEncryptionConfiguration() != null)
            sb.append("ServerSideEncryptionConfiguration: ").append(getServerSideEncryptionConfiguration()).append(",");
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

        if (obj instanceof CreateDomainRequest == false)
            return false;
        CreateDomainRequest other = (CreateDomainRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getServerSideEncryptionConfiguration() == null ^ this.getServerSideEncryptionConfiguration() == null)
            return false;
        if (other.getServerSideEncryptionConfiguration() != null
                && other.getServerSideEncryptionConfiguration().equals(this.getServerSideEncryptionConfiguration()) == false)
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

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getServerSideEncryptionConfiguration() == null) ? 0 : getServerSideEncryptionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDomainRequest clone() {
        return (CreateDomainRequest) super.clone();
    }

}
