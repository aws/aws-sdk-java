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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/CreateVpcConnector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVpcConnectorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A description of the App Runner VPC connector that's created by this request.
     * </p>
     */
    private VpcConnector vpcConnector;

    /**
     * <p>
     * A description of the App Runner VPC connector that's created by this request.
     * </p>
     * 
     * @param vpcConnector
     *        A description of the App Runner VPC connector that's created by this request.
     */

    public void setVpcConnector(VpcConnector vpcConnector) {
        this.vpcConnector = vpcConnector;
    }

    /**
     * <p>
     * A description of the App Runner VPC connector that's created by this request.
     * </p>
     * 
     * @return A description of the App Runner VPC connector that's created by this request.
     */

    public VpcConnector getVpcConnector() {
        return this.vpcConnector;
    }

    /**
     * <p>
     * A description of the App Runner VPC connector that's created by this request.
     * </p>
     * 
     * @param vpcConnector
     *        A description of the App Runner VPC connector that's created by this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcConnectorResult withVpcConnector(VpcConnector vpcConnector) {
        setVpcConnector(vpcConnector);
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
        if (getVpcConnector() != null)
            sb.append("VpcConnector: ").append(getVpcConnector());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVpcConnectorResult == false)
            return false;
        CreateVpcConnectorResult other = (CreateVpcConnectorResult) obj;
        if (other.getVpcConnector() == null ^ this.getVpcConnector() == null)
            return false;
        if (other.getVpcConnector() != null && other.getVpcConnector().equals(this.getVpcConnector()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcConnector() == null) ? 0 : getVpcConnector().hashCode());
        return hashCode;
    }

    @Override
    public CreateVpcConnectorResult clone() {
        try {
            return (CreateVpcConnectorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
