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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the task action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/TaskActionDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskActionDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name. Supports variable injection. For more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html">JSONPath
     * reference</a> in the <i>Amazon Connect Administrators Guide</i>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description. Supports variable injection. For more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html">JSONPath
     * reference</a> in the <i>Amazon Connect Administrators Guide</i>.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The identifier of the flow.
     * </p>
     */
    private String contactFlowId;
    /**
     * <p>
     * Information about the reference when the <code>referenceType</code> is <code>URL</code>. Otherwise, null.
     * (Supports variable injection in the <code>Value</code> field.)
     * </p>
     */
    private java.util.Map<String, Reference> references;

    /**
     * <p>
     * The name. Supports variable injection. For more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html">JSONPath
     * reference</a> in the <i>Amazon Connect Administrators Guide</i>.
     * </p>
     * 
     * @param name
     *        The name. Supports variable injection. For more information, see <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html">JSONPath
     *        reference</a> in the <i>Amazon Connect Administrators Guide</i>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name. Supports variable injection. For more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html">JSONPath
     * reference</a> in the <i>Amazon Connect Administrators Guide</i>.
     * </p>
     * 
     * @return The name. Supports variable injection. For more information, see <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html"
     *         >JSONPath reference</a> in the <i>Amazon Connect Administrators Guide</i>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name. Supports variable injection. For more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html">JSONPath
     * reference</a> in the <i>Amazon Connect Administrators Guide</i>.
     * </p>
     * 
     * @param name
     *        The name. Supports variable injection. For more information, see <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html">JSONPath
     *        reference</a> in the <i>Amazon Connect Administrators Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskActionDefinition withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description. Supports variable injection. For more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html">JSONPath
     * reference</a> in the <i>Amazon Connect Administrators Guide</i>.
     * </p>
     * 
     * @param description
     *        The description. Supports variable injection. For more information, see <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html">JSONPath
     *        reference</a> in the <i>Amazon Connect Administrators Guide</i>.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description. Supports variable injection. For more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html">JSONPath
     * reference</a> in the <i>Amazon Connect Administrators Guide</i>.
     * </p>
     * 
     * @return The description. Supports variable injection. For more information, see <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html"
     *         >JSONPath reference</a> in the <i>Amazon Connect Administrators Guide</i>.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description. Supports variable injection. For more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html">JSONPath
     * reference</a> in the <i>Amazon Connect Administrators Guide</i>.
     * </p>
     * 
     * @param description
     *        The description. Supports variable injection. For more information, see <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/contact-lens-variable-injection.html">JSONPath
     *        reference</a> in the <i>Amazon Connect Administrators Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskActionDefinition withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The identifier of the flow.
     * </p>
     * 
     * @param contactFlowId
     *        The identifier of the flow.
     */

    public void setContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
    }

    /**
     * <p>
     * The identifier of the flow.
     * </p>
     * 
     * @return The identifier of the flow.
     */

    public String getContactFlowId() {
        return this.contactFlowId;
    }

    /**
     * <p>
     * The identifier of the flow.
     * </p>
     * 
     * @param contactFlowId
     *        The identifier of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskActionDefinition withContactFlowId(String contactFlowId) {
        setContactFlowId(contactFlowId);
        return this;
    }

    /**
     * <p>
     * Information about the reference when the <code>referenceType</code> is <code>URL</code>. Otherwise, null.
     * (Supports variable injection in the <code>Value</code> field.)
     * </p>
     * 
     * @return Information about the reference when the <code>referenceType</code> is <code>URL</code>. Otherwise, null.
     *         (Supports variable injection in the <code>Value</code> field.)
     */

    public java.util.Map<String, Reference> getReferences() {
        return references;
    }

    /**
     * <p>
     * Information about the reference when the <code>referenceType</code> is <code>URL</code>. Otherwise, null.
     * (Supports variable injection in the <code>Value</code> field.)
     * </p>
     * 
     * @param references
     *        Information about the reference when the <code>referenceType</code> is <code>URL</code>. Otherwise, null.
     *        (Supports variable injection in the <code>Value</code> field.)
     */

    public void setReferences(java.util.Map<String, Reference> references) {
        this.references = references;
    }

    /**
     * <p>
     * Information about the reference when the <code>referenceType</code> is <code>URL</code>. Otherwise, null.
     * (Supports variable injection in the <code>Value</code> field.)
     * </p>
     * 
     * @param references
     *        Information about the reference when the <code>referenceType</code> is <code>URL</code>. Otherwise, null.
     *        (Supports variable injection in the <code>Value</code> field.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskActionDefinition withReferences(java.util.Map<String, Reference> references) {
        setReferences(references);
        return this;
    }

    /**
     * Add a single References entry
     *
     * @see TaskActionDefinition#withReferences
     * @returns a reference to this object so that method calls can be chained together.
     */

    public TaskActionDefinition addReferencesEntry(String key, Reference value) {
        if (null == this.references) {
            this.references = new java.util.HashMap<String, Reference>();
        }
        if (this.references.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.references.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into References.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskActionDefinition clearReferencesEntries() {
        this.references = null;
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
        if (getContactFlowId() != null)
            sb.append("ContactFlowId: ").append(getContactFlowId()).append(",");
        if (getReferences() != null)
            sb.append("References: ").append(getReferences());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskActionDefinition == false)
            return false;
        TaskActionDefinition other = (TaskActionDefinition) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getContactFlowId() == null ^ this.getContactFlowId() == null)
            return false;
        if (other.getContactFlowId() != null && other.getContactFlowId().equals(this.getContactFlowId()) == false)
            return false;
        if (other.getReferences() == null ^ this.getReferences() == null)
            return false;
        if (other.getReferences() != null && other.getReferences().equals(this.getReferences()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getContactFlowId() == null) ? 0 : getContactFlowId().hashCode());
        hashCode = prime * hashCode + ((getReferences() == null) ? 0 : getReferences().hashCode());
        return hashCode;
    }

    @Override
    public TaskActionDefinition clone() {
        try {
            return (TaskActionDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.TaskActionDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
