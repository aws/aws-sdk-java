/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/UpdateManagedRuleSetVersionExpiryDate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateManagedRuleSetVersionExpiryDateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The version that is set to expire.
     * </p>
     */
    private String expiringVersion;
    /**
     * <p>
     * The time that the version will expire.
     * </p>
     * <p>
     * Times are in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For example,
     * "2016-09-27T14:50Z".
     * </p>
     */
    private java.util.Date expiryTimestamp;
    /**
     * <p>
     * A token used for optimistic locking. WAF returns a token to your <code>get</code> and <code>list</code> requests,
     * to mark the state of the entity at the time of the request. To make changes to the entity associated with the
     * token, you provide the token to operations like <code>update</code> and <code>delete</code>. WAF uses the token
     * to ensure that no changes have been made to the entity since you last retrieved it. If a change has been made,
     * the update fails with a <code>WAFOptimisticLockException</code>. If this happens, perform another
     * <code>get</code>, and use the new token returned by that operation.
     * </p>
     */
    private String nextLockToken;

    /**
     * <p>
     * The version that is set to expire.
     * </p>
     * 
     * @param expiringVersion
     *        The version that is set to expire.
     */

    public void setExpiringVersion(String expiringVersion) {
        this.expiringVersion = expiringVersion;
    }

    /**
     * <p>
     * The version that is set to expire.
     * </p>
     * 
     * @return The version that is set to expire.
     */

    public String getExpiringVersion() {
        return this.expiringVersion;
    }

    /**
     * <p>
     * The version that is set to expire.
     * </p>
     * 
     * @param expiringVersion
     *        The version that is set to expire.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateManagedRuleSetVersionExpiryDateResult withExpiringVersion(String expiringVersion) {
        setExpiringVersion(expiringVersion);
        return this;
    }

    /**
     * <p>
     * The time that the version will expire.
     * </p>
     * <p>
     * Times are in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For example,
     * "2016-09-27T14:50Z".
     * </p>
     * 
     * @param expiryTimestamp
     *        The time that the version will expire. </p>
     *        <p>
     *        Times are in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For
     *        example, "2016-09-27T14:50Z".
     */

    public void setExpiryTimestamp(java.util.Date expiryTimestamp) {
        this.expiryTimestamp = expiryTimestamp;
    }

    /**
     * <p>
     * The time that the version will expire.
     * </p>
     * <p>
     * Times are in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For example,
     * "2016-09-27T14:50Z".
     * </p>
     * 
     * @return The time that the version will expire. </p>
     *         <p>
     *         Times are in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For
     *         example, "2016-09-27T14:50Z".
     */

    public java.util.Date getExpiryTimestamp() {
        return this.expiryTimestamp;
    }

    /**
     * <p>
     * The time that the version will expire.
     * </p>
     * <p>
     * Times are in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For example,
     * "2016-09-27T14:50Z".
     * </p>
     * 
     * @param expiryTimestamp
     *        The time that the version will expire. </p>
     *        <p>
     *        Times are in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For
     *        example, "2016-09-27T14:50Z".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateManagedRuleSetVersionExpiryDateResult withExpiryTimestamp(java.util.Date expiryTimestamp) {
        setExpiryTimestamp(expiryTimestamp);
        return this;
    }

    /**
     * <p>
     * A token used for optimistic locking. WAF returns a token to your <code>get</code> and <code>list</code> requests,
     * to mark the state of the entity at the time of the request. To make changes to the entity associated with the
     * token, you provide the token to operations like <code>update</code> and <code>delete</code>. WAF uses the token
     * to ensure that no changes have been made to the entity since you last retrieved it. If a change has been made,
     * the update fails with a <code>WAFOptimisticLockException</code>. If this happens, perform another
     * <code>get</code>, and use the new token returned by that operation.
     * </p>
     * 
     * @param nextLockToken
     *        A token used for optimistic locking. WAF returns a token to your <code>get</code> and <code>list</code>
     *        requests, to mark the state of the entity at the time of the request. To make changes to the entity
     *        associated with the token, you provide the token to operations like <code>update</code> and
     *        <code>delete</code>. WAF uses the token to ensure that no changes have been made to the entity since you
     *        last retrieved it. If a change has been made, the update fails with a
     *        <code>WAFOptimisticLockException</code>. If this happens, perform another <code>get</code>, and use the
     *        new token returned by that operation.
     */

    public void setNextLockToken(String nextLockToken) {
        this.nextLockToken = nextLockToken;
    }

    /**
     * <p>
     * A token used for optimistic locking. WAF returns a token to your <code>get</code> and <code>list</code> requests,
     * to mark the state of the entity at the time of the request. To make changes to the entity associated with the
     * token, you provide the token to operations like <code>update</code> and <code>delete</code>. WAF uses the token
     * to ensure that no changes have been made to the entity since you last retrieved it. If a change has been made,
     * the update fails with a <code>WAFOptimisticLockException</code>. If this happens, perform another
     * <code>get</code>, and use the new token returned by that operation.
     * </p>
     * 
     * @return A token used for optimistic locking. WAF returns a token to your <code>get</code> and <code>list</code>
     *         requests, to mark the state of the entity at the time of the request. To make changes to the entity
     *         associated with the token, you provide the token to operations like <code>update</code> and
     *         <code>delete</code>. WAF uses the token to ensure that no changes have been made to the entity since you
     *         last retrieved it. If a change has been made, the update fails with a
     *         <code>WAFOptimisticLockException</code>. If this happens, perform another <code>get</code>, and use the
     *         new token returned by that operation.
     */

    public String getNextLockToken() {
        return this.nextLockToken;
    }

    /**
     * <p>
     * A token used for optimistic locking. WAF returns a token to your <code>get</code> and <code>list</code> requests,
     * to mark the state of the entity at the time of the request. To make changes to the entity associated with the
     * token, you provide the token to operations like <code>update</code> and <code>delete</code>. WAF uses the token
     * to ensure that no changes have been made to the entity since you last retrieved it. If a change has been made,
     * the update fails with a <code>WAFOptimisticLockException</code>. If this happens, perform another
     * <code>get</code>, and use the new token returned by that operation.
     * </p>
     * 
     * @param nextLockToken
     *        A token used for optimistic locking. WAF returns a token to your <code>get</code> and <code>list</code>
     *        requests, to mark the state of the entity at the time of the request. To make changes to the entity
     *        associated with the token, you provide the token to operations like <code>update</code> and
     *        <code>delete</code>. WAF uses the token to ensure that no changes have been made to the entity since you
     *        last retrieved it. If a change has been made, the update fails with a
     *        <code>WAFOptimisticLockException</code>. If this happens, perform another <code>get</code>, and use the
     *        new token returned by that operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateManagedRuleSetVersionExpiryDateResult withNextLockToken(String nextLockToken) {
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
        if (getExpiringVersion() != null)
            sb.append("ExpiringVersion: ").append(getExpiringVersion()).append(",");
        if (getExpiryTimestamp() != null)
            sb.append("ExpiryTimestamp: ").append(getExpiryTimestamp()).append(",");
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

        if (obj instanceof UpdateManagedRuleSetVersionExpiryDateResult == false)
            return false;
        UpdateManagedRuleSetVersionExpiryDateResult other = (UpdateManagedRuleSetVersionExpiryDateResult) obj;
        if (other.getExpiringVersion() == null ^ this.getExpiringVersion() == null)
            return false;
        if (other.getExpiringVersion() != null && other.getExpiringVersion().equals(this.getExpiringVersion()) == false)
            return false;
        if (other.getExpiryTimestamp() == null ^ this.getExpiryTimestamp() == null)
            return false;
        if (other.getExpiryTimestamp() != null && other.getExpiryTimestamp().equals(this.getExpiryTimestamp()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getExpiringVersion() == null) ? 0 : getExpiringVersion().hashCode());
        hashCode = prime * hashCode + ((getExpiryTimestamp() == null) ? 0 : getExpiryTimestamp().hashCode());
        hashCode = prime * hashCode + ((getNextLockToken() == null) ? 0 : getNextLockToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdateManagedRuleSetVersionExpiryDateResult clone() {
        try {
            return (UpdateManagedRuleSetVersionExpiryDateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
