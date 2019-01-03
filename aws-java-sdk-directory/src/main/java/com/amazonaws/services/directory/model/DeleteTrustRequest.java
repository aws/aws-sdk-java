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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes the local side of an existing trust relationship between the AWS Managed Microsoft AD directory and the
 * external domain.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DeleteTrust" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteTrustRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Trust ID of the trust relationship to be deleted.
     * </p>
     */
    private String trustId;
    /**
     * <p>
     * Delete a conditional forwarder as part of a DeleteTrustRequest.
     * </p>
     */
    private Boolean deleteAssociatedConditionalForwarder;

    /**
     * <p>
     * The Trust ID of the trust relationship to be deleted.
     * </p>
     * 
     * @param trustId
     *        The Trust ID of the trust relationship to be deleted.
     */

    public void setTrustId(String trustId) {
        this.trustId = trustId;
    }

    /**
     * <p>
     * The Trust ID of the trust relationship to be deleted.
     * </p>
     * 
     * @return The Trust ID of the trust relationship to be deleted.
     */

    public String getTrustId() {
        return this.trustId;
    }

    /**
     * <p>
     * The Trust ID of the trust relationship to be deleted.
     * </p>
     * 
     * @param trustId
     *        The Trust ID of the trust relationship to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTrustRequest withTrustId(String trustId) {
        setTrustId(trustId);
        return this;
    }

    /**
     * <p>
     * Delete a conditional forwarder as part of a DeleteTrustRequest.
     * </p>
     * 
     * @param deleteAssociatedConditionalForwarder
     *        Delete a conditional forwarder as part of a DeleteTrustRequest.
     */

    public void setDeleteAssociatedConditionalForwarder(Boolean deleteAssociatedConditionalForwarder) {
        this.deleteAssociatedConditionalForwarder = deleteAssociatedConditionalForwarder;
    }

    /**
     * <p>
     * Delete a conditional forwarder as part of a DeleteTrustRequest.
     * </p>
     * 
     * @return Delete a conditional forwarder as part of a DeleteTrustRequest.
     */

    public Boolean getDeleteAssociatedConditionalForwarder() {
        return this.deleteAssociatedConditionalForwarder;
    }

    /**
     * <p>
     * Delete a conditional forwarder as part of a DeleteTrustRequest.
     * </p>
     * 
     * @param deleteAssociatedConditionalForwarder
     *        Delete a conditional forwarder as part of a DeleteTrustRequest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTrustRequest withDeleteAssociatedConditionalForwarder(Boolean deleteAssociatedConditionalForwarder) {
        setDeleteAssociatedConditionalForwarder(deleteAssociatedConditionalForwarder);
        return this;
    }

    /**
     * <p>
     * Delete a conditional forwarder as part of a DeleteTrustRequest.
     * </p>
     * 
     * @return Delete a conditional forwarder as part of a DeleteTrustRequest.
     */

    public Boolean isDeleteAssociatedConditionalForwarder() {
        return this.deleteAssociatedConditionalForwarder;
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
        if (getTrustId() != null)
            sb.append("TrustId: ").append(getTrustId()).append(",");
        if (getDeleteAssociatedConditionalForwarder() != null)
            sb.append("DeleteAssociatedConditionalForwarder: ").append(getDeleteAssociatedConditionalForwarder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTrustRequest == false)
            return false;
        DeleteTrustRequest other = (DeleteTrustRequest) obj;
        if (other.getTrustId() == null ^ this.getTrustId() == null)
            return false;
        if (other.getTrustId() != null && other.getTrustId().equals(this.getTrustId()) == false)
            return false;
        if (other.getDeleteAssociatedConditionalForwarder() == null ^ this.getDeleteAssociatedConditionalForwarder() == null)
            return false;
        if (other.getDeleteAssociatedConditionalForwarder() != null
                && other.getDeleteAssociatedConditionalForwarder().equals(this.getDeleteAssociatedConditionalForwarder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrustId() == null) ? 0 : getTrustId().hashCode());
        hashCode = prime * hashCode + ((getDeleteAssociatedConditionalForwarder() == null) ? 0 : getDeleteAssociatedConditionalForwarder().hashCode());
        return hashCode;
    }

    @Override
    public DeleteTrustRequest clone() {
        return (DeleteTrustRequest) super.clone();
    }

}
