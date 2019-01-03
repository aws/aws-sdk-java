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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBotChannelAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBotChannelAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of objects, one for each association, that provides information about the Amazon Lex bot and its
     * association with the channel.
     * </p>
     */
    private java.util.List<BotChannelAssociation> botChannelAssociations;
    /**
     * <p>
     * A pagination token that fetches the next page of associations. If the response to this call is truncated, Amazon
     * Lex returns a pagination token in the response. To fetch the next page of associations, specify the pagination
     * token in the next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of objects, one for each association, that provides information about the Amazon Lex bot and its
     * association with the channel.
     * </p>
     * 
     * @return An array of objects, one for each association, that provides information about the Amazon Lex bot and its
     *         association with the channel.
     */

    public java.util.List<BotChannelAssociation> getBotChannelAssociations() {
        return botChannelAssociations;
    }

    /**
     * <p>
     * An array of objects, one for each association, that provides information about the Amazon Lex bot and its
     * association with the channel.
     * </p>
     * 
     * @param botChannelAssociations
     *        An array of objects, one for each association, that provides information about the Amazon Lex bot and its
     *        association with the channel.
     */

    public void setBotChannelAssociations(java.util.Collection<BotChannelAssociation> botChannelAssociations) {
        if (botChannelAssociations == null) {
            this.botChannelAssociations = null;
            return;
        }

        this.botChannelAssociations = new java.util.ArrayList<BotChannelAssociation>(botChannelAssociations);
    }

    /**
     * <p>
     * An array of objects, one for each association, that provides information about the Amazon Lex bot and its
     * association with the channel.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBotChannelAssociations(java.util.Collection)} or
     * {@link #withBotChannelAssociations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param botChannelAssociations
     *        An array of objects, one for each association, that provides information about the Amazon Lex bot and its
     *        association with the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBotChannelAssociationsResult withBotChannelAssociations(BotChannelAssociation... botChannelAssociations) {
        if (this.botChannelAssociations == null) {
            setBotChannelAssociations(new java.util.ArrayList<BotChannelAssociation>(botChannelAssociations.length));
        }
        for (BotChannelAssociation ele : botChannelAssociations) {
            this.botChannelAssociations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects, one for each association, that provides information about the Amazon Lex bot and its
     * association with the channel.
     * </p>
     * 
     * @param botChannelAssociations
     *        An array of objects, one for each association, that provides information about the Amazon Lex bot and its
     *        association with the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBotChannelAssociationsResult withBotChannelAssociations(java.util.Collection<BotChannelAssociation> botChannelAssociations) {
        setBotChannelAssociations(botChannelAssociations);
        return this;
    }

    /**
     * <p>
     * A pagination token that fetches the next page of associations. If the response to this call is truncated, Amazon
     * Lex returns a pagination token in the response. To fetch the next page of associations, specify the pagination
     * token in the next request.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that fetches the next page of associations. If the response to this call is truncated,
     *        Amazon Lex returns a pagination token in the response. To fetch the next page of associations, specify the
     *        pagination token in the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token that fetches the next page of associations. If the response to this call is truncated, Amazon
     * Lex returns a pagination token in the response. To fetch the next page of associations, specify the pagination
     * token in the next request.
     * </p>
     * 
     * @return A pagination token that fetches the next page of associations. If the response to this call is truncated,
     *         Amazon Lex returns a pagination token in the response. To fetch the next page of associations, specify
     *         the pagination token in the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token that fetches the next page of associations. If the response to this call is truncated, Amazon
     * Lex returns a pagination token in the response. To fetch the next page of associations, specify the pagination
     * token in the next request.
     * </p>
     * 
     * @param nextToken
     *        A pagination token that fetches the next page of associations. If the response to this call is truncated,
     *        Amazon Lex returns a pagination token in the response. To fetch the next page of associations, specify the
     *        pagination token in the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBotChannelAssociationsResult withNextToken(String nextToken) {
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
        if (getBotChannelAssociations() != null)
            sb.append("BotChannelAssociations: ").append(getBotChannelAssociations()).append(",");
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

        if (obj instanceof GetBotChannelAssociationsResult == false)
            return false;
        GetBotChannelAssociationsResult other = (GetBotChannelAssociationsResult) obj;
        if (other.getBotChannelAssociations() == null ^ this.getBotChannelAssociations() == null)
            return false;
        if (other.getBotChannelAssociations() != null && other.getBotChannelAssociations().equals(this.getBotChannelAssociations()) == false)
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

        hashCode = prime * hashCode + ((getBotChannelAssociations() == null) ? 0 : getBotChannelAssociations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetBotChannelAssociationsResult clone() {
        try {
            return (GetBotChannelAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
