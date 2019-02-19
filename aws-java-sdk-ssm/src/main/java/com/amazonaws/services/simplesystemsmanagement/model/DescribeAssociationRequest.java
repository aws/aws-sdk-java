/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeAssociation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAssociationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Systems Manager document.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The instance ID.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The association ID for which you want information.
     * </p>
     */
    private String associationId;
    /**
     * <p>
     * Specify the association version to retrieve. To view the latest version, either specify <code>$LATEST</code> for
     * this parameter, or omit this parameter. To view a list of all associations for an instance, use
     * <a>ListAssociations</a>. To get a list of versions for a specific association, use
     * <a>ListAssociationVersions</a>.
     * </p>
     */
    private String associationVersion;

    /**
     * <p>
     * The name of the Systems Manager document.
     * </p>
     * 
     * @param name
     *        The name of the Systems Manager document.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Systems Manager document.
     * </p>
     * 
     * @return The name of the Systems Manager document.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Systems Manager document.
     * </p>
     * 
     * @param name
     *        The name of the Systems Manager document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssociationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @param instanceId
     *        The instance ID.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @return The instance ID.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @param instanceId
     *        The instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssociationRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The association ID for which you want information.
     * </p>
     * 
     * @param associationId
     *        The association ID for which you want information.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The association ID for which you want information.
     * </p>
     * 
     * @return The association ID for which you want information.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * The association ID for which you want information.
     * </p>
     * 
     * @param associationId
     *        The association ID for which you want information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssociationRequest withAssociationId(String associationId) {
        setAssociationId(associationId);
        return this;
    }

    /**
     * <p>
     * Specify the association version to retrieve. To view the latest version, either specify <code>$LATEST</code> for
     * this parameter, or omit this parameter. To view a list of all associations for an instance, use
     * <a>ListAssociations</a>. To get a list of versions for a specific association, use
     * <a>ListAssociationVersions</a>.
     * </p>
     * 
     * @param associationVersion
     *        Specify the association version to retrieve. To view the latest version, either specify
     *        <code>$LATEST</code> for this parameter, or omit this parameter. To view a list of all associations for an
     *        instance, use <a>ListAssociations</a>. To get a list of versions for a specific association, use
     *        <a>ListAssociationVersions</a>.
     */

    public void setAssociationVersion(String associationVersion) {
        this.associationVersion = associationVersion;
    }

    /**
     * <p>
     * Specify the association version to retrieve. To view the latest version, either specify <code>$LATEST</code> for
     * this parameter, or omit this parameter. To view a list of all associations for an instance, use
     * <a>ListAssociations</a>. To get a list of versions for a specific association, use
     * <a>ListAssociationVersions</a>.
     * </p>
     * 
     * @return Specify the association version to retrieve. To view the latest version, either specify
     *         <code>$LATEST</code> for this parameter, or omit this parameter. To view a list of all associations for
     *         an instance, use <a>ListAssociations</a>. To get a list of versions for a specific association, use
     *         <a>ListAssociationVersions</a>.
     */

    public String getAssociationVersion() {
        return this.associationVersion;
    }

    /**
     * <p>
     * Specify the association version to retrieve. To view the latest version, either specify <code>$LATEST</code> for
     * this parameter, or omit this parameter. To view a list of all associations for an instance, use
     * <a>ListAssociations</a>. To get a list of versions for a specific association, use
     * <a>ListAssociationVersions</a>.
     * </p>
     * 
     * @param associationVersion
     *        Specify the association version to retrieve. To view the latest version, either specify
     *        <code>$LATEST</code> for this parameter, or omit this parameter. To view a list of all associations for an
     *        instance, use <a>ListAssociations</a>. To get a list of versions for a specific association, use
     *        <a>ListAssociationVersions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssociationRequest withAssociationVersion(String associationVersion) {
        setAssociationVersion(associationVersion);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getAssociationId() != null)
            sb.append("AssociationId: ").append(getAssociationId()).append(",");
        if (getAssociationVersion() != null)
            sb.append("AssociationVersion: ").append(getAssociationVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAssociationRequest == false)
            return false;
        DescribeAssociationRequest other = (DescribeAssociationRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getAssociationVersion() == null ^ this.getAssociationVersion() == null)
            return false;
        if (other.getAssociationVersion() != null && other.getAssociationVersion().equals(this.getAssociationVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getAssociationVersion() == null) ? 0 : getAssociationVersion().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAssociationRequest clone() {
        return (DescribeAssociationRequest) super.clone();
    }

}
