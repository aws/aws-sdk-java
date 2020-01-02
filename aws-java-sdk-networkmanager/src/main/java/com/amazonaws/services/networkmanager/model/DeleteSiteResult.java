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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DeleteSite" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSiteResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the site.
     * </p>
     */
    private Site site;

    /**
     * <p>
     * Information about the site.
     * </p>
     * 
     * @param site
     *        Information about the site.
     */

    public void setSite(Site site) {
        this.site = site;
    }

    /**
     * <p>
     * Information about the site.
     * </p>
     * 
     * @return Information about the site.
     */

    public Site getSite() {
        return this.site;
    }

    /**
     * <p>
     * Information about the site.
     * </p>
     * 
     * @param site
     *        Information about the site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSiteResult withSite(Site site) {
        setSite(site);
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
        if (getSite() != null)
            sb.append("Site: ").append(getSite());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSiteResult == false)
            return false;
        DeleteSiteResult other = (DeleteSiteResult) obj;
        if (other.getSite() == null ^ this.getSite() == null)
            return false;
        if (other.getSite() != null && other.getSite().equals(this.getSite()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSite() == null) ? 0 : getSite().hashCode());
        return hashCode;
    }

    @Override
    public DeleteSiteResult clone() {
        try {
            return (DeleteSiteResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
