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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DeleteUtterances" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteUtterancesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the bot that contains the utterances.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The identifier of the language and locale where the utterances were collected. The string must match one of the
     * supported locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * The unique identifier of the session with the user. The ID is returned in the response from the <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/API_runtime_RecognizeText.html">RecognizeText</a> and <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/API_runtime_RecognizeUtterance.html">RecognizeUtterance</a>
     * operations.
     * </p>
     */
    private String sessionId;

    /**
     * <p>
     * The unique identifier of the bot that contains the utterances.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot that contains the utterances.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique identifier of the bot that contains the utterances.
     * </p>
     * 
     * @return The unique identifier of the bot that contains the utterances.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique identifier of the bot that contains the utterances.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot that contains the utterances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteUtterancesRequest withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The identifier of the language and locale where the utterances were collected. The string must match one of the
     * supported locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale where the utterances were collected. The string must match one
     *        of the supported locales. For more information, see <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale where the utterances were collected. The string must match one of the
     * supported locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * </p>
     * 
     * @return The identifier of the language and locale where the utterances were collected. The string must match one
     *         of the supported locales. For more information, see <a
     *         href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale where the utterances were collected. The string must match one of the
     * supported locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale where the utterances were collected. The string must match one
     *        of the supported locales. For more information, see <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteUtterancesRequest withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the session with the user. The ID is returned in the response from the <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/API_runtime_RecognizeText.html">RecognizeText</a> and <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/API_runtime_RecognizeUtterance.html">RecognizeUtterance</a>
     * operations.
     * </p>
     * 
     * @param sessionId
     *        The unique identifier of the session with the user. The ID is returned in the response from the <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/dg/API_runtime_RecognizeText.html">RecognizeText</a> and <a
     *        href
     *        ="https://docs.aws.amazon.com/lexv2/latest/dg/API_runtime_RecognizeUtterance.html">RecognizeUtterance</a>
     *        operations.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The unique identifier of the session with the user. The ID is returned in the response from the <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/API_runtime_RecognizeText.html">RecognizeText</a> and <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/API_runtime_RecognizeUtterance.html">RecognizeUtterance</a>
     * operations.
     * </p>
     * 
     * @return The unique identifier of the session with the user. The ID is returned in the response from the <a
     *         href="https://docs.aws.amazon.com/lexv2/latest/dg/API_runtime_RecognizeText.html">RecognizeText</a> and
     *         <a href="https://docs.aws.amazon.com/lexv2/latest/dg/API_runtime_RecognizeUtterance.html">
     *         RecognizeUtterance</a> operations.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The unique identifier of the session with the user. The ID is returned in the response from the <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/API_runtime_RecognizeText.html">RecognizeText</a> and <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/API_runtime_RecognizeUtterance.html">RecognizeUtterance</a>
     * operations.
     * </p>
     * 
     * @param sessionId
     *        The unique identifier of the session with the user. The ID is returned in the response from the <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/dg/API_runtime_RecognizeText.html">RecognizeText</a> and <a
     *        href
     *        ="https://docs.aws.amazon.com/lexv2/latest/dg/API_runtime_RecognizeUtterance.html">RecognizeUtterance</a>
     *        operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteUtterancesRequest withSessionId(String sessionId) {
        setSessionId(sessionId);
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
        if (getLocaleId() != null)
            sb.append("LocaleId: ").append(getLocaleId()).append(",");
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId());
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
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getLocaleId() == null ^ this.getLocaleId() == null)
            return false;
        if (other.getLocaleId() != null && other.getLocaleId().equals(this.getLocaleId()) == false)
            return false;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getLocaleId() == null) ? 0 : getLocaleId().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteUtterancesRequest clone() {
        return (DeleteUtterancesRequest) super.clone();
    }

}
