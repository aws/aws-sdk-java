/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteFlowDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFlowDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the flow definition you are deleting.
     * </p>
     */
    private String flowDefinitionName;

    /**
     * <p>
     * The name of the flow definition you are deleting.
     * </p>
     * 
     * @param flowDefinitionName
     *        The name of the flow definition you are deleting.
     */

    public void setFlowDefinitionName(String flowDefinitionName) {
        this.flowDefinitionName = flowDefinitionName;
    }

    /**
     * <p>
     * The name of the flow definition you are deleting.
     * </p>
     * 
     * @return The name of the flow definition you are deleting.
     */

    public String getFlowDefinitionName() {
        return this.flowDefinitionName;
    }

    /**
     * <p>
     * The name of the flow definition you are deleting.
     * </p>
     * 
     * @param flowDefinitionName
     *        The name of the flow definition you are deleting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFlowDefinitionRequest withFlowDefinitionName(String flowDefinitionName) {
        setFlowDefinitionName(flowDefinitionName);
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
        if (getFlowDefinitionName() != null)
            sb.append("FlowDefinitionName: ").append(getFlowDefinitionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFlowDefinitionRequest == false)
            return false;
        DeleteFlowDefinitionRequest other = (DeleteFlowDefinitionRequest) obj;
        if (other.getFlowDefinitionName() == null ^ this.getFlowDefinitionName() == null)
            return false;
        if (other.getFlowDefinitionName() != null && other.getFlowDefinitionName().equals(this.getFlowDefinitionName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlowDefinitionName() == null) ? 0 : getFlowDefinitionName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFlowDefinitionRequest clone() {
        return (DeleteFlowDefinitionRequest) super.clone();
    }

}
