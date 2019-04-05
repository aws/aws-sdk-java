/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * When the default metric collection system is enabled, 
 * the default AWS SDK implementation
 * captures a set of predefined core metrics that are grouped under three major 
 * categories:  AWS Request Metrics, AWS Service Metrics, and Machine Metrics.
 * <h3>Nomenclature</h3>
 * <ul>
 * <li>Physical Http Request - an http request initiated by the http client library used by AWS Java SDK . No retry is involved, or at least not initiated from the JVM.</li>
 * <li>Logical Http Request - an http request initiated from the AWS Java SDK by executing the underlying http client library. A logical request may involve multiple physical requests due to retries.</li>
 * <li>Service Client type - the specific subtype of AmazonWebServiceClient, such as AmazonS3Client, AmazonDynamoDBClient, etc.</li>
 * <li>Request type - the specific subtype of AmazonWebServiceRequest, such as PutItemRequest, PutObjectRequest, etc.</li>
 * <li>Http Client Library - the <a href="http://hc.apache.org/httpcomponents-client-4.2.x/index.html">Apache HttpComponents client</a> library</li>
 * </ul>
 * 
 * <h3>AWS Request Metrics</h3>
 * <ol>
 * <li>ClientExecuteTime - Total number of milliseconds taken for a 
 * request/response including the time taken to execute the request handlers,
 * round trip to AWS, and the time taken to execute the response handlers.
 * Captured on a per request type level.</li>
 * <li>Exception - Number of logical request failure. Captured both on a per service 
 * client type level and a per request type level.</li>
 * <li>HttpClientPoolAvailableCount - Number of idle persistent connections of
 * the underlying httpclient.
 * This metric is collected from the respective <a 
 * href="https://hc.apache.org/httpcomponents-core-ga/httpcore/apidocs/org/apache/http/pool/PoolStats.html"
 * >PoolStats</a> before the connection of a request is obtained.</li>
 * <li>HttpClientPoolLeasedCount - Number of persistent connections tracked by 
 * the underlying httpclient connection manager currently being used to execute
 * requests.
 * This metric is collected from the respective <a 
 * href="https://hc.apache.org/httpcomponents-core-ga/httpcore/apidocs/org/apache/http/pool/PoolStats.html"
 * >PoolStats</a> before the connection of a request is obtained.</li>
 * <li>HttpClientPoolPendingCount - Number of connection requests being blocked
 * awaiting a free connection of the underlying httpclient.
 * This metric is collected from the respective <a 
 * href="https://hc.apache.org/httpcomponents-core-ga/httpcore/apidocs/org/apache/http/pool/PoolStats.html"
 * >PoolStats</a>. before the connection of a request is obtained</li>
 * <li>HttpRequestTime - Number of milliseconds taken for a logical request/response 
 * round trip to AWS. Captured on a per request type level.</li>
 * <li>HttpClientSendRequestTime - Number of milliseconds taken for a physical request
 * to get sent to AWS. Captured on a per request type level.</li>
 * <li>HttpClientReceiveResponseTime - Number of milliseconds taken for a physical response
 * to get received from AWS. Captured on a per request type level.</li>
 * <li>HttpClientRetryCount - Number of retries per physical request. Captured on a per service 
 * client type level. </li>
 * <li>RequestCount - Number of logical requests. Captured on a per service 
 * client type level. </li>
 * <li>RetryCount - Number of retries per logical request. Captured on a per service 
 * client type level. </li>
 * <li>ThrottleException - Number of times of a request has been throttled by the service.</li>
 * <li>DynamoDBConsumedCapacity - Number of Amazon DynamoDB capacity units consumed.
 * Captured on a per request type level, and is only available if the request
 * has been specified with the necessary "ReturnConsumedCapacity" parameter.
 * </li>
 * </ol>
 * <h3>AWS Service Metrics</h3>
 * <ol>
 * <li>HttpClientGetConnectionTime - Total number of milliseconds taken for the
 * underlying http client library to get a connection.
 * <li>S3DownloadThroughput - Number of bytes downloaded from S3 per second.</li>
 * <li>S3DownloadByteCount - Number of bytes downloaded from S3.</li>
 * <li>S3UploadThroughput - Number of bytes uploaded to S3 per second.</li>
 * <li>S3UploadByteCount - Number of bytes uploaded to S3.</li>
 * </ol>
 * <h3>Machine Metrics</h3>
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

