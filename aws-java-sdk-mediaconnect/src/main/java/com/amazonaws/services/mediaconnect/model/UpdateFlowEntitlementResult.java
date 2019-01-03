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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateFlowEntitlement" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFlowEntitlementResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private Entitlement entitlement;
    /** The ARN of the flow that this entitlement was granted on. */
    private String flowArn;

    /**
     * @param entitlement
     */

    public void setEntitlement(Entitlement entitlement) {
        this.entitlement = entitlement;
    }

    /**
     * @return
     */

    public Entitlement getEntitlement() {
        return this.entitlement;
    }

    /**
     * @param entitlement
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowEntitlementResult withEntitlement(Entitlement entitlement) {
        setEntitlement(entitlement);
        return this;
    }

    /**
     * The ARN of the flow that this entitlement was granted on.
     * 
     * @param flowArn
     *        The ARN of the flow that this entitlement was granted on.
     */

    public void setFlowArn(String flowArn) {
        this.flowArn = flowArn;
    }

    /**
     * The ARN of the flow that this entitlement was granted on.
     * 
     * @return The ARN of the flow that this entitlement was granted on.
     */

    public String getFlowArn() {
        return this.flowArn;
    }

    /**
     * The ARN of the flow that this entitlement was granted on.
     * 
     * @param flowArn
     *        The ARN of the flow that this entitlement was granted on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowEntitlementResult withFlowArn(String flowArn) {
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
        if (getEntitlement() != null)
            sb.append("Entitlement: ").append(getEntitlement()).append(",");
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

        if (obj instanceof UpdateFlowEntitlementResult == false)
            return false;
        UpdateFlowEntitlementResult other = (UpdateFlowEntitlementResult) obj;
        if (other.getEntitlement() == null ^ this.getEntitlement() == null)
            return false;
        if (other.getEntitlement() != null && other.getEntitlement().equals(this.getEntitlement()) == false)
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

        hashCode = prime * hashCode + ((getEntitlement() == null) ? 0 : getEntitlement().hashCode());
        hashCode = prime * hashCode + ((getFlowArn() == null) ? 0 : getFlowArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFlowEntitlementResult clone() {
        try {
            return (UpdateFlowEntitlementResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
