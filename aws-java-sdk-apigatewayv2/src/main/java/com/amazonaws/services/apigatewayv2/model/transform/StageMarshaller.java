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
package com.amazonaws.services.apigatewayv2.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apigatewayv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StageMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StageMarshaller {

    private static final MarshallingInfo<StructuredPojo> ACCESSLOGSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("accessLogSettings").build();
    private static final MarshallingInfo<String> CLIENTCERTIFICATEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientCertificateId").build();
    private static final MarshallingInfo<java.util.Date> CREATEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdDate").timestampFormat("iso8601").build();
    private static final MarshallingInfo<StructuredPojo> DEFAULTROUTESETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("defaultRouteSettings").build();
    private static final MarshallingInfo<String> DEPLOYMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deploymentId").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdatedDate").timestampFormat("iso8601").build();
    private static final MarshallingInfo<Map> ROUTESETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("routeSettings").build();
    private static final MarshallingInfo<String> STAGENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("stageName").build();
    private static final MarshallingInfo<Map> STAGEVARIABLES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("stageVariables").build();

    private static final StageMarshaller instance = new StageMarshaller();

    public static StageMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Stage stage, ProtocolMarshaller protocolMarshaller) {

        if (stage == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(stage.getAccessLogSettings(), ACCESSLOGSETTINGS_BINDING);
            protocolMarshaller.marshall(stage.getClientCertificateId(), CLIENTCERTIFICATEID_BINDING);
            protocolMarshaller.marshall(stage.getCreatedDate(), CREATEDDATE_BINDING);
            protocolMarshaller.marshall(stage.getDefaultRouteSettings(), DEFAULTROUTESETTINGS_BINDING);
            protocolMarshaller.marshall(stage.getDeploymentId(), DEPLOYMENTID_BINDING);
            protocolMarshaller.marshall(stage.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(stage.getLastUpdatedDate(), LASTUPDATEDDATE_BINDING);
            protocolMarshaller.marshall(stage.getRouteSettings(), ROUTESETTINGS_BINDING);
            protocolMarshaller.marshall(stage.getStageName(), STAGENAME_BINDING);
            protocolMarshaller.marshall(stage.getStageVariables(), STAGEVARIABLES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
