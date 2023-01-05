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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/UpdateNetworkResourceMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateNetworkResourceMetadataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The updated resource metadata.
     * </p>
     */
    private java.util.Map<String, String> metadata;

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the resource.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     * 
     * @return The ARN of the resource.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNetworkResourceMetadataResult withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The updated resource metadata.
     * </p>
     * 
     * @return The updated resource metadata.
     */

    public java.util.Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * The updated resource metadata.
     * </p>
     * 
     * @param metadata
     *        The updated resource metadata.
     */

    public void setMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The updated resource metadata.
     * </p>
     * 
     * @param metadata
     *        The updated resource metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNetworkResourceMetadataResult withMetadata(java.util.Map<String, String> metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * Add a single Metadata entry
     *
     * @see UpdateNetworkResourceMetadataResult#withMetadata
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNetworkResourceMetadataResult addMetadataEntry(String key, String value) {
        if (null == this.metadata) {
            this.metadata = new java.util.HashMap<String, String>();
        }
        if (this.metadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.metadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Metadata.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNetworkResourceMetadataResult clearMetadataEntries() {
        this.metadata = null;
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateNetworkResourceMetadataResult == false)
            return false;
        UpdateNetworkResourceMetadataResult other = (UpdateNetworkResourceMetadataResult) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        return hashCode;
    }

    @Override
    public UpdateNetworkResourceMetadataResult clone() {
        try {
            return (UpdateNetworkResourceMetadataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
