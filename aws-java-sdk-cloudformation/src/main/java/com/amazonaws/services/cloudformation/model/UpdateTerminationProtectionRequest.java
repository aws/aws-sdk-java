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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/UpdateTerminationProtection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTerminationProtectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Whether to enable termination protection on the specified stack.
     * </p>
     */
    private Boolean enableTerminationProtection;
    /**
     * <p>
     * The name or unique ID of the stack for which you want to set termination protection.
     * </p>
     */
    private String stackName;

    /**
     * <p>
     * Whether to enable termination protection on the specified stack.
     * </p>
     * 
     * @param enableTerminationProtection
     *        Whether to enable termination protection on the specified stack.
     */

    public void setEnableTerminationProtection(Boolean enableTerminationProtection) {
        this.enableTerminationProtection = enableTerminationProtection;
    }

    /**
     * <p>
     * Whether to enable termination protection on the specified stack.
     * </p>
     * 
     * @return Whether to enable termination protection on the specified stack.
     */

    public Boolean getEnableTerminationProtection() {
        return this.enableTerminationProtection;
    }

    /**
     * <p>
     * Whether to enable termination protection on the specified stack.
     * </p>
     * 
     * @param enableTerminationProtection
     *        Whether to enable termination protection on the specified stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTerminationProtectionRequest withEnableTerminationProtection(Boolean enableTerminationProtection) {
        setEnableTerminationProtection(enableTerminationProtection);
        return this;
    }

    /**
     * <p>
     * Whether to enable termination protection on the specified stack.
     * </p>
     * 
     * @return Whether to enable termination protection on the specified stack.
     */

    public Boolean isEnableTerminationProtection() {
        return this.enableTerminationProtection;
    }

    /**
     * <p>
     * The name or unique ID of the stack for which you want to set termination protection.
     * </p>
     * 
     * @param stackName
     *        The name or unique ID of the stack for which you want to set termination protection.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name or unique ID of the stack for which you want to set termination protection.
     * </p>
     * 
     * @return The name or unique ID of the stack for which you want to set termination protection.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * The name or unique ID of the stack for which you want to set termination protection.
     * </p>
     * 
     * @param stackName
     *        The name or unique ID of the stack for which you want to set termination protection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTerminationProtectionRequest withStackName(String stackName) {
        setStackName(stackName);
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
        if (getEnableTerminationProtection() != null)
            sb.append("EnableTerminationProtection: ").append(getEnableTerminationProtection()).append(",");
        if (getStackName() != null)
            sb.append("StackName: ").append(getStackName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTerminationProtectionRequest == false)
            return false;
        UpdateTerminationProtectionRequest other = (UpdateTerminationProtectionRequest) obj;
        if (other.getEnableTerminationProtection() == null ^ this.getEnableTerminationProtection() == null)
            return false;
        if (other.getEnableTerminationProtection() != null && other.getEnableTerminationProtection().equals(this.getEnableTerminationProtection()) == false)
            return false;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnableTerminationProtection() == null) ? 0 : getEnableTerminationProtection().hashCode());
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTerminationProtectionRequest clone() {
        return (UpdateTerminationProtectionRequest) super.clone();
    }

}
