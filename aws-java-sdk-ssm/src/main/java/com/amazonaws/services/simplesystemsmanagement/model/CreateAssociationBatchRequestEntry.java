/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;

/**
 * Describes the association of an SSM document and an instance.
 */
public class CreateAssociationBatchRequestEntry implements Serializable,
        Cloneable {

    /** The name of the configuration document. */
    private String name;
    /** The ID of the instance. */
    private String instanceId;
    /** A description of the parameters for a document. */
    private java.util.Map<String, java.util.List<String>> parameters;

    /**
     * The name of the configuration document.
     * 
     * @param name
     *        The name of the configuration document.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the configuration document.
     * 
     * @return The name of the configuration document.
     */
    public String getName() {
        return this.name;
    }

    /**
     * The name of the configuration document.
     * 
     * @param name
     *        The name of the configuration document.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateAssociationBatchRequestEntry withName(String name) {
        setName(name);
        return this;
    }

    /**
     * The ID of the instance.
     * 
     * @param instanceId
     *        The ID of the instance.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * The ID of the instance.
     * 
     * @return The ID of the instance.
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * The ID of the instance.
     * 
     * @param instanceId
     *        The ID of the instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateAssociationBatchRequestEntry withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * A description of the parameters for a document.
     * 
     * @return A description of the parameters for a document.
     */
    public java.util.Map<String, java.util.List<String>> getParameters() {
        return parameters;
    }

    /**
     * A description of the parameters for a document.
     * 
     * @param parameters
     *        A description of the parameters for a document.
     */
    public void setParameters(
            java.util.Map<String, java.util.List<String>> parameters) {
        this.parameters = parameters;
    }

    /**
     * A description of the parameters for a document.
     * 
     * @param parameters
     *        A description of the parameters for a document.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateAssociationBatchRequestEntry withParameters(
            java.util.Map<String, java.util.List<String>> parameters) {
        setParameters(parameters);
        return this;
    }

    public CreateAssociationBatchRequestEntry addParametersEntry(String key,
            java.util.List<String> value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters. &lt;p> Returns a reference
     * to this object so that method calls can be chained together.
     */
    public CreateAssociationBatchRequestEntry clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
            sb.append("Name: " + getName() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAssociationBatchRequestEntry == false)
            return false;
        CreateAssociationBatchRequestEntry other = (CreateAssociationBatchRequestEntry) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public CreateAssociationBatchRequestEntry clone() {
        try {
            return (CreateAssociationBatchRequestEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}