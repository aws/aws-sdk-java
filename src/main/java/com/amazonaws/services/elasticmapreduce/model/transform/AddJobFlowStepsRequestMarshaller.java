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
 * Add Job Flow Steps Request Marshaller
 */
public class AddJobFlowStepsRequestMarshaller implements Marshaller<Request<AddJobFlowStepsRequest>, AddJobFlowStepsRequest> {

    public Request<AddJobFlowStepsRequest> marshall(AddJobFlowStepsRequest addJobFlowStepsRequest) {
        Request<AddJobFlowStepsRequest> request = new DefaultRequest<AddJobFlowStepsRequest>(addJobFlowStepsRequest, "AmazonElasticMapReduce");
        request.addParameter("Action", "AddJobFlowSteps");
        request.addParameter("Version", "2009-03-31");
        if (addJobFlowStepsRequest != null) {
            if (addJobFlowStepsRequest.getJobFlowId() != null) {
                request.addParameter("JobFlowId", StringUtils.fromString(addJobFlowStepsRequest.getJobFlowId()));
            }
        }

        if (addJobFlowStepsRequest != null) {
            java.util.List<StepConfig> stepsList = addJobFlowStepsRequest.getSteps();
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


        return request;
    }
}
