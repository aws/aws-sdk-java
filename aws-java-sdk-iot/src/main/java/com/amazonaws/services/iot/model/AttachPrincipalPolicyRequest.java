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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the AttachPrincipalPolicy operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttachPrincipalPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The policy name.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * The principal, which can be a certificate ARN (as returned from the CreateCertificate operation) or an Amazon
     * Cognito ID.
     * </p>
     */
    private String principal;

    /**
     * <p>
     * The policy name.
     * </p>
     * 
     * @param policyName
     *        The policy name.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The policy name.
     * </p>
     * 
     * @return The policy name.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The policy name.
     * </p>
     * 
     * @param policyName
     *        The policy name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachPrincipalPolicyRequest withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The principal, which can be a certificate ARN (as returned from the CreateCertificate operation) or an Amazon
     * Cognito ID.
     * </p>
     * 
     * @param principal
     *        The principal, which can be a certificate ARN (as returned from the CreateCertificate operation) or an
     *        Amazon Cognito ID.
     */

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * The principal, which can be a certificate ARN (as returned from the CreateCertificate operation) or an Amazon
     * Cognito ID.
     * </p>
     * 
     * @return The principal, which can be a certificate ARN (as returned from the CreateCertificate operation) or an
     *         Amazon Cognito ID.
     */

    public String getPrincipal() {
        return this.principal;
    }

    /**
     * <p>
     * The principal, which can be a certificate ARN (as returned from the CreateCertificate operation) or an Amazon
     * Cognito ID.
     * </p>
     * 
     * @param principal
     *        The principal, which can be a certificate ARN (as returned from the CreateCertificate operation) or an
     *        Amazon Cognito ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachPrincipalPolicyRequest withPrincipal(String principal) {
        setPrincipal(principal);
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
        if (getPolicyName() != null)
            sb.append("PolicyName: ").append(getPolicyName()).append(",");
        if (getPrincipal() != null)
            sb.append("Principal: ").append(getPrincipal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachPrincipalPolicyRequest == false)
            return false;
        AttachPrincipalPolicyRequest other = (AttachPrincipalPolicyRequest) obj;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        return hashCode;
    }

    @Override
    public AttachPrincipalPolicyRequest clone() {
        return (AttachPrincipalPolicyRequest) super.clone();
    }

}
