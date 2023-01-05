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
package com.amazonaws.services.gamesparks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the extension version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ExtensionVersionDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExtensionVersionDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the extension.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The namespace (qualifier) of the extension.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The model that defines the interface for this extension version.
     * </p>
     */
    private String schema;
    /**
     * <p>
     * The version of the extension.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The name of the extension.
     * </p>
     * 
     * @param name
     *        The name of the extension.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the extension.
     * </p>
     * 
     * @return The name of the extension.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the extension.
     * </p>
     * 
     * @param name
     *        The name of the extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtensionVersionDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The namespace (qualifier) of the extension.
     * </p>
     * 
     * @param namespace
     *        The namespace (qualifier) of the extension.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace (qualifier) of the extension.
     * </p>
     * 
     * @return The namespace (qualifier) of the extension.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace (qualifier) of the extension.
     * </p>
     * 
     * @param namespace
     *        The namespace (qualifier) of the extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtensionVersionDetails withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The model that defines the interface for this extension version.
     * </p>
     * 
     * @param schema
     *        The model that defines the interface for this extension version.
     */

    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * <p>
     * The model that defines the interface for this extension version.
     * </p>
     * 
     * @return The model that defines the interface for this extension version.
     */

    public String getSchema() {
        return this.schema;
    }

    /**
     * <p>
     * The model that defines the interface for this extension version.
     * </p>
     * 
     * @param schema
     *        The model that defines the interface for this extension version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtensionVersionDetails withSchema(String schema) {
        setSchema(schema);
        return this;
    }

    /**
     * <p>
     * The version of the extension.
     * </p>
     * 
     * @param version
     *        The version of the extension.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the extension.
     * </p>
     * 
     * @return The version of the extension.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the extension.
     * </p>
     * 
     * @param version
     *        The version of the extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtensionVersionDetails withVersion(String version) {
        setVersion(version);
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
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getSchema() != null)
            sb.append("Schema: ").append(getSchema()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExtensionVersionDetails == false)
            return false;
        ExtensionVersionDetails other = (ExtensionVersionDetails) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public ExtensionVersionDetails clone() {
        try {
            return (ExtensionVersionDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamesparks.model.transform.ExtensionVersionDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
