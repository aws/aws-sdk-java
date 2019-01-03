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
package com.amazonaws.services.polly.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/DescribeVoices" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVoicesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The language identification tag (ISO 639 code for the language name-ISO 3166 country code) for filtering the list
     * of voices returned. If you don't specify this optional parameter, all available voices are returned.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * Boolean value indicating whether to return any bilingual voices that use the specified language as an additional
     * language. For instance, if you request all languages that use US English (es-US), and there is an Italian voice
     * that speaks both Italian (it-IT) and US English, that voice will be included if you specify <code>yes</code> but
     * not if you specify <code>no</code>.
     * </p>
     */
    private Boolean includeAdditionalLanguageCodes;
    /**
     * <p>
     * An opaque pagination token returned from the previous <code>DescribeVoices</code> operation. If present, this
     * indicates where to continue the listing.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The language identification tag (ISO 639 code for the language name-ISO 3166 country code) for filtering the list
     * of voices returned. If you don't specify this optional parameter, all available voices are returned.
     * </p>
     * 
     * @param languageCode
     *        The language identification tag (ISO 639 code for the language name-ISO 3166 country code) for filtering
     *        the list of voices returned. If you don't specify this optional parameter, all available voices are
     *        returned.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language identification tag (ISO 639 code for the language name-ISO 3166 country code) for filtering the list
     * of voices returned. If you don't specify this optional parameter, all available voices are returned.
     * </p>
     * 
     * @return The language identification tag (ISO 639 code for the language name-ISO 3166 country code) for filtering
     *         the list of voices returned. If you don't specify this optional parameter, all available voices are
     *         returned.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language identification tag (ISO 639 code for the language name-ISO 3166 country code) for filtering the list
     * of voices returned. If you don't specify this optional parameter, all available voices are returned.
     * </p>
     * 
     * @param languageCode
     *        The language identification tag (ISO 639 code for the language name-ISO 3166 country code) for filtering
     *        the list of voices returned. If you don't specify this optional parameter, all available voices are
     *        returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public DescribeVoicesRequest withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language identification tag (ISO 639 code for the language name-ISO 3166 country code) for filtering the list
     * of voices returned. If you don't specify this optional parameter, all available voices are returned.
     * </p>
     * 
     * @param languageCode
     *        The language identification tag (ISO 639 code for the language name-ISO 3166 country code) for filtering
     *        the list of voices returned. If you don't specify this optional parameter, all available voices are
     *        returned.
     * @see LanguageCode
     */

    public void setLanguageCode(LanguageCode languageCode) {
        withLanguageCode(languageCode);
    }

    /**
     * <p>
     * The language identification tag (ISO 639 code for the language name-ISO 3166 country code) for filtering the list
     * of voices returned. If you don't specify this optional parameter, all available voices are returned.
     * </p>
     * 
     * @param languageCode
     *        The language identification tag (ISO 639 code for the language name-ISO 3166 country code) for filtering
     *        the list of voices returned. If you don't specify this optional parameter, all available voices are
     *        returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public DescribeVoicesRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * Boolean value indicating whether to return any bilingual voices that use the specified language as an additional
     * language. For instance, if you request all languages that use US English (es-US), and there is an Italian voice
     * that speaks both Italian (it-IT) and US English, that voice will be included if you specify <code>yes</code> but
     * not if you specify <code>no</code>.
     * </p>
     * 
     * @param includeAdditionalLanguageCodes
     *        Boolean value indicating whether to return any bilingual voices that use the specified language as an
     *        additional language. For instance, if you request all languages that use US English (es-US), and there is
     *        an Italian voice that speaks both Italian (it-IT) and US English, that voice will be included if you
     *        specify <code>yes</code> but not if you specify <code>no</code>.
     */

    public void setIncludeAdditionalLanguageCodes(Boolean includeAdditionalLanguageCodes) {
        this.includeAdditionalLanguageCodes = includeAdditionalLanguageCodes;
    }

    /**
     * <p>
     * Boolean value indicating whether to return any bilingual voices that use the specified language as an additional
     * language. For instance, if you request all languages that use US English (es-US), and there is an Italian voice
     * that speaks both Italian (it-IT) and US English, that voice will be included if you specify <code>yes</code> but
     * not if you specify <code>no</code>.
     * </p>
     * 
     * @return Boolean value indicating whether to return any bilingual voices that use the specified language as an
     *         additional language. For instance, if you request all languages that use US English (es-US), and there is
     *         an Italian voice that speaks both Italian (it-IT) and US English, that voice will be included if you
     *         specify <code>yes</code> but not if you specify <code>no</code>.
     */

    public Boolean getIncludeAdditionalLanguageCodes() {
        return this.includeAdditionalLanguageCodes;
    }

    /**
     * <p>
     * Boolean value indicating whether to return any bilingual voices that use the specified language as an additional
     * language. For instance, if you request all languages that use US English (es-US), and there is an Italian voice
     * that speaks both Italian (it-IT) and US English, that voice will be included if you specify <code>yes</code> but
     * not if you specify <code>no</code>.
     * </p>
     * 
     * @param includeAdditionalLanguageCodes
     *        Boolean value indicating whether to return any bilingual voices that use the specified language as an
     *        additional language. For instance, if you request all languages that use US English (es-US), and there is
     *        an Italian voice that speaks both Italian (it-IT) and US English, that voice will be included if you
     *        specify <code>yes</code> but not if you specify <code>no</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVoicesRequest withIncludeAdditionalLanguageCodes(Boolean includeAdditionalLanguageCodes) {
        setIncludeAdditionalLanguageCodes(includeAdditionalLanguageCodes);
        return this;
    }

    /**
     * <p>
     * Boolean value indicating whether to return any bilingual voices that use the specified language as an additional
     * language. For instance, if you request all languages that use US English (es-US), and there is an Italian voice
     * that speaks both Italian (it-IT) and US English, that voice will be included if you specify <code>yes</code> but
     * not if you specify <code>no</code>.
     * </p>
     * 
     * @return Boolean value indicating whether to return any bilingual voices that use the specified language as an
     *         additional language. For instance, if you request all languages that use US English (es-US), and there is
     *         an Italian voice that speaks both Italian (it-IT) and US English, that voice will be included if you
     *         specify <code>yes</code> but not if you specify <code>no</code>.
     */

    public Boolean isIncludeAdditionalLanguageCodes() {
        return this.includeAdditionalLanguageCodes;
    }

    /**
     * <p>
     * An opaque pagination token returned from the previous <code>DescribeVoices</code> operation. If present, this
     * indicates where to continue the listing.
     * </p>
     * 
     * @param nextToken
     *        An opaque pagination token returned from the previous <code>DescribeVoices</code> operation. If present,
     *        this indicates where to continue the listing.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An opaque pagination token returned from the previous <code>DescribeVoices</code> operation. If present, this
     * indicates where to continue the listing.
     * </p>
     * 
     * @return An opaque pagination token returned from the previous <code>DescribeVoices</code> operation. If present,
     *         this indicates where to continue the listing.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An opaque pagination token returned from the previous <code>DescribeVoices</code> operation. If present, this
     * indicates where to continue the listing.
     * </p>
     * 
     * @param nextToken
     *        An opaque pagination token returned from the previous <code>DescribeVoices</code> operation. If present,
     *        this indicates where to continue the listing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVoicesRequest withNextToken(String nextToken) {
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
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getIncludeAdditionalLanguageCodes() != null)
            sb.append("IncludeAdditionalLanguageCodes: ").append(getIncludeAdditionalLanguageCodes()).append(",");
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

        if (obj instanceof DescribeVoicesRequest == false)
            return false;
        DescribeVoicesRequest other = (DescribeVoicesRequest) obj;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getIncludeAdditionalLanguageCodes() == null ^ this.getIncludeAdditionalLanguageCodes() == null)
            return false;
        if (other.getIncludeAdditionalLanguageCodes() != null
                && other.getIncludeAdditionalLanguageCodes().equals(this.getIncludeAdditionalLanguageCodes()) == false)
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

        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getIncludeAdditionalLanguageCodes() == null) ? 0 : getIncludeAdditionalLanguageCodes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVoicesRequest clone() {
        return (DescribeVoicesRequest) super.clone();
    }

}
