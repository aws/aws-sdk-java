/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Provides details of the <code>FailWorkflowExecution</code> decision.
 * </p>
 * <p>
 * <b>Access Control</b>
 * </p>
 * <p>
 * You can use IAM policies to control this decision's access to Amazon SWF resources as follows:
 * </p>
 * <ul>
 * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
 * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
 * <li>You cannot use an IAM policy to constrain this action's parameters.</li>
 * </ul>
 * <p>
 * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the
 * specified constraints, the action fails. The associated event attribute's <b>cause</b> parameter will be set to
 * OPERATION_NOT_PERMITTED. For details and example IAM policies, see <a
 * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
 * Amazon SWF Workflows</a>.
 * </p>
 */
public class FailWorkflowExecutionDecisionAttributes implements Serializable, Cloneable {

    /**
     * <p>
     * A descriptive reason for the failure that may help in diagnostics.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * <i>Optional.</i> Details of the failure.
     * </p>
     */
    private String details;

    /**
     * <p>
     * A descriptive reason for the failure that may help in diagnostics.
     * </p>
     * 
     * @param reason
     *        A descriptive reason for the failure that may help in diagnostics.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * A descriptive reason for the failure that may help in diagnostics.
     * </p>
     * 
     * @return A descriptive reason for the failure that may help in diagnostics.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * A descriptive reason for the failure that may help in diagnostics.
     * </p>
     * 
     * @param reason
     *        A descriptive reason for the failure that may help in diagnostics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailWorkflowExecutionDecisionAttributes withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * <i>Optional.</i> Details of the failure.
     * </p>
     * 
     * @param details
     *        Optional.
     */

    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * <p>
     * <i>Optional.</i> Details of the failure.
     * </p>
     * 
     * @return Optional.
     */

    public String getDetails() {
        return this.details;
    }

    /**
     * <p>
     * <i>Optional.</i> Details of the failure.
     * </p>
     * 
     * @param details
     *        Optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailWorkflowExecutionDecisionAttributes withDetails(String details) {
        setDetails(details);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getReason() != null)
            sb.append("Reason: " + getReason() + ",");
        if (getDetails() != null)
            sb.append("Details: " + getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailWorkflowExecutionDecisionAttributes == false)
            return false;
        FailWorkflowExecutionDecisionAttributes other = (FailWorkflowExecutionDecisionAttributes) obj;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public FailWorkflowExecutionDecisionAttributes clone() {
        try {
            return (FailWorkflowExecutionDecisionAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
