/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
 * <fullname>Amazon DynamoDB Streams</fullname> <p>This is the Amazon DynamoDB Streams API Reference. This guide describes the low-level API actions for accessing streams and processing stream records. For information about application development with DynamoDB Streams, see the <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide//Streams.html">Amazon DynamoDB Developer Guide</a>.</p> <p>Note that this document is intended for use with the following DynamoDB documentation:</p> <ul> <li> <p> <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/">Amazon DynamoDB Developer Guide</a> </p> </li> <li> <p> <a href="http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/">Amazon DynamoDB API Reference</a> </p> </li> </ul> <p>The following are short descriptions of each low-level DynamoDB Streams API action, organized by function.</p> <ul> <li><p><i>DescribeStream</i> - Returns detailed information about a particular stream.</p></li> <li> <p><i>GetRecords</i> - Retrieves the stream records from within a shard.</p> </li> <li> <p><i>GetShardIterator</i> - Returns information on how to retrieve the streams record from a shard with a given shard ID.</p> </li> <li> <p><i>ListStreams</i> - Returns a list of all the streams associated with the current AWS account and endpoint.</p> </li> </ul>
 */
package com.amazonaws.services.dynamodbv2;