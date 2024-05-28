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
package com.amazonaws.services.qconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the source content data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/SourceContentDataDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceContentDataDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the source content.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Details about the source content ranking data.
     * </p>
     */
    private RankingData rankingData;
    /**
     * <p>
     * Details about the source content text data.
     * </p>
     */
    private TextData textData;
    /**
     * <p>
     * The type of the source content.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The identifier of the source content.
     * </p>
     * 
     * @param id
     *        The identifier of the source content.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the source content.
     * </p>
     * 
     * @return The identifier of the source content.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the source content.
     * </p>
     * 
     * @param id
     *        The identifier of the source content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceContentDataDetails withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Details about the source content ranking data.
     * </p>
     * 
     * @param rankingData
     *        Details about the source content ranking data.
     */

    public void setRankingData(RankingData rankingData) {
        this.rankingData = rankingData;
    }

    /**
     * <p>
     * Details about the source content ranking data.
     * </p>
     * 
     * @return Details about the source content ranking data.
     */

    public RankingData getRankingData() {
        return this.rankingData;
    }

    /**
     * <p>
     * Details about the source content ranking data.
     * </p>
     * 
     * @param rankingData
     *        Details about the source content ranking data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceContentDataDetails withRankingData(RankingData rankingData) {
        setRankingData(rankingData);
        return this;
    }

    /**
     * <p>
     * Details about the source content text data.
     * </p>
     * 
     * @param textData
     *        Details about the source content text data.
     */

    public void setTextData(TextData textData) {
        this.textData = textData;
    }

    /**
     * <p>
     * Details about the source content text data.
     * </p>
     * 
     * @return Details about the source content text data.
     */

    public TextData getTextData() {
        return this.textData;
    }

    /**
     * <p>
     * Details about the source content text data.
     * </p>
     * 
     * @param textData
     *        Details about the source content text data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceContentDataDetails withTextData(TextData textData) {
        setTextData(textData);
        return this;
    }

    /**
     * <p>
     * The type of the source content.
     * </p>
     * 
     * @param type
     *        The type of the source content.
     * @see SourceContentType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the source content.
     * </p>
     * 
     * @return The type of the source content.
     * @see SourceContentType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the source content.
     * </p>
     * 
     * @param type
     *        The type of the source content.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceContentType
     */

    public SourceContentDataDetails withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the source content.
     * </p>
     * 
     * @param type
     *        The type of the source content.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceContentType
     */

    public SourceContentDataDetails withType(SourceContentType type) {
        this.type = type.toString();
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getRankingData() != null)
            sb.append("RankingData: ").append(getRankingData()).append(",");
        if (getTextData() != null)
            sb.append("TextData: ").append(getTextData()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceContentDataDetails == false)
            return false;
        SourceContentDataDetails other = (SourceContentDataDetails) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getRankingData() == null ^ this.getRankingData() == null)
            return false;
        if (other.getRankingData() != null && other.getRankingData().equals(this.getRankingData()) == false)
            return false;
        if (other.getTextData() == null ^ this.getTextData() == null)
            return false;
        if (other.getTextData() != null && other.getTextData().equals(this.getTextData()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getRankingData() == null) ? 0 : getRankingData().hashCode());
        hashCode = prime * hashCode + ((getTextData() == null) ? 0 : getTextData().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public SourceContentDataDetails clone() {
        try {
            return (SourceContentDataDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qconnect.model.transform.SourceContentDataDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
