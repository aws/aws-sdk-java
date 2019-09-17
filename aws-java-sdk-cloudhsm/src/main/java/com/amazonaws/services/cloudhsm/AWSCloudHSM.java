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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.cloudhsm.model.*;

/**
 * Interface for accessing CloudHSM.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cloudhsm.AbstractAWSCloudHSM} instead.
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
public interface AWSCloudHSM {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "cloudhsm";

    /**
     * Overrides the default endpoint for this client ("https://cloudhsm.us-east-1.amazonaws.com/"). Callers can use
     * this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "cloudhsm.us-east-1.amazonaws.com/") or a full URL, including the
     * protocol (ex: "https://cloudhsm.us-east-1.amazonaws.com/"). If the protocol is not specified here, the default
     * protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "cloudhsm.us-east-1.amazonaws.com/") or a full URL, including the protocol (ex:
     *        "https://cloudhsm.us-east-1.amazonaws.com/") of the region specific AWS endpoint this client will
     *        communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSCloudHSM#setEndpoint(String)}, sets the regional endpoint for this client's service
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
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

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
     * @return Result of the AddTagsToResource operation returned by the service.
     * @throws CloudHsmServiceException
     *         Indicates that an exception occurred in the AWS CloudHSM service.
     * @throws CloudHsmInternalException
     *         Indicates that an internal error occurred.
     * @throws InvalidRequestException
     *         Indicates that one or more of the request parameters are not valid.
     * @sample AWSCloudHSM.AddTagsToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/AddTagsToResource" target="_top">AWS API
     *      Documentation</a>
     */
    AddTagsToResourceResult addTagsToResource(AddTagsToResourceRequest addTagsToResourceRequest);

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
     * @return Result of the CreateHapg operation returned by the service.
     * @throws CloudHsmServiceException
     *         Indicates that an exception occurred in the AWS CloudHSM service.
     * @throws CloudHsmInternalException
     *         Indicates that an internal error occurred.
     * @throws InvalidRequestException
     *         Indicates that one or more of the request parameters are not valid.
     * @sample AWSCloudHSM.CreateHapg
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/CreateHapg" target="_top">AWS API
     *      Documentation</a>
     */
    CreateHapgResult createHapg(CreateHapgRequest createHapgRequest);

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
     * @return Result of the CreateHsm operation returned by the service.
     * @throws CloudHsmServiceException
     *         Indicates that an exception occurred in the AWS CloudHSM service.
     * @throws CloudHsmInternalException
     *         Indicates that an internal error occurred.
     * @throws InvalidRequestException
     *         Indicates that one or more of the request parameters are not valid.
     * @sample AWSCloudHSM.CreateHsm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/CreateHsm" target="_top">AWS API
     *      Documentation</a>
     */
    CreateHsmResult createHsm(CreateHsmRequest createHsmRequest);

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
     * @return Result of the CreateLunaClient operation returned by the service.
     * @throws CloudHsmServiceException
     *         Indicates that an exception occurred in the AWS CloudHSM service.
     * @throws CloudHsmInternalException
     *         Indicates that an internal error occurred.
     * @throws InvalidRequestException
     *         Indicates that one or more of the request parameters are not valid.
     * @sample AWSCloudHSM.CreateLunaClient
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/CreateLunaClient" target="_top">AWS API
     *      Documentation</a>
     */
    CreateLunaClientResult createLunaClient(CreateLunaClientRequest createLunaClientRequest);

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
     * @return Result of the DeleteHapg operation returned by the service.
     * @throws CloudHsmServiceException
     *         Indicates that an exception occurred in the AWS CloudHSM service.
     * @throws CloudHsmInternalException
     *         Indicates that an internal error occurred.
     * @throws InvalidRequestException
     *         Indicates that one or more of the request parameters are not valid.
     * @sample AWSCloudHSM.DeleteHapg
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/DeleteHapg" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteHapgResult deleteHapg(DeleteHapgRequest deleteHapgRequest);

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
     * @return Result of the DeleteHsm operation returned by the service.
     * @throws CloudHsmServiceException
     *         Indicates that an exception occurred in the AWS CloudHSM service.
     * @throws CloudHsmInternalException
     *         Indicates that an internal error occurred.
     * @throws InvalidRequestException
     *         Indicates that one or more of the request parameters are not valid.
     * @sample AWSCloudHSM.DeleteHsm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/DeleteHsm" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteHsmResult deleteHsm(DeleteHsmRequest deleteHsmRequest);

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
     * @return Result of the DeleteLunaClient operation returned by the service.
     * @throws CloudHsmServiceException
     *         Indicates that an exception occurred in the AWS CloudHSM service.
     * @throws CloudHsmInternalException
     *         Indicates that an internal error occurred.
     * @throws InvalidRequestException
     *         Indicates that one or more of the request parameters are not valid.
     * @sample AWSCloudHSM.DeleteLunaClient
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/DeleteLunaClient" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteLunaClientResult deleteLunaClient(DeleteLunaClientRequest deleteLunaClientRequest);

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
     * @return Result of the DescribeHapg operation returned by the service.
     * @throws CloudHsmServiceException
     *         Indicates that an exception occurred in the AWS CloudHSM service.
     * @throws CloudHsmInternalException
     *         Indicates that an internal error occurred.
     * @throws InvalidRequestException
     *         Indicates that one or more of the request parameters are not valid.
     * @sample AWSCloudHSM.DescribeHapg
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/DescribeHapg" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeHapgResult describeHapg(DescribeHapgRequest describeHapgRequest);

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
     * @return Result of the DescribeHsm operation returned by the service.
     * @throws CloudHsmServiceException
     *         Indicates that an exception occurred in the AWS CloudHSM service.
     * @throws CloudHsmInternalException
     *         Indicates that an internal error occurred.
     * @throws InvalidRequestException
     *         Indicates that one or more of the request parameters are not valid.
     * @sample AWSCloudHSM.DescribeHsm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/DescribeHsm" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeHsmResult describeHsm(DescribeHsmRequest describeHsmRequest);

    /**
     * Simplified method form for invoking the DescribeHsm operation.
     *
     * @see #describeHsm(DescribeHsmRequest)
     */
    DescribeHsmResult describeHsm();

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
     * @return Result of the DescribeLunaClient operation returned by the service.
     * @throws CloudHsmServiceException
     *         Indicates that an exception occurred in the AWS CloudHSM service.
     * @throws CloudHsmInternalException
     *         Indicates that an internal error occurred.
     * @throws InvalidRequestException
     *         Indicates that one or more of the request parameters are not valid.
     * @sample AWSCloudHSM.DescribeLunaClient
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/DescribeLunaClient" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeLunaClientResult describeLunaClient(DescribeLunaClientRequest describeLunaClientRequest);

    /**
     * Simplified method form for invoking the DescribeLunaClient operation.
     *
     * @see #describeLunaClient(DescribeLunaClientRequest)
     */
    DescribeLunaClientResult describeLunaClient();

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
     * @return Result of the GetConfig operation returned by the service.
     * @throws CloudHsmServiceException
     *         Indicates that an exception occurred in the AWS CloudHSM service.
     * @throws CloudHsmInternalException
     *         Indicates that an internal error occurred.
     * @throws InvalidRequestException
     *         Indicates that one or more of the request parameters are not valid.
     * @sample AWSCloudHSM.GetConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/GetConfig" target="_top">AWS API
     *      Documentation</a>
     */
    GetConfigResult getConfig(GetConfigRequest getConfigRequest);

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
     * @return Result of the ListAvailableZones operation returned by the service.
     * @throws CloudHsmServiceException
     *         Indicates that an exception occurred in the AWS CloudHSM service.
     * @throws CloudHsmInternalException
     *         Indicates that an internal error occurred.
     * @throws InvalidRequestException
     *         Indicates that one or more of the request parameters are not valid.
     * @sample AWSCloudHSM.ListAvailableZones
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/ListAvailableZones" target="_top">AWS
     *      API Documentation</a>
     */
    ListAvailableZonesResult listAvailableZones(ListAvailableZonesRequest listAvailableZonesRequest);

    /**
     * Simplified method form for invoking the ListAvailableZones operation.
     *
     * @see #listAvailableZones(ListAvailableZonesRequest)
     */
    ListAvailableZonesResult listAvailableZones();

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
     * @return Result of the ListHapgs operation returned by the service.
     * @throws CloudHsmServiceException
     *         Indicates that an exception occurred in the AWS CloudHSM service.
     * @throws CloudHsmInternalException
     *         Indicates that an internal error occurred.
     * @throws InvalidRequestException
     *         Indicates that one or more of the request parameters are not valid.
     * @sample AWSCloudHSM.ListHapgs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/ListHapgs" target="_top">AWS API
     *      Documentation</a>
     */
    ListHapgsResult listHapgs(ListHapgsRequest listHapgsRequest);

    /**
     * Simplified method form for invoking the ListHapgs operation.
     *
     * @see #listHapgs(ListHapgsRequest)
     */
    ListHapgsResult listHapgs();

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
     * @return Result of the ListHsms operation returned by the service.
     * @throws CloudHsmServiceException
     *         Indicates that an exception occurred in the AWS CloudHSM service.
     * @throws CloudHsmInternalException
     *         Indicates that an internal error occurred.
     * @throws InvalidRequestException
     *         Indicates that one or more of the request parameters are not valid.
     * @sample AWSCloudHSM.ListHsms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/ListHsms" target="_top">AWS API
     *      Documentation</a>
     */
    ListHsmsResult listHsms(ListHsmsRequest listHsmsRequest);

    /**
     * Simplified method form for invoking the ListHsms operation.
     *
     * @see #listHsms(ListHsmsRequest)
     */
    ListHsmsResult listHsms();

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
     * @return Result of the ListLunaClients operation returned by the service.
     * @throws CloudHsmServiceException
     *         Indicates that an exception occurred in the AWS CloudHSM service.
     * @throws CloudHsmInternalException
     *         Indicates that an internal error occurred.
     * @throws InvalidRequestException
     *         Indicates that one or more of the request parameters are not valid.
     * @sample AWSCloudHSM.ListLunaClients
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/ListLunaClients" target="_top">AWS API
     *      Documentation</a>
     */
    ListLunaClientsResult listLunaClients(ListLunaClientsRequest listLunaClientsRequest);

    /**
     * Simplified method form for invoking the ListLunaClients operation.
     *
     * @see #listLunaClients(ListLunaClientsRequest)
     */
    ListLunaClientsResult listLunaClients();

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
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws CloudHsmServiceException
     *         Indicates that an exception occurred in the AWS CloudHSM service.
     * @throws CloudHsmInternalException
     *         Indicates that an internal error occurred.
     * @throws InvalidRequestException
     *         Indicates that one or more of the request parameters are not valid.
     * @sample AWSCloudHSM.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

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
     * @return Result of the ModifyHapg operation returned by the service.
     * @throws CloudHsmServiceException
     *         Indicates that an exception occurred in the AWS CloudHSM service.
     * @throws CloudHsmInternalException
     *         Indicates that an internal error occurred.
     * @throws InvalidRequestException
     *         Indicates that one or more of the request parameters are not valid.
     * @sample AWSCloudHSM.ModifyHapg
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/ModifyHapg" target="_top">AWS API
     *      Documentation</a>
     */
    ModifyHapgResult modifyHapg(ModifyHapgRequest modifyHapgRequest);

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
     * @return Result of the ModifyHsm operation returned by the service.
     * @throws CloudHsmServiceException
     *         Indicates that an exception occurred in the AWS CloudHSM service.
     * @throws CloudHsmInternalException
     *         Indicates that an internal error occurred.
     * @throws InvalidRequestException
     *         Indicates that one or more of the request parameters are not valid.
     * @sample AWSCloudHSM.ModifyHsm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/ModifyHsm" target="_top">AWS API
     *      Documentation</a>
     */
    ModifyHsmResult modifyHsm(ModifyHsmRequest modifyHsmRequest);

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
     * @return Result of the ModifyLunaClient operation returned by the service.
     * @throws CloudHsmServiceException
     *         Indicates that an exception occurred in the AWS CloudHSM service.
     * @sample AWSCloudHSM.ModifyLunaClient
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/ModifyLunaClient" target="_top">AWS API
     *      Documentation</a>
     */
    ModifyLunaClientResult modifyLunaClient(ModifyLunaClientRequest modifyLunaClientRequest);

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
     * @return Result of the RemoveTagsFromResource operation returned by the service.
     * @throws CloudHsmServiceException
     *         Indicates that an exception occurred in the AWS CloudHSM service.
     * @throws CloudHsmInternalException
     *         Indicates that an internal error occurred.
     * @throws InvalidRequestException
     *         Indicates that one or more of the request parameters are not valid.
     * @sample AWSCloudHSM.RemoveTagsFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/RemoveTagsFromResource"
     *      target="_top">AWS API Documentation</a>
     */
    RemoveTagsFromResourceResult removeTagsFromResource(RemoveTagsFromResourceRequest removeTagsFromResourceRequest);

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
