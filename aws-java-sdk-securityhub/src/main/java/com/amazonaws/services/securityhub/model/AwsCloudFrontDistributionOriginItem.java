/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A complex type that describes the Amazon S3 bucket, HTTP server (for example, a web server), Amazon MediaStore, or
 * other server from which CloudFront gets your files.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsCloudFrontDistributionOriginItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsCloudFrontDistributionOriginItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Amazon S3 origins: The DNS name of the Amazon S3 bucket from which you want CloudFront to get objects for this
     * origin.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * A unique identifier for the origin or origin group.
     * </p>
     */
    private String id;
    /**
     * <p>
     * An optional element that causes CloudFront to request your content from a directory in your Amazon S3 bucket or
     * your custom origin.
     * </p>
     */
    private String originPath;

    /**
     * <p>
     * Amazon S3 origins: The DNS name of the Amazon S3 bucket from which you want CloudFront to get objects for this
     * origin.
     * </p>
     * 
     * @param domainName
     *        Amazon S3 origins: The DNS name of the Amazon S3 bucket from which you want CloudFront to get objects for
     *        this origin.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * Amazon S3 origins: The DNS name of the Amazon S3 bucket from which you want CloudFront to get objects for this
     * origin.
     * </p>
     * 
     * @return Amazon S3 origins: The DNS name of the Amazon S3 bucket from which you want CloudFront to get objects for
     *         this origin.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * Amazon S3 origins: The DNS name of the Amazon S3 bucket from which you want CloudFront to get objects for this
     * origin.
     * </p>
     * 
     * @param domainName
     *        Amazon S3 origins: The DNS name of the Amazon S3 bucket from which you want CloudFront to get objects for
     *        this origin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionOriginItem withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the origin or origin group.
     * </p>
     * 
     * @param id
     *        A unique identifier for the origin or origin group.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A unique identifier for the origin or origin group.
     * </p>
     * 
     * @return A unique identifier for the origin or origin group.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A unique identifier for the origin or origin group.
     * </p>
     * 
     * @param id
     *        A unique identifier for the origin or origin group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionOriginItem withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * An optional element that causes CloudFront to request your content from a directory in your Amazon S3 bucket or
     * your custom origin.
     * </p>
     * 
     * @param originPath
     *        An optional element that causes CloudFront to request your content from a directory in your Amazon S3
     *        bucket or your custom origin.
     */

    public void setOriginPath(String originPath) {
        this.originPath = originPath;
    }

    /**
     * <p>
     * An optional element that causes CloudFront to request your content from a directory in your Amazon S3 bucket or
     * your custom origin.
     * </p>
     * 
     * @return An optional element that causes CloudFront to request your content from a directory in your Amazon S3
     *         bucket or your custom origin.
     */

    public String getOriginPath() {
        return this.originPath;
    }

    /**
     * <p>
     * An optional element that causes CloudFront to request your content from a directory in your Amazon S3 bucket or
     * your custom origin.
     * </p>
     * 
     * @param originPath
     *        An optional element that causes CloudFront to request your content from a directory in your Amazon S3
     *        bucket or your custom origin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionOriginItem withOriginPath(String originPath) {
        setOriginPath(originPath);
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getOriginPath() != null)
            sb.append("OriginPath: ").append(getOriginPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsCloudFrontDistributionOriginItem == false)
            return false;
        AwsCloudFrontDistributionOriginItem other = (AwsCloudFrontDistributionOriginItem) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getOriginPath() == null ^ this.getOriginPath() == null)
            return false;
        if (other.getOriginPath() != null && other.getOriginPath().equals(this.getOriginPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getOriginPath() == null) ? 0 : getOriginPath().hashCode());
        return hashCode;
    }

    @Override
    public AwsCloudFrontDistributionOriginItem clone() {
        try {
            return (AwsCloudFrontDistributionOriginItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsCloudFrontDistributionOriginItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
