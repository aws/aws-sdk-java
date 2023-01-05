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
 * This is a recovery point which is a child (nested) recovery point of a parent (composite) recovery point. These
 * recovery points can be disassociated from their parent (composite) recovery point, in which case they will no longer
 * be a member.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/RecoveryPointMember" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecoveryPointMember implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This is the Amazon Resource Name (ARN) of the parent (composite) recovery point.
     * </p>
     */
    private String recoveryPointArn;

    /**
     * <p>
     * This is the Amazon Resource Name (ARN) of the parent (composite) recovery point.
     * </p>
     * 
     * @param recoveryPointArn
     *        This is the Amazon Resource Name (ARN) of the parent (composite) recovery point.
     */

    public void setRecoveryPointArn(String recoveryPointArn) {
        this.recoveryPointArn = recoveryPointArn;
    }

    /**
     * <p>
     * This is the Amazon Resource Name (ARN) of the parent (composite) recovery point.
     * </p>
     * 
     * @return This is the Amazon Resource Name (ARN) of the parent (composite) recovery point.
     */

    public String getRecoveryPointArn() {
        return this.recoveryPointArn;
    }

    /**
     * <p>
     * This is the Amazon Resource Name (ARN) of the parent (composite) recovery point.
     * </p>
     * 
     * @param recoveryPointArn
     *        This is the Amazon Resource Name (ARN) of the parent (composite) recovery point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryPointMember withRecoveryPointArn(String recoveryPointArn) {
        setRecoveryPointArn(recoveryPointArn);
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
        if (getRecoveryPointArn() != null)
            sb.append("RecoveryPointArn: ").append(getRecoveryPointArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecoveryPointMember == false)
            return false;
        RecoveryPointMember other = (RecoveryPointMember) obj;
        if (other.getRecoveryPointArn() == null ^ this.getRecoveryPointArn() == null)
            return false;
        if (other.getRecoveryPointArn() != null && other.getRecoveryPointArn().equals(this.getRecoveryPointArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecoveryPointArn() == null) ? 0 : getRecoveryPointArn().hashCode());
        return hashCode;
    }

    @Override
    public RecoveryPointMember clone() {
        try {
            return (RecoveryPointMember) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.RecoveryPointMemberMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
