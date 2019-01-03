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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns the path to the <code>ObjectIdentifiers</code> that is associated with the directory.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/PathToObjectIdentifiers"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PathToObjectIdentifiers implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The path that is used to identify the object starting from directory root.
     * </p>
     */
    private String path;
    /**
     * <p>
     * Lists <code>ObjectIdentifiers</code> starting from directory root to the object in the request.
     * </p>
     */
    private java.util.List<String> objectIdentifiers;

    /**
     * <p>
     * The path that is used to identify the object starting from directory root.
     * </p>
     * 
     * @param path
     *        The path that is used to identify the object starting from directory root.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path that is used to identify the object starting from directory root.
     * </p>
     * 
     * @return The path that is used to identify the object starting from directory root.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path that is used to identify the object starting from directory root.
     * </p>
     * 
     * @param path
     *        The path that is used to identify the object starting from directory root.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathToObjectIdentifiers withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * Lists <code>ObjectIdentifiers</code> starting from directory root to the object in the request.
     * </p>
     * 
     * @return Lists <code>ObjectIdentifiers</code> starting from directory root to the object in the request.
     */

    public java.util.List<String> getObjectIdentifiers() {
        return objectIdentifiers;
    }

    /**
     * <p>
     * Lists <code>ObjectIdentifiers</code> starting from directory root to the object in the request.
     * </p>
     * 
     * @param objectIdentifiers
     *        Lists <code>ObjectIdentifiers</code> starting from directory root to the object in the request.
     */

    public void setObjectIdentifiers(java.util.Collection<String> objectIdentifiers) {
        if (objectIdentifiers == null) {
            this.objectIdentifiers = null;
            return;
        }

        this.objectIdentifiers = new java.util.ArrayList<String>(objectIdentifiers);
    }

    /**
     * <p>
     * Lists <code>ObjectIdentifiers</code> starting from directory root to the object in the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setObjectIdentifiers(java.util.Collection)} or {@link #withObjectIdentifiers(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param objectIdentifiers
     *        Lists <code>ObjectIdentifiers</code> starting from directory root to the object in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathToObjectIdentifiers withObjectIdentifiers(String... objectIdentifiers) {
        if (this.objectIdentifiers == null) {
            setObjectIdentifiers(new java.util.ArrayList<String>(objectIdentifiers.length));
        }
        for (String ele : objectIdentifiers) {
            this.objectIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists <code>ObjectIdentifiers</code> starting from directory root to the object in the request.
     * </p>
     * 
     * @param objectIdentifiers
     *        Lists <code>ObjectIdentifiers</code> starting from directory root to the object in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathToObjectIdentifiers withObjectIdentifiers(java.util.Collection<String> objectIdentifiers) {
        setObjectIdentifiers(objectIdentifiers);
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
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getObjectIdentifiers() != null)
            sb.append("ObjectIdentifiers: ").append(getObjectIdentifiers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PathToObjectIdentifiers == false)
            return false;
        PathToObjectIdentifiers other = (PathToObjectIdentifiers) obj;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getObjectIdentifiers() == null ^ this.getObjectIdentifiers() == null)
            return false;
        if (other.getObjectIdentifiers() != null && other.getObjectIdentifiers().equals(this.getObjectIdentifiers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getObjectIdentifiers() == null) ? 0 : getObjectIdentifiers().hashCode());
        return hashCode;
    }

    @Override
    public PathToObjectIdentifiers clone() {
        try {
            return (PathToObjectIdentifiers) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.PathToObjectIdentifiersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
