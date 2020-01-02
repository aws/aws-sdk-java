/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTopicRuleDestinationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The topic rule destination.
     * </p>
     */
    private TopicRuleDestination topicRuleDestination;

    /**
     * <p>
     * The topic rule destination.
     * </p>
     * 
     * @param topicRuleDestination
     *        The topic rule destination.
     */

    public void setTopicRuleDestination(TopicRuleDestination topicRuleDestination) {
        this.topicRuleDestination = topicRuleDestination;
    }

    /**
     * <p>
     * The topic rule destination.
     * </p>
     * 
     * @return The topic rule destination.
     */

    public TopicRuleDestination getTopicRuleDestination() {
        return this.topicRuleDestination;
    }

    /**
     * <p>
     * The topic rule destination.
     * </p>
     * 
     * @param topicRuleDestination
     *        The topic rule destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTopicRuleDestinationResult withTopicRuleDestination(TopicRuleDestination topicRuleDestination) {
        setTopicRuleDestination(topicRuleDestination);
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
        if (getTopicRuleDestination() != null)
            sb.append("TopicRuleDestination: ").append(getTopicRuleDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTopicRuleDestinationResult == false)
            return false;
        CreateTopicRuleDestinationResult other = (CreateTopicRuleDestinationResult) obj;
        if (other.getTopicRuleDestination() == null ^ this.getTopicRuleDestination() == null)
            return false;
        if (other.getTopicRuleDestination() != null && other.getTopicRuleDestination().equals(this.getTopicRuleDestination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopicRuleDestination() == null) ? 0 : getTopicRuleDestination().hashCode());
        return hashCode;
    }

    @Override
    public CreateTopicRuleDestinationResult clone() {
        try {
            return (CreateTopicRuleDestinationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
