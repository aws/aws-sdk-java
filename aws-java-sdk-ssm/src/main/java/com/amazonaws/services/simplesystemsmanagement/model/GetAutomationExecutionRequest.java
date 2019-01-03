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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetAutomationExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAutomationExecutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for an existing automation execution to examine. The execution ID is returned by
     * StartAutomationExecution when the execution of an Automation document is initiated.
     * </p>
     */
    private String automationExecutionId;

    /**
     * <p>
     * The unique identifier for an existing automation execution to examine. The execution ID is returned by
     * StartAutomationExecution when the execution of an Automation document is initiated.
     * </p>
     * 
     * @param automationExecutionId
     *        The unique identifier for an existing automation execution to examine. The execution ID is returned by
     *        StartAutomationExecution when the execution of an Automation document is initiated.
     */

    public void setAutomationExecutionId(String automationExecutionId) {
        this.automationExecutionId = automationExecutionId;
    }

    /**
     * <p>
     * The unique identifier for an existing automation execution to examine. The execution ID is returned by
     * StartAutomationExecution when the execution of an Automation document is initiated.
     * </p>
     * 
     * @return The unique identifier for an existing automation execution to examine. The execution ID is returned by
     *         StartAutomationExecution when the execution of an Automation document is initiated.
     */

    public String getAutomationExecutionId() {
        return this.automationExecutionId;
    }

    /**
     * <p>
     * The unique identifier for an existing automation execution to examine. The execution ID is returned by
     * StartAutomationExecution when the execution of an Automation document is initiated.
     * </p>
     * 
     * @param automationExecutionId
     *        The unique identifier for an existing automation execution to examine. The execution ID is returned by
     *        StartAutomationExecution when the execution of an Automation document is initiated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAutomationExecutionRequest withAutomationExecutionId(String automationExecutionId) {
        setAutomationExecutionId(automationExecutionId);
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
        if (getAutomationExecutionId() != null)
            sb.append("AutomationExecutionId: ").append(getAutomationExecutionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAutomationExecutionRequest == false)
            return false;
        GetAutomationExecutionRequest other = (GetAutomationExecutionRequest) obj;
        if (other.getAutomationExecutionId() == null ^ this.getAutomationExecutionId() == null)
            return false;
        if (other.getAutomationExecutionId() != null && other.getAutomationExecutionId().equals(this.getAutomationExecutionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutomationExecutionId() == null) ? 0 : getAutomationExecutionId().hashCode());
        return hashCode;
    }

    @Override
    public GetAutomationExecutionRequest clone() {
        return (GetAutomationExecutionRequest) super.clone();
    }

}
