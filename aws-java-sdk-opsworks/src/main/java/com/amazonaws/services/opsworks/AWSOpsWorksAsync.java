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
package com.amazonaws.services.opsworks;

import com.amazonaws.services.opsworks.model.*;

/**
 * Interface for accessing AWS OpsWorks asynchronously. Each asynchronous method
 * will return a Java Future object representing the asynchronous operation;
 * overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS OpsWorks</fullname>
 * <p>
 * Welcome to the <i>AWS OpsWorks API Reference</i>. This guide provides
 * descriptions, syntax, and usage examples about AWS OpsWorks actions and data
 * types, including common parameters and error codes.
 * </p>
 * <p>
 * AWS OpsWorks is an application management service that provides an integrated
 * experience for overseeing the complete application lifecycle. For information
 * about this product, go to the <a href="http://aws.amazon.com/opsworks/">AWS
 * OpsWorks</a> details page.
 * </p>
 * <p>
 * <b>SDKs and CLI</b>
 * </p>
 * <p>
 * The most common way to use the AWS OpsWorks API is by using the AWS Command
 * Line Interface (CLI) or by using one of the AWS SDKs to implement
 * applications in your preferred language. For more information, see:
 * </p>
 * <ul>
 * <li><a href=
 * "http://docs.aws.amazon.com/cli/latest/userguide/cli-chap-welcome.html">AWS
 * CLI</a></li>
 * <li><a href=
 * "http://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/opsworks/AWSOpsWorksClient.html"
 * >AWS SDK for Java</a></li>
 * <li><a href=
 * "http://docs.aws.amazon.com/sdkfornet/latest/apidocs/html/N_Amazon_OpsWorks.htm"
 * >AWS SDK for .NET</a></li>
 * <li><a href=
 * "http://docs.aws.amazon.com/aws-sdk-php-2/latest/class-Aws.OpsWorks.OpsWorksClient.html"
 * >AWS SDK for PHP 2</a></li>
 * <li><a href=
 * "http://docs.aws.amazon.com/AWSRubySDK/latest/AWS/OpsWorks/Client.html">AWS
 * SDK for Ruby</a></li>
 * <li><a href="http://aws.amazon.com/documentation/sdkforjavascript/">AWS SDK
 * for Node.js</a></li>
 * <li><a href="http://docs.pythonboto.org/en/latest/ref/opsworks.html">AWS SDK
 * for Python(Boto)</a></li>
 * </ul>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * AWS OpsWorks supports only one endpoint, opsworks.us-east-1.amazonaws.com
 * (HTTPS), so you must connect to that endpoint. You can then use the API to
 * direct AWS OpsWorks to create stacks in any AWS Region.
 * </p>
 * <p>
 * <b>Chef Versions</b>
 * </p>
 * <p>
 * When you call <a>CreateStack</a>, <a>CloneStack</a>, or <a>UpdateStack</a> we
 * recommend you use the <code>ConfigurationManager</code> parameter to specify
 * the Chef version. The recommended value for Linux stacks, which is also the
 * default value, is currently 11.10. Windows stacks use Chef 12.2. For more
 * information, see <a href=
 * "http://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-chef11.html"
 * >Chef Versions</a>.
 * </p>
 * <note>You can also specify Chef 11.4 or Chef 0.9 for your Linux stack.
 * However, Chef 0.9 has been deprecated. We do not recommend using Chef 0.9 for
 * new stacks, and we recommend migrating your existing Chef 0.9 stacks to Chef
 * 11.10 as soon as possible.</note>
 */
public interface AWSOpsWorksAsync extends AWSOpsWorks {

    /**
     * <p>
     * Assign a registered instance to a layer.
     * </p>
     * <ul>
     * <li>You can assign registered on-premises instances to any layer type.</li>
     * <li>You can assign registered Amazon EC2 instances only to custom layers.
     * </li>
     * <li>You cannot use this action with instances that were created with AWS
     * OpsWorks.</li>
     * </ul>
     * <p>
     * <b>Required Permissions</b>: To use this action, an AWS Identity and
     * Access Management (IAM) user must have a Manage permissions level for the
     * stack or an attached policy that explicitly grants permissions. For more
     * information on user permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param assignInstanceRequest
     * @sample AWSOpsWorksAsync.AssignInstance
     */
    java.util.concurrent.Future<Void> assignInstanceAsync(
            AssignInstanceRequest assignInstanceRequest);

    /**
     * <p>
     * Assign a registered instance to a layer.
     * </p>
     * <ul>
     * <li>You can assign registered on-premises instances to any layer type.</li>
     * <li>You can assign registered Amazon EC2 instances only to custom layers.
     * </li>
     * <li>You cannot use this action with instances that were created with AWS
     * OpsWorks.</li>
     * </ul>
     * <p>
     * <b>Required Permissions</b>: To use this action, an AWS Identity and
     * Access Management (IAM) user must have a Manage permissions level for the
     * stack or an attached policy that explicitly grants permissions. For more
     * information on user permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param assignInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSOpsWorksAsyncHandler.AssignInstance
     */
    java.util.concurrent.Future<Void> assignInstanceAsync(
            AssignInstanceRequest assignInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<AssignInstanceRequest, Void> asyncHandler);

    /**
     * <p>
     * Assigns one of the stack's registered Amazon EBS volumes to a specified
     * instance. The volume must first be registered with the stack by calling
     * <a>RegisterVolume</a>. After you register the volume, you must call
     * <a>UpdateVolume</a> to specify a mount point before calling
     * <code>AssignVolume</code>. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"
     * >Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param assignVolumeRequest
     * @sample AWSOpsWorksAsync.AssignVolume
     */
    java.util.concurrent.Future<Void> assignVolumeAsync(
            AssignVolumeRequest assignVolumeRequest);

    /**
     * <p>
     * Assigns one of the stack's registered Amazon EBS volumes to a specified
     * instance. The volume must first be registered with the stack by calling
     * <a>RegisterVolume</a>. After you register the volume, you must call
     * <a>UpdateVolume</a> to specify a mount point before calling
     * <code>AssignVolume</code>. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"
     * >Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param assignVolumeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSOpsWorksAsyncHandler.AssignVolume
     */
    java.util.concurrent.Future<Void> assignVolumeAsync(
            AssignVolumeRequest assignVolumeRequest,
            com.amazonaws.handlers.AsyncHandler<AssignVolumeRequest, Void> asyncHandler);

    /**
     * <p>
     * Associates one of the stack's registered Elastic IP addresses with a
     * specified instance. The address must first be registered with the stack
     * by calling <a>RegisterElasticIp</a>. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"
     * >Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param associateElasticIpRequest
     * @sample AWSOpsWorksAsync.AssociateElasticIp
     */
    java.util.concurrent.Future<Void> associateElasticIpAsync(
            AssociateElasticIpRequest associateElasticIpRequest);

    /**
     * <p>
     * Associates one of the stack's registered Elastic IP addresses with a
     * specified instance. The address must first be registered with the stack
     * by calling <a>RegisterElasticIp</a>. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"
     * >Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param associateElasticIpRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSOpsWorksAsyncHandler.AssociateElasticIp
     */
    java.util.concurrent.Future<Void> associateElasticIpAsync(
            AssociateElasticIpRequest associateElasticIpRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateElasticIpRequest, Void> asyncHandler);

    /**
     * <p>
     * Attaches an Elastic Load Balancing load balancer to a specified layer.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/load-balancer-elb.html"
     * >Elastic Load Balancing</a>.
     * </p>
     * <note>
     * <p>
     * You must create the Elastic Load Balancing instance separately, by using
     * the Elastic Load Balancing console, API, or CLI. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/Welcome.html"
     * > Elastic Load Balancing Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param attachElasticLoadBalancerRequest
     * @sample AWSOpsWorksAsync.AttachElasticLoadBalancer
     */
    java.util.concurrent.Future<Void> attachElasticLoadBalancerAsync(
            AttachElasticLoadBalancerRequest attachElasticLoadBalancerRequest);

    /**
     * <p>
     * Attaches an Elastic Load Balancing load balancer to a specified layer.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/load-balancer-elb.html"
     * >Elastic Load Balancing</a>.
     * </p>
     * <note>
     * <p>
     * You must create the Elastic Load Balancing instance separately, by using
     * the Elastic Load Balancing console, API, or CLI. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/Welcome.html"
     * > Elastic Load Balancing Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param attachElasticLoadBalancerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSOpsWorksAsyncHandler.AttachElasticLoadBalancer
     */
    java.util.concurrent.Future<Void> attachElasticLoadBalancerAsync(
            AttachElasticLoadBalancerRequest attachElasticLoadBalancerRequest,
            com.amazonaws.handlers.AsyncHandler<AttachElasticLoadBalancerRequest, Void> asyncHandler);

