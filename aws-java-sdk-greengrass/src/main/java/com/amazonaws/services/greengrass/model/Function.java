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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Information about a Lambda function.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/Function" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Function implements Serializable, Cloneable, StructuredPojo {

    /** The ARN of the Lambda function. */
    private String functionArn;
    /** The configuration of the Lambda function. */
    private FunctionConfiguration functionConfiguration;
    /**
     * A descriptive or arbitrary ID for the function. This value must be unique within the function definition version.
     * Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
     */
    private String id;

    /**
     * The ARN of the Lambda function.
     * 
     * @param functionArn
     *        The ARN of the Lambda function.
     */

    public void setFunctionArn(String functionArn) {
        this.functionArn = functionArn;
    }

    /**
     * The ARN of the Lambda function.
     * 
     * @return The ARN of the Lambda function.
     */

    public String getFunctionArn() {
        return this.functionArn;
    }

    /**
     * The ARN of the Lambda function.
     * 
     * @param functionArn
     *        The ARN of the Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Function withFunctionArn(String functionArn) {
        setFunctionArn(functionArn);
        return this;
    }

    /**
     * The configuration of the Lambda function.
     * 
     * @param functionConfiguration
     *        The configuration of the Lambda function.
     */

    public void setFunctionConfiguration(FunctionConfiguration functionConfiguration) {
        this.functionConfiguration = functionConfiguration;
    }

    /**
     * The configuration of the Lambda function.
     * 
     * @return The configuration of the Lambda function.
     */

    public FunctionConfiguration getFunctionConfiguration() {
        return this.functionConfiguration;
    }

    /**
     * The configuration of the Lambda function.
     * 
     * @param functionConfiguration
     *        The configuration of the Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Function withFunctionConfiguration(FunctionConfiguration functionConfiguration) {
        setFunctionConfiguration(functionConfiguration);
        return this;
    }

    /**
     * A descriptive or arbitrary ID for the function. This value must be unique within the function definition version.
     * Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
     * 
     * @param id
     *        A descriptive or arbitrary ID for the function. This value must be unique within the function definition
     *        version. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * A descriptive or arbitrary ID for the function. This value must be unique within the function definition version.
     * Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
     * 
     * @return A descriptive or arbitrary ID for the function. This value must be unique within the function definition
     *         version. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
     */

    public String getId() {
        return this.id;
    }

    /**
     * A descriptive or arbitrary ID for the function. This value must be unique within the function definition version.
     * Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
     * 
     * @param id
     *        A descriptive or arbitrary ID for the function. This value must be unique within the function definition
     *        version. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Function withId(String id) {
        setId(id);
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
        if (getFunctionArn() != null)
            sb.append("FunctionArn: ").append(getFunctionArn()).append(",");
        if (getFunctionConfiguration() != null)
            sb.append("FunctionConfiguration: ").append(getFunctionConfiguration()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Function == false)
            return false;
        Function other = (Function) obj;
        if (other.getFunctionArn() == null ^ this.getFunctionArn() == null)
            return false;
        if (other.getFunctionArn() != null && other.getFunctionArn().equals(this.getFunctionArn()) == false)
            return false;
        if (other.getFunctionConfiguration() == null ^ this.getFunctionConfiguration() == null)
            return false;
        if (other.getFunctionConfiguration() != null && other.getFunctionConfiguration().equals(this.getFunctionConfiguration()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionArn() == null) ? 0 : getFunctionArn().hashCode());
        hashCode = prime * hashCode + ((getFunctionConfiguration() == null) ? 0 : getFunctionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public Function clone() {
        try {
            return (Function) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrass.model.transform.FunctionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
