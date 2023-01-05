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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DeleteClientBranding" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteClientBrandingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The directory identifier of the WorkSpace for which you want to delete client branding.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The device type for which you want to delete client branding.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> platforms;

    /**
     * <p>
     * The directory identifier of the WorkSpace for which you want to delete client branding.
     * </p>
     * 
     * @param resourceId
     *        The directory identifier of the WorkSpace for which you want to delete client branding.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The directory identifier of the WorkSpace for which you want to delete client branding.
     * </p>
     * 
     * @return The directory identifier of the WorkSpace for which you want to delete client branding.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The directory identifier of the WorkSpace for which you want to delete client branding.
     * </p>
     * 
     * @param resourceId
     *        The directory identifier of the WorkSpace for which you want to delete client branding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteClientBrandingRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The device type for which you want to delete client branding.
     * </p>
     * 
     * @return The device type for which you want to delete client branding.
     * @see ClientDeviceType
     */

    public java.util.List<String> getPlatforms() {
        if (platforms == null) {
            platforms = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return platforms;
    }

    /**
     * <p>
     * The device type for which you want to delete client branding.
     * </p>
     * 
     * @param platforms
     *        The device type for which you want to delete client branding.
     * @see ClientDeviceType
     */

    public void setPlatforms(java.util.Collection<String> platforms) {
        if (platforms == null) {
            this.platforms = null;
            return;
        }

        this.platforms = new com.amazonaws.internal.SdkInternalList<String>(platforms);
    }

    /**
     * <p>
     * The device type for which you want to delete client branding.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlatforms(java.util.Collection)} or {@link #withPlatforms(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param platforms
     *        The device type for which you want to delete client branding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClientDeviceType
     */

    public DeleteClientBrandingRequest withPlatforms(String... platforms) {
        if (this.platforms == null) {
            setPlatforms(new com.amazonaws.internal.SdkInternalList<String>(platforms.length));
        }
        for (String ele : platforms) {
            this.platforms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The device type for which you want to delete client branding.
     * </p>
     * 
     * @param platforms
     *        The device type for which you want to delete client branding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClientDeviceType
     */

    public DeleteClientBrandingRequest withPlatforms(java.util.Collection<String> platforms) {
        setPlatforms(platforms);
        return this;
    }

    /**
     * <p>
     * The device type for which you want to delete client branding.
     * </p>
     * 
     * @param platforms
     *        The device type for which you want to delete client branding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClientDeviceType
     */

    public DeleteClientBrandingRequest withPlatforms(ClientDeviceType... platforms) {
        com.amazonaws.internal.SdkInternalList<String> platformsCopy = new com.amazonaws.internal.SdkInternalList<String>(platforms.length);
        for (ClientDeviceType value : platforms) {
            platformsCopy.add(value.toString());
        }
        if (getPlatforms() == null) {
            setPlatforms(platformsCopy);
        } else {
            getPlatforms().addAll(platformsCopy);
        }
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getPlatforms() != null)
            sb.append("Platforms: ").append(getPlatforms());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteClientBrandingRequest == false)
            return false;
        DeleteClientBrandingRequest other = (DeleteClientBrandingRequest) obj;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getPlatforms() == null ^ this.getPlatforms() == null)
            return false;
        if (other.getPlatforms() != null && other.getPlatforms().equals(this.getPlatforms()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getPlatforms() == null) ? 0 : getPlatforms().hashCode());
        return hashCode;
    }

    @Override
    public DeleteClientBrandingRequest clone() {
        return (DeleteClientBrandingRequest) super.clone();
    }

}