    /**
     * <p>
     * Creates a clone of a specified stack. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-cloning.html"
     * >Clone a Stack</a>. By default, all parameters are set to the values used
     * by the parent stack.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an
     * attached policy that explicitly grants permissions. For more information
     * on user permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param cloneStackRequest
     * @return A Java Future containing the result of the CloneStack operation
     *         returned by the service.
     * @sample AWSOpsWorksAsync.CloneStack
     */
    java.util.concurrent.Future<CloneStackResult> cloneStackAsync(
            CloneStackRequest cloneStackRequest);

    /**
     * <p>
     * Creates a clone of a specified stack. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-cloning.html"
     * >Clone a Stack</a>. By default, all parameters are set to the values used
     * by the parent stack.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an
     * attached policy that explicitly grants permissions. For more information
     * on user permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param cloneStackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CloneStack operation
     *         returned by the service.
     * @sample AWSOpsWorksAsyncHandler.CloneStack
     */
    java.util.concurrent.Future<CloneStackResult> cloneStackAsync(
            CloneStackRequest cloneStackRequest,
            com.amazonaws.handlers.AsyncHandler<CloneStackRequest, CloneStackResult> asyncHandler);

    /**
     * <p>
     * Creates an app for a specified stack. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html"
     * >Creating Apps</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param createAppRequest
     * @return A Java Future containing the result of the CreateApp operation
     *         returned by the service.
     * @sample AWSOpsWorksAsync.CreateApp
     */
    java.util.concurrent.Future<CreateAppResult> createAppAsync(
            CreateAppRequest createAppRequest);

    /**
     * <p>
     * Creates an app for a specified stack. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html"
     * >Creating Apps</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param createAppRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateApp operation
     *         returned by the service.
     * @sample AWSOpsWorksAsyncHandler.CreateApp
     */
    java.util.concurrent.Future<CreateAppResult> createAppAsync(
            CreateAppRequest createAppRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAppRequest, CreateAppResult> asyncHandler);

    /**
     * <p>
     * Runs deployment or stack commands. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-deploying.html"
     * >Deploying Apps</a> and <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-commands.html"
     * >Run Stack Commands</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Deploy or Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param createDeploymentRequest
     * @return A Java Future containing the result of the CreateDeployment
     *         operation returned by the service.
     * @sample AWSOpsWorksAsync.CreateDeployment
     */
    java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(
            CreateDeploymentRequest createDeploymentRequest);

    /**
     * <p>
     * Runs deployment or stack commands. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-deploying.html"
     * >Deploying Apps</a> and <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-commands.html"
     * >Run Stack Commands</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Deploy or Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param createDeploymentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDeployment
     *         operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.CreateDeployment
     */
    java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(
            CreateDeploymentRequest createDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDeploymentRequest, CreateDeploymentResult> asyncHandler);

    /**
     * <p>
     * Creates an instance in a specified stack. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-add.html"
     * >Adding an Instance to a Layer</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param createInstanceRequest
     * @return A Java Future containing the result of the CreateInstance
     *         operation returned by the service.
     * @sample AWSOpsWorksAsync.CreateInstance
     */
    java.util.concurrent.Future<CreateInstanceResult> createInstanceAsync(
            CreateInstanceRequest createInstanceRequest);

    /**
     * <p>
     * Creates an instance in a specified stack. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-add.html"
     * >Adding an Instance to a Layer</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param createInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateInstance
     *         operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.CreateInstance
     */
    java.util.concurrent.Future<CreateInstanceResult> createInstanceAsync(
            CreateInstanceRequest createInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateInstanceRequest, CreateInstanceResult> asyncHandler);

    /**
     * <p>
     * Creates a layer. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-create.html"
     * >How to Create a Layer</a>.
     * </p>
     * <note>
     * <p>
     * You should use <b>CreateLayer</b> for noncustom layer types such as PHP
     * App Server only if the stack does not have an existing layer of that
     * type. A stack can have at most one instance of each noncustom layer; if
     * you attempt to create a second instance, <b>CreateLayer</b> fails. A
     * stack can have an arbitrary number of custom layers, so you can call
     * <b>CreateLayer</b> as many times as you like for that layer type.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param createLayerRequest
     * @return A Java Future containing the result of the CreateLayer operation
     *         returned by the service.
     * @sample AWSOpsWorksAsync.CreateLayer
     */
    java.util.concurrent.Future<CreateLayerResult> createLayerAsync(
            CreateLayerRequest createLayerRequest);

    /**
     * <p>
     * Creates a layer. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-create.html"
     * >How to Create a Layer</a>.
     * </p>
     * <note>
     * <p>
     * You should use <b>CreateLayer</b> for noncustom layer types such as PHP
     * App Server only if the stack does not have an existing layer of that
     * type. A stack can have at most one instance of each noncustom layer; if
     * you attempt to create a second instance, <b>CreateLayer</b> fails. A
     * stack can have an arbitrary number of custom layers, so you can call
     * <b>CreateLayer</b> as many times as you like for that layer type.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param createLayerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLayer operation
     *         returned by the service.
     * @sample AWSOpsWorksAsyncHandler.CreateLayer
     */
    java.util.concurrent.Future<CreateLayerResult> createLayerAsync(
            CreateLayerRequest createLayerRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLayerRequest, CreateLayerResult> asyncHandler);

    /**
     * <p>
     * Creates a new stack. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-edit.html"
     * >Create a New Stack</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an
     * attached policy that explicitly grants permissions. For more information
     * on user permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param createStackRequest
     * @return A Java Future containing the result of the CreateStack operation
     *         returned by the service.
     * @sample AWSOpsWorksAsync.CreateStack
     */
    java.util.concurrent.Future<CreateStackResult> createStackAsync(
            CreateStackRequest createStackRequest);

    /**
     * <p>
     * Creates a new stack. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-edit.html"
     * >Create a New Stack</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an
     * attached policy that explicitly grants permissions. For more information
     * on user permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param createStackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateStack operation
     *         returned by the service.
     * @sample AWSOpsWorksAsyncHandler.CreateStack
     */
    java.util.concurrent.Future<CreateStackResult> createStackAsync(
            CreateStackRequest createStackRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStackRequest, CreateStackResult> asyncHandler);

    /**
     * <p>
     * Creates a new user profile.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an
     * attached policy that explicitly grants permissions. For more information
     * on user permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param createUserProfileRequest
     * @return A Java Future containing the result of the CreateUserProfile
     *         operation returned by the service.
     * @sample AWSOpsWorksAsync.CreateUserProfile
     */
    java.util.concurrent.Future<CreateUserProfileResult> createUserProfileAsync(
            CreateUserProfileRequest createUserProfileRequest);

    /**
     * <p>
     * Creates a new user profile.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an
     * attached policy that explicitly grants permissions. For more information
     * on user permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param createUserProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateUserProfile
     *         operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.CreateUserProfile
     */
    java.util.concurrent.Future<CreateUserProfileResult> createUserProfileAsync(
            CreateUserProfileRequest createUserProfileRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUserProfileRequest, CreateUserProfileResult> asyncHandler);

    /**
     * <p>
     * Deletes a specified app.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param deleteAppRequest
     * @sample AWSOpsWorksAsync.DeleteApp
     */
    java.util.concurrent.Future<Void> deleteAppAsync(
            DeleteAppRequest deleteAppRequest);

