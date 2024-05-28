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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/DescribeEventBus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEventBusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the event bus. Currently, this is always <code>default</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account permitted to write events to the current account.
     * </p>
     */
    private String arn;
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
     * The policy that enables the external account to send events to your account.
     * </p>
     */
    private String policy;
    /**
     * <p>
     * The time the event bus was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time the event bus was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The name of the event bus. Currently, this is always <code>default</code>.
     * </p>
     * 
     * @param name
     *        The name of the event bus. Currently, this is always <code>default</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the event bus. Currently, this is always <code>default</code>.
     * </p>
     * 
     * @return The name of the event bus. Currently, this is always <code>default</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the event bus. Currently, this is always <code>default</code>.
     * </p>
     * 
     * @param name
     *        The name of the event bus. Currently, this is always <code>default</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventBusResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account permitted to write events to the current account.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the account permitted to write events to the current account.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account permitted to write events to the current account.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the account permitted to write events to the current account.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account permitted to write events to the current account.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the account permitted to write events to the current account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventBusResult withArn(String arn) {
        setArn(arn);
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

    public DescribeEventBusResult withDescription(String description) {
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

    public DescribeEventBusResult withKmsKeyIdentifier(String kmsKeyIdentifier) {
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

    public DescribeEventBusResult withDeadLetterConfig(DeadLetterConfig deadLetterConfig) {
        setDeadLetterConfig(deadLetterConfig);
        return this;
    }

    /**
     * <p>
     * The policy that enables the external account to send events to your account.
     * </p>
     * 
     * @param policy
     *        The policy that enables the external account to send events to your account.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The policy that enables the external account to send events to your account.
     * </p>
     * 
     * @return The policy that enables the external account to send events to your account.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The policy that enables the external account to send events to your account.
     * </p>
     * 
     * @param policy
     *        The policy that enables the external account to send events to your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventBusResult withPolicy(String policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * <p>
     * The time the event bus was created.
     * </p>
     * 
     * @param creationTime
     *        The time the event bus was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the event bus was created.
     * </p>
     * 
     * @return The time the event bus was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time the event bus was created.
     * </p>
     * 
     * @param creationTime
     *        The time the event bus was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventBusResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time the event bus was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time the event bus was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The time the event bus was last modified.
     * </p>
     * 
     * @return The time the event bus was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The time the event bus was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time the event bus was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventBusResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getKmsKeyIdentifier() != null)
            sb.append("KmsKeyIdentifier: ").append(getKmsKeyIdentifier()).append(",");
        if (getDeadLetterConfig() != null)
            sb.append("DeadLetterConfig: ").append(getDeadLetterConfig()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEventBusResult == false)
            return false;
        DescribeEventBusResult other = (DescribeEventBusResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
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
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyIdentifier() == null) ? 0 : getKmsKeyIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDeadLetterConfig() == null) ? 0 : getDeadLetterConfig().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEventBusResult clone() {
        try {
            return (DescribeEventBusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
