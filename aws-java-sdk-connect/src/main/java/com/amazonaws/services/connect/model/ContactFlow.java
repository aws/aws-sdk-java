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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a contact flow.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ContactFlow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContactFlow implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact flow.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The identifier of the contact flow.
     * </p>
     */
    private String id;
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
     * The Amazon Resource Name (ARN) of the contact flow.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the contact flow.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact flow.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the contact flow.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact flow.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the contact flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactFlow withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The identifier of the contact flow.
     * </p>
     * 
     * @param id
     *        The identifier of the contact flow.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the contact flow.
     * </p>
     * 
     * @return The identifier of the contact flow.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the contact flow.
     * </p>
     * 
     * @param id
     *        The identifier of the contact flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactFlow withId(String id) {
        setId(id);
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

    public ContactFlow withName(String name) {
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

    public ContactFlow withType(String type) {
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

    public ContactFlow withType(ContactFlowType type) {
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

    public ContactFlow withDescription(String description) {
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

    public ContactFlow withContent(String content) {
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

    public ContactFlow withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see ContactFlow#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ContactFlow addTagsEntry(String key, String value) {
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

    public ContactFlow clearTagsEntries() {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
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

        if (obj instanceof ContactFlow == false)
            return false;
        ContactFlow other = (ContactFlow) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ContactFlow clone() {
        try {
            return (ContactFlow) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.ContactFlowMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
