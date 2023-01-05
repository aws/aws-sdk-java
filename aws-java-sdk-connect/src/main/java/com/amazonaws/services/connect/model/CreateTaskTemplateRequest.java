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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateTaskTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTaskTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The name of the task template.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the task template.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The identifier of the flow that runs by default when a task is created by referencing this template.
     * </p>
     */
    private String contactFlowId;
    /**
     * <p>
     * Constraints that are applicable to the fields listed.
     * </p>
     */
    private TaskTemplateConstraints constraints;
    /**
     * <p>
     * The default values for fields when a task is created by referencing this template.
     * </p>
     */
    private TaskTemplateDefaults defaults;
    /**
     * <p>
     * Marks a template as <code>ACTIVE</code> or <code>INACTIVE</code> for a task to refer to it. Tasks can only be
     * created from <code>ACTIVE</code> templates. If a template is marked as <code>INACTIVE</code>, then a task that
     * refers to this template cannot be created.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Fields that are part of the template.
     * </p>
     */
    private java.util.List<TaskTemplateField> fields;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskTemplateRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The name of the task template.
     * </p>
     * 
     * @param name
     *        The name of the task template.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the task template.
     * </p>
     * 
     * @return The name of the task template.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the task template.
     * </p>
     * 
     * @param name
     *        The name of the task template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskTemplateRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the task template.
     * </p>
     * 
     * @param description
     *        The description of the task template.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the task template.
     * </p>
     * 
     * @return The description of the task template.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the task template.
     * </p>
     * 
     * @param description
     *        The description of the task template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskTemplateRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The identifier of the flow that runs by default when a task is created by referencing this template.
     * </p>
     * 
     * @param contactFlowId
     *        The identifier of the flow that runs by default when a task is created by referencing this template.
     */

    public void setContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
    }

    /**
     * <p>
     * The identifier of the flow that runs by default when a task is created by referencing this template.
     * </p>
     * 
     * @return The identifier of the flow that runs by default when a task is created by referencing this template.
     */

    public String getContactFlowId() {
        return this.contactFlowId;
    }

    /**
     * <p>
     * The identifier of the flow that runs by default when a task is created by referencing this template.
     * </p>
     * 
     * @param contactFlowId
     *        The identifier of the flow that runs by default when a task is created by referencing this template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskTemplateRequest withContactFlowId(String contactFlowId) {
        setContactFlowId(contactFlowId);
        return this;
    }

    /**
     * <p>
     * Constraints that are applicable to the fields listed.
     * </p>
     * 
     * @param constraints
     *        Constraints that are applicable to the fields listed.
     */

    public void setConstraints(TaskTemplateConstraints constraints) {
        this.constraints = constraints;
    }

    /**
     * <p>
     * Constraints that are applicable to the fields listed.
     * </p>
     * 
     * @return Constraints that are applicable to the fields listed.
     */

    public TaskTemplateConstraints getConstraints() {
        return this.constraints;
    }

    /**
     * <p>
     * Constraints that are applicable to the fields listed.
     * </p>
     * 
     * @param constraints
     *        Constraints that are applicable to the fields listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskTemplateRequest withConstraints(TaskTemplateConstraints constraints) {
        setConstraints(constraints);
        return this;
    }

    /**
     * <p>
     * The default values for fields when a task is created by referencing this template.
     * </p>
     * 
     * @param defaults
     *        The default values for fields when a task is created by referencing this template.
     */

    public void setDefaults(TaskTemplateDefaults defaults) {
        this.defaults = defaults;
    }

    /**
     * <p>
     * The default values for fields when a task is created by referencing this template.
     * </p>
     * 
     * @return The default values for fields when a task is created by referencing this template.
     */

    public TaskTemplateDefaults getDefaults() {
        return this.defaults;
    }

    /**
     * <p>
     * The default values for fields when a task is created by referencing this template.
     * </p>
     * 
     * @param defaults
     *        The default values for fields when a task is created by referencing this template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskTemplateRequest withDefaults(TaskTemplateDefaults defaults) {
        setDefaults(defaults);
        return this;
    }

    /**
     * <p>
     * Marks a template as <code>ACTIVE</code> or <code>INACTIVE</code> for a task to refer to it. Tasks can only be
     * created from <code>ACTIVE</code> templates. If a template is marked as <code>INACTIVE</code>, then a task that
     * refers to this template cannot be created.
     * </p>
     * 
     * @param status
     *        Marks a template as <code>ACTIVE</code> or <code>INACTIVE</code> for a task to refer to it. Tasks can only
     *        be created from <code>ACTIVE</code> templates. If a template is marked as <code>INACTIVE</code>, then a
     *        task that refers to this template cannot be created.
     * @see TaskTemplateStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Marks a template as <code>ACTIVE</code> or <code>INACTIVE</code> for a task to refer to it. Tasks can only be
     * created from <code>ACTIVE</code> templates. If a template is marked as <code>INACTIVE</code>, then a task that
     * refers to this template cannot be created.
     * </p>
     * 
     * @return Marks a template as <code>ACTIVE</code> or <code>INACTIVE</code> for a task to refer to it. Tasks can
     *         only be created from <code>ACTIVE</code> templates. If a template is marked as <code>INACTIVE</code>,
     *         then a task that refers to this template cannot be created.
     * @see TaskTemplateStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Marks a template as <code>ACTIVE</code> or <code>INACTIVE</code> for a task to refer to it. Tasks can only be
     * created from <code>ACTIVE</code> templates. If a template is marked as <code>INACTIVE</code>, then a task that
     * refers to this template cannot be created.
     * </p>
     * 
     * @param status
     *        Marks a template as <code>ACTIVE</code> or <code>INACTIVE</code> for a task to refer to it. Tasks can only
     *        be created from <code>ACTIVE</code> templates. If a template is marked as <code>INACTIVE</code>, then a
     *        task that refers to this template cannot be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskTemplateStatus
     */

    public CreateTaskTemplateRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Marks a template as <code>ACTIVE</code> or <code>INACTIVE</code> for a task to refer to it. Tasks can only be
     * created from <code>ACTIVE</code> templates. If a template is marked as <code>INACTIVE</code>, then a task that
     * refers to this template cannot be created.
     * </p>
     * 
     * @param status
     *        Marks a template as <code>ACTIVE</code> or <code>INACTIVE</code> for a task to refer to it. Tasks can only
     *        be created from <code>ACTIVE</code> templates. If a template is marked as <code>INACTIVE</code>, then a
     *        task that refers to this template cannot be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskTemplateStatus
     */

    public CreateTaskTemplateRequest withStatus(TaskTemplateStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Fields that are part of the template.
     * </p>
     * 
     * @return Fields that are part of the template.
     */

    public java.util.List<TaskTemplateField> getFields() {
        return fields;
    }

    /**
     * <p>
     * Fields that are part of the template.
     * </p>
     * 
     * @param fields
     *        Fields that are part of the template.
     */

    public void setFields(java.util.Collection<TaskTemplateField> fields) {
        if (fields == null) {
            this.fields = null;
            return;
        }

        this.fields = new java.util.ArrayList<TaskTemplateField>(fields);
    }

    /**
     * <p>
     * Fields that are part of the template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFields(java.util.Collection)} or {@link #withFields(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param fields
     *        Fields that are part of the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskTemplateRequest withFields(TaskTemplateField... fields) {
        if (this.fields == null) {
            setFields(new java.util.ArrayList<TaskTemplateField>(fields.length));
        }
        for (TaskTemplateField ele : fields) {
            this.fields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Fields that are part of the template.
     * </p>
     * 
     * @param fields
     *        Fields that are part of the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskTemplateRequest withFields(java.util.Collection<TaskTemplateField> fields) {
        setFields(fields);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not
     *        provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     *        href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries
     *        safe with idempotent APIs</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not
     *         provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see
     *         <a href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making
     *         retries safe with idempotent APIs</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not
     *        provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     *        href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries
     *        safe with idempotent APIs</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTaskTemplateRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getContactFlowId() != null)
            sb.append("ContactFlowId: ").append(getContactFlowId()).append(",");
        if (getConstraints() != null)
            sb.append("Constraints: ").append(getConstraints()).append(",");
        if (getDefaults() != null)
            sb.append("Defaults: ").append(getDefaults()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFields() != null)
            sb.append("Fields: ").append(getFields()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTaskTemplateRequest == false)
            return false;
        CreateTaskTemplateRequest other = (CreateTaskTemplateRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
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
        if (other.getConstraints() == null ^ this.getConstraints() == null)
            return false;
        if (other.getConstraints() != null && other.getConstraints().equals(this.getConstraints()) == false)
            return false;
        if (other.getDefaults() == null ^ this.getDefaults() == null)
            return false;
        if (other.getDefaults() != null && other.getDefaults().equals(this.getDefaults()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFields() == null ^ this.getFields() == null)
            return false;
        if (other.getFields() != null && other.getFields().equals(this.getFields()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getContactFlowId() == null) ? 0 : getContactFlowId().hashCode());
        hashCode = prime * hashCode + ((getConstraints() == null) ? 0 : getConstraints().hashCode());
        hashCode = prime * hashCode + ((getDefaults() == null) ? 0 : getDefaults().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFields() == null) ? 0 : getFields().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateTaskTemplateRequest clone() {
        return (CreateTaskTemplateRequest) super.clone();
    }

}
