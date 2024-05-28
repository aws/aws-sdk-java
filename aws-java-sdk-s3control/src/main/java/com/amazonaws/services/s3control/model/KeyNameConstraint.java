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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * If provided, the generated manifest includes only source bucket objects whose object keys match the string
 * constraints specified for <code>MatchAnyPrefix</code>, <code>MatchAnySuffix</code>, and
 * <code>MatchAnySubstring</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/KeyNameConstraint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KeyNameConstraint implements Serializable, Cloneable {

    /**
     * <p>
     * If provided, the generated manifest includes objects where the specified string appears at the start of the
     * object key string.
     * </p>
     */
    private java.util.List<String> matchAnyPrefix;
    /**
     * <p>
     * If provided, the generated manifest includes objects where the specified string appears at the end of the object
     * key string.
     * </p>
     */
    private java.util.List<String> matchAnySuffix;
    /**
     * <p>
     * If provided, the generated manifest includes objects where the specified string appears anywhere within the
     * object key string.
     * </p>
     */
    private java.util.List<String> matchAnySubstring;

    /**
     * <p>
     * If provided, the generated manifest includes objects where the specified string appears at the start of the
     * object key string.
     * </p>
     * 
     * @return If provided, the generated manifest includes objects where the specified string appears at the start of
     *         the object key string.
     */

    public java.util.List<String> getMatchAnyPrefix() {
        return matchAnyPrefix;
    }

    /**
     * <p>
     * If provided, the generated manifest includes objects where the specified string appears at the start of the
     * object key string.
     * </p>
     * 
     * @param matchAnyPrefix
     *        If provided, the generated manifest includes objects where the specified string appears at the start of
     *        the object key string.
     */

    public void setMatchAnyPrefix(java.util.Collection<String> matchAnyPrefix) {
        if (matchAnyPrefix == null) {
            this.matchAnyPrefix = null;
            return;
        }

        this.matchAnyPrefix = new java.util.ArrayList<String>(matchAnyPrefix);
    }

    /**
     * <p>
     * If provided, the generated manifest includes objects where the specified string appears at the start of the
     * object key string.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMatchAnyPrefix(java.util.Collection)} or {@link #withMatchAnyPrefix(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param matchAnyPrefix
     *        If provided, the generated manifest includes objects where the specified string appears at the start of
     *        the object key string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyNameConstraint withMatchAnyPrefix(String... matchAnyPrefix) {
        if (this.matchAnyPrefix == null) {
            setMatchAnyPrefix(new java.util.ArrayList<String>(matchAnyPrefix.length));
        }
        for (String ele : matchAnyPrefix) {
            this.matchAnyPrefix.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If provided, the generated manifest includes objects where the specified string appears at the start of the
     * object key string.
     * </p>
     * 
     * @param matchAnyPrefix
     *        If provided, the generated manifest includes objects where the specified string appears at the start of
     *        the object key string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyNameConstraint withMatchAnyPrefix(java.util.Collection<String> matchAnyPrefix) {
        setMatchAnyPrefix(matchAnyPrefix);
        return this;
    }

    /**
     * <p>
     * If provided, the generated manifest includes objects where the specified string appears at the end of the object
     * key string.
     * </p>
     * 
     * @return If provided, the generated manifest includes objects where the specified string appears at the end of the
     *         object key string.
     */

    public java.util.List<String> getMatchAnySuffix() {
        return matchAnySuffix;
    }

    /**
     * <p>
     * If provided, the generated manifest includes objects where the specified string appears at the end of the object
     * key string.
     * </p>
     * 
     * @param matchAnySuffix
     *        If provided, the generated manifest includes objects where the specified string appears at the end of the
     *        object key string.
     */

    public void setMatchAnySuffix(java.util.Collection<String> matchAnySuffix) {
        if (matchAnySuffix == null) {
            this.matchAnySuffix = null;
            return;
        }

        this.matchAnySuffix = new java.util.ArrayList<String>(matchAnySuffix);
    }

    /**
     * <p>
     * If provided, the generated manifest includes objects where the specified string appears at the end of the object
     * key string.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMatchAnySuffix(java.util.Collection)} or {@link #withMatchAnySuffix(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param matchAnySuffix
     *        If provided, the generated manifest includes objects where the specified string appears at the end of the
     *        object key string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyNameConstraint withMatchAnySuffix(String... matchAnySuffix) {
        if (this.matchAnySuffix == null) {
            setMatchAnySuffix(new java.util.ArrayList<String>(matchAnySuffix.length));
        }
        for (String ele : matchAnySuffix) {
            this.matchAnySuffix.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If provided, the generated manifest includes objects where the specified string appears at the end of the object
     * key string.
     * </p>
     * 
     * @param matchAnySuffix
     *        If provided, the generated manifest includes objects where the specified string appears at the end of the
     *        object key string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyNameConstraint withMatchAnySuffix(java.util.Collection<String> matchAnySuffix) {
        setMatchAnySuffix(matchAnySuffix);
        return this;
    }

    /**
     * <p>
     * If provided, the generated manifest includes objects where the specified string appears anywhere within the
     * object key string.
     * </p>
     * 
     * @return If provided, the generated manifest includes objects where the specified string appears anywhere within
     *         the object key string.
     */

    public java.util.List<String> getMatchAnySubstring() {
        return matchAnySubstring;
    }

    /**
     * <p>
     * If provided, the generated manifest includes objects where the specified string appears anywhere within the
     * object key string.
     * </p>
     * 
     * @param matchAnySubstring
     *        If provided, the generated manifest includes objects where the specified string appears anywhere within
     *        the object key string.
     */

    public void setMatchAnySubstring(java.util.Collection<String> matchAnySubstring) {
        if (matchAnySubstring == null) {
            this.matchAnySubstring = null;
            return;
        }

        this.matchAnySubstring = new java.util.ArrayList<String>(matchAnySubstring);
    }

    /**
     * <p>
     * If provided, the generated manifest includes objects where the specified string appears anywhere within the
     * object key string.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMatchAnySubstring(java.util.Collection)} or {@link #withMatchAnySubstring(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param matchAnySubstring
     *        If provided, the generated manifest includes objects where the specified string appears anywhere within
     *        the object key string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyNameConstraint withMatchAnySubstring(String... matchAnySubstring) {
        if (this.matchAnySubstring == null) {
            setMatchAnySubstring(new java.util.ArrayList<String>(matchAnySubstring.length));
        }
        for (String ele : matchAnySubstring) {
            this.matchAnySubstring.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If provided, the generated manifest includes objects where the specified string appears anywhere within the
     * object key string.
     * </p>
     * 
     * @param matchAnySubstring
     *        If provided, the generated manifest includes objects where the specified string appears anywhere within
     *        the object key string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyNameConstraint withMatchAnySubstring(java.util.Collection<String> matchAnySubstring) {
        setMatchAnySubstring(matchAnySubstring);
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
        if (getMatchAnyPrefix() != null)
            sb.append("MatchAnyPrefix: ").append(getMatchAnyPrefix()).append(",");
        if (getMatchAnySuffix() != null)
            sb.append("MatchAnySuffix: ").append(getMatchAnySuffix()).append(",");
        if (getMatchAnySubstring() != null)
            sb.append("MatchAnySubstring: ").append(getMatchAnySubstring());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KeyNameConstraint == false)
            return false;
        KeyNameConstraint other = (KeyNameConstraint) obj;
        if (other.getMatchAnyPrefix() == null ^ this.getMatchAnyPrefix() == null)
            return false;
        if (other.getMatchAnyPrefix() != null && other.getMatchAnyPrefix().equals(this.getMatchAnyPrefix()) == false)
            return false;
        if (other.getMatchAnySuffix() == null ^ this.getMatchAnySuffix() == null)
            return false;
        if (other.getMatchAnySuffix() != null && other.getMatchAnySuffix().equals(this.getMatchAnySuffix()) == false)
            return false;
        if (other.getMatchAnySubstring() == null ^ this.getMatchAnySubstring() == null)
            return false;
        if (other.getMatchAnySubstring() != null && other.getMatchAnySubstring().equals(this.getMatchAnySubstring()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMatchAnyPrefix() == null) ? 0 : getMatchAnyPrefix().hashCode());
        hashCode = prime * hashCode + ((getMatchAnySuffix() == null) ? 0 : getMatchAnySuffix().hashCode());
        hashCode = prime * hashCode + ((getMatchAnySubstring() == null) ? 0 : getMatchAnySubstring().hashCode());
        return hashCode;
    }

    @Override
    public KeyNameConstraint clone() {
        try {
            return (KeyNameConstraint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
