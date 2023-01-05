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
package com.amazonaws.services.oam.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/PutSinkPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutSinkPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the sink to attach this policy to.
     * </p>
     */
    private String sinkIdentifier;
    /**
     * <p>
     * The JSON policy to use. If you are updating an existing policy, the entire existing policy is replaced by what
     * you specify here.
     * </p>
     * <p>
     * The policy must be in JSON string format with quotation marks escaped and no newlines.
     * </p>
     * <p>
     * For examples of different types of policies, see the <b>Examples</b> section on this page.
     * </p>
     */
    private String policy;

    /**
     * <p>
     * The ARN of the sink to attach this policy to.
     * </p>
     * 
     * @param sinkIdentifier
     *        The ARN of the sink to attach this policy to.
     */

    public void setSinkIdentifier(String sinkIdentifier) {
        this.sinkIdentifier = sinkIdentifier;
    }

    /**
     * <p>
     * The ARN of the sink to attach this policy to.
     * </p>
     * 
     * @return The ARN of the sink to attach this policy to.
     */

    public String getSinkIdentifier() {
        return this.sinkIdentifier;
    }

    /**
     * <p>
     * The ARN of the sink to attach this policy to.
     * </p>
     * 
     * @param sinkIdentifier
     *        The ARN of the sink to attach this policy to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSinkPolicyRequest withSinkIdentifier(String sinkIdentifier) {
        setSinkIdentifier(sinkIdentifier);
        return this;
    }

    /**
     * <p>
     * The JSON policy to use. If you are updating an existing policy, the entire existing policy is replaced by what
     * you specify here.
     * </p>
     * <p>
     * The policy must be in JSON string format with quotation marks escaped and no newlines.
     * </p>
     * <p>
     * For examples of different types of policies, see the <b>Examples</b> section on this page.
     * </p>
     * 
     * @param policy
     *        The JSON policy to use. If you are updating an existing policy, the entire existing policy is replaced by
     *        what you specify here.</p>
     *        <p>
     *        The policy must be in JSON string format with quotation marks escaped and no newlines.
     *        </p>
     *        <p>
     *        For examples of different types of policies, see the <b>Examples</b> section on this page.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The JSON policy to use. If you are updating an existing policy, the entire existing policy is replaced by what
     * you specify here.
     * </p>
     * <p>
     * The policy must be in JSON string format with quotation marks escaped and no newlines.
     * </p>
     * <p>
     * For examples of different types of policies, see the <b>Examples</b> section on this page.
     * </p>
     * 
     * @return The JSON policy to use. If you are updating an existing policy, the entire existing policy is replaced by
     *         what you specify here.</p>
     *         <p>
     *         The policy must be in JSON string format with quotation marks escaped and no newlines.
     *         </p>
     *         <p>
     *         For examples of different types of policies, see the <b>Examples</b> section on this page.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The JSON policy to use. If you are updating an existing policy, the entire existing policy is replaced by what
     * you specify here.
     * </p>
     * <p>
     * The policy must be in JSON string format with quotation marks escaped and no newlines.
     * </p>
     * <p>
     * For examples of different types of policies, see the <b>Examples</b> section on this page.
     * </p>
     * 
     * @param policy
     *        The JSON policy to use. If you are updating an existing policy, the entire existing policy is replaced by
     *        what you specify here.</p>
     *        <p>
     *        The policy must be in JSON string format with quotation marks escaped and no newlines.
     *        </p>
     *        <p>
     *        For examples of different types of policies, see the <b>Examples</b> section on this page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSinkPolicyRequest withPolicy(String policy) {
        setPolicy(policy);
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
        if (getSinkIdentifier() != null)
            sb.append("SinkIdentifier: ").append(getSinkIdentifier()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutSinkPolicyRequest == false)
            return false;
        PutSinkPolicyRequest other = (PutSinkPolicyRequest) obj;
        if (other.getSinkIdentifier() == null ^ this.getSinkIdentifier() == null)
            return false;
        if (other.getSinkIdentifier() != null && other.getSinkIdentifier().equals(this.getSinkIdentifier()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSinkIdentifier() == null) ? 0 : getSinkIdentifier().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        return hashCode;
    }

    @Override
    public PutSinkPolicyRequest clone() {
        return (PutSinkPolicyRequest) super.clone();
    }

}
