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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for the third-party custom source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CustomLogSourceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomLogSourceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration for the Glue Crawler for the third-party custom source.
     * </p>
     */
    private CustomLogSourceCrawlerConfiguration crawlerConfiguration;
    /**
     * <p>
     * The identity of the log provider for the third-party custom source.
     * </p>
     */
    private AwsIdentity providerIdentity;

    /**
     * <p>
     * The configuration for the Glue Crawler for the third-party custom source.
     * </p>
     * 
     * @param crawlerConfiguration
     *        The configuration for the Glue Crawler for the third-party custom source.
     */

    public void setCrawlerConfiguration(CustomLogSourceCrawlerConfiguration crawlerConfiguration) {
        this.crawlerConfiguration = crawlerConfiguration;
    }

    /**
     * <p>
     * The configuration for the Glue Crawler for the third-party custom source.
     * </p>
     * 
     * @return The configuration for the Glue Crawler for the third-party custom source.
     */

    public CustomLogSourceCrawlerConfiguration getCrawlerConfiguration() {
        return this.crawlerConfiguration;
    }

    /**
     * <p>
     * The configuration for the Glue Crawler for the third-party custom source.
     * </p>
     * 
     * @param crawlerConfiguration
     *        The configuration for the Glue Crawler for the third-party custom source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomLogSourceConfiguration withCrawlerConfiguration(CustomLogSourceCrawlerConfiguration crawlerConfiguration) {
        setCrawlerConfiguration(crawlerConfiguration);
        return this;
    }

    /**
     * <p>
     * The identity of the log provider for the third-party custom source.
     * </p>
     * 
     * @param providerIdentity
     *        The identity of the log provider for the third-party custom source.
     */

    public void setProviderIdentity(AwsIdentity providerIdentity) {
        this.providerIdentity = providerIdentity;
    }

    /**
     * <p>
     * The identity of the log provider for the third-party custom source.
     * </p>
     * 
     * @return The identity of the log provider for the third-party custom source.
     */

    public AwsIdentity getProviderIdentity() {
        return this.providerIdentity;
    }

    /**
     * <p>
     * The identity of the log provider for the third-party custom source.
     * </p>
     * 
     * @param providerIdentity
     *        The identity of the log provider for the third-party custom source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomLogSourceConfiguration withProviderIdentity(AwsIdentity providerIdentity) {
        setProviderIdentity(providerIdentity);
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
        if (getCrawlerConfiguration() != null)
            sb.append("CrawlerConfiguration: ").append(getCrawlerConfiguration()).append(",");
        if (getProviderIdentity() != null)
            sb.append("ProviderIdentity: ").append(getProviderIdentity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomLogSourceConfiguration == false)
            return false;
        CustomLogSourceConfiguration other = (CustomLogSourceConfiguration) obj;
        if (other.getCrawlerConfiguration() == null ^ this.getCrawlerConfiguration() == null)
            return false;
        if (other.getCrawlerConfiguration() != null && other.getCrawlerConfiguration().equals(this.getCrawlerConfiguration()) == false)
            return false;
        if (other.getProviderIdentity() == null ^ this.getProviderIdentity() == null)
            return false;
        if (other.getProviderIdentity() != null && other.getProviderIdentity().equals(this.getProviderIdentity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCrawlerConfiguration() == null) ? 0 : getCrawlerConfiguration().hashCode());
        hashCode = prime * hashCode + ((getProviderIdentity() == null) ? 0 : getProviderIdentity().hashCode());
        return hashCode;
    }

    @Override
    public CustomLogSourceConfiguration clone() {
        try {
            return (CustomLogSourceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securitylake.model.transform.CustomLogSourceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
