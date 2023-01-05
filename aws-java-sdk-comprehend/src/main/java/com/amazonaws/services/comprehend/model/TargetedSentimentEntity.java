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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about one of the entities found by targeted sentiment analysis.
 * </p>
 * <p>
 * For more information about targeted sentiment, see <a
 * href="https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html">Targeted sentiment</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/TargetedSentimentEntity" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetedSentimentEntity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * One or more index into the Mentions array that provides the best name for the entity group.
     * </p>
     */
    private java.util.List<Integer> descriptiveMentionIndex;
    /**
     * <p>
     * An array of mentions of the entity in the document. The array represents a co-reference group. See <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-values">
     * Co-reference group</a> for an example.
     * </p>
     */
    private java.util.List<TargetedSentimentMention> mentions;

    /**
     * <p>
     * One or more index into the Mentions array that provides the best name for the entity group.
     * </p>
     * 
     * @return One or more index into the Mentions array that provides the best name for the entity group.
     */

    public java.util.List<Integer> getDescriptiveMentionIndex() {
        return descriptiveMentionIndex;
    }

    /**
     * <p>
     * One or more index into the Mentions array that provides the best name for the entity group.
     * </p>
     * 
     * @param descriptiveMentionIndex
     *        One or more index into the Mentions array that provides the best name for the entity group.
     */

    public void setDescriptiveMentionIndex(java.util.Collection<Integer> descriptiveMentionIndex) {
        if (descriptiveMentionIndex == null) {
            this.descriptiveMentionIndex = null;
            return;
        }

        this.descriptiveMentionIndex = new java.util.ArrayList<Integer>(descriptiveMentionIndex);
    }

    /**
     * <p>
     * One or more index into the Mentions array that provides the best name for the entity group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDescriptiveMentionIndex(java.util.Collection)} or
     * {@link #withDescriptiveMentionIndex(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param descriptiveMentionIndex
     *        One or more index into the Mentions array that provides the best name for the entity group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetedSentimentEntity withDescriptiveMentionIndex(Integer... descriptiveMentionIndex) {
        if (this.descriptiveMentionIndex == null) {
            setDescriptiveMentionIndex(new java.util.ArrayList<Integer>(descriptiveMentionIndex.length));
        }
        for (Integer ele : descriptiveMentionIndex) {
            this.descriptiveMentionIndex.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more index into the Mentions array that provides the best name for the entity group.
     * </p>
     * 
     * @param descriptiveMentionIndex
     *        One or more index into the Mentions array that provides the best name for the entity group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetedSentimentEntity withDescriptiveMentionIndex(java.util.Collection<Integer> descriptiveMentionIndex) {
        setDescriptiveMentionIndex(descriptiveMentionIndex);
        return this;
    }

    /**
     * <p>
     * An array of mentions of the entity in the document. The array represents a co-reference group. See <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-values">
     * Co-reference group</a> for an example.
     * </p>
     * 
     * @return An array of mentions of the entity in the document. The array represents a co-reference group. See <a
     *         href=
     *         "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-values"
     *         > Co-reference group</a> for an example.
     */

    public java.util.List<TargetedSentimentMention> getMentions() {
        return mentions;
    }

    /**
     * <p>
     * An array of mentions of the entity in the document. The array represents a co-reference group. See <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-values">
     * Co-reference group</a> for an example.
     * </p>
     * 
     * @param mentions
     *        An array of mentions of the entity in the document. The array represents a co-reference group. See <a
     *        href=
     *        "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-values"
     *        > Co-reference group</a> for an example.
     */

    public void setMentions(java.util.Collection<TargetedSentimentMention> mentions) {
        if (mentions == null) {
            this.mentions = null;
            return;
        }

        this.mentions = new java.util.ArrayList<TargetedSentimentMention>(mentions);
    }

    /**
     * <p>
     * An array of mentions of the entity in the document. The array represents a co-reference group. See <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-values">
     * Co-reference group</a> for an example.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMentions(java.util.Collection)} or {@link #withMentions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param mentions
     *        An array of mentions of the entity in the document. The array represents a co-reference group. See <a
     *        href=
     *        "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-values"
     *        > Co-reference group</a> for an example.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetedSentimentEntity withMentions(TargetedSentimentMention... mentions) {
        if (this.mentions == null) {
            setMentions(new java.util.ArrayList<TargetedSentimentMention>(mentions.length));
        }
        for (TargetedSentimentMention ele : mentions) {
            this.mentions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of mentions of the entity in the document. The array represents a co-reference group. See <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-values">
     * Co-reference group</a> for an example.
     * </p>
     * 
     * @param mentions
     *        An array of mentions of the entity in the document. The array represents a co-reference group. See <a
     *        href=
     *        "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-values"
     *        > Co-reference group</a> for an example.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetedSentimentEntity withMentions(java.util.Collection<TargetedSentimentMention> mentions) {
        setMentions(mentions);
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
        if (getDescriptiveMentionIndex() != null)
            sb.append("DescriptiveMentionIndex: ").append(getDescriptiveMentionIndex()).append(",");
        if (getMentions() != null)
            sb.append("Mentions: ").append(getMentions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetedSentimentEntity == false)
            return false;
        TargetedSentimentEntity other = (TargetedSentimentEntity) obj;
        if (other.getDescriptiveMentionIndex() == null ^ this.getDescriptiveMentionIndex() == null)
            return false;
        if (other.getDescriptiveMentionIndex() != null && other.getDescriptiveMentionIndex().equals(this.getDescriptiveMentionIndex()) == false)
            return false;
        if (other.getMentions() == null ^ this.getMentions() == null)
            return false;
        if (other.getMentions() != null && other.getMentions().equals(this.getMentions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescriptiveMentionIndex() == null) ? 0 : getDescriptiveMentionIndex().hashCode());
        hashCode = prime * hashCode + ((getMentions() == null) ? 0 : getMentions().hashCode());
        return hashCode;
    }

    @Override
    public TargetedSentimentEntity clone() {
        try {
            return (TargetedSentimentEntity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.TargetedSentimentEntityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
