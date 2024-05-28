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
package com.amazonaws.services.bedrock.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about topics for the guardrail to identify and deny.
 * </p>
 * <p>
 * This data type is used in the following API operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_GetGuardrail.html#API_GetGuardrail_ResponseSyntax"
 * >GetGuardrail response body</a>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GuardrailTopic" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GuardrailTopic implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the topic to deny.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A definition of the topic to deny.
     * </p>
     */
    private String definition;
    /**
     * <p>
     * A list of prompts, each of which is an example of a prompt that can be categorized as belonging to the topic.
     * </p>
     */
    private java.util.List<String> examples;
    /**
     * <p>
     * Specifies to deny the topic.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The name of the topic to deny.
     * </p>
     * 
     * @param name
     *        The name of the topic to deny.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the topic to deny.
     * </p>
     * 
     * @return The name of the topic to deny.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the topic to deny.
     * </p>
     * 
     * @param name
     *        The name of the topic to deny.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailTopic withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A definition of the topic to deny.
     * </p>
     * 
     * @param definition
     *        A definition of the topic to deny.
     */

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * A definition of the topic to deny.
     * </p>
     * 
     * @return A definition of the topic to deny.
     */

    public String getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * A definition of the topic to deny.
     * </p>
     * 
     * @param definition
     *        A definition of the topic to deny.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailTopic withDefinition(String definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * <p>
     * A list of prompts, each of which is an example of a prompt that can be categorized as belonging to the topic.
     * </p>
     * 
     * @return A list of prompts, each of which is an example of a prompt that can be categorized as belonging to the
     *         topic.
     */

    public java.util.List<String> getExamples() {
        return examples;
    }

    /**
     * <p>
     * A list of prompts, each of which is an example of a prompt that can be categorized as belonging to the topic.
     * </p>
     * 
     * @param examples
     *        A list of prompts, each of which is an example of a prompt that can be categorized as belonging to the
     *        topic.
     */

    public void setExamples(java.util.Collection<String> examples) {
        if (examples == null) {
            this.examples = null;
            return;
        }

        this.examples = new java.util.ArrayList<String>(examples);
    }

    /**
     * <p>
     * A list of prompts, each of which is an example of a prompt that can be categorized as belonging to the topic.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExamples(java.util.Collection)} or {@link #withExamples(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param examples
     *        A list of prompts, each of which is an example of a prompt that can be categorized as belonging to the
     *        topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailTopic withExamples(String... examples) {
        if (this.examples == null) {
            setExamples(new java.util.ArrayList<String>(examples.length));
        }
        for (String ele : examples) {
            this.examples.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of prompts, each of which is an example of a prompt that can be categorized as belonging to the topic.
     * </p>
     * 
     * @param examples
     *        A list of prompts, each of which is an example of a prompt that can be categorized as belonging to the
     *        topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailTopic withExamples(java.util.Collection<String> examples) {
        setExamples(examples);
        return this;
    }

    /**
     * <p>
     * Specifies to deny the topic.
     * </p>
     * 
     * @param type
     *        Specifies to deny the topic.
     * @see GuardrailTopicType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specifies to deny the topic.
     * </p>
     * 
     * @return Specifies to deny the topic.
     * @see GuardrailTopicType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Specifies to deny the topic.
     * </p>
     * 
     * @param type
     *        Specifies to deny the topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailTopicType
     */

    public GuardrailTopic withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Specifies to deny the topic.
     * </p>
     * 
     * @param type
     *        Specifies to deny the topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailTopicType
     */

    public GuardrailTopic withType(GuardrailTopicType type) {
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
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getDefinition() != null)
            sb.append("Definition: ").append("***Sensitive Data Redacted***").append(",");
        if (getExamples() != null)
            sb.append("Examples: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof GuardrailTopic == false)
            return false;
        GuardrailTopic other = (GuardrailTopic) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        if (other.getExamples() == null ^ this.getExamples() == null)
            return false;
        if (other.getExamples() != null && other.getExamples().equals(this.getExamples()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getExamples() == null) ? 0 : getExamples().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public GuardrailTopic clone() {
        try {
            return (GuardrailTopic) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrock.model.transform.GuardrailTopicMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
