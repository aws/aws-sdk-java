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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/GetExperimentResults" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetExperimentResultsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If the experiment doesn't yet have enough events to provide valid results, this field is returned with the
     * message <code>Not enough events to generate results</code>. If there are enough events to provide valid results,
     * this field is not returned.
     * </p>
     */
    private String details;
    /**
     * <p>
     * An array of structures that include the reports that you requested.
     * </p>
     */
    private java.util.List<ExperimentReport> reports;
    /**
     * <p>
     * An array of structures that include experiment results including metric names and values.
     * </p>
     */
    private java.util.List<ExperimentResultsData> resultsData;
    /**
     * <p>
     * The timestamps of each result returned.
     * </p>
     */
    private java.util.List<java.util.Date> timestamps;

    /**
     * <p>
     * If the experiment doesn't yet have enough events to provide valid results, this field is returned with the
     * message <code>Not enough events to generate results</code>. If there are enough events to provide valid results,
     * this field is not returned.
     * </p>
     * 
     * @param details
     *        If the experiment doesn't yet have enough events to provide valid results, this field is returned with the
     *        message <code>Not enough events to generate results</code>. If there are enough events to provide valid
     *        results, this field is not returned.
     */

    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * <p>
     * If the experiment doesn't yet have enough events to provide valid results, this field is returned with the
     * message <code>Not enough events to generate results</code>. If there are enough events to provide valid results,
     * this field is not returned.
     * </p>
     * 
     * @return If the experiment doesn't yet have enough events to provide valid results, this field is returned with
     *         the message <code>Not enough events to generate results</code>. If there are enough events to provide
     *         valid results, this field is not returned.
     */

    public String getDetails() {
        return this.details;
    }

    /**
     * <p>
     * If the experiment doesn't yet have enough events to provide valid results, this field is returned with the
     * message <code>Not enough events to generate results</code>. If there are enough events to provide valid results,
     * this field is not returned.
     * </p>
     * 
     * @param details
     *        If the experiment doesn't yet have enough events to provide valid results, this field is returned with the
     *        message <code>Not enough events to generate results</code>. If there are enough events to provide valid
     *        results, this field is not returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExperimentResultsResult withDetails(String details) {
        setDetails(details);
        return this;
    }

    /**
     * <p>
     * An array of structures that include the reports that you requested.
     * </p>
     * 
     * @return An array of structures that include the reports that you requested.
     */

    public java.util.List<ExperimentReport> getReports() {
        return reports;
    }

    /**
     * <p>
     * An array of structures that include the reports that you requested.
     * </p>
     * 
     * @param reports
     *        An array of structures that include the reports that you requested.
     */

    public void setReports(java.util.Collection<ExperimentReport> reports) {
        if (reports == null) {
            this.reports = null;
            return;
        }

        this.reports = new java.util.ArrayList<ExperimentReport>(reports);
    }

    /**
     * <p>
     * An array of structures that include the reports that you requested.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReports(java.util.Collection)} or {@link #withReports(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param reports
     *        An array of structures that include the reports that you requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExperimentResultsResult withReports(ExperimentReport... reports) {
        if (this.reports == null) {
            setReports(new java.util.ArrayList<ExperimentReport>(reports.length));
        }
        for (ExperimentReport ele : reports) {
            this.reports.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures that include the reports that you requested.
     * </p>
     * 
     * @param reports
     *        An array of structures that include the reports that you requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExperimentResultsResult withReports(java.util.Collection<ExperimentReport> reports) {
        setReports(reports);
        return this;
    }

    /**
     * <p>
     * An array of structures that include experiment results including metric names and values.
     * </p>
     * 
     * @return An array of structures that include experiment results including metric names and values.
     */

    public java.util.List<ExperimentResultsData> getResultsData() {
        return resultsData;
    }

    /**
     * <p>
     * An array of structures that include experiment results including metric names and values.
     * </p>
     * 
     * @param resultsData
     *        An array of structures that include experiment results including metric names and values.
     */

    public void setResultsData(java.util.Collection<ExperimentResultsData> resultsData) {
        if (resultsData == null) {
            this.resultsData = null;
            return;
        }

        this.resultsData = new java.util.ArrayList<ExperimentResultsData>(resultsData);
    }

    /**
     * <p>
     * An array of structures that include experiment results including metric names and values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResultsData(java.util.Collection)} or {@link #withResultsData(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resultsData
     *        An array of structures that include experiment results including metric names and values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExperimentResultsResult withResultsData(ExperimentResultsData... resultsData) {
        if (this.resultsData == null) {
            setResultsData(new java.util.ArrayList<ExperimentResultsData>(resultsData.length));
        }
        for (ExperimentResultsData ele : resultsData) {
            this.resultsData.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures that include experiment results including metric names and values.
     * </p>
     * 
     * @param resultsData
     *        An array of structures that include experiment results including metric names and values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExperimentResultsResult withResultsData(java.util.Collection<ExperimentResultsData> resultsData) {
        setResultsData(resultsData);
        return this;
    }

    /**
     * <p>
     * The timestamps of each result returned.
     * </p>
     * 
     * @return The timestamps of each result returned.
     */

    public java.util.List<java.util.Date> getTimestamps() {
        return timestamps;
    }

    /**
     * <p>
     * The timestamps of each result returned.
     * </p>
     * 
     * @param timestamps
     *        The timestamps of each result returned.
     */

    public void setTimestamps(java.util.Collection<java.util.Date> timestamps) {
        if (timestamps == null) {
            this.timestamps = null;
            return;
        }

        this.timestamps = new java.util.ArrayList<java.util.Date>(timestamps);
    }

    /**
     * <p>
     * The timestamps of each result returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTimestamps(java.util.Collection)} or {@link #withTimestamps(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param timestamps
     *        The timestamps of each result returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExperimentResultsResult withTimestamps(java.util.Date... timestamps) {
        if (this.timestamps == null) {
            setTimestamps(new java.util.ArrayList<java.util.Date>(timestamps.length));
        }
        for (java.util.Date ele : timestamps) {
            this.timestamps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The timestamps of each result returned.
     * </p>
     * 
     * @param timestamps
     *        The timestamps of each result returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExperimentResultsResult withTimestamps(java.util.Collection<java.util.Date> timestamps) {
        setTimestamps(timestamps);
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
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails()).append(",");
        if (getReports() != null)
            sb.append("Reports: ").append(getReports()).append(",");
        if (getResultsData() != null)
            sb.append("ResultsData: ").append(getResultsData()).append(",");
        if (getTimestamps() != null)
            sb.append("Timestamps: ").append(getTimestamps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetExperimentResultsResult == false)
            return false;
        GetExperimentResultsResult other = (GetExperimentResultsResult) obj;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        if (other.getReports() == null ^ this.getReports() == null)
            return false;
        if (other.getReports() != null && other.getReports().equals(this.getReports()) == false)
            return false;
        if (other.getResultsData() == null ^ this.getResultsData() == null)
            return false;
        if (other.getResultsData() != null && other.getResultsData().equals(this.getResultsData()) == false)
            return false;
        if (other.getTimestamps() == null ^ this.getTimestamps() == null)
            return false;
        if (other.getTimestamps() != null && other.getTimestamps().equals(this.getTimestamps()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        hashCode = prime * hashCode + ((getReports() == null) ? 0 : getReports().hashCode());
        hashCode = prime * hashCode + ((getResultsData() == null) ? 0 : getResultsData().hashCode());
        hashCode = prime * hashCode + ((getTimestamps() == null) ? 0 : getTimestamps().hashCode());
        return hashCode;
    }

    @Override
    public GetExperimentResultsResult clone() {
        try {
            return (GetExperimentResultsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
