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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/UpdateEventBus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEventBusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The event bus Amazon Resource Name (ARN).
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The event bus name.
     * </p>
     */
    private String name;
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
    /**
     * <p>
     * The event bus description.
     * </p>
     */
    private String description;

    private DeadLetterConfig deadLetterConfig;

    /**
     * <p>
     * The event bus Amazon Resource Name (ARN).
     * </p>
     * 
     * @param arn
     *        The event bus Amazon Resource Name (ARN).
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The event bus Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The event bus Amazon Resource Name (ARN).
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The event bus Amazon Resource Name (ARN).
     * </p>
     * 
     * @param arn
     *        The event bus Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventBusResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The event bus name.
     * </p>
     * 
     * @param name
     *        The event bus name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The event bus name.
     * </p>
     * 
     * @return The event bus name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The event bus name.
     * </p>
     * 
     * @param name
     *        The event bus name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventBusResult withName(String name) {
        setName(name);
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

    public UpdateEventBusResult withKmsKeyIdentifier(String kmsKeyIdentifier) {
        setKmsKeyIdentifier(kmsKeyIdentifier);
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

    public UpdateEventBusResult withDescription(String description) {
        setDescription(description);
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

    public UpdateEventBusResult withDeadLetterConfig(DeadLetterConfig deadLetterConfig) {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getKmsKeyIdentifier() != null)
            sb.append("KmsKeyIdentifier: ").append(getKmsKeyIdentifier()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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

        if (obj instanceof UpdateEventBusResult == false)
            return false;
        UpdateEventBusResult other = (UpdateEventBusResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getKmsKeyIdentifier() == null ^ this.getKmsKeyIdentifier() == null)
            return false;
        if (other.getKmsKeyIdentifier() != null && other.getKmsKeyIdentifier().equals(this.getKmsKeyIdentifier()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyIdentifier() == null) ? 0 : getKmsKeyIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDeadLetterConfig() == null) ? 0 : getDeadLetterConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEventBusResult clone() {
        try {
            return (UpdateEventBusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
