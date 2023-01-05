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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * What occurs after a certain event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/Action" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Action implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details for the export revision to Amazon S3 action.
     * </p>
     */
    private AutoExportRevisionToS3RequestDetails exportRevisionToS3;

    /**
     * <p>
     * Details for the export revision to Amazon S3 action.
     * </p>
     * 
     * @param exportRevisionToS3
     *        Details for the export revision to Amazon S3 action.
     */

    public void setExportRevisionToS3(AutoExportRevisionToS3RequestDetails exportRevisionToS3) {
        this.exportRevisionToS3 = exportRevisionToS3;
    }

    /**
     * <p>
     * Details for the export revision to Amazon S3 action.
     * </p>
     * 
     * @return Details for the export revision to Amazon S3 action.
     */

    public AutoExportRevisionToS3RequestDetails getExportRevisionToS3() {
        return this.exportRevisionToS3;
    }

    /**
     * <p>
     * Details for the export revision to Amazon S3 action.
     * </p>
     * 
     * @param exportRevisionToS3
     *        Details for the export revision to Amazon S3 action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withExportRevisionToS3(AutoExportRevisionToS3RequestDetails exportRevisionToS3) {
        setExportRevisionToS3(exportRevisionToS3);
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
        if (getExportRevisionToS3() != null)
            sb.append("ExportRevisionToS3: ").append(getExportRevisionToS3());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Action == false)
            return false;
        Action other = (Action) obj;
        if (other.getExportRevisionToS3() == null ^ this.getExportRevisionToS3() == null)
            return false;
        if (other.getExportRevisionToS3() != null && other.getExportRevisionToS3().equals(this.getExportRevisionToS3()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExportRevisionToS3() == null) ? 0 : getExportRevisionToS3().hashCode());
        return hashCode;
    }

    @Override
    public Action clone() {
        try {
            return (Action) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.ActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
