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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The information about the agent turn in a test set execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/AgentTurnResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentTurnResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The expected agent prompt for the agent turn in a test set execution.
     * </p>
     */
    private String expectedAgentPrompt;
    /**
     * <p>
     * The actual agent prompt for the agent turn in a test set execution.
     * </p>
     */
    private String actualAgentPrompt;

    private ExecutionErrorDetails errorDetails;
    /**
     * <p>
     * The actual elicited slot for the agent turn in a test set execution.
     * </p>
     */
    private String actualElicitedSlot;
    /**
     * <p>
     * The actual intent for the agent turn in a test set execution.
     * </p>
     */
    private String actualIntent;

    /**
     * <p>
     * The expected agent prompt for the agent turn in a test set execution.
     * </p>
     * 
     * @param expectedAgentPrompt
     *        The expected agent prompt for the agent turn in a test set execution.
     */

    public void setExpectedAgentPrompt(String expectedAgentPrompt) {
        this.expectedAgentPrompt = expectedAgentPrompt;
    }

    /**
     * <p>
     * The expected agent prompt for the agent turn in a test set execution.
     * </p>
     * 
     * @return The expected agent prompt for the agent turn in a test set execution.
     */

    public String getExpectedAgentPrompt() {
        return this.expectedAgentPrompt;
    }

    /**
     * <p>
     * The expected agent prompt for the agent turn in a test set execution.
     * </p>
     * 
     * @param expectedAgentPrompt
     *        The expected agent prompt for the agent turn in a test set execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentTurnResult withExpectedAgentPrompt(String expectedAgentPrompt) {
        setExpectedAgentPrompt(expectedAgentPrompt);
        return this;
    }

    /**
     * <p>
     * The actual agent prompt for the agent turn in a test set execution.
     * </p>
     * 
     * @param actualAgentPrompt
     *        The actual agent prompt for the agent turn in a test set execution.
     */

    public void setActualAgentPrompt(String actualAgentPrompt) {
        this.actualAgentPrompt = actualAgentPrompt;
    }

    /**
     * <p>
     * The actual agent prompt for the agent turn in a test set execution.
     * </p>
     * 
     * @return The actual agent prompt for the agent turn in a test set execution.
     */

    public String getActualAgentPrompt() {
        return this.actualAgentPrompt;
    }

    /**
     * <p>
     * The actual agent prompt for the agent turn in a test set execution.
     * </p>
     * 
     * @param actualAgentPrompt
     *        The actual agent prompt for the agent turn in a test set execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentTurnResult withActualAgentPrompt(String actualAgentPrompt) {
        setActualAgentPrompt(actualAgentPrompt);
        return this;
    }

    /**
     * @param errorDetails
     */

    public void setErrorDetails(ExecutionErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
    }

    /**
     * @return
     */

    public ExecutionErrorDetails getErrorDetails() {
        return this.errorDetails;
    }

    /**
     * @param errorDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentTurnResult withErrorDetails(ExecutionErrorDetails errorDetails) {
        setErrorDetails(errorDetails);
        return this;
    }

    /**
     * <p>
     * The actual elicited slot for the agent turn in a test set execution.
     * </p>
     * 
     * @param actualElicitedSlot
     *        The actual elicited slot for the agent turn in a test set execution.
     */

    public void setActualElicitedSlot(String actualElicitedSlot) {
        this.actualElicitedSlot = actualElicitedSlot;
    }

    /**
     * <p>
     * The actual elicited slot for the agent turn in a test set execution.
     * </p>
     * 
     * @return The actual elicited slot for the agent turn in a test set execution.
     */

    public String getActualElicitedSlot() {
        return this.actualElicitedSlot;
    }

    /**
     * <p>
     * The actual elicited slot for the agent turn in a test set execution.
     * </p>
     * 
     * @param actualElicitedSlot
     *        The actual elicited slot for the agent turn in a test set execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentTurnResult withActualElicitedSlot(String actualElicitedSlot) {
        setActualElicitedSlot(actualElicitedSlot);
        return this;
    }

    /**
     * <p>
     * The actual intent for the agent turn in a test set execution.
     * </p>
     * 
     * @param actualIntent
     *        The actual intent for the agent turn in a test set execution.
     */

    public void setActualIntent(String actualIntent) {
        this.actualIntent = actualIntent;
    }

    /**
     * <p>
     * The actual intent for the agent turn in a test set execution.
     * </p>
     * 
     * @return The actual intent for the agent turn in a test set execution.
     */

    public String getActualIntent() {
        return this.actualIntent;
    }

    /**
     * <p>
     * The actual intent for the agent turn in a test set execution.
     * </p>
     * 
     * @param actualIntent
     *        The actual intent for the agent turn in a test set execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentTurnResult withActualIntent(String actualIntent) {
        setActualIntent(actualIntent);
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
        if (getExpectedAgentPrompt() != null)
            sb.append("ExpectedAgentPrompt: ").append(getExpectedAgentPrompt()).append(",");
        if (getActualAgentPrompt() != null)
            sb.append("ActualAgentPrompt: ").append(getActualAgentPrompt()).append(",");
        if (getErrorDetails() != null)
            sb.append("ErrorDetails: ").append(getErrorDetails()).append(",");
        if (getActualElicitedSlot() != null)
            sb.append("ActualElicitedSlot: ").append(getActualElicitedSlot()).append(",");
        if (getActualIntent() != null)
            sb.append("ActualIntent: ").append(getActualIntent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgentTurnResult == false)
            return false;
        AgentTurnResult other = (AgentTurnResult) obj;
        if (other.getExpectedAgentPrompt() == null ^ this.getExpectedAgentPrompt() == null)
            return false;
        if (other.getExpectedAgentPrompt() != null && other.getExpectedAgentPrompt().equals(this.getExpectedAgentPrompt()) == false)
            return false;
        if (other.getActualAgentPrompt() == null ^ this.getActualAgentPrompt() == null)
            return false;
        if (other.getActualAgentPrompt() != null && other.getActualAgentPrompt().equals(this.getActualAgentPrompt()) == false)
            return false;
        if (other.getErrorDetails() == null ^ this.getErrorDetails() == null)
            return false;
        if (other.getErrorDetails() != null && other.getErrorDetails().equals(this.getErrorDetails()) == false)
            return false;
        if (other.getActualElicitedSlot() == null ^ this.getActualElicitedSlot() == null)
            return false;
        if (other.getActualElicitedSlot() != null && other.getActualElicitedSlot().equals(this.getActualElicitedSlot()) == false)
            return false;
        if (other.getActualIntent() == null ^ this.getActualIntent() == null)
            return false;
        if (other.getActualIntent() != null && other.getActualIntent().equals(this.getActualIntent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpectedAgentPrompt() == null) ? 0 : getExpectedAgentPrompt().hashCode());
        hashCode = prime * hashCode + ((getActualAgentPrompt() == null) ? 0 : getActualAgentPrompt().hashCode());
        hashCode = prime * hashCode + ((getErrorDetails() == null) ? 0 : getErrorDetails().hashCode());
        hashCode = prime * hashCode + ((getActualElicitedSlot() == null) ? 0 : getActualElicitedSlot().hashCode());
        hashCode = prime * hashCode + ((getActualIntent() == null) ? 0 : getActualIntent().hashCode());
        return hashCode;
    }

    @Override
    public AgentTurnResult clone() {
        try {
            return (AgentTurnResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.AgentTurnResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
