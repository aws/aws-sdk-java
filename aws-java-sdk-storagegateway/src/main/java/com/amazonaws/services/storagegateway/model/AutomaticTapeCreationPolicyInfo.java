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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the gateway's automatic tape creation policies, including the automatic tape creation rules and the
 * gateway that is using the policies.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/AutomaticTapeCreationPolicyInfo"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutomaticTapeCreationPolicyInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An automatic tape creation policy consists of a list of automatic tape creation rules. This returns the rules
     * that determine when and how to automatically create new tapes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AutomaticTapeCreationRule> automaticTapeCreationRules;

    private String gatewayARN;

    /**
     * <p>
     * An automatic tape creation policy consists of a list of automatic tape creation rules. This returns the rules
     * that determine when and how to automatically create new tapes.
     * </p>
     * 
     * @return An automatic tape creation policy consists of a list of automatic tape creation rules. This returns the
     *         rules that determine when and how to automatically create new tapes.
     */

    public java.util.List<AutomaticTapeCreationRule> getAutomaticTapeCreationRules() {
        if (automaticTapeCreationRules == null) {
            automaticTapeCreationRules = new com.amazonaws.internal.SdkInternalList<AutomaticTapeCreationRule>();
        }
        return automaticTapeCreationRules;
    }

    /**
     * <p>
     * An automatic tape creation policy consists of a list of automatic tape creation rules. This returns the rules
     * that determine when and how to automatically create new tapes.
     * </p>
     * 
     * @param automaticTapeCreationRules
     *        An automatic tape creation policy consists of a list of automatic tape creation rules. This returns the
     *        rules that determine when and how to automatically create new tapes.
     */

    public void setAutomaticTapeCreationRules(java.util.Collection<AutomaticTapeCreationRule> automaticTapeCreationRules) {
        if (automaticTapeCreationRules == null) {
            this.automaticTapeCreationRules = null;
            return;
        }

        this.automaticTapeCreationRules = new com.amazonaws.internal.SdkInternalList<AutomaticTapeCreationRule>(automaticTapeCreationRules);
    }

    /**
     * <p>
     * An automatic tape creation policy consists of a list of automatic tape creation rules. This returns the rules
     * that determine when and how to automatically create new tapes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAutomaticTapeCreationRules(java.util.Collection)} or
     * {@link #withAutomaticTapeCreationRules(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param automaticTapeCreationRules
     *        An automatic tape creation policy consists of a list of automatic tape creation rules. This returns the
     *        rules that determine when and how to automatically create new tapes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomaticTapeCreationPolicyInfo withAutomaticTapeCreationRules(AutomaticTapeCreationRule... automaticTapeCreationRules) {
        if (this.automaticTapeCreationRules == null) {
            setAutomaticTapeCreationRules(new com.amazonaws.internal.SdkInternalList<AutomaticTapeCreationRule>(automaticTapeCreationRules.length));
        }
        for (AutomaticTapeCreationRule ele : automaticTapeCreationRules) {
            this.automaticTapeCreationRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An automatic tape creation policy consists of a list of automatic tape creation rules. This returns the rules
     * that determine when and how to automatically create new tapes.
     * </p>
     * 
     * @param automaticTapeCreationRules
     *        An automatic tape creation policy consists of a list of automatic tape creation rules. This returns the
     *        rules that determine when and how to automatically create new tapes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomaticTapeCreationPolicyInfo withAutomaticTapeCreationRules(java.util.Collection<AutomaticTapeCreationRule> automaticTapeCreationRules) {
        setAutomaticTapeCreationRules(automaticTapeCreationRules);
        return this;
    }

    /**
     * @param gatewayARN
     */

    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * @return
     */

    public String getGatewayARN() {
        return this.gatewayARN;
    }

    /**
     * @param gatewayARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomaticTapeCreationPolicyInfo withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
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
        if (getAutomaticTapeCreationRules() != null)
            sb.append("AutomaticTapeCreationRules: ").append(getAutomaticTapeCreationRules()).append(",");
        if (getGatewayARN() != null)
            sb.append("GatewayARN: ").append(getGatewayARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutomaticTapeCreationPolicyInfo == false)
            return false;
        AutomaticTapeCreationPolicyInfo other = (AutomaticTapeCreationPolicyInfo) obj;
        if (other.getAutomaticTapeCreationRules() == null ^ this.getAutomaticTapeCreationRules() == null)
            return false;
        if (other.getAutomaticTapeCreationRules() != null && other.getAutomaticTapeCreationRules().equals(this.getAutomaticTapeCreationRules()) == false)
            return false;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutomaticTapeCreationRules() == null) ? 0 : getAutomaticTapeCreationRules().hashCode());
        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        return hashCode;
    }

    @Override
    public AutomaticTapeCreationPolicyInfo clone() {
        try {
            return (AutomaticTapeCreationPolicyInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.storagegateway.model.transform.AutomaticTapeCreationPolicyInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
