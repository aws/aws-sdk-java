/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents the method and value to match with the header value sent in a request. Specify one match
 * method.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/HeaderMatchMethod" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HeaderMatchMethod implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value sent by the client must match the specified value exactly.
     * </p>
     */
    private String exact;
    /**
     * <p>
     * The value sent by the client must begin with the specified characters.
     * </p>
     */
    private String prefix;
    /**
     * <p>
     * An object that represents the range of values to match on.
     * </p>
     */
    private MatchRange range;
    /**
     * <p>
     * The value sent by the client must include the specified characters.
     * </p>
     */
    private String regex;
    /**
     * <p>
     * The value sent by the client must end with the specified characters.
     * </p>
     */
    private String suffix;

    /**
     * <p>
     * The value sent by the client must match the specified value exactly.
     * </p>
     * 
     * @param exact
     *        The value sent by the client must match the specified value exactly.
     */

    public void setExact(String exact) {
        this.exact = exact;
    }

    /**
     * <p>
     * The value sent by the client must match the specified value exactly.
     * </p>
     * 
     * @return The value sent by the client must match the specified value exactly.
     */

    public String getExact() {
        return this.exact;
    }

    /**
     * <p>
     * The value sent by the client must match the specified value exactly.
     * </p>
     * 
     * @param exact
     *        The value sent by the client must match the specified value exactly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HeaderMatchMethod withExact(String exact) {
        setExact(exact);
        return this;
    }

    /**
     * <p>
     * The value sent by the client must begin with the specified characters.
     * </p>
     * 
     * @param prefix
     *        The value sent by the client must begin with the specified characters.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The value sent by the client must begin with the specified characters.
     * </p>
     * 
     * @return The value sent by the client must begin with the specified characters.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * The value sent by the client must begin with the specified characters.
     * </p>
     * 
     * @param prefix
     *        The value sent by the client must begin with the specified characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HeaderMatchMethod withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * <p>
     * An object that represents the range of values to match on.
     * </p>
     * 
     * @param range
     *        An object that represents the range of values to match on.
     */

    public void setRange(MatchRange range) {
        this.range = range;
    }

    /**
     * <p>
     * An object that represents the range of values to match on.
     * </p>
     * 
     * @return An object that represents the range of values to match on.
     */

    public MatchRange getRange() {
        return this.range;
    }

    /**
     * <p>
     * An object that represents the range of values to match on.
     * </p>
     * 
     * @param range
     *        An object that represents the range of values to match on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HeaderMatchMethod withRange(MatchRange range) {
        setRange(range);
        return this;
    }

    /**
     * <p>
     * The value sent by the client must include the specified characters.
     * </p>
     * 
     * @param regex
     *        The value sent by the client must include the specified characters.
     */

    public void setRegex(String regex) {
        this.regex = regex;
    }

    /**
     * <p>
     * The value sent by the client must include the specified characters.
     * </p>
     * 
     * @return The value sent by the client must include the specified characters.
     */

    public String getRegex() {
        return this.regex;
    }

    /**
     * <p>
     * The value sent by the client must include the specified characters.
     * </p>
     * 
     * @param regex
     *        The value sent by the client must include the specified characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HeaderMatchMethod withRegex(String regex) {
        setRegex(regex);
        return this;
    }

    /**
     * <p>
     * The value sent by the client must end with the specified characters.
     * </p>
     * 
     * @param suffix
     *        The value sent by the client must end with the specified characters.
     */

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    /**
     * <p>
     * The value sent by the client must end with the specified characters.
     * </p>
     * 
     * @return The value sent by the client must end with the specified characters.
     */

    public String getSuffix() {
        return this.suffix;
    }

    /**
     * <p>
     * The value sent by the client must end with the specified characters.
     * </p>
     * 
     * @param suffix
     *        The value sent by the client must end with the specified characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HeaderMatchMethod withSuffix(String suffix) {
        setSuffix(suffix);
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
        if (getExact() != null)
            sb.append("Exact: ").append(getExact()).append(",");
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix()).append(",");
        if (getRange() != null)
            sb.append("Range: ").append(getRange()).append(",");
        if (getRegex() != null)
            sb.append("Regex: ").append(getRegex()).append(",");
        if (getSuffix() != null)
            sb.append("Suffix: ").append(getSuffix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HeaderMatchMethod == false)
            return false;
        HeaderMatchMethod other = (HeaderMatchMethod) obj;
        if (other.getExact() == null ^ this.getExact() == null)
            return false;
        if (other.getExact() != null && other.getExact().equals(this.getExact()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getRange() == null ^ this.getRange() == null)
            return false;
        if (other.getRange() != null && other.getRange().equals(this.getRange()) == false)
            return false;
        if (other.getRegex() == null ^ this.getRegex() == null)
            return false;
        if (other.getRegex() != null && other.getRegex().equals(this.getRegex()) == false)
            return false;
        if (other.getSuffix() == null ^ this.getSuffix() == null)
            return false;
        if (other.getSuffix() != null && other.getSuffix().equals(this.getSuffix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExact() == null) ? 0 : getExact().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getRange() == null) ? 0 : getRange().hashCode());
        hashCode = prime * hashCode + ((getRegex() == null) ? 0 : getRegex().hashCode());
        hashCode = prime * hashCode + ((getSuffix() == null) ? 0 : getSuffix().hashCode());
        return hashCode;
    }

    @Override
    public HeaderMatchMethod clone() {
        try {
            return (HeaderMatchMethod) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.HeaderMatchMethodMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
