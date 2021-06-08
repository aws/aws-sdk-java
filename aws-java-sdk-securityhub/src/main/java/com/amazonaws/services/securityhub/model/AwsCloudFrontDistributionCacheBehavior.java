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
 * Information about a cache behavior for the distribution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsCloudFrontDistributionCacheBehavior"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsCloudFrontDistributionCacheBehavior implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The protocol that viewers can use to access the files in an origin. You can specify the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>allow-all</code> - Viewers can use HTTP or HTTPS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>redirect-to-https</code> - CloudFront responds to HTTP requests with an HTTP status code of 301 (Moved
     * Permanently) and the HTTPS URL. The viewer then uses the new URL to resubmit.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https-only</code> - CloudFront responds to HTTP request with an HTTP status code of 403 (Forbidden).
     * </p>
     * </li>
     * </ul>
     */
    private String viewerProtocolPolicy;

    /**
     * <p>
     * The protocol that viewers can use to access the files in an origin. You can specify the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>allow-all</code> - Viewers can use HTTP or HTTPS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>redirect-to-https</code> - CloudFront responds to HTTP requests with an HTTP status code of 301 (Moved
     * Permanently) and the HTTPS URL. The viewer then uses the new URL to resubmit.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https-only</code> - CloudFront responds to HTTP request with an HTTP status code of 403 (Forbidden).
     * </p>
     * </li>
     * </ul>
     * 
     * @param viewerProtocolPolicy
     *        The protocol that viewers can use to access the files in an origin. You can specify the following
     *        options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>allow-all</code> - Viewers can use HTTP or HTTPS.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>redirect-to-https</code> - CloudFront responds to HTTP requests with an HTTP status code of 301
     *        (Moved Permanently) and the HTTPS URL. The viewer then uses the new URL to resubmit.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>https-only</code> - CloudFront responds to HTTP request with an HTTP status code of 403 (Forbidden).
     *        </p>
     *        </li>
     */

    public void setViewerProtocolPolicy(String viewerProtocolPolicy) {
        this.viewerProtocolPolicy = viewerProtocolPolicy;
    }

    /**
     * <p>
     * The protocol that viewers can use to access the files in an origin. You can specify the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>allow-all</code> - Viewers can use HTTP or HTTPS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>redirect-to-https</code> - CloudFront responds to HTTP requests with an HTTP status code of 301 (Moved
     * Permanently) and the HTTPS URL. The viewer then uses the new URL to resubmit.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https-only</code> - CloudFront responds to HTTP request with an HTTP status code of 403 (Forbidden).
     * </p>
     * </li>
     * </ul>
     * 
     * @return The protocol that viewers can use to access the files in an origin. You can specify the following
     *         options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>allow-all</code> - Viewers can use HTTP or HTTPS.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>redirect-to-https</code> - CloudFront responds to HTTP requests with an HTTP status code of 301
     *         (Moved Permanently) and the HTTPS URL. The viewer then uses the new URL to resubmit.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>https-only</code> - CloudFront responds to HTTP request with an HTTP status code of 403
     *         (Forbidden).
     *         </p>
     *         </li>
     */

    public String getViewerProtocolPolicy() {
        return this.viewerProtocolPolicy;
    }

    /**
     * <p>
     * The protocol that viewers can use to access the files in an origin. You can specify the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>allow-all</code> - Viewers can use HTTP or HTTPS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>redirect-to-https</code> - CloudFront responds to HTTP requests with an HTTP status code of 301 (Moved
     * Permanently) and the HTTPS URL. The viewer then uses the new URL to resubmit.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>https-only</code> - CloudFront responds to HTTP request with an HTTP status code of 403 (Forbidden).
     * </p>
     * </li>
     * </ul>
     * 
     * @param viewerProtocolPolicy
     *        The protocol that viewers can use to access the files in an origin. You can specify the following
     *        options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>allow-all</code> - Viewers can use HTTP or HTTPS.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>redirect-to-https</code> - CloudFront responds to HTTP requests with an HTTP status code of 301
     *        (Moved Permanently) and the HTTPS URL. The viewer then uses the new URL to resubmit.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>https-only</code> - CloudFront responds to HTTP request with an HTTP status code of 403 (Forbidden).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionCacheBehavior withViewerProtocolPolicy(String viewerProtocolPolicy) {
        setViewerProtocolPolicy(viewerProtocolPolicy);
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
        if (getViewerProtocolPolicy() != null)
            sb.append("ViewerProtocolPolicy: ").append(getViewerProtocolPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsCloudFrontDistributionCacheBehavior == false)
            return false;
        AwsCloudFrontDistributionCacheBehavior other = (AwsCloudFrontDistributionCacheBehavior) obj;
        if (other.getViewerProtocolPolicy() == null ^ this.getViewerProtocolPolicy() == null)
            return false;
        if (other.getViewerProtocolPolicy() != null && other.getViewerProtocolPolicy().equals(this.getViewerProtocolPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getViewerProtocolPolicy() == null) ? 0 : getViewerProtocolPolicy().hashCode());
        return hashCode;
    }

    @Override
    public AwsCloudFrontDistributionCacheBehavior clone() {
        try {
            return (AwsCloudFrontDistributionCacheBehavior) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsCloudFrontDistributionCacheBehaviorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
