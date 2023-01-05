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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/BatchDisassociateResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDisassociateResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the resource set, used in a TODO to refer to the resource set.
     * </p>
     */
    private String resourceSetIdentifier;
    /**
     * <p>
     * The uniform resource identifiers (URI) of resources that should be disassociated from the resource set. The URIs
     * must be Amazon Resource Names (ARNs).
     * </p>
     */
    private java.util.List<String> items;

    /**
     * <p>
     * A unique identifier for the resource set, used in a TODO to refer to the resource set.
     * </p>
     * 
     * @param resourceSetIdentifier
     *        A unique identifier for the resource set, used in a TODO to refer to the resource set.
     */

    public void setResourceSetIdentifier(String resourceSetIdentifier) {
        this.resourceSetIdentifier = resourceSetIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the resource set, used in a TODO to refer to the resource set.
     * </p>
     * 
     * @return A unique identifier for the resource set, used in a TODO to refer to the resource set.
     */

    public String getResourceSetIdentifier() {
        return this.resourceSetIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the resource set, used in a TODO to refer to the resource set.
     * </p>
     * 
     * @param resourceSetIdentifier
     *        A unique identifier for the resource set, used in a TODO to refer to the resource set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateResourceRequest withResourceSetIdentifier(String resourceSetIdentifier) {
        setResourceSetIdentifier(resourceSetIdentifier);
        return this;
    }

    /**
     * <p>
     * The uniform resource identifiers (URI) of resources that should be disassociated from the resource set. The URIs
     * must be Amazon Resource Names (ARNs).
     * </p>
     * 
     * @return The uniform resource identifiers (URI) of resources that should be disassociated from the resource set.
     *         The URIs must be Amazon Resource Names (ARNs).
     */

    public java.util.List<String> getItems() {
        return items;
    }

    /**
     * <p>
     * The uniform resource identifiers (URI) of resources that should be disassociated from the resource set. The URIs
     * must be Amazon Resource Names (ARNs).
     * </p>
     * 
     * @param items
     *        The uniform resource identifiers (URI) of resources that should be disassociated from the resource set.
     *        The URIs must be Amazon Resource Names (ARNs).
     */

    public void setItems(java.util.Collection<String> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<String>(items);
    }

    /**
     * <p>
     * The uniform resource identifiers (URI) of resources that should be disassociated from the resource set. The URIs
     * must be Amazon Resource Names (ARNs).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        The uniform resource identifiers (URI) of resources that should be disassociated from the resource set.
     *        The URIs must be Amazon Resource Names (ARNs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateResourceRequest withItems(String... items) {
        if (this.items == null) {
            setItems(new java.util.ArrayList<String>(items.length));
        }
        for (String ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The uniform resource identifiers (URI) of resources that should be disassociated from the resource set. The URIs
     * must be Amazon Resource Names (ARNs).
     * </p>
     * 
     * @param items
     *        The uniform resource identifiers (URI) of resources that should be disassociated from the resource set.
     *        The URIs must be Amazon Resource Names (ARNs).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateResourceRequest withItems(java.util.Collection<String> items) {
        setItems(items);
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
        if (getResourceSetIdentifier() != null)
            sb.append("ResourceSetIdentifier: ").append(getResourceSetIdentifier()).append(",");
        if (getItems() != null)
            sb.append("Items: ").append(getItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDisassociateResourceRequest == false)
            return false;
        BatchDisassociateResourceRequest other = (BatchDisassociateResourceRequest) obj;
        if (other.getResourceSetIdentifier() == null ^ this.getResourceSetIdentifier() == null)
            return false;
        if (other.getResourceSetIdentifier() != null && other.getResourceSetIdentifier().equals(this.getResourceSetIdentifier()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceSetIdentifier() == null) ? 0 : getResourceSetIdentifier().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        return hashCode;
    }

    @Override
    public BatchDisassociateResourceRequest clone() {
        return (BatchDisassociateResourceRequest) super.clone();
    }

}
