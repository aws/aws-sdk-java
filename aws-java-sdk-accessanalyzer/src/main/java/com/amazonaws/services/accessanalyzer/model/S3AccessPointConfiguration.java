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
 * The configuration for an Amazon S3 access point for the bucket. You can propose up to 10 access points per bucket. If
 * the proposed Amazon S3 access point configuration is for an existing bucket, the access preview uses the proposed
 * access point configuration in place of the existing access points. To propose an access point without a policy, you
 * can provide an empty string as the access point policy. For more information, see <a
 * href="https://docs.aws.amazon.com/https:/docs.aws.amazon.com/AmazonS3/latest/dev/creating-access-points.html"
 * >Creating access points</a>. For more information about access point policy limits, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-points-restrictions-limitations.html">Access points
 * restrictions and limitations</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/S3AccessPointConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3AccessPointConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The access point policy.
     * </p>
     */
    private String accessPointPolicy;
    /**
     * <p>
     * The proposed <code>Internet</code> and <code>VpcConfiguration</code> to apply to this Amazon S3 access point. If
     * the access preview is for a new resource and neither is specified, the access preview uses <code>Internet</code>
     * for the network origin. If the access preview is for an existing resource and neither is specified, the access
     * preview uses the exiting network origin.
     * </p>
     */
    private NetworkOriginConfiguration networkOrigin;
    /**
     * <p>
     * The proposed <code>S3PublicAccessBlock</code> configuration to apply to this Amazon S3 Access Point.
     * </p>
     */
    private S3PublicAccessBlockConfiguration publicAccessBlock;

    /**
     * <p>
     * The access point policy.
     * </p>
     * 
     * @param accessPointPolicy
     *        The access point policy.
     */

    public void setAccessPointPolicy(String accessPointPolicy) {
        this.accessPointPolicy = accessPointPolicy;
    }

    /**
     * <p>
     * The access point policy.
     * </p>
     * 
     * @return The access point policy.
     */

    public String getAccessPointPolicy() {
        return this.accessPointPolicy;
    }

    /**
     * <p>
     * The access point policy.
     * </p>
     * 
     * @param accessPointPolicy
     *        The access point policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3AccessPointConfiguration withAccessPointPolicy(String accessPointPolicy) {
        setAccessPointPolicy(accessPointPolicy);
        return this;
    }

    /**
     * <p>
     * The proposed <code>Internet</code> and <code>VpcConfiguration</code> to apply to this Amazon S3 access point. If
     * the access preview is for a new resource and neither is specified, the access preview uses <code>Internet</code>
     * for the network origin. If the access preview is for an existing resource and neither is specified, the access
     * preview uses the exiting network origin.
     * </p>
     * 
     * @param networkOrigin
     *        The proposed <code>Internet</code> and <code>VpcConfiguration</code> to apply to this Amazon S3 access
     *        point. If the access preview is for a new resource and neither is specified, the access preview uses
     *        <code>Internet</code> for the network origin. If the access preview is for an existing resource and
     *        neither is specified, the access preview uses the exiting network origin.
     */

    public void setNetworkOrigin(NetworkOriginConfiguration networkOrigin) {
        this.networkOrigin = networkOrigin;
    }

    /**
     * <p>
     * The proposed <code>Internet</code> and <code>VpcConfiguration</code> to apply to this Amazon S3 access point. If
     * the access preview is for a new resource and neither is specified, the access preview uses <code>Internet</code>
     * for the network origin. If the access preview is for an existing resource and neither is specified, the access
     * preview uses the exiting network origin.
     * </p>
     * 
     * @return The proposed <code>Internet</code> and <code>VpcConfiguration</code> to apply to this Amazon S3 access
     *         point. If the access preview is for a new resource and neither is specified, the access preview uses
     *         <code>Internet</code> for the network origin. If the access preview is for an existing resource and
     *         neither is specified, the access preview uses the exiting network origin.
     */

    public NetworkOriginConfiguration getNetworkOrigin() {
        return this.networkOrigin;
    }

    /**
     * <p>
     * The proposed <code>Internet</code> and <code>VpcConfiguration</code> to apply to this Amazon S3 access point. If
     * the access preview is for a new resource and neither is specified, the access preview uses <code>Internet</code>
     * for the network origin. If the access preview is for an existing resource and neither is specified, the access
     * preview uses the exiting network origin.
     * </p>
     * 
     * @param networkOrigin
     *        The proposed <code>Internet</code> and <code>VpcConfiguration</code> to apply to this Amazon S3 access
     *        point. If the access preview is for a new resource and neither is specified, the access preview uses
     *        <code>Internet</code> for the network origin. If the access preview is for an existing resource and
     *        neither is specified, the access preview uses the exiting network origin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3AccessPointConfiguration withNetworkOrigin(NetworkOriginConfiguration networkOrigin) {
        setNetworkOrigin(networkOrigin);
        return this;
    }

    /**
     * <p>
     * The proposed <code>S3PublicAccessBlock</code> configuration to apply to this Amazon S3 Access Point.
     * </p>
     * 
     * @param publicAccessBlock
     *        The proposed <code>S3PublicAccessBlock</code> configuration to apply to this Amazon S3 Access Point.
     */

    public void setPublicAccessBlock(S3PublicAccessBlockConfiguration publicAccessBlock) {
        this.publicAccessBlock = publicAccessBlock;
    }

    /**
     * <p>
     * The proposed <code>S3PublicAccessBlock</code> configuration to apply to this Amazon S3 Access Point.
     * </p>
     * 
     * @return The proposed <code>S3PublicAccessBlock</code> configuration to apply to this Amazon S3 Access Point.
     */

    public S3PublicAccessBlockConfiguration getPublicAccessBlock() {
        return this.publicAccessBlock;
    }

    /**
     * <p>
     * The proposed <code>S3PublicAccessBlock</code> configuration to apply to this Amazon S3 Access Point.
     * </p>
     * 
     * @param publicAccessBlock
     *        The proposed <code>S3PublicAccessBlock</code> configuration to apply to this Amazon S3 Access Point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3AccessPointConfiguration withPublicAccessBlock(S3PublicAccessBlockConfiguration publicAccessBlock) {
        setPublicAccessBlock(publicAccessBlock);
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
        if (getAccessPointPolicy() != null)
            sb.append("AccessPointPolicy: ").append(getAccessPointPolicy()).append(",");
        if (getNetworkOrigin() != null)
            sb.append("NetworkOrigin: ").append(getNetworkOrigin()).append(",");
        if (getPublicAccessBlock() != null)
            sb.append("PublicAccessBlock: ").append(getPublicAccessBlock());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3AccessPointConfiguration == false)
            return false;
        S3AccessPointConfiguration other = (S3AccessPointConfiguration) obj;
        if (other.getAccessPointPolicy() == null ^ this.getAccessPointPolicy() == null)
            return false;
        if (other.getAccessPointPolicy() != null && other.getAccessPointPolicy().equals(this.getAccessPointPolicy()) == false)
            return false;
        if (other.getNetworkOrigin() == null ^ this.getNetworkOrigin() == null)
            return false;
        if (other.getNetworkOrigin() != null && other.getNetworkOrigin().equals(this.getNetworkOrigin()) == false)
            return false;
        if (other.getPublicAccessBlock() == null ^ this.getPublicAccessBlock() == null)
            return false;
        if (other.getPublicAccessBlock() != null && other.getPublicAccessBlock().equals(this.getPublicAccessBlock()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessPointPolicy() == null) ? 0 : getAccessPointPolicy().hashCode());
        hashCode = prime * hashCode + ((getNetworkOrigin() == null) ? 0 : getNetworkOrigin().hashCode());
        hashCode = prime * hashCode + ((getPublicAccessBlock() == null) ? 0 : getPublicAccessBlock().hashCode());
        return hashCode;
    }

    @Override
    public S3AccessPointConfiguration clone() {
        try {
            return (S3AccessPointConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.S3AccessPointConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
