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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A topic summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TopicSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TopicSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the topic.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The ID for the topic. This ID is unique per Amazon Web Services Region for each Amazon Web Services account.
     * </p>
     */
    private String topicId;
    /**
     * <p>
     * The name of the topic.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The user experience version of the topic.
     * </p>
     */
    private String userExperienceVersion;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the topic.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the topic.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the topic.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the topic.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the topic.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The ID for the topic. This ID is unique per Amazon Web Services Region for each Amazon Web Services account.
     * </p>
     * 
     * @param topicId
     *        The ID for the topic. This ID is unique per Amazon Web Services Region for each Amazon Web Services
     *        account.
     */

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    /**
     * <p>
     * The ID for the topic. This ID is unique per Amazon Web Services Region for each Amazon Web Services account.
     * </p>
     * 
     * @return The ID for the topic. This ID is unique per Amazon Web Services Region for each Amazon Web Services
     *         account.
     */

    public String getTopicId() {
        return this.topicId;
    }

    /**
     * <p>
     * The ID for the topic. This ID is unique per Amazon Web Services Region for each Amazon Web Services account.
     * </p>
     * 
     * @param topicId
     *        The ID for the topic. This ID is unique per Amazon Web Services Region for each Amazon Web Services
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicSummary withTopicId(String topicId) {
        setTopicId(topicId);
        return this;
    }

    /**
     * <p>
     * The name of the topic.
     * </p>
     * 
     * @param name
     *        The name of the topic.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the topic.
     * </p>
     * 
     * @return The name of the topic.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the topic.
     * </p>
     * 
     * @param name
     *        The name of the topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The user experience version of the topic.
     * </p>
     * 
     * @param userExperienceVersion
     *        The user experience version of the topic.
     * @see TopicUserExperienceVersion
     */

    public void setUserExperienceVersion(String userExperienceVersion) {
        this.userExperienceVersion = userExperienceVersion;
    }

    /**
     * <p>
     * The user experience version of the topic.
     * </p>
     * 
     * @return The user experience version of the topic.
     * @see TopicUserExperienceVersion
     */

    public String getUserExperienceVersion() {
        return this.userExperienceVersion;
    }

    /**
     * <p>
     * The user experience version of the topic.
     * </p>
     * 
     * @param userExperienceVersion
     *        The user experience version of the topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TopicUserExperienceVersion
     */

    public TopicSummary withUserExperienceVersion(String userExperienceVersion) {
        setUserExperienceVersion(userExperienceVersion);
        return this;
    }

    /**
     * <p>
     * The user experience version of the topic.
     * </p>
     * 
     * @param userExperienceVersion
     *        The user experience version of the topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TopicUserExperienceVersion
     */

    public TopicSummary withUserExperienceVersion(TopicUserExperienceVersion userExperienceVersion) {
        this.userExperienceVersion = userExperienceVersion.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getTopicId() != null)
            sb.append("TopicId: ").append(getTopicId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getUserExperienceVersion() != null)
            sb.append("UserExperienceVersion: ").append(getUserExperienceVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TopicSummary == false)
            return false;
        TopicSummary other = (TopicSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getTopicId() == null ^ this.getTopicId() == null)
            return false;
        if (other.getTopicId() != null && other.getTopicId().equals(this.getTopicId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getUserExperienceVersion() == null ^ this.getUserExperienceVersion() == null)
            return false;
        if (other.getUserExperienceVersion() != null && other.getUserExperienceVersion().equals(this.getUserExperienceVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getTopicId() == null) ? 0 : getTopicId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getUserExperienceVersion() == null) ? 0 : getUserExperienceVersion().hashCode());
        return hashCode;
    }

    @Override
    public TopicSummary clone() {
        try {
            return (TopicSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TopicSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
