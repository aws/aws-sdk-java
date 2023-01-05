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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/SearchAssociatedTranscripts"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchAssociatedTranscriptsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the bot associated with the transcripts that you are searching.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The version of the bot containing the transcripts that you are searching.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The identifier of the language and locale of the transcripts to search. The string must match one of the
     * supported locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * The unique identifier of the bot recommendation associated with the transcripts to search.
     * </p>
     */
    private String botRecommendationId;
    /**
     * <p>
     * A index that indicates whether there are more results to return in a response to the SearchAssociatedTranscripts
     * operation. If the nextIndex field is present, you send the contents as the nextIndex parameter of a
     * SearchAssociatedTranscriptsRequest operation to get the next page of results.
     * </p>
     */
    private Integer nextIndex;
    /**
     * <p>
     * The object that contains the associated transcript that meet the criteria you specified.
     * </p>
     */
    private java.util.List<AssociatedTranscript> associatedTranscripts;
    /**
     * <p>
     * The total number of transcripts returned by the search.
     * </p>
     */
    private Integer totalResults;

    /**
     * <p>
     * The unique identifier of the bot associated with the transcripts that you are searching.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot associated with the transcripts that you are searching.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique identifier of the bot associated with the transcripts that you are searching.
     * </p>
     * 
     * @return The unique identifier of the bot associated with the transcripts that you are searching.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique identifier of the bot associated with the transcripts that you are searching.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot associated with the transcripts that you are searching.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAssociatedTranscriptsResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The version of the bot containing the transcripts that you are searching.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot containing the transcripts that you are searching.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot containing the transcripts that you are searching.
     * </p>
     * 
     * @return The version of the bot containing the transcripts that you are searching.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot containing the transcripts that you are searching.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot containing the transcripts that you are searching.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAssociatedTranscriptsResult withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The identifier of the language and locale of the transcripts to search. The string must match one of the
     * supported locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale of the transcripts to search. The string must match one of the
     *        supported locales. For more information, see <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale of the transcripts to search. The string must match one of the
     * supported locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>
     * </p>
     * 
     * @return The identifier of the language and locale of the transcripts to search. The string must match one of the
     *         supported locales. For more information, see <a
     *         href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale of the transcripts to search. The string must match one of the
     * supported locales. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale of the transcripts to search. The string must match one of the
     *        supported locales. For more information, see <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/dg/how-languages.html">Supported languages</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAssociatedTranscriptsResult withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the bot recommendation associated with the transcripts to search.
     * </p>
     * 
     * @param botRecommendationId
     *        The unique identifier of the bot recommendation associated with the transcripts to search.
     */

    public void setBotRecommendationId(String botRecommendationId) {
        this.botRecommendationId = botRecommendationId;
    }

    /**
     * <p>
     * The unique identifier of the bot recommendation associated with the transcripts to search.
     * </p>
     * 
     * @return The unique identifier of the bot recommendation associated with the transcripts to search.
     */

    public String getBotRecommendationId() {
        return this.botRecommendationId;
    }

    /**
     * <p>
     * The unique identifier of the bot recommendation associated with the transcripts to search.
     * </p>
     * 
     * @param botRecommendationId
     *        The unique identifier of the bot recommendation associated with the transcripts to search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAssociatedTranscriptsResult withBotRecommendationId(String botRecommendationId) {
        setBotRecommendationId(botRecommendationId);
        return this;
    }

    /**
     * <p>
     * A index that indicates whether there are more results to return in a response to the SearchAssociatedTranscripts
     * operation. If the nextIndex field is present, you send the contents as the nextIndex parameter of a
     * SearchAssociatedTranscriptsRequest operation to get the next page of results.
     * </p>
     * 
     * @param nextIndex
     *        A index that indicates whether there are more results to return in a response to the
     *        SearchAssociatedTranscripts operation. If the nextIndex field is present, you send the contents as the
     *        nextIndex parameter of a SearchAssociatedTranscriptsRequest operation to get the next page of results.
     */

    public void setNextIndex(Integer nextIndex) {
        this.nextIndex = nextIndex;
    }

    /**
     * <p>
     * A index that indicates whether there are more results to return in a response to the SearchAssociatedTranscripts
     * operation. If the nextIndex field is present, you send the contents as the nextIndex parameter of a
     * SearchAssociatedTranscriptsRequest operation to get the next page of results.
     * </p>
     * 
     * @return A index that indicates whether there are more results to return in a response to the
     *         SearchAssociatedTranscripts operation. If the nextIndex field is present, you send the contents as the
     *         nextIndex parameter of a SearchAssociatedTranscriptsRequest operation to get the next page of results.
     */

    public Integer getNextIndex() {
        return this.nextIndex;
    }

    /**
     * <p>
     * A index that indicates whether there are more results to return in a response to the SearchAssociatedTranscripts
     * operation. If the nextIndex field is present, you send the contents as the nextIndex parameter of a
     * SearchAssociatedTranscriptsRequest operation to get the next page of results.
     * </p>
     * 
     * @param nextIndex
     *        A index that indicates whether there are more results to return in a response to the
     *        SearchAssociatedTranscripts operation. If the nextIndex field is present, you send the contents as the
     *        nextIndex parameter of a SearchAssociatedTranscriptsRequest operation to get the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAssociatedTranscriptsResult withNextIndex(Integer nextIndex) {
        setNextIndex(nextIndex);
        return this;
    }

    /**
     * <p>
     * The object that contains the associated transcript that meet the criteria you specified.
     * </p>
     * 
     * @return The object that contains the associated transcript that meet the criteria you specified.
     */

    public java.util.List<AssociatedTranscript> getAssociatedTranscripts() {
        return associatedTranscripts;
    }

    /**
     * <p>
     * The object that contains the associated transcript that meet the criteria you specified.
     * </p>
     * 
     * @param associatedTranscripts
     *        The object that contains the associated transcript that meet the criteria you specified.
     */

    public void setAssociatedTranscripts(java.util.Collection<AssociatedTranscript> associatedTranscripts) {
        if (associatedTranscripts == null) {
            this.associatedTranscripts = null;
            return;
        }

        this.associatedTranscripts = new java.util.ArrayList<AssociatedTranscript>(associatedTranscripts);
    }

    /**
     * <p>
     * The object that contains the associated transcript that meet the criteria you specified.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociatedTranscripts(java.util.Collection)} or
     * {@link #withAssociatedTranscripts(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param associatedTranscripts
     *        The object that contains the associated transcript that meet the criteria you specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAssociatedTranscriptsResult withAssociatedTranscripts(AssociatedTranscript... associatedTranscripts) {
        if (this.associatedTranscripts == null) {
            setAssociatedTranscripts(new java.util.ArrayList<AssociatedTranscript>(associatedTranscripts.length));
        }
        for (AssociatedTranscript ele : associatedTranscripts) {
            this.associatedTranscripts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The object that contains the associated transcript that meet the criteria you specified.
     * </p>
     * 
     * @param associatedTranscripts
     *        The object that contains the associated transcript that meet the criteria you specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAssociatedTranscriptsResult withAssociatedTranscripts(java.util.Collection<AssociatedTranscript> associatedTranscripts) {
        setAssociatedTranscripts(associatedTranscripts);
        return this;
    }

    /**
     * <p>
     * The total number of transcripts returned by the search.
     * </p>
     * 
     * @param totalResults
     *        The total number of transcripts returned by the search.
     */

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    /**
     * <p>
     * The total number of transcripts returned by the search.
     * </p>
     * 
     * @return The total number of transcripts returned by the search.
     */

    public Integer getTotalResults() {
        return this.totalResults;
    }

    /**
     * <p>
     * The total number of transcripts returned by the search.
     * </p>
     * 
     * @param totalResults
     *        The total number of transcripts returned by the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAssociatedTranscriptsResult withTotalResults(Integer totalResults) {
        setTotalResults(totalResults);
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
        if (getLocaleId() != null)
            sb.append("LocaleId: ").append(getLocaleId()).append(",");
        if (getBotRecommendationId() != null)
            sb.append("BotRecommendationId: ").append(getBotRecommendationId()).append(",");
        if (getNextIndex() != null)
            sb.append("NextIndex: ").append(getNextIndex()).append(",");
        if (getAssociatedTranscripts() != null)
            sb.append("AssociatedTranscripts: ").append(getAssociatedTranscripts()).append(",");
        if (getTotalResults() != null)
            sb.append("TotalResults: ").append(getTotalResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchAssociatedTranscriptsResult == false)
            return false;
        SearchAssociatedTranscriptsResult other = (SearchAssociatedTranscriptsResult) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getBotVersion() == null ^ this.getBotVersion() == null)
            return false;
        if (other.getBotVersion() != null && other.getBotVersion().equals(this.getBotVersion()) == false)
            return false;
        if (other.getLocaleId() == null ^ this.getLocaleId() == null)
            return false;
        if (other.getLocaleId() != null && other.getLocaleId().equals(this.getLocaleId()) == false)
            return false;
        if (other.getBotRecommendationId() == null ^ this.getBotRecommendationId() == null)
            return false;
        if (other.getBotRecommendationId() != null && other.getBotRecommendationId().equals(this.getBotRecommendationId()) == false)
            return false;
        if (other.getNextIndex() == null ^ this.getNextIndex() == null)
            return false;
        if (other.getNextIndex() != null && other.getNextIndex().equals(this.getNextIndex()) == false)
            return false;
        if (other.getAssociatedTranscripts() == null ^ this.getAssociatedTranscripts() == null)
            return false;
        if (other.getAssociatedTranscripts() != null && other.getAssociatedTranscripts().equals(this.getAssociatedTranscripts()) == false)
            return false;
        if (other.getTotalResults() == null ^ this.getTotalResults() == null)
            return false;
        if (other.getTotalResults() != null && other.getTotalResults().equals(this.getTotalResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getLocaleId() == null) ? 0 : getLocaleId().hashCode());
        hashCode = prime * hashCode + ((getBotRecommendationId() == null) ? 0 : getBotRecommendationId().hashCode());
        hashCode = prime * hashCode + ((getNextIndex() == null) ? 0 : getNextIndex().hashCode());
        hashCode = prime * hashCode + ((getAssociatedTranscripts() == null) ? 0 : getAssociatedTranscripts().hashCode());
        hashCode = prime * hashCode + ((getTotalResults() == null) ? 0 : getTotalResults().hashCode());
        return hashCode;
    }

    @Override
    public SearchAssociatedTranscriptsResult clone() {
        try {
            return (SearchAssociatedTranscriptsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
