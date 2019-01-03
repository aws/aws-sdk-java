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
package com.amazonaws.services.opsworks;

import javax.annotation.Generated;

import com.amazonaws.services.opsworks.model.*;

/**
 * Interface for accessing AWS OpsWorks asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.opsworks.AbstractAWSOpsWorksAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS OpsWorks</fullname>
 * <p>
 * Welcome to the <i>AWS OpsWorks Stacks API Reference</i>. This guide provides descriptions, syntax, and usage examples
 * for AWS OpsWorks Stacks actions and data types, including common parameters and error codes.
 * </p>
 * <p>
 * AWS OpsWorks Stacks is an application management service that provides an integrated experience for overseeing the
 * complete application lifecycle. For information about this product, go to the <a
 * href="http://aws.amazon.com/opsworks/">AWS OpsWorks</a> details page.
 * </p>
 * <p>
 * <b>SDKs and CLI</b>
 * </p>
 * <p>
 * The most common way to use the AWS OpsWorks Stacks API is by using the AWS Command Line Interface (CLI) or by using
 * one of the AWS SDKs to implement applications in your preferred language. For more information, see:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/cli/latest/userguide/cli-chap-welcome.html">AWS CLI</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a
 * href="http://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/opsworks/AWSOpsWorksClient.html">
 * AWS SDK for Java</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/sdkfornet/latest/apidocs/html/N_Amazon_OpsWorks.htm">AWS SDK for .NET</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/aws-sdk-php-2/latest/class-Aws.OpsWorks.OpsWorksClient.html">AWS SDK for PHP
 * 2</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/sdkforruby/api/">AWS SDK for Ruby</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://aws.amazon.com/documentation/sdkforjavascript/">AWS SDK for Node.js</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.pythonboto.org/en/latest/ref/opsworks.html">AWS SDK for Python(Boto)</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * AWS OpsWorks Stacks supports the following endpoints, all HTTPS. You must connect to one of the following endpoints.
 * Stacks can only be accessed or managed within the endpoint in which they are created.
 * </p>
 * <ul>
 * <li>
 * <p>
 * opsworks.us-east-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.us-east-2.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.us-west-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.us-west-2.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.ca-central-1.amazonaws.com (API only; not available in the AWS console)
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.eu-west-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.eu-west-2.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.eu-west-3.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.eu-central-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.ap-northeast-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.ap-northeast-2.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.ap-south-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.ap-southeast-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.ap-southeast-2.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * opsworks.sa-east-1.amazonaws.com
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Chef Versions</b>
 * </p>
 * <p>
 * When you call <a>CreateStack</a>, <a>CloneStack</a>, or <a>UpdateStack</a> we recommend you use the
 * <code>ConfigurationManager</code> parameter to specify the Chef version. The recommended and default value for Linux
 * stacks is currently 12. Windows stacks use Chef 12.2. For more information, see <a
 * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-chef11.html">Chef Versions</a>.
 * </p>
 * <note>
 * <p>
 * You can specify Chef 12, 11.10, or 11.4 for your Linux stack. We recommend migrating your existing Linux stacks to
 * Chef 12 as soon as possible.
 * </p>
 * </note>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSOpsWorksAsync extends AWSOpsWorks {

    /**
     * <p>
     * Assign a registered instance to a layer.
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can assign registered on-premises instances to any layer type.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can assign registered Amazon EC2 instances only to custom layers.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot use this action with instances that were created with AWS OpsWorks Stacks.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Required Permissions</b>: To use this action, an AWS Identity and Access Management (IAM) user must have a
     * Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more
     * information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param assignInstanceRequest
     * @return A Java Future containing the result of the AssignInstance operation returned by the service.
     * @sample AWSOpsWorksAsync.AssignInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/AssignInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssignInstanceResult> assignInstanceAsync(AssignInstanceRequest assignInstanceRequest);

    /**
     * <p>
     * Assign a registered instance to a layer.
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can assign registered on-premises instances to any layer type.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can assign registered Amazon EC2 instances only to custom layers.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot use this action with instances that were created with AWS OpsWorks Stacks.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Required Permissions</b>: To use this action, an AWS Identity and Access Management (IAM) user must have a
     * Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more
     * information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param assignInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssignInstance operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.AssignInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/AssignInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssignInstanceResult> assignInstanceAsync(AssignInstanceRequest assignInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<AssignInstanceRequest, AssignInstanceResult> asyncHandler);

    /**
     * <p>
     * Assigns one of the stack's registered Amazon EBS volumes to a specified instance. The volume must first be
     * registered with the stack by calling <a>RegisterVolume</a>. After you register the volume, you must call
     * <a>UpdateVolume</a> to specify a mount point before calling <code>AssignVolume</code>. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param assignVolumeRequest
     * @return A Java Future containing the result of the AssignVolume operation returned by the service.
     * @sample AWSOpsWorksAsync.AssignVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/AssignVolume" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssignVolumeResult> assignVolumeAsync(AssignVolumeRequest assignVolumeRequest);

    /**
     * <p>
     * Assigns one of the stack's registered Amazon EBS volumes to a specified instance. The volume must first be
     * registered with the stack by calling <a>RegisterVolume</a>. After you register the volume, you must call
     * <a>UpdateVolume</a> to specify a mount point before calling <code>AssignVolume</code>. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param assignVolumeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssignVolume operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.AssignVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/AssignVolume" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssignVolumeResult> assignVolumeAsync(AssignVolumeRequest assignVolumeRequest,
            com.amazonaws.handlers.AsyncHandler<AssignVolumeRequest, AssignVolumeResult> asyncHandler);

    /**
     * <p>
     * Associates one of the stack's registered Elastic IP addresses with a specified instance. The address must first
     * be registered with the stack by calling <a>RegisterElasticIp</a>. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param associateElasticIpRequest
     * @return A Java Future containing the result of the AssociateElasticIp operation returned by the service.
     * @sample AWSOpsWorksAsync.AssociateElasticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/AssociateElasticIp" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssociateElasticIpResult> associateElasticIpAsync(AssociateElasticIpRequest associateElasticIpRequest);

    /**
     * <p>
     * Associates one of the stack's registered Elastic IP addresses with a specified instance. The address must first
     * be registered with the stack by calling <a>RegisterElasticIp</a>. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param associateElasticIpRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateElasticIp operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.AssociateElasticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/AssociateElasticIp" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssociateElasticIpResult> associateElasticIpAsync(AssociateElasticIpRequest associateElasticIpRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateElasticIpRequest, AssociateElasticIpResult> asyncHandler);

    /**
     * <p>
     * Attaches an Elastic Load Balancing load balancer to a specified layer. AWS OpsWorks Stacks does not support
     * Application Load Balancer. You can only use Classic Load Balancer with AWS OpsWorks Stacks. For more information,
     * see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/layers-elb.html">Elastic Load Balancing</a>.
     * </p>
     * <note>
     * <p>
     * You must create the Elastic Load Balancing instance separately, by using the Elastic Load Balancing console, API,
     * or CLI. For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/Welcome.html"> Elastic Load Balancing
     * Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param attachElasticLoadBalancerRequest
     * @return A Java Future containing the result of the AttachElasticLoadBalancer operation returned by the service.
     * @sample AWSOpsWorksAsync.AttachElasticLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/AttachElasticLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AttachElasticLoadBalancerResult> attachElasticLoadBalancerAsync(
            AttachElasticLoadBalancerRequest attachElasticLoadBalancerRequest);

    /**
     * <p>
     * Attaches an Elastic Load Balancing load balancer to a specified layer. AWS OpsWorks Stacks does not support
     * Application Load Balancer. You can only use Classic Load Balancer with AWS OpsWorks Stacks. For more information,
     * see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/layers-elb.html">Elastic Load Balancing</a>.
     * </p>
     * <note>
     * <p>
     * You must create the Elastic Load Balancing instance separately, by using the Elastic Load Balancing console, API,
     * or CLI. For more information, see <a
     * href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/Welcome.html"> Elastic Load Balancing
     * Developer Guide</a>.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param attachElasticLoadBalancerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AttachElasticLoadBalancer operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.AttachElasticLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/AttachElasticLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AttachElasticLoadBalancerResult> attachElasticLoadBalancerAsync(
            AttachElasticLoadBalancerRequest attachElasticLoadBalancerRequest,
            com.amazonaws.handlers.AsyncHandler<AttachElasticLoadBalancerRequest, AttachElasticLoadBalancerResult> asyncHandler);

    /**
     * <p>
     * Creates a clone of a specified stack. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-cloning.html">Clone a Stack</a>. By
     * default, all parameters are set to the values used by the parent stack.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an attached policy that explicitly grants
     * permissions. For more information about user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param cloneStackRequest
     * @return A Java Future containing the result of the CloneStack operation returned by the service.
     * @sample AWSOpsWorksAsync.CloneStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/CloneStack" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CloneStackResult> cloneStackAsync(CloneStackRequest cloneStackRequest);

    /**
     * <p>
     * Creates a clone of a specified stack. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-cloning.html">Clone a Stack</a>. By
     * default, all parameters are set to the values used by the parent stack.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an attached policy that explicitly grants
     * permissions. For more information about user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param cloneStackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CloneStack operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.CloneStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/CloneStack" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CloneStackResult> cloneStackAsync(CloneStackRequest cloneStackRequest,
            com.amazonaws.handlers.AsyncHandler<CloneStackRequest, CloneStackResult> asyncHandler);

    /**
     * <p>
     * Creates an app for a specified stack. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html">Creating Apps</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param createAppRequest
     * @return A Java Future containing the result of the CreateApp operation returned by the service.
     * @sample AWSOpsWorksAsync.CreateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/CreateApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAppResult> createAppAsync(CreateAppRequest createAppRequest);

    /**
     * <p>
     * Creates an app for a specified stack. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html">Creating Apps</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param createAppRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateApp operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.CreateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/CreateApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAppResult> createAppAsync(CreateAppRequest createAppRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAppRequest, CreateAppResult> asyncHandler);

    /**
     * <p>
     * Runs deployment or stack commands. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-deploying.html">Deploying Apps</a> and <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-commands.html">Run Stack Commands</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Deploy or Manage permissions level for
     * the stack, or an attached policy that explicitly grants permissions. For more information on user permissions,
     * see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param createDeploymentRequest
     * @return A Java Future containing the result of the CreateDeployment operation returned by the service.
     * @sample AWSOpsWorksAsync.CreateDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/CreateDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest createDeploymentRequest);

    /**
     * <p>
     * Runs deployment or stack commands. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-deploying.html">Deploying Apps</a> and <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-commands.html">Run Stack Commands</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Deploy or Manage permissions level for
     * the stack, or an attached policy that explicitly grants permissions. For more information on user permissions,
     * see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param createDeploymentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDeployment operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.CreateDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/CreateDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDeploymentResult> createDeploymentAsync(CreateDeploymentRequest createDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDeploymentRequest, CreateDeploymentResult> asyncHandler);

    /**
     * <p>
     * Creates an instance in a specified stack. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-add.html">Adding an Instance to a
     * Layer</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param createInstanceRequest
     * @return A Java Future containing the result of the CreateInstance operation returned by the service.
     * @sample AWSOpsWorksAsync.CreateInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/CreateInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateInstanceResult> createInstanceAsync(CreateInstanceRequest createInstanceRequest);

    /**
     * <p>
     * Creates an instance in a specified stack. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-add.html">Adding an Instance to a
     * Layer</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param createInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateInstance operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.CreateInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/CreateInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateInstanceResult> createInstanceAsync(CreateInstanceRequest createInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateInstanceRequest, CreateInstanceResult> asyncHandler);

    /**
     * <p>
     * Creates a layer. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-create.html">How to Create a
     * Layer</a>.
     * </p>
     * <note>
     * <p>
     * You should use <b>CreateLayer</b> for noncustom layer types such as PHP App Server only if the stack does not
     * have an existing layer of that type. A stack can have at most one instance of each noncustom layer; if you
     * attempt to create a second instance, <b>CreateLayer</b> fails. A stack can have an arbitrary number of custom
     * layers, so you can call <b>CreateLayer</b> as many times as you like for that layer type.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param createLayerRequest
     * @return A Java Future containing the result of the CreateLayer operation returned by the service.
     * @sample AWSOpsWorksAsync.CreateLayer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/CreateLayer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLayerResult> createLayerAsync(CreateLayerRequest createLayerRequest);

    /**
     * <p>
     * Creates a layer. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-create.html">How to Create a
     * Layer</a>.
     * </p>
     * <note>
     * <p>
     * You should use <b>CreateLayer</b> for noncustom layer types such as PHP App Server only if the stack does not
     * have an existing layer of that type. A stack can have at most one instance of each noncustom layer; if you
     * attempt to create a second instance, <b>CreateLayer</b> fails. A stack can have an arbitrary number of custom
     * layers, so you can call <b>CreateLayer</b> as many times as you like for that layer type.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param createLayerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLayer operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.CreateLayer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/CreateLayer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLayerResult> createLayerAsync(CreateLayerRequest createLayerRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLayerRequest, CreateLayerResult> asyncHandler);

    /**
     * <p>
     * Creates a new stack. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-edit.html">Create a New Stack</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an attached policy that explicitly grants
     * permissions. For more information about user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param createStackRequest
     * @return A Java Future containing the result of the CreateStack operation returned by the service.
     * @sample AWSOpsWorksAsync.CreateStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/CreateStack" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateStackResult> createStackAsync(CreateStackRequest createStackRequest);

    /**
     * <p>
     * Creates a new stack. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-edit.html">Create a New Stack</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an attached policy that explicitly grants
     * permissions. For more information about user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param createStackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateStack operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.CreateStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/CreateStack" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateStackResult> createStackAsync(CreateStackRequest createStackRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStackRequest, CreateStackResult> asyncHandler);

    /**
     * <p>
     * Creates a new user profile.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an attached policy that explicitly grants
     * permissions. For more information about user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param createUserProfileRequest
     * @return A Java Future containing the result of the CreateUserProfile operation returned by the service.
     * @sample AWSOpsWorksAsync.CreateUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/CreateUserProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateUserProfileResult> createUserProfileAsync(CreateUserProfileRequest createUserProfileRequest);

    /**
     * <p>
     * Creates a new user profile.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an attached policy that explicitly grants
     * permissions. For more information about user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param createUserProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateUserProfile operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.CreateUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/CreateUserProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateUserProfileResult> createUserProfileAsync(CreateUserProfileRequest createUserProfileRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUserProfileRequest, CreateUserProfileResult> asyncHandler);

    /**
     * <p>
     * Deletes a specified app.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param deleteAppRequest
     * @return A Java Future containing the result of the DeleteApp operation returned by the service.
     * @sample AWSOpsWorksAsync.DeleteApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DeleteApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppResult> deleteAppAsync(DeleteAppRequest deleteAppRequest);

    /**
     * <p>
     * Deletes a specified app.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param deleteAppRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApp operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DeleteApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DeleteApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppResult> deleteAppAsync(DeleteAppRequest deleteAppRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAppRequest, DeleteAppResult> asyncHandler);

    /**
     * <p>
     * Deletes a specified instance, which terminates the associated Amazon EC2 instance. You must stop an instance
     * before you can delete it.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-delete.html">Deleting Instances</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param deleteInstanceRequest
     * @return A Java Future containing the result of the DeleteInstance operation returned by the service.
     * @sample AWSOpsWorksAsync.DeleteInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DeleteInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteInstanceResult> deleteInstanceAsync(DeleteInstanceRequest deleteInstanceRequest);

    /**
     * <p>
     * Deletes a specified instance, which terminates the associated Amazon EC2 instance. You must stop an instance
     * before you can delete it.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-delete.html">Deleting Instances</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param deleteInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteInstance operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DeleteInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DeleteInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteInstanceResult> deleteInstanceAsync(DeleteInstanceRequest deleteInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInstanceRequest, DeleteInstanceResult> asyncHandler);

    /**
     * <p>
     * Deletes a specified layer. You must first stop and then delete all associated instances or unassign registered
     * instances. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-delete.html">How to Delete a
     * Layer</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param deleteLayerRequest
     * @return A Java Future containing the result of the DeleteLayer operation returned by the service.
     * @sample AWSOpsWorksAsync.DeleteLayer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DeleteLayer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLayerResult> deleteLayerAsync(DeleteLayerRequest deleteLayerRequest);

    /**
     * <p>
     * Deletes a specified layer. You must first stop and then delete all associated instances or unassign registered
     * instances. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-delete.html">How to Delete a
     * Layer</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param deleteLayerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLayer operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DeleteLayer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DeleteLayer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLayerResult> deleteLayerAsync(DeleteLayerRequest deleteLayerRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLayerRequest, DeleteLayerResult> asyncHandler);

    /**
     * <p>
     * Deletes a specified stack. You must first delete all instances, layers, and apps or deregister registered
     * instances. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-shutting.html">Shut Down a Stack</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param deleteStackRequest
     * @return A Java Future containing the result of the DeleteStack operation returned by the service.
     * @sample AWSOpsWorksAsync.DeleteStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DeleteStack" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteStackResult> deleteStackAsync(DeleteStackRequest deleteStackRequest);

    /**
     * <p>
     * Deletes a specified stack. You must first delete all instances, layers, and apps or deregister registered
     * instances. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-shutting.html">Shut Down a Stack</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param deleteStackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteStack operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DeleteStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DeleteStack" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteStackResult> deleteStackAsync(DeleteStackRequest deleteStackRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteStackRequest, DeleteStackResult> asyncHandler);

    /**
     * <p>
     * Deletes a user profile.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an attached policy that explicitly grants
     * permissions. For more information about user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param deleteUserProfileRequest
     * @return A Java Future containing the result of the DeleteUserProfile operation returned by the service.
     * @sample AWSOpsWorksAsync.DeleteUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DeleteUserProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserProfileResult> deleteUserProfileAsync(DeleteUserProfileRequest deleteUserProfileRequest);

    /**
     * <p>
     * Deletes a user profile.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an attached policy that explicitly grants
     * permissions. For more information about user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param deleteUserProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteUserProfile operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DeleteUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DeleteUserProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteUserProfileResult> deleteUserProfileAsync(DeleteUserProfileRequest deleteUserProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUserProfileRequest, DeleteUserProfileResult> asyncHandler);

    /**
     * <p>
     * Deregisters a specified Amazon ECS cluster from a stack. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-ecscluster.html#workinglayers-ecscluster-delete"
     * > Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html</a>.
     * </p>
     * 
     * @param deregisterEcsClusterRequest
     * @return A Java Future containing the result of the DeregisterEcsCluster operation returned by the service.
     * @sample AWSOpsWorksAsync.DeregisterEcsCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DeregisterEcsCluster" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterEcsClusterResult> deregisterEcsClusterAsync(DeregisterEcsClusterRequest deregisterEcsClusterRequest);

    /**
     * <p>
     * Deregisters a specified Amazon ECS cluster from a stack. For more information, see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-ecscluster.html#workinglayers-ecscluster-delete"
     * > Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html</a>.
     * </p>
     * 
     * @param deregisterEcsClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterEcsCluster operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DeregisterEcsCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DeregisterEcsCluster" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterEcsClusterResult> deregisterEcsClusterAsync(DeregisterEcsClusterRequest deregisterEcsClusterRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterEcsClusterRequest, DeregisterEcsClusterResult> asyncHandler);

    /**
     * <p>
     * Deregisters a specified Elastic IP address. The address can then be registered by another stack. For more
     * information, see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">Resource
     * Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param deregisterElasticIpRequest
     * @return A Java Future containing the result of the DeregisterElasticIp operation returned by the service.
     * @sample AWSOpsWorksAsync.DeregisterElasticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DeregisterElasticIp" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterElasticIpResult> deregisterElasticIpAsync(DeregisterElasticIpRequest deregisterElasticIpRequest);

    /**
     * <p>
     * Deregisters a specified Elastic IP address. The address can then be registered by another stack. For more
     * information, see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">Resource
     * Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param deregisterElasticIpRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterElasticIp operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DeregisterElasticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DeregisterElasticIp" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterElasticIpResult> deregisterElasticIpAsync(DeregisterElasticIpRequest deregisterElasticIpRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterElasticIpRequest, DeregisterElasticIpResult> asyncHandler);

    /**
     * <p>
     * Deregister a registered Amazon EC2 or on-premises instance. This action removes the instance from the stack and
     * returns it to your control. This action cannot be used with instances that were created with AWS OpsWorks Stacks.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param deregisterInstanceRequest
     * @return A Java Future containing the result of the DeregisterInstance operation returned by the service.
     * @sample AWSOpsWorksAsync.DeregisterInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DeregisterInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterInstanceResult> deregisterInstanceAsync(DeregisterInstanceRequest deregisterInstanceRequest);

    /**
     * <p>
     * Deregister a registered Amazon EC2 or on-premises instance. This action removes the instance from the stack and
     * returns it to your control. This action cannot be used with instances that were created with AWS OpsWorks Stacks.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param deregisterInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterInstance operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DeregisterInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DeregisterInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterInstanceResult> deregisterInstanceAsync(DeregisterInstanceRequest deregisterInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterInstanceRequest, DeregisterInstanceResult> asyncHandler);

    /**
     * <p>
     * Deregisters an Amazon RDS instance.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param deregisterRdsDbInstanceRequest
     * @return A Java Future containing the result of the DeregisterRdsDbInstance operation returned by the service.
     * @sample AWSOpsWorksAsync.DeregisterRdsDbInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DeregisterRdsDbInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterRdsDbInstanceResult> deregisterRdsDbInstanceAsync(DeregisterRdsDbInstanceRequest deregisterRdsDbInstanceRequest);

    /**
     * <p>
     * Deregisters an Amazon RDS instance.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param deregisterRdsDbInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterRdsDbInstance operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DeregisterRdsDbInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DeregisterRdsDbInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterRdsDbInstanceResult> deregisterRdsDbInstanceAsync(DeregisterRdsDbInstanceRequest deregisterRdsDbInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterRdsDbInstanceRequest, DeregisterRdsDbInstanceResult> asyncHandler);

    /**
     * <p>
     * Deregisters an Amazon EBS volume. The volume can then be registered by another stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param deregisterVolumeRequest
     * @return A Java Future containing the result of the DeregisterVolume operation returned by the service.
     * @sample AWSOpsWorksAsync.DeregisterVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DeregisterVolume" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeregisterVolumeResult> deregisterVolumeAsync(DeregisterVolumeRequest deregisterVolumeRequest);

    /**
     * <p>
     * Deregisters an Amazon EBS volume. The volume can then be registered by another stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param deregisterVolumeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterVolume operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DeregisterVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DeregisterVolume" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeregisterVolumeResult> deregisterVolumeAsync(DeregisterVolumeRequest deregisterVolumeRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterVolumeRequest, DeregisterVolumeResult> asyncHandler);

    /**
     * <p>
     * Describes the available AWS OpsWorks Stacks agent versions. You must specify a stack ID or a configuration
     * manager. <code>DescribeAgentVersions</code> returns a list of available agent versions for the specified stack or
     * configuration manager.
     * </p>
     * 
     * @param describeAgentVersionsRequest
     * @return A Java Future containing the result of the DescribeAgentVersions operation returned by the service.
     * @sample AWSOpsWorksAsync.DescribeAgentVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeAgentVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAgentVersionsResult> describeAgentVersionsAsync(DescribeAgentVersionsRequest describeAgentVersionsRequest);

    /**
     * <p>
     * Describes the available AWS OpsWorks Stacks agent versions. You must specify a stack ID or a configuration
     * manager. <code>DescribeAgentVersions</code> returns a list of available agent versions for the specified stack or
     * configuration manager.
     * </p>
     * 
     * @param describeAgentVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAgentVersions operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribeAgentVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeAgentVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAgentVersionsResult> describeAgentVersionsAsync(DescribeAgentVersionsRequest describeAgentVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAgentVersionsRequest, DescribeAgentVersionsResult> asyncHandler);

    /**
     * <p>
     * Requests a description of a specified set of apps.
     * </p>
     * <note>
     * <p>
     * This call accepts only one resource-identifying parameter.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeAppsRequest
     * @return A Java Future containing the result of the DescribeApps operation returned by the service.
     * @sample AWSOpsWorksAsync.DescribeApps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeApps" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAppsResult> describeAppsAsync(DescribeAppsRequest describeAppsRequest);

    /**
     * <p>
     * Requests a description of a specified set of apps.
     * </p>
     * <note>
     * <p>
     * This call accepts only one resource-identifying parameter.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeAppsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeApps operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribeApps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeApps" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAppsResult> describeAppsAsync(DescribeAppsRequest describeAppsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAppsRequest, DescribeAppsResult> asyncHandler);

    /**
     * <p>
     * Describes the results of specified commands.
     * </p>
     * <note>
     * <p>
     * This call accepts only one resource-identifying parameter.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeCommandsRequest
     * @return A Java Future containing the result of the DescribeCommands operation returned by the service.
     * @sample AWSOpsWorksAsync.DescribeCommands
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeCommands" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeCommandsResult> describeCommandsAsync(DescribeCommandsRequest describeCommandsRequest);

    /**
     * <p>
     * Describes the results of specified commands.
     * </p>
     * <note>
     * <p>
     * This call accepts only one resource-identifying parameter.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeCommandsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCommands operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribeCommands
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeCommands" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeCommandsResult> describeCommandsAsync(DescribeCommandsRequest describeCommandsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCommandsRequest, DescribeCommandsResult> asyncHandler);

    /**
     * <p>
     * Requests a description of a specified set of deployments.
     * </p>
     * <note>
     * <p>
     * This call accepts only one resource-identifying parameter.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeDeploymentsRequest
     * @return A Java Future containing the result of the DescribeDeployments operation returned by the service.
     * @sample AWSOpsWorksAsync.DescribeDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeDeployments" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDeploymentsResult> describeDeploymentsAsync(DescribeDeploymentsRequest describeDeploymentsRequest);

    /**
     * <p>
     * Requests a description of a specified set of deployments.
     * </p>
     * <note>
     * <p>
     * This call accepts only one resource-identifying parameter.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeDeploymentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDeployments operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribeDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeDeployments" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDeploymentsResult> describeDeploymentsAsync(DescribeDeploymentsRequest describeDeploymentsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDeploymentsRequest, DescribeDeploymentsResult> asyncHandler);

    /**
     * <p>
     * Describes Amazon ECS clusters that are registered with a stack. If you specify only a stack ID, you can use the
     * <code>MaxResults</code> and <code>NextToken</code> parameters to paginate the response. However, AWS OpsWorks
     * Stacks currently supports only one cluster per layer, so the result set has a maximum of one element.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack or an attached policy that explicitly grants permission. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * <p>
     * This call accepts only one resource-identifying parameter.
     * </p>
     * 
     * @param describeEcsClustersRequest
     * @return A Java Future containing the result of the DescribeEcsClusters operation returned by the service.
     * @sample AWSOpsWorksAsync.DescribeEcsClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeEcsClusters" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEcsClustersResult> describeEcsClustersAsync(DescribeEcsClustersRequest describeEcsClustersRequest);

    /**
     * <p>
     * Describes Amazon ECS clusters that are registered with a stack. If you specify only a stack ID, you can use the
     * <code>MaxResults</code> and <code>NextToken</code> parameters to paginate the response. However, AWS OpsWorks
     * Stacks currently supports only one cluster per layer, so the result set has a maximum of one element.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack or an attached policy that explicitly grants permission. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * <p>
     * This call accepts only one resource-identifying parameter.
     * </p>
     * 
     * @param describeEcsClustersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEcsClusters operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribeEcsClusters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeEcsClusters" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEcsClustersResult> describeEcsClustersAsync(DescribeEcsClustersRequest describeEcsClustersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEcsClustersRequest, DescribeEcsClustersResult> asyncHandler);

    /**
     * <p>
     * Describes <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic IP
     * addresses</a>.
     * </p>
     * <note>
     * <p>
     * This call accepts only one resource-identifying parameter.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeElasticIpsRequest
     * @return A Java Future containing the result of the DescribeElasticIps operation returned by the service.
     * @sample AWSOpsWorksAsync.DescribeElasticIps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeElasticIps" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeElasticIpsResult> describeElasticIpsAsync(DescribeElasticIpsRequest describeElasticIpsRequest);

    /**
     * <p>
     * Describes <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic IP
     * addresses</a>.
     * </p>
     * <note>
     * <p>
     * This call accepts only one resource-identifying parameter.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeElasticIpsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeElasticIps operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribeElasticIps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeElasticIps" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeElasticIpsResult> describeElasticIpsAsync(DescribeElasticIpsRequest describeElasticIpsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeElasticIpsRequest, DescribeElasticIpsResult> asyncHandler);

    /**
     * <p>
     * Describes a stack's Elastic Load Balancing instances.
     * </p>
     * <note>
     * <p>
     * This call accepts only one resource-identifying parameter.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeElasticLoadBalancersRequest
     * @return A Java Future containing the result of the DescribeElasticLoadBalancers operation returned by the
     *         service.
     * @sample AWSOpsWorksAsync.DescribeElasticLoadBalancers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeElasticLoadBalancers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeElasticLoadBalancersResult> describeElasticLoadBalancersAsync(
            DescribeElasticLoadBalancersRequest describeElasticLoadBalancersRequest);

    /**
     * <p>
     * Describes a stack's Elastic Load Balancing instances.
     * </p>
     * <note>
     * <p>
     * This call accepts only one resource-identifying parameter.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeElasticLoadBalancersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeElasticLoadBalancers operation returned by the
     *         service.
     * @sample AWSOpsWorksAsyncHandler.DescribeElasticLoadBalancers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeElasticLoadBalancers"
     *      target="_top">AWS API Documentation</a>
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
     * This call accepts only one resource-identifying parameter.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeInstancesRequest
     * @return A Java Future containing the result of the DescribeInstances operation returned by the service.
     * @sample AWSOpsWorksAsync.DescribeInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstancesResult> describeInstancesAsync(DescribeInstancesRequest describeInstancesRequest);

    /**
     * <p>
     * Requests a description of a set of instances.
     * </p>
     * <note>
     * <p>
     * This call accepts only one resource-identifying parameter.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInstances operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribeInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstancesResult> describeInstancesAsync(DescribeInstancesRequest describeInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInstancesRequest, DescribeInstancesResult> asyncHandler);

    /**
     * <p>
     * Requests a description of one or more layers in a specified stack.
     * </p>
     * <note>
     * <p>
     * This call accepts only one resource-identifying parameter.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeLayersRequest
     * @return A Java Future containing the result of the DescribeLayers operation returned by the service.
     * @sample AWSOpsWorksAsync.DescribeLayers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeLayers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeLayersResult> describeLayersAsync(DescribeLayersRequest describeLayersRequest);

    /**
     * <p>
     * Requests a description of one or more layers in a specified stack.
     * </p>
     * <note>
     * <p>
     * This call accepts only one resource-identifying parameter.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeLayersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLayers operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribeLayers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeLayers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeLayersResult> describeLayersAsync(DescribeLayersRequest describeLayersRequest,
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
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeLoadBasedAutoScalingRequest
     * @return A Java Future containing the result of the DescribeLoadBasedAutoScaling operation returned by the
     *         service.
     * @sample AWSOpsWorksAsync.DescribeLoadBasedAutoScaling
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeLoadBasedAutoScaling"
     *      target="_top">AWS API Documentation</a>
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
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeLoadBasedAutoScalingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLoadBasedAutoScaling operation returned by the
     *         service.
     * @sample AWSOpsWorksAsyncHandler.DescribeLoadBasedAutoScaling
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeLoadBasedAutoScaling"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLoadBasedAutoScalingResult> describeLoadBasedAutoScalingAsync(
            DescribeLoadBasedAutoScalingRequest describeLoadBasedAutoScalingRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLoadBasedAutoScalingRequest, DescribeLoadBasedAutoScalingResult> asyncHandler);

    /**
     * <p>
     * Describes a user's SSH information.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have self-management enabled or an attached
     * policy that explicitly grants permissions. For more information about user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeMyUserProfileRequest
     * @return A Java Future containing the result of the DescribeMyUserProfile operation returned by the service.
     * @sample AWSOpsWorksAsync.DescribeMyUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeMyUserProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMyUserProfileResult> describeMyUserProfileAsync(DescribeMyUserProfileRequest describeMyUserProfileRequest);

    /**
     * <p>
     * Describes a user's SSH information.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have self-management enabled or an attached
     * policy that explicitly grants permissions. For more information about user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeMyUserProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMyUserProfile operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribeMyUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeMyUserProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMyUserProfileResult> describeMyUserProfileAsync(DescribeMyUserProfileRequest describeMyUserProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMyUserProfileRequest, DescribeMyUserProfileResult> asyncHandler);

    /**
     * <p>
     * Describes the operating systems that are supported by AWS OpsWorks Stacks.
     * </p>
     * 
     * @param describeOperatingSystemsRequest
     * @return A Java Future containing the result of the DescribeOperatingSystems operation returned by the service.
     * @sample AWSOpsWorksAsync.DescribeOperatingSystems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeOperatingSystems"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOperatingSystemsResult> describeOperatingSystemsAsync(DescribeOperatingSystemsRequest describeOperatingSystemsRequest);

    /**
     * <p>
     * Describes the operating systems that are supported by AWS OpsWorks Stacks.
     * </p>
     * 
     * @param describeOperatingSystemsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeOperatingSystems operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribeOperatingSystems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeOperatingSystems"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOperatingSystemsResult> describeOperatingSystemsAsync(DescribeOperatingSystemsRequest describeOperatingSystemsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeOperatingSystemsRequest, DescribeOperatingSystemsResult> asyncHandler);

    /**
     * <p>
     * Describes the permissions for a specified stack.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describePermissionsRequest
     * @return A Java Future containing the result of the DescribePermissions operation returned by the service.
     * @sample AWSOpsWorksAsync.DescribePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribePermissions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribePermissionsResult> describePermissionsAsync(DescribePermissionsRequest describePermissionsRequest);

    /**
     * <p>
     * Describes the permissions for a specified stack.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describePermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePermissions operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribePermissions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribePermissionsResult> describePermissionsAsync(DescribePermissionsRequest describePermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePermissionsRequest, DescribePermissionsResult> asyncHandler);

    /**
     * <p>
     * Describe an instance's RAID arrays.
     * </p>
     * <note>
     * <p>
     * This call accepts only one resource-identifying parameter.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeRaidArraysRequest
     * @return A Java Future containing the result of the DescribeRaidArrays operation returned by the service.
     * @sample AWSOpsWorksAsync.DescribeRaidArrays
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeRaidArrays" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRaidArraysResult> describeRaidArraysAsync(DescribeRaidArraysRequest describeRaidArraysRequest);

    /**
     * <p>
     * Describe an instance's RAID arrays.
     * </p>
     * <note>
     * <p>
     * This call accepts only one resource-identifying parameter.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeRaidArraysRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRaidArrays operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribeRaidArrays
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeRaidArrays" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRaidArraysResult> describeRaidArraysAsync(DescribeRaidArraysRequest describeRaidArraysRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRaidArraysRequest, DescribeRaidArraysResult> asyncHandler);

    /**
     * <p>
     * Describes Amazon RDS instances.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * <p>
     * This call accepts only one resource-identifying parameter.
     * </p>
     * 
     * @param describeRdsDbInstancesRequest
     * @return A Java Future containing the result of the DescribeRdsDbInstances operation returned by the service.
     * @sample AWSOpsWorksAsync.DescribeRdsDbInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeRdsDbInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRdsDbInstancesResult> describeRdsDbInstancesAsync(DescribeRdsDbInstancesRequest describeRdsDbInstancesRequest);

    /**
     * <p>
     * Describes Amazon RDS instances.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * <p>
     * This call accepts only one resource-identifying parameter.
     * </p>
     * 
     * @param describeRdsDbInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRdsDbInstances operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribeRdsDbInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeRdsDbInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRdsDbInstancesResult> describeRdsDbInstancesAsync(DescribeRdsDbInstancesRequest describeRdsDbInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRdsDbInstancesRequest, DescribeRdsDbInstancesResult> asyncHandler);

    /**
     * <p>
     * Describes AWS OpsWorks Stacks service errors.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * <p>
     * This call accepts only one resource-identifying parameter.
     * </p>
     * 
     * @param describeServiceErrorsRequest
     * @return A Java Future containing the result of the DescribeServiceErrors operation returned by the service.
     * @sample AWSOpsWorksAsync.DescribeServiceErrors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeServiceErrors" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeServiceErrorsResult> describeServiceErrorsAsync(DescribeServiceErrorsRequest describeServiceErrorsRequest);

    /**
     * <p>
     * Describes AWS OpsWorks Stacks service errors.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * <p>
     * This call accepts only one resource-identifying parameter.
     * </p>
     * 
     * @param describeServiceErrorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeServiceErrors operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribeServiceErrors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeServiceErrors" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeServiceErrorsResult> describeServiceErrorsAsync(DescribeServiceErrorsRequest describeServiceErrorsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeServiceErrorsRequest, DescribeServiceErrorsResult> asyncHandler);

    /**
     * <p>
     * Requests a description of a stack's provisioning parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeStackProvisioningParametersRequest
     * @return A Java Future containing the result of the DescribeStackProvisioningParameters operation returned by the
     *         service.
     * @sample AWSOpsWorksAsync.DescribeStackProvisioningParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeStackProvisioningParameters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStackProvisioningParametersResult> describeStackProvisioningParametersAsync(
            DescribeStackProvisioningParametersRequest describeStackProvisioningParametersRequest);

    /**
     * <p>
     * Requests a description of a stack's provisioning parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeStackProvisioningParametersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStackProvisioningParameters operation returned by the
     *         service.
     * @sample AWSOpsWorksAsyncHandler.DescribeStackProvisioningParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeStackProvisioningParameters"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStackProvisioningParametersResult> describeStackProvisioningParametersAsync(
            DescribeStackProvisioningParametersRequest describeStackProvisioningParametersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStackProvisioningParametersRequest, DescribeStackProvisioningParametersResult> asyncHandler);

    /**
     * <p>
     * Describes the number of layers and apps in a specified stack, and the number of instances in each state, such as
     * <code>running_setup</code> or <code>online</code>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeStackSummaryRequest
     * @return A Java Future containing the result of the DescribeStackSummary operation returned by the service.
     * @sample AWSOpsWorksAsync.DescribeStackSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeStackSummary" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStackSummaryResult> describeStackSummaryAsync(DescribeStackSummaryRequest describeStackSummaryRequest);

    /**
     * <p>
     * Describes the number of layers and apps in a specified stack, and the number of instances in each state, such as
     * <code>running_setup</code> or <code>online</code>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeStackSummaryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStackSummary operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribeStackSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeStackSummary" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStackSummaryResult> describeStackSummaryAsync(DescribeStackSummaryRequest describeStackSummaryRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStackSummaryRequest, DescribeStackSummaryResult> asyncHandler);

    /**
     * <p>
     * Requests a description of one or more stacks.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeStacksRequest
     * @return A Java Future containing the result of the DescribeStacks operation returned by the service.
     * @sample AWSOpsWorksAsync.DescribeStacks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeStacks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync(DescribeStacksRequest describeStacksRequest);

    /**
     * <p>
     * Requests a description of one or more stacks.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeStacksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStacks operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribeStacks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeStacks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync(DescribeStacksRequest describeStacksRequest,
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
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeTimeBasedAutoScalingRequest
     * @return A Java Future containing the result of the DescribeTimeBasedAutoScaling operation returned by the
     *         service.
     * @sample AWSOpsWorksAsync.DescribeTimeBasedAutoScaling
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeTimeBasedAutoScaling"
     *      target="_top">AWS API Documentation</a>
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
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeTimeBasedAutoScalingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTimeBasedAutoScaling operation returned by the
     *         service.
     * @sample AWSOpsWorksAsyncHandler.DescribeTimeBasedAutoScaling
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeTimeBasedAutoScaling"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTimeBasedAutoScalingResult> describeTimeBasedAutoScalingAsync(
            DescribeTimeBasedAutoScalingRequest describeTimeBasedAutoScalingRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTimeBasedAutoScalingRequest, DescribeTimeBasedAutoScalingResult> asyncHandler);

    /**
     * <p>
     * Describe specified users.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an attached policy that explicitly grants
     * permissions. For more information about user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeUserProfilesRequest
     * @return A Java Future containing the result of the DescribeUserProfiles operation returned by the service.
     * @sample AWSOpsWorksAsync.DescribeUserProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeUserProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeUserProfilesResult> describeUserProfilesAsync(DescribeUserProfilesRequest describeUserProfilesRequest);

    /**
     * <p>
     * Describe specified users.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an attached policy that explicitly grants
     * permissions. For more information about user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeUserProfilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeUserProfiles operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribeUserProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeUserProfiles" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeUserProfilesResult> describeUserProfilesAsync(DescribeUserProfilesRequest describeUserProfilesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeUserProfilesRequest, DescribeUserProfilesResult> asyncHandler);

    /**
     * <p>
     * Describes an instance's Amazon EBS volumes.
     * </p>
     * <note>
     * <p>
     * This call accepts only one resource-identifying parameter.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeVolumesRequest
     * @return A Java Future containing the result of the DescribeVolumes operation returned by the service.
     * @sample AWSOpsWorksAsync.DescribeVolumes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeVolumes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeVolumesResult> describeVolumesAsync(DescribeVolumesRequest describeVolumesRequest);

    /**
     * <p>
     * Describes an instance's Amazon EBS volumes.
     * </p>
     * <note>
     * <p>
     * This call accepts only one resource-identifying parameter.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information about user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeVolumesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVolumes operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DescribeVolumes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeVolumes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeVolumesResult> describeVolumesAsync(DescribeVolumesRequest describeVolumesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVolumesRequest, DescribeVolumesResult> asyncHandler);

    /**
     * <p>
     * Detaches a specified Elastic Load Balancing instance from its layer.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param detachElasticLoadBalancerRequest
     * @return A Java Future containing the result of the DetachElasticLoadBalancer operation returned by the service.
     * @sample AWSOpsWorksAsync.DetachElasticLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DetachElasticLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DetachElasticLoadBalancerResult> detachElasticLoadBalancerAsync(
            DetachElasticLoadBalancerRequest detachElasticLoadBalancerRequest);

    /**
     * <p>
     * Detaches a specified Elastic Load Balancing instance from its layer.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param detachElasticLoadBalancerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetachElasticLoadBalancer operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DetachElasticLoadBalancer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DetachElasticLoadBalancer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DetachElasticLoadBalancerResult> detachElasticLoadBalancerAsync(
            DetachElasticLoadBalancerRequest detachElasticLoadBalancerRequest,
            com.amazonaws.handlers.AsyncHandler<DetachElasticLoadBalancerRequest, DetachElasticLoadBalancerResult> asyncHandler);

    /**
     * <p>
     * Disassociates an Elastic IP address from its instance. The address remains registered with the stack. For more
     * information, see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">Resource
     * Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param disassociateElasticIpRequest
     * @return A Java Future containing the result of the DisassociateElasticIp operation returned by the service.
     * @sample AWSOpsWorksAsync.DisassociateElasticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DisassociateElasticIp" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateElasticIpResult> disassociateElasticIpAsync(DisassociateElasticIpRequest disassociateElasticIpRequest);

    /**
     * <p>
     * Disassociates an Elastic IP address from its instance. The address remains registered with the stack. For more
     * information, see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">Resource
     * Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param disassociateElasticIpRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateElasticIp operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.DisassociateElasticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DisassociateElasticIp" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateElasticIpResult> disassociateElasticIpAsync(DisassociateElasticIpRequest disassociateElasticIpRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateElasticIpRequest, DisassociateElasticIpResult> asyncHandler);

    /**
     * <p>
     * Gets a generated host name for the specified layer, based on the current host name theme.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param getHostnameSuggestionRequest
     * @return A Java Future containing the result of the GetHostnameSuggestion operation returned by the service.
     * @sample AWSOpsWorksAsync.GetHostnameSuggestion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/GetHostnameSuggestion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetHostnameSuggestionResult> getHostnameSuggestionAsync(GetHostnameSuggestionRequest getHostnameSuggestionRequest);

    /**
     * <p>
     * Gets a generated host name for the specified layer, based on the current host name theme.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param getHostnameSuggestionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetHostnameSuggestion operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.GetHostnameSuggestion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/GetHostnameSuggestion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetHostnameSuggestionResult> getHostnameSuggestionAsync(GetHostnameSuggestionRequest getHostnameSuggestionRequest,
            com.amazonaws.handlers.AsyncHandler<GetHostnameSuggestionRequest, GetHostnameSuggestionResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This action can be used only with Windows stacks.
     * </p>
     * </note>
     * <p>
     * Grants RDP access to a Windows instance for a specified time period.
     * </p>
     * 
     * @param grantAccessRequest
     * @return A Java Future containing the result of the GrantAccess operation returned by the service.
     * @sample AWSOpsWorksAsync.GrantAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/GrantAccess" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GrantAccessResult> grantAccessAsync(GrantAccessRequest grantAccessRequest);

    /**
     * <note>
     * <p>
     * This action can be used only with Windows stacks.
     * </p>
     * </note>
     * <p>
     * Grants RDP access to a Windows instance for a specified time period.
     * </p>
     * 
     * @param grantAccessRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GrantAccess operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.GrantAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/GrantAccess" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GrantAccessResult> grantAccessAsync(GrantAccessRequest grantAccessRequest,
            com.amazonaws.handlers.AsyncHandler<GrantAccessRequest, GrantAccessResult> asyncHandler);

    /**
     * <p>
     * Returns a list of tags that are applied to the specified stack or layer.
     * </p>
     * 
     * @param listTagsRequest
     * @return A Java Future containing the result of the ListTags operation returned by the service.
     * @sample AWSOpsWorksAsync.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest listTagsRequest);

    /**
     * <p>
     * Returns a list of tags that are applied to the specified stack or layer.
     * </p>
     * 
     * @param listTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTags operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest listTagsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsRequest, ListTagsResult> asyncHandler);

    /**
     * <p>
     * Reboots a specified instance. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-starting.html">Starting, Stopping,
     * and Rebooting Instances</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param rebootInstanceRequest
     * @return A Java Future containing the result of the RebootInstance operation returned by the service.
     * @sample AWSOpsWorksAsync.RebootInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/RebootInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RebootInstanceResult> rebootInstanceAsync(RebootInstanceRequest rebootInstanceRequest);

    /**
     * <p>
     * Reboots a specified instance. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-starting.html">Starting, Stopping,
     * and Rebooting Instances</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param rebootInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RebootInstance operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.RebootInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/RebootInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RebootInstanceResult> rebootInstanceAsync(RebootInstanceRequest rebootInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<RebootInstanceRequest, RebootInstanceResult> asyncHandler);

    /**
     * <p>
     * Registers a specified Amazon ECS cluster with a stack. You can register only one cluster with a stack. A cluster
     * can be registered with only one stack. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-ecscluster.html"> Resource
     * Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param registerEcsClusterRequest
     * @return A Java Future containing the result of the RegisterEcsCluster operation returned by the service.
     * @sample AWSOpsWorksAsync.RegisterEcsCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/RegisterEcsCluster" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RegisterEcsClusterResult> registerEcsClusterAsync(RegisterEcsClusterRequest registerEcsClusterRequest);

    /**
     * <p>
     * Registers a specified Amazon ECS cluster with a stack. You can register only one cluster with a stack. A cluster
     * can be registered with only one stack. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-ecscluster.html"> Resource
     * Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param registerEcsClusterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterEcsCluster operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.RegisterEcsCluster
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/RegisterEcsCluster" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RegisterEcsClusterResult> registerEcsClusterAsync(RegisterEcsClusterRequest registerEcsClusterRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterEcsClusterRequest, RegisterEcsClusterResult> asyncHandler);

    /**
     * <p>
     * Registers an Elastic IP address with a specified stack. An address can be registered with only one stack at a
     * time. If the address is already registered, you must first deregister it by calling <a>DeregisterElasticIp</a>.
     * For more information, see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">Resource
     * Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param registerElasticIpRequest
     * @return A Java Future containing the result of the RegisterElasticIp operation returned by the service.
     * @sample AWSOpsWorksAsync.RegisterElasticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/RegisterElasticIp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RegisterElasticIpResult> registerElasticIpAsync(RegisterElasticIpRequest registerElasticIpRequest);

    /**
     * <p>
     * Registers an Elastic IP address with a specified stack. An address can be registered with only one stack at a
     * time. If the address is already registered, you must first deregister it by calling <a>DeregisterElasticIp</a>.
     * For more information, see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">Resource
     * Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param registerElasticIpRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterElasticIp operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.RegisterElasticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/RegisterElasticIp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RegisterElasticIpResult> registerElasticIpAsync(RegisterElasticIpRequest registerElasticIpRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterElasticIpRequest, RegisterElasticIpResult> asyncHandler);

    /**
     * <p>
     * Registers instances that were created outside of AWS OpsWorks Stacks with a specified stack.
     * </p>
     * <note>
     * <p>
     * We do not recommend using this action to register instances. The complete registration operation includes two
     * tasks: installing the AWS OpsWorks Stacks agent on the instance, and registering the instance with the stack.
     * <code>RegisterInstance</code> handles only the second step. You should instead use the AWS CLI
     * <code>register</code> command, which performs the entire registration operation. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/registered-instances-register.html"> Registering an
     * Instance with an AWS OpsWorks Stacks Stack</a>.
     * </p>
     * </note>
     * <p>
     * Registered instances have the same requirements as instances that are created by using the <a>CreateInstance</a>
     * API. For example, registered instances must be running a supported Linux-based operating system, and they must
     * have a supported instance type. For more information about requirements for instances that you want to register,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/registered-instances-register-registering-preparer.html">
     * Preparing the Instance</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param registerInstanceRequest
     * @return A Java Future containing the result of the RegisterInstance operation returned by the service.
     * @sample AWSOpsWorksAsync.RegisterInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/RegisterInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RegisterInstanceResult> registerInstanceAsync(RegisterInstanceRequest registerInstanceRequest);

    /**
     * <p>
     * Registers instances that were created outside of AWS OpsWorks Stacks with a specified stack.
     * </p>
     * <note>
     * <p>
     * We do not recommend using this action to register instances. The complete registration operation includes two
     * tasks: installing the AWS OpsWorks Stacks agent on the instance, and registering the instance with the stack.
     * <code>RegisterInstance</code> handles only the second step. You should instead use the AWS CLI
     * <code>register</code> command, which performs the entire registration operation. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/registered-instances-register.html"> Registering an
     * Instance with an AWS OpsWorks Stacks Stack</a>.
     * </p>
     * </note>
     * <p>
     * Registered instances have the same requirements as instances that are created by using the <a>CreateInstance</a>
     * API. For example, registered instances must be running a supported Linux-based operating system, and they must
     * have a supported instance type. For more information about requirements for instances that you want to register,
     * see <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/registered-instances-register-registering-preparer.html">
     * Preparing the Instance</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param registerInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterInstance operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.RegisterInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/RegisterInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RegisterInstanceResult> registerInstanceAsync(RegisterInstanceRequest registerInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterInstanceRequest, RegisterInstanceResult> asyncHandler);

    /**
     * <p>
     * Registers an Amazon RDS instance with a stack.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param registerRdsDbInstanceRequest
     * @return A Java Future containing the result of the RegisterRdsDbInstance operation returned by the service.
     * @sample AWSOpsWorksAsync.RegisterRdsDbInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/RegisterRdsDbInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RegisterRdsDbInstanceResult> registerRdsDbInstanceAsync(RegisterRdsDbInstanceRequest registerRdsDbInstanceRequest);

    /**
     * <p>
     * Registers an Amazon RDS instance with a stack.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param registerRdsDbInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterRdsDbInstance operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.RegisterRdsDbInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/RegisterRdsDbInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RegisterRdsDbInstanceResult> registerRdsDbInstanceAsync(RegisterRdsDbInstanceRequest registerRdsDbInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterRdsDbInstanceRequest, RegisterRdsDbInstanceResult> asyncHandler);

    /**
     * <p>
     * Registers an Amazon EBS volume with a specified stack. A volume can be registered with only one stack at a time.
     * If the volume is already registered, you must first deregister it by calling <a>DeregisterVolume</a>. For more
     * information, see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">Resource
     * Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param registerVolumeRequest
     * @return A Java Future containing the result of the RegisterVolume operation returned by the service.
     * @sample AWSOpsWorksAsync.RegisterVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/RegisterVolume" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RegisterVolumeResult> registerVolumeAsync(RegisterVolumeRequest registerVolumeRequest);

    /**
     * <p>
     * Registers an Amazon EBS volume with a specified stack. A volume can be registered with only one stack at a time.
     * If the volume is already registered, you must first deregister it by calling <a>DeregisterVolume</a>. For more
     * information, see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">Resource
     * Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param registerVolumeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterVolume operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.RegisterVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/RegisterVolume" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RegisterVolumeResult> registerVolumeAsync(RegisterVolumeRequest registerVolumeRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterVolumeRequest, RegisterVolumeResult> asyncHandler);

    /**
     * <p>
     * Specify the load-based auto scaling configuration for a specified layer. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-autoscaling.html">Managing Load with
     * Time-based and Load-based Instances</a>.
     * </p>
     * <note>
     * <p>
     * To use load-based auto scaling, you must create a set of load-based auto scaling instances. Load-based auto
     * scaling operates only on the instances from that set, so you must ensure that you have created enough instances
     * to handle the maximum anticipated load.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param setLoadBasedAutoScalingRequest
     * @return A Java Future containing the result of the SetLoadBasedAutoScaling operation returned by the service.
     * @sample AWSOpsWorksAsync.SetLoadBasedAutoScaling
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/SetLoadBasedAutoScaling"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetLoadBasedAutoScalingResult> setLoadBasedAutoScalingAsync(SetLoadBasedAutoScalingRequest setLoadBasedAutoScalingRequest);

    /**
     * <p>
     * Specify the load-based auto scaling configuration for a specified layer. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-autoscaling.html">Managing Load with
     * Time-based and Load-based Instances</a>.
     * </p>
     * <note>
     * <p>
     * To use load-based auto scaling, you must create a set of load-based auto scaling instances. Load-based auto
     * scaling operates only on the instances from that set, so you must ensure that you have created enough instances
     * to handle the maximum anticipated load.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param setLoadBasedAutoScalingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetLoadBasedAutoScaling operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.SetLoadBasedAutoScaling
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/SetLoadBasedAutoScaling"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetLoadBasedAutoScalingResult> setLoadBasedAutoScalingAsync(SetLoadBasedAutoScalingRequest setLoadBasedAutoScalingRequest,
            com.amazonaws.handlers.AsyncHandler<SetLoadBasedAutoScalingRequest, SetLoadBasedAutoScalingResult> asyncHandler);

    /**
     * <p>
     * Specifies a user's permissions. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingsecurity.html">Security and Permissions</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param setPermissionRequest
     * @return A Java Future containing the result of the SetPermission operation returned by the service.
     * @sample AWSOpsWorksAsync.SetPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/SetPermission" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SetPermissionResult> setPermissionAsync(SetPermissionRequest setPermissionRequest);

    /**
     * <p>
     * Specifies a user's permissions. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingsecurity.html">Security and Permissions</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param setPermissionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetPermission operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.SetPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/SetPermission" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SetPermissionResult> setPermissionAsync(SetPermissionRequest setPermissionRequest,
            com.amazonaws.handlers.AsyncHandler<SetPermissionRequest, SetPermissionResult> asyncHandler);

    /**
     * <p>
     * Specify the time-based auto scaling configuration for a specified instance. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-autoscaling.html">Managing Load with
     * Time-based and Load-based Instances</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param setTimeBasedAutoScalingRequest
     * @return A Java Future containing the result of the SetTimeBasedAutoScaling operation returned by the service.
     * @sample AWSOpsWorksAsync.SetTimeBasedAutoScaling
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/SetTimeBasedAutoScaling"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetTimeBasedAutoScalingResult> setTimeBasedAutoScalingAsync(SetTimeBasedAutoScalingRequest setTimeBasedAutoScalingRequest);

    /**
     * <p>
     * Specify the time-based auto scaling configuration for a specified instance. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-autoscaling.html">Managing Load with
     * Time-based and Load-based Instances</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param setTimeBasedAutoScalingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetTimeBasedAutoScaling operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.SetTimeBasedAutoScaling
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/SetTimeBasedAutoScaling"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SetTimeBasedAutoScalingResult> setTimeBasedAutoScalingAsync(SetTimeBasedAutoScalingRequest setTimeBasedAutoScalingRequest,
            com.amazonaws.handlers.AsyncHandler<SetTimeBasedAutoScalingRequest, SetTimeBasedAutoScalingResult> asyncHandler);

    /**
     * <p>
     * Starts a specified instance. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-starting.html">Starting, Stopping,
     * and Rebooting Instances</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param startInstanceRequest
     * @return A Java Future containing the result of the StartInstance operation returned by the service.
     * @sample AWSOpsWorksAsync.StartInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/StartInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartInstanceResult> startInstanceAsync(StartInstanceRequest startInstanceRequest);

    /**
     * <p>
     * Starts a specified instance. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-starting.html">Starting, Stopping,
     * and Rebooting Instances</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param startInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartInstance operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.StartInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/StartInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartInstanceResult> startInstanceAsync(StartInstanceRequest startInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<StartInstanceRequest, StartInstanceResult> asyncHandler);

    /**
     * <p>
     * Starts a stack's instances.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param startStackRequest
     * @return A Java Future containing the result of the StartStack operation returned by the service.
     * @sample AWSOpsWorksAsync.StartStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/StartStack" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartStackResult> startStackAsync(StartStackRequest startStackRequest);

    /**
     * <p>
     * Starts a stack's instances.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param startStackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartStack operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.StartStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/StartStack" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartStackResult> startStackAsync(StartStackRequest startStackRequest,
            com.amazonaws.handlers.AsyncHandler<StartStackRequest, StartStackResult> asyncHandler);

    /**
     * <p>
     * Stops a specified instance. When you stop a standard instance, the data disappears and must be reinstalled when
     * you restart the instance. You can stop an Amazon EBS-backed instance without losing data. For more information,
     * see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-starting.html">Starting,
     * Stopping, and Rebooting Instances</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param stopInstanceRequest
     * @return A Java Future containing the result of the StopInstance operation returned by the service.
     * @sample AWSOpsWorksAsync.StopInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/StopInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopInstanceResult> stopInstanceAsync(StopInstanceRequest stopInstanceRequest);

    /**
     * <p>
     * Stops a specified instance. When you stop a standard instance, the data disappears and must be reinstalled when
     * you restart the instance. You can stop an Amazon EBS-backed instance without losing data. For more information,
     * see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-starting.html">Starting,
     * Stopping, and Rebooting Instances</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param stopInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopInstance operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.StopInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/StopInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopInstanceResult> stopInstanceAsync(StopInstanceRequest stopInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<StopInstanceRequest, StopInstanceResult> asyncHandler);

    /**
     * <p>
     * Stops a specified stack.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param stopStackRequest
     * @return A Java Future containing the result of the StopStack operation returned by the service.
     * @sample AWSOpsWorksAsync.StopStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/StopStack" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopStackResult> stopStackAsync(StopStackRequest stopStackRequest);

    /**
     * <p>
     * Stops a specified stack.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param stopStackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopStack operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.StopStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/StopStack" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopStackResult> stopStackAsync(StopStackRequest stopStackRequest,
            com.amazonaws.handlers.AsyncHandler<StopStackRequest, StopStackResult> asyncHandler);

    /**
     * <p>
     * Apply cost-allocation tags to a specified stack or layer in AWS OpsWorks Stacks. For more information about how
     * tagging works, see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/tagging.html">Tags</a> in the
     * AWS OpsWorks User Guide.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSOpsWorksAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Apply cost-allocation tags to a specified stack or layer in AWS OpsWorks Stacks. For more information about how
     * tagging works, see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/tagging.html">Tags</a> in the
     * AWS OpsWorks User Guide.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Unassigns a registered instance from all layers that are using the instance. The instance remains in the stack as
     * an unassigned instance, and can be assigned to another layer as needed. You cannot use this action with instances
     * that were created with AWS OpsWorks Stacks.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack
     * or an attached policy that explicitly grants permissions. For more information about user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param unassignInstanceRequest
     * @return A Java Future containing the result of the UnassignInstance operation returned by the service.
     * @sample AWSOpsWorksAsync.UnassignInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UnassignInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UnassignInstanceResult> unassignInstanceAsync(UnassignInstanceRequest unassignInstanceRequest);

    /**
     * <p>
     * Unassigns a registered instance from all layers that are using the instance. The instance remains in the stack as
     * an unassigned instance, and can be assigned to another layer as needed. You cannot use this action with instances
     * that were created with AWS OpsWorks Stacks.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack
     * or an attached policy that explicitly grants permissions. For more information about user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param unassignInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UnassignInstance operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.UnassignInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UnassignInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UnassignInstanceResult> unassignInstanceAsync(UnassignInstanceRequest unassignInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<UnassignInstanceRequest, UnassignInstanceResult> asyncHandler);

    /**
     * <p>
     * Unassigns an assigned Amazon EBS volume. The volume remains registered with the stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param unassignVolumeRequest
     * @return A Java Future containing the result of the UnassignVolume operation returned by the service.
     * @sample AWSOpsWorksAsync.UnassignVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UnassignVolume" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UnassignVolumeResult> unassignVolumeAsync(UnassignVolumeRequest unassignVolumeRequest);

    /**
     * <p>
     * Unassigns an assigned Amazon EBS volume. The volume remains registered with the stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param unassignVolumeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UnassignVolume operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.UnassignVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UnassignVolume" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UnassignVolumeResult> unassignVolumeAsync(UnassignVolumeRequest unassignVolumeRequest,
            com.amazonaws.handlers.AsyncHandler<UnassignVolumeRequest, UnassignVolumeResult> asyncHandler);

    /**
     * <p>
     * Removes tags from a specified stack or layer.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSOpsWorksAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags from a specified stack or layer.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates a specified app.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Deploy or Manage permissions level for
     * the stack, or an attached policy that explicitly grants permissions. For more information on user permissions,
     * see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param updateAppRequest
     * @return A Java Future containing the result of the UpdateApp operation returned by the service.
     * @sample AWSOpsWorksAsync.UpdateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UpdateApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAppResult> updateAppAsync(UpdateAppRequest updateAppRequest);

    /**
     * <p>
     * Updates a specified app.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Deploy or Manage permissions level for
     * the stack, or an attached policy that explicitly grants permissions. For more information on user permissions,
     * see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param updateAppRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApp operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.UpdateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UpdateApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAppResult> updateAppAsync(UpdateAppRequest updateAppRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAppRequest, UpdateAppResult> asyncHandler);

    /**
     * <p>
     * Updates a registered Elastic IP address's name. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param updateElasticIpRequest
     * @return A Java Future containing the result of the UpdateElasticIp operation returned by the service.
     * @sample AWSOpsWorksAsync.UpdateElasticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UpdateElasticIp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateElasticIpResult> updateElasticIpAsync(UpdateElasticIpRequest updateElasticIpRequest);

    /**
     * <p>
     * Updates a registered Elastic IP address's name. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param updateElasticIpRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateElasticIp operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.UpdateElasticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UpdateElasticIp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateElasticIpResult> updateElasticIpAsync(UpdateElasticIpRequest updateElasticIpRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateElasticIpRequest, UpdateElasticIpResult> asyncHandler);

    /**
     * <p>
     * Updates a specified instance.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param updateInstanceRequest
     * @return A Java Future containing the result of the UpdateInstance operation returned by the service.
     * @sample AWSOpsWorksAsync.UpdateInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UpdateInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateInstanceResult> updateInstanceAsync(UpdateInstanceRequest updateInstanceRequest);

    /**
     * <p>
     * Updates a specified instance.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param updateInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateInstance operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.UpdateInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UpdateInstance" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateInstanceResult> updateInstanceAsync(UpdateInstanceRequest updateInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateInstanceRequest, UpdateInstanceResult> asyncHandler);

    /**
     * <p>
     * Updates a specified layer.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param updateLayerRequest
     * @return A Java Future containing the result of the UpdateLayer operation returned by the service.
     * @sample AWSOpsWorksAsync.UpdateLayer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UpdateLayer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateLayerResult> updateLayerAsync(UpdateLayerRequest updateLayerRequest);

    /**
     * <p>
     * Updates a specified layer.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param updateLayerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateLayer operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.UpdateLayer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UpdateLayer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateLayerResult> updateLayerAsync(UpdateLayerRequest updateLayerRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateLayerRequest, UpdateLayerResult> asyncHandler);

    /**
     * <p>
     * Updates a user's SSH public key.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have self-management enabled or an attached
     * policy that explicitly grants permissions. For more information about user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param updateMyUserProfileRequest
     * @return A Java Future containing the result of the UpdateMyUserProfile operation returned by the service.
     * @sample AWSOpsWorksAsync.UpdateMyUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UpdateMyUserProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMyUserProfileResult> updateMyUserProfileAsync(UpdateMyUserProfileRequest updateMyUserProfileRequest);

    /**
     * <p>
     * Updates a user's SSH public key.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have self-management enabled or an attached
     * policy that explicitly grants permissions. For more information about user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param updateMyUserProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMyUserProfile operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.UpdateMyUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UpdateMyUserProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMyUserProfileResult> updateMyUserProfileAsync(UpdateMyUserProfileRequest updateMyUserProfileRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMyUserProfileRequest, UpdateMyUserProfileResult> asyncHandler);

    /**
     * <p>
     * Updates an Amazon RDS instance.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param updateRdsDbInstanceRequest
     * @return A Java Future containing the result of the UpdateRdsDbInstance operation returned by the service.
     * @sample AWSOpsWorksAsync.UpdateRdsDbInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UpdateRdsDbInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRdsDbInstanceResult> updateRdsDbInstanceAsync(UpdateRdsDbInstanceRequest updateRdsDbInstanceRequest);

    /**
     * <p>
     * Updates an Amazon RDS instance.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param updateRdsDbInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRdsDbInstance operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.UpdateRdsDbInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UpdateRdsDbInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRdsDbInstanceResult> updateRdsDbInstanceAsync(UpdateRdsDbInstanceRequest updateRdsDbInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRdsDbInstanceRequest, UpdateRdsDbInstanceResult> asyncHandler);

    /**
     * <p>
     * Updates a specified stack.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param updateStackRequest
     * @return A Java Future containing the result of the UpdateStack operation returned by the service.
     * @sample AWSOpsWorksAsync.UpdateStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UpdateStack" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateStackResult> updateStackAsync(UpdateStackRequest updateStackRequest);

    /**
     * <p>
     * Updates a specified stack.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param updateStackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateStack operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.UpdateStack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UpdateStack" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateStackResult> updateStackAsync(UpdateStackRequest updateStackRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateStackRequest, UpdateStackResult> asyncHandler);

    /**
     * <p>
     * Updates a specified user profile.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an attached policy that explicitly grants
     * permissions. For more information about user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param updateUserProfileRequest
     * @return A Java Future containing the result of the UpdateUserProfile operation returned by the service.
     * @sample AWSOpsWorksAsync.UpdateUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UpdateUserProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserProfileResult> updateUserProfileAsync(UpdateUserProfileRequest updateUserProfileRequest);

    /**
     * <p>
     * Updates a specified user profile.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an attached policy that explicitly grants
     * permissions. For more information about user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param updateUserProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateUserProfile operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.UpdateUserProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UpdateUserProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateUserProfileResult> updateUserProfileAsync(UpdateUserProfileRequest updateUserProfileRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateUserProfileRequest, UpdateUserProfileResult> asyncHandler);

    /**
     * <p>
     * Updates an Amazon EBS volume's name or mount point. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param updateVolumeRequest
     * @return A Java Future containing the result of the UpdateVolume operation returned by the service.
     * @sample AWSOpsWorksAsync.UpdateVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UpdateVolume" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateVolumeResult> updateVolumeAsync(UpdateVolumeRequest updateVolumeRequest);

    /**
     * <p>
     * Updates an Amazon EBS volume's name or mount point. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html">Resource Management</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack,
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param updateVolumeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateVolume operation returned by the service.
     * @sample AWSOpsWorksAsyncHandler.UpdateVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/UpdateVolume" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateVolumeResult> updateVolumeAsync(UpdateVolumeRequest updateVolumeRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateVolumeRequest, UpdateVolumeResult> asyncHandler);

}
