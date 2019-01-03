/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexmodelbuilding.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about a single utterance that was made to your bot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/UtteranceData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UtteranceData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The text that was entered by the user or the text representation of an audio clip.
     * </p>
     */
    private String utteranceString;
    /**
     * <p>
     * The number of times that the utterance was processed.
     * </p>
     */
    private Integer count;
    /**
     * <p>
     * The total number of individuals that used the utterance.
     * </p>
     */
    private Integer distinctUsers;
    /**
     * <p>
     * The date that the utterance was first recorded.
     * </p>
     */
    private java.util.Date firstUtteredDate;
    /**
     * <p>
     * The date that the utterance was last recorded.
     * </p>
     */
    private java.util.Date lastUtteredDate;

    /**
     * <p>
     * The text that was entered by the user or the text representation of an audio clip.
     * </p>
     * 
     * @param utteranceString
     *        The text that was entered by the user or the text representation of an audio clip.
     */

    public void setUtteranceString(String utteranceString) {
        this.utteranceString = utteranceString;
    }

    /**
     * <p>
     * The text that was entered by the user or the text representation of an audio clip.
     * </p>
     * 
     * @return The text that was entered by the user or the text representation of an audio clip.
     */

    public String getUtteranceString() {
        return this.utteranceString;
    }

    /**
     * <p>
     * The text that was entered by the user or the text representation of an audio clip.
     * </p>
     * 
     * @param utteranceString
     *        The text that was entered by the user or the text representation of an audio clip.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceData withUtteranceString(String utteranceString) {
        setUtteranceString(utteranceString);
        return this;
    }

    /**
     * <p>
     * The number of times that the utterance was processed.
     * </p>
     * 
     * @param count
     *        The number of times that the utterance was processed.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of times that the utterance was processed.
     * </p>
     * 
     * @return The number of times that the utterance was processed.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * The number of times that the utterance was processed.
     * </p>
     * 
     * @param count
     *        The number of times that the utterance was processed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceData withCount(Integer count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * The total number of individuals that used the utterance.
     * </p>
     * 
     * @param distinctUsers
     *        The total number of individuals that used the utterance.
     */

    public void setDistinctUsers(Integer distinctUsers) {
        this.distinctUsers = distinctUsers;
    }

    /**
     * <p>
     * The total number of individuals that used the utterance.
     * </p>
     * 
     * @return The total number of individuals that used the utterance.
     */

    public Integer getDistinctUsers() {
        return this.distinctUsers;
    }

    /**
     * <p>
     * The total number of individuals that used the utterance.
     * </p>
     * 
     * @param distinctUsers
     *        The total number of individuals that used the utterance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceData withDistinctUsers(Integer distinctUsers) {
        setDistinctUsers(distinctUsers);
        return this;
    }

    /**
     * <p>
     * The date that the utterance was first recorded.
     * </p>
     * 
     * @param firstUtteredDate
     *        The date that the utterance was first recorded.
     */

    public void setFirstUtteredDate(java.util.Date firstUtteredDate) {
        this.firstUtteredDate = firstUtteredDate;
    }

    /**
     * <p>
     * The date that the utterance was first recorded.
     * </p>
     * 
     * @return The date that the utterance was first recorded.
     */

    public java.util.Date getFirstUtteredDate() {
        return this.firstUtteredDate;
    }

    /**
     * <p>
     * The date that the utterance was first recorded.
     * </p>
     * 
     * @param firstUtteredDate
     *        The date that the utterance was first recorded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceData withFirstUtteredDate(java.util.Date firstUtteredDate) {
        setFirstUtteredDate(firstUtteredDate);
        return this;
    }

    /**
     * <p>
     * The date that the utterance was last recorded.
     * </p>
     * 
     * @param lastUtteredDate
     *        The date that the utterance was last recorded.
     */

    public void setLastUtteredDate(java.util.Date lastUtteredDate) {
        this.lastUtteredDate = lastUtteredDate;
    }

    /**
     * <p>
     * The date that the utterance was last recorded.
     * </p>
     * 
     * @return The date that the utterance was last recorded.
     */

    public java.util.Date getLastUtteredDate() {
        return this.lastUtteredDate;
    }

    /**
     * <p>
     * The date that the utterance was last recorded.
     * </p>
     * 
     * @param lastUtteredDate
     *        The date that the utterance was last recorded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceData withLastUtteredDate(java.util.Date lastUtteredDate) {
        setLastUtteredDate(lastUtteredDate);
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
        if (getUtteranceString() != null)
            sb.append("UtteranceString: ").append(getUtteranceString()).append(",");
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getDistinctUsers() != null)
            sb.append("DistinctUsers: ").append(getDistinctUsers()).append(",");
        if (getFirstUtteredDate() != null)
            sb.append("FirstUtteredDate: ").append(getFirstUtteredDate()).append(",");
        if (getLastUtteredDate() != null)
            sb.append("LastUtteredDate: ").append(getLastUtteredDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UtteranceData == false)
            return false;
        UtteranceData other = (UtteranceData) obj;
        if (other.getUtteranceString() == null ^ this.getUtteranceString() == null)
            return false;
        if (other.getUtteranceString() != null && other.getUtteranceString().equals(this.getUtteranceString()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getDistinctUsers() == null ^ this.getDistinctUsers() == null)
            return false;
        if (other.getDistinctUsers() != null && other.getDistinctUsers().equals(this.getDistinctUsers()) == false)
            return false;
        if (other.getFirstUtteredDate() == null ^ this.getFirstUtteredDate() == null)
            return false;
        if (other.getFirstUtteredDate() != null && other.getFirstUtteredDate().equals(this.getFirstUtteredDate()) == false)
            return false;
        if (other.getLastUtteredDate() == null ^ this.getLastUtteredDate() == null)
            return false;
        if (other.getLastUtteredDate() != null && other.getLastUtteredDate().equals(this.getLastUtteredDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUtteranceString() == null) ? 0 : getUtteranceString().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getDistinctUsers() == null) ? 0 : getDistinctUsers().hashCode());
        hashCode = prime * hashCode + ((getFirstUtteredDate() == null) ? 0 : getFirstUtteredDate().hashCode());
        hashCode = prime * hashCode + ((getLastUtteredDate() == null) ? 0 : getLastUtteredDate().hashCode());
        return hashCode;
    }

    @Override
    public UtteranceData clone() {
        try {
            return (UtteranceData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelbuilding.model.transform.UtteranceDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
