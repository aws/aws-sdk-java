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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListExports" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListExportsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier assigned to the bot by Amazon Lex.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The version of the bot that was exported.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * Summary information for the exports that meet the filter criteria specified in the request. The length of the
     * list is specified in the <code>maxResults</code> parameter. If there are more exports available, the
     * <code>nextToken</code> field contains a token to get the next page of results.
     * </p>
     */
    private java.util.List<ExportSummary> exportSummaries;
    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the <code>ListExports</code>
     * operation. If the <code>nextToken</code> field is present, you send the contents as the <code>nextToken</code>
     * parameter of a <code>ListExports</code> operation request to get the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The unique identifier assigned to the bot by Amazon Lex.
     * </p>
     * 
     * @param botId
     *        The unique identifier assigned to the bot by Amazon Lex.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique identifier assigned to the bot by Amazon Lex.
     * </p>
     * 
     * @return The unique identifier assigned to the bot by Amazon Lex.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique identifier assigned to the bot by Amazon Lex.
     * </p>
     * 
     * @param botId
     *        The unique identifier assigned to the bot by Amazon Lex.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExportsResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The version of the bot that was exported.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that was exported.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot that was exported.
     * </p>
     * 
     * @return The version of the bot that was exported.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot that was exported.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that was exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExportsResult withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * Summary information for the exports that meet the filter criteria specified in the request. The length of the
     * list is specified in the <code>maxResults</code> parameter. If there are more exports available, the
     * <code>nextToken</code> field contains a token to get the next page of results.
     * </p>
     * 
     * @return Summary information for the exports that meet the filter criteria specified in the request. The length of
     *         the list is specified in the <code>maxResults</code> parameter. If there are more exports available, the
     *         <code>nextToken</code> field contains a token to get the next page of results.
     */

    public java.util.List<ExportSummary> getExportSummaries() {
        return exportSummaries;
    }

    /**
     * <p>
     * Summary information for the exports that meet the filter criteria specified in the request. The length of the
     * list is specified in the <code>maxResults</code> parameter. If there are more exports available, the
     * <code>nextToken</code> field contains a token to get the next page of results.
     * </p>
     * 
     * @param exportSummaries
     *        Summary information for the exports that meet the filter criteria specified in the request. The length of
     *        the list is specified in the <code>maxResults</code> parameter. If there are more exports available, the
     *        <code>nextToken</code> field contains a token to get the next page of results.
     */

    public void setExportSummaries(java.util.Collection<ExportSummary> exportSummaries) {
        if (exportSummaries == null) {
            this.exportSummaries = null;
            return;
        }

        this.exportSummaries = new java.util.ArrayList<ExportSummary>(exportSummaries);
    }

    /**
     * <p>
     * Summary information for the exports that meet the filter criteria specified in the request. The length of the
     * list is specified in the <code>maxResults</code> parameter. If there are more exports available, the
     * <code>nextToken</code> field contains a token to get the next page of results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExportSummaries(java.util.Collection)} or {@link #withExportSummaries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param exportSummaries
     *        Summary information for the exports that meet the filter criteria specified in the request. The length of
     *        the list is specified in the <code>maxResults</code> parameter. If there are more exports available, the
     *        <code>nextToken</code> field contains a token to get the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExportsResult withExportSummaries(ExportSummary... exportSummaries) {
        if (this.exportSummaries == null) {
            setExportSummaries(new java.util.ArrayList<ExportSummary>(exportSummaries.length));
        }
        for (ExportSummary ele : exportSummaries) {
            this.exportSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summary information for the exports that meet the filter criteria specified in the request. The length of the
     * list is specified in the <code>maxResults</code> parameter. If there are more exports available, the
     * <code>nextToken</code> field contains a token to get the next page of results.
     * </p>
     * 
     * @param exportSummaries
     *        Summary information for the exports that meet the filter criteria specified in the request. The length of
     *        the list is specified in the <code>maxResults</code> parameter. If there are more exports available, the
     *        <code>nextToken</code> field contains a token to get the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExportsResult withExportSummaries(java.util.Collection<ExportSummary> exportSummaries) {
        setExportSummaries(exportSummaries);
        return this;
    }

    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the <code>ListExports</code>
     * operation. If the <code>nextToken</code> field is present, you send the contents as the <code>nextToken</code>
     * parameter of a <code>ListExports</code> operation request to get the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates whether there are more results to return in a response to the
     *        <code>ListExports</code> operation. If the <code>nextToken</code> field is present, you send the contents
     *        as the <code>nextToken</code> parameter of a <code>ListExports</code> operation request to get the next
     *        page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the <code>ListExports</code>
     * operation. If the <code>nextToken</code> field is present, you send the contents as the <code>nextToken</code>
     * parameter of a <code>ListExports</code> operation request to get the next page of results.
     * </p>
     * 
     * @return A token that indicates whether there are more results to return in a response to the
     *         <code>ListExports</code> operation. If the <code>nextToken</code> field is present, you send the contents
     *         as the <code>nextToken</code> parameter of a <code>ListExports</code> operation request to get the next
     *         page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the <code>ListExports</code>
     * operation. If the <code>nextToken</code> field is present, you send the contents as the <code>nextToken</code>
     * parameter of a <code>ListExports</code> operation request to get the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates whether there are more results to return in a response to the
     *        <code>ListExports</code> operation. If the <code>nextToken</code> field is present, you send the contents
     *        as the <code>nextToken</code> parameter of a <code>ListExports</code> operation request to get the next
     *        page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExportsResult withNextToken(String nextToken) {
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
        if (getExportSummaries() != null)
            sb.append("ExportSummaries: ").append(getExportSummaries()).append(",");
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

        if (obj instanceof ListExportsResult == false)
            return false;
        ListExportsResult other = (ListExportsResult) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getBotVersion() == null ^ this.getBotVersion() == null)
            return false;
        if (other.getBotVersion() != null && other.getBotVersion().equals(this.getBotVersion()) == false)
            return false;
        if (other.getExportSummaries() == null ^ this.getExportSummaries() == null)
            return false;
        if (other.getExportSummaries() != null && other.getExportSummaries().equals(this.getExportSummaries()) == false)
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
        hashCode = prime * hashCode + ((getExportSummaries() == null) ? 0 : getExportSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListExportsResult clone() {
        try {
            return (ListExportsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
