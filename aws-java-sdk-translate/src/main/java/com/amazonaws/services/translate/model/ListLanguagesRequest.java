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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/ListLanguages" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLanguagesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The language code for the language to use to display the language names in the response. The language code is
     * <code>en</code> by default.
     * </p>
     */
    private String displayLanguageCode;
    /**
     * <p>
     * Include the NextToken value to fetch the next group of supported languages.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return in each response.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The language code for the language to use to display the language names in the response. The language code is
     * <code>en</code> by default.
     * </p>
     * 
     * @param displayLanguageCode
     *        The language code for the language to use to display the language names in the response. The language code
     *        is <code>en</code> by default.
     * @see DisplayLanguageCode
     */

    public void setDisplayLanguageCode(String displayLanguageCode) {
        this.displayLanguageCode = displayLanguageCode;
    }

    /**
     * <p>
     * The language code for the language to use to display the language names in the response. The language code is
     * <code>en</code> by default.
     * </p>
     * 
     * @return The language code for the language to use to display the language names in the response. The language
     *         code is <code>en</code> by default.
     * @see DisplayLanguageCode
     */

    public String getDisplayLanguageCode() {
        return this.displayLanguageCode;
    }

    /**
     * <p>
     * The language code for the language to use to display the language names in the response. The language code is
     * <code>en</code> by default.
     * </p>
     * 
     * @param displayLanguageCode
     *        The language code for the language to use to display the language names in the response. The language code
     *        is <code>en</code> by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DisplayLanguageCode
     */

    public ListLanguagesRequest withDisplayLanguageCode(String displayLanguageCode) {
        setDisplayLanguageCode(displayLanguageCode);
        return this;
    }

    /**
     * <p>
     * The language code for the language to use to display the language names in the response. The language code is
     * <code>en</code> by default.
     * </p>
     * 
     * @param displayLanguageCode
     *        The language code for the language to use to display the language names in the response. The language code
     *        is <code>en</code> by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DisplayLanguageCode
     */

    public ListLanguagesRequest withDisplayLanguageCode(DisplayLanguageCode displayLanguageCode) {
        this.displayLanguageCode = displayLanguageCode.toString();
        return this;
    }

    /**
     * <p>
     * Include the NextToken value to fetch the next group of supported languages.
     * </p>
     * 
     * @param nextToken
     *        Include the NextToken value to fetch the next group of supported languages.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Include the NextToken value to fetch the next group of supported languages.
     * </p>
     * 
     * @return Include the NextToken value to fetch the next group of supported languages.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Include the NextToken value to fetch the next group of supported languages.
     * </p>
     * 
     * @param nextToken
     *        Include the NextToken value to fetch the next group of supported languages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLanguagesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in each response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in each response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in each response.
     * </p>
     * 
     * @return The maximum number of results to return in each response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in each response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in each response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLanguagesRequest withMaxResults(Integer maxResults) {
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
        if (getDisplayLanguageCode() != null)
            sb.append("DisplayLanguageCode: ").append(getDisplayLanguageCode()).append(",");
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

        if (obj instanceof ListLanguagesRequest == false)
            return false;
        ListLanguagesRequest other = (ListLanguagesRequest) obj;
        if (other.getDisplayLanguageCode() == null ^ this.getDisplayLanguageCode() == null)
            return false;
        if (other.getDisplayLanguageCode() != null && other.getDisplayLanguageCode().equals(this.getDisplayLanguageCode()) == false)
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

        hashCode = prime * hashCode + ((getDisplayLanguageCode() == null) ? 0 : getDisplayLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListLanguagesRequest clone() {
        return (ListLanguagesRequest) super.clone();
    }

}
