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
package com.amazonaws.services.translate.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/ListLanguages" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLanguagesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of supported languages.
     * </p>
     */
    private java.util.List<Language> languages;
    /**
     * <p>
     * The language code passed in with the request.
     * </p>
     */
    private String displayLanguageCode;
    /**
     * <p>
     * If the response does not include all remaining results, use the NextToken in the next request to fetch the next
     * group of supported languages.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of supported languages.
     * </p>
     * 
     * @return The list of supported languages.
     */

    public java.util.List<Language> getLanguages() {
        return languages;
    }

    /**
     * <p>
     * The list of supported languages.
     * </p>
     * 
     * @param languages
     *        The list of supported languages.
     */

    public void setLanguages(java.util.Collection<Language> languages) {
        if (languages == null) {
            this.languages = null;
            return;
        }

        this.languages = new java.util.ArrayList<Language>(languages);
    }

    /**
     * <p>
     * The list of supported languages.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLanguages(java.util.Collection)} or {@link #withLanguages(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param languages
     *        The list of supported languages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLanguagesResult withLanguages(Language... languages) {
        if (this.languages == null) {
            setLanguages(new java.util.ArrayList<Language>(languages.length));
        }
        for (Language ele : languages) {
            this.languages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of supported languages.
     * </p>
     * 
     * @param languages
     *        The list of supported languages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLanguagesResult withLanguages(java.util.Collection<Language> languages) {
        setLanguages(languages);
        return this;
    }

    /**
     * <p>
     * The language code passed in with the request.
     * </p>
     * 
     * @param displayLanguageCode
     *        The language code passed in with the request.
     * @see DisplayLanguageCode
     */

    public void setDisplayLanguageCode(String displayLanguageCode) {
        this.displayLanguageCode = displayLanguageCode;
    }

    /**
     * <p>
     * The language code passed in with the request.
     * </p>
     * 
     * @return The language code passed in with the request.
     * @see DisplayLanguageCode
     */

    public String getDisplayLanguageCode() {
        return this.displayLanguageCode;
    }

    /**
     * <p>
     * The language code passed in with the request.
     * </p>
     * 
     * @param displayLanguageCode
     *        The language code passed in with the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DisplayLanguageCode
     */

    public ListLanguagesResult withDisplayLanguageCode(String displayLanguageCode) {
        setDisplayLanguageCode(displayLanguageCode);
        return this;
    }

    /**
     * <p>
     * The language code passed in with the request.
     * </p>
     * 
     * @param displayLanguageCode
     *        The language code passed in with the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DisplayLanguageCode
     */

    public ListLanguagesResult withDisplayLanguageCode(DisplayLanguageCode displayLanguageCode) {
        this.displayLanguageCode = displayLanguageCode.toString();
        return this;
    }

    /**
     * <p>
     * If the response does not include all remaining results, use the NextToken in the next request to fetch the next
     * group of supported languages.
     * </p>
     * 
     * @param nextToken
     *        If the response does not include all remaining results, use the NextToken in the next request to fetch the
     *        next group of supported languages.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response does not include all remaining results, use the NextToken in the next request to fetch the next
     * group of supported languages.
     * </p>
     * 
     * @return If the response does not include all remaining results, use the NextToken in the next request to fetch
     *         the next group of supported languages.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response does not include all remaining results, use the NextToken in the next request to fetch the next
     * group of supported languages.
     * </p>
     * 
     * @param nextToken
     *        If the response does not include all remaining results, use the NextToken in the next request to fetch the
     *        next group of supported languages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLanguagesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getLanguages() != null)
            sb.append("Languages: ").append(getLanguages()).append(",");
        if (getDisplayLanguageCode() != null)
            sb.append("DisplayLanguageCode: ").append(getDisplayLanguageCode()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLanguagesResult == false)
            return false;
        ListLanguagesResult other = (ListLanguagesResult) obj;
        if (other.getLanguages() == null ^ this.getLanguages() == null)
            return false;
        if (other.getLanguages() != null && other.getLanguages().equals(this.getLanguages()) == false)
            return false;
        if (other.getDisplayLanguageCode() == null ^ this.getDisplayLanguageCode() == null)
            return false;
        if (other.getDisplayLanguageCode() != null && other.getDisplayLanguageCode().equals(this.getDisplayLanguageCode()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLanguages() == null) ? 0 : getLanguages().hashCode());
        hashCode = prime * hashCode + ((getDisplayLanguageCode() == null) ? 0 : getDisplayLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLanguagesResult clone() {
        try {
            return (ListLanguagesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
