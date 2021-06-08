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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContainerAPIMetadata" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetContainerAPIMetadataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Metadata about Lightsail containers, such as the current version of the Lightsail Control (lightsailctl) plugin.
     * </p>
     */
    private java.util.List<java.util.Map<String, String>> metadata;

    /**
     * <p>
     * Metadata about Lightsail containers, such as the current version of the Lightsail Control (lightsailctl) plugin.
     * </p>
     * 
     * @return Metadata about Lightsail containers, such as the current version of the Lightsail Control (lightsailctl)
     *         plugin.
     */

    public java.util.List<java.util.Map<String, String>> getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * Metadata about Lightsail containers, such as the current version of the Lightsail Control (lightsailctl) plugin.
     * </p>
     * 
     * @param metadata
     *        Metadata about Lightsail containers, such as the current version of the Lightsail Control (lightsailctl)
     *        plugin.
     */

    public void setMetadata(java.util.Collection<java.util.Map<String, String>> metadata) {
        if (metadata == null) {
            this.metadata = null;
            return;
        }

        this.metadata = new java.util.ArrayList<java.util.Map<String, String>>(metadata);
    }

    /**
     * <p>
     * Metadata about Lightsail containers, such as the current version of the Lightsail Control (lightsailctl) plugin.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetadata(java.util.Collection)} or {@link #withMetadata(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param metadata
     *        Metadata about Lightsail containers, such as the current version of the Lightsail Control (lightsailctl)
     *        plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContainerAPIMetadataResult withMetadata(java.util.Map<String, String>... metadata) {
        if (this.metadata == null) {
            setMetadata(new java.util.ArrayList<java.util.Map<String, String>>(metadata.length));
        }
        for (java.util.Map<String, String> ele : metadata) {
            this.metadata.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Metadata about Lightsail containers, such as the current version of the Lightsail Control (lightsailctl) plugin.
     * </p>
     * 
     * @param metadata
     *        Metadata about Lightsail containers, such as the current version of the Lightsail Control (lightsailctl)
     *        plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContainerAPIMetadataResult withMetadata(java.util.Collection<java.util.Map<String, String>> metadata) {
        setMetadata(metadata);
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

        if (obj instanceof GetContainerAPIMetadataResult == false)
            return false;
        GetContainerAPIMetadataResult other = (GetContainerAPIMetadataResult) obj;
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

        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        return hashCode;
    }

    @Override
    public GetContainerAPIMetadataResult clone() {
        try {
            return (GetContainerAPIMetadataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
