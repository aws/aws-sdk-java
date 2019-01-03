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
 * Provides the details of the <code>CompleteWorkflowExecution</code> decision.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/CompleteWorkflowExecutionDecisionAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CompleteWorkflowExecutionDecisionAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The result of the workflow execution. The form of the result is implementation defined.
     * </p>
     */
    private String result;

    /**
     * <p>
     * The result of the workflow execution. The form of the result is implementation defined.
     * </p>
     * 
     * @param result
     *        The result of the workflow execution. The form of the result is implementation defined.
     */

    public void setResult(String result) {
        this.result = result;
    }

    /**
     * <p>
     * The result of the workflow execution. The form of the result is implementation defined.
     * </p>
     * 
     * @return The result of the workflow execution. The form of the result is implementation defined.
     */

    public String getResult() {
        return this.result;
    }

    /**
     * <p>
     * The result of the workflow execution. The form of the result is implementation defined.
     * </p>
     * 
     * @param result
     *        The result of the workflow execution. The form of the result is implementation defined.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompleteWorkflowExecutionDecisionAttributes withResult(String result) {
        setResult(result);
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
        if (getResult() != null)
            sb.append("Result: ").append(getResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompleteWorkflowExecutionDecisionAttributes == false)
            return false;
        CompleteWorkflowExecutionDecisionAttributes other = (CompleteWorkflowExecutionDecisionAttributes) obj;
        if (other.getResult() == null ^ this.getResult() == null)
            return false;
        if (other.getResult() != null && other.getResult().equals(this.getResult()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResult() == null) ? 0 : getResult().hashCode());
        return hashCode;
    }

    @Override
    public CompleteWorkflowExecutionDecisionAttributes clone() {
        try {
            return (CompleteWorkflowExecutionDecisionAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleworkflow.model.transform.CompleteWorkflowExecutionDecisionAttributesMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
