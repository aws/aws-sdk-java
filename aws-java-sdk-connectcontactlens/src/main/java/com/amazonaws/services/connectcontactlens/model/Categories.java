/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectcontactlens.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the category rules that are used to automatically categorize contacts based on uttered keywords and phrases.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-contact-lens-2020-08-21/Categories" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Categories implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The category rules that have been matched in the analyzed segment.
     * </p>
     */
    private java.util.List<String> matchedCategories;
    /**
     * <p>
     * The category rule that was matched and when it occurred in the transcript.
     * </p>
     */
    private java.util.Map<String, CategoryDetails> matchedDetails;

    /**
     * <p>
     * The category rules that have been matched in the analyzed segment.
     * </p>
     * 
     * @return The category rules that have been matched in the analyzed segment.
     */

    public java.util.List<String> getMatchedCategories() {
        return matchedCategories;
    }

    /**
     * <p>
     * The category rules that have been matched in the analyzed segment.
     * </p>
     * 
     * @param matchedCategories
     *        The category rules that have been matched in the analyzed segment.
     */

    public void setMatchedCategories(java.util.Collection<String> matchedCategories) {
        if (matchedCategories == null) {
            this.matchedCategories = null;
            return;
        }

        this.matchedCategories = new java.util.ArrayList<String>(matchedCategories);
    }

    /**
     * <p>
     * The category rules that have been matched in the analyzed segment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMatchedCategories(java.util.Collection)} or {@link #withMatchedCategories(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param matchedCategories
     *        The category rules that have been matched in the analyzed segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Categories withMatchedCategories(String... matchedCategories) {
        if (this.matchedCategories == null) {
            setMatchedCategories(new java.util.ArrayList<String>(matchedCategories.length));
        }
        for (String ele : matchedCategories) {
            this.matchedCategories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The category rules that have been matched in the analyzed segment.
     * </p>
     * 
     * @param matchedCategories
     *        The category rules that have been matched in the analyzed segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Categories withMatchedCategories(java.util.Collection<String> matchedCategories) {
        setMatchedCategories(matchedCategories);
        return this;
    }

    /**
     * <p>
     * The category rule that was matched and when it occurred in the transcript.
     * </p>
     * 
     * @return The category rule that was matched and when it occurred in the transcript.
     */

    public java.util.Map<String, CategoryDetails> getMatchedDetails() {
        return matchedDetails;
    }

    /**
     * <p>
     * The category rule that was matched and when it occurred in the transcript.
     * </p>
     * 
     * @param matchedDetails
     *        The category rule that was matched and when it occurred in the transcript.
     */

    public void setMatchedDetails(java.util.Map<String, CategoryDetails> matchedDetails) {
        this.matchedDetails = matchedDetails;
    }

    /**
     * <p>
     * The category rule that was matched and when it occurred in the transcript.
     * </p>
     * 
     * @param matchedDetails
     *        The category rule that was matched and when it occurred in the transcript.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Categories withMatchedDetails(java.util.Map<String, CategoryDetails> matchedDetails) {
        setMatchedDetails(matchedDetails);
        return this;
    }

    /**
     * Add a single MatchedDetails entry
     *
     * @see Categories#withMatchedDetails
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Categories addMatchedDetailsEntry(String key, CategoryDetails value) {
        if (null == this.matchedDetails) {
            this.matchedDetails = new java.util.HashMap<String, CategoryDetails>();
        }
        if (this.matchedDetails.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.matchedDetails.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into MatchedDetails.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Categories clearMatchedDetailsEntries() {
        this.matchedDetails = null;
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
        if (getMatchedCategories() != null)
            sb.append("MatchedCategories: ").append(getMatchedCategories()).append(",");
        if (getMatchedDetails() != null)
            sb.append("MatchedDetails: ").append(getMatchedDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Categories == false)
            return false;
        Categories other = (Categories) obj;
        if (other.getMatchedCategories() == null ^ this.getMatchedCategories() == null)
            return false;
        if (other.getMatchedCategories() != null && other.getMatchedCategories().equals(this.getMatchedCategories()) == false)
            return false;
        if (other.getMatchedDetails() == null ^ this.getMatchedDetails() == null)
            return false;
        if (other.getMatchedDetails() != null && other.getMatchedDetails().equals(this.getMatchedDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMatchedCategories() == null) ? 0 : getMatchedCategories().hashCode());
        hashCode = prime * hashCode + ((getMatchedDetails() == null) ? 0 : getMatchedDetails().hashCode());
        return hashCode;
    }

    @Override
    public Categories clone() {
        try {
            return (Categories) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcontactlens.model.transform.CategoriesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
