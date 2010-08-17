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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        Request<RunJobFlowRequest> request = new DefaultRequest<RunJobFlowRequest>(runJobFlowRequest, "AmazonElasticMapReduce");
        request.addParameter("Action", "RunJobFlow");
        request.addParameter("Version", "2009-03-31");
        if (runJobFlowRequest != null) {
            if (runJobFlowRequest.getName() != null) {
                request.addParameter("Name", StringUtils.fromString(runJobFlowRequest.getName()));
            }
        }
        if (runJobFlowRequest != null) {
            if (runJobFlowRequest.getLogUri() != null) {
                request.addParameter("LogUri", StringUtils.fromString(runJobFlowRequest.getLogUri()));
            }
        }
        if (runJobFlowRequest != null) {
            if (runJobFlowRequest.getAdditionalInfo() != null) {
                request.addParameter("AdditionalInfo", StringUtils.fromString(runJobFlowRequest.getAdditionalInfo()));
            }
        }
        if (runJobFlowRequest != null) {
            JobFlowInstancesConfig instances = runJobFlowRequest.getInstances();
            if (instances != null) {
                if (instances.getMasterInstanceType() != null) {
                    request.addParameter("Instances.MasterInstanceType", StringUtils.fromString(instances.getMasterInstanceType()));
                }
            }
            if (instances != null) {
                if (instances.getSlaveInstanceType() != null) {
                    request.addParameter("Instances.SlaveInstanceType", StringUtils.fromString(instances.getSlaveInstanceType()));
                }
            }
            if (instances != null) {
                if (instances.getInstanceCount() != null) {
                    request.addParameter("Instances.InstanceCount", StringUtils.fromInteger(instances.getInstanceCount()));
                }
            }
            if (instances != null) {
                if (instances.getEc2KeyName() != null) {
                    request.addParameter("Instances.Ec2KeyName", StringUtils.fromString(instances.getEc2KeyName()));
                }
            }
            if (instances != null) {
                PlacementType placement = instances.getPlacement();
                if (placement != null) {
                    if (placement.getAvailabilityZone() != null) {
                        request.addParameter("Instances.Placement.AvailabilityZone", StringUtils.fromString(placement.getAvailabilityZone()));
                    }
                }
            }
            if (instances != null) {
                if (instances.isKeepJobFlowAliveWhenNoSteps() != null) {
                    request.addParameter("Instances.KeepJobFlowAliveWhenNoSteps", StringUtils.fromBoolean(instances.isKeepJobFlowAliveWhenNoSteps()));
                }
            }
            if (instances != null) {
                if (instances.getHadoopVersion() != null) {
                    request.addParameter("Instances.HadoopVersion", StringUtils.fromString(instances.getHadoopVersion()));
                }
            }
        }

        if (runJobFlowRequest != null) {
            java.util.List<StepConfig> stepsList = runJobFlowRequest.getSteps();
            int stepsListIndex = 1;
            for (StepConfig stepsListValue : stepsList) {
                if (stepsListValue != null) {
                    if (stepsListValue.getName() != null) {
                        request.addParameter("Steps.member." + stepsListIndex + ".Name", StringUtils.fromString(stepsListValue.getName()));
                    }
                }
                if (stepsListValue != null) {
                    if (stepsListValue.getActionOnFailure() != null) {
                        request.addParameter("Steps.member." + stepsListIndex + ".ActionOnFailure", StringUtils.fromString(stepsListValue.getActionOnFailure()));
                    }
                }
                if (stepsListValue != null) {
                    HadoopJarStepConfig hadoopJarStep = stepsListValue.getHadoopJarStep();

                    if (hadoopJarStep != null) {
                        java.util.List<KeyValue> propertiesList = hadoopJarStep.getProperties();
                        int propertiesListIndex = 1;
                        for (KeyValue propertiesListValue : propertiesList) {
                            if (propertiesListValue != null) {
                                if (propertiesListValue.getKey() != null) {
                                    request.addParameter("Steps.member." + stepsListIndex + ".HadoopJarStep.Properties.member." + propertiesListIndex + ".Key", StringUtils.fromString(propertiesListValue.getKey()));
                                }
                            }
                            if (propertiesListValue != null) {
                                if (propertiesListValue.getValue() != null) {
                                    request.addParameter("Steps.member." + stepsListIndex + ".HadoopJarStep.Properties.member." + propertiesListIndex + ".Value", StringUtils.fromString(propertiesListValue.getValue()));
                                }
                            }

                            propertiesListIndex++;
                        }
                    }
                    if (hadoopJarStep != null) {
                        if (hadoopJarStep.getJar() != null) {
                            request.addParameter("Steps.member." + stepsListIndex + ".HadoopJarStep.Jar", StringUtils.fromString(hadoopJarStep.getJar()));
                        }
                    }
                    if (hadoopJarStep != null) {
                        if (hadoopJarStep.getMainClass() != null) {
                            request.addParameter("Steps.member." + stepsListIndex + ".HadoopJarStep.MainClass", StringUtils.fromString(hadoopJarStep.getMainClass()));
                        }
                    }
                    if (hadoopJarStep != null) {
                        java.util.List<String> argsList = hadoopJarStep.getArgs();
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
        }

        if (runJobFlowRequest != null) {
            java.util.List<BootstrapActionConfig> bootstrapActionsList = runJobFlowRequest.getBootstrapActions();
            int bootstrapActionsListIndex = 1;
            for (BootstrapActionConfig bootstrapActionsListValue : bootstrapActionsList) {
                if (bootstrapActionsListValue != null) {
                    if (bootstrapActionsListValue.getName() != null) {
                        request.addParameter("BootstrapActions.member." + bootstrapActionsListIndex + ".Name", StringUtils.fromString(bootstrapActionsListValue.getName()));
                    }
                }
                if (bootstrapActionsListValue != null) {
                    ScriptBootstrapActionConfig scriptBootstrapAction = bootstrapActionsListValue.getScriptBootstrapAction();
                    if (scriptBootstrapAction != null) {
                        if (scriptBootstrapAction.getPath() != null) {
                            request.addParameter("BootstrapActions.member." + bootstrapActionsListIndex + ".ScriptBootstrapAction.Path", StringUtils.fromString(scriptBootstrapAction.getPath()));
                        }
                    }
                    if (scriptBootstrapAction != null) {
                        java.util.List<String> argsList = scriptBootstrapAction.getArgs();
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
        }


        return request;
    }
}
