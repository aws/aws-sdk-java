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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteClusterSecurityGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteClusterSecurityGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the cluster security group to be deleted.
     * </p>
     */
    private String clusterSecurityGroupName;

    /**
     * <p>
     * The name of the cluster security group to be deleted.
     * </p>
     * 
     * @param clusterSecurityGroupName
     *        The name of the cluster security group to be deleted.
     */

    public void setClusterSecurityGroupName(String clusterSecurityGroupName) {
        this.clusterSecurityGroupName = clusterSecurityGroupName;
    }

    /**
     * <p>
     * The name of the cluster security group to be deleted.
     * </p>
     * 
     * @return The name of the cluster security group to be deleted.
     */

    public String getClusterSecurityGroupName() {
        return this.clusterSecurityGroupName;
    }

    /**
     * <p>
     * The name of the cluster security group to be deleted.
     * </p>
     * 
     * @param clusterSecurityGroupName
     *        The name of the cluster security group to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteClusterSecurityGroupRequest withClusterSecurityGroupName(String clusterSecurityGroupName) {
        setClusterSecurityGroupName(clusterSecurityGroupName);
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
        if (getClusterSecurityGroupName() != null)
            sb.append("ClusterSecurityGroupName: ").append(getClusterSecurityGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteClusterSecurityGroupRequest == false)
            return false;
        DeleteClusterSecurityGroupRequest other = (DeleteClusterSecurityGroupRequest) obj;
        if (other.getClusterSecurityGroupName() == null ^ this.getClusterSecurityGroupName() == null)
            return false;
        if (other.getClusterSecurityGroupName() != null && other.getClusterSecurityGroupName().equals(this.getClusterSecurityGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterSecurityGroupName() == null) ? 0 : getClusterSecurityGroupName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteClusterSecurityGroupRequest clone() {
        return (DeleteClusterSecurityGroupRequest) super.clone();
    }

}
