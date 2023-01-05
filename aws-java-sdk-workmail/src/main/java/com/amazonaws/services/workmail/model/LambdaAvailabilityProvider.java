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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a Lambda based availability provider.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/LambdaAvailabilityProvider"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaAvailabilityProvider implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda that acts as the availability provider.
     * </p>
     */
    private String lambdaArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda that acts as the availability provider.
     * </p>
     * 
     * @param lambdaArn
     *        The Amazon Resource Name (ARN) of the Lambda that acts as the availability provider.
     */

    public void setLambdaArn(String lambdaArn) {
        this.lambdaArn = lambdaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda that acts as the availability provider.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Lambda that acts as the availability provider.
     */

    public String getLambdaArn() {
        return this.lambdaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda that acts as the availability provider.
     * </p>
     * 
     * @param lambdaArn
     *        The Amazon Resource Name (ARN) of the Lambda that acts as the availability provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaAvailabilityProvider withLambdaArn(String lambdaArn) {
        setLambdaArn(lambdaArn);
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
        if (getLambdaArn() != null)
            sb.append("LambdaArn: ").append(getLambdaArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaAvailabilityProvider == false)
            return false;
        LambdaAvailabilityProvider other = (LambdaAvailabilityProvider) obj;
        if (other.getLambdaArn() == null ^ this.getLambdaArn() == null)
            return false;
        if (other.getLambdaArn() != null && other.getLambdaArn().equals(this.getLambdaArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLambdaArn() == null) ? 0 : getLambdaArn().hashCode());
        return hashCode;
    }

    @Override
    public LambdaAvailabilityProvider clone() {
        try {
            return (LambdaAvailabilityProvider) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workmail.model.transform.LambdaAvailabilityProviderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
