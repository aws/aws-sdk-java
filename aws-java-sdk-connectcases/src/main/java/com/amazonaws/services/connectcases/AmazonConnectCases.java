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
package com.amazonaws.services.connectcases;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.connectcases.model.*;

/**
 * Interface for accessing ConnectCases.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.connectcases.AbstractAmazonConnectCases} instead.
 * </p>
 * <p>
 * <p>
 * With Amazon Connect Cases, your agents can track and manage customer issues that require multiple interactions,
 * follow-up tasks, and teams in your contact center. A case represents a customer issue. It records the issue, the
 * steps and interactions taken to resolve the issue, and the outcome. For more information, see <a
 * href="https://docs.aws.amazon.com/connect/latest/adminguide/cases.html">Amazon Connect Cases</a> in the <i>Amazon
 * Connect Administrator Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonConnectCases {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "cases";

    /**
     * <p>
     * Returns the description for the list of fields in the request parameters.
     * </p>
     * 
     * @param batchGetFieldRequest
     * @return Result of the BatchGetField operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.BatchGetField
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/BatchGetField" target="_top">AWS API
     *      Documentation</a>
     */
    BatchGetFieldResult batchGetField(BatchGetFieldRequest batchGetFieldRequest);

    /**
     * <p>
     * Creates and updates a set of field options for a single select field in a Cases domain.
     * </p>
     * 
     * @param batchPutFieldOptionsRequest
     * @return Result of the BatchPutFieldOptions operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded. For a list of service quotas, see <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html">Amazon
     *         Connect Service Quotas</a> in the <i>Amazon Connect Administrator Guide</i>.
     * @sample AmazonConnectCases.BatchPutFieldOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/BatchPutFieldOptions"
     *      target="_top">AWS API Documentation</a>
     */
    BatchPutFieldOptionsResult batchPutFieldOptions(BatchPutFieldOptionsRequest batchPutFieldOptionsRequest);

    /**
     * <note>
     * <p>
     * If you provide a value for <code>PerformedBy.UserArn</code> you must also have <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribeUser.html">connect:DescribeUser</a>
     * permission on the User ARN resource that you provide
     * </p>
     * </note>
     * 
     * <pre>
     * <code> &lt;p&gt;Creates a case in the specified Cases domain. Case system and custom fields are taken as an array id/value pairs with a declared data types.&lt;/p&gt; &lt;p&gt;The following fields are required when creating a case:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;customer_id&lt;/code&gt; - You must provide the full customer profile ARN in this format: &lt;code&gt;arn:aws:profile:your_AWS_Region:your_AWS_account ID:domains/your_profiles_domain_name/profiles/profile_ID&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;title&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; </code>
     * </pre>
     * 
     * @param createCaseRequest
     * @return Result of the CreateCase operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request. See the accompanying error message
     *         for details.
     * @sample AmazonConnectCases.CreateCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/CreateCase" target="_top">AWS API
     *      Documentation</a>
     */
    CreateCaseResult createCase(CreateCaseRequest createCaseRequest);

    /**
     * <p>
     * Creates a domain, which is a container for all case data, such as cases, fields, templates and layouts. Each
     * Amazon Connect instance can be associated with only one Cases domain.
     * </p>
     * <important>
     * <p>
     * This will not associate your connect instance to Cases domain. Instead, use the Amazon Connect <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateIntegrationAssociation.html"
     * >CreateIntegrationAssociation</a> API. You need specific IAM permissions to successfully associate the Cases
     * domain. For more information, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/required-permissions-iam-cases.html#onboard-cases-iam"
     * >Onboard to Cases</a>.
     * </p>
     * 
     * <pre>
     * <code> &lt;/important&gt; </code>
     * </pre>
     * 
     * @param createDomainRequest
     * @return Result of the CreateDomain operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request. See the accompanying error message
     *         for details.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded. For a list of service quotas, see <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html">Amazon
     *         Connect Service Quotas</a> in the <i>Amazon Connect Administrator Guide</i>.
     * @sample AmazonConnectCases.CreateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/CreateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDomainResult createDomain(CreateDomainRequest createDomainRequest);

    /**
     * <p>
     * Creates a field in the Cases domain. This field is used to define the case object model (that is, defines what
     * data can be captured on cases) in a Cases domain.
     * </p>
     * 
     * @param createFieldRequest
     * @return Result of the CreateField operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request. See the accompanying error message
     *         for details.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded. For a list of service quotas, see <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html">Amazon
     *         Connect Service Quotas</a> in the <i>Amazon Connect Administrator Guide</i>.
     * @sample AmazonConnectCases.CreateField
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/CreateField" target="_top">AWS API
     *      Documentation</a>
     */
    CreateFieldResult createField(CreateFieldRequest createFieldRequest);

    /**
     * <p>
     * Creates a layout in the Cases domain. Layouts define the following configuration in the top section and More Info
     * tab of the Cases user interface:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Fields to display to the users
     * </p>
     * </li>
     * <li>
     * <p>
     * Field ordering
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Title and Status fields cannot be part of layouts since they are not configurable.
     * </p>
     * </note>
     * 
     * @param createLayoutRequest
     * @return Result of the CreateLayout operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request. See the accompanying error message
     *         for details.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded. For a list of service quotas, see <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html">Amazon
     *         Connect Service Quotas</a> in the <i>Amazon Connect Administrator Guide</i>.
     * @sample AmazonConnectCases.CreateLayout
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/CreateLayout" target="_top">AWS API
     *      Documentation</a>
     */
    CreateLayoutResult createLayout(CreateLayoutRequest createLayoutRequest);

    /**
     * <p>
     * Creates a related item (comments, tasks, and contacts) and associates it with a case.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * A Related Item is a resource that is associated with a case. It may or may not have an external identifier
     * linking it to an external resource (for example, a <code>contactArn</code>). All Related Items have their own
     * internal identifier, the <code>relatedItemArn</code>. Examples of related items include <code>comments</code> and
     * <code>contacts</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you provide a value for <code>performedBy.userArn</code> you must also have <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribeUser.html">DescribeUser</a> permission
     * on the ARN of the user that you provide.
     * </p>
     * </li>
     * </ul>
     * 
     * <pre>
     * <code> &lt;/note&gt; </code>
     * </pre>
     * 
     * @param createRelatedItemRequest
     * @return Result of the CreateRelatedItem operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded. For a list of service quotas, see <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html">Amazon
     *         Connect Service Quotas</a> in the <i>Amazon Connect Administrator Guide</i>.
     * @sample AmazonConnectCases.CreateRelatedItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/CreateRelatedItem" target="_top">AWS
     *      API Documentation</a>
     */
    CreateRelatedItemResult createRelatedItem(CreateRelatedItemRequest createRelatedItemRequest);

    /**
     * <p>
     * Creates a template in the Cases domain. This template is used to define the case object model (that is, to define
     * what data can be captured on cases) in a Cases domain. A template must have a unique name within a domain, and it
     * must reference existing field IDs and layout IDs. Additionally, multiple fields with same IDs are not allowed
     * within the same Template. A template can be either Active or Inactive, as indicated by its status. Inactive
     * templates cannot be used to create cases.
     * </p>
     * 
     * @param createTemplateRequest
     * @return Result of the CreateTemplate operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request. See the accompanying error message
     *         for details.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded. For a list of service quotas, see <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html">Amazon
     *         Connect Service Quotas</a> in the <i>Amazon Connect Administrator Guide</i>.
     * @sample AmazonConnectCases.CreateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/CreateTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    CreateTemplateResult createTemplate(CreateTemplateRequest createTemplateRequest);

    /**
     * <p>
     * Deletes a Cases domain.
     * </p>
     * 
     * <pre>
     * <code> &lt;note&gt; &lt;p&gt;After deleting your domain you must disassociate the deleted domain from your Amazon Connect instance with another API call before being able to use Cases again with this Amazon Connect instance. See &lt;a href=&quot;https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteIntegrationAssociation.html&quot;&gt;DeleteIntegrationAssociation&lt;/a&gt;.&lt;/p&gt; &lt;/note&gt; </code>
     * </pre>
     * 
     * @param deleteDomainRequest
     * @return Result of the DeleteDomain operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request. See the accompanying error message
     *         for details.
     * @sample AmazonConnectCases.DeleteDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/DeleteDomain" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDomainResult deleteDomain(DeleteDomainRequest deleteDomainRequest);

    /**
     * <p>
     * Deletes a field from a cases template. You can delete up to 100 fields per domain.
     * </p>
     * <p>
     * After a field is deleted:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can still retrieve the field by calling <code>BatchGetField</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot update a deleted field by calling <code>UpdateField</code>; it throws a
     * <code>ValidationException</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deleted fields are not included in the <code>ListFields</code> response.
     * </p>
     * </li>
     * <li>
     * <p>
     * Calling <code>CreateCase</code> with a deleted field throws a <code>ValidationException</code> denoting which
     * field IDs in the request have been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * Calling <code>GetCase</code> with a deleted field ID returns the deleted field's value if one exists.
     * </p>
     * </li>
     * <li>
     * <p>
     * Calling <code>UpdateCase</code> with a deleted field ID throws a <code>ValidationException</code> if the case
     * does not already contain a value for the deleted field. Otherwise it succeeds, allowing you to update or remove
     * (using <code>emptyValue: {}</code>) the field's value from the case.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GetTemplate</code> does not return field IDs for deleted fields.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GetLayout</code> does not return field IDs for deleted fields.
     * </p>
     * </li>
     * <li>
     * <p>
     * Calling <code>SearchCases</code> with the deleted field ID as a filter returns any cases that have a value for
     * the deleted field that matches the filter criteria.
     * </p>
     * </li>
     * <li>
     * <p>
     * Calling <code>SearchCases</code> with a <code>searchTerm</code> value that matches a deleted field's value on a
     * case returns the case in the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * Calling <code>BatchPutFieldOptions</code> with a deleted field ID throw a <code>ValidationException</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Calling <code>GetCaseEventConfiguration</code> does not return field IDs for deleted fields.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteFieldRequest
     * @return Result of the DeleteField operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request. See the accompanying error message
     *         for details.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded. For a list of service quotas, see <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html">Amazon
     *         Connect Service Quotas</a> in the <i>Amazon Connect Administrator Guide</i>.
     * @sample AmazonConnectCases.DeleteField
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/DeleteField" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFieldResult deleteField(DeleteFieldRequest deleteFieldRequest);

    /**
     * <p>
     * Deletes a layout from a cases template. You can delete up to 100 layouts per domain.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;After a layout is deleted:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;You can still retrieve the layout by calling &lt;code&gt;GetLayout&lt;/code&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;You cannot update a deleted layout by calling &lt;code&gt;UpdateLayout&lt;/code&gt;; it throws a &lt;code&gt;ValidationException&lt;/code&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Deleted layouts are not included in the &lt;code&gt;ListLayouts&lt;/code&gt; response.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; </code>
     * </pre>
     * 
     * @param deleteLayoutRequest
     * @return Result of the DeleteLayout operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request. See the accompanying error message
     *         for details.
     * @sample AmazonConnectCases.DeleteLayout
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/DeleteLayout" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteLayoutResult deleteLayout(DeleteLayoutRequest deleteLayoutRequest);

    /**
     * <p>
     * Deletes a cases template. You can delete up to 100 templates per domain.
     * </p>
     * 
     * <pre>
     * <code> &lt;p&gt;After a cases template is deleted:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;You can still retrieve the template by calling &lt;code&gt;GetTemplate&lt;/code&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;You cannot update the template. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;You cannot create a case by using the deleted template.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Deleted templates are not included in the &lt;code&gt;ListTemplates&lt;/code&gt; response.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; </code>
     * </pre>
     * 
     * @param deleteTemplateRequest
     * @return Result of the DeleteTemplate operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request. See the accompanying error message
     *         for details.
     * @sample AmazonConnectCases.DeleteTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/DeleteTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteTemplateResult deleteTemplate(DeleteTemplateRequest deleteTemplateRequest);

    /**
     * <p>
     * Returns information about a specific case if it exists.
     * </p>
     * 
     * @param getCaseRequest
     * @return Result of the GetCase operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.GetCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/GetCase" target="_top">AWS API
     *      Documentation</a>
     */
    GetCaseResult getCase(GetCaseRequest getCaseRequest);

    /**
     * <p>
     * Returns the audit history about a specific case if it exists.
     * </p>
     * 
     * @param getCaseAuditEventsRequest
     * @return Result of the GetCaseAuditEvents operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.GetCaseAuditEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/GetCaseAuditEvents"
     *      target="_top">AWS API Documentation</a>
     */
    GetCaseAuditEventsResult getCaseAuditEvents(GetCaseAuditEventsRequest getCaseAuditEventsRequest);

    /**
     * <p>
     * Returns the case event publishing configuration.
     * </p>
     * 
     * @param getCaseEventConfigurationRequest
     * @return Result of the GetCaseEventConfiguration operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.GetCaseEventConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/GetCaseEventConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetCaseEventConfigurationResult getCaseEventConfiguration(GetCaseEventConfigurationRequest getCaseEventConfigurationRequest);

    /**
     * <p>
     * Returns information about a specific domain if it exists.
     * </p>
     * 
     * @param getDomainRequest
     * @return Result of the GetDomain operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.GetDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/GetDomain" target="_top">AWS API
     *      Documentation</a>
     */
    GetDomainResult getDomain(GetDomainRequest getDomainRequest);

    /**
     * <p>
     * Returns the details for the requested layout.
     * </p>
     * 
     * @param getLayoutRequest
     * @return Result of the GetLayout operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.GetLayout
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/GetLayout" target="_top">AWS API
     *      Documentation</a>
     */
    GetLayoutResult getLayout(GetLayoutRequest getLayoutRequest);

    /**
     * <p>
     * Returns the details for the requested template.
     * </p>
     * 
     * @param getTemplateRequest
     * @return Result of the GetTemplate operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.GetTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/GetTemplate" target="_top">AWS API
     *      Documentation</a>
     */
    GetTemplateResult getTemplate(GetTemplateRequest getTemplateRequest);

    /**
     * <p>
     * Lists cases for a given contact.
     * </p>
     * 
     * @param listCasesForContactRequest
     * @return Result of the ListCasesForContact operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.ListCasesForContact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/ListCasesForContact"
     *      target="_top">AWS API Documentation</a>
     */
    ListCasesForContactResult listCasesForContact(ListCasesForContactRequest listCasesForContactRequest);

    /**
     * <p>
     * Lists all cases domains in the Amazon Web Services account. Each list item is a condensed summary object of the
     * domain.
     * </p>
     * 
     * @param listDomainsRequest
     * @return Result of the ListDomains operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.ListDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/ListDomains" target="_top">AWS API
     *      Documentation</a>
     */
    ListDomainsResult listDomains(ListDomainsRequest listDomainsRequest);

    /**
     * <p>
     * Lists all of the field options for a field identifier in the domain.
     * </p>
     * 
     * @param listFieldOptionsRequest
     * @return Result of the ListFieldOptions operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.ListFieldOptions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/ListFieldOptions" target="_top">AWS
     *      API Documentation</a>
     */
    ListFieldOptionsResult listFieldOptions(ListFieldOptionsRequest listFieldOptionsRequest);

    /**
     * <p>
     * Lists all fields in a Cases domain.
     * </p>
     * 
     * @param listFieldsRequest
     * @return Result of the ListFields operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.ListFields
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/ListFields" target="_top">AWS API
     *      Documentation</a>
     */
    ListFieldsResult listFields(ListFieldsRequest listFieldsRequest);

    /**
     * <p>
     * Lists all layouts in the given cases domain. Each list item is a condensed summary object of the layout.
     * </p>
     * 
     * @param listLayoutsRequest
     * @return Result of the ListLayouts operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.ListLayouts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/ListLayouts" target="_top">AWS API
     *      Documentation</a>
     */
    ListLayoutsResult listLayouts(ListLayoutsRequest listLayoutsRequest);

    /**
     * <p>
     * Lists tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists all of the templates in a Cases domain. Each list item is a condensed summary object of the template.
     * </p>
     * 
     * @param listTemplatesRequest
     * @return Result of the ListTemplates operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.ListTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/ListTemplates" target="_top">AWS API
     *      Documentation</a>
     */
    ListTemplatesResult listTemplates(ListTemplatesRequest listTemplatesRequest);

    /**
     * <p>
     * Adds case event publishing configuration. For a complete list of fields you can add to the event message, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/case-fields.html">Create case fields</a> in the
     * <i>Amazon Connect Administrator Guide</i>
     * </p>
     * 
     * @param putCaseEventConfigurationRequest
     * @return Result of the PutCaseEventConfiguration operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.PutCaseEventConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/PutCaseEventConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    PutCaseEventConfigurationResult putCaseEventConfiguration(PutCaseEventConfigurationRequest putCaseEventConfigurationRequest);

    /**
     * <p>
     * Searches for cases within their associated Cases domain. Search results are returned as a paginated list of
     * abridged case documents.
     * </p>
     * <note>
     * <p>
     * For <code>customer_id</code> you must provide the full customer profile ARN in this format:
     * <code> arn:aws:profile:your AWS Region:your AWS account ID:domains/profiles domain name/profiles/profile ID</code>
     * .
     * </p>
     * </note>
     * 
     * @param searchCasesRequest
     * @return Result of the SearchCases operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.SearchCases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/SearchCases" target="_top">AWS API
     *      Documentation</a>
     */
    SearchCasesResult searchCases(SearchCasesRequest searchCasesRequest);

    /**
     * <p>
     * Searches for related items that are associated with a case.
     * </p>
     * <note>
     * <p>
     * If no filters are provided, this returns all related items associated with a case.
     * </p>
     * </note>
     * 
     * @param searchRelatedItemsRequest
     * @return Result of the SearchRelatedItems operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.SearchRelatedItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/SearchRelatedItems"
     *      target="_top">AWS API Documentation</a>
     */
    SearchRelatedItemsResult searchRelatedItems(SearchRelatedItemsRequest searchRelatedItemsRequest);

    /**
     * <p>
     * Adds tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Untags a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <note>
     * <p>
     * If you provide a value for <code>PerformedBy.UserArn</code> you must also have <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DescribeUser.html">connect:DescribeUser</a>
     * permission on the User ARN resource that you provide
     * </p>
     * </note>
     * 
     * <pre>
     * <code> &lt;p&gt;Updates the values of fields on a case. Fields to be updated are received as an array of id/value pairs identical to the &lt;code&gt;CreateCase&lt;/code&gt; input .&lt;/p&gt; &lt;p&gt;If the action is successful, the service sends back an HTTP 200 response with an empty HTTP body.&lt;/p&gt; </code>
     * </pre>
     * 
     * @param updateCaseRequest
     * @return Result of the UpdateCase operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonConnectCases.UpdateCase
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/UpdateCase" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateCaseResult updateCase(UpdateCaseRequest updateCaseRequest);

    /**
     * <p>
     * Updates the properties of an existing field.
     * </p>
     * 
     * @param updateFieldRequest
     * @return Result of the UpdateField operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request. See the accompanying error message
     *         for details.
     * @sample AmazonConnectCases.UpdateField
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/UpdateField" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateFieldResult updateField(UpdateFieldRequest updateFieldRequest);

    /**
     * <p>
     * Updates the attributes of an existing layout.
     * </p>
     * <p>
     * If the action is successful, the service sends back an HTTP 200 response with an empty HTTP body.
     * </p>
     * <p>
     * A <code>ValidationException</code> is returned when you add non-existent <code>fieldIds</code> to a layout.
     * </p>
     * <note>
     * <p>
     * Title and Status fields cannot be part of layouts because they are not configurable.
     * </p>
     * </note>
     * 
     * @param updateLayoutRequest
     * @return Result of the UpdateLayout operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request. See the accompanying error message
     *         for details.
     * @throws ServiceQuotaExceededException
     *         The service quota has been exceeded. For a list of service quotas, see <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html">Amazon
     *         Connect Service Quotas</a> in the <i>Amazon Connect Administrator Guide</i>.
     * @sample AmazonConnectCases.UpdateLayout
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/UpdateLayout" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateLayoutResult updateLayout(UpdateLayoutRequest updateLayoutRequest);

    /**
     * <p>
     * Updates the attributes of an existing template. The template attributes that can be modified include
     * <code>name</code>, <code>description</code>, <code>layoutConfiguration</code>, <code>requiredFields</code>, and
     * <code>status</code>. At least one of these attributes must not be null. If a null value is provided for a given
     * attribute, that attribute is ignored and its current value is preserved.
     * </p>
     * 
     * @param updateTemplateRequest
     * @return Result of the UpdateTemplate operation returned by the service.
     * @throws InternalServerException
     *         We couldn't process your request because of an issue with the server. Try again later.
     * @throws ResourceNotFoundException
     *         We couldn't find the requested resource. Check that your resources exists and were created in the same
     *         Amazon Web Services Region as your request, and try your request again.
     * @throws ValidationException
     *         The request isn't valid. Check the syntax and try again.
     * @throws ThrottlingException
     *         The rate has been exceeded for this API. Please try again after a few minutes.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request. See the accompanying error message
     *         for details.
     * @sample AmazonConnectCases.UpdateTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/UpdateTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateTemplateResult updateTemplate(UpdateTemplateRequest updateTemplateRequest);

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
