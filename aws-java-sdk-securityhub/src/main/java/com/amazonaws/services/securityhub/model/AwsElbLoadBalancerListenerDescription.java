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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Lists the policies that are enabled for a load balancer listener.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsElbLoadBalancerListenerDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsElbLoadBalancerListenerDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the listener.
     * </p>
     */
    private AwsElbLoadBalancerListener listener;
    /**
     * <p>
     * The policies enabled for the listener.
     * </p>
     */
    private java.util.List<String> policyNames;

    /**
     * <p>
     * Information about the listener.
     * </p>
     * 
     * @param listener
     *        Information about the listener.
     */

    public void setListener(AwsElbLoadBalancerListener listener) {
        this.listener = listener;
    }

    /**
     * <p>
     * Information about the listener.
     * </p>
     * 
     * @return Information about the listener.
     */

    public AwsElbLoadBalancerListener getListener() {
        return this.listener;
    }

    /**
     * <p>
     * Information about the listener.
     * </p>
     * 
     * @param listener
     *        Information about the listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerListenerDescription withListener(AwsElbLoadBalancerListener listener) {
        setListener(listener);
        return this;
    }

    /**
     * <p>
     * The policies enabled for the listener.
     * </p>
     * 
     * @return The policies enabled for the listener.
     */

    public java.util.List<String> getPolicyNames() {
        return policyNames;
    }

    /**
     * <p>
     * The policies enabled for the listener.
     * </p>
     * 
     * @param policyNames
     *        The policies enabled for the listener.
     */

    public void setPolicyNames(java.util.Collection<String> policyNames) {
        if (policyNames == null) {
            this.policyNames = null;
            return;
        }

        this.policyNames = new java.util.ArrayList<String>(policyNames);
    }

    /**
     * <p>
     * The policies enabled for the listener.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyNames(java.util.Collection)} or {@link #withPolicyNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param policyNames
     *        The policies enabled for the listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerListenerDescription withPolicyNames(String... policyNames) {
        if (this.policyNames == null) {
            setPolicyNames(new java.util.ArrayList<String>(policyNames.length));
        }
        for (String ele : policyNames) {
            this.policyNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The policies enabled for the listener.
     * </p>
     * 
     * @param policyNames
     *        The policies enabled for the listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerListenerDescription withPolicyNames(java.util.Collection<String> policyNames) {
        setPolicyNames(policyNames);
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
        if (getListener() != null)
            sb.append("Listener: ").append(getListener()).append(",");
        if (getPolicyNames() != null)
            sb.append("PolicyNames: ").append(getPolicyNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsElbLoadBalancerListenerDescription == false)
            return false;
        AwsElbLoadBalancerListenerDescription other = (AwsElbLoadBalancerListenerDescription) obj;
        if (other.getListener() == null ^ this.getListener() == null)
            return false;
        if (other.getListener() != null && other.getListener().equals(this.getListener()) == false)
            return false;
        if (other.getPolicyNames() == null ^ this.getPolicyNames() == null)
            return false;
        if (other.getPolicyNames() != null && other.getPolicyNames().equals(this.getPolicyNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListener() == null) ? 0 : getListener().hashCode());
        hashCode = prime * hashCode + ((getPolicyNames() == null) ? 0 : getPolicyNames().hashCode());
        return hashCode;
    }

    @Override
    public AwsElbLoadBalancerListenerDescription clone() {
        try {
            return (AwsElbLoadBalancerListenerDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsElbLoadBalancerListenerDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
