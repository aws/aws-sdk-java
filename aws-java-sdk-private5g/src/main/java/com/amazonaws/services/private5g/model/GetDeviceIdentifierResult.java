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
package com.amazonaws.services.private5g.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/GetDeviceIdentifier"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDeviceIdentifierResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the device identifier.
     * </p>
     */
    private DeviceIdentifier deviceIdentifier;
    /**
     * <p>
     * The device identifier tags.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Information about the device identifier.
     * </p>
     * 
     * @param deviceIdentifier
     *        Information about the device identifier.
     */

    public void setDeviceIdentifier(DeviceIdentifier deviceIdentifier) {
        this.deviceIdentifier = deviceIdentifier;
    }

    /**
     * <p>
     * Information about the device identifier.
     * </p>
     * 
     * @return Information about the device identifier.
     */

    public DeviceIdentifier getDeviceIdentifier() {
        return this.deviceIdentifier;
    }

    /**
     * <p>
     * Information about the device identifier.
     * </p>
     * 
     * @param deviceIdentifier
     *        Information about the device identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeviceIdentifierResult withDeviceIdentifier(DeviceIdentifier deviceIdentifier) {
        setDeviceIdentifier(deviceIdentifier);
        return this;
    }

    /**
     * <p>
     * The device identifier tags.
     * </p>
     * 
     * @return The device identifier tags.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The device identifier tags.
     * </p>
     * 
     * @param tags
     *        The device identifier tags.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The device identifier tags.
     * </p>
     * 
     * @param tags
     *        The device identifier tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeviceIdentifierResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetDeviceIdentifierResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetDeviceIdentifierResult addTagsEntry(String key, String value) {
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

    public GetDeviceIdentifierResult clearTagsEntries() {
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
        if (getDeviceIdentifier() != null)
            sb.append("DeviceIdentifier: ").append(getDeviceIdentifier()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeviceIdentifierResult == false)
            return false;
        GetDeviceIdentifierResult other = (GetDeviceIdentifierResult) obj;
        if (other.getDeviceIdentifier() == null ^ this.getDeviceIdentifier() == null)
            return false;
        if (other.getDeviceIdentifier() != null && other.getDeviceIdentifier().equals(this.getDeviceIdentifier()) == false)
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

        hashCode = prime * hashCode + ((getDeviceIdentifier() == null) ? 0 : getDeviceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GetDeviceIdentifierResult clone() {
        try {
            return (GetDeviceIdentifierResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
