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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/RemoveFlowOutput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveFlowOutputRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The flow that you want to remove an output from. */
    private String flowArn;
    /** The ARN of the output that you want to remove. */
    private String outputArn;

    /**
     * The flow that you want to remove an output from.
     * 
     * @param flowArn
     *        The flow that you want to remove an output from.
     */

    public void setFlowArn(String flowArn) {
        this.flowArn = flowArn;
    }

    /**
     * The flow that you want to remove an output from.
     * 
     * @return The flow that you want to remove an output from.
     */

    public String getFlowArn() {
        return this.flowArn;
    }

    /**
     * The flow that you want to remove an output from.
     * 
     * @param flowArn
     *        The flow that you want to remove an output from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveFlowOutputRequest withFlowArn(String flowArn) {
        setFlowArn(flowArn);
        return this;
    }

    /**
     * The ARN of the output that you want to remove.
     * 
     * @param outputArn
     *        The ARN of the output that you want to remove.
     */

    public void setOutputArn(String outputArn) {
        this.outputArn = outputArn;
    }

    /**
     * The ARN of the output that you want to remove.
     * 
     * @return The ARN of the output that you want to remove.
     */

    public String getOutputArn() {
        return this.outputArn;
    }

    /**
     * The ARN of the output that you want to remove.
     * 
     * @param outputArn
     *        The ARN of the output that you want to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveFlowOutputRequest withOutputArn(String outputArn) {
        setOutputArn(outputArn);
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
        if (getOutputArn() != null)
            sb.append("OutputArn: ").append(getOutputArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveFlowOutputRequest == false)
            return false;
        RemoveFlowOutputRequest other = (RemoveFlowOutputRequest) obj;
        if (other.getFlowArn() == null ^ this.getFlowArn() == null)
            return false;
        if (other.getFlowArn() != null && other.getFlowArn().equals(this.getFlowArn()) == false)
            return false;
        if (other.getOutputArn() == null ^ this.getOutputArn() == null)
            return false;
        if (other.getOutputArn() != null && other.getOutputArn().equals(this.getOutputArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlowArn() == null) ? 0 : getFlowArn().hashCode());
        hashCode = prime * hashCode + ((getOutputArn() == null) ? 0 : getOutputArn().hashCode());
        return hashCode;
    }

    @Override
    public RemoveFlowOutputRequest clone() {
        return (RemoveFlowOutputRequest) super.clone();
    }

}
