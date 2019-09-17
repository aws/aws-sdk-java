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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetUtterancesView" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUtterancesViewResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the bot for which utterance information was returned.
     * </p>
     */
    private String botName;
    /**
     * <p>
     * An array of <a>UtteranceList</a> objects, each containing a list of <a>UtteranceData</a> objects describing the
     * utterances that were processed by your bot. The response contains a maximum of 100 <code>UtteranceData</code>
     * objects for each version.
     * </p>
     */
    private java.util.List<UtteranceList> utterances;

    /**
     * <p>
     * The name of the bot for which utterance information was returned.
     * </p>
     * 
     * @param botName
     *        The name of the bot for which utterance information was returned.
     */

    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * <p>
     * The name of the bot for which utterance information was returned.
     * </p>
     * 
     * @return The name of the bot for which utterance information was returned.
     */

    public String getBotName() {
        return this.botName;
    }

    /**
     * <p>
     * The name of the bot for which utterance information was returned.
     * </p>
     * 
     * @param botName
     *        The name of the bot for which utterance information was returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUtterancesViewResult withBotName(String botName) {
        setBotName(botName);
        return this;
    }

    /**
     * <p>
     * An array of <a>UtteranceList</a> objects, each containing a list of <a>UtteranceData</a> objects describing the
     * utterances that were processed by your bot. The response contains a maximum of 100 <code>UtteranceData</code>
     * objects for each version.
     * </p>
     * 
     * @return An array of <a>UtteranceList</a> objects, each containing a list of <a>UtteranceData</a> objects
     *         describing the utterances that were processed by your bot. The response contains a maximum of 100
     *         <code>UtteranceData</code> objects for each version.
     */

    public java.util.List<UtteranceList> getUtterances() {
        return utterances;
    }

    /**
     * <p>
     * An array of <a>UtteranceList</a> objects, each containing a list of <a>UtteranceData</a> objects describing the
     * utterances that were processed by your bot. The response contains a maximum of 100 <code>UtteranceData</code>
     * objects for each version.
     * </p>
     * 
     * @param utterances
     *        An array of <a>UtteranceList</a> objects, each containing a list of <a>UtteranceData</a> objects
     *        describing the utterances that were processed by your bot. The response contains a maximum of 100
     *        <code>UtteranceData</code> objects for each version.
     */

    public void setUtterances(java.util.Collection<UtteranceList> utterances) {
        if (utterances == null) {
            this.utterances = null;
            return;
        }

        this.utterances = new java.util.ArrayList<UtteranceList>(utterances);
    }

    /**
     * <p>
     * An array of <a>UtteranceList</a> objects, each containing a list of <a>UtteranceData</a> objects describing the
     * utterances that were processed by your bot. The response contains a maximum of 100 <code>UtteranceData</code>
     * objects for each version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUtterances(java.util.Collection)} or {@link #withUtterances(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param utterances
     *        An array of <a>UtteranceList</a> objects, each containing a list of <a>UtteranceData</a> objects
     *        describing the utterances that were processed by your bot. The response contains a maximum of 100
     *        <code>UtteranceData</code> objects for each version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUtterancesViewResult withUtterances(UtteranceList... utterances) {
        if (this.utterances == null) {
            setUtterances(new java.util.ArrayList<UtteranceList>(utterances.length));
        }
        for (UtteranceList ele : utterances) {
            this.utterances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <a>UtteranceList</a> objects, each containing a list of <a>UtteranceData</a> objects describing the
     * utterances that were processed by your bot. The response contains a maximum of 100 <code>UtteranceData</code>
     * objects for each version.
     * </p>
     * 
     * @param utterances
     *        An array of <a>UtteranceList</a> objects, each containing a list of <a>UtteranceData</a> objects
     *        describing the utterances that were processed by your bot. The response contains a maximum of 100
     *        <code>UtteranceData</code> objects for each version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUtterancesViewResult withUtterances(java.util.Collection<UtteranceList> utterances) {
        setUtterances(utterances);
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
        if (getUtterances() != null)
            sb.append("Utterances: ").append(getUtterances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUtterancesViewResult == false)
            return false;
        GetUtterancesViewResult other = (GetUtterancesViewResult) obj;
        if (other.getBotName() == null ^ this.getBotName() == null)
            return false;
        if (other.getBotName() != null && other.getBotName().equals(this.getBotName()) == false)
            return false;
        if (other.getUtterances() == null ^ this.getUtterances() == null)
            return false;
        if (other.getUtterances() != null && other.getUtterances().equals(this.getUtterances()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotName() == null) ? 0 : getBotName().hashCode());
        hashCode = prime * hashCode + ((getUtterances() == null) ? 0 : getUtterances().hashCode());
        return hashCode;
    }

    @Override
    public GetUtterancesViewResult clone() {
        try {
            return (GetUtterancesViewResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
