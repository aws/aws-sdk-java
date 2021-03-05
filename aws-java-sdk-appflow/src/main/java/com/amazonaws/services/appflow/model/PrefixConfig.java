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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Determines the prefix that Amazon AppFlow applies to the destination folder name. You can name your destination
 * folders according to the flow frequency and date.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/PrefixConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PrefixConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines the format of the prefix, and whether it applies to the file name, file path, or both.
     * </p>
     */
    private String prefixType;
    /**
     * <p>
     * Determines the level of granularity that's included in the prefix.
     * </p>
     */
    private String prefixFormat;

    /**
     * <p>
     * Determines the format of the prefix, and whether it applies to the file name, file path, or both.
     * </p>
     * 
     * @param prefixType
     *        Determines the format of the prefix, and whether it applies to the file name, file path, or both.
     * @see PrefixType
     */

    public void setPrefixType(String prefixType) {
        this.prefixType = prefixType;
    }

    /**
     * <p>
     * Determines the format of the prefix, and whether it applies to the file name, file path, or both.
     * </p>
     * 
     * @return Determines the format of the prefix, and whether it applies to the file name, file path, or both.
     * @see PrefixType
     */

    public String getPrefixType() {
        return this.prefixType;
    }

    /**
     * <p>
     * Determines the format of the prefix, and whether it applies to the file name, file path, or both.
     * </p>
     * 
     * @param prefixType
     *        Determines the format of the prefix, and whether it applies to the file name, file path, or both.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrefixType
     */

    public PrefixConfig withPrefixType(String prefixType) {
        setPrefixType(prefixType);
        return this;
    }

    /**
     * <p>
     * Determines the format of the prefix, and whether it applies to the file name, file path, or both.
     * </p>
     * 
     * @param prefixType
     *        Determines the format of the prefix, and whether it applies to the file name, file path, or both.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrefixType
     */

    public PrefixConfig withPrefixType(PrefixType prefixType) {
        this.prefixType = prefixType.toString();
        return this;
    }

    /**
     * <p>
     * Determines the level of granularity that's included in the prefix.
     * </p>
     * 
     * @param prefixFormat
     *        Determines the level of granularity that's included in the prefix.
     * @see PrefixFormat
     */

    public void setPrefixFormat(String prefixFormat) {
        this.prefixFormat = prefixFormat;
    }

    /**
     * <p>
     * Determines the level of granularity that's included in the prefix.
     * </p>
     * 
     * @return Determines the level of granularity that's included in the prefix.
     * @see PrefixFormat
     */

    public String getPrefixFormat() {
        return this.prefixFormat;
    }

    /**
     * <p>
     * Determines the level of granularity that's included in the prefix.
     * </p>
     * 
     * @param prefixFormat
     *        Determines the level of granularity that's included in the prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrefixFormat
     */

    public PrefixConfig withPrefixFormat(String prefixFormat) {
        setPrefixFormat(prefixFormat);
        return this;
    }

    /**
     * <p>
     * Determines the level of granularity that's included in the prefix.
     * </p>
     * 
     * @param prefixFormat
     *        Determines the level of granularity that's included in the prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrefixFormat
     */

    public PrefixConfig withPrefixFormat(PrefixFormat prefixFormat) {
        this.prefixFormat = prefixFormat.toString();
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
        if (getPrefixType() != null)
            sb.append("PrefixType: ").append(getPrefixType()).append(",");
        if (getPrefixFormat() != null)
            sb.append("PrefixFormat: ").append(getPrefixFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PrefixConfig == false)
            return false;
        PrefixConfig other = (PrefixConfig) obj;
        if (other.getPrefixType() == null ^ this.getPrefixType() == null)
            return false;
        if (other.getPrefixType() != null && other.getPrefixType().equals(this.getPrefixType()) == false)
            return false;
        if (other.getPrefixFormat() == null ^ this.getPrefixFormat() == null)
            return false;
        if (other.getPrefixFormat() != null && other.getPrefixFormat().equals(this.getPrefixFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrefixType() == null) ? 0 : getPrefixType().hashCode());
        hashCode = prime * hashCode + ((getPrefixFormat() == null) ? 0 : getPrefixFormat().hashCode());
        return hashCode;
    }

    @Override
    public PrefixConfig clone() {
        try {
            return (PrefixConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.PrefixConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
