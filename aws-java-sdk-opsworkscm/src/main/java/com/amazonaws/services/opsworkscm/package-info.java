/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <fullname>AWS OpsWorks for Chef Automate</fullname>
 * <p>
 * A service that runs and manages configuration management servers.
 * </p>
 * <p>
 * Glossary of terms
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Server</b>: A server is a configuration management server, and can be highly-available. The configuration manager
 * runs on your instances by using various AWS services, such as Amazon Elastic Compute Cloud (EC2), and potentially
 * Amazon Relational Database Service (RDS). A server is a generic abstraction over the configuration manager that you
 * want to use, much like Amazon RDS. In AWS OpsWorks for Chef Automate, you do not start or stop servers. After you
 * create servers, they continue to run until they are deleted.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Engine</b>: The specific configuration manager that you want to use (such as <code>Chef</code>) is the engine.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Backup</b>: This is an application-level backup of the data that the configuration manager stores. A backup
 * creates a .tar.gz file that is stored in an Amazon Simple Storage Service (S3) bucket in your account. AWS OpsWorks
 * for Chef Automate creates the S3 bucket when you launch the first instance. A backup maintains a snapshot of all of a
 * server's important attributes at the time of the backup.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Events</b>: Events are always related to a server. Events are written during server creation, when health checks
 * run, when backups are created, etc. When you delete a server, the server's events are also deleted.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>AccountAttributes</b>: Every account has attributes that are assigned in the AWS OpsWorks for Chef Automate
 * database. These attributes store information about configuration limits (servers, backups, etc.) and your customer
 * account.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Throttling limits
 * </p>
 * <p>
 * All API operations allow for 5 requests per second with a burst of 10 requests per second.
 * </p>
 */
package com.amazonaws.services.opsworkscm;

