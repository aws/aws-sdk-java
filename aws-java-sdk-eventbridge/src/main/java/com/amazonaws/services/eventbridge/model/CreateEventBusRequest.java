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
package com.amazonaws.services.eventbridge.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/CreateEventBus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEventBusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the new event bus.
     * </p>
     * <p>
     * Custom event bus names can't contain the <code>/</code> character, but you can use the <code>/</code> character
     * in partner event bus names. In addition, for partner event buses, the name must exactly match the name of the
     * partner event source that this event bus is matched to.
     * </p>
     * <p>
     * You can't use the name <code>default</code> for a custom event bus, as this name is already used for your
     * account's default event bus.
     * </p>
     */
    private String name;
    /**
     * <p>
     * If you are creating a partner event bus, this specifies the partner event source that the new event bus will be
     * matched with.
     * </p>
     */
    private String eventSourceName;
    /**
     * <p>
     * The event bus description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The identifier of the KMS customer managed key for EventBridge to use, if you choose to use a customer managed
     * key to encrypt events on this event bus. The identifier can be the key Amazon Resource Name (ARN), KeyId, key
     * alias, or key alias ARN.
     * </p>
     * <p>
     * If you do not specify a customer managed key identifier, EventBridge uses an Amazon Web Services owned key to
     * encrypt events on the event bus.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/getting-started.html">Managing keys</a> in the <i>Key
     * Management Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Archives and schema discovery are not supported for event buses encrypted using a customer managed key.
     * EventBridge returns an error if:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You call
     * <code> <a href="https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_CreateArchive.html">CreateArchive</a> </code>
     * on an event bus set to use a customer managed key for encryption.
     * </p>
     * </li>
     * <li>
     * <p>
     * You call
     * <code> <a href="https://docs.aws.amazon.com/eventbridge/latest/schema-reference/v1-discoverers.html#CreateDiscoverer">CreateDiscoverer</a> </code>
     * on an event bus set to use a customer managed key for encryption.
     * </p>
     * </li>
     * <li>
     * <p>
     * You call
     * <code> <a href="https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_UpdatedEventBus.html">UpdatedEventBus</a> </code>
     * to set a customer managed key on an event bus with an archives or schema discovery enabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To enable archives or schema discovery on an event bus, choose to use an Amazon Web Services owned key. For more
     * information, see <a href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-encryption.html">Data
     * encryption in EventBridge</a> in the <i>Amazon EventBridge User Guide</i>.
     * </p>
     * </note>
     */
    private String kmsKeyIdentifier;

    private DeadLetterConfig deadLetterConfig;
    /**
     * <p>
     * Tags to associate with the event bus.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the new event bus.
     * </p>
     * <p>
     * Custom event bus names can't contain the <code>/</code> character, but you can use the <code>/</code> character
     * in partner event bus names. In addition, for partner event buses, the name must exactly match the name of the
     * partner event source that this event bus is matched to.
     * </p>
     * <p>
     * You can't use the name <code>default</code> for a custom event bus, as this name is already used for your
     * account's default event bus.
     * </p>
     * 
     * @param name
     *        The name of the new event bus. </p>
     *        <p>
     *        Custom event bus names can't contain the <code>/</code> character, but you can use the <code>/</code>
     *        character in partner event bus names. In addition, for partner event buses, the name must exactly match
     *        the name of the partner event source that this event bus is matched to.
     *        </p>
     *        <p>
     *        You can't use the name <code>default</code> for a custom event bus, as this name is already used for your
     *        account's default event bus.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the new event bus.
     * </p>
     * <p>
     * Custom event bus names can't contain the <code>/</code> character, but you can use the <code>/</code> character
     * in partner event bus names. In addition, for partner event buses, the name must exactly match the name of the
     * partner event source that this event bus is matched to.
     * </p>
     * <p>
     * You can't use the name <code>default</code> for a custom event bus, as this name is already used for your
     * account's default event bus.
     * </p>
     * 
     * @return The name of the new event bus. </p>
     *         <p>
     *         Custom event bus names can't contain the <code>/</code> character, but you can use the <code>/</code>
     *         character in partner event bus names. In addition, for partner event buses, the name must exactly match
     *         the name of the partner event source that this event bus is matched to.
     *         </p>
     *         <p>
     *         You can't use the name <code>default</code> for a custom event bus, as this name is already used for your
     *         account's default event bus.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the new event bus.
     * </p>
     * <p>
     * Custom event bus names can't contain the <code>/</code> character, but you can use the <code>/</code> character
     * in partner event bus names. In addition, for partner event buses, the name must exactly match the name of the
     * partner event source that this event bus is matched to.
     * </p>
     * <p>
     * You can't use the name <code>default</code> for a custom event bus, as this name is already used for your
     * account's default event bus.
     * </p>
     * 
     * @param name
     *        The name of the new event bus. </p>
     *        <p>
     *        Custom event bus names can't contain the <code>/</code> character, but you can use the <code>/</code>
     *        character in partner event bus names. In addition, for partner event buses, the name must exactly match
     *        the name of the partner event source that this event bus is matched to.
     *        </p>
     *        <p>
     *        You can't use the name <code>default</code> for a custom event bus, as this name is already used for your
     *        account's default event bus.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventBusRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * If you are creating a partner event bus, this specifies the partner event source that the new event bus will be
     * matched with.
     * </p>
     * 
     * @param eventSourceName
     *        If you are creating a partner event bus, this specifies the partner event source that the new event bus
     *        will be matched with.
     */

    public void setEventSourceName(String eventSourceName) {
        this.eventSourceName = eventSourceName;
    }

    /**
     * <p>
     * If you are creating a partner event bus, this specifies the partner event source that the new event bus will be
     * matched with.
     * </p>
     * 
     * @return If you are creating a partner event bus, this specifies the partner event source that the new event bus
     *         will be matched with.
     */

    public String getEventSourceName() {
        return this.eventSourceName;
    }

    /**
     * <p>
     * If you are creating a partner event bus, this specifies the partner event source that the new event bus will be
     * matched with.
     * </p>
     * 
     * @param eventSourceName
     *        If you are creating a partner event bus, this specifies the partner event source that the new event bus
     *        will be matched with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventBusRequest withEventSourceName(String eventSourceName) {
        setEventSourceName(eventSourceName);
        return this;
    }

    /**
     * <p>
     * The event bus description.
     * </p>
     * 
     * @param description
     *        The event bus description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The event bus description.
     * </p>
     * 
     * @return The event bus description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The event bus description.
     * </p>
     * 
     * @param description
     *        The event bus description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventBusRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The identifier of the KMS customer managed key for EventBridge to use, if you choose to use a customer managed
     * key to encrypt events on this event bus. The identifier can be the key Amazon Resource Name (ARN), KeyId, key
     * alias, or key alias ARN.
     * </p>
     * <p>
     * If you do not specify a customer managed key identifier, EventBridge uses an Amazon Web Services owned key to
     * encrypt events on the event bus.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/getting-started.html">Managing keys</a> in the <i>Key
     * Management Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Archives and schema discovery are not supported for event buses encrypted using a customer managed key.
     * EventBridge returns an error if:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You call
     * <code> <a href="https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_CreateArchive.html">CreateArchive</a> </code>
     * on an event bus set to use a customer managed key for encryption.
     * </p>
     * </li>
     * <li>
     * <p>
     * You call
     * <code> <a href="https://docs.aws.amazon.com/eventbridge/latest/schema-reference/v1-discoverers.html#CreateDiscoverer">CreateDiscoverer</a> </code>
     * on an event bus set to use a customer managed key for encryption.
     * </p>
     * </li>
     * <li>
     * <p>
     * You call
     * <code> <a href="https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_UpdatedEventBus.html">UpdatedEventBus</a> </code>
     * to set a customer managed key on an event bus with an archives or schema discovery enabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To enable archives or schema discovery on an event bus, choose to use an Amazon Web Services owned key. For more
     * information, see <a href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-encryption.html">Data
     * encryption in EventBridge</a> in the <i>Amazon EventBridge User Guide</i>.
     * </p>
     * </note>
     * 
     * @param kmsKeyIdentifier
     *        The identifier of the KMS customer managed key for EventBridge to use, if you choose to use a customer
     *        managed key to encrypt events on this event bus. The identifier can be the key Amazon Resource Name (ARN),
     *        KeyId, key alias, or key alias ARN.</p>
     *        <p>
     *        If you do not specify a customer managed key identifier, EventBridge uses an Amazon Web Services owned key
     *        to encrypt events on the event bus.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/getting-started.html">Managing keys</a> in the
     *        <i>Key Management Service Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        Archives and schema discovery are not supported for event buses encrypted using a customer managed key.
     *        EventBridge returns an error if:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You call
     *        <code> <a href="https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_CreateArchive.html">CreateArchive</a> </code>
     *        on an event bus set to use a customer managed key for encryption.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You call
     *        <code> <a href="https://docs.aws.amazon.com/eventbridge/latest/schema-reference/v1-discoverers.html#CreateDiscoverer">CreateDiscoverer</a> </code>
     *        on an event bus set to use a customer managed key for encryption.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You call
     *        <code> <a href="https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_UpdatedEventBus.html">UpdatedEventBus</a> </code>
     *        to set a customer managed key on an event bus with an archives or schema discovery enabled.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To enable archives or schema discovery on an event bus, choose to use an Amazon Web Services owned key.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-encryption.html">Data encryption in
     *        EventBridge</a> in the <i>Amazon EventBridge User Guide</i>.
     *        </p>
     */

    public void setKmsKeyIdentifier(String kmsKeyIdentifier) {
        this.kmsKeyIdentifier = kmsKeyIdentifier;
    }

    /**
     * <p>
     * The identifier of the KMS customer managed key for EventBridge to use, if you choose to use a customer managed
     * key to encrypt events on this event bus. The identifier can be the key Amazon Resource Name (ARN), KeyId, key
     * alias, or key alias ARN.
     * </p>
     * <p>
     * If you do not specify a customer managed key identifier, EventBridge uses an Amazon Web Services owned key to
     * encrypt events on the event bus.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/getting-started.html">Managing keys</a> in the <i>Key
     * Management Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Archives and schema discovery are not supported for event buses encrypted using a customer managed key.
     * EventBridge returns an error if:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You call
     * <code> <a href="https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_CreateArchive.html">CreateArchive</a> </code>
     * on an event bus set to use a customer managed key for encryption.
     * </p>
     * </li>
     * <li>
     * <p>
     * You call
     * <code> <a href="https://docs.aws.amazon.com/eventbridge/latest/schema-reference/v1-discoverers.html#CreateDiscoverer">CreateDiscoverer</a> </code>
     * on an event bus set to use a customer managed key for encryption.
     * </p>
     * </li>
     * <li>
     * <p>
     * You call
     * <code> <a href="https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_UpdatedEventBus.html">UpdatedEventBus</a> </code>
     * to set a customer managed key on an event bus with an archives or schema discovery enabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To enable archives or schema discovery on an event bus, choose to use an Amazon Web Services owned key. For more
     * information, see <a href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-encryption.html">Data
     * encryption in EventBridge</a> in the <i>Amazon EventBridge User Guide</i>.
     * </p>
     * </note>
     * 
     * @return The identifier of the KMS customer managed key for EventBridge to use, if you choose to use a customer
     *         managed key to encrypt events on this event bus. The identifier can be the key Amazon Resource Name
     *         (ARN), KeyId, key alias, or key alias ARN.</p>
     *         <p>
     *         If you do not specify a customer managed key identifier, EventBridge uses an Amazon Web Services owned
     *         key to encrypt events on the event bus.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/getting-started.html">Managing keys</a> in
     *         the <i>Key Management Service Developer Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         Archives and schema discovery are not supported for event buses encrypted using a customer managed key.
     *         EventBridge returns an error if:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You call
     *         <code> <a href="https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_CreateArchive.html">CreateArchive</a> </code>
     *         on an event bus set to use a customer managed key for encryption.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You call
     *         <code> <a href="https://docs.aws.amazon.com/eventbridge/latest/schema-reference/v1-discoverers.html#CreateDiscoverer">CreateDiscoverer</a> </code>
     *         on an event bus set to use a customer managed key for encryption.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You call
     *         <code> <a href="https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_UpdatedEventBus.html">UpdatedEventBus</a> </code>
     *         to set a customer managed key on an event bus with an archives or schema discovery enabled.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To enable archives or schema discovery on an event bus, choose to use an Amazon Web Services owned key.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-encryption.html">Data encryption in
     *         EventBridge</a> in the <i>Amazon EventBridge User Guide</i>.
     *         </p>
     */

    public String getKmsKeyIdentifier() {
        return this.kmsKeyIdentifier;
    }

    /**
     * <p>
     * The identifier of the KMS customer managed key for EventBridge to use, if you choose to use a customer managed
     * key to encrypt events on this event bus. The identifier can be the key Amazon Resource Name (ARN), KeyId, key
     * alias, or key alias ARN.
     * </p>
     * <p>
     * If you do not specify a customer managed key identifier, EventBridge uses an Amazon Web Services owned key to
     * encrypt events on the event bus.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/getting-started.html">Managing keys</a> in the <i>Key
     * Management Service Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Archives and schema discovery are not supported for event buses encrypted using a customer managed key.
     * EventBridge returns an error if:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You call
     * <code> <a href="https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_CreateArchive.html">CreateArchive</a> </code>
     * on an event bus set to use a customer managed key for encryption.
     * </p>
     * </li>
     * <li>
     * <p>
     * You call
     * <code> <a href="https://docs.aws.amazon.com/eventbridge/latest/schema-reference/v1-discoverers.html#CreateDiscoverer">CreateDiscoverer</a> </code>
     * on an event bus set to use a customer managed key for encryption.
     * </p>
     * </li>
     * <li>
     * <p>
     * You call
     * <code> <a href="https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_UpdatedEventBus.html">UpdatedEventBus</a> </code>
     * to set a customer managed key on an event bus with an archives or schema discovery enabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To enable archives or schema discovery on an event bus, choose to use an Amazon Web Services owned key. For more
     * information, see <a href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-encryption.html">Data
     * encryption in EventBridge</a> in the <i>Amazon EventBridge User Guide</i>.
     * </p>
     * </note>
     * 
     * @param kmsKeyIdentifier
     *        The identifier of the KMS customer managed key for EventBridge to use, if you choose to use a customer
     *        managed key to encrypt events on this event bus. The identifier can be the key Amazon Resource Name (ARN),
     *        KeyId, key alias, or key alias ARN.</p>
     *        <p>
     *        If you do not specify a customer managed key identifier, EventBridge uses an Amazon Web Services owned key
     *        to encrypt events on the event bus.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/getting-started.html">Managing keys</a> in the
     *        <i>Key Management Service Developer Guide</i>.
     *        </p>
     *        <note>
     *        <p>
     *        Archives and schema discovery are not supported for event buses encrypted using a customer managed key.
     *        EventBridge returns an error if:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You call
     *        <code> <a href="https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_CreateArchive.html">CreateArchive</a> </code>
     *        on an event bus set to use a customer managed key for encryption.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You call
     *        <code> <a href="https://docs.aws.amazon.com/eventbridge/latest/schema-reference/v1-discoverers.html#CreateDiscoverer">CreateDiscoverer</a> </code>
     *        on an event bus set to use a customer managed key for encryption.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You call
     *        <code> <a href="https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_UpdatedEventBus.html">UpdatedEventBus</a> </code>
     *        to set a customer managed key on an event bus with an archives or schema discovery enabled.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To enable archives or schema discovery on an event bus, choose to use an Amazon Web Services owned key.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-encryption.html">Data encryption in
     *        EventBridge</a> in the <i>Amazon EventBridge User Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventBusRequest withKmsKeyIdentifier(String kmsKeyIdentifier) {
        setKmsKeyIdentifier(kmsKeyIdentifier);
        return this;
    }

    /**
     * @param deadLetterConfig
     */

    public void setDeadLetterConfig(DeadLetterConfig deadLetterConfig) {
        this.deadLetterConfig = deadLetterConfig;
    }

    /**
     * @return
     */

    public DeadLetterConfig getDeadLetterConfig() {
        return this.deadLetterConfig;
    }

    /**
     * @param deadLetterConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventBusRequest withDeadLetterConfig(DeadLetterConfig deadLetterConfig) {
        setDeadLetterConfig(deadLetterConfig);
        return this;
    }

    /**
     * <p>
     * Tags to associate with the event bus.
     * </p>
     * 
     * @return Tags to associate with the event bus.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags to associate with the event bus.
     * </p>
     * 
     * @param tags
     *        Tags to associate with the event bus.
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
     * Tags to associate with the event bus.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Tags to associate with the event bus.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventBusRequest withTags(Tag... tags) {
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
     * Tags to associate with the event bus.
     * </p>
     * 
     * @param tags
     *        Tags to associate with the event bus.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventBusRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getEventSourceName() != null)
            sb.append("EventSourceName: ").append(getEventSourceName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getKmsKeyIdentifier() != null)
            sb.append("KmsKeyIdentifier: ").append(getKmsKeyIdentifier()).append(",");
        if (getDeadLetterConfig() != null)
            sb.append("DeadLetterConfig: ").append(getDeadLetterConfig()).append(",");
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

        if (obj instanceof CreateEventBusRequest == false)
            return false;
        CreateEventBusRequest other = (CreateEventBusRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEventSourceName() == null ^ this.getEventSourceName() == null)
            return false;
        if (other.getEventSourceName() != null && other.getEventSourceName().equals(this.getEventSourceName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getKmsKeyIdentifier() == null ^ this.getKmsKeyIdentifier() == null)
            return false;
        if (other.getKmsKeyIdentifier() != null && other.getKmsKeyIdentifier().equals(this.getKmsKeyIdentifier()) == false)
            return false;
        if (other.getDeadLetterConfig() == null ^ this.getDeadLetterConfig() == null)
            return false;
        if (other.getDeadLetterConfig() != null && other.getDeadLetterConfig().equals(this.getDeadLetterConfig()) == false)
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
        hashCode = prime * hashCode + ((getEventSourceName() == null) ? 0 : getEventSourceName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyIdentifier() == null) ? 0 : getKmsKeyIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDeadLetterConfig() == null) ? 0 : getDeadLetterConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateEventBusRequest clone() {
        return (CreateEventBusRequest) super.clone();
    }

}
