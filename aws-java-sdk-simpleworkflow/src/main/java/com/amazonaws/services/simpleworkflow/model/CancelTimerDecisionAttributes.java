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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the details of the <code>CancelTimer</code> decision.
 * </p>
 * <p>
 * <b>Access Control</b>
 * </p>
 * <p>
 * You can use IAM policies to control this decision's access to Amazon SWF resources as follows:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use an <code>Action</code> element to allow or deny permission to call this action.
 * </p>
 * </li>
 * <li>
 * <p>
 * You cannot use an IAM policy to constrain this action's parameters.
 * </p>
 * </li>
 * </ul>
 * <p>
 * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
 * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
 * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
 * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
 * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/CancelTimerDecisionAttributes" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelTimerDecisionAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID of the timer to cancel.
     * </p>
     */
    private String timerId;

    /**
     * <p>
     * The unique ID of the timer to cancel.
     * </p>
     * 
     * @param timerId
     *        The unique ID of the timer to cancel.
     */

    public void setTimerId(String timerId) {
        this.timerId = timerId;
    }

    /**
     * <p>
     * The unique ID of the timer to cancel.
     * </p>
     * 
     * @return The unique ID of the timer to cancel.
     */

    public String getTimerId() {
        return this.timerId;
    }

    /**
     * <p>
     * The unique ID of the timer to cancel.
     * </p>
     * 
     * @param timerId
     *        The unique ID of the timer to cancel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelTimerDecisionAttributes withTimerId(String timerId) {
        setTimerId(timerId);
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
        if (getTimerId() != null)
            sb.append("TimerId: ").append(getTimerId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelTimerDecisionAttributes == false)
            return false;
        CancelTimerDecisionAttributes other = (CancelTimerDecisionAttributes) obj;
        if (other.getTimerId() == null ^ this.getTimerId() == null)
            return false;
        if (other.getTimerId() != null && other.getTimerId().equals(this.getTimerId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimerId() == null) ? 0 : getTimerId().hashCode());
        return hashCode;
    }

    @Override
    public CancelTimerDecisionAttributes clone() {
        try {
            return (CancelTimerDecisionAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleworkflow.model.transform.CancelTimerDecisionAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
