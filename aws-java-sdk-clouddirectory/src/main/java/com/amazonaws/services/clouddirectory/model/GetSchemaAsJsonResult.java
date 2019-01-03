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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/GetSchemaAsJson" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSchemaAsJsonResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the retrieved schema.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The JSON representation of the schema document.
     * </p>
     */
    private String document;

    /**
     * <p>
     * The name of the retrieved schema.
     * </p>
     * 
     * @param name
     *        The name of the retrieved schema.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the retrieved schema.
     * </p>
     * 
     * @return The name of the retrieved schema.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the retrieved schema.
     * </p>
     * 
     * @param name
     *        The name of the retrieved schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSchemaAsJsonResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The JSON representation of the schema document.
     * </p>
     * 
     * @param document
     *        The JSON representation of the schema document.
     */

    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * <p>
     * The JSON representation of the schema document.
     * </p>
     * 
     * @return The JSON representation of the schema document.
     */

    public String getDocument() {
        return this.document;
    }

    /**
     * <p>
     * The JSON representation of the schema document.
     * </p>
     * 
     * @param document
     *        The JSON representation of the schema document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSchemaAsJsonResult withDocument(String document) {
        setDocument(document);
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
        if (getDocument() != null)
            sb.append("Document: ").append(getDocument());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSchemaAsJsonResult == false)
            return false;
        GetSchemaAsJsonResult other = (GetSchemaAsJsonResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDocument() == null ^ this.getDocument() == null)
            return false;
        if (other.getDocument() != null && other.getDocument().equals(this.getDocument()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode());
        return hashCode;
    }

    @Override
    public GetSchemaAsJsonResult clone() {
        try {
            return (GetSchemaAsJsonResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
