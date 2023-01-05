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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactFlowModuleContent"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateContactFlowModuleContentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The identifier of the flow module.
     * </p>
     */
    private String contactFlowModuleId;
    /**
     * <p>
     * The content of the flow module.
     * </p>
     */
    private String content;

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

    public UpdateContactFlowModuleContentRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The identifier of the flow module.
     * </p>
     * 
     * @param contactFlowModuleId
     *        The identifier of the flow module.
     */

    public void setContactFlowModuleId(String contactFlowModuleId) {
        this.contactFlowModuleId = contactFlowModuleId;
    }

    /**
     * <p>
     * The identifier of the flow module.
     * </p>
     * 
     * @return The identifier of the flow module.
     */

    public String getContactFlowModuleId() {
        return this.contactFlowModuleId;
    }

    /**
     * <p>
     * The identifier of the flow module.
     * </p>
     * 
     * @param contactFlowModuleId
     *        The identifier of the flow module.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactFlowModuleContentRequest withContactFlowModuleId(String contactFlowModuleId) {
        setContactFlowModuleId(contactFlowModuleId);
        return this;
    }

    /**
     * <p>
     * The content of the flow module.
     * </p>
     * 
     * @param content
     *        The content of the flow module.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The content of the flow module.
     * </p>
     * 
     * @return The content of the flow module.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The content of the flow module.
     * </p>
     * 
     * @param content
     *        The content of the flow module.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactFlowModuleContentRequest withContent(String content) {
        setContent(content);
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
        if (getContactFlowModuleId() != null)
            sb.append("ContactFlowModuleId: ").append(getContactFlowModuleId()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateContactFlowModuleContentRequest == false)
            return false;
        UpdateContactFlowModuleContentRequest other = (UpdateContactFlowModuleContentRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getContactFlowModuleId() == null ^ this.getContactFlowModuleId() == null)
            return false;
        if (other.getContactFlowModuleId() != null && other.getContactFlowModuleId().equals(this.getContactFlowModuleId()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getContactFlowModuleId() == null) ? 0 : getContactFlowModuleId().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        return hashCode;
    }

    @Override
    public UpdateContactFlowModuleContentRequest clone() {
        return (UpdateContactFlowModuleContentRequest) super.clone();
    }

}
