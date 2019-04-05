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
package com.amazonaws.services.glue.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glue.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CrawlerMetricsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CrawlerMetricsMarshaller {

    private static final MarshallingInfo<String> CRAWLERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CrawlerName").build();
    private static final MarshallingInfo<Double> TIMELEFTSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TimeLeftSeconds").build();
    private static final MarshallingInfo<Boolean> STILLESTIMATING_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StillEstimating").build();
    private static final MarshallingInfo<Double> LASTRUNTIMESECONDS_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastRuntimeSeconds").build();
    private static final MarshallingInfo<Double> MEDIANRUNTIMESECONDS_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MedianRuntimeSeconds").build();
    private static final MarshallingInfo<Integer> TABLESCREATED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TablesCreated").build();
    private static final MarshallingInfo<Integer> TABLESUPDATED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TablesUpdated").build();
    private static final MarshallingInfo<Integer> TABLESDELETED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TablesDeleted").build();

    private static final CrawlerMetricsMarshaller instance = new CrawlerMetricsMarshaller();

    public static CrawlerMetricsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CrawlerMetrics crawlerMetrics, ProtocolMarshaller protocolMarshaller) {

        if (crawlerMetrics == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(crawlerMetrics.getCrawlerName(), CRAWLERNAME_BINDING);
            protocolMarshaller.marshall(crawlerMetrics.getTimeLeftSeconds(), TIMELEFTSECONDS_BINDING);
            protocolMarshaller.marshall(crawlerMetrics.getStillEstimating(), STILLESTIMATING_BINDING);
            protocolMarshaller.marshall(crawlerMetrics.getLastRuntimeSeconds(), LASTRUNTIMESECONDS_BINDING);
            protocolMarshaller.marshall(crawlerMetrics.getMedianRuntimeSeconds(), MEDIANRUNTIMESECONDS_BINDING);
            protocolMarshaller.marshall(crawlerMetrics.getTablesCreated(), TABLESCREATED_BINDING);
            protocolMarshaller.marshall(crawlerMetrics.getTablesUpdated(), TABLESUPDATED_BINDING);
            protocolMarshaller.marshall(crawlerMetrics.getTablesDeleted(), TABLESDELETED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
