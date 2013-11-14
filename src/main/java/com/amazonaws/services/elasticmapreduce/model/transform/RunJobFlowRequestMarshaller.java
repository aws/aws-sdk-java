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
package com.amazonaws.services.elasticmapreduce.model.transform;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Run Job Flow Request Marshaller
 */
public class RunJobFlowRequestMarshaller implements Marshaller<Request<RunJobFlowRequest>, RunJobFlowRequest> {

    

    public Request<RunJobFlowRequest> marshall(RunJobFlowRequest runJobFlowRequest) {
    if (runJobFlowRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<RunJobFlowRequest> request = new DefaultRequest<RunJobFlowRequest>(runJobFlowRequest, "AmazonElasticMapReduce");
        String target = "ElasticMapReduce.RunJobFlow";
        request.addHeader("X-Amz-Target", target);
        request.addHeader("Content-Type", "application/x-amz-json-1.1");

        
        request.setHttpMethod(HttpMethodName.POST);


        String uriResourcePath = ""; 

        uriResourcePath = uriResourcePath.replaceAll("//", "/");

        if (uriResourcePath.contains("?")) {
            String queryString = uriResourcePath.substring(uriResourcePath.indexOf("?") + 1);
            uriResourcePath    = uriResourcePath.substring(0, uriResourcePath.indexOf("?"));

            for (String s : queryString.split("[;&]")) {
                String[] nameValuePair = s.split("=");
                if (nameValuePair.length == 2) {
                    request.addParameter(nameValuePair[0], nameValuePair[1]);
                } else {
                    request.addParameter(s, null);
                }
            }
        }

        request.setResourcePath(uriResourcePath);


        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          
            
          jsonWriter.object();
          
            if (runJobFlowRequest.getName() != null) {
                jsonWriter.key("Name").value(runJobFlowRequest.getName());
            }
            if (runJobFlowRequest.getLogUri() != null) {
                jsonWriter.key("LogUri").value(runJobFlowRequest.getLogUri());
            }
            if (runJobFlowRequest.getAdditionalInfo() != null) {
                jsonWriter.key("AdditionalInfo").value(runJobFlowRequest.getAdditionalInfo());
            }
            if (runJobFlowRequest.getAmiVersion() != null) {
                jsonWriter.key("AmiVersion").value(runJobFlowRequest.getAmiVersion());
            }
            JobFlowInstancesConfig instances = runJobFlowRequest.getInstances();
            if (instances != null) {

                jsonWriter.key("Instances");
                jsonWriter.object();

                if (instances.getMasterInstanceType() != null) {
                    jsonWriter.key("MasterInstanceType").value(instances.getMasterInstanceType());
                }
                if (instances.getSlaveInstanceType() != null) {
                    jsonWriter.key("SlaveInstanceType").value(instances.getSlaveInstanceType());
                }
                if (instances.getInstanceCount() != null) {
                    jsonWriter.key("InstanceCount").value(instances.getInstanceCount());
                }

                com.amazonaws.internal.ListWithAutoConstructFlag<InstanceGroupConfig> instanceGroupsList = (com.amazonaws.internal.ListWithAutoConstructFlag<InstanceGroupConfig>)(instances.getInstanceGroups());
                if (instanceGroupsList != null && !(instanceGroupsList.isAutoConstruct() && instanceGroupsList.isEmpty())) {

                    jsonWriter.key("InstanceGroups");
                    jsonWriter.array();

                    for (InstanceGroupConfig instanceGroupsListValue : instanceGroupsList) {
                        if (instanceGroupsListValue != null) {
                            jsonWriter.object();
                            if (instanceGroupsListValue.getName() != null) {
                                jsonWriter.key("Name").value(instanceGroupsListValue.getName());
                            }
                            if (instanceGroupsListValue.getMarket() != null) {
                                jsonWriter.key("Market").value(instanceGroupsListValue.getMarket());
                            }
                            if (instanceGroupsListValue.getInstanceRole() != null) {
                                jsonWriter.key("InstanceRole").value(instanceGroupsListValue.getInstanceRole());
                            }
                            if (instanceGroupsListValue.getBidPrice() != null) {
                                jsonWriter.key("BidPrice").value(instanceGroupsListValue.getBidPrice());
                            }
                            if (instanceGroupsListValue.getInstanceType() != null) {
                                jsonWriter.key("InstanceType").value(instanceGroupsListValue.getInstanceType());
                            }
                            if (instanceGroupsListValue.getInstanceCount() != null) {
                                jsonWriter.key("InstanceCount").value(instanceGroupsListValue.getInstanceCount());
                            }
                            jsonWriter.endObject();
                        }
                    }
                    jsonWriter.endArray();
                }
                if (instances.getEc2KeyName() != null) {
                    jsonWriter.key("Ec2KeyName").value(instances.getEc2KeyName());
                }
                PlacementType placement = instances.getPlacement();
                if (placement != null) {

                    jsonWriter.key("Placement");
                    jsonWriter.object();

                    if (placement.getAvailabilityZone() != null) {
                        jsonWriter.key("AvailabilityZone").value(placement.getAvailabilityZone());
                    }
                    jsonWriter.endObject();
                }
                if (instances.isKeepJobFlowAliveWhenNoSteps() != null) {
                    jsonWriter.key("KeepJobFlowAliveWhenNoSteps").value(instances.isKeepJobFlowAliveWhenNoSteps());
                }
                if (instances.isTerminationProtected() != null) {
                    jsonWriter.key("TerminationProtected").value(instances.isTerminationProtected());
                }
                if (instances.getHadoopVersion() != null) {
                    jsonWriter.key("HadoopVersion").value(instances.getHadoopVersion());
                }
                if (instances.getEc2SubnetId() != null) {
                    jsonWriter.key("Ec2SubnetId").value(instances.getEc2SubnetId());
                }
                jsonWriter.endObject();
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<StepConfig> stepsList = (com.amazonaws.internal.ListWithAutoConstructFlag<StepConfig>)(runJobFlowRequest.getSteps());
            if (stepsList != null && !(stepsList.isAutoConstruct() && stepsList.isEmpty())) {

                jsonWriter.key("Steps");
                jsonWriter.array();

                for (StepConfig stepsListValue : stepsList) {
                    if (stepsListValue != null) {
                        jsonWriter.object();
                        if (stepsListValue.getName() != null) {
                            jsonWriter.key("Name").value(stepsListValue.getName());
                        }
                        if (stepsListValue.getActionOnFailure() != null) {
                            jsonWriter.key("ActionOnFailure").value(stepsListValue.getActionOnFailure());
                        }
                        HadoopJarStepConfig hadoopJarStep = stepsListValue.getHadoopJarStep();
                        if (hadoopJarStep != null) {

                            jsonWriter.key("HadoopJarStep");
                            jsonWriter.object();


                            com.amazonaws.internal.ListWithAutoConstructFlag<KeyValue> propertiesList = (com.amazonaws.internal.ListWithAutoConstructFlag<KeyValue>)(hadoopJarStep.getProperties());
                            if (propertiesList != null && !(propertiesList.isAutoConstruct() && propertiesList.isEmpty())) {

                                jsonWriter.key("Properties");
                                jsonWriter.array();

                                for (KeyValue propertiesListValue : propertiesList) {
                                    if (propertiesListValue != null) {
                                        jsonWriter.object();
                                        if (propertiesListValue.getKey() != null) {
                                            jsonWriter.key("Key").value(propertiesListValue.getKey());
                                        }
                                        if (propertiesListValue.getValue() != null) {
                                            jsonWriter.key("Value").value(propertiesListValue.getValue());
                                        }
                                        jsonWriter.endObject();
                                    }
                                }
                                jsonWriter.endArray();
                            }
                            if (hadoopJarStep.getJar() != null) {
                                jsonWriter.key("Jar").value(hadoopJarStep.getJar());
                            }
                            if (hadoopJarStep.getMainClass() != null) {
                                jsonWriter.key("MainClass").value(hadoopJarStep.getMainClass());
                            }

                            com.amazonaws.internal.ListWithAutoConstructFlag<String> argsList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(hadoopJarStep.getArgs());
                            if (argsList != null && !(argsList.isAutoConstruct() && argsList.isEmpty())) {

                                jsonWriter.key("Args");
                                jsonWriter.array();

                                for (String argsListValue : argsList) {
                                    if (argsListValue != null) {
                                        jsonWriter.value(argsListValue);
                                    }
                                }
                                jsonWriter.endArray();
                            }
                            jsonWriter.endObject();
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<BootstrapActionConfig> bootstrapActionsList = (com.amazonaws.internal.ListWithAutoConstructFlag<BootstrapActionConfig>)(runJobFlowRequest.getBootstrapActions());
            if (bootstrapActionsList != null && !(bootstrapActionsList.isAutoConstruct() && bootstrapActionsList.isEmpty())) {

                jsonWriter.key("BootstrapActions");
                jsonWriter.array();

                for (BootstrapActionConfig bootstrapActionsListValue : bootstrapActionsList) {
                    if (bootstrapActionsListValue != null) {
                        jsonWriter.object();
                        if (bootstrapActionsListValue.getName() != null) {
                            jsonWriter.key("Name").value(bootstrapActionsListValue.getName());
                        }
                        ScriptBootstrapActionConfig scriptBootstrapAction = bootstrapActionsListValue.getScriptBootstrapAction();
                        if (scriptBootstrapAction != null) {

                            jsonWriter.key("ScriptBootstrapAction");
                            jsonWriter.object();

                            if (scriptBootstrapAction.getPath() != null) {
                                jsonWriter.key("Path").value(scriptBootstrapAction.getPath());
                            }

                            com.amazonaws.internal.ListWithAutoConstructFlag<String> argsList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(scriptBootstrapAction.getArgs());
                            if (argsList != null && !(argsList.isAutoConstruct() && argsList.isEmpty())) {

                                jsonWriter.key("Args");
                                jsonWriter.array();

                                for (String argsListValue : argsList) {
                                    if (argsListValue != null) {
                                        jsonWriter.value(argsListValue);
                                    }
                                }
                                jsonWriter.endArray();
                            }
                            jsonWriter.endObject();
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<String> supportedProductsList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(runJobFlowRequest.getSupportedProducts());
            if (supportedProductsList != null && !(supportedProductsList.isAutoConstruct() && supportedProductsList.isEmpty())) {

                jsonWriter.key("SupportedProducts");
                jsonWriter.array();

                for (String supportedProductsListValue : supportedProductsList) {
                    if (supportedProductsListValue != null) {
                        jsonWriter.value(supportedProductsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.ListWithAutoConstructFlag<SupportedProductConfig> newSupportedProductsList = (com.amazonaws.internal.ListWithAutoConstructFlag<SupportedProductConfig>)(runJobFlowRequest.getNewSupportedProducts());
            if (newSupportedProductsList != null && !(newSupportedProductsList.isAutoConstruct() && newSupportedProductsList.isEmpty())) {

                jsonWriter.key("NewSupportedProducts");
                jsonWriter.array();

                for (SupportedProductConfig newSupportedProductsListValue : newSupportedProductsList) {
                    if (newSupportedProductsListValue != null) {
                        jsonWriter.object();
                        if (newSupportedProductsListValue.getName() != null) {
                            jsonWriter.key("Name").value(newSupportedProductsListValue.getName());
                        }

                        com.amazonaws.internal.ListWithAutoConstructFlag<String> argsList = (com.amazonaws.internal.ListWithAutoConstructFlag<String>)(newSupportedProductsListValue.getArgs());
                        if (argsList != null && !(argsList.isAutoConstruct() && argsList.isEmpty())) {

                            jsonWriter.key("Args");
                            jsonWriter.array();

                            for (String argsListValue : argsList) {
                                if (argsListValue != null) {
                                    jsonWriter.value(argsListValue);
                                }
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endArray();
            }
            if (runJobFlowRequest.isVisibleToAllUsers() != null) {
                jsonWriter.key("VisibleToAllUsers").value(runJobFlowRequest.isVisibleToAllUsers());
            }
            if (runJobFlowRequest.getJobFlowRole() != null) {
                jsonWriter.key("JobFlowRole").value(runJobFlowRequest.getJobFlowRole());
            }

          jsonWriter.endObject();
          

          String snippet = stringWriter.toString();
          byte[] content = snippet.getBytes("UTF-8");
          request.setContent(new StringInputStream(snippet));
          request.addHeader("Content-Length", Integer.toString(content.length));
        } catch(Throwable t) {
          throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        

        return request;
    }
}
