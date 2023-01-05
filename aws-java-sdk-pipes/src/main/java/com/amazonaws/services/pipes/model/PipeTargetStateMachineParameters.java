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
package com.amazonaws.services.pipes.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The parameters for using a Step Functions state machine as a target.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/PipeTargetStateMachineParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipeTargetStateMachineParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specify whether to wait for the state machine to finish or not.
     * </p>
     */
    private String invocationType;

    /**
     * <p>
     * Specify whether to wait for the state machine to finish or not.
     * </p>
     * 
     * @param invocationType
     *        Specify whether to wait for the state machine to finish or not.
     * @see PipeTargetInvocationType
     */

    public void setInvocationType(String invocationType) {
        this.invocationType = invocationType;
    }

    /**
     * <p>
     * Specify whether to wait for the state machine to finish or not.
     * </p>
     * 
     * @return Specify whether to wait for the state machine to finish or not.
     * @see PipeTargetInvocationType
     */

    public String getInvocationType() {
        return this.invocationType;
    }

    /**
     * <p>
     * Specify whether to wait for the state machine to finish or not.
     * </p>
     * 
     * @param invocationType
     *        Specify whether to wait for the state machine to finish or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipeTargetInvocationType
     */

    public PipeTargetStateMachineParameters withInvocationType(String invocationType) {
        setInvocationType(invocationType);
        return this;
    }

    /**
     * <p>
     * Specify whether to wait for the state machine to finish or not.
     * </p>
     * 
     * @param invocationType
     *        Specify whether to wait for the state machine to finish or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipeTargetInvocationType
     */

    public PipeTargetStateMachineParameters withInvocationType(PipeTargetInvocationType invocationType) {
        this.invocationType = invocationType.toString();
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
        if (getInvocationType() != null)
            sb.append("InvocationType: ").append(getInvocationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipeTargetStateMachineParameters == false)
            return false;
        PipeTargetStateMachineParameters other = (PipeTargetStateMachineParameters) obj;
        if (other.getInvocationType() == null ^ this.getInvocationType() == null)
            return false;
        if (other.getInvocationType() != null && other.getInvocationType().equals(this.getInvocationType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInvocationType() == null) ? 0 : getInvocationType().hashCode());
        return hashCode;
    }

    @Override
    public PipeTargetStateMachineParameters clone() {
        try {
            return (PipeTargetStateMachineParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pipes.model.transform.PipeTargetStateMachineParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
