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
package com.amazonaws.services.apigateway.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apigateway.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StageMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StageMarshaller {

    private static final MarshallingInfo<String> DEPLOYMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deploymentId").build();
    private static final MarshallingInfo<String> CLIENTCERTIFICATEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientCertificateId").build();
    private static final MarshallingInfo<String> STAGENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("stageName").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<Boolean> CACHECLUSTERENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cacheClusterEnabled").build();
    private static final MarshallingInfo<String> CACHECLUSTERSIZE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cacheClusterSize").build();
    private static final MarshallingInfo<String> CACHECLUSTERSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cacheClusterStatus").build();
    private static final MarshallingInfo<Map> METHODSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("methodSettings").build();
    private static final MarshallingInfo<Map> VARIABLES_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("variables").build();
    private static final MarshallingInfo<String> DOCUMENTATIONVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("documentationVersion").build();
    private static final MarshallingInfo<StructuredPojo> ACCESSLOGSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("accessLogSettings").build();
    private static final MarshallingInfo<StructuredPojo> CANARYSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("canarySettings").build();
    private static final MarshallingInfo<Boolean> TRACINGENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("tracingEnabled").build();
    private static final MarshallingInfo<String> WEBACLARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("webAclArn").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<java.util.Date> CREATEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdatedDate").timestampFormat("unixTimestamp").build();

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
            protocolMarshaller.marshall(stage.getDeploymentId(), DEPLOYMENTID_BINDING);
            protocolMarshaller.marshall(stage.getClientCertificateId(), CLIENTCERTIFICATEID_BINDING);
            protocolMarshaller.marshall(stage.getStageName(), STAGENAME_BINDING);
            protocolMarshaller.marshall(stage.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(stage.getCacheClusterEnabled(), CACHECLUSTERENABLED_BINDING);
            protocolMarshaller.marshall(stage.getCacheClusterSize(), CACHECLUSTERSIZE_BINDING);
            protocolMarshaller.marshall(stage.getCacheClusterStatus(), CACHECLUSTERSTATUS_BINDING);
            protocolMarshaller.marshall(stage.getMethodSettings(), METHODSETTINGS_BINDING);
            protocolMarshaller.marshall(stage.getVariables(), VARIABLES_BINDING);
            protocolMarshaller.marshall(stage.getDocumentationVersion(), DOCUMENTATIONVERSION_BINDING);
            protocolMarshaller.marshall(stage.getAccessLogSettings(), ACCESSLOGSETTINGS_BINDING);
            protocolMarshaller.marshall(stage.getCanarySettings(), CANARYSETTINGS_BINDING);
            protocolMarshaller.marshall(stage.getTracingEnabled(), TRACINGENABLED_BINDING);
            protocolMarshaller.marshall(stage.getWebAclArn(), WEBACLARN_BINDING);
            protocolMarshaller.marshall(stage.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(stage.getCreatedDate(), CREATEDDATE_BINDING);
            protocolMarshaller.marshall(stage.getLastUpdatedDate(), LASTUPDATEDDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
