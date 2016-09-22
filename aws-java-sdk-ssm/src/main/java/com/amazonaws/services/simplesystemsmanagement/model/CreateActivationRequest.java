/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class CreateActivationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A user-defined description of the resource that you want to register with Amazon EC2.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the registered, managed instance as it will appear in the Amazon EC2 console or when you use the AWS
     * command line tools to list EC2 resources.
     * </p>
     */
    private String defaultInstanceName;
    /**
     * <p>
     * The Amazon Identity and Access Management (IAM) role that you want to assign to the managed instance.
     * </p>
     */
    private String iamRole;
    /**
     * <p>
     * Specify the maximum number of managed instances you want to register. The default value is 1 instance.
     * </p>
     */
    private Integer registrationLimit;
    /**
     * <p>
     * The date by which this activation request should expire. The default value is 24 hours.
     * </p>
     */
    private java.util.Date expirationDate;

    /**
     * <p>
     * A user-defined description of the resource that you want to register with Amazon EC2.
     * </p>
     * 
     * @param description
     *        A user-defined description of the resource that you want to register with Amazon EC2.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A user-defined description of the resource that you want to register with Amazon EC2.
     * </p>
     * 
     * @return A user-defined description of the resource that you want to register with Amazon EC2.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A user-defined description of the resource that you want to register with Amazon EC2.
     * </p>
     * 
     * @param description
     *        A user-defined description of the resource that you want to register with Amazon EC2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateActivationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the registered, managed instance as it will appear in the Amazon EC2 console or when you use the AWS
     * command line tools to list EC2 resources.
     * </p>
     * 
     * @param defaultInstanceName
     *        The name of the registered, managed instance as it will appear in the Amazon EC2 console or when you use
     *        the AWS command line tools to list EC2 resources.
     */

    public void setDefaultInstanceName(String defaultInstanceName) {
        this.defaultInstanceName = defaultInstanceName;
    }

    /**
     * <p>
     * The name of the registered, managed instance as it will appear in the Amazon EC2 console or when you use the AWS
     * command line tools to list EC2 resources.
     * </p>
     * 
     * @return The name of the registered, managed instance as it will appear in the Amazon EC2 console or when you use
     *         the AWS command line tools to list EC2 resources.
     */

    public String getDefaultInstanceName() {
        return this.defaultInstanceName;
    }

    /**
     * <p>
     * The name of the registered, managed instance as it will appear in the Amazon EC2 console or when you use the AWS
     * command line tools to list EC2 resources.
     * </p>
     * 
     * @param defaultInstanceName
     *        The name of the registered, managed instance as it will appear in the Amazon EC2 console or when you use
     *        the AWS command line tools to list EC2 resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateActivationRequest withDefaultInstanceName(String defaultInstanceName) {
        setDefaultInstanceName(defaultInstanceName);
        return this;
    }

    /**
     * <p>
     * The Amazon Identity and Access Management (IAM) role that you want to assign to the managed instance.
     * </p>
     * 
     * @param iamRole
     *        The Amazon Identity and Access Management (IAM) role that you want to assign to the managed instance.
     */

    public void setIamRole(String iamRole) {
        this.iamRole = iamRole;
    }

    /**
     * <p>
     * The Amazon Identity and Access Management (IAM) role that you want to assign to the managed instance.
     * </p>
     * 
     * @return The Amazon Identity and Access Management (IAM) role that you want to assign to the managed instance.
     */

    public String getIamRole() {
        return this.iamRole;
    }

    /**
     * <p>
     * The Amazon Identity and Access Management (IAM) role that you want to assign to the managed instance.
     * </p>
     * 
     * @param iamRole
     *        The Amazon Identity and Access Management (IAM) role that you want to assign to the managed instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateActivationRequest withIamRole(String iamRole) {
        setIamRole(iamRole);
        return this;
    }

    /**
     * <p>
     * Specify the maximum number of managed instances you want to register. The default value is 1 instance.
     * </p>
     * 
     * @param registrationLimit
     *        Specify the maximum number of managed instances you want to register. The default value is 1 instance.
     */

    public void setRegistrationLimit(Integer registrationLimit) {
        this.registrationLimit = registrationLimit;
    }

    /**
     * <p>
     * Specify the maximum number of managed instances you want to register. The default value is 1 instance.
     * </p>
     * 
     * @return Specify the maximum number of managed instances you want to register. The default value is 1 instance.
     */

    public Integer getRegistrationLimit() {
        return this.registrationLimit;
    }

    /**
     * <p>
     * Specify the maximum number of managed instances you want to register. The default value is 1 instance.
     * </p>
     * 
     * @param registrationLimit
     *        Specify the maximum number of managed instances you want to register. The default value is 1 instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateActivationRequest withRegistrationLimit(Integer registrationLimit) {
        setRegistrationLimit(registrationLimit);
        return this;
    }

    /**
     * <p>
     * The date by which this activation request should expire. The default value is 24 hours.
     * </p>
     * 
     * @param expirationDate
     *        The date by which this activation request should expire. The default value is 24 hours.
     */

    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * <p>
     * The date by which this activation request should expire. The default value is 24 hours.
     * </p>
     * 
     * @return The date by which this activation request should expire. The default value is 24 hours.
     */

    public java.util.Date getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * <p>
     * The date by which this activation request should expire. The default value is 24 hours.
     * </p>
     * 
     * @param expirationDate
     *        The date by which this activation request should expire. The default value is 24 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateActivationRequest withExpirationDate(java.util.Date expirationDate) {
        setExpirationDate(expirationDate);
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
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDefaultInstanceName() != null)
            sb.append("DefaultInstanceName: " + getDefaultInstanceName() + ",");
        if (getIamRole() != null)
            sb.append("IamRole: " + getIamRole() + ",");
        if (getRegistrationLimit() != null)
            sb.append("RegistrationLimit: " + getRegistrationLimit() + ",");
        if (getExpirationDate() != null)
            sb.append("ExpirationDate: " + getExpirationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateActivationRequest == false)
            return false;
        CreateActivationRequest other = (CreateActivationRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDefaultInstanceName() == null ^ this.getDefaultInstanceName() == null)
            return false;
        if (other.getDefaultInstanceName() != null && other.getDefaultInstanceName().equals(this.getDefaultInstanceName()) == false)
            return false;
        if (other.getIamRole() == null ^ this.getIamRole() == null)
            return false;
        if (other.getIamRole() != null && other.getIamRole().equals(this.getIamRole()) == false)
            return false;
        if (other.getRegistrationLimit() == null ^ this.getRegistrationLimit() == null)
            return false;
        if (other.getRegistrationLimit() != null && other.getRegistrationLimit().equals(this.getRegistrationLimit()) == false)
            return false;
        if (other.getExpirationDate() == null ^ this.getExpirationDate() == null)
            return false;
        if (other.getExpirationDate() != null && other.getExpirationDate().equals(this.getExpirationDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDefaultInstanceName() == null) ? 0 : getDefaultInstanceName().hashCode());
        hashCode = prime * hashCode + ((getIamRole() == null) ? 0 : getIamRole().hashCode());
        hashCode = prime * hashCode + ((getRegistrationLimit() == null) ? 0 : getRegistrationLimit().hashCode());
        hashCode = prime * hashCode + ((getExpirationDate() == null) ? 0 : getExpirationDate().hashCode());
        return hashCode;
    }

    @Override
    public CreateActivationRequest clone() {
        return (CreateActivationRequest) super.clone();
    }
}
