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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ListSupportedInstanceTypes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSupportedInstanceTypesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon EMR release label determines the <a
     * href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-release-app-versions-6.x.html">versions of
     * open-source application packages</a> that Amazon EMR has installed on the cluster. Release labels are in the
     * format <code>emr-x.x.x</code>, where x.x.x is an Amazon EMR release number such as <code>emr-6.10.0</code>. For
     * more information about Amazon EMR releases and their included application versions and features, see the <i> <a
     * href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-release-components.html">Amazon EMR Release
     * Guide</a> </i>.
     * </p>
     */
    private String releaseLabel;
    /**
     * <p>
     * The pagination token that marks the next set of results to retrieve.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The Amazon EMR release label determines the <a
     * href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-release-app-versions-6.x.html">versions of
     * open-source application packages</a> that Amazon EMR has installed on the cluster. Release labels are in the
     * format <code>emr-x.x.x</code>, where x.x.x is an Amazon EMR release number such as <code>emr-6.10.0</code>. For
     * more information about Amazon EMR releases and their included application versions and features, see the <i> <a
     * href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-release-components.html">Amazon EMR Release
     * Guide</a> </i>.
     * </p>
     * 
     * @param releaseLabel
     *        The Amazon EMR release label determines the <a
     *        href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-release-app-versions-6.x.html">versions of
     *        open-source application packages</a> that Amazon EMR has installed on the cluster. Release labels are in
     *        the format <code>emr-x.x.x</code>, where x.x.x is an Amazon EMR release number such as
     *        <code>emr-6.10.0</code>. For more information about Amazon EMR releases and their included application
     *        versions and features, see the <i> <a
     *        href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-release-components.html">Amazon EMR Release
     *        Guide</a> </i>.
     */

    public void setReleaseLabel(String releaseLabel) {
        this.releaseLabel = releaseLabel;
    }

    /**
     * <p>
     * The Amazon EMR release label determines the <a
     * href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-release-app-versions-6.x.html">versions of
     * open-source application packages</a> that Amazon EMR has installed on the cluster. Release labels are in the
     * format <code>emr-x.x.x</code>, where x.x.x is an Amazon EMR release number such as <code>emr-6.10.0</code>. For
     * more information about Amazon EMR releases and their included application versions and features, see the <i> <a
     * href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-release-components.html">Amazon EMR Release
     * Guide</a> </i>.
     * </p>
     * 
     * @return The Amazon EMR release label determines the <a
     *         href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-release-app-versions-6.x.html">versions of
     *         open-source application packages</a> that Amazon EMR has installed on the cluster. Release labels are in
     *         the format <code>emr-x.x.x</code>, where x.x.x is an Amazon EMR release number such as
     *         <code>emr-6.10.0</code>. For more information about Amazon EMR releases and their included application
     *         versions and features, see the <i> <a
     *         href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-release-components.html">Amazon EMR Release
     *         Guide</a> </i>.
     */

    public String getReleaseLabel() {
        return this.releaseLabel;
    }

    /**
     * <p>
     * The Amazon EMR release label determines the <a
     * href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-release-app-versions-6.x.html">versions of
     * open-source application packages</a> that Amazon EMR has installed on the cluster. Release labels are in the
     * format <code>emr-x.x.x</code>, where x.x.x is an Amazon EMR release number such as <code>emr-6.10.0</code>. For
     * more information about Amazon EMR releases and their included application versions and features, see the <i> <a
     * href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-release-components.html">Amazon EMR Release
     * Guide</a> </i>.
     * </p>
     * 
     * @param releaseLabel
     *        The Amazon EMR release label determines the <a
     *        href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-release-app-versions-6.x.html">versions of
     *        open-source application packages</a> that Amazon EMR has installed on the cluster. Release labels are in
     *        the format <code>emr-x.x.x</code>, where x.x.x is an Amazon EMR release number such as
     *        <code>emr-6.10.0</code>. For more information about Amazon EMR releases and their included application
     *        versions and features, see the <i> <a
     *        href="https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-release-components.html">Amazon EMR Release
     *        Guide</a> </i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSupportedInstanceTypesRequest withReleaseLabel(String releaseLabel) {
        setReleaseLabel(releaseLabel);
        return this;
    }

    /**
     * <p>
     * The pagination token that marks the next set of results to retrieve.
     * </p>
     * 
     * @param marker
     *        The pagination token that marks the next set of results to retrieve.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The pagination token that marks the next set of results to retrieve.
     * </p>
     * 
     * @return The pagination token that marks the next set of results to retrieve.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The pagination token that marks the next set of results to retrieve.
     * </p>
     * 
     * @param marker
     *        The pagination token that marks the next set of results to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSupportedInstanceTypesRequest withMarker(String marker) {
        setMarker(marker);
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
        if (getReleaseLabel() != null)
            sb.append("ReleaseLabel: ").append(getReleaseLabel()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSupportedInstanceTypesRequest == false)
            return false;
        ListSupportedInstanceTypesRequest other = (ListSupportedInstanceTypesRequest) obj;
        if (other.getReleaseLabel() == null ^ this.getReleaseLabel() == null)
            return false;
        if (other.getReleaseLabel() != null && other.getReleaseLabel().equals(this.getReleaseLabel()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReleaseLabel() == null) ? 0 : getReleaseLabel().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListSupportedInstanceTypesRequest clone() {
        return (ListSupportedInstanceTypesRequest) super.clone();
    }

}
