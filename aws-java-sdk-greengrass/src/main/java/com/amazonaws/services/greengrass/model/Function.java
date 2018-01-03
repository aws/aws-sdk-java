/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Information on function
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/Function" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Function implements Serializable, Cloneable, StructuredPojo {

    /** Arn of the Lambda function. */
    private String functionArn;
    /** Configuration of the function */
    private FunctionConfiguration functionConfiguration;
    /** Id of the function in this version. */
    private String id;

    /**
     * Arn of the Lambda function.
     * 
     * @param functionArn
     *        Arn of the Lambda function.
     */

    public void setFunctionArn(String functionArn) {
        this.functionArn = functionArn;
    }

    /**
     * Arn of the Lambda function.
     * 
     * @return Arn of the Lambda function.
     */

    public String getFunctionArn() {
        return this.functionArn;
    }

    /**
     * Arn of the Lambda function.
     * 
     * @param functionArn
     *        Arn of the Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Function withFunctionArn(String functionArn) {
        setFunctionArn(functionArn);
        return this;
    }

    /**
     * Configuration of the function
     * 
     * @param functionConfiguration
     *        Configuration of the function
     */

    public void setFunctionConfiguration(FunctionConfiguration functionConfiguration) {
        this.functionConfiguration = functionConfiguration;
    }

    /**
     * Configuration of the function
     * 
     * @return Configuration of the function
     */

    public FunctionConfiguration getFunctionConfiguration() {
        return this.functionConfiguration;
    }

    /**
     * Configuration of the function
     * 
     * @param functionConfiguration
     *        Configuration of the function
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Function withFunctionConfiguration(FunctionConfiguration functionConfiguration) {
        setFunctionConfiguration(functionConfiguration);
        return this;
    }

    /**
     * Id of the function in this version.
     * 
     * @param id
     *        Id of the function in this version.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Id of the function in this version.
     * 
     * @return Id of the function in this version.
     */

    public String getId() {
        return this.id;
    }

    /**
     * Id of the function in this version.
     * 
     * @param id
     *        Id of the function in this version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Function withId(String id) {
        setId(id);
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
