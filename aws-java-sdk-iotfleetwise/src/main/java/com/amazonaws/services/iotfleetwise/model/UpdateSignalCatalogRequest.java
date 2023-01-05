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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/UpdateSignalCatalog" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSignalCatalogRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the signal catalog to update.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A brief description of the signal catalog to update.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of information about nodes to add to the signal catalog.
     * </p>
     */
    private java.util.List<Node> nodesToAdd;
    /**
     * <p>
     * A list of information about nodes to update in the signal catalog.
     * </p>
     */
    private java.util.List<Node> nodesToUpdate;
    /**
     * <p>
     * A list of <code>fullyQualifiedName</code> of nodes to remove from the signal catalog.
     * </p>
     */
    private java.util.List<String> nodesToRemove;

    /**
     * <p>
     * The name of the signal catalog to update.
     * </p>
     * 
     * @param name
     *        The name of the signal catalog to update.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the signal catalog to update.
     * </p>
     * 
     * @return The name of the signal catalog to update.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the signal catalog to update.
     * </p>
     * 
     * @param name
     *        The name of the signal catalog to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSignalCatalogRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A brief description of the signal catalog to update.
     * </p>
     * 
     * @param description
     *        A brief description of the signal catalog to update.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A brief description of the signal catalog to update.
     * </p>
     * 
     * @return A brief description of the signal catalog to update.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A brief description of the signal catalog to update.
     * </p>
     * 
     * @param description
     *        A brief description of the signal catalog to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSignalCatalogRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of information about nodes to add to the signal catalog.
     * </p>
     * 
     * @return A list of information about nodes to add to the signal catalog.
     */

    public java.util.List<Node> getNodesToAdd() {
        return nodesToAdd;
    }

    /**
     * <p>
     * A list of information about nodes to add to the signal catalog.
     * </p>
     * 
     * @param nodesToAdd
     *        A list of information about nodes to add to the signal catalog.
     */

    public void setNodesToAdd(java.util.Collection<Node> nodesToAdd) {
        if (nodesToAdd == null) {
            this.nodesToAdd = null;
            return;
        }

        this.nodesToAdd = new java.util.ArrayList<Node>(nodesToAdd);
    }

    /**
     * <p>
     * A list of information about nodes to add to the signal catalog.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNodesToAdd(java.util.Collection)} or {@link #withNodesToAdd(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param nodesToAdd
     *        A list of information about nodes to add to the signal catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSignalCatalogRequest withNodesToAdd(Node... nodesToAdd) {
        if (this.nodesToAdd == null) {
            setNodesToAdd(new java.util.ArrayList<Node>(nodesToAdd.length));
        }
        for (Node ele : nodesToAdd) {
            this.nodesToAdd.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of information about nodes to add to the signal catalog.
     * </p>
     * 
     * @param nodesToAdd
     *        A list of information about nodes to add to the signal catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSignalCatalogRequest withNodesToAdd(java.util.Collection<Node> nodesToAdd) {
        setNodesToAdd(nodesToAdd);
        return this;
    }

    /**
     * <p>
     * A list of information about nodes to update in the signal catalog.
     * </p>
     * 
     * @return A list of information about nodes to update in the signal catalog.
     */

    public java.util.List<Node> getNodesToUpdate() {
        return nodesToUpdate;
    }

    /**
     * <p>
     * A list of information about nodes to update in the signal catalog.
     * </p>
     * 
     * @param nodesToUpdate
     *        A list of information about nodes to update in the signal catalog.
     */

    public void setNodesToUpdate(java.util.Collection<Node> nodesToUpdate) {
        if (nodesToUpdate == null) {
            this.nodesToUpdate = null;
            return;
        }

        this.nodesToUpdate = new java.util.ArrayList<Node>(nodesToUpdate);
    }

    /**
     * <p>
     * A list of information about nodes to update in the signal catalog.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNodesToUpdate(java.util.Collection)} or {@link #withNodesToUpdate(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param nodesToUpdate
     *        A list of information about nodes to update in the signal catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSignalCatalogRequest withNodesToUpdate(Node... nodesToUpdate) {
        if (this.nodesToUpdate == null) {
            setNodesToUpdate(new java.util.ArrayList<Node>(nodesToUpdate.length));
        }
        for (Node ele : nodesToUpdate) {
            this.nodesToUpdate.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of information about nodes to update in the signal catalog.
     * </p>
     * 
     * @param nodesToUpdate
     *        A list of information about nodes to update in the signal catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSignalCatalogRequest withNodesToUpdate(java.util.Collection<Node> nodesToUpdate) {
        setNodesToUpdate(nodesToUpdate);
        return this;
    }

    /**
     * <p>
     * A list of <code>fullyQualifiedName</code> of nodes to remove from the signal catalog.
     * </p>
     * 
     * @return A list of <code>fullyQualifiedName</code> of nodes to remove from the signal catalog.
     */

    public java.util.List<String> getNodesToRemove() {
        return nodesToRemove;
    }

    /**
     * <p>
     * A list of <code>fullyQualifiedName</code> of nodes to remove from the signal catalog.
     * </p>
     * 
     * @param nodesToRemove
     *        A list of <code>fullyQualifiedName</code> of nodes to remove from the signal catalog.
     */

    public void setNodesToRemove(java.util.Collection<String> nodesToRemove) {
        if (nodesToRemove == null) {
            this.nodesToRemove = null;
            return;
        }

        this.nodesToRemove = new java.util.ArrayList<String>(nodesToRemove);
    }

    /**
     * <p>
     * A list of <code>fullyQualifiedName</code> of nodes to remove from the signal catalog.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNodesToRemove(java.util.Collection)} or {@link #withNodesToRemove(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param nodesToRemove
     *        A list of <code>fullyQualifiedName</code> of nodes to remove from the signal catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSignalCatalogRequest withNodesToRemove(String... nodesToRemove) {
        if (this.nodesToRemove == null) {
            setNodesToRemove(new java.util.ArrayList<String>(nodesToRemove.length));
        }
        for (String ele : nodesToRemove) {
            this.nodesToRemove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>fullyQualifiedName</code> of nodes to remove from the signal catalog.
     * </p>
     * 
     * @param nodesToRemove
     *        A list of <code>fullyQualifiedName</code> of nodes to remove from the signal catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSignalCatalogRequest withNodesToRemove(java.util.Collection<String> nodesToRemove) {
        setNodesToRemove(nodesToRemove);
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
        if (getNodesToAdd() != null)
            sb.append("NodesToAdd: ").append(getNodesToAdd()).append(",");
        if (getNodesToUpdate() != null)
            sb.append("NodesToUpdate: ").append(getNodesToUpdate()).append(",");
        if (getNodesToRemove() != null)
            sb.append("NodesToRemove: ").append(getNodesToRemove());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSignalCatalogRequest == false)
            return false;
        UpdateSignalCatalogRequest other = (UpdateSignalCatalogRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getNodesToAdd() == null ^ this.getNodesToAdd() == null)
            return false;
        if (other.getNodesToAdd() != null && other.getNodesToAdd().equals(this.getNodesToAdd()) == false)
            return false;
        if (other.getNodesToUpdate() == null ^ this.getNodesToUpdate() == null)
            return false;
        if (other.getNodesToUpdate() != null && other.getNodesToUpdate().equals(this.getNodesToUpdate()) == false)
            return false;
        if (other.getNodesToRemove() == null ^ this.getNodesToRemove() == null)
            return false;
        if (other.getNodesToRemove() != null && other.getNodesToRemove().equals(this.getNodesToRemove()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getNodesToAdd() == null) ? 0 : getNodesToAdd().hashCode());
        hashCode = prime * hashCode + ((getNodesToUpdate() == null) ? 0 : getNodesToUpdate().hashCode());
        hashCode = prime * hashCode + ((getNodesToRemove() == null) ? 0 : getNodesToRemove().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSignalCatalogRequest clone() {
        return (UpdateSignalCatalogRequest) super.clone();
    }

}
