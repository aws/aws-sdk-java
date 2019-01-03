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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ResizeCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResizeClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the cluster to resize.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The new cluster type for the specified cluster.
     * </p>
     */
    private String clusterType;
    /**
     * <p>
     * The new node type for the nodes you are adding.
     * </p>
     */
    private String nodeType;
    /**
     * <p>
     * The new number of nodes for the cluster.
     * </p>
     */
    private Integer numberOfNodes;
    /**
     * <p>
     * A boolean value indicating whether the resize operation is using the classic resize process. If you don't provide
     * this parameter or set the value to <code>false</code>, the resize type is elastic.
     * </p>
     */
    private Boolean classic;

    /**
     * <p>
     * The unique identifier for the cluster to resize.
     * </p>
     * 
     * @param clusterIdentifier
     *        The unique identifier for the cluster to resize.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier for the cluster to resize.
     * </p>
     * 
     * @return The unique identifier for the cluster to resize.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier for the cluster to resize.
     * </p>
     * 
     * @param clusterIdentifier
     *        The unique identifier for the cluster to resize.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResizeClusterRequest withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The new cluster type for the specified cluster.
     * </p>
     * 
     * @param clusterType
     *        The new cluster type for the specified cluster.
     */

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    /**
     * <p>
     * The new cluster type for the specified cluster.
     * </p>
     * 
     * @return The new cluster type for the specified cluster.
     */

    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * <p>
     * The new cluster type for the specified cluster.
     * </p>
     * 
     * @param clusterType
     *        The new cluster type for the specified cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResizeClusterRequest withClusterType(String clusterType) {
        setClusterType(clusterType);
        return this;
    }

    /**
     * <p>
     * The new node type for the nodes you are adding.
     * </p>
     * 
     * @param nodeType
     *        The new node type for the nodes you are adding.
     */

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * The new node type for the nodes you are adding.
     * </p>
     * 
     * @return The new node type for the nodes you are adding.
     */

    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * <p>
     * The new node type for the nodes you are adding.
     * </p>
     * 
     * @param nodeType
     *        The new node type for the nodes you are adding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResizeClusterRequest withNodeType(String nodeType) {
        setNodeType(nodeType);
        return this;
    }

    /**
     * <p>
     * The new number of nodes for the cluster.
     * </p>
     * 
     * @param numberOfNodes
     *        The new number of nodes for the cluster.
     */

    public void setNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }

    /**
     * <p>
     * The new number of nodes for the cluster.
     * </p>
     * 
     * @return The new number of nodes for the cluster.
     */

    public Integer getNumberOfNodes() {
        return this.numberOfNodes;
    }

    /**
     * <p>
     * The new number of nodes for the cluster.
     * </p>
     * 
     * @param numberOfNodes
     *        The new number of nodes for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResizeClusterRequest withNumberOfNodes(Integer numberOfNodes) {
        setNumberOfNodes(numberOfNodes);
        return this;
    }

    /**
     * <p>
     * A boolean value indicating whether the resize operation is using the classic resize process. If you don't provide
     * this parameter or set the value to <code>false</code>, the resize type is elastic.
     * </p>
     * 
     * @param classic
     *        A boolean value indicating whether the resize operation is using the classic resize process. If you don't
     *        provide this parameter or set the value to <code>false</code>, the resize type is elastic.
     */

    public void setClassic(Boolean classic) {
        this.classic = classic;
    }

    /**
     * <p>
     * A boolean value indicating whether the resize operation is using the classic resize process. If you don't provide
     * this parameter or set the value to <code>false</code>, the resize type is elastic.
     * </p>
     * 
     * @return A boolean value indicating whether the resize operation is using the classic resize process. If you don't
     *         provide this parameter or set the value to <code>false</code>, the resize type is elastic.
     */

    public Boolean getClassic() {
        return this.classic;
    }

    /**
     * <p>
     * A boolean value indicating whether the resize operation is using the classic resize process. If you don't provide
     * this parameter or set the value to <code>false</code>, the resize type is elastic.
     * </p>
     * 
     * @param classic
     *        A boolean value indicating whether the resize operation is using the classic resize process. If you don't
     *        provide this parameter or set the value to <code>false</code>, the resize type is elastic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResizeClusterRequest withClassic(Boolean classic) {
        setClassic(classic);
        return this;
    }

    /**
     * <p>
     * A boolean value indicating whether the resize operation is using the classic resize process. If you don't provide
     * this parameter or set the value to <code>false</code>, the resize type is elastic.
     * </p>
     * 
     * @return A boolean value indicating whether the resize operation is using the classic resize process. If you don't
     *         provide this parameter or set the value to <code>false</code>, the resize type is elastic.
     */

    public Boolean isClassic() {
        return this.classic;
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
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier()).append(",");
        if (getClusterType() != null)
            sb.append("ClusterType: ").append(getClusterType()).append(",");
        if (getNodeType() != null)
            sb.append("NodeType: ").append(getNodeType()).append(",");
        if (getNumberOfNodes() != null)
            sb.append("NumberOfNodes: ").append(getNumberOfNodes()).append(",");
        if (getClassic() != null)
            sb.append("Classic: ").append(getClassic());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResizeClusterRequest == false)
            return false;
        ResizeClusterRequest other = (ResizeClusterRequest) obj;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getClusterType() == null ^ this.getClusterType() == null)
            return false;
        if (other.getClusterType() != null && other.getClusterType().equals(this.getClusterType()) == false)
            return false;
        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
            return false;
        if (other.getNumberOfNodes() == null ^ this.getNumberOfNodes() == null)
            return false;
        if (other.getNumberOfNodes() != null && other.getNumberOfNodes().equals(this.getNumberOfNodes()) == false)
            return false;
        if (other.getClassic() == null ^ this.getClassic() == null)
            return false;
        if (other.getClassic() != null && other.getClassic().equals(this.getClassic()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getClusterType() == null) ? 0 : getClusterType().hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode + ((getNumberOfNodes() == null) ? 0 : getNumberOfNodes().hashCode());
        hashCode = prime * hashCode + ((getClassic() == null) ? 0 : getClassic().hashCode());
        return hashCode;
    }

    @Override
    public ResizeClusterRequest clone() {
        return (ResizeClusterRequest) super.clone();
    }

}
