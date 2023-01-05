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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListAvailableManagedRuleGroupVersions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAvailableManagedRuleGroupVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are still
     * available for retrieval exceeds the limit, WAF returns a <code>NextMarker</code> value in the response. To
     * retrieve the next batch of objects, provide the marker from the prior call in your next request.
     * </p>
     */
    private String nextMarker;
    /**
     * <p>
     * The versions that are currently available for the specified managed rule group.
     * </p>
     */
    private java.util.List<ManagedRuleGroupVersion> versions;
    /**
     * <p>
     * The name of the version that's currently set as the default.
     * </p>
     */
    private String currentDefaultVersion;

    /**
     * <p>
     * When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are still
     * available for retrieval exceeds the limit, WAF returns a <code>NextMarker</code> value in the response. To
     * retrieve the next batch of objects, provide the marker from the prior call in your next request.
     * </p>
     * 
     * @param nextMarker
     *        When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are
     *        still available for retrieval exceeds the limit, WAF returns a <code>NextMarker</code> value in the
     *        response. To retrieve the next batch of objects, provide the marker from the prior call in your next
     *        request.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are still
     * available for retrieval exceeds the limit, WAF returns a <code>NextMarker</code> value in the response. To
     * retrieve the next batch of objects, provide the marker from the prior call in your next request.
     * </p>
     * 
     * @return When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are
     *         still available for retrieval exceeds the limit, WAF returns a <code>NextMarker</code> value in the
     *         response. To retrieve the next batch of objects, provide the marker from the prior call in your next
     *         request.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are still
     * available for retrieval exceeds the limit, WAF returns a <code>NextMarker</code> value in the response. To
     * retrieve the next batch of objects, provide the marker from the prior call in your next request.
     * </p>
     * 
     * @param nextMarker
     *        When you request a list of objects with a <code>Limit</code> setting, if the number of objects that are
     *        still available for retrieval exceeds the limit, WAF returns a <code>NextMarker</code> value in the
     *        response. To retrieve the next batch of objects, provide the marker from the prior call in your next
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAvailableManagedRuleGroupVersionsResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * <p>
     * The versions that are currently available for the specified managed rule group.
     * </p>
     * 
     * @return The versions that are currently available for the specified managed rule group.
     */

    public java.util.List<ManagedRuleGroupVersion> getVersions() {
        return versions;
    }

    /**
     * <p>
     * The versions that are currently available for the specified managed rule group.
     * </p>
     * 
     * @param versions
     *        The versions that are currently available for the specified managed rule group.
     */

    public void setVersions(java.util.Collection<ManagedRuleGroupVersion> versions) {
        if (versions == null) {
            this.versions = null;
            return;
        }

        this.versions = new java.util.ArrayList<ManagedRuleGroupVersion>(versions);
    }

    /**
     * <p>
     * The versions that are currently available for the specified managed rule group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVersions(java.util.Collection)} or {@link #withVersions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param versions
     *        The versions that are currently available for the specified managed rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAvailableManagedRuleGroupVersionsResult withVersions(ManagedRuleGroupVersion... versions) {
        if (this.versions == null) {
            setVersions(new java.util.ArrayList<ManagedRuleGroupVersion>(versions.length));
        }
        for (ManagedRuleGroupVersion ele : versions) {
            this.versions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The versions that are currently available for the specified managed rule group.
     * </p>
     * 
     * @param versions
     *        The versions that are currently available for the specified managed rule group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAvailableManagedRuleGroupVersionsResult withVersions(java.util.Collection<ManagedRuleGroupVersion> versions) {
        setVersions(versions);
        return this;
    }

    /**
     * <p>
     * The name of the version that's currently set as the default.
     * </p>
     * 
     * @param currentDefaultVersion
     *        The name of the version that's currently set as the default.
     */

    public void setCurrentDefaultVersion(String currentDefaultVersion) {
        this.currentDefaultVersion = currentDefaultVersion;
    }

    /**
     * <p>
     * The name of the version that's currently set as the default.
     * </p>
     * 
     * @return The name of the version that's currently set as the default.
     */

    public String getCurrentDefaultVersion() {
        return this.currentDefaultVersion;
    }

    /**
     * <p>
     * The name of the version that's currently set as the default.
     * </p>
     * 
     * @param currentDefaultVersion
     *        The name of the version that's currently set as the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAvailableManagedRuleGroupVersionsResult withCurrentDefaultVersion(String currentDefaultVersion) {
        setCurrentDefaultVersion(currentDefaultVersion);
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
        if (getNextMarker() != null)
            sb.append("NextMarker: ").append(getNextMarker()).append(",");
        if (getVersions() != null)
            sb.append("Versions: ").append(getVersions()).append(",");
        if (getCurrentDefaultVersion() != null)
            sb.append("CurrentDefaultVersion: ").append(getCurrentDefaultVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAvailableManagedRuleGroupVersionsResult == false)
            return false;
        ListAvailableManagedRuleGroupVersionsResult other = (ListAvailableManagedRuleGroupVersionsResult) obj;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getVersions() == null ^ this.getVersions() == null)
            return false;
        if (other.getVersions() != null && other.getVersions().equals(this.getVersions()) == false)
            return false;
        if (other.getCurrentDefaultVersion() == null ^ this.getCurrentDefaultVersion() == null)
            return false;
        if (other.getCurrentDefaultVersion() != null && other.getCurrentDefaultVersion().equals(this.getCurrentDefaultVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getVersions() == null) ? 0 : getVersions().hashCode());
        hashCode = prime * hashCode + ((getCurrentDefaultVersion() == null) ? 0 : getCurrentDefaultVersion().hashCode());
        return hashCode;
    }

    @Override
    public ListAvailableManagedRuleGroupVersionsResult clone() {
        try {
            return (ListAvailableManagedRuleGroupVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
