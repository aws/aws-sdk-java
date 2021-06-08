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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Systems Manager automation document process to start as the runbook at the beginning of the incident.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/AutomationExecution" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutomationExecution implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the automation process.
     * </p>
     */
    private String ssmExecutionArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the automation process.
     * </p>
     * 
     * @param ssmExecutionArn
     *        The Amazon Resource Name (ARN) of the automation process.
     */

    public void setSsmExecutionArn(String ssmExecutionArn) {
        this.ssmExecutionArn = ssmExecutionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the automation process.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the automation process.
     */

    public String getSsmExecutionArn() {
        return this.ssmExecutionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the automation process.
     * </p>
     * 
     * @param ssmExecutionArn
     *        The Amazon Resource Name (ARN) of the automation process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomationExecution withSsmExecutionArn(String ssmExecutionArn) {
        setSsmExecutionArn(ssmExecutionArn);
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
        if (getSsmExecutionArn() != null)
            sb.append("SsmExecutionArn: ").append(getSsmExecutionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutomationExecution == false)
            return false;
        AutomationExecution other = (AutomationExecution) obj;
        if (other.getSsmExecutionArn() == null ^ this.getSsmExecutionArn() == null)
            return false;
        if (other.getSsmExecutionArn() != null && other.getSsmExecutionArn().equals(this.getSsmExecutionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSsmExecutionArn() == null) ? 0 : getSsmExecutionArn().hashCode());
        return hashCode;
    }

    @Override
    public AutomationExecution clone() {
        try {
            return (AutomationExecution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmincidents.model.transform.AutomationExecutionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
