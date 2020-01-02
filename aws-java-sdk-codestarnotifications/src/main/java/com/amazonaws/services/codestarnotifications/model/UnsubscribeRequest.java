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
package com.amazonaws.services.codestarnotifications.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/Unsubscribe" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnsubscribeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the notification rule.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The ARN of the SNS topic to unsubscribe from the notification rule.
     * </p>
     */
    private String targetAddress;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the notification rule.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the notification rule.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the notification rule.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the notification rule.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the notification rule.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the notification rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnsubscribeRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The ARN of the SNS topic to unsubscribe from the notification rule.
     * </p>
     * 
     * @param targetAddress
     *        The ARN of the SNS topic to unsubscribe from the notification rule.
     */

    public void setTargetAddress(String targetAddress) {
        this.targetAddress = targetAddress;
    }

    /**
     * <p>
     * The ARN of the SNS topic to unsubscribe from the notification rule.
     * </p>
     * 
     * @return The ARN of the SNS topic to unsubscribe from the notification rule.
     */

    public String getTargetAddress() {
        return this.targetAddress;
    }

    /**
     * <p>
     * The ARN of the SNS topic to unsubscribe from the notification rule.
     * </p>
     * 
     * @param targetAddress
     *        The ARN of the SNS topic to unsubscribe from the notification rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnsubscribeRequest withTargetAddress(String targetAddress) {
        setTargetAddress(targetAddress);
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
        if (getTargetAddress() != null)
            sb.append("TargetAddress: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnsubscribeRequest == false)
            return false;
        UnsubscribeRequest other = (UnsubscribeRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getTargetAddress() == null ^ this.getTargetAddress() == null)
            return false;
        if (other.getTargetAddress() != null && other.getTargetAddress().equals(this.getTargetAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getTargetAddress() == null) ? 0 : getTargetAddress().hashCode());
        return hashCode;
    }

    @Override
    public UnsubscribeRequest clone() {
        return (UnsubscribeRequest) super.clone();
    }

}
