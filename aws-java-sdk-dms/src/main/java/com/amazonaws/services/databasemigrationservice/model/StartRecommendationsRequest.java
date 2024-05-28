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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/StartRecommendations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartRecommendationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the source database to analyze and provide recommendations for.
     * </p>
     */
    private String databaseId;
    /**
     * <p>
     * The settings in JSON format that Fleet Advisor uses to determine target engine recommendations. These parameters
     * include target instance sizing and availability and durability settings. For target instance sizing, Fleet
     * Advisor supports the following two options: total capacity and resource utilization. For availability and
     * durability, Fleet Advisor supports the following two options: production (Multi-AZ deployments) and Dev/Test
     * (Single-AZ deployments).
     * </p>
     */
    private RecommendationSettings settings;

    /**
     * <p>
     * The identifier of the source database to analyze and provide recommendations for.
     * </p>
     * 
     * @param databaseId
     *        The identifier of the source database to analyze and provide recommendations for.
     */

    public void setDatabaseId(String databaseId) {
        this.databaseId = databaseId;
    }

    /**
     * <p>
     * The identifier of the source database to analyze and provide recommendations for.
     * </p>
     * 
     * @return The identifier of the source database to analyze and provide recommendations for.
     */

    public String getDatabaseId() {
        return this.databaseId;
    }

    /**
     * <p>
     * The identifier of the source database to analyze and provide recommendations for.
     * </p>
     * 
     * @param databaseId
     *        The identifier of the source database to analyze and provide recommendations for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRecommendationsRequest withDatabaseId(String databaseId) {
        setDatabaseId(databaseId);
        return this;
    }

    /**
     * <p>
     * The settings in JSON format that Fleet Advisor uses to determine target engine recommendations. These parameters
     * include target instance sizing and availability and durability settings. For target instance sizing, Fleet
     * Advisor supports the following two options: total capacity and resource utilization. For availability and
     * durability, Fleet Advisor supports the following two options: production (Multi-AZ deployments) and Dev/Test
     * (Single-AZ deployments).
     * </p>
     * 
     * @param settings
     *        The settings in JSON format that Fleet Advisor uses to determine target engine recommendations. These
     *        parameters include target instance sizing and availability and durability settings. For target instance
     *        sizing, Fleet Advisor supports the following two options: total capacity and resource utilization. For
     *        availability and durability, Fleet Advisor supports the following two options: production (Multi-AZ
     *        deployments) and Dev/Test (Single-AZ deployments).
     */

    public void setSettings(RecommendationSettings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * The settings in JSON format that Fleet Advisor uses to determine target engine recommendations. These parameters
     * include target instance sizing and availability and durability settings. For target instance sizing, Fleet
     * Advisor supports the following two options: total capacity and resource utilization. For availability and
     * durability, Fleet Advisor supports the following two options: production (Multi-AZ deployments) and Dev/Test
     * (Single-AZ deployments).
     * </p>
     * 
     * @return The settings in JSON format that Fleet Advisor uses to determine target engine recommendations. These
     *         parameters include target instance sizing and availability and durability settings. For target instance
     *         sizing, Fleet Advisor supports the following two options: total capacity and resource utilization. For
     *         availability and durability, Fleet Advisor supports the following two options: production (Multi-AZ
     *         deployments) and Dev/Test (Single-AZ deployments).
     */

    public RecommendationSettings getSettings() {
        return this.settings;
    }

    /**
     * <p>
     * The settings in JSON format that Fleet Advisor uses to determine target engine recommendations. These parameters
     * include target instance sizing and availability and durability settings. For target instance sizing, Fleet
     * Advisor supports the following two options: total capacity and resource utilization. For availability and
     * durability, Fleet Advisor supports the following two options: production (Multi-AZ deployments) and Dev/Test
     * (Single-AZ deployments).
     * </p>
     * 
     * @param settings
     *        The settings in JSON format that Fleet Advisor uses to determine target engine recommendations. These
     *        parameters include target instance sizing and availability and durability settings. For target instance
     *        sizing, Fleet Advisor supports the following two options: total capacity and resource utilization. For
     *        availability and durability, Fleet Advisor supports the following two options: production (Multi-AZ
     *        deployments) and Dev/Test (Single-AZ deployments).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRecommendationsRequest withSettings(RecommendationSettings settings) {
        setSettings(settings);
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
        if (getDatabaseId() != null)
            sb.append("DatabaseId: ").append(getDatabaseId()).append(",");
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

        if (obj instanceof StartRecommendationsRequest == false)
            return false;
        StartRecommendationsRequest other = (StartRecommendationsRequest) obj;
        if (other.getDatabaseId() == null ^ this.getDatabaseId() == null)
            return false;
        if (other.getDatabaseId() != null && other.getDatabaseId().equals(this.getDatabaseId()) == false)
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

        hashCode = prime * hashCode + ((getDatabaseId() == null) ? 0 : getDatabaseId().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        return hashCode;
    }

    @Override
    public StartRecommendationsRequest clone() {
        return (StartRecommendationsRequest) super.clone();
    }

}
