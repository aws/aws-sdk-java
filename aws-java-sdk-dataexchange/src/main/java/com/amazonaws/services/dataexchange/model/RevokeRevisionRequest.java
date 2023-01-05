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
package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/RevokeRevision" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RevokeRevisionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for a data set.
     * </p>
     */
    private String dataSetId;
    /**
     * <p>
     * The unique identifier for a revision.
     * </p>
     */
    private String revisionId;
    /**
     * <p>
     * A required comment to inform subscribers of the reason their access to the revision was revoked.
     * </p>
     */
    private String revocationComment;

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

    public RevokeRevisionRequest withDataSetId(String dataSetId) {
        setDataSetId(dataSetId);
        return this;
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

    public RevokeRevisionRequest withRevisionId(String revisionId) {
        setRevisionId(revisionId);
        return this;
    }

    /**
     * <p>
     * A required comment to inform subscribers of the reason their access to the revision was revoked.
     * </p>
     * 
     * @param revocationComment
     *        A required comment to inform subscribers of the reason their access to the revision was revoked.
     */

    public void setRevocationComment(String revocationComment) {
        this.revocationComment = revocationComment;
    }

    /**
     * <p>
     * A required comment to inform subscribers of the reason their access to the revision was revoked.
     * </p>
     * 
     * @return A required comment to inform subscribers of the reason their access to the revision was revoked.
     */

    public String getRevocationComment() {
        return this.revocationComment;
    }

    /**
     * <p>
     * A required comment to inform subscribers of the reason their access to the revision was revoked.
     * </p>
     * 
     * @param revocationComment
     *        A required comment to inform subscribers of the reason their access to the revision was revoked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeRevisionRequest withRevocationComment(String revocationComment) {
        setRevocationComment(revocationComment);
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
        if (getDataSetId() != null)
            sb.append("DataSetId: ").append(getDataSetId()).append(",");
        if (getRevisionId() != null)
            sb.append("RevisionId: ").append(getRevisionId()).append(",");
        if (getRevocationComment() != null)
            sb.append("RevocationComment: ").append(getRevocationComment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RevokeRevisionRequest == false)
            return false;
        RevokeRevisionRequest other = (RevokeRevisionRequest) obj;
        if (other.getDataSetId() == null ^ this.getDataSetId() == null)
            return false;
        if (other.getDataSetId() != null && other.getDataSetId().equals(this.getDataSetId()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        if (other.getRevocationComment() == null ^ this.getRevocationComment() == null)
            return false;
        if (other.getRevocationComment() != null && other.getRevocationComment().equals(this.getRevocationComment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSetId() == null) ? 0 : getDataSetId().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        hashCode = prime * hashCode + ((getRevocationComment() == null) ? 0 : getRevocationComment().hashCode());
        return hashCode;
    }

    @Override
    public RevokeRevisionRequest clone() {
        return (RevokeRevisionRequest) super.clone();
    }

}
