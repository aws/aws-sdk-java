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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/RevokeFlowEntitlement" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RevokeFlowEntitlementRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The ARN of the entitlement that you want to revoke. */
    private String entitlementArn;
    /** The flow that you want to revoke an entitlement from. */
    private String flowArn;

    /**
     * The ARN of the entitlement that you want to revoke.
     * 
     * @param entitlementArn
     *        The ARN of the entitlement that you want to revoke.
     */

    public void setEntitlementArn(String entitlementArn) {
        this.entitlementArn = entitlementArn;
    }

    /**
     * The ARN of the entitlement that you want to revoke.
     * 
     * @return The ARN of the entitlement that you want to revoke.
     */

    public String getEntitlementArn() {
        return this.entitlementArn;
    }

    /**
     * The ARN of the entitlement that you want to revoke.
     * 
     * @param entitlementArn
     *        The ARN of the entitlement that you want to revoke.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeFlowEntitlementRequest withEntitlementArn(String entitlementArn) {
        setEntitlementArn(entitlementArn);
        return this;
    }

    /**
     * The flow that you want to revoke an entitlement from.
     * 
     * @param flowArn
     *        The flow that you want to revoke an entitlement from.
     */

    public void setFlowArn(String flowArn) {
        this.flowArn = flowArn;
    }

    /**
     * The flow that you want to revoke an entitlement from.
     * 
     * @return The flow that you want to revoke an entitlement from.
     */

    public String getFlowArn() {
        return this.flowArn;
    }

    /**
     * The flow that you want to revoke an entitlement from.
     * 
     * @param flowArn
     *        The flow that you want to revoke an entitlement from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeFlowEntitlementRequest withFlowArn(String flowArn) {
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
        if (getEntitlementArn() != null)
            sb.append("EntitlementArn: ").append(getEntitlementArn()).append(",");
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

        if (obj instanceof RevokeFlowEntitlementRequest == false)
            return false;
        RevokeFlowEntitlementRequest other = (RevokeFlowEntitlementRequest) obj;
        if (other.getEntitlementArn() == null ^ this.getEntitlementArn() == null)
            return false;
        if (other.getEntitlementArn() != null && other.getEntitlementArn().equals(this.getEntitlementArn()) == false)
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

        hashCode = prime * hashCode + ((getEntitlementArn() == null) ? 0 : getEntitlementArn().hashCode());
        hashCode = prime * hashCode + ((getFlowArn() == null) ? 0 : getFlowArn().hashCode());
        return hashCode;
    }

    @Override
    public RevokeFlowEntitlementRequest clone() {
        return (RevokeFlowEntitlementRequest) super.clone();
    }

}
