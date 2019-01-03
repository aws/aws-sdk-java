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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBotAliases" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBotAliasesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the bot.
     * </p>
     */
    private String botName;
    /**
     * <p>
     * A pagination token for fetching the next page of aliases. If the response to this call is truncated, Amazon Lex
     * returns a pagination token in the response. To fetch the next page of aliases, specify the pagination token in
     * the next request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of aliases to return in the response. The default is 50. .
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Substring to match in bot alias names. An alias will be returned if any part of its name matches the substring.
     * For example, "xyz" matches both "xyzabc" and "abcxyz."
     * </p>
     */
    private String nameContains;

    /**
     * <p>
     * The name of the bot.
     * </p>
     * 
     * @param botName
     *        The name of the bot.
     */

    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * <p>
     * The name of the bot.
     * </p>
     * 
     * @return The name of the bot.
     */

    public String getBotName() {
        return this.botName;
    }

    /**
     * <p>
     * The name of the bot.
     * </p>
     * 
     * @param botName
     *        The name of the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBotAliasesRequest withBotName(String botName) {
        setBotName(botName);
        return this;
    }

    /**
     * <p>
     * A pagination token for fetching the next page of aliases. If the response to this call is truncated, Amazon Lex
     * returns a pagination token in the response. To fetch the next page of aliases, specify the pagination token in
     * the next request.
     * </p>
     * 
     * @param nextToken
     *        A pagination token for fetching the next page of aliases. If the response to this call is truncated,
     *        Amazon Lex returns a pagination token in the response. To fetch the next page of aliases, specify the
     *        pagination token in the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token for fetching the next page of aliases. If the response to this call is truncated, Amazon Lex
     * returns a pagination token in the response. To fetch the next page of aliases, specify the pagination token in
     * the next request.
     * </p>
     * 
     * @return A pagination token for fetching the next page of aliases. If the response to this call is truncated,
     *         Amazon Lex returns a pagination token in the response. To fetch the next page of aliases, specify the
     *         pagination token in the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token for fetching the next page of aliases. If the response to this call is truncated, Amazon Lex
     * returns a pagination token in the response. To fetch the next page of aliases, specify the pagination token in
     * the next request.
     * </p>
     * 
     * @param nextToken
     *        A pagination token for fetching the next page of aliases. If the response to this call is truncated,
     *        Amazon Lex returns a pagination token in the response. To fetch the next page of aliases, specify the
     *        pagination token in the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBotAliasesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of aliases to return in the response. The default is 50. .
     * </p>
     * 
     * @param maxResults
     *        The maximum number of aliases to return in the response. The default is 50. .
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of aliases to return in the response. The default is 50. .
     * </p>
     * 
     * @return The maximum number of aliases to return in the response. The default is 50. .
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of aliases to return in the response. The default is 50. .
     * </p>
     * 
     * @param maxResults
     *        The maximum number of aliases to return in the response. The default is 50. .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBotAliasesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Substring to match in bot alias names. An alias will be returned if any part of its name matches the substring.
     * For example, "xyz" matches both "xyzabc" and "abcxyz."
     * </p>
     * 
     * @param nameContains
     *        Substring to match in bot alias names. An alias will be returned if any part of its name matches the
     *        substring. For example, "xyz" matches both "xyzabc" and "abcxyz."
     */

    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    /**
     * <p>
     * Substring to match in bot alias names. An alias will be returned if any part of its name matches the substring.
     * For example, "xyz" matches both "xyzabc" and "abcxyz."
     * </p>
     * 
     * @return Substring to match in bot alias names. An alias will be returned if any part of its name matches the
     *         substring. For example, "xyz" matches both "xyzabc" and "abcxyz."
     */

    public String getNameContains() {
        return this.nameContains;
    }

    /**
     * <p>
     * Substring to match in bot alias names. An alias will be returned if any part of its name matches the substring.
     * For example, "xyz" matches both "xyzabc" and "abcxyz."
     * </p>
     * 
     * @param nameContains
     *        Substring to match in bot alias names. An alias will be returned if any part of its name matches the
     *        substring. For example, "xyz" matches both "xyzabc" and "abcxyz."
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBotAliasesRequest withNameContains(String nameContains) {
        setNameContains(nameContains);
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
        if (getBotName() != null)
            sb.append("BotName: ").append(getBotName()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNameContains() != null)
            sb.append("NameContains: ").append(getNameContains());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBotAliasesRequest == false)
            return false;
        GetBotAliasesRequest other = (GetBotAliasesRequest) obj;
        if (other.getBotName() == null ^ this.getBotName() == null)
            return false;
        if (other.getBotName() != null && other.getBotName().equals(this.getBotName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNameContains() == null ^ this.getNameContains() == null)
            return false;
        if (other.getNameContains() != null && other.getNameContains().equals(this.getNameContains()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotName() == null) ? 0 : getBotName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNameContains() == null) ? 0 : getNameContains().hashCode());
        return hashCode;
    }

    @Override
    public GetBotAliasesRequest clone() {
        return (GetBotAliasesRequest) super.clone();
    }

}
