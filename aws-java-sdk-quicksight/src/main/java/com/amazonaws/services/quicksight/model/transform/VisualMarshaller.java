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
package com.amazonaws.services.quicksight.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.quicksight.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * VisualMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class VisualMarshaller {

    private static final MarshallingInfo<StructuredPojo> TABLEVISUAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TableVisual").build();
    private static final MarshallingInfo<StructuredPojo> PIVOTTABLEVISUAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PivotTableVisual").build();
    private static final MarshallingInfo<StructuredPojo> BARCHARTVISUAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BarChartVisual").build();
    private static final MarshallingInfo<StructuredPojo> KPIVISUAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("KPIVisual").build();
    private static final MarshallingInfo<StructuredPojo> PIECHARTVISUAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PieChartVisual").build();
    private static final MarshallingInfo<StructuredPojo> GAUGECHARTVISUAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GaugeChartVisual").build();
    private static final MarshallingInfo<StructuredPojo> LINECHARTVISUAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LineChartVisual").build();
    private static final MarshallingInfo<StructuredPojo> HEATMAPVISUAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HeatMapVisual").build();
    private static final MarshallingInfo<StructuredPojo> TREEMAPVISUAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TreeMapVisual").build();
    private static final MarshallingInfo<StructuredPojo> GEOSPATIALMAPVISUAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GeospatialMapVisual").build();
    private static final MarshallingInfo<StructuredPojo> FILLEDMAPVISUAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FilledMapVisual").build();
    private static final MarshallingInfo<StructuredPojo> FUNNELCHARTVISUAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FunnelChartVisual").build();
    private static final MarshallingInfo<StructuredPojo> SCATTERPLOTVISUAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScatterPlotVisual").build();
    private static final MarshallingInfo<StructuredPojo> COMBOCHARTVISUAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComboChartVisual").build();
    private static final MarshallingInfo<StructuredPojo> BOXPLOTVISUAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BoxPlotVisual").build();
    private static final MarshallingInfo<StructuredPojo> WATERFALLVISUAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WaterfallVisual").build();
    private static final MarshallingInfo<StructuredPojo> HISTOGRAMVISUAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HistogramVisual").build();
    private static final MarshallingInfo<StructuredPojo> WORDCLOUDVISUAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("WordCloudVisual").build();
    private static final MarshallingInfo<StructuredPojo> INSIGHTVISUAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InsightVisual").build();
    private static final MarshallingInfo<StructuredPojo> SANKEYDIAGRAMVISUAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SankeyDiagramVisual").build();
    private static final MarshallingInfo<StructuredPojo> CUSTOMCONTENTVISUAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CustomContentVisual").build();
    private static final MarshallingInfo<StructuredPojo> EMPTYVISUAL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EmptyVisual").build();

    private static final VisualMarshaller instance = new VisualMarshaller();

    public static VisualMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Visual visual, ProtocolMarshaller protocolMarshaller) {

        if (visual == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(visual.getTableVisual(), TABLEVISUAL_BINDING);
            protocolMarshaller.marshall(visual.getPivotTableVisual(), PIVOTTABLEVISUAL_BINDING);
            protocolMarshaller.marshall(visual.getBarChartVisual(), BARCHARTVISUAL_BINDING);
            protocolMarshaller.marshall(visual.getKPIVisual(), KPIVISUAL_BINDING);
            protocolMarshaller.marshall(visual.getPieChartVisual(), PIECHARTVISUAL_BINDING);
            protocolMarshaller.marshall(visual.getGaugeChartVisual(), GAUGECHARTVISUAL_BINDING);
            protocolMarshaller.marshall(visual.getLineChartVisual(), LINECHARTVISUAL_BINDING);
            protocolMarshaller.marshall(visual.getHeatMapVisual(), HEATMAPVISUAL_BINDING);
            protocolMarshaller.marshall(visual.getTreeMapVisual(), TREEMAPVISUAL_BINDING);
            protocolMarshaller.marshall(visual.getGeospatialMapVisual(), GEOSPATIALMAPVISUAL_BINDING);
            protocolMarshaller.marshall(visual.getFilledMapVisual(), FILLEDMAPVISUAL_BINDING);
            protocolMarshaller.marshall(visual.getFunnelChartVisual(), FUNNELCHARTVISUAL_BINDING);
            protocolMarshaller.marshall(visual.getScatterPlotVisual(), SCATTERPLOTVISUAL_BINDING);
            protocolMarshaller.marshall(visual.getComboChartVisual(), COMBOCHARTVISUAL_BINDING);
            protocolMarshaller.marshall(visual.getBoxPlotVisual(), BOXPLOTVISUAL_BINDING);
            protocolMarshaller.marshall(visual.getWaterfallVisual(), WATERFALLVISUAL_BINDING);
            protocolMarshaller.marshall(visual.getHistogramVisual(), HISTOGRAMVISUAL_BINDING);
            protocolMarshaller.marshall(visual.getWordCloudVisual(), WORDCLOUDVISUAL_BINDING);
            protocolMarshaller.marshall(visual.getInsightVisual(), INSIGHTVISUAL_BINDING);
            protocolMarshaller.marshall(visual.getSankeyDiagramVisual(), SANKEYDIAGRAMVISUAL_BINDING);
            protocolMarshaller.marshall(visual.getCustomContentVisual(), CUSTOMCONTENTVISUAL_BINDING);
            protocolMarshaller.marshall(visual.getEmptyVisual(), EMPTYVISUAL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
