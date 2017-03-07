/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * AWS OpsWorks for Chef Automate is a service that runs and manages configuration management servers.
 * </p>
 * <p>
 * <b>Glossary of terms</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Server</b>: A configuration management server that can be highly-available. The configuration manager runs on your
 * instances by using various AWS services, such as Amazon Elastic Compute Cloud (EC2), and potentially Amazon
 * Relational Database Service (RDS). A server is a generic abstraction over the configuration manager that you want to
 * use, much like Amazon RDS. In AWS OpsWorks for Chef Automate, you do not start or stop servers. After you create
 * servers, they continue to run until they are deleted.
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
 * <b>Endpoints</b>
 * </p>
 * <p>
 * AWS OpsWorks for Chef Automate supports the following endpoints, all HTTPS. You must connect to one of the following
 * endpoints. Chef servers can only be accessed or managed within the endpoint in which they are created.
 * </p>
 * <ul>
 * <li>
 * <p>
 * opsworks-cm.us-east-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks-cm.us-west-2.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks-cm.eu-west-1.amazonaws.com
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Throttling limits</b>
 * </p>
 * <p>
 * All API operations allow for five requests per second with a burst of 10 requests per second.
 * </p>
 */
package com.amazonaws.services.opsworkscm;

