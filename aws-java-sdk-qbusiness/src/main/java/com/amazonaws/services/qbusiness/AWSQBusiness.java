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
package com.amazonaws.services.qbusiness;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.qbusiness.model.*;

/**
 * Interface for accessing QBusiness.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.qbusiness.AbstractAWSQBusiness} instead.
 * </p>
 * <p>
 * <p>
 * This is the <i>Amazon Q Business</i> API Reference. Amazon Q Business is a fully managed, generative-AI powered
 * enterprise chat assistant that you can deploy within your organization. Amazon Q Business enhances employee
 * productivity by supporting key tasks such as question-answering, knowledge discovery, writing email messages,
 * summarizing text, drafting document outlines, and brainstorming ideas. Users ask questions of Amazon Q Business and
 * get answers that are presented in a conversational manner. For an introduction to the service, see the <a
 * href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/what-is.html"> <i>Amazon Q Business User Guide</i>
 * </a>.
 * </p>
 * <p>
 * For an overview of the Amazon Q Business APIs, see <a
 * href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/api-ref.html#api-overview">Overview of Amazon Q
 * Business API operations</a>.
 * </p>
 * <p>
 * For information about the IAM access control permissions you need to use this API, see <a
 * href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/iam-roles.html">IAM roles for Amazon Q Business</a>
 * in the <i>Amazon Q Business User Guide</i>.
 * </p>
 * <p>
 * You can use the following AWS SDKs to access Amazon Q Business APIs:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sdk-for-cpp">AWS SDK for C++</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sdk-for-go">AWS SDK for Go</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sdk-for-java">AWS SDK for Java</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sdk-for-javascript">AWS SDK for JavaScript</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sdk-for-net">AWS SDK for .NET</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/pythonsdk">AWS SDK for Python (Boto3)</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/sdk-for-ruby">AWS SDK for Ruby</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * The following resources provide additional information about using the Amazon Q Business API:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i> <a href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/setting-up.html">Setting up for Amazon Q
 * Business</a> </i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <i> <a href="https://awscli.amazonaws.com/v2/documentation/api/latest/reference/qbusiness/index.html">Amazon Q
 * Business CLI Reference</a> </i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <i> <a href="https://docs.aws.amazon.com/general/latest/gr/amazonq.html">Amazon Web Services General Reference</a>
 * </i>
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSQBusiness {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "qbusiness";

    /**
     * <p>
     * Asynchronously deletes one or more documents added using the <code>BatchPutDocument</code> API from an Amazon Q
     * Business index.
     * </p>
     * <p>
     * You can see the progress of the deletion, and any error messages related to the process, by using CloudWatch.
     * </p>
     * 
     * @param batchDeleteDocumentRequest
     * @return Result of the BatchDeleteDocument operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.BatchDeleteDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/BatchDeleteDocument" target="_top">AWS
     *      API Documentation</a>
     */
    BatchDeleteDocumentResult batchDeleteDocument(BatchDeleteDocumentRequest batchDeleteDocumentRequest);

    /**
     * <p>
     * Adds one or more documents to an Amazon Q Business index.
     * </p>
     * <p>
     * You use this API to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ingest your structured and unstructured documents and documents stored in an Amazon S3 bucket into an Amazon Q
     * Business index.
     * </p>
     * </li>
     * <li>
     * <p>
     * add custom attributes to documents in an Amazon Q Business index.
     * </p>
     * </li>
     * <li>
     * <p>
     * attach an access control list to the documents added to an Amazon Q Business index.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can see the progress of the deletion, and any error messages related to the process, by using CloudWatch.
     * </p>
     * 
     * @param batchPutDocumentRequest
     * @return Result of the BatchPutDocument operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Q Business service.
     * @sample AWSQBusiness.BatchPutDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/BatchPutDocument" target="_top">AWS API
     *      Documentation</a>
     */
    BatchPutDocumentResult batchPutDocument(BatchPutDocumentRequest batchPutDocumentRequest);

    /**
     * <p>
     * Starts or continues a non-streaming Amazon Q Business conversation.
     * </p>
     * 
     * @param chatSyncRequest
     * @return Result of the ChatSync operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws LicenseNotFoundException
     *         You don't have permissions to perform the action because your license is inactive. Ask your admin to
     *         activate your license and try again after your licence is active.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.ChatSync
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ChatSync" target="_top">AWS API
     *      Documentation</a>
     */
    ChatSyncResult chatSync(ChatSyncRequest chatSyncRequest);

    /**
     * <p>
     * Creates an Amazon Q Business application.
     * </p>
     * <note>
     * <p>
     * There are new tiers for Amazon Q Business. Not all features in Amazon Q Business Pro are also available in Amazon
     * Q Business Lite. For information on what's included in Amazon Q Business Lite and what's included in Amazon Q
     * Business Pro, see <a href="https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/what-is.html#tiers">Amazon Q
     * Business tiers</a>. You must use the Amazon Q Business console to assign subscription tiers to users.
     * </p>
     * </note>
     * 
     * @param createApplicationRequest
     * @return Result of the CreateApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Q Business service.
     * @sample AWSQBusiness.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/CreateApplication" target="_top">AWS
     *      API Documentation</a>
     */
    CreateApplicationResult createApplication(CreateApplicationRequest createApplicationRequest);

    /**
     * <p>
     * Creates an Amazon Q Business index.
     * </p>
     * <p>
     * To determine if index creation has completed, check the <code>Status</code> field returned from a call to
     * <code>DescribeIndex</code>. The <code>Status</code> field is set to <code>ACTIVE</code> when the index is ready
     * to use.
     * </p>
     * <p>
     * Once the index is active, you can index your documents using the <a
     * href="https://docs.aws.amazon.com/amazonq/latest/api-reference/API_BatchPutDocument.html">
     * <code>BatchPutDocument</code> </a> API or the <a
     * href="https://docs.aws.amazon.com/amazonq/latest/api-reference/API_CreateDataSource.html">
     * <code>CreateDataSource</code> </a> API.
     * </p>
     * 
     * @param createIndexRequest
     * @return Result of the CreateIndex operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Q Business service.
     * @sample AWSQBusiness.CreateIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/CreateIndex" target="_top">AWS API
     *      Documentation</a>
     */
    CreateIndexResult createIndex(CreateIndexRequest createIndexRequest);

    /**
     * <p>
     * Creates an Amazon Q Business plugin.
     * </p>
     * 
     * @param createPluginRequest
     * @return Result of the CreatePlugin operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Q Business service.
     * @sample AWSQBusiness.CreatePlugin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/CreatePlugin" target="_top">AWS API
     *      Documentation</a>
     */
    CreatePluginResult createPlugin(CreatePluginRequest createPluginRequest);

    /**
     * <p>
     * Adds a retriever to your Amazon Q Business application.
     * </p>
     * 
     * @param createRetrieverRequest
     * @return Result of the CreateRetriever operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Q Business service.
     * @sample AWSQBusiness.CreateRetriever
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/CreateRetriever" target="_top">AWS API
     *      Documentation</a>
     */
    CreateRetrieverResult createRetriever(CreateRetrieverRequest createRetrieverRequest);

    /**
     * <p>
     * Creates a universally unique identifier (UUID) mapped to a list of local user ids within an application.
     * </p>
     * 
     * @param createUserRequest
     * @return Result of the CreateUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Q Business service.
     * @sample AWSQBusiness.CreateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/CreateUser" target="_top">AWS API
     *      Documentation</a>
     */
    CreateUserResult createUser(CreateUserRequest createUserRequest);

    /**
     * <p>
     * Creates an Amazon Q Business web experience.
     * </p>
     * 
     * @param createWebExperienceRequest
     * @return Result of the CreateWebExperience operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Q Business service.
     * @sample AWSQBusiness.CreateWebExperience
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/CreateWebExperience" target="_top">AWS
     *      API Documentation</a>
     */
    CreateWebExperienceResult createWebExperience(CreateWebExperienceRequest createWebExperienceRequest);

    /**
     * <p>
     * Deletes an Amazon Q Business application.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @return Result of the DeleteApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteApplication" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteApplicationResult deleteApplication(DeleteApplicationRequest deleteApplicationRequest);

    /**
     * <p>
     * Deletes chat controls configured for an existing Amazon Q Business application.
     * </p>
     * 
     * @param deleteChatControlsConfigurationRequest
     * @return Result of the DeleteChatControlsConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.DeleteChatControlsConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteChatControlsConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteChatControlsConfigurationResult deleteChatControlsConfiguration(DeleteChatControlsConfigurationRequest deleteChatControlsConfigurationRequest);

    /**
     * <p>
     * Deletes an Amazon Q Business web experience conversation.
     * </p>
     * 
     * @param deleteConversationRequest
     * @return Result of the DeleteConversation operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws LicenseNotFoundException
     *         You don't have permissions to perform the action because your license is inactive. Ask your admin to
     *         activate your license and try again after your licence is active.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.DeleteConversation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteConversation" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteConversationResult deleteConversation(DeleteConversationRequest deleteConversationRequest);

    /**
     * <p>
     * Deletes an Amazon Q Business data source connector. While the data source is being deleted, the
     * <code>Status</code> field returned by a call to the <code>DescribeDataSource</code> API is set to
     * <code>DELETING</code>.
     * </p>
     * 
     * @param deleteDataSourceRequest
     * @return Result of the DeleteDataSource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.DeleteDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDataSourceResult deleteDataSource(DeleteDataSourceRequest deleteDataSourceRequest);

    /**
     * <p>
     * Deletes a group so that all users and sub groups that belong to the group can no longer access documents only
     * available to that group. For example, after deleting the group "Summer Interns", all interns who belonged to that
     * group no longer see intern-only documents in their chat results.
     * </p>
     * <p>
     * If you want to delete, update, or replace users or sub groups of a group, you need to use the
     * <code>PutGroup</code> operation. For example, if a user in the group "Engineering" leaves the engineering team
     * and another user takes their place, you provide an updated list of users or sub groups that belong to the
     * "Engineering" group when calling <code>PutGroup</code>.
     * </p>
     * 
     * @param deleteGroupRequest
     * @return Result of the DeleteGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.DeleteGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteGroup" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteGroupResult deleteGroup(DeleteGroupRequest deleteGroupRequest);

    /**
     * <p>
     * Deletes an Amazon Q Business index.
     * </p>
     * 
     * @param deleteIndexRequest
     * @return Result of the DeleteIndex operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.DeleteIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteIndex" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteIndexResult deleteIndex(DeleteIndexRequest deleteIndexRequest);

    /**
     * <p>
     * Deletes an Amazon Q Business plugin.
     * </p>
     * 
     * @param deletePluginRequest
     * @return Result of the DeletePlugin operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.DeletePlugin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeletePlugin" target="_top">AWS API
     *      Documentation</a>
     */
    DeletePluginResult deletePlugin(DeletePluginRequest deletePluginRequest);

    /**
     * <p>
     * Deletes the retriever used by an Amazon Q Business application.
     * </p>
     * 
     * @param deleteRetrieverRequest
     * @return Result of the DeleteRetriever operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.DeleteRetriever
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteRetriever" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteRetrieverResult deleteRetriever(DeleteRetrieverRequest deleteRetrieverRequest);

    /**
     * <p>
     * Deletes a user by email id.
     * </p>
     * 
     * @param deleteUserRequest
     * @return Result of the DeleteUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.DeleteUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteUser" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteUserResult deleteUser(DeleteUserRequest deleteUserRequest);

    /**
     * <p>
     * Deletes an Amazon Q Business web experience.
     * </p>
     * 
     * @param deleteWebExperienceRequest
     * @return Result of the DeleteWebExperience operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.DeleteWebExperience
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/DeleteWebExperience" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteWebExperienceResult deleteWebExperience(DeleteWebExperienceRequest deleteWebExperienceRequest);

    /**
     * <p>
     * Gets information about an existing Amazon Q Business application.
     * </p>
     * 
     * @param getApplicationRequest
     * @return Result of the GetApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.GetApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetApplication" target="_top">AWS API
     *      Documentation</a>
     */
    GetApplicationResult getApplication(GetApplicationRequest getApplicationRequest);

    /**
     * <p>
     * Gets information about an chat controls configured for an existing Amazon Q Business application.
     * </p>
     * 
     * @param getChatControlsConfigurationRequest
     * @return Result of the GetChatControlsConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.GetChatControlsConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetChatControlsConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetChatControlsConfigurationResult getChatControlsConfiguration(GetChatControlsConfigurationRequest getChatControlsConfigurationRequest);

    /**
     * <p>
     * Gets information about an existing Amazon Q Business data source connector.
     * </p>
     * 
     * @param getDataSourceRequest
     * @return Result of the GetDataSource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.GetDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    GetDataSourceResult getDataSource(GetDataSourceRequest getDataSourceRequest);

    /**
     * <p>
     * Describes a group by group name.
     * </p>
     * 
     * @param getGroupRequest
     * @return Result of the GetGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.GetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetGroup" target="_top">AWS API
     *      Documentation</a>
     */
    GetGroupResult getGroup(GetGroupRequest getGroupRequest);

    /**
     * <p>
     * Gets information about an existing Amazon Q Business index.
     * </p>
     * 
     * @param getIndexRequest
     * @return Result of the GetIndex operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.GetIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetIndex" target="_top">AWS API
     *      Documentation</a>
     */
    GetIndexResult getIndex(GetIndexRequest getIndexRequest);

    /**
     * <p>
     * Gets information about an existing Amazon Q Business plugin.
     * </p>
     * 
     * @param getPluginRequest
     * @return Result of the GetPlugin operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.GetPlugin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetPlugin" target="_top">AWS API
     *      Documentation</a>
     */
    GetPluginResult getPlugin(GetPluginRequest getPluginRequest);

    /**
     * <p>
     * Gets information about an existing retriever used by an Amazon Q Business application.
     * </p>
     * 
     * @param getRetrieverRequest
     * @return Result of the GetRetriever operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.GetRetriever
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetRetriever" target="_top">AWS API
     *      Documentation</a>
     */
    GetRetrieverResult getRetriever(GetRetrieverRequest getRetrieverRequest);

    /**
     * <p>
     * Describes the universally unique identifier (UUID) associated with a local user in a data source.
     * </p>
     * 
     * @param getUserRequest
     * @return Result of the GetUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.GetUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetUser" target="_top">AWS API
     *      Documentation</a>
     */
    GetUserResult getUser(GetUserRequest getUserRequest);

    /**
     * <p>
     * Gets information about an existing Amazon Q Business web experience.
     * </p>
     * 
     * @param getWebExperienceRequest
     * @return Result of the GetWebExperience operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.GetWebExperience
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetWebExperience" target="_top">AWS API
     *      Documentation</a>
     */
    GetWebExperienceResult getWebExperience(GetWebExperienceRequest getWebExperienceRequest);

    /**
     * <p>
     * Lists Amazon Q Business applications.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return Result of the ListApplications operation returned by the service.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListApplications" target="_top">AWS API
     *      Documentation</a>
     */
    ListApplicationsResult listApplications(ListApplicationsRequest listApplicationsRequest);

    /**
     * <p>
     * Lists one or more Amazon Q Business conversations.
     * </p>
     * 
     * @param listConversationsRequest
     * @return Result of the ListConversations operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws LicenseNotFoundException
     *         You don't have permissions to perform the action because your license is inactive. Ask your admin to
     *         activate your license and try again after your licence is active.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.ListConversations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListConversations" target="_top">AWS
     *      API Documentation</a>
     */
    ListConversationsResult listConversations(ListConversationsRequest listConversationsRequest);

    /**
     * <p>
     * Get information about an Amazon Q Business data source connector synchronization.
     * </p>
     * 
     * @param listDataSourceSyncJobsRequest
     * @return Result of the ListDataSourceSyncJobs operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.ListDataSourceSyncJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListDataSourceSyncJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListDataSourceSyncJobsResult listDataSourceSyncJobs(ListDataSourceSyncJobsRequest listDataSourceSyncJobsRequest);

    /**
     * <p>
     * Lists the Amazon Q Business data source connectors that you have created.
     * </p>
     * 
     * @param listDataSourcesRequest
     * @return Result of the ListDataSources operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.ListDataSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListDataSources" target="_top">AWS API
     *      Documentation</a>
     */
    ListDataSourcesResult listDataSources(ListDataSourcesRequest listDataSourcesRequest);

    /**
     * <p>
     * A list of documents attached to an index.
     * </p>
     * 
     * @param listDocumentsRequest
     * @return Result of the ListDocuments operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.ListDocuments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListDocuments" target="_top">AWS API
     *      Documentation</a>
     */
    ListDocumentsResult listDocuments(ListDocumentsRequest listDocumentsRequest);

    /**
     * <p>
     * Provides a list of groups that are mapped to users.
     * </p>
     * 
     * @param listGroupsRequest
     * @return Result of the ListGroups operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.ListGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListGroups" target="_top">AWS API
     *      Documentation</a>
     */
    ListGroupsResult listGroups(ListGroupsRequest listGroupsRequest);

    /**
     * <p>
     * Lists the Amazon Q Business indices you have created.
     * </p>
     * 
     * @param listIndicesRequest
     * @return Result of the ListIndices operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.ListIndices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListIndices" target="_top">AWS API
     *      Documentation</a>
     */
    ListIndicesResult listIndices(ListIndicesRequest listIndicesRequest);

    /**
     * <p>
     * Gets a list of messages associated with an Amazon Q Business web experience.
     * </p>
     * 
     * @param listMessagesRequest
     * @return Result of the ListMessages operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws LicenseNotFoundException
     *         You don't have permissions to perform the action because your license is inactive. Ask your admin to
     *         activate your license and try again after your licence is active.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.ListMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListMessages" target="_top">AWS API
     *      Documentation</a>
     */
    ListMessagesResult listMessages(ListMessagesRequest listMessagesRequest);

    /**
     * <p>
     * Lists configured Amazon Q Business plugins.
     * </p>
     * 
     * @param listPluginsRequest
     * @return Result of the ListPlugins operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.ListPlugins
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListPlugins" target="_top">AWS API
     *      Documentation</a>
     */
    ListPluginsResult listPlugins(ListPluginsRequest listPluginsRequest);

    /**
     * <p>
     * Lists the retriever used by an Amazon Q Business application.
     * </p>
     * 
     * @param listRetrieversRequest
     * @return Result of the ListRetrievers operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.ListRetrievers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListRetrievers" target="_top">AWS API
     *      Documentation</a>
     */
    ListRetrieversResult listRetrievers(ListRetrieversRequest listRetrieversRequest);

    /**
     * <p>
     * Gets a list of tags associated with a specified resource. Amazon Q Business applications and data sources can
     * have tags associated with them.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists one or more Amazon Q Business Web Experiences.
     * </p>
     * 
     * @param listWebExperiencesRequest
     * @return Result of the ListWebExperiences operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.ListWebExperiences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/ListWebExperiences" target="_top">AWS
     *      API Documentation</a>
     */
    ListWebExperiencesResult listWebExperiences(ListWebExperiencesRequest listWebExperiencesRequest);

    /**
     * <p>
     * Enables your end user to provide feedback on their Amazon Q Business generated chat responses.
     * </p>
     * 
     * @param putFeedbackRequest
     * @return Result of the PutFeedback operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.PutFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/PutFeedback" target="_top">AWS API
     *      Documentation</a>
     */
    PutFeedbackResult putFeedback(PutFeedbackRequest putFeedbackRequest);

    /**
     * <p>
     * Create, or updates, a mapping of users—who have access to a document—to groups.
     * </p>
     * <p>
     * You can also map sub groups to groups. For example, the group "Company Intellectual Property Teams" includes sub
     * groups "Research" and "Engineering". These sub groups include their own list of users or people who work in these
     * teams. Only users who work in research and engineering, and therefore belong in the intellectual property group,
     * can see top-secret company documents in their Amazon Q Business chat results.
     * </p>
     * 
     * @param putGroupRequest
     * @return Result of the PutGroup operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Q Business service.
     * @sample AWSQBusiness.PutGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/PutGroup" target="_top">AWS API
     *      Documentation</a>
     */
    PutGroupResult putGroup(PutGroupRequest putGroupRequest);

    /**
     * <p>
     * Starts a data source connector synchronization job. If a synchronization job is already in progress, Amazon Q
     * Business returns a <code>ConflictException</code>.
     * </p>
     * 
     * @param startDataSourceSyncJobRequest
     * @return Result of the StartDataSourceSyncJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Q Business service.
     * @sample AWSQBusiness.StartDataSourceSyncJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/StartDataSourceSyncJob"
     *      target="_top">AWS API Documentation</a>
     */
    StartDataSourceSyncJobResult startDataSourceSyncJob(StartDataSourceSyncJobRequest startDataSourceSyncJobRequest);

    /**
     * <p>
     * Stops an Amazon Q Business data source connector synchronization job already in progress.
     * </p>
     * 
     * @param stopDataSourceSyncJobRequest
     * @return Result of the StopDataSourceSyncJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.StopDataSourceSyncJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/StopDataSourceSyncJob"
     *      target="_top">AWS API Documentation</a>
     */
    StopDataSourceSyncJobResult stopDataSourceSyncJob(StopDataSourceSyncJobRequest stopDataSourceSyncJobRequest);

    /**
     * <p>
     * Adds the specified tag to the specified Amazon Q Business application or data source resource. If the tag already
     * exists, the existing value is replaced with the new value.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes a tag from an Amazon Q Business application or a data source.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates an existing Amazon Q Business application.
     * </p>
     * 
     * @param updateApplicationRequest
     * @return Result of the UpdateApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdateApplication" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateApplicationResult updateApplication(UpdateApplicationRequest updateApplicationRequest);

    /**
     * <p>
     * Updates an set of chat controls configured for an existing Amazon Q Business application.
     * </p>
     * 
     * @param updateChatControlsConfigurationRequest
     * @return Result of the UpdateChatControlsConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Q Business service.
     * @sample AWSQBusiness.UpdateChatControlsConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdateChatControlsConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateChatControlsConfigurationResult updateChatControlsConfiguration(UpdateChatControlsConfigurationRequest updateChatControlsConfigurationRequest);

    /**
     * <p>
     * Updates an existing Amazon Q Business data source connector.
     * </p>
     * 
     * @param updateDataSourceRequest
     * @return Result of the UpdateDataSource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.UpdateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdateDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateDataSourceResult updateDataSource(UpdateDataSourceRequest updateDataSourceRequest);

    /**
     * <p>
     * Updates an Amazon Q Business index.
     * </p>
     * 
     * @param updateIndexRequest
     * @return Result of the UpdateIndex operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Q Business service.
     * @sample AWSQBusiness.UpdateIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdateIndex" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateIndexResult updateIndex(UpdateIndexRequest updateIndexRequest);

    /**
     * <p>
     * Updates an Amazon Q Business plugin.
     * </p>
     * 
     * @param updatePluginRequest
     * @return Result of the UpdatePlugin operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Q Business service.
     * @sample AWSQBusiness.UpdatePlugin
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdatePlugin" target="_top">AWS API
     *      Documentation</a>
     */
    UpdatePluginResult updatePlugin(UpdatePluginRequest updatePluginRequest);

    /**
     * <p>
     * Updates the retriever used for your Amazon Q Business application.
     * </p>
     * 
     * @param updateRetrieverRequest
     * @return Result of the UpdateRetriever operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Q Business service.
     * @sample AWSQBusiness.UpdateRetriever
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdateRetriever" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateRetrieverResult updateRetriever(UpdateRetrieverRequest updateRetrieverRequest);

    /**
     * <p>
     * Updates a information associated with a user id.
     * </p>
     * 
     * @param updateUserRequest
     * @return Result of the UpdateUser operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @throws ServiceQuotaExceededException
     *         You have exceeded the set limits for your Amazon Q Business service.
     * @sample AWSQBusiness.UpdateUser
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdateUser" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateUserResult updateUser(UpdateUserRequest updateUserRequest);

    /**
     * <p>
     * Updates an Amazon Q Business web experience.
     * </p>
     * 
     * @param updateWebExperienceRequest
     * @return Result of the UpdateWebExperience operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource you want to use doesn’t exist. Make sure you have provided the correct resource and try
     *         again.
     * @throws InternalServerException
     *         An issue occurred with the internal server used for your Amazon Q Business service. Wait some minutes and
     *         try again, or contact <a href="http://aws.amazon.com/contact-us/">Support</a> for help.
     * @throws ConflictException
     *         You are trying to perform an action that conflicts with the current status of your resource. Fix any
     *         inconsistences with your resources and try again.
     * @throws ThrottlingException
     *         The request was denied due to throttling. Reduce the number of requests and try again.
     * @throws ValidationException
     *         The input doesn't meet the constraints set by the Amazon Q Business service. Provide the correct input
     *         and try again.
     * @throws AccessDeniedException
     *         You don't have access to perform this action. Make sure you have the required permission policies and
     *         user accounts and try again.
     * @sample AWSQBusiness.UpdateWebExperience
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/UpdateWebExperience" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateWebExperienceResult updateWebExperience(UpdateWebExperienceRequest updateWebExperienceRequest);

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
