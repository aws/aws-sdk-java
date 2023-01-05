/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsS3BucketWebsiteConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsS3BucketWebsiteConfigurationMarshaller {

    private static final MarshallingInfo<String> ERRORDOCUMENT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ErrorDocument").build();
    private static final MarshallingInfo<String> INDEXDOCUMENTSUFFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IndexDocumentSuffix").build();
    private static final MarshallingInfo<StructuredPojo> REDIRECTALLREQUESTSTO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RedirectAllRequestsTo").build();
    private static final MarshallingInfo<List> ROUTINGRULES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoutingRules").build();

    private static final AwsS3BucketWebsiteConfigurationMarshaller instance = new AwsS3BucketWebsiteConfigurationMarshaller();

    public static AwsS3BucketWebsiteConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsS3BucketWebsiteConfiguration awsS3BucketWebsiteConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (awsS3BucketWebsiteConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsS3BucketWebsiteConfiguration.getErrorDocument(), ERRORDOCUMENT_BINDING);
            protocolMarshaller.marshall(awsS3BucketWebsiteConfiguration.getIndexDocumentSuffix(), INDEXDOCUMENTSUFFIX_BINDING);
            protocolMarshaller.marshall(awsS3BucketWebsiteConfiguration.getRedirectAllRequestsTo(), REDIRECTALLREQUESTSTO_BINDING);
            protocolMarshaller.marshall(awsS3BucketWebsiteConfiguration.getRoutingRules(), ROUTINGRULES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
