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
 * Describes the constraints for a header match. Matches incoming requests with rule based on request header value
 * before applying rule action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/HeaderMatch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HeaderMatch implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether the match is case sensitive.
     * </p>
     */
    private Boolean caseSensitive;
    /**
     * <p>
     * The header match type.
     * </p>
     */
    private HeaderMatchType match;
    /**
     * <p>
     * The name of the header.
     * </p>
     */
    private String name;

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

    public HeaderMatch withCaseSensitive(Boolean caseSensitive) {
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
     * The header match type.
     * </p>
     * 
     * @param match
     *        The header match type.
     */

    public void setMatch(HeaderMatchType match) {
        this.match = match;
    }

    /**
     * <p>
     * The header match type.
     * </p>
     * 
     * @return The header match type.
     */

    public HeaderMatchType getMatch() {
        return this.match;
    }

    /**
     * <p>
     * The header match type.
     * </p>
     * 
     * @param match
     *        The header match type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HeaderMatch withMatch(HeaderMatchType match) {
        setMatch(match);
        return this;
    }

    /**
     * <p>
     * The name of the header.
     * </p>
     * 
     * @param name
     *        The name of the header.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the header.
     * </p>
     * 
     * @return The name of the header.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the header.
     * </p>
     * 
     * @param name
     *        The name of the header.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HeaderMatch withName(String name) {
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
        if (getCaseSensitive() != null)
            sb.append("CaseSensitive: ").append(getCaseSensitive()).append(",");
        if (getMatch() != null)
            sb.append("Match: ").append(getMatch()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HeaderMatch == false)
            return false;
        HeaderMatch other = (HeaderMatch) obj;
        if (other.getCaseSensitive() == null ^ this.getCaseSensitive() == null)
            return false;
        if (other.getCaseSensitive() != null && other.getCaseSensitive().equals(this.getCaseSensitive()) == false)
            return false;
        if (other.getMatch() == null ^ this.getMatch() == null)
            return false;
        if (other.getMatch() != null && other.getMatch().equals(this.getMatch()) == false)
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

        hashCode = prime * hashCode + ((getCaseSensitive() == null) ? 0 : getCaseSensitive().hashCode());
        hashCode = prime * hashCode + ((getMatch() == null) ? 0 : getMatch().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public HeaderMatch clone() {
        try {
            return (HeaderMatch) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.vpclattice.model.transform.HeaderMatchMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
