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
package com.amazonaws.services.entityresolution.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/DeleteIdNamespace" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteIdNamespaceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the ID namespace.
     * </p>
     */
    private String idNamespaceName;

    /**
     * <p>
     * The name of the ID namespace.
     * </p>
     * 
     * @param idNamespaceName
     *        The name of the ID namespace.
     */

    public void setIdNamespaceName(String idNamespaceName) {
        this.idNamespaceName = idNamespaceName;
    }

    /**
     * <p>
     * The name of the ID namespace.
     * </p>
     * 
     * @return The name of the ID namespace.
     */

    public String getIdNamespaceName() {
        return this.idNamespaceName;
    }

    /**
     * <p>
     * The name of the ID namespace.
     * </p>
     * 
     * @param idNamespaceName
     *        The name of the ID namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteIdNamespaceRequest withIdNamespaceName(String idNamespaceName) {
        setIdNamespaceName(idNamespaceName);
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
        if (getIdNamespaceName() != null)
            sb.append("IdNamespaceName: ").append(getIdNamespaceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteIdNamespaceRequest == false)
            return false;
        DeleteIdNamespaceRequest other = (DeleteIdNamespaceRequest) obj;
        if (other.getIdNamespaceName() == null ^ this.getIdNamespaceName() == null)
            return false;
        if (other.getIdNamespaceName() != null && other.getIdNamespaceName().equals(this.getIdNamespaceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdNamespaceName() == null) ? 0 : getIdNamespaceName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteIdNamespaceRequest clone() {
        return (DeleteIdNamespaceRequest) super.clone();
    }

}
