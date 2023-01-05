/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemakergeospatial.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/Operation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Operation implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private String equation;
    /**
     * <p>
     * The name of the operation.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of the operation.
     * </p>
     */
    private String outputType;

    /**
     * <p/>
     * 
     * @param equation
     */

    public void setEquation(String equation) {
        this.equation = equation;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getEquation() {
        return this.equation;
    }

    /**
     * <p/>
     * 
     * @param equation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Operation withEquation(String equation) {
        setEquation(equation);
        return this;
    }

    /**
     * <p>
     * The name of the operation.
     * </p>
     * 
     * @param name
     *        The name of the operation.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the operation.
     * </p>
     * 
     * @return The name of the operation.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the operation.
     * </p>
     * 
     * @param name
     *        The name of the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Operation withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of the operation.
     * </p>
     * 
     * @param outputType
     *        The type of the operation.
     * @see OutputType
     */

    public void setOutputType(String outputType) {
        this.outputType = outputType;
    }

    /**
     * <p>
     * The type of the operation.
     * </p>
     * 
     * @return The type of the operation.
     * @see OutputType
     */

    public String getOutputType() {
        return this.outputType;
    }

    /**
     * <p>
     * The type of the operation.
     * </p>
     * 
     * @param outputType
     *        The type of the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutputType
     */

    public Operation withOutputType(String outputType) {
        setOutputType(outputType);
        return this;
    }

    /**
     * <p>
     * The type of the operation.
     * </p>
     * 
     * @param outputType
     *        The type of the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OutputType
     */

    public Operation withOutputType(OutputType outputType) {
        this.outputType = outputType.toString();
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
        if (getEquation() != null)
            sb.append("Equation: ").append(getEquation()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOutputType() != null)
            sb.append("OutputType: ").append(getOutputType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Operation == false)
            return false;
        Operation other = (Operation) obj;
        if (other.getEquation() == null ^ this.getEquation() == null)
            return false;
        if (other.getEquation() != null && other.getEquation().equals(this.getEquation()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOutputType() == null ^ this.getOutputType() == null)
            return false;
        if (other.getOutputType() != null && other.getOutputType().equals(this.getOutputType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEquation() == null) ? 0 : getEquation().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOutputType() == null) ? 0 : getOutputType().hashCode());
        return hashCode;
    }

    @Override
    public Operation clone() {
        try {
            return (Operation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakergeospatial.model.transform.OperationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
