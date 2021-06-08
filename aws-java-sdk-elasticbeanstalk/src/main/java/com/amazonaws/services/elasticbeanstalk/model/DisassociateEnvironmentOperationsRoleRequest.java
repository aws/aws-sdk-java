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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request to disassociate the operations role from an environment.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DisassociateEnvironmentOperationsRole"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateEnvironmentOperationsRoleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the environment from which to disassociate the operations role.
     * </p>
     */
    private String environmentName;

    /**
     * <p>
     * The name of the environment from which to disassociate the operations role.
     * </p>
     * 
     * @param environmentName
     *        The name of the environment from which to disassociate the operations role.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the environment from which to disassociate the operations role.
     * </p>
     * 
     * @return The name of the environment from which to disassociate the operations role.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The name of the environment from which to disassociate the operations role.
     * </p>
     * 
     * @param environmentName
     *        The name of the environment from which to disassociate the operations role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateEnvironmentOperationsRoleRequest withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
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
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateEnvironmentOperationsRoleRequest == false)
            return false;
        DisassociateEnvironmentOperationsRoleRequest other = (DisassociateEnvironmentOperationsRoleRequest) obj;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateEnvironmentOperationsRoleRequest clone() {
        return (DisassociateEnvironmentOperationsRoleRequest) super.clone();
    }

}
