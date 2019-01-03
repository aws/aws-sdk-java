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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/RegisterCrossAccountAccessRole"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterCrossAccountAccessRoleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the IAM role that grants Amazon Inspector access to AWS Services needed to perform security
     * assessments.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The ARN of the IAM role that grants Amazon Inspector access to AWS Services needed to perform security
     * assessments.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that grants Amazon Inspector access to AWS Services needed to perform security
     *        assessments.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that grants Amazon Inspector access to AWS Services needed to perform security
     * assessments.
     * </p>
     * 
     * @return The ARN of the IAM role that grants Amazon Inspector access to AWS Services needed to perform security
     *         assessments.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that grants Amazon Inspector access to AWS Services needed to perform security
     * assessments.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that grants Amazon Inspector access to AWS Services needed to perform security
     *        assessments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterCrossAccountAccessRoleRequest withRoleArn(String roleArn) {
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

        if (obj instanceof RegisterCrossAccountAccessRoleRequest == false)
            return false;
        RegisterCrossAccountAccessRoleRequest other = (RegisterCrossAccountAccessRoleRequest) obj;
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
    public RegisterCrossAccountAccessRoleRequest clone() {
        return (RegisterCrossAccountAccessRoleRequest) super.clone();
    }

}
