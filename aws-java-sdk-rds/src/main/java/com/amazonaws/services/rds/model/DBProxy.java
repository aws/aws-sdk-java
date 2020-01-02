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
 * The data structure representing a proxy managed by the RDS Proxy.
 * </p>
 * <p>
 * This data type is used as a response element in the <code>DescribeDBProxies</code> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DBProxy" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBProxy implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the proxy. This name must be unique for all proxies owned by your AWS account in the specified
     * AWS Region.
     * </p>
     */
    private String dBProxyName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the proxy.
     * </p>
     */
    private String dBProxyArn;
    /**
     * <p>
     * The current status of this proxy. A status of <code>available</code> means the proxy is ready to handle requests.
     * Other values indicate that you must wait for the proxy to be ready, or take some action to resolve an issue.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Currently, this value is always <code>MYSQL</code>. The engine family applies to both RDS MySQL and Aurora MySQL.
     * </p>
     */
    private String engineFamily;
    /**
     * <p>
     * Provides a list of VPC security groups that the proxy belongs to.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIds;
    /**
     * <p>
     * The EC2 subnet IDs for the proxy.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> vpcSubnetIds;
    /**
     * <p>
     * One or more data structures specifying the authorization mechanism to connect to the associated RDS DB instance
     * or Aurora DB cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<UserAuthConfigInfo> auth;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the IAM role that the proxy uses to access Amazon Secrets Manager.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The endpoint that you can use to connect to the proxy. You include the endpoint value in the connection string
     * for a database client application.
     * </p>
     */
    private String endpoint;
    /**
     * <p>
     * Indicates whether Transport Layer Security (TLS) encryption is required for connections to the proxy.
     * </p>
     */
    private Boolean requireTLS;
    /**
     * <p>
     * The number of seconds a connection to the proxy can have no activity before the proxy drops the client
     * connection. The proxy keeps the underlying database connection open and puts it back into the connection pool for
     * reuse by later connection requests.
     * </p>
     * <p>
     * Default: 1800 (30 minutes)
     * </p>
     * <p>
     * Constraints: 1 to 28,800
     * </p>
     */
    private Integer idleClientTimeout;
    /**
     * <p>
     * Whether the proxy includes detailed information about SQL statements in its logs. This information helps you to
     * debug issues involving SQL behavior or the performance and scalability of the proxy connections. The debug
     * information includes the text of SQL statements that you submit through the proxy. Thus, only enable this setting
     * when needed for debugging, and only when you have security measures in place to safeguard any sensitive
     * information that appears in the logs.
     * </p>
     */
    private Boolean debugLogging;
    /**
     * <p>
     * The date and time when the proxy was first created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The date and time when the proxy was last updated.
     * </p>
     */
    private java.util.Date updatedDate;

    /**
     * <p>
     * The identifier for the proxy. This name must be unique for all proxies owned by your AWS account in the specified
     * AWS Region.
     * </p>
     * 
     * @param dBProxyName
     *        The identifier for the proxy. This name must be unique for all proxies owned by your AWS account in the
     *        specified AWS Region.
     */

    public void setDBProxyName(String dBProxyName) {
        this.dBProxyName = dBProxyName;
    }

    /**
     * <p>
     * The identifier for the proxy. This name must be unique for all proxies owned by your AWS account in the specified
     * AWS Region.
     * </p>
     * 
     * @return The identifier for the proxy. This name must be unique for all proxies owned by your AWS account in the
     *         specified AWS Region.
     */

    public String getDBProxyName() {
        return this.dBProxyName;
    }

    /**
     * <p>
     * The identifier for the proxy. This name must be unique for all proxies owned by your AWS account in the specified
     * AWS Region.
     * </p>
     * 
     * @param dBProxyName
     *        The identifier for the proxy. This name must be unique for all proxies owned by your AWS account in the
     *        specified AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxy withDBProxyName(String dBProxyName) {
        setDBProxyName(dBProxyName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the proxy.
     * </p>
     * 
     * @param dBProxyArn
     *        The Amazon Resource Name (ARN) for the proxy.
     */

    public void setDBProxyArn(String dBProxyArn) {
        this.dBProxyArn = dBProxyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the proxy.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the proxy.
     */

    public String getDBProxyArn() {
        return this.dBProxyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the proxy.
     * </p>
     * 
     * @param dBProxyArn
     *        The Amazon Resource Name (ARN) for the proxy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxy withDBProxyArn(String dBProxyArn) {
        setDBProxyArn(dBProxyArn);
        return this;
    }

    /**
     * <p>
     * The current status of this proxy. A status of <code>available</code> means the proxy is ready to handle requests.
     * Other values indicate that you must wait for the proxy to be ready, or take some action to resolve an issue.
     * </p>
     * 
     * @param status
     *        The current status of this proxy. A status of <code>available</code> means the proxy is ready to handle
     *        requests. Other values indicate that you must wait for the proxy to be ready, or take some action to
     *        resolve an issue.
     * @see DBProxyStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of this proxy. A status of <code>available</code> means the proxy is ready to handle requests.
     * Other values indicate that you must wait for the proxy to be ready, or take some action to resolve an issue.
     * </p>
     * 
     * @return The current status of this proxy. A status of <code>available</code> means the proxy is ready to handle
     *         requests. Other values indicate that you must wait for the proxy to be ready, or take some action to
     *         resolve an issue.
     * @see DBProxyStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of this proxy. A status of <code>available</code> means the proxy is ready to handle requests.
     * Other values indicate that you must wait for the proxy to be ready, or take some action to resolve an issue.
     * </p>
     * 
     * @param status
     *        The current status of this proxy. A status of <code>available</code> means the proxy is ready to handle
     *        requests. Other values indicate that you must wait for the proxy to be ready, or take some action to
     *        resolve an issue.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DBProxyStatus
     */

    public DBProxy withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of this proxy. A status of <code>available</code> means the proxy is ready to handle requests.
     * Other values indicate that you must wait for the proxy to be ready, or take some action to resolve an issue.
     * </p>
     * 
     * @param status
     *        The current status of this proxy. A status of <code>available</code> means the proxy is ready to handle
     *        requests. Other values indicate that you must wait for the proxy to be ready, or take some action to
     *        resolve an issue.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DBProxyStatus
     */

    public DBProxy withStatus(DBProxyStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Currently, this value is always <code>MYSQL</code>. The engine family applies to both RDS MySQL and Aurora MySQL.
     * </p>
     * 
     * @param engineFamily
     *        Currently, this value is always <code>MYSQL</code>. The engine family applies to both RDS MySQL and Aurora
     *        MySQL.
     */

    public void setEngineFamily(String engineFamily) {
        this.engineFamily = engineFamily;
    }

    /**
     * <p>
     * Currently, this value is always <code>MYSQL</code>. The engine family applies to both RDS MySQL and Aurora MySQL.
     * </p>
     * 
     * @return Currently, this value is always <code>MYSQL</code>. The engine family applies to both RDS MySQL and
     *         Aurora MySQL.
     */

    public String getEngineFamily() {
        return this.engineFamily;
    }

    /**
     * <p>
     * Currently, this value is always <code>MYSQL</code>. The engine family applies to both RDS MySQL and Aurora MySQL.
     * </p>
     * 
     * @param engineFamily
     *        Currently, this value is always <code>MYSQL</code>. The engine family applies to both RDS MySQL and Aurora
     *        MySQL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxy withEngineFamily(String engineFamily) {
        setEngineFamily(engineFamily);
        return this;
    }

    /**
     * <p>
     * Provides a list of VPC security groups that the proxy belongs to.
     * </p>
     * 
     * @return Provides a list of VPC security groups that the proxy belongs to.
     */

    public java.util.List<String> getVpcSecurityGroupIds() {
        if (vpcSecurityGroupIds == null) {
            vpcSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * Provides a list of VPC security groups that the proxy belongs to.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        Provides a list of VPC security groups that the proxy belongs to.
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
     * Provides a list of VPC security groups that the proxy belongs to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroupIds(java.util.Collection)} or {@link #withVpcSecurityGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        Provides a list of VPC security groups that the proxy belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxy withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
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
     * Provides a list of VPC security groups that the proxy belongs to.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        Provides a list of VPC security groups that the proxy belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxy withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * The EC2 subnet IDs for the proxy.
     * </p>
     * 
     * @return The EC2 subnet IDs for the proxy.
     */

    public java.util.List<String> getVpcSubnetIds() {
        if (vpcSubnetIds == null) {
            vpcSubnetIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return vpcSubnetIds;
    }

    /**
     * <p>
     * The EC2 subnet IDs for the proxy.
     * </p>
     * 
     * @param vpcSubnetIds
     *        The EC2 subnet IDs for the proxy.
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
     * The EC2 subnet IDs for the proxy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSubnetIds(java.util.Collection)} or {@link #withVpcSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param vpcSubnetIds
     *        The EC2 subnet IDs for the proxy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxy withVpcSubnetIds(String... vpcSubnetIds) {
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
     * The EC2 subnet IDs for the proxy.
     * </p>
     * 
     * @param vpcSubnetIds
     *        The EC2 subnet IDs for the proxy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxy withVpcSubnetIds(java.util.Collection<String> vpcSubnetIds) {
        setVpcSubnetIds(vpcSubnetIds);
        return this;
    }

    /**
     * <p>
     * One or more data structures specifying the authorization mechanism to connect to the associated RDS DB instance
     * or Aurora DB cluster.
     * </p>
     * 
     * @return One or more data structures specifying the authorization mechanism to connect to the associated RDS DB
     *         instance or Aurora DB cluster.
     */

    public java.util.List<UserAuthConfigInfo> getAuth() {
        if (auth == null) {
            auth = new com.amazonaws.internal.SdkInternalList<UserAuthConfigInfo>();
        }
        return auth;
    }

    /**
     * <p>
     * One or more data structures specifying the authorization mechanism to connect to the associated RDS DB instance
     * or Aurora DB cluster.
     * </p>
     * 
     * @param auth
     *        One or more data structures specifying the authorization mechanism to connect to the associated RDS DB
     *        instance or Aurora DB cluster.
     */

    public void setAuth(java.util.Collection<UserAuthConfigInfo> auth) {
        if (auth == null) {
            this.auth = null;
            return;
        }

        this.auth = new com.amazonaws.internal.SdkInternalList<UserAuthConfigInfo>(auth);
    }

    /**
     * <p>
     * One or more data structures specifying the authorization mechanism to connect to the associated RDS DB instance
     * or Aurora DB cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuth(java.util.Collection)} or {@link #withAuth(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param auth
     *        One or more data structures specifying the authorization mechanism to connect to the associated RDS DB
     *        instance or Aurora DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxy withAuth(UserAuthConfigInfo... auth) {
        if (this.auth == null) {
            setAuth(new com.amazonaws.internal.SdkInternalList<UserAuthConfigInfo>(auth.length));
        }
        for (UserAuthConfigInfo ele : auth) {
            this.auth.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more data structures specifying the authorization mechanism to connect to the associated RDS DB instance
     * or Aurora DB cluster.
     * </p>
     * 
     * @param auth
     *        One or more data structures specifying the authorization mechanism to connect to the associated RDS DB
     *        instance or Aurora DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxy withAuth(java.util.Collection<UserAuthConfigInfo> auth) {
        setAuth(auth);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the IAM role that the proxy uses to access Amazon Secrets Manager.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) for the IAM role that the proxy uses to access Amazon Secrets Manager.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the IAM role that the proxy uses to access Amazon Secrets Manager.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the IAM role that the proxy uses to access Amazon Secrets Manager.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the IAM role that the proxy uses to access Amazon Secrets Manager.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) for the IAM role that the proxy uses to access Amazon Secrets Manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxy withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The endpoint that you can use to connect to the proxy. You include the endpoint value in the connection string
     * for a database client application.
     * </p>
     * 
     * @param endpoint
     *        The endpoint that you can use to connect to the proxy. You include the endpoint value in the connection
     *        string for a database client application.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The endpoint that you can use to connect to the proxy. You include the endpoint value in the connection string
     * for a database client application.
     * </p>
     * 
     * @return The endpoint that you can use to connect to the proxy. You include the endpoint value in the connection
     *         string for a database client application.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The endpoint that you can use to connect to the proxy. You include the endpoint value in the connection string
     * for a database client application.
     * </p>
     * 
     * @param endpoint
     *        The endpoint that you can use to connect to the proxy. You include the endpoint value in the connection
     *        string for a database client application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxy withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * Indicates whether Transport Layer Security (TLS) encryption is required for connections to the proxy.
     * </p>
     * 
     * @param requireTLS
     *        Indicates whether Transport Layer Security (TLS) encryption is required for connections to the proxy.
     */

    public void setRequireTLS(Boolean requireTLS) {
        this.requireTLS = requireTLS;
    }

    /**
     * <p>
     * Indicates whether Transport Layer Security (TLS) encryption is required for connections to the proxy.
     * </p>
     * 
     * @return Indicates whether Transport Layer Security (TLS) encryption is required for connections to the proxy.
     */

    public Boolean getRequireTLS() {
        return this.requireTLS;
    }

    /**
     * <p>
     * Indicates whether Transport Layer Security (TLS) encryption is required for connections to the proxy.
     * </p>
     * 
     * @param requireTLS
     *        Indicates whether Transport Layer Security (TLS) encryption is required for connections to the proxy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxy withRequireTLS(Boolean requireTLS) {
        setRequireTLS(requireTLS);
        return this;
    }

    /**
     * <p>
     * Indicates whether Transport Layer Security (TLS) encryption is required for connections to the proxy.
     * </p>
     * 
     * @return Indicates whether Transport Layer Security (TLS) encryption is required for connections to the proxy.
     */

    public Boolean isRequireTLS() {
        return this.requireTLS;
    }

    /**
     * <p>
     * The number of seconds a connection to the proxy can have no activity before the proxy drops the client
     * connection. The proxy keeps the underlying database connection open and puts it back into the connection pool for
     * reuse by later connection requests.
     * </p>
     * <p>
     * Default: 1800 (30 minutes)
     * </p>
     * <p>
     * Constraints: 1 to 28,800
     * </p>
     * 
     * @param idleClientTimeout
     *        The number of seconds a connection to the proxy can have no activity before the proxy drops the client
     *        connection. The proxy keeps the underlying database connection open and puts it back into the connection
     *        pool for reuse by later connection requests.</p>
     *        <p>
     *        Default: 1800 (30 minutes)
     *        </p>
     *        <p>
     *        Constraints: 1 to 28,800
     */

    public void setIdleClientTimeout(Integer idleClientTimeout) {
        this.idleClientTimeout = idleClientTimeout;
    }

    /**
     * <p>
     * The number of seconds a connection to the proxy can have no activity before the proxy drops the client
     * connection. The proxy keeps the underlying database connection open and puts it back into the connection pool for
     * reuse by later connection requests.
     * </p>
     * <p>
     * Default: 1800 (30 minutes)
     * </p>
     * <p>
     * Constraints: 1 to 28,800
     * </p>
     * 
     * @return The number of seconds a connection to the proxy can have no activity before the proxy drops the client
     *         connection. The proxy keeps the underlying database connection open and puts it back into the connection
     *         pool for reuse by later connection requests.</p>
     *         <p>
     *         Default: 1800 (30 minutes)
     *         </p>
     *         <p>
     *         Constraints: 1 to 28,800
     */

    public Integer getIdleClientTimeout() {
        return this.idleClientTimeout;
    }

    /**
     * <p>
     * The number of seconds a connection to the proxy can have no activity before the proxy drops the client
     * connection. The proxy keeps the underlying database connection open and puts it back into the connection pool for
     * reuse by later connection requests.
     * </p>
     * <p>
     * Default: 1800 (30 minutes)
     * </p>
     * <p>
     * Constraints: 1 to 28,800
     * </p>
     * 
     * @param idleClientTimeout
     *        The number of seconds a connection to the proxy can have no activity before the proxy drops the client
     *        connection. The proxy keeps the underlying database connection open and puts it back into the connection
     *        pool for reuse by later connection requests.</p>
     *        <p>
     *        Default: 1800 (30 minutes)
     *        </p>
     *        <p>
     *        Constraints: 1 to 28,800
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxy withIdleClientTimeout(Integer idleClientTimeout) {
        setIdleClientTimeout(idleClientTimeout);
        return this;
    }

    /**
     * <p>
     * Whether the proxy includes detailed information about SQL statements in its logs. This information helps you to
     * debug issues involving SQL behavior or the performance and scalability of the proxy connections. The debug
     * information includes the text of SQL statements that you submit through the proxy. Thus, only enable this setting
     * when needed for debugging, and only when you have security measures in place to safeguard any sensitive
     * information that appears in the logs.
     * </p>
     * 
     * @param debugLogging
     *        Whether the proxy includes detailed information about SQL statements in its logs. This information helps
     *        you to debug issues involving SQL behavior or the performance and scalability of the proxy connections.
     *        The debug information includes the text of SQL statements that you submit through the proxy. Thus, only
     *        enable this setting when needed for debugging, and only when you have security measures in place to
     *        safeguard any sensitive information that appears in the logs.
     */

    public void setDebugLogging(Boolean debugLogging) {
        this.debugLogging = debugLogging;
    }

    /**
     * <p>
     * Whether the proxy includes detailed information about SQL statements in its logs. This information helps you to
     * debug issues involving SQL behavior or the performance and scalability of the proxy connections. The debug
     * information includes the text of SQL statements that you submit through the proxy. Thus, only enable this setting
     * when needed for debugging, and only when you have security measures in place to safeguard any sensitive
     * information that appears in the logs.
     * </p>
     * 
     * @return Whether the proxy includes detailed information about SQL statements in its logs. This information helps
     *         you to debug issues involving SQL behavior or the performance and scalability of the proxy connections.
     *         The debug information includes the text of SQL statements that you submit through the proxy. Thus, only
     *         enable this setting when needed for debugging, and only when you have security measures in place to
     *         safeguard any sensitive information that appears in the logs.
     */

    public Boolean getDebugLogging() {
        return this.debugLogging;
    }

    /**
     * <p>
     * Whether the proxy includes detailed information about SQL statements in its logs. This information helps you to
     * debug issues involving SQL behavior or the performance and scalability of the proxy connections. The debug
     * information includes the text of SQL statements that you submit through the proxy. Thus, only enable this setting
     * when needed for debugging, and only when you have security measures in place to safeguard any sensitive
     * information that appears in the logs.
     * </p>
     * 
     * @param debugLogging
     *        Whether the proxy includes detailed information about SQL statements in its logs. This information helps
     *        you to debug issues involving SQL behavior or the performance and scalability of the proxy connections.
     *        The debug information includes the text of SQL statements that you submit through the proxy. Thus, only
     *        enable this setting when needed for debugging, and only when you have security measures in place to
     *        safeguard any sensitive information that appears in the logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxy withDebugLogging(Boolean debugLogging) {
        setDebugLogging(debugLogging);
        return this;
    }

    /**
     * <p>
     * Whether the proxy includes detailed information about SQL statements in its logs. This information helps you to
     * debug issues involving SQL behavior or the performance and scalability of the proxy connections. The debug
     * information includes the text of SQL statements that you submit through the proxy. Thus, only enable this setting
     * when needed for debugging, and only when you have security measures in place to safeguard any sensitive
     * information that appears in the logs.
     * </p>
     * 
     * @return Whether the proxy includes detailed information about SQL statements in its logs. This information helps
     *         you to debug issues involving SQL behavior or the performance and scalability of the proxy connections.
     *         The debug information includes the text of SQL statements that you submit through the proxy. Thus, only
     *         enable this setting when needed for debugging, and only when you have security measures in place to
     *         safeguard any sensitive information that appears in the logs.
     */

    public Boolean isDebugLogging() {
        return this.debugLogging;
    }

    /**
     * <p>
     * The date and time when the proxy was first created.
     * </p>
     * 
     * @param createdDate
     *        The date and time when the proxy was first created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date and time when the proxy was first created.
     * </p>
     * 
     * @return The date and time when the proxy was first created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date and time when the proxy was first created.
     * </p>
     * 
     * @param createdDate
     *        The date and time when the proxy was first created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxy withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The date and time when the proxy was last updated.
     * </p>
     * 
     * @param updatedDate
     *        The date and time when the proxy was last updated.
     */

    public void setUpdatedDate(java.util.Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    /**
     * <p>
     * The date and time when the proxy was last updated.
     * </p>
     * 
     * @return The date and time when the proxy was last updated.
     */

    public java.util.Date getUpdatedDate() {
        return this.updatedDate;
    }

    /**
     * <p>
     * The date and time when the proxy was last updated.
     * </p>
     * 
     * @param updatedDate
     *        The date and time when the proxy was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxy withUpdatedDate(java.util.Date updatedDate) {
        setUpdatedDate(updatedDate);
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
        if (getDBProxyName() != null)
            sb.append("DBProxyName: ").append(getDBProxyName()).append(",");
        if (getDBProxyArn() != null)
            sb.append("DBProxyArn: ").append(getDBProxyArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getEngineFamily() != null)
            sb.append("EngineFamily: ").append(getEngineFamily()).append(",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: ").append(getVpcSecurityGroupIds()).append(",");
        if (getVpcSubnetIds() != null)
            sb.append("VpcSubnetIds: ").append(getVpcSubnetIds()).append(",");
        if (getAuth() != null)
            sb.append("Auth: ").append(getAuth()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getRequireTLS() != null)
            sb.append("RequireTLS: ").append(getRequireTLS()).append(",");
        if (getIdleClientTimeout() != null)
            sb.append("IdleClientTimeout: ").append(getIdleClientTimeout()).append(",");
        if (getDebugLogging() != null)
            sb.append("DebugLogging: ").append(getDebugLogging()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getUpdatedDate() != null)
            sb.append("UpdatedDate: ").append(getUpdatedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBProxy == false)
            return false;
        DBProxy other = (DBProxy) obj;
        if (other.getDBProxyName() == null ^ this.getDBProxyName() == null)
            return false;
        if (other.getDBProxyName() != null && other.getDBProxyName().equals(this.getDBProxyName()) == false)
            return false;
        if (other.getDBProxyArn() == null ^ this.getDBProxyArn() == null)
            return false;
        if (other.getDBProxyArn() != null && other.getDBProxyArn().equals(this.getDBProxyArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEngineFamily() == null ^ this.getEngineFamily() == null)
            return false;
        if (other.getEngineFamily() != null && other.getEngineFamily().equals(this.getEngineFamily()) == false)
            return false;
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false)
            return false;
        if (other.getVpcSubnetIds() == null ^ this.getVpcSubnetIds() == null)
            return false;
        if (other.getVpcSubnetIds() != null && other.getVpcSubnetIds().equals(this.getVpcSubnetIds()) == false)
            return false;
        if (other.getAuth() == null ^ this.getAuth() == null)
            return false;
        if (other.getAuth() != null && other.getAuth().equals(this.getAuth()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getRequireTLS() == null ^ this.getRequireTLS() == null)
            return false;
        if (other.getRequireTLS() != null && other.getRequireTLS().equals(this.getRequireTLS()) == false)
            return false;
        if (other.getIdleClientTimeout() == null ^ this.getIdleClientTimeout() == null)
            return false;
        if (other.getIdleClientTimeout() != null && other.getIdleClientTimeout().equals(this.getIdleClientTimeout()) == false)
            return false;
        if (other.getDebugLogging() == null ^ this.getDebugLogging() == null)
            return false;
        if (other.getDebugLogging() != null && other.getDebugLogging().equals(this.getDebugLogging()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getUpdatedDate() == null ^ this.getUpdatedDate() == null)
            return false;
        if (other.getUpdatedDate() != null && other.getUpdatedDate().equals(this.getUpdatedDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBProxyName() == null) ? 0 : getDBProxyName().hashCode());
        hashCode = prime * hashCode + ((getDBProxyArn() == null) ? 0 : getDBProxyArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getEngineFamily() == null) ? 0 : getEngineFamily().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getVpcSubnetIds() == null) ? 0 : getVpcSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getAuth() == null) ? 0 : getAuth().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getRequireTLS() == null) ? 0 : getRequireTLS().hashCode());
        hashCode = prime * hashCode + ((getIdleClientTimeout() == null) ? 0 : getIdleClientTimeout().hashCode());
        hashCode = prime * hashCode + ((getDebugLogging() == null) ? 0 : getDebugLogging().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getUpdatedDate() == null) ? 0 : getUpdatedDate().hashCode());
        return hashCode;
    }

    @Override
    public DBProxy clone() {
        try {
            return (DBProxy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
