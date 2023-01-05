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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/CreateApplicationInstance" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateApplicationInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of an application instance to replace with the new instance.
     * </p>
     */
    private String applicationInstanceIdToReplace;
    /**
     * <p>
     * A device's ID.
     * </p>
     */
    private String defaultRuntimeContextDevice;
    /**
     * <p>
     * A description for the application instance.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Setting overrides for the application manifest.
     * </p>
     */
    private ManifestOverridesPayload manifestOverridesPayload;
    /**
     * <p>
     * The application's manifest document.
     * </p>
     */
    private ManifestPayload manifestPayload;
    /**
     * <p>
     * A name for the application instance.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of a runtime role for the application instance.
     * </p>
     */
    private String runtimeRoleArn;
    /**
     * <p>
     * Tags for the application instance.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ID of an application instance to replace with the new instance.
     * </p>
     * 
     * @param applicationInstanceIdToReplace
     *        The ID of an application instance to replace with the new instance.
     */

    public void setApplicationInstanceIdToReplace(String applicationInstanceIdToReplace) {
        this.applicationInstanceIdToReplace = applicationInstanceIdToReplace;
    }

    /**
     * <p>
     * The ID of an application instance to replace with the new instance.
     * </p>
     * 
     * @return The ID of an application instance to replace with the new instance.
     */

    public String getApplicationInstanceIdToReplace() {
        return this.applicationInstanceIdToReplace;
    }

    /**
     * <p>
     * The ID of an application instance to replace with the new instance.
     * </p>
     * 
     * @param applicationInstanceIdToReplace
     *        The ID of an application instance to replace with the new instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationInstanceRequest withApplicationInstanceIdToReplace(String applicationInstanceIdToReplace) {
        setApplicationInstanceIdToReplace(applicationInstanceIdToReplace);
        return this;
    }

    /**
     * <p>
     * A device's ID.
     * </p>
     * 
     * @param defaultRuntimeContextDevice
     *        A device's ID.
     */

    public void setDefaultRuntimeContextDevice(String defaultRuntimeContextDevice) {
        this.defaultRuntimeContextDevice = defaultRuntimeContextDevice;
    }

    /**
     * <p>
     * A device's ID.
     * </p>
     * 
     * @return A device's ID.
     */

    public String getDefaultRuntimeContextDevice() {
        return this.defaultRuntimeContextDevice;
    }

    /**
     * <p>
     * A device's ID.
     * </p>
     * 
     * @param defaultRuntimeContextDevice
     *        A device's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationInstanceRequest withDefaultRuntimeContextDevice(String defaultRuntimeContextDevice) {
        setDefaultRuntimeContextDevice(defaultRuntimeContextDevice);
        return this;
    }

    /**
     * <p>
     * A description for the application instance.
     * </p>
     * 
     * @param description
     *        A description for the application instance.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the application instance.
     * </p>
     * 
     * @return A description for the application instance.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the application instance.
     * </p>
     * 
     * @param description
     *        A description for the application instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationInstanceRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Setting overrides for the application manifest.
     * </p>
     * 
     * @param manifestOverridesPayload
     *        Setting overrides for the application manifest.
     */

    public void setManifestOverridesPayload(ManifestOverridesPayload manifestOverridesPayload) {
        this.manifestOverridesPayload = manifestOverridesPayload;
    }

    /**
     * <p>
     * Setting overrides for the application manifest.
     * </p>
     * 
     * @return Setting overrides for the application manifest.
     */

    public ManifestOverridesPayload getManifestOverridesPayload() {
        return this.manifestOverridesPayload;
    }

    /**
     * <p>
     * Setting overrides for the application manifest.
     * </p>
     * 
     * @param manifestOverridesPayload
     *        Setting overrides for the application manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationInstanceRequest withManifestOverridesPayload(ManifestOverridesPayload manifestOverridesPayload) {
        setManifestOverridesPayload(manifestOverridesPayload);
        return this;
    }

    /**
     * <p>
     * The application's manifest document.
     * </p>
     * 
     * @param manifestPayload
     *        The application's manifest document.
     */

    public void setManifestPayload(ManifestPayload manifestPayload) {
        this.manifestPayload = manifestPayload;
    }

    /**
     * <p>
     * The application's manifest document.
     * </p>
     * 
     * @return The application's manifest document.
     */

    public ManifestPayload getManifestPayload() {
        return this.manifestPayload;
    }

    /**
     * <p>
     * The application's manifest document.
     * </p>
     * 
     * @param manifestPayload
     *        The application's manifest document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationInstanceRequest withManifestPayload(ManifestPayload manifestPayload) {
        setManifestPayload(manifestPayload);
        return this;
    }

    /**
     * <p>
     * A name for the application instance.
     * </p>
     * 
     * @param name
     *        A name for the application instance.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the application instance.
     * </p>
     * 
     * @return A name for the application instance.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the application instance.
     * </p>
     * 
     * @param name
     *        A name for the application instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationInstanceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of a runtime role for the application instance.
     * </p>
     * 
     * @param runtimeRoleArn
     *        The ARN of a runtime role for the application instance.
     */

    public void setRuntimeRoleArn(String runtimeRoleArn) {
        this.runtimeRoleArn = runtimeRoleArn;
    }

    /**
     * <p>
     * The ARN of a runtime role for the application instance.
     * </p>
     * 
     * @return The ARN of a runtime role for the application instance.
     */

    public String getRuntimeRoleArn() {
        return this.runtimeRoleArn;
    }

    /**
     * <p>
     * The ARN of a runtime role for the application instance.
     * </p>
     * 
     * @param runtimeRoleArn
     *        The ARN of a runtime role for the application instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationInstanceRequest withRuntimeRoleArn(String runtimeRoleArn) {
        setRuntimeRoleArn(runtimeRoleArn);
        return this;
    }

    /**
     * <p>
     * Tags for the application instance.
     * </p>
     * 
     * @return Tags for the application instance.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags for the application instance.
     * </p>
     * 
     * @param tags
     *        Tags for the application instance.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags for the application instance.
     * </p>
     * 
     * @param tags
     *        Tags for the application instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationInstanceRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateApplicationInstanceRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationInstanceRequest addTagsEntry(String key, String value) {
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

    public CreateApplicationInstanceRequest clearTagsEntries() {
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
        if (getApplicationInstanceIdToReplace() != null)
            sb.append("ApplicationInstanceIdToReplace: ").append(getApplicationInstanceIdToReplace()).append(",");
        if (getDefaultRuntimeContextDevice() != null)
            sb.append("DefaultRuntimeContextDevice: ").append(getDefaultRuntimeContextDevice()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getManifestOverridesPayload() != null)
            sb.append("ManifestOverridesPayload: ").append(getManifestOverridesPayload()).append(",");
        if (getManifestPayload() != null)
            sb.append("ManifestPayload: ").append(getManifestPayload()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRuntimeRoleArn() != null)
            sb.append("RuntimeRoleArn: ").append(getRuntimeRoleArn()).append(",");
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

        if (obj instanceof CreateApplicationInstanceRequest == false)
            return false;
        CreateApplicationInstanceRequest other = (CreateApplicationInstanceRequest) obj;
        if (other.getApplicationInstanceIdToReplace() == null ^ this.getApplicationInstanceIdToReplace() == null)
            return false;
        if (other.getApplicationInstanceIdToReplace() != null
                && other.getApplicationInstanceIdToReplace().equals(this.getApplicationInstanceIdToReplace()) == false)
            return false;
        if (other.getDefaultRuntimeContextDevice() == null ^ this.getDefaultRuntimeContextDevice() == null)
            return false;
        if (other.getDefaultRuntimeContextDevice() != null && other.getDefaultRuntimeContextDevice().equals(this.getDefaultRuntimeContextDevice()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getManifestOverridesPayload() == null ^ this.getManifestOverridesPayload() == null)
            return false;
        if (other.getManifestOverridesPayload() != null && other.getManifestOverridesPayload().equals(this.getManifestOverridesPayload()) == false)
            return false;
        if (other.getManifestPayload() == null ^ this.getManifestPayload() == null)
            return false;
        if (other.getManifestPayload() != null && other.getManifestPayload().equals(this.getManifestPayload()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRuntimeRoleArn() == null ^ this.getRuntimeRoleArn() == null)
            return false;
        if (other.getRuntimeRoleArn() != null && other.getRuntimeRoleArn().equals(this.getRuntimeRoleArn()) == false)
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

        hashCode = prime * hashCode + ((getApplicationInstanceIdToReplace() == null) ? 0 : getApplicationInstanceIdToReplace().hashCode());
        hashCode = prime * hashCode + ((getDefaultRuntimeContextDevice() == null) ? 0 : getDefaultRuntimeContextDevice().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getManifestOverridesPayload() == null) ? 0 : getManifestOverridesPayload().hashCode());
        hashCode = prime * hashCode + ((getManifestPayload() == null) ? 0 : getManifestPayload().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRuntimeRoleArn() == null) ? 0 : getRuntimeRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateApplicationInstanceRequest clone() {
        return (CreateApplicationInstanceRequest) super.clone();
    }

}
