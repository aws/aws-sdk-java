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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeServiceActionExecutionParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeServiceActionExecutionParametersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    private java.util.List<ExecutionParameter> serviceActionParameters;

    /**
     * @return
     */

    public java.util.List<ExecutionParameter> getServiceActionParameters() {
        return serviceActionParameters;
    }

    /**
     * @param serviceActionParameters
     */

    public void setServiceActionParameters(java.util.Collection<ExecutionParameter> serviceActionParameters) {
        if (serviceActionParameters == null) {
            this.serviceActionParameters = null;
            return;
        }

        this.serviceActionParameters = new java.util.ArrayList<ExecutionParameter>(serviceActionParameters);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceActionParameters(java.util.Collection)} or
     * {@link #withServiceActionParameters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param serviceActionParameters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServiceActionExecutionParametersResult withServiceActionParameters(ExecutionParameter... serviceActionParameters) {
        if (this.serviceActionParameters == null) {
            setServiceActionParameters(new java.util.ArrayList<ExecutionParameter>(serviceActionParameters.length));
        }
        for (ExecutionParameter ele : serviceActionParameters) {
            this.serviceActionParameters.add(ele);
        }
        return this;
    }

    /**
     * @param serviceActionParameters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServiceActionExecutionParametersResult withServiceActionParameters(java.util.Collection<ExecutionParameter> serviceActionParameters) {
        setServiceActionParameters(serviceActionParameters);
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
        if (getServiceActionParameters() != null)
            sb.append("ServiceActionParameters: ").append(getServiceActionParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeServiceActionExecutionParametersResult == false)
            return false;
        DescribeServiceActionExecutionParametersResult other = (DescribeServiceActionExecutionParametersResult) obj;
        if (other.getServiceActionParameters() == null ^ this.getServiceActionParameters() == null)
            return false;
        if (other.getServiceActionParameters() != null && other.getServiceActionParameters().equals(this.getServiceActionParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceActionParameters() == null) ? 0 : getServiceActionParameters().hashCode());
        return hashCode;
    }

    @Override
    public DescribeServiceActionExecutionParametersResult clone() {
        try {
            return (DescribeServiceActionExecutionParametersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
