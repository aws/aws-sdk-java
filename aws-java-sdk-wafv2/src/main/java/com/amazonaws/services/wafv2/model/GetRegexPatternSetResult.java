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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetRegexPatternSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRegexPatternSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** <p/> */
    private RegexPatternSet regexPatternSet;
    /**
     * <p>
     * A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the state of
     * the entity at the time of the request. To make changes to the entity associated with the token, you provide the
     * token to operations like update and delete. AWS WAF uses the token to ensure that no changes have been made to
     * the entity since you last retrieved it. If a change has been made, the update fails with a
     * <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the new token returned by
     * that operation.
     * </p>
     */
    private String lockToken;

    /**
     * <p/>
     * 
     * @param regexPatternSet
     */

    public void setRegexPatternSet(RegexPatternSet regexPatternSet) {
        this.regexPatternSet = regexPatternSet;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public RegexPatternSet getRegexPatternSet() {
        return this.regexPatternSet;
    }

    /**
     * <p/>
     * 
     * @param regexPatternSet
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRegexPatternSetResult withRegexPatternSet(RegexPatternSet regexPatternSet) {
        setRegexPatternSet(regexPatternSet);
        return this;
    }

    /**
     * <p>
     * A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the state of
     * the entity at the time of the request. To make changes to the entity associated with the token, you provide the
     * token to operations like update and delete. AWS WAF uses the token to ensure that no changes have been made to
     * the entity since you last retrieved it. If a change has been made, the update fails with a
     * <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the new token returned by
     * that operation.
     * </p>
     * 
     * @param lockToken
     *        A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the
     *        state of the entity at the time of the request. To make changes to the entity associated with the token,
     *        you provide the token to operations like update and delete. AWS WAF uses the token to ensure that no
     *        changes have been made to the entity since you last retrieved it. If a change has been made, the update
     *        fails with a <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the
     *        new token returned by that operation.
     */

    public void setLockToken(String lockToken) {
        this.lockToken = lockToken;
    }

    /**
     * <p>
     * A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the state of
     * the entity at the time of the request. To make changes to the entity associated with the token, you provide the
     * token to operations like update and delete. AWS WAF uses the token to ensure that no changes have been made to
     * the entity since you last retrieved it. If a change has been made, the update fails with a
     * <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the new token returned by
     * that operation.
     * </p>
     * 
     * @return A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the
     *         state of the entity at the time of the request. To make changes to the entity associated with the token,
     *         you provide the token to operations like update and delete. AWS WAF uses the token to ensure that no
     *         changes have been made to the entity since you last retrieved it. If a change has been made, the update
     *         fails with a <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the
     *         new token returned by that operation.
     */

    public String getLockToken() {
        return this.lockToken;
    }

    /**
     * <p>
     * A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the state of
     * the entity at the time of the request. To make changes to the entity associated with the token, you provide the
     * token to operations like update and delete. AWS WAF uses the token to ensure that no changes have been made to
     * the entity since you last retrieved it. If a change has been made, the update fails with a
     * <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the new token returned by
     * that operation.
     * </p>
     * 
     * @param lockToken
     *        A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the
     *        state of the entity at the time of the request. To make changes to the entity associated with the token,
     *        you provide the token to operations like update and delete. AWS WAF uses the token to ensure that no
     *        changes have been made to the entity since you last retrieved it. If a change has been made, the update
     *        fails with a <code>WAFOptimisticLockException</code>. If this happens, perform another get, and use the
     *        new token returned by that operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRegexPatternSetResult withLockToken(String lockToken) {
        setLockToken(lockToken);
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
        if (getRegexPatternSet() != null)
            sb.append("RegexPatternSet: ").append(getRegexPatternSet()).append(",");
        if (getLockToken() != null)
            sb.append("LockToken: ").append(getLockToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRegexPatternSetResult == false)
            return false;
        GetRegexPatternSetResult other = (GetRegexPatternSetResult) obj;
        if (other.getRegexPatternSet() == null ^ this.getRegexPatternSet() == null)
            return false;
        if (other.getRegexPatternSet() != null && other.getRegexPatternSet().equals(this.getRegexPatternSet()) == false)
            return false;
        if (other.getLockToken() == null ^ this.getLockToken() == null)
            return false;
        if (other.getLockToken() != null && other.getLockToken().equals(this.getLockToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegexPatternSet() == null) ? 0 : getRegexPatternSet().hashCode());
        hashCode = prime * hashCode + ((getLockToken() == null) ? 0 : getLockToken().hashCode());
        return hashCode;
    }

    @Override
    public GetRegexPatternSetResult clone() {
        try {
            return (GetRegexPatternSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
