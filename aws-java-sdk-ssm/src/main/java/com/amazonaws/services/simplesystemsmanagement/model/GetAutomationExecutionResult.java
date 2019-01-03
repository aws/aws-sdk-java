/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetAutomationExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAutomationExecutionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Detailed information about the current state of an automation execution.
     * </p>
     */
    private AutomationExecution automationExecution;

    /**
     * <p>
     * Detailed information about the current state of an automation execution.
     * </p>
     * 
     * @param automationExecution
     *        Detailed information about the current state of an automation execution.
     */

    public void setAutomationExecution(AutomationExecution automationExecution) {
        this.automationExecution = automationExecution;
    }

    /**
     * <p>
     * Detailed information about the current state of an automation execution.
     * </p>
     * 
     * @return Detailed information about the current state of an automation execution.
     */

    public AutomationExecution getAutomationExecution() {
        return this.automationExecution;
    }

    /**
     * <p>
     * Detailed information about the current state of an automation execution.
     * </p>
     * 
     * @param automationExecution
     *        Detailed information about the current state of an automation execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAutomationExecutionResult withAutomationExecution(AutomationExecution automationExecution) {
        setAutomationExecution(automationExecution);
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
        if (getAutomationExecution() != null)
            sb.append("AutomationExecution: ").append(getAutomationExecution());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAutomationExecutionResult == false)
            return false;
        GetAutomationExecutionResult other = (GetAutomationExecutionResult) obj;
        if (other.getAutomationExecution() == null ^ this.getAutomationExecution() == null)
            return false;
        if (other.getAutomationExecution() != null && other.getAutomationExecution().equals(this.getAutomationExecution()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutomationExecution() == null) ? 0 : getAutomationExecution().hashCode());
        return hashCode;
    }

    @Override
    public GetAutomationExecutionResult clone() {
        try {
            return (GetAutomationExecutionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
