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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBProxy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDBProxyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the proxy. This name must be unique for all proxies owned by your AWS account in the specified
     * AWS Region. An identifier must begin with a letter and must contain only ASCII letters, digits, and hyphens; it
     * can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     */
    private String dBProxyName;
    /**
     * <p>
     * The kinds of databases that the proxy can connect to. This value determines which database network protocol the
     * proxy recognizes when it interprets network traffic to and from the database. Currently, this value is always
     * <code>MYSQL</code>. The engine family applies to both RDS MySQL and Aurora MySQL.
     * </p>
     */
    private String engineFamily;
    /**
     * <p>
     * The authorization mechanism that the proxy uses.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<UserAuthConfig> auth;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that the proxy uses to access secrets in AWS Secrets Manager.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * One or more VPC subnet IDs to associate with the new proxy.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> vpcSubnetIds;
    /**
     * <p>
     * One or more VPC security group IDs to associate with the new proxy.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIds;
    /**
     * <p>
     * A Boolean parameter that specifies whether Transport Layer Security (TLS) encryption is required for connections
     * to the proxy. By enabling this setting, you can enforce encrypted TLS connections to the proxy.
     * </p>
     */
    private Boolean requireTLS;
    /**
     * <p>
     * The number of seconds that a connection to the proxy can be inactive before the proxy disconnects it. You can set
     * this value higher or lower than the connection timeout limit for the associated database.
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
     * An optional set of key-value pairs to associate arbitrary data of your choosing with the proxy.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The identifier for the proxy. This name must be unique for all proxies owned by your AWS account in the specified
     * AWS Region. An identifier must begin with a letter and must contain only ASCII letters, digits, and hyphens; it
     * can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * 
     * @param dBProxyName
     *        The identifier for the proxy. This name must be unique for all proxies owned by your AWS account in the
     *        specified AWS Region. An identifier must begin with a letter and must contain only ASCII letters, digits,
     *        and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     */

    public void setDBProxyName(String dBProxyName) {
        this.dBProxyName = dBProxyName;
    }

    /**
     * <p>
     * The identifier for the proxy. This name must be unique for all proxies owned by your AWS account in the specified
     * AWS Region. An identifier must begin with a letter and must contain only ASCII letters, digits, and hyphens; it
     * can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * 
     * @return The identifier for the proxy. This name must be unique for all proxies owned by your AWS account in the
     *         specified AWS Region. An identifier must begin with a letter and must contain only ASCII letters, digits,
     *         and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     */

    public String getDBProxyName() {
        return this.dBProxyName;
    }

    /**
     * <p>
     * The identifier for the proxy. This name must be unique for all proxies owned by your AWS account in the specified
     * AWS Region. An identifier must begin with a letter and must contain only ASCII letters, digits, and hyphens; it
     * can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * 
     * @param dBProxyName
     *        The identifier for the proxy. This name must be unique for all proxies owned by your AWS account in the
     *        specified AWS Region. An identifier must begin with a letter and must contain only ASCII letters, digits,
     *        and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBProxyRequest withDBProxyName(String dBProxyName) {
        setDBProxyName(dBProxyName);
        return this;
    }

    /**
     * <p>
     * The kinds of databases that the proxy can connect to. This value determines which database network protocol the
     * proxy recognizes when it interprets network traffic to and from the database. Currently, this value is always
     * <code>MYSQL</code>. The engine family applies to both RDS MySQL and Aurora MySQL.
     * </p>
     * 
     * @param engineFamily
     *        The kinds of databases that the proxy can connect to. This value determines which database network
     *        protocol the proxy recognizes when it interprets network traffic to and from the database. Currently, this
     *        value is always <code>MYSQL</code>. The engine family applies to both RDS MySQL and Aurora MySQL.
     * @see EngineFamily
     */

    public void setEngineFamily(String engineFamily) {
        this.engineFamily = engineFamily;
    }

    /**
     * <p>
     * The kinds of databases that the proxy can connect to. This value determines which database network protocol the
     * proxy recognizes when it interprets network traffic to and from the database. Currently, this value is always
     * <code>MYSQL</code>. The engine family applies to both RDS MySQL and Aurora MySQL.
     * </p>
     * 
     * @return The kinds of databases that the proxy can connect to. This value determines which database network
     *         protocol the proxy recognizes when it interprets network traffic to and from the database. Currently,
     *         this value is always <code>MYSQL</code>. The engine family applies to both RDS MySQL and Aurora MySQL.
     * @see EngineFamily
     */

    public String getEngineFamily() {
        return this.engineFamily;
    }

    /**
     * <p>
     * The kinds of databases that the proxy can connect to. This value determines which database network protocol the
     * proxy recognizes when it interprets network traffic to and from the database. Currently, this value is always
     * <code>MYSQL</code>. The engine family applies to both RDS MySQL and Aurora MySQL.
     * </p>
     * 
     * @param engineFamily
     *        The kinds of databases that the proxy can connect to. This value determines which database network
     *        protocol the proxy recognizes when it interprets network traffic to and from the database. Currently, this
     *        value is always <code>MYSQL</code>. The engine family applies to both RDS MySQL and Aurora MySQL.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineFamily
     */

    public CreateDBProxyRequest withEngineFamily(String engineFamily) {
        setEngineFamily(engineFamily);
        return this;
    }

    /**
     * <p>
     * The kinds of databases that the proxy can connect to. This value determines which database network protocol the
     * proxy recognizes when it interprets network traffic to and from the database. Currently, this value is always
     * <code>MYSQL</code>. The engine family applies to both RDS MySQL and Aurora MySQL.
     * </p>
     * 
     * @param engineFamily
     *        The kinds of databases that the proxy can connect to. This value determines which database network
     *        protocol the proxy recognizes when it interprets network traffic to and from the database. Currently, this
     *        value is always <code>MYSQL</code>. The engine family applies to both RDS MySQL and Aurora MySQL.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineFamily
     */

    public CreateDBProxyRequest withEngineFamily(EngineFamily engineFamily) {
        this.engineFamily = engineFamily.toString();
        return this;
    }

    /**
     * <p>
     * The authorization mechanism that the proxy uses.
     * </p>
     * 
     * @return The authorization mechanism that the proxy uses.
     */

    public java.util.List<UserAuthConfig> getAuth() {
        if (auth == null) {
            auth = new com.amazonaws.internal.SdkInternalList<UserAuthConfig>();
        }
        return auth;
    }

    /**
     * <p>
     * The authorization mechanism that the proxy uses.
     * </p>
     * 
     * @param auth
     *        The authorization mechanism that the proxy uses.
     */

    public void setAuth(java.util.Collection<UserAuthConfig> auth) {
        if (auth == null) {
            this.auth = null;
            return;
        }

        this.auth = new com.amazonaws.internal.SdkInternalList<UserAuthConfig>(auth);
    }

    /**
     * <p>
     * The authorization mechanism that the proxy uses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuth(java.util.Collection)} or {@link #withAuth(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param auth
     *        The authorization mechanism that the proxy uses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBProxyRequest withAuth(UserAuthConfig... auth) {
        if (this.auth == null) {
            setAuth(new com.amazonaws.internal.SdkInternalList<UserAuthConfig>(auth.length));
        }
        for (UserAuthConfig ele : auth) {
            this.auth.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The authorization mechanism that the proxy uses.
     * </p>
     * 
     * @param auth
     *        The authorization mechanism that the proxy uses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBProxyRequest withAuth(java.util.Collection<UserAuthConfig> auth) {
        setAuth(auth);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that the proxy uses to access secrets in AWS Secrets Manager.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role that the proxy uses to access secrets in AWS Secrets
     *        Manager.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that the proxy uses to access secrets in AWS Secrets Manager.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that the proxy uses to access secrets in AWS Secrets
     *         Manager.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that the proxy uses to access secrets in AWS Secrets Manager.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role that the proxy uses to access secrets in AWS Secrets
     *        Manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBProxyRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * One or more VPC subnet IDs to associate with the new proxy.
     * </p>
     * 
     * @return One or more VPC subnet IDs to associate with the new proxy.
     */

    public java.util.List<String> getVpcSubnetIds() {
        if (vpcSubnetIds == null) {
            vpcSubnetIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return vpcSubnetIds;
    }

    /**
     * <p>
     * One or more VPC subnet IDs to associate with the new proxy.
     * </p>
     * 
     * @param vpcSubnetIds
     *        One or more VPC subnet IDs to associate with the new proxy.
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
     * One or more VPC subnet IDs to associate with the new proxy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSubnetIds(java.util.Collection)} or {@link #withVpcSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param vpcSubnetIds
     *        One or more VPC subnet IDs to associate with the new proxy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBProxyRequest withVpcSubnetIds(String... vpcSubnetIds) {
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
     * One or more VPC subnet IDs to associate with the new proxy.
     * </p>
     * 
     * @param vpcSubnetIds
     *        One or more VPC subnet IDs to associate with the new proxy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBProxyRequest withVpcSubnetIds(java.util.Collection<String> vpcSubnetIds) {
        setVpcSubnetIds(vpcSubnetIds);
        return this;
    }

    /**
     * <p>
     * One or more VPC security group IDs to associate with the new proxy.
     * </p>
     * 
     * @return One or more VPC security group IDs to associate with the new proxy.
     */

    public java.util.List<String> getVpcSecurityGroupIds() {
        if (vpcSecurityGroupIds == null) {
            vpcSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * One or more VPC security group IDs to associate with the new proxy.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        One or more VPC security group IDs to associate with the new proxy.
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
     * One or more VPC security group IDs to associate with the new proxy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroupIds(java.util.Collection)} or {@link #withVpcSecurityGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        One or more VPC security group IDs to associate with the new proxy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBProxyRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
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
     * One or more VPC security group IDs to associate with the new proxy.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        One or more VPC security group IDs to associate with the new proxy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBProxyRequest withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * A Boolean parameter that specifies whether Transport Layer Security (TLS) encryption is required for connections
     * to the proxy. By enabling this setting, you can enforce encrypted TLS connections to the proxy.
     * </p>
     * 
     * @param requireTLS
     *        A Boolean parameter that specifies whether Transport Layer Security (TLS) encryption is required for
     *        connections to the proxy. By enabling this setting, you can enforce encrypted TLS connections to the
     *        proxy.
     */

    public void setRequireTLS(Boolean requireTLS) {
        this.requireTLS = requireTLS;
    }

    /**
     * <p>
     * A Boolean parameter that specifies whether Transport Layer Security (TLS) encryption is required for connections
     * to the proxy. By enabling this setting, you can enforce encrypted TLS connections to the proxy.
     * </p>
     * 
     * @return A Boolean parameter that specifies whether Transport Layer Security (TLS) encryption is required for
     *         connections to the proxy. By enabling this setting, you can enforce encrypted TLS connections to the
     *         proxy.
     */

    public Boolean getRequireTLS() {
        return this.requireTLS;
    }

    /**
     * <p>
     * A Boolean parameter that specifies whether Transport Layer Security (TLS) encryption is required for connections
     * to the proxy. By enabling this setting, you can enforce encrypted TLS connections to the proxy.
     * </p>
     * 
     * @param requireTLS
     *        A Boolean parameter that specifies whether Transport Layer Security (TLS) encryption is required for
     *        connections to the proxy. By enabling this setting, you can enforce encrypted TLS connections to the
     *        proxy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBProxyRequest withRequireTLS(Boolean requireTLS) {
        setRequireTLS(requireTLS);
        return this;
    }

    /**
     * <p>
     * A Boolean parameter that specifies whether Transport Layer Security (TLS) encryption is required for connections
     * to the proxy. By enabling this setting, you can enforce encrypted TLS connections to the proxy.
     * </p>
     * 
     * @return A Boolean parameter that specifies whether Transport Layer Security (TLS) encryption is required for
     *         connections to the proxy. By enabling this setting, you can enforce encrypted TLS connections to the
     *         proxy.
     */

    public Boolean isRequireTLS() {
        return this.requireTLS;
    }

    /**
     * <p>
     * The number of seconds that a connection to the proxy can be inactive before the proxy disconnects it. You can set
     * this value higher or lower than the connection timeout limit for the associated database.
     * </p>
     * 
     * @param idleClientTimeout
     *        The number of seconds that a connection to the proxy can be inactive before the proxy disconnects it. You
     *        can set this value higher or lower than the connection timeout limit for the associated database.
     */

    public void setIdleClientTimeout(Integer idleClientTimeout) {
        this.idleClientTimeout = idleClientTimeout;
    }

    /**
     * <p>
     * The number of seconds that a connection to the proxy can be inactive before the proxy disconnects it. You can set
     * this value higher or lower than the connection timeout limit for the associated database.
     * </p>
     * 
     * @return The number of seconds that a connection to the proxy can be inactive before the proxy disconnects it. You
     *         can set this value higher or lower than the connection timeout limit for the associated database.
     */

    public Integer getIdleClientTimeout() {
        return this.idleClientTimeout;
    }

    /**
     * <p>
     * The number of seconds that a connection to the proxy can be inactive before the proxy disconnects it. You can set
     * this value higher or lower than the connection timeout limit for the associated database.
     * </p>
     * 
     * @param idleClientTimeout
     *        The number of seconds that a connection to the proxy can be inactive before the proxy disconnects it. You
     *        can set this value higher or lower than the connection timeout limit for the associated database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBProxyRequest withIdleClientTimeout(Integer idleClientTimeout) {
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

    public CreateDBProxyRequest withDebugLogging(Boolean debugLogging) {
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
     * An optional set of key-value pairs to associate arbitrary data of your choosing with the proxy.
     * </p>
     * 
     * @return An optional set of key-value pairs to associate arbitrary data of your choosing with the proxy.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * An optional set of key-value pairs to associate arbitrary data of your choosing with the proxy.
     * </p>
     * 
     * @param tags
     *        An optional set of key-value pairs to associate arbitrary data of your choosing with the proxy.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * An optional set of key-value pairs to associate arbitrary data of your choosing with the proxy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An optional set of key-value pairs to associate arbitrary data of your choosing with the proxy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBProxyRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An optional set of key-value pairs to associate arbitrary data of your choosing with the proxy.
     * </p>
     * 
     * @param tags
     *        An optional set of key-value pairs to associate arbitrary data of your choosing with the proxy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBProxyRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getEngineFamily() != null)
            sb.append("EngineFamily: ").append(getEngineFamily()).append(",");
        if (getAuth() != null)
            sb.append("Auth: ").append(getAuth()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getVpcSubnetIds() != null)
            sb.append("VpcSubnetIds: ").append(getVpcSubnetIds()).append(",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: ").append(getVpcSecurityGroupIds()).append(",");
        if (getRequireTLS() != null)
            sb.append("RequireTLS: ").append(getRequireTLS()).append(",");
        if (getIdleClientTimeout() != null)
            sb.append("IdleClientTimeout: ").append(getIdleClientTimeout()).append(",");
        if (getDebugLogging() != null)
            sb.append("DebugLogging: ").append(getDebugLogging()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDBProxyRequest == false)
            return false;
        CreateDBProxyRequest other = (CreateDBProxyRequest) obj;
        if (other.getDBProxyName() == null ^ this.getDBProxyName() == null)
            return false;
        if (other.getDBProxyName() != null && other.getDBProxyName().equals(this.getDBProxyName()) == false)
            return false;
        if (other.getEngineFamily() == null ^ this.getEngineFamily() == null)
            return false;
        if (other.getEngineFamily() != null && other.getEngineFamily().equals(this.getEngineFamily()) == false)
            return false;
        if (other.getAuth() == null ^ this.getAuth() == null)
            return false;
        if (other.getAuth() != null && other.getAuth().equals(this.getAuth()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getVpcSubnetIds() == null ^ this.getVpcSubnetIds() == null)
            return false;
        if (other.getVpcSubnetIds() != null && other.getVpcSubnetIds().equals(this.getVpcSubnetIds()) == false)
            return false;
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBProxyName() == null) ? 0 : getDBProxyName().hashCode());
        hashCode = prime * hashCode + ((getEngineFamily() == null) ? 0 : getEngineFamily().hashCode());
        hashCode = prime * hashCode + ((getAuth() == null) ? 0 : getAuth().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getVpcSubnetIds() == null) ? 0 : getVpcSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getRequireTLS() == null) ? 0 : getRequireTLS().hashCode());
        hashCode = prime * hashCode + ((getIdleClientTimeout() == null) ? 0 : getIdleClientTimeout().hashCode());
        hashCode = prime * hashCode + ((getDebugLogging() == null) ? 0 : getDebugLogging().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDBProxyRequest clone() {
        return (CreateDBProxyRequest) super.clone();
    }

}
