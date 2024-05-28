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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The parameters for S3.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/S3Parameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Parameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Location of the Amazon S3 manifest file. This is NULL if the manifest file was uploaded into Amazon QuickSight.
     * </p>
     */
    private ManifestFileLocation manifestFileLocation;
    /**
     * <p>
     * Use the <code>RoleArn</code> structure to override an account-wide role for a specific S3 data source. For
     * example, say an account administrator has turned off all S3 access with an account-wide role. The administrator
     * can then use <code>RoleArn</code> to bypass the account-wide role and allow S3 access for the single S3 data
     * source that is specified in the structure, even if the account-wide role forbidding S3 access is still active.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * Location of the Amazon S3 manifest file. This is NULL if the manifest file was uploaded into Amazon QuickSight.
     * </p>
     * 
     * @param manifestFileLocation
     *        Location of the Amazon S3 manifest file. This is NULL if the manifest file was uploaded into Amazon
     *        QuickSight.
     */

    public void setManifestFileLocation(ManifestFileLocation manifestFileLocation) {
        this.manifestFileLocation = manifestFileLocation;
    }

    /**
     * <p>
     * Location of the Amazon S3 manifest file. This is NULL if the manifest file was uploaded into Amazon QuickSight.
     * </p>
     * 
     * @return Location of the Amazon S3 manifest file. This is NULL if the manifest file was uploaded into Amazon
     *         QuickSight.
     */

    public ManifestFileLocation getManifestFileLocation() {
        return this.manifestFileLocation;
    }

    /**
     * <p>
     * Location of the Amazon S3 manifest file. This is NULL if the manifest file was uploaded into Amazon QuickSight.
     * </p>
     * 
     * @param manifestFileLocation
     *        Location of the Amazon S3 manifest file. This is NULL if the manifest file was uploaded into Amazon
     *        QuickSight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Parameters withManifestFileLocation(ManifestFileLocation manifestFileLocation) {
        setManifestFileLocation(manifestFileLocation);
        return this;
    }

    /**
     * <p>
     * Use the <code>RoleArn</code> structure to override an account-wide role for a specific S3 data source. For
     * example, say an account administrator has turned off all S3 access with an account-wide role. The administrator
     * can then use <code>RoleArn</code> to bypass the account-wide role and allow S3 access for the single S3 data
     * source that is specified in the structure, even if the account-wide role forbidding S3 access is still active.
     * </p>
     * 
     * @param roleArn
     *        Use the <code>RoleArn</code> structure to override an account-wide role for a specific S3 data source. For
     *        example, say an account administrator has turned off all S3 access with an account-wide role. The
     *        administrator can then use <code>RoleArn</code> to bypass the account-wide role and allow S3 access for
     *        the single S3 data source that is specified in the structure, even if the account-wide role forbidding S3
     *        access is still active.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * Use the <code>RoleArn</code> structure to override an account-wide role for a specific S3 data source. For
     * example, say an account administrator has turned off all S3 access with an account-wide role. The administrator
     * can then use <code>RoleArn</code> to bypass the account-wide role and allow S3 access for the single S3 data
     * source that is specified in the structure, even if the account-wide role forbidding S3 access is still active.
     * </p>
     * 
     * @return Use the <code>RoleArn</code> structure to override an account-wide role for a specific S3 data source.
     *         For example, say an account administrator has turned off all S3 access with an account-wide role. The
     *         administrator can then use <code>RoleArn</code> to bypass the account-wide role and allow S3 access for
     *         the single S3 data source that is specified in the structure, even if the account-wide role forbidding S3
     *         access is still active.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * Use the <code>RoleArn</code> structure to override an account-wide role for a specific S3 data source. For
     * example, say an account administrator has turned off all S3 access with an account-wide role. The administrator
     * can then use <code>RoleArn</code> to bypass the account-wide role and allow S3 access for the single S3 data
     * source that is specified in the structure, even if the account-wide role forbidding S3 access is still active.
     * </p>
     * 
     * @param roleArn
     *        Use the <code>RoleArn</code> structure to override an account-wide role for a specific S3 data source. For
     *        example, say an account administrator has turned off all S3 access with an account-wide role. The
     *        administrator can then use <code>RoleArn</code> to bypass the account-wide role and allow S3 access for
     *        the single S3 data source that is specified in the structure, even if the account-wide role forbidding S3
     *        access is still active.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Parameters withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getManifestFileLocation() != null)
            sb.append("ManifestFileLocation: ").append(getManifestFileLocation()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Parameters == false)
            return false;
        S3Parameters other = (S3Parameters) obj;
        if (other.getManifestFileLocation() == null ^ this.getManifestFileLocation() == null)
            return false;
        if (other.getManifestFileLocation() != null && other.getManifestFileLocation().equals(this.getManifestFileLocation()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getManifestFileLocation() == null) ? 0 : getManifestFileLocation().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public S3Parameters clone() {
        try {
            return (S3Parameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.S3ParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
