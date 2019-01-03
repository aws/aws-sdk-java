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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ValidateMatchmakingRuleSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidateMatchmakingRuleSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Collection of matchmaking rules to validate, formatted as a JSON string.
     * </p>
     */
    private String ruleSetBody;

    /**
     * <p>
     * Collection of matchmaking rules to validate, formatted as a JSON string.
     * </p>
     * 
     * @param ruleSetBody
     *        Collection of matchmaking rules to validate, formatted as a JSON string.
     */

    public void setRuleSetBody(String ruleSetBody) {
        this.ruleSetBody = ruleSetBody;
    }

    /**
     * <p>
     * Collection of matchmaking rules to validate, formatted as a JSON string.
     * </p>
     * 
     * @return Collection of matchmaking rules to validate, formatted as a JSON string.
     */

    public String getRuleSetBody() {
        return this.ruleSetBody;
    }

    /**
     * <p>
     * Collection of matchmaking rules to validate, formatted as a JSON string.
     * </p>
     * 
     * @param ruleSetBody
     *        Collection of matchmaking rules to validate, formatted as a JSON string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateMatchmakingRuleSetRequest withRuleSetBody(String ruleSetBody) {
        setRuleSetBody(ruleSetBody);
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
        if (getRuleSetBody() != null)
            sb.append("RuleSetBody: ").append(getRuleSetBody());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidateMatchmakingRuleSetRequest == false)
            return false;
        ValidateMatchmakingRuleSetRequest other = (ValidateMatchmakingRuleSetRequest) obj;
        if (other.getRuleSetBody() == null ^ this.getRuleSetBody() == null)
            return false;
        if (other.getRuleSetBody() != null && other.getRuleSetBody().equals(this.getRuleSetBody()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleSetBody() == null) ? 0 : getRuleSetBody().hashCode());
        return hashCode;
    }

    @Override
    public ValidateMatchmakingRuleSetRequest clone() {
        return (ValidateMatchmakingRuleSetRequest) super.clone();
    }

}
