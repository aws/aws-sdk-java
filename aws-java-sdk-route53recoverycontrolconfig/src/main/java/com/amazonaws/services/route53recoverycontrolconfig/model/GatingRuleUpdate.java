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
 * Update to a gating rule. You can update the name or the evaluation period (wait period). If you don't specify one of
 * the items to update, the item is unchanged.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/GatingRuleUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GatingRuleUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name for the gating rule. You can use any non-white space character in the name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gating rule.
     * </p>
     */
    private String safetyRuleArn;
    /**
     * <p>
     * An evaluation period, in milliseconds (ms), during which any request against the target routing controls will
     * fail. This helps prevent "flapping" of state. The wait period is 5000 ms by default, but you can choose a custom
     * value.
     * </p>
     */
    private Integer waitPeriodMs;

    /**
     * <p>
     * The name for the gating rule. You can use any non-white space character in the name.
     * </p>
     * 
     * @param name
     *        The name for the gating rule. You can use any non-white space character in the name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the gating rule. You can use any non-white space character in the name.
     * </p>
     * 
     * @return The name for the gating rule. You can use any non-white space character in the name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the gating rule. You can use any non-white space character in the name.
     * </p>
     * 
     * @param name
     *        The name for the gating rule. You can use any non-white space character in the name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatingRuleUpdate withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gating rule.
     * </p>
     * 
     * @param safetyRuleArn
     *        The Amazon Resource Name (ARN) of the gating rule.
     */

    public void setSafetyRuleArn(String safetyRuleArn) {
        this.safetyRuleArn = safetyRuleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gating rule.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the gating rule.
     */

    public String getSafetyRuleArn() {
        return this.safetyRuleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gating rule.
     * </p>
     * 
     * @param safetyRuleArn
     *        The Amazon Resource Name (ARN) of the gating rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatingRuleUpdate withSafetyRuleArn(String safetyRuleArn) {
        setSafetyRuleArn(safetyRuleArn);
        return this;
    }

    /**
     * <p>
     * An evaluation period, in milliseconds (ms), during which any request against the target routing controls will
     * fail. This helps prevent "flapping" of state. The wait period is 5000 ms by default, but you can choose a custom
     * value.
     * </p>
     * 
     * @param waitPeriodMs
     *        An evaluation period, in milliseconds (ms), during which any request against the target routing controls
     *        will fail. This helps prevent "flapping" of state. The wait period is 5000 ms by default, but you can
     *        choose a custom value.
     */

    public void setWaitPeriodMs(Integer waitPeriodMs) {
        this.waitPeriodMs = waitPeriodMs;
    }

    /**
     * <p>
     * An evaluation period, in milliseconds (ms), during which any request against the target routing controls will
     * fail. This helps prevent "flapping" of state. The wait period is 5000 ms by default, but you can choose a custom
     * value.
     * </p>
     * 
     * @return An evaluation period, in milliseconds (ms), during which any request against the target routing controls
     *         will fail. This helps prevent "flapping" of state. The wait period is 5000 ms by default, but you can
     *         choose a custom value.
     */

    public Integer getWaitPeriodMs() {
        return this.waitPeriodMs;
    }

    /**
     * <p>
     * An evaluation period, in milliseconds (ms), during which any request against the target routing controls will
     * fail. This helps prevent "flapping" of state. The wait period is 5000 ms by default, but you can choose a custom
     * value.
     * </p>
     * 
     * @param waitPeriodMs
     *        An evaluation period, in milliseconds (ms), during which any request against the target routing controls
     *        will fail. This helps prevent "flapping" of state. The wait period is 5000 ms by default, but you can
     *        choose a custom value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatingRuleUpdate withWaitPeriodMs(Integer waitPeriodMs) {
        setWaitPeriodMs(waitPeriodMs);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSafetyRuleArn() != null)
            sb.append("SafetyRuleArn: ").append(getSafetyRuleArn()).append(",");
        if (getWaitPeriodMs() != null)
            sb.append("WaitPeriodMs: ").append(getWaitPeriodMs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GatingRuleUpdate == false)
            return false;
        GatingRuleUpdate other = (GatingRuleUpdate) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSafetyRuleArn() == null ^ this.getSafetyRuleArn() == null)
            return false;
        if (other.getSafetyRuleArn() != null && other.getSafetyRuleArn().equals(this.getSafetyRuleArn()) == false)
            return false;
        if (other.getWaitPeriodMs() == null ^ this.getWaitPeriodMs() == null)
            return false;
        if (other.getWaitPeriodMs() != null && other.getWaitPeriodMs().equals(this.getWaitPeriodMs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSafetyRuleArn() == null) ? 0 : getSafetyRuleArn().hashCode());
        hashCode = prime * hashCode + ((getWaitPeriodMs() == null) ? 0 : getWaitPeriodMs().hashCode());
        return hashCode;
    }

    @Override
    public GatingRuleUpdate clone() {
        try {
            return (GatingRuleUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53recoverycontrolconfig.model.transform.GatingRuleUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
