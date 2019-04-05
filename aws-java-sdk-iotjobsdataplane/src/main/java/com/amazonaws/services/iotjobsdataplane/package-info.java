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
 * <p>
 * AWS IoT Jobs is a service that allows you to define a set of jobs — remote operations that are sent to and executed
 * on one or more devices connected to AWS IoT. For example, you can define a job that instructs a set of devices to
 * download and install application or firmware updates, reboot, rotate certificates, or perform remote troubleshooting
 * operations.
 * </p>
 * <p>
 * To create a job, you make a job document which is a description of the remote operations to be performed, and you
 * specify a list of targets that should perform the operations. The targets can be individual things, thing groups or
 * both.
 * </p>
 * <p>
 * AWS IoT Jobs sends a message to inform the targets that a job is available. The target starts the execution of the
 * job by downloading the job document, performing the operations it specifies, and reporting its progress to AWS IoT.
 * The Jobs service provides commands to track the progress of a job on a specific target and for all the targets of the
 * job
 * </p>
 */
package com.amazonaws.services.iotjobsdataplane;

