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
 * Information about the Q search bar embedding experience.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/RegisteredUserQSearchBarEmbeddingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisteredUserQSearchBarEmbeddingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the legacy Q topic that you want to use as the starting topic in the Q search bar. To locate the topic
     * ID of the topic that you want to use, open the <a href="https://quicksight.aws.amazon.com/">Amazon QuickSight
     * console</a>, navigate to the <b>Topics</b> pane, and choose thre topic that you want to use. The
     * <code>TopicID</code> is located in the URL of the topic that opens. When you select an initial topic, you can
     * specify whether or not readers are allowed to select other topics from the list of available topics.
     * </p>
     * <p>
     * If you don't specify an initial topic or if you specify a new reader experience topic, a list of all shared
     * legacy topics is shown in the Q bar.
     * </p>
     */
    private String initialTopicId;

    /**
     * <p>
     * The ID of the legacy Q topic that you want to use as the starting topic in the Q search bar. To locate the topic
     * ID of the topic that you want to use, open the <a href="https://quicksight.aws.amazon.com/">Amazon QuickSight
     * console</a>, navigate to the <b>Topics</b> pane, and choose thre topic that you want to use. The
     * <code>TopicID</code> is located in the URL of the topic that opens. When you select an initial topic, you can
     * specify whether or not readers are allowed to select other topics from the list of available topics.
     * </p>
     * <p>
     * If you don't specify an initial topic or if you specify a new reader experience topic, a list of all shared
     * legacy topics is shown in the Q bar.
     * </p>
     * 
     * @param initialTopicId
     *        The ID of the legacy Q topic that you want to use as the starting topic in the Q search bar. To locate the
     *        topic ID of the topic that you want to use, open the <a href="https://quicksight.aws.amazon.com/">Amazon
     *        QuickSight console</a>, navigate to the <b>Topics</b> pane, and choose thre topic that you want to use.
     *        The <code>TopicID</code> is located in the URL of the topic that opens. When you select an initial topic,
     *        you can specify whether or not readers are allowed to select other topics from the list of available
     *        topics.</p>
     *        <p>
     *        If you don't specify an initial topic or if you specify a new reader experience topic, a list of all
     *        shared legacy topics is shown in the Q bar.
     */

    public void setInitialTopicId(String initialTopicId) {
        this.initialTopicId = initialTopicId;
    }

    /**
     * <p>
     * The ID of the legacy Q topic that you want to use as the starting topic in the Q search bar. To locate the topic
     * ID of the topic that you want to use, open the <a href="https://quicksight.aws.amazon.com/">Amazon QuickSight
     * console</a>, navigate to the <b>Topics</b> pane, and choose thre topic that you want to use. The
     * <code>TopicID</code> is located in the URL of the topic that opens. When you select an initial topic, you can
     * specify whether or not readers are allowed to select other topics from the list of available topics.
     * </p>
     * <p>
     * If you don't specify an initial topic or if you specify a new reader experience topic, a list of all shared
     * legacy topics is shown in the Q bar.
     * </p>
     * 
     * @return The ID of the legacy Q topic that you want to use as the starting topic in the Q search bar. To locate
     *         the topic ID of the topic that you want to use, open the <a
     *         href="https://quicksight.aws.amazon.com/">Amazon QuickSight console</a>, navigate to the <b>Topics</b>
     *         pane, and choose thre topic that you want to use. The <code>TopicID</code> is located in the URL of the
     *         topic that opens. When you select an initial topic, you can specify whether or not readers are allowed to
     *         select other topics from the list of available topics.</p>
     *         <p>
     *         If you don't specify an initial topic or if you specify a new reader experience topic, a list of all
     *         shared legacy topics is shown in the Q bar.
     */

    public String getInitialTopicId() {
        return this.initialTopicId;
    }

    /**
     * <p>
     * The ID of the legacy Q topic that you want to use as the starting topic in the Q search bar. To locate the topic
     * ID of the topic that you want to use, open the <a href="https://quicksight.aws.amazon.com/">Amazon QuickSight
     * console</a>, navigate to the <b>Topics</b> pane, and choose thre topic that you want to use. The
     * <code>TopicID</code> is located in the URL of the topic that opens. When you select an initial topic, you can
     * specify whether or not readers are allowed to select other topics from the list of available topics.
     * </p>
     * <p>
     * If you don't specify an initial topic or if you specify a new reader experience topic, a list of all shared
     * legacy topics is shown in the Q bar.
     * </p>
     * 
     * @param initialTopicId
     *        The ID of the legacy Q topic that you want to use as the starting topic in the Q search bar. To locate the
     *        topic ID of the topic that you want to use, open the <a href="https://quicksight.aws.amazon.com/">Amazon
     *        QuickSight console</a>, navigate to the <b>Topics</b> pane, and choose thre topic that you want to use.
     *        The <code>TopicID</code> is located in the URL of the topic that opens. When you select an initial topic,
     *        you can specify whether or not readers are allowed to select other topics from the list of available
     *        topics.</p>
     *        <p>
     *        If you don't specify an initial topic or if you specify a new reader experience topic, a list of all
     *        shared legacy topics is shown in the Q bar.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisteredUserQSearchBarEmbeddingConfiguration withInitialTopicId(String initialTopicId) {
        setInitialTopicId(initialTopicId);
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
        if (getInitialTopicId() != null)
            sb.append("InitialTopicId: ").append(getInitialTopicId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisteredUserQSearchBarEmbeddingConfiguration == false)
            return false;
        RegisteredUserQSearchBarEmbeddingConfiguration other = (RegisteredUserQSearchBarEmbeddingConfiguration) obj;
        if (other.getInitialTopicId() == null ^ this.getInitialTopicId() == null)
            return false;
        if (other.getInitialTopicId() != null && other.getInitialTopicId().equals(this.getInitialTopicId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInitialTopicId() == null) ? 0 : getInitialTopicId().hashCode());
        return hashCode;
    }

    @Override
    public RegisteredUserQSearchBarEmbeddingConfiguration clone() {
        try {
            return (RegisteredUserQSearchBarEmbeddingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.RegisteredUserQSearchBarEmbeddingConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
