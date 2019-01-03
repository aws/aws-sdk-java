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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeStackInstance"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStackInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or the unique stack ID of the stack set that you want to get stack instance information for.
     * </p>
     */
    private String stackSetName;
    /**
     * <p>
     * The ID of an AWS account that's associated with this stack instance.
     * </p>
     */
    private String stackInstanceAccount;
    /**
     * <p>
     * The name of a region that's associated with this stack instance.
     * </p>
     */
    private String stackInstanceRegion;

    /**
     * <p>
     * The name or the unique stack ID of the stack set that you want to get stack instance information for.
     * </p>
     * 
     * @param stackSetName
     *        The name or the unique stack ID of the stack set that you want to get stack instance information for.
     */

    public void setStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
    }

    /**
     * <p>
     * The name or the unique stack ID of the stack set that you want to get stack instance information for.
     * </p>
     * 
     * @return The name or the unique stack ID of the stack set that you want to get stack instance information for.
     */

    public String getStackSetName() {
        return this.stackSetName;
    }

    /**
     * <p>
     * The name or the unique stack ID of the stack set that you want to get stack instance information for.
     * </p>
     * 
     * @param stackSetName
     *        The name or the unique stack ID of the stack set that you want to get stack instance information for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStackInstanceRequest withStackSetName(String stackSetName) {
        setStackSetName(stackSetName);
        return this;
    }

    /**
     * <p>
     * The ID of an AWS account that's associated with this stack instance.
     * </p>
     * 
     * @param stackInstanceAccount
     *        The ID of an AWS account that's associated with this stack instance.
     */

    public void setStackInstanceAccount(String stackInstanceAccount) {
        this.stackInstanceAccount = stackInstanceAccount;
    }

    /**
     * <p>
     * The ID of an AWS account that's associated with this stack instance.
     * </p>
     * 
     * @return The ID of an AWS account that's associated with this stack instance.
     */

    public String getStackInstanceAccount() {
        return this.stackInstanceAccount;
    }

    /**
     * <p>
     * The ID of an AWS account that's associated with this stack instance.
     * </p>
     * 
     * @param stackInstanceAccount
     *        The ID of an AWS account that's associated with this stack instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStackInstanceRequest withStackInstanceAccount(String stackInstanceAccount) {
        setStackInstanceAccount(stackInstanceAccount);
        return this;
    }

    /**
     * <p>
     * The name of a region that's associated with this stack instance.
     * </p>
     * 
     * @param stackInstanceRegion
     *        The name of a region that's associated with this stack instance.
     */

    public void setStackInstanceRegion(String stackInstanceRegion) {
        this.stackInstanceRegion = stackInstanceRegion;
    }

    /**
     * <p>
     * The name of a region that's associated with this stack instance.
     * </p>
     * 
     * @return The name of a region that's associated with this stack instance.
     */

    public String getStackInstanceRegion() {
        return this.stackInstanceRegion;
    }

    /**
     * <p>
     * The name of a region that's associated with this stack instance.
     * </p>
     * 
     * @param stackInstanceRegion
     *        The name of a region that's associated with this stack instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStackInstanceRequest withStackInstanceRegion(String stackInstanceRegion) {
        setStackInstanceRegion(stackInstanceRegion);
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
        if (getStackSetName() != null)
            sb.append("StackSetName: ").append(getStackSetName()).append(",");
        if (getStackInstanceAccount() != null)
            sb.append("StackInstanceAccount: ").append(getStackInstanceAccount()).append(",");
        if (getStackInstanceRegion() != null)
            sb.append("StackInstanceRegion: ").append(getStackInstanceRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStackInstanceRequest == false)
            return false;
        DescribeStackInstanceRequest other = (DescribeStackInstanceRequest) obj;
        if (other.getStackSetName() == null ^ this.getStackSetName() == null)
            return false;
        if (other.getStackSetName() != null && other.getStackSetName().equals(this.getStackSetName()) == false)
            return false;
        if (other.getStackInstanceAccount() == null ^ this.getStackInstanceAccount() == null)
            return false;
        if (other.getStackInstanceAccount() != null && other.getStackInstanceAccount().equals(this.getStackInstanceAccount()) == false)
            return false;
        if (other.getStackInstanceRegion() == null ^ this.getStackInstanceRegion() == null)
            return false;
        if (other.getStackInstanceRegion() != null && other.getStackInstanceRegion().equals(this.getStackInstanceRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackSetName() == null) ? 0 : getStackSetName().hashCode());
        hashCode = prime * hashCode + ((getStackInstanceAccount() == null) ? 0 : getStackInstanceAccount().hashCode());
        hashCode = prime * hashCode + ((getStackInstanceRegion() == null) ? 0 : getStackInstanceRegion().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStackInstanceRequest clone() {
        return (DescribeStackInstanceRequest) super.clone();
    }

}
