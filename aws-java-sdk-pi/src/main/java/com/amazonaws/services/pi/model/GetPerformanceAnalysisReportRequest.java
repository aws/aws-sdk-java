/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pi.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/GetPerformanceAnalysisReport" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPerformanceAnalysisReportRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services service for which Performance Insights will return metrics. Valid value is
     * <code>RDS</code>.
     * </p>
     */
    private String serviceType;
    /**
     * <p>
     * An immutable identifier for a data source that is unique for an Amazon Web Services Region. Performance Insights
     * gathers metrics from this data source. In the console, the identifier is shown as <i>ResourceID</i>. When you
     * call <code>DescribeDBInstances</code>, the identifier is returned as <code>DbiResourceId</code>.
     * </p>
     * <p>
     * To use a DB instance as a data source, specify its <code>DbiResourceId</code> value. For example, specify
     * <code>db-ABCDEFGHIJKLMNOPQRSTU1VW2X</code>.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * A unique identifier of the created analysis report. For example, <code>report-12345678901234567</code>
     * </p>
     */
    private String analysisReportId;
    /**
     * <p>
     * Indicates the text format in the report. The options are <code>PLAIN_TEXT</code> or <code>MARKDOWN</code>. The
     * default value is <code>plain text</code>.
     * </p>
     */
    private String textFormat;
    /**
     * <p>
     * The text language in the report. The default language is <code>EN_US</code> (English).
     * </p>
     */
    private String acceptLanguage;

    /**
     * <p>
     * The Amazon Web Services service for which Performance Insights will return metrics. Valid value is
     * <code>RDS</code>.
     * </p>
     * 
     * @param serviceType
     *        The Amazon Web Services service for which Performance Insights will return metrics. Valid value is
     *        <code>RDS</code>.
     * @see ServiceType
     */

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * <p>
     * The Amazon Web Services service for which Performance Insights will return metrics. Valid value is
     * <code>RDS</code>.
     * </p>
     * 
     * @return The Amazon Web Services service for which Performance Insights will return metrics. Valid value is
     *         <code>RDS</code>.
     * @see ServiceType
     */

    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * <p>
     * The Amazon Web Services service for which Performance Insights will return metrics. Valid value is
     * <code>RDS</code>.
     * </p>
     * 
     * @param serviceType
     *        The Amazon Web Services service for which Performance Insights will return metrics. Valid value is
     *        <code>RDS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceType
     */

    public GetPerformanceAnalysisReportRequest withServiceType(String serviceType) {
        setServiceType(serviceType);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services service for which Performance Insights will return metrics. Valid value is
     * <code>RDS</code>.
     * </p>
     * 
     * @param serviceType
     *        The Amazon Web Services service for which Performance Insights will return metrics. Valid value is
     *        <code>RDS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceType
     */

    public GetPerformanceAnalysisReportRequest withServiceType(ServiceType serviceType) {
        this.serviceType = serviceType.toString();
        return this;
    }

    /**
     * <p>
     * An immutable identifier for a data source that is unique for an Amazon Web Services Region. Performance Insights
     * gathers metrics from this data source. In the console, the identifier is shown as <i>ResourceID</i>. When you
     * call <code>DescribeDBInstances</code>, the identifier is returned as <code>DbiResourceId</code>.
     * </p>
     * <p>
     * To use a DB instance as a data source, specify its <code>DbiResourceId</code> value. For example, specify
     * <code>db-ABCDEFGHIJKLMNOPQRSTU1VW2X</code>.
     * </p>
     * 
     * @param identifier
     *        An immutable identifier for a data source that is unique for an Amazon Web Services Region. Performance
     *        Insights gathers metrics from this data source. In the console, the identifier is shown as
     *        <i>ResourceID</i>. When you call <code>DescribeDBInstances</code>, the identifier is returned as
     *        <code>DbiResourceId</code>.</p>
     *        <p>
     *        To use a DB instance as a data source, specify its <code>DbiResourceId</code> value. For example, specify
     *        <code>db-ABCDEFGHIJKLMNOPQRSTU1VW2X</code>.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * An immutable identifier for a data source that is unique for an Amazon Web Services Region. Performance Insights
     * gathers metrics from this data source. In the console, the identifier is shown as <i>ResourceID</i>. When you
     * call <code>DescribeDBInstances</code>, the identifier is returned as <code>DbiResourceId</code>.
     * </p>
     * <p>
     * To use a DB instance as a data source, specify its <code>DbiResourceId</code> value. For example, specify
     * <code>db-ABCDEFGHIJKLMNOPQRSTU1VW2X</code>.
     * </p>
     * 
     * @return An immutable identifier for a data source that is unique for an Amazon Web Services Region. Performance
     *         Insights gathers metrics from this data source. In the console, the identifier is shown as
     *         <i>ResourceID</i>. When you call <code>DescribeDBInstances</code>, the identifier is returned as
     *         <code>DbiResourceId</code>.</p>
     *         <p>
     *         To use a DB instance as a data source, specify its <code>DbiResourceId</code> value. For example, specify
     *         <code>db-ABCDEFGHIJKLMNOPQRSTU1VW2X</code>.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * An immutable identifier for a data source that is unique for an Amazon Web Services Region. Performance Insights
     * gathers metrics from this data source. In the console, the identifier is shown as <i>ResourceID</i>. When you
     * call <code>DescribeDBInstances</code>, the identifier is returned as <code>DbiResourceId</code>.
     * </p>
     * <p>
     * To use a DB instance as a data source, specify its <code>DbiResourceId</code> value. For example, specify
     * <code>db-ABCDEFGHIJKLMNOPQRSTU1VW2X</code>.
     * </p>
     * 
     * @param identifier
     *        An immutable identifier for a data source that is unique for an Amazon Web Services Region. Performance
     *        Insights gathers metrics from this data source. In the console, the identifier is shown as
     *        <i>ResourceID</i>. When you call <code>DescribeDBInstances</code>, the identifier is returned as
     *        <code>DbiResourceId</code>.</p>
     *        <p>
     *        To use a DB instance as a data source, specify its <code>DbiResourceId</code> value. For example, specify
     *        <code>db-ABCDEFGHIJKLMNOPQRSTU1VW2X</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPerformanceAnalysisReportRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * A unique identifier of the created analysis report. For example, <code>report-12345678901234567</code>
     * </p>
     * 
     * @param analysisReportId
     *        A unique identifier of the created analysis report. For example, <code>report-12345678901234567</code>
     */

    public void setAnalysisReportId(String analysisReportId) {
        this.analysisReportId = analysisReportId;
    }

    /**
     * <p>
     * A unique identifier of the created analysis report. For example, <code>report-12345678901234567</code>
     * </p>
     * 
     * @return A unique identifier of the created analysis report. For example, <code>report-12345678901234567</code>
     */

    public String getAnalysisReportId() {
        return this.analysisReportId;
    }

    /**
     * <p>
     * A unique identifier of the created analysis report. For example, <code>report-12345678901234567</code>
     * </p>
     * 
     * @param analysisReportId
     *        A unique identifier of the created analysis report. For example, <code>report-12345678901234567</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPerformanceAnalysisReportRequest withAnalysisReportId(String analysisReportId) {
        setAnalysisReportId(analysisReportId);
        return this;
    }

    /**
     * <p>
     * Indicates the text format in the report. The options are <code>PLAIN_TEXT</code> or <code>MARKDOWN</code>. The
     * default value is <code>plain text</code>.
     * </p>
     * 
     * @param textFormat
     *        Indicates the text format in the report. The options are <code>PLAIN_TEXT</code> or <code>MARKDOWN</code>.
     *        The default value is <code>plain text</code>.
     * @see TextFormat
     */

    public void setTextFormat(String textFormat) {
        this.textFormat = textFormat;
    }

    /**
     * <p>
     * Indicates the text format in the report. The options are <code>PLAIN_TEXT</code> or <code>MARKDOWN</code>. The
     * default value is <code>plain text</code>.
     * </p>
     * 
     * @return Indicates the text format in the report. The options are <code>PLAIN_TEXT</code> or <code>MARKDOWN</code>
     *         . The default value is <code>plain text</code>.
     * @see TextFormat
     */

    public String getTextFormat() {
        return this.textFormat;
    }

    /**
     * <p>
     * Indicates the text format in the report. The options are <code>PLAIN_TEXT</code> or <code>MARKDOWN</code>. The
     * default value is <code>plain text</code>.
     * </p>
     * 
     * @param textFormat
     *        Indicates the text format in the report. The options are <code>PLAIN_TEXT</code> or <code>MARKDOWN</code>.
     *        The default value is <code>plain text</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TextFormat
     */

    public GetPerformanceAnalysisReportRequest withTextFormat(String textFormat) {
        setTextFormat(textFormat);
        return this;
    }

    /**
     * <p>
     * Indicates the text format in the report. The options are <code>PLAIN_TEXT</code> or <code>MARKDOWN</code>. The
     * default value is <code>plain text</code>.
     * </p>
     * 
     * @param textFormat
     *        Indicates the text format in the report. The options are <code>PLAIN_TEXT</code> or <code>MARKDOWN</code>.
     *        The default value is <code>plain text</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TextFormat
     */

    public GetPerformanceAnalysisReportRequest withTextFormat(TextFormat textFormat) {
        this.textFormat = textFormat.toString();
        return this;
    }

    /**
     * <p>
     * The text language in the report. The default language is <code>EN_US</code> (English).
     * </p>
     * 
     * @param acceptLanguage
     *        The text language in the report. The default language is <code>EN_US</code> (English).
     * @see AcceptLanguage
     */

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    /**
     * <p>
     * The text language in the report. The default language is <code>EN_US</code> (English).
     * </p>
     * 
     * @return The text language in the report. The default language is <code>EN_US</code> (English).
     * @see AcceptLanguage
     */

    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * <p>
     * The text language in the report. The default language is <code>EN_US</code> (English).
     * </p>
     * 
     * @param acceptLanguage
     *        The text language in the report. The default language is <code>EN_US</code> (English).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceptLanguage
     */

    public GetPerformanceAnalysisReportRequest withAcceptLanguage(String acceptLanguage) {
        setAcceptLanguage(acceptLanguage);
        return this;
    }

    /**
     * <p>
     * The text language in the report. The default language is <code>EN_US</code> (English).
     * </p>
     * 
     * @param acceptLanguage
     *        The text language in the report. The default language is <code>EN_US</code> (English).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceptLanguage
     */

    public GetPerformanceAnalysisReportRequest withAcceptLanguage(AcceptLanguage acceptLanguage) {
        this.acceptLanguage = acceptLanguage.toString();
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
        if (getServiceType() != null)
            sb.append("ServiceType: ").append(getServiceType()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getAnalysisReportId() != null)
            sb.append("AnalysisReportId: ").append(getAnalysisReportId()).append(",");
        if (getTextFormat() != null)
            sb.append("TextFormat: ").append(getTextFormat()).append(",");
        if (getAcceptLanguage() != null)
            sb.append("AcceptLanguage: ").append(getAcceptLanguage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPerformanceAnalysisReportRequest == false)
            return false;
        GetPerformanceAnalysisReportRequest other = (GetPerformanceAnalysisReportRequest) obj;
        if (other.getServiceType() == null ^ this.getServiceType() == null)
            return false;
        if (other.getServiceType() != null && other.getServiceType().equals(this.getServiceType()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getAnalysisReportId() == null ^ this.getAnalysisReportId() == null)
            return false;
        if (other.getAnalysisReportId() != null && other.getAnalysisReportId().equals(this.getAnalysisReportId()) == false)
            return false;
        if (other.getTextFormat() == null ^ this.getTextFormat() == null)
            return false;
        if (other.getTextFormat() != null && other.getTextFormat().equals(this.getTextFormat()) == false)
            return false;
        if (other.getAcceptLanguage() == null ^ this.getAcceptLanguage() == null)
            return false;
        if (other.getAcceptLanguage() != null && other.getAcceptLanguage().equals(this.getAcceptLanguage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceType() == null) ? 0 : getServiceType().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getAnalysisReportId() == null) ? 0 : getAnalysisReportId().hashCode());
        hashCode = prime * hashCode + ((getTextFormat() == null) ? 0 : getTextFormat().hashCode());
        hashCode = prime * hashCode + ((getAcceptLanguage() == null) ? 0 : getAcceptLanguage().hashCode());
        return hashCode;
    }

    @Override
    public GetPerformanceAnalysisReportRequest clone() {
        return (GetPerformanceAnalysisReportRequest) super.clone();
    }

}
