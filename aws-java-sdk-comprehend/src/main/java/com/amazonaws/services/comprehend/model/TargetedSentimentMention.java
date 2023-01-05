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
 * Information about one mention of an entity. The mention information includes the location of the mention in the text
 * and the sentiment of the mention.
 * </p>
 * <p>
 * For more information about targeted sentiment, see <a
 * href="https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html">Targeted sentiment</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/TargetedSentimentMention"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetedSentimentMention implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Model confidence that the entity is relevant. Value range is zero to one, where one is highest confidence.
     * </p>
     */
    private Float score;
    /**
     * <p>
     * The confidence that all the entities mentioned in the group relate to the same entity.
     * </p>
     */
    private Float groupScore;
    /**
     * <p>
     * The text in the document that identifies the entity.
     * </p>
     */
    private String text;
    /**
     * <p>
     * The type of the entity. Amazon Comprehend supports a variety of <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-entities"
     * >entity types</a>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Contains the sentiment and sentiment score for the mention.
     * </p>
     */
    private MentionSentiment mentionSentiment;
    /**
     * <p>
     * The offset into the document text where the mention begins.
     * </p>
     */
    private Integer beginOffset;
    /**
     * <p>
     * The offset into the document text where the mention ends.
     * </p>
     */
    private Integer endOffset;

    /**
     * <p>
     * Model confidence that the entity is relevant. Value range is zero to one, where one is highest confidence.
     * </p>
     * 
     * @param score
     *        Model confidence that the entity is relevant. Value range is zero to one, where one is highest confidence.
     */

    public void setScore(Float score) {
        this.score = score;
    }

    /**
     * <p>
     * Model confidence that the entity is relevant. Value range is zero to one, where one is highest confidence.
     * </p>
     * 
     * @return Model confidence that the entity is relevant. Value range is zero to one, where one is highest
     *         confidence.
     */

    public Float getScore() {
        return this.score;
    }

    /**
     * <p>
     * Model confidence that the entity is relevant. Value range is zero to one, where one is highest confidence.
     * </p>
     * 
     * @param score
     *        Model confidence that the entity is relevant. Value range is zero to one, where one is highest confidence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetedSentimentMention withScore(Float score) {
        setScore(score);
        return this;
    }

    /**
     * <p>
     * The confidence that all the entities mentioned in the group relate to the same entity.
     * </p>
     * 
     * @param groupScore
     *        The confidence that all the entities mentioned in the group relate to the same entity.
     */

    public void setGroupScore(Float groupScore) {
        this.groupScore = groupScore;
    }

    /**
     * <p>
     * The confidence that all the entities mentioned in the group relate to the same entity.
     * </p>
     * 
     * @return The confidence that all the entities mentioned in the group relate to the same entity.
     */

    public Float getGroupScore() {
        return this.groupScore;
    }

    /**
     * <p>
     * The confidence that all the entities mentioned in the group relate to the same entity.
     * </p>
     * 
     * @param groupScore
     *        The confidence that all the entities mentioned in the group relate to the same entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetedSentimentMention withGroupScore(Float groupScore) {
        setGroupScore(groupScore);
        return this;
    }

    /**
     * <p>
     * The text in the document that identifies the entity.
     * </p>
     * 
     * @param text
     *        The text in the document that identifies the entity.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The text in the document that identifies the entity.
     * </p>
     * 
     * @return The text in the document that identifies the entity.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * The text in the document that identifies the entity.
     * </p>
     * 
     * @param text
     *        The text in the document that identifies the entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetedSentimentMention withText(String text) {
        setText(text);
        return this;
    }

    /**
     * <p>
     * The type of the entity. Amazon Comprehend supports a variety of <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-entities"
     * >entity types</a>.
     * </p>
     * 
     * @param type
     *        The type of the entity. Amazon Comprehend supports a variety of <a href=
     *        "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-entities"
     *        >entity types</a>.
     * @see TargetedSentimentEntityType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the entity. Amazon Comprehend supports a variety of <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-entities"
     * >entity types</a>.
     * </p>
     * 
     * @return The type of the entity. Amazon Comprehend supports a variety of <a href=
     *         "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-entities"
     *         >entity types</a>.
     * @see TargetedSentimentEntityType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the entity. Amazon Comprehend supports a variety of <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-entities"
     * >entity types</a>.
     * </p>
     * 
     * @param type
     *        The type of the entity. Amazon Comprehend supports a variety of <a href=
     *        "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-entities"
     *        >entity types</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetedSentimentEntityType
     */

    public TargetedSentimentMention withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the entity. Amazon Comprehend supports a variety of <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-entities"
     * >entity types</a>.
     * </p>
     * 
     * @param type
     *        The type of the entity. Amazon Comprehend supports a variety of <a href=
     *        "https://docs.aws.amazon.com/comprehend/latest/dg/how-targeted-sentiment.html#how-targeted-sentiment-entities"
     *        >entity types</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetedSentimentEntityType
     */

    public TargetedSentimentMention withType(TargetedSentimentEntityType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Contains the sentiment and sentiment score for the mention.
     * </p>
     * 
     * @param mentionSentiment
     *        Contains the sentiment and sentiment score for the mention.
     */

    public void setMentionSentiment(MentionSentiment mentionSentiment) {
        this.mentionSentiment = mentionSentiment;
    }

    /**
     * <p>
     * Contains the sentiment and sentiment score for the mention.
     * </p>
     * 
     * @return Contains the sentiment and sentiment score for the mention.
     */

    public MentionSentiment getMentionSentiment() {
        return this.mentionSentiment;
    }

    /**
     * <p>
     * Contains the sentiment and sentiment score for the mention.
     * </p>
     * 
     * @param mentionSentiment
     *        Contains the sentiment and sentiment score for the mention.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetedSentimentMention withMentionSentiment(MentionSentiment mentionSentiment) {
        setMentionSentiment(mentionSentiment);
        return this;
    }

    /**
     * <p>
     * The offset into the document text where the mention begins.
     * </p>
     * 
     * @param beginOffset
     *        The offset into the document text where the mention begins.
     */

    public void setBeginOffset(Integer beginOffset) {
        this.beginOffset = beginOffset;
    }

    /**
     * <p>
     * The offset into the document text where the mention begins.
     * </p>
     * 
     * @return The offset into the document text where the mention begins.
     */

    public Integer getBeginOffset() {
        return this.beginOffset;
    }

    /**
     * <p>
     * The offset into the document text where the mention begins.
     * </p>
     * 
     * @param beginOffset
     *        The offset into the document text where the mention begins.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetedSentimentMention withBeginOffset(Integer beginOffset) {
        setBeginOffset(beginOffset);
        return this;
    }

    /**
     * <p>
     * The offset into the document text where the mention ends.
     * </p>
     * 
     * @param endOffset
     *        The offset into the document text where the mention ends.
     */

    public void setEndOffset(Integer endOffset) {
        this.endOffset = endOffset;
    }

    /**
     * <p>
     * The offset into the document text where the mention ends.
     * </p>
     * 
     * @return The offset into the document text where the mention ends.
     */

    public Integer getEndOffset() {
        return this.endOffset;
    }

    /**
     * <p>
     * The offset into the document text where the mention ends.
     * </p>
     * 
     * @param endOffset
     *        The offset into the document text where the mention ends.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetedSentimentMention withEndOffset(Integer endOffset) {
        setEndOffset(endOffset);
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
        if (getScore() != null)
            sb.append("Score: ").append(getScore()).append(",");
        if (getGroupScore() != null)
            sb.append("GroupScore: ").append(getGroupScore()).append(",");
        if (getText() != null)
            sb.append("Text: ").append(getText()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getMentionSentiment() != null)
            sb.append("MentionSentiment: ").append(getMentionSentiment()).append(",");
        if (getBeginOffset() != null)
            sb.append("BeginOffset: ").append(getBeginOffset()).append(",");
        if (getEndOffset() != null)
            sb.append("EndOffset: ").append(getEndOffset());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetedSentimentMention == false)
            return false;
        TargetedSentimentMention other = (TargetedSentimentMention) obj;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        if (other.getGroupScore() == null ^ this.getGroupScore() == null)
            return false;
        if (other.getGroupScore() != null && other.getGroupScore().equals(this.getGroupScore()) == false)
            return false;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getMentionSentiment() == null ^ this.getMentionSentiment() == null)
            return false;
        if (other.getMentionSentiment() != null && other.getMentionSentiment().equals(this.getMentionSentiment()) == false)
            return false;
        if (other.getBeginOffset() == null ^ this.getBeginOffset() == null)
            return false;
        if (other.getBeginOffset() != null && other.getBeginOffset().equals(this.getBeginOffset()) == false)
            return false;
        if (other.getEndOffset() == null ^ this.getEndOffset() == null)
            return false;
        if (other.getEndOffset() != null && other.getEndOffset().equals(this.getEndOffset()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        hashCode = prime * hashCode + ((getGroupScore() == null) ? 0 : getGroupScore().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getMentionSentiment() == null) ? 0 : getMentionSentiment().hashCode());
        hashCode = prime * hashCode + ((getBeginOffset() == null) ? 0 : getBeginOffset().hashCode());
        hashCode = prime * hashCode + ((getEndOffset() == null) ? 0 : getEndOffset().hashCode());
        return hashCode;
    }

    @Override
    public TargetedSentimentMention clone() {
        try {
            return (TargetedSentimentMention) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.TargetedSentimentMentionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
