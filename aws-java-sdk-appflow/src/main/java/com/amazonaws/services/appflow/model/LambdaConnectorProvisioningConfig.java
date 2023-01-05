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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the configuration of the lambda which is being registered as the connector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/LambdaConnectorProvisioningConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaConnectorProvisioningConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Lambda ARN of the connector being registered.
     * </p>
     */
    private String lambdaArn;

    /**
     * <p>
     * Lambda ARN of the connector being registered.
     * </p>
     * 
     * @param lambdaArn
     *        Lambda ARN of the connector being registered.
     */

    public void setLambdaArn(String lambdaArn) {
        this.lambdaArn = lambdaArn;
    }

    /**
     * <p>
     * Lambda ARN of the connector being registered.
     * </p>
     * 
     * @return Lambda ARN of the connector being registered.
     */

    public String getLambdaArn() {
        return this.lambdaArn;
    }

    /**
     * <p>
     * Lambda ARN of the connector being registered.
     * </p>
     * 
     * @param lambdaArn
     *        Lambda ARN of the connector being registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LambdaConnectorProvisioningConfig withLambdaArn(String lambdaArn) {
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

        if (obj instanceof LambdaConnectorProvisioningConfig == false)
            return false;
        LambdaConnectorProvisioningConfig other = (LambdaConnectorProvisioningConfig) obj;
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
    public LambdaConnectorProvisioningConfig clone() {
        try {
            return (LambdaConnectorProvisioningConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.LambdaConnectorProvisioningConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
