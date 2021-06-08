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
package com.amazonaws.services.appconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/CreateHostedConfigurationVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateHostedConfigurationVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The application ID.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The configuration profile ID.
     * </p>
     */
    private String configurationProfileId;
    /**
     * <p>
     * The configuration version.
     * </p>
     */
    private Integer versionNumber;
    /**
     * <p>
     * A description of the configuration.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The content of the configuration or the configuration data.
     * </p>
     */
    private java.nio.ByteBuffer content;
    /**
     * <p>
     * A standard MIME type describing the format of the configuration content. For more information, see <a
     * href="https://docs.aws.amazon.com/https:/www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17"
     * >Content-Type</a>.
     * </p>
     */
    private String contentType;

    /**
     * <p>
     * The application ID.
     * </p>
     * 
     * @param applicationId
     *        The application ID.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The application ID.
     * </p>
     * 
     * @return The application ID.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The application ID.
     * </p>
     * 
     * @param applicationId
     *        The application ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHostedConfigurationVersionResult withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The configuration profile ID.
     * </p>
     * 
     * @param configurationProfileId
     *        The configuration profile ID.
     */

    public void setConfigurationProfileId(String configurationProfileId) {
        this.configurationProfileId = configurationProfileId;
    }

    /**
     * <p>
     * The configuration profile ID.
     * </p>
     * 
     * @return The configuration profile ID.
     */

    public String getConfigurationProfileId() {
        return this.configurationProfileId;
    }

    /**
     * <p>
     * The configuration profile ID.
     * </p>
     * 
     * @param configurationProfileId
     *        The configuration profile ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHostedConfigurationVersionResult withConfigurationProfileId(String configurationProfileId) {
        setConfigurationProfileId(configurationProfileId);
        return this;
    }

    /**
     * <p>
     * The configuration version.
     * </p>
     * 
     * @param versionNumber
     *        The configuration version.
     */

    public void setVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * <p>
     * The configuration version.
     * </p>
     * 
     * @return The configuration version.
     */

    public Integer getVersionNumber() {
        return this.versionNumber;
    }

    /**
     * <p>
     * The configuration version.
     * </p>
     * 
     * @param versionNumber
     *        The configuration version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHostedConfigurationVersionResult withVersionNumber(Integer versionNumber) {
        setVersionNumber(versionNumber);
        return this;
    }

    /**
     * <p>
     * A description of the configuration.
     * </p>
     * 
     * @param description
     *        A description of the configuration.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the configuration.
     * </p>
     * 
     * @return A description of the configuration.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the configuration.
     * </p>
     * 
     * @param description
     *        A description of the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHostedConfigurationVersionResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The content of the configuration or the configuration data.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param content
     *        The content of the configuration or the configuration data.
     */

    public void setContent(java.nio.ByteBuffer content) {
        this.content = content;
    }

    /**
     * <p>
     * The content of the configuration or the configuration data.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The content of the configuration or the configuration data.
     */

    public java.nio.ByteBuffer getContent() {
        return this.content;
    }

    /**
     * <p>
     * The content of the configuration or the configuration data.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param content
     *        The content of the configuration or the configuration data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHostedConfigurationVersionResult withContent(java.nio.ByteBuffer content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * A standard MIME type describing the format of the configuration content. For more information, see <a
     * href="https://docs.aws.amazon.com/https:/www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17"
     * >Content-Type</a>.
     * </p>
     * 
     * @param contentType
     *        A standard MIME type describing the format of the configuration content. For more information, see <a
     *        href=
     *        "https://docs.aws.amazon.com/https:/www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17">Content-
     *        Type</a>.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * A standard MIME type describing the format of the configuration content. For more information, see <a
     * href="https://docs.aws.amazon.com/https:/www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17"
     * >Content-Type</a>.
     * </p>
     * 
     * @return A standard MIME type describing the format of the configuration content. For more information, see <a
     *         href
     *         ="https://docs.aws.amazon.com/https:/www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17">Content
     *         -Type</a>.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * A standard MIME type describing the format of the configuration content. For more information, see <a
     * href="https://docs.aws.amazon.com/https:/www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17"
     * >Content-Type</a>.
     * </p>
     * 
     * @param contentType
     *        A standard MIME type describing the format of the configuration content. For more information, see <a
     *        href=
     *        "https://docs.aws.amazon.com/https:/www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17">Content-
     *        Type</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHostedConfigurationVersionResult withContentType(String contentType) {
        setContentType(contentType);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getConfigurationProfileId() != null)
            sb.append("ConfigurationProfileId: ").append(getConfigurationProfileId()).append(",");
        if (getVersionNumber() != null)
            sb.append("VersionNumber: ").append(getVersionNumber()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append("***Sensitive Data Redacted***").append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateHostedConfigurationVersionResult == false)
            return false;
        CreateHostedConfigurationVersionResult other = (CreateHostedConfigurationVersionResult) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getConfigurationProfileId() == null ^ this.getConfigurationProfileId() == null)
            return false;
        if (other.getConfigurationProfileId() != null && other.getConfigurationProfileId().equals(this.getConfigurationProfileId()) == false)
            return false;
        if (other.getVersionNumber() == null ^ this.getVersionNumber() == null)
            return false;
        if (other.getVersionNumber() != null && other.getVersionNumber().equals(this.getVersionNumber()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getConfigurationProfileId() == null) ? 0 : getConfigurationProfileId().hashCode());
        hashCode = prime * hashCode + ((getVersionNumber() == null) ? 0 : getVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        return hashCode;
    }

    @Override
    public CreateHostedConfigurationVersionResult clone() {
        try {
            return (CreateHostedConfigurationVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
