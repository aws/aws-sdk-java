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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An ordered list of actions you can take to remediate a violation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/RemediationActionWithOrder" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemediationActionWithOrder implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about an action you can take to remediate a violation.
     * </p>
     */
    private RemediationAction remediationAction;
    /**
     * <p>
     * The order of the remediation actions in the list.
     * </p>
     */
    private Integer order;

    /**
     * <p>
     * Information about an action you can take to remediate a violation.
     * </p>
     * 
     * @param remediationAction
     *        Information about an action you can take to remediate a violation.
     */

    public void setRemediationAction(RemediationAction remediationAction) {
        this.remediationAction = remediationAction;
    }

    /**
     * <p>
     * Information about an action you can take to remediate a violation.
     * </p>
     * 
     * @return Information about an action you can take to remediate a violation.
     */

    public RemediationAction getRemediationAction() {
        return this.remediationAction;
    }

    /**
     * <p>
     * Information about an action you can take to remediate a violation.
     * </p>
     * 
     * @param remediationAction
     *        Information about an action you can take to remediate a violation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemediationActionWithOrder withRemediationAction(RemediationAction remediationAction) {
        setRemediationAction(remediationAction);
        return this;
    }

    /**
     * <p>
     * The order of the remediation actions in the list.
     * </p>
     * 
     * @param order
     *        The order of the remediation actions in the list.
     */

    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * <p>
     * The order of the remediation actions in the list.
     * </p>
     * 
     * @return The order of the remediation actions in the list.
     */

    public Integer getOrder() {
        return this.order;
    }

    /**
     * <p>
     * The order of the remediation actions in the list.
     * </p>
     * 
     * @param order
     *        The order of the remediation actions in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemediationActionWithOrder withOrder(Integer order) {
        setOrder(order);
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
        if (getRemediationAction() != null)
            sb.append("RemediationAction: ").append(getRemediationAction()).append(",");
        if (getOrder() != null)
            sb.append("Order: ").append(getOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemediationActionWithOrder == false)
            return false;
        RemediationActionWithOrder other = (RemediationActionWithOrder) obj;
        if (other.getRemediationAction() == null ^ this.getRemediationAction() == null)
            return false;
        if (other.getRemediationAction() != null && other.getRemediationAction().equals(this.getRemediationAction()) == false)
            return false;
        if (other.getOrder() == null ^ this.getOrder() == null)
            return false;
        if (other.getOrder() != null && other.getOrder().equals(this.getOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRemediationAction() == null) ? 0 : getRemediationAction().hashCode());
        hashCode = prime * hashCode + ((getOrder() == null) ? 0 : getOrder().hashCode());
        return hashCode;
    }

    @Override
    public RemediationActionWithOrder clone() {
        try {
            return (RemediationActionWithOrder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.RemediationActionWithOrderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
