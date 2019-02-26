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
import java.util.Calendar;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.ec2.model.Tag;

/**
 * Welcome to your new AWS Java SDK based project!
 *
 * This class is meant as a starting point for your console-based application that
 * makes one or more calls to the AWS services supported by the Java SDK, such as EC2,
 * SimpleDB, and S3.
 *
 * In order to use the services in this sample, you need:
 *
 *  - A valid Amazon Web Services account. You can register for AWS at:
 *       https://aws-portal.amazon.com/gp/aws/developer/registration/index.html
 *
 *  - Your account's Access Key ID and Secret Access Key:
 *       http://aws.amazon.com/security-credentials
 *
 *  - A subscription to Amazon EC2. You can sign up for EC2 at:
 *       http://aws.amazon.com/ec2/
 *
 */
public class GettingStartedApp {
    private static final long SLEEP_CYCLE = 5000;

    /*
     * Before running the code:
     *      Fill in your AWS access credentials in the provided credentials
     *      file template, and be sure to move the file to the default location
     *      (~/.aws/credentials) where the sample code will load the
     *      credentials from.
     *      https://console.aws.amazon.com/iam/home?#security_credential
     *
     * WARNING:
     *      To avoid accidental leakage of your credentials, DO NOT keep
     *      the credentials file in your source directory.
     */

    public static void main(String[] args) throws Exception {

        System.out.println("===========================================");
        System.out.println("Welcome to the AWS Java SDK!");
        System.out.println("===========================================");


        /*
         * Amazon EC2
         *
         * The AWS EC2 client allows you to create, delete, and administer
         * instances programmatically.
         *
         * In this sample, we use an EC2 client to submit a Spot request,
         * wait for it to reach the active state, and then cancel and terminate
         * the associated instance.
         */
        try {
            // Setup the helper object that will perform all of the API calls.
            Requests requests = new Requests("t1.micro","ami-8c1fece5","0.03","GettingStartedGroup");

            // Submit all of the requests.
            requests.submitRequests();

            // Create the list of tags we want to create and tag any associated requests.
            ArrayList<Tag> tags = new ArrayList<Tag>();
            tags.add(new Tag("keyname1","value1"));
            requests.tagRequests(tags);

            // Initialize the timer to now.
            Calendar startTimer = Calendar.getInstance();
            Calendar nowTimer = null;

            // Loop through all of the requests until all bids are in the active state
            // (or at least not in the open state).
            do
            {
                // Sleep for 60 seconds.
                Thread.sleep(SLEEP_CYCLE);

                // Initialize the timer to now, and then subtract 15 minutes, so we can
                // compare to see if we have exceeded 15 minutes compared to the startTime.
                nowTimer = Calendar.getInstance();
                nowTimer.add(Calendar.MINUTE, -15);
            } while (requests.areAnyOpen() && !nowTimer.after(startTimer));

            // If we couldn't launch Spot within the timeout period, then we should launch an On-Demand
            // Instance.
            if (nowTimer.after(startTimer)) {
                // Cancel all requests because we timed out.
                requests.cleanup();

                // Launch On-Demand instances instead
                requests.launchOnDemand();
            }

            // Tag any created instances.
            requests.tagInstances(tags);

            // Cancel all requests and terminate all running instances.
            requests.cleanup();
        } catch (AmazonServiceException ase) {
            // Write out any exceptions that may have occurred.
            System.out.println("Caught Exception: " + ase.getMessage());
            System.out.println("Reponse Status Code: " + ase.getStatusCode());
            System.out.println("Error Code: " + ase.getErrorCode());
            System.out.println("Request ID: " + ase.getRequestId());
        }
    }
}
