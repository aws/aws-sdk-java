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
package com.amazonaws.auth.policy.actions;

import javax.annotation.Generated;

import com.amazonaws.auth.policy.Action;

/**
 * The available AWS access control policy actions for Elastic Beanstalk.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ElasticBeanstalkActions implements Action {

    /** Represents any action executed on Elastic Beanstalk. */
    AllElasticBeanstalkActions("elasticbeanstalk:*"),

    /** Action for the AbortEnvironmentUpdate operation. */
    AbortEnvironmentUpdate("elasticbeanstalk:AbortEnvironmentUpdate"),
    /** Action for the ApplyEnvironmentManagedAction operation. */
    ApplyEnvironmentManagedAction("elasticbeanstalk:ApplyEnvironmentManagedAction"),
    /** Action for the CheckDNSAvailability operation. */
    CheckDNSAvailability("elasticbeanstalk:CheckDNSAvailability"),
    /** Action for the ComposeEnvironments operation. */
    ComposeEnvironments("elasticbeanstalk:ComposeEnvironments"),
    /** Action for the CreateApplication operation. */
    CreateApplication("elasticbeanstalk:CreateApplication"),
    /** Action for the CreateApplicationVersion operation. */
    CreateApplicationVersion("elasticbeanstalk:CreateApplicationVersion"),
    /** Action for the CreateConfigurationTemplate operation. */
    CreateConfigurationTemplate("elasticbeanstalk:CreateConfigurationTemplate"),
    /** Action for the CreateEnvironment operation. */
    CreateEnvironment("elasticbeanstalk:CreateEnvironment"),
    /** Action for the CreatePlatformVersion operation. */
    CreatePlatformVersion("elasticbeanstalk:CreatePlatformVersion"),
    /** Action for the CreateStorageLocation operation. */
    CreateStorageLocation("elasticbeanstalk:CreateStorageLocation"),
    /** Action for the DeleteApplication operation. */
    DeleteApplication("elasticbeanstalk:DeleteApplication"),
    /** Action for the DeleteApplicationVersion operation. */
    DeleteApplicationVersion("elasticbeanstalk:DeleteApplicationVersion"),
    /** Action for the DeleteConfigurationTemplate operation. */
    DeleteConfigurationTemplate("elasticbeanstalk:DeleteConfigurationTemplate"),
    /** Action for the DeleteEnvironmentConfiguration operation. */
    DeleteEnvironmentConfiguration("elasticbeanstalk:DeleteEnvironmentConfiguration"),
    /** Action for the DeletePlatformVersion operation. */
    DeletePlatformVersion("elasticbeanstalk:DeletePlatformVersion"),
    /** Action for the DescribeAccountAttributes operation. */
    DescribeAccountAttributes("elasticbeanstalk:DescribeAccountAttributes"),
    /** Action for the DescribeApplicationVersions operation. */
    DescribeApplicationVersions("elasticbeanstalk:DescribeApplicationVersions"),
    /** Action for the DescribeApplications operation. */
    DescribeApplications("elasticbeanstalk:DescribeApplications"),
    /** Action for the DescribeConfigurationOptions operation. */
    DescribeConfigurationOptions("elasticbeanstalk:DescribeConfigurationOptions"),
    /** Action for the DescribeConfigurationSettings operation. */
    DescribeConfigurationSettings("elasticbeanstalk:DescribeConfigurationSettings"),
    /** Action for the DescribeEnvironmentHealth operation. */
    DescribeEnvironmentHealth("elasticbeanstalk:DescribeEnvironmentHealth"),
    /** Action for the DescribeEnvironmentManagedActionHistory operation. */
    DescribeEnvironmentManagedActionHistory("elasticbeanstalk:DescribeEnvironmentManagedActionHistory"),
    /** Action for the DescribeEnvironmentManagedActions operation. */
    DescribeEnvironmentManagedActions("elasticbeanstalk:DescribeEnvironmentManagedActions"),
    /** Action for the DescribeEnvironmentResources operation. */
    DescribeEnvironmentResources("elasticbeanstalk:DescribeEnvironmentResources"),
    /** Action for the DescribeEnvironments operation. */
    DescribeEnvironments("elasticbeanstalk:DescribeEnvironments"),
    /** Action for the DescribeEvents operation. */
    DescribeEvents("elasticbeanstalk:DescribeEvents"),
    /** Action for the DescribeInstancesHealth operation. */
    DescribeInstancesHealth("elasticbeanstalk:DescribeInstancesHealth"),
    /** Action for the DescribePlatformVersion operation. */
    DescribePlatformVersion("elasticbeanstalk:DescribePlatformVersion"),
    /** Action for the ListAvailableSolutionStacks operation. */
    ListAvailableSolutionStacks("elasticbeanstalk:ListAvailableSolutionStacks"),
    /** Action for the ListPlatformVersions operation. */
    ListPlatformVersions("elasticbeanstalk:ListPlatformVersions"),
    /** Action for the ListTagsForResource operation. */
    ListTagsForResource("elasticbeanstalk:ListTagsForResource"),
    /** Action for the RebuildEnvironment operation. */
    RebuildEnvironment("elasticbeanstalk:RebuildEnvironment"),
    /** Action for the RequestEnvironmentInfo operation. */
    RequestEnvironmentInfo("elasticbeanstalk:RequestEnvironmentInfo"),
    /** Action for the RestartAppServer operation. */
    RestartAppServer("elasticbeanstalk:RestartAppServer"),
    /** Action for the RetrieveEnvironmentInfo operation. */
    RetrieveEnvironmentInfo("elasticbeanstalk:RetrieveEnvironmentInfo"),
    /** Action for the SwapEnvironmentCNAMEs operation. */
    SwapEnvironmentCNAMEs("elasticbeanstalk:SwapEnvironmentCNAMEs"),
    /** Action for the TerminateEnvironment operation. */
    TerminateEnvironment("elasticbeanstalk:TerminateEnvironment"),
    /** Action for the UpdateApplication operation. */
    UpdateApplication("elasticbeanstalk:UpdateApplication"),
    /** Action for the UpdateApplicationResourceLifecycle operation. */
    UpdateApplicationResourceLifecycle("elasticbeanstalk:UpdateApplicationResourceLifecycle"),
    /** Action for the UpdateApplicationVersion operation. */
    UpdateApplicationVersion("elasticbeanstalk:UpdateApplicationVersion"),
    /** Action for the UpdateConfigurationTemplate operation. */
    UpdateConfigurationTemplate("elasticbeanstalk:UpdateConfigurationTemplate"),
    /** Action for the UpdateEnvironment operation. */
    UpdateEnvironment("elasticbeanstalk:UpdateEnvironment"),
    /** Action for the UpdateTagsForResource operation. */
    UpdateTagsForResource("elasticbeanstalk:UpdateTagsForResource"),
    /** Action for the ValidateConfigurationSettings operation. */
    ValidateConfigurationSettings("elasticbeanstalk:ValidateConfigurationSettings"),

    ;

    private final String action;

    private ElasticBeanstalkActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
