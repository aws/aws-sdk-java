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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/StopAutomationExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopAutomationExecutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The execution ID of the Automation to stop.
     * </p>
     */
    private String automationExecutionId;
    /**
     * <p>
     * The stop request type. Valid types include the following: Cancel and Complete. The default type is Cancel.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The execution ID of the Automation to stop.
     * </p>
     * 
     * @param automationExecutionId
     *        The execution ID of the Automation to stop.
     */

    public void setAutomationExecutionId(String automationExecutionId) {
        this.automationExecutionId = automationExecutionId;
    }

    /**
     * <p>
     * The execution ID of the Automation to stop.
     * </p>
     * 
     * @return The execution ID of the Automation to stop.
     */

    public String getAutomationExecutionId() {
        return this.automationExecutionId;
    }

    /**
     * <p>
     * The execution ID of the Automation to stop.
     * </p>
     * 
     * @param automationExecutionId
     *        The execution ID of the Automation to stop.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopAutomationExecutionRequest withAutomationExecutionId(String automationExecutionId) {
        setAutomationExecutionId(automationExecutionId);
        return this;
    }

    /**
     * <p>
     * The stop request type. Valid types include the following: Cancel and Complete. The default type is Cancel.
     * </p>
     * 
     * @param type
     *        The stop request type. Valid types include the following: Cancel and Complete. The default type is Cancel.
     * @see StopType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The stop request type. Valid types include the following: Cancel and Complete. The default type is Cancel.
     * </p>
     * 
     * @return The stop request type. Valid types include the following: Cancel and Complete. The default type is
     *         Cancel.
     * @see StopType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The stop request type. Valid types include the following: Cancel and Complete. The default type is Cancel.
     * </p>
     * 
     * @param type
     *        The stop request type. Valid types include the following: Cancel and Complete. The default type is Cancel.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StopType
     */

    public StopAutomationExecutionRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The stop request type. Valid types include the following: Cancel and Complete. The default type is Cancel.
     * </p>
     * 
     * @param type
     *        The stop request type. Valid types include the following: Cancel and Complete. The default type is Cancel.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StopType
     */

    public StopAutomationExecutionRequest withType(StopType type) {
        this.type = type.toString();
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
            sb.append("AutomationExecutionId: ").append(getAutomationExecutionId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopAutomationExecutionRequest == false)
            return false;
        StopAutomationExecutionRequest other = (StopAutomationExecutionRequest) obj;
        if (other.getAutomationExecutionId() == null ^ this.getAutomationExecutionId() == null)
            return false;
        if (other.getAutomationExecutionId() != null && other.getAutomationExecutionId().equals(this.getAutomationExecutionId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutomationExecutionId() == null) ? 0 : getAutomationExecutionId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public StopAutomationExecutionRequest clone() {
        return (StopAutomationExecutionRequest) super.clone();
    }

}
