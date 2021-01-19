/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The endpoint assigned to the SIP media application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/SipMediaApplicationEndpoint" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SipMediaApplicationEndpoint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Valid Amazon Resource Name (ARN) of the Lambda function. The function must be created in the same AWS Region as
     * the SIP media application.
     * </p>
     */
    private String lambdaArn;

    /**
     * <p>
     * Valid Amazon Resource Name (ARN) of the Lambda function. The function must be created in the same AWS Region as
     * the SIP media application.
     * </p>
     * 
     * @param lambdaArn
     *        Valid Amazon Resource Name (ARN) of the Lambda function. The function must be created in the same AWS
     *        Region as the SIP media application.
     */

    public void setLambdaArn(String lambdaArn) {
        this.lambdaArn = lambdaArn;
    }

    /**
     * <p>
     * Valid Amazon Resource Name (ARN) of the Lambda function. The function must be created in the same AWS Region as
     * the SIP media application.
     * </p>
     * 
     * @return Valid Amazon Resource Name (ARN) of the Lambda function. The function must be created in the same AWS
     *         Region as the SIP media application.
     */

    public String getLambdaArn() {
        return this.lambdaArn;
    }

    /**
     * <p>
     * Valid Amazon Resource Name (ARN) of the Lambda function. The function must be created in the same AWS Region as
     * the SIP media application.
     * </p>
     * 
     * @param lambdaArn
     *        Valid Amazon Resource Name (ARN) of the Lambda function. The function must be created in the same AWS
     *        Region as the SIP media application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SipMediaApplicationEndpoint withLambdaArn(String lambdaArn) {
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
            sb.append("LambdaArn: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SipMediaApplicationEndpoint == false)
            return false;
        SipMediaApplicationEndpoint other = (SipMediaApplicationEndpoint) obj;
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
    public SipMediaApplicationEndpoint clone() {
        try {
            return (SipMediaApplicationEndpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.SipMediaApplicationEndpointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
