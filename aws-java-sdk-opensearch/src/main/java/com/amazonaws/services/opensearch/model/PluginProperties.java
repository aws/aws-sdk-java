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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Basic information about the plugin.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PluginProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the plugin.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the plugin.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The version of the plugin.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The name of the class to load.
     * </p>
     */
    private String className;
    /**
     * <p>
     * The uncompressed size of the plugin.
     * </p>
     */
    private Long uncompressedSizeInBytes;

    /**
     * <p>
     * The name of the plugin.
     * </p>
     * 
     * @param name
     *        The name of the plugin.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the plugin.
     * </p>
     * 
     * @return The name of the plugin.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the plugin.
     * </p>
     * 
     * @param name
     *        The name of the plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PluginProperties withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the plugin.
     * </p>
     * 
     * @param description
     *        The description of the plugin.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the plugin.
     * </p>
     * 
     * @return The description of the plugin.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the plugin.
     * </p>
     * 
     * @param description
     *        The description of the plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PluginProperties withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The version of the plugin.
     * </p>
     * 
     * @param version
     *        The version of the plugin.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the plugin.
     * </p>
     * 
     * @return The version of the plugin.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the plugin.
     * </p>
     * 
     * @param version
     *        The version of the plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PluginProperties withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The name of the class to load.
     * </p>
     * 
     * @param className
     *        The name of the class to load.
     */

    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * <p>
     * The name of the class to load.
     * </p>
     * 
     * @return The name of the class to load.
     */

    public String getClassName() {
        return this.className;
    }

    /**
     * <p>
     * The name of the class to load.
     * </p>
     * 
     * @param className
     *        The name of the class to load.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PluginProperties withClassName(String className) {
        setClassName(className);
        return this;
    }

    /**
     * <p>
     * The uncompressed size of the plugin.
     * </p>
     * 
     * @param uncompressedSizeInBytes
     *        The uncompressed size of the plugin.
     */

    public void setUncompressedSizeInBytes(Long uncompressedSizeInBytes) {
        this.uncompressedSizeInBytes = uncompressedSizeInBytes;
    }

    /**
     * <p>
     * The uncompressed size of the plugin.
     * </p>
     * 
     * @return The uncompressed size of the plugin.
     */

    public Long getUncompressedSizeInBytes() {
        return this.uncompressedSizeInBytes;
    }

    /**
     * <p>
     * The uncompressed size of the plugin.
     * </p>
     * 
     * @param uncompressedSizeInBytes
     *        The uncompressed size of the plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PluginProperties withUncompressedSizeInBytes(Long uncompressedSizeInBytes) {
        setUncompressedSizeInBytes(uncompressedSizeInBytes);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getClassName() != null)
            sb.append("ClassName: ").append(getClassName()).append(",");
        if (getUncompressedSizeInBytes() != null)
            sb.append("UncompressedSizeInBytes: ").append(getUncompressedSizeInBytes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PluginProperties == false)
            return false;
        PluginProperties other = (PluginProperties) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getClassName() == null ^ this.getClassName() == null)
            return false;
        if (other.getClassName() != null && other.getClassName().equals(this.getClassName()) == false)
            return false;
        if (other.getUncompressedSizeInBytes() == null ^ this.getUncompressedSizeInBytes() == null)
            return false;
        if (other.getUncompressedSizeInBytes() != null && other.getUncompressedSizeInBytes().equals(this.getUncompressedSizeInBytes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getClassName() == null) ? 0 : getClassName().hashCode());
        hashCode = prime * hashCode + ((getUncompressedSizeInBytes() == null) ? 0 : getUncompressedSizeInBytes().hashCode());
        return hashCode;
    }

    @Override
    public PluginProperties clone() {
        try {
            return (PluginProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.PluginPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
