/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PutEventsConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutEventsConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The bot ID.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * HTTPS endpoint that allows the bot to receive outgoing events.
     * </p>
     */
    private String outboundEventsHTTPSEndpoint;
    /**
     * <p>
     * Lambda function ARN that allows the bot to receive outgoing events.
     * </p>
     */
    private String lambdaFunctionArn;

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * 
     * @param accountId
     *        The Amazon Chime account ID.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * 
     * @return The Amazon Chime account ID.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * 
     * @param accountId
     *        The Amazon Chime account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEventsConfigurationRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The bot ID.
     * </p>
     * 
     * @param botId
     *        The bot ID.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The bot ID.
     * </p>
     * 
     * @return The bot ID.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The bot ID.
     * </p>
     * 
     * @param botId
     *        The bot ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEventsConfigurationRequest withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * HTTPS endpoint that allows the bot to receive outgoing events.
     * </p>
     * 
     * @param outboundEventsHTTPSEndpoint
     *        HTTPS endpoint that allows the bot to receive outgoing events.
     */

    public void setOutboundEventsHTTPSEndpoint(String outboundEventsHTTPSEndpoint) {
        this.outboundEventsHTTPSEndpoint = outboundEventsHTTPSEndpoint;
    }

    /**
     * <p>
     * HTTPS endpoint that allows the bot to receive outgoing events.
     * </p>
     * 
     * @return HTTPS endpoint that allows the bot to receive outgoing events.
     */

    public String getOutboundEventsHTTPSEndpoint() {
        return this.outboundEventsHTTPSEndpoint;
    }

    /**
     * <p>
     * HTTPS endpoint that allows the bot to receive outgoing events.
     * </p>
     * 
     * @param outboundEventsHTTPSEndpoint
     *        HTTPS endpoint that allows the bot to receive outgoing events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEventsConfigurationRequest withOutboundEventsHTTPSEndpoint(String outboundEventsHTTPSEndpoint) {
        setOutboundEventsHTTPSEndpoint(outboundEventsHTTPSEndpoint);
        return this;
    }

    /**
     * <p>
     * Lambda function ARN that allows the bot to receive outgoing events.
     * </p>
     * 
     * @param lambdaFunctionArn
     *        Lambda function ARN that allows the bot to receive outgoing events.
     */

    public void setLambdaFunctionArn(String lambdaFunctionArn) {
        this.lambdaFunctionArn = lambdaFunctionArn;
    }

    /**
     * <p>
     * Lambda function ARN that allows the bot to receive outgoing events.
     * </p>
     * 
     * @return Lambda function ARN that allows the bot to receive outgoing events.
     */

    public String getLambdaFunctionArn() {
        return this.lambdaFunctionArn;
    }

    /**
     * <p>
     * Lambda function ARN that allows the bot to receive outgoing events.
     * </p>
     * 
     * @param lambdaFunctionArn
     *        Lambda function ARN that allows the bot to receive outgoing events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEventsConfigurationRequest withLambdaFunctionArn(String lambdaFunctionArn) {
        setLambdaFunctionArn(lambdaFunctionArn);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getBotId() != null)
            sb.append("BotId: ").append(getBotId()).append(",");
        if (getOutboundEventsHTTPSEndpoint() != null)
            sb.append("OutboundEventsHTTPSEndpoint: ").append("***Sensitive Data Redacted***").append(",");
        if (getLambdaFunctionArn() != null)
            sb.append("LambdaFunctionArn: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutEventsConfigurationRequest == false)
            return false;
        PutEventsConfigurationRequest other = (PutEventsConfigurationRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getOutboundEventsHTTPSEndpoint() == null ^ this.getOutboundEventsHTTPSEndpoint() == null)
            return false;
        if (other.getOutboundEventsHTTPSEndpoint() != null && other.getOutboundEventsHTTPSEndpoint().equals(this.getOutboundEventsHTTPSEndpoint()) == false)
            return false;
        if (other.getLambdaFunctionArn() == null ^ this.getLambdaFunctionArn() == null)
            return false;
        if (other.getLambdaFunctionArn() != null && other.getLambdaFunctionArn().equals(this.getLambdaFunctionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getOutboundEventsHTTPSEndpoint() == null) ? 0 : getOutboundEventsHTTPSEndpoint().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionArn() == null) ? 0 : getLambdaFunctionArn().hashCode());
        return hashCode;
    }

    @Override
    public PutEventsConfigurationRequest clone() {
        return (PutEventsConfigurationRequest) super.clone();
    }

}
