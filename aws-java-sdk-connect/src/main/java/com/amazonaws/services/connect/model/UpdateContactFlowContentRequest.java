/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactFlowContent" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateContactFlowContentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The identifier of the contact flow.
     * </p>
     */
    private String contactFlowId;
    /**
     * <p>
     * The JSON string that represents contact flow’s content. For an example, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/flow-language-example.html">Example contact flow in
     * Amazon Connect Flow language</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     */
    private String content;

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactFlowContentRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The identifier of the contact flow.
     * </p>
     * 
     * @param contactFlowId
     *        The identifier of the contact flow.
     */

    public void setContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
    }

    /**
     * <p>
     * The identifier of the contact flow.
     * </p>
     * 
     * @return The identifier of the contact flow.
     */

    public String getContactFlowId() {
        return this.contactFlowId;
    }

    /**
     * <p>
     * The identifier of the contact flow.
     * </p>
     * 
     * @param contactFlowId
     *        The identifier of the contact flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactFlowContentRequest withContactFlowId(String contactFlowId) {
        setContactFlowId(contactFlowId);
        return this;
    }

    /**
     * <p>
     * The JSON string that represents contact flow’s content. For an example, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/flow-language-example.html">Example contact flow in
     * Amazon Connect Flow language</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param content
     *        The JSON string that represents contact flow’s content. For an example, see <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/flow-language-example.html">Example contact
     *        flow in Amazon Connect Flow language</a> in the <i>Amazon Connect Administrator Guide</i>.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The JSON string that represents contact flow’s content. For an example, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/flow-language-example.html">Example contact flow in
     * Amazon Connect Flow language</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @return The JSON string that represents contact flow’s content. For an example, see <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/flow-language-example.html">Example contact
     *         flow in Amazon Connect Flow language</a> in the <i>Amazon Connect Administrator Guide</i>.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The JSON string that represents contact flow’s content. For an example, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/flow-language-example.html">Example contact flow in
     * Amazon Connect Flow language</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param content
     *        The JSON string that represents contact flow’s content. For an example, see <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/flow-language-example.html">Example contact
     *        flow in Amazon Connect Flow language</a> in the <i>Amazon Connect Administrator Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactFlowContentRequest withContent(String content) {
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
        if (getContactFlowId() != null)
            sb.append("ContactFlowId: ").append(getContactFlowId()).append(",");
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

        if (obj instanceof UpdateContactFlowContentRequest == false)
            return false;
        UpdateContactFlowContentRequest other = (UpdateContactFlowContentRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getContactFlowId() == null ^ this.getContactFlowId() == null)
            return false;
        if (other.getContactFlowId() != null && other.getContactFlowId().equals(this.getContactFlowId()) == false)
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
        hashCode = prime * hashCode + ((getContactFlowId() == null) ? 0 : getContactFlowId().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        return hashCode;
    }

    @Override
    public UpdateContactFlowContentRequest clone() {
        return (UpdateContactFlowContentRequest) super.clone();
    }

}
