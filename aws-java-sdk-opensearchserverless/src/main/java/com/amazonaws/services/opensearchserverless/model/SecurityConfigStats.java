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
package com.amazonaws.services.opensearchserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Statistics for an OpenSearch Serverless security configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/SecurityConfigStats"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecurityConfigStats implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of security configurations in the current account.
     * </p>
     */
    private Long samlConfigCount;

    /**
     * <p>
     * The number of security configurations in the current account.
     * </p>
     * 
     * @param samlConfigCount
     *        The number of security configurations in the current account.
     */

    public void setSamlConfigCount(Long samlConfigCount) {
        this.samlConfigCount = samlConfigCount;
    }

    /**
     * <p>
     * The number of security configurations in the current account.
     * </p>
     * 
     * @return The number of security configurations in the current account.
     */

    public Long getSamlConfigCount() {
        return this.samlConfigCount;
    }

    /**
     * <p>
     * The number of security configurations in the current account.
     * </p>
     * 
     * @param samlConfigCount
     *        The number of security configurations in the current account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityConfigStats withSamlConfigCount(Long samlConfigCount) {
        setSamlConfigCount(samlConfigCount);
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
        if (getSamlConfigCount() != null)
            sb.append("SamlConfigCount: ").append(getSamlConfigCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecurityConfigStats == false)
            return false;
        SecurityConfigStats other = (SecurityConfigStats) obj;
        if (other.getSamlConfigCount() == null ^ this.getSamlConfigCount() == null)
            return false;
        if (other.getSamlConfigCount() != null && other.getSamlConfigCount().equals(this.getSamlConfigCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSamlConfigCount() == null) ? 0 : getSamlConfigCount().hashCode());
        return hashCode;
    }

    @Override
    public SecurityConfigStats clone() {
        try {
            return (SecurityConfigStats) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearchserverless.model.transform.SecurityConfigStatsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
