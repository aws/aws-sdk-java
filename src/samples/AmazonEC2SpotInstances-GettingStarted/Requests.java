/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.ArrayList;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2ClientBuilder;
import com.amazonaws.services.ec2.model.CancelSpotInstanceRequestsRequest;
import com.amazonaws.services.ec2.model.DescribeSpotInstanceRequestsRequest;
import com.amazonaws.services.ec2.model.DescribeSpotInstanceRequestsResult;
import com.amazonaws.services.ec2.model.LaunchSpecification;
import com.amazonaws.services.ec2.model.RequestSpotInstancesRequest;
import com.amazonaws.services.ec2.model.RequestSpotInstancesResult;
import com.amazonaws.services.ec2.model.SpotInstanceRequest;
import com.amazonaws.services.ec2.model.TerminateInstancesRequest;

public class Requests {
    private AmazonEC2         ec2;
    private ArrayList<String> instanceIds;
    private ArrayList<String> spotInstanceRequestIds;

    /**
     * Public constructor.
     * @throws Exception
     */
    public Requests () throws Exception {
        init();
    }

    /**
     * The only information needed to create a client are security credentials
     * consisting of the AWS Access Key ID and Secret Access Key. All other
     * configuration, such as the service endpoints, are performed
     * automatically. Client parameters, such as proxies, can be specified in an
     * optional ClientConfiguration object when constructing a client.
     *
     * @see com.amazonaws.auth.BasicAWSCredentials
     * @see com.amazonaws.auth.PropertiesCredentials
     * @see com.amazonaws.ClientConfiguration
     */
    private void init() throws Exception {
        /*
         * The ProfileCredentialsProvider will return your [default]
         * credential profile by reading from the credentials file located at
         * (~/.aws/credentials).
         */
        AWSCredentials credentials = null;
        try {
            credentials = new ProfileCredentialsProvider().getCredentials();
        } catch (Exception e) {
            throw new AmazonClientException(
                    "Cannot load the credentials from the credential profiles file. " +
                    "Please make sure that your credentials file is at the correct " +
                    "location (~/.aws/credentials), and is in valid format.",
                    e);
        }

        ec2 = AmazonEC2ClientBuilder.standard()
            .withCredentials(new AWSStaticCredentialsProvider(credentials))
            .withRegion("us-west-2")
            .build();
    }

    /**
     * The submit method will create 1 x one-time t1.micro request with a maximum bid
     * price of $0.03 using the Amazon Linux AMI.
     *
     * Note the AMI id may change after the release of this code sample, and it is important
     * to use the latest. You can find the latest version by logging into the AWS Management
     * console, and attempting to perform a launch. You will be presented with AMI options,
     * one of which will be Amazon Linux. Simply use that AMI id.
     */
    public void submitRequests() {
        //==========================================================================//
        //================= Submit a Spot Instance Request =====================//
        //==========================================================================//

        // Initializes a Spot Instance Request
        RequestSpotInstancesRequest requestRequest = new RequestSpotInstancesRequest();

        // Request 1 x t1.micro instance with a bid price of $0.03.
        requestRequest.setSpotPrice("0.03");
        requestRequest.setInstanceCount(Integer.valueOf(1));

        // Setup the specifications of the launch. This includes the instance type (e.g. t1.micro)
        // and the latest Amazon Linux AMI id available. Note, you should always use the latest
        // Amazon Linux AMI id or another of your choosing.
        LaunchSpecification launchSpecification = new LaunchSpecification();
        launchSpecification.setImageId("ami-8c1fece5");
        launchSpecification.setInstanceType("t1.micro");

        // Add the security group to the request.
        ArrayList<String> securityGroups = new ArrayList<String>();
        securityGroups.add("GettingStartedGroup");
        launchSpecification.setSecurityGroups(securityGroups);

        // Add the launch specifications to the request.
        requestRequest.setLaunchSpecification(launchSpecification);

        // Call the RequestSpotInstance API.
        RequestSpotInstancesResult requestResult = ec2.requestSpotInstances(requestRequest);
        List<SpotInstanceRequest> requestResponses = requestResult.getSpotInstanceRequests();

        // Setup an arraylist to collect all of the request ids we want to watch hit the running
        // state.
        spotInstanceRequestIds = new ArrayList<String>();

        // Add all of the request ids to the hashset, so we can determine when they hit the
        // active state.
        for (SpotInstanceRequest requestResponse : requestResponses) {
            System.out.println("Created Spot Request: "+requestResponse.getSpotInstanceRequestId());
            spotInstanceRequestIds.add(requestResponse.getSpotInstanceRequestId());
        }

    }

