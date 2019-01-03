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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * A request to grant entitlements on a flow.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/GrantFlowEntitlements" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GrantFlowEntitlementsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The list of entitlements that you want to grant. */
    private java.util.List<GrantEntitlementRequest> entitlements;
    /** The flow that you want to grant entitlements on. */
    private String flowArn;

    /**
     * The list of entitlements that you want to grant.
     * 
     * @return The list of entitlements that you want to grant.
     */

    public java.util.List<GrantEntitlementRequest> getEntitlements() {
        return entitlements;
    }

    /**
     * The list of entitlements that you want to grant.
     * 
     * @param entitlements
     *        The list of entitlements that you want to grant.
     */

    public void setEntitlements(java.util.Collection<GrantEntitlementRequest> entitlements) {
        if (entitlements == null) {
            this.entitlements = null;
            return;
        }

        this.entitlements = new java.util.ArrayList<GrantEntitlementRequest>(entitlements);
    }

    /**
     * The list of entitlements that you want to grant.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntitlements(java.util.Collection)} or {@link #withEntitlements(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param entitlements
     *        The list of entitlements that you want to grant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantFlowEntitlementsRequest withEntitlements(GrantEntitlementRequest... entitlements) {
        if (this.entitlements == null) {
            setEntitlements(new java.util.ArrayList<GrantEntitlementRequest>(entitlements.length));
        }
        for (GrantEntitlementRequest ele : entitlements) {
            this.entitlements.add(ele);
        }
        return this;
    }

    /**
     * The list of entitlements that you want to grant.
     * 
     * @param entitlements
     *        The list of entitlements that you want to grant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantFlowEntitlementsRequest withEntitlements(java.util.Collection<GrantEntitlementRequest> entitlements) {
        setEntitlements(entitlements);
        return this;
    }

    /**
     * The flow that you want to grant entitlements on.
     * 
     * @param flowArn
     *        The flow that you want to grant entitlements on.
     */

    public void setFlowArn(String flowArn) {
        this.flowArn = flowArn;
    }

    /**
     * The flow that you want to grant entitlements on.
     * 
     * @return The flow that you want to grant entitlements on.
     */

    public String getFlowArn() {
        return this.flowArn;
    }

    /**
     * The flow that you want to grant entitlements on.
     * 
     * @param flowArn
     *        The flow that you want to grant entitlements on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantFlowEntitlementsRequest withFlowArn(String flowArn) {
        setFlowArn(flowArn);
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
        if (getEntitlements() != null)
            sb.append("Entitlements: ").append(getEntitlements()).append(",");
        if (getFlowArn() != null)
            sb.append("FlowArn: ").append(getFlowArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GrantFlowEntitlementsRequest == false)
            return false;
        GrantFlowEntitlementsRequest other = (GrantFlowEntitlementsRequest) obj;
        if (other.getEntitlements() == null ^ this.getEntitlements() == null)
            return false;
        if (other.getEntitlements() != null && other.getEntitlements().equals(this.getEntitlements()) == false)
            return false;
        if (other.getFlowArn() == null ^ this.getFlowArn() == null)
            return false;
        if (other.getFlowArn() != null && other.getFlowArn().equals(this.getFlowArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntitlements() == null) ? 0 : getEntitlements().hashCode());
        hashCode = prime * hashCode + ((getFlowArn() == null) ? 0 : getFlowArn().hashCode());
        return hashCode;
    }

    @Override
    public GrantFlowEntitlementsRequest clone() {
        return (GrantFlowEntitlementsRequest) super.clone();
    }

}
