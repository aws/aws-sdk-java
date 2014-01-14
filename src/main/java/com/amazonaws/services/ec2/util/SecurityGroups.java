/*
 * Copyright 2013-2014 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.ec2.util;

import java.util.ArrayList;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.model.DescribeSecurityGroupsRequest;

public class SecurityGroups {
    /**
     * <p>
     * doesSecurityGroupExist provides a quick answer to whether a security group exists. 
     * </p>
     * @param ec2 Amazon EC2 client
     * @param securityGroupName Security group name.
     * @return
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public static boolean doesSecurityGroupExist(AmazonEC2 ec2, String securityGroupName)
    	throws AmazonClientException, AmazonServiceException {
    	List<String> securityGroupNames = new ArrayList<String>();
    	securityGroupNames.add(securityGroupName);
    	
    	DescribeSecurityGroupsRequest securityGroupsRequest = new DescribeSecurityGroupsRequest()
    															.withGroupNames(securityGroupNames);
    	
    	try {
    		ec2.describeSecurityGroups(securityGroupsRequest);
    		return true;
    	} catch (AmazonServiceException ase) {
    		if (ase.getErrorCode().equalsIgnoreCase("InvalidAccessKeyId") ||
    			ase.getErrorCode().equalsIgnoreCase("SignatureDoesNotMatch")) {
    			throw ase;
    		}
    		
    		switch (ase.getStatusCode()) {
    		case 400:
    			return false;
    		default:
    			throw ase;
    		}
    	}
    }
}
