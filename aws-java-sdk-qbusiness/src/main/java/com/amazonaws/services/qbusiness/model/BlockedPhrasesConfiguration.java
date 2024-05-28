/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the phrases blocked from chat by your chat control configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/BlockedPhrasesConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BlockedPhrasesConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of phrases blocked from a Amazon Q Business web experience chat.
     * </p>
     */
    private java.util.List<String> blockedPhrases;
    /**
     * <p>
     * The configured custom message displayed to an end user informing them that they've used a blocked phrase during
     * chat.
     * </p>
     */
    private String systemMessageOverride;

    /**
     * <p>
     * A list of phrases blocked from a Amazon Q Business web experience chat.
     * </p>
     * 
     * @return A list of phrases blocked from a Amazon Q Business web experience chat.
     */

    public java.util.List<String> getBlockedPhrases() {
        return blockedPhrases;
    }

    /**
     * <p>
     * A list of phrases blocked from a Amazon Q Business web experience chat.
     * </p>
     * 
     * @param blockedPhrases
     *        A list of phrases blocked from a Amazon Q Business web experience chat.
     */

    public void setBlockedPhrases(java.util.Collection<String> blockedPhrases) {
        if (blockedPhrases == null) {
            this.blockedPhrases = null;
            return;
        }

        this.blockedPhrases = new java.util.ArrayList<String>(blockedPhrases);
    }

    /**
     * <p>
     * A list of phrases blocked from a Amazon Q Business web experience chat.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlockedPhrases(java.util.Collection)} or {@link #withBlockedPhrases(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param blockedPhrases
     *        A list of phrases blocked from a Amazon Q Business web experience chat.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockedPhrasesConfiguration withBlockedPhrases(String... blockedPhrases) {
        if (this.blockedPhrases == null) {
            setBlockedPhrases(new java.util.ArrayList<String>(blockedPhrases.length));
        }
        for (String ele : blockedPhrases) {
            this.blockedPhrases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of phrases blocked from a Amazon Q Business web experience chat.
     * </p>
     * 
     * @param blockedPhrases
     *        A list of phrases blocked from a Amazon Q Business web experience chat.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockedPhrasesConfiguration withBlockedPhrases(java.util.Collection<String> blockedPhrases) {
        setBlockedPhrases(blockedPhrases);
        return this;
    }

    /**
     * <p>
     * The configured custom message displayed to an end user informing them that they've used a blocked phrase during
     * chat.
     * </p>
     * 
     * @param systemMessageOverride
     *        The configured custom message displayed to an end user informing them that they've used a blocked phrase
     *        during chat.
     */

    public void setSystemMessageOverride(String systemMessageOverride) {
        this.systemMessageOverride = systemMessageOverride;
    }

    /**
     * <p>
     * The configured custom message displayed to an end user informing them that they've used a blocked phrase during
     * chat.
     * </p>
     * 
     * @return The configured custom message displayed to an end user informing them that they've used a blocked phrase
     *         during chat.
     */

    public String getSystemMessageOverride() {
        return this.systemMessageOverride;
    }

    /**
     * <p>
     * The configured custom message displayed to an end user informing them that they've used a blocked phrase during
     * chat.
     * </p>
     * 
     * @param systemMessageOverride
     *        The configured custom message displayed to an end user informing them that they've used a blocked phrase
     *        during chat.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlockedPhrasesConfiguration withSystemMessageOverride(String systemMessageOverride) {
        setSystemMessageOverride(systemMessageOverride);
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
        if (getBlockedPhrases() != null)
            sb.append("BlockedPhrases: ").append(getBlockedPhrases()).append(",");
        if (getSystemMessageOverride() != null)
            sb.append("SystemMessageOverride: ").append(getSystemMessageOverride());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BlockedPhrasesConfiguration == false)
            return false;
        BlockedPhrasesConfiguration other = (BlockedPhrasesConfiguration) obj;
        if (other.getBlockedPhrases() == null ^ this.getBlockedPhrases() == null)
            return false;
        if (other.getBlockedPhrases() != null && other.getBlockedPhrases().equals(this.getBlockedPhrases()) == false)
            return false;
        if (other.getSystemMessageOverride() == null ^ this.getSystemMessageOverride() == null)
            return false;
        if (other.getSystemMessageOverride() != null && other.getSystemMessageOverride().equals(this.getSystemMessageOverride()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlockedPhrases() == null) ? 0 : getBlockedPhrases().hashCode());
        hashCode = prime * hashCode + ((getSystemMessageOverride() == null) ? 0 : getSystemMessageOverride().hashCode());
        return hashCode;
    }

    @Override
    public BlockedPhrasesConfiguration clone() {
        try {
            return (BlockedPhrasesConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.BlockedPhrasesConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
