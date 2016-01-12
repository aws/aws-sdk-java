/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.config.model;

/**
 * 
 */
public enum ResourceType {

    AWSEC2CustomerGateway("AWS::EC2::CustomerGateway"),
    AWSEC2EIP("AWS::EC2::EIP"),
    AWSEC2Host("AWS::EC2::Host"),
    AWSEC2Instance("AWS::EC2::Instance"),
    AWSEC2InternetGateway("AWS::EC2::InternetGateway"),
    AWSEC2NetworkAcl("AWS::EC2::NetworkAcl"),
    AWSEC2NetworkInterface("AWS::EC2::NetworkInterface"),
    AWSEC2RouteTable("AWS::EC2::RouteTable"),
    AWSEC2SecurityGroup("AWS::EC2::SecurityGroup"),
    AWSEC2Subnet("AWS::EC2::Subnet"),
    AWSCloudTrailTrail("AWS::CloudTrail::Trail"),
    AWSEC2Volume("AWS::EC2::Volume"),
    AWSEC2VPC("AWS::EC2::VPC"),
    AWSEC2VPNConnection("AWS::EC2::VPNConnection"),
    AWSEC2VPNGateway("AWS::EC2::VPNGateway"),
    AWSIAMGroup("AWS::IAM::Group"),
    AWSIAMPolicy("AWS::IAM::Policy"),
    AWSIAMRole("AWS::IAM::Role"),
    AWSIAMUser("AWS::IAM::User");

    private String value;

    private ResourceType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return ResourceType corresponding to the value
     */
    public static ResourceType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("AWS::EC2::CustomerGateway".equals(value)) {
            return AWSEC2CustomerGateway;
        } else if ("AWS::EC2::EIP".equals(value)) {
            return AWSEC2EIP;
        } else if ("AWS::EC2::Host".equals(value)) {
            return AWSEC2Host;
        } else if ("AWS::EC2::Instance".equals(value)) {
            return AWSEC2Instance;
        } else if ("AWS::EC2::InternetGateway".equals(value)) {
            return AWSEC2InternetGateway;
        } else if ("AWS::EC2::NetworkAcl".equals(value)) {
            return AWSEC2NetworkAcl;
        } else if ("AWS::EC2::NetworkInterface".equals(value)) {
            return AWSEC2NetworkInterface;
        } else if ("AWS::EC2::RouteTable".equals(value)) {
            return AWSEC2RouteTable;
        } else if ("AWS::EC2::SecurityGroup".equals(value)) {
            return AWSEC2SecurityGroup;
        } else if ("AWS::EC2::Subnet".equals(value)) {
            return AWSEC2Subnet;
        } else if ("AWS::CloudTrail::Trail".equals(value)) {
            return AWSCloudTrailTrail;
        } else if ("AWS::EC2::Volume".equals(value)) {
            return AWSEC2Volume;
        } else if ("AWS::EC2::VPC".equals(value)) {
            return AWSEC2VPC;
        } else if ("AWS::EC2::VPNConnection".equals(value)) {
            return AWSEC2VPNConnection;
        } else if ("AWS::EC2::VPNGateway".equals(value)) {
            return AWSEC2VPNGateway;
        } else if ("AWS::IAM::Group".equals(value)) {
            return AWSIAMGroup;
        } else if ("AWS::IAM::Policy".equals(value)) {
            return AWSIAMPolicy;
        } else if ("AWS::IAM::Role".equals(value)) {
            return AWSIAMRole;
        } else if ("AWS::IAM::User".equals(value)) {
            return AWSIAMUser;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}