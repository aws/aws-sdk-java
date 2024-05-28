/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3control;

import javax.annotation.Generated;

import com.amazonaws.services.s3control.model.*;

/**
 * Interface for accessing AWS S3 Control asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.s3control.AbstractAWSS3ControlAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Web Services S3 Control provides access to Amazon S3 control plane actions.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSS3ControlAsync extends AWSS3Control {

    /**
     * <p>
     * Associate your S3 Access Grants instance with an Amazon Web Services IAM Identity Center instance. Use this
     * action if you want to create access grants for users or groups from your corporate identity directory. First, you
     * must add your corporate identity directory to Amazon Web Services IAM Identity Center. Then, you can associate
     * this IAM Identity Center instance with your S3 Access Grants instance.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:AssociateAccessGrantsIdentityCenter</code> permission to use this operation.
     * </p>
     * </dd>
     * <dt>Additional Permissions</dt>
     * <dd>
     * <p>
     * You must also have the following permissions: <code>sso:CreateApplication</code>,
     * <code>sso:PutApplicationGrant</code>, and <code>sso:PutApplicationAuthenticationMethod</code>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param associateAccessGrantsIdentityCenterRequest
     * @return A Java Future containing the result of the AssociateAccessGrantsIdentityCenter operation returned by the
     *         service.
     * @sample AWSS3ControlAsync.AssociateAccessGrantsIdentityCenter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/AssociateAccessGrantsIdentityCenter"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateAccessGrantsIdentityCenterResult> associateAccessGrantsIdentityCenterAsync(
            AssociateAccessGrantsIdentityCenterRequest associateAccessGrantsIdentityCenterRequest);

    /**
     * <p>
     * Associate your S3 Access Grants instance with an Amazon Web Services IAM Identity Center instance. Use this
     * action if you want to create access grants for users or groups from your corporate identity directory. First, you
     * must add your corporate identity directory to Amazon Web Services IAM Identity Center. Then, you can associate
     * this IAM Identity Center instance with your S3 Access Grants instance.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:AssociateAccessGrantsIdentityCenter</code> permission to use this operation.
     * </p>
     * </dd>
     * <dt>Additional Permissions</dt>
     * <dd>
     * <p>
     * You must also have the following permissions: <code>sso:CreateApplication</code>,
     * <code>sso:PutApplicationGrant</code>, and <code>sso:PutApplicationAuthenticationMethod</code>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param associateAccessGrantsIdentityCenterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateAccessGrantsIdentityCenter operation returned by the
     *         service.
     * @sample AWSS3ControlAsyncHandler.AssociateAccessGrantsIdentityCenter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/AssociateAccessGrantsIdentityCenter"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateAccessGrantsIdentityCenterResult> associateAccessGrantsIdentityCenterAsync(
            AssociateAccessGrantsIdentityCenterRequest associateAccessGrantsIdentityCenterRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateAccessGrantsIdentityCenterRequest, AssociateAccessGrantsIdentityCenterResult> asyncHandler);

    /**
     * <p>
     * Creates an access grant that gives a grantee access to your S3 data. The grantee can be an IAM user or role or a
     * directory user, or group. Before you can create a grant, you must have an S3 Access Grants instance in the same
     * Region as the S3 data. You can create an S3 Access Grants instance using the <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessGrantsInstance.html"
     * >CreateAccessGrantsInstance</a>. You must also have registered at least one S3 data location in your S3 Access
     * Grants instance using <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessGrantsLocation.html"
     * >CreateAccessGrantsLocation</a>.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:CreateAccessGrant</code> permission to use this operation.
     * </p>
     * </dd>
     * <dt>Additional Permissions</dt>
     * <dd>
     * <p>
     * For any directory identity - <code>sso:DescribeInstance</code> and <code>sso:DescribeApplication</code>
     * </p>
     * <p>
     * For directory users - <code>identitystore:DescribeUser</code>
     * </p>
     * <p>
     * For directory groups - <code>identitystore:DescribeGroup</code>
     * </p>
     * </dd>
     * </dl>
     * 
     * @param createAccessGrantRequest
     * @return A Java Future containing the result of the CreateAccessGrant operation returned by the service.
     * @sample AWSS3ControlAsync.CreateAccessGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateAccessGrant" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAccessGrantResult> createAccessGrantAsync(CreateAccessGrantRequest createAccessGrantRequest);

    /**
     * <p>
     * Creates an access grant that gives a grantee access to your S3 data. The grantee can be an IAM user or role or a
     * directory user, or group. Before you can create a grant, you must have an S3 Access Grants instance in the same
     * Region as the S3 data. You can create an S3 Access Grants instance using the <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessGrantsInstance.html"
     * >CreateAccessGrantsInstance</a>. You must also have registered at least one S3 data location in your S3 Access
     * Grants instance using <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessGrantsLocation.html"
     * >CreateAccessGrantsLocation</a>.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:CreateAccessGrant</code> permission to use this operation.
     * </p>
     * </dd>
     * <dt>Additional Permissions</dt>
     * <dd>
     * <p>
     * For any directory identity - <code>sso:DescribeInstance</code> and <code>sso:DescribeApplication</code>
     * </p>
     * <p>
     * For directory users - <code>identitystore:DescribeUser</code>
     * </p>
     * <p>
     * For directory groups - <code>identitystore:DescribeGroup</code>
     * </p>
     * </dd>
     * </dl>
     * 
     * @param createAccessGrantRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAccessGrant operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.CreateAccessGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateAccessGrant" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAccessGrantResult> createAccessGrantAsync(CreateAccessGrantRequest createAccessGrantRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAccessGrantRequest, CreateAccessGrantResult> asyncHandler);

    /**
     * <p>
     * Creates an S3 Access Grants instance, which serves as a logical grouping for access grants. You can create one S3
     * Access Grants instance per Region per account.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:CreateAccessGrantsInstance</code> permission to use this operation.
     * </p>
     * </dd>
     * <dt>Additional Permissions</dt>
     * <dd>
     * <p>
     * To associate an IAM Identity Center instance with your S3 Access Grants instance, you must also have the
     * <code>sso:DescribeInstance</code>, <code>sso:CreateApplication</code>, <code>sso:PutApplicationGrant</code>, and
     * <code>sso:PutApplicationAuthenticationMethod</code> permissions.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param createAccessGrantsInstanceRequest
     * @return A Java Future containing the result of the CreateAccessGrantsInstance operation returned by the service.
     * @sample AWSS3ControlAsync.CreateAccessGrantsInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateAccessGrantsInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAccessGrantsInstanceResult> createAccessGrantsInstanceAsync(
            CreateAccessGrantsInstanceRequest createAccessGrantsInstanceRequest);

    /**
     * <p>
     * Creates an S3 Access Grants instance, which serves as a logical grouping for access grants. You can create one S3
     * Access Grants instance per Region per account.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:CreateAccessGrantsInstance</code> permission to use this operation.
     * </p>
     * </dd>
     * <dt>Additional Permissions</dt>
     * <dd>
     * <p>
     * To associate an IAM Identity Center instance with your S3 Access Grants instance, you must also have the
     * <code>sso:DescribeInstance</code>, <code>sso:CreateApplication</code>, <code>sso:PutApplicationGrant</code>, and
     * <code>sso:PutApplicationAuthenticationMethod</code> permissions.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param createAccessGrantsInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAccessGrantsInstance operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.CreateAccessGrantsInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateAccessGrantsInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAccessGrantsInstanceResult> createAccessGrantsInstanceAsync(
            CreateAccessGrantsInstanceRequest createAccessGrantsInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAccessGrantsInstanceRequest, CreateAccessGrantsInstanceResult> asyncHandler);

    /**
     * <p>
     * The S3 data location that you would like to register in your S3 Access Grants instance. Your S3 data must be in
     * the same Region as your S3 Access Grants instance. The location can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The default S3 location <code>s3://</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A bucket - <code>S3://&lt;bucket-name&gt;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A bucket and prefix - <code>S3://&lt;bucket-name&gt;/&lt;prefix&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you register a location, you must include the IAM role that has permission to manage the S3 location that
     * you are registering. Give S3 Access Grants permission to assume this role <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-grants-location.html">using a policy</a>. S3
     * Access Grants assumes this role to manage access to the location and to vend temporary credentials to grantees or
     * client applications.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:CreateAccessGrantsLocation</code> permission to use this operation.
     * </p>
     * </dd>
     * <dt>Additional Permissions</dt>
     * <dd>
     * <p>
     * You must also have the following permission for the specified IAM role: <code>iam:PassRole</code>
     * </p>
     * </dd>
     * </dl>
     * 
     * @param createAccessGrantsLocationRequest
     * @return A Java Future containing the result of the CreateAccessGrantsLocation operation returned by the service.
     * @sample AWSS3ControlAsync.CreateAccessGrantsLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateAccessGrantsLocation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAccessGrantsLocationResult> createAccessGrantsLocationAsync(
            CreateAccessGrantsLocationRequest createAccessGrantsLocationRequest);

    /**
     * <p>
     * The S3 data location that you would like to register in your S3 Access Grants instance. Your S3 data must be in
     * the same Region as your S3 Access Grants instance. The location can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The default S3 location <code>s3://</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A bucket - <code>S3://&lt;bucket-name&gt;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A bucket and prefix - <code>S3://&lt;bucket-name&gt;/&lt;prefix&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you register a location, you must include the IAM role that has permission to manage the S3 location that
     * you are registering. Give S3 Access Grants permission to assume this role <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-grants-location.html">using a policy</a>. S3
     * Access Grants assumes this role to manage access to the location and to vend temporary credentials to grantees or
     * client applications.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:CreateAccessGrantsLocation</code> permission to use this operation.
     * </p>
     * </dd>
     * <dt>Additional Permissions</dt>
     * <dd>
     * <p>
     * You must also have the following permission for the specified IAM role: <code>iam:PassRole</code>
     * </p>
     * </dd>
     * </dl>
     * 
     * @param createAccessGrantsLocationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAccessGrantsLocation operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.CreateAccessGrantsLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateAccessGrantsLocation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAccessGrantsLocationResult> createAccessGrantsLocationAsync(
            CreateAccessGrantsLocationRequest createAccessGrantsLocationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAccessGrantsLocationRequest, CreateAccessGrantsLocationResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Creates an access point and associates it with the specified bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points.html">Managing Data Access with Amazon
     * S3 Access Points</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p/>
     * <note>
     * <p>
     * S3 on Outposts only supports VPC-style access points.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">
     * Accessing Amazon S3 on Outposts using virtual private cloud (VPC) only access points</a> in the <i>Amazon S3 User
     * Guide</i>.
     * </p>
     * </note>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessPoint.html#API_control_CreateAccessPoint_Examples"
     * >Examples</a> section.
     * </p>
     * <p/>
     * <p>
     * The following actions are related to <code>CreateAccessPoint</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPoint.html">GetAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPoint.html">DeleteAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListAccessPoints.html">ListAccessPoints</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createAccessPointRequest
     * @return A Java Future containing the result of the CreateAccessPoint operation returned by the service.
     * @sample AWSS3ControlAsync.CreateAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateAccessPoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAccessPointResult> createAccessPointAsync(CreateAccessPointRequest createAccessPointRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Creates an access point and associates it with the specified bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points.html">Managing Data Access with Amazon
     * S3 Access Points</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p/>
     * <note>
     * <p>
     * S3 on Outposts only supports VPC-style access points.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">
     * Accessing Amazon S3 on Outposts using virtual private cloud (VPC) only access points</a> in the <i>Amazon S3 User
     * Guide</i>.
     * </p>
     * </note>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessPoint.html#API_control_CreateAccessPoint_Examples"
     * >Examples</a> section.
     * </p>
     * <p/>
     * <p>
     * The following actions are related to <code>CreateAccessPoint</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPoint.html">GetAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPoint.html">DeleteAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListAccessPoints.html">ListAccessPoints</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createAccessPointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAccessPoint operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.CreateAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateAccessPoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAccessPointResult> createAccessPointAsync(CreateAccessPointRequest createAccessPointRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAccessPointRequest, CreateAccessPointResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Creates an Object Lambda Access Point. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/transforming-objects.html">Transforming objects with
     * Object Lambda Access Points</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * The following actions are related to <code>CreateAccessPointForObjectLambda</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPointForObjectLambda.html">
     * DeleteAccessPointForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPointForObjectLambda.html">
     * GetAccessPointForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListAccessPointsForObjectLambda.html">
     * ListAccessPointsForObjectLambda</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createAccessPointForObjectLambdaRequest
     * @return A Java Future containing the result of the CreateAccessPointForObjectLambda operation returned by the
     *         service.
     * @sample AWSS3ControlAsync.CreateAccessPointForObjectLambda
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateAccessPointForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAccessPointForObjectLambdaResult> createAccessPointForObjectLambdaAsync(
            CreateAccessPointForObjectLambdaRequest createAccessPointForObjectLambdaRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Creates an Object Lambda Access Point. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/transforming-objects.html">Transforming objects with
     * Object Lambda Access Points</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * The following actions are related to <code>CreateAccessPointForObjectLambda</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPointForObjectLambda.html">
     * DeleteAccessPointForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPointForObjectLambda.html">
     * GetAccessPointForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListAccessPointsForObjectLambda.html">
     * ListAccessPointsForObjectLambda</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createAccessPointForObjectLambdaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAccessPointForObjectLambda operation returned by the
     *         service.
     * @sample AWSS3ControlAsyncHandler.CreateAccessPointForObjectLambda
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateAccessPointForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAccessPointForObjectLambdaResult> createAccessPointForObjectLambdaAsync(
            CreateAccessPointForObjectLambdaRequest createAccessPointForObjectLambdaRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAccessPointForObjectLambdaRequest, CreateAccessPointForObjectLambdaResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This action creates an Amazon S3 on Outposts bucket. To create an S3 bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html">Create Bucket</a> in the <i>Amazon
     * S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Creates a new Outposts bucket. By creating the bucket, you become the bucket owner. To create an Outposts bucket,
     * you must have S3 on Outposts. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a> in
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * Not every string is an acceptable bucket name. For information on bucket naming restrictions, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/BucketRestrictions.html#bucketnamingrules">Working
     * with Amazon S3 Buckets</a>.
     * </p>
     * <p>
     * S3 on Outposts buckets support:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Tags
     * </p>
     * </li>
     * <li>
     * <p>
     * LifecycleConfigurations for deleting expired objects
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a complete list of restrictions and Amazon S3 feature limitations on S3 on Outposts, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OnOutpostsRestrictionsLimitations.html"> Amazon S3
     * on Outposts Restrictions and Limitations</a>.
     * </p>
     * <p>
     * For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname
     * prefix and <code>x-amz-outpost-id</code> in your API request, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateBucket.html#API_control_CreateBucket_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>CreateBucket</code> for Amazon S3 on Outposts:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html">PutObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucket.html">GetBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucket.html">DeleteBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessPoint.html">CreateAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutAccessPointPolicy.html">
     * PutAccessPointPolicy</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createBucketRequest
     * @return A Java Future containing the result of the CreateBucket operation returned by the service.
     * @sample AWSS3ControlAsync.CreateBucket
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateBucket" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateBucketResult> createBucketAsync(CreateBucketRequest createBucketRequest);

    /**
     * <note>
     * <p>
     * This action creates an Amazon S3 on Outposts bucket. To create an S3 bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_CreateBucket.html">Create Bucket</a> in the <i>Amazon
     * S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Creates a new Outposts bucket. By creating the bucket, you become the bucket owner. To create an Outposts bucket,
     * you must have S3 on Outposts. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a> in
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * Not every string is an acceptable bucket name. For information on bucket naming restrictions, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/BucketRestrictions.html#bucketnamingrules">Working
     * with Amazon S3 Buckets</a>.
     * </p>
     * <p>
     * S3 on Outposts buckets support:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Tags
     * </p>
     * </li>
     * <li>
     * <p>
     * LifecycleConfigurations for deleting expired objects
     * </p>
     * </li>
     * </ul>
     * <p>
     * For a complete list of restrictions and Amazon S3 feature limitations on S3 on Outposts, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OnOutpostsRestrictionsLimitations.html"> Amazon S3
     * on Outposts Restrictions and Limitations</a>.
     * </p>
     * <p>
     * For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname
     * prefix and <code>x-amz-outpost-id</code> in your API request, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateBucket.html#API_control_CreateBucket_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>CreateBucket</code> for Amazon S3 on Outposts:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html">PutObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucket.html">GetBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucket.html">DeleteBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessPoint.html">CreateAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutAccessPointPolicy.html">
     * PutAccessPointPolicy</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createBucketRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBucket operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.CreateBucket
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateBucket" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateBucketResult> createBucketAsync(CreateBucketRequest createBucketRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBucketRequest, CreateBucketResult> asyncHandler);

    /**
     * <p>
     * This operation creates an S3 Batch Operations job.
     * </p>
     * <p>
     * You can use S3 Batch Operations to perform large-scale batch actions on Amazon S3 objects. Batch Operations can
     * run a single action on lists of Amazon S3 objects that you specify. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/batch-ops.html">S3 Batch Operations</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * For information about permissions required to use the Batch Operations, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/batch-ops-iam-role-policies.html">Granting
     * permissions for S3 Batch Operations</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </dd>
     * </dl>
     * <p/>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DescribeJob.html">DescribeJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListJobs.html">ListJobs</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_UpdateJobPriority.html">UpdateJobPriority</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_UpdateJobStatus.html">UpdateJobStatus</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_JobOperation.html">JobOperation</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createJobRequest
     * @return A Java Future containing the result of the CreateJob operation returned by the service.
     * @sample AWSS3ControlAsync.CreateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateJobResult> createJobAsync(CreateJobRequest createJobRequest);

    /**
     * <p>
     * This operation creates an S3 Batch Operations job.
     * </p>
     * <p>
     * You can use S3 Batch Operations to perform large-scale batch actions on Amazon S3 objects. Batch Operations can
     * run a single action on lists of Amazon S3 objects that you specify. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/batch-ops.html">S3 Batch Operations</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * For information about permissions required to use the Batch Operations, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/batch-ops-iam-role-policies.html">Granting
     * permissions for S3 Batch Operations</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </dd>
     * </dl>
     * <p/>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DescribeJob.html">DescribeJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListJobs.html">ListJobs</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_UpdateJobPriority.html">UpdateJobPriority</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_UpdateJobStatus.html">UpdateJobStatus</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_JobOperation.html">JobOperation</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateJob operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.CreateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateJobResult> createJobAsync(CreateJobRequest createJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateJobRequest, CreateJobResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Creates a Multi-Region Access Point and associates it with the specified buckets. For more information about
     * creating Multi-Region Access Points, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/CreatingMultiRegionAccessPoints.html">Creating
     * Multi-Region Access Points</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * This action will always be routed to the US West (Oregon) Region. For more information about the restrictions
     * around working with Multi-Region Access Points, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiRegionAccessPointRestrictions.html">Multi-Region
     * Access Point restrictions and limitations</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * This request is asynchronous, meaning that you might receive a response before the command has completed. When
     * this request provides a response, it provides a token that you can use to monitor the status of the request with
     * <code>DescribeMultiRegionAccessPointOperation</code>.
     * </p>
     * <p>
     * The following actions are related to <code>CreateMultiRegionAccessPoint</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteMultiRegionAccessPoint.html">
     * DeleteMultiRegionAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DescribeMultiRegionAccessPointOperation.html"
     * >DescribeMultiRegionAccessPointOperation</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetMultiRegionAccessPoint.html">
     * GetMultiRegionAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListMultiRegionAccessPoints.html">
     * ListMultiRegionAccessPoints</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createMultiRegionAccessPointRequest
     * @return A Java Future containing the result of the CreateMultiRegionAccessPoint operation returned by the
     *         service.
     * @sample AWSS3ControlAsync.CreateMultiRegionAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateMultiRegionAccessPoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMultiRegionAccessPointResult> createMultiRegionAccessPointAsync(
            CreateMultiRegionAccessPointRequest createMultiRegionAccessPointRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Creates a Multi-Region Access Point and associates it with the specified buckets. For more information about
     * creating Multi-Region Access Points, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/CreatingMultiRegionAccessPoints.html">Creating
     * Multi-Region Access Points</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * This action will always be routed to the US West (Oregon) Region. For more information about the restrictions
     * around working with Multi-Region Access Points, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiRegionAccessPointRestrictions.html">Multi-Region
     * Access Point restrictions and limitations</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * This request is asynchronous, meaning that you might receive a response before the command has completed. When
     * this request provides a response, it provides a token that you can use to monitor the status of the request with
     * <code>DescribeMultiRegionAccessPointOperation</code>.
     * </p>
     * <p>
     * The following actions are related to <code>CreateMultiRegionAccessPoint</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteMultiRegionAccessPoint.html">
     * DeleteMultiRegionAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DescribeMultiRegionAccessPointOperation.html"
     * >DescribeMultiRegionAccessPointOperation</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetMultiRegionAccessPoint.html">
     * GetMultiRegionAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListMultiRegionAccessPoints.html">
     * ListMultiRegionAccessPoints</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createMultiRegionAccessPointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMultiRegionAccessPoint operation returned by the
     *         service.
     * @sample AWSS3ControlAsyncHandler.CreateMultiRegionAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateMultiRegionAccessPoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMultiRegionAccessPointResult> createMultiRegionAccessPointAsync(
            CreateMultiRegionAccessPointRequest createMultiRegionAccessPointRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMultiRegionAccessPointRequest, CreateMultiRegionAccessPointResult> asyncHandler);

    /**
     * <p>
     * Creates a new S3 Storage Lens group and associates it with the specified Amazon Web Services account ID. An S3
     * Storage Lens group is a custom grouping of objects based on prefix, suffix, object tags, object size, object age,
     * or a combination of these filters. For each Storage Lens group that you’ve created, you can also optionally add
     * Amazon Web Services resource tags. For more information about S3 Storage Lens groups, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage-lens-groups-overview.html">Working with S3
     * Storage Lens groups</a>.
     * </p>
     * <p>
     * To use this operation, you must have the permission to perform the <code>s3:CreateStorageLensGroup</code> action.
     * If you’re trying to create a Storage Lens group with Amazon Web Services resource tags, you must also have
     * permission to perform the <code>s3:TagResource</code> action. For more information about the required Storage
     * Lens Groups permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_iam_permissions.html#storage_lens_groups_permissions"
     * >Setting account permissions to use S3 Storage Lens groups</a>.
     * </p>
     * <p>
     * For information about Storage Lens groups errors, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html#S3LensErrorCodeList">List of Amazon S3
     * Storage Lens error codes</a>.
     * </p>
     * 
     * @param createStorageLensGroupRequest
     * @return A Java Future containing the result of the CreateStorageLensGroup operation returned by the service.
     * @sample AWSS3ControlAsync.CreateStorageLensGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateStorageLensGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateStorageLensGroupResult> createStorageLensGroupAsync(CreateStorageLensGroupRequest createStorageLensGroupRequest);

    /**
     * <p>
     * Creates a new S3 Storage Lens group and associates it with the specified Amazon Web Services account ID. An S3
     * Storage Lens group is a custom grouping of objects based on prefix, suffix, object tags, object size, object age,
     * or a combination of these filters. For each Storage Lens group that you’ve created, you can also optionally add
     * Amazon Web Services resource tags. For more information about S3 Storage Lens groups, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage-lens-groups-overview.html">Working with S3
     * Storage Lens groups</a>.
     * </p>
     * <p>
     * To use this operation, you must have the permission to perform the <code>s3:CreateStorageLensGroup</code> action.
     * If you’re trying to create a Storage Lens group with Amazon Web Services resource tags, you must also have
     * permission to perform the <code>s3:TagResource</code> action. For more information about the required Storage
     * Lens Groups permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_iam_permissions.html#storage_lens_groups_permissions"
     * >Setting account permissions to use S3 Storage Lens groups</a>.
     * </p>
     * <p>
     * For information about Storage Lens groups errors, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html#S3LensErrorCodeList">List of Amazon S3
     * Storage Lens error codes</a>.
     * </p>
     * 
     * @param createStorageLensGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateStorageLensGroup operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.CreateStorageLensGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateStorageLensGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateStorageLensGroupResult> createStorageLensGroupAsync(CreateStorageLensGroupRequest createStorageLensGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStorageLensGroupRequest, CreateStorageLensGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes the access grant from the S3 Access Grants instance. You cannot undo an access grant deletion and the
     * grantee will no longer have access to the S3 data.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:DeleteAccessGrant</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param deleteAccessGrantRequest
     * @return A Java Future containing the result of the DeleteAccessGrant operation returned by the service.
     * @sample AWSS3ControlAsync.DeleteAccessGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteAccessGrant" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessGrantResult> deleteAccessGrantAsync(DeleteAccessGrantRequest deleteAccessGrantRequest);

    /**
     * <p>
     * Deletes the access grant from the S3 Access Grants instance. You cannot undo an access grant deletion and the
     * grantee will no longer have access to the S3 data.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:DeleteAccessGrant</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param deleteAccessGrantRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAccessGrant operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.DeleteAccessGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteAccessGrant" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessGrantResult> deleteAccessGrantAsync(DeleteAccessGrantRequest deleteAccessGrantRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAccessGrantRequest, DeleteAccessGrantResult> asyncHandler);

    /**
     * <p>
     * Deletes your S3 Access Grants instance. You must first delete the access grants and locations before S3 Access
     * Grants can delete the instance. See <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessGrant.html">DeleteAccessGrant</a>
     * and <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessGrantsLocation.html">
     * DeleteAccessGrantsLocation</a>. If you have associated an IAM Identity Center instance with your S3 Access Grants
     * instance, you must first dissassociate the Identity Center instance from the S3 Access Grants instance before you
     * can delete the S3 Access Grants instance. See <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_AssociateAccessGrantsIdentityCenter.html"
     * >AssociateAccessGrantsIdentityCenter</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DissociateAccessGrantsIdentityCenter.html"
     * >DissociateAccessGrantsIdentityCenter</a>.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:DeleteAccessGrantsInstance</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param deleteAccessGrantsInstanceRequest
     * @return A Java Future containing the result of the DeleteAccessGrantsInstance operation returned by the service.
     * @sample AWSS3ControlAsync.DeleteAccessGrantsInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteAccessGrantsInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessGrantsInstanceResult> deleteAccessGrantsInstanceAsync(
            DeleteAccessGrantsInstanceRequest deleteAccessGrantsInstanceRequest);

    /**
     * <p>
     * Deletes your S3 Access Grants instance. You must first delete the access grants and locations before S3 Access
     * Grants can delete the instance. See <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessGrant.html">DeleteAccessGrant</a>
     * and <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessGrantsLocation.html">
     * DeleteAccessGrantsLocation</a>. If you have associated an IAM Identity Center instance with your S3 Access Grants
     * instance, you must first dissassociate the Identity Center instance from the S3 Access Grants instance before you
     * can delete the S3 Access Grants instance. See <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_AssociateAccessGrantsIdentityCenter.html"
     * >AssociateAccessGrantsIdentityCenter</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DissociateAccessGrantsIdentityCenter.html"
     * >DissociateAccessGrantsIdentityCenter</a>.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:DeleteAccessGrantsInstance</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param deleteAccessGrantsInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAccessGrantsInstance operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.DeleteAccessGrantsInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteAccessGrantsInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessGrantsInstanceResult> deleteAccessGrantsInstanceAsync(
            DeleteAccessGrantsInstanceRequest deleteAccessGrantsInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAccessGrantsInstanceRequest, DeleteAccessGrantsInstanceResult> asyncHandler);

    /**
     * <p>
     * Deletes the resource policy of the S3 Access Grants instance. The resource policy is used to manage cross-account
     * access to your S3 Access Grants instance. By deleting the resource policy, you delete any cross-account
     * permissions to your S3 Access Grants instance.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:DeleteAccessGrantsInstanceResourcePolicy</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param deleteAccessGrantsInstanceResourcePolicyRequest
     * @return A Java Future containing the result of the DeleteAccessGrantsInstanceResourcePolicy operation returned by
     *         the service.
     * @sample AWSS3ControlAsync.DeleteAccessGrantsInstanceResourcePolicy
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteAccessGrantsInstanceResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessGrantsInstanceResourcePolicyResult> deleteAccessGrantsInstanceResourcePolicyAsync(
            DeleteAccessGrantsInstanceResourcePolicyRequest deleteAccessGrantsInstanceResourcePolicyRequest);

    /**
     * <p>
     * Deletes the resource policy of the S3 Access Grants instance. The resource policy is used to manage cross-account
     * access to your S3 Access Grants instance. By deleting the resource policy, you delete any cross-account
     * permissions to your S3 Access Grants instance.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:DeleteAccessGrantsInstanceResourcePolicy</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param deleteAccessGrantsInstanceResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAccessGrantsInstanceResourcePolicy operation returned by
     *         the service.
     * @sample AWSS3ControlAsyncHandler.DeleteAccessGrantsInstanceResourcePolicy
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteAccessGrantsInstanceResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessGrantsInstanceResourcePolicyResult> deleteAccessGrantsInstanceResourcePolicyAsync(
            DeleteAccessGrantsInstanceResourcePolicyRequest deleteAccessGrantsInstanceResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAccessGrantsInstanceResourcePolicyRequest, DeleteAccessGrantsInstanceResourcePolicyResult> asyncHandler);

    /**
     * <p>
     * Deregisters a location from your S3 Access Grants instance. You can only delete a location registration from an
     * S3 Access Grants instance if there are no grants associated with this location. See <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessGrant.html">Delete a grant</a> for
     * information on how to delete grants. You need to have at least one registered location in your S3 Access Grants
     * instance in order to create access grants.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:DeleteAccessGrantsLocation</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param deleteAccessGrantsLocationRequest
     * @return A Java Future containing the result of the DeleteAccessGrantsLocation operation returned by the service.
     * @sample AWSS3ControlAsync.DeleteAccessGrantsLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteAccessGrantsLocation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessGrantsLocationResult> deleteAccessGrantsLocationAsync(
            DeleteAccessGrantsLocationRequest deleteAccessGrantsLocationRequest);

    /**
     * <p>
     * Deregisters a location from your S3 Access Grants instance. You can only delete a location registration from an
     * S3 Access Grants instance if there are no grants associated with this location. See <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessGrant.html">Delete a grant</a> for
     * information on how to delete grants. You need to have at least one registered location in your S3 Access Grants
     * instance in order to create access grants.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:DeleteAccessGrantsLocation</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param deleteAccessGrantsLocationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAccessGrantsLocation operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.DeleteAccessGrantsLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteAccessGrantsLocation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessGrantsLocationResult> deleteAccessGrantsLocationAsync(
            DeleteAccessGrantsLocationRequest deleteAccessGrantsLocationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAccessGrantsLocationRequest, DeleteAccessGrantsLocationResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Deletes the specified access point.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPoint.html#API_control_DeleteAccessPoint_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>DeleteAccessPoint</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessPoint.html">CreateAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPoint.html">GetAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListAccessPoints.html">ListAccessPoints</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteAccessPointRequest
     * @return A Java Future containing the result of the DeleteAccessPoint operation returned by the service.
     * @sample AWSS3ControlAsync.DeleteAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteAccessPoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessPointResult> deleteAccessPointAsync(DeleteAccessPointRequest deleteAccessPointRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Deletes the specified access point.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPoint.html#API_control_DeleteAccessPoint_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>DeleteAccessPoint</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessPoint.html">CreateAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPoint.html">GetAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListAccessPoints.html">ListAccessPoints</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteAccessPointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAccessPoint operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.DeleteAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteAccessPoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessPointResult> deleteAccessPointAsync(DeleteAccessPointRequest deleteAccessPointRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAccessPointRequest, DeleteAccessPointResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Deletes the specified Object Lambda Access Point.
     * </p>
     * <p>
     * The following actions are related to <code>DeleteAccessPointForObjectLambda</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessPointForObjectLambda.html">
     * CreateAccessPointForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPointForObjectLambda.html">
     * GetAccessPointForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListAccessPointsForObjectLambda.html">
     * ListAccessPointsForObjectLambda</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteAccessPointForObjectLambdaRequest
     * @return A Java Future containing the result of the DeleteAccessPointForObjectLambda operation returned by the
     *         service.
     * @sample AWSS3ControlAsync.DeleteAccessPointForObjectLambda
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteAccessPointForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessPointForObjectLambdaResult> deleteAccessPointForObjectLambdaAsync(
            DeleteAccessPointForObjectLambdaRequest deleteAccessPointForObjectLambdaRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Deletes the specified Object Lambda Access Point.
     * </p>
     * <p>
     * The following actions are related to <code>DeleteAccessPointForObjectLambda</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessPointForObjectLambda.html">
     * CreateAccessPointForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPointForObjectLambda.html">
     * GetAccessPointForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListAccessPointsForObjectLambda.html">
     * ListAccessPointsForObjectLambda</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteAccessPointForObjectLambdaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAccessPointForObjectLambda operation returned by the
     *         service.
     * @sample AWSS3ControlAsyncHandler.DeleteAccessPointForObjectLambda
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteAccessPointForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessPointForObjectLambdaResult> deleteAccessPointForObjectLambdaAsync(
            DeleteAccessPointForObjectLambdaRequest deleteAccessPointForObjectLambdaRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAccessPointForObjectLambdaRequest, DeleteAccessPointForObjectLambdaResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Deletes the access point policy for the specified access point.
     * </p>
     * <p/>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPointPolicy.html#API_control_DeleteAccessPointPolicy_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>DeleteAccessPointPolicy</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutAccessPointPolicy.html">
     * PutAccessPointPolicy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPointPolicy.html">
     * GetAccessPointPolicy</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteAccessPointPolicyRequest
     * @return A Java Future containing the result of the DeleteAccessPointPolicy operation returned by the service.
     * @sample AWSS3ControlAsync.DeleteAccessPointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteAccessPointPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessPointPolicyResult> deleteAccessPointPolicyAsync(DeleteAccessPointPolicyRequest deleteAccessPointPolicyRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Deletes the access point policy for the specified access point.
     * </p>
     * <p/>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPointPolicy.html#API_control_DeleteAccessPointPolicy_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>DeleteAccessPointPolicy</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutAccessPointPolicy.html">
     * PutAccessPointPolicy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPointPolicy.html">
     * GetAccessPointPolicy</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteAccessPointPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAccessPointPolicy operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.DeleteAccessPointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteAccessPointPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessPointPolicyResult> deleteAccessPointPolicyAsync(DeleteAccessPointPolicyRequest deleteAccessPointPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAccessPointPolicyRequest, DeleteAccessPointPolicyResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Removes the resource policy for an Object Lambda Access Point.
     * </p>
     * <p>
     * The following actions are related to <code>DeleteAccessPointPolicyForObjectLambda</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPointPolicyForObjectLambda.html">
     * GetAccessPointPolicyForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutAccessPointPolicyForObjectLambda.html">
     * PutAccessPointPolicyForObjectLambda</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteAccessPointPolicyForObjectLambdaRequest
     * @return A Java Future containing the result of the DeleteAccessPointPolicyForObjectLambda operation returned by
     *         the service.
     * @sample AWSS3ControlAsync.DeleteAccessPointPolicyForObjectLambda
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteAccessPointPolicyForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessPointPolicyForObjectLambdaResult> deleteAccessPointPolicyForObjectLambdaAsync(
            DeleteAccessPointPolicyForObjectLambdaRequest deleteAccessPointPolicyForObjectLambdaRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Removes the resource policy for an Object Lambda Access Point.
     * </p>
     * <p>
     * The following actions are related to <code>DeleteAccessPointPolicyForObjectLambda</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPointPolicyForObjectLambda.html">
     * GetAccessPointPolicyForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutAccessPointPolicyForObjectLambda.html">
     * PutAccessPointPolicyForObjectLambda</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteAccessPointPolicyForObjectLambdaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAccessPointPolicyForObjectLambda operation returned by
     *         the service.
     * @sample AWSS3ControlAsyncHandler.DeleteAccessPointPolicyForObjectLambda
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteAccessPointPolicyForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAccessPointPolicyForObjectLambdaResult> deleteAccessPointPolicyForObjectLambdaAsync(
            DeleteAccessPointPolicyForObjectLambdaRequest deleteAccessPointPolicyForObjectLambdaRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAccessPointPolicyForObjectLambdaRequest, DeleteAccessPointPolicyForObjectLambdaResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This action deletes an Amazon S3 on Outposts bucket. To delete an S3 bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucket.html">DeleteBucket</a> in the <i>Amazon S3
     * API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Deletes the Amazon S3 on Outposts bucket. All objects (including all object versions and delete markers) in the
     * bucket must be deleted before the bucket itself can be deleted. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a> in
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucket.html#API_control_DeleteBucket_Examples"
     * >Examples</a> section.
     * </p>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateBucket.html">CreateBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucket.html">GetBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObject.html">DeleteObject</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteBucketRequest
     * @return A Java Future containing the result of the DeleteBucket operation returned by the service.
     * @sample AWSS3ControlAsync.DeleteBucket
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteBucket" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBucketResult> deleteBucketAsync(DeleteBucketRequest deleteBucketRequest);

    /**
     * <note>
     * <p>
     * This action deletes an Amazon S3 on Outposts bucket. To delete an S3 bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucket.html">DeleteBucket</a> in the <i>Amazon S3
     * API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Deletes the Amazon S3 on Outposts bucket. All objects (including all object versions and delete markers) in the
     * bucket must be deleted before the bucket itself can be deleted. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a> in
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucket.html#API_control_DeleteBucket_Examples"
     * >Examples</a> section.
     * </p>
     * <p class="title">
     * <b>Related Resources</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateBucket.html">CreateBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucket.html">GetBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteObject.html">DeleteObject</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteBucketRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBucket operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.DeleteBucket
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteBucket" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBucketResult> deleteBucketAsync(DeleteBucketRequest deleteBucketRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBucketRequest, DeleteBucketResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This action deletes an Amazon S3 on Outposts bucket's lifecycle configuration. To delete an S3 bucket's lifecycle
     * configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketLifecycle.html">DeleteBucketLifecycle</a>
     * in the <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Deletes the lifecycle configuration from the specified Outposts bucket. Amazon S3 on Outposts removes all the
     * lifecycle configuration rules in the lifecycle subresource associated with the bucket. Your objects never expire,
     * and Amazon S3 on Outposts no longer automatically deletes any objects on the basis of rules contained in the
     * deleted lifecycle configuration. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a> in
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * To use this operation, you must have permission to perform the <code>s3-outposts:PutLifecycleConfiguration</code>
     * action. By default, the bucket owner has this permission and the Outposts bucket owner can grant this permission
     * to others.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketLifecycleConfiguration.html#API_control_DeleteBucketLifecycleConfiguration_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * For more information about object expiration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#intro-lifecycle-rules-actions"
     * >Elements to Describe Lifecycle Actions</a>.
     * </p>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketLifecycleConfiguration.html">
     * PutBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketLifecycleConfiguration.html">
     * GetBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteBucketLifecycleConfigurationRequest
     * @return A Java Future containing the result of the DeleteBucketLifecycleConfiguration operation returned by the
     *         service.
     * @sample AWSS3ControlAsync.DeleteBucketLifecycleConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteBucketLifecycleConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBucketLifecycleConfigurationResult> deleteBucketLifecycleConfigurationAsync(
            DeleteBucketLifecycleConfigurationRequest deleteBucketLifecycleConfigurationRequest);

    /**
     * <note>
     * <p>
     * This action deletes an Amazon S3 on Outposts bucket's lifecycle configuration. To delete an S3 bucket's lifecycle
     * configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketLifecycle.html">DeleteBucketLifecycle</a>
     * in the <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Deletes the lifecycle configuration from the specified Outposts bucket. Amazon S3 on Outposts removes all the
     * lifecycle configuration rules in the lifecycle subresource associated with the bucket. Your objects never expire,
     * and Amazon S3 on Outposts no longer automatically deletes any objects on the basis of rules contained in the
     * deleted lifecycle configuration. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a> in
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * To use this operation, you must have permission to perform the <code>s3-outposts:PutLifecycleConfiguration</code>
     * action. By default, the bucket owner has this permission and the Outposts bucket owner can grant this permission
     * to others.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketLifecycleConfiguration.html#API_control_DeleteBucketLifecycleConfiguration_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * For more information about object expiration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#intro-lifecycle-rules-actions"
     * >Elements to Describe Lifecycle Actions</a>.
     * </p>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketLifecycleConfiguration.html">
     * PutBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketLifecycleConfiguration.html">
     * GetBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteBucketLifecycleConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBucketLifecycleConfiguration operation returned by the
     *         service.
     * @sample AWSS3ControlAsyncHandler.DeleteBucketLifecycleConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteBucketLifecycleConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBucketLifecycleConfigurationResult> deleteBucketLifecycleConfigurationAsync(
            DeleteBucketLifecycleConfigurationRequest deleteBucketLifecycleConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBucketLifecycleConfigurationRequest, DeleteBucketLifecycleConfigurationResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This action deletes an Amazon S3 on Outposts bucket policy. To delete an S3 bucket policy, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketPolicy.html">DeleteBucketPolicy</a> in the
     * <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * This implementation of the DELETE action uses the policy subresource to delete the policy of a specified Amazon
     * S3 on Outposts bucket. If you are using an identity other than the root user of the Amazon Web Services account
     * that owns the bucket, the calling identity must have the <code>s3-outposts:DeleteBucketPolicy</code> permissions
     * on the specified Outposts bucket and belong to the bucket owner's account to use this action. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon
     * S3 on Outposts</a> in <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * If you don't have <code>DeleteBucketPolicy</code> permissions, Amazon S3 returns a <code>403 Access Denied</code>
     * error. If you have the correct permissions, but you're not using an identity that belongs to the bucket owner's
     * account, Amazon S3 returns a <code>405 Method Not Allowed</code> error.
     * </p>
     * <important>
     * <p>
     * As a security precaution, the root user of the Amazon Web Services account that owns a bucket can always use this
     * action, even if the policy explicitly denies the root user the ability to perform this action.
     * </p>
     * </important>
     * <p>
     * For more information about bucket policies, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-iam-policies.html">Using Bucket Policies and User
     * Policies</a>.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketPolicy.html#API_control_DeleteBucketPolicy_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>DeleteBucketPolicy</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketPolicy.html">GetBucketPolicy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketPolicy.html">PutBucketPolicy</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteBucketPolicyRequest
     * @return A Java Future containing the result of the DeleteBucketPolicy operation returned by the service.
     * @sample AWSS3ControlAsync.DeleteBucketPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteBucketPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBucketPolicyResult> deleteBucketPolicyAsync(DeleteBucketPolicyRequest deleteBucketPolicyRequest);

    /**
     * <note>
     * <p>
     * This action deletes an Amazon S3 on Outposts bucket policy. To delete an S3 bucket policy, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketPolicy.html">DeleteBucketPolicy</a> in the
     * <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * This implementation of the DELETE action uses the policy subresource to delete the policy of a specified Amazon
     * S3 on Outposts bucket. If you are using an identity other than the root user of the Amazon Web Services account
     * that owns the bucket, the calling identity must have the <code>s3-outposts:DeleteBucketPolicy</code> permissions
     * on the specified Outposts bucket and belong to the bucket owner's account to use this action. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon
     * S3 on Outposts</a> in <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * If you don't have <code>DeleteBucketPolicy</code> permissions, Amazon S3 returns a <code>403 Access Denied</code>
     * error. If you have the correct permissions, but you're not using an identity that belongs to the bucket owner's
     * account, Amazon S3 returns a <code>405 Method Not Allowed</code> error.
     * </p>
     * <important>
     * <p>
     * As a security precaution, the root user of the Amazon Web Services account that owns a bucket can always use this
     * action, even if the policy explicitly denies the root user the ability to perform this action.
     * </p>
     * </important>
     * <p>
     * For more information about bucket policies, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-iam-policies.html">Using Bucket Policies and User
     * Policies</a>.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketPolicy.html#API_control_DeleteBucketPolicy_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>DeleteBucketPolicy</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketPolicy.html">GetBucketPolicy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketPolicy.html">PutBucketPolicy</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteBucketPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBucketPolicy operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.DeleteBucketPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteBucketPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBucketPolicyResult> deleteBucketPolicyAsync(DeleteBucketPolicyRequest deleteBucketPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBucketPolicyRequest, DeleteBucketPolicyResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation deletes an Amazon S3 on Outposts bucket's replication configuration. To delete an S3 bucket's
     * replication configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketReplication.html"
     * >DeleteBucketReplication</a> in the <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Deletes the replication configuration from the specified S3 on Outposts bucket.
     * </p>
     * <p>
     * To use this operation, you must have permissions to perform the
     * <code>s3-outposts:PutReplicationConfiguration</code> action. The Outposts bucket owner has this permission by
     * default and can grant it to others. For more information about permissions, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsIAM.html">Setting up IAM with S3 on
     * Outposts</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsBucketPolicy.html">Managing access to S3 on
     * Outposts buckets</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * It can take a while to propagate <code>PUT</code> or <code>DELETE</code> requests for a replication configuration
     * to all S3 on Outposts systems. Therefore, the replication configuration that's returned by a <code>GET</code>
     * request soon after a <code>PUT</code> or <code>DELETE</code> request might return a more recent result than
     * what's on the Outpost. If an Outpost is offline, the delay in updating the replication configuration on that
     * Outpost can be significant.
     * </p>
     * </note>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketReplication.html#API_control_DeleteBucketReplication_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * For information about S3 replication on Outposts configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsReplication.html">Replicating objects for
     * S3 on Outposts</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * The following operations are related to <code>DeleteBucketReplication</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketReplication.html">
     * PutBucketReplication</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketReplication.html">
     * GetBucketReplication</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteBucketReplicationRequest
     * @return A Java Future containing the result of the DeleteBucketReplication operation returned by the service.
     * @sample AWSS3ControlAsync.DeleteBucketReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteBucketReplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBucketReplicationResult> deleteBucketReplicationAsync(DeleteBucketReplicationRequest deleteBucketReplicationRequest);

    /**
     * <note>
     * <p>
     * This operation deletes an Amazon S3 on Outposts bucket's replication configuration. To delete an S3 bucket's
     * replication configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketReplication.html"
     * >DeleteBucketReplication</a> in the <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Deletes the replication configuration from the specified S3 on Outposts bucket.
     * </p>
     * <p>
     * To use this operation, you must have permissions to perform the
     * <code>s3-outposts:PutReplicationConfiguration</code> action. The Outposts bucket owner has this permission by
     * default and can grant it to others. For more information about permissions, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsIAM.html">Setting up IAM with S3 on
     * Outposts</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsBucketPolicy.html">Managing access to S3 on
     * Outposts buckets</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * It can take a while to propagate <code>PUT</code> or <code>DELETE</code> requests for a replication configuration
     * to all S3 on Outposts systems. Therefore, the replication configuration that's returned by a <code>GET</code>
     * request soon after a <code>PUT</code> or <code>DELETE</code> request might return a more recent result than
     * what's on the Outpost. If an Outpost is offline, the delay in updating the replication configuration on that
     * Outpost can be significant.
     * </p>
     * </note>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketReplication.html#API_control_DeleteBucketReplication_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * For information about S3 replication on Outposts configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsReplication.html">Replicating objects for
     * S3 on Outposts</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * The following operations are related to <code>DeleteBucketReplication</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketReplication.html">
     * PutBucketReplication</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketReplication.html">
     * GetBucketReplication</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteBucketReplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBucketReplication operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.DeleteBucketReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteBucketReplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBucketReplicationResult> deleteBucketReplicationAsync(DeleteBucketReplicationRequest deleteBucketReplicationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBucketReplicationRequest, DeleteBucketReplicationResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This action deletes an Amazon S3 on Outposts bucket's tags. To delete an S3 bucket tags, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketTagging.html">DeleteBucketTagging</a> in
     * the <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Deletes the tags from the Outposts bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a> in
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * To use this action, you must have permission to perform the <code>PutBucketTagging</code> action. By default, the
     * bucket owner has this permission and can grant this permission to others.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketTagging.html#API_control_DeleteBucketTagging_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>DeleteBucketTagging</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketTagging.html">GetBucketTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketTagging.html">PutBucketTagging</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteBucketTaggingRequest
     * @return A Java Future containing the result of the DeleteBucketTagging operation returned by the service.
     * @sample AWSS3ControlAsync.DeleteBucketTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteBucketTagging" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBucketTaggingResult> deleteBucketTaggingAsync(DeleteBucketTaggingRequest deleteBucketTaggingRequest);

    /**
     * <note>
     * <p>
     * This action deletes an Amazon S3 on Outposts bucket's tags. To delete an S3 bucket tags, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_DeleteBucketTagging.html">DeleteBucketTagging</a> in
     * the <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Deletes the tags from the Outposts bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a> in
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * To use this action, you must have permission to perform the <code>PutBucketTagging</code> action. By default, the
     * bucket owner has this permission and can grant this permission to others.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketTagging.html#API_control_DeleteBucketTagging_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>DeleteBucketTagging</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketTagging.html">GetBucketTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketTagging.html">PutBucketTagging</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteBucketTaggingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBucketTagging operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.DeleteBucketTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteBucketTagging" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBucketTaggingResult> deleteBucketTaggingAsync(DeleteBucketTaggingRequest deleteBucketTaggingRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBucketTaggingRequest, DeleteBucketTaggingResult> asyncHandler);

    /**
     * <p>
     * Removes the entire tag set from the specified S3 Batch Operations job.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * To use the <code>DeleteJobTagging</code> operation, you must have permission to perform the
     * <code>s3:DeleteJobTagging</code> action. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-managing-jobs.html#batch-ops-job-tags"
     * >Controlling access and labeling jobs using tags</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateJob.html">CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetJobTagging.html">GetJobTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutJobTagging.html">PutJobTagging</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteJobTaggingRequest
     * @return A Java Future containing the result of the DeleteJobTagging operation returned by the service.
     * @sample AWSS3ControlAsync.DeleteJobTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteJobTagging" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteJobTaggingResult> deleteJobTaggingAsync(DeleteJobTaggingRequest deleteJobTaggingRequest);

    /**
     * <p>
     * Removes the entire tag set from the specified S3 Batch Operations job.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * To use the <code>DeleteJobTagging</code> operation, you must have permission to perform the
     * <code>s3:DeleteJobTagging</code> action. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-managing-jobs.html#batch-ops-job-tags"
     * >Controlling access and labeling jobs using tags</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateJob.html">CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetJobTagging.html">GetJobTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutJobTagging.html">PutJobTagging</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteJobTaggingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteJobTagging operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.DeleteJobTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteJobTagging" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteJobTaggingResult> deleteJobTaggingAsync(DeleteJobTaggingRequest deleteJobTaggingRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteJobTaggingRequest, DeleteJobTaggingResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Deletes a Multi-Region Access Point. This action does not delete the buckets associated with the Multi-Region
     * Access Point, only the Multi-Region Access Point itself.
     * </p>
     * <p>
     * This action will always be routed to the US West (Oregon) Region. For more information about the restrictions
     * around working with Multi-Region Access Points, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiRegionAccessPointRestrictions.html">Multi-Region
     * Access Point restrictions and limitations</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * This request is asynchronous, meaning that you might receive a response before the command has completed. When
     * this request provides a response, it provides a token that you can use to monitor the status of the request with
     * <code>DescribeMultiRegionAccessPointOperation</code>.
     * </p>
     * <p>
     * The following actions are related to <code>DeleteMultiRegionAccessPoint</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateMultiRegionAccessPoint.html">
     * CreateMultiRegionAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DescribeMultiRegionAccessPointOperation.html"
     * >DescribeMultiRegionAccessPointOperation</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetMultiRegionAccessPoint.html">
     * GetMultiRegionAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListMultiRegionAccessPoints.html">
     * ListMultiRegionAccessPoints</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteMultiRegionAccessPointRequest
     * @return A Java Future containing the result of the DeleteMultiRegionAccessPoint operation returned by the
     *         service.
     * @sample AWSS3ControlAsync.DeleteMultiRegionAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteMultiRegionAccessPoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMultiRegionAccessPointResult> deleteMultiRegionAccessPointAsync(
            DeleteMultiRegionAccessPointRequest deleteMultiRegionAccessPointRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Deletes a Multi-Region Access Point. This action does not delete the buckets associated with the Multi-Region
     * Access Point, only the Multi-Region Access Point itself.
     * </p>
     * <p>
     * This action will always be routed to the US West (Oregon) Region. For more information about the restrictions
     * around working with Multi-Region Access Points, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiRegionAccessPointRestrictions.html">Multi-Region
     * Access Point restrictions and limitations</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * This request is asynchronous, meaning that you might receive a response before the command has completed. When
     * this request provides a response, it provides a token that you can use to monitor the status of the request with
     * <code>DescribeMultiRegionAccessPointOperation</code>.
     * </p>
     * <p>
     * The following actions are related to <code>DeleteMultiRegionAccessPoint</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateMultiRegionAccessPoint.html">
     * CreateMultiRegionAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DescribeMultiRegionAccessPointOperation.html"
     * >DescribeMultiRegionAccessPointOperation</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetMultiRegionAccessPoint.html">
     * GetMultiRegionAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListMultiRegionAccessPoints.html">
     * ListMultiRegionAccessPoints</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteMultiRegionAccessPointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMultiRegionAccessPoint operation returned by the
     *         service.
     * @sample AWSS3ControlAsyncHandler.DeleteMultiRegionAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteMultiRegionAccessPoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMultiRegionAccessPointResult> deleteMultiRegionAccessPointAsync(
            DeleteMultiRegionAccessPointRequest deleteMultiRegionAccessPointRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMultiRegionAccessPointRequest, DeleteMultiRegionAccessPointResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Removes the <code>PublicAccessBlock</code> configuration for an Amazon Web Services account. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html"> Using Amazon S3
     * block public access</a>.
     * </p>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetPublicAccessBlock.html">
     * GetPublicAccessBlock</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutPublicAccessBlock.html">
     * PutPublicAccessBlock</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deletePublicAccessBlockRequest
     * @return A Java Future containing the result of the DeletePublicAccessBlock operation returned by the service.
     * @sample AWSS3ControlAsync.DeletePublicAccessBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeletePublicAccessBlock"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePublicAccessBlockResult> deletePublicAccessBlockAsync(DeletePublicAccessBlockRequest deletePublicAccessBlockRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Removes the <code>PublicAccessBlock</code> configuration for an Amazon Web Services account. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html"> Using Amazon S3
     * block public access</a>.
     * </p>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetPublicAccessBlock.html">
     * GetPublicAccessBlock</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutPublicAccessBlock.html">
     * PutPublicAccessBlock</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deletePublicAccessBlockRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePublicAccessBlock operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.DeletePublicAccessBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeletePublicAccessBlock"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePublicAccessBlockResult> deletePublicAccessBlockAsync(DeletePublicAccessBlockRequest deletePublicAccessBlockRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePublicAccessBlockRequest, DeletePublicAccessBlockResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Deletes the Amazon S3 Storage Lens configuration. For more information about S3 Storage Lens, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens.html">Assessing your storage activity and
     * usage with Amazon S3 Storage Lens </a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * To use this action, you must have permission to perform the <code>s3:DeleteStorageLensConfiguration</code>
     * action. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens_iam_permissions.html">Setting permissions to
     * use Amazon S3 Storage Lens</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </note>
     * 
     * @param deleteStorageLensConfigurationRequest
     * @return A Java Future containing the result of the DeleteStorageLensConfiguration operation returned by the
     *         service.
     * @sample AWSS3ControlAsync.DeleteStorageLensConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteStorageLensConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteStorageLensConfigurationResult> deleteStorageLensConfigurationAsync(
            DeleteStorageLensConfigurationRequest deleteStorageLensConfigurationRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Deletes the Amazon S3 Storage Lens configuration. For more information about S3 Storage Lens, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens.html">Assessing your storage activity and
     * usage with Amazon S3 Storage Lens </a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * To use this action, you must have permission to perform the <code>s3:DeleteStorageLensConfiguration</code>
     * action. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens_iam_permissions.html">Setting permissions to
     * use Amazon S3 Storage Lens</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </note>
     * 
     * @param deleteStorageLensConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteStorageLensConfiguration operation returned by the
     *         service.
     * @sample AWSS3ControlAsyncHandler.DeleteStorageLensConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteStorageLensConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteStorageLensConfigurationResult> deleteStorageLensConfigurationAsync(
            DeleteStorageLensConfigurationRequest deleteStorageLensConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteStorageLensConfigurationRequest, DeleteStorageLensConfigurationResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Deletes the Amazon S3 Storage Lens configuration tags. For more information about S3 Storage Lens, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens.html">Assessing your storage activity and
     * usage with Amazon S3 Storage Lens </a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * To use this action, you must have permission to perform the <code>s3:DeleteStorageLensConfigurationTagging</code>
     * action. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens_iam_permissions.html">Setting permissions to
     * use Amazon S3 Storage Lens</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </note>
     * 
     * @param deleteStorageLensConfigurationTaggingRequest
     * @return A Java Future containing the result of the DeleteStorageLensConfigurationTagging operation returned by
     *         the service.
     * @sample AWSS3ControlAsync.DeleteStorageLensConfigurationTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteStorageLensConfigurationTagging"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteStorageLensConfigurationTaggingResult> deleteStorageLensConfigurationTaggingAsync(
            DeleteStorageLensConfigurationTaggingRequest deleteStorageLensConfigurationTaggingRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Deletes the Amazon S3 Storage Lens configuration tags. For more information about S3 Storage Lens, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens.html">Assessing your storage activity and
     * usage with Amazon S3 Storage Lens </a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * To use this action, you must have permission to perform the <code>s3:DeleteStorageLensConfigurationTagging</code>
     * action. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens_iam_permissions.html">Setting permissions to
     * use Amazon S3 Storage Lens</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </note>
     * 
     * @param deleteStorageLensConfigurationTaggingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteStorageLensConfigurationTagging operation returned by
     *         the service.
     * @sample AWSS3ControlAsyncHandler.DeleteStorageLensConfigurationTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteStorageLensConfigurationTagging"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteStorageLensConfigurationTaggingResult> deleteStorageLensConfigurationTaggingAsync(
            DeleteStorageLensConfigurationTaggingRequest deleteStorageLensConfigurationTaggingRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteStorageLensConfigurationTaggingRequest, DeleteStorageLensConfigurationTaggingResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing S3 Storage Lens group.
     * </p>
     * <p>
     * To use this operation, you must have the permission to perform the <code>s3:DeleteStorageLensGroup</code> action.
     * For more information about the required Storage Lens Groups permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_iam_permissions.html#storage_lens_groups_permissions"
     * >Setting account permissions to use S3 Storage Lens groups</a>.
     * </p>
     * <p>
     * For information about Storage Lens groups errors, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html#S3LensErrorCodeList">List of Amazon S3
     * Storage Lens error codes</a>.
     * </p>
     * 
     * @param deleteStorageLensGroupRequest
     * @return A Java Future containing the result of the DeleteStorageLensGroup operation returned by the service.
     * @sample AWSS3ControlAsync.DeleteStorageLensGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteStorageLensGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteStorageLensGroupResult> deleteStorageLensGroupAsync(DeleteStorageLensGroupRequest deleteStorageLensGroupRequest);

    /**
     * <p>
     * Deletes an existing S3 Storage Lens group.
     * </p>
     * <p>
     * To use this operation, you must have the permission to perform the <code>s3:DeleteStorageLensGroup</code> action.
     * For more information about the required Storage Lens Groups permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_iam_permissions.html#storage_lens_groups_permissions"
     * >Setting account permissions to use S3 Storage Lens groups</a>.
     * </p>
     * <p>
     * For information about Storage Lens groups errors, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html#S3LensErrorCodeList">List of Amazon S3
     * Storage Lens error codes</a>.
     * </p>
     * 
     * @param deleteStorageLensGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteStorageLensGroup operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.DeleteStorageLensGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteStorageLensGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteStorageLensGroupResult> deleteStorageLensGroupAsync(DeleteStorageLensGroupRequest deleteStorageLensGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteStorageLensGroupRequest, DeleteStorageLensGroupResult> asyncHandler);

    /**
     * <p>
     * Retrieves the configuration parameters and status for a Batch Operations job. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/batch-ops.html">S3 Batch Operations</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * To use the <code>DescribeJob</code> operation, you must have permission to perform the
     * <code>s3:DescribeJob</code> action.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateJob.html">CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListJobs.html">ListJobs</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_UpdateJobPriority.html">UpdateJobPriority</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_UpdateJobStatus.html">UpdateJobStatus</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeJobRequest
     * @return A Java Future containing the result of the DescribeJob operation returned by the service.
     * @sample AWSS3ControlAsync.DescribeJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DescribeJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeJobResult> describeJobAsync(DescribeJobRequest describeJobRequest);

    /**
     * <p>
     * Retrieves the configuration parameters and status for a Batch Operations job. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/batch-ops.html">S3 Batch Operations</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * To use the <code>DescribeJob</code> operation, you must have permission to perform the
     * <code>s3:DescribeJob</code> action.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateJob.html">CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListJobs.html">ListJobs</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_UpdateJobPriority.html">UpdateJobPriority</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_UpdateJobStatus.html">UpdateJobStatus</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeJob operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.DescribeJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DescribeJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeJobResult> describeJobAsync(DescribeJobRequest describeJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeJobRequest, DescribeJobResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Retrieves the status of an asynchronous request to manage a Multi-Region Access Point. For more information about
     * managing Multi-Region Access Points and how asynchronous requests work, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/MrapOperations.html">Using Multi-Region Access
     * Points</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * The following actions are related to <code>GetMultiRegionAccessPoint</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateMultiRegionAccessPoint.html">
     * CreateMultiRegionAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteMultiRegionAccessPoint.html">
     * DeleteMultiRegionAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetMultiRegionAccessPoint.html">
     * GetMultiRegionAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListMultiRegionAccessPoints.html">
     * ListMultiRegionAccessPoints</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeMultiRegionAccessPointOperationRequest
     * @return A Java Future containing the result of the DescribeMultiRegionAccessPointOperation operation returned by
     *         the service.
     * @sample AWSS3ControlAsync.DescribeMultiRegionAccessPointOperation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DescribeMultiRegionAccessPointOperation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMultiRegionAccessPointOperationResult> describeMultiRegionAccessPointOperationAsync(
            DescribeMultiRegionAccessPointOperationRequest describeMultiRegionAccessPointOperationRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Retrieves the status of an asynchronous request to manage a Multi-Region Access Point. For more information about
     * managing Multi-Region Access Points and how asynchronous requests work, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/MrapOperations.html">Using Multi-Region Access
     * Points</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * The following actions are related to <code>GetMultiRegionAccessPoint</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateMultiRegionAccessPoint.html">
     * CreateMultiRegionAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteMultiRegionAccessPoint.html">
     * DeleteMultiRegionAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetMultiRegionAccessPoint.html">
     * GetMultiRegionAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListMultiRegionAccessPoints.html">
     * ListMultiRegionAccessPoints</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeMultiRegionAccessPointOperationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMultiRegionAccessPointOperation operation returned by
     *         the service.
     * @sample AWSS3ControlAsyncHandler.DescribeMultiRegionAccessPointOperation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DescribeMultiRegionAccessPointOperation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMultiRegionAccessPointOperationResult> describeMultiRegionAccessPointOperationAsync(
            DescribeMultiRegionAccessPointOperationRequest describeMultiRegionAccessPointOperationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMultiRegionAccessPointOperationRequest, DescribeMultiRegionAccessPointOperationResult> asyncHandler);

    /**
     * <p>
     * Dissociates the Amazon Web Services IAM Identity Center instance from the S3 Access Grants instance.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:DissociateAccessGrantsIdentityCenter</code> permission to use this operation.
     * </p>
     * </dd>
     * <dt>Additional Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>sso:DeleteApplication</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param dissociateAccessGrantsIdentityCenterRequest
     * @return A Java Future containing the result of the DissociateAccessGrantsIdentityCenter operation returned by the
     *         service.
     * @sample AWSS3ControlAsync.DissociateAccessGrantsIdentityCenter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DissociateAccessGrantsIdentityCenter"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DissociateAccessGrantsIdentityCenterResult> dissociateAccessGrantsIdentityCenterAsync(
            DissociateAccessGrantsIdentityCenterRequest dissociateAccessGrantsIdentityCenterRequest);

    /**
     * <p>
     * Dissociates the Amazon Web Services IAM Identity Center instance from the S3 Access Grants instance.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:DissociateAccessGrantsIdentityCenter</code> permission to use this operation.
     * </p>
     * </dd>
     * <dt>Additional Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>sso:DeleteApplication</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param dissociateAccessGrantsIdentityCenterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DissociateAccessGrantsIdentityCenter operation returned by the
     *         service.
     * @sample AWSS3ControlAsyncHandler.DissociateAccessGrantsIdentityCenter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DissociateAccessGrantsIdentityCenter"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DissociateAccessGrantsIdentityCenterResult> dissociateAccessGrantsIdentityCenterAsync(
            DissociateAccessGrantsIdentityCenterRequest dissociateAccessGrantsIdentityCenterRequest,
            com.amazonaws.handlers.AsyncHandler<DissociateAccessGrantsIdentityCenterRequest, DissociateAccessGrantsIdentityCenterResult> asyncHandler);

    /**
     * <p>
     * Get the details of an access grant from your S3 Access Grants instance.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:GetAccessGrant</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param getAccessGrantRequest
     * @return A Java Future containing the result of the GetAccessGrant operation returned by the service.
     * @sample AWSS3ControlAsync.GetAccessGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessGrant" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAccessGrantResult> getAccessGrantAsync(GetAccessGrantRequest getAccessGrantRequest);

    /**
     * <p>
     * Get the details of an access grant from your S3 Access Grants instance.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:GetAccessGrant</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param getAccessGrantRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccessGrant operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.GetAccessGrant
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessGrant" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAccessGrantResult> getAccessGrantAsync(GetAccessGrantRequest getAccessGrantRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccessGrantRequest, GetAccessGrantResult> asyncHandler);

    /**
     * <p>
     * Retrieves the S3 Access Grants instance for a Region in your account.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:GetAccessGrantsInstance</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param getAccessGrantsInstanceRequest
     * @return A Java Future containing the result of the GetAccessGrantsInstance operation returned by the service.
     * @sample AWSS3ControlAsync.GetAccessGrantsInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessGrantsInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAccessGrantsInstanceResult> getAccessGrantsInstanceAsync(GetAccessGrantsInstanceRequest getAccessGrantsInstanceRequest);

    /**
     * <p>
     * Retrieves the S3 Access Grants instance for a Region in your account.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:GetAccessGrantsInstance</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param getAccessGrantsInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccessGrantsInstance operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.GetAccessGrantsInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessGrantsInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAccessGrantsInstanceResult> getAccessGrantsInstanceAsync(GetAccessGrantsInstanceRequest getAccessGrantsInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccessGrantsInstanceRequest, GetAccessGrantsInstanceResult> asyncHandler);

    /**
     * <p>
     * Retrieve the S3 Access Grants instance that contains a particular prefix.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:GetAccessGrantsInstanceForPrefix</code> permission for the caller account to use this
     * operation.
     * </p>
     * </dd>
     * <dt>Additional Permissions</dt>
     * <dd>
     * <p>
     * The prefix owner account must grant you the following permissions to their S3 Access Grants instance:
     * <code>s3:GetAccessGrantsInstanceForPrefix</code>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param getAccessGrantsInstanceForPrefixRequest
     * @return A Java Future containing the result of the GetAccessGrantsInstanceForPrefix operation returned by the
     *         service.
     * @sample AWSS3ControlAsync.GetAccessGrantsInstanceForPrefix
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessGrantsInstanceForPrefix"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAccessGrantsInstanceForPrefixResult> getAccessGrantsInstanceForPrefixAsync(
            GetAccessGrantsInstanceForPrefixRequest getAccessGrantsInstanceForPrefixRequest);

    /**
     * <p>
     * Retrieve the S3 Access Grants instance that contains a particular prefix.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:GetAccessGrantsInstanceForPrefix</code> permission for the caller account to use this
     * operation.
     * </p>
     * </dd>
     * <dt>Additional Permissions</dt>
     * <dd>
     * <p>
     * The prefix owner account must grant you the following permissions to their S3 Access Grants instance:
     * <code>s3:GetAccessGrantsInstanceForPrefix</code>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param getAccessGrantsInstanceForPrefixRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccessGrantsInstanceForPrefix operation returned by the
     *         service.
     * @sample AWSS3ControlAsyncHandler.GetAccessGrantsInstanceForPrefix
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessGrantsInstanceForPrefix"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAccessGrantsInstanceForPrefixResult> getAccessGrantsInstanceForPrefixAsync(
            GetAccessGrantsInstanceForPrefixRequest getAccessGrantsInstanceForPrefixRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccessGrantsInstanceForPrefixRequest, GetAccessGrantsInstanceForPrefixResult> asyncHandler);

    /**
     * <p>
     * Returns the resource policy of the S3 Access Grants instance.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:GetAccessGrantsInstanceResourcePolicy</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param getAccessGrantsInstanceResourcePolicyRequest
     * @return A Java Future containing the result of the GetAccessGrantsInstanceResourcePolicy operation returned by
     *         the service.
     * @sample AWSS3ControlAsync.GetAccessGrantsInstanceResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessGrantsInstanceResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAccessGrantsInstanceResourcePolicyResult> getAccessGrantsInstanceResourcePolicyAsync(
            GetAccessGrantsInstanceResourcePolicyRequest getAccessGrantsInstanceResourcePolicyRequest);

    /**
     * <p>
     * Returns the resource policy of the S3 Access Grants instance.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:GetAccessGrantsInstanceResourcePolicy</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param getAccessGrantsInstanceResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccessGrantsInstanceResourcePolicy operation returned by
     *         the service.
     * @sample AWSS3ControlAsyncHandler.GetAccessGrantsInstanceResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessGrantsInstanceResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAccessGrantsInstanceResourcePolicyResult> getAccessGrantsInstanceResourcePolicyAsync(
            GetAccessGrantsInstanceResourcePolicyRequest getAccessGrantsInstanceResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccessGrantsInstanceResourcePolicyRequest, GetAccessGrantsInstanceResourcePolicyResult> asyncHandler);

    /**
     * <p>
     * Retrieves the details of a particular location registered in your S3 Access Grants instance.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:GetAccessGrantsLocation</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param getAccessGrantsLocationRequest
     * @return A Java Future containing the result of the GetAccessGrantsLocation operation returned by the service.
     * @sample AWSS3ControlAsync.GetAccessGrantsLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessGrantsLocation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAccessGrantsLocationResult> getAccessGrantsLocationAsync(GetAccessGrantsLocationRequest getAccessGrantsLocationRequest);

    /**
     * <p>
     * Retrieves the details of a particular location registered in your S3 Access Grants instance.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:GetAccessGrantsLocation</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param getAccessGrantsLocationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccessGrantsLocation operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.GetAccessGrantsLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessGrantsLocation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAccessGrantsLocationResult> getAccessGrantsLocationAsync(GetAccessGrantsLocationRequest getAccessGrantsLocationRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccessGrantsLocationRequest, GetAccessGrantsLocationResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns configuration information about the specified access point.
     * </p>
     * <p/>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPoint.html#API_control_GetAccessPoint_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>GetAccessPoint</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessPoint.html">CreateAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPoint.html">DeleteAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListAccessPoints.html">ListAccessPoints</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAccessPointRequest
     * @return A Java Future containing the result of the GetAccessPoint operation returned by the service.
     * @sample AWSS3ControlAsync.GetAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAccessPointResult> getAccessPointAsync(GetAccessPointRequest getAccessPointRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns configuration information about the specified access point.
     * </p>
     * <p/>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPoint.html#API_control_GetAccessPoint_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>GetAccessPoint</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessPoint.html">CreateAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPoint.html">DeleteAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListAccessPoints.html">ListAccessPoints</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAccessPointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccessPoint operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.GetAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAccessPointResult> getAccessPointAsync(GetAccessPointRequest getAccessPointRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccessPointRequest, GetAccessPointResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns configuration for an Object Lambda Access Point.
     * </p>
     * <p>
     * The following actions are related to <code>GetAccessPointConfigurationForObjectLambda</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutAccessPointConfigurationForObjectLambda.html"
     * >PutAccessPointConfigurationForObjectLambda</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAccessPointConfigurationForObjectLambdaRequest
     * @return A Java Future containing the result of the GetAccessPointConfigurationForObjectLambda operation returned
     *         by the service.
     * @sample AWSS3ControlAsync.GetAccessPointConfigurationForObjectLambda
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPointConfigurationForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAccessPointConfigurationForObjectLambdaResult> getAccessPointConfigurationForObjectLambdaAsync(
            GetAccessPointConfigurationForObjectLambdaRequest getAccessPointConfigurationForObjectLambdaRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns configuration for an Object Lambda Access Point.
     * </p>
     * <p>
     * The following actions are related to <code>GetAccessPointConfigurationForObjectLambda</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutAccessPointConfigurationForObjectLambda.html"
     * >PutAccessPointConfigurationForObjectLambda</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAccessPointConfigurationForObjectLambdaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccessPointConfigurationForObjectLambda operation returned
     *         by the service.
     * @sample AWSS3ControlAsyncHandler.GetAccessPointConfigurationForObjectLambda
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPointConfigurationForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAccessPointConfigurationForObjectLambdaResult> getAccessPointConfigurationForObjectLambdaAsync(
            GetAccessPointConfigurationForObjectLambdaRequest getAccessPointConfigurationForObjectLambdaRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccessPointConfigurationForObjectLambdaRequest, GetAccessPointConfigurationForObjectLambdaResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns configuration information about the specified Object Lambda Access Point
     * </p>
     * <p>
     * The following actions are related to <code>GetAccessPointForObjectLambda</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessPointForObjectLambda.html">
     * CreateAccessPointForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPointForObjectLambda.html">
     * DeleteAccessPointForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListAccessPointsForObjectLambda.html">
     * ListAccessPointsForObjectLambda</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAccessPointForObjectLambdaRequest
     * @return A Java Future containing the result of the GetAccessPointForObjectLambda operation returned by the
     *         service.
     * @sample AWSS3ControlAsync.GetAccessPointForObjectLambda
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPointForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAccessPointForObjectLambdaResult> getAccessPointForObjectLambdaAsync(
            GetAccessPointForObjectLambdaRequest getAccessPointForObjectLambdaRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns configuration information about the specified Object Lambda Access Point
     * </p>
     * <p>
     * The following actions are related to <code>GetAccessPointForObjectLambda</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessPointForObjectLambda.html">
     * CreateAccessPointForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPointForObjectLambda.html">
     * DeleteAccessPointForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListAccessPointsForObjectLambda.html">
     * ListAccessPointsForObjectLambda</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAccessPointForObjectLambdaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccessPointForObjectLambda operation returned by the
     *         service.
     * @sample AWSS3ControlAsyncHandler.GetAccessPointForObjectLambda
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPointForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAccessPointForObjectLambdaResult> getAccessPointForObjectLambdaAsync(
            GetAccessPointForObjectLambdaRequest getAccessPointForObjectLambdaRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccessPointForObjectLambdaRequest, GetAccessPointForObjectLambdaResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns the access point policy associated with the specified access point.
     * </p>
     * <p>
     * The following actions are related to <code>GetAccessPointPolicy</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutAccessPointPolicy.html">
     * PutAccessPointPolicy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPointPolicy.html">
     * DeleteAccessPointPolicy</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAccessPointPolicyRequest
     * @return A Java Future containing the result of the GetAccessPointPolicy operation returned by the service.
     * @sample AWSS3ControlAsync.GetAccessPointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPointPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAccessPointPolicyResult> getAccessPointPolicyAsync(GetAccessPointPolicyRequest getAccessPointPolicyRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns the access point policy associated with the specified access point.
     * </p>
     * <p>
     * The following actions are related to <code>GetAccessPointPolicy</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutAccessPointPolicy.html">
     * PutAccessPointPolicy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPointPolicy.html">
     * DeleteAccessPointPolicy</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAccessPointPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccessPointPolicy operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.GetAccessPointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPointPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAccessPointPolicyResult> getAccessPointPolicyAsync(GetAccessPointPolicyRequest getAccessPointPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccessPointPolicyRequest, GetAccessPointPolicyResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns the resource policy for an Object Lambda Access Point.
     * </p>
     * <p>
     * The following actions are related to <code>GetAccessPointPolicyForObjectLambda</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPointPolicyForObjectLambda.html">
     * DeleteAccessPointPolicyForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutAccessPointPolicyForObjectLambda.html">
     * PutAccessPointPolicyForObjectLambda</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAccessPointPolicyForObjectLambdaRequest
     * @return A Java Future containing the result of the GetAccessPointPolicyForObjectLambda operation returned by the
     *         service.
     * @sample AWSS3ControlAsync.GetAccessPointPolicyForObjectLambda
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPointPolicyForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAccessPointPolicyForObjectLambdaResult> getAccessPointPolicyForObjectLambdaAsync(
            GetAccessPointPolicyForObjectLambdaRequest getAccessPointPolicyForObjectLambdaRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns the resource policy for an Object Lambda Access Point.
     * </p>
     * <p>
     * The following actions are related to <code>GetAccessPointPolicyForObjectLambda</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPointPolicyForObjectLambda.html">
     * DeleteAccessPointPolicyForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutAccessPointPolicyForObjectLambda.html">
     * PutAccessPointPolicyForObjectLambda</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getAccessPointPolicyForObjectLambdaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccessPointPolicyForObjectLambda operation returned by the
     *         service.
     * @sample AWSS3ControlAsyncHandler.GetAccessPointPolicyForObjectLambda
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPointPolicyForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAccessPointPolicyForObjectLambdaResult> getAccessPointPolicyForObjectLambdaAsync(
            GetAccessPointPolicyForObjectLambdaRequest getAccessPointPolicyForObjectLambdaRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccessPointPolicyForObjectLambdaRequest, GetAccessPointPolicyForObjectLambdaResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Indicates whether the specified access point currently has a policy that allows public access. For more
     * information about public access through access points, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points.html">Managing Data Access with Amazon
     * S3 access points</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @param getAccessPointPolicyStatusRequest
     * @return A Java Future containing the result of the GetAccessPointPolicyStatus operation returned by the service.
     * @sample AWSS3ControlAsync.GetAccessPointPolicyStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPointPolicyStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAccessPointPolicyStatusResult> getAccessPointPolicyStatusAsync(
            GetAccessPointPolicyStatusRequest getAccessPointPolicyStatusRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Indicates whether the specified access point currently has a policy that allows public access. For more
     * information about public access through access points, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points.html">Managing Data Access with Amazon
     * S3 access points</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @param getAccessPointPolicyStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccessPointPolicyStatus operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.GetAccessPointPolicyStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPointPolicyStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAccessPointPolicyStatusResult> getAccessPointPolicyStatusAsync(
            GetAccessPointPolicyStatusRequest getAccessPointPolicyStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccessPointPolicyStatusRequest, GetAccessPointPolicyStatusResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns the status of the resource policy associated with an Object Lambda Access Point.
     * </p>
     * 
     * @param getAccessPointPolicyStatusForObjectLambdaRequest
     * @return A Java Future containing the result of the GetAccessPointPolicyStatusForObjectLambda operation returned
     *         by the service.
     * @sample AWSS3ControlAsync.GetAccessPointPolicyStatusForObjectLambda
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPointPolicyStatusForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAccessPointPolicyStatusForObjectLambdaResult> getAccessPointPolicyStatusForObjectLambdaAsync(
            GetAccessPointPolicyStatusForObjectLambdaRequest getAccessPointPolicyStatusForObjectLambdaRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns the status of the resource policy associated with an Object Lambda Access Point.
     * </p>
     * 
     * @param getAccessPointPolicyStatusForObjectLambdaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccessPointPolicyStatusForObjectLambda operation returned
     *         by the service.
     * @sample AWSS3ControlAsyncHandler.GetAccessPointPolicyStatusForObjectLambda
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetAccessPointPolicyStatusForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAccessPointPolicyStatusForObjectLambdaResult> getAccessPointPolicyStatusForObjectLambdaAsync(
            GetAccessPointPolicyStatusForObjectLambdaRequest getAccessPointPolicyStatusForObjectLambdaRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccessPointPolicyStatusForObjectLambdaRequest, GetAccessPointPolicyStatusForObjectLambdaResult> asyncHandler);

    /**
     * <p>
     * Gets an Amazon S3 on Outposts bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html"> Using Amazon S3 on Outposts</a>
     * in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * If you are using an identity other than the root user of the Amazon Web Services account that owns the Outposts
     * bucket, the calling identity must have the <code>s3-outposts:GetBucket</code> permissions on the specified
     * Outposts bucket and belong to the Outposts bucket owner's account in order to use this action. Only users from
     * Outposts bucket owner account with the right permissions can perform actions on an Outposts bucket.
     * </p>
     * <p>
     * If you don't have <code>s3-outposts:GetBucket</code> permissions or you're not using an identity that belongs to
     * the bucket owner's account, Amazon S3 returns a <code>403 Access Denied</code> error.
     * </p>
     * <p>
     * The following actions are related to <code>GetBucket</code> for Amazon S3 on Outposts:
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucket.html#API_control_GetBucket_Examples"
     * >Examples</a> section.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html">PutObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateBucket.html">CreateBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucket.html">DeleteBucket</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getBucketRequest
     * @return A Java Future containing the result of the GetBucket operation returned by the service.
     * @sample AWSS3ControlAsync.GetBucket
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetBucket" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBucketResult> getBucketAsync(GetBucketRequest getBucketRequest);

    /**
     * <p>
     * Gets an Amazon S3 on Outposts bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html"> Using Amazon S3 on Outposts</a>
     * in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * If you are using an identity other than the root user of the Amazon Web Services account that owns the Outposts
     * bucket, the calling identity must have the <code>s3-outposts:GetBucket</code> permissions on the specified
     * Outposts bucket and belong to the Outposts bucket owner's account in order to use this action. Only users from
     * Outposts bucket owner account with the right permissions can perform actions on an Outposts bucket.
     * </p>
     * <p>
     * If you don't have <code>s3-outposts:GetBucket</code> permissions or you're not using an identity that belongs to
     * the bucket owner's account, Amazon S3 returns a <code>403 Access Denied</code> error.
     * </p>
     * <p>
     * The following actions are related to <code>GetBucket</code> for Amazon S3 on Outposts:
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucket.html#API_control_GetBucket_Examples"
     * >Examples</a> section.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutObject.html">PutObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateBucket.html">CreateBucket</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucket.html">DeleteBucket</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getBucketRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBucket operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.GetBucket
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetBucket" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBucketResult> getBucketAsync(GetBucketRequest getBucketRequest,
            com.amazonaws.handlers.AsyncHandler<GetBucketRequest, GetBucketResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This action gets an Amazon S3 on Outposts bucket's lifecycle configuration. To get an S3 bucket's lifecycle
     * configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketLifecycleConfiguration.html"
     * >GetBucketLifecycleConfiguration</a> in the <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Returns the lifecycle configuration information set on the Outposts bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a>
     * and for information about lifecycle configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html"> Object Lifecycle
     * Management</a> in <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * To use this action, you must have permission to perform the <code>s3-outposts:GetLifecycleConfiguration</code>
     * action. The Outposts bucket owner has this permission, by default. The bucket owner can grant this permission to
     * others. For more information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketLifecycleConfiguration.html#API_control_GetBucketLifecycleConfiguration_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * <code>GetBucketLifecycleConfiguration</code> has the following special error:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Error code: <code>NoSuchLifecycleConfiguration</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: The lifecycle configuration does not exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * HTTP Status Code: 404 Not Found
     * </p>
     * </li>
     * <li>
     * <p>
     * SOAP Fault Code Prefix: Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * The following actions are related to <code>GetBucketLifecycleConfiguration</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketLifecycleConfiguration.html">
     * PutBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketLifecycleConfiguration.html">
     * DeleteBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getBucketLifecycleConfigurationRequest
     * @return A Java Future containing the result of the GetBucketLifecycleConfiguration operation returned by the
     *         service.
     * @sample AWSS3ControlAsync.GetBucketLifecycleConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetBucketLifecycleConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetBucketLifecycleConfigurationResult> getBucketLifecycleConfigurationAsync(
            GetBucketLifecycleConfigurationRequest getBucketLifecycleConfigurationRequest);

    /**
     * <note>
     * <p>
     * This action gets an Amazon S3 on Outposts bucket's lifecycle configuration. To get an S3 bucket's lifecycle
     * configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketLifecycleConfiguration.html"
     * >GetBucketLifecycleConfiguration</a> in the <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Returns the lifecycle configuration information set on the Outposts bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a>
     * and for information about lifecycle configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html"> Object Lifecycle
     * Management</a> in <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * To use this action, you must have permission to perform the <code>s3-outposts:GetLifecycleConfiguration</code>
     * action. The Outposts bucket owner has this permission, by default. The bucket owner can grant this permission to
     * others. For more information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * >Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing Access Permissions
     * to Your Amazon S3 Resources</a>.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketLifecycleConfiguration.html#API_control_GetBucketLifecycleConfiguration_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * <code>GetBucketLifecycleConfiguration</code> has the following special error:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Error code: <code>NoSuchLifecycleConfiguration</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: The lifecycle configuration does not exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * HTTP Status Code: 404 Not Found
     * </p>
     * </li>
     * <li>
     * <p>
     * SOAP Fault Code Prefix: Client
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * The following actions are related to <code>GetBucketLifecycleConfiguration</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketLifecycleConfiguration.html">
     * PutBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketLifecycleConfiguration.html">
     * DeleteBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getBucketLifecycleConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBucketLifecycleConfiguration operation returned by the
     *         service.
     * @sample AWSS3ControlAsyncHandler.GetBucketLifecycleConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetBucketLifecycleConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetBucketLifecycleConfigurationResult> getBucketLifecycleConfigurationAsync(
            GetBucketLifecycleConfigurationRequest getBucketLifecycleConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetBucketLifecycleConfigurationRequest, GetBucketLifecycleConfigurationResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This action gets a bucket policy for an Amazon S3 on Outposts bucket. To get a policy for an S3 bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketPolicy.html">GetBucketPolicy</a> in the
     * <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Returns the policy of a specified Outposts bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a> in
     * the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * If you are using an identity other than the root user of the Amazon Web Services account that owns the bucket,
     * the calling identity must have the <code>GetBucketPolicy</code> permissions on the specified bucket and belong to
     * the bucket owner's account in order to use this action.
     * </p>
     * <p>
     * Only users from Outposts bucket owner account with the right permissions can perform actions on an Outposts
     * bucket. If you don't have <code>s3-outposts:GetBucketPolicy</code> permissions or you're not using an identity
     * that belongs to the bucket owner's account, Amazon S3 returns a <code>403 Access Denied</code> error.
     * </p>
     * <important>
     * <p>
     * As a security precaution, the root user of the Amazon Web Services account that owns a bucket can always use this
     * action, even if the policy explicitly denies the root user the ability to perform this action.
     * </p>
     * </important>
     * <p>
     * For more information about bucket policies, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-iam-policies.html">Using Bucket Policies and User
     * Policies</a>.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketPolicy.html#API_control_GetBucketPolicy_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>GetBucketPolicy</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketPolicy.html">PutBucketPolicy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketPolicy.html">DeleteBucketPolicy</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getBucketPolicyRequest
     * @return A Java Future containing the result of the GetBucketPolicy operation returned by the service.
     * @sample AWSS3ControlAsync.GetBucketPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetBucketPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBucketPolicyResult> getBucketPolicyAsync(GetBucketPolicyRequest getBucketPolicyRequest);

    /**
     * <note>
     * <p>
     * This action gets a bucket policy for an Amazon S3 on Outposts bucket. To get a policy for an S3 bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketPolicy.html">GetBucketPolicy</a> in the
     * <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Returns the policy of a specified Outposts bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a> in
     * the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * If you are using an identity other than the root user of the Amazon Web Services account that owns the bucket,
     * the calling identity must have the <code>GetBucketPolicy</code> permissions on the specified bucket and belong to
     * the bucket owner's account in order to use this action.
     * </p>
     * <p>
     * Only users from Outposts bucket owner account with the right permissions can perform actions on an Outposts
     * bucket. If you don't have <code>s3-outposts:GetBucketPolicy</code> permissions or you're not using an identity
     * that belongs to the bucket owner's account, Amazon S3 returns a <code>403 Access Denied</code> error.
     * </p>
     * <important>
     * <p>
     * As a security precaution, the root user of the Amazon Web Services account that owns a bucket can always use this
     * action, even if the policy explicitly denies the root user the ability to perform this action.
     * </p>
     * </important>
     * <p>
     * For more information about bucket policies, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-iam-policies.html">Using Bucket Policies and User
     * Policies</a>.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketPolicy.html#API_control_GetBucketPolicy_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>GetBucketPolicy</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetObject.html">GetObject</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketPolicy.html">PutBucketPolicy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketPolicy.html">DeleteBucketPolicy</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getBucketPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBucketPolicy operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.GetBucketPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetBucketPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBucketPolicyResult> getBucketPolicyAsync(GetBucketPolicyRequest getBucketPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetBucketPolicyRequest, GetBucketPolicyResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation gets an Amazon S3 on Outposts bucket's replication configuration. To get an S3 bucket's
     * replication configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketReplication.html">GetBucketReplication</a> in
     * the <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Returns the replication configuration of an S3 on Outposts bucket. For more information about S3 on Outposts, see
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a>
     * in the <i>Amazon S3 User Guide</i>. For information about S3 replication on Outposts configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsReplication.html">Replicating objects for
     * S3 on Outposts</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * It can take a while to propagate <code>PUT</code> or <code>DELETE</code> requests for a replication configuration
     * to all S3 on Outposts systems. Therefore, the replication configuration that's returned by a <code>GET</code>
     * request soon after a <code>PUT</code> or <code>DELETE</code> request might return a more recent result than
     * what's on the Outpost. If an Outpost is offline, the delay in updating the replication configuration on that
     * Outpost can be significant.
     * </p>
     * </note>
     * <p>
     * This action requires permissions for the <code>s3-outposts:GetReplicationConfiguration</code> action. The
     * Outposts bucket owner has this permission by default and can grant it to others. For more information about
     * permissions, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsIAM.html">Setting up
     * IAM with S3 on Outposts</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsBucketPolicy.html">Managing access to S3 on
     * Outposts bucket</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketReplication.html#API_control_GetBucketReplication_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * If you include the <code>Filter</code> element in a replication configuration, you must also include the
     * <code>DeleteMarkerReplication</code>, <code>Status</code>, and <code>Priority</code> elements. The response also
     * returns those elements.
     * </p>
     * <p>
     * For information about S3 on Outposts replication failure reasons, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/outposts-replication-eventbridge.html#outposts-replication-failure-codes"
     * >Replication failure reasons</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * The following operations are related to <code>GetBucketReplication</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketReplication.html">
     * PutBucketReplication</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketReplication.html">
     * DeleteBucketReplication</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getBucketReplicationRequest
     * @return A Java Future containing the result of the GetBucketReplication operation returned by the service.
     * @sample AWSS3ControlAsync.GetBucketReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetBucketReplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetBucketReplicationResult> getBucketReplicationAsync(GetBucketReplicationRequest getBucketReplicationRequest);

    /**
     * <note>
     * <p>
     * This operation gets an Amazon S3 on Outposts bucket's replication configuration. To get an S3 bucket's
     * replication configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketReplication.html">GetBucketReplication</a> in
     * the <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Returns the replication configuration of an S3 on Outposts bucket. For more information about S3 on Outposts, see
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a>
     * in the <i>Amazon S3 User Guide</i>. For information about S3 replication on Outposts configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsReplication.html">Replicating objects for
     * S3 on Outposts</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * It can take a while to propagate <code>PUT</code> or <code>DELETE</code> requests for a replication configuration
     * to all S3 on Outposts systems. Therefore, the replication configuration that's returned by a <code>GET</code>
     * request soon after a <code>PUT</code> or <code>DELETE</code> request might return a more recent result than
     * what's on the Outpost. If an Outpost is offline, the delay in updating the replication configuration on that
     * Outpost can be significant.
     * </p>
     * </note>
     * <p>
     * This action requires permissions for the <code>s3-outposts:GetReplicationConfiguration</code> action. The
     * Outposts bucket owner has this permission by default and can grant it to others. For more information about
     * permissions, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsIAM.html">Setting up
     * IAM with S3 on Outposts</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsBucketPolicy.html">Managing access to S3 on
     * Outposts bucket</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketReplication.html#API_control_GetBucketReplication_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * If you include the <code>Filter</code> element in a replication configuration, you must also include the
     * <code>DeleteMarkerReplication</code>, <code>Status</code>, and <code>Priority</code> elements. The response also
     * returns those elements.
     * </p>
     * <p>
     * For information about S3 on Outposts replication failure reasons, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/outposts-replication-eventbridge.html#outposts-replication-failure-codes"
     * >Replication failure reasons</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * The following operations are related to <code>GetBucketReplication</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketReplication.html">
     * PutBucketReplication</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketReplication.html">
     * DeleteBucketReplication</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getBucketReplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBucketReplication operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.GetBucketReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetBucketReplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetBucketReplicationResult> getBucketReplicationAsync(GetBucketReplicationRequest getBucketReplicationRequest,
            com.amazonaws.handlers.AsyncHandler<GetBucketReplicationRequest, GetBucketReplicationResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This action gets an Amazon S3 on Outposts bucket's tags. To get an S3 bucket tags, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketTagging.html">GetBucketTagging</a> in the
     * <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Returns the tag set associated with the Outposts bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a> in
     * the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * To use this action, you must have permission to perform the <code>GetBucketTagging</code> action. By default, the
     * bucket owner has this permission and can grant this permission to others.
     * </p>
     * <p>
     * <code>GetBucketTagging</code> has the following special error:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Error code: <code>NoSuchTagSetError</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: There is no tag set associated with the bucket.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketTagging.html#API_control_GetBucketTagging_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>GetBucketTagging</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketTagging.html">PutBucketTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketTagging.html">DeleteBucketTagging
     * </a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getBucketTaggingRequest
     * @return A Java Future containing the result of the GetBucketTagging operation returned by the service.
     * @sample AWSS3ControlAsync.GetBucketTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetBucketTagging" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBucketTaggingResult> getBucketTaggingAsync(GetBucketTaggingRequest getBucketTaggingRequest);

    /**
     * <note>
     * <p>
     * This action gets an Amazon S3 on Outposts bucket's tags. To get an S3 bucket tags, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketTagging.html">GetBucketTagging</a> in the
     * <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Returns the tag set associated with the Outposts bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a> in
     * the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * To use this action, you must have permission to perform the <code>GetBucketTagging</code> action. By default, the
     * bucket owner has this permission and can grant this permission to others.
     * </p>
     * <p>
     * <code>GetBucketTagging</code> has the following special error:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Error code: <code>NoSuchTagSetError</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: There is no tag set associated with the bucket.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketTagging.html#API_control_GetBucketTagging_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>GetBucketTagging</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketTagging.html">PutBucketTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketTagging.html">DeleteBucketTagging
     * </a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getBucketTaggingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBucketTagging operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.GetBucketTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetBucketTagging" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBucketTaggingResult> getBucketTaggingAsync(GetBucketTaggingRequest getBucketTaggingRequest,
            com.amazonaws.handlers.AsyncHandler<GetBucketTaggingRequest, GetBucketTaggingResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation returns the versioning state for S3 on Outposts buckets only. To return the versioning state for
     * an S3 bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketVersioning.html">GetBucketVersioning</a> in
     * the <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Returns the versioning state for an S3 on Outposts bucket. With S3 Versioning, you can save multiple distinct
     * copies of your objects and recover from unintended user actions and application failures.
     * </p>
     * <p>
     * If you've never set versioning on your bucket, it has no versioning state. In that case, the
     * <code>GetBucketVersioning</code> request does not return a versioning state value.
     * </p>
     * <p>
     * For more information about versioning, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/Versioning.html">Versioning</a> in the <i>Amazon S3
     * User Guide</i>.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketVersioning.html#API_control_GetBucketVersioning_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following operations are related to <code>GetBucketVersioning</code> for S3 on Outposts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketVersioning.html">PutBucketVersioning
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketLifecycleConfiguration.html">
     * PutBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketLifecycleConfiguration.html">
     * GetBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getBucketVersioningRequest
     * @return A Java Future containing the result of the GetBucketVersioning operation returned by the service.
     * @sample AWSS3ControlAsync.GetBucketVersioning
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetBucketVersioning" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetBucketVersioningResult> getBucketVersioningAsync(GetBucketVersioningRequest getBucketVersioningRequest);

    /**
     * <note>
     * <p>
     * This operation returns the versioning state for S3 on Outposts buckets only. To return the versioning state for
     * an S3 bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_GetBucketVersioning.html">GetBucketVersioning</a> in
     * the <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Returns the versioning state for an S3 on Outposts bucket. With S3 Versioning, you can save multiple distinct
     * copies of your objects and recover from unintended user actions and application failures.
     * </p>
     * <p>
     * If you've never set versioning on your bucket, it has no versioning state. In that case, the
     * <code>GetBucketVersioning</code> request does not return a versioning state value.
     * </p>
     * <p>
     * For more information about versioning, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/Versioning.html">Versioning</a> in the <i>Amazon S3
     * User Guide</i>.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketVersioning.html#API_control_GetBucketVersioning_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following operations are related to <code>GetBucketVersioning</code> for S3 on Outposts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketVersioning.html">PutBucketVersioning
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketLifecycleConfiguration.html">
     * PutBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketLifecycleConfiguration.html">
     * GetBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getBucketVersioningRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBucketVersioning operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.GetBucketVersioning
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetBucketVersioning" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetBucketVersioningResult> getBucketVersioningAsync(GetBucketVersioningRequest getBucketVersioningRequest,
            com.amazonaws.handlers.AsyncHandler<GetBucketVersioningRequest, GetBucketVersioningResult> asyncHandler);

    /**
     * <p>
     * Returns a temporary access credential from S3 Access Grants to the grantee or client application. The <a
     * href="https://docs.aws.amazon.com/STS/latest/APIReference/API_Credentials.html">temporary credential</a> is an
     * Amazon Web Services STS token that grants them access to the S3 data.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:GetDataAccess</code> permission to use this operation.
     * </p>
     * </dd>
     * <dt>Additional Permissions</dt>
     * <dd>
     * <p>
     * The IAM role that S3 Access Grants assumes must have the following permissions specified in the trust policy when
     * registering the location: <code>sts:AssumeRole</code>, for directory users or groups <code>sts:SetContext</code>,
     * and for IAM users or roles <code>sts:SetSourceIdentity</code>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param getDataAccessRequest
     * @return A Java Future containing the result of the GetDataAccess operation returned by the service.
     * @sample AWSS3ControlAsync.GetDataAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetDataAccess" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDataAccessResult> getDataAccessAsync(GetDataAccessRequest getDataAccessRequest);

    /**
     * <p>
     * Returns a temporary access credential from S3 Access Grants to the grantee or client application. The <a
     * href="https://docs.aws.amazon.com/STS/latest/APIReference/API_Credentials.html">temporary credential</a> is an
     * Amazon Web Services STS token that grants them access to the S3 data.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:GetDataAccess</code> permission to use this operation.
     * </p>
     * </dd>
     * <dt>Additional Permissions</dt>
     * <dd>
     * <p>
     * The IAM role that S3 Access Grants assumes must have the following permissions specified in the trust policy when
     * registering the location: <code>sts:AssumeRole</code>, for directory users or groups <code>sts:SetContext</code>,
     * and for IAM users or roles <code>sts:SetSourceIdentity</code>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param getDataAccessRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDataAccess operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.GetDataAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetDataAccess" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDataAccessResult> getDataAccessAsync(GetDataAccessRequest getDataAccessRequest,
            com.amazonaws.handlers.AsyncHandler<GetDataAccessRequest, GetDataAccessResult> asyncHandler);

    /**
     * <p>
     * Returns the tags on an S3 Batch Operations job.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * To use the <code>GetJobTagging</code> operation, you must have permission to perform the
     * <code>s3:GetJobTagging</code> action. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-managing-jobs.html#batch-ops-job-tags"
     * >Controlling access and labeling jobs using tags</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateJob.html">CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutJobTagging.html">PutJobTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteJobTagging.html">DeleteJobTagging</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getJobTaggingRequest
     * @return A Java Future containing the result of the GetJobTagging operation returned by the service.
     * @sample AWSS3ControlAsync.GetJobTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetJobTagging" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetJobTaggingResult> getJobTaggingAsync(GetJobTaggingRequest getJobTaggingRequest);

    /**
     * <p>
     * Returns the tags on an S3 Batch Operations job.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * To use the <code>GetJobTagging</code> operation, you must have permission to perform the
     * <code>s3:GetJobTagging</code> action. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-managing-jobs.html#batch-ops-job-tags"
     * >Controlling access and labeling jobs using tags</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateJob.html">CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutJobTagging.html">PutJobTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteJobTagging.html">DeleteJobTagging</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getJobTaggingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetJobTagging operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.GetJobTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetJobTagging" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetJobTaggingResult> getJobTaggingAsync(GetJobTaggingRequest getJobTaggingRequest,
            com.amazonaws.handlers.AsyncHandler<GetJobTaggingRequest, GetJobTaggingResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns configuration information about the specified Multi-Region Access Point.
     * </p>
     * <p>
     * This action will always be routed to the US West (Oregon) Region. For more information about the restrictions
     * around working with Multi-Region Access Points, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiRegionAccessPointRestrictions.html">Multi-Region
     * Access Point restrictions and limitations</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * The following actions are related to <code>GetMultiRegionAccessPoint</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateMultiRegionAccessPoint.html">
     * CreateMultiRegionAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteMultiRegionAccessPoint.html">
     * DeleteMultiRegionAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DescribeMultiRegionAccessPointOperation.html"
     * >DescribeMultiRegionAccessPointOperation</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListMultiRegionAccessPoints.html">
     * ListMultiRegionAccessPoints</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getMultiRegionAccessPointRequest
     * @return A Java Future containing the result of the GetMultiRegionAccessPoint operation returned by the service.
     * @sample AWSS3ControlAsync.GetMultiRegionAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetMultiRegionAccessPoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMultiRegionAccessPointResult> getMultiRegionAccessPointAsync(
            GetMultiRegionAccessPointRequest getMultiRegionAccessPointRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns configuration information about the specified Multi-Region Access Point.
     * </p>
     * <p>
     * This action will always be routed to the US West (Oregon) Region. For more information about the restrictions
     * around working with Multi-Region Access Points, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiRegionAccessPointRestrictions.html">Multi-Region
     * Access Point restrictions and limitations</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * The following actions are related to <code>GetMultiRegionAccessPoint</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateMultiRegionAccessPoint.html">
     * CreateMultiRegionAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteMultiRegionAccessPoint.html">
     * DeleteMultiRegionAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DescribeMultiRegionAccessPointOperation.html"
     * >DescribeMultiRegionAccessPointOperation</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListMultiRegionAccessPoints.html">
     * ListMultiRegionAccessPoints</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getMultiRegionAccessPointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMultiRegionAccessPoint operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.GetMultiRegionAccessPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetMultiRegionAccessPoint"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMultiRegionAccessPointResult> getMultiRegionAccessPointAsync(
            GetMultiRegionAccessPointRequest getMultiRegionAccessPointRequest,
            com.amazonaws.handlers.AsyncHandler<GetMultiRegionAccessPointRequest, GetMultiRegionAccessPointResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns the access control policy of the specified Multi-Region Access Point.
     * </p>
     * <p>
     * This action will always be routed to the US West (Oregon) Region. For more information about the restrictions
     * around working with Multi-Region Access Points, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiRegionAccessPointRestrictions.html">Multi-Region
     * Access Point restrictions and limitations</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * The following actions are related to <code>GetMultiRegionAccessPointPolicy</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetMultiRegionAccessPointPolicyStatus.html">
     * GetMultiRegionAccessPointPolicyStatus</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutMultiRegionAccessPointPolicy.html">
     * PutMultiRegionAccessPointPolicy</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getMultiRegionAccessPointPolicyRequest
     * @return A Java Future containing the result of the GetMultiRegionAccessPointPolicy operation returned by the
     *         service.
     * @sample AWSS3ControlAsync.GetMultiRegionAccessPointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetMultiRegionAccessPointPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMultiRegionAccessPointPolicyResult> getMultiRegionAccessPointPolicyAsync(
            GetMultiRegionAccessPointPolicyRequest getMultiRegionAccessPointPolicyRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns the access control policy of the specified Multi-Region Access Point.
     * </p>
     * <p>
     * This action will always be routed to the US West (Oregon) Region. For more information about the restrictions
     * around working with Multi-Region Access Points, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiRegionAccessPointRestrictions.html">Multi-Region
     * Access Point restrictions and limitations</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * The following actions are related to <code>GetMultiRegionAccessPointPolicy</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetMultiRegionAccessPointPolicyStatus.html">
     * GetMultiRegionAccessPointPolicyStatus</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutMultiRegionAccessPointPolicy.html">
     * PutMultiRegionAccessPointPolicy</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getMultiRegionAccessPointPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMultiRegionAccessPointPolicy operation returned by the
     *         service.
     * @sample AWSS3ControlAsyncHandler.GetMultiRegionAccessPointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetMultiRegionAccessPointPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMultiRegionAccessPointPolicyResult> getMultiRegionAccessPointPolicyAsync(
            GetMultiRegionAccessPointPolicyRequest getMultiRegionAccessPointPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetMultiRegionAccessPointPolicyRequest, GetMultiRegionAccessPointPolicyResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Indicates whether the specified Multi-Region Access Point has an access control policy that allows public access.
     * </p>
     * <p>
     * This action will always be routed to the US West (Oregon) Region. For more information about the restrictions
     * around working with Multi-Region Access Points, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiRegionAccessPointRestrictions.html">Multi-Region
     * Access Point restrictions and limitations</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * The following actions are related to <code>GetMultiRegionAccessPointPolicyStatus</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetMultiRegionAccessPointPolicy.html">
     * GetMultiRegionAccessPointPolicy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutMultiRegionAccessPointPolicy.html">
     * PutMultiRegionAccessPointPolicy</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getMultiRegionAccessPointPolicyStatusRequest
     * @return A Java Future containing the result of the GetMultiRegionAccessPointPolicyStatus operation returned by
     *         the service.
     * @sample AWSS3ControlAsync.GetMultiRegionAccessPointPolicyStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetMultiRegionAccessPointPolicyStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMultiRegionAccessPointPolicyStatusResult> getMultiRegionAccessPointPolicyStatusAsync(
            GetMultiRegionAccessPointPolicyStatusRequest getMultiRegionAccessPointPolicyStatusRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Indicates whether the specified Multi-Region Access Point has an access control policy that allows public access.
     * </p>
     * <p>
     * This action will always be routed to the US West (Oregon) Region. For more information about the restrictions
     * around working with Multi-Region Access Points, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiRegionAccessPointRestrictions.html">Multi-Region
     * Access Point restrictions and limitations</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * The following actions are related to <code>GetMultiRegionAccessPointPolicyStatus</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetMultiRegionAccessPointPolicy.html">
     * GetMultiRegionAccessPointPolicy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutMultiRegionAccessPointPolicy.html">
     * PutMultiRegionAccessPointPolicy</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getMultiRegionAccessPointPolicyStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMultiRegionAccessPointPolicyStatus operation returned by
     *         the service.
     * @sample AWSS3ControlAsyncHandler.GetMultiRegionAccessPointPolicyStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetMultiRegionAccessPointPolicyStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMultiRegionAccessPointPolicyStatusResult> getMultiRegionAccessPointPolicyStatusAsync(
            GetMultiRegionAccessPointPolicyStatusRequest getMultiRegionAccessPointPolicyStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetMultiRegionAccessPointPolicyStatusRequest, GetMultiRegionAccessPointPolicyStatusResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns the routing configuration for a Multi-Region Access Point, indicating which Regions are active or
     * passive.
     * </p>
     * <p>
     * To obtain routing control changes and failover requests, use the Amazon S3 failover control infrastructure
     * endpoints in these five Amazon Web Services Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>us-east-1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>us-west-2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ap-southeast-2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ap-northeast-1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>eu-west-1</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getMultiRegionAccessPointRoutesRequest
     * @return A Java Future containing the result of the GetMultiRegionAccessPointRoutes operation returned by the
     *         service.
     * @sample AWSS3ControlAsync.GetMultiRegionAccessPointRoutes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetMultiRegionAccessPointRoutes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMultiRegionAccessPointRoutesResult> getMultiRegionAccessPointRoutesAsync(
            GetMultiRegionAccessPointRoutesRequest getMultiRegionAccessPointRoutesRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns the routing configuration for a Multi-Region Access Point, indicating which Regions are active or
     * passive.
     * </p>
     * <p>
     * To obtain routing control changes and failover requests, use the Amazon S3 failover control infrastructure
     * endpoints in these five Amazon Web Services Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>us-east-1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>us-west-2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ap-southeast-2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ap-northeast-1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>eu-west-1</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getMultiRegionAccessPointRoutesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMultiRegionAccessPointRoutes operation returned by the
     *         service.
     * @sample AWSS3ControlAsyncHandler.GetMultiRegionAccessPointRoutes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetMultiRegionAccessPointRoutes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMultiRegionAccessPointRoutesResult> getMultiRegionAccessPointRoutesAsync(
            GetMultiRegionAccessPointRoutesRequest getMultiRegionAccessPointRoutesRequest,
            com.amazonaws.handlers.AsyncHandler<GetMultiRegionAccessPointRoutesRequest, GetMultiRegionAccessPointRoutesResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Retrieves the <code>PublicAccessBlock</code> configuration for an Amazon Web Services account. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html"> Using Amazon S3
     * block public access</a>.
     * </p>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeletePublicAccessBlock.html">
     * DeletePublicAccessBlock</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutPublicAccessBlock.html">
     * PutPublicAccessBlock</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getPublicAccessBlockRequest
     * @return A Java Future containing the result of the GetPublicAccessBlock operation returned by the service.
     * @sample AWSS3ControlAsync.GetPublicAccessBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetPublicAccessBlock" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetPublicAccessBlockResult> getPublicAccessBlockAsync(GetPublicAccessBlockRequest getPublicAccessBlockRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Retrieves the <code>PublicAccessBlock</code> configuration for an Amazon Web Services account. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html"> Using Amazon S3
     * block public access</a>.
     * </p>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeletePublicAccessBlock.html">
     * DeletePublicAccessBlock</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutPublicAccessBlock.html">
     * PutPublicAccessBlock</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getPublicAccessBlockRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPublicAccessBlock operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.GetPublicAccessBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetPublicAccessBlock" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetPublicAccessBlockResult> getPublicAccessBlockAsync(GetPublicAccessBlockRequest getPublicAccessBlockRequest,
            com.amazonaws.handlers.AsyncHandler<GetPublicAccessBlockRequest, GetPublicAccessBlockResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Gets the Amazon S3 Storage Lens configuration. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens.html">Assessing your storage activity and
     * usage with Amazon S3 Storage Lens </a> in the <i>Amazon S3 User Guide</i>. For a complete list of S3 Storage Lens
     * metrics, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_metrics_glossary.html">S3 Storage Lens
     * metrics glossary</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * To use this action, you must have permission to perform the <code>s3:GetStorageLensConfiguration</code> action.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens_iam_permissions.html">Setting permissions to
     * use Amazon S3 Storage Lens</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </note>
     * 
     * @param getStorageLensConfigurationRequest
     * @return A Java Future containing the result of the GetStorageLensConfiguration operation returned by the service.
     * @sample AWSS3ControlAsync.GetStorageLensConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetStorageLensConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetStorageLensConfigurationResult> getStorageLensConfigurationAsync(
            GetStorageLensConfigurationRequest getStorageLensConfigurationRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Gets the Amazon S3 Storage Lens configuration. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens.html">Assessing your storage activity and
     * usage with Amazon S3 Storage Lens </a> in the <i>Amazon S3 User Guide</i>. For a complete list of S3 Storage Lens
     * metrics, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_metrics_glossary.html">S3 Storage Lens
     * metrics glossary</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * To use this action, you must have permission to perform the <code>s3:GetStorageLensConfiguration</code> action.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens_iam_permissions.html">Setting permissions to
     * use Amazon S3 Storage Lens</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </note>
     * 
     * @param getStorageLensConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStorageLensConfiguration operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.GetStorageLensConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetStorageLensConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetStorageLensConfigurationResult> getStorageLensConfigurationAsync(
            GetStorageLensConfigurationRequest getStorageLensConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetStorageLensConfigurationRequest, GetStorageLensConfigurationResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Gets the tags of Amazon S3 Storage Lens configuration. For more information about S3 Storage Lens, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens.html">Assessing your storage activity and
     * usage with Amazon S3 Storage Lens </a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * To use this action, you must have permission to perform the <code>s3:GetStorageLensConfigurationTagging</code>
     * action. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens_iam_permissions.html">Setting permissions to
     * use Amazon S3 Storage Lens</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </note>
     * 
     * @param getStorageLensConfigurationTaggingRequest
     * @return A Java Future containing the result of the GetStorageLensConfigurationTagging operation returned by the
     *         service.
     * @sample AWSS3ControlAsync.GetStorageLensConfigurationTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetStorageLensConfigurationTagging"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetStorageLensConfigurationTaggingResult> getStorageLensConfigurationTaggingAsync(
            GetStorageLensConfigurationTaggingRequest getStorageLensConfigurationTaggingRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Gets the tags of Amazon S3 Storage Lens configuration. For more information about S3 Storage Lens, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens.html">Assessing your storage activity and
     * usage with Amazon S3 Storage Lens </a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * To use this action, you must have permission to perform the <code>s3:GetStorageLensConfigurationTagging</code>
     * action. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens_iam_permissions.html">Setting permissions to
     * use Amazon S3 Storage Lens</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </note>
     * 
     * @param getStorageLensConfigurationTaggingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStorageLensConfigurationTagging operation returned by the
     *         service.
     * @sample AWSS3ControlAsyncHandler.GetStorageLensConfigurationTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetStorageLensConfigurationTagging"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetStorageLensConfigurationTaggingResult> getStorageLensConfigurationTaggingAsync(
            GetStorageLensConfigurationTaggingRequest getStorageLensConfigurationTaggingRequest,
            com.amazonaws.handlers.AsyncHandler<GetStorageLensConfigurationTaggingRequest, GetStorageLensConfigurationTaggingResult> asyncHandler);

    /**
     * <p>
     * Retrieves the Storage Lens group configuration details.
     * </p>
     * <p>
     * To use this operation, you must have the permission to perform the <code>s3:GetStorageLensGroup</code> action.
     * For more information about the required Storage Lens Groups permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_iam_permissions.html#storage_lens_groups_permissions"
     * >Setting account permissions to use S3 Storage Lens groups</a>.
     * </p>
     * <p>
     * For information about Storage Lens groups errors, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html#S3LensErrorCodeList">List of Amazon S3
     * Storage Lens error codes</a>.
     * </p>
     * 
     * @param getStorageLensGroupRequest
     * @return A Java Future containing the result of the GetStorageLensGroup operation returned by the service.
     * @sample AWSS3ControlAsync.GetStorageLensGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetStorageLensGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetStorageLensGroupResult> getStorageLensGroupAsync(GetStorageLensGroupRequest getStorageLensGroupRequest);

    /**
     * <p>
     * Retrieves the Storage Lens group configuration details.
     * </p>
     * <p>
     * To use this operation, you must have the permission to perform the <code>s3:GetStorageLensGroup</code> action.
     * For more information about the required Storage Lens Groups permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_iam_permissions.html#storage_lens_groups_permissions"
     * >Setting account permissions to use S3 Storage Lens groups</a>.
     * </p>
     * <p>
     * For information about Storage Lens groups errors, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html#S3LensErrorCodeList">List of Amazon S3
     * Storage Lens error codes</a>.
     * </p>
     * 
     * @param getStorageLensGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStorageLensGroup operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.GetStorageLensGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetStorageLensGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetStorageLensGroupResult> getStorageLensGroupAsync(GetStorageLensGroupRequest getStorageLensGroupRequest,
            com.amazonaws.handlers.AsyncHandler<GetStorageLensGroupRequest, GetStorageLensGroupResult> asyncHandler);

    /**
     * <p>
     * Returns the list of access grants in your S3 Access Grants instance.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:ListAccessGrants</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param listAccessGrantsRequest
     * @return A Java Future containing the result of the ListAccessGrants operation returned by the service.
     * @sample AWSS3ControlAsync.ListAccessGrants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListAccessGrants" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAccessGrantsResult> listAccessGrantsAsync(ListAccessGrantsRequest listAccessGrantsRequest);

    /**
     * <p>
     * Returns the list of access grants in your S3 Access Grants instance.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:ListAccessGrants</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param listAccessGrantsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAccessGrants operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.ListAccessGrants
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListAccessGrants" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAccessGrantsResult> listAccessGrantsAsync(ListAccessGrantsRequest listAccessGrantsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAccessGrantsRequest, ListAccessGrantsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of S3 Access Grants instances. An S3 Access Grants instance serves as a logical grouping for your
     * individual access grants. You can only have one S3 Access Grants instance per Region per account.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:ListAccessGrantsInstances</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param listAccessGrantsInstancesRequest
     * @return A Java Future containing the result of the ListAccessGrantsInstances operation returned by the service.
     * @sample AWSS3ControlAsync.ListAccessGrantsInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListAccessGrantsInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAccessGrantsInstancesResult> listAccessGrantsInstancesAsync(
            ListAccessGrantsInstancesRequest listAccessGrantsInstancesRequest);

    /**
     * <p>
     * Returns a list of S3 Access Grants instances. An S3 Access Grants instance serves as a logical grouping for your
     * individual access grants. You can only have one S3 Access Grants instance per Region per account.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:ListAccessGrantsInstances</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param listAccessGrantsInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAccessGrantsInstances operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.ListAccessGrantsInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListAccessGrantsInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAccessGrantsInstancesResult> listAccessGrantsInstancesAsync(
            ListAccessGrantsInstancesRequest listAccessGrantsInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAccessGrantsInstancesRequest, ListAccessGrantsInstancesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the locations registered in your S3 Access Grants instance.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:ListAccessGrantsLocations</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param listAccessGrantsLocationsRequest
     * @return A Java Future containing the result of the ListAccessGrantsLocations operation returned by the service.
     * @sample AWSS3ControlAsync.ListAccessGrantsLocations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListAccessGrantsLocations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAccessGrantsLocationsResult> listAccessGrantsLocationsAsync(
            ListAccessGrantsLocationsRequest listAccessGrantsLocationsRequest);

    /**
     * <p>
     * Returns a list of the locations registered in your S3 Access Grants instance.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:ListAccessGrantsLocations</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param listAccessGrantsLocationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAccessGrantsLocations operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.ListAccessGrantsLocations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListAccessGrantsLocations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAccessGrantsLocationsResult> listAccessGrantsLocationsAsync(
            ListAccessGrantsLocationsRequest listAccessGrantsLocationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAccessGrantsLocationsRequest, ListAccessGrantsLocationsResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns a list of the access points that are owned by the current account that's associated with the specified
     * bucket. You can retrieve up to 1000 access points per call. If the specified bucket has more than 1,000 access
     * points (or the number specified in <code>maxResults</code>, whichever is less), the response will include a
     * continuation token that you can use to list the additional access points.
     * </p>
     * <p/>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPoint.html#API_control_GetAccessPoint_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>ListAccessPoints</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessPoint.html">CreateAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPoint.html">DeleteAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPoint.html">GetAccessPoint</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listAccessPointsRequest
     * @return A Java Future containing the result of the ListAccessPoints operation returned by the service.
     * @sample AWSS3ControlAsync.ListAccessPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListAccessPoints" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAccessPointsResult> listAccessPointsAsync(ListAccessPointsRequest listAccessPointsRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns a list of the access points that are owned by the current account that's associated with the specified
     * bucket. You can retrieve up to 1000 access points per call. If the specified bucket has more than 1,000 access
     * points (or the number specified in <code>maxResults</code>, whichever is less), the response will include a
     * continuation token that you can use to list the additional access points.
     * </p>
     * <p/>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPoint.html#API_control_GetAccessPoint_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>ListAccessPoints</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessPoint.html">CreateAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPoint.html">DeleteAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPoint.html">GetAccessPoint</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listAccessPointsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAccessPoints operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.ListAccessPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListAccessPoints" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAccessPointsResult> listAccessPointsAsync(ListAccessPointsRequest listAccessPointsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAccessPointsRequest, ListAccessPointsResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns some or all (up to 1,000) access points associated with the Object Lambda Access Point per call. If there
     * are more access points than what can be returned in one call, the response will include a continuation token that
     * you can use to list the additional access points.
     * </p>
     * <p>
     * The following actions are related to <code>ListAccessPointsForObjectLambda</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessPointForObjectLambda.html">
     * CreateAccessPointForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPointForObjectLambda.html">
     * DeleteAccessPointForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPointForObjectLambda.html">
     * GetAccessPointForObjectLambda</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listAccessPointsForObjectLambdaRequest
     * @return A Java Future containing the result of the ListAccessPointsForObjectLambda operation returned by the
     *         service.
     * @sample AWSS3ControlAsync.ListAccessPointsForObjectLambda
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListAccessPointsForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAccessPointsForObjectLambdaResult> listAccessPointsForObjectLambdaAsync(
            ListAccessPointsForObjectLambdaRequest listAccessPointsForObjectLambdaRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns some or all (up to 1,000) access points associated with the Object Lambda Access Point per call. If there
     * are more access points than what can be returned in one call, the response will include a continuation token that
     * you can use to list the additional access points.
     * </p>
     * <p>
     * The following actions are related to <code>ListAccessPointsForObjectLambda</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateAccessPointForObjectLambda.html">
     * CreateAccessPointForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPointForObjectLambda.html">
     * DeleteAccessPointForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPointForObjectLambda.html">
     * GetAccessPointForObjectLambda</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listAccessPointsForObjectLambdaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAccessPointsForObjectLambda operation returned by the
     *         service.
     * @sample AWSS3ControlAsyncHandler.ListAccessPointsForObjectLambda
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListAccessPointsForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAccessPointsForObjectLambdaResult> listAccessPointsForObjectLambdaAsync(
            ListAccessPointsForObjectLambdaRequest listAccessPointsForObjectLambdaRequest,
            com.amazonaws.handlers.AsyncHandler<ListAccessPointsForObjectLambdaRequest, ListAccessPointsForObjectLambdaResult> asyncHandler);

    /**
     * <p>
     * Lists current S3 Batch Operations jobs as well as the jobs that have ended within the last 90 days for the Amazon
     * Web Services account making the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/batch-ops.html">S3 Batch Operations</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * To use the <code>ListJobs</code> operation, you must have permission to perform the <code>s3:ListJobs</code>
     * action.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Related actions include:
     * </p>
     * <p/>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateJob.html">CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DescribeJob.html">DescribeJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_UpdateJobPriority.html">UpdateJobPriority</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_UpdateJobStatus.html">UpdateJobStatus</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listJobsRequest
     * @return A Java Future containing the result of the ListJobs operation returned by the service.
     * @sample AWSS3ControlAsync.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest listJobsRequest);

    /**
     * <p>
     * Lists current S3 Batch Operations jobs as well as the jobs that have ended within the last 90 days for the Amazon
     * Web Services account making the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/batch-ops.html">S3 Batch Operations</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * To use the <code>ListJobs</code> operation, you must have permission to perform the <code>s3:ListJobs</code>
     * action.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Related actions include:
     * </p>
     * <p/>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateJob.html">CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DescribeJob.html">DescribeJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_UpdateJobPriority.html">UpdateJobPriority</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_UpdateJobStatus.html">UpdateJobStatus</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListJobs operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.ListJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest listJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns a list of the Multi-Region Access Points currently associated with the specified Amazon Web Services
     * account. Each call can return up to 100 Multi-Region Access Points, the maximum number of Multi-Region Access
     * Points that can be associated with a single account.
     * </p>
     * <p>
     * This action will always be routed to the US West (Oregon) Region. For more information about the restrictions
     * around working with Multi-Region Access Points, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiRegionAccessPointRestrictions.html">Multi-Region
     * Access Point restrictions and limitations</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * The following actions are related to <code>ListMultiRegionAccessPoint</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateMultiRegionAccessPoint.html">
     * CreateMultiRegionAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteMultiRegionAccessPoint.html">
     * DeleteMultiRegionAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DescribeMultiRegionAccessPointOperation.html"
     * >DescribeMultiRegionAccessPointOperation</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetMultiRegionAccessPoint.html">
     * GetMultiRegionAccessPoint</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listMultiRegionAccessPointsRequest
     * @return A Java Future containing the result of the ListMultiRegionAccessPoints operation returned by the service.
     * @sample AWSS3ControlAsync.ListMultiRegionAccessPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListMultiRegionAccessPoints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMultiRegionAccessPointsResult> listMultiRegionAccessPointsAsync(
            ListMultiRegionAccessPointsRequest listMultiRegionAccessPointsRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns a list of the Multi-Region Access Points currently associated with the specified Amazon Web Services
     * account. Each call can return up to 100 Multi-Region Access Points, the maximum number of Multi-Region Access
     * Points that can be associated with a single account.
     * </p>
     * <p>
     * This action will always be routed to the US West (Oregon) Region. For more information about the restrictions
     * around working with Multi-Region Access Points, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiRegionAccessPointRestrictions.html">Multi-Region
     * Access Point restrictions and limitations</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * The following actions are related to <code>ListMultiRegionAccessPoint</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateMultiRegionAccessPoint.html">
     * CreateMultiRegionAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteMultiRegionAccessPoint.html">
     * DeleteMultiRegionAccessPoint</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DescribeMultiRegionAccessPointOperation.html"
     * >DescribeMultiRegionAccessPointOperation</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetMultiRegionAccessPoint.html">
     * GetMultiRegionAccessPoint</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listMultiRegionAccessPointsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMultiRegionAccessPoints operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.ListMultiRegionAccessPoints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListMultiRegionAccessPoints"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMultiRegionAccessPointsResult> listMultiRegionAccessPointsAsync(
            ListMultiRegionAccessPointsRequest listMultiRegionAccessPointsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMultiRegionAccessPointsRequest, ListMultiRegionAccessPointsResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns a list of all Outposts buckets in an Outpost that are owned by the authenticated sender of the request.
     * For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using
     * Amazon S3 on Outposts</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname
     * prefix and <code>x-amz-outpost-id</code> in your request, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListRegionalBuckets.html#API_control_ListRegionalBuckets_Examples"
     * >Examples</a> section.
     * </p>
     * 
     * @param listRegionalBucketsRequest
     * @return A Java Future containing the result of the ListRegionalBuckets operation returned by the service.
     * @sample AWSS3ControlAsync.ListRegionalBuckets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListRegionalBuckets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListRegionalBucketsResult> listRegionalBucketsAsync(ListRegionalBucketsRequest listRegionalBucketsRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Returns a list of all Outposts buckets in an Outpost that are owned by the authenticated sender of the request.
     * For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using
     * Amazon S3 on Outposts</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname
     * prefix and <code>x-amz-outpost-id</code> in your request, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListRegionalBuckets.html#API_control_ListRegionalBuckets_Examples"
     * >Examples</a> section.
     * </p>
     * 
     * @param listRegionalBucketsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRegionalBuckets operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.ListRegionalBuckets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListRegionalBuckets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListRegionalBucketsResult> listRegionalBucketsAsync(ListRegionalBucketsRequest listRegionalBucketsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRegionalBucketsRequest, ListRegionalBucketsResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Gets a list of Amazon S3 Storage Lens configurations. For more information about S3 Storage Lens, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens.html">Assessing your storage activity and
     * usage with Amazon S3 Storage Lens </a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * To use this action, you must have permission to perform the <code>s3:ListStorageLensConfigurations</code> action.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens_iam_permissions.html">Setting permissions to
     * use Amazon S3 Storage Lens</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </note>
     * 
     * @param listStorageLensConfigurationsRequest
     * @return A Java Future containing the result of the ListStorageLensConfigurations operation returned by the
     *         service.
     * @sample AWSS3ControlAsync.ListStorageLensConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListStorageLensConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListStorageLensConfigurationsResult> listStorageLensConfigurationsAsync(
            ListStorageLensConfigurationsRequest listStorageLensConfigurationsRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Gets a list of Amazon S3 Storage Lens configurations. For more information about S3 Storage Lens, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens.html">Assessing your storage activity and
     * usage with Amazon S3 Storage Lens </a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * To use this action, you must have permission to perform the <code>s3:ListStorageLensConfigurations</code> action.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens_iam_permissions.html">Setting permissions to
     * use Amazon S3 Storage Lens</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </note>
     * 
     * @param listStorageLensConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStorageLensConfigurations operation returned by the
     *         service.
     * @sample AWSS3ControlAsyncHandler.ListStorageLensConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListStorageLensConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListStorageLensConfigurationsResult> listStorageLensConfigurationsAsync(
            ListStorageLensConfigurationsRequest listStorageLensConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListStorageLensConfigurationsRequest, ListStorageLensConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Lists all the Storage Lens groups in the specified home Region.
     * </p>
     * <p>
     * To use this operation, you must have the permission to perform the <code>s3:ListStorageLensGroups</code> action.
     * For more information about the required Storage Lens Groups permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_iam_permissions.html#storage_lens_groups_permissions"
     * >Setting account permissions to use S3 Storage Lens groups</a>.
     * </p>
     * <p>
     * For information about Storage Lens groups errors, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html#S3LensErrorCodeList">List of Amazon S3
     * Storage Lens error codes</a>.
     * </p>
     * 
     * @param listStorageLensGroupsRequest
     * @return A Java Future containing the result of the ListStorageLensGroups operation returned by the service.
     * @sample AWSS3ControlAsync.ListStorageLensGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListStorageLensGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListStorageLensGroupsResult> listStorageLensGroupsAsync(ListStorageLensGroupsRequest listStorageLensGroupsRequest);

    /**
     * <p>
     * Lists all the Storage Lens groups in the specified home Region.
     * </p>
     * <p>
     * To use this operation, you must have the permission to perform the <code>s3:ListStorageLensGroups</code> action.
     * For more information about the required Storage Lens Groups permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_iam_permissions.html#storage_lens_groups_permissions"
     * >Setting account permissions to use S3 Storage Lens groups</a>.
     * </p>
     * <p>
     * For information about Storage Lens groups errors, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html#S3LensErrorCodeList">List of Amazon S3
     * Storage Lens error codes</a>.
     * </p>
     * 
     * @param listStorageLensGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStorageLensGroups operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.ListStorageLensGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListStorageLensGroups"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListStorageLensGroupsResult> listStorageLensGroupsAsync(ListStorageLensGroupsRequest listStorageLensGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListStorageLensGroupsRequest, ListStorageLensGroupsResult> asyncHandler);

    /**
     * <p>
     * This operation allows you to list all the Amazon Web Services resource tags for a specified resource. Each tag is
     * a label consisting of a user-defined key and value. Tags can help you manage, identify, organize, search for, and
     * filter resources.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:ListTagsForResource</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * <note>
     * <p>
     * This operation is only supported for <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage-lens-groups.html">S3 Storage Lens groups</a>
     * and for <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-grants-tagging.html">S3 Access
     * Grants</a>. The tagged resource can be an S3 Storage Lens group or S3 Access Grants instance, registered
     * location, or grant.
     * </p>
     * </note>
     * <p>
     * For more information about the required Storage Lens Groups permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_iam_permissions.html#storage_lens_groups_permissions"
     * >Setting account permissions to use S3 Storage Lens groups</a>.
     * </p>
     * <p>
     * For information about S3 Tagging errors, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html#S3TaggingErrorCodeList">List of Amazon
     * S3 Tagging error codes</a>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSS3ControlAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * This operation allows you to list all the Amazon Web Services resource tags for a specified resource. Each tag is
     * a label consisting of a user-defined key and value. Tags can help you manage, identify, organize, search for, and
     * filter resources.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:ListTagsForResource</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * <note>
     * <p>
     * This operation is only supported for <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage-lens-groups.html">S3 Storage Lens groups</a>
     * and for <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-grants-tagging.html">S3 Access
     * Grants</a>. The tagged resource can be an S3 Storage Lens group or S3 Access Grants instance, registered
     * location, or grant.
     * </p>
     * </note>
     * <p>
     * For more information about the required Storage Lens Groups permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_iam_permissions.html#storage_lens_groups_permissions"
     * >Setting account permissions to use S3 Storage Lens groups</a>.
     * </p>
     * <p>
     * For information about S3 Tagging errors, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html#S3TaggingErrorCodeList">List of Amazon
     * S3 Tagging error codes</a>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the resource policy of the S3 Access Grants instance.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:PutAccessGrantsInstanceResourcePolicy</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param putAccessGrantsInstanceResourcePolicyRequest
     * @return A Java Future containing the result of the PutAccessGrantsInstanceResourcePolicy operation returned by
     *         the service.
     * @sample AWSS3ControlAsync.PutAccessGrantsInstanceResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutAccessGrantsInstanceResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutAccessGrantsInstanceResourcePolicyResult> putAccessGrantsInstanceResourcePolicyAsync(
            PutAccessGrantsInstanceResourcePolicyRequest putAccessGrantsInstanceResourcePolicyRequest);

    /**
     * <p>
     * Updates the resource policy of the S3 Access Grants instance.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:PutAccessGrantsInstanceResourcePolicy</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param putAccessGrantsInstanceResourcePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutAccessGrantsInstanceResourcePolicy operation returned by
     *         the service.
     * @sample AWSS3ControlAsyncHandler.PutAccessGrantsInstanceResourcePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutAccessGrantsInstanceResourcePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutAccessGrantsInstanceResourcePolicyResult> putAccessGrantsInstanceResourcePolicyAsync(
            PutAccessGrantsInstanceResourcePolicyRequest putAccessGrantsInstanceResourcePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutAccessGrantsInstanceResourcePolicyRequest, PutAccessGrantsInstanceResourcePolicyResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Replaces configuration for an Object Lambda Access Point.
     * </p>
     * <p>
     * The following actions are related to <code>PutAccessPointConfigurationForObjectLambda</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPointConfigurationForObjectLambda.html"
     * >GetAccessPointConfigurationForObjectLambda</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putAccessPointConfigurationForObjectLambdaRequest
     * @return A Java Future containing the result of the PutAccessPointConfigurationForObjectLambda operation returned
     *         by the service.
     * @sample AWSS3ControlAsync.PutAccessPointConfigurationForObjectLambda
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutAccessPointConfigurationForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutAccessPointConfigurationForObjectLambdaResult> putAccessPointConfigurationForObjectLambdaAsync(
            PutAccessPointConfigurationForObjectLambdaRequest putAccessPointConfigurationForObjectLambdaRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Replaces configuration for an Object Lambda Access Point.
     * </p>
     * <p>
     * The following actions are related to <code>PutAccessPointConfigurationForObjectLambda</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPointConfigurationForObjectLambda.html"
     * >GetAccessPointConfigurationForObjectLambda</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putAccessPointConfigurationForObjectLambdaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutAccessPointConfigurationForObjectLambda operation returned
     *         by the service.
     * @sample AWSS3ControlAsyncHandler.PutAccessPointConfigurationForObjectLambda
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutAccessPointConfigurationForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutAccessPointConfigurationForObjectLambdaResult> putAccessPointConfigurationForObjectLambdaAsync(
            PutAccessPointConfigurationForObjectLambdaRequest putAccessPointConfigurationForObjectLambdaRequest,
            com.amazonaws.handlers.AsyncHandler<PutAccessPointConfigurationForObjectLambdaRequest, PutAccessPointConfigurationForObjectLambdaResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Associates an access policy with the specified access point. Each access point can have only one policy, so a
     * request made to this API replaces any existing policy associated with the specified access point.
     * </p>
     * <p/>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutAccessPointPolicy.html#API_control_PutAccessPointPolicy_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>PutAccessPointPolicy</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPointPolicy.html">
     * GetAccessPointPolicy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPointPolicy.html">
     * DeleteAccessPointPolicy</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putAccessPointPolicyRequest
     * @return A Java Future containing the result of the PutAccessPointPolicy operation returned by the service.
     * @sample AWSS3ControlAsync.PutAccessPointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutAccessPointPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutAccessPointPolicyResult> putAccessPointPolicyAsync(PutAccessPointPolicyRequest putAccessPointPolicyRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Associates an access policy with the specified access point. Each access point can have only one policy, so a
     * request made to this API replaces any existing policy associated with the specified access point.
     * </p>
     * <p/>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutAccessPointPolicy.html#API_control_PutAccessPointPolicy_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>PutAccessPointPolicy</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPointPolicy.html">
     * GetAccessPointPolicy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPointPolicy.html">
     * DeleteAccessPointPolicy</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putAccessPointPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutAccessPointPolicy operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.PutAccessPointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutAccessPointPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutAccessPointPolicyResult> putAccessPointPolicyAsync(PutAccessPointPolicyRequest putAccessPointPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutAccessPointPolicyRequest, PutAccessPointPolicyResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Creates or replaces resource policy for an Object Lambda Access Point. For an example policy, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/olap-create.html#olap-create-cli">Creating Object
     * Lambda Access Points</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * The following actions are related to <code>PutAccessPointPolicyForObjectLambda</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPointPolicyForObjectLambda.html">
     * DeleteAccessPointPolicyForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPointPolicyForObjectLambda.html">
     * GetAccessPointPolicyForObjectLambda</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putAccessPointPolicyForObjectLambdaRequest
     * @return A Java Future containing the result of the PutAccessPointPolicyForObjectLambda operation returned by the
     *         service.
     * @sample AWSS3ControlAsync.PutAccessPointPolicyForObjectLambda
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutAccessPointPolicyForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutAccessPointPolicyForObjectLambdaResult> putAccessPointPolicyForObjectLambdaAsync(
            PutAccessPointPolicyForObjectLambdaRequest putAccessPointPolicyForObjectLambdaRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Creates or replaces resource policy for an Object Lambda Access Point. For an example policy, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/olap-create.html#olap-create-cli">Creating Object
     * Lambda Access Points</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * The following actions are related to <code>PutAccessPointPolicyForObjectLambda</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteAccessPointPolicyForObjectLambda.html">
     * DeleteAccessPointPolicyForObjectLambda</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetAccessPointPolicyForObjectLambda.html">
     * GetAccessPointPolicyForObjectLambda</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putAccessPointPolicyForObjectLambdaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutAccessPointPolicyForObjectLambda operation returned by the
     *         service.
     * @sample AWSS3ControlAsyncHandler.PutAccessPointPolicyForObjectLambda
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutAccessPointPolicyForObjectLambda"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutAccessPointPolicyForObjectLambdaResult> putAccessPointPolicyForObjectLambdaAsync(
            PutAccessPointPolicyForObjectLambdaRequest putAccessPointPolicyForObjectLambdaRequest,
            com.amazonaws.handlers.AsyncHandler<PutAccessPointPolicyForObjectLambdaRequest, PutAccessPointPolicyForObjectLambdaResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This action puts a lifecycle configuration to an Amazon S3 on Outposts bucket. To put a lifecycle configuration
     * to an S3 bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketLifecycleConfiguration.html"
     * >PutBucketLifecycleConfiguration</a> in the <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Creates a new lifecycle configuration for the S3 on Outposts bucket or replaces an existing lifecycle
     * configuration. Outposts buckets only support lifecycle configurations that delete/expire objects after a certain
     * period of time and abort incomplete multipart uploads.
     * </p>
     * <p/>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketLifecycleConfiguration.html#API_control_PutBucketLifecycleConfiguration_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>PutBucketLifecycleConfiguration</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketLifecycleConfiguration.html">
     * GetBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketLifecycleConfiguration.html">
     * DeleteBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putBucketLifecycleConfigurationRequest
     * @return A Java Future containing the result of the PutBucketLifecycleConfiguration operation returned by the
     *         service.
     * @sample AWSS3ControlAsync.PutBucketLifecycleConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutBucketLifecycleConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutBucketLifecycleConfigurationResult> putBucketLifecycleConfigurationAsync(
            PutBucketLifecycleConfigurationRequest putBucketLifecycleConfigurationRequest);

    /**
     * <note>
     * <p>
     * This action puts a lifecycle configuration to an Amazon S3 on Outposts bucket. To put a lifecycle configuration
     * to an S3 bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketLifecycleConfiguration.html"
     * >PutBucketLifecycleConfiguration</a> in the <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Creates a new lifecycle configuration for the S3 on Outposts bucket or replaces an existing lifecycle
     * configuration. Outposts buckets only support lifecycle configurations that delete/expire objects after a certain
     * period of time and abort incomplete multipart uploads.
     * </p>
     * <p/>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketLifecycleConfiguration.html#API_control_PutBucketLifecycleConfiguration_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>PutBucketLifecycleConfiguration</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketLifecycleConfiguration.html">
     * GetBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketLifecycleConfiguration.html">
     * DeleteBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putBucketLifecycleConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutBucketLifecycleConfiguration operation returned by the
     *         service.
     * @sample AWSS3ControlAsyncHandler.PutBucketLifecycleConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutBucketLifecycleConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutBucketLifecycleConfigurationResult> putBucketLifecycleConfigurationAsync(
            PutBucketLifecycleConfigurationRequest putBucketLifecycleConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutBucketLifecycleConfigurationRequest, PutBucketLifecycleConfigurationResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This action puts a bucket policy to an Amazon S3 on Outposts bucket. To put a policy on an S3 bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketPolicy.html">PutBucketPolicy</a> in the
     * <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Applies an Amazon S3 bucket policy to an Outposts bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a> in
     * the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * If you are using an identity other than the root user of the Amazon Web Services account that owns the Outposts
     * bucket, the calling identity must have the <code>PutBucketPolicy</code> permissions on the specified Outposts
     * bucket and belong to the bucket owner's account in order to use this action.
     * </p>
     * <p>
     * If you don't have <code>PutBucketPolicy</code> permissions, Amazon S3 returns a <code>403 Access Denied</code>
     * error. If you have the correct permissions, but you're not using an identity that belongs to the bucket owner's
     * account, Amazon S3 returns a <code>405 Method Not Allowed</code> error.
     * </p>
     * <important>
     * <p>
     * As a security precaution, the root user of the Amazon Web Services account that owns a bucket can always use this
     * action, even if the policy explicitly denies the root user the ability to perform this action.
     * </p>
     * </important>
     * <p>
     * For more information about bucket policies, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-iam-policies.html">Using Bucket Policies and User
     * Policies</a>.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketPolicy.html#API_control_PutBucketPolicy_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>PutBucketPolicy</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketPolicy.html">GetBucketPolicy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketPolicy.html">DeleteBucketPolicy</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putBucketPolicyRequest
     * @return A Java Future containing the result of the PutBucketPolicy operation returned by the service.
     * @sample AWSS3ControlAsync.PutBucketPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutBucketPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutBucketPolicyResult> putBucketPolicyAsync(PutBucketPolicyRequest putBucketPolicyRequest);

    /**
     * <note>
     * <p>
     * This action puts a bucket policy to an Amazon S3 on Outposts bucket. To put a policy on an S3 bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketPolicy.html">PutBucketPolicy</a> in the
     * <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Applies an Amazon S3 bucket policy to an Outposts bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a> in
     * the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * If you are using an identity other than the root user of the Amazon Web Services account that owns the Outposts
     * bucket, the calling identity must have the <code>PutBucketPolicy</code> permissions on the specified Outposts
     * bucket and belong to the bucket owner's account in order to use this action.
     * </p>
     * <p>
     * If you don't have <code>PutBucketPolicy</code> permissions, Amazon S3 returns a <code>403 Access Denied</code>
     * error. If you have the correct permissions, but you're not using an identity that belongs to the bucket owner's
     * account, Amazon S3 returns a <code>405 Method Not Allowed</code> error.
     * </p>
     * <important>
     * <p>
     * As a security precaution, the root user of the Amazon Web Services account that owns a bucket can always use this
     * action, even if the policy explicitly denies the root user the ability to perform this action.
     * </p>
     * </important>
     * <p>
     * For more information about bucket policies, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/using-iam-policies.html">Using Bucket Policies and User
     * Policies</a>.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketPolicy.html#API_control_PutBucketPolicy_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>PutBucketPolicy</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketPolicy.html">GetBucketPolicy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketPolicy.html">DeleteBucketPolicy</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putBucketPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutBucketPolicy operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.PutBucketPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutBucketPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutBucketPolicyResult> putBucketPolicyAsync(PutBucketPolicyRequest putBucketPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutBucketPolicyRequest, PutBucketPolicyResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This action creates an Amazon S3 on Outposts bucket's replication configuration. To create an S3 bucket's
     * replication configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketReplication.html">PutBucketReplication</a> in
     * the <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Creates a replication configuration or replaces an existing one. For information about S3 replication on Outposts
     * configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsReplication.html">Replicating objects for
     * S3 on Outposts</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * It can take a while to propagate <code>PUT</code> or <code>DELETE</code> requests for a replication configuration
     * to all S3 on Outposts systems. Therefore, the replication configuration that's returned by a <code>GET</code>
     * request soon after a <code>PUT</code> or <code>DELETE</code> request might return a more recent result than
     * what's on the Outpost. If an Outpost is offline, the delay in updating the replication configuration on that
     * Outpost can be significant.
     * </p>
     * </note>
     * <p>
     * Specify the replication configuration in the request body. In the replication configuration, you provide the
     * following information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name of the destination bucket or buckets where you want S3 on Outposts to replicate objects
     * </p>
     * </li>
     * <li>
     * <p>
     * The Identity and Access Management (IAM) role that S3 on Outposts can assume to replicate objects on your behalf
     * </p>
     * </li>
     * <li>
     * <p>
     * Other relevant information, such as replication rules
     * </p>
     * </li>
     * </ul>
     * <p>
     * A replication configuration must include at least one rule and can contain a maximum of 100. Each rule identifies
     * a subset of objects to replicate by filtering the objects in the source Outposts bucket. To choose additional
     * subsets of objects to replicate, add a rule for each subset.
     * </p>
     * <p>
     * To specify a subset of the objects in the source Outposts bucket to apply a replication rule to, add the
     * <code>Filter</code> element as a child of the <code>Rule</code> element. You can filter objects based on an
     * object key prefix, one or more object tags, or both. When you add the <code>Filter</code> element in the
     * configuration, you must also add the following elements: <code>DeleteMarkerReplication</code>,
     * <code>Status</code>, and <code>Priority</code>.
     * </p>
     * <p>
     * Using <code>PutBucketReplication</code> on Outposts requires that both the source and destination buckets must
     * have versioning enabled. For information about enabling versioning on a bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsManagingVersioning.html">Managing S3
     * Versioning for your S3 on Outposts bucket</a>.
     * </p>
     * <p>
     * For information about S3 on Outposts replication failure reasons, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/outposts-replication-eventbridge.html#outposts-replication-failure-codes"
     * >Replication failure reasons</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * <b>Handling Replication of Encrypted Objects</b>
     * </p>
     * <p>
     * Outposts buckets are encrypted at all times. All the objects in the source Outposts bucket are encrypted and can
     * be replicated. Also, all the replicas in the destination Outposts bucket are encrypted with the same encryption
     * key as the objects in the source Outposts bucket.
     * </p>
     * <p>
     * <b>Permissions</b>
     * </p>
     * <p>
     * To create a <code>PutBucketReplication</code> request, you must have
     * <code>s3-outposts:PutReplicationConfiguration</code> permissions for the bucket. The Outposts bucket owner has
     * this permission by default and can grant it to others. For more information about permissions, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsIAM.html">Setting up IAM with S3 on
     * Outposts</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsBucketPolicy.html">Managing access to S3 on
     * Outposts buckets</a>.
     * </p>
     * <note>
     * <p>
     * To perform this operation, the user or role must also have the <code>iam:CreateRole</code> and
     * <code>iam:PassRole</code> permissions. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_passrole.html">Granting a user permissions to
     * pass a role to an Amazon Web Services service</a>.
     * </p>
     * </note>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketReplication.html#API_control_PutBucketReplication_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following operations are related to <code>PutBucketReplication</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketReplication.html">
     * GetBucketReplication</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketReplication.html">
     * DeleteBucketReplication</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putBucketReplicationRequest
     * @return A Java Future containing the result of the PutBucketReplication operation returned by the service.
     * @sample AWSS3ControlAsync.PutBucketReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutBucketReplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutBucketReplicationResult> putBucketReplicationAsync(PutBucketReplicationRequest putBucketReplicationRequest);

    /**
     * <note>
     * <p>
     * This action creates an Amazon S3 on Outposts bucket's replication configuration. To create an S3 bucket's
     * replication configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketReplication.html">PutBucketReplication</a> in
     * the <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Creates a replication configuration or replaces an existing one. For information about S3 replication on Outposts
     * configuration, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsReplication.html">Replicating objects for
     * S3 on Outposts</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * It can take a while to propagate <code>PUT</code> or <code>DELETE</code> requests for a replication configuration
     * to all S3 on Outposts systems. Therefore, the replication configuration that's returned by a <code>GET</code>
     * request soon after a <code>PUT</code> or <code>DELETE</code> request might return a more recent result than
     * what's on the Outpost. If an Outpost is offline, the delay in updating the replication configuration on that
     * Outpost can be significant.
     * </p>
     * </note>
     * <p>
     * Specify the replication configuration in the request body. In the replication configuration, you provide the
     * following information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name of the destination bucket or buckets where you want S3 on Outposts to replicate objects
     * </p>
     * </li>
     * <li>
     * <p>
     * The Identity and Access Management (IAM) role that S3 on Outposts can assume to replicate objects on your behalf
     * </p>
     * </li>
     * <li>
     * <p>
     * Other relevant information, such as replication rules
     * </p>
     * </li>
     * </ul>
     * <p>
     * A replication configuration must include at least one rule and can contain a maximum of 100. Each rule identifies
     * a subset of objects to replicate by filtering the objects in the source Outposts bucket. To choose additional
     * subsets of objects to replicate, add a rule for each subset.
     * </p>
     * <p>
     * To specify a subset of the objects in the source Outposts bucket to apply a replication rule to, add the
     * <code>Filter</code> element as a child of the <code>Rule</code> element. You can filter objects based on an
     * object key prefix, one or more object tags, or both. When you add the <code>Filter</code> element in the
     * configuration, you must also add the following elements: <code>DeleteMarkerReplication</code>,
     * <code>Status</code>, and <code>Priority</code>.
     * </p>
     * <p>
     * Using <code>PutBucketReplication</code> on Outposts requires that both the source and destination buckets must
     * have versioning enabled. For information about enabling versioning on a bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsManagingVersioning.html">Managing S3
     * Versioning for your S3 on Outposts bucket</a>.
     * </p>
     * <p>
     * For information about S3 on Outposts replication failure reasons, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/outposts-replication-eventbridge.html#outposts-replication-failure-codes"
     * >Replication failure reasons</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * <b>Handling Replication of Encrypted Objects</b>
     * </p>
     * <p>
     * Outposts buckets are encrypted at all times. All the objects in the source Outposts bucket are encrypted and can
     * be replicated. Also, all the replicas in the destination Outposts bucket are encrypted with the same encryption
     * key as the objects in the source Outposts bucket.
     * </p>
     * <p>
     * <b>Permissions</b>
     * </p>
     * <p>
     * To create a <code>PutBucketReplication</code> request, you must have
     * <code>s3-outposts:PutReplicationConfiguration</code> permissions for the bucket. The Outposts bucket owner has
     * this permission by default and can grant it to others. For more information about permissions, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsIAM.html">Setting up IAM with S3 on
     * Outposts</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsBucketPolicy.html">Managing access to S3 on
     * Outposts buckets</a>.
     * </p>
     * <note>
     * <p>
     * To perform this operation, the user or role must also have the <code>iam:CreateRole</code> and
     * <code>iam:PassRole</code> permissions. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_passrole.html">Granting a user permissions to
     * pass a role to an Amazon Web Services service</a>.
     * </p>
     * </note>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketReplication.html#API_control_PutBucketReplication_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following operations are related to <code>PutBucketReplication</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketReplication.html">
     * GetBucketReplication</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketReplication.html">
     * DeleteBucketReplication</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putBucketReplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutBucketReplication operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.PutBucketReplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutBucketReplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutBucketReplicationResult> putBucketReplicationAsync(PutBucketReplicationRequest putBucketReplicationRequest,
            com.amazonaws.handlers.AsyncHandler<PutBucketReplicationRequest, PutBucketReplicationResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This action puts tags on an Amazon S3 on Outposts bucket. To put tags on an S3 bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketTagging.html">PutBucketTagging</a> in the
     * <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Sets the tags for an S3 on Outposts bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a> in
     * the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * Use tags to organize your Amazon Web Services bill to reflect your own cost structure. To do this, sign up to get
     * your Amazon Web Services account bill with tag key values included. Then, to see the cost of combined resources,
     * organize your billing information according to resources with the same tag key values. For example, you can tag
     * several resources with a specific application name, and then organize your billing information to see the total
     * cost of that application across several services. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Cost allocation and
     * tagging</a>.
     * </p>
     * <note>
     * <p>
     * Within a bucket, if you add a tag that has the same key as an existing tag, the new value overwrites the old
     * value. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/CostAllocTagging.html"> Using cost allocation in
     * Amazon S3 bucket tags</a>.
     * </p>
     * </note>
     * <p>
     * To use this action, you must have permissions to perform the <code>s3-outposts:PutBucketTagging</code> action.
     * The Outposts bucket owner has this permission by default and can grant this permission to others. For more
     * information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * > Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing access permissions
     * to your Amazon S3 resources</a>.
     * </p>
     * <p>
     * <code>PutBucketTagging</code> has the following special errors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Error code: <code>InvalidTagError</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: The tag provided was not a valid tag. This error can occur if the tag did not pass input validation.
     * For information about tag restrictions, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/allocation-tag-restrictions.html">
     * User-Defined Tag Restrictions</a> and <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/aws-tag-restrictions.html"> Amazon Web
     * Services-Generated Cost Allocation Tag Restrictions</a>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Error code: <code>MalformedXMLError</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: The XML provided does not match the schema.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Error code: <code>OperationAbortedError </code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: A conflicting conditional action is currently in progress against this resource. Try again.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Error code: <code>InternalError</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: The service was unable to apply the provided tag to the bucket.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketTagging.html#API_control_PutBucketTagging_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>PutBucketTagging</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketTagging.html">GetBucketTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketTagging.html">DeleteBucketTagging
     * </a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putBucketTaggingRequest
     * @return A Java Future containing the result of the PutBucketTagging operation returned by the service.
     * @sample AWSS3ControlAsync.PutBucketTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutBucketTagging" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutBucketTaggingResult> putBucketTaggingAsync(PutBucketTaggingRequest putBucketTaggingRequest);

    /**
     * <note>
     * <p>
     * This action puts tags on an Amazon S3 on Outposts bucket. To put tags on an S3 bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketTagging.html">PutBucketTagging</a> in the
     * <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Sets the tags for an S3 on Outposts bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using Amazon S3 on Outposts</a> in
     * the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * Use tags to organize your Amazon Web Services bill to reflect your own cost structure. To do this, sign up to get
     * your Amazon Web Services account bill with tag key values included. Then, to see the cost of combined resources,
     * organize your billing information according to resources with the same tag key values. For example, you can tag
     * several resources with a specific application name, and then organize your billing information to see the total
     * cost of that application across several services. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Cost allocation and
     * tagging</a>.
     * </p>
     * <note>
     * <p>
     * Within a bucket, if you add a tag that has the same key as an existing tag, the new value overwrites the old
     * value. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/CostAllocTagging.html"> Using cost allocation in
     * Amazon S3 bucket tags</a>.
     * </p>
     * </note>
     * <p>
     * To use this action, you must have permissions to perform the <code>s3-outposts:PutBucketTagging</code> action.
     * The Outposts bucket owner has this permission by default and can grant this permission to others. For more
     * information about permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-with-s3-actions.html#using-with-s3-actions-related-to-bucket-subresources"
     * > Permissions Related to Bucket Subresource Operations</a> and <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/s3-access-control.html">Managing access permissions
     * to your Amazon S3 resources</a>.
     * </p>
     * <p>
     * <code>PutBucketTagging</code> has the following special errors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Error code: <code>InvalidTagError</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: The tag provided was not a valid tag. This error can occur if the tag did not pass input validation.
     * For information about tag restrictions, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/allocation-tag-restrictions.html">
     * User-Defined Tag Restrictions</a> and <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/aws-tag-restrictions.html"> Amazon Web
     * Services-Generated Cost Allocation Tag Restrictions</a>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Error code: <code>MalformedXMLError</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: The XML provided does not match the schema.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Error code: <code>OperationAbortedError </code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: A conflicting conditional action is currently in progress against this resource. Try again.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Error code: <code>InternalError</code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Description: The service was unable to apply the provided tag to the bucket.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketTagging.html#API_control_PutBucketTagging_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following actions are related to <code>PutBucketTagging</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketTagging.html">GetBucketTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteBucketTagging.html">DeleteBucketTagging
     * </a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putBucketTaggingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutBucketTagging operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.PutBucketTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutBucketTagging" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutBucketTaggingResult> putBucketTaggingAsync(PutBucketTaggingRequest putBucketTaggingRequest,
            com.amazonaws.handlers.AsyncHandler<PutBucketTaggingRequest, PutBucketTaggingResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation sets the versioning state for S3 on Outposts buckets only. To set the versioning state for an S3
     * bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketVersioning.html">PutBucketVersioning</a> in
     * the <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Sets the versioning state for an S3 on Outposts bucket. With S3 Versioning, you can save multiple distinct copies
     * of your objects and recover from unintended user actions and application failures.
     * </p>
     * <p>
     * You can set the versioning state to one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Enabled</b> - Enables versioning for the objects in the bucket. All objects added to the bucket receive a
     * unique version ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Suspended</b> - Suspends versioning for the objects in the bucket. All objects added to the bucket receive the
     * version ID <code>null</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you've never set versioning on your bucket, it has no versioning state. In that case, a <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketVersioning.html">
     * GetBucketVersioning</a> request does not return a versioning state value.
     * </p>
     * <p>
     * When you enable S3 Versioning, for each object in your bucket, you have a current version and zero or more
     * noncurrent versions. You can configure your bucket S3 Lifecycle rules to expire noncurrent versions after a
     * specified time period. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsLifecycleManaging.html"> Creating and
     * managing a lifecycle configuration for your S3 on Outposts bucket</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * If you have an object expiration lifecycle configuration in your non-versioned bucket and you want to maintain
     * the same permanent delete behavior when you enable versioning, you must add a noncurrent expiration policy. The
     * noncurrent expiration lifecycle configuration will manage the deletes of the noncurrent object versions in the
     * version-enabled bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/Versioning.html">Versioning</a> in the <i>Amazon S3
     * User Guide</i>.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketVersioning.html#API_control_PutBucketVersioning_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following operations are related to <code>PutBucketVersioning</code> for S3 on Outposts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketVersioning.html">GetBucketVersioning
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketLifecycleConfiguration.html">
     * PutBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketLifecycleConfiguration.html">
     * GetBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putBucketVersioningRequest
     * @return A Java Future containing the result of the PutBucketVersioning operation returned by the service.
     * @sample AWSS3ControlAsync.PutBucketVersioning
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutBucketVersioning" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutBucketVersioningResult> putBucketVersioningAsync(PutBucketVersioningRequest putBucketVersioningRequest);

    /**
     * <note>
     * <p>
     * This operation sets the versioning state for S3 on Outposts buckets only. To set the versioning state for an S3
     * bucket, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketVersioning.html">PutBucketVersioning</a> in
     * the <i>Amazon S3 API Reference</i>.
     * </p>
     * </note>
     * <p>
     * Sets the versioning state for an S3 on Outposts bucket. With S3 Versioning, you can save multiple distinct copies
     * of your objects and recover from unintended user actions and application failures.
     * </p>
     * <p>
     * You can set the versioning state to one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Enabled</b> - Enables versioning for the objects in the bucket. All objects added to the bucket receive a
     * unique version ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Suspended</b> - Suspends versioning for the objects in the bucket. All objects added to the bucket receive the
     * version ID <code>null</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you've never set versioning on your bucket, it has no versioning state. In that case, a <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketVersioning.html">
     * GetBucketVersioning</a> request does not return a versioning state value.
     * </p>
     * <p>
     * When you enable S3 Versioning, for each object in your bucket, you have a current version and zero or more
     * noncurrent versions. You can configure your bucket S3 Lifecycle rules to expire noncurrent versions after a
     * specified time period. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3OutpostsLifecycleManaging.html"> Creating and
     * managing a lifecycle configuration for your S3 on Outposts bucket</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * If you have an object expiration lifecycle configuration in your non-versioned bucket and you want to maintain
     * the same permanent delete behavior when you enable versioning, you must add a noncurrent expiration policy. The
     * noncurrent expiration lifecycle configuration will manage the deletes of the noncurrent object versions in the
     * version-enabled bucket. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/Versioning.html">Versioning</a> in the <i>Amazon S3
     * User Guide</i>.
     * </p>
     * <p>
     * All Amazon S3 on Outposts REST API requests for this action require an additional parameter of
     * <code>x-amz-outpost-id</code> to be passed with the request. In addition, you must use an S3 on Outposts endpoint
     * hostname prefix instead of <code>s3-control</code>. For an example of the request syntax for Amazon S3 on
     * Outposts that uses the S3 on Outposts endpoint hostname prefix and the <code>x-amz-outpost-id</code> derived by
     * using the access point ARN, see the <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketVersioning.html#API_control_PutBucketVersioning_Examples"
     * >Examples</a> section.
     * </p>
     * <p>
     * The following operations are related to <code>PutBucketVersioning</code> for S3 on Outposts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketVersioning.html">GetBucketVersioning
     * </a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutBucketLifecycleConfiguration.html">
     * PutBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetBucketLifecycleConfiguration.html">
     * GetBucketLifecycleConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putBucketVersioningRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutBucketVersioning operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.PutBucketVersioning
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutBucketVersioning" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutBucketVersioningResult> putBucketVersioningAsync(PutBucketVersioningRequest putBucketVersioningRequest,
            com.amazonaws.handlers.AsyncHandler<PutBucketVersioningRequest, PutBucketVersioningResult> asyncHandler);

    /**
     * <p>
     * Sets the supplied tag-set on an S3 Batch Operations job.
     * </p>
     * <p>
     * A tag is a key-value pair. You can associate S3 Batch Operations tags with any job by sending a PUT request
     * against the tagging subresource that is associated with the job. To modify the existing tag set, you can either
     * replace the existing tag set entirely, or make changes within the existing tag set by retrieving the existing tag
     * set using <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetJobTagging.html">GetJobTagging</a>, modify
     * that tag set, and use this operation to replace the tag set with the one you modified. For more information, see
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-managing-jobs.html#batch-ops-job-tags">
     * Controlling access and labeling jobs using tags</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * If you send this request with an empty tag set, Amazon S3 deletes the existing tag set on the Batch Operations
     * job. If you use this method, you are charged for a Tier 1 Request (PUT). For more information, see <a
     * href="http://aws.amazon.com/s3/pricing/">Amazon S3 pricing</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For deleting existing tags for your Batch Operations job, a <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteJobTagging.html">DeleteJobTagging</a>
     * request is preferred because it achieves the same result without incurring charges.
     * </p>
     * </li>
     * <li>
     * <p>
     * A few things to consider about using tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon S3 limits the maximum number of tags to 50 tags per job.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can associate up to 50 tags with a job as long as they have unique tag keys.
     * </p>
     * </li>
     * <li>
     * <p>
     * A tag key can be up to 128 Unicode characters in length, and tag values can be up to 256 Unicode characters in
     * length.
     * </p>
     * </li>
     * <li>
     * <p>
     * The key and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * For tagging-related restrictions related to characters and encodings, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/allocation-tag-restrictions.html">User-Defined
     * Tag Restrictions</a> in the <i>Billing and Cost Management User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </note>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * To use the <code>PutJobTagging</code> operation, you must have permission to perform the
     * <code>s3:PutJobTagging</code> action.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateJob.html">CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetJobTagging.html">GetJobTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteJobTagging.html">DeleteJobTagging</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putJobTaggingRequest
     * @return A Java Future containing the result of the PutJobTagging operation returned by the service.
     * @sample AWSS3ControlAsync.PutJobTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutJobTagging" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutJobTaggingResult> putJobTaggingAsync(PutJobTaggingRequest putJobTaggingRequest);

    /**
     * <p>
     * Sets the supplied tag-set on an S3 Batch Operations job.
     * </p>
     * <p>
     * A tag is a key-value pair. You can associate S3 Batch Operations tags with any job by sending a PUT request
     * against the tagging subresource that is associated with the job. To modify the existing tag set, you can either
     * replace the existing tag set entirely, or make changes within the existing tag set by retrieving the existing tag
     * set using <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetJobTagging.html">GetJobTagging</a>, modify
     * that tag set, and use this operation to replace the tag set with the one you modified. For more information, see
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-managing-jobs.html#batch-ops-job-tags">
     * Controlling access and labeling jobs using tags</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * If you send this request with an empty tag set, Amazon S3 deletes the existing tag set on the Batch Operations
     * job. If you use this method, you are charged for a Tier 1 Request (PUT). For more information, see <a
     * href="http://aws.amazon.com/s3/pricing/">Amazon S3 pricing</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For deleting existing tags for your Batch Operations job, a <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteJobTagging.html">DeleteJobTagging</a>
     * request is preferred because it achieves the same result without incurring charges.
     * </p>
     * </li>
     * <li>
     * <p>
     * A few things to consider about using tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon S3 limits the maximum number of tags to 50 tags per job.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can associate up to 50 tags with a job as long as they have unique tag keys.
     * </p>
     * </li>
     * <li>
     * <p>
     * A tag key can be up to 128 Unicode characters in length, and tag values can be up to 256 Unicode characters in
     * length.
     * </p>
     * </li>
     * <li>
     * <p>
     * The key and values are case sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * For tagging-related restrictions related to characters and encodings, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/allocation-tag-restrictions.html">User-Defined
     * Tag Restrictions</a> in the <i>Billing and Cost Management User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </note>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * To use the <code>PutJobTagging</code> operation, you must have permission to perform the
     * <code>s3:PutJobTagging</code> action.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateJob.html">CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetJobTagging.html">GetJobTagging</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteJobTagging.html">DeleteJobTagging</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putJobTaggingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutJobTagging operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.PutJobTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutJobTagging" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutJobTaggingResult> putJobTaggingAsync(PutJobTaggingRequest putJobTaggingRequest,
            com.amazonaws.handlers.AsyncHandler<PutJobTaggingRequest, PutJobTaggingResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Associates an access control policy with the specified Multi-Region Access Point. Each Multi-Region Access Point
     * can have only one policy, so a request made to this action replaces any existing policy that is associated with
     * the specified Multi-Region Access Point.
     * </p>
     * <p>
     * This action will always be routed to the US West (Oregon) Region. For more information about the restrictions
     * around working with Multi-Region Access Points, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiRegionAccessPointRestrictions.html">Multi-Region
     * Access Point restrictions and limitations</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * The following actions are related to <code>PutMultiRegionAccessPointPolicy</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetMultiRegionAccessPointPolicy.html">
     * GetMultiRegionAccessPointPolicy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetMultiRegionAccessPointPolicyStatus.html">
     * GetMultiRegionAccessPointPolicyStatus</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putMultiRegionAccessPointPolicyRequest
     * @return A Java Future containing the result of the PutMultiRegionAccessPointPolicy operation returned by the
     *         service.
     * @sample AWSS3ControlAsync.PutMultiRegionAccessPointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutMultiRegionAccessPointPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutMultiRegionAccessPointPolicyResult> putMultiRegionAccessPointPolicyAsync(
            PutMultiRegionAccessPointPolicyRequest putMultiRegionAccessPointPolicyRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Associates an access control policy with the specified Multi-Region Access Point. Each Multi-Region Access Point
     * can have only one policy, so a request made to this action replaces any existing policy that is associated with
     * the specified Multi-Region Access Point.
     * </p>
     * <p>
     * This action will always be routed to the US West (Oregon) Region. For more information about the restrictions
     * around working with Multi-Region Access Points, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiRegionAccessPointRestrictions.html">Multi-Region
     * Access Point restrictions and limitations</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <p>
     * The following actions are related to <code>PutMultiRegionAccessPointPolicy</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetMultiRegionAccessPointPolicy.html">
     * GetMultiRegionAccessPointPolicy</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetMultiRegionAccessPointPolicyStatus.html">
     * GetMultiRegionAccessPointPolicyStatus</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putMultiRegionAccessPointPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutMultiRegionAccessPointPolicy operation returned by the
     *         service.
     * @sample AWSS3ControlAsyncHandler.PutMultiRegionAccessPointPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutMultiRegionAccessPointPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutMultiRegionAccessPointPolicyResult> putMultiRegionAccessPointPolicyAsync(
            PutMultiRegionAccessPointPolicyRequest putMultiRegionAccessPointPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutMultiRegionAccessPointPolicyRequest, PutMultiRegionAccessPointPolicyResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Creates or modifies the <code>PublicAccessBlock</code> configuration for an Amazon Web Services account. For this
     * operation, users must have the <code>s3:PutAccountPublicAccessBlock</code> permission. For more information, see
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html"> Using Amazon
     * S3 block public access</a>.
     * </p>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetPublicAccessBlock.html">
     * GetPublicAccessBlock</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeletePublicAccessBlock.html">
     * DeletePublicAccessBlock</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putPublicAccessBlockRequest
     * @return A Java Future containing the result of the PutPublicAccessBlock operation returned by the service.
     * @sample AWSS3ControlAsync.PutPublicAccessBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutPublicAccessBlock" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutPublicAccessBlockResult> putPublicAccessBlockAsync(PutPublicAccessBlockRequest putPublicAccessBlockRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Creates or modifies the <code>PublicAccessBlock</code> configuration for an Amazon Web Services account. For this
     * operation, users must have the <code>s3:PutAccountPublicAccessBlock</code> permission. For more information, see
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html"> Using Amazon
     * S3 block public access</a>.
     * </p>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_GetPublicAccessBlock.html">
     * GetPublicAccessBlock</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeletePublicAccessBlock.html">
     * DeletePublicAccessBlock</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param putPublicAccessBlockRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutPublicAccessBlock operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.PutPublicAccessBlock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutPublicAccessBlock" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutPublicAccessBlockResult> putPublicAccessBlockAsync(PutPublicAccessBlockRequest putPublicAccessBlockRequest,
            com.amazonaws.handlers.AsyncHandler<PutPublicAccessBlockRequest, PutPublicAccessBlockResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Puts an Amazon S3 Storage Lens configuration. For more information about S3 Storage Lens, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens.html">Working with Amazon S3 Storage Lens</a>
     * in the <i>Amazon S3 User Guide</i>. For a complete list of S3 Storage Lens metrics, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_metrics_glossary.html">S3 Storage Lens
     * metrics glossary</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * To use this action, you must have permission to perform the <code>s3:PutStorageLensConfiguration</code> action.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens_iam_permissions.html">Setting permissions to
     * use Amazon S3 Storage Lens</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </note>
     * 
     * @param putStorageLensConfigurationRequest
     * @return A Java Future containing the result of the PutStorageLensConfiguration operation returned by the service.
     * @sample AWSS3ControlAsync.PutStorageLensConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutStorageLensConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutStorageLensConfigurationResult> putStorageLensConfigurationAsync(
            PutStorageLensConfigurationRequest putStorageLensConfigurationRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Puts an Amazon S3 Storage Lens configuration. For more information about S3 Storage Lens, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens.html">Working with Amazon S3 Storage Lens</a>
     * in the <i>Amazon S3 User Guide</i>. For a complete list of S3 Storage Lens metrics, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_metrics_glossary.html">S3 Storage Lens
     * metrics glossary</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * To use this action, you must have permission to perform the <code>s3:PutStorageLensConfiguration</code> action.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens_iam_permissions.html">Setting permissions to
     * use Amazon S3 Storage Lens</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </note>
     * 
     * @param putStorageLensConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutStorageLensConfiguration operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.PutStorageLensConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutStorageLensConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutStorageLensConfigurationResult> putStorageLensConfigurationAsync(
            PutStorageLensConfigurationRequest putStorageLensConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutStorageLensConfigurationRequest, PutStorageLensConfigurationResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Put or replace tags on an existing Amazon S3 Storage Lens configuration. For more information about S3 Storage
     * Lens, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens.html">Assessing your storage
     * activity and usage with Amazon S3 Storage Lens </a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * To use this action, you must have permission to perform the <code>s3:PutStorageLensConfigurationTagging</code>
     * action. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens_iam_permissions.html">Setting permissions to
     * use Amazon S3 Storage Lens</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </note>
     * 
     * @param putStorageLensConfigurationTaggingRequest
     * @return A Java Future containing the result of the PutStorageLensConfigurationTagging operation returned by the
     *         service.
     * @sample AWSS3ControlAsync.PutStorageLensConfigurationTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutStorageLensConfigurationTagging"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutStorageLensConfigurationTaggingResult> putStorageLensConfigurationTaggingAsync(
            PutStorageLensConfigurationTaggingRequest putStorageLensConfigurationTaggingRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Put or replace tags on an existing Amazon S3 Storage Lens configuration. For more information about S3 Storage
     * Lens, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens.html">Assessing your storage
     * activity and usage with Amazon S3 Storage Lens </a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * <note>
     * <p>
     * To use this action, you must have permission to perform the <code>s3:PutStorageLensConfigurationTagging</code>
     * action. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage_lens_iam_permissions.html">Setting permissions to
     * use Amazon S3 Storage Lens</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * </note>
     * 
     * @param putStorageLensConfigurationTaggingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutStorageLensConfigurationTagging operation returned by the
     *         service.
     * @sample AWSS3ControlAsyncHandler.PutStorageLensConfigurationTagging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutStorageLensConfigurationTagging"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutStorageLensConfigurationTaggingResult> putStorageLensConfigurationTaggingAsync(
            PutStorageLensConfigurationTaggingRequest putStorageLensConfigurationTaggingRequest,
            com.amazonaws.handlers.AsyncHandler<PutStorageLensConfigurationTaggingRequest, PutStorageLensConfigurationTaggingResult> asyncHandler);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Submits an updated route configuration for a Multi-Region Access Point. This API operation updates the routing
     * status for the specified Regions from active to passive, or from passive to active. A value of <code>0</code>
     * indicates a passive status, which means that traffic won't be routed to the specified Region. A value of
     * <code>100</code> indicates an active status, which means that traffic will be routed to the specified Region. At
     * least one Region must be active at all times.
     * </p>
     * <p>
     * When the routing configuration is changed, any in-progress operations (uploads, copies, deletes, and so on) to
     * formerly active Regions will continue to run to their final completion state (success or failure). The routing
     * configurations of any Regions that aren’t specified remain unchanged.
     * </p>
     * <note>
     * <p>
     * Updated routing configurations might not be immediately applied. It can take up to 2 minutes for your changes to
     * take effect.
     * </p>
     * </note>
     * <p>
     * To submit routing control changes and failover requests, use the Amazon S3 failover control infrastructure
     * endpoints in these five Amazon Web Services Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>us-east-1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>us-west-2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ap-southeast-2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ap-northeast-1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>eu-west-1</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param submitMultiRegionAccessPointRoutesRequest
     * @return A Java Future containing the result of the SubmitMultiRegionAccessPointRoutes operation returned by the
     *         service.
     * @sample AWSS3ControlAsync.SubmitMultiRegionAccessPointRoutes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/SubmitMultiRegionAccessPointRoutes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SubmitMultiRegionAccessPointRoutesResult> submitMultiRegionAccessPointRoutesAsync(
            SubmitMultiRegionAccessPointRoutesRequest submitMultiRegionAccessPointRoutesRequest);

    /**
     * <note>
     * <p>
     * This operation is not supported by directory buckets.
     * </p>
     * </note>
     * <p>
     * Submits an updated route configuration for a Multi-Region Access Point. This API operation updates the routing
     * status for the specified Regions from active to passive, or from passive to active. A value of <code>0</code>
     * indicates a passive status, which means that traffic won't be routed to the specified Region. A value of
     * <code>100</code> indicates an active status, which means that traffic will be routed to the specified Region. At
     * least one Region must be active at all times.
     * </p>
     * <p>
     * When the routing configuration is changed, any in-progress operations (uploads, copies, deletes, and so on) to
     * formerly active Regions will continue to run to their final completion state (success or failure). The routing
     * configurations of any Regions that aren’t specified remain unchanged.
     * </p>
     * <note>
     * <p>
     * Updated routing configurations might not be immediately applied. It can take up to 2 minutes for your changes to
     * take effect.
     * </p>
     * </note>
     * <p>
     * To submit routing control changes and failover requests, use the Amazon S3 failover control infrastructure
     * endpoints in these five Amazon Web Services Regions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>us-east-1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>us-west-2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ap-southeast-2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ap-northeast-1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>eu-west-1</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param submitMultiRegionAccessPointRoutesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SubmitMultiRegionAccessPointRoutes operation returned by the
     *         service.
     * @sample AWSS3ControlAsyncHandler.SubmitMultiRegionAccessPointRoutes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/SubmitMultiRegionAccessPointRoutes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SubmitMultiRegionAccessPointRoutesResult> submitMultiRegionAccessPointRoutesAsync(
            SubmitMultiRegionAccessPointRoutesRequest submitMultiRegionAccessPointRoutesRequest,
            com.amazonaws.handlers.AsyncHandler<SubmitMultiRegionAccessPointRoutesRequest, SubmitMultiRegionAccessPointRoutesResult> asyncHandler);

    /**
     * <p>
     * Creates a new Amazon Web Services resource tag or updates an existing resource tag. Each tag is a label
     * consisting of a user-defined key and value. Tags can help you manage, identify, organize, search for, and filter
     * resources. You can add up to 50 Amazon Web Services resource tags for each S3 resource.
     * </p>
     * <note>
     * <p>
     * This operation is only supported for <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage-lens-groups.html">S3 Storage Lens groups</a>
     * and for <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-grants-tagging.html">S3 Access
     * Grants</a>. The tagged resource can be an S3 Storage Lens group or S3 Access Grants instance, registered
     * location, or grant.
     * </p>
     * </note>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:TagResource</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * For more information about the required Storage Lens Groups permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_iam_permissions.html#storage_lens_groups_permissions"
     * >Setting account permissions to use S3 Storage Lens groups</a>.
     * </p>
     * <p>
     * For information about S3 Tagging errors, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html#S3TaggingErrorCodeList">List of Amazon
     * S3 Tagging error codes</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSS3ControlAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Creates a new Amazon Web Services resource tag or updates an existing resource tag. Each tag is a label
     * consisting of a user-defined key and value. Tags can help you manage, identify, organize, search for, and filter
     * resources. You can add up to 50 Amazon Web Services resource tags for each S3 resource.
     * </p>
     * <note>
     * <p>
     * This operation is only supported for <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage-lens-groups.html">S3 Storage Lens groups</a>
     * and for <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-grants-tagging.html">S3 Access
     * Grants</a>. The tagged resource can be an S3 Storage Lens group or S3 Access Grants instance, registered
     * location, or grant.
     * </p>
     * </note>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:TagResource</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * For more information about the required Storage Lens Groups permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_iam_permissions.html#storage_lens_groups_permissions"
     * >Setting account permissions to use S3 Storage Lens groups</a>.
     * </p>
     * <p>
     * For information about S3 Tagging errors, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html#S3TaggingErrorCodeList">List of Amazon
     * S3 Tagging error codes</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * This operation removes the specified Amazon Web Services resource tags from an S3 resource. Each tag is a label
     * consisting of a user-defined key and value. Tags can help you manage, identify, organize, search for, and filter
     * resources.
     * </p>
     * <note>
     * <p>
     * This operation is only supported for <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage-lens-groups.html">S3 Storage Lens groups</a>
     * and for <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-grants-tagging.html">S3 Access
     * Grants</a>. The tagged resource can be an S3 Storage Lens group or S3 Access Grants instance, registered
     * location, or grant.
     * </p>
     * </note>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:UntagResource</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * For more information about the required Storage Lens Groups permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_iam_permissions.html#storage_lens_groups_permissions"
     * >Setting account permissions to use S3 Storage Lens groups</a>.
     * </p>
     * <p>
     * For information about S3 Tagging errors, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html#S3TaggingErrorCodeList">List of Amazon
     * S3 Tagging error codes</a>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSS3ControlAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * This operation removes the specified Amazon Web Services resource tags from an S3 resource. Each tag is a label
     * consisting of a user-defined key and value. Tags can help you manage, identify, organize, search for, and filter
     * resources.
     * </p>
     * <note>
     * <p>
     * This operation is only supported for <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage-lens-groups.html">S3 Storage Lens groups</a>
     * and for <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-grants-tagging.html">S3 Access
     * Grants</a>. The tagged resource can be an S3 Storage Lens group or S3 Access Grants instance, registered
     * location, or grant.
     * </p>
     * </note>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:UntagResource</code> permission to use this operation.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * For more information about the required Storage Lens Groups permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_iam_permissions.html#storage_lens_groups_permissions"
     * >Setting account permissions to use S3 Storage Lens groups</a>.
     * </p>
     * <p>
     * For information about S3 Tagging errors, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html#S3TaggingErrorCodeList">List of Amazon
     * S3 Tagging error codes</a>.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the IAM role of a registered location in your S3 Access Grants instance.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:UpdateAccessGrantsLocation</code> permission to use this operation.
     * </p>
     * </dd>
     * <dt>Additional Permissions</dt>
     * <dd>
     * <p>
     * You must also have the following permission: <code>iam:PassRole</code>
     * </p>
     * </dd>
     * </dl>
     * 
     * @param updateAccessGrantsLocationRequest
     * @return A Java Future containing the result of the UpdateAccessGrantsLocation operation returned by the service.
     * @sample AWSS3ControlAsync.UpdateAccessGrantsLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/UpdateAccessGrantsLocation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAccessGrantsLocationResult> updateAccessGrantsLocationAsync(
            UpdateAccessGrantsLocationRequest updateAccessGrantsLocationRequest);

    /**
     * <p>
     * Updates the IAM role of a registered location in your S3 Access Grants instance.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * You must have the <code>s3:UpdateAccessGrantsLocation</code> permission to use this operation.
     * </p>
     * </dd>
     * <dt>Additional Permissions</dt>
     * <dd>
     * <p>
     * You must also have the following permission: <code>iam:PassRole</code>
     * </p>
     * </dd>
     * </dl>
     * 
     * @param updateAccessGrantsLocationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAccessGrantsLocation operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.UpdateAccessGrantsLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/UpdateAccessGrantsLocation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAccessGrantsLocationResult> updateAccessGrantsLocationAsync(
            UpdateAccessGrantsLocationRequest updateAccessGrantsLocationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAccessGrantsLocationRequest, UpdateAccessGrantsLocationResult> asyncHandler);

    /**
     * <p>
     * Updates an existing S3 Batch Operations job's priority. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/batch-ops.html">S3 Batch Operations</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * To use the <code>UpdateJobPriority</code> operation, you must have permission to perform the
     * <code>s3:UpdateJobPriority</code> action.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateJob.html">CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListJobs.html">ListJobs</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DescribeJob.html">DescribeJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_UpdateJobStatus.html">UpdateJobStatus</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateJobPriorityRequest
     * @return A Java Future containing the result of the UpdateJobPriority operation returned by the service.
     * @sample AWSS3ControlAsync.UpdateJobPriority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/UpdateJobPriority" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateJobPriorityResult> updateJobPriorityAsync(UpdateJobPriorityRequest updateJobPriorityRequest);

    /**
     * <p>
     * Updates an existing S3 Batch Operations job's priority. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/batch-ops.html">S3 Batch Operations</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * To use the <code>UpdateJobPriority</code> operation, you must have permission to perform the
     * <code>s3:UpdateJobPriority</code> action.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateJob.html">CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListJobs.html">ListJobs</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DescribeJob.html">DescribeJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_UpdateJobStatus.html">UpdateJobStatus</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateJobPriorityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateJobPriority operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.UpdateJobPriority
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/UpdateJobPriority" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateJobPriorityResult> updateJobPriorityAsync(UpdateJobPriorityRequest updateJobPriorityRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateJobPriorityRequest, UpdateJobPriorityResult> asyncHandler);

    /**
     * <p>
     * Updates the status for the specified job. Use this operation to confirm that you want to run a job or to cancel
     * an existing job. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/batch-ops.html">S3 Batch Operations</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * To use the <code>UpdateJobStatus</code> operation, you must have permission to perform the
     * <code>s3:UpdateJobStatus</code> action.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateJob.html">CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListJobs.html">ListJobs</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DescribeJob.html">DescribeJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_UpdateJobStatus.html">UpdateJobStatus</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateJobStatusRequest
     * @return A Java Future containing the result of the UpdateJobStatus operation returned by the service.
     * @sample AWSS3ControlAsync.UpdateJobStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/UpdateJobStatus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateJobStatusResult> updateJobStatusAsync(UpdateJobStatusRequest updateJobStatusRequest);

    /**
     * <p>
     * Updates the status for the specified job. Use this operation to confirm that you want to run a job or to cancel
     * an existing job. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/batch-ops.html">S3 Batch Operations</a> in the
     * <i>Amazon S3 User Guide</i>.
     * </p>
     * <dl>
     * <dt>Permissions</dt>
     * <dd>
     * <p>
     * To use the <code>UpdateJobStatus</code> operation, you must have permission to perform the
     * <code>s3:UpdateJobStatus</code> action.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Related actions include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateJob.html">CreateJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_ListJobs.html">ListJobs</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DescribeJob.html">DescribeJob</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_UpdateJobStatus.html">UpdateJobStatus</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateJobStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateJobStatus operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.UpdateJobStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/UpdateJobStatus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateJobStatusResult> updateJobStatusAsync(UpdateJobStatusRequest updateJobStatusRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateJobStatusRequest, UpdateJobStatusResult> asyncHandler);

    /**
     * <p>
     * Updates the existing Storage Lens group.
     * </p>
     * <p>
     * To use this operation, you must have the permission to perform the <code>s3:UpdateStorageLensGroup</code> action.
     * For more information about the required Storage Lens Groups permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_iam_permissions.html#storage_lens_groups_permissions"
     * >Setting account permissions to use S3 Storage Lens groups</a>.
     * </p>
     * <p>
     * For information about Storage Lens groups errors, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html#S3LensErrorCodeList">List of Amazon S3
     * Storage Lens error codes</a>.
     * </p>
     * 
     * @param updateStorageLensGroupRequest
     * @return A Java Future containing the result of the UpdateStorageLensGroup operation returned by the service.
     * @sample AWSS3ControlAsync.UpdateStorageLensGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/UpdateStorageLensGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateStorageLensGroupResult> updateStorageLensGroupAsync(UpdateStorageLensGroupRequest updateStorageLensGroupRequest);

    /**
     * <p>
     * Updates the existing Storage Lens group.
     * </p>
     * <p>
     * To use this operation, you must have the permission to perform the <code>s3:UpdateStorageLensGroup</code> action.
     * For more information about the required Storage Lens Groups permissions, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_iam_permissions.html#storage_lens_groups_permissions"
     * >Setting account permissions to use S3 Storage Lens groups</a>.
     * </p>
     * <p>
     * For information about Storage Lens groups errors, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/ErrorResponses.html#S3LensErrorCodeList">List of Amazon S3
     * Storage Lens error codes</a>.
     * </p>
     * 
     * @param updateStorageLensGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateStorageLensGroup operation returned by the service.
     * @sample AWSS3ControlAsyncHandler.UpdateStorageLensGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/UpdateStorageLensGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateStorageLensGroupResult> updateStorageLensGroupAsync(UpdateStorageLensGroupRequest updateStorageLensGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateStorageLensGroupRequest, UpdateStorageLensGroupResult> asyncHandler);

}
