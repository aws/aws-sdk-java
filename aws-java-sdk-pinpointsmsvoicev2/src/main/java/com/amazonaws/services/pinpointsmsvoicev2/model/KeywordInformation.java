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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The information for all keywords in a pool.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/KeywordInformation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KeywordInformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The keyword as a string.
     * </p>
     */
    private String keyword;
    /**
     * <p>
     * A custom message that can be used with the keyword.
     * </p>
     */
    private String keywordMessage;
    /**
     * <p>
     * The action to perform for the keyword.
     * </p>
     */
    private String keywordAction;

    /**
     * <p>
     * The keyword as a string.
     * </p>
     * 
     * @param keyword
     *        The keyword as a string.
     */

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * <p>
     * The keyword as a string.
     * </p>
     * 
     * @return The keyword as a string.
     */

    public String getKeyword() {
        return this.keyword;
    }

    /**
     * <p>
     * The keyword as a string.
     * </p>
     * 
     * @param keyword
     *        The keyword as a string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeywordInformation withKeyword(String keyword) {
        setKeyword(keyword);
        return this;
    }

    /**
     * <p>
     * A custom message that can be used with the keyword.
     * </p>
     * 
     * @param keywordMessage
     *        A custom message that can be used with the keyword.
     */

    public void setKeywordMessage(String keywordMessage) {
        this.keywordMessage = keywordMessage;
    }

    /**
     * <p>
     * A custom message that can be used with the keyword.
     * </p>
     * 
     * @return A custom message that can be used with the keyword.
     */

    public String getKeywordMessage() {
        return this.keywordMessage;
    }

    /**
     * <p>
     * A custom message that can be used with the keyword.
     * </p>
     * 
     * @param keywordMessage
     *        A custom message that can be used with the keyword.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeywordInformation withKeywordMessage(String keywordMessage) {
        setKeywordMessage(keywordMessage);
        return this;
    }

    /**
     * <p>
     * The action to perform for the keyword.
     * </p>
     * 
     * @param keywordAction
     *        The action to perform for the keyword.
     * @see KeywordAction
     */

    public void setKeywordAction(String keywordAction) {
        this.keywordAction = keywordAction;
    }

    /**
     * <p>
     * The action to perform for the keyword.
     * </p>
     * 
     * @return The action to perform for the keyword.
     * @see KeywordAction
     */

    public String getKeywordAction() {
        return this.keywordAction;
    }

    /**
     * <p>
     * The action to perform for the keyword.
     * </p>
     * 
     * @param keywordAction
     *        The action to perform for the keyword.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeywordAction
     */

    public KeywordInformation withKeywordAction(String keywordAction) {
        setKeywordAction(keywordAction);
        return this;
    }

    /**
     * <p>
     * The action to perform for the keyword.
     * </p>
     * 
     * @param keywordAction
     *        The action to perform for the keyword.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeywordAction
     */

    public KeywordInformation withKeywordAction(KeywordAction keywordAction) {
        this.keywordAction = keywordAction.toString();
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
        if (getKeyword() != null)
            sb.append("Keyword: ").append(getKeyword()).append(",");
        if (getKeywordMessage() != null)
            sb.append("KeywordMessage: ").append(getKeywordMessage()).append(",");
        if (getKeywordAction() != null)
            sb.append("KeywordAction: ").append(getKeywordAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KeywordInformation == false)
            return false;
        KeywordInformation other = (KeywordInformation) obj;
        if (other.getKeyword() == null ^ this.getKeyword() == null)
            return false;
        if (other.getKeyword() != null && other.getKeyword().equals(this.getKeyword()) == false)
            return false;
        if (other.getKeywordMessage() == null ^ this.getKeywordMessage() == null)
            return false;
        if (other.getKeywordMessage() != null && other.getKeywordMessage().equals(this.getKeywordMessage()) == false)
            return false;
        if (other.getKeywordAction() == null ^ this.getKeywordAction() == null)
            return false;
        if (other.getKeywordAction() != null && other.getKeywordAction().equals(this.getKeywordAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyword() == null) ? 0 : getKeyword().hashCode());
        hashCode = prime * hashCode + ((getKeywordMessage() == null) ? 0 : getKeywordMessage().hashCode());
        hashCode = prime * hashCode + ((getKeywordAction() == null) ? 0 : getKeywordAction().hashCode());
        return hashCode;
    }

    @Override
    public KeywordInformation clone() {
        try {
            return (KeywordInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointsmsvoicev2.model.transform.KeywordInformationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
