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
 * The source of the Amazon Redshift datashare asset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/RedshiftDataShareAssetSourceEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RedshiftDataShareAssetSourceEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the datashare asset.
     * </p>
     */
    private String dataShareArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the datashare asset.
     * </p>
     * 
     * @param dataShareArn
     *        The Amazon Resource Name (ARN) of the datashare asset.
     */

    public void setDataShareArn(String dataShareArn) {
        this.dataShareArn = dataShareArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the datashare asset.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the datashare asset.
     */

    public String getDataShareArn() {
        return this.dataShareArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the datashare asset.
     * </p>
     * 
     * @param dataShareArn
     *        The Amazon Resource Name (ARN) of the datashare asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftDataShareAssetSourceEntry withDataShareArn(String dataShareArn) {
        setDataShareArn(dataShareArn);
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
        if (getDataShareArn() != null)
            sb.append("DataShareArn: ").append(getDataShareArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RedshiftDataShareAssetSourceEntry == false)
            return false;
        RedshiftDataShareAssetSourceEntry other = (RedshiftDataShareAssetSourceEntry) obj;
        if (other.getDataShareArn() == null ^ this.getDataShareArn() == null)
            return false;
        if (other.getDataShareArn() != null && other.getDataShareArn().equals(this.getDataShareArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataShareArn() == null) ? 0 : getDataShareArn().hashCode());
        return hashCode;
    }

    @Override
    public RedshiftDataShareAssetSourceEntry clone() {
        try {
            return (RedshiftDataShareAssetSourceEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.RedshiftDataShareAssetSourceEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
