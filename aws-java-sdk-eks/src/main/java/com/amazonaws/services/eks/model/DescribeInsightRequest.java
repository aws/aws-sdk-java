/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DescribeInsight" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInsightRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the cluster to describe the insight for.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The identity of the insight to describe.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The name of the cluster to describe the insight for.
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster to describe the insight for.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the cluster to describe the insight for.
     * </p>
     * 
     * @return The name of the cluster to describe the insight for.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the cluster to describe the insight for.
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster to describe the insight for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInsightRequest withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The identity of the insight to describe.
     * </p>
     * 
     * @param id
     *        The identity of the insight to describe.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identity of the insight to describe.
     * </p>
     * 
     * @return The identity of the insight to describe.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identity of the insight to describe.
     * </p>
     * 
     * @param id
     *        The identity of the insight to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInsightRequest withId(String id) {
        setId(id);
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
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInsightRequest == false)
            return false;
        DescribeInsightRequest other = (DescribeInsightRequest) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInsightRequest clone() {
        return (DescribeInsightRequest) super.clone();
    }

}
