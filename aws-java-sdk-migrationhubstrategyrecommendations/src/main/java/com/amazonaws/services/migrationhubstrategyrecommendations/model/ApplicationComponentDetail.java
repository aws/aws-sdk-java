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
 * Contains detailed information about an application component.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/ApplicationComponentDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationComponentDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of analysis, if the application component has source code or an associated database.
     * </p>
     */
    private String analysisStatus;
    /**
     * <p>
     * The S3 bucket name and the Amazon S3 key name for the anti-pattern report.
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
     * The status message for the anti-pattern.
     * </p>
     */
    private String antipatternReportStatusMessage;
    /**
     * <p>
     * The type of application component.
     * </p>
     */
    private String appType;
    /**
     * <p>
     * The error in the analysis of the source code or database.
     * </p>
     */
    private AppUnitError appUnitError;
    /**
     * <p>
     * The ID of the server that the application component is running on.
     * </p>
     */
    private String associatedServerId;
    /**
     * <p>
     * Configuration details for the database associated with the application component.
     * </p>
     */
    private DatabaseConfigDetail databaseConfigDetail;
    /**
     * <p>
     * The ID of the application component.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Indicates whether the application component has been included for server recommendation or not.
     * </p>
     */
    private String inclusionStatus;
    /**
     * <p>
     * The timestamp of when the application component was assessed.
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
     * Set to true if the application component is running on multiple servers.
     * </p>
     */
    private Boolean moreServerAssociationExists;
    /**
     * <p>
     * The name of application component.
     * </p>
     */
    private String name;
    /**
     * <p>
     * OS driver.
     * </p>
     */
    private String osDriver;
    /**
     * <p>
     * OS version.
     * </p>
     */
    private String osVersion;
    /**
     * <p>
     * The top recommendation set for the application component.
     * </p>
     */
    private RecommendationSet recommendationSet;
    /**
     * <p>
     * The application component subtype.
     * </p>
     */
    private String resourceSubType;
    /**
     * <p>
     * The status of the application unit.
     * </p>
     */
    private String runtimeStatus;
    /**
     * <p>
     * The status message for the application unit.
     * </p>
     */
    private String runtimeStatusMessage;
    /**
     * <p>
     * Details about the source code repository associated with the application component.
     * </p>
     */
    private java.util.List<SourceCodeRepository> sourceCodeRepositories;
    /**
     * <p>
     * A detailed description of the analysis status and any failure message.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The status of analysis, if the application component has source code or an associated database.
     * </p>
     * 
     * @param analysisStatus
     *        The status of analysis, if the application component has source code or an associated database.
     * @see SrcCodeOrDbAnalysisStatus
     */

    public void setAnalysisStatus(String analysisStatus) {
        this.analysisStatus = analysisStatus;
    }

    /**
     * <p>
     * The status of analysis, if the application component has source code or an associated database.
     * </p>
     * 
     * @return The status of analysis, if the application component has source code or an associated database.
     * @see SrcCodeOrDbAnalysisStatus
     */

    public String getAnalysisStatus() {
        return this.analysisStatus;
    }

    /**
     * <p>
     * The status of analysis, if the application component has source code or an associated database.
     * </p>
     * 
     * @param analysisStatus
     *        The status of analysis, if the application component has source code or an associated database.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SrcCodeOrDbAnalysisStatus
     */

    public ApplicationComponentDetail withAnalysisStatus(String analysisStatus) {
        setAnalysisStatus(analysisStatus);
        return this;
    }

    /**
     * <p>
     * The status of analysis, if the application component has source code or an associated database.
     * </p>
     * 
     * @param analysisStatus
     *        The status of analysis, if the application component has source code or an associated database.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SrcCodeOrDbAnalysisStatus
     */

    public ApplicationComponentDetail withAnalysisStatus(SrcCodeOrDbAnalysisStatus analysisStatus) {
        this.analysisStatus = analysisStatus.toString();
        return this;
    }

    /**
     * <p>
     * The S3 bucket name and the Amazon S3 key name for the anti-pattern report.
     * </p>
     * 
     * @param antipatternReportS3Object
     *        The S3 bucket name and the Amazon S3 key name for the anti-pattern report.
     */

    public void setAntipatternReportS3Object(S3Object antipatternReportS3Object) {
        this.antipatternReportS3Object = antipatternReportS3Object;
    }

    /**
     * <p>
     * The S3 bucket name and the Amazon S3 key name for the anti-pattern report.
     * </p>
     * 
     * @return The S3 bucket name and the Amazon S3 key name for the anti-pattern report.
     */

    public S3Object getAntipatternReportS3Object() {
        return this.antipatternReportS3Object;
    }

    /**
     * <p>
     * The S3 bucket name and the Amazon S3 key name for the anti-pattern report.
     * </p>
     * 
     * @param antipatternReportS3Object
     *        The S3 bucket name and the Amazon S3 key name for the anti-pattern report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationComponentDetail withAntipatternReportS3Object(S3Object antipatternReportS3Object) {
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

    public ApplicationComponentDetail withAntipatternReportStatus(String antipatternReportStatus) {
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

    public ApplicationComponentDetail withAntipatternReportStatus(AntipatternReportStatus antipatternReportStatus) {
        this.antipatternReportStatus = antipatternReportStatus.toString();
        return this;
    }

    /**
     * <p>
     * The status message for the anti-pattern.
     * </p>
     * 
     * @param antipatternReportStatusMessage
     *        The status message for the anti-pattern.
     */

    public void setAntipatternReportStatusMessage(String antipatternReportStatusMessage) {
        this.antipatternReportStatusMessage = antipatternReportStatusMessage;
    }

    /**
     * <p>
     * The status message for the anti-pattern.
     * </p>
     * 
     * @return The status message for the anti-pattern.
     */

    public String getAntipatternReportStatusMessage() {
        return this.antipatternReportStatusMessage;
    }

    /**
     * <p>
     * The status message for the anti-pattern.
     * </p>
     * 
     * @param antipatternReportStatusMessage
     *        The status message for the anti-pattern.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationComponentDetail withAntipatternReportStatusMessage(String antipatternReportStatusMessage) {
        setAntipatternReportStatusMessage(antipatternReportStatusMessage);
        return this;
    }

    /**
     * <p>
     * The type of application component.
     * </p>
     * 
     * @param appType
     *        The type of application component.
     * @see AppType
     */

    public void setAppType(String appType) {
        this.appType = appType;
    }

    /**
     * <p>
     * The type of application component.
     * </p>
     * 
     * @return The type of application component.
     * @see AppType
     */

    public String getAppType() {
        return this.appType;
    }

    /**
     * <p>
     * The type of application component.
     * </p>
     * 
     * @param appType
     *        The type of application component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppType
     */

    public ApplicationComponentDetail withAppType(String appType) {
        setAppType(appType);
        return this;
    }

    /**
     * <p>
     * The type of application component.
     * </p>
     * 
     * @param appType
     *        The type of application component.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppType
     */

    public ApplicationComponentDetail withAppType(AppType appType) {
        this.appType = appType.toString();
        return this;
    }

    /**
     * <p>
     * The error in the analysis of the source code or database.
     * </p>
     * 
     * @param appUnitError
     *        The error in the analysis of the source code or database.
     */

    public void setAppUnitError(AppUnitError appUnitError) {
        this.appUnitError = appUnitError;
    }

    /**
     * <p>
     * The error in the analysis of the source code or database.
     * </p>
     * 
     * @return The error in the analysis of the source code or database.
     */

    public AppUnitError getAppUnitError() {
        return this.appUnitError;
    }

    /**
     * <p>
     * The error in the analysis of the source code or database.
     * </p>
     * 
     * @param appUnitError
     *        The error in the analysis of the source code or database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationComponentDetail withAppUnitError(AppUnitError appUnitError) {
        setAppUnitError(appUnitError);
        return this;
    }

    /**
     * <p>
     * The ID of the server that the application component is running on.
     * </p>
     * 
     * @param associatedServerId
     *        The ID of the server that the application component is running on.
     */

    public void setAssociatedServerId(String associatedServerId) {
        this.associatedServerId = associatedServerId;
    }

    /**
     * <p>
     * The ID of the server that the application component is running on.
     * </p>
     * 
     * @return The ID of the server that the application component is running on.
     */

    public String getAssociatedServerId() {
        return this.associatedServerId;
    }

    /**
     * <p>
     * The ID of the server that the application component is running on.
     * </p>
     * 
     * @param associatedServerId
     *        The ID of the server that the application component is running on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationComponentDetail withAssociatedServerId(String associatedServerId) {
        setAssociatedServerId(associatedServerId);
        return this;
    }

    /**
     * <p>
     * Configuration details for the database associated with the application component.
     * </p>
     * 
     * @param databaseConfigDetail
     *        Configuration details for the database associated with the application component.
     */

    public void setDatabaseConfigDetail(DatabaseConfigDetail databaseConfigDetail) {
        this.databaseConfigDetail = databaseConfigDetail;
    }

    /**
     * <p>
     * Configuration details for the database associated with the application component.
     * </p>
     * 
     * @return Configuration details for the database associated with the application component.
     */

    public DatabaseConfigDetail getDatabaseConfigDetail() {
        return this.databaseConfigDetail;
    }

    /**
     * <p>
     * Configuration details for the database associated with the application component.
     * </p>
     * 
     * @param databaseConfigDetail
     *        Configuration details for the database associated with the application component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationComponentDetail withDatabaseConfigDetail(DatabaseConfigDetail databaseConfigDetail) {
        setDatabaseConfigDetail(databaseConfigDetail);
        return this;
    }

    /**
     * <p>
     * The ID of the application component.
     * </p>
     * 
     * @param id
     *        The ID of the application component.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the application component.
     * </p>
     * 
     * @return The ID of the application component.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the application component.
     * </p>
     * 
     * @param id
     *        The ID of the application component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationComponentDetail withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Indicates whether the application component has been included for server recommendation or not.
     * </p>
     * 
     * @param inclusionStatus
     *        Indicates whether the application component has been included for server recommendation or not.
     * @see InclusionStatus
     */

    public void setInclusionStatus(String inclusionStatus) {
        this.inclusionStatus = inclusionStatus;
    }

    /**
     * <p>
     * Indicates whether the application component has been included for server recommendation or not.
     * </p>
     * 
     * @return Indicates whether the application component has been included for server recommendation or not.
     * @see InclusionStatus
     */

    public String getInclusionStatus() {
        return this.inclusionStatus;
    }

    /**
     * <p>
     * Indicates whether the application component has been included for server recommendation or not.
     * </p>
     * 
     * @param inclusionStatus
     *        Indicates whether the application component has been included for server recommendation or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InclusionStatus
     */

    public ApplicationComponentDetail withInclusionStatus(String inclusionStatus) {
        setInclusionStatus(inclusionStatus);
        return this;
    }

    /**
     * <p>
     * Indicates whether the application component has been included for server recommendation or not.
     * </p>
     * 
     * @param inclusionStatus
     *        Indicates whether the application component has been included for server recommendation or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InclusionStatus
     */

    public ApplicationComponentDetail withInclusionStatus(InclusionStatus inclusionStatus) {
        this.inclusionStatus = inclusionStatus.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp of when the application component was assessed.
     * </p>
     * 
     * @param lastAnalyzedTimestamp
     *        The timestamp of when the application component was assessed.
     */

    public void setLastAnalyzedTimestamp(java.util.Date lastAnalyzedTimestamp) {
        this.lastAnalyzedTimestamp = lastAnalyzedTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the application component was assessed.
     * </p>
     * 
     * @return The timestamp of when the application component was assessed.
     */

    public java.util.Date getLastAnalyzedTimestamp() {
        return this.lastAnalyzedTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the application component was assessed.
     * </p>
     * 
     * @param lastAnalyzedTimestamp
     *        The timestamp of when the application component was assessed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationComponentDetail withLastAnalyzedTimestamp(java.util.Date lastAnalyzedTimestamp) {
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

    public ApplicationComponentDetail withListAntipatternSeveritySummary(AntipatternSeveritySummary... listAntipatternSeveritySummary) {
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

    public ApplicationComponentDetail withListAntipatternSeveritySummary(java.util.Collection<AntipatternSeveritySummary> listAntipatternSeveritySummary) {
        setListAntipatternSeveritySummary(listAntipatternSeveritySummary);
        return this;
    }

    /**
     * <p>
     * Set to true if the application component is running on multiple servers.
     * </p>
     * 
     * @param moreServerAssociationExists
     *        Set to true if the application component is running on multiple servers.
     */

    public void setMoreServerAssociationExists(Boolean moreServerAssociationExists) {
        this.moreServerAssociationExists = moreServerAssociationExists;
    }

    /**
     * <p>
     * Set to true if the application component is running on multiple servers.
     * </p>
     * 
     * @return Set to true if the application component is running on multiple servers.
     */

    public Boolean getMoreServerAssociationExists() {
        return this.moreServerAssociationExists;
    }

    /**
     * <p>
     * Set to true if the application component is running on multiple servers.
     * </p>
     * 
     * @param moreServerAssociationExists
     *        Set to true if the application component is running on multiple servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationComponentDetail withMoreServerAssociationExists(Boolean moreServerAssociationExists) {
        setMoreServerAssociationExists(moreServerAssociationExists);
        return this;
    }

    /**
     * <p>
     * Set to true if the application component is running on multiple servers.
     * </p>
     * 
     * @return Set to true if the application component is running on multiple servers.
     */

    public Boolean isMoreServerAssociationExists() {
        return this.moreServerAssociationExists;
    }

    /**
     * <p>
     * The name of application component.
     * </p>
     * 
     * @param name
     *        The name of application component.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of application component.
     * </p>
     * 
     * @return The name of application component.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of application component.
     * </p>
     * 
     * @param name
     *        The name of application component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationComponentDetail withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * OS driver.
     * </p>
     * 
     * @param osDriver
     *        OS driver.
     */

    public void setOsDriver(String osDriver) {
        this.osDriver = osDriver;
    }

    /**
     * <p>
     * OS driver.
     * </p>
     * 
     * @return OS driver.
     */

    public String getOsDriver() {
        return this.osDriver;
    }

    /**
     * <p>
     * OS driver.
     * </p>
     * 
     * @param osDriver
     *        OS driver.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationComponentDetail withOsDriver(String osDriver) {
        setOsDriver(osDriver);
        return this;
    }

    /**
     * <p>
     * OS version.
     * </p>
     * 
     * @param osVersion
     *        OS version.
     */

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    /**
     * <p>
     * OS version.
     * </p>
     * 
     * @return OS version.
     */

    public String getOsVersion() {
        return this.osVersion;
    }

    /**
     * <p>
     * OS version.
     * </p>
     * 
     * @param osVersion
     *        OS version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationComponentDetail withOsVersion(String osVersion) {
        setOsVersion(osVersion);
        return this;
    }

    /**
     * <p>
     * The top recommendation set for the application component.
     * </p>
     * 
     * @param recommendationSet
     *        The top recommendation set for the application component.
     */

    public void setRecommendationSet(RecommendationSet recommendationSet) {
        this.recommendationSet = recommendationSet;
    }

    /**
     * <p>
     * The top recommendation set for the application component.
     * </p>
     * 
     * @return The top recommendation set for the application component.
     */

    public RecommendationSet getRecommendationSet() {
        return this.recommendationSet;
    }

    /**
     * <p>
     * The top recommendation set for the application component.
     * </p>
     * 
     * @param recommendationSet
     *        The top recommendation set for the application component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationComponentDetail withRecommendationSet(RecommendationSet recommendationSet) {
        setRecommendationSet(recommendationSet);
        return this;
    }

    /**
     * <p>
     * The application component subtype.
     * </p>
     * 
     * @param resourceSubType
     *        The application component subtype.
     * @see ResourceSubType
     */

    public void setResourceSubType(String resourceSubType) {
        this.resourceSubType = resourceSubType;
    }

    /**
     * <p>
     * The application component subtype.
     * </p>
     * 
     * @return The application component subtype.
     * @see ResourceSubType
     */

    public String getResourceSubType() {
        return this.resourceSubType;
    }

    /**
     * <p>
     * The application component subtype.
     * </p>
     * 
     * @param resourceSubType
     *        The application component subtype.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceSubType
     */

    public ApplicationComponentDetail withResourceSubType(String resourceSubType) {
        setResourceSubType(resourceSubType);
        return this;
    }

    /**
     * <p>
     * The application component subtype.
     * </p>
     * 
     * @param resourceSubType
     *        The application component subtype.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceSubType
     */

    public ApplicationComponentDetail withResourceSubType(ResourceSubType resourceSubType) {
        this.resourceSubType = resourceSubType.toString();
        return this;
    }

    /**
     * <p>
     * The status of the application unit.
     * </p>
     * 
     * @param runtimeStatus
     *        The status of the application unit.
     * @see RuntimeAnalysisStatus
     */

    public void setRuntimeStatus(String runtimeStatus) {
        this.runtimeStatus = runtimeStatus;
    }

    /**
     * <p>
     * The status of the application unit.
     * </p>
     * 
     * @return The status of the application unit.
     * @see RuntimeAnalysisStatus
     */

    public String getRuntimeStatus() {
        return this.runtimeStatus;
    }

    /**
     * <p>
     * The status of the application unit.
     * </p>
     * 
     * @param runtimeStatus
     *        The status of the application unit.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuntimeAnalysisStatus
     */

    public ApplicationComponentDetail withRuntimeStatus(String runtimeStatus) {
        setRuntimeStatus(runtimeStatus);
        return this;
    }

    /**
     * <p>
     * The status of the application unit.
     * </p>
     * 
     * @param runtimeStatus
     *        The status of the application unit.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuntimeAnalysisStatus
     */

    public ApplicationComponentDetail withRuntimeStatus(RuntimeAnalysisStatus runtimeStatus) {
        this.runtimeStatus = runtimeStatus.toString();
        return this;
    }

    /**
     * <p>
     * The status message for the application unit.
     * </p>
     * 
     * @param runtimeStatusMessage
     *        The status message for the application unit.
     */

    public void setRuntimeStatusMessage(String runtimeStatusMessage) {
        this.runtimeStatusMessage = runtimeStatusMessage;
    }

    /**
     * <p>
     * The status message for the application unit.
     * </p>
     * 
     * @return The status message for the application unit.
     */

    public String getRuntimeStatusMessage() {
        return this.runtimeStatusMessage;
    }

    /**
     * <p>
     * The status message for the application unit.
     * </p>
     * 
     * @param runtimeStatusMessage
     *        The status message for the application unit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationComponentDetail withRuntimeStatusMessage(String runtimeStatusMessage) {
        setRuntimeStatusMessage(runtimeStatusMessage);
        return this;
    }

    /**
     * <p>
     * Details about the source code repository associated with the application component.
     * </p>
     * 
     * @return Details about the source code repository associated with the application component.
     */

    public java.util.List<SourceCodeRepository> getSourceCodeRepositories() {
        return sourceCodeRepositories;
    }

    /**
     * <p>
     * Details about the source code repository associated with the application component.
     * </p>
     * 
     * @param sourceCodeRepositories
     *        Details about the source code repository associated with the application component.
     */

    public void setSourceCodeRepositories(java.util.Collection<SourceCodeRepository> sourceCodeRepositories) {
        if (sourceCodeRepositories == null) {
            this.sourceCodeRepositories = null;
            return;
        }

        this.sourceCodeRepositories = new java.util.ArrayList<SourceCodeRepository>(sourceCodeRepositories);
    }

    /**
     * <p>
     * Details about the source code repository associated with the application component.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceCodeRepositories(java.util.Collection)} or
     * {@link #withSourceCodeRepositories(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param sourceCodeRepositories
     *        Details about the source code repository associated with the application component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationComponentDetail withSourceCodeRepositories(SourceCodeRepository... sourceCodeRepositories) {
        if (this.sourceCodeRepositories == null) {
            setSourceCodeRepositories(new java.util.ArrayList<SourceCodeRepository>(sourceCodeRepositories.length));
        }
        for (SourceCodeRepository ele : sourceCodeRepositories) {
            this.sourceCodeRepositories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details about the source code repository associated with the application component.
     * </p>
     * 
     * @param sourceCodeRepositories
     *        Details about the source code repository associated with the application component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationComponentDetail withSourceCodeRepositories(java.util.Collection<SourceCodeRepository> sourceCodeRepositories) {
        setSourceCodeRepositories(sourceCodeRepositories);
        return this;
    }

    /**
     * <p>
     * A detailed description of the analysis status and any failure message.
     * </p>
     * 
     * @param statusMessage
     *        A detailed description of the analysis status and any failure message.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A detailed description of the analysis status and any failure message.
     * </p>
     * 
     * @return A detailed description of the analysis status and any failure message.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A detailed description of the analysis status and any failure message.
     * </p>
     * 
     * @param statusMessage
     *        A detailed description of the analysis status and any failure message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationComponentDetail withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
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
        if (getAnalysisStatus() != null)
            sb.append("AnalysisStatus: ").append(getAnalysisStatus()).append(",");
        if (getAntipatternReportS3Object() != null)
            sb.append("AntipatternReportS3Object: ").append(getAntipatternReportS3Object()).append(",");
        if (getAntipatternReportStatus() != null)
            sb.append("AntipatternReportStatus: ").append(getAntipatternReportStatus()).append(",");
        if (getAntipatternReportStatusMessage() != null)
            sb.append("AntipatternReportStatusMessage: ").append(getAntipatternReportStatusMessage()).append(",");
        if (getAppType() != null)
            sb.append("AppType: ").append(getAppType()).append(",");
        if (getAppUnitError() != null)
            sb.append("AppUnitError: ").append(getAppUnitError()).append(",");
        if (getAssociatedServerId() != null)
            sb.append("AssociatedServerId: ").append(getAssociatedServerId()).append(",");
        if (getDatabaseConfigDetail() != null)
            sb.append("DatabaseConfigDetail: ").append(getDatabaseConfigDetail()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getInclusionStatus() != null)
            sb.append("InclusionStatus: ").append(getInclusionStatus()).append(",");
        if (getLastAnalyzedTimestamp() != null)
            sb.append("LastAnalyzedTimestamp: ").append(getLastAnalyzedTimestamp()).append(",");
        if (getListAntipatternSeveritySummary() != null)
            sb.append("ListAntipatternSeveritySummary: ").append(getListAntipatternSeveritySummary()).append(",");
        if (getMoreServerAssociationExists() != null)
            sb.append("MoreServerAssociationExists: ").append(getMoreServerAssociationExists()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOsDriver() != null)
            sb.append("OsDriver: ").append(getOsDriver()).append(",");
        if (getOsVersion() != null)
            sb.append("OsVersion: ").append(getOsVersion()).append(",");
        if (getRecommendationSet() != null)
            sb.append("RecommendationSet: ").append(getRecommendationSet()).append(",");
        if (getResourceSubType() != null)
            sb.append("ResourceSubType: ").append(getResourceSubType()).append(",");
        if (getRuntimeStatus() != null)
            sb.append("RuntimeStatus: ").append(getRuntimeStatus()).append(",");
        if (getRuntimeStatusMessage() != null)
            sb.append("RuntimeStatusMessage: ").append(getRuntimeStatusMessage()).append(",");
        if (getSourceCodeRepositories() != null)
            sb.append("SourceCodeRepositories: ").append(getSourceCodeRepositories()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationComponentDetail == false)
            return false;
        ApplicationComponentDetail other = (ApplicationComponentDetail) obj;
        if (other.getAnalysisStatus() == null ^ this.getAnalysisStatus() == null)
            return false;
        if (other.getAnalysisStatus() != null && other.getAnalysisStatus().equals(this.getAnalysisStatus()) == false)
            return false;
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
        if (other.getAppType() == null ^ this.getAppType() == null)
            return false;
        if (other.getAppType() != null && other.getAppType().equals(this.getAppType()) == false)
            return false;
        if (other.getAppUnitError() == null ^ this.getAppUnitError() == null)
            return false;
        if (other.getAppUnitError() != null && other.getAppUnitError().equals(this.getAppUnitError()) == false)
            return false;
        if (other.getAssociatedServerId() == null ^ this.getAssociatedServerId() == null)
            return false;
        if (other.getAssociatedServerId() != null && other.getAssociatedServerId().equals(this.getAssociatedServerId()) == false)
            return false;
        if (other.getDatabaseConfigDetail() == null ^ this.getDatabaseConfigDetail() == null)
            return false;
        if (other.getDatabaseConfigDetail() != null && other.getDatabaseConfigDetail().equals(this.getDatabaseConfigDetail()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getInclusionStatus() == null ^ this.getInclusionStatus() == null)
            return false;
        if (other.getInclusionStatus() != null && other.getInclusionStatus().equals(this.getInclusionStatus()) == false)
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
        if (other.getMoreServerAssociationExists() == null ^ this.getMoreServerAssociationExists() == null)
            return false;
        if (other.getMoreServerAssociationExists() != null && other.getMoreServerAssociationExists().equals(this.getMoreServerAssociationExists()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOsDriver() == null ^ this.getOsDriver() == null)
            return false;
        if (other.getOsDriver() != null && other.getOsDriver().equals(this.getOsDriver()) == false)
            return false;
        if (other.getOsVersion() == null ^ this.getOsVersion() == null)
            return false;
        if (other.getOsVersion() != null && other.getOsVersion().equals(this.getOsVersion()) == false)
            return false;
        if (other.getRecommendationSet() == null ^ this.getRecommendationSet() == null)
            return false;
        if (other.getRecommendationSet() != null && other.getRecommendationSet().equals(this.getRecommendationSet()) == false)
            return false;
        if (other.getResourceSubType() == null ^ this.getResourceSubType() == null)
            return false;
        if (other.getResourceSubType() != null && other.getResourceSubType().equals(this.getResourceSubType()) == false)
            return false;
        if (other.getRuntimeStatus() == null ^ this.getRuntimeStatus() == null)
            return false;
        if (other.getRuntimeStatus() != null && other.getRuntimeStatus().equals(this.getRuntimeStatus()) == false)
            return false;
        if (other.getRuntimeStatusMessage() == null ^ this.getRuntimeStatusMessage() == null)
            return false;
        if (other.getRuntimeStatusMessage() != null && other.getRuntimeStatusMessage().equals(this.getRuntimeStatusMessage()) == false)
            return false;
        if (other.getSourceCodeRepositories() == null ^ this.getSourceCodeRepositories() == null)
            return false;
        if (other.getSourceCodeRepositories() != null && other.getSourceCodeRepositories().equals(this.getSourceCodeRepositories()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnalysisStatus() == null) ? 0 : getAnalysisStatus().hashCode());
        hashCode = prime * hashCode + ((getAntipatternReportS3Object() == null) ? 0 : getAntipatternReportS3Object().hashCode());
        hashCode = prime * hashCode + ((getAntipatternReportStatus() == null) ? 0 : getAntipatternReportStatus().hashCode());
        hashCode = prime * hashCode + ((getAntipatternReportStatusMessage() == null) ? 0 : getAntipatternReportStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getAppType() == null) ? 0 : getAppType().hashCode());
        hashCode = prime * hashCode + ((getAppUnitError() == null) ? 0 : getAppUnitError().hashCode());
        hashCode = prime * hashCode + ((getAssociatedServerId() == null) ? 0 : getAssociatedServerId().hashCode());
        hashCode = prime * hashCode + ((getDatabaseConfigDetail() == null) ? 0 : getDatabaseConfigDetail().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getInclusionStatus() == null) ? 0 : getInclusionStatus().hashCode());
        hashCode = prime * hashCode + ((getLastAnalyzedTimestamp() == null) ? 0 : getLastAnalyzedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getListAntipatternSeveritySummary() == null) ? 0 : getListAntipatternSeveritySummary().hashCode());
        hashCode = prime * hashCode + ((getMoreServerAssociationExists() == null) ? 0 : getMoreServerAssociationExists().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOsDriver() == null) ? 0 : getOsDriver().hashCode());
        hashCode = prime * hashCode + ((getOsVersion() == null) ? 0 : getOsVersion().hashCode());
        hashCode = prime * hashCode + ((getRecommendationSet() == null) ? 0 : getRecommendationSet().hashCode());
        hashCode = prime * hashCode + ((getResourceSubType() == null) ? 0 : getResourceSubType().hashCode());
        hashCode = prime * hashCode + ((getRuntimeStatus() == null) ? 0 : getRuntimeStatus().hashCode());
        hashCode = prime * hashCode + ((getRuntimeStatusMessage() == null) ? 0 : getRuntimeStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getSourceCodeRepositories() == null) ? 0 : getSourceCodeRepositories().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationComponentDetail clone() {
        try {
            return (ApplicationComponentDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.ApplicationComponentDetailMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
