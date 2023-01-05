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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/UpdateModelManifest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateModelManifestRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the vehicle model to update.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A brief description of the vehicle model.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of <code>fullyQualifiedName</code> of nodes, which are a general abstraction of signals, to add to the
     * vehicle model.
     * </p>
     */
    private java.util.List<String> nodesToAdd;
    /**
     * <p>
     * A list of <code>fullyQualifiedName</code> of nodes, which are a general abstraction of signals, to remove from
     * the vehicle model.
     * </p>
     */
    private java.util.List<String> nodesToRemove;
    /**
     * <p>
     * The state of the vehicle model. If the status is <code>ACTIVE</code>, the vehicle model can't be edited. If the
     * status is <code>DRAFT</code>, you can edit the vehicle model.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name of the vehicle model to update.
     * </p>
     * 
     * @param name
     *        The name of the vehicle model to update.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the vehicle model to update.
     * </p>
     * 
     * @return The name of the vehicle model to update.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the vehicle model to update.
     * </p>
     * 
     * @param name
     *        The name of the vehicle model to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateModelManifestRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A brief description of the vehicle model.
     * </p>
     * 
     * @param description
     *        A brief description of the vehicle model.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A brief description of the vehicle model.
     * </p>
     * 
     * @return A brief description of the vehicle model.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A brief description of the vehicle model.
     * </p>
     * 
     * @param description
     *        A brief description of the vehicle model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateModelManifestRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of <code>fullyQualifiedName</code> of nodes, which are a general abstraction of signals, to add to the
     * vehicle model.
     * </p>
     * 
     * @return A list of <code>fullyQualifiedName</code> of nodes, which are a general abstraction of signals, to add to
     *         the vehicle model.
     */

    public java.util.List<String> getNodesToAdd() {
        return nodesToAdd;
    }

    /**
     * <p>
     * A list of <code>fullyQualifiedName</code> of nodes, which are a general abstraction of signals, to add to the
     * vehicle model.
     * </p>
     * 
     * @param nodesToAdd
     *        A list of <code>fullyQualifiedName</code> of nodes, which are a general abstraction of signals, to add to
     *        the vehicle model.
     */

    public void setNodesToAdd(java.util.Collection<String> nodesToAdd) {
        if (nodesToAdd == null) {
            this.nodesToAdd = null;
            return;
        }

        this.nodesToAdd = new java.util.ArrayList<String>(nodesToAdd);
    }

    /**
     * <p>
     * A list of <code>fullyQualifiedName</code> of nodes, which are a general abstraction of signals, to add to the
     * vehicle model.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNodesToAdd(java.util.Collection)} or {@link #withNodesToAdd(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param nodesToAdd
     *        A list of <code>fullyQualifiedName</code> of nodes, which are a general abstraction of signals, to add to
     *        the vehicle model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateModelManifestRequest withNodesToAdd(String... nodesToAdd) {
        if (this.nodesToAdd == null) {
            setNodesToAdd(new java.util.ArrayList<String>(nodesToAdd.length));
        }
        for (String ele : nodesToAdd) {
            this.nodesToAdd.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>fullyQualifiedName</code> of nodes, which are a general abstraction of signals, to add to the
     * vehicle model.
     * </p>
     * 
     * @param nodesToAdd
     *        A list of <code>fullyQualifiedName</code> of nodes, which are a general abstraction of signals, to add to
     *        the vehicle model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateModelManifestRequest withNodesToAdd(java.util.Collection<String> nodesToAdd) {
        setNodesToAdd(nodesToAdd);
        return this;
    }

    /**
     * <p>
     * A list of <code>fullyQualifiedName</code> of nodes, which are a general abstraction of signals, to remove from
     * the vehicle model.
     * </p>
     * 
     * @return A list of <code>fullyQualifiedName</code> of nodes, which are a general abstraction of signals, to remove
     *         from the vehicle model.
     */

    public java.util.List<String> getNodesToRemove() {
        return nodesToRemove;
    }

    /**
     * <p>
     * A list of <code>fullyQualifiedName</code> of nodes, which are a general abstraction of signals, to remove from
     * the vehicle model.
     * </p>
     * 
     * @param nodesToRemove
     *        A list of <code>fullyQualifiedName</code> of nodes, which are a general abstraction of signals, to remove
     *        from the vehicle model.
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
     * A list of <code>fullyQualifiedName</code> of nodes, which are a general abstraction of signals, to remove from
     * the vehicle model.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNodesToRemove(java.util.Collection)} or {@link #withNodesToRemove(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param nodesToRemove
     *        A list of <code>fullyQualifiedName</code> of nodes, which are a general abstraction of signals, to remove
     *        from the vehicle model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateModelManifestRequest withNodesToRemove(String... nodesToRemove) {
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
     * A list of <code>fullyQualifiedName</code> of nodes, which are a general abstraction of signals, to remove from
     * the vehicle model.
     * </p>
     * 
     * @param nodesToRemove
     *        A list of <code>fullyQualifiedName</code> of nodes, which are a general abstraction of signals, to remove
     *        from the vehicle model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateModelManifestRequest withNodesToRemove(java.util.Collection<String> nodesToRemove) {
        setNodesToRemove(nodesToRemove);
        return this;
    }

    /**
     * <p>
     * The state of the vehicle model. If the status is <code>ACTIVE</code>, the vehicle model can't be edited. If the
     * status is <code>DRAFT</code>, you can edit the vehicle model.
     * </p>
     * 
     * @param status
     *        The state of the vehicle model. If the status is <code>ACTIVE</code>, the vehicle model can't be edited.
     *        If the status is <code>DRAFT</code>, you can edit the vehicle model.
     * @see ManifestStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The state of the vehicle model. If the status is <code>ACTIVE</code>, the vehicle model can't be edited. If the
     * status is <code>DRAFT</code>, you can edit the vehicle model.
     * </p>
     * 
     * @return The state of the vehicle model. If the status is <code>ACTIVE</code>, the vehicle model can't be edited.
     *         If the status is <code>DRAFT</code>, you can edit the vehicle model.
     * @see ManifestStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The state of the vehicle model. If the status is <code>ACTIVE</code>, the vehicle model can't be edited. If the
     * status is <code>DRAFT</code>, you can edit the vehicle model.
     * </p>
     * 
     * @param status
     *        The state of the vehicle model. If the status is <code>ACTIVE</code>, the vehicle model can't be edited.
     *        If the status is <code>DRAFT</code>, you can edit the vehicle model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ManifestStatus
     */

    public UpdateModelManifestRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The state of the vehicle model. If the status is <code>ACTIVE</code>, the vehicle model can't be edited. If the
     * status is <code>DRAFT</code>, you can edit the vehicle model.
     * </p>
     * 
     * @param status
     *        The state of the vehicle model. If the status is <code>ACTIVE</code>, the vehicle model can't be edited.
     *        If the status is <code>DRAFT</code>, you can edit the vehicle model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ManifestStatus
     */

    public UpdateModelManifestRequest withStatus(ManifestStatus status) {
        this.status = status.toString();
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
        if (getNodesToRemove() != null)
            sb.append("NodesToRemove: ").append(getNodesToRemove()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateModelManifestRequest == false)
            return false;
        UpdateModelManifestRequest other = (UpdateModelManifestRequest) obj;
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
        if (other.getNodesToRemove() == null ^ this.getNodesToRemove() == null)
            return false;
        if (other.getNodesToRemove() != null && other.getNodesToRemove().equals(this.getNodesToRemove()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        hashCode = prime * hashCode + ((getNodesToRemove() == null) ? 0 : getNodesToRemove().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateModelManifestRequest clone() {
        return (UpdateModelManifestRequest) super.clone();
    }

}
