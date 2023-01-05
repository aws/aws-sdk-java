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
package com.amazonaws.services.sagemakergeospatial.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemakergeospatial.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetTileRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetTileRequestMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.QUERY_PARAM)
            .marshallLocationName("Arn").build();
    private static final MarshallingInfo<List> IMAGEASSETS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("ImageAssets").build();
    private static final MarshallingInfo<Boolean> IMAGEMASK_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("ImageMask").build();
    private static final MarshallingInfo<String> OUTPUTDATATYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("OutputDataType").build();
    private static final MarshallingInfo<String> OUTPUTFORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("OutputFormat").build();
    private static final MarshallingInfo<String> PROPERTYFILTERS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("PropertyFilters").build();
    private static final MarshallingInfo<String> TARGET_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("Target").build();
    private static final MarshallingInfo<String> TIMERANGEFILTER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("TimeRangeFilter").build();
    private static final MarshallingInfo<Integer> X_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("x").build();
    private static final MarshallingInfo<Integer> Y_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("y").build();
    private static final MarshallingInfo<Integer> Z_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("z").build();

    private static final GetTileRequestMarshaller instance = new GetTileRequestMarshaller();

    public static GetTileRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetTileRequest getTileRequest, ProtocolMarshaller protocolMarshaller) {

        if (getTileRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getTileRequest.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(getTileRequest.getImageAssets(), IMAGEASSETS_BINDING);
            protocolMarshaller.marshall(getTileRequest.getImageMask(), IMAGEMASK_BINDING);
            protocolMarshaller.marshall(getTileRequest.getOutputDataType(), OUTPUTDATATYPE_BINDING);
            protocolMarshaller.marshall(getTileRequest.getOutputFormat(), OUTPUTFORMAT_BINDING);
            protocolMarshaller.marshall(getTileRequest.getPropertyFilters(), PROPERTYFILTERS_BINDING);
            protocolMarshaller.marshall(getTileRequest.getTarget(), TARGET_BINDING);
            protocolMarshaller.marshall(getTileRequest.getTimeRangeFilter(), TIMERANGEFILTER_BINDING);
            protocolMarshaller.marshall(getTileRequest.getX(), X_BINDING);
            protocolMarshaller.marshall(getTileRequest.getY(), Y_BINDING);
            protocolMarshaller.marshall(getTileRequest.getZ(), Z_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
