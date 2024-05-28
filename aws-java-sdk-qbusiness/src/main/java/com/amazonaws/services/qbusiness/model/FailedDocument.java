/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of documents that could not be removed from an Amazon Q Business index. Each entry contains an error message
 * that indicates why the document couldn't be removed from the index.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/FailedDocument" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailedDocument implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the document that couldn't be removed from the Amazon Q Business index.
     * </p>
     */
    private String id;
    /**
     * <p>
     * An explanation for why the document couldn't be removed from the index.
     * </p>
     */
    private ErrorDetail error;
    /**
     * <p>
     * The identifier of the Amazon Q Business data source connector that contains the failed document.
     * </p>
     */
    private String dataSourceId;

    /**
     * <p>
     * The identifier of the document that couldn't be removed from the Amazon Q Business index.
     * </p>
     * 
     * @param id
     *        The identifier of the document that couldn't be removed from the Amazon Q Business index.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the document that couldn't be removed from the Amazon Q Business index.
     * </p>
     * 
     * @return The identifier of the document that couldn't be removed from the Amazon Q Business index.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the document that couldn't be removed from the Amazon Q Business index.
     * </p>
     * 
     * @param id
     *        The identifier of the document that couldn't be removed from the Amazon Q Business index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedDocument withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * An explanation for why the document couldn't be removed from the index.
     * </p>
     * 
     * @param error
     *        An explanation for why the document couldn't be removed from the index.
     */

    public void setError(ErrorDetail error) {
        this.error = error;
    }

    /**
     * <p>
     * An explanation for why the document couldn't be removed from the index.
     * </p>
     * 
     * @return An explanation for why the document couldn't be removed from the index.
     */

    public ErrorDetail getError() {
        return this.error;
    }

    /**
     * <p>
     * An explanation for why the document couldn't be removed from the index.
     * </p>
     * 
     * @param error
     *        An explanation for why the document couldn't be removed from the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedDocument withError(ErrorDetail error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business data source connector that contains the failed document.
     * </p>
     * 
     * @param dataSourceId
     *        The identifier of the Amazon Q Business data source connector that contains the failed document.
     */

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business data source connector that contains the failed document.
     * </p>
     * 
     * @return The identifier of the Amazon Q Business data source connector that contains the failed document.
     */

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business data source connector that contains the failed document.
     * </p>
     * 
     * @param dataSourceId
     *        The identifier of the Amazon Q Business data source connector that contains the failed document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedDocument withDataSourceId(String dataSourceId) {
        setDataSourceId(dataSourceId);
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
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getDataSourceId() != null)
            sb.append("DataSourceId: ").append(getDataSourceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailedDocument == false)
            return false;
        FailedDocument other = (FailedDocument) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getDataSourceId() == null ^ this.getDataSourceId() == null)
            return false;
        if (other.getDataSourceId() != null && other.getDataSourceId().equals(this.getDataSourceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getDataSourceId() == null) ? 0 : getDataSourceId().hashCode());
        return hashCode;
    }

    @Override
    public FailedDocument clone() {
        try {
            return (FailedDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.FailedDocumentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
