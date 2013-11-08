/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

/**
 * Classes used to support the AWS SDK metrics API.
 * 
 * When the default request metric collection system is enabled, 
 * the default AWS SDK implementation
 * captures a set of predefined core metrics that are grouped under two major 
 * categories:  AWS Request Metrics and JVM/OS Metrics.
 * <h3>AWS Request Metrics</h3>
 * <ol>
 * <li>ClientExecuteTime - Total number of milliseconds taken for a 
 * request/response including the time taken to execute the request handlers,
 * round trip to AWS, and the time taken to execute the response handlers.
 * Captured on a per request type level.</li>
 * <li>Exception - Number of request failure. Captured both on a per service 
 * client type level and a per request type level.</li>
 * <li>HttpRequestTime - Number of milliseconds taken for a request/response 
 * round trip to AWS. Captured on a per request type level.< /li>
 * <li>RequestCount - Number of requests. Captured on a per service 
 * client type level. </li>
 * <li>RetryCount - Number of retries per request. Captured on a per service 
 * client type level. </li>
 * </ol>
 * <h3>JVM/OS Metrics</h3>
 * <h4>Memory</h4>
 * <ol>
 * <li>TotalMemory - Total amount of memory currently available to the JVM for
 * current and future objects, measured in bytes. This value may vary over 
 * time, depending on the host environment.</li>
 * <li>FreeMemory - An approximation to the total amount of memory currently 
 * available to the JVM for future allocated objects, measured in bytes.</li>
 * <li>UsedMemory - TotalMemory minus FreeMemory.</li>
 * <li>SpareMemory - The maximum amount of memory that the JVM will attempt to
 * use, measured in bytes, minus UsedMemory. </li>
 * </ol>
 * <h4>Threads</h4>
 * <ol>
 * <li>ThreadCount - The current number of live threads including both daemon 
 * and non-daemon threads.</li>
 * <li>DeadLockThreadCount - The number of threads that are deadlocked waiting 
 * for object monitors or ownable synchronizers, if any. Threads are deadlocked
 *  in a cycle waiting for a lock of these two types if each thread owns one 
 *  lock while trying to acquire another lock already held by another thread in
 *   the cycle. No metrics is generated when the value is zero.</li>
 * <li>DaemonThreadCount - The current number of live daemon threads. No metrics
 *  is generated when the value is zero.</li>
 * <li>PeakThreadCount - The peak live thread count since the JVM started or 
 * since the peak was reset.</li>
 * <li>TotalStartedThreadCount - The total number of threads created and also 
 * started since the JVM started.</li>
 * </ol>
 * <h4>File Descriptors</h4>
 * <ol>
 * <li>OpenFileDescriptorCount - Number of opened file descriptors of the 
 * operating system.</li>
 * <li>SpareFileDescriptorCount - Maximum number of file descriptors of the 
 * operating system minus OpenFileDescriptorCount.</li>
 * </ol>
 */
package com.amazonaws.metrics;

