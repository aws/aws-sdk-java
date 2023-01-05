/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53recoverycontrolconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A safety rule. A safety rule can be an assertion rule or a gating rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/Rule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Rule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An assertion rule enforces that, when a routing control state is changed, the criteria set by the rule
     * configuration is met. Otherwise, the change to the routing control state is not accepted. For example, the
     * criteria might be that at least one routing control state is On after the transaction so that traffic continues
     * to flow to at least one cell for the application. This ensures that you avoid a fail-open scenario.
     * </p>
     */
    private AssertionRule aSSERTION;
    /**
     * <p>
     * A gating rule verifies that a gating routing control or set of gating routing controls, evaluates as true, based
     * on a rule configuration that you specify, which allows a set of routing control state changes to complete.
     * </p>
     * <p>
     * For example, if you specify one gating routing control and you set the Type in the rule configuration to OR, that
     * indicates that you must set the gating routing control to On for the rule to evaluate as true; that is, for the
     * gating control "switch" to be "On". When you do that, then you can update the routing control states for the
     * target routing controls that you specify in the gating rule.
     * </p>
     */
    private GatingRule gATING;

    /**
     * <p>
     * An assertion rule enforces that, when a routing control state is changed, the criteria set by the rule
     * configuration is met. Otherwise, the change to the routing control state is not accepted. For example, the
     * criteria might be that at least one routing control state is On after the transaction so that traffic continues
     * to flow to at least one cell for the application. This ensures that you avoid a fail-open scenario.
     * </p>
     * 
     * @param aSSERTION
     *        An assertion rule enforces that, when a routing control state is changed, the criteria set by the rule
     *        configuration is met. Otherwise, the change to the routing control state is not accepted. For example, the
     *        criteria might be that at least one routing control state is On after the transaction so that traffic
     *        continues to flow to at least one cell for the application. This ensures that you avoid a fail-open
     *        scenario.
     */

    public void setASSERTION(AssertionRule aSSERTION) {
        this.aSSERTION = aSSERTION;
    }

    /**
     * <p>
     * An assertion rule enforces that, when a routing control state is changed, the criteria set by the rule
     * configuration is met. Otherwise, the change to the routing control state is not accepted. For example, the
     * criteria might be that at least one routing control state is On after the transaction so that traffic continues
     * to flow to at least one cell for the application. This ensures that you avoid a fail-open scenario.
     * </p>
     * 
     * @return An assertion rule enforces that, when a routing control state is changed, the criteria set by the rule
     *         configuration is met. Otherwise, the change to the routing control state is not accepted. For example,
     *         the criteria might be that at least one routing control state is On after the transaction so that traffic
     *         continues to flow to at least one cell for the application. This ensures that you avoid a fail-open
     *         scenario.
     */

    public AssertionRule getASSERTION() {
        return this.aSSERTION;
    }

    /**
     * <p>
     * An assertion rule enforces that, when a routing control state is changed, the criteria set by the rule
     * configuration is met. Otherwise, the change to the routing control state is not accepted. For example, the
     * criteria might be that at least one routing control state is On after the transaction so that traffic continues
     * to flow to at least one cell for the application. This ensures that you avoid a fail-open scenario.
     * </p>
     * 
     * @param aSSERTION
     *        An assertion rule enforces that, when a routing control state is changed, the criteria set by the rule
     *        configuration is met. Otherwise, the change to the routing control state is not accepted. For example, the
     *        criteria might be that at least one routing control state is On after the transaction so that traffic
     *        continues to flow to at least one cell for the application. This ensures that you avoid a fail-open
     *        scenario.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withASSERTION(AssertionRule aSSERTION) {
        setASSERTION(aSSERTION);
        return this;
    }

    /**
     * <p>
     * A gating rule verifies that a gating routing control or set of gating routing controls, evaluates as true, based
     * on a rule configuration that you specify, which allows a set of routing control state changes to complete.
     * </p>
     * <p>
     * For example, if you specify one gating routing control and you set the Type in the rule configuration to OR, that
     * indicates that you must set the gating routing control to On for the rule to evaluate as true; that is, for the
     * gating control "switch" to be "On". When you do that, then you can update the routing control states for the
     * target routing controls that you specify in the gating rule.
     * </p>
     * 
     * @param gATING
     *        A gating rule verifies that a gating routing control or set of gating routing controls, evaluates as true,
     *        based on a rule configuration that you specify, which allows a set of routing control state changes to
     *        complete.</p>
     *        <p>
     *        For example, if you specify one gating routing control and you set the Type in the rule configuration to
     *        OR, that indicates that you must set the gating routing control to On for the rule to evaluate as true;
     *        that is, for the gating control "switch" to be "On". When you do that, then you can update the routing
     *        control states for the target routing controls that you specify in the gating rule.
     */

    public void setGATING(GatingRule gATING) {
        this.gATING = gATING;
    }

    /**
     * <p>
     * A gating rule verifies that a gating routing control or set of gating routing controls, evaluates as true, based
     * on a rule configuration that you specify, which allows a set of routing control state changes to complete.
     * </p>
     * <p>
     * For example, if you specify one gating routing control and you set the Type in the rule configuration to OR, that
     * indicates that you must set the gating routing control to On for the rule to evaluate as true; that is, for the
     * gating control "switch" to be "On". When you do that, then you can update the routing control states for the
     * target routing controls that you specify in the gating rule.
     * </p>
     * 
     * @return A gating rule verifies that a gating routing control or set of gating routing controls, evaluates as
     *         true, based on a rule configuration that you specify, which allows a set of routing control state changes
     *         to complete.</p>
     *         <p>
     *         For example, if you specify one gating routing control and you set the Type in the rule configuration to
     *         OR, that indicates that you must set the gating routing control to On for the rule to evaluate as true;
     *         that is, for the gating control "switch" to be "On". When you do that, then you can update the routing
     *         control states for the target routing controls that you specify in the gating rule.
     */

    public GatingRule getGATING() {
        return this.gATING;
    }

    /**
     * <p>
     * A gating rule verifies that a gating routing control or set of gating routing controls, evaluates as true, based
     * on a rule configuration that you specify, which allows a set of routing control state changes to complete.
     * </p>
     * <p>
     * For example, if you specify one gating routing control and you set the Type in the rule configuration to OR, that
     * indicates that you must set the gating routing control to On for the rule to evaluate as true; that is, for the
     * gating control "switch" to be "On". When you do that, then you can update the routing control states for the
     * target routing controls that you specify in the gating rule.
     * </p>
     * 
     * @param gATING
     *        A gating rule verifies that a gating routing control or set of gating routing controls, evaluates as true,
     *        based on a rule configuration that you specify, which allows a set of routing control state changes to
     *        complete.</p>
     *        <p>
     *        For example, if you specify one gating routing control and you set the Type in the rule configuration to
     *        OR, that indicates that you must set the gating routing control to On for the rule to evaluate as true;
     *        that is, for the gating control "switch" to be "On". When you do that, then you can update the routing
     *        control states for the target routing controls that you specify in the gating rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withGATING(GatingRule gATING) {
        setGATING(gATING);
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
        if (getASSERTION() != null)
            sb.append("ASSERTION: ").append(getASSERTION()).append(",");
        if (getGATING() != null)
            sb.append("GATING: ").append(getGATING());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Rule == false)
            return false;
        Rule other = (Rule) obj;
        if (other.getASSERTION() == null ^ this.getASSERTION() == null)
            return false;
        if (other.getASSERTION() != null && other.getASSERTION().equals(this.getASSERTION()) == false)
            return false;
        if (other.getGATING() == null ^ this.getGATING() == null)
            return false;
        if (other.getGATING() != null && other.getGATING().equals(this.getGATING()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getASSERTION() == null) ? 0 : getASSERTION().hashCode());
        hashCode = prime * hashCode + ((getGATING() == null) ? 0 : getGATING().hashCode());
        return hashCode;
    }

    @Override
    public Rule clone() {
        try {
            return (Rule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53recoverycontrolconfig.model.transform.RuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