    /**
     * The areOpen method will determine if any of the requests that were started are still
     * in the open state. If all of them have transitioned to either active, cancelled, or
     * closed, then this will return false.
     * @return
     */
    public boolean areAnyOpen() {
        //==========================================================================//
        //============== Describe Spot Instance Requests to determine =============//
        //==========================================================================//

        // Create the describeRequest with tall of the request id to monitor (e.g. that we started).
        DescribeSpotInstanceRequestsRequest describeRequest = new DescribeSpotInstanceRequestsRequest();
        describeRequest.setSpotInstanceRequestIds(spotInstanceRequestIds);

        System.out.println("Checking to determine if Spot Bids have reached the active state...");

        // Initialize variables.
        instanceIds = new ArrayList<String>();

        try
        {
            // Retrieve all of the requests we want to monitor.
            DescribeSpotInstanceRequestsResult describeResult = ec2.describeSpotInstanceRequests(describeRequest);
            List<SpotInstanceRequest> describeResponses = describeResult.getSpotInstanceRequests();

            // Look through each request and determine if they are all in the active state.
            for (SpotInstanceRequest describeResponse : describeResponses) {
                System.out.println(" " +describeResponse.getSpotInstanceRequestId() +
                                   " is in the "+describeResponse.getState() + " state.");

                // If the state is open, it hasn't changed since we attempted to request it.
                // There is the potential for it to transition almost immediately to closed or
                // cancelled so we compare against open instead of active.
                if (describeResponse.getState().equals("open")) {
                    return true;
                }

                // Add the instance id to the list we will eventually terminate.
                instanceIds.add(describeResponse.getInstanceId());
            }
        } catch (AmazonServiceException e) {
            // Print out the error.
            System.out.println("Error when calling describeSpotInstances");
            System.out.println("Caught Exception: " + e.getMessage());
            System.out.println("Reponse Status Code: " + e.getStatusCode());
            System.out.println("Error Code: " + e.getErrorCode());
            System.out.println("Request ID: " + e.getRequestId());

            // If we have an exception, ensure we don't break out of the loop.
            // This prevents the scenario where there was blip on the wire.
            return true;
        }

        return false;
    }

    /**
     * The cleanup method will cancel and active requests and terminate any running instances
     * that were created using this object.
     */
    public void cleanup () {
        //==========================================================================//
        //================= Cancel/Terminate Your Spot Request =====================//
        //==========================================================================//
        try {
            // Cancel requests.
            System.out.println("Cancelling requests.");
            CancelSpotInstanceRequestsRequest cancelRequest = new CancelSpotInstanceRequestsRequest(spotInstanceRequestIds);
            ec2.cancelSpotInstanceRequests(cancelRequest);
        } catch (AmazonServiceException e) {
            // Write out any exceptions that may have occurred.
            System.out.println("Error cancelling instances");
            System.out.println("Caught Exception: " + e.getMessage());
            System.out.println("Reponse Status Code: " + e.getStatusCode());
            System.out.println("Error Code: " + e.getErrorCode());
            System.out.println("Request ID: " + e.getRequestId());
        }

        try {
            // Terminate instances.
            System.out.println("Terminate instances");
            TerminateInstancesRequest terminateRequest = new TerminateInstancesRequest(instanceIds);
            ec2.terminateInstances(terminateRequest);
        } catch (AmazonServiceException e) {
            // Write out any exceptions that may have occurred.
            System.out.println("Error terminating instances");
            System.out.println("Caught Exception: " + e.getMessage());
            System.out.println("Reponse Status Code: " + e.getStatusCode());
            System.out.println("Error Code: " + e.getErrorCode());
            System.out.println("Request ID: " + e.getRequestId());
        }

        // Delete all requests and instances that we have terminated.
        instanceIds.clear();
        spotInstanceRequestIds.clear();
    }

}

