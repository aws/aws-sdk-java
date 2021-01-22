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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListBuiltInIntents" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBuiltInIntentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Summary information for the built-in intents that meet the filter criteria specified in the request. The length
     * of the list is specified in the <code>maxResults</code> parameter of the request. If there are more intents
     * available, the <code>nextToken</code> field contains a token to get the next page of results.
     * </p>
     */
    private java.util.List<BuiltInIntentSummary> builtInIntentSummaries;
    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the
     * <code>ListBuiltInIntents</code> operation. If the <code>nextToken</code> field is present, you send the contents
     * as the <code>nextToken</code> parameter of a <code>ListBotAliases</code> operation request to get the next page
     * of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The language and locale of the intents in the list.
     * </p>
     */
    private String localeId;

    /**
     * <p>
     * Summary information for the built-in intents that meet the filter criteria specified in the request. The length
     * of the list is specified in the <code>maxResults</code> parameter of the request. If there are more intents
     * available, the <code>nextToken</code> field contains a token to get the next page of results.
     * </p>
     * 
     * @return Summary information for the built-in intents that meet the filter criteria specified in the request. The
     *         length of the list is specified in the <code>maxResults</code> parameter of the request. If there are
     *         more intents available, the <code>nextToken</code> field contains a token to get the next page of
     *         results.
     */

    public java.util.List<BuiltInIntentSummary> getBuiltInIntentSummaries() {
        return builtInIntentSummaries;
    }

    /**
     * <p>
     * Summary information for the built-in intents that meet the filter criteria specified in the request. The length
     * of the list is specified in the <code>maxResults</code> parameter of the request. If there are more intents
     * available, the <code>nextToken</code> field contains a token to get the next page of results.
     * </p>
     * 
     * @param builtInIntentSummaries
     *        Summary information for the built-in intents that meet the filter criteria specified in the request. The
     *        length of the list is specified in the <code>maxResults</code> parameter of the request. If there are more
     *        intents available, the <code>nextToken</code> field contains a token to get the next page of results.
     */

    public void setBuiltInIntentSummaries(java.util.Collection<BuiltInIntentSummary> builtInIntentSummaries) {
        if (builtInIntentSummaries == null) {
            this.builtInIntentSummaries = null;
            return;
        }

        this.builtInIntentSummaries = new java.util.ArrayList<BuiltInIntentSummary>(builtInIntentSummaries);
    }

    /**
     * <p>
     * Summary information for the built-in intents that meet the filter criteria specified in the request. The length
     * of the list is specified in the <code>maxResults</code> parameter of the request. If there are more intents
     * available, the <code>nextToken</code> field contains a token to get the next page of results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBuiltInIntentSummaries(java.util.Collection)} or
     * {@link #withBuiltInIntentSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param builtInIntentSummaries
     *        Summary information for the built-in intents that meet the filter criteria specified in the request. The
     *        length of the list is specified in the <code>maxResults</code> parameter of the request. If there are more
     *        intents available, the <code>nextToken</code> field contains a token to get the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBuiltInIntentsResult withBuiltInIntentSummaries(BuiltInIntentSummary... builtInIntentSummaries) {
        if (this.builtInIntentSummaries == null) {
            setBuiltInIntentSummaries(new java.util.ArrayList<BuiltInIntentSummary>(builtInIntentSummaries.length));
        }
        for (BuiltInIntentSummary ele : builtInIntentSummaries) {
            this.builtInIntentSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summary information for the built-in intents that meet the filter criteria specified in the request. The length
     * of the list is specified in the <code>maxResults</code> parameter of the request. If there are more intents
     * available, the <code>nextToken</code> field contains a token to get the next page of results.
     * </p>
     * 
     * @param builtInIntentSummaries
     *        Summary information for the built-in intents that meet the filter criteria specified in the request. The
     *        length of the list is specified in the <code>maxResults</code> parameter of the request. If there are more
     *        intents available, the <code>nextToken</code> field contains a token to get the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBuiltInIntentsResult withBuiltInIntentSummaries(java.util.Collection<BuiltInIntentSummary> builtInIntentSummaries) {
        setBuiltInIntentSummaries(builtInIntentSummaries);
        return this;
    }

    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the
     * <code>ListBuiltInIntents</code> operation. If the <code>nextToken</code> field is present, you send the contents
     * as the <code>nextToken</code> parameter of a <code>ListBotAliases</code> operation request to get the next page
     * of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates whether there are more results to return in a response to the
     *        <code>ListBuiltInIntents</code> operation. If the <code>nextToken</code> field is present, you send the
     *        contents as the <code>nextToken</code> parameter of a <code>ListBotAliases</code> operation request to get
     *        the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the
     * <code>ListBuiltInIntents</code> operation. If the <code>nextToken</code> field is present, you send the contents
     * as the <code>nextToken</code> parameter of a <code>ListBotAliases</code> operation request to get the next page
     * of results.
     * </p>
     * 
     * @return A token that indicates whether there are more results to return in a response to the
     *         <code>ListBuiltInIntents</code> operation. If the <code>nextToken</code> field is present, you send the
     *         contents as the <code>nextToken</code> parameter of a <code>ListBotAliases</code> operation request to
     *         get the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the
     * <code>ListBuiltInIntents</code> operation. If the <code>nextToken</code> field is present, you send the contents
     * as the <code>nextToken</code> parameter of a <code>ListBotAliases</code> operation request to get the next page
     * of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates whether there are more results to return in a response to the
     *        <code>ListBuiltInIntents</code> operation. If the <code>nextToken</code> field is present, you send the
     *        contents as the <code>nextToken</code> parameter of a <code>ListBotAliases</code> operation request to get
     *        the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBuiltInIntentsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The language and locale of the intents in the list.
     * </p>
     * 
     * @param localeId
     *        The language and locale of the intents in the list.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The language and locale of the intents in the list.
     * </p>
     * 
     * @return The language and locale of the intents in the list.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The language and locale of the intents in the list.
     * </p>
     * 
     * @param localeId
     *        The language and locale of the intents in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBuiltInIntentsResult withLocaleId(String localeId) {
        setLocaleId(localeId);
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
        if (getBuiltInIntentSummaries() != null)
            sb.append("BuiltInIntentSummaries: ").append(getBuiltInIntentSummaries()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getLocaleId() != null)
            sb.append("LocaleId: ").append(getLocaleId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBuiltInIntentsResult == false)
            return false;
        ListBuiltInIntentsResult other = (ListBuiltInIntentsResult) obj;
        if (other.getBuiltInIntentSummaries() == null ^ this.getBuiltInIntentSummaries() == null)
            return false;
        if (other.getBuiltInIntentSummaries() != null && other.getBuiltInIntentSummaries().equals(this.getBuiltInIntentSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getLocaleId() == null ^ this.getLocaleId() == null)
            return false;
        if (other.getLocaleId() != null && other.getLocaleId().equals(this.getLocaleId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBuiltInIntentSummaries() == null) ? 0 : getBuiltInIntentSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getLocaleId() == null) ? 0 : getLocaleId().hashCode());
        return hashCode;
    }

    @Override
    public ListBuiltInIntentsResult clone() {
        try {
            return (ListBuiltInIntentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
