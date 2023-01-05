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
package com.amazonaws.services.chimesdkmessaging.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Stores metadata about a Lambda processor.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/LambdaConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the Lambda message processing function.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * Controls how the Lambda function is invoked.
     * </p>
     */
    private String invocationType;

    /**
     * <p>
     * The ARN of the Lambda message processing function.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the Lambda message processing function.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of the Lambda message processing function.
     * </p>
     * 
     * @return The ARN of the Lambda message processing function.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARN of the Lambda message processing function.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the Lambda message processing function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaConfiguration withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * Controls how the Lambda function is invoked.
     * </p>
     * 
     * @param invocationType
     *        Controls how the Lambda function is invoked.
     * @see InvocationType
     */

    public void setInvocationType(String invocationType) {
        this.invocationType = invocationType;
    }

    /**
     * <p>
     * Controls how the Lambda function is invoked.
     * </p>
     * 
     * @return Controls how the Lambda function is invoked.
     * @see InvocationType
     */

    public String getInvocationType() {
        return this.invocationType;
    }

    /**
     * <p>
     * Controls how the Lambda function is invoked.
     * </p>
     * 
     * @param invocationType
     *        Controls how the Lambda function is invoked.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InvocationType
     */

    public LambdaConfiguration withInvocationType(String invocationType) {
        setInvocationType(invocationType);
        return this;
    }

    /**
     * <p>
     * Controls how the Lambda function is invoked.
     * </p>
     * 
     * @param invocationType
     *        Controls how the Lambda function is invoked.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InvocationType
     */

    public LambdaConfiguration withInvocationType(InvocationType invocationType) {
        this.invocationType = invocationType.toString();
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getInvocationType() != null)
            sb.append("InvocationType: ").append(getInvocationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaConfiguration == false)
            return false;
        LambdaConfiguration other = (LambdaConfiguration) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getInvocationType() == null ^ this.getInvocationType() == null)
            return false;
        if (other.getInvocationType() != null && other.getInvocationType().equals(this.getInvocationType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getInvocationType() == null) ? 0 : getInvocationType().hashCode());
        return hashCode;
    }

    @Override
    public LambdaConfiguration clone() {
        try {
            return (LambdaConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmessaging.model.transform.LambdaConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
