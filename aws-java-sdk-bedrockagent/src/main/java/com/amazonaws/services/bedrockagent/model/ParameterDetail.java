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
 * Contains details about a parameter in a function for an action group.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ParameterDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A description of the parameter. Helps the foundation model determine how to elicit the parameters from the user.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Whether the parameter is required for the agent to complete the function for action group invocation.
     * </p>
     */
    private Boolean required;
    /**
     * <p>
     * The data type of the parameter.
     * </p>
     */
    private String type;

    /**
     * <p>
     * A description of the parameter. Helps the foundation model determine how to elicit the parameters from the user.
     * </p>
     * 
     * @param description
     *        A description of the parameter. Helps the foundation model determine how to elicit the parameters from the
     *        user.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the parameter. Helps the foundation model determine how to elicit the parameters from the user.
     * </p>
     * 
     * @return A description of the parameter. Helps the foundation model determine how to elicit the parameters from
     *         the user.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the parameter. Helps the foundation model determine how to elicit the parameters from the user.
     * </p>
     * 
     * @param description
     *        A description of the parameter. Helps the foundation model determine how to elicit the parameters from the
     *        user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterDetail withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Whether the parameter is required for the agent to complete the function for action group invocation.
     * </p>
     * 
     * @param required
     *        Whether the parameter is required for the agent to complete the function for action group invocation.
     */

    public void setRequired(Boolean required) {
        this.required = required;
    }

    /**
     * <p>
     * Whether the parameter is required for the agent to complete the function for action group invocation.
     * </p>
     * 
     * @return Whether the parameter is required for the agent to complete the function for action group invocation.
     */

    public Boolean getRequired() {
        return this.required;
    }

    /**
     * <p>
     * Whether the parameter is required for the agent to complete the function for action group invocation.
     * </p>
     * 
     * @param required
     *        Whether the parameter is required for the agent to complete the function for action group invocation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterDetail withRequired(Boolean required) {
        setRequired(required);
        return this;
    }

    /**
     * <p>
     * Whether the parameter is required for the agent to complete the function for action group invocation.
     * </p>
     * 
     * @return Whether the parameter is required for the agent to complete the function for action group invocation.
     */

    public Boolean isRequired() {
        return this.required;
    }

    /**
     * <p>
     * The data type of the parameter.
     * </p>
     * 
     * @param type
     *        The data type of the parameter.
     * @see Type
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The data type of the parameter.
     * </p>
     * 
     * @return The data type of the parameter.
     * @see Type
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The data type of the parameter.
     * </p>
     * 
     * @param type
     *        The data type of the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public ParameterDetail withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The data type of the parameter.
     * </p>
     * 
     * @param type
     *        The data type of the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public ParameterDetail withType(Type type) {
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRequired() != null)
            sb.append("Required: ").append(getRequired()).append(",");
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

        if (obj instanceof ParameterDetail == false)
            return false;
        ParameterDetail other = (ParameterDetail) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRequired() == null ^ this.getRequired() == null)
            return false;
        if (other.getRequired() != null && other.getRequired().equals(this.getRequired()) == false)
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

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRequired() == null) ? 0 : getRequired().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public ParameterDetail clone() {
        try {
            return (ParameterDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.ParameterDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
