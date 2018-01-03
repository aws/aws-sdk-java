/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

    /** Role arn you wish to associate with this account. */
    private String roleArn;

    /**
     * Role arn you wish to associate with this account.
     * 
     * @param roleArn
     *        Role arn you wish to associate with this account.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * Role arn you wish to associate with this account.
     * 
     * @return Role arn you wish to associate with this account.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * Role arn you wish to associate with this account.
     * 
     * @param roleArn
     *        Role arn you wish to associate with this account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateServiceRoleToAccountRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
