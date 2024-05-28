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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the configuration of an unused access analyzer for an Amazon Web Services organization or
 * account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/AnalyzerConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalyzerConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the configuration of an unused access analyzer for an Amazon Web Services organization or account.
     * External access analyzers do not support any configuration.
     * </p>
     */
    private UnusedAccessConfiguration unusedAccess;

    /**
     * <p>
     * Specifies the configuration of an unused access analyzer for an Amazon Web Services organization or account.
     * External access analyzers do not support any configuration.
     * </p>
     * 
     * @param unusedAccess
     *        Specifies the configuration of an unused access analyzer for an Amazon Web Services organization or
     *        account. External access analyzers do not support any configuration.
     */

    public void setUnusedAccess(UnusedAccessConfiguration unusedAccess) {
        this.unusedAccess = unusedAccess;
    }

    /**
     * <p>
     * Specifies the configuration of an unused access analyzer for an Amazon Web Services organization or account.
     * External access analyzers do not support any configuration.
     * </p>
     * 
     * @return Specifies the configuration of an unused access analyzer for an Amazon Web Services organization or
     *         account. External access analyzers do not support any configuration.
     */

    public UnusedAccessConfiguration getUnusedAccess() {
        return this.unusedAccess;
    }

    /**
     * <p>
     * Specifies the configuration of an unused access analyzer for an Amazon Web Services organization or account.
     * External access analyzers do not support any configuration.
     * </p>
     * 
     * @param unusedAccess
     *        Specifies the configuration of an unused access analyzer for an Amazon Web Services organization or
     *        account. External access analyzers do not support any configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyzerConfiguration withUnusedAccess(UnusedAccessConfiguration unusedAccess) {
        setUnusedAccess(unusedAccess);
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
        if (getUnusedAccess() != null)
            sb.append("UnusedAccess: ").append(getUnusedAccess());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalyzerConfiguration == false)
            return false;
        AnalyzerConfiguration other = (AnalyzerConfiguration) obj;
        if (other.getUnusedAccess() == null ^ this.getUnusedAccess() == null)
            return false;
        if (other.getUnusedAccess() != null && other.getUnusedAccess().equals(this.getUnusedAccess()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUnusedAccess() == null) ? 0 : getUnusedAccess().hashCode());
        return hashCode;
    }

    @Override
    public AnalyzerConfiguration clone() {
        try {
            return (AnalyzerConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.AnalyzerConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
