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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/DescribeVpcConnector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVpcConnectorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner VPC connector that you want a description for.
     * </p>
     * <p>
     * The ARN must be a full VPC connector ARN.
     * </p>
     */
    private String vpcConnectorArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner VPC connector that you want a description for.
     * </p>
     * <p>
     * The ARN must be a full VPC connector ARN.
     * </p>
     * 
     * @param vpcConnectorArn
     *        The Amazon Resource Name (ARN) of the App Runner VPC connector that you want a description for.</p>
     *        <p>
     *        The ARN must be a full VPC connector ARN.
     */

    public void setVpcConnectorArn(String vpcConnectorArn) {
        this.vpcConnectorArn = vpcConnectorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner VPC connector that you want a description for.
     * </p>
     * <p>
     * The ARN must be a full VPC connector ARN.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the App Runner VPC connector that you want a description for.</p>
     *         <p>
     *         The ARN must be a full VPC connector ARN.
     */

    public String getVpcConnectorArn() {
        return this.vpcConnectorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the App Runner VPC connector that you want a description for.
     * </p>
     * <p>
     * The ARN must be a full VPC connector ARN.
     * </p>
     * 
     * @param vpcConnectorArn
     *        The Amazon Resource Name (ARN) of the App Runner VPC connector that you want a description for.</p>
     *        <p>
     *        The ARN must be a full VPC connector ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcConnectorRequest withVpcConnectorArn(String vpcConnectorArn) {
        setVpcConnectorArn(vpcConnectorArn);
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
        if (getVpcConnectorArn() != null)
            sb.append("VpcConnectorArn: ").append(getVpcConnectorArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVpcConnectorRequest == false)
            return false;
        DescribeVpcConnectorRequest other = (DescribeVpcConnectorRequest) obj;
        if (other.getVpcConnectorArn() == null ^ this.getVpcConnectorArn() == null)
            return false;
        if (other.getVpcConnectorArn() != null && other.getVpcConnectorArn().equals(this.getVpcConnectorArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcConnectorArn() == null) ? 0 : getVpcConnectorArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVpcConnectorRequest clone() {
        return (DescribeVpcConnectorRequest) super.clone();
    }

}
