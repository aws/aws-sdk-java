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
package com.amazonaws.services.ssmcontacts.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/PutContactPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutContactPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact or escalation plan.
     * </p>
     */
    private String contactArn;
    /**
     * <p>
     * Details of the resource policy.
     * </p>
     */
    private String policy;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact or escalation plan.
     * </p>
     * 
     * @param contactArn
     *        The Amazon Resource Name (ARN) of the contact or escalation plan.
     */

    public void setContactArn(String contactArn) {
        this.contactArn = contactArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact or escalation plan.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the contact or escalation plan.
     */

    public String getContactArn() {
        return this.contactArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact or escalation plan.
     * </p>
     * 
     * @param contactArn
     *        The Amazon Resource Name (ARN) of the contact or escalation plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutContactPolicyRequest withContactArn(String contactArn) {
        setContactArn(contactArn);
        return this;
    }

    /**
     * <p>
     * Details of the resource policy.
     * </p>
     * 
     * @param policy
     *        Details of the resource policy.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * Details of the resource policy.
     * </p>
     * 
     * @return Details of the resource policy.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * Details of the resource policy.
     * </p>
     * 
     * @param policy
     *        Details of the resource policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutContactPolicyRequest withPolicy(String policy) {
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
        if (getContactArn() != null)
            sb.append("ContactArn: ").append(getContactArn()).append(",");
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

        if (obj instanceof PutContactPolicyRequest == false)
            return false;
        PutContactPolicyRequest other = (PutContactPolicyRequest) obj;
        if (other.getContactArn() == null ^ this.getContactArn() == null)
            return false;
        if (other.getContactArn() != null && other.getContactArn().equals(this.getContactArn()) == false)
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

        hashCode = prime * hashCode + ((getContactArn() == null) ? 0 : getContactArn().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        return hashCode;
    }

    @Override
    public PutContactPolicyRequest clone() {
        return (PutContactPolicyRequest) super.clone();
    }

}
