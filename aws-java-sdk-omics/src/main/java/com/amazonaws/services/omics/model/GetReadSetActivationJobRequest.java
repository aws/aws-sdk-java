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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReadSetActivationJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetReadSetActivationJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The job's ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The job's sequence store ID.
     * </p>
     */
    private String sequenceStoreId;

    /**
     * <p>
     * The job's ID.
     * </p>
     * 
     * @param id
     *        The job's ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The job's ID.
     * </p>
     * 
     * @return The job's ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The job's ID.
     * </p>
     * 
     * @param id
     *        The job's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadSetActivationJobRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The job's sequence store ID.
     * </p>
     * 
     * @param sequenceStoreId
     *        The job's sequence store ID.
     */

    public void setSequenceStoreId(String sequenceStoreId) {
        this.sequenceStoreId = sequenceStoreId;
    }

    /**
     * <p>
     * The job's sequence store ID.
     * </p>
     * 
     * @return The job's sequence store ID.
     */

    public String getSequenceStoreId() {
        return this.sequenceStoreId;
    }

    /**
     * <p>
     * The job's sequence store ID.
     * </p>
     * 
     * @param sequenceStoreId
     *        The job's sequence store ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadSetActivationJobRequest withSequenceStoreId(String sequenceStoreId) {
        setSequenceStoreId(sequenceStoreId);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getSequenceStoreId() != null)
            sb.append("SequenceStoreId: ").append(getSequenceStoreId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetReadSetActivationJobRequest == false)
            return false;
        GetReadSetActivationJobRequest other = (GetReadSetActivationJobRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getSequenceStoreId() == null ^ this.getSequenceStoreId() == null)
            return false;
        if (other.getSequenceStoreId() != null && other.getSequenceStoreId().equals(this.getSequenceStoreId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getSequenceStoreId() == null) ? 0 : getSequenceStoreId().hashCode());
        return hashCode;
    }

    @Override
    public GetReadSetActivationJobRequest clone() {
        return (GetReadSetActivationJobRequest) super.clone();
    }

}
