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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the summary of the assessment results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/AssessmentSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssessmentSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 object containing the anti-pattern report.
     * </p>
     */
    private S3Object antipatternReportS3Object;
    /**
     * <p>
     * The status of the anti-pattern report.
     * </p>
     */
    private String antipatternReportStatus;
    /**
     * <p>
     * The status message of the anti-pattern report.
     * </p>
     */
    private String antipatternReportStatusMessage;
    /**
     * <p>
     * The time the assessment was performed.
     * </p>
     */
    private java.util.Date lastAnalyzedTimestamp;
    /**
     * <p>
     * List of AntipatternSeveritySummary.
     * </p>
     */
    private java.util.List<AntipatternSeveritySummary> listAntipatternSeveritySummary;
    /**
     * <p>
     * List of status summaries of the analyzed application components.
     * </p>
     */
    private java.util.List<ApplicationComponentStatusSummary> listApplicationComponentStatusSummary;
    /**
     * <p>
     * List of ApplicationComponentStrategySummary.
     * </p>
     */
    private java.util.List<StrategySummary> listApplicationComponentStrategySummary;
    /**
     * <p>
     * List of ApplicationComponentSummary.
     * </p>
     */
    private java.util.List<ApplicationComponentSummary> listApplicationComponentSummary;
    /**
     * <p>
     * List of status summaries of the analyzed servers.
     * </p>
     */
    private java.util.List<ServerStatusSummary> listServerStatusSummary;
    /**
     * <p>
     * List of ServerStrategySummary.
     * </p>
     */
    private java.util.List<StrategySummary> listServerStrategySummary;
    /**
     * <p>
     * List of ServerSummary.
     * </p>
     */
    private java.util.List<ServerSummary> listServerSummary;

    /**
     * <p>
     * The Amazon S3 object containing the anti-pattern report.
     * </p>
     * 
     * @param antipatternReportS3Object
     *        The Amazon S3 object containing the anti-pattern report.
     */

    public void setAntipatternReportS3Object(S3Object antipatternReportS3Object) {
        this.antipatternReportS3Object = antipatternReportS3Object;
    }

    /**
     * <p>
     * The Amazon S3 object containing the anti-pattern report.
     * </p>
     * 
     * @return The Amazon S3 object containing the anti-pattern report.
     */

    public S3Object getAntipatternReportS3Object() {
        return this.antipatternReportS3Object;
    }

    /**
     * <p>
     * The Amazon S3 object containing the anti-pattern report.
     * </p>
     * 
     * @param antipatternReportS3Object
     *        The Amazon S3 object containing the anti-pattern report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentSummary withAntipatternReportS3Object(S3Object antipatternReportS3Object) {
        setAntipatternReportS3Object(antipatternReportS3Object);
        return this;
    }

    /**
     * <p>
     * The status of the anti-pattern report.
     * </p>
     * 
     * @param antipatternReportStatus
     *        The status of the anti-pattern report.
     * @see AntipatternReportStatus
     */

    public void setAntipatternReportStatus(String antipatternReportStatus) {
        this.antipatternReportStatus = antipatternReportStatus;
    }

    /**
     * <p>
     * The status of the anti-pattern report.
     * </p>
     * 
     * @return The status of the anti-pattern report.
     * @see AntipatternReportStatus
     */

    public String getAntipatternReportStatus() {
        return this.antipatternReportStatus;
    }

    /**
     * <p>
     * The status of the anti-pattern report.
     * </p>
     * 
     * @param antipatternReportStatus
     *        The status of the anti-pattern report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AntipatternReportStatus
     */

    public AssessmentSummary withAntipatternReportStatus(String antipatternReportStatus) {
        setAntipatternReportStatus(antipatternReportStatus);
        return this;
    }

    /**
     * <p>
     * The status of the anti-pattern report.
     * </p>
     * 
     * @param antipatternReportStatus
     *        The status of the anti-pattern report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AntipatternReportStatus
     */

    public AssessmentSummary withAntipatternReportStatus(AntipatternReportStatus antipatternReportStatus) {
        this.antipatternReportStatus = antipatternReportStatus.toString();
        return this;
    }

    /**
     * <p>
     * The status message of the anti-pattern report.
     * </p>
     * 
     * @param antipatternReportStatusMessage
     *        The status message of the anti-pattern report.
     */

    public void setAntipatternReportStatusMessage(String antipatternReportStatusMessage) {
        this.antipatternReportStatusMessage = antipatternReportStatusMessage;
    }

    /**
     * <p>
     * The status message of the anti-pattern report.
     * </p>
     * 
     * @return The status message of the anti-pattern report.
     */

    public String getAntipatternReportStatusMessage() {
        return this.antipatternReportStatusMessage;
    }

    /**
     * <p>
     * The status message of the anti-pattern report.
     * </p>
     * 
     * @param antipatternReportStatusMessage
     *        The status message of the anti-pattern report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentSummary withAntipatternReportStatusMessage(String antipatternReportStatusMessage) {
        setAntipatternReportStatusMessage(antipatternReportStatusMessage);
        return this;
    }

    /**
     * <p>
     * The time the assessment was performed.
     * </p>
     * 
     * @param lastAnalyzedTimestamp
     *        The time the assessment was performed.
     */

    public void setLastAnalyzedTimestamp(java.util.Date lastAnalyzedTimestamp) {
        this.lastAnalyzedTimestamp = lastAnalyzedTimestamp;
    }

    /**
     * <p>
     * The time the assessment was performed.
     * </p>
     * 
     * @return The time the assessment was performed.
     */

    public java.util.Date getLastAnalyzedTimestamp() {
        return this.lastAnalyzedTimestamp;
    }

    /**
     * <p>
     * The time the assessment was performed.
     * </p>
     * 
     * @param lastAnalyzedTimestamp
     *        The time the assessment was performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentSummary withLastAnalyzedTimestamp(java.util.Date lastAnalyzedTimestamp) {
        setLastAnalyzedTimestamp(lastAnalyzedTimestamp);
        return this;
    }

    /**
     * <p>
     * List of AntipatternSeveritySummary.
     * </p>
     * 
     * @return List of AntipatternSeveritySummary.
     */

    public java.util.List<AntipatternSeveritySummary> getListAntipatternSeveritySummary() {
        return listAntipatternSeveritySummary;
    }

    /**
     * <p>
     * List of AntipatternSeveritySummary.
     * </p>
     * 
     * @param listAntipatternSeveritySummary
     *        List of AntipatternSeveritySummary.
     */

    public void setListAntipatternSeveritySummary(java.util.Collection<AntipatternSeveritySummary> listAntipatternSeveritySummary) {
        if (listAntipatternSeveritySummary == null) {
            this.listAntipatternSeveritySummary = null;
            return;
        }

        this.listAntipatternSeveritySummary = new java.util.ArrayList<AntipatternSeveritySummary>(listAntipatternSeveritySummary);
    }

    /**
     * <p>
     * List of AntipatternSeveritySummary.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setListAntipatternSeveritySummary(java.util.Collection)} or
     * {@link #withListAntipatternSeveritySummary(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param listAntipatternSeveritySummary
     *        List of AntipatternSeveritySummary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentSummary withListAntipatternSeveritySummary(AntipatternSeveritySummary... listAntipatternSeveritySummary) {
        if (this.listAntipatternSeveritySummary == null) {
            setListAntipatternSeveritySummary(new java.util.ArrayList<AntipatternSeveritySummary>(listAntipatternSeveritySummary.length));
        }
        for (AntipatternSeveritySummary ele : listAntipatternSeveritySummary) {
            this.listAntipatternSeveritySummary.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of AntipatternSeveritySummary.
     * </p>
     * 
     * @param listAntipatternSeveritySummary
     *        List of AntipatternSeveritySummary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentSummary withListAntipatternSeveritySummary(java.util.Collection<AntipatternSeveritySummary> listAntipatternSeveritySummary) {
        setListAntipatternSeveritySummary(listAntipatternSeveritySummary);
        return this;
    }

    /**
     * <p>
     * List of status summaries of the analyzed application components.
     * </p>
     * 
     * @return List of status summaries of the analyzed application components.
     */

    public java.util.List<ApplicationComponentStatusSummary> getListApplicationComponentStatusSummary() {
        return listApplicationComponentStatusSummary;
    }

    /**
     * <p>
     * List of status summaries of the analyzed application components.
     * </p>
     * 
     * @param listApplicationComponentStatusSummary
     *        List of status summaries of the analyzed application components.
     */

    public void setListApplicationComponentStatusSummary(java.util.Collection<ApplicationComponentStatusSummary> listApplicationComponentStatusSummary) {
        if (listApplicationComponentStatusSummary == null) {
            this.listApplicationComponentStatusSummary = null;
            return;
        }

        this.listApplicationComponentStatusSummary = new java.util.ArrayList<ApplicationComponentStatusSummary>(listApplicationComponentStatusSummary);
    }

    /**
     * <p>
     * List of status summaries of the analyzed application components.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setListApplicationComponentStatusSummary(java.util.Collection)} or
     * {@link #withListApplicationComponentStatusSummary(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param listApplicationComponentStatusSummary
     *        List of status summaries of the analyzed application components.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentSummary withListApplicationComponentStatusSummary(ApplicationComponentStatusSummary... listApplicationComponentStatusSummary) {
        if (this.listApplicationComponentStatusSummary == null) {
            setListApplicationComponentStatusSummary(new java.util.ArrayList<ApplicationComponentStatusSummary>(listApplicationComponentStatusSummary.length));
        }
        for (ApplicationComponentStatusSummary ele : listApplicationComponentStatusSummary) {
            this.listApplicationComponentStatusSummary.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of status summaries of the analyzed application components.
     * </p>
     * 
     * @param listApplicationComponentStatusSummary
     *        List of status summaries of the analyzed application components.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentSummary withListApplicationComponentStatusSummary(
            java.util.Collection<ApplicationComponentStatusSummary> listApplicationComponentStatusSummary) {
        setListApplicationComponentStatusSummary(listApplicationComponentStatusSummary);
        return this;
    }

    /**
     * <p>
     * List of ApplicationComponentStrategySummary.
     * </p>
     * 
     * @return List of ApplicationComponentStrategySummary.
     */

    public java.util.List<StrategySummary> getListApplicationComponentStrategySummary() {
        return listApplicationComponentStrategySummary;
    }

    /**
     * <p>
     * List of ApplicationComponentStrategySummary.
     * </p>
     * 
     * @param listApplicationComponentStrategySummary
     *        List of ApplicationComponentStrategySummary.
     */

    public void setListApplicationComponentStrategySummary(java.util.Collection<StrategySummary> listApplicationComponentStrategySummary) {
        if (listApplicationComponentStrategySummary == null) {
            this.listApplicationComponentStrategySummary = null;
            return;
        }

        this.listApplicationComponentStrategySummary = new java.util.ArrayList<StrategySummary>(listApplicationComponentStrategySummary);
    }

    /**
     * <p>
     * List of ApplicationComponentStrategySummary.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setListApplicationComponentStrategySummary(java.util.Collection)} or
     * {@link #withListApplicationComponentStrategySummary(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param listApplicationComponentStrategySummary
     *        List of ApplicationComponentStrategySummary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentSummary withListApplicationComponentStrategySummary(StrategySummary... listApplicationComponentStrategySummary) {
        if (this.listApplicationComponentStrategySummary == null) {
            setListApplicationComponentStrategySummary(new java.util.ArrayList<StrategySummary>(listApplicationComponentStrategySummary.length));
        }
        for (StrategySummary ele : listApplicationComponentStrategySummary) {
            this.listApplicationComponentStrategySummary.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of ApplicationComponentStrategySummary.
     * </p>
     * 
     * @param listApplicationComponentStrategySummary
     *        List of ApplicationComponentStrategySummary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentSummary withListApplicationComponentStrategySummary(java.util.Collection<StrategySummary> listApplicationComponentStrategySummary) {
        setListApplicationComponentStrategySummary(listApplicationComponentStrategySummary);
        return this;
    }

    /**
     * <p>
     * List of ApplicationComponentSummary.
     * </p>
     * 
     * @return List of ApplicationComponentSummary.
     */

    public java.util.List<ApplicationComponentSummary> getListApplicationComponentSummary() {
        return listApplicationComponentSummary;
    }

    /**
     * <p>
     * List of ApplicationComponentSummary.
     * </p>
     * 
     * @param listApplicationComponentSummary
     *        List of ApplicationComponentSummary.
     */

    public void setListApplicationComponentSummary(java.util.Collection<ApplicationComponentSummary> listApplicationComponentSummary) {
        if (listApplicationComponentSummary == null) {
            this.listApplicationComponentSummary = null;
            return;
        }

        this.listApplicationComponentSummary = new java.util.ArrayList<ApplicationComponentSummary>(listApplicationComponentSummary);
    }

    /**
     * <p>
     * List of ApplicationComponentSummary.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setListApplicationComponentSummary(java.util.Collection)} or
     * {@link #withListApplicationComponentSummary(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param listApplicationComponentSummary
     *        List of ApplicationComponentSummary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentSummary withListApplicationComponentSummary(ApplicationComponentSummary... listApplicationComponentSummary) {
        if (this.listApplicationComponentSummary == null) {
            setListApplicationComponentSummary(new java.util.ArrayList<ApplicationComponentSummary>(listApplicationComponentSummary.length));
        }
        for (ApplicationComponentSummary ele : listApplicationComponentSummary) {
            this.listApplicationComponentSummary.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of ApplicationComponentSummary.
     * </p>
     * 
     * @param listApplicationComponentSummary
     *        List of ApplicationComponentSummary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentSummary withListApplicationComponentSummary(java.util.Collection<ApplicationComponentSummary> listApplicationComponentSummary) {
        setListApplicationComponentSummary(listApplicationComponentSummary);
        return this;
    }

    /**
     * <p>
     * List of status summaries of the analyzed servers.
     * </p>
     * 
     * @return List of status summaries of the analyzed servers.
     */

    public java.util.List<ServerStatusSummary> getListServerStatusSummary() {
        return listServerStatusSummary;
    }

    /**
     * <p>
     * List of status summaries of the analyzed servers.
     * </p>
     * 
     * @param listServerStatusSummary
     *        List of status summaries of the analyzed servers.
     */

    public void setListServerStatusSummary(java.util.Collection<ServerStatusSummary> listServerStatusSummary) {
        if (listServerStatusSummary == null) {
            this.listServerStatusSummary = null;
            return;
        }

        this.listServerStatusSummary = new java.util.ArrayList<ServerStatusSummary>(listServerStatusSummary);
    }

    /**
     * <p>
     * List of status summaries of the analyzed servers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setListServerStatusSummary(java.util.Collection)} or
     * {@link #withListServerStatusSummary(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param listServerStatusSummary
     *        List of status summaries of the analyzed servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentSummary withListServerStatusSummary(ServerStatusSummary... listServerStatusSummary) {
        if (this.listServerStatusSummary == null) {
            setListServerStatusSummary(new java.util.ArrayList<ServerStatusSummary>(listServerStatusSummary.length));
        }
        for (ServerStatusSummary ele : listServerStatusSummary) {
            this.listServerStatusSummary.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of status summaries of the analyzed servers.
     * </p>
     * 
     * @param listServerStatusSummary
     *        List of status summaries of the analyzed servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentSummary withListServerStatusSummary(java.util.Collection<ServerStatusSummary> listServerStatusSummary) {
        setListServerStatusSummary(listServerStatusSummary);
        return this;
    }

    /**
     * <p>
     * List of ServerStrategySummary.
     * </p>
     * 
     * @return List of ServerStrategySummary.
     */

    public java.util.List<StrategySummary> getListServerStrategySummary() {
        return listServerStrategySummary;
    }

    /**
     * <p>
     * List of ServerStrategySummary.
     * </p>
     * 
     * @param listServerStrategySummary
     *        List of ServerStrategySummary.
     */

    public void setListServerStrategySummary(java.util.Collection<StrategySummary> listServerStrategySummary) {
        if (listServerStrategySummary == null) {
            this.listServerStrategySummary = null;
            return;
        }

        this.listServerStrategySummary = new java.util.ArrayList<StrategySummary>(listServerStrategySummary);
    }

    /**
     * <p>
     * List of ServerStrategySummary.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setListServerStrategySummary(java.util.Collection)} or
     * {@link #withListServerStrategySummary(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param listServerStrategySummary
     *        List of ServerStrategySummary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentSummary withListServerStrategySummary(StrategySummary... listServerStrategySummary) {
        if (this.listServerStrategySummary == null) {
            setListServerStrategySummary(new java.util.ArrayList<StrategySummary>(listServerStrategySummary.length));
        }
        for (StrategySummary ele : listServerStrategySummary) {
            this.listServerStrategySummary.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of ServerStrategySummary.
     * </p>
     * 
     * @param listServerStrategySummary
     *        List of ServerStrategySummary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentSummary withListServerStrategySummary(java.util.Collection<StrategySummary> listServerStrategySummary) {
        setListServerStrategySummary(listServerStrategySummary);
        return this;
    }

    /**
     * <p>
     * List of ServerSummary.
     * </p>
     * 
     * @return List of ServerSummary.
     */

    public java.util.List<ServerSummary> getListServerSummary() {
        return listServerSummary;
    }

    /**
     * <p>
     * List of ServerSummary.
     * </p>
     * 
     * @param listServerSummary
     *        List of ServerSummary.
     */

    public void setListServerSummary(java.util.Collection<ServerSummary> listServerSummary) {
        if (listServerSummary == null) {
            this.listServerSummary = null;
            return;
        }

        this.listServerSummary = new java.util.ArrayList<ServerSummary>(listServerSummary);
    }

    /**
     * <p>
     * List of ServerSummary.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setListServerSummary(java.util.Collection)} or {@link #withListServerSummary(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param listServerSummary
     *        List of ServerSummary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentSummary withListServerSummary(ServerSummary... listServerSummary) {
        if (this.listServerSummary == null) {
            setListServerSummary(new java.util.ArrayList<ServerSummary>(listServerSummary.length));
        }
        for (ServerSummary ele : listServerSummary) {
            this.listServerSummary.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of ServerSummary.
     * </p>
     * 
     * @param listServerSummary
     *        List of ServerSummary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentSummary withListServerSummary(java.util.Collection<ServerSummary> listServerSummary) {
        setListServerSummary(listServerSummary);
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
        if (getAntipatternReportS3Object() != null)
            sb.append("AntipatternReportS3Object: ").append(getAntipatternReportS3Object()).append(",");
        if (getAntipatternReportStatus() != null)
            sb.append("AntipatternReportStatus: ").append(getAntipatternReportStatus()).append(",");
        if (getAntipatternReportStatusMessage() != null)
            sb.append("AntipatternReportStatusMessage: ").append(getAntipatternReportStatusMessage()).append(",");
        if (getLastAnalyzedTimestamp() != null)
            sb.append("LastAnalyzedTimestamp: ").append(getLastAnalyzedTimestamp()).append(",");
        if (getListAntipatternSeveritySummary() != null)
            sb.append("ListAntipatternSeveritySummary: ").append(getListAntipatternSeveritySummary()).append(",");
        if (getListApplicationComponentStatusSummary() != null)
            sb.append("ListApplicationComponentStatusSummary: ").append(getListApplicationComponentStatusSummary()).append(",");
        if (getListApplicationComponentStrategySummary() != null)
            sb.append("ListApplicationComponentStrategySummary: ").append(getListApplicationComponentStrategySummary()).append(",");
        if (getListApplicationComponentSummary() != null)
            sb.append("ListApplicationComponentSummary: ").append(getListApplicationComponentSummary()).append(",");
        if (getListServerStatusSummary() != null)
            sb.append("ListServerStatusSummary: ").append(getListServerStatusSummary()).append(",");
        if (getListServerStrategySummary() != null)
            sb.append("ListServerStrategySummary: ").append(getListServerStrategySummary()).append(",");
        if (getListServerSummary() != null)
            sb.append("ListServerSummary: ").append(getListServerSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssessmentSummary == false)
            return false;
        AssessmentSummary other = (AssessmentSummary) obj;
        if (other.getAntipatternReportS3Object() == null ^ this.getAntipatternReportS3Object() == null)
            return false;
        if (other.getAntipatternReportS3Object() != null && other.getAntipatternReportS3Object().equals(this.getAntipatternReportS3Object()) == false)
            return false;
        if (other.getAntipatternReportStatus() == null ^ this.getAntipatternReportStatus() == null)
            return false;
        if (other.getAntipatternReportStatus() != null && other.getAntipatternReportStatus().equals(this.getAntipatternReportStatus()) == false)
            return false;
        if (other.getAntipatternReportStatusMessage() == null ^ this.getAntipatternReportStatusMessage() == null)
            return false;
        if (other.getAntipatternReportStatusMessage() != null
                && other.getAntipatternReportStatusMessage().equals(this.getAntipatternReportStatusMessage()) == false)
            return false;
        if (other.getLastAnalyzedTimestamp() == null ^ this.getLastAnalyzedTimestamp() == null)
            return false;
        if (other.getLastAnalyzedTimestamp() != null && other.getLastAnalyzedTimestamp().equals(this.getLastAnalyzedTimestamp()) == false)
            return false;
        if (other.getListAntipatternSeveritySummary() == null ^ this.getListAntipatternSeveritySummary() == null)
            return false;
        if (other.getListAntipatternSeveritySummary() != null
                && other.getListAntipatternSeveritySummary().equals(this.getListAntipatternSeveritySummary()) == false)
            return false;
        if (other.getListApplicationComponentStatusSummary() == null ^ this.getListApplicationComponentStatusSummary() == null)
            return false;
        if (other.getListApplicationComponentStatusSummary() != null
                && other.getListApplicationComponentStatusSummary().equals(this.getListApplicationComponentStatusSummary()) == false)
            return false;
        if (other.getListApplicationComponentStrategySummary() == null ^ this.getListApplicationComponentStrategySummary() == null)
            return false;
        if (other.getListApplicationComponentStrategySummary() != null
                && other.getListApplicationComponentStrategySummary().equals(this.getListApplicationComponentStrategySummary()) == false)
            return false;
        if (other.getListApplicationComponentSummary() == null ^ this.getListApplicationComponentSummary() == null)
            return false;
        if (other.getListApplicationComponentSummary() != null
                && other.getListApplicationComponentSummary().equals(this.getListApplicationComponentSummary()) == false)
            return false;
        if (other.getListServerStatusSummary() == null ^ this.getListServerStatusSummary() == null)
            return false;
        if (other.getListServerStatusSummary() != null && other.getListServerStatusSummary().equals(this.getListServerStatusSummary()) == false)
            return false;
        if (other.getListServerStrategySummary() == null ^ this.getListServerStrategySummary() == null)
            return false;
        if (other.getListServerStrategySummary() != null && other.getListServerStrategySummary().equals(this.getListServerStrategySummary()) == false)
            return false;
        if (other.getListServerSummary() == null ^ this.getListServerSummary() == null)
            return false;
        if (other.getListServerSummary() != null && other.getListServerSummary().equals(this.getListServerSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAntipatternReportS3Object() == null) ? 0 : getAntipatternReportS3Object().hashCode());
        hashCode = prime * hashCode + ((getAntipatternReportStatus() == null) ? 0 : getAntipatternReportStatus().hashCode());
        hashCode = prime * hashCode + ((getAntipatternReportStatusMessage() == null) ? 0 : getAntipatternReportStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getLastAnalyzedTimestamp() == null) ? 0 : getLastAnalyzedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getListAntipatternSeveritySummary() == null) ? 0 : getListAntipatternSeveritySummary().hashCode());
        hashCode = prime * hashCode + ((getListApplicationComponentStatusSummary() == null) ? 0 : getListApplicationComponentStatusSummary().hashCode());
        hashCode = prime * hashCode + ((getListApplicationComponentStrategySummary() == null) ? 0 : getListApplicationComponentStrategySummary().hashCode());
        hashCode = prime * hashCode + ((getListApplicationComponentSummary() == null) ? 0 : getListApplicationComponentSummary().hashCode());
        hashCode = prime * hashCode + ((getListServerStatusSummary() == null) ? 0 : getListServerStatusSummary().hashCode());
        hashCode = prime * hashCode + ((getListServerStrategySummary() == null) ? 0 : getListServerStrategySummary().hashCode());
        hashCode = prime * hashCode + ((getListServerSummary() == null) ? 0 : getListServerSummary().hashCode());
        return hashCode;
    }

    @Override
    public AssessmentSummary clone() {
        try {
            return (AssessmentSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.AssessmentSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
