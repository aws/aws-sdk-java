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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.simpledb.model.*;

/**
 * Interface for accessing Amazon SimpleDB.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.simpledb.AbstractAmazonSimpleDB} instead.
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
public interface AmazonSimpleDB {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "sdb";

    /**
     * Overrides the default endpoint for this client ("sdb.amazonaws.com"). Callers can use this method to control
     * which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "sdb.amazonaws.com") or a full URL, including the protocol (ex:
     * "sdb.amazonaws.com"). If the protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
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
     *        The endpoint (ex: "sdb.amazonaws.com") or a full URL, including the protocol (ex: "sdb.amazonaws.com") of
     *        the region specific AWS endpoint this client will communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonSimpleDB#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
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
     * @return Result of the BatchDeleteAttributes operation returned by the service.
     * @sample AmazonSimpleDB.BatchDeleteAttributes
     */
    BatchDeleteAttributesResult batchDeleteAttributes(BatchDeleteAttributesRequest batchDeleteAttributesRequest);

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
     * @return Result of the BatchPutAttributes operation returned by the service.
     * @throws DuplicateItemNameException
     *         The item name was specified more than once.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws MissingParameterException
     *         The request must contain the specified missing parameter.
     * @throws NoSuchDomainException
     *         The specified domain does not exist.
     * @throws NumberItemAttributesExceededException
     *         Too many attributes in this item.
     * @throws NumberDomainAttributesExceededException
     *         Too many attributes in this domain.
     * @throws NumberDomainBytesExceededException
     *         Too many bytes in this domain.
     * @throws NumberSubmittedItemsExceededException
     *         Too many items exist in a single call.
     * @throws NumberSubmittedAttributesExceededException
     *         Too many attributes exist in a single call.
     * @sample AmazonSimpleDB.BatchPutAttributes
     */
    BatchPutAttributesResult batchPutAttributes(BatchPutAttributesRequest batchPutAttributesRequest);

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
     * @return Result of the CreateDomain operation returned by the service.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws MissingParameterException
     *         The request must contain the specified missing parameter.
     * @throws NumberDomainsExceededException
     *         Too many domains exist per this account.
     * @sample AmazonSimpleDB.CreateDomain
     */
    CreateDomainResult createDomain(CreateDomainRequest createDomainRequest);

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
     * @return Result of the DeleteAttributes operation returned by the service.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws MissingParameterException
     *         The request must contain the specified missing parameter.
     * @throws NoSuchDomainException
     *         The specified domain does not exist.
     * @throws AttributeDoesNotExistException
     *         The specified attribute does not exist.
     * @sample AmazonSimpleDB.DeleteAttributes
     */
    DeleteAttributesResult deleteAttributes(DeleteAttributesRequest deleteAttributesRequest);

    /**
     * <p>
     * The <code>DeleteDomain</code> operation deletes a domain. Any items (and their attributes) in the domain are
     * deleted as well. The <code>DeleteDomain</code> operation might take 10 or more seconds to complete.
     * </p>
     * 
     * @param deleteDomainRequest
     * @return Result of the DeleteDomain operation returned by the service.
     * @throws MissingParameterException
     *         The request must contain the specified missing parameter.
     * @sample AmazonSimpleDB.DeleteDomain
     */
    DeleteDomainResult deleteDomain(DeleteDomainRequest deleteDomainRequest);

    /**
     * <p>
     * Returns information about the domain, including when the domain was created, the number of items and attributes
     * in the domain, and the size of the attribute names and values.
     * </p>
     * 
     * @param domainMetadataRequest
     * @return Result of the DomainMetadata operation returned by the service.
     * @throws MissingParameterException
     *         The request must contain the specified missing parameter.
     * @throws NoSuchDomainException
     *         The specified domain does not exist.
     * @sample AmazonSimpleDB.DomainMetadata
     */
    DomainMetadataResult domainMetadata(DomainMetadataRequest domainMetadataRequest);

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
     * @return Result of the GetAttributes operation returned by the service.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws MissingParameterException
     *         The request must contain the specified missing parameter.
     * @throws NoSuchDomainException
     *         The specified domain does not exist.
     * @sample AmazonSimpleDB.GetAttributes
     */
    GetAttributesResult getAttributes(GetAttributesRequest getAttributesRequest);

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
     * @return Result of the ListDomains operation returned by the service.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidNextTokenException
     *         The specified NextToken is not valid.
     * @sample AmazonSimpleDB.ListDomains
     */
    ListDomainsResult listDomains(ListDomainsRequest listDomainsRequest);

    /**
     * Simplified method form for invoking the ListDomains operation.
     *
     * @see #listDomains(ListDomainsRequest)
     */
    ListDomainsResult listDomains();

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
     * @return Result of the PutAttributes operation returned by the service.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws MissingParameterException
     *         The request must contain the specified missing parameter.
     * @throws NoSuchDomainException
     *         The specified domain does not exist.
     * @throws NumberDomainAttributesExceededException
     *         Too many attributes in this domain.
     * @throws NumberDomainBytesExceededException
     *         Too many bytes in this domain.
     * @throws NumberItemAttributesExceededException
     *         Too many attributes in this item.
     * @throws AttributeDoesNotExistException
     *         The specified attribute does not exist.
     * @sample AmazonSimpleDB.PutAttributes
     */
    PutAttributesResult putAttributes(PutAttributesRequest putAttributesRequest);

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
     * @return Result of the Select operation returned by the service.
     * @throws InvalidParameterValueException
     *         The value for a parameter is invalid.
     * @throws InvalidNextTokenException
     *         The specified NextToken is not valid.
     * @throws InvalidNumberPredicatesException
     *         Too many predicates exist in the query expression.
     * @throws InvalidNumberValueTestsException
     *         Too many predicates exist in the query expression.
     * @throws InvalidQueryExpressionException
     *         The specified query expression syntax is not valid.
     * @throws MissingParameterException
     *         The request must contain the specified missing parameter.
     * @throws NoSuchDomainException
     *         The specified domain does not exist.
     * @throws RequestTimeoutException
     *         A timeout occurred when attempting to query the specified domain with specified query expression.
     * @throws TooManyRequestedAttributesException
     *         Too many attributes requested.
     * @sample AmazonSimpleDB.Select
     */
    SelectResult select(SelectRequest selectRequest);

}
