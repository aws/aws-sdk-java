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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBuiltinIntents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBuiltinIntentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of locales that the intent supports.
     * </p>
     */
    private String locale;
    /**
     * <p>
     * Substring to match in built-in intent signatures. An intent will be returned if any part of its signature matches
     * the substring. For example, "xyz" matches both "xyzabc" and "abcxyz." To find the signature for an intent, see <a
     * href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     * >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     */
    private String signatureContains;
    /**
     * <p>
     * A pagination token that fetches the next page of intents. If this API call is truncated, Amazon Lex returns a
     * pagination token in the response. To fetch the next page of intents, use the pagination token in the next
     * request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of intents to return in the response. The default is 10.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * A list of locales that the intent supports.
     * </p>
     * 
     * @param locale
     *        A list of locales that the intent supports.
     * @see Locale
     */

    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * <p>
     * A list of locales that the intent supports.
     * </p>
     * 
     * @return A list of locales that the intent supports.
     * @see Locale
     */

    public String getLocale() {
        return this.locale;
    }

    /**
     * <p>
     * A list of locales that the intent supports.
     * </p>
     * 
     * @param locale
     *        A list of locales that the intent supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Locale
     */

    public GetBuiltinIntentsRequest withLocale(String locale) {
        setLocale(locale);
        return this;
    }

    /**
     * <p>
     * A list of locales that the intent supports.
     * </p>
     * 
     * @param locale
     *        A list of locales that the intent supports.
     * @see Locale
     */

    public void setLocale(Locale locale) {
        withLocale(locale);
    }

    /**
     * <p>
     * A list of locales that the intent supports.
     * </p>
     * 
     * @param locale
     *        A list of locales that the intent supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Locale
     */

    public GetBuiltinIntentsRequest withLocale(Locale locale) {
        this.locale = locale.toString();
        return this;
    }

    /**
     * <p>
     * Substring to match in built-in intent signatures. An intent will be returned if any part of its signature matches
     * the substring. For example, "xyz" matches both "xyzabc" and "abcxyz." To find the signature for an intent, see <a
     * href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     * >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     * 
     * @param signatureContains
     *        Substring to match in built-in intent signatures. An intent will be returned if any part of its signature
     *        matches the substring. For example, "xyz" matches both "xyzabc" and "abcxyz." To find the signature for an
     *        intent, see <a href=
     *        "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     *        >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     */

    public void setSignatureContains(String signatureContains) {
        this.signatureContains = signatureContains;
    }

    /**
     * <p>
     * Substring to match in built-in intent signatures. An intent will be returned if any part of its signature matches
     * the substring. For example, "xyz" matches both "xyzabc" and "abcxyz." To find the signature for an intent, see <a
     * href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     * >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     * 
     * @return Substring to match in built-in intent signatures. An intent will be returned if any part of its signature
     *         matches the substring. For example, "xyz" matches both "xyzabc" and "abcxyz." To find the signature for
     *         an intent, see <a href=
     *         "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     *         >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     */

    public String getSignatureContains() {
        return this.signatureContains;
    }

    /**
     * <p>
     * Substring to match in built-in intent signatures. An intent will be returned if any part of its signature matches
     * the substring. For example, "xyz" matches both "xyzabc" and "abcxyz." To find the signature for an intent, see <a
     * href=
     * "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     * >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * </p>
     * 
     * @param signatureContains
     *        Substring to match in built-in intent signatures. An intent will be returned if any part of its signature
     *        matches the substring. For example, "xyz" matches both "xyzabc" and "abcxyz." To find the signature for an
     *        intent, see <a href=
     *        "https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents"
     *        >Standard Built-in Intents</a> in the <i>Alexa Skills Kit</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBuiltinIntentsRequest withSignatureContains(String signatureContains) {
        setSignatureContains(signatureContains);
        return this;
    }

    /**
     * <p>
     * A pagination token that fetches the next page of intents. If this API call is truncated, Amazon Lex returns a
     * pagination token in the response. To fetch the next page of intents, use the pagination token in the next
     * request.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that fetches the next page of intents. If this API call is truncated, Amazon Lex
     *        returns a pagination token in the response. To fetch the next page of intents, use the pagination token in
     *        the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token that fetches the next page of intents. If this API call is truncated, Amazon Lex returns a
     * pagination token in the response. To fetch the next page of intents, use the pagination token in the next
     * request.
     * </p>
     * 
     * @return A pagination token that fetches the next page of intents. If this API call is truncated, Amazon Lex
     *         returns a pagination token in the response. To fetch the next page of intents, use the pagination token
     *         in the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token that fetches the next page of intents. If this API call is truncated, Amazon Lex returns a
     * pagination token in the response. To fetch the next page of intents, use the pagination token in the next
     * request.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that fetches the next page of intents. If this API call is truncated, Amazon Lex
     *        returns a pagination token in the response. To fetch the next page of intents, use the pagination token in
     *        the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBuiltinIntentsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of intents to return in the response. The default is 10.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of intents to return in the response. The default is 10.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of intents to return in the response. The default is 10.
     * </p>
     * 
     * @return The maximum number of intents to return in the response. The default is 10.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of intents to return in the response. The default is 10.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of intents to return in the response. The default is 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBuiltinIntentsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getLocale() != null)
            sb.append("Locale: ").append(getLocale()).append(",");
        if (getSignatureContains() != null)
            sb.append("SignatureContains: ").append(getSignatureContains()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBuiltinIntentsRequest == false)
            return false;
        GetBuiltinIntentsRequest other = (GetBuiltinIntentsRequest) obj;
        if (other.getLocale() == null ^ this.getLocale() == null)
            return false;
        if (other.getLocale() != null && other.getLocale().equals(this.getLocale()) == false)
            return false;
        if (other.getSignatureContains() == null ^ this.getSignatureContains() == null)
            return false;
        if (other.getSignatureContains() != null && other.getSignatureContains().equals(this.getSignatureContains()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocale() == null) ? 0 : getLocale().hashCode());
        hashCode = prime * hashCode + ((getSignatureContains() == null) ? 0 : getSignatureContains().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetBuiltinIntentsRequest clone() {
        return (GetBuiltinIntentsRequest) super.clone();
    }

}
