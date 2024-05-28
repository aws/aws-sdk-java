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
package com.amazonaws.services.chimesdkvoice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateVoiceProfileDomain"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVoiceProfileDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the voice profile domain.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the voice profile domain.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The server-side encryption configuration for the request.
     * </p>
     */
    private ServerSideEncryptionConfiguration serverSideEncryptionConfiguration;
    /**
     * <p>
     * The unique identifier for the client request. Use a different token for different domain creation requests.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The tags assigned to the domain.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the voice profile domain.
     * </p>
     * 
     * @param name
     *        The name of the voice profile domain.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the voice profile domain.
     * </p>
     * 
     * @return The name of the voice profile domain.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the voice profile domain.
     * </p>
     * 
     * @param name
     *        The name of the voice profile domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVoiceProfileDomainRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the voice profile domain.
     * </p>
     * 
     * @param description
     *        A description of the voice profile domain.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the voice profile domain.
     * </p>
     * 
     * @return A description of the voice profile domain.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the voice profile domain.
     * </p>
     * 
     * @param description
     *        A description of the voice profile domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVoiceProfileDomainRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The server-side encryption configuration for the request.
     * </p>
     * 
     * @param serverSideEncryptionConfiguration
     *        The server-side encryption configuration for the request.
     */

    public void setServerSideEncryptionConfiguration(ServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * The server-side encryption configuration for the request.
     * </p>
     * 
     * @return The server-side encryption configuration for the request.
     */

    public ServerSideEncryptionConfiguration getServerSideEncryptionConfiguration() {
        return this.serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * The server-side encryption configuration for the request.
     * </p>
     * 
     * @param serverSideEncryptionConfiguration
     *        The server-side encryption configuration for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVoiceProfileDomainRequest withServerSideEncryptionConfiguration(ServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        setServerSideEncryptionConfiguration(serverSideEncryptionConfiguration);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the client request. Use a different token for different domain creation requests.
     * </p>
     * 
     * @param clientRequestToken
     *        The unique identifier for the client request. Use a different token for different domain creation
     *        requests.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The unique identifier for the client request. Use a different token for different domain creation requests.
     * </p>
     * 
     * @return The unique identifier for the client request. Use a different token for different domain creation
     *         requests.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * The unique identifier for the client request. Use a different token for different domain creation requests.
     * </p>
     * 
     * @param clientRequestToken
     *        The unique identifier for the client request. Use a different token for different domain creation
     *        requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVoiceProfileDomainRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The tags assigned to the domain.
     * </p>
     * 
     * @return The tags assigned to the domain.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the domain.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the domain.
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
     * The tags assigned to the domain.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVoiceProfileDomainRequest withTags(Tag... tags) {
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
     * The tags assigned to the domain.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVoiceProfileDomainRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getServerSideEncryptionConfiguration() != null)
            sb.append("ServerSideEncryptionConfiguration: ").append(getServerSideEncryptionConfiguration()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
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

        if (obj instanceof CreateVoiceProfileDomainRequest == false)
            return false;
        CreateVoiceProfileDomainRequest other = (CreateVoiceProfileDomainRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getServerSideEncryptionConfiguration() == null ^ this.getServerSideEncryptionConfiguration() == null)
            return false;
        if (other.getServerSideEncryptionConfiguration() != null
                && other.getServerSideEncryptionConfiguration().equals(this.getServerSideEncryptionConfiguration()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getServerSideEncryptionConfiguration() == null) ? 0 : getServerSideEncryptionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateVoiceProfileDomainRequest clone() {
        return (CreateVoiceProfileDomainRequest) super.clone();
    }

}
