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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateGrant" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGrantResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Grant ARN.
     * </p>
     */
    private String grantArn;
    /**
     * <p>
     * Grant status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Grant version.
     * </p>
     */
    private String version;

    /**
     * <p>
     * Grant ARN.
     * </p>
     * 
     * @param grantArn
     *        Grant ARN.
     */

    public void setGrantArn(String grantArn) {
        this.grantArn = grantArn;
    }

    /**
     * <p>
     * Grant ARN.
     * </p>
     * 
     * @return Grant ARN.
     */

    public String getGrantArn() {
        return this.grantArn;
    }

    /**
     * <p>
     * Grant ARN.
     * </p>
     * 
     * @param grantArn
     *        Grant ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGrantResult withGrantArn(String grantArn) {
        setGrantArn(grantArn);
        return this;
    }

    /**
     * <p>
     * Grant status.
     * </p>
     * 
     * @param status
     *        Grant status.
     * @see GrantStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Grant status.
     * </p>
     * 
     * @return Grant status.
     * @see GrantStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Grant status.
     * </p>
     * 
     * @param status
     *        Grant status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GrantStatus
     */

    public CreateGrantResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Grant status.
     * </p>
     * 
     * @param status
     *        Grant status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GrantStatus
     */

    public CreateGrantResult withStatus(GrantStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Grant version.
     * </p>
     * 
     * @param version
     *        Grant version.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * Grant version.
     * </p>
     * 
     * @return Grant version.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * Grant version.
     * </p>
     * 
     * @param version
     *        Grant version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGrantResult withVersion(String version) {
        setVersion(version);
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
        if (getGrantArn() != null)
            sb.append("GrantArn: ").append(getGrantArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGrantResult == false)
            return false;
        CreateGrantResult other = (CreateGrantResult) obj;
        if (other.getGrantArn() == null ^ this.getGrantArn() == null)
            return false;
        if (other.getGrantArn() != null && other.getGrantArn().equals(this.getGrantArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGrantArn() == null) ? 0 : getGrantArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public CreateGrantResult clone() {
        try {
            return (CreateGrantResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
