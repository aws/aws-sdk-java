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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information on how the retriever used for your Amazon Q Business application is configured.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/RetrieverConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetrieverConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Provides information on how a Amazon Q Business index used as a retriever for your Amazon Q Business application
     * is configured.
     * </p>
     */
    private NativeIndexConfiguration nativeIndexConfiguration;
    /**
     * <p>
     * Provides information on how the Amazon Kendra index used as a retriever for your Amazon Q Business application is
     * configured.
     * </p>
     */
    private KendraIndexConfiguration kendraIndexConfiguration;

    /**
     * <p>
     * Provides information on how a Amazon Q Business index used as a retriever for your Amazon Q Business application
     * is configured.
     * </p>
     * 
     * @param nativeIndexConfiguration
     *        Provides information on how a Amazon Q Business index used as a retriever for your Amazon Q Business
     *        application is configured.
     */

    public void setNativeIndexConfiguration(NativeIndexConfiguration nativeIndexConfiguration) {
        this.nativeIndexConfiguration = nativeIndexConfiguration;
    }

    /**
     * <p>
     * Provides information on how a Amazon Q Business index used as a retriever for your Amazon Q Business application
     * is configured.
     * </p>
     * 
     * @return Provides information on how a Amazon Q Business index used as a retriever for your Amazon Q Business
     *         application is configured.
     */

    public NativeIndexConfiguration getNativeIndexConfiguration() {
        return this.nativeIndexConfiguration;
    }

    /**
     * <p>
     * Provides information on how a Amazon Q Business index used as a retriever for your Amazon Q Business application
     * is configured.
     * </p>
     * 
     * @param nativeIndexConfiguration
     *        Provides information on how a Amazon Q Business index used as a retriever for your Amazon Q Business
     *        application is configured.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieverConfiguration withNativeIndexConfiguration(NativeIndexConfiguration nativeIndexConfiguration) {
        setNativeIndexConfiguration(nativeIndexConfiguration);
        return this;
    }

    /**
     * <p>
     * Provides information on how the Amazon Kendra index used as a retriever for your Amazon Q Business application is
     * configured.
     * </p>
     * 
     * @param kendraIndexConfiguration
     *        Provides information on how the Amazon Kendra index used as a retriever for your Amazon Q Business
     *        application is configured.
     */

    public void setKendraIndexConfiguration(KendraIndexConfiguration kendraIndexConfiguration) {
        this.kendraIndexConfiguration = kendraIndexConfiguration;
    }

    /**
     * <p>
     * Provides information on how the Amazon Kendra index used as a retriever for your Amazon Q Business application is
     * configured.
     * </p>
     * 
     * @return Provides information on how the Amazon Kendra index used as a retriever for your Amazon Q Business
     *         application is configured.
     */

    public KendraIndexConfiguration getKendraIndexConfiguration() {
        return this.kendraIndexConfiguration;
    }

    /**
     * <p>
     * Provides information on how the Amazon Kendra index used as a retriever for your Amazon Q Business application is
     * configured.
     * </p>
     * 
     * @param kendraIndexConfiguration
     *        Provides information on how the Amazon Kendra index used as a retriever for your Amazon Q Business
     *        application is configured.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieverConfiguration withKendraIndexConfiguration(KendraIndexConfiguration kendraIndexConfiguration) {
        setKendraIndexConfiguration(kendraIndexConfiguration);
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
        if (getNativeIndexConfiguration() != null)
            sb.append("NativeIndexConfiguration: ").append(getNativeIndexConfiguration()).append(",");
        if (getKendraIndexConfiguration() != null)
            sb.append("KendraIndexConfiguration: ").append(getKendraIndexConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetrieverConfiguration == false)
            return false;
        RetrieverConfiguration other = (RetrieverConfiguration) obj;
        if (other.getNativeIndexConfiguration() == null ^ this.getNativeIndexConfiguration() == null)
            return false;
        if (other.getNativeIndexConfiguration() != null && other.getNativeIndexConfiguration().equals(this.getNativeIndexConfiguration()) == false)
            return false;
        if (other.getKendraIndexConfiguration() == null ^ this.getKendraIndexConfiguration() == null)
            return false;
        if (other.getKendraIndexConfiguration() != null && other.getKendraIndexConfiguration().equals(this.getKendraIndexConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNativeIndexConfiguration() == null) ? 0 : getNativeIndexConfiguration().hashCode());
        hashCode = prime * hashCode + ((getKendraIndexConfiguration() == null) ? 0 : getKendraIndexConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public RetrieverConfiguration clone() {
        try {
            return (RetrieverConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.RetrieverConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
