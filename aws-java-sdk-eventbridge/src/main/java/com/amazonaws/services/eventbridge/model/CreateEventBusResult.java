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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/CreateEventBus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEventBusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the new event bus.
     * </p>
     */
    private String eventBusArn;
    /**
     * <p>
     * The event bus description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The identifier of the KMS customer managed key for EventBridge to use to encrypt events on this event bus, if one
     * has been specified.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-encryption.html">Data encryption in
     * EventBridge</a> in the <i>Amazon EventBridge User Guide</i>.
     * </p>
     */
    private String kmsKeyIdentifier;

    private DeadLetterConfig deadLetterConfig;

    /**
     * <p>
     * The ARN of the new event bus.
     * </p>
     * 
     * @param eventBusArn
     *        The ARN of the new event bus.
     */

    public void setEventBusArn(String eventBusArn) {
        this.eventBusArn = eventBusArn;
    }

    /**
     * <p>
     * The ARN of the new event bus.
     * </p>
     * 
     * @return The ARN of the new event bus.
     */

    public String getEventBusArn() {
        return this.eventBusArn;
    }

    /**
     * <p>
     * The ARN of the new event bus.
     * </p>
     * 
     * @param eventBusArn
     *        The ARN of the new event bus.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventBusResult withEventBusArn(String eventBusArn) {
        setEventBusArn(eventBusArn);
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

    public CreateEventBusResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The identifier of the KMS customer managed key for EventBridge to use to encrypt events on this event bus, if one
     * has been specified.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-encryption.html">Data encryption in
     * EventBridge</a> in the <i>Amazon EventBridge User Guide</i>.
     * </p>
     * 
     * @param kmsKeyIdentifier
     *        The identifier of the KMS customer managed key for EventBridge to use to encrypt events on this event bus,
     *        if one has been specified.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-encryption.html">Data encryption in
     *        EventBridge</a> in the <i>Amazon EventBridge User Guide</i>.
     */

    public void setKmsKeyIdentifier(String kmsKeyIdentifier) {
        this.kmsKeyIdentifier = kmsKeyIdentifier;
    }

    /**
     * <p>
     * The identifier of the KMS customer managed key for EventBridge to use to encrypt events on this event bus, if one
     * has been specified.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-encryption.html">Data encryption in
     * EventBridge</a> in the <i>Amazon EventBridge User Guide</i>.
     * </p>
     * 
     * @return The identifier of the KMS customer managed key for EventBridge to use to encrypt events on this event
     *         bus, if one has been specified.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-encryption.html">Data encryption in
     *         EventBridge</a> in the <i>Amazon EventBridge User Guide</i>.
     */

    public String getKmsKeyIdentifier() {
        return this.kmsKeyIdentifier;
    }

    /**
     * <p>
     * The identifier of the KMS customer managed key for EventBridge to use to encrypt events on this event bus, if one
     * has been specified.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-encryption.html">Data encryption in
     * EventBridge</a> in the <i>Amazon EventBridge User Guide</i>.
     * </p>
     * 
     * @param kmsKeyIdentifier
     *        The identifier of the KMS customer managed key for EventBridge to use to encrypt events on this event bus,
     *        if one has been specified.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-encryption.html">Data encryption in
     *        EventBridge</a> in the <i>Amazon EventBridge User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventBusResult withKmsKeyIdentifier(String kmsKeyIdentifier) {
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

    public CreateEventBusResult withDeadLetterConfig(DeadLetterConfig deadLetterConfig) {
        setDeadLetterConfig(deadLetterConfig);
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
        if (getEventBusArn() != null)
            sb.append("EventBusArn: ").append(getEventBusArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getKmsKeyIdentifier() != null)
            sb.append("KmsKeyIdentifier: ").append(getKmsKeyIdentifier()).append(",");
        if (getDeadLetterConfig() != null)
            sb.append("DeadLetterConfig: ").append(getDeadLetterConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEventBusResult == false)
            return false;
        CreateEventBusResult other = (CreateEventBusResult) obj;
        if (other.getEventBusArn() == null ^ this.getEventBusArn() == null)
            return false;
        if (other.getEventBusArn() != null && other.getEventBusArn().equals(this.getEventBusArn()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventBusArn() == null) ? 0 : getEventBusArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyIdentifier() == null) ? 0 : getKmsKeyIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDeadLetterConfig() == null) ? 0 : getDeadLetterConfig().hashCode());
        return hashCode;
    }

    @Override
    public CreateEventBusResult clone() {
        try {
            return (CreateEventBusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
