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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListTargetsForPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTargetsForPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of structures, each of which contains details about one of the entities to which the specified policy is
     * attached.
     * </p>
     */
    private java.util.List<PolicyTargetSummary> targets;
    /**
     * <p>
     * If present, this value indicates that there is more output available than is included in the current response.
     * Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the
     * next part of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of structures, each of which contains details about one of the entities to which the specified policy is
     * attached.
     * </p>
     * 
     * @return A list of structures, each of which contains details about one of the entities to which the specified
     *         policy is attached.
     */

    public java.util.List<PolicyTargetSummary> getTargets() {
        return targets;
    }

    /**
     * <p>
     * A list of structures, each of which contains details about one of the entities to which the specified policy is
     * attached.
     * </p>
     * 
     * @param targets
     *        A list of structures, each of which contains details about one of the entities to which the specified
     *        policy is attached.
     */

    public void setTargets(java.util.Collection<PolicyTargetSummary> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new java.util.ArrayList<PolicyTargetSummary>(targets);
    }

    /**
     * <p>
     * A list of structures, each of which contains details about one of the entities to which the specified policy is
     * attached.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        A list of structures, each of which contains details about one of the entities to which the specified
     *        policy is attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTargetsForPolicyResult withTargets(PolicyTargetSummary... targets) {
        if (this.targets == null) {
            setTargets(new java.util.ArrayList<PolicyTargetSummary>(targets.length));
        }
        for (PolicyTargetSummary ele : targets) {
            this.targets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of structures, each of which contains details about one of the entities to which the specified policy is
     * attached.
     * </p>
     * 
     * @param targets
     *        A list of structures, each of which contains details about one of the entities to which the specified
     *        policy is attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTargetsForPolicyResult withTargets(java.util.Collection<PolicyTargetSummary> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * If present, this value indicates that there is more output available than is included in the current response.
     * Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the
     * next part of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If present, this value indicates that there is more output available than is included in the current
     *        response. Use this value in the <code>NextToken</code> request parameter in a subsequent call to the
     *        operation to get the next part of the output. You should repeat this until the <code>NextToken</code>
     *        response element comes back as <code>null</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If present, this value indicates that there is more output available than is included in the current response.
     * Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the
     * next part of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>.
     * </p>
     * 
     * @return If present, this value indicates that there is more output available than is included in the current
     *         response. Use this value in the <code>NextToken</code> request parameter in a subsequent call to the
     *         operation to get the next part of the output. You should repeat this until the <code>NextToken</code>
     *         response element comes back as <code>null</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If present, this value indicates that there is more output available than is included in the current response.
     * Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the
     * next part of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If present, this value indicates that there is more output available than is included in the current
     *        response. Use this value in the <code>NextToken</code> request parameter in a subsequent call to the
     *        operation to get the next part of the output. You should repeat this until the <code>NextToken</code>
     *        response element comes back as <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTargetsForPolicyResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTargetsForPolicyResult == false)
            return false;
        ListTargetsForPolicyResult other = (ListTargetsForPolicyResult) obj;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTargetsForPolicyResult clone() {
        try {
            return (ListTargetsForPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
