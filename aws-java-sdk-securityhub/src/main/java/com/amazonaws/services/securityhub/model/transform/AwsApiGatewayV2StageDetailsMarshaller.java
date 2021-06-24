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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsApiGatewayV2StageDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsApiGatewayV2StageDetailsMarshaller {

    private static final MarshallingInfo<String> CLIENTCERTIFICATEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientCertificateId").build();
    private static final MarshallingInfo<String> CREATEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedDate").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<StructuredPojo> DEFAULTROUTESETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultRouteSettings").build();
    private static final MarshallingInfo<String> DEPLOYMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeploymentId").build();
    private static final MarshallingInfo<String> LASTUPDATEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastUpdatedDate").build();
    private static final MarshallingInfo<StructuredPojo> ROUTESETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RouteSettings").build();
    private static final MarshallingInfo<String> STAGENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StageName").build();
    private static final MarshallingInfo<Map> STAGEVARIABLES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("StageVariables").build();
    private static final MarshallingInfo<StructuredPojo> ACCESSLOGSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AccessLogSettings").build();
    private static final MarshallingInfo<Boolean> AUTODEPLOY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AutoDeploy").build();
    private static final MarshallingInfo<String> LASTDEPLOYMENTSTATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastDeploymentStatusMessage").build();
    private static final MarshallingInfo<Boolean> APIGATEWAYMANAGED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApiGatewayManaged").build();

    private static final AwsApiGatewayV2StageDetailsMarshaller instance = new AwsApiGatewayV2StageDetailsMarshaller();

    public static AwsApiGatewayV2StageDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsApiGatewayV2StageDetails awsApiGatewayV2StageDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsApiGatewayV2StageDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsApiGatewayV2StageDetails.getClientCertificateId(), CLIENTCERTIFICATEID_BINDING);
            protocolMarshaller.marshall(awsApiGatewayV2StageDetails.getCreatedDate(), CREATEDDATE_BINDING);
            protocolMarshaller.marshall(awsApiGatewayV2StageDetails.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(awsApiGatewayV2StageDetails.getDefaultRouteSettings(), DEFAULTROUTESETTINGS_BINDING);
            protocolMarshaller.marshall(awsApiGatewayV2StageDetails.getDeploymentId(), DEPLOYMENTID_BINDING);
            protocolMarshaller.marshall(awsApiGatewayV2StageDetails.getLastUpdatedDate(), LASTUPDATEDDATE_BINDING);
            protocolMarshaller.marshall(awsApiGatewayV2StageDetails.getRouteSettings(), ROUTESETTINGS_BINDING);
            protocolMarshaller.marshall(awsApiGatewayV2StageDetails.getStageName(), STAGENAME_BINDING);
            protocolMarshaller.marshall(awsApiGatewayV2StageDetails.getStageVariables(), STAGEVARIABLES_BINDING);
            protocolMarshaller.marshall(awsApiGatewayV2StageDetails.getAccessLogSettings(), ACCESSLOGSETTINGS_BINDING);
            protocolMarshaller.marshall(awsApiGatewayV2StageDetails.getAutoDeploy(), AUTODEPLOY_BINDING);
            protocolMarshaller.marshall(awsApiGatewayV2StageDetails.getLastDeploymentStatusMessage(), LASTDEPLOYMENTSTATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(awsApiGatewayV2StageDetails.getApiGatewayManaged(), APIGATEWAYMANAGED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
