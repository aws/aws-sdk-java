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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/DeleteLens" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteLensRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String lensAlias;

    private String clientRequestToken;
    /**
     * <p>
     * The status of the lens to be deleted.
     * </p>
     */
    private String lensStatus;

    /**
     * @param lensAlias
     */

    public void setLensAlias(String lensAlias) {
        this.lensAlias = lensAlias;
    }

    /**
     * @return
     */

    public String getLensAlias() {
        return this.lensAlias;
    }

    /**
     * @param lensAlias
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteLensRequest withLensAlias(String lensAlias) {
        setLensAlias(lensAlias);
        return this;
    }

    /**
     * @param clientRequestToken
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * @return
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * @param clientRequestToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteLensRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The status of the lens to be deleted.
     * </p>
     * 
     * @param lensStatus
     *        The status of the lens to be deleted.
     * @see LensStatusType
     */

    public void setLensStatus(String lensStatus) {
        this.lensStatus = lensStatus;
    }

    /**
     * <p>
     * The status of the lens to be deleted.
     * </p>
     * 
     * @return The status of the lens to be deleted.
     * @see LensStatusType
     */

    public String getLensStatus() {
        return this.lensStatus;
    }

    /**
     * <p>
     * The status of the lens to be deleted.
     * </p>
     * 
     * @param lensStatus
     *        The status of the lens to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LensStatusType
     */

    public DeleteLensRequest withLensStatus(String lensStatus) {
        setLensStatus(lensStatus);
        return this;
    }

    /**
     * <p>
     * The status of the lens to be deleted.
     * </p>
     * 
     * @param lensStatus
     *        The status of the lens to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LensStatusType
     */

    public DeleteLensRequest withLensStatus(LensStatusType lensStatus) {
        this.lensStatus = lensStatus.toString();
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
        if (getLensAlias() != null)
            sb.append("LensAlias: ").append(getLensAlias()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getLensStatus() != null)
            sb.append("LensStatus: ").append(getLensStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteLensRequest == false)
            return false;
        DeleteLensRequest other = (DeleteLensRequest) obj;
        if (other.getLensAlias() == null ^ this.getLensAlias() == null)
            return false;
        if (other.getLensAlias() != null && other.getLensAlias().equals(this.getLensAlias()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getLensStatus() == null ^ this.getLensStatus() == null)
            return false;
        if (other.getLensStatus() != null && other.getLensStatus().equals(this.getLensStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLensAlias() == null) ? 0 : getLensAlias().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getLensStatus() == null) ? 0 : getLensStatus().hashCode());
        return hashCode;
    }

    @Override
    public DeleteLensRequest clone() {
        return (DeleteLensRequest) super.clone();
    }

}
