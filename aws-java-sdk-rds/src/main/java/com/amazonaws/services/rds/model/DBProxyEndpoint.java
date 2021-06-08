/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * The data structure representing an endpoint associated with a DB proxy. RDS automatically creates one endpoint for
 * each DB proxy. For Aurora DB clusters, you can associate additional endpoints with the same DB proxy. These endpoints
 * can be read/write or read-only. They can also reside in different VPCs than the associated DB proxy.
 * </p>
 * <p>
 * This data type is used as a response element in the <code>DescribeDBProxyEndpoints</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DBProxyEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBProxyEndpoint implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the DB proxy endpoint. An identifier must begin with a letter and must contain only ASCII letters,
     * digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     */
    private String dBProxyEndpointName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB proxy endpoint.
     * </p>
     */
    private String dBProxyEndpointArn;
    /**
     * <p>
     * The identifier for the DB proxy that is associated with this DB proxy endpoint.
     * </p>
     */
    private String dBProxyName;
    /**
     * <p>
     * The current status of this DB proxy endpoint. A status of <code>available</code> means the endpoint is ready to
     * handle requests. Other values indicate that you must wait for the endpoint to be ready, or take some action to
     * resolve an issue.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Provides the VPC ID of the DB proxy endpoint.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * Provides a list of VPC security groups that the DB proxy endpoint belongs to.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIds;
    /**
     * <p>
     * The EC2 subnet IDs for the DB proxy endpoint.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> vpcSubnetIds;
    /**
     * <p>
     * The endpoint that you can use to connect to the DB proxy. You include the endpoint value in the connection string
     * for a database client application.
     * </p>
     */
    private String endpoint;
    /**
     * <p>
     * The date and time when the DB proxy endpoint was first created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * A value that indicates whether the DB proxy endpoint can be used for read/write or read-only operations.
     * </p>
     */
    private String targetRole;
    /**
     * <p>
     * A value that indicates whether this endpoint is the default endpoint for the associated DB proxy. Default DB
     * proxy endpoints always have read/write capability. Other endpoints that you associate with the DB proxy can be
     * either read/write or read-only.
     * </p>
     */
    private Boolean isDefault;

    /**
     * <p>
     * The name for the DB proxy endpoint. An identifier must begin with a letter and must contain only ASCII letters,
     * digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * 
     * @param dBProxyEndpointName
     *        The name for the DB proxy endpoint. An identifier must begin with a letter and must contain only ASCII
     *        letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     */

    public void setDBProxyEndpointName(String dBProxyEndpointName) {
        this.dBProxyEndpointName = dBProxyEndpointName;
    }

    /**
     * <p>
     * The name for the DB proxy endpoint. An identifier must begin with a letter and must contain only ASCII letters,
     * digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * 
     * @return The name for the DB proxy endpoint. An identifier must begin with a letter and must contain only ASCII
     *         letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     */

    public String getDBProxyEndpointName() {
        return this.dBProxyEndpointName;
    }

    /**
     * <p>
     * The name for the DB proxy endpoint. An identifier must begin with a letter and must contain only ASCII letters,
     * digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * 
     * @param dBProxyEndpointName
     *        The name for the DB proxy endpoint. An identifier must begin with a letter and must contain only ASCII
     *        letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxyEndpoint withDBProxyEndpointName(String dBProxyEndpointName) {
        setDBProxyEndpointName(dBProxyEndpointName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB proxy endpoint.
     * </p>
     * 
     * @param dBProxyEndpointArn
     *        The Amazon Resource Name (ARN) for the DB proxy endpoint.
     */

    public void setDBProxyEndpointArn(String dBProxyEndpointArn) {
        this.dBProxyEndpointArn = dBProxyEndpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB proxy endpoint.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the DB proxy endpoint.
     */

    public String getDBProxyEndpointArn() {
        return this.dBProxyEndpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB proxy endpoint.
     * </p>
     * 
     * @param dBProxyEndpointArn
     *        The Amazon Resource Name (ARN) for the DB proxy endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxyEndpoint withDBProxyEndpointArn(String dBProxyEndpointArn) {
        setDBProxyEndpointArn(dBProxyEndpointArn);
        return this;
    }

    /**
     * <p>
     * The identifier for the DB proxy that is associated with this DB proxy endpoint.
     * </p>
     * 
     * @param dBProxyName
     *        The identifier for the DB proxy that is associated with this DB proxy endpoint.
     */

    public void setDBProxyName(String dBProxyName) {
        this.dBProxyName = dBProxyName;
    }

    /**
     * <p>
     * The identifier for the DB proxy that is associated with this DB proxy endpoint.
     * </p>
     * 
     * @return The identifier for the DB proxy that is associated with this DB proxy endpoint.
     */

    public String getDBProxyName() {
        return this.dBProxyName;
    }

    /**
     * <p>
     * The identifier for the DB proxy that is associated with this DB proxy endpoint.
     * </p>
     * 
     * @param dBProxyName
     *        The identifier for the DB proxy that is associated with this DB proxy endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxyEndpoint withDBProxyName(String dBProxyName) {
        setDBProxyName(dBProxyName);
        return this;
    }

    /**
     * <p>
     * The current status of this DB proxy endpoint. A status of <code>available</code> means the endpoint is ready to
     * handle requests. Other values indicate that you must wait for the endpoint to be ready, or take some action to
     * resolve an issue.
     * </p>
     * 
     * @param status
     *        The current status of this DB proxy endpoint. A status of <code>available</code> means the endpoint is
     *        ready to handle requests. Other values indicate that you must wait for the endpoint to be ready, or take
     *        some action to resolve an issue.
     * @see DBProxyEndpointStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of this DB proxy endpoint. A status of <code>available</code> means the endpoint is ready to
     * handle requests. Other values indicate that you must wait for the endpoint to be ready, or take some action to
     * resolve an issue.
     * </p>
     * 
     * @return The current status of this DB proxy endpoint. A status of <code>available</code> means the endpoint is
     *         ready to handle requests. Other values indicate that you must wait for the endpoint to be ready, or take
     *         some action to resolve an issue.
     * @see DBProxyEndpointStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of this DB proxy endpoint. A status of <code>available</code> means the endpoint is ready to
     * handle requests. Other values indicate that you must wait for the endpoint to be ready, or take some action to
     * resolve an issue.
     * </p>
     * 
     * @param status
     *        The current status of this DB proxy endpoint. A status of <code>available</code> means the endpoint is
     *        ready to handle requests. Other values indicate that you must wait for the endpoint to be ready, or take
     *        some action to resolve an issue.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DBProxyEndpointStatus
     */

    public DBProxyEndpoint withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of this DB proxy endpoint. A status of <code>available</code> means the endpoint is ready to
     * handle requests. Other values indicate that you must wait for the endpoint to be ready, or take some action to
     * resolve an issue.
     * </p>
     * 
     * @param status
     *        The current status of this DB proxy endpoint. A status of <code>available</code> means the endpoint is
     *        ready to handle requests. Other values indicate that you must wait for the endpoint to be ready, or take
     *        some action to resolve an issue.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DBProxyEndpointStatus
     */

    public DBProxyEndpoint withStatus(DBProxyEndpointStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Provides the VPC ID of the DB proxy endpoint.
     * </p>
     * 
     * @param vpcId
     *        Provides the VPC ID of the DB proxy endpoint.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * Provides the VPC ID of the DB proxy endpoint.
     * </p>
     * 
     * @return Provides the VPC ID of the DB proxy endpoint.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * Provides the VPC ID of the DB proxy endpoint.
     * </p>
     * 
     * @param vpcId
     *        Provides the VPC ID of the DB proxy endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxyEndpoint withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * Provides a list of VPC security groups that the DB proxy endpoint belongs to.
     * </p>
     * 
     * @return Provides a list of VPC security groups that the DB proxy endpoint belongs to.
     */

    public java.util.List<String> getVpcSecurityGroupIds() {
        if (vpcSecurityGroupIds == null) {
            vpcSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * Provides a list of VPC security groups that the DB proxy endpoint belongs to.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        Provides a list of VPC security groups that the DB proxy endpoint belongs to.
     */

    public void setVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        if (vpcSecurityGroupIds == null) {
            this.vpcSecurityGroupIds = null;
            return;
        }

        this.vpcSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>(vpcSecurityGroupIds);
    }

    /**
     * <p>
     * Provides a list of VPC security groups that the DB proxy endpoint belongs to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroupIds(java.util.Collection)} or {@link #withVpcSecurityGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        Provides a list of VPC security groups that the DB proxy endpoint belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxyEndpoint withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
        if (this.vpcSecurityGroupIds == null) {
            setVpcSecurityGroupIds(new com.amazonaws.internal.SdkInternalList<String>(vpcSecurityGroupIds.length));
        }
        for (String ele : vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides a list of VPC security groups that the DB proxy endpoint belongs to.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        Provides a list of VPC security groups that the DB proxy endpoint belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxyEndpoint withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * The EC2 subnet IDs for the DB proxy endpoint.
     * </p>
     * 
     * @return The EC2 subnet IDs for the DB proxy endpoint.
     */

    public java.util.List<String> getVpcSubnetIds() {
        if (vpcSubnetIds == null) {
            vpcSubnetIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return vpcSubnetIds;
    }

    /**
     * <p>
     * The EC2 subnet IDs for the DB proxy endpoint.
     * </p>
     * 
     * @param vpcSubnetIds
     *        The EC2 subnet IDs for the DB proxy endpoint.
     */

    public void setVpcSubnetIds(java.util.Collection<String> vpcSubnetIds) {
        if (vpcSubnetIds == null) {
            this.vpcSubnetIds = null;
            return;
        }

        this.vpcSubnetIds = new com.amazonaws.internal.SdkInternalList<String>(vpcSubnetIds);
    }

    /**
     * <p>
     * The EC2 subnet IDs for the DB proxy endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSubnetIds(java.util.Collection)} or {@link #withVpcSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param vpcSubnetIds
     *        The EC2 subnet IDs for the DB proxy endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxyEndpoint withVpcSubnetIds(String... vpcSubnetIds) {
        if (this.vpcSubnetIds == null) {
            setVpcSubnetIds(new com.amazonaws.internal.SdkInternalList<String>(vpcSubnetIds.length));
        }
        for (String ele : vpcSubnetIds) {
            this.vpcSubnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The EC2 subnet IDs for the DB proxy endpoint.
     * </p>
     * 
     * @param vpcSubnetIds
     *        The EC2 subnet IDs for the DB proxy endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxyEndpoint withVpcSubnetIds(java.util.Collection<String> vpcSubnetIds) {
        setVpcSubnetIds(vpcSubnetIds);
        return this;
    }

    /**
     * <p>
     * The endpoint that you can use to connect to the DB proxy. You include the endpoint value in the connection string
     * for a database client application.
     * </p>
     * 
     * @param endpoint
     *        The endpoint that you can use to connect to the DB proxy. You include the endpoint value in the connection
     *        string for a database client application.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The endpoint that you can use to connect to the DB proxy. You include the endpoint value in the connection string
     * for a database client application.
     * </p>
     * 
     * @return The endpoint that you can use to connect to the DB proxy. You include the endpoint value in the
     *         connection string for a database client application.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The endpoint that you can use to connect to the DB proxy. You include the endpoint value in the connection string
     * for a database client application.
     * </p>
     * 
     * @param endpoint
     *        The endpoint that you can use to connect to the DB proxy. You include the endpoint value in the connection
     *        string for a database client application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxyEndpoint withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * The date and time when the DB proxy endpoint was first created.
     * </p>
     * 
     * @param createdDate
     *        The date and time when the DB proxy endpoint was first created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date and time when the DB proxy endpoint was first created.
     * </p>
     * 
     * @return The date and time when the DB proxy endpoint was first created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date and time when the DB proxy endpoint was first created.
     * </p>
     * 
     * @param createdDate
     *        The date and time when the DB proxy endpoint was first created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxyEndpoint withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB proxy endpoint can be used for read/write or read-only operations.
     * </p>
     * 
     * @param targetRole
     *        A value that indicates whether the DB proxy endpoint can be used for read/write or read-only operations.
     * @see DBProxyEndpointTargetRole
     */

    public void setTargetRole(String targetRole) {
        this.targetRole = targetRole;
    }

    /**
     * <p>
     * A value that indicates whether the DB proxy endpoint can be used for read/write or read-only operations.
     * </p>
     * 
     * @return A value that indicates whether the DB proxy endpoint can be used for read/write or read-only operations.
     * @see DBProxyEndpointTargetRole
     */

    public String getTargetRole() {
        return this.targetRole;
    }

    /**
     * <p>
     * A value that indicates whether the DB proxy endpoint can be used for read/write or read-only operations.
     * </p>
     * 
     * @param targetRole
     *        A value that indicates whether the DB proxy endpoint can be used for read/write or read-only operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DBProxyEndpointTargetRole
     */

    public DBProxyEndpoint withTargetRole(String targetRole) {
        setTargetRole(targetRole);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB proxy endpoint can be used for read/write or read-only operations.
     * </p>
     * 
     * @param targetRole
     *        A value that indicates whether the DB proxy endpoint can be used for read/write or read-only operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DBProxyEndpointTargetRole
     */

    public DBProxyEndpoint withTargetRole(DBProxyEndpointTargetRole targetRole) {
        this.targetRole = targetRole.toString();
        return this;
    }

    /**
     * <p>
     * A value that indicates whether this endpoint is the default endpoint for the associated DB proxy. Default DB
     * proxy endpoints always have read/write capability. Other endpoints that you associate with the DB proxy can be
     * either read/write or read-only.
     * </p>
     * 
     * @param isDefault
     *        A value that indicates whether this endpoint is the default endpoint for the associated DB proxy. Default
     *        DB proxy endpoints always have read/write capability. Other endpoints that you associate with the DB proxy
     *        can be either read/write or read-only.
     */

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * <p>
     * A value that indicates whether this endpoint is the default endpoint for the associated DB proxy. Default DB
     * proxy endpoints always have read/write capability. Other endpoints that you associate with the DB proxy can be
     * either read/write or read-only.
     * </p>
     * 
     * @return A value that indicates whether this endpoint is the default endpoint for the associated DB proxy. Default
     *         DB proxy endpoints always have read/write capability. Other endpoints that you associate with the DB
     *         proxy can be either read/write or read-only.
     */

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * <p>
     * A value that indicates whether this endpoint is the default endpoint for the associated DB proxy. Default DB
     * proxy endpoints always have read/write capability. Other endpoints that you associate with the DB proxy can be
     * either read/write or read-only.
     * </p>
     * 
     * @param isDefault
     *        A value that indicates whether this endpoint is the default endpoint for the associated DB proxy. Default
     *        DB proxy endpoints always have read/write capability. Other endpoints that you associate with the DB proxy
     *        can be either read/write or read-only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxyEndpoint withIsDefault(Boolean isDefault) {
        setIsDefault(isDefault);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether this endpoint is the default endpoint for the associated DB proxy. Default DB
     * proxy endpoints always have read/write capability. Other endpoints that you associate with the DB proxy can be
     * either read/write or read-only.
     * </p>
     * 
     * @return A value that indicates whether this endpoint is the default endpoint for the associated DB proxy. Default
     *         DB proxy endpoints always have read/write capability. Other endpoints that you associate with the DB
     *         proxy can be either read/write or read-only.
     */

    public Boolean isDefault() {
        return this.isDefault;
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
        if (getDBProxyEndpointName() != null)
            sb.append("DBProxyEndpointName: ").append(getDBProxyEndpointName()).append(",");
        if (getDBProxyEndpointArn() != null)
            sb.append("DBProxyEndpointArn: ").append(getDBProxyEndpointArn()).append(",");
        if (getDBProxyName() != null)
            sb.append("DBProxyName: ").append(getDBProxyName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: ").append(getVpcSecurityGroupIds()).append(",");
        if (getVpcSubnetIds() != null)
            sb.append("VpcSubnetIds: ").append(getVpcSubnetIds()).append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getTargetRole() != null)
            sb.append("TargetRole: ").append(getTargetRole()).append(",");
        if (getIsDefault() != null)
            sb.append("IsDefault: ").append(getIsDefault());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBProxyEndpoint == false)
            return false;
        DBProxyEndpoint other = (DBProxyEndpoint) obj;
        if (other.getDBProxyEndpointName() == null ^ this.getDBProxyEndpointName() == null)
            return false;
        if (other.getDBProxyEndpointName() != null && other.getDBProxyEndpointName().equals(this.getDBProxyEndpointName()) == false)
            return false;
        if (other.getDBProxyEndpointArn() == null ^ this.getDBProxyEndpointArn() == null)
            return false;
        if (other.getDBProxyEndpointArn() != null && other.getDBProxyEndpointArn().equals(this.getDBProxyEndpointArn()) == false)
            return false;
        if (other.getDBProxyName() == null ^ this.getDBProxyName() == null)
            return false;
        if (other.getDBProxyName() != null && other.getDBProxyName().equals(this.getDBProxyName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false)
            return false;
        if (other.getVpcSubnetIds() == null ^ this.getVpcSubnetIds() == null)
            return false;
        if (other.getVpcSubnetIds() != null && other.getVpcSubnetIds().equals(this.getVpcSubnetIds()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getTargetRole() == null ^ this.getTargetRole() == null)
            return false;
        if (other.getTargetRole() != null && other.getTargetRole().equals(this.getTargetRole()) == false)
            return false;
        if (other.getIsDefault() == null ^ this.getIsDefault() == null)
            return false;
        if (other.getIsDefault() != null && other.getIsDefault().equals(this.getIsDefault()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBProxyEndpointName() == null) ? 0 : getDBProxyEndpointName().hashCode());
        hashCode = prime * hashCode + ((getDBProxyEndpointArn() == null) ? 0 : getDBProxyEndpointArn().hashCode());
        hashCode = prime * hashCode + ((getDBProxyName() == null) ? 0 : getDBProxyName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getVpcSubnetIds() == null) ? 0 : getVpcSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getTargetRole() == null) ? 0 : getTargetRole().hashCode());
        hashCode = prime * hashCode + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        return hashCode;
    }

    @Override
    public DBProxyEndpoint clone() {
        try {
            return (DBProxyEndpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
