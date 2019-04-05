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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/AssociateServiceRoleToAccount"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateServiceRoleToAccountRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The ARN of the service role you wish to associate with your account. */
    private String roleArn;

    /**
     * The ARN of the service role you wish to associate with your account.
     * 
     * @param roleArn
     *        The ARN of the service role you wish to associate with your account.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * The ARN of the service role you wish to associate with your account.
     * 
     * @return The ARN of the service role you wish to associate with your account.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * The ARN of the service role you wish to associate with your account.
     * 
     * @param roleArn
     *        The ARN of the service role you wish to associate with your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateServiceRoleToAccountRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateServiceRoleToAccountRequest == false)
            return false;
        AssociateServiceRoleToAccountRequest other = (AssociateServiceRoleToAccountRequest) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public AssociateServiceRoleToAccountRequest clone() {
        return (AssociateServiceRoleToAccountRequest) super.clone();
    }

}
