/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mobile.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the bundle.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/BundleDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BundleDetails implements Serializable, Cloneable, StructuredPojo {

    private String bundleId;

    private String title;

    private String version;

    private String description;

    private String iconUrl;

    private java.util.List<String> availablePlatforms;

    /**
     * @param bundleId
     */

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * @return
     */

    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * @param bundleId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BundleDetails withBundleId(String bundleId) {
        setBundleId(bundleId);
        return this;
    }

    /**
     * @param title
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * @param title
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BundleDetails withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * @param version
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * @param version
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BundleDetails withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * @param description
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BundleDetails withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * @param iconUrl
     */

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    /**
     * @return
     */

    public String getIconUrl() {
        return this.iconUrl;
    }

    /**
     * @param iconUrl
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BundleDetails withIconUrl(String iconUrl) {
        setIconUrl(iconUrl);
        return this;
    }

    /**
     * @return
     * @see Platform
     */

    public java.util.List<String> getAvailablePlatforms() {
        return availablePlatforms;
    }

    /**
     * @param availablePlatforms
     * @see Platform
     */

    public void setAvailablePlatforms(java.util.Collection<String> availablePlatforms) {
        if (availablePlatforms == null) {
            this.availablePlatforms = null;
            return;
        }

        this.availablePlatforms = new java.util.ArrayList<String>(availablePlatforms);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailablePlatforms(java.util.Collection)} or {@link #withAvailablePlatforms(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availablePlatforms
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public BundleDetails withAvailablePlatforms(String... availablePlatforms) {
        if (this.availablePlatforms == null) {
            setAvailablePlatforms(new java.util.ArrayList<String>(availablePlatforms.length));
        }
        for (String ele : availablePlatforms) {
            this.availablePlatforms.add(ele);
        }
        return this;
    }

    /**
     * @param availablePlatforms
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public BundleDetails withAvailablePlatforms(java.util.Collection<String> availablePlatforms) {
        setAvailablePlatforms(availablePlatforms);
        return this;
    }

    /**
     * @param availablePlatforms
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Platform
     */

    public BundleDetails withAvailablePlatforms(Platform... availablePlatforms) {
        java.util.ArrayList<String> availablePlatformsCopy = new java.util.ArrayList<String>(availablePlatforms.length);
        for (Platform value : availablePlatforms) {
            availablePlatformsCopy.add(value.toString());
        }
        if (getAvailablePlatforms() == null) {
            setAvailablePlatforms(availablePlatformsCopy);
        } else {
            getAvailablePlatforms().addAll(availablePlatformsCopy);
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
        if (getBundleId() != null)
            sb.append("BundleId: ").append(getBundleId()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getIconUrl() != null)
            sb.append("IconUrl: ").append(getIconUrl()).append(",");
        if (getAvailablePlatforms() != null)
            sb.append("AvailablePlatforms: ").append(getAvailablePlatforms());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BundleDetails == false)
            return false;
        BundleDetails other = (BundleDetails) obj;
        if (other.getBundleId() == null ^ this.getBundleId() == null)
            return false;
        if (other.getBundleId() != null && other.getBundleId().equals(this.getBundleId()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIconUrl() == null ^ this.getIconUrl() == null)
            return false;
        if (other.getIconUrl() != null && other.getIconUrl().equals(this.getIconUrl()) == false)
            return false;
        if (other.getAvailablePlatforms() == null ^ this.getAvailablePlatforms() == null)
            return false;
        if (other.getAvailablePlatforms() != null && other.getAvailablePlatforms().equals(this.getAvailablePlatforms()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBundleId() == null) ? 0 : getBundleId().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIconUrl() == null) ? 0 : getIconUrl().hashCode());
        hashCode = prime * hashCode + ((getAvailablePlatforms() == null) ? 0 : getAvailablePlatforms().hashCode());
        return hashCode;
    }

    @Override
    public BundleDetails clone() {
        try {
            return (BundleDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mobile.model.transform.BundleDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