    /**
     * <p>
     * Deletes a specified app.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param deleteAppRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSOpsWorksAsyncHandler.DeleteApp
     */
    java.util.concurrent.Future<Void> deleteAppAsync(
            DeleteAppRequest deleteAppRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAppRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes a specified instance, which terminates the associated Amazon EC2
     * instance. You must stop an instance before you can delete it.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-delete.html"
     * >Deleting Instances</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param deleteInstanceRequest
     * @sample AWSOpsWorksAsync.DeleteInstance
     */
    java.util.concurrent.Future<Void> deleteInstanceAsync(
            DeleteInstanceRequest deleteInstanceRequest);

    /**
     * <p>
     * Deletes a specified instance, which terminates the associated Amazon EC2
     * instance. You must stop an instance before you can delete it.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-delete.html"
     * >Deleting Instances</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param deleteInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSOpsWorksAsyncHandler.DeleteInstance
     */
    java.util.concurrent.Future<Void> deleteInstanceAsync(
            DeleteInstanceRequest deleteInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInstanceRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes a specified layer. You must first stop and then delete all
     * associated instances or unassign registered instances. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-delete.html"
     * >How to Delete a Layer</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param deleteLayerRequest
     * @sample AWSOpsWorksAsync.DeleteLayer
     */
    java.util.concurrent.Future<Void> deleteLayerAsync(
            DeleteLayerRequest deleteLayerRequest);

    /**
     * <p>
     * Deletes a specified layer. You must first stop and then delete all
     * associated instances or unassign registered instances. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-delete.html"
     * >How to Delete a Layer</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param deleteLayerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSOpsWorksAsyncHandler.DeleteLayer
     */
    java.util.concurrent.Future<Void> deleteLayerAsync(
            DeleteLayerRequest deleteLayerRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLayerRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes a specified stack. You must first delete all instances, layers,
     * and apps or deregister registered instances. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-shutting.html"
     * >Shut Down a Stack</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param deleteStackRequest
     * @sample AWSOpsWorksAsync.DeleteStack
     */
    java.util.concurrent.Future<Void> deleteStackAsync(
            DeleteStackRequest deleteStackRequest);

    /**
     * <p>
     * Deletes a specified stack. You must first delete all instances, layers,
     * and apps or deregister registered instances. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-shutting.html"
     * >Shut Down a Stack</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param deleteStackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSOpsWorksAsyncHandler.DeleteStack
     */
    java.util.concurrent.Future<Void> deleteStackAsync(
            DeleteStackRequest deleteStackRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteStackRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes a user profile.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an
     * attached policy that explicitly grants permissions. For more information
     * on user permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param deleteUserProfileRequest
     * @sample AWSOpsWorksAsync.DeleteUserProfile
     */
    java.util.concurrent.Future<Void> deleteUserProfileAsync(
            DeleteUserProfileRequest deleteUserProfileRequest);

    /**
     * <p>
     * Deletes a user profile.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an
     * attached policy that explicitly grants permissions. For more information
     * on user permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param deleteUserProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSOpsWorksAsyncHandler.DeleteUserProfile
     */
    java.util.concurrent.Future<Void> deleteUserProfileAsync(
            DeleteUserProfileRequest deleteUserProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUserProfileRequest, Void> asyncHandler);

    /**
     * <p>
     * Deregisters a specified Amazon ECS cluster from a stack. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-ecscluster.html#workinglayers-ecscluster-delete"
     * > Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * />.
     * </p>
     * 
     * @param deregisterEcsClusterRequest
     * @sample AWSOpsWorksAsync.DeregisterEcsCluster
     */
    java.util.concurrent.Future<Void> deregisterEcsClusterAsync(
            DeregisterEcsClusterRequest deregisterEcsClusterRequest);

    /**
     * <p>
     * Deregisters a specified Amazon ECS cluster from a stack. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-ecscluster.html#workinglayers-ecscluster-delete"
     * > Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * />.
     * </p>
     * 
     * @param deregisterEcsClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSOpsWorksAsyncHandler.DeregisterEcsCluster
     */
    java.util.concurrent.Future<Void> deregisterEcsClusterAsync(
            DeregisterEcsClusterRequest deregisterEcsClusterRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterEcsClusterRequest, Void> asyncHandler);

    /**
     * <p>
     * Deregisters a specified Elastic IP address. The address can then be
     * registered by another stack. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"
     * >Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param deregisterElasticIpRequest
     * @sample AWSOpsWorksAsync.DeregisterElasticIp
     */
    java.util.concurrent.Future<Void> deregisterElasticIpAsync(
            DeregisterElasticIpRequest deregisterElasticIpRequest);

    /**
     * <p>
     * Deregisters a specified Elastic IP address. The address can then be
     * registered by another stack. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"
     * >Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param deregisterElasticIpRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSOpsWorksAsyncHandler.DeregisterElasticIp
     */
    java.util.concurrent.Future<Void> deregisterElasticIpAsync(
            DeregisterElasticIpRequest deregisterElasticIpRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterElasticIpRequest, Void> asyncHandler);

    /**
     * <p>
     * Deregister a registered Amazon EC2 or on-premises instance. This action
     * removes the instance from the stack and returns it to your control. This
     * action can not be used with instances that were created with AWS
     * OpsWorks.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param deregisterInstanceRequest
     * @sample AWSOpsWorksAsync.DeregisterInstance
     */
    java.util.concurrent.Future<Void> deregisterInstanceAsync(
            DeregisterInstanceRequest deregisterInstanceRequest);

    /**
     * <p>
     * Deregister a registered Amazon EC2 or on-premises instance. This action
     * removes the instance from the stack and returns it to your control. This
     * action can not be used with instances that were created with AWS
     * OpsWorks.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param deregisterInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSOpsWorksAsyncHandler.DeregisterInstance
     */
    java.util.concurrent.Future<Void> deregisterInstanceAsync(
            DeregisterInstanceRequest deregisterInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterInstanceRequest, Void> asyncHandler);

    /**
     * <p>
     * Deregisters an Amazon RDS instance.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param deregisterRdsDbInstanceRequest
     * @sample AWSOpsWorksAsync.DeregisterRdsDbInstance
     */
    java.util.concurrent.Future<Void> deregisterRdsDbInstanceAsync(
            DeregisterRdsDbInstanceRequest deregisterRdsDbInstanceRequest);

    /**
     * <p>
     * Deregisters an Amazon RDS instance.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param deregisterRdsDbInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSOpsWorksAsyncHandler.DeregisterRdsDbInstance
     */
    java.util.concurrent.Future<Void> deregisterRdsDbInstanceAsync(
            DeregisterRdsDbInstanceRequest deregisterRdsDbInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterRdsDbInstanceRequest, Void> asyncHandler);

    /**
     * <p>
     * Deregisters an Amazon EBS volume. The volume can then be registered by
     * another stack. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"
     * >Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param deregisterVolumeRequest
     * @sample AWSOpsWorksAsync.DeregisterVolume
     */
    java.util.concurrent.Future<Void> deregisterVolumeAsync(
            DeregisterVolumeRequest deregisterVolumeRequest);

    /**
     * <p>
     * Deregisters an Amazon EBS volume. The volume can then be registered by
     * another stack. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"
     * >Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param deregisterVolumeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSOpsWorksAsyncHandler.DeregisterVolume
     */
    java.util.concurrent.Future<Void> deregisterVolumeAsync(
            DeregisterVolumeRequest deregisterVolumeRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterVolumeRequest, Void> asyncHandler);

    /**
     * <p>
     * Describes the available AWS OpsWorks agent versions. You must specify a
     * stack ID or a configuration manager. <code>DescribeAgentVersions</code>
     * returns a list of available agent versions for the specified stack or
     * configuration manager.
     * </p>
     * 
     * @param describeAgentVersionsRequest
     * @return A Java Future containing the result of the DescribeAgentVersions
     *         operation returned by the service.
     * @sample AWSOpsWorksAsync.DescribeAgentVersions
     */
    java.util.concurrent.Future<DescribeAgentVersionsResult> describeAgentVersionsAsync(
            DescribeAgentVersionsRequest describeAgentVersionsRequest);

    /**
     * <p>
     * Describes the available AWS OpsWorks agent versions. You must specify a
     * stack ID or a configuration manager. <code>DescribeAgentVersions</code>
     * returns a list of available agent versions for the specified stack or
     * configuration manager.
     * </p>
     * 
     * @param describeAgentVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAgentVersions
     *         operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribeAgentVersions
     */
    java.util.concurrent.Future<DescribeAgentVersionsResult> describeAgentVersionsAsync(
            DescribeAgentVersionsRequest describeAgentVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAgentVersionsRequest, DescribeAgentVersionsResult> asyncHandler);

    /**
     * <p>
     * Requests a description of a specified set of apps.
     * </p>
     * <note>
     * <p>
     * You must specify at least one of the parameters.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeAppsRequest
     * @return A Java Future containing the result of the DescribeApps operation
     *         returned by the service.
     * @sample AWSOpsWorksAsync.DescribeApps
     */
    java.util.concurrent.Future<DescribeAppsResult> describeAppsAsync(
            DescribeAppsRequest describeAppsRequest);

    /**
     * <p>
     * Requests a description of a specified set of apps.
     * </p>
     * <note>
     * <p>
     * You must specify at least one of the parameters.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeAppsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeApps operation
     *         returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribeApps
     */
    java.util.concurrent.Future<DescribeAppsResult> describeAppsAsync(
            DescribeAppsRequest describeAppsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAppsRequest, DescribeAppsResult> asyncHandler);

    /**
     * <p>
     * Describes the results of specified commands.
     * </p>
     * <note>
     * <p>
     * You must specify at least one of the parameters.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeCommandsRequest
     * @return A Java Future containing the result of the DescribeCommands
     *         operation returned by the service.
     * @sample AWSOpsWorksAsync.DescribeCommands
     */
    java.util.concurrent.Future<DescribeCommandsResult> describeCommandsAsync(
            DescribeCommandsRequest describeCommandsRequest);

    /**
     * <p>
     * Describes the results of specified commands.
     * </p>
     * <note>
     * <p>
     * You must specify at least one of the parameters.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeCommandsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCommands
     *         operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribeCommands
     */
    java.util.concurrent.Future<DescribeCommandsResult> describeCommandsAsync(
            DescribeCommandsRequest describeCommandsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCommandsRequest, DescribeCommandsResult> asyncHandler);

    /**
     * <p>
     * Requests a description of a specified set of deployments.
     * </p>
     * <note>
     * <p>
     * You must specify at least one of the parameters.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeDeploymentsRequest
     * @return A Java Future containing the result of the DescribeDeployments
     *         operation returned by the service.
     * @sample AWSOpsWorksAsync.DescribeDeployments
     */
    java.util.concurrent.Future<DescribeDeploymentsResult> describeDeploymentsAsync(
            DescribeDeploymentsRequest describeDeploymentsRequest);

    /**
     * <p>
     * Requests a description of a specified set of deployments.
     * </p>
     * <note>
     * <p>
     * You must specify at least one of the parameters.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeDeploymentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDeployments
     *         operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribeDeployments
     */
    java.util.concurrent.Future<DescribeDeploymentsResult> describeDeploymentsAsync(
            DescribeDeploymentsRequest describeDeploymentsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDeploymentsRequest, DescribeDeploymentsResult> asyncHandler);

    /**
     * <p>
     * Describes Amazon ECS clusters that are registered with a stack. If you
     * specify only a stack ID, you can use the <code>MaxResults</code> and
     * <code>NextToken</code> parameters to paginate the response. However, AWS
     * OpsWorks currently supports only one cluster per layer, so the result set
     * has a maximum of one element.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack or an attached
     * policy that explicitly grants permission. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeEcsClustersRequest
     * @return A Java Future containing the result of the DescribeEcsClusters
     *         operation returned by the service.
     * @sample AWSOpsWorksAsync.DescribeEcsClusters
     */
    java.util.concurrent.Future<DescribeEcsClustersResult> describeEcsClustersAsync(
            DescribeEcsClustersRequest describeEcsClustersRequest);

    /**
     * <p>
     * Describes Amazon ECS clusters that are registered with a stack. If you
     * specify only a stack ID, you can use the <code>MaxResults</code> and
     * <code>NextToken</code> parameters to paginate the response. However, AWS
     * OpsWorks currently supports only one cluster per layer, so the result set
     * has a maximum of one element.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack or an attached
     * policy that explicitly grants permission. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeEcsClustersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEcsClusters
     *         operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribeEcsClusters
     */
    java.util.concurrent.Future<DescribeEcsClustersResult> describeEcsClustersAsync(
            DescribeEcsClustersRequest describeEcsClustersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEcsClustersRequest, DescribeEcsClustersResult> asyncHandler);

    /**
     * <p>
     * Describes <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"
     * >Elastic IP addresses</a>.
     * </p>
     * <note>
     * <p>
     * You must specify at least one of the parameters.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeElasticIpsRequest
     * @return A Java Future containing the result of the DescribeElasticIps
     *         operation returned by the service.
     * @sample AWSOpsWorksAsync.DescribeElasticIps
     */
    java.util.concurrent.Future<DescribeElasticIpsResult> describeElasticIpsAsync(
            DescribeElasticIpsRequest describeElasticIpsRequest);

    /**
     * <p>
     * Describes <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"
     * >Elastic IP addresses</a>.
     * </p>
     * <note>
     * <p>
     * You must specify at least one of the parameters.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeElasticIpsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeElasticIps
     *         operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribeElasticIps
     */
    java.util.concurrent.Future<DescribeElasticIpsResult> describeElasticIpsAsync(
            DescribeElasticIpsRequest describeElasticIpsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeElasticIpsRequest, DescribeElasticIpsResult> asyncHandler);

    /**
     * <p>
     * Describes a stack's Elastic Load Balancing instances.
     * </p>
     * <note>
     * <p>
     * You must specify at least one of the parameters.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeElasticLoadBalancersRequest
     * @return A Java Future containing the result of the
     *         DescribeElasticLoadBalancers operation returned by the service.
     * @sample AWSOpsWorksAsync.DescribeElasticLoadBalancers
     */
    java.util.concurrent.Future<DescribeElasticLoadBalancersResult> describeElasticLoadBalancersAsync(
            DescribeElasticLoadBalancersRequest describeElasticLoadBalancersRequest);

    /**
     * <p>
     * Describes a stack's Elastic Load Balancing instances.
     * </p>
     * <note>
     * <p>
     * You must specify at least one of the parameters.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeElasticLoadBalancersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeElasticLoadBalancers operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribeElasticLoadBalancers
     */
    java.util.concurrent.Future<DescribeElasticLoadBalancersResult> describeElasticLoadBalancersAsync(
            DescribeElasticLoadBalancersRequest describeElasticLoadBalancersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeElasticLoadBalancersRequest, DescribeElasticLoadBalancersResult> asyncHandler);

    /**
     * <p>
     * Requests a description of a set of instances.
     * </p>
     * <note>
     * <p>
     * You must specify at least one of the parameters.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeInstancesRequest
     * @return A Java Future containing the result of the DescribeInstances
     *         operation returned by the service.
     * @sample AWSOpsWorksAsync.DescribeInstances
     */
    java.util.concurrent.Future<DescribeInstancesResult> describeInstancesAsync(
            DescribeInstancesRequest describeInstancesRequest);

    /**
     * <p>
     * Requests a description of a set of instances.
     * </p>
     * <note>
     * <p>
     * You must specify at least one of the parameters.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInstances
     *         operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribeInstances
     */
    java.util.concurrent.Future<DescribeInstancesResult> describeInstancesAsync(
            DescribeInstancesRequest describeInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInstancesRequest, DescribeInstancesResult> asyncHandler);

    /**
     * <p>
     * Requests a description of one or more layers in a specified stack.
     * </p>
     * <note>
     * <p>
     * You must specify at least one of the parameters.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeLayersRequest
     * @return A Java Future containing the result of the DescribeLayers
     *         operation returned by the service.
     * @sample AWSOpsWorksAsync.DescribeLayers
     */
    java.util.concurrent.Future<DescribeLayersResult> describeLayersAsync(
            DescribeLayersRequest describeLayersRequest);

    /**
     * <p>
     * Requests a description of one or more layers in a specified stack.
     * </p>
     * <note>
     * <p>
     * You must specify at least one of the parameters.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeLayersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLayers
     *         operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribeLayers
     */
    java.util.concurrent.Future<DescribeLayersResult> describeLayersAsync(
            DescribeLayersRequest describeLayersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLayersRequest, DescribeLayersResult> asyncHandler);

    /**
     * <p>
     * Describes load-based auto scaling configurations for specified layers.
     * </p>
     * <note>
     * <p>
     * You must specify at least one of the parameters.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeLoadBasedAutoScalingRequest
     * @return A Java Future containing the result of the
     *         DescribeLoadBasedAutoScaling operation returned by the service.
     * @sample AWSOpsWorksAsync.DescribeLoadBasedAutoScaling
     */
    java.util.concurrent.Future<DescribeLoadBasedAutoScalingResult> describeLoadBasedAutoScalingAsync(
            DescribeLoadBasedAutoScalingRequest describeLoadBasedAutoScalingRequest);

    /**
     * <p>
     * Describes load-based auto scaling configurations for specified layers.
     * </p>
     * <note>
     * <p>
     * You must specify at least one of the parameters.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeLoadBasedAutoScalingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeLoadBasedAutoScaling operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribeLoadBasedAutoScaling
     */
    java.util.concurrent.Future<DescribeLoadBasedAutoScalingResult> describeLoadBasedAutoScalingAsync(
            DescribeLoadBasedAutoScalingRequest describeLoadBasedAutoScalingRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLoadBasedAutoScalingRequest, DescribeLoadBasedAutoScalingResult> asyncHandler);

    /**
     * <p>
     * Describes a user's SSH information.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have
     * self-management enabled or an attached policy that explicitly grants
     * permissions. For more information on user permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeMyUserProfileRequest
     * @return A Java Future containing the result of the DescribeMyUserProfile
     *         operation returned by the service.
     * @sample AWSOpsWorksAsync.DescribeMyUserProfile
     */
    java.util.concurrent.Future<DescribeMyUserProfileResult> describeMyUserProfileAsync(
            DescribeMyUserProfileRequest describeMyUserProfileRequest);

    /**
     * <p>
     * Describes a user's SSH information.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have
     * self-management enabled or an attached policy that explicitly grants
     * permissions. For more information on user permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeMyUserProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMyUserProfile
     *         operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribeMyUserProfile
     */
    java.util.concurrent.Future<DescribeMyUserProfileResult> describeMyUserProfileAsync(
            DescribeMyUserProfileRequest describeMyUserProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMyUserProfileRequest, DescribeMyUserProfileResult> asyncHandler);

    /**
     * <p>
     * Describes the permissions for a specified stack.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describePermissionsRequest
     * @return A Java Future containing the result of the DescribePermissions
     *         operation returned by the service.
     * @sample AWSOpsWorksAsync.DescribePermissions
     */
    java.util.concurrent.Future<DescribePermissionsResult> describePermissionsAsync(
            DescribePermissionsRequest describePermissionsRequest);

    /**
     * <p>
     * Describes the permissions for a specified stack.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describePermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePermissions
     *         operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribePermissions
     */
    java.util.concurrent.Future<DescribePermissionsResult> describePermissionsAsync(
            DescribePermissionsRequest describePermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePermissionsRequest, DescribePermissionsResult> asyncHandler);

    /**
     * <p>
     * Describe an instance's RAID arrays.
     * </p>
     * <note>
     * <p>
     * You must specify at least one of the parameters.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeRaidArraysRequest
     * @return A Java Future containing the result of the DescribeRaidArrays
     *         operation returned by the service.
     * @sample AWSOpsWorksAsync.DescribeRaidArrays
     */
    java.util.concurrent.Future<DescribeRaidArraysResult> describeRaidArraysAsync(
            DescribeRaidArraysRequest describeRaidArraysRequest);

    /**
     * <p>
     * Describe an instance's RAID arrays.
     * </p>
     * <note>
     * <p>
     * You must specify at least one of the parameters.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeRaidArraysRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRaidArrays
     *         operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribeRaidArrays
     */
    java.util.concurrent.Future<DescribeRaidArraysResult> describeRaidArraysAsync(
            DescribeRaidArraysRequest describeRaidArraysRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRaidArraysRequest, DescribeRaidArraysResult> asyncHandler);

    /**
     * <p>
     * Describes Amazon RDS instances.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeRdsDbInstancesRequest
     * @return A Java Future containing the result of the DescribeRdsDbInstances
     *         operation returned by the service.
     * @sample AWSOpsWorksAsync.DescribeRdsDbInstances
     */
    java.util.concurrent.Future<DescribeRdsDbInstancesResult> describeRdsDbInstancesAsync(
            DescribeRdsDbInstancesRequest describeRdsDbInstancesRequest);

    /**
     * <p>
     * Describes Amazon RDS instances.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeRdsDbInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRdsDbInstances
     *         operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribeRdsDbInstances
     */
    java.util.concurrent.Future<DescribeRdsDbInstancesResult> describeRdsDbInstancesAsync(
            DescribeRdsDbInstancesRequest describeRdsDbInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRdsDbInstancesRequest, DescribeRdsDbInstancesResult> asyncHandler);

    /**
     * <p>
     * Describes AWS OpsWorks service errors.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeServiceErrorsRequest
     * @return A Java Future containing the result of the DescribeServiceErrors
     *         operation returned by the service.
     * @sample AWSOpsWorksAsync.DescribeServiceErrors
     */
    java.util.concurrent.Future<DescribeServiceErrorsResult> describeServiceErrorsAsync(
            DescribeServiceErrorsRequest describeServiceErrorsRequest);

    /**
     * <p>
     * Describes AWS OpsWorks service errors.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeServiceErrorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeServiceErrors
     *         operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribeServiceErrors
     */
    java.util.concurrent.Future<DescribeServiceErrorsResult> describeServiceErrorsAsync(
            DescribeServiceErrorsRequest describeServiceErrorsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeServiceErrorsRequest, DescribeServiceErrorsResult> asyncHandler);

    /**
     * <p>
     * Requests a description of a stack's provisioning parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeStackProvisioningParametersRequest
     * @return A Java Future containing the result of the
     *         DescribeStackProvisioningParameters operation returned by the
     *         service.
     * @sample AWSOpsWorksAsync.DescribeStackProvisioningParameters
     */
    java.util.concurrent.Future<DescribeStackProvisioningParametersResult> describeStackProvisioningParametersAsync(
            DescribeStackProvisioningParametersRequest describeStackProvisioningParametersRequest);

    /**
     * <p>
     * Requests a description of a stack's provisioning parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeStackProvisioningParametersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeStackProvisioningParameters operation returned by the
     *         service.
     * @sample AWSOpsWorksAsyncHandler.DescribeStackProvisioningParameters
     */
    java.util.concurrent.Future<DescribeStackProvisioningParametersResult> describeStackProvisioningParametersAsync(
            DescribeStackProvisioningParametersRequest describeStackProvisioningParametersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStackProvisioningParametersRequest, DescribeStackProvisioningParametersResult> asyncHandler);

    /**
     * <p>
     * Describes the number of layers and apps in a specified stack, and the
     * number of instances in each state, such as <code>running_setup</code> or
     * <code>online</code>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeStackSummaryRequest
     * @return A Java Future containing the result of the DescribeStackSummary
     *         operation returned by the service.
     * @sample AWSOpsWorksAsync.DescribeStackSummary
     */
    java.util.concurrent.Future<DescribeStackSummaryResult> describeStackSummaryAsync(
            DescribeStackSummaryRequest describeStackSummaryRequest);

    /**
     * <p>
     * Describes the number of layers and apps in a specified stack, and the
     * number of instances in each state, such as <code>running_setup</code> or
     * <code>online</code>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeStackSummaryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStackSummary
     *         operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribeStackSummary
     */
    java.util.concurrent.Future<DescribeStackSummaryResult> describeStackSummaryAsync(
            DescribeStackSummaryRequest describeStackSummaryRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStackSummaryRequest, DescribeStackSummaryResult> asyncHandler);

    /**
     * <p>
     * Requests a description of one or more stacks.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeStacksRequest
     * @return A Java Future containing the result of the DescribeStacks
     *         operation returned by the service.
     * @sample AWSOpsWorksAsync.DescribeStacks
     */
    java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync(
            DescribeStacksRequest describeStacksRequest);

    /**
     * <p>
     * Requests a description of one or more stacks.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeStacksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStacks
     *         operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribeStacks
     */
    java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync(
            DescribeStacksRequest describeStacksRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStacksRequest, DescribeStacksResult> asyncHandler);

    /**
     * <p>
     * Describes time-based auto scaling configurations for specified instances.
     * </p>
     * <note>
     * <p>
     * You must specify at least one of the parameters.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeTimeBasedAutoScalingRequest
     * @return A Java Future containing the result of the
     *         DescribeTimeBasedAutoScaling operation returned by the service.
     * @sample AWSOpsWorksAsync.DescribeTimeBasedAutoScaling
     */
    java.util.concurrent.Future<DescribeTimeBasedAutoScalingResult> describeTimeBasedAutoScalingAsync(
            DescribeTimeBasedAutoScalingRequest describeTimeBasedAutoScalingRequest);

    /**
     * <p>
     * Describes time-based auto scaling configurations for specified instances.
     * </p>
     * <note>
     * <p>
     * You must specify at least one of the parameters.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeTimeBasedAutoScalingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeTimeBasedAutoScaling operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribeTimeBasedAutoScaling
     */
    java.util.concurrent.Future<DescribeTimeBasedAutoScalingResult> describeTimeBasedAutoScalingAsync(
            DescribeTimeBasedAutoScalingRequest describeTimeBasedAutoScalingRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTimeBasedAutoScalingRequest, DescribeTimeBasedAutoScalingResult> asyncHandler);

    /**
     * <p>
     * Describe specified users.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an
     * attached policy that explicitly grants permissions. For more information
     * on user permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeUserProfilesRequest
     * @return A Java Future containing the result of the DescribeUserProfiles
     *         operation returned by the service.
     * @sample AWSOpsWorksAsync.DescribeUserProfiles
     */
    java.util.concurrent.Future<DescribeUserProfilesResult> describeUserProfilesAsync(
            DescribeUserProfilesRequest describeUserProfilesRequest);

    /**
     * <p>
     * Describe specified users.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an
     * attached policy that explicitly grants permissions. For more information
     * on user permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeUserProfilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeUserProfiles
     *         operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribeUserProfiles
     */
    java.util.concurrent.Future<DescribeUserProfilesResult> describeUserProfilesAsync(
            DescribeUserProfilesRequest describeUserProfilesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeUserProfilesRequest, DescribeUserProfilesResult> asyncHandler);

    /**
     * <p>
     * Describes an instance's Amazon EBS volumes.
     * </p>
     * <note>
     * <p>
     * You must specify at least one of the parameters.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeVolumesRequest
     * @return A Java Future containing the result of the DescribeVolumes
     *         operation returned by the service.
     * @sample AWSOpsWorksAsync.DescribeVolumes
     */
    java.util.concurrent.Future<DescribeVolumesResult> describeVolumesAsync(
            DescribeVolumesRequest describeVolumesRequest);

    /**
     * <p>
     * Describes an instance's Amazon EBS volumes.
     * </p>
     * <note>
     * <p>
     * You must specify at least one of the parameters.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Show, Deploy, or Manage permissions level for the stack, or an attached
     * policy that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param describeVolumesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVolumes
     *         operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribeVolumes
     */
    java.util.concurrent.Future<DescribeVolumesResult> describeVolumesAsync(
            DescribeVolumesRequest describeVolumesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVolumesRequest, DescribeVolumesResult> asyncHandler);

    /**
     * <p>
     * Detaches a specified Elastic Load Balancing instance from its layer.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param detachElasticLoadBalancerRequest
     * @sample AWSOpsWorksAsync.DetachElasticLoadBalancer
     */
    java.util.concurrent.Future<Void> detachElasticLoadBalancerAsync(
            DetachElasticLoadBalancerRequest detachElasticLoadBalancerRequest);

    /**
     * <p>
     * Detaches a specified Elastic Load Balancing instance from its layer.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param detachElasticLoadBalancerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSOpsWorksAsyncHandler.DetachElasticLoadBalancer
     */
    java.util.concurrent.Future<Void> detachElasticLoadBalancerAsync(
            DetachElasticLoadBalancerRequest detachElasticLoadBalancerRequest,
            com.amazonaws.handlers.AsyncHandler<DetachElasticLoadBalancerRequest, Void> asyncHandler);

    /**
     * <p>
     * Disassociates an Elastic IP address from its instance. The address
     * remains registered with the stack. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"
     * >Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param disassociateElasticIpRequest
     * @sample AWSOpsWorksAsync.DisassociateElasticIp
     */
    java.util.concurrent.Future<Void> disassociateElasticIpAsync(
            DisassociateElasticIpRequest disassociateElasticIpRequest);

    /**
     * <p>
     * Disassociates an Elastic IP address from its instance. The address
     * remains registered with the stack. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"
     * >Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param disassociateElasticIpRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSOpsWorksAsyncHandler.DisassociateElasticIp
     */
    java.util.concurrent.Future<Void> disassociateElasticIpAsync(
            DisassociateElasticIpRequest disassociateElasticIpRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateElasticIpRequest, Void> asyncHandler);

    /**
     * <p>
     * Gets a generated host name for the specified layer, based on the current
     * host name theme.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param getHostnameSuggestionRequest
     * @return A Java Future containing the result of the GetHostnameSuggestion
     *         operation returned by the service.
     * @sample AWSOpsWorksAsync.GetHostnameSuggestion
     */
    java.util.concurrent.Future<GetHostnameSuggestionResult> getHostnameSuggestionAsync(
            GetHostnameSuggestionRequest getHostnameSuggestionRequest);

    /**
     * <p>
     * Gets a generated host name for the specified layer, based on the current
     * host name theme.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param getHostnameSuggestionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetHostnameSuggestion
     *         operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.GetHostnameSuggestion
     */
    java.util.concurrent.Future<GetHostnameSuggestionResult> getHostnameSuggestionAsync(
            GetHostnameSuggestionRequest getHostnameSuggestionRequest,
            com.amazonaws.handlers.AsyncHandler<GetHostnameSuggestionRequest, GetHostnameSuggestionResult> asyncHandler);

    /**
     * <note>This action can be used only with Windows stacks.</note>
     * <p>
     * Grants RDP access to a Windows instance for a specified time period.
     * </p>
     * 
     * @param grantAccessRequest
     * @return A Java Future containing the result of the GrantAccess operation
     *         returned by the service.
     * @sample AWSOpsWorksAsync.GrantAccess
     */
    java.util.concurrent.Future<GrantAccessResult> grantAccessAsync(
            GrantAccessRequest grantAccessRequest);

    /**
     * <note>This action can be used only with Windows stacks.</note>
     * <p>
     * Grants RDP access to a Windows instance for a specified time period.
     * </p>
     * 
     * @param grantAccessRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GrantAccess operation
     *         returned by the service.
     * @sample AWSOpsWorksAsyncHandler.GrantAccess
     */
    java.util.concurrent.Future<GrantAccessResult> grantAccessAsync(
            GrantAccessRequest grantAccessRequest,
            com.amazonaws.handlers.AsyncHandler<GrantAccessRequest, GrantAccessResult> asyncHandler);

    /**
     * <p>
     * Reboots a specified instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-starting.html"
     * >Starting, Stopping, and Rebooting Instances</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param rebootInstanceRequest
     * @sample AWSOpsWorksAsync.RebootInstance
     */
    java.util.concurrent.Future<Void> rebootInstanceAsync(
            RebootInstanceRequest rebootInstanceRequest);

    /**
     * <p>
     * Reboots a specified instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-starting.html"
     * >Starting, Stopping, and Rebooting Instances</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param rebootInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSOpsWorksAsyncHandler.RebootInstance
     */
    java.util.concurrent.Future<Void> rebootInstanceAsync(
            RebootInstanceRequest rebootInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<RebootInstanceRequest, Void> asyncHandler);

    /**
     * <p>
     * Registers a specified Amazon ECS cluster with a stack. You can register
     * only one cluster with a stack. A cluster can be registered with only one
     * stack. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-ecscluster.html"
     * > Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * > Managing User Permissions</a>.
     * </p>
     * 
     * @param registerEcsClusterRequest
     * @return A Java Future containing the result of the RegisterEcsCluster
     *         operation returned by the service.
     * @sample AWSOpsWorksAsync.RegisterEcsCluster
     */
    java.util.concurrent.Future<RegisterEcsClusterResult> registerEcsClusterAsync(
            RegisterEcsClusterRequest registerEcsClusterRequest);

    /**
     * <p>
     * Registers a specified Amazon ECS cluster with a stack. You can register
     * only one cluster with a stack. A cluster can be registered with only one
     * stack. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-ecscluster.html"
     * > Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * > Managing User Permissions</a>.
     * </p>
     * 
     * @param registerEcsClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterEcsCluster
     *         operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.RegisterEcsCluster
     */
    java.util.concurrent.Future<RegisterEcsClusterResult> registerEcsClusterAsync(
            RegisterEcsClusterRequest registerEcsClusterRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterEcsClusterRequest, RegisterEcsClusterResult> asyncHandler);

    /**
     * <p>
     * Registers an Elastic IP address with a specified stack. An address can be
     * registered with only one stack at a time. If the address is already
     * registered, you must first deregister it by calling
     * <a>DeregisterElasticIp</a>. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"
     * >Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param registerElasticIpRequest
     * @return A Java Future containing the result of the RegisterElasticIp
     *         operation returned by the service.
     * @sample AWSOpsWorksAsync.RegisterElasticIp
     */
    java.util.concurrent.Future<RegisterElasticIpResult> registerElasticIpAsync(
            RegisterElasticIpRequest registerElasticIpRequest);

    /**
     * <p>
     * Registers an Elastic IP address with a specified stack. An address can be
     * registered with only one stack at a time. If the address is already
     * registered, you must first deregister it by calling
     * <a>DeregisterElasticIp</a>. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"
     * >Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param registerElasticIpRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterElasticIp
     *         operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.RegisterElasticIp
     */
    java.util.concurrent.Future<RegisterElasticIpResult> registerElasticIpAsync(
            RegisterElasticIpRequest registerElasticIpRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterElasticIpRequest, RegisterElasticIpResult> asyncHandler);

    /**
     * <p>
     * Registers instances with a specified stack that were created outside of
     * AWS OpsWorks.
     * </p>
     * <note>We do not recommend using this action to register instances. The
     * complete registration operation has two primary steps, installing the AWS
     * OpsWorks agent on the instance and registering the instance with the
     * stack. <code>RegisterInstance</code> handles only the second step. You
     * should instead use the AWS CLI <code>register</code> command, which
     * performs the entire registration operation. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/registered-instances-register.html"
     * > Registering an Instance with an AWS OpsWorks Stack</a>.</note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param registerInstanceRequest
     * @return A Java Future containing the result of the RegisterInstance
     *         operation returned by the service.
     * @sample AWSOpsWorksAsync.RegisterInstance
     */
    java.util.concurrent.Future<RegisterInstanceResult> registerInstanceAsync(
            RegisterInstanceRequest registerInstanceRequest);

    /**
     * <p>
     * Registers instances with a specified stack that were created outside of
     * AWS OpsWorks.
     * </p>
     * <note>We do not recommend using this action to register instances. The
     * complete registration operation has two primary steps, installing the AWS
     * OpsWorks agent on the instance and registering the instance with the
     * stack. <code>RegisterInstance</code> handles only the second step. You
     * should instead use the AWS CLI <code>register</code> command, which
     * performs the entire registration operation. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/registered-instances-register.html"
     * > Registering an Instance with an AWS OpsWorks Stack</a>.</note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param registerInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterInstance
     *         operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.RegisterInstance
     */
    java.util.concurrent.Future<RegisterInstanceResult> registerInstanceAsync(
            RegisterInstanceRequest registerInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterInstanceRequest, RegisterInstanceResult> asyncHandler);

    /**
     * <p>
     * Registers an Amazon RDS instance with a stack.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param registerRdsDbInstanceRequest
     * @sample AWSOpsWorksAsync.RegisterRdsDbInstance
     */
    java.util.concurrent.Future<Void> registerRdsDbInstanceAsync(
            RegisterRdsDbInstanceRequest registerRdsDbInstanceRequest);

    /**
     * <p>
     * Registers an Amazon RDS instance with a stack.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param registerRdsDbInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSOpsWorksAsyncHandler.RegisterRdsDbInstance
     */
    java.util.concurrent.Future<Void> registerRdsDbInstanceAsync(
            RegisterRdsDbInstanceRequest registerRdsDbInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterRdsDbInstanceRequest, Void> asyncHandler);

    /**
     * <p>
     * Registers an Amazon EBS volume with a specified stack. A volume can be
     * registered with only one stack at a time. If the volume is already
     * registered, you must first deregister it by calling
     * <a>DeregisterVolume</a>. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"
     * >Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param registerVolumeRequest
     * @return A Java Future containing the result of the RegisterVolume
     *         operation returned by the service.
     * @sample AWSOpsWorksAsync.RegisterVolume
     */
    java.util.concurrent.Future<RegisterVolumeResult> registerVolumeAsync(
            RegisterVolumeRequest registerVolumeRequest);

    /**
     * <p>
     * Registers an Amazon EBS volume with a specified stack. A volume can be
     * registered with only one stack at a time. If the volume is already
     * registered, you must first deregister it by calling
     * <a>DeregisterVolume</a>. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"
     * >Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param registerVolumeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterVolume
     *         operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.RegisterVolume
     */
    java.util.concurrent.Future<RegisterVolumeResult> registerVolumeAsync(
            RegisterVolumeRequest registerVolumeRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterVolumeRequest, RegisterVolumeResult> asyncHandler);

    /**
     * <p>
     * Specify the load-based auto scaling configuration for a specified layer.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-autoscaling.html"
     * >Managing Load with Time-based and Load-based Instances</a>.
     * </p>
     * <note>
     * <p>
     * To use load-based auto scaling, you must create a set of load-based auto
     * scaling instances. Load-based auto scaling operates only on the instances
     * from that set, so you must ensure that you have created enough instances
     * to handle the maximum anticipated load.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param setLoadBasedAutoScalingRequest
     * @sample AWSOpsWorksAsync.SetLoadBasedAutoScaling
     */
    java.util.concurrent.Future<Void> setLoadBasedAutoScalingAsync(
            SetLoadBasedAutoScalingRequest setLoadBasedAutoScalingRequest);

    /**
     * <p>
     * Specify the load-based auto scaling configuration for a specified layer.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-autoscaling.html"
     * >Managing Load with Time-based and Load-based Instances</a>.
     * </p>
     * <note>
     * <p>
     * To use load-based auto scaling, you must create a set of load-based auto
     * scaling instances. Load-based auto scaling operates only on the instances
     * from that set, so you must ensure that you have created enough instances
     * to handle the maximum anticipated load.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param setLoadBasedAutoScalingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSOpsWorksAsyncHandler.SetLoadBasedAutoScaling
     */
    java.util.concurrent.Future<Void> setLoadBasedAutoScalingAsync(
            SetLoadBasedAutoScalingRequest setLoadBasedAutoScalingRequest,
            com.amazonaws.handlers.AsyncHandler<SetLoadBasedAutoScalingRequest, Void> asyncHandler);

    /**
     * <p>
     * Specifies a user's permissions. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workingsecurity.html"
     * >Security and Permissions</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param setPermissionRequest
     * @sample AWSOpsWorksAsync.SetPermission
     */
    java.util.concurrent.Future<Void> setPermissionAsync(
            SetPermissionRequest setPermissionRequest);

    /**
     * <p>
     * Specifies a user's permissions. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workingsecurity.html"
     * >Security and Permissions</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param setPermissionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSOpsWorksAsyncHandler.SetPermission
     */
    java.util.concurrent.Future<Void> setPermissionAsync(
            SetPermissionRequest setPermissionRequest,
            com.amazonaws.handlers.AsyncHandler<SetPermissionRequest, Void> asyncHandler);

    /**
     * <p>
     * Specify the time-based auto scaling configuration for a specified
     * instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-autoscaling.html"
     * >Managing Load with Time-based and Load-based Instances</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param setTimeBasedAutoScalingRequest
     * @sample AWSOpsWorksAsync.SetTimeBasedAutoScaling
     */
    java.util.concurrent.Future<Void> setTimeBasedAutoScalingAsync(
            SetTimeBasedAutoScalingRequest setTimeBasedAutoScalingRequest);

    /**
     * <p>
     * Specify the time-based auto scaling configuration for a specified
     * instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-autoscaling.html"
     * >Managing Load with Time-based and Load-based Instances</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param setTimeBasedAutoScalingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSOpsWorksAsyncHandler.SetTimeBasedAutoScaling
     */
    java.util.concurrent.Future<Void> setTimeBasedAutoScalingAsync(
            SetTimeBasedAutoScalingRequest setTimeBasedAutoScalingRequest,
            com.amazonaws.handlers.AsyncHandler<SetTimeBasedAutoScalingRequest, Void> asyncHandler);

    /**
     * <p>
     * Starts a specified instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-starting.html"
     * >Starting, Stopping, and Rebooting Instances</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param startInstanceRequest
     * @sample AWSOpsWorksAsync.StartInstance
     */
    java.util.concurrent.Future<Void> startInstanceAsync(
            StartInstanceRequest startInstanceRequest);

    /**
     * <p>
     * Starts a specified instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-starting.html"
     * >Starting, Stopping, and Rebooting Instances</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param startInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSOpsWorksAsyncHandler.StartInstance
     */
    java.util.concurrent.Future<Void> startInstanceAsync(
            StartInstanceRequest startInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<StartInstanceRequest, Void> asyncHandler);

    /**
     * <p>
     * Starts a stack's instances.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param startStackRequest
     * @sample AWSOpsWorksAsync.StartStack
     */
    java.util.concurrent.Future<Void> startStackAsync(
            StartStackRequest startStackRequest);

    /**
     * <p>
     * Starts a stack's instances.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param startStackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSOpsWorksAsyncHandler.StartStack
     */
    java.util.concurrent.Future<Void> startStackAsync(
            StartStackRequest startStackRequest,
            com.amazonaws.handlers.AsyncHandler<StartStackRequest, Void> asyncHandler);

    /**
     * <p>
     * Stops a specified instance. When you stop a standard instance, the data
     * disappears and must be reinstalled when you restart the instance. You can
     * stop an Amazon EBS-backed instance without losing data. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-starting.html"
     * >Starting, Stopping, and Rebooting Instances</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param stopInstanceRequest
     * @sample AWSOpsWorksAsync.StopInstance
     */
    java.util.concurrent.Future<Void> stopInstanceAsync(
            StopInstanceRequest stopInstanceRequest);

    /**
     * <p>
     * Stops a specified instance. When you stop a standard instance, the data
     * disappears and must be reinstalled when you restart the instance. You can
     * stop an Amazon EBS-backed instance without losing data. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-starting.html"
     * >Starting, Stopping, and Rebooting Instances</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param stopInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSOpsWorksAsyncHandler.StopInstance
     */
    java.util.concurrent.Future<Void> stopInstanceAsync(
            StopInstanceRequest stopInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<StopInstanceRequest, Void> asyncHandler);

    /**
     * <p>
     * Stops a specified stack.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param stopStackRequest
     * @sample AWSOpsWorksAsync.StopStack
     */
    java.util.concurrent.Future<Void> stopStackAsync(
            StopStackRequest stopStackRequest);

    /**
     * <p>
     * Stops a specified stack.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param stopStackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSOpsWorksAsyncHandler.StopStack
     */
    java.util.concurrent.Future<Void> stopStackAsync(
            StopStackRequest stopStackRequest,
            com.amazonaws.handlers.AsyncHandler<StopStackRequest, Void> asyncHandler);

    /**
     * <p>
     * Unassigns a registered instance from all of it's layers. The instance
     * remains in the stack as an unassigned instance and can be assigned to
     * another layer, as needed. You cannot use this action with instances that
     * were created with AWS OpsWorks.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param unassignInstanceRequest
     * @sample AWSOpsWorksAsync.UnassignInstance
     */
    java.util.concurrent.Future<Void> unassignInstanceAsync(
            UnassignInstanceRequest unassignInstanceRequest);

    /**
     * <p>
     * Unassigns a registered instance from all of it's layers. The instance
     * remains in the stack as an unassigned instance and can be assigned to
     * another layer, as needed. You cannot use this action with instances that
     * were created with AWS OpsWorks.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param unassignInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSOpsWorksAsyncHandler.UnassignInstance
     */
    java.util.concurrent.Future<Void> unassignInstanceAsync(
            UnassignInstanceRequest unassignInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<UnassignInstanceRequest, Void> asyncHandler);

    /**
     * <p>
     * Unassigns an assigned Amazon EBS volume. The volume remains registered
     * with the stack. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"
     * >Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param unassignVolumeRequest
     * @sample AWSOpsWorksAsync.UnassignVolume
     */
    java.util.concurrent.Future<Void> unassignVolumeAsync(
            UnassignVolumeRequest unassignVolumeRequest);

    /**
     * <p>
     * Unassigns an assigned Amazon EBS volume. The volume remains registered
     * with the stack. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"
     * >Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param unassignVolumeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSOpsWorksAsyncHandler.UnassignVolume
     */
    java.util.concurrent.Future<Void> unassignVolumeAsync(
            UnassignVolumeRequest unassignVolumeRequest,
            com.amazonaws.handlers.AsyncHandler<UnassignVolumeRequest, Void> asyncHandler);

    /**
     * <p>
     * Updates a specified app.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Deploy or Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param updateAppRequest
     * @sample AWSOpsWorksAsync.UpdateApp
     */
    java.util.concurrent.Future<Void> updateAppAsync(
            UpdateAppRequest updateAppRequest);

    /**
     * <p>
     * Updates a specified app.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Deploy or Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param updateAppRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSOpsWorksAsyncHandler.UpdateApp
     */
    java.util.concurrent.Future<Void> updateAppAsync(
            UpdateAppRequest updateAppRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAppRequest, Void> asyncHandler);

    /**
     * <p>
     * Updates a registered Elastic IP address's name. For more information, see
     * <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"
     * >Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param updateElasticIpRequest
     * @sample AWSOpsWorksAsync.UpdateElasticIp
     */
    java.util.concurrent.Future<Void> updateElasticIpAsync(
            UpdateElasticIpRequest updateElasticIpRequest);

    /**
     * <p>
     * Updates a registered Elastic IP address's name. For more information, see
     * <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"
     * >Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param updateElasticIpRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSOpsWorksAsyncHandler.UpdateElasticIp
     */
    java.util.concurrent.Future<Void> updateElasticIpAsync(
            UpdateElasticIpRequest updateElasticIpRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateElasticIpRequest, Void> asyncHandler);

    /**
     * <p>
     * Updates a specified instance.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param updateInstanceRequest
     * @sample AWSOpsWorksAsync.UpdateInstance
     */
    java.util.concurrent.Future<Void> updateInstanceAsync(
            UpdateInstanceRequest updateInstanceRequest);

    /**
     * <p>
     * Updates a specified instance.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param updateInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSOpsWorksAsyncHandler.UpdateInstance
     */
    java.util.concurrent.Future<Void> updateInstanceAsync(
            UpdateInstanceRequest updateInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateInstanceRequest, Void> asyncHandler);

    /**
     * <p>
     * Updates a specified layer.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param updateLayerRequest
     * @sample AWSOpsWorksAsync.UpdateLayer
     */
    java.util.concurrent.Future<Void> updateLayerAsync(
            UpdateLayerRequest updateLayerRequest);

    /**
     * <p>
     * Updates a specified layer.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param updateLayerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSOpsWorksAsyncHandler.UpdateLayer
     */
    java.util.concurrent.Future<Void> updateLayerAsync(
            UpdateLayerRequest updateLayerRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateLayerRequest, Void> asyncHandler);

    /**
     * <p>
     * Updates a user's SSH public key.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have
     * self-management enabled or an attached policy that explicitly grants
     * permissions. For more information on user permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param updateMyUserProfileRequest
     * @sample AWSOpsWorksAsync.UpdateMyUserProfile
     */
    java.util.concurrent.Future<Void> updateMyUserProfileAsync(
            UpdateMyUserProfileRequest updateMyUserProfileRequest);

    /**
     * <p>
     * Updates a user's SSH public key.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have
     * self-management enabled or an attached policy that explicitly grants
     * permissions. For more information on user permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param updateMyUserProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSOpsWorksAsyncHandler.UpdateMyUserProfile
     */
    java.util.concurrent.Future<Void> updateMyUserProfileAsync(
            UpdateMyUserProfileRequest updateMyUserProfileRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMyUserProfileRequest, Void> asyncHandler);

    /**
     * <p>
     * Updates an Amazon RDS instance.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param updateRdsDbInstanceRequest
     * @sample AWSOpsWorksAsync.UpdateRdsDbInstance
     */
    java.util.concurrent.Future<Void> updateRdsDbInstanceAsync(
            UpdateRdsDbInstanceRequest updateRdsDbInstanceRequest);

    /**
     * <p>
     * Updates an Amazon RDS instance.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param updateRdsDbInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSOpsWorksAsyncHandler.UpdateRdsDbInstance
     */
    java.util.concurrent.Future<Void> updateRdsDbInstanceAsync(
            UpdateRdsDbInstanceRequest updateRdsDbInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRdsDbInstanceRequest, Void> asyncHandler);

    /**
     * <p>
     * Updates a specified stack.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param updateStackRequest
     * @sample AWSOpsWorksAsync.UpdateStack
     */
    java.util.concurrent.Future<Void> updateStackAsync(
            UpdateStackRequest updateStackRequest);

    /**
     * <p>
     * Updates a specified stack.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param updateStackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSOpsWorksAsyncHandler.UpdateStack
     */
    java.util.concurrent.Future<Void> updateStackAsync(
            UpdateStackRequest updateStackRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateStackRequest, Void> asyncHandler);

    /**
     * <p>
     * Updates a specified user profile.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an
     * attached policy that explicitly grants permissions. For more information
     * on user permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param updateUserProfileRequest
     * @sample AWSOpsWorksAsync.UpdateUserProfile
     */
    java.util.concurrent.Future<Void> updateUserProfileAsync(
            UpdateUserProfileRequest updateUserProfileRequest);

    /**
     * <p>
     * Updates a specified user profile.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an
     * attached policy that explicitly grants permissions. For more information
     * on user permissions, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param updateUserProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSOpsWorksAsyncHandler.UpdateUserProfile
     */
    java.util.concurrent.Future<Void> updateUserProfileAsync(
            UpdateUserProfileRequest updateUserProfileRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateUserProfileRequest, Void> asyncHandler);

    /**
     * <p>
     * Updates an Amazon EBS volume's name or mount point. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"
     * >Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param updateVolumeRequest
     * @sample AWSOpsWorksAsync.UpdateVolume
     */
    java.util.concurrent.Future<Void> updateVolumeAsync(
            UpdateVolumeRequest updateVolumeRequest);

    /**
     * <p>
     * Updates an Amazon EBS volume's name or mount point. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"
     * >Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a
     * Manage permissions level for the stack, or an attached policy that
     * explicitly grants permissions. For more information on user permissions,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param updateVolumeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSOpsWorksAsyncHandler.UpdateVolume
     */
    java.util.concurrent.Future<Void> updateVolumeAsync(
            UpdateVolumeRequest updateVolumeRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateVolumeRequest, Void> asyncHandler);

}
