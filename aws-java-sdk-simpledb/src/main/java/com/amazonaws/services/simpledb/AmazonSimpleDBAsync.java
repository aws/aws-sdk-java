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
package com.amazonaws.services.simpledb;

import javax.annotation.Generated;

import com.amazonaws.services.simpledb.model.*;

/**
 * Interface for accessing Amazon SimpleDB asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.simpledb.AbstractAmazonSimpleDBAsync} instead.
 * </p>
 * <p>
 * Amazon SimpleDB is a web service providing the core database functions of data indexing and querying in the cloud. By
 * offloading the time and effort associated with building and operating a web-scale database, SimpleDB provides
 * developers the freedom to focus on application development.
 * <p>
 * A traditional, clustered relational database requires a sizable upfront capital outlay, is complex to design, and
 * often requires extensive and repetitive database administration. Amazon SimpleDB is dramatically simpler, requiring
 * no schema, automatically indexing your data and providing a simple API for storage and access. This approach
 * eliminates the administrative burden of data modeling, index maintenance, and performance tuning. Developers gain
 * access to this functionality within Amazon's proven computing environment, are able to scale instantly, and pay only
 * for what they use.
 * </p>
 * <p>
 * Visit <a href="http://aws.amazon.com/simpledb/">http://aws.amazon.com/simpledb/</a> for more information.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonSimpleDBAsync extends AmazonSimpleDB {

    /**
     * <p>
     * Performs multiple DeleteAttributes operations in a single call, which reduces round trips and latencies. This
     * enables Amazon SimpleDB to optimize requests, which generally yields better throughput.
     * </p>
     * <p>
     * The following limitations are enforced for this operation:
     * <ul>
     * <li>1 MB request size</li>
     * <li>25 item limit per BatchDeleteAttributes operation</li>
     * </ul>
     * </p>
     * 
     * @param batchDeleteAttributesRequest
     * @return A Java Future containing the result of the BatchDeleteAttributes operation returned by the service.
     * @sample AmazonSimpleDBAsync.BatchDeleteAttributes
     */
    java.util.concurrent.Future<BatchDeleteAttributesResult> batchDeleteAttributesAsync(BatchDeleteAttributesRequest batchDeleteAttributesRequest);

    /**
     * <p>
     * Performs multiple DeleteAttributes operations in a single call, which reduces round trips and latencies. This
     * enables Amazon SimpleDB to optimize requests, which generally yields better throughput.
     * </p>
     * <p>
     * The following limitations are enforced for this operation:
     * <ul>
     * <li>1 MB request size</li>
     * <li>25 item limit per BatchDeleteAttributes operation</li>
     * </ul>
     * </p>
     * 
     * @param batchDeleteAttributesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDeleteAttributes operation returned by the service.
     * @sample AmazonSimpleDBAsyncHandler.BatchDeleteAttributes
     */
    java.util.concurrent.Future<BatchDeleteAttributesResult> batchDeleteAttributesAsync(BatchDeleteAttributesRequest batchDeleteAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDeleteAttributesRequest, BatchDeleteAttributesResult> asyncHandler);

    /**
     * <p>
     * The <code>BatchPutAttributes</code> operation creates or replaces attributes within one or more items. By using
     * this operation, the client can perform multiple <a>PutAttribute</a> operation with a single call. This helps
     * yield savings in round trips and latencies, enabling Amazon SimpleDB to optimize requests and generally produce
     * better throughput.
     * </p>
     * <p>
     * The client may specify the item name with the <code>Item.X.ItemName</code> parameter. The client may specify new
     * attributes using a combination of the <code>Item.X.Attribute.Y.Name</code> and
     * <code>Item.X.Attribute.Y.Value</code> parameters. The client may specify the first attribute for the first item
     * using the parameters <code>Item.0.Attribute.0.Name</code> and <code>Item.0.Attribute.0.Value</code>, and for the
     * second attribute for the first item by the parameters <code>Item.0.Attribute.1.Name</code> and
     * <code>Item.0.Attribute.1.Value</code>, and so on.
     * </p>
     * <p>
     * Attributes are uniquely identified within an item by their name/value combination. For example, a single item can
     * have the attributes <code>{ "first_name", "first_value" }</code> and
     * <code>{ "first_name", "second_value" }</code>. However, it cannot have two attribute instances where both the
     * <code>Item.X.Attribute.Y.Name</code> and <code>Item.X.Attribute.Y.Value</code> are the same.
     * </p>
     * <p>
     * Optionally, the requester can supply the <code>Replace</code> parameter for each individual value. Setting this
     * value to <code>true</code> will cause the new attribute values to replace the existing attribute values. For
     * example, if an item <code>I</code> has the attributes <code>{ 'a', '1' }, { 'b', '2'}</code> and
     * <code>{ 'b', '3' }</code> and the requester does a BatchPutAttributes of <code>{'I', 'b', '4' }</code> with the
     * Replace parameter set to true, the final attributes of the item will be <code>{ 'a', '1' }</code> and
     * <code>{ 'b', '4' }</code>, replacing the previous values of the 'b' attribute with the new value.
     * </p>
     * <important> This operation is vulnerable to exceeding the maximum URL size when making a REST request using the
     * HTTP GET method. This operation does not support conditions using <code>Expected.X.Name</code>,
     * <code>Expected.X.Value</code>, or <code>Expected.X.Exists</code>. </important>
     * <p>
     * You can execute multiple <code>BatchPutAttributes</code> operations and other operations in parallel. However,
     * large numbers of concurrent <code>BatchPutAttributes</code> calls can result in Service Unavailable (503)
     * responses.
     * </p>
     * <p>
     * The following limitations are enforced for this operation:
     * <ul>
     * <li>256 attribute name-value pairs per item</li>
     * <li>1 MB request size</li>
     * <li>1 billion attributes per domain</li>
     * <li>10 GB of total user data storage per domain</li>
     * <li>25 item limit per <code>BatchPutAttributes</code> operation</li>
     * </ul>
     * </p>
     * 
     * @param batchPutAttributesRequest
     * @return A Java Future containing the result of the BatchPutAttributes operation returned by the service.
     * @sample AmazonSimpleDBAsync.BatchPutAttributes
     */
    java.util.concurrent.Future<BatchPutAttributesResult> batchPutAttributesAsync(BatchPutAttributesRequest batchPutAttributesRequest);

    /**
     * <p>
     * The <code>BatchPutAttributes</code> operation creates or replaces attributes within one or more items. By using
     * this operation, the client can perform multiple <a>PutAttribute</a> operation with a single call. This helps
     * yield savings in round trips and latencies, enabling Amazon SimpleDB to optimize requests and generally produce
     * better throughput.
     * </p>
     * <p>
     * The client may specify the item name with the <code>Item.X.ItemName</code> parameter. The client may specify new
     * attributes using a combination of the <code>Item.X.Attribute.Y.Name</code> and
     * <code>Item.X.Attribute.Y.Value</code> parameters. The client may specify the first attribute for the first item
     * using the parameters <code>Item.0.Attribute.0.Name</code> and <code>Item.0.Attribute.0.Value</code>, and for the
     * second attribute for the first item by the parameters <code>Item.0.Attribute.1.Name</code> and
     * <code>Item.0.Attribute.1.Value</code>, and so on.
     * </p>
     * <p>
     * Attributes are uniquely identified within an item by their name/value combination. For example, a single item can
     * have the attributes <code>{ "first_name", "first_value" }</code> and
     * <code>{ "first_name", "second_value" }</code>. However, it cannot have two attribute instances where both the
     * <code>Item.X.Attribute.Y.Name</code> and <code>Item.X.Attribute.Y.Value</code> are the same.
     * </p>
     * <p>
     * Optionally, the requester can supply the <code>Replace</code> parameter for each individual value. Setting this
     * value to <code>true</code> will cause the new attribute values to replace the existing attribute values. For
     * example, if an item <code>I</code> has the attributes <code>{ 'a', '1' }, { 'b', '2'}</code> and
     * <code>{ 'b', '3' }</code> and the requester does a BatchPutAttributes of <code>{'I', 'b', '4' }</code> with the
     * Replace parameter set to true, the final attributes of the item will be <code>{ 'a', '1' }</code> and
     * <code>{ 'b', '4' }</code>, replacing the previous values of the 'b' attribute with the new value.
     * </p>
     * <important> This operation is vulnerable to exceeding the maximum URL size when making a REST request using the
     * HTTP GET method. This operation does not support conditions using <code>Expected.X.Name</code>,
     * <code>Expected.X.Value</code>, or <code>Expected.X.Exists</code>. </important>
     * <p>
     * You can execute multiple <code>BatchPutAttributes</code> operations and other operations in parallel. However,
     * large numbers of concurrent <code>BatchPutAttributes</code> calls can result in Service Unavailable (503)
     * responses.
     * </p>
     * <p>
     * The following limitations are enforced for this operation:
     * <ul>
     * <li>256 attribute name-value pairs per item</li>
     * <li>1 MB request size</li>
     * <li>1 billion attributes per domain</li>
     * <li>10 GB of total user data storage per domain</li>
     * <li>25 item limit per <code>BatchPutAttributes</code> operation</li>
     * </ul>
     * </p>
     * 
     * @param batchPutAttributesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchPutAttributes operation returned by the service.
     * @sample AmazonSimpleDBAsyncHandler.BatchPutAttributes
     */
    java.util.concurrent.Future<BatchPutAttributesResult> batchPutAttributesAsync(BatchPutAttributesRequest batchPutAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<BatchPutAttributesRequest, BatchPutAttributesResult> asyncHandler);

    /**
     * <p>
     * The <code>CreateDomain</code> operation creates a new domain. The domain name should be unique among the domains
     * associated with the Access Key ID provided in the request. The <code>CreateDomain</code> operation may take 10 or
     * more seconds to complete.
     * </p>
     * <p>
     * The client can create up to 100 domains per account.
     * </p>
     * <p>
     * If the client requires additional domains, go to <a
     * href="http://aws.amazon.com/contact-us/simpledb-limit-request/">
     * http://aws.amazon.com/contact-us/simpledb-limit-request/</a>.
     * </p>
     * 
     * @param createDomainRequest
     * @return A Java Future containing the result of the CreateDomain operation returned by the service.
     * @sample AmazonSimpleDBAsync.CreateDomain
     */
    java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest createDomainRequest);

    /**
     * <p>
     * The <code>CreateDomain</code> operation creates a new domain. The domain name should be unique among the domains
     * associated with the Access Key ID provided in the request. The <code>CreateDomain</code> operation may take 10 or
     * more seconds to complete.
     * </p>
     * <p>
     * The client can create up to 100 domains per account.
     * </p>
     * <p>
     * If the client requires additional domains, go to <a
     * href="http://aws.amazon.com/contact-us/simpledb-limit-request/">
     * http://aws.amazon.com/contact-us/simpledb-limit-request/</a>.
     * </p>
     * 
     * @param createDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDomain operation returned by the service.
     * @sample AmazonSimpleDBAsyncHandler.CreateDomain
     */
    java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest createDomainRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDomainRequest, CreateDomainResult> asyncHandler);

    /**
     * <p>
     * Deletes one or more attributes associated with an item. If all attributes of the item are deleted, the item is
     * deleted.
     * </p>
     * <p>
     * <code>DeleteAttributes</code> is an idempotent operation; running it multiple times on the same item or attribute
     * does not result in an error response.
     * </p>
     * <p>
     * Because Amazon SimpleDB makes multiple copies of item data and uses an eventual consistency update model,
     * performing a <a>GetAttributes</a> or <a>Select</a> operation (read) immediately after a
     * <code>DeleteAttributes</code> or <a>PutAttributes</a> operation (write) might not return updated item data.
     * </p>
     * 
     * @param deleteAttributesRequest
     * @return A Java Future containing the result of the DeleteAttributes operation returned by the service.
     * @sample AmazonSimpleDBAsync.DeleteAttributes
     */
    java.util.concurrent.Future<DeleteAttributesResult> deleteAttributesAsync(DeleteAttributesRequest deleteAttributesRequest);

    /**
     * <p>
     * Deletes one or more attributes associated with an item. If all attributes of the item are deleted, the item is
     * deleted.
     * </p>
     * <p>
     * <code>DeleteAttributes</code> is an idempotent operation; running it multiple times on the same item or attribute
     * does not result in an error response.
     * </p>
     * <p>
     * Because Amazon SimpleDB makes multiple copies of item data and uses an eventual consistency update model,
     * performing a <a>GetAttributes</a> or <a>Select</a> operation (read) immediately after a
     * <code>DeleteAttributes</code> or <a>PutAttributes</a> operation (write) might not return updated item data.
     * </p>
     * 
     * @param deleteAttributesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAttributes operation returned by the service.
     * @sample AmazonSimpleDBAsyncHandler.DeleteAttributes
     */
    java.util.concurrent.Future<DeleteAttributesResult> deleteAttributesAsync(DeleteAttributesRequest deleteAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAttributesRequest, DeleteAttributesResult> asyncHandler);

    /**
     * <p>
     * The <code>DeleteDomain</code> operation deletes a domain. Any items (and their attributes) in the domain are
     * deleted as well. The <code>DeleteDomain</code> operation might take 10 or more seconds to complete.
     * </p>
     * 
     * @param deleteDomainRequest
     * @return A Java Future containing the result of the DeleteDomain operation returned by the service.
     * @sample AmazonSimpleDBAsync.DeleteDomain
     */
    java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest deleteDomainRequest);

    /**
     * <p>
     * The <code>DeleteDomain</code> operation deletes a domain. Any items (and their attributes) in the domain are
     * deleted as well. The <code>DeleteDomain</code> operation might take 10 or more seconds to complete.
     * </p>
     * 
     * @param deleteDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDomain operation returned by the service.
     * @sample AmazonSimpleDBAsyncHandler.DeleteDomain
     */
    java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest deleteDomainRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDomainRequest, DeleteDomainResult> asyncHandler);

    /**
     * <p>
     * Returns information about the domain, including when the domain was created, the number of items and attributes
     * in the domain, and the size of the attribute names and values.
     * </p>
     * 
     * @param domainMetadataRequest
     * @return A Java Future containing the result of the DomainMetadata operation returned by the service.
     * @sample AmazonSimpleDBAsync.DomainMetadata
     */
    java.util.concurrent.Future<DomainMetadataResult> domainMetadataAsync(DomainMetadataRequest domainMetadataRequest);

    /**
     * <p>
     * Returns information about the domain, including when the domain was created, the number of items and attributes
     * in the domain, and the size of the attribute names and values.
     * </p>
     * 
     * @param domainMetadataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DomainMetadata operation returned by the service.
     * @sample AmazonSimpleDBAsyncHandler.DomainMetadata
     */
    java.util.concurrent.Future<DomainMetadataResult> domainMetadataAsync(DomainMetadataRequest domainMetadataRequest,
            com.amazonaws.handlers.AsyncHandler<DomainMetadataRequest, DomainMetadataResult> asyncHandler);

    /**
     * <p>
     * Returns all of the attributes associated with the specified item. Optionally, the attributes returned can be
     * limited to one or more attributes by specifying an attribute name parameter.
     * </p>
     * <p>
     * If the item does not exist on the replica that was accessed for this operation, an empty set is returned. The
     * system does not return an error as it cannot guarantee the item does not exist on other replicas.
     * </p>
     * 
     * @param getAttributesRequest
     * @return A Java Future containing the result of the GetAttributes operation returned by the service.
     * @sample AmazonSimpleDBAsync.GetAttributes
     */
    java.util.concurrent.Future<GetAttributesResult> getAttributesAsync(GetAttributesRequest getAttributesRequest);

    /**
     * <p>
     * Returns all of the attributes associated with the specified item. Optionally, the attributes returned can be
     * limited to one or more attributes by specifying an attribute name parameter.
     * </p>
     * <p>
     * If the item does not exist on the replica that was accessed for this operation, an empty set is returned. The
     * system does not return an error as it cannot guarantee the item does not exist on other replicas.
     * </p>
     * 
     * @param getAttributesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAttributes operation returned by the service.
     * @sample AmazonSimpleDBAsyncHandler.GetAttributes
     */
    java.util.concurrent.Future<GetAttributesResult> getAttributesAsync(GetAttributesRequest getAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<GetAttributesRequest, GetAttributesResult> asyncHandler);

    /**
     * <p>
     * The <code>ListDomains</code> operation lists all domains associated with the Access Key ID. It returns domain
     * names up to the limit set by <a href="#MaxNumberOfDomains">MaxNumberOfDomains</a>. A <a
     * href="#NextToken">NextToken</a> is returned if there are more than <code>MaxNumberOfDomains</code> domains.
     * Calling <code>ListDomains</code> successive times with the <code>NextToken</code> provided by the operation
     * returns up to <code>MaxNumberOfDomains</code> more domain names with each successive operation call.
     * </p>
     * 
     * @param listDomainsRequest
     * @return A Java Future containing the result of the ListDomains operation returned by the service.
     * @sample AmazonSimpleDBAsync.ListDomains
     */
    java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest listDomainsRequest);

    /**
     * <p>
     * The <code>ListDomains</code> operation lists all domains associated with the Access Key ID. It returns domain
     * names up to the limit set by <a href="#MaxNumberOfDomains">MaxNumberOfDomains</a>. A <a
     * href="#NextToken">NextToken</a> is returned if there are more than <code>MaxNumberOfDomains</code> domains.
     * Calling <code>ListDomains</code> successive times with the <code>NextToken</code> provided by the operation
     * returns up to <code>MaxNumberOfDomains</code> more domain names with each successive operation call.
     * </p>
     * 
     * @param listDomainsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDomains operation returned by the service.
     * @sample AmazonSimpleDBAsyncHandler.ListDomains
     */
    java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(ListDomainsRequest listDomainsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDomainsRequest, ListDomainsResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListDomains operation.
     *
     * @see #listDomainsAsync(ListDomainsRequest)
     */
    java.util.concurrent.Future<ListDomainsResult> listDomainsAsync();

    /**
     * Simplified method form for invoking the ListDomains operation with an AsyncHandler.
     *
     * @see #listDomainsAsync(ListDomainsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListDomainsResult> listDomainsAsync(com.amazonaws.handlers.AsyncHandler<ListDomainsRequest, ListDomainsResult> asyncHandler);

    /**
     * <p>
     * The PutAttributes operation creates or replaces attributes in an item. The client may specify new attributes
     * using a combination of the <code>Attribute.X.Name</code> and <code>Attribute.X.Value</code> parameters. The
     * client specifies the first attribute by the parameters <code>Attribute.0.Name</code> and
     * <code>Attribute.0.Value</code>, the second attribute by the parameters <code>Attribute.1.Name</code> and
     * <code>Attribute.1.Value</code>, and so on.
     * </p>
     * <p>
     * Attributes are uniquely identified in an item by their name/value combination. For example, a single item can
     * have the attributes <code>{ "first_name", "first_value" }</code> and <code>{ "first_name", second_value" }</code>
     * . However, it cannot have two attribute instances where both the <code>Attribute.X.Name</code> and
     * <code>Attribute.X.Value</code> are the same.
     * </p>
     * <p>
     * Optionally, the requestor can supply the <code>Replace</code> parameter for each individual attribute. Setting
     * this value to <code>true</code> causes the new attribute value to replace the existing attribute value(s). For
     * example, if an item has the attributes <code>{ 'a', '1' }</code>, <code>{ 'b', '2'}</code> and
     * <code>{ 'b', '3' }</code> and the requestor calls <code>PutAttributes</code> using the attributes
     * <code>{ 'b', '4' }</code> with the <code>Replace</code> parameter set to true, the final attributes of the item
     * are changed to <code>{ 'a', '1' }</code> and <code>{ 'b', '4' }</code>, which replaces the previous values of the
     * 'b' attribute with the new value.
     * </p>
     * <p>
     * You cannot specify an empty string as an attribute name.
     * </p>
     * <p>
     * Because Amazon SimpleDB makes multiple copies of client data and uses an eventual consistency update model, an
     * immediate <a>GetAttributes</a> or <a>Select</a> operation (read) immediately after a <a>PutAttributes</a> or
     * <a>DeleteAttributes</a> operation (write) might not return the updated data.
     * </p>
     * <p>
     * The following limitations are enforced for this operation:
     * <ul>
     * <li>256 total attribute name-value pairs per item</li>
     * <li>One billion attributes per domain</li>
     * <li>10 GB of total user data storage per domain</li>
     * </ul>
     * </p>
     * 
     * @param putAttributesRequest
     * @return A Java Future containing the result of the PutAttributes operation returned by the service.
     * @sample AmazonSimpleDBAsync.PutAttributes
     */
    java.util.concurrent.Future<PutAttributesResult> putAttributesAsync(PutAttributesRequest putAttributesRequest);

    /**
     * <p>
     * The PutAttributes operation creates or replaces attributes in an item. The client may specify new attributes
     * using a combination of the <code>Attribute.X.Name</code> and <code>Attribute.X.Value</code> parameters. The
     * client specifies the first attribute by the parameters <code>Attribute.0.Name</code> and
     * <code>Attribute.0.Value</code>, the second attribute by the parameters <code>Attribute.1.Name</code> and
     * <code>Attribute.1.Value</code>, and so on.
     * </p>
     * <p>
     * Attributes are uniquely identified in an item by their name/value combination. For example, a single item can
     * have the attributes <code>{ "first_name", "first_value" }</code> and <code>{ "first_name", second_value" }</code>
     * . However, it cannot have two attribute instances where both the <code>Attribute.X.Name</code> and
     * <code>Attribute.X.Value</code> are the same.
     * </p>
     * <p>
     * Optionally, the requestor can supply the <code>Replace</code> parameter for each individual attribute. Setting
     * this value to <code>true</code> causes the new attribute value to replace the existing attribute value(s). For
     * example, if an item has the attributes <code>{ 'a', '1' }</code>, <code>{ 'b', '2'}</code> and
     * <code>{ 'b', '3' }</code> and the requestor calls <code>PutAttributes</code> using the attributes
     * <code>{ 'b', '4' }</code> with the <code>Replace</code> parameter set to true, the final attributes of the item
     * are changed to <code>{ 'a', '1' }</code> and <code>{ 'b', '4' }</code>, which replaces the previous values of the
     * 'b' attribute with the new value.
     * </p>
     * <p>
     * You cannot specify an empty string as an attribute name.
     * </p>
     * <p>
     * Because Amazon SimpleDB makes multiple copies of client data and uses an eventual consistency update model, an
     * immediate <a>GetAttributes</a> or <a>Select</a> operation (read) immediately after a <a>PutAttributes</a> or
     * <a>DeleteAttributes</a> operation (write) might not return the updated data.
     * </p>
     * <p>
     * The following limitations are enforced for this operation:
     * <ul>
     * <li>256 total attribute name-value pairs per item</li>
     * <li>One billion attributes per domain</li>
     * <li>10 GB of total user data storage per domain</li>
     * </ul>
     * </p>
     * 
     * @param putAttributesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutAttributes operation returned by the service.
     * @sample AmazonSimpleDBAsyncHandler.PutAttributes
     */
    java.util.concurrent.Future<PutAttributesResult> putAttributesAsync(PutAttributesRequest putAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<PutAttributesRequest, PutAttributesResult> asyncHandler);

    /**
     * <p>
     * The <code>Select</code> operation returns a set of attributes for <code>ItemNames</code> that match the select
     * expression. <code>Select</code> is similar to the standard SQL SELECT statement.
     * </p>
     * <p>
     * The total size of the response cannot exceed 1 MB in total size. Amazon SimpleDB automatically adjusts the number
     * of items returned per page to enforce this limit. For example, if the client asks to retrieve 2500 items, but
     * each individual item is 10 kB in size, the system returns 100 items and an appropriate <code>NextToken</code> so
     * the client can access the next page of results.
     * </p>
     * <p>
     * For information on how to construct select expressions, see Using Select to Create Amazon SimpleDB Queries in the
     * Developer Guide.
     * </p>
     * 
     * @param selectRequest
     * @return A Java Future containing the result of the Select operation returned by the service.
     * @sample AmazonSimpleDBAsync.Select
     */
    java.util.concurrent.Future<SelectResult> selectAsync(SelectRequest selectRequest);

    /**
     * <p>
     * The <code>Select</code> operation returns a set of attributes for <code>ItemNames</code> that match the select
     * expression. <code>Select</code> is similar to the standard SQL SELECT statement.
     * </p>
     * <p>
     * The total size of the response cannot exceed 1 MB in total size. Amazon SimpleDB automatically adjusts the number
     * of items returned per page to enforce this limit. For example, if the client asks to retrieve 2500 items, but
     * each individual item is 10 kB in size, the system returns 100 items and an appropriate <code>NextToken</code> so
     * the client can access the next page of results.
     * </p>
     * <p>
     * For information on how to construct select expressions, see Using Select to Create Amazon SimpleDB Queries in the
     * Developer Guide.
     * </p>
     * 
     * @param selectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the Select operation returned by the service.
     * @sample AmazonSimpleDBAsyncHandler.Select
     */
    java.util.concurrent.Future<SelectResult> selectAsync(SelectRequest selectRequest,
            com.amazonaws.handlers.AsyncHandler<SelectRequest, SelectResult> asyncHandler);

}
