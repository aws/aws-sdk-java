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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/CreateStreamingSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateStreamingSessionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t specify
     * a client token, the Amazon Web Services SDK automatically generates a client token and uses it for the request to
     * ensure idempotency.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The EC2 Instance type used for the streaming session.
     * </p>
     */
    private String ec2InstanceType;
    /**
     * <p>
     * The ID of the launch profile used to control access from the streaming session.
     * </p>
     */
    private String launchProfileId;
    /**
     * <p>
     * The user ID of the user that owns the streaming session. The user that owns the session will be logging into the
     * session and interacting with the virtual workstation.
     * </p>
     */
    private String ownedBy;
    /**
     * <p>
     * The ID of the streaming image.
     * </p>
     */
    private String streamingImageId;
    /**
     * <p>
     * The studio ID.
     * </p>
     */
    private String studioId;
    /**
     * <p>
     * A collection of labels, in the form of key-value pairs, that apply to this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t specify
     * a client token, the Amazon Web Services SDK automatically generates a client token and uses it for the request to
     * ensure idempotency.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t
     *        specify a client token, the Amazon Web Services SDK automatically generates a client token and uses it for
     *        the request to ensure idempotency.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t specify
     * a client token, the Amazon Web Services SDK automatically generates a client token and uses it for the request to
     * ensure idempotency.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t
     *         specify a client token, the Amazon Web Services SDK automatically generates a client token and uses it
     *         for the request to ensure idempotency.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t specify
     * a client token, the Amazon Web Services SDK automatically generates a client token and uses it for the request to
     * ensure idempotency.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t
     *        specify a client token, the Amazon Web Services SDK automatically generates a client token and uses it for
     *        the request to ensure idempotency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamingSessionRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The EC2 Instance type used for the streaming session.
     * </p>
     * 
     * @param ec2InstanceType
     *        The EC2 Instance type used for the streaming session.
     * @see StreamingInstanceType
     */

    public void setEc2InstanceType(String ec2InstanceType) {
        this.ec2InstanceType = ec2InstanceType;
    }

    /**
     * <p>
     * The EC2 Instance type used for the streaming session.
     * </p>
     * 
     * @return The EC2 Instance type used for the streaming session.
     * @see StreamingInstanceType
     */

    public String getEc2InstanceType() {
        return this.ec2InstanceType;
    }

    /**
     * <p>
     * The EC2 Instance type used for the streaming session.
     * </p>
     * 
     * @param ec2InstanceType
     *        The EC2 Instance type used for the streaming session.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamingInstanceType
     */

    public CreateStreamingSessionRequest withEc2InstanceType(String ec2InstanceType) {
        setEc2InstanceType(ec2InstanceType);
        return this;
    }

    /**
     * <p>
     * The EC2 Instance type used for the streaming session.
     * </p>
     * 
     * @param ec2InstanceType
     *        The EC2 Instance type used for the streaming session.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamingInstanceType
     */

    public CreateStreamingSessionRequest withEc2InstanceType(StreamingInstanceType ec2InstanceType) {
        this.ec2InstanceType = ec2InstanceType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the launch profile used to control access from the streaming session.
     * </p>
     * 
     * @param launchProfileId
     *        The ID of the launch profile used to control access from the streaming session.
     */

    public void setLaunchProfileId(String launchProfileId) {
        this.launchProfileId = launchProfileId;
    }

    /**
     * <p>
     * The ID of the launch profile used to control access from the streaming session.
     * </p>
     * 
     * @return The ID of the launch profile used to control access from the streaming session.
     */

    public String getLaunchProfileId() {
        return this.launchProfileId;
    }

    /**
     * <p>
     * The ID of the launch profile used to control access from the streaming session.
     * </p>
     * 
     * @param launchProfileId
     *        The ID of the launch profile used to control access from the streaming session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamingSessionRequest withLaunchProfileId(String launchProfileId) {
        setLaunchProfileId(launchProfileId);
        return this;
    }

    /**
     * <p>
     * The user ID of the user that owns the streaming session. The user that owns the session will be logging into the
     * session and interacting with the virtual workstation.
     * </p>
     * 
     * @param ownedBy
     *        The user ID of the user that owns the streaming session. The user that owns the session will be logging
     *        into the session and interacting with the virtual workstation.
     */

    public void setOwnedBy(String ownedBy) {
        this.ownedBy = ownedBy;
    }

    /**
     * <p>
     * The user ID of the user that owns the streaming session. The user that owns the session will be logging into the
     * session and interacting with the virtual workstation.
     * </p>
     * 
     * @return The user ID of the user that owns the streaming session. The user that owns the session will be logging
     *         into the session and interacting with the virtual workstation.
     */

    public String getOwnedBy() {
        return this.ownedBy;
    }

    /**
     * <p>
     * The user ID of the user that owns the streaming session. The user that owns the session will be logging into the
     * session and interacting with the virtual workstation.
     * </p>
     * 
     * @param ownedBy
     *        The user ID of the user that owns the streaming session. The user that owns the session will be logging
     *        into the session and interacting with the virtual workstation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamingSessionRequest withOwnedBy(String ownedBy) {
        setOwnedBy(ownedBy);
        return this;
    }

    /**
     * <p>
     * The ID of the streaming image.
     * </p>
     * 
     * @param streamingImageId
     *        The ID of the streaming image.
     */

    public void setStreamingImageId(String streamingImageId) {
        this.streamingImageId = streamingImageId;
    }

    /**
     * <p>
     * The ID of the streaming image.
     * </p>
     * 
     * @return The ID of the streaming image.
     */

    public String getStreamingImageId() {
        return this.streamingImageId;
    }

    /**
     * <p>
     * The ID of the streaming image.
     * </p>
     * 
     * @param streamingImageId
     *        The ID of the streaming image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamingSessionRequest withStreamingImageId(String streamingImageId) {
        setStreamingImageId(streamingImageId);
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

    public CreateStreamingSessionRequest withStudioId(String studioId) {
        setStudioId(studioId);
        return this;
    }

    /**
     * <p>
     * A collection of labels, in the form of key-value pairs, that apply to this resource.
     * </p>
     * 
     * @return A collection of labels, in the form of key-value pairs, that apply to this resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A collection of labels, in the form of key-value pairs, that apply to this resource.
     * </p>
     * 
     * @param tags
     *        A collection of labels, in the form of key-value pairs, that apply to this resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A collection of labels, in the form of key-value pairs, that apply to this resource.
     * </p>
     * 
     * @param tags
     *        A collection of labels, in the form of key-value pairs, that apply to this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamingSessionRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateStreamingSessionRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamingSessionRequest addTagsEntry(String key, String value) {
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

    public CreateStreamingSessionRequest clearTagsEntries() {
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
        if (getEc2InstanceType() != null)
            sb.append("Ec2InstanceType: ").append(getEc2InstanceType()).append(",");
        if (getLaunchProfileId() != null)
            sb.append("LaunchProfileId: ").append(getLaunchProfileId()).append(",");
        if (getOwnedBy() != null)
            sb.append("OwnedBy: ").append(getOwnedBy()).append(",");
        if (getStreamingImageId() != null)
            sb.append("StreamingImageId: ").append(getStreamingImageId()).append(",");
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

        if (obj instanceof CreateStreamingSessionRequest == false)
            return false;
        CreateStreamingSessionRequest other = (CreateStreamingSessionRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getEc2InstanceType() == null ^ this.getEc2InstanceType() == null)
            return false;
        if (other.getEc2InstanceType() != null && other.getEc2InstanceType().equals(this.getEc2InstanceType()) == false)
            return false;
        if (other.getLaunchProfileId() == null ^ this.getLaunchProfileId() == null)
            return false;
        if (other.getLaunchProfileId() != null && other.getLaunchProfileId().equals(this.getLaunchProfileId()) == false)
            return false;
        if (other.getOwnedBy() == null ^ this.getOwnedBy() == null)
            return false;
        if (other.getOwnedBy() != null && other.getOwnedBy().equals(this.getOwnedBy()) == false)
            return false;
        if (other.getStreamingImageId() == null ^ this.getStreamingImageId() == null)
            return false;
        if (other.getStreamingImageId() != null && other.getStreamingImageId().equals(this.getStreamingImageId()) == false)
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
        hashCode = prime * hashCode + ((getEc2InstanceType() == null) ? 0 : getEc2InstanceType().hashCode());
        hashCode = prime * hashCode + ((getLaunchProfileId() == null) ? 0 : getLaunchProfileId().hashCode());
        hashCode = prime * hashCode + ((getOwnedBy() == null) ? 0 : getOwnedBy().hashCode());
        hashCode = prime * hashCode + ((getStreamingImageId() == null) ? 0 : getStreamingImageId().hashCode());
        hashCode = prime * hashCode + ((getStudioId() == null) ? 0 : getStudioId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateStreamingSessionRequest clone() {
        return (CreateStreamingSessionRequest) super.clone();
    }

}
