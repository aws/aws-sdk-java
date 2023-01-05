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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Meta data details of an Amazon EC2 instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/Ec2Metadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Ec2Metadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI) used to launch the instance.
     * </p>
     */
    private String amiId;
    /**
     * <p>
     * The platform of the instance.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The tags attached to the instance.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI) used to launch the instance.
     * </p>
     * 
     * @param amiId
     *        The ID of the Amazon Machine Image (AMI) used to launch the instance.
     */

    public void setAmiId(String amiId) {
        this.amiId = amiId;
    }

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI) used to launch the instance.
     * </p>
     * 
     * @return The ID of the Amazon Machine Image (AMI) used to launch the instance.
     */

    public String getAmiId() {
        return this.amiId;
    }

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI) used to launch the instance.
     * </p>
     * 
     * @param amiId
     *        The ID of the Amazon Machine Image (AMI) used to launch the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2Metadata withAmiId(String amiId) {
        setAmiId(amiId);
        return this;
    }

    /**
     * <p>
     * The platform of the instance.
     * </p>
     * 
     * @param platform
     *        The platform of the instance.
     * @see Ec2Platform
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The platform of the instance.
     * </p>
     * 
     * @return The platform of the instance.
     * @see Ec2Platform
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The platform of the instance.
     * </p>
     * 
     * @param platform
     *        The platform of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ec2Platform
     */

    public Ec2Metadata withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The platform of the instance.
     * </p>
     * 
     * @param platform
     *        The platform of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ec2Platform
     */

    public Ec2Metadata withPlatform(Ec2Platform platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * <p>
     * The tags attached to the instance.
     * </p>
     * 
     * @return The tags attached to the instance.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags attached to the instance.
     * </p>
     * 
     * @param tags
     *        The tags attached to the instance.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags attached to the instance.
     * </p>
     * 
     * @param tags
     *        The tags attached to the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ec2Metadata withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Ec2Metadata#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Ec2Metadata addTagsEntry(String key, String value) {
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

    public Ec2Metadata clearTagsEntries() {
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
        if (getAmiId() != null)
            sb.append("AmiId: ").append(getAmiId()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
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

        if (obj instanceof Ec2Metadata == false)
            return false;
        Ec2Metadata other = (Ec2Metadata) obj;
        if (other.getAmiId() == null ^ this.getAmiId() == null)
            return false;
        if (other.getAmiId() != null && other.getAmiId().equals(this.getAmiId()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
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

        hashCode = prime * hashCode + ((getAmiId() == null) ? 0 : getAmiId().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Ec2Metadata clone() {
        try {
            return (Ec2Metadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.Ec2MetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
