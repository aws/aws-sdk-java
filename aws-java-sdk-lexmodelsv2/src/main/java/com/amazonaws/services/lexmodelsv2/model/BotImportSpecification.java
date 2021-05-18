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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the bot parameters required for importing a bot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BotImportSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BotImportSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name that Amazon Lex should use for the bot.
     * </p>
     */
    private String botName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used to build and run the bot.
     * </p>
     */
    private String roleArn;

    private DataPrivacy dataPrivacy;
    /**
     * <p>
     * The time, in seconds, that Amazon Lex should keep information about a user's conversation with the bot.
     * </p>
     * <p>
     * A user interaction remains active for the amount of time specified. If no conversation occurs during this time,
     * the session expires and Amazon Lex deletes any data provided before the timeout.
     * </p>
     * <p>
     * You can specify between 60 (1 minute) and 86,400 (24 hours) seconds.
     * </p>
     */
    private Integer idleSessionTTLInSeconds;
    /**
     * <p>
     * A list of tags to add to the bot. You can only add tags when you import a bot. You can't use the
     * <code>UpdateBot</code> operation to update tags. To update tags, use the <code>TagResource</code> operation.
     * </p>
     */
    private java.util.Map<String, String> botTags;
    /**
     * <p>
     * A list of tags to add to the test alias for a bot. You can only add tags when you import a bot. You can't use the
     * <code>UpdateAlias</code> operation to update tags. To update tags on the test alias, use the
     * <code>TagResource</code> operation.
     * </p>
     */
    private java.util.Map<String, String> testBotAliasTags;

    /**
     * <p>
     * The name that Amazon Lex should use for the bot.
     * </p>
     * 
     * @param botName
     *        The name that Amazon Lex should use for the bot.
     */

    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * <p>
     * The name that Amazon Lex should use for the bot.
     * </p>
     * 
     * @return The name that Amazon Lex should use for the bot.
     */

    public String getBotName() {
        return this.botName;
    }

    /**
     * <p>
     * The name that Amazon Lex should use for the bot.
     * </p>
     * 
     * @param botName
     *        The name that Amazon Lex should use for the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotImportSpecification withBotName(String botName) {
        setBotName(botName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used to build and run the bot.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role used to build and run the bot.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used to build and run the bot.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role used to build and run the bot.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used to build and run the bot.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role used to build and run the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotImportSpecification withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * @param dataPrivacy
     */

    public void setDataPrivacy(DataPrivacy dataPrivacy) {
        this.dataPrivacy = dataPrivacy;
    }

    /**
     * @return
     */

    public DataPrivacy getDataPrivacy() {
        return this.dataPrivacy;
    }

    /**
     * @param dataPrivacy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotImportSpecification withDataPrivacy(DataPrivacy dataPrivacy) {
        setDataPrivacy(dataPrivacy);
        return this;
    }

    /**
     * <p>
     * The time, in seconds, that Amazon Lex should keep information about a user's conversation with the bot.
     * </p>
     * <p>
     * A user interaction remains active for the amount of time specified. If no conversation occurs during this time,
     * the session expires and Amazon Lex deletes any data provided before the timeout.
     * </p>
     * <p>
     * You can specify between 60 (1 minute) and 86,400 (24 hours) seconds.
     * </p>
     * 
     * @param idleSessionTTLInSeconds
     *        The time, in seconds, that Amazon Lex should keep information about a user's conversation with the bot.
     *        </p>
     *        <p>
     *        A user interaction remains active for the amount of time specified. If no conversation occurs during this
     *        time, the session expires and Amazon Lex deletes any data provided before the timeout.
     *        </p>
     *        <p>
     *        You can specify between 60 (1 minute) and 86,400 (24 hours) seconds.
     */

    public void setIdleSessionTTLInSeconds(Integer idleSessionTTLInSeconds) {
        this.idleSessionTTLInSeconds = idleSessionTTLInSeconds;
    }

    /**
     * <p>
     * The time, in seconds, that Amazon Lex should keep information about a user's conversation with the bot.
     * </p>
     * <p>
     * A user interaction remains active for the amount of time specified. If no conversation occurs during this time,
     * the session expires and Amazon Lex deletes any data provided before the timeout.
     * </p>
     * <p>
     * You can specify between 60 (1 minute) and 86,400 (24 hours) seconds.
     * </p>
     * 
     * @return The time, in seconds, that Amazon Lex should keep information about a user's conversation with the bot.
     *         </p>
     *         <p>
     *         A user interaction remains active for the amount of time specified. If no conversation occurs during this
     *         time, the session expires and Amazon Lex deletes any data provided before the timeout.
     *         </p>
     *         <p>
     *         You can specify between 60 (1 minute) and 86,400 (24 hours) seconds.
     */

    public Integer getIdleSessionTTLInSeconds() {
        return this.idleSessionTTLInSeconds;
    }

    /**
     * <p>
     * The time, in seconds, that Amazon Lex should keep information about a user's conversation with the bot.
     * </p>
     * <p>
     * A user interaction remains active for the amount of time specified. If no conversation occurs during this time,
     * the session expires and Amazon Lex deletes any data provided before the timeout.
     * </p>
     * <p>
     * You can specify between 60 (1 minute) and 86,400 (24 hours) seconds.
     * </p>
     * 
     * @param idleSessionTTLInSeconds
     *        The time, in seconds, that Amazon Lex should keep information about a user's conversation with the bot.
     *        </p>
     *        <p>
     *        A user interaction remains active for the amount of time specified. If no conversation occurs during this
     *        time, the session expires and Amazon Lex deletes any data provided before the timeout.
     *        </p>
     *        <p>
     *        You can specify between 60 (1 minute) and 86,400 (24 hours) seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotImportSpecification withIdleSessionTTLInSeconds(Integer idleSessionTTLInSeconds) {
        setIdleSessionTTLInSeconds(idleSessionTTLInSeconds);
        return this;
    }

    /**
     * <p>
     * A list of tags to add to the bot. You can only add tags when you import a bot. You can't use the
     * <code>UpdateBot</code> operation to update tags. To update tags, use the <code>TagResource</code> operation.
     * </p>
     * 
     * @return A list of tags to add to the bot. You can only add tags when you import a bot. You can't use the
     *         <code>UpdateBot</code> operation to update tags. To update tags, use the <code>TagResource</code>
     *         operation.
     */

    public java.util.Map<String, String> getBotTags() {
        return botTags;
    }

    /**
     * <p>
     * A list of tags to add to the bot. You can only add tags when you import a bot. You can't use the
     * <code>UpdateBot</code> operation to update tags. To update tags, use the <code>TagResource</code> operation.
     * </p>
     * 
     * @param botTags
     *        A list of tags to add to the bot. You can only add tags when you import a bot. You can't use the
     *        <code>UpdateBot</code> operation to update tags. To update tags, use the <code>TagResource</code>
     *        operation.
     */

    public void setBotTags(java.util.Map<String, String> botTags) {
        this.botTags = botTags;
    }

    /**
     * <p>
     * A list of tags to add to the bot. You can only add tags when you import a bot. You can't use the
     * <code>UpdateBot</code> operation to update tags. To update tags, use the <code>TagResource</code> operation.
     * </p>
     * 
     * @param botTags
     *        A list of tags to add to the bot. You can only add tags when you import a bot. You can't use the
     *        <code>UpdateBot</code> operation to update tags. To update tags, use the <code>TagResource</code>
     *        operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotImportSpecification withBotTags(java.util.Map<String, String> botTags) {
        setBotTags(botTags);
        return this;
    }

    /**
     * Add a single BotTags entry
     *
     * @see BotImportSpecification#withBotTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public BotImportSpecification addBotTagsEntry(String key, String value) {
        if (null == this.botTags) {
            this.botTags = new java.util.HashMap<String, String>();
        }
        if (this.botTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.botTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into BotTags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotImportSpecification clearBotTagsEntries() {
        this.botTags = null;
        return this;
    }

    /**
     * <p>
     * A list of tags to add to the test alias for a bot. You can only add tags when you import a bot. You can't use the
     * <code>UpdateAlias</code> operation to update tags. To update tags on the test alias, use the
     * <code>TagResource</code> operation.
     * </p>
     * 
     * @return A list of tags to add to the test alias for a bot. You can only add tags when you import a bot. You can't
     *         use the <code>UpdateAlias</code> operation to update tags. To update tags on the test alias, use the
     *         <code>TagResource</code> operation.
     */

    public java.util.Map<String, String> getTestBotAliasTags() {
        return testBotAliasTags;
    }

    /**
     * <p>
     * A list of tags to add to the test alias for a bot. You can only add tags when you import a bot. You can't use the
     * <code>UpdateAlias</code> operation to update tags. To update tags on the test alias, use the
     * <code>TagResource</code> operation.
     * </p>
     * 
     * @param testBotAliasTags
     *        A list of tags to add to the test alias for a bot. You can only add tags when you import a bot. You can't
     *        use the <code>UpdateAlias</code> operation to update tags. To update tags on the test alias, use the
     *        <code>TagResource</code> operation.
     */

    public void setTestBotAliasTags(java.util.Map<String, String> testBotAliasTags) {
        this.testBotAliasTags = testBotAliasTags;
    }

    /**
     * <p>
     * A list of tags to add to the test alias for a bot. You can only add tags when you import a bot. You can't use the
     * <code>UpdateAlias</code> operation to update tags. To update tags on the test alias, use the
     * <code>TagResource</code> operation.
     * </p>
     * 
     * @param testBotAliasTags
     *        A list of tags to add to the test alias for a bot. You can only add tags when you import a bot. You can't
     *        use the <code>UpdateAlias</code> operation to update tags. To update tags on the test alias, use the
     *        <code>TagResource</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotImportSpecification withTestBotAliasTags(java.util.Map<String, String> testBotAliasTags) {
        setTestBotAliasTags(testBotAliasTags);
        return this;
    }

    /**
     * Add a single TestBotAliasTags entry
     *
     * @see BotImportSpecification#withTestBotAliasTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public BotImportSpecification addTestBotAliasTagsEntry(String key, String value) {
        if (null == this.testBotAliasTags) {
            this.testBotAliasTags = new java.util.HashMap<String, String>();
        }
        if (this.testBotAliasTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.testBotAliasTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TestBotAliasTags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotImportSpecification clearTestBotAliasTagsEntries() {
        this.testBotAliasTags = null;
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
        if (getBotName() != null)
            sb.append("BotName: ").append(getBotName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getDataPrivacy() != null)
            sb.append("DataPrivacy: ").append(getDataPrivacy()).append(",");
        if (getIdleSessionTTLInSeconds() != null)
            sb.append("IdleSessionTTLInSeconds: ").append(getIdleSessionTTLInSeconds()).append(",");
        if (getBotTags() != null)
            sb.append("BotTags: ").append(getBotTags()).append(",");
        if (getTestBotAliasTags() != null)
            sb.append("TestBotAliasTags: ").append(getTestBotAliasTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BotImportSpecification == false)
            return false;
        BotImportSpecification other = (BotImportSpecification) obj;
        if (other.getBotName() == null ^ this.getBotName() == null)
            return false;
        if (other.getBotName() != null && other.getBotName().equals(this.getBotName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getDataPrivacy() == null ^ this.getDataPrivacy() == null)
            return false;
        if (other.getDataPrivacy() != null && other.getDataPrivacy().equals(this.getDataPrivacy()) == false)
            return false;
        if (other.getIdleSessionTTLInSeconds() == null ^ this.getIdleSessionTTLInSeconds() == null)
            return false;
        if (other.getIdleSessionTTLInSeconds() != null && other.getIdleSessionTTLInSeconds().equals(this.getIdleSessionTTLInSeconds()) == false)
            return false;
        if (other.getBotTags() == null ^ this.getBotTags() == null)
            return false;
        if (other.getBotTags() != null && other.getBotTags().equals(this.getBotTags()) == false)
            return false;
        if (other.getTestBotAliasTags() == null ^ this.getTestBotAliasTags() == null)
            return false;
        if (other.getTestBotAliasTags() != null && other.getTestBotAliasTags().equals(this.getTestBotAliasTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotName() == null) ? 0 : getBotName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDataPrivacy() == null) ? 0 : getDataPrivacy().hashCode());
        hashCode = prime * hashCode + ((getIdleSessionTTLInSeconds() == null) ? 0 : getIdleSessionTTLInSeconds().hashCode());
        hashCode = prime * hashCode + ((getBotTags() == null) ? 0 : getBotTags().hashCode());
        hashCode = prime * hashCode + ((getTestBotAliasTags() == null) ? 0 : getTestBotAliasTags().hashCode());
        return hashCode;
    }

    @Override
    public BotImportSpecification clone() {
        try {
            return (BotImportSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.BotImportSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
