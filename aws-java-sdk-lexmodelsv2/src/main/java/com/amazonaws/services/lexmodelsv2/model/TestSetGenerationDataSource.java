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
 * Contains information about the data source from which the test set is generated.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/TestSetGenerationDataSource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestSetGenerationDataSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains information about the bot from which the conversation logs are sourced.
     * </p>
     */
    private ConversationLogsDataSource conversationLogsDataSource;

    /**
     * <p>
     * Contains information about the bot from which the conversation logs are sourced.
     * </p>
     * 
     * @param conversationLogsDataSource
     *        Contains information about the bot from which the conversation logs are sourced.
     */

    public void setConversationLogsDataSource(ConversationLogsDataSource conversationLogsDataSource) {
        this.conversationLogsDataSource = conversationLogsDataSource;
    }

    /**
     * <p>
     * Contains information about the bot from which the conversation logs are sourced.
     * </p>
     * 
     * @return Contains information about the bot from which the conversation logs are sourced.
     */

    public ConversationLogsDataSource getConversationLogsDataSource() {
        return this.conversationLogsDataSource;
    }

    /**
     * <p>
     * Contains information about the bot from which the conversation logs are sourced.
     * </p>
     * 
     * @param conversationLogsDataSource
     *        Contains information about the bot from which the conversation logs are sourced.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestSetGenerationDataSource withConversationLogsDataSource(ConversationLogsDataSource conversationLogsDataSource) {
        setConversationLogsDataSource(conversationLogsDataSource);
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
        if (getConversationLogsDataSource() != null)
            sb.append("ConversationLogsDataSource: ").append(getConversationLogsDataSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestSetGenerationDataSource == false)
            return false;
        TestSetGenerationDataSource other = (TestSetGenerationDataSource) obj;
        if (other.getConversationLogsDataSource() == null ^ this.getConversationLogsDataSource() == null)
            return false;
        if (other.getConversationLogsDataSource() != null && other.getConversationLogsDataSource().equals(this.getConversationLogsDataSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConversationLogsDataSource() == null) ? 0 : getConversationLogsDataSource().hashCode());
        return hashCode;
    }

    @Override
    public TestSetGenerationDataSource clone() {
        try {
            return (TestSetGenerationDataSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.TestSetGenerationDataSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
