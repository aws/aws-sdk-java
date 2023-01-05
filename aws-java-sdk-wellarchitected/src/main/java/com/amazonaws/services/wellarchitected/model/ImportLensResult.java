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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ImportLens" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportLensResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN for the lens.
     * </p>
     */
    private String lensArn;
    /**
     * <p>
     * The status of the imported lens.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The ARN for the lens.
     * </p>
     * 
     * @param lensArn
     *        The ARN for the lens.
     */

    public void setLensArn(String lensArn) {
        this.lensArn = lensArn;
    }

    /**
     * <p>
     * The ARN for the lens.
     * </p>
     * 
     * @return The ARN for the lens.
     */

    public String getLensArn() {
        return this.lensArn;
    }

    /**
     * <p>
     * The ARN for the lens.
     * </p>
     * 
     * @param lensArn
     *        The ARN for the lens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportLensResult withLensArn(String lensArn) {
        setLensArn(lensArn);
        return this;
    }

    /**
     * <p>
     * The status of the imported lens.
     * </p>
     * 
     * @param status
     *        The status of the imported lens.
     * @see ImportLensStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the imported lens.
     * </p>
     * 
     * @return The status of the imported lens.
     * @see ImportLensStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the imported lens.
     * </p>
     * 
     * @param status
     *        The status of the imported lens.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportLensStatus
     */

    public ImportLensResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the imported lens.
     * </p>
     * 
     * @param status
     *        The status of the imported lens.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportLensStatus
     */

    public ImportLensResult withStatus(ImportLensStatus status) {
        this.status = status.toString();
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
        if (getLensArn() != null)
            sb.append("LensArn: ").append(getLensArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportLensResult == false)
            return false;
        ImportLensResult other = (ImportLensResult) obj;
        if (other.getLensArn() == null ^ this.getLensArn() == null)
            return false;
        if (other.getLensArn() != null && other.getLensArn().equals(this.getLensArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLensArn() == null) ? 0 : getLensArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ImportLensResult clone() {
        try {
            return (ImportLensResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
