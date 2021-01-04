/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains an origin request policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/OriginRequestPolicySummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OriginRequestPolicySummary implements Serializable, Cloneable {

    /**
     * <p>
     * The type of origin request policy, either <code>managed</code> (created by AWS) or <code>custom</code> (created
     * in this AWS account).
     * </p>
     */
    private String type;
    /**
     * <p>
     * The origin request policy.
     * </p>
     */
    private OriginRequestPolicy originRequestPolicy;

    /**
     * <p>
     * The type of origin request policy, either <code>managed</code> (created by AWS) or <code>custom</code> (created
     * in this AWS account).
     * </p>
     * 
     * @param type
     *        The type of origin request policy, either <code>managed</code> (created by AWS) or <code>custom</code>
     *        (created in this AWS account).
     * @see OriginRequestPolicyType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of origin request policy, either <code>managed</code> (created by AWS) or <code>custom</code> (created
     * in this AWS account).
     * </p>
     * 
     * @return The type of origin request policy, either <code>managed</code> (created by AWS) or <code>custom</code>
     *         (created in this AWS account).
     * @see OriginRequestPolicyType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of origin request policy, either <code>managed</code> (created by AWS) or <code>custom</code> (created
     * in this AWS account).
     * </p>
     * 
     * @param type
     *        The type of origin request policy, either <code>managed</code> (created by AWS) or <code>custom</code>
     *        (created in this AWS account).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginRequestPolicyType
     */

    public OriginRequestPolicySummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of origin request policy, either <code>managed</code> (created by AWS) or <code>custom</code> (created
     * in this AWS account).
     * </p>
     * 
     * @param type
     *        The type of origin request policy, either <code>managed</code> (created by AWS) or <code>custom</code>
     *        (created in this AWS account).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginRequestPolicyType
     */

    public OriginRequestPolicySummary withType(OriginRequestPolicyType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The origin request policy.
     * </p>
     * 
     * @param originRequestPolicy
     *        The origin request policy.
     */

    public void setOriginRequestPolicy(OriginRequestPolicy originRequestPolicy) {
        this.originRequestPolicy = originRequestPolicy;
    }

    /**
     * <p>
     * The origin request policy.
     * </p>
     * 
     * @return The origin request policy.
     */

    public OriginRequestPolicy getOriginRequestPolicy() {
        return this.originRequestPolicy;
    }

    /**
     * <p>
     * The origin request policy.
     * </p>
     * 
     * @param originRequestPolicy
     *        The origin request policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginRequestPolicySummary withOriginRequestPolicy(OriginRequestPolicy originRequestPolicy) {
        setOriginRequestPolicy(originRequestPolicy);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getOriginRequestPolicy() != null)
            sb.append("OriginRequestPolicy: ").append(getOriginRequestPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OriginRequestPolicySummary == false)
            return false;
        OriginRequestPolicySummary other = (OriginRequestPolicySummary) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getOriginRequestPolicy() == null ^ this.getOriginRequestPolicy() == null)
            return false;
        if (other.getOriginRequestPolicy() != null && other.getOriginRequestPolicy().equals(this.getOriginRequestPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getOriginRequestPolicy() == null) ? 0 : getOriginRequestPolicy().hashCode());
        return hashCode;
    }

    @Override
    public OriginRequestPolicySummary clone() {
        try {
            return (OriginRequestPolicySummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
