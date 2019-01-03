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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ValidateMatchmakingRuleSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidateMatchmakingRuleSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Response indicating whether or not the rule set is valid.
     * </p>
     */
    private Boolean valid;

    /**
     * <p>
     * Response indicating whether or not the rule set is valid.
     * </p>
     * 
     * @param valid
     *        Response indicating whether or not the rule set is valid.
     */

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    /**
     * <p>
     * Response indicating whether or not the rule set is valid.
     * </p>
     * 
     * @return Response indicating whether or not the rule set is valid.
     */

    public Boolean getValid() {
        return this.valid;
    }

    /**
     * <p>
     * Response indicating whether or not the rule set is valid.
     * </p>
     * 
     * @param valid
     *        Response indicating whether or not the rule set is valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateMatchmakingRuleSetResult withValid(Boolean valid) {
        setValid(valid);
        return this;
    }

    /**
     * <p>
     * Response indicating whether or not the rule set is valid.
     * </p>
     * 
     * @return Response indicating whether or not the rule set is valid.
     */

    public Boolean isValid() {
        return this.valid;
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
        if (getValid() != null)
            sb.append("Valid: ").append(getValid());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidateMatchmakingRuleSetResult == false)
            return false;
        ValidateMatchmakingRuleSetResult other = (ValidateMatchmakingRuleSetResult) obj;
        if (other.getValid() == null ^ this.getValid() == null)
            return false;
        if (other.getValid() != null && other.getValid().equals(this.getValid()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValid() == null) ? 0 : getValid().hashCode());
        return hashCode;
    }

    @Override
    public ValidateMatchmakingRuleSetResult clone() {
        try {
            return (ValidateMatchmakingRuleSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
