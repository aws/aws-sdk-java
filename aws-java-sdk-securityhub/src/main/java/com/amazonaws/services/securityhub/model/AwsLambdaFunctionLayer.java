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
 * An AWS Lambda layer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsLambdaFunctionLayer" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsLambdaFunctionLayer implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the function layer.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The size of the layer archive in bytes.
     * </p>
     */
    private Integer codeSize;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the function layer.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the function layer.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the function layer.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the function layer.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the function layer.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the function layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsLambdaFunctionLayer withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The size of the layer archive in bytes.
     * </p>
     * 
     * @param codeSize
     *        The size of the layer archive in bytes.
     */

    public void setCodeSize(Integer codeSize) {
        this.codeSize = codeSize;
    }

    /**
     * <p>
     * The size of the layer archive in bytes.
     * </p>
     * 
     * @return The size of the layer archive in bytes.
     */

    public Integer getCodeSize() {
        return this.codeSize;
    }

    /**
     * <p>
     * The size of the layer archive in bytes.
     * </p>
     * 
     * @param codeSize
     *        The size of the layer archive in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsLambdaFunctionLayer withCodeSize(Integer codeSize) {
        setCodeSize(codeSize);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCodeSize() != null)
            sb.append("CodeSize: ").append(getCodeSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsLambdaFunctionLayer == false)
            return false;
        AwsLambdaFunctionLayer other = (AwsLambdaFunctionLayer) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCodeSize() == null ^ this.getCodeSize() == null)
            return false;
        if (other.getCodeSize() != null && other.getCodeSize().equals(this.getCodeSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCodeSize() == null) ? 0 : getCodeSize().hashCode());
        return hashCode;
    }

    @Override
    public AwsLambdaFunctionLayer clone() {
        try {
            return (AwsLambdaFunctionLayer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsLambdaFunctionLayerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
