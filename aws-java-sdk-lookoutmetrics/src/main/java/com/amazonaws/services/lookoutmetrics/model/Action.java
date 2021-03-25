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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A configuration that specifies the action to perform when anomalies are detected.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/Action" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Action implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A configuration for an Amazon SNS channel.
     * </p>
     */
    private SNSConfiguration sNSConfiguration;
    /**
     * <p>
     * A configuration for an AWS Lambda channel.
     * </p>
     */
    private LambdaConfiguration lambdaConfiguration;

    /**
     * <p>
     * A configuration for an Amazon SNS channel.
     * </p>
     * 
     * @param sNSConfiguration
     *        A configuration for an Amazon SNS channel.
     */

    public void setSNSConfiguration(SNSConfiguration sNSConfiguration) {
        this.sNSConfiguration = sNSConfiguration;
    }

    /**
     * <p>
     * A configuration for an Amazon SNS channel.
     * </p>
     * 
     * @return A configuration for an Amazon SNS channel.
     */

    public SNSConfiguration getSNSConfiguration() {
        return this.sNSConfiguration;
    }

    /**
     * <p>
     * A configuration for an Amazon SNS channel.
     * </p>
     * 
     * @param sNSConfiguration
     *        A configuration for an Amazon SNS channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withSNSConfiguration(SNSConfiguration sNSConfiguration) {
        setSNSConfiguration(sNSConfiguration);
        return this;
    }

    /**
     * <p>
     * A configuration for an AWS Lambda channel.
     * </p>
     * 
     * @param lambdaConfiguration
     *        A configuration for an AWS Lambda channel.
     */

    public void setLambdaConfiguration(LambdaConfiguration lambdaConfiguration) {
        this.lambdaConfiguration = lambdaConfiguration;
    }

    /**
     * <p>
     * A configuration for an AWS Lambda channel.
     * </p>
     * 
     * @return A configuration for an AWS Lambda channel.
     */

    public LambdaConfiguration getLambdaConfiguration() {
        return this.lambdaConfiguration;
    }

    /**
     * <p>
     * A configuration for an AWS Lambda channel.
     * </p>
     * 
     * @param lambdaConfiguration
     *        A configuration for an AWS Lambda channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withLambdaConfiguration(LambdaConfiguration lambdaConfiguration) {
        setLambdaConfiguration(lambdaConfiguration);
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
        if (getSNSConfiguration() != null)
            sb.append("SNSConfiguration: ").append(getSNSConfiguration()).append(",");
        if (getLambdaConfiguration() != null)
            sb.append("LambdaConfiguration: ").append(getLambdaConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Action == false)
            return false;
        Action other = (Action) obj;
        if (other.getSNSConfiguration() == null ^ this.getSNSConfiguration() == null)
            return false;
        if (other.getSNSConfiguration() != null && other.getSNSConfiguration().equals(this.getSNSConfiguration()) == false)
            return false;
        if (other.getLambdaConfiguration() == null ^ this.getLambdaConfiguration() == null)
            return false;
        if (other.getLambdaConfiguration() != null && other.getLambdaConfiguration().equals(this.getLambdaConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSNSConfiguration() == null) ? 0 : getSNSConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLambdaConfiguration() == null) ? 0 : getLambdaConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public Action clone() {
        try {
            return (Action) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.ActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
