/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexmodelbuilding.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/StartMigration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartMigrationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Amazon Lex V1 bot that you are migrating to Amazon Lex V2.
     * </p>
     */
    private String v1BotName;
    /**
     * <p>
     * The version of the bot to migrate to Amazon Lex V2.
     * </p>
     */
    private String v1BotVersion;
    /**
     * <p>
     * The locale used for the Amazon Lex V1 bot.
     * </p>
     */
    private String v1BotLocale;
    /**
     * <p>
     * The unique identifier for the Amazon Lex V2 bot.
     * </p>
     */
    private String v2BotId;
    /**
     * <p>
     * The IAM role that Amazon Lex uses to run the Amazon Lex V2 bot.
     * </p>
     */
    private String v2BotRole;
    /**
     * <p>
     * The unique identifier that Amazon Lex assigned to the migration.
     * </p>
     */
    private String migrationId;
    /**
     * <p>
     * The strategy used to conduct the migration.
     * </p>
     */
    private String migrationStrategy;
    /**
     * <p>
     * The date and time that the migration started.
     * </p>
     */
    private java.util.Date migrationTimestamp;

    /**
     * <p>
     * The name of the Amazon Lex V1 bot that you are migrating to Amazon Lex V2.
     * </p>
     * 
     * @param v1BotName
     *        The name of the Amazon Lex V1 bot that you are migrating to Amazon Lex V2.
     */

    public void setV1BotName(String v1BotName) {
        this.v1BotName = v1BotName;
    }

    /**
     * <p>
     * The name of the Amazon Lex V1 bot that you are migrating to Amazon Lex V2.
     * </p>
     * 
     * @return The name of the Amazon Lex V1 bot that you are migrating to Amazon Lex V2.
     */

    public String getV1BotName() {
        return this.v1BotName;
    }

    /**
     * <p>
     * The name of the Amazon Lex V1 bot that you are migrating to Amazon Lex V2.
     * </p>
     * 
     * @param v1BotName
     *        The name of the Amazon Lex V1 bot that you are migrating to Amazon Lex V2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMigrationResult withV1BotName(String v1BotName) {
        setV1BotName(v1BotName);
        return this;
    }

    /**
     * <p>
     * The version of the bot to migrate to Amazon Lex V2.
     * </p>
     * 
     * @param v1BotVersion
     *        The version of the bot to migrate to Amazon Lex V2.
     */

    public void setV1BotVersion(String v1BotVersion) {
        this.v1BotVersion = v1BotVersion;
    }

    /**
     * <p>
     * The version of the bot to migrate to Amazon Lex V2.
     * </p>
     * 
     * @return The version of the bot to migrate to Amazon Lex V2.
     */

    public String getV1BotVersion() {
        return this.v1BotVersion;
    }

    /**
     * <p>
     * The version of the bot to migrate to Amazon Lex V2.
     * </p>
     * 
     * @param v1BotVersion
     *        The version of the bot to migrate to Amazon Lex V2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMigrationResult withV1BotVersion(String v1BotVersion) {
        setV1BotVersion(v1BotVersion);
        return this;
    }

    /**
     * <p>
     * The locale used for the Amazon Lex V1 bot.
     * </p>
     * 
     * @param v1BotLocale
     *        The locale used for the Amazon Lex V1 bot.
     * @see Locale
     */

    public void setV1BotLocale(String v1BotLocale) {
        this.v1BotLocale = v1BotLocale;
    }

    /**
     * <p>
     * The locale used for the Amazon Lex V1 bot.
     * </p>
     * 
     * @return The locale used for the Amazon Lex V1 bot.
     * @see Locale
     */

    public String getV1BotLocale() {
        return this.v1BotLocale;
    }

    /**
     * <p>
     * The locale used for the Amazon Lex V1 bot.
     * </p>
     * 
     * @param v1BotLocale
     *        The locale used for the Amazon Lex V1 bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Locale
     */

    public StartMigrationResult withV1BotLocale(String v1BotLocale) {
        setV1BotLocale(v1BotLocale);
        return this;
    }

    /**
     * <p>
     * The locale used for the Amazon Lex V1 bot.
     * </p>
     * 
     * @param v1BotLocale
     *        The locale used for the Amazon Lex V1 bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Locale
     */

    public StartMigrationResult withV1BotLocale(Locale v1BotLocale) {
        this.v1BotLocale = v1BotLocale.toString();
        return this;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Lex V2 bot.
     * </p>
     * 
     * @param v2BotId
     *        The unique identifier for the Amazon Lex V2 bot.
     */

    public void setV2BotId(String v2BotId) {
        this.v2BotId = v2BotId;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Lex V2 bot.
     * </p>
     * 
     * @return The unique identifier for the Amazon Lex V2 bot.
     */

    public String getV2BotId() {
        return this.v2BotId;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Lex V2 bot.
     * </p>
     * 
     * @param v2BotId
     *        The unique identifier for the Amazon Lex V2 bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMigrationResult withV2BotId(String v2BotId) {
        setV2BotId(v2BotId);
        return this;
    }

    /**
     * <p>
     * The IAM role that Amazon Lex uses to run the Amazon Lex V2 bot.
     * </p>
     * 
     * @param v2BotRole
     *        The IAM role that Amazon Lex uses to run the Amazon Lex V2 bot.
     */

    public void setV2BotRole(String v2BotRole) {
        this.v2BotRole = v2BotRole;
    }

    /**
     * <p>
     * The IAM role that Amazon Lex uses to run the Amazon Lex V2 bot.
     * </p>
     * 
     * @return The IAM role that Amazon Lex uses to run the Amazon Lex V2 bot.
     */

    public String getV2BotRole() {
        return this.v2BotRole;
    }

    /**
     * <p>
     * The IAM role that Amazon Lex uses to run the Amazon Lex V2 bot.
     * </p>
     * 
     * @param v2BotRole
     *        The IAM role that Amazon Lex uses to run the Amazon Lex V2 bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMigrationResult withV2BotRole(String v2BotRole) {
        setV2BotRole(v2BotRole);
        return this;
    }

    /**
     * <p>
     * The unique identifier that Amazon Lex assigned to the migration.
     * </p>
     * 
     * @param migrationId
     *        The unique identifier that Amazon Lex assigned to the migration.
     */

    public void setMigrationId(String migrationId) {
        this.migrationId = migrationId;
    }

    /**
     * <p>
     * The unique identifier that Amazon Lex assigned to the migration.
     * </p>
     * 
     * @return The unique identifier that Amazon Lex assigned to the migration.
     */

    public String getMigrationId() {
        return this.migrationId;
    }

    /**
     * <p>
     * The unique identifier that Amazon Lex assigned to the migration.
     * </p>
     * 
     * @param migrationId
     *        The unique identifier that Amazon Lex assigned to the migration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMigrationResult withMigrationId(String migrationId) {
        setMigrationId(migrationId);
        return this;
    }

    /**
     * <p>
     * The strategy used to conduct the migration.
     * </p>
     * 
     * @param migrationStrategy
     *        The strategy used to conduct the migration.
     * @see MigrationStrategy
     */

    public void setMigrationStrategy(String migrationStrategy) {
        this.migrationStrategy = migrationStrategy;
    }

    /**
     * <p>
     * The strategy used to conduct the migration.
     * </p>
     * 
     * @return The strategy used to conduct the migration.
     * @see MigrationStrategy
     */

    public String getMigrationStrategy() {
        return this.migrationStrategy;
    }

    /**
     * <p>
     * The strategy used to conduct the migration.
     * </p>
     * 
     * @param migrationStrategy
     *        The strategy used to conduct the migration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MigrationStrategy
     */

    public StartMigrationResult withMigrationStrategy(String migrationStrategy) {
        setMigrationStrategy(migrationStrategy);
        return this;
    }

    /**
     * <p>
     * The strategy used to conduct the migration.
     * </p>
     * 
     * @param migrationStrategy
     *        The strategy used to conduct the migration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MigrationStrategy
     */

    public StartMigrationResult withMigrationStrategy(MigrationStrategy migrationStrategy) {
        this.migrationStrategy = migrationStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the migration started.
     * </p>
     * 
     * @param migrationTimestamp
     *        The date and time that the migration started.
     */

    public void setMigrationTimestamp(java.util.Date migrationTimestamp) {
        this.migrationTimestamp = migrationTimestamp;
    }

    /**
     * <p>
     * The date and time that the migration started.
     * </p>
     * 
     * @return The date and time that the migration started.
     */

    public java.util.Date getMigrationTimestamp() {
        return this.migrationTimestamp;
    }

    /**
     * <p>
     * The date and time that the migration started.
     * </p>
     * 
     * @param migrationTimestamp
     *        The date and time that the migration started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMigrationResult withMigrationTimestamp(java.util.Date migrationTimestamp) {
        setMigrationTimestamp(migrationTimestamp);
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
        if (getV1BotName() != null)
            sb.append("V1BotName: ").append(getV1BotName()).append(",");
        if (getV1BotVersion() != null)
            sb.append("V1BotVersion: ").append(getV1BotVersion()).append(",");
        if (getV1BotLocale() != null)
            sb.append("V1BotLocale: ").append(getV1BotLocale()).append(",");
        if (getV2BotId() != null)
            sb.append("V2BotId: ").append(getV2BotId()).append(",");
        if (getV2BotRole() != null)
            sb.append("V2BotRole: ").append(getV2BotRole()).append(",");
        if (getMigrationId() != null)
            sb.append("MigrationId: ").append(getMigrationId()).append(",");
        if (getMigrationStrategy() != null)
            sb.append("MigrationStrategy: ").append(getMigrationStrategy()).append(",");
        if (getMigrationTimestamp() != null)
            sb.append("MigrationTimestamp: ").append(getMigrationTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartMigrationResult == false)
            return false;
        StartMigrationResult other = (StartMigrationResult) obj;
        if (other.getV1BotName() == null ^ this.getV1BotName() == null)
            return false;
        if (other.getV1BotName() != null && other.getV1BotName().equals(this.getV1BotName()) == false)
            return false;
        if (other.getV1BotVersion() == null ^ this.getV1BotVersion() == null)
            return false;
        if (other.getV1BotVersion() != null && other.getV1BotVersion().equals(this.getV1BotVersion()) == false)
            return false;
        if (other.getV1BotLocale() == null ^ this.getV1BotLocale() == null)
            return false;
        if (other.getV1BotLocale() != null && other.getV1BotLocale().equals(this.getV1BotLocale()) == false)
            return false;
        if (other.getV2BotId() == null ^ this.getV2BotId() == null)
            return false;
        if (other.getV2BotId() != null && other.getV2BotId().equals(this.getV2BotId()) == false)
            return false;
        if (other.getV2BotRole() == null ^ this.getV2BotRole() == null)
            return false;
        if (other.getV2BotRole() != null && other.getV2BotRole().equals(this.getV2BotRole()) == false)
            return false;
        if (other.getMigrationId() == null ^ this.getMigrationId() == null)
            return false;
        if (other.getMigrationId() != null && other.getMigrationId().equals(this.getMigrationId()) == false)
            return false;
        if (other.getMigrationStrategy() == null ^ this.getMigrationStrategy() == null)
            return false;
        if (other.getMigrationStrategy() != null && other.getMigrationStrategy().equals(this.getMigrationStrategy()) == false)
            return false;
        if (other.getMigrationTimestamp() == null ^ this.getMigrationTimestamp() == null)
            return false;
        if (other.getMigrationTimestamp() != null && other.getMigrationTimestamp().equals(this.getMigrationTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getV1BotName() == null) ? 0 : getV1BotName().hashCode());
        hashCode = prime * hashCode + ((getV1BotVersion() == null) ? 0 : getV1BotVersion().hashCode());
        hashCode = prime * hashCode + ((getV1BotLocale() == null) ? 0 : getV1BotLocale().hashCode());
        hashCode = prime * hashCode + ((getV2BotId() == null) ? 0 : getV2BotId().hashCode());
        hashCode = prime * hashCode + ((getV2BotRole() == null) ? 0 : getV2BotRole().hashCode());
        hashCode = prime * hashCode + ((getMigrationId() == null) ? 0 : getMigrationId().hashCode());
        hashCode = prime * hashCode + ((getMigrationStrategy() == null) ? 0 : getMigrationStrategy().hashCode());
        hashCode = prime * hashCode + ((getMigrationTimestamp() == null) ? 0 : getMigrationTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public StartMigrationResult clone() {
        try {
            return (StartMigrationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
