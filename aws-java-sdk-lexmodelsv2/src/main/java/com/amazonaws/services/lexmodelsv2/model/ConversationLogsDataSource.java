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
 * The data source that uses conversation logs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ConversationLogsDataSource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConversationLogsDataSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The bot Id from the conversation logs.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The bot alias Id from the conversation logs.
     * </p>
     */
    private String botAliasId;
    /**
     * <p>
     * The locale Id of the conversation log.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * The filter for the data source of the conversation log.
     * </p>
     */
    private ConversationLogsDataSourceFilterBy filter;

    /**
     * <p>
     * The bot Id from the conversation logs.
     * </p>
     * 
     * @param botId
     *        The bot Id from the conversation logs.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The bot Id from the conversation logs.
     * </p>
     * 
     * @return The bot Id from the conversation logs.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The bot Id from the conversation logs.
     * </p>
     * 
     * @param botId
     *        The bot Id from the conversation logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConversationLogsDataSource withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The bot alias Id from the conversation logs.
     * </p>
     * 
     * @param botAliasId
     *        The bot alias Id from the conversation logs.
     */

    public void setBotAliasId(String botAliasId) {
        this.botAliasId = botAliasId;
    }

    /**
     * <p>
     * The bot alias Id from the conversation logs.
     * </p>
     * 
     * @return The bot alias Id from the conversation logs.
     */

    public String getBotAliasId() {
        return this.botAliasId;
    }

    /**
     * <p>
     * The bot alias Id from the conversation logs.
     * </p>
     * 
     * @param botAliasId
     *        The bot alias Id from the conversation logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConversationLogsDataSource withBotAliasId(String botAliasId) {
        setBotAliasId(botAliasId);
        return this;
    }

    /**
     * <p>
     * The locale Id of the conversation log.
     * </p>
     * 
     * @param localeId
     *        The locale Id of the conversation log.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The locale Id of the conversation log.
     * </p>
     * 
     * @return The locale Id of the conversation log.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The locale Id of the conversation log.
     * </p>
     * 
     * @param localeId
     *        The locale Id of the conversation log.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConversationLogsDataSource withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * The filter for the data source of the conversation log.
     * </p>
     * 
     * @param filter
     *        The filter for the data source of the conversation log.
     */

    public void setFilter(ConversationLogsDataSourceFilterBy filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * The filter for the data source of the conversation log.
     * </p>
     * 
     * @return The filter for the data source of the conversation log.
     */

    public ConversationLogsDataSourceFilterBy getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * The filter for the data source of the conversation log.
     * </p>
     * 
     * @param filter
     *        The filter for the data source of the conversation log.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConversationLogsDataSource withFilter(ConversationLogsDataSourceFilterBy filter) {
        setFilter(filter);
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
            sb.append("LocaleId: ").append(getLocaleId()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConversationLogsDataSource == false)
            return false;
        ConversationLogsDataSource other = (ConversationLogsDataSource) obj;
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
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
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
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        return hashCode;
    }

    @Override
    public ConversationLogsDataSource clone() {
        try {
            return (ConversationLogsDataSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.ConversationLogsDataSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
