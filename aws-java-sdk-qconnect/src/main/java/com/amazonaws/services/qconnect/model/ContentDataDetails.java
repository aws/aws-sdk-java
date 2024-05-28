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
 * Details about the content data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/ContentDataDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContentDataDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details about the content ranking data.
     * </p>
     */
    private RankingData rankingData;
    /**
     * <p>
     * Details about the content text data.
     * </p>
     */
    private TextData textData;

    /**
     * <p>
     * Details about the content ranking data.
     * </p>
     * 
     * @param rankingData
     *        Details about the content ranking data.
     */

    public void setRankingData(RankingData rankingData) {
        this.rankingData = rankingData;
    }

    /**
     * <p>
     * Details about the content ranking data.
     * </p>
     * 
     * @return Details about the content ranking data.
     */

    public RankingData getRankingData() {
        return this.rankingData;
    }

    /**
     * <p>
     * Details about the content ranking data.
     * </p>
     * 
     * @param rankingData
     *        Details about the content ranking data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContentDataDetails withRankingData(RankingData rankingData) {
        setRankingData(rankingData);
        return this;
    }

    /**
     * <p>
     * Details about the content text data.
     * </p>
     * 
     * @param textData
     *        Details about the content text data.
     */

    public void setTextData(TextData textData) {
        this.textData = textData;
    }

    /**
     * <p>
     * Details about the content text data.
     * </p>
     * 
     * @return Details about the content text data.
     */

    public TextData getTextData() {
        return this.textData;
    }

    /**
     * <p>
     * Details about the content text data.
     * </p>
     * 
     * @param textData
     *        Details about the content text data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContentDataDetails withTextData(TextData textData) {
        setTextData(textData);
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
        if (getRankingData() != null)
            sb.append("RankingData: ").append(getRankingData()).append(",");
        if (getTextData() != null)
            sb.append("TextData: ").append(getTextData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContentDataDetails == false)
            return false;
        ContentDataDetails other = (ContentDataDetails) obj;
        if (other.getRankingData() == null ^ this.getRankingData() == null)
            return false;
        if (other.getRankingData() != null && other.getRankingData().equals(this.getRankingData()) == false)
            return false;
        if (other.getTextData() == null ^ this.getTextData() == null)
            return false;
        if (other.getTextData() != null && other.getTextData().equals(this.getTextData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRankingData() == null) ? 0 : getRankingData().hashCode());
        hashCode = prime * hashCode + ((getTextData() == null) ? 0 : getTextData().hashCode());
        return hashCode;
    }

    @Override
    public ContentDataDetails clone() {
        try {
            return (ContentDataDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qconnect.model.transform.ContentDataDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
