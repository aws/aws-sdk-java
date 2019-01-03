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
 * Classes for creating custom AWS access control policies.  Policies allow you to specify fine grained
 * access controls on your AWS resources.  You can allow or deny access to your AWS resources based on:
 * <ul>
 *   <li>what <b>resource</b> is being accessed
 *   <li>who is accessing the resource (i.e. the <b>principal</b>)
 *   <li>what <b>action</b> is being taken on the resource
 *   <li>a variety of <b>conditions</b> including date restrictions, IP address restrictions, etc.
 * </ul>
 *
 * <p>
 * Access control policies are a collection of statements.
 * Each statement takes the form:  "A has permission to do B to C where D applies".
 * <ul>
 *   <li>A is the <b>principal</b> - the AWS account that is making a request to
 *       access or modify one of your AWS resources.
 *   <li>B is the <b>action</b> - the way in which your AWS resource is being accessed or modified, such
 *       as sending a message to an Amazon SQS queue, or storing an object in an Amazon S3 bucket.
 *   <li>C is the <b>resource</b> - your AWS entity that the principal wants to access, such
 *       as an Amazon SQS queue, or an object stored in Amazon S3.
 *   <li>D is the set of <b>conditions</b> - optional constraints that specify when to allow or deny
 *       access for the principal to access your resource.  Many expressive conditions are available,
 *       some specific to each service.  For example you can use date conditions to allow access to
 *       your resources only after or before a specific time.
 * </ul>
 *
 * <p>
 * The following code creates a policy to allow a specific AWS account to send
 * and receive messages using one of your Amazon SQS queues:
 * <pre class="brush: java">
 *    Policy policy = new Policy("MyQueuePolicy");
 *    policy.withStatements(new Statement(Effect.Allow)
 *           .withPrincipals(new Principal("123456789012"))
 *           .withActions(SQSActions.SendMessage, SQSActions.ReceiveMessage)
 *           .withResources(new SQSQueueResource("987654321000", "queue2")));
 * </pre>
 *
 * <p>
 * Once you've created a policy, you need to use methods on the service to upload your policy to AWS.
 */
package com.amazonaws.auth.policy;
