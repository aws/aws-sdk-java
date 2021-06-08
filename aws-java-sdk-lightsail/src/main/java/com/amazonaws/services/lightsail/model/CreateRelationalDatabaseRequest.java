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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateRelationalDatabase" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRelationalDatabaseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name to use for your new Lightsail database resource.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 2 to 255 alphanumeric characters, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first and last character must be a letter or number.
     * </p>
     * </li>
     * </ul>
     */
    private String relationalDatabaseName;
    /**
     * <p>
     * The Availability Zone in which to create your new database. Use the <code>us-east-2a</code> case-sensitive
     * format.
     * </p>
     * <p>
     * You can get a list of Availability Zones by using the <code>get regions</code> operation. Be sure to add the
     * <code>include relational database Availability Zones</code> parameter to your request.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The blueprint ID for your new database. A blueprint describes the major engine version of a database.
     * </p>
     * <p>
     * You can get a list of database blueprints IDs by using the <code>get relational database blueprints</code>
     * operation.
     * </p>
     */
    private String relationalDatabaseBlueprintId;
    /**
     * <p>
     * The bundle ID for your new database. A bundle describes the performance specifications for your database.
     * </p>
     * <p>
     * You can get a list of database bundle IDs by using the <code>get relational database bundles</code> operation.
     * </p>
     */
    private String relationalDatabaseBundleId;
    /**
     * <p>
     * The meaning of this parameter differs according to the database engine you use.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * The name of the database to create when the Lightsail database resource is created. If this parameter isn't
     * specified, no database is created in the database resource.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0- 9).
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a word reserved by the specified database engine.
     * </p>
     * <p>
     * For more information about reserved words in MySQL, see the Keywords and Reserved Words articles for <a
     * href="https://dev.mysql.com/doc/refman/5.6/en/keywords.html">MySQL 5.6</a>, <a
     * href="https://dev.mysql.com/doc/refman/5.7/en/keywords.html">MySQL 5.7</a>, and <a
     * href="https://dev.mysql.com/doc/refman/8.0/en/keywords.html">MySQL 8.0</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * The name of the database to create when the Lightsail database resource is created. If this parameter isn't
     * specified, a database named <code>postgres</code> is created in the database resource.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 63 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0- 9).
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a word reserved by the specified database engine.
     * </p>
     * <p>
     * For more information about reserved words in PostgreSQL, see the SQL Key Words articles for <a
     * href="https://www.postgresql.org/docs/9.6/sql-keywords-appendix.html">PostgreSQL 9.6</a>, <a
     * href="https://www.postgresql.org/docs/10/sql-keywords-appendix.html">PostgreSQL 10</a>, <a
     * href="https://www.postgresql.org/docs/11/sql-keywords-appendix.html">PostgreSQL 11</a>, and <a
     * href="https://www.postgresql.org/docs/12/sql-keywords-appendix.html">PostgreSQL 12</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String masterDatabaseName;
    /**
     * <p>
     * The name for the master user.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required for MySQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 16 letters or numbers. Can contain underscores.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a reserved word for the chosen database engine.
     * </p>
     * <p>
     * For more information about reserved words in MySQL 5.6 or 5.7, see the Keywords and Reserved Words articles for
     * <a href="https://dev.mysql.com/doc/refman/5.6/en/keywords.html">MySQL 5.6</a>, <a
     * href="https://dev.mysql.com/doc/refman/5.7/en/keywords.html">MySQL 5.7</a>, or <a
     * href="https://dev.mysql.com/doc/refman/8.0/en/keywords.html">MySQL 8.0</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required for PostgreSQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 63 letters or numbers. Can contain underscores.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a reserved word for the chosen database engine.
     * </p>
     * <p>
     * For more information about reserved words in MySQL 5.6 or 5.7, see the Keywords and Reserved Words articles for
     * <a href="https://www.postgresql.org/docs/9.6/sql-keywords-appendix.html">PostgreSQL 9.6</a>, <a
     * href="https://www.postgresql.org/docs/10/sql-keywords-appendix.html">PostgreSQL 10</a>, <a
     * href="https://www.postgresql.org/docs/11/sql-keywords-appendix.html">PostgreSQL 11</a>, and <a
     * href="https://www.postgresql.org/docs/12/sql-keywords-appendix.html">PostgreSQL 12</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String masterUsername;
    /**
     * <p>
     * The password for the master user. The password can include any printable ASCII character except "/", """, or "@".
     * It cannot contain spaces.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 128 characters.
     * </p>
     */
    private String masterUserPassword;
    /**
     * <p>
     * The daily time range during which automated backups are created for your new database if automated backups are
     * enabled.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. For more
     * information about the preferred backup window time blocks for each region, see the <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     * >Working With Backups</a> guide in the Amazon Relational Database Service (Amazon RDS) documentation.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the <code>hh24:mi-hh24:mi</code> format.
     * </p>
     * <p>
     * Example: <code>16:00-16:30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     */
    private String preferredBackupWindow;
    /**
     * <p>
     * The weekly time range during which system maintenance can occur on your new database.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region, occurring
     * on a random day of the week.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the <code>ddd:hh24:mi-ddd:hh24:mi</code> format.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>Tue:17:00-Tue:17:30</code>
     * </p>
     * </li>
     * </ul>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * Specifies the accessibility options for your new database. A value of <code>true</code> specifies a database that
     * is available to resources outside of your Lightsail account. A value of <code>false</code> specifies a database
     * that is available only to your Lightsail resources in the same region as your database.
     * </p>
     */
    private Boolean publiclyAccessible;
    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * Use the <code>TagResource</code> action to tag a resource after it's created.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name to use for your new Lightsail database resource.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 2 to 255 alphanumeric characters, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first and last character must be a letter or number.
     * </p>
     * </li>
     * </ul>
     * 
     * @param relationalDatabaseName
     *        The name to use for your new Lightsail database resource.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 2 to 255 alphanumeric characters, or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The first and last character must be a letter or number.
     *        </p>
     *        </li>
     */

    public void setRelationalDatabaseName(String relationalDatabaseName) {
        this.relationalDatabaseName = relationalDatabaseName;
    }

    /**
     * <p>
     * The name to use for your new Lightsail database resource.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 2 to 255 alphanumeric characters, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first and last character must be a letter or number.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name to use for your new Lightsail database resource.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 2 to 255 alphanumeric characters, or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The first and last character must be a letter or number.
     *         </p>
     *         </li>
     */

    public String getRelationalDatabaseName() {
        return this.relationalDatabaseName;
    }

    /**
     * <p>
     * The name to use for your new Lightsail database resource.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 2 to 255 alphanumeric characters, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first and last character must be a letter or number.
     * </p>
     * </li>
     * </ul>
     * 
     * @param relationalDatabaseName
     *        The name to use for your new Lightsail database resource.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 2 to 255 alphanumeric characters, or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The first and last character must be a letter or number.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelationalDatabaseRequest withRelationalDatabaseName(String relationalDatabaseName) {
        setRelationalDatabaseName(relationalDatabaseName);
        return this;
    }

    /**
     * <p>
     * The Availability Zone in which to create your new database. Use the <code>us-east-2a</code> case-sensitive
     * format.
     * </p>
     * <p>
     * You can get a list of Availability Zones by using the <code>get regions</code> operation. Be sure to add the
     * <code>include relational database Availability Zones</code> parameter to your request.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which to create your new database. Use the <code>us-east-2a</code> case-sensitive
     *        format.</p>
     *        <p>
     *        You can get a list of Availability Zones by using the <code>get regions</code> operation. Be sure to add
     *        the <code>include relational database Availability Zones</code> parameter to your request.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which to create your new database. Use the <code>us-east-2a</code> case-sensitive
     * format.
     * </p>
     * <p>
     * You can get a list of Availability Zones by using the <code>get regions</code> operation. Be sure to add the
     * <code>include relational database Availability Zones</code> parameter to your request.
     * </p>
     * 
     * @return The Availability Zone in which to create your new database. Use the <code>us-east-2a</code>
     *         case-sensitive format.</p>
     *         <p>
     *         You can get a list of Availability Zones by using the <code>get regions</code> operation. Be sure to add
     *         the <code>include relational database Availability Zones</code> parameter to your request.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which to create your new database. Use the <code>us-east-2a</code> case-sensitive
     * format.
     * </p>
     * <p>
     * You can get a list of Availability Zones by using the <code>get regions</code> operation. Be sure to add the
     * <code>include relational database Availability Zones</code> parameter to your request.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which to create your new database. Use the <code>us-east-2a</code> case-sensitive
     *        format.</p>
     *        <p>
     *        You can get a list of Availability Zones by using the <code>get regions</code> operation. Be sure to add
     *        the <code>include relational database Availability Zones</code> parameter to your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelationalDatabaseRequest withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The blueprint ID for your new database. A blueprint describes the major engine version of a database.
     * </p>
     * <p>
     * You can get a list of database blueprints IDs by using the <code>get relational database blueprints</code>
     * operation.
     * </p>
     * 
     * @param relationalDatabaseBlueprintId
     *        The blueprint ID for your new database. A blueprint describes the major engine version of a database.</p>
     *        <p>
     *        You can get a list of database blueprints IDs by using the <code>get relational database blueprints</code>
     *        operation.
     */

    public void setRelationalDatabaseBlueprintId(String relationalDatabaseBlueprintId) {
        this.relationalDatabaseBlueprintId = relationalDatabaseBlueprintId;
    }

    /**
     * <p>
     * The blueprint ID for your new database. A blueprint describes the major engine version of a database.
     * </p>
     * <p>
     * You can get a list of database blueprints IDs by using the <code>get relational database blueprints</code>
     * operation.
     * </p>
     * 
     * @return The blueprint ID for your new database. A blueprint describes the major engine version of a database.</p>
     *         <p>
     *         You can get a list of database blueprints IDs by using the
     *         <code>get relational database blueprints</code> operation.
     */

    public String getRelationalDatabaseBlueprintId() {
        return this.relationalDatabaseBlueprintId;
    }

    /**
     * <p>
     * The blueprint ID for your new database. A blueprint describes the major engine version of a database.
     * </p>
     * <p>
     * You can get a list of database blueprints IDs by using the <code>get relational database blueprints</code>
     * operation.
     * </p>
     * 
     * @param relationalDatabaseBlueprintId
     *        The blueprint ID for your new database. A blueprint describes the major engine version of a database.</p>
     *        <p>
     *        You can get a list of database blueprints IDs by using the <code>get relational database blueprints</code>
     *        operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelationalDatabaseRequest withRelationalDatabaseBlueprintId(String relationalDatabaseBlueprintId) {
        setRelationalDatabaseBlueprintId(relationalDatabaseBlueprintId);
        return this;
    }

    /**
     * <p>
     * The bundle ID for your new database. A bundle describes the performance specifications for your database.
     * </p>
     * <p>
     * You can get a list of database bundle IDs by using the <code>get relational database bundles</code> operation.
     * </p>
     * 
     * @param relationalDatabaseBundleId
     *        The bundle ID for your new database. A bundle describes the performance specifications for your
     *        database.</p>
     *        <p>
     *        You can get a list of database bundle IDs by using the <code>get relational database bundles</code>
     *        operation.
     */

    public void setRelationalDatabaseBundleId(String relationalDatabaseBundleId) {
        this.relationalDatabaseBundleId = relationalDatabaseBundleId;
    }

    /**
     * <p>
     * The bundle ID for your new database. A bundle describes the performance specifications for your database.
     * </p>
     * <p>
     * You can get a list of database bundle IDs by using the <code>get relational database bundles</code> operation.
     * </p>
     * 
     * @return The bundle ID for your new database. A bundle describes the performance specifications for your
     *         database.</p>
     *         <p>
     *         You can get a list of database bundle IDs by using the <code>get relational database bundles</code>
     *         operation.
     */

    public String getRelationalDatabaseBundleId() {
        return this.relationalDatabaseBundleId;
    }

    /**
     * <p>
     * The bundle ID for your new database. A bundle describes the performance specifications for your database.
     * </p>
     * <p>
     * You can get a list of database bundle IDs by using the <code>get relational database bundles</code> operation.
     * </p>
     * 
     * @param relationalDatabaseBundleId
     *        The bundle ID for your new database. A bundle describes the performance specifications for your
     *        database.</p>
     *        <p>
     *        You can get a list of database bundle IDs by using the <code>get relational database bundles</code>
     *        operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelationalDatabaseRequest withRelationalDatabaseBundleId(String relationalDatabaseBundleId) {
        setRelationalDatabaseBundleId(relationalDatabaseBundleId);
        return this;
    }

    /**
     * <p>
     * The meaning of this parameter differs according to the database engine you use.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * The name of the database to create when the Lightsail database resource is created. If this parameter isn't
     * specified, no database is created in the database resource.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0- 9).
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a word reserved by the specified database engine.
     * </p>
     * <p>
     * For more information about reserved words in MySQL, see the Keywords and Reserved Words articles for <a
     * href="https://dev.mysql.com/doc/refman/5.6/en/keywords.html">MySQL 5.6</a>, <a
     * href="https://dev.mysql.com/doc/refman/5.7/en/keywords.html">MySQL 5.7</a>, and <a
     * href="https://dev.mysql.com/doc/refman/8.0/en/keywords.html">MySQL 8.0</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * The name of the database to create when the Lightsail database resource is created. If this parameter isn't
     * specified, a database named <code>postgres</code> is created in the database resource.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 63 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0- 9).
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a word reserved by the specified database engine.
     * </p>
     * <p>
     * For more information about reserved words in PostgreSQL, see the SQL Key Words articles for <a
     * href="https://www.postgresql.org/docs/9.6/sql-keywords-appendix.html">PostgreSQL 9.6</a>, <a
     * href="https://www.postgresql.org/docs/10/sql-keywords-appendix.html">PostgreSQL 10</a>, <a
     * href="https://www.postgresql.org/docs/11/sql-keywords-appendix.html">PostgreSQL 11</a>, and <a
     * href="https://www.postgresql.org/docs/12/sql-keywords-appendix.html">PostgreSQL 12</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param masterDatabaseName
     *        The meaning of this parameter differs according to the database engine you use.</p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        The name of the database to create when the Lightsail database resource is created. If this parameter
     *        isn't specified, no database is created in the database resource.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain 1 to 64 letters or numbers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0- 9).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be a word reserved by the specified database engine.
     *        </p>
     *        <p>
     *        For more information about reserved words in MySQL, see the Keywords and Reserved Words articles for <a
     *        href="https://dev.mysql.com/doc/refman/5.6/en/keywords.html">MySQL 5.6</a>, <a
     *        href="https://dev.mysql.com/doc/refman/5.7/en/keywords.html">MySQL 5.7</a>, and <a
     *        href="https://dev.mysql.com/doc/refman/8.0/en/keywords.html">MySQL 8.0</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        The name of the database to create when the Lightsail database resource is created. If this parameter
     *        isn't specified, a database named <code>postgres</code> is created in the database resource.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain 1 to 63 letters or numbers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0- 9).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be a word reserved by the specified database engine.
     *        </p>
     *        <p>
     *        For more information about reserved words in PostgreSQL, see the SQL Key Words articles for <a
     *        href="https://www.postgresql.org/docs/9.6/sql-keywords-appendix.html">PostgreSQL 9.6</a>, <a
     *        href="https://www.postgresql.org/docs/10/sql-keywords-appendix.html">PostgreSQL 10</a>, <a
     *        href="https://www.postgresql.org/docs/11/sql-keywords-appendix.html">PostgreSQL 11</a>, and <a
     *        href="https://www.postgresql.org/docs/12/sql-keywords-appendix.html">PostgreSQL 12</a>.
     *        </p>
     *        </li>
     */

    public void setMasterDatabaseName(String masterDatabaseName) {
        this.masterDatabaseName = masterDatabaseName;
    }

    /**
     * <p>
     * The meaning of this parameter differs according to the database engine you use.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * The name of the database to create when the Lightsail database resource is created. If this parameter isn't
     * specified, no database is created in the database resource.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0- 9).
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a word reserved by the specified database engine.
     * </p>
     * <p>
     * For more information about reserved words in MySQL, see the Keywords and Reserved Words articles for <a
     * href="https://dev.mysql.com/doc/refman/5.6/en/keywords.html">MySQL 5.6</a>, <a
     * href="https://dev.mysql.com/doc/refman/5.7/en/keywords.html">MySQL 5.7</a>, and <a
     * href="https://dev.mysql.com/doc/refman/8.0/en/keywords.html">MySQL 8.0</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * The name of the database to create when the Lightsail database resource is created. If this parameter isn't
     * specified, a database named <code>postgres</code> is created in the database resource.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 63 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0- 9).
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a word reserved by the specified database engine.
     * </p>
     * <p>
     * For more information about reserved words in PostgreSQL, see the SQL Key Words articles for <a
     * href="https://www.postgresql.org/docs/9.6/sql-keywords-appendix.html">PostgreSQL 9.6</a>, <a
     * href="https://www.postgresql.org/docs/10/sql-keywords-appendix.html">PostgreSQL 10</a>, <a
     * href="https://www.postgresql.org/docs/11/sql-keywords-appendix.html">PostgreSQL 11</a>, and <a
     * href="https://www.postgresql.org/docs/12/sql-keywords-appendix.html">PostgreSQL 12</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The meaning of this parameter differs according to the database engine you use.</p>
     *         <p>
     *         <b>MySQL</b>
     *         </p>
     *         <p>
     *         The name of the database to create when the Lightsail database resource is created. If this parameter
     *         isn't specified, no database is created in the database resource.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain 1 to 64 letters or numbers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0- 9).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't be a word reserved by the specified database engine.
     *         </p>
     *         <p>
     *         For more information about reserved words in MySQL, see the Keywords and Reserved Words articles for <a
     *         href="https://dev.mysql.com/doc/refman/5.6/en/keywords.html">MySQL 5.6</a>, <a
     *         href="https://dev.mysql.com/doc/refman/5.7/en/keywords.html">MySQL 5.7</a>, and <a
     *         href="https://dev.mysql.com/doc/refman/8.0/en/keywords.html">MySQL 8.0</a>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>PostgreSQL</b>
     *         </p>
     *         <p>
     *         The name of the database to create when the Lightsail database resource is created. If this parameter
     *         isn't specified, a database named <code>postgres</code> is created in the database resource.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain 1 to 63 letters or numbers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0- 9).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't be a word reserved by the specified database engine.
     *         </p>
     *         <p>
     *         For more information about reserved words in PostgreSQL, see the SQL Key Words articles for <a
     *         href="https://www.postgresql.org/docs/9.6/sql-keywords-appendix.html">PostgreSQL 9.6</a>, <a
     *         href="https://www.postgresql.org/docs/10/sql-keywords-appendix.html">PostgreSQL 10</a>, <a
     *         href="https://www.postgresql.org/docs/11/sql-keywords-appendix.html">PostgreSQL 11</a>, and <a
     *         href="https://www.postgresql.org/docs/12/sql-keywords-appendix.html">PostgreSQL 12</a>.
     *         </p>
     *         </li>
     */

    public String getMasterDatabaseName() {
        return this.masterDatabaseName;
    }

    /**
     * <p>
     * The meaning of this parameter differs according to the database engine you use.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * The name of the database to create when the Lightsail database resource is created. If this parameter isn't
     * specified, no database is created in the database resource.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0- 9).
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a word reserved by the specified database engine.
     * </p>
     * <p>
     * For more information about reserved words in MySQL, see the Keywords and Reserved Words articles for <a
     * href="https://dev.mysql.com/doc/refman/5.6/en/keywords.html">MySQL 5.6</a>, <a
     * href="https://dev.mysql.com/doc/refman/5.7/en/keywords.html">MySQL 5.7</a>, and <a
     * href="https://dev.mysql.com/doc/refman/8.0/en/keywords.html">MySQL 8.0</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * The name of the database to create when the Lightsail database resource is created. If this parameter isn't
     * specified, a database named <code>postgres</code> is created in the database resource.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 63 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0- 9).
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a word reserved by the specified database engine.
     * </p>
     * <p>
     * For more information about reserved words in PostgreSQL, see the SQL Key Words articles for <a
     * href="https://www.postgresql.org/docs/9.6/sql-keywords-appendix.html">PostgreSQL 9.6</a>, <a
     * href="https://www.postgresql.org/docs/10/sql-keywords-appendix.html">PostgreSQL 10</a>, <a
     * href="https://www.postgresql.org/docs/11/sql-keywords-appendix.html">PostgreSQL 11</a>, and <a
     * href="https://www.postgresql.org/docs/12/sql-keywords-appendix.html">PostgreSQL 12</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param masterDatabaseName
     *        The meaning of this parameter differs according to the database engine you use.</p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        The name of the database to create when the Lightsail database resource is created. If this parameter
     *        isn't specified, no database is created in the database resource.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain 1 to 64 letters or numbers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0- 9).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be a word reserved by the specified database engine.
     *        </p>
     *        <p>
     *        For more information about reserved words in MySQL, see the Keywords and Reserved Words articles for <a
     *        href="https://dev.mysql.com/doc/refman/5.6/en/keywords.html">MySQL 5.6</a>, <a
     *        href="https://dev.mysql.com/doc/refman/5.7/en/keywords.html">MySQL 5.7</a>, and <a
     *        href="https://dev.mysql.com/doc/refman/8.0/en/keywords.html">MySQL 8.0</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        The name of the database to create when the Lightsail database resource is created. If this parameter
     *        isn't specified, a database named <code>postgres</code> is created in the database resource.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain 1 to 63 letters or numbers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0- 9).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be a word reserved by the specified database engine.
     *        </p>
     *        <p>
     *        For more information about reserved words in PostgreSQL, see the SQL Key Words articles for <a
     *        href="https://www.postgresql.org/docs/9.6/sql-keywords-appendix.html">PostgreSQL 9.6</a>, <a
     *        href="https://www.postgresql.org/docs/10/sql-keywords-appendix.html">PostgreSQL 10</a>, <a
     *        href="https://www.postgresql.org/docs/11/sql-keywords-appendix.html">PostgreSQL 11</a>, and <a
     *        href="https://www.postgresql.org/docs/12/sql-keywords-appendix.html">PostgreSQL 12</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelationalDatabaseRequest withMasterDatabaseName(String masterDatabaseName) {
        setMasterDatabaseName(masterDatabaseName);
        return this;
    }

    /**
     * <p>
     * The name for the master user.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required for MySQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 16 letters or numbers. Can contain underscores.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a reserved word for the chosen database engine.
     * </p>
     * <p>
     * For more information about reserved words in MySQL 5.6 or 5.7, see the Keywords and Reserved Words articles for
     * <a href="https://dev.mysql.com/doc/refman/5.6/en/keywords.html">MySQL 5.6</a>, <a
     * href="https://dev.mysql.com/doc/refman/5.7/en/keywords.html">MySQL 5.7</a>, or <a
     * href="https://dev.mysql.com/doc/refman/8.0/en/keywords.html">MySQL 8.0</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required for PostgreSQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 63 letters or numbers. Can contain underscores.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a reserved word for the chosen database engine.
     * </p>
     * <p>
     * For more information about reserved words in MySQL 5.6 or 5.7, see the Keywords and Reserved Words articles for
     * <a href="https://www.postgresql.org/docs/9.6/sql-keywords-appendix.html">PostgreSQL 9.6</a>, <a
     * href="https://www.postgresql.org/docs/10/sql-keywords-appendix.html">PostgreSQL 10</a>, <a
     * href="https://www.postgresql.org/docs/11/sql-keywords-appendix.html">PostgreSQL 11</a>, and <a
     * href="https://www.postgresql.org/docs/12/sql-keywords-appendix.html">PostgreSQL 12</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param masterUsername
     *        The name for the master user.</p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Required for MySQL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be 1 to 16 letters or numbers. Can contain underscores.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be a reserved word for the chosen database engine.
     *        </p>
     *        <p>
     *        For more information about reserved words in MySQL 5.6 or 5.7, see the Keywords and Reserved Words
     *        articles for <a href="https://dev.mysql.com/doc/refman/5.6/en/keywords.html">MySQL 5.6</a>, <a
     *        href="https://dev.mysql.com/doc/refman/5.7/en/keywords.html">MySQL 5.7</a>, or <a
     *        href="https://dev.mysql.com/doc/refman/8.0/en/keywords.html">MySQL 8.0</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Required for PostgreSQL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be 1 to 63 letters or numbers. Can contain underscores.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be a reserved word for the chosen database engine.
     *        </p>
     *        <p>
     *        For more information about reserved words in MySQL 5.6 or 5.7, see the Keywords and Reserved Words
     *        articles for <a href="https://www.postgresql.org/docs/9.6/sql-keywords-appendix.html">PostgreSQL 9.6</a>,
     *        <a href="https://www.postgresql.org/docs/10/sql-keywords-appendix.html">PostgreSQL 10</a>, <a
     *        href="https://www.postgresql.org/docs/11/sql-keywords-appendix.html">PostgreSQL 11</a>, and <a
     *        href="https://www.postgresql.org/docs/12/sql-keywords-appendix.html">PostgreSQL 12</a>.
     *        </p>
     *        </li>
     */

    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    /**
     * <p>
     * The name for the master user.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required for MySQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 16 letters or numbers. Can contain underscores.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a reserved word for the chosen database engine.
     * </p>
     * <p>
     * For more information about reserved words in MySQL 5.6 or 5.7, see the Keywords and Reserved Words articles for
     * <a href="https://dev.mysql.com/doc/refman/5.6/en/keywords.html">MySQL 5.6</a>, <a
     * href="https://dev.mysql.com/doc/refman/5.7/en/keywords.html">MySQL 5.7</a>, or <a
     * href="https://dev.mysql.com/doc/refman/8.0/en/keywords.html">MySQL 8.0</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required for PostgreSQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 63 letters or numbers. Can contain underscores.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a reserved word for the chosen database engine.
     * </p>
     * <p>
     * For more information about reserved words in MySQL 5.6 or 5.7, see the Keywords and Reserved Words articles for
     * <a href="https://www.postgresql.org/docs/9.6/sql-keywords-appendix.html">PostgreSQL 9.6</a>, <a
     * href="https://www.postgresql.org/docs/10/sql-keywords-appendix.html">PostgreSQL 10</a>, <a
     * href="https://www.postgresql.org/docs/11/sql-keywords-appendix.html">PostgreSQL 11</a>, and <a
     * href="https://www.postgresql.org/docs/12/sql-keywords-appendix.html">PostgreSQL 12</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name for the master user.</p>
     *         <p>
     *         <b>MySQL</b>
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Required for MySQL.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be 1 to 16 letters or numbers. Can contain underscores.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't be a reserved word for the chosen database engine.
     *         </p>
     *         <p>
     *         For more information about reserved words in MySQL 5.6 or 5.7, see the Keywords and Reserved Words
     *         articles for <a href="https://dev.mysql.com/doc/refman/5.6/en/keywords.html">MySQL 5.6</a>, <a
     *         href="https://dev.mysql.com/doc/refman/5.7/en/keywords.html">MySQL 5.7</a>, or <a
     *         href="https://dev.mysql.com/doc/refman/8.0/en/keywords.html">MySQL 8.0</a>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>PostgreSQL</b>
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Required for PostgreSQL.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be 1 to 63 letters or numbers. Can contain underscores.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't be a reserved word for the chosen database engine.
     *         </p>
     *         <p>
     *         For more information about reserved words in MySQL 5.6 or 5.7, see the Keywords and Reserved Words
     *         articles for <a href="https://www.postgresql.org/docs/9.6/sql-keywords-appendix.html">PostgreSQL 9.6</a>,
     *         <a href="https://www.postgresql.org/docs/10/sql-keywords-appendix.html">PostgreSQL 10</a>, <a
     *         href="https://www.postgresql.org/docs/11/sql-keywords-appendix.html">PostgreSQL 11</a>, and <a
     *         href="https://www.postgresql.org/docs/12/sql-keywords-appendix.html">PostgreSQL 12</a>.
     *         </p>
     *         </li>
     */

    public String getMasterUsername() {
        return this.masterUsername;
    }

    /**
     * <p>
     * The name for the master user.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required for MySQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 16 letters or numbers. Can contain underscores.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a reserved word for the chosen database engine.
     * </p>
     * <p>
     * For more information about reserved words in MySQL 5.6 or 5.7, see the Keywords and Reserved Words articles for
     * <a href="https://dev.mysql.com/doc/refman/5.6/en/keywords.html">MySQL 5.6</a>, <a
     * href="https://dev.mysql.com/doc/refman/5.7/en/keywords.html">MySQL 5.7</a>, or <a
     * href="https://dev.mysql.com/doc/refman/8.0/en/keywords.html">MySQL 8.0</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required for PostgreSQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 63 letters or numbers. Can contain underscores.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a reserved word for the chosen database engine.
     * </p>
     * <p>
     * For more information about reserved words in MySQL 5.6 or 5.7, see the Keywords and Reserved Words articles for
     * <a href="https://www.postgresql.org/docs/9.6/sql-keywords-appendix.html">PostgreSQL 9.6</a>, <a
     * href="https://www.postgresql.org/docs/10/sql-keywords-appendix.html">PostgreSQL 10</a>, <a
     * href="https://www.postgresql.org/docs/11/sql-keywords-appendix.html">PostgreSQL 11</a>, and <a
     * href="https://www.postgresql.org/docs/12/sql-keywords-appendix.html">PostgreSQL 12</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param masterUsername
     *        The name for the master user.</p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Required for MySQL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be 1 to 16 letters or numbers. Can contain underscores.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be a reserved word for the chosen database engine.
     *        </p>
     *        <p>
     *        For more information about reserved words in MySQL 5.6 or 5.7, see the Keywords and Reserved Words
     *        articles for <a href="https://dev.mysql.com/doc/refman/5.6/en/keywords.html">MySQL 5.6</a>, <a
     *        href="https://dev.mysql.com/doc/refman/5.7/en/keywords.html">MySQL 5.7</a>, or <a
     *        href="https://dev.mysql.com/doc/refman/8.0/en/keywords.html">MySQL 8.0</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Required for PostgreSQL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be 1 to 63 letters or numbers. Can contain underscores.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be a reserved word for the chosen database engine.
     *        </p>
     *        <p>
     *        For more information about reserved words in MySQL 5.6 or 5.7, see the Keywords and Reserved Words
     *        articles for <a href="https://www.postgresql.org/docs/9.6/sql-keywords-appendix.html">PostgreSQL 9.6</a>,
     *        <a href="https://www.postgresql.org/docs/10/sql-keywords-appendix.html">PostgreSQL 10</a>, <a
     *        href="https://www.postgresql.org/docs/11/sql-keywords-appendix.html">PostgreSQL 11</a>, and <a
     *        href="https://www.postgresql.org/docs/12/sql-keywords-appendix.html">PostgreSQL 12</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelationalDatabaseRequest withMasterUsername(String masterUsername) {
        setMasterUsername(masterUsername);
        return this;
    }

    /**
     * <p>
     * The password for the master user. The password can include any printable ASCII character except "/", """, or "@".
     * It cannot contain spaces.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 128 characters.
     * </p>
     * 
     * @param masterUserPassword
     *        The password for the master user. The password can include any printable ASCII character except "/",
     *        """, or "@". It cannot contain spaces.</p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 41 characters.
     *        </p>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 128 characters.
     */

    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    /**
     * <p>
     * The password for the master user. The password can include any printable ASCII character except "/", """, or "@".
     * It cannot contain spaces.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 128 characters.
     * </p>
     * 
     * @return The password for the master user. The password can include any printable ASCII character except "/",
     *         """, or "@". It cannot contain spaces.</p>
     *         <p>
     *         <b>MySQL</b>
     *         </p>
     *         <p>
     *         Constraints: Must contain from 8 to 41 characters.
     *         </p>
     *         <p>
     *         <b>PostgreSQL</b>
     *         </p>
     *         <p>
     *         Constraints: Must contain from 8 to 128 characters.
     */

    public String getMasterUserPassword() {
        return this.masterUserPassword;
    }

    /**
     * <p>
     * The password for the master user. The password can include any printable ASCII character except "/", """, or "@".
     * It cannot contain spaces.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 128 characters.
     * </p>
     * 
     * @param masterUserPassword
     *        The password for the master user. The password can include any printable ASCII character except "/",
     *        """, or "@". It cannot contain spaces.</p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 41 characters.
     *        </p>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 128 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelationalDatabaseRequest withMasterUserPassword(String masterUserPassword) {
        setMasterUserPassword(masterUserPassword);
        return this;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created for your new database if automated backups are
     * enabled.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. For more
     * information about the preferred backup window time blocks for each region, see the <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     * >Working With Backups</a> guide in the Amazon Relational Database Service (Amazon RDS) documentation.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the <code>hh24:mi-hh24:mi</code> format.
     * </p>
     * <p>
     * Example: <code>16:00-16:30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param preferredBackupWindow
     *        The daily time range during which automated backups are created for your new database if automated backups
     *        are enabled.</p>
     *        <p>
     *        The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. For
     *        more information about the preferred backup window time blocks for each region, see the <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     *        >Working With Backups</a> guide in the Amazon Relational Database Service (Amazon RDS) documentation.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be in the <code>hh24:mi-hh24:mi</code> format.
     *        </p>
     *        <p>
     *        Example: <code>16:00-16:30</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specified in Coordinated Universal Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must not conflict with the preferred maintenance window.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be at least 30 minutes.
     *        </p>
     *        </li>
     */

    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created for your new database if automated backups are
     * enabled.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. For more
     * information about the preferred backup window time blocks for each region, see the <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     * >Working With Backups</a> guide in the Amazon Relational Database Service (Amazon RDS) documentation.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the <code>hh24:mi-hh24:mi</code> format.
     * </p>
     * <p>
     * Example: <code>16:00-16:30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The daily time range during which automated backups are created for your new database if automated
     *         backups are enabled.</p>
     *         <p>
     *         The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region.
     *         For more information about the preferred backup window time blocks for each region, see the <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     *         >Working With Backups</a> guide in the Amazon Relational Database Service (Amazon RDS) documentation.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be in the <code>hh24:mi-hh24:mi</code> format.
     *         </p>
     *         <p>
     *         Example: <code>16:00-16:30</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specified in Coordinated Universal Time (UTC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must not conflict with the preferred maintenance window.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be at least 30 minutes.
     *         </p>
     *         </li>
     */

    public String getPreferredBackupWindow() {
        return this.preferredBackupWindow;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created for your new database if automated backups are
     * enabled.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. For more
     * information about the preferred backup window time blocks for each region, see the <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     * >Working With Backups</a> guide in the Amazon Relational Database Service (Amazon RDS) documentation.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the <code>hh24:mi-hh24:mi</code> format.
     * </p>
     * <p>
     * Example: <code>16:00-16:30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param preferredBackupWindow
     *        The daily time range during which automated backups are created for your new database if automated backups
     *        are enabled.</p>
     *        <p>
     *        The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. For
     *        more information about the preferred backup window time blocks for each region, see the <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     *        >Working With Backups</a> guide in the Amazon Relational Database Service (Amazon RDS) documentation.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be in the <code>hh24:mi-hh24:mi</code> format.
     *        </p>
     *        <p>
     *        Example: <code>16:00-16:30</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specified in Coordinated Universal Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must not conflict with the preferred maintenance window.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be at least 30 minutes.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelationalDatabaseRequest withPreferredBackupWindow(String preferredBackupWindow) {
        setPreferredBackupWindow(preferredBackupWindow);
        return this;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur on your new database.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region, occurring
     * on a random day of the week.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the <code>ddd:hh24:mi-ddd:hh24:mi</code> format.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>Tue:17:00-Tue:17:30</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range during which system maintenance can occur on your new database.</p>
     *        <p>
     *        The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region,
     *        occurring on a random day of the week.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be in the <code>ddd:hh24:mi-ddd:hh24:mi</code> format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be at least 30 minutes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specified in Coordinated Universal Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example: <code>Tue:17:00-Tue:17:30</code>
     *        </p>
     *        </li>
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur on your new database.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region, occurring
     * on a random day of the week.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the <code>ddd:hh24:mi-ddd:hh24:mi</code> format.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>Tue:17:00-Tue:17:30</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The weekly time range during which system maintenance can occur on your new database.</p>
     *         <p>
     *         The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region,
     *         occurring on a random day of the week.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be in the <code>ddd:hh24:mi-ddd:hh24:mi</code> format.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be at least 30 minutes.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specified in Coordinated Universal Time (UTC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Example: <code>Tue:17:00-Tue:17:30</code>
     *         </p>
     *         </li>
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur on your new database.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region, occurring
     * on a random day of the week.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the <code>ddd:hh24:mi-ddd:hh24:mi</code> format.
     * </p>
     * </li>
     * <li>
     * <p>
     * Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Example: <code>Tue:17:00-Tue:17:30</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range during which system maintenance can occur on your new database.</p>
     *        <p>
     *        The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region,
     *        occurring on a random day of the week.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be in the <code>ddd:hh24:mi-ddd:hh24:mi</code> format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be at least 30 minutes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specified in Coordinated Universal Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Example: <code>Tue:17:00-Tue:17:30</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelationalDatabaseRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * Specifies the accessibility options for your new database. A value of <code>true</code> specifies a database that
     * is available to resources outside of your Lightsail account. A value of <code>false</code> specifies a database
     * that is available only to your Lightsail resources in the same region as your database.
     * </p>
     * 
     * @param publiclyAccessible
     *        Specifies the accessibility options for your new database. A value of <code>true</code> specifies a
     *        database that is available to resources outside of your Lightsail account. A value of <code>false</code>
     *        specifies a database that is available only to your Lightsail resources in the same region as your
     *        database.
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for your new database. A value of <code>true</code> specifies a database that
     * is available to resources outside of your Lightsail account. A value of <code>false</code> specifies a database
     * that is available only to your Lightsail resources in the same region as your database.
     * </p>
     * 
     * @return Specifies the accessibility options for your new database. A value of <code>true</code> specifies a
     *         database that is available to resources outside of your Lightsail account. A value of <code>false</code>
     *         specifies a database that is available only to your Lightsail resources in the same region as your
     *         database.
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for your new database. A value of <code>true</code> specifies a database that
     * is available to resources outside of your Lightsail account. A value of <code>false</code> specifies a database
     * that is available only to your Lightsail resources in the same region as your database.
     * </p>
     * 
     * @param publiclyAccessible
     *        Specifies the accessibility options for your new database. A value of <code>true</code> specifies a
     *        database that is available to resources outside of your Lightsail account. A value of <code>false</code>
     *        specifies a database that is available only to your Lightsail resources in the same region as your
     *        database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelationalDatabaseRequest withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * Specifies the accessibility options for your new database. A value of <code>true</code> specifies a database that
     * is available to resources outside of your Lightsail account. A value of <code>false</code> specifies a database
     * that is available only to your Lightsail resources in the same region as your database.
     * </p>
     * 
     * @return Specifies the accessibility options for your new database. A value of <code>true</code> specifies a
     *         database that is available to resources outside of your Lightsail account. A value of <code>false</code>
     *         specifies a database that is available only to your Lightsail resources in the same region as your
     *         database.
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * Use the <code>TagResource</code> action to tag a resource after it's created.
     * </p>
     * 
     * @return The tag keys and optional values to add to the resource during create.</p>
     *         <p>
     *         Use the <code>TagResource</code> action to tag a resource after it's created.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * Use the <code>TagResource</code> action to tag a resource after it's created.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values to add to the resource during create.</p>
     *        <p>
     *        Use the <code>TagResource</code> action to tag a resource after it's created.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * Use the <code>TagResource</code> action to tag a resource after it's created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values to add to the resource during create.</p>
     *        <p>
     *        Use the <code>TagResource</code> action to tag a resource after it's created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelationalDatabaseRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * Use the <code>TagResource</code> action to tag a resource after it's created.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values to add to the resource during create.</p>
     *        <p>
     *        Use the <code>TagResource</code> action to tag a resource after it's created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelationalDatabaseRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getRelationalDatabaseName() != null)
            sb.append("RelationalDatabaseName: ").append(getRelationalDatabaseName()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getRelationalDatabaseBlueprintId() != null)
            sb.append("RelationalDatabaseBlueprintId: ").append(getRelationalDatabaseBlueprintId()).append(",");
        if (getRelationalDatabaseBundleId() != null)
            sb.append("RelationalDatabaseBundleId: ").append(getRelationalDatabaseBundleId()).append(",");
        if (getMasterDatabaseName() != null)
            sb.append("MasterDatabaseName: ").append(getMasterDatabaseName()).append(",");
        if (getMasterUsername() != null)
            sb.append("MasterUsername: ").append(getMasterUsername()).append(",");
        if (getMasterUserPassword() != null)
            sb.append("MasterUserPassword: ").append("***Sensitive Data Redacted***").append(",");
        if (getPreferredBackupWindow() != null)
            sb.append("PreferredBackupWindow: ").append(getPreferredBackupWindow()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: ").append(getPubliclyAccessible()).append(",");
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

        if (obj instanceof CreateRelationalDatabaseRequest == false)
            return false;
        CreateRelationalDatabaseRequest other = (CreateRelationalDatabaseRequest) obj;
        if (other.getRelationalDatabaseName() == null ^ this.getRelationalDatabaseName() == null)
            return false;
        if (other.getRelationalDatabaseName() != null && other.getRelationalDatabaseName().equals(this.getRelationalDatabaseName()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getRelationalDatabaseBlueprintId() == null ^ this.getRelationalDatabaseBlueprintId() == null)
            return false;
        if (other.getRelationalDatabaseBlueprintId() != null
                && other.getRelationalDatabaseBlueprintId().equals(this.getRelationalDatabaseBlueprintId()) == false)
            return false;
        if (other.getRelationalDatabaseBundleId() == null ^ this.getRelationalDatabaseBundleId() == null)
            return false;
        if (other.getRelationalDatabaseBundleId() != null && other.getRelationalDatabaseBundleId().equals(this.getRelationalDatabaseBundleId()) == false)
            return false;
        if (other.getMasterDatabaseName() == null ^ this.getMasterDatabaseName() == null)
            return false;
        if (other.getMasterDatabaseName() != null && other.getMasterDatabaseName().equals(this.getMasterDatabaseName()) == false)
            return false;
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null)
            return false;
        if (other.getMasterUsername() != null && other.getMasterUsername().equals(this.getMasterUsername()) == false)
            return false;
        if (other.getMasterUserPassword() == null ^ this.getMasterUserPassword() == null)
            return false;
        if (other.getMasterUserPassword() != null && other.getMasterUserPassword().equals(this.getMasterUserPassword()) == false)
            return false;
        if (other.getPreferredBackupWindow() == null ^ this.getPreferredBackupWindow() == null)
            return false;
        if (other.getPreferredBackupWindow() != null && other.getPreferredBackupWindow().equals(this.getPreferredBackupWindow()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
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

        hashCode = prime * hashCode + ((getRelationalDatabaseName() == null) ? 0 : getRelationalDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getRelationalDatabaseBlueprintId() == null) ? 0 : getRelationalDatabaseBlueprintId().hashCode());
        hashCode = prime * hashCode + ((getRelationalDatabaseBundleId() == null) ? 0 : getRelationalDatabaseBundleId().hashCode());
        hashCode = prime * hashCode + ((getMasterDatabaseName() == null) ? 0 : getMasterDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode());
        hashCode = prime * hashCode + ((getMasterUserPassword() == null) ? 0 : getMasterUserPassword().hashCode());
        hashCode = prime * hashCode + ((getPreferredBackupWindow() == null) ? 0 : getPreferredBackupWindow().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateRelationalDatabaseRequest clone() {
        return (CreateRelationalDatabaseRequest) super.clone();
    }

}
