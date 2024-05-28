/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the action for a rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/RuleAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The fixed response action. The rule returns a custom HTTP response.
     * </p>
     */
    private FixedResponseAction fixedResponse;
    /**
     * <p>
     * The forward action. Traffic that matches the rule is forwarded to the specified target groups.
     * </p>
     */
    private ForwardAction forward;

    /**
     * <p>
     * The fixed response action. The rule returns a custom HTTP response.
     * </p>
     * 
     * @param fixedResponse
     *        The fixed response action. The rule returns a custom HTTP response.
     */

    public void setFixedResponse(FixedResponseAction fixedResponse) {
        this.fixedResponse = fixedResponse;
    }

    /**
     * <p>
     * The fixed response action. The rule returns a custom HTTP response.
     * </p>
     * 
     * @return The fixed response action. The rule returns a custom HTTP response.
     */

    public FixedResponseAction getFixedResponse() {
        return this.fixedResponse;
    }

    /**
     * <p>
     * The fixed response action. The rule returns a custom HTTP response.
     * </p>
     * 
     * @param fixedResponse
     *        The fixed response action. The rule returns a custom HTTP response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleAction withFixedResponse(FixedResponseAction fixedResponse) {
        setFixedResponse(fixedResponse);
        return this;
    }

    /**
     * <p>
     * The forward action. Traffic that matches the rule is forwarded to the specified target groups.
     * </p>
     * 
     * @param forward
     *        The forward action. Traffic that matches the rule is forwarded to the specified target groups.
     */

    public void setForward(ForwardAction forward) {
        this.forward = forward;
    }

    /**
     * <p>
     * The forward action. Traffic that matches the rule is forwarded to the specified target groups.
     * </p>
     * 
     * @return The forward action. Traffic that matches the rule is forwarded to the specified target groups.
     */

    public ForwardAction getForward() {
        return this.forward;
    }

    /**
     * <p>
     * The forward action. Traffic that matches the rule is forwarded to the specified target groups.
     * </p>
     * 
     * @param forward
     *        The forward action. Traffic that matches the rule is forwarded to the specified target groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleAction withForward(ForwardAction forward) {
        setForward(forward);
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
        if (getFixedResponse() != null)
            sb.append("FixedResponse: ").append(getFixedResponse()).append(",");
        if (getForward() != null)
            sb.append("Forward: ").append(getForward());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleAction == false)
            return false;
        RuleAction other = (RuleAction) obj;
        if (other.getFixedResponse() == null ^ this.getFixedResponse() == null)
            return false;
        if (other.getFixedResponse() != null && other.getFixedResponse().equals(this.getFixedResponse()) == false)
            return false;
        if (other.getForward() == null ^ this.getForward() == null)
            return false;
        if (other.getForward() != null && other.getForward().equals(this.getForward()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFixedResponse() == null) ? 0 : getFixedResponse().hashCode());
        hashCode = prime * hashCode + ((getForward() == null) ? 0 : getForward().hashCode());
        return hashCode;
    }

    @Override
    public RuleAction clone() {
        try {
            return (RuleAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.vpclattice.model.transform.RuleActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
