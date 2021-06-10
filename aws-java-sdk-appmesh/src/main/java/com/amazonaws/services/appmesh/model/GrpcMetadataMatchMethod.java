/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * An object representing the method header to be matched.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/GrpcMetadataMatchMethod" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GrpcMetadataMatchMethod implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The exact method header to be matched on.
     * </p>
     */
    private String exact;
    /**
     * <p>
     * The specified beginning characters of the method header to be matched on.
     * </p>
     */
    private String prefix;

    private MatchRange range;
    /**
     * <p>
     * The regex used to match the method header.
     * </p>
     */
    private String regex;
    /**
     * <p>
     * The specified ending characters of the method header to match on.
     * </p>
     */
    private String suffix;

    /**
     * <p>
     * The exact method header to be matched on.
     * </p>
     * 
     * @param exact
     *        The exact method header to be matched on.
     */

    public void setExact(String exact) {
        this.exact = exact;
    }

    /**
     * <p>
     * The exact method header to be matched on.
     * </p>
     * 
     * @return The exact method header to be matched on.
     */

    public String getExact() {
        return this.exact;
    }

    /**
     * <p>
     * The exact method header to be matched on.
     * </p>
     * 
     * @param exact
     *        The exact method header to be matched on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrpcMetadataMatchMethod withExact(String exact) {
        setExact(exact);
        return this;
    }

    /**
     * <p>
     * The specified beginning characters of the method header to be matched on.
     * </p>
     * 
     * @param prefix
     *        The specified beginning characters of the method header to be matched on.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The specified beginning characters of the method header to be matched on.
     * </p>
     * 
     * @return The specified beginning characters of the method header to be matched on.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * The specified beginning characters of the method header to be matched on.
     * </p>
     * 
     * @param prefix
     *        The specified beginning characters of the method header to be matched on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrpcMetadataMatchMethod withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * @param range
     */

    public void setRange(MatchRange range) {
        this.range = range;
    }

    /**
     * @return
     */

    public MatchRange getRange() {
        return this.range;
    }

    /**
     * @param range
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrpcMetadataMatchMethod withRange(MatchRange range) {
        setRange(range);
        return this;
    }

    /**
     * <p>
     * The regex used to match the method header.
     * </p>
     * 
     * @param regex
     *        The regex used to match the method header.
     */

    public void setRegex(String regex) {
        this.regex = regex;
    }

    /**
     * <p>
     * The regex used to match the method header.
     * </p>
     * 
     * @return The regex used to match the method header.
     */

    public String getRegex() {
        return this.regex;
    }

    /**
     * <p>
     * The regex used to match the method header.
     * </p>
     * 
     * @param regex
     *        The regex used to match the method header.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrpcMetadataMatchMethod withRegex(String regex) {
        setRegex(regex);
        return this;
    }

    /**
     * <p>
     * The specified ending characters of the method header to match on.
     * </p>
     * 
     * @param suffix
     *        The specified ending characters of the method header to match on.
     */

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    /**
     * <p>
     * The specified ending characters of the method header to match on.
     * </p>
     * 
     * @return The specified ending characters of the method header to match on.
     */

    public String getSuffix() {
        return this.suffix;
    }

    /**
     * <p>
     * The specified ending characters of the method header to match on.
     * </p>
     * 
     * @param suffix
     *        The specified ending characters of the method header to match on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrpcMetadataMatchMethod withSuffix(String suffix) {
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

        if (obj instanceof GrpcMetadataMatchMethod == false)
            return false;
        GrpcMetadataMatchMethod other = (GrpcMetadataMatchMethod) obj;
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
    public GrpcMetadataMatchMethod clone() {
        try {
            return (GrpcMetadataMatchMethod) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.GrpcMetadataMatchMethodMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
