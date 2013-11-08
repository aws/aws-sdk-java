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
package com.amazonaws.auth.policy.actions;

import com.amazonaws.auth.policy.Action;

/**
 * The available AWS access control policy actions for AWS Elastic Beanstalk.
 */
public enum ElasticBeanstalkActions implements Action {
    /** Represents any action executed on AWS Elastic Beanstalk. */
    AllElasticBeanstalkActions("ElasticBeanstalk:*"),

    /** Action for the CheckDNSAvailability operation. */
    CheckDNSAvailability("ElasticBeanstalk:CheckDNSAvailability"),

    /** Action for the CreateApplication operation. */
    CreateApplication("ElasticBeanstalk:CreateApplication"),

    /** Action for the CreateApplicationVersion operation. */
    CreateApplicationVersion("ElasticBeanstalk:CreateApplicationVersion"),

    /** Action for the CreateConfigurationTemplate operation. */
    CreateConfigurationTemplate("ElasticBeanstalk:CreateConfigurationTemplate"),

    /** Action for the CreateEnvironment operation. */
    CreateEnvironment("ElasticBeanstalk:CreateEnvironment"),

    /** Action for the CreateStorageLocation operation. */
    CreateStorageLocation("ElasticBeanstalk:CreateStorageLocation"),

    /** Action for the DeleteApplication operation. */
    DeleteApplication("ElasticBeanstalk:DeleteApplication"),

    /** Action for the DeleteApplicationVersion operation. */
    DeleteApplicationVersion("ElasticBeanstalk:DeleteApplicationVersion"),

    /** Action for the DeleteConfigurationTemplate operation. */
    DeleteConfigurationTemplate("ElasticBeanstalk:DeleteConfigurationTemplate"),

    /** Action for the DeleteEnvironmentConfiguration operation. */
    DeleteEnvironmentConfiguration("ElasticBeanstalk:DeleteEnvironmentConfiguration"),

    /** Action for the DescribeApplicationVersions operation. */
    DescribeApplicationVersions("ElasticBeanstalk:DescribeApplicationVersions"),

    /** Action for the DescribeApplications operation. */
    DescribeApplications("ElasticBeanstalk:DescribeApplications"),

    /** Action for the DescribeConfigurationOptions operation. */
    DescribeConfigurationOptions("ElasticBeanstalk:DescribeConfigurationOptions"),

    /** Action for the DescribeConfigurationSettings operation. */
    DescribeConfigurationSettings("ElasticBeanstalk:DescribeConfigurationSettings"),

    /** Action for the DescribeEnvironmentResources operation. */
    DescribeEnvironmentResources("ElasticBeanstalk:DescribeEnvironmentResources"),

    /** Action for the DescribeEnvironments operation. */
    DescribeEnvironments("ElasticBeanstalk:DescribeEnvironments"),

    /** Action for the DescribeEvents operation. */
    DescribeEvents("ElasticBeanstalk:DescribeEvents"),

    /** Action for the ListAvailableSolutionStacks operation. */
    ListAvailableSolutionStacks("ElasticBeanstalk:ListAvailableSolutionStacks"),

    /** Action for the RebuildEnvironment operation. */
    RebuildEnvironment("ElasticBeanstalk:RebuildEnvironment"),

    /** Action for the RequestEnvironmentInfo operation. */
    RequestEnvironmentInfo("ElasticBeanstalk:RequestEnvironmentInfo"),

    /** Action for the RestartAppServer operation. */
    RestartAppServer("ElasticBeanstalk:RestartAppServer"),

    /** Action for the RetrieveEnvironmentInfo operation. */
    RetrieveEnvironmentInfo("ElasticBeanstalk:RetrieveEnvironmentInfo"),

    /** Action for the SwapEnvironmentCNAMEs operation. */
    SwapEnvironmentCNAMEs("ElasticBeanstalk:SwapEnvironmentCNAMEs"),

    /** Action for the TerminateEnvironment operation. */
    TerminateEnvironment("ElasticBeanstalk:TerminateEnvironment"),

    /** Action for the UpdateApplication operation. */
    UpdateApplication("ElasticBeanstalk:UpdateApplication"),

    /** Action for the UpdateApplicationVersion operation. */
    UpdateApplicationVersion("ElasticBeanstalk:UpdateApplicationVersion"),

    /** Action for the UpdateConfigurationTemplate operation. */
    UpdateConfigurationTemplate("ElasticBeanstalk:UpdateConfigurationTemplate"),

    /** Action for the UpdateEnvironment operation. */
    UpdateEnvironment("ElasticBeanstalk:UpdateEnvironment"),

    /** Action for the ValidateConfigurationSettings operation. */
    ValidateConfigurationSettings("ElasticBeanstalk:ValidateConfigurationSettings");

    private final String action;

    private ElasticBeanstalkActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
