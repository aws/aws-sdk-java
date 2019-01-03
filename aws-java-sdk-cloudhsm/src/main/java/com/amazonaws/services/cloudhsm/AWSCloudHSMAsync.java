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
package com.amazonaws.services.cloudhsm;

import javax.annotation.Generated;

import com.amazonaws.services.cloudhsm.model.*;

/**
 * Interface for accessing CloudHSM asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cloudhsm.AbstractAWSCloudHSMAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS CloudHSM Service</fullname>
 * <p>
 * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
 * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
 * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
 * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
 * </p>
 * <p>
 * <b>For information about the current version of AWS CloudHSM</b>, see <a href="http://aws.amazon.com/cloudhsm/">AWS
 * CloudHSM</a>, the <a href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and
 * the <a href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSCloudHSMAsync extends AWSCloudHSM {

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Adds or overwrites one or more tags for the specified AWS CloudHSM resource.
     * </p>
     * <p>
     * Each tag consists of a key and a value. Tag keys must be unique to each resource.
     * </p>
     * 
     * @param addTagsToResourceRequest
     * @return A Java Future containing the result of the AddTagsToResource operation returned by the service.
     * @sample AWSCloudHSMAsync.AddTagsToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/AddTagsToResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(AddTagsToResourceRequest addTagsToResourceRequest);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Adds or overwrites one or more tags for the specified AWS CloudHSM resource.
     * </p>
     * <p>
     * Each tag consists of a key and a value. Tag keys must be unique to each resource.
     * </p>
     * 
     * @param addTagsToResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddTagsToResource operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.AddTagsToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/AddTagsToResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(AddTagsToResourceRequest addTagsToResourceRequest,
            com.amazonaws.handlers.AsyncHandler<AddTagsToResourceRequest, AddTagsToResourceResult> asyncHandler);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Creates a high-availability partition group. A high-availability partition group is a group of partitions that
     * spans multiple physical HSMs.
     * </p>
     * 
     * @param createHapgRequest
     *        Contains the inputs for the <a>CreateHapgRequest</a> action.
     * @return A Java Future containing the result of the CreateHapg operation returned by the service.
     * @sample AWSCloudHSMAsync.CreateHapg
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/CreateHapg" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateHapgResult> createHapgAsync(CreateHapgRequest createHapgRequest);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Creates a high-availability partition group. A high-availability partition group is a group of partitions that
     * spans multiple physical HSMs.
     * </p>
     * 
     * @param createHapgRequest
     *        Contains the inputs for the <a>CreateHapgRequest</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateHapg operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.CreateHapg
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/CreateHapg" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateHapgResult> createHapgAsync(CreateHapgRequest createHapgRequest,
            com.amazonaws.handlers.AsyncHandler<CreateHapgRequest, CreateHapgResult> asyncHandler);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Creates an uninitialized HSM instance.
     * </p>
     * <p>
     * There is an upfront fee charged for each HSM instance that you create with the <code>CreateHsm</code> operation.
     * If you accidentally provision an HSM and want to request a refund, delete the instance using the <a>DeleteHsm</a>
     * operation, go to the <a href="https://console.aws.amazon.com/support/home">AWS Support Center</a>, create a new
     * case, and select <b>Account and Billing Support</b>.
     * </p>
     * <important>
     * <p>
     * It can take up to 20 minutes to create and provision an HSM. You can monitor the status of the HSM with the
     * <a>DescribeHsm</a> operation. The HSM is ready to be initialized when the status changes to <code>RUNNING</code>.
     * </p>
     * </important>
     * 
     * @param createHsmRequest
     *        Contains the inputs for the <code>CreateHsm</code> operation.
     * @return A Java Future containing the result of the CreateHsm operation returned by the service.
     * @sample AWSCloudHSMAsync.CreateHsm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/CreateHsm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateHsmResult> createHsmAsync(CreateHsmRequest createHsmRequest);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Creates an uninitialized HSM instance.
     * </p>
     * <p>
     * There is an upfront fee charged for each HSM instance that you create with the <code>CreateHsm</code> operation.
     * If you accidentally provision an HSM and want to request a refund, delete the instance using the <a>DeleteHsm</a>
     * operation, go to the <a href="https://console.aws.amazon.com/support/home">AWS Support Center</a>, create a new
     * case, and select <b>Account and Billing Support</b>.
     * </p>
     * <important>
     * <p>
     * It can take up to 20 minutes to create and provision an HSM. You can monitor the status of the HSM with the
     * <a>DescribeHsm</a> operation. The HSM is ready to be initialized when the status changes to <code>RUNNING</code>.
     * </p>
     * </important>
     * 
     * @param createHsmRequest
     *        Contains the inputs for the <code>CreateHsm</code> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateHsm operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.CreateHsm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/CreateHsm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateHsmResult> createHsmAsync(CreateHsmRequest createHsmRequest,
            com.amazonaws.handlers.AsyncHandler<CreateHsmRequest, CreateHsmResult> asyncHandler);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Creates an HSM client.
     * </p>
     * 
     * @param createLunaClientRequest
     *        Contains the inputs for the <a>CreateLunaClient</a> action.
     * @return A Java Future containing the result of the CreateLunaClient operation returned by the service.
     * @sample AWSCloudHSMAsync.CreateLunaClient
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/CreateLunaClient" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLunaClientResult> createLunaClientAsync(CreateLunaClientRequest createLunaClientRequest);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Creates an HSM client.
     * </p>
     * 
     * @param createLunaClientRequest
     *        Contains the inputs for the <a>CreateLunaClient</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLunaClient operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.CreateLunaClient
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/CreateLunaClient" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLunaClientResult> createLunaClientAsync(CreateLunaClientRequest createLunaClientRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLunaClientRequest, CreateLunaClientResult> asyncHandler);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Deletes a high-availability partition group.
     * </p>
     * 
     * @param deleteHapgRequest
     *        Contains the inputs for the <a>DeleteHapg</a> action.
     * @return A Java Future containing the result of the DeleteHapg operation returned by the service.
     * @sample AWSCloudHSMAsync.DeleteHapg
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/DeleteHapg" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteHapgResult> deleteHapgAsync(DeleteHapgRequest deleteHapgRequest);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Deletes a high-availability partition group.
     * </p>
     * 
     * @param deleteHapgRequest
     *        Contains the inputs for the <a>DeleteHapg</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteHapg operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.DeleteHapg
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/DeleteHapg" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteHapgResult> deleteHapgAsync(DeleteHapgRequest deleteHapgRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteHapgRequest, DeleteHapgResult> asyncHandler);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Deletes an HSM. After completion, this operation cannot be undone and your key material cannot be recovered.
     * </p>
     * 
     * @param deleteHsmRequest
     *        Contains the inputs for the <a>DeleteHsm</a> operation.
     * @return A Java Future containing the result of the DeleteHsm operation returned by the service.
     * @sample AWSCloudHSMAsync.DeleteHsm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/DeleteHsm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteHsmResult> deleteHsmAsync(DeleteHsmRequest deleteHsmRequest);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Deletes an HSM. After completion, this operation cannot be undone and your key material cannot be recovered.
     * </p>
     * 
     * @param deleteHsmRequest
     *        Contains the inputs for the <a>DeleteHsm</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteHsm operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.DeleteHsm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/DeleteHsm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteHsmResult> deleteHsmAsync(DeleteHsmRequest deleteHsmRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteHsmRequest, DeleteHsmResult> asyncHandler);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Deletes a client.
     * </p>
     * 
     * @param deleteLunaClientRequest
     * @return A Java Future containing the result of the DeleteLunaClient operation returned by the service.
     * @sample AWSCloudHSMAsync.DeleteLunaClient
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/DeleteLunaClient" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLunaClientResult> deleteLunaClientAsync(DeleteLunaClientRequest deleteLunaClientRequest);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Deletes a client.
     * </p>
     * 
     * @param deleteLunaClientRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLunaClient operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.DeleteLunaClient
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/DeleteLunaClient" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLunaClientResult> deleteLunaClientAsync(DeleteLunaClientRequest deleteLunaClientRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLunaClientRequest, DeleteLunaClientResult> asyncHandler);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Retrieves information about a high-availability partition group.
     * </p>
     * 
     * @param describeHapgRequest
     *        Contains the inputs for the <a>DescribeHapg</a> action.
     * @return A Java Future containing the result of the DescribeHapg operation returned by the service.
     * @sample AWSCloudHSMAsync.DescribeHapg
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/DescribeHapg" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeHapgResult> describeHapgAsync(DescribeHapgRequest describeHapgRequest);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Retrieves information about a high-availability partition group.
     * </p>
     * 
     * @param describeHapgRequest
     *        Contains the inputs for the <a>DescribeHapg</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeHapg operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.DescribeHapg
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/DescribeHapg" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeHapgResult> describeHapgAsync(DescribeHapgRequest describeHapgRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeHapgRequest, DescribeHapgResult> asyncHandler);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Retrieves information about an HSM. You can identify the HSM by its ARN or its serial number.
     * </p>
     * 
     * @param describeHsmRequest
     *        Contains the inputs for the <a>DescribeHsm</a> operation.
     * @return A Java Future containing the result of the DescribeHsm operation returned by the service.
     * @sample AWSCloudHSMAsync.DescribeHsm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/DescribeHsm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeHsmResult> describeHsmAsync(DescribeHsmRequest describeHsmRequest);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Retrieves information about an HSM. You can identify the HSM by its ARN or its serial number.
     * </p>
     * 
     * @param describeHsmRequest
     *        Contains the inputs for the <a>DescribeHsm</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeHsm operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.DescribeHsm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/DescribeHsm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeHsmResult> describeHsmAsync(DescribeHsmRequest describeHsmRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeHsmRequest, DescribeHsmResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeHsm operation.
     *
     * @see #describeHsmAsync(DescribeHsmRequest)
     */
    java.util.concurrent.Future<DescribeHsmResult> describeHsmAsync();

    /**
     * Simplified method form for invoking the DescribeHsm operation with an AsyncHandler.
     *
     * @see #describeHsmAsync(DescribeHsmRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeHsmResult> describeHsmAsync(com.amazonaws.handlers.AsyncHandler<DescribeHsmRequest, DescribeHsmResult> asyncHandler);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Retrieves information about an HSM client.
     * </p>
     * 
     * @param describeLunaClientRequest
     * @return A Java Future containing the result of the DescribeLunaClient operation returned by the service.
     * @sample AWSCloudHSMAsync.DescribeLunaClient
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/DescribeLunaClient" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLunaClientResult> describeLunaClientAsync(DescribeLunaClientRequest describeLunaClientRequest);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Retrieves information about an HSM client.
     * </p>
     * 
     * @param describeLunaClientRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLunaClient operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.DescribeLunaClient
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/DescribeLunaClient" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeLunaClientResult> describeLunaClientAsync(DescribeLunaClientRequest describeLunaClientRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLunaClientRequest, DescribeLunaClientResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeLunaClient operation.
     *
     * @see #describeLunaClientAsync(DescribeLunaClientRequest)
     */
    java.util.concurrent.Future<DescribeLunaClientResult> describeLunaClientAsync();

    /**
     * Simplified method form for invoking the DescribeLunaClient operation with an AsyncHandler.
     *
     * @see #describeLunaClientAsync(DescribeLunaClientRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeLunaClientResult> describeLunaClientAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeLunaClientRequest, DescribeLunaClientResult> asyncHandler);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Gets the configuration files necessary to connect to all high availability partition groups the client is
     * associated with.
     * </p>
     * 
     * @param getConfigRequest
     * @return A Java Future containing the result of the GetConfig operation returned by the service.
     * @sample AWSCloudHSMAsync.GetConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/GetConfig" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetConfigResult> getConfigAsync(GetConfigRequest getConfigRequest);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Gets the configuration files necessary to connect to all high availability partition groups the client is
     * associated with.
     * </p>
     * 
     * @param getConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConfig operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.GetConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/GetConfig" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetConfigResult> getConfigAsync(GetConfigRequest getConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetConfigRequest, GetConfigResult> asyncHandler);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Lists the Availability Zones that have available AWS CloudHSM capacity.
     * </p>
     * 
     * @param listAvailableZonesRequest
     *        Contains the inputs for the <a>ListAvailableZones</a> action.
     * @return A Java Future containing the result of the ListAvailableZones operation returned by the service.
     * @sample AWSCloudHSMAsync.ListAvailableZones
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/ListAvailableZones" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAvailableZonesResult> listAvailableZonesAsync(ListAvailableZonesRequest listAvailableZonesRequest);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Lists the Availability Zones that have available AWS CloudHSM capacity.
     * </p>
     * 
     * @param listAvailableZonesRequest
     *        Contains the inputs for the <a>ListAvailableZones</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAvailableZones operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.ListAvailableZones
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/ListAvailableZones" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAvailableZonesResult> listAvailableZonesAsync(ListAvailableZonesRequest listAvailableZonesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAvailableZonesRequest, ListAvailableZonesResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListAvailableZones operation.
     *
     * @see #listAvailableZonesAsync(ListAvailableZonesRequest)
     */
    java.util.concurrent.Future<ListAvailableZonesResult> listAvailableZonesAsync();

    /**
     * Simplified method form for invoking the ListAvailableZones operation with an AsyncHandler.
     *
     * @see #listAvailableZonesAsync(ListAvailableZonesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListAvailableZonesResult> listAvailableZonesAsync(
            com.amazonaws.handlers.AsyncHandler<ListAvailableZonesRequest, ListAvailableZonesResult> asyncHandler);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Lists the high-availability partition groups for the account.
     * </p>
     * <p>
     * This operation supports pagination with the use of the <code>NextToken</code> member. If more results are
     * available, the <code>NextToken</code> member of the response contains a token that you pass in the next call to
     * <code>ListHapgs</code> to retrieve the next set of items.
     * </p>
     * 
     * @param listHapgsRequest
     * @return A Java Future containing the result of the ListHapgs operation returned by the service.
     * @sample AWSCloudHSMAsync.ListHapgs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/ListHapgs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListHapgsResult> listHapgsAsync(ListHapgsRequest listHapgsRequest);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Lists the high-availability partition groups for the account.
     * </p>
     * <p>
     * This operation supports pagination with the use of the <code>NextToken</code> member. If more results are
     * available, the <code>NextToken</code> member of the response contains a token that you pass in the next call to
     * <code>ListHapgs</code> to retrieve the next set of items.
     * </p>
     * 
     * @param listHapgsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListHapgs operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.ListHapgs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/ListHapgs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListHapgsResult> listHapgsAsync(ListHapgsRequest listHapgsRequest,
            com.amazonaws.handlers.AsyncHandler<ListHapgsRequest, ListHapgsResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListHapgs operation.
     *
     * @see #listHapgsAsync(ListHapgsRequest)
     */
    java.util.concurrent.Future<ListHapgsResult> listHapgsAsync();

    /**
     * Simplified method form for invoking the ListHapgs operation with an AsyncHandler.
     *
     * @see #listHapgsAsync(ListHapgsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListHapgsResult> listHapgsAsync(com.amazonaws.handlers.AsyncHandler<ListHapgsRequest, ListHapgsResult> asyncHandler);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Retrieves the identifiers of all of the HSMs provisioned for the current customer.
     * </p>
     * <p>
     * This operation supports pagination with the use of the <code>NextToken</code> member. If more results are
     * available, the <code>NextToken</code> member of the response contains a token that you pass in the next call to
     * <code>ListHsms</code> to retrieve the next set of items.
     * </p>
     * 
     * @param listHsmsRequest
     * @return A Java Future containing the result of the ListHsms operation returned by the service.
     * @sample AWSCloudHSMAsync.ListHsms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/ListHsms" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListHsmsResult> listHsmsAsync(ListHsmsRequest listHsmsRequest);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Retrieves the identifiers of all of the HSMs provisioned for the current customer.
     * </p>
     * <p>
     * This operation supports pagination with the use of the <code>NextToken</code> member. If more results are
     * available, the <code>NextToken</code> member of the response contains a token that you pass in the next call to
     * <code>ListHsms</code> to retrieve the next set of items.
     * </p>
     * 
     * @param listHsmsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListHsms operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.ListHsms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/ListHsms" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListHsmsResult> listHsmsAsync(ListHsmsRequest listHsmsRequest,
            com.amazonaws.handlers.AsyncHandler<ListHsmsRequest, ListHsmsResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListHsms operation.
     *
     * @see #listHsmsAsync(ListHsmsRequest)
     */
    java.util.concurrent.Future<ListHsmsResult> listHsmsAsync();

    /**
     * Simplified method form for invoking the ListHsms operation with an AsyncHandler.
     *
     * @see #listHsmsAsync(ListHsmsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListHsmsResult> listHsmsAsync(com.amazonaws.handlers.AsyncHandler<ListHsmsRequest, ListHsmsResult> asyncHandler);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Lists all of the clients.
     * </p>
     * <p>
     * This operation supports pagination with the use of the <code>NextToken</code> member. If more results are
     * available, the <code>NextToken</code> member of the response contains a token that you pass in the next call to
     * <code>ListLunaClients</code> to retrieve the next set of items.
     * </p>
     * 
     * @param listLunaClientsRequest
     * @return A Java Future containing the result of the ListLunaClients operation returned by the service.
     * @sample AWSCloudHSMAsync.ListLunaClients
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/ListLunaClients" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLunaClientsResult> listLunaClientsAsync(ListLunaClientsRequest listLunaClientsRequest);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Lists all of the clients.
     * </p>
     * <p>
     * This operation supports pagination with the use of the <code>NextToken</code> member. If more results are
     * available, the <code>NextToken</code> member of the response contains a token that you pass in the next call to
     * <code>ListLunaClients</code> to retrieve the next set of items.
     * </p>
     * 
     * @param listLunaClientsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLunaClients operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.ListLunaClients
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/ListLunaClients" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLunaClientsResult> listLunaClientsAsync(ListLunaClientsRequest listLunaClientsRequest,
            com.amazonaws.handlers.AsyncHandler<ListLunaClientsRequest, ListLunaClientsResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListLunaClients operation.
     *
     * @see #listLunaClientsAsync(ListLunaClientsRequest)
     */
    java.util.concurrent.Future<ListLunaClientsResult> listLunaClientsAsync();

    /**
     * Simplified method form for invoking the ListLunaClients operation with an AsyncHandler.
     *
     * @see #listLunaClientsAsync(ListLunaClientsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListLunaClientsResult> listLunaClientsAsync(
            com.amazonaws.handlers.AsyncHandler<ListLunaClientsRequest, ListLunaClientsResult> asyncHandler);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Returns a list of all tags for the specified AWS CloudHSM resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSCloudHSMAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Returns a list of all tags for the specified AWS CloudHSM resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Modifies an existing high-availability partition group.
     * </p>
     * 
     * @param modifyHapgRequest
     * @return A Java Future containing the result of the ModifyHapg operation returned by the service.
     * @sample AWSCloudHSMAsync.ModifyHapg
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/ModifyHapg" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyHapgResult> modifyHapgAsync(ModifyHapgRequest modifyHapgRequest);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Modifies an existing high-availability partition group.
     * </p>
     * 
     * @param modifyHapgRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyHapg operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.ModifyHapg
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/ModifyHapg" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyHapgResult> modifyHapgAsync(ModifyHapgRequest modifyHapgRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyHapgRequest, ModifyHapgResult> asyncHandler);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Modifies an HSM.
     * </p>
     * <important>
     * <p>
     * This operation can result in the HSM being offline for up to 15 minutes while the AWS CloudHSM service is
     * reconfigured. If you are modifying a production HSM, you should ensure that your AWS CloudHSM service is
     * configured for high availability, and consider executing this operation during a maintenance window.
     * </p>
     * </important>
     * 
     * @param modifyHsmRequest
     *        Contains the inputs for the <a>ModifyHsm</a> operation.
     * @return A Java Future containing the result of the ModifyHsm operation returned by the service.
     * @sample AWSCloudHSMAsync.ModifyHsm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/ModifyHsm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyHsmResult> modifyHsmAsync(ModifyHsmRequest modifyHsmRequest);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Modifies an HSM.
     * </p>
     * <important>
     * <p>
     * This operation can result in the HSM being offline for up to 15 minutes while the AWS CloudHSM service is
     * reconfigured. If you are modifying a production HSM, you should ensure that your AWS CloudHSM service is
     * configured for high availability, and consider executing this operation during a maintenance window.
     * </p>
     * </important>
     * 
     * @param modifyHsmRequest
     *        Contains the inputs for the <a>ModifyHsm</a> operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyHsm operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.ModifyHsm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/ModifyHsm" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyHsmResult> modifyHsmAsync(ModifyHsmRequest modifyHsmRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyHsmRequest, ModifyHsmResult> asyncHandler);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Modifies the certificate used by the client.
     * </p>
     * <p>
     * This action can potentially start a workflow to install the new certificate on the client's HSMs.
     * </p>
     * 
     * @param modifyLunaClientRequest
     * @return A Java Future containing the result of the ModifyLunaClient operation returned by the service.
     * @sample AWSCloudHSMAsync.ModifyLunaClient
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/ModifyLunaClient" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyLunaClientResult> modifyLunaClientAsync(ModifyLunaClientRequest modifyLunaClientRequest);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Modifies the certificate used by the client.
     * </p>
     * <p>
     * This action can potentially start a workflow to install the new certificate on the client's HSMs.
     * </p>
     * 
     * @param modifyLunaClientRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ModifyLunaClient operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.ModifyLunaClient
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/ModifyLunaClient" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ModifyLunaClientResult> modifyLunaClientAsync(ModifyLunaClientRequest modifyLunaClientRequest,
            com.amazonaws.handlers.AsyncHandler<ModifyLunaClientRequest, ModifyLunaClientResult> asyncHandler);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Removes one or more tags from the specified AWS CloudHSM resource.
     * </p>
     * <p>
     * To remove a tag, specify only the tag key to remove (not the value). To overwrite the value for an existing tag,
     * use <a>AddTagsToResource</a>.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     * @return A Java Future containing the result of the RemoveTagsFromResource operation returned by the service.
     * @sample AWSCloudHSMAsync.RemoveTagsFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/RemoveTagsFromResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(RemoveTagsFromResourceRequest removeTagsFromResourceRequest);

    /**
     * <p>
     * This is documentation for <b>AWS CloudHSM Classic</b>. For more information, see <a
     * href="http://aws.amazon.com/cloudhsm/faqs-classic/">AWS CloudHSM Classic FAQs</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/userguide/">AWS CloudHSM Classic User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/classic/APIReference/">AWS CloudHSM Classic API Reference</a>.
     * </p>
     * <p>
     * <b>For information about the current version of AWS CloudHSM</b>, see <a
     * href="http://aws.amazon.com/cloudhsm/">AWS CloudHSM</a>, the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/">AWS CloudHSM User Guide</a>, and the <a
     * href="http://docs.aws.amazon.com/cloudhsm/latest/APIReference/">AWS CloudHSM API Reference</a>.
     * </p>
     * <p>
     * Removes one or more tags from the specified AWS CloudHSM resource.
     * </p>
     * <p>
     * To remove a tag, specify only the tag key to remove (not the value). To overwrite the value for an existing tag,
     * use <a>AddTagsToResource</a>.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveTagsFromResource operation returned by the service.
     * @sample AWSCloudHSMAsyncHandler.RemoveTagsFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/RemoveTagsFromResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(RemoveTagsFromResourceRequest removeTagsFromResourceRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsFromResourceRequest, RemoveTagsFromResourceResult> asyncHandler);

}
