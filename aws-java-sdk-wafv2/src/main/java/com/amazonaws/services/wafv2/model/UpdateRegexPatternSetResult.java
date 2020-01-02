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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/UpdateRegexPatternSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRegexPatternSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A token used for optimistic locking. AWS WAF returns this token to your update requests. You use
     * <code>NextLockToken</code> in the same manner as you use <code>LockToken</code>.
     * </p>
     */
    private String nextLockToken;

    /**
     * <p>
     * A token used for optimistic locking. AWS WAF returns this token to your update requests. You use
     * <code>NextLockToken</code> in the same manner as you use <code>LockToken</code>.
     * </p>
     * 
     * @param nextLockToken
     *        A token used for optimistic locking. AWS WAF returns this token to your update requests. You use
     *        <code>NextLockToken</code> in the same manner as you use <code>LockToken</code>.
     */

    public void setNextLockToken(String nextLockToken) {
        this.nextLockToken = nextLockToken;
    }

    /**
     * <p>
     * A token used for optimistic locking. AWS WAF returns this token to your update requests. You use
     * <code>NextLockToken</code> in the same manner as you use <code>LockToken</code>.
     * </p>
     * 
     * @return A token used for optimistic locking. AWS WAF returns this token to your update requests. You use
     *         <code>NextLockToken</code> in the same manner as you use <code>LockToken</code>.
     */

    public String getNextLockToken() {
        return this.nextLockToken;
    }

    /**
     * <p>
     * A token used for optimistic locking. AWS WAF returns this token to your update requests. You use
     * <code>NextLockToken</code> in the same manner as you use <code>LockToken</code>.
     * </p>
     * 
     * @param nextLockToken
     *        A token used for optimistic locking. AWS WAF returns this token to your update requests. You use
     *        <code>NextLockToken</code> in the same manner as you use <code>LockToken</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRegexPatternSetResult withNextLockToken(String nextLockToken) {
        setNextLockToken(nextLockToken);
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
        if (getNextLockToken() != null)
            sb.append("NextLockToken: ").append(getNextLockToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRegexPatternSetResult == false)
            return false;
        UpdateRegexPatternSetResult other = (UpdateRegexPatternSetResult) obj;
        if (other.getNextLockToken() == null ^ this.getNextLockToken() == null)
            return false;
        if (other.getNextLockToken() != null && other.getNextLockToken().equals(this.getNextLockToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextLockToken() == null) ? 0 : getNextLockToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRegexPatternSetResult clone() {
        try {
            return (UpdateRegexPatternSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
