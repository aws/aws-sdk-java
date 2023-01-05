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
package com.amazonaws.services.appconfigdata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfigdata-2021-11-11/GetLatestConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLatestConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The latest token describing the current state of the configuration session. This MUST be provided to the next
     * call to <code>GetLatestConfiguration.</code>
     * </p>
     */
    private String nextPollConfigurationToken;
    /**
     * <p>
     * The amount of time the client should wait before polling for configuration updates again. Use
     * <code>RequiredMinimumPollIntervalInSeconds</code> to set the desired poll interval.
     * </p>
     */
    private Integer nextPollIntervalInSeconds;
    /**
     * <p>
     * A standard MIME type describing the format of the configuration content.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * The data of the configuration. This may be empty if the client already has the latest version of configuration.
     * </p>
     */
    private java.nio.ByteBuffer configuration;

    /**
     * <p>
     * The latest token describing the current state of the configuration session. This MUST be provided to the next
     * call to <code>GetLatestConfiguration.</code>
     * </p>
     * 
     * @param nextPollConfigurationToken
     *        The latest token describing the current state of the configuration session. This MUST be provided to the
     *        next call to <code>GetLatestConfiguration.</code>
     */

    public void setNextPollConfigurationToken(String nextPollConfigurationToken) {
        this.nextPollConfigurationToken = nextPollConfigurationToken;
    }

    /**
     * <p>
     * The latest token describing the current state of the configuration session. This MUST be provided to the next
     * call to <code>GetLatestConfiguration.</code>
     * </p>
     * 
     * @return The latest token describing the current state of the configuration session. This MUST be provided to the
     *         next call to <code>GetLatestConfiguration.</code>
     */

    public String getNextPollConfigurationToken() {
        return this.nextPollConfigurationToken;
    }

    /**
     * <p>
     * The latest token describing the current state of the configuration session. This MUST be provided to the next
     * call to <code>GetLatestConfiguration.</code>
     * </p>
     * 
     * @param nextPollConfigurationToken
     *        The latest token describing the current state of the configuration session. This MUST be provided to the
     *        next call to <code>GetLatestConfiguration.</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLatestConfigurationResult withNextPollConfigurationToken(String nextPollConfigurationToken) {
        setNextPollConfigurationToken(nextPollConfigurationToken);
        return this;
    }

    /**
     * <p>
     * The amount of time the client should wait before polling for configuration updates again. Use
     * <code>RequiredMinimumPollIntervalInSeconds</code> to set the desired poll interval.
     * </p>
     * 
     * @param nextPollIntervalInSeconds
     *        The amount of time the client should wait before polling for configuration updates again. Use
     *        <code>RequiredMinimumPollIntervalInSeconds</code> to set the desired poll interval.
     */

    public void setNextPollIntervalInSeconds(Integer nextPollIntervalInSeconds) {
        this.nextPollIntervalInSeconds = nextPollIntervalInSeconds;
    }

    /**
     * <p>
     * The amount of time the client should wait before polling for configuration updates again. Use
     * <code>RequiredMinimumPollIntervalInSeconds</code> to set the desired poll interval.
     * </p>
     * 
     * @return The amount of time the client should wait before polling for configuration updates again. Use
     *         <code>RequiredMinimumPollIntervalInSeconds</code> to set the desired poll interval.
     */

    public Integer getNextPollIntervalInSeconds() {
        return this.nextPollIntervalInSeconds;
    }

    /**
     * <p>
     * The amount of time the client should wait before polling for configuration updates again. Use
     * <code>RequiredMinimumPollIntervalInSeconds</code> to set the desired poll interval.
     * </p>
     * 
     * @param nextPollIntervalInSeconds
     *        The amount of time the client should wait before polling for configuration updates again. Use
     *        <code>RequiredMinimumPollIntervalInSeconds</code> to set the desired poll interval.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLatestConfigurationResult withNextPollIntervalInSeconds(Integer nextPollIntervalInSeconds) {
        setNextPollIntervalInSeconds(nextPollIntervalInSeconds);
        return this;
    }

    /**
     * <p>
     * A standard MIME type describing the format of the configuration content.
     * </p>
     * 
     * @param contentType
     *        A standard MIME type describing the format of the configuration content.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * A standard MIME type describing the format of the configuration content.
     * </p>
     * 
     * @return A standard MIME type describing the format of the configuration content.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * A standard MIME type describing the format of the configuration content.
     * </p>
     * 
     * @param contentType
     *        A standard MIME type describing the format of the configuration content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLatestConfigurationResult withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The data of the configuration. This may be empty if the client already has the latest version of configuration.
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
     * @param configuration
     *        The data of the configuration. This may be empty if the client already has the latest version of
     *        configuration.
     */

    public void setConfiguration(java.nio.ByteBuffer configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The data of the configuration. This may be empty if the client already has the latest version of configuration.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The data of the configuration. This may be empty if the client already has the latest version of
     *         configuration.
     */

    public java.nio.ByteBuffer getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The data of the configuration. This may be empty if the client already has the latest version of configuration.
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
     * @param configuration
     *        The data of the configuration. This may be empty if the client already has the latest version of
     *        configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLatestConfigurationResult withConfiguration(java.nio.ByteBuffer configuration) {
        setConfiguration(configuration);
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
        if (getNextPollConfigurationToken() != null)
            sb.append("NextPollConfigurationToken: ").append(getNextPollConfigurationToken()).append(",");
        if (getNextPollIntervalInSeconds() != null)
            sb.append("NextPollIntervalInSeconds: ").append(getNextPollIntervalInSeconds()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLatestConfigurationResult == false)
            return false;
        GetLatestConfigurationResult other = (GetLatestConfigurationResult) obj;
        if (other.getNextPollConfigurationToken() == null ^ this.getNextPollConfigurationToken() == null)
            return false;
        if (other.getNextPollConfigurationToken() != null && other.getNextPollConfigurationToken().equals(this.getNextPollConfigurationToken()) == false)
            return false;
        if (other.getNextPollIntervalInSeconds() == null ^ this.getNextPollIntervalInSeconds() == null)
            return false;
        if (other.getNextPollIntervalInSeconds() != null && other.getNextPollIntervalInSeconds().equals(this.getNextPollIntervalInSeconds()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextPollConfigurationToken() == null) ? 0 : getNextPollConfigurationToken().hashCode());
        hashCode = prime * hashCode + ((getNextPollIntervalInSeconds() == null) ? 0 : getNextPollIntervalInSeconds().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public GetLatestConfigurationResult clone() {
        try {
            return (GetLatestConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
