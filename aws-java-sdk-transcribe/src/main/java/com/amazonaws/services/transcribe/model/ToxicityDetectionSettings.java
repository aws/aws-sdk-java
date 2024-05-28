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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains <code>ToxicityCategories</code>, which is a required parameter if you want to enable toxicity detection (
 * <code>ToxicityDetection</code>) in your transcription request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ToxicityDetectionSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ToxicityDetectionSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If you include <code>ToxicityDetection</code> in your transcription request, you must also include
     * <code>ToxicityCategories</code>. The only accepted value for this parameter is <code>ALL</code>.
     * </p>
     */
    private java.util.List<String> toxicityCategories;

    /**
     * <p>
     * If you include <code>ToxicityDetection</code> in your transcription request, you must also include
     * <code>ToxicityCategories</code>. The only accepted value for this parameter is <code>ALL</code>.
     * </p>
     * 
     * @return If you include <code>ToxicityDetection</code> in your transcription request, you must also include
     *         <code>ToxicityCategories</code>. The only accepted value for this parameter is <code>ALL</code>.
     * @see ToxicityCategory
     */

    public java.util.List<String> getToxicityCategories() {
        return toxicityCategories;
    }

    /**
     * <p>
     * If you include <code>ToxicityDetection</code> in your transcription request, you must also include
     * <code>ToxicityCategories</code>. The only accepted value for this parameter is <code>ALL</code>.
     * </p>
     * 
     * @param toxicityCategories
     *        If you include <code>ToxicityDetection</code> in your transcription request, you must also include
     *        <code>ToxicityCategories</code>. The only accepted value for this parameter is <code>ALL</code>.
     * @see ToxicityCategory
     */

    public void setToxicityCategories(java.util.Collection<String> toxicityCategories) {
        if (toxicityCategories == null) {
            this.toxicityCategories = null;
            return;
        }

        this.toxicityCategories = new java.util.ArrayList<String>(toxicityCategories);
    }

    /**
     * <p>
     * If you include <code>ToxicityDetection</code> in your transcription request, you must also include
     * <code>ToxicityCategories</code>. The only accepted value for this parameter is <code>ALL</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setToxicityCategories(java.util.Collection)} or {@link #withToxicityCategories(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param toxicityCategories
     *        If you include <code>ToxicityDetection</code> in your transcription request, you must also include
     *        <code>ToxicityCategories</code>. The only accepted value for this parameter is <code>ALL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ToxicityCategory
     */

    public ToxicityDetectionSettings withToxicityCategories(String... toxicityCategories) {
        if (this.toxicityCategories == null) {
            setToxicityCategories(new java.util.ArrayList<String>(toxicityCategories.length));
        }
        for (String ele : toxicityCategories) {
            this.toxicityCategories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If you include <code>ToxicityDetection</code> in your transcription request, you must also include
     * <code>ToxicityCategories</code>. The only accepted value for this parameter is <code>ALL</code>.
     * </p>
     * 
     * @param toxicityCategories
     *        If you include <code>ToxicityDetection</code> in your transcription request, you must also include
     *        <code>ToxicityCategories</code>. The only accepted value for this parameter is <code>ALL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ToxicityCategory
     */

    public ToxicityDetectionSettings withToxicityCategories(java.util.Collection<String> toxicityCategories) {
        setToxicityCategories(toxicityCategories);
        return this;
    }

    /**
     * <p>
     * If you include <code>ToxicityDetection</code> in your transcription request, you must also include
     * <code>ToxicityCategories</code>. The only accepted value for this parameter is <code>ALL</code>.
     * </p>
     * 
     * @param toxicityCategories
     *        If you include <code>ToxicityDetection</code> in your transcription request, you must also include
     *        <code>ToxicityCategories</code>. The only accepted value for this parameter is <code>ALL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ToxicityCategory
     */

    public ToxicityDetectionSettings withToxicityCategories(ToxicityCategory... toxicityCategories) {
        java.util.ArrayList<String> toxicityCategoriesCopy = new java.util.ArrayList<String>(toxicityCategories.length);
        for (ToxicityCategory value : toxicityCategories) {
            toxicityCategoriesCopy.add(value.toString());
        }
        if (getToxicityCategories() == null) {
            setToxicityCategories(toxicityCategoriesCopy);
        } else {
            getToxicityCategories().addAll(toxicityCategoriesCopy);
        }
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
        if (getToxicityCategories() != null)
            sb.append("ToxicityCategories: ").append(getToxicityCategories());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ToxicityDetectionSettings == false)
            return false;
        ToxicityDetectionSettings other = (ToxicityDetectionSettings) obj;
        if (other.getToxicityCategories() == null ^ this.getToxicityCategories() == null)
            return false;
        if (other.getToxicityCategories() != null && other.getToxicityCategories().equals(this.getToxicityCategories()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getToxicityCategories() == null) ? 0 : getToxicityCategories().hashCode());
        return hashCode;
    }

    @Override
    public ToxicityDetectionSettings clone() {
        try {
            return (ToxicityDetectionSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.ToxicityDetectionSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
