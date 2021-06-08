/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsApiGatewayStageDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsApiGatewayStageDetailsMarshaller {

    private static final MarshallingInfo<String> DEPLOYMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeploymentId").build();
    private static final MarshallingInfo<String> CLIENTCERTIFICATEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientCertificateId").build();
    private static final MarshallingInfo<String> STAGENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StageName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<Boolean> CACHECLUSTERENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CacheClusterEnabled").build();
    private static final MarshallingInfo<String> CACHECLUSTERSIZE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CacheClusterSize").build();
    private static final MarshallingInfo<String> CACHECLUSTERSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CacheClusterStatus").build();
    private static final MarshallingInfo<List> METHODSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MethodSettings").build();
    private static final MarshallingInfo<Map> VARIABLES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Variables").build();
    private static final MarshallingInfo<String> DOCUMENTATIONVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DocumentationVersion").build();
    private static final MarshallingInfo<StructuredPojo> ACCESSLOGSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccessLogSettings").build();
    private static final MarshallingInfo<StructuredPojo> CANARYSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CanarySettings").build();
    private static final MarshallingInfo<Boolean> TRACINGENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TracingEnabled").build();
    private static final MarshallingInfo<String> CREATEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedDate").build();
    private static final MarshallingInfo<String> LASTUPDATEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdatedDate").build();
    private static final MarshallingInfo<String> WEBACLARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("WebAclArn").build();

    private static final AwsApiGatewayStageDetailsMarshaller instance = new AwsApiGatewayStageDetailsMarshaller();

    public static AwsApiGatewayStageDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsApiGatewayStageDetails awsApiGatewayStageDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsApiGatewayStageDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsApiGatewayStageDetails.getDeploymentId(), DEPLOYMENTID_BINDING);
            protocolMarshaller.marshall(awsApiGatewayStageDetails.getClientCertificateId(), CLIENTCERTIFICATEID_BINDING);
            protocolMarshaller.marshall(awsApiGatewayStageDetails.getStageName(), STAGENAME_BINDING);
            protocolMarshaller.marshall(awsApiGatewayStageDetails.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(awsApiGatewayStageDetails.getCacheClusterEnabled(), CACHECLUSTERENABLED_BINDING);
            protocolMarshaller.marshall(awsApiGatewayStageDetails.getCacheClusterSize(), CACHECLUSTERSIZE_BINDING);
            protocolMarshaller.marshall(awsApiGatewayStageDetails.getCacheClusterStatus(), CACHECLUSTERSTATUS_BINDING);
            protocolMarshaller.marshall(awsApiGatewayStageDetails.getMethodSettings(), METHODSETTINGS_BINDING);
            protocolMarshaller.marshall(awsApiGatewayStageDetails.getVariables(), VARIABLES_BINDING);
            protocolMarshaller.marshall(awsApiGatewayStageDetails.getDocumentationVersion(), DOCUMENTATIONVERSION_BINDING);
            protocolMarshaller.marshall(awsApiGatewayStageDetails.getAccessLogSettings(), ACCESSLOGSETTINGS_BINDING);
            protocolMarshaller.marshall(awsApiGatewayStageDetails.getCanarySettings(), CANARYSETTINGS_BINDING);
            protocolMarshaller.marshall(awsApiGatewayStageDetails.getTracingEnabled(), TRACINGENABLED_BINDING);
            protocolMarshaller.marshall(awsApiGatewayStageDetails.getCreatedDate(), CREATEDDATE_BINDING);
            protocolMarshaller.marshall(awsApiGatewayStageDetails.getLastUpdatedDate(), LASTUPDATEDDATE_BINDING);
            protocolMarshaller.marshall(awsApiGatewayStageDetails.getWebAclArn(), WEBACLARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
