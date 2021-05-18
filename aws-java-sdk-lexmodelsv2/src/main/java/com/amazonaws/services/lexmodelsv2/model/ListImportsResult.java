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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListImports" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListImportsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier assigned by Amazon Lex to the bot.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The version of the bot that was imported. It will always be <code>DRAFT</code>.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * Summary information for the imports that meet the filter criteria specified in the request. The length of the
     * list is specified in the <code>maxResults</code> parameter. If there are more imports available, the
     * <code>nextToken</code> field contains a token to get the next page of results.
     * </p>
     */
    private java.util.List<ImportSummary> importSummaries;
    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the <code>ListImports</code>
     * operation. If the <code>nextToken</code> field is present, you send the contents as the <code>nextToken</code>
     * parameter of a <code>ListImports</code> operation request to get the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The unique identifier assigned by Amazon Lex to the bot.
     * </p>
     * 
     * @param botId
     *        The unique identifier assigned by Amazon Lex to the bot.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique identifier assigned by Amazon Lex to the bot.
     * </p>
     * 
     * @return The unique identifier assigned by Amazon Lex to the bot.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique identifier assigned by Amazon Lex to the bot.
     * </p>
     * 
     * @param botId
     *        The unique identifier assigned by Amazon Lex to the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImportsResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The version of the bot that was imported. It will always be <code>DRAFT</code>.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that was imported. It will always be <code>DRAFT</code>.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot that was imported. It will always be <code>DRAFT</code>.
     * </p>
     * 
     * @return The version of the bot that was imported. It will always be <code>DRAFT</code>.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot that was imported. It will always be <code>DRAFT</code>.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that was imported. It will always be <code>DRAFT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImportsResult withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * Summary information for the imports that meet the filter criteria specified in the request. The length of the
     * list is specified in the <code>maxResults</code> parameter. If there are more imports available, the
     * <code>nextToken</code> field contains a token to get the next page of results.
     * </p>
     * 
     * @return Summary information for the imports that meet the filter criteria specified in the request. The length of
     *         the list is specified in the <code>maxResults</code> parameter. If there are more imports available, the
     *         <code>nextToken</code> field contains a token to get the next page of results.
     */

    public java.util.List<ImportSummary> getImportSummaries() {
        return importSummaries;
    }

    /**
     * <p>
     * Summary information for the imports that meet the filter criteria specified in the request. The length of the
     * list is specified in the <code>maxResults</code> parameter. If there are more imports available, the
     * <code>nextToken</code> field contains a token to get the next page of results.
     * </p>
     * 
     * @param importSummaries
     *        Summary information for the imports that meet the filter criteria specified in the request. The length of
     *        the list is specified in the <code>maxResults</code> parameter. If there are more imports available, the
     *        <code>nextToken</code> field contains a token to get the next page of results.
     */

    public void setImportSummaries(java.util.Collection<ImportSummary> importSummaries) {
        if (importSummaries == null) {
            this.importSummaries = null;
            return;
        }

        this.importSummaries = new java.util.ArrayList<ImportSummary>(importSummaries);
    }

    /**
     * <p>
     * Summary information for the imports that meet the filter criteria specified in the request. The length of the
     * list is specified in the <code>maxResults</code> parameter. If there are more imports available, the
     * <code>nextToken</code> field contains a token to get the next page of results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImportSummaries(java.util.Collection)} or {@link #withImportSummaries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param importSummaries
     *        Summary information for the imports that meet the filter criteria specified in the request. The length of
     *        the list is specified in the <code>maxResults</code> parameter. If there are more imports available, the
     *        <code>nextToken</code> field contains a token to get the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImportsResult withImportSummaries(ImportSummary... importSummaries) {
        if (this.importSummaries == null) {
            setImportSummaries(new java.util.ArrayList<ImportSummary>(importSummaries.length));
        }
        for (ImportSummary ele : importSummaries) {
            this.importSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summary information for the imports that meet the filter criteria specified in the request. The length of the
     * list is specified in the <code>maxResults</code> parameter. If there are more imports available, the
     * <code>nextToken</code> field contains a token to get the next page of results.
     * </p>
     * 
     * @param importSummaries
     *        Summary information for the imports that meet the filter criteria specified in the request. The length of
     *        the list is specified in the <code>maxResults</code> parameter. If there are more imports available, the
     *        <code>nextToken</code> field contains a token to get the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImportsResult withImportSummaries(java.util.Collection<ImportSummary> importSummaries) {
        setImportSummaries(importSummaries);
        return this;
    }

    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the <code>ListImports</code>
     * operation. If the <code>nextToken</code> field is present, you send the contents as the <code>nextToken</code>
     * parameter of a <code>ListImports</code> operation request to get the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates whether there are more results to return in a response to the
     *        <code>ListImports</code> operation. If the <code>nextToken</code> field is present, you send the contents
     *        as the <code>nextToken</code> parameter of a <code>ListImports</code> operation request to get the next
     *        page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the <code>ListImports</code>
     * operation. If the <code>nextToken</code> field is present, you send the contents as the <code>nextToken</code>
     * parameter of a <code>ListImports</code> operation request to get the next page of results.
     * </p>
     * 
     * @return A token that indicates whether there are more results to return in a response to the
     *         <code>ListImports</code> operation. If the <code>nextToken</code> field is present, you send the contents
     *         as the <code>nextToken</code> parameter of a <code>ListImports</code> operation request to get the next
     *         page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the <code>ListImports</code>
     * operation. If the <code>nextToken</code> field is present, you send the contents as the <code>nextToken</code>
     * parameter of a <code>ListImports</code> operation request to get the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates whether there are more results to return in a response to the
     *        <code>ListImports</code> operation. If the <code>nextToken</code> field is present, you send the contents
     *        as the <code>nextToken</code> parameter of a <code>ListImports</code> operation request to get the next
     *        page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImportsResult withNextToken(String nextToken) {
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
        if (getBotId() != null)
            sb.append("BotId: ").append(getBotId()).append(",");
        if (getBotVersion() != null)
            sb.append("BotVersion: ").append(getBotVersion()).append(",");
        if (getImportSummaries() != null)
            sb.append("ImportSummaries: ").append(getImportSummaries()).append(",");
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

        if (obj instanceof ListImportsResult == false)
            return false;
        ListImportsResult other = (ListImportsResult) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getBotVersion() == null ^ this.getBotVersion() == null)
            return false;
        if (other.getBotVersion() != null && other.getBotVersion().equals(this.getBotVersion()) == false)
            return false;
        if (other.getImportSummaries() == null ^ this.getImportSummaries() == null)
            return false;
        if (other.getImportSummaries() != null && other.getImportSummaries().equals(this.getImportSummaries()) == false)
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

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getImportSummaries() == null) ? 0 : getImportSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListImportsResult clone() {
        try {
            return (ListImportsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
