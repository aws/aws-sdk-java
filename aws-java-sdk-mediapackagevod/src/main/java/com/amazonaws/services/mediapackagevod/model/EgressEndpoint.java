/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediapackagevod.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The endpoint URL used to access an Asset using one PackagingConfiguration.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/EgressEndpoint" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EgressEndpoint implements Serializable, Cloneable, StructuredPojo {

    /** The ID of the PackagingConfiguration being applied to the Asset. */
    private String packagingConfigurationId;
    /** The URL of the parent manifest for the repackaged Asset. */
    private String url;

    /**
     * The ID of the PackagingConfiguration being applied to the Asset.
     * 
     * @param packagingConfigurationId
     *        The ID of the PackagingConfiguration being applied to the Asset.
     */

    public void setPackagingConfigurationId(String packagingConfigurationId) {
        this.packagingConfigurationId = packagingConfigurationId;
    }

    /**
     * The ID of the PackagingConfiguration being applied to the Asset.
     * 
     * @return The ID of the PackagingConfiguration being applied to the Asset.
     */

    public String getPackagingConfigurationId() {
        return this.packagingConfigurationId;
    }

    /**
     * The ID of the PackagingConfiguration being applied to the Asset.
     * 
     * @param packagingConfigurationId
     *        The ID of the PackagingConfiguration being applied to the Asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EgressEndpoint withPackagingConfigurationId(String packagingConfigurationId) {
        setPackagingConfigurationId(packagingConfigurationId);
        return this;
    }

    /**
     * The URL of the parent manifest for the repackaged Asset.
     * 
     * @param url
     *        The URL of the parent manifest for the repackaged Asset.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * The URL of the parent manifest for the repackaged Asset.
     * 
     * @return The URL of the parent manifest for the repackaged Asset.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * The URL of the parent manifest for the repackaged Asset.
     * 
     * @param url
     *        The URL of the parent manifest for the repackaged Asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EgressEndpoint withUrl(String url) {
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
        if (getPackagingConfigurationId() != null)
            sb.append("PackagingConfigurationId: ").append(getPackagingConfigurationId()).append(",");
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

        if (obj instanceof EgressEndpoint == false)
            return false;
        EgressEndpoint other = (EgressEndpoint) obj;
        if (other.getPackagingConfigurationId() == null ^ this.getPackagingConfigurationId() == null)
            return false;
        if (other.getPackagingConfigurationId() != null && other.getPackagingConfigurationId().equals(this.getPackagingConfigurationId()) == false)
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

        hashCode = prime * hashCode + ((getPackagingConfigurationId() == null) ? 0 : getPackagingConfigurationId().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public EgressEndpoint clone() {
        try {
            return (EgressEndpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediapackagevod.model.transform.EgressEndpointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
