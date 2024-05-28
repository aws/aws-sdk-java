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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * List the DASH manifest configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackagev2-2022-12-25/ListDashManifestConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDashManifestConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A short string that's appended to the endpoint URL. The manifest name creates a unique path to this endpoint. If
     * you don't enter a value, MediaPackage uses the default manifest name, index.
     * </p>
     */
    private String manifestName;
    /**
     * <p>
     * The egress domain URL for stream delivery from MediaPackage.
     * </p>
     */
    private String url;

    /**
     * <p>
     * A short string that's appended to the endpoint URL. The manifest name creates a unique path to this endpoint. If
     * you don't enter a value, MediaPackage uses the default manifest name, index.
     * </p>
     * 
     * @param manifestName
     *        A short string that's appended to the endpoint URL. The manifest name creates a unique path to this
     *        endpoint. If you don't enter a value, MediaPackage uses the default manifest name, index.
     */

    public void setManifestName(String manifestName) {
        this.manifestName = manifestName;
    }

    /**
     * <p>
     * A short string that's appended to the endpoint URL. The manifest name creates a unique path to this endpoint. If
     * you don't enter a value, MediaPackage uses the default manifest name, index.
     * </p>
     * 
     * @return A short string that's appended to the endpoint URL. The manifest name creates a unique path to this
     *         endpoint. If you don't enter a value, MediaPackage uses the default manifest name, index.
     */

    public String getManifestName() {
        return this.manifestName;
    }

    /**
     * <p>
     * A short string that's appended to the endpoint URL. The manifest name creates a unique path to this endpoint. If
     * you don't enter a value, MediaPackage uses the default manifest name, index.
     * </p>
     * 
     * @param manifestName
     *        A short string that's appended to the endpoint URL. The manifest name creates a unique path to this
     *        endpoint. If you don't enter a value, MediaPackage uses the default manifest name, index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDashManifestConfiguration withManifestName(String manifestName) {
        setManifestName(manifestName);
        return this;
    }

    /**
     * <p>
     * The egress domain URL for stream delivery from MediaPackage.
     * </p>
     * 
     * @param url
     *        The egress domain URL for stream delivery from MediaPackage.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The egress domain URL for stream delivery from MediaPackage.
     * </p>
     * 
     * @return The egress domain URL for stream delivery from MediaPackage.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The egress domain URL for stream delivery from MediaPackage.
     * </p>
     * 
     * @param url
     *        The egress domain URL for stream delivery from MediaPackage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDashManifestConfiguration withUrl(String url) {
        setUrl(url);
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
        if (getManifestName() != null)
            sb.append("ManifestName: ").append(getManifestName()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDashManifestConfiguration == false)
            return false;
        ListDashManifestConfiguration other = (ListDashManifestConfiguration) obj;
        if (other.getManifestName() == null ^ this.getManifestName() == null)
            return false;
        if (other.getManifestName() != null && other.getManifestName().equals(this.getManifestName()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getManifestName() == null) ? 0 : getManifestName().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public ListDashManifestConfiguration clone() {
        try {
            return (ListDashManifestConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediapackagev2.model.transform.ListDashManifestConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
