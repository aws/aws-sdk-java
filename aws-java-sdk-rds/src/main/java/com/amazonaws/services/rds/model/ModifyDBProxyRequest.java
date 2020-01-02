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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBProxy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyDBProxyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the <code>DBProxy</code> to modify.
     * </p>
     */
    private String dBProxyName;
    /**
     * <p>
     * The new identifier for the <code>DBProxy</code>. An identifier must begin with a letter and must contain only
     * ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     */
    private String newDBProxyName;
    /**
     * <p>
     * The new authentication settings for the <code>DBProxy</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<UserAuthConfig> auth;
    /**
     * <p>
     * Whether Transport Layer Security (TLS) encryption is required for connections to the proxy. By enabling this
     * setting, you can enforce encrypted TLS connections to the proxy, even if the associated database doesn't use TLS.
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
     * The Amazon Resource Name (ARN) of the IAM role that the proxy uses to access secrets in AWS Secrets Manager.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The new list of security groups for the <code>DBProxy</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> securityGroups;

    /**
     * <p>
     * The identifier for the <code>DBProxy</code> to modify.
     * </p>
     * 
     * @param dBProxyName
     *        The identifier for the <code>DBProxy</code> to modify.
     */

    public void setDBProxyName(String dBProxyName) {
        this.dBProxyName = dBProxyName;
    }

    /**
     * <p>
     * The identifier for the <code>DBProxy</code> to modify.
     * </p>
     * 
     * @return The identifier for the <code>DBProxy</code> to modify.
     */

    public String getDBProxyName() {
        return this.dBProxyName;
    }

    /**
     * <p>
     * The identifier for the <code>DBProxy</code> to modify.
     * </p>
     * 
     * @param dBProxyName
     *        The identifier for the <code>DBProxy</code> to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBProxyRequest withDBProxyName(String dBProxyName) {
        setDBProxyName(dBProxyName);
        return this;
    }

    /**
     * <p>
     * The new identifier for the <code>DBProxy</code>. An identifier must begin with a letter and must contain only
     * ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * 
     * @param newDBProxyName
     *        The new identifier for the <code>DBProxy</code>. An identifier must begin with a letter and must contain
     *        only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     */

    public void setNewDBProxyName(String newDBProxyName) {
        this.newDBProxyName = newDBProxyName;
    }

    /**
     * <p>
     * The new identifier for the <code>DBProxy</code>. An identifier must begin with a letter and must contain only
     * ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * 
     * @return The new identifier for the <code>DBProxy</code>. An identifier must begin with a letter and must contain
     *         only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     */

    public String getNewDBProxyName() {
        return this.newDBProxyName;
    }

    /**
     * <p>
     * The new identifier for the <code>DBProxy</code>. An identifier must begin with a letter and must contain only
     * ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * 
     * @param newDBProxyName
     *        The new identifier for the <code>DBProxy</code>. An identifier must begin with a letter and must contain
     *        only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBProxyRequest withNewDBProxyName(String newDBProxyName) {
        setNewDBProxyName(newDBProxyName);
        return this;
    }

    /**
     * <p>
     * The new authentication settings for the <code>DBProxy</code>.
     * </p>
     * 
     * @return The new authentication settings for the <code>DBProxy</code>.
     */

    public java.util.List<UserAuthConfig> getAuth() {
        if (auth == null) {
            auth = new com.amazonaws.internal.SdkInternalList<UserAuthConfig>();
        }
        return auth;
    }

    /**
     * <p>
     * The new authentication settings for the <code>DBProxy</code>.
     * </p>
     * 
     * @param auth
     *        The new authentication settings for the <code>DBProxy</code>.
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
     * The new authentication settings for the <code>DBProxy</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuth(java.util.Collection)} or {@link #withAuth(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param auth
     *        The new authentication settings for the <code>DBProxy</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBProxyRequest withAuth(UserAuthConfig... auth) {
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
     * The new authentication settings for the <code>DBProxy</code>.
     * </p>
     * 
     * @param auth
     *        The new authentication settings for the <code>DBProxy</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBProxyRequest withAuth(java.util.Collection<UserAuthConfig> auth) {
        setAuth(auth);
        return this;
    }

    /**
     * <p>
     * Whether Transport Layer Security (TLS) encryption is required for connections to the proxy. By enabling this
     * setting, you can enforce encrypted TLS connections to the proxy, even if the associated database doesn't use TLS.
     * </p>
     * 
     * @param requireTLS
     *        Whether Transport Layer Security (TLS) encryption is required for connections to the proxy. By enabling
     *        this setting, you can enforce encrypted TLS connections to the proxy, even if the associated database
     *        doesn't use TLS.
     */

    public void setRequireTLS(Boolean requireTLS) {
        this.requireTLS = requireTLS;
    }

    /**
     * <p>
     * Whether Transport Layer Security (TLS) encryption is required for connections to the proxy. By enabling this
     * setting, you can enforce encrypted TLS connections to the proxy, even if the associated database doesn't use TLS.
     * </p>
     * 
     * @return Whether Transport Layer Security (TLS) encryption is required for connections to the proxy. By enabling
     *         this setting, you can enforce encrypted TLS connections to the proxy, even if the associated database
     *         doesn't use TLS.
     */

    public Boolean getRequireTLS() {
        return this.requireTLS;
    }

    /**
     * <p>
     * Whether Transport Layer Security (TLS) encryption is required for connections to the proxy. By enabling this
     * setting, you can enforce encrypted TLS connections to the proxy, even if the associated database doesn't use TLS.
     * </p>
     * 
     * @param requireTLS
     *        Whether Transport Layer Security (TLS) encryption is required for connections to the proxy. By enabling
     *        this setting, you can enforce encrypted TLS connections to the proxy, even if the associated database
     *        doesn't use TLS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBProxyRequest withRequireTLS(Boolean requireTLS) {
        setRequireTLS(requireTLS);
        return this;
    }

    /**
     * <p>
     * Whether Transport Layer Security (TLS) encryption is required for connections to the proxy. By enabling this
     * setting, you can enforce encrypted TLS connections to the proxy, even if the associated database doesn't use TLS.
     * </p>
     * 
     * @return Whether Transport Layer Security (TLS) encryption is required for connections to the proxy. By enabling
     *         this setting, you can enforce encrypted TLS connections to the proxy, even if the associated database
     *         doesn't use TLS.
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

    public ModifyDBProxyRequest withIdleClientTimeout(Integer idleClientTimeout) {
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

    public ModifyDBProxyRequest withDebugLogging(Boolean debugLogging) {
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

    public ModifyDBProxyRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The new list of security groups for the <code>DBProxy</code>.
     * </p>
     * 
     * @return The new list of security groups for the <code>DBProxy</code>.
     */

    public java.util.List<String> getSecurityGroups() {
        if (securityGroups == null) {
            securityGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return securityGroups;
    }

    /**
     * <p>
     * The new list of security groups for the <code>DBProxy</code>.
     * </p>
     * 
     * @param securityGroups
     *        The new list of security groups for the <code>DBProxy</code>.
     */

    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new com.amazonaws.internal.SdkInternalList<String>(securityGroups);
    }

    /**
     * <p>
     * The new list of security groups for the <code>DBProxy</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        The new list of security groups for the <code>DBProxy</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBProxyRequest withSecurityGroups(String... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new com.amazonaws.internal.SdkInternalList<String>(securityGroups.length));
        }
        for (String ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The new list of security groups for the <code>DBProxy</code>.
     * </p>
     * 
     * @param securityGroups
     *        The new list of security groups for the <code>DBProxy</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBProxyRequest withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
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
        if (getNewDBProxyName() != null)
            sb.append("NewDBProxyName: ").append(getNewDBProxyName()).append(",");
        if (getAuth() != null)
            sb.append("Auth: ").append(getAuth()).append(",");
        if (getRequireTLS() != null)
            sb.append("RequireTLS: ").append(getRequireTLS()).append(",");
        if (getIdleClientTimeout() != null)
            sb.append("IdleClientTimeout: ").append(getIdleClientTimeout()).append(",");
        if (getDebugLogging() != null)
            sb.append("DebugLogging: ").append(getDebugLogging()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyDBProxyRequest == false)
            return false;
        ModifyDBProxyRequest other = (ModifyDBProxyRequest) obj;
        if (other.getDBProxyName() == null ^ this.getDBProxyName() == null)
            return false;
        if (other.getDBProxyName() != null && other.getDBProxyName().equals(this.getDBProxyName()) == false)
            return false;
        if (other.getNewDBProxyName() == null ^ this.getNewDBProxyName() == null)
            return false;
        if (other.getNewDBProxyName() != null && other.getNewDBProxyName().equals(this.getNewDBProxyName()) == false)
            return false;
        if (other.getAuth() == null ^ this.getAuth() == null)
            return false;
        if (other.getAuth() != null && other.getAuth().equals(this.getAuth()) == false)
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
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBProxyName() == null) ? 0 : getDBProxyName().hashCode());
        hashCode = prime * hashCode + ((getNewDBProxyName() == null) ? 0 : getNewDBProxyName().hashCode());
        hashCode = prime * hashCode + ((getAuth() == null) ? 0 : getAuth().hashCode());
        hashCode = prime * hashCode + ((getRequireTLS() == null) ? 0 : getRequireTLS().hashCode());
        hashCode = prime * hashCode + ((getIdleClientTimeout() == null) ? 0 : getIdleClientTimeout().hashCode());
        hashCode = prime * hashCode + ((getDebugLogging() == null) ? 0 : getDebugLogging().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        return hashCode;
    }

    @Override
    public ModifyDBProxyRequest clone() {
        return (ModifyDBProxyRequest) super.clone();
    }

}
