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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of the bot recommendation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BotRecommendationSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BotRecommendationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of the bot recommendation.
     * </p>
     * <p>
     * If the status is Failed, then the reasons for the failure are listed in the failureReasons field.
     * </p>
     */
    private String botRecommendationStatus;
    /**
     * <p>
     * The unique identifier of the bot recommendation to be updated.
     * </p>
     */
    private String botRecommendationId;
    /**
     * <p>
     * A timestamp of the date and time that the bot recommendation was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * A timestamp of the date and time that the bot recommendation was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    /**
     * <p>
     * The status of the bot recommendation.
     * </p>
     * <p>
     * If the status is Failed, then the reasons for the failure are listed in the failureReasons field.
     * </p>
     * 
     * @param botRecommendationStatus
     *        The status of the bot recommendation.</p>
     *        <p>
     *        If the status is Failed, then the reasons for the failure are listed in the failureReasons field.
     * @see BotRecommendationStatus
     */

    public void setBotRecommendationStatus(String botRecommendationStatus) {
        this.botRecommendationStatus = botRecommendationStatus;
    }

    /**
     * <p>
     * The status of the bot recommendation.
     * </p>
     * <p>
     * If the status is Failed, then the reasons for the failure are listed in the failureReasons field.
     * </p>
     * 
     * @return The status of the bot recommendation.</p>
     *         <p>
     *         If the status is Failed, then the reasons for the failure are listed in the failureReasons field.
     * @see BotRecommendationStatus
     */

    public String getBotRecommendationStatus() {
        return this.botRecommendationStatus;
    }

    /**
     * <p>
     * The status of the bot recommendation.
     * </p>
     * <p>
     * If the status is Failed, then the reasons for the failure are listed in the failureReasons field.
     * </p>
     * 
     * @param botRecommendationStatus
     *        The status of the bot recommendation.</p>
     *        <p>
     *        If the status is Failed, then the reasons for the failure are listed in the failureReasons field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotRecommendationStatus
     */

    public BotRecommendationSummary withBotRecommendationStatus(String botRecommendationStatus) {
        setBotRecommendationStatus(botRecommendationStatus);
        return this;
    }

    /**
     * <p>
     * The status of the bot recommendation.
     * </p>
     * <p>
     * If the status is Failed, then the reasons for the failure are listed in the failureReasons field.
     * </p>
     * 
     * @param botRecommendationStatus
     *        The status of the bot recommendation.</p>
     *        <p>
     *        If the status is Failed, then the reasons for the failure are listed in the failureReasons field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BotRecommendationStatus
     */

    public BotRecommendationSummary withBotRecommendationStatus(BotRecommendationStatus botRecommendationStatus) {
        this.botRecommendationStatus = botRecommendationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The unique identifier of the bot recommendation to be updated.
     * </p>
     * 
     * @param botRecommendationId
     *        The unique identifier of the bot recommendation to be updated.
     */

    public void setBotRecommendationId(String botRecommendationId) {
        this.botRecommendationId = botRecommendationId;
    }

    /**
     * <p>
     * The unique identifier of the bot recommendation to be updated.
     * </p>
     * 
     * @return The unique identifier of the bot recommendation to be updated.
     */

    public String getBotRecommendationId() {
        return this.botRecommendationId;
    }

    /**
     * <p>
     * The unique identifier of the bot recommendation to be updated.
     * </p>
     * 
     * @param botRecommendationId
     *        The unique identifier of the bot recommendation to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotRecommendationSummary withBotRecommendationId(String botRecommendationId) {
        setBotRecommendationId(botRecommendationId);
        return this;
    }

    /**
     * <p>
     * A timestamp of the date and time that the bot recommendation was created.
     * </p>
     * 
     * @param creationDateTime
     *        A timestamp of the date and time that the bot recommendation was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the bot recommendation was created.
     * </p>
     * 
     * @return A timestamp of the date and time that the bot recommendation was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the bot recommendation was created.
     * </p>
     * 
     * @param creationDateTime
     *        A timestamp of the date and time that the bot recommendation was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotRecommendationSummary withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * A timestamp of the date and time that the bot recommendation was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        A timestamp of the date and time that the bot recommendation was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the bot recommendation was last updated.
     * </p>
     * 
     * @return A timestamp of the date and time that the bot recommendation was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * A timestamp of the date and time that the bot recommendation was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        A timestamp of the date and time that the bot recommendation was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotRecommendationSummary withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
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
        if (getBotRecommendationStatus() != null)
            sb.append("BotRecommendationStatus: ").append(getBotRecommendationStatus()).append(",");
        if (getBotRecommendationId() != null)
            sb.append("BotRecommendationId: ").append(getBotRecommendationId()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BotRecommendationSummary == false)
            return false;
        BotRecommendationSummary other = (BotRecommendationSummary) obj;
        if (other.getBotRecommendationStatus() == null ^ this.getBotRecommendationStatus() == null)
            return false;
        if (other.getBotRecommendationStatus() != null && other.getBotRecommendationStatus().equals(this.getBotRecommendationStatus()) == false)
            return false;
        if (other.getBotRecommendationId() == null ^ this.getBotRecommendationId() == null)
            return false;
        if (other.getBotRecommendationId() != null && other.getBotRecommendationId().equals(this.getBotRecommendationId()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotRecommendationStatus() == null) ? 0 : getBotRecommendationStatus().hashCode());
        hashCode = prime * hashCode + ((getBotRecommendationId() == null) ? 0 : getBotRecommendationId().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public BotRecommendationSummary clone() {
        try {
            return (BotRecommendationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.BotRecommendationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
