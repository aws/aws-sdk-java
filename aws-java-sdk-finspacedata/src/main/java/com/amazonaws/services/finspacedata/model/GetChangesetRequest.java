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
package com.amazonaws.services.finspacedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Request to describe a changeset.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetChangeset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetChangesetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the FinSpace Dataset where the Changeset is created.
     * </p>
     */
    private String datasetId;
    /**
     * <p>
     * The unique identifier of the Changeset for which to get data.
     * </p>
     */
    private String changesetId;

    /**
     * <p>
     * The unique identifier for the FinSpace Dataset where the Changeset is created.
     * </p>
     * 
     * @param datasetId
     *        The unique identifier for the FinSpace Dataset where the Changeset is created.
     */

    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    /**
     * <p>
     * The unique identifier for the FinSpace Dataset where the Changeset is created.
     * </p>
     * 
     * @return The unique identifier for the FinSpace Dataset where the Changeset is created.
     */

    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * <p>
     * The unique identifier for the FinSpace Dataset where the Changeset is created.
     * </p>
     * 
     * @param datasetId
     *        The unique identifier for the FinSpace Dataset where the Changeset is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetChangesetRequest withDatasetId(String datasetId) {
        setDatasetId(datasetId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the Changeset for which to get data.
     * </p>
     * 
     * @param changesetId
     *        The unique identifier of the Changeset for which to get data.
     */

    public void setChangesetId(String changesetId) {
        this.changesetId = changesetId;
    }

    /**
     * <p>
     * The unique identifier of the Changeset for which to get data.
     * </p>
     * 
     * @return The unique identifier of the Changeset for which to get data.
     */

    public String getChangesetId() {
        return this.changesetId;
    }

    /**
     * <p>
     * The unique identifier of the Changeset for which to get data.
     * </p>
     * 
     * @param changesetId
     *        The unique identifier of the Changeset for which to get data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetChangesetRequest withChangesetId(String changesetId) {
        setChangesetId(changesetId);
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
        if (getDatasetId() != null)
            sb.append("DatasetId: ").append(getDatasetId()).append(",");
        if (getChangesetId() != null)
            sb.append("ChangesetId: ").append(getChangesetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetChangesetRequest == false)
            return false;
        GetChangesetRequest other = (GetChangesetRequest) obj;
        if (other.getDatasetId() == null ^ this.getDatasetId() == null)
            return false;
        if (other.getDatasetId() != null && other.getDatasetId().equals(this.getDatasetId()) == false)
            return false;
        if (other.getChangesetId() == null ^ this.getChangesetId() == null)
            return false;
        if (other.getChangesetId() != null && other.getChangesetId().equals(this.getChangesetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetId() == null) ? 0 : getDatasetId().hashCode());
        hashCode = prime * hashCode + ((getChangesetId() == null) ? 0 : getChangesetId().hashCode());
        return hashCode;
    }

    @Override
    public GetChangesetRequest clone() {
        return (GetChangesetRequest) super.clone();
    }

}
