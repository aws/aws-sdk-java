/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ResourceDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ResourceDetailsMarshaller {

    private static final MarshallingInfo<StructuredPojo> AWSCODEBUILDPROJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsCodeBuildProject").build();
    private static final MarshallingInfo<StructuredPojo> AWSCLOUDFRONTDISTRIBUTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsCloudFrontDistribution").build();
    private static final MarshallingInfo<StructuredPojo> AWSEC2INSTANCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsEc2Instance").build();
    private static final MarshallingInfo<StructuredPojo> AWSEC2NETWORKINTERFACE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsEc2NetworkInterface").build();
    private static final MarshallingInfo<StructuredPojo> AWSEC2SECURITYGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsEc2SecurityGroup").build();
    private static final MarshallingInfo<StructuredPojo> AWSELBV2LOADBALANCER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsElbv2LoadBalancer").build();
    private static final MarshallingInfo<StructuredPojo> AWSELASTICSEARCHDOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsElasticsearchDomain").build();
    private static final MarshallingInfo<StructuredPojo> AWSS3BUCKET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsS3Bucket").build();
    private static final MarshallingInfo<StructuredPojo> AWSIAMACCESSKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsIamAccessKey").build();
    private static final MarshallingInfo<StructuredPojo> AWSIAMROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsIamRole").build();
    private static final MarshallingInfo<StructuredPojo> AWSKMSKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsKmsKey").build();
    private static final MarshallingInfo<StructuredPojo> AWSLAMBDAFUNCTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsLambdaFunction").build();
    private static final MarshallingInfo<StructuredPojo> AWSLAMBDALAYERVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsLambdaLayerVersion").build();
    private static final MarshallingInfo<StructuredPojo> AWSRDSDBINSTANCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsRdsDbInstance").build();
    private static final MarshallingInfo<StructuredPojo> AWSSNSTOPIC_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsSnsTopic").build();
    private static final MarshallingInfo<StructuredPojo> AWSSQSQUEUE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsSqsQueue").build();
    private static final MarshallingInfo<StructuredPojo> AWSWAFWEBACL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AwsWafWebAcl").build();
    private static final MarshallingInfo<StructuredPojo> CONTAINER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Container").build();
    private static final MarshallingInfo<Map> OTHER_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Other").build();

    private static final ResourceDetailsMarshaller instance = new ResourceDetailsMarshaller();

    public static ResourceDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ResourceDetails resourceDetails, ProtocolMarshaller protocolMarshaller) {

        if (resourceDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(resourceDetails.getAwsCodeBuildProject(), AWSCODEBUILDPROJECT_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsCloudFrontDistribution(), AWSCLOUDFRONTDISTRIBUTION_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsEc2Instance(), AWSEC2INSTANCE_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsEc2NetworkInterface(), AWSEC2NETWORKINTERFACE_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsEc2SecurityGroup(), AWSEC2SECURITYGROUP_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsElbv2LoadBalancer(), AWSELBV2LOADBALANCER_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsElasticsearchDomain(), AWSELASTICSEARCHDOMAIN_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsS3Bucket(), AWSS3BUCKET_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsIamAccessKey(), AWSIAMACCESSKEY_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsIamRole(), AWSIAMROLE_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsKmsKey(), AWSKMSKEY_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsLambdaFunction(), AWSLAMBDAFUNCTION_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsLambdaLayerVersion(), AWSLAMBDALAYERVERSION_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsRdsDbInstance(), AWSRDSDBINSTANCE_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsSnsTopic(), AWSSNSTOPIC_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsSqsQueue(), AWSSQSQUEUE_BINDING);
            protocolMarshaller.marshall(resourceDetails.getAwsWafWebAcl(), AWSWAFWEBACL_BINDING);
            protocolMarshaller.marshall(resourceDetails.getContainer(), CONTAINER_BINDING);
            protocolMarshaller.marshall(resourceDetails.getOther(), OTHER_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
