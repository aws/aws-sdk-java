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
 * Displays the settings that control the size and behavior of the connection pool associated with a
 * <code>DBProxyTarget</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ConnectionPoolConfigurationInfo"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectionPoolConfigurationInfo implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum size of the connection pool for each target in a target group. For Aurora MySQL, it is expressed as a
     * percentage of the <code>max_connections</code> setting for the RDS DB instance or Aurora DB cluster used by the
     * target group.
     * </p>
     */
    private Integer maxConnectionsPercent;
    /**
     * <p>
     * Controls how actively the proxy closes idle database connections in the connection pool. A high value enables the
     * proxy to leave a high percentage of idle connections open. A low value causes the proxy to close idle client
     * connections and return the underlying database connections to the connection pool. For Aurora MySQL, it is
     * expressed as a percentage of the <code>max_connections</code> setting for the RDS DB instance or Aurora DB
     * cluster used by the target group.
     * </p>
     */
    private Integer maxIdleConnectionsPercent;
    /**
     * <p>
     * The number of seconds for a proxy to wait for a connection to become available in the connection pool. Only
     * applies when the proxy has opened its maximum number of connections and all connections are busy with client
     * sessions.
     * </p>
     */
    private Integer connectionBorrowTimeout;
    /**
     * <p>
     * Each item in the list represents a class of SQL operations that normally cause all later statements in a session
     * using a proxy to be pinned to the same underlying database connection. Including an item in the list exempts that
     * class of SQL operations from the pinning behavior. Currently, the only allowed value is
     * <code>EXCLUDE_VARIABLE_SETS</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> sessionPinningFilters;
    /**
     * <p>
     * One or more SQL statements for the proxy to run when opening each new database connection. Typically used with
     * <code>SET</code> statements to make sure that each connection has identical settings such as time zone and
     * character set. This setting is empty by default. For multiple statements, use semicolons as the separator. You
     * can also include multiple variables in a single <code>SET</code> statement, such as <code>SET x=1, y=2</code>.
     * </p>
     */
    private String initQuery;

    /**
     * <p>
     * The maximum size of the connection pool for each target in a target group. For Aurora MySQL, it is expressed as a
     * percentage of the <code>max_connections</code> setting for the RDS DB instance or Aurora DB cluster used by the
     * target group.
     * </p>
     * 
     * @param maxConnectionsPercent
     *        The maximum size of the connection pool for each target in a target group. For Aurora MySQL, it is
     *        expressed as a percentage of the <code>max_connections</code> setting for the RDS DB instance or Aurora DB
     *        cluster used by the target group.
     */

    public void setMaxConnectionsPercent(Integer maxConnectionsPercent) {
        this.maxConnectionsPercent = maxConnectionsPercent;
    }

    /**
     * <p>
     * The maximum size of the connection pool for each target in a target group. For Aurora MySQL, it is expressed as a
     * percentage of the <code>max_connections</code> setting for the RDS DB instance or Aurora DB cluster used by the
     * target group.
     * </p>
     * 
     * @return The maximum size of the connection pool for each target in a target group. For Aurora MySQL, it is
     *         expressed as a percentage of the <code>max_connections</code> setting for the RDS DB instance or Aurora
     *         DB cluster used by the target group.
     */

    public Integer getMaxConnectionsPercent() {
        return this.maxConnectionsPercent;
    }

    /**
     * <p>
     * The maximum size of the connection pool for each target in a target group. For Aurora MySQL, it is expressed as a
     * percentage of the <code>max_connections</code> setting for the RDS DB instance or Aurora DB cluster used by the
     * target group.
     * </p>
     * 
     * @param maxConnectionsPercent
     *        The maximum size of the connection pool for each target in a target group. For Aurora MySQL, it is
     *        expressed as a percentage of the <code>max_connections</code> setting for the RDS DB instance or Aurora DB
     *        cluster used by the target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionPoolConfigurationInfo withMaxConnectionsPercent(Integer maxConnectionsPercent) {
        setMaxConnectionsPercent(maxConnectionsPercent);
        return this;
    }

    /**
     * <p>
     * Controls how actively the proxy closes idle database connections in the connection pool. A high value enables the
     * proxy to leave a high percentage of idle connections open. A low value causes the proxy to close idle client
     * connections and return the underlying database connections to the connection pool. For Aurora MySQL, it is
     * expressed as a percentage of the <code>max_connections</code> setting for the RDS DB instance or Aurora DB
     * cluster used by the target group.
     * </p>
     * 
     * @param maxIdleConnectionsPercent
     *        Controls how actively the proxy closes idle database connections in the connection pool. A high value
     *        enables the proxy to leave a high percentage of idle connections open. A low value causes the proxy to
     *        close idle client connections and return the underlying database connections to the connection pool. For
     *        Aurora MySQL, it is expressed as a percentage of the <code>max_connections</code> setting for the RDS DB
     *        instance or Aurora DB cluster used by the target group.
     */

    public void setMaxIdleConnectionsPercent(Integer maxIdleConnectionsPercent) {
        this.maxIdleConnectionsPercent = maxIdleConnectionsPercent;
    }

    /**
     * <p>
     * Controls how actively the proxy closes idle database connections in the connection pool. A high value enables the
     * proxy to leave a high percentage of idle connections open. A low value causes the proxy to close idle client
     * connections and return the underlying database connections to the connection pool. For Aurora MySQL, it is
     * expressed as a percentage of the <code>max_connections</code> setting for the RDS DB instance or Aurora DB
     * cluster used by the target group.
     * </p>
     * 
     * @return Controls how actively the proxy closes idle database connections in the connection pool. A high value
     *         enables the proxy to leave a high percentage of idle connections open. A low value causes the proxy to
     *         close idle client connections and return the underlying database connections to the connection pool. For
     *         Aurora MySQL, it is expressed as a percentage of the <code>max_connections</code> setting for the RDS DB
     *         instance or Aurora DB cluster used by the target group.
     */

    public Integer getMaxIdleConnectionsPercent() {
        return this.maxIdleConnectionsPercent;
    }

    /**
     * <p>
     * Controls how actively the proxy closes idle database connections in the connection pool. A high value enables the
     * proxy to leave a high percentage of idle connections open. A low value causes the proxy to close idle client
     * connections and return the underlying database connections to the connection pool. For Aurora MySQL, it is
     * expressed as a percentage of the <code>max_connections</code> setting for the RDS DB instance or Aurora DB
     * cluster used by the target group.
     * </p>
     * 
     * @param maxIdleConnectionsPercent
     *        Controls how actively the proxy closes idle database connections in the connection pool. A high value
     *        enables the proxy to leave a high percentage of idle connections open. A low value causes the proxy to
     *        close idle client connections and return the underlying database connections to the connection pool. For
     *        Aurora MySQL, it is expressed as a percentage of the <code>max_connections</code> setting for the RDS DB
     *        instance or Aurora DB cluster used by the target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionPoolConfigurationInfo withMaxIdleConnectionsPercent(Integer maxIdleConnectionsPercent) {
        setMaxIdleConnectionsPercent(maxIdleConnectionsPercent);
        return this;
    }

    /**
     * <p>
     * The number of seconds for a proxy to wait for a connection to become available in the connection pool. Only
     * applies when the proxy has opened its maximum number of connections and all connections are busy with client
     * sessions.
     * </p>
     * 
     * @param connectionBorrowTimeout
     *        The number of seconds for a proxy to wait for a connection to become available in the connection pool.
     *        Only applies when the proxy has opened its maximum number of connections and all connections are busy with
     *        client sessions.
     */

    public void setConnectionBorrowTimeout(Integer connectionBorrowTimeout) {
        this.connectionBorrowTimeout = connectionBorrowTimeout;
    }

    /**
     * <p>
     * The number of seconds for a proxy to wait for a connection to become available in the connection pool. Only
     * applies when the proxy has opened its maximum number of connections and all connections are busy with client
     * sessions.
     * </p>
     * 
     * @return The number of seconds for a proxy to wait for a connection to become available in the connection pool.
     *         Only applies when the proxy has opened its maximum number of connections and all connections are busy
     *         with client sessions.
     */

    public Integer getConnectionBorrowTimeout() {
        return this.connectionBorrowTimeout;
    }

    /**
     * <p>
     * The number of seconds for a proxy to wait for a connection to become available in the connection pool. Only
     * applies when the proxy has opened its maximum number of connections and all connections are busy with client
     * sessions.
     * </p>
     * 
     * @param connectionBorrowTimeout
     *        The number of seconds for a proxy to wait for a connection to become available in the connection pool.
     *        Only applies when the proxy has opened its maximum number of connections and all connections are busy with
     *        client sessions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionPoolConfigurationInfo withConnectionBorrowTimeout(Integer connectionBorrowTimeout) {
        setConnectionBorrowTimeout(connectionBorrowTimeout);
        return this;
    }

    /**
     * <p>
     * Each item in the list represents a class of SQL operations that normally cause all later statements in a session
     * using a proxy to be pinned to the same underlying database connection. Including an item in the list exempts that
     * class of SQL operations from the pinning behavior. Currently, the only allowed value is
     * <code>EXCLUDE_VARIABLE_SETS</code>.
     * </p>
     * 
     * @return Each item in the list represents a class of SQL operations that normally cause all later statements in a
     *         session using a proxy to be pinned to the same underlying database connection. Including an item in the
     *         list exempts that class of SQL operations from the pinning behavior. Currently, the only allowed value is
     *         <code>EXCLUDE_VARIABLE_SETS</code>.
     */

    public java.util.List<String> getSessionPinningFilters() {
        if (sessionPinningFilters == null) {
            sessionPinningFilters = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return sessionPinningFilters;
    }

    /**
     * <p>
     * Each item in the list represents a class of SQL operations that normally cause all later statements in a session
     * using a proxy to be pinned to the same underlying database connection. Including an item in the list exempts that
     * class of SQL operations from the pinning behavior. Currently, the only allowed value is
     * <code>EXCLUDE_VARIABLE_SETS</code>.
     * </p>
     * 
     * @param sessionPinningFilters
     *        Each item in the list represents a class of SQL operations that normally cause all later statements in a
     *        session using a proxy to be pinned to the same underlying database connection. Including an item in the
     *        list exempts that class of SQL operations from the pinning behavior. Currently, the only allowed value is
     *        <code>EXCLUDE_VARIABLE_SETS</code>.
     */

    public void setSessionPinningFilters(java.util.Collection<String> sessionPinningFilters) {
        if (sessionPinningFilters == null) {
            this.sessionPinningFilters = null;
            return;
        }

        this.sessionPinningFilters = new com.amazonaws.internal.SdkInternalList<String>(sessionPinningFilters);
    }

    /**
     * <p>
     * Each item in the list represents a class of SQL operations that normally cause all later statements in a session
     * using a proxy to be pinned to the same underlying database connection. Including an item in the list exempts that
     * class of SQL operations from the pinning behavior. Currently, the only allowed value is
     * <code>EXCLUDE_VARIABLE_SETS</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSessionPinningFilters(java.util.Collection)} or
     * {@link #withSessionPinningFilters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param sessionPinningFilters
     *        Each item in the list represents a class of SQL operations that normally cause all later statements in a
     *        session using a proxy to be pinned to the same underlying database connection. Including an item in the
     *        list exempts that class of SQL operations from the pinning behavior. Currently, the only allowed value is
     *        <code>EXCLUDE_VARIABLE_SETS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionPoolConfigurationInfo withSessionPinningFilters(String... sessionPinningFilters) {
        if (this.sessionPinningFilters == null) {
            setSessionPinningFilters(new com.amazonaws.internal.SdkInternalList<String>(sessionPinningFilters.length));
        }
        for (String ele : sessionPinningFilters) {
            this.sessionPinningFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Each item in the list represents a class of SQL operations that normally cause all later statements in a session
     * using a proxy to be pinned to the same underlying database connection. Including an item in the list exempts that
     * class of SQL operations from the pinning behavior. Currently, the only allowed value is
     * <code>EXCLUDE_VARIABLE_SETS</code>.
     * </p>
     * 
     * @param sessionPinningFilters
     *        Each item in the list represents a class of SQL operations that normally cause all later statements in a
     *        session using a proxy to be pinned to the same underlying database connection. Including an item in the
     *        list exempts that class of SQL operations from the pinning behavior. Currently, the only allowed value is
     *        <code>EXCLUDE_VARIABLE_SETS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionPoolConfigurationInfo withSessionPinningFilters(java.util.Collection<String> sessionPinningFilters) {
        setSessionPinningFilters(sessionPinningFilters);
        return this;
    }

    /**
     * <p>
     * One or more SQL statements for the proxy to run when opening each new database connection. Typically used with
     * <code>SET</code> statements to make sure that each connection has identical settings such as time zone and
     * character set. This setting is empty by default. For multiple statements, use semicolons as the separator. You
     * can also include multiple variables in a single <code>SET</code> statement, such as <code>SET x=1, y=2</code>.
     * </p>
     * 
     * @param initQuery
     *        One or more SQL statements for the proxy to run when opening each new database connection. Typically used
     *        with <code>SET</code> statements to make sure that each connection has identical settings such as time
     *        zone and character set. This setting is empty by default. For multiple statements, use semicolons as the
     *        separator. You can also include multiple variables in a single <code>SET</code> statement, such as
     *        <code>SET x=1, y=2</code>.
     */

    public void setInitQuery(String initQuery) {
        this.initQuery = initQuery;
    }

    /**
     * <p>
     * One or more SQL statements for the proxy to run when opening each new database connection. Typically used with
     * <code>SET</code> statements to make sure that each connection has identical settings such as time zone and
     * character set. This setting is empty by default. For multiple statements, use semicolons as the separator. You
     * can also include multiple variables in a single <code>SET</code> statement, such as <code>SET x=1, y=2</code>.
     * </p>
     * 
     * @return One or more SQL statements for the proxy to run when opening each new database connection. Typically used
     *         with <code>SET</code> statements to make sure that each connection has identical settings such as time
     *         zone and character set. This setting is empty by default. For multiple statements, use semicolons as the
     *         separator. You can also include multiple variables in a single <code>SET</code> statement, such as
     *         <code>SET x=1, y=2</code>.
     */

    public String getInitQuery() {
        return this.initQuery;
    }

    /**
     * <p>
     * One or more SQL statements for the proxy to run when opening each new database connection. Typically used with
     * <code>SET</code> statements to make sure that each connection has identical settings such as time zone and
     * character set. This setting is empty by default. For multiple statements, use semicolons as the separator. You
     * can also include multiple variables in a single <code>SET</code> statement, such as <code>SET x=1, y=2</code>.
     * </p>
     * 
     * @param initQuery
     *        One or more SQL statements for the proxy to run when opening each new database connection. Typically used
     *        with <code>SET</code> statements to make sure that each connection has identical settings such as time
     *        zone and character set. This setting is empty by default. For multiple statements, use semicolons as the
     *        separator. You can also include multiple variables in a single <code>SET</code> statement, such as
     *        <code>SET x=1, y=2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionPoolConfigurationInfo withInitQuery(String initQuery) {
        setInitQuery(initQuery);
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
        if (getMaxConnectionsPercent() != null)
            sb.append("MaxConnectionsPercent: ").append(getMaxConnectionsPercent()).append(",");
        if (getMaxIdleConnectionsPercent() != null)
            sb.append("MaxIdleConnectionsPercent: ").append(getMaxIdleConnectionsPercent()).append(",");
        if (getConnectionBorrowTimeout() != null)
            sb.append("ConnectionBorrowTimeout: ").append(getConnectionBorrowTimeout()).append(",");
        if (getSessionPinningFilters() != null)
            sb.append("SessionPinningFilters: ").append(getSessionPinningFilters()).append(",");
        if (getInitQuery() != null)
            sb.append("InitQuery: ").append(getInitQuery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectionPoolConfigurationInfo == false)
            return false;
        ConnectionPoolConfigurationInfo other = (ConnectionPoolConfigurationInfo) obj;
        if (other.getMaxConnectionsPercent() == null ^ this.getMaxConnectionsPercent() == null)
            return false;
        if (other.getMaxConnectionsPercent() != null && other.getMaxConnectionsPercent().equals(this.getMaxConnectionsPercent()) == false)
            return false;
        if (other.getMaxIdleConnectionsPercent() == null ^ this.getMaxIdleConnectionsPercent() == null)
            return false;
        if (other.getMaxIdleConnectionsPercent() != null && other.getMaxIdleConnectionsPercent().equals(this.getMaxIdleConnectionsPercent()) == false)
            return false;
        if (other.getConnectionBorrowTimeout() == null ^ this.getConnectionBorrowTimeout() == null)
            return false;
        if (other.getConnectionBorrowTimeout() != null && other.getConnectionBorrowTimeout().equals(this.getConnectionBorrowTimeout()) == false)
            return false;
        if (other.getSessionPinningFilters() == null ^ this.getSessionPinningFilters() == null)
            return false;
        if (other.getSessionPinningFilters() != null && other.getSessionPinningFilters().equals(this.getSessionPinningFilters()) == false)
            return false;
        if (other.getInitQuery() == null ^ this.getInitQuery() == null)
            return false;
        if (other.getInitQuery() != null && other.getInitQuery().equals(this.getInitQuery()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxConnectionsPercent() == null) ? 0 : getMaxConnectionsPercent().hashCode());
        hashCode = prime * hashCode + ((getMaxIdleConnectionsPercent() == null) ? 0 : getMaxIdleConnectionsPercent().hashCode());
        hashCode = prime * hashCode + ((getConnectionBorrowTimeout() == null) ? 0 : getConnectionBorrowTimeout().hashCode());
        hashCode = prime * hashCode + ((getSessionPinningFilters() == null) ? 0 : getSessionPinningFilters().hashCode());
        hashCode = prime * hashCode + ((getInitQuery() == null) ? 0 : getInitQuery().hashCode());
        return hashCode;
    }

    @Override
    public ConnectionPoolConfigurationInfo clone() {
        try {
            return (ConnectionPoolConfigurationInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
