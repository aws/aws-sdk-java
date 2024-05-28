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
package com.amazonaws.services.neptunedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetEngineStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEngineStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Set to <code>healthy</code> if the instance is not experiencing problems. If the instance is recovering from a
     * crash or from being rebooted and there are active transactions running from the latest server shutdown, status is
     * set to <code>recovery</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Set to the UTC time at which the current server process started.
     * </p>
     */
    private String startTime;
    /**
     * <p>
     * Set to the Neptune engine version running on your DB cluster. If this engine version has been manually patched
     * since it was released, the version number is prefixed by <code>Patch-</code>.
     * </p>
     */
    private String dbEngineVersion;
    /**
     * <p>
     * Set to <code>reader</code> if the instance is a read-replica, or to <code>writer</code> if the instance is the
     * primary instance.
     * </p>
     */
    private String role;
    /**
     * <p>
     * Set to <code>enabled</code> if the DFE engine is fully enabled, or to <code>viaQueryHint</code> (the default) if
     * the DFE engine is only used with queries that have the <code>useDFE</code> query hint set to <code>true</code>.
     * </p>
     */
    private String dfeQueryEngine;
    /**
     * <p>
     * Contains information about the Gremlin query language available on your cluster. Specifically, it contains a
     * version field that specifies the current TinkerPop version being used by the engine.
     * </p>
     */
    private QueryLanguageVersion gremlin;
    /**
     * <p>
     * Contains information about the SPARQL query language available on your cluster. Specifically, it contains a
     * version field that specifies the current SPARQL version being used by the engine.
     * </p>
     */
    private QueryLanguageVersion sparql;
    /**
     * <p>
     * Contains information about the openCypher query language available on your cluster. Specifically, it contains a
     * version field that specifies the current operCypher version being used by the engine.
     * </p>
     */
    private QueryLanguageVersion opencypher;
    /**
     * <p>
     * Contains Lab Mode settings being used by the engine.
     * </p>
     */
    private java.util.Map<String, String> labMode;
    /**
     * <p>
     * If there are transactions being rolled back, this field is set to the number of such transactions. If there are
     * none, the field doesn't appear at all.
     * </p>
     */
    private Integer rollingBackTrxCount;
    /**
     * <p>
     * Set to the start time of the earliest transaction being rolled back. If no transactions are being rolled back,
     * the field doesn't appear at all.
     * </p>
     */
    private String rollingBackTrxEarliestStartTime;
    /**
     * <p>
     * Contains information about the current settings on your DB cluster. For example, contains the current cluster
     * query timeout setting (<code>clusterQueryTimeoutInMs</code>).
     * </p>
     */
    private java.util.Map<String, String> settings;

    /**
     * <p>
     * Set to <code>healthy</code> if the instance is not experiencing problems. If the instance is recovering from a
     * crash or from being rebooted and there are active transactions running from the latest server shutdown, status is
     * set to <code>recovery</code>.
     * </p>
     * 
     * @param status
     *        Set to <code>healthy</code> if the instance is not experiencing problems. If the instance is recovering
     *        from a crash or from being rebooted and there are active transactions running from the latest server
     *        shutdown, status is set to <code>recovery</code>.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Set to <code>healthy</code> if the instance is not experiencing problems. If the instance is recovering from a
     * crash or from being rebooted and there are active transactions running from the latest server shutdown, status is
     * set to <code>recovery</code>.
     * </p>
     * 
     * @return Set to <code>healthy</code> if the instance is not experiencing problems. If the instance is recovering
     *         from a crash or from being rebooted and there are active transactions running from the latest server
     *         shutdown, status is set to <code>recovery</code>.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Set to <code>healthy</code> if the instance is not experiencing problems. If the instance is recovering from a
     * crash or from being rebooted and there are active transactions running from the latest server shutdown, status is
     * set to <code>recovery</code>.
     * </p>
     * 
     * @param status
     *        Set to <code>healthy</code> if the instance is not experiencing problems. If the instance is recovering
     *        from a crash or from being rebooted and there are active transactions running from the latest server
     *        shutdown, status is set to <code>recovery</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEngineStatusResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Set to the UTC time at which the current server process started.
     * </p>
     * 
     * @param startTime
     *        Set to the UTC time at which the current server process started.
     */

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * Set to the UTC time at which the current server process started.
     * </p>
     * 
     * @return Set to the UTC time at which the current server process started.
     */

    public String getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * Set to the UTC time at which the current server process started.
     * </p>
     * 
     * @param startTime
     *        Set to the UTC time at which the current server process started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEngineStatusResult withStartTime(String startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * Set to the Neptune engine version running on your DB cluster. If this engine version has been manually patched
     * since it was released, the version number is prefixed by <code>Patch-</code>.
     * </p>
     * 
     * @param dbEngineVersion
     *        Set to the Neptune engine version running on your DB cluster. If this engine version has been manually
     *        patched since it was released, the version number is prefixed by <code>Patch-</code>.
     */

    public void setDbEngineVersion(String dbEngineVersion) {
        this.dbEngineVersion = dbEngineVersion;
    }

    /**
     * <p>
     * Set to the Neptune engine version running on your DB cluster. If this engine version has been manually patched
     * since it was released, the version number is prefixed by <code>Patch-</code>.
     * </p>
     * 
     * @return Set to the Neptune engine version running on your DB cluster. If this engine version has been manually
     *         patched since it was released, the version number is prefixed by <code>Patch-</code>.
     */

    public String getDbEngineVersion() {
        return this.dbEngineVersion;
    }

    /**
     * <p>
     * Set to the Neptune engine version running on your DB cluster. If this engine version has been manually patched
     * since it was released, the version number is prefixed by <code>Patch-</code>.
     * </p>
     * 
     * @param dbEngineVersion
     *        Set to the Neptune engine version running on your DB cluster. If this engine version has been manually
     *        patched since it was released, the version number is prefixed by <code>Patch-</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEngineStatusResult withDbEngineVersion(String dbEngineVersion) {
        setDbEngineVersion(dbEngineVersion);
        return this;
    }

    /**
     * <p>
     * Set to <code>reader</code> if the instance is a read-replica, or to <code>writer</code> if the instance is the
     * primary instance.
     * </p>
     * 
     * @param role
     *        Set to <code>reader</code> if the instance is a read-replica, or to <code>writer</code> if the instance is
     *        the primary instance.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * Set to <code>reader</code> if the instance is a read-replica, or to <code>writer</code> if the instance is the
     * primary instance.
     * </p>
     * 
     * @return Set to <code>reader</code> if the instance is a read-replica, or to <code>writer</code> if the instance
     *         is the primary instance.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * Set to <code>reader</code> if the instance is a read-replica, or to <code>writer</code> if the instance is the
     * primary instance.
     * </p>
     * 
     * @param role
     *        Set to <code>reader</code> if the instance is a read-replica, or to <code>writer</code> if the instance is
     *        the primary instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEngineStatusResult withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * Set to <code>enabled</code> if the DFE engine is fully enabled, or to <code>viaQueryHint</code> (the default) if
     * the DFE engine is only used with queries that have the <code>useDFE</code> query hint set to <code>true</code>.
     * </p>
     * 
     * @param dfeQueryEngine
     *        Set to <code>enabled</code> if the DFE engine is fully enabled, or to <code>viaQueryHint</code> (the
     *        default) if the DFE engine is only used with queries that have the <code>useDFE</code> query hint set to
     *        <code>true</code>.
     */

    public void setDfeQueryEngine(String dfeQueryEngine) {
        this.dfeQueryEngine = dfeQueryEngine;
    }

    /**
     * <p>
     * Set to <code>enabled</code> if the DFE engine is fully enabled, or to <code>viaQueryHint</code> (the default) if
     * the DFE engine is only used with queries that have the <code>useDFE</code> query hint set to <code>true</code>.
     * </p>
     * 
     * @return Set to <code>enabled</code> if the DFE engine is fully enabled, or to <code>viaQueryHint</code> (the
     *         default) if the DFE engine is only used with queries that have the <code>useDFE</code> query hint set to
     *         <code>true</code>.
     */

    public String getDfeQueryEngine() {
        return this.dfeQueryEngine;
    }

    /**
     * <p>
     * Set to <code>enabled</code> if the DFE engine is fully enabled, or to <code>viaQueryHint</code> (the default) if
     * the DFE engine is only used with queries that have the <code>useDFE</code> query hint set to <code>true</code>.
     * </p>
     * 
     * @param dfeQueryEngine
     *        Set to <code>enabled</code> if the DFE engine is fully enabled, or to <code>viaQueryHint</code> (the
     *        default) if the DFE engine is only used with queries that have the <code>useDFE</code> query hint set to
     *        <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEngineStatusResult withDfeQueryEngine(String dfeQueryEngine) {
        setDfeQueryEngine(dfeQueryEngine);
        return this;
    }

    /**
     * <p>
     * Contains information about the Gremlin query language available on your cluster. Specifically, it contains a
     * version field that specifies the current TinkerPop version being used by the engine.
     * </p>
     * 
     * @param gremlin
     *        Contains information about the Gremlin query language available on your cluster. Specifically, it contains
     *        a version field that specifies the current TinkerPop version being used by the engine.
     */

    public void setGremlin(QueryLanguageVersion gremlin) {
        this.gremlin = gremlin;
    }

    /**
     * <p>
     * Contains information about the Gremlin query language available on your cluster. Specifically, it contains a
     * version field that specifies the current TinkerPop version being used by the engine.
     * </p>
     * 
     * @return Contains information about the Gremlin query language available on your cluster. Specifically, it
     *         contains a version field that specifies the current TinkerPop version being used by the engine.
     */

    public QueryLanguageVersion getGremlin() {
        return this.gremlin;
    }

    /**
     * <p>
     * Contains information about the Gremlin query language available on your cluster. Specifically, it contains a
     * version field that specifies the current TinkerPop version being used by the engine.
     * </p>
     * 
     * @param gremlin
     *        Contains information about the Gremlin query language available on your cluster. Specifically, it contains
     *        a version field that specifies the current TinkerPop version being used by the engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEngineStatusResult withGremlin(QueryLanguageVersion gremlin) {
        setGremlin(gremlin);
        return this;
    }

    /**
     * <p>
     * Contains information about the SPARQL query language available on your cluster. Specifically, it contains a
     * version field that specifies the current SPARQL version being used by the engine.
     * </p>
     * 
     * @param sparql
     *        Contains information about the SPARQL query language available on your cluster. Specifically, it contains
     *        a version field that specifies the current SPARQL version being used by the engine.
     */

    public void setSparql(QueryLanguageVersion sparql) {
        this.sparql = sparql;
    }

    /**
     * <p>
     * Contains information about the SPARQL query language available on your cluster. Specifically, it contains a
     * version field that specifies the current SPARQL version being used by the engine.
     * </p>
     * 
     * @return Contains information about the SPARQL query language available on your cluster. Specifically, it contains
     *         a version field that specifies the current SPARQL version being used by the engine.
     */

    public QueryLanguageVersion getSparql() {
        return this.sparql;
    }

    /**
     * <p>
     * Contains information about the SPARQL query language available on your cluster. Specifically, it contains a
     * version field that specifies the current SPARQL version being used by the engine.
     * </p>
     * 
     * @param sparql
     *        Contains information about the SPARQL query language available on your cluster. Specifically, it contains
     *        a version field that specifies the current SPARQL version being used by the engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEngineStatusResult withSparql(QueryLanguageVersion sparql) {
        setSparql(sparql);
        return this;
    }

    /**
     * <p>
     * Contains information about the openCypher query language available on your cluster. Specifically, it contains a
     * version field that specifies the current operCypher version being used by the engine.
     * </p>
     * 
     * @param opencypher
     *        Contains information about the openCypher query language available on your cluster. Specifically, it
     *        contains a version field that specifies the current operCypher version being used by the engine.
     */

    public void setOpencypher(QueryLanguageVersion opencypher) {
        this.opencypher = opencypher;
    }

    /**
     * <p>
     * Contains information about the openCypher query language available on your cluster. Specifically, it contains a
     * version field that specifies the current operCypher version being used by the engine.
     * </p>
     * 
     * @return Contains information about the openCypher query language available on your cluster. Specifically, it
     *         contains a version field that specifies the current operCypher version being used by the engine.
     */

    public QueryLanguageVersion getOpencypher() {
        return this.opencypher;
    }

    /**
     * <p>
     * Contains information about the openCypher query language available on your cluster. Specifically, it contains a
     * version field that specifies the current operCypher version being used by the engine.
     * </p>
     * 
     * @param opencypher
     *        Contains information about the openCypher query language available on your cluster. Specifically, it
     *        contains a version field that specifies the current operCypher version being used by the engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEngineStatusResult withOpencypher(QueryLanguageVersion opencypher) {
        setOpencypher(opencypher);
        return this;
    }

    /**
     * <p>
     * Contains Lab Mode settings being used by the engine.
     * </p>
     * 
     * @return Contains Lab Mode settings being used by the engine.
     */

    public java.util.Map<String, String> getLabMode() {
        return labMode;
    }

    /**
     * <p>
     * Contains Lab Mode settings being used by the engine.
     * </p>
     * 
     * @param labMode
     *        Contains Lab Mode settings being used by the engine.
     */

    public void setLabMode(java.util.Map<String, String> labMode) {
        this.labMode = labMode;
    }

    /**
     * <p>
     * Contains Lab Mode settings being used by the engine.
     * </p>
     * 
     * @param labMode
     *        Contains Lab Mode settings being used by the engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEngineStatusResult withLabMode(java.util.Map<String, String> labMode) {
        setLabMode(labMode);
        return this;
    }

    /**
     * Add a single LabMode entry
     *
     * @see GetEngineStatusResult#withLabMode
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetEngineStatusResult addLabModeEntry(String key, String value) {
        if (null == this.labMode) {
            this.labMode = new java.util.HashMap<String, String>();
        }
        if (this.labMode.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.labMode.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into LabMode.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEngineStatusResult clearLabModeEntries() {
        this.labMode = null;
        return this;
    }

    /**
     * <p>
     * If there are transactions being rolled back, this field is set to the number of such transactions. If there are
     * none, the field doesn't appear at all.
     * </p>
     * 
     * @param rollingBackTrxCount
     *        If there are transactions being rolled back, this field is set to the number of such transactions. If
     *        there are none, the field doesn't appear at all.
     */

    public void setRollingBackTrxCount(Integer rollingBackTrxCount) {
        this.rollingBackTrxCount = rollingBackTrxCount;
    }

    /**
     * <p>
     * If there are transactions being rolled back, this field is set to the number of such transactions. If there are
     * none, the field doesn't appear at all.
     * </p>
     * 
     * @return If there are transactions being rolled back, this field is set to the number of such transactions. If
     *         there are none, the field doesn't appear at all.
     */

    public Integer getRollingBackTrxCount() {
        return this.rollingBackTrxCount;
    }

    /**
     * <p>
     * If there are transactions being rolled back, this field is set to the number of such transactions. If there are
     * none, the field doesn't appear at all.
     * </p>
     * 
     * @param rollingBackTrxCount
     *        If there are transactions being rolled back, this field is set to the number of such transactions. If
     *        there are none, the field doesn't appear at all.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEngineStatusResult withRollingBackTrxCount(Integer rollingBackTrxCount) {
        setRollingBackTrxCount(rollingBackTrxCount);
        return this;
    }

    /**
     * <p>
     * Set to the start time of the earliest transaction being rolled back. If no transactions are being rolled back,
     * the field doesn't appear at all.
     * </p>
     * 
     * @param rollingBackTrxEarliestStartTime
     *        Set to the start time of the earliest transaction being rolled back. If no transactions are being rolled
     *        back, the field doesn't appear at all.
     */

    public void setRollingBackTrxEarliestStartTime(String rollingBackTrxEarliestStartTime) {
        this.rollingBackTrxEarliestStartTime = rollingBackTrxEarliestStartTime;
    }

    /**
     * <p>
     * Set to the start time of the earliest transaction being rolled back. If no transactions are being rolled back,
     * the field doesn't appear at all.
     * </p>
     * 
     * @return Set to the start time of the earliest transaction being rolled back. If no transactions are being rolled
     *         back, the field doesn't appear at all.
     */

    public String getRollingBackTrxEarliestStartTime() {
        return this.rollingBackTrxEarliestStartTime;
    }

    /**
     * <p>
     * Set to the start time of the earliest transaction being rolled back. If no transactions are being rolled back,
     * the field doesn't appear at all.
     * </p>
     * 
     * @param rollingBackTrxEarliestStartTime
     *        Set to the start time of the earliest transaction being rolled back. If no transactions are being rolled
     *        back, the field doesn't appear at all.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEngineStatusResult withRollingBackTrxEarliestStartTime(String rollingBackTrxEarliestStartTime) {
        setRollingBackTrxEarliestStartTime(rollingBackTrxEarliestStartTime);
        return this;
    }

    /**
     * <p>
     * Contains information about the current settings on your DB cluster. For example, contains the current cluster
     * query timeout setting (<code>clusterQueryTimeoutInMs</code>).
     * </p>
     * 
     * @return Contains information about the current settings on your DB cluster. For example, contains the current
     *         cluster query timeout setting (<code>clusterQueryTimeoutInMs</code>).
     */

    public java.util.Map<String, String> getSettings() {
        return settings;
    }

    /**
     * <p>
     * Contains information about the current settings on your DB cluster. For example, contains the current cluster
     * query timeout setting (<code>clusterQueryTimeoutInMs</code>).
     * </p>
     * 
     * @param settings
     *        Contains information about the current settings on your DB cluster. For example, contains the current
     *        cluster query timeout setting (<code>clusterQueryTimeoutInMs</code>).
     */

    public void setSettings(java.util.Map<String, String> settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * Contains information about the current settings on your DB cluster. For example, contains the current cluster
     * query timeout setting (<code>clusterQueryTimeoutInMs</code>).
     * </p>
     * 
     * @param settings
     *        Contains information about the current settings on your DB cluster. For example, contains the current
     *        cluster query timeout setting (<code>clusterQueryTimeoutInMs</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEngineStatusResult withSettings(java.util.Map<String, String> settings) {
        setSettings(settings);
        return this;
    }

    /**
     * Add a single Settings entry
     *
     * @see GetEngineStatusResult#withSettings
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetEngineStatusResult addSettingsEntry(String key, String value) {
        if (null == this.settings) {
            this.settings = new java.util.HashMap<String, String>();
        }
        if (this.settings.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.settings.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Settings.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEngineStatusResult clearSettingsEntries() {
        this.settings = null;
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getDbEngineVersion() != null)
            sb.append("DbEngineVersion: ").append(getDbEngineVersion()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getDfeQueryEngine() != null)
            sb.append("DfeQueryEngine: ").append(getDfeQueryEngine()).append(",");
        if (getGremlin() != null)
            sb.append("Gremlin: ").append(getGremlin()).append(",");
        if (getSparql() != null)
            sb.append("Sparql: ").append(getSparql()).append(",");
        if (getOpencypher() != null)
            sb.append("Opencypher: ").append(getOpencypher()).append(",");
        if (getLabMode() != null)
            sb.append("LabMode: ").append(getLabMode()).append(",");
        if (getRollingBackTrxCount() != null)
            sb.append("RollingBackTrxCount: ").append(getRollingBackTrxCount()).append(",");
        if (getRollingBackTrxEarliestStartTime() != null)
            sb.append("RollingBackTrxEarliestStartTime: ").append(getRollingBackTrxEarliestStartTime()).append(",");
        if (getSettings() != null)
            sb.append("Settings: ").append(getSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEngineStatusResult == false)
            return false;
        GetEngineStatusResult other = (GetEngineStatusResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getDbEngineVersion() == null ^ this.getDbEngineVersion() == null)
            return false;
        if (other.getDbEngineVersion() != null && other.getDbEngineVersion().equals(this.getDbEngineVersion()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getDfeQueryEngine() == null ^ this.getDfeQueryEngine() == null)
            return false;
        if (other.getDfeQueryEngine() != null && other.getDfeQueryEngine().equals(this.getDfeQueryEngine()) == false)
            return false;
        if (other.getGremlin() == null ^ this.getGremlin() == null)
            return false;
        if (other.getGremlin() != null && other.getGremlin().equals(this.getGremlin()) == false)
            return false;
        if (other.getSparql() == null ^ this.getSparql() == null)
            return false;
        if (other.getSparql() != null && other.getSparql().equals(this.getSparql()) == false)
            return false;
        if (other.getOpencypher() == null ^ this.getOpencypher() == null)
            return false;
        if (other.getOpencypher() != null && other.getOpencypher().equals(this.getOpencypher()) == false)
            return false;
        if (other.getLabMode() == null ^ this.getLabMode() == null)
            return false;
        if (other.getLabMode() != null && other.getLabMode().equals(this.getLabMode()) == false)
            return false;
        if (other.getRollingBackTrxCount() == null ^ this.getRollingBackTrxCount() == null)
            return false;
        if (other.getRollingBackTrxCount() != null && other.getRollingBackTrxCount().equals(this.getRollingBackTrxCount()) == false)
            return false;
        if (other.getRollingBackTrxEarliestStartTime() == null ^ this.getRollingBackTrxEarliestStartTime() == null)
            return false;
        if (other.getRollingBackTrxEarliestStartTime() != null
                && other.getRollingBackTrxEarliestStartTime().equals(this.getRollingBackTrxEarliestStartTime()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getDbEngineVersion() == null) ? 0 : getDbEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getDfeQueryEngine() == null) ? 0 : getDfeQueryEngine().hashCode());
        hashCode = prime * hashCode + ((getGremlin() == null) ? 0 : getGremlin().hashCode());
        hashCode = prime * hashCode + ((getSparql() == null) ? 0 : getSparql().hashCode());
        hashCode = prime * hashCode + ((getOpencypher() == null) ? 0 : getOpencypher().hashCode());
        hashCode = prime * hashCode + ((getLabMode() == null) ? 0 : getLabMode().hashCode());
        hashCode = prime * hashCode + ((getRollingBackTrxCount() == null) ? 0 : getRollingBackTrxCount().hashCode());
        hashCode = prime * hashCode + ((getRollingBackTrxEarliestStartTime() == null) ? 0 : getRollingBackTrxEarliestStartTime().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        return hashCode;
    }

    @Override
    public GetEngineStatusResult clone() {
        try {
            return (GetEngineStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
