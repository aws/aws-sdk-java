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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains an array of triplets made up of a condition type (such as <code>StringEquals</code>), a key, and a value.
 * Used to filter resources using their tags and assign them to a backup plan. Case sensitive.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/Condition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Condition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An operation applied to a key-value pair used to assign resources to your backup plan. Condition only supports
     * <code>StringEquals</code>. For more flexible assignment options, including <code>StringLike</code> and the
     * ability to exclude resources from your backup plan, use <code>Conditions</code> (with an "s" on the end) for your
     * <a href="https://docs.aws.amazon.com/aws-backup/latest/devguide/API_BackupSelection.html">
     * <code>BackupSelection</code> </a>.
     * </p>
     */
    private String conditionType;
    /**
     * <p>
     * The key in a key-value pair. For example, in the tag <code>Department: Accounting</code>, <code>Department</code>
     * is the key.
     * </p>
     */
    private String conditionKey;
    /**
     * <p>
     * The value in a key-value pair. For example, in the tag <code>Department: Accounting</code>,
     * <code>Accounting</code> is the value.
     * </p>
     */
    private String conditionValue;

    /**
     * <p>
     * An operation applied to a key-value pair used to assign resources to your backup plan. Condition only supports
     * <code>StringEquals</code>. For more flexible assignment options, including <code>StringLike</code> and the
     * ability to exclude resources from your backup plan, use <code>Conditions</code> (with an "s" on the end) for your
     * <a href="https://docs.aws.amazon.com/aws-backup/latest/devguide/API_BackupSelection.html">
     * <code>BackupSelection</code> </a>.
     * </p>
     * 
     * @param conditionType
     *        An operation applied to a key-value pair used to assign resources to your backup plan. Condition only
     *        supports <code>StringEquals</code>. For more flexible assignment options, including
     *        <code>StringLike</code> and the ability to exclude resources from your backup plan, use
     *        <code>Conditions</code> (with an "s" on the end) for your <a
     *        href="https://docs.aws.amazon.com/aws-backup/latest/devguide/API_BackupSelection.html">
     *        <code>BackupSelection</code> </a>.
     * @see ConditionType
     */

    public void setConditionType(String conditionType) {
        this.conditionType = conditionType;
    }

    /**
     * <p>
     * An operation applied to a key-value pair used to assign resources to your backup plan. Condition only supports
     * <code>StringEquals</code>. For more flexible assignment options, including <code>StringLike</code> and the
     * ability to exclude resources from your backup plan, use <code>Conditions</code> (with an "s" on the end) for your
     * <a href="https://docs.aws.amazon.com/aws-backup/latest/devguide/API_BackupSelection.html">
     * <code>BackupSelection</code> </a>.
     * </p>
     * 
     * @return An operation applied to a key-value pair used to assign resources to your backup plan. Condition only
     *         supports <code>StringEquals</code>. For more flexible assignment options, including
     *         <code>StringLike</code> and the ability to exclude resources from your backup plan, use
     *         <code>Conditions</code> (with an "s" on the end) for your <a
     *         href="https://docs.aws.amazon.com/aws-backup/latest/devguide/API_BackupSelection.html">
     *         <code>BackupSelection</code> </a>.
     * @see ConditionType
     */

    public String getConditionType() {
        return this.conditionType;
    }

    /**
     * <p>
     * An operation applied to a key-value pair used to assign resources to your backup plan. Condition only supports
     * <code>StringEquals</code>. For more flexible assignment options, including <code>StringLike</code> and the
     * ability to exclude resources from your backup plan, use <code>Conditions</code> (with an "s" on the end) for your
     * <a href="https://docs.aws.amazon.com/aws-backup/latest/devguide/API_BackupSelection.html">
     * <code>BackupSelection</code> </a>.
     * </p>
     * 
     * @param conditionType
     *        An operation applied to a key-value pair used to assign resources to your backup plan. Condition only
     *        supports <code>StringEquals</code>. For more flexible assignment options, including
     *        <code>StringLike</code> and the ability to exclude resources from your backup plan, use
     *        <code>Conditions</code> (with an "s" on the end) for your <a
     *        href="https://docs.aws.amazon.com/aws-backup/latest/devguide/API_BackupSelection.html">
     *        <code>BackupSelection</code> </a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConditionType
     */

    public Condition withConditionType(String conditionType) {
        setConditionType(conditionType);
        return this;
    }

    /**
     * <p>
     * An operation applied to a key-value pair used to assign resources to your backup plan. Condition only supports
     * <code>StringEquals</code>. For more flexible assignment options, including <code>StringLike</code> and the
     * ability to exclude resources from your backup plan, use <code>Conditions</code> (with an "s" on the end) for your
     * <a href="https://docs.aws.amazon.com/aws-backup/latest/devguide/API_BackupSelection.html">
     * <code>BackupSelection</code> </a>.
     * </p>
     * 
     * @param conditionType
     *        An operation applied to a key-value pair used to assign resources to your backup plan. Condition only
     *        supports <code>StringEquals</code>. For more flexible assignment options, including
     *        <code>StringLike</code> and the ability to exclude resources from your backup plan, use
     *        <code>Conditions</code> (with an "s" on the end) for your <a
     *        href="https://docs.aws.amazon.com/aws-backup/latest/devguide/API_BackupSelection.html">
     *        <code>BackupSelection</code> </a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConditionType
     */

    public Condition withConditionType(ConditionType conditionType) {
        this.conditionType = conditionType.toString();
        return this;
    }

    /**
     * <p>
     * The key in a key-value pair. For example, in the tag <code>Department: Accounting</code>, <code>Department</code>
     * is the key.
     * </p>
     * 
     * @param conditionKey
     *        The key in a key-value pair. For example, in the tag <code>Department: Accounting</code>,
     *        <code>Department</code> is the key.
     */

    public void setConditionKey(String conditionKey) {
        this.conditionKey = conditionKey;
    }

    /**
     * <p>
     * The key in a key-value pair. For example, in the tag <code>Department: Accounting</code>, <code>Department</code>
     * is the key.
     * </p>
     * 
     * @return The key in a key-value pair. For example, in the tag <code>Department: Accounting</code>,
     *         <code>Department</code> is the key.
     */

    public String getConditionKey() {
        return this.conditionKey;
    }

    /**
     * <p>
     * The key in a key-value pair. For example, in the tag <code>Department: Accounting</code>, <code>Department</code>
     * is the key.
     * </p>
     * 
     * @param conditionKey
     *        The key in a key-value pair. For example, in the tag <code>Department: Accounting</code>,
     *        <code>Department</code> is the key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Condition withConditionKey(String conditionKey) {
        setConditionKey(conditionKey);
        return this;
    }

    /**
     * <p>
     * The value in a key-value pair. For example, in the tag <code>Department: Accounting</code>,
     * <code>Accounting</code> is the value.
     * </p>
     * 
     * @param conditionValue
     *        The value in a key-value pair. For example, in the tag <code>Department: Accounting</code>,
     *        <code>Accounting</code> is the value.
     */

    public void setConditionValue(String conditionValue) {
        this.conditionValue = conditionValue;
    }

    /**
     * <p>
     * The value in a key-value pair. For example, in the tag <code>Department: Accounting</code>,
     * <code>Accounting</code> is the value.
     * </p>
     * 
     * @return The value in a key-value pair. For example, in the tag <code>Department: Accounting</code>,
     *         <code>Accounting</code> is the value.
     */

    public String getConditionValue() {
        return this.conditionValue;
    }

    /**
     * <p>
     * The value in a key-value pair. For example, in the tag <code>Department: Accounting</code>,
     * <code>Accounting</code> is the value.
     * </p>
     * 
     * @param conditionValue
     *        The value in a key-value pair. For example, in the tag <code>Department: Accounting</code>,
     *        <code>Accounting</code> is the value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Condition withConditionValue(String conditionValue) {
        setConditionValue(conditionValue);
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
        if (getConditionType() != null)
            sb.append("ConditionType: ").append(getConditionType()).append(",");
        if (getConditionKey() != null)
            sb.append("ConditionKey: ").append(getConditionKey()).append(",");
        if (getConditionValue() != null)
            sb.append("ConditionValue: ").append(getConditionValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Condition == false)
            return false;
        Condition other = (Condition) obj;
        if (other.getConditionType() == null ^ this.getConditionType() == null)
            return false;
        if (other.getConditionType() != null && other.getConditionType().equals(this.getConditionType()) == false)
            return false;
        if (other.getConditionKey() == null ^ this.getConditionKey() == null)
            return false;
        if (other.getConditionKey() != null && other.getConditionKey().equals(this.getConditionKey()) == false)
            return false;
        if (other.getConditionValue() == null ^ this.getConditionValue() == null)
            return false;
        if (other.getConditionValue() != null && other.getConditionValue().equals(this.getConditionValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConditionType() == null) ? 0 : getConditionType().hashCode());
        hashCode = prime * hashCode + ((getConditionKey() == null) ? 0 : getConditionKey().hashCode());
        hashCode = prime * hashCode + ((getConditionValue() == null) ? 0 : getConditionValue().hashCode());
        return hashCode;
    }

    @Override
    public Condition clone() {
        try {
            return (Condition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.ConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
