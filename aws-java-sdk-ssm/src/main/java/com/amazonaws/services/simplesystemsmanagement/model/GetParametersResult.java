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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetParameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetParametersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of details for a parameter.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Parameter> parameters;
    /**
     * <p>
     * A list of parameters that are not formatted correctly or do not run when executed.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> invalidParameters;

    /**
     * <p>
     * A list of details for a parameter.
     * </p>
     * 
     * @return A list of details for a parameter.
     */

    public java.util.List<Parameter> getParameters() {
        if (parameters == null) {
            parameters = new com.amazonaws.internal.SdkInternalList<Parameter>();
        }
        return parameters;
    }

    /**
     * <p>
     * A list of details for a parameter.
     * </p>
     * 
     * @param parameters
     *        A list of details for a parameter.
     */

    public void setParameters(java.util.Collection<Parameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new com.amazonaws.internal.SdkInternalList<Parameter>(parameters);
    }

    /**
     * <p>
     * A list of details for a parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameters(java.util.Collection)} or {@link #withParameters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param parameters
     *        A list of details for a parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParametersResult withParameters(Parameter... parameters) {
        if (this.parameters == null) {
            setParameters(new com.amazonaws.internal.SdkInternalList<Parameter>(parameters.length));
        }
        for (Parameter ele : parameters) {
            this.parameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of details for a parameter.
     * </p>
     * 
     * @param parameters
     *        A list of details for a parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParametersResult withParameters(java.util.Collection<Parameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * A list of parameters that are not formatted correctly or do not run when executed.
     * </p>
     * 
     * @return A list of parameters that are not formatted correctly or do not run when executed.
     */

    public java.util.List<String> getInvalidParameters() {
        if (invalidParameters == null) {
            invalidParameters = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return invalidParameters;
    }

    /**
     * <p>
     * A list of parameters that are not formatted correctly or do not run when executed.
     * </p>
     * 
     * @param invalidParameters
     *        A list of parameters that are not formatted correctly or do not run when executed.
     */

    public void setInvalidParameters(java.util.Collection<String> invalidParameters) {
        if (invalidParameters == null) {
            this.invalidParameters = null;
            return;
        }

        this.invalidParameters = new com.amazonaws.internal.SdkInternalList<String>(invalidParameters);
    }

    /**
     * <p>
     * A list of parameters that are not formatted correctly or do not run when executed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInvalidParameters(java.util.Collection)} or {@link #withInvalidParameters(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param invalidParameters
     *        A list of parameters that are not formatted correctly or do not run when executed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParametersResult withInvalidParameters(String... invalidParameters) {
        if (this.invalidParameters == null) {
            setInvalidParameters(new com.amazonaws.internal.SdkInternalList<String>(invalidParameters.length));
        }
        for (String ele : invalidParameters) {
            this.invalidParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of parameters that are not formatted correctly or do not run when executed.
     * </p>
     * 
     * @param invalidParameters
     *        A list of parameters that are not formatted correctly or do not run when executed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetParametersResult withInvalidParameters(java.util.Collection<String> invalidParameters) {
        setInvalidParameters(invalidParameters);
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
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getInvalidParameters() != null)
            sb.append("InvalidParameters: ").append(getInvalidParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetParametersResult == false)
            return false;
        GetParametersResult other = (GetParametersResult) obj;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getInvalidParameters() == null ^ this.getInvalidParameters() == null)
            return false;
        if (other.getInvalidParameters() != null && other.getInvalidParameters().equals(this.getInvalidParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getInvalidParameters() == null) ? 0 : getInvalidParameters().hashCode());
        return hashCode;
    }

    @Override
    public GetParametersResult clone() {
        try {
            return (GetParametersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
