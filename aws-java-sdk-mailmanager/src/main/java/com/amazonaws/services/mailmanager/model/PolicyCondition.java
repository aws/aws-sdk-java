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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The email traffic filtering conditions which are contained in a traffic policy resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/PolicyCondition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicyCondition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This represents a boolean type condition matching on the incoming mail. It performs the boolean operation
     * configured in 'Operator' and evaluates the 'Protocol' object against the 'Value'.
     * </p>
     */
    private IngressBooleanExpression booleanExpression;
    /**
     * <p>
     * This represents an IP based condition matching on the incoming mail. It performs the operation configured in
     * 'Operator' and evaluates the 'Protocol' object against the 'Value'.
     * </p>
     */
    private IngressIpv4Expression ipExpression;
    /**
     * <p>
     * This represents a string based condition matching on the incoming mail. It performs the string operation
     * configured in 'Operator' and evaluates the 'Protocol' object against the 'Value'.
     * </p>
     */
    private IngressStringExpression stringExpression;
    /**
     * <p>
     * This represents a TLS based condition matching on the incoming mail. It performs the operation configured in
     * 'Operator' and evaluates the 'Protocol' object against the 'Value'.
     * </p>
     */
    private IngressTlsProtocolExpression tlsExpression;

    /**
     * <p>
     * This represents a boolean type condition matching on the incoming mail. It performs the boolean operation
     * configured in 'Operator' and evaluates the 'Protocol' object against the 'Value'.
     * </p>
     * 
     * @param booleanExpression
     *        This represents a boolean type condition matching on the incoming mail. It performs the boolean operation
     *        configured in 'Operator' and evaluates the 'Protocol' object against the 'Value'.
     */

    public void setBooleanExpression(IngressBooleanExpression booleanExpression) {
        this.booleanExpression = booleanExpression;
    }

    /**
     * <p>
     * This represents a boolean type condition matching on the incoming mail. It performs the boolean operation
     * configured in 'Operator' and evaluates the 'Protocol' object against the 'Value'.
     * </p>
     * 
     * @return This represents a boolean type condition matching on the incoming mail. It performs the boolean operation
     *         configured in 'Operator' and evaluates the 'Protocol' object against the 'Value'.
     */

    public IngressBooleanExpression getBooleanExpression() {
        return this.booleanExpression;
    }

    /**
     * <p>
     * This represents a boolean type condition matching on the incoming mail. It performs the boolean operation
     * configured in 'Operator' and evaluates the 'Protocol' object against the 'Value'.
     * </p>
     * 
     * @param booleanExpression
     *        This represents a boolean type condition matching on the incoming mail. It performs the boolean operation
     *        configured in 'Operator' and evaluates the 'Protocol' object against the 'Value'.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyCondition withBooleanExpression(IngressBooleanExpression booleanExpression) {
        setBooleanExpression(booleanExpression);
        return this;
    }

    /**
     * <p>
     * This represents an IP based condition matching on the incoming mail. It performs the operation configured in
     * 'Operator' and evaluates the 'Protocol' object against the 'Value'.
     * </p>
     * 
     * @param ipExpression
     *        This represents an IP based condition matching on the incoming mail. It performs the operation configured
     *        in 'Operator' and evaluates the 'Protocol' object against the 'Value'.
     */

    public void setIpExpression(IngressIpv4Expression ipExpression) {
        this.ipExpression = ipExpression;
    }

    /**
     * <p>
     * This represents an IP based condition matching on the incoming mail. It performs the operation configured in
     * 'Operator' and evaluates the 'Protocol' object against the 'Value'.
     * </p>
     * 
     * @return This represents an IP based condition matching on the incoming mail. It performs the operation configured
     *         in 'Operator' and evaluates the 'Protocol' object against the 'Value'.
     */

    public IngressIpv4Expression getIpExpression() {
        return this.ipExpression;
    }

    /**
     * <p>
     * This represents an IP based condition matching on the incoming mail. It performs the operation configured in
     * 'Operator' and evaluates the 'Protocol' object against the 'Value'.
     * </p>
     * 
     * @param ipExpression
     *        This represents an IP based condition matching on the incoming mail. It performs the operation configured
     *        in 'Operator' and evaluates the 'Protocol' object against the 'Value'.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyCondition withIpExpression(IngressIpv4Expression ipExpression) {
        setIpExpression(ipExpression);
        return this;
    }

    /**
     * <p>
     * This represents a string based condition matching on the incoming mail. It performs the string operation
     * configured in 'Operator' and evaluates the 'Protocol' object against the 'Value'.
     * </p>
     * 
     * @param stringExpression
     *        This represents a string based condition matching on the incoming mail. It performs the string operation
     *        configured in 'Operator' and evaluates the 'Protocol' object against the 'Value'.
     */

    public void setStringExpression(IngressStringExpression stringExpression) {
        this.stringExpression = stringExpression;
    }

    /**
     * <p>
     * This represents a string based condition matching on the incoming mail. It performs the string operation
     * configured in 'Operator' and evaluates the 'Protocol' object against the 'Value'.
     * </p>
     * 
     * @return This represents a string based condition matching on the incoming mail. It performs the string operation
     *         configured in 'Operator' and evaluates the 'Protocol' object against the 'Value'.
     */

    public IngressStringExpression getStringExpression() {
        return this.stringExpression;
    }

    /**
     * <p>
     * This represents a string based condition matching on the incoming mail. It performs the string operation
     * configured in 'Operator' and evaluates the 'Protocol' object against the 'Value'.
     * </p>
     * 
     * @param stringExpression
     *        This represents a string based condition matching on the incoming mail. It performs the string operation
     *        configured in 'Operator' and evaluates the 'Protocol' object against the 'Value'.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyCondition withStringExpression(IngressStringExpression stringExpression) {
        setStringExpression(stringExpression);
        return this;
    }

    /**
     * <p>
     * This represents a TLS based condition matching on the incoming mail. It performs the operation configured in
     * 'Operator' and evaluates the 'Protocol' object against the 'Value'.
     * </p>
     * 
     * @param tlsExpression
     *        This represents a TLS based condition matching on the incoming mail. It performs the operation configured
     *        in 'Operator' and evaluates the 'Protocol' object against the 'Value'.
     */

    public void setTlsExpression(IngressTlsProtocolExpression tlsExpression) {
        this.tlsExpression = tlsExpression;
    }

    /**
     * <p>
     * This represents a TLS based condition matching on the incoming mail. It performs the operation configured in
     * 'Operator' and evaluates the 'Protocol' object against the 'Value'.
     * </p>
     * 
     * @return This represents a TLS based condition matching on the incoming mail. It performs the operation configured
     *         in 'Operator' and evaluates the 'Protocol' object against the 'Value'.
     */

    public IngressTlsProtocolExpression getTlsExpression() {
        return this.tlsExpression;
    }

    /**
     * <p>
     * This represents a TLS based condition matching on the incoming mail. It performs the operation configured in
     * 'Operator' and evaluates the 'Protocol' object against the 'Value'.
     * </p>
     * 
     * @param tlsExpression
     *        This represents a TLS based condition matching on the incoming mail. It performs the operation configured
     *        in 'Operator' and evaluates the 'Protocol' object against the 'Value'.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyCondition withTlsExpression(IngressTlsProtocolExpression tlsExpression) {
        setTlsExpression(tlsExpression);
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
        if (getBooleanExpression() != null)
            sb.append("BooleanExpression: ").append(getBooleanExpression()).append(",");
        if (getIpExpression() != null)
            sb.append("IpExpression: ").append(getIpExpression()).append(",");
        if (getStringExpression() != null)
            sb.append("StringExpression: ").append(getStringExpression()).append(",");
        if (getTlsExpression() != null)
            sb.append("TlsExpression: ").append(getTlsExpression());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyCondition == false)
            return false;
        PolicyCondition other = (PolicyCondition) obj;
        if (other.getBooleanExpression() == null ^ this.getBooleanExpression() == null)
            return false;
        if (other.getBooleanExpression() != null && other.getBooleanExpression().equals(this.getBooleanExpression()) == false)
            return false;
        if (other.getIpExpression() == null ^ this.getIpExpression() == null)
            return false;
        if (other.getIpExpression() != null && other.getIpExpression().equals(this.getIpExpression()) == false)
            return false;
        if (other.getStringExpression() == null ^ this.getStringExpression() == null)
            return false;
        if (other.getStringExpression() != null && other.getStringExpression().equals(this.getStringExpression()) == false)
            return false;
        if (other.getTlsExpression() == null ^ this.getTlsExpression() == null)
            return false;
        if (other.getTlsExpression() != null && other.getTlsExpression().equals(this.getTlsExpression()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBooleanExpression() == null) ? 0 : getBooleanExpression().hashCode());
        hashCode = prime * hashCode + ((getIpExpression() == null) ? 0 : getIpExpression().hashCode());
        hashCode = prime * hashCode + ((getStringExpression() == null) ? 0 : getStringExpression().hashCode());
        hashCode = prime * hashCode + ((getTlsExpression() == null) ? 0 : getTlsExpression().hashCode());
        return hashCode;
    }

    @Override
    public PolicyCondition clone() {
        try {
            return (PolicyCondition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mailmanager.model.transform.PolicyConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
