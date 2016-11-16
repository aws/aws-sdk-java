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
package com.amazonaws.services.opsworks;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.services.opsworks.waiters.AWSOpsWorksWaiters;

/**
 * Interface for accessing AWS OpsWorks.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.opsworks.AbstractAWSOpsWorks} instead.
 * </p>
 * <p>
 * <fullname>AWS OpsWorks</fullname>
 * <p>
 * Welcome to the <i>AWS OpsWorks API Reference</i>. This guide provides descriptions, syntax, and usage examples for
 * AWS OpsWorks actions and data types, including common parameters and error codes.
 * </p>
 * <p>
 * AWS OpsWorks is an application management service that provides an integrated experience for overseeing the complete
 * application lifecycle. For information about this product, go to the <a href="http://aws.amazon.com/opsworks/">AWS
 * OpsWorks</a> details page.
 * </p>
 * <p>
 * <b>SDKs and CLI</b>
 * </p>
 * <p>
 * The most common way to use the AWS OpsWorks API is by using the AWS Command Line Interface (CLI) or by using one of
 * the AWS SDKs to implement applications in your preferred language. For more information, see:
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
 * AWS OpsWorks supports the following endpoints, all HTTPS. You must connect to one of the following endpoints. Stacks
 * can only be accessed or managed within the endpoint in which they are created.
 * </p>
 * <ul>
 * <li>
 * <p>
 * opsworks.us-east-1.amazonaws.com
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
 * opsworks.eu-west-1.amazonaws.com
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
public interface AWSOpsWorks {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "opsworks";

    /**
     * Overrides the default endpoint for this client ("https://opsworks.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "opsworks.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://opsworks.us-east-1.amazonaws.com"). If the protocol is not specified here, the default
     * protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a
     * href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "opsworks.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://opsworks.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will
     *        communicate with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSOpsWorks#setEndpoint(String)}, sets the regional endpoint for this client's service
     * calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     */
    void setRegion(Region region);

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
     * You cannot use this action with instances that were created with AWS OpsWorks.
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
     * @return Result of the AssignInstance operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.AssignInstance
     */
    AssignInstanceResult assignInstance(AssignInstanceRequest assignInstanceRequest);

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
     * @return Result of the AssignVolume operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.AssignVolume
     */
    AssignVolumeResult assignVolume(AssignVolumeRequest assignVolumeRequest);

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
     * @return Result of the AssociateElasticIp operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.AssociateElasticIp
     */
    AssociateElasticIpResult associateElasticIp(AssociateElasticIpRequest associateElasticIpRequest);

    /**
     * <p>
     * Attaches an Elastic Load Balancing load balancer to a specified layer. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/load-balancer-elb.html">Elastic Load Balancing</a>.
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
     * @return Result of the AttachElasticLoadBalancer operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.AttachElasticLoadBalancer
     */
    AttachElasticLoadBalancerResult attachElasticLoadBalancer(AttachElasticLoadBalancerRequest attachElasticLoadBalancerRequest);

    /**
     * <p>
     * Creates a clone of a specified stack. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-cloning.html">Clone a Stack</a>. By
     * default, all parameters are set to the values used by the parent stack.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an attached policy that explicitly grants
     * permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param cloneStackRequest
     * @return Result of the CloneStack operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.CloneStack
     */
    CloneStackResult cloneStack(CloneStackRequest cloneStackRequest);

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
     * @return Result of the CreateApp operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.CreateApp
     */
    CreateAppResult createApp(CreateAppRequest createAppRequest);

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
     * @return Result of the CreateDeployment operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.CreateDeployment
     */
    CreateDeploymentResult createDeployment(CreateDeploymentRequest createDeploymentRequest);

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
     * @return Result of the CreateInstance operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.CreateInstance
     */
    CreateInstanceResult createInstance(CreateInstanceRequest createInstanceRequest);

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
     * @return Result of the CreateLayer operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.CreateLayer
     */
    CreateLayerResult createLayer(CreateLayerRequest createLayerRequest);

    /**
     * <p>
     * Creates a new stack. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-edit.html">Create a New Stack</a>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an attached policy that explicitly grants
     * permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param createStackRequest
     * @return Result of the CreateStack operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @sample AWSOpsWorks.CreateStack
     */
    CreateStackResult createStack(CreateStackRequest createStackRequest);

    /**
     * <p>
     * Creates a new user profile.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an attached policy that explicitly grants
     * permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param createUserProfileRequest
     * @return Result of the CreateUserProfile operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @sample AWSOpsWorks.CreateUserProfile
     */
    CreateUserProfileResult createUserProfile(CreateUserProfileRequest createUserProfileRequest);

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
     * @return Result of the DeleteApp operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DeleteApp
     */
    DeleteAppResult deleteApp(DeleteAppRequest deleteAppRequest);

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
     * @return Result of the DeleteInstance operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DeleteInstance
     */
    DeleteInstanceResult deleteInstance(DeleteInstanceRequest deleteInstanceRequest);

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
     * @return Result of the DeleteLayer operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DeleteLayer
     */
    DeleteLayerResult deleteLayer(DeleteLayerRequest deleteLayerRequest);

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
     * @return Result of the DeleteStack operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DeleteStack
     */
    DeleteStackResult deleteStack(DeleteStackRequest deleteStackRequest);

    /**
     * <p>
     * Deletes a user profile.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an attached policy that explicitly grants
     * permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param deleteUserProfileRequest
     * @return Result of the DeleteUserProfile operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DeleteUserProfile
     */
    DeleteUserProfileResult deleteUserProfile(DeleteUserProfileRequest deleteUserProfileRequest);

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
     * @return Result of the DeregisterEcsCluster operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DeregisterEcsCluster
     */
    DeregisterEcsClusterResult deregisterEcsCluster(DeregisterEcsClusterRequest deregisterEcsClusterRequest);

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
     * @return Result of the DeregisterElasticIp operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DeregisterElasticIp
     */
    DeregisterElasticIpResult deregisterElasticIp(DeregisterElasticIpRequest deregisterElasticIpRequest);

    /**
     * <p>
     * Deregister a registered Amazon EC2 or on-premises instance. This action removes the instance from the stack and
     * returns it to your control. This action can not be used with instances that were created with AWS OpsWorks.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param deregisterInstanceRequest
     * @return Result of the DeregisterInstance operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DeregisterInstance
     */
    DeregisterInstanceResult deregisterInstance(DeregisterInstanceRequest deregisterInstanceRequest);

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
     * @return Result of the DeregisterRdsDbInstance operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DeregisterRdsDbInstance
     */
    DeregisterRdsDbInstanceResult deregisterRdsDbInstance(DeregisterRdsDbInstanceRequest deregisterRdsDbInstanceRequest);

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
     * @return Result of the DeregisterVolume operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DeregisterVolume
     */
    DeregisterVolumeResult deregisterVolume(DeregisterVolumeRequest deregisterVolumeRequest);

    /**
     * <p>
     * Describes the available AWS OpsWorks agent versions. You must specify a stack ID or a configuration manager.
     * <code>DescribeAgentVersions</code> returns a list of available agent versions for the specified stack or
     * configuration manager.
     * </p>
     * 
     * @param describeAgentVersionsRequest
     * @return Result of the DescribeAgentVersions operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeAgentVersions
     */
    DescribeAgentVersionsResult describeAgentVersions(DescribeAgentVersionsRequest describeAgentVersionsRequest);

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
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information on user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeAppsRequest
     * @return Result of the DescribeApps operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeApps
     */
    DescribeAppsResult describeApps(DescribeAppsRequest describeAppsRequest);

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
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information on user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeCommandsRequest
     * @return Result of the DescribeCommands operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeCommands
     */
    DescribeCommandsResult describeCommands(DescribeCommandsRequest describeCommandsRequest);

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
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information on user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeDeploymentsRequest
     * @return Result of the DescribeDeployments operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeDeployments
     */
    DescribeDeploymentsResult describeDeployments(DescribeDeploymentsRequest describeDeploymentsRequest);

    /**
     * <p>
     * Describes Amazon ECS clusters that are registered with a stack. If you specify only a stack ID, you can use the
     * <code>MaxResults</code> and <code>NextToken</code> parameters to paginate the response. However, AWS OpsWorks
     * currently supports only one cluster per layer, so the result set has a maximum of one element.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack or an attached policy that explicitly grants permission. For more information on user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeEcsClustersRequest
     * @return Result of the DescribeEcsClusters operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeEcsClusters
     */
    DescribeEcsClustersResult describeEcsClusters(DescribeEcsClustersRequest describeEcsClustersRequest);

    /**
     * <p>
     * Describes <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic IP
     * addresses</a>.
     * </p>
     * <note>
     * <p>
     * You must specify at least one of the parameters.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information on user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeElasticIpsRequest
     * @return Result of the DescribeElasticIps operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeElasticIps
     */
    DescribeElasticIpsResult describeElasticIps(DescribeElasticIpsRequest describeElasticIpsRequest);

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
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information on user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeElasticLoadBalancersRequest
     * @return Result of the DescribeElasticLoadBalancers operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeElasticLoadBalancers
     */
    DescribeElasticLoadBalancersResult describeElasticLoadBalancers(DescribeElasticLoadBalancersRequest describeElasticLoadBalancersRequest);

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
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information on user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeInstancesRequest
     * @return Result of the DescribeInstances operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeInstances
     */
    DescribeInstancesResult describeInstances(DescribeInstancesRequest describeInstancesRequest);

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
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information on user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeLayersRequest
     * @return Result of the DescribeLayers operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeLayers
     */
    DescribeLayersResult describeLayers(DescribeLayersRequest describeLayersRequest);

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
     * level for the stack, or an attached policy that explicitly grants permissions. For more information on user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeLoadBasedAutoScalingRequest
     * @return Result of the DescribeLoadBasedAutoScaling operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeLoadBasedAutoScaling
     */
    DescribeLoadBasedAutoScalingResult describeLoadBasedAutoScaling(DescribeLoadBasedAutoScalingRequest describeLoadBasedAutoScalingRequest);

    /**
     * <p>
     * Describes a user's SSH information.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have self-management enabled or an attached
     * policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeMyUserProfileRequest
     * @return Result of the DescribeMyUserProfile operation returned by the service.
     * @sample AWSOpsWorks.DescribeMyUserProfile
     */
    DescribeMyUserProfileResult describeMyUserProfile(DescribeMyUserProfileRequest describeMyUserProfileRequest);

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
     * @return Result of the DescribePermissions operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribePermissions
     */
    DescribePermissionsResult describePermissions(DescribePermissionsRequest describePermissionsRequest);

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
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information on user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeRaidArraysRequest
     * @return Result of the DescribeRaidArrays operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeRaidArrays
     */
    DescribeRaidArraysResult describeRaidArrays(DescribeRaidArraysRequest describeRaidArraysRequest);

    /**
     * <p>
     * Describes Amazon RDS instances.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information on user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeRdsDbInstancesRequest
     * @return Result of the DescribeRdsDbInstances operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeRdsDbInstances
     */
    DescribeRdsDbInstancesResult describeRdsDbInstances(DescribeRdsDbInstancesRequest describeRdsDbInstancesRequest);

    /**
     * <p>
     * Describes AWS OpsWorks service errors.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information on user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeServiceErrorsRequest
     * @return Result of the DescribeServiceErrors operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeServiceErrors
     */
    DescribeServiceErrorsResult describeServiceErrors(DescribeServiceErrorsRequest describeServiceErrorsRequest);

    /**
     * <p>
     * Requests a description of a stack's provisioning parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack or an attached policy that explicitly grants permissions. For more information on user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeStackProvisioningParametersRequest
     * @return Result of the DescribeStackProvisioningParameters operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeStackProvisioningParameters
     */
    DescribeStackProvisioningParametersResult describeStackProvisioningParameters(
            DescribeStackProvisioningParametersRequest describeStackProvisioningParametersRequest);

    /**
     * <p>
     * Describes the number of layers and apps in a specified stack, and the number of instances in each state, such as
     * <code>running_setup</code> or <code>online</code>.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information on user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeStackSummaryRequest
     * @return Result of the DescribeStackSummary operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeStackSummary
     */
    DescribeStackSummaryResult describeStackSummary(DescribeStackSummaryRequest describeStackSummaryRequest);

    /**
     * <p>
     * Requests a description of one or more stacks.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information on user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeStacksRequest
     * @return Result of the DescribeStacks operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeStacks
     */
    DescribeStacksResult describeStacks(DescribeStacksRequest describeStacksRequest);

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
     * level for the stack, or an attached policy that explicitly grants permissions. For more information on user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeTimeBasedAutoScalingRequest
     * @return Result of the DescribeTimeBasedAutoScaling operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeTimeBasedAutoScaling
     */
    DescribeTimeBasedAutoScalingResult describeTimeBasedAutoScaling(DescribeTimeBasedAutoScalingRequest describeTimeBasedAutoScalingRequest);

    /**
     * <p>
     * Describe specified users.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an attached policy that explicitly grants
     * permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeUserProfilesRequest
     * @return Result of the DescribeUserProfiles operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeUserProfiles
     */
    DescribeUserProfilesResult describeUserProfiles(DescribeUserProfilesRequest describeUserProfilesRequest);

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
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Show, Deploy, or Manage permissions
     * level for the stack, or an attached policy that explicitly grants permissions. For more information on user
     * permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param describeVolumesRequest
     * @return Result of the DescribeVolumes operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DescribeVolumes
     */
    DescribeVolumesResult describeVolumes(DescribeVolumesRequest describeVolumesRequest);

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
     * @return Result of the DetachElasticLoadBalancer operation returned by the service.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DetachElasticLoadBalancer
     */
    DetachElasticLoadBalancerResult detachElasticLoadBalancer(DetachElasticLoadBalancerRequest detachElasticLoadBalancerRequest);

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
     * @return Result of the DisassociateElasticIp operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.DisassociateElasticIp
     */
    DisassociateElasticIpResult disassociateElasticIp(DisassociateElasticIpRequest disassociateElasticIpRequest);

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
     * @return Result of the GetHostnameSuggestion operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.GetHostnameSuggestion
     */
    GetHostnameSuggestionResult getHostnameSuggestion(GetHostnameSuggestionRequest getHostnameSuggestionRequest);

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
     * @return Result of the GrantAccess operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.GrantAccess
     */
    GrantAccessResult grantAccess(GrantAccessRequest grantAccessRequest);

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
     * @return Result of the RebootInstance operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.RebootInstance
     */
    RebootInstanceResult rebootInstance(RebootInstanceRequest rebootInstanceRequest);

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
     * @return Result of the RegisterEcsCluster operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.RegisterEcsCluster
     */
    RegisterEcsClusterResult registerEcsCluster(RegisterEcsClusterRequest registerEcsClusterRequest);

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
     * @return Result of the RegisterElasticIp operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.RegisterElasticIp
     */
    RegisterElasticIpResult registerElasticIp(RegisterElasticIpRequest registerElasticIpRequest);

    /**
     * <p>
     * Registers instances with a specified stack that were created outside of AWS OpsWorks.
     * </p>
     * <note>
     * <p>
     * We do not recommend using this action to register instances. The complete registration operation has two primary
     * steps, installing the AWS OpsWorks agent on the instance and registering the instance with the stack.
     * <code>RegisterInstance</code> handles only the second step. You should instead use the AWS CLI
     * <code>register</code> command, which performs the entire registration operation. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/registered-instances-register.html"> Registering an
     * Instance with an AWS OpsWorks Stack</a>.
     * </p>
     * </note>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param registerInstanceRequest
     * @return Result of the RegisterInstance operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.RegisterInstance
     */
    RegisterInstanceResult registerInstance(RegisterInstanceRequest registerInstanceRequest);

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
     * @return Result of the RegisterRdsDbInstance operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.RegisterRdsDbInstance
     */
    RegisterRdsDbInstanceResult registerRdsDbInstance(RegisterRdsDbInstanceRequest registerRdsDbInstanceRequest);

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
     * @return Result of the RegisterVolume operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.RegisterVolume
     */
    RegisterVolumeResult registerVolume(RegisterVolumeRequest registerVolumeRequest);

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
     * @return Result of the SetLoadBasedAutoScaling operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.SetLoadBasedAutoScaling
     */
    SetLoadBasedAutoScalingResult setLoadBasedAutoScaling(SetLoadBasedAutoScalingRequest setLoadBasedAutoScalingRequest);

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
     * @return Result of the SetPermission operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.SetPermission
     */
    SetPermissionResult setPermission(SetPermissionRequest setPermissionRequest);

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
     * @return Result of the SetTimeBasedAutoScaling operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.SetTimeBasedAutoScaling
     */
    SetTimeBasedAutoScalingResult setTimeBasedAutoScaling(SetTimeBasedAutoScalingRequest setTimeBasedAutoScalingRequest);

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
     * @return Result of the StartInstance operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.StartInstance
     */
    StartInstanceResult startInstance(StartInstanceRequest startInstanceRequest);

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
     * @return Result of the StartStack operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.StartStack
     */
    StartStackResult startStack(StartStackRequest startStackRequest);

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
     * @return Result of the StopInstance operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.StopInstance
     */
    StopInstanceResult stopInstance(StopInstanceRequest stopInstanceRequest);

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
     * @return Result of the StopStack operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.StopStack
     */
    StopStackResult stopStack(StopStackRequest stopStackRequest);

    /**
     * <p>
     * Unassigns a registered instance from all of it's layers. The instance remains in the stack as an unassigned
     * instance and can be assigned to another layer, as needed. You cannot use this action with instances that were
     * created with AWS OpsWorks.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have a Manage permissions level for the stack
     * or an attached policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param unassignInstanceRequest
     * @return Result of the UnassignInstance operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.UnassignInstance
     */
    UnassignInstanceResult unassignInstance(UnassignInstanceRequest unassignInstanceRequest);

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
     * @return Result of the UnassignVolume operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.UnassignVolume
     */
    UnassignVolumeResult unassignVolume(UnassignVolumeRequest unassignVolumeRequest);

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
     * @return Result of the UpdateApp operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.UpdateApp
     */
    UpdateAppResult updateApp(UpdateAppRequest updateAppRequest);

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
     * @return Result of the UpdateElasticIp operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.UpdateElasticIp
     */
    UpdateElasticIpResult updateElasticIp(UpdateElasticIpRequest updateElasticIpRequest);

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
     * @return Result of the UpdateInstance operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.UpdateInstance
     */
    UpdateInstanceResult updateInstance(UpdateInstanceRequest updateInstanceRequest);

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
     * @return Result of the UpdateLayer operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.UpdateLayer
     */
    UpdateLayerResult updateLayer(UpdateLayerRequest updateLayerRequest);

    /**
     * <p>
     * Updates a user's SSH public key.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have self-management enabled or an attached
     * policy that explicitly grants permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param updateMyUserProfileRequest
     * @return Result of the UpdateMyUserProfile operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @sample AWSOpsWorks.UpdateMyUserProfile
     */
    UpdateMyUserProfileResult updateMyUserProfile(UpdateMyUserProfileRequest updateMyUserProfileRequest);

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
     * @return Result of the UpdateRdsDbInstance operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.UpdateRdsDbInstance
     */
    UpdateRdsDbInstanceResult updateRdsDbInstance(UpdateRdsDbInstanceRequest updateRdsDbInstanceRequest);

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
     * @return Result of the UpdateStack operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.UpdateStack
     */
    UpdateStackResult updateStack(UpdateStackRequest updateStackRequest);

    /**
     * <p>
     * Updates a specified user profile.
     * </p>
     * <p>
     * <b>Required Permissions</b>: To use this action, an IAM user must have an attached policy that explicitly grants
     * permissions. For more information on user permissions, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html">Managing User
     * Permissions</a>.
     * </p>
     * 
     * @param updateUserProfileRequest
     * @return Result of the UpdateUserProfile operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.UpdateUserProfile
     */
    UpdateUserProfileResult updateUserProfile(UpdateUserProfileRequest updateUserProfileRequest);

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
     * @return Result of the UpdateVolume operation returned by the service.
     * @throws ValidationException
     *         Indicates that a request was not valid.
     * @throws ResourceNotFoundException
     *         Indicates that a resource was not found.
     * @sample AWSOpsWorks.UpdateVolume
     */
    UpdateVolumeResult updateVolume(UpdateVolumeRequest updateVolumeRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

    AWSOpsWorksWaiters waiters();

}
