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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeUpdate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeUpdateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Amazon EKS cluster to update.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the update to describe.
     * </p>
     */
    private String updateId;

    /**
     * <p>
     * The name of the Amazon EKS cluster to update.
     * </p>
     * 
     * @param name
     *        The name of the Amazon EKS cluster to update.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Amazon EKS cluster to update.
     * </p>
     * 
     * @return The name of the Amazon EKS cluster to update.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Amazon EKS cluster to update.
     * </p>
     * 
     * @param name
     *        The name of the Amazon EKS cluster to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUpdateRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the update to describe.
     * </p>
     * 
     * @param updateId
     *        The ID of the update to describe.
     */

    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }

    /**
     * <p>
     * The ID of the update to describe.
     * </p>
     * 
     * @return The ID of the update to describe.
     */

    public String getUpdateId() {
        return this.updateId;
    }

    /**
     * <p>
     * The ID of the update to describe.
     * </p>
     * 
     * @param updateId
     *        The ID of the update to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUpdateRequest withUpdateId(String updateId) {
        setUpdateId(updateId);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getUpdateId() != null)
            sb.append("UpdateId: ").append(getUpdateId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeUpdateRequest == false)
            return false;
        DescribeUpdateRequest other = (DescribeUpdateRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getUpdateId() == null ^ this.getUpdateId() == null)
            return false;
        if (other.getUpdateId() != null && other.getUpdateId().equals(this.getUpdateId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getUpdateId() == null) ? 0 : getUpdateId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeUpdateRequest clone() {
        return (DescribeUpdateRequest) super.clone();
    }

}
