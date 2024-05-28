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
package com.amazonaws.services.marketplaceagreement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Includes the list of references to legal resources proposed by the proposer to the acceptor. Each
 * <code>DocumentItem</code> refers to an individual reference.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-agreement-2020-03-01/DocumentItem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Category of the document. Document types include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CustomEula</code> – A custom EULA provided by you as seller. A URL for a EULA stored in an accessible
     * Amazon S3 bucket is required for this document type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CustomDsa</code> – A custom Data Subscription Agreement (DSA) provided by you as seller. A URL for a DSA
     * stored in an accessible Amazon S3 bucket is required for this document type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StandardEula</code> – The Standard Contract for AWS Marketplace (SCMP). For more information about SCMP,
     * see the AWS Marketplace Seller Guide. You don’t provide a URL for this type because it’s managed by AWS
     * Marketplace.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StandardDsa</code> – DSA for AWS Marketplace. For more information about the DSA, see the AWS Data Exchange
     * User Guide. You don’t provide a URL for this type because it’s managed by AWS Marketplace.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * A URL to the legal document for buyers to read. Required when <code>Type</code> is <code>CustomEula</code>.
     * </p>
     */
    private String url;
    /**
     * <p>
     * Version of standard contracts provided by AWS Marketplace. Required when Type is <code>StandardEula</code> or
     * <code>StandardDsa</code>.
     * </p>
     */
    private String version;

    /**
     * <p>
     * Category of the document. Document types include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CustomEula</code> – A custom EULA provided by you as seller. A URL for a EULA stored in an accessible
     * Amazon S3 bucket is required for this document type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CustomDsa</code> – A custom Data Subscription Agreement (DSA) provided by you as seller. A URL for a DSA
     * stored in an accessible Amazon S3 bucket is required for this document type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StandardEula</code> – The Standard Contract for AWS Marketplace (SCMP). For more information about SCMP,
     * see the AWS Marketplace Seller Guide. You don’t provide a URL for this type because it’s managed by AWS
     * Marketplace.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StandardDsa</code> – DSA for AWS Marketplace. For more information about the DSA, see the AWS Data Exchange
     * User Guide. You don’t provide a URL for this type because it’s managed by AWS Marketplace.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        Category of the document. Document types include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CustomEula</code> – A custom EULA provided by you as seller. A URL for a EULA stored in an
     *        accessible Amazon S3 bucket is required for this document type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CustomDsa</code> – A custom Data Subscription Agreement (DSA) provided by you as seller. A URL for a
     *        DSA stored in an accessible Amazon S3 bucket is required for this document type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>StandardEula</code> – The Standard Contract for AWS Marketplace (SCMP). For more information about
     *        SCMP, see the AWS Marketplace Seller Guide. You don’t provide a URL for this type because it’s managed by
     *        AWS Marketplace.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>StandardDsa</code> – DSA for AWS Marketplace. For more information about the DSA, see the AWS Data
     *        Exchange User Guide. You don’t provide a URL for this type because it’s managed by AWS Marketplace.
     *        </p>
     *        </li>
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Category of the document. Document types include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CustomEula</code> – A custom EULA provided by you as seller. A URL for a EULA stored in an accessible
     * Amazon S3 bucket is required for this document type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CustomDsa</code> – A custom Data Subscription Agreement (DSA) provided by you as seller. A URL for a DSA
     * stored in an accessible Amazon S3 bucket is required for this document type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StandardEula</code> – The Standard Contract for AWS Marketplace (SCMP). For more information about SCMP,
     * see the AWS Marketplace Seller Guide. You don’t provide a URL for this type because it’s managed by AWS
     * Marketplace.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StandardDsa</code> – DSA for AWS Marketplace. For more information about the DSA, see the AWS Data Exchange
     * User Guide. You don’t provide a URL for this type because it’s managed by AWS Marketplace.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Category of the document. Document types include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CustomEula</code> – A custom EULA provided by you as seller. A URL for a EULA stored in an
     *         accessible Amazon S3 bucket is required for this document type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CustomDsa</code> – A custom Data Subscription Agreement (DSA) provided by you as seller. A URL for
     *         a DSA stored in an accessible Amazon S3 bucket is required for this document type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>StandardEula</code> – The Standard Contract for AWS Marketplace (SCMP). For more information about
     *         SCMP, see the AWS Marketplace Seller Guide. You don’t provide a URL for this type because it’s managed by
     *         AWS Marketplace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>StandardDsa</code> – DSA for AWS Marketplace. For more information about the DSA, see the AWS Data
     *         Exchange User Guide. You don’t provide a URL for this type because it’s managed by AWS Marketplace.
     *         </p>
     *         </li>
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Category of the document. Document types include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CustomEula</code> – A custom EULA provided by you as seller. A URL for a EULA stored in an accessible
     * Amazon S3 bucket is required for this document type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CustomDsa</code> – A custom Data Subscription Agreement (DSA) provided by you as seller. A URL for a DSA
     * stored in an accessible Amazon S3 bucket is required for this document type.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StandardEula</code> – The Standard Contract for AWS Marketplace (SCMP). For more information about SCMP,
     * see the AWS Marketplace Seller Guide. You don’t provide a URL for this type because it’s managed by AWS
     * Marketplace.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StandardDsa</code> – DSA for AWS Marketplace. For more information about the DSA, see the AWS Data Exchange
     * User Guide. You don’t provide a URL for this type because it’s managed by AWS Marketplace.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        Category of the document. Document types include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CustomEula</code> – A custom EULA provided by you as seller. A URL for a EULA stored in an
     *        accessible Amazon S3 bucket is required for this document type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CustomDsa</code> – A custom Data Subscription Agreement (DSA) provided by you as seller. A URL for a
     *        DSA stored in an accessible Amazon S3 bucket is required for this document type.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>StandardEula</code> – The Standard Contract for AWS Marketplace (SCMP). For more information about
     *        SCMP, see the AWS Marketplace Seller Guide. You don’t provide a URL for this type because it’s managed by
     *        AWS Marketplace.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>StandardDsa</code> – DSA for AWS Marketplace. For more information about the DSA, see the AWS Data
     *        Exchange User Guide. You don’t provide a URL for this type because it’s managed by AWS Marketplace.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentItem withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * A URL to the legal document for buyers to read. Required when <code>Type</code> is <code>CustomEula</code>.
     * </p>
     * 
     * @param url
     *        A URL to the legal document for buyers to read. Required when <code>Type</code> is <code>CustomEula</code>
     *        .
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * A URL to the legal document for buyers to read. Required when <code>Type</code> is <code>CustomEula</code>.
     * </p>
     * 
     * @return A URL to the legal document for buyers to read. Required when <code>Type</code> is
     *         <code>CustomEula</code>.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * A URL to the legal document for buyers to read. Required when <code>Type</code> is <code>CustomEula</code>.
     * </p>
     * 
     * @param url
     *        A URL to the legal document for buyers to read. Required when <code>Type</code> is <code>CustomEula</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentItem withUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * <p>
     * Version of standard contracts provided by AWS Marketplace. Required when Type is <code>StandardEula</code> or
     * <code>StandardDsa</code>.
     * </p>
     * 
     * @param version
     *        Version of standard contracts provided by AWS Marketplace. Required when Type is <code>StandardEula</code>
     *        or <code>StandardDsa</code>.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * Version of standard contracts provided by AWS Marketplace. Required when Type is <code>StandardEula</code> or
     * <code>StandardDsa</code>.
     * </p>
     * 
     * @return Version of standard contracts provided by AWS Marketplace. Required when Type is
     *         <code>StandardEula</code> or <code>StandardDsa</code>.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * Version of standard contracts provided by AWS Marketplace. Required when Type is <code>StandardEula</code> or
     * <code>StandardDsa</code>.
     * </p>
     * 
     * @param version
     *        Version of standard contracts provided by AWS Marketplace. Required when Type is <code>StandardEula</code>
     *        or <code>StandardDsa</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentItem withVersion(String version) {
        setVersion(version);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentItem == false)
            return false;
        DocumentItem other = (DocumentItem) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public DocumentItem clone() {
        try {
            return (DocumentItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplaceagreement.model.transform.DocumentItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
