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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteMatchmakingRuleSet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteMatchmakingRuleSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for a matchmaking rule set to be deleted. (Note: The rule set name is different from the
     * optional "name" field in the rule set body.)
     * </p>
     */
    private String name;

    /**
     * <p>
     * Unique identifier for a matchmaking rule set to be deleted. (Note: The rule set name is different from the
     * optional "name" field in the rule set body.)
     * </p>
     * 
     * @param name
     *        Unique identifier for a matchmaking rule set to be deleted. (Note: The rule set name is different from the
     *        optional "name" field in the rule set body.)
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Unique identifier for a matchmaking rule set to be deleted. (Note: The rule set name is different from the
     * optional "name" field in the rule set body.)
     * </p>
     * 
     * @return Unique identifier for a matchmaking rule set to be deleted. (Note: The rule set name is different from
     *         the optional "name" field in the rule set body.)
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Unique identifier for a matchmaking rule set to be deleted. (Note: The rule set name is different from the
     * optional "name" field in the rule set body.)
     * </p>
     * 
     * @param name
     *        Unique identifier for a matchmaking rule set to be deleted. (Note: The rule set name is different from the
     *        optional "name" field in the rule set body.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteMatchmakingRuleSetRequest withName(String name) {
        setName(name);
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
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteMatchmakingRuleSetRequest == false)
            return false;
        DeleteMatchmakingRuleSetRequest other = (DeleteMatchmakingRuleSetRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteMatchmakingRuleSetRequest clone() {
        return (DeleteMatchmakingRuleSetRequest) super.clone();
    }

}
