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
 * A container element for specifying <code>Or</code> rule conditions. The rule conditions determine the subset of
 * objects to which the <code>Or</code> rule applies. Objects can match any of the listed filter conditions, which are
 * joined by the <code>Or</code> logical operator. Only one of each filter condition is allowed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/StorageLensGroupOrOperator"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StorageLensGroupOrOperator implements Serializable, Cloneable {

    /**
     * <p>
     * Filters objects that match any of the specified prefixes.
     * </p>
     */
    private java.util.List<String> matchAnyPrefix;
    /**
     * <p>
     * Filters objects that match any of the specified suffixes.
     * </p>
     */
    private java.util.List<String> matchAnySuffix;
    /**
     * <p>
     * Filters objects that match any of the specified S3 object tags.
     * </p>
     */
    private java.util.List<S3Tag> matchAnyTag;
    /**
     * <p>
     * Filters objects that match the specified object age range.
     * </p>
     */
    private MatchObjectAge matchObjectAge;
    /**
     * <p>
     * Filters objects that match the specified object size range.
     * </p>
     */
    private MatchObjectSize matchObjectSize;

    /**
     * <p>
     * Filters objects that match any of the specified prefixes.
     * </p>
     * 
     * @return Filters objects that match any of the specified prefixes.
     */

    public java.util.List<String> getMatchAnyPrefix() {
        return matchAnyPrefix;
    }

    /**
     * <p>
     * Filters objects that match any of the specified prefixes.
     * </p>
     * 
     * @param matchAnyPrefix
     *        Filters objects that match any of the specified prefixes.
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
     * Filters objects that match any of the specified prefixes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMatchAnyPrefix(java.util.Collection)} or {@link #withMatchAnyPrefix(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param matchAnyPrefix
     *        Filters objects that match any of the specified prefixes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLensGroupOrOperator withMatchAnyPrefix(String... matchAnyPrefix) {
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
     * Filters objects that match any of the specified prefixes.
     * </p>
     * 
     * @param matchAnyPrefix
     *        Filters objects that match any of the specified prefixes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLensGroupOrOperator withMatchAnyPrefix(java.util.Collection<String> matchAnyPrefix) {
        setMatchAnyPrefix(matchAnyPrefix);
        return this;
    }

    /**
     * <p>
     * Filters objects that match any of the specified suffixes.
     * </p>
     * 
     * @return Filters objects that match any of the specified suffixes.
     */

    public java.util.List<String> getMatchAnySuffix() {
        return matchAnySuffix;
    }

    /**
     * <p>
     * Filters objects that match any of the specified suffixes.
     * </p>
     * 
     * @param matchAnySuffix
     *        Filters objects that match any of the specified suffixes.
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
     * Filters objects that match any of the specified suffixes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMatchAnySuffix(java.util.Collection)} or {@link #withMatchAnySuffix(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param matchAnySuffix
     *        Filters objects that match any of the specified suffixes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLensGroupOrOperator withMatchAnySuffix(String... matchAnySuffix) {
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
     * Filters objects that match any of the specified suffixes.
     * </p>
     * 
     * @param matchAnySuffix
     *        Filters objects that match any of the specified suffixes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLensGroupOrOperator withMatchAnySuffix(java.util.Collection<String> matchAnySuffix) {
        setMatchAnySuffix(matchAnySuffix);
        return this;
    }

    /**
     * <p>
     * Filters objects that match any of the specified S3 object tags.
     * </p>
     * 
     * @return Filters objects that match any of the specified S3 object tags.
     */

    public java.util.List<S3Tag> getMatchAnyTag() {
        return matchAnyTag;
    }

    /**
     * <p>
     * Filters objects that match any of the specified S3 object tags.
     * </p>
     * 
     * @param matchAnyTag
     *        Filters objects that match any of the specified S3 object tags.
     */

    public void setMatchAnyTag(java.util.Collection<S3Tag> matchAnyTag) {
        if (matchAnyTag == null) {
            this.matchAnyTag = null;
            return;
        }

        this.matchAnyTag = new java.util.ArrayList<S3Tag>(matchAnyTag);
    }

    /**
     * <p>
     * Filters objects that match any of the specified S3 object tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMatchAnyTag(java.util.Collection)} or {@link #withMatchAnyTag(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param matchAnyTag
     *        Filters objects that match any of the specified S3 object tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLensGroupOrOperator withMatchAnyTag(S3Tag... matchAnyTag) {
        if (this.matchAnyTag == null) {
            setMatchAnyTag(new java.util.ArrayList<S3Tag>(matchAnyTag.length));
        }
        for (S3Tag ele : matchAnyTag) {
            this.matchAnyTag.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters objects that match any of the specified S3 object tags.
     * </p>
     * 
     * @param matchAnyTag
     *        Filters objects that match any of the specified S3 object tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLensGroupOrOperator withMatchAnyTag(java.util.Collection<S3Tag> matchAnyTag) {
        setMatchAnyTag(matchAnyTag);
        return this;
    }

    /**
     * <p>
     * Filters objects that match the specified object age range.
     * </p>
     * 
     * @param matchObjectAge
     *        Filters objects that match the specified object age range.
     */

    public void setMatchObjectAge(MatchObjectAge matchObjectAge) {
        this.matchObjectAge = matchObjectAge;
    }

    /**
     * <p>
     * Filters objects that match the specified object age range.
     * </p>
     * 
     * @return Filters objects that match the specified object age range.
     */

    public MatchObjectAge getMatchObjectAge() {
        return this.matchObjectAge;
    }

    /**
     * <p>
     * Filters objects that match the specified object age range.
     * </p>
     * 
     * @param matchObjectAge
     *        Filters objects that match the specified object age range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLensGroupOrOperator withMatchObjectAge(MatchObjectAge matchObjectAge) {
        setMatchObjectAge(matchObjectAge);
        return this;
    }

    /**
     * <p>
     * Filters objects that match the specified object size range.
     * </p>
     * 
     * @param matchObjectSize
     *        Filters objects that match the specified object size range.
     */

    public void setMatchObjectSize(MatchObjectSize matchObjectSize) {
        this.matchObjectSize = matchObjectSize;
    }

    /**
     * <p>
     * Filters objects that match the specified object size range.
     * </p>
     * 
     * @return Filters objects that match the specified object size range.
     */

    public MatchObjectSize getMatchObjectSize() {
        return this.matchObjectSize;
    }

    /**
     * <p>
     * Filters objects that match the specified object size range.
     * </p>
     * 
     * @param matchObjectSize
     *        Filters objects that match the specified object size range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLensGroupOrOperator withMatchObjectSize(MatchObjectSize matchObjectSize) {
        setMatchObjectSize(matchObjectSize);
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
        if (getMatchAnyTag() != null)
            sb.append("MatchAnyTag: ").append(getMatchAnyTag()).append(",");
        if (getMatchObjectAge() != null)
            sb.append("MatchObjectAge: ").append(getMatchObjectAge()).append(",");
        if (getMatchObjectSize() != null)
            sb.append("MatchObjectSize: ").append(getMatchObjectSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StorageLensGroupOrOperator == false)
            return false;
        StorageLensGroupOrOperator other = (StorageLensGroupOrOperator) obj;
        if (other.getMatchAnyPrefix() == null ^ this.getMatchAnyPrefix() == null)
            return false;
        if (other.getMatchAnyPrefix() != null && other.getMatchAnyPrefix().equals(this.getMatchAnyPrefix()) == false)
            return false;
        if (other.getMatchAnySuffix() == null ^ this.getMatchAnySuffix() == null)
            return false;
        if (other.getMatchAnySuffix() != null && other.getMatchAnySuffix().equals(this.getMatchAnySuffix()) == false)
            return false;
        if (other.getMatchAnyTag() == null ^ this.getMatchAnyTag() == null)
            return false;
        if (other.getMatchAnyTag() != null && other.getMatchAnyTag().equals(this.getMatchAnyTag()) == false)
            return false;
        if (other.getMatchObjectAge() == null ^ this.getMatchObjectAge() == null)
            return false;
        if (other.getMatchObjectAge() != null && other.getMatchObjectAge().equals(this.getMatchObjectAge()) == false)
            return false;
        if (other.getMatchObjectSize() == null ^ this.getMatchObjectSize() == null)
            return false;
        if (other.getMatchObjectSize() != null && other.getMatchObjectSize().equals(this.getMatchObjectSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMatchAnyPrefix() == null) ? 0 : getMatchAnyPrefix().hashCode());
        hashCode = prime * hashCode + ((getMatchAnySuffix() == null) ? 0 : getMatchAnySuffix().hashCode());
        hashCode = prime * hashCode + ((getMatchAnyTag() == null) ? 0 : getMatchAnyTag().hashCode());
        hashCode = prime * hashCode + ((getMatchObjectAge() == null) ? 0 : getMatchObjectAge().hashCode());
        hashCode = prime * hashCode + ((getMatchObjectSize() == null) ? 0 : getMatchObjectSize().hashCode());
        return hashCode;
    }

    @Override
    public StorageLensGroupOrOperator clone() {
        try {
            return (StorageLensGroupOrOperator) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
