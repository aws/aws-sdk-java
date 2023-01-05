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
package com.amazonaws.services.outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetSite" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSiteRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID or the Amazon Resource Name (ARN) of the site.
     * </p>
     */
    private String siteId;

    /**
     * <p>
     * The ID or the Amazon Resource Name (ARN) of the site.
     * </p>
     * 
     * @param siteId
     *        The ID or the Amazon Resource Name (ARN) of the site.
     */

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    /**
     * <p>
     * The ID or the Amazon Resource Name (ARN) of the site.
     * </p>
     * 
     * @return The ID or the Amazon Resource Name (ARN) of the site.
     */

    public String getSiteId() {
        return this.siteId;
    }

    /**
     * <p>
     * The ID or the Amazon Resource Name (ARN) of the site.
     * </p>
     * 
     * @param siteId
     *        The ID or the Amazon Resource Name (ARN) of the site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSiteRequest withSiteId(String siteId) {
        setSiteId(siteId);
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
        if (getSiteId() != null)
            sb.append("SiteId: ").append(getSiteId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSiteRequest == false)
            return false;
        GetSiteRequest other = (GetSiteRequest) obj;
        if (other.getSiteId() == null ^ this.getSiteId() == null)
            return false;
        if (other.getSiteId() != null && other.getSiteId().equals(this.getSiteId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSiteId() == null) ? 0 : getSiteId().hashCode());
        return hashCode;
    }

    @Override
    public GetSiteRequest clone() {
        return (GetSiteRequest) super.clone();
    }

}
