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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReadSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetReadSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The file to retrieve.
     * </p>
     */
    private String file;
    /**
     * <p>
     * The read set's ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The part number to retrieve.
     * </p>
     */
    private Integer partNumber;
    /**
     * <p>
     * The read set's sequence store ID.
     * </p>
     */
    private String sequenceStoreId;

    /**
     * <p>
     * The file to retrieve.
     * </p>
     * 
     * @param file
     *        The file to retrieve.
     * @see ReadSetFile
     */

    public void setFile(String file) {
        this.file = file;
    }

    /**
     * <p>
     * The file to retrieve.
     * </p>
     * 
     * @return The file to retrieve.
     * @see ReadSetFile
     */

    public String getFile() {
        return this.file;
    }

    /**
     * <p>
     * The file to retrieve.
     * </p>
     * 
     * @param file
     *        The file to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReadSetFile
     */

    public GetReadSetRequest withFile(String file) {
        setFile(file);
        return this;
    }

    /**
     * <p>
     * The file to retrieve.
     * </p>
     * 
     * @param file
     *        The file to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReadSetFile
     */

    public GetReadSetRequest withFile(ReadSetFile file) {
        this.file = file.toString();
        return this;
    }

    /**
     * <p>
     * The read set's ID.
     * </p>
     * 
     * @param id
     *        The read set's ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The read set's ID.
     * </p>
     * 
     * @return The read set's ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The read set's ID.
     * </p>
     * 
     * @param id
     *        The read set's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadSetRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The part number to retrieve.
     * </p>
     * 
     * @param partNumber
     *        The part number to retrieve.
     */

    public void setPartNumber(Integer partNumber) {
        this.partNumber = partNumber;
    }

    /**
     * <p>
     * The part number to retrieve.
     * </p>
     * 
     * @return The part number to retrieve.
     */

    public Integer getPartNumber() {
        return this.partNumber;
    }

    /**
     * <p>
     * The part number to retrieve.
     * </p>
     * 
     * @param partNumber
     *        The part number to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadSetRequest withPartNumber(Integer partNumber) {
        setPartNumber(partNumber);
        return this;
    }

    /**
     * <p>
     * The read set's sequence store ID.
     * </p>
     * 
     * @param sequenceStoreId
     *        The read set's sequence store ID.
     */

    public void setSequenceStoreId(String sequenceStoreId) {
        this.sequenceStoreId = sequenceStoreId;
    }

    /**
     * <p>
     * The read set's sequence store ID.
     * </p>
     * 
     * @return The read set's sequence store ID.
     */

    public String getSequenceStoreId() {
        return this.sequenceStoreId;
    }

    /**
     * <p>
     * The read set's sequence store ID.
     * </p>
     * 
     * @param sequenceStoreId
     *        The read set's sequence store ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadSetRequest withSequenceStoreId(String sequenceStoreId) {
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
        if (getFile() != null)
            sb.append("File: ").append(getFile()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getPartNumber() != null)
            sb.append("PartNumber: ").append(getPartNumber()).append(",");
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

        if (obj instanceof GetReadSetRequest == false)
            return false;
        GetReadSetRequest other = (GetReadSetRequest) obj;
        if (other.getFile() == null ^ this.getFile() == null)
            return false;
        if (other.getFile() != null && other.getFile().equals(this.getFile()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getPartNumber() == null ^ this.getPartNumber() == null)
            return false;
        if (other.getPartNumber() != null && other.getPartNumber().equals(this.getPartNumber()) == false)
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

        hashCode = prime * hashCode + ((getFile() == null) ? 0 : getFile().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getPartNumber() == null) ? 0 : getPartNumber().hashCode());
        hashCode = prime * hashCode + ((getSequenceStoreId() == null) ? 0 : getSequenceStoreId().hashCode());
        return hashCode;
    }

    @Override
    public GetReadSetRequest clone() {
        return (GetReadSetRequest) super.clone();
    }

}
