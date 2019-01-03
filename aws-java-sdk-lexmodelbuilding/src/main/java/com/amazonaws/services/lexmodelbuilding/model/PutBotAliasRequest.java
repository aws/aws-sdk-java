/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/PutBotAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutBotAliasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the alias. The name is <i>not</i> case sensitive.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the alias.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The version of the bot.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The name of the bot.
     * </p>
     */
    private String botName;
    /**
     * <p>
     * Identifies a specific revision of the <code>$LATEST</code> version.
     * </p>
     * <p>
     * When you create a new bot alias, leave the <code>checksum</code> field blank. If you specify a checksum you get a
     * <code>BadRequestException</code> exception.
     * </p>
     * <p>
     * When you want to update a bot alias, set the <code>checksum</code> field to the checksum of the most recent
     * revision of the <code>$LATEST</code> version. If you don't specify the <code> checksum</code> field, or if the
     * checksum does not match the <code>$LATEST</code> version, you get a <code>PreconditionFailedException</code>
     * exception.
     * </p>
     */
    private String checksum;

    /**
     * <p>
     * The name of the alias. The name is <i>not</i> case sensitive.
     * </p>
     * 
     * @param name
     *        The name of the alias. The name is <i>not</i> case sensitive.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the alias. The name is <i>not</i> case sensitive.
     * </p>
     * 
     * @return The name of the alias. The name is <i>not</i> case sensitive.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the alias. The name is <i>not</i> case sensitive.
     * </p>
     * 
     * @param name
     *        The name of the alias. The name is <i>not</i> case sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBotAliasRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the alias.
     * </p>
     * 
     * @param description
     *        A description of the alias.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the alias.
     * </p>
     * 
     * @return A description of the alias.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the alias.
     * </p>
     * 
     * @param description
     *        A description of the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBotAliasRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The version of the bot.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot.
     * </p>
     * 
     * @return The version of the bot.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBotAliasRequest withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The name of the bot.
     * </p>
     * 
     * @param botName
     *        The name of the bot.
     */

    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * <p>
     * The name of the bot.
     * </p>
     * 
     * @return The name of the bot.
     */

    public String getBotName() {
        return this.botName;
    }

    /**
     * <p>
     * The name of the bot.
     * </p>
     * 
     * @param botName
     *        The name of the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBotAliasRequest withBotName(String botName) {
        setBotName(botName);
        return this;
    }

    /**
     * <p>
     * Identifies a specific revision of the <code>$LATEST</code> version.
     * </p>
     * <p>
     * When you create a new bot alias, leave the <code>checksum</code> field blank. If you specify a checksum you get a
     * <code>BadRequestException</code> exception.
     * </p>
     * <p>
     * When you want to update a bot alias, set the <code>checksum</code> field to the checksum of the most recent
     * revision of the <code>$LATEST</code> version. If you don't specify the <code> checksum</code> field, or if the
     * checksum does not match the <code>$LATEST</code> version, you get a <code>PreconditionFailedException</code>
     * exception.
     * </p>
     * 
     * @param checksum
     *        Identifies a specific revision of the <code>$LATEST</code> version.</p>
     *        <p>
     *        When you create a new bot alias, leave the <code>checksum</code> field blank. If you specify a checksum
     *        you get a <code>BadRequestException</code> exception.
     *        </p>
     *        <p>
     *        When you want to update a bot alias, set the <code>checksum</code> field to the checksum of the most
     *        recent revision of the <code>$LATEST</code> version. If you don't specify the <code> checksum</code>
     *        field, or if the checksum does not match the <code>$LATEST</code> version, you get a
     *        <code>PreconditionFailedException</code> exception.
     */

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * <p>
     * Identifies a specific revision of the <code>$LATEST</code> version.
     * </p>
     * <p>
     * When you create a new bot alias, leave the <code>checksum</code> field blank. If you specify a checksum you get a
     * <code>BadRequestException</code> exception.
     * </p>
     * <p>
     * When you want to update a bot alias, set the <code>checksum</code> field to the checksum of the most recent
     * revision of the <code>$LATEST</code> version. If you don't specify the <code> checksum</code> field, or if the
     * checksum does not match the <code>$LATEST</code> version, you get a <code>PreconditionFailedException</code>
     * exception.
     * </p>
     * 
     * @return Identifies a specific revision of the <code>$LATEST</code> version.</p>
     *         <p>
     *         When you create a new bot alias, leave the <code>checksum</code> field blank. If you specify a checksum
     *         you get a <code>BadRequestException</code> exception.
     *         </p>
     *         <p>
     *         When you want to update a bot alias, set the <code>checksum</code> field to the checksum of the most
     *         recent revision of the <code>$LATEST</code> version. If you don't specify the <code> checksum</code>
     *         field, or if the checksum does not match the <code>$LATEST</code> version, you get a
     *         <code>PreconditionFailedException</code> exception.
     */

    public String getChecksum() {
        return this.checksum;
    }

    /**
     * <p>
     * Identifies a specific revision of the <code>$LATEST</code> version.
     * </p>
     * <p>
     * When you create a new bot alias, leave the <code>checksum</code> field blank. If you specify a checksum you get a
     * <code>BadRequestException</code> exception.
     * </p>
     * <p>
     * When you want to update a bot alias, set the <code>checksum</code> field to the checksum of the most recent
     * revision of the <code>$LATEST</code> version. If you don't specify the <code> checksum</code> field, or if the
     * checksum does not match the <code>$LATEST</code> version, you get a <code>PreconditionFailedException</code>
     * exception.
     * </p>
     * 
     * @param checksum
     *        Identifies a specific revision of the <code>$LATEST</code> version.</p>
     *        <p>
     *        When you create a new bot alias, leave the <code>checksum</code> field blank. If you specify a checksum
     *        you get a <code>BadRequestException</code> exception.
     *        </p>
     *        <p>
     *        When you want to update a bot alias, set the <code>checksum</code> field to the checksum of the most
     *        recent revision of the <code>$LATEST</code> version. If you don't specify the <code> checksum</code>
     *        field, or if the checksum does not match the <code>$LATEST</code> version, you get a
     *        <code>PreconditionFailedException</code> exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBotAliasRequest withChecksum(String checksum) {
        setChecksum(checksum);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getBotVersion() != null)
            sb.append("BotVersion: ").append(getBotVersion()).append(",");
        if (getBotName() != null)
            sb.append("BotName: ").append(getBotName()).append(",");
        if (getChecksum() != null)
            sb.append("Checksum: ").append(getChecksum());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutBotAliasRequest == false)
            return false;
        PutBotAliasRequest other = (PutBotAliasRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getBotVersion() == null ^ this.getBotVersion() == null)
            return false;
        if (other.getBotVersion() != null && other.getBotVersion().equals(this.getBotVersion()) == false)
            return false;
        if (other.getBotName() == null ^ this.getBotName() == null)
            return false;
        if (other.getBotName() != null && other.getBotName().equals(this.getBotName()) == false)
            return false;
        if (other.getChecksum() == null ^ this.getChecksum() == null)
            return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getBotName() == null) ? 0 : getBotName().hashCode());
        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        return hashCode;
    }

    @Override
    public PutBotAliasRequest clone() {
        return (PutBotAliasRequest) super.clone();
    }

}
