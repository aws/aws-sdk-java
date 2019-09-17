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
 * <p>
 * The request parameters to get cluster credentials.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/GetClusterCredentials" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetClusterCredentialsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of a database user. If a user name matching <code>DbUser</code> exists in the database, the temporary
     * user credentials have the same permissions as the existing user. If <code>DbUser</code> doesn't exist in the
     * database and <code>Autocreate</code> is <code>True</code>, a new user is created using the value for
     * <code>DbUser</code> with PUBLIC permissions. If a database user matching the value for <code>DbUser</code>
     * doesn't exist and <code>Autocreate</code> is <code>False</code>, then the command succeeds but the connection
     * attempt will fail because the user doesn't exist in the database.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/redshift/latest/dg/r_CREATE_USER.html">CREATE
     * USER</a> in the Amazon Redshift Database Developer Guide.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 64 alphanumeric characters or hyphens. The user name can't be <code>PUBLIC</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at symbol (@), or hyphen.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not contain a colon ( : ) or slash ( / ).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word. A list of reserved words can be found in <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon Redshift
     * Database Developer Guide.
     * </p>
     * </li>
     * </ul>
     */
    private String dbUser;
    /**
     * <p>
     * The name of a database that <code>DbUser</code> is authorized to log on to. If <code>DbName</code> is not
     * specified, <code>DbUser</code> can log on to any existing database.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 64 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at symbol (@), or hyphen.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not contain a colon ( : ) or slash ( / ).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word. A list of reserved words can be found in <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon Redshift
     * Database Developer Guide.
     * </p>
     * </li>
     * </ul>
     */
    private String dbName;
    /**
     * <p>
     * The unique identifier of the cluster that contains the database for which your are requesting credentials. This
     * parameter is case sensitive.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The number of seconds until the returned temporary password expires.
     * </p>
     * <p>
     * Constraint: minimum 900, maximum 3600.
     * </p>
     * <p>
     * Default: 900
     * </p>
     */
    private Integer durationSeconds;
    /**
     * <p>
     * Create a database user with the name specified for the user named in <code>DbUser</code> if one does not exist.
     * </p>
     */
    private Boolean autoCreate;
    /**
     * <p>
     * A list of the names of existing database groups that the user named in <code>DbUser</code> will join for the
     * current session, in addition to any group memberships for an existing user. If not specified, a new user is added
     * only to PUBLIC.
     * </p>
     * <p>
     * Database group name constraints
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 64 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at symbol (@), or hyphen.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not contain a colon ( : ) or slash ( / ).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word. A list of reserved words can be found in <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon Redshift
     * Database Developer Guide.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<String> dbGroups;

    /**
     * <p>
     * The name of a database user. If a user name matching <code>DbUser</code> exists in the database, the temporary
     * user credentials have the same permissions as the existing user. If <code>DbUser</code> doesn't exist in the
     * database and <code>Autocreate</code> is <code>True</code>, a new user is created using the value for
     * <code>DbUser</code> with PUBLIC permissions. If a database user matching the value for <code>DbUser</code>
     * doesn't exist and <code>Autocreate</code> is <code>False</code>, then the command succeeds but the connection
     * attempt will fail because the user doesn't exist in the database.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/redshift/latest/dg/r_CREATE_USER.html">CREATE
     * USER</a> in the Amazon Redshift Database Developer Guide.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 64 alphanumeric characters or hyphens. The user name can't be <code>PUBLIC</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at symbol (@), or hyphen.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not contain a colon ( : ) or slash ( / ).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word. A list of reserved words can be found in <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon Redshift
     * Database Developer Guide.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dbUser
     *        The name of a database user. If a user name matching <code>DbUser</code> exists in the database, the
     *        temporary user credentials have the same permissions as the existing user. If <code>DbUser</code> doesn't
     *        exist in the database and <code>Autocreate</code> is <code>True</code>, a new user is created using the
     *        value for <code>DbUser</code> with PUBLIC permissions. If a database user matching the value for
     *        <code>DbUser</code> doesn't exist and <code>Autocreate</code> is <code>False</code>, then the command
     *        succeeds but the connection attempt will fail because the user doesn't exist in the database.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/redshift/latest/dg/r_CREATE_USER.html">CREATE USER</a> in the Amazon
     *        Redshift Database Developer Guide.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 64 alphanumeric characters or hyphens. The user name can't be <code>PUBLIC</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at symbol (@), or
     *        hyphen.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must not contain a colon ( : ) or slash ( / ).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a reserved word. A list of reserved words can be found in <a
     *        href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon
     *        Redshift Database Developer Guide.
     *        </p>
     *        </li>
     */

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    /**
     * <p>
     * The name of a database user. If a user name matching <code>DbUser</code> exists in the database, the temporary
     * user credentials have the same permissions as the existing user. If <code>DbUser</code> doesn't exist in the
     * database and <code>Autocreate</code> is <code>True</code>, a new user is created using the value for
     * <code>DbUser</code> with PUBLIC permissions. If a database user matching the value for <code>DbUser</code>
     * doesn't exist and <code>Autocreate</code> is <code>False</code>, then the command succeeds but the connection
     * attempt will fail because the user doesn't exist in the database.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/redshift/latest/dg/r_CREATE_USER.html">CREATE
     * USER</a> in the Amazon Redshift Database Developer Guide.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 64 alphanumeric characters or hyphens. The user name can't be <code>PUBLIC</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at symbol (@), or hyphen.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not contain a colon ( : ) or slash ( / ).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word. A list of reserved words can be found in <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon Redshift
     * Database Developer Guide.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of a database user. If a user name matching <code>DbUser</code> exists in the database, the
     *         temporary user credentials have the same permissions as the existing user. If <code>DbUser</code> doesn't
     *         exist in the database and <code>Autocreate</code> is <code>True</code>, a new user is created using the
     *         value for <code>DbUser</code> with PUBLIC permissions. If a database user matching the value for
     *         <code>DbUser</code> doesn't exist and <code>Autocreate</code> is <code>False</code>, then the command
     *         succeeds but the connection attempt will fail because the user doesn't exist in the database.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/redshift/latest/dg/r_CREATE_USER.html">CREATE USER</a> in the Amazon
     *         Redshift Database Developer Guide.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 64 alphanumeric characters or hyphens. The user name can't be <code>PUBLIC</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at symbol (@), or
     *         hyphen.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must not contain a colon ( : ) or slash ( / ).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot be a reserved word. A list of reserved words can be found in <a
     *         href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon
     *         Redshift Database Developer Guide.
     *         </p>
     *         </li>
     */

    public String getDbUser() {
        return this.dbUser;
    }

    /**
     * <p>
     * The name of a database user. If a user name matching <code>DbUser</code> exists in the database, the temporary
     * user credentials have the same permissions as the existing user. If <code>DbUser</code> doesn't exist in the
     * database and <code>Autocreate</code> is <code>True</code>, a new user is created using the value for
     * <code>DbUser</code> with PUBLIC permissions. If a database user matching the value for <code>DbUser</code>
     * doesn't exist and <code>Autocreate</code> is <code>False</code>, then the command succeeds but the connection
     * attempt will fail because the user doesn't exist in the database.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/redshift/latest/dg/r_CREATE_USER.html">CREATE
     * USER</a> in the Amazon Redshift Database Developer Guide.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 64 alphanumeric characters or hyphens. The user name can't be <code>PUBLIC</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at symbol (@), or hyphen.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not contain a colon ( : ) or slash ( / ).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word. A list of reserved words can be found in <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon Redshift
     * Database Developer Guide.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dbUser
     *        The name of a database user. If a user name matching <code>DbUser</code> exists in the database, the
     *        temporary user credentials have the same permissions as the existing user. If <code>DbUser</code> doesn't
     *        exist in the database and <code>Autocreate</code> is <code>True</code>, a new user is created using the
     *        value for <code>DbUser</code> with PUBLIC permissions. If a database user matching the value for
     *        <code>DbUser</code> doesn't exist and <code>Autocreate</code> is <code>False</code>, then the command
     *        succeeds but the connection attempt will fail because the user doesn't exist in the database.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/redshift/latest/dg/r_CREATE_USER.html">CREATE USER</a> in the Amazon
     *        Redshift Database Developer Guide.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 64 alphanumeric characters or hyphens. The user name can't be <code>PUBLIC</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at symbol (@), or
     *        hyphen.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must not contain a colon ( : ) or slash ( / ).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a reserved word. A list of reserved words can be found in <a
     *        href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon
     *        Redshift Database Developer Guide.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetClusterCredentialsRequest withDbUser(String dbUser) {
        setDbUser(dbUser);
        return this;
    }

    /**
     * <p>
     * The name of a database that <code>DbUser</code> is authorized to log on to. If <code>DbName</code> is not
     * specified, <code>DbUser</code> can log on to any existing database.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 64 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at symbol (@), or hyphen.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not contain a colon ( : ) or slash ( / ).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word. A list of reserved words can be found in <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon Redshift
     * Database Developer Guide.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dbName
     *        The name of a database that <code>DbUser</code> is authorized to log on to. If <code>DbName</code> is not
     *        specified, <code>DbUser</code> can log on to any existing database.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 64 alphanumeric characters or hyphens
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at symbol (@), or
     *        hyphen.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must not contain a colon ( : ) or slash ( / ).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a reserved word. A list of reserved words can be found in <a
     *        href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon
     *        Redshift Database Developer Guide.
     *        </p>
     *        </li>
     */

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    /**
     * <p>
     * The name of a database that <code>DbUser</code> is authorized to log on to. If <code>DbName</code> is not
     * specified, <code>DbUser</code> can log on to any existing database.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 64 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at symbol (@), or hyphen.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not contain a colon ( : ) or slash ( / ).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word. A list of reserved words can be found in <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon Redshift
     * Database Developer Guide.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of a database that <code>DbUser</code> is authorized to log on to. If <code>DbName</code> is not
     *         specified, <code>DbUser</code> can log on to any existing database.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 64 alphanumeric characters or hyphens
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at symbol (@), or
     *         hyphen.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must not contain a colon ( : ) or slash ( / ).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot be a reserved word. A list of reserved words can be found in <a
     *         href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon
     *         Redshift Database Developer Guide.
     *         </p>
     *         </li>
     */

    public String getDbName() {
        return this.dbName;
    }

    /**
     * <p>
     * The name of a database that <code>DbUser</code> is authorized to log on to. If <code>DbName</code> is not
     * specified, <code>DbUser</code> can log on to any existing database.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 64 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at symbol (@), or hyphen.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not contain a colon ( : ) or slash ( / ).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word. A list of reserved words can be found in <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon Redshift
     * Database Developer Guide.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dbName
     *        The name of a database that <code>DbUser</code> is authorized to log on to. If <code>DbName</code> is not
     *        specified, <code>DbUser</code> can log on to any existing database.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 64 alphanumeric characters or hyphens
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at symbol (@), or
     *        hyphen.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must not contain a colon ( : ) or slash ( / ).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a reserved word. A list of reserved words can be found in <a
     *        href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon
     *        Redshift Database Developer Guide.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetClusterCredentialsRequest withDbName(String dbName) {
        setDbName(dbName);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the cluster that contains the database for which your are requesting credentials. This
     * parameter is case sensitive.
     * </p>
     * 
     * @param clusterIdentifier
     *        The unique identifier of the cluster that contains the database for which your are requesting credentials.
     *        This parameter is case sensitive.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the cluster that contains the database for which your are requesting credentials. This
     * parameter is case sensitive.
     * </p>
     * 
     * @return The unique identifier of the cluster that contains the database for which your are requesting
     *         credentials. This parameter is case sensitive.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the cluster that contains the database for which your are requesting credentials. This
     * parameter is case sensitive.
     * </p>
     * 
     * @param clusterIdentifier
     *        The unique identifier of the cluster that contains the database for which your are requesting credentials.
     *        This parameter is case sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetClusterCredentialsRequest withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The number of seconds until the returned temporary password expires.
     * </p>
     * <p>
     * Constraint: minimum 900, maximum 3600.
     * </p>
     * <p>
     * Default: 900
     * </p>
     * 
     * @param durationSeconds
     *        The number of seconds until the returned temporary password expires.</p>
     *        <p>
     *        Constraint: minimum 900, maximum 3600.
     *        </p>
     *        <p>
     *        Default: 900
     */

    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * <p>
     * The number of seconds until the returned temporary password expires.
     * </p>
     * <p>
     * Constraint: minimum 900, maximum 3600.
     * </p>
     * <p>
     * Default: 900
     * </p>
     * 
     * @return The number of seconds until the returned temporary password expires.</p>
     *         <p>
     *         Constraint: minimum 900, maximum 3600.
     *         </p>
     *         <p>
     *         Default: 900
     */

    public Integer getDurationSeconds() {
        return this.durationSeconds;
    }

    /**
     * <p>
     * The number of seconds until the returned temporary password expires.
     * </p>
     * <p>
     * Constraint: minimum 900, maximum 3600.
     * </p>
     * <p>
     * Default: 900
     * </p>
     * 
     * @param durationSeconds
     *        The number of seconds until the returned temporary password expires.</p>
     *        <p>
     *        Constraint: minimum 900, maximum 3600.
     *        </p>
     *        <p>
     *        Default: 900
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetClusterCredentialsRequest withDurationSeconds(Integer durationSeconds) {
        setDurationSeconds(durationSeconds);
        return this;
    }

    /**
     * <p>
     * Create a database user with the name specified for the user named in <code>DbUser</code> if one does not exist.
     * </p>
     * 
     * @param autoCreate
     *        Create a database user with the name specified for the user named in <code>DbUser</code> if one does not
     *        exist.
     */

    public void setAutoCreate(Boolean autoCreate) {
        this.autoCreate = autoCreate;
    }

    /**
     * <p>
     * Create a database user with the name specified for the user named in <code>DbUser</code> if one does not exist.
     * </p>
     * 
     * @return Create a database user with the name specified for the user named in <code>DbUser</code> if one does not
     *         exist.
     */

    public Boolean getAutoCreate() {
        return this.autoCreate;
    }

    /**
     * <p>
     * Create a database user with the name specified for the user named in <code>DbUser</code> if one does not exist.
     * </p>
     * 
     * @param autoCreate
     *        Create a database user with the name specified for the user named in <code>DbUser</code> if one does not
     *        exist.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetClusterCredentialsRequest withAutoCreate(Boolean autoCreate) {
        setAutoCreate(autoCreate);
        return this;
    }

    /**
     * <p>
     * Create a database user with the name specified for the user named in <code>DbUser</code> if one does not exist.
     * </p>
     * 
     * @return Create a database user with the name specified for the user named in <code>DbUser</code> if one does not
     *         exist.
     */

    public Boolean isAutoCreate() {
        return this.autoCreate;
    }

    /**
     * <p>
     * A list of the names of existing database groups that the user named in <code>DbUser</code> will join for the
     * current session, in addition to any group memberships for an existing user. If not specified, a new user is added
     * only to PUBLIC.
     * </p>
     * <p>
     * Database group name constraints
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 64 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at symbol (@), or hyphen.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not contain a colon ( : ) or slash ( / ).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word. A list of reserved words can be found in <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon Redshift
     * Database Developer Guide.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A list of the names of existing database groups that the user named in <code>DbUser</code> will join for
     *         the current session, in addition to any group memberships for an existing user. If not specified, a new
     *         user is added only to PUBLIC.</p>
     *         <p>
     *         Database group name constraints
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 64 alphanumeric characters or hyphens
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at symbol (@), or
     *         hyphen.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must not contain a colon ( : ) or slash ( / ).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot be a reserved word. A list of reserved words can be found in <a
     *         href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon
     *         Redshift Database Developer Guide.
     *         </p>
     *         </li>
     */

    public java.util.List<String> getDbGroups() {
        if (dbGroups == null) {
            dbGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return dbGroups;
    }

    /**
     * <p>
     * A list of the names of existing database groups that the user named in <code>DbUser</code> will join for the
     * current session, in addition to any group memberships for an existing user. If not specified, a new user is added
     * only to PUBLIC.
     * </p>
     * <p>
     * Database group name constraints
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 64 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at symbol (@), or hyphen.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not contain a colon ( : ) or slash ( / ).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word. A list of reserved words can be found in <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon Redshift
     * Database Developer Guide.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dbGroups
     *        A list of the names of existing database groups that the user named in <code>DbUser</code> will join for
     *        the current session, in addition to any group memberships for an existing user. If not specified, a new
     *        user is added only to PUBLIC.</p>
     *        <p>
     *        Database group name constraints
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 64 alphanumeric characters or hyphens
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at symbol (@), or
     *        hyphen.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must not contain a colon ( : ) or slash ( / ).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a reserved word. A list of reserved words can be found in <a
     *        href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon
     *        Redshift Database Developer Guide.
     *        </p>
     *        </li>
     */

    public void setDbGroups(java.util.Collection<String> dbGroups) {
        if (dbGroups == null) {
            this.dbGroups = null;
            return;
        }

        this.dbGroups = new com.amazonaws.internal.SdkInternalList<String>(dbGroups);
    }

    /**
     * <p>
     * A list of the names of existing database groups that the user named in <code>DbUser</code> will join for the
     * current session, in addition to any group memberships for an existing user. If not specified, a new user is added
     * only to PUBLIC.
     * </p>
     * <p>
     * Database group name constraints
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 64 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at symbol (@), or hyphen.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not contain a colon ( : ) or slash ( / ).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word. A list of reserved words can be found in <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon Redshift
     * Database Developer Guide.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDbGroups(java.util.Collection)} or {@link #withDbGroups(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param dbGroups
     *        A list of the names of existing database groups that the user named in <code>DbUser</code> will join for
     *        the current session, in addition to any group memberships for an existing user. If not specified, a new
     *        user is added only to PUBLIC.</p>
     *        <p>
     *        Database group name constraints
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 64 alphanumeric characters or hyphens
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at symbol (@), or
     *        hyphen.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must not contain a colon ( : ) or slash ( / ).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a reserved word. A list of reserved words can be found in <a
     *        href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon
     *        Redshift Database Developer Guide.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetClusterCredentialsRequest withDbGroups(String... dbGroups) {
        if (this.dbGroups == null) {
            setDbGroups(new com.amazonaws.internal.SdkInternalList<String>(dbGroups.length));
        }
        for (String ele : dbGroups) {
            this.dbGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the names of existing database groups that the user named in <code>DbUser</code> will join for the
     * current session, in addition to any group memberships for an existing user. If not specified, a new user is added
     * only to PUBLIC.
     * </p>
     * <p>
     * Database group name constraints
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 64 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at symbol (@), or hyphen.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not contain a colon ( : ) or slash ( / ).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word. A list of reserved words can be found in <a
     * href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon Redshift
     * Database Developer Guide.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dbGroups
     *        A list of the names of existing database groups that the user named in <code>DbUser</code> will join for
     *        the current session, in addition to any group memberships for an existing user. If not specified, a new
     *        user is added only to PUBLIC.</p>
     *        <p>
     *        Database group name constraints
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 64 alphanumeric characters or hyphens
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at symbol (@), or
     *        hyphen.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must not contain a colon ( : ) or slash ( / ).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a reserved word. A list of reserved words can be found in <a
     *        href="http://docs.aws.amazon.com/redshift/latest/dg/r_pg_keywords.html">Reserved Words</a> in the Amazon
     *        Redshift Database Developer Guide.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetClusterCredentialsRequest withDbGroups(java.util.Collection<String> dbGroups) {
        setDbGroups(dbGroups);
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
        if (getDbUser() != null)
            sb.append("DbUser: ").append(getDbUser()).append(",");
        if (getDbName() != null)
            sb.append("DbName: ").append(getDbName()).append(",");
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier()).append(",");
        if (getDurationSeconds() != null)
            sb.append("DurationSeconds: ").append(getDurationSeconds()).append(",");
        if (getAutoCreate() != null)
            sb.append("AutoCreate: ").append(getAutoCreate()).append(",");
        if (getDbGroups() != null)
            sb.append("DbGroups: ").append(getDbGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetClusterCredentialsRequest == false)
            return false;
        GetClusterCredentialsRequest other = (GetClusterCredentialsRequest) obj;
        if (other.getDbUser() == null ^ this.getDbUser() == null)
            return false;
        if (other.getDbUser() != null && other.getDbUser().equals(this.getDbUser()) == false)
            return false;
        if (other.getDbName() == null ^ this.getDbName() == null)
            return false;
        if (other.getDbName() != null && other.getDbName().equals(this.getDbName()) == false)
            return false;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null)
            return false;
        if (other.getDurationSeconds() != null && other.getDurationSeconds().equals(this.getDurationSeconds()) == false)
            return false;
        if (other.getAutoCreate() == null ^ this.getAutoCreate() == null)
            return false;
        if (other.getAutoCreate() != null && other.getAutoCreate().equals(this.getAutoCreate()) == false)
            return false;
        if (other.getDbGroups() == null ^ this.getDbGroups() == null)
            return false;
        if (other.getDbGroups() != null && other.getDbGroups().equals(this.getDbGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDbUser() == null) ? 0 : getDbUser().hashCode());
        hashCode = prime * hashCode + ((getDbName() == null) ? 0 : getDbName().hashCode());
        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDurationSeconds() == null) ? 0 : getDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getAutoCreate() == null) ? 0 : getAutoCreate().hashCode());
        hashCode = prime * hashCode + ((getDbGroups() == null) ? 0 : getDbGroups().hashCode());
        return hashCode;
    }

    @Override
    public GetClusterCredentialsRequest clone() {
        return (GetClusterCredentialsRequest) super.clone();
    }

}
