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
package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request body for UpdateRevision.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/UpdateRevision" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRevisionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An optional comment about the revision.
     * </p>
     */
    private String comment;
    /**
     * <p>
     * The unique identifier for a data set.
     * </p>
     */
    private String dataSetId;
    /**
     * <p>
     * Finalizing a revision tells AWS Data Exchange that your changes to the assets in the revision are complete. After
     * it's in this read-only state, you can publish the revision to your products.
     * </p>
     */
    private Boolean finalized;
    /**
     * <p>
     * The unique identifier for a revision.
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * An optional comment about the revision.
     * </p>
     * 
     * @param comment
     *        An optional comment about the revision.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * An optional comment about the revision.
     * </p>
     * 
     * @return An optional comment about the revision.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * An optional comment about the revision.
     * </p>
     * 
     * @param comment
     *        An optional comment about the revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRevisionRequest withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * The unique identifier for a data set.
     * </p>
     * 
     * @param dataSetId
     *        The unique identifier for a data set.
     */

    public void setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
    }

    /**
     * <p>
     * The unique identifier for a data set.
     * </p>
     * 
     * @return The unique identifier for a data set.
     */

    public String getDataSetId() {
        return this.dataSetId;
    }

    /**
     * <p>
     * The unique identifier for a data set.
     * </p>
     * 
     * @param dataSetId
     *        The unique identifier for a data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRevisionRequest withDataSetId(String dataSetId) {
        setDataSetId(dataSetId);
        return this;
    }

    /**
     * <p>
     * Finalizing a revision tells AWS Data Exchange that your changes to the assets in the revision are complete. After
     * it's in this read-only state, you can publish the revision to your products.
     * </p>
     * 
     * @param finalized
     *        Finalizing a revision tells AWS Data Exchange that your changes to the assets in the revision are
     *        complete. After it's in this read-only state, you can publish the revision to your products.
     */

    public void setFinalized(Boolean finalized) {
        this.finalized = finalized;
    }

    /**
     * <p>
     * Finalizing a revision tells AWS Data Exchange that your changes to the assets in the revision are complete. After
     * it's in this read-only state, you can publish the revision to your products.
     * </p>
     * 
     * @return Finalizing a revision tells AWS Data Exchange that your changes to the assets in the revision are
     *         complete. After it's in this read-only state, you can publish the revision to your products.
     */

    public Boolean getFinalized() {
        return this.finalized;
    }

    /**
     * <p>
     * Finalizing a revision tells AWS Data Exchange that your changes to the assets in the revision are complete. After
     * it's in this read-only state, you can publish the revision to your products.
     * </p>
     * 
     * @param finalized
     *        Finalizing a revision tells AWS Data Exchange that your changes to the assets in the revision are
     *        complete. After it's in this read-only state, you can publish the revision to your products.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRevisionRequest withFinalized(Boolean finalized) {
        setFinalized(finalized);
        return this;
    }

    /**
     * <p>
     * Finalizing a revision tells AWS Data Exchange that your changes to the assets in the revision are complete. After
     * it's in this read-only state, you can publish the revision to your products.
     * </p>
     * 
     * @return Finalizing a revision tells AWS Data Exchange that your changes to the assets in the revision are
     *         complete. After it's in this read-only state, you can publish the revision to your products.
     */

    public Boolean isFinalized() {
        return this.finalized;
    }

    /**
     * <p>
     * The unique identifier for a revision.
     * </p>
     * 
     * @param revisionId
     *        The unique identifier for a revision.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The unique identifier for a revision.
     * </p>
     * 
     * @return The unique identifier for a revision.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * The unique identifier for a revision.
     * </p>
     * 
     * @param revisionId
     *        The unique identifier for a revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRevisionRequest withRevisionId(String revisionId) {
        setRevisionId(revisionId);
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
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getDataSetId() != null)
            sb.append("DataSetId: ").append(getDataSetId()).append(",");
        if (getFinalized() != null)
            sb.append("Finalized: ").append(getFinalized()).append(",");
        if (getRevisionId() != null)
            sb.append("RevisionId: ").append(getRevisionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRevisionRequest == false)
            return false;
        UpdateRevisionRequest other = (UpdateRevisionRequest) obj;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getDataSetId() == null ^ this.getDataSetId() == null)
            return false;
        if (other.getDataSetId() != null && other.getDataSetId().equals(this.getDataSetId()) == false)
            return false;
        if (other.getFinalized() == null ^ this.getFinalized() == null)
            return false;
        if (other.getFinalized() != null && other.getFinalized().equals(this.getFinalized()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getDataSetId() == null) ? 0 : getDataSetId().hashCode());
        hashCode = prime * hashCode + ((getFinalized() == null) ? 0 : getFinalized().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRevisionRequest clone() {
        return (UpdateRevisionRequest) super.clone();
    }

}
