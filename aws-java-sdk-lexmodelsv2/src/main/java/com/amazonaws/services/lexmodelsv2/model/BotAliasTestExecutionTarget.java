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
 * The target Amazon S3 location for the test set execution using a bot alias.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BotAliasTestExecutionTarget"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BotAliasTestExecutionTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The bot Id of the bot alias used in the test set execution.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The bot alias Id of the bot alias used in the test set execution.
     * </p>
     */
    private String botAliasId;
    /**
     * <p>
     * The locale Id of the bot alias used in the test set execution.
     * </p>
     */
    private String localeId;

    /**
     * <p>
     * The bot Id of the bot alias used in the test set execution.
     * </p>
     * 
     * @param botId
     *        The bot Id of the bot alias used in the test set execution.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The bot Id of the bot alias used in the test set execution.
     * </p>
     * 
     * @return The bot Id of the bot alias used in the test set execution.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The bot Id of the bot alias used in the test set execution.
     * </p>
     * 
     * @param botId
     *        The bot Id of the bot alias used in the test set execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotAliasTestExecutionTarget withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The bot alias Id of the bot alias used in the test set execution.
     * </p>
     * 
     * @param botAliasId
     *        The bot alias Id of the bot alias used in the test set execution.
     */

    public void setBotAliasId(String botAliasId) {
        this.botAliasId = botAliasId;
    }

    /**
     * <p>
     * The bot alias Id of the bot alias used in the test set execution.
     * </p>
     * 
     * @return The bot alias Id of the bot alias used in the test set execution.
     */

    public String getBotAliasId() {
        return this.botAliasId;
    }

    /**
     * <p>
     * The bot alias Id of the bot alias used in the test set execution.
     * </p>
     * 
     * @param botAliasId
     *        The bot alias Id of the bot alias used in the test set execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotAliasTestExecutionTarget withBotAliasId(String botAliasId) {
        setBotAliasId(botAliasId);
        return this;
    }

    /**
     * <p>
     * The locale Id of the bot alias used in the test set execution.
     * </p>
     * 
     * @param localeId
     *        The locale Id of the bot alias used in the test set execution.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The locale Id of the bot alias used in the test set execution.
     * </p>
     * 
     * @return The locale Id of the bot alias used in the test set execution.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The locale Id of the bot alias used in the test set execution.
     * </p>
     * 
     * @param localeId
     *        The locale Id of the bot alias used in the test set execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotAliasTestExecutionTarget withLocaleId(String localeId) {
        setLocaleId(localeId);
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
        if (getBotId() != null)
            sb.append("BotId: ").append(getBotId()).append(",");
        if (getBotAliasId() != null)
            sb.append("BotAliasId: ").append(getBotAliasId()).append(",");
        if (getLocaleId() != null)
            sb.append("LocaleId: ").append(getLocaleId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BotAliasTestExecutionTarget == false)
            return false;
        BotAliasTestExecutionTarget other = (BotAliasTestExecutionTarget) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getBotAliasId() == null ^ this.getBotAliasId() == null)
            return false;
        if (other.getBotAliasId() != null && other.getBotAliasId().equals(this.getBotAliasId()) == false)
            return false;
        if (other.getLocaleId() == null ^ this.getLocaleId() == null)
            return false;
        if (other.getLocaleId() != null && other.getLocaleId().equals(this.getLocaleId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getBotAliasId() == null) ? 0 : getBotAliasId().hashCode());
        hashCode = prime * hashCode + ((getLocaleId() == null) ? 0 : getLocaleId().hashCode());
        return hashCode;
    }

    @Override
    public BotAliasTestExecutionTarget clone() {
        try {
            return (BotAliasTestExecutionTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.BotAliasTestExecutionTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
