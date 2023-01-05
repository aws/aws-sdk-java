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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configures the CloudWatch Logs to publish for the OpenSearch domain.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsOpenSearchServiceDomainLogPublishingOptionsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsOpenSearchServiceDomainLogPublishingOptionsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configures the OpenSearch index logs publishing.
     * </p>
     */
    private AwsOpenSearchServiceDomainLogPublishingOption indexSlowLogs;
    /**
     * <p>
     * Configures the OpenSearch search slow log publishing.
     * </p>
     */
    private AwsOpenSearchServiceDomainLogPublishingOption searchSlowLogs;
    /**
     * <p>
     * Configures the OpenSearch audit logs publishing.
     * </p>
     */
    private AwsOpenSearchServiceDomainLogPublishingOption auditLogs;

    /**
     * <p>
     * Configures the OpenSearch index logs publishing.
     * </p>
     * 
     * @param indexSlowLogs
     *        Configures the OpenSearch index logs publishing.
     */

    public void setIndexSlowLogs(AwsOpenSearchServiceDomainLogPublishingOption indexSlowLogs) {
        this.indexSlowLogs = indexSlowLogs;
    }

    /**
     * <p>
     * Configures the OpenSearch index logs publishing.
     * </p>
     * 
     * @return Configures the OpenSearch index logs publishing.
     */

    public AwsOpenSearchServiceDomainLogPublishingOption getIndexSlowLogs() {
        return this.indexSlowLogs;
    }

    /**
     * <p>
     * Configures the OpenSearch index logs publishing.
     * </p>
     * 
     * @param indexSlowLogs
     *        Configures the OpenSearch index logs publishing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainLogPublishingOptionsDetails withIndexSlowLogs(AwsOpenSearchServiceDomainLogPublishingOption indexSlowLogs) {
        setIndexSlowLogs(indexSlowLogs);
        return this;
    }

    /**
     * <p>
     * Configures the OpenSearch search slow log publishing.
     * </p>
     * 
     * @param searchSlowLogs
     *        Configures the OpenSearch search slow log publishing.
     */

    public void setSearchSlowLogs(AwsOpenSearchServiceDomainLogPublishingOption searchSlowLogs) {
        this.searchSlowLogs = searchSlowLogs;
    }

    /**
     * <p>
     * Configures the OpenSearch search slow log publishing.
     * </p>
     * 
     * @return Configures the OpenSearch search slow log publishing.
     */

    public AwsOpenSearchServiceDomainLogPublishingOption getSearchSlowLogs() {
        return this.searchSlowLogs;
    }

    /**
     * <p>
     * Configures the OpenSearch search slow log publishing.
     * </p>
     * 
     * @param searchSlowLogs
     *        Configures the OpenSearch search slow log publishing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainLogPublishingOptionsDetails withSearchSlowLogs(AwsOpenSearchServiceDomainLogPublishingOption searchSlowLogs) {
        setSearchSlowLogs(searchSlowLogs);
        return this;
    }

    /**
     * <p>
     * Configures the OpenSearch audit logs publishing.
     * </p>
     * 
     * @param auditLogs
     *        Configures the OpenSearch audit logs publishing.
     */

    public void setAuditLogs(AwsOpenSearchServiceDomainLogPublishingOption auditLogs) {
        this.auditLogs = auditLogs;
    }

    /**
     * <p>
     * Configures the OpenSearch audit logs publishing.
     * </p>
     * 
     * @return Configures the OpenSearch audit logs publishing.
     */

    public AwsOpenSearchServiceDomainLogPublishingOption getAuditLogs() {
        return this.auditLogs;
    }

    /**
     * <p>
     * Configures the OpenSearch audit logs publishing.
     * </p>
     * 
     * @param auditLogs
     *        Configures the OpenSearch audit logs publishing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainLogPublishingOptionsDetails withAuditLogs(AwsOpenSearchServiceDomainLogPublishingOption auditLogs) {
        setAuditLogs(auditLogs);
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
            sb.append("SearchSlowLogs: ").append(getSearchSlowLogs()).append(",");
        if (getAuditLogs() != null)
            sb.append("AuditLogs: ").append(getAuditLogs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsOpenSearchServiceDomainLogPublishingOptionsDetails == false)
            return false;
        AwsOpenSearchServiceDomainLogPublishingOptionsDetails other = (AwsOpenSearchServiceDomainLogPublishingOptionsDetails) obj;
        if (other.getIndexSlowLogs() == null ^ this.getIndexSlowLogs() == null)
            return false;
        if (other.getIndexSlowLogs() != null && other.getIndexSlowLogs().equals(this.getIndexSlowLogs()) == false)
            return false;
        if (other.getSearchSlowLogs() == null ^ this.getSearchSlowLogs() == null)
            return false;
        if (other.getSearchSlowLogs() != null && other.getSearchSlowLogs().equals(this.getSearchSlowLogs()) == false)
            return false;
        if (other.getAuditLogs() == null ^ this.getAuditLogs() == null)
            return false;
        if (other.getAuditLogs() != null && other.getAuditLogs().equals(this.getAuditLogs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexSlowLogs() == null) ? 0 : getIndexSlowLogs().hashCode());
        hashCode = prime * hashCode + ((getSearchSlowLogs() == null) ? 0 : getSearchSlowLogs().hashCode());
        hashCode = prime * hashCode + ((getAuditLogs() == null) ? 0 : getAuditLogs().hashCode());
        return hashCode;
    }

    @Override
    public AwsOpenSearchServiceDomainLogPublishingOptionsDetails clone() {
        try {
            return (AwsOpenSearchServiceDomainLogPublishingOptionsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsOpenSearchServiceDomainLogPublishingOptionsDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
