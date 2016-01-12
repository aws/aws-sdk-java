/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class RegisterCrossAccountAccessRoleRequest extends
        AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The ARN of the IAM role that Inspector uses to list your EC2 instances
     * during the assessment.
     */
    private String roleArn;

    /**
     * The ARN of the IAM role that Inspector uses to list your EC2 instances
     * during the assessment.
     * 
     * @param roleArn
     *        The ARN of the IAM role that Inspector uses to list your EC2
     *        instances during the assessment.
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * The ARN of the IAM role that Inspector uses to list your EC2 instances
     * during the assessment.
     * 
     * @return The ARN of the IAM role that Inspector uses to list your EC2
     *         instances during the assessment.
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * The ARN of the IAM role that Inspector uses to list your EC2 instances
     * during the assessment.
     * 
     * @param roleArn
     *        The ARN of the IAM role that Inspector uses to list your EC2
     *        instances during the assessment.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public RegisterCrossAccountAccessRoleRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
            sb.append("RoleArn: " + getRoleArn());
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
        if (other.getRoleArn() != null
                && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public RegisterCrossAccountAccessRoleRequest clone() {
        return (RegisterCrossAccountAccessRoleRequest) super.clone();
    }
}