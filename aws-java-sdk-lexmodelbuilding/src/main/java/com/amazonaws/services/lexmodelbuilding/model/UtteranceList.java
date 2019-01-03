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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides a list of utterances that have been made to a specific version of your bot. The list contains a maximum of
 * 100 utterances.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/UtteranceList" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UtteranceList implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The version of the bot that processed the list.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * One or more <a>UtteranceData</a> objects that contain information about the utterances that have been made to a
     * bot. The maximum number of object is 100.
     * </p>
     */
    private java.util.List<UtteranceData> utterances;

    /**
     * <p>
     * The version of the bot that processed the list.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that processed the list.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot that processed the list.
     * </p>
     * 
     * @return The version of the bot that processed the list.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot that processed the list.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that processed the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceList withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * One or more <a>UtteranceData</a> objects that contain information about the utterances that have been made to a
     * bot. The maximum number of object is 100.
     * </p>
     * 
     * @return One or more <a>UtteranceData</a> objects that contain information about the utterances that have been
     *         made to a bot. The maximum number of object is 100.
     */

    public java.util.List<UtteranceData> getUtterances() {
        return utterances;
    }

    /**
     * <p>
     * One or more <a>UtteranceData</a> objects that contain information about the utterances that have been made to a
     * bot. The maximum number of object is 100.
     * </p>
     * 
     * @param utterances
     *        One or more <a>UtteranceData</a> objects that contain information about the utterances that have been made
     *        to a bot. The maximum number of object is 100.
     */

    public void setUtterances(java.util.Collection<UtteranceData> utterances) {
        if (utterances == null) {
            this.utterances = null;
            return;
        }

        this.utterances = new java.util.ArrayList<UtteranceData>(utterances);
    }

    /**
     * <p>
     * One or more <a>UtteranceData</a> objects that contain information about the utterances that have been made to a
     * bot. The maximum number of object is 100.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUtterances(java.util.Collection)} or {@link #withUtterances(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param utterances
     *        One or more <a>UtteranceData</a> objects that contain information about the utterances that have been made
     *        to a bot. The maximum number of object is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceList withUtterances(UtteranceData... utterances) {
        if (this.utterances == null) {
            setUtterances(new java.util.ArrayList<UtteranceData>(utterances.length));
        }
        for (UtteranceData ele : utterances) {
            this.utterances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more <a>UtteranceData</a> objects that contain information about the utterances that have been made to a
     * bot. The maximum number of object is 100.
     * </p>
     * 
     * @param utterances
     *        One or more <a>UtteranceData</a> objects that contain information about the utterances that have been made
     *        to a bot. The maximum number of object is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtteranceList withUtterances(java.util.Collection<UtteranceData> utterances) {
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
        if (getBotVersion() != null)
            sb.append("BotVersion: ").append(getBotVersion()).append(",");
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

        if (obj instanceof UtteranceList == false)
            return false;
        UtteranceList other = (UtteranceList) obj;
        if (other.getBotVersion() == null ^ this.getBotVersion() == null)
            return false;
        if (other.getBotVersion() != null && other.getBotVersion().equals(this.getBotVersion()) == false)
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

        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getUtterances() == null) ? 0 : getUtterances().hashCode());
        return hashCode;
    }

    @Override
    public UtteranceList clone() {
        try {
            return (UtteranceList) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelbuilding.model.transform.UtteranceListMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
