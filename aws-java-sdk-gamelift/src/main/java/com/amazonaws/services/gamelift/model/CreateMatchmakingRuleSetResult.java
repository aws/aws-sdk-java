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

/**
 * <p>
 * Represents the returned data in response to a request action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateMatchmakingRuleSet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMatchmakingRuleSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Object that describes the newly created matchmaking rule set.
     * </p>
     */
    private MatchmakingRuleSet ruleSet;

    /**
     * <p>
     * Object that describes the newly created matchmaking rule set.
     * </p>
     * 
     * @param ruleSet
     *        Object that describes the newly created matchmaking rule set.
     */

    public void setRuleSet(MatchmakingRuleSet ruleSet) {
        this.ruleSet = ruleSet;
    }

    /**
     * <p>
     * Object that describes the newly created matchmaking rule set.
     * </p>
     * 
     * @return Object that describes the newly created matchmaking rule set.
     */

    public MatchmakingRuleSet getRuleSet() {
        return this.ruleSet;
    }

    /**
     * <p>
     * Object that describes the newly created matchmaking rule set.
     * </p>
     * 
     * @param ruleSet
     *        Object that describes the newly created matchmaking rule set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMatchmakingRuleSetResult withRuleSet(MatchmakingRuleSet ruleSet) {
        setRuleSet(ruleSet);
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
        if (getRuleSet() != null)
            sb.append("RuleSet: ").append(getRuleSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMatchmakingRuleSetResult == false)
            return false;
        CreateMatchmakingRuleSetResult other = (CreateMatchmakingRuleSetResult) obj;
        if (other.getRuleSet() == null ^ this.getRuleSet() == null)
            return false;
        if (other.getRuleSet() != null && other.getRuleSet().equals(this.getRuleSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleSet() == null) ? 0 : getRuleSet().hashCode());
        return hashCode;
    }

    @Override
    public CreateMatchmakingRuleSetResult clone() {
        try {
            return (CreateMatchmakingRuleSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
