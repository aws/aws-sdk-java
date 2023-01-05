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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Determines whether CloudFront includes the <code>Strict-Transport-Security</code> HTTP response header and the
 * header's value.
 * </p>
 * <p>
 * For more information about the <code>Strict-Transport-Security</code> HTTP response header, see <a
 * href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Strict-Transport-Security"
 * >Strict-Transport-Security</a> in the MDN Web Docs.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ResponseHeadersPolicyStrictTransportSecurity"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResponseHeadersPolicyStrictTransportSecurity implements Serializable, Cloneable {

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides the <code>Strict-Transport-Security</code> HTTP response
     * header received from the origin with the one specified in this response headers policy.
     * </p>
     */
    private Boolean override;
    /**
     * <p>
     * A Boolean that determines whether CloudFront includes the <code>includeSubDomains</code> directive in the
     * <code>Strict-Transport-Security</code> HTTP response header.
     * </p>
     */
    private Boolean includeSubdomains;
    /**
     * <p>
     * A Boolean that determines whether CloudFront includes the <code>preload</code> directive in the
     * <code>Strict-Transport-Security</code> HTTP response header.
     * </p>
     */
    private Boolean preload;
    /**
     * <p>
     * A number that CloudFront uses as the value for the <code>max-age</code> directive in the
     * <code>Strict-Transport-Security</code> HTTP response header.
     * </p>
     */
    private Integer accessControlMaxAgeSec;

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides the <code>Strict-Transport-Security</code> HTTP response
     * header received from the origin with the one specified in this response headers policy.
     * </p>
     * 
     * @param override
     *        A Boolean that determines whether CloudFront overrides the <code>Strict-Transport-Security</code> HTTP
     *        response header received from the origin with the one specified in this response headers policy.
     */

    public void setOverride(Boolean override) {
        this.override = override;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides the <code>Strict-Transport-Security</code> HTTP response
     * header received from the origin with the one specified in this response headers policy.
     * </p>
     * 
     * @return A Boolean that determines whether CloudFront overrides the <code>Strict-Transport-Security</code> HTTP
     *         response header received from the origin with the one specified in this response headers policy.
     */

    public Boolean getOverride() {
        return this.override;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides the <code>Strict-Transport-Security</code> HTTP response
     * header received from the origin with the one specified in this response headers policy.
     * </p>
     * 
     * @param override
     *        A Boolean that determines whether CloudFront overrides the <code>Strict-Transport-Security</code> HTTP
     *        response header received from the origin with the one specified in this response headers policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyStrictTransportSecurity withOverride(Boolean override) {
        setOverride(override);
        return this;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront overrides the <code>Strict-Transport-Security</code> HTTP response
     * header received from the origin with the one specified in this response headers policy.
     * </p>
     * 
     * @return A Boolean that determines whether CloudFront overrides the <code>Strict-Transport-Security</code> HTTP
     *         response header received from the origin with the one specified in this response headers policy.
     */

    public Boolean isOverride() {
        return this.override;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront includes the <code>includeSubDomains</code> directive in the
     * <code>Strict-Transport-Security</code> HTTP response header.
     * </p>
     * 
     * @param includeSubdomains
     *        A Boolean that determines whether CloudFront includes the <code>includeSubDomains</code> directive in the
     *        <code>Strict-Transport-Security</code> HTTP response header.
     */

    public void setIncludeSubdomains(Boolean includeSubdomains) {
        this.includeSubdomains = includeSubdomains;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront includes the <code>includeSubDomains</code> directive in the
     * <code>Strict-Transport-Security</code> HTTP response header.
     * </p>
     * 
     * @return A Boolean that determines whether CloudFront includes the <code>includeSubDomains</code> directive in the
     *         <code>Strict-Transport-Security</code> HTTP response header.
     */

    public Boolean getIncludeSubdomains() {
        return this.includeSubdomains;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront includes the <code>includeSubDomains</code> directive in the
     * <code>Strict-Transport-Security</code> HTTP response header.
     * </p>
     * 
     * @param includeSubdomains
     *        A Boolean that determines whether CloudFront includes the <code>includeSubDomains</code> directive in the
     *        <code>Strict-Transport-Security</code> HTTP response header.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyStrictTransportSecurity withIncludeSubdomains(Boolean includeSubdomains) {
        setIncludeSubdomains(includeSubdomains);
        return this;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront includes the <code>includeSubDomains</code> directive in the
     * <code>Strict-Transport-Security</code> HTTP response header.
     * </p>
     * 
     * @return A Boolean that determines whether CloudFront includes the <code>includeSubDomains</code> directive in the
     *         <code>Strict-Transport-Security</code> HTTP response header.
     */

    public Boolean isIncludeSubdomains() {
        return this.includeSubdomains;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront includes the <code>preload</code> directive in the
     * <code>Strict-Transport-Security</code> HTTP response header.
     * </p>
     * 
     * @param preload
     *        A Boolean that determines whether CloudFront includes the <code>preload</code> directive in the
     *        <code>Strict-Transport-Security</code> HTTP response header.
     */

    public void setPreload(Boolean preload) {
        this.preload = preload;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront includes the <code>preload</code> directive in the
     * <code>Strict-Transport-Security</code> HTTP response header.
     * </p>
     * 
     * @return A Boolean that determines whether CloudFront includes the <code>preload</code> directive in the
     *         <code>Strict-Transport-Security</code> HTTP response header.
     */

    public Boolean getPreload() {
        return this.preload;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront includes the <code>preload</code> directive in the
     * <code>Strict-Transport-Security</code> HTTP response header.
     * </p>
     * 
     * @param preload
     *        A Boolean that determines whether CloudFront includes the <code>preload</code> directive in the
     *        <code>Strict-Transport-Security</code> HTTP response header.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyStrictTransportSecurity withPreload(Boolean preload) {
        setPreload(preload);
        return this;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront includes the <code>preload</code> directive in the
     * <code>Strict-Transport-Security</code> HTTP response header.
     * </p>
     * 
     * @return A Boolean that determines whether CloudFront includes the <code>preload</code> directive in the
     *         <code>Strict-Transport-Security</code> HTTP response header.
     */

    public Boolean isPreload() {
        return this.preload;
    }

    /**
     * <p>
     * A number that CloudFront uses as the value for the <code>max-age</code> directive in the
     * <code>Strict-Transport-Security</code> HTTP response header.
     * </p>
     * 
     * @param accessControlMaxAgeSec
     *        A number that CloudFront uses as the value for the <code>max-age</code> directive in the
     *        <code>Strict-Transport-Security</code> HTTP response header.
     */

    public void setAccessControlMaxAgeSec(Integer accessControlMaxAgeSec) {
        this.accessControlMaxAgeSec = accessControlMaxAgeSec;
    }

    /**
     * <p>
     * A number that CloudFront uses as the value for the <code>max-age</code> directive in the
     * <code>Strict-Transport-Security</code> HTTP response header.
     * </p>
     * 
     * @return A number that CloudFront uses as the value for the <code>max-age</code> directive in the
     *         <code>Strict-Transport-Security</code> HTTP response header.
     */

    public Integer getAccessControlMaxAgeSec() {
        return this.accessControlMaxAgeSec;
    }

    /**
     * <p>
     * A number that CloudFront uses as the value for the <code>max-age</code> directive in the
     * <code>Strict-Transport-Security</code> HTTP response header.
     * </p>
     * 
     * @param accessControlMaxAgeSec
     *        A number that CloudFront uses as the value for the <code>max-age</code> directive in the
     *        <code>Strict-Transport-Security</code> HTTP response header.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyStrictTransportSecurity withAccessControlMaxAgeSec(Integer accessControlMaxAgeSec) {
        setAccessControlMaxAgeSec(accessControlMaxAgeSec);
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
        if (getOverride() != null)
            sb.append("Override: ").append(getOverride()).append(",");
        if (getIncludeSubdomains() != null)
            sb.append("IncludeSubdomains: ").append(getIncludeSubdomains()).append(",");
        if (getPreload() != null)
            sb.append("Preload: ").append(getPreload()).append(",");
        if (getAccessControlMaxAgeSec() != null)
            sb.append("AccessControlMaxAgeSec: ").append(getAccessControlMaxAgeSec());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResponseHeadersPolicyStrictTransportSecurity == false)
            return false;
        ResponseHeadersPolicyStrictTransportSecurity other = (ResponseHeadersPolicyStrictTransportSecurity) obj;
        if (other.getOverride() == null ^ this.getOverride() == null)
            return false;
        if (other.getOverride() != null && other.getOverride().equals(this.getOverride()) == false)
            return false;
        if (other.getIncludeSubdomains() == null ^ this.getIncludeSubdomains() == null)
            return false;
        if (other.getIncludeSubdomains() != null && other.getIncludeSubdomains().equals(this.getIncludeSubdomains()) == false)
            return false;
        if (other.getPreload() == null ^ this.getPreload() == null)
            return false;
        if (other.getPreload() != null && other.getPreload().equals(this.getPreload()) == false)
            return false;
        if (other.getAccessControlMaxAgeSec() == null ^ this.getAccessControlMaxAgeSec() == null)
            return false;
        if (other.getAccessControlMaxAgeSec() != null && other.getAccessControlMaxAgeSec().equals(this.getAccessControlMaxAgeSec()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOverride() == null) ? 0 : getOverride().hashCode());
        hashCode = prime * hashCode + ((getIncludeSubdomains() == null) ? 0 : getIncludeSubdomains().hashCode());
        hashCode = prime * hashCode + ((getPreload() == null) ? 0 : getPreload().hashCode());
        hashCode = prime * hashCode + ((getAccessControlMaxAgeSec() == null) ? 0 : getAccessControlMaxAgeSec().hashCode());
        return hashCode;
    }

    @Override
    public ResponseHeadersPolicyStrictTransportSecurity clone() {
        try {
            return (ResponseHeadersPolicyStrictTransportSecurity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
