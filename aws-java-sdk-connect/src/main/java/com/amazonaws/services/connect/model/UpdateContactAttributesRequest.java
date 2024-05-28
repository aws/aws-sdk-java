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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactAttributes" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateContactAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the contact. This is the identifier of the contact associated with the first interaction with
     * the contact center.
     * </p>
     */
    private String initialContactId;
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The Amazon Connect attributes. These attributes can be accessed in flows just like any other contact attributes.
     * </p>
     * <p>
     * You can have up to 32,768 UTF-8 bytes across all attributes for a contact. Attribute keys can include only
     * alphanumeric, dash, and underscore characters.
     * </p>
     * <p>
     * When the attributes for a contact exceed 32 KB, the contact is routed down the Error branch of the flow. As a
     * mitigation, consider the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Remove unnecessary attributes by setting their values to empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the attributes are only used in one flow and don't need to be referred to outside of that flow (for example,
     * by a Lambda or another flow), then use flow attributes. This way you aren't needlessly persisting the 32 KB of
     * information from one flow to another. For more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/set-contact-attributes.html">Flow block: Set contact
     * attributes</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> attributes;

    /**
     * <p>
     * The identifier of the contact. This is the identifier of the contact associated with the first interaction with
     * the contact center.
     * </p>
     * 
     * @param initialContactId
     *        The identifier of the contact. This is the identifier of the contact associated with the first interaction
     *        with the contact center.
     */

    public void setInitialContactId(String initialContactId) {
        this.initialContactId = initialContactId;
    }

    /**
     * <p>
     * The identifier of the contact. This is the identifier of the contact associated with the first interaction with
     * the contact center.
     * </p>
     * 
     * @return The identifier of the contact. This is the identifier of the contact associated with the first
     *         interaction with the contact center.
     */

    public String getInitialContactId() {
        return this.initialContactId;
    }

    /**
     * <p>
     * The identifier of the contact. This is the identifier of the contact associated with the first interaction with
     * the contact center.
     * </p>
     * 
     * @param initialContactId
     *        The identifier of the contact. This is the identifier of the contact associated with the first interaction
     *        with the contact center.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactAttributesRequest withInitialContactId(String initialContactId) {
        setInitialContactId(initialContactId);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance
     *        ID</a> in the Amazon Resource Name (ARN) of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance
     *         ID</a> in the Amazon Resource Name (ARN) of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance
     *        ID</a> in the Amazon Resource Name (ARN) of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactAttributesRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The Amazon Connect attributes. These attributes can be accessed in flows just like any other contact attributes.
     * </p>
     * <p>
     * You can have up to 32,768 UTF-8 bytes across all attributes for a contact. Attribute keys can include only
     * alphanumeric, dash, and underscore characters.
     * </p>
     * <p>
     * When the attributes for a contact exceed 32 KB, the contact is routed down the Error branch of the flow. As a
     * mitigation, consider the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Remove unnecessary attributes by setting their values to empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the attributes are only used in one flow and don't need to be referred to outside of that flow (for example,
     * by a Lambda or another flow), then use flow attributes. This way you aren't needlessly persisting the 32 KB of
     * information from one flow to another. For more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/set-contact-attributes.html">Flow block: Set contact
     * attributes</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Connect attributes. These attributes can be accessed in flows just like any other contact
     *         attributes.</p>
     *         <p>
     *         You can have up to 32,768 UTF-8 bytes across all attributes for a contact. Attribute keys can include
     *         only alphanumeric, dash, and underscore characters.
     *         </p>
     *         <p>
     *         When the attributes for a contact exceed 32 KB, the contact is routed down the Error branch of the flow.
     *         As a mitigation, consider the following options:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Remove unnecessary attributes by setting their values to empty.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the attributes are only used in one flow and don't need to be referred to outside of that flow (for
     *         example, by a Lambda or another flow), then use flow attributes. This way you aren't needlessly
     *         persisting the 32 KB of information from one flow to another. For more information, see <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/set-contact-attributes.html">Flow block: Set
     *         contact attributes</a> in the <i>Amazon Connect Administrator Guide</i>.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The Amazon Connect attributes. These attributes can be accessed in flows just like any other contact attributes.
     * </p>
     * <p>
     * You can have up to 32,768 UTF-8 bytes across all attributes for a contact. Attribute keys can include only
     * alphanumeric, dash, and underscore characters.
     * </p>
     * <p>
     * When the attributes for a contact exceed 32 KB, the contact is routed down the Error branch of the flow. As a
     * mitigation, consider the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Remove unnecessary attributes by setting their values to empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the attributes are only used in one flow and don't need to be referred to outside of that flow (for example,
     * by a Lambda or another flow), then use flow attributes. This way you aren't needlessly persisting the 32 KB of
     * information from one flow to another. For more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/set-contact-attributes.html">Flow block: Set contact
     * attributes</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param attributes
     *        The Amazon Connect attributes. These attributes can be accessed in flows just like any other contact
     *        attributes.</p>
     *        <p>
     *        You can have up to 32,768 UTF-8 bytes across all attributes for a contact. Attribute keys can include only
     *        alphanumeric, dash, and underscore characters.
     *        </p>
     *        <p>
     *        When the attributes for a contact exceed 32 KB, the contact is routed down the Error branch of the flow.
     *        As a mitigation, consider the following options:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Remove unnecessary attributes by setting their values to empty.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the attributes are only used in one flow and don't need to be referred to outside of that flow (for
     *        example, by a Lambda or another flow), then use flow attributes. This way you aren't needlessly persisting
     *        the 32 KB of information from one flow to another. For more information, see <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/set-contact-attributes.html">Flow block: Set
     *        contact attributes</a> in the <i>Amazon Connect Administrator Guide</i>.
     *        </p>
     *        </li>
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * The Amazon Connect attributes. These attributes can be accessed in flows just like any other contact attributes.
     * </p>
     * <p>
     * You can have up to 32,768 UTF-8 bytes across all attributes for a contact. Attribute keys can include only
     * alphanumeric, dash, and underscore characters.
     * </p>
     * <p>
     * When the attributes for a contact exceed 32 KB, the contact is routed down the Error branch of the flow. As a
     * mitigation, consider the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Remove unnecessary attributes by setting their values to empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the attributes are only used in one flow and don't need to be referred to outside of that flow (for example,
     * by a Lambda or another flow), then use flow attributes. This way you aren't needlessly persisting the 32 KB of
     * information from one flow to another. For more information, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/set-contact-attributes.html">Flow block: Set contact
     * attributes</a> in the <i>Amazon Connect Administrator Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param attributes
     *        The Amazon Connect attributes. These attributes can be accessed in flows just like any other contact
     *        attributes.</p>
     *        <p>
     *        You can have up to 32,768 UTF-8 bytes across all attributes for a contact. Attribute keys can include only
     *        alphanumeric, dash, and underscore characters.
     *        </p>
     *        <p>
     *        When the attributes for a contact exceed 32 KB, the contact is routed down the Error branch of the flow.
     *        As a mitigation, consider the following options:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Remove unnecessary attributes by setting their values to empty.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the attributes are only used in one flow and don't need to be referred to outside of that flow (for
     *        example, by a Lambda or another flow), then use flow attributes. This way you aren't needlessly persisting
     *        the 32 KB of information from one flow to another. For more information, see <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/set-contact-attributes.html">Flow block: Set
     *        contact attributes</a> in the <i>Amazon Connect Administrator Guide</i>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactAttributesRequest withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * Add a single Attributes entry
     *
     * @see UpdateContactAttributesRequest#withAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactAttributesRequest addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactAttributesRequest clearAttributesEntries() {
        this.attributes = null;
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
        if (getInitialContactId() != null)
            sb.append("InitialContactId: ").append(getInitialContactId()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateContactAttributesRequest == false)
            return false;
        UpdateContactAttributesRequest other = (UpdateContactAttributesRequest) obj;
        if (other.getInitialContactId() == null ^ this.getInitialContactId() == null)
            return false;
        if (other.getInitialContactId() != null && other.getInitialContactId().equals(this.getInitialContactId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInitialContactId() == null) ? 0 : getInitialContactId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public UpdateContactAttributesRequest clone() {
        return (UpdateContactAttributesRequest) super.clone();
    }

}
