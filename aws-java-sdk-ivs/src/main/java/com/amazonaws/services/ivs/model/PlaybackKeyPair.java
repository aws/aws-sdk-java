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
package com.amazonaws.services.ivs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A key pair used to sign and validate a playback authorization token.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/PlaybackKeyPair" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PlaybackKeyPair implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Key-pair ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Key-pair name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Key-pair identifier.
     * </p>
     */
    private String fingerprint;
    /**
     * <p>
     * Array of 1-50 maps, each of the form <code>string:string (key:value)</code>.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Key-pair ARN.
     * </p>
     * 
     * @param arn
     *        Key-pair ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Key-pair ARN.
     * </p>
     * 
     * @return Key-pair ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Key-pair ARN.
     * </p>
     * 
     * @param arn
     *        Key-pair ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlaybackKeyPair withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Key-pair name.
     * </p>
     * 
     * @param name
     *        Key-pair name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Key-pair name.
     * </p>
     * 
     * @return Key-pair name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Key-pair name.
     * </p>
     * 
     * @param name
     *        Key-pair name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlaybackKeyPair withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Key-pair identifier.
     * </p>
     * 
     * @param fingerprint
     *        Key-pair identifier.
     */

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    /**
     * <p>
     * Key-pair identifier.
     * </p>
     * 
     * @return Key-pair identifier.
     */

    public String getFingerprint() {
        return this.fingerprint;
    }

    /**
     * <p>
     * Key-pair identifier.
     * </p>
     * 
     * @param fingerprint
     *        Key-pair identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlaybackKeyPair withFingerprint(String fingerprint) {
        setFingerprint(fingerprint);
        return this;
    }

    /**
     * <p>
     * Array of 1-50 maps, each of the form <code>string:string (key:value)</code>.
     * </p>
     * 
     * @return Array of 1-50 maps, each of the form <code>string:string (key:value)</code>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Array of 1-50 maps, each of the form <code>string:string (key:value)</code>.
     * </p>
     * 
     * @param tags
     *        Array of 1-50 maps, each of the form <code>string:string (key:value)</code>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Array of 1-50 maps, each of the form <code>string:string (key:value)</code>.
     * </p>
     * 
     * @param tags
     *        Array of 1-50 maps, each of the form <code>string:string (key:value)</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlaybackKeyPair withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see PlaybackKeyPair#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public PlaybackKeyPair addTagsEntry(String key, String value) {
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

    public PlaybackKeyPair clearTagsEntries() {
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
        if (getFingerprint() != null)
            sb.append("Fingerprint: ").append(getFingerprint()).append(",");
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

        if (obj instanceof PlaybackKeyPair == false)
            return false;
        PlaybackKeyPair other = (PlaybackKeyPair) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFingerprint() == null ^ this.getFingerprint() == null)
            return false;
        if (other.getFingerprint() != null && other.getFingerprint().equals(this.getFingerprint()) == false)
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
        hashCode = prime * hashCode + ((getFingerprint() == null) ? 0 : getFingerprint().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public PlaybackKeyPair clone() {
        try {
            return (PlaybackKeyPair) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivs.model.transform.PlaybackKeyPairMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
