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
 * A logical operator that allows multiple filter conditions to be joined for more complex comparisons of Storage Lens
 * group data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/StorageLensGroupAndOperator"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StorageLensGroupAndOperator implements Serializable, Cloneable {

    /**
     * <p>
     * Contains a list of prefixes. At least one prefix must be specified. Up to 10 prefixes are allowed.
     * </p>
     */
    private java.util.List<String> matchAnyPrefix;
    /**
     * <p>
     * Contains a list of suffixes. At least one suffix must be specified. Up to 10 suffixes are allowed.
     * </p>
     */
    private java.util.List<String> matchAnySuffix;
    /**
     * <p>
     * Contains the list of object tags. At least one object tag must be specified. Up to 10 object tags are allowed.
     * </p>
     */
    private java.util.List<S3Tag> matchAnyTag;
    /**
     * <p>
     * Contains <code>DaysGreaterThan</code> and <code>DaysLessThan</code> to define the object age range (minimum and
     * maximum number of days).
     * </p>
     */
    private MatchObjectAge matchObjectAge;
    /**
     * <p>
     * Contains <code>BytesGreaterThan</code> and <code>BytesLessThan</code> to define the object size range (minimum
     * and maximum number of Bytes).
     * </p>
     */
    private MatchObjectSize matchObjectSize;

    /**
     * <p>
     * Contains a list of prefixes. At least one prefix must be specified. Up to 10 prefixes are allowed.
     * </p>
     * 
     * @return Contains a list of prefixes. At least one prefix must be specified. Up to 10 prefixes are allowed.
     */

    public java.util.List<String> getMatchAnyPrefix() {
        return matchAnyPrefix;
    }

    /**
     * <p>
     * Contains a list of prefixes. At least one prefix must be specified. Up to 10 prefixes are allowed.
     * </p>
     * 
     * @param matchAnyPrefix
     *        Contains a list of prefixes. At least one prefix must be specified. Up to 10 prefixes are allowed.
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
     * Contains a list of prefixes. At least one prefix must be specified. Up to 10 prefixes are allowed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMatchAnyPrefix(java.util.Collection)} or {@link #withMatchAnyPrefix(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param matchAnyPrefix
     *        Contains a list of prefixes. At least one prefix must be specified. Up to 10 prefixes are allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLensGroupAndOperator withMatchAnyPrefix(String... matchAnyPrefix) {
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
     * Contains a list of prefixes. At least one prefix must be specified. Up to 10 prefixes are allowed.
     * </p>
     * 
     * @param matchAnyPrefix
     *        Contains a list of prefixes. At least one prefix must be specified. Up to 10 prefixes are allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLensGroupAndOperator withMatchAnyPrefix(java.util.Collection<String> matchAnyPrefix) {
        setMatchAnyPrefix(matchAnyPrefix);
        return this;
    }

    /**
     * <p>
     * Contains a list of suffixes. At least one suffix must be specified. Up to 10 suffixes are allowed.
     * </p>
     * 
     * @return Contains a list of suffixes. At least one suffix must be specified. Up to 10 suffixes are allowed.
     */

    public java.util.List<String> getMatchAnySuffix() {
        return matchAnySuffix;
    }

    /**
     * <p>
     * Contains a list of suffixes. At least one suffix must be specified. Up to 10 suffixes are allowed.
     * </p>
     * 
     * @param matchAnySuffix
     *        Contains a list of suffixes. At least one suffix must be specified. Up to 10 suffixes are allowed.
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
     * Contains a list of suffixes. At least one suffix must be specified. Up to 10 suffixes are allowed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMatchAnySuffix(java.util.Collection)} or {@link #withMatchAnySuffix(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param matchAnySuffix
     *        Contains a list of suffixes. At least one suffix must be specified. Up to 10 suffixes are allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLensGroupAndOperator withMatchAnySuffix(String... matchAnySuffix) {
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
     * Contains a list of suffixes. At least one suffix must be specified. Up to 10 suffixes are allowed.
     * </p>
     * 
     * @param matchAnySuffix
     *        Contains a list of suffixes. At least one suffix must be specified. Up to 10 suffixes are allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLensGroupAndOperator withMatchAnySuffix(java.util.Collection<String> matchAnySuffix) {
        setMatchAnySuffix(matchAnySuffix);
        return this;
    }

    /**
     * <p>
     * Contains the list of object tags. At least one object tag must be specified. Up to 10 object tags are allowed.
     * </p>
     * 
     * @return Contains the list of object tags. At least one object tag must be specified. Up to 10 object tags are
     *         allowed.
     */

    public java.util.List<S3Tag> getMatchAnyTag() {
        return matchAnyTag;
    }

    /**
     * <p>
     * Contains the list of object tags. At least one object tag must be specified. Up to 10 object tags are allowed.
     * </p>
     * 
     * @param matchAnyTag
     *        Contains the list of object tags. At least one object tag must be specified. Up to 10 object tags are
     *        allowed.
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
     * Contains the list of object tags. At least one object tag must be specified. Up to 10 object tags are allowed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMatchAnyTag(java.util.Collection)} or {@link #withMatchAnyTag(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param matchAnyTag
     *        Contains the list of object tags. At least one object tag must be specified. Up to 10 object tags are
     *        allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLensGroupAndOperator withMatchAnyTag(S3Tag... matchAnyTag) {
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
     * Contains the list of object tags. At least one object tag must be specified. Up to 10 object tags are allowed.
     * </p>
     * 
     * @param matchAnyTag
     *        Contains the list of object tags. At least one object tag must be specified. Up to 10 object tags are
     *        allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLensGroupAndOperator withMatchAnyTag(java.util.Collection<S3Tag> matchAnyTag) {
        setMatchAnyTag(matchAnyTag);
        return this;
    }

    /**
     * <p>
     * Contains <code>DaysGreaterThan</code> and <code>DaysLessThan</code> to define the object age range (minimum and
     * maximum number of days).
     * </p>
     * 
     * @param matchObjectAge
     *        Contains <code>DaysGreaterThan</code> and <code>DaysLessThan</code> to define the object age range
     *        (minimum and maximum number of days).
     */

    public void setMatchObjectAge(MatchObjectAge matchObjectAge) {
        this.matchObjectAge = matchObjectAge;
    }

    /**
     * <p>
     * Contains <code>DaysGreaterThan</code> and <code>DaysLessThan</code> to define the object age range (minimum and
     * maximum number of days).
     * </p>
     * 
     * @return Contains <code>DaysGreaterThan</code> and <code>DaysLessThan</code> to define the object age range
     *         (minimum and maximum number of days).
     */

    public MatchObjectAge getMatchObjectAge() {
        return this.matchObjectAge;
    }

    /**
     * <p>
     * Contains <code>DaysGreaterThan</code> and <code>DaysLessThan</code> to define the object age range (minimum and
     * maximum number of days).
     * </p>
     * 
     * @param matchObjectAge
     *        Contains <code>DaysGreaterThan</code> and <code>DaysLessThan</code> to define the object age range
     *        (minimum and maximum number of days).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLensGroupAndOperator withMatchObjectAge(MatchObjectAge matchObjectAge) {
        setMatchObjectAge(matchObjectAge);
        return this;
    }

    /**
     * <p>
     * Contains <code>BytesGreaterThan</code> and <code>BytesLessThan</code> to define the object size range (minimum
     * and maximum number of Bytes).
     * </p>
     * 
     * @param matchObjectSize
     *        Contains <code>BytesGreaterThan</code> and <code>BytesLessThan</code> to define the object size range
     *        (minimum and maximum number of Bytes).
     */

    public void setMatchObjectSize(MatchObjectSize matchObjectSize) {
        this.matchObjectSize = matchObjectSize;
    }

    /**
     * <p>
     * Contains <code>BytesGreaterThan</code> and <code>BytesLessThan</code> to define the object size range (minimum
     * and maximum number of Bytes).
     * </p>
     * 
     * @return Contains <code>BytesGreaterThan</code> and <code>BytesLessThan</code> to define the object size range
     *         (minimum and maximum number of Bytes).
     */

    public MatchObjectSize getMatchObjectSize() {
        return this.matchObjectSize;
    }

    /**
     * <p>
     * Contains <code>BytesGreaterThan</code> and <code>BytesLessThan</code> to define the object size range (minimum
     * and maximum number of Bytes).
     * </p>
     * 
     * @param matchObjectSize
     *        Contains <code>BytesGreaterThan</code> and <code>BytesLessThan</code> to define the object size range
     *        (minimum and maximum number of Bytes).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLensGroupAndOperator withMatchObjectSize(MatchObjectSize matchObjectSize) {
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

        if (obj instanceof StorageLensGroupAndOperator == false)
            return false;
        StorageLensGroupAndOperator other = (StorageLensGroupAndOperator) obj;
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
    public StorageLensGroupAndOperator clone() {
        try {
            return (StorageLensGroupAndOperator) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
