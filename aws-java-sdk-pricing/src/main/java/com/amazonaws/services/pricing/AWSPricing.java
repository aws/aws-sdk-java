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
package com.amazonaws.services.pricing;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.pricing.model.*;

/**
 * Interface for accessing AWS Pricing.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.pricing.AbstractAWSPricing} instead.
 * </p>
 * <p>
 * <p>
 * AWS Price List Service API (AWS Price List Service) is a centralized and convenient way to programmatically query
 * Amazon Web Services for services, products, and pricing information. The AWS Price List Service uses standardized
 * product attributes such as <code>Location</code>, <code>Storage Class</code>, and <code>Operating System</code>, and
 * provides prices at the SKU level. You can use the AWS Price List Service to build cost control and scenario planning
 * tools, reconcile billing data, forecast future spend for budgeting purposes, and provide cost benefit analysis that
 * compare your internal workloads with AWS.
 * </p>
 * <p>
 * Use <code>GetServices</code> without a service code to retrieve the service codes for all AWS services, then
 * <code>GetServices</code> with a service code to retreive the attribute names for that service. After you have the
 * service code and attribute names, you can use <code>GetAttributeValues</code> to see what values are available for an
 * attribute. With the service code and an attribute name and value, you can use <code>GetProducts</code> to find
 * specific products that you're interested in, such as an <code>AmazonEC2</code> instance, with a
 * <code>Provisioned IOPS</code> <code>volumeType</code>.
 * </p>
 * <p>
 * Service Endpoint
 * </p>
 * <p>
 * AWS Price List Service API provides the following two endpoints:
 * </p>
 * <ul>
 * <li>
 * <p>
 * https://api.pricing.us-east-1.amazonaws.com
 * </p>
 * </li>
 * <li>
 * <p>
 * https://api.pricing.ap-south-1.amazonaws.com
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSPricing {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "api.pricing";

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
     * @return Result of the DescribeServices operation returned by the service.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws InvalidParameterException
     *         One or more parameters had an invalid value.
     * @throws NotFoundException
     *         The requested resource can't be found.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @throws ExpiredNextTokenException
     *         The pagination token expired. Try again without a pagination token.
     * @sample AWSPricing.DescribeServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pricing-2017-10-15/DescribeServices" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeServicesResult describeServices(DescribeServicesRequest describeServicesRequest);

    /**
     * <p>
     * Returns a list of attribute values. Attibutes are similar to the details in a Price List API offer file. For a
     * list of available attributes, see <a
     * href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/reading-an-offer.html#pps-defs">Offer File
     * Definitions</a> in the <a
     * href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/billing-what-is.html">AWS Billing and Cost
     * Management User Guide</a>.
     * </p>
     * 
     * @param getAttributeValuesRequest
     * @return Result of the GetAttributeValues operation returned by the service.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws InvalidParameterException
     *         One or more parameters had an invalid value.
     * @throws NotFoundException
     *         The requested resource can't be found.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @throws ExpiredNextTokenException
     *         The pagination token expired. Try again without a pagination token.
     * @sample AWSPricing.GetAttributeValues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pricing-2017-10-15/GetAttributeValues" target="_top">AWS API
     *      Documentation</a>
     */
    GetAttributeValuesResult getAttributeValues(GetAttributeValuesRequest getAttributeValuesRequest);

    /**
     * <p>
     * Returns a list of all products that match the filter criteria.
     * </p>
     * 
     * @param getProductsRequest
     * @return Result of the GetProducts operation returned by the service.
     * @throws InternalErrorException
     *         An error on the server occurred during the processing of your request. Try again later.
     * @throws InvalidParameterException
     *         One or more parameters had an invalid value.
     * @throws NotFoundException
     *         The requested resource can't be found.
     * @throws InvalidNextTokenException
     *         The pagination token is invalid. Try again without a pagination token.
     * @throws ExpiredNextTokenException
     *         The pagination token expired. Try again without a pagination token.
     * @sample AWSPricing.GetProducts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pricing-2017-10-15/GetProducts" target="_top">AWS API
     *      Documentation</a>
     */
    GetProductsResult getProducts(GetProductsRequest getProductsRequest);

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
