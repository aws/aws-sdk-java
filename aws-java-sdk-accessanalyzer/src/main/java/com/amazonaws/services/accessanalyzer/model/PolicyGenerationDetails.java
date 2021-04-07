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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the ARN details about the IAM entity for which the policy is generated.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/PolicyGenerationDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicyGenerationDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the IAM entity (user or role) for which you are generating a policy.
     * </p>
     */
    private String principalArn;

    /**
     * <p>
     * The ARN of the IAM entity (user or role) for which you are generating a policy.
     * </p>
     * 
     * @param principalArn
     *        The ARN of the IAM entity (user or role) for which you are generating a policy.
     */

    public void setPrincipalArn(String principalArn) {
        this.principalArn = principalArn;
    }

    /**
     * <p>
     * The ARN of the IAM entity (user or role) for which you are generating a policy.
     * </p>
     * 
     * @return The ARN of the IAM entity (user or role) for which you are generating a policy.
     */

    public String getPrincipalArn() {
        return this.principalArn;
    }

    /**
     * <p>
     * The ARN of the IAM entity (user or role) for which you are generating a policy.
     * </p>
     * 
     * @param principalArn
     *        The ARN of the IAM entity (user or role) for which you are generating a policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyGenerationDetails withPrincipalArn(String principalArn) {
        setPrincipalArn(principalArn);
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
        if (getPrincipalArn() != null)
            sb.append("PrincipalArn: ").append(getPrincipalArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyGenerationDetails == false)
            return false;
        PolicyGenerationDetails other = (PolicyGenerationDetails) obj;
        if (other.getPrincipalArn() == null ^ this.getPrincipalArn() == null)
            return false;
        if (other.getPrincipalArn() != null && other.getPrincipalArn().equals(this.getPrincipalArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrincipalArn() == null) ? 0 : getPrincipalArn().hashCode());
        return hashCode;
    }

    @Override
    public PolicyGenerationDetails clone() {
        try {
            return (PolicyGenerationDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.PolicyGenerationDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
