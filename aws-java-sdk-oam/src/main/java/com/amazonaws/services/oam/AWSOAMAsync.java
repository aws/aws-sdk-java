/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.oam;

import javax.annotation.Generated;

import com.amazonaws.services.oam.model.*;

/**
 * Interface for accessing CloudWatch Observability Access Manager asynchronously. Each asynchronous method will return
 * a Java Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be
 * used to receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.oam.AbstractAWSOAMAsync} instead.
 * </p>
 * <p>
 * <p>
 * Use Amazon CloudWatch Observability Access Manager to create and manage links between source accounts and monitoring
 * accounts by using <i>CloudWatch cross-account observability</i>. With CloudWatch cross-account observability, you can
 * monitor and troubleshoot applications that span multiple accounts within a Region. Seamlessly search, visualize, and
 * analyze your metrics, logs, and traces in any of the linked accounts without account boundaries.
 * </p>
 * 
 * <pre>
 * <code> &lt;p&gt;Set up one or more Amazon Web Services accounts as &lt;i&gt;monitoring accounts&lt;/i&gt; and link them with multiple &lt;i&gt;source accounts&lt;/i&gt;. A monitoring account is a central Amazon Web Services account that can view and interact with observability data generated from source accounts. A source account is an individual Amazon Web Services account that generates observability data for the resources that reside in it. Source accounts share their observability data with the monitoring account. The shared observability data can include metrics in Amazon CloudWatch, logs in Amazon CloudWatch Logs, and traces in X-Ray.&lt;/p&gt; </code>
 * </pre>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSOAMAsync extends AWSOAM {

    /**
     * <p>
     * Creates a link between a source account and a sink that you have created in a monitoring account.
     * </p>
     * <p>
     * Before you create a link, you must create a sink in the monitoring account and create a sink policy in that
     * account. The sink policy must permit the source account to link to it. You can grant permission to source
     * accounts by granting permission to an entire organization or to individual accounts.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_CreateSink.html">CreateSink</a> and <a
     * href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_PutSinkPolicy.html">PutSinkPolicy</a>.
     * </p>
     * <p>
     * Each monitoring account can be linked to as many as 100,000 source accounts.
     * </p>
     * <p>
     * Each source account can be linked to as many as five monitoring accounts.
     * </p>
     * 
     * @param createLinkRequest
     * @return A Java Future containing the result of the CreateLink operation returned by the service.
     * @sample AWSOAMAsync.CreateLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/CreateLink" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLinkResult> createLinkAsync(CreateLinkRequest createLinkRequest);

    /**
     * <p>
     * Creates a link between a source account and a sink that you have created in a monitoring account.
     * </p>
     * <p>
     * Before you create a link, you must create a sink in the monitoring account and create a sink policy in that
     * account. The sink policy must permit the source account to link to it. You can grant permission to source
     * accounts by granting permission to an entire organization or to individual accounts.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_CreateSink.html">CreateSink</a> and <a
     * href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_PutSinkPolicy.html">PutSinkPolicy</a>.
     * </p>
     * <p>
     * Each monitoring account can be linked to as many as 100,000 source accounts.
     * </p>
     * <p>
     * Each source account can be linked to as many as five monitoring accounts.
     * </p>
     * 
     * @param createLinkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLink operation returned by the service.
     * @sample AWSOAMAsyncHandler.CreateLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/CreateLink" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLinkResult> createLinkAsync(CreateLinkRequest createLinkRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLinkRequest, CreateLinkResult> asyncHandler);

    /**
     * <p>
     * Use this to create a <i>sink</i> in the current account, so that it can be used as a monitoring account in
     * CloudWatch cross-account observability. A sink is a resource that represents an attachment point in a monitoring
     * account. Source accounts can link to the sink to send observability data.
     * </p>
     * <p>
     * After you create a sink, you must create a sink policy that allows source accounts to attach to it. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_PutSinkPolicy.html">PutSinkPolicy</a>.
     * </p>
     * <p>
     * Each account can contain one sink. If you delete a sink, you can then create a new one in that account.
     * </p>
     * 
     * @param createSinkRequest
     * @return A Java Future containing the result of the CreateSink operation returned by the service.
     * @sample AWSOAMAsync.CreateSink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/CreateSink" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSinkResult> createSinkAsync(CreateSinkRequest createSinkRequest);

    /**
     * <p>
     * Use this to create a <i>sink</i> in the current account, so that it can be used as a monitoring account in
     * CloudWatch cross-account observability. A sink is a resource that represents an attachment point in a monitoring
     * account. Source accounts can link to the sink to send observability data.
     * </p>
     * <p>
     * After you create a sink, you must create a sink policy that allows source accounts to attach to it. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_PutSinkPolicy.html">PutSinkPolicy</a>.
     * </p>
     * <p>
     * Each account can contain one sink. If you delete a sink, you can then create a new one in that account.
     * </p>
     * 
     * @param createSinkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSink operation returned by the service.
     * @sample AWSOAMAsyncHandler.CreateSink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/CreateSink" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSinkResult> createSinkAsync(CreateSinkRequest createSinkRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSinkRequest, CreateSinkResult> asyncHandler);

    /**
     * <p>
     * Deletes a link between a monitoring account sink and a source account. You must run this operation in the source
     * account.
     * </p>
     * 
     * @param deleteLinkRequest
     * @return A Java Future containing the result of the DeleteLink operation returned by the service.
     * @sample AWSOAMAsync.DeleteLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/DeleteLink" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLinkResult> deleteLinkAsync(DeleteLinkRequest deleteLinkRequest);

    /**
     * <p>
     * Deletes a link between a monitoring account sink and a source account. You must run this operation in the source
     * account.
     * </p>
     * 
     * @param deleteLinkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLink operation returned by the service.
     * @sample AWSOAMAsyncHandler.DeleteLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/DeleteLink" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLinkResult> deleteLinkAsync(DeleteLinkRequest deleteLinkRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLinkRequest, DeleteLinkResult> asyncHandler);

    /**
     * <p>
     * Deletes a sink. You must delete all links to a sink before you can delete that sink.
     * </p>
     * 
     * @param deleteSinkRequest
     * @return A Java Future containing the result of the DeleteSink operation returned by the service.
     * @sample AWSOAMAsync.DeleteSink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/DeleteSink" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSinkResult> deleteSinkAsync(DeleteSinkRequest deleteSinkRequest);

    /**
     * <p>
     * Deletes a sink. You must delete all links to a sink before you can delete that sink.
     * </p>
     * 
     * @param deleteSinkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSink operation returned by the service.
     * @sample AWSOAMAsyncHandler.DeleteSink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/DeleteSink" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteSinkResult> deleteSinkAsync(DeleteSinkRequest deleteSinkRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSinkRequest, DeleteSinkResult> asyncHandler);

    /**
     * <p>
     * Returns complete information about one link.
     * </p>
     * <p>
     * To use this operation, provide the link ARN. To retrieve a list of link ARNs, use <a
     * href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_ListLinks.html">ListLinks</a>.
     * </p>
     * 
     * @param getLinkRequest
     * @return A Java Future containing the result of the GetLink operation returned by the service.
     * @sample AWSOAMAsync.GetLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/GetLink" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLinkResult> getLinkAsync(GetLinkRequest getLinkRequest);

    /**
     * <p>
     * Returns complete information about one link.
     * </p>
     * <p>
     * To use this operation, provide the link ARN. To retrieve a list of link ARNs, use <a
     * href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_ListLinks.html">ListLinks</a>.
     * </p>
     * 
     * @param getLinkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLink operation returned by the service.
     * @sample AWSOAMAsyncHandler.GetLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/GetLink" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLinkResult> getLinkAsync(GetLinkRequest getLinkRequest,
            com.amazonaws.handlers.AsyncHandler<GetLinkRequest, GetLinkResult> asyncHandler);

    /**
     * <p>
     * Returns complete information about one monitoring account sink.
     * </p>
     * <p>
     * To use this operation, provide the sink ARN. To retrieve a list of sink ARNs, use <a
     * href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_ListSinks.html">ListSinks</a>.
     * </p>
     * 
     * @param getSinkRequest
     * @return A Java Future containing the result of the GetSink operation returned by the service.
     * @sample AWSOAMAsync.GetSink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/GetSink" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSinkResult> getSinkAsync(GetSinkRequest getSinkRequest);

    /**
     * <p>
     * Returns complete information about one monitoring account sink.
     * </p>
     * <p>
     * To use this operation, provide the sink ARN. To retrieve a list of sink ARNs, use <a
     * href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_ListSinks.html">ListSinks</a>.
     * </p>
     * 
     * @param getSinkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSink operation returned by the service.
     * @sample AWSOAMAsyncHandler.GetSink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/GetSink" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSinkResult> getSinkAsync(GetSinkRequest getSinkRequest,
            com.amazonaws.handlers.AsyncHandler<GetSinkRequest, GetSinkResult> asyncHandler);

    /**
     * <p>
     * Returns the current sink policy attached to this sink. The sink policy specifies what accounts can attach to this
     * sink as source accounts, and what types of data they can share.
     * </p>
     * 
     * @param getSinkPolicyRequest
     * @return A Java Future containing the result of the GetSinkPolicy operation returned by the service.
     * @sample AWSOAMAsync.GetSinkPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/GetSinkPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSinkPolicyResult> getSinkPolicyAsync(GetSinkPolicyRequest getSinkPolicyRequest);

    /**
     * <p>
     * Returns the current sink policy attached to this sink. The sink policy specifies what accounts can attach to this
     * sink as source accounts, and what types of data they can share.
     * </p>
     * 
     * @param getSinkPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSinkPolicy operation returned by the service.
     * @sample AWSOAMAsyncHandler.GetSinkPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/GetSinkPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSinkPolicyResult> getSinkPolicyAsync(GetSinkPolicyRequest getSinkPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetSinkPolicyRequest, GetSinkPolicyResult> asyncHandler);

    /**
     * <p>
     * Returns a list of source account links that are linked to this monitoring account sink.
     * </p>
     * <p>
     * To use this operation, provide the sink ARN. To retrieve a list of sink ARNs, use <a
     * href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_ListSinks.html">ListSinks</a>.
     * </p>
     * <p>
     * To find a list of links for one source account, use <a
     * href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_ListLinks.html">ListLinks</a>.
     * </p>
     * 
     * @param listAttachedLinksRequest
     * @return A Java Future containing the result of the ListAttachedLinks operation returned by the service.
     * @sample AWSOAMAsync.ListAttachedLinks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/ListAttachedLinks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAttachedLinksResult> listAttachedLinksAsync(ListAttachedLinksRequest listAttachedLinksRequest);

    /**
     * <p>
     * Returns a list of source account links that are linked to this monitoring account sink.
     * </p>
     * <p>
     * To use this operation, provide the sink ARN. To retrieve a list of sink ARNs, use <a
     * href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_ListSinks.html">ListSinks</a>.
     * </p>
     * <p>
     * To find a list of links for one source account, use <a
     * href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_ListLinks.html">ListLinks</a>.
     * </p>
     * 
     * @param listAttachedLinksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAttachedLinks operation returned by the service.
     * @sample AWSOAMAsyncHandler.ListAttachedLinks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/ListAttachedLinks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAttachedLinksResult> listAttachedLinksAsync(ListAttachedLinksRequest listAttachedLinksRequest,
            com.amazonaws.handlers.AsyncHandler<ListAttachedLinksRequest, ListAttachedLinksResult> asyncHandler);

    /**
     * <p>
     * Use this operation in a source account to return a list of links to monitoring account sinks that this source
     * account has.
     * </p>
     * <p>
     * To find a list of links for one monitoring account sink, use <a
     * href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_ListAttachedLinks.html">ListAttachedLinks</a> from
     * within the monitoring account.
     * </p>
     * 
     * @param listLinksRequest
     * @return A Java Future containing the result of the ListLinks operation returned by the service.
     * @sample AWSOAMAsync.ListLinks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/ListLinks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLinksResult> listLinksAsync(ListLinksRequest listLinksRequest);

    /**
     * <p>
     * Use this operation in a source account to return a list of links to monitoring account sinks that this source
     * account has.
     * </p>
     * <p>
     * To find a list of links for one monitoring account sink, use <a
     * href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_ListAttachedLinks.html">ListAttachedLinks</a> from
     * within the monitoring account.
     * </p>
     * 
     * @param listLinksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLinks operation returned by the service.
     * @sample AWSOAMAsyncHandler.ListLinks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/ListLinks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLinksResult> listLinksAsync(ListLinksRequest listLinksRequest,
            com.amazonaws.handlers.AsyncHandler<ListLinksRequest, ListLinksResult> asyncHandler);

    /**
     * <p>
     * Use this operation in a monitoring account to return the list of sinks created in that account.
     * </p>
     * 
     * @param listSinksRequest
     * @return A Java Future containing the result of the ListSinks operation returned by the service.
     * @sample AWSOAMAsync.ListSinks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/ListSinks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSinksResult> listSinksAsync(ListSinksRequest listSinksRequest);

    /**
     * <p>
     * Use this operation in a monitoring account to return the list of sinks created in that account.
     * </p>
     * 
     * @param listSinksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSinks operation returned by the service.
     * @sample AWSOAMAsyncHandler.ListSinks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/ListSinks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSinksResult> listSinksAsync(ListSinksRequest listSinksRequest,
            com.amazonaws.handlers.AsyncHandler<ListSinksRequest, ListSinksResult> asyncHandler);

    /**
     * <p>
     * Displays the tags associated with a resource. Both sinks and links support tagging.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSOAMAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Displays the tags associated with a resource. Both sinks and links support tagging.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSOAMAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Creates or updates the resource policy that grants permissions to source accounts to link to the monitoring
     * account sink. When you create a sink policy, you can grant permissions to all accounts in an organization or to
     * individual accounts.
     * </p>
     * <p>
     * You can also use a sink policy to limit the types of data that is shared. The three types that you can allow or
     * deny are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Metrics</b> - Specify with <code>AWS::CloudWatch::Metric</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Log groups</b> - Specify with <code>AWS::Logs::LogGroup</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Traces</b> - Specify with <code>AWS::XRay::Trace</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * See the examples in this section to see how to specify permitted source accounts and data types.
     * </p>
     * 
     * @param putSinkPolicyRequest
     * @return A Java Future containing the result of the PutSinkPolicy operation returned by the service.
     * @sample AWSOAMAsync.PutSinkPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/PutSinkPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutSinkPolicyResult> putSinkPolicyAsync(PutSinkPolicyRequest putSinkPolicyRequest);

    /**
     * <p>
     * Creates or updates the resource policy that grants permissions to source accounts to link to the monitoring
     * account sink. When you create a sink policy, you can grant permissions to all accounts in an organization or to
     * individual accounts.
     * </p>
     * <p>
     * You can also use a sink policy to limit the types of data that is shared. The three types that you can allow or
     * deny are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Metrics</b> - Specify with <code>AWS::CloudWatch::Metric</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Log groups</b> - Specify with <code>AWS::Logs::LogGroup</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Traces</b> - Specify with <code>AWS::XRay::Trace</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * See the examples in this section to see how to specify permitted source accounts and data types.
     * </p>
     * 
     * @param putSinkPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutSinkPolicy operation returned by the service.
     * @sample AWSOAMAsyncHandler.PutSinkPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/PutSinkPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutSinkPolicyResult> putSinkPolicyAsync(PutSinkPolicyRequest putSinkPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutSinkPolicyRequest, PutSinkPolicyResult> asyncHandler);

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified resource. Both sinks and links can be tagged.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     * characters.
     * </p>
     * <p>
     * You can use the <code>TagResource</code> action with a resource that already has tags. If you specify a new tag
     * key for the alarm, this tag is appended to the list of tags associated with the alarm. If you specify a tag key
     * that is already associated with the alarm, the new tag value that you specify replaces the previous value for
     * that tag.
     * </p>
     * <p>
     * You can associate as many as 50 tags with a resource.
     * </p>
     * <important>
     * <p>
     * Unlike tagging permissions in other Amazon Web Services services, to tag or untag links and sinks you must have
     * the <code>oam:ResourceTag</code> permission. The <code>iam:ResourceTag</code> permission does not allow you to
     * tag and untag links and sinks.
     * </p>
     * </important>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSOAMAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified resource. Both sinks and links can be tagged.
     * </p>
     * <p>
     * Tags can help you organize and categorize your resources. You can also use them to scope user permissions by
     * granting a user permission to access or change only resources with certain tag values.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of
     * characters.
     * </p>
     * <p>
     * You can use the <code>TagResource</code> action with a resource that already has tags. If you specify a new tag
     * key for the alarm, this tag is appended to the list of tags associated with the alarm. If you specify a tag key
     * that is already associated with the alarm, the new tag value that you specify replaces the previous value for
     * that tag.
     * </p>
     * <p>
     * You can associate as many as 50 tags with a resource.
     * </p>
     * <important>
     * <p>
     * Unlike tagging permissions in other Amazon Web Services services, to tag or untag links and sinks you must have
     * the <code>oam:ResourceTag</code> permission. The <code>iam:ResourceTag</code> permission does not allow you to
     * tag and untag links and sinks.
     * </p>
     * </important>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSOAMAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tags from the specified resource.
     * </p>
     * <important>
     * <p>
     * Unlike tagging permissions in other Amazon Web Services services, to tag or untag links and sinks you must have
     * the <code>oam:ResourceTag</code> permission. The <code>iam:TagResource</code> permission does not allow you to
     * tag and untag links and sinks.
     * </p>
     * </important>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSOAMAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from the specified resource.
     * </p>
     * <important>
     * <p>
     * Unlike tagging permissions in other Amazon Web Services services, to tag or untag links and sinks you must have
     * the <code>oam:ResourceTag</code> permission. The <code>iam:TagResource</code> permission does not allow you to
     * tag and untag links and sinks.
     * </p>
     * </important>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSOAMAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Use this operation to change what types of data are shared from a source account to its linked monitoring account
     * sink. You can't change the sink or change the monitoring account with this operation.
     * </p>
     * <p>
     * To update the list of tags associated with the sink, use <a
     * href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_TagResource.html">TagResource</a>.
     * </p>
     * 
     * @param updateLinkRequest
     * @return A Java Future containing the result of the UpdateLink operation returned by the service.
     * @sample AWSOAMAsync.UpdateLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/UpdateLink" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateLinkResult> updateLinkAsync(UpdateLinkRequest updateLinkRequest);

    /**
     * <p>
     * Use this operation to change what types of data are shared from a source account to its linked monitoring account
     * sink. You can't change the sink or change the monitoring account with this operation.
     * </p>
     * <p>
     * To update the list of tags associated with the sink, use <a
     * href="https://docs.aws.amazon.com/OAM/latest/APIReference/API_TagResource.html">TagResource</a>.
     * </p>
     * 
     * @param updateLinkRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateLink operation returned by the service.
     * @sample AWSOAMAsyncHandler.UpdateLink
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/oam-2022-06-10/UpdateLink" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateLinkResult> updateLinkAsync(UpdateLinkRequest updateLinkRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateLinkRequest, UpdateLinkResult> asyncHandler);

}
