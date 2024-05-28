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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A bot that is a member of a network of bots.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BotMember" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BotMember implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID of a bot that is a member of this network of bots.
     * </p>
     */
    private String botMemberId;
    /**
     * <p>
     * The unique name of a bot that is a member of this network of bots.
     * </p>
     */
    private String botMemberName;
    /**
     * <p>
     * The alias ID of a bot that is a member of this network of bots.
     * </p>
     */
    private String botMemberAliasId;
    /**
     * <p>
     * The alias name of a bot that is a member of this network of bots.
     * </p>
     */
    private String botMemberAliasName;
    /**
     * <p>
     * The version of a bot that is a member of this network of bots.
     * </p>
     */
    private String botMemberVersion;

    /**
     * <p>
     * The unique ID of a bot that is a member of this network of bots.
     * </p>
     * 
     * @param botMemberId
     *        The unique ID of a bot that is a member of this network of bots.
     */

    public void setBotMemberId(String botMemberId) {
        this.botMemberId = botMemberId;
    }

    /**
     * <p>
     * The unique ID of a bot that is a member of this network of bots.
     * </p>
     * 
     * @return The unique ID of a bot that is a member of this network of bots.
     */

    public String getBotMemberId() {
        return this.botMemberId;
    }

    /**
     * <p>
     * The unique ID of a bot that is a member of this network of bots.
     * </p>
     * 
     * @param botMemberId
     *        The unique ID of a bot that is a member of this network of bots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotMember withBotMemberId(String botMemberId) {
        setBotMemberId(botMemberId);
        return this;
    }

    /**
     * <p>
     * The unique name of a bot that is a member of this network of bots.
     * </p>
     * 
     * @param botMemberName
     *        The unique name of a bot that is a member of this network of bots.
     */

    public void setBotMemberName(String botMemberName) {
        this.botMemberName = botMemberName;
    }

    /**
     * <p>
     * The unique name of a bot that is a member of this network of bots.
     * </p>
     * 
     * @return The unique name of a bot that is a member of this network of bots.
     */

    public String getBotMemberName() {
        return this.botMemberName;
    }

    /**
     * <p>
     * The unique name of a bot that is a member of this network of bots.
     * </p>
     * 
     * @param botMemberName
     *        The unique name of a bot that is a member of this network of bots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotMember withBotMemberName(String botMemberName) {
        setBotMemberName(botMemberName);
        return this;
    }

    /**
     * <p>
     * The alias ID of a bot that is a member of this network of bots.
     * </p>
     * 
     * @param botMemberAliasId
     *        The alias ID of a bot that is a member of this network of bots.
     */

    public void setBotMemberAliasId(String botMemberAliasId) {
        this.botMemberAliasId = botMemberAliasId;
    }

    /**
     * <p>
     * The alias ID of a bot that is a member of this network of bots.
     * </p>
     * 
     * @return The alias ID of a bot that is a member of this network of bots.
     */

    public String getBotMemberAliasId() {
        return this.botMemberAliasId;
    }

    /**
     * <p>
     * The alias ID of a bot that is a member of this network of bots.
     * </p>
     * 
     * @param botMemberAliasId
     *        The alias ID of a bot that is a member of this network of bots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotMember withBotMemberAliasId(String botMemberAliasId) {
        setBotMemberAliasId(botMemberAliasId);
        return this;
    }

    /**
     * <p>
     * The alias name of a bot that is a member of this network of bots.
     * </p>
     * 
     * @param botMemberAliasName
     *        The alias name of a bot that is a member of this network of bots.
     */

    public void setBotMemberAliasName(String botMemberAliasName) {
        this.botMemberAliasName = botMemberAliasName;
    }

    /**
     * <p>
     * The alias name of a bot that is a member of this network of bots.
     * </p>
     * 
     * @return The alias name of a bot that is a member of this network of bots.
     */

    public String getBotMemberAliasName() {
        return this.botMemberAliasName;
    }

    /**
     * <p>
     * The alias name of a bot that is a member of this network of bots.
     * </p>
     * 
     * @param botMemberAliasName
     *        The alias name of a bot that is a member of this network of bots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotMember withBotMemberAliasName(String botMemberAliasName) {
        setBotMemberAliasName(botMemberAliasName);
        return this;
    }

    /**
     * <p>
     * The version of a bot that is a member of this network of bots.
     * </p>
     * 
     * @param botMemberVersion
     *        The version of a bot that is a member of this network of bots.
     */

    public void setBotMemberVersion(String botMemberVersion) {
        this.botMemberVersion = botMemberVersion;
    }

    /**
     * <p>
     * The version of a bot that is a member of this network of bots.
     * </p>
     * 
     * @return The version of a bot that is a member of this network of bots.
     */

    public String getBotMemberVersion() {
        return this.botMemberVersion;
    }

    /**
     * <p>
     * The version of a bot that is a member of this network of bots.
     * </p>
     * 
     * @param botMemberVersion
     *        The version of a bot that is a member of this network of bots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotMember withBotMemberVersion(String botMemberVersion) {
        setBotMemberVersion(botMemberVersion);
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
        if (getBotMemberId() != null)
            sb.append("BotMemberId: ").append(getBotMemberId()).append(",");
        if (getBotMemberName() != null)
            sb.append("BotMemberName: ").append(getBotMemberName()).append(",");
        if (getBotMemberAliasId() != null)
            sb.append("BotMemberAliasId: ").append(getBotMemberAliasId()).append(",");
        if (getBotMemberAliasName() != null)
            sb.append("BotMemberAliasName: ").append(getBotMemberAliasName()).append(",");
        if (getBotMemberVersion() != null)
            sb.append("BotMemberVersion: ").append(getBotMemberVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BotMember == false)
            return false;
        BotMember other = (BotMember) obj;
        if (other.getBotMemberId() == null ^ this.getBotMemberId() == null)
            return false;
        if (other.getBotMemberId() != null && other.getBotMemberId().equals(this.getBotMemberId()) == false)
            return false;
        if (other.getBotMemberName() == null ^ this.getBotMemberName() == null)
            return false;
        if (other.getBotMemberName() != null && other.getBotMemberName().equals(this.getBotMemberName()) == false)
            return false;
        if (other.getBotMemberAliasId() == null ^ this.getBotMemberAliasId() == null)
            return false;
        if (other.getBotMemberAliasId() != null && other.getBotMemberAliasId().equals(this.getBotMemberAliasId()) == false)
            return false;
        if (other.getBotMemberAliasName() == null ^ this.getBotMemberAliasName() == null)
            return false;
        if (other.getBotMemberAliasName() != null && other.getBotMemberAliasName().equals(this.getBotMemberAliasName()) == false)
            return false;
        if (other.getBotMemberVersion() == null ^ this.getBotMemberVersion() == null)
            return false;
        if (other.getBotMemberVersion() != null && other.getBotMemberVersion().equals(this.getBotMemberVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotMemberId() == null) ? 0 : getBotMemberId().hashCode());
        hashCode = prime * hashCode + ((getBotMemberName() == null) ? 0 : getBotMemberName().hashCode());
        hashCode = prime * hashCode + ((getBotMemberAliasId() == null) ? 0 : getBotMemberAliasId().hashCode());
        hashCode = prime * hashCode + ((getBotMemberAliasName() == null) ? 0 : getBotMemberAliasName().hashCode());
        hashCode = prime * hashCode + ((getBotMemberVersion() == null) ? 0 : getBotMemberVersion().hashCode());
        return hashCode;
    }

    @Override
    public BotMember clone() {
        try {
            return (BotMember) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.BotMemberMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
