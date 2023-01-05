/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.docdbelastic.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of Elastic DocumentDB cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/ClusterInList" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterInList implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The arn of the Elastic DocumentDB cluster.
     * </p>
     */
    private String clusterArn;
    /**
     * <p>
     * The name of the Elastic DocumentDB cluster.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The status of the Elastic DocumentDB cluster.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The arn of the Elastic DocumentDB cluster.
     * </p>
     * 
     * @param clusterArn
     *        The arn of the Elastic DocumentDB cluster.
     */

    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The arn of the Elastic DocumentDB cluster.
     * </p>
     * 
     * @return The arn of the Elastic DocumentDB cluster.
     */

    public String getClusterArn() {
        return this.clusterArn;
    }

    /**
     * <p>
     * The arn of the Elastic DocumentDB cluster.
     * </p>
     * 
     * @param clusterArn
     *        The arn of the Elastic DocumentDB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterInList withClusterArn(String clusterArn) {
        setClusterArn(clusterArn);
        return this;
    }

    /**
     * <p>
     * The name of the Elastic DocumentDB cluster.
     * </p>
     * 
     * @param clusterName
     *        The name of the Elastic DocumentDB cluster.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the Elastic DocumentDB cluster.
     * </p>
     * 
     * @return The name of the Elastic DocumentDB cluster.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the Elastic DocumentDB cluster.
     * </p>
     * 
     * @param clusterName
     *        The name of the Elastic DocumentDB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterInList withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The status of the Elastic DocumentDB cluster.
     * </p>
     * 
     * @param status
     *        The status of the Elastic DocumentDB cluster.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the Elastic DocumentDB cluster.
     * </p>
     * 
     * @return The status of the Elastic DocumentDB cluster.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the Elastic DocumentDB cluster.
     * </p>
     * 
     * @param status
     *        The status of the Elastic DocumentDB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public ClusterInList withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the Elastic DocumentDB cluster.
     * </p>
     * 
     * @param status
     *        The status of the Elastic DocumentDB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public ClusterInList withStatus(Status status) {
        this.status = status.toString();
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
        if (getClusterArn() != null)
            sb.append("ClusterArn: ").append(getClusterArn()).append(",");
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterInList == false)
            return false;
        ClusterInList other = (ClusterInList) obj;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ClusterInList clone() {
        try {
            return (ClusterInList) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.docdbelastic.model.transform.ClusterInListMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
