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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details for updating the topic replication of a replicator.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/TopicReplicationUpdate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TopicReplicationUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether to periodically configure remote topic ACLs to match their corresponding upstream topics.
     * </p>
     */
    private Boolean copyAccessControlListsForTopics;
    /**
     * <p>
     * Whether to periodically configure remote topics to match their corresponding upstream topics.
     * </p>
     */
    private Boolean copyTopicConfigurations;
    /**
     * <p>
     * Whether to periodically check for new topics and partitions.
     * </p>
     */
    private Boolean detectAndCopyNewTopics;
    /**
     * <p>
     * List of regular expression patterns indicating the topics that should not be replicated.
     * </p>
     */
    private java.util.List<String> topicsToExclude;
    /**
     * <p>
     * List of regular expression patterns indicating the topics to copy.
     * </p>
     */
    private java.util.List<String> topicsToReplicate;

    /**
     * <p>
     * Whether to periodically configure remote topic ACLs to match their corresponding upstream topics.
     * </p>
     * 
     * @param copyAccessControlListsForTopics
     *        Whether to periodically configure remote topic ACLs to match their corresponding upstream topics.
     */

    public void setCopyAccessControlListsForTopics(Boolean copyAccessControlListsForTopics) {
        this.copyAccessControlListsForTopics = copyAccessControlListsForTopics;
    }

    /**
     * <p>
     * Whether to periodically configure remote topic ACLs to match their corresponding upstream topics.
     * </p>
     * 
     * @return Whether to periodically configure remote topic ACLs to match their corresponding upstream topics.
     */

    public Boolean getCopyAccessControlListsForTopics() {
        return this.copyAccessControlListsForTopics;
    }

    /**
     * <p>
     * Whether to periodically configure remote topic ACLs to match their corresponding upstream topics.
     * </p>
     * 
     * @param copyAccessControlListsForTopics
     *        Whether to periodically configure remote topic ACLs to match their corresponding upstream topics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicReplicationUpdate withCopyAccessControlListsForTopics(Boolean copyAccessControlListsForTopics) {
        setCopyAccessControlListsForTopics(copyAccessControlListsForTopics);
        return this;
    }

    /**
     * <p>
     * Whether to periodically configure remote topic ACLs to match their corresponding upstream topics.
     * </p>
     * 
     * @return Whether to periodically configure remote topic ACLs to match their corresponding upstream topics.
     */

    public Boolean isCopyAccessControlListsForTopics() {
        return this.copyAccessControlListsForTopics;
    }

    /**
     * <p>
     * Whether to periodically configure remote topics to match their corresponding upstream topics.
     * </p>
     * 
     * @param copyTopicConfigurations
     *        Whether to periodically configure remote topics to match their corresponding upstream topics.
     */

    public void setCopyTopicConfigurations(Boolean copyTopicConfigurations) {
        this.copyTopicConfigurations = copyTopicConfigurations;
    }

    /**
     * <p>
     * Whether to periodically configure remote topics to match their corresponding upstream topics.
     * </p>
     * 
     * @return Whether to periodically configure remote topics to match their corresponding upstream topics.
     */

    public Boolean getCopyTopicConfigurations() {
        return this.copyTopicConfigurations;
    }

    /**
     * <p>
     * Whether to periodically configure remote topics to match their corresponding upstream topics.
     * </p>
     * 
     * @param copyTopicConfigurations
     *        Whether to periodically configure remote topics to match their corresponding upstream topics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicReplicationUpdate withCopyTopicConfigurations(Boolean copyTopicConfigurations) {
        setCopyTopicConfigurations(copyTopicConfigurations);
        return this;
    }

    /**
     * <p>
     * Whether to periodically configure remote topics to match their corresponding upstream topics.
     * </p>
     * 
     * @return Whether to periodically configure remote topics to match their corresponding upstream topics.
     */

    public Boolean isCopyTopicConfigurations() {
        return this.copyTopicConfigurations;
    }

    /**
     * <p>
     * Whether to periodically check for new topics and partitions.
     * </p>
     * 
     * @param detectAndCopyNewTopics
     *        Whether to periodically check for new topics and partitions.
     */

    public void setDetectAndCopyNewTopics(Boolean detectAndCopyNewTopics) {
        this.detectAndCopyNewTopics = detectAndCopyNewTopics;
    }

    /**
     * <p>
     * Whether to periodically check for new topics and partitions.
     * </p>
     * 
     * @return Whether to periodically check for new topics and partitions.
     */

    public Boolean getDetectAndCopyNewTopics() {
        return this.detectAndCopyNewTopics;
    }

    /**
     * <p>
     * Whether to periodically check for new topics and partitions.
     * </p>
     * 
     * @param detectAndCopyNewTopics
     *        Whether to periodically check for new topics and partitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicReplicationUpdate withDetectAndCopyNewTopics(Boolean detectAndCopyNewTopics) {
        setDetectAndCopyNewTopics(detectAndCopyNewTopics);
        return this;
    }

    /**
     * <p>
     * Whether to periodically check for new topics and partitions.
     * </p>
     * 
     * @return Whether to periodically check for new topics and partitions.
     */

    public Boolean isDetectAndCopyNewTopics() {
        return this.detectAndCopyNewTopics;
    }

    /**
     * <p>
     * List of regular expression patterns indicating the topics that should not be replicated.
     * </p>
     * 
     * @return List of regular expression patterns indicating the topics that should not be replicated.
     */

    public java.util.List<String> getTopicsToExclude() {
        return topicsToExclude;
    }

    /**
     * <p>
     * List of regular expression patterns indicating the topics that should not be replicated.
     * </p>
     * 
     * @param topicsToExclude
     *        List of regular expression patterns indicating the topics that should not be replicated.
     */

    public void setTopicsToExclude(java.util.Collection<String> topicsToExclude) {
        if (topicsToExclude == null) {
            this.topicsToExclude = null;
            return;
        }

        this.topicsToExclude = new java.util.ArrayList<String>(topicsToExclude);
    }

    /**
     * <p>
     * List of regular expression patterns indicating the topics that should not be replicated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTopicsToExclude(java.util.Collection)} or {@link #withTopicsToExclude(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param topicsToExclude
     *        List of regular expression patterns indicating the topics that should not be replicated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicReplicationUpdate withTopicsToExclude(String... topicsToExclude) {
        if (this.topicsToExclude == null) {
            setTopicsToExclude(new java.util.ArrayList<String>(topicsToExclude.length));
        }
        for (String ele : topicsToExclude) {
            this.topicsToExclude.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of regular expression patterns indicating the topics that should not be replicated.
     * </p>
     * 
     * @param topicsToExclude
     *        List of regular expression patterns indicating the topics that should not be replicated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicReplicationUpdate withTopicsToExclude(java.util.Collection<String> topicsToExclude) {
        setTopicsToExclude(topicsToExclude);
        return this;
    }

    /**
     * <p>
     * List of regular expression patterns indicating the topics to copy.
     * </p>
     * 
     * @return List of regular expression patterns indicating the topics to copy.
     */

    public java.util.List<String> getTopicsToReplicate() {
        return topicsToReplicate;
    }

    /**
     * <p>
     * List of regular expression patterns indicating the topics to copy.
     * </p>
     * 
     * @param topicsToReplicate
     *        List of regular expression patterns indicating the topics to copy.
     */

    public void setTopicsToReplicate(java.util.Collection<String> topicsToReplicate) {
        if (topicsToReplicate == null) {
            this.topicsToReplicate = null;
            return;
        }

        this.topicsToReplicate = new java.util.ArrayList<String>(topicsToReplicate);
    }

    /**
     * <p>
     * List of regular expression patterns indicating the topics to copy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTopicsToReplicate(java.util.Collection)} or {@link #withTopicsToReplicate(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param topicsToReplicate
     *        List of regular expression patterns indicating the topics to copy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicReplicationUpdate withTopicsToReplicate(String... topicsToReplicate) {
        if (this.topicsToReplicate == null) {
            setTopicsToReplicate(new java.util.ArrayList<String>(topicsToReplicate.length));
        }
        for (String ele : topicsToReplicate) {
            this.topicsToReplicate.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of regular expression patterns indicating the topics to copy.
     * </p>
     * 
     * @param topicsToReplicate
     *        List of regular expression patterns indicating the topics to copy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicReplicationUpdate withTopicsToReplicate(java.util.Collection<String> topicsToReplicate) {
        setTopicsToReplicate(topicsToReplicate);
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
        if (getCopyAccessControlListsForTopics() != null)
            sb.append("CopyAccessControlListsForTopics: ").append(getCopyAccessControlListsForTopics()).append(",");
        if (getCopyTopicConfigurations() != null)
            sb.append("CopyTopicConfigurations: ").append(getCopyTopicConfigurations()).append(",");
        if (getDetectAndCopyNewTopics() != null)
            sb.append("DetectAndCopyNewTopics: ").append(getDetectAndCopyNewTopics()).append(",");
        if (getTopicsToExclude() != null)
            sb.append("TopicsToExclude: ").append(getTopicsToExclude()).append(",");
        if (getTopicsToReplicate() != null)
            sb.append("TopicsToReplicate: ").append(getTopicsToReplicate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TopicReplicationUpdate == false)
            return false;
        TopicReplicationUpdate other = (TopicReplicationUpdate) obj;
        if (other.getCopyAccessControlListsForTopics() == null ^ this.getCopyAccessControlListsForTopics() == null)
            return false;
        if (other.getCopyAccessControlListsForTopics() != null
                && other.getCopyAccessControlListsForTopics().equals(this.getCopyAccessControlListsForTopics()) == false)
            return false;
        if (other.getCopyTopicConfigurations() == null ^ this.getCopyTopicConfigurations() == null)
            return false;
        if (other.getCopyTopicConfigurations() != null && other.getCopyTopicConfigurations().equals(this.getCopyTopicConfigurations()) == false)
            return false;
        if (other.getDetectAndCopyNewTopics() == null ^ this.getDetectAndCopyNewTopics() == null)
            return false;
        if (other.getDetectAndCopyNewTopics() != null && other.getDetectAndCopyNewTopics().equals(this.getDetectAndCopyNewTopics()) == false)
            return false;
        if (other.getTopicsToExclude() == null ^ this.getTopicsToExclude() == null)
            return false;
        if (other.getTopicsToExclude() != null && other.getTopicsToExclude().equals(this.getTopicsToExclude()) == false)
            return false;
        if (other.getTopicsToReplicate() == null ^ this.getTopicsToReplicate() == null)
            return false;
        if (other.getTopicsToReplicate() != null && other.getTopicsToReplicate().equals(this.getTopicsToReplicate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCopyAccessControlListsForTopics() == null) ? 0 : getCopyAccessControlListsForTopics().hashCode());
        hashCode = prime * hashCode + ((getCopyTopicConfigurations() == null) ? 0 : getCopyTopicConfigurations().hashCode());
        hashCode = prime * hashCode + ((getDetectAndCopyNewTopics() == null) ? 0 : getDetectAndCopyNewTopics().hashCode());
        hashCode = prime * hashCode + ((getTopicsToExclude() == null) ? 0 : getTopicsToExclude().hashCode());
        hashCode = prime * hashCode + ((getTopicsToReplicate() == null) ? 0 : getTopicsToReplicate().hashCode());
        return hashCode;
    }

    @Override
    public TopicReplicationUpdate clone() {
        try {
            return (TopicReplicationUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.TopicReplicationUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
