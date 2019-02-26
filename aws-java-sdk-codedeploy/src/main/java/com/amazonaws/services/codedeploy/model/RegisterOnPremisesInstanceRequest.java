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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of the register on-premises instance operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/RegisterOnPremisesInstance"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterOnPremisesInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the on-premises instance to register.
     * </p>
     */
    private String instanceName;
    /**
     * <p>
     * The ARN of the IAM session to associate with the on-premises instance.
     * </p>
     */
    private String iamSessionArn;
    /**
     * <p>
     * The ARN of the IAM user to associate with the on-premises instance.
     * </p>
     */
    private String iamUserArn;

    /**
     * <p>
     * The name of the on-premises instance to register.
     * </p>
     * 
     * @param instanceName
     *        The name of the on-premises instance to register.
     */

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * <p>
     * The name of the on-premises instance to register.
     * </p>
     * 
     * @return The name of the on-premises instance to register.
     */

    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * <p>
     * The name of the on-premises instance to register.
     * </p>
     * 
     * @param instanceName
     *        The name of the on-premises instance to register.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterOnPremisesInstanceRequest withInstanceName(String instanceName) {
        setInstanceName(instanceName);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM session to associate with the on-premises instance.
     * </p>
     * 
     * @param iamSessionArn
     *        The ARN of the IAM session to associate with the on-premises instance.
     */

    public void setIamSessionArn(String iamSessionArn) {
        this.iamSessionArn = iamSessionArn;
    }

    /**
     * <p>
     * The ARN of the IAM session to associate with the on-premises instance.
     * </p>
     * 
     * @return The ARN of the IAM session to associate with the on-premises instance.
     */

    public String getIamSessionArn() {
        return this.iamSessionArn;
    }

    /**
     * <p>
     * The ARN of the IAM session to associate with the on-premises instance.
     * </p>
     * 
     * @param iamSessionArn
     *        The ARN of the IAM session to associate with the on-premises instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterOnPremisesInstanceRequest withIamSessionArn(String iamSessionArn) {
        setIamSessionArn(iamSessionArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM user to associate with the on-premises instance.
     * </p>
     * 
     * @param iamUserArn
     *        The ARN of the IAM user to associate with the on-premises instance.
     */

    public void setIamUserArn(String iamUserArn) {
        this.iamUserArn = iamUserArn;
    }

    /**
     * <p>
     * The ARN of the IAM user to associate with the on-premises instance.
     * </p>
     * 
     * @return The ARN of the IAM user to associate with the on-premises instance.
     */

    public String getIamUserArn() {
        return this.iamUserArn;
    }

    /**
     * <p>
     * The ARN of the IAM user to associate with the on-premises instance.
     * </p>
     * 
     * @param iamUserArn
     *        The ARN of the IAM user to associate with the on-premises instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterOnPremisesInstanceRequest withIamUserArn(String iamUserArn) {
        setIamUserArn(iamUserArn);
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
        if (getInstanceName() != null)
            sb.append("InstanceName: ").append(getInstanceName()).append(",");
        if (getIamSessionArn() != null)
            sb.append("IamSessionArn: ").append(getIamSessionArn()).append(",");
        if (getIamUserArn() != null)
            sb.append("IamUserArn: ").append(getIamUserArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterOnPremisesInstanceRequest == false)
            return false;
        RegisterOnPremisesInstanceRequest other = (RegisterOnPremisesInstanceRequest) obj;
        if (other.getInstanceName() == null ^ this.getInstanceName() == null)
            return false;
        if (other.getInstanceName() != null && other.getInstanceName().equals(this.getInstanceName()) == false)
            return false;
        if (other.getIamSessionArn() == null ^ this.getIamSessionArn() == null)
            return false;
        if (other.getIamSessionArn() != null && other.getIamSessionArn().equals(this.getIamSessionArn()) == false)
            return false;
        if (other.getIamUserArn() == null ^ this.getIamUserArn() == null)
            return false;
        if (other.getIamUserArn() != null && other.getIamUserArn().equals(this.getIamUserArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceName() == null) ? 0 : getInstanceName().hashCode());
        hashCode = prime * hashCode + ((getIamSessionArn() == null) ? 0 : getIamSessionArn().hashCode());
        hashCode = prime * hashCode + ((getIamUserArn() == null) ? 0 : getIamUserArn().hashCode());
        return hashCode;
    }

    @Override
    public RegisterOnPremisesInstanceRequest clone() {
        return (RegisterOnPremisesInstanceRequest) super.clone();
    }

}
