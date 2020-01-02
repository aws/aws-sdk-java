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
package com.amazonaws.services.iotthingsgraph.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DescribeNamespace" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNamespaceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the namespace.
     * </p>
     */
    private String namespaceArn;
    /**
     * <p>
     * The name of the namespace.
     * </p>
     */
    private String namespaceName;
    /**
     * <p>
     * The name of the public namespace that the latest namespace version is tracking.
     * </p>
     */
    private String trackingNamespaceName;
    /**
     * <p>
     * The version of the public namespace that the latest version is tracking.
     * </p>
     */
    private Long trackingNamespaceVersion;
    /**
     * <p>
     * The version of the user's namespace to describe.
     * </p>
     */
    private Long namespaceVersion;

    /**
     * <p>
     * The ARN of the namespace.
     * </p>
     * 
     * @param namespaceArn
     *        The ARN of the namespace.
     */

    public void setNamespaceArn(String namespaceArn) {
        this.namespaceArn = namespaceArn;
    }

    /**
     * <p>
     * The ARN of the namespace.
     * </p>
     * 
     * @return The ARN of the namespace.
     */

    public String getNamespaceArn() {
        return this.namespaceArn;
    }

    /**
     * <p>
     * The ARN of the namespace.
     * </p>
     * 
     * @param namespaceArn
     *        The ARN of the namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNamespaceResult withNamespaceArn(String namespaceArn) {
        setNamespaceArn(namespaceArn);
        return this;
    }

    /**
     * <p>
     * The name of the namespace.
     * </p>
     * 
     * @param namespaceName
     *        The name of the namespace.
     */

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    /**
     * <p>
     * The name of the namespace.
     * </p>
     * 
     * @return The name of the namespace.
     */

    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * <p>
     * The name of the namespace.
     * </p>
     * 
     * @param namespaceName
     *        The name of the namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNamespaceResult withNamespaceName(String namespaceName) {
        setNamespaceName(namespaceName);
        return this;
    }

    /**
     * <p>
     * The name of the public namespace that the latest namespace version is tracking.
     * </p>
     * 
     * @param trackingNamespaceName
     *        The name of the public namespace that the latest namespace version is tracking.
     */

    public void setTrackingNamespaceName(String trackingNamespaceName) {
        this.trackingNamespaceName = trackingNamespaceName;
    }

    /**
     * <p>
     * The name of the public namespace that the latest namespace version is tracking.
     * </p>
     * 
     * @return The name of the public namespace that the latest namespace version is tracking.
     */

    public String getTrackingNamespaceName() {
        return this.trackingNamespaceName;
    }

    /**
     * <p>
     * The name of the public namespace that the latest namespace version is tracking.
     * </p>
     * 
     * @param trackingNamespaceName
     *        The name of the public namespace that the latest namespace version is tracking.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNamespaceResult withTrackingNamespaceName(String trackingNamespaceName) {
        setTrackingNamespaceName(trackingNamespaceName);
        return this;
    }

    /**
     * <p>
     * The version of the public namespace that the latest version is tracking.
     * </p>
     * 
     * @param trackingNamespaceVersion
     *        The version of the public namespace that the latest version is tracking.
     */

    public void setTrackingNamespaceVersion(Long trackingNamespaceVersion) {
        this.trackingNamespaceVersion = trackingNamespaceVersion;
    }

    /**
     * <p>
     * The version of the public namespace that the latest version is tracking.
     * </p>
     * 
     * @return The version of the public namespace that the latest version is tracking.
     */

    public Long getTrackingNamespaceVersion() {
        return this.trackingNamespaceVersion;
    }

    /**
     * <p>
     * The version of the public namespace that the latest version is tracking.
     * </p>
     * 
     * @param trackingNamespaceVersion
     *        The version of the public namespace that the latest version is tracking.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNamespaceResult withTrackingNamespaceVersion(Long trackingNamespaceVersion) {
        setTrackingNamespaceVersion(trackingNamespaceVersion);
        return this;
    }

    /**
     * <p>
     * The version of the user's namespace to describe.
     * </p>
     * 
     * @param namespaceVersion
     *        The version of the user's namespace to describe.
     */

    public void setNamespaceVersion(Long namespaceVersion) {
        this.namespaceVersion = namespaceVersion;
    }

    /**
     * <p>
     * The version of the user's namespace to describe.
     * </p>
     * 
     * @return The version of the user's namespace to describe.
     */

    public Long getNamespaceVersion() {
        return this.namespaceVersion;
    }

    /**
     * <p>
     * The version of the user's namespace to describe.
     * </p>
     * 
     * @param namespaceVersion
     *        The version of the user's namespace to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNamespaceResult withNamespaceVersion(Long namespaceVersion) {
        setNamespaceVersion(namespaceVersion);
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
        if (getNamespaceArn() != null)
            sb.append("NamespaceArn: ").append(getNamespaceArn()).append(",");
        if (getNamespaceName() != null)
            sb.append("NamespaceName: ").append(getNamespaceName()).append(",");
        if (getTrackingNamespaceName() != null)
            sb.append("TrackingNamespaceName: ").append(getTrackingNamespaceName()).append(",");
        if (getTrackingNamespaceVersion() != null)
            sb.append("TrackingNamespaceVersion: ").append(getTrackingNamespaceVersion()).append(",");
        if (getNamespaceVersion() != null)
            sb.append("NamespaceVersion: ").append(getNamespaceVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeNamespaceResult == false)
            return false;
        DescribeNamespaceResult other = (DescribeNamespaceResult) obj;
        if (other.getNamespaceArn() == null ^ this.getNamespaceArn() == null)
            return false;
        if (other.getNamespaceArn() != null && other.getNamespaceArn().equals(this.getNamespaceArn()) == false)
            return false;
        if (other.getNamespaceName() == null ^ this.getNamespaceName() == null)
            return false;
        if (other.getNamespaceName() != null && other.getNamespaceName().equals(this.getNamespaceName()) == false)
            return false;
        if (other.getTrackingNamespaceName() == null ^ this.getTrackingNamespaceName() == null)
            return false;
        if (other.getTrackingNamespaceName() != null && other.getTrackingNamespaceName().equals(this.getTrackingNamespaceName()) == false)
            return false;
        if (other.getTrackingNamespaceVersion() == null ^ this.getTrackingNamespaceVersion() == null)
            return false;
        if (other.getTrackingNamespaceVersion() != null && other.getTrackingNamespaceVersion().equals(this.getTrackingNamespaceVersion()) == false)
            return false;
        if (other.getNamespaceVersion() == null ^ this.getNamespaceVersion() == null)
            return false;
        if (other.getNamespaceVersion() != null && other.getNamespaceVersion().equals(this.getNamespaceVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamespaceArn() == null) ? 0 : getNamespaceArn().hashCode());
        hashCode = prime * hashCode + ((getNamespaceName() == null) ? 0 : getNamespaceName().hashCode());
        hashCode = prime * hashCode + ((getTrackingNamespaceName() == null) ? 0 : getTrackingNamespaceName().hashCode());
        hashCode = prime * hashCode + ((getTrackingNamespaceVersion() == null) ? 0 : getTrackingNamespaceVersion().hashCode());
        hashCode = prime * hashCode + ((getNamespaceVersion() == null) ? 0 : getNamespaceVersion().hashCode());
        return hashCode;
    }

    @Override
    public DescribeNamespaceResult clone() {
        try {
            return (DescribeNamespaceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
