/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.opsworks.model.*;

/**
 * Interface for accessing AWSOpsWorks.
 * AWS OpsWorks <p>
 * Welcome to the <i>AWS OpsWorks API Reference</i> . This guide provides
 * descriptions, syntax, and usage examples about AWS OpsWorks actions
 * and data types, including common parameters and error codes.
 * </p>
 * <p>
 * AWS OpsWorks is an application management service that provides an
 * integrated experience for overseeing the complete application
 * lifecycle. For information about this product, go to the
 * <a href="http://aws.amazon.com/opsworks/"> AWS OpsWorks </a>
 * details page.
 * </p>
 * <p>
 * <b>SDKs and CLI</b>
 * </p>
 * <p>
 * The most common way to use the AWS OpsWorks API is by using the AWS
 * Command Line Interface (CLI) or by using one of the AWS SDKs to
 * implement applications in your preferred language. For more
 * information, see:
 * </p>
 * 
 * <ul>
 * <li>
 * <a href="http://docs.aws.amazon.com/cli/latest/userguide/cli-chap-welcome.html"> AWS CLI </a>
 * </li>
 * <li>
 * <a href="http://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/opsworks/AWSOpsWorksClient.html"> AWS SDK for Java </a>
 * </li>
 * <li>
 * <a href="http://docs.aws.amazon.com/sdkfornet/latest/apidocs/html/N_Amazon_OpsWorks.htm"> AWS SDK for .NET </a>
 * </li>
 * <li>
 * <a href="http://docs.aws.amazon.com/aws-sdk-php-2/latest/class-Aws.OpsWorks.OpsWorksClient.html"> AWS SDK for PHP 2 </a>
 * </li>
 * <li>
 * <a href="http://docs.aws.amazon.com/AWSRubySDK/latest/AWS/OpsWorks/Client.html"> AWS SDK for Ruby </a>
 * </li>
 * <li>
 * <a href="http://aws.amazon.com/documentation/sdkforjavascript/"> AWS SDK for Node.js </a>
 * </li>
 * <li>
 * <a href="http://docs.pythonboto.org/en/latest/ref/opsworks.html"> AWS SDK for Python(Boto) </a>
 * </li>
 * 
 * </ul>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * AWS OpsWorks supports only one endpoint,
 * opsworks.us-east-1.amazonaws.com (HTTPS), so you must connect to that
 * endpoint. You can then use the API to direct AWS OpsWorks to create
 * stacks in any AWS Region.
 * </p>
 * <p>
 * <b>Chef Versions</b>
 * </p>
 * <p>
 * When you call CreateStack, CloneStack, or UpdateStack we recommend you
 * use the <code>ConfigurationManager</code> parameter to specify the
 * Chef version, 0.9, 11.4, or 11.10. The default value is currently
 * 11.10. For more information, see
 * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingcookbook-chef11.html"> Chef Versions </a>
 * .
 * </p>
 * <p>
 * <b>NOTE:</b>You can still specify Chef 0.9 for your stack, but new
 * features are not available for Chef 0.9 stacks, and support is
 * scheduled to end on July 24, 2014. We do not recommend using Chef 0.9
 * for new stacks, and we recommend migrating your existing Chef 0.9
 * stacks to Chef 11.10 as soon as possible.
 * </p>
 */
public interface AWSOpsWorks {

