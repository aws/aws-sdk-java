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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The <code>LambdaConflictHandlerConfig</code> object when configuring LAMBDA as the Conflict Handler.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/LambdaConflictHandlerConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaConflictHandlerConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Arn for the Lambda function to use as the Conflict Handler.
     * </p>
     */
    private String lambdaConflictHandlerArn;

    /**
     * <p>
     * The Arn for the Lambda function to use as the Conflict Handler.
     * </p>
     * 
     * @param lambdaConflictHandlerArn
     *        The Arn for the Lambda function to use as the Conflict Handler.
     */

    public void setLambdaConflictHandlerArn(String lambdaConflictHandlerArn) {
        this.lambdaConflictHandlerArn = lambdaConflictHandlerArn;
    }

    /**
     * <p>
     * The Arn for the Lambda function to use as the Conflict Handler.
     * </p>
     * 
     * @return The Arn for the Lambda function to use as the Conflict Handler.
     */

    public String getLambdaConflictHandlerArn() {
        return this.lambdaConflictHandlerArn;
    }

    /**
     * <p>
     * The Arn for the Lambda function to use as the Conflict Handler.
     * </p>
     * 
     * @param lambdaConflictHandlerArn
     *        The Arn for the Lambda function to use as the Conflict Handler.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaConflictHandlerConfig withLambdaConflictHandlerArn(String lambdaConflictHandlerArn) {
        setLambdaConflictHandlerArn(lambdaConflictHandlerArn);
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
        if (getLambdaConflictHandlerArn() != null)
            sb.append("LambdaConflictHandlerArn: ").append(getLambdaConflictHandlerArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaConflictHandlerConfig == false)
            return false;
        LambdaConflictHandlerConfig other = (LambdaConflictHandlerConfig) obj;
        if (other.getLambdaConflictHandlerArn() == null ^ this.getLambdaConflictHandlerArn() == null)
            return false;
        if (other.getLambdaConflictHandlerArn() != null && other.getLambdaConflictHandlerArn().equals(this.getLambdaConflictHandlerArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLambdaConflictHandlerArn() == null) ? 0 : getLambdaConflictHandlerArn().hashCode());
        return hashCode;
    }

    @Override
    public LambdaConflictHandlerConfig clone() {
        try {
            return (LambdaConflictHandlerConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appsync.model.transform.LambdaConflictHandlerConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
