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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateQueueEnvironment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateQueueEnvironmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The farm ID of the farm to connect to the environment.
     * </p>
     */
    private String farmId;
    /**
     * <p>
     * Sets the priority of the environments in the queue from 0 to 10,000, where 0 is the highest priority. If two
     * environments share the same priority value, the environment created first takes higher priority.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The queue ID to connect the queue and environment.
     * </p>
     */
    private String queueId;
    /**
     * <p>
     * The environment template to use in the queue.
     * </p>
     */
    private String template;
    /**
     * <p>
     * The template's file type, <code>JSON</code> or <code>YAML</code>.
     * </p>
     */
    private String templateType;

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     * 
     * @param clientToken
     *        The unique token which the server uses to recognize retries of the same request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     * 
     * @return The unique token which the server uses to recognize retries of the same request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     * 
     * @param clientToken
     *        The unique token which the server uses to recognize retries of the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQueueEnvironmentRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The farm ID of the farm to connect to the environment.
     * </p>
     * 
     * @param farmId
     *        The farm ID of the farm to connect to the environment.
     */

    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * <p>
     * The farm ID of the farm to connect to the environment.
     * </p>
     * 
     * @return The farm ID of the farm to connect to the environment.
     */

    public String getFarmId() {
        return this.farmId;
    }

    /**
     * <p>
     * The farm ID of the farm to connect to the environment.
     * </p>
     * 
     * @param farmId
     *        The farm ID of the farm to connect to the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQueueEnvironmentRequest withFarmId(String farmId) {
        setFarmId(farmId);
        return this;
    }

    /**
     * <p>
     * Sets the priority of the environments in the queue from 0 to 10,000, where 0 is the highest priority. If two
     * environments share the same priority value, the environment created first takes higher priority.
     * </p>
     * 
     * @param priority
     *        Sets the priority of the environments in the queue from 0 to 10,000, where 0 is the highest priority. If
     *        two environments share the same priority value, the environment created first takes higher priority.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * Sets the priority of the environments in the queue from 0 to 10,000, where 0 is the highest priority. If two
     * environments share the same priority value, the environment created first takes higher priority.
     * </p>
     * 
     * @return Sets the priority of the environments in the queue from 0 to 10,000, where 0 is the highest priority. If
     *         two environments share the same priority value, the environment created first takes higher priority.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * Sets the priority of the environments in the queue from 0 to 10,000, where 0 is the highest priority. If two
     * environments share the same priority value, the environment created first takes higher priority.
     * </p>
     * 
     * @param priority
     *        Sets the priority of the environments in the queue from 0 to 10,000, where 0 is the highest priority. If
     *        two environments share the same priority value, the environment created first takes higher priority.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQueueEnvironmentRequest withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The queue ID to connect the queue and environment.
     * </p>
     * 
     * @param queueId
     *        The queue ID to connect the queue and environment.
     */

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    /**
     * <p>
     * The queue ID to connect the queue and environment.
     * </p>
     * 
     * @return The queue ID to connect the queue and environment.
     */

    public String getQueueId() {
        return this.queueId;
    }

    /**
     * <p>
     * The queue ID to connect the queue and environment.
     * </p>
     * 
     * @param queueId
     *        The queue ID to connect the queue and environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQueueEnvironmentRequest withQueueId(String queueId) {
        setQueueId(queueId);
        return this;
    }

    /**
     * <p>
     * The environment template to use in the queue.
     * </p>
     * 
     * @param template
     *        The environment template to use in the queue.
     */

    public void setTemplate(String template) {
        this.template = template;
    }

    /**
     * <p>
     * The environment template to use in the queue.
     * </p>
     * 
     * @return The environment template to use in the queue.
     */

    public String getTemplate() {
        return this.template;
    }

    /**
     * <p>
     * The environment template to use in the queue.
     * </p>
     * 
     * @param template
     *        The environment template to use in the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQueueEnvironmentRequest withTemplate(String template) {
        setTemplate(template);
        return this;
    }

    /**
     * <p>
     * The template's file type, <code>JSON</code> or <code>YAML</code>.
     * </p>
     * 
     * @param templateType
     *        The template's file type, <code>JSON</code> or <code>YAML</code>.
     * @see EnvironmentTemplateType
     */

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    /**
     * <p>
     * The template's file type, <code>JSON</code> or <code>YAML</code>.
     * </p>
     * 
     * @return The template's file type, <code>JSON</code> or <code>YAML</code>.
     * @see EnvironmentTemplateType
     */

    public String getTemplateType() {
        return this.templateType;
    }

    /**
     * <p>
     * The template's file type, <code>JSON</code> or <code>YAML</code>.
     * </p>
     * 
     * @param templateType
     *        The template's file type, <code>JSON</code> or <code>YAML</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentTemplateType
     */

    public CreateQueueEnvironmentRequest withTemplateType(String templateType) {
        setTemplateType(templateType);
        return this;
    }

    /**
     * <p>
     * The template's file type, <code>JSON</code> or <code>YAML</code>.
     * </p>
     * 
     * @param templateType
     *        The template's file type, <code>JSON</code> or <code>YAML</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentTemplateType
     */

    public CreateQueueEnvironmentRequest withTemplateType(EnvironmentTemplateType templateType) {
        this.templateType = templateType.toString();
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getFarmId() != null)
            sb.append("FarmId: ").append(getFarmId()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getQueueId() != null)
            sb.append("QueueId: ").append(getQueueId()).append(",");
        if (getTemplate() != null)
            sb.append("Template: ").append("***Sensitive Data Redacted***").append(",");
        if (getTemplateType() != null)
            sb.append("TemplateType: ").append(getTemplateType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateQueueEnvironmentRequest == false)
            return false;
        CreateQueueEnvironmentRequest other = (CreateQueueEnvironmentRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getFarmId() == null ^ this.getFarmId() == null)
            return false;
        if (other.getFarmId() != null && other.getFarmId().equals(this.getFarmId()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getQueueId() == null ^ this.getQueueId() == null)
            return false;
        if (other.getQueueId() != null && other.getQueueId().equals(this.getQueueId()) == false)
            return false;
        if (other.getTemplate() == null ^ this.getTemplate() == null)
            return false;
        if (other.getTemplate() != null && other.getTemplate().equals(this.getTemplate()) == false)
            return false;
        if (other.getTemplateType() == null ^ this.getTemplateType() == null)
            return false;
        if (other.getTemplateType() != null && other.getTemplateType().equals(this.getTemplateType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getFarmId() == null) ? 0 : getFarmId().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getQueueId() == null) ? 0 : getQueueId().hashCode());
        hashCode = prime * hashCode + ((getTemplate() == null) ? 0 : getTemplate().hashCode());
        hashCode = prime * hashCode + ((getTemplateType() == null) ? 0 : getTemplateType().hashCode());
        return hashCode;
    }

    @Override
    public CreateQueueEnvironmentRequest clone() {
        return (CreateQueueEnvironmentRequest) super.clone();
    }

}
