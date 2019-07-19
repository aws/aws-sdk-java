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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Calls a Lambda function, passing in information about the detector model instance and the event which triggered the
 * action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/LambdaAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the Lambda function which is executed.
     * </p>
     */
    private String functionArn;

    /**
     * <p>
     * The ARN of the Lambda function which is executed.
     * </p>
     * 
     * @param functionArn
     *        The ARN of the Lambda function which is executed.
     */

    public void setFunctionArn(String functionArn) {
        this.functionArn = functionArn;
    }

    /**
     * <p>
     * The ARN of the Lambda function which is executed.
     * </p>
     * 
     * @return The ARN of the Lambda function which is executed.
     */

    public String getFunctionArn() {
        return this.functionArn;
    }

    /**
     * <p>
     * The ARN of the Lambda function which is executed.
     * </p>
     * 
     * @param functionArn
     *        The ARN of the Lambda function which is executed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaAction withFunctionArn(String functionArn) {
        setFunctionArn(functionArn);
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
            sb.append("FunctionArn: ").append(getFunctionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaAction == false)
            return false;
        LambdaAction other = (LambdaAction) obj;
        if (other.getFunctionArn() == null ^ this.getFunctionArn() == null)
            return false;
        if (other.getFunctionArn() != null && other.getFunctionArn().equals(this.getFunctionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionArn() == null) ? 0 : getFunctionArn().hashCode());
        return hashCode;
    }

    @Override
    public LambdaAction clone() {
        try {
            return (LambdaAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.LambdaActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
