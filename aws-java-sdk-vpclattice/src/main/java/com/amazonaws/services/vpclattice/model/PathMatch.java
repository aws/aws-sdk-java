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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the conditions that can be applied when matching a path for incoming requests.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/PathMatch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PathMatch implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether the match is case sensitive.
     * </p>
     */
    private Boolean caseSensitive;
    /**
     * <p>
     * The type of path match.
     * </p>
     */
    private PathMatchType match;

    /**
     * <p>
     * Indicates whether the match is case sensitive.
     * </p>
     * 
     * @param caseSensitive
     *        Indicates whether the match is case sensitive.
     */

    public void setCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
    }

    /**
     * <p>
     * Indicates whether the match is case sensitive.
     * </p>
     * 
     * @return Indicates whether the match is case sensitive.
     */

    public Boolean getCaseSensitive() {
        return this.caseSensitive;
    }

    /**
     * <p>
     * Indicates whether the match is case sensitive.
     * </p>
     * 
     * @param caseSensitive
     *        Indicates whether the match is case sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathMatch withCaseSensitive(Boolean caseSensitive) {
        setCaseSensitive(caseSensitive);
        return this;
    }

    /**
     * <p>
     * Indicates whether the match is case sensitive.
     * </p>
     * 
     * @return Indicates whether the match is case sensitive.
     */

    public Boolean isCaseSensitive() {
        return this.caseSensitive;
    }

    /**
     * <p>
     * The type of path match.
     * </p>
     * 
     * @param match
     *        The type of path match.
     */

    public void setMatch(PathMatchType match) {
        this.match = match;
    }

    /**
     * <p>
     * The type of path match.
     * </p>
     * 
     * @return The type of path match.
     */

    public PathMatchType getMatch() {
        return this.match;
    }

    /**
     * <p>
     * The type of path match.
     * </p>
     * 
     * @param match
     *        The type of path match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PathMatch withMatch(PathMatchType match) {
        setMatch(match);
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
        if (getCaseSensitive() != null)
            sb.append("CaseSensitive: ").append(getCaseSensitive()).append(",");
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

        if (obj instanceof PathMatch == false)
            return false;
        PathMatch other = (PathMatch) obj;
        if (other.getCaseSensitive() == null ^ this.getCaseSensitive() == null)
            return false;
        if (other.getCaseSensitive() != null && other.getCaseSensitive().equals(this.getCaseSensitive()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getCaseSensitive() == null) ? 0 : getCaseSensitive().hashCode());
        hashCode = prime * hashCode + ((getMatch() == null) ? 0 : getMatch().hashCode());
        return hashCode;
    }

    @Override
    public PathMatch clone() {
        try {
            return (PathMatch) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.vpclattice.model.transform.PathMatchMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
