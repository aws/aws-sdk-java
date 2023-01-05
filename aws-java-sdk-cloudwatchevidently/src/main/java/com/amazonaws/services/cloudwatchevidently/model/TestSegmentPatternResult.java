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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/TestSegmentPattern" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestSegmentPatternResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns <code>true</code> if the pattern matches the payload.
     * </p>
     */
    private Boolean match;

    /**
     * <p>
     * Returns <code>true</code> if the pattern matches the payload.
     * </p>
     * 
     * @param match
     *        Returns <code>true</code> if the pattern matches the payload.
     */

    public void setMatch(Boolean match) {
        this.match = match;
    }

    /**
     * <p>
     * Returns <code>true</code> if the pattern matches the payload.
     * </p>
     * 
     * @return Returns <code>true</code> if the pattern matches the payload.
     */

    public Boolean getMatch() {
        return this.match;
    }

    /**
     * <p>
     * Returns <code>true</code> if the pattern matches the payload.
     * </p>
     * 
     * @param match
     *        Returns <code>true</code> if the pattern matches the payload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestSegmentPatternResult withMatch(Boolean match) {
        setMatch(match);
        return this;
    }

    /**
     * <p>
     * Returns <code>true</code> if the pattern matches the payload.
     * </p>
     * 
     * @return Returns <code>true</code> if the pattern matches the payload.
     */

    public Boolean isMatch() {
        return this.match;
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
        if (getMatch() != null)
            sb.append("Match: ").append(getMatch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestSegmentPatternResult == false)
            return false;
        TestSegmentPatternResult other = (TestSegmentPatternResult) obj;
        if (other.getMatch() == null ^ this.getMatch() == null)
            return false;
        if (other.getMatch() != null && other.getMatch().equals(this.getMatch()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMatch() == null) ? 0 : getMatch().hashCode());
        return hashCode;
    }

    @Override
    public TestSegmentPatternResult clone() {
        try {
            return (TestSegmentPatternResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
