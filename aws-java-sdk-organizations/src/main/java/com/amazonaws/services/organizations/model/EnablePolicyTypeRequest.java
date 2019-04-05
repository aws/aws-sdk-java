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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/EnablePolicyType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnablePolicyTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier (ID) of the root in which you want to enable a policy type. You can get the ID from the
     * <a>ListRoots</a> operation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a root ID string requires "r-" followed by
     * from 4 to 32 lower-case letters or digits.
     * </p>
     */
    private String rootId;
    /**
     * <p>
     * The policy type that you want to enable.
     * </p>
     */
    private String policyType;

    /**
     * <p>
     * The unique identifier (ID) of the root in which you want to enable a policy type. You can get the ID from the
     * <a>ListRoots</a> operation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a root ID string requires "r-" followed by
     * from 4 to 32 lower-case letters or digits.
     * </p>
     * 
     * @param rootId
     *        The unique identifier (ID) of the root in which you want to enable a policy type. You can get the ID from
     *        the <a>ListRoots</a> operation.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a root ID string requires "r-"
     *        followed by from 4 to 32 lower-case letters or digits.
     */

    public void setRootId(String rootId) {
        this.rootId = rootId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the root in which you want to enable a policy type. You can get the ID from the
     * <a>ListRoots</a> operation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a root ID string requires "r-" followed by
     * from 4 to 32 lower-case letters or digits.
     * </p>
     * 
     * @return The unique identifier (ID) of the root in which you want to enable a policy type. You can get the ID from
     *         the <a>ListRoots</a> operation.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a root ID string requires "r-"
     *         followed by from 4 to 32 lower-case letters or digits.
     */

    public String getRootId() {
        return this.rootId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the root in which you want to enable a policy type. You can get the ID from the
     * <a>ListRoots</a> operation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a root ID string requires "r-" followed by
     * from 4 to 32 lower-case letters or digits.
     * </p>
     * 
     * @param rootId
     *        The unique identifier (ID) of the root in which you want to enable a policy type. You can get the ID from
     *        the <a>ListRoots</a> operation.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a root ID string requires "r-"
     *        followed by from 4 to 32 lower-case letters or digits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnablePolicyTypeRequest withRootId(String rootId) {
        setRootId(rootId);
        return this;
    }

    /**
     * <p>
     * The policy type that you want to enable.
     * </p>
     * 
     * @param policyType
     *        The policy type that you want to enable.
     * @see PolicyType
     */

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    /**
     * <p>
     * The policy type that you want to enable.
     * </p>
     * 
     * @return The policy type that you want to enable.
     * @see PolicyType
     */

    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * <p>
     * The policy type that you want to enable.
     * </p>
     * 
     * @param policyType
     *        The policy type that you want to enable.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyType
     */

    public EnablePolicyTypeRequest withPolicyType(String policyType) {
        setPolicyType(policyType);
        return this;
    }

    /**
     * <p>
     * The policy type that you want to enable.
     * </p>
     * 
     * @param policyType
     *        The policy type that you want to enable.
     * @see PolicyType
     */

    public void setPolicyType(PolicyType policyType) {
        withPolicyType(policyType);
    }

    /**
     * <p>
     * The policy type that you want to enable.
     * </p>
     * 
     * @param policyType
     *        The policy type that you want to enable.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyType
     */

    public EnablePolicyTypeRequest withPolicyType(PolicyType policyType) {
        this.policyType = policyType.toString();
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
        if (getRootId() != null)
            sb.append("RootId: ").append(getRootId()).append(",");
        if (getPolicyType() != null)
            sb.append("PolicyType: ").append(getPolicyType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnablePolicyTypeRequest == false)
            return false;
        EnablePolicyTypeRequest other = (EnablePolicyTypeRequest) obj;
        if (other.getRootId() == null ^ this.getRootId() == null)
            return false;
        if (other.getRootId() != null && other.getRootId().equals(this.getRootId()) == false)
            return false;
        if (other.getPolicyType() == null ^ this.getPolicyType() == null)
            return false;
        if (other.getPolicyType() != null && other.getPolicyType().equals(this.getPolicyType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRootId() == null) ? 0 : getRootId().hashCode());
        hashCode = prime * hashCode + ((getPolicyType() == null) ? 0 : getPolicyType().hashCode());
        return hashCode;
    }

    @Override
    public EnablePolicyTypeRequest clone() {
        return (EnablePolicyTypeRequest) super.clone();
    }

}
