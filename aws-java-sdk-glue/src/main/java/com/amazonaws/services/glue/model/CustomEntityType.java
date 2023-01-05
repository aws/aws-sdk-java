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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing a custom pattern for detecting sensitive data across the columns and rows of your structured
 * data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CustomEntityType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomEntityType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A name for the custom pattern that allows it to be retrieved or deleted later. This name must be unique per
     * Amazon Web Services account.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A regular expression string that is used for detecting sensitive data in a custom pattern.
     * </p>
     */
    private String regexString;
    /**
     * <p>
     * A list of context words. If none of these context words are found within the vicinity of the regular expression
     * the data will not be detected as sensitive data.
     * </p>
     * <p>
     * If no context words are passed only a regular expression is checked.
     * </p>
     */
    private java.util.List<String> contextWords;

    /**
     * <p>
     * A name for the custom pattern that allows it to be retrieved or deleted later. This name must be unique per
     * Amazon Web Services account.
     * </p>
     * 
     * @param name
     *        A name for the custom pattern that allows it to be retrieved or deleted later. This name must be unique
     *        per Amazon Web Services account.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the custom pattern that allows it to be retrieved or deleted later. This name must be unique per
     * Amazon Web Services account.
     * </p>
     * 
     * @return A name for the custom pattern that allows it to be retrieved or deleted later. This name must be unique
     *         per Amazon Web Services account.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the custom pattern that allows it to be retrieved or deleted later. This name must be unique per
     * Amazon Web Services account.
     * </p>
     * 
     * @param name
     *        A name for the custom pattern that allows it to be retrieved or deleted later. This name must be unique
     *        per Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomEntityType withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A regular expression string that is used for detecting sensitive data in a custom pattern.
     * </p>
     * 
     * @param regexString
     *        A regular expression string that is used for detecting sensitive data in a custom pattern.
     */

    public void setRegexString(String regexString) {
        this.regexString = regexString;
    }

    /**
     * <p>
     * A regular expression string that is used for detecting sensitive data in a custom pattern.
     * </p>
     * 
     * @return A regular expression string that is used for detecting sensitive data in a custom pattern.
     */

    public String getRegexString() {
        return this.regexString;
    }

    /**
     * <p>
     * A regular expression string that is used for detecting sensitive data in a custom pattern.
     * </p>
     * 
     * @param regexString
     *        A regular expression string that is used for detecting sensitive data in a custom pattern.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomEntityType withRegexString(String regexString) {
        setRegexString(regexString);
        return this;
    }

    /**
     * <p>
     * A list of context words. If none of these context words are found within the vicinity of the regular expression
     * the data will not be detected as sensitive data.
     * </p>
     * <p>
     * If no context words are passed only a regular expression is checked.
     * </p>
     * 
     * @return A list of context words. If none of these context words are found within the vicinity of the regular
     *         expression the data will not be detected as sensitive data.</p>
     *         <p>
     *         If no context words are passed only a regular expression is checked.
     */

    public java.util.List<String> getContextWords() {
        return contextWords;
    }

    /**
     * <p>
     * A list of context words. If none of these context words are found within the vicinity of the regular expression
     * the data will not be detected as sensitive data.
     * </p>
     * <p>
     * If no context words are passed only a regular expression is checked.
     * </p>
     * 
     * @param contextWords
     *        A list of context words. If none of these context words are found within the vicinity of the regular
     *        expression the data will not be detected as sensitive data.</p>
     *        <p>
     *        If no context words are passed only a regular expression is checked.
     */

    public void setContextWords(java.util.Collection<String> contextWords) {
        if (contextWords == null) {
            this.contextWords = null;
            return;
        }

        this.contextWords = new java.util.ArrayList<String>(contextWords);
    }

    /**
     * <p>
     * A list of context words. If none of these context words are found within the vicinity of the regular expression
     * the data will not be detected as sensitive data.
     * </p>
     * <p>
     * If no context words are passed only a regular expression is checked.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContextWords(java.util.Collection)} or {@link #withContextWords(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param contextWords
     *        A list of context words. If none of these context words are found within the vicinity of the regular
     *        expression the data will not be detected as sensitive data.</p>
     *        <p>
     *        If no context words are passed only a regular expression is checked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomEntityType withContextWords(String... contextWords) {
        if (this.contextWords == null) {
            setContextWords(new java.util.ArrayList<String>(contextWords.length));
        }
        for (String ele : contextWords) {
            this.contextWords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of context words. If none of these context words are found within the vicinity of the regular expression
     * the data will not be detected as sensitive data.
     * </p>
     * <p>
     * If no context words are passed only a regular expression is checked.
     * </p>
     * 
     * @param contextWords
     *        A list of context words. If none of these context words are found within the vicinity of the regular
     *        expression the data will not be detected as sensitive data.</p>
     *        <p>
     *        If no context words are passed only a regular expression is checked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomEntityType withContextWords(java.util.Collection<String> contextWords) {
        setContextWords(contextWords);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRegexString() != null)
            sb.append("RegexString: ").append(getRegexString()).append(",");
        if (getContextWords() != null)
            sb.append("ContextWords: ").append(getContextWords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomEntityType == false)
            return false;
        CustomEntityType other = (CustomEntityType) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRegexString() == null ^ this.getRegexString() == null)
            return false;
        if (other.getRegexString() != null && other.getRegexString().equals(this.getRegexString()) == false)
            return false;
        if (other.getContextWords() == null ^ this.getContextWords() == null)
            return false;
        if (other.getContextWords() != null && other.getContextWords().equals(this.getContextWords()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRegexString() == null) ? 0 : getRegexString().hashCode());
        hashCode = prime * hashCode + ((getContextWords() == null) ? 0 : getContextWords().hashCode());
        return hashCode;
    }

    @Override
    public CustomEntityType clone() {
        try {
            return (CustomEntityType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.CustomEntityTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
