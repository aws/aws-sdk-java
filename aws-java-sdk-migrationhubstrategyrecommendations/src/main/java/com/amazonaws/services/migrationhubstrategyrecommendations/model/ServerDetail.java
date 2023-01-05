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
 * Detailed information about a server.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/ServerDetail" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServerDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The S3 bucket name and Amazon S3 key name for anti-pattern report.
     * </p>
     */
    private S3Object antipatternReportS3Object;
    /**
     * <p>
     * The status of the anti-pattern report generation.
     * </p>
     */
    private String antipatternReportStatus;
    /**
     * <p>
     * A message about the status of the anti-pattern report generation.
     * </p>
     */
    private String antipatternReportStatusMessage;
    /**
     * <p>
     * A list of strategy summaries.
     * </p>
     */
    private java.util.List<StrategySummary> applicationComponentStrategySummary;
    /**
     * <p>
     * The status of assessment for the server.
     * </p>
     */
    private String dataCollectionStatus;
    /**
     * <p>
     * The server ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The timestamp of when the server was assessed.
     * </p>
     */
    private java.util.Date lastAnalyzedTimestamp;
    /**
     * <p>
     * A list of anti-pattern severity summaries.
     * </p>
     */
    private java.util.List<AntipatternSeveritySummary> listAntipatternSeveritySummary;
    /**
     * <p>
     * The name of the server.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A set of recommendations.
     * </p>
     */
    private RecommendationSet recommendationSet;
    /**
     * <p>
     * The error in server analysis.
     * </p>
     */
    private ServerError serverError;
    /**
     * <p>
     * The type of server.
     * </p>
     */
    private String serverType;
    /**
     * <p>
     * A message about the status of data collection, which contains detailed descriptions of any error messages.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * System information about the server.
     * </p>
     */
    private SystemInfo systemInfo;

    /**
     * <p>
     * The S3 bucket name and Amazon S3 key name for anti-pattern report.
     * </p>
     * 
     * @param antipatternReportS3Object
     *        The S3 bucket name and Amazon S3 key name for anti-pattern report.
     */

    public void setAntipatternReportS3Object(S3Object antipatternReportS3Object) {
        this.antipatternReportS3Object = antipatternReportS3Object;
    }

    /**
     * <p>
     * The S3 bucket name and Amazon S3 key name for anti-pattern report.
     * </p>
     * 
     * @return The S3 bucket name and Amazon S3 key name for anti-pattern report.
     */

    public S3Object getAntipatternReportS3Object() {
        return this.antipatternReportS3Object;
    }

    /**
     * <p>
     * The S3 bucket name and Amazon S3 key name for anti-pattern report.
     * </p>
     * 
     * @param antipatternReportS3Object
     *        The S3 bucket name and Amazon S3 key name for anti-pattern report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerDetail withAntipatternReportS3Object(S3Object antipatternReportS3Object) {
        setAntipatternReportS3Object(antipatternReportS3Object);
        return this;
    }

    /**
     * <p>
     * The status of the anti-pattern report generation.
     * </p>
     * 
     * @param antipatternReportStatus
     *        The status of the anti-pattern report generation.
     * @see AntipatternReportStatus
     */

    public void setAntipatternReportStatus(String antipatternReportStatus) {
        this.antipatternReportStatus = antipatternReportStatus;
    }

    /**
     * <p>
     * The status of the anti-pattern report generation.
     * </p>
     * 
     * @return The status of the anti-pattern report generation.
     * @see AntipatternReportStatus
     */

    public String getAntipatternReportStatus() {
        return this.antipatternReportStatus;
    }

    /**
     * <p>
     * The status of the anti-pattern report generation.
     * </p>
     * 
     * @param antipatternReportStatus
     *        The status of the anti-pattern report generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AntipatternReportStatus
     */

    public ServerDetail withAntipatternReportStatus(String antipatternReportStatus) {
        setAntipatternReportStatus(antipatternReportStatus);
        return this;
    }

    /**
     * <p>
     * The status of the anti-pattern report generation.
     * </p>
     * 
     * @param antipatternReportStatus
     *        The status of the anti-pattern report generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AntipatternReportStatus
     */

    public ServerDetail withAntipatternReportStatus(AntipatternReportStatus antipatternReportStatus) {
        this.antipatternReportStatus = antipatternReportStatus.toString();
        return this;
    }

    /**
     * <p>
     * A message about the status of the anti-pattern report generation.
     * </p>
     * 
     * @param antipatternReportStatusMessage
     *        A message about the status of the anti-pattern report generation.
     */

    public void setAntipatternReportStatusMessage(String antipatternReportStatusMessage) {
        this.antipatternReportStatusMessage = antipatternReportStatusMessage;
    }

    /**
     * <p>
     * A message about the status of the anti-pattern report generation.
     * </p>
     * 
     * @return A message about the status of the anti-pattern report generation.
     */

    public String getAntipatternReportStatusMessage() {
        return this.antipatternReportStatusMessage;
    }

    /**
     * <p>
     * A message about the status of the anti-pattern report generation.
     * </p>
     * 
     * @param antipatternReportStatusMessage
     *        A message about the status of the anti-pattern report generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerDetail withAntipatternReportStatusMessage(String antipatternReportStatusMessage) {
        setAntipatternReportStatusMessage(antipatternReportStatusMessage);
        return this;
    }

    /**
     * <p>
     * A list of strategy summaries.
     * </p>
     * 
     * @return A list of strategy summaries.
     */

    public java.util.List<StrategySummary> getApplicationComponentStrategySummary() {
        return applicationComponentStrategySummary;
    }

    /**
     * <p>
     * A list of strategy summaries.
     * </p>
     * 
     * @param applicationComponentStrategySummary
     *        A list of strategy summaries.
     */

    public void setApplicationComponentStrategySummary(java.util.Collection<StrategySummary> applicationComponentStrategySummary) {
        if (applicationComponentStrategySummary == null) {
            this.applicationComponentStrategySummary = null;
            return;
        }

        this.applicationComponentStrategySummary = new java.util.ArrayList<StrategySummary>(applicationComponentStrategySummary);
    }

    /**
     * <p>
     * A list of strategy summaries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplicationComponentStrategySummary(java.util.Collection)} or
     * {@link #withApplicationComponentStrategySummary(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param applicationComponentStrategySummary
     *        A list of strategy summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerDetail withApplicationComponentStrategySummary(StrategySummary... applicationComponentStrategySummary) {
        if (this.applicationComponentStrategySummary == null) {
            setApplicationComponentStrategySummary(new java.util.ArrayList<StrategySummary>(applicationComponentStrategySummary.length));
        }
        for (StrategySummary ele : applicationComponentStrategySummary) {
            this.applicationComponentStrategySummary.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of strategy summaries.
     * </p>
     * 
     * @param applicationComponentStrategySummary
     *        A list of strategy summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerDetail withApplicationComponentStrategySummary(java.util.Collection<StrategySummary> applicationComponentStrategySummary) {
        setApplicationComponentStrategySummary(applicationComponentStrategySummary);
        return this;
    }

    /**
     * <p>
     * The status of assessment for the server.
     * </p>
     * 
     * @param dataCollectionStatus
     *        The status of assessment for the server.
     * @see RunTimeAssessmentStatus
     */

    public void setDataCollectionStatus(String dataCollectionStatus) {
        this.dataCollectionStatus = dataCollectionStatus;
    }

    /**
     * <p>
     * The status of assessment for the server.
     * </p>
     * 
     * @return The status of assessment for the server.
     * @see RunTimeAssessmentStatus
     */

    public String getDataCollectionStatus() {
        return this.dataCollectionStatus;
    }

    /**
     * <p>
     * The status of assessment for the server.
     * </p>
     * 
     * @param dataCollectionStatus
     *        The status of assessment for the server.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RunTimeAssessmentStatus
     */

    public ServerDetail withDataCollectionStatus(String dataCollectionStatus) {
        setDataCollectionStatus(dataCollectionStatus);
        return this;
    }

    /**
     * <p>
     * The status of assessment for the server.
     * </p>
     * 
     * @param dataCollectionStatus
     *        The status of assessment for the server.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RunTimeAssessmentStatus
     */

    public ServerDetail withDataCollectionStatus(RunTimeAssessmentStatus dataCollectionStatus) {
        this.dataCollectionStatus = dataCollectionStatus.toString();
        return this;
    }

    /**
     * <p>
     * The server ID.
     * </p>
     * 
     * @param id
     *        The server ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The server ID.
     * </p>
     * 
     * @return The server ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The server ID.
     * </p>
     * 
     * @param id
     *        The server ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerDetail withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the server was assessed.
     * </p>
     * 
     * @param lastAnalyzedTimestamp
     *        The timestamp of when the server was assessed.
     */

    public void setLastAnalyzedTimestamp(java.util.Date lastAnalyzedTimestamp) {
        this.lastAnalyzedTimestamp = lastAnalyzedTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the server was assessed.
     * </p>
     * 
     * @return The timestamp of when the server was assessed.
     */

    public java.util.Date getLastAnalyzedTimestamp() {
        return this.lastAnalyzedTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the server was assessed.
     * </p>
     * 
     * @param lastAnalyzedTimestamp
     *        The timestamp of when the server was assessed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerDetail withLastAnalyzedTimestamp(java.util.Date lastAnalyzedTimestamp) {
        setLastAnalyzedTimestamp(lastAnalyzedTimestamp);
        return this;
    }

    /**
     * <p>
     * A list of anti-pattern severity summaries.
     * </p>
     * 
     * @return A list of anti-pattern severity summaries.
     */

    public java.util.List<AntipatternSeveritySummary> getListAntipatternSeveritySummary() {
        return listAntipatternSeveritySummary;
    }

    /**
     * <p>
     * A list of anti-pattern severity summaries.
     * </p>
     * 
     * @param listAntipatternSeveritySummary
     *        A list of anti-pattern severity summaries.
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
     * A list of anti-pattern severity summaries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setListAntipatternSeveritySummary(java.util.Collection)} or
     * {@link #withListAntipatternSeveritySummary(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param listAntipatternSeveritySummary
     *        A list of anti-pattern severity summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerDetail withListAntipatternSeveritySummary(AntipatternSeveritySummary... listAntipatternSeveritySummary) {
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
     * A list of anti-pattern severity summaries.
     * </p>
     * 
     * @param listAntipatternSeveritySummary
     *        A list of anti-pattern severity summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerDetail withListAntipatternSeveritySummary(java.util.Collection<AntipatternSeveritySummary> listAntipatternSeveritySummary) {
        setListAntipatternSeveritySummary(listAntipatternSeveritySummary);
        return this;
    }

    /**
     * <p>
     * The name of the server.
     * </p>
     * 
     * @param name
     *        The name of the server.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the server.
     * </p>
     * 
     * @return The name of the server.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the server.
     * </p>
     * 
     * @param name
     *        The name of the server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerDetail withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A set of recommendations.
     * </p>
     * 
     * @param recommendationSet
     *        A set of recommendations.
     */

    public void setRecommendationSet(RecommendationSet recommendationSet) {
        this.recommendationSet = recommendationSet;
    }

    /**
     * <p>
     * A set of recommendations.
     * </p>
     * 
     * @return A set of recommendations.
     */

    public RecommendationSet getRecommendationSet() {
        return this.recommendationSet;
    }

    /**
     * <p>
     * A set of recommendations.
     * </p>
     * 
     * @param recommendationSet
     *        A set of recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerDetail withRecommendationSet(RecommendationSet recommendationSet) {
        setRecommendationSet(recommendationSet);
        return this;
    }

    /**
     * <p>
     * The error in server analysis.
     * </p>
     * 
     * @param serverError
     *        The error in server analysis.
     */

    public void setServerError(ServerError serverError) {
        this.serverError = serverError;
    }

    /**
     * <p>
     * The error in server analysis.
     * </p>
     * 
     * @return The error in server analysis.
     */

    public ServerError getServerError() {
        return this.serverError;
    }

    /**
     * <p>
     * The error in server analysis.
     * </p>
     * 
     * @param serverError
     *        The error in server analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerDetail withServerError(ServerError serverError) {
        setServerError(serverError);
        return this;
    }

    /**
     * <p>
     * The type of server.
     * </p>
     * 
     * @param serverType
     *        The type of server.
     */

    public void setServerType(String serverType) {
        this.serverType = serverType;
    }

    /**
     * <p>
     * The type of server.
     * </p>
     * 
     * @return The type of server.
     */

    public String getServerType() {
        return this.serverType;
    }

    /**
     * <p>
     * The type of server.
     * </p>
     * 
     * @param serverType
     *        The type of server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerDetail withServerType(String serverType) {
        setServerType(serverType);
        return this;
    }

    /**
     * <p>
     * A message about the status of data collection, which contains detailed descriptions of any error messages.
     * </p>
     * 
     * @param statusMessage
     *        A message about the status of data collection, which contains detailed descriptions of any error messages.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A message about the status of data collection, which contains detailed descriptions of any error messages.
     * </p>
     * 
     * @return A message about the status of data collection, which contains detailed descriptions of any error
     *         messages.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A message about the status of data collection, which contains detailed descriptions of any error messages.
     * </p>
     * 
     * @param statusMessage
     *        A message about the status of data collection, which contains detailed descriptions of any error messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerDetail withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * System information about the server.
     * </p>
     * 
     * @param systemInfo
     *        System information about the server.
     */

    public void setSystemInfo(SystemInfo systemInfo) {
        this.systemInfo = systemInfo;
    }

    /**
     * <p>
     * System information about the server.
     * </p>
     * 
     * @return System information about the server.
     */

    public SystemInfo getSystemInfo() {
        return this.systemInfo;
    }

    /**
     * <p>
     * System information about the server.
     * </p>
     * 
     * @param systemInfo
     *        System information about the server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerDetail withSystemInfo(SystemInfo systemInfo) {
        setSystemInfo(systemInfo);
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
        if (getApplicationComponentStrategySummary() != null)
            sb.append("ApplicationComponentStrategySummary: ").append(getApplicationComponentStrategySummary()).append(",");
        if (getDataCollectionStatus() != null)
            sb.append("DataCollectionStatus: ").append(getDataCollectionStatus()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLastAnalyzedTimestamp() != null)
            sb.append("LastAnalyzedTimestamp: ").append(getLastAnalyzedTimestamp()).append(",");
        if (getListAntipatternSeveritySummary() != null)
            sb.append("ListAntipatternSeveritySummary: ").append(getListAntipatternSeveritySummary()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRecommendationSet() != null)
            sb.append("RecommendationSet: ").append(getRecommendationSet()).append(",");
        if (getServerError() != null)
            sb.append("ServerError: ").append(getServerError()).append(",");
        if (getServerType() != null)
            sb.append("ServerType: ").append(getServerType()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getSystemInfo() != null)
            sb.append("SystemInfo: ").append(getSystemInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServerDetail == false)
            return false;
        ServerDetail other = (ServerDetail) obj;
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
        if (other.getApplicationComponentStrategySummary() == null ^ this.getApplicationComponentStrategySummary() == null)
            return false;
        if (other.getApplicationComponentStrategySummary() != null
                && other.getApplicationComponentStrategySummary().equals(this.getApplicationComponentStrategySummary()) == false)
            return false;
        if (other.getDataCollectionStatus() == null ^ this.getDataCollectionStatus() == null)
            return false;
        if (other.getDataCollectionStatus() != null && other.getDataCollectionStatus().equals(this.getDataCollectionStatus()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRecommendationSet() == null ^ this.getRecommendationSet() == null)
            return false;
        if (other.getRecommendationSet() != null && other.getRecommendationSet().equals(this.getRecommendationSet()) == false)
            return false;
        if (other.getServerError() == null ^ this.getServerError() == null)
            return false;
        if (other.getServerError() != null && other.getServerError().equals(this.getServerError()) == false)
            return false;
        if (other.getServerType() == null ^ this.getServerType() == null)
            return false;
        if (other.getServerType() != null && other.getServerType().equals(this.getServerType()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getSystemInfo() == null ^ this.getSystemInfo() == null)
            return false;
        if (other.getSystemInfo() != null && other.getSystemInfo().equals(this.getSystemInfo()) == false)
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
        hashCode = prime * hashCode + ((getApplicationComponentStrategySummary() == null) ? 0 : getApplicationComponentStrategySummary().hashCode());
        hashCode = prime * hashCode + ((getDataCollectionStatus() == null) ? 0 : getDataCollectionStatus().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLastAnalyzedTimestamp() == null) ? 0 : getLastAnalyzedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getListAntipatternSeveritySummary() == null) ? 0 : getListAntipatternSeveritySummary().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRecommendationSet() == null) ? 0 : getRecommendationSet().hashCode());
        hashCode = prime * hashCode + ((getServerError() == null) ? 0 : getServerError().hashCode());
        hashCode = prime * hashCode + ((getServerType() == null) ? 0 : getServerType().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getSystemInfo() == null) ? 0 : getSystemInfo().hashCode());
        return hashCode;
    }

    @Override
    public ServerDetail clone() {
        try {
            return (ServerDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.ServerDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
