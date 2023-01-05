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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/GetPortfolioPreferences"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPortfolioPreferencesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The classification for application component types.
     * </p>
     */
    private String applicationMode;
    /**
     * <p>
     * The transformation preferences for non-database applications.
     * </p>
     */
    private ApplicationPreferences applicationPreferences;
    /**
     * <p>
     * The transformation preferences for database applications.
     * </p>
     */
    private DatabasePreferences databasePreferences;
    /**
     * <p>
     * The rank of business goals based on priority.
     * </p>
     */
    private PrioritizeBusinessGoals prioritizeBusinessGoals;

    /**
     * <p>
     * The classification for application component types.
     * </p>
     * 
     * @param applicationMode
     *        The classification for application component types.
     * @see ApplicationMode
     */

    public void setApplicationMode(String applicationMode) {
        this.applicationMode = applicationMode;
    }

    /**
     * <p>
     * The classification for application component types.
     * </p>
     * 
     * @return The classification for application component types.
     * @see ApplicationMode
     */

    public String getApplicationMode() {
        return this.applicationMode;
    }

    /**
     * <p>
     * The classification for application component types.
     * </p>
     * 
     * @param applicationMode
     *        The classification for application component types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationMode
     */

    public GetPortfolioPreferencesResult withApplicationMode(String applicationMode) {
        setApplicationMode(applicationMode);
        return this;
    }

    /**
     * <p>
     * The classification for application component types.
     * </p>
     * 
     * @param applicationMode
     *        The classification for application component types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationMode
     */

    public GetPortfolioPreferencesResult withApplicationMode(ApplicationMode applicationMode) {
        this.applicationMode = applicationMode.toString();
        return this;
    }

    /**
     * <p>
     * The transformation preferences for non-database applications.
     * </p>
     * 
     * @param applicationPreferences
     *        The transformation preferences for non-database applications.
     */

    public void setApplicationPreferences(ApplicationPreferences applicationPreferences) {
        this.applicationPreferences = applicationPreferences;
    }

    /**
     * <p>
     * The transformation preferences for non-database applications.
     * </p>
     * 
     * @return The transformation preferences for non-database applications.
     */

    public ApplicationPreferences getApplicationPreferences() {
        return this.applicationPreferences;
    }

    /**
     * <p>
     * The transformation preferences for non-database applications.
     * </p>
     * 
     * @param applicationPreferences
     *        The transformation preferences for non-database applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPortfolioPreferencesResult withApplicationPreferences(ApplicationPreferences applicationPreferences) {
        setApplicationPreferences(applicationPreferences);
        return this;
    }

    /**
     * <p>
     * The transformation preferences for database applications.
     * </p>
     * 
     * @param databasePreferences
     *        The transformation preferences for database applications.
     */

    public void setDatabasePreferences(DatabasePreferences databasePreferences) {
        this.databasePreferences = databasePreferences;
    }

    /**
     * <p>
     * The transformation preferences for database applications.
     * </p>
     * 
     * @return The transformation preferences for database applications.
     */

    public DatabasePreferences getDatabasePreferences() {
        return this.databasePreferences;
    }

    /**
     * <p>
     * The transformation preferences for database applications.
     * </p>
     * 
     * @param databasePreferences
     *        The transformation preferences for database applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPortfolioPreferencesResult withDatabasePreferences(DatabasePreferences databasePreferences) {
        setDatabasePreferences(databasePreferences);
        return this;
    }

    /**
     * <p>
     * The rank of business goals based on priority.
     * </p>
     * 
     * @param prioritizeBusinessGoals
     *        The rank of business goals based on priority.
     */

    public void setPrioritizeBusinessGoals(PrioritizeBusinessGoals prioritizeBusinessGoals) {
        this.prioritizeBusinessGoals = prioritizeBusinessGoals;
    }

    /**
     * <p>
     * The rank of business goals based on priority.
     * </p>
     * 
     * @return The rank of business goals based on priority.
     */

    public PrioritizeBusinessGoals getPrioritizeBusinessGoals() {
        return this.prioritizeBusinessGoals;
    }

    /**
     * <p>
     * The rank of business goals based on priority.
     * </p>
     * 
     * @param prioritizeBusinessGoals
     *        The rank of business goals based on priority.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPortfolioPreferencesResult withPrioritizeBusinessGoals(PrioritizeBusinessGoals prioritizeBusinessGoals) {
        setPrioritizeBusinessGoals(prioritizeBusinessGoals);
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
        if (getApplicationMode() != null)
            sb.append("ApplicationMode: ").append(getApplicationMode()).append(",");
        if (getApplicationPreferences() != null)
            sb.append("ApplicationPreferences: ").append(getApplicationPreferences()).append(",");
        if (getDatabasePreferences() != null)
            sb.append("DatabasePreferences: ").append(getDatabasePreferences()).append(",");
        if (getPrioritizeBusinessGoals() != null)
            sb.append("PrioritizeBusinessGoals: ").append(getPrioritizeBusinessGoals());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPortfolioPreferencesResult == false)
            return false;
        GetPortfolioPreferencesResult other = (GetPortfolioPreferencesResult) obj;
        if (other.getApplicationMode() == null ^ this.getApplicationMode() == null)
            return false;
        if (other.getApplicationMode() != null && other.getApplicationMode().equals(this.getApplicationMode()) == false)
            return false;
        if (other.getApplicationPreferences() == null ^ this.getApplicationPreferences() == null)
            return false;
        if (other.getApplicationPreferences() != null && other.getApplicationPreferences().equals(this.getApplicationPreferences()) == false)
            return false;
        if (other.getDatabasePreferences() == null ^ this.getDatabasePreferences() == null)
            return false;
        if (other.getDatabasePreferences() != null && other.getDatabasePreferences().equals(this.getDatabasePreferences()) == false)
            return false;
        if (other.getPrioritizeBusinessGoals() == null ^ this.getPrioritizeBusinessGoals() == null)
            return false;
        if (other.getPrioritizeBusinessGoals() != null && other.getPrioritizeBusinessGoals().equals(this.getPrioritizeBusinessGoals()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationMode() == null) ? 0 : getApplicationMode().hashCode());
        hashCode = prime * hashCode + ((getApplicationPreferences() == null) ? 0 : getApplicationPreferences().hashCode());
        hashCode = prime * hashCode + ((getDatabasePreferences() == null) ? 0 : getDatabasePreferences().hashCode());
        hashCode = prime * hashCode + ((getPrioritizeBusinessGoals() == null) ? 0 : getPrioritizeBusinessGoals().hashCode());
        return hashCode;
    }

    @Override
    public GetPortfolioPreferencesResult clone() {
        try {
            return (GetPortfolioPreferencesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
