/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the source of a logical table. This is a variant type structure. For this structure to be valid,
 * only one of the attributes can be non-null.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/LogicalTableSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogicalTableSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the result of a join of two logical tables.
     * </p>
     */
    private JoinInstruction joinInstruction;
    /**
     * <p>
     * Physical table ID.
     * </p>
     */
    private String physicalTableId;

    /**
     * <p>
     * Specifies the result of a join of two logical tables.
     * </p>
     * 
     * @param joinInstruction
     *        Specifies the result of a join of two logical tables.
     */

    public void setJoinInstruction(JoinInstruction joinInstruction) {
        this.joinInstruction = joinInstruction;
    }

    /**
     * <p>
     * Specifies the result of a join of two logical tables.
     * </p>
     * 
     * @return Specifies the result of a join of two logical tables.
     */

    public JoinInstruction getJoinInstruction() {
        return this.joinInstruction;
    }

    /**
     * <p>
     * Specifies the result of a join of two logical tables.
     * </p>
     * 
     * @param joinInstruction
     *        Specifies the result of a join of two logical tables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogicalTableSource withJoinInstruction(JoinInstruction joinInstruction) {
        setJoinInstruction(joinInstruction);
        return this;
    }

    /**
     * <p>
     * Physical table ID.
     * </p>
     * 
     * @param physicalTableId
     *        Physical table ID.
     */

    public void setPhysicalTableId(String physicalTableId) {
        this.physicalTableId = physicalTableId;
    }

    /**
     * <p>
     * Physical table ID.
     * </p>
     * 
     * @return Physical table ID.
     */

    public String getPhysicalTableId() {
        return this.physicalTableId;
    }

    /**
     * <p>
     * Physical table ID.
     * </p>
     * 
     * @param physicalTableId
     *        Physical table ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogicalTableSource withPhysicalTableId(String physicalTableId) {
        setPhysicalTableId(physicalTableId);
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
        if (getJoinInstruction() != null)
            sb.append("JoinInstruction: ").append(getJoinInstruction()).append(",");
        if (getPhysicalTableId() != null)
            sb.append("PhysicalTableId: ").append(getPhysicalTableId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogicalTableSource == false)
            return false;
        LogicalTableSource other = (LogicalTableSource) obj;
        if (other.getJoinInstruction() == null ^ this.getJoinInstruction() == null)
            return false;
        if (other.getJoinInstruction() != null && other.getJoinInstruction().equals(this.getJoinInstruction()) == false)
            return false;
        if (other.getPhysicalTableId() == null ^ this.getPhysicalTableId() == null)
            return false;
        if (other.getPhysicalTableId() != null && other.getPhysicalTableId().equals(this.getPhysicalTableId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJoinInstruction() == null) ? 0 : getJoinInstruction().hashCode());
        hashCode = prime * hashCode + ((getPhysicalTableId() == null) ? 0 : getPhysicalTableId().hashCode());
        return hashCode;
    }

    @Override
    public LogicalTableSource clone() {
        try {
            return (LogicalTableSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.LogicalTableSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
