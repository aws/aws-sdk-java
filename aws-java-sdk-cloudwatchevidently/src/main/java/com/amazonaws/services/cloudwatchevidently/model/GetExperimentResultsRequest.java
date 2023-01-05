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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/GetExperimentResults" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetExperimentResultsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The statistic used to calculate experiment results. Currently the only valid value is <code>mean</code>, which
     * uses the mean of the collected values as the statistic.
     * </p>
     */
    private String baseStat;
    /**
     * <p>
     * The date and time that the experiment ended, if it is completed. This must be no longer than 30 days after the
     * experiment start time.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The name of the experiment to retrieve the results of.
     * </p>
     */
    private String experiment;
    /**
     * <p>
     * The names of the experiment metrics that you want to see the results of.
     * </p>
     */
    private java.util.List<String> metricNames;
    /**
     * <p>
     * In seconds, the amount of time to aggregate results together.
     * </p>
     */
    private Long period;
    /**
     * <p>
     * The name or ARN of the project that contains the experiment that you want to see the results of.
     * </p>
     */
    private String project;
    /**
     * <p>
     * The names of the report types that you want to see. Currently, <code>BayesianInference</code> is the only valid
     * value.
     * </p>
     */
    private java.util.List<String> reportNames;
    /**
     * <p>
     * The statistics that you want to see in the returned results.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PValue</code> specifies to use p-values for the results. A p-value is used in hypothesis testing to measure
     * how often you are willing to make a mistake in rejecting the null hypothesis. A general practice is to reject the
     * null hypothesis and declare that the results are statistically significant when the p-value is less than 0.05.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfidenceInterval</code> specifies a confidence interval for the results. The confidence interval
     * represents the range of values for the chosen metric that is likely to contain the true difference between the
     * <code>baseStat</code> of a variation and the baseline. Evidently returns the 95% confidence interval.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TreatmentEffect</code> is the difference in the statistic specified by the <code>baseStat</code> parameter
     * between each variation and the default variation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BaseStat</code> returns the statistical values collected for the metric for each variation. The statistic
     * uses the same statistic specified in the <code>baseStat</code> parameter. Therefore, if <code>baseStat</code> is
     * <code>mean</code>, this returns the mean of the values collected for each variation.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> resultStats;
    /**
     * <p>
     * The date and time that the experiment started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The names of the experiment treatments that you want to see the results for.
     * </p>
     */
    private java.util.List<String> treatmentNames;

    /**
     * <p>
     * The statistic used to calculate experiment results. Currently the only valid value is <code>mean</code>, which
     * uses the mean of the collected values as the statistic.
     * </p>
     * 
     * @param baseStat
     *        The statistic used to calculate experiment results. Currently the only valid value is <code>mean</code>,
     *        which uses the mean of the collected values as the statistic.
     * @see ExperimentBaseStat
     */

    public void setBaseStat(String baseStat) {
        this.baseStat = baseStat;
    }

    /**
     * <p>
     * The statistic used to calculate experiment results. Currently the only valid value is <code>mean</code>, which
     * uses the mean of the collected values as the statistic.
     * </p>
     * 
     * @return The statistic used to calculate experiment results. Currently the only valid value is <code>mean</code>,
     *         which uses the mean of the collected values as the statistic.
     * @see ExperimentBaseStat
     */

    public String getBaseStat() {
        return this.baseStat;
    }

    /**
     * <p>
     * The statistic used to calculate experiment results. Currently the only valid value is <code>mean</code>, which
     * uses the mean of the collected values as the statistic.
     * </p>
     * 
     * @param baseStat
     *        The statistic used to calculate experiment results. Currently the only valid value is <code>mean</code>,
     *        which uses the mean of the collected values as the statistic.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExperimentBaseStat
     */

    public GetExperimentResultsRequest withBaseStat(String baseStat) {
        setBaseStat(baseStat);
        return this;
    }

    /**
     * <p>
     * The statistic used to calculate experiment results. Currently the only valid value is <code>mean</code>, which
     * uses the mean of the collected values as the statistic.
     * </p>
     * 
     * @param baseStat
     *        The statistic used to calculate experiment results. Currently the only valid value is <code>mean</code>,
     *        which uses the mean of the collected values as the statistic.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExperimentBaseStat
     */

    public GetExperimentResultsRequest withBaseStat(ExperimentBaseStat baseStat) {
        this.baseStat = baseStat.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the experiment ended, if it is completed. This must be no longer than 30 days after the
     * experiment start time.
     * </p>
     * 
     * @param endTime
     *        The date and time that the experiment ended, if it is completed. This must be no longer than 30 days after
     *        the experiment start time.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The date and time that the experiment ended, if it is completed. This must be no longer than 30 days after the
     * experiment start time.
     * </p>
     * 
     * @return The date and time that the experiment ended, if it is completed. This must be no longer than 30 days
     *         after the experiment start time.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The date and time that the experiment ended, if it is completed. This must be no longer than 30 days after the
     * experiment start time.
     * </p>
     * 
     * @param endTime
     *        The date and time that the experiment ended, if it is completed. This must be no longer than 30 days after
     *        the experiment start time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExperimentResultsRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The name of the experiment to retrieve the results of.
     * </p>
     * 
     * @param experiment
     *        The name of the experiment to retrieve the results of.
     */

    public void setExperiment(String experiment) {
        this.experiment = experiment;
    }

    /**
     * <p>
     * The name of the experiment to retrieve the results of.
     * </p>
     * 
     * @return The name of the experiment to retrieve the results of.
     */

    public String getExperiment() {
        return this.experiment;
    }

    /**
     * <p>
     * The name of the experiment to retrieve the results of.
     * </p>
     * 
     * @param experiment
     *        The name of the experiment to retrieve the results of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExperimentResultsRequest withExperiment(String experiment) {
        setExperiment(experiment);
        return this;
    }

    /**
     * <p>
     * The names of the experiment metrics that you want to see the results of.
     * </p>
     * 
     * @return The names of the experiment metrics that you want to see the results of.
     */

    public java.util.List<String> getMetricNames() {
        return metricNames;
    }

    /**
     * <p>
     * The names of the experiment metrics that you want to see the results of.
     * </p>
     * 
     * @param metricNames
     *        The names of the experiment metrics that you want to see the results of.
     */

    public void setMetricNames(java.util.Collection<String> metricNames) {
        if (metricNames == null) {
            this.metricNames = null;
            return;
        }

        this.metricNames = new java.util.ArrayList<String>(metricNames);
    }

    /**
     * <p>
     * The names of the experiment metrics that you want to see the results of.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricNames(java.util.Collection)} or {@link #withMetricNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param metricNames
     *        The names of the experiment metrics that you want to see the results of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExperimentResultsRequest withMetricNames(String... metricNames) {
        if (this.metricNames == null) {
            setMetricNames(new java.util.ArrayList<String>(metricNames.length));
        }
        for (String ele : metricNames) {
            this.metricNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the experiment metrics that you want to see the results of.
     * </p>
     * 
     * @param metricNames
     *        The names of the experiment metrics that you want to see the results of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExperimentResultsRequest withMetricNames(java.util.Collection<String> metricNames) {
        setMetricNames(metricNames);
        return this;
    }

    /**
     * <p>
     * In seconds, the amount of time to aggregate results together.
     * </p>
     * 
     * @param period
     *        In seconds, the amount of time to aggregate results together.
     */

    public void setPeriod(Long period) {
        this.period = period;
    }

    /**
     * <p>
     * In seconds, the amount of time to aggregate results together.
     * </p>
     * 
     * @return In seconds, the amount of time to aggregate results together.
     */

    public Long getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * In seconds, the amount of time to aggregate results together.
     * </p>
     * 
     * @param period
     *        In seconds, the amount of time to aggregate results together.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExperimentResultsRequest withPeriod(Long period) {
        setPeriod(period);
        return this;
    }

    /**
     * <p>
     * The name or ARN of the project that contains the experiment that you want to see the results of.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project that contains the experiment that you want to see the results of.
     */

    public void setProject(String project) {
        this.project = project;
    }

    /**
     * <p>
     * The name or ARN of the project that contains the experiment that you want to see the results of.
     * </p>
     * 
     * @return The name or ARN of the project that contains the experiment that you want to see the results of.
     */

    public String getProject() {
        return this.project;
    }

    /**
     * <p>
     * The name or ARN of the project that contains the experiment that you want to see the results of.
     * </p>
     * 
     * @param project
     *        The name or ARN of the project that contains the experiment that you want to see the results of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExperimentResultsRequest withProject(String project) {
        setProject(project);
        return this;
    }

    /**
     * <p>
     * The names of the report types that you want to see. Currently, <code>BayesianInference</code> is the only valid
     * value.
     * </p>
     * 
     * @return The names of the report types that you want to see. Currently, <code>BayesianInference</code> is the only
     *         valid value.
     * @see ExperimentReportName
     */

    public java.util.List<String> getReportNames() {
        return reportNames;
    }

    /**
     * <p>
     * The names of the report types that you want to see. Currently, <code>BayesianInference</code> is the only valid
     * value.
     * </p>
     * 
     * @param reportNames
     *        The names of the report types that you want to see. Currently, <code>BayesianInference</code> is the only
     *        valid value.
     * @see ExperimentReportName
     */

    public void setReportNames(java.util.Collection<String> reportNames) {
        if (reportNames == null) {
            this.reportNames = null;
            return;
        }

        this.reportNames = new java.util.ArrayList<String>(reportNames);
    }

    /**
     * <p>
     * The names of the report types that you want to see. Currently, <code>BayesianInference</code> is the only valid
     * value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReportNames(java.util.Collection)} or {@link #withReportNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param reportNames
     *        The names of the report types that you want to see. Currently, <code>BayesianInference</code> is the only
     *        valid value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExperimentReportName
     */

    public GetExperimentResultsRequest withReportNames(String... reportNames) {
        if (this.reportNames == null) {
            setReportNames(new java.util.ArrayList<String>(reportNames.length));
        }
        for (String ele : reportNames) {
            this.reportNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the report types that you want to see. Currently, <code>BayesianInference</code> is the only valid
     * value.
     * </p>
     * 
     * @param reportNames
     *        The names of the report types that you want to see. Currently, <code>BayesianInference</code> is the only
     *        valid value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExperimentReportName
     */

    public GetExperimentResultsRequest withReportNames(java.util.Collection<String> reportNames) {
        setReportNames(reportNames);
        return this;
    }

    /**
     * <p>
     * The names of the report types that you want to see. Currently, <code>BayesianInference</code> is the only valid
     * value.
     * </p>
     * 
     * @param reportNames
     *        The names of the report types that you want to see. Currently, <code>BayesianInference</code> is the only
     *        valid value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExperimentReportName
     */

    public GetExperimentResultsRequest withReportNames(ExperimentReportName... reportNames) {
        java.util.ArrayList<String> reportNamesCopy = new java.util.ArrayList<String>(reportNames.length);
        for (ExperimentReportName value : reportNames) {
            reportNamesCopy.add(value.toString());
        }
        if (getReportNames() == null) {
            setReportNames(reportNamesCopy);
        } else {
            getReportNames().addAll(reportNamesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The statistics that you want to see in the returned results.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PValue</code> specifies to use p-values for the results. A p-value is used in hypothesis testing to measure
     * how often you are willing to make a mistake in rejecting the null hypothesis. A general practice is to reject the
     * null hypothesis and declare that the results are statistically significant when the p-value is less than 0.05.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfidenceInterval</code> specifies a confidence interval for the results. The confidence interval
     * represents the range of values for the chosen metric that is likely to contain the true difference between the
     * <code>baseStat</code> of a variation and the baseline. Evidently returns the 95% confidence interval.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TreatmentEffect</code> is the difference in the statistic specified by the <code>baseStat</code> parameter
     * between each variation and the default variation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BaseStat</code> returns the statistical values collected for the metric for each variation. The statistic
     * uses the same statistic specified in the <code>baseStat</code> parameter. Therefore, if <code>baseStat</code> is
     * <code>mean</code>, this returns the mean of the values collected for each variation.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The statistics that you want to see in the returned results.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PValue</code> specifies to use p-values for the results. A p-value is used in hypothesis testing to
     *         measure how often you are willing to make a mistake in rejecting the null hypothesis. A general practice
     *         is to reject the null hypothesis and declare that the results are statistically significant when the
     *         p-value is less than 0.05.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ConfidenceInterval</code> specifies a confidence interval for the results. The confidence interval
     *         represents the range of values for the chosen metric that is likely to contain the true difference
     *         between the <code>baseStat</code> of a variation and the baseline. Evidently returns the 95% confidence
     *         interval.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TreatmentEffect</code> is the difference in the statistic specified by the <code>baseStat</code>
     *         parameter between each variation and the default variation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BaseStat</code> returns the statistical values collected for the metric for each variation. The
     *         statistic uses the same statistic specified in the <code>baseStat</code> parameter. Therefore, if
     *         <code>baseStat</code> is <code>mean</code>, this returns the mean of the values collected for each
     *         variation.
     *         </p>
     *         </li>
     * @see ExperimentResultRequestType
     */

    public java.util.List<String> getResultStats() {
        return resultStats;
    }

    /**
     * <p>
     * The statistics that you want to see in the returned results.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PValue</code> specifies to use p-values for the results. A p-value is used in hypothesis testing to measure
     * how often you are willing to make a mistake in rejecting the null hypothesis. A general practice is to reject the
     * null hypothesis and declare that the results are statistically significant when the p-value is less than 0.05.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfidenceInterval</code> specifies a confidence interval for the results. The confidence interval
     * represents the range of values for the chosen metric that is likely to contain the true difference between the
     * <code>baseStat</code> of a variation and the baseline. Evidently returns the 95% confidence interval.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TreatmentEffect</code> is the difference in the statistic specified by the <code>baseStat</code> parameter
     * between each variation and the default variation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BaseStat</code> returns the statistical values collected for the metric for each variation. The statistic
     * uses the same statistic specified in the <code>baseStat</code> parameter. Therefore, if <code>baseStat</code> is
     * <code>mean</code>, this returns the mean of the values collected for each variation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resultStats
     *        The statistics that you want to see in the returned results.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PValue</code> specifies to use p-values for the results. A p-value is used in hypothesis testing to
     *        measure how often you are willing to make a mistake in rejecting the null hypothesis. A general practice
     *        is to reject the null hypothesis and declare that the results are statistically significant when the
     *        p-value is less than 0.05.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ConfidenceInterval</code> specifies a confidence interval for the results. The confidence interval
     *        represents the range of values for the chosen metric that is likely to contain the true difference between
     *        the <code>baseStat</code> of a variation and the baseline. Evidently returns the 95% confidence interval.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TreatmentEffect</code> is the difference in the statistic specified by the <code>baseStat</code>
     *        parameter between each variation and the default variation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BaseStat</code> returns the statistical values collected for the metric for each variation. The
     *        statistic uses the same statistic specified in the <code>baseStat</code> parameter. Therefore, if
     *        <code>baseStat</code> is <code>mean</code>, this returns the mean of the values collected for each
     *        variation.
     *        </p>
     *        </li>
     * @see ExperimentResultRequestType
     */

    public void setResultStats(java.util.Collection<String> resultStats) {
        if (resultStats == null) {
            this.resultStats = null;
            return;
        }

        this.resultStats = new java.util.ArrayList<String>(resultStats);
    }

    /**
     * <p>
     * The statistics that you want to see in the returned results.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PValue</code> specifies to use p-values for the results. A p-value is used in hypothesis testing to measure
     * how often you are willing to make a mistake in rejecting the null hypothesis. A general practice is to reject the
     * null hypothesis and declare that the results are statistically significant when the p-value is less than 0.05.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfidenceInterval</code> specifies a confidence interval for the results. The confidence interval
     * represents the range of values for the chosen metric that is likely to contain the true difference between the
     * <code>baseStat</code> of a variation and the baseline. Evidently returns the 95% confidence interval.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TreatmentEffect</code> is the difference in the statistic specified by the <code>baseStat</code> parameter
     * between each variation and the default variation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BaseStat</code> returns the statistical values collected for the metric for each variation. The statistic
     * uses the same statistic specified in the <code>baseStat</code> parameter. Therefore, if <code>baseStat</code> is
     * <code>mean</code>, this returns the mean of the values collected for each variation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResultStats(java.util.Collection)} or {@link #withResultStats(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resultStats
     *        The statistics that you want to see in the returned results.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PValue</code> specifies to use p-values for the results. A p-value is used in hypothesis testing to
     *        measure how often you are willing to make a mistake in rejecting the null hypothesis. A general practice
     *        is to reject the null hypothesis and declare that the results are statistically significant when the
     *        p-value is less than 0.05.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ConfidenceInterval</code> specifies a confidence interval for the results. The confidence interval
     *        represents the range of values for the chosen metric that is likely to contain the true difference between
     *        the <code>baseStat</code> of a variation and the baseline. Evidently returns the 95% confidence interval.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TreatmentEffect</code> is the difference in the statistic specified by the <code>baseStat</code>
     *        parameter between each variation and the default variation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BaseStat</code> returns the statistical values collected for the metric for each variation. The
     *        statistic uses the same statistic specified in the <code>baseStat</code> parameter. Therefore, if
     *        <code>baseStat</code> is <code>mean</code>, this returns the mean of the values collected for each
     *        variation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExperimentResultRequestType
     */

    public GetExperimentResultsRequest withResultStats(String... resultStats) {
        if (this.resultStats == null) {
            setResultStats(new java.util.ArrayList<String>(resultStats.length));
        }
        for (String ele : resultStats) {
            this.resultStats.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The statistics that you want to see in the returned results.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PValue</code> specifies to use p-values for the results. A p-value is used in hypothesis testing to measure
     * how often you are willing to make a mistake in rejecting the null hypothesis. A general practice is to reject the
     * null hypothesis and declare that the results are statistically significant when the p-value is less than 0.05.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfidenceInterval</code> specifies a confidence interval for the results. The confidence interval
     * represents the range of values for the chosen metric that is likely to contain the true difference between the
     * <code>baseStat</code> of a variation and the baseline. Evidently returns the 95% confidence interval.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TreatmentEffect</code> is the difference in the statistic specified by the <code>baseStat</code> parameter
     * between each variation and the default variation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BaseStat</code> returns the statistical values collected for the metric for each variation. The statistic
     * uses the same statistic specified in the <code>baseStat</code> parameter. Therefore, if <code>baseStat</code> is
     * <code>mean</code>, this returns the mean of the values collected for each variation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resultStats
     *        The statistics that you want to see in the returned results.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PValue</code> specifies to use p-values for the results. A p-value is used in hypothesis testing to
     *        measure how often you are willing to make a mistake in rejecting the null hypothesis. A general practice
     *        is to reject the null hypothesis and declare that the results are statistically significant when the
     *        p-value is less than 0.05.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ConfidenceInterval</code> specifies a confidence interval for the results. The confidence interval
     *        represents the range of values for the chosen metric that is likely to contain the true difference between
     *        the <code>baseStat</code> of a variation and the baseline. Evidently returns the 95% confidence interval.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TreatmentEffect</code> is the difference in the statistic specified by the <code>baseStat</code>
     *        parameter between each variation and the default variation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BaseStat</code> returns the statistical values collected for the metric for each variation. The
     *        statistic uses the same statistic specified in the <code>baseStat</code> parameter. Therefore, if
     *        <code>baseStat</code> is <code>mean</code>, this returns the mean of the values collected for each
     *        variation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExperimentResultRequestType
     */

    public GetExperimentResultsRequest withResultStats(java.util.Collection<String> resultStats) {
        setResultStats(resultStats);
        return this;
    }

    /**
     * <p>
     * The statistics that you want to see in the returned results.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PValue</code> specifies to use p-values for the results. A p-value is used in hypothesis testing to measure
     * how often you are willing to make a mistake in rejecting the null hypothesis. A general practice is to reject the
     * null hypothesis and declare that the results are statistically significant when the p-value is less than 0.05.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfidenceInterval</code> specifies a confidence interval for the results. The confidence interval
     * represents the range of values for the chosen metric that is likely to contain the true difference between the
     * <code>baseStat</code> of a variation and the baseline. Evidently returns the 95% confidence interval.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TreatmentEffect</code> is the difference in the statistic specified by the <code>baseStat</code> parameter
     * between each variation and the default variation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BaseStat</code> returns the statistical values collected for the metric for each variation. The statistic
     * uses the same statistic specified in the <code>baseStat</code> parameter. Therefore, if <code>baseStat</code> is
     * <code>mean</code>, this returns the mean of the values collected for each variation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resultStats
     *        The statistics that you want to see in the returned results.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PValue</code> specifies to use p-values for the results. A p-value is used in hypothesis testing to
     *        measure how often you are willing to make a mistake in rejecting the null hypothesis. A general practice
     *        is to reject the null hypothesis and declare that the results are statistically significant when the
     *        p-value is less than 0.05.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ConfidenceInterval</code> specifies a confidence interval for the results. The confidence interval
     *        represents the range of values for the chosen metric that is likely to contain the true difference between
     *        the <code>baseStat</code> of a variation and the baseline. Evidently returns the 95% confidence interval.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TreatmentEffect</code> is the difference in the statistic specified by the <code>baseStat</code>
     *        parameter between each variation and the default variation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BaseStat</code> returns the statistical values collected for the metric for each variation. The
     *        statistic uses the same statistic specified in the <code>baseStat</code> parameter. Therefore, if
     *        <code>baseStat</code> is <code>mean</code>, this returns the mean of the values collected for each
     *        variation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExperimentResultRequestType
     */

    public GetExperimentResultsRequest withResultStats(ExperimentResultRequestType... resultStats) {
        java.util.ArrayList<String> resultStatsCopy = new java.util.ArrayList<String>(resultStats.length);
        for (ExperimentResultRequestType value : resultStats) {
            resultStatsCopy.add(value.toString());
        }
        if (getResultStats() == null) {
            setResultStats(resultStatsCopy);
        } else {
            getResultStats().addAll(resultStatsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The date and time that the experiment started.
     * </p>
     * 
     * @param startTime
     *        The date and time that the experiment started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The date and time that the experiment started.
     * </p>
     * 
     * @return The date and time that the experiment started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The date and time that the experiment started.
     * </p>
     * 
     * @param startTime
     *        The date and time that the experiment started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExperimentResultsRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The names of the experiment treatments that you want to see the results for.
     * </p>
     * 
     * @return The names of the experiment treatments that you want to see the results for.
     */

    public java.util.List<String> getTreatmentNames() {
        return treatmentNames;
    }

    /**
     * <p>
     * The names of the experiment treatments that you want to see the results for.
     * </p>
     * 
     * @param treatmentNames
     *        The names of the experiment treatments that you want to see the results for.
     */

    public void setTreatmentNames(java.util.Collection<String> treatmentNames) {
        if (treatmentNames == null) {
            this.treatmentNames = null;
            return;
        }

        this.treatmentNames = new java.util.ArrayList<String>(treatmentNames);
    }

    /**
     * <p>
     * The names of the experiment treatments that you want to see the results for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTreatmentNames(java.util.Collection)} or {@link #withTreatmentNames(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param treatmentNames
     *        The names of the experiment treatments that you want to see the results for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExperimentResultsRequest withTreatmentNames(String... treatmentNames) {
        if (this.treatmentNames == null) {
            setTreatmentNames(new java.util.ArrayList<String>(treatmentNames.length));
        }
        for (String ele : treatmentNames) {
            this.treatmentNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the experiment treatments that you want to see the results for.
     * </p>
     * 
     * @param treatmentNames
     *        The names of the experiment treatments that you want to see the results for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExperimentResultsRequest withTreatmentNames(java.util.Collection<String> treatmentNames) {
        setTreatmentNames(treatmentNames);
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
        if (getBaseStat() != null)
            sb.append("BaseStat: ").append(getBaseStat()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getExperiment() != null)
            sb.append("Experiment: ").append(getExperiment()).append(",");
        if (getMetricNames() != null)
            sb.append("MetricNames: ").append(getMetricNames()).append(",");
        if (getPeriod() != null)
            sb.append("Period: ").append(getPeriod()).append(",");
        if (getProject() != null)
            sb.append("Project: ").append(getProject()).append(",");
        if (getReportNames() != null)
            sb.append("ReportNames: ").append(getReportNames()).append(",");
        if (getResultStats() != null)
            sb.append("ResultStats: ").append(getResultStats()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getTreatmentNames() != null)
            sb.append("TreatmentNames: ").append(getTreatmentNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetExperimentResultsRequest == false)
            return false;
        GetExperimentResultsRequest other = (GetExperimentResultsRequest) obj;
        if (other.getBaseStat() == null ^ this.getBaseStat() == null)
            return false;
        if (other.getBaseStat() != null && other.getBaseStat().equals(this.getBaseStat()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getExperiment() == null ^ this.getExperiment() == null)
            return false;
        if (other.getExperiment() != null && other.getExperiment().equals(this.getExperiment()) == false)
            return false;
        if (other.getMetricNames() == null ^ this.getMetricNames() == null)
            return false;
        if (other.getMetricNames() != null && other.getMetricNames().equals(this.getMetricNames()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        if (other.getProject() == null ^ this.getProject() == null)
            return false;
        if (other.getProject() != null && other.getProject().equals(this.getProject()) == false)
            return false;
        if (other.getReportNames() == null ^ this.getReportNames() == null)
            return false;
        if (other.getReportNames() != null && other.getReportNames().equals(this.getReportNames()) == false)
            return false;
        if (other.getResultStats() == null ^ this.getResultStats() == null)
            return false;
        if (other.getResultStats() != null && other.getResultStats().equals(this.getResultStats()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getTreatmentNames() == null ^ this.getTreatmentNames() == null)
            return false;
        if (other.getTreatmentNames() != null && other.getTreatmentNames().equals(this.getTreatmentNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaseStat() == null) ? 0 : getBaseStat().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getExperiment() == null) ? 0 : getExperiment().hashCode());
        hashCode = prime * hashCode + ((getMetricNames() == null) ? 0 : getMetricNames().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getProject() == null) ? 0 : getProject().hashCode());
        hashCode = prime * hashCode + ((getReportNames() == null) ? 0 : getReportNames().hashCode());
        hashCode = prime * hashCode + ((getResultStats() == null) ? 0 : getResultStats().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getTreatmentNames() == null) ? 0 : getTreatmentNames().hashCode());
        return hashCode;
    }

    @Override
    public GetExperimentResultsRequest clone() {
        return (GetExperimentResultsRequest) super.clone();
    }

}
