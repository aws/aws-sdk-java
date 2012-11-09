/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Run Job Flow Request Marshaller
 */
public class RunJobFlowRequestMarshaller implements Marshaller<Request<RunJobFlowRequest>, RunJobFlowRequest> {

    public Request<RunJobFlowRequest> marshall(RunJobFlowRequest runJobFlowRequest) {

        if (runJobFlowRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<RunJobFlowRequest> request = new DefaultRequest<RunJobFlowRequest>(runJobFlowRequest, "AmazonElasticMapReduce");
        request.addParameter("Action", "RunJobFlow");
        request.addParameter("Version", "2009-03-31");

        if (runJobFlowRequest.getName() != null) {
            request.addParameter("Name", StringUtils.fromString(runJobFlowRequest.getName()));
        }
        if (runJobFlowRequest.getLogUri() != null) {
            request.addParameter("LogUri", StringUtils.fromString(runJobFlowRequest.getLogUri()));
        }
        if (runJobFlowRequest.getAdditionalInfo() != null) {
            request.addParameter("AdditionalInfo", StringUtils.fromString(runJobFlowRequest.getAdditionalInfo()));
        }
        if (runJobFlowRequest.getAmiVersion() != null) {
            request.addParameter("AmiVersion", StringUtils.fromString(runJobFlowRequest.getAmiVersion()));
        }
        JobFlowInstancesConfig jobFlowInstancesConfigInstances = runJobFlowRequest.getInstances();
        if (jobFlowInstancesConfigInstances != null) {
            if (jobFlowInstancesConfigInstances.getMasterInstanceType() != null) {
                request.addParameter("Instances.MasterInstanceType", StringUtils.fromString(jobFlowInstancesConfigInstances.getMasterInstanceType()));
            }
            if (jobFlowInstancesConfigInstances.getSlaveInstanceType() != null) {
                request.addParameter("Instances.SlaveInstanceType", StringUtils.fromString(jobFlowInstancesConfigInstances.getSlaveInstanceType()));
            }
            if (jobFlowInstancesConfigInstances.getInstanceCount() != null) {
                request.addParameter("Instances.InstanceCount", StringUtils.fromInteger(jobFlowInstancesConfigInstances.getInstanceCount()));
            }

            java.util.List<InstanceGroupConfig> instanceGroupsList = jobFlowInstancesConfigInstances.getInstanceGroups();
            int instanceGroupsListIndex = 1;

            for (InstanceGroupConfig instanceGroupsListValue : instanceGroupsList) {
                InstanceGroupConfig instanceGroupConfigMember = instanceGroupsListValue;
                if (instanceGroupConfigMember != null) {
                    if (instanceGroupConfigMember.getName() != null) {
                        request.addParameter("Instances.InstanceGroups.member." + instanceGroupsListIndex + ".Name", StringUtils.fromString(instanceGroupConfigMember.getName()));
                    }
                    if (instanceGroupConfigMember.getMarket() != null) {
                        request.addParameter("Instances.InstanceGroups.member." + instanceGroupsListIndex + ".Market", StringUtils.fromString(instanceGroupConfigMember.getMarket()));
                    }
                    if (instanceGroupConfigMember.getInstanceRole() != null) {
                        request.addParameter("Instances.InstanceGroups.member." + instanceGroupsListIndex + ".InstanceRole", StringUtils.fromString(instanceGroupConfigMember.getInstanceRole()));
                    }
                    if (instanceGroupConfigMember.getBidPrice() != null) {
                        request.addParameter("Instances.InstanceGroups.member." + instanceGroupsListIndex + ".BidPrice", StringUtils.fromString(instanceGroupConfigMember.getBidPrice()));
                    }
                    if (instanceGroupConfigMember.getInstanceType() != null) {
                        request.addParameter("Instances.InstanceGroups.member." + instanceGroupsListIndex + ".InstanceType", StringUtils.fromString(instanceGroupConfigMember.getInstanceType()));
                    }
                    if (instanceGroupConfigMember.getInstanceCount() != null) {
                        request.addParameter("Instances.InstanceGroups.member." + instanceGroupsListIndex + ".InstanceCount", StringUtils.fromInteger(instanceGroupConfigMember.getInstanceCount()));
                    }
                }

                instanceGroupsListIndex++;
            }
            if (jobFlowInstancesConfigInstances.getEc2KeyName() != null) {
                request.addParameter("Instances.Ec2KeyName", StringUtils.fromString(jobFlowInstancesConfigInstances.getEc2KeyName()));
            }
            PlacementType placementTypePlacement = jobFlowInstancesConfigInstances.getPlacement();
            if (placementTypePlacement != null) {
                if (placementTypePlacement.getAvailabilityZone() != null) {
                    request.addParameter("Instances.Placement.AvailabilityZone", StringUtils.fromString(placementTypePlacement.getAvailabilityZone()));
                }
            }
            if (jobFlowInstancesConfigInstances.isKeepJobFlowAliveWhenNoSteps() != null) {
                request.addParameter("Instances.KeepJobFlowAliveWhenNoSteps", StringUtils.fromBoolean(jobFlowInstancesConfigInstances.isKeepJobFlowAliveWhenNoSteps()));
            }
            if (jobFlowInstancesConfigInstances.isTerminationProtected() != null) {
                request.addParameter("Instances.TerminationProtected", StringUtils.fromBoolean(jobFlowInstancesConfigInstances.isTerminationProtected()));
            }
            if (jobFlowInstancesConfigInstances.getHadoopVersion() != null) {
                request.addParameter("Instances.HadoopVersion", StringUtils.fromString(jobFlowInstancesConfigInstances.getHadoopVersion()));
            }
            if (jobFlowInstancesConfigInstances.getEc2SubnetId() != null) {
                request.addParameter("Instances.Ec2SubnetId", StringUtils.fromString(jobFlowInstancesConfigInstances.getEc2SubnetId()));
            }
        }

        java.util.List<StepConfig> stepsList = runJobFlowRequest.getSteps();
        int stepsListIndex = 1;

        for (StepConfig stepsListValue : stepsList) {
            StepConfig stepConfigMember = stepsListValue;
            if (stepConfigMember != null) {
                if (stepConfigMember.getName() != null) {
                    request.addParameter("Steps.member." + stepsListIndex + ".Name", StringUtils.fromString(stepConfigMember.getName()));
                }
                if (stepConfigMember.getActionOnFailure() != null) {
                    request.addParameter("Steps.member." + stepsListIndex + ".ActionOnFailure", StringUtils.fromString(stepConfigMember.getActionOnFailure()));
                }
                HadoopJarStepConfig hadoopJarStepConfigHadoopJarStep = stepConfigMember.getHadoopJarStep();
                if (hadoopJarStepConfigHadoopJarStep != null) {

                    java.util.List<KeyValue> propertiesList = hadoopJarStepConfigHadoopJarStep.getProperties();
                    int propertiesListIndex = 1;

                    for (KeyValue propertiesListValue : propertiesList) {
                        KeyValue keyValueMember = propertiesListValue;
                        if (keyValueMember != null) {
                            if (keyValueMember.getKey() != null) {
                                request.addParameter("Steps.member." + stepsListIndex + ".HadoopJarStep.Properties.member." + propertiesListIndex + ".Key", StringUtils.fromString(keyValueMember.getKey()));
                            }
                            if (keyValueMember.getValue() != null) {
                                request.addParameter("Steps.member." + stepsListIndex + ".HadoopJarStep.Properties.member." + propertiesListIndex + ".Value", StringUtils.fromString(keyValueMember.getValue()));
                            }
                        }

                        propertiesListIndex++;
                    }
                    if (hadoopJarStepConfigHadoopJarStep.getJar() != null) {
                        request.addParameter("Steps.member." + stepsListIndex + ".HadoopJarStep.Jar", StringUtils.fromString(hadoopJarStepConfigHadoopJarStep.getJar()));
                    }
                    if (hadoopJarStepConfigHadoopJarStep.getMainClass() != null) {
                        request.addParameter("Steps.member." + stepsListIndex + ".HadoopJarStep.MainClass", StringUtils.fromString(hadoopJarStepConfigHadoopJarStep.getMainClass()));
                    }

                    java.util.List<String> argsList = hadoopJarStepConfigHadoopJarStep.getArgs();
                    int argsListIndex = 1;

                    for (String argsListValue : argsList) {
                        if (argsListValue != null) {
                            request.addParameter("Steps.member." + stepsListIndex + ".HadoopJarStep.Args.member." + argsListIndex, StringUtils.fromString(argsListValue));
                        }

                        argsListIndex++;
                    }
                }
            }

            stepsListIndex++;
        }

        java.util.List<BootstrapActionConfig> bootstrapActionsList = runJobFlowRequest.getBootstrapActions();
        int bootstrapActionsListIndex = 1;

        for (BootstrapActionConfig bootstrapActionsListValue : bootstrapActionsList) {
            BootstrapActionConfig bootstrapActionConfigMember = bootstrapActionsListValue;
            if (bootstrapActionConfigMember != null) {
                if (bootstrapActionConfigMember.getName() != null) {
                    request.addParameter("BootstrapActions.member." + bootstrapActionsListIndex + ".Name", StringUtils.fromString(bootstrapActionConfigMember.getName()));
                }
                ScriptBootstrapActionConfig scriptBootstrapActionConfigScriptBootstrapAction = bootstrapActionConfigMember.getScriptBootstrapAction();
                if (scriptBootstrapActionConfigScriptBootstrapAction != null) {
                    if (scriptBootstrapActionConfigScriptBootstrapAction.getPath() != null) {
                        request.addParameter("BootstrapActions.member." + bootstrapActionsListIndex + ".ScriptBootstrapAction.Path", StringUtils.fromString(scriptBootstrapActionConfigScriptBootstrapAction.getPath()));
                    }

                    java.util.List<String> argsList = scriptBootstrapActionConfigScriptBootstrapAction.getArgs();
                    int argsListIndex = 1;

                    for (String argsListValue : argsList) {
                        if (argsListValue != null) {
                            request.addParameter("BootstrapActions.member." + bootstrapActionsListIndex + ".ScriptBootstrapAction.Args.member." + argsListIndex, StringUtils.fromString(argsListValue));
                        }

                        argsListIndex++;
                    }
                }
            }

            bootstrapActionsListIndex++;
        }

        java.util.List<String> supportedProductsList = runJobFlowRequest.getSupportedProducts();
        int supportedProductsListIndex = 1;

        for (String supportedProductsListValue : supportedProductsList) {
            if (supportedProductsListValue != null) {
                request.addParameter("SupportedProducts.member." + supportedProductsListIndex, StringUtils.fromString(supportedProductsListValue));
            }

            supportedProductsListIndex++;
        }
        if (runJobFlowRequest.isVisibleToAllUsers() != null) {
            request.addParameter("VisibleToAllUsers", StringUtils.fromBoolean(runJobFlowRequest.isVisibleToAllUsers()));
        }


        return request;
    }
}
