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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetExtension" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetExtensionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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

    public GetExtensionRequest withName(String name) {
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

    public GetExtensionRequest withNamespace(String namespace) {
        setNamespace(namespace);
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
            sb.append("Namespace: ").append(getNamespace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetExtensionRequest == false)
            return false;
        GetExtensionRequest other = (GetExtensionRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        return hashCode;
    }

    @Override
    public GetExtensionRequest clone() {
        return (GetExtensionRequest) super.clone();
    }

}
