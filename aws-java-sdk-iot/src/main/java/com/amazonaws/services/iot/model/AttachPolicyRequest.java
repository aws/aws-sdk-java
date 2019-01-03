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

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttachPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the policy to attach.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/iot/latest/developerguide/iot-security-identity.html">identity</a> to
     * which the policy is attached.
     * </p>
     */
    private String target;

    /**
     * <p>
     * The name of the policy to attach.
     * </p>
     * 
     * @param policyName
     *        The name of the policy to attach.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the policy to attach.
     * </p>
     * 
     * @return The name of the policy to attach.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The name of the policy to attach.
     * </p>
     * 
     * @param policyName
     *        The name of the policy to attach.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachPolicyRequest withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/iot/latest/developerguide/iot-security-identity.html">identity</a> to
     * which the policy is attached.
     * </p>
     * 
     * @param target
     *        The <a
     *        href="https://docs.aws.amazon.com/iot/latest/developerguide/iot-security-identity.html">identity</a> to
     *        which the policy is attached.
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/iot/latest/developerguide/iot-security-identity.html">identity</a> to
     * which the policy is attached.
     * </p>
     * 
     * @return The <a
     *         href="https://docs.aws.amazon.com/iot/latest/developerguide/iot-security-identity.html">identity</a> to
     *         which the policy is attached.
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/iot/latest/developerguide/iot-security-identity.html">identity</a> to
     * which the policy is attached.
     * </p>
     * 
     * @param target
     *        The <a
     *        href="https://docs.aws.amazon.com/iot/latest/developerguide/iot-security-identity.html">identity</a> to
     *        which the policy is attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachPolicyRequest withTarget(String target) {
        setTarget(target);
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
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachPolicyRequest == false)
            return false;
        AttachPolicyRequest other = (AttachPolicyRequest) obj;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        return hashCode;
    }

    @Override
    public AttachPolicyRequest clone() {
        return (AttachPolicyRequest) super.clone();
    }

}