    /**
     * Overrides the default endpoint for this client ("https://opsworks.us-east-1.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "opsworks.us-east-1.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://opsworks.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *            The endpoint (ex: "opsworks.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://opsworks.us-east-1.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSOpsWorks#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *            The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException
     *             If the given region is null, or if this service isn't
     *             available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;
    
    /**
     * <p>
     * Deregisters an Amazon RDS instance.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deregisterRdsDbInstanceRequest Container for the necessary
     *           parameters to execute the DeregisterRdsDbInstance service method on
     *           AWSOpsWorks.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deregisterRdsDbInstance(DeregisterRdsDbInstanceRequest deregisterRdsDbInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Registers an Amazon RDS instance with a stack.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param registerRdsDbInstanceRequest Container for the necessary
     *           parameters to execute the RegisterRdsDbInstance service method on
     *           AWSOpsWorks.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void registerRdsDbInstance(RegisterRdsDbInstanceRequest registerRdsDbInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a user's SSH public key.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have self-management enabled or an attached policy that explicitly
     * grants permissions. For more information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateMyUserProfileRequest Container for the necessary
     *           parameters to execute the UpdateMyUserProfile service method on
     *           AWSOpsWorks.
     * 
     * 
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateMyUserProfile(UpdateMyUserProfileRequest updateMyUserProfileRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deregisters an Amazon EBS volume. The volume can then be registered
     * by another stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deregisterVolumeRequest Container for the necessary parameters
     *           to execute the DeregisterVolume service method on AWSOpsWorks.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deregisterVolume(DeregisterVolumeRequest deregisterVolumeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Specifies a user's permissions. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingsecurity.html"> Security and Permissions </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param setPermissionRequest Container for the necessary parameters to
     *           execute the SetPermission service method on AWSOpsWorks.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void setPermission(SetPermissionRequest setPermissionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Requests a description of a set of instances.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeInstancesRequest Container for the necessary parameters
     *           to execute the DescribeInstances service method on AWSOpsWorks.
     * 
     * @return The response from the DescribeInstances service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeInstancesResult describeInstances(DescribeInstancesRequest describeInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the permissions for a specified stack.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describePermissionsRequest Container for the necessary
     *           parameters to execute the DescribePermissions service method on
     *           AWSOpsWorks.
     * 
     * @return The response from the DescribePermissions service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribePermissionsResult describePermissions(DescribePermissionsRequest describePermissionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a specified instance, which terminates the associated Amazon
     * EC2 instance. You must stop an instance before you can delete it.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-delete.html"> Deleting Instances </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deleteInstanceRequest Container for the necessary parameters to
     *           execute the DeleteInstance service method on AWSOpsWorks.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteInstance(DeleteInstanceRequest deleteInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a clone of a specified stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-cloning.html"> Clone a Stack </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have an attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param cloneStackRequest Container for the necessary parameters to
     *           execute the CloneStack service method on AWSOpsWorks.
     * 
     * @return The response from the CloneStack service method, as returned
     *         by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CloneStackResult cloneStack(CloneStackRequest cloneStackRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Detaches a specified Elastic Load Balancing instance from its layer.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param detachElasticLoadBalancerRequest Container for the necessary
     *           parameters to execute the DetachElasticLoadBalancer service method on
     *           AWSOpsWorks.
     * 
     * 
     * @throws ResourceNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void detachElasticLoadBalancer(DetachElasticLoadBalancerRequest detachElasticLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops a specified instance. When you stop a standard instance, the
     * data disappears and must be reinstalled when you restart the instance.
     * You can stop an Amazon EBS-backed instance without losing data. For
     * more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-starting.html"> Starting, Stopping, and Rebooting Instances </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param stopInstanceRequest Container for the necessary parameters to
     *           execute the StopInstance service method on AWSOpsWorks.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void stopInstance(StopInstanceRequest stopInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a specified app.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Deploy or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateAppRequest Container for the necessary parameters to
     *           execute the UpdateApp service method on AWSOpsWorks.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateApp(UpdateAppRequest updateAppRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes Amazon RDS instances.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeRdsDbInstancesRequest Container for the necessary
     *           parameters to execute the DescribeRdsDbInstances service method on
     *           AWSOpsWorks.
     * 
     * @return The response from the DescribeRdsDbInstances service method,
     *         as returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeRdsDbInstancesResult describeRdsDbInstances(DescribeRdsDbInstancesRequest describeRdsDbInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the results of specified commands.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeCommandsRequest Container for the necessary parameters
     *           to execute the DescribeCommands service method on AWSOpsWorks.
     * 
     * @return The response from the DescribeCommands service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeCommandsResult describeCommands(DescribeCommandsRequest describeCommandsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates one of the stack's registered Elastic IP addresses with a
     * specified instance. The address must first be registered with the
     * stack by calling RegisterElasticIp. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param associateElasticIpRequest Container for the necessary
     *           parameters to execute the AssociateElasticIp service method on
     *           AWSOpsWorks.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void associateElasticIp(AssociateElasticIpRequest associateElasticIpRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Unassigns an assigned Amazon EBS volume. The volume remains
     * registered with the stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param unassignVolumeRequest Container for the necessary parameters to
     *           execute the UnassignVolume service method on AWSOpsWorks.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void unassignVolume(UnassignVolumeRequest unassignVolumeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describe an instance's RAID arrays.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeRaidArraysRequest Container for the necessary
     *           parameters to execute the DescribeRaidArrays service method on
     *           AWSOpsWorks.
     * 
     * @return The response from the DescribeRaidArrays service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeRaidArraysResult describeRaidArrays(DescribeRaidArraysRequest describeRaidArraysRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets a generated host name for the specified layer, based on the
     * current host name theme.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param getHostnameSuggestionRequest Container for the necessary
     *           parameters to execute the GetHostnameSuggestion service method on
     *           AWSOpsWorks.
     * 
     * @return The response from the GetHostnameSuggestion service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetHostnameSuggestionResult getHostnameSuggestion(GetHostnameSuggestionRequest getHostnameSuggestionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Specify the load-based auto scaling configuration for a specified
     * layer. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-autoscaling.html"> Managing Load with Time-based and Load-based Instances </a>
     * .
     * </p>
     * <p>
     * <b>NOTE:</b> To use load-based auto scaling, you must create a set of
     * load-based auto scaling instances. Load-based auto scaling operates
     * only on the instances from that set, so you must ensure that you have
     * created enough instances to handle the maximum anticipated load.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param setLoadBasedAutoScalingRequest Container for the necessary
     *           parameters to execute the SetLoadBasedAutoScaling service method on
     *           AWSOpsWorks.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void setLoadBasedAutoScaling(SetLoadBasedAutoScalingRequest setLoadBasedAutoScalingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes an instance's Amazon EBS volumes.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeVolumesRequest Container for the necessary parameters
     *           to execute the DescribeVolumes service method on AWSOpsWorks.
     * 
     * @return The response from the DescribeVolumes service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVolumesResult describeVolumes(DescribeVolumesRequest describeVolumesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Assigns one of the stack's registered Amazon EBS volumes to a
     * specified instance. The volume must first be registered with the stack
     * by calling RegisterVolume. After you register the volume, you must
     * call UpdateVolume to specify a mount point before calling
     * <code>AssignVolume</code> . For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param assignVolumeRequest Container for the necessary parameters to
     *           execute the AssignVolume service method on AWSOpsWorks.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void assignVolume(AssignVolumeRequest assignVolumeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Unassigns a registered instance from all of it's layers. The instance
     * remains in the stack as an unassigned instance and can be assigned to
     * another layer, as needed. You cannot use this action with instances
     * that were created with AWS OpsWorks.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param unassignInstanceRequest Container for the necessary parameters
     *           to execute the UnassignInstance service method on AWSOpsWorks.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void unassignInstance(UnassignInstanceRequest unassignInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * <b>NOTE:</b>This API can be used only with Windows stacks.
     * </p>
     * <p>
     * Grants RDP access to a Windows instance for a specified time period.
     * </p>
     *
     * @param grantAccessRequest Container for the necessary parameters to
     *           execute the GrantAccess service method on AWSOpsWorks.
     * 
     * @return The response from the GrantAccess service method, as returned
     *         by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GrantAccessResult grantAccess(GrantAccessRequest grantAccessRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes AWS OpsWorks service errors.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeServiceErrorsRequest Container for the necessary
     *           parameters to execute the DescribeServiceErrors service method on
     *           AWSOpsWorks.
     * 
     * @return The response from the DescribeServiceErrors service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeServiceErrorsResult describeServiceErrors(DescribeServiceErrorsRequest describeServiceErrorsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a registered Elastic IP address's name. For more information,
     * see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateElasticIpRequest Container for the necessary parameters
     *           to execute the UpdateElasticIp service method on AWSOpsWorks.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateElasticIp(UpdateElasticIpRequest updateElasticIpRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a specified layer.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateLayerRequest Container for the necessary parameters to
     *           execute the UpdateLayer service method on AWSOpsWorks.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateLayer(UpdateLayerRequest updateLayerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts a specified instance. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-starting.html"> Starting, Stopping, and Rebooting Instances </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param startInstanceRequest Container for the necessary parameters to
     *           execute the StartInstance service method on AWSOpsWorks.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void startInstance(StartInstanceRequest startInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a layer. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-create.html"> How to Create a Layer </a>
     * .
     * </p>
     * <p>
     * <b>NOTE:</b> You should use CreateLayer for noncustom layer types
     * such as PHP App Server only if the stack does not have an existing
     * layer of that type. A stack can have at most one instance of each
     * noncustom layer; if you attempt to create a second instance,
     * CreateLayer fails. A stack can have an arbitrary number of custom
     * layers, so you can call CreateLayer as many times as you like for that
     * layer type.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param createLayerRequest Container for the necessary parameters to
     *           execute the CreateLayer service method on AWSOpsWorks.
     * 
     * @return The response from the CreateLayer service method, as returned
     *         by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateLayerResult createLayer(CreateLayerRequest createLayerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disassociates an Elastic IP address from its instance. The address
     * remains registered with the stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param disassociateElasticIpRequest Container for the necessary
     *           parameters to execute the DisassociateElasticIp service method on
     *           AWSOpsWorks.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void disassociateElasticIp(DisassociateElasticIpRequest disassociateElasticIpRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a specified stack. You must first delete all instances,
     * layers, and apps or deregister registered instances. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-shutting.html"> Shut Down a Stack </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deleteStackRequest Container for the necessary parameters to
     *           execute the DeleteStack service method on AWSOpsWorks.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteStack(DeleteStackRequest deleteStackRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts a stack's instances.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param startStackRequest Container for the necessary parameters to
     *           execute the StartStack service method on AWSOpsWorks.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void startStack(StartStackRequest startStackRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Registers an Amazon EBS volume with a specified stack. A volume can
     * be registered with only one stack at a time. If the volume is already
     * registered, you must first deregister it by calling DeregisterVolume.
     * For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param registerVolumeRequest Container for the necessary parameters to
     *           execute the RegisterVolume service method on AWSOpsWorks.
     * 
     * @return The response from the RegisterVolume service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RegisterVolumeResult registerVolume(RegisterVolumeRequest registerVolumeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates an Amazon RDS instance.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateRdsDbInstanceRequest Container for the necessary
     *           parameters to execute the UpdateRdsDbInstance service method on
     *           AWSOpsWorks.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateRdsDbInstance(UpdateRdsDbInstanceRequest updateRdsDbInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Registers instances with a specified stack that were created outside
     * of AWS OpsWorks.
     * </p>
     * <p>
     * <b>NOTE:</b>We do not recommend using this action to register
     * instances. The complete registration operation has two primary steps,
     * installing the AWS OpsWorks agent on the instance and registering the
     * instance with the stack. RegisterInstance handles only the second
     * step. You should instead use the AWS CLI register command, which
     * performs the entire registration operation.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param registerInstanceRequest Container for the necessary parameters
     *           to execute the RegisterInstance service method on AWSOpsWorks.
     * 
     * @return The response from the RegisterInstance service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RegisterInstanceResult registerInstance(RegisterInstanceRequest registerInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a specified user profile.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have an attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateUserProfileRequest Container for the necessary parameters
     *           to execute the UpdateUserProfile service method on AWSOpsWorks.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateUserProfile(UpdateUserProfileRequest updateUserProfileRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Reboots a specified instance. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-starting.html"> Starting, Stopping, and Rebooting Instances </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param rebootInstanceRequest Container for the necessary parameters to
     *           execute the RebootInstance service method on AWSOpsWorks.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void rebootInstance(RebootInstanceRequest rebootInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-edit.html"> Create a New Stack </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have an attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param createStackRequest Container for the necessary parameters to
     *           execute the CreateStack service method on AWSOpsWorks.
     * 
     * @return The response from the CreateStack service method, as returned
     *         by AWSOpsWorks.
     * 
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateStackResult createStack(CreateStackRequest createStackRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an instance in a specified stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-add.html"> Adding an Instance to a Layer </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param createInstanceRequest Container for the necessary parameters to
     *           execute the CreateInstance service method on AWSOpsWorks.
     * 
     * @return The response from the CreateInstance service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateInstanceResult createInstance(CreateInstanceRequest createInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a specified app.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deleteAppRequest Container for the necessary parameters to
     *           execute the DeleteApp service method on AWSOpsWorks.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteApp(DeleteAppRequest deleteAppRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Requests a description of a stack's provisioning parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeStackProvisioningParametersRequest Container for the
     *           necessary parameters to execute the
     *           DescribeStackProvisioningParameters service method on AWSOpsWorks.
     * 
     * @return The response from the DescribeStackProvisioningParameters
     *         service method, as returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeStackProvisioningParametersResult describeStackProvisioningParameters(DescribeStackProvisioningParametersRequest describeStackProvisioningParametersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deregisters a specified Elastic IP address. The address can then be
     * registered by another stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deregisterElasticIpRequest Container for the necessary
     *           parameters to execute the DeregisterElasticIp service method on
     *           AWSOpsWorks.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deregisterElasticIp(DeregisterElasticIpRequest deregisterElasticIpRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Attaches an Elastic Load Balancing load balancer to a specified
     * layer. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/load-balancer-elb.html"> Elastic Load Balancing </a>
     * .
     * </p>
     * <p>
     * <b>NOTE:</b> You must create the Elastic Load Balancing instance
     * separately, by using the Elastic Load Balancing console, API, or CLI.
     * For more information, see Elastic Load Balancing Developer Guide.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param attachElasticLoadBalancerRequest Container for the necessary
     *           parameters to execute the AttachElasticLoadBalancer service method on
     *           AWSOpsWorks.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void attachElasticLoadBalancer(AttachElasticLoadBalancerRequest attachElasticLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a specified stack.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateStackRequest Container for the necessary parameters to
     *           execute the UpdateStack service method on AWSOpsWorks.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateStack(UpdateStackRequest updateStackRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new user profile.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have an attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param createUserProfileRequest Container for the necessary parameters
     *           to execute the CreateUserProfile service method on AWSOpsWorks.
     * 
     * @return The response from the CreateUserProfile service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateUserProfileResult createUserProfile(CreateUserProfileRequest createUserProfileRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Requests a description of one or more layers in a specified stack.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeLayersRequest Container for the necessary parameters to
     *           execute the DescribeLayers service method on AWSOpsWorks.
     * 
     * @return The response from the DescribeLayers service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLayersResult describeLayers(DescribeLayersRequest describeLayersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes load-based auto scaling configurations for specified
     * layers.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeLoadBasedAutoScalingRequest Container for the necessary
     *           parameters to execute the DescribeLoadBasedAutoScaling service method
     *           on AWSOpsWorks.
     * 
     * @return The response from the DescribeLoadBasedAutoScaling service
     *         method, as returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLoadBasedAutoScalingResult describeLoadBasedAutoScaling(DescribeLoadBasedAutoScalingRequest describeLoadBasedAutoScalingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes a stack's Elastic Load Balancing instances.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeElasticLoadBalancersRequest Container for the necessary
     *           parameters to execute the DescribeElasticLoadBalancers service method
     *           on AWSOpsWorks.
     * 
     * @return The response from the DescribeElasticLoadBalancers service
     *         method, as returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeElasticLoadBalancersResult describeElasticLoadBalancers(DescribeElasticLoadBalancersRequest describeElasticLoadBalancersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Assign a registered instance to a layer.
     * </p>
     * 
     * <ul>
     * <li>You can assign registered on-premises instances to any layer
     * type.</li>
     * <li>You can assign registered Amazon EC2 instances only to custom
     * layers.</li>
     * <li>You cannot use this action with instances that were created with
     * AWS OpsWorks.</li>
     * 
     * </ul>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param assignInstanceRequest Container for the necessary parameters to
     *           execute the AssignInstance service method on AWSOpsWorks.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void assignInstance(AssignInstanceRequest assignInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deregister a registered Amazon EC2 or on-premises instance. This
     * action removes the instance from the stack and returns it to your
     * control. This action can not be used with instances that were created
     * with AWS OpsWorks.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deregisterInstanceRequest Container for the necessary
     *           parameters to execute the DeregisterInstance service method on
     *           AWSOpsWorks.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deregisterInstance(DeregisterInstanceRequest deregisterInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a specified layer. You must first stop and then delete all
     * associated instances or unassign registered instances. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinglayers-basics-delete.html"> How to Delete a Layer </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deleteLayerRequest Container for the necessary parameters to
     *           execute the DeleteLayer service method on AWSOpsWorks.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteLayer(DeleteLayerRequest deleteLayerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Specify the time-based auto scaling configuration for a specified
     * instance. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-autoscaling.html"> Managing Load with Time-based and Load-based Instances </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param setTimeBasedAutoScalingRequest Container for the necessary
     *           parameters to execute the SetTimeBasedAutoScaling service method on
     *           AWSOpsWorks.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void setTimeBasedAutoScaling(SetTimeBasedAutoScalingRequest setTimeBasedAutoScalingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes a user's SSH information.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have self-management enabled or an attached policy that explicitly
     * grants permissions. For more information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeMyUserProfileRequest Container for the necessary
     *           parameters to execute the DescribeMyUserProfile service method on
     *           AWSOpsWorks.
     * 
     * @return The response from the DescribeMyUserProfile service method, as
     *         returned by AWSOpsWorks.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeMyUserProfileResult describeMyUserProfile(DescribeMyUserProfileRequest describeMyUserProfileRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an app for a specified stack. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html"> Creating Apps </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param createAppRequest Container for the necessary parameters to
     *           execute the CreateApp service method on AWSOpsWorks.
     * 
     * @return The response from the CreateApp service method, as returned by
     *         AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateAppResult createApp(CreateAppRequest createAppRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates an Amazon EBS volume's name or mount point. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateVolumeRequest Container for the necessary parameters to
     *           execute the UpdateVolume service method on AWSOpsWorks.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateVolume(UpdateVolumeRequest updateVolumeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes time-based auto scaling configurations for specified
     * instances.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeTimeBasedAutoScalingRequest Container for the necessary
     *           parameters to execute the DescribeTimeBasedAutoScaling service method
     *           on AWSOpsWorks.
     * 
     * @return The response from the DescribeTimeBasedAutoScaling service
     *         method, as returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTimeBasedAutoScalingResult describeTimeBasedAutoScaling(DescribeTimeBasedAutoScalingRequest describeTimeBasedAutoScalingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a user profile.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have an attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param deleteUserProfileRequest Container for the necessary parameters
     *           to execute the DeleteUserProfile service method on AWSOpsWorks.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteUserProfile(DeleteUserProfileRequest deleteUserProfileRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describe specified users.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have an attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeUserProfilesRequest Container for the necessary
     *           parameters to execute the DescribeUserProfiles service method on
     *           AWSOpsWorks.
     * 
     * @return The response from the DescribeUserProfiles service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeUserProfilesResult describeUserProfiles(DescribeUserProfilesRequest describeUserProfilesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates a specified instance.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param updateInstanceRequest Container for the necessary parameters to
     *           execute the UpdateInstance service method on AWSOpsWorks.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void updateInstance(UpdateInstanceRequest updateInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Requests a description of a specified set of deployments.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeDeploymentsRequest Container for the necessary
     *           parameters to execute the DescribeDeployments service method on
     *           AWSOpsWorks.
     * 
     * @return The response from the DescribeDeployments service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDeploymentsResult describeDeployments(DescribeDeploymentsRequest describeDeploymentsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Registers an Elastic IP address with a specified stack. An address
     * can be registered with only one stack at a time. If the address is
     * already registered, you must first deregister it by calling
     * DeregisterElasticIp. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> Resource Management </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param registerElasticIpRequest Container for the necessary parameters
     *           to execute the RegisterElasticIp service method on AWSOpsWorks.
     * 
     * @return The response from the RegisterElasticIp service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RegisterElasticIpResult registerElasticIp(RegisterElasticIpRequest registerElasticIpRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"> Elastic IP addresses </a>
     * .
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeElasticIpsRequest Container for the necessary
     *           parameters to execute the DescribeElasticIps service method on
     *           AWSOpsWorks.
     * 
     * @return The response from the DescribeElasticIps service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeElasticIpsResult describeElasticIps(DescribeElasticIpsRequest describeElasticIpsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Requests a description of one or more stacks.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeStacksRequest Container for the necessary parameters to
     *           execute the DescribeStacks service method on AWSOpsWorks.
     * 
     * @return The response from the DescribeStacks service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeStacksResult describeStacks(DescribeStacksRequest describeStacksRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Requests a description of a specified set of apps.
     * </p>
     * <p>
     * <b>NOTE:</b> You must specify at least one of the parameters.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeAppsRequest Container for the necessary parameters to
     *           execute the DescribeApps service method on AWSOpsWorks.
     * 
     * @return The response from the DescribeApps service method, as returned
     *         by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAppsResult describeApps(DescribeAppsRequest describeAppsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the number of layers and apps in a specified stack, and the
     * number of instances in each state, such as <code>running_setup</code>
     * or <code>online</code> .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Show, Deploy, or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param describeStackSummaryRequest Container for the necessary
     *           parameters to execute the DescribeStackSummary service method on
     *           AWSOpsWorks.
     * 
     * @return The response from the DescribeStackSummary service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeStackSummaryResult describeStackSummary(DescribeStackSummaryRequest describeStackSummaryRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops a specified stack.
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Manage permissions level for the stack, or an attached policy
     * that explicitly grants permissions. For more information on user
     * permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param stopStackRequest Container for the necessary parameters to
     *           execute the StopStack service method on AWSOpsWorks.
     * 
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void stopStack(StopStackRequest stopStackRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Runs deployment or stack commands. For more information, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-deploying.html"> Deploying Apps </a> and <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingstacks-commands.html"> Run Stack Commands </a>
     * .
     * </p>
     * <p>
     * <b>Required Permissions</b> : To use this action, an IAM user must
     * have a Deploy or Manage permissions level for the stack, or an
     * attached policy that explicitly grants permissions. For more
     * information on user permissions, see
     * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
     * .
     * </p>
     *
     * @param createDeploymentRequest Container for the necessary parameters
     *           to execute the CreateDeployment service method on AWSOpsWorks.
     * 
     * @return The response from the CreateDeployment service method, as
     *         returned by AWSOpsWorks.
     * 
     * @throws ResourceNotFoundException
     * @throws ValidationException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSOpsWorks indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateDeploymentResult createDeployment(CreateDeploymentRequest createDeploymentRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
    
    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
        