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
 * Defines parameters that the agent needs to invoke from the user to complete the function. Corresponds to an action in
 * an action group.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/Function" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Function implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A description of the function and its purpose.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A name for the function.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The parameters that the agent elicits from the user to fulfill the function.
     * </p>
     */
    private java.util.Map<String, ParameterDetail> parameters;

    /**
     * <p>
     * A description of the function and its purpose.
     * </p>
     * 
     * @param description
     *        A description of the function and its purpose.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the function and its purpose.
     * </p>
     * 
     * @return A description of the function and its purpose.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the function and its purpose.
     * </p>
     * 
     * @param description
     *        A description of the function and its purpose.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Function withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A name for the function.
     * </p>
     * 
     * @param name
     *        A name for the function.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the function.
     * </p>
     * 
     * @return A name for the function.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the function.
     * </p>
     * 
     * @param name
     *        A name for the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Function withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The parameters that the agent elicits from the user to fulfill the function.
     * </p>
     * 
     * @return The parameters that the agent elicits from the user to fulfill the function.
     */

    public java.util.Map<String, ParameterDetail> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The parameters that the agent elicits from the user to fulfill the function.
     * </p>
     * 
     * @param parameters
     *        The parameters that the agent elicits from the user to fulfill the function.
     */

    public void setParameters(java.util.Map<String, ParameterDetail> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The parameters that the agent elicits from the user to fulfill the function.
     * </p>
     * 
     * @param parameters
     *        The parameters that the agent elicits from the user to fulfill the function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Function withParameters(java.util.Map<String, ParameterDetail> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see Function#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Function addParametersEntry(String key, ParameterDetail value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, ParameterDetail>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Function clearParametersEntries() {
        this.parameters = null;
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Function == false)
            return false;
        Function other = (Function) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public Function clone() {
        try {
            return (Function) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.FunctionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
