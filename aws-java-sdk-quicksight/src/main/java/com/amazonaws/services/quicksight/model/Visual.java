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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A visual displayed on a sheet in an analysis, dashboard, or template.
 * </p>
 * <p>
 * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/Visual" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Visual implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A table visual.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/tabular.html">Using tables
     * as visuals</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     */
    private TableVisual tableVisual;
    /**
     * <p>
     * A pivot table.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/pivot-table.html">Using
     * pivot tables</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     */
    private PivotTableVisual pivotTableVisual;
    /**
     * <p>
     * A bar chart.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/bar-charts.html">Using bar
     * charts</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     */
    private BarChartVisual barChartVisual;
    /**
     * <p>
     * A key performance indicator (KPI).
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/kpi.html">Using KPIs</a> in
     * the <i>Amazon QuickSight User Guide</i>.
     * </p>
     */
    private KPIVisual kPIVisual;
    /**
     * <p>
     * A pie or donut chart.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/pie-chart.html">Using pie
     * charts</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     */
    private PieChartVisual pieChartVisual;
    /**
     * <p>
     * A gauge chart.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/gauge-chart.html">Using
     * gauge charts</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     */
    private GaugeChartVisual gaugeChartVisual;
    /**
     * <p>
     * A line chart.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/line-charts.html">Using
     * line charts</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     */
    private LineChartVisual lineChartVisual;
    /**
     * <p>
     * A heat map.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/heat-map.html">Using heat
     * maps</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     */
    private HeatMapVisual heatMapVisual;
    /**
     * <p>
     * A tree map.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/tree-map.html">Using tree
     * maps</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     */
    private TreeMapVisual treeMapVisual;
    /**
     * <p>
     * A geospatial map or a points on map visual.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/point-maps.html">Creating
     * point maps</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     */
    private GeospatialMapVisual geospatialMapVisual;
    /**
     * <p>
     * A filled map.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/filled-maps.html">Creating
     * filled maps</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     */
    private FilledMapVisual filledMapVisual;
    /**
     * <p>
     * A funnel chart.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/funnel-visual-content.html">Using funnel charts</a> in
     * the <i>Amazon QuickSight User Guide</i>.
     * </p>
     */
    private FunnelChartVisual funnelChartVisual;
    /**
     * <p>
     * A scatter plot.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/scatter-plot.html">Using
     * scatter plots</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     */
    private ScatterPlotVisual scatterPlotVisual;
    /**
     * <p>
     * A combo chart.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/combo-charts.html">Using
     * combo charts</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     */
    private ComboChartVisual comboChartVisual;
    /**
     * <p>
     * A box plot.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/box-plots.html">Using box
     * plots</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     */
    private BoxPlotVisual boxPlotVisual;
    /**
     * <p>
     * A waterfall chart.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/waterfall-chart.html">Using
     * waterfall charts</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     */
    private WaterfallVisual waterfallVisual;
    /**
     * <p>
     * A histogram.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/histogram-charts.html">Using histograms</a> in the
     * <i>Amazon QuickSight User Guide</i>.
     * </p>
     */
    private HistogramVisual histogramVisual;
    /**
     * <p>
     * A word cloud.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/word-cloud.html">Using word
     * clouds</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     */
    private WordCloudVisual wordCloudVisual;
    /**
     * <p>
     * An insight visual.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/computational-insights.html">Working with insights</a>
     * in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     */
    private InsightVisual insightVisual;
    /**
     * <p>
     * A sankey diagram.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/sankey-diagram.html">Using
     * Sankey diagrams</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     */
    private SankeyDiagramVisual sankeyDiagramVisual;
    /**
     * <p>
     * A visual that contains custom content.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/custom-visual-content.html">Using custom visual
     * content</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     */
    private CustomContentVisual customContentVisual;
    /**
     * <p>
     * An empty visual.
     * </p>
     */
    private EmptyVisual emptyVisual;

    /**
     * <p>
     * A table visual.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/tabular.html">Using tables
     * as visuals</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param tableVisual
     *        A table visual.</p>
     *        <p>
     *        For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/tabular.html">Using
     *        tables as visuals</a> in the <i>Amazon QuickSight User Guide</i>.
     */

    public void setTableVisual(TableVisual tableVisual) {
        this.tableVisual = tableVisual;
    }

    /**
     * <p>
     * A table visual.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/tabular.html">Using tables
     * as visuals</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @return A table visual.</p>
     *         <p>
     *         For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/tabular.html">Using
     *         tables as visuals</a> in the <i>Amazon QuickSight User Guide</i>.
     */

    public TableVisual getTableVisual() {
        return this.tableVisual;
    }

    /**
     * <p>
     * A table visual.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/tabular.html">Using tables
     * as visuals</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param tableVisual
     *        A table visual.</p>
     *        <p>
     *        For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/tabular.html">Using
     *        tables as visuals</a> in the <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Visual withTableVisual(TableVisual tableVisual) {
        setTableVisual(tableVisual);
        return this;
    }

    /**
     * <p>
     * A pivot table.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/pivot-table.html">Using
     * pivot tables</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param pivotTableVisual
     *        A pivot table.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/pivot-table.html">Using pivot tables</a> in the
     *        <i>Amazon QuickSight User Guide</i>.
     */

    public void setPivotTableVisual(PivotTableVisual pivotTableVisual) {
        this.pivotTableVisual = pivotTableVisual;
    }

    /**
     * <p>
     * A pivot table.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/pivot-table.html">Using
     * pivot tables</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @return A pivot table.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/pivot-table.html">Using pivot tables</a> in the
     *         <i>Amazon QuickSight User Guide</i>.
     */

    public PivotTableVisual getPivotTableVisual() {
        return this.pivotTableVisual;
    }

    /**
     * <p>
     * A pivot table.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/pivot-table.html">Using
     * pivot tables</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param pivotTableVisual
     *        A pivot table.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/pivot-table.html">Using pivot tables</a> in the
     *        <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Visual withPivotTableVisual(PivotTableVisual pivotTableVisual) {
        setPivotTableVisual(pivotTableVisual);
        return this;
    }

    /**
     * <p>
     * A bar chart.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/bar-charts.html">Using bar
     * charts</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param barChartVisual
     *        A bar chart.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/bar-charts.html">Using bar charts</a> in the
     *        <i>Amazon QuickSight User Guide</i>.
     */

    public void setBarChartVisual(BarChartVisual barChartVisual) {
        this.barChartVisual = barChartVisual;
    }

    /**
     * <p>
     * A bar chart.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/bar-charts.html">Using bar
     * charts</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @return A bar chart.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/bar-charts.html">Using bar charts</a> in the
     *         <i>Amazon QuickSight User Guide</i>.
     */

    public BarChartVisual getBarChartVisual() {
        return this.barChartVisual;
    }

    /**
     * <p>
     * A bar chart.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/bar-charts.html">Using bar
     * charts</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param barChartVisual
     *        A bar chart.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/bar-charts.html">Using bar charts</a> in the
     *        <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Visual withBarChartVisual(BarChartVisual barChartVisual) {
        setBarChartVisual(barChartVisual);
        return this;
    }

    /**
     * <p>
     * A key performance indicator (KPI).
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/kpi.html">Using KPIs</a> in
     * the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param kPIVisual
     *        A key performance indicator (KPI).</p>
     *        <p>
     *        For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/kpi.html">Using
     *        KPIs</a> in the <i>Amazon QuickSight User Guide</i>.
     */

    public void setKPIVisual(KPIVisual kPIVisual) {
        this.kPIVisual = kPIVisual;
    }

    /**
     * <p>
     * A key performance indicator (KPI).
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/kpi.html">Using KPIs</a> in
     * the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @return A key performance indicator (KPI).</p>
     *         <p>
     *         For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/kpi.html">Using
     *         KPIs</a> in the <i>Amazon QuickSight User Guide</i>.
     */

    public KPIVisual getKPIVisual() {
        return this.kPIVisual;
    }

    /**
     * <p>
     * A key performance indicator (KPI).
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/kpi.html">Using KPIs</a> in
     * the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param kPIVisual
     *        A key performance indicator (KPI).</p>
     *        <p>
     *        For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/kpi.html">Using
     *        KPIs</a> in the <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Visual withKPIVisual(KPIVisual kPIVisual) {
        setKPIVisual(kPIVisual);
        return this;
    }

    /**
     * <p>
     * A pie or donut chart.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/pie-chart.html">Using pie
     * charts</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param pieChartVisual
     *        A pie or donut chart.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/pie-chart.html">Using pie charts</a> in the
     *        <i>Amazon QuickSight User Guide</i>.
     */

    public void setPieChartVisual(PieChartVisual pieChartVisual) {
        this.pieChartVisual = pieChartVisual;
    }

    /**
     * <p>
     * A pie or donut chart.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/pie-chart.html">Using pie
     * charts</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @return A pie or donut chart.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/pie-chart.html">Using pie charts</a> in the
     *         <i>Amazon QuickSight User Guide</i>.
     */

    public PieChartVisual getPieChartVisual() {
        return this.pieChartVisual;
    }

    /**
     * <p>
     * A pie or donut chart.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/pie-chart.html">Using pie
     * charts</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param pieChartVisual
     *        A pie or donut chart.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/pie-chart.html">Using pie charts</a> in the
     *        <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Visual withPieChartVisual(PieChartVisual pieChartVisual) {
        setPieChartVisual(pieChartVisual);
        return this;
    }

    /**
     * <p>
     * A gauge chart.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/gauge-chart.html">Using
     * gauge charts</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param gaugeChartVisual
     *        A gauge chart.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/gauge-chart.html">Using gauge charts</a> in the
     *        <i>Amazon QuickSight User Guide</i>.
     */

    public void setGaugeChartVisual(GaugeChartVisual gaugeChartVisual) {
        this.gaugeChartVisual = gaugeChartVisual;
    }

    /**
     * <p>
     * A gauge chart.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/gauge-chart.html">Using
     * gauge charts</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @return A gauge chart.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/gauge-chart.html">Using gauge charts</a> in the
     *         <i>Amazon QuickSight User Guide</i>.
     */

    public GaugeChartVisual getGaugeChartVisual() {
        return this.gaugeChartVisual;
    }

    /**
     * <p>
     * A gauge chart.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/gauge-chart.html">Using
     * gauge charts</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param gaugeChartVisual
     *        A gauge chart.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/gauge-chart.html">Using gauge charts</a> in the
     *        <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Visual withGaugeChartVisual(GaugeChartVisual gaugeChartVisual) {
        setGaugeChartVisual(gaugeChartVisual);
        return this;
    }

    /**
     * <p>
     * A line chart.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/line-charts.html">Using
     * line charts</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param lineChartVisual
     *        A line chart.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/line-charts.html">Using line charts</a> in the
     *        <i>Amazon QuickSight User Guide</i>.
     */

    public void setLineChartVisual(LineChartVisual lineChartVisual) {
        this.lineChartVisual = lineChartVisual;
    }

    /**
     * <p>
     * A line chart.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/line-charts.html">Using
     * line charts</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @return A line chart.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/line-charts.html">Using line charts</a> in the
     *         <i>Amazon QuickSight User Guide</i>.
     */

    public LineChartVisual getLineChartVisual() {
        return this.lineChartVisual;
    }

    /**
     * <p>
     * A line chart.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/line-charts.html">Using
     * line charts</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param lineChartVisual
     *        A line chart.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/line-charts.html">Using line charts</a> in the
     *        <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Visual withLineChartVisual(LineChartVisual lineChartVisual) {
        setLineChartVisual(lineChartVisual);
        return this;
    }

    /**
     * <p>
     * A heat map.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/heat-map.html">Using heat
     * maps</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param heatMapVisual
     *        A heat map.</p>
     *        <p>
     *        For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/heat-map.html">Using
     *        heat maps</a> in the <i>Amazon QuickSight User Guide</i>.
     */

    public void setHeatMapVisual(HeatMapVisual heatMapVisual) {
        this.heatMapVisual = heatMapVisual;
    }

    /**
     * <p>
     * A heat map.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/heat-map.html">Using heat
     * maps</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @return A heat map.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/heat-map.html">Using heat maps</a> in the
     *         <i>Amazon QuickSight User Guide</i>.
     */

    public HeatMapVisual getHeatMapVisual() {
        return this.heatMapVisual;
    }

    /**
     * <p>
     * A heat map.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/heat-map.html">Using heat
     * maps</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param heatMapVisual
     *        A heat map.</p>
     *        <p>
     *        For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/heat-map.html">Using
     *        heat maps</a> in the <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Visual withHeatMapVisual(HeatMapVisual heatMapVisual) {
        setHeatMapVisual(heatMapVisual);
        return this;
    }

    /**
     * <p>
     * A tree map.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/tree-map.html">Using tree
     * maps</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param treeMapVisual
     *        A tree map.</p>
     *        <p>
     *        For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/tree-map.html">Using
     *        tree maps</a> in the <i>Amazon QuickSight User Guide</i>.
     */

    public void setTreeMapVisual(TreeMapVisual treeMapVisual) {
        this.treeMapVisual = treeMapVisual;
    }

    /**
     * <p>
     * A tree map.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/tree-map.html">Using tree
     * maps</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @return A tree map.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/tree-map.html">Using tree maps</a> in the
     *         <i>Amazon QuickSight User Guide</i>.
     */

    public TreeMapVisual getTreeMapVisual() {
        return this.treeMapVisual;
    }

    /**
     * <p>
     * A tree map.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/tree-map.html">Using tree
     * maps</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param treeMapVisual
     *        A tree map.</p>
     *        <p>
     *        For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/tree-map.html">Using
     *        tree maps</a> in the <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Visual withTreeMapVisual(TreeMapVisual treeMapVisual) {
        setTreeMapVisual(treeMapVisual);
        return this;
    }

    /**
     * <p>
     * A geospatial map or a points on map visual.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/point-maps.html">Creating
     * point maps</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param geospatialMapVisual
     *        A geospatial map or a points on map visual.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/point-maps.html">Creating point maps</a> in the
     *        <i>Amazon QuickSight User Guide</i>.
     */

    public void setGeospatialMapVisual(GeospatialMapVisual geospatialMapVisual) {
        this.geospatialMapVisual = geospatialMapVisual;
    }

    /**
     * <p>
     * A geospatial map or a points on map visual.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/point-maps.html">Creating
     * point maps</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @return A geospatial map or a points on map visual.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/point-maps.html">Creating point maps</a> in the
     *         <i>Amazon QuickSight User Guide</i>.
     */

    public GeospatialMapVisual getGeospatialMapVisual() {
        return this.geospatialMapVisual;
    }

    /**
     * <p>
     * A geospatial map or a points on map visual.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/point-maps.html">Creating
     * point maps</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param geospatialMapVisual
     *        A geospatial map or a points on map visual.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/point-maps.html">Creating point maps</a> in the
     *        <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Visual withGeospatialMapVisual(GeospatialMapVisual geospatialMapVisual) {
        setGeospatialMapVisual(geospatialMapVisual);
        return this;
    }

    /**
     * <p>
     * A filled map.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/filled-maps.html">Creating
     * filled maps</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param filledMapVisual
     *        A filled map.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/filled-maps.html">Creating filled maps</a> in the
     *        <i>Amazon QuickSight User Guide</i>.
     */

    public void setFilledMapVisual(FilledMapVisual filledMapVisual) {
        this.filledMapVisual = filledMapVisual;
    }

    /**
     * <p>
     * A filled map.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/filled-maps.html">Creating
     * filled maps</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @return A filled map.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/filled-maps.html">Creating filled maps</a> in
     *         the <i>Amazon QuickSight User Guide</i>.
     */

    public FilledMapVisual getFilledMapVisual() {
        return this.filledMapVisual;
    }

    /**
     * <p>
     * A filled map.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/filled-maps.html">Creating
     * filled maps</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param filledMapVisual
     *        A filled map.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/filled-maps.html">Creating filled maps</a> in the
     *        <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Visual withFilledMapVisual(FilledMapVisual filledMapVisual) {
        setFilledMapVisual(filledMapVisual);
        return this;
    }

    /**
     * <p>
     * A funnel chart.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/funnel-visual-content.html">Using funnel charts</a> in
     * the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param funnelChartVisual
     *        A funnel chart.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/funnel-visual-content.html">Using funnel
     *        charts</a> in the <i>Amazon QuickSight User Guide</i>.
     */

    public void setFunnelChartVisual(FunnelChartVisual funnelChartVisual) {
        this.funnelChartVisual = funnelChartVisual;
    }

    /**
     * <p>
     * A funnel chart.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/funnel-visual-content.html">Using funnel charts</a> in
     * the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @return A funnel chart.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/funnel-visual-content.html">Using funnel
     *         charts</a> in the <i>Amazon QuickSight User Guide</i>.
     */

    public FunnelChartVisual getFunnelChartVisual() {
        return this.funnelChartVisual;
    }

    /**
     * <p>
     * A funnel chart.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/funnel-visual-content.html">Using funnel charts</a> in
     * the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param funnelChartVisual
     *        A funnel chart.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/funnel-visual-content.html">Using funnel
     *        charts</a> in the <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Visual withFunnelChartVisual(FunnelChartVisual funnelChartVisual) {
        setFunnelChartVisual(funnelChartVisual);
        return this;
    }

    /**
     * <p>
     * A scatter plot.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/scatter-plot.html">Using
     * scatter plots</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param scatterPlotVisual
     *        A scatter plot.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/scatter-plot.html">Using scatter plots</a> in the
     *        <i>Amazon QuickSight User Guide</i>.
     */

    public void setScatterPlotVisual(ScatterPlotVisual scatterPlotVisual) {
        this.scatterPlotVisual = scatterPlotVisual;
    }

    /**
     * <p>
     * A scatter plot.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/scatter-plot.html">Using
     * scatter plots</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @return A scatter plot.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/scatter-plot.html">Using scatter plots</a> in
     *         the <i>Amazon QuickSight User Guide</i>.
     */

    public ScatterPlotVisual getScatterPlotVisual() {
        return this.scatterPlotVisual;
    }

    /**
     * <p>
     * A scatter plot.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/scatter-plot.html">Using
     * scatter plots</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param scatterPlotVisual
     *        A scatter plot.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/scatter-plot.html">Using scatter plots</a> in the
     *        <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Visual withScatterPlotVisual(ScatterPlotVisual scatterPlotVisual) {
        setScatterPlotVisual(scatterPlotVisual);
        return this;
    }

    /**
     * <p>
     * A combo chart.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/combo-charts.html">Using
     * combo charts</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param comboChartVisual
     *        A combo chart.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/combo-charts.html">Using combo charts</a> in the
     *        <i>Amazon QuickSight User Guide</i>.
     */

    public void setComboChartVisual(ComboChartVisual comboChartVisual) {
        this.comboChartVisual = comboChartVisual;
    }

    /**
     * <p>
     * A combo chart.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/combo-charts.html">Using
     * combo charts</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @return A combo chart.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/combo-charts.html">Using combo charts</a> in the
     *         <i>Amazon QuickSight User Guide</i>.
     */

    public ComboChartVisual getComboChartVisual() {
        return this.comboChartVisual;
    }

    /**
     * <p>
     * A combo chart.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/combo-charts.html">Using
     * combo charts</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param comboChartVisual
     *        A combo chart.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/combo-charts.html">Using combo charts</a> in the
     *        <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Visual withComboChartVisual(ComboChartVisual comboChartVisual) {
        setComboChartVisual(comboChartVisual);
        return this;
    }

    /**
     * <p>
     * A box plot.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/box-plots.html">Using box
     * plots</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param boxPlotVisual
     *        A box plot.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/box-plots.html">Using box plots</a> in the
     *        <i>Amazon QuickSight User Guide</i>.
     */

    public void setBoxPlotVisual(BoxPlotVisual boxPlotVisual) {
        this.boxPlotVisual = boxPlotVisual;
    }

    /**
     * <p>
     * A box plot.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/box-plots.html">Using box
     * plots</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @return A box plot.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/box-plots.html">Using box plots</a> in the
     *         <i>Amazon QuickSight User Guide</i>.
     */

    public BoxPlotVisual getBoxPlotVisual() {
        return this.boxPlotVisual;
    }

    /**
     * <p>
     * A box plot.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/box-plots.html">Using box
     * plots</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param boxPlotVisual
     *        A box plot.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/box-plots.html">Using box plots</a> in the
     *        <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Visual withBoxPlotVisual(BoxPlotVisual boxPlotVisual) {
        setBoxPlotVisual(boxPlotVisual);
        return this;
    }

    /**
     * <p>
     * A waterfall chart.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/waterfall-chart.html">Using
     * waterfall charts</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param waterfallVisual
     *        A waterfall chart.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/waterfall-chart.html">Using waterfall charts</a>
     *        in the <i>Amazon QuickSight User Guide</i>.
     */

    public void setWaterfallVisual(WaterfallVisual waterfallVisual) {
        this.waterfallVisual = waterfallVisual;
    }

    /**
     * <p>
     * A waterfall chart.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/waterfall-chart.html">Using
     * waterfall charts</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @return A waterfall chart.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/waterfall-chart.html">Using waterfall charts</a>
     *         in the <i>Amazon QuickSight User Guide</i>.
     */

    public WaterfallVisual getWaterfallVisual() {
        return this.waterfallVisual;
    }

    /**
     * <p>
     * A waterfall chart.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/waterfall-chart.html">Using
     * waterfall charts</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param waterfallVisual
     *        A waterfall chart.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/waterfall-chart.html">Using waterfall charts</a>
     *        in the <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Visual withWaterfallVisual(WaterfallVisual waterfallVisual) {
        setWaterfallVisual(waterfallVisual);
        return this;
    }

    /**
     * <p>
     * A histogram.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/histogram-charts.html">Using histograms</a> in the
     * <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param histogramVisual
     *        A histogram.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/histogram-charts.html">Using histograms</a> in
     *        the <i>Amazon QuickSight User Guide</i>.
     */

    public void setHistogramVisual(HistogramVisual histogramVisual) {
        this.histogramVisual = histogramVisual;
    }

    /**
     * <p>
     * A histogram.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/histogram-charts.html">Using histograms</a> in the
     * <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @return A histogram.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/histogram-charts.html">Using histograms</a> in
     *         the <i>Amazon QuickSight User Guide</i>.
     */

    public HistogramVisual getHistogramVisual() {
        return this.histogramVisual;
    }

    /**
     * <p>
     * A histogram.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/histogram-charts.html">Using histograms</a> in the
     * <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param histogramVisual
     *        A histogram.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/histogram-charts.html">Using histograms</a> in
     *        the <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Visual withHistogramVisual(HistogramVisual histogramVisual) {
        setHistogramVisual(histogramVisual);
        return this;
    }

    /**
     * <p>
     * A word cloud.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/word-cloud.html">Using word
     * clouds</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param wordCloudVisual
     *        A word cloud.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/word-cloud.html">Using word clouds</a> in the
     *        <i>Amazon QuickSight User Guide</i>.
     */

    public void setWordCloudVisual(WordCloudVisual wordCloudVisual) {
        this.wordCloudVisual = wordCloudVisual;
    }

    /**
     * <p>
     * A word cloud.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/word-cloud.html">Using word
     * clouds</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @return A word cloud.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/word-cloud.html">Using word clouds</a> in the
     *         <i>Amazon QuickSight User Guide</i>.
     */

    public WordCloudVisual getWordCloudVisual() {
        return this.wordCloudVisual;
    }

    /**
     * <p>
     * A word cloud.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/word-cloud.html">Using word
     * clouds</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param wordCloudVisual
     *        A word cloud.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/word-cloud.html">Using word clouds</a> in the
     *        <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Visual withWordCloudVisual(WordCloudVisual wordCloudVisual) {
        setWordCloudVisual(wordCloudVisual);
        return this;
    }

    /**
     * <p>
     * An insight visual.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/computational-insights.html">Working with insights</a>
     * in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param insightVisual
     *        An insight visual.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/computational-insights.html">Working with
     *        insights</a> in the <i>Amazon QuickSight User Guide</i>.
     */

    public void setInsightVisual(InsightVisual insightVisual) {
        this.insightVisual = insightVisual;
    }

    /**
     * <p>
     * An insight visual.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/computational-insights.html">Working with insights</a>
     * in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @return An insight visual.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/computational-insights.html">Working with
     *         insights</a> in the <i>Amazon QuickSight User Guide</i>.
     */

    public InsightVisual getInsightVisual() {
        return this.insightVisual;
    }

    /**
     * <p>
     * An insight visual.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/computational-insights.html">Working with insights</a>
     * in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param insightVisual
     *        An insight visual.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/computational-insights.html">Working with
     *        insights</a> in the <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Visual withInsightVisual(InsightVisual insightVisual) {
        setInsightVisual(insightVisual);
        return this;
    }

    /**
     * <p>
     * A sankey diagram.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/sankey-diagram.html">Using
     * Sankey diagrams</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param sankeyDiagramVisual
     *        A sankey diagram.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/sankey-diagram.html">Using Sankey diagrams</a> in
     *        the <i>Amazon QuickSight User Guide</i>.
     */

    public void setSankeyDiagramVisual(SankeyDiagramVisual sankeyDiagramVisual) {
        this.sankeyDiagramVisual = sankeyDiagramVisual;
    }

    /**
     * <p>
     * A sankey diagram.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/sankey-diagram.html">Using
     * Sankey diagrams</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @return A sankey diagram.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/sankey-diagram.html">Using Sankey diagrams</a>
     *         in the <i>Amazon QuickSight User Guide</i>.
     */

    public SankeyDiagramVisual getSankeyDiagramVisual() {
        return this.sankeyDiagramVisual;
    }

    /**
     * <p>
     * A sankey diagram.
     * </p>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/quicksight/latest/user/sankey-diagram.html">Using
     * Sankey diagrams</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param sankeyDiagramVisual
     *        A sankey diagram.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/sankey-diagram.html">Using Sankey diagrams</a> in
     *        the <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Visual withSankeyDiagramVisual(SankeyDiagramVisual sankeyDiagramVisual) {
        setSankeyDiagramVisual(sankeyDiagramVisual);
        return this;
    }

    /**
     * <p>
     * A visual that contains custom content.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/custom-visual-content.html">Using custom visual
     * content</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param customContentVisual
     *        A visual that contains custom content.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/custom-visual-content.html">Using custom visual
     *        content</a> in the <i>Amazon QuickSight User Guide</i>.
     */

    public void setCustomContentVisual(CustomContentVisual customContentVisual) {
        this.customContentVisual = customContentVisual;
    }

    /**
     * <p>
     * A visual that contains custom content.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/custom-visual-content.html">Using custom visual
     * content</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @return A visual that contains custom content.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/custom-visual-content.html">Using custom visual
     *         content</a> in the <i>Amazon QuickSight User Guide</i>.
     */

    public CustomContentVisual getCustomContentVisual() {
        return this.customContentVisual;
    }

    /**
     * <p>
     * A visual that contains custom content.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/custom-visual-content.html">Using custom visual
     * content</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param customContentVisual
     *        A visual that contains custom content.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/custom-visual-content.html">Using custom visual
     *        content</a> in the <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Visual withCustomContentVisual(CustomContentVisual customContentVisual) {
        setCustomContentVisual(customContentVisual);
        return this;
    }

    /**
     * <p>
     * An empty visual.
     * </p>
     * 
     * @param emptyVisual
     *        An empty visual.
     */

    public void setEmptyVisual(EmptyVisual emptyVisual) {
        this.emptyVisual = emptyVisual;
    }

    /**
     * <p>
     * An empty visual.
     * </p>
     * 
     * @return An empty visual.
     */

    public EmptyVisual getEmptyVisual() {
        return this.emptyVisual;
    }

    /**
     * <p>
     * An empty visual.
     * </p>
     * 
     * @param emptyVisual
     *        An empty visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Visual withEmptyVisual(EmptyVisual emptyVisual) {
        setEmptyVisual(emptyVisual);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTableVisual() != null)
            sb.append("TableVisual: ").append(getTableVisual()).append(",");
        if (getPivotTableVisual() != null)
            sb.append("PivotTableVisual: ").append(getPivotTableVisual()).append(",");
        if (getBarChartVisual() != null)
            sb.append("BarChartVisual: ").append(getBarChartVisual()).append(",");
        if (getKPIVisual() != null)
            sb.append("KPIVisual: ").append(getKPIVisual()).append(",");
        if (getPieChartVisual() != null)
            sb.append("PieChartVisual: ").append(getPieChartVisual()).append(",");
        if (getGaugeChartVisual() != null)
            sb.append("GaugeChartVisual: ").append(getGaugeChartVisual()).append(",");
        if (getLineChartVisual() != null)
            sb.append("LineChartVisual: ").append(getLineChartVisual()).append(",");
        if (getHeatMapVisual() != null)
            sb.append("HeatMapVisual: ").append(getHeatMapVisual()).append(",");
        if (getTreeMapVisual() != null)
            sb.append("TreeMapVisual: ").append(getTreeMapVisual()).append(",");
        if (getGeospatialMapVisual() != null)
            sb.append("GeospatialMapVisual: ").append(getGeospatialMapVisual()).append(",");
        if (getFilledMapVisual() != null)
            sb.append("FilledMapVisual: ").append(getFilledMapVisual()).append(",");
        if (getFunnelChartVisual() != null)
            sb.append("FunnelChartVisual: ").append(getFunnelChartVisual()).append(",");
        if (getScatterPlotVisual() != null)
            sb.append("ScatterPlotVisual: ").append(getScatterPlotVisual()).append(",");
        if (getComboChartVisual() != null)
            sb.append("ComboChartVisual: ").append(getComboChartVisual()).append(",");
        if (getBoxPlotVisual() != null)
            sb.append("BoxPlotVisual: ").append(getBoxPlotVisual()).append(",");
        if (getWaterfallVisual() != null)
            sb.append("WaterfallVisual: ").append(getWaterfallVisual()).append(",");
        if (getHistogramVisual() != null)
            sb.append("HistogramVisual: ").append(getHistogramVisual()).append(",");
        if (getWordCloudVisual() != null)
            sb.append("WordCloudVisual: ").append(getWordCloudVisual()).append(",");
        if (getInsightVisual() != null)
            sb.append("InsightVisual: ").append(getInsightVisual()).append(",");
        if (getSankeyDiagramVisual() != null)
            sb.append("SankeyDiagramVisual: ").append(getSankeyDiagramVisual()).append(",");
        if (getCustomContentVisual() != null)
            sb.append("CustomContentVisual: ").append(getCustomContentVisual()).append(",");
        if (getEmptyVisual() != null)
            sb.append("EmptyVisual: ").append(getEmptyVisual());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Visual == false)
            return false;
        Visual other = (Visual) obj;
        if (other.getTableVisual() == null ^ this.getTableVisual() == null)
            return false;
        if (other.getTableVisual() != null && other.getTableVisual().equals(this.getTableVisual()) == false)
            return false;
        if (other.getPivotTableVisual() == null ^ this.getPivotTableVisual() == null)
            return false;
        if (other.getPivotTableVisual() != null && other.getPivotTableVisual().equals(this.getPivotTableVisual()) == false)
            return false;
        if (other.getBarChartVisual() == null ^ this.getBarChartVisual() == null)
            return false;
        if (other.getBarChartVisual() != null && other.getBarChartVisual().equals(this.getBarChartVisual()) == false)
            return false;
        if (other.getKPIVisual() == null ^ this.getKPIVisual() == null)
            return false;
        if (other.getKPIVisual() != null && other.getKPIVisual().equals(this.getKPIVisual()) == false)
            return false;
        if (other.getPieChartVisual() == null ^ this.getPieChartVisual() == null)
            return false;
        if (other.getPieChartVisual() != null && other.getPieChartVisual().equals(this.getPieChartVisual()) == false)
            return false;
        if (other.getGaugeChartVisual() == null ^ this.getGaugeChartVisual() == null)
            return false;
        if (other.getGaugeChartVisual() != null && other.getGaugeChartVisual().equals(this.getGaugeChartVisual()) == false)
            return false;
        if (other.getLineChartVisual() == null ^ this.getLineChartVisual() == null)
            return false;
        if (other.getLineChartVisual() != null && other.getLineChartVisual().equals(this.getLineChartVisual()) == false)
            return false;
        if (other.getHeatMapVisual() == null ^ this.getHeatMapVisual() == null)
            return false;
        if (other.getHeatMapVisual() != null && other.getHeatMapVisual().equals(this.getHeatMapVisual()) == false)
            return false;
        if (other.getTreeMapVisual() == null ^ this.getTreeMapVisual() == null)
            return false;
        if (other.getTreeMapVisual() != null && other.getTreeMapVisual().equals(this.getTreeMapVisual()) == false)
            return false;
        if (other.getGeospatialMapVisual() == null ^ this.getGeospatialMapVisual() == null)
            return false;
        if (other.getGeospatialMapVisual() != null && other.getGeospatialMapVisual().equals(this.getGeospatialMapVisual()) == false)
            return false;
        if (other.getFilledMapVisual() == null ^ this.getFilledMapVisual() == null)
            return false;
        if (other.getFilledMapVisual() != null && other.getFilledMapVisual().equals(this.getFilledMapVisual()) == false)
            return false;
        if (other.getFunnelChartVisual() == null ^ this.getFunnelChartVisual() == null)
            return false;
        if (other.getFunnelChartVisual() != null && other.getFunnelChartVisual().equals(this.getFunnelChartVisual()) == false)
            return false;
        if (other.getScatterPlotVisual() == null ^ this.getScatterPlotVisual() == null)
            return false;
        if (other.getScatterPlotVisual() != null && other.getScatterPlotVisual().equals(this.getScatterPlotVisual()) == false)
            return false;
        if (other.getComboChartVisual() == null ^ this.getComboChartVisual() == null)
            return false;
        if (other.getComboChartVisual() != null && other.getComboChartVisual().equals(this.getComboChartVisual()) == false)
            return false;
        if (other.getBoxPlotVisual() == null ^ this.getBoxPlotVisual() == null)
            return false;
        if (other.getBoxPlotVisual() != null && other.getBoxPlotVisual().equals(this.getBoxPlotVisual()) == false)
            return false;
        if (other.getWaterfallVisual() == null ^ this.getWaterfallVisual() == null)
            return false;
        if (other.getWaterfallVisual() != null && other.getWaterfallVisual().equals(this.getWaterfallVisual()) == false)
            return false;
        if (other.getHistogramVisual() == null ^ this.getHistogramVisual() == null)
            return false;
        if (other.getHistogramVisual() != null && other.getHistogramVisual().equals(this.getHistogramVisual()) == false)
            return false;
        if (other.getWordCloudVisual() == null ^ this.getWordCloudVisual() == null)
            return false;
        if (other.getWordCloudVisual() != null && other.getWordCloudVisual().equals(this.getWordCloudVisual()) == false)
            return false;
        if (other.getInsightVisual() == null ^ this.getInsightVisual() == null)
            return false;
        if (other.getInsightVisual() != null && other.getInsightVisual().equals(this.getInsightVisual()) == false)
            return false;
        if (other.getSankeyDiagramVisual() == null ^ this.getSankeyDiagramVisual() == null)
            return false;
        if (other.getSankeyDiagramVisual() != null && other.getSankeyDiagramVisual().equals(this.getSankeyDiagramVisual()) == false)
            return false;
        if (other.getCustomContentVisual() == null ^ this.getCustomContentVisual() == null)
            return false;
        if (other.getCustomContentVisual() != null && other.getCustomContentVisual().equals(this.getCustomContentVisual()) == false)
            return false;
        if (other.getEmptyVisual() == null ^ this.getEmptyVisual() == null)
            return false;
        if (other.getEmptyVisual() != null && other.getEmptyVisual().equals(this.getEmptyVisual()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableVisual() == null) ? 0 : getTableVisual().hashCode());
        hashCode = prime * hashCode + ((getPivotTableVisual() == null) ? 0 : getPivotTableVisual().hashCode());
        hashCode = prime * hashCode + ((getBarChartVisual() == null) ? 0 : getBarChartVisual().hashCode());
        hashCode = prime * hashCode + ((getKPIVisual() == null) ? 0 : getKPIVisual().hashCode());
        hashCode = prime * hashCode + ((getPieChartVisual() == null) ? 0 : getPieChartVisual().hashCode());
        hashCode = prime * hashCode + ((getGaugeChartVisual() == null) ? 0 : getGaugeChartVisual().hashCode());
        hashCode = prime * hashCode + ((getLineChartVisual() == null) ? 0 : getLineChartVisual().hashCode());
        hashCode = prime * hashCode + ((getHeatMapVisual() == null) ? 0 : getHeatMapVisual().hashCode());
        hashCode = prime * hashCode + ((getTreeMapVisual() == null) ? 0 : getTreeMapVisual().hashCode());
        hashCode = prime * hashCode + ((getGeospatialMapVisual() == null) ? 0 : getGeospatialMapVisual().hashCode());
        hashCode = prime * hashCode + ((getFilledMapVisual() == null) ? 0 : getFilledMapVisual().hashCode());
        hashCode = prime * hashCode + ((getFunnelChartVisual() == null) ? 0 : getFunnelChartVisual().hashCode());
        hashCode = prime * hashCode + ((getScatterPlotVisual() == null) ? 0 : getScatterPlotVisual().hashCode());
        hashCode = prime * hashCode + ((getComboChartVisual() == null) ? 0 : getComboChartVisual().hashCode());
        hashCode = prime * hashCode + ((getBoxPlotVisual() == null) ? 0 : getBoxPlotVisual().hashCode());
        hashCode = prime * hashCode + ((getWaterfallVisual() == null) ? 0 : getWaterfallVisual().hashCode());
        hashCode = prime * hashCode + ((getHistogramVisual() == null) ? 0 : getHistogramVisual().hashCode());
        hashCode = prime * hashCode + ((getWordCloudVisual() == null) ? 0 : getWordCloudVisual().hashCode());
        hashCode = prime * hashCode + ((getInsightVisual() == null) ? 0 : getInsightVisual().hashCode());
        hashCode = prime * hashCode + ((getSankeyDiagramVisual() == null) ? 0 : getSankeyDiagramVisual().hashCode());
        hashCode = prime * hashCode + ((getCustomContentVisual() == null) ? 0 : getCustomContentVisual().hashCode());
        hashCode = prime * hashCode + ((getEmptyVisual() == null) ? 0 : getEmptyVisual().hashCode());
        return hashCode;
    }

    @Override
    public Visual clone() {
        try {
            return (Visual) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.VisualMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
