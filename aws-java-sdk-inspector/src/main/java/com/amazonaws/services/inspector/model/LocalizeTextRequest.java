/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class LocalizeTextRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * A list of textual identifiers.
     * </p>
     */
    private java.util.List<LocalizedText> localizedTexts;
    /**
     * <p>
     * The locale that you want to translate a textual identifier into.
     * </p>
     */
    private String locale;

    /**
     * <p>
     * A list of textual identifiers.
     * </p>
     * 
     * @return A list of textual identifiers.
     */
    public java.util.List<LocalizedText> getLocalizedTexts() {
        return localizedTexts;
    }

    /**
     * <p>
     * A list of textual identifiers.
     * </p>
     * 
     * @param localizedTexts
     *        A list of textual identifiers.
     */
    public void setLocalizedTexts(
            java.util.Collection<LocalizedText> localizedTexts) {
        if (localizedTexts == null) {
            this.localizedTexts = null;
            return;
        }

        this.localizedTexts = new java.util.ArrayList<LocalizedText>(
                localizedTexts);
    }

    /**
     * <p>
     * A list of textual identifiers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setLocalizedTexts(java.util.Collection)} or
     * {@link #withLocalizedTexts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param localizedTexts
     *        A list of textual identifiers.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public LocalizeTextRequest withLocalizedTexts(
            LocalizedText... localizedTexts) {
        if (this.localizedTexts == null) {
            setLocalizedTexts(new java.util.ArrayList<LocalizedText>(
                    localizedTexts.length));
        }
        for (LocalizedText ele : localizedTexts) {
            this.localizedTexts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of textual identifiers.
     * </p>
     * 
     * @param localizedTexts
     *        A list of textual identifiers.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public LocalizeTextRequest withLocalizedTexts(
            java.util.Collection<LocalizedText> localizedTexts) {
        setLocalizedTexts(localizedTexts);
        return this;
    }

    /**
     * <p>
     * The locale that you want to translate a textual identifier into.
     * </p>
     * 
     * @param locale
     *        The locale that you want to translate a textual identifier into.
     */
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * <p>
     * The locale that you want to translate a textual identifier into.
     * </p>
     * 
     * @return The locale that you want to translate a textual identifier into.
     */
    public String getLocale() {
        return this.locale;
    }

    /**
     * <p>
     * The locale that you want to translate a textual identifier into.
     * </p>
     * 
     * @param locale
     *        The locale that you want to translate a textual identifier into.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public LocalizeTextRequest withLocale(String locale) {
        setLocale(locale);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLocalizedTexts() != null)
            sb.append("LocalizedTexts: " + getLocalizedTexts() + ",");
        if (getLocale() != null)
            sb.append("Locale: " + getLocale());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LocalizeTextRequest == false)
            return false;
        LocalizeTextRequest other = (LocalizeTextRequest) obj;
        if (other.getLocalizedTexts() == null
                ^ this.getLocalizedTexts() == null)
            return false;
        if (other.getLocalizedTexts() != null
                && other.getLocalizedTexts().equals(this.getLocalizedTexts()) == false)
            return false;
        if (other.getLocale() == null ^ this.getLocale() == null)
            return false;
        if (other.getLocale() != null
                && other.getLocale().equals(this.getLocale()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getLocalizedTexts() == null) ? 0 : getLocalizedTexts()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getLocale() == null) ? 0 : getLocale().hashCode());
        return hashCode;
    }

    @Override
    public LocalizeTextRequest clone() {
        return (LocalizeTextRequest) super.clone();
    }
}