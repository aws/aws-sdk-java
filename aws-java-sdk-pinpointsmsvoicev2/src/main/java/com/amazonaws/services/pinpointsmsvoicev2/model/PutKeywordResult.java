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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/PutKeyword" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutKeywordResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The PhoneNumberArn or PoolArn that the keyword was associated with.
     * </p>
     */
    private String originationIdentityArn;
    /**
     * <p>
     * The PhoneNumberId or PoolId that the keyword was associated with.
     * </p>
     */
    private String originationIdentity;
    /**
     * <p>
     * The keyword that was added.
     * </p>
     */
    private String keyword;
    /**
     * <p>
     * The message associated with the keyword.
     * </p>
     */
    private String keywordMessage;
    /**
     * <p>
     * The action to perform when the keyword is used.
     * </p>
     */
    private String keywordAction;

    /**
     * <p>
     * The PhoneNumberArn or PoolArn that the keyword was associated with.
     * </p>
     * 
     * @param originationIdentityArn
     *        The PhoneNumberArn or PoolArn that the keyword was associated with.
     */

    public void setOriginationIdentityArn(String originationIdentityArn) {
        this.originationIdentityArn = originationIdentityArn;
    }

    /**
     * <p>
     * The PhoneNumberArn or PoolArn that the keyword was associated with.
     * </p>
     * 
     * @return The PhoneNumberArn or PoolArn that the keyword was associated with.
     */

    public String getOriginationIdentityArn() {
        return this.originationIdentityArn;
    }

    /**
     * <p>
     * The PhoneNumberArn or PoolArn that the keyword was associated with.
     * </p>
     * 
     * @param originationIdentityArn
     *        The PhoneNumberArn or PoolArn that the keyword was associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutKeywordResult withOriginationIdentityArn(String originationIdentityArn) {
        setOriginationIdentityArn(originationIdentityArn);
        return this;
    }

    /**
     * <p>
     * The PhoneNumberId or PoolId that the keyword was associated with.
     * </p>
     * 
     * @param originationIdentity
     *        The PhoneNumberId or PoolId that the keyword was associated with.
     */

    public void setOriginationIdentity(String originationIdentity) {
        this.originationIdentity = originationIdentity;
    }

    /**
     * <p>
     * The PhoneNumberId or PoolId that the keyword was associated with.
     * </p>
     * 
     * @return The PhoneNumberId or PoolId that the keyword was associated with.
     */

    public String getOriginationIdentity() {
        return this.originationIdentity;
    }

    /**
     * <p>
     * The PhoneNumberId or PoolId that the keyword was associated with.
     * </p>
     * 
     * @param originationIdentity
     *        The PhoneNumberId or PoolId that the keyword was associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutKeywordResult withOriginationIdentity(String originationIdentity) {
        setOriginationIdentity(originationIdentity);
        return this;
    }

    /**
     * <p>
     * The keyword that was added.
     * </p>
     * 
     * @param keyword
     *        The keyword that was added.
     */

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * <p>
     * The keyword that was added.
     * </p>
     * 
     * @return The keyword that was added.
     */

    public String getKeyword() {
        return this.keyword;
    }

    /**
     * <p>
     * The keyword that was added.
     * </p>
     * 
     * @param keyword
     *        The keyword that was added.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutKeywordResult withKeyword(String keyword) {
        setKeyword(keyword);
        return this;
    }

    /**
     * <p>
     * The message associated with the keyword.
     * </p>
     * 
     * @param keywordMessage
     *        The message associated with the keyword.
     */

    public void setKeywordMessage(String keywordMessage) {
        this.keywordMessage = keywordMessage;
    }

    /**
     * <p>
     * The message associated with the keyword.
     * </p>
     * 
     * @return The message associated with the keyword.
     */

    public String getKeywordMessage() {
        return this.keywordMessage;
    }

    /**
     * <p>
     * The message associated with the keyword.
     * </p>
     * 
     * @param keywordMessage
     *        The message associated with the keyword.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutKeywordResult withKeywordMessage(String keywordMessage) {
        setKeywordMessage(keywordMessage);
        return this;
    }

    /**
     * <p>
     * The action to perform when the keyword is used.
     * </p>
     * 
     * @param keywordAction
     *        The action to perform when the keyword is used.
     * @see KeywordAction
     */

    public void setKeywordAction(String keywordAction) {
        this.keywordAction = keywordAction;
    }

    /**
     * <p>
     * The action to perform when the keyword is used.
     * </p>
     * 
     * @return The action to perform when the keyword is used.
     * @see KeywordAction
     */

    public String getKeywordAction() {
        return this.keywordAction;
    }

    /**
     * <p>
     * The action to perform when the keyword is used.
     * </p>
     * 
     * @param keywordAction
     *        The action to perform when the keyword is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeywordAction
     */

    public PutKeywordResult withKeywordAction(String keywordAction) {
        setKeywordAction(keywordAction);
        return this;
    }

    /**
     * <p>
     * The action to perform when the keyword is used.
     * </p>
     * 
     * @param keywordAction
     *        The action to perform when the keyword is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeywordAction
     */

    public PutKeywordResult withKeywordAction(KeywordAction keywordAction) {
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
        if (getOriginationIdentityArn() != null)
            sb.append("OriginationIdentityArn: ").append(getOriginationIdentityArn()).append(",");
        if (getOriginationIdentity() != null)
            sb.append("OriginationIdentity: ").append(getOriginationIdentity()).append(",");
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

        if (obj instanceof PutKeywordResult == false)
            return false;
        PutKeywordResult other = (PutKeywordResult) obj;
        if (other.getOriginationIdentityArn() == null ^ this.getOriginationIdentityArn() == null)
            return false;
        if (other.getOriginationIdentityArn() != null && other.getOriginationIdentityArn().equals(this.getOriginationIdentityArn()) == false)
            return false;
        if (other.getOriginationIdentity() == null ^ this.getOriginationIdentity() == null)
            return false;
        if (other.getOriginationIdentity() != null && other.getOriginationIdentity().equals(this.getOriginationIdentity()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getOriginationIdentityArn() == null) ? 0 : getOriginationIdentityArn().hashCode());
        hashCode = prime * hashCode + ((getOriginationIdentity() == null) ? 0 : getOriginationIdentity().hashCode());
        hashCode = prime * hashCode + ((getKeyword() == null) ? 0 : getKeyword().hashCode());
        hashCode = prime * hashCode + ((getKeywordMessage() == null) ? 0 : getKeywordMessage().hashCode());
        hashCode = prime * hashCode + ((getKeywordAction() == null) ? 0 : getKeywordAction().hashCode());
        return hashCode;
    }

    @Override
    public PutKeywordResult clone() {
        try {
            return (PutKeywordResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
