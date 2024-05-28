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
 * Describes a rule match.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/RuleMatch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleMatch implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The HTTP criteria that a rule must match.
     * </p>
     */
    private HttpMatch httpMatch;

    /**
     * <p>
     * The HTTP criteria that a rule must match.
     * </p>
     * 
     * @param httpMatch
     *        The HTTP criteria that a rule must match.
     */

    public void setHttpMatch(HttpMatch httpMatch) {
        this.httpMatch = httpMatch;
    }

    /**
     * <p>
     * The HTTP criteria that a rule must match.
     * </p>
     * 
     * @return The HTTP criteria that a rule must match.
     */

    public HttpMatch getHttpMatch() {
        return this.httpMatch;
    }

    /**
     * <p>
     * The HTTP criteria that a rule must match.
     * </p>
     * 
     * @param httpMatch
     *        The HTTP criteria that a rule must match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleMatch withHttpMatch(HttpMatch httpMatch) {
        setHttpMatch(httpMatch);
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
        if (getHttpMatch() != null)
            sb.append("HttpMatch: ").append(getHttpMatch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleMatch == false)
            return false;
        RuleMatch other = (RuleMatch) obj;
        if (other.getHttpMatch() == null ^ this.getHttpMatch() == null)
            return false;
        if (other.getHttpMatch() != null && other.getHttpMatch().equals(this.getHttpMatch()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHttpMatch() == null) ? 0 : getHttpMatch().hashCode());
        return hashCode;
    }

    @Override
    public RuleMatch clone() {
        try {
            return (RuleMatch) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.vpclattice.model.transform.RuleMatchMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
