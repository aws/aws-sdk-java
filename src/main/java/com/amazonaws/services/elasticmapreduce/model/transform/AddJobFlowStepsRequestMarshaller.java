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
 * Add Job Flow Steps Request Marshaller
 */
public class AddJobFlowStepsRequestMarshaller implements Marshaller<Request<AddJobFlowStepsRequest>, AddJobFlowStepsRequest> {

    public Request<AddJobFlowStepsRequest> marshall(AddJobFlowStepsRequest addJobFlowStepsRequest) {

        if (addJobFlowStepsRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<AddJobFlowStepsRequest> request = new DefaultRequest<AddJobFlowStepsRequest>(addJobFlowStepsRequest, "AmazonElasticMapReduce");
        request.addParameter("Action", "AddJobFlowSteps");
        request.addParameter("Version", "2009-03-31");

        if (addJobFlowStepsRequest.getJobFlowId() != null) {
            request.addParameter("JobFlowId", StringUtils.fromString(addJobFlowStepsRequest.getJobFlowId()));
        }

        java.util.List<StepConfig> stepsList = addJobFlowStepsRequest.getSteps();
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


        return request;
    }
}
