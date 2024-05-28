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
package com.amazonaws.services.mediapackagev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/UpdateChannelGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateChannelGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name that describes the channel group. The name is the primary identifier for the channel group, and must be
     * unique for your account in the AWS Region.
     * </p>
     */
    private String channelGroupName;
    /**
     * <p>
     * The expected current Entity Tag (ETag) for the resource. If the specified ETag does not match the resource's
     * current entity tag, the update request will be rejected.
     * </p>
     */
    private String eTag;
    /**
     * <p>
     * Any descriptive information that you want to add to the channel group for future identification purposes.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The name that describes the channel group. The name is the primary identifier for the channel group, and must be
     * unique for your account in the AWS Region.
     * </p>
     * 
     * @param channelGroupName
     *        The name that describes the channel group. The name is the primary identifier for the channel group, and
     *        must be unique for your account in the AWS Region.
     */

    public void setChannelGroupName(String channelGroupName) {
        this.channelGroupName = channelGroupName;
    }

    /**
     * <p>
     * The name that describes the channel group. The name is the primary identifier for the channel group, and must be
     * unique for your account in the AWS Region.
     * </p>
     * 
     * @return The name that describes the channel group. The name is the primary identifier for the channel group, and
     *         must be unique for your account in the AWS Region.
     */

    public String getChannelGroupName() {
        return this.channelGroupName;
    }

    /**
     * <p>
     * The name that describes the channel group. The name is the primary identifier for the channel group, and must be
     * unique for your account in the AWS Region.
     * </p>
     * 
     * @param channelGroupName
     *        The name that describes the channel group. The name is the primary identifier for the channel group, and
     *        must be unique for your account in the AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelGroupRequest withChannelGroupName(String channelGroupName) {
        setChannelGroupName(channelGroupName);
        return this;
    }

    /**
     * <p>
     * The expected current Entity Tag (ETag) for the resource. If the specified ETag does not match the resource's
     * current entity tag, the update request will be rejected.
     * </p>
     * 
     * @param eTag
     *        The expected current Entity Tag (ETag) for the resource. If the specified ETag does not match the
     *        resource's current entity tag, the update request will be rejected.
     */

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The expected current Entity Tag (ETag) for the resource. If the specified ETag does not match the resource's
     * current entity tag, the update request will be rejected.
     * </p>
     * 
     * @return The expected current Entity Tag (ETag) for the resource. If the specified ETag does not match the
     *         resource's current entity tag, the update request will be rejected.
     */

    public String getETag() {
        return this.eTag;
    }

    /**
     * <p>
     * The expected current Entity Tag (ETag) for the resource. If the specified ETag does not match the resource's
     * current entity tag, the update request will be rejected.
     * </p>
     * 
     * @param eTag
     *        The expected current Entity Tag (ETag) for the resource. If the specified ETag does not match the
     *        resource's current entity tag, the update request will be rejected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelGroupRequest withETag(String eTag) {
        setETag(eTag);
        return this;
    }

    /**
     * <p>
     * Any descriptive information that you want to add to the channel group for future identification purposes.
     * </p>
     * 
     * @param description
     *        Any descriptive information that you want to add to the channel group for future identification purposes.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Any descriptive information that you want to add to the channel group for future identification purposes.
     * </p>
     * 
     * @return Any descriptive information that you want to add to the channel group for future identification purposes.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Any descriptive information that you want to add to the channel group for future identification purposes.
     * </p>
     * 
     * @param description
     *        Any descriptive information that you want to add to the channel group for future identification purposes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChannelGroupRequest withDescription(String description) {
        setDescription(description);
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
        if (getChannelGroupName() != null)
            sb.append("ChannelGroupName: ").append(getChannelGroupName()).append(",");
        if (getETag() != null)
            sb.append("ETag: ").append(getETag()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateChannelGroupRequest == false)
            return false;
        UpdateChannelGroupRequest other = (UpdateChannelGroupRequest) obj;
        if (other.getChannelGroupName() == null ^ this.getChannelGroupName() == null)
            return false;
        if (other.getChannelGroupName() != null && other.getChannelGroupName().equals(this.getChannelGroupName()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelGroupName() == null) ? 0 : getChannelGroupName().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateChannelGroupRequest clone() {
        return (UpdateChannelGroupRequest) super.clone();
    }

}
