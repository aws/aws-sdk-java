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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The <a href="https://docs.aws.amazon.com/lambda/latest/dg/dlq.html">dead letter queue</a> for failed asynchronous
 * invocations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeadLetterConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeadLetterConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon SQS queue or Amazon SNS topic.
     * </p>
     */
    private String targetArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon SQS queue or Amazon SNS topic.
     * </p>
     * 
     * @param targetArn
     *        The Amazon Resource Name (ARN) of an Amazon SQS queue or Amazon SNS topic.
     */

    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon SQS queue or Amazon SNS topic.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an Amazon SQS queue or Amazon SNS topic.
     */

    public String getTargetArn() {
        return this.targetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an Amazon SQS queue or Amazon SNS topic.
     * </p>
     * 
     * @param targetArn
     *        The Amazon Resource Name (ARN) of an Amazon SQS queue or Amazon SNS topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeadLetterConfig withTargetArn(String targetArn) {
        setTargetArn(targetArn);
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
        if (getTargetArn() != null)
            sb.append("TargetArn: ").append(getTargetArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeadLetterConfig == false)
            return false;
        DeadLetterConfig other = (DeadLetterConfig) obj;
        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        return hashCode;
    }

    @Override
    public DeadLetterConfig clone() {
        try {
            return (DeadLetterConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lambda.model.transform.DeadLetterConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
