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
public class CreateApplicationRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The user-defined name identifying the application that you want to
     * create. The name must be unique within the AWS account.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The ARN specifying the resource group that is used to create the
     * application.
     * </p>
     */
    private String resourceGroupArn;

    /**
     * <p>
     * The user-defined name identifying the application that you want to
     * create. The name must be unique within the AWS account.
     * </p>
     * 
     * @param applicationName
     *        The user-defined name identifying the application that you want to
     *        create. The name must be unique within the AWS account.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The user-defined name identifying the application that you want to
     * create. The name must be unique within the AWS account.
     * </p>
     * 
     * @return The user-defined name identifying the application that you want
     *         to create. The name must be unique within the AWS account.
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The user-defined name identifying the application that you want to
     * create. The name must be unique within the AWS account.
     * </p>
     * 
     * @param applicationName
     *        The user-defined name identifying the application that you want to
     *        create. The name must be unique within the AWS account.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateApplicationRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The ARN specifying the resource group that is used to create the
     * application.
     * </p>
     * 
     * @param resourceGroupArn
     *        The ARN specifying the resource group that is used to create the
     *        application.
     */
    public void setResourceGroupArn(String resourceGroupArn) {
        this.resourceGroupArn = resourceGroupArn;
    }

    /**
     * <p>
     * The ARN specifying the resource group that is used to create the
     * application.
     * </p>
     * 
     * @return The ARN specifying the resource group that is used to create the
     *         application.
     */
    public String getResourceGroupArn() {
        return this.resourceGroupArn;
    }

    /**
     * <p>
     * The ARN specifying the resource group that is used to create the
     * application.
     * </p>
     * 
     * @param resourceGroupArn
     *        The ARN specifying the resource group that is used to create the
     *        application.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateApplicationRequest withResourceGroupArn(String resourceGroupArn) {
        setResourceGroupArn(resourceGroupArn);
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getResourceGroupArn() != null)
            sb.append("ResourceGroupArn: " + getResourceGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateApplicationRequest == false)
            return false;
        CreateApplicationRequest other = (CreateApplicationRequest) obj;
        if (other.getApplicationName() == null
                ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null
                && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getResourceGroupArn() == null
                ^ this.getResourceGroupArn() == null)
            return false;
        if (other.getResourceGroupArn() != null
                && other.getResourceGroupArn().equals(
                        this.getResourceGroupArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getApplicationName() == null) ? 0 : getApplicationName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getResourceGroupArn() == null) ? 0 : getResourceGroupArn()
                        .hashCode());
        return hashCode;
    }

    @Override
    public CreateApplicationRequest clone() {
        return (CreateApplicationRequest) super.clone();
    }
}