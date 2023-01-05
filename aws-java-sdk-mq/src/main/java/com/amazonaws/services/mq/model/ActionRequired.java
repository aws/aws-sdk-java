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
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The action required to resolve a broker issue when the broker is in a CRITICAL_ACTION_REQUIRED state.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/ActionRequired" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionRequired implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The code you can use to resolve your broker issue when the broker is in a CRITICAL_ACTION_REQUIRED state. You can
     * find instructions by choosing the link for your code from the list of action required codes in <a
     * href="https://docs.aws.amazon.com//latest/developer-guide/troubleshooting-action-required-codes.html">Amazon MQ
     * action required codes</a>. Each code references a topic with detailed information, instructions, and
     * recommendations for how to resolve the issue and prevent future occurrences.
     * </p>
     */
    private String actionRequiredCode;
    /**
     * <p>
     * Information about the action required to resolve your broker issue when the broker is in a
     * CRITICAL_ACTION_REQUIRED state.
     * </p>
     */
    private String actionRequiredInfo;

    /**
     * <p>
     * The code you can use to resolve your broker issue when the broker is in a CRITICAL_ACTION_REQUIRED state. You can
     * find instructions by choosing the link for your code from the list of action required codes in <a
     * href="https://docs.aws.amazon.com//latest/developer-guide/troubleshooting-action-required-codes.html">Amazon MQ
     * action required codes</a>. Each code references a topic with detailed information, instructions, and
     * recommendations for how to resolve the issue and prevent future occurrences.
     * </p>
     * 
     * @param actionRequiredCode
     *        The code you can use to resolve your broker issue when the broker is in a CRITICAL_ACTION_REQUIRED state.
     *        You can find instructions by choosing the link for your code from the list of action required codes in <a
     *        href
     *        ="https://docs.aws.amazon.com//latest/developer-guide/troubleshooting-action-required-codes.html">Amazon
     *        MQ action required codes</a>. Each code references a topic with detailed information, instructions, and
     *        recommendations for how to resolve the issue and prevent future occurrences.
     */

    public void setActionRequiredCode(String actionRequiredCode) {
        this.actionRequiredCode = actionRequiredCode;
    }

    /**
     * <p>
     * The code you can use to resolve your broker issue when the broker is in a CRITICAL_ACTION_REQUIRED state. You can
     * find instructions by choosing the link for your code from the list of action required codes in <a
     * href="https://docs.aws.amazon.com//latest/developer-guide/troubleshooting-action-required-codes.html">Amazon MQ
     * action required codes</a>. Each code references a topic with detailed information, instructions, and
     * recommendations for how to resolve the issue and prevent future occurrences.
     * </p>
     * 
     * @return The code you can use to resolve your broker issue when the broker is in a CRITICAL_ACTION_REQUIRED state.
     *         You can find instructions by choosing the link for your code from the list of action required codes in <a
     *         href
     *         ="https://docs.aws.amazon.com//latest/developer-guide/troubleshooting-action-required-codes.html">Amazon
     *         MQ action required codes</a>. Each code references a topic with detailed information, instructions, and
     *         recommendations for how to resolve the issue and prevent future occurrences.
     */

    public String getActionRequiredCode() {
        return this.actionRequiredCode;
    }

    /**
     * <p>
     * The code you can use to resolve your broker issue when the broker is in a CRITICAL_ACTION_REQUIRED state. You can
     * find instructions by choosing the link for your code from the list of action required codes in <a
     * href="https://docs.aws.amazon.com//latest/developer-guide/troubleshooting-action-required-codes.html">Amazon MQ
     * action required codes</a>. Each code references a topic with detailed information, instructions, and
     * recommendations for how to resolve the issue and prevent future occurrences.
     * </p>
     * 
     * @param actionRequiredCode
     *        The code you can use to resolve your broker issue when the broker is in a CRITICAL_ACTION_REQUIRED state.
     *        You can find instructions by choosing the link for your code from the list of action required codes in <a
     *        href
     *        ="https://docs.aws.amazon.com//latest/developer-guide/troubleshooting-action-required-codes.html">Amazon
     *        MQ action required codes</a>. Each code references a topic with detailed information, instructions, and
     *        recommendations for how to resolve the issue and prevent future occurrences.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionRequired withActionRequiredCode(String actionRequiredCode) {
        setActionRequiredCode(actionRequiredCode);
        return this;
    }

    /**
     * <p>
     * Information about the action required to resolve your broker issue when the broker is in a
     * CRITICAL_ACTION_REQUIRED state.
     * </p>
     * 
     * @param actionRequiredInfo
     *        Information about the action required to resolve your broker issue when the broker is in a
     *        CRITICAL_ACTION_REQUIRED state.
     */

    public void setActionRequiredInfo(String actionRequiredInfo) {
        this.actionRequiredInfo = actionRequiredInfo;
    }

    /**
     * <p>
     * Information about the action required to resolve your broker issue when the broker is in a
     * CRITICAL_ACTION_REQUIRED state.
     * </p>
     * 
     * @return Information about the action required to resolve your broker issue when the broker is in a
     *         CRITICAL_ACTION_REQUIRED state.
     */

    public String getActionRequiredInfo() {
        return this.actionRequiredInfo;
    }

    /**
     * <p>
     * Information about the action required to resolve your broker issue when the broker is in a
     * CRITICAL_ACTION_REQUIRED state.
     * </p>
     * 
     * @param actionRequiredInfo
     *        Information about the action required to resolve your broker issue when the broker is in a
     *        CRITICAL_ACTION_REQUIRED state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionRequired withActionRequiredInfo(String actionRequiredInfo) {
        setActionRequiredInfo(actionRequiredInfo);
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
        if (getActionRequiredCode() != null)
            sb.append("ActionRequiredCode: ").append(getActionRequiredCode()).append(",");
        if (getActionRequiredInfo() != null)
            sb.append("ActionRequiredInfo: ").append(getActionRequiredInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionRequired == false)
            return false;
        ActionRequired other = (ActionRequired) obj;
        if (other.getActionRequiredCode() == null ^ this.getActionRequiredCode() == null)
            return false;
        if (other.getActionRequiredCode() != null && other.getActionRequiredCode().equals(this.getActionRequiredCode()) == false)
            return false;
        if (other.getActionRequiredInfo() == null ^ this.getActionRequiredInfo() == null)
            return false;
        if (other.getActionRequiredInfo() != null && other.getActionRequiredInfo().equals(this.getActionRequiredInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionRequiredCode() == null) ? 0 : getActionRequiredCode().hashCode());
        hashCode = prime * hashCode + ((getActionRequiredInfo() == null) ? 0 : getActionRequiredInfo().hashCode());
        return hashCode;
    }

    @Override
    public ActionRequired clone() {
        try {
            return (ActionRequired) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mq.model.transform.ActionRequiredMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
