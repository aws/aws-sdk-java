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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/CreateModelManifest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateModelManifestRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the vehicle model to create.
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
     * A list of nodes, which are a general abstraction of signals.
     * </p>
     */
    private java.util.List<String> nodes;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a signal catalog.
     * </p>
     */
    private String signalCatalogArn;
    /**
     * <p>
     * Metadata that can be used to manage the vehicle model.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the vehicle model to create.
     * </p>
     * 
     * @param name
     *        The name of the vehicle model to create.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the vehicle model to create.
     * </p>
     * 
     * @return The name of the vehicle model to create.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the vehicle model to create.
     * </p>
     * 
     * @param name
     *        The name of the vehicle model to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelManifestRequest withName(String name) {
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

    public CreateModelManifestRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of nodes, which are a general abstraction of signals.
     * </p>
     * 
     * @return A list of nodes, which are a general abstraction of signals.
     */

    public java.util.List<String> getNodes() {
        return nodes;
    }

    /**
     * <p>
     * A list of nodes, which are a general abstraction of signals.
     * </p>
     * 
     * @param nodes
     *        A list of nodes, which are a general abstraction of signals.
     */

    public void setNodes(java.util.Collection<String> nodes) {
        if (nodes == null) {
            this.nodes = null;
            return;
        }

        this.nodes = new java.util.ArrayList<String>(nodes);
    }

    /**
     * <p>
     * A list of nodes, which are a general abstraction of signals.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNodes(java.util.Collection)} or {@link #withNodes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param nodes
     *        A list of nodes, which are a general abstraction of signals.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelManifestRequest withNodes(String... nodes) {
        if (this.nodes == null) {
            setNodes(new java.util.ArrayList<String>(nodes.length));
        }
        for (String ele : nodes) {
            this.nodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of nodes, which are a general abstraction of signals.
     * </p>
     * 
     * @param nodes
     *        A list of nodes, which are a general abstraction of signals.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelManifestRequest withNodes(java.util.Collection<String> nodes) {
        setNodes(nodes);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a signal catalog.
     * </p>
     * 
     * @param signalCatalogArn
     *        The Amazon Resource Name (ARN) of a signal catalog.
     */

    public void setSignalCatalogArn(String signalCatalogArn) {
        this.signalCatalogArn = signalCatalogArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a signal catalog.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a signal catalog.
     */

    public String getSignalCatalogArn() {
        return this.signalCatalogArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a signal catalog.
     * </p>
     * 
     * @param signalCatalogArn
     *        The Amazon Resource Name (ARN) of a signal catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelManifestRequest withSignalCatalogArn(String signalCatalogArn) {
        setSignalCatalogArn(signalCatalogArn);
        return this;
    }

    /**
     * <p>
     * Metadata that can be used to manage the vehicle model.
     * </p>
     * 
     * @return Metadata that can be used to manage the vehicle model.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata that can be used to manage the vehicle model.
     * </p>
     * 
     * @param tags
     *        Metadata that can be used to manage the vehicle model.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Metadata that can be used to manage the vehicle model.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Metadata that can be used to manage the vehicle model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelManifestRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Metadata that can be used to manage the vehicle model.
     * </p>
     * 
     * @param tags
     *        Metadata that can be used to manage the vehicle model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelManifestRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getNodes() != null)
            sb.append("Nodes: ").append(getNodes()).append(",");
        if (getSignalCatalogArn() != null)
            sb.append("SignalCatalogArn: ").append(getSignalCatalogArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateModelManifestRequest == false)
            return false;
        CreateModelManifestRequest other = (CreateModelManifestRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getNodes() == null ^ this.getNodes() == null)
            return false;
        if (other.getNodes() != null && other.getNodes().equals(this.getNodes()) == false)
            return false;
        if (other.getSignalCatalogArn() == null ^ this.getSignalCatalogArn() == null)
            return false;
        if (other.getSignalCatalogArn() != null && other.getSignalCatalogArn().equals(this.getSignalCatalogArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getNodes() == null) ? 0 : getNodes().hashCode());
        hashCode = prime * hashCode + ((getSignalCatalogArn() == null) ? 0 : getSignalCatalogArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateModelManifestRequest clone() {
        return (CreateModelManifestRequest) super.clone();
    }

}
