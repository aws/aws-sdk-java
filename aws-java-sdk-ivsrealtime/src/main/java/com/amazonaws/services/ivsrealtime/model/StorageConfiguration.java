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
package com.amazonaws.services.ivsrealtime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A complex type that describes a location where recorded videos will be stored.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/StorageConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StorageConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ARN of the storage configuration.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Name of the storage configuration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An S3 destination configuration where recorded videos will be stored.
     * </p>
     */
    private S3StorageConfiguration s3;
    /**
     * <p>
     * Tags attached to the resource. Array of maps, each of the form <code>string:string (key:value)</code>. See <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for details,
     * including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS has no constraints
     * on tags beyond what is documented there.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * ARN of the storage configuration.
     * </p>
     * 
     * @param arn
     *        ARN of the storage configuration.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * ARN of the storage configuration.
     * </p>
     * 
     * @return ARN of the storage configuration.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * ARN of the storage configuration.
     * </p>
     * 
     * @param arn
     *        ARN of the storage configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageConfiguration withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Name of the storage configuration.
     * </p>
     * 
     * @param name
     *        Name of the storage configuration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the storage configuration.
     * </p>
     * 
     * @return Name of the storage configuration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the storage configuration.
     * </p>
     * 
     * @param name
     *        Name of the storage configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageConfiguration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An S3 destination configuration where recorded videos will be stored.
     * </p>
     * 
     * @param s3
     *        An S3 destination configuration where recorded videos will be stored.
     */

    public void setS3(S3StorageConfiguration s3) {
        this.s3 = s3;
    }

    /**
     * <p>
     * An S3 destination configuration where recorded videos will be stored.
     * </p>
     * 
     * @return An S3 destination configuration where recorded videos will be stored.
     */

    public S3StorageConfiguration getS3() {
        return this.s3;
    }

    /**
     * <p>
     * An S3 destination configuration where recorded videos will be stored.
     * </p>
     * 
     * @param s3
     *        An S3 destination configuration where recorded videos will be stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageConfiguration withS3(S3StorageConfiguration s3) {
        setS3(s3);
        return this;
    }

    /**
     * <p>
     * Tags attached to the resource. Array of maps, each of the form <code>string:string (key:value)</code>. See <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for details,
     * including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS has no constraints
     * on tags beyond what is documented there.
     * </p>
     * 
     * @return Tags attached to the resource. Array of maps, each of the form <code>string:string (key:value)</code>.
     *         See <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a>
     *         for details, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon
     *         IVS has no constraints on tags beyond what is documented there.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags attached to the resource. Array of maps, each of the form <code>string:string (key:value)</code>. See <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for details,
     * including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS has no constraints
     * on tags beyond what is documented there.
     * </p>
     * 
     * @param tags
     *        Tags attached to the resource. Array of maps, each of the form <code>string:string (key:value)</code>. See
     *        <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for
     *        details, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS
     *        has no constraints on tags beyond what is documented there.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags attached to the resource. Array of maps, each of the form <code>string:string (key:value)</code>. See <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for details,
     * including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS has no constraints
     * on tags beyond what is documented there.
     * </p>
     * 
     * @param tags
     *        Tags attached to the resource. Array of maps, each of the form <code>string:string (key:value)</code>. See
     *        <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for
     *        details, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS
     *        has no constraints on tags beyond what is documented there.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageConfiguration withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see StorageConfiguration#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StorageConfiguration addTagsEntry(String key, String value) {
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

    public StorageConfiguration clearTagsEntries() {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getS3() != null)
            sb.append("S3: ").append(getS3()).append(",");
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

        if (obj instanceof StorageConfiguration == false)
            return false;
        StorageConfiguration other = (StorageConfiguration) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getS3() == null ^ this.getS3() == null)
            return false;
        if (other.getS3() != null && other.getS3().equals(this.getS3()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getS3() == null) ? 0 : getS3().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public StorageConfiguration clone() {
        try {
            return (StorageConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivsrealtime.model.transform.StorageConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
