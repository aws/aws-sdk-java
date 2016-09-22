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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * Result message containing a list of environment descriptions.
 * </p>
 */
public class DescribeEnvironmentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns an <a>EnvironmentDescription</a> list.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<EnvironmentDescription> environments;

    /**
     * <p>
     * Returns an <a>EnvironmentDescription</a> list.
     * </p>
     * 
     * @return Returns an <a>EnvironmentDescription</a> list.
     */

    public java.util.List<EnvironmentDescription> getEnvironments() {
        if (environments == null) {
            environments = new com.amazonaws.internal.SdkInternalList<EnvironmentDescription>();
        }
        return environments;
    }

    /**
     * <p>
     * Returns an <a>EnvironmentDescription</a> list.
     * </p>
     * 
     * @param environments
     *        Returns an <a>EnvironmentDescription</a> list.
     */

    public void setEnvironments(java.util.Collection<EnvironmentDescription> environments) {
        if (environments == null) {
            this.environments = null;
            return;
        }

        this.environments = new com.amazonaws.internal.SdkInternalList<EnvironmentDescription>(environments);
    }

    /**
     * <p>
     * Returns an <a>EnvironmentDescription</a> list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnvironments(java.util.Collection)} or {@link #withEnvironments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param environments
     *        Returns an <a>EnvironmentDescription</a> list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentsResult withEnvironments(EnvironmentDescription... environments) {
        if (this.environments == null) {
            setEnvironments(new com.amazonaws.internal.SdkInternalList<EnvironmentDescription>(environments.length));
        }
        for (EnvironmentDescription ele : environments) {
            this.environments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns an <a>EnvironmentDescription</a> list.
     * </p>
     * 
     * @param environments
     *        Returns an <a>EnvironmentDescription</a> list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEnvironmentsResult withEnvironments(java.util.Collection<EnvironmentDescription> environments) {
        setEnvironments(environments);
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
        if (getEnvironments() != null)
            sb.append("Environments: " + getEnvironments());
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
