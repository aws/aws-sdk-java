/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateLexBot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateLexBotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The name of the Amazon Lex bot. Maximum character limit of 50.
     * </p>
     */
    private String botName;
    /**
     * <p>
     * The Region in which the Amazon Lex bot has been created.
     * </p>
     */
    private String lexRegion;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateLexBotRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Lex bot. Maximum character limit of 50.
     * </p>
     * 
     * @param botName
     *        The name of the Amazon Lex bot. Maximum character limit of 50.
     */

    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * <p>
     * The name of the Amazon Lex bot. Maximum character limit of 50.
     * </p>
     * 
     * @return The name of the Amazon Lex bot. Maximum character limit of 50.
     */

    public String getBotName() {
        return this.botName;
    }

    /**
     * <p>
     * The name of the Amazon Lex bot. Maximum character limit of 50.
     * </p>
     * 
     * @param botName
     *        The name of the Amazon Lex bot. Maximum character limit of 50.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateLexBotRequest withBotName(String botName) {
        setBotName(botName);
        return this;
    }

    /**
     * <p>
     * The Region in which the Amazon Lex bot has been created.
     * </p>
     * 
     * @param lexRegion
     *        The Region in which the Amazon Lex bot has been created.
     */

    public void setLexRegion(String lexRegion) {
        this.lexRegion = lexRegion;
    }

    /**
     * <p>
     * The Region in which the Amazon Lex bot has been created.
     * </p>
     * 
     * @return The Region in which the Amazon Lex bot has been created.
     */

    public String getLexRegion() {
        return this.lexRegion;
    }

    /**
     * <p>
     * The Region in which the Amazon Lex bot has been created.
     * </p>
     * 
     * @param lexRegion
     *        The Region in which the Amazon Lex bot has been created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateLexBotRequest withLexRegion(String lexRegion) {
        setLexRegion(lexRegion);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getBotName() != null)
            sb.append("BotName: ").append(getBotName()).append(",");
        if (getLexRegion() != null)
            sb.append("LexRegion: ").append(getLexRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateLexBotRequest == false)
            return false;
        DisassociateLexBotRequest other = (DisassociateLexBotRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getBotName() == null ^ this.getBotName() == null)
            return false;
        if (other.getBotName() != null && other.getBotName().equals(this.getBotName()) == false)
            return false;
        if (other.getLexRegion() == null ^ this.getLexRegion() == null)
            return false;
        if (other.getLexRegion() != null && other.getLexRegion().equals(this.getLexRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getBotName() == null) ? 0 : getBotName().hashCode());
        hashCode = prime * hashCode + ((getLexRegion() == null) ? 0 : getLexRegion().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateLexBotRequest clone() {
        return (DisassociateLexBotRequest) super.clone();
    }

}
