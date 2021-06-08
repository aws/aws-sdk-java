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
 * The connector metadata specific to Snowflake.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/SnowflakeMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnowflakeMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the supported AWS Regions when using Snowflake.
     * </p>
     */
    private java.util.List<String> supportedRegions;

    /**
     * <p>
     * Specifies the supported AWS Regions when using Snowflake.
     * </p>
     * 
     * @return Specifies the supported AWS Regions when using Snowflake.
     */

    public java.util.List<String> getSupportedRegions() {
        return supportedRegions;
    }

    /**
     * <p>
     * Specifies the supported AWS Regions when using Snowflake.
     * </p>
     * 
     * @param supportedRegions
     *        Specifies the supported AWS Regions when using Snowflake.
     */

    public void setSupportedRegions(java.util.Collection<String> supportedRegions) {
        if (supportedRegions == null) {
            this.supportedRegions = null;
            return;
        }

        this.supportedRegions = new java.util.ArrayList<String>(supportedRegions);
    }

    /**
     * <p>
     * Specifies the supported AWS Regions when using Snowflake.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedRegions(java.util.Collection)} or {@link #withSupportedRegions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param supportedRegions
     *        Specifies the supported AWS Regions when using Snowflake.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeMetadata withSupportedRegions(String... supportedRegions) {
        if (this.supportedRegions == null) {
            setSupportedRegions(new java.util.ArrayList<String>(supportedRegions.length));
        }
        for (String ele : supportedRegions) {
            this.supportedRegions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the supported AWS Regions when using Snowflake.
     * </p>
     * 
     * @param supportedRegions
     *        Specifies the supported AWS Regions when using Snowflake.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeMetadata withSupportedRegions(java.util.Collection<String> supportedRegions) {
        setSupportedRegions(supportedRegions);
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
        if (getSupportedRegions() != null)
            sb.append("SupportedRegions: ").append(getSupportedRegions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnowflakeMetadata == false)
            return false;
        SnowflakeMetadata other = (SnowflakeMetadata) obj;
        if (other.getSupportedRegions() == null ^ this.getSupportedRegions() == null)
            return false;
        if (other.getSupportedRegions() != null && other.getSupportedRegions().equals(this.getSupportedRegions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSupportedRegions() == null) ? 0 : getSupportedRegions().hashCode());
        return hashCode;
    }

    @Override
    public SnowflakeMetadata clone() {
        try {
            return (SnowflakeMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.SnowflakeMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
