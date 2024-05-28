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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about a specific state machine alias.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/StateMachineAliasListItem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StateMachineAliasListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies a state machine alias. The alias ARN is a combination of state
     * machine ARN and the alias name separated by a colon (:). For example, <code>stateMachineARN:PROD</code>.
     * </p>
     */
    private String stateMachineAliasArn;
    /**
     * <p>
     * The creation date of a state machine alias.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies a state machine alias. The alias ARN is a combination of state
     * machine ARN and the alias name separated by a colon (:). For example, <code>stateMachineARN:PROD</code>.
     * </p>
     * 
     * @param stateMachineAliasArn
     *        The Amazon Resource Name (ARN) that identifies a state machine alias. The alias ARN is a combination of
     *        state machine ARN and the alias name separated by a colon (:). For example,
     *        <code>stateMachineARN:PROD</code>.
     */

    public void setStateMachineAliasArn(String stateMachineAliasArn) {
        this.stateMachineAliasArn = stateMachineAliasArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies a state machine alias. The alias ARN is a combination of state
     * machine ARN and the alias name separated by a colon (:). For example, <code>stateMachineARN:PROD</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that identifies a state machine alias. The alias ARN is a combination of
     *         state machine ARN and the alias name separated by a colon (:). For example,
     *         <code>stateMachineARN:PROD</code>.
     */

    public String getStateMachineAliasArn() {
        return this.stateMachineAliasArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies a state machine alias. The alias ARN is a combination of state
     * machine ARN and the alias name separated by a colon (:). For example, <code>stateMachineARN:PROD</code>.
     * </p>
     * 
     * @param stateMachineAliasArn
     *        The Amazon Resource Name (ARN) that identifies a state machine alias. The alias ARN is a combination of
     *        state machine ARN and the alias name separated by a colon (:). For example,
     *        <code>stateMachineARN:PROD</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StateMachineAliasListItem withStateMachineAliasArn(String stateMachineAliasArn) {
        setStateMachineAliasArn(stateMachineAliasArn);
        return this;
    }

    /**
     * <p>
     * The creation date of a state machine alias.
     * </p>
     * 
     * @param creationDate
     *        The creation date of a state machine alias.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The creation date of a state machine alias.
     * </p>
     * 
     * @return The creation date of a state machine alias.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The creation date of a state machine alias.
     * </p>
     * 
     * @param creationDate
     *        The creation date of a state machine alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StateMachineAliasListItem withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
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
        if (getStateMachineAliasArn() != null)
            sb.append("StateMachineAliasArn: ").append(getStateMachineAliasArn()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StateMachineAliasListItem == false)
            return false;
        StateMachineAliasListItem other = (StateMachineAliasListItem) obj;
        if (other.getStateMachineAliasArn() == null ^ this.getStateMachineAliasArn() == null)
            return false;
        if (other.getStateMachineAliasArn() != null && other.getStateMachineAliasArn().equals(this.getStateMachineAliasArn()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStateMachineAliasArn() == null) ? 0 : getStateMachineAliasArn().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        return hashCode;
    }

    @Override
    public StateMachineAliasListItem clone() {
        try {
            return (StateMachineAliasListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.stepfunctions.model.transform.StateMachineAliasListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
