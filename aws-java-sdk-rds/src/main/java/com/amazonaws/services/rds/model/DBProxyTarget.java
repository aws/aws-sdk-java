/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <note>
 * <p>
 * This is prerelease documentation for the RDS Database Proxy feature in preview release. It is subject to change.
 * </p>
 * </note>
 * <p>
 * Contains the details for an RDS Proxy target. It represents an RDS DB instance or Aurora DB cluster that the proxy
 * can connect to. One or more targets are associated with an RDS Proxy target group.
 * </p>
 * <p>
 * This data type is used as a response element in the <code>DescribeDBProxyTargets</code> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DBProxyTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBProxyTarget implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the RDS DB instance or Aurora DB cluster.
     * </p>
     */
    private String targetArn;
    /**
     * <p>
     * The writer endpoint for the RDS DB instance or Aurora DB cluster.
     * </p>
     */
    private String endpoint;
    /**
     * <p>
     * The DB cluster identifier when the target represents an Aurora DB cluster. This field is blank when the target
     * represents an RDS DB instance.
     * </p>
     */
    private String trackedClusterId;
    /**
     * <p>
     * The identifier representing the target. It can be the instance identifier for an RDS DB instance, or the cluster
     * identifier for an Aurora DB cluster.
     * </p>
     */
    private String rdsResourceId;
    /**
     * <p>
     * The port that the RDS Proxy uses to connect to the target RDS DB instance or Aurora DB cluster.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * Specifies the kind of database, such as an RDS DB instance or an Aurora DB cluster, that the target represents.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the RDS DB instance or Aurora DB cluster.
     * </p>
     * 
     * @param targetArn
     *        The Amazon Resource Name (ARN) for the RDS DB instance or Aurora DB cluster.
     */

    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the RDS DB instance or Aurora DB cluster.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the RDS DB instance or Aurora DB cluster.
     */

    public String getTargetArn() {
        return this.targetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the RDS DB instance or Aurora DB cluster.
     * </p>
     * 
     * @param targetArn
     *        The Amazon Resource Name (ARN) for the RDS DB instance or Aurora DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxyTarget withTargetArn(String targetArn) {
        setTargetArn(targetArn);
        return this;
    }

    /**
     * <p>
     * The writer endpoint for the RDS DB instance or Aurora DB cluster.
     * </p>
     * 
     * @param endpoint
     *        The writer endpoint for the RDS DB instance or Aurora DB cluster.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The writer endpoint for the RDS DB instance or Aurora DB cluster.
     * </p>
     * 
     * @return The writer endpoint for the RDS DB instance or Aurora DB cluster.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The writer endpoint for the RDS DB instance or Aurora DB cluster.
     * </p>
     * 
     * @param endpoint
     *        The writer endpoint for the RDS DB instance or Aurora DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxyTarget withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * The DB cluster identifier when the target represents an Aurora DB cluster. This field is blank when the target
     * represents an RDS DB instance.
     * </p>
     * 
     * @param trackedClusterId
     *        The DB cluster identifier when the target represents an Aurora DB cluster. This field is blank when the
     *        target represents an RDS DB instance.
     */

    public void setTrackedClusterId(String trackedClusterId) {
        this.trackedClusterId = trackedClusterId;
    }

    /**
     * <p>
     * The DB cluster identifier when the target represents an Aurora DB cluster. This field is blank when the target
     * represents an RDS DB instance.
     * </p>
     * 
     * @return The DB cluster identifier when the target represents an Aurora DB cluster. This field is blank when the
     *         target represents an RDS DB instance.
     */

    public String getTrackedClusterId() {
        return this.trackedClusterId;
    }

    /**
     * <p>
     * The DB cluster identifier when the target represents an Aurora DB cluster. This field is blank when the target
     * represents an RDS DB instance.
     * </p>
     * 
     * @param trackedClusterId
     *        The DB cluster identifier when the target represents an Aurora DB cluster. This field is blank when the
     *        target represents an RDS DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxyTarget withTrackedClusterId(String trackedClusterId) {
        setTrackedClusterId(trackedClusterId);
        return this;
    }

    /**
     * <p>
     * The identifier representing the target. It can be the instance identifier for an RDS DB instance, or the cluster
     * identifier for an Aurora DB cluster.
     * </p>
     * 
     * @param rdsResourceId
     *        The identifier representing the target. It can be the instance identifier for an RDS DB instance, or the
     *        cluster identifier for an Aurora DB cluster.
     */

    public void setRdsResourceId(String rdsResourceId) {
        this.rdsResourceId = rdsResourceId;
    }

    /**
     * <p>
     * The identifier representing the target. It can be the instance identifier for an RDS DB instance, or the cluster
     * identifier for an Aurora DB cluster.
     * </p>
     * 
     * @return The identifier representing the target. It can be the instance identifier for an RDS DB instance, or the
     *         cluster identifier for an Aurora DB cluster.
     */

    public String getRdsResourceId() {
        return this.rdsResourceId;
    }

    /**
     * <p>
     * The identifier representing the target. It can be the instance identifier for an RDS DB instance, or the cluster
     * identifier for an Aurora DB cluster.
     * </p>
     * 
     * @param rdsResourceId
     *        The identifier representing the target. It can be the instance identifier for an RDS DB instance, or the
     *        cluster identifier for an Aurora DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxyTarget withRdsResourceId(String rdsResourceId) {
        setRdsResourceId(rdsResourceId);
        return this;
    }

    /**
     * <p>
     * The port that the RDS Proxy uses to connect to the target RDS DB instance or Aurora DB cluster.
     * </p>
     * 
     * @param port
     *        The port that the RDS Proxy uses to connect to the target RDS DB instance or Aurora DB cluster.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port that the RDS Proxy uses to connect to the target RDS DB instance or Aurora DB cluster.
     * </p>
     * 
     * @return The port that the RDS Proxy uses to connect to the target RDS DB instance or Aurora DB cluster.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port that the RDS Proxy uses to connect to the target RDS DB instance or Aurora DB cluster.
     * </p>
     * 
     * @param port
     *        The port that the RDS Proxy uses to connect to the target RDS DB instance or Aurora DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxyTarget withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * Specifies the kind of database, such as an RDS DB instance or an Aurora DB cluster, that the target represents.
     * </p>
     * 
     * @param type
     *        Specifies the kind of database, such as an RDS DB instance or an Aurora DB cluster, that the target
     *        represents.
     * @see TargetType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specifies the kind of database, such as an RDS DB instance or an Aurora DB cluster, that the target represents.
     * </p>
     * 
     * @return Specifies the kind of database, such as an RDS DB instance or an Aurora DB cluster, that the target
     *         represents.
     * @see TargetType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Specifies the kind of database, such as an RDS DB instance or an Aurora DB cluster, that the target represents.
     * </p>
     * 
     * @param type
     *        Specifies the kind of database, such as an RDS DB instance or an Aurora DB cluster, that the target
     *        represents.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetType
     */

    public DBProxyTarget withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Specifies the kind of database, such as an RDS DB instance or an Aurora DB cluster, that the target represents.
     * </p>
     * 
     * @param type
     *        Specifies the kind of database, such as an RDS DB instance or an Aurora DB cluster, that the target
     *        represents.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetType
     */

    public DBProxyTarget withType(TargetType type) {
        this.type = type.toString();
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
        if (getTargetArn() != null)
            sb.append("TargetArn: ").append(getTargetArn()).append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getTrackedClusterId() != null)
            sb.append("TrackedClusterId: ").append(getTrackedClusterId()).append(",");
        if (getRdsResourceId() != null)
            sb.append("RdsResourceId: ").append(getRdsResourceId()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBProxyTarget == false)
            return false;
        DBProxyTarget other = (DBProxyTarget) obj;
        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getTrackedClusterId() == null ^ this.getTrackedClusterId() == null)
            return false;
        if (other.getTrackedClusterId() != null && other.getTrackedClusterId().equals(this.getTrackedClusterId()) == false)
            return false;
        if (other.getRdsResourceId() == null ^ this.getRdsResourceId() == null)
            return false;
        if (other.getRdsResourceId() != null && other.getRdsResourceId().equals(this.getRdsResourceId()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getTrackedClusterId() == null) ? 0 : getTrackedClusterId().hashCode());
        hashCode = prime * hashCode + ((getRdsResourceId() == null) ? 0 : getRdsResourceId().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public DBProxyTarget clone() {
        try {
            return (DBProxyTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
