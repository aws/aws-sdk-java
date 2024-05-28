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
package com.amazonaws.services.chimesdkmediapipelines.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the words or phrases that trigger an alert.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/RealTimeAlertRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RealTimeAlertRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of alert rule.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Specifies the settings for matching the keywords in a real-time alert rule.
     * </p>
     */
    private KeywordMatchConfiguration keywordMatchConfiguration;
    /**
     * <p>
     * Specifies the settings for predicting sentiment in a real-time alert rule.
     * </p>
     */
    private SentimentConfiguration sentimentConfiguration;
    /**
     * <p>
     * Specifies the issue detection settings for a real-time alert rule.
     * </p>
     */
    private IssueDetectionConfiguration issueDetectionConfiguration;

    /**
     * <p>
     * The type of alert rule.
     * </p>
     * 
     * @param type
     *        The type of alert rule.
     * @see RealTimeAlertRuleType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of alert rule.
     * </p>
     * 
     * @return The type of alert rule.
     * @see RealTimeAlertRuleType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of alert rule.
     * </p>
     * 
     * @param type
     *        The type of alert rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RealTimeAlertRuleType
     */

    public RealTimeAlertRule withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of alert rule.
     * </p>
     * 
     * @param type
     *        The type of alert rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RealTimeAlertRuleType
     */

    public RealTimeAlertRule withType(RealTimeAlertRuleType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the settings for matching the keywords in a real-time alert rule.
     * </p>
     * 
     * @param keywordMatchConfiguration
     *        Specifies the settings for matching the keywords in a real-time alert rule.
     */

    public void setKeywordMatchConfiguration(KeywordMatchConfiguration keywordMatchConfiguration) {
        this.keywordMatchConfiguration = keywordMatchConfiguration;
    }

    /**
     * <p>
     * Specifies the settings for matching the keywords in a real-time alert rule.
     * </p>
     * 
     * @return Specifies the settings for matching the keywords in a real-time alert rule.
     */

    public KeywordMatchConfiguration getKeywordMatchConfiguration() {
        return this.keywordMatchConfiguration;
    }

    /**
     * <p>
     * Specifies the settings for matching the keywords in a real-time alert rule.
     * </p>
     * 
     * @param keywordMatchConfiguration
     *        Specifies the settings for matching the keywords in a real-time alert rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeAlertRule withKeywordMatchConfiguration(KeywordMatchConfiguration keywordMatchConfiguration) {
        setKeywordMatchConfiguration(keywordMatchConfiguration);
        return this;
    }

    /**
     * <p>
     * Specifies the settings for predicting sentiment in a real-time alert rule.
     * </p>
     * 
     * @param sentimentConfiguration
     *        Specifies the settings for predicting sentiment in a real-time alert rule.
     */

    public void setSentimentConfiguration(SentimentConfiguration sentimentConfiguration) {
        this.sentimentConfiguration = sentimentConfiguration;
    }

    /**
     * <p>
     * Specifies the settings for predicting sentiment in a real-time alert rule.
     * </p>
     * 
     * @return Specifies the settings for predicting sentiment in a real-time alert rule.
     */

    public SentimentConfiguration getSentimentConfiguration() {
        return this.sentimentConfiguration;
    }

    /**
     * <p>
     * Specifies the settings for predicting sentiment in a real-time alert rule.
     * </p>
     * 
     * @param sentimentConfiguration
     *        Specifies the settings for predicting sentiment in a real-time alert rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeAlertRule withSentimentConfiguration(SentimentConfiguration sentimentConfiguration) {
        setSentimentConfiguration(sentimentConfiguration);
        return this;
    }

    /**
     * <p>
     * Specifies the issue detection settings for a real-time alert rule.
     * </p>
     * 
     * @param issueDetectionConfiguration
     *        Specifies the issue detection settings for a real-time alert rule.
     */

    public void setIssueDetectionConfiguration(IssueDetectionConfiguration issueDetectionConfiguration) {
        this.issueDetectionConfiguration = issueDetectionConfiguration;
    }

    /**
     * <p>
     * Specifies the issue detection settings for a real-time alert rule.
     * </p>
     * 
     * @return Specifies the issue detection settings for a real-time alert rule.
     */

    public IssueDetectionConfiguration getIssueDetectionConfiguration() {
        return this.issueDetectionConfiguration;
    }

    /**
     * <p>
     * Specifies the issue detection settings for a real-time alert rule.
     * </p>
     * 
     * @param issueDetectionConfiguration
     *        Specifies the issue detection settings for a real-time alert rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeAlertRule withIssueDetectionConfiguration(IssueDetectionConfiguration issueDetectionConfiguration) {
        setIssueDetectionConfiguration(issueDetectionConfiguration);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getKeywordMatchConfiguration() != null)
            sb.append("KeywordMatchConfiguration: ").append(getKeywordMatchConfiguration()).append(",");
        if (getSentimentConfiguration() != null)
            sb.append("SentimentConfiguration: ").append(getSentimentConfiguration()).append(",");
        if (getIssueDetectionConfiguration() != null)
            sb.append("IssueDetectionConfiguration: ").append(getIssueDetectionConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RealTimeAlertRule == false)
            return false;
        RealTimeAlertRule other = (RealTimeAlertRule) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getKeywordMatchConfiguration() == null ^ this.getKeywordMatchConfiguration() == null)
            return false;
        if (other.getKeywordMatchConfiguration() != null && other.getKeywordMatchConfiguration().equals(this.getKeywordMatchConfiguration()) == false)
            return false;
        if (other.getSentimentConfiguration() == null ^ this.getSentimentConfiguration() == null)
            return false;
        if (other.getSentimentConfiguration() != null && other.getSentimentConfiguration().equals(this.getSentimentConfiguration()) == false)
            return false;
        if (other.getIssueDetectionConfiguration() == null ^ this.getIssueDetectionConfiguration() == null)
            return false;
        if (other.getIssueDetectionConfiguration() != null && other.getIssueDetectionConfiguration().equals(this.getIssueDetectionConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getKeywordMatchConfiguration() == null) ? 0 : getKeywordMatchConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSentimentConfiguration() == null) ? 0 : getSentimentConfiguration().hashCode());
        hashCode = prime * hashCode + ((getIssueDetectionConfiguration() == null) ? 0 : getIssueDetectionConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public RealTimeAlertRule clone() {
        try {
            return (RealTimeAlertRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.RealTimeAlertRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
