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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the details of a governed table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/TableObject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableObject implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 location of the object.
     * </p>
     */
    private String uri;
    /**
     * <p>
     * The Amazon S3 ETag of the object. Returned by <code>GetTableObjects</code> for validation and used to identify
     * changes to the underlying data.
     * </p>
     */
    private String eTag;
    /**
     * <p>
     * The size of the Amazon S3 object in bytes.
     * </p>
     */
    private Long size;

    /**
     * <p>
     * The Amazon S3 location of the object.
     * </p>
     * 
     * @param uri
     *        The Amazon S3 location of the object.
     */

    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * <p>
     * The Amazon S3 location of the object.
     * </p>
     * 
     * @return The Amazon S3 location of the object.
     */

    public String getUri() {
        return this.uri;
    }

    /**
     * <p>
     * The Amazon S3 location of the object.
     * </p>
     * 
     * @param uri
     *        The Amazon S3 location of the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableObject withUri(String uri) {
        setUri(uri);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 ETag of the object. Returned by <code>GetTableObjects</code> for validation and used to identify
     * changes to the underlying data.
     * </p>
     * 
     * @param eTag
     *        The Amazon S3 ETag of the object. Returned by <code>GetTableObjects</code> for validation and used to
     *        identify changes to the underlying data.
     */

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The Amazon S3 ETag of the object. Returned by <code>GetTableObjects</code> for validation and used to identify
     * changes to the underlying data.
     * </p>
     * 
     * @return The Amazon S3 ETag of the object. Returned by <code>GetTableObjects</code> for validation and used to
     *         identify changes to the underlying data.
     */

    public String getETag() {
        return this.eTag;
    }

    /**
     * <p>
     * The Amazon S3 ETag of the object. Returned by <code>GetTableObjects</code> for validation and used to identify
     * changes to the underlying data.
     * </p>
     * 
     * @param eTag
     *        The Amazon S3 ETag of the object. Returned by <code>GetTableObjects</code> for validation and used to
     *        identify changes to the underlying data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableObject withETag(String eTag) {
        setETag(eTag);
        return this;
    }

    /**
     * <p>
     * The size of the Amazon S3 object in bytes.
     * </p>
     * 
     * @param size
     *        The size of the Amazon S3 object in bytes.
     */

    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * <p>
     * The size of the Amazon S3 object in bytes.
     * </p>
     * 
     * @return The size of the Amazon S3 object in bytes.
     */

    public Long getSize() {
        return this.size;
    }

    /**
     * <p>
     * The size of the Amazon S3 object in bytes.
     * </p>
     * 
     * @param size
     *        The size of the Amazon S3 object in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableObject withSize(Long size) {
        setSize(size);
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
        if (getUri() != null)
            sb.append("Uri: ").append(getUri()).append(",");
        if (getETag() != null)
            sb.append("ETag: ").append(getETag()).append(",");
        if (getSize() != null)
            sb.append("Size: ").append(getSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableObject == false)
            return false;
        TableObject other = (TableObject) obj;
        if (other.getUri() == null ^ this.getUri() == null)
            return false;
        if (other.getUri() != null && other.getUri().equals(this.getUri()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUri() == null) ? 0 : getUri().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        return hashCode;
    }

    @Override
    public TableObject clone() {
        try {
            return (TableObject) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lakeformation.model.transform.TableObjectMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
