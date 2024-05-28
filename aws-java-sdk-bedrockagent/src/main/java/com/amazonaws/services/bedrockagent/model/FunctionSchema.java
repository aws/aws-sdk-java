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
package com.amazonaws.services.bedrockagent.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines functions that each define parameters that the agent needs to invoke from the user. Each function represents
 * an action in an action group.
 * </p>
 * <p>
 * This data type is used in the following API operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_CreateAgentActionGroup.html#API_agent_CreateAgentActionGroup_RequestSyntax"
 * >CreateAgentActionGroup request</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_CreateAgentActionGroup.html#API_agent_CreateAgentActionGroup_ResponseSyntax"
 * >CreateAgentActionGroup response</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_UpdateAgentActionGroup.html#API_agent_UpdateAgentActionGroup_RequestSyntax"
 * >UpdateAgentActionGroup request</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_UpdateAgentActionGroup.html#API_agent_UpdateAgentActionGroup_ResponseSyntax"
 * >UpdateAgentActionGroup response</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent_GetAgentActionGroup.html#API_agent_GetAgentActionGroup_ResponseSyntax"
 * >GetAgentActionGroup response</a>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/FunctionSchema" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FunctionSchema implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of functions that each define an action in the action group.
     * </p>
     */
    private java.util.List<Function> functions;

    /**
     * <p>
     * A list of functions that each define an action in the action group.
     * </p>
     * 
     * @return A list of functions that each define an action in the action group.
     */

    public java.util.List<Function> getFunctions() {
        return functions;
    }

    /**
     * <p>
     * A list of functions that each define an action in the action group.
     * </p>
     * 
     * @param functions
     *        A list of functions that each define an action in the action group.
     */

    public void setFunctions(java.util.Collection<Function> functions) {
        if (functions == null) {
            this.functions = null;
            return;
        }

        this.functions = new java.util.ArrayList<Function>(functions);
    }

    /**
     * <p>
     * A list of functions that each define an action in the action group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFunctions(java.util.Collection)} or {@link #withFunctions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param functions
     *        A list of functions that each define an action in the action group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionSchema withFunctions(Function... functions) {
        if (this.functions == null) {
            setFunctions(new java.util.ArrayList<Function>(functions.length));
        }
        for (Function ele : functions) {
            this.functions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of functions that each define an action in the action group.
     * </p>
     * 
     * @param functions
     *        A list of functions that each define an action in the action group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionSchema withFunctions(java.util.Collection<Function> functions) {
        setFunctions(functions);
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
        if (getFunctions() != null)
            sb.append("Functions: ").append(getFunctions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FunctionSchema == false)
            return false;
        FunctionSchema other = (FunctionSchema) obj;
        if (other.getFunctions() == null ^ this.getFunctions() == null)
            return false;
        if (other.getFunctions() != null && other.getFunctions().equals(this.getFunctions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctions() == null) ? 0 : getFunctions().hashCode());
        return hashCode;
    }

    @Override
    public FunctionSchema clone() {
        try {
            return (FunctionSchema) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.FunctionSchemaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
