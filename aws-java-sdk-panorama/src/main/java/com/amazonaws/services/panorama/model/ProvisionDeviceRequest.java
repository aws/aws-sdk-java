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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ProvisionDevice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionDeviceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A description for the device.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A name for the device.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A networking configuration for the device.
     * </p>
     */
    private NetworkPayload networkingConfiguration;
    /**
     * <p>
     * Tags for the device.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A description for the device.
     * </p>
     * 
     * @param description
     *        A description for the device.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the device.
     * </p>
     * 
     * @return A description for the device.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the device.
     * </p>
     * 
     * @param description
     *        A description for the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionDeviceRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A name for the device.
     * </p>
     * 
     * @param name
     *        A name for the device.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the device.
     * </p>
     * 
     * @return A name for the device.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the device.
     * </p>
     * 
     * @param name
     *        A name for the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionDeviceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A networking configuration for the device.
     * </p>
     * 
     * @param networkingConfiguration
     *        A networking configuration for the device.
     */

    public void setNetworkingConfiguration(NetworkPayload networkingConfiguration) {
        this.networkingConfiguration = networkingConfiguration;
    }

    /**
     * <p>
     * A networking configuration for the device.
     * </p>
     * 
     * @return A networking configuration for the device.
     */

    public NetworkPayload getNetworkingConfiguration() {
        return this.networkingConfiguration;
    }

    /**
     * <p>
     * A networking configuration for the device.
     * </p>
     * 
     * @param networkingConfiguration
     *        A networking configuration for the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionDeviceRequest withNetworkingConfiguration(NetworkPayload networkingConfiguration) {
        setNetworkingConfiguration(networkingConfiguration);
        return this;
    }

    /**
     * <p>
     * Tags for the device.
     * </p>
     * 
     * @return Tags for the device.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags for the device.
     * </p>
     * 
     * @param tags
     *        Tags for the device.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags for the device.
     * </p>
     * 
     * @param tags
     *        Tags for the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionDeviceRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see ProvisionDeviceRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionDeviceRequest addTagsEntry(String key, String value) {
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

    public ProvisionDeviceRequest clearTagsEntries() {
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getNetworkingConfiguration() != null)
            sb.append("NetworkingConfiguration: ").append(getNetworkingConfiguration()).append(",");
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

        if (obj instanceof ProvisionDeviceRequest == false)
            return false;
        ProvisionDeviceRequest other = (ProvisionDeviceRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNetworkingConfiguration() == null ^ this.getNetworkingConfiguration() == null)
            return false;
        if (other.getNetworkingConfiguration() != null && other.getNetworkingConfiguration().equals(this.getNetworkingConfiguration()) == false)
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

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNetworkingConfiguration() == null) ? 0 : getNetworkingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ProvisionDeviceRequest clone() {
        return (ProvisionDeviceRequest) super.clone();
    }

}
