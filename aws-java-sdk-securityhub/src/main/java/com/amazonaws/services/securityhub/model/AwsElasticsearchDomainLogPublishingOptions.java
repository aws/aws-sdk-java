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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * configures the CloudWatch Logs to publish for the Elasticsearch domain.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsElasticsearchDomainLogPublishingOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsElasticsearchDomainLogPublishingOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configures the Elasticsearch index logs publishing.
     * </p>
     */
    private AwsElasticsearchDomainLogPublishingOptionsLogConfig indexSlowLogs;
    /**
     * <p>
     * Configures the Elasticsearch search slow log publishing.
     * </p>
     */
    private AwsElasticsearchDomainLogPublishingOptionsLogConfig searchSlowLogs;

    /**
     * <p>
     * Configures the Elasticsearch index logs publishing.
     * </p>
     * 
     * @param indexSlowLogs
     *        Configures the Elasticsearch index logs publishing.
     */

    public void setIndexSlowLogs(AwsElasticsearchDomainLogPublishingOptionsLogConfig indexSlowLogs) {
        this.indexSlowLogs = indexSlowLogs;
    }

    /**
     * <p>
     * Configures the Elasticsearch index logs publishing.
     * </p>
     * 
     * @return Configures the Elasticsearch index logs publishing.
     */

    public AwsElasticsearchDomainLogPublishingOptionsLogConfig getIndexSlowLogs() {
        return this.indexSlowLogs;
    }

    /**
     * <p>
     * Configures the Elasticsearch index logs publishing.
     * </p>
     * 
     * @param indexSlowLogs
     *        Configures the Elasticsearch index logs publishing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticsearchDomainLogPublishingOptions withIndexSlowLogs(AwsElasticsearchDomainLogPublishingOptionsLogConfig indexSlowLogs) {
        setIndexSlowLogs(indexSlowLogs);
        return this;
    }

    /**
     * <p>
     * Configures the Elasticsearch search slow log publishing.
     * </p>
     * 
     * @param searchSlowLogs
     *        Configures the Elasticsearch search slow log publishing.
     */

    public void setSearchSlowLogs(AwsElasticsearchDomainLogPublishingOptionsLogConfig searchSlowLogs) {
        this.searchSlowLogs = searchSlowLogs;
    }

    /**
     * <p>
     * Configures the Elasticsearch search slow log publishing.
     * </p>
     * 
     * @return Configures the Elasticsearch search slow log publishing.
     */

    public AwsElasticsearchDomainLogPublishingOptionsLogConfig getSearchSlowLogs() {
        return this.searchSlowLogs;
    }

    /**
     * <p>
     * Configures the Elasticsearch search slow log publishing.
     * </p>
     * 
     * @param searchSlowLogs
     *        Configures the Elasticsearch search slow log publishing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticsearchDomainLogPublishingOptions withSearchSlowLogs(AwsElasticsearchDomainLogPublishingOptionsLogConfig searchSlowLogs) {
        setSearchSlowLogs(searchSlowLogs);
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
        if (getIndexSlowLogs() != null)
            sb.append("IndexSlowLogs: ").append(getIndexSlowLogs()).append(",");
        if (getSearchSlowLogs() != null)
            sb.append("SearchSlowLogs: ").append(getSearchSlowLogs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsElasticsearchDomainLogPublishingOptions == false)
            return false;
        AwsElasticsearchDomainLogPublishingOptions other = (AwsElasticsearchDomainLogPublishingOptions) obj;
        if (other.getIndexSlowLogs() == null ^ this.getIndexSlowLogs() == null)
            return false;
        if (other.getIndexSlowLogs() != null && other.getIndexSlowLogs().equals(this.getIndexSlowLogs()) == false)
            return false;
        if (other.getSearchSlowLogs() == null ^ this.getSearchSlowLogs() == null)
            return false;
        if (other.getSearchSlowLogs() != null && other.getSearchSlowLogs().equals(this.getSearchSlowLogs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexSlowLogs() == null) ? 0 : getIndexSlowLogs().hashCode());
        hashCode = prime * hashCode + ((getSearchSlowLogs() == null) ? 0 : getSearchSlowLogs().hashCode());
        return hashCode;
    }

    @Override
    public AwsElasticsearchDomainLogPublishingOptions clone() {
        try {
            return (AwsElasticsearchDomainLogPublishingOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsElasticsearchDomainLogPublishingOptionsMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
