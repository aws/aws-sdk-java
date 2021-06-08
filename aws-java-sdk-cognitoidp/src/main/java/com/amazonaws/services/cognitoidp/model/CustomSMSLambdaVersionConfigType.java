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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A custom SMS sender Lambda configuration type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CustomSMSLambdaVersionConfigType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomSMSLambdaVersionConfigType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Lambda version represents the signature of the "request" attribute in the "event" information Amazon Cognito
     * passes to your custom SMS Lambda function. The only supported value is <code>V1_0</code>.
     * </p>
     */
    private String lambdaVersion;
    /**
     * <p>
     * The Lambda Amazon Resource Name of the Lambda function that Amazon Cognito triggers to send SMS notifications to
     * users.
     * </p>
     */
    private String lambdaArn;

    /**
     * <p>
     * The Lambda version represents the signature of the "request" attribute in the "event" information Amazon Cognito
     * passes to your custom SMS Lambda function. The only supported value is <code>V1_0</code>.
     * </p>
     * 
     * @param lambdaVersion
     *        The Lambda version represents the signature of the "request" attribute in the "event" information Amazon
     *        Cognito passes to your custom SMS Lambda function. The only supported value is <code>V1_0</code>.
     * @see CustomSMSSenderLambdaVersionType
     */

    public void setLambdaVersion(String lambdaVersion) {
        this.lambdaVersion = lambdaVersion;
    }

    /**
     * <p>
     * The Lambda version represents the signature of the "request" attribute in the "event" information Amazon Cognito
     * passes to your custom SMS Lambda function. The only supported value is <code>V1_0</code>.
     * </p>
     * 
     * @return The Lambda version represents the signature of the "request" attribute in the "event" information Amazon
     *         Cognito passes to your custom SMS Lambda function. The only supported value is <code>V1_0</code>.
     * @see CustomSMSSenderLambdaVersionType
     */

    public String getLambdaVersion() {
        return this.lambdaVersion;
    }

    /**
     * <p>
     * The Lambda version represents the signature of the "request" attribute in the "event" information Amazon Cognito
     * passes to your custom SMS Lambda function. The only supported value is <code>V1_0</code>.
     * </p>
     * 
     * @param lambdaVersion
     *        The Lambda version represents the signature of the "request" attribute in the "event" information Amazon
     *        Cognito passes to your custom SMS Lambda function. The only supported value is <code>V1_0</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomSMSSenderLambdaVersionType
     */

    public CustomSMSLambdaVersionConfigType withLambdaVersion(String lambdaVersion) {
        setLambdaVersion(lambdaVersion);
        return this;
    }

    /**
     * <p>
     * The Lambda version represents the signature of the "request" attribute in the "event" information Amazon Cognito
     * passes to your custom SMS Lambda function. The only supported value is <code>V1_0</code>.
     * </p>
     * 
     * @param lambdaVersion
     *        The Lambda version represents the signature of the "request" attribute in the "event" information Amazon
     *        Cognito passes to your custom SMS Lambda function. The only supported value is <code>V1_0</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomSMSSenderLambdaVersionType
     */

    public CustomSMSLambdaVersionConfigType withLambdaVersion(CustomSMSSenderLambdaVersionType lambdaVersion) {
        this.lambdaVersion = lambdaVersion.toString();
        return this;
    }

    /**
     * <p>
     * The Lambda Amazon Resource Name of the Lambda function that Amazon Cognito triggers to send SMS notifications to
     * users.
     * </p>
     * 
     * @param lambdaArn
     *        The Lambda Amazon Resource Name of the Lambda function that Amazon Cognito triggers to send SMS
     *        notifications to users.
     */

    public void setLambdaArn(String lambdaArn) {
        this.lambdaArn = lambdaArn;
    }

    /**
     * <p>
     * The Lambda Amazon Resource Name of the Lambda function that Amazon Cognito triggers to send SMS notifications to
     * users.
     * </p>
     * 
     * @return The Lambda Amazon Resource Name of the Lambda function that Amazon Cognito triggers to send SMS
     *         notifications to users.
     */

    public String getLambdaArn() {
        return this.lambdaArn;
    }

    /**
     * <p>
     * The Lambda Amazon Resource Name of the Lambda function that Amazon Cognito triggers to send SMS notifications to
     * users.
     * </p>
     * 
     * @param lambdaArn
     *        The Lambda Amazon Resource Name of the Lambda function that Amazon Cognito triggers to send SMS
     *        notifications to users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomSMSLambdaVersionConfigType withLambdaArn(String lambdaArn) {
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
        if (getLambdaVersion() != null)
            sb.append("LambdaVersion: ").append(getLambdaVersion()).append(",");
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

        if (obj instanceof CustomSMSLambdaVersionConfigType == false)
            return false;
        CustomSMSLambdaVersionConfigType other = (CustomSMSLambdaVersionConfigType) obj;
        if (other.getLambdaVersion() == null ^ this.getLambdaVersion() == null)
            return false;
        if (other.getLambdaVersion() != null && other.getLambdaVersion().equals(this.getLambdaVersion()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getLambdaVersion() == null) ? 0 : getLambdaVersion().hashCode());
        hashCode = prime * hashCode + ((getLambdaArn() == null) ? 0 : getLambdaArn().hashCode());
        return hashCode;
    }

    @Override
    public CustomSMSLambdaVersionConfigType clone() {
        try {
            return (CustomSMSLambdaVersionConfigType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.CustomSMSLambdaVersionConfigTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
