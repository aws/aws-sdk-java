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
package com.amazonaws.services.cloud9.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloud9-2017-09-23/DescribeEnvironments" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEnvironmentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the environments that are returned.
     * </p>
     */
    private java.util.List<Environment> environments;

    /**
     * <p>
     * Information about the environments that are returned.
     * </p>
     * 
     * @return Information about the environments that are returned.
     */

    public java.util.List<Environment> getEnvironments() {
        return environments;
    }

    /**
     * <p>
     * Information about the environments that are returned.
     * </p>
     * 
     * @param environments
     *        Information about the environments that are returned.
     */

    public void setEnvironments(java.util.Collection<Environment> environments) {
        if (environments == null) {
            this.environments = null;
            return;
        }

        this.environments = new java.util.ArrayList<Environment>(environments);
    }

    /**
     * <p>
     * Information about the environments that are returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnvironments(java.util.Collection)} or {@link #withEnvironments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param environments
     *        Information about the environments that are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentsResult withEnvironments(Environment... environments) {
        if (this.environments == null) {
            setEnvironments(new java.util.ArrayList<Environment>(environments.length));
        }
        for (Environment ele : environments) {
            this.environments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the environments that are returned.
     * </p>
     * 
     * @param environments
     *        Information about the environments that are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentsResult withEnvironments(java.util.Collection<Environment> environments) {
        setEnvironments(environments);
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
        if (getEnvironments() != null)
            sb.append("Environments: ").append(getEnvironments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEnvironmentsResult == false)
            return false;
        DescribeEnvironmentsResult other = (DescribeEnvironmentsResult) obj;
        if (other.getEnvironments() == null ^ this.getEnvironments() == null)
            return false;
        if (other.getEnvironments() != null && other.getEnvironments().equals(this.getEnvironments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironments() == null) ? 0 : getEnvironments().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEnvironmentsResult clone() {
        try {
            return (DescribeEnvironmentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
