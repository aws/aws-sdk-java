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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/DeleteFlow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFlowResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** The ARN of the flow that was deleted. */
    private String flowArn;
    /** The status of the flow when the DeleteFlow process begins. */
    private String status;

    /**
     * The ARN of the flow that was deleted.
     * 
     * @param flowArn
     *        The ARN of the flow that was deleted.
     */

    public void setFlowArn(String flowArn) {
        this.flowArn = flowArn;
    }

    /**
     * The ARN of the flow that was deleted.
     * 
     * @return The ARN of the flow that was deleted.
     */

    public String getFlowArn() {
        return this.flowArn;
    }

    /**
     * The ARN of the flow that was deleted.
     * 
     * @param flowArn
     *        The ARN of the flow that was deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFlowResult withFlowArn(String flowArn) {
        setFlowArn(flowArn);
        return this;
    }

    /**
     * The status of the flow when the DeleteFlow process begins.
     * 
     * @param status
     *        The status of the flow when the DeleteFlow process begins.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * The status of the flow when the DeleteFlow process begins.
     * 
     * @return The status of the flow when the DeleteFlow process begins.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * The status of the flow when the DeleteFlow process begins.
     * 
     * @param status
     *        The status of the flow when the DeleteFlow process begins.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public DeleteFlowResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * The status of the flow when the DeleteFlow process begins.
     * 
     * @param status
     *        The status of the flow when the DeleteFlow process begins.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public DeleteFlowResult withStatus(Status status) {
        this.status = status.toString();
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
        if (getFlowArn() != null)
            sb.append("FlowArn: ").append(getFlowArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFlowResult == false)
            return false;
        DeleteFlowResult other = (DeleteFlowResult) obj;
        if (other.getFlowArn() == null ^ this.getFlowArn() == null)
            return false;
        if (other.getFlowArn() != null && other.getFlowArn().equals(this.getFlowArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlowArn() == null) ? 0 : getFlowArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFlowResult clone() {
        try {
            return (DeleteFlowResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
