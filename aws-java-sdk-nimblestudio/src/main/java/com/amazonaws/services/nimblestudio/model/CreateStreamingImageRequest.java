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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A collection of streaming images.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/CreateStreamingImage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateStreamingImageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * To make an idempotent API request using one of these actions, specify a client token in the request. You should
     * not reuse the same client token for other API requests. If you retry a request that completed successfully using
     * the same client token and the same parameters, the retry succeeds without performing any further actions. If you
     * retry a successful request using the same client token, but one or more of the parameters are different, the
     * retry fails with a ValidationException error.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * A human-readable description of the streaming image.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of an EC2 machine image with which to create this streaming image.
     * </p>
     */
    private String ec2ImageId;
    /**
     * <p>
     * A friendly name for a streaming image resource.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The studio ID.
     * </p>
     */
    private String studioId;
    /**
     * <p>
     * A collection of labels, in the form of key:value pairs, that apply to this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * To make an idempotent API request using one of these actions, specify a client token in the request. You should
     * not reuse the same client token for other API requests. If you retry a request that completed successfully using
     * the same client token and the same parameters, the retry succeeds without performing any further actions. If you
     * retry a successful request using the same client token, but one or more of the parameters are different, the
     * retry fails with a ValidationException error.
     * </p>
     * 
     * @param clientToken
     *        To make an idempotent API request using one of these actions, specify a client token in the request. You
     *        should not reuse the same client token for other API requests. If you retry a request that completed
     *        successfully using the same client token and the same parameters, the retry succeeds without performing
     *        any further actions. If you retry a successful request using the same client token, but one or more of the
     *        parameters are different, the retry fails with a ValidationException error.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * To make an idempotent API request using one of these actions, specify a client token in the request. You should
     * not reuse the same client token for other API requests. If you retry a request that completed successfully using
     * the same client token and the same parameters, the retry succeeds without performing any further actions. If you
     * retry a successful request using the same client token, but one or more of the parameters are different, the
     * retry fails with a ValidationException error.
     * </p>
     * 
     * @return To make an idempotent API request using one of these actions, specify a client token in the request. You
     *         should not reuse the same client token for other API requests. If you retry a request that completed
     *         successfully using the same client token and the same parameters, the retry succeeds without performing
     *         any further actions. If you retry a successful request using the same client token, but one or more of
     *         the parameters are different, the retry fails with a ValidationException error.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * To make an idempotent API request using one of these actions, specify a client token in the request. You should
     * not reuse the same client token for other API requests. If you retry a request that completed successfully using
     * the same client token and the same parameters, the retry succeeds without performing any further actions. If you
     * retry a successful request using the same client token, but one or more of the parameters are different, the
     * retry fails with a ValidationException error.
     * </p>
     * 
     * @param clientToken
     *        To make an idempotent API request using one of these actions, specify a client token in the request. You
     *        should not reuse the same client token for other API requests. If you retry a request that completed
     *        successfully using the same client token and the same parameters, the retry succeeds without performing
     *        any further actions. If you retry a successful request using the same client token, but one or more of the
     *        parameters are different, the retry fails with a ValidationException error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamingImageRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * A human-readable description of the streaming image.
     * </p>
     * 
     * @param description
     *        A human-readable description of the streaming image.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A human-readable description of the streaming image.
     * </p>
     * 
     * @return A human-readable description of the streaming image.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A human-readable description of the streaming image.
     * </p>
     * 
     * @param description
     *        A human-readable description of the streaming image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamingImageRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of an EC2 machine image with which to create this streaming image.
     * </p>
     * 
     * @param ec2ImageId
     *        The ID of an EC2 machine image with which to create this streaming image.
     */

    public void setEc2ImageId(String ec2ImageId) {
        this.ec2ImageId = ec2ImageId;
    }

    /**
     * <p>
     * The ID of an EC2 machine image with which to create this streaming image.
     * </p>
     * 
     * @return The ID of an EC2 machine image with which to create this streaming image.
     */

    public String getEc2ImageId() {
        return this.ec2ImageId;
    }

    /**
     * <p>
     * The ID of an EC2 machine image with which to create this streaming image.
     * </p>
     * 
     * @param ec2ImageId
     *        The ID of an EC2 machine image with which to create this streaming image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamingImageRequest withEc2ImageId(String ec2ImageId) {
        setEc2ImageId(ec2ImageId);
        return this;
    }

    /**
     * <p>
     * A friendly name for a streaming image resource.
     * </p>
     * 
     * @param name
     *        A friendly name for a streaming image resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name for a streaming image resource.
     * </p>
     * 
     * @return A friendly name for a streaming image resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A friendly name for a streaming image resource.
     * </p>
     * 
     * @param name
     *        A friendly name for a streaming image resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamingImageRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The studio ID.
     * </p>
     * 
     * @param studioId
     *        The studio ID.
     */

    public void setStudioId(String studioId) {
        this.studioId = studioId;
    }

    /**
     * <p>
     * The studio ID.
     * </p>
     * 
     * @return The studio ID.
     */

    public String getStudioId() {
        return this.studioId;
    }

    /**
     * <p>
     * The studio ID.
     * </p>
     * 
     * @param studioId
     *        The studio ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamingImageRequest withStudioId(String studioId) {
        setStudioId(studioId);
        return this;
    }

    /**
     * <p>
     * A collection of labels, in the form of key:value pairs, that apply to this resource.
     * </p>
     * 
     * @return A collection of labels, in the form of key:value pairs, that apply to this resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A collection of labels, in the form of key:value pairs, that apply to this resource.
     * </p>
     * 
     * @param tags
     *        A collection of labels, in the form of key:value pairs, that apply to this resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A collection of labels, in the form of key:value pairs, that apply to this resource.
     * </p>
     * 
     * @param tags
     *        A collection of labels, in the form of key:value pairs, that apply to this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamingImageRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateStreamingImageRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamingImageRequest addTagsEntry(String key, String value) {
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

    public CreateStreamingImageRequest clearTagsEntries() {
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEc2ImageId() != null)
            sb.append("Ec2ImageId: ").append(getEc2ImageId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStudioId() != null)
            sb.append("StudioId: ").append(getStudioId()).append(",");
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

        if (obj instanceof CreateStreamingImageRequest == false)
            return false;
        CreateStreamingImageRequest other = (CreateStreamingImageRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEc2ImageId() == null ^ this.getEc2ImageId() == null)
            return false;
        if (other.getEc2ImageId() != null && other.getEc2ImageId().equals(this.getEc2ImageId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStudioId() == null ^ this.getStudioId() == null)
            return false;
        if (other.getStudioId() != null && other.getStudioId().equals(this.getStudioId()) == false)
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
        hashCode = prime * hashCode + ((getEc2ImageId() == null) ? 0 : getEc2ImageId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStudioId() == null) ? 0 : getStudioId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateStreamingImageRequest clone() {
        return (CreateStreamingImageRequest) super.clone();
    }

}
