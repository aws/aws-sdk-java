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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A function's environment variable settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsLambdaFunctionEnvironment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsLambdaFunctionEnvironment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Environment variable key-value pairs.
     * </p>
     */
    private java.util.Map<String, String> variables;
    /**
     * <p>
     * An <code>AwsLambdaFunctionEnvironmentError</code> object.
     * </p>
     */
    private AwsLambdaFunctionEnvironmentError error;

    /**
     * <p>
     * Environment variable key-value pairs.
     * </p>
     * 
     * @return Environment variable key-value pairs.
     */

    public java.util.Map<String, String> getVariables() {
        return variables;
    }

    /**
     * <p>
     * Environment variable key-value pairs.
     * </p>
     * 
     * @param variables
     *        Environment variable key-value pairs.
     */

    public void setVariables(java.util.Map<String, String> variables) {
        this.variables = variables;
    }

    /**
     * <p>
     * Environment variable key-value pairs.
     * </p>
     * 
     * @param variables
     *        Environment variable key-value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsLambdaFunctionEnvironment withVariables(java.util.Map<String, String> variables) {
        setVariables(variables);
        return this;
    }

    /**
     * Add a single Variables entry
     *
     * @see AwsLambdaFunctionEnvironment#withVariables
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AwsLambdaFunctionEnvironment addVariablesEntry(String key, String value) {
        if (null == this.variables) {
            this.variables = new java.util.HashMap<String, String>();
        }
        if (this.variables.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.variables.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Variables.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsLambdaFunctionEnvironment clearVariablesEntries() {
        this.variables = null;
        return this;
    }

    /**
     * <p>
     * An <code>AwsLambdaFunctionEnvironmentError</code> object.
     * </p>
     * 
     * @param error
     *        An <code>AwsLambdaFunctionEnvironmentError</code> object.
     */

    public void setError(AwsLambdaFunctionEnvironmentError error) {
        this.error = error;
    }

    /**
     * <p>
     * An <code>AwsLambdaFunctionEnvironmentError</code> object.
     * </p>
     * 
     * @return An <code>AwsLambdaFunctionEnvironmentError</code> object.
     */

    public AwsLambdaFunctionEnvironmentError getError() {
        return this.error;
    }

    /**
     * <p>
     * An <code>AwsLambdaFunctionEnvironmentError</code> object.
     * </p>
     * 
     * @param error
     *        An <code>AwsLambdaFunctionEnvironmentError</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsLambdaFunctionEnvironment withError(AwsLambdaFunctionEnvironmentError error) {
        setError(error);
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
        if (getVariables() != null)
            sb.append("Variables: ").append(getVariables()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsLambdaFunctionEnvironment == false)
            return false;
        AwsLambdaFunctionEnvironment other = (AwsLambdaFunctionEnvironment) obj;
        if (other.getVariables() == null ^ this.getVariables() == null)
            return false;
        if (other.getVariables() != null && other.getVariables().equals(this.getVariables()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVariables() == null) ? 0 : getVariables().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        return hashCode;
    }

    @Override
    public AwsLambdaFunctionEnvironment clone() {
        try {
            return (AwsLambdaFunctionEnvironment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsLambdaFunctionEnvironmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
