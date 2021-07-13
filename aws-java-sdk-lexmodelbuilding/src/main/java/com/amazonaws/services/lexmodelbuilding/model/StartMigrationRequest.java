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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/StartMigration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartMigrationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Amazon Lex V1 bot that you are migrating to Amazon Lex V2.
     * </p>
     */
    private String v1BotName;
    /**
     * <p>
     * The version of the bot to migrate to Amazon Lex V2. You can migrate the <code>$LATEST</code> version as well as
     * any numbered version.
     * </p>
     */
    private String v1BotVersion;
    /**
     * <p>
     * The name of the Amazon Lex V2 bot that you are migrating the Amazon Lex V1 bot to.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the Amazon Lex V2 bot doesn't exist, you must use the <code>CREATE_NEW</code> migration strategy.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the Amazon Lex V2 bot exists, you must use the <code>UPDATE_EXISTING</code> migration strategy to change the
     * contents of the Amazon Lex V2 bot.
     * </p>
     * </li>
     * </ul>
     */
    private String v2BotName;
    /**
     * <p>
     * The IAM role that Amazon Lex uses to run the Amazon Lex V2 bot.
     * </p>
     */
    private String v2BotRole;
    /**
     * <p>
     * The strategy used to conduct the migration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_NEW</code> - Creates a new Amazon Lex V2 bot and migrates the Amazon Lex V1 bot to the new bot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_EXISTING</code> - Overwrites the existing Amazon Lex V2 bot metadata and the locale being migrated.
     * It doesn't change any other locales in the Amazon Lex V2 bot. If the locale doesn't exist, a new locale is
     * created in the Amazon Lex V2 bot.
     * </p>
     * </li>
     * </ul>
     */
    private String migrationStrategy;

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

    public StartMigrationRequest withV1BotName(String v1BotName) {
        setV1BotName(v1BotName);
        return this;
    }

    /**
     * <p>
     * The version of the bot to migrate to Amazon Lex V2. You can migrate the <code>$LATEST</code> version as well as
     * any numbered version.
     * </p>
     * 
     * @param v1BotVersion
     *        The version of the bot to migrate to Amazon Lex V2. You can migrate the <code>$LATEST</code> version as
     *        well as any numbered version.
     */

    public void setV1BotVersion(String v1BotVersion) {
        this.v1BotVersion = v1BotVersion;
    }

    /**
     * <p>
     * The version of the bot to migrate to Amazon Lex V2. You can migrate the <code>$LATEST</code> version as well as
     * any numbered version.
     * </p>
     * 
     * @return The version of the bot to migrate to Amazon Lex V2. You can migrate the <code>$LATEST</code> version as
     *         well as any numbered version.
     */

    public String getV1BotVersion() {
        return this.v1BotVersion;
    }

    /**
     * <p>
     * The version of the bot to migrate to Amazon Lex V2. You can migrate the <code>$LATEST</code> version as well as
     * any numbered version.
     * </p>
     * 
     * @param v1BotVersion
     *        The version of the bot to migrate to Amazon Lex V2. You can migrate the <code>$LATEST</code> version as
     *        well as any numbered version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMigrationRequest withV1BotVersion(String v1BotVersion) {
        setV1BotVersion(v1BotVersion);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Lex V2 bot that you are migrating the Amazon Lex V1 bot to.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the Amazon Lex V2 bot doesn't exist, you must use the <code>CREATE_NEW</code> migration strategy.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the Amazon Lex V2 bot exists, you must use the <code>UPDATE_EXISTING</code> migration strategy to change the
     * contents of the Amazon Lex V2 bot.
     * </p>
     * </li>
     * </ul>
     * 
     * @param v2BotName
     *        The name of the Amazon Lex V2 bot that you are migrating the Amazon Lex V1 bot to. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the Amazon Lex V2 bot doesn't exist, you must use the <code>CREATE_NEW</code> migration strategy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the Amazon Lex V2 bot exists, you must use the <code>UPDATE_EXISTING</code> migration strategy to
     *        change the contents of the Amazon Lex V2 bot.
     *        </p>
     *        </li>
     */

    public void setV2BotName(String v2BotName) {
        this.v2BotName = v2BotName;
    }

    /**
     * <p>
     * The name of the Amazon Lex V2 bot that you are migrating the Amazon Lex V1 bot to.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the Amazon Lex V2 bot doesn't exist, you must use the <code>CREATE_NEW</code> migration strategy.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the Amazon Lex V2 bot exists, you must use the <code>UPDATE_EXISTING</code> migration strategy to change the
     * contents of the Amazon Lex V2 bot.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the Amazon Lex V2 bot that you are migrating the Amazon Lex V1 bot to. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the Amazon Lex V2 bot doesn't exist, you must use the <code>CREATE_NEW</code> migration strategy.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the Amazon Lex V2 bot exists, you must use the <code>UPDATE_EXISTING</code> migration strategy to
     *         change the contents of the Amazon Lex V2 bot.
     *         </p>
     *         </li>
     */

    public String getV2BotName() {
        return this.v2BotName;
    }

    /**
     * <p>
     * The name of the Amazon Lex V2 bot that you are migrating the Amazon Lex V1 bot to.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the Amazon Lex V2 bot doesn't exist, you must use the <code>CREATE_NEW</code> migration strategy.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the Amazon Lex V2 bot exists, you must use the <code>UPDATE_EXISTING</code> migration strategy to change the
     * contents of the Amazon Lex V2 bot.
     * </p>
     * </li>
     * </ul>
     * 
     * @param v2BotName
     *        The name of the Amazon Lex V2 bot that you are migrating the Amazon Lex V1 bot to. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the Amazon Lex V2 bot doesn't exist, you must use the <code>CREATE_NEW</code> migration strategy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the Amazon Lex V2 bot exists, you must use the <code>UPDATE_EXISTING</code> migration strategy to
     *        change the contents of the Amazon Lex V2 bot.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMigrationRequest withV2BotName(String v2BotName) {
        setV2BotName(v2BotName);
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

    public StartMigrationRequest withV2BotRole(String v2BotRole) {
        setV2BotRole(v2BotRole);
        return this;
    }

    /**
     * <p>
     * The strategy used to conduct the migration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_NEW</code> - Creates a new Amazon Lex V2 bot and migrates the Amazon Lex V1 bot to the new bot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_EXISTING</code> - Overwrites the existing Amazon Lex V2 bot metadata and the locale being migrated.
     * It doesn't change any other locales in the Amazon Lex V2 bot. If the locale doesn't exist, a new locale is
     * created in the Amazon Lex V2 bot.
     * </p>
     * </li>
     * </ul>
     * 
     * @param migrationStrategy
     *        The strategy used to conduct the migration.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE_NEW</code> - Creates a new Amazon Lex V2 bot and migrates the Amazon Lex V1 bot to the new
     *        bot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_EXISTING</code> - Overwrites the existing Amazon Lex V2 bot metadata and the locale being
     *        migrated. It doesn't change any other locales in the Amazon Lex V2 bot. If the locale doesn't exist, a new
     *        locale is created in the Amazon Lex V2 bot.
     *        </p>
     *        </li>
     * @see MigrationStrategy
     */

    public void setMigrationStrategy(String migrationStrategy) {
        this.migrationStrategy = migrationStrategy;
    }

    /**
     * <p>
     * The strategy used to conduct the migration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_NEW</code> - Creates a new Amazon Lex V2 bot and migrates the Amazon Lex V1 bot to the new bot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_EXISTING</code> - Overwrites the existing Amazon Lex V2 bot metadata and the locale being migrated.
     * It doesn't change any other locales in the Amazon Lex V2 bot. If the locale doesn't exist, a new locale is
     * created in the Amazon Lex V2 bot.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The strategy used to conduct the migration.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATE_NEW</code> - Creates a new Amazon Lex V2 bot and migrates the Amazon Lex V1 bot to the new
     *         bot.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATE_EXISTING</code> - Overwrites the existing Amazon Lex V2 bot metadata and the locale being
     *         migrated. It doesn't change any other locales in the Amazon Lex V2 bot. If the locale doesn't exist, a
     *         new locale is created in the Amazon Lex V2 bot.
     *         </p>
     *         </li>
     * @see MigrationStrategy
     */

    public String getMigrationStrategy() {
        return this.migrationStrategy;
    }

    /**
     * <p>
     * The strategy used to conduct the migration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_NEW</code> - Creates a new Amazon Lex V2 bot and migrates the Amazon Lex V1 bot to the new bot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_EXISTING</code> - Overwrites the existing Amazon Lex V2 bot metadata and the locale being migrated.
     * It doesn't change any other locales in the Amazon Lex V2 bot. If the locale doesn't exist, a new locale is
     * created in the Amazon Lex V2 bot.
     * </p>
     * </li>
     * </ul>
     * 
     * @param migrationStrategy
     *        The strategy used to conduct the migration.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE_NEW</code> - Creates a new Amazon Lex V2 bot and migrates the Amazon Lex V1 bot to the new
     *        bot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_EXISTING</code> - Overwrites the existing Amazon Lex V2 bot metadata and the locale being
     *        migrated. It doesn't change any other locales in the Amazon Lex V2 bot. If the locale doesn't exist, a new
     *        locale is created in the Amazon Lex V2 bot.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MigrationStrategy
     */

    public StartMigrationRequest withMigrationStrategy(String migrationStrategy) {
        setMigrationStrategy(migrationStrategy);
        return this;
    }

    /**
     * <p>
     * The strategy used to conduct the migration.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE_NEW</code> - Creates a new Amazon Lex V2 bot and migrates the Amazon Lex V1 bot to the new bot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_EXISTING</code> - Overwrites the existing Amazon Lex V2 bot metadata and the locale being migrated.
     * It doesn't change any other locales in the Amazon Lex V2 bot. If the locale doesn't exist, a new locale is
     * created in the Amazon Lex V2 bot.
     * </p>
     * </li>
     * </ul>
     * 
     * @param migrationStrategy
     *        The strategy used to conduct the migration.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATE_NEW</code> - Creates a new Amazon Lex V2 bot and migrates the Amazon Lex V1 bot to the new
     *        bot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_EXISTING</code> - Overwrites the existing Amazon Lex V2 bot metadata and the locale being
     *        migrated. It doesn't change any other locales in the Amazon Lex V2 bot. If the locale doesn't exist, a new
     *        locale is created in the Amazon Lex V2 bot.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MigrationStrategy
     */

    public StartMigrationRequest withMigrationStrategy(MigrationStrategy migrationStrategy) {
        this.migrationStrategy = migrationStrategy.toString();
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
        if (getV2BotName() != null)
            sb.append("V2BotName: ").append(getV2BotName()).append(",");
        if (getV2BotRole() != null)
            sb.append("V2BotRole: ").append(getV2BotRole()).append(",");
        if (getMigrationStrategy() != null)
            sb.append("MigrationStrategy: ").append(getMigrationStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartMigrationRequest == false)
            return false;
        StartMigrationRequest other = (StartMigrationRequest) obj;
        if (other.getV1BotName() == null ^ this.getV1BotName() == null)
            return false;
        if (other.getV1BotName() != null && other.getV1BotName().equals(this.getV1BotName()) == false)
            return false;
        if (other.getV1BotVersion() == null ^ this.getV1BotVersion() == null)
            return false;
        if (other.getV1BotVersion() != null && other.getV1BotVersion().equals(this.getV1BotVersion()) == false)
            return false;
        if (other.getV2BotName() == null ^ this.getV2BotName() == null)
            return false;
        if (other.getV2BotName() != null && other.getV2BotName().equals(this.getV2BotName()) == false)
            return false;
        if (other.getV2BotRole() == null ^ this.getV2BotRole() == null)
            return false;
        if (other.getV2BotRole() != null && other.getV2BotRole().equals(this.getV2BotRole()) == false)
            return false;
        if (other.getMigrationStrategy() == null ^ this.getMigrationStrategy() == null)
            return false;
        if (other.getMigrationStrategy() != null && other.getMigrationStrategy().equals(this.getMigrationStrategy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getV1BotName() == null) ? 0 : getV1BotName().hashCode());
        hashCode = prime * hashCode + ((getV1BotVersion() == null) ? 0 : getV1BotVersion().hashCode());
        hashCode = prime * hashCode + ((getV2BotName() == null) ? 0 : getV2BotName().hashCode());
        hashCode = prime * hashCode + ((getV2BotRole() == null) ? 0 : getV2BotRole().hashCode());
        hashCode = prime * hashCode + ((getMigrationStrategy() == null) ? 0 : getMigrationStrategy().hashCode());
        return hashCode;
    }

    @Override
    public StartMigrationRequest clone() {
        return (StartMigrationRequest) super.clone();
    }

}
