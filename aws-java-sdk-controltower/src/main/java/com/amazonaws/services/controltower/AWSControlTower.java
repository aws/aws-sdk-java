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
package com.amazonaws.services.controltower;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.controltower.model.*;

/**
 * Interface for accessing AWS Control Tower.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.controltower.AbstractAWSControlTower} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Web Services Control Tower offers application programming interface (API) operations that support programmatic
 * interaction with these types of resources:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/controls.html"> <i>controls</i> </a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/lz-api-launch.html"> <i>landing zones</i> </a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/types-of-baselines.html"> <i>baselines</i> </a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information about these types of resources, see the <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/what-is-control-tower.html"> <i>Amazon Web Services
 * Control Tower User Guide</i> </a>.
 * </p>
 * <p>
 * <b>About control APIs</b>
 * </p>
 * <p>
 * These interfaces allow you to apply the Amazon Web Services library of pre-defined <i>controls</i> to your
 * organizational units, programmatically. In Amazon Web Services Control Tower, the terms "control" and "guardrail" are
 * synonyms.
 * </p>
 * <p>
 * To call these APIs, you'll need to know:
 * </p>
 * <ul>
 * <li>
 * <p>
 * the <code>controlIdentifier</code> for the control--or guardrail--you are targeting.
 * </p>
 * </li>
 * <li>
 * <p>
 * the ARN associated with the target organizational unit (OU), which we call the <code>targetIdentifier</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * the ARN associated with a resource that you wish to tag or untag.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>To get the <code>controlIdentifier</code> for your Amazon Web Services Control Tower control:</b>
 * </p>
 * <p>
 * The <code>controlIdentifier</code> is an ARN that is specified for each control. You can view the
 * <code>controlIdentifier</code> in the console on the <b>Control details</b> page, as well as in the documentation.
 * </p>
 * <p>
 * The <code>controlIdentifier</code> is unique in each Amazon Web Services Region for each control. You can find the
 * <code>controlIdentifier</code> for each Region and control in the <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-metadata-tables.html">Tables of control
 * metadata</a> or the <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-region-tables.html">Control availability by
 * Region tables</a> in the <i>Amazon Web Services Control Tower User Guide.</i>
 * </p>
 * <p>
 * A quick-reference list of control identifers for the Amazon Web Services Control Tower legacy <i>Strongly
 * recommended</i> and <i>Elective</i> controls is given in <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-identifiers.html.html">Resource identifiers
 * for APIs and controls</a> in the <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-identifiers.html">Controls reference guide
 * section</a> of the <i>Amazon Web Services Control Tower User Guide</i>. Remember that <i>Mandatory</i> controls
 * cannot be added or removed.
 * </p>
 * <note>
 * <p>
 * <b>ARN format:</b> <code>arn:aws:controltower:{REGION}::control/{CONTROL_NAME}</code>
 * </p>
 * <p>
 * <b>Example:</b>
 * </p>
 * <p>
 * <code>arn:aws:controltower:us-west-2::control/AWS-GR_AUTOSCALING_LAUNCH_CONFIG_PUBLIC_IP_DISABLED</code>
 * </p>
 * </note>
 * <p>
 * <b>To get the <code>targetIdentifier</code>:</b>
 * </p>
 * <p>
 * The <code>targetIdentifier</code> is the ARN for an OU.
 * </p>
 * <p>
 * In the Amazon Web Services Organizations console, you can find the ARN for the OU on the <b>Organizational unit
 * details</b> page associated with that OU.
 * </p>
 * <note>
 * <p>
 * <b>OU ARN format:</b>
 * </p>
 * <p>
 * <code>arn:${Partition}:organizations::${MasterAccountId}:ou/o-${OrganizationId}/ou-${OrganizationalUnitId}</code>
 * </p>
 * </note>
 * <p>
 * <b> About landing zone APIs</b>
 * </p>
 * <p>
 * You can configure and launch an Amazon Web Services Control Tower landing zone with APIs. For an introduction and
 * steps, see <a href="https://docs.aws.amazon.com/controltower/latest/userguide/getting-started-apis.html">Getting
 * started with Amazon Web Services Control Tower using APIs</a>.
 * </p>
 * <p>
 * For an overview of landing zone API operations, see <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/2023-all.html#landing-zone-apis"> Amazon Web Services
 * Control Tower supports landing zone APIs</a>. The individual API operations for landing zones are detailed in this
 * document, the <a href="https://docs.aws.amazon.com/controltower/latest/APIReference/API_Operations.html">API
 * reference manual</a>, in the "Actions" section.
 * </p>
 * <p>
 * <b>About baseline APIs</b>
 * </p>
 * <p>
 * You can apply the <code>AWSControlTowerBaseline</code> baseline to an organizational unit (OU) as a way to register
 * the OU with Amazon Web Services Control Tower, programmatically. For a general overview of this capability, see <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/2024-all.html#baseline-apis">Amazon Web Services
 * Control Tower supports APIs for OU registration and configuration with baselines</a>.
 * </p>
 * <p>
 * You can call the baseline API operations to view the baselines that Amazon Web Services Control Tower enables for
 * your landing zone, on your behalf, when setting up the landing zone. These baselines are read-only baselines.
 * </p>
 * <p>
 * The individual API operations for baselines are detailed in this document, the <a
 * href="https://docs.aws.amazon.com/controltower/latest/APIReference/API_Operations.html">API reference manual</a>, in
 * the "Actions" section. For usage examples, see <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/baseline-api-examples.html">Baseline API input and
 * output examples with CLI</a>.
 * </p>
 * <p class="title">
 * <b>Details and examples</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html">Control API input
 * and output examples with CLI</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/baseline-api-examples.html">Baseline API input and
 * output examples with CLI</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/enable-controls.html">Enable controls with
 * CloudFormation</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/lz-apis-cfn-setup.html">Launch a landing zone with
 * CloudFormation</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/control-metadata-tables.html">Control metadata
 * tables (large page)</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/control-region-tables.html">Control availability
 * by Region tables (large page)</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/control-identifiers.html">List of identifiers for
 * legacy controls</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/controls.html">Controls reference guide</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/controls-reference.html">Controls library
 * groupings</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/controltower/latest/userguide/creating-resources-with-cloudformation.html">
 * Creating Amazon Web Services Control Tower resources with Amazon Web Services CloudFormation</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * To view the open source resource repository on GitHub, see <a
 * href="https://github.com/aws-cloudformation/aws-cloudformation-resource-providers-controltower"
 * >aws-cloudformation/aws-cloudformation-resource-providers-controltower</a>
 * </p>
 * <p>
 * <b>Recording API Requests</b>
 * </p>
 * <p>
 * Amazon Web Services Control Tower supports Amazon Web Services CloudTrail, a service that records Amazon Web Services
 * API calls for your Amazon Web Services account and delivers log files to an Amazon S3 bucket. By using information
 * collected by CloudTrail, you can determine which requests the Amazon Web Services Control Tower service received, who
 * made the request and when, and so on. For more about Amazon Web Services Control Tower and its support for
 * CloudTrail, see <a
 * href="https://docs.aws.amazon.com/controltower/latest/userguide/logging-using-cloudtrail.html">Logging Amazon Web
 * Services Control Tower Actions with Amazon Web Services CloudTrail</a> in the Amazon Web Services Control Tower User
 * Guide. To learn more about CloudTrail, including how to turn it on and find your log files, see the Amazon Web
 * Services CloudTrail User Guide.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSControlTower {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "controltower";

    /**
     * <p>
     * Decommissions a landing zone. This API call starts an asynchronous operation that deletes Amazon Web Services
     * Control Tower resources deployed in accounts managed by Amazon Web Services Control Tower.
     * </p>
     * 
     * @param deleteLandingZoneRequest
     * @return Result of the DeleteLandingZone operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws ConflictException
     *         Updating or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSControlTower.DeleteLandingZone
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/DeleteLandingZone" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteLandingZoneResult deleteLandingZone(DeleteLandingZoneRequest deleteLandingZoneRequest);

    /**
     * <p>
     * Disable an <code>EnabledBaseline</code> resource on the specified Target. This API starts an asynchronous
     * operation to remove all resources deployed as part of the baseline enablement. The resource will vary depending
     * on the enabled baseline. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/baseline-api-examples.html"> <i>the Amazon Web
     * Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param disableBaselineRequest
     * @return Result of the DisableBaseline operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws ConflictException
     *         Updating or deleting the resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded. The limit is 10 concurrent operations.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSControlTower.DisableBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/DisableBaseline" target="_top">AWS
     *      API Documentation</a>
     */
    DisableBaselineResult disableBaseline(DisableBaselineRequest disableBaselineRequest);

    /**
     * <p>
     * This API call turns off a control. It starts an asynchronous operation that deletes AWS resources on the
     * specified organizational unit and the accounts it contains. The resources will vary according to the control that
     * you specify. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html"> <i>the Amazon
     * Web Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param disableControlRequest
     * @return Result of the DisableControl operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws ConflictException
     *         Updating or deleting the resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded. The limit is 10 concurrent operations.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSControlTower.DisableControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/DisableControl" target="_top">AWS
     *      API Documentation</a>
     */
    DisableControlResult disableControl(DisableControlRequest disableControlRequest);

    /**
     * <p>
     * Enable (apply) a <code>Baseline</code> to a Target. This API starts an asynchronous operation to deploy resources
     * specified by the <code>Baseline</code> to the specified Target. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/baseline-api-examples.html"> <i>the Amazon Web
     * Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param enableBaselineRequest
     * @return Result of the EnableBaseline operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws ConflictException
     *         Updating or deleting the resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded. The limit is 10 concurrent operations.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSControlTower.EnableBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/EnableBaseline" target="_top">AWS
     *      API Documentation</a>
     */
    EnableBaselineResult enableBaseline(EnableBaselineRequest enableBaselineRequest);

    /**
     * <p>
     * This API call activates a control. It starts an asynchronous operation that creates Amazon Web Services resources
     * on the specified organizational unit and the accounts it contains. The resources created will vary according to
     * the control that you specify. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html"> <i>the Amazon
     * Web Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param enableControlRequest
     * @return Result of the EnableControl operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws ConflictException
     *         Updating or deleting the resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded. The limit is 10 concurrent operations.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSControlTower.EnableControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/EnableControl" target="_top">AWS API
     *      Documentation</a>
     */
    EnableControlResult enableControl(EnableControlRequest enableControlRequest);

    /**
     * <p>
     * Retrieve details about an existing <code>Baseline</code> resource by specifying its identifier. For usage
     * examples, see <a href="https://docs.aws.amazon.com/controltower/latest/userguide/baseline-api-examples.html">
     * <i>the Amazon Web Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param getBaselineRequest
     * @return Result of the GetBaseline operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSControlTower.GetBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/GetBaseline" target="_top">AWS API
     *      Documentation</a>
     */
    GetBaselineResult getBaseline(GetBaselineRequest getBaselineRequest);

    /**
     * <p>
     * Returns the details of an asynchronous baseline operation, as initiated by any of these APIs:
     * <code>EnableBaseline</code>, <code>DisableBaseline</code>, <code>UpdateEnabledBaseline</code>,
     * <code>ResetEnabledBaseline</code>. A status message is displayed in case of operation failure. For usage
     * examples, see <a href="https://docs.aws.amazon.com/controltower/latest/userguide/baseline-api-examples.html">
     * <i>the Amazon Web Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param getBaselineOperationRequest
     * @return Result of the GetBaselineOperation operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSControlTower.GetBaselineOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/GetBaselineOperation"
     *      target="_top">AWS API Documentation</a>
     */
    GetBaselineOperationResult getBaselineOperation(GetBaselineOperationRequest getBaselineOperationRequest);

    /**
     * <p>
     * Returns the status of a particular <code>EnableControl</code> or <code>DisableControl</code> operation. Displays
     * a message in case of error. Details for an operation are available for 90 days. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html"> <i>the Amazon
     * Web Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param getControlOperationRequest
     * @return Result of the GetControlOperation operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSControlTower.GetControlOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/GetControlOperation"
     *      target="_top">AWS API Documentation</a>
     */
    GetControlOperationResult getControlOperation(GetControlOperationRequest getControlOperationRequest);

    /**
     * <p>
     * Retrieve details of an <code>EnabledBaseline</code> resource by specifying its identifier.
     * </p>
     * 
     * @param getEnabledBaselineRequest
     * @return Result of the GetEnabledBaseline operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSControlTower.GetEnabledBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/GetEnabledBaseline"
     *      target="_top">AWS API Documentation</a>
     */
    GetEnabledBaselineResult getEnabledBaseline(GetEnabledBaselineRequest getEnabledBaselineRequest);

    /**
     * <p>
     * Retrieves details about an enabled control. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html"> <i>the Amazon
     * Web Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param getEnabledControlRequest
     * @return Result of the GetEnabledControl operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSControlTower.GetEnabledControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/GetEnabledControl" target="_top">AWS
     *      API Documentation</a>
     */
    GetEnabledControlResult getEnabledControl(GetEnabledControlRequest getEnabledControlRequest);

    /**
     * <p>
     * Returns the status of the specified landing zone operation. Details for an operation are available for 90 days.
     * </p>
     * 
     * @param getLandingZoneOperationRequest
     * @return Result of the GetLandingZoneOperation operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSControlTower.GetLandingZoneOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/GetLandingZoneOperation"
     *      target="_top">AWS API Documentation</a>
     */
    GetLandingZoneOperationResult getLandingZoneOperation(GetLandingZoneOperationRequest getLandingZoneOperationRequest);

    /**
     * <p>
     * Returns a summary list of all available baselines. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/baseline-api-examples.html"> <i>the Amazon Web
     * Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param listBaselinesRequest
     * @return Result of the ListBaselines operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSControlTower.ListBaselines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/ListBaselines" target="_top">AWS API
     *      Documentation</a>
     */
    ListBaselinesResult listBaselines(ListBaselinesRequest listBaselinesRequest);

    /**
     * <p>
     * Provides a list of operations in progress or queued.
     * </p>
     * 
     * @param listControlOperationsRequest
     * @return Result of the ListControlOperations operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSControlTower.ListControlOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/ListControlOperations"
     *      target="_top">AWS API Documentation</a>
     */
    ListControlOperationsResult listControlOperations(ListControlOperationsRequest listControlOperationsRequest);

    /**
     * <p>
     * Returns a list of summaries describing <code>EnabledBaseline</code> resources. You can filter the list by the
     * corresponding <code>Baseline</code> or <code>Target</code> of the <code>EnabledBaseline</code> resources. For
     * usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/baseline-api-examples.html"> <i>the Amazon Web
     * Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param listEnabledBaselinesRequest
     * @return Result of the ListEnabledBaselines operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSControlTower.ListEnabledBaselines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/ListEnabledBaselines"
     *      target="_top">AWS API Documentation</a>
     */
    ListEnabledBaselinesResult listEnabledBaselines(ListEnabledBaselinesRequest listEnabledBaselinesRequest);

    /**
     * <p>
     * Lists the controls enabled by Amazon Web Services Control Tower on the specified organizational unit and the
     * accounts it contains. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html"> <i>the Amazon
     * Web Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param listEnabledControlsRequest
     * @return Result of the ListEnabledControls operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSControlTower.ListEnabledControls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/ListEnabledControls"
     *      target="_top">AWS API Documentation</a>
     */
    ListEnabledControlsResult listEnabledControls(ListEnabledControlsRequest listEnabledControlsRequest);

    /**
     * <p>
     * Returns the landing zone ARN for the landing zone deployed in your managed account. This API also creates an ARN
     * for existing accounts that do not yet have a landing zone ARN.
     * </p>
     * <p>
     * Returns one landing zone ARN.
     * </p>
     * 
     * @param listLandingZonesRequest
     * @return Result of the ListLandingZones operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSControlTower.ListLandingZones
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/ListLandingZones" target="_top">AWS
     *      API Documentation</a>
     */
    ListLandingZonesResult listLandingZones(ListLandingZonesRequest listLandingZonesRequest);

    /**
     * <p>
     * Returns a list of tags associated with the resource. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html"> <i>the Amazon
     * Web Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSControlTower.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Re-enables an <code>EnabledBaseline</code> resource. For example, this API can re-apply the existing
     * <code>Baseline</code> after a new member account is moved to the target OU. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/baseline-api-examples.html"> <i>the Amazon Web
     * Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param resetEnabledBaselineRequest
     * @return Result of the ResetEnabledBaseline operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws ConflictException
     *         Updating or deleting the resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded. The limit is 10 concurrent operations.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSControlTower.ResetEnabledBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/ResetEnabledBaseline"
     *      target="_top">AWS API Documentation</a>
     */
    ResetEnabledBaselineResult resetEnabledBaseline(ResetEnabledBaselineRequest resetEnabledBaselineRequest);

    /**
     * <p>
     * This API call resets a landing zone. It starts an asynchronous operation that resets the landing zone to the
     * parameters specified in its original configuration.
     * </p>
     * 
     * @param resetLandingZoneRequest
     * @return Result of the ResetLandingZone operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws ConflictException
     *         Updating or deleting the resource can cause an inconsistent state.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSControlTower.ResetLandingZone
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/ResetLandingZone" target="_top">AWS
     *      API Documentation</a>
     */
    ResetLandingZoneResult resetLandingZone(ResetLandingZoneRequest resetLandingZoneRequest);

    /**
     * <p>
     * Applies tags to a resource. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html"> <i>the Amazon
     * Web Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSControlTower.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes tags from a resource. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/control-api-examples-short.html"> <i>the Amazon
     * Web Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSControlTower.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates an <code>EnabledBaseline</code> resource's applied parameters or version. For usage examples, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/userguide/baseline-api-examples.html"> <i>the Amazon Web
     * Services Control Tower User Guide</i> </a>.
     * </p>
     * 
     * @param updateEnabledBaselineRequest
     * @return Result of the UpdateEnabledBaseline operation returned by the service.
     * @throws ValidationException
     *         The input does not satisfy the constraints specified by an Amazon Web Services service.
     * @throws ConflictException
     *         Updating or deleting the resource can cause an inconsistent state.
     * @throws ServiceQuotaExceededException
     *         The request would cause a service quota to be exceeded. The limit is 10 concurrent operations.
     * @throws InternalServerException
     *         An unexpected error occurred during processing of a request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ResourceNotFoundException
     *         The request references a resource that does not exist.
     * @sample AWSControlTower.UpdateEnabledBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/UpdateEnabledBaseline"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateEnabledBaselineResult updateEnabledBaseline(UpdateEnabledBaselineRequest updateEnabledBaselineRequest);

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

}
