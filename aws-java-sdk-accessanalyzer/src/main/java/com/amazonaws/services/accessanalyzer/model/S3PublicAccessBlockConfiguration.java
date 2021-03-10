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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The <code>PublicAccessBlock</code> configuration to apply to this Amazon S3 bucket. If the proposed configuration is
 * for an existing Amazon S3 bucket and the configuration is not specified, the access preview uses the existing
 * setting. If the proposed configuration is for a new bucket and the configuration is not specified, the access preview
 * uses <code>false</code>. If the proposed configuration is for a new access point and the access point BPA
 * configuration is not specified, the access preview uses <code>true</code>. For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-publicaccessblockconfiguration.html"
 * >PublicAccessBlockConfiguration</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/S3PublicAccessBlockConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3PublicAccessBlockConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether Amazon S3 should ignore public ACLs for this bucket and objects in this bucket.
     * </p>
     */
    private Boolean ignorePublicAcls;
    /**
     * <p>
     * Specifies whether Amazon S3 should restrict public bucket policies for this bucket.
     * </p>
     */
    private Boolean restrictPublicBuckets;

    /**
     * <p>
     * Specifies whether Amazon S3 should ignore public ACLs for this bucket and objects in this bucket.
     * </p>
     * 
     * @param ignorePublicAcls
     *        Specifies whether Amazon S3 should ignore public ACLs for this bucket and objects in this bucket.
     */

    public void setIgnorePublicAcls(Boolean ignorePublicAcls) {
        this.ignorePublicAcls = ignorePublicAcls;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should ignore public ACLs for this bucket and objects in this bucket.
     * </p>
     * 
     * @return Specifies whether Amazon S3 should ignore public ACLs for this bucket and objects in this bucket.
     */

    public Boolean getIgnorePublicAcls() {
        return this.ignorePublicAcls;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should ignore public ACLs for this bucket and objects in this bucket.
     * </p>
     * 
     * @param ignorePublicAcls
     *        Specifies whether Amazon S3 should ignore public ACLs for this bucket and objects in this bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3PublicAccessBlockConfiguration withIgnorePublicAcls(Boolean ignorePublicAcls) {
        setIgnorePublicAcls(ignorePublicAcls);
        return this;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should ignore public ACLs for this bucket and objects in this bucket.
     * </p>
     * 
     * @return Specifies whether Amazon S3 should ignore public ACLs for this bucket and objects in this bucket.
     */

    public Boolean isIgnorePublicAcls() {
        return this.ignorePublicAcls;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should restrict public bucket policies for this bucket.
     * </p>
     * 
     * @param restrictPublicBuckets
     *        Specifies whether Amazon S3 should restrict public bucket policies for this bucket.
     */

    public void setRestrictPublicBuckets(Boolean restrictPublicBuckets) {
        this.restrictPublicBuckets = restrictPublicBuckets;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should restrict public bucket policies for this bucket.
     * </p>
     * 
     * @return Specifies whether Amazon S3 should restrict public bucket policies for this bucket.
     */

    public Boolean getRestrictPublicBuckets() {
        return this.restrictPublicBuckets;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should restrict public bucket policies for this bucket.
     * </p>
     * 
     * @param restrictPublicBuckets
     *        Specifies whether Amazon S3 should restrict public bucket policies for this bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3PublicAccessBlockConfiguration withRestrictPublicBuckets(Boolean restrictPublicBuckets) {
        setRestrictPublicBuckets(restrictPublicBuckets);
        return this;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 should restrict public bucket policies for this bucket.
     * </p>
     * 
     * @return Specifies whether Amazon S3 should restrict public bucket policies for this bucket.
     */

    public Boolean isRestrictPublicBuckets() {
        return this.restrictPublicBuckets;
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
        if (getIgnorePublicAcls() != null)
            sb.append("IgnorePublicAcls: ").append(getIgnorePublicAcls()).append(",");
        if (getRestrictPublicBuckets() != null)
            sb.append("RestrictPublicBuckets: ").append(getRestrictPublicBuckets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3PublicAccessBlockConfiguration == false)
            return false;
        S3PublicAccessBlockConfiguration other = (S3PublicAccessBlockConfiguration) obj;
        if (other.getIgnorePublicAcls() == null ^ this.getIgnorePublicAcls() == null)
            return false;
        if (other.getIgnorePublicAcls() != null && other.getIgnorePublicAcls().equals(this.getIgnorePublicAcls()) == false)
            return false;
        if (other.getRestrictPublicBuckets() == null ^ this.getRestrictPublicBuckets() == null)
            return false;
        if (other.getRestrictPublicBuckets() != null && other.getRestrictPublicBuckets().equals(this.getRestrictPublicBuckets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIgnorePublicAcls() == null) ? 0 : getIgnorePublicAcls().hashCode());
        hashCode = prime * hashCode + ((getRestrictPublicBuckets() == null) ? 0 : getRestrictPublicBuckets().hashCode());
        return hashCode;
    }

    @Override
    public S3PublicAccessBlockConfiguration clone() {
        try {
            return (S3PublicAccessBlockConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.S3PublicAccessBlockConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
