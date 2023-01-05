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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/PutKeyword" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutKeywordRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The origination identity to use such as a PhoneNumberId, PhoneNumberArn, SenderId or SenderIdArn. You can use
     * <a>DescribePhoneNumbers</a> get the values for PhoneNumberId and PhoneNumberArn while <a>DescribeSenderIds</a>
     * can be used to get the values for SenderId and SenderIdArn.
     * </p>
     */
    private String originationIdentity;
    /**
     * <p>
     * The new keyword to add.
     * </p>
     */
    private String keyword;
    /**
     * <p>
     * The message associated with the keyword.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AUTOMATIC_RESPONSE: A message is sent to the recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * OPT_OUT: Keeps the recipient from receiving future messages.
     * </p>
     * </li>
     * <li>
     * <p>
     * OPT_IN: The recipient wants to receive future messages.
     * </p>
     * </li>
     * </ul>
     */
    private String keywordMessage;
    /**
     * <p>
     * The action to perform for the new keyword when it is received.
     * </p>
     */
    private String keywordAction;

    /**
     * <p>
     * The origination identity to use such as a PhoneNumberId, PhoneNumberArn, SenderId or SenderIdArn. You can use
     * <a>DescribePhoneNumbers</a> get the values for PhoneNumberId and PhoneNumberArn while <a>DescribeSenderIds</a>
     * can be used to get the values for SenderId and SenderIdArn.
     * </p>
     * 
     * @param originationIdentity
     *        The origination identity to use such as a PhoneNumberId, PhoneNumberArn, SenderId or SenderIdArn. You can
     *        use <a>DescribePhoneNumbers</a> get the values for PhoneNumberId and PhoneNumberArn while
     *        <a>DescribeSenderIds</a> can be used to get the values for SenderId and SenderIdArn.
     */

    public void setOriginationIdentity(String originationIdentity) {
        this.originationIdentity = originationIdentity;
    }

    /**
     * <p>
     * The origination identity to use such as a PhoneNumberId, PhoneNumberArn, SenderId or SenderIdArn. You can use
     * <a>DescribePhoneNumbers</a> get the values for PhoneNumberId and PhoneNumberArn while <a>DescribeSenderIds</a>
     * can be used to get the values for SenderId and SenderIdArn.
     * </p>
     * 
     * @return The origination identity to use such as a PhoneNumberId, PhoneNumberArn, SenderId or SenderIdArn. You can
     *         use <a>DescribePhoneNumbers</a> get the values for PhoneNumberId and PhoneNumberArn while
     *         <a>DescribeSenderIds</a> can be used to get the values for SenderId and SenderIdArn.
     */

    public String getOriginationIdentity() {
        return this.originationIdentity;
    }

    /**
     * <p>
     * The origination identity to use such as a PhoneNumberId, PhoneNumberArn, SenderId or SenderIdArn. You can use
     * <a>DescribePhoneNumbers</a> get the values for PhoneNumberId and PhoneNumberArn while <a>DescribeSenderIds</a>
     * can be used to get the values for SenderId and SenderIdArn.
     * </p>
     * 
     * @param originationIdentity
     *        The origination identity to use such as a PhoneNumberId, PhoneNumberArn, SenderId or SenderIdArn. You can
     *        use <a>DescribePhoneNumbers</a> get the values for PhoneNumberId and PhoneNumberArn while
     *        <a>DescribeSenderIds</a> can be used to get the values for SenderId and SenderIdArn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutKeywordRequest withOriginationIdentity(String originationIdentity) {
        setOriginationIdentity(originationIdentity);
        return this;
    }

    /**
     * <p>
     * The new keyword to add.
     * </p>
     * 
     * @param keyword
     *        The new keyword to add.
     */

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * <p>
     * The new keyword to add.
     * </p>
     * 
     * @return The new keyword to add.
     */

    public String getKeyword() {
        return this.keyword;
    }

    /**
     * <p>
     * The new keyword to add.
     * </p>
     * 
     * @param keyword
     *        The new keyword to add.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutKeywordRequest withKeyword(String keyword) {
        setKeyword(keyword);
        return this;
    }

    /**
     * <p>
     * The message associated with the keyword.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AUTOMATIC_RESPONSE: A message is sent to the recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * OPT_OUT: Keeps the recipient from receiving future messages.
     * </p>
     * </li>
     * <li>
     * <p>
     * OPT_IN: The recipient wants to receive future messages.
     * </p>
     * </li>
     * </ul>
     * 
     * @param keywordMessage
     *        The message associated with the keyword.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        AUTOMATIC_RESPONSE: A message is sent to the recipient.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OPT_OUT: Keeps the recipient from receiving future messages.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OPT_IN: The recipient wants to receive future messages.
     *        </p>
     *        </li>
     */

    public void setKeywordMessage(String keywordMessage) {
        this.keywordMessage = keywordMessage;
    }

    /**
     * <p>
     * The message associated with the keyword.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AUTOMATIC_RESPONSE: A message is sent to the recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * OPT_OUT: Keeps the recipient from receiving future messages.
     * </p>
     * </li>
     * <li>
     * <p>
     * OPT_IN: The recipient wants to receive future messages.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The message associated with the keyword.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         AUTOMATIC_RESPONSE: A message is sent to the recipient.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OPT_OUT: Keeps the recipient from receiving future messages.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OPT_IN: The recipient wants to receive future messages.
     *         </p>
     *         </li>
     */

    public String getKeywordMessage() {
        return this.keywordMessage;
    }

    /**
     * <p>
     * The message associated with the keyword.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AUTOMATIC_RESPONSE: A message is sent to the recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * OPT_OUT: Keeps the recipient from receiving future messages.
     * </p>
     * </li>
     * <li>
     * <p>
     * OPT_IN: The recipient wants to receive future messages.
     * </p>
     * </li>
     * </ul>
     * 
     * @param keywordMessage
     *        The message associated with the keyword.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        AUTOMATIC_RESPONSE: A message is sent to the recipient.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OPT_OUT: Keeps the recipient from receiving future messages.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OPT_IN: The recipient wants to receive future messages.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutKeywordRequest withKeywordMessage(String keywordMessage) {
        setKeywordMessage(keywordMessage);
        return this;
    }

    /**
     * <p>
     * The action to perform for the new keyword when it is received.
     * </p>
     * 
     * @param keywordAction
     *        The action to perform for the new keyword when it is received.
     * @see KeywordAction
     */

    public void setKeywordAction(String keywordAction) {
        this.keywordAction = keywordAction;
    }

    /**
     * <p>
     * The action to perform for the new keyword when it is received.
     * </p>
     * 
     * @return The action to perform for the new keyword when it is received.
     * @see KeywordAction
     */

    public String getKeywordAction() {
        return this.keywordAction;
    }

    /**
     * <p>
     * The action to perform for the new keyword when it is received.
     * </p>
     * 
     * @param keywordAction
     *        The action to perform for the new keyword when it is received.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeywordAction
     */

    public PutKeywordRequest withKeywordAction(String keywordAction) {
        setKeywordAction(keywordAction);
        return this;
    }

    /**
     * <p>
     * The action to perform for the new keyword when it is received.
     * </p>
     * 
     * @param keywordAction
     *        The action to perform for the new keyword when it is received.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeywordAction
     */

    public PutKeywordRequest withKeywordAction(KeywordAction keywordAction) {
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

        if (obj instanceof PutKeywordRequest == false)
            return false;
        PutKeywordRequest other = (PutKeywordRequest) obj;
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

        hashCode = prime * hashCode + ((getOriginationIdentity() == null) ? 0 : getOriginationIdentity().hashCode());
        hashCode = prime * hashCode + ((getKeyword() == null) ? 0 : getKeyword().hashCode());
        hashCode = prime * hashCode + ((getKeywordMessage() == null) ? 0 : getKeywordMessage().hashCode());
        hashCode = prime * hashCode + ((getKeywordAction() == null) ? 0 : getKeywordAction().hashCode());
        return hashCode;
    }

    @Override
    public PutKeywordRequest clone() {
        return (PutKeywordRequest) super.clone();
    }

}
