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
package com.amazonaws.services.pricing;

import javax.annotation.Generated;

import com.amazonaws.services.pricing.model.*;

/**
 * Interface for accessing AWS Pricing asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.pricing.AbstractAWSPricingAsync} instead.
 * </p>
 * <p>
 * <p>
 * The Amazon Web Services Price List API is a centralized and convenient way to programmatically query Amazon Web
 * Services for services, products, and pricing information. The Amazon Web Services Price List uses standardized
 * product attributes such as <code>Location</code>, <code>Storage Class</code>, and <code>Operating System</code>, and
 * provides prices at the SKU level. You can use the Amazon Web Services Price List to do the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Build cost control and scenario planning tools
 * </p>
 * </li>
 * <li>
 * <p>
 * Reconcile billing data
 * </p>
 * </li>
 * <li>
 * <p>
 * Forecast future spend for budgeting purposes
 * </p>
 * </li>
 * <li>
 * <p>
 * Provide cost benefit analysis that compare your internal workloads with Amazon Web Services
 * </p>
 * </li>
 * </ul>
 * <p>
 * Use <code>GetServices</code> without a service code to retrieve the service codes for all Amazon Web Services, then
 * <code>GetServices</code> with a service code to retrieve the attribute names for that service. After you have the
 * service code and attribute names, you can use <code>GetAttributeValues</code> to see what values are available for an
 * attribute. With the service code and an attribute name and value, you can use <code>GetProducts</code> to find
 * specific products that you're interested in, such as an <code>AmazonEC2</code> instance, with a
 * <code>Provisioned IOPS</code> <code>volumeType</code>.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/price-changes.html">Using the Amazon Web Services
 * Price List API</a> in the <i>Billing User Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSPricingAsync extends AWSPricing {

    /**
     * <p>
     * Returns the metadata for one service or a list of the metadata for all services. Use this without a service code
     * to get the service codes for all services. Use it with a service code, such as <code>AmazonEC2</code>, to get
     * information specific to that service, such as the attribute names available for that service. For example, some
     * of the attribute names available for EC2 are <code>volumeType</code>, <code>maxIopsVolume</code>,
     * <code>operation</code>, <code>locationType</code>, and <code>instanceCapacity10xlarge</code>.
     * </p>
     * 
     * @param describeServicesRequest
     * @return A Java Future containing the result of the DescribeServices operation returned by the service.
     * @sample AWSPricingAsync.DescribeServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pricing-2017-10-15/DescribeServices" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeServicesResult> describeServicesAsync(DescribeServicesRequest describeServicesRequest);

    /**
     * <p>
     * Returns the metadata for one service or a list of the metadata for all services. Use this without a service code
     * to get the service codes for all services. Use it with a service code, such as <code>AmazonEC2</code>, to get
     * information specific to that service, such as the attribute names available for that service. For example, some
     * of the attribute names available for EC2 are <code>volumeType</code>, <code>maxIopsVolume</code>,
     * <code>operation</code>, <code>locationType</code>, and <code>instanceCapacity10xlarge</code>.
     * </p>
     * 
     * @param describeServicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeServices operation returned by the service.
     * @sample AWSPricingAsyncHandler.DescribeServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pricing-2017-10-15/DescribeServices" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeServicesResult> describeServicesAsync(DescribeServicesRequest describeServicesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeServicesRequest, DescribeServicesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of attribute values. Attributes are similar to the details in a Price List API offer file. For a
     * list of available attributes, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/reading-an-offer.html#pps-defs">Offer File
     * Definitions</a> in the <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/billing-what-is.html">Billing and Cost
     * Management User Guide</a>.
     * </p>
     * 
     * @param getAttributeValuesRequest
     * @return A Java Future containing the result of the GetAttributeValues operation returned by the service.
     * @sample AWSPricingAsync.GetAttributeValues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pricing-2017-10-15/GetAttributeValues" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAttributeValuesResult> getAttributeValuesAsync(GetAttributeValuesRequest getAttributeValuesRequest);

    /**
     * <p>
     * Returns a list of attribute values. Attributes are similar to the details in a Price List API offer file. For a
     * list of available attributes, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/reading-an-offer.html#pps-defs">Offer File
     * Definitions</a> in the <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/billing-what-is.html">Billing and Cost
     * Management User Guide</a>.
     * </p>
     * 
     * @param getAttributeValuesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAttributeValues operation returned by the service.
     * @sample AWSPricingAsyncHandler.GetAttributeValues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pricing-2017-10-15/GetAttributeValues" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAttributeValuesResult> getAttributeValuesAsync(GetAttributeValuesRequest getAttributeValuesRequest,
            com.amazonaws.handlers.AsyncHandler<GetAttributeValuesRequest, GetAttributeValuesResult> asyncHandler);

    /**
     * <p>
     * <i> <b>This feature is in preview release and is subject to change. Your use of Amazon Web Services Price List
     * API is subject to the Beta Service Participation terms of the <a
     * href="https://aws.amazon.com/service-terms/">Amazon Web Services Service Terms</a> (Section 1.10).</b> </i>
     * </p>
     * <p>
     * This returns the URL that you can retrieve your Price List file from. This URL is based on the
     * <code>PriceListArn</code> and <code>FileFormat</code> that you retrieve from the <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_ListPriceLists.html"
     * >ListPriceLists</a> response.
     * </p>
     * 
     * @param getPriceListFileUrlRequest
     * @return A Java Future containing the result of the GetPriceListFileUrl operation returned by the service.
     * @sample AWSPricingAsync.GetPriceListFileUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pricing-2017-10-15/GetPriceListFileUrl" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetPriceListFileUrlResult> getPriceListFileUrlAsync(GetPriceListFileUrlRequest getPriceListFileUrlRequest);

    /**
     * <p>
     * <i> <b>This feature is in preview release and is subject to change. Your use of Amazon Web Services Price List
     * API is subject to the Beta Service Participation terms of the <a
     * href="https://aws.amazon.com/service-terms/">Amazon Web Services Service Terms</a> (Section 1.10).</b> </i>
     * </p>
     * <p>
     * This returns the URL that you can retrieve your Price List file from. This URL is based on the
     * <code>PriceListArn</code> and <code>FileFormat</code> that you retrieve from the <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_ListPriceLists.html"
     * >ListPriceLists</a> response.
     * </p>
     * 
     * @param getPriceListFileUrlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPriceListFileUrl operation returned by the service.
     * @sample AWSPricingAsyncHandler.GetPriceListFileUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pricing-2017-10-15/GetPriceListFileUrl" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetPriceListFileUrlResult> getPriceListFileUrlAsync(GetPriceListFileUrlRequest getPriceListFileUrlRequest,
            com.amazonaws.handlers.AsyncHandler<GetPriceListFileUrlRequest, GetPriceListFileUrlResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all products that match the filter criteria.
     * </p>
     * 
     * @param getProductsRequest
     * @return A Java Future containing the result of the GetProducts operation returned by the service.
     * @sample AWSPricingAsync.GetProducts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pricing-2017-10-15/GetProducts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetProductsResult> getProductsAsync(GetProductsRequest getProductsRequest);

    /**
     * <p>
     * Returns a list of all products that match the filter criteria.
     * </p>
     * 
     * @param getProductsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetProducts operation returned by the service.
     * @sample AWSPricingAsyncHandler.GetProducts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pricing-2017-10-15/GetProducts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetProductsResult> getProductsAsync(GetProductsRequest getProductsRequest,
            com.amazonaws.handlers.AsyncHandler<GetProductsRequest, GetProductsResult> asyncHandler);

    /**
     * <p>
     * <i> <b>This feature is in preview release and is subject to change. Your use of Amazon Web Services Price List
     * API is subject to the Beta Service Participation terms of the <a
     * href="https://aws.amazon.com/service-terms/">Amazon Web Services Service Terms</a> (Section 1.10).</b> </i>
     * </p>
     * <p>
     * This returns a list of Price List references that the requester if authorized to view, given a
     * <code>ServiceCode</code>, <code>CurrencyCode</code>, and an <code>EffectiveDate</code>. Use without a
     * <code>RegionCode</code> filter to list Price List references from all available Amazon Web Services Regions. Use
     * with a <code>RegionCode</code> filter to get the Price List reference that's specific to a specific Amazon Web
     * Services Region. You can use the <code>PriceListArn</code> from the response to get your preferred Price List
     * files through the <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_GetPriceListFileUrl.html"
     * >GetPriceListFileUrl</a> API.
     * </p>
     * 
     * @param listPriceListsRequest
     * @return A Java Future containing the result of the ListPriceLists operation returned by the service.
     * @sample AWSPricingAsync.ListPriceLists
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pricing-2017-10-15/ListPriceLists" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPriceListsResult> listPriceListsAsync(ListPriceListsRequest listPriceListsRequest);

    /**
     * <p>
     * <i> <b>This feature is in preview release and is subject to change. Your use of Amazon Web Services Price List
     * API is subject to the Beta Service Participation terms of the <a
     * href="https://aws.amazon.com/service-terms/">Amazon Web Services Service Terms</a> (Section 1.10).</b> </i>
     * </p>
     * <p>
     * This returns a list of Price List references that the requester if authorized to view, given a
     * <code>ServiceCode</code>, <code>CurrencyCode</code>, and an <code>EffectiveDate</code>. Use without a
     * <code>RegionCode</code> filter to list Price List references from all available Amazon Web Services Regions. Use
     * with a <code>RegionCode</code> filter to get the Price List reference that's specific to a specific Amazon Web
     * Services Region. You can use the <code>PriceListArn</code> from the response to get your preferred Price List
     * files through the <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_pricing_GetPriceListFileUrl.html"
     * >GetPriceListFileUrl</a> API.
     * </p>
     * 
     * @param listPriceListsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPriceLists operation returned by the service.
     * @sample AWSPricingAsyncHandler.ListPriceLists
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pricing-2017-10-15/ListPriceLists" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPriceListsResult> listPriceListsAsync(ListPriceListsRequest listPriceListsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPriceListsRequest, ListPriceListsResult> asyncHandler);

}
