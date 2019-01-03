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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/DeleteUtterances" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteUtterancesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the bot that stored the utterances.
     * </p>
     */
    private String botName;
    /**
     * <p>
     * The unique identifier for the user that made the utterances. This is the user ID that was sent in the <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostContent.html">PostContent</a> or <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostText.html">PostText</a> operation request that
     * contained the utterance.
     * </p>
     */
    private String userId;

    /**
     * <p>
     * The name of the bot that stored the utterances.
     * </p>
     * 
     * @param botName
     *        The name of the bot that stored the utterances.
     */

    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * <p>
     * The name of the bot that stored the utterances.
     * </p>
     * 
     * @return The name of the bot that stored the utterances.
     */

    public String getBotName() {
        return this.botName;
    }

    /**
     * <p>
     * The name of the bot that stored the utterances.
     * </p>
     * 
     * @param botName
     *        The name of the bot that stored the utterances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteUtterancesRequest withBotName(String botName) {
        setBotName(botName);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the user that made the utterances. This is the user ID that was sent in the <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostContent.html">PostContent</a> or <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostText.html">PostText</a> operation request that
     * contained the utterance.
     * </p>
     * 
     * @param userId
     *        The unique identifier for the user that made the utterances. This is the user ID that was sent in the <a
     *        href="http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostContent.html">PostContent</a> or <a
     *        href="http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostText.html">PostText</a> operation request
     *        that contained the utterance.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The unique identifier for the user that made the utterances. This is the user ID that was sent in the <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostContent.html">PostContent</a> or <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostText.html">PostText</a> operation request that
     * contained the utterance.
     * </p>
     * 
     * @return The unique identifier for the user that made the utterances. This is the user ID that was sent in the <a
     *         href="http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostContent.html">PostContent</a> or <a
     *         href="http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostText.html">PostText</a> operation request
     *         that contained the utterance.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The unique identifier for the user that made the utterances. This is the user ID that was sent in the <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostContent.html">PostContent</a> or <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostText.html">PostText</a> operation request that
     * contained the utterance.
     * </p>
     * 
     * @param userId
     *        The unique identifier for the user that made the utterances. This is the user ID that was sent in the <a
     *        href="http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostContent.html">PostContent</a> or <a
     *        href="http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostText.html">PostText</a> operation request
     *        that contained the utterance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteUtterancesRequest withUserId(String userId) {
        setUserId(userId);
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
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteUtterancesRequest == false)
            return false;
        DeleteUtterancesRequest other = (DeleteUtterancesRequest) obj;
        if (other.getBotName() == null ^ this.getBotName() == null)
            return false;
        if (other.getBotName() != null && other.getBotName().equals(this.getBotName()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotName() == null) ? 0 : getBotName().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteUtterancesRequest clone() {
        return (DeleteUtterancesRequest) super.clone();
    }

}
