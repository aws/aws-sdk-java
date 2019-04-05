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

/**
 * <fullname>Amazon Relational Database Service</fullname>
 * <p>
 * </p>
 * <p>
 * Amazon Relational Database Service (Amazon RDS) is a web service that makes it easier to set up, operate, and scale a
 * relational database in the cloud. It provides cost-efficient, resizable capacity for an industry-standard relational
 * database and manages common database administration tasks, freeing up developers to focus on what makes their
 * applications and businesses unique.
 * </p>
 * <p>
 * Amazon RDS gives you access to the capabilities of a MySQL, MariaDB, PostgreSQL, Microsoft SQL Server, Oracle, or
 * Amazon Aurora database server. These capabilities mean that the code, applications, and tools you already use today
 * with your existing databases work with Amazon RDS without modification. Amazon RDS automatically backs up your
 * database and maintains the database software that powers your DB instance. Amazon RDS is flexible: you can scale your
 * DB instance's compute resources and storage capacity to meet your application's demand. As with all Amazon Web
 * Services, there are no up-front investments, and you pay only for the resources you use.
 * </p>
 * <p>
 * This interface reference for Amazon RDS contains documentation for a programming or command line interface you can
 * use to manage Amazon RDS. Note that Amazon RDS is asynchronous, which means that some interfaces might require
 * techniques such as polling or callback functions to determine when a command has been applied. In this reference, the
 * parameter descriptions indicate whether a command is applied immediately, on the next instance reboot, or during the
 * maintenance window. The reference structure is as follows, and we list following some related topics from the user
 * guide.
 * </p>
 * <p>
 * <b>Amazon RDS API Reference</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * For the alphabetical list of API actions, see <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Operations.html">API Actions</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For the alphabetical list of data types, see <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_Types.html">Data Types</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For a list of common query parameters, see <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/CommonParameters.html">Common Parameters</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For descriptions of the error codes, see <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/CommonErrors.html">Common Errors</a>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Amazon RDS User Guide</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * For a summary of the Amazon RDS interfaces, see <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Welcome.html#Welcome.Interfaces">Available RDS
 * Interfaces</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For more information about how to use the Query API, see <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Using_the_Query_API.html">Using the Query API</a>.
 * </p>
 * </li>
 * </ul>
 */
package com.amazonaws.services.rds;

