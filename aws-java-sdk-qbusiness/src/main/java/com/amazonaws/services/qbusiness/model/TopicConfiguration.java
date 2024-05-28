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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The topic specific controls configured for an Amazon Q Business application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/TopicConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TopicConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A name for your topic control configuration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description for your topic control configuration. Use this to outline how the large language model (LLM) should
     * use this topic control configuration.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of example phrases that you expect the end user to use in relation to the topic.
     * </p>
     */
    private java.util.List<String> exampleChatMessages;
    /**
     * <p>
     * Rules defined for a topic configuration.
     * </p>
     */
    private java.util.List<Rule> rules;

    /**
     * <p>
     * A name for your topic control configuration.
     * </p>
     * 
     * @param name
     *        A name for your topic control configuration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for your topic control configuration.
     * </p>
     * 
     * @return A name for your topic control configuration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for your topic control configuration.
     * </p>
     * 
     * @param name
     *        A name for your topic control configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicConfiguration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description for your topic control configuration. Use this to outline how the large language model (LLM) should
     * use this topic control configuration.
     * </p>
     * 
     * @param description
     *        A description for your topic control configuration. Use this to outline how the large language model (LLM)
     *        should use this topic control configuration.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for your topic control configuration. Use this to outline how the large language model (LLM) should
     * use this topic control configuration.
     * </p>
     * 
     * @return A description for your topic control configuration. Use this to outline how the large language model
     *         (LLM) should use this topic control configuration.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for your topic control configuration. Use this to outline how the large language model (LLM) should
     * use this topic control configuration.
     * </p>
     * 
     * @param description
     *        A description for your topic control configuration. Use this to outline how the large language model (LLM)
     *        should use this topic control configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicConfiguration withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of example phrases that you expect the end user to use in relation to the topic.
     * </p>
     * 
     * @return A list of example phrases that you expect the end user to use in relation to the topic.
     */

    public java.util.List<String> getExampleChatMessages() {
        return exampleChatMessages;
    }

    /**
     * <p>
     * A list of example phrases that you expect the end user to use in relation to the topic.
     * </p>
     * 
     * @param exampleChatMessages
     *        A list of example phrases that you expect the end user to use in relation to the topic.
     */

    public void setExampleChatMessages(java.util.Collection<String> exampleChatMessages) {
        if (exampleChatMessages == null) {
            this.exampleChatMessages = null;
            return;
        }

        this.exampleChatMessages = new java.util.ArrayList<String>(exampleChatMessages);
    }

    /**
     * <p>
     * A list of example phrases that you expect the end user to use in relation to the topic.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExampleChatMessages(java.util.Collection)} or {@link #withExampleChatMessages(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param exampleChatMessages
     *        A list of example phrases that you expect the end user to use in relation to the topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicConfiguration withExampleChatMessages(String... exampleChatMessages) {
        if (this.exampleChatMessages == null) {
            setExampleChatMessages(new java.util.ArrayList<String>(exampleChatMessages.length));
        }
        for (String ele : exampleChatMessages) {
            this.exampleChatMessages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of example phrases that you expect the end user to use in relation to the topic.
     * </p>
     * 
     * @param exampleChatMessages
     *        A list of example phrases that you expect the end user to use in relation to the topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicConfiguration withExampleChatMessages(java.util.Collection<String> exampleChatMessages) {
        setExampleChatMessages(exampleChatMessages);
        return this;
    }

    /**
     * <p>
     * Rules defined for a topic configuration.
     * </p>
     * 
     * @return Rules defined for a topic configuration.
     */

    public java.util.List<Rule> getRules() {
        return rules;
    }

    /**
     * <p>
     * Rules defined for a topic configuration.
     * </p>
     * 
     * @param rules
     *        Rules defined for a topic configuration.
     */

    public void setRules(java.util.Collection<Rule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<Rule>(rules);
    }

    /**
     * <p>
     * Rules defined for a topic configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        Rules defined for a topic configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicConfiguration withRules(Rule... rules) {
        if (this.rules == null) {
            setRules(new java.util.ArrayList<Rule>(rules.length));
        }
        for (Rule ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Rules defined for a topic configuration.
     * </p>
     * 
     * @param rules
     *        Rules defined for a topic configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicConfiguration withRules(java.util.Collection<Rule> rules) {
        setRules(rules);
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
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getExampleChatMessages() != null)
            sb.append("ExampleChatMessages: ").append(getExampleChatMessages()).append(",");
        if (getRules() != null)
            sb.append("Rules: ").append(getRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TopicConfiguration == false)
            return false;
        TopicConfiguration other = (TopicConfiguration) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getExampleChatMessages() == null ^ this.getExampleChatMessages() == null)
            return false;
        if (other.getExampleChatMessages() != null && other.getExampleChatMessages().equals(this.getExampleChatMessages()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getExampleChatMessages() == null) ? 0 : getExampleChatMessages().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public TopicConfiguration clone() {
        try {
            return (TopicConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.TopicConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
