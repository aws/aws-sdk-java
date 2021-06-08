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
package com.amazonaws.services.cloudhsmv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A policy that defines the number of days to retain backups.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/BackupRetentionPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BackupRetentionPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of backup retention policy. For the <code>DAYS</code> type, the value is the number of days to retain
     * backups.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Use a value between 7 - 379.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The type of backup retention policy. For the <code>DAYS</code> type, the value is the number of days to retain
     * backups.
     * </p>
     * 
     * @param type
     *        The type of backup retention policy. For the <code>DAYS</code> type, the value is the number of days to
     *        retain backups.
     * @see BackupRetentionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of backup retention policy. For the <code>DAYS</code> type, the value is the number of days to retain
     * backups.
     * </p>
     * 
     * @return The type of backup retention policy. For the <code>DAYS</code> type, the value is the number of days to
     *         retain backups.
     * @see BackupRetentionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of backup retention policy. For the <code>DAYS</code> type, the value is the number of days to retain
     * backups.
     * </p>
     * 
     * @param type
     *        The type of backup retention policy. For the <code>DAYS</code> type, the value is the number of days to
     *        retain backups.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BackupRetentionType
     */

    public BackupRetentionPolicy withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of backup retention policy. For the <code>DAYS</code> type, the value is the number of days to retain
     * backups.
     * </p>
     * 
     * @param type
     *        The type of backup retention policy. For the <code>DAYS</code> type, the value is the number of days to
     *        retain backups.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BackupRetentionType
     */

    public BackupRetentionPolicy withType(BackupRetentionType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Use a value between 7 - 379.
     * </p>
     * 
     * @param value
     *        Use a value between 7 - 379.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * Use a value between 7 - 379.
     * </p>
     * 
     * @return Use a value between 7 - 379.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * Use a value between 7 - 379.
     * </p>
     * 
     * @param value
     *        Use a value between 7 - 379.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupRetentionPolicy withValue(String value) {
        setValue(value);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BackupRetentionPolicy == false)
            return false;
        BackupRetentionPolicy other = (BackupRetentionPolicy) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public BackupRetentionPolicy clone() {
        try {
            return (BackupRetentionPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudhsmv2.model.transform.BackupRetentionPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
