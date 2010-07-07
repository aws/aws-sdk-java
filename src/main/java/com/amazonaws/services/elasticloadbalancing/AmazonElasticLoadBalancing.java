/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticloadbalancing;

import com.amazonaws.*;
import com.amazonaws.services.elasticloadbalancing.model.*;

/**
 * Interface for accessing AmazonElasticLoadBalancing.
 * 
 */
public interface AmazonElasticLoadBalancing {

    /**
     * Overrides the default endpoint for this client ("https://elasticloadbalancing.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "ec2.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://ec2.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     *
     * @param endpoint
     *            The endpoint (ex: "ec2.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://ec2.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;
    
    /**
     *
     * @param setLoadBalancerPoliciesOfListenerRequest Container for the
     *           necessary parameters to execute the SetLoadBalancerPoliciesOfListener
     *           service method on AmazonElasticLoadBalancing.
     * 
     * @return The response from the SetLoadBalancerPoliciesOfListener
     *         service method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws ListenerNotFoundException
     * @throws PolicyNotFoundException
     * @throws InvalidConfigurationRequestException
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SetLoadBalancerPoliciesOfListenerResult setLoadBalancerPoliciesOfListener(SetLoadBalancerPoliciesOfListenerRequest setLoadBalancerPoliciesOfListenerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param describeLoadBalancersRequest Container for the necessary
     *           parameters to execute the DescribeLoadBalancers service method on
     *           AmazonElasticLoadBalancing.
     * 
     * @return The response from the DescribeLoadBalancers service method, as
     *         returned by AmazonElasticLoadBalancing.
     * 
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLoadBalancersResult describeLoadBalancers(DescribeLoadBalancersRequest describeLoadBalancersRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param createAppCookieStickinessPolicyRequest Container for the
     *           necessary parameters to execute the CreateAppCookieStickinessPolicy
     *           service method on AmazonElasticLoadBalancing.
     * 
     * @return The response from the CreateAppCookieStickinessPolicy service
     *         method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws InvalidConfigurationRequestException
     * @throws DuplicatePolicyNameException
     * @throws LoadBalancerNotFoundException
     * @throws TooManyPoliciesException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateAppCookieStickinessPolicyResult createAppCookieStickinessPolicy(CreateAppCookieStickinessPolicyRequest createAppCookieStickinessPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param disableAvailabilityZonesForLoadBalancerRequest Container for
     *           the necessary parameters to execute the
     *           DisableAvailabilityZonesForLoadBalancer service method on
     *           AmazonElasticLoadBalancing.
     * 
     * @return The response from the DisableAvailabilityZonesForLoadBalancer
     *         service method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws InvalidConfigurationRequestException
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DisableAvailabilityZonesForLoadBalancerResult disableAvailabilityZonesForLoadBalancer(DisableAvailabilityZonesForLoadBalancerRequest disableAvailabilityZonesForLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param describeInstanceHealthRequest Container for the necessary
     *           parameters to execute the DescribeInstanceHealth service method on
     *           AmazonElasticLoadBalancing.
     * 
     * @return The response from the DescribeInstanceHealth service method,
     *         as returned by AmazonElasticLoadBalancing.
     * 
     * @throws InvalidInstanceException
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeInstanceHealthResult describeInstanceHealth(DescribeInstanceHealthRequest describeInstanceHealthRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param createLoadBalancerRequest Container for the necessary
     *           parameters to execute the CreateLoadBalancer service method on
     *           AmazonElasticLoadBalancing.
     * 
     * @return The response from the CreateLoadBalancer service method, as
     *         returned by AmazonElasticLoadBalancing.
     * 
     * @throws TooManyLoadBalancersException
     * @throws DuplicateLoadBalancerNameException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateLoadBalancerResult createLoadBalancer(CreateLoadBalancerRequest createLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param registerInstancesWithLoadBalancerRequest Container for the
     *           necessary parameters to execute the RegisterInstancesWithLoadBalancer
     *           service method on AmazonElasticLoadBalancing.
     * 
     * @return The response from the RegisterInstancesWithLoadBalancer
     *         service method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws InvalidInstanceException
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RegisterInstancesWithLoadBalancerResult registerInstancesWithLoadBalancer(RegisterInstancesWithLoadBalancerRequest registerInstancesWithLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param deregisterInstancesFromLoadBalancerRequest Container for the
     *           necessary parameters to execute the
     *           DeregisterInstancesFromLoadBalancer service method on
     *           AmazonElasticLoadBalancing.
     * 
     * @return The response from the DeregisterInstancesFromLoadBalancer
     *         service method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws InvalidInstanceException
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeregisterInstancesFromLoadBalancerResult deregisterInstancesFromLoadBalancer(DeregisterInstancesFromLoadBalancerRequest deregisterInstancesFromLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param deleteLoadBalancerRequest Container for the necessary
     *           parameters to execute the DeleteLoadBalancer service method on
     *           AmazonElasticLoadBalancing.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteLoadBalancer(DeleteLoadBalancerRequest deleteLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param configureHealthCheckRequest Container for the necessary
     *           parameters to execute the ConfigureHealthCheck service method on
     *           AmazonElasticLoadBalancing.
     * 
     * @return The response from the ConfigureHealthCheck service method, as
     *         returned by AmazonElasticLoadBalancing.
     * 
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ConfigureHealthCheckResult configureHealthCheck(ConfigureHealthCheckRequest configureHealthCheckRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param enableAvailabilityZonesForLoadBalancerRequest Container for the
     *           necessary parameters to execute the
     *           EnableAvailabilityZonesForLoadBalancer service method on
     *           AmazonElasticLoadBalancing.
     * 
     * @return The response from the EnableAvailabilityZonesForLoadBalancer
     *         service method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public EnableAvailabilityZonesForLoadBalancerResult enableAvailabilityZonesForLoadBalancer(EnableAvailabilityZonesForLoadBalancerRequest enableAvailabilityZonesForLoadBalancerRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param createLBCookieStickinessPolicyRequest Container for the
     *           necessary parameters to execute the CreateLBCookieStickinessPolicy
     *           service method on AmazonElasticLoadBalancing.
     * 
     * @return The response from the CreateLBCookieStickinessPolicy service
     *         method, as returned by AmazonElasticLoadBalancing.
     * 
     * @throws InvalidConfigurationRequestException
     * @throws DuplicatePolicyNameException
     * @throws LoadBalancerNotFoundException
     * @throws TooManyPoliciesException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateLBCookieStickinessPolicyResult createLBCookieStickinessPolicy(CreateLBCookieStickinessPolicyRequest createLBCookieStickinessPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param deleteLoadBalancerPolicyRequest Container for the necessary
     *           parameters to execute the DeleteLoadBalancerPolicy service method on
     *           AmazonElasticLoadBalancing.
     * 
     * @return The response from the DeleteLoadBalancerPolicy service method,
     *         as returned by AmazonElasticLoadBalancing.
     * 
     * @throws InvalidConfigurationRequestException
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteLoadBalancerPolicyResult deleteLoadBalancerPolicy(DeleteLoadBalancerPolicyRequest deleteLoadBalancerPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * 
     * @return The response from the DescribeLoadBalancers service method, as
     *         returned by AmazonElasticLoadBalancing.
     * 
     * @throws LoadBalancerNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonElasticLoadBalancing indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeLoadBalancersResult describeLoadBalancers() throws AmazonServiceException, AmazonClientException;
    

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
}
        