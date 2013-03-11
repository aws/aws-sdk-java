/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.ClasspathPropertiesFileCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2Client;
import com.amazonaws.services.ec2.model.AuthorizeSecurityGroupIngressRequest;
import com.amazonaws.services.ec2.model.CreateSecurityGroupRequest;
import com.amazonaws.services.ec2.model.IpPermission;

public class CreateSecurityGroupApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Create the AmazonEC2Client object so we can call various APIs.
		AmazonEC2 ec2 = new AmazonEC2Client(new ClasspathPropertiesFileCredentialsProvider());
		Region usWest2 = Region.getRegion(Regions.US_WEST_2);
		ec2.setRegion(usWest2);

	    	// Create a new security group.
	    	try {
	        	CreateSecurityGroupRequest securityGroupRequest = new CreateSecurityGroupRequest("GettingStartedGroup", "Getting Started Security Group");
	        	ec2.createSecurityGroup(securityGroupRequest);
	    	} catch (AmazonServiceException ase) {
	    		// Likely this means that the group is already created, so ignore.
	    		System.out.println(ase.getMessage());
	    	}

	    	String ipAddr = "0.0.0.0/0";

	    	// Get the IP of the current host, so that we can limit the Security Group
	    	// by default to the ip range associated with your subnet.
	    	try {
	    	    InetAddress addr = InetAddress.getLocalHost();

	    	    // Get IP Address
	    	    ipAddr = addr.getHostAddress()+"/10";
	    	} catch (UnknownHostException e) {
	    	}

	    	//System.exit(-1);
	    	// Create a range that you would like to populate.
	    	ArrayList<String> ipRanges = new ArrayList<String>();
	    	ipRanges.add(ipAddr);

	    	// Open up port 23 for TCP traffic to the associated IP from above (e.g. ssh traffic).
	    	ArrayList<IpPermission> ipPermissions = new ArrayList<IpPermission> ();
	    	IpPermission ipPermission = new IpPermission();
	    	ipPermission.setIpProtocol("tcp");
	    	ipPermission.setFromPort(new Integer(22));
	    	ipPermission.setToPort(new Integer(22));
	    	ipPermission.setIpRanges(ipRanges);
	    	ipPermissions.add(ipPermission);

	    	try {
		    	// Authorize the ports to the used.
		    	AuthorizeSecurityGroupIngressRequest ingressRequest = new AuthorizeSecurityGroupIngressRequest("GettingStartedGroup",ipPermissions);
		    	ec2.authorizeSecurityGroupIngress(ingressRequest);
	    	} catch (AmazonServiceException ase) {
	    		// Ignore because this likely means the zone has already been authorized.
	    		System.out.println(ase.getMessage());
	    	}
	}

}
