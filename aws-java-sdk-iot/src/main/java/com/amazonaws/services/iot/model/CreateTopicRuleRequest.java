/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the CreateTopicRule operation.
 * </p>
 */
public class CreateTopicRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the rule.
     * </p>
     */
    private String ruleName;
    /**
     * <p>
     * The rule payload.
     * </p>
     */
    private TopicRulePayload topicRulePayload;

    /**
     * <p>
     * The name of the rule.
     * </p>
     * 
     * @param ruleName
     *        The name of the rule.
     */

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * <p>
     * The name of the rule.
     * </p>
     * 
     * @return The name of the rule.
     */

    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * <p>
     * The name of the rule.
     * </p>
     * 
     * @param ruleName
     *        The name of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTopicRuleRequest withRuleName(String ruleName) {
        setRuleName(ruleName);
        return this;
    }

    /**
     * <p>
     * The rule payload.
     * </p>
     * 
     * @param topicRulePayload
     *        The rule payload.
     */

    public void setTopicRulePayload(TopicRulePayload topicRulePayload) {
        this.topicRulePayload = topicRulePayload;
    }

    /**
     * <p>
     * The rule payload.
     * </p>
     * 
     * @return The rule payload.
     */

    public TopicRulePayload getTopicRulePayload() {
        return this.topicRulePayload;
    }

    /**
     * <p>
     * The rule payload.
     * </p>
     * 
     * @param topicRulePayload
     *        The rule payload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTopicRuleRequest withTopicRulePayload(TopicRulePayload topicRulePayload) {
        setTopicRulePayload(topicRulePayload);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRuleName() != null)
            sb.append("RuleName: " + getRuleName() + ",");
        if (getTopicRulePayload() != null)
            sb.append("TopicRulePayload: " + getTopicRulePayload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTopicRuleRequest == false)
            return false;
        CreateTopicRuleRequest other = (CreateTopicRuleRequest) obj;
        if (other.getRuleName() == null ^ this.getRuleName() == null)
            return false;
        if (other.getRuleName() != null && other.getRuleName().equals(this.getRuleName()) == false)
            return false;
        if (other.getTopicRulePayload() == null ^ this.getTopicRulePayload() == null)
            return false;
        if (other.getTopicRulePayload() != null && other.getTopicRulePayload().equals(this.getTopicRulePayload()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleName() == null) ? 0 : getRuleName().hashCode());
        hashCode = prime * hashCode + ((getTopicRulePayload() == null) ? 0 : getTopicRulePayload().hashCode());
        return hashCode;
    }

    @Override
    public CreateTopicRuleRequest clone() {
        return (CreateTopicRuleRequest) super.clone();
    }
}
