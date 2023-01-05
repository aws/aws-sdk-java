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
 * Website parameters for the S3 bucket.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsS3BucketWebsiteConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsS3BucketWebsiteConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the error document for the website.
     * </p>
     */
    private String errorDocument;
    /**
     * <p>
     * The name of the index document for the website.
     * </p>
     */
    private String indexDocumentSuffix;
    /**
     * <p>
     * The redirect behavior for requests to the website.
     * </p>
     */
    private AwsS3BucketWebsiteConfigurationRedirectTo redirectAllRequestsTo;
    /**
     * <p>
     * The rules for applying redirects for requests to the website.
     * </p>
     */
    private java.util.List<AwsS3BucketWebsiteConfigurationRoutingRule> routingRules;

    /**
     * <p>
     * The name of the error document for the website.
     * </p>
     * 
     * @param errorDocument
     *        The name of the error document for the website.
     */

    public void setErrorDocument(String errorDocument) {
        this.errorDocument = errorDocument;
    }

    /**
     * <p>
     * The name of the error document for the website.
     * </p>
     * 
     * @return The name of the error document for the website.
     */

    public String getErrorDocument() {
        return this.errorDocument;
    }

    /**
     * <p>
     * The name of the error document for the website.
     * </p>
     * 
     * @param errorDocument
     *        The name of the error document for the website.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketWebsiteConfiguration withErrorDocument(String errorDocument) {
        setErrorDocument(errorDocument);
        return this;
    }

    /**
     * <p>
     * The name of the index document for the website.
     * </p>
     * 
     * @param indexDocumentSuffix
     *        The name of the index document for the website.
     */

    public void setIndexDocumentSuffix(String indexDocumentSuffix) {
        this.indexDocumentSuffix = indexDocumentSuffix;
    }

    /**
     * <p>
     * The name of the index document for the website.
     * </p>
     * 
     * @return The name of the index document for the website.
     */

    public String getIndexDocumentSuffix() {
        return this.indexDocumentSuffix;
    }

    /**
     * <p>
     * The name of the index document for the website.
     * </p>
     * 
     * @param indexDocumentSuffix
     *        The name of the index document for the website.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketWebsiteConfiguration withIndexDocumentSuffix(String indexDocumentSuffix) {
        setIndexDocumentSuffix(indexDocumentSuffix);
        return this;
    }

    /**
     * <p>
     * The redirect behavior for requests to the website.
     * </p>
     * 
     * @param redirectAllRequestsTo
     *        The redirect behavior for requests to the website.
     */

    public void setRedirectAllRequestsTo(AwsS3BucketWebsiteConfigurationRedirectTo redirectAllRequestsTo) {
        this.redirectAllRequestsTo = redirectAllRequestsTo;
    }

    /**
     * <p>
     * The redirect behavior for requests to the website.
     * </p>
     * 
     * @return The redirect behavior for requests to the website.
     */

    public AwsS3BucketWebsiteConfigurationRedirectTo getRedirectAllRequestsTo() {
        return this.redirectAllRequestsTo;
    }

    /**
     * <p>
     * The redirect behavior for requests to the website.
     * </p>
     * 
     * @param redirectAllRequestsTo
     *        The redirect behavior for requests to the website.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketWebsiteConfiguration withRedirectAllRequestsTo(AwsS3BucketWebsiteConfigurationRedirectTo redirectAllRequestsTo) {
        setRedirectAllRequestsTo(redirectAllRequestsTo);
        return this;
    }

    /**
     * <p>
     * The rules for applying redirects for requests to the website.
     * </p>
     * 
     * @return The rules for applying redirects for requests to the website.
     */

    public java.util.List<AwsS3BucketWebsiteConfigurationRoutingRule> getRoutingRules() {
        return routingRules;
    }

    /**
     * <p>
     * The rules for applying redirects for requests to the website.
     * </p>
     * 
     * @param routingRules
     *        The rules for applying redirects for requests to the website.
     */

    public void setRoutingRules(java.util.Collection<AwsS3BucketWebsiteConfigurationRoutingRule> routingRules) {
        if (routingRules == null) {
            this.routingRules = null;
            return;
        }

        this.routingRules = new java.util.ArrayList<AwsS3BucketWebsiteConfigurationRoutingRule>(routingRules);
    }

    /**
     * <p>
     * The rules for applying redirects for requests to the website.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRoutingRules(java.util.Collection)} or {@link #withRoutingRules(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param routingRules
     *        The rules for applying redirects for requests to the website.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketWebsiteConfiguration withRoutingRules(AwsS3BucketWebsiteConfigurationRoutingRule... routingRules) {
        if (this.routingRules == null) {
            setRoutingRules(new java.util.ArrayList<AwsS3BucketWebsiteConfigurationRoutingRule>(routingRules.length));
        }
        for (AwsS3BucketWebsiteConfigurationRoutingRule ele : routingRules) {
            this.routingRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The rules for applying redirects for requests to the website.
     * </p>
     * 
     * @param routingRules
     *        The rules for applying redirects for requests to the website.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketWebsiteConfiguration withRoutingRules(java.util.Collection<AwsS3BucketWebsiteConfigurationRoutingRule> routingRules) {
        setRoutingRules(routingRules);
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
        if (getErrorDocument() != null)
            sb.append("ErrorDocument: ").append(getErrorDocument()).append(",");
        if (getIndexDocumentSuffix() != null)
            sb.append("IndexDocumentSuffix: ").append(getIndexDocumentSuffix()).append(",");
        if (getRedirectAllRequestsTo() != null)
            sb.append("RedirectAllRequestsTo: ").append(getRedirectAllRequestsTo()).append(",");
        if (getRoutingRules() != null)
            sb.append("RoutingRules: ").append(getRoutingRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsS3BucketWebsiteConfiguration == false)
            return false;
        AwsS3BucketWebsiteConfiguration other = (AwsS3BucketWebsiteConfiguration) obj;
        if (other.getErrorDocument() == null ^ this.getErrorDocument() == null)
            return false;
        if (other.getErrorDocument() != null && other.getErrorDocument().equals(this.getErrorDocument()) == false)
            return false;
        if (other.getIndexDocumentSuffix() == null ^ this.getIndexDocumentSuffix() == null)
            return false;
        if (other.getIndexDocumentSuffix() != null && other.getIndexDocumentSuffix().equals(this.getIndexDocumentSuffix()) == false)
            return false;
        if (other.getRedirectAllRequestsTo() == null ^ this.getRedirectAllRequestsTo() == null)
            return false;
        if (other.getRedirectAllRequestsTo() != null && other.getRedirectAllRequestsTo().equals(this.getRedirectAllRequestsTo()) == false)
            return false;
        if (other.getRoutingRules() == null ^ this.getRoutingRules() == null)
            return false;
        if (other.getRoutingRules() != null && other.getRoutingRules().equals(this.getRoutingRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorDocument() == null) ? 0 : getErrorDocument().hashCode());
        hashCode = prime * hashCode + ((getIndexDocumentSuffix() == null) ? 0 : getIndexDocumentSuffix().hashCode());
        hashCode = prime * hashCode + ((getRedirectAllRequestsTo() == null) ? 0 : getRedirectAllRequestsTo().hashCode());
        hashCode = prime * hashCode + ((getRoutingRules() == null) ? 0 : getRoutingRules().hashCode());
        return hashCode;
    }

    @Override
    public AwsS3BucketWebsiteConfiguration clone() {
        try {
            return (AwsS3BucketWebsiteConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsS3BucketWebsiteConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
