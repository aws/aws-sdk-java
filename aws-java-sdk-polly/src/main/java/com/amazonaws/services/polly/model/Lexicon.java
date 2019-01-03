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
package com.amazonaws.services.polly.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides lexicon name and lexicon content in string format. For more information, see <a
 * href="https://www.w3.org/TR/pronunciation-lexicon/">Pronunciation Lexicon Specification (PLS) Version 1.0</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/polly-2016-06-10/Lexicon" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Lexicon implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Lexicon content in string format. The content of a lexicon must be in PLS format.
     * </p>
     */
    private String content;
    /**
     * <p>
     * Name of the lexicon.
     * </p>
     */
    private String name;

    /**
     * <p>
     * Lexicon content in string format. The content of a lexicon must be in PLS format.
     * </p>
     * 
     * @param content
     *        Lexicon content in string format. The content of a lexicon must be in PLS format.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * Lexicon content in string format. The content of a lexicon must be in PLS format.
     * </p>
     * 
     * @return Lexicon content in string format. The content of a lexicon must be in PLS format.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * Lexicon content in string format. The content of a lexicon must be in PLS format.
     * </p>
     * 
     * @param content
     *        Lexicon content in string format. The content of a lexicon must be in PLS format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Lexicon withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * Name of the lexicon.
     * </p>
     * 
     * @param name
     *        Name of the lexicon.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the lexicon.
     * </p>
     * 
     * @return Name of the lexicon.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the lexicon.
     * </p>
     * 
     * @param name
     *        Name of the lexicon.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Lexicon withName(String name) {
        setName(name);
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
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Lexicon == false)
            return false;
        Lexicon other = (Lexicon) obj;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public Lexicon clone() {
        try {
            return (Lexicon) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.polly.model.transform.LexiconMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
