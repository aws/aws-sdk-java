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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateContactFlow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateContactFlowRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The name of the contact flow.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of the contact flow. For descriptions of the available types, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/create-contact-flow.html#contact-flow-types">Choose a
     * Contact Flow Type</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The description of the contact flow.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The content of the contact flow.
     * </p>
     */
    private String content;
    /**
     * <p>
     * One or more tags.
     * </p>
     */
    private java.util.Map<String, String> tags;

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

    public CreateContactFlowRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The name of the contact flow.
     * </p>
     * 
     * @param name
     *        The name of the contact flow.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the contact flow.
     * </p>
     * 
     * @return The name of the contact flow.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the contact flow.
     * </p>
     * 
     * @param name
     *        The name of the contact flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContactFlowRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of the contact flow. For descriptions of the available types, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/create-contact-flow.html#contact-flow-types">Choose a
     * Contact Flow Type</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param type
     *        The type of the contact flow. For descriptions of the available types, see <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/create-contact-flow.html#contact-flow-types"
     *        >Choose a Contact Flow Type</a> in the <i>Amazon Connect Administrator Guide</i>.
     * @see ContactFlowType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the contact flow. For descriptions of the available types, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/create-contact-flow.html#contact-flow-types">Choose a
     * Contact Flow Type</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @return The type of the contact flow. For descriptions of the available types, see <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/create-contact-flow.html#contact-flow-types"
     *         >Choose a Contact Flow Type</a> in the <i>Amazon Connect Administrator Guide</i>.
     * @see ContactFlowType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the contact flow. For descriptions of the available types, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/create-contact-flow.html#contact-flow-types">Choose a
     * Contact Flow Type</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param type
     *        The type of the contact flow. For descriptions of the available types, see <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/create-contact-flow.html#contact-flow-types"
     *        >Choose a Contact Flow Type</a> in the <i>Amazon Connect Administrator Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactFlowType
     */

    public CreateContactFlowRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the contact flow. For descriptions of the available types, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/create-contact-flow.html#contact-flow-types">Choose a
     * Contact Flow Type</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * 
     * @param type
     *        The type of the contact flow. For descriptions of the available types, see <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/create-contact-flow.html#contact-flow-types"
     *        >Choose a Contact Flow Type</a> in the <i>Amazon Connect Administrator Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactFlowType
     */

    public CreateContactFlowRequest withType(ContactFlowType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The description of the contact flow.
     * </p>
     * 
     * @param description
     *        The description of the contact flow.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the contact flow.
     * </p>
     * 
     * @return The description of the contact flow.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the contact flow.
     * </p>
     * 
     * @param description
     *        The description of the contact flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContactFlowRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The content of the contact flow.
     * </p>
     * 
     * @param content
     *        The content of the contact flow.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The content of the contact flow.
     * </p>
     * 
     * @return The content of the contact flow.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The content of the contact flow.
     * </p>
     * 
     * @param content
     *        The content of the contact flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContactFlowRequest withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @return One or more tags.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @param tags
     *        One or more tags.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @param tags
     *        One or more tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContactFlowRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateContactFlowRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateContactFlowRequest addTagsEntry(String key, String value) {
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

    public CreateContactFlowRequest clearTagsEntries() {
        this.tags = null;
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
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

        if (obj instanceof CreateContactFlowRequest == false)
            return false;
        CreateContactFlowRequest other = (CreateContactFlowRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
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

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateContactFlowRequest clone() {
        return (CreateContactFlowRequest) super.clone();
    }

}
