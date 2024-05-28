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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateWorkflow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorkflowRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the workflow.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description for the workflow.
     * </p>
     */
    private String description;
    /**
     * <p>
     * An engine for the workflow.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * A ZIP archive for the workflow.
     * </p>
     */
    private java.nio.ByteBuffer definitionZip;
    /**
     * <p>
     * The URI of a definition for the workflow.
     * </p>
     */
    private String definitionUri;
    /**
     * <p>
     * The path of the main definition file for the workflow.
     * </p>
     */
    private String main;
    /**
     * <p>
     * A parameter template for the workflow.
     * </p>
     */
    private java.util.Map<String, WorkflowParameter> parameterTemplate;
    /**
     * <p>
     * The storage capacity for the workflow in gibibytes.
     * </p>
     */
    private Integer storageCapacity;
    /**
     * <p>
     * Tags for the workflow.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * To ensure that requests don't run multiple times, specify a unique ID for each request.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The computational accelerator specified to run the workflow.
     * </p>
     */
    private String accelerators;

    /**
     * <p>
     * A name for the workflow.
     * </p>
     * 
     * @param name
     *        A name for the workflow.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the workflow.
     * </p>
     * 
     * @return A name for the workflow.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the workflow.
     * </p>
     * 
     * @param name
     *        A name for the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description for the workflow.
     * </p>
     * 
     * @param description
     *        A description for the workflow.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the workflow.
     * </p>
     * 
     * @return A description for the workflow.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the workflow.
     * </p>
     * 
     * @param description
     *        A description for the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * An engine for the workflow.
     * </p>
     * 
     * @param engine
     *        An engine for the workflow.
     * @see WorkflowEngine
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * An engine for the workflow.
     * </p>
     * 
     * @return An engine for the workflow.
     * @see WorkflowEngine
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * An engine for the workflow.
     * </p>
     * 
     * @param engine
     *        An engine for the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowEngine
     */

    public CreateWorkflowRequest withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * An engine for the workflow.
     * </p>
     * 
     * @param engine
     *        An engine for the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowEngine
     */

    public CreateWorkflowRequest withEngine(WorkflowEngine engine) {
        this.engine = engine.toString();
        return this;
    }

    /**
     * <p>
     * A ZIP archive for the workflow.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param definitionZip
     *        A ZIP archive for the workflow.
     */

    public void setDefinitionZip(java.nio.ByteBuffer definitionZip) {
        this.definitionZip = definitionZip;
    }

    /**
     * <p>
     * A ZIP archive for the workflow.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return A ZIP archive for the workflow.
     */

    public java.nio.ByteBuffer getDefinitionZip() {
        return this.definitionZip;
    }

    /**
     * <p>
     * A ZIP archive for the workflow.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param definitionZip
     *        A ZIP archive for the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowRequest withDefinitionZip(java.nio.ByteBuffer definitionZip) {
        setDefinitionZip(definitionZip);
        return this;
    }

    /**
     * <p>
     * The URI of a definition for the workflow.
     * </p>
     * 
     * @param definitionUri
     *        The URI of a definition for the workflow.
     */

    public void setDefinitionUri(String definitionUri) {
        this.definitionUri = definitionUri;
    }

    /**
     * <p>
     * The URI of a definition for the workflow.
     * </p>
     * 
     * @return The URI of a definition for the workflow.
     */

    public String getDefinitionUri() {
        return this.definitionUri;
    }

    /**
     * <p>
     * The URI of a definition for the workflow.
     * </p>
     * 
     * @param definitionUri
     *        The URI of a definition for the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowRequest withDefinitionUri(String definitionUri) {
        setDefinitionUri(definitionUri);
        return this;
    }

    /**
     * <p>
     * The path of the main definition file for the workflow.
     * </p>
     * 
     * @param main
     *        The path of the main definition file for the workflow.
     */

    public void setMain(String main) {
        this.main = main;
    }

    /**
     * <p>
     * The path of the main definition file for the workflow.
     * </p>
     * 
     * @return The path of the main definition file for the workflow.
     */

    public String getMain() {
        return this.main;
    }

    /**
     * <p>
     * The path of the main definition file for the workflow.
     * </p>
     * 
     * @param main
     *        The path of the main definition file for the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowRequest withMain(String main) {
        setMain(main);
        return this;
    }

    /**
     * <p>
     * A parameter template for the workflow.
     * </p>
     * 
     * @return A parameter template for the workflow.
     */

    public java.util.Map<String, WorkflowParameter> getParameterTemplate() {
        return parameterTemplate;
    }

    /**
     * <p>
     * A parameter template for the workflow.
     * </p>
     * 
     * @param parameterTemplate
     *        A parameter template for the workflow.
     */

    public void setParameterTemplate(java.util.Map<String, WorkflowParameter> parameterTemplate) {
        this.parameterTemplate = parameterTemplate;
    }

    /**
     * <p>
     * A parameter template for the workflow.
     * </p>
     * 
     * @param parameterTemplate
     *        A parameter template for the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowRequest withParameterTemplate(java.util.Map<String, WorkflowParameter> parameterTemplate) {
        setParameterTemplate(parameterTemplate);
        return this;
    }

    /**
     * Add a single ParameterTemplate entry
     *
     * @see CreateWorkflowRequest#withParameterTemplate
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowRequest addParameterTemplateEntry(String key, WorkflowParameter value) {
        if (null == this.parameterTemplate) {
            this.parameterTemplate = new java.util.HashMap<String, WorkflowParameter>();
        }
        if (this.parameterTemplate.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameterTemplate.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ParameterTemplate.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowRequest clearParameterTemplateEntries() {
        this.parameterTemplate = null;
        return this;
    }

    /**
     * <p>
     * The storage capacity for the workflow in gibibytes.
     * </p>
     * 
     * @param storageCapacity
     *        The storage capacity for the workflow in gibibytes.
     */

    public void setStorageCapacity(Integer storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    /**
     * <p>
     * The storage capacity for the workflow in gibibytes.
     * </p>
     * 
     * @return The storage capacity for the workflow in gibibytes.
     */

    public Integer getStorageCapacity() {
        return this.storageCapacity;
    }

    /**
     * <p>
     * The storage capacity for the workflow in gibibytes.
     * </p>
     * 
     * @param storageCapacity
     *        The storage capacity for the workflow in gibibytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowRequest withStorageCapacity(Integer storageCapacity) {
        setStorageCapacity(storageCapacity);
        return this;
    }

    /**
     * <p>
     * Tags for the workflow.
     * </p>
     * 
     * @return Tags for the workflow.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags for the workflow.
     * </p>
     * 
     * @param tags
     *        Tags for the workflow.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags for the workflow.
     * </p>
     * 
     * @param tags
     *        Tags for the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateWorkflowRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * To ensure that requests don't run multiple times, specify a unique ID for each request.
     * </p>
     * 
     * @param requestId
     *        To ensure that requests don't run multiple times, specify a unique ID for each request.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * To ensure that requests don't run multiple times, specify a unique ID for each request.
     * </p>
     * 
     * @return To ensure that requests don't run multiple times, specify a unique ID for each request.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * To ensure that requests don't run multiple times, specify a unique ID for each request.
     * </p>
     * 
     * @param requestId
     *        To ensure that requests don't run multiple times, specify a unique ID for each request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkflowRequest withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * The computational accelerator specified to run the workflow.
     * </p>
     * 
     * @param accelerators
     *        The computational accelerator specified to run the workflow.
     * @see Accelerators
     */

    public void setAccelerators(String accelerators) {
        this.accelerators = accelerators;
    }

    /**
     * <p>
     * The computational accelerator specified to run the workflow.
     * </p>
     * 
     * @return The computational accelerator specified to run the workflow.
     * @see Accelerators
     */

    public String getAccelerators() {
        return this.accelerators;
    }

    /**
     * <p>
     * The computational accelerator specified to run the workflow.
     * </p>
     * 
     * @param accelerators
     *        The computational accelerator specified to run the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Accelerators
     */

    public CreateWorkflowRequest withAccelerators(String accelerators) {
        setAccelerators(accelerators);
        return this;
    }

    /**
     * <p>
     * The computational accelerator specified to run the workflow.
     * </p>
     * 
     * @param accelerators
     *        The computational accelerator specified to run the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Accelerators
     */

    public CreateWorkflowRequest withAccelerators(Accelerators accelerators) {
        this.accelerators = accelerators.toString();
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
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getDefinitionZip() != null)
            sb.append("DefinitionZip: ").append(getDefinitionZip()).append(",");
        if (getDefinitionUri() != null)
            sb.append("DefinitionUri: ").append(getDefinitionUri()).append(",");
        if (getMain() != null)
            sb.append("Main: ").append(getMain()).append(",");
        if (getParameterTemplate() != null)
            sb.append("ParameterTemplate: ").append(getParameterTemplate()).append(",");
        if (getStorageCapacity() != null)
            sb.append("StorageCapacity: ").append(getStorageCapacity()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getAccelerators() != null)
            sb.append("Accelerators: ").append(getAccelerators());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWorkflowRequest == false)
            return false;
        CreateWorkflowRequest other = (CreateWorkflowRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getDefinitionZip() == null ^ this.getDefinitionZip() == null)
            return false;
        if (other.getDefinitionZip() != null && other.getDefinitionZip().equals(this.getDefinitionZip()) == false)
            return false;
        if (other.getDefinitionUri() == null ^ this.getDefinitionUri() == null)
            return false;
        if (other.getDefinitionUri() != null && other.getDefinitionUri().equals(this.getDefinitionUri()) == false)
            return false;
        if (other.getMain() == null ^ this.getMain() == null)
            return false;
        if (other.getMain() != null && other.getMain().equals(this.getMain()) == false)
            return false;
        if (other.getParameterTemplate() == null ^ this.getParameterTemplate() == null)
            return false;
        if (other.getParameterTemplate() != null && other.getParameterTemplate().equals(this.getParameterTemplate()) == false)
            return false;
        if (other.getStorageCapacity() == null ^ this.getStorageCapacity() == null)
            return false;
        if (other.getStorageCapacity() != null && other.getStorageCapacity().equals(this.getStorageCapacity()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getAccelerators() == null ^ this.getAccelerators() == null)
            return false;
        if (other.getAccelerators() != null && other.getAccelerators().equals(this.getAccelerators()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getDefinitionZip() == null) ? 0 : getDefinitionZip().hashCode());
        hashCode = prime * hashCode + ((getDefinitionUri() == null) ? 0 : getDefinitionUri().hashCode());
        hashCode = prime * hashCode + ((getMain() == null) ? 0 : getMain().hashCode());
        hashCode = prime * hashCode + ((getParameterTemplate() == null) ? 0 : getParameterTemplate().hashCode());
        hashCode = prime * hashCode + ((getStorageCapacity() == null) ? 0 : getStorageCapacity().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getAccelerators() == null) ? 0 : getAccelerators().hashCode());
        return hashCode;
    }

    @Override
    public CreateWorkflowRequest clone() {
        return (CreateWorkflowRequest) super.clone();
    }

}
